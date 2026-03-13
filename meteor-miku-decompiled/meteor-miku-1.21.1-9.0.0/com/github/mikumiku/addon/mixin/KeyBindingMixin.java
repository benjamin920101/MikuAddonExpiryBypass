/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  net.minecraft.client.option.KeyBinding
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.mikumiku.addon.mixin;

import com.github.mikumiku.addon.mixinface.MagicMix;
import net.minecraft.client.option.KeyBinding;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_304.class})
public abstract class KeyBindingMixin {
    @Final
    @Shadow
    private String translationKey;

    @Inject(at={@At(value="RETURN")}, method={"isPressed()Z"}, require=0, cancellable=true)
    public void isPressed(CallbackInfoReturnable<Boolean> cir) {
        if (MagicMix.eflyenabled() && this.translationKey.equals("key.forward")) {
            cir.setReturnValue((Object)true);
        }
    }
}

