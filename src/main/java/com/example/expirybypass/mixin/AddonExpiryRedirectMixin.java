package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = {
    "com.github.mikumiku.addon.ok.MikuMikuAddon",
    "com.github.mikumiku.addon.MikuLauncher",
    "com.github.mikumiku.addon.ok.PreLaunchInitializer",
    "com.github.mikumiku.addon.iIiIIIiIIi",
    "com.github.mikumiku.addon.iIiiIiiIii",
    "com.github.mikumiku.addon.IiIiiiiIii",
    "com.github.mikumiku.addon.iiIIiiiIIi",
    "com.github.mikumiku.addon.IiIIIiIiiI",
    "com.github.mikumiku.addon.mixinface.MySettings",
    "com.github.mikumiku.addon.mixinface.MoveEvent",
    "com.github.mikumiku.addon.mixinface.MagicMix",
    "com.github.mikumiku.addon.iiIIIIiiiI",
    "com.github.mikumiku.addon.IiIIiIiIii",
    "com.github.mikumiku.addon.IIIiiIIiii",
    "com.github.mikumiku.addon.IiIIiIIiiI",
    "com.github.mikumiku.addon.IiiIIiIIiI",
    "com.github.mikumiku.addon.iIIiIIiIIi",
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

    // 若某些類直接在構造中 throw，嘗試取消構造函數以避免拋出
    @Inject(method = "<init>", at = @At("HEAD"), cancellable = true, remap = false)
    private void cancelInit(CallbackInfo ci) {
        ci.cancel();
    }
}
