package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Date;

/**
 * 绕过 meteor-miku 模组中的 MySettings 过期检查
 */
@Mixin(targets = "com.github.mikumiku.addon.mixinface.MySettings", remap = false, priority = 2000)
@Pseudo
public class MySettingsBypassMixin {

    private static final long EXPIRY_TIMESTAMP = 1773504000178L;

    /**
     * 重定向 Date.after() 方法，永远返回 false 以绕过过期检查
     */
    @Redirect(
        method = "<init>",
        at = @At(value = "INVOKE", target = "Ljava/util/Date;after(Ljava/util/Date;)Z"),
        remap = false
    )
    private boolean redirectDateAfter(Date instance, Date when) {
        System.out.println("[ExpiryBypass] Intercepted Date.after() in MySettings");
        return false;
    }
}
