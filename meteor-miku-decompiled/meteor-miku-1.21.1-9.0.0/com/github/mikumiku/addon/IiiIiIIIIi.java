/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  net.minecraft.util.Hand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.hit.BlockHitResult
 */
package com.github.mikumiku.addon;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.hit.BlockHitResult;

public class IiiIiIIIIi {
    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 & 5];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = --4;
        int n2 = string2.length();
        int n3 = n2 - (5 >> 2);
        char[] cArray = new char[n2];
        int n4 = --5 << --4 ^ (--2 ^ --5);
        int cfr_ignored_0 = n << n ^ (--3 << (1 ^ 3) ^ --3);
        int n5 = (--2 ^ --5) << --4 ^ --4 << --1;
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

    public static List<class_2338> ALLATORIxDEMO(double IiIIiIiiiI) {
        double d;
        class_243 class_2432 = class_310.getInstance().player.getEyePos();
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        double d2 = d = class_2432.getX() - IiIIiIiiiI;
        while (d2 < class_2432.getX() + IiIIiIiiiI) {
            double d3 = class_2432.getZ() - IiIIiIiiiI;
            while (d3 < class_2432.getZ() + IiIIiIiiiI) {
                double d4;
                double d5 = class_2432.getY() - IiIIiIiiiI;
                while (d5 < class_2432.getY() + IiIIiIiiiI) {
                    double d6;
                    class_2338 class_23382 = new class_2338(class_3532.floor((double)d), class_3532.floor((double)d6), class_3532.floor((double)d4));
                    if (!(class_23382.toCenterPos().distanceTo(class_2432) > IiIIiIiiiI) && !arrayList.contains(class_23382)) {
                        arrayList.add(class_23382);
                    }
                    d5 = d6 + 1.0;
                }
                d3 = d4 + 1.0;
            }
            d2 = d + 1.0;
        }
        return arrayList;
    }

    public static double ALLATORIxDEMO(class_2338 class_23382, class_2338 class_23383) {
        class_2338 IiIIiIiiiI;
        class_2338 IiIIiIiiiI2 = class_23383;
        class_2338 class_23384 = IiIIiIiiiI = class_23382;
        double d = class_23384.getX() - IiIIiIiiiI2.getX();
        double d2 = class_23384.getY() - IiIIiIiiiI2.getY();
        double d3 = class_23384.getZ() - IiIIiIiiiI2.getZ();
        double d4 = d;
        double d5 = d2;
        double d6 = d3;
        return class_3532.sqrt((float)((float)(d4 * d4 + d5 * d5 + d6 * d6)));
    }

    /*
     * WARNING - void declaration
     */
    public static List<class_2338> ALLATORIxDEMO(class_2338 class_23382, int n, int n2) {
        int n3;
        int IiIIiIiiiI = n;
        class_2338 IiIIiIiiiI2 = class_23382;
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        int n4 = n3 = IiIIiIiiiI2.getX() - IiIIiIiiiI;
        while (n4 < IiIIiIiiiI2.getX() + IiIIiIiiiI) {
            void IiIIiIiiiI3;
            int n5 = IiIIiIiiiI2.getY() - IiIIiIiiiI3;
            while (n5 < IiIIiIiiiI2.getY() + IiIIiIiiiI3) {
                int n6;
                int n7 = IiIIiIiiiI2.getZ() - IiIIiIiiiI;
                while (n7 < IiIIiIiiiI2.getZ() + IiIIiIiiiI) {
                    int n8;
                    class_2338 class_23383 = new class_2338(n3, n6, n8);
                    if (IiiIiIIIIi.ALLATORIxDEMO(IiIIiIiiiI2, class_23383) <= (double)IiIIiIiiiI && !arrayList.contains(class_23383)) {
                        arrayList.add(class_23383);
                    }
                    n7 = ++n8;
                }
                n5 = ++n6;
            }
            n4 = ++n3;
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean ALLATORIxDEMO(class_2338 class_23382, FindItemResult findItemResult, boolean bl) {
        void IiIIiIiiiI;
        Object IiIIiIiiiI2 = findItemResult;
        class_2338 IiIIiIiiiI3 = class_23382;
        if (!IiIIiIiiiI2.found()) {
            return (2 & 5) != 0;
        }
        IiIIiIiiiI2 = () -> IiiIiIIIIi.ALLATORIxDEMO((FindItemResult)IiIIiIiiiI2, IiIIiIiiiI3);
        if (IiIIiIiiiI != false) {
            Rotations.rotate((double)Rotations.getYaw((class_2338)IiIIiIiiiI3), (double)Rotations.getPitch((class_2338)IiIIiIiiiI3), (int)(0xFFFFFFDF & 0xFFFFFFBC), (Runnable)IiIIiIiiiI2);
        } else {
            IiIIiIiiiI2.run();
        }
        return true;
    }

    public IiiIiIIIIi() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(FindItemResult findItemResult, class_2338 class_23382) {
        void IiIIiIiiiI;
        FindItemResult findItemResult2 = findItemResult;
        boolean IiIIiIiiiI2 = MeteorClient.mc.player.isSneaking();
        MeteorClient.mc.player.setSneaking(3 >> 2);
        InvUtils.swap((int)findItemResult2.slot(), (boolean)(5 >> 2));
        MeteorClient.mc.interactionManager.interactBlock(MeteorClient.mc.player, class_1268.MAIN_HAND, new class_3965(class_243.ofCenter((class_2382)IiIIiIiiiI), class_2350.UP, (class_2338)IiIIiIiiiI, (3 ^ 3) != 0));
        MeteorClient.mc.player.swingHand(class_1268.MAIN_HAND);
        InvUtils.swapBack();
        MeteorClient.mc.player.setSneaking(IiIIiIiiiI2);
    }
}

