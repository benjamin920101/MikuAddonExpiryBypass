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
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.MathHelper
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiIiIIiIII;
import com.github.mikumiku.addon.IiIiiIIiIi;
import com.github.mikumiku.addon.IiiIiIIIIi;
import com.github.mikumiku.addon.iiIiiIIIiI;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BlockSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;

public class iIiIiIIIiI
extends iiiiIiIiii {
    public int iIIiIIiiII;
    public Setting<Integer> IiiIIiiiiI;
    public SettingGroup IiIIIIiiii;
    public Setting<Double> IiiIIIiiIi;
    public Setting<SettingColor> iiIIiiIiii;
    public Setting<Integer> iIiiIiiiII;
    public Setting<class_2248> iIIiiIIIII;
    public List<class_2338> iiIiIIiIIi;
    public Setting<ShapeMode> IIIIiIiiIi;
    public Setting<Boolean> IiIiIIIIiI;
    private final iiIiiIIIiI iiiiiIIiiI;
    public SettingGroup iiIIIIiIII;
    public int IiIIiIiiiI;
    public Setting<SettingColor> ALLATORIxDEMO;

    public iIiIiIIIiI() {
        iIiIiIIIiI iIiIiIIIiI2 = this;
        super(IiIiIIiIII.ALLATORIxDEMO("\u7905\u4fa0\u6521\u7f65\u6586\u577c"), IiIiiIIiIi.ALLATORIxDEMO("\u81b4\u528a\u5eba\u901a\u8142\u4e35\u6562\u7f52\u65e7\u5775\u76c4\u7943\u4f90\u001at\u5c66\u796b\u0013\u0013Y(P/\u0016u[\tj\u0015Rp>>_;K\bw\u00102\\n3m\u0015\u001f`Q2z:]4Fa\u7541\u6cde"));
        iIiIiIIIiI2.IiIIIIiiii = iIiIiIIIiI2.settings.getDefaultGroup();
        iIiIiIIIiI2.iiIIIIiIII = iIiIiIIIiI2.settings.createGroup(IiIiIIiIII.ALLATORIxDEMO("\u6e0d\u67f8"));
        iIiIiIIIiI2.IiiIIIiiIi = iIiIiIIIiI2.IiIIIIiiii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u5ed9\u9061\u836a\u56ff"))).description(IiIiIIiIII.ALLATORIxDEMO("\u81c1\u5297\u5ed1\u901f\u76af\u671f\u592c\u833c\u56df"))).defaultValue(4.0).range(0.0, 6.0).build());
        this.iIIiiIIIII = this.IiIIIIiiii.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u65d0\u575c"))).description(IiIiIIiIII.ALLATORIxDEMO("\u9022\u62d6\u7503\u4eb1\u5ed1\u903f\u768f\u6586\u577c"))).defaultValue((Object)class_2246.COBBLESTONE)).build());
        this.IiiIIiiiiI = this.IiIIIIiiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u6bf1\u6b7d\u651d\u7f2f\u6519\u91c4"))).description(IiIiIIiIII.ALLATORIxDEMO("\u6bd0\u4e21\u6e07\u6224\u5204\u6515\u7f51\u76af\u65a6\u575c\u654f\u91e4"))).defaultValue((Object)(5 >> 1))).sliderRange(4 ^ 5, 0x6F & 0x16).build());
        this.iIiiIiiiII = this.IiIIIIiiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u651d\u7f2f\u5e9f\u8fd4"))).description(IiIiIIiIII.ALLATORIxDEMO("\u6521\u7f65\u6586\u577c\u4e54\u95ff\u76bb\u5edd\u8fc0\u65fd\u95cb\uff23\u536a\u4f66\uff25_vhT\uff22"))).defaultValue((Object)(3 >> 2))).sliderRange(3 ^ 3, 0x7D & 0x16).build());
        this.IiIiIIIIiI = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u661d\u797b\u6e5b\u67d8"))).description(IiIiIIiIII.ALLATORIxDEMO("\u6610\u540d\u6621\u7931\u5fba\u6515\u7f51\u6592\u5768\u76af\u6e2d\u67d8\u98bb\u89e3"))).defaultValue((Object)(3 >> 1))).build());
        this.IIIIiIiiIi = this.iiIIIIiIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u6e11\u6792\u6a48\u5f04"))).description(IiIiIIiIII.ALLATORIxDEMO("\u9022\u62d6\u6e19\u67ec\u76af\u6621\u7931\u6a1e\u5f24"))).defaultValue((Object)ShapeMode.Both)).build());
        this.iiIIiiIiii = this.iiIIIIiIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u4f84\u9723\u98f5\u8279"))).description(IiIiIIiIII.ALLATORIxDEMO("\u5fba\u6515\u7f71\u65b2\u5768\u6e19\u67ec\u76af\u4f98\u9749\u5874\u514e\u98a3\u8259"))).defaultValue(new SettingColor(0x2DE7 & 0x529F, 0x14EF & 0x6BDE, 0xFEF & 0x70FB, 0x7E & 0x1F)).build());
        this.ALLATORIxDEMO = this.iiIIIIiIII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u7e9c\u6720\u98f5\u8279"))).description(IiIiIIiIII.ALLATORIxDEMO("\u5fba\u6515\u7f71\u65b2\u5768\u6e19\u67ec\u76af\u8f86\u686d\u7ea0\u676a\u98a3\u8259"))).defaultValue(new SettingColor(0x7F & 0x64, 0x1EF5 & 0x619F, 0x57EF & 0x28FD, 0x58 & 0x77)).build());
        iIiIiIIIiI iIiIiIIIiI3 = this;
        iIiIiIIIiI iIiIiIIIiI4 = this;
        iIiIiIIIiI4.iiIiIIiIIi = new ArrayList<class_2338>();
        iIiIiIIIiI3.iIIiIIiiII = 3 >> 2;
        iIiIiIIIiI3.IiIIiIiiiI = 3 ^ 3;
        iIiIiIIIiI iIiIiIIIiI5 = this;
        iIiIiIIIiI3.iiiiiIIiiI = new iiIiiIIIiI(1000L);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiIiiIIiIi.ALLATORIxDEMO("n0{\u001dm\u0019>\tN8\u007f\b\u000e(\u001e\u8bab\u66cd\u65eb\u520e\u675c\u6593\u7209\u6745\uff0a"));
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iIiIiIIIiI iIiIiIIIiI2 = this;
        if (((Boolean)iIiIiIIIiI2.IiIiIIIIiI.get()).booleanValue() && iIiIiIIIiI2.iiIiIIiIIi.size() > 0) {
            class_1792[] class_1792Array = new class_1792[2 ^ 3];
            class_1792Array[2 & 5] = ((class_2248)iIiIiIIIiI2.iIIiiIIIII.get()).asItem();
            if (IIIiIiIiii.ALLATORIxDEMO(class_1792Array).found()) {
                int n = this = 3 >> 2;
                while (n < iIiIiIIIiI2.iiIiIIiIIi.size()) {
                    void IiIIiIiiiI;
                    double d = iIiIiIIIiI2.iiIiIIiIIi.get(this).getX();
                    double d2 = iIiIiIIIiI2.iiIiIIiIIi.get(this).getY();
                    double d3 = iIiIiIIIiI2.iiIiIIiIIi.get(this).getZ();
                    double d4 = iIiIiIIIiI2.iiIiIIiIIi.get(this).getX() + (4 ^ 5);
                    double d5 = iIiIiIIIiI2.iiIiIIiIIi.get(this).getY() + (3 >> 1);
                    double d6 = iIiIiIIIiI2.iiIiIIiIIi.get(this).getZ() + (4 ^ 5);
                    int n2 = --1;
                    IiIIiIiiiI.renderer.box(d, d2, d3, d4, d5, d6, (Color)iIiIiIIIiI2.iiIIiiIiii.get(), (Color)iIiIiIIIiI2.ALLATORIxDEMO.get(), (ShapeMode)iIiIiIIIiI2.IIIIiIiiIi.get(), 3 ^ 3);
                    n = ++this;
                }
            }
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        iIiIiIIIiI iIiIiIIIiI2 = iIiIiIIIiI3;
        iIiIiIIIiI iIiIiIIIiI3 = class_23382;
        iIiIiIIIiI IiIIiIiiiI = iIiIiIIIiI2;
        if (iIiIiIIIiI3 == null) {
            return;
        }
        if (IiIIiIiiiI.iiIiIIiIIi.contains(iIiIiIIIiI3)) {
            return;
        }
        iIiIiIIIiI iIiIiIIIiI4 = IiIIiIiiiI;
        if (iIiIiIIIiI4.IiIIiIiiiI >= (Integer)iIiIiIIIiI4.IiiIIiiiiI.get()) {
            return;
        }
        if (IiIIiIiiiI.iiiiiIIiiI.ALLATORIxDEMO((class_2338)iIiIiIIIiI3)) {
            return;
        }
        if ((double)class_3532.sqrt((float)((float)iiiIIIIiiI.ALLATORIxDEMO().squaredDistanceTo(iIiIiIIIiI3.toCenterPos()))) > (Double)IiIIiIiiiI.IiiIIIiiIi.get()) {
            return;
        }
        int n = IIIiIiIiii.iiIiiiiiII(((class_2248)IiIIiIiiiI.iIIiiIIIII.get()).asItem());
        if (n == -4 >> 2) {
            return;
        }
        IiIIiIiiiI.iiIiIIiIIi.add((class_2338)iIiIiIIIiI3);
        IIIiIiIiii.ALLATORIxDEMO(n);
        iiiIIIIiiI.IiIiiiIIiI((class_2338)iIiIiIIIiI3);
        IIIiIiIiii.ALLATORIxDEMO(n);
        IIIiIiIiii.IiiiiiiIIi();
        iIiIiIIIiI iIiIiIIIiI5 = IiIIiIiiiI;
        iIiIiIIIiI5.IiIIiIiiiI += --1;
        iIiIiIIIiI5.iiiiiIIiiI.ALLATORIxDEMO((class_2338)iIiIiIIIiI3);
    }

    public void onDeactivate() {
        this.iiiiiIIiiI.iIIiiiIiiI();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        int n;
        iIiIiIIIiI iIiIiIIIiI2 = iIiIiIIIiI3;
        class_2248 class_22482 = (class_2248)iIiIiIIIiI2.iIIiiIIIII.get();
        class_2350[] class_2350Array = class_2350.values();
        int n2 = class_2350Array.length;
        int n3 = n = 5 >> 3;
        while (n3 < n2) {
            void IiIIiIiiiI;
            iIiIiIIIiI iIiIiIIIiI3 = class_2350Array[n];
            if (iIiIiIIIiI3 != class_2350.DOWN && iIiIiIIIiI3 != class_2350.UP && iIiIiIIIiI2.iiIIIIiIII.world.getBlockState((class_2338)(iIiIiIIIiI3 = IiIIiIiiiI.offset((class_2350)iIiIiIIIiI3))).getBlock() == class_22482) {
                return (3 & 5) != 0;
            }
            n3 = ++n;
        }
        return false;
    }

    @EventHandler
    public void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIiIiIIIiI iIiIiIIIiI4;
        iIiIiIIIiI iIiIiIIIiI2;
        iIiIiIIIiI iIiIiIIIiI3 = iIiIiIIIiI2 = iIiIiIIIiI4;
        iIiIiIIIiI3.iiIiIIiIIi.clear();
        iIiIiIIIiI3.IiIIiIiiiI = 3 ^ 3;
        if (iIiIiIIIiI3.iIIiIIiiII < (Integer)iIiIiIIIiI2.iIiiIiiiII.get()) {
            iIiIiIIIiI2.iIIiIIiiII += 2 ^ 3;
            return;
        }
        iIiIiIIIiI2.iIIiIIiiII = 5 >> 3;
        for (class_2338 this_ : IiiIiIIIIi.ALLATORIxDEMO((Double)iIiIiIIIiI2.IiiIIIiiIi.get())) {
            if (!iiiIIIIiiI.IiiiiiiIIi(this_, 3 >> 1) || !iIiIiIIIiI2.ALLATORIxDEMO(this_) || this_.getY() != iIiIiIIIiI2.iiIIIIiIII.player.getBlockPos().down().getY() || iIiIiIIIiI2.iiIIIIiIII.world.getBlockState(this_).getBlock().asItem() != class_1802.AIR) continue;
            iIiIiIIIiI2.ALLATORIxDEMO(this_);
        }
    }

    @Override
    public void onActivate() {
        iIiIiIIIiI iIiIiIIIiI2 = this;
        super.onActivate();
        iIiIiIIIiI2.iiiiiIIiiI.IiiIIIIiiI();
    }
}

