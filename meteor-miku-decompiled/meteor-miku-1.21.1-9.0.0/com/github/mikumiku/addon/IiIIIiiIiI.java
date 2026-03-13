/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.network.packet.Packet
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiIIiIi;
import com.github.mikumiku.addon.IiiIIiiiII;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.iiiiIiiiII;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.network.packet.Packet;

public class IiIIIiiIiI
extends iiiiIiIiii {
    @Override
    public void onActivate() {
        super.onActivate();
        iiiiIiiiII.ALLATORIxDEMO(IiiIIiiiII.ALLATORIxDEMO("\u6593\u647d\u4f17\u9769\u89d5.\"G5.\u8c57\u657a\u5264?Z\u001cD\u0000b\u6218\u4e91\u4e25\u721c\u6722"));
    }

    public IiIIIiiIiI() {
        super(IiIiiIIiIi.ALLATORIxDEMO("\u001cL5N\u65a1\u643d\u4f2f"), IiiIIiiiII.ALLATORIxDEMO("\u9646\u6b4c\u6400\u8433\u4f50\u5b9d\u007f%"));
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiIiiIIiIi.ALLATORIxDEMO("N\u0010[=M9>\tN8\u007f\b\u000e(\u001e\u8bab\u66cd\u65eb\u520e\u675c\u6593\u7209\u6745\uff0a"));
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        if (this.iiIIIIiIII.player.fallDistance > (float)this.iiIIIIiIII.player.getSafeFallDistance() && !this.iiIIIIiIII.player.isOnGround() && !IiiiIiiIII.IiiiiiiIIi(this.iiIIIIiIII)) {
            return --1 != 0;
        }
        return false;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IiIIIiiIiI iiIIIiiIiI2 = iiIIIiiIiI3;
        IiIIIiiIiI iiIIIiiIiI3 = pre;
        IiIIIiiIiI IiIIiIiiiI = iiIIIiiIiI2;
        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) {
            return;
        }
        if (!IiIIiIiiiI.ALLATORIxDEMO()) {
            return;
        }
        IiIIIiiIiI iiIIIiiIiI4 = IiIIiIiiiI;
        iiIIIiiIiI4.iiIIIIiIII.getNetworkHandler().sendPacket((class_2596)IiiiIiiIII.ALLATORIxDEMO(IiIIiIiiiI.iiIIIIiIII.player.getX(), IiIIiIiiiI.iiIIIIiIII.player.getY() + 1.0E-9, IiIIiIiiiI.iiIIIIiIII.player.getZ(), IiIIiIiiiI.iiIIIIiIII.player.getYaw(), IiIIiIiiiI.iiIIIIiIII.player.getPitch(), (3 & 4) != 0));
        iiIIIiiIiI4.iiIIIIiIII.player.onLanding();
    }
}

