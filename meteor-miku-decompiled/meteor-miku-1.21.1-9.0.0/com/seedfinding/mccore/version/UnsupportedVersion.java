/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.seedfinding.mccore.version;

import com.seedfinding.mccore.version.MCVersion;

public class UnsupportedVersion
extends RuntimeException {
    public UnsupportedVersion(MCVersion version, String type) {
        super("Minecraft " + (Object)((Object)version) + " does not support " + type);
    }
}

