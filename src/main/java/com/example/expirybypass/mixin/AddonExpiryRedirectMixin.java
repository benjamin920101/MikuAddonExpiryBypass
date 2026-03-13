package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import java.util.Date;

// 只 mixin 确定的类，避免接口类型不匹配
@Mixin(targets = {
    "com.github.mikumiku.addon.ok.MikuMikuAddon",
    "com.github.mikumiku.addon.MikuLauncher",
    "com.github.mikumiku.addon.ok.PreLaunchInitializer",
    "com.github.mikumiku.addon.iIiiIiiIii",
    "com.github.mikumiku.addon.IiIiiiiIii",
    "com.github.mikumiku.addon.mixinface.MySettings",
    "com.github.mikumiku.addon.mixinface.MoveEvent",
    "com.github.mikumiku.addon.mixinface.MagicMix",
    "com.github.mikumiku.addon.iiIIIIiiiI",
    "com.github.mikumiku.addon.IIIiiIIiii",
    "com.github.mikumiku.addon.IiIIiIIiiI",
    "com.github.mikumiku.addon.IiiIIiIIiI",
    "com.github.mikumiku.addon.iIIIiiiiiI",
    "com.github.mikumiku.addon.IIIiiiIIIi",
    "com.github.mikumiku.addon.iIIIIiIiii",
    "com.github.mikumiku.addon.IIiIIIIIii",
    "com.github.mikumiku.addon.IiIiiiIIIi",
    "com.github.mikumiku.addon.iiIiIiiiiI",
    "com.github.mikumiku.addon.iiiIIIiiiI",
    "com.github.mikumiku.addon.IIiiIIIiiI",
    "com.github.mikumiku.addon.iiIiiIIIiI",
    "com.github.mikumiku.addon.iIiIIIIiIi",
    "com.github.mikumiku.addon.IIIiIIiiiI",
    "com.github.mikumiku.addon.IiIiiiIiiI",
    "com.github.mikumiku.addon.IIIIiIiIii",
    "com.github.mikumiku.addon.iIiIiiIIIi"
}, remap = false, priority = -1000)
@Pseudo
public class AddonExpiryRedirectMixin {

    // 全局重定向 System.currentTimeMillis()，使所有時間比較視為未過期
    @Redirect(
        method = {"<init>", "<clinit>", "*"},
        at = @At(value = "INVOKE", target = "Ljava/lang/System;currentTimeMillis()J"),
        remap = false
    )
    private long redirectTime() {
        return 0L;
    }

    // 重定向 System.nanoTime() 以防止基于 nanoTime 的检查
    @Redirect(
        method = {"<init>", "<clinit>", "*"},
        at = @At(value = "INVOKE", target = "Ljava/lang/System;nanoTime()J"),
        remap = false
    )
    private long redirectNanoTime() {
        return 0L;
    }

    // 攔截 java.util.Date 的 after 方法調用（在構造內），強制回傳 false 以跳過 throw
    @Redirect(
        method = {"<init>", "*"},
        at = @At(value = "INVOKE", target = "Ljava/util/Date;after(Ljava/util/Date;)Z"),
        remap = false
    )
    private boolean redirectDateAfter(Date instance, Date when) {
        return false;
    }
    
    // 重定向 Date.before 方法
    @Redirect(
        method = {"<init>", "*"},
        at = @At(value = "INVOKE", target = "Ljava/util/Date;before(Ljava/util/Date;)Z"),
        remap = false
    )
    private boolean redirectDateBefore(Date instance, Date when) {
        return true;
    }
    
    // 重定向 Date.getTime 返回一个过去的时间
    @Redirect(
        method = {"<init>", "*"},
        at = @At(value = "INVOKE", target = "Ljava/util/Date;getTime()J"),
        remap = false
    )
    private long redirectDateGetTime(Date instance) {
        return 0L;
    }
}
