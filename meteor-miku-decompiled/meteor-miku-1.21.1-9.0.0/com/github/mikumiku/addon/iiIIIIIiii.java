/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BlockSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.meteorclient.utils.world.Dimension
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiiIIiiiII;
import com.github.mikumiku.addon.IiiIiIIIIi;
import com.github.mikumiku.addon.iIIiiIIiii;
import com.github.mikumiku.addon.iiIiiIIIiI;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.iiiiIiiiII;
import com.github.mikumiku.addon.modules.HighwayBlocker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BlockSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.Dimension;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class iiIIIIIiii
extends iiiiIiIiii {
    private final Setting<Boolean> IIiiIiiiII;
    private final Setting<Boolean> IIIiIiiIIi;
    private final SettingGroup iiiIiIiIIi;
    private final Setting<SettingColor> iIiIiIiIii;
    private final Setting<Integer> iiiiiIIIii;
    private int iIIiIIiiII;
    private int IiiIIiiiiI;
    private int IiIIIIiiii;
    private final Setting<SettingColor> IiiIIIiiIi;
    private final Setting<ShapeMode> iiIIiiIiii;
    private final Setting<class_2248> iIiiIiiiII;
    private List<class_2338> iIIiiIIIII;
    private final iiIiiIIIiI iiIiIIiIIi;
    private final Setting<HighwayBlocker.SortMode> IIIIiIiiIi;
    private final SettingGroup IiIiIIIIiI;
    private final Setting<Integer> iiiiiIIiiI;
    private int iiIIIIiIII;
    private final Setting<Integer> IiIIiIiiiI;
    private int ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(List<class_2338> list, class_2338 class_23382) {
        iiIIIIIiii iiIIIIIiii2;
        iiIIIIIiii iiIIIIIiii3 = list2;
        List<class_2338> list2 = list;
        iiIIIIIiii IiIIiIiiiI = iiIIIIIiii3;
        if (list2.isEmpty()) {
            return;
        }
        switch (IiIIiIiiiI.IiiIIiiiiI) {
            case 0: 
            case 2: {
                void IiIIiIiiiI2;
                while (false) {
                }
                list2.sort((arg_0, arg_1) -> iiIIIIIiii.ALLATORIxDEMO((class_2338)IiIIiIiiiI2, arg_0, arg_1));
                iiIIIIIiii2 = IiIIiIiiiI;
                break;
            }
            case 1: 
            case 3: {
                void IiIIiIiiiI2;
                list2.sort((arg_0, arg_1) -> iiIIIIIiii.IiiiiiiIIi((class_2338)IiIIiIiiiI2, arg_0, arg_1));
            }
            default: {
                iiIIIIIiii2 = IiIIiIiiiI;
            }
        }
        if (iiIIIIIiii2.IIIIiIiiIi.get() == HighwayBlocker.SortMode.IiIIiIiiiI) {
            Collections.reverse(list2);
        }
    }

    public void IiiiiiiIIi() {
        this.iiIIIIiIII = 5 >> 3;
        iiiiIiiiII.ALLATORIxDEMO(iIIiiIIiii.ALLATORIxDEMO("\u7efc\u8bf7\u5dd1\u919b\u7f4d"));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private /* synthetic */ boolean IiiiiiiIIi(class_2338 class_23382, class_2338 class_23383) {
        iiIIIIIiii iiIIIIIiii2 = iiIIIIIiii3;
        iiIIIIIiii iiIIIIIiii3 = class_23383;
        iiIIIIIiii IiIIiIiiiI = iiIIIIIiii2;
        switch (IiIIiIiiiI.IiiIIiiiiI) {
            case 0: {
                void IiIIiIiiiI2;
                if (IiIIiIiiiI2.getX() >= iiIIIIIiii3.getX()) return false;
                return 3 >> 1;
            }
            case 1: {
                void IiIIiIiiiI2;
                if (IiIIiIiiiI2.getZ() >= iiIIIIIiii3.getZ()) return false;
                return (4 ^ 5) != 0;
            }
            case 2: {
                void IiIIiIiiiI2;
                if (IiIIiIiiiI2.getX() <= iiIIIIIiii3.getX()) return false;
                return --1 != 0;
            }
            case 3: {
                void IiIIiIiiiI2;
                if (IiIIiIiiiI2.getZ() <= iiIIIIIiii3.getZ()) return false;
                return --1 != 0;
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ int IiiiiiiIIi(class_2338 class_23382, class_2338 class_23383, class_2338 class_23384) {
        void IiIIiIiiiI;
        class_2338 IiIIiIiiiI2 = class_23384;
        class_2338 IiIIiIiiiI3 = class_23382;
        double d = Math.abs(IiIIiIiiiI.getZ() - IiIIiIiiiI3.getZ());
        double d2 = Math.abs(IiIIiIiiiI2.getZ() - IiIIiIiiiI3.getZ());
        return Double.compare(d, d2);
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iiIIIIIiii iiIIIIIiii2 = this;
        if (((Boolean)iiIIIIIiii2.IIIiIiiIIi.get()).booleanValue() && iiIIIIIiii2.iIIiiIIIII.size() > 0) {
            class_1792[] class_1792Array = new class_1792[--1];
            class_1792Array[3 ^ 3] = ((class_2248)iiIIIIIiii2.iIiiIiiiII.get()).asItem();
            if (IIIiIiIiii.ALLATORIxDEMO(class_1792Array).found()) {
                int n = this = 5 >> 3;
                while (n < iiIIIIIiii2.iIIiiIIIII.size()) {
                    void IiIIiIiiiI;
                    double d = iiIIIIIiii2.iIIiiIIIII.get(this).getX();
                    double d2 = iiIIIIIiii2.iIIiiIIIII.get(this).getY();
                    double d3 = iiIIIIIiii2.iIIiiIIIII.get(this).getZ();
                    double d4 = iiIIIIIiii2.iIIiiIIIII.get(this).getX() + (4 ^ 5);
                    double d5 = iiIIIIIiii2.iIIiiIIIII.get(this).getY() + (2 ^ 3);
                    double d6 = iiIIIIIiii2.iIIiiIIIII.get(this).getZ() + (2 ^ 3);
                    int n2 = 4 ^ 5;
                    IiIIiIiiiI.renderer.box(d, d2, d3, d4, d5, d6, (Color)iiIIIIIiii2.IiiIIIiiIi.get(), (Color)iiIIIIIiii2.iIiIiIiIii.get(), (ShapeMode)iiIIIIIiii2.iiIIiiIiii.get(), 5 >> 3);
                    n = ++this;
                }
            }
        }
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        iiIIIIIiii iiIIIIIiii2 = this;
        int n = this = 3 >> 2;
        while (true) {
            if (n >= 9) break;
            if (iiIIIIIiii2.iiIIIIiIII.player.getInventory().getStack(this).getItem() == class_1802.OBSIDIAN) {
                return this;
            }
            n = ++this;
        }
        int n2 = this = 9;
        while (true) {
            if (n2 >= 36) break;
            if (iiIIIIIiii2.iiIIIIiIII.player.getInventory().getStack(this).getItem() == class_1802.OBSIDIAN) {
                return this;
            }
            n2 = ++this;
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, class_2338 class_23383) {
        void IiIIiIiiiI;
        iiIIIIIiii iiIIIIIiii2 = iiIIIIIiii3;
        iiIIIIIiii iiIIIIIiii3 = class_23382;
        iiIIIIIiii IiIIiIiiiI2 = iiIIIIIiii2;
        if (Math.sqrt(Math.pow(iiIIIIIiii3.getX() - IiIIiIiiiI.getX(), 2.0) + Math.pow(iiIIIIIiii3.getY() - IiIIiIiiiI.getY(), 2.0) + Math.pow(iiIIIIIiii3.getZ() - IiIIiIiiiI.getZ(), 2.0)) < 0.2) {
            return 5 >> 3;
        }
        if (!IiIIiIiiiI2.IiiiiiiIIi((class_2338)iiIIIIIiii3, (class_2338)IiIIiIiiiI)) {
            return (3 ^ 3) != 0;
        }
        return IiIIiIiiiI2.ALLATORIxDEMO((class_2338)iiIIIIIiii3);
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        if (this.iiIIIIiIII.world == null) {
            return (3 ^ 3) != 0;
        }
        return PlayerUtils.getDimension().equals((Object)Dimension.Nether);
    }

    @Override
    public void onActivate() {
        super.onActivate();
        this.iiIIIIiIII = 3 >> 2;
        this.IiIIIIiiii = 2 & 5;
        this.iIIiIIiiII = this.IiIIIIiiii;
        this.ALLATORIxDEMO = -4 >> 2;
        this.iIIiiIIIII.clear();
        this.iiIiIIiIIi.IiiIIIIiiI();
        iiiiIiiiII.ALLATORIxDEMO(iIIiiIIiii.ALLATORIxDEMO("\u9adb\u9069\u8dec\u5843\u585d\u6a77\u5774\u5da4\u540c\u757e\uff22"));
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iiIIIIIiii iiIIIIIiii2;
        double d;
        if (this.iiIIIIiIII.player == null) {
            return;
        }
        iiIIIIIiii iiIIIIIiii3 = this;
        double d2 = Math.abs(iiIIIIIiii3.iiIIIIiIII.player.getX());
        if (d2 > (d = Math.abs(iiIIIIIiii3.iiIIIIiIII.player.getZ()))) {
            iiIIIIIiii iiIIIIIiii4;
            this.IiiIIiiiiI = iiIIIIIiii4.iiIIIIiIII.player.getX() > 0.0 ? 3 ^ 3 : 2;
            return;
        }
        this.IiiIIiiiiI = iiIIIIIiii2.iiIIIIiIII.player.getZ() > 0.0 ? 3 >> 1 : 3;
    }

    public void onDeactivate() {
        iiIIIIIiii iiIIIIIiii2 = this;
        iiiiIiiiII.ALLATORIxDEMO("\u9ad8\u901f\u8def\u5835\u585e\u6a21\u5757\u5df2\u505c\u7528\uff01\u603b\u5171\u653e\u7f6e\u4e86 " + iiIIIIIiii2.iiIIIIiIII + " \u4e2a " + ((class_2248)iiIIIIIiii2.iIiiIiiiII.get()).getName().getString());
        iiIIIIIiii iiIIIIIiii3 = this;
        iiIIIIIiii3.ALLATORIxDEMO = -4 >> 2;
        iiIIIIIiii3.iiIiIIiIIi.iIIiiiIiiI();
        iiIIIIIiii3.IiiiiiiIIi();
    }

    public iiIIIIIiii() {
        iiIIIIIiii iiIIIIIiii2 = this;
        super(iIIiiIIiii.ALLATORIxDEMO("\u9afb\u9049\u5816\u8db9\u8026"), IiiIIiiiII.ALLATORIxDEMO("\u81c4\u52de\u5704\u4e63\u757e\u650d\u7f07\u65c5\u5771\u584c\u587d\u9aa1\u903c\u8d9d\u0004S\u5ed3\u8b9d\u9124\u547cu\u4e74\u9500\u8831\u7ed7\t\u300f\u000f\u81e4\u52fc\u8d7e\u8dbbST\u4e2e\u8d03\u4f51\u755c\u302c"));
        iiIIIIIiii2.IiIiIIIIiI = iiIIIIIiii2.settings.getDefaultGroup();
        iiIIIIIiii2.iiiIiIiIIi = iiIIIIIiii2.settings.createGroup(iIIiiIIiii.ALLATORIxDEMO("\u6e64\u67f0"));
        iiIIIIIiii2.iIiiIiiiII = iiIIIIIiii2.IiIiIIIIiI.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u65cd\u5779\u7c0f\u57a5"))).description(iIIiiIIiii.ALLATORIxDEMO("\u900a\u629f\u752b\u4ef8\u5836\u5808\u76a7\u65ef\u5774\u7c2d\u57a8"))).defaultValue((Object)class_2246.OBSIDIAN)).build());
        this.IiIIiIiiiI = this.IiIiIIIIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u654a\u7f40\u8377\u56da"))).description(iIIiiIIiii.ALLATORIxDEMO("\u575e\u8ea8\u5478\u5919\u8faa\u7687\u4f1b\u7f4d\u6568\u7f4d\u65ef\u5774"))).defaultValue((Object)(--4))).min(3 >> 1).sliderMax(0x5E & 0x2B).build());
        this.iiiiiIIiiI = this.IiIiIIIIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u6774\u5909\u654a\u7f40\u6504\u91e1"))).description(iIIiiIIiii.ALLATORIxDEMO("\u6bb9\u6b22\u6776\u5919\u6548\u7f6d\u76d2\u9ef2\u668a\u77d0\u6526\u91ec"))).defaultValue((Object)(--2))).min(5 >> 2).sliderMax(--5).build());
        this.iiiiiIIIii = this.IiIiIIIIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u654a\u7f40\u5e82\u8ff1"))).description(iIIiiIIiii.ALLATORIxDEMO("\u6548\u7f6d\u9ea7\u66df\u7785\u4e48\u9582\u7687\u5e80\u8fdc\uff5eW?@=\uff2a"))).defaultValue((Object)(3 ^ 3))).min(2 & 5).sliderMax(0x3E & 0x55).build());
        this.IIIIiIiiIi = this.IiIiIIIIiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u63e6\u5ea1\u6a55\u5f21"))).description(iIIiiIIiii.ALLATORIxDEMO("\u59f4\u4f56\u63e4\u5e8c\u89d7\u651d\u7f38\u76a7\u4f1b\u7f4d"))).defaultValue((Object)HighwayBlocker.SortMode.IiIIiIiiiI)).build());
        this.IIiiIiiiII = this.IiIiIIIIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u4eeb\u4e7f\u7562"))).description(iIIiiIIiii.ALLATORIxDEMO("\u53bc\u570b\u4e5d\u756f\u7549\u656b"))).defaultValue((Object)(--1 != 0))).build());
        this.IIIiIiiIIi = this.iiiIiIiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u664a\u7914\u6e46\u67fd"))).description(iIIiiIIiii.ALLATORIxDEMO("\u662c\u5450\u663d\u794c\u5f86\u6548\u7f6d\u9ea7\u66df\u77a5\u76a7\u6e64\u67f0\u98d2\u89eb"))).defaultValue((Object)(--1 != 0))).build());
        this.iiIIiiIiii = this.iiiIiIiIIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u6e46\u67fd\u6a55\u5f21"))).description(iIIiiIIiii.ALLATORIxDEMO("\u900a\u629f\u6e31\u6785\u76a7\u6668\u7919\u6a77\u5f2c"))).defaultValue((Object)ShapeMode.Both)).build());
        int n = 0x26B8 & 0x59C7;
        this.IiiIIIiiIi = this.iiiIiIiIIi.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u4fd3\u974c\u98e8\u825c"))).description(iIIiiIIiii.ALLATORIxDEMO("\u5f86\u6548\u7f6d\u9ea7\u66df\u7785\u7687\u4ff1\u9741\u583d\u5166\u98ca\u8251"))).defaultValue(new SettingColor(n, 3 ^ 3, n, 0x5E & 0x3F)).build());
        int n2 = 0x4D8A & 0x32F5;
        this.iIiIiIiIii = this.iiiIiIiIIi.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u7ecb\u674f\u98e8\u825c"))).description(iIIiiIIiii.ALLATORIxDEMO("\u5f86\u6548\u7f6d\u9ea7\u66df\u77a5\u76a7\u7ee9\u6742\u98ca\u8251"))).defaultValue(new SettingColor(n2, 5 >> 3, n2, 0x26FF & 0x59FF)).build());
        iiIIIIIiii iiIIIIIiii3 = this;
        this.IiiIIiiiiI = 3 >> 2;
        this.ALLATORIxDEMO = -4 >> 2;
        this.iiIIIIiIII = 3 & 4;
        iiIIIIIiii iiIIIIIiii4 = this;
        this.iIIiiIIIII = new ArrayList<class_2338>();
        iiIIIIIiii3.IiIIIIiiii = this.iiIIIIiIII;
        iiIIIIIiii3.iIIiIIiiII = 2 & 5;
        iiIIIIIiii iiIIIIIiii5 = this;
        iiIIIIIiii3.iiIiIIiIIi = new iiIiiIIIiI(1000L);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiIIiiiII.ALLATORIxDEMO("#EV\b\u0007KT[$j5z1/t\u8bf9\u66a0\u65be\u5244\u672e\u65c4\u7266\u6758\uff2f"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ int ALLATORIxDEMO(class_2338 class_23382, class_2338 class_23383, class_2338 class_23384) {
        void IiIIiIiiiI;
        class_2338 IiIIiIiiiI2 = class_23384;
        class_2338 IiIIiIiiiI3 = class_23382;
        double d = Math.abs(IiIIiIiiiI.getX() - IiIIiIiiiI3.getX());
        double d2 = Math.abs(IiIIiIiiiI2.getX() - IiIIiIiiiI3.getX());
        return Double.compare(d, d2);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        class_2338 class_23382;
        iiIIIIIiii iiIIIIIiii2;
        iiIIIIIiii iiIIIIIiii3 = iiIIIIIiii2 = iterator;
        iiIIIIIiii3.iIIiiIIIII.clear();
        iiIIIIIiii3.iIIiIIiiII = 5 >> 3;
        if (iiIIIIIiii3.IiIIIIiiii < (Integer)iiIIIIIiii2.iiiiiIIIii.get()) {
            iiIIIIIiii2.IiIIIIiiii += --1;
            return;
        }
        iiIIIIIiii2.IiIIIIiiii = 3 & 4;
        if (((Boolean)iiIIIIIiii2.IIiiIiiiII.get()).booleanValue() && !iiIIIIIiii2.ALLATORIxDEMO()) {
            return;
        }
        class_1792[] class_1792Array = new class_1792[1];
        class_1792Array[3 & 4] = ((class_2248)iiIIIIIiii2.iIiiIiiiII.get()).asItem();
        if (!IIIiIiIiii.ALLATORIxDEMO(class_1792Array).found()) {
            iiiiIiiiII.ALLATORIxDEMO("\u6ca1\u6709\u627e\u5230 " + ((class_2248)iiIIIIIiii2.iIiiIiiiII.get()).getName().getString() + "\uff0c\u505c\u6b62\u6a21\u5757");
            iiIIIIIiii2.toggle();
            return;
        }
        iiIIIIIiii iiIIIIIiii4 = iiIIIIIiii2;
        iiIIIIIiii4.ALLATORIxDEMO();
        if (iiIIIIIiii4.IiiIIiiiiI != iiIIIIIiii2.ALLATORIxDEMO) {
            iiIIIIIiii iiIIIIIiii5 = iiIIIIIiii2;
            iiIIIIIiii5.ALLATORIxDEMO = iiIIIIIiii5.IiiIIiiiiI;
            iiiiIiiiII.ALLATORIxDEMO(iiIIIIIiii5.ALLATORIxDEMO());
        }
        iiIIIIIiii iiIIIIIiii6 = iiIIIIIiii2;
        class_2338 IiIIiIiiiI = iiIIIIIiii6.iiIIIIiIII.player.getBlockPos();
        Iterator iterator = IiiIiIIIIi.ALLATORIxDEMO(((Integer)iiIIIIIiii6.IiIIiIiiiI.get()).intValue());
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            class_23382 = (class_2338)iterator.next();
            if (!iiIIIIIiii2.ALLATORIxDEMO(class_23382, IiIIiIiiiI)) continue;
            arrayList.add(class_23382);
        }
        iiIIIIIiii2.ALLATORIxDEMO(arrayList, IiIIiIiiiI);
        iterator = arrayList.iterator();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            class_23382 = (class_2338)iterator.next();
            iterator2 = iterator;
            iiIIIIIiii2.ALLATORIxDEMO(class_23382);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public String ALLATORIxDEMO() {
        Object object = object2;
        if (!object.isActive()) {
            return IiiIIiiiII.ALLATORIxDEMO("\u6704\u545b\u7506");
        }
        switch (((iiIIIIIiii)object).IiiIIiiiiI) {
            case 0: {
                Object object2 = iIIiiIIiii.ALLATORIxDEMO(".(\u8f02#~\u5432\u4e4a\u5816\u5808\n");
                break;
            }
            case 1: {
                Object object2 = IiiIIiiiII.ALLATORIxDEMO("\u000e%\u8f20.\\\u543f\u5323\u581b\u582a\u0007");
                break;
            }
            case 2: {
                Object object2 = iIIiiIIiii.ALLATORIxDEMO("..\u8f02#~\u5432\u8929\u5816\u5808\n");
                break;
            }
            case 3: {
                Object object2 = IiiIIiiiII.ALLATORIxDEMO("\u000e#\u8f20.\\\u543f\u5363\u581b\u582a\u0007");
                break;
            }
            default: {
                Object object2 = iIIiiIIiii.ALLATORIxDEMO("\u677c\u77c6");
            }
        }
        Object[] objectArray = new Object[1 ^ 3];
        objectArray[3 >> 2] = object2;
        objectArray[2 ^ 3] = ((iiIIIIIiii)object).iiIIIIiIII;
        return String.format(IiiIIiiiII.ALLATORIxDEMO("q}trt\u5dfc\u654a\u7f40N\u000eQJ"), objectArray);
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        iiIIIIIiii iiIIIIIiii2 = iiIIIIIiii3;
        iiIIIIIiii iiIIIIIiii3 = class_23382;
        iiIIIIIiii IiIIiIiiiI = iiIIIIIiii2;
        if (iiIIIIIiii3 == null) {
            return;
        }
        if (IiIIiIiiiI.iIIiiIIIII.contains(iiIIIIIiii3)) {
            return;
        }
        iiIIIIIiii iiIIIIIiii4 = IiIIiIiiiI;
        if (iiIIIIIiii4.iIIiIIiiII >= (Integer)iiIIIIIiii4.iiiiiIIiiI.get()) {
            return;
        }
        if (IiIIiIiiiI.iiIiIIiIIi.ALLATORIxDEMO((class_2338)iiIIIIIiii3)) {
            return;
        }
        if (class_3532.sqrt((float)((float)iiiIIIIiiI.ALLATORIxDEMO().squaredDistanceTo(iiIIIIIiii3.toCenterPos()))) > (float)((Integer)IiIIiIiiiI.IiIIiIiiiI.get()).intValue()) {
            return;
        }
        int n = IIIiIiIiii.iiIiiiiiII(((class_2248)IiIIiIiiiI.iIiiIiiiII.get()).asItem());
        if (n == -4 >> 2) {
            return;
        }
        IiIIiIiiiI.iIIiiIIIII.add((class_2338)iiIIIIIiii3);
        IIIiIiIiii.ALLATORIxDEMO(n);
        iiiIIIIiiI.IiIiiiIIiI((class_2338)iiIIIIIiii3);
        IIIiIiIiii.ALLATORIxDEMO(n);
        IIIiIiIiii.IiiiiiiIIi();
        iiIIIIIiii iiIIIIIiii5 = IiIIiIiiiI;
        iiIIIIIiii5.iIIiIIiiII += 2 ^ 3;
        iiIIIIIiii5.iiIIIIiIII += --1;
        iiIIIIIiii5.iiIiIIiIIi.ALLATORIxDEMO((class_2338)iiIIIIIiii3);
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        iiIIIIIiii iiIIIIIiii2 = iiIIIIIiii3;
        iiIIIIIiii iiIIIIIiii3 = class_23382;
        iiIIIIIiii IiIIiIiiiI = iiIIIIIiii2;
        if (!(IiIIiIiiiI.iiIIIIiIII.world.getBlockState((class_2338)iiIIIIIiii3).isAir() || IiIIiIiiiI.iiIIIIiIII.world.getBlockState((class_2338)iiIIIIIiii3).getBlock().equals(class_2246.WATER) || IiIIiIiiiI.iiIIIIiIII.world.getBlockState((class_2338)iiIIIIIiii3).getBlock().equals(class_2246.LAVA))) {
            return 3 >> 2;
        }
        return iiiIIIIiiI.IiiiiiiIIi((class_2338)iiIIIIIiii3, 3 >> 1);
    }
}

