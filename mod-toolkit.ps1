# ============================================
#   Minecraft Fabric Mod 一鍵腳本
#   功能：建立專案 / 打包 JAR
# ============================================

$ErrorActionPreference = "Stop"

function Show-Menu {
    Clear-Host
    Write-Host "========================================" -ForegroundColor Cyan
    Write-Host "   Minecraft Fabric Mod 工具箱" -ForegroundColor Cyan
    Write-Host "========================================" -ForegroundColor Cyan
    Write-Host ""
    Write-Host "  [1] 建立新的 Mod 專案" -ForegroundColor White
    Write-Host "  [2] 打包目前專案成 JAR" -ForegroundColor White
    Write-Host "  [3] 清除 + 重新打包" -ForegroundColor White
    Write-Host "  [0] 離開" -ForegroundColor Gray
    Write-Host ""
}

function Setup-Project {
    Write-Host ""
    Write-Host "=== 建立新 Mod 專案 ===" -ForegroundColor Cyan
    Write-Host ""

    # 輸入基本資訊
    $modId      = Read-Host "Mod ID（小寫+底線，預設: expirybypass）"
    if (-not $modId) { $modId = "expirybypass" }

    $modName    = Read-Host "Mod 名稱（預設: ExpiryBypass）"
    if (-not $modName) { $modName = "ExpiryBypass" }

    $authorName = Read-Host "作者名稱（預設: YourName）"
    if (-not $authorName) { $authorName = "YourName" }

    $groupId    = Read-Host "Group ID（預設: com.example.$modId）"
    if (-not $groupId) { $groupId = "com.example.$modId" }

    $projectDir = ".\$modId"

    if (Test-Path $projectDir) {
        Write-Host "[警告] 資料夾 $projectDir 已存在！" -ForegroundColor Yellow
        $overwrite = Read-Host "是否覆蓋？(y/n)"
        if ($overwrite -ne "y") { return }
        Remove-Item $projectDir -Recurse -Force
    }

    Write-Host ""
    Write-Host "建立專案結構中..." -ForegroundColor Yellow

    $pkg = $groupId.Replace(".", "\")

    # 建立資料夾
    $dirs = @(
        "$projectDir\src\main\java\$pkg\mixin",
        "$projectDir\src\main\resources",
        "$projectDir\gradle\wrapper"
    )
    foreach ($d in $dirs) { New-Item -ItemType Directory -Path $d -Force | Out-Null }

    # ---- gradle.properties ----
    @"
org.gradle.jvmargs=-Xmx1G
org.gradle.parallel=true

minecraft_version=1.21.1
yarn_mappings=1.21.1+build.3
loader_version=0.16.5

mod_version=1.0.0
maven_group=$groupId
archives_base_name=$modId
"@ | Set-Content "$projectDir\gradle.properties" -Encoding UTF8

    # ---- settings.gradle ----
    @"
pluginManagement {
    repositories {
        maven {
            name = 'Fabric'
            url = 'https://maven.fabricmc.net/'
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
rootProject.name = '$modId'
"@ | Set-Content "$projectDir\settings.gradle" -Encoding UTF8

    # ---- build.gradle ----
    @"
plugins {
    id 'fabric-loom' version '1.7-SNAPSHOT'
    id 'maven-publish'
}

version = project.mod_version
group = project.maven_group
base { archivesName = project.archives_base_name }

repositories {}

dependencies {
    minecraft "com.mojang:minecraft:`${project.minecraft_version}"
    mappings "net.fabricmc:yarn:`${project.yarn_mappings}:v2"
    modImplementation "net.fabricmc:fabric-loader:`${project.loader_version}"
}

processResources {
    inputs.property "version", project.version
    filteringCharset "UTF-8"
    filesMatching("fabric.mod.json") { expand "version": project.version }
}

tasks.withType(JavaCompile).configureEach { it.options.release = 21 }

java {
    withSourcesJar()
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

jar {
    from("LICENSE") { rename { "`${it}_`${project.base.archivesName.get()}" } }
    manifest {
        attributes('MixinConfigs': '$modId.mixins.json')
    }
}
"@ | Set-Content "$projectDir\build.gradle" -Encoding UTF8

    # ---- gradle-wrapper.properties ----
    @"
distributionBase=GRADLE_USER_HOME
distributionPath=wrapper/dists
distributionUrl=https\://services.gradle.org/distributions/gradle-8.8-bin.zip
validateDistributionUrl=true
zipStoreBase=GRADLE_USER_HOME
zipStorePath=wrapper/dists
"@ | Set-Content "$projectDir\gradle\wrapper\gradle-wrapper.properties" -Encoding UTF8

    # ---- fabric.mod.json ----
    @"
{
  "schemaVersion": 1,
  "id": "$modId",
  "version": "`${version}",
  "name": "$modName",
  "description": "",
  "authors": [ "$authorName" ],
  "environment": "*",
  "entrypoints": {
    "main": [ "$groupId.${modName}Mod" ]
  },
  "mixins": [ "$modId.mixins.json" ],
  "depends": {
    "fabricloader": ">=0.15.0",
    "minecraft": "~1.21"
  }
}
"@ | Set-Content "$projectDir\src\main\resources\fabric.mod.json" -Encoding UTF8

    # ---- mixin config json ----
    @"
{
  "required": true,
  "minVersion": "0.8",
  "package": "$groupId.mixin",
  "compatibilityLevel": "JAVA_21",
  "mixins": [ "ExpiryBypassMixin" ],
  "injectors": { "defaultRequire": 1 }
}
"@ | Set-Content "$projectDir\src\main\resources\$modId.mixins.json" -Encoding UTF8

    # ---- Main class ----
    $javaDir = "$projectDir\src\main\java\$pkg"
    @"
package $groupId;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ${modName}Mod implements ModInitializer {
    public static final String MOD_ID = "$modId";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("$modName loaded.");
    }
}
"@ | Set-Content "$javaDir\${modName}Mod.java" -Encoding UTF8

    # ---- Mixin class ----
    @"
package $groupId.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import java.util.Date;

// TODO: 將 targets 換成你要攔截的目標 class
@Mixin(targets = "com.example.targetmod.TargetClass", remap = false)
public class ExpiryBypassMixin {

    private static final long EXPIRY_TIMESTAMP = 1773504000082L;

    @Redirect(
        method = "<init>",
        at = @At(value = "INVOKE", target = "Ljava/util/Date;after(Ljava/util/Date;)Z"),
        remap = false
    )
    private boolean redirectDateAfter(Date instance, Date other) {
        if (other.getTime() == EXPIRY_TIMESTAMP) return false;
        return instance.after(other);
    }
}
"@ | Set-Content "$javaDir\mixin\ExpiryBypassMixin.java" -Encoding UTF8

    # ---- 複製 gradlew（從網路下載）----
    Write-Host "下載 Gradle Wrapper..." -ForegroundColor Yellow
    try {
        Invoke-WebRequest -Uri "https://raw.githubusercontent.com/gradle/gradle/master/gradlew.bat" `
            -OutFile "$projectDir\gradlew.bat" -UseBasicParsing
    } catch {
        Write-Host "[警告] 無法下載 gradlew.bat，請手動從其他 Fabric 專案複製。" -ForegroundColor Yellow
    }

    Write-Host ""
    Write-Host "========================================" -ForegroundColor Green
    Write-Host "  專案建立完成！" -ForegroundColor Green
    Write-Host "  位置：$(Resolve-Path $projectDir)" -ForegroundColor White
    Write-Host "========================================" -ForegroundColor Green
    Write-Host ""
    Write-Host "下一步：" -ForegroundColor Yellow
    Write-Host "  1. 修改 mixin\ExpiryBypassMixin.java 的 targets" -ForegroundColor White
    Write-Host "  2. 執行此腳本選 [2] 打包" -ForegroundColor White
    Write-Host ""
}

function Build-Mod {
    param([switch]$Clean)

    Write-Host ""
    Write-Host "=== 打包 Mod ===" -ForegroundColor Cyan

    if (-not (Test-Path "gradlew.bat")) {
        Write-Host "[錯誤] 找不到 gradlew.bat！請在專案根目錄執行。" -ForegroundColor Red
        return
    }

    if ($Clean) {
        Write-Host "[1/3] 清除舊的打包..." -ForegroundColor Yellow
        & .\gradlew.bat clean | Out-Null
    }

    Write-Host "[2/3] 打包中..." -ForegroundColor Yellow
    & .\gradlew.bat build

    if ($LASTEXITCODE -ne 0) {
        Write-Host ""
        Write-Host "[錯誤] 打包失敗，請檢查上方錯誤。" -ForegroundColor Red
        return
    }

    $jars = Get-ChildItem -Path "build\libs\*.jar" | Where-Object {
        $_.Name -notmatch "-dev\.jar$" -and $_.Name -notmatch "-sources\.jar$"
    }

    Write-Host "[3/3] 完成！" -ForegroundColor Green
    Write-Host ""
    Write-Host "========================================" -ForegroundColor Green
    Write-Host "  輸出 JAR：" -ForegroundColor Green
    foreach ($jar in $jars) {
        Write-Host "  $($jar.FullName)" -ForegroundColor White
    }
    Write-Host "========================================" -ForegroundColor Green
    Write-Host ""

    $modsPath = "$env:APPDATA\.minecraft\mods"
    if (Test-Path $modsPath) {
        $answer = Read-Host "複製到 .minecraft\mods？(y/n)"
        if ($answer -eq "y") {
            foreach ($jar in $jars) {
                Copy-Item $jar.FullName -Destination $modsPath -Force
                Write-Host "已複製：$($jar.Name)" -ForegroundColor Green
            }
        }
    }
    Write-Host ""
}

# ============ 主程式 ============
while ($true) {
    Show-Menu
    $choice = Read-Host "請選擇"
    switch ($choice) {
        "1" { Setup-Project; pause }
        "2" { Build-Mod; pause }
        "3" { Build-Mod -Clean; pause }
        "0" { exit }
        default { Write-Host "無效選項" -ForegroundColor Red; Start-Sleep 1 }
    }
}
