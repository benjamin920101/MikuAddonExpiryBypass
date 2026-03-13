/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.orbit.EventHandler
 */
package com.github.mikumiku.addon;

import java.util.Date;
import lombok.Generated;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.orbit.EventHandler;

public final class iIIIiiiIiI {
    private volatile long iiIIIIiIII = 0L;
    public static final int IiIIiIiiiI = 0x7FFFFFFE;
    public static final iIIIiiiIiI ALLATORIxDEMO = new iIIIiiiIiI();

    @Generated
    public long ALLATORIxDEMO() {
        return this.iiIIIIiIII;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        iIIIiiiIiI iIIIiiiIiI2 = iIIIiiiIiI3;
        iIIIiiiIiI iIIIiiiIiI3 = post;
        iIIIiiiIiI IiIIiIiiiI = iIIIiiiIiI2;
        IiIIiIiiiI.ALLATORIxDEMO();
    }

    private /* synthetic */ iIIIiiiIiI() {
        MeteorClient.EVENT_BUS.subscribe((Object)this);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        ++this.iiIIIIiIII;
    }
}

