/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.pathing.goals.GoalNear
 *  baritone.api.pathing.goals.GoalXZ
 *  baritone.api.utils.BetterBlockPos
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Modules
 *  meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightModes
 *  meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.world.Dimension
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.text.Text
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.client.gui.screen.ingame.HandledScreen
 *  net.minecraft.component.type.ContainerComponent
 *  net.minecraft.component.DataComponentTypes
 *  org.jetbrains.annotations.Nullable
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalNear;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.utils.BetterBlockPos;
import com.github.mikumiku.addon.IIiiiiiIii;
import com.github.mikumiku.addon.IiIIiIIiII;
import com.github.mikumiku.addon.IiiIiiIiII;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIiIIIiIiI;
import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiIIiIiiii;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.iiiiIiiiII;
import com.github.mikumiku.addon.mixinface.MoveEvent;
import com.github.mikumiku.addon.modules.MEnum;
import com.github.mikumiku.addon.modules.UniversalSupply;
import com.github.mikumiku.addon.util.BaritoneUtil;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFlightModes;
import meteordevelopment.meteorclient.systems.modules.movement.elytrafly.ElytraFly;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.world.Dimension;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.text.Text;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.component.DataComponentTypes;
import org.jetbrains.annotations.Nullable;

public class IiIiIiiiIi
extends iiiiIiIiii {
    private UniversalSupply.SupplyState iiiiIiiIIi;
    public Setting<Boolean> iiIIiIiiIi;
    private final SettingGroup IiIiiiiIIi;
    private final Setting<Integer> iiIIiIiiII;
    private final Setting<Integer> IIiIiiIiIi;
    private final Setting<Integer> IIiIIiIIii;
    private double iIiiIiiiii;
    private final Setting<Integer> iIiIiiIiiI;
    public class_2338 IIiiiiiiII;
    private final SettingGroup IIiiiIIIIi;
    private final Setting<Integer> IIIiIIIiII;
    private final Setting<Integer> iiIiIiiiiI;
    private final Setting<Integer> IIiiIiiiII;
    private int IIIiIiiIIi;
    private final Setting<MEnum.LandingMode> iiiIiIiIIi;
    private final Setting<Integer> iIiIiIiIii;
    private final SettingGroup iiiiiIIIii;
    public boolean iIIiIIiiII;
    private final SettingGroup IiiIIiiiiI;
    private final Setting<Integer> IiIIIIiiii;
    private boolean IiiIIIiiIi;
    private double iiIIiiIiii;
    private class_2338 iIiiIiiiII;
    private final Setting<Integer> iIIiiIIIII;
    public static long iiIiIIiIIi = 0L;
    private final Setting<Boolean> IIIIiIiiIi;
    private final Setting<Integer> IiIiIIIIiI;
    public Setting<Boolean> iiiiiIIiiI;
    private final Setting<Integer> iiIIIIiIII;
    private class_243 IiIIiIiiiI;
    private final Setting<Integer> ALLATORIxDEMO;

    private /* synthetic */ boolean IiiiiiiiII() {
        int n;
        IiIiIiiiIi iiIiIiiiIi2 = iiIiIiiiIi3;
        int n2 = 2 & 5;
        int n3 = n = 2 & 5;
        while (n3 < iiIiIiiiIi2.iiIIIIiIII.player.getInventory().size()) {
            IiIiIiiiIi iiIiIiiiIi3 = iiIiIiiiIi2.iiIIIIiIII.player.getInventory().getStack(n);
            if (iiIiIiiiIi3.getItem() == class_1802.ELYTRA) {
                ++n2;
                if (iiIiIiiiIi3.getMaxDamage() - iiIiIiiiIi3.getDamage() > (Integer)iiIiIiiiIi2.iiIiIiiiiI.get()) {
                    return (2 & 5) != 0;
                }
            }
            n3 = ++n;
        }
        if (n2 == 0) {
            return (2 ^ 3) != 0;
        }
        return true;
    }

    private /* synthetic */ Map<class_1792, Integer> IiiiiiiIIi() {
        int n;
        int n2;
        IiIiIiiiIi iiIiIiiiIi2 = iiIiIiiiIi3;
        HashMap<class_1792, Integer> hashMap = new HashMap<class_1792, Integer>();
        LinkedHashMap<class_1792, Integer> linkedHashMap = new LinkedHashMap<class_1792, Integer>();
        int n3 = n2 = 3 ^ 3;
        while (n3 < iiIiIiiiIi2.iiIIIIiIII.player.getInventory().size()) {
            class_1747 class_17472;
            class_2248 class_22482;
            class_1792 class_17922;
            IiIiIiiiIi iiIiIiiiIi3 = iiIiIiiiIi2.iiIIIIiIII.player.getInventory().getStack(n2);
            if (!(iiIiIiiiIi3.isEmpty() || (class_17922 = iiIiIiiiIi3.getItem()) instanceof class_1747 && (class_22482 = (class_17472 = (class_1747)class_17922).getBlock()) instanceof class_2480)) {
                if (class_17922 == class_1802.ELYTRA) {
                    int n4 = iiIiIiiiIi3.getMaxDamage() - iiIiIiiiIi3.getDamage();
                    if (n4 > (Integer)iiIiIiiiIi2.iiIiIiiiiI.get()) {
                        HashMap<class_1792, Integer> hashMap2 = hashMap;
                        hashMap2.put(class_17922, hashMap2.getOrDefault(class_17922, 3 ^ 3) + iiIiIiiiIi3.getCount());
                    }
                } else {
                    HashMap<class_1792, Integer> hashMap3 = hashMap;
                    class_1792 class_17923 = class_17922;
                    hashMap3.put(class_17923, hashMap3.getOrDefault(class_17923, 2 & 5) + iiIiIiiiIi3.getCount());
                }
            }
            n3 = ++n2;
        }
        n2 = hashMap.getOrDefault(class_1802.TOTEM_OF_UNDYING, 3 & 4);
        if (n2 < (Integer)iiIiIiiiIi2.IIiiIiiiII.get()) {
            linkedHashMap.put(class_1802.TOTEM_OF_UNDYING, (Integer)iiIiIiiiIi2.IIiiIiiiII.get() - n2);
        }
        int this_ = hashMap.getOrDefault(class_1802.EXPERIENCE_BOTTLE, 2 & 5);
        int n5 = (Integer)iiIiIiiiIi2.IiIIIIiiii.get();
        int n6 = IiIiIiiiIi.ALLATORIxDEMO(this_);
        if (n6 < n5) {
            linkedHashMap.put(class_1802.EXPERIENCE_BOTTLE, n5 - n6);
        }
        if ((n = hashMap.getOrDefault(class_1802.ELYTRA, 3 ^ 3).intValue()) < (Integer)iiIiIiiiIi2.iiIIIIiIII.get()) {
            linkedHashMap.put(class_1802.ELYTRA, (Integer)iiIiIiiiIi2.iiIIIIiIII.get() - n);
        }
        n2 = hashMap.getOrDefault(class_1802.CHORUS_FRUIT, 5 >> 3);
        this_ = (Integer)iiIiIiiiIi2.IIiIIiIIii.get();
        if ((n2 = IiIiIiiiIi.ALLATORIxDEMO(n2)) < this_) {
            linkedHashMap.put(class_1802.CHORUS_FRUIT, this_ - n2);
        }
        if (hashMap.getOrDefault(class_1802.FIREWORK_ROCKET, 3 >> 2) < (Integer)iiIiIiiiIi2.IIiIiiIiIi.get()) {
            linkedHashMap.put(class_1802.FIREWORK_ROCKET, 0x79 & 0x2E);
        }
        return linkedHashMap;
    }

    private /* synthetic */ void IIiiIIIIII() {
        this.ALLATORIxDEMO(class_1802.FIREWORK_ROCKET);
    }

    private /* synthetic */ void IIIiIIiIII() {
        IiIiIiiiIi iiIiIiiiIi2 = this;
        iiIiIiiiIi2.iIiiIiiiII = iiIiIiiiIi2.iiIIIIiIII.player.getBlockPos();
        ((Integer)iiIiIiiiIi2.iiIIiIiiII.get()).intValue();
    }

    private /* synthetic */ void IiiiiIiIIi() {
        IiIiIiiiIi iiIiIiiiIi2 = iiiiIiIiii2;
        iiiiIiIiii iiiiIiIiii2 = (IIiiiiiIii)Modules.get().get(IIiiiiiIii.class);
        if (!iiiiIiIiii2.isActive()) {
            ((IIiiiiiIii)iiiiIiIiii2).IiiIIIiiIi.set((Object)class_1802.FIREWORK_ROCKET);
            iiiiIiIiii2.toggle();
        }
    }

    public void iIIIIiiiII() {
        IiIiIiiiIi iiIiIiiiIi2;
        IiIiIiiiIi iiIiIiiiIi3 = this;
        this.iiIIIIiIII.player.setYaw((float)iiIiIiiiIi3.iIiiIiiiii);
        if (iiIiIiiiIi3.ALLATORIxDEMO() == Dimension.End) {
            iiIiIiiiIi2 = this;
        } else if (this.ALLATORIxDEMO() == Dimension.Overworld) {
            IiIiIiiiIi iiIiIiiiIi4 = this;
            iiIiIiiiIi2 = iiIiIiiiIi4;
            this.iiIIIIiIII.player.setPitch((float)iiIiIiiiIi4.iiIIiiIiii);
        } else {
            if (this.ALLATORIxDEMO() == Dimension.Nether) {
                IiIiIiiiIi iiIiIiiiIi5 = this;
                iiIiIiiiIi5.ALLATORIxDEMO(((Integer)iiIiIiiiIi5.iIiIiIiIii.get()).intValue(), ((Integer)this.iIiIiiIiiI.get()).intValue());
                BaritoneAPI.getProvider().getPrimaryBaritone().getElytraProcess().pathTo(this.IIiiiiiiII);
            }
            iiIiIiiiIi2 = this;
        }
        if (iiIiIiiiIi2.IiiIIIiiIi) {
            BaritoneAPI.getProvider().getPrimaryBaritone().getElytraProcess().pathTo(this.IIiiiiiiII);
        }
        IiIiIiiiIi iiIiIiiiIi6 = this;
        iiIiIiiiIi6.IIIiIiiIIi += 4 ^ 5;
        if (iiIiIiiiIi6.IIIiIiiIIi > (0x3F & 0x54)) {
            this.iiiiIiiIIi = UniversalSupply.SupplyState.iIiiIiiiII;
            this.info(iiIIIIiiIi.ALLATORIxDEMO("\u5da9\u605b\u5956\u98c7\u8837\u728f\u605a"), new Object[3 >> 2]);
        }
    }

    private /* synthetic */ boolean iIIiiiIiiI() {
        long l = this.iiIIIIiIII.world.getTimeOfDay() % 24000L;
        if (l >= 13000L && l <= 23000L) {
            return 5 >> 2;
        }
        return false;
    }

    private /* synthetic */ Dimension ALLATORIxDEMO() {
        return PlayerUtils.getDimension();
    }

    public static int ALLATORIxDEMO(int IiIIiIiiiI) {
        if (IiIIiIiiiI <= 0) {
            return 3 ^ 3;
        }
        return (IiIIiIiiiI + (0x7F & 0x3F)) / (0x72 & 0x4D);
    }

    private /* synthetic */ void iIiIIIIiiI() {
        if (this.IiiiiiiiII() || this.iiIiiiiiII()) {
            if (!IiiiIiiIII.IiiiiiiIIi(this.iiIIIIiIII)) {
                return;
            }
            this.iIIIIIIiiI();
            this.info(iiIIIIiiIi.ALLATORIxDEMO("\u68f9\u6d10\u5229\u977b\u89b8\u883e\u7ee0\uff57\u5f39\u5990\u9654\u8446\u6d78\u7a50"), new Object[2 & 5]);
            this.iiiiIiiIIi = UniversalSupply.SupplyState.IiIIiIiiiI;
        }
    }

    private /* synthetic */ boolean iiIiiiiiII() {
        if (iiIIIIiiIi.ALLATORIxDEMO(class_1802.FIREWORK_ROCKET) < (Integer)this.IIiIiiIiIi.get()) {
            return 3 >> 1;
        }
        return false;
    }

    private /* synthetic */ void IIiiiIIiiI() {
        this.ALLATORIxDEMO(class_1802.CHORUS_FRUIT);
    }

    private /* synthetic */ Map<class_1792, Integer> ALLATORIxDEMO() {
        int n;
        int n2;
        int n3;
        IiIiIiiiIi iiIiIiiiIi2 = linkedHashMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap<class_1792, Integer> linkedHashMap2 = new LinkedHashMap<class_1792, Integer>();
        int n4 = n3 = 2 & 5;
        while (n4 < iiIiIiiiIi2.iiIIIIiIII.player.getInventory().size()) {
            class_1799 class_17992 = iiIiIiiiIi2.iiIIIIiIII.player.getInventory().getStack(n3);
            if (!class_17992.isEmpty()) {
                class_1747 class_17472;
                class_2248 class_22482;
                class_1792 class_17922 = class_17992.getItem();
                if (class_17922 == class_1802.ELYTRA) {
                    n2 = class_17992.getMaxDamage() - class_17992.getDamage();
                    if (n2 > (Integer)iiIiIiiiIi2.iiIiIiiiiI.get()) {
                        LinkedHashMap linkedHashMap3 = linkedHashMap;
                        linkedHashMap3.put(class_17922, linkedHashMap3.getOrDefault(class_17922, 2 & 5) + class_17992.getCount());
                    }
                } else {
                    Object object = linkedHashMap;
                    class_1792 class_17923 = class_17922;
                    object.put(class_17923, object.getOrDefault(class_17923, 3 >> 2) + class_17992.getCount());
                }
                if (class_17922 instanceof class_1747 && (class_22482 = (class_17472 = (class_1747)class_17922).getBlock()) instanceof class_2480) {
                    iiIiIiiiIi2.ALLATORIxDEMO(class_17992, linkedHashMap);
                }
            }
            n4 = ++n3;
        }
        n3 = linkedHashMap.getOrDefault(class_1802.FIREWORK_ROCKET, 2 & 5);
        if (n3 < (Integer)iiIiIiiiIi2.IIiIiiIiIi.get()) {
            linkedHashMap2.put(class_1802.FIREWORK_ROCKET, (Integer)iiIiIiiiIi2.IIiIiiIiIi.get() - n3);
        }
        if ((n = linkedHashMap.getOrDefault(class_1802.TOTEM_OF_UNDYING, 5 >> 3).intValue()) < (Integer)iiIiIiiiIi2.IIiiIiiiII.get()) {
            linkedHashMap2.put(class_1802.TOTEM_OF_UNDYING, (Integer)iiIiIiiiIi2.IIiiIiiiII.get() - n);
        }
        int n5 = linkedHashMap.getOrDefault(class_1802.EXPERIENCE_BOTTLE, 3 & 4);
        n2 = (Integer)iiIiIiiiIi2.IiIIIIiiii.get();
        int n6 = IiIiIiiiIi.ALLATORIxDEMO(n5);
        if (n6 < n2) {
            linkedHashMap2.put(class_1802.EXPERIENCE_BOTTLE, n2 - n6);
        }
        if ((n3 = linkedHashMap.getOrDefault(class_1802.ELYTRA, 2 & 5).intValue()) < (Integer)iiIiIiiiIi2.iiIIIIiIII.get()) {
            linkedHashMap2.put(class_1802.ELYTRA, (Integer)iiIiIiiiIi2.iiIIIIiIII.get() - n3);
        }
        int this2 = linkedHashMap.getOrDefault(class_1802.CHORUS_FRUIT, 5 >> 3);
        n3 = (Integer)iiIiIiiiIi2.IIiIIiIIii.get();
        if ((this2 = IiIiIiiiIi.ALLATORIxDEMO(this2)) < n3) {
            linkedHashMap2.put(class_1802.CHORUS_FRUIT, n3 - this2);
        }
        return linkedHashMap2;
    }

    public IiIiIiiiIi() {
        IiIiIiiiIi iiIiIiiiIi2 = this;
        super(MoveEvent.ALLATORIxDEMO("\u8d16\u8d88\u52e9\u620c"), iiIIIIiiIi.ALLATORIxDEMO("\u9047\u7516\u5134\u8194\u52b4\u8d6f\u8d94\u0012\u7232\u8d5d\u881e\u7ee0\u7ca0\u7ec6U\u0019\u81b1\u5291\u595f\u743f\u6154\u590f\u8446\u5709u"));
        iiIiIiiiIi2.IiiIIiiiiI = iiIiIiiiIi2.settings.getDefaultGroup();
        iiIiIiiiIi2.IIiiiIIIIi = iiIiIiiiIi2.settings.createGroup(MoveEvent.ALLATORIxDEMO("\u674b\u5757\u8bfe\u7f29"));
        iiIiIiiiIi2.iiiiiIIIii = iiIiIiiiIi2.settings.createGroup(iiIIIIiiIi.ALLATORIxDEMO("\u5729\u728a\u8b87\u7f35"));
        iiIiIiiiIi2.IiIiiiiIIi = iiIiIiiiIi2.settings.createGroup(MoveEvent.ALLATORIxDEMO("\u4e7c\u4e76\u752b\u8bfe\u7f29"));
        iiIiIiiiIi2.iiIiIiiiiI = iiIiIiiiIi2.IiiIIiiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u97a1\u7f9e\u8009\u4e3e\u9631\u5067"))).description(MoveEvent.ALLATORIxDEMO("\u4f29\u4ece\u6b23\u8050\u4e02\u5ee6\u65b1\u8986\u53b6\u8825\u7e9e"))).defaultValue((Object)(0x4F & 0x3A))).min(5 >> 2).max(0x2DBF & 0x53F0).sliderMax(0x29B5 & 0x57FA).build());
        this.IIiIiiIiIi = this.IiiIIiiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u70e6\u82ea\u6569\u91b4\u9631\u5067"))).description(MoveEvent.ALLATORIxDEMO("\u4f0e\u4ec9\u6b24\u6537\u918f\u65b1\u8986\u53b6\u8825\u7e9e"))).defaultValue((Object)(0x16 & 0x7D))).min(4 ^ 5).max(0x7C95 & 0x3EA).sliderMax(0x3A8B & 0x45F4).build());
        this.IIiiIiiiII = this.IiiIIiiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u56c7\u8125\u887c\u513e\u6549\u9194"))).description(MoveEvent.ALLATORIxDEMO("\u4f29\u4ece\u6b23\u6530\u9188\u65b6\u8822\u7eb9\u5257\u6530\u9188"))).defaultValue((Object)(--4))).min(2 ^ 3).max(0x1F & 0x7E).sliderMax(0x1E & 0x7F).build());
        this.IiIIIIiiii = this.IiiIIiiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("#I\u883e\u517c\u652b\u91d6S\u7efdr"))).description(MoveEvent.ALLATORIxDEMO("\u4f29\u4ece\u6b23\u6530\u9188\u65b6\u8822\u7eb9\u5257\u6530\u9188"))).defaultValue((Object)(--2))).min(3 ^ 3).max(0x5F & 0x3E).sliderMax(0x5F & 0x3E).build());
        this.iiIIIIiIII = this.IiiIIiiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u97a1\u7f9e\u887c\u513e\u6549\u9194"))).description(MoveEvent.ALLATORIxDEMO("\u4f29\u4ece\u6b23\u6530\u9188\u65b6\u8822\u7eb9\u5257\u6530\u9188"))).defaultValue((Object)(5 >> 1))).min(3 >> 2).max(0x5F & 0x3E).sliderMax(0x5E & 0x3F).build());
        this.IIiIIiIIii = this.IiiIIiiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u7d70\u83e1\u67c7\u887c\u513e\u7efd\u652b"))).description(MoveEvent.ALLATORIxDEMO("\u4f29\u4ece\u6b23\u6530\u9188\u65b6\u8822\u7eb9\u5257\u6530\u9188"))).defaultValue((Object)(5 >> 2))).min(3 >> 2).max(0x7E & 0x1F).sliderMax(0x3F & 0x5E).build());
        this.iIIiiIIIII = this.IiiIIiiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u8d6e\u98a5\u89eb\u5efd"))).description(MoveEvent.ALLATORIxDEMO("\u5e9a\u8bc9ww"))).defaultValue((Object)(0x66 & 0x5F))).min(3 & 4).sliderRange(2 & 5, 0x5F & 0x7A).build());
        this.iiiIiIiIIi = this.IiiIIiiiiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u9654\u8446\u6580\u6c8e"))).description(MoveEvent.ALLATORIxDEMO("`\u3045"))).defaultValue((Object)MEnum.LandingMode.iiiiiIIiiI)).onChanged(IiIIiIiiiI -> {
            if (IiIIiIiiiI != MEnum.LandingMode.iiiiiIIiiI) {
                iiiiIiiiII.iIIiiiIiiI(MoveEvent.ALLATORIxDEMO("\u5f13\u520a\u53aa\u6568\u6341\u7d6c\u83b8\u67fb\u960d\u847a"));
            }
        })).build());
        this.IIIIiIiiIi = this.IiiIIiiiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u7a63\u6c6f\u6507\u7f35"))).description(MoveEvent.ALLATORIxDEMO("\u5100\u8bfe\u5774\u7a21\u6c5f\u4e61\u6539\u7f6e\u65fd\u5714\uff4c\u65a7\u8984\u657b\u7f32\u960b\u5272\u3041\u5e36\u4e53\u65fb\u5454\u53b3\u80a6\u4e0a\u7cbe\u518e\u304d\u974d\u89cb\u6740\u52eb\u562e\u656e\u6346l'\u5df2\u7785\u6548\u6341}@\b2 LG#$`\u4e4a\u656f\u6346ZGs$"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.IIIiIIIiII = this.IiiIIiiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u76f7\u687c\u9ae1\u5efd"))).description(MoveEvent.ALLATORIxDEMO("\u8805\u7ebe\u544e\u918a\u65f0\u9899\u880c\u76c3\u768e\u6860\u9a98\u5ee1"))).defaultValue((Object)(0x2B2C & 0x55FF))).min(0x4F & 0x3A).sliderMax(0x37BF & 0x5BC8).build());
        this.iiiiiIIiiI = this.iiiiiIIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u9669\u606f\u9b39\u7052\u7458"))).description(MoveEvent.ALLATORIxDEMO("\u9655\u6036\u9b05\u702b\u7444\uff4cg\u818a\u52cf\u56b4\u58de"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iiIIiIiiIi = this.iiiiiIIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u5769\u685c\u4e34\u7573\u7b98\u4f41\u81f3\u52d3\u66cd\u65eb"))).description(MoveEvent.ALLATORIxDEMO("\u9655\u6036\u9b05\u702b\u7444\uff4cg\u818a\u52cf\u56b4\u58de"))).defaultValue((Object)(3 >> 2))).build());
        this.iIiIiIiIii = this.iiiiiIIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u576b\u72c8\u76b5\u681e#\u5769\u685c"))).description(MoveEvent.ALLATORIxDEMO("\u7577\u4e6a\u97b3\u76a9\u6867?\u5710\u6840"))).defaultValue((Object)(3 >> 2))).build());
        this.iIiIiiIiiI = this.iiiiiIIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u576b\u72c8\u76b5\u681e!\u5769\u685c"))).description(MoveEvent.ALLATORIxDEMO("\u7577\u4e6a\u97b3\u76a9\u6867=\u5710\u6840"))).defaultValue((Object)(5 >> 3))).build());
        this.ALLATORIxDEMO = this.iiiiiIIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u5709\u72aa\u5b90\u5113\u5373\u5fdf"))).description(MoveEvent.ALLATORIxDEMO("\u68a7\u6d0b\u5bce\u5128\u960a\u847d\u537d\u57bf\u76e3\u530a\u5fc3"))).defaultValue((Object)(0xF & 0x7A))).min(--5).max(0x77 & 0x1C).sliderMax(0x3F & 0x54).build());
        this.IiIiIIIIiI = this.IiIiiiiIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u4e60\u4e2f\u7517\u5e6a\u538b\u9ae1\u5efd"))).description(MoveEvent.ALLATORIxDEMO("\u8825\u7e9e\u5e33\u53b7\u644d\u5e9d\u9a98\u5ee1"))).defaultValue((Object)(0x25EE & 0x5AD9))).min(0x7297 & 0xDFE).max(0x71BF & 0xF6C).sliderMax(0x25BE & 0x5B6D).build());
        this.iiIIiIiiII = this.IiIiiiiIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u5e6a\u538b\u591e\u5c54"))).description(MoveEvent.ALLATORIxDEMO("\u8822\u7e99\u5e34\u5390\u76e3\u8ff9\u9538"))).defaultValue((Object)(--5))).min(--3).max(0x7E & 0xB).sliderMax(0x4B & 0x3E).build());
        IiIiIiiiIi iiIiIiiiIi3 = this;
        IiIiIiiiIi iiIiIiiiIi4 = this;
        this.iiiiIiiIIi = UniversalSupply.SupplyState.iIiiIiiiII;
        iiIiIiiiIi4.IIIiIiiIIi = 2 & 5;
        iiIiIiiiIi4.IiiIIIiiIi = 3 >> 2;
        iiIiIiiiIi3.IIiiiiiiII = null;
        iiIiIiiiIi3.iIIiIIiiII = 3 ^ 3;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIIIIiiIi.ALLATORIxDEMO("n0\u001b}j\u001e\u0019.i\u001fX/|Z\u0019\u8bac\u66cd\u65eb\u5209\u675b\u65a9\u7233\u6715\uff5a"));
        }
    }

    private /* synthetic */ void IIiIiiIiiI() {
        this.IIiiiIIiiI();
    }

    private /* synthetic */ void iIIIIIIiiI() {
        IiIiIiiiIi iiIiIiiiIi2 = this;
        iiIiIiiiIi2.iIiiIiiiii = iiIiIiiiIi2.iiIIIIiIII.player.getYaw();
        iiIiIiiiIi2.iiIIiiIiii = iiIiIiiiIi2.iiIIIIiIII.player.getPitch();
        iiIiIiiiIi2.IiIIiIiiiI = iiIiIiiiIi2.iiIIIIiIII.player.getRotationVec(1.0f);
        IiIiIiiiIi iiIiIiiiIi3 = this;
        if (BaritoneAPI.getProvider().getPrimaryBaritone().getElytraProcess().isActive()) {
            iiIiIiiiIi3.IiiIIIiiIi = 3 >> 1;
            this.IIiiiiiiII = BaritoneAPI.getProvider().getPrimaryBaritone().getElytraProcess().currentDestination();
            return;
        }
        iiIiIiiiIi3.IiiIIIiiIi = false;
    }

    /*
     * Exception decompiling
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

