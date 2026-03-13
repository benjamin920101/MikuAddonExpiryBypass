/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.misc.input.Input
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.world.CardinalDirection
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.item.BoneMealItem
 *  net.minecraft.block.AirBlock
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.block.PlantBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.block.LeavesBlock
 *  net.minecraft.block.PillarBlock
 *  net.minecraft.block.SaplingBlock
 *  net.minecraft.block.VineBlock
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.registry.tag.BlockTags
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.block.FungusBlock
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IIiIiiIIiI;
import com.github.mikumiku.addon.IiiIIiIiII;
import com.github.mikumiku.addon.IiiIiIIIIi;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiIIiIIii;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.TreeAura;
import com.github.mikumiku.addon.util.BaritoneUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.misc.input.Input;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.world.CardinalDirection;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.item.BoneMealItem;
import net.minecraft.block.AirBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.PlantBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.VineBlock;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.MathHelper;
import net.minecraft.block.FungusBlock;

public class iiIiiIiIIi
extends iiiiIiIiii {
    private final Setting<Boolean> IIIiIIIiII;
    private int iiIiIiiiiI;
    private class_2350 IIiiIiiiII;
    private Map<class_2338, Integer> IIIiIiiIIi;
    private static final long iiiIiIiIIi = 1000L;
    private final Setting<Integer> iIiIiIiIii;
    private final Setting<Integer> iiiiiIIIii;
    private final Setting<Integer> iIIiIIiiII;
    private class_2338 IiiIIiiiiI;
    private long IiIIIIiiii;
    private Map<class_2248, Integer> IiiIIIiiIi;
    private final Setting<Boolean> iiIIiiIiii;
    private long iIiiIiiiII;
    private int iIIiiIIIII;
    private final Setting<Integer> iiIiIIiIIi;
    private static final long IIIIiIiiIi = 5000L;
    private long IiIiIIIIiI;
    private final Setting<Integer> iiiiiIIiiI;
    private final Setting<TreeAura.SortMode> iiIIIIiIII;
    private final SettingGroup IiIIiIiiiI;
    private final Setting<Integer> ALLATORIxDEMO;

    private /* synthetic */ boolean IiiIIIIiiI(class_2338 class_23382) {
        iiIiiIiIIi iiIiiIiIIi2 = iiIiiIiIIi3;
        iiIiiIiIIi iiIiiIiIIi3 = class_23382;
        iiIiiIiIIi IiIIiIiiiI = iiIiiIiIIi2;
        if ((iiIiiIiIIi3 = class_310.getInstance().world.getBlockState((class_2338)iiIiiIiIIi3).getBlock()) instanceof class_2473 || iiIiiIiIIi3 instanceof class_4771 || iiIiiIiIIi3.equals(class_2246.CRIMSON_FUNGUS) || iiIiiIiIIi3.equals(class_2246.WARPED_FUNGUS)) {
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IiiiiiiIIi(class_2338 class_23382) {
        void IiIIiIiiiI;
        Object object;
        iiIiiIiIIi iiIiiIiIIi2 = object;
        class_2248 class_22482 = class_310.getInstance().world.getBlockState((class_2338)IiIIiIiiiI).getBlock();
        Object this_ = null;
        if (class_22482.equals(class_2246.CRIMSON_NYLIUM)) {
            this_ = iiIiiIiIIi2.IiiIIIiiIi.get(class_2246.CRIMSON_FUNGUS);
            if (this_ == null) {
                iiIiiIiIIi2.error(IIiIiiIIiI.ALLATORIxDEMO("\u7e8a\u7e83\u8389\u5ca8\u9765\u89a0\u7e8a\u7e83\u8389\uff0d\u4f23\u80ed\u5340\u4e2c\u6ce4\u6708\u621b\u5211"), new Object[3 ^ 3]);
                return;
            }
        } else if (class_22482.equals(class_2246.WARPED_NYLIUM)) {
            this_ = iiIiiIiIIi2.IiiIIIiiIi.get(class_2246.WARPED_FUNGUS);
            if (this_ == null) {
                iiIiiIiIIi2.error(iiiIIiIIii.ALLATORIxDEMO("\u8ba1\u5f27\u838c\u5c8c\u9740\u89a4\u8ba1\u5f27\u838c\uff29\u4f06\u80e9\u5365\u4e28\u6cc1\u670c\u623e\u5215"), new Object[5 >> 3]);
                return;
            }
        } else {
            Object object2;
            block8: {
                for (Map.Entry entry : iiIiiIiIIi2.IiiIIIiiIi.entrySet()) {
                    if (!(entry.getKey() instanceof class_2473)) continue;
                    object2 = this_ = (Integer)entry.getValue();
                    break block8;
                }
                object2 = this_;
            }
            if (object2 == null) {
                iiIiiIiIIi2.error(IIiIiiIIiI.ALLATORIxDEMO("\u6ca0\u676c\u625f\u5275\u53ee\u756d\u7685\u6874\u82f6"), new Object[2 & 5]);
                return;
            }
        }
        IIIiIiIiii.ALLATORIxDEMO((Integer)this_);
        iiiIIIIiiI.ALLATORIxDEMO((class_2338)IiIIiIiiiI, class_2350.UP, --1 != 0, class_1268.MAIN_HAND, BaritoneUtil.SwingSide.iiIIIIiIII);
        IIIiIiIiii.ALLATORIxDEMO((Integer)this_);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ class_2350 IiiiiiiIIi(class_2350 class_23502) {
        iiIiiIiIIi iiIiiIiIIi2 = iiIiiIiIIi3;
        iiIiiIiIIi iiIiiIiIIi3 = class_23502;
        iiIiiIiIIi IiIIiIiiiI = iiIiiIiIIi2;
        switch (IiiIIiIiII.ALLATORIxDEMO[iiIiiIiIIi3.ordinal()]) {
            case 1: {
                return class_2350.WEST;
            }
            case 2: {
                return class_2350.SOUTH;
            }
            case 3: {
                return class_2350.EAST;
            }
            case 4: {
                return class_2350.NORTH;
            }
        }
        return iiIiiIiIIi3;
    }

    private /* synthetic */ void IiiIIIIiiI() {
        iiIiiIiIIi iiIiiIiIIi2 = this;
        iiIiiIiIIi2.IiiIIIiiIi.clear();
        int n = IIIiIiIiii.ALLATORIxDEMO(class_2473.class);
        if (n != -4 >> 2) {
            iiIiiIiIIi2.IiiIIIiiIi.put(class_2246.OAK_SAPLING, n);
        }
        n = IIIiIiIiii.ALLATORIxDEMO(class_2246.CRIMSON_FUNGUS);
        if (n != -4 >> 2) {
            iiIiiIiIIi2.IiiIIIiiIi.put(class_2246.CRIMSON_FUNGUS, n);
        }
        n = IIIiIiIiii.ALLATORIxDEMO(class_2246.WARPED_FUNGUS);
        if (n != -4 >> 2) {
            iiIiiIiIIi2.IiiIIIiiIi.put(class_2246.WARPED_FUNGUS, n);
        }
        iiIiiIiIIi2.IiIIIIiiii = System.currentTimeMillis();
    }

    private /* synthetic */ class_2350 IiiiiiiIIi() {
        iiIiiIiIIi iiIiiIiIIi2 = iiIiiIiIIi3;
        if (!iiIiiIiIIi2.ALLATORIxDEMO()) {
            return null;
        }
        class_2338 class_23382 = class_310.getInstance().player.getBlockPos();
        if (iiIiiIiIIi2.IiiIIiiiiI != null && !class_23382.equals((Object)iiIiiIiIIi2.IiiIIiiiiI)) {
            class_2338 class_23383 = class_23382;
            int n = class_23383.getX() - iiIiiIiIIi2.IiiIIiiiiI.getX();
            int this_ = class_23383.getZ() - iiIiiIiIIi2.IiiIIiiiiI.getZ();
            if (Math.abs(n) > Math.abs(this_)) {
                if (n > 0) {
                    return class_2350.EAST;
                }
                return class_2350.WEST;
            }
            if (Math.abs(this_) > 0) {
                if (this_ > 0) {
                    return class_2350.SOUTH;
                }
                return class_2350.NORTH;
            }
        }
        float f = class_310.getInstance().player.getYaw();
        iiIiiIiIIi iiIiiIiIIi3 = iiIiiIiIIi2.ALLATORIxDEMO(f);
        if (Input.isPressed((class_304)class_310.getInstance().options.forwardKey)) {
            return iiIiiIiIIi3;
        }
        if (Input.isPressed((class_304)class_310.getInstance().options.backKey)) {
            return iiIiiIiIIi3.getOpposite();
        }
        if (Input.isPressed((class_304)class_310.getInstance().options.leftKey)) {
            return iiIiiIiIIi2.IiiiiiiIIi((class_2350)iiIiiIiIIi3);
        }
        if (Input.isPressed((class_304)class_310.getInstance().options.rightKey)) {
            return iiIiiIiIIi2.ALLATORIxDEMO((class_2350)iiIiiIiIIi3);
        }
        return null;
    }

    @EventHandler
    public void ALLATORIxDEMO(TickEvent.Post post) {
        iiIiiIiIIi IiIIiIiiiI;
        iiIiiIiIIi iiIiiIiIIi2 = iiIiiIiIIi3;
        iiIiiIiIIi iiIiiIiIIi3 = post;
        iiIiiIiIIi iiIiiIiIIi4 = IiIIiIiiiI = iiIiiIiIIi2;
        iiIiiIiIIi4.iIIiiIIIII -= 3 & 5;
        iiIiiIiIIi4.iiIiIiiiiI -= 4 ^ 5;
        iiIiiIiIIi3 = class_310.getInstance().player.getBlockPos();
        if (iiIiiIiIIi4.IiiIIiiiiI == null) {
            IiIIiIiiiI.IiiIIiiiiI = iiIiiIiIIi3;
        }
        if (!((Boolean)IiIIiIiiiI.iiIIiiIiii.get()).booleanValue()) {
            IiIIiIiiiI.IiiIIIIiiI();
        }
        if (IiIIiIiiiI.iiIiIiiiiI <= 0) {
            iiIiiIiIIi iiIiiIiIIi5 = IiIIiIiiiI;
            iiIiiIiIIi5.IiiiiiiIIi();
            iiIiiIiIIi5.iiIiIiiiiI = (Integer)iiIiiIiIIi5.iiIiIIiIIi.get();
        }
        if (IiIIiIiiiI.iIIiiIIIII <= 0 && !((Boolean)IiIIiIiiiI.iiIIiiIiii.get()).booleanValue()) {
            class_2338 class_23382 = IiIIiIiiiI.ALLATORIxDEMO();
            if (class_23382 != null) {
                IiIIiIiiiI.IiiiiiiIIi(class_23382);
            }
            IiIIiIiiiI.iIIiiIIIII = (Integer)IiIIiIiiiI.ALLATORIxDEMO.get();
        }
        IiIIiIiiiI.IiiIIiiiiI = iiIiiIiIIi3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ List<class_2338> ALLATORIxDEMO(class_2338 class_23382, int n, int n2) {
        void IiIIiIiiiI;
        Iterator<class_2338> IiIIiIiiiI2;
        int n32 = n;
        iiIiiIiIIi IiIIiIiiiI3 = this;
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        for (class_2338 n32 : IiiIiIIIIi.ALLATORIxDEMO((class_2338)IiIIiIiiiI2, n32, (int)IiIIiIiiiI)) {
            if (!IiIIiIiiiI3.IiiIIIIiiI(n32)) continue;
            arrayList.add(n32);
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        void IiIIiIiiiI;
        iiIiiIiIIi iiIiiIiIIi2 = this;
        int n = iiIiiIiIIi2.ALLATORIxDEMO();
        if (n <= -4 >> 2) {
            long l = System.currentTimeMillis();
            if (l - iiIiiIiIIi2.iIiiIiiiII >= 5000L) {
                iiIiiIiIIi2.error(iiiIIiIIii.ALLATORIxDEMO("\u5f86\u637f\u6863\u4e24\u6cc5\u6708\u9ace\u7c8a"), new Object[5 >> 3]);
                iiIiiIiIIi2.iIiiIiiiII = l;
            }
            return;
        }
        IIIiIiIiii.ALLATORIxDEMO(n);
        iiiIIIIiiI.ALLATORIxDEMO((class_2338)IiIIiIiiiI, class_2350.UP, (4 ^ 5) != 0, class_1268.MAIN_HAND, BaritoneUtil.SwingSide.iiIIIIiIII);
        IIIiIiIiii.ALLATORIxDEMO(n);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, boolean bl) {
        Object object;
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        iiIiiIiIIi iiIiiIiIIi2 = object;
        int n = (Integer)iiIiiIiIIi2.iIiIiIiIii.get();
        if (n > 0) {
            int n2 = this = -n;
            while (n2 <= n) {
                int n3 = -n;
                while (n3 <= n) {
                    int n4;
                    if (this != 0 || n4 != 0) {
                        class_2338 class_23383 = IiIIiIiiiI2.add(this, 3 & 5, n4);
                        if ((class_23383 = class_310.getInstance().world.getBlockState(class_23383).getBlock()) instanceof class_2473 || class_23383 instanceof class_4771 || class_23383.equals(class_2246.CRIMSON_FUNGUS) || class_23383.equals(class_2246.WARPED_FUNGUS) || class_23383 instanceof class_2465) {
                            return false;
                        }
                    }
                    n3 = ++n4;
                }
                n2 = ++this;
            }
        }
        if (IiIIiIiiiI != false) {
            object = IiIIiIiiiI2.up(3 >> 1);
            class_2248 class_22482 = class_310.getInstance().world.getBlockState((class_2338)object).getBlock();
            if (class_22482.equals(class_2246.AIR) || class_22482.equals(class_2246.WATER)) {
                return true;
            }
        }
        object = new AtomicBoolean(--1 != 0);
        IntStream.rangeClosed(--1, --5).forEach(arg_0 -> iiIiiIiIIi2.ALLATORIxDEMO((class_2338)IiIIiIiiiI2, (AtomicBoolean)object, arg_0));
        return ((AtomicBoolean)object).get();
    }

    private /* synthetic */ class_2350 ALLATORIxDEMO(class_2350 class_23502) {
        iiIiiIiIIi iiIiiIiIIi2 = iiIiiIiIIi3;
        iiIiiIiIIi iiIiiIiIIi3 = class_23502;
        iiIiiIiIIi IiIIiIiiiI = iiIiiIiIIi2;
        switch (IiiIIiIiII.ALLATORIxDEMO[iiIiiIiIIi3.ordinal()]) {
            case 1: {
                while (false) {
                }
                return class_2350.EAST;
            }
            case 4: {
                return class_2350.SOUTH;
            }
            case 3: {
                return class_2350.WEST;
            }
            case 2: {
                return class_2350.NORTH;
            }
        }
        return iiIiiIiIIi3;
    }

    private /* synthetic */ void IiiiiiiIIi() {
        iiIiiIiIIi iiIiiIiIIi2;
        iiIiiIiIIi iiIiiIiIIi3 = iiIiiIiIIi2 = iterator;
        iiIiiIiIIi3.ALLATORIxDEMO();
        Iterator iterator = iiIiiIiIIi3.ALLATORIxDEMO();
        if (iterator.isEmpty()) {
            return;
        }
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            class_2338 class_23382 = (class_2338)iterator.next();
            int n = iiIiiIiIIi2.IIIiIiiIIi.getOrDefault(class_23382, 5 >> 3);
            if (n >= (Integer)iiIiiIiIIi2.iiiiiIIiiI.get()) continue;
            iiIiiIiIIi iiIiiIiIIi4 = iiIiiIiIIi2;
            iiIiiIiIIi4.ALLATORIxDEMO(class_23382);
            iiIiiIiIIi4.IIIiIiiIIi.put(class_23382, n + (5 >> 2));
            return;
        }
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        return IIIiIiIiii.ALLATORIxDEMO(class_1752.class);
    }

    private /* synthetic */ class_2350 ALLATORIxDEMO() {
        iiIiiIiIIi iiIiiIiIIi2 = this;
        if ((this = iiIiiIiIIi2.IiiiiiiIIi()) != null) {
            iiIiiIiIIi2.IIiiIiiiII = this;
            return iiIiiIiIIi2.IIiiIiiiII;
        }
        return iiIiiIiIIi2.IIiiIiiiII;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ double ALLATORIxDEMO(class_2338 class_23382, class_2338 class_23383) {
        void IiIIiIiiiI;
        iiIiiIiIIi iiIiiIiIIi2 = iiIiiIiIIi3;
        iiIiiIiIIi iiIiiIiIIi3 = class_23383;
        iiIiiIiIIi IiIIiIiiiI2 = iiIiiIiIIi2;
        void v1 = IiIIiIiiiI;
        double d = v1.getX() - iiIiiIiIIi3.getX();
        double d2 = v1.getY() - iiIiiIiIIi3.getY();
        double d3 = v1.getZ() - iiIiiIiIIi3.getZ();
        double d4 = d;
        double d5 = d2;
        double d6 = d3;
        return class_3532.sqrt((float)((float)(d4 * d4 + d5 * d5 + d6 * d6)));
    }

    public iiIiiIiIIi() {
        iiIiiIiIIi iiIiiIiIIi2 = this;
        super(iiiIIiIIii.ALLATORIxDEMO("\u81b7\u5290\u79da\u6863"), IIiIiiIIiI.ALLATORIxDEMO("\u5729\u4f05\u5449\u56b1\u79cc\u6854\uff00\u50c9\u71be"));
        iiIiiIiIIi2.IiIIiIiiiI = iiIiiIiIIi2.settings.getDefaultGroup();
        iiIiiIiIIi2.ALLATORIxDEMO = iiIiiIiIIi2.IiIIiIiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiIIiIIii.ALLATORIxDEMO("\u7990\u6935\u5ee1\u8fad"))).description(IIiIiiIIiI.ALLATORIxDEMO("\u79cc\u6968\u6830\u676d\u4e4a\u95b1\u7685\u5e93\u8ffe"))).defaultValue((Object)(0x37 & 0x4E))).min(3 ^ 3).sliderMax(0x79 & 0x1F).build());
        this.iiIiIIiIIi = this.IiIIiIiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiIIiIIii.ALLATORIxDEMO("\u9af5\u7cb1\u5ee1\u8fad"))).description(IIiIiiIIiI.ALLATORIxDEMO("\u5709\u6874\u6709\u4e4f\u653f\u7f0b\u9a89\u7ccc\u4e4a\u95b1\u7685\u5e93\u8ffe"))).defaultValue((Object)(4 ^ 5))).min(2 & 5).sliderMax(0x3D & 0x5B).build());
        this.iiiiiIIiiI = this.IiIIiIiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiIIiIIii.ALLATORIxDEMO("\u6740\u5902\u9af5\u7cb1\u6b36\u6502"))).description(IIiIiiIIiI.ALLATORIxDEMO("\u5b9c\u5374\u4e4f\u6830\u8292\u6701\u597f\u4f5e\u756d\u9aa9\u7ccc\u7685\u6b44\u6551"))).defaultValue((Object)(0x5D & 0x36))).min(--1).sliderMax(0xEEC & 0x71DB).build());
        this.iIIiIIiiII = this.IiIIiIiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiIIiIIii.ALLATORIxDEMO("\u535d\u5ff6"))).description(IIiIiiIIiI.ALLATORIxDEMO("\u60a9\u538a\u4ec4\u6c71\u5e72\u657b\u7f6f\u597f\u8ffd"))).defaultValue((Object)(--4))).min(4 ^ 5).sliderMax(--5).build());
        this.iiiiiIIIii = this.IiIIiIiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiIIiIIii.ALLATORIxDEMO("\u0004\u8f4c\u8314\u5686"))).description(IIiIiiIIiI.ALLATORIxDEMO("\u60a9\u538a\u4ec4\u57c7\u76f5\u657b\u7f6f\u597f\u8ffd"))).defaultValue((Object)(--3))).min(2 ^ 3).sliderMax(--5).build());
        this.iiIIIIiIII = this.IiIIiIiiiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiiIIiIIii.ALLATORIxDEMO("\u63cf\u5eb7\u6a36\u5f7d"))).description(IIiIiiIIiI.ALLATORIxDEMO("\u59e7\u4f74\u63f7\u5eae\u9601\u8fd0\u76e1\u6830\u676d.\u657b\u7f6f\u4f28\u7f4f"))).defaultValue((Object)TreeAura.SortMode.iiIIIIiIII)).build());
        this.iIiIiIiIii = this.IiIIiIiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiIIiIIii.ALLATORIxDEMO("\u684c\u82ef\u95e3\u96e6"))).description(IIiIiiIIiI.ALLATORIxDEMO("\u6810\u82b2\u4e6a\u9591\u76a5\u6745\u5c0e\u9591\u96b5\u8d98\u79ba\uff4d\u683d\u6515\uff28"))).defaultValue((Object)(2 ^ 3))).min(5 >> 3).sliderMax(0x4F & 0x3A).build());
        this.IIIiIIIiII = this.IiIIiIiiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiIIiIIii.ALLATORIxDEMO("\u966f\u6b5a\u5822\u8d9d"))).description(IIiIiiIIiI.ALLATORIxDEMO("\u5f26\u540d\u5468\u538f\u5709\u73cc\u5b97\u79be\u52a9\u76e1\u8e8a\u546b\u79ec\u6854\uff0d\u901a\u516c\u5870\u4f4e\u73ec\u5bb7\u76e1\u8dce"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iiIIiiIiii = this.IiIIiIiiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiiIIiIIii.ALLATORIxDEMO("\u53cf\u4f22\u7510\u9abf\u7cfb"))).description(IIiIiiIIiI.ALLATORIxDEMO("\u5f26\u540d\u5468\u538f\u5bd8\u73d5\u6728\u6854\u82d6\u4f1a\u7509\u9acd\u7ca8\u50e9\u719e\uff69\u4e2c\u7988\u690c\u65f5\u7685\u6874\u82f6"))).defaultValue((Object)((3 & 4) != 0))).build());
        iiIiiIiIIi iiIiiIiIIi3 = this;
        this.IiIIIIiiii = 0L;
        iiIiiIiIIi3.iIiiIiiiII = 0L;
        iiIiiIiIIi3.IiIiIIIIiI = 0L;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiiIIiIIii.ALLATORIxDEMO("\u0010I\u0005d3@@p\u0010a!QpQ`\u8bd2\u66b3\u6592\u5270\u6725\u65ed\u7270\u673b\uff73"));
        }
    }

    private /* synthetic */ List<class_2338> ALLATORIxDEMO() {
        iiIiiIiIIi iiIiiIiIIi2 = this;
        return iiIiiIiIIi2.ALLATORIxDEMO(class_310.getInstance().player.getBlockPos(), (Integer)iiIiiIiIIi2.iIIiIIiiII.get(), (int)((Integer)this.iiiiiIIIii.get()));
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        iiIiiIiIIi iiIiiIiIIi2 = iiIiiIiIIi3;
        iiIiiIiIIi iiIiiIiIIi3 = class_23382;
        iiIiiIiIIi IiIIiIiiiI = iiIiiIiIIi2;
        if ((iiIiiIiIIi3 = class_310.getInstance().world.getBlockState((class_2338)iiIiiIiIIi3).getBlock()) instanceof class_2189 || iiIiiIiIIi3 instanceof class_2397 || iiIiiIiIIi3 instanceof class_2465 || iiIiiIiIIi3.getDefaultState().isIn(class_3481.LOGS) || iiIiiIiIIi3.getDefaultState().isIn(class_3481.LEAVES) || iiIiiIiIIi3 instanceof class_2541 || iiIiiIiIIi3 instanceof class_2261 || iiIiiIiIIi3.equals(class_2246.SNOW) || iiIiiIiIIi3.equals(class_2246.TALL_GRASS) || iiIiiIiIIi3.equals(class_2246.SHORT_GRASS) || iiIiiIiIIi3.equals(class_2246.FERN) || iiIiiIiIIi3.equals(class_2246.LARGE_FERN)) {
            return true;
        }
        return false;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        this.IIIiIiiIIi.entrySet().removeIf(entry -> {
            Object IiIIiIiiiI = this;
            if (!((iiIiiIiIIi)IiIIiIiiiI).IiiIIIIiiI((class_2338)(this = entry).getKey())) {
                return (4 ^ 5) != 0;
            }
            return false;
        });
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, AtomicBoolean atomicBoolean, int n) {
        int n2;
        void IiIIiIiiiI;
        class_2338 IiIIiIiiiI2;
        int this22 = n;
        iiIiiIiIIi IiIIiIiiiI3 = this;
        CardinalDirection[] this22 = class_310.getInstance().world.getBlockState(IiIIiIiiiI2 = IiIIiIiiiI2.up(this22)).getBlock();
        if (!this22.equals(class_2246.AIR) && !this22.equals(class_2246.WATER)) {
            IiIIiIiiiI.set(5 >> 3);
            return;
        }
        this22 = CardinalDirection.values();
        int n3 = this22.length;
        int n4 = n2 = 3 >> 2;
        while (n4 < n3) {
            CardinalDirection cardinalDirection = this22[n2];
            if (!IiIIiIiiiI3.ALLATORIxDEMO((class_2338)(cardinalDirection = IiIIiIiiiI2.offset(cardinalDirection.toDirection(), 2 ^ 3)))) {
                IiIIiIiiiI.set(3 >> 2);
                return;
            }
            n4 = ++n2;
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        iiIiiIiIIi iiIiiIiIIi2 = this;
        boolean bl = Input.isPressed((class_304)class_310.getInstance().options.forwardKey) || Input.isPressed((class_304)class_310.getInstance().options.backKey) || Input.isPressed((class_304)class_310.getInstance().options.leftKey) || Input.isPressed((class_304)class_310.getInstance().options.rightKey);
        class_2338 class_23382 = class_310.getInstance().player.getBlockPos();
        int n = iiIiiIiIIi2.IiiIIiiiiI != null && !class_23382.equals((Object)iiIiiIiIIi2.IiiIIiiiiI) ? 4 ^ 5 : 0;
        if (bl || n != 0) {
            return true;
        }
        return false;
    }

    @Override
    public void onActivate() {
        iiIiiIiIIi iiIiiIiIIi2 = this;
        iiIiiIiIIi iiIiiIiIIi3 = this;
        iiIiiIiIIi iiIiiIiIIi4 = this;
        iiIiiIiIIi4.iiIiIiiiiI = 2 & 5;
        iiIiiIiIIi4.iIIiiIIIII = 3 >> 2;
        iiIiiIiIIi iiIiiIiIIi5 = this;
        iiIiiIiIIi3.IIIiIiiIIi = new HashMap<class_2338, Integer>();
        iiIiiIiIIi3.IiiIIiiiiI = class_310.getInstance().player.getBlockPos();
        iiIiiIiIIi3.IIiiIiiiII = null;
        iiIiiIiIIi iiIiiIiIIi6 = this;
        iiIiiIiIIi2.IiiIIIiiIi = new HashMap<class_2248, Integer>();
        iiIiiIiIIi2.IiIIIIiiii = 0L;
    }

    private /* synthetic */ class_2350 ALLATORIxDEMO(float f) {
        float f2 = f;
        iiIiiIiIIi IiIIiIiiiI = this;
        if ((f2 = (f2 % 360.0f + 360.0f) % 360.0f) >= 315.0f || f2 < 45.0f) {
            return class_2350.SOUTH;
        }
        if (f2 >= 45.0f && f2 < 135.0f) {
            return class_2350.WEST;
        }
        if (f2 >= 135.0f && f2 < 225.0f) {
            return class_2350.NORTH;
        }
        return class_2350.EAST;
    }

    private /* synthetic */ class_2338 ALLATORIxDEMO() {
        iiIiiIiIIi iiIiiIiIIi2 = object;
        if (iiIiiIiIIi2.IiiIIIiiIi.isEmpty()) {
            return null;
        }
        Object object = new ArrayList();
        class_2338 class_23383 = class_310.getInstance().player.getBlockPos();
        for (class_2338 class_23384 : IiiIiIIIIi.ALLATORIxDEMO(class_23383, (Integer)iiIiiIiIIi2.iIIiIIiiII.get(), (Integer)iiIiiIiIIi2.iiiiiIIIii.get())) {
            class_2248 class_22482;
            if (!iiIiiIiIIi2.ALLATORIxDEMO(class_23384, class_22482 = class_310.getInstance().world.getBlockState(class_23384).getBlock())) continue;
            int n = 2 ^ 3;
            class_22482 = class_23384.up(n);
            if (!(iiIiiIiIIi2.ALLATORIxDEMO(class_23383, (class_2338)class_22482) >= 1.0)) continue;
            object.add(class_23384);
        }
        if (object.isEmpty()) {
            return null;
        }
        if (((Boolean)iiIiiIiIIi2.IIIiIIIiII.get()).booleanValue() && (object = (List)object.stream().filter(class_23382 -> {
            void IiIIiIiiiI22;
            iiIiiIiIIi iiIiiIiIIi2 = iiIiiIiIIi3;
            if (!((Boolean)iiIiiIiIIi2.IIIiIIIiII.get()).booleanValue()) {
                return 5 >> 2;
            }
            class_2350 class_23502 = iiIiiIiIIi2.ALLATORIxDEMO();
            if (class_23502 == null) {
                return --1 != 0;
            }
            iiIiiIiIIi iiIiiIiIIi3 = class_310.getInstance().player.getBlockPos();
            void v0 = IiIIiIiiiI22;
            int IiIIiIiiiI22 = v0.getX() - iiIiiIiIIi3.getX();
            int this2 = v0.getZ() - iiIiiIiIIi3.getZ();
            switch (IiiIIiIiII.ALLATORIxDEMO[class_23502.ordinal()]) {
                case 1: {
                    if (this2 < 0) return false;
                    return --1 != 0;
                }
                case 3: {
                    if (this2 > 0) return false;
                    return (3 & 5) != 0;
                }
                case 2: {
                    if (IiIIiIiiiI22 < 0) return false;
                    return --1 != 0;
                }
                case 4: {
                    if (IiIIiIiiiI22 > 0) return false;
                    return (3 & 5) != 0;
                }
            }
            return true;
        }).collect(ArrayList::new, ArrayList::add, ArrayList::addAll)).isEmpty()) {
            return null;
        }
        object.sort(Comparator.comparingDouble(PlayerUtils::distanceTo));
        if (((TreeAura.SortMode)((Object)iiIiiIiIIi2.iiIIIIiIII.get())).equals((Object)TreeAura.SortMode.iiIIIIiIII)) {
            Collections.reverse(object);
        }
        return (class_2338)object.get(5 >> 3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2248 class_22482, class_2248 class_22483) {
        void IiIIiIiiiI;
        iiIiiIiIIi iiIiiIiIIi2 = iiIiiIiIIi3;
        iiIiiIiIIi iiIiiIiIIi3 = class_22483;
        iiIiiIiIIi IiIIiIiiiI2 = iiIiiIiIIi2;
        if (IiIIiIiiiI.equals(class_2246.CRIMSON_FUNGUS) && iiIiiIiIIi3.equals(class_2246.CRIMSON_NYLIUM)) {
            return 5 >> 2;
        }
        if (IiIIiIiiiI.equals(class_2246.WARPED_FUNGUS) && iiIiiIiIIi3.equals(class_2246.WARPED_NYLIUM)) {
            return (3 & 5) != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, class_2248 class_22482) {
        void IiIIiIiiiI;
        iiIiiIiIIi iiIiiIiIIi2 = object;
        Object object = class_22482;
        iiIiiIiIIi IiIIiIiiiI2 = iiIiiIiIIi2;
        if (object.equals(class_2246.CRIMSON_NYLIUM)) {
            if (IiIIiIiiiI2.IiiIIIiiIi.containsKey(class_2246.CRIMSON_FUNGUS)) {
                if (IiIIiIiiiI2.ALLATORIxDEMO((class_2338)IiIIiIiiiI, --1 != 0)) {
                    return (3 & 5) != 0;
                }
            }
            return false;
        }
        if (object.equals(class_2246.WARPED_NYLIUM)) {
            if (IiIIiIiiiI2.IiiIIIiiIi.containsKey(class_2246.WARPED_FUNGUS)) {
                if (IiIIiIiiiI2.ALLATORIxDEMO((class_2338)IiIIiIiiiI, --1 != 0)) {
                    return (2 ^ 3) != 0;
                }
            }
            return false;
        }
        boolean bl = object.equals(class_2246.GRASS_BLOCK) || object.equals(class_2246.MOSS_BLOCK) || object.equals(class_2246.PODZOL) || object.equals(class_2246.ROOTED_DIRT) || object.equals(class_2246.FARMLAND) || object.equals(class_2246.DIRT_PATH) || object.equals(class_2246.MYCELIUM) || object.equals(class_2246.DIRT) || object.equals(class_2246.COARSE_DIRT);
        if (bl) {
            object = IiIIiIiiiI2.IiiIIIiiIi.keySet().iterator();
            while (object.hasNext()) {
                if (!((class_2248)object.next() instanceof class_2473)) continue;
                return IiIIiIiiiI2.ALLATORIxDEMO((class_2338)IiIIiIiiiI, 3 >> 2);
            }
        }
        return false;
    }
}

