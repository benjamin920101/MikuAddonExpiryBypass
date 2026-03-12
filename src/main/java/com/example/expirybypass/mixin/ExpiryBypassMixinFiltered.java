package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Date;

/**
 * 範例 mixin：僅在 other.getTime() 等於 TARGET_TIMESTAMP 時回傳 false。
 * 使用時：把 @Mixin 的 targets 改成實際會呼叫 Date.after(...) 的類別。
 */
@Mixin(targets = "com.example.targetmod.TargetClass", remap = false)
@Pseudo
public class ExpiryBypassMixinFiltered {

    private static final long TARGET_TIMESTAMP = 1773504000082L;

    @Redirect(
        method = "<init>", // 修改為實際要攔截的方法或使用多個 mixin 覆蓋不同方法
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
