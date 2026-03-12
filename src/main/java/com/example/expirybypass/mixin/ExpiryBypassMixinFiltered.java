// ExpiryBypassMixinFiltered.java — 已停用
// 原始檔案保留為範例，但已移除實作以避免在 runtime 被註冊為 mixin。

/*
package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Date;

@Mixin(targets = "com.example.targetmod.TargetClass", remap = false)
@Pseudo
public class ExpiryBypassMixinFiltered {
    private static final long TARGET_TIMESTAMP = 1773504000082L;

    @Redirect(
        method = "<init>",
        at = @At(value = "INVOKE", target = "Ljava/util/Date;after(Ljava/util/Date;)Z"),
        remap = false
    )
    private boolean redirectDateAfter(Date instance, Date other) {
        try {
            if (other != null && other.getTime() == TARGET_TIMESTAMP) {
                return false;
            }
        } catch (Throwable ignored) {
        }
        return instance.after(other);
    }
}
*/
