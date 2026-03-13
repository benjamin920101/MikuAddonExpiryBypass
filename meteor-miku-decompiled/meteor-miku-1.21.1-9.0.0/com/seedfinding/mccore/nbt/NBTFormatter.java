/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.seedfinding.mccore.nbt;

import com.seedfinding.mccore.nbt.tag.NBTTag;

public class NBTFormatter {
    public static String format(NBTTag<?> nbt) {
        return nbt.toString();
    }
}

