package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * 绕过 meteor-miku 模组中的版本检查
 * 针对 com.github.mikumiku.addon.mixinface.MySettings 类的初始化检查
 */
@Mixin(targets = "com.github.mikumiku.addon.mixinface.MySettings", remap = false, priority = 1000)
@Pseudo
public class MySettingsBypassMixin {

    /**
     * 在构造函数 HEAD 处取消
     */
    @Inject(method = "<init>", at = @At("HEAD"), cancellable = true, remap = false)
    private void onInitHead(CallbackInfo ci) {
        System.out.println("[ExpiryBypass] Cancelling MySettings constructor!");
        ci.cancel();
    }
}
