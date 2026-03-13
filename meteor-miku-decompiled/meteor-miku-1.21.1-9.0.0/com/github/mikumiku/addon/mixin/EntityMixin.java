/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.entity.EntityPose
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.mikumiku.addon.mixin;

import com.github.mikumiku.addon.mixinface.MagicMix;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EntityPose;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1297.class})
public class EntityMixin {
    @Shadow
    protected UUID uuid;

    @Inject(at={@At(value="HEAD")}, method={"getPose()Lnet/minecraft/class_4050;"}, require=0, cancellable=true)
    private void getPose(CallbackInfoReturnable<class_4050> cir) {
        class_310 mc = class_310.getInstance();
        if (MagicMix.eflyenabled() && this.uuid == mc.player.getUuid()) {
            cir.setReturnValue((Object)class_4050.STANDING);
        }
    }

    @Inject(at={@At(value="HEAD")}, method={"isSprinting()Z"}, require=0, cancellable=true)
    private void isSprinting(CallbackInfoReturnable<Boolean> cir) {
        class_310 mc = class_310.getInstance();
        if (MagicMix.eflyenabled() && this.uuid == mc.player.getUuid()) {
            cir.setReturnValue((Object)true);
        }
    }

    @Inject(at={@At(value="HEAD")}, method={"pushAwayFrom(Lnet/minecraft/class_1297;)V"}, require=0, cancellable=true)
    private void pushAwayFrom(class_1297 entity, CallbackInfo ci) {
        class_310 mc = class_310.getInstance();
        if (mc.player != null && this.uuid == mc.player.getUuid() && MagicMix.eflyenabled() && !entity.getUuid().equals(this.uuid)) {
            ci.cancel();
        }
    }
}

