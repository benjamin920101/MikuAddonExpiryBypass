/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.orbit.EventHandler
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiiiIIi;
import com.github.mikumiku.addon.IIiIiiIIiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.mixin.LivingEntityAccessor;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.orbit.EventHandler;

public class iiIIIiiIiI
extends iiiiIiIiii {
    public iiIIIiiIiI() {
        super(IIIIiiiIIi.ALLATORIxDEMO("\u53b7\u9845\u594c\u8de0"), IIiIiiIIiI.ALLATORIxDEMO("\u53cew\u683d\u9a9d\u9877\u5971\u8df2\uff69\u65c1\u5e93\u8ffe\uff49\u975f\u5e5d\u6e5e\u6e94\u3003"));
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIIIiiiIIi.ALLATORIxDEMO("\u000fXz\u0015+VxF\bw\u0019g\u001d2x\u8bc4\u66ac\u6583\u5248\u6713\u65e8\u727b\u6754\uff12"));
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        iiIIIiiIiI iiIIIiiIiI2 = iiIIIiiIiI3;
        iiIIIiiIiI iiIIIiiIiI3 = post;
        iiIIIiiIiI IiIIiIiiiI = iiIIIiiIiI2;
        ((LivingEntityAccessor)IiIIiIiiiI.iiIIIIiIII.player).setJumpCooldown(2 & 5);
    }
}

