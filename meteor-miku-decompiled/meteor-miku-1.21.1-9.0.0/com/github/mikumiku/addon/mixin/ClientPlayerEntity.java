/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  meteordevelopment.meteorclient.MeteorClient
 *  net.minecraft.entity.MovementType
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.mikumiku.addon.mixin;

import com.github.mikumiku.addon.mixinface.MoveEvent;
import com.mojang.authlib.GameProfile;
import meteordevelopment.meteorclient.MeteorClient;
import net.minecraft.entity.MovementType;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_746.class}, priority=800)
public abstract class ClientPlayerEntity
extends class_742 {
    @Shadow
    public abstract float getPitch(float var1);

    private ClientPlayerEntity(class_638 world, GameProfile profile) {
        super(world, profile);
    }

    @Inject(method={"move(Lnet/minecraft/class_1313;Lnet/minecraft/class_243;)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_742;move(Lnet/minecraft/class_1313;Lnet/minecraft/class_243;)V")}, cancellable=true)
    public void onMoveHook(class_1313 movementType, class_243 movement, CallbackInfo ci) {
        MoveEvent event = new MoveEvent(movement.x, movement.y, movement.z);
        MeteorClient.EVENT_BUS.post((Object)event);
        if (event.isCancelled()) {
            super.move(movementType, new class_243(event.getX(), event.getY(), event.getZ()));
            ci.cancel();
        }
    }
}

