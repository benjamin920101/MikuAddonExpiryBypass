/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent
 *  meteordevelopment.meteorclient.events.world.PlaySoundEvent
 *  meteordevelopment.meteorclient.mixininterface.IVec3d
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIIIIiiI;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.mixinface.MoveEvent;
import com.github.mikumiku.addon.modules.ElytraFlyPlus;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent;
import meteordevelopment.meteorclient.events.world.PlaySoundEvent;
import meteordevelopment.meteorclient.mixininterface.IVec3d;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;

public class iiIIiIIIII
extends iiiiIiIiii {
    private final Setting<Double> IIIiIIIiII;
    private float iiIiIiiiiI;
    private float IIiiIiiiII;
    private final Setting<Boolean> IIIiIiiIIi;
    private final Setting<ElytraFlyPlus.Mode> iiiIiIiIIi;
    private final Setting<Double> iIiIiIiIii;
    private final Setting<Boolean> iiiiiIIIii;
    private final SettingGroup iIIiIIiiII;
    private final Setting<Double> IiiIIiiiiI;
    private final SettingGroup IiIIIIiiii;
    private final Setting<Double> IiiIIIiiIi;
    private final Setting<Double> iiIIiiIiii;
    private final Setting<Double> iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private final Setting<Boolean> iiIiIIiIIi;
    private final Setting<Double> IIIIiIiiIi;
    private final Setting<Double> IiIiIIIIiI;
    private int iiiiiIIiiI;
    private float iiIIIIiIII;
    private boolean IiIIiIiiiI;
    private double ALLATORIxDEMO;

    public iiIIiIIIII() {
        iiIIiIIIII iiIIiIIIII2 = this;
        super(MoveEvent.ALLATORIxDEMO("\u97f8\u7fa2\u5e13\u98b9"), IiiIIIIiiI.ALLATORIxDEMO("\u66a1\u590e\u63f5\u5225\u97cd\u7fcb\u65f1\u6c91\u3000"));
        iiIIiIIIII2.IiIIIIiiii = iiIIiIIIII2.settings.getDefaultGroup();
        iiIIiIIIII2.iIIiIIiiII = iiIIiIIIII2.settings.createGroup(MoveEvent.ALLATORIxDEMO("\u907f\u5ec1"));
        iiIIiIIIII2.iiiIiIiIIi = iiIIiIIIII2.IiIIIIiiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u6a65\u5f0d"))).description(MoveEvent.ALLATORIxDEMO("\u9069\u628e\u98be\u882b\u6a41\u5f68"))).defaultValue((Object)ElytraFlyPlus.Mode.IiIiIIIIiI)).build());
        this.iiiiiIIIii = this.IiIIIIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u6c3a\u4e65\u5018\u752a"))).description(MoveEvent.ALLATORIxDEMO("\u576f\u6c54\u4e4a\u4e6d\u4f89\u6559\u799c\u52c8\u65de\u5f6f\u3065"))).defaultValue((Object)(5 >> 2))).build());
        this.iiIiIIiIIi = this.IiIIIIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u5cfc\u6d48\u4e65\u5018\u752a"))).description(MoveEvent.ALLATORIxDEMO("\u5768\u5cee\u6d26\u4e4a\u4e6d\u4f89\u6559\u799c\u52c8\u65de\u5f6f\u3065"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iiIIiiIiii = this.iIIiIIiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u6c3a\u5e3b\u905b\u5ea4"))).description(MoveEvent.ALLATORIxDEMO("\u6ba84.\u0003\f\u6c54\u5e14\u799b\u52cf\u597a\u5c76\u685c\u3065"))).defaultValue(1.0).min(0.0).sliderRange(0.0, 5.0).visible(() -> {
            if (this.iiiIiIiIIi.get() == ElytraFlyPlus.Mode.IiIiIIIIiI) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        this.IIIIiIiiIi = this.iIIiIIiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u4e04\u530f\u905b\u5ea4"))).description(MoveEvent.ALLATORIxDEMO("\u6b88\u4e4a\u525c\u5471\u4e6d\u799b\u52cf\u597a\u5c76\u685c\u3065"))).defaultValue(1.0).min(0.0).sliderRange(0.0, 5.0).visible(() -> {
            if (this.iiiIiIiIIi.get() == ElytraFlyPlus.Mode.IiIiIIIIiI) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.IiiIIiiiiI = this.iIIiIIiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u905b\u5ea4"))).description(MoveEvent.ALLATORIxDEMO("\u6ba8\u4e4a\u525c\u799b\u52cf\u597a\u5c76\u685c\u3065"))).defaultValue(1.0).min(0.0).sliderRange(0.0, 5.0).visible(() -> {
            if (this.iiiIiIiIIi.get() == ElytraFlyPlus.Mode.ALLATORIxDEMO) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iIiIiIiIii = this.iIIiIIiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u4e04\u530f\u5049\u7385"))).description(MoveEvent.ALLATORIxDEMO("\u4e6d\u5327\u6591\u52c0\u5f8c\u597a\u5c76\u506d\u3065"))).defaultValue(1.0).min(0.0).sliderRange(0.0, 5.0).visible(() -> {
            if (this.iiiIiIiIIi.get() == ElytraFlyPlus.Mode.ALLATORIxDEMO) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.IIIiIIIiII = this.iIIiIIiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u4e05\u9605\u905b\u5ea4"))).description(MoveEvent.ALLATORIxDEMO("\u6b88\u4e4a\u525c\u5471\u4e6c\u799b\u52cf\u597a\u5c76\u685c\u3065"))).defaultValue(1.0).min(0.0).sliderRange(0.0, 5.0).visible(() -> {
            if (this.iiiIiIiIIi.get() == ElytraFlyPlus.Mode.ALLATORIxDEMO || this.iiiIiIiIIi.get() == ElytraFlyPlus.Mode.IiIiIIIIiI) {
                return true;
            }
            return false;
        })).build());
        this.iIIiiIIIII = this.iIIiIIiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u6674\u80b5\u4e4f\u843f"))).description(MoveEvent.ALLATORIxDEMO("\u53ad\u6769\u574f\u4f2e\u5953\u6596\u622a\u4f7a\u4e6c\u962d\u3065"))).defaultValue((Object)(--1 != 0))).visible(() -> {
            if (this.iiiIiIiIIi.get() == ElytraFlyPlus.Mode.IiIiIIIIiI) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.IiiIIIiiIi = this.iIIiIIiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u4e05\u8475\u905b\u5ea4"))).description(MoveEvent.ALLATORIxDEMO("\u6ba8\u4e4a\u525c\u4e6b\u845a\u597a\u5c76\u685c\u3065"))).defaultValue(0.01).min(0.0).sliderRange(0.0, 1.0).visible(() -> {
            if (this.iiiIiIiIIi.get() == ElytraFlyPlus.Mode.ALLATORIxDEMO || this.iiiIiIiIIi.get() == ElytraFlyPlus.Mode.IiIiIIIIiI) {
                return true;
            }
            return false;
        })).build());
        this.IiIiIIIIiI = this.iIIiIIiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u6041\u904a\u98d0\u8804\u905b\u5ea4"))).description(MoveEvent.ALLATORIxDEMO("\u5768'C/)33\u0001\t\u0014\u000e!*@\u6a46\u5f6f\u4e6c\u76e4\u6767\u5947\u9078\u5ec6\u3065"))).defaultValue(1.0).min(0.0).sliderRange(0.0, 5.0).visible(() -> {
            if (this.iiiIiIiIIi.get() == ElytraFlyPlus.Mode.iiiiiIIiiI) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.iIiiIiiiII = this.iIIiIIiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u6007\u9011\u52e8\u905b\u5ea4"))).description(MoveEvent.ALLATORIxDEMO("\u576f`Do.44&\u000e\u0013\t\u0006-g\u6a41\u5f68\u4e6b\u76e3\u6760\u5940\u52c0\u9078\u5ec6\u3065"))).defaultValue(1.0).min(0.0).sliderRange(0.0, 5.0).visible(() -> {
            if (this.iiiIiIiIIi.get() == ElytraFlyPlus.Mode.iiiiiIIiiI) {
                return 5 >> 2;
            }
            return false;
        })).build());
        this.IIIiIiiIIi = this.iIIiIIiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u605c\u9057\u5018\u752a"))).description(MoveEvent.ALLATORIxDEMO("\u576f\u6cc1\u676e\u8ff3\u5102\u6596\u503b\u6b02\u799c\u52c8\u3065"))).defaultValue((Object)((3 & 5) != 0))).visible(() -> {
            if (this.iiiIiIiIIi.get() == ElytraFlyPlus.Mode.iiiiiIIiiI) {
                return --1 != 0;
            }
            return false;
        })).build());
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiIIIIiiI.ALLATORIxDEMO("C9V\u0014@\u0010\u0013\u0000C\u0011R\u0001#!3\u8ba2\u66e0\u65e2\u5223\u6755\u65be\u7200\u6768\uff03"));
        }
    }

    private /* synthetic */ class_243 ALLATORIxDEMO(class_243 class_2432) {
        iiIIiIIIII iiIIiIIIII2 = iiIIiIIIII3;
        iiIIiIIIII iiIIiIIIII3 = class_2432;
        iiIIiIIIII IiIIiIiiiI = iiIIiIIIII2;
        if (IiiiIiiIII.IiiiiiiIIi(IiIIiIiiiI.iiIIIIiIII.player.input) == 0.0f) {
            if (((Boolean)IiIIiIiiiI.IIIiIiiIIi.get()).booleanValue()) {
                return new class_243(0.0, 0.0, 0.0);
            }
            return null;
        }
        int n = IiiiIiiIII.IiiiiiiIIi(IiIIiIiiiI.iiIIIIiIII.player.input) > 0.0f ? --1 : 0;
        double d = Math.toRadians(IiIIiIiiiI.iiIIIIiIII.player.getYaw() + (float)(n != 0 ? 0x7F & 0x5A : -90));
        double d2 = Math.cos(d);
        d = Math.sin(d);
        iiIIiIIIII iiIIiIIIII4 = iiIIiIIIII3;
        double d3 = IiIIiIiiiI.ALLATORIxDEMO(((class_243)iiIIiIIIII4).x, ((class_243)iiIIiIIIII3).z, d2, d);
        double d4 = Math.clamp(class_3532.getLerpProgress((double)iiIIiIIIII4.horizontalLength(), (double)0.0, (double)0.5), 0.0, 1.0);
        d3 = Math.min(d3, (Double)IiIIiIiiiI.iIiiIiiiII.get() / 20.0 * (0.1 + d4 * 0.9));
        return new class_243(iiIIiIIIII3.getX() + d2 * d3, iiIIiIIIII3.getY(), iiIIiIIIII3.getZ() + d * d3);
    }

    private /* synthetic */ void IiiiiiiIIi() {
        iiIIiIIIII iiIIiIIIII2;
        iiIIiIIIII iiIIiIIIII3 = iiIIiIIIII2 = this;
        float f = iiIIiIIIII3.iiIIIIiIII.player.getYaw();
        float f2 = IiiiIiiIII.IiiiiiiIIi(iiIIiIIIII3.iiIIIIiIII.player.input);
        float f3 = IiiiIiiIII.ALLATORIxDEMO(iiIIiIIIII3.iiIIIIiIII.player.input);
        if (f2 > 0.0f) {
            iiIIiIIIII2.IiIIiIiiiI = 2 ^ 3;
            f += f3 > 0.0f ? -45.0f : (f3 < 0.0f ? 45.0f : 0.0f);
            v1 = iiIIiIIIII2;
        } else if (f2 < 0.0f) {
            iiIIiIIIII2.IiIIiIiiiI = 4 ^ 5;
            f += f3 > 0.0f ? -135.0f : (f3 < 0.0f ? 135.0f : 180.0f);
            v1 = iiIIiIIIII2;
        } else {
            iiIIiIIIII2.IiIIiIiiiI = f3 != 0.0f ? --1 : 0;
            f += f3 > 0.0f ? -90.0f : (f3 < 0.0f ? 90.0f : 0.0f);
            v1 = iiIIiIIIII2;
        }
        v1.iiIiIiiiiI = f;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiIiiiiiII(PlayerMoveEvent playerMoveEvent) {
        iiIIiIIIII iiIIiIIIII2;
        iiIIiIIIII iiIIiIIIII3 = iiIIiIIIII2 = iiIIiIIIII4;
        iiIIiIIIII iiIIiIIIII4 = iiIIiIIIII3.ALLATORIxDEMO(iiIIiIIIII3.iiIIIIiIII.player.getVelocity());
        if (iiIIiIIIII4 != null) {
            void IiIIiIiiiI;
            IiiiIiiIII.ALLATORIxDEMO((IVec3d)IiIIiIiiiI.movement, iiIIiIIIII4.getX(), iiIIiIIIII4.getY(), iiIIiIIIII4.getZ());
            IiIIiIiiiI.movement = iiIIiIIIII4;
        }
    }

    private /* synthetic */ double ALLATORIxDEMO(double IiIIiIiiiI, double IiIIiIiiiI2, double IiIIiIiiiI3, double IiIIiIiiiI4) {
        double d = IiIIiIiiiI3;
        double d2 = IiIIiIiiiI4;
        double d3 = d * d + d2 * d2;
        double d4 = IiIIiIiiiI3;
        double d5 = IiIIiIiiiI4;
        return (Math.sqrt(d3 * (Double)this.IiIiIIIIiI.get() * (Double)this.IiIiIIIIiI.get() - d4 * d4 * IiIIiIiiiI2 * IiIIiIiiiI2 - d5 * d5 * IiIIiIiiiI * IiIIiIiiiI + 2.0 * IiIIiIiiiI3 * IiIIiIiiiI4 * IiIIiIiiiI * IiIIiIiiiI2) - IiIIiIiiiI3 * IiIIiIiiiI - IiIIiIiiiI4 * IiIIiIiiiI2) / d3;
    }

    public boolean iIIiiiIiiI() {
        if (((Boolean)this.iiiiiIIIii.get()).booleanValue() && this.iiIIIIiIII.player.isTouchingWater()) {
            this.iiiiiIIiiI = 3 >> 2;
            return this.iiiiiIIiiI != 0;
        }
        if (((Boolean)this.iiIiIIiIIi.get()).booleanValue() && this.iiIIIIiIII.player.isInLava()) {
            this.iiiiiIIiiI = 3 >> 2;
            return this.iiiiiIIiiI != 0;
        }
        return IiiiIiiIII.IiiiiiiIIi((class_310)this.iiIIIIiIII);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iiIIiIIIII iiIIiIIIII2;
        iiIIiIIIII iiIIiIIIII3 = iiIIiIIIII2 = this;
        float f = iiIIiIIIII3.iiIIIIiIII.player.getYaw();
        float f2 = IiiiIiiIII.IiiiiiiIIi(iiIIiIIIII3.iiIIIIiIII.player.input);
        float f3 = IiiiIiiIII.ALLATORIxDEMO(iiIIiIIIII3.iiIIIIiIII.player.input);
        if (f2 > 0.0f) {
            iiIIiIIIII2.IiIIiIiiiI = --1;
            f += f3 > 0.0f ? -45.0f : (f3 < 0.0f ? 45.0f : 0.0f);
            v1 = iiIIiIIIII2;
        } else if (f2 < 0.0f) {
            iiIIiIIIII2.IiIIiIiiiI = 3 & 5;
            f += f3 > 0.0f ? -135.0f : (f3 < 0.0f ? 135.0f : 180.0f);
            v1 = iiIIiIIIII2;
        } else {
            iiIIiIIIII2.IiIIiIiiiI = f3 != 0.0f ? 4 ^ 5 : 0;
            f += f3 > 0.0f ? -90.0f : (f3 < 0.0f ? 90.0f : 0.0f);
            v1 = iiIIiIIIII2;
        }
        v1.iiIiIiiiiI = f;
    }

    private /* synthetic */ void IiiIIIIiiI(PlayerMoveEvent playerMoveEvent) {
        iiIIiIIIII iiIIiIIIII2 = iiIIiIIIII3;
        iiIIiIIIII iiIIiIIIII3 = playerMoveEvent;
        iiIIiIIIII IiIIiIiiiI = iiIIiIIIII2;
        if (IiiiIiiIII.IiiiiiiIIi((class_310)IiIIiIiiiI.iiIIIIiIII)) {
            double d;
            iiIIiIIIII iiIIiIIIII4 = IiIIiIiiiI;
            iiIIiIIIII4.ALLATORIxDEMO();
            iiIIiIIIII4.IIiiIiiiII = iiIIiIIIII4.iiIIIIiIII.player.getPitch();
            double d2 = Math.cos(Math.toRadians(iiIIiIIIII4.iiIiIiiiiI + 90.0f));
            double d3 = Math.sin(Math.toRadians(iiIIiIIIII4.iiIiIiiiiI + 90.0f));
            double d4 = iiIIiIIIII4.IiIIiIiiiI ? d2 * (Double)IiIIiIiiiI.iiIIiiIiii.get() : 0.0;
            d2 = -((Double)IiIIiIiiiI.IiiIIIiiIi.get()).doubleValue();
            double d5 = d = IiIIiIiiiI.IiIIiIiiiI ? d3 * (Double)IiIIiIiiiI.iiIIiiIiii.get() : 0.0;
            if (((Boolean)IiIIiIiiiI.iIIiiIIIII.get()).booleanValue()) {
                d2 *= Math.abs(Math.sin(Math.toRadians(IiIIiIiiiI.IIiiIiiiII)));
            }
            if (IiIIiIiiiI.iiIIIIiIII.options.sneakKey.isPressed() && !IiIIiIiiiI.iiIIIIiIII.options.jumpKey.isPressed()) {
                d2 = -((Double)IiIIiIiiiI.IIIiIIIiII.get()).doubleValue();
            }
            if (!IiIIiIiiiI.iiIIIIiIII.options.sneakKey.isPressed() && IiIIiIiiiI.iiIIIIiIII.options.jumpKey.isPressed()) {
                d2 = (Double)IiIIiIiiiI.IIIIiIiiIi.get();
            }
            IiiiIiiIII.ALLATORIxDEMO((IVec3d)((PlayerMoveEvent)iiIIiIIIII3).movement, d4, d2, d);
            IiIIiIiiiI.iiIIIIiIII.player.setVelocity(0.0, 0.0, 0.0);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler(priority=200)
    private /* synthetic */ void IiiiiiiIIi(PlayerMoveEvent playerMoveEvent) {
        iiIIiIIIII iiIIiIIIII2 = iiIIiIIIII3;
        iiIIiIIIII iiIIiIIIII3 = playerMoveEvent;
        iiIIiIIIII IiIIiIiiiI = iiIIiIIIII2;
        if (!IiIIiIiiiI.iIIiiiIiiI()) return;
        iiIIiIIIII iiIIiIIIII4 = IiIIiIiiiI;
        iiIIiIIIII4.iiiiiIIiiI += 4 ^ 5;
        if (iiIIiIIIII4.iiiiiIIiiI < --5) return;
        switch (((ElytraFlyPlus.Mode)((Object)IiIIiIiiiI.iiiIiIiIIi.get())).ordinal()) {
            case 0: {
                IiIIiIiiiI.IiiIIIIiiI((PlayerMoveEvent)iiIIiIIIII3);
                return;
            }
            case 1: {
                IiIIiIiiiI.ALLATORIxDEMO((PlayerMoveEvent)iiIIiIIIII3);
                return;
            }
            case 2: {
                IiIIiIiiiI.iiIiiiiiII((PlayerMoveEvent)iiIIiIIIII3);
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PlaySoundEvent playSoundEvent) {
        iiIIiIIIII iiIIiIIIII2 = iterator;
        Iterator<class_2960> iterator = List.of(class_2960.of((String)MoveEvent.ALLATORIxDEMO("ji&*.8,,2{.4bmn&2*\u000f\u0015N\u000212\t\u0017?\u0000\u0005\t\u0005\u0015\t\u0004")), class_2960.of((String)IiiIIIIiiI.ALLATORIxDEMO("^\u001c]\u0010P\u0007R\u0013GOR\tS\u001d\u0018\u0011I\u0010A\u001a\u001b\u0016Y\u001bZ\u0005]*[\fW\u001cE\u0018A\u0016")), class_2960.of((String)MoveEvent.ALLATORIxDEMO("m!!()?+ 5})se-i!5\r\b\u0012I%6\u0015\u000e\u00108\u0005\u000b\u0019\u0013\u0012\u0006")), class_2960.of((String)IiiIIIIiiI.ALLATORIxDEMO("^\u001c]\u0010P\u0007R\u0013OG_\u0004S\u001d\u0015\u001c\\\u0005Z\u0001\u0006\u000bB\u0000k4a\u001cV\u0018Z\u001e[\u0017")), class_2960.of((String)MoveEvent.ALLATORIxDEMO("\"$$()4 !4=i4\"-i\u0001\u0015\r\b2i\u0005\u0016\u0015\u000e\u00108\u0007\b\f\u0003")), class_2960.of((String)IiiIIIIiiI.ALLATORIxDEMO("\u0018Z\u001bV\u0016I\u001cP\u0004\f\u0019O\u0018CFT\u0001E\u0001A[g5K\u0011O&^\u0003Z\u001d")), class_2960.of((String)MoveEvent.ALLATORIxDEMO("%&#/.8''3znt%*n&\u0012\n\u000f\u0015n\"\u0011\u0012\t\u0017?\u0004\b\u0006\t\t")), class_2960.of((String)IiiIIIIiiI.ALLATORIxDEMO("^\u001c]\u0010P\u0007R\u0013OG_\u0004S\u001d\u0015\u001c\\\u0005Z\u0001\u0006\u000bB\u0000k4a\u0014Z\u0018C\u0019P\u0001")), class_2960.of((String)MoveEvent.ALLATORIxDEMO(" #($$2ff4})3\u0005\nN\u0002,>\u0014\u0015\u0001I\u0006\u000b\u0019\u000e\u000e\u0000"))).iterator();
        while (iterator.hasNext()) {
            void IiIIiIiiiI;
            if (!((class_2960)iterator.next()).equals((Object)IiIIiIiiiI.sound.getId())) continue;
            IiIIiIiiiI.cancel();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(PlayerMoveEvent playerMoveEvent) {
        iiIIiIIIII iiIIiIIIII2 = this;
        if (IiiiIiiIII.IiiiiiiIIi((class_310)iiIIiIIIII2.iiIIIIiIII)) {
            void IiIIiIiiiI;
            iiIIiIIIII2.IiiiiiiIIi();
            iiIIiIIIII2.IIiiIiiiII = 0.0f;
            int n = 3 ^ 3;
            if (!iiIIiIIIII2.iiIIIIiIII.options.sneakKey.isPressed() && iiIIiIIIII2.iiIIIIiIII.options.jumpKey.isPressed() && iiIIiIIIII2.ALLATORIxDEMO > (Double)iiIIiIIIII2.IiiIIiiiiI.get() * 0.4) {
                v0 = iiIIiIIIII2;
                iiIIiIIIII iiIIiIIIII3 = iiIIiIIIII2;
                iiIIiIIIII3.iiIIIIiIII = (float)Math.min((double)iiIIiIIIII3.iiIIIIiIII + 0.1 * (double)(1.0f - iiIIiIIIII2.iiIIIIiIII) * (double)(1.0f - iiIIiIIIII2.iiIIIIiIII) * (double)(1.0f - iiIIiIIIII2.iiIIIIiIII), 1.0);
                iiIIiIIIII2.IIiiIiiiII = Math.max(Math.max(iiIIiIIIII3.iiIIIIiIII, 0.0f) * -90.0f, -90.0f);
                n = --1;
                iiIIiIIIII2.IiIIiIiiiI = 2 & 5;
            } else {
                iiIIiIIIII2.ALLATORIxDEMO = (Double)iiIIiIIIII2.IiiIIiiiiI.get();
                v0 = iiIIiIIIII2;
                iiIIiIIIII2.iiIIIIiIII = -0.2f;
            }
            iiIIiIIIII iiIIiIIIII4 = iiIIiIIIII2;
            v0.ALLATORIxDEMO = iiIIiIIIII2.IiIIiIiiiI ? (Double)iiIIiIIIII4.IiiIIiiiiI.get() : Math.min(iiIIiIIIII4.ALLATORIxDEMO + Math.sin(Math.toRadians(iiIIiIIIII2.IIiiIiiiII)) * 0.08, (Double)iiIIiIIIII2.IiiIIiiiiI.get());
            iiIIiIIIII iiIIiIIIII5 = iiIIiIIIII2;
            double d = Math.cos(Math.toRadians(iiIIiIIIII5.iiIiIiiiiI + 90.0f));
            double d2 = Math.sin(Math.toRadians(iiIIiIIIII5.iiIiIiiiiI + 90.0f));
            double d3 = iiIIiIIIII5.IiIIiIiiiI && n == 0 ? d * (Double)iiIIiIIIII2.IiiIIiiiiI.get() : (n != 0 ? iiIIiIIIII2.ALLATORIxDEMO * Math.cos(Math.toRadians(iiIIiIIIII2.IIiiIiiiII)) * d : 0.0);
            iiIIiIIIII iiIIiIIIII6 = iiIIiIIIII2;
            double d4 = d = iiIIiIIIII2.IIiiIiiiII < 0.0f ? iiIIiIIIII6.ALLATORIxDEMO * (Double)iiIIiIIIII2.iIiIiIiIii.get() * -Math.sin(Math.toRadians(iiIIiIIIII2.IIiiIiiiII)) * iiIIiIIIII2.ALLATORIxDEMO : -((Double)iiIIiIIIII6.IiiIIIiiIi.get()).doubleValue();
            double d5 = iiIIiIIIII2.IiIIiIiiiI && n == 0 ? d2 * (Double)iiIIiIIIII2.IiiIIiiiiI.get() : (n != 0 ? iiIIiIIIII2.ALLATORIxDEMO * Math.cos(Math.toRadians(iiIIiIIIII2.IIiiIiiiII)) * d2 : 0.0);
            iiIIiIIIII iiIIiIIIII7 = iiIIiIIIII2;
            d *= Math.abs(Math.sin(Math.toRadians(n != 0 ? (double)iiIIiIIIII7.IIiiIiiiII : (double)iiIIiIIIII7.iiIIIIiIII.player.getPitch())));
            if (iiIIiIIIII2.iiIIIIiIII.options.sneakKey.isPressed() && !iiIIiIIIII2.iiIIIIiIII.options.jumpKey.isPressed()) {
                d = -((Double)iiIIiIIIII2.IIIiIIIiII.get()).doubleValue();
            }
            IiiiIiiIII.ALLATORIxDEMO((IVec3d)IiIIiIiiiI.movement, d3, d, d5);
            iiIIiIIIII2.iiIIIIiIII.player.setVelocity(0.0, 0.0, 0.0);
        }
    }
}

