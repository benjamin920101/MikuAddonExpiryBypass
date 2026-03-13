/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.world.BlockView
 *  net.minecraft.block.AbstractRailBlock
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.block.ButtonBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction$Axis
 *  net.minecraft.block.SlabBlock
 *  net.minecraft.block.TrapdoorBlock
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiiIIiiiII;
import com.github.mikumiku.addon.IiiIiIIIIi;
import com.github.mikumiku.addon.iiIiiIIIiI;
import com.github.mikumiku.addon.iiIiiiiIii;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.AutoSlab;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.world.BlockView;
import net.minecraft.block.AbstractRailBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.ButtonBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.TrapdoorBlock;

public class iiiIIiiiII
extends iiiiIiIiii {
    private final List<class_2338> IiiIIiiiiI;
    private final Setting<AutoSlab.BlockType> IiIIIIiiii;
    private final iiIiiIIIiI IiiIIIiiIi;
    private final Setting<Integer> iiIIiiIiii;
    private final Setting<Boolean> iIiiIiiiII;
    private final SettingGroup iIIiiIIIII;
    private final SettingGroup iiIiIIiIIi;
    private final Setting<ShapeMode> IIIIiIiiIi;
    private final Setting<Integer> IiIiIIIIiI;
    private final Setting<SettingColor> iiiiiIIiiI;
    private final Setting<SettingColor> iiIIIIiIII;
    private final Setting<Double> IiIIiIiiiI;
    private int ALLATORIxDEMO;

    public iiiIIiiiII() {
        iiiIIiiiII iiiIIiiiII2 = this;
        super(iiiiIiIiii.IiIiIIIIiI, iiIiiiiIii.ALLATORIxDEMO("\u94c3\u5314\u7865?"), IiiIIiiiII.ALLATORIxDEMO("\u8183\u52d4\u6518\u7f17\u5369\u786f\f\u6d49\u6757\u959b\u0006\u94f2\u8f01[\u6327\u94da\u0001\u5744\u6bc1x.\u53be\u4f14\u948e\u4e2e\u5c36\uff22T\u7506\u6731\u963c\u5263\u6024"));
        iiiIIiiiII2.iiIiIIiIIi = iiiIIiiiII2.settings.getDefaultGroup();
        iiiIIiiiII2.iIIiiIIIII = iiiIIiiiII2.settings.createGroup(iiIiiiiIii.ALLATORIxDEMO("\u6e41\u67c7"));
        iiiIIiiiII2.IiIIIIiiii = iiiIIiiiII2.iiIiIIiIIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u65ed\u5759\u7c2f\u5785"))).description(iiIiiiiIii.ALLATORIxDEMO("\u89a5\u657d\u7f6a\u76e7\u65bd\u5734\u7c0a\u579d\nc\u90de\u666b\u4e29\u5274\u6013\u76da\u65ca\u5743"))).defaultValue((Object)AutoSlab.BlockType.iIIIIiiiIi)).build());
        this.iiIIiiIiii = this.iiIiIIiIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u5ea2\u8fd1"))).description(iiIiiiiIii.ALLATORIxDEMO("\u651a\u7f2d\u4e68\u95b0\u76a0\u5eb5\u8fe6v\u5248="))).defaultValue((Object)(4 ^ 5))).build());
        this.IiIiIIIIiI = this.iiIiIIiIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u6bbb\u5215\u656a\u7f60\u6524\u91c1"))).description(iiIiiiiIii.ALLATORIxDEMO("\u6bec\u527f\u651a\u7f2d\u5923\u5c4f\u65ca\u5743"))).defaultValue((Object)(--2))).sliderRange(5 >> 2, 0x5F & 0x2A).build());
        this.IiIIiIiiiI = this.iiIiIIiIIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u8357\u56fa"))).description(iiIiiiiIii.ALLATORIxDEMO("\u659d\u5714\u6507\u7f30\u8370\u56e0"))).defaultValue(4.5).range(1.0, 6.0).build());
        this.iIiiIiiiII = this.iIIiiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u6e66\u67dd"))).description(iiIiiiiIii.ALLATORIxDEMO("\u6e16\u6790\u6580\u5709\u4f3e\u7f7a"))).defaultValue((Object)(5 >> 2))).build());
        this.IIIIiIiiIi = this.iIIiiIIIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u5f36\u72b8\u6a75\u5f01"))).description(iiIiiiiIii.ALLATORIxDEMO("\u59a6\u4f16\u6e0b\u678d\u65ca\u5743"))).defaultValue((Object)ShapeMode.Both)).build());
        this.iiiiiIIiiI = this.iIIiiIIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u4ff3\u976c\u98c8\u827c"))).description(iiIiiiiIii.ALLATORIxDEMO("\u6e71\u67f0\u65fd\u5773\u4fe4\u975b\u76da\u98ef\u8266"))).defaultValue(new SettingColor(0x7C & 0x67, 0x43C9 & 0x3CFE, 0x71FF & 0xEFF, 0x2F & 0x7D)).build());
        this.iiIIIIiIII = this.iIIiiIIIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u7eeb\u676f\u98c8\u827c"))).description(iiIiiiiIii.ALLATORIxDEMO("\u6e71\u67f0\u65fd\u5773\u7efc\u6758\u76da\u98ef\u8266"))).defaultValue(new SettingColor(0x7E & 0x79, 0x32FC & 0x4DDF, 0x6FF & 0x79FF, 0x9F7 & 0x76BC)).build());
        iiiIIiiiII iiiIIiiiII3 = this;
        iiiIIiiiII3.IiiIIiiiiI = new ArrayList<class_2338>();
        iiiIIiiiII iiiIIiiiII4 = this;
        iiiIIiiiII3.IiiIIIiiIi = new iiIiiIIIiI(1000L);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiIIiiiII.ALLATORIxDEMO("#EV\b\u0007KT[\u0004J5z1/T\u8bd9\u6680\u659e\u5244\u672e\u65e4\u7246\u6778\uff0f"));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iiiIIiiiII iiiIIiiiII4;
        iiiIIiiiII iiiIIiiiII2;
        iiiIIiiiII iiiIIiiiII3 = iiiIIiiiII2 = iiiIIiiiII4;
        iiiIIiiiII3.IiiIIiiiiI.clear();
        for (class_2338 this_ : IiiIiIIIIi.ALLATORIxDEMO(((Double)iiiIIiiiII3.IiIIiIiiiI.get()).floatValue())) {
            if (!iiiIIiiiII2.ALLATORIxDEMO(this_) || iiiIIiiiII2.IiiIIIiiIi.ALLATORIxDEMO(this_)) continue;
            iiiIIiiiII2.IiiIIiiiiI.add(this_);
        }
    }

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

