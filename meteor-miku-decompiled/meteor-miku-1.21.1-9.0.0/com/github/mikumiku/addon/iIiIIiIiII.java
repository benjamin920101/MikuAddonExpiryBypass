/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Category
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.ExplosionS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIIIiiII;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiIiiIIiII;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.Date;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;

public class iIiIIiIiII
extends iiiiIiIiii {
    private final Setting<Double> iiIiIIiIIi;
    private final Setting<Boolean> IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private final SettingGroup iiiiiIIiiI;
    private final Setting<Boolean> iiIIIIiIII;
    private final Setting<Boolean> IiIIiIiiiI;
    private final Setting<Double> ALLATORIxDEMO;

    public iIiIIiIiII() {
        iIiIIiIiII iIiIIiIiII2 = this;
        super((Category)ALLATORIxDEMO, IiiIIIiiII.IiiiiiiIIi("\u53db\u51f5\u905co"), iiIiiIIiII.ALLATORIxDEMO("\u5766\u88ca\u6575\u5191\u6253\u726d\u70fc\u65dd\u51cb\u5c7d\u6255\u62f9\u62f4\u5197\u9043\u6504\u67fflK\u5110\u5bfal$\u001e*!\"\u000fJ"));
        iIiIIiIiII2.iiiiiIIiiI = iIiIIiIiII2.settings.getDefaultGroup();
        iIiIIiIiII2.ALLATORIxDEMO = iIiIIiIiII2.iiiiiIIiiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u6c3f\u5e60\u51ed\u900e\u6b88\u4fcf"))).description(iiIiiIIiII.ALLATORIxDEMO("\u8c07\u6510\u672e\u818b\u6575\u519a\u76ca\u6c5e\u5e36\u5190\u9044\u5f11\u5ea2Lk|CQc\u65ac\u5198\u904cOLrl^L\u53dc\u5987\u5f59\u5eeaJ"))).defaultValue(0.0).min(0.0).max(1.0).sliderMax(1.0).build());
        this.iiIiIIiIIi = this.iiiiiIIiiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u5789\u76e7\u51ed\u900e\u6b88\u4fcf"))).description(iiIiiIIiII.ALLATORIxDEMO("\u8c60\u6538\u6706\u8186\u6578\u51b7\u76e7\u57ee\u76b7\u51b7\u9063\u5f76\u5ec5"))).defaultValue(0.0).min(0.0).max(1.0).sliderMax(1.0).build());
        this.IiIIiIiiiI = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u7210\u70b6\u5f2d\u5489"))).description(iiIiiIIiII.ALLATORIxDEMO("\u6643\u5465\u5bb5C8\r\u0018CcC\u726a\u70fb\u7c37\u4f47\u5bdf\u5ed7\u7564\u53ae\u51b7\u9063"))).defaultValue((Object)(3 >> 1))).build());
        this.IiIiIIIIiI = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u963c\u533d\u815e"))).description(iiIiiIIiII.ALLATORIxDEMO("\u967e\u5302\u8176\uff4fl\u7998\u52c4\u65b5\u4e41\u53ae\u51b7\u9063"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.IIIIiIiiIi = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u4ece\u573b\u5726\u976c\u7543\u650c"))).description(iiIiiIIiII.ALLATORIxDEMO("\u4ea4\u5f1d\u4f0a\u7a9c\u5743\u5774\u9749\u4e0e\u659a\u620e\u5183\u5c72\u5197\u9043\uff40\u9651\u6b2e\u7a19\u4e41\u880f\u4e76\u88c8+1%\u000e\u688c\u6d28"))).defaultValue((Object)(3 >> 2))).build());
        this.iiIIIIiIII = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u4f21\u88d6\u81fc\u7138\u52f4\u4f18"))).description(iiIiiIIiII.ALLATORIxDEMO("\u4f41\u9064\u8f50\u5faa\u7997\u52eb\u4ea9\u7eb6\u8fabc\u000b\u0011%\u000eL\u6883\u6d07CD\u63eb\u831c\u5f63\u5463J"))).defaultValue((Object)(--1 != 0))).build());
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiIIIiiII.IiiiiiiIIi("{_nrXV+f[WJG;g+\u8be4\u66f8\u65a4\u523b\u6713\u65a6\u7246\u6770\uff45"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_243 class_2432) {
        void IiIIiIiiiI;
        iIiIIiIiII iIiIIiIiII2 = iIiIIiIiII3;
        iIiIIiIiII iIiIIiIiII3 = iIiIIiIiII2.iiIIIIiIII.player;
        if (iIiIIiIiII3 == null) {
            return;
        }
        iIiIIiIiII iIiIIiIiII4 = iIiIIiIiII3;
        if (((Boolean)iIiIIiIiII2.iiIIIIiIII.get()).booleanValue()) {
            iIiIIiIiII4.setVelocity(iIiIIiIiII3.getVelocity().add(IiIIiIiiiI.multiply(0.98)));
            return;
        }
        iIiIIiIiII4.setVelocity(iIiIIiIiII3.getVelocity().add((class_243)IiIIiIiiiI));
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        void IiIIiIiiiI;
        iIiIIiIiII iIiIIiIiII2 = this;
        if (((Boolean)iIiIIiIiII2.IiIiIIIIiI.get()).booleanValue() && (iIiIIiIiII2.iiIIIIiIII.options.backKey.isPressed() || iIiIIiIiII2.iiIIIIiIII.options.forwardKey.isPressed() || iIiIIiIiII2.iiIIIIiIII.options.leftKey.isPressed() || iIiIIiIiII2.iiIIIIiIII.options.rightKey.isPressed())) {
            return;
        }
        if (iIiIIiIiII2.iiIIIIiIII.player == null || iIiIIiIiII2.iiIIIIiIII.world == null) {
            return;
        }
        if (((Boolean)iIiIIiIiII2.IIIIiIiiIi.get()).booleanValue() && !iIiIIiIiII2.iiIIIIiIII.player.isOnGround()) {
            return;
        }
        class_2596 class_25962 = IiIIiIiiiI.packet;
        if (class_25962 instanceof class_2743) {
            this = (class_2743)class_25962;
            if (this.getEntityId() == iIiIIiIiII2.iiIIIIiIII.player.getId()) {
                double d = (Double)iIiIIiIiII2.ALLATORIxDEMO.get();
                double d2 = (Double)iIiIIiIiII2.iiIiIIiIIi.get();
                if (d == 1.0 && d2 == 1.0) {
                    return;
                }
                IiIIiIiiiI.cancel();
                iIiIIiIiII iIiIIiIiII3 = this;
                double d3 = iIiIIiIiII3.getVelocityX() / 8000.0 * d;
                double d4 = iIiIIiIiII3.getVelocityY() / 8000.0 * d2;
                double d5 = iIiIIiIiII3.getVelocityZ() / 8000.0 * d;
                iIiIIiIiII2.ALLATORIxDEMO(new class_243(d3, d4, d5));
                return;
            }
        } else {
            class_25962 = IiIIiIiiiI.packet;
            if (class_25962 instanceof class_2664) {
                this = (class_2664)class_25962;
                if (((Boolean)iIiIIiIiII2.IiIIiIiiiI.get()).booleanValue()) {
                    double d = (Double)iIiIIiIiII2.ALLATORIxDEMO.get();
                    double d6 = (Double)iIiIIiIiII2.iiIiIIiIIi.get();
                    IiIIiIiiiI.cancel();
                    class_243 class_2432 = IiiiIiiIII.ALLATORIxDEMO((class_2664)this);
                    iIiIIiIiII2.ALLATORIxDEMO(new class_243(class_2432.x * d, class_2432.y * d6, class_2432.z * d));
                }
            }
        }
    }
}

