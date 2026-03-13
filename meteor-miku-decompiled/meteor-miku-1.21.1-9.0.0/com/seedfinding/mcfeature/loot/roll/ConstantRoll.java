/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.seedfinding.mcfeature.loot.roll;

import com.seedfinding.mcfeature.loot.LootContext;
import com.seedfinding.mcfeature.loot.roll.LootRoll;

public class ConstantRoll
extends LootRoll {
    public final int value;

    public ConstantRoll(int value) {
        this.value = value;
    }

    @Override
    public int getCount(LootContext context) {
        return this.value;
    }
}

