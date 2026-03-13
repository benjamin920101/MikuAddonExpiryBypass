/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.ItemListSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Module
 *  meteordevelopment.meteorclient.systems.modules.Modules
 *  meteordevelopment.meteorclient.systems.modules.combat.AnchorAura
 *  meteordevelopment.meteorclient.systems.modules.combat.BedAura
 *  meteordevelopment.meteorclient.systems.modules.combat.CrystalAura
 *  meteordevelopment.meteorclient.systems.modules.combat.KillAura
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import com.github.mikumiku.addon.IIIiiIIIIi;
import com.github.mikumiku.addon.IIiIIIiIii;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.mixinface.MoveEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.ItemListSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.combat.AnchorAura;
import meteordevelopment.meteorclient.systems.modules.combat.BedAura;
import meteordevelopment.meteorclient.systems.modules.combat.CrystalAura;
import meteordevelopment.meteorclient.systems.modules.combat.KillAura;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class iIiiIiiIiI
extends iiiiIiIiii {
    private final Setting<Boolean> iIiiIiiiii;
    private int iIiIiiIiiI;
    private int IIiiiiiiII;
    private boolean IIiiiIIIIi;
    private static final Class<? extends Module>[] IIIiIIIiII;
    private final SettingGroup iiIiIiiiiI;
    private final Setting<Integer> IIiiIiiiII;
    private final Setting<List<class_1792>> IIIiIiiIIi;
    private final Setting<List<class_1792>> iiiIiIiIIi;
    private final Setting<Boolean> iIiIiIiIii;
    private final SettingGroup iiiiiIIIii;
    private final SettingGroup iIIiIIiiII;
    private final Setting<Boolean> IiiIIiiiiI;
    private final SettingGroup IiIIIIiiii;
    private final Setting<Integer> IiiIIIiiIi;
    private final List<Class<? extends Module>> iiIIiiIiii;
    private final Setting<Boolean> iIiiIiiiII;
    private final Setting<Integer> iIIiiIIIII;
    private final Setting<Integer> iiIiIIiIIi;
    private boolean IIIIiIiiIi;
    private int IiIiIIIIiI;
    private final Setting<Boolean> iiiiiIIiiI;
    private final Setting<Integer> iiIIIIiIII;
    private final SettingGroup IiIIiIiiiI;
    private final Setting<List<class_1792>> ALLATORIxDEMO;

    private /* synthetic */ boolean iiIiiiiiII() {
        if (this.iiIIIIiIII.player.getHungerManager().getFoodLevel() < (Integer)this.iIIiiIIIII.get()) {
            return --1 != 0;
        }
        return false;
    }

    private /* synthetic */ void iiIiiiiiII() {
        int n;
        iIiiIiiIiI iIiiIiiIiI2 = this;
        int n2 = n = 5 >> 3;
        while (true) {
            if (n2 >= 9) break;
            class_1799 class_17992 = iIiiIiiIiI2.iiIIIIiIII.player.getInventory().getStack(n);
            if (!class_17992.isEmpty() && class_17992.getCount() < (Integer)iIiiIiiIiI2.IiiIIIiiIi.get()) {
                int n3 = this = 9;
                while (n3 < iIiiIiiIiI2.iiIIIIiIII.player.getInventory().size()) {
                    class_1799 class_17993 = iIiiIiiIiI2.iiIIIIiIII.player.getInventory().getStack(this);
                    if (!class_17993.isEmpty() && class_1799.areItemsEqual((class_1799)class_17992, (class_1799)class_17993)) {
                        InvUtils.move().from(this).to(n);
                        Object[] objectArray = new Object[5 >> 2];
                        objectArray[3 >> 2] = class_17992.getItem().getName().getString();
                        iIiiIiiIiI2.info(MoveEvent.ALLATORIxDEMO("\u8822\u5105\u5fac\u6317\u6868zgE\u0014"), objectArray);
                        return;
                    }
                    n3 = ++this;
                }
            }
            n2 = ++n;
        }
    }

    private /* synthetic */ boolean IiiIIIIiiI() {
        if (this.iiIIIIiIII.player.getHealth() < (float)((Integer)this.IIiiIiiiII.get()).intValue()) {
            return 5 >> 2;
        }
        return false;
    }

    private /* synthetic */ class_1792 ALLATORIxDEMO(List<class_1792> list) {
        iIiiIiiIiI iIiiIiiIiI2 = iterator;
        Iterator iterator = list;
        iIiiIiiIiI IiIIiIiiiI = iIiiIiiIiI2;
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            class_1792 class_17922 = (class_1792)iterator.next();
            class_1792[] class_1792Array = new class_1792[3 & 5];
            class_1792Array[3 ^ 3] = class_17922;
            if (!InvUtils.findInHotbar((class_1792[])class_1792Array).found()) continue;
            return class_17922;
        }
        return null;
    }

    private /* synthetic */ void IiiIIIIiiI() {
        Class<? extends Module>[] classArray = classArray2;
        if (((Boolean)classArray.iIiIiIiIii.get()).booleanValue()) {
            int n;
            Class<? extends Module>[] classArray2 = IIIiIIIiII;
            int n2 = IIIiIIIiII.length;
            int n3 = n = 3 ^ 3;
            while (n3 < n2) {
                Class<? extends Module> clazz = classArray2[n];
                Module module = Modules.get().get(clazz);
                if (classArray.iiIIiiIiii.contains(clazz) && !module.isActive()) {
                    module.toggle();
                }
                n3 = ++n;
            }
        }
        try {
            if (((Boolean)classArray.iIiIiIiIii.get()).booleanValue() && classArray.IIIIiIiiIi) {
                BaritoneAPI.getProvider().getPrimaryBaritone().getCommandManager().execute(MoveEvent.ALLATORIxDEMO("\u0012\u000232\r\u0002"));
                return;
            }
        } catch (Exception this_) {
            classArray.info("error:" + String.valueOf(this_), new Object[3 >> 2]);
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIiiIiiIiI iIiiIiiIiI2 = iIiiIiiIiI3;
        iIiiIiiIiI iIiiIiiIiI3 = pre;
        iIiiIiiIiI IiIIiIiiiI = iIiiIiiIiI2;
        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) {
            return;
        }
        if (IiIIiIiiiI.IIiiiiiiII > 0) {
            IiIIiIiiiI.IIiiiiiiII -= 3 >> 1;
        }
        iIiiIiiIiI iIiiIiiIiI4 = IiIIiIiiiI;
        iIiiIiiIiI4.iIiIiiIiiI += 5 >> 2;
        if (iIiiIiiIiI4.IIiiiIIIIi) {
            iIiiIiiIiI iIiiIiiIiI5 = IiIIiIiiiI;
            iIiiIiiIiI5.iiIIIIiIII.options.useKey.setPressed(--1 != 0);
            if (!iIiiIiiIiI5.iiIIIIiIII.player.isUsingItem()) {
                Utils.rightClick();
            }
            if (!IiIIiIiiiI.IiiiiiiIIi()) {
                IiIIiIiiiI.ALLATORIxDEMO();
            }
            return;
        }
        if (IiIIiIiiiI.IIiiiiiiII > 0) {
            return;
        }
        if (((Boolean)IiIIiIiiiI.iIiiIiiiii.get()).booleanValue()) {
            IiIIiIiiiI.iiIiiiiiII();
        }
        if (((Boolean)IiIIiIiiiI.iIiiIiiiII.get()).booleanValue() && IiIIiIiiiI.IiiIIIIiiI()) {
            iIiiIiiIiI iIiiIiiIiI6 = IiIIiIiiiI;
            iIiiIiiIiI3 = iIiiIiiIiI6.ALLATORIxDEMO((List)iIiiIiiIiI6.iiiIiIiIIi.get());
            if (iIiiIiiIiI3 != null) {
                IiIIiIiiiI.ALLATORIxDEMO((class_1792)iIiiIiiIiI3);
                return;
            }
        }
        if (((Boolean)IiIIiIiiiI.IiiIIiiiiI.get()).booleanValue() && IiIIiIiiiI.iiIiiiiiII()) {
            iIiiIiiIiI iIiiIiiIiI7 = IiIIiIiiiI;
            iIiiIiiIiI3 = iIiiIiiIiI7.ALLATORIxDEMO((List)iIiiIiiIiI7.IIIiIiiIIi.get());
            if (iIiiIiiIiI3 != null) {
                IiIIiIiiiI.ALLATORIxDEMO((class_1792)iIiiIiiIiI3);
                return;
            }
        }
        if (((Boolean)IiIIiIiiiI.iiiiiIIiiI.get()).booleanValue() && IiIIiIiiiI.ALLATORIxDEMO()) {
            iIiiIiiIiI iIiiIiiIiI8 = IiIIiIiiiI;
            iIiiIiiIiI3 = iIiiIiiIiI8.ALLATORIxDEMO((List)iIiiIiiIiI8.ALLATORIxDEMO.get());
            if (iIiiIiiIiI3 != null) {
                IiIIiIiiiI.ALLATORIxDEMO((class_1792)iIiiIiiIiI3);
                IiIIiIiiiI.iIiIiiIiiI = 3 >> 2;
            }
        }
    }

    public iIiiIiiIiI() {
        iIiiIiiIiI iIiiIiiIiI2 = this;
        super(iiiiIiIiii.IiIIiIiiiI, MoveEvent.ALLATORIxDEMO("\u81aa\u52ef\u5463\u55fa"), IIiIIIiIii.ALLATORIxDEMO("\u81e9\u52ec\u4f7c\u754c\u724a\u5485\uff0f\u656b\u6302\u597e\u79ee\u89a2\u53d2\u6705\u4ed5"));
        iIiiIiiIiI2.IiIIIIiiii = iIiiIiiIiI2.settings.getDefaultGroup();
        iIiiIiiIiI2.iIIiIIiiII = iIiiIiiIiI2.settings.createGroup(MoveEvent.ALLATORIxDEMO("\u7578\u543d\u507b\u8986\u53b6"));
        iIiiIiiIiI2.iiiiiIIIii = iIiiIiiIiI2.settings.createGroup(IIiIIIiIii.ALLATORIxDEMO("\u9946\u993b\u503f\u8982\u53f2"));
        iIiiIiiIiI2.iiIiIiiiiI = iIiiIiiIiI2.settings.createGroup(MoveEvent.ALLATORIxDEMO("\u5bda\u65b1\u8986\u53b6"));
        iIiiIiiIiI2.IiIIiIiiiI = iIiiIiiIiI2.settings.createGroup(IIiIIIiIii.ALLATORIxDEMO("\u81ae\u52ab\u8801\u5166"));
        iIiiIiiIiI2.iiIIIIiIII = iIiiIiiIiI2.IiIIIIiiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u4f3f\u756f\u5e96\u8fb8"))).description(IIiIIIiIii.ALLATORIxDEMO("\u4f3b\u752b\u720d\u54e2\u4e0f\u95f7\u76c0\u5ef5\u8fbb\uff2b\u6e7c\u620c\u525f\uff2a"))).defaultValue((Object)(0x74 & 0x1F))).min(2 ^ 3).max(0x18E9 & 0x67DE).build());
        this.iIiIiIiIii = this.IiIIIIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u4f38\u7568\u65b1\u66e2\u503b\u5136\u4e91\u52c8\u4f3b"))).description(IIiIIIiIii.ALLATORIxDEMO("\u4f5c\u756c\u726a\u5485\u65f5\u66e6\u507f\u5132\u4ed5\u52cc\u4f7f"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iIiiIiiiII = this.iIIiIIiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u5468\u7548\u7578\u543d\u507b\u8986\u53b6"))).description(IIiIIIiIii.ALLATORIxDEMO("\u5f70\u755b\u547e\u5078\u4f4d\u4eea\u962b\u5078\u65f5\u81ae\u52ab\u4f1b\u750b\u6cff\u7594\u720d\u54e2"))).defaultValue((Object)(5 >> 2))).build());
        this.IIiiIiiiII = this.iIIiIIiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u7578\u543d\u507b\u9668\u505b"))).description(IIiIIIiIii.ALLATORIxDEMO("\u8982\u53f2\u4f3b\u752b\u6cff\u7594\u720d\u54e2\u76c0\u751c\u5419\u501f"))).defaultValue((Object)(0x5E & 0x2B))).min(3 & 5).max(0x1C & 0x77).build());
        class_1792[] class_1792Array = new class_1792[--4];
        class_1792Array[3 & 4] = class_1802.GOLDEN_APPLE;
        class_1792Array[3 >> 1] = class_1802.ENCHANTED_GOLDEN_APPLE;
        class_1792Array[--2] = class_1802.COOKED_BEEF;
        class_1792Array[--3] = class_1802.COOKED_PORKCHOP;
        this.iiiIiIiIIi = this.iIIiIIiiII.add((Setting)((ItemListSetting.Builder)((ItemListSetting.Builder)((ItemListSetting.Builder)new ItemListSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u6cfb\u75d0\u7209\u54a6"))).description(IIiIIIiIii.ALLATORIxDEMO("\u756c\u4e8d\u6026\u590e\u757b\u545e\u5078\u7687\u720d\u54e2"))).defaultValue(Arrays.asList(class_1792Array))).build());
        this.IiiIIiiiiI = this.iiiiiIIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u5468\u7548\u9902\u993f\u507b\u8986\u53b6"))).description(IIiIIIiIii.ALLATORIxDEMO("\u5f50\u9921\u997c\u5058\u4f6d\u4eca\u960b\u5078\u65f5\u818e\u528b\u4f3b\u752b\u98bb\u724a"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iIIiiIIIII = this.iiiiiIIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u9902\u993f\u507b\u9668\u505b"))).description(IIiIIIiIii.ALLATORIxDEMO("\u89a2\u53d2\u4f3b\u752b\u98bb\u724a\u76c0\u9966\u991b\u501f"))).defaultValue((Object)(0xF & 0x7E))).min(3 & 5).max(0x7C & 0x17).build());
        class_1792[] class_1792Array2 = new class_1792[--4];
        class_1792Array2[2 & 5] = class_1802.COOKED_BEEF;
        class_1792Array2[3 & 5] = class_1802.COOKED_PORKCHOP;
        class_1792Array2[--2] = class_1802.BREAD;
        class_1792Array2[--3] = class_1802.GOLDEN_CARROT;
        this.IIIiIiiIIi = this.iiiiiIIIii.add((Setting)((ItemListSetting.Builder)((ItemListSetting.Builder)((ItemListSetting.Builder)new ItemListSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u989f\u722e\u7209\u54a6"))).description(IIiIIIiIii.ALLATORIxDEMO("\u756c\u4e8d\u6026\u590e\u9901\u995c\u5078\u7687\u720d\u54e2"))).defaultValue(Arrays.asList(class_1792Array2))).build());
        this.iiiiiIIiiI = this.iiIiIiiiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u544f\u754f\u5bda\u65b1\u8986\u53b6"))).description(IIiIIIiIii.ALLATORIxDEMO("\u5bde\u65f5\u81ae\u52ab\u4f1b\u750b\u6343\u5b99\u720d\u54e2"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iiIiIIiIIi = this.iiIiIiiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u5bdd\u6596\u9593\u96d4\uff4f\u79b2\uff6e"))).description(IIiIIIiIii.ALLATORIxDEMO("\u5bfe\u65d5\u4f3b\u752b\u722d\u54c2\u76e0\u95d7\u96d0\uff0b\u79b6\uff2a"))).defaultValue((Object)(0x7F & 0x3C))).min(4 ^ 5).max(0x1E10 & 0x6FFF).build());
        this.ALLATORIxDEMO = this.iiIiIiiiiI.add((Setting)((ItemListSetting.Builder)((ItemListSetting.Builder)((ItemListSetting.Builder)new ItemListSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u5bda\u65b1\u7209\u54a6"))).description(IIiIIIiIii.ALLATORIxDEMO("\u5b99\u6592\u4f5c\u756c\u7687\u720d\u54e2"))).defaultValue(Collections.singletonList(class_1802.OMINOUS_BOTTLE))).build());
        this.iIiiIiiiii = this.IiIIiIiiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u81ad\u52c8\u8802\u5105\u5fac\u6317\u6868"))).description(IIiIIIiIii.ALLATORIxDEMO("\u81e9\u52ec\u4ecd\u80a8\u5326\u8821\u5146\u5faf\u6374\u686b\u4e0e\u76c0\u6d8b\u8073\u54e2"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.IiiIIIiiIi = this.IiIIiIiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MoveEvent.ALLATORIxDEMO("\u8825\u5102\u9668\u505b"))).description(IIiIIIiIii.ALLATORIxDEMO("\u5f17\u726a\u54a5\u6553\u918b\u4f4d\u4eca\u6b67\u5058\u65d5\u8f9f\u884f\u8801\u5166"))).defaultValue((Object)(--1))).min(5 >> 2).max(0x6E & 0x51).build());
        iIiiIiiIiI iIiiIiiIiI3 = this;
        iIiiIiiIiI iIiiIiiIiI4 = this;
        iIiiIiiIiI4.IIiiiiiiII = 3 ^ 3;
        iIiiIiiIiI4.iIiIiiIiiI = 3 & 4;
        iIiiIiiIiI3.IiIiIIIIiI = -4 >> 2;
        iIiiIiiIiI3.IIiiiIIIIi = 2 & 5;
        iIiiIiiIiI iIiiIiiIiI5 = this;
        iIiiIiiIiI3.iiIIiiIiii = new ArrayList<Class<? extends Module>>();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(MoveEvent.ALLATORIxDEMO("\u0017,ba3\"@\u00120#!3\u0005F`\u8bb0\u66b4\u65f7\u5250\u6767\u65f0\u720f\u674c\uff66"));
        }
    }

    @Override
    public void onActivate() {
        super.onActivate();
        this.IIiiiiiiII = 3 & 4;
        this.iIiIiiIiiI = 5 >> 3;
        this.IIiiiIIIIi = this.iIiIiiIiiI;
        this.info(IIiIIIiIii.ALLATORIxDEMO("\u81e9\u52cc\u5420\u55d9\u5df1\u544b\u528b"), new Object[3 >> 2]);
    }

    static {
        Class[] classArray = new Class[--5];
        classArray[5 >> 3] = KillAura.class;
        classArray[5 >> 2] = CrystalAura.class;
        classArray[--2] = IIIiiIIIIi.class;
        classArray[--3] = AnchorAura.class;
        classArray[--4] = BedAura.class;
        IIIiIIIiII = classArray;
    }

    public void onDeactivate() {
        if (this.IIiiiIIIIi) {
            this.ALLATORIxDEMO();
        }
        this.info(MoveEvent.ALLATORIxDEMO("\u81ad\u52c8\u5464\u55dd\u5db5\u5113\u958a"), new Object[2 & 5]);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1792 class_17922) {
        void IiIIiIiiiI;
        iIiiIiiIiI iIiiIiiIiI2 = iIiiIiiIiI3;
        class_1792[] class_1792Array = new class_1792[--1];
        class_1792Array[3 & 4] = IiIIiIiiiI;
        iIiiIiiIiI iIiiIiiIiI3 = InvUtils.findInHotbar((class_1792[])class_1792Array);
        if (!iIiiIiiIiI3.found()) {
            return;
        }
        iIiiIiiIiI2.IiiiiiiIIi();
        iIiiIiiIiI2.IiIiIIIIiI = IiiiIiiIII.ALLATORIxDEMO();
        InvUtils.swap((int)iIiiIiiIiI3.slot(), (3 & 4) != 0);
        iIiiIiiIiI2.iiIIIIiIII.options.useKey.setPressed(3 >> 1);
        if (!iIiiIiiIiI2.iiIIIIiIII.player.isUsingItem()) {
            Utils.rightClick();
        }
        iIiiIiiIiI2.IIiiiIIIIi = 5 >> 2;
        iIiiIiiIiI2.IIiiiiiiII = (Integer)iIiiIiiIiI2.iiIIIIiIII.get();
        Object[] objectArray = new Object[5 >> 2];
        objectArray[3 ^ 3] = IiIIiIiiiI.getName().getString();
        iIiiIiiIiI2.info(IIiIIIiIii.ALLATORIxDEMO("\u4f3b\u752b\u720d\u54e2~#AP"), objectArray);
    }

    private /* synthetic */ boolean IiiiiiiIIi() {
        if (this.iiIIIIiIII.player.isUsingItem()) {
            return 3 >> 1;
        }
        iIiiIiiIiI iIiiIiiIiI2 = this;
        if (iIiiIiiIiI2.IIiiiiiiII > (Integer)iIiiIiiIiI2.iiIIIIiIII.get() - --5) {
            return (3 & 5) != 0;
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        iIiiIiiIiI iIiiIiiIiI2 = this;
        if (iIiiIiiIiI2.iIiIiiIiiI >= (Integer)iIiiIiiIiI2.iiIiIIiIIi.get() * (0x76 & 0x1D)) {
            return 5 >> 2;
        }
        return false;
    }

    private /* synthetic */ void IiiiiiiIIi() {
        Class<? extends Module>[] classArray = classArray2;
        classArray.iiIIiiIiii.clear();
        if (((Boolean)classArray.iIiIiIiIii.get()).booleanValue()) {
            int n;
            Class<? extends Module>[] classArray2 = IIIiIIIiII;
            int n2 = IIIiIIIiII.length;
            int n3 = n = 3 ^ 3;
            while (n3 < n2) {
                Class<? extends Module> clazz = classArray2[n];
                Module module = Modules.get().get(clazz);
                if (module.isActive()) {
                    classArray.iiIIiiIiii.add(clazz);
                    module.toggle();
                }
                n3 = ++n;
            }
        }
        classArray.IIIIiIiiIi = 2 & 5;
        try {
            if (((Boolean)classArray.iIiIiIiIii.get()).booleanValue() && BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().isPathing()) {
                classArray.IIIIiIiiIi = 5 >> 2;
                BaritoneAPI.getProvider().getPrimaryBaritone().getCommandManager().execute(IIiIIIiIii.ALLATORIxDEMO("S%v\u0017F"));
                return;
            }
        } catch (Exception this_) {
            classArray.info("error:" + String.valueOf(this_), new Object[3 ^ 3]);
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iIiiIiiIiI iIiiIiiIiI2 = this;
        iIiiIiiIiI2.iiIIIIiIII.options.useKey.setPressed(5 >> 3);
        if (iIiiIiiIiI2.IiIiIIIIiI != -4 >> 2) {
            InvUtils.swap((int)this.IiIiIIIIiI, (boolean)(5 >> 3));
            this.IiIiIIIIiI = -4 >> 2;
        }
        this.IIiiiIIIIi = 2 & 5;
        this.IiiIIIIiiI();
    }
}

