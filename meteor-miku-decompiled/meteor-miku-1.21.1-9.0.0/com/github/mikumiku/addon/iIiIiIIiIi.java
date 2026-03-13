/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.ItemListSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.meteorclient.utils.player.SlotUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiIIIIII;
import com.github.mikumiku.addon.iiIIIIiIii;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.ItemListSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.meteorclient.utils.player.SlotUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiIiIIiIi
extends iiiiIiIiii {
    private final Setting<List<class_1792>> IIIiIiiIIi;
    private final Setting<Boolean> iiiIiIiIIi;
    private Set<class_1792> iIiIiIiIii;
    private final Setting<String> iiiiiIIIii;
    private final Setting<Boolean> iIIiIIiiII;
    private final Setting<String> IiiIIiiiiI;
    private final Setting<Boolean> IiIIIIiiii;
    private final SettingGroup IiiIIIiiIi;
    private final SettingGroup iiIIiiIiii;
    private final Setting<String> iIiiIiiiII;
    private final Setting<List<class_1792>> iIIiiIIIII;
    private int iiIiIIiIIi;
    private final Setting<Integer> IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private final SettingGroup iiiiiIIiiI;
    private final Setting<List<class_1792>> iiIIIIiIII;
    private final SettingGroup IiIIiIiiiI;
    private final Setting<Boolean> ALLATORIxDEMO;

    private /* synthetic */ String ALLATORIxDEMO(class_1792 class_17922) {
        iIiIiIIiIi iIiIiIIiIi2 = iIiIiIIiIi3;
        iIiIiIIiIi iIiIiIIiIi3 = class_17922;
        iIiIiIIiIi IiIIiIiiiI = iIiIiIIiIi2;
        if (((Boolean)IiIIiIiiiI.ALLATORIxDEMO.get()).booleanValue() && ((List)IiIIiIiiiI.iIIiiIIIII.get()).contains(iIiIiIIiIi3)) {
            return (String)IiIIiIiiiI.IiiIIiiiiI.get();
        }
        if (((Boolean)IiIIiIiiiI.IiIiIIIIiI.get()).booleanValue() && ((List)IiIIiIiiiI.IIIiIiiIIi.get()).contains(iIiIiIIiIi3)) {
            return (String)IiIIiIiiiI.iiiiiIIIii.get();
        }
        if (((Boolean)IiIIiIiiiI.iIIiIIiiII.get()).booleanValue() && ((List)IiIIiIiiiI.iiIIIIiIII.get()).contains(iIiIiIIiIi3)) {
            return (String)IiIIiIiiiI.iIiiIiiiII.get();
        }
        return IIiiIIIIII.ALLATORIxDEMO("\u6730\u7792\u7efe");
    }

    public iIiIiIIiIi() {
        iIiIiIIiIi iIiIiIIiIi2 = this;
        super(iiIIIIiIii.ALLATORIxDEMO("\u8180\u52e8\u621e\u57e3\u5754"), IIiiIIIIII.ALLATORIxDEMO("\u819d\u5292\u4e75\u5f19\u809b\u531f\u4e5a\u76be\u57d4\u5724\u721e\u54fb"));
        iIiIiIIiIi2.IiiIIIiiIi = iIiIiIIiIi2.settings.getDefaultGroup();
        iIiIiIIiIi2.IiIIiIiiiI = iIiIiIIiIi2.settings.createGroup(iiIIIIiIii.ALLATORIxDEMO("\u57e9\u577e\u7e8e@["));
        iIiIiIIiIi2.iiIIiiIiii = iIiIiIIiIi2.settings.createGroup(IIiiIIIIII.ALLATORIxDEMO("\u57b9\u5769\u7edeW\b"));
        iIiIiIIiIi2.iiiiiIIiiI = iIiIiIIiIi2.settings.createGroup(iiIIIIiIii.ALLATORIxDEMO("\u57e9\u577e\u7e8e@Y"));
        iIiIiIIiIi2.IIIIiIiiIi = iIiIiIIiIi2.IiiIIIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u4e75\u5f19\u5e81\u8fe5"))).description(iiIIIIiIii.ALLATORIxDEMO("\u6baf\u6b4b\u4e62\u5f49\u7209\u54ab\u4e0b\u95be\u76c4\u5ebc\u8fbf\uff62\u6e78\u6245\u525b\uff63"))).defaultValue((Object)(--5))).min(3 & 5).max(0x7E & 0x3D).sliderMin(3 & 5).sliderMax(0x35 & 0x5E).build());
        this.iiiIiIiIIi = this.IiiIIIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u513f\u90f2\u4e55\u5f39"))).description(iiIIIIiIii.ALLATORIxDEMO("\u664f\u544c\u4e62\u5f49\u6514\u7eae\u7229\u548b\uff4c\u546c\u5279\u5380\u4e62\u5f49\u4e60\u4e40"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.IiIIIIiiii = this.IiiIIIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u63a8\u9633\u5ff1\u6300\u6835"))).description(iiIIIIiIii.ALLATORIxDEMO("\u4e4d\u4e68\u5f43\u5fa1\u6317\u6865\u4e6d\u76ce\u7209\u54ab"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.ALLATORIxDEMO = this.IiIIiIiiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u5435\u755f\u57b9\u5769\u7edeW\u000b"))).description(iiIIIIiIii.ALLATORIxDEMO("\u546f\u7562\u7b4c\u4e6a\u4e6a\u57c9\u575e\u7eae"))).defaultValue((Object)(--1 != 0))).build());
        this.IiiIIiiiiI = this.IiIIiIiiiI.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u7eb3\u5437"))).description(iiIIIIiIii.ALLATORIxDEMO("\u57c9\u577e\u7e8e@[`\u76ce\u546d\u799a"))).defaultValue((Object)IIiiIIIIII.ALLATORIxDEMO("\u9888\u7273\u57f4\u5704"))).build());
        class_1792[] class_1792Array = new class_1792[--4];
        class_1792Array[2 & 5] = class_1802.ROTTEN_FLESH;
        class_1792Array[3 & 5] = class_1802.SPIDER_EYE;
        class_1792Array[5 >> 1] = class_1802.POISONOUS_POTATO;
        class_1792Array[--3] = class_1802.PUFFERFISH;
        this.iIIiiIIIII = this.IiIIiIiiiI.add((Setting)((ItemListSetting.Builder)((ItemListSetting.Builder)((ItemListSetting.Builder)new ItemListSetting.Builder().name(iiIIIIiIii.ALLATORIxDEMO("\u7229\u548b\u5277\u8802"))).description(IIiiIIIIII.ALLATORIxDEMO("\u57d4\u5724\u7e93:F\u001a\u4e7a\u769e\u721e\u54fb"))).defaultValue(Arrays.asList(class_1792Array))).build());
        this.IiIiIIIIiI = this.iiIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiIii.ALLATORIxDEMO("\u5465\u7548\u57e9\u577e\u7e8e@X"))).description(IIiiIIIIII.ALLATORIxDEMO("\u5478\u7532\u7b5b\u4eb6\u4e7d\u5799\u5749\u7efe"))).defaultValue((Object)(5 >> 2))).build());
        this.iiiiiIIIii = this.iiIIiiIiii.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iiIIIIiIii.ALLATORIxDEMO("\u7ea4\u5467"))).description(IIiiIIIIII.ALLATORIxDEMO("\u5799\u5769\u7edeW\bw\u769e\u547a\u79ca"))).defaultValue((Object)iiIIIIiIii.ALLATORIxDEMO("\u65f9\u571d\u57e3\u5754"))).build());
        class_1792[] class_1792Array2 = new class_1792[0x3F & 0x47];
        class_1792Array2[3 >> 2] = class_1802.NETHERRACK;
        class_1792Array2[--1] = class_1802.BLACKSTONE;
        class_1792Array2[5 >> 1] = class_1802.DIRT;
        class_1792Array2[--3] = class_1802.GRAVEL;
        class_1792Array2[--4] = class_1802.GRANITE;
        class_1792Array2[--5] = class_1802.DIORITE;
        class_1792Array2[0x57 & 0x2E] = class_1802.ANDESITE;
        this.IIIiIiiIIi = this.iiIIiiIiii.add((Setting)((ItemListSetting.Builder)((ItemListSetting.Builder)((ItemListSetting.Builder)new ItemListSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u723e\u54db\u5260\u8852"))).description(iiIIIIiIii.ALLATORIxDEMO("\u57c3\u5774\u7e84jRJ\u4e6d\u76ce\u7209\u54ab"))).defaultValue(Arrays.asList(class_1792Array2))).build());
        this.iIIiIIiiII = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u5435\u755f\u57b9\u5769\u7edeW\t"))).description(iiIIIIiIii.ALLATORIxDEMO("\u546f\u7562\u7b4c\u4e63\u4e6a\u57c9\u575e\u7eae"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iIiiIiiiII = this.iiiiiIIiiI.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u7eb3\u5437"))).description(iiIIIIiIii.ALLATORIxDEMO("\u57c9\u577e\u7e8e@Y`\u76ce\u546d\u799a"))).defaultValue((Object)IIiiIIIIII.ALLATORIxDEMO("\u81d0\u5bcd\u4e53\u57f4\u5704"))).build());
        this.iiIIIIiIII = this.iiiiiIIiiI.add((Setting)((ItemListSetting.Builder)((ItemListSetting.Builder)((ItemListSetting.Builder)new ItemListSetting.Builder().name(iiIIIIiIii.ALLATORIxDEMO("\u7229\u548b\u5277\u8802"))).description(IIiiIIIIII.ALLATORIxDEMO("\u57d4\u5724\u7e93:D\u001a\u4e7a\u769e\u721e\u54fb"))).defaultValue(new ArrayList())).build());
        this.iiIiIIiIIi = 3 >> 2;
        iIiIiIIiIi iIiIiIIiIi3 = this;
        iIiIiIIiIi3.iIiIiIiIii = new HashSet<class_1792>();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIIIIiIii.ALLATORIxDEMO("7\u0001BL\u0013\u000f`?\u0010\u000e!>\u0005K`\u8bbd\u66b4\u65fa\u5250\u676a\u65f0\u7202\u674c\uff6b"));
        }
    }

    public String ALLATORIxDEMO() {
        Object object;
        class_1792 class_17922;
        iIiIiIIiIi iIiIiIIiIi2 = this;
        if (iIiIiIIiIi2.iiIIIIiIII.player == null) {
            return iiIIIIiIii.ALLATORIxDEMO("\u65aa\u6510\u6304");
        }
        HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>();
        int n = stringBuilder = 3 & 4;
        while (n < iIiIiIIiIi2.iiIIIIiIII.player.getInventory().size()) {
            if (!iIiIiIIiIi2.iiIIIIiIII.player.getInventory().getStack(stringBuilder).isEmpty()) {
                iIiIiIIiIi iIiIiIIiIi3 = iIiIiIIiIi2;
                class_17922 = iIiIiIIiIi3.iiIIIIiIII.player.getInventory().getStack(stringBuilder).getItem();
                if (iIiIiIIiIi3.iIiIiIiIii.contains(class_17922)) {
                    iIiIiIIiIi iIiIiIIiIi4 = iIiIiIIiIi2;
                    object = iIiIiIIiIi4.ALLATORIxDEMO(class_17922);
                    int n2 = iIiIiIIiIi4.iiIIIIiIII.player.getInventory().getStack(stringBuilder).getCount();
                    HashMap<Object, Integer> hashMap2 = hashMap;
                    hashMap2.put(object, hashMap2.getOrDefault(object, 3 ^ 3) + n2);
                }
            }
            n = ++stringBuilder;
        }
        if (hashMap.isEmpty()) {
            return IIiiIIIIII.ALLATORIxDEMO("\u5ec4\u5b42\u4e5a\u65da\u57d4\u5724\u721e\u54fb");
        }
        StringBuilder stringBuilder = new StringBuilder(iiIIIIiIii.ALLATORIxDEMO("\u57e3\u5754\u7e9f\u8bebZJ"));
        class_1792 class_17923 = class_17922 = hashMap.entrySet().iterator();
        while (class_17923.hasNext()) {
            object = (Map.Entry)class_17922.next();
            stringBuilder.append((String)object.getKey()).append(IIiiIIIIII.ALLATORIxDEMO("\u0012")).append(object.getValue()).append(iiIIIIiIii.ALLATORIxDEMO("IJ"));
            class_17923 = class_17922;
        }
        return stringBuilder.toString().trim();
    }

    private /* synthetic */ void IiiiiiiIIi() {
        iIiIiIIiIi iIiIiIIiIi2 = this;
        iIiIiIIiIi2.iIiIiIiIii.clear();
        if (((Boolean)iIiIiIIiIi2.ALLATORIxDEMO.get()).booleanValue()) {
            iIiIiIIiIi iIiIiIIiIi3 = this;
            iIiIiIIiIi3.iIiIiIiIii.addAll((Collection)iIiIiIIiIi3.iIIiiIIIII.get());
        }
        if (((Boolean)this.IiIiIIIIiI.get()).booleanValue()) {
            iIiIiIIiIi iIiIiIIiIi4 = this;
            iIiIiIIiIi4.iIiIiIiIii.addAll((Collection)iIiIiIIiIi4.IIIiIiiIIi.get());
        }
        if (((Boolean)this.iIIiIIiiII.get()).booleanValue()) {
            iIiIiIIiIi iIiIiIIiIi5 = this;
            iIiIiIIiIi5.iIiIiIiIii.addAll((Collection)iIiIiIIiIi5.iiIIIIiIII.get());
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(int n) {
        int n2 = n;
        iIiIiIIiIi IiIIiIiiiI = this;
        if (IiIIiIiiiI.iiIIIIiIII.interactionManager == null) {
            return;
        }
        n2 = SlotUtils.indexToId((int)n2);
        iIiIiIIiIi iIiIiIIiIi2 = IiIIiIiiiI;
        if (((Boolean)IiIIiIiiiI.iiiIiIiIIi.get()).booleanValue()) {
            iIiIiIIiIi2.iiIIIIiIII.interactionManager.clickSlot(IiIIiIiiiI.iiIIIIiIII.player.currentScreenHandler.syncId, n2, 2 ^ 3, class_1713.THROW, (class_1657)IiIIiIiiiI.iiIIIIiIII.player);
            return;
        }
        iIiIiIIiIi2.iiIIIIiIII.interactionManager.clickSlot(IiIIiIiiiI.iiIIIIiIII.player.currentScreenHandler.syncId, n2, 3 >> 2, class_1713.THROW, (class_1657)IiIIiIiiiI.iiIIIIiIII.player);
    }

    @Override
    public void onActivate() {
        iIiIiIIiIi iIiIiIIiIi2 = this;
        super.onActivate();
        iIiIiIIiIi2.IiiiiiiIIi();
        this.iiIiIIiIIi = 3 & 4;
        Object[] objectArray = new Object[--1];
        objectArray[3 & 4] = this.iIiIiIiIii.size();
        this.info(IIiiIIIIII.ALLATORIxDEMO("\u81d0\u52ff\u624e\u57f4\u5704\u5da5\u5435\u755f\uff36\u5126:r~W\u79f7\u57d4\u5724\u721e\u54fb"), objectArray);
    }

    public void onDeactivate() {
        iIiIiIIiIi iIiIiIIiIi2 = this;
        iIiIiIIiIi2.iIiIiIiIii.clear();
        iIiIiIIiIi2.info(iiIIIIiIii.ALLATORIxDEMO("\u81aa\u52e2\u6234\u57e9\u577e\u5db8\u79e1\u7542"), new Object[3 ^ 3]);
    }

    public void ALLATORIxDEMO() {
        iIiIiIIiIi iIiIiIIiIi2 = this;
        if (iIiIiIIiIi2.iiIIIIiIII.player == null) {
            return;
        }
        iIiIiIIiIi2.IiiiiiiIIi();
        int n = 3 & 4;
        int n2 = this = ((Boolean)iIiIiIIiIi2.IiIIIIiiii.get()).booleanValue() ? 0x3D & 0x4B : 0;
        while (n2 < iIiIiIIiIi2.iiIIIIiIII.player.getInventory().size()) {
            if (!iIiIiIIiIi2.iiIIIIiIII.player.getInventory().getStack(this).isEmpty()) {
                iIiIiIIiIi iIiIiIIiIi3 = iIiIiIIiIi2;
                class_1792 class_17922 = iIiIiIIiIi3.iiIIIIiIII.player.getInventory().getStack(this).getItem();
                if (iIiIiIIiIi3.iIiIiIiIii.contains(class_17922)) {
                    iIiIiIIiIi iIiIiIIiIi4 = iIiIiIIiIi2;
                    int n3 = iIiIiIIiIi4.iiIIIIiIII.player.getInventory().getStack(this).getCount();
                    iIiIiIIiIi4.ALLATORIxDEMO(this);
                    n += n3;
                }
            }
            n2 = ++this;
        }
        iIiIiIIiIi iIiIiIIiIi5 = iIiIiIIiIi2;
        if (n > 0) {
            Object[] objectArray = new Object[3 & 5];
            objectArray[3 ^ 3] = n;
            iIiIiIIiIi5.info(IIiiIIIIII.ALLATORIxDEMO("\u6271\u52ff\u6e1f\u7471\u5bb6\u6247\uff16\u5106\u4e18\u5f54:r~W\u4e10\u57d4\u5724\u721e\u54fb"), objectArray);
            return;
        }
        iIiIiIIiIi5.info(iiIIIIiIii.ALLATORIxDEMO("\u5ed3\u5b12\u4e4d\u6ccb\u6749\u974a\u89c1\u6e4f\u7466\u76ee\u57c3\u5774\u7209\u54ab"), new Object[3 & 4]);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        int n;
        iIiIiIIiIi iIiIiIIiIi2;
        block6: {
            iIiIiIIiIi2 = this;
            if (iIiIiIIiIi2.iiIIIIiIII.player == null || iIiIiIIiIi2.iiIIIIiIII.world == null) {
                return;
            }
            iIiIiIIiIi iIiIiIIiIi3 = iIiIiIIiIi2;
            iIiIiIIiIi3.IiiiiiiIIi();
            if (iIiIiIIiIi3.iiIiIIiIIi > 0) {
                iIiIiIIiIi2.iiIiIIiIIi -= 2 ^ 3;
                return;
            }
            int IiIIiIiiiI = 0;
            int n2 = this = (this = ((Boolean)iIiIiIIiIi2.IiIIIIiiii.get()).booleanValue() ? 0x79 & 0xF : 0);
            while (n2 < iIiIiIIiIi2.iiIIIIiIII.player.getInventory().size()) {
                if (!iIiIiIIiIi2.iiIIIIiIII.player.getInventory().getStack(this).isEmpty()) {
                    iIiIiIIiIi iIiIiIIiIi4 = iIiIiIIiIi2;
                    class_1792 class_17922 = iIiIiIIiIi4.iiIIIIiIII.player.getInventory().getStack(this).getItem();
                    if (iIiIiIIiIi4.iIiIiIiIii.contains(class_17922)) {
                        iIiIiIIiIi iIiIiIIiIi5 = iIiIiIIiIi2;
                        iIiIiIIiIi5.ALLATORIxDEMO(this);
                        IiIIiIiiiI = --1;
                        class_17922.getName().toString();
                        iIiIiIIiIi5.ALLATORIxDEMO(class_17922);
                        n = IiIIiIiiiI;
                        break block6;
                    }
                }
                n2 = ++this;
            }
            n = IiIIiIiiiI;
        }
        if (n != 0) {
            iIiIiIIiIi2.iiIiIIiIIi = (Integer)iIiIiIIiIi2.IIIIiIiiIi.get();
        }
    }
}

