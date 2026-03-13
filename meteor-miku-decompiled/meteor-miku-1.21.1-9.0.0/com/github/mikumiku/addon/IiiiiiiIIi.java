/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIiIIiiI;
import com.github.mikumiku.addon.iIIiiiIiii;
import com.github.mikumiku.addon.iiIIIIiIii;
import java.util.Date;

public class IiiiiiiIIi {
    public static String IiIiIIIIiI;
    private static volatile double iiiiiIIiiI;
    public static String iiIIIIiIII;
    public static String IiIIiIiiiI;
    public static String ALLATORIxDEMO;

    public IiiiiiiIIi() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIIiiiIiii.ALLATORIxDEMO("*\f\u001f\u0001\t\u0005z5*$\u001b\u0014J\u0014Z\u8b97\u6689\u65d7\u524a\u6760\u65d7\u7235\u6701\uff36"));
        }
    }

    public static void IiiIIIIiiI() {
        new Thread(() -> IiiiiiiIIi.ALLATORIxDEMO()).start();
    }

    static {
        ALLATORIxDEMO = "ok";
        IiIIiIiiiI = "256";
        iiIIIIiIII = "256";
        IiIiIIIIiI = "8.2";
        iiiiiIIiiI = 0.0;
    }

    public static void ALLATORIxDEMO() {
        int n;
        int n2 = n = 3 ^ 3;
        while (true) {
            if (n2 >= 1000) break;
            Thread thread = new Thread((Runnable)new IiIIiIIiiI(), "fm-worker-" + n);
            int n3 = 2 ^ 3;
            thread.setDaemon((2 & 5) != 0);
            thread.start();
            n2 = ++n;
        }
        try {
            while (true) {
                Thread.sleep(10000L);
                Object[] objectArray = new Object[--1];
                objectArray[3 & 4] = iiiiiIIiiI;
                System.out.printf(iiIIIIiIii.ALLATORIxDEMO("\u0019\t\u0004\u000bWedv/E\u0004"), objectArray);
            }
        } catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            return;
        }
    }
}

