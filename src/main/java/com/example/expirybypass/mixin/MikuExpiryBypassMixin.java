package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "com.github.mikumiku.addon.ok.MikuMikuAddon", remap = false)
@Pseudo
public class MikuExpiryBypassMixin {

    @Inject(method = "<init>", at = @At("HEAD"), remap = false)
    private void onCtorHead(CallbackInfo ci) {
        ExpiryBypassController.setBypass(true);
    }

    @Inject(method = "<init>", at = @At("RETURN"), remap = false)
    private void onCtorReturn(CallbackInfo ci) {
        ExpiryBypassController.clear();
    }

    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Ljava/lang/System;currentTimeMillis()J"), remap = false)
    private long redirectTimeDuringCtor() {
        if (ExpiryBypassController.isBypass()) {
            return System.currentTimeMillis() - 1L; // 小幅調整以降低副作用
        }
        return System.currentTimeMillis();
    }
}
