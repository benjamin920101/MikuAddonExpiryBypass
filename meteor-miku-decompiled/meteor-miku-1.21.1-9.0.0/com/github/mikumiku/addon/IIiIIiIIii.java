/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Items
 *  net.minecraft.block.BedBlock
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.CobwebBlock
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIiiIiiiII;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.mixinface.MoveEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.block.BedBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.CobwebBlock;

public class IIiIIiIIii
extends iiiiIiIiii {
    private final Setting<Boolean> iiIIiiIiii;
    private final SettingGroup iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private final Setting<Double> iiIiIIiIIi;
    private class_2338 IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private final Setting<Double> iiiiiIIiiI;
    private final Setting<Boolean> iiIIIIiIII;
    private final Setting<Boolean> IiIIiIiiiI;
    private class_2338 ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IIiIIiIIii IiIIiIiiiI;
        IIiIIiIIii iIiIIiIIii = iIiIIiIIii2;
        IIiIIiIIii iIiIIiIIii2 = pre;
        IIiIIiIIii iIiIIiIIii3 = IiIIiIiiiI = iIiIIiIIii;
        iIiIIiIIii2 = iIiIIiIIii3.ALLATORIxDEMO((Double)iIiIIiIIii3.iiIiIIiIIi.get());
        if (iIiIIiIIii2 == null) {
            return;
        }
        IiIIiIiiiI.ALLATORIxDEMO((class_1657)iIiIIiIIii2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean iiIiiiiiII(class_2338 class_23382) {
        void IiIIiIiiiI;
        IIiIIiIIii iIiIIiIIii;
        IIiIIiIIii iIiIIiIIii2 = iIiIIiIIii = iIiIIiIIii3;
        class_2248 class_22482 = iIiIIiIIii2.iiIIIIiIII.world.getBlockState((class_2338)IiIIiIiiiI).getBlock();
        IIiIIiIIii iIiIIiIIii3 = iIiIIiIIii2.iiIIIIiIII.world.getBlockState(IiIIiIiiiI.up()).getBlock();
        if (iIiIIiIIii2.ALLATORIxDEMO(class_22482) || class_22482 instanceof class_2244 || class_22482 instanceof class_2560) {
            return false;
        }
        if (iIiIIiIIii.ALLATORIxDEMO((class_2248)iIiIIiIIii3) || iIiIIiIIii3 instanceof class_2244 || iIiIIiIIii3 instanceof class_2560) {
            return false;
        }
        return iIiIIiIIii.ALLATORIxDEMO((class_2338)IiIIiIiiiI, 3 >> 1);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1657 class_16572) {
        int n;
        int n2;
        void IiIIiIiiiI;
        IIiIIiIIii object2;
        IIiIIiIIii iIiIIiIIii = object2;
        class_2338 class_23383 = IiIIiIiiiI.getBlockPos();
        double[] dArray = new double[--3];
        dArray[2 & 5] = -0.8;
        dArray[4 ^ 5] = 0.5;
        dArray[--2] = 1.1;
        double[] dArray2 = dArray;
        double[] dArray3 = new double[1 ^ 3];
        dArray3[3 & 4] = 0.3;
        dArray3[2 ^ 3] = -0.3;
        double[] dArray4 = dArray3;
        IIiIIiIIii iIiIIiIIii2 = iIiIIiIIii;
        for (class_1657 this3222 : iIiIIiIIii2.ALLATORIxDEMO((Double)iIiIIiIIii2.iiIiIIiIIi.get())) {
            double[] dArray5 = dArray2;
            n2 = dArray2.length;
            int n3 = 3 ^ 3;
            while (n3 < n2) {
                int n4;
                double d = dArray5[n4];
                double[] dArray6 = dArray4;
                int n5 = dArray4.length;
                int n6 = 2 & 5;
                while (n6 < n5) {
                    int n7;
                    double d2 = dArray6[n7];
                    double[] dArray7 = dArray4;
                    int n8 = dArray4.length;
                    int n9 = 2 & 5;
                    while (n9 < n8) {
                        int n10;
                        double d3 = dArray7[n10];
                        class_2338 class_23384 = new class_2338((int)(this3222.getX() + d2), (int)(this3222.getY() + d), (int)(this3222.getZ() + d3));
                        if (iIiIIiIIii.ALLATORIxDEMO(class_23384) && class_23384.equals((Object)iIiIIiIIii.IIIIiIiiIi)) {
                            return;
                        }
                        n9 = ++n10;
                    }
                    n6 = ++n7;
                }
                n3 = ++n4;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (((Boolean)iIiIIiIIii.IiIiIIIIiI.get()).booleanValue()) {
            arrayList.add(-0.8);
        }
        if (((Boolean)iIiIIiIIii.iiIIIIiIII.get()).booleanValue()) {
            arrayList.add(0.5);
        }
        if (((Boolean)iIiIIiIIii.iIIiiIIIII.get()).booleanValue()) {
            arrayList.add(1.1);
        }
        Iterator this3222 = arrayList.iterator();
        while (this3222.hasNext()) {
            double d = (Double)this3222.next();
            double[] dArray8 = dArray4;
            int n11 = dArray4.length;
            int n12 = 5 >> 3;
            while (n12 < n11) {
                double d4 = dArray8[n];
                class_2338 class_23385 = new class_2338((int)(IiIIiIiiiI.getX() + d4), (int)(IiIIiIiiiI.getY() + d), (int)(IiIIiIiiiI.getZ() + d4));
                if (iIiIIiIIii.ALLATORIxDEMO(class_23385)) {
                    iIiIIiIIii.ALLATORIxDEMO(class_23385);
                    return;
                }
                n12 = ++n;
            }
        }
        this3222 = arrayList.iterator();
        while (this3222.hasNext()) {
            double d = (Double)this3222.next();
            double[] dArray9 = dArray4;
            int n13 = dArray4.length;
            int n14 = 5 >> 3;
            while (n14 < n13) {
                double d5 = dArray9[n];
                double[] dArray10 = dArray4;
                int n15 = dArray4.length;
                int n16 = 3 & 4;
                while (n16 < n15) {
                    int n17;
                    double d6 = dArray10[n17];
                    class_2338 class_23386 = new class_2338((int)(IiIIiIiiiI.getX() + d6), (int)(IiIIiIiiiI.getY() + d), (int)(IiIIiIiiiI.getZ() + d5));
                    if (iIiIIiIIii.ALLATORIxDEMO(class_23386)) {
                        iIiIIiIIii.ALLATORIxDEMO(class_23386);
                        return;
                    }
                    n16 = ++n17;
                }
                n14 = ++n;
            }
        }
        if (((Boolean)iIiIIiIIii.IiIIiIiiiI.get()).booleanValue()) {
            if (!((Boolean)iIiIIiIIii.iiIIiiIiii.get()).booleanValue()) {
                int n18;
                class_2350[] this3222 = class_2350.values();
                int n19 = this3222.length;
                int n20 = n2 = 3 & 4;
                while (n20 < n19) {
                    class_2338 class_23387;
                    class_2350 class_23502 = this3222[n2];
                    if (class_23502 != class_2350.UP && class_23502 != class_2350.DOWN && !(iIiIIiIIii.ALLATORIxDEMO(class_23387 = class_23383.offset(class_23502)) > (Double)iIiIIiIIii.iiiiiIIiiI.get()) && (iIiIIiIIii.iiIIIIiIII.world.isAir(class_23387) || class_23387.equals((Object)iIiIIiIIii.IIIIiIiiIi))) {
                        if (iIiIIiIIii.ALLATORIxDEMO(class_23387, 3 >> 2)) {
                            return;
                        }
                    }
                    n20 = ++n2;
                }
                ArrayList<class_2338> this3222 = new ArrayList<class_2338>();
                class_2338 class_23388 = class_2350.values();
                n2 = ((class_2350[])class_23388).length;
                int n21 = n18 = 2 & 5;
                while (n21 < n2) {
                    class_2338 class_23389;
                    class_2350 class_23503 = class_23388[n18];
                    if (class_23503 != class_2350.UP && class_23503 != class_2350.DOWN && !(iIiIIiIIii.ALLATORIxDEMO(class_23389 = class_23383.offset(class_23503)) > (Double)iIiIIiIIii.iiiiiIIiiI.get()) && iIiIIiIIii.ALLATORIxDEMO(class_23389)) {
                        if (iIiIIiIIii.ALLATORIxDEMO(class_23389, 5 >> 2)) {
                            this3222.add(class_23389);
                        }
                    }
                    n21 = ++n18;
                }
                if (!this3222.isEmpty()) {
                    class_23388 = this3222.stream().min(Comparator.comparingDouble(class_23382 -> {
                        IIiIIiIIii iIiIIiIIii = iIiIIiIIii2;
                        IIiIIiIIii iIiIIiIIii2 = class_23382;
                        IIiIIiIIii IiIIiIiiiI = iIiIIiIIii;
                        class_243 class_2432 = IiIIiIiiiI.iiIIIIiIII.player.getEyePos();
                        iIiIIiIIii2 = class_243.ofCenter((class_2382)iIiIIiIIii2);
                        return Math.sqrt(class_2432.squaredDistanceTo((class_243)iIiIIiIIii2));
                    })).orElse(null);
                    if (class_23388 != null) {
                        iIiIIiIIii.ALLATORIxDEMO(class_23388);
                    }
                } else {
                    this3222.clear();
                    class_23388 = class_2350.values();
                    n2 = ((class_2350[])class_23388).length;
                    int n22 = n18 = 2 & 5;
                    while (n22 < n2) {
                        class_2338 class_233810;
                        class_2338 class_233811 = class_23388[n18];
                        if (class_233811 != class_2350.UP && class_233811 != class_2350.DOWN && !(iIiIIiIIii.ALLATORIxDEMO(class_233810 = class_23383.offset((class_2350)class_233811)) > (Double)iIiIIiIIii.iiiiiIIiiI.get()) && iIiIIiIIii.ALLATORIxDEMO(class_233810)) {
                            if (iIiIIiIIii.ALLATORIxDEMO(class_233810, (3 & 4) != 0)) {
                                this3222.add(class_233810);
                            }
                        }
                        n22 = ++n18;
                    }
                    if (!this3222.isEmpty() && (class_23388 = (class_2338)this3222.stream().min(Comparator.comparingDouble(class_23382 -> {
                        IIiIIiIIii iIiIIiIIii = iIiIIiIIii2;
                        IIiIIiIIii iIiIIiIIii2 = class_23382;
                        IIiIIiIIii IiIIiIiiiI = iIiIIiIIii;
                        class_243 class_2432 = IiIIiIiiiI.iiIIIIiIII.player.getEyePos();
                        iIiIIiIIii2 = class_243.ofCenter((class_2382)iIiIIiIIii2);
                        return Math.sqrt(class_2432.squaredDistanceTo((class_243)iIiIIiIIii2));
                    })).orElse(null)) != null) {
                        iIiIIiIIii.ALLATORIxDEMO(class_23388);
                    }
                }
            } else {
                int n23;
                class_2350[] this3222 = class_2350.values();
                int n24 = this3222.length;
                int n25 = n2 = 3 & 4;
                while (n25 < n24) {
                    class_2338 class_233812;
                    class_2350 class_23504 = this3222[n2];
                    if (class_23504 != class_2350.UP && class_23504 != class_2350.DOWN && !(iIiIIiIIii.ALLATORIxDEMO(class_233812 = class_23383.offset(class_23504)) > (Double)iIiIIiIIii.iiiiiIIiiI.get()) && iIiIIiIIii.iiIIIIiIII.world.isAir(class_233812) && iIiIIiIIii.iiIIIIiIII.world.isAir(class_233812.up())) {
                        if (iIiIIiIIii.ALLATORIxDEMO(class_233812, 5 >> 3)) {
                            return;
                        }
                    }
                    n25 = ++n2;
                }
                ArrayList<class_2338> this3222 = new ArrayList<class_2338>();
                class_2350[] class_2350Array = class_2350.values();
                n2 = class_2350Array.length;
                int n26 = n23 = 5 >> 3;
                while (n26 < n2) {
                    class_2338 class_233813;
                    class_2350 class_23505 = class_2350Array[n23];
                    if (class_23505 != class_2350.UP && class_23505 != class_2350.DOWN && !(iIiIIiIIii.ALLATORIxDEMO(class_233813 = class_23383.offset(class_23505)) > (Double)iIiIIiIIii.iiiiiIIiiI.get()) && iIiIIiIIii.iiIiiiiiII(class_233813)) {
                        this3222.add(class_233813);
                    }
                    n26 = ++n23;
                }
                int n27 = 0;
                class_2338 class_233814 = null;
                for (class_2338 class_233815 : this3222) {
                    int n28 = iIiIIiIIii.ALLATORIxDEMO(class_233815);
                    if (n28 < n27) continue;
                    n27 = n28;
                    class_233814 = class_233815;
                }
                if (class_233814 != null) {
                    iIiIIiIIii.IiiiiiiIIi(class_233814);
                }
            }
        }
        if (iIiIIiIIii.IIIIiIiiIi == null && ((Boolean)iIiIIiIIii.iiIIIIiIII.get()).booleanValue()) {
            int n29;
            double[] dArray11 = new double[--3];
            dArray11[3 & 4] = 0.0;
            dArray11[2 ^ 3] = 0.3;
            dArray11[--2] = -0.3;
            double[] this3222 = dArray11;
            double[] dArray12 = new double[1 ^ 3];
            dArray12[3 ^ 3] = 0.5;
            dArray12[--1] = 1.1;
            double[] dArray13 = dArray12;
            double[] dArray14 = dArray12;
            int n30 = dArray14.length;
            int n31 = n29 = 5 >> 3;
            while (n31 < n30) {
                double d = dArray14[n29];
                double[] dArray15 = this3222;
                int n32 = this3222.length;
                int n33 = 5 >> 3;
                while (n33 < n32) {
                    int n34;
                    double d7 = dArray15[n34];
                    class_2338 class_233816 = new class_2338((int)(IiIIiIiiiI.getX() + d7), (int)(IiIIiIiiiI.getY() + d), (int)(IiIIiIiiiI.getZ() + d7));
                    if (iIiIIiIIii.IiiIIIIiiI(class_233816)) {
                        iIiIIiIIii.ALLATORIxDEMO(class_233816);
                        return;
                    }
                    n33 = ++n34;
                }
                n31 = ++n29;
            }
            dArray14 = dArray13;
            n30 = dArray13.length;
            int n35 = n29 = 5 >> 3;
            while (n35 < n30) {
                double d = dArray14[n29];
                double[] dArray16 = this3222;
                int n36 = this3222.length;
                int n37 = 5 >> 3;
                while (n37 < n36) {
                    int n38;
                    double d8 = dArray16[n38];
                    double[] dArray17 = this3222;
                    int n39 = this3222.length;
                    int n40 = 2 & 5;
                    while (n40 < n39) {
                        int n41;
                        double d9 = dArray17[n41];
                        class_23383 = new class_2338((int)(IiIIiIiiiI.getX() + d9), (int)(IiIIiIiiiI.getY() + d), (int)(IiIIiIiiiI.getZ() + d8));
                        if (iIiIIiIIii.IiiIIIIiiI(class_23383)) {
                            iIiIIiIIii.ALLATORIxDEMO(class_23383);
                            return;
                        }
                        n40 = ++n41;
                    }
                    n37 = ++n38;
                }
                n35 = ++n29;
            }
        }
    }

    private /* synthetic */ void IiiiiiiIIi(class_2338 class_23382) {
        IIiIIiIIii IiIIiIiiiI;
        IIiIIiIIii iIiIIiIIii = iIiIIiIIii2;
        IIiIIiIIii iIiIIiIIii2 = class_23382;
        IIiIIiIIii iIiIIiIIii3 = IiIIiIiiiI = iIiIIiIIii;
        if (IiIIiIiiiI.ALLATORIxDEMO((class_2338)iIiIIiIIii2)) {
            iIiIIiIIii3.ALLATORIxDEMO((class_2338)iIiIIiIIii2);
            return;
        }
        if (iIiIIiIIii3.ALLATORIxDEMO(iIiIIiIIii2.up())) {
            IiIIiIiiiI.ALLATORIxDEMO(iIiIIiIIii2.up());
        }
    }

    public IIiIIiIIii() {
        IIiIIiIIii iIiIIiIIii = this;
        super(iiiiIiIiii.ALLATORIxDEMO, com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u630f\u8151"), MoveEvent.ALLATORIxDEMO("\u81a7\u52e2\u7872\u570e\u650b\u4efa\u546f\u56f4\u76e4\u9655\u62c4\u65de\u5717\uff4b\u5365\u628b\u94db\u5757\u3041\u9725\u9088\u54eb\u5694\u57a9\u9e91\u669b\u77b3\u3045"));
        iIiIIiIIii.iIiiIiiiII = iIiIIiIIii.settings.getDefaultGroup();
        iIiIIiIIii.iiIIIIiIII = iIiIIiIIii.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u94a2\u577b\u782d\u5704"))).description(MoveEvent.ALLATORIxDEMO("\u7853\u570f\u650b\u4eda\u94dc\u5750\u6591\u76c4\u65fe\u5717\u3045"))).defaultValue((Object)(3 >> 1))).build());
        this.iIIiiIIIII = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u977b\u90a3\u782d\u5704"))).description(MoveEvent.ALLATORIxDEMO("\u7854\u5728\u650c\u4efd\u9702\u908f\u9ab8\u5ec1\u76c4\u65fe\u5717\u3045"))).defaultValue((Object)(3 >> 1))).build());
        this.IiIIiIiiiI = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u56ed\u8151\u782d\u5704"))).description(MoveEvent.ALLATORIxDEMO("\u7853\u570f\u650b\u4eda\u540f\u5694\u76e3\u9e91\u669b\u77b3\u3045"))).defaultValue((Object)(5 >> 2))).build());
        this.IiIiIIIIiI = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u8103\u4e40\u782d\u5704"))).description(MoveEvent.ALLATORIxDEMO("\u7874\u5708\u652c\u4edd\u817a\u4e6c\u76c4\u65fe\u5717\u3045"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iiIIiiIiii = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\bE(y\u6a38\u5f44"))).description(MoveEvent.ALLATORIxDEMO("\u4f1f\u754f`vNVRG\u7208\u676b\u76e4\u6c53\u6616\u6559\u7f2e\u8983\u5259\u3045"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iiIiIIiIIi = this.iIiiIiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u76f7\u684c\u831a\u56bf"))).description(MoveEvent.ALLATORIxDEMO("\u647c\u7d45\u768e\u6860\u76c4\u8344\u56b4\u3045"))).defaultValue(5.0).min(1.0).max(8.0).sliderMax(8.0).build());
        this.iiiiiIIiiI = this.iIiiIiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u630f\u63d3\u831a\u56bf"))).description(MoveEvent.ALLATORIxDEMO("\u6356\u63df\u65d9\u5730\u76e4\u6767\u5967\u8344\u56b4\u3045"))).defaultValue(5.0).min(1.0).max(8.0).sliderMax(8.0).build());
        IIiIIiIIii iIiIIiIIii2 = this;
        iIiIIiIIii2.IIIIiIiiIi = null;
        iIiIIiIIii2.ALLATORIxDEMO = null;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("N ;mJ\u000e\u0019\u001ei/X\u001f\\J9\u8bbc\u66cd\u65db\u5209\u676b\u65a9\u7203\u6735\uff4a"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 object) {
        void IiIIiIiiiI;
        IIiIIiIIii iIiIIiIIii = iIiIIiIIii2;
        IIiIIiIIii iIiIIiIIii2 = object;
        object = iIiIIiIIii;
        IiIIiIiiiI.IIIIiIiiIi = iIiIIiIIii2;
        BlockUtils.breakBlock((class_2338)IiIIiIiiiI.IIIIiIiiIi, (2 & 5) != 0);
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2248 class_22482) {
        IIiIIiIIii iIiIIiIIii = iIiIIiIIii2;
        IIiIIiIIii iIiIIiIIii2 = class_22482;
        IIiIIiIIii IiIIiIiiiI = iIiIIiIIii;
        if (iIiIIiIIii2 == class_2246.BEDROCK || iIiIIiIIii2 == class_2246.COMMAND_BLOCK || iIiIIiIIii2 == class_2246.BARRIER || iIiIIiIIii2 == class_2246.END_PORTAL_FRAME) {
            return true;
        }
        return false;
    }

    private /* synthetic */ class_1657 ALLATORIxDEMO(double d) {
        IIiIIiIIii iIiIIiIIii = iIiIIiIIii3;
        IIiIIiIIii iIiIIiIIii2 = null;
        Iterator iterator = iIiIIiIIii.iiIIIIiIII.world.getPlayers().iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                double IiIIiIiiiI;
                double d2;
                IIiIIiIIii iIiIIiIIii3 = (class_1657)iterator.next();
                if (iIiIIiIIii3 == iIiIIiIIii.iiIIIIiIII.player || iIiIIiIIii3.isDead()) continue block0;
                if (iIiIIiIIii3.getHealth() <= 0.0f) {
                    iterator2 = iterator;
                    continue;
                }
                double d3 = iIiIIiIIii.iiIIIIiIII.player.distanceTo((class_1297)iIiIIiIIii3);
                if (!(d2 < IiIIiIiiiI)) continue block0;
                IiIIiIiiiI = d3;
                iIiIIiIIii2 = iIiIIiIIii3;
                continue block0;
            }
            break;
        }
        return iIiIIiIIii2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ List<class_1657> ALLATORIxDEMO(double d) {
        IIiIIiIIii iIiIIiIIii = iIiIIiIIii2;
        ArrayList<class_1657> arrayList = new ArrayList<class_1657>();
        Iterator iterator = iIiIIiIIii.iiIIIIiIII.world.getPlayers().iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                void IiIIiIiiiI;
                IIiIIiIIii iIiIIiIIii2 = (class_1657)iterator.next();
                if (iIiIIiIIii2 == iIiIIiIIii.iiIIIIiIII.player || iIiIIiIIii2.isDead()) continue block0;
                if (iIiIIiIIii2.getHealth() <= 0.0f) {
                    iterator2 = iterator;
                    continue;
                }
                if (!((double)iIiIIiIIii.iiIIIIiIII.player.distanceTo((class_1297)iIiIIiIIii2) <= IiIIiIiiiI)) continue block0;
                arrayList.add((class_1657)iIiIIiIIii2);
                continue block0;
            }
            break;
        }
        return arrayList;
    }

    private /* synthetic */ boolean IiiIIIIiiI(class_2338 class_23382) {
        IIiIIiIIii iIiIIiIIii = iIiIIiIIii2;
        IIiIIiIIii IiIIiIiiiI = iIiIIiIIii;
        IIiIIiIIii iIiIIiIIii2 = class_23382;
        if (IiIIiIiiiI.ALLATORIxDEMO((class_2338)iIiIIiIIii2) > (Double)IiIIiIiiiI.iiiiiIIiiI.get()) {
            return 3 >> 2;
        }
        if ((iIiIIiIIii2 = IiIIiIiiiI.iiIIIIiIII.world.getBlockState((class_2338)iIiIIiIIii2).getBlock()) == class_2246.OBSIDIAN || iIiIIiIIii2 == class_2246.ENDER_CHEST || iIiIIiIIii2 == class_2246.NETHERITE_BLOCK || iIiIIiIIii2 == class_2246.RESPAWN_ANCHOR) {
            return true;
        }
        return false;
    }

    private /* synthetic */ boolean IiiiiiiIIi(class_2338 class_23382) {
        IIiIIiIIii iIiIIiIIii = iIiIIiIIii2;
        IIiIIiIIii iIiIIiIIii2 = class_23382;
        IIiIIiIIii IiIIiIiiiI2 = iIiIIiIIii;
        return IiIIiIiiiI2.iiIIIIiIII.world.getOtherEntities(null, new class_238((class_2338)iIiIIiIIii2)).stream().anyMatch(IiIIiIiiiI -> {
            if (!IiIIiIiiiI.isSpectator()) {
                return (2 ^ 3) != 0;
            }
            return false;
        });
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int ALLATORIxDEMO(class_2338 class_23382) {
        void IiIIiIiiiI;
        IIiIIiIIii iIiIIiIIii = this;
        int n = 3 & 4;
        if (!iIiIIiIIii.ALLATORIxDEMO((class_2338)IiIIiIiiiI)) {
            ++n;
        }
        if (!iIiIIiIIii.ALLATORIxDEMO(IiIIiIiiiI.up())) {
            ++n;
        }
        return n;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, boolean bl) {
        int IiIIiIiiiI;
        IIiIIiIIii iIiIIiIIii = iIiIIiIIii2;
        IIiIIiIIii iIiIIiIIii2 = class_23382;
        IIiIIiIIii IiIIiIiiiI2 = iIiIIiIIii;
        iIiIIiIIii2 = iIiIIiIIii2.down();
        class_2338 class_23383 = iIiIIiIIii2.up();
        boolean bl2 = (iIiIIiIIii2 = IiIIiIiiiI2.iiIIIIiIII.world.getBlockState((class_2338)iIiIIiIIii2).getBlock()) == class_2246.BEDROCK || iIiIIiIIii2 == class_2246.OBSIDIAN || IiIIiIiiiI == 0;
        int this2 = !IiIIiIiiiI2.IiiiiiiIIi(class_23383) ? 2 ^ 3 : 0;
        IiIIiIiiiI = !IiIIiIiiiI2.IiiiiiiIIi(class_23383.up()) ? --1 : 0;
        boolean bl3 = !((Boolean)IiIIiIiiiI2.iiIIiiIiii.get()).booleanValue() || IiIIiIiiiI2.iiIIIIiIII.world.isAir(class_23383.up());
        if (bl2 && this2 != 0 && IiIIiIiiiI != 0 && bl3) {
            return (3 & 5) != 0;
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        IIiIIiIIii IiIIiIiiiI = this;
        if (!IiIIiIiiiI.IiiIIIIiiI((class_2338)(this = class_23382))) {
            return 5 >> 3;
        }
        if (this.equals(IiIIiIiiiI.ALLATORIxDEMO) && Set.of(class_1802.WOODEN_PICKAXE, class_1802.STONE_PICKAXE, class_1802.IRON_PICKAXE, class_1802.GOLDEN_PICKAXE, class_1802.DIAMOND_PICKAXE, class_1802.NETHERITE_PICKAXE).contains(IiIIiIiiiI.iiIIIIiIII.player.getMainHandStack().getItem())) {
            return 3 >> 2;
        }
        return true;
    }
}

