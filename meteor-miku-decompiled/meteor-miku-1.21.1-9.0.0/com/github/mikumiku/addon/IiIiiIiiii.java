/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.Settings
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.pathing.BaritoneUtils
 *  meteordevelopment.meteorclient.settings.BlockListSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.client.gui.screen.ingame.HandledScreen
 *  net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import com.github.mikumiku.addon.IIiIIIIIii;
import com.github.mikumiku.addon.iIiIiIiIII;
import com.github.mikumiku.addon.iIiiIiiiII;
import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiIiiIIIiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.iiiiIiiiII;
import com.github.mikumiku.addon.modules.AutoMiner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.pathing.BaritoneUtils;
import meteordevelopment.meteorclient.settings.BlockListSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen;

public class IiIiiIiiii
extends iiiiIiIiii {
    private final Setting<Integer> IIIiIIIiII;
    private class_2338 iiIiIiiiiI;
    private final Setting<AutoMiner.ToolType> IIiiIiiiII;
    private final SettingGroup IIIiIiiIIi;
    private final iiIiiIIIiI iiiIiIiIIi;
    private final SettingGroup iIiIiIiIii;
    private final Setting<Integer> iiiiiIIIii;
    private final Setting<Integer> iIIiIIiiII;
    private int IiiIIiiiiI;
    private IIiIIIIIii IiIIIIiiii;
    private final SettingGroup IiiIIIiiIi;
    private Set<class_2338> iiIIiiIiii;
    private final Setting<List<class_2248>> iIiiIiiiII;
    private class_2338 iIIiiIIIII;
    private final Setting<Boolean> iiIiIIiIIi;
    private AutoMiner.MinerState IIIIiIiiIi;
    private int IiIiIIIIiI;
    private final Setting<Boolean> iiiiiIIiiI;
    private final Setting<Integer> iiIIIIiIII;
    private class_2338 IiIIiIiiiI;
    private boolean ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int ALLATORIxDEMO(class_1799 class_17992) {
        IiIiiIiiii iiIiiIiiii = this;
        if (!(iiIiiIiiii.iiIIIIiIII.currentScreen instanceof class_495)) {
            return -4 >> 2;
        }
        class_1703 class_17032 = iiIiiIiiii.iiIIIIiIII.player.currentScreenHandler;
        int n = this = 5 >> 3;
        while (true) {
            void IiIIiIiiiI;
            if (n >= 27 || this >= class_17032.slots.size()) break;
            class_1799 class_17993 = class_17032.getSlot(this).getStack();
            if (class_17993.isEmpty()) {
                return this;
            }
            if (class_17993.getItem() == IiIIiIiiiI.getItem() && class_17993.getCount() < class_17993.getMaxCount()) {
                return this;
            }
            n = ++this;
        }
        return -1;
    }

    private /* synthetic */ void IIIIIIIiIi() {
        if (this.iiIIIIiIII.currentScreen instanceof class_495) {
            this.iiIIIIiIII.player.closeHandledScreen();
            iiiiIiiiII.ALLATORIxDEMO(iiIIIIiiIi.ALLATORIxDEMO("\u5128\u95d4\u6f07\u5f48\u7689"));
        }
    }

    private /* synthetic */ class_2338 iiIiiiiiII() {
        int n;
        IiIiiIiiii iiIiiIiiii = this;
        class_2338 class_23382 = iiIiiIiiii.iiIIIIiIII.player.getBlockPos();
        int n2 = n = 0xFFFFFFFD & 0xFFFFFFFF;
        while (true) {
            if (n2 > 3) break;
            int n3 = 0xFFFFFFFD & 0xFFFFFFFF;
            while (true) {
                int n4;
                if (n3 > 3) break;
                int n5 = 0xFFFFFFFF & 0xFFFFFFFD;
                while (true) {
                    if (n5 > 3) break;
                    class_2338 class_23383 = class_23382.add(n, n4, this);
                    if (iiIiiIiiii.iiIIIIiIII.world.getBlockState(class_23383).getBlock() instanceof class_2480) {
                        return class_23383;
                    }
                    n5 = ++this;
                }
                n3 = ++n4;
            }
            n2 = ++n;
        }
        return null;
    }

    private /* synthetic */ void IiIiiiIIii() {
        IiIiiIiiii iiIiiIiiii = iiIiiIiiii2;
        iiiiIiiiII.ALLATORIxDEMO(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u80d5\u534e\u5dcb\u6e8a\uff15\u6457\u7d3b\u5b13\u50b1\u6f17\u5f68\u7699"));
        IiIiiIiiii iiIiiIiiii2 = iiIiiIiiii.IiiIIIIiiI();
        if (iiIiiIiiii2 != null) {
            iiIiiIiiii.IIIIiIiiIi = AutoMiner.MinerState.iiIIiiIiii;
            iiIiiIiiii.iIiiIIiiIi();
            BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath((Goal)new GoalBlock((class_2338)iiIiiIiiii2));
            iiiiIiiiII.ALLATORIxDEMO("\u627e\u5230\u5b58\u50a8\u6f5c\u5f71\u76d2: " + iiIiiIiiii2.toShortString());
            return;
        }
        iiIiiIiiii.error(iiIIIIiiIi.ALLATORIxDEMO("\u6751\u6247\u526b\u5b61\u50f3\u6f65\u5f2a\u76eb\uff5a"), new Object[3 >> 2]);
        iiIiiIiiii.IIIIiIiiIi = AutoMiner.MinerState.IIIIiIiiIi;
    }

    private /* synthetic */ int IiiiiiiIIi() {
        IiIiiIiiii iiIiiIiiii = this;
        AutoMiner.ToolType toolType = (AutoMiner.ToolType)((Object)iiIiiIiiii.IIiiIiiiII.get());
        int n = this = 3 ^ 3;
        while (n < iiIiiIiiii.iiIIIIiIII.player.getInventory().size()) {
            IiIiiIiiii iiIiiIiiii2 = iiIiiIiiii;
            class_1799 class_17992 = iiIiiIiiii2.iiIIIIiIII.player.getInventory().getStack(this);
            List<class_1792> list = iiIiiIiiii2.ALLATORIxDEMO(toolType);
            if (!class_17992.isEmpty() && list.contains(class_17992.getItem()) && class_17992.isDamageable() && class_17992.getMaxDamage() - class_17992.getDamage() <= (Integer)iiIiiIiiii.iiIIIIiIII.get()) {
                return this + (0x3F & 0x5B);
            }
            n = ++this;
        }
        int n2 = this = 0;
        while (n2 < iiIiiIiiii.iiIIIIiIII.player.getInventory().size()) {
            if (iiIiiIiiii.iiIIIIiIII.player.getInventory().getStack(this).isEmpty()) {
                return this + (0x5B & 0x3F);
            }
            n2 = ++this;
        }
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void iiiiIIiIii() {
        IiIiiIiiii iiIiiIiiii;
        if (this.IiiiiiiIIi()) {
            this.iIIiIIiIii();
            return;
        }
        if (this.ALLATORIxDEMO) {
            IiIiiIiiii iiIiiIiiii2 = this;
            iiIiiIiiii2.IiiIIiiiiI += --1;
            if (iiIiiIiiii2.IiiIIiiiiI <= (0x2C & 0x7B)) return;
            this.ALLATORIxDEMO = 2 & 5;
            this.IiiIIiiiiI = this.ALLATORIxDEMO;
            this.warning(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u5ddc\u511c\u6f45\u5f3a\u76cb\u6218\u5f39\u8dee\u65ef\uff47\u91d4\u8b9e\u4e34e7e"), new Object[5 >> 3]);
            iiIiiIiiii = this;
        } else {
            iiIiiIiiii = this;
        }
        IiIiiIiiii iiIiiIiiii3 = this;
        if (iiIiiIiiii.IiiiiiiIIi()) {
            iiIiiIiiii3.iIIiIIiIii();
            return;
        }
        IiIiiIiiii iiIiiIiiii4 = this;
        if (iiIiiIiiii3.IiIIiIiiiI != null) {
            iiIiiIiiii4.ALLATORIxDEMO(this.IiIIiIiiiI);
            IiIiiIiiii iiIiiIiiii5 = this;
            iiIiiIiiii5.ALLATORIxDEMO = --1;
            iiIiiIiiii5.IiiIIiiiiI = 3 & 4;
            return;
        }
        iiIiiIiiii4.error(iiIIIIiiIi.ALLATORIxDEMO("\u5dbe\u516e\u6f27\u5f48\u7689\u4f74\u7f35\u6713\u8be5\u7f57\uff5a"), new Object[3 & 4]);
        this.IIIIiIiiIi = AutoMiner.MinerState.iIiiIiiiII;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void iiIiiiiIIi() {
        IiIiiIiiii iiIiiIiiii;
        IiIiiIiiii iiIiiIiiii2 = iiIiiIiiii5;
        if (iiIiiIiiii2.IiiiiiiIIi()) {
            iiIiiIiiii2.IiiiiiiiII();
            return;
        }
        if (iiIiiIiiii2.ALLATORIxDEMO) {
            IiIiiIiiii iiIiiIiiii3 = iiIiiIiiii2;
            iiIiiIiiii3.IiiIIiiiiI += --1;
            if (iiIiiIiiii3.IiiIIiiiiI <= (0x3A & 0x6D)) return;
            iiIiiIiiii2.ALLATORIxDEMO = 2 & 5;
            iiIiiIiiii2.IiiIIiiiiI = iiIiiIiiii2.ALLATORIxDEMO;
            iiIiiIiiii2.warning(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u6f45\u5f3a\u76cb\u6218\u5f39\u8dee\u65ef\uff47\u91d4\u8b9e\u4e34e7e"), new Object[3 ^ 3]);
            iiIiiIiiii = iiIiiIiiii2;
        } else {
            iiIiiIiiii = iiIiiIiiii2;
        }
        IiIiiIiiii iiIiiIiiii4 = iiIiiIiiii2;
        if (iiIiiIiiii.IiiiiiiIIi()) {
            iiIiiIiiii4.IiiiiiiiII();
            return;
        }
        IiIiiIiiii iiIiiIiiii5 = iiIiiIiiii4.iiIiiiiiII();
        IiIiiIiiii iiIiiIiiii6 = iiIiiIiiii2;
        if (iiIiiIiiii5 != null) {
            iiIiiIiiii6.ALLATORIxDEMO((class_2338)iiIiiIiiii5);
            IiIiiIiiii iiIiiIiiii7 = iiIiiIiiii2;
            iiIiiIiiii7.ALLATORIxDEMO = 5 >> 2;
            iiIiiIiiii7.IiiIIiiiiI = 3 & 4;
            return;
        }
        iiIiiIiiii6.error(iiIIIIiiIi.ALLATORIxDEMO("\u965d\u8faa\u6c98\u6752\u6247\u526b\u6f65\u5f2a\u76eb\uff5a"), new Object[3 & 4]);
        iiIiiIiiii2.IIIIiIiiIi = AutoMiner.MinerState.IIIIiIiiIi;
    }

    private /* synthetic */ void IiiIiIiIiI() {
        if (this.IiIIiIiiiI != null && this.iiIIIIiIII.player.getBlockPos().isWithinDistance((class_2382)this.IiIIiIiiiI, 4.0)) {
            this.IIIIiIiiIi = AutoMiner.MinerState.iIIiiIIIII;
            this.iIiiIIiiIi();
        }
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        IiIiiIiiii iiIiiIiiii = this;
        if (!(iiIiiIiiii.iiIIIIiIII.currentScreen instanceof class_495)) {
            return -4 >> 2;
        }
        IiIiiIiiii iiIiiIiiii2 = iiIiiIiiii;
        class_1703 class_17032 = iiIiiIiiii2.iiIIIIiIII.player.currentScreenHandler;
        AutoMiner.ToolType toolType = (AutoMiner.ToolType)((Object)iiIiiIiiii2.IIiiIiiiII.get());
        block0: for (class_1792 class_17922 : iiIiiIiiii.ALLATORIxDEMO(toolType)) {
            int n = 3 ^ 3;
            while (true) {
                if (n >= 27 || this >= class_17032.slots.size()) continue block0;
                class_1799 class_17992 = class_17032.getSlot(this).getStack();
                if (!(class_17992.isEmpty() || class_17992.getItem() != class_17922 || class_17992.isDamageable() && class_17992.getMaxDamage() - class_17992.getDamage() <= (Integer)iiIiiIiiii.iiIIIIiIII.get())) {
                    return this;
                }
                n = ++this;
            }
        }
        return -1;
    }

    private static /* synthetic */ boolean ALLATORIxDEMO(List list, class_1799 class_17992) {
        List IiIIiIiiiI = class_17992;
        List IiIIiIiiiI2 = list;
        return IiIIiIiiiI2.contains(IiIIiIiiiI.getItem());
    }

    private /* synthetic */ class_2338 IiiIIIIiiI() {
        int n;
        IiIiiIiiii iiIiiIiiii;
        IiIiiIiiii iiIiiIiiii2 = iiIiiIiiii = this;
        class_2338 class_23382 = iiIiiIiiii2.iiIIIIiIII.player.getBlockPos();
        int n2 = (Integer)iiIiiIiiii2.IIIiIIIiII.get();
        int n3 = n = -n2;
        while (n3 <= n2) {
            int n4 = -n2;
            while (n4 <= n2) {
                int n5;
                int n6 = -n2;
                while (n6 <= n2) {
                    int n7;
                    class_2338 class_23383 = class_23382.add(n, n5, n7);
                    if (iiIiiIiiii.iiIIIIiIII.world.getBlockState(class_23383).getBlock() instanceof class_2480 && !class_23383.equals((Object)iiIiiIiiii.IiIIiIiiiI)) {
                        return class_23383;
                    }
                    n6 = ++n7;
                }
                n4 = ++n5;
            }
            n3 = ++n;
        }
        return null;
    }

    private /* synthetic */ void iIIIiIIIii() {
        IiIiiIiiii iiIiiIiiii = arrayList;
        if (!BaritoneUtils.IS_AVAILABLE) {
            return;
        }
        try {
            Settings settings = BaritoneAPI.getSettings();
            ArrayList arrayList = new ArrayList();
            arrayList.add(class_2246.SHULKER_BOX);
            arrayList.add(class_2246.WHITE_SHULKER_BOX);
            arrayList.add(class_2246.ORANGE_SHULKER_BOX);
            arrayList.add(class_2246.MAGENTA_SHULKER_BOX);
            arrayList.add(class_2246.LIGHT_BLUE_SHULKER_BOX);
            arrayList.add(class_2246.YELLOW_SHULKER_BOX);
            arrayList.add(class_2246.LIME_SHULKER_BOX);
            arrayList.add(class_2246.PINK_SHULKER_BOX);
            arrayList.add(class_2246.GRAY_SHULKER_BOX);
            arrayList.add(class_2246.LIGHT_GRAY_SHULKER_BOX);
            arrayList.add(class_2246.CYAN_SHULKER_BOX);
            arrayList.add(class_2246.PURPLE_SHULKER_BOX);
            arrayList.add(class_2246.BLUE_SHULKER_BOX);
            arrayList.add(class_2246.BROWN_SHULKER_BOX);
            arrayList.add(class_2246.GREEN_SHULKER_BOX);
            arrayList.add(class_2246.RED_SHULKER_BOX);
            arrayList.add(class_2246.BLACK_SHULKER_BOX);
            settings.blocksToDisallowBreaking.value = arrayList;
            iiIiiIiiii.info(iiIIIIiiIi.ALLATORIxDEMO("\u5deb\u8bc5\u7f57{[\u001aK2M4w\u001e\u0019\u4f86\u629d\u621b\u6730\u6f07\u5f48\u7689"), new Object[2 & 5]);
            return;
        } catch (Exception exception) {
            iiIiiIiiii.warning("\u8bbe\u7f6e Baritone \u4fdd\u62a4\u5931\u8d25: " + exception.getMessage(), new Object[5 >> 3]);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ List<class_1792> ALLATORIxDEMO(AutoMiner.ToolType toolType) {
        IiIiiIiiii iiIiiIiiii = toolType2;
        AutoMiner.ToolType toolType2 = toolType;
        IiIiiIiiii IiIIiIiiiI = iiIiiIiiii;
        switch (toolType2.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                class_1792[] class_1792Array = new class_1792[5];
                class_1792Array[3 & 4] = class_1802.NETHERITE_SHOVEL;
                class_1792Array[2 ^ 3] = class_1802.DIAMOND_SHOVEL;
                class_1792Array[--2] = class_1802.IRON_SHOVEL;
                class_1792Array[--3] = class_1802.STONE_SHOVEL;
                class_1792Array[--4] = class_1802.WOODEN_SHOVEL;
                return Arrays.asList(class_1792Array);
            }
            case 1: {
                class_1792[] class_1792Array = new class_1792[5];
                class_1792Array[3 >> 2] = class_1802.NETHERITE_PICKAXE;
                class_1792Array[--1] = class_1802.DIAMOND_PICKAXE;
                class_1792Array[--2] = class_1802.IRON_PICKAXE;
                class_1792Array[--3] = class_1802.STONE_PICKAXE;
                class_1792Array[--4] = class_1802.WOODEN_PICKAXE;
                return Arrays.asList(class_1792Array);
            }
            case 2: {
                class_1792[] class_1792Array = new class_1792[5];
                class_1792Array[5 >> 3] = class_1802.NETHERITE_AXE;
                class_1792Array[5 >> 2] = class_1802.DIAMOND_AXE;
                class_1792Array[1 ^ 3] = class_1802.IRON_AXE;
                class_1792Array[--3] = class_1802.STONE_AXE;
                class_1792Array[--4] = class_1802.WOODEN_AXE;
                return Arrays.asList(class_1792Array);
            }
            case 3: 
        }
        class_1792[] class_1792Array = new class_1792[5];
        class_1792Array[3 >> 2] = class_1802.NETHERITE_HOE;
        class_1792Array[4 ^ 5] = class_1802.DIAMOND_HOE;
        class_1792Array[--2] = class_1802.IRON_HOE;
        class_1792Array[--3] = class_1802.STONE_HOE;
        class_1792Array[--4] = class_1802.WOODEN_HOE;
        return Arrays.asList(class_1792Array);
    }

    private /* synthetic */ void IiiiiiiIIi(int n, int n2) {
        int n3 = n;
        IiIiiIiiii IiIIiIiiiI = this;
        if (IiIIiIiiiI.iiIIIIiIII.interactionManager == null) {
            return;
        }
        IiIIiIiiiI.iiIIIIiIII.interactionManager.clickSlot(IiIIiIiiiI.iiIIIIiIII.player.currentScreenHandler.syncId, n3, 3 >> 2, class_1713.QUICK_MOVE, (class_1657)IiIIiIiiiI.iiIIIIiIII.player);
    }

    private /* synthetic */ boolean iiIiiiiiII() {
        IiIiiIiiii iiIiiIiiii = this;
        int n = 5 >> 3;
        int n2 = this = 0x3B & 0x4D;
        while (true) {
            if (n2 >= 36) break;
            if (iiIiiIiiii.iiIIIIiIII.player.getInventory().getStack(this).isEmpty()) {
                ++n;
            }
            n2 = ++this;
        }
        if (n <= --2) {
            return 3 >> 1;
        }
        return false;
    }

    private /* synthetic */ void iIiiIIiiIi() {
        BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
    }

    private /* synthetic */ void IIIIIIiIii() {
        IiIiiIiiii iiIiiIiiii = this;
        if ((this = iiIiiIiiii.iiIiiiiiII()) != null && iiIiiIiiii.iiIIIIiIII.player.getBlockPos().isWithinDistance((class_2382)this, 4.0)) {
            iiIiiIiiii.IIIIiIiiIi = AutoMiner.MinerState.iiIIIIiIII;
            iiIiiIiiii.iIiiIIiiIi();
        }
    }

    @Override
    public void onActivate() {
        super.onActivate();
        if (!BaritoneUtils.IS_AVAILABLE) {
            this.error(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\tx9P\u001fv%|k\u4e14\u53a4\u7531\uff4a"), new Object[3 ^ 3]);
            this.toggle();
            return;
        }
        IiIiiIiiii iiIiiIiiii = this;
        this.IIIIiIiiIi = AutoMiner.MinerState.iIiiIiiiII;
        iiIiiIiiii.IiIiIIIIiI = 3 ^ 3;
        iiIiiIiiii.iiIiIiiiiI = null;
        this.iIIiiIIIII = null;
        this.IiIIiIiiiI = null;
        this.iiIIiiIiii.clear();
        this.IiiIIiiiiI = 3 >> 2;
        this.ALLATORIxDEMO = 3 >> 2;
        this.iiiIiIiIIi.IiiIIIIiiI();
        this.ALLATORIxDEMO();
        iiiiIiiiII.ALLATORIxDEMO(iiIIIIiiIi.ALLATORIxDEMO("\u8191\u5291\u634d\u63a1\u6a7a\u576e\u5da9\u5416\u52f3"));
        iiiiIiiiII.ALLATORIxDEMO(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u8bbc\u53ca\u9545\u70a0\u51b0\u5dfc\u513c\u5b61\u50c3\u6f45\u5f3a\u76cb\u672e\u9010\u62a2\u5b9a\uff4a"));
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(InteractBlockEvent interactBlockEvent) {
        void IiIIiIiiiI;
        IiIiiIiiii iiIiiIiiii = iiIiiIiiii2;
        if (iiIiiIiiii.IIIIiIiiIi != AutoMiner.MinerState.iIiiIiiiII) {
            return;
        }
        IiIiiIiiii iiIiiIiiii2 = IiIIiIiiiI.result.getBlockPos();
        if (iiIiiIiiii.iiIIIIiIII.world.getBlockState((class_2338)iiIiiIiiii2).getBlock() instanceof class_2480) {
            iiIiiIiiii.IiIIiIiiiI = iiIiiIiiii2;
            iiIiiIiiii.IIIIiIiiIi = AutoMiner.MinerState.IIIIiIiiIi;
            iiIiiIiiii.iIIIiIIIii();
            IiIIiIiiiI.cancel();
            iiiiIiiiII.ALLATORIxDEMO("\u5de5\u5177\u6f5c\u5f71\u76d2\u5df2\u9009\u62e9: " + iiIiiIiiii2.toShortString());
            iiiiIiiiII.ALLATORIxDEMO(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u5deb\u4f96\u629d\u622b\u6710\u6f17\u5f68\u7699\u5154\u88e0\u630f\u63d3"));
            iiiiIiiiII.ALLATORIxDEMO(iiIIIIiiIi.ALLATORIxDEMO("\u5f5b\u59f2\u81b1\u5291\u634d\u63a1\uff5a"));
            return;
        }
        iiIiiIiiii.warning(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u8bee\u53b8\u9517\u70d2\u51e2\u6f17\u5f68\u7699\u675c\u9062\u62f0\u5dae\u516e\u5b13\u50b1\u4f06\u7f77\uff4a"), new Object[2 & 5]);
    }

    private /* synthetic */ void iIIiIIiIii() {
        IiIiiIiiii iiIiiIiiii = toolType;
        if (iiIiiIiiii.iiIIIIiIII.interactionManager == null) {
            return;
        }
        int n = iiIiiIiiii.ALLATORIxDEMO();
        if (n != -4 >> 2) {
            int n2 = iiIiiIiiii.IiiiiiiIIi();
            if (n2 != -4 >> 2) {
                IiIiiIiiii iiIiiIiiii2 = iiIiiIiiii;
                iiIiiIiiii2.IiiiiiiIIi(n, n2);
                iiIiiIiiii2.info(iiIIIIiiIi.ALLATORIxDEMO("\u83ec\u53ef\u65eb\u5ddc\u512c\u6229\u52c4"), new Object[3 & 4]);
                IiIiiIiiii iiIiiIiiii3 = iiIiiIiiii;
                iiIiiIiiii3.IIIIIIIiIi();
                if (((Boolean)iiIiiIiiii3.iiIiIIiIIi.get()).booleanValue() && iiIiiIiiii.iiIiIiiiiI != null) {
                    iiIiiIiiii.IIIIiIiiIi = AutoMiner.MinerState.ALLATORIxDEMO;
                    BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath((Goal)new GoalBlock(iiIiiIiiii.iiIiIiiiiI));
                    return;
                }
                iiIiiIiiii.IIIIiIiiIi = AutoMiner.MinerState.IIIIiIiiIi;
                return;
            }
            iiIiiIiiii.warning(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u8087\u531c\u5db9\u6ed8\uff67\u65f9\u6c9e\u83ae\u539d\u65a9\u5dae\u516e\uff4a"), new Object[2 & 5]);
            iiIiiIiiii.IIIIIIIiIi();
            iiIiiIiiii.IIIIiIiiIi = AutoMiner.MinerState.IIIIiIiiIi;
            return;
        }
        AutoMiner.ToolType toolType = (AutoMiner.ToolType)((Object)iiIiiIiiii.IIiiIiiiII.get());
        iiIiiIiiii.warning("\u6f5c\u5f71\u76d2\u4e2d\u6ca1\u6709\u627e\u5230\u53ef\u7528\u7684" + toolType.ALLATORIxDEMO() + "\uff01", new Object[2 & 5]);
        iiIiiIiiii.IIIIIIIiIi();
        iiIiiIiiii.IIIIiIiiIi = AutoMiner.MinerState.IIIIiIiiIi;
    }

    private /* synthetic */ boolean IiiIIIIiiI() {
        int n;
        IiIiiIiiii iiIiiIiiii = object;
        Object object = (AutoMiner.ToolType)((Object)iiIiiIiiii.IIiiIiiiII.get());
        if (!(object = InvUtils.find(arg_0 -> IiIiiIiiii.ALLATORIxDEMO(iiIiiIiiii.ALLATORIxDEMO((AutoMiner.ToolType)((Object)object)), arg_0))).found()) {
            return (2 ^ 3) != 0;
        }
        object = iiIiiIiiii.iiIIIIiIII.player.getInventory().getStack(object.slot());
        if (!object.isDamageable()) {
            return 3 >> 2;
        }
        Object object2 = object;
        int this2 = object2.getMaxDamage();
        if (this2 - (n = object2.getDamage()) <= (Integer)iiIiiIiiii.iiIIIIiIII.get()) {
            return --1 != 0;
        }
        return false;
    }

    private /* synthetic */ void ALLATORIxDEMO(int n, int n2) {
        int n3 = n;
        IiIiiIiiii IiIIiIiiiI = this;
        if (IiIIiIiiiI.iiIIIIiIII.interactionManager == null) {
            return;
        }
        IiIIiIiiiI.iiIIIIiIII.interactionManager.clickSlot(IiIIiIiiiI.iiIIIIiIII.player.currentScreenHandler.syncId, n3 += 0x7B & 0x1F, 5 >> 3, class_1713.QUICK_MOVE, (class_1657)IiIIiIiiiI.iiIIIIiIII.player);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IiIiiIiiii iiIiiIiiii = iiIiiIiiii2;
        IiIiiIiiii iiIiiIiiii2 = pre;
        IiIiiIiiii IiIIiIiiiI = iiIiiIiiii;
        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) {
            return;
        }
        if (IiIIiIiiiI.IIIIiIiiIi == AutoMiner.MinerState.iIiiIiiiII) {
            return;
        }
        if (IiIIiIiiiI.IiIiIIIIiI > 0) {
            IiIIiIiiiI.IiIiIIIIiI -= 3 >> 1;
            return;
        }
        switch (IiIIiIiiiI.IIIIiIiiIi.ordinal()) {
            case 1: {
                IiIiiIiiii iiIiiIiiii3 = IiIIiIiiiI;
                while (false) {
                }
                IiIiiIiiii iiIiiIiiii4 = iiIiiIiiii3;
                iiIiiIiiii3.IiiIIIIiiI();
                break;
            }
            case 3: {
                IiIiiIiiii iiIiiIiiii5 = IiIIiIiiiI;
                IiIiiIiiii iiIiiIiiii4 = iiIiiIiiii5;
                iiIiiIiiii5.IiIiiiIIii();
                break;
            }
            case 4: {
                IiIiiIiiii iiIiiIiiii6 = IiIIiIiiiI;
                IiIiiIiiii iiIiiIiiii4 = iiIiiIiiii6;
                iiIiiIiiii6.iIIiiiIiiI();
                break;
            }
            case 5: {
                IiIiiIiiii iiIiiIiiii7 = IiIIiIiiiI;
                IiIiiIiiii iiIiiIiiii4 = iiIiiIiiii7;
                iiIiiIiiii7.IIIIIIiIii();
                break;
            }
            case 6: {
                IiIiiIiiii iiIiiIiiii8 = IiIIiIiiiI;
                IiIiiIiiii iiIiiIiiii4 = iiIiiIiiii8;
                iiIiiIiiii8.IiiIiIiIiI();
                break;
            }
            case 7: {
                IiIiiIiiii iiIiiIiiii9 = IiIIiIiiiI;
                IiIiiIiiii iiIiiIiiii4 = iiIiiIiiii9;
                iiIiiIiiii9.iiIiiiiIIi();
                break;
            }
            case 8: {
                IiIiiIiiii iiIiiIiiii10 = IiIIiIiiiI;
                IiIiiIiiii iiIiiIiiii4 = iiIiiIiiii10;
                iiIiiIiiii10.iiiiIIiIii();
                break;
            }
            case 9: {
                IiIIiIiiiI.IiiiiiiIIi();
            }
            default: {
                IiIiiIiiii iiIiiIiiii4 = IiIIiIiiiI;
            }
        }
        iiIiiIiiii4.IiIiIIIIiI = (Integer)IiIIiIiiiI.iIIiIIiiII.get();
    }

    private /* synthetic */ boolean IiiiiiiIIi() {
        if (this.iiIIIIiIII.currentScreen instanceof class_495 || this.iiIIIIiIII.currentScreen instanceof class_465) {
            return true;
        }
        return false;
    }

    private /* synthetic */ void IiIiiiIIiI() {
        IiIiiIiiii iiIiiIiiii = iiIiiIiiii2;
        if (!BaritoneUtils.IS_AVAILABLE) {
            return;
        }
        try {
            IiIiiIiiii iiIiiIiiii2 = BaritoneAPI.getSettings();
            BaritoneAPI.getSettings().blocksToDisallowBreaking.value = new ArrayList();
            return;
        } catch (Exception exception) {
            iiIiiIiiii.warning("\u6e05\u7406 Baritone \u4fdd\u62a4\u8bbe\u7f6e\u5931\u8d25: " + exception.getMessage(), new Object[2 & 5]);
            return;
        }
    }

    private /* synthetic */ void IiiiiiiiII() {
        IiIiiIiiii iiIiiIiiii;
        IiIiiIiiii iiIiiIiiii2;
        block15: {
            int n;
            iiIiiIiiii2 = iiIiiIiiii3;
            if (iiIiiIiiii2.iiIIIIiIII.interactionManager == null) {
                return;
            }
            int n2 = 0;
            int n3 = 0x3F & 0x5B;
            List list = (List)iiIiiIiiii2.iIiiIiiiII.get();
            int cfr_ignored_0 = 5 >> 3;
            int n4 = n = 0x5B & 0x2D;
            while (true) {
                if (n4 >= 36) break;
                IiIiiIiiii iiIiiIiiii3 = iiIiiIiiii2.iiIIIIiIII.player.getInventory().getStack(n);
                if (!iiIiiIiiii3.isEmpty()) {
                    int n5;
                    block14: {
                        int n6 = 3 & 4;
                        for (class_2248 class_22482 : list) {
                            if (iiIiiIiiii3.getItem() != class_22482.asItem()) continue;
                            n5 = n6 = 2 ^ 3;
                            break block14;
                        }
                        n5 = n6;
                    }
                    if (n5 != 0) {
                        int n7 = iiIiiIiiii2.ALLATORIxDEMO((class_1799)iiIiiIiiii3);
                        if (n7 != -4 >> 2) {
                            IiIiiIiiii iiIiiIiiii4 = iiIiiIiiii2;
                            ++n2;
                            iiIiiIiiii4.ALLATORIxDEMO(n, n7);
                            int n8 = 2 ^ 3;
                            iiIiiIiiii4.info("\u79fb\u52a8" + iiIiiIiiii3.getItem().getName().getString() + "\u5230\u6f5c\u5f71\u76d2\uff0c\u6570\u91cf: " + iiIiiIiiii3.getCount(), new Object[3 >> 2]);
                            if (n2 >= n3) {
                                iiIiiIiiii = iiIiiIiiii2;
                                break block15;
                            }
                        } else {
                            IiIiiIiiii iiIiiIiiii5;
                            class_2248 class_22482;
                            class_22482 = iiIiiIiiii2.ALLATORIxDEMO();
                            if (class_22482 != null) {
                                IiIiiIiiii iiIiiIiiii6 = iiIiiIiiii2;
                                IiIiiIiiii iiIiiIiiii7 = iiIiiIiiii2;
                                iiIiiIiiii7.IIIIIIIiIi();
                                iiIiiIiiii7.ALLATORIxDEMO((class_2338)class_22482);
                                iiIiiIiiii6.ALLATORIxDEMO = 3 >> 1;
                                iiIiiIiiii6.IiiIIiiiiI = 3 >> 2;
                                return;
                            }
                            IiIiiIiiii iiIiiIiiii8 = iiIiiIiiii2;
                            iiIiiIiiii8.IIIIIIIiIi();
                            if (((Boolean)iiIiiIiiii8.iiIiIIiIIi.get()).booleanValue() && iiIiiIiiii2.iiIiIiiiiI != null) {
                                iiIiiIiiii5 = iiIiiIiiii2;
                                iiIiiIiiii2.IIIIiIiiIi = AutoMiner.MinerState.ALLATORIxDEMO;
                                BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath((Goal)new GoalBlock(iiIiiIiiii2.iiIiIiiiiI));
                            } else {
                                iiIiiIiiii5 = iiIiiIiiii2;
                                iiIiiIiiii2.IIIIiIiiIi = AutoMiner.MinerState.IIIIiIiiIi;
                            }
                            iiIiiIiiii5.info(iiIIIIiiIi.ALLATORIxDEMO("\u7250\u549a\u5b61\u50f3\u5bb5\u624b"), new Object[3 ^ 3]);
                            return;
                        }
                    }
                }
                n4 = ++n;
            }
            iiIiiIiiii = iiIiiIiiii2;
        }
        if (!iiIiiIiiii.ALLATORIxDEMO()) {
            IiIiiIiiii iiIiiIiiii9;
            IiIiiIiiii iiIiiIiiii10 = iiIiiIiiii2;
            iiIiiIiiii10.IIIIIIIiIi();
            if (((Boolean)iiIiiIiiii10.iiIiIIiIIi.get()).booleanValue() && iiIiiIiiii2.iiIiIiiiiI != null) {
                iiIiiIiiii9 = iiIiiIiiii2;
                iiIiiIiiii2.IIIIiIiiIi = AutoMiner.MinerState.ALLATORIxDEMO;
                BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath((Goal)new GoalBlock(iiIiiIiiii2.iiIiIiiiiI));
            } else {
                iiIiiIiiii9 = iiIiiIiiii2;
                iiIiiIiiii2.IIIIiIiiIi = AutoMiner.MinerState.IIIIiIiiIi;
            }
            iiIiiIiiii9.info(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u7270\u548a\u5b41\u50e3\u5b95\u625b"), new Object[3 & 4]);
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        IiIiiIiiii iiIiiIiiii = this;
        List list = (List)iiIiiIiiii.iIiiIiiiII.get();
        int n = this = 3 & 4;
        while (n < iiIiiIiiii.iiIIIIiIII.player.getInventory().size()) {
            class_1799 class_17992 = iiIiiIiiii.iiIIIIiIII.player.getInventory().getStack(this);
            if (!class_17992.isEmpty()) {
                for (class_2248 class_22482 : list) {
                    if (class_17992.getItem() != class_22482.asItem()) continue;
                    return 3 >> 1;
                }
            }
            n = ++this;
        }
        return false;
    }

    private /* synthetic */ void iIIiiiIiiI() {
        iiiiIiiiII.ALLATORIxDEMO("\u5de5\u5177\u8010\u4e45\u5ea6\u8fc7\u4f4e\uff0c\u524d\u5f80\u5de5\u5177\u6f5c\u5f71\u76d2\u83b7\u53d6" + ((AutoMiner.ToolType)((Object)this.IIiiIiiiII.get())).ALLATORIxDEMO());
        if (this.IiIIiIiiiI != null) {
            this.IIIIiIiiIi = AutoMiner.MinerState.iiiiiIIiiI;
            BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath((Goal)new GoalBlock(this.IiIIiIiiiI));
            iiiiIiiiII.ALLATORIxDEMO("\u524d\u5f80\u5de5\u5177\u5b58\u50a8\u6f5c\u5f71\u76d2: " + this.IiIIiIiiiI.toShortString());
            return;
        }
        this.error(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u5da3\u5168\u6f11\u5f6f\u769e\u4f13\u7f62\u6713\u8bd5\u7f77\uff4a\u8bce\u91a6\u65a9\u5464\u52b1\u6a6a\u576e\u5e1d\u9010\u62a2\u5dfc\u513c\u6f45\u5f3a\u76cb\u3049"), new Object[2 & 5]);
        this.IIIIiIiiIi = AutoMiner.MinerState.iIiiIiiiII;
        iiiiIiiiII.ALLATORIxDEMO(iiIIIIiiIi.ALLATORIxDEMO("\u8bac\u53ea\u9555\u7080\u51a0\u5ddc\u512c\u5b41\u50d3\u6f65\u5f2a\u76eb\u673e\u9030\u62b2\u5bba\uff5a"));
    }

    public void onDeactivate() {
        if (BaritoneUtils.IS_AVAILABLE) {
            IiIiiIiiii iiIiiIiiii = this;
            iiIiiIiiii.iIiiIIiiIi();
            iiIiiIiiii.IiIiiiIIiI();
        }
        IiIiiIiiii iiIiiIiiii = this;
        iiIiiIiiii.iiiIiIiIIi.iIIiiiIiiI();
        iiIiiIiiii.iiIIiiIiii.clear();
        iiiiIiiiII.ALLATORIxDEMO(iiIIIIiiIi.ALLATORIxDEMO("\u8191\u5291\u634d\u63a1\u6a7a\u576e\u5da9\u5065\u6b39"));
    }

    public void iiIiiiiiII() {
        IiIiiIiiii iiIiiIiiii = this;
        iiIiiIiiii.IiIIiIiiiI = null;
        iiIiiIiiii.IIIIiIiiIi = AutoMiner.MinerState.iIiiIiiiII;
        iiiiIiiiII.ALLATORIxDEMO(iiIIIIiiIi.ALLATORIxDEMO("\u5ddb\u512b\u6f22\u5f6d\u76cb\u9072\u62d0\u5da9\u91d4\u7f15\uff35\u8bac\u91f4\u65eb\u53ea\u9555\u9030\u62b2\u5ddc\u512c\u6f65\u5f2a\u76eb\uff5a"));
    }

    public IiIiiIiiii() {
        IiIiiIiiii iiIiiIiiii = this;
        super(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u635d\u6c80\u635d\u4e19\u524c"), iiIIIIiiIi.ALLATORIxDEMO("\u81f3\u52d3\u632f\u63c3\u631e\u5be1\u6580\u570c\uff35\u6574\u6318\u80b7\u533c\u7bfa\u743f\u54d7\u5ddc\u512c\u66cd\u6339"));
        iiIiiIiiii.IIIiIiiIIi = iiIiiIiiii.settings.getDefaultGroup();
        iiIiiIiiii.iIiIiIiIii = iiIiiIiiii.settings.createGroup(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u6f17\u5f68\u7699\u8ba7\u7f25"));
        iiIiiIiiii.IiiIIIiiIi = iiIiiIiiii.settings.createGroup(iiIIIIiiIi.ALLATORIxDEMO("\u5ddc\u512c\u7b98\u745d"));
        class_2248[] class_2248Array = new class_2248[4 ^ 5];
        class_2248Array[5 >> 3] = class_2246.SAND;
        iiIiiIiiii.iIiiIiiiII = iiIiiIiiii.IIIiIiiIIi.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u630f\u63d3\u76f7\u684c"))).description(iiIIIIiiIi.ALLATORIxDEMO("\u89da\u630f\u63e3\u76bd\u65e2\u576e\u7c20\u57b2{\u5923\u9052"))).defaultValue(Arrays.asList(class_2248Array))).build());
        this.iiiiiIIIii = this.IIIiIiiIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u630f\u63d3\u831a\u56bf"))).description(iiIIIIiiIi.ALLATORIxDEMO("\u6467\u7d1b\u76b5\u683e\u65e2\u576e\u76df\u833a\u56af"))).defaultValue((Object)(0x67 & 0x38))).min(--4).max(0x4FEF & 0x30D8).sliderMin(0x58 & 0x2F).sliderMax(0x3CFF & 0x43C8).build());
        this.iiiiiIIiiI = this.IIIiIiiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u4f66\u7563\u6798\u9054\u531c\u635d"))).description(iiIIIIiiIi.ALLATORIxDEMO("\u4f46\u7573\u531c\u636d\u4e48\u634d\u5451\u56af\u76f7\u687c\u6580\u570c\uff35\u53b4\u80c4\u633a\u4e34\u526b"))).defaultValue((Object)(5 >> 3))).build());
        this.iIIiIIiiII = this.IIIiIiiIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u5eef\u8f94"))).description(iiIIIIiiIi.ALLATORIxDEMO("\u6496\u4f65\u4e10\u95ed\u76ff\u5ecf\u8f84\uff31/P8R\uff52"))).defaultValue((Object)(--5))).min(5 >> 3).max(0x54 & 0x3F).sliderMin(2 & 5).sliderMax(0x3E & 0x55).build());
        this.iiIiIIiIIi = this.IIIiIiiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u81f3\u52e3\u8fcd\u5695"))).description(iiIIIIiiIi.ALLATORIxDEMO("\u5bf7\u6229\u5b03\u5091\u624d\u53cf\u5d9e\u514e\u5455\u81d3\u52f3\u8fed\u5685\u632f\u63c3"))).defaultValue((Object)(3 >> 1))).build());
        this.IIIiIIIiII = this.iIiIiIiIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u6f17\u5f68\u7699\u6405\u7d69\u5353\u5fcf"))).description(iiIIIIiiIi.ALLATORIxDEMO("\u6405\u7d59\u6f65\u5f2a\u76eb\u76df\u5373\u5fdf\u833a\u56af"))).defaultValue((Object)(0x63 & 0x3C))).min(--4).max(0x1ACE & 0x65F9).sliderMin(0x79 & 0xE).sliderMax(0x28DC & 0x57EB).build());
        this.IIiiIiiiII = this.IiiIIIiiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u5dfc\u513c\u7c62\u57c0"))).description(iiIIIIiiIi.ALLATORIxDEMO("\u9072\u62d0\u4f24\u7511\u76df\u5ddc\u512c\u7c42\u57d0"))).defaultValue((Object)AutoMiner.ToolType.IiIiIIIIiI)).build());
        this.iiIIIIiIII = this.IiiIIIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u674b\u4f57\u805b\u4e5c\u5eed"))).description(iiIIIIiiIi.ALLATORIxDEMO("\u5ddc\u512c\u8009\u4e3e\u5e9f\u4f15\u4eb7\u6b3f\u5005\u65ad\u66cd\u6339"))).defaultValue((Object)(0x7F & 0xA))).min(--1).max(0x66 & 0x7D).build());
        IiIiiIiiii iiIiiIiiii2 = this;
        IiIiiIiiii iiIiiIiiii3 = this;
        IiIiiIiiii iiIiiIiiii4 = this;
        this.IIIIiIiiIi = AutoMiner.MinerState.iIiiIiiiII;
        iiIiiIiiii4.IiIiIIIIiI = 5 >> 3;
        iiIiiIiiii4.IiIIIIiiii = iIiIiIiIII.ALLATORIxDEMO();
        iiIiiIiiii4.iiIiIiiiiI = null;
        iiIiiIiiii3.iIIiiIIIII = null;
        iiIiiIiiii3.IiIIiIiiiI = null;
        IiIiiIiiii iiIiiIiiii5 = this;
        iiIiiIiiii3.iiIIiiIiii = new HashSet<class_2338>();
        iiIiiIiiii2.IiiIIiiiiI = 3 >> 2;
        iiIiiIiiii2.ALLATORIxDEMO = 3 ^ 3;
        IiIiiIiiii iiIiiIiiii6 = this;
        iiIiiIiiii2.iiiIiIiIIi = new iiIiiIIIiI(5000L);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("N ;mJ\u000e9>I\u000fx?|j\u0019\u8b9c\u66ed\u65fb\u5229\u674b\u65a9\u7203\u6735\uff4a"));
        }
    }

    private /* synthetic */ void IiiIIIIiiI() {
        IiIiiIiiii iiIiiIiiii = iiIiiIiiii2;
        if (iiIiiIiiii.iiIiiiiiII()) {
            iiIiiIiiii.IIIIiIiiIi = AutoMiner.MinerState.IiIiIIIIiI;
            return;
        }
        if (iiIiiIiiii.IiiIIIIiiI()) {
            iiIiiIiiii.IIIIiIiiIi = AutoMiner.MinerState.iiIiIIiIIi;
            return;
        }
        IiIiiIiiii iiIiiIiiii2 = iiIiiIiiii.IiiiiiiIIi();
        if (iiIiiIiiii2 != null) {
            if (iiIiiIiiii.iIIiiIIIII == null || !iiIiiIiiii.iIIiiIIIII.equals((Object)iiIiiIiiii2)) {
                class_2338 class_23382;
                if (((Boolean)iiIiiIiiii.iiiiiIIiiI.get()).booleanValue() && !iiIiiIiiii.iiiIiIiIIi.ALLATORIxDEMO((class_2338)iiIiiIiiii2)) {
                    class_23382 = iiIiiIiiii.iiIIIIiIII.player.getBlockPos();
                    IiIiiIiiii iiIiiIiiii3 = iiIiiIiiii2;
                    double d = Math.sqrt(Math.pow(iiIiiIiiii2.getX() - class_23382.getX(), 2.0) + Math.pow(iiIiiIiiii3.getY() - class_23382.getY(), 2.0) + Math.pow(iiIiiIiiii2.getZ() - class_23382.getZ(), 2.0));
                    if (iiIiiIiiii3.getY() >= class_23382.getY() && d < 4.2) {
                        IiIiiIiiii iiIiiIiiii4 = iiIiiIiiii2;
                        iiIiiIiiii.iiiIiIiIIi.ALLATORIxDEMO((class_2338)iiIiiIiiii4);
                        BlockUtils.breakBlock((class_2338)iiIiiIiiii4, (boolean)(--1 != 0));
                    }
                }
                IiIiiIiiii iiIiiIiiii5 = iiIiiIiiii;
                iiIiiIiiii5.iIIiiIIIII = iiIiiIiiii2;
                iiIiiIiiii5.iiIiIiiiiI = iiIiiIiiii5.iiIIIIiIII.player.getBlockPos();
                class_23382 = iiIiiIiiii5.iiIIIIiIII.world.getBlockState((class_2338)iiIiiIiiii2).getBlock();
                BaritoneAPI.getProvider().getPrimaryBaritone().getMineProcess().mine(((List)iiIiiIiiii.iIiiIiiiII.get()).toArray(new class_2248[3 & 4]));
                return;
            }
        } else {
            iiiiIiiiII.ALLATORIxDEMO(iiIIIIiiIi.ALLATORIxDEMO("\u965d\u8faa\u6c98\u6752\u6247\u526b\u76d7\u685c\u6580\u570c"));
        }
    }

    private /* synthetic */ void IiiiiiiIIi() {
        if (this.iiIiIiiiiI != null && this.iiIIIIiIII.player.getBlockPos().isWithinDistance((class_2382)this.iiIiIiiiiI, 3.0)) {
            IiIiiIiiii iiIiiIiiii = this;
            iiIiiIiiii.IIIIiIiiIi = AutoMiner.MinerState.IIIIiIiiIi;
            iiIiiIiiii.iIiiIIiiIi();
            iiIiiIiiii.info(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u5db9\u8fcd\u5695\u630f\u63d3\u4f54\u7f25"), new Object[5 >> 3]);
        }
    }

    private /* synthetic */ class_2338 IiiiiiiIIi() {
        int n;
        IiIiiIiiii iiIiiIiiii;
        IiIiiIiiii iiIiiIiiii2 = iiIiiIiiii = this;
        class_2338 class_23382 = iiIiiIiiii2.iiIIIIiIII.player.getBlockPos();
        class_2338 class_23383 = null;
        double d = Double.MAX_VALUE;
        List list = (List)iiIiiIiiii2.iIiiIiiiII.get();
        int n2 = (Integer)iiIiiIiiii.iiiiiIIIii.get();
        int n3 = n = -n2;
        while (n3 <= n2) {
            int n4 = -n2;
            while (n4 <= n2) {
                int n5;
                int n6 = -n2;
                while (n6 <= n2) {
                    int n7;
                    class_2338 class_23384 = class_23382.add(n, n5, n7);
                    class_2248 class_22482 = iiIiiIiiii.iiIIIIiIII.world.getBlockState(class_23384).getBlock();
                    if (list.contains(class_22482)) {
                        double d2;
                        double d3 = class_23382.getSquaredDistance((class_2382)class_23384);
                        if (d2 < d) {
                            d = d3;
                            class_23383 = class_23384;
                        }
                    }
                    n6 = ++n7;
                }
                n4 = ++n5;
            }
            n3 = ++n;
        }
        return class_23383;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        int n;
        IiIiiIiiii iiIiiIiiii;
        IiIiiIiiii iiIiiIiiii2 = iiIiiIiiii = this;
        iiIiiIiiii2.iiIIiiIiii.clear();
        class_2338 class_23382 = iiIiiIiiii2.iiIIIIiIII.player.getBlockPos();
        int n2 = (Integer)iiIiiIiiii2.IIIiIIIiII.get();
        int n3 = n = -n2;
        while (n3 <= n2) {
            int n4 = -n2;
            while (n4 <= n2) {
                int n5;
                int n6 = -n2;
                while (n6 <= n2) {
                    int n7;
                    class_2338 class_23383 = class_23382.add(n, n5, n7);
                    if (iiIiiIiiii.iiIIIIiIII.world.getBlockState(class_23383).getBlock() instanceof class_2480) {
                        iiIiiIiiii.iiIIiiIiii.add(class_23383);
                    }
                    n6 = ++n7;
                }
                n4 = ++n5;
            }
            n3 = ++n;
        }
        iiiiIiiiII.ALLATORIxDEMO("\u5df2\u626b\u63cf\u5230 " + iiIiiIiiii.iiIIiiIiii.size() + " \u4e2a\u6f5c\u5f71\u76d2\uff0c\u5c06\u88ab\u4fdd\u62a4");
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        IiIiiIiiii iiIiiIiiii = iiIiiIiiii2;
        IiIiiIiiii iiIiiIiiii2 = class_23382;
        IiIiiIiiii IiIIiIiiiI = iiIiiIiiii;
        if (IiIIiIiiiI.iiIIIIiIII.interactionManager == null || IiIIiIiiiI.iiIIIIiIII.player == null) {
            return;
        }
        try {
            if (!IiIIiIiiiI.iiIIIIiIII.player.getBlockPos().isWithinDistance((class_2382)iiIiiIiiii2, 5.0)) {
                IiIIiIiiiI.warning(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u8dc4\u79f0\u6f65\u5f1a\u76cb\u5961\u8fc5\uff47\u65f9\u6c9e\u624a\u5f4b"), new Object[3 >> 2]);
                return;
            }
            class_2248 class_22482 = IiIIiIiiiI.iiIIIIiIII.world.getBlockState((class_2338)iiIiiIiiii2).getBlock();
            if (!(class_22482 instanceof class_2480)) {
                IiIIiIiiiI.warning("\u76ee\u6807\u4f4d\u7f6e\u4e0d\u662f\u6f5c\u5f71\u76d2: " + iiIiiIiiii2.toShortString(), new Object[3 ^ 3]);
                return;
            }
            class_243 class_2432 = class_243.ofCenter((class_2382)iiIiiIiiii2);
            class_2350 class_23502 = class_2350.UP;
            class_2432 = new class_3965(class_2432, class_23502, (class_2338)iiIiiIiiii2, (3 ^ 3) != 0);
            IiIiiIiiii iiIiiIiiii3 = IiIIiIiiiI;
            IiIIiIiiiI.iiIIIIiIII.interactionManager.interactBlock(iiIiiIiiii3.iiIIIIiIII.player, class_1268.MAIN_HAND, (class_3965)class_2432);
            iiIiiIiiii3.info("\u6b63\u5728\u6253\u5f00\u6f5c\u5f71\u76d2: " + iiIiiIiiii2.toShortString(), new Object[5 >> 3]);
            return;
        } catch (Exception exception) {
            IiIIiIiiiI.error("\u6253\u5f00\u6f5c\u5f71\u76d2\u65f6\u53d1\u751f\u9519\u8bef: " + exception.getMessage(), new Object[2 & 5]);
            return;
        }
    }

    private /* synthetic */ class_2338 ALLATORIxDEMO() {
        int n;
        IiIiiIiiii iiIiiIiiii;
        IiIiiIiiii iiIiiIiiii2 = iiIiiIiiii = this;
        class_2338 class_23382 = iiIiiIiiii2.iiIIIIiIII.player.getBlockPos();
        int n2 = (Integer)iiIiiIiiii2.IIIiIIIiII.get();
        int n3 = n = -n2;
        while (n3 <= n2) {
            int n4 = -n2;
            while (n4 <= n2) {
                int n5;
                int n6 = -n2;
                while (n6 <= n2) {
                    int n7;
                    class_2338 class_23383 = class_23382.add(n, n5, n7);
                    if (iiIiiIiiii.iiIIIIiIII.world.getBlockState(class_23383).getBlock() instanceof class_2480 && !class_23383.equals((Object)iiIiiIiiii.IiIIiIiiiI)) {
                        return class_23383;
                    }
                    n6 = ++n7;
                }
                n4 = ++n5;
            }
            n3 = ++n;
        }
        return null;
    }
}

