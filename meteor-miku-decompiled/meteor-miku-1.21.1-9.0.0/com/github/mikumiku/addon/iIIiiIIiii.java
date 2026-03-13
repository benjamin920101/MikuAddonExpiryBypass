/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  fi.dy.masa.litematica.world.WorldSchematic
 *  net.minecraft.world.World
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.block.BlockState
 */
package com.github.mikumiku.addon;

import com.google.gson.Gson;
import fi.dy.masa.litematica.world.WorldSchematic;
import java.util.Date;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.BlockState;

public class iIIiiIIiii {
    public final class_2338 IiIiIIIIiI;
    public final class_1937 iiiiiIIiiI;
    public final class_2680 iiIIIIiIII;
    public final WorldSchematic IiIIiIiiiI;
    public final class_2680 ALLATORIxDEMO;

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[2 ^ 3];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = --4;
        int n2 = string2.length();
        int n3 = n2 - (3 & 5);
        char[] cArray = new char[n2];
        int n4 = (1 ^ 3 ^ --5) << --3 ^ (--2 ^ --5);
        int cfr_ignored_0 = (5 >> 1 ^ --5) << --4 ^ --3 << (2 ^ 3);
        int n5 = n << n ^ --5 << --1;
        int n6 = IiIIiIiiiI = string3.length() - (3 >> 1);
        int n7 = n3;
        String string4 = string3;
        while (n7 >= 0) {
            int n8 = n3--;
            cArray[n8] = (char)(n5 ^ (string2.charAt(n8) ^ string4.charAt(IiIIiIiiiI)));
            if (n3 < 0) break;
            int n9 = n3--;
            char c = cArray[n9] = (char)(n4 ^ (string2.charAt(n9) ^ string4.charAt(IiIIiIiiiI)));
            if (--IiIIiIiiiI < 0) {
                IiIIiIiiiI = n6;
            }
            n7 = n3;
        }
        return new String(cArray);
    }

    public String toString() {
        return new Gson().toJson((Object)this);
    }

    /*
     * WARNING - void declaration
     */
    public iIIiiIIiii(class_1937 class_19372, WorldSchematic worldSchematic, class_2338 class_23382) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        iIIiiIIiii IiIIiIiiiI3;
        iIIiiIIiii iIIiiIIiii2 = iIIiiIIiii3;
        iIIiiIIiii iIIiiIIiii3 = class_23382;
        iIIiiIIiii iIIiiIIiii4 = IiIIiIiiiI3 = iIIiiIIiii2;
        iIIiiIIiii iIIiiIIiii5 = IiIIiIiiiI3;
        iIIiiIIiii5.iiiiiIIiiI = IiIIiIiiiI2;
        iIIiiIIiii5.IiIIiIiiiI = IiIIiIiiiI;
        IiIIiIiiiI3.IiIiIIIIiI = iIIiiIIiii3;
        iIIiiIIiii4.ALLATORIxDEMO = IiIIiIiiiI.getBlockState(IiIIiIiiiI3.IiIiIIIIiI);
        iIIiiIIiii4.iiIIIIiIII = IiIIiIiiiI2.getBlockState((class_2338)iIIiiIIiii3);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public iIIiiIIiii ALLATORIxDEMO(class_2350 class_23502) {
        iIIiiIIiii IiIIiIiiiI;
        iIIiiIIiii iIIiiIIiii2 = iIIiiIIiii3;
        iIIiiIIiii iIIiiIIiii3 = class_23502;
        iIIiiIIiii iIIiiIIiii4 = IiIIiIiiiI = iIIiiIIiii2;
        return new iIIiiIIiii(iIIiiIIiii4.iiiiiIIiiI, iIIiiIIiii4.IiIIiIiiiI, IiIIiIiiiI.IiIiIIIIiI.offset((class_2350)iIIiiIIiii3));
    }
}

