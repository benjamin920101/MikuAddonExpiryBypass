package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * 绕过 meteor-miku 模组中的版本检查
 * 直接取消 MySettings 构造函数的执行
 */
@Mixin(targets = "com.github.mikumiku.addon.mixinface.MySettings", remap = false, priority = 2000)
@Pseudo
public class MySettingsBypassMixin {

    /**
     * 在构造函数最开始处取消执行，防止版本检查代码运行
     * 使用最高优先级确保最先执行
     */
    @Inject(method = "<init>", at = @At("HEAD"), cancellable = true, remap = false)
    private void onInitHead(CallbackInfo ci) {
        System.out.println("[ExpiryBypass] Cancelling MySettings constructor to bypass version check!");
        ci.cancel();
    }
}
