/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIiiiIIi;
import java.util.Date;

public class IIiIiIIiiI {
    private static final boolean ALLATORIxDEMO = IIiIiiiIIi.ALLATORIxDEMO() == (0x3B & 0x64) ? 3 & 5 : 0;

    public IIiIiIIiiI() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public static final long ALLATORIxDEMO(long IiIIiIiiiI, long IiIIiIiiiI2) {
        if (ALLATORIxDEMO) {
            return (int)(IiIIiIiiiI + IiIIiIiiiI2);
        }
        return IiIIiIiiiI + IiIIiIiiiI2;
    }
}

