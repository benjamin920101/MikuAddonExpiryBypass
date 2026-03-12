package com.github.mikumiku.mixin;

import com.example.targetmod.TargetClass;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Date;

/**
 * 實作範例：針對實際目標類別 `com.example.targetmod.TargetClass` 的構造器
 * 攔截呼叫 `Date.after(Date)` 並在遇到特定時間戳時回傳 false。
 *
 * 注意：如果目標在 obfuscated 環境，請改用對應映射後的類名或使用 targets 的 remap 設定。
 */
@Mixin(value = TargetClass.class, remap = false)
public class ExpiryBypassMixinRedirectTemplate {

    private static final long TARGET_TIMESTAMP = 1773504000082L;

    @SuppressWarnings("unused")
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
