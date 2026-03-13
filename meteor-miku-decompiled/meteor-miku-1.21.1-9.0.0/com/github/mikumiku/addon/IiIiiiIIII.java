/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Position
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IIiIiIiiIi;
import com.github.mikumiku.addon.iiIiiIIIiI;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;

public class IiIiiiIIII
extends iiiiIiIiii {
    private final Setting<Boolean> iIIiIIiiII;
    private static final long IiiIIiiiiI = 5000L;
    private final Set<class_2338> IiIIIIiiii;
    private final SettingGroup IiiIIIiiIi;
    private final List<class_2248> iiIIiiIiii;
    private int iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private final Setting<Boolean> iiIiIIiIIi;
    private final Setting<Integer> IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private final SettingGroup iiiiiIIiiI;
    private long iiIIIIiIII;
    private final Setting<Integer> IiIIiIiiiI;
    private final Setting<Boolean> ALLATORIxDEMO;

    public void onDeactivate() {
        this.IiIIIIiiii.clear();
        this.iIiiIiiiII = 3 ^ 3;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2248 class_22482) {
        IiIiiiIIII iiIiiiIIII2 = iiIiiiIIII3;
        IiIiiiIIII iiIiiiIIII3 = class_22482;
        IiIiiiIIII IiIIiIiiiI = iiIiiiIIII2;
        if (iiIiiiIIII3 == class_2246.OBSIDIAN || iiIiiiIIII3 == class_2246.CRYING_OBSIDIAN) {
            return (Boolean)IiIIiIiiiI.iIIiiIIIII.get();
        }
        if (iiIiiiIIII3 == class_2246.STONE || iiIiiiIIII3 == class_2246.STONE_BRICKS || iiIiiiIIII3 == class_2246.DEEPSLATE || iiIiiiIIII3 == class_2246.COBBLED_DEEPSLATE) {
            return (Boolean)IiIIiIiiiI.ALLATORIxDEMO.get();
        }
        if (iiIiiiIIII3 == class_2246.COBBLESTONE) {
            return (Boolean)IiIIiIiiiI.iiIiIIiIIi.get();
        }
        if (iiIiiiIIII3.getDefaultState().toString().contains(iiIiiIIIiI.ALLATORIxDEMO("u\u001ad\u0018n\u0005"))) {
            return (Boolean)IiIIiIiiiI.iIIiIIiiII.get();
        }
        return true;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        long l = System.currentTimeMillis();
        if (l - this.iiIIIIiIII >= 5000L) {
            this.error(IIiIiIiiIi.ALLATORIxDEMO("\u808b\u5375\u4e71\u6ce0\u6764\u5392\u7579\u76f8\u9662\u62d0\u65e1\u5721\uff5b"), new Object[2 & 5]);
            this.iiIIIIiIII = l;
        }
    }

    private /* synthetic */ List<class_2338> ALLATORIxDEMO(class_2338 class_23382, class_2338 class_23383) {
        IiIiiiIIII iiIiiiIIII2 = this;
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        if (((Boolean)iiIiiiIIII2.IiIiIIIIiI.get()).booleanValue()) {
            class_243 class_2432 = IiIIiIiiiI.toCenterPos();
            class_243 class_2433 = IiIIiIiiiI.toCenterPos().subtract(class_2432).normalize();
            int n = this = -4 >> 2;
            while (true) {
                if (n <= 1) {
                    int n2 = -4 >> 2;
                    while (true) {
                        int n3;
                        if (n2 > 1) break;
                        if (this != 0 || n3 != 0) {
                            class_2338 class_23384 = IiIIiIiiiI.add(this, 3 >> 2, n3);
                            arrayList.add(class_23384);
                        }
                        n2 = ++n3;
                    }
                    n = ++this;
                    continue;
                }
                break;
            }
        } else {
            class_243 class_2434 = IiIIiIiiiI.toCenterPos();
            class_243 class_2435 = IiIIiIiiiI.toCenterPos().subtract(class_2434).normalize();
            int n = this = --1;
            while (true) {
                if (n > 2) break;
                class_243 class_2436 = class_2434.add(class_2435.multiply((double)this));
                class_2338 class_23385 = class_2338.ofFloored((class_2374)class_2436);
                arrayList.add(class_23385);
                arrayList.add(class_23385.up());
                n = ++this;
            }
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_1511 class_15112) {
        Object IiIIiIiiiI;
        IiIiiiIIII iiIiiiIIII2;
        IiIiiiIIII iiIiiiIIII3 = iiIiiiIIII2 = iiIiiiIIII4;
        IiIiiiIIII iiIiiiIIII4 = iiIiiiIIII3.iiIIIIiIII.player.getBlockPos();
        IiIIiIiiiI = IiIIiIiiiI.getBlockPos();
        IiIIiIiiiI = iiIiiiIIII3.ALLATORIxDEMO((class_2338)iiIiiiIIII4, (class_2338)IiIIiIiiiI).iterator();
        block0: while (true) {
            Object object = IiIIiIiiiI;
            while (true) {
                if (!object.hasNext()) {
                    return false;
                }
                iiIiiiIIII4 = (class_2338)IiIIiIiiiI.next();
                if (!iiIiiiIIII2.iiIIIIiIII.world.getBlockState((class_2338)iiIiiiIIII4).isAir()) continue block0;
                if (!iiIiiiIIII2.IiIIIIiiii.contains(iiIiiiIIII4)) break;
                object = IiIIiIiiiI;
            }
            FindItemResult findItemResult = iiIiiiIIII2.ALLATORIxDEMO();
            if (!findItemResult.found()) {
                iiIiiiIIII2.ALLATORIxDEMO();
                return 5 >> 3;
            }
            if (iiIiiiIIII2.ALLATORIxDEMO((class_2338)iiIiiiIIII4, findItemResult)) break;
        }
        IiIiiiIIII iiIiiiIIII5 = iiIiiiIIII2;
        iiIiiiIIII5.IiIIIIiiii.add((class_2338)iiIiiiIIII4);
        iiIiiiIIII5.info("\u5728 " + iiIiiiIIII4.toShortString() + " \u653e\u7f6e\u9632\u62a4\u65b9\u5757\u62b5\u6321\u6c34\u6676", new Object[2 & 5]);
        return 3 >> 1;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        IiIiiiIIII iiIiiiIIII2 = object;
        Object object = post;
        IiIiiiIIII IiIIiIiiiI = iiIiiiIIII2;
        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) {
            return;
        }
        if (IiIIiIiiiI.iIiiIiiiII > 0) {
            IiIIiIiiiI.iIiiIiiiII -= 3 >> 1;
            return;
        }
        object = IiIIiIiiiI.ALLATORIxDEMO();
        if (object.isEmpty()) {
            IiIIiIiiiI.IiIIIIiiii.clear();
            return;
        }
        object = object.iterator();
        while (object.hasNext()) {
            class_1511 class_15112 = (class_1511)object.next();
            if (!IiIIiIiiiI.ALLATORIxDEMO(class_15112)) continue;
            IiIIiIiiiI.iIiiIiiiII = (Integer)IiIIiIiiiI.IiIIiIiiiI.get();
            return;
        }
    }

    private static /* synthetic */ boolean ALLATORIxDEMO(class_2248 class_22482, class_1799 class_17992) {
        class_2248 IiIIiIiiiI = class_17992;
        class_2248 IiIIiIiiiI2 = class_22482;
        if ((IiIIiIiiiI = IiIIiIiiiI.getItem()) instanceof class_1747) {
            if (((class_1747)IiIIiIiiiI).getBlock() == IiIIiIiiiI2) {
                return (4 ^ 5) != 0;
            }
            return false;
        }
        return false;
    }

    private /* synthetic */ List<class_1511> ALLATORIxDEMO() {
        IiIiiiIIII iiIiiiIIII2 = iiIiiiIIII3;
        ArrayList<class_1511> arrayList = new ArrayList<class_1511>();
        for (IiIiiiIIII iiIiiiIIII3 : iiIiiiIIII2.iiIIIIiIII.world.getEntities()) {
            if (!(iiIiiiIIII3 instanceof class_1511)) continue;
            class_1511 class_15112 = (class_1511)iiIiiiIIII3;
            if (!PlayerUtils.isWithin((class_1297)iiIiiiIIII3, (double)((Integer)iiIiiiIIII2.IIIIiIiiIi.get()).intValue())) continue;
            arrayList.add(class_15112);
        }
        return arrayList;
    }

    public IiIiiiIIII() {
        IiIiiiIIII iiIiiiIIII2 = this;
        super(iiiiIiIiii.ALLATORIxDEMO, iiIiiIIIiI.ALLATORIxDEMO("\u819c\u52ad\u6357\u6c31\u6600"), IIiIiIiiIi.ALLATORIxDEMO("\u68b0\u6d17\u5240\u9618\u8fa1\u6777\u5735\u6c1d\u6626\u658a\u81bd\u52d3\u656e\u7f12\u65f4\u5736\u62b2\u630a"));
        iiIiiiIIII2.IiiIIIiiIi = iiIiiiIIII2.settings.getDefaultGroup();
        iiIiiiIIII2.iiiiiIIiiI = iiIiiiIIII2.settings.createGroup(iiIiiIIIiI.ALLATORIxDEMO("\u65bc\u5721\u8bbb\u7f18"));
        iiIiiiIIII2.IIIIiIiiIi = iiIiiiIIII2.IiiIIIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiIiiIi.ALLATORIxDEMO("\u688d\u6d2a\u8304\u56df"))).description(iiIiiIIIiI.ALLATORIxDEMO("\u68e5\u6d1d\u6c31\u6600\u7681\u8375\u56f1\uff7e\u6839\uff7f"))).defaultValue((Object)(0x1E & 0x67))).min(5 >> 2).max(0x1B & 0x6E).sliderMax(0x1B & 0x6E).build());
        this.IiIIiIiiiI = this.IiiIIIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiIiiIi.ALLATORIxDEMO("\u6573\u7f0f\u5ef1\u8ff4"))).description(iiIiiIIIiI.ALLATORIxDEMO("\u6568\u7f4b\u65ef\u5772\u76d2\u5ef3\u8fa9\uff0d\u0002l\u0015n\uff7f"))).defaultValue((Object)(2 & 5))).min(3 & 4).max(0x3E & 0x55).sliderMax(0x5E & 0x35).build());
        this.IiIiIIIIiI = this.IiiIIIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiIiiIi.ALLATORIxDEMO("\u4eb9\u8157\u8fd8\u6539\u7f45"))).description(iiIiiIIIiI.ALLATORIxDEMO("\u5388\u5739\u73ac\u5bc0\u813f\u8fef\u653b\u7f18\u659c\u5701\uff29\u805a\u4e28\u6679\u572d\u6c42\u6673\u54fa\u73ac\u5bc0\u4e4e\u9582"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iIIiiIIIII = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiIiiIi.ALLATORIxDEMO("\u4f03\u7565\u9eb0\u66db\u77d8"))).description(iiIiiIIIiI.ALLATORIxDEMO("\u4f6e\u514d\u4f09\u752d\u9ea7\u66d9\u7785"))).defaultValue((Object)(--1 != 0))).build());
        this.ALLATORIxDEMO = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiIiiIi.ALLATORIxDEMO("\u4f32\u7549\u77f4\u591f"))).description(iiIiiIIIiI.ALLATORIxDEMO("\u4f09\u752d\u7785\u5931\u7c0d\u65bc\u5721"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iIIiIIiiII = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiIiiIi.ALLATORIxDEMO("\u4f32\u7549\u672f\u591f"))).description(iiIiiIIIiI.ALLATORIxDEMO("\u4f09\u752d\u675e\u5931\u7c0d\u65bc\u5721"))).defaultValue((Object)(--1 != 0))).build());
        this.iiIiIIiIIi = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiIiiIi.ALLATORIxDEMO("\u4f32\u7549\u5701\u77d8"))).description(iiIiiIIIiI.ALLATORIxDEMO("\u4f7a\u755e\u5703\u7785"))).defaultValue((Object)(5 >> 2))).build());
        IiIiiiIIII iiIiiiIIII3 = this;
        this.iIiiIiiiII = 3 >> 2;
        IiIiiiIIII iiIiiiIIII4 = this;
        iiIiiiIIII4.IiIIIIiiii = new HashSet<class_2338>();
        iiIiiiIIII3.iiIIIIiIII = 0L;
        class_2248[] class_2248Array = new class_2248[0x17 & 0x7A];
        class_2248Array[3 & 4] = class_2246.OBSIDIAN;
        class_2248Array[--1] = class_2246.CRYING_OBSIDIAN;
        class_2248Array[5 >> 1] = class_2246.STONE;
        class_2248Array[--3] = class_2246.COBBLESTONE;
        class_2248Array[--4] = class_2246.STONE_BRICKS;
        class_2248Array[--5] = class_2246.DEEPSLATE;
        class_2248Array[0x3E & 0x47] = class_2246.COBBLED_DEEPSLATE;
        class_2248Array[0x47 & 0x3F] = class_2246.OAK_PLANKS;
        class_2248Array[0x2C & 0x5B] = class_2246.SPRUCE_PLANKS;
        class_2248Array[0x2D & 0x5B] = class_2246.BIRCH_PLANKS;
        class_2248Array[0x1E & 0x6B] = class_2246.JUNGLE_PLANKS;
        class_2248Array[0x6F & 0x1B] = class_2246.ACACIA_PLANKS;
        class_2248Array[0xD & 0x7E] = class_2246.DARK_OAK_PLANKS;
        class_2248Array[0xD & 0x7F] = class_2246.MANGROVE_PLANKS;
        class_2248Array[0x6E & 0x1F] = class_2246.CHERRY_PLANKS;
        class_2248Array[0x1F & 0x6F] = class_2246.BAMBOO_PLANKS;
        class_2248Array[0x75 & 0x1A] = class_2246.DIRT;
        class_2248Array[0x53 & 0x3D] = class_2246.NETHERRACK;
        iiIiiiIIII3.iiIIiiIiii = Arrays.asList(class_2248Array);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiIiIiiIi.ALLATORIxDEMO("\u0000\u00105\u001d\u00039P)\u00008\u0011(`\bp\u8b8b\u66a3\u65cb\u5260\u677c\u65fd\u7229\u672b\uff2a"));
        }
    }

    @Override
    public void onActivate() {
        if (this.iiIIIIiIII == null) {
            this.iiIIIIiIII = (long)class_310.getInstance();
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, FindItemResult findItemResult) {
        void IiIIiIiiiI;
        IiIiiiIIII iiIiiiIIII2 = iiIiiiIIII3;
        IiIiiiIIII iiIiiiIIII3 = class_23382;
        IiIiiiIIII IiIIiIiiiI2 = iiIiiiIIII2;
        void v1 = IiIIiIiiiI;
        IIIiIiIiii.ALLATORIxDEMO(v1.slot());
        boolean this2 = iiiIIIIiiI.IiIiiiIIiI((class_2338)iiIiiiIIII3);
        IIIiIiIiii.ALLATORIxDEMO(v1.slot());
        return this2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ FindItemResult ALLATORIxDEMO() {
        IiIiiiIIII iiIiiiIIII2 = iiIiiiIIII3;
        Iterator<class_2248> iterator = iiIiiiIIII2.iiIIiiIiii.iterator();
        block0: do {
            Iterator<class_2248> iterator2 = iterator;
            while (true) {
                if (!iterator2.hasNext()) {
                    return new FindItemResult(3 ^ 3, 3 >> 2);
                }
                IiIiiiIIII iiIiiiIIII3 = iterator.next();
                if (iiIiiiIIII2.ALLATORIxDEMO((class_2248)iiIiiiIIII3)) continue block0;
                iterator2 = iterator;
            }
        } while (!(iiIiiiIIII3 = InvUtils.find(arg_0 -> IiIiiiIIII.ALLATORIxDEMO((class_2248)iiIiiiIIII3, arg_0))).found());
        return iiIiiiIIII3;
    }
}

