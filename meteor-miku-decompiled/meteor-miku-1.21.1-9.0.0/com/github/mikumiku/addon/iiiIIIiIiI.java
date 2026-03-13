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
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.SlabBlock
 *  net.minecraft.state.property.Properties
 *  net.minecraft.state.property.Property
 *  net.minecraft.block.enums.SlabType
 *  net.minecraft.util.math.MathHelper
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiiIiIIIIi;
import com.github.mikumiku.addon.iIIIiiiiII;
import com.github.mikumiku.addon.iiIiiIIIiI;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.RoadBuilder;
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
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.SlabBlock;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.block.enums.SlabType;
import net.minecraft.util.math.MathHelper;

public class iiiIIIiIiI
extends iiiiIiIiii {
    public Setting<RoadBuilder.SlapType> iiiiiIIIii;
    public Setting<SettingColor> iIIiIIiiII;
    public SettingGroup IiiIIiiiiI;
    public SettingGroup IiIIIIiiii;
    public int IiiIIIiiIi;
    public Setting<Integer> iiIIiiIiii;
    public Setting<ShapeMode> iIiiIiiiII;
    public Setting<class_2248> iIIiiIIIII;
    private final iiIiiIIIiI iiIiIIiIIi;
    public Setting<Integer> IIIIiIiiIi;
    public Setting<Double> IiIiIIIIiI;
    public Setting<Boolean> iiiiiIIiiI;
    public int iiIIIIiIII;
    public Setting<SettingColor> IiIIiIiiiI;
    public List<class_2338> ALLATORIxDEMO;

    public iiiIIIiIiI() {
        iiiIIIiIiI iiiIIIiIiI2 = this;
        super(iIIIiiiiII.ALLATORIxDEMO("\u8175\u4e43\u5fa4\u9077\u6442\u5e3b\u53bf"), iIIIiiiiII.ALLATORIxDEMO("\u8182\u52c7\u5e92\u904f\u5e1b\u539f\u625e\u8155\u4e43\u6462\u8da7\uff43\u9768\u89ee\u6203\u52e7\u6556\u7b43\u4e48\u5718"));
        iiiIIIiIiI2.IiIIIIiiii = iiiIIIiIiI2.settings.getDefaultGroup();
        iiiIIIiIiI2.IiiIIiiiiI = iiiIIIiIiI2.settings.createGroup(iIIIiiiiII.ALLATORIxDEMO("\u6e7a\u679c"));
        iiiIIIiIiI2.IiIiIIIIiI = iiiIIIiIiI2.IiIIIIiiii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIIIiiiiII.ALLATORIxDEMO("\u5e92\u904f\u834b\u56bb"))).description(iIIIiiiiII.ALLATORIxDEMO("\u81a5\u52c0\u5e95\u9068\u76cb\u6768\u5948\u834b\u56bb"))).defaultValue(4.0).range(0.0, 6.0).build());
        this.iIIiiIIIII = this.IiIIIIiiii.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(iIIIiiiiII.ALLATORIxDEMO("\u65f1\u5718"))).description(iIIIiiiiII.ALLATORIxDEMO("\u9046\u6281\u7547\u4ec6\u5eb5\u9048\u76eb\u65f1\u5718"))).defaultValue((Object)class_2246.COBBLESTONE)).build());
        this.iiiiiIIIii = this.IiIIIIiiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iIIIiiiiII.ALLATORIxDEMO("\u5305\u787e\u65d6\u5459g\u59ea\u67f3\u6741f"))).description(iIIIiiiiII.ALLATORIxDEMO("\u5322\u7879\u65f1\u545e"))).defaultValue((Object)RoadBuilder.SlapType.iiIIIIiIII)).visible(() -> this.iIIiiIIIII.get() instanceof class_2482)).build());
        this.iiIIiiIiii = this.IiIIIIiiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIiiiiII.ALLATORIxDEMO("\u6b87\u6b6e\u6556\u7f01\u6538\u9180"))).description(iIIIiiiiII.ALLATORIxDEMO("\u6b87\u4e65\u6e70\u6240\u5253\u6551\u7f26\u76cb\u65d1\u5738\u6538\u9180"))).defaultValue((Object)(1 ^ 3))).sliderRange(--1, 0x47 & 0x3E).build());
        this.IIIIiIiiIi = this.IiIIIIiiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIIiiiiII.ALLATORIxDEMO("\u6556\u7f01\u5ebe\u8f90"))).description(iIIIiiiiII.ALLATORIxDEMO("\u6556\u7f01\u65d1\u5738\u4e23\u959b\u76cc\u5eb9\u8f97\u65b9\u95bc\uff47\u533d\u4f22\uff52;\u0001\f#\uff46"))).defaultValue((Object)(3 ^ 3))).sliderRange(3 & 4, 0x54 & 0x3F).build());
        this.iiiiiIIiiI = this.IiiIIiiiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIiiiiII.ALLATORIxDEMO("\u6656\u7955\u6e7a\u679c"))).description(iIIIiiiiII.ALLATORIxDEMO("\u6667\u5469\u6676\u7975\u5fcd\u6571\u7f06\u65d6\u571f\u76cb\u6e5a\u67bc\u98cc\u8987"))).defaultValue((Object)(3 >> 1))).build());
        this.iIiiIiiiII = this.IiiIIiiiiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iIIIiiiiII.ALLATORIxDEMO("\u6e5a\u67bc\u6a69\u5f40"))).description(iIIIiiiiII.ALLATORIxDEMO("\u9046\u6281\u6e5d\u679b\u76cb\u6656\u7955\u6a69\u5f40"))).defaultValue((Object)ShapeMode.Both)).build());
        this.IiIIiIiiiI = this.IiiIIiiiiI.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iIIIiiiiII.ALLATORIxDEMO("\u4fcf\u970d\u98d4\u823d"))).description(iIIIiiiiII.ALLATORIxDEMO("\u5fcd\u6571\u7f26\u65f6\u571f\u6e7d\u67bb\u76eb\u4fef\u972d\u5803\u512a\u98d4\u823d"))).defaultValue(new SettingColor(0x66BF & 0x19C7, 0x8CF & 0x77FE, 0x7EEF & 0x1FB, 0x5F & 0x3E)).build());
        this.iIIiIIiiII = this.IiiIIiiiiI.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iIIIiiiiII.ALLATORIxDEMO("\u7ed7\u670e\u98d4\u823d"))).description(iIIIiiiiII.ALLATORIxDEMO("\u5fcd\u6571\u7f26\u65f6\u571f\u6e7d\u67bb\u76eb\u8ff1\u6809\u7ed7\u670e\u98d4\u823d"))).defaultValue(new SettingColor(0x67 & 0x7C, 0x41FF & 0x3E95, 0x47FF & 0x38ED, 0x7C & 0x53)).build());
        iiiIIIiIiI iiiIIIiIiI3 = this;
        iiiIIIiIiI iiiIIIiIiI4 = this;
        iiiIIIiIiI4.ALLATORIxDEMO = new ArrayList<class_2338>();
        iiiIIIiIiI3.iiIIIIiIII = 3 >> 2;
        iiiIIIiIiI3.IiiIIIiiIi = 3 ^ 3;
        iiiIIIiIiI iiiIIIiIiI5 = this;
        iiiIIIiIiI3.iiIiIIiIIi = new iiIiiIIIiI(1000L);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIIIiiiiII.ALLATORIxDEMO("?\u0004JI\u001b\nH\u001a\u0018\u000b);-nh\u8bb8\u669c\u65df\u5278\u674f\u65d8\u7227\u6764\uff4e"));
        }
    }

    @Override
    public void onActivate() {
        iiiIIIiIiI iiiIIIiIiI2 = this;
        super.onActivate();
        iiiIIIiIiI2.iiIiIIiIIi.IiiIIIIiiI();
    }

    @EventHandler
    public void ALLATORIxDEMO(TickEvent.Pre pre) {
        iiiIIIiIiI iiiIIIiIiI5;
        iiiIIIiIiI iiiIIIiIiI2;
        iiiIIIiIiI iiiIIIiIiI3 = iiiIIIiIiI2 = iiiIIIiIiI5;
        iiiIIIiIiI3.ALLATORIxDEMO.clear();
        iiiIIIiIiI3.IiiIIIiiIi = 5 >> 3;
        if (iiiIIIiIiI3.iiIIIIiIII < (Integer)iiiIIIiIiI2.IIIIiIiiIi.get()) {
            iiiIIIiIiI2.iiIIIIiIII += 3 & 5;
            return;
        }
        iiiIIIiIiI iiiIIIiIiI4 = iiiIIIiIiI2;
        iiiIIIiIiI4.iiIIIIiIII = 2 & 5;
        class_243 IiIIiIiiiI = iiiIIIiIiI4.iiIIIIiIII.player.getEyePos();
        new class_2338((int)Math.round(IiIIiIiiiI.x), (int)Math.round(IiIIiIiiiI.y), (int)Math.round(IiIIiIiiiI.z));
        for (class_2338 this_ : IiiIiIIIIi.ALLATORIxDEMO((Double)iiiIIIiIiI4.IiIiIIIIiI.get())) {
            if (iiiIIIiIiI2.iIIiiIIIII.get() instanceof class_2482 && iiiIIIiIiI2.iiiiiIIIii.get() == RoadBuilder.SlapType.IiIIiIiiiI) {
                class_2338 class_23382 = this_;
                if (!iiiIIIIiiI.ALLATORIxDEMO(class_23382, iiiIIIIiiI.IiiiiiiIIi(class_23382, (3 & 5) != 0)) || iiiIIIiIiI2.iiIIIIiIII.world.getBlockState(this_).getBlock().asItem() != class_1802.AIR || !iiiIIIiIiI2.ALLATORIxDEMO(this_) || this_.getY() != iiiIIIiIiI2.iiIIIIiIII.player.getBlockPos().getY()) continue;
                iiiIIIiIiI2.ALLATORIxDEMO(this_);
                continue;
            }
            if (!iiiIIIIiiI.IiiiiiiIIi(this_, 3 >> 1) || !iiiIIIiIiI2.ALLATORIxDEMO(this_) || this_.getY() != iiiIIIiIiI2.iiIIIIiIII.player.getBlockPos().down().getY() || iiiIIIiIiI2.iiIIIIiIII.world.getBlockState(this_).getBlock().asItem() != class_1802.AIR) continue;
            iiiIIIiIiI2.ALLATORIxDEMO(this_);
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        int n;
        iiiIIIiIiI iiiIIIiIiI3;
        iiiIIIiIiI this_ = class_23382;
        iiiIIIiIiI IiIIiIiiiI = iiiIIIiIiI3;
        if (this_ == null) {
            return;
        }
        if (IiIIiIiiiI.ALLATORIxDEMO.contains(this_)) {
            return;
        }
        iiiIIIiIiI iiiIIIiIiI2 = IiIIiIiiiI;
        if (iiiIIIiIiI2.IiiIIIiiIi >= (Integer)iiiIIIiIiI2.iiIIiiIiii.get()) {
            return;
        }
        if (IiIIiIiiiI.iiIiIIiIIi.ALLATORIxDEMO((class_2338)this_)) {
            return;
        }
        if ((double)class_3532.sqrt((float)((float)iiiIIIIiiI.ALLATORIxDEMO().squaredDistanceTo(this_.toCenterPos()))) > (Double)IiIIiIiiiI.IiIiIIIIiI.get()) {
            return;
        }
        int n2 = IIIiIiIiii.iiIiiiiiII(((class_2248)IiIIiIiiiI.iIIiiIIIII.get()).asItem());
        if (n2 == -4 >> 2) {
            return;
        }
        iiiIIIiIiI iiiIIIiIiI4 = IiIIiIiiiI;
        iiiIIIiIiI4.ALLATORIxDEMO.add((class_2338)this_);
        IIIiIiIiii.ALLATORIxDEMO(n2);
        int cfr_ignored_0 = 5 >> 3;
        if (iiiIIIiIiI4.iIIiiIIIII.get() instanceof class_2482) {
            if (IiIIiIiiiI.iiiiiIIIii.get() == RoadBuilder.SlapType.iiIIIIiIII) {
                boolean bl = 4 ^ 5;
                iiiIIIIiiI.IiiiiiiIIi((class_2338)this_, bl, bl, bl);
                n = n2;
            } else {
                boolean bl = 2 ^ 3;
                iiiIIIIiiI.IiiIIIIiiI((class_2338)this_, bl, bl, bl);
                n = n2;
            }
        } else {
            iiiIIIIiiI.IiIiiiIIiI((class_2338)this_);
            n = n2;
        }
        IIIiIiIiii.ALLATORIxDEMO(n);
        IIIiIiIiii.IiiiiiiIIi();
        iiiIIIiIiI iiiIIIiIiI5 = IiIIiIiiiI;
        iiiIIIiIiI5.IiiIIIiiIi += 3 >> 1;
        iiiIIIiIiI5.iiIiIIiIIi.ALLATORIxDEMO((class_2338)this_);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        int n;
        iiiIIIiIiI iiiIIIiIiI2 = iiiIIIiIiI3;
        class_2248 class_22482 = (class_2248)iiiIIIiIiI2.iIIiiIIIII.get();
        RoadBuilder.SlapType slapType = (RoadBuilder.SlapType)((Object)iiiIIIiIiI2.iiiiiIIIii.get());
        boolean bl = class_22482 instanceof class_2482;
        class_2350[] class_2350Array = class_2350.values();
        int n2 = class_2350Array.length;
        int n3 = n = 3 & 4;
        while (n3 < n2) {
            iiiIIIiIiI iiiIIIiIiI3 = class_2350Array[n];
            if (iiiIIIiIiI3 != class_2350.DOWN && iiiIIIiIiI3 != class_2350.UP) {
                void IiIIiIiiiI;
                iiiIIIiIiI3 = IiIIiIiiiI.offset((class_2350)iiiIIIiIiI3);
                class_2248 class_22483 = iiiIIIiIiI2.iiIIIIiIII.world.getBlockState((class_2338)iiiIIIiIiI3).getBlock();
                if (bl) {
                    if (class_22483 instanceof class_2482) {
                        iiiIIIiIiI3 = (class_2771)iiiIIIiIiI2.iiIIIIiIII.world.getBlockState((class_2338)iiiIIIiIiI3).get((class_2769)class_2741.SLAB_TYPE);
                        if (slapType == RoadBuilder.SlapType.iiIIIIiIII && iiiIIIiIiI3 == class_2771.TOP) {
                            return 3 >> 1;
                        }
                        if (slapType == RoadBuilder.SlapType.IiIIiIiiiI && (iiiIIIiIiI3 == class_2771.BOTTOM || iiiIIIiIiI3 == class_2771.DOUBLE)) {
                            return true;
                        }
                    }
                } else if (class_22483 == class_22482) {
                    return 5 >> 2;
                }
            }
            n3 = ++n;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iiiIIIiIiI iiiIIIiIiI2 = this;
        if (((Boolean)iiiIIIiIiI2.iiiiiIIiiI.get()).booleanValue() && iiiIIIiIiI2.ALLATORIxDEMO.size() > 0) {
            class_1792[] class_1792Array = new class_1792[--1];
            class_1792Array[2 & 5] = ((class_2248)iiiIIIiIiI2.iIIiiIIIII.get()).asItem();
            if (IIIiIiIiii.ALLATORIxDEMO(class_1792Array).found()) {
                int n = this = 5 >> 3;
                while (n < iiiIIIiIiI2.ALLATORIxDEMO.size()) {
                    void IiIIiIiiiI;
                    double d = iiiIIIiIiI2.ALLATORIxDEMO.get(this).getX();
                    double d2 = iiiIIIiIiI2.ALLATORIxDEMO.get(this).getY();
                    double d3 = iiiIIIiIiI2.ALLATORIxDEMO.get(this).getZ();
                    double d4 = iiiIIIiIiI2.ALLATORIxDEMO.get(this).getX() + --1;
                    double d5 = iiiIIIiIiI2.ALLATORIxDEMO.get(this).getY() + (3 >> 1);
                    double d6 = iiiIIIiIiI2.ALLATORIxDEMO.get(this).getZ() + --1;
                    int n2 = --1;
                    IiIIiIiiiI.renderer.box(d, d2, d3, d4, d5, d6, (Color)iiiIIIiIiI2.IiIIiIiiiI.get(), (Color)iiiIIIiIiI2.iIIiIIiiII.get(), (ShapeMode)iiiIIIiIiI2.iIiiIiiiII.get(), 3 & 4);
                    n = ++this;
                }
            }
        }
    }

    public void onDeactivate() {
        this.iiIiIIiIIi.iIIiiiIiiI();
    }
}

