/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ClientModInitializer
 */
package com.github.mikumiku.addon;

import java.util.Date;
import net.fabricmc.api.ClientModInitializer;

public class MikuLauncher
implements ClientModInitializer {
    private static boolean IiIIiIiiiI = 3 & 4;
    private static boolean ALLATORIxDEMO = 3 & 4;

    public void onInitializeClient() {
    }

    public MikuLauncher() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }
}

