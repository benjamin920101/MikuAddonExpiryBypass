/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 */
package com.github.mikumiku.addon;

import java.util.Arrays;
import java.util.List;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

public interface iIiIiiiIiI {
    public static final List<class_2248> ALLATORIxDEMO;

    static {
        class_2248[] class_2248Array = new class_2248[0x59 & 0x76];
        class_2248Array[3 >> 2] = class_2246.CHEST;
        class_2248Array[--1] = class_2246.TRAPPED_CHEST;
        class_2248Array[1 ^ 3] = class_2246.ENDER_CHEST;
        class_2248Array[--3] = class_2246.BARREL;
        class_2248Array[--4] = class_2246.HOPPER;
        class_2248Array[--5] = class_2246.DROPPER;
        class_2248Array[0x16 & 0x6F] = class_2246.DISPENSER;
        class_2248Array[0x57 & 0x2F] = class_2246.WHITE_SHULKER_BOX;
        class_2248Array[0x1B & 0x6C] = class_2246.ORANGE_SHULKER_BOX;
        class_2248Array[0x5D & 0x2B] = class_2246.MAGENTA_SHULKER_BOX;
        class_2248Array[0xF & 0x7A] = class_2246.LIGHT_BLUE_SHULKER_BOX;
        class_2248Array[0xB & 0x7F] = class_2246.YELLOW_SHULKER_BOX;
        class_2248Array[0x5D & 0x2E] = class_2246.LIME_SHULKER_BOX;
        class_2248Array[0x2D & 0x5F] = class_2246.PINK_SHULKER_BOX;
        class_2248Array[0x1E & 0x6F] = class_2246.GRAY_SHULKER_BOX;
        class_2248Array[0xF & 0x7F] = class_2246.CYAN_SHULKER_BOX;
        class_2248Array[0x7E & 0x11] = class_2246.PURPLE_SHULKER_BOX;
        class_2248Array[0x3B & 0x55] = class_2246.BLUE_SHULKER_BOX;
        class_2248Array[0x77 & 0x1A] = class_2246.BROWN_SHULKER_BOX;
        class_2248Array[0x3F & 0x53] = class_2246.GREEN_SHULKER_BOX;
        class_2248Array[0x54 & 0x3F] = class_2246.RED_SHULKER_BOX;
        class_2248Array[0x17 & 0x7D] = class_2246.BLACK_SHULKER_BOX;
        class_2248Array[0x7E & 0x17] = class_2246.CRAFTING_TABLE;
        class_2248Array[0x17 & 0x7F] = class_2246.ENCHANTING_TABLE;
        class_2248Array[0x3E & 0x59] = class_2246.ANVIL;
        class_2248Array[0x1F & 0x79] = class_2246.CHIPPED_ANVIL;
        class_2248Array[0x7E & 0x1B] = class_2246.DAMAGED_ANVIL;
        class_2248Array[0x7F & 0x1B] = class_2246.BREWING_STAND;
        class_2248Array[0x7C & 0x1F] = class_2246.FURNACE;
        class_2248Array[0x7F & 0x1D] = class_2246.BLAST_FURNACE;
        class_2248Array[0x5E & 0x3F] = class_2246.SMOKER;
        class_2248Array[0x7F & 0x1F] = class_2246.STONECUTTER;
        class_2248Array[0x39 & 0x66] = class_2246.GRINDSTONE;
        class_2248Array[0x27 & 0x79] = class_2246.LOOM;
        class_2248Array[0x7F & 0x22] = class_2246.SMITHING_TABLE;
        class_2248Array[0x23 & 0x7F] = class_2246.COMPOSTER;
        class_2248Array[0x66 & 0x3D] = class_2246.BEACON;
        class_2248Array[37] = class_2246.LECTERN;
        class_2248Array[38] = class_2246.BELL;
        class_2248Array[39] = class_2246.LEVER;
        class_2248Array[40] = class_2246.STONE_BUTTON;
        class_2248Array[41] = class_2246.OAK_BUTTON;
        class_2248Array[42] = class_2246.SPRUCE_BUTTON;
        class_2248Array[43] = class_2246.BIRCH_BUTTON;
        class_2248Array[44] = class_2246.JUNGLE_BUTTON;
        class_2248Array[45] = class_2246.ACACIA_BUTTON;
        class_2248Array[46] = class_2246.DARK_OAK_BUTTON;
        class_2248Array[47] = class_2246.MANGROVE_BUTTON;
        class_2248Array[48] = class_2246.CHERRY_BUTTON;
        class_2248Array[49] = class_2246.BAMBOO_BUTTON;
        class_2248Array[50] = class_2246.WARPED_BUTTON;
        class_2248Array[51] = class_2246.CRIMSON_BUTTON;
        class_2248Array[52] = class_2246.NOTE_BLOCK;
        class_2248Array[53] = class_2246.OAK_DOOR;
        class_2248Array[54] = class_2246.SPRUCE_DOOR;
        class_2248Array[55] = class_2246.BIRCH_DOOR;
        class_2248Array[56] = class_2246.JUNGLE_DOOR;
        class_2248Array[57] = class_2246.ACACIA_DOOR;
        class_2248Array[58] = class_2246.DARK_OAK_DOOR;
        class_2248Array[59] = class_2246.MANGROVE_DOOR;
        class_2248Array[60] = class_2246.CHERRY_DOOR;
        class_2248Array[61] = class_2246.BAMBOO_DOOR;
        class_2248Array[62] = class_2246.WARPED_DOOR;
        class_2248Array[63] = class_2246.CRIMSON_DOOR;
        class_2248Array[64] = class_2246.OAK_TRAPDOOR;
        class_2248Array[65] = class_2246.SPRUCE_TRAPDOOR;
        class_2248Array[66] = class_2246.BIRCH_TRAPDOOR;
        class_2248Array[67] = class_2246.JUNGLE_TRAPDOOR;
        class_2248Array[68] = class_2246.ACACIA_TRAPDOOR;
        class_2248Array[69] = class_2246.DARK_OAK_TRAPDOOR;
        class_2248Array[70] = class_2246.MANGROVE_TRAPDOOR;
        class_2248Array[71] = class_2246.CHERRY_TRAPDOOR;
        class_2248Array[72] = class_2246.BAMBOO_TRAPDOOR;
        class_2248Array[73] = class_2246.WARPED_TRAPDOOR;
        class_2248Array[74] = class_2246.CRIMSON_TRAPDOOR;
        class_2248Array[75] = class_2246.SCAFFOLDING;
        class_2248Array[76] = class_2246.OAK_SIGN;
        class_2248Array[77] = class_2246.OAK_WALL_SIGN;
        class_2248Array[78] = class_2246.OAK_HANGING_SIGN;
        class_2248Array[79] = class_2246.OAK_WALL_HANGING_SIGN;
        ALLATORIxDEMO = Arrays.asList(class_2248Array);
    }
}

