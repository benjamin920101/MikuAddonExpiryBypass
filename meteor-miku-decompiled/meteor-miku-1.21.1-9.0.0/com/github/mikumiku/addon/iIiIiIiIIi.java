/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIiIIIIi;
import com.github.mikumiku.addon.IiiiIIiiiI;
import com.github.mikumiku.addon.IiiiIiiIII;
import java.util.Date;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.utils.player.Rotations;
import net.minecraft.network.packet.Packet;
import net.minecraft.client.MinecraftClient;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiIiIiIIi {
    private static volatile iIiIiIiIIi iiiiiIIiiI;
    public IiiiIIiiiI iiIIIIiIII = null;
    public class_310 IiIIiIiiiI = class_310.getInstance();
    public IiIIiIIIIi ALLATORIxDEMO;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static iIiIiIiIIi ALLATORIxDEMO() {
        if (iiiiiIIiiI != null) return iiiiiIIiiI;
        Class<iIiIiIiIIi> clazz = iIiIiIiIIi.class;
        synchronized (iIiIiIiIIi.class) {
            if (iiiiiIIiiI != null) return iiiiiIIiiI;
            iiiiiIIiiI = new iIiIiIiIIi();
            // ** MonitorExit[var0] (shouldn't be in output)
            return iiiiiIIiiI;
        }
    }

    private /* synthetic */ iIiIiIiIIi() {
        iIiIiIiIIi iIiIiIiIIi2 = this;
        this.ALLATORIxDEMO = new IiIIiIIIIi();
        MeteorClient.EVENT_BUS.subscribe((Object)this);
        iIiIiIiIIi2.IiIIiIiiiI = class_310.getInstance();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 & 5];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n = string2.length();
        int n2 = n - --1;
        char[] cArray = new char[n];
        int n3 = --5 << --4 ^ --4 << (3 & 5);
        int cfr_ignored_0 = 5 >> 1;
        int n4 = (5 >> 1 ^ --5) << --4 ^ --3;
        int n5 = IiIIiIiiiI = string3.length() - --1;
        int n6 = n2;
        String string4 = string3;
        while (n6 >= 0) {
            int n7 = n2--;
            cArray[n7] = (char)(n4 ^ (string2.charAt(n7) ^ string4.charAt(IiIIiIiiiI)));
            if (n2 < 0) break;
            int n8 = n2--;
            char c = cArray[n8] = (char)(n3 ^ (string2.charAt(n8) ^ string4.charAt(IiIIiIiiiI)));
            if (--IiIIiIiiiI < 0) {
                IiIIiIiiiI = n5;
            }
            n6 = n2;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public boolean ALLATORIxDEMO(IiiiIIiiiI object) {
        void IiIIiIiiiI;
        iIiIiIiIIi iIiIiIiIIi2 = object2;
        Object object2 = object;
        object = iIiIiIiIIi2;
        IiIIiIiiiI.iiIIIIiIII = object2;
        IiIIiIiiiI.ALLATORIxDEMO.ALLATORIxDEMO();
        IiIIiIiiiI.IiIIiIiiiI.player.networkHandler.sendPacket((class_2596)IiiiIiiIII.ALLATORIxDEMO(IiIIiIiiiI.IiIIiIiiiI.player.getX(), IiIIiIiiiI.IiIIiIiiiI.player.getY(), IiIIiIiiiI.IiIIiIiiiI.player.getZ(), ((IiiiIIiiiI)object2).ALLATORIxDEMO(), ((IiiiIIiiiI)object2).IiiiiiiIIi(), IiIIiIiiiI.IiIIiIiiiI.player.isOnGround()));
        Rotations.setCamRotation((double)((IiiiIIiiiI)object2).ALLATORIxDEMO(), (double)((IiiiIIiiiI)object2).IiiiiiiIIi());
        return (2 ^ 3) != 0;
    }

    public void ALLATORIxDEMO() {
        this.IiIIiIiiiI.player.networkHandler.sendPacket((class_2596)IiiiIiiIII.ALLATORIxDEMO(this.IiIIiIiiiI.player.getX(), this.IiIIiIiiiI.player.getY(), this.IiIIiIiiiI.player.getZ(), this.IiIIiIiiiI.player.getYaw(), this.IiIIiIiiiI.player.getPitch(), this.IiIIiIiiiI.player.isOnGround()));
        this.iiIIIIiIII = null;
    }
}

