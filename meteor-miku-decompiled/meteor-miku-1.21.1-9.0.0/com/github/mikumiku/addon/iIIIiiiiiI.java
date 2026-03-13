/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent
 *  meteordevelopment.meteorclient.mixininterface.IVec3d
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.misc.input.Input
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIIIiiiiII;
import com.github.mikumiku.addon.iIIiiiIiii;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.Date;
import meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent;
import meteordevelopment.meteorclient.mixininterface.IVec3d;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.misc.input.Input;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;

public class iIIIiiiiiI
extends iiiiIiIiii {
    private final Setting<Boolean> IiIiIIIIiI;
    private final Setting<Boolean> iiiiiIIiiI;
    private final SettingGroup iiIIIIiIII;
    private final Setting<Boolean> IiIIiIiiiI;
    private final Setting<Double> ALLATORIxDEMO;

    public iIIIiiiiiI() {
        iIIIiiiiiI iIIIiiiiiI2 = this;
        super(iIIIiiiiII.ALLATORIxDEMO("\u60e4\u5013"), iIIiiiIiii.ALLATORIxDEMO("\u5101\u8b97\u739c\u5bcc\u5748\u7a07\u4e4a\u4fa7\u6361\u4f2a\u7f13\u4e20\u53ef"));
        iIIIiiiiiI2.iiIIIIiIII = iIIIiiiiiI2.settings.getDefaultGroup();
        iIIIiiiiiI2.ALLATORIxDEMO = iIIIiiiiiI2.iiIIIIiIII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iIIIiiiiII.ALLATORIxDEMO("\u60c4\u5033\u9057\u5ee9"))).description(iIIiiiIiii.ALLATORIxDEMO("\u60d1\u503b\u658c\u76e4\u799c\u52d5\u9032\u5e91"))).defaultValue(0.1).min(0.01).sliderRange(0.01, 1.0).build());
        this.IiIIiIiiiI = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIiiiiII.ALLATORIxDEMO("\u5758\u970d\u79c9\u7567"))).description(iIIiiiIiii.ALLATORIxDEMO("\u5707\u739c\u5bcc\u63c5\u899b\u5757\u9718\u6596\u79e6\u7555\u6081\u506b"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.IiIiIIIIiI = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIiiiiII.ALLATORIxDEMO("\u8182\u52c7\u97d0\u7f8a"))).description(iIIiiiIiii.ALLATORIxDEMO("\u818a\u52f2\u6f80\u6d14\u97ad\u7fbf\u98be\u8831\u4e82\u4fa7\u6361\u60cb\u5021\u729b\u6036"))).defaultValue((Object)(--1 != 0))).build());
        this.iiiiiIIiiI = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIiiiiII.ALLATORIxDEMO("\u7994\u52c0\u6599\u66ca\u5013"))).description(iIIiiiIiii.ALLATORIxDEMO("\u5f29\u73c9\u5bcb\u799c\u52d2\u6596\u66e5\u5021\u6081\u506b"))).defaultValue((Object)(--1 != 0))).build());
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIIIiiiiII.ALLATORIxDEMO("?\u0004JI\u001b\nh:8+);\rNH\u8b98\u669c\u65df\u5258\u676f\u65d8\u7227\u6764\uff4e"));
        }
    }

    public boolean ALLATORIxDEMO() {
        iIIIiiiiiI iIIIiiiiiI2 = this;
        boolean bl = Input.isPressed((class_304)iIIIiiiiiI2.iiIIIIiIII.options.forwardKey) || Input.isPressed((class_304)iIIIiiiiiI2.iiIIIIiIII.options.backKey) || Input.isPressed((class_304)iIIIiiiiiI2.iiIIIIiIII.options.leftKey) || Input.isPressed((class_304)iIIIiiiiiI2.iiIIIIiIII.options.rightKey) || Input.isPressed((class_304)iIIIiiiiiI2.iiIIIIiIII.options.jumpKey) || Input.isPressed((class_304)iIIIiiiiiI2.iiIIIIiIII.options.sneakKey);
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PlayerMoveEvent playerMoveEvent) {
        iIIIiiiiiI iIIIiiiiiI2 = this;
        if (iIIIiiiiiI2.iiIIIIiIII.player == null || iIIIiiiiiI2.iiIIIIiIII.world == null) {
            return;
        }
        if (((Boolean)iIIIiiiiiI2.IiIIiIiiiI.get()).booleanValue() && iIIIiiiiiI2.iiIIIIiIII.player.isOnGround()) {
            return;
        }
        if (((Boolean)iIIIiiiiiI2.IiIiIIIIiI.get()).booleanValue() && !IiiiIiiIII.IiiiiiiIIi((class_310)iIIIiiiiiI2.iiIIIIiIII) && !iIIIiiiiiI2.iiIIIIiIII.player.isOnGround()) {
            iIIIiiiiiI2.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)new class_2848((class_1297)iIIIiiiiiI2.iiIIIIiIII.player, class_2848.class_2849.START_FALL_FLYING));
        }
        if (IiiiIiiIII.IiiiiiiIIi((class_310)iIIIiiiiiI2.iiIIIIiIII)) {
            void v2;
            class_243 IiIIiIiiiI;
            iIIIiiiiiI iIIIiiiiiI3 = iIIIiiiiiI2;
            float f = IiiiIiiIII.IiiiiiiIIi(iIIIiiiiiI3.iiIIIIiIII.player.input);
            float f2 = IiiiIiiIII.ALLATORIxDEMO(iIIIiiiiiI3.iiIIIIiIII.player.input);
            float f3 = iIIIiiiiiI3.iiIIIIiIII.player.getYaw();
            double d = Math.cos(Math.toRadians(f3 + 90.0f));
            double d2 = Math.sin(Math.toRadians(f3 + 90.0f));
            double d3 = ((double)f * d + (double)f2 * d2) * (Double)iIIIiiiiiI2.ALLATORIxDEMO.get();
            d = ((double)f * d2 - (double)f2 * d) * (Double)iIIIiiiiiI2.ALLATORIxDEMO.get();
            d2 = 0.0;
            iIIIiiiiiI iIIIiiiiiI4 = iIIIiiiiiI2;
            if (iIIIiiiiiI2.iiIIIIiIII.options.jumpKey.isPressed()) {
                d2 = (Double)iIIIiiiiiI4.ALLATORIxDEMO.get();
                v2 = IiIIiIiiiI;
            } else {
                if (iIIIiiiiiI4.iiIIIIiIII.options.sneakKey.isPressed()) {
                    d2 = -((Double)iIIIiiiiiI2.ALLATORIxDEMO.get()).doubleValue();
                }
                v2 = IiIIiIiiiI;
            }
            IiiiIiiIII.ALLATORIxDEMO((IVec3d)v2.movement, d3, d2, d);
            iIIIiiiiiI iIIIiiiiiI5 = iIIIiiiiiI2;
            IiIIiIiiiI = iIIIiiiiiI5.iiIIIIiIII.player.getVelocity();
            iIIIiiiiiI5.iiIIIIiIII.player.setVelocity(IiIIiIiiiI.x, IiIIiIiiiI.y * 0.9, IiIIiIiiiI.z);
        }
        boolean f = false;
        if (((Boolean)iIIIiiiiiI2.iiiiiIIiiI.get()).booleanValue()) {
            f = iIIIiiiiiI2.ALLATORIxDEMO();
        }
        if (!f) {
            iIIIiiiiiI2.ALLATORIxDEMO();
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iIIIiiiiiI iIIIiiiiiI2;
        iIIIiiiiiI iIIIiiiiiI3 = iIIIiiiiiI2 = this;
        float f = iIIIiiiiiI3.iiIIIIiIII.player.getYaw();
        iIIIiiiiiI3.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)IiiiIiiIII.ALLATORIxDEMO(f, iIIIiiiiiI2.iiIIIIiIII.player.getPitch(), iIIIiiiiiI2.iiIIIIiIII.player.isOnGround()));
    }
}

