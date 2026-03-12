package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Date;

// ExpiryBypassMixinDate.java — 已停用
// 原本此檔會 mixin 到 `java.util.Date`，可能導致 MixinTargetAlreadyLoadedException。
// 為避免在初始化期間修改 JDK 類，此檔案已移除 mixin 實作並保留為註解紀錄。
@Mixin(value = java.util.Date.class, remap = false)
public class ExpiryBypassMixinDate {

    private static final long TARGET_TIMESTAMP = 1773504000082L;

    @Inject(method = "after(Ljava/util/Date;)Z", at = @At("HEAD"), cancellable = true, remap = false)
    private void onAfter(Date when, CallbackInfoReturnable<Boolean> cir) {
        try {
            if (when != null && when.getTime() == TARGET_TIMESTAMP) {
                cir.setReturnValue(false);
            }
        } catch (Throwable ignored) {
        }
    }
}
