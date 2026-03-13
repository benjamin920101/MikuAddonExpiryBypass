/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.systems.modules.Modules
 *  net.minecraft.util.math.BlockPos
 */
package com.github.mikumiku.addon.mixinface;

import com.github.mikumiku.addon.IIiiIiIIiI;
import com.github.mikumiku.addon.iiIiIIIIII;
import com.github.mikumiku.addon.iiIiiiIIII;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.util.math.BlockPos;

public class MagicMix {
    public static double x = 0.0;
    public static List<class_2338> oreGoals;
    public static double z;

    public static boolean coordinatesisActive() {
        iiIiiiIIII iiIiiiIIII2 = (iiIiiiIIII)Modules.get().get(iiIiiiIIII.class);
        if (iiIiiiIIII2 != null && iiIiiiIIII2.isActive()) {
            return 5 >> 2;
        }
        return false;
    }

    public static boolean eflyenabled() {
        IIiiIiIIiI iIiiIiIIiI = (IIiiIiIIiI)Modules.get().get(IIiiIiIIiI.class);
        if (iIiiIiIIiI != null && iIiiIiIIiI.ALLATORIxDEMO()) {
            return --1 != 0;
        }
        return false;
    }

    public MagicMix() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    static {
        z = 0.0;
        oreGoals = new ArrayList<class_2338>();
    }

    public static boolean oreSimBaritone() {
        iiIiIIIIII iiIiIIIIII2 = (iiIiIIIIII)Modules.get().get(iiIiIIIIII.class);
        if (iiIiIIIIII2 == null || !iiIiIIIIII2.IiiiiiiIIi()) {
            return false;
        }
        return true;
    }
}

