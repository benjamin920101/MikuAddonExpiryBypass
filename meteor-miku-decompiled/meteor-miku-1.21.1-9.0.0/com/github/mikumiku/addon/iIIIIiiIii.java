/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render2DEvent
 *  meteordevelopment.meteorclient.renderer.text.TextRenderer
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EntityTypeListSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.ItemListSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.meteorclient.utils.misc.Names
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.server.world.ServerWorld
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.registry.Registries
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIIIiIii;
import com.github.mikumiku.addon.IiIiiIIiIi;
import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import meteordevelopment.meteorclient.events.render.Render2DEvent;
import meteordevelopment.meteorclient.renderer.text.TextRenderer;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EntityTypeListSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.ItemListSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.misc.Names;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.Registries;

public class iIIIIiiIii
extends iiiiIiIiii {
    public final Setting<Double> IIIiIiiIIi;
    public final Setting<Set<class_1299<?>>> iiiIiIiIIi;
    public final Setting<Set<class_1299<?>>> iIiIiIiIii;
    public final Setting<SettingColor> iiiiiIIIii;
    public final Setting<Set<class_1299<?>>> iIIiIIiiII;
    public final Setting<List<class_1792>> IiiIIiiiiI;
    private final SettingGroup IiIIIIiiii;
    public final Setting<Integer> IiiIIIiiIi;
    private final SettingGroup iiIIiiIiii;
    public final Setting<Integer> iIiiIiiiII;
    public final Setting<List<class_1792>> iIIiiIIIII;
    private final SettingGroup iiIiIIiIIi;
    public final Setting<SettingColor> IIIIiIiiIi;
    public final Setting<SettingColor> IiIiIIIIiI;
    public final Setting<Integer> iiiiiIIiiI;
    public final Setting<SettingColor> iiIIIIiIII;
    public final Setting<List<class_1792>> IiIIiIiiiI;
    public final Setting<SettingColor> ALLATORIxDEMO;

    public iIIIIiiIii() {
        iIIIIiiIii iIIIIiiIii2 = this;
        super(IiIiiIIiIi.ALLATORIxDEMO("\u5bbd\u4f12\u527e\u8863"), IIiIIIiIii.ALLATORIxDEMO("\u667a\u797e\u5b9d\u4f37\u5234\u880c\rD\u6746\u818e\u67f3\u8f99\u53ce\u530b\u8bad\u76e0O+w+p"));
        iIIIIiiIii2.iiIIiiIiii = iIIIIiiIii2.settings.getDefaultGroup();
        class_1299[] class_1299Array = new class_1299[--3];
        class_1299Array[2 & 5] = class_1299.EXPERIENCE_ORB;
        class_1299Array[3 >> 1] = class_1299.ENDER_PEARL;
        class_1299Array[--2] = class_1299.ZOMBIFIED_PIGLIN;
        iIIIIiiIii2.iiiIiIiIIi = iIIIIiiIii2.iiIIiiIiii.add((Setting)((EntityTypeListSetting.Builder)((EntityTypeListSetting.Builder)new EntityTypeListSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u9039\u7569\u5bf7\u4f58"))).description(IIiIIIiIii.ALLATORIxDEMO("\u6243\u674d\u4e15\u7528\u661d\u797e\u7687\u5bda\u4f50"))).defaultValue(class_1299Array).build());
        class_1299[] class_1299Array2 = new class_1299[--3];
        class_1299Array2[3 & 4] = class_1299.EXPERIENCE_ORB;
        class_1299Array2[--1] = class_1299.ENDER_PEARL;
        class_1299Array2[1 ^ 3] = class_1299.ZOMBIFIED_PIGLIN;
        this.iIiIiIiIii = this.iiIIiiIiii.add((Setting)((EntityTypeListSetting.Builder)((EntityTypeListSetting.Builder)new EntityTypeListSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u4e67\u4e35\u750d\u5bf7\u4f58"))).description(IIiIIIiIii.ALLATORIxDEMO("\u4e81\u572b\u4e7f\u4e15\u7528\u661d\u797e\u7687\u5bda\u4f50"))).defaultValue(class_1299Array2).build());
        class_1299[] class_1299Array3 = new class_1299[0x6F & 0x1F];
        class_1299Array3[3 & 4] = class_1299.EXPERIENCE_ORB;
        class_1299Array3[--1] = class_1299.COW;
        class_1299Array3[--2] = class_1299.SHEEP;
        class_1299Array3[--3] = class_1299.PIG;
        class_1299Array3[--4] = class_1299.HORSE;
        class_1299Array3[--5] = class_1299.ZOMBIE;
        class_1299Array3[0x37 & 0x4E] = class_1299.CREEPER;
        class_1299Array3[0x17 & 0x6F] = class_1299.BOGGED;
        class_1299Array3[0x3F & 0x48] = class_1299.HUSK;
        class_1299Array3[0x79 & 0xF] = class_1299.SLIME;
        class_1299Array3[0x4F & 0x3A] = class_1299.VILLAGER;
        class_1299Array3[0x3B & 0x4F] = class_1299.SPIDER;
        class_1299Array3[0x4E & 0x3D] = class_1299.CAVE_SPIDER;
        class_1299Array3[0x2F & 0x5D] = class_1299.DROWNED;
        class_1299Array3[0x7F & 0xE] = class_1299.ZOMBIE_VILLAGER;
        this.iIIiIIiiII = this.iiIIiiIiii.add((Setting)((EntityTypeListSetting.Builder)((EntityTypeListSetting.Builder)new EntityTypeListSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u4e28\u750d\u5bf7\u4f58"))).description(IIiIIIiIii.ALLATORIxDEMO("\u4ec6\u576c\u4e08\u7528\u661d\u797e\u7687\u5bda\u4f50"))).defaultValue(class_1299Array3).build());
        this.iiiiiIIIii = this.iiIIiiIiii.add((Setting)((ColorSetting.Builder)new ColorSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u5bbd\u4f12\u98f5\u8279"))).defaultValue(new SettingColor(0xA8B & 0x75FE, 0xFFE & 0x70B5, 0x61FC & 0x1EFB, 0x24FF & 0x5BFF)).build());
        this.iiIIIIiIII = this.iiIIiiIiii.add((Setting)((ColorSetting.Builder)new ColorSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u73ed\u5bb5\u98d8\u8271"))).defaultValue(new SettingColor(0x26B3 & 0x59CD, 0x3DE9 & 0x42DF, 0x31BF & 0x4ED5, 0x4AFF & 0x35FF)).build());
        iIIIIiiIii iIIIIiiIii3 = this;
        iIIIIiiIii3.iiIiIIiIIi = iIIIIiiIii3.settings.createGroup(IiIiiIIiIi.ALLATORIxDEMO("\u7200\u54ca"));
        class_1792[] class_1792Array = new class_1792[0x3F & 0x5F];
        class_1792Array[3 >> 2] = class_1802.ELYTRA;
        class_1792Array[4 ^ 5] = class_1802.WHITE_SHULKER_BOX;
        class_1792Array[1 ^ 3] = class_1802.ORANGE_SHULKER_BOX;
        class_1792Array[--3] = class_1802.MAGENTA_SHULKER_BOX;
        class_1792Array[--4] = class_1802.LIGHT_BLUE_SHULKER_BOX;
        class_1792Array[--5] = class_1802.YELLOW_SHULKER_BOX;
        class_1792Array[0x56 & 0x2F] = class_1802.LIME_SHULKER_BOX;
        class_1792Array[0x4F & 0x37] = class_1802.PINK_SHULKER_BOX;
        class_1792Array[0x48 & 0x3F] = class_1802.GRAY_SHULKER_BOX;
        class_1792Array[0x79 & 0xF] = class_1802.LIGHT_GRAY_SHULKER_BOX;
        class_1792Array[0xA & 0x7F] = class_1802.CYAN_SHULKER_BOX;
        class_1792Array[0x2B & 0x5F] = class_1802.PURPLE_SHULKER_BOX;
        class_1792Array[0x3F & 0x4C] = class_1802.BLUE_SHULKER_BOX;
        class_1792Array[0x5F & 0x2D] = class_1802.BROWN_SHULKER_BOX;
        class_1792Array[0x4F & 0x3E] = class_1802.GREEN_SHULKER_BOX;
        class_1792Array[0x3F & 0x4F] = class_1802.RED_SHULKER_BOX;
        class_1792Array[0x79 & 0x16] = class_1802.BLACK_SHULKER_BOX;
        class_1792Array[0x35 & 0x5B] = class_1802.BUNDLE;
        class_1792Array[0x1F & 0x72] = class_1802.ANCIENT_DEBRIS;
        class_1792Array[19] = class_1802.NETHERITE_SCRAP;
        class_1792Array[20] = class_1802.NETHERITE_INGOT;
        class_1792Array[21] = class_1802.NETHERITE_BLOCK;
        class_1792Array[22] = class_1802.NETHERITE_SWORD;
        class_1792Array[23] = class_1802.NETHERITE_AXE;
        class_1792Array[24] = class_1802.NETHERITE_HOE;
        class_1792Array[25] = class_1802.NETHERITE_PICKAXE;
        class_1792Array[26] = class_1802.NETHERITE_SHOVEL;
        class_1792Array[27] = class_1802.NETHERITE_HELMET;
        class_1792Array[28] = class_1802.NETHERITE_CHESTPLATE;
        class_1792Array[29] = class_1802.NETHERITE_LEGGINGS;
        class_1792Array[30] = class_1802.NETHERITE_BOOTS;
        iIIIIiiIii3.IiiIIiiiiI = iIIIIiiIii3.iiIiIIiIIi.add((Setting)((ItemListSetting.Builder)new ItemListSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u726a\u54852"))).defaultValue(class_1792Array).build());
        this.IiIiIIIIiI = this.iiIiIIiIIi.add((Setting)((ColorSetting.Builder)new ColorSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u7235\u54e2p\u98f5\u8279"))).defaultValue(new SettingColor(255, 107, 107, 255)).build());
        this.IiIIiIiiiI = this.iiIiIIiIIi.add((Setting)((ItemListSetting.Builder)new ItemListSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u726a\u54851"))).build());
        this.IIIIiIiiIi = this.iiIiIIiIIi.add((Setting)((ColorSetting.Builder)new ColorSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u7235\u54e2s\u98f5\u8279"))).defaultValue(new SettingColor(78, 205, 196, 255)).build());
        this.ALLATORIxDEMO = this.iiIiIIiIIi.add((Setting)((ColorSetting.Builder)new ColorSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u720d\u54e2\u9e9c\u8ba7\u98d8\u8271"))).defaultValue(new SettingColor(255, 193, 77, 255)).build());
        this.iIIiiIIIII = this.iiIiIIiIIi.add((Setting)((ItemListSetting.Builder)new ItemListSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u9e90\u5464\u535e"))).build());
        iIIIIiiIii iIIIIiiIii4 = this;
        iIIIIiiIii4.IiIIIIiiii = iIIIIiiIii4.settings.createGroup(IIiIIIiIii.ALLATORIxDEMO("\u7508\u9761"));
        iIIIIiiIii4.IiiIIIiiIi = iIIIIiiIii4.IiIIIIiiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u0019\u5026\u79f0"))).min(2 & 5).sliderMax(2048).defaultValue((Object)20)).build());
        this.iiiiiIIiiI = this.IiIIIIiiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("Z\u500b\u79f8"))).min(5 >> 3).sliderMax(2048).defaultValue((Object)500)).build());
        this.iIiiIiiiII = this.IiIIIIiiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u8825\u9ad3"))).min(3 >> 2).sliderMax(100).defaultValue((Object)20)).build());
        this.IIIiIiiIIi = this.IiIIIIiiii.add((Setting)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u5b13\u4f50\u5963\u5c0c"))).min(0.0).sliderMax(6.0).defaultValue(1.0).build());
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiIiiIIiIi.ALLATORIxDEMO("N\u0010[=M9>\tN8_(\u000e(\u001e\u8bab\u66cd\u65eb\u520e\u675c\u6593\u7209\u6745\uff0a"));
        }
    }

    @Override
    public void onActivate() {
        super.onActivate();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int IiiiiiiIIi(Map<class_1792, Integer> map, int n, Color color) {
        void IiIIiIiiiI;
        Iterator IiIIiIiiiI2;
        iIIIIiiIii iIIIIiiIii2 = object;
        if (IiIIiIiiiI2.isEmpty()) {
            return (int)IiIIiIiiiI;
        }
        TextRenderer textRenderer = TextRenderer.get();
        int n2 = (Integer)iIIIIiiIii2.IiiIIIiiIi.get();
        Iterator iterator = IiIIiIiiiI2 = IiIIiIiiiI2.entrySet().iterator();
        while (iterator.hasNext()) {
            void IiIIiIiiiI3;
            Object object = IiIIiIiiiI2.next();
            Object[] objectArray = new Object[--2];
            objectArray[5 >> 3] = Names.get((class_1792)((class_1792)object.getKey()));
            objectArray[3 >> 1] = object.getValue();
            object = String.format(IIiIIIiIii.ALLATORIxDEMO("Xap9\u0003<#ap"), objectArray);
            textRenderer.begin(((Double)iIIIIiiIii2.IIIiIiiIIi.get()).doubleValue());
            textRenderer.render((String)object, (double)n2, (double)IiIIiIiiiI, (Color)IiIIiIiiiI3, --1 != 0);
            textRenderer.end();
            IiIIiIiiiI += (int)((double)((Integer)iIIIIiiIii2.iIiiIiiiII.get()).intValue() * (Double)iIIIIiiIii2.IIIiIiiIIi.get());
            iterator = IiIIiIiiiI2;
        }
        return (int)IiIIiIiiiI;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render2DEvent render2DEvent) {
        iIIIIiiIii iIIIIiiIii2 = iterator;
        if (!Utils.isLoading() && iIIIIiiIii2.isActive()) {
            HashSet IiIIiIiiiI = new HashSet((Collection)iIIIIiiIii2.IiiIIiiiiI.get());
            HashSet hashSet = new HashSet((Collection)iIIIIiiIii2.IiIIiIiiiI.get());
            HashSet hashSet2 = new HashSet((Collection)iIIIIiiIii2.iIIiiIIIII.get());
            HashMap<class_1792, Integer> hashMap = new HashMap<class_1792, Integer>();
            HashMap<class_1792, Integer> hashMap2 = new HashMap<class_1792, Integer>();
            HashMap<class_1792, Integer> hashMap3 = new HashMap<class_1792, Integer>();
            HashMap hashMap4 = new HashMap();
            HashMap<String, Double> hashMap5 = new HashMap<String, Double>();
            HashMap<String, String> hashMap6 = new HashMap<String, String>();
            iIIIIiiIii iIIIIiiIii3 = iIIIIiiIii2;
            class_5321 class_53212 = iIIIIiiIii3.iiIIIIiIII.player.getWorld().getRegistryKey();
            Iterator iterator = iIIIIiiIii3.iiIIIIiIII.world.getEntities().iterator();
            block0: while (true) {
                Iterator iterator2 = iterator;
                while (iterator2.hasNext()) {
                    int n;
                    Object object;
                    class_1799 class_17992;
                    class_1297 class_12972 = (class_1297)iterator.next();
                    if (class_12972 instanceof class_1542) {
                        class_17992 = ((class_1542)class_12972).getStack();
                        Object object2 = class_17992.getItem();
                        if (hashSet2.contains(object2)) continue block0;
                        HashMap<class_1792, Integer> hashMap7 = IiIIiIiiiI.contains(object2) ? hashMap : (hashSet.contains(object2) ? hashMap2 : hashMap3);
                        class_1799 class_17993 = class_17992;
                        n = hashMap7.containsKey(object2) ? class_17993.getCount() + (Integer)object.get(object2) : class_17993.getCount();
                        object.put(object2, n);
                        continue block0;
                    }
                    if (class_12972 instanceof class_1657) {
                        class_1657 class_16572 = (class_1657)class_12972;
                        if (class_12972 != iIIIIiiIii2.iiIIIIiIII.player) {
                            iIIIIiiIii iIIIIiiIii4 = iIIIIiiIii2;
                            double d = iIIIIiiIii4.iiIIIIiIII.player.distanceTo((class_1297)class_16572);
                            object = class_16572.getGameProfile().getName();
                            String string = iIIIIiiIii4.ALLATORIxDEMO(class_16572);
                            hashMap5.put((String)object, d);
                            hashMap6.put((String)object, string);
                            continue block0;
                        }
                    }
                    class_17992 = class_12972.getType();
                    object = (Set)iIIIIiiIii2.iiiIiIiIIi.get();
                    if (object.contains(class_17992)) {
                        n = hashMap4.getOrDefault(class_17992, 2 & 5);
                        iterator2 = iterator;
                        hashMap4.put((class_1299<?>)class_17992, n + (4 ^ 5));
                        continue;
                    }
                    if (!(class_53212 == class_3218.NETHER ? (Set)iIIIIiiIii2.iIIiIIiiII.get() : (class_53212 == class_3218.OVERWORLD ? (Set)iIIIIiiIii2.iIiIiIiIii.get() : Collections.emptySet())).contains(class_17992)) continue block0;
                    n = hashMap4.getOrDefault(class_17992, 3 & 4);
                    hashMap4.put((class_1299<?>)class_17992, n + --1);
                    continue block0;
                }
                break;
            }
            int this2 = (Integer)iIIIIiiIii2.iiiiiIIiiI.get();
            this2 = iIIIIiiIii2.ALLATORIxDEMO(hashMap5, hashMap6, this2, (Color)iIIIIiiIii2.iiIIIIiIII.get());
            iIIIIiiIii iIIIIiiIii5 = iIIIIiiIii2;
            this2 = iIIIIiiIii5.IiiiiiiIIi(hashMap, this2, (Color)iIIIIiiIii5.IiIiIIIIiI.get());
            iIIIIiiIii iIIIIiiIii6 = iIIIIiiIii2;
            this2 = iIIIIiiIii6.IiiiiiiIIi(hashMap2, this2, (Color)iIIIIiiIii6.IIIIiIiiIi.get());
            iIIIIiiIii iIIIIiiIii7 = iIIIIiiIii2;
            this2 = iIIIIiiIii7.IiiiiiiIIi(hashMap3, this2, (Color)iIIIIiiIii7.ALLATORIxDEMO.get());
            iIIIIiiIii iIIIIiiIii8 = iIIIIiiIii2;
            this2 = iIIIIiiIii8.ALLATORIxDEMO(hashMap4, this2, (Color)iIIIIiiIii8.iiiiiIIIii.get());
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int ALLATORIxDEMO(Map<String, Double> map, Map<String, String> map2, int n, Color color) {
        void IiIIiIiiiI;
        Iterator IiIIiIiiiI2;
        iIIIIiiIii iIIIIiiIii2 = object;
        TextRenderer textRenderer = TextRenderer.get();
        int n2 = (Integer)iIIIIiiIii2.IiiIIIiiIi.get();
        Iterator iterator = IiIIiIiiiI2 = IiIIiIiiiI2.entrySet().iterator();
        while (iterator.hasNext()) {
            void IiIIiIiiiI3;
            void IiIIiIiiiI4;
            Object object = IiIIiIiiiI2.next();
            String string = (String)object.getKey();
            String string2 = (String)IiIIiIiiiI4.get(string);
            Object[] objectArray = new Object[--3];
            objectArray[3 & 4] = string;
            objectArray[3 >> 1] = string2;
            objectArray[--2] = object.getValue();
            object = String.format(IIiIIIiIii.ALLATORIxDEMO("APDxap\u0019XA\rue)^"), objectArray);
            textRenderer.begin(((Double)iIIIIiiIii2.IIIiIiiIIi.get()).doubleValue());
            textRenderer.render((String)object, (double)n2, (double)IiIIiIiiiI, (Color)IiIIiIiiiI3, 3 >> 1);
            textRenderer.end();
            IiIIiIiiiI += (int)((double)((Integer)iIIIIiiIii2.iIiiIiiiII.get()).intValue() * (Double)iIIIIiiIii2.IIIiIiiIIi.get());
            iterator = IiIIiIiiiI2;
        }
        return (int)IiIIiIiiiI;
    }

    private /* synthetic */ String ALLATORIxDEMO(class_1657 class_16572) {
        int n;
        Object IiIIiIiiiI;
        HashMap hashMap;
        iIIIIiiIii iIIIIiiIii2 = hashMap;
        void v0 = IiIIiIiiiI;
        IiIIiIiiiI = v0.getEquippedStack(class_1304.HEAD);
        class_1799 class_17992 = v0.getEquippedStack(class_1304.CHEST);
        class_1799 class_17993 = v0.getEquippedStack(class_1304.LEGS);
        class_1799 object2 = v0.getEquippedStack(class_1304.FEET);
        if (IiIIiIiiiI.isEmpty() && class_17992.isEmpty() && class_17993.isEmpty() && object2.isEmpty()) {
            return IiIiiIIiIi.ALLATORIxDEMO("\u88e0\u5470");
        }
        HashMap this_ = new HashMap();
        class_1799[] class_1799Array = new class_1799[--4];
        class_1799Array[3 & 4] = IiIIiIiiiI;
        class_1799Array[--1] = class_17992;
        class_1799Array[--2] = class_17993;
        class_1799Array[--3] = object2;
        IiIIiIiiiI = class_1799Array;
        int n2 = class_1799Array.length;
        int n3 = n = 2 & 5;
        while (n3 < n2) {
            class_1799 class_17994 = IiIIiIiiiI[n];
            if (iiIIIIiiIi.ALLATORIxDEMO(class_17994.getItem())) {
                HashMap hashMap2;
                String string;
                String string2 = class_7923.ITEM.getId((Object)class_17994.getItem()).toString();
                if (string2.contains(IIiIIIiIii.ALLATORIxDEMO("m!w\fF6j0f"))) {
                    string = IiIiiIIiIi.ALLATORIxDEMO("\u5410\u91ab");
                    hashMap2 = this_;
                } else if (string2.contains(IIiIIIiIii.ALLATORIxDEMO("g\rB)l*g"))) {
                    string = IiIiiIIiIi.ALLATORIxDEMO("\u94a3\u7789");
                    hashMap2 = this_;
                } else if (string2.contains(IIiIIIiIii.ALLATORIxDEMO("-q+m"))) {
                    string = IiIiiIIiIi.ALLATORIxDEMO("\u94bb");
                    hashMap2 = this_;
                } else if (string2.contains(IIiIIIiIii.ALLATORIxDEMO("#l(g"))) {
                    string = IiIiiIIiIi.ALLATORIxDEMO("\u91ab");
                    hashMap2 = this_;
                } else if (string2.contains(IIiIIIiIii.ALLATORIxDEMO("@,b-m"))) {
                    string = IiIiiIIiIi.ALLATORIxDEMO("\u9519\u9484");
                    hashMap2 = this_;
                } else if (string2.contains(IIiIIIiIii.ALLATORIxDEMO("o\u0001B0k!q"))) {
                    string = IiIiiIIiIi.ALLATORIxDEMO("\u76b6\u9713");
                    hashMap2 = this_;
                } else if (string2.contains(IIiIIIiIii.ALLATORIxDEMO("\u0010V6w(f"))) {
                    string = IiIiiIIiIi.ALLATORIxDEMO("\u6d6f\u9fe5");
                    hashMap2 = this_;
                } else if (string2.contains(IIiIIIiIii.ALLATORIxDEMO("b6n\u0005G-o(l"))) {
                    string = IiIiiIIiIi.ALLATORIxDEMO("\u72a8\u7289");
                    hashMap2 = this_;
                } else {
                    string = string2;
                    hashMap2 = this_;
                }
                hashMap2.merge(string, 2 ^ 3, Integer::sum);
            }
            n3 = ++n;
        }
        if (this_.isEmpty()) {
            return IIiIIIiIii.ALLATORIxDEMO("\u88bc\u5409");
        }
        IiIIiIiiiI = null;
        n2 = 5 >> 3;
        for (Map.Entry entry : this_.entrySet()) {
            if ((Integer)entry.getValue() <= n2) continue;
            IiIIiIiiiI = (String)entry.getKey();
            n2 = (Integer)entry.getValue();
        }
        if (this_.size() == (3 & 5)) {
            return (String)IiIIiIiiiI + "\u5957";
        }
        return (String)IiIIiIiiiI + "\u5957(\u6df7)";
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int ALLATORIxDEMO(Map<class_1299<?>, Integer> map, int n, Color color) {
        void IiIIiIiiiI;
        Iterator IiIIiIiiiI2;
        iIIIIiiIii iIIIIiiIii2 = object;
        TextRenderer textRenderer = TextRenderer.get();
        int n2 = (Integer)iIIIIiiIii2.IiiIIIiiIi.get();
        Iterator iterator = IiIIiIiiiI2 = IiIIiIiiiI2.entrySet().iterator();
        while (iterator.hasNext()) {
            void IiIIiIiiiI3;
            Object object = IiIIiIiiiI2.next();
            Object[] objectArray = new Object[--2];
            objectArray[5 >> 3] = Names.get((class_1299)((class_1299)object.getKey()));
            objectArray[5 >> 2] = object.getValue();
            object = String.format(IiIiiIIiIi.ALLATORIxDEMO("\u00166\u0002OPbX=\t"), objectArray);
            textRenderer.begin(((Double)iIIIIiiIii2.IIIiIiiIIi.get()).doubleValue());
            textRenderer.render((String)object, (double)n2, (double)IiIIiIiiiI, (Color)IiIIiIiiiI3, 3 >> 1);
            textRenderer.end();
            IiIIiIiiiI += (int)((double)((Integer)iIIIIiiIii2.iIiiIiiiII.get()).intValue() * (Double)iIIIIiiIii2.IIIiIiiIIi.get());
            iterator = IiIIiIiiiI2;
        }
        return (int)IiIIiIiiiI;
    }
}

