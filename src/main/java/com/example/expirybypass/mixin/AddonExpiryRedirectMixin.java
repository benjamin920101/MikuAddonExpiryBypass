package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Date;

@Mixin(targets = {
    "com.github.mikumiku.addon.IiiiIiiIII",
    "com.github.mikumiku.addon.iiiIIIiiii",
    "com.github.mikumiku.addon.IiiIiIiiiI",
    "com.github.mikumiku.addon.iIIIiIiiiI",
    "com.github.mikumiku.addon.IiIIiIiIii",
    "com.github.mikumiku.addon.IiiIiIiiiI",
    "com.github.mikumiku.addon.iiIiiiiIII"
}, remap = false)
@Pseudo
public class AddonExpiryRedirectMixin {

    // 目標時間戳，可根據需要調整
    private static final long TARGET_TIMESTAMP = 1773504000082L;
    // 若為 true，當遇到 TARGET_TIMESTAMP 時回傳 System.currentTimeMillis() > TARGET_TIMESTAMP
    // 若為 false，遇到 TARGET_TIMESTAMP 時直接回傳 false（不視為已過期）
    private static final boolean USE_SYSTEM_TIME = false;

    @Redirect(
        method = "<init>",
        at = @At(value = "INVOKE", target = "Ljava/util/Date;after(Ljava/util/Date;)Z"),
        remap = false
    )
    private boolean redirectDateAfter(Date instance, Date other) {
        try {
            if (other != null && other.getTime() == TARGET_TIMESTAMP) {
                if (USE_SYSTEM_TIME) {
                    return System.currentTimeMillis() > TARGET_TIMESTAMP;
                } else {
                    return false;
                }
            }
        } catch (Throwable ignored) {
        }
        return instance.after(other);
    }
}
