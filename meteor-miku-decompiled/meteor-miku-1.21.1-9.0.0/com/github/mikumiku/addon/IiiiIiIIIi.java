/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BlockListSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.world.BlockIterator
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.fluid.Fluids
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiIiiIiiIi;
import com.github.mikumiku.addon.iiIIIiiIII;
import com.github.mikumiku.addon.iiIiiIIIiI;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.LiquidFiller;
import com.github.mikumiku.addon.modules.MEnum;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BlockListSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.world.BlockIterator;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.fluid.Fluids;
import net.minecraft.world.RaycastContext;

public class IiiiIiIIIi
extends iiiiIiIiii {
    private final Setting<List<class_2248>> iiiiiIIIii;
    private final Setting<Double> iIIiIIiiII;
    private final Setting<LiquidFiller.SortMode> IiiIIiiiiI;
    private final Setting<LiquidFiller.PlaceIn> IiIIIIiiii;
    private int IiiIIIiiIi;
    private final iiIiiIIIiI iiIIiiIiii;
    private final List<class_2338.class_2339> iIiiIiiiII;
    private final Setting<Integer> iIIiiIIIII;
    private final Setting<Double> iiIiIIiIIi;
    private final Setting<List<class_2248>> IIIIiIiiIi;
    private final Setting<MEnum.ListMode> IiIiIIIIiI;
    private final SettingGroup iiiiiIIiiI;
    private final SettingGroup iiIIIIiIII;
    private final Setting<LiquidFiller.Shape> IiIIiIiiiI;
    private final Setting<Integer> ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IiiiIiIIIi IiIIiIiiiI;
        IiiiIiIIIi iiiiIiIIIi = iiiiIiIIIi2;
        IiiiIiIIIi iiiiIiIIIi2 = pre;
        IiiiIiIIIi iiiiIiIIIi3 = IiIIiIiiiI = iiiiIiIIIi;
        if (iiiiIiIIIi3.IiiIIIiiIi < (Integer)iiiiIiIIIi3.iIIiiIIIII.get()) {
            IiIIiIiiiI.IiiIIIiiIi += 2 ^ 3;
            return;
        }
        IiiiIiIIIi iiiiIiIIIi4 = IiIIiIiiiI;
        iiiiIiIIIi4.IiiIIIiiIi = 5 >> 3;
        double d = iiiiIiIIIi4.iiIIIIiIII.player.getX();
        double d2 = iiiiIiIIIi4.iiIIIIiIII.player.getY();
        double d3 = iiiiIiIIIi4.iiIIIIiIII.player.getZ();
        int this2 = -4 >> 2;
        int n = iiiiIiIIIi4.IiIiIIIIiI.get() == MEnum.ListMode.iiiiiIIiiI ? (this2 = IIIiIiIiii.ALLATORIxDEMO((class_1799 class_17992) -> {
            IiiiIiIIIi iiiiIiIIIi = iiiiIiIIIi2;
            IiiiIiIIIi iiiiIiIIIi2 = class_17992;
            IiiiIiIIIi IiIIiIiiiI = iiiiIiIIIi;
            if (iiiiIiIIIi2.getItem() instanceof class_1747 && ((List)IiIIiIiiiI.iiiiiIIIii.get()).contains(class_2248.getBlockFromItem((class_1792)iiiiIiIIIi2.getItem()))) {
                return (3 & 5) != 0;
            }
            return false;
        })) : (this2 = IIIiIiIiii.ALLATORIxDEMO((class_1799 class_17992) -> {
            IiiiIiIIIi iiiiIiIIIi = iiiiIiIIIi2;
            IiiiIiIIIi iiiiIiIIIi2 = class_17992;
            IiiiIiIIIi IiIIiIiiiI = iiiiIiIIIi;
            if (iiiiIiIIIi2.getItem() instanceof class_1747 && !((List)IiIIiIiiiI.IIIIiIiiIi.get()).contains(class_2248.getBlockFromItem((class_1792)iiiiIiIIIi2.getItem()))) {
                return --1 != 0;
            }
            return false;
        }));
        if (n == -1) {
            return;
        }
        BlockIterator.register((int)((int)Math.ceil((Double)IiIIiIiiiI.iIIiIIiiII.get() + 1.0)), (int)((int)Math.ceil((Double)IiIIiIiiiI.iIIiIIiiII.get())), (class_23382, class_26802) -> {
            void IiIIiIiiiI;
            IiiiIiIIIi iiiiIiIIIi = iiiiIiIIIi2;
            IiiiIiIIIi iiiiIiIIIi2 = class_26802;
            IiiiIiIIIi IiIIiIiiiI2 = iiiiIiIIIi;
            if (IiIIiIiiiI2.iiIIiiIiii.ALLATORIxDEMO((class_2338)IiIIiIiiiI)) {
                return;
            }
            if (IiIIiIiiiI2.ALLATORIxDEMO((class_2338)IiIIiIiiiI)) {
                return;
            }
            iiiiIiIIIi2 = iiiiIiIIIi2.getFluidState().getFluid();
            if (IiIIiIiiiI2.IiIIIIiiii.get() == LiquidFiller.PlaceIn.ALLATORIxDEMO && iiiiIiIIIi2 != class_3612.WATER && iiiiIiIIIi2 != class_3612.LAVA || IiIIiIiiiI2.IiIIIIiiii.get() == LiquidFiller.PlaceIn.iiIIIIiIII && iiiiIiIIIi2 != class_3612.WATER || IiIIiIiiiI2.IiIIIIiiii.get() == LiquidFiller.PlaceIn.IiIiIIIIiI && iiiiIiIIIi2 != class_3612.LAVA) {
                return;
            }
            if (!iiiIIIIiiI.ALLATORIxDEMO((class_2338)IiIIiIiiiI)) {
                return;
            }
            IiIIiIiiiI2.iIiiIiiiII.add(IiIIiIiiiI.mutableCopy());
        });
        BlockIterator.after(() -> {
            IiiiIiIIIi iiiiIiIIIi;
            block6: {
                Iterator<class_2338.class_2339> iterator;
                int n2 = this2;
                IiiiIiIIIi IiIIiIiiiI = this;
                if (IiIIiIiiiI.IiiIIiiiiI.get() == LiquidFiller.SortMode.iiIIIIiIII || IiIIiIiiiI.IiiIIiiiiI.get() == LiquidFiller.SortMode.ALLATORIxDEMO) {
                    IiIIiIiiiI.iIiiIiiiII.sort(Comparator.comparingDouble(class_23392 -> {
                        IiiiIiIIIi iiiiIiIIIi = iiiiIiIIIi2;
                        IiiiIiIIIi iiiiIiIIIi2 = class_23392;
                        IiiiIiIIIi IiIIiIiiiI = iiiiIiIIIi;
                        return iiiiIiIIIi2.getY() * (IiIIiIiiiI.IiiIIiiiiI.get() == LiquidFiller.SortMode.ALLATORIxDEMO ? 5 >> 2 : -1);
                    }));
                } else if (IiIIiIiiiI.IiiIIiiiiI.get() != LiquidFiller.SortMode.IIIIiIiiIi) {
                    void IiIIiIiiiI2;
                    void IiIIiIiiiI3;
                    void IiIIiIiiiI4;
                    IiIIiIiiiI.iIiiIiiiII.sort(Comparator.comparingDouble(arg_0 -> IiIIiIiiiI.ALLATORIxDEMO((double)IiIIiIiiiI4, (double)IiIIiIiiiI3, (double)IiIIiIiiiI2, arg_0)));
                }
                int IiIIiIiiiI4 = 0;
                Iterator<class_2338.class_2339> iterator2 = iterator = IiIIiIiiiI.iIiiIiiiII.iterator();
                while (iterator2.hasNext()) {
                    class_2338 IiIIiIiiiI3 = (class_2338)iterator.next();
                    if (IiIIiIiiiI4 >= (Integer)IiIIiIiiiI.ALLATORIxDEMO.get()) {
                        iiiiIiIIIi = IiIIiIiiiI;
                        break block6;
                    }
                    if (!IiIIiIiiiI.IiiiiiiIIi(IiIIiIiiiI3)) {
                        iterator2 = iterator;
                        IiIIiIiiiI.iiIIiiIiii.ALLATORIxDEMO(IiIIiIiiiI3);
                        continue;
                    }
                    IIIiIiIiii.ALLATORIxDEMO((int)this);
                    iterator2 = iterator;
                    iiiIIIIiiI.IiIiiiIIiI(IiIIiIiiiI3);
                    IIIiIiIiii.ALLATORIxDEMO((int)this);
                    ++IiIIiIiiiI4;
                    IiIIiIiiiI.iiIIiiIiii.ALLATORIxDEMO(IiIIiIiiiI3);
                }
                iiiiIiIIIi = IiIIiIiiiI;
            }
            iiiiIiIIIi.iIiiIiiiII.clear();
        });
    }

    @Override
    public void onActivate() {
        IiiiIiIIIi iiiiIiIIIi = this;
        super.onActivate();
        iiiiIiIIIi.IiiIIIiiIi = 3 ^ 3;
        iiiiIiIIIi.iiIIiiIiii.IiiIIIIiiI();
    }

    public void onDeactivate() {
        this.IiiIIIiiIi = 3 ^ 3;
        this.iiIIiiIiii.iIIiiiIiiI();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, double d) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IiiiIiIIIi iiiiIiIIIi = iiiiIiIIIi2;
        if (iiiiIiIIIi.IiIIiIiiiI.get() == LiquidFiller.Shape.ALLATORIxDEMO) {
            IiiiIiIIIi iiiiIiIIIi2 = iiiiIiIIIi.iiIIIIiIII.player.getBlockPos();
            void v0 = IiIIiIiiiI2;
            double d2 = Math.abs(v0.getX() - iiiiIiIIIi2.getX());
            double d3 = Math.abs(v0.getY() - iiiiIiIIIi2.getY());
            double d4 = Math.abs(v0.getZ() - iiiiIiIIIi2.getZ());
            if (Math.max(Math.max(d2, d3), d4) <= Math.floor((double)IiIIiIiiiI)) {
                return --1 != 0;
            }
            return false;
        }
        return PlayerUtils.isWithin((class_243)IiIIiIiiiI2.toCenterPos(), (double)IiIIiIiiiI);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean IiiiiiiIIi(class_2338 class_23382) {
        int n;
        IiiiIiIIIi iiiiIiIIIi = iiiiIiIIIi2;
        class_2350[] class_2350Array = class_2350.values();
        int n2 = class_2350Array.length;
        int n3 = n = 3 & 4;
        while (n3 < n2) {
            void IiIIiIiiiI;
            IiiiIiIIIi iiiiIiIIIi2 = class_2350Array[n];
            if (!iiiiIiIIIi.iiIIIIiIII.world.getBlockState((class_2338)(iiiiIiIIIi2 = IiIIiIiiiI.offset((class_2350)iiiiIiIIIi2))).isAir() && !iiiiIiIIIi.iiIIIIiIII.world.getBlockState((class_2338)iiiiIiIIIi2).isLiquid()) {
                return (3 & 5) != 0;
            }
            n3 = ++n;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ double ALLATORIxDEMO(double d, double d2, double d3, class_2338.class_2339 class_23392) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        IiiiIiIIIi iiiiIiIIIi = iiiiIiIIIi2;
        IiiiIiIIIi iiiiIiIIIi2 = class_23392;
        IiiiIiIIIi IiIIiIiiiI4 = iiiiIiIIIi;
        return Utils.squaredDistance((double)IiIIiIiiiI3, (double)IiIIiIiiiI2, (double)IiIIiIiiiI, (double)((double)iiiiIiIIIi2.getX() + 0.5), (double)((double)iiiiIiIIIi2.getY() + 0.5), (double)((double)iiiiIiIIIi2.getZ() + 0.5)) * (double)(IiIIiIiiiI4.IiiIIiiiiI.get() == LiquidFiller.SortMode.iiIiIIiIIi ? 3 & 5 : -1);
    }

    public IiiiIiIIIi() {
        IiiiIiIIIi iiiiIiIIIi = this;
        super(iiIIIiiIII.ALLATORIxDEMO("\u81bf\u52bb\u5823\u6c3a\u5869\u6d33"), IiIiiIiiIi.ALLATORIxDEMO("\u81a1\u52df\u5c6d\u65ce\u573c\u6549\u7f05\u577f\u60e3\u8374\u569f\u51d2\u76cf\u6c63\u6edb\u65ee\u571c\u51f2\u3069"));
        iiiiIiIIIi.iiIIIIiIII = iiiiIiIIIi.settings.getDefaultGroup();
        iiiiIiIIIi.iiiiiIIiiI = iiiiIiIIIi.settings.createGroup(iiIIIiiIII.ALLATORIxDEMO("\u7673\u540f\u5311"));
        IiiiIiIIIi iiiiIiIIIi2 = this;
        iiiiIiIIIi.iiIIiiIiii = new iiIiiIIIiI(2000L);
        iiiiIiIIIi.IiIIIIiiii = iiiiIiIIIi.iiIIIIiIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIiiIiiIi.ALLATORIxDEMO("\u6569\u7f25\u4f3a\u7f05"))).description(iiIIIiiIII.ALLATORIxDEMO("\u907c\u62da\u577d\u54f9\u79cd\u7c3d\u57de\u7697\u6de0\u4f47\u4e78\u652d\u7f26\u65b7\u5755\u3046"))).defaultValue((Object)LiquidFiller.PlaceIn.ALLATORIxDEMO)).build());
        this.IiIIiIiiiI = this.iiIIIIiIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIiiIiiIi.ALLATORIxDEMO("\u5f15\u72dd"))).description(iiIIIiiIII.ALLATORIxDEMO("\u656c\u7f7a\u7bc2\u6cc6\u76cc\u5f6c\u72b4\u3046"))).defaultValue((Object)LiquidFiller.Shape.iiIIIIiIII)).build());
        this.iIIiIIiiII = this.iiIIIIiIII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiIiiIiiIi.ALLATORIxDEMO("\u6569\u7f25\u8374\u569f"))).description(iiIIIiiIII.ALLATORIxDEMO("\u53ba\u4ef6\u656c\u7f7a\u65ec\u5744\u76cc\u830d\u56f6\u3046"))).defaultValue(4.5).min(0.0).sliderMax(6.0).build());
        this.iiIiIIiIIi = this.iiIIIIiIII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiIiiIiiIi.ALLATORIxDEMO("\u7a28\u58d2\u8374\u569f"))).description(iiIIIiiIII.ALLATORIxDEMO("\u5728\u65ff\u5702\u541d\u9730\u652a\u7f3b\u65e5\u76cc\u830d\u56f6\u3046"))).defaultValue(3.0).min(0.0).sliderMax(6.0).build());
        this.iIIiiIIIII = this.iiIIIIiIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIiiIi.ALLATORIxDEMO("\u5e81\u8fb4"))).description(iiIIIiiIII.ALLATORIxDEMO("\u529b\u4f29\u4e78\u95a1\u7697\u5ef6\u8f99\uff5d\u4ef6\u6e6a\u621b\u526e\u4e29\u531d\u4f43\uff0b\u3046"))).defaultValue((Object)(3 & 4))).min(3 ^ 3).build());
        this.ALLATORIxDEMO = this.iiIIIIiIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIiiIi.ALLATORIxDEMO("\u6b84\u526c\u674b\u5970\u65f2\u5720\u651b"))).description(iiIIIiiIII.ALLATORIxDEMO("\u6bfc\u6e6d\u621c\u523b\u5c5b\u8b80\u652d\u7f3c\u7690\u6755\u5934\u65f1\u5759\u6572\u3046"))).defaultValue((Object)(5 >> 2))).min(3 >> 1).sliderRange(3 & 5, 0x1A & 0x6F).build());
        this.IiiIIiiiiI = this.iiIIIIiIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIiiIiiIi.ALLATORIxDEMO("\u63c5\u5ec4\u6a56\u5f64"))).description(iiIIIiiIII.ALLATORIxDEMO("\u4f4d\u515b\u656c\u7f7a\u65ec\u5744\u76cc\u9874\u5e8d\u3046"))).defaultValue((Object)LiquidFiller.SortMode.ALLATORIxDEMO)).build());
        this.IiIiIIIIiI = this.iiiiiIIiiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIiiIiiIi.ALLATORIxDEMO("\u5240\u8823\u6a56\u5f64"))).description(iiIIIiiIII.ALLATORIxDEMO("\u901a\u62a1\u6a2f\u5f0d\u3046"))).defaultValue((Object)MEnum.ListMode.iiiiiIIiiI)).build());
        class_2248[] class_2248Array = new class_2248[0x4D & 0x3A];
        class_2248Array[2 & 5] = class_2246.DIRT;
        class_2248Array[3 & 5] = class_2246.COBBLESTONE;
        class_2248Array[1 ^ 3] = class_2246.STONE;
        class_2248Array[--3] = class_2246.NETHERRACK;
        class_2248Array[--4] = class_2246.DIORITE;
        class_2248Array[--5] = class_2246.GRANITE;
        class_2248Array[0x7E & 7] = class_2246.SLIME_BLOCK;
        class_2248Array[0x2F & 0x57] = class_2246.ANDESITE;
        this.iiiiiIIIii = this.iiiiiIIiiI.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(IiIiiIiiIi.ALLATORIxDEMO("\u7636\u547a\u533e"))).description(iiIIIiiIII.ALLATORIxDEMO("\u5141\u8bfe\u757d\u6776\u5839\u5151\u6de7\u4f40\u76cc\u65b7\u5755\u3046"))).defaultValue(class_2248Array).visible(() -> {
            if (this.IiIiIIIIiI.get() == MEnum.ListMode.iiiiiIIiiI) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.IIIIiIiiIi = this.iiiiiIIiiI.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(IiIiiIiiIi.ALLATORIxDEMO("\u9e9a\u547a\u533e"))).description(iiIIIiiIII.ALLATORIxDEMO("\u7981\u6b24\u757d\u6776\u5839\u5151\u6de7\u4f40\u76cc\u65b7\u5755\u3046"))).visible(() -> {
            if (this.IiIiIIIIiI.get() == MEnum.ListMode.ALLATORIxDEMO) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        IiiiIiIIIi iiiiIiIIIi3 = this;
        iiiiIiIIIi3.iIiiIiiiII = new ArrayList<class_2338.class_2339>();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiIiiIiiIi.ALLATORIxDEMO(" \u0000UM$.W\u001e\u0007\u000f\u0016\u001f2jW\u8b9c\u66a3\u65fb\u5267\u674b\u65e7\u7203\u675b\uff6a"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        void IiIIiIiiiI;
        IiiiIiIIIi iiiiIiIIIi;
        IiiiIiIIIi iiiiIiIIIi2 = iiiiIiIIIi = iiiiIiIIIi3;
        if (!iiiiIiIIIi2.ALLATORIxDEMO((class_2338)IiIIiIiiiI, (Double)iiiiIiIIIi2.iIIiIIiiII.get())) {
            return (2 ^ 3) != 0;
        }
        IiiiIiIIIi iiiiIiIIIi3 = new class_3959(iiiiIiIIIi.iiIIIIiIII.player.getEyePos(), IiIIiIiiiI.toCenterPos(), class_3959.class_3960.COLLIDER, class_3959.class_242.NONE, (class_1297)iiiiIiIIIi.iiIIIIiIII.player);
        if ((iiiiIiIIIi3 = iiiiIiIIIi.iiIIIIiIII.world.raycast((class_3959)iiiiIiIIIi3)) == null || !iiiiIiIIIi3.getBlockPos().equals((Object)IiIIiIiiiI)) {
            if (!iiiiIiIIIi.ALLATORIxDEMO((class_2338)IiIIiIiiiI, (Double)iiiiIiIIIi.iiIiIIiIIi.get())) {
                return --1 != 0;
            }
            return false;
        }
        return false;
    }
}

