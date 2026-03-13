/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  fi.dy.masa.litematica.data.DataManager
 *  fi.dy.masa.litematica.world.SchematicWorldHandler
 *  fi.dy.masa.litematica.world.WorldSchematic
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
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
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.block.SlabBlock
 *  net.minecraft.block.StairsBlock
 *  net.minecraft.block.TrapdoorBlock
 *  net.minecraft.block.BlockState
 *  net.minecraft.state.property.Properties
 *  net.minecraft.block.enums.BlockHalf
 *  net.minecraft.state.property.Property
 *  net.minecraft.block.enums.SlabType
 *  net.minecraft.world.WorldView
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiiIiIIIIi;
import com.github.mikumiku.addon.iIIiiIIiii;
import com.github.mikumiku.addon.iIiIIiiIiI;
import com.github.mikumiku.addon.iIiIiIiIII;
import com.github.mikumiku.addon.iiIiiIIIiI;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.iiiiIiiiII;
import com.github.mikumiku.addon.modules.BestPrinter;
import fi.dy.masa.litematica.data.DataManager;
import fi.dy.masa.litematica.world.SchematicWorldHandler;
import fi.dy.masa.litematica.world.WorldSchematic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Properties;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.state.property.Property;
import net.minecraft.block.enums.SlabType;
import net.minecraft.world.WorldView;

public class IiIiIIiIiI
extends iiiiIiIiii {
    private final Setting<class_2248> iIiIiIIiiI;
    private int IIIiIIiiIi;
    private final Setting<Boolean> IiIiiIIiiI;
    private final Setting<Integer> iIIIIiiiii;
    private final Map<class_2338, class_2680> IiIiIIIiiI;
    private final Setting<class_2248> iIIIIiiiIi;
    private final Setting<ShapeMode> iiIIiiIiIi;
    private final Setting<Boolean> IiiIIiIiIi;
    private final Setting<Integer> iiiiIiiIIi;
    private final Setting<Boolean> iiIIiIiiIi;
    private final List<class_2248> IiIiiiiIIi;
    private final Setting<Boolean> iiIIiIiiII;
    private final Setting<class_2248> IIiIiiIiIi;
    private final iiIiiIIIiI IIiIIiIIii;
    private final Setting<BestPrinter.PlaceMode> iIiiIiiiii;
    private final Setting<class_2248> iIiIiiIiiI;
    private final Setting<Boolean> IIiiiiiiII;
    private final Setting<class_2248> IIiiiIIIIi;
    private final Setting<class_2248> IIIiIIIiII;
    private final Setting<Boolean> iiIiIiiiiI;
    private final ArrayList<class_2338> IIiiIiiiII;
    private final Setting<Double> IIIiIiiIIi;
    private final Setting<Boolean> iiiIiIiIIi;
    private final Setting<SettingColor> iIiIiIiIii;
    private final Setting<class_2248> iiiiiIIIii;
    private final Setting<class_2248> iIIiIIiiII;
    private final Setting<Boolean> IiiIIiiiiI;
    private final Setting<Boolean> IiIIIIiiii;
    private final Setting<Boolean> IiiIIIiiIi;
    private final Setting<Boolean> iiIIiiIiii;
    private final SettingGroup iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private final SettingGroup iiIiIIiIIi;
    private final SettingGroup IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private final Setting<class_2248> iiiiiIIiiI;
    private final SettingGroup iiIIIIiIII;
    private final Setting<SettingColor> IiIIiIiiiI;
    private final Setting<class_2248> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiIiiiiiII(class_2338 class_23382, class_2680 class_26802) {
        void IiIIiIiiiI;
        IiIiIIiIiI iiIiIIiIiI2;
        IiIiIIiIiI this_ = class_23382;
        IiIiIIiIiI IiIIiIiiiI2 = iiIiIIiIiI2;
        if (((Boolean)IiIIiIiiiI2.iiIIiIiiII.get()).booleanValue()) {
            iiiIIIIiiI.iiIiiiiiII((class_2338)this_);
            return;
        }
        if (!IiIIiIiiiI.getProperties().contains(class_2741.HORIZONTAL_FACING)) {
            boolean bl = 3 >> 1;
            iiiIIIIiiI.ALLATORIxDEMO((class_2338)this_, bl, bl, bl);
            return;
        }
        class_2350 class_23502 = (class_2350)IiIIiIiiiI.get((class_2769)class_2741.HORIZONTAL_FACING);
        if (!IiIIiIiiiI.getProperties().contains(class_2741.BLOCK_HALF)) {
            boolean bl = 3 >> 1;
            iiiIIIIiiI.ALLATORIxDEMO((class_2338)this_, bl, bl, bl, class_23502);
            return;
        }
        if ((class_2760)IiIIiIiiiI.get((class_2769)class_2741.BLOCK_HALF) == class_2760.TOP) {
            boolean bl = --1 != 0;
            iiiIIIIiiI.IiiiiiiIIi((class_2338)this_, bl, bl, bl);
            return;
        }
        boolean bl = --1 != 0;
        iiiIIIIiiI.ALLATORIxDEMO((class_2338)this_, bl, bl, bl, class_23502);
    }

    @EventHandler
    public void ALLATORIxDEMO(TickEvent.Post post) {
        int n;
        IiIiIIiIiI iiIiIIiIiI = iiIiIIiIiI2;
        IiIiIIiIiI iiIiIIiIiI2 = post;
        IiIiIIiIiI IiIIiIiiiI = iiIiIIiIiI;
        iiIiIIiIiI2 = SchematicWorldHandler.getSchematicWorld();
        if (IiIIiIiiiI.iiIIIIiIII.player == null || iiIiIIiIiI2 == null) {
            return;
        }
        IiIiIIiIiI iiIiIIiIiI3 = IiIIiIiiiI;
        if (iiIiIIiIiI3.IIIiIIiiIi < (Integer)iiIiIIiIiI3.iiiiIiiIIi.get()) {
            IiIIiIiiiI.IIIiIIiiIi += --1;
            return;
        }
        IiIiIIiIiI iiIiIIiIiI4 = IiIIiIiiiI;
        iiIiIIiIiI4.IIIiIIiiIi = 3 & 4;
        iiIiIIiIiI4.ALLATORIxDEMO();
        if (iiIiIIiIiI4.IIiiIiiiII.isEmpty()) {
            return;
        }
        int this2 = Math.min((Integer)IiIIiIiiiI.iIIIIiiiii.get(), IiIIiIiiiI.IIiiIiiiII.size());
        int n2 = n = 3 ^ 3;
        while (n2 < this2) {
            IiIIiIiiiI.ALLATORIxDEMO(n++);
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, class_2680 class_26802, int n) {
        class_2338 IiIIiIiiiI42;
        class_2338 class_23383;
        void IiIIiIiiiI2;
        class_2350 IiIIiIiiiI3;
        IiIiIIiIiI iiIiIIiIiI3;
        IiIiIIiIiI iiIiIIiIiI = iiIiIIiIiI3;
        if ((IiIIiIiiiI3 = (class_2350)IiIIiIiiiI3.get((class_2769)class_2741.HOPPER_FACING)) == class_2350.DOWN) {
            void v0 = IiIIiIiiiI2;
            class_2338 IiIIiIiiiI42 = v0.up();
            class_23383 = v0.down();
            IiIiIIiIiI iiIiIIiIiI2 = iiIiIIiIiI;
            IiIiIIiIiI this_ = iiIiIIiIiI2.iiIIIIiIII.world.getBlockState(IiIIiIiiiI42);
            boolean bl = this_.isSolid();
            boolean bl2 = iiIiIIiIiI2.iiIIIIiIII.world.getBlockState(class_23383).isSolid();
            if (!bl && !bl2) {
                return;
            }
        }
        boolean this_ = (class_23383 = iiIiIIiIiI.iiIIIIiIII.world.getBlockState(IiIIiIiiiI42 = IiIIiIiiiI2.offset(IiIIiIiiiI3))).isAir() || class_23383.isLiquid();
        if (this_) {
            return;
        }
        void v2 = IiIIiIiiiI2;
        if (((Boolean)iiIiIIiIiI.iiIIiIiiII.get()).booleanValue()) {
            iiiIIIIiiI.iiIiiiiiII((class_2338)v2);
            return;
        }
        boolean bl = 3 >> 1;
        iiiIIIIiiI.IiiIIIIiiI((class_2338)v2, true, bl, bl, IiIIiIiiiI3);
    }

    private /* synthetic */ boolean ALLATORIxDEMO(iIIiiIIiii iIIiiIIiii2) {
        IiIiIIiIiI iiIiIIiIiI = iIIiiIIiii3;
        iIIiiIIiii iIIiiIIiii3 = iIIiiIIiii2;
        IiIiIIiIiI IiIIiIiiiI = iiIiIIiIiI;
        if (iIIiiIIiii3.ALLATORIxDEMO.getBlock() != iIIiiIIiii3.iiIIIIiIII.getBlock()) {
            return --1 != 0;
        }
        return false;
    }

    private /* synthetic */ boolean IiiiiiiIIi(class_2680 class_26802) {
        IiIiIIiIiI iiIiIIiIiI = iiIiIIiIiI2;
        IiIiIIiIiI iiIiIIiIiI2 = class_26802;
        IiIiIIiIiI IiIIiIiiiI = iiIiIIiIiI;
        if (iiIiIIiIiI2.getBlock() != class_2246.AIR && iiIiIIiIiI2.getBlock().asItem() != class_1802.AIR) {
            return --1 != 0;
        }
        return false;
    }

    private /* synthetic */ int ALLATORIxDEMO(class_2680 class_26802) {
        IiIiIIiIiI iiIiIIiIiI = iiIiIIiIiI2;
        IiIiIIiIiI iiIiIIiIiI2 = class_26802;
        IiIiIIiIiI IiIIiIiiiI = iiIiIIiIiI;
        iiIiIIiIiI2 = iiIiIIiIiI2.getBlock();
        int n = IIIiIiIiii.iiIiiiiiII(iiIiIIiIiI2.asItem());
        if (n != -4 >> 2) {
            return n;
        }
        if (((Boolean)IiIIiIiiiI.iiiIiIiIIi.get()).booleanValue() && iiIiIIiIiI2 == class_2246.GRASS_BLOCK) {
            n = IIIiIiIiii.iiIiiiiiII(class_1802.DIRT);
            if (n != -4 >> 2) {
                return n;
            }
        }
        if (((Boolean)IiIIiIiiiI.iIIiiIIIII.get()).booleanValue() && (iiIiIIiIiI2 = IiIIiIiiiI.ALLATORIxDEMO((class_2248)iiIiIIiIiI2)) != null && iiIiIIiIiI2 != class_2246.AIR) {
            n = IIIiIiIiii.iiIiiiiiII(iiIiIIiIiI2.asItem());
            if (n != -4 >> 2) {
                return n;
            }
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, class_2680 class_26802, int n, class_2769<class_2350> class_27692) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IiIiIIiIiI iiIiIIiIiI2;
        IiIiIIiIiI this_ = class_26802;
        IiIiIIiIiI IiIIiIiiiI3 = iiIiIIiIiI2;
        class_2350 IiIIiIiiiI4 = (class_2350)this_.get((class_2769)IiIIiIiiiI2);
        this_ = IiIIiIiiiI3.IiiiiiiIIi(this_.getBlock()) ? IiIIiIiiiI4 : IiIIiIiiiI4.getOpposite();
        void v0 = IiIIiIiiiI;
        if (((Boolean)IiIIiIiiiI3.iiIIiIiiII.get()).booleanValue()) {
            iiiIIIIiiI.iiIiiiiiII((class_2338)v0);
            return;
        }
        boolean bl = 2 ^ 3;
        iiiIIIIiiI.ALLATORIxDEMO((class_2338)v0, true, bl, bl, (class_2350)this_);
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, int n) {
        IiIiIIiIiI iiIiIIiIiI = iiIiIIiIiI2;
        IiIiIIiIiI iiIiIIiIiI2 = class_23382;
        IiIiIIiIiI IiIIiIiiiI = iiIiIIiIiI;
        IiIiIIiIiI iiIiIIiIiI3 = iiIiIIiIiI2;
        if (((Boolean)IiIIiIiiiI.iiIIiIiiII.get()).booleanValue()) {
            iiiIIIIiiI.iiIiiiiiII((class_2338)iiIiIIiIiI3);
            return;
        }
        iiiIIIIiiI.IiIiiiIIiI((class_2338)iiIiIIiIiI3);
    }

    public IiIiIIiIiI() {
        IiIiIIiIiI iiIiIIiIiI = this;
        super(iiiiIiIiii.IiIiIIIIiI, iIiIIiiIiI.ALLATORIxDEMO("1\u000e72\u62e9\u5f16\u620f\u5337\u6746"), iIiIiIiIII.ALLATORIxDEMO("\u6715\u5f39\u620a\u5330\u6720\u3046\u6827\u6328\u6289\u5f29\u84df\u56be\u81f0\u52ec\u6520\u7f28\u65a5\u570f\u3000\t\u81b3\u52e4\u91db\u5eb3\u6286\u5f38\u6594\u4eb4\uff10\u0010zk<\t_0w\u0007\uff37\u4e69\u769a\u5e9e\u7b6f\u30664\u4f3b\u7536\u5229\u673e\u5939\u62942Wpk\u8c47/m+t0o\u6215\u4ef6\u4e42"));
        iiIiIIiIiI.IIIIiIiiIi = iiIiIIiIiI.settings.getDefaultGroup();
        iiIiIIiIiI.iIiiIiiiII = iiIiIIiIiI.settings.createGroup(iIiIIiiIiI.ALLATORIxDEMO("\u723e\u6bf6\u65de\u570b\u8bf9\u7f12"));
        iiIiIIiIiI.iiIIIIiIII = iiIiIIiIiI.settings.createGroup(iIiIiIiIII.ALLATORIxDEMO("\u66a6\u8866\u65aa\u571e"));
        iiIiIIiIiI.iiIiIIiIIi = iiIiIIiIiI.settings.createGroup(iIiIIiiIiI.ALLATORIxDEMO("\u6e75\u67af"));
        iiIiIIiIiI.iIiiIiiiii = iiIiIIiIiI.IIIIiIiiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u6567\u7f6d\u6a32\u5f46"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u51a8\u5bdd\u622f\u5317\u65e5\u5710\u658a\u76e3\u6562\u7f29\u9047\u8fd6\uff66\u4e42\u6860\u6251\u5474\u6cb2\u6a7d\u5f48\u307e"))).defaultValue((Object)BestPrinter.PlaceMode.IiIIiIiiiI)).build());
        this.iIIIIiiiii = this.IIIIiIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u6b8b\u6b3f\u6567\u7f6d\u6563\u9186"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u6bb3\u00135$\u0017\u6747\u5966\u6559\u7f32\u76c3\u65c5\u5730\u652c\u9188\u307e"))).defaultValue((Object)(1 ^ 3))).sliderRange(4 ^ 5, 0x67 & 0x1E).build());
        this.iiiiIiiIIi = this.IIIIiIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u6567\u7f6d\u5ee5\u8f96"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u4e43\u6b7d\u65fe\u572b\u6559\u7f32\u4e0c\u9588\u76c3\u5e8a\u8fb8\uff543\u0015\u00047\uff4e\u307e"))).defaultValue((Object)(3 >> 2))).sliderRange(3 & 4, 0x4E & 0x3B).build());
        this.IIIiIiiIIi = this.IIIIiIiiIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u6567\u7f6d\u8310\u56bd"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u6440\u7d65\u5393\u6579\u7f12\u65de\u570b\u76c3\u5336\u5fe3\u835f\u56b3\u307e"))).defaultValue(4.1).sliderRange(1.0, 7.0).build());
        this.IiIiiIIiiI = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u81b3\u52ab\u7eb3\u9550"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u8bf7\u5f29\u6234\u532c\u4f0a\u7f12\uff4b\u9565\u8b88\u81b6\u52ef\u636a\u63ee\u7efc\u6b24\u307e"))).defaultValue((Object)(3 >> 2))).build());
        this.iiIIiIiiII = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u7a23\u6c17\u652d\u7f27"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u5127\u8be5\u5753\u7a3a\u6c78\u4e7a\u651e\u7f75\u65da\u570f\uff6b\u65bc\u89a3\u6560\u7f15\u9610\u5255\u305a\u5e11\u4e48\u65dc\u544f\u5394\u80bd\u4e2d\u7ca5\u51a9\u3056\u976a\u89d0\u6767\u52f0\u5609\u6575\u6361w\u0000\u5de9\u77a2\u6553\u6366fg\u0013\u0015;k\\$\u001fG\u4e51\u6568\u637d]|t\u001f"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.IiIIIIiiii = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u7ee6\u77ed\u511a\u4ef5\u5917\u744f"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u6653\u5461\u5453\u754f\u7225\u6bcd\u6542\u7f09\u9067\u8fd6\u307e"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iiIiIiiiiI = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u6925\u68ac\u5917\u744f"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u6648\u547a\u5468\u7554\u693b\u68d3\u76e3\u7225\u6bcd\u6542\u7f09\u9067\u8fd6\u307e"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.IiiIIIiiIi = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u5313\u7815\u5917\u744f"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u6648\u547a\u5468\u7554\u530d\u786a\u76e3\u7225\u6bcd\u6542\u7f09\u9067\u8fd6\u307e"))).defaultValue((Object)(--1 != 0))).build());
        this.IiiIIiIiIi = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u6d25\u6726\u95eb\u5917\u744f"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u6653\u5441\u5473\u756f\u6d47\u6738\u9594\u76e3\u7225\u6bcd\u6542\u7f09\u9067\u8fd6\u307e"))).defaultValue((Object)(3 >> 1))).build());
        this.IIiiiiiiII = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u7032\u6289\u5917\u744f"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u6648\u547a\u5468\u7554\u702c\u62f6\u76e3\u7225\u6bcd\u6542\u7f09\u9067\u8fd6\u307e"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.IiIiIIIIiI = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u6f56\u6594\u5917\u744f"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u6653\u5461\u5453\u754f\u7225\u6bcd\u6542\u7f09\u9067\u8fd6\u307e"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iiIIiIiiIi = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u7be8\u5b53\u5917\u744f"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u6653\u5461\u5453\u754f\u7225\u6bcd\u6542\u7f09\u9067\u8fd6\u307e"))).defaultValue((Object)(5 >> 2))).build());
        this.iiiIiIiIIi = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u6cbc\u571c\u5917\u744f"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u8315\u65fe\u572b\u4e6a\u8def\u65b1\uff70\u6ca2\u5763\u4e38\u8bf8\u4e7d\u6653\u832e\u65e5\u5710\u307e"))).defaultValue((Object)(--1 != 0))).build());
        this.IiiIIiiiiI = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("z<af."))).description(iIiIIiiIiI.ALLATORIxDEMO("\u0018\u0002>2\u001bG0(\u001b"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iIIiiIIIII = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u5476\u752b\u66ec\u882c"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u5f34\u76b2\u6840\u65c5\u5730\u7f66\u5976\u658a\uff4b\u8196\u52cf\u4f23\u756f\u6683\u8802\u65e5\u5710\u307e"))).defaultValue((Object)(5 >> 2))).build());
        this.IIiiiIIIIi = this.iiIIIIiIII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u5381\u65e0\u5754>x"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u977c\u89c6\u88d7\u6698\u633e\u76c3\u65c5\u5730\u7c27\u57cc\u307e"))).defaultValue((Object)class_2246.GRASS_BLOCK)).visible(() -> this.iIIiiIIIII.get())).build());
        this.ALLATORIxDEMO = this.iiIIIIiIII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u66bb\u887b\u65e0\u5754>x"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u756f\u4ef2\u6698\u633e\u76c3\u65c5\u5730\u7c27\u57cc\u307e"))).defaultValue((Object)class_2246.DIRT)).visible(() -> this.iIIiiIIIII.get())).build());
        this.IIiIiiIiIi = this.iiIIIIiIII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u5381\u65e0\u5754>{"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u977c\u89c6\u88d7\u6698\u633e\u76c3\u65c5\u5730\u7c27\u57cc\u307e"))).defaultValue((Object)class_2246.MYCELIUM)).visible(() -> this.iIIiiIIIII.get())).build());
        this.IIIiIIIiII = this.iiIIIIiIII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u66bb\u887b\u65e0\u5754>{"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u756f\u4ef2\u6698\u633e\u76c3\u65c5\u5730\u7c27\u57cc\u307e"))).defaultValue((Object)class_2246.DIRT)).visible(() -> this.iIIiiIIIII.get())).build());
        this.iiiiiIIiiI = this.iiIIIIiIII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u5381\u65e0\u5754>z"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u977c\u89c6\u88d7\u6698\u633e\u76c3\u65c5\u5730\u7c27\u57cc\u307e"))).defaultValue((Object)class_2246.PODZOL)).visible(() -> this.iIIiiIIIII.get())).build());
        this.iIIiIIiiII = this.iiIIIIiIII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u66bb\u887b\u65e0\u5754>z"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u756f\u4ef2\u6698\u633e\u76c3\u65c5\u5730\u7c27\u57cc\u307e"))).defaultValue((Object)class_2246.DIRT)).visible(() -> this.iIIiiIIIII.get())).build());
        this.iIIIIiiiIi = this.iiIIIIiIII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u5381\u65e0\u5754>}"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u977c\u89c6\u88d7\u6698\u633e\u76c3\u65c5\u5730\u7c27\u57cc\u307e"))).defaultValue((Object)class_2246.STONE)).visible(() -> this.iIIiiIIIII.get())).build());
        this.iiiiiIIIii = this.iiIIIIiIII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u66bb\u887b\u65e0\u5754>}"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u756f\u4ef2\u6698\u633e\u76c3\u65c5\u5730\u7c27\u57cc\u307e"))).defaultValue((Object)class_2246.COBBLESTONE)).visible(() -> this.iIIiiIIIII.get())).build());
        this.iIiIiiIiiI = this.iiIIIIiIII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u5381\u65e0\u5754>|"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u977c\u89c6\u88d7\u6698\u633e\u76c3\u65c5\u5730\u7c27\u57cc\u307e"))).defaultValue((Object)class_2246.AIR)).visible(() -> this.iIIiiIIIII.get())).build());
        this.iIiIiIIiiI = this.iiIIIIiIII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u66bb\u887b\u65e0\u5754>|"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u756f\u4ef2\u6698\u633e\u76c3\u65c5\u5730\u7c27\u57cc\u307e"))).defaultValue((Object)class_2246.AIR)).visible(() -> this.iIIiiIIIII.get())).build());
        this.iiIIiiIiii = this.iiIiIIiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u6e6b\u67d0\u9897\u8981"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u6673\u5461\u6e4e\u6794\u622f\u5317\u65e5\u5710\u76f8\u98e3\u8994\u6801\u307e"))).defaultValue((Object)(--1 != 0))).build());
        this.iiIIiiIiIi = this.iiIiIIiIIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u6e6b\u67d0\u6a32\u5f46"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u904e\u6295\u6e55\u678f\u65fe\u5f73\uff5d\u7ec3\u6821\u305d\u582c\u5139\u6271\u4e78\u8042\u307e"))).defaultValue((Object)ShapeMode.Both)).build());
        this.iIiIiIiIii = this.iiIiIIiIIi.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u4ffe\u9761\u988f\u823b"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u6214\u530c\u65fe\u572b\u98e3\u8994\u76c3\u4fdb\u9705\u98c0\u8235\u307e"))).defaultValue(new SettingColor(5 >> 3, 0x7C & 0x7B, 0x5EFF & 0x21FF, 0x7E & 0x33)).build());
        this.IiIIiIiiiI = this.iiIiIIiIIi.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iIiIiIiIII.ALLATORIxDEMO("\u8fba\u6855\u823b"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u6214\u530c\u65fe\u572b\u98e3\u8994\u76c3\u7ec3\u6706\u98c0\u8235\u307e"))).defaultValue(new SettingColor(0x3F & 0x54, 0x2BF7 & 0x549A, 0x54EE & 0x2BF7, 0x6FF & 0x79FF)).build());
        IiIiIIiIiI iiIiIIiIiI2 = this;
        IiIiIIiIiI iiIiIIiIiI3 = this;
        iiIiIIiIiI3.IIiiIiiiII = new ArrayList();
        IiIiIIiIiI iiIiIIiIiI4 = this;
        iiIiIIiIiI3.IiIiIIIiiI = new HashMap<class_2338, class_2680>();
        iiIiIIiIiI2.IIIiIIiiIi = 3 ^ 3;
        class_2248[] class_2248Array = new class_2248[1 ^ 3];
        class_2248Array[2 & 5] = class_2246.OBSERVER;
        class_2248Array[3 & 5] = class_2246.HOPPER;
        iiIiIIiIiI2.IiIiiiiIIi = Arrays.asList(class_2248Array);
        IiIiIIiIiI iiIiIIiIiI5 = this;
        iiIiIIiIiI5.IIiIIiIIii = new iiIiiIIIiI(1000L);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIiIiIiIII.ALLATORIxDEMO("4R\u0001_7{DK4z\u0005Jtjd\u8be9\u66b7\u65a9\u5274\u671e\u65e9\u724b\u673f\uff48"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent, class_2338 class_23382) {
        void IiIIiIiiiI;
        IiIiIIiIiI iiIiIIiIiI = iiIiIIiIiI2;
        IiIiIIiIiI iiIiIIiIiI2 = class_23382;
        IiIiIIiIiI IiIIiIiiiI2 = iiIiIIiIiI;
        IiIiIIiIiI iiIiIIiIiI3 = iiIiIIiIiI2;
        double d = iiIiIIiIiI3.getX();
        double d2 = iiIiIIiIiI3.getY();
        double d3 = iiIiIIiIiI3.getZ();
        double d4 = iiIiIIiIiI3.getX() + (4 ^ 5);
        double d5 = iiIiIIiIiI3.getY() + (3 & 5);
        double d6 = iiIiIIiIiI3.getZ() + (3 & 5);
        IiIIiIiiiI.renderer.box(d, d2, d3, d4, d5, d6, (Color)IiIIiIiiiI2.iIiIiIiIii.get(), (Color)IiIIiIiiiI2.IiIIiIiiiI.get(), (ShapeMode)IiIIiIiiiI2.iiIIiiIiIi.get(), 3 ^ 3);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IiIiIIiIiI iiIiIIiIiI3;
        IiIiIIiIiI iiIiIIiIiI = iiIiIIiIiI3;
        WorldSchematic worldSchematic = SchematicWorldHandler.getSchematicWorld();
        List<class_2338> list = IiiIiIIIIi.ALLATORIxDEMO((Double)iiIiIIiIiI.IIIiIiiIIi.get());
        IiIiIIiIiI iiIiIIiIiI2 = iiIiIIiIiI;
        iiIiIIiIiI2.IIiiIiiiII.clear();
        iiIiIIiIiI2.IiIiIIIiiI.clear();
        for (class_2338 this_ : list) {
            if (!iiIiIIiIiI.ALLATORIxDEMO(this_, worldSchematic)) continue;
            iIIiiIIiii iIIiiIIiii2 = new iIIiiIIiii(iiIiIIiIiI.iiIIIIiIII.player.getWorld(), worldSchematic, this_);
            iiIiIIiIiI.IIiiIiiiII.add(this_);
            iiIiIIiIiI.IiIiIIIiiI.put(this_, iIIiiIIiii2.ALLATORIxDEMO);
        }
    }

    private /* synthetic */ boolean IiiiiiiIIi(class_2248 class_22482) {
        IiIiIIiIiI iiIiIIiIiI = iiIiIIiIiI2;
        IiIiIIiIiI iiIiIIiIiI2 = class_22482;
        IiIiIIiIiI IiIIiIiiiI = iiIiIIiIiI;
        return IiIIiIiiiI.IiIiiiiIIi.contains(iiIiIIiIiI2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IiiIIIIiiI(class_2338 class_23382, class_2680 class_26802) {
        void IiIIiIiiiI;
        void IiIIiIiiiI22322;
        IiIiIIiIiI iiIiIIiIiI2;
        IiIiIIiIiI iiIiIIiIiI = iiIiIIiIiI2;
        IiIiIIiIiI this_ = IiIIiIiiiI22322.getBlock();
        boolean bl = this_ == class_2246.WALL_TORCH || this_ == class_2246.REDSTONE_WALL_TORCH || this_ == class_2246.SOUL_WALL_TORCH;
        if (bl) {
            this_ = ((class_2350)IiIIiIiiiI22322.get((class_2769)class_2741.HORIZONTAL_FACING)).getOpposite();
            class_2338 class_23383 = IiIIiIiiiI.offset((class_2350)this_);
            class_2680 class_26803 = iiIiIIiIiI.iiIIIIiIII.world.getBlockState(class_23383);
            boolean IiIIiIiiiI22322 = class_26803.isAir() || class_26803.isLiquid();
            if (IiIIiIiiiI22322) {
                return;
            }
            IiIiIIiIiI IiIIiIiiiI22322 = this_;
            boolean bl2 = 3 & 5;
            iiiIIIIiiI.IiiIIIIiiI((class_2338)IiIIiIiiiI, bl2, bl2, bl2, (class_2350)IiIIiIiiiI22322);
            return;
        }
        this_ = IiIIiIiiiI.down();
        class_2680 class_26804 = iiIiIIiIiI.iiIIIIiIII.world.getBlockState((class_2338)this_);
        int n = !class_26804.isAir() && class_2248.sideCoversSmallSquare((class_4538)iiIiIIiIiI.iiIIIIiIII.world, (class_2338)this_, (class_2350)class_2350.UP) ? 4 ^ 5 : 0;
        if (n != 0) {
            boolean bl3 = 2 ^ 3;
            iiiIIIIiiI.ALLATORIxDEMO((class_2338)IiIIiIiiiI, bl3, bl3, bl3);
        }
    }

    private /* synthetic */ void IiiiiiiIIi(class_2338 class_23382, class_2680 class_26802) {
        class_2771 IiIIiIiiiI;
        IiIiIIiIiI iiIiIIiIiI2;
        IiIiIIiIiI this_ = class_23382;
        IiIiIIiIiI IiIIiIiiiI2 = iiIiIIiIiI2;
        if (((Boolean)IiIIiIiiiI2.iiIIiIiiII.get()).booleanValue()) {
            iiiIIIIiiI.iiIiiiiiII((class_2338)this_);
            return;
        }
        if (!IiIIiIiiiI.getProperties().contains(class_2741.SLAB_TYPE)) {
            boolean bl = 5 >> 2;
            iiiIIIIiiI.ALLATORIxDEMO((class_2338)this_, bl, bl, bl);
            return;
        }
        if ((IiIIiIiiiI = (class_2771)IiIIiIiiiI.get((class_2769)class_2741.SLAB_TYPE)) == class_2771.TOP) {
            boolean bl = --1 != 0;
            iiiIIIIiiI.IiiiiiiIIi((class_2338)this_, bl, bl, bl);
            return;
        }
        if (IiIIiIiiiI == class_2771.BOTTOM) {
            boolean bl = 2 ^ 3;
            iiiIIIIiiI.IiiIIIIiiI((class_2338)this_, bl, bl, bl);
            return;
        }
        if (IiIIiIiiiI == class_2771.DOUBLE) {
            boolean bl = 4 ^ 5;
            iiiIIIIiiI.IiiIIIIiiI((class_2338)this_, bl, bl, bl);
            return;
        }
        boolean bl = --1 != 0;
        iiiIIIIiiI.ALLATORIxDEMO((class_2338)this_, bl, bl, bl);
    }

    private /* synthetic */ boolean IiiiiiiIIi(class_2338 class_23382) {
        IiIiIIiIiI iiIiIIiIiI = iiIiIIiIiI2;
        IiIiIIiIiI iiIiIIiIiI2 = class_23382;
        IiIiIIiIiI IiIIiIiiiI = iiIiIIiIiI;
        if (iiIiIIiIiI2.getY() <= DataManager.getRenderLayerRange().getLayerMax()) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, class_2680 class_26802) {
        class_2760 IiIIiIiiiI;
        void IiIIiIiiiI2;
        IiIiIIiIiI iiIiIIiIiI2;
        IiIiIIiIiI iiIiIIiIiI = iiIiIIiIiI2;
        if (((Boolean)iiIiIIiIiI.iiIIiIiiII.get()).booleanValue()) {
            iiiIIIIiiI.iiIiiiiiII((class_2338)IiIIiIiiiI2);
            return;
        }
        void v0 = IiIIiIiiiI;
        v0.getBlock();
        IiIiIIiIiI this_ = (class_2350)v0.get((class_2769)class_2533.FACING);
        IiIIiIiiiI = (class_2760)IiIIiIiiiI.get((class_2769)class_2533.HALF);
        if (this_ == null || IiIIiIiiiI == null) {
            boolean bl = 3 >> 1;
            iiiIIIIiiI.ALLATORIxDEMO((class_2338)IiIIiIiiiI2, bl, bl, bl);
            return;
        }
        this_ = this_.getOpposite();
        if (IiIIiIiiiI == class_2760.TOP) {
            boolean bl = 5 >> 2;
            iiiIIIIiiI.IiiiiiiIIi((class_2338)IiIIiIiiiI2, bl, bl, bl, (class_2350)this_);
            return;
        }
        boolean bl = 3 >> 1;
        iiiIIIIiiI.ALLATORIxDEMO((class_2338)IiIIiIiiiI2, bl, bl, bl, (class_2350)this_);
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        IiIiIIiIiI iiIiIIiIiI = iiIiIIiIiI2;
        IiIiIIiIiI iiIiIIiIiI2 = class_23382;
        IiIiIIiIiI IiIIiIiiiI = iiIiIIiIiI;
        if (((Boolean)IiIIiIiiiI.iiIIiIiiII.get()).booleanValue()) {
            return 5 >> 2;
        }
        if (IiIIiIiiiI.iIiiIiiiii.get() == BestPrinter.PlaceMode.iiIIIIiIII) {
            return iiiIIIIiiI.ALLATORIxDEMO((class_2338)iiIiIIiIiI2, (Double)IiIIiIiiiI.IIIiIiiIIi.get(), --1 != 0);
        }
        if (iiiIIIIiiI.IiiiiiiIIi((class_2338)iiIiIIiIiI2, (2 ^ 3) != 0) != null) {
            return 5 >> 2;
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2680 class_26802) {
        IiIiIIiIiI iiIiIIiIiI = iiIiIIiIiI2;
        IiIiIIiIiI iiIiIIiIiI2 = class_26802;
        IiIiIIiIiI IiIIiIiiiI = iiIiIIiIiI;
        if (IiIIiIiiiI.ALLATORIxDEMO((class_2680)iiIiIIiIiI2) != -4 >> 2) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, WorldSchematic worldSchematic) {
        void IiIIiIiiiI;
        IiIiIIiIiI iiIiIIiIiI = object;
        Object object = worldSchematic;
        IiIiIIiIiI IiIIiIiiiI2 = iiIiIIiIiI;
        object = new iIIiiIIiii(IiIIiIiiiI2.iiIIIIiIII.player.getWorld(), (WorldSchematic)object, (class_2338)IiIIiIiiiI);
        if (((Boolean)IiIIiIiiiI2.IiiIIIiiIi.get()).booleanValue() && ((iIIiiIIiii)object).ALLATORIxDEMO.getBlock() instanceof class_2482 && !IiIIiIiiiI2.ALLATORIxDEMO((class_2338)IiIIiIiiiI, (iIIiiIIiii)object)) {
            return (3 & 4) != 0;
        }
        if (IiIIiIiiiI2.ALLATORIxDEMO((class_2338)IiIIiIiiiI) && IiIIiIiiiI2.IiiiiiiIIi(((iIIiiIIiii)object).ALLATORIxDEMO) && IiIIiIiiiI2.ALLATORIxDEMO((iIIiiIIiii)object) && IiIIiIiiiI2.IiiiiiiIIi((class_2338)IiIIiIiiiI) && IiIIiIiiiI2.ALLATORIxDEMO(((iIIiiIIiii)object).ALLATORIxDEMO) && !IiIIiIiiiI2.IIiiIiiiII.contains(IiIIiIiiiI) && !IiIIiIiiiI2.IIiIIiIIii.ALLATORIxDEMO((class_2338)IiIIiIiiiI)) {
            return --1 != 0;
        }
        return false;
    }

    public void onDeactivate() {
        IiIiIIiIiI iiIiIIiIiI = this;
        iiIiIIiIiI.IIIiIIiiIi = 2 & 5;
        iiIiIIiIiI.IIiiIiiiII.clear();
        iiIiIIiIiI.IiIiIIIiiI.clear();
        iiIiIIiIiI.IIiIIiIIii.iIIiiiIiiI();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, iIIiiIIiii iIIiiIIiii2) {
        class_2680 IiIIiIiiiI;
        IiIiIIiIiI iiIiIIiIiI = iterator;
        IiIIiIiiiI = IiIIiIiiiI.ALLATORIxDEMO;
        if (!IiIIiIiiiI.getProperties().contains(class_2741.SLAB_TYPE)) {
            return --1 != 0;
        }
        class_2771 class_27712 = (class_2771)IiIIiIiiiI.get((class_2769)class_2741.SLAB_TYPE);
        IiIIiIiiiI.getBlock();
        Iterator<class_2350> iterator = new ArrayList();
        iterator.add(class_2350.NORTH);
        iterator.add(class_2350.SOUTH);
        iterator.add(class_2350.EAST);
        iterator.add(class_2350.WEST);
        if (class_27712 == class_2771.TOP) {
            iterator.add(class_2350.UP);
        }
        if (class_27712 == class_2771.BOTTOM) {
            iterator.add(class_2350.DOWN);
        }
        if (class_27712 == class_2771.DOUBLE) {
            iterator.add(class_2350.UP);
            iterator.add(class_2350.DOWN);
        }
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            class_2680 class_26802;
            void IiIIiIiiiI2;
            class_2350 class_23502 = (class_2350)iterator.next();
            class_23502 = IiIIiIiiiI2.offset(class_23502);
            if ((class_23502 = iiIiIIiIiI.iiIIIIiIII.world.getBlockState((class_2338)class_23502)).getBlock() instanceof class_2482) {
                if (!class_23502.getProperties().contains(class_2741.SLAB_TYPE)) continue;
                class_26802 = (class_2771)class_23502.get((class_2769)class_2741.SLAB_TYPE);
                if (class_27712 == class_2771.TOP && (class_26802 == class_2771.TOP || class_26802 == class_2771.DOUBLE)) {
                    return true;
                }
                if (class_27712 == class_2771.BOTTOM && (class_26802 == class_2771.BOTTOM || class_26802 == class_2771.DOUBLE)) {
                    return true;
                }
                if (class_27712 != class_2771.DOUBLE) continue;
                return 3 >> 1;
            }
            class_26802 = (class_2680)class_2246.COBBLESTONE_SLAB.getDefaultState().with((class_2769)class_2482.TYPE, (Comparable)class_2771.TOP);
            class_26802 = IiIIiIiiiI;
            if (!class_26802.canPlaceAt((class_4538)iiIiIIiIiI.iiIIIIiIII.world, (class_2338)IiIIiIiiiI2)) continue;
            return (4 ^ 5) != 0;
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2248 class_22482) {
        IiIiIIiIiI iiIiIIiIiI = iiIiIIiIiI2;
        IiIiIIiIiI iiIiIIiIiI2 = class_22482;
        IiIiIIiIiI IiIIiIiiiI = iiIiIIiIiI;
        if (iiIiIIiIiI2 == class_2246.TORCH || iiIiIIiIiI2 == class_2246.WALL_TORCH || iiIiIIiIiI2 == class_2246.REDSTONE_TORCH || iiIiIIiIiI2 == class_2246.REDSTONE_WALL_TORCH || iiIiIIiIiI2 == class_2246.SOUL_TORCH || iiIiIIiIiI2 == class_2246.SOUL_WALL_TORCH) {
            return true;
        }
        return false;
    }

    private /* synthetic */ class_2248 ALLATORIxDEMO(class_2248 class_22482) {
        IiIiIIiIiI iiIiIIiIiI = iiIiIIiIiI2;
        IiIiIIiIiI iiIiIIiIiI2 = class_22482;
        IiIiIIiIiI IiIIiIiiiI = iiIiIIiIiI;
        if (IiIIiIiiiI.IIiiiIIIIi.get() == iiIiIIiIiI2) {
            return (class_2248)IiIIiIiiiI.ALLATORIxDEMO.get();
        }
        if (IiIIiIiiiI.IIiIiiIiIi.get() == iiIiIIiIiI2) {
            return (class_2248)IiIIiIiiiI.IIIiIIIiII.get();
        }
        if (IiIIiIiiiI.iiiiiIIiiI.get() == iiIiIIiIiI2) {
            return (class_2248)IiIIiIiiiI.iIIiIIiiII.get();
        }
        if (IiIIiIiiiI.iIIIIiiiIi.get() == iiIiIIiIiI2) {
            return (class_2248)IiIIiIiiiI.iiiiiIIIii.get();
        }
        if (IiIIiIiiiI.iIiIiiIiiI.get() == iiIiIIiIiI2) {
            return (class_2248)IiIIiIiiiI.iIiIiIIiiI.get();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(int n) {
        IiIiIIiIiI iiIiIIiIiI;
        void IiIIiIiiiI22;
        IiIiIIiIiI iiIiIIiIiI2 = iiIiIIiIiI3;
        class_2338 IiIIiIiiiI22 = iiIiIIiIiI2.IIiiIiiiII.get((int)IiIIiIiiiI22);
        IiIiIIiIiI iiIiIIiIiI3 = iiIiIIiIiI2.IiIiIIIiiI.get(IiIIiIiiiI22);
        int n2 = iiIiIIiIiI2.ALLATORIxDEMO((class_2680)iiIiIIiIiI3);
        if (n2 == -4 >> 2) {
            return;
        }
        IIIiIiIiii.ALLATORIxDEMO(n2);
        if (((Boolean)iiIiIIiIiI2.IiiIIIiiIi.get()).booleanValue() && iiIiIIiIiI3.getBlock() instanceof class_2482) {
            IiIiIIiIiI iiIiIIiIiI4 = iiIiIIiIiI2;
            iiIiIIiIiI = iiIiIIiIiI4;
            iiIiIIiIiI4.IiiiiiiIIi(IiIIiIiiiI22, (class_2680)iiIiIIiIiI3);
        } else {
            IiIiIIiIiI iiIiIIiIiI5 = iiIiIIiIiI2;
            if (iiIiIIiIiI3.getBlock() instanceof class_2510) {
                iiIiIIiIiI5.iiIiiiiiII(IiIIiIiiiI22, (class_2680)iiIiIIiIiI3);
                iiIiIIiIiI = iiIiIIiIiI2;
            } else {
                IiIiIIiIiI iiIiIIiIiI6 = iiIiIIiIiI2;
                if (iiIiIIiIiI5.ALLATORIxDEMO(iiIiIIiIiI3.getBlock())) {
                    iiIiIIiIiI6.IiiIIIIiiI(IiIIiIiiiI22, (class_2680)iiIiIIiIiI3);
                    iiIiIIiIiI = iiIiIIiIiI2;
                } else if (((Boolean)iiIiIIiIiI6.IiiIIiIiIi.get()).booleanValue() && iiIiIIiIiI3.getBlock() instanceof class_2533) {
                    IiIiIIiIiI iiIiIIiIiI7 = iiIiIIiIiI2;
                    iiIiIIiIiI = iiIiIIiIiI7;
                    iiIiIIiIiI7.ALLATORIxDEMO(IiIIiIiiiI22, (class_2680)iiIiIIiIiI3);
                } else if (iiIiIIiIiI3.getProperties().contains(class_2741.FACING)) {
                    IiIiIIiIiI iiIiIIiIiI8 = iiIiIIiIiI2;
                    iiIiIIiIiI = iiIiIIiIiI8;
                    iiIiIIiIiI8.ALLATORIxDEMO(IiIIiIiiiI22, (class_2680)iiIiIIiIiI3, n2, (class_2769<class_2350>)class_2741.FACING);
                } else if (iiIiIIiIiI3.getProperties().contains(class_2741.HOPPER_FACING)) {
                    IiIiIIiIiI iiIiIIiIiI9 = iiIiIIiIiI2;
                    iiIiIIiIiI = iiIiIIiIiI9;
                    iiIiIIiIiI9.ALLATORIxDEMO(IiIIiIiiiI22, (class_2680)iiIiIIiIiI3, n2);
                } else {
                    IiIiIIiIiI iiIiIIiIiI10 = iiIiIIiIiI2;
                    if (iiIiIIiIiI3.getProperties().contains(class_2741.HORIZONTAL_FACING)) {
                        iiIiIIiIiI10.ALLATORIxDEMO(IiIIiIiiiI22, (class_2680)iiIiIIiIiI3, n2, (class_2769<class_2350>)class_2741.HORIZONTAL_FACING);
                        iiIiIIiIiI = iiIiIIiIiI2;
                    } else {
                        iiIiIIiIiI10.ALLATORIxDEMO(IiIIiIiiiI22, n2);
                        iiIiIIiIiI = iiIiIIiIiI2;
                    }
                }
            }
        }
        iiIiIIiIiI.IIiIIiIIii.ALLATORIxDEMO(IiIIiIiiiI22);
        IIIiIiIiii.ALLATORIxDEMO(n2);
        IIIiIiIiii.IiiiiiiIIi();
    }

    @Override
    public void onActivate() {
        IiIiIIiIiI iiIiIIiIiI = this;
        super.onActivate();
        iiIiIIiIiI.IIIiIIiiIi = 5 >> 3;
        iiIiIIiIiI.IIiIIiIIii.IiiIIIIiiI();
        iiiiIiiiII.ALLATORIxDEMO(iIiIIiiIiI.ALLATORIxDEMO("\u62cf\u5f11\u6208\u5350\u5ee1\u8be9\\15&\\\u8c64\u6528\u5277MiNWrq\u626a\u4e82\u4e57\u720f\u6750"));
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        IiIiIIiIiI iiIiIIiIiI = this;
        if (!((Boolean)iiIiIIiIiI.iiIIiiIiii.get()).booleanValue() || iiIiIIiIiI.IIiiIiiiII.isEmpty()) {
            return;
        }
        Object object = this = iiIiIIiIiI.IIiiIiiiII.iterator();
        while (object.hasNext()) {
            void IiIIiIiiiI;
            class_2338 class_23382 = (class_2338)this.next();
            object = this;
            iiIiIIiIiI.ALLATORIxDEMO((Render3DEvent)IiIIiIiiiI, class_23382);
        }
    }
}

