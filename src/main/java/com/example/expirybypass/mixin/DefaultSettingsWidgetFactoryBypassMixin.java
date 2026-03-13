package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * 绕过 meteor-miku 模组中的版本检查
 * 拦截 DefaultSettingsWidgetFactory 中对 MySettings 的实例化
 */
@Mixin(targets = "meteordevelopment.meteorclient.gui.DefaultSettingsWidgetFactory", remap = false)
@Pseudo
public class DefaultSettingsWidgetFactoryBypassMixin {

    /**
     * 拦截 MySettings 的构造函数调用，返回 null 或跳过实例化
     */
    @Redirect(
        method = "<init>",
        at = @At(value = "NEW", target = "com/github/mikumiku/addon/mixinface/MySettings"),
        remap = false
    )
    private Object redirectMySettingsCreation() {
        // 返回 null 以跳过 MySettings 的初始化
        return null;
    }
}
