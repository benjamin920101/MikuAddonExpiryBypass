/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  net.minecraft.block.ChestBlock
 *  net.minecraft.block.DispenserBlock
 *  net.minecraft.block.DropperBlock
 *  net.minecraft.block.EnderChestBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.block.HopperBlock
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.block.BlockState
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.block.BarrelBlock
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIIiiIiiIi;
import com.github.mikumiku.addon.modules.sorter.ContainerSearcher;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.DropperBlock;
import net.minecraft.block.EnderChestBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.HopperBlock;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.block.BarrelBlock;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIiIIiIII {
    public IiIiIIiIII() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    /*
     * WARNING - void declaration
     */
    public static ContainerSearcher.ContainerType ALLATORIxDEMO(int n, int n2, int n3) {
        void IiIIiIiiiI;
        int IiIIiIiiiI2 = n;
        int IiIIiIiiiI222 = n2;
        class_2680 IiIIiIiiiI222 = class_310.getInstance().world.getBlockState(new class_2338(IiIIiIiiiI2, IiIIiIiiiI222, (int)IiIIiIiiiI));
        if (IiIIiIiiiI222.getBlock() instanceof class_2281) {
            return ContainerSearcher.ContainerType.iiIIIIiIII;
        }
        if (IiIIiIiiiI222.getBlock() instanceof class_2480) {
            return ContainerSearcher.ContainerType.IiIIiIiiiI;
        }
        if (IiIIiIiiiI222.getBlock() instanceof class_3708) {
            return ContainerSearcher.ContainerType.iiIiIIiIIi;
        }
        if (IiIIiIiiiI222.getBlock() instanceof class_2336) {
            return ContainerSearcher.ContainerType.iIiiIiiiII;
        }
        if (IiIIiIiiiI222.getBlock() instanceof class_2377) {
            return ContainerSearcher.ContainerType.IIIIiIiiIi;
        }
        if (IiIIiIiiiI222.getBlock() instanceof class_2325) {
            return ContainerSearcher.ContainerType.IiIiIIIIiI;
        }
        if (IiIIiIiiiI222.getBlock() instanceof class_2315) {
            return ContainerSearcher.ContainerType.iIIiiIIIII;
        }
        return ContainerSearcher.ContainerType.iiiiiIIiiI;
    }

    /*
     * WARNING - void declaration
     */
    public static List<iIIiiIiiIi> ALLATORIxDEMO(int n, int n2, int n3, int n4) {
        int n5;
        void IiIIiIiiiI;
        int IiIIiIiiiI2 = n4;
        int IiIIiIiiiI3 = n;
        ArrayList<iIIiiIiiIi> arrayList = new ArrayList<iIIiiIiiIi>();
        void var5_5 = IiIIiIiiiI - --1;
        IiIIiIiiiI += --3;
        int n6 = n5 = -IiIIiIiiiI2;
        while (n6 <= IiIIiIiiiI2) {
            void v1 = var5_5;
            while (v1 <= IiIIiIiiiI) {
                void var7_7;
                int n7 = -IiIIiIiiiI2;
                while (n7 <= IiIIiIiiiI2) {
                    int n8;
                    void IiIIiIiiiI4;
                    int n9 = IiIIiIiiiI3 + n5;
                    void var10_10 = var7_7;
                    void var11_11 = IiIIiIiiiI4 + n8;
                    ContainerSearcher.ContainerType containerType = IiIiIIiIII.ALLATORIxDEMO(n9, (int)var10_10, (int)var11_11);
                    if (containerType == ContainerSearcher.ContainerType.iiIIIIiIII) {
                        arrayList.add(new iIIiiIiiIi(n9, (int)var10_10, (int)var11_11, containerType));
                    }
                    n7 = ++n8;
                }
                v1 = ++var7_7;
            }
            n6 = ++n5;
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public static int ALLATORIxDEMO(iIIiiIiiIi iIIiiIiiIi2, int n, int n2, int n3) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        iIIiiIiiIi iIIiiIiiIi3 = iIIiiIiiIi2;
        int IiIIiIiiiI4 = 3 ^ 3;
        iIIiiIiiIi iIIiiIiiIi4 = switch (iIIiiIiiIi3.iiiiiIIiiI.ordinal()) {
            case 1 -> {
                IiIIiIiiiI4 += 100;
                yield iIIiiIiiIi3;
            }
            case 0 -> {
                IiIIiIiiiI4 += 80;
                while (false) {
                }
                yield iIIiiIiiIi3;
            }
            case 2 -> {
                IiIIiIiiiI4 += 70;
                yield iIIiiIiiIi3;
            }
            case 3 -> {
                IiIIiIiiiI4 += 60;
                yield iIIiiIiiIi3;
            }
            case 4 -> {
                IiIIiIiiiI4 += 40;
                yield iIIiiIiiIi3;
            }
            case 5, 6 -> {
                IiIIiIiiiI4 += 20;
                yield iIIiiIiiIi3;
            }
            default -> {
                IiIIiIiiiI4 += 10;
                yield iIIiiIiiIi3;
            }
        };
        double d = Math.sqrt(Math.pow(iIIiiIiiIi4.ALLATORIxDEMO - IiIIiIiiiI3, 2.0) + Math.pow(iIIiiIiiIi3.IiIIiIiiiI - IiIIiIiiiI2, 2.0) + Math.pow(iIIiiIiiIi3.iiIIIIiIII - IiIIiIiiiI, 2.0));
        return IiIIiIiiiI4 -= (int)d;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean ALLATORIxDEMO(int n, int n2, int n3) {
        void IiIIiIiiiI;
        int IiIIiIiiiI2 = n;
        int IiIIiIiiiI3 = n3;
        if (IiIiIIiIII.ALLATORIxDEMO(IiIIiIiiiI2, (int)IiIIiIiiiI, IiIIiIiiiI3) == ContainerSearcher.ContainerType.iiiiiIIiiI) {
            return (3 & 4) != 0;
        }
        return true;
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 & 5];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = --1;
        int n2 = string2.length();
        int n3 = n2 - (3 >> 1);
        char[] cArray = new char[n2];
        int n4 = (1 ^ 3 ^ --5) << --4 ^ --3 << (3 & 5);
        int cfr_ignored_0 = (--3 ^ --5) << --4 ^ (--3 ^ --5) << (2 ^ 3);
        int n5 = (--3 ^ --5) << --4 ^ n << n;
        int n6 = IiIIiIiiiI = string3.length() - (5 >> 2);
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
}

