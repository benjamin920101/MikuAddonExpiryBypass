/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Position
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiIIIIi;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIIiiIIiii;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;

public class iIiIiIIiii
extends iiiiIiIiii {
    private boolean iiIiIiiiiI;
    private final SettingGroup IIiiIiiiII;
    private int IIIiIiiIIi;
    private class_243 iiiIiIiIIi;
    private final Setting<Double> iIiIiIiIii;
    private boolean iiiiiIIIii;
    private final Setting<Double> iIIiIIiiII;
    private final Setting<Boolean> IiiIIiiiiI;
    private final Setting<Double> IiIIIIiiii;
    private final Setting<Boolean> IiiIIIiiIi;
    private final Setting<Boolean> iiIIiiIiii;
    private final Setting<Double> iIiiIiiiII;
    private final Setting<Double> iIIiiIIIII;
    private class_2338 iiIiIIiIIi;
    private final Setting<Integer> IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private final Setting<SettingColor> iiiiiIIiiI;
    private int iiIIIIiIII;
    private final SettingGroup IiIIiIiiiI;
    private final Setting<Integer> ALLATORIxDEMO;

    @Override
    public void onActivate() {
        if (this.iiIIIIiIII.player == null) {
            this.toggle();
            return;
        }
        this.iiiiiIIIii = 3 & 4;
        this.iiIiIiiiiI = 3 & 4;
        this.iiIiIIiIIi = this.ALLATORIxDEMO(((Double)this.iIiiIiiiII.get()).floatValue(), (2 ^ 3) != 0, (boolean)((Boolean)this.IiiIIiiiiI.get()), (boolean)((Boolean)this.IiIiIIIIiI.get()));
        iIiIiIIiii iIiIiIIiii2 = this;
        iIiIiIIiii2.iiIIIIiIII = 2 & 5;
        iIiIiIIiii2.IIIiIiiIIi = 3 & 4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ List<class_2338> ALLATORIxDEMO(float f, class_243 class_2432) {
        int n;
        class_2338 IiIIiIiiiI;
        void IiIIiIiiiI2;
        iIiIiIIiii iIiIiIIiii2 = this;
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        int n2 = (int)Math.ceil((double)IiIIiIiiiI2);
        IiIIiIiiiI = class_2338.ofFloored((class_2374)IiIIiIiiiI);
        int n3 = n = -n2;
        while (n3 <= n2) {
            int n4 = -n2;
            while (n4 <= n2) {
                int n5;
                int n6 = -n2;
                while (n6 <= n2) {
                    int n7;
                    class_2338 class_23382 = IiIIiIiiiI.add(n, n5, n7);
                    int n8 = n;
                    int n9 = n5;
                    int n10 = n7;
                    if (Math.sqrt(n8 * n8 + n9 * n9 + n10 * n10) <= (double)IiIIiIiiiI2) {
                        arrayList.add(class_23382);
                    }
                    n6 = ++n7;
                }
                n4 = ++n5;
            }
            n3 = ++n;
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ class_2350 ALLATORIxDEMO(class_2338 class_23382) {
        int n;
        void IiIIiIiiiI;
        iIiIiIIiii iIiIiIIiii2;
        block15: {
            block14: {
                iIiIiIIiii2 = iIiIiIIiii4;
                if (iIiIiIIiii2.iiIIIIiIII.world == null) {
                    return null;
                }
                if (!iIiIiIIiii2.IiiiiiiIIi(IiIIiIiiiI.down())) {
                    return null;
                }
                if (!iIiIiIIiii2.iiIIIIiIII.world.isAir((class_2338)IiIIiIiiiI) || !iIiIiIIiii2.iiIIIIiIII.world.isAir(IiIIiIiiiI.up())) break block14;
                if (iIiIiIIiii2.iiIIIIiIII.world.isAir(IiIIiIiiiI.up(--2))) break block15;
            }
            return null;
        }
        int n2 = 0;
        iIiIiIIiii iIiIiIIiii3 = null;
        class_2350[] class_2350Array = class_2350.values();
        int n3 = class_2350Array.length;
        int n4 = n = 3 ^ 3;
        while (n4 < n3) {
            iIiIiIIiii iIiIiIIiii4 = class_2350Array[n];
            if (iIiIiIIiii4 != class_2350.UP && iIiIiIIiii4 != class_2350.DOWN) {
                if (iIiIiIIiii2.IiiiiiiIIi(IiIIiIiiiI.offset((class_2350)iIiIiIIiii4))) {
                    ++n2;
                } else {
                    int n5 = 0;
                    class_2350[] class_2350Array2 = class_2350.values();
                    int n6 = class_2350Array2.length;
                    int n7 = 2 & 5;
                    while (n7 < n6) {
                        int n8;
                        class_2350 class_23502 = class_2350Array2[n8];
                        if (class_23502 != class_2350.DOWN && class_23502 != iIiIiIIiii4.getOpposite() && iIiIiIIiii2.IiiiiiiIIi(IiIIiIiiiI.offset((class_2350)iIiIiIIiii4).offset(class_23502))) {
                            ++n5;
                        }
                        n7 = ++n8;
                    }
                    if (n5 == --4) {
                        ++n2;
                    } else {
                        iIiIiIIiii3 = iIiIiIIiii4;
                    }
                }
            }
            n4 = ++n;
        }
        if (n2 == --3) {
            return iIiIiIIiii3;
        }
        return null;
    }

    private /* synthetic */ boolean IiiiiiiIIi(class_2338 class_23382) {
        iIiIiIIiii iIiIiIIiii2 = iIiIiIIiii3;
        iIiIiIIiii iIiIiIIiii3 = class_23382;
        iIiIiIIiii IiIIiIiiiI = iIiIiIIiii2;
        if (IiIIiIiiiI.iiIIIIiIII.world == null) {
            return (3 ^ 3) != 0;
        }
        if ((iIiIiIIiii3 = IiIIiIiiiI.iiIIIIiIII.world.getBlockState((class_2338)iIiIiIIiii3).getBlock()) == class_2246.OBSIDIAN || iIiIiIIiii3 == class_2246.NETHERITE_BLOCK || iIiIiIIiii3 == class_2246.ENDER_CHEST || iIiIiIIiii3 == class_2246.BEDROCK) {
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ float[] ALLATORIxDEMO(class_243 class_2432, class_243 class_2433) {
        void IiIIiIiiiI;
        iIiIiIIiii iIiIiIIiii2 = iIiIiIIiii3;
        iIiIiIIiii iIiIiIIiii3 = class_2432;
        iIiIiIIiii IiIIiIiiiI2 = iIiIiIIiii2;
        iIiIiIIiii3 = IiIIiIiiiI.subtract((class_243)iIiIiIIiii3);
        double d = ((class_243)iIiIiIIiii3).x;
        double d2 = ((class_243)iIiIiIIiii3).z;
        double d3 = Math.hypot(d, d2);
        iIiIiIIiii iIiIiIIiii4 = IiIIiIiiiI2;
        d = iIiIiIIiii4.ALLATORIxDEMO(Math.toDegrees(Math.atan2(d2, d)) - 90.0);
        d2 = iIiIiIIiii4.ALLATORIxDEMO(Math.toDegrees(-Math.atan2(((class_243)iIiIiIIiii3).y, d3)));
        float[] fArray = new float[1 ^ 3];
        fArray[2 & 5] = (float)d;
        fArray[--1] = (float)d2;
        return fArray;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        iIiIiIIiii IiIIiIiiiI = this;
        class_2350 class_23502 = IiIIiIiiiI.ALLATORIxDEMO((class_2338)(this = class_23382));
        if (class_23502 != null) {
            if ((class_23502 = IiIIiIiiiI.ALLATORIxDEMO((class_2338)(this = this.offset(class_23502)))) != null) {
                return (2 ^ 3) != 0;
            }
            return false;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent, SettingColor settingColor, double d, class_243 class_2432) {
        int n;
        iIiIiIIiii iIiIiIIiii2 = iIiIiIIiii3;
        iIiIiIIiii iIiIiIIiii3 = class_2432;
        iIiIiIIiii IiIIiIiiiI = iIiIiIIiii2;
        int n2 = (Integer)IiIIiIiiiI.IIIIiIiiIi.get();
        int n3 = n = 5 >> 3;
        while (n3 < n2) {
            void IiIIiIiiiI2;
            void IiIIiIiiiI3;
            void IiIIiIiiiI4;
            double d2 = Math.toRadians((double)n * 360.0 / (double)n2);
            double d3 = Math.toRadians((double)(n + (2 ^ 3)) * 360.0 / (double)n2);
            double d4 = Math.sin(d2) * IiIIiIiiiI4;
            d2 = Math.cos(d2) * IiIIiIiiiI4;
            double d5 = Math.sin(d3) * IiIIiIiiiI4;
            d3 = Math.cos(d3) * IiIIiIiiiI4;
            IiIIiIiiiI3.renderer.line(((class_243)iIiIiIIiii3).x + d4, ((class_243)iIiIiIIiii3).y, ((class_243)iIiIiIIiii3).z + d2, ((class_243)iIiIiIIiii3).x + d5, ((class_243)iIiIiIIiii3).y, ((class_243)iIiIiIIiii3).z + d3, (Color)IiIIiIiiiI2);
            n3 = ++n;
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iIiIiIIiii iIiIiIIiii2 = iIiIiIIiii5;
        if (iIiIiIIiii2.iiIiIIiIIi == null || iIiIiIIiii2.iiIIIIiIII.player == null) {
            return;
        }
        iIiIiIIiii iIiIiIIiii3 = iIiIiIIiii2;
        iIiIiIIiii2.iiiIiIiIIi = new class_243((double)iIiIiIIiii2.iiIiIIiIIi.getX() + 0.5, iIiIiIIiii2.iiIIIIiIII.player.getY(), (double)iIiIiIIiii2.iiIiIIiIIi.getZ() + 0.5);
        if (iIiIiIIiii3.ALLATORIxDEMO(iIiIiIIiii3.iiIiIIiIIi)) {
            iIiIiIIiii iIiIiIIiii4 = iIiIiIIiii2;
            iIiIiIIiii iIiIiIIiii5 = iIiIiIIiii4.ALLATORIxDEMO(iIiIiIIiii4.iiIiIIiIIi);
            if (iIiIiIIiii5 != null) {
                iIiIiIIiii2.iiiIiIiIIi = iIiIiIIiii2.iiiIiIiIIi.add((double)iIiIiIIiii5.getVector().getX() * 0.5, (double)iIiIiIIiii5.getVector().getY() * 0.5, (double)iIiIiIIiii5.getVector().getZ() * 0.5);
            }
        }
    }

    public iIiIiIIiii() {
        iIiIiIIiii iIiIiIIiii2 = this;
        super(iiiiIiIiii.ALLATORIxDEMO, IIIIiIIIIi.ALLATORIxDEMO("\u8f9f\u5795\u5ca7\u5774"), iIIiiIIiii.ALLATORIxDEMO("\u81bc\u528b\u8fad\u9647\u8fa7\u7687\u5bdf\u514b\u57ac\u5c8a\u5707\u3021"));
        iIiIiIIiii2.IIiiIiiiII = iIiIiIIiii2.settings.getDefaultGroup();
        iIiIiIIiii2.IiIIiIiiiI = iIiIiIIiii2.settings.createGroup(IIIIiIIIIi.ALLATORIxDEMO("\u6e3c\u67f6"));
        iIiIiIIiii2.IiiIIiiiiI = iIiIiIIiii2.IIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u4ead\u612c\u5707\u6d3d"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u6623\u5401\u630c\u633b\u4ea5\u617a\u7c22\u57f9\u76c0\u573e\u6d10\u3027"))).defaultValue((Object)(--1 != 0))).build());
        this.iIiiIiiiII = this.IIiiIiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u8355\u56d7"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u6445\u7d50\u570f\u6d6b\u76dd\u6772\u5963\u836c\u56fa\u3027"))).defaultValue(5.0).min(1.0).max(50.0).sliderMax(50.0).build());
        this.ALLATORIxDEMO = this.IIiiIiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u8dd3\u65d5\u526d\u6553"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u81cd\u52f1\u79f3\u7576\u5238\u76dd\u6772\u5963\u5254\u657e\u3027"))).defaultValue((Object)(0x78 & 0x2F))).min(3 & 4).max(0x7E & 0x65).sliderMax(0x77 & 0x6C).build());
        this.iIIiiIIIII = this.IIiiIiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u8b82\u65a0\u564b"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u798e\u52f1\u906d\u5ee2\u5062\u7389\u3027"))).defaultValue(1.0).min(0.1).max(8.0).sliderMax(8.0).build());
        this.IiIiIIIIiI = this.IIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u5447\u4e29"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u6623\u5401\u5118\u8bca\u544f\u4e7f\u79a2\u52da\u5274\u573e\u6d10\u3027"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.IiiIIIiiIi = this.IIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u0011Q?N\u6a77\u5f2c"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u4f26\u755aKU0\u001f\u5393\u4f29\u5f53\u510e\u5bfd\u6a4e\u5f01\u3027"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iIIiIIiiII = this.IIiiIiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u6b33\u8ff8"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u65be\u8f35\u6b17\u8f9f\u9070\u5ea8\u3027"))).defaultValue(0.8).min(0.0).max(1.0).sliderMax(1.0).visible(() -> this.IiiIIIiiIi.get())).build());
        this.IiIIIIiiii = this.IIiiIiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u4f3b\u511e\u7e84"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u6592\u8f1e\u4f5c\u5127\u7ea9\u3027"))).defaultValue(10.0).min(0.0).max(100.0).sliderMax(100.0).visible(() -> this.IiiIIIiiIi.get())).build());
        int n = 0x2DFF & 0x52FF;
        this.iiiiiIIiiI = this.IiIIiIiiiI.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u98ca\u8251"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u6e6c\u67a6\u575f\u577a\u76c0\u98f3\u827c\u3027"))).defaultValue(new SettingColor(n, 0x61FF & 0x1EFF, n, 0x6E & 0x75)).build());
        this.iIiIiIiIii = this.IiIIiIiiiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u5750\u572b\u5971\u5c2c"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u6e6c\u67a6\u575f\u577a\u76c0\u5948\u5c01\u3027"))).defaultValue(1.0).min(0.1).max(2.5).sliderMax(2.5).build());
        this.iiIIiiIiii = this.IiIIiIiiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u6e46\u53fb"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u665d\u5478\u4f0a\u7571\u6e62\u539c\u6527\u6792\u3027"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.IIIIiIiiIi = this.IiIIiIiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u5225\u6be3\u6553"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u5773\u5751\u76f6\u5e37\u6ebe\u5ea8\u3027"))).defaultValue((Object)(0x53F7 & 0x2CBC))).min(3 & 4).max(0x356A & 0x4BFD).sliderMax(0x7BE8 & 0x57F).build());
        iIiIiIIiii iIiIiIIiii3 = this;
        iIiIiIIiii3.iiIiIiiiiI = 3 & 4;
        iIiIiIIiii3.iiiiiIIIii = 5 >> 3;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIIiiIIiii.ALLATORIxDEMO("\u0001Ht\u0005%FVv&G\u0017w3\u0002V\u8bf4\u6682\u65b3\u5266\u6723\u65e6\u726b\u677a\uff22"));
        }
    }

    public void onDeactivate() {
        iIiIiIIiii iIiIiIIiii2 = iIiIiIIiii4;
        iIiIiIIiii2.iiIiIIiIIi = null;
        iIiIiIIiii2.iiIIIIiIII = 3 >> 2;
        iIiIiIIiii2.IIIiIiiIIi = 5 >> 3;
        if (iIiIiIIiii2.iiIIIIiIII.player != null && iIiIiIIiii2.iiIiIiiiiI && !((Boolean)iIiIiIIiii2.IiiIIIiiIi.get()).booleanValue()) {
            iIiIiIIiii iIiIiIIiii3 = iIiIiIIiii2;
            iIiIiIIiii iIiIiIIiii4 = iIiIiIIiii3.iiIIIIiIII.player.getVelocity();
            iIiIiIIiii3.iiIIIIiIII.player.setVelocity(0.0, ((class_243)iIiIiIIiii4).y, 0.0);
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        iIiIiIIiii iIiIiIIiii2 = iIiIiIIiii3;
        iIiIiIIiii iIiIiIIiii3 = receive;
        iIiIiIIiii IiIIiIiiiI = iIiIiIIiii2;
        if (((PacketEvent.Receive)iIiIiIIiii3).packet instanceof class_2708) {
            IiIIiIiiiI.toggle();
        }
    }

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

