/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.friends.Friends
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.client.sound.PositionedSoundInstance
 *  net.minecraft.client.sound.SoundInstance
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.sound.SoundEvent
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIiIiiIi;
import com.github.mikumiku.addon.IiiiIIiiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.iiiiIiiiII;
import com.github.mikumiku.addon.modules.PlayerAlert;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvent;

public class IiIIIIIiIi
extends iiiiIiIiii {
    private final Setting<Double> IIiiIiiiII;
    private final Setting<PlayerAlert.SoundChoice> IIIiIiiIIi;
    private final Set<String> iiiIiIiIIi;
    private final SettingGroup iIiIiIiIii;
    private final Setting<PlayerAlert.SoundChoice> iiiiiIIIii;
    private final Setting<Boolean> iIIiIIiiII;
    private final Setting<PlayerAlert.SoundChoice> IiiIIiiiiI;
    private final Setting<Boolean> IiIIIIiiii;
    private int IiiIIIiiIi;
    private final SettingGroup iiIIiiIiii;
    private final SettingGroup iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private final Set<String> iiIiIIiIIi;
    private final Setting<Double> IIIIiIiiIi;
    private final Setting<Double> IiIiIIIIiI;
    private final Setting<Boolean> iiiiiIIiiI;
    private final Setting<Boolean> iiIIIIiIII;
    private final Setting<Integer> IiIIiIiiiI;
    private final Set<String> ALLATORIxDEMO;

    private /* synthetic */ boolean ALLATORIxDEMO(class_1657 class_16572) {
        IiIIIIIiIi iiIIIIIiIi = iiIIIIIiIi2;
        IiIIIIIiIi iiIIIIIiIi2 = class_16572;
        IiIIIIIiIi IiIIiIiiiI = iiIIIIIiIi;
        return Friends.get().isFriend((class_1657)iiIIIIIiIi2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1657 class_16572, double d, String string) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IiIIIIIiIi iiIIIIIiIi = stringBuilder;
        String string2 = IiIIiIiiiI2.getGameProfile().getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(IIiIiIiiIi.ALLATORIxDEMO("\u00e6\u000e&\u775a\u9594\u7287)x\u00d1<")).append((String)IiIIiIiiiI).append(IiiiIIiiiI.ALLATORIxDEMO("0u\u008d\u0010")).append(string2);
        if (((Boolean)iiIIIIIiIi.IiIIIIiiii.get()).booleanValue()) {
            void IiIIiIiiiI3;
            Object[] objectArray = new Object[4 ^ 5];
            objectArray[2 & 5] = (double)IiIIiIiiiI3;
            stringBuilder.append(IIiIiIiiIi.ALLATORIxDEMO("a\u00caJy\u8da1\u79ebNx\u00d1;")).append(String.format(IiiiIIiiiI.ALLATORIxDEMO("/{\u001b\u0013"), objectArray)).append(IIiIiIiiIi.ALLATORIxDEMO("\u00ffAs"));
        }
        if (((Boolean)iiIIIIIiIi.iiIIIIiIII.get()).booleanValue()) {
            Object[] objectArray = new Object[--3];
            objectArray[3 ^ 3] = IiIIiIiiiI2.getX();
            objectArray[2 ^ 3] = IiIIiIiiiI2.getY();
            objectArray[5 >> 1] = IiIIiIiiiI2.getZ();
            stringBuilder.append(IiiiIIiiiI.ALLATORIxDEMO("*\u00f2=\u000e\u577a\u68720u\u008d\u0017")).append(String.format(IIiIiIiiIi.ALLATORIxDEMO("St[!\\|dCM7PpQvF<"), objectArray)).append(IiiiIIiiiI.ALLATORIxDEMO("\u00f2\u001d("));
        }
        iiiiIiiiII.ALLATORIxDEMO(stringBuilder.toString());
    }

    private /* synthetic */ void IiIiiiIIiI() {
        this.iiIIIIiIII.executeSync(() -> {
            if (this.iiIIIIiIII.getSoundManager() != null) {
                this.iiIIIIiIII.getSoundManager().play((class_1113)class_1109.master((class_3414)((PlayerAlert.SoundChoice)((Object)((Object)this.iiiiiIIIii.get()))).iiIiIIiIIi, (float)((Double)this.IiIiIIIIiI.get()).floatValue(), (float)((Double)this.IIiiIiiiII.get()).floatValue()));
            }
        });
    }

    private /* synthetic */ void ALLATORIxDEMO(String string) {
        IiIIIIIiIi iiIIIIIiIi = string2;
        String string2 = string;
        IiIIIIIiIi IiIIiIiiiI = iiIIIIIiIi;
        if (((Boolean)IiIIiIiiiI.iiiiiIIiiI.get()).booleanValue()) {
            IiIIiIiiiI.IiIiiiIIiI();
        }
        if (((Boolean)IiIIiIiiiI.iIIiiIIIII.get()).booleanValue()) {
            IiIIiIiiiI.ALLATORIxDEMO(string2, IIiIiIiiIi.ALLATORIxDEMO("\u79cf\u5f58\u89b0\u8d87"));
        }
    }

    private /* synthetic */ void IiiiiiiiII() {
        IiIIIIIiIi object;
        IiIIIIIiIi iiIIIIIiIi = object;
        HashSet<String> hashSet = new HashSet<String>();
        HashSet<String> hashSet2 = new HashSet<String>();
        Iterator<Object> iterator = iiIIIIIiIi.iiIIIIiIII.world.getPlayers().iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                class_1657 this_ = (class_1657)iterator.next();
                if (this_.getUuid().equals(iiIIIIIiIi.iiIIIIiIII.player.getUuid())) {
                    iterator2 = iterator;
                    continue;
                }
                String string = this_.getGameProfile().getName();
                IiIIIIIiIi iiIIIIIiIi2 = iiIIIIIiIi;
                double d = iiIIIIIiIi2.iiIIIIiIII.player.distanceTo((class_1297)this_);
                Friends.get().isFriend(this_);
                if (((Boolean)iiIIIIIiIi2.iIIiIIiiII.get()).booleanValue() && iiIIIIIiIi.ALLATORIxDEMO(this_)) {
                    iterator2 = iterator;
                    continue;
                }
                hashSet.add(string);
                if (!iiIIIIIiIi.ALLATORIxDEMO.contains(string)) {
                    iiIIIIIiIi.IiiiiiiIIi(this_, d);
                }
                if (!(d <= (Double)iiIIIIIiIi.IIIIiIiiIi.get())) continue block0;
                hashSet2.add(string);
                if (iiIIIIIiIi.iiiIiIiIIi.contains(string)) continue block0;
                iiIIIIIiIi.ALLATORIxDEMO(this_, d);
                continue block0;
            }
            break;
        }
        for (String this_ : iiIIIIIiIi.ALLATORIxDEMO) {
            if (hashSet.contains(this_)) continue;
            iiIIIIIiIi.ALLATORIxDEMO(this_);
        }
        IiIIIIIiIi iiIIIIIiIi3 = iiIIIIIiIi;
        iiIIIIIiIi3.ALLATORIxDEMO.clear();
        iiIIIIIiIi3.ALLATORIxDEMO.addAll(hashSet);
        IiIIIIIiIi iiIIIIIiIi4 = iiIIIIIiIi;
        iiIIIIIiIi4.iiiIiIiIIi.clear();
        iiIIIIIiIi4.iiiIiIiIIi.addAll(hashSet2);
        IiIIIIIiIi iiIIIIIiIi5 = iiIIIIIiIi;
        iiIIIIIiIi5.iiIiIIiIIi.clear();
        iiIIIIIiIi5.iiIiIIiIIi.addAll(hashSet2);
    }

    public void onDeactivate() {
        IiIIIIIiIi iiIIIIIiIi = this;
        iiIIIIIiIi.iiIiIIiIIi.clear();
        iiIIIIIiIi.ALLATORIxDEMO.clear();
        iiIIIIIiIi.iiiIiIiIIi.clear();
        iiiiIiiiII.ALLATORIxDEMO(IIiIiIiiIi.ALLATORIxDEMO("\u7753\u959c\u729a\u5d93\u512f\u959d"));
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IiIIIIIiIi iiIIIIIiIi = iiIIIIIiIi2;
        IiIIIIIiIi iiIIIIIiIi2 = pre;
        IiIIIIIiIi IiIIiIiiiI = iiIIIIIiIi;
        if (IiIIiIiiiI.iiIIIIiIII == null || IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) {
            return;
        }
        IiIIIIIiIi iiIIIIIiIi3 = IiIIiIiiiI;
        iiIIIIIiIi3.IiiIIIiiIi += --1;
        if (iiIIIIIiIi3.IiiIIIiiIi < (Integer)IiIIiIiiiI.IiIIiIiiiI.get()) {
            return;
        }
        IiIIiIiiiI.IiiIIIiiIi = 5 >> 3;
        IiIIiIiiiI.IiiiiiiiII();
    }

    private /* synthetic */ String ALLATORIxDEMO(double IiIIiIiiiI) {
        if (IiIIiIiiiI < 10.0) {
            Object[] objectArray = new Object[4 ^ 5];
            objectArray[3 ^ 3] = IiIIiIiiiI;
            return String.format(IIiIiIiiIi.ALLATORIxDEMO("QvG<"), objectArray);
        }
        Object[] objectArray = new Object[4 ^ 5];
        objectArray[5 >> 3] = IiIIiIiiiI;
        return String.format(IiiiIIiiiI.ALLATORIxDEMO("/{\u001a\u0013"), objectArray);
    }

    public IiIIIIIiIi() {
        IiIIIIIiIi iiIIIIIiIi = this;
        super(iiiiIiIiii.ALLATORIxDEMO, IiiiIIiiiI.ALLATORIxDEMO("\u775e\u95c2\u72a2"), IIiIiIiiIi.ALLATORIxDEMO("\u5f23\u6755\u73f9\u5bca\u8fde\u514c\u9614\u8fad\u65a1\u64d6\u656e\u588c\u97be\u5e17\u63d7\u91b9"));
        IiIIIIIiIi iiIIIIIiIi2 = this;
        iiIIIIIiIi.iiIiIIiIIi = new HashSet<String>();
        IiIIIIIiIi iiIIIIIiIi3 = this;
        iiIIIIIiIi2.ALLATORIxDEMO = new HashSet<String>();
        IiIIIIIiIi iiIIIIIiIi4 = this;
        iiIIIIIiIi.iiiIiIiIIi = new HashSet<String>();
        iiIIIIIiIi.iIiIiIiIii = iiIIIIIiIi.settings.getDefaultGroup();
        iiIIIIIiIi.iiIIiiIiii = iiIIIIIiIi.settings.createGroup(IiiiIIiiiI.ALLATORIxDEMO("\u58fa\u97a6\u8b94\u7f1b"));
        iiIIIIIiIi.iIiiIiiiII = iiIIIIIiIi.settings.createGroup(IIiIiIiiIi.ALLATORIxDEMO("\u8007\u5948\u8bb9\u7f45"));
        iiIIIIIiIi.IIIIiIiiIi = iiIIIIIiIi.iIiIiIiIii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u974a\u8fa4\u68ca\u6d1e\u8df7\u79ce"))).description(IIiIiIiiIi.ALLATORIxDEMO("\u68bb\u6d1b\u73d5\u5bfb\u76e5\u9767\u8ffa"))).defaultValue(20.0).min(1.0).max(200.0).sliderMin(1.0).sliderMax(200.0).build());
        this.IiIIiIiiiI = this.iIiIiIiIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u68ca\u6d1e\u95de\u96e1"))).description(IIiIiIiiIi.ALLATORIxDEMO("\u689c\u6d1b\u73d5\u5bb3\u76ad\u95a4\u96e8\u65a1\u958fx\b$\u0002l\u0002"))).defaultValue((Object)(0x35 & 0x5E))).min(--1).max(0x7F & 0x64).sliderMin(2 ^ 3).sliderMax(0x3C & 0x7F).build());
        this.iIIiIIiiII = this.iIiIiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u4eef\u972b\u9615\u539e\u7383\u5bc3"))).description(IIiIiIiiIi.ALLATORIxDEMO("\u53bd\u63ab\u91c2\u9722\u9652\u53aa\u73ae\u5b9d"))).defaultValue((Object)(3 >> 2))).build());
        this.iiiiiIIiiI = this.iiIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u64a7\u656b\u58da\u9786"))).description(IIiIiIiiIi.ALLATORIxDEMO("\u6890\u6d37\u5267\u73d2\u5be6\u658a\u64e0\u655f\u58f7\u97d8"))).defaultValue((Object)(--1 != 0))).build());
        this.IIIiIiiIIi = this.iiIIiiIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u8fd1\u5130\u58da\u9786"))).description(IIiIiIiiIi.ALLATORIxDEMO("\u64d6\u656e\u76f8\u58bd\u9792\u7c7c\u57a0"))).defaultValue((Object)PlayerAlert.SoundChoice.iiIIIIiIII)).build());
        this.iiiiiIIIii = this.iiIIiiIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u79b1\u5f55\u58da\u9786"))).description(IIiIiIiiIi.ALLATORIxDEMO("\u64d6\u656e\u76f8\u58bd\u9792\u7c7c\u57a0"))).defaultValue((Object)PlayerAlert.SoundChoice.iiIIIIiIII)).build());
        this.IiiIIiiiiI = this.iiIIiiIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u976a\u8f84\u58da\u9786"))).description(IIiIiIiiIi.ALLATORIxDEMO("\u64d6\u656e\u76f8\u58bd\u9792\u7c7c\u57a0"))).defaultValue((Object)PlayerAlert.SoundChoice.iiIIIIiIII)).build());
        this.IIiiIiiiII = this.iiIIiiIiii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u97d9\u91ba"))).description(IIiIiIiiIi.ALLATORIxDEMO("\u58a0\u978f\u64e0\u655f\u97f4\u91e4"))).defaultValue(1.0).min(0.1).max(10.0).sliderMin(0.1).sliderMax(10.0).build());
        this.IiIiIIIIiI = this.iiIIiiIiii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u97d9\u8c76"))).description(IIiIiIiiIi.ALLATORIxDEMO("\u58a0\u978f\u64e0\u655f\u97f4\u8c28"))).defaultValue(1.0).min(0.5).max(2.0).sliderMin(0.5).sliderMax(2.0).build());
        this.iIIiiIIIII = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u8040\u597c\u63fa\u91e7"))).description(IIiIiIiiIi.ALLATORIxDEMO("\u5778\u8036\u597e\u683d\u666e\u7946\u73e4\u5bd7\u63d7\u91b9"))).defaultValue((Object)(5 >> 2))).build());
        this.IiIIIIiiii = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u6634\u796f\u8df7\u79ce"))).description(IIiIiIiiIi.ALLATORIxDEMO("\u5778\u63ac\u91c5\u4e56\u666e\u7946\u73e4\u5bd7\u8dda\u7990"))).defaultValue((Object)(--1 != 0))).build());
        this.iiIIIIiIII = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u6634\u796f\u577a\u6872"))).description(IIiIiIiiIi.ALLATORIxDEMO("\u5778\u63ac\u91c5\u4e56\u666e\u7946\u73e4\u5bd7\u5757\u682c"))).defaultValue((Object)(3 >> 2))).build());
        this.IiiIIIiiIi = 3 & 4;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiiIIiiiI.ALLATORIxDEMO("}\u001e\bSy0\n\u0000z1k!ot*\u8ba2\u66fe\u65e5\u521a\u6775\u65ba\u721d\u6706\uff74"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IiiiiiiIIi(class_1657 class_16572, double d) {
        IiIIIIIiIi iiIIIIIiIi = iiIIIIIiIi2;
        IiIIIIIiIi iiIIIIIiIi2 = class_16572;
        IiIIIIIiIi IiIIiIiiiI = iiIIIIIiIi;
        iiIIIIIiIi2.getGameProfile().getName();
        if (((Boolean)IiIIiIiiiI.iiiiiIIiiI.get()).booleanValue()) {
            IiIIiIiiiI.iiIiiiiiII();
        }
        if (((Boolean)IiIIiIiiiI.iIIiiIIIII.get()).booleanValue()) {
            void IiIIiIiiiI2;
            IiIIiIiiiI.ALLATORIxDEMO((class_1657)iiIIIIIiIi2, (double)IiIIiIiiiI2, IiiiIIiiiI.ALLATORIxDEMO("\u8fd1\u5130\u89ec\u8da8"));
        }
    }

    private /* synthetic */ void iiIiiiiiII() {
        this.iiIIIIiIII.executeSync(() -> {
            if (this.iiIIIIiIII.getSoundManager() != null) {
                this.iiIIIIiIII.getSoundManager().play((class_1113)class_1109.master((class_3414)((PlayerAlert.SoundChoice)((Object)((Object)this.IIIiIiiIIi.get()))).iiIiIIiIIi, (float)((Double)this.IiIiIIIIiI.get()).floatValue(), (float)((Double)this.IIiiIiiiII.get()).floatValue()));
            }
        });
    }

    private /* synthetic */ void IiiIIIIiiI() {
        this.iiIIIIiIII.executeSync(() -> {
            if (this.iiIIIIiIII.getSoundManager() != null) {
                this.iiIIIIiIII.getSoundManager().play((class_1113)class_1109.master((class_3414)((PlayerAlert.SoundChoice)((Object)((Object)this.IiiIIiiiiI.get()))).iiIiIIiIIi, (float)((Double)this.IiIiIIIIiI.get()).floatValue(), (float)((Double)this.IIiiIiiiII.get()).floatValue()));
            }
        });
    }

    public void IiiiiiiIIi() {
        IiIIIIIiIi iiIIIIIiIi = this;
        iiIIIIIiIi.iiIiIIiIIi.clear();
        iiIIIIIiIi.ALLATORIxDEMO.clear();
        iiIIIIIiIi.iiiIiIiIIi.clear();
        iiiiIiiiII.ALLATORIxDEMO(IIiIiIiiIi.ALLATORIxDEMO("\u5d8e\u5247\u65ec\u73d9\u5bea\u5247\u8814"));
    }

    @Override
    public void onActivate() {
        IiIIIIIiIi iiIIIIIiIi = this;
        IiIIIIIiIi iiIIIIIiIi2 = this;
        super.onActivate();
        iiIIIIIiIi2.iiIiIIiIIi.clear();
        iiIIIIIiIi2.ALLATORIxDEMO.clear();
        iiIIIIIiIi.iiiIiIiIIi.clear();
        iiIIIIIiIi.IiiIIIiiIi = 2 & 5;
        iiiiIiiiII.ALLATORIxDEMO("\u770b\u95e8\u72d7\u5df2\u542f\u52a8\uff0c\u9760\u8fd1\u68c0\u6d4b\u8ddd\u79bb: " + ((Double)iiIIIIIiIi.IIIIiIiiIi.get()).intValue());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(String string, String string2) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IiIIIIIiIi iiIIIIIiIi = stringBuilder;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(IIiIiIiiIi.ALLATORIxDEMO("\u00e6\u000e&\u775a\u9594\u7287)x\u00d1<")).append((String)IiIIiIiiiI2).append(IiiiIIiiiI.ALLATORIxDEMO("0u\u008d\u0010")).append((String)IiIIiIiiiI);
        iiiiIiiiII.ALLATORIxDEMO(stringBuilder.toString());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1657 class_16572, double d) {
        IiIIIIIiIi iiIIIIIiIi = iiIIIIIiIi2;
        IiIIIIIiIi iiIIIIIiIi2 = class_16572;
        IiIIIIIiIi IiIIiIiiiI = iiIIIIIiIi;
        iiIIIIIiIi2.getGameProfile().getName();
        if (((Boolean)IiIIiIiiiI.iiiiiIIiiI.get()).booleanValue()) {
            IiIIiIiiiI.IiiIIIIiiI();
        }
        if (((Boolean)IiIIiIiiiI.iIIiiIIIII.get()).booleanValue()) {
            void IiIIiIiiiI2;
            IiIIiIiiiI.ALLATORIxDEMO((class_1657)iiIIIIIiIi2, (double)IiIIiIiiiI2, IiiiIIiiiI.ALLATORIxDEMO("\u8ff1\u5110\u976a\u8f84\u8329\u5681"));
        }
    }
}

