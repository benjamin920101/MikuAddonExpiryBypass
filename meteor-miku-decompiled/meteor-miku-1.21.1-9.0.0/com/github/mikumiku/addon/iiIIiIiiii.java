/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.Vec3d
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiIIIIII;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiIIIIiIii;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class iiIIiIiiii
extends iiiiIiIiii {
    private final Setting<Double> IiIiIIIIiI;
    private final Setting<Boolean> iiiiiIIiiI;
    private final Setting<Boolean> iiIIIIiIII;
    private final SettingGroup IiIIiIiiiI;
    private final Setting<Double> ALLATORIxDEMO;

    public iiIIiIiiii() {
        iiIIiIiiii iiIIiIiiii2 = this;
        super(iiiiIiIiii.ALLATORIxDEMO, IIiiIIIIII.ALLATORIxDEMO("\u62f3\u65ce\u576d\u4e5a\u5ff9"), iiIIIIiIii.ALLATORIxDEMO("\u81c7\u52c0\u5c64\u73c4\u5bd1\u7996\u52cf\u5256\u65d5\u5730\u4e40\u5fe4\u4f60\u7f0eJH\u0012nym2N]lj\u001aDSG\u001aDWC"));
        iiIIiIiiii2.IiIIiIiiiI = iiIIiIiiii2.settings.getDefaultGroup();
        iiIIiIiiii2.IiIiIIIIiI = iiIIiIiiii2.IiIIiIiiiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u9068\u5e9c"))).description(iiIIIIiIii.ALLATORIxDEMO("\u79bb\u52e2\u5250\u65d3\u5737\u4e47\u5fa3\u76ee\u907f\u5ecc"))).defaultValue(0.2).min(0.01).max(1.0).sliderMin(0.01).sliderMax(1.0).build());
        this.iiIIIIiIII = this.IiIIiIiiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u4eb2\u5712\u5747\u9758"))).description(iiIIIIiIii.ALLATORIxDEMO("\u538a\u6763\u5768\u577a\u9702\u4e60\u6596\u6227\u818a\u52c2\u5c25\u4e47"))).defaultValue((Object)(--1 != 0))).build());
        this.iiiiiIIiiI = this.IiIIiIiiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u4faa\u633b.\u8f4e"))).description(iiIIIIiIii.ALLATORIxDEMO("\u7991\u52e8\u65bc\u4fbd\u636b9\u8f1e\u4f2d\u7f04\u4e6d\u53b2"))).defaultValue((Object)(3 >> 1))).build());
        this.ALLATORIxDEMO = this.IiIIiIiiiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u6777\u5c35\u5038\u79c1"))).description(iiIIIIiIii.ALLATORIxDEMO("\u898c\u5391\u5c0f\u4e4d\u76ee\u6760\u5c65\u502f\u7991\u8dbd\u79d1"))).defaultValue(0.01).min(0.001).max(0.2).sliderMin(0.001).sliderMax(0.2).build());
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiiIIIIII.ALLATORIxDEMO(" QU\u001c\u0004_WO'~6n\u0012\u001bw\u8bed\u6683\u658a\u5247\u673a\u65c7\u7272\u675b\uff3b"));
        }
    }

    private /* synthetic */ double ALLATORIxDEMO(double IiIIiIiiiI) {
        double d;
        double d2 = IiIIiIiiiI;
        double d3 = d2 - Math.floor(d2);
        if (d >= 0.3 && d3 <= 0.7) {
            return Math.floor(IiIIiIiiiI) + 0.5;
        }
        if (d3 < 0.3) {
            return Math.floor(IiIIiIiiiI) + 0.5;
        }
        return Math.floor(IiIIiIiiiI) + 0.5;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        double d;
        iiIIiIiiii iiIIiIiiii2 = iiIIiIiiii3;
        iiIIiIiiii iiIIiIiiii3 = pre;
        iiIIiIiiii IiIIiIiiiI = iiIIiIiiii2;
        if (IiIIiIiiiI.iiIIIIiIII.player == null) {
            return;
        }
        if (((Boolean)IiIIiIiiiI.iiIIIIiIII.get()).booleanValue() && !IiIIiIiiiI.iiIIIIiIII.player.isOnGround()) {
            IiIIiIiiiI.toggle();
            return;
        }
        if (IiIIiIiiiI.ALLATORIxDEMO()) {
            IiIIiIiiiI.toggle();
            return;
        }
        iiIIiIiiii iiIIiIiiii4 = IiIIiIiiiI;
        iiIIiIiiii3 = IiiiIiiIII.ALLATORIxDEMO((class_1297)iiIIiIiiii4.iiIIIIiIII.player);
        double d2 = ((class_243)iiIIiIiiii3).x;
        double d3 = ((class_243)iiIIiIiiii3).z;
        double d4 = ((class_243)iiIIiIiiii3).y;
        double d5 = iiIIiIiiii4.ALLATORIxDEMO(d2);
        double d6 = iiIIiIiiii4.ALLATORIxDEMO(d3);
        double d7 = d5 -= d2;
        double d8 = d6 -= d3;
        double d9 = Math.sqrt(d7 * d7 + d8 * d8);
        if (d < (Double)IiIIiIiiiI.ALLATORIxDEMO.get()) {
            IiIIiIiiiI.toggle();
            return;
        }
        double d10 = Math.min((Double)IiIIiIiiiI.IiIiIIIIiI.get(), d9);
        d5 = d5 / d9 * d10;
        d6 = d6 / d9 * d10;
        iiIIiIiiii iiIIiIiiii5 = IiIIiIiiiI;
        if (((Boolean)IiIIiIiiiI.iiiiiIIiiI.get()).booleanValue()) {
            iiIIiIiiii5.iiIIIIiIII.player.setPosition(d2 + d5, d4, d3 + d6);
            return;
        }
        iiIIiIiiii5.iiIIIIiIII.player.setPosition(d2 + d5, ((class_243)iiIIiIiiii3).y, d3 + d6);
    }

    private /* synthetic */ boolean ALLATORIxDEMO(double IiIIiIiiiI) {
        double d;
        double d2 = IiIIiIiiiI;
        IiIIiIiiiI = d2 - Math.floor(d2);
        if (d >= 0.3 && IiIIiIiiiI <= 0.7) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    public boolean ALLATORIxDEMO() {
        iiIIiIiiii iiIIiIiiii2 = iiIIiIiiii4;
        if (iiIIiIiiii2.iiIIIIiIII.player == null) {
            return (2 & 5) != 0;
        }
        iiIIiIiiii iiIIiIiiii3 = iiIIiIiiii2;
        iiIIiIiiii iiIIiIiiii4 = iiIIiIiiii3.iiIIIIiIII.player.getPos();
        if (iiIIiIiiii3.ALLATORIxDEMO(((class_243)iiIIiIiiii4).x) && iiIIiIiiii2.ALLATORIxDEMO(((class_243)iiIIiIiiii4).z)) {
            return 5 >> 2;
        }
        return false;
    }
}

