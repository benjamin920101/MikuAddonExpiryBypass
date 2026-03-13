/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.BlockState
 *  net.minecraft.util.Pair
 *  net.minecraft.block.CartographyTableBlock
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.mikumiku.addon.mixin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.BlockState;
import net.minecraft.util.Pair;
import net.minecraft.block.CartographyTableBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={BlockUtils.class}, remap=false)
public class BlockUtilsMixin {
    @Inject(method={"isClickable(Lnet/minecraft/class_2248;)Z"}, at={@At(value="HEAD")}, cancellable=true)
    private static void injectedIsClickable(class_2248 block, CallbackInfoReturnable<Boolean> cir) {
        if (block instanceof class_3711) {
            cir.setReturnValue((Object)true);
        }
    }

    @Inject(method={"getPlaceSide(Lnet/minecraft/class_2338;)Lnet/minecraft/class_2350;"}, at={@At(value="HEAD")}, cancellable=true)
    private static void injectedGetPlaceSide(class_2338 blockPos, CallbackInfoReturnable<class_2350> cir) {
        ArrayList<class_2350> placeableDirections = new ArrayList<class_2350>();
        for (class_2350 side : class_2350.values()) {
            class_2338 neighbor = blockPos.offset(side);
            class_2680 state = MeteorClient.mc.world.getBlockState(neighbor);
            if (state.isAir() || BlockUtils.isClickable((class_2248)state.getBlock()) || !state.getFluidState().isEmpty()) continue;
            placeableDirections.add(side);
        }
        class_243 lookVec = blockPos.toCenterPos().subtract(MeteorClient.mc.player.getEyePos());
        List<class_3545> directionSignificance = Arrays.asList(new class_3545((Object)class_2350.WEST, (Object)(-lookVec.getX())), new class_3545((Object)class_2350.EAST, (Object)lookVec.getX()), new class_3545((Object)class_2350.DOWN, (Object)(-lookVec.getY())), new class_3545((Object)class_2350.UP, (Object)lookVec.getY()), new class_3545((Object)class_2350.NORTH, (Object)(-lookVec.getZ())), new class_3545((Object)class_2350.SOUTH, (Object)lookVec.getZ()));
        Collections.sort(directionSignificance, (pair1, pair2) -> Double.compare((Double)pair2.getRight(), (Double)pair1.getRight()));
        for (class_3545 pair : directionSignificance) {
            if (!placeableDirections.contains(pair.getLeft())) continue;
            cir.setReturnValue((Object)((class_2350)pair.getLeft()));
            return;
        }
        cir.setReturnValue(null);
    }
}

