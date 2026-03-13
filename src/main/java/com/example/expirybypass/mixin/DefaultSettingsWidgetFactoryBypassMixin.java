package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Date;

/**
 * 绕过 meteor-miku 模组中的 DefaultSettingsWidgetFactory 和 WSelectedCountLabel 过期检查
 */
@Mixin(targets = {
    "meteordevelopment.meteorclient.gui.DefaultSettingsWidgetFactory",
    "com.github.mikumiku.addon.mixinface.MySettings$WSelectedCountLabel"
}, remap = false)
@Pseudo
public class DefaultSettingsWidgetFactoryBypassMixin {

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
        return false;
    }
}
