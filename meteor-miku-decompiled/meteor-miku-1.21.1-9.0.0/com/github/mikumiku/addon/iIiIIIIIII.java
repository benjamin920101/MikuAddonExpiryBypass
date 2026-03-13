/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.friends.Friends
 *  meteordevelopment.meteorclient.systems.modules.Category
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.FishingRodItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiIIIIi;
import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.iIiIIiiIiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.iiiiIiiiII;
import java.util.Date;
import java.util.Iterator;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;

public class iIiIIIIIII
extends iiiiIiIiii {
    private int IiiIIiiiiI;
    private final SettingGroup IiIIIIiiii;
    private final Setting<Boolean> IiiIIIiiIi;
    private boolean iiIIiiIiii;
    private final Setting<Integer> iIiiIiiiII;
    private final Setting<Integer> iIIiiIIIII;
    private final Setting<Boolean> iiIiIIiIIi;
    private final Setting<Integer> IIIIiIiiIi;
    private int IiIiIIIIiI;
    private final Setting<Double> iiiiiIIiiI;
    private final SettingGroup iiIIIIiIII;
    private class_1657 IiIIiIiiiI;
    private final Setting<Boolean> ALLATORIxDEMO;

    private /* synthetic */ class_1657 ALLATORIxDEMO() {
        iIiIIIIIII iIiIIIIIII2 = iterator;
        class_1657 class_16572 = null;
        double d = Double.MAX_VALUE;
        Iterator iterator = iIiIIIIIII2.iiIIIIiIII.world.getPlayers().iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                double d2;
                class_1657 class_16573 = (class_1657)iterator.next();
                if (class_16573.equals((Object)iIiIIIIIII2.iiIIIIiIII.player)) {
                    iterator2 = iterator;
                    continue;
                }
                if (!iIiIIIIIII2.ALLATORIxDEMO(class_16573)) {
                    iterator2 = iterator;
                    continue;
                }
                double d3 = iIiIIIIIII2.iiIIIIiIII.player.distanceTo((class_1297)class_16573);
                if (!(d2 <= (double)((Integer)iIiIIIIIII2.IIIIiIiiIi.get()).intValue()) || !(d3 < d)) continue block0;
                d = d3;
                class_16572 = class_16573;
                continue block0;
            }
            break;
        }
        return class_16572;
    }

    public void onDeactivate() {
        iIiIIIIIII iIiIIIIIII2 = this;
        this.IiiIIiiiiI = 2 & 5;
        this.IiIiIIIIiI = 3 & 4;
        iIiIIIIIII2.iiIIiiIiii = this.IiIiIIIIiI;
        iIiIIIIIII2.IiIIiIiiiI = null;
        iiiiIiiiII.ALLATORIxDEMO(IIIIiIIIIi.ALLATORIxDEMO("\u9c0e\u7ab9\u7ca7\u8169\u6a5b\u5713\u5d9d\u5009\u6b1c"));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_243 class_2432) {
        void IiIIiIiiiI;
        iIiIIIIIII iIiIIIIIII2;
        iIiIIIIIII iIiIIIIIII3 = iIiIIIIIII2 = object;
        iIiIIIIIII3.ALLATORIxDEMO();
        Object object = iIiIIIIIII3.iiIIIIiIII.player.getEyePos();
        IiIIiIiiiI.subtract((class_243)object).normalize();
        object = iIiIIIIIII3.ALLATORIxDEMO((class_243)object, (class_243)IiIIiIiiiI);
        iIiIIIIIII3.iiIIIIiIII.player.setYaw((float)object[3 & 4]);
        iIiIIIIIII3.iiIIIIiIII.player.setPitch((float)object[5 >> 2]);
        iIiIIIIIII3.iiIIIIiIII.interactionManager.attackBlock(iIiIIIIIII2.iiIIIIiIII.player.getBlockPos(), class_2350.UP);
        iIiIIIIIII2.iiIIIIiIII.player.swingHand(class_1268.MAIN_HAND);
        Object[] objectArray = new Object[--3];
        objectArray[5 >> 3] = IiIIiIiiiI.x;
        objectArray[2 ^ 3] = IiIIiIiiiI.y;
        objectArray[--2] = IiIIiIiiiI.z;
        iIiIIIIIII3.info("\u4e22\u9493\u9c7c\u7aff\u5411\u76ee\u6807: " + String.format(IIIIiIIIIi.ALLATORIxDEMO("LjQe\u0004eYwfR\u0012sU{Sg\u0019}"), objectArray), new Object[3 >> 2]);
    }

    @Override
    public void onActivate() {
        iIiIIIIIII iIiIIIIIII2 = this;
        super.onActivate();
        this.IiiIIiiiiI = 3 & 4;
        this.IiIiIIIIiI = 3 >> 2;
        iIiIIIIIII2.iiIIiiIiii = this.IiIiIIIIiI;
        iIiIIIIIII2.IiIIiIiiiI = null;
        iiiiIiiiII.ALLATORIxDEMO(IIIIiIIIIi.ALLATORIxDEMO("\u9c0e\u7ab9\u7ca7\u8169\u6a5b\u5713\u5d9d\u547a\u52d6"));
        iiiiIiiiII.ALLATORIxDEMO(iIiIIiiIiI.ALLATORIxDEMO("\u6b1f\u576f\u6460\u7d65\u837f\u56b3\u51f9\u76c3\u7692\u6840RiR"));
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        iIiIIIIIII iIiIIIIIII2 = this;
        int n = this = 3 ^ 3;
        while (n < iIiIIIIIII2.iiIIIIiIII.player.getInventory().size()) {
            class_1799 class_17992 = iIiIIIIIII2.iiIIIIiIII.player.getInventory().getStack(this);
            if (!class_17992.isEmpty() && class_17992.getItem() instanceof class_1787) {
                return (4 ^ 5) != 0;
            }
            n = ++this;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ float[] ALLATORIxDEMO(class_243 class_2432, class_243 class_2433) {
        void IiIIiIiiiI22;
        iIiIIIIIII iIiIIIIIII2 = iIiIIIIIII3;
        iIiIIIIIII iIiIIIIIII3 = class_2432;
        iIiIIIIIII IiIIiIiiiI = iIiIIIIIII2;
        void v1 = IiIIiIiiiI22;
        double d = v1.x - ((class_243)iIiIIIIIII3).x;
        double d2 = v1.y - ((class_243)iIiIIIIIII3).y;
        double d3 = v1.z - ((class_243)iIiIIIIIII3).z;
        double d4 = d;
        double d5 = d3;
        double d6 = Math.sqrt(d4 * d4 + d5 * d5);
        float this2 = (float)Math.toDegrees(Math.atan2(d3, d)) - 90.0f;
        float IiIIiIiiiI22 = (float)(-Math.toDegrees(Math.atan2(d2, d6)));
        float[] fArray = new float[1 ^ 3];
        fArray[3 ^ 3] = this2;
        fArray[--1] = IiIIiIiiiI22;
        return fArray;
    }

    private /* synthetic */ class_243 ALLATORIxDEMO(class_1657 class_16572) {
        iIiIIIIIII iIiIIIIIII2 = iIiIIIIIII3;
        iIiIIIIIII iIiIIIIIII3 = class_16572;
        iIiIIIIIII IiIIiIiiiI = iIiIIIIIII2;
        return iIiIIIIIII3.getPos().add(0.0, ((Double)IiIIiIiiiI.iiiiiIIiiI.get()).doubleValue(), 0.0);
    }

    private /* synthetic */ boolean IiiiiiiIIi(class_1657 class_16572) {
        iIiIIIIIII iIiIIIIIII2 = iIiIIIIIII3;
        iIiIIIIIII iIiIIIIIII3 = class_16572;
        iIiIIIIIII IiIIiIiiiI = iIiIIIIIII2;
        return Friends.get().isFriend((class_1657)iIiIIIIIII3);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IIIiIiIiii.ALLATORIxDEMO(IIIiIiIiii.ALLATORIxDEMO((class_1799 IiIIiIiiiI) -> IiIIiIiiiI.getItem() instanceof class_1787));
    }

    public String ALLATORIxDEMO() {
        if (this.IiIIiIiiiI != null) {
            iIiIIIIIII iIiIIIIIII2 = this;
            double d = this.iiIIIIiIII.player.distanceTo((class_1297)iIiIIIIIII2.IiIIiIiiiI);
            Object[] objectArray = new Object[4 ^ 5];
            objectArray[5 >> 3] = d;
            return "\u76ee\u6807: " + iIiIIIIIII2.IiIIiIiiiI.getName().getString() + " | \u8ddd\u79bb: " + String.format(iIiIIiiIiI.ALLATORIxDEMO("bRv\u001a"), objectArray);
        }
        return IIIIiIIIIi.ALLATORIxDEMO("\u6469\u7d7c\u4e50xQz");
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_1657 class_16572) {
        iIiIIIIIII iIiIIIIIII2 = iIiIIIIIII3;
        iIiIIIIIII iIiIIIIIII3 = class_16572;
        iIiIIIIIII IiIIiIiiiI = iIiIIIIIII2;
        if (iIiIIIIIII3.isCreative()) {
            return 5 >> 3;
        }
        if (iIiIIIIIII3.isDead()) {
            return 3 >> 2;
        }
        if (IiIIiIiiiI.IiiiiiiIIi((class_1657)iIiIIIIIII3)) {
            return (Boolean)IiIIiIiiiI.IiiIIIiiIi.get();
        }
        return (Boolean)IiIIiIiiiI.iiIiIIiIIi.get();
    }

    public iIiIIIIIII() {
        iIiIIIIIII iIiIIIIIII2 = this;
        super((Category)ALLATORIxDEMO, IIIIiIIIIi.ALLATORIxDEMO("\u9c38\u7a90\u7cc4\u811d"), iIiIIiiIiI.ALLATORIxDEMO("\u4f03\u756f\u9c00\u7ab8\u4e5e\u650b\u4ec6\u817f\u4e76"));
        iIiIIIIIII2.iiIIIIiIII = iIiIIIIIII2.settings.getDefaultGroup();
        iIiIIIIIII2.IiIIIIiiii = iIiIIIIIII2.settings.createGroup(IIIIiIIIIi.ALLATORIxDEMO("\u76aa\u6868\u8bb0\u7f4b"));
        iIiIIIIIII2.IIIIiIiiIi = iIiIIIIIII2.iiIIIIiIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u6887\u6d37\u8344\u5688"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u68e7\u6d12\u653e\u4ee4\u76f1\u835a\u5686\uff4c\u65d6\u5759\uff2c"))).defaultValue((Object)(0x3F & 0x46))).min(4 ^ 5).max(0x211D & 0x5FE2).sliderMin(3 >> 1).sliderMax(0x70F5 & 0xF8A).build());
        this.iIiiIiiiII = this.iiIIIIiIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u4e65\u94ef\u5eb1\u8fa3"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u4e70\u949f\u9c5b\u7aa6\u76f6\u5ea8\u8faa\uff51\u0006-\fe\uff2c"))).defaultValue((Object)(4 ^ 5))).min(3 >> 2).max(0x7E & 0x15).sliderMin(3 >> 2).sliderMax(0x5F & 0x34).build());
        this.ALLATORIxDEMO = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u81ad\u52d4\u918a\u65cc\u4e65\u94ef"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u94ca\u5242\u4ee4\u547b\u81b3\u52da\u9189\u65df\u4e2c\u94b6"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiiIIIII = this.iiIIIIiIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u918a\u65cc\u4e65\u94ef\u5eb1\u8fa3"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u94c1\u5249\u4ee8\u5477\u919f\u65bc\u4e05\u94ca\u76f6\u5ea8\u8faa\uff51\u0006-\fe\uff2c"))).defaultValue((Object)(0xE & 0x7B))).min(3 >> 2).max(0x2F & 0x78).sliderMin(3 & 4).sliderMax(0x2C & 0x7B).build());
        this.iiIiIIiIIi = this.IiIIIIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u7c8d\u5f78\u73ee\u5bca"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u6676\u5454\u94cc\u5b96\u73a7\u5b93"))).defaultValue((Object)(3 >> 1))).build());
        this.IiiIIIiiIi = this.IiIIIIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u7c8d\u5f78\u9658\u53b7"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u6676\u5454\u94cc\u5b96\u9611\u53ee"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iiiiiIIiiI = this.IiIIIIiiii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u5973\u9094\u9a9f\u5eda\u5008\u7987"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u94fa\u5ba7\u5941\u90b1\u76f6\u9a9c\u5ec9\u5041\u79de"))).defaultValue(1.6).min(0.0).max(3.0).sliderMin(0.0).sliderMax(3.0).build());
        iIiIIIIIII iIiIIIIIII3 = this;
        this.IiiIIiiiiI = 3 >> 2;
        this.IiIiIIIIiI = 5 >> 3;
        iIiIIIIIII3.iiIIiiIiii = this.IiIiIIIIiI;
        iIiIIIIIII3.IiIIiIiiiI = null;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIiIIiiIiI.ALLATORIxDEMO("07Ez\u00149g\t\u00178&\b\"]g\u8b8b\u66b3\u65cc\u5277\u677c\u65f7\u7234\u676b\uff7d"));
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIiIIIIIII iIiIIIIIII2 = iIiIIIIIII3;
        iIiIIIIIII iIiIIIIIII3 = pre;
        iIiIIIIIII IiIIiIiiiI = iIiIIIIIII2;
        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) {
            return;
        }
        if (!IiIIiIiiiI.ALLATORIxDEMO()) {
            IiIIiIiiiI.warning(iIiIIiiIiI.ALLATORIxDEMO("\u808b\u5379\u4e6a\u6cdd\u674e\u9c00\u7ab8\uff7d"), new Object[3 & 4]);
            IiIIiIiiiI.toggle();
            return;
        }
        if (IiIIiIiiiI.IiIiIIIIiI > 0) {
            IiIIiIiiiI.IiIiIIIIiI -= 2 ^ 3;
            return;
        }
        if (IiIIiIiiiI.IiiIIiiiiI > 0) {
            IiIIiIiiiI.IiiIIiiiiI -= 3 & 5;
            return;
        }
        if (IiIIiIiiiI.iiIIIIiIII.player.fishHook != null) {
            IiIIiIiiiI.iiIIiiIiii = 4 ^ 5;
            return;
        }
        IiIIiIiiiI.iiIIiiIiii = 3 & 4;
        iIiIIIIIII3 = IiIIiIiiiI.ALLATORIxDEMO();
        if (iIiIIIIIII3 != null) {
            if (IiIIiIiiiI.IiIIiIiiiI == null || !IiIIiIiiiI.IiIIiIiiiI.equals((Object)iIiIIIIIII3)) {
                IiIIiIiiiI.IiIIiIiiiI = iIiIIIIIII3;
                IiIIiIiiiI.info("\u9009\u4e2d\u76ee\u6807: " + IiIIiIiiiI.IiIIiIiiiI.getName().getString(), new Object[3 ^ 3]);
            }
            iIiIIIIIII iIiIIIIIII4 = IiIIiIiiiI;
            iIiIIIIIII4.ALLATORIxDEMO(iIiIIIIIII4.ALLATORIxDEMO((class_1657)iIiIIIIIII3));
            iIiIIIIIII4.IiiIIiiiiI = (Integer)iIiIIIIIII4.iIiiIiiiII.get();
            if (((Boolean)IiIIiIiiiI.ALLATORIxDEMO.get()).booleanValue()) {
                IiIIiIiiiI.IiIiIIIIiI = (Integer)IiIIiIiiiI.iIIiiIIIII.get();
                return;
            }
        } else if (IiIIiIiiiI.IiIIiIiiiI != null) {
            IiIIiIiiiI.IiIIiIiiiI = null;
        }
    }
}

