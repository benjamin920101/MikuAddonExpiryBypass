/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BlockListSetting$Builder
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
 *  meteordevelopment.meteorclient.utils.world.Dimension
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIIIiIii;
import com.github.mikumiku.addon.IiiIiIIIIi;
import com.github.mikumiku.addon.iiIIIIIiiI;
import com.github.mikumiku.addon.iiIiIIiiii;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.HighwayClearer;
import com.github.mikumiku.addon.modules.MEnum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BlockListSetting;
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
import meteordevelopment.meteorclient.utils.world.Dimension;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

public class iiiiiiIiiI
extends iiiiIiIiii {
    private final Setting<Integer> iIiIiiIiiI;
    private int IIiiiiiiII;
    private final Setting<Integer> IIiiiIIIIi;
    private final Setting<Integer> IIIiIIIiII;
    private final Setting<HighwayClearer.Direction> iiIiIiiiiI;
    private int IIiiIiiiII;
    private final Setting<Boolean> IIIiIiiIIi;
    private final SettingGroup iiiIiIiIIi;
    private int iIiIiIiIii;
    private final Setting<MEnum.ListMode> iiiiiIIIii;
    private final Setting<SettingColor> iIIiIIiiII;
    private int IiiIIiiiiI;
    private final SettingGroup IiIIIIiiii;
    private final Setting<List<class_2248>> IiiIIIiiIi;
    private List<class_2338> iiIIiiIiii;
    private final Setting<Boolean> iIiiIiiiII;
    private final Setting<List<class_2248>> iIIiiIIIII;
    private int iiIiIIiIIi;
    private final Setting<ShapeMode> IIIIiIiiIi;
    private final Setting<Integer> IiIiIIIIiI;
    private final Setting<SettingColor> iiiiiIIiiI;
    private final Setting<HighwayClearer.SortMode> iiIIIIiIII;
    private final SettingGroup IiIIiIiiiI;
    private final Setting<Boolean> ALLATORIxDEMO;

    @Override
    public void onActivate() {
        iiiiiiIiiI iiiiiiIiiI2 = this;
        iiiiiiIiiI iiiiiiIiiI3 = this;
        super.onActivate();
        this.IIiiIiiiII = 2 & 5;
        iiiiiiIiiI3.IiiIIiiiiI = this.IIiiIiiiII;
        iiiiiiIiiI3.IIiiiiiiII = 3 & 4;
        iiiiiiIiiI2.iIiIiIiIii = -4 >> 2;
        iiiiiiIiiI2.iiIIiiIiii.clear();
        iiiiiiIiiI2.info(iiIiIIiiii.ALLATORIxDEMO("\u9aa3\u900e\u6e7e\u8dde\u805e\u6a30\u572c\u5de3\u5454\u7519\uff5a"), new Object[2 & 5]);
    }

    public void IiiiiiiIIi() {
        this.IIiiIiiiII = 3 >> 2;
        this.info(iiIiIIiiii.ALLATORIxDEMO("\u7ea4\u8bb0\u5d89\u91fc\u7f35"), new Object[5 >> 3]);
    }

    private /* synthetic */ void ALLATORIxDEMO(List<class_2338> list, class_2338 class_23382) {
        iiiiiiIiiI iiiiiiIiiI2;
        iiiiiiIiiI iiiiiiIiiI3 = list2;
        List<class_2338> list2 = list;
        iiiiiiIiiI IiIIiIiiiI = iiiiiiIiiI3;
        if (list2.isEmpty()) {
            return;
        }
        if (IiIIiIiiiI.iiIiIIiIIi == -4 >> 2) {
            list2.sort((arg_0, arg_1) -> iiiiiiIiiI.ALLATORIxDEMO((class_2338)IiIIiIiiiI, arg_0, arg_1));
            iiiiiiIiiI2 = IiIIiIiiiI;
        } else {
            switch (IiIIiIiiiI.iiIiIIiIIi) {
                case 0: 
                case 2: {
                    while (false) {
                    }
                    list2.sort((arg_0, arg_1) -> iiiiiiIiiI.IiiiiiiIIi((class_2338)IiIIiIiiiI, arg_0, arg_1));
                    iiiiiiIiiI2 = IiIIiIiiiI;
                    break;
                }
                case 1: 
                case 3: {
                    list2.sort((arg_0, arg_1) -> iiiiiiIiiI.IiiIIIIiiI((class_2338)IiIIiIiiiI, arg_0, arg_1));
                }
                default: {
                    iiiiiiIiiI2 = IiIIiIiiiI;
                }
            }
        }
        if (iiiiiiIiiI2.iiIIIIiIII.get() == HighwayClearer.SortMode.iiIIIIiIII) {
            Collections.reverse(list2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iiiiiiIiiI iiiiiiIiiI2 = this;
        if (((Boolean)iiiiiiIiiI2.IIIiIiiIIi.get()).booleanValue() && iiiiiiIiiI2.iiIIiiIiii.size() > 0) {
            int n = this = 3 >> 2;
            while (n < iiiiiiIiiI2.iiIIiiIiii.size()) {
                void IiIIiIiiiI;
                double d = iiiiiiIiiI2.iiIIiiIiii.get(this).getX();
                double d2 = iiiiiiIiiI2.iiIIiiIiii.get(this).getY();
                double d3 = iiiiiiIiiI2.iiIIiiIiii.get(this).getZ();
                double d4 = iiiiiiIiiI2.iiIIiiIiii.get(this).getX() + (4 ^ 5);
                double d5 = iiiiiiIiiI2.iiIIiiIiii.get(this).getY() + (3 >> 1);
                double d6 = iiiiiiIiiI2.iiIIiiIiii.get(this).getZ() + (4 ^ 5);
                int n2 = --1;
                IiIIiIiiiI.renderer.box(d, d2, d3, d4, d5, d6, (Color)iiiiiiIiiI2.iIIiIIiiII.get(), (Color)iiiiiiIiiI2.iiiiiIIiiI.get(), (ShapeMode)iiiiiiIiiI2.IIIIiIiiIi.get(), 5 >> 3);
                n = ++this;
            }
        }
    }

    private /* synthetic */ boolean IiiIIIIiiI() {
        if (this.iiIIIIiIII.world == null) {
            return 3 >> 2;
        }
        return PlayerUtils.getDimension().equals((Object)Dimension.Nether);
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        iiiiiiIiiI iiiiiiIiiI2 = iiiiiiIiiI3;
        iiiiiiIiiI iiiiiiIiiI3 = class_23382;
        iiiiiiIiiI IiIIiIiiiI = iiiiiiIiiI2;
        if (iiiiiiIiiI3 == null) {
            return;
        }
        if (IiIIiIiiiI.iiIIiiIiii.contains(iiiiiiIiiI3)) {
            return;
        }
        iiiiiiIiiI iiiiiiIiiI4 = IiIIiIiiiI;
        if (iiiiiiIiiI4.IIiiiiiiII >= (Integer)iiiiiiIiiI4.IIiiiIIIIi.get()) {
            return;
        }
        if (iiIIIIIiiI.ALLATORIxDEMO() >= 5 >> 1) {
            return;
        }
        if (iiiIIIIiiI.ALLATORIxDEMO().distanceTo(iiiiiiIiiI3.toCenterPos()) > (double)((Integer)IiIIiIiiiI.IIIiIIIiII.get()).intValue()) {
            return;
        }
        IiIIiIiiiI.iiIIiiIiii.add((class_2338)iiiiiiIiiI3);
        BlockUtils.breakBlock((class_2338)iiiiiiIiiI3, (4 ^ 5) != 0);
        iiiiiiIiiI iiiiiiIiiI5 = IiIIiIiiiI;
        iiiiiiIiiI5.IIiiiiiiII += --1;
        iiiiiiIiiI5.IIiiIiiiII += --1;
    }

    private /* synthetic */ boolean IiiiiiiIIi(class_2338 class_23382) {
        iiiiiiIiiI iiiiiiIiiI2 = iiiiiiIiiI3;
        iiiiiiIiiI iiiiiiIiiI3 = class_23382;
        iiiiiiIiiI IiIIiIiiiI = iiiiiiIiiI2;
        if ((iiiiiiIiiI3 = IiIIiIiiiI.iiIIIIiIII.world.getBlockState((class_2338)iiiiiiIiiI3).getBlock()) == class_2246.AIR || iiiiiiIiiI3 == class_2246.CAVE_AIR || iiiiiiIiiI3 == class_2246.WATER || iiiiiiIiiI3 == class_2246.LAVA) {
            return false;
        }
        if (IiIIiIiiiI.iiiiiIIIii.get() == MEnum.ListMode.iiiiiIIiiI) {
            return ((List)IiIIiIiiiI.iIIiiIIIII.get()).contains(iiiiiiIiiI3);
        }
        if (!((List)IiIIiIiiiI.IiiIIIiiIi.get()).contains(iiiiiiIiiI3)) {
            return 3 >> 1;
        }
        return false;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        if (this.iiIIIIiIII.player == null) {
            return;
        }
        switch (((HighwayClearer.Direction)((Object)this.iiIiIiiiiI.get())).ordinal()) {
            case 0: {
                iiiiiiIiiI iiiiiiIiiI2;
                double d;
                iiiiiiIiiI iiiiiiIiiI3 = this;
                while (false) {
                }
                double d2 = Math.abs(iiiiiiIiiI3.iiIIIIiIII.player.getX());
                if (d2 > (d = Math.abs(iiiiiiIiiI3.iiIIIIiIII.player.getZ()))) {
                    iiiiiiIiiI iiiiiiIiiI4;
                    this.iiIiIIiIIi = iiiiiiIiiI4.iiIIIIiIII.player.getX() > 0.0 ? 3 >> 2 : 2;
                    return;
                }
                this.iiIiIIiIIi = iiiiiiIiiI2.iiIIIIiIII.player.getZ() > 0.0 ? 3 >> 1 : 3;
                return;
            }
            case 1: {
                this.iiIiIIiIIi = 2 & 5;
                return;
            }
            case 2: {
                this.iiIiIIiIIi = --1;
                return;
            }
            case 3: {
                this.iiIiIIiIIi = 1 ^ 3;
                return;
            }
            case 4: {
                this.iiIiIIiIIi = --3;
                return;
            }
            case 5: {
                this.iiIiIIiIIi = -4 >> 2;
            }
        }
    }

    public iiiiiiIiiI() {
        iiiiiiIiiI iiiiiiIiiI2 = this;
        super(IIiIIIiIii.ALLATORIxDEMO("\u9adb\u905b\u6e06\u8d8b\u8026"), iiIiIIiiii.ALLATORIxDEMO("\u81ff\u52d7\u6e14\u747d\u9040\u8d96\u5240\u65de\u9acd\u597b\u7695\u65c2\u5744U-\u5e9d\u8bf8\u9171\u5411(\u81f6\u52de\u8d6c\u8d99J\u4e7d\u8d61\u4f03\u757e\u303e\u4e4e\u5394\u4ef4\u4f27\u4e2b\u96dc\u9042\u636d\u6389\u5613\u3010\u4e72\u4f62\u5e28\u6565\u5613\u7b58\u4f04\u7519\u3059"));
        iiiiiiIiiI2.IiIIIIiiii = iiiiiiIiiI2.settings.getDefaultGroup();
        iiiiiiIiiI2.iiiIiIiIIi = iiiiiiIiiI2.settings.createGroup(IIiIIIiIii.ALLATORIxDEMO("\u8fa3\u6ec7"));
        iiiiiiIiiI2.IiIIiIiiiI = iiiiiiIiiI2.settings.createGroup(iiIiIIiiii.ALLATORIxDEMO("\u6e03\u6788"));
        iiiiiiIiiI2.IIIiIIIiII = iiiiiiIiiI2.IiIIIIiiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u6e41\u7405\u8367\u56d7"))).description(iiIiIIiiii.ALLATORIxDEMO("\u5739\u5961\u8fed\u76df\u4f5c\u7f15\u6e14\u747d\u6588\u570c"))).defaultValue((Object)(--5))).min(2 ^ 3).sliderMax(0x37 & 0x4F).build());
        this.IiIiIIIIiI = this.IiIIIIiiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u8dec\u5bd9\u5e85"))).description(iiIiIIiiii.ALLATORIxDEMO("\u8dfe\u76ff\u5bac\u5edd\uff1d\u5391\u6307\u63e3\u8fe8\u4e71\u8312\u568f\u5194\u76ff\u6588\u570c"))).defaultValue((Object)(--5))).min(2 ^ 3).sliderMax(0x69 & 0x1F).build());
        this.IIiiiIIIIi = this.IiIIIIiiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u6744\u5924\u6352\u639b\u6514\u91ec"))).description(iiIiIIiiii.ALLATORIxDEMO("\u6bb4\u6b30\u677b\u592b\u634d\u6389\u76ff\u65a8\u572c\u6541\u9194"))).defaultValue((Object)(1 ^ 3))).min(3 >> 1).sliderMax(--5).build());
        this.iIiIiiIiiI = this.IiIIIIiiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u6352\u639b\u5e92\u8ffc"))).description(iiIiIIiiii.ALLATORIxDEMO("\u636d\u6389\u65c2\u5746\u4e30\u95e5\u76ff\u5ec7\u8f84\uff19\u000fx\u0018Z\uff52"))).defaultValue((Object)(5 >> 3))).min(2 & 5).sliderMax(0x7F & 0x14).build());
        this.iIiiIiiiII = this.IiIIIIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u81ae\u52ab\u5263\u6341"))).description(iiIiIIiiii.ALLATORIxDEMO("\u81fb\u52d3\u5236\u6339\u5221\u5473\u9013\u76ff\u5dd4\u512c"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.ALLATORIxDEMO = this.IiIIIIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u4ec6\u4e6f\u756f"))).description(iiIiIIiiii.ALLATORIxDEMO("\u53fb\u5753\u4e1a\u7537\u752e\u6513"))).defaultValue((Object)(5 >> 2))).build());
        this.iiIiIiiiiI = this.IiIIIIiiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u65dd\u5432"))).description(iiIiIIiiii.ALLATORIxDEMO("\u9018\u6292\u6e14\u747d\u6588\u544a"))).defaultValue((Object)HighwayClearer.Direction.iIIiiIIIII)).build());
        this.iiIIIIiIII = this.IiIIIIiiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u63d6\u5e8c\u6a45\u5f2c"))).description(iiIiIIiiii.ALLATORIxDEMO("\u5993\u4f2e\u63a3\u5ed4\u8990\u6e7e\u7417\u76ff\u4f7c\u7f35"))).defaultValue((Object)HighwayClearer.SortMode.iiIIIIiIII)).build());
        this.iiiiiIIIii = this.iiiIiIiIIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u8f83\u6ee7\u6a45\u5f2c"))).description(iiIiIIiiii.ALLATORIxDEMO("\u9038\u62b2\u65a8\u572c\u8fd6\u6e9f\u6a10\u5f54"))).defaultValue((Object)MEnum.ListMode.iiiiiIIiiI)).build());
        class_2248[] class_2248Array = new class_2248[--4];
        class_2248Array[2 & 5] = class_2246.NETHERRACK;
        class_2248Array[2 ^ 3] = class_2246.OBSIDIAN;
        class_2248Array[1 ^ 3] = class_2246.GRAVEL;
        class_2248Array[--3] = class_2246.SOUL_SAND;
        this.iIIiiIIIII = this.iiiIiIiIIi.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u767e\u5469\u5376"))).description(iiIiIIiiii.ALLATORIxDEMO("\u905f\u62d5\u8990\u6e7e\u7417\u76ff\u65a8\u572c\u7c6a\u57f0\uff19\u4ebe\u5739\u7606\u543c\u530e\u6a30\u5f74\u4e1a\u7564\u6579\uff52"))).defaultValue(class_2248Array).visible(() -> {
            if (this.iiiiiIIIii.get() == MEnum.ListMode.iiiiiIIiiI) {
                return (2 ^ 3) != 0;
            }
            return false;
        })).build());
        class_2248[] class_2248Array2 = new class_2248[4 ^ 5];
        class_2248Array2[5 >> 3] = class_2246.BEDROCK;
        this.IiiIIIiiIi = this.iiiIiIiIIi.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u9ed2\u5469\u5376"))).description(iiIiIIiiii.ALLATORIxDEMO("\u905f\u62d5\u4e1c\u6e7e\u7417\u76ff\u65a8\u572c\u7c6a\u57f0\uff19\u4ebe\u5739\u9eaa\u543c\u530e\u6a30\u5f74\u4e1a\u7564\u6579\uff52"))).defaultValue(class_2248Array2).visible(() -> {
            if (this.iiiiiIIIii.get() == MEnum.ListMode.ALLATORIxDEMO) {
                return (2 ^ 3) != 0;
            }
            return false;
        })).build());
        this.IIIiIiiIIi = this.IiIIiIiiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u667a\u7939\u6e56\u67f0"))).description(iiIiIIiiii.ALLATORIxDEMO("\u663e\u545d\u662f\u7941\u5f94\u6e7e\u7437\u65e2\u5746\u76ff\u6e23\u67a8\u98b5\u8993"))).defaultValue((Object)(--1 != 0))).build());
        this.IIIIiIiiIi = this.IiIIiIiiiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u6e76\u67d0\u6a45\u5f2c"))).description(iiIiIIiiii.ALLATORIxDEMO("\u9072\u62d8\u6e69\u67c2\u76ff\u662f\u7941\u6a10\u5f54"))).defaultValue((Object)ShapeMode.Both)).build());
        this.iIIiIIiiII = this.IiIIiIiiiI.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u4fe3\u9761\u98f8\u8251"))).description(iiIiIIiiii.ALLATORIxDEMO("\u5f94\u6e7e\u7417\u65c2\u5766\u76df\u4fb6\u9719\u587a\u513e\u98ad\u8229"))).defaultValue(new SettingColor(0x7CFF & 0x3FF, 0x6FF5 & 0x10AF, 5 >> 3, 0x3F & 0x5E)).build());
        int n = 0x74FF & 0xBFF;
        this.iiiiiIIiiI = this.IiIIiIiiiI.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u7efb\u6762\u98f8\u8251"))).description(iiIiIIiiii.ALLATORIxDEMO("\u5f94\u6e7e\u7437\u65e2\u5746\u76ff\u7eae\u671a\u98ad\u8229"))).defaultValue(new SettingColor(n, 0x72AF & 0xDF5, 3 >> 2, n)).build());
        iiiiiiIiiI iiiiiiIiiI3 = this;
        this.iiIiIIiIIi = 3 ^ 3;
        this.iIiIiIiIii = -4 >> 2;
        this.IIiiIiiiII = 3 & 4;
        iiiiiiIiiI iiiiiiIiiI4 = this;
        this.iiIIiiIiii = new ArrayList<class_2338>();
        iiiiiiIiiI3.IiiIIiiiiI = this.IIiiIiiiII;
        iiiiiiIiiI3.IIiiiiiiII = 3 >> 2;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiIIIiIii.ALLATORIxDEMO("\u0013hf%7fdv4g%w!\"d\u8bf4\u6690\u6593\u5274\u6703\u65f4\u724b\u6748\uff22"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean IiiIIIIiiI(class_2338 class_23382, class_2338 class_23383) {
        void IiIIiIiiiI;
        iiiiiiIiiI IiIIiIiiiI2 = this;
        if (!IiIIiIiiiI2.ALLATORIxDEMO((class_2338)(this = class_23382), (class_2338)IiIIiIiiiI)) {
            return 3 >> 2;
        }
        if (Math.sqrt(Math.pow(this.getX() - IiIIiIiiiI.getX(), 2.0) + Math.pow(this.getY() - IiIIiIiiiI.getY(), 2.0) + Math.pow(this.getZ() - IiIIiIiiiI.getZ(), 2.0)) < 1.0) {
            return (2 & 5) != 0;
        }
        if (!IiIIiIiiiI2.IiiiiiiIIi((class_2338)this, (class_2338)IiIIiIiiiI)) {
            return 5 >> 3;
        }
        if (IiIIiIiiiI2.IiiiiiiIIi((class_2338)this) && !IiIIiIiiiI2.ALLATORIxDEMO((class_2338)this)) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        class_2338 class_23382;
        iiiiiiIiiI iiiiiiIiiI2;
        iiiiiiIiiI iiiiiiIiiI3 = iiiiiiIiiI2 = iterator;
        iiiiiiIiiI3.iiIIiiIiii.clear();
        iiiiiiIiiI3.IIiiiiiiII = 3 ^ 3;
        if (iiiiiiIiiI3.IiiIIiiiiI < (Integer)iiiiiiIiiI2.iIiIiiIiiI.get()) {
            iiiiiiIiiI2.IiiIIiiiiI += --1;
            return;
        }
        iiiiiiIiiI2.IiiIIiiiiI = 3 ^ 3;
        if (((Boolean)iiiiiiIiiI2.ALLATORIxDEMO.get()).booleanValue() && !iiiiiiIiiI2.IiiIIIIiiI()) {
            return;
        }
        iiiiiiIiiI iiiiiiIiiI4 = iiiiiiIiiI2;
        iiiiiiIiiI4.ALLATORIxDEMO();
        if (iiiiiiIiiI4.iiIiIIiIIi != iiiiiiIiiI2.iIiIiIiIii) {
            iiiiiiIiiI iiiiiiIiiI5 = iiiiiiIiiI2;
            iiiiiiIiiI5.iIiIiIiIii = iiiiiiIiiI5.iiIiIIiIIi;
            iiiiiiIiiI5.info(iiiiiiIiiI5.ALLATORIxDEMO(), new Object[5 >> 3]);
        }
        class_2338 IiIIiIiiiI = iiiiiiIiiI2.iiIIIIiIII.player.getBlockPos();
        Iterator iterator = IiiIiIIIIi.ALLATORIxDEMO(IiIIiIiiiI, (Integer)iiiiiiIiiI2.IIIiIIIiII.get(), (Integer)iiiiiiIiiI2.IIIiIIIiII.get());
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            class_23382 = (class_2338)iterator.next();
            if (!iiiiiiIiiI2.IiiIIIIiiI(class_23382, IiIIiIiiiI)) continue;
            arrayList.add(class_23382);
        }
        iiiiiiIiiI2.ALLATORIxDEMO(arrayList, IiIIiIiiiI);
        iterator = arrayList.iterator();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            class_23382 = (class_2338)iterator.next();
            iterator2 = iterator;
            iiiiiiIiiI2.ALLATORIxDEMO(class_23382);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ int IiiIIIIiiI(class_2338 class_23382, class_2338 class_23383, class_2338 class_23384) {
        void IiIIiIiiiI;
        class_2338 IiIIiIiiiI2 = class_23384;
        class_2338 IiIIiIiiiI3 = class_23382;
        double d = Math.abs(IiIIiIiiiI.getZ() - IiIIiIiiiI3.getZ());
        double d2 = Math.abs(IiIIiIiiiI2.getZ() - IiIIiIiiiI3.getZ());
        return Double.compare(d, d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public String ALLATORIxDEMO() {
        Object object = this;
        if (!object.isActive()) {
            return IIiIIIiIii.ALLATORIxDEMO("\u6729\u544b\u750b");
        }
        HighwayClearer.Direction direction = (HighwayClearer.Direction)((Object)((iiiiiiIiiI)object).iiIiIiiiiI.get());
        if (direction == HighwayClearer.Direction.IiIIiIiiiI) {
            switch (((iiiiiiIiiI)object).iiIiIIiIIi) {
                case 0: {
                    this = iiIiIIiiii.ALLATORIxDEMO("\u6601\u80ec[<[IP\u8f45{9\u546a\u4e0d\u6e7e\u7437r");
                    break;
                }
                case 1: {
                    this = IIiIIIiIii.ALLATORIxDEMO("\u6679\u80b9#i#\u001e(\u8f10\u0003l\u5412\u5313\u6e06\u7462\n");
                    break;
                }
                case 2: {
                    this = iiIiIIiiii.ALLATORIxDEMO("\u6601\u80ec[<[IV\u8f45{9\u546a\u896e\u6e7e\u7437r");
                    break;
                }
                case 3: {
                    this = IIiIIIiIii.ALLATORIxDEMO("\u6679\u80b9#i#\u001e.\u8f10\u0003l\u5412\u5353\u6e06\u7462\n");
                    break;
                }
                default: {
                    this = iiIiIIiiii.ALLATORIxDEMO("\u6621\u80ec[<[\u671b\u77be");
                    break;
                }
            }
        } else {
            switch (direction.ordinal()) {
                case 1: {
                    this = IIiIIIiIii.ALLATORIxDEMO("\u4e78\u5432d+\u001c(\u8f10\n");
                    break;
                }
                case 2: {
                    this = iiIiIIiiii.ALLATORIxDEMO("\u5366\u544a1SKP\u8f45r");
                    break;
                }
                case 3: {
                    this = IIiIIIiIii.ALLATORIxDEMO("\u891b\u5432d+\u001c.\u8f10\n");
                    break;
                }
                case 4: {
                    this = iiIiIIiiii.ALLATORIxDEMO("\u5326\u544a1SKV\u8f45r");
                    break;
                }
                case 5: {
                    this = IIiIIIiIii.ALLATORIxDEMO("\u516b\u65dd\u5432");
                    break;
                }
                default: {
                    this = iiIiIIiiii.ALLATORIxDEMO("\u671b\u77be");
                }
            }
        }
        Object[] objectArray = new Object[5 >> 1];
        objectArray[3 & 4] = this;
        objectArray[3 & 5] = ((iiiiiiIiiI)object).IIiiIiiiII;
        return String.format(IIiIIIiIii.ALLATORIxDEMO("apd\u007fD\u5dd1\u6e41\u7405~#AG"), objectArray);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ int IiiiiiiIIi(class_2338 class_23382, class_2338 class_23383, class_2338 class_23384) {
        void IiIIiIiiiI;
        class_2338 IiIIiIiiiI2 = class_23384;
        class_2338 IiIIiIiiiI3 = class_23382;
        double d = Math.abs(IiIIiIiiiI.getX() - IiIIiIiiiI3.getX());
        double d2 = Math.abs(IiIIiIiiiI2.getX() - IiIIiIiiiI3.getX());
        return Double.compare(d, d2);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ int ALLATORIxDEMO(class_2338 class_23382, class_2338 class_23383, class_2338 class_23384) {
        void IiIIiIiiiI;
        class_2338 IiIIiIiiiI2 = class_23384;
        class_2338 IiIIiIiiiI3 = class_23382;
        double d = Math.sqrt(Math.pow(IiIIiIiiiI.getX() - IiIIiIiiiI3.getX(), 2.0) + Math.pow(IiIIiIiiiI.getY() - IiIIiIiiiI3.getY(), 2.0) + Math.pow(IiIIiIiiiI.getZ() - IiIIiIiiiI3.getZ(), 2.0));
        double d2 = Math.sqrt(Math.pow(IiIIiIiiiI2.getX() - IiIIiIiiiI3.getX(), 2.0) + Math.pow(IiIIiIiiiI2.getY() - IiIIiIiiiI3.getY(), 2.0) + Math.pow(IiIIiIiiiI2.getZ() - IiIIiIiiiI3.getZ(), 2.0));
        return Double.compare(d, d2);
    }

    public void onDeactivate() {
        iiiiiiIiiI iiiiiiIiiI2 = this;
        iiiiiiIiiI2.info("\u9ad8\u901f\u6e05\u8def\u8005\u6a21\u5757\u5df2\u505c\u7528\uff01\u603b\u5171\u6e05\u7406\u4e86 " + iiiiiiIiiI2.IIiiIiiiII + " \u4e2a\u65b9\u5757", new Object[3 & 4]);
        this.iIiIiIiIii = -4 >> 2;
        this.IiiiiiiIIi();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private /* synthetic */ boolean IiiiiiiIIi(class_2338 class_23382, class_2338 class_23383) {
        iiiiiiIiiI iiiiiiIiiI2 = iiiiiiIiiI3;
        iiiiiiIiiI iiiiiiIiiI3 = class_23383;
        iiiiiiIiiI IiIIiIiiiI = iiiiiiIiiI2;
        if (IiIIiIiiiI.iiIiIIiIIi == -4 >> 2) {
            return --1 != 0;
        }
        switch (IiIIiIiiiI.iiIiIIiIIi) {
            case 0: {
                void IiIIiIiiiI2;
                if (IiIIiIiiiI2.getX() <= iiiiiiIiiI3.getX()) return false;
                return --1 != 0;
            }
            case 1: {
                void IiIIiIiiiI2;
                if (IiIIiIiiiI2.getZ() <= iiiiiiIiiI3.getZ()) return false;
                return (4 ^ 5) != 0;
            }
            case 2: {
                void IiIIiIiiiI2;
                if (IiIIiIiiiI2.getX() >= iiiiiiIiiI3.getX()) return false;
                return 3 >> 1;
            }
            case 3: {
                void IiIIiIiiiI2;
                if (IiIIiIiiiI2.getZ() >= iiiiiiIiiI3.getZ()) return false;
                return (3 & 5) != 0;
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, class_2338 class_23383) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        iiiiiiIiiI iiiiiiIiiI2 = this;
        int n = (Integer)iiiiiiIiiI2.IiIiIIIIiI.get() / (5 >> 1);
        double d = iiiiiiIiiI2.iiIIIIiIII.player.getY() + 0.3;
        if (IiIIiIiiiI2.getY() < (int)Math.floor(d)) {
            return (3 ^ 3) != 0;
        }
        if (iiiiiiIiiI2.iiIiIIiIIi == -4 >> 2) {
            void v0 = IiIIiIiiiI2;
            int n2 = Math.abs(v0.getX() - IiIIiIiiiI.getX());
            int n3 = Math.abs(v0.getZ() - IiIIiIiiiI.getZ());
            if (n2 <= n && n3 <= n) {
                return --1 != 0;
            }
            return false;
        }
        switch (iiiiiiIiiI2.iiIiIIiIIi) {
            case 0: 
            case 2: {
                while (false) {
                }
                int n4 = Math.abs(IiIIiIiiiI2.getZ() - IiIIiIiiiI.getZ());
                if (n4 <= n) {
                    return 3 >> 1;
                }
                return false;
            }
            case 1: 
            case 3: {
                int n5 = Math.abs(IiIIiIiiiI2.getX() - IiIIiIiiiI.getX());
                if (n5 <= n) {
                    return (4 ^ 5) != 0;
                }
                return false;
            }
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        iiiiiiIiiI iiiiiiIiiI2 = iiiiiiIiiI3;
        iiiiiiIiiI iiiiiiIiiI3 = class_23382;
        iiiiiiIiiI IiIIiIiiiI = iiiiiiIiiI2;
        if (IiIIiIiiiI.iiIIIIiIII.world.getBlockState((class_2338)iiiiiiIiiI3).getBlock() == class_2246.BEDROCK) {
            return --1 != 0;
        }
        return false;
    }
}

