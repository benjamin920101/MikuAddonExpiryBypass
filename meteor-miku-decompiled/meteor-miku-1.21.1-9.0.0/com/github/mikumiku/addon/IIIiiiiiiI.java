/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.Vec3d
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiIIIIi;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiIIIIiIii;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.iiiiIiiiII;
import com.github.mikumiku.addon.modules.FastFall;
import java.util.Date;
import meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class IIIiiiiiiI
extends iiiiIiIiii {
    private final SettingGroup IiIIIIiiii;
    private boolean IiiIIIiiIi;
    private final Setting<Integer> iiIIiiIiii;
    private boolean iIiiIiiiII;
    private static final long iIIiiIIIII = 1000L;
    private int iiIiIIiIIi;
    private final Setting<Double> IIIIiIiiIi;
    private final Setting<FastFall.FallMode> IiIiIIIIiI;
    private final Setting<Boolean> iiiiiIIiiI;
    private final Setting<Double> iiIIIIiIII;
    private long IiIIiIiiiI;
    private final Setting<Boolean> ALLATORIxDEMO;

    public IIIiiiiiiI() {
        IIIiiiiiiI iIIiiiiiiI = this;
        super(IIIIiIIIIi.ALLATORIxDEMO("\u5faf\u9070\u4e05\u8418"), iiIIIIiIii.ALLATORIxDEMO("\u669e\u5f8b\u575a\u4e4b\u9607"));
        iIIiiiiiiI.IiIIIIiiii = iIIiiiiiiI.settings.getDefaultGroup();
        iIIiiiiiiI.iiIIIIiIII = iIIiiiiiiI.IiIIIIiiii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIIIiIIIIi.ALLATORIxDEMO("\u9ad6\u5e83"))).description(iiIIIIiIii.ALLATORIxDEMO("\u6760\u594d\u4e6b\u8457\u9a98\u5eec"))).defaultValue(3.0).min(1.0).max(10.0).sliderMin(1.0).sliderMax(10.0).build());
        this.IiIiIIIIiI = this.IiIIIIiiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIIIiIIIIi.ALLATORIxDEMO("\u6a2f\u5f2a"))).description(iiIIIIiIii.ALLATORIxDEMO("\u4e6b\u8457\u6a61\u5f45"))).defaultValue((Object)FastFall.FallMode.iiIIIIiIII)).build());
        this.ALLATORIxDEMO = this.IiIIIIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIiIIIIi.ALLATORIxDEMO("\u52ae\u903a"))).description(iiIIIIiIii.ALLATORIxDEMO("\u52c0\u9075\u4e6b\u8457\u905f\u5eec"))).defaultValue((Object)(3 >> 2))).visible(() -> {
            if (this.IiIiIIIIiI.get() == FastFall.FallMode.iiIIIIiIII) {
                return (2 ^ 3) != 0;
            }
            return false;
        })).build());
        this.iiIIiiIiii = this.IiIIIIiiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIIiIIIIi.ALLATORIxDEMO("\u500b\u7994\u5235\u6555"))).description(iiIIIIiIii.ALLATORIxDEMO("\u547b\u522d\u5025\u799b\u76ee\u527b\u653a"))).defaultValue((Object)(--3))).min(--1).sliderMax(--5).visible(() -> {
            if (this.IiIiIIIIiI.get() == FastFall.FallMode.ALLATORIxDEMO) {
                return 3 >> 1;
            }
            return false;
        })).build());
        this.iiiiiIIiiI = this.IiIIIIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIiIIIIi.ALLATORIxDEMO("\u963c\u8e07"))).description(iiIIIIiIii.ALLATORIxDEMO("\u9658\u6b02\u568a\u8fa7\u5f81\u4e6b\u8457\u88cb\u6767\u52c1\u5602\u8e62\u51b0"))).defaultValue((Object)(5 >> 2))).build());
        this.IIIIiIiiIi = this.IiIIIIiiii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIIIiIIIIi.ALLATORIxDEMO("\u6759\u5c7d\u4e4f\u8452\u8dd3\u799e"))).description(iiIIIIiIii.ALLATORIxDEMO("\u898c\u53b1\u5f81\u907f\u4e61\u845d\u76ee\u6760\u5c65\u8d9d\u79f1"))).defaultValue(0.5).min(0.1).max(2.0).sliderMin(0.1).sliderMax(2.0).build());
        IIIiiiiiiI iIIiiiiiiI2 = this;
        this.iIiiIiiiII = 5 >> 3;
        this.IiiIIIiiIi = 3 & 4;
        iIIiiiiiiI2.iiIiIIiIIi = this.IiiIIIiiIi;
        iIIiiiiiiI2.IiIIiIiiiI = 0L;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIIIiIIIIi.ALLATORIxDEMO("\t\u001e<\u0013*\u0017y\u0007)\u0016\u0018&i\u0006y\u8b85\u66aa\u65c5\u5269\u6772\u65f4\u7227\u6722\uff24"));
        }
    }

    @Override
    public void onActivate() {
        IIIiiiiiiI iIIiiiiiiI = this;
        super.onActivate();
        this.IiiIIIiiIi = 3 >> 2;
        iIIiiiiiiI.iiIiIIiIIi = 3 ^ 3;
        iIIiiiiiiI.iIiiIiiiII = this.iiIIIIiIII.player != null && this.iiIIIIiIII.player.isOnGround() ? 3 >> 1 : 0;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        IIIiiiiiiI iIIiiiiiiI = iIIiiiiiiI2;
        IIIiiiiiiI iIIiiiiiiI2 = post;
        IIIiiiiiiI IiIIiIiiiI = iIIiiiiiiI;
        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) {
            return;
        }
        IIIiiiiiiI iIIiiiiiiI3 = IiIIiIiiiI;
        iIIiiiiiiI3.iIiiIiiiII = iIIiiiiiiI3.iiIIIIiIII.player.isOnGround();
        if (iIIiiiiiiI3.IiIiIIIIiI.get() == FastFall.FallMode.iiIIIIiIII) {
            IiIIiIiiiI.ALLATORIxDEMO();
        }
    }

    public void onDeactivate() {
        IIIiiiiiiI iIIiiiiiiI = this;
        iIIiiiiiiI.IiiIIIiiIi = 5 >> 3;
        iIIiiiiiiI.iiIiIIiIIi = 5 >> 3;
    }

    private /* synthetic */ double ALLATORIxDEMO() {
        double d;
        IIIiiiiiiI iIIiiiiiiI = iIIiiiiiiI2;
        IIIiiiiiiI iIIiiiiiiI2 = iIIiiiiiiI.iiIIIIiIII.player.getBoundingBox();
        double d2 = d = 0.0;
        while (d2 < (Double)iIIiiiiiiI.iiIIIIiIII.get() + 0.5) {
            if (!iIIiiiiiiI.iiIIIIiIII.world.isSpaceEmpty((class_1297)iIIiiiiiiI.iiIIIIiIII.player, iIIiiiiiiI2.offset(0.0, -d, 0.0))) {
                return d;
            }
            d2 = d + 0.01;
        }
        return -1.0;
    }

    private /* synthetic */ boolean IiiIIIIiiI() {
        boolean bl;
        try {
            bl = false;
        } catch (Exception exception) {
            return (3 ^ 3) != 0;
        }
        return bl;
    }

    private /* synthetic */ boolean IiiiiiiIIi() {
        if (this.iiIIIIiIII.player == null) {
            return (3 & 4) != 0;
        }
        if (this.iiIIIIiIII.player.isRiding() || IiiiIiiIII.IiiiiiiIIi(this.iiIIIIiIII) || this.iiIIIIiIII.player.isClimbing() || this.iiIIIIiIII.player.isInLava() || this.iiIIIIiIII.player.isTouchingWater() || IiiiIiiIII.IiiIIIIiiI(this.iiIIIIiIII) || IiiiIiiIII.ALLATORIxDEMO(this.iiIIIIiIII)) {
            return false;
        }
        if (this.iiIIIIiIII.player.hasStatusEffect(class_1294.LEVITATION) || this.iiIIIIiIII.player.hasStatusEffect(class_1294.SLOW_FALLING)) {
            return false;
        }
        return true;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PlayerMoveEvent playerMoveEvent) {
        IIIiiiiiiI iIIiiiiiiI = iIIiiiiiiI2;
        IIIiiiiiiI iIIiiiiiiI2 = playerMoveEvent;
        IIIiiiiiiI IiIIiIiiiI = iIIiiiiiiI;
        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) {
            return;
        }
        if (IiIIiIiiiI.IiIiIIIIiI.get() == FastFall.FallMode.ALLATORIxDEMO) {
            iiiiIiiiII.ALLATORIxDEMO(iiIIIIiIii.ALLATORIxDEMO("\u6390\u7970\uff7a\u8b9d\u4e6d\u89eb\u4f1f\u7542\u8b85\u6a4b\u5f6f\uff66@\u6ccb\u51d9\u5bc6"));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IIIiiiiiiI iIIiiiiiiI = this_;
        if (!iIIiiiiiiI.IiiiiiiIIi()) {
            return;
        }
        if (iIIiiiiiiI.IiiIIIIiiI()) {
            return;
        }
        double d = iIIiiiiiiI.ALLATORIxDEMO();
        if (d < (Double)iIIiiiiiiI.IIIIiIiiIi.get() || d > (Double)iIIiiiiiiI.iiIIIIiIII.get()) {
            return;
        }
        if (!iIIiiiiiiI.iiIIIIiIII.player.isOnGround()) {
            return;
        }
        if (((Boolean)iIIiiiiiiI.iiiiiIIiiI.get()).booleanValue() && System.currentTimeMillis() - iIIiiiiiiI.IiIIiIiiiI < 1000L) {
            return;
        }
        IIIiiiiiiI iIIiiiiiiI2 = iIIiiiiiiI;
        IIIiiiiiiI this_ = iIIiiiiiiI2.iiIIIIiIII.player.getVelocity();
        iIIiiiiiiI2.iiIIIIiIII.player.setVelocity(((class_243)this_).x * 0.05, ((class_243)this_).y, ((class_243)this_).z * 0.05);
        d = (Boolean)iIIiiiiiiI2.ALLATORIxDEMO.get() != false ? ((class_243)this_).y - 0.62 : -3.0;
        iIIiiiiiiI.iiIIIIiIII.player.setVelocity(((class_243)this_).x * 0.05, d, ((class_243)this_).z * 0.05);
        iIIiiiiiiI.IiIIiIiiiI = System.currentTimeMillis();
    }
}

