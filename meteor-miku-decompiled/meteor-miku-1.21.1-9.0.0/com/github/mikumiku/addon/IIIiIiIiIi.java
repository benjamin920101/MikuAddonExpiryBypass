/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.BlockBreakingCooldownEvent
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BlockListSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Categories
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.render.RenderUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.meteorclient.utils.world.BlockIterator
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.world.BlockView
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiIIIIi;
import com.github.mikumiku.addon.IIiIiIiiII;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.MEnum;
import com.github.mikumiku.addon.modules.Nuker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.events.entity.player.BlockBreakingCooldownEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BlockListSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Categories;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.render.RenderUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.BlockIterator;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.world.BlockView;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;

public class IIIiIiIiIi
extends iiiiIiIiii {
    private final Setting<SettingColor> IIIiIIiiIi;
    private final class_2338.class_2339 IiIiiIIiiI;
    private final Setting<Integer> iIIIIiiiii;
    private final Setting<SettingColor> IiIiIIIiiI;
    private final Setting<Boolean> iIIIIiiiIi;
    private final Setting<Integer> iiIIiiIiIi;
    private final Setting<List<class_2248>> IiiIIiIiIi;
    private final class_2338.class_2339 iiiiIiiIIi;
    private final Setting<Nuker.Mode> iiIIiIiiIi;
    private final Setting<Integer> IiIiiiiIIi;
    private final Setting<SettingColor> iiIIiIiiII;
    private final SettingGroup IIiIiiIiIi;
    private int IIiIIiIIii;
    private final Setting<Integer> iIiiIiiiii;
    public int iIiIiiIiiI;
    private final Setting<Nuker.SortMode> IIiiiiiiII;
    private final Setting<MEnum.ListMode> IIiiiIIIIi;
    private final Setting<Nuker.Shape> IIIiIIIiII;
    private final List<class_2338> iiIiIiiiiI;
    private final Setting<List<class_2248>> IIiiIiiiII;
    private final Setting<Boolean> IIIiIiiIIi;
    private final Setting<Integer> iiiIiIiIIi;
    private final Setting<Boolean> iIiIiIiIii;
    private boolean iiiiiIIIii;
    private final Setting<ShapeMode> iIIiIIiiII;
    private final Setting<ShapeMode> IiiIIiiiiI;
    private final Setting<Integer> IiIIIIiiii;
    private final SettingGroup IiiIIIiiIi;
    private final class_2338.class_2339 iiIIiiIiii;
    private final Setting<Integer> iIiiIiiiII;
    private int iIIiiIIIII;
    private final Setting<Integer> iiIiIIiIIi;
    private final Setting<Boolean> IIIIiIiiIi;
    private final Setting<SettingColor> IiIiIIIIiI;
    private final Setting<Boolean> iiiiiIIiiI;
    private final Setting<Double> iiIIIIiIII;
    public int IiIIiIiiiI;
    private final SettingGroup ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public static int ALLATORIxDEMO(int n, int n2, int n3, int n4, int n5, int n6) {
        int IiIIiIiiiI;
        void IiIIiIiiiI2;
        int IiIIiIiiiI3;
        void IiIIiIiiiI4;
        int IiIIiIiiiI5 = n4;
        int IiIIiIiiiI6 = n;
        IiIIiIiiiI5 = Math.abs(IiIIiIiiiI5 - IiIIiIiiiI6);
        IiIIiIiiiI3 = Math.abs((int)(IiIIiIiiiI4 - IiIIiIiiiI3));
        IiIIiIiiiI = Math.abs((int)(IiIIiIiiiI2 - IiIIiIiiiI));
        return Math.max(Math.max(IiIIiIiiiI5, IiIIiIiiiI3), IiIIiIiiiI);
    }

    public IIIiIiIiIi() {
        IIIiIiIiIi iIIiIiIiIi = this;
        super(Categories.Player, IIiIiIiiII.ALLATORIxDEMO(".0\u000b\u00002"), IIIIiIIIIi.ALLATORIxDEMO("\u8198\u52ec\u6379\u5466\u56d1"));
        iIIiIiIiIi.IIiIiiIiIi = iIIiIiIiIi.settings.getDefaultGroup();
        iIIiIiIiIi.IiiIIIiiIi = iIIiIiIiIi.settings.createGroup(IIiIiIiiII.ALLATORIxDEMO("\u0017-\t\u0011%)\t\u00164"));
        iIIiIiIiIi.ALLATORIxDEMO = iIIiIiIiIi.settings.createGroup(IIIIiIIIIi.ALLATORIxDEMO("\u000b\u0017*\u000bkW"));
        iIIiIiIiIi.IIIiIIIiII = iIIiIiIiIi.IIiIiiIiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("3-\u0001\u0015%"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u6364\u63dc\u76eb\u5f6c\u7293"))).defaultValue((Object)Nuker.Shape.IiIIiIiiiI)).build());
        this.iiIIiIiiIi = this.IIiIiiIiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("(\u000f\u0001%"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u6364\u63dc\u76eb\u65b7\u5f2a"))).defaultValue((Object)Nuker.Mode.IiIIiIiiiI)).build());
        this.iiIIIIiIII = this.IIiIiiIiIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("2$\u000e\u0002%"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u7870\u5720\u830d\u56d1"))).defaultValue(4.0).min(0.0).visible(() -> {
            if (this.IIIiIIIiII.get() != Nuker.Shape.iiIIIIiIII) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iiiIiIiIIi = this.IIiIiiIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("\u00100"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u5448\u4e78\u7870\u5720\u830d\u56d1"))).defaultValue((Object)(5 >> 2))).min(3 & 4).visible(() -> {
            if (this.IIIiIIIiII.get() == Nuker.Shape.iiIIIIiIII) {
                return 3 >> 1;
            }
            return false;
        })).build());
        this.iiIIiiIiIi = this.IIiIiiIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("!\u000f\u0012."))).description(IIIIiIIIIi.ALLATORIxDEMO("\u5448\u4e79\u7870\u5720\u830d\u56d1"))).defaultValue((Object)(--1))).min(2 & 5).visible(() -> {
            if (this.IIIiIIIiII.get() == Nuker.Shape.iiIIIIiIII) {
                return 5 >> 2;
            }
            return false;
        })).build());
        this.iIIIIiiiii = this.IIiIiiIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO(")\u0005\u00034"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u5448\u5d94\u7870\u5720\u830d\u56d1"))).defaultValue((Object)(4 ^ 5))).min(3 >> 2).visible(() -> {
            if (this.IIIiIIIiII.get() == Nuker.Shape.iiIIIIiIII) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iIiiIiiiii = this.IIiIiiIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("2,\u0007\r4"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u5448\u5381\u7870\u5720\u830d\u56d1"))).defaultValue((Object)(3 >> 1))).min(2 & 5).visible(() -> {
            if (this.IIIiIIIiII.get() == Nuker.Shape.iiIIIIiIII) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.IiIIIIiiii = this.IIiIiiIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("\u0006\n22\u0001\u0017$"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u5448\u523f\u7870\u5720\u830d\u56d1"))).defaultValue((Object)(2 ^ 3))).min(3 >> 2).visible(() -> {
            if (this.IIIiIIIiII.get() == Nuker.Shape.iiIIIIiIII) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iIiiIiiiII = this.IIiIiiIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("'\u0001\u0006+"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u5448\u547c\u7870\u5720\u830d\u56d1"))).defaultValue((Object)(--1))).min(2 & 5).visible(() -> {
            if (this.IIIiIIIiII.get() == Nuker.Shape.iiIIIIiIII) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.IiIiiiiIIi = this.IIiIiiIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("$ \f\u00049"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u7870\u5720\u95fa\u96b1"))).defaultValue((Object)(5 >> 3))).build());
        this.iiIiIIiIIi = this.IIiIiiIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("\r$\u0018h\u0002\t/&\u000b\u0016m5\u0005\u0017m1\t\u0006+"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u4e72\u6b7f\u7841\u5716\u65cb\u5713\u76eb\u657e\u91ea"))).defaultValue((Object)(3 & 5))).min(2 ^ 3).sliderRange(--1, 0x66 & 0x1F).build());
        this.IIiiiiiiII = this.IIiIiiIiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("3*\u0012\u0011m(\u000f\u0001%"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u65fd\u5738\u7b55\u902c"))).defaultValue((Object)Nuker.SortMode.iiIIIIiIII)).build());
        this.iiiiiIIiiI = this.IIiIiiIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("\u00167,\u000e\u0002m-\u0001\u000b$"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u6448\u626e"))).defaultValue((Object)(5 >> 2))).build());
        this.iIiIiIiIii = this.IIiIiiIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("\u0010\u0004#.\u0005\u0011m(\t\u000b%"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u4f3b\u7547\u530b\u6333"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.IIIIiIiiIi = this.IIiIiiIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("\u0017/1\u0001\u0011%"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u6754\u52d3\u562c\u7a80\u8f62\u5911"))).defaultValue((Object)(5 >> 2))).build());
        this.IIiiiIIIIi = this.IiiIIIiiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO(",,\u0013\u0011m(\u000f\u0001%"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u7b1f\u9066\u6a2f\u5f2a"))).defaultValue((Object)MEnum.ListMode.ALLATORIxDEMO)).build());
        this.IIiiIiiiII = this.IiiIIIiiIi.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("\")\u0001\u0006+)\t\u00164"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u4e54\u7846\u570b\u76eb\u65b7\u5772"))).visible(() -> {
            if (this.IIiiiIIIIi.get() == MEnum.ListMode.ALLATORIxDEMO) {
                return 3 >> 1;
            }
            return false;
        })).build());
        this.IiiIIiIiIi = this.IiiIIIiiIi.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("7-\t\u0011%)\t\u00164"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u7846\u570b\u76eb\u65b7\u5772"))).visible(() -> {
            if (this.IIiiiIIIIi.get() == MEnum.ListMode.iiiiiIIiiI) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        this.IIIiIiiIIi = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("'\u000f\u0010.!\t\u000b'h\u0002\n8"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u6e6b\u67a1\u7870\u5720\u830d\u56d1"))).defaultValue((Object)(3 >> 1))).build());
        this.iIIiIIiiII = this.ALLATORIxDEMO.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO(".0\u000b\u0000m'\u000f\u001dm(\u000f\u0001%"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u6e76\u67bc\u6a2f\u5f2a"))).defaultValue((Object)ShapeMode.Both)).build());
        this.IiIiIIIiiI = this.ALLATORIxDEMO.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("\u0016)!\u0005H#*\f\n2"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u8fd6\u9892\u8257"))).defaultValue(new SettingColor(0x16 & 0x79, 0x6F & 0x7A, 0x1DB7 & 0x62D8, 0x76 & 0x6D)).build());
        this.IiIiIIIIiI = this.ALLATORIxDEMO.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("\t)+\u0005H#*\f\n2"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u8f2a\u5ebc\u9892\u8257"))).defaultValue(new SettingColor(0x7F & 0x10, 0x6A & 0x7F, 0x30D9 & 0x4FB6, 0x6EFF & 0x11FF)).build());
        this.iIIIIiiiIi = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("\"7\u000f\u000e%+M\u0007,*\u0003\u000e3"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u88de\u786d\u573d\u65fd\u5738\u6e3c\u67f6"))).defaultValue((Object)(5 >> 2))).build());
        this.IiiIIiiiiI = this.ALLATORIxDEMO.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("\u000e\u0010+ M\u0007,*\u0003\u000em(\u000f\u0001%"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u6e47\u678a\u88d9\u7870\u5720\u65b7\u5772"))).defaultValue((Object)ShapeMode.Both)).visible(() -> this.iIIIIiiiIi.get())).build());
        this.iiIIiIiiII = this.ALLATORIxDEMO.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("\u0016)!\u0005H#*\f\n2"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u8fd6\u9892\u8257"))).defaultValue(new SettingColor(0x3FF & 0x7CFF, 5 >> 3, 5 >> 3, 0x73 & 0x5C)).visible(() -> this.iIIIIiiiIi.get())).build());
        int n = 0x16FF & 0x69FF;
        this.IIIiIIiiIi = this.ALLATORIxDEMO.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIiIiIiiII.ALLATORIxDEMO("\t)+\u0005H#*\f\n2"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u8f2a\u5ebc\u9892\u8257"))).defaultValue(new SettingColor(n, 2 & 5, 3 & 4, n)).visible(() -> this.iIIIIiiiIi.get())).build());
        IIIiIiIiIi iIIiIiIiIi2 = this;
        IIIiIiIiIi iIIiIiIiIi3 = this;
        IIIiIiIiIi iIIiIiIiIi4 = this;
        iIIiIiIiIi4.iiIiIiiiiI = new ArrayList<class_2338>();
        IIIiIiIiIi iIIiIiIiIi5 = this;
        iIIiIiIiIi3.iiIIiiIiii = new class_2338.class_2339();
        IIIiIiIiIi iIIiIiIiIi6 = this;
        iIIiIiIiIi5.IiIiiIIiiI = new class_2338.class_2339();
        IIIiIiIiIi iIIiIiIiIi7 = this;
        iIIiIiIiIi3.iiiiIiiIIi = new class_2338.class_2339();
        iIIiIiIiIi2.iIiIiiIiiI = 3 ^ 3;
        iIIiIiIiIi2.IiIIiIiiiI = 3 ^ 3;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiIiIiiII.ALLATORIxDEMO("2+Gf6\u0005e\u00155\u0004\u00044 AE\u8bb7\u66b1\u65d0\u5255\u6740\u65f5\u7228\u6749\uff41"));
        }
    }

    private /* synthetic */ void IiiiiiiIIi(class_2338 class_23382) {
        IIIiIiIiIi iIIiIiIiIi = iIIiIiIiIi2;
        IIIiIiIiIi iIIiIiIiIi2 = class_23382;
        IIIiIiIiIi IiIIiIiiiI = iIIiIiIiIi;
        if (((Boolean)IiIIiIiiiI.iIiIiIiIii.get()).booleanValue()) {
            IIIiIiIiIi iIIiIiIiIi3 = IiIIiIiiiI;
            IIIiIiIiIi iIIiIiIiIi4 = iIIiIiIiIi2;
            iIIiIiIiIi3.iiIIIIiIII.getNetworkHandler().sendPacket((class_2596)new class_2846(class_2846.class_2847.START_DESTROY_BLOCK, (class_2338)iIIiIiIiIi4, BlockUtils.getDirection((class_2338)iIIiIiIiIi4)));
            iIIiIiIiIi3.iiIIIIiIII.player.swingHand(class_1268.MAIN_HAND);
            IIIiIiIiIi iIIiIiIiIi5 = iIIiIiIiIi2;
            iIIiIiIiIi3.iiIIIIiIII.getNetworkHandler().sendPacket((class_2596)new class_2846(class_2846.class_2847.STOP_DESTROY_BLOCK, (class_2338)iIIiIiIiIi5, BlockUtils.getDirection((class_2338)iIIiIiIiIi5)));
            return;
        }
        BlockUtils.breakBlock((class_2338)iIIiIiIiIi2, (boolean)((Boolean)IiIIiIiiiI.iiiiiIIiiI.get()));
    }

    @EventHandler(priority=200)
    private /* synthetic */ void ALLATORIxDEMO(BlockBreakingCooldownEvent blockBreakingCooldownEvent) {
        IIIiIiIiIi iIIiIiIiIi = iIIiIiIiIi2;
        IIIiIiIiIi iIIiIiIiIi2 = blockBreakingCooldownEvent;
        IIIiIiIiIi IiIIiIiiiI = iIIiIiIiIi;
        ((BlockBreakingCooldownEvent)iIIiIiIiIi2).cooldown = 3 & 4;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        IIIiIiIiIi iIIiIiIiIi = iIIiIiIiIi2;
        IIIiIiIiIi iIIiIiIiIi2 = render3DEvent;
        IIIiIiIiIi IiIIiIiiiI = iIIiIiIiIi;
        if (((Boolean)IiIIiIiiiI.IIIiIiiIIi.get()).booleanValue() && IiIIiIiiiI.IIIiIIIiII.get() != Nuker.Shape.IiIIiIiiiI && IiIIiIiiiI.iiIIiIiiIi.get() != Nuker.Mode.iiIIIIiIII) {
            IIIiIiIiIi iIIiIiIiIi3 = IiIIiIiiiI;
            IIIiIiIiIi iIIiIiIiIi4 = IiIIiIiiiI;
            int this_ = Math.min(iIIiIiIiIi3.IiIiiIIiiI.getX(), iIIiIiIiIi4.iiiiIiiIIi.getX());
            int n = Math.min(iIIiIiIiIi3.IiIiiIIiiI.getY(), IiIIiIiiiI.iiiiIiiIIi.getY());
            int n2 = Math.min(iIIiIiIiIi4.IiIiiIIiiI.getZ(), IiIIiIiiiI.iiiiIiiIIi.getZ());
            int n3 = Math.max(iIIiIiIiIi3.IiIiiIIiiI.getX(), IiIIiIiiiI.iiiiIiiIIi.getX());
            int n4 = Math.max(iIIiIiIiIi3.IiIiiIIiiI.getY(), IiIIiIiiiI.iiiiIiiIIi.getY());
            int n5 = Math.max(iIIiIiIiIi3.IiIiiIIiiI.getZ(), IiIIiIiiiI.iiiiIiiIIi.getZ());
            ((Render3DEvent)iIIiIiIiIi2).renderer.box((double)this_, (double)n, (double)n2, (double)n3, (double)n4, (double)n5, (Color)IiIIiIiiiI.IiIiIIIiiI.get(), (Color)IiIIiIiiiI.IiIiIIIIiI.get(), (ShapeMode)IiIIiIiiiI.iIIiIIiiII.get(), 2 & 5);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IIIiIiIiIi iIIiIiIiIi;
        IIIiIiIiIi iIIiIiIiIi2 = iIIiIiIiIi3;
        IIIiIiIiIi iIIiIiIiIi3 = pre;
        IIIiIiIiIi IiIIiIiiiI = iIIiIiIiIi2;
        if (IiIIiIiiiI.IIiIIiIIii > 0) {
            IiIIiIiiiI.IIiIIiIIii -= --1;
            return;
        }
        IIIiIiIiIi iIIiIiIiIi4 = IiIIiIiiiI;
        double d = iIIiIiIiIi4.iiIIIIiIII.player.getX();
        double d2 = iIIiIiIiIi4.iiIIIIiIII.player.getY();
        double d3 = iIIiIiIiIi4.iiIIIIiIII.player.getZ();
        double d4 = Math.pow((Double)iIIiIiIiIi4.iiIIIIiIII.get(), 2.0);
        if (IiIIiIiiiI.IIIiIIIiII.get() == Nuker.Shape.ALLATORIxDEMO) {
            IIIiIiIiIi iIIiIiIiIi5 = IiIIiIiiiI;
            iIIiIiIiIi5.iiIIIIiIII.set((Object)Math.round((Double)iIIiIiIiIi5.iiIIIIiIII.get()));
        }
        double d5 = d;
        double d6 = d3;
        int this2 = (int)Math.round((Double)IiIIiIiiiI.iiIIIIiIII.get());
        if (IiIIiIiiiI.IIIiIIIiII.get() == Nuker.Shape.ALLATORIxDEMO) {
            IIIiIiIiIi iIIiIiIiIi6 = IiIIiIiiiI;
            IiIIiIiiiI.IiIiiIIiiI.set((d5 += 1.0) - (double)this2, d2 - (double)this2 + 1.0, d3 - (double)this2 + 1.0);
            iIIiIiIiIi = iIIiIiIiIi6;
            iIIiIiIiIi6.iiiiIiiIIi.set(d5 + (double)this2 - 1.0, d2 + (double)this2, d3 + (double)this2);
        } else {
            IIIiIiIiIi iIIiIiIiIi7 = IiIIiIiiiI;
            int n = Math.round(iIIiIiIiIi7.iiIIIIiIII.player.getRotationClient().y % 360.0f / 90.0f);
            n = Math.floorMod(n, --4);
            iIIiIiIiIi7.IiIiiIIiiI.set(d5 - (double)((Integer)IiIIiIiiiI.IiIIIIiiii.get()).intValue(), Math.ceil(d2) - (double)((Integer)IiIIiIiiiI.iiIIiiIiIi.get()).intValue(), d6 - (double)((Integer)IiIIiIiiiI.iIiiIiiiii.get()).intValue());
            IiIIiIiiiI.iiiiIiiIIi.set(d5 + (double)((Integer)IiIIiIiiiI.iIiiIiiiII.get()).intValue() + 1.0, Math.ceil(d2 + (double)((Integer)IiIIiIiiiI.iiiIiIiIIi.get()).intValue() + 1.0), d6 + (double)((Integer)IiIIiIiiiI.iIIIIiiiii.get()).intValue() + 1.0);
            switch (n) {
                case 0: {
                    IiIIiIiiiI.IiIiiIIiiI.set((d5 += 1.0) - (double)((Integer)IiIIiIiiiI.iIiiIiiiii.get() + (3 >> 1)), Math.ceil(d2) - (double)((Integer)IiIIiIiiiI.iiIIiiIiIi.get()).intValue(), (d6 += 1.0) - (double)((Integer)IiIIiIiiiI.iIiiIiiiII.get() + (2 ^ 3)));
                    IiIIiIiiiI.iiiiIiiIIi.set(d5 + (double)((Integer)IiIIiIiiiI.iIIIIiiiii.get()).intValue(), Math.ceil(d2 + (double)((Integer)IiIIiIiiiI.iiiIiIiIIi.get()).intValue() + 1.0), d6 + (double)((Integer)IiIIiIiiiI.IiIIIIiiii.get()).intValue());
                    IIIiIiIiIi iIIiIiIiIi8 = IiIIiIiiiI;
                    break;
                }
                case 2: {
                    d5 += 1.0;
                    IiIIiIiiiI.IiIiiIIiiI.set(d5 - (double)((Integer)IiIIiIiiiI.iIIIIiiiii.get() + (5 >> 2)), Math.ceil(d2) - (double)((Integer)IiIIiIiiiI.iiIIiiIiIi.get()).intValue(), (d6 += 1.0) - (double)((Integer)IiIIiIiiiI.IiIIIIiiii.get() + --1));
                    IiIIiIiiiI.iiiiIiiIIi.set(d5 + (double)((Integer)IiIIiIiiiI.iIiiIiiiii.get()).intValue(), Math.ceil(d2 + (double)((Integer)IiIIiIiiiI.iiiIiIiIIi.get()).intValue() + 1.0), d6 + (double)((Integer)IiIIiIiiiI.iIiiIiiiII.get()).intValue());
                    IIIiIiIiIi iIIiIiIiIi8 = IiIIiIiiiI;
                    break;
                }
                case 3: {
                    IiIIiIiiiI.IiIiiIIiiI.set((d5 += 1.0) - (double)((Integer)IiIIiIiiiI.iIiiIiiiII.get() + (5 >> 2)), Math.ceil(d2) - (double)((Integer)IiIIiIiiiI.iiIIiiIiIi.get()).intValue(), d6 - (double)((Integer)IiIIiIiiiI.iIIIIiiiii.get()).intValue());
                    IiIIiIiiiI.iiiiIiiIIi.set(d5 + (double)((Integer)IiIIiIiiiI.IiIIIIiiii.get()).intValue(), Math.ceil(d2 + (double)((Integer)IiIIiIiiiI.iiiIiIiIIi.get()).intValue() + 1.0), d6 + (double)((Integer)IiIIiIiiiI.iIiiIiiiii.get()).intValue() + 1.0);
                }
                default: {
                    IIIiIiIiIi iIIiIiIiIi8 = IiIIiIiiiI;
                }
            }
            iIIiIiIiIi8.iIiIiiIiiI = 1 + Math.max(Math.max(Math.max((Integer)IiIIiIiiiI.iIiiIiiiII.get(), (Integer)IiIIiIiiiI.iIiiIiiiii.get()), (Integer)IiIIiIiiiI.IiIIIIiiii.get()), (Integer)IiIIiIiiiI.iIIIIiiiii.get());
            IiIIiIiiiI.IiIIiIiiiI = (5 >> 2) + Math.max((Integer)IiIIiIiiiI.iiiIiIiIIi.get(), (Integer)IiIIiIiiiI.iiIIiiIiIi.get());
            iIIiIiIiIi = IiIIiIiiiI;
        }
        if (iIIiIiIiIi.iiIIiIiiIi.get() == Nuker.Mode.IiIIiIiiiI) {
            IiIIiIiiiI.IiIiiIIiiI.setY((int)Math.floor(d2));
        }
        class_238 class_2383 = new class_238(IiIIiIiiiI.IiIiiIIiiI.toCenterPos(), IiIIiIiiiI.iiiiIiiIIi.toCenterPos());
        BlockIterator.register((int)Math.max((int)Math.ceil((Double)IiIIiIiiiI.iiIIIIiIII.get() + 1.0), IiIIiIiiiI.iIiIiiIiiI), (int)Math.max((int)Math.ceil((Double)IiIIiIiiiI.iiIIIIiIII.get()), IiIIiIiiiI.IiIIiIiiiI), (class_23382, class_26802) -> {
            void IiIIiIiiiI;
            IIIiIiIiIi iIIiIiIiIi = iIIiIiIiIi2;
            IIIiIiIiIi iIIiIiIiIi2 = class_23382;
            IIIiIiIiIi IiIIiIiiiI2 = iIIiIiIiIi;
            switch (((Nuker.Shape)((Object)((Object)IiIIiIiiiI2.IIIiIIIiII.get()))).ordinal()) {
                case 2: {
                    void IiIIiIiiiI3;
                    void IiIIiIiiiI4;
                    void IiIIiIiiiI5;
                    void IiIIiIiiiI6;
                    if (!(Utils.squaredDistance((double)IiIIiIiiiI6, (double)IiIIiIiiiI5, (double)IiIIiIiiiI4, (double)((double)iIIiIiIiIi2.getX() + 0.5), (double)((double)iIIiIiIiIi2.getY() + 0.5), (double)((double)iIIiIiIiIi2.getZ() + 0.5)) > IiIIiIiiiI3)) break;
                    return;
                }
                case 1: {
                    if (!((double)IIIiIiIiIi.ALLATORIxDEMO(IiIIiIiiiI2.iiIIIIiIII.player.getBlockPos().getX(), IiIIiIiiiI2.iiIIIIiIII.player.getBlockPos().getY(), IiIIiIiiiI2.iiIIIIiIII.player.getBlockPos().getZ(), iIIiIiIiIi2.getX(), iIIiIiIiIi2.getY(), iIIiIiIiIi2.getZ()) >= (Double)IiIIiIiiiI2.iiIIIIiIII.get())) break;
                    return;
                }
                case 0: {
                    void IiIIiIiiiI7;
                    if (IiIIiIiiiI7.contains(class_243.ofCenter((class_2382)iIIiIiIiIi2))) break;
                    return;
                }
            }
            if (!BlockUtils.canBreak((class_2338)iIIiIiIiIi2, (class_2680)IiIIiIiiiI)) {
                return;
            }
            if (IiIIiIiiiI2.iiIIiIiiIi.get() == Nuker.Mode.IiIIiIiiiI && (double)iIIiIiIiIi2.getY() < Math.floor(IiIIiIiiiI2.iiIIIIiIII.player.getY())) {
                return;
            }
            if (IiIIiIiiiI2.iiIIiIiiIi.get() == Nuker.Mode.iiIIIIiIII && IiIIiIiiiI.getHardness((class_1922)IiIIiIiiiI2.iiIIIIiIII.world, (class_2338)iIIiIiIiIi2) != 0.0f) {
                return;
            }
            if (IiIIiIiiiI2.IIiiiIIIIi.get() == MEnum.ListMode.iiiiiIIiiI && !((List)IiIIiIiiiI2.IiiIIiIiIi.get()).contains(IiIIiIiiiI.getBlock())) {
                return;
            }
            if (IiIIiIiiiI2.IIiiiIIIIi.get() == MEnum.ListMode.ALLATORIxDEMO && ((List)IiIIiIiiiI2.IIiiIiiiII.get()).contains(IiIIiIiiiI.getBlock())) {
                return;
            }
            IiIIiIiiiI2.iiIiIiiiiI.add(iIIiIiIiIi2.toImmutable());
        });
        BlockIterator.after(() -> {
            block14: {
                IIIiIiIiIi iIIiIiIiIi;
                IIIiIiIiIi iIIiIiIiIi2;
                if (this.IIiiiiiiII.get() == Nuker.SortMode.IiIIiIiiiI) {
                    this.iiIiIiiiiI.sort(Comparator.comparingDouble(IiIIiIiiiI -> -IiIIiIiiiI.getY()));
                    iIIiIiIiIi2 = this;
                } else {
                    if (this.IIiiiiiiII.get() != Nuker.SortMode.ALLATORIxDEMO) {
                        this.iiIiIiiiiI.sort(Comparator.comparingDouble(class_23382 -> {
                            void IiIIiIiiiI;
                            void IiIIiIiiiI2;
                            void IiIIiIiiiI3;
                            IIIiIiIiIi iIIiIiIiIi = iIIiIiIiIi2;
                            IIIiIiIiIi iIIiIiIiIi2 = class_23382;
                            IIIiIiIiIi IiIIiIiiiI4 = iIIiIiIiIi;
                            return Utils.squaredDistance((double)IiIIiIiiiI3, (double)IiIIiIiiiI2, (double)IiIIiIiiiI, (double)((double)iIIiIiIiIi2.getX() + 0.5), (double)((double)iIIiIiIiIi2.getY() + 0.5), (double)((double)iIIiIiIiIi2.getZ() + 0.5)) * (double)(IiIIiIiiiI4.IIiiiiiiII.get() == Nuker.SortMode.iiIIIIiIII ? 3 & 5 : -1);
                        }));
                    }
                    iIIiIiIiIi2 = this;
                }
                if (iIIiIiIiIi2.iiIiIiiiiI.isEmpty()) {
                    int n = this.iIIiiIIIII;
                    this.iIIiiIIIII = n + (4 ^ 5);
                    if (n >= (Integer)this.IiIiiiiIIi.get()) {
                        this.iiiiiIIIii = --1;
                    }
                    return;
                }
                this.iIIiiIIIII = 5 >> 3;
                if (!this.iiiiiIIIii) {
                    IIIiIiIiIi iIIiIiIiIi3 = this;
                    if (!iIIiIiIiIi3.iiIIiiIiii.equals((Object)iIIiIiIiIi3.iiIiIiiiiI.getFirst())) {
                        this.IIiIIiIIii = (Integer)this.IiIiiiiIIi.get();
                        this.iiiiiIIIii = 3 & 4;
                        this.iiIIiiIiii.set((class_2382)this.iiIiIiiiiI.getFirst());
                        if (this.IIiIIiIIii > 0) {
                            return;
                        }
                    }
                }
                int IiIIiIiiiI222 = 0;
                for (class_2338 IiIIiIiiiI322 : this.iiIiIiiiiI) {
                    if (IiIIiIiiiI222 >= (Integer)this.iiIiIIiIIi.get()) {
                        iIIiIiIiIi = this;
                    } else {
                        IIIiIiIiIi iIIiIiIiIi4;
                        boolean bl = BlockUtils.canInstaBreak((class_2338)IiIIiIiiiI322);
                        if (((Boolean)this.IIIIiIiiIi.get()).booleanValue()) {
                            Rotations.rotate((double)Rotations.getYaw((class_2338)IiIIiIiiiI322), (double)Rotations.getPitch((class_2338)IiIIiIiiiI322), () -> {
                                IIIiIiIiIi iIIiIiIiIi = iIIiIiIiIi2;
                                IIIiIiIiIi iIIiIiIiIi2 = IiIIiIiiiI322;
                                IIIiIiIiIi IiIIiIiiiI = iIIiIiIiIi;
                                IiIIiIiiiI.IiiiiiiIIi((class_2338)iIIiIiIiIi2);
                            });
                            iIIiIiIiIi4 = this;
                        } else {
                            IIIiIiIiIi iIIiIiIiIi4 = this;
                            iIIiIiIiIi4 = iIIiIiIiIi4;
                            iIIiIiIiIi5.IiiiiiiIIi(IiIIiIiiiI322);
                        }
                        if (((Boolean)iIIiIiIiIi4.iIIIIiiiIi.get()).booleanValue()) {
                            boolean bl2 = 5 >> 3;
                            RenderUtils.renderTickingBlock((class_2338)IiIIiIiiiI322, (Color)((Color)this.iiIIiIiiII.get()), (Color)((Color)this.IIIiIIiiIi.get()), (ShapeMode)((ShapeMode)this.IiiIIiiiiI.get()), (int)(bl2 ? 1 : 0), (int)(0x1A & 0x6D), (boolean)(--1 != 0), (boolean)bl2);
                        }
                        ++IiIIiIiiiI222;
                        this.iiIIiiIiii.set((class_2382)IiIIiIiiiI322);
                        if (bl || ((Boolean)this.iIiIiIiIii.get()).booleanValue()) continue;
                        iIIiIiIiIi = this;
                    }
                    break block14;
                }
                iIIiIiIiIi = this;
            }
            iIIiIiIiIi.iiiiiIIIii = false;
            this.iiIiIiiiiI.clear();
        });
    }

    @Override
    public void onActivate() {
        IIIiIiIiIi iIIiIiIiIi = this;
        this.iiiiiIIIii = --1;
        iIIiIiIiIi.IIiIIiIIii = 5 >> 3;
        iIIiIiIiIi.iIIiiIIIII = 3 >> 2;
    }
}

