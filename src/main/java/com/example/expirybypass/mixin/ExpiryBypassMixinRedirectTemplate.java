package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Date;

/**
 * 繞過 meteor-miku 模組的過期檢查
 * 目標類：com.github.mikumiku.addon.ok.PreLaunchInitializer
 */
@Pseudo
@Mixin(targets = "com.github.mikumiku.addon.ok.PreLaunchInitializer", remap = false)
public class ExpiryBypassMixinRedirectTemplate {

    private static final long TARGET_TIMESTAMP = 1772294400455L;

    @Redirect(
        method = "<init>",
        at = @At(value = "INVOKE", target = "Ljava/util/Date;after(Ljava/util/Date;)Z"),
        remap = false
    )
    private boolean redirectDateAfter(Date instance, Date other) {
        // 永遠返回 false，繞過過期檢查
        // instance 是目標時間戳 (1772294400455L)
        // other 是當前時間
        return false;
    }
}
