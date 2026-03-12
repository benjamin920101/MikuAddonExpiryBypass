package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Date;

@Mixin(value = java.util.Date.class, remap = false)
public class ExpiryBypassMixinDate {

    // 目標時間戳，僅在等於此值時才繞過（可改成從 config 讀取或改成 Set）
    private static final long TARGET_TIMESTAMP = 1773504000082L;

    @Inject(method = "after(Ljava/util/Date;)Z", at = @At("HEAD"), cancellable = true)
    private void onAfter(Date when, CallbackInfoReturnable<Boolean> cir) {
        try {
            if (when != null && when.getTime() == TARGET_TIMESTAMP) {
                cir.setReturnValue(false);
            }
        } catch (Throwable ignored) {
            // 保險：不要讓 mixin 拋例外導致遊戲崩潰
        }
    }
}
