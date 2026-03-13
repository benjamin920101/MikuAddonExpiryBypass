/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.block.BeetrootsBlock
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.CropBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.block.NetherWartBlock
 *  net.minecraft.block.BlockState
 *  net.minecraft.state.property.Properties
 *  net.minecraft.state.property.Property
 *  net.minecraft.fluid.Fluid
 *  net.minecraft.fluid.Fluids
 *  net.minecraft.block.AbstractPlantStemBlock
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiIiiIIiIi;
import com.github.mikumiku.addon.IiiIiIIIIi;
import com.github.mikumiku.addon.iIiIiIiIIi;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.FarmHelper;
import com.github.mikumiku.addon.util.BaritoneUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.block.BeetrootsBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.NetherWartBlock;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.block.AbstractPlantStemBlock;

public class iIIIiIiiII
extends iiiiIiIiii {
    private int IiiiiIIiiI;
    private final Setting<SettingColor> iIiiIIIIii;
    private final SettingGroup IIIIiIiIIi;
    private final Setting<Integer> IiiiiIIIIi;
    private Map<class_2338, Integer> iiIiIiIiiI;
    private Map<class_1792, Integer> IiiIiIIIiI;
    private final SettingGroup IiIiiIIiii;
    private int iIiIiIIiiI;
    private static final long IIIiIIiiIi = 1000L;
    private long IiIiiIIiiI;
    private final Setting<Integer> iIIIIiiiii;
    private final Setting<Boolean> IiIiIIIiiI;
    private final Setting<Boolean> iIIIIiiiIi;
    private final Setting<Boolean> iiIIiiIiIi;
    private final SettingGroup IiiIIiIiIi;
    private final Setting<SettingColor> iiiiIiiIIi;
    private final Setting<Boolean> iiIIiIiiIi;
    private final Setting<SettingColor> IiIiiiiIIi;
    private static final long iiIIiIiiII = 5000L;
    private long IIiIiiIiIi;
    private final Setting<SettingColor> IIiIIiIIii;
    private final Setting<SettingColor> iIiiIiiiii;
    private final Setting<Integer> iIiIiiIiiI;
    private final Setting<FarmHelper.SortMode> IIiiiiiiII;
    private Map<class_1792, Integer> IIiiiIIIIi;
    private final Setting<Integer> IIIiIIIiII;
    private final Setting<FarmHelper.CropType> iiIiIiiiiI;
    private final Setting<Boolean> IIiiIiiiII;
    private final Setting<SettingColor> IIIiIiiIIi;
    private int iiiIiIiIIi;
    private int iIiIiIiIii;
    private final Setting<SettingColor> iiiiiIIIii;
    private long iIIiIIiiII;
    private final Setting<Integer> IiiIIiiiiI;
    private int IiIIIIiiii;
    private final Setting<Integer> IiiIIIiiIi;
    private final Setting<Boolean> iiIIiiIiii;
    private Map<class_1792, Integer> iIiiIiiiII;
    private int iIIiiIIIII;
    private final Setting<FarmHelper.WorkMode> iiIiIIiIIi;
    private final Setting<Integer> IIIIiIiiIi;
    private final Setting<ShapeMode> IiIiIIIIiI;
    private final Setting<Integer> iiiiiIIiiI;
    private final Setting<Integer> iiIIIIiIII;
    private final Setting<SettingColor> IiIIiIiiiI;
    private long ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void iIIiiiIiiI(Render3DEvent render3DEvent) {
        void IiIIiIiiiI;
        iIIIiIiiII iIIIiIiiII2 = object;
        if (!((Boolean)iIIIiIiiII2.iIIIIiiiIi.get()).booleanValue() || iIIIiIiiII2.iiIIIIiIII.player == null || iIIIiIiiII2.iiIIIIiIII.world == null) {
            return;
        }
        Object object = (FarmHelper.WorkMode)((Object)iIIIiIiiII2.iiIiIIiIIi.get());
        if (object == FarmHelper.WorkMode.IiIIiIiiiI || object == FarmHelper.WorkMode.IiIiIIIIiI) {
            iIIIiIiiII2.ALLATORIxDEMO((Render3DEvent)IiIIiIiiiI);
        }
        if (object == FarmHelper.WorkMode.IiIIiIiiiI || object == FarmHelper.WorkMode.ALLATORIxDEMO) {
            iIIIiIiiII2.IiiiiiiIIi((Render3DEvent)IiIIiIiiiI);
        }
        if (object == FarmHelper.WorkMode.IiIIiIiiiI || object == FarmHelper.WorkMode.IIIIiIiiIi) {
            iIIIiIiiII2.iiIiiiiiII((Render3DEvent)IiIIiIiiiI);
        }
        if (((Boolean)iIIIiIiiII2.IiIiIIIiiI.get()).booleanValue()) {
            iIIIiIiiII2.IiiIIIIiiI((Render3DEvent)IiIIiIiiiI);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiIiiiiiII(Render3DEvent render3DEvent) {
        iIIIiIiiII iIIIiIiiII3;
        iIIIiIiiII iIIIiIiiII2 = iIIIiIiiII3;
        for (class_2338 this_ : IiiIiIIIIi.ALLATORIxDEMO(iIIIiIiiII2.iiIIIIiIII.player.getBlockPos(), (Integer)iIIIiIiiII2.iiIIIIiIII.get(), 5 >> 1)) {
            void IiIIiIiiiI;
            if (!iIIIiIiiII2.IiiiiiiiII(this_)) continue;
            iIIIiIiiII iIIIiIiiII4 = iIIIiIiiII2;
            iIIIiIiiII4.ALLATORIxDEMO((Render3DEvent)IiIIiIiiiI, this_, (SettingColor)iIIIiIiiII4.iIiiIIIIii.get(), (SettingColor)iIIIiIiiII2.IiIiiiiIIi.get());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void ALLATORIxDEMO() {
        int n;
        iIIIiIiiII iIIIiIiiII2 = cropType;
        long l = System.currentTimeMillis();
        if (l - iIIIiIiiII2.IiIiiIIiiI < 1000L) {
            return;
        }
        iIIIiIiiII iIIIiIiiII3 = iIIIiIiiII2;
        iIIIiIiiII2.IiiIiIIIiI.clear();
        iIIIiIiiII3.IIiiiIIIIi.clear();
        iIIIiIiiII3.iIiiIiiiII.clear();
        iIIIiIiiII3.IiIIIIiiii = -4 >> 2;
        iIIIiIiiII2.iiiIiIiIIi = iIIIiIiiII3.IiIIIIiiii;
        class_1792[] class_1792Array = new class_1792[0x26 & 0x5F];
        class_1792Array[3 & 4] = class_1802.WOODEN_HOE;
        class_1792Array[--1] = class_1802.STONE_HOE;
        class_1792Array[5 >> 1] = class_1802.IRON_HOE;
        class_1792Array[--3] = class_1802.GOLDEN_HOE;
        class_1792Array[--4] = class_1802.DIAMOND_HOE;
        class_1792Array[--5] = class_1802.NETHERITE_HOE;
        for (class_1792 class_17922 : Arrays.asList(class_1792Array)) {
            n = IIIiIiIiii.ALLATORIxDEMO(class_17922);
            if (n == -4 >> 2) continue;
            iIIIiIiiII2.IiiIiIIIiI.put(class_17922, n);
            iIIIiIiiII2.IiIIIIiiii = n;
        }
        FarmHelper.CropType cropType = (FarmHelper.CropType)((Object)iIIIiIiiII2.iiIiIiiiiI.get());
        switch (cropType.ordinal()) {
            case 0: {
                int n2 = IIIiIiIiii.ALLATORIxDEMO(class_1802.WHEAT_SEEDS);
                if (n2 == -4 >> 2) break;
                iIIIiIiiII2.IIiiiIIIIi.put(class_1802.WHEAT_SEEDS, n2);
                break;
            }
            case 1: {
                n = IIIiIiIiii.ALLATORIxDEMO(class_1802.CARROT);
                if (n == -4 >> 2) break;
                iIIIiIiiII2.IIiiiIIIIi.put(class_1802.CARROT, n);
                break;
            }
            case 2: {
                int this_ = IIIiIiIiii.ALLATORIxDEMO(class_1802.POTATO);
                if (this_ == -4 >> 2) break;
                iIIIiIiiII2.IIiiiIIIIi.put(class_1802.POTATO, this_);
                break;
            }
            case 3: {
                int this_ = IIIiIiIiii.ALLATORIxDEMO(class_1802.BEETROOT_SEEDS);
                if (this_ == -4 >> 2) break;
                iIIIiIiiII2.IIiiiIIIIi.put(class_1802.BEETROOT_SEEDS, this_);
                break;
            }
            case 4: {
                int this_ = IIIiIiIiii.ALLATORIxDEMO(class_1802.PUMPKIN_SEEDS);
                if (this_ == -4 >> 2) break;
                iIIIiIiiII2.IIiiiIIIIi.put(class_1802.PUMPKIN_SEEDS, this_);
                break;
            }
            case 5: {
                int this_ = IIIiIiIiii.ALLATORIxDEMO(class_1802.MELON_SEEDS);
                if (this_ == -4 >> 2) break;
                iIIIiIiiII2.IIiiiIIIIi.put(class_1802.MELON_SEEDS, this_);
                break;
            }
            case 6: {
                int this_ = IIIiIiIiii.ALLATORIxDEMO(class_1802.NETHER_WART);
                if (this_ == -4 >> 2) break;
                iIIIiIiiII2.IIiiiIIIIi.put(class_1802.NETHER_WART, this_);
                break;
            }
        }
        int n3 = IIIiIiIiii.ALLATORIxDEMO(class_1802.BONE_MEAL);
        if (n3 != -4 >> 2) {
            iIIIiIiiII2.iIiiIiiiII.put(class_1802.BONE_MEAL, n3);
            iIIIiIiiII2.iiiIiIiIIi = n3;
        }
        iIIIiIiiII2.IiIiiIIiiI = l;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent, class_2338 class_23382, SettingColor settingColor, SettingColor settingColor2) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        iIIIiIiiII iIIIiIiiII2 = iIIIiIiiII3;
        iIIIiIiiII iIIIiIiiII3 = settingColor2;
        iIIIiIiiII IiIIiIiiiI4 = iIIIiIiiII2;
        void v1 = IiIIiIiiiI3;
        double d = v1.getX();
        double d2 = v1.getY();
        double d3 = v1.getZ();
        double d4 = v1.getX() + --1;
        double d5 = v1.getY() + (3 & 5);
        double d6 = v1.getZ() + (3 >> 1);
        IiIIiIiiiI2.renderer.box(d, d2, d3, d4, d5, d6, (Color)IiIIiIiiiI, (Color)iIIIiIiiII3, (ShapeMode)IiIIiIiiiI4.IiIiIIIIiI.get(), 3 & 4);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean iIIiIIiIii(class_2338 class_23382) {
        class_2338 class_23383;
        iIIIiIiiII iIIIiIiiII2 = iIIIiIiiII3;
        iIIIiIiiII iIIIiIiiII3 = class_23382;
        iIIIiIiiII IiIIiIiiiI = iIIIiIiiII2;
        FarmHelper.CropType cropType = (FarmHelper.CropType)((Object)IiIIiIiiiI.iiIiIiiiiI.get());
        if (cropType == FarmHelper.CropType.iiiiiIIiiI) {
            if (!IiIIiIiiiI.ALLATORIxDEMO((class_2338)iIIIiIiiII3)) {
                return (2 & 5) != 0;
            }
        } else if (!IiIIiIiiiI.iIIiiiIiiI((class_2338)iIIIiIiiII3)) {
            return (3 & 4) != 0;
        }
        if (IiIIiIiiiI.iiIIIIiIII.world.getBlockState(class_23383 = iIIIiIiiII3.up()).getBlock() != class_2246.AIR) {
            return (3 ^ 3) != 0;
        }
        if (!iiiIIIIiiI.ALLATORIxDEMO((class_2338)iIIIiIiiII3, class_2350.UP)) {
            return 5 >> 3;
        }
        switch (cropType.ordinal()) {
            case 0: {
                return IiIIiIiiiI.IIiiiIIIIi.containsKey(class_1802.WHEAT_SEEDS);
            }
            case 1: {
                return IiIIiIiiiI.IIiiiIIIIi.containsKey(class_1802.CARROT);
            }
            case 2: {
                return IiIIiIiiiI.IIiiiIIIIi.containsKey(class_1802.POTATO);
            }
            case 3: {
                return IiIIiIiiiI.IIiiiIIIIi.containsKey(class_1802.BEETROOT_SEEDS);
            }
            case 4: {
                return IiIIiIiiiI.IIiiiIIIIi.containsKey(class_1802.PUMPKIN_SEEDS);
            }
            case 5: {
                return IiIIiIiiiI.IIiiiIIIIi.containsKey(class_1802.MELON_SEEDS);
            }
            case 6: {
                return IiIIiIiiiI.IIiiiIIIIi.containsKey(class_1802.NETHER_WART);
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IiiIIIIiiI(Render3DEvent render3DEvent) {
        iIIIiIiiII iIIIiIiiII3;
        iIIIiIiiII iIIIiIiiII2 = iIIIiIiiII3;
        if (iIIIiIiiII2.iIiiIiiiII.isEmpty()) {
            return;
        }
        for (class_2338 this_ : IiiIiIIIIi.ALLATORIxDEMO(iIIIiIiiII2.iiIIIIiIII.player.getBlockPos(), (Integer)iIIIiIiiII2.IiiiiIIIIi.get(), 1 ^ 3)) {
            void IiIIiIiiiI;
            if (!iIIIiIiiII2.IiIiiiIIiI(this_)) continue;
            iIIIiIiiII iIIIiIiiII4 = iIIIiIiiII2;
            iIIIiIiiII4.ALLATORIxDEMO((Render3DEvent)IiIIiIiiiI, this_, (SettingColor)iIIIiIiiII4.IIiIIiIIii.get(), (SettingColor)iIIIiIiiII2.iiiiiIIIii.get());
        }
    }

    @Override
    public void onActivate() {
        iIIIiIiiII iIIIiIiiII2 = this;
        iIIIiIiiII iIIIiIiiII3 = this;
        iIIIiIiiII iIIIiIiiII4 = this;
        super.onActivate();
        this.iIIiiIIIII = 3 >> 2;
        this.iIiIiIiIii = 2 & 5;
        iIIIiIiiII4.iIiIiIIiiI = this.iIiIiIiIii;
        iIIIiIiiII4.IiiiiIIiiI = 3 >> 2;
        iIIIiIiiII iIIIiIiiII5 = this;
        iIIIiIiiII3.IiiIiIIIiI = new HashMap<class_1792, Integer>();
        iIIIiIiiII iIIIiIiiII6 = this;
        iIIIiIiiII5.IIiiiIIIIi = new HashMap<class_1792, Integer>();
        iIIIiIiiII iIIIiIiiII7 = this;
        iIIIiIiiII3.iIiiIiiiII = new HashMap<class_1792, Integer>();
        iIIIiIiiII iIIIiIiiII8 = this;
        iIIIiIiiII2.iiIiIiIiiI = new HashMap<class_2338, Integer>();
        iIIIiIiiII2.IiIiiIIiiI = 0L;
    }

    private /* synthetic */ class_2338 iiIiiiiiII() {
        iIIIiIiiII iIIIiIiiII2 = arrayList;
        ArrayList arrayList = new ArrayList();
        for (class_2338 class_23382 : IiiIiIIIIi.ALLATORIxDEMO(iIIIiIiiII2.iiIIIIiIII.player.getBlockPos(), (Integer)iIIIiIiiII2.iiIIIIiIII.get(), --2)) {
            if (!iIIIiIiiII2.IiiiiiiiII(class_23382)) continue;
            arrayList.add(class_23382);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.sort(Comparator.comparingDouble(PlayerUtils::distanceTo));
        if (iIIIiIiiII2.IIiiiiiiII.get() == FarmHelper.SortMode.IiIIiIiiiI) {
            Collections.reverse(arrayList);
        }
        return (class_2338)arrayList.get(3 ^ 3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean IiIiiiIIiI(class_2338 class_23382) {
        void IiIIiIiiiI;
        iIIIiIiiII iIIIiIiiII2 = iIIIiIiiII3;
        iIIIiIiiII iIIIiIiiII3 = iIIIiIiiII2.iiIIIIiIII.world.getBlockState((class_2338)IiIIiIiiiI).getBlock();
        if ((iIIIiIiiII3 instanceof class_2302 || iIIIiIiiII3 == class_2246.MELON_STEM || iIIIiIiiII3 == class_2246.PUMPKIN_STEM || iIIIiIiiII3 == class_2246.CARROTS || iIIIiIiiII3 == class_2246.POTATOES || iIIIiIiiII3 == class_2246.NETHER_WART || iIIIiIiiII3 == class_2246.BEETROOTS) && !iIIIiIiiII2.iiIiiiiiII((class_2338)IiIIiIiiiI)) {
            if (iIIIiIiiII2.iiIiIiIiiI.getOrDefault(IiIIiIiiiI, 3 & 4) < (Integer)iIIIiIiiII2.iIIIIiiiii.get()) {
                return 3 >> 1;
            }
            return false;
        }
        return false;
    }

    private /* synthetic */ void iiIiiiiiII(class_2338 class_23382) {
        iIIIiIiiII iIIIiIiiII2 = iIIIiIiiII3;
        iIIIiIiiII iIIIiIiiII3 = class_23382;
        iIIIiIiiII IiIIiIiiiI = iIIIiIiiII2;
        if (IiIIiIiiiI.IiIIIIiiii == -4 >> 2) {
            long l = System.currentTimeMillis();
            if (l - IiIIiIiiiI.ALLATORIxDEMO >= 5000L) {
                IiIIiIiiiI.error(iIiIiIiIIi.ALLATORIxDEMO("\u80dd\u533f\u4e1c\u6cbb\u6738\u6264\u5201\u94a1\u77c2\u951e\u6227\u4e11\u755d\u5432\u91c0\u953e"), new Object[5 >> 3]);
                IiIIiIiiiI.ALLATORIxDEMO = l;
            }
            return;
        }
        if (((Boolean)IiIIiIiiiI.IIiiIiiiII.get()).booleanValue()) {
            IIIiIiIiii.ALLATORIxDEMO(IiIIiIiiiI.IiIIIIiiii);
        }
        iiiIIIIiiI.ALLATORIxDEMO((class_2338)iIIIiIiiII3, class_2350.UP, 3 >> 1, class_1268.MAIN_HAND, BaritoneUtil.SwingSide.iiIIIIiIII);
        if (((Boolean)IiIIiIiiiI.IIiiIiiiII.get()).booleanValue()) {
            IIIiIiIiii.ALLATORIxDEMO(IiIIiIiiiI.IiIIIIiiii);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean IiiiiiiiII(class_2338 class_23382) {
        void IiIIiIiiiI;
        iIIIiIiiII iIIIiIiiII2 = iIIIiIiiII3;
        iIIIiIiiII iIIIiIiiII3 = iIIIiIiiII2.iiIIIIiIII.world.getBlockState((class_2338)IiIIiIiiiI).getBlock();
        if (iIIIiIiiII3 instanceof class_2302 || iIIIiIiiII3 == class_2246.MELON || iIIIiIiiII3 == class_2246.PUMPKIN || iIIIiIiiII3 == class_2246.CARROTS || iIIIiIiiII3 == class_2246.POTATOES || iIIIiIiiII3 == class_2246.NETHER_WART || iIIIiIiiII3 == class_2246.BEETROOTS) {
            if (((Boolean)iIIIiIiiII2.iiIIiiIiii.get()).booleanValue()) {
                return iIIIiIiiII2.iiIiiiiiII((class_2338)IiIIiIiiiI);
            }
            return true;
        }
        return false;
    }

    private /* synthetic */ class_2338 IiiIIIIiiI() {
        iIIIiIiiII iIIIiIiiII2 = arrayList;
        if (iIIIiIiiII2.IIiiiIIIIi.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (class_2338 class_23382 : IiiIiIIIIi.ALLATORIxDEMO(iIIIiIiiII2.iiIIIIiIII.player.getBlockPos(), (Integer)iIIIiIiiII2.IiiIIiiiiI.get(), 1 ^ 3)) {
            if (!iIIIiIiiII2.iIIiIIiIii(class_23382)) continue;
            arrayList.add(class_23382);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.sort(Comparator.comparingDouble(PlayerUtils::distanceTo));
        if (iIIIiIiiII2.IIiiiiiiII.get() == FarmHelper.SortMode.IiIIiIiiiI) {
            Collections.reverse(arrayList);
        }
        return (class_2338)arrayList.get(5 >> 3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IiiiiiiIIi(Render3DEvent render3DEvent) {
        iIIIiIiiII iIIIiIiiII3;
        iIIIiIiiII iIIIiIiiII2 = iIIIiIiiII3;
        if (iIIIiIiiII2.IIiiiIIIIi.isEmpty()) {
            return;
        }
        for (class_2338 this_ : IiiIiIIIIi.ALLATORIxDEMO(iIIIiIiiII2.iiIIIIiIII.player.getBlockPos(), (Integer)iIIIiIiiII2.IiiIIiiiiI.get(), 1 ^ 3)) {
            void IiIIiIiiiI;
            if (!iIIIiIiiII2.iIIiIIiIii(this_)) continue;
            iIIIiIiiII iIIIiIiiII4 = iIIIiIiiII2;
            iIIIiIiiII4.ALLATORIxDEMO((Render3DEvent)IiIIiIiiiI, this_.up(), (SettingColor)iIIIiIiiII4.IIIiIiiIIi.get(), (SettingColor)iIIIiIiiII2.IiIIiIiiiI.get());
        }
    }

    private /* synthetic */ void IiiIIIIiiI(class_2338 class_23382) {
        iIIIiIiiII iIIIiIiiII2 = iIIIiIiiII3;
        iIIIiIiiII iIIIiIiiII3 = class_23382;
        iIIIiIiiII IiIIiIiiiI = iIIIiIiiII2;
        if (IiIIiIiiiI.iiiIiIiIIi == -4 >> 2) {
            long l = System.currentTimeMillis();
            if (l - IiIIiIiiiI.iIIiIIiiII >= 5000L) {
                IiIIiIiiiI.error(iIiIiIiIIi.ALLATORIxDEMO("\u80f6\u5314\u4e17\u6c90\u6713\u624f\u522a\u9ab9\u7cb3"), new Object[3 ^ 3]);
                IiIIiIiiiI.iIIiIIiiII = l;
            }
            return;
        }
        if (((Boolean)IiIIiIiiiI.iiIIiiIiIi.get()).booleanValue()) {
            IIIiIiIiii.ALLATORIxDEMO(IiIIiIiiiI.iiiIiIiIIi);
        }
        iiiIIIIiiI.ALLATORIxDEMO((class_2338)iIIIiIiiII3, class_2350.UP, --1 != 0, class_1268.MAIN_HAND, BaritoneUtil.SwingSide.iiIIIIiIII);
        int n = IiIIiIiiiI.iiIiIiIiiI.getOrDefault(iIIIiIiiII3, 3 ^ 3);
        iIIIiIiiII iIIIiIiiII4 = IiIIiIiiiI;
        iIIIiIiiII4.iiIiIiIiiI.put((class_2338)iIIIiIiiII3, n + (3 >> 1));
        if (((Boolean)iIIIiIiiII4.iiIIiiIiIi.get()).booleanValue()) {
            IIIiIiIiii.ALLATORIxDEMO(IiIIiIiiiI.iiiIiIiIIi);
        }
    }

    public static boolean ALLATORIxDEMO(class_2680 class_26802) {
        class_2680 class_26803 = class_26802;
        class_2680 IiIIiIiiiI = class_26803.getBlock();
        if (IiIIiIiiiI == class_2246.WATER || IiIIiIiiiI == class_2246.SEAGRASS || IiIIiIiiiI == class_2246.TALL_SEAGRASS || IiIIiIiiiI == class_2246.KELP || IiIIiIiiiI == class_2246.KELP_PLANT || IiIIiIiiiI == class_2246.BUBBLE_COLUMN || class_26803.getFluidState().isOf((class_3611)class_3612.WATER)) {
            return true;
        }
        if (class_26803.contains((class_2769)class_2741.WATERLOGGED) && ((Boolean)class_26803.get((class_2769)class_2741.WATERLOGGED)).booleanValue()) {
            return --1 != 0;
        }
        return false;
    }

    @EventHandler
    public void ALLATORIxDEMO(TickEvent.Post post) {
        iIIIiIiiII iIIIiIiiII2;
        iIIIiIiiII iIIIiIiiII3;
        iIIIiIiiII iIIIiIiiII4 = iIIIiIiiII3 = iIIIiIiiII2;
        iIIIiIiiII4.iIIiiIIIII -= --1;
        iIIIiIiiII4.iIiIiIiIii -= --1;
        iIIIiIiiII4.iIiIiIIiiI -= --1;
        iIIIiIiiII4.IiiiiIIiiI -= 4 ^ 5;
        iIIIiIiiII4.ALLATORIxDEMO();
        FarmHelper.WorkMode IiIIiIiiiI = (FarmHelper.WorkMode)((Object)iIIIiIiiII4.iiIiIIiIIi.get());
        if ((IiIIiIiiiI == FarmHelper.WorkMode.IiIIiIiiiI || IiIIiIiiiI == FarmHelper.WorkMode.IiIiIIIIiI) && iIIIiIiiII3.iIIiiIIIII <= 0) {
            iIIIiIiiII2 = iIIIiIiiII3.ALLATORIxDEMO();
            if (iIIIiIiiII2 != null) {
                iIIIiIiiII3.iiIiiiiiII((class_2338)iIIIiIiiII2);
            }
            iIIIiIiiII3.iIIiiIIIII = (Integer)iIIIiIiiII3.IiiIIIiiIi.get();
        }
        if ((IiIIiIiiiI == FarmHelper.WorkMode.IiIIiIiiiI || IiIIiIiiiI == FarmHelper.WorkMode.ALLATORIxDEMO) && iIIIiIiiII3.iIiIiIiIii <= 0) {
            iIIIiIiiII2 = iIIIiIiiII3.IiiIIIIiiI();
            if (iIIIiIiiII2 != null) {
                iIIIiIiiII3.ALLATORIxDEMO((class_2338)iIIIiIiiII2);
            }
            iIIIiIiiII3.iIiIiIiIii = (Integer)iIIIiIiiII3.iiiiiIIiiI.get();
        }
        if ((IiIIiIiiiI == FarmHelper.WorkMode.IiIIiIiiiI || IiIIiIiiiI == FarmHelper.WorkMode.IIIIiIiiIi) && iIIIiIiiII3.iIiIiIIiiI <= 0) {
            iIIIiIiiII2 = iIIIiIiiII3.iiIiiiiiII();
            if (iIIIiIiiII2 != null) {
                iIIIiIiiII3.IiiiiiiIIi((class_2338)iIIIiIiiII2);
            }
            iIIIiIiiII3.iIiIiIIiiI = (Integer)iIIIiIiiII3.iIiIiiIiiI.get();
        }
        if (((Boolean)iIIIiIiiII3.IiIiIIIiiI.get()).booleanValue() && iIIIiIiiII3.IiiiiIIiiI <= 0) {
            iIIIiIiiII2 = iIIIiIiiII3.IiiiiiiIIi();
            if (iIIIiIiiII2 != null) {
                iIIIiIiiII3.IiiIIIIiiI((class_2338)iIIIiIiiII2);
            }
            iIIIiIiiII3.IiiiiIIiiI = (Integer)iIIIiIiiII3.IIIIiIiiIi.get();
        }
    }

    private /* synthetic */ class_2338 IiiiiiiIIi() {
        iIIIiIiiII iIIIiIiiII2 = arrayList;
        if (iIIIiIiiII2.iIiiIiiiII.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (class_2338 class_23382 : IiiIiIIIIi.ALLATORIxDEMO(iIIIiIiiII2.iiIIIIiIII.player.getBlockPos(), (Integer)iIIIiIiiII2.IiiiiIIIIi.get(), --2)) {
            if (!iIIIiIiiII2.IiIiiiIIiI(class_23382)) continue;
            arrayList.add(class_23382);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.sort(Comparator.comparingDouble(PlayerUtils::distanceTo));
        if (iIIIiIiiII2.IIiiiiiiII.get() == FarmHelper.SortMode.IiIIiIiiiI) {
            Collections.reverse(arrayList);
        }
        return (class_2338)arrayList.get(3 >> 2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iIIIiIiiII iIIIiIiiII3;
        iIIIiIiiII iIIIiIiiII2 = iIIIiIiiII3;
        if (iIIIiIiiII2.IiiIiIIIiI.isEmpty()) {
            return;
        }
        for (class_2338 this_ : IiiIiIIIIi.ALLATORIxDEMO(iIIIiIiiII2.iiIIIIiIII.player.getBlockPos(), (Integer)iIIIiIiiII2.IIIiIIIiII.get(), 3 >> 1)) {
            void IiIIiIiiiI;
            if (!iIIIiIiiII2.IiiiiiiIIi(this_)) continue;
            iIIIiIiiII iIIIiIiiII4 = iIIIiIiiII2;
            iIIIiIiiII4.ALLATORIxDEMO((Render3DEvent)IiIIiIiiiI, this_, (SettingColor)iIIIiIiiII4.iIiiIiiiii.get(), (SettingColor)iIIIiIiiII2.iiiiIiiIIi.get());
        }
    }

    private /* synthetic */ class_2338 ALLATORIxDEMO() {
        iIIIiIiiII iIIIiIiiII2 = arrayList;
        if (iIIIiIiiII2.IiiIiIIIiI.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (class_2338 class_23382 : IiiIiIIIIi.ALLATORIxDEMO(iIIIiIiiII2.iiIIIIiIII.player.getBlockPos(), (Integer)iIIIiIiiII2.IIIiIIIiII.get(), 5 >> 2)) {
            if (!iIIIiIiiII2.IiiiiiiIIi(class_23382)) continue;
            arrayList.add(class_23382);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.sort(Comparator.comparingDouble(PlayerUtils::distanceTo));
        if (iIIIiIiiII2.IIiiiiiiII.get() == FarmHelper.SortMode.IiIIiIiiiI) {
            Collections.reverse(arrayList);
        }
        return (class_2338)arrayList.get(3 >> 2);
    }

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

