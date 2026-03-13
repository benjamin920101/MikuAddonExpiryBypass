package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * 绕过 meteor-miku 模组中的版本检查
 * 重定向 Throwable 构造函数以防止抛出异常
 */
@Mixin(targets = "com.github.mikumiku.addon.mixinface.MySettings", remap = false, priority = 2000)
@Pseudo
public class MySettingsBypassMixin {

    /**
     * 重定向 Throwable 构造函数，返回 null 以防止抛出异常
     */
    @Redirect(
        method = "<init>*",
        at = @At(value = "NEW", target = "java/lang/Throwable"),
        remap = false
    )
    private Throwable redirectThrowable(String message) {
        System.out.println("[ExpiryBypass] Intercepted Throwable creation: " + message);
        return new Throwable("Bypassed");
    }
}
