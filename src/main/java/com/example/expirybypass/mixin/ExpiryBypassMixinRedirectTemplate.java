package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Date;

/**
 * 绕过 meteor-miku 模组的过期检查
 * 目标类：com.github.mikumiku.addon.MikuLauncher
 */
@Pseudo
@Mixin(targets = "com.github.mikumiku.addon.MikuLauncher", remap = false)
public class ExpiryBypassMixinRedirectTemplate {

    private static final long TARGET_TIMESTAMP = 1773504000178L;

    @Redirect(
        method = "<init>",
        at = @At(value = "INVOKE", target = "Ljava/util/Date;after(Ljava/util/Date;)Z"),
        remap = false
    )
    private boolean redirectDateAfter(Date instance, Date other) {
        // 永远返回 false，绕过过期检查
        // instance 是目标时间戳 (1773504000178L)
        // other 是当前时间
        return false;
    }
}
