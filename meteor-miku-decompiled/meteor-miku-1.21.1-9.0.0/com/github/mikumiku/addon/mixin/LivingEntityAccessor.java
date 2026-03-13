/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.LivingEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package com.github.mikumiku.addon.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1309.class})
public interface LivingEntityAccessor {
    @Accessor(value="jumping")
    public boolean isJumping();

    @Accessor(value="jumpingCooldown")
    public int getJumpCooldown();

    @Accessor(value="jumpingCooldown")
    public void setJumpCooldown(int var1);
}

