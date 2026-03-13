/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  meteordevelopment.meteorclient.events.game.GameLeftEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BlockPosSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnchantmentListSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.ItemListSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Category
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.passive.VillagerEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.screen.PlayerScreenHandler
 *  net.minecraft.screen.MerchantScreenHandler
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.enchantment.Enchantments
 *  net.minecraft.village.TradeOffer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.village.VillagerProfession
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.ingame.InventoryScreen
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.registry.Registries
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIIiiii;
import com.github.mikumiku.addon.IIiiIIIIII;
import com.github.mikumiku.addon.IiiiIIiiiI;
import com.github.mikumiku.addon.IiiiIIiiii;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.iiiiIiiiII;
import com.github.mikumiku.addon.modules.VillagerTrader;
import com.github.mikumiku.addon.util.BaritoneUtil;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.ObjectIntImmutablePair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import meteordevelopment.meteorclient.events.game.GameLeftEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BlockPosSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnchantmentListSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.ItemListSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.MerchantScreenHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.village.TradeOffer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.village.VillagerProfession;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.Registries;

public class IIiIIIiiII
extends iiiiIiIiii {
    private final Setting<Integer> IiIiiiiIIi;
    private final Setting<class_2338> iiIIiIiiII;
    private VillagerTrader.State IIiIiiIiIi;
    private final Setting<Integer> IIiIIiIIii;
    private int iIiiIiiiii;
    private final SettingGroup iIiIiiIiiI;
    private final Setting<Set<class_5321<class_1887>>> IIiiiiiiII;
    private final SettingGroup IIiiiIIIIi;
    private final SettingGroup IIIiIIIiII;
    private final Set<Integer> iiIiIiiiiI;
    private final Setting<Integer> IIiiIiiiII;
    private final Setting<Boolean> IIIiIiiIIi;
    private int iiiIiIiIIi;
    private final Setting<Integer> iIiIiIiIii;
    private final Setting<Integer> iiiiiIIIii;
    private final SettingGroup iIIiIIiiII;
    private int IiiIIiiiiI;
    private final Setting<class_2338> IiIIIIiiii;
    private final Setting<List<class_1792>> IiiIIIiiIi;
    private final Setting<Integer> iiIIiiIiii;
    private final Setting<Boolean> iIiiIiiiII;
    private final Setting<Integer> iIIiiIIIII;
    private boolean iiIiIIiIIi;
    private final Setting<Boolean> IIIIiIiiIi;
    private final SettingGroup IiIiIIIIiI;
    private final Setting<Map<String, String>> iiiiiIIiiI;
    private final Setting<class_2338> iiIIIIiIII;
    private final Setting<Integer> IiIIiIiiiI;
    private final Setting<List<class_3852>> ALLATORIxDEMO;

    public static class_3852 ALLATORIxDEMO(class_1646 IiIIiIiiiI) {
        return IiiiIiiIII.ALLATORIxDEMO(IiIIiIiiiI);
    }

    private /* synthetic */ void IIiIiIIIIi() {
        iiiiIiiiII.iIIiiiIiiI(IIiiIIIIII.ALLATORIxDEMO("\u5277\u5ff7\u4e5c\u677b\u887f\u7e8e\u7bab"));
        this.iiIiIIiIIi = 3 ^ 3;
        iiIIIIiiIi.ALLATORIxDEMO((class_2338)this.iiIIiIiiII.get(), ((Integer)this.iIIiiIIIII.get()).intValue());
        this.ALLATORIxDEMO(VillagerTrader.State.iIiiIiiiII);
    }

    private /* synthetic */ int IiiIIIIiiI() {
        IIiIIIiiII iIiIIIiiII = this;
        int n = 3 >> 2;
        HashSet<class_1792> hashSet = new HashSet<class_1792>((Collection)iIiIIIiiII.IiiIIIiiIi.get());
        if (((Boolean)iIiIIIiiII.IIIiIiiIIi.get()).booleanValue()) {
            hashSet.add(class_1802.ENCHANTED_BOOK);
        }
        int n2 = this = 0;
        while (true) {
            if (n2 >= 45) break;
            class_1799 class_17992 = iIiIIIiiII.iiIIIIiIII.player.getInventory().getStack(this);
            if (!class_17992.isEmpty() && hashSet.contains(class_17992.getItem())) {
                ++n;
            }
            n2 = ++this;
        }
        return n;
    }

    private /* synthetic */ boolean IiiiiiiIIi() {
        if (!((Boolean)this.IIIiIiiIIi.get()).booleanValue()) {
            return (3 & 4) != 0;
        }
        if (this.IiiiiiiIIi(class_1802.BOOK) < (Integer)this.IIiIIiIIii.get()) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(int n) {
        IIiIIIiiII iIiIIIiiII = iIiIIIiiII3;
        if (iIiIIIiiII.iiIIIIiIII.interactionManager == null) {
            return;
        }
        IIiIIIiiII iIiIIIiiII2 = iIiIIIiiII;
        IIiIIIiiII iIiIIIiiII3 = iIiIIIiiII2.iiIIIIiIII.player.currentScreenHandler;
        IIiIIIiiII iIiIIIiiII4 = iIiIIIiiII;
        if (iIiIIIiiII2.iiIIIIiIII.player.currentScreenHandler instanceof class_1723) {
            void IiIIiIiiiI;
            iIiIIIiiII4.iiIIIIiIII.interactionManager.clickSlot(((class_1703)iIiIIIiiII3).syncId, (int)IiIIiIiiiI, 3 >> 2, class_1713.PICKUP, (class_1657)iIiIIIiiII.iiIIIIiIII.player);
            IIiIIIiiII iIiIIIiiII5 = iIiIIIiiII;
            iIiIIIiiII5.iiIIIIiIII.interactionManager.clickSlot(((class_1703)iIiIIIiiII3).syncId, 2 ^ 3, 3 ^ 3, class_1713.PICKUP, (class_1657)iIiIIIiiII.iiIIIIiIII.player);
            iIiIIIiiII5.iiIIIIiIII.interactionManager.clickSlot(((class_1703)iIiIIIiiII3).syncId, 3 ^ 3, 3 & 4, class_1713.QUICK_MOVE, (class_1657)iIiIIIiiII.iiIIIIiIII.player);
            iIiIIIiiII5.iiIIIIiIII.player.closeHandledScreen();
            return;
        }
        iIiIIIiiII4.iiIIIIiIII.setScreen((class_437)new class_490((class_1657)iIiIIIiiII.iiIIIIiIII.player));
    }

    private /* synthetic */ void ALLATORIxDEMO(class_1297 class_12972) {
        IIiIIIiiII iIiIIIiiII = iIiIIIiiII2;
        IIiIIIiiII iIiIIIiiII2 = class_12972;
        IIiIIIiiII IiIIiIiiiI = iIiIIIiiII;
        if (IiIIiIiiiI.iiIIIIiIII.interactionManager == null) {
            return;
        }
        IiIIiIiiiI.iiIIIIiIII.interactionManager.interactEntity((class_1657)IiIIiIiiiI.iiIIIIiIII.player, (class_1297)iIiIIIiiII2, class_1268.MAIN_HAND);
    }

    private /* synthetic */ void IIIIIIIiIi() {
        iiiiIiiiII.iIIiiiIiiI(IiiiIIiiiI.ALLATORIxDEMO("\u5238\u5f8a\u5b0d\u50a2\u7be4"));
        this.iiIiIIiIIi = 2 & 5;
        iiIIIIiiIi.ALLATORIxDEMO((class_2338)this.IiIIIIiiii.get(), ((Integer)this.iIIiiIIIII.get()).intValue());
        this.ALLATORIxDEMO(VillagerTrader.State.iiIIiiIiii);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(int n, int n2, class_1713 class_17132) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IIiIIIiiII iIiIIIiiII = iIiIIIiiII2;
        IIiIIIiiII iIiIIIiiII2 = class_17132;
        IIiIIIiiII IiIIiIiiiI3 = iIiIIIiiII;
        if (IiIIiIiiiI3.iiIIIIiIII.interactionManager == null) {
            return;
        }
        IiIIiIiiiI3.iiIIIIiIII.interactionManager.clickSlot(IiIIiIiiiI3.iiIIIIiIII.player.currentScreenHandler.syncId, (int)IiIIiIiiiI2, (int)IiIIiIiiiI, (class_1713)iIiIIIiiII2, (class_1657)IiIIiIiiiI3.iiIIIIiIII.player);
    }

    private /* synthetic */ int IiiiiiiIIi() {
        IIiIIIiiII iIiIIIiiII = this;
        int n = 5 >> 3;
        int n2 = this = 0x1D & 0x6B;
        while (true) {
            if (n2 >= 45) break;
            if (iIiIIIiiII.iiIIIIiIII.player.getInventory().getStack(this).isEmpty()) {
                ++n;
            }
            n2 = ++this;
        }
        return n;
    }

    private /* synthetic */ void IiIiiiIIii() {
        IIiIIIiiII iIiIIIiiII = this;
        iIiIIIiiII.iIiiIiiiii += 4 ^ 5;
        if (iIiIIIiiII.iIiiIiiiii > (0x5A & 0x2F)) {
            this.iIiiIiiiii = 2 & 5;
            IIiIIIiiII iIiIIIiiII2 = this;
            if (this.IiiiiiiIIi(class_1802.EMERALD_BLOCK) > 0) {
                iIiIIIiiII2.ALLATORIxDEMO(VillagerTrader.State.IiiIIiiiiI);
                return;
            }
            iIiIIIiiII2.ALLATORIxDEMO(VillagerTrader.State.iiiiiIIiiI);
        }
    }

    private /* synthetic */ void iiiiIIiIii() {
        if (!this.iiIiIIiIIi) {
            int n = --1;
            if (this.iiIIIIiIII.player.getPos().distanceTo(class_243.ofCenter((class_2382)((class_2382)this.iiIIIIiIII.get()))) <= (double)((Integer)this.iIIiiIIIII.get() + n)) {
                this.iiIiIIiIIi = 4 ^ 5;
                this.IiiIIiiiiI = 2 & 5;
                this.ALLATORIxDEMO((class_2338)this.iiIIIIiIII.get());
                return;
            }
        } else {
            IIiIIIiiII iIiIIIiiII = this;
            iIiIIIiiII.IiiIIiiiiI += 4 ^ 5;
            if (iIiIIIiiII.iiIIIIiIII.player.currentScreenHandler != this.iiIIIIiIII.player.playerScreenHandler) {
                this.iIiiIiiiii = 3 >> 2;
                this.ALLATORIxDEMO(VillagerTrader.State.iiIIIIiIII);
                return;
            }
            IIiIIIiiII iIiIIIiiII2 = this;
            if (iIiIIIiiII2.IiiIIiiiiI > (Integer)iIiIIIiiII2.IIiiIiiiII.get()) {
                iiiiIiiiII.IiiiiiiIIi(IIiiIIIIII.ALLATORIxDEMO("\u6204\u5f1a\u8812\u7ee3\u7bc6\u8dbf\u65a1\uff16\u919a\u8bcf"));
                this.ALLATORIxDEMO(VillagerTrader.State.iiIiIIiIIi);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_1728 class_17282, class_1914 class_19142) {
        void IiIIiIiiiI22;
        IIiIIIiiII iIiIIIiiII = iIiIIIiiII2;
        IIiIIIiiII iIiIIIiiII2 = class_19142;
        IIiIIIiiII IiIIiIiiiI = iIiIIIiiII;
        int n = IiIIiIiiiI22.getRecipes().indexOf((Object)iIiIIIiiII2);
        if (n == -4 >> 2) {
            return (3 ^ 3) != 0;
        }
        void v1 = IiIIiIiiiI22;
        int n2 = n;
        v1.setRecipeIndex(n2);
        v1.switchTo(n2);
        int IiIIiIiiiI22 = iIiIIIiiII2.getMaxUses() - iIiIIIiiII2.getUses();
        int n3 = this = 3 ^ 3;
        while (n3 < IiIIiIiiiI22) {
            int n4 = --1;
            IiIIiIiiiI.ALLATORIxDEMO(5 >> 1, 3 >> 2, class_1713.QUICK_MOVE);
            n3 = ++this;
        }
        return true;
    }

    private /* synthetic */ void iiIiiiiIIi() {
        IIiIIIiiII iIiIIIiiII = this;
        iIiIIIiiII.iIiiIiiiii += 2 ^ 3;
        if (iIiIIIiiII.iiIIIIiIII.player.currentScreenHandler != this.iiIIIIiIII.player.playerScreenHandler) {
            IIiIIIiiII iIiIIIiiII2 = this;
            iIiIIIiiII2.ALLATORIxDEMO(class_1802.BOOK, (Integer)iIiIIIiiII2.IIiIIiIIii.get() / (0x74 & 0x4B));
            this.iiIIIIiIII.player.closeHandledScreen();
        }
        if (this.iIiiIiiiii > (0x7F & 0x14)) {
            this.iIiiIiiiii = 3 ^ 3;
            this.ALLATORIxDEMO(VillagerTrader.State.iiiiiIIiiI);
        }
    }

    public void onDeactivate() {
        IIiIIIiiII iIiIIIiiII = this;
        iIiIIIiiII.IIiIiiIiIi = VillagerTrader.State.iiIiIIiIIi;
        iIiIIIiiII.iiIiIiiiiI.clear();
        if (iIiIIIiiII.iiIIIIiIII.player != null && this.iiIIIIiIII.player.currentScreenHandler != null) {
            this.iiIIIIiIII.player.closeHandledScreen();
        }
    }

    /*
     * Exception decompiling
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

