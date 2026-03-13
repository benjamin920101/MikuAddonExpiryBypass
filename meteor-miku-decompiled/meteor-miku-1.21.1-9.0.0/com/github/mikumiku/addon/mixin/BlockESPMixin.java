/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPChunk
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.block.FluidBlock
 *  net.minecraft.block.BlockState
 *  net.minecraft.state.property.Property
 *  net.minecraft.world.chunk.Chunk
 *  net.minecraft.world.Heightmap$Type
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.github.mikumiku.addon.mixin;

import java.util.List;
import lombok.Generated;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.systems.modules.render.blockesp.ESPChunk;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Property;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.Heightmap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={ESPChunk.class})
public abstract class BlockESPMixin {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(BlockESPMixin.class);

    @Inject(method={"searchChunk(Lnet/minecraft/class_2791;Ljava/util/List;)Lmeteordevelopment/meteorclient/systems/modules/render/blockesp/ESPChunk;"}, at={@At(value="HEAD")}, cancellable=true)
    private static void injectSearchChunk(class_2791 chunk, List<class_2248> blocks, CallbackInfoReturnable<ESPChunk> cir) {
        try {
            ESPChunk schunk = new ESPChunk(chunk.getPos().x, chunk.getPos().z);
            if (schunk.shouldBeDeleted()) {
                cir.setReturnValue((Object)schunk);
                return;
            }
            class_2338.class_2339 blockPos = new class_2338.class_2339();
            class_2338 playerPos = MeteorClient.mc.player.getBlockPos();
            for (int x = chunk.getPos().getStartX(); x <= chunk.getPos().getEndX(); ++x) {
                for (int z = chunk.getPos().getStartZ(); z <= chunk.getPos().getEndZ(); ++z) {
                    int height = chunk.getHeightmap(class_2902.class_2903.WORLD_SURFACE).get(x - chunk.getPos().getStartX(), z - chunk.getPos().getStartZ());
                    for (int y = MeteorClient.mc.world.getBottomY(); y < height; ++y) {
                        blockPos.set(x, y, z);
                        class_2680 bs = chunk.getBlockState((class_2338)blockPos);
                        class_2248 block = bs.getBlock();
                        if (!blocks.contains(block)) continue;
                        if (block instanceof class_2404) {
                            double distanceSq;
                            Integer level = (Integer)bs.get((class_2769)class_2404.LEVEL);
                            if (level == null || level != 0 || block == class_2246.WATER && (distanceSq = blockPos.getSquaredDistance((class_2382)playerPos)) > 4096.0) continue;
                            schunk.add((class_2338)blockPos, false);
                            continue;
                        }
                        schunk.add((class_2338)blockPos, false);
                    }
                }
            }
            cir.setReturnValue((Object)schunk);
        } catch (Exception e) {
            log.error("Miku BlockESPMixin.injectSearchChunk err: " + String.valueOf(e));
        }
    }
}

