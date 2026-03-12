package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Date;

@Mixin(targets = {
    "com.github.mikumiku.addon.iIiIIIiIIi",
    "com.github.mikumiku.addon.mixinface.MySettings",
    "com.github.mikumiku.addon.iIiiIiiIii",
    "com.github.mikumiku.addon.IiIiiiiIii",
    "com.github.mikumiku.addon.iiIIiiiIIi",
    "com.github.mikumiku.addon.IiIIIiIiiI",
    "com.github.mikumiku.addon.ok.PreLaunchInitializer",
    "com.github.mikumiku.addon.mixinface.MoveEvent",
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
    "com.github.mikumiku.addon.MikuLauncher",
    "com.github.mikumiku.addon.iiIiiIIIiI",
    "com.github.mikumiku.addon.iIiIIIIiIi",
    "com.github.mikumiku.addon.IIIiIIiiiI",
    "com.github.mikumiku.addon.IiIiiiIiiI",
    "com.github.mikumiku.addon.mixinface.MagicMix",
    "com.github.mikumiku.addon.IIIIiIiIii",
    "com.github.mikumiku.addon.iIiIiiIIIi"
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
