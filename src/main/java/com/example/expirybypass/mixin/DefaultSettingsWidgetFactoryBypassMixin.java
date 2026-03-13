package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * 绕过 meteor-miku 模组中的版本检查
 * 在 DefaultSettingsWidgetFactory 初始化时记录日志
 */
@Mixin(targets = "meteordevelopment.meteorclient.gui.DefaultSettingsWidgetFactory", remap = false)
@Pseudo
public class DefaultSettingsWidgetFactoryBypassMixin {

    /**
     * 在 DefaultSettingsWidgetFactory 构造函数返回时记录日志
     */
    @Inject(method = "<init>", at = @At("RETURN"), remap = false)
    private void onInitReturn(CallbackInfo ci) {
        System.out.println("[ExpiryBypass] DefaultSettingsWidgetFactory initialized");
    }
}
