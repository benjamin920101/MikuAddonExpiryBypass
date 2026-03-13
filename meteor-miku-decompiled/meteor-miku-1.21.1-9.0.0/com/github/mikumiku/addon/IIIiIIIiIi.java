/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.misc.Pool
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.meteorclient.utils.world.BlockIterator
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Direction
 *  net.minecraft.block.ShapeContext
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IIiIiiIIiI;
import com.github.mikumiku.addon.IIiiIiiIiI;
import com.github.mikumiku.addon.IiIiIIiIII;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.AutoWither;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.function.ToDoubleFunction;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.misc.Pool;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.BlockIterator;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.ShapeContext;

public class IIIiIIIiIi
extends iiiiIiIiii {
    private final SettingGroup iiiIiIiIIi;
    private final Setting<AutoWither.Priority> iIiIiIiIii;
    private final Setting<Integer> iiiiiIIIii;
    private final Setting<Integer> iIIiIIiiII;
    private IIiiIiiIiI IiiIIiiiiI;
    private final Pool<IIiiIiiIiI> IiIIIIiiii;
    private final SettingGroup IiiIIIiiIi;
    private int iiIIiiIiii;
    private final Setting<Integer> iIiiIiiiII;
    private final Setting<Integer> iIIiiIIIII;
    private final Setting<Boolean> iiIiIIiIIi;
    private final Setting<ShapeMode> IIIIiIiiIi;
    private int IiIiIIIIiI;
    private final ArrayList<IIiiIiiIiI> iiiiiIIiiI;
    private final Setting<SettingColor> iiIIIIiIII;
    private final Setting<Boolean> IiIIiIiiiI;
    private final Setting<SettingColor> ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IIIiIIIiIi iIIiIIIiIi = object;
        Object object = pre;
        IIIiIIIiIi IiIIiIiiiI = iIIiIIIiIi;
        if (IiIIiIiiiI.IiiIIiiiiI == null) {
            IIIiIIIiIi iIIiIIIiIi2 = IiIIiIiiiI;
            if (iIIiIIIiIi2.iiIIiiIiii < (Integer)iIIiIIIiIi2.iIiiIiiiII.get() - (5 >> 2)) {
                return;
            }
            Object object2 = object = IiIIiIiiiI.iiiiiIIiiI.iterator();
            while (object2.hasNext()) {
                IIiiIiiIiI iIiiIiiIiI2 = (IIiiIiiIiI)object.next();
                object2 = object;
                IiIIiIiiiI.IiIIIIiiii.free((Object)iIiiIiiIiI2);
            }
            IIIiIIIiIi iIIiIIIiIi3 = IiIIiIiiiI;
            iIIiIIIiIi3.iiiiiIIiiI.clear();
            BlockIterator.register((int)((Integer)iIIiIIIiIi3.iiiiiIIIii.get()), (int)((Integer)IiIIiIiiiI.iIIiiIIIII.get()), (class_23382, class_26802) -> {
                void IiIIiIiiiI;
                IIIiIIIiIi iIIiIIIiIi = iIIiIIIiIi2;
                IIIiIIIiIi iIIiIIIiIi2 = class_26802;
                IIIiIIIiIi IiIIiIiiiI2 = iIIiIIIiIi;
                iIIiIIIiIi2 = IiiiIiiIII.ALLATORIxDEMO((class_2338)IiIIiIiiiI);
                if (IiIIiIiiiI2.ALLATORIxDEMO((class_2338)IiIIiIiiiI, (class_2350)iIIiIIIiIi2)) {
                    IIIiIIIiIi iIIiIIIiIi3 = IiIIiIiiiI2;
                    iIIiIIIiIi3.iiiiiIIiiI.add(((IIiiIiiIiI)iIIiIIIiIi3.IiIIIIiiii.get()).ALLATORIxDEMO((class_2338)IiIIiIiiiI, (class_2350)iIIiIIIiIi2));
                }
            });
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, class_2350 class_23502) {
        int n;
        void IiIIiIiiiI;
        IIIiIIIiIi iIIiIIIiIi = iIIiIIIiIi2;
        IIIiIIIiIi iIIiIIIiIi2 = class_23502;
        IIIiIIIiIi IiIIiIiiiI2 = iIIiIIIiIi;
        if (IiIIiIiiiI.getY() > (0x1FFF & 0x60FC)) {
            return (2 & 5) != 0;
        }
        int n2 = 0;
        int n3 = 3 >> 2;
        if (iIIiIIIiIi2 == class_2350.EAST || iIIiIIIiIi2 == class_2350.WEST) {
            n3 = 1;
        }
        if (iIIiIIIiIi2 == class_2350.NORTH || iIIiIIIiIi2 == class_2350.SOUTH) {
            n2 = 1;
        }
        iIIiIIIiIi2 = new class_2338.class_2339();
        int n4 = n = IiIIiIiiiI.getX() - n2;
        while (n4 <= IiIIiIiiiI.getX() + n2) {
            int n5 = IiIIiIiiiI.getZ() - n3;
            while (n5 <= IiIIiIiiiI.getZ()) {
                int n6;
                int n7 = IiIIiIiiiI.getY();
                while (true) {
                    int n8;
                    if (n7 > IiIIiIiiiI.getY() + (1 ^ 3)) break;
                    iIIiIIIiIi2.set(n, n8, n6);
                    if (!IiIIiIiiiI2.iiIIIIiIII.world.getBlockState((class_2338)iIIiIIIiIi2).isReplaceable()) {
                        return (3 ^ 3) != 0;
                    }
                    if (!IiIIiIiiiI2.iiIIIIiIII.world.canPlace(class_2246.STONE.getDefaultState(), (class_2338)iIIiIIIiIi2, class_3726.absent())) {
                        return (3 & 4) != 0;
                    }
                    n7 = ++n8;
                }
                n5 = ++n6;
            }
            n4 = ++n;
        }
        return true;
    }

    @Override
    public void onActivate() {
        super.onActivate();
    }

    public IIIiIIIiIi() {
        IIIiIIIiIi iIIiIIIiIi = this;
        super(IiIiIIiIII.ALLATORIxDEMO("\u81e1\u5297\u6515\u51d4\u96fd"), IIiIiiIIiI.ALLATORIxDEMO("\u818f\u5289\u5ebf\u9021\u51ae\u96d7"));
        iIIiIIIiIi.IiiIIIiiIi = iIIiIIIiIi.settings.getDefaultGroup();
        iIIiIIIiIi.iiiIiIiIIi = iIIiIIIiIi.settings.createGroup(IiIiIIiIII.ALLATORIxDEMO("\u6e2d\u67d8"));
        iIIiIIIiIi.iiiiiIIIii = iIIiIIIiIi.IiiIIIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u6c71\u5e72\u532f\u5fa5"))).description(IiIiIIiIII.ALLATORIxDEMO("\u6515\u7f71\u768f\u6c0b\u5e58\u5355\u5f8f"))).defaultValue((Object)(--4))).min(5 >> 3).sliderMax(0x2F & 0x56).build());
        this.iIIiiIIIII = this.IiiIIIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u57c7\u76f5\u532f\u5fa5"))).description(IiIiIIiIII.ALLATORIxDEMO("\u6515\u7f71\u768f\u57bd\u76df\u5355\u5f8f"))).defaultValue((Object)(--3))).min(3 & 4).sliderMax(0x66 & 0x1F).build());
        this.iIiIiIiIii = this.IiiIIIiiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u4f19\u512d\u7e86"))).description(IiIiIIiIII.ALLATORIxDEMO("\u4f33\u5157\u7eac"))).defaultValue((Object)AutoWither.Priority.iiiiiIIiiI)).build());
        this.iIiiIiiiII = this.IiiIIIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u518e\u96f7\u5e93\u8ffe"))).description(IiIiIIiIII.ALLATORIxDEMO("\u51f4\u96dd\u6501\u7f45\u4e74\u95df\u769b\u5efd\u8fe0\uff23\u5224\uff02"))).defaultValue((Object)(5 >> 2))).min(--1).sliderMax(0x3E & 0x4B).build());
        this.iIIiIIiiII = this.IiiIIIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u65fc\u5756\u5e93\u8ffe"))).description(IiIiIIiIII.ALLATORIxDEMO("\u6586\u577c\u6501\u7f45\u4e74\u95df\u769b\u5efd\u8fe0\uff23\u5224\uff02"))).defaultValue((Object)(--1))).min(3 >> 2).sliderMax(0x7E & 0xB).build());
        this.IiIIiIiiiI = this.IiiIIIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u65ae\u8f4d"))).description(IiIiIIiIII.ALLATORIxDEMO("\u5ed1\u903f\u65fd\u6610\u540d\u65d4\u8f67"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iiIiIIiIIi = this.IiiIIIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u81af\u52a9\u5116\u95cc"))).description(IiIiIIiIII.ALLATORIxDEMO("\u5ec5\u900b\u536a\u4e01\u51f4\u96dd\u6035\u5405\u81d5\u5283\u516c\u95e6"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.IIIIiIiiIi = this.iiiIiIiIIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u5f27\u72b7\u6a44\u5f2e"))).description(IiIiIIiIII.ALLATORIxDEMO("\u5f49\u72a9\u768f\u6e0d\u67f8\u65a6\u5f04"))).defaultValue((Object)ShapeMode.Both)).build());
        this.ALLATORIxDEMO = this.iiiIiIiIIi.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u4fe2\u9763\u98f9\u8253"))).description(IiIiIIiIII.ALLATORIxDEMO("\u76c5\u6838\u6592\u5768\u6e19\u67cc\u768f\u4f98\u9749\u9883\u8279"))).defaultValue(new SettingColor(0x6FF & 0x79C5, 0x37ED & 0x489B, 0x46ED & 0x39FA, 0x2F & 0x5A)).build());
        this.iiIIIIiIII = this.iiiIiIiIIi.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u7efa\u6760\u98f9\u8253"))).description(IiIiIIiIII.ALLATORIxDEMO("\u76c5\u6838\u6592\u5768\u6e19\u67cc\u768f\u7e80\u674a\u9883\u8279"))).defaultValue(new SettingColor(0x7FC7 & 0xFD, 0x24FF & 0x5B89, 0x36FD & 0x49EA)).build());
        IIIiIIIiIi iIIiIIIiIi2 = this;
        iIIiIIIiIi2.IiIIIIiiii = new Pool(IIiiIiiIiI::new);
        IIIiIIIiIi iIIiIIIiIi3 = this;
        iIIiIIIiIi3.iiiiiIIiiI = new ArrayList();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiIiiIIiI.ALLATORIxDEMO("2JG\u00076det5e\u0004U  e\u8bf6\u66b1\u65b1\u5255\u6721\u65f5\u7249\u6749\uff20"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(class_2338 class_23382, int n) {
        void IiIIiIiiiI;
        int n2 = n;
        IIIiIIIiIi IiIIiIiiiI2 = this;
        IIIiIiIiii.ALLATORIxDEMO(n2);
        iiiIIIIiiI.IiIiiiIIiI((class_2338)IiIIiIiiiI);
        IIIiIiIiii.ALLATORIxDEMO(n2);
        IIIiIiIiii.IiiiiiiIIi();
    }

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

