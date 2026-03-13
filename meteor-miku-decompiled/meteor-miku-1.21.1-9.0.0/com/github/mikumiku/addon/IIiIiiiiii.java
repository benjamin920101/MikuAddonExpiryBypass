/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.meteor.KeyEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.meteorclient.utils.misc.input.KeyAction
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.Enchantments
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.registry.Registries
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiIIIIi;
import com.github.mikumiku.addon.IIIIiiiIIi;
import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiiiIiIiii;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.events.meteor.KeyEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.misc.input.KeyAction;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.Registries;

public class IIiIiiiiii
extends iiiiIiIiii {
    private final SettingGroup IIIIiIiiIi;
    private long IiIiIIIIiI;
    private final Object2IntMap<class_6880<class_1887>> iiiiiIIiiI;
    private boolean iiIIIIiIII;
    private boolean IiIIiIiiiI;
    private final Setting<Double> ALLATORIxDEMO;

    @Override
    public void onActivate() {
        IIiIiiiiii iIiIiiiiii = this;
        iIiIiiiiii.IiIIiIiiiI = 2 & 5;
        iIiIiiiiii.iiIIIIiIII = 2 & 5;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(KeyEvent keyEvent) {
        IIiIiiiiii iIiIiiiiii = iIiIiiiiii2;
        IIiIiiiiii iIiIiiiiii2 = keyEvent;
        IIiIiiiiii IiIIiIiiiI = iIiIiiiiii;
        if (((KeyEvent)iIiIiiiiii2).key == (0x2B & 0x74) && ((KeyEvent)iIiIiiiiii2).action == KeyAction.Press) {
            long l;
            if (IiIIiIiiiI.IiIiIIIIiI == 0L) {
                IiIIiIiiiI.IiIiIIIIiI = System.currentTimeMillis();
                return;
            }
            long l2 = System.currentTimeMillis();
            if ((double)(l - IiIIiIiiiI.IiIiIIIIiI) > (Double)IiIIiIiiiI.ALLATORIxDEMO.get() * 1000.0) {
                IiIIiIiiiI.IiIiIIIIiI = System.currentTimeMillis();
                return;
            }
            iIiIiiiiii2 = IiIIiIiiiI.iiIIIIiIII.player.getInventory().getStack(0x37 & 0x6E).getItem();
            if (class_7923.ITEM.getId((Object)iIiIiiiiii2).getPath().equals(IIIIiIIIIi.ALLATORIxDEMO("\u00102\u0004\"\r5"))) {
                IiIIiIiiiI.IiIiIIIIiI = l2;
                return;
            }
            if (IiIIiIiiiI.iiIIIIiIII.player.getInventory().getStack(0x6F & 0x36).isEmpty() || iiIIIIiiIi.ALLATORIxDEMO((class_1792)iIiIiiiiii2)) {
                if (IiIIiIiiiI.iiIIIIiIII.currentScreen != null) {
                    IiIIiIiiiI.iiIIIIiIII.currentScreen.close();
                }
                class_1792[] class_1792Array = new class_1792[1];
                class_1792Array[2 & 5] = class_1802.ELYTRA;
                if (InvUtils.find((class_1792[])class_1792Array).found()) {
                    class_1792[] class_1792Array2 = new class_1792[3 >> 1];
                    class_1792Array2[3 >> 2] = class_1802.ELYTRA;
                    int this_ = InvUtils.find((class_1792[])class_1792Array2).slot();
                    InvUtils.move().from(this_).toArmor(--2);
                    IiiiIiiIII.IiiiiiiIIi();
                }
            }
        }
    }

    private /* synthetic */ int ALLATORIxDEMO(class_1799 class_17992) {
        IIiIiiiiii iIiIiiiiii;
        IIiIiiiiii iIiIiiiiii2 = iIiIiiiiii3;
        IIiIiiiiii iIiIiiiiii3 = class_17992;
        IIiIiiiiii IiIIiIiiiI = iIiIiiiiii2;
        class_1792 class_17922 = iIiIiiiiii3.getItem();
        if (!iiIIIIiiIi.ALLATORIxDEMO(class_17922)) {
            return -4 >> 2;
        }
        int n = 0;
        if (class_17922 == class_1802.NETHERITE_CHESTPLATE) {
            n = 0xE & 0x7B;
            iIiIiiiiii = iIiIiiiiii3;
        } else if (class_17922 == class_1802.DIAMOND_CHESTPLATE) {
            n = 0x1D & 0x6B;
            iIiIiiiiii = iIiIiiiiii3;
        } else if (class_17922 == class_1802.GOLDEN_CHESTPLATE) {
            n = 0x6F & 0x17;
            iIiIiiiiii = iIiIiiiiii3;
        } else if (class_17922 == class_1802.IRON_CHESTPLATE) {
            n = 0x68 & 0x1F;
            iIiIiiiiii = iIiIiiiiii3;
        } else if (class_17922 == class_1802.CHAINMAIL_CHESTPLATE) {
            n = 0x3F & 0x46;
            iIiIiiiiii = iIiIiiiiii3;
        } else if (class_17922 == class_1802.LEATHER_CHESTPLATE) {
            n = --5;
            iIiIiiiiii = iIiIiiiiii3;
        } else if (class_17922 == class_1802.TURTLE_HELMET) {
            n = --5;
            iIiIiiiiii = iIiIiiiiii3;
        } else {
            n = 4;
            iIiIiiiiii = iIiIiiiiii3;
        }
        Utils.getEnchantments((class_1799)iIiIiiiiii, IiIIiIiiiI.iiiiiIIiiI);
        IIiIiiiiii iIiIiiiiii4 = IiIIiIiiiI;
        int this2 = Utils.getEnchantmentLevel(iIiIiiiiii4.iiiiiIIiiI, (class_5321)class_1893.PROTECTION);
        int n2 = Utils.getEnchantmentLevel(iIiIiiiiii4.iiiiiIIiiI, (class_5321)class_1893.BLAST_PROTECTION);
        int n3 = Utils.getEnchantmentLevel(iIiIiiiiii4.iiiiiIIiiI, (class_5321)class_1893.FIRE_PROTECTION);
        int n4 = Utils.getEnchantmentLevel(iIiIiiiiii4.iiiiiIIiiI, (class_5321)class_1893.PROJECTILE_PROTECTION);
        int n5 = Utils.getEnchantmentLevel(iIiIiiiiii4.iiiiiIIiiI, (class_5321)class_1893.UNBREAKING);
        int n6 = Utils.getEnchantmentLevel(iIiIiiiiii4.iiiiiIIiiI, (class_5321)class_1893.MENDING);
        this2 = this2 + n2 + n3 + n4 + n5 + n6 * (5 >> 1);
        return n + this2;
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        int n;
        IIiIiiiiii iIiIiiiiii = this;
        List<Integer> list = IIIiIiIiii.ALLATORIxDEMO((class_1799 IiIIiIiiiI) -> iiIIIIiiIi.ALLATORIxDEMO(IiIIiIiiiI.getItem()));
        if (list.size() == 0) {
            return -4 >> 2;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n2 = n3 = 3 ^ 3;
        while (n2 < list.size()) {
            class_1799 class_17992 = iIiIiiiiii.iiIIIIiIII.player.getInventory().getStack(list.get(n3).intValue());
            class_1792 class_17922 = class_17992.getItem();
            if ((iiIIIIiiIi.ALLATORIxDEMO(class_17922) || class_17922 == class_1802.ELYTRA) && iIiIiiiiii.ALLATORIxDEMO(class_17922)) {
                arrayList.add(list.get(n3));
            }
            n2 = ++n3;
        }
        if (arrayList.size() == 0) {
            return -4 >> 2;
        }
        int n3 = -1;
        int n4 = 2 & 5;
        int n5 = n = 3 & 4;
        while (n5 < arrayList.size()) {
            IIiIiiiiii iIiIiiiiii2 = iIiIiiiiii;
            int n6 = iIiIiiiiii2.ALLATORIxDEMO(iIiIiiiiii2.iiIIIIiIII.player.getInventory().getStack(((Integer)arrayList.get(n)).intValue()));
            if (n6 > n4) {
                n4 = n6;
                n3 = (Integer)arrayList.get(n);
            }
            n5 = ++n;
        }
        return n3;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_1792 class_17922) {
        IIiIiiiiii iIiIiiiiii = iIiIiiiiii2;
        IIiIiiiiii iIiIiiiiii2 = class_17922;
        IIiIiiiiii IiIIiIiiiI = iIiIiiiiii;
        if (iIiIiiiiii2 == class_1802.NETHERITE_CHESTPLATE || iIiIiiiiii2 == class_1802.DIAMOND_CHESTPLATE || iIiIiiiiii2 == class_1802.IRON_CHESTPLATE || iIiIiiiiii2 == class_1802.CHAINMAIL_CHESTPLATE || iIiIiiiiii2 == class_1802.GOLDEN_CHESTPLATE || iIiIiiiiii2 == class_1802.LEATHER_CHESTPLATE || iIiIiiiiii2 == class_1802.ELYTRA) {
            return true;
        }
        return false;
    }

    public IIiIiiiiii() {
        IIiIiiiiii iIiIiiiiii = this;
        super(IIIIiiiIIi.ALLATORIxDEMO("\u81b2\u529b\u97c0\u7ff6\u525f\u6351"), IIIIiIIIIi.ALLATORIxDEMO("\u575d\u572e\u9757\u658f\u81b8\u52d1\u7a2d\u768d\u7540\uff75\u577a\u7a23\u4e5f\u4f26\u755a\u97c1\u7fb7\u305b\u5f21\u4f39\u53be\u51a2\u7a08\u6830\u65d1\u4f43\u8198\u52f6\u5272\u633b\u97ea\u7f81\u4e61\u76da\u7517"));
        iIiIiiiiii.IIIIiIiiIi = iIiIiiiiii.settings.getDefaultGroup();
        IIiIiiiiii iIiIiiiiii2 = this;
        iIiIiiiiii.iiiiiIIiiI = new Object2IntOpenHashMap<class_6880<class_1887>>();
        iIiIiiiiii.ALLATORIxDEMO = iIiIiiiiii.IIIIiIiiIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIIIiiiIIi.ALLATORIxDEMO("\u525f\u6351\u5eae\u8fec"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u5243\u630d\u5ef8\u8ffa"))).defaultValue(0.3).min(0.2).range(0.2, 2.0).build());
        IIiIiiiiii iIiIiiiiii3 = this;
        this.IiIiIIIIiI = 0L;
        iIiIiiiiii3.IiIIiIiiiI = 5 >> 3;
        iIiIiiiiii3.iiIIIIiIII = 3 & 4;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIIIiiiIIi.ALLATORIxDEMO("\u000fXz\u0015\u000bvXf(W\u0019g=\u0012x\u8bc4\u66ac\u6583\u5268\u6733\u65e8\u727b\u6774\uff32"));
        }
    }

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

