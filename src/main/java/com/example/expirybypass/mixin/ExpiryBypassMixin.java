package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Date;

/**
 * 绕过 meteor-miku 模组中的 MikuMikuAddon 过期检查
 */
@Mixin(targets = "com.github.mikumiku.addon.ok.MikuMikuAddon", remap = false)
@Pseudo
public class ExpiryBypassMixin {

    private static final long EXPIRY_TIMESTAMP = 1773504000178L;

    @Redirect(
        method = "<init>",
        at = @At(
            value = "INVOKE",
            target = "Ljava/util/Date;after(Ljava/util/Date;)Z"
        ),
        remap = false
    )
    private boolean redirectDateAfter(Date instance, Date other) {
        // 只拦截特定的到期时间戳，其他的 Date.after() 调用保持原本行为
        if (other.getTime() == EXPIRY_TIMESTAMP) {
            return false;
        }
        return instance.after(other);
    }
}
