/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.game.GameJoinedEvent
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Send
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.projectile.FireworkRocketEntity
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntitiesDestroyS2CPacket
 *  net.minecraft.network.packet.c2s.common.CommonPongC2SPacket
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iiIiiIIiII;
import com.github.mikumiku.addon.iiIiiIIiIi;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.mixin.AccessorFireworkRocketEntity;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import meteordevelopment.meteorclient.events.game.GameJoinedEvent;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.play.EntitiesDestroyS2CPacket;
import net.minecraft.network.packet.c2s.common.CommonPongC2SPacket;

public class IIiiiIiiiI
extends iiiiIiIiii {
    private long iiIiIIiIIi;
    private class_1671 IIIIiIiiIi;
    private final List<class_6374> IiIiIIIIiI;
    private final SettingGroup iiiiiIIiiI;
    private boolean iiIIIIiIII;
    private final Setting<Integer> IiIIiIiiiI;
    private final Setting<Boolean> ALLATORIxDEMO;

    public void onDeactivate() {
        this.IiiiiiiIIi();
        this.iiIIIIiIII = 2 & 5;
        this.iiIiIIiIIi = 0L;
        this.ALLATORIxDEMO();
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(GameJoinedEvent gameJoinedEvent) {
        IIiiiIiiiI IiIIiIiiiI;
        IIiiiIiiiI iIiiiIiiiI = iIiiiIiiiI2;
        IIiiiIiiiI iIiiiIiiiI2 = gameJoinedEvent;
        IIiiiIiiiI iIiiiIiiiI3 = IiIIiIiiiI = iIiiiIiiiI;
        IiIIiIiiiI.IiiiiiiIIi();
        iIiiiIiiiI3.iiIIIIiIII = 3 & 4;
        iIiiiIiiiI3.iiIiIIiIIi = 0L;
    }

    public IIiiiIiiiI() {
        IIiiiIiiiI iIiiiIiiiI = this;
        super(iiiiIiIiii.IiIiIIIIiI, iiIiiIIiII.ALLATORIxDEMO("\u70b3\u82f2\u5eba\u951c"), iiIiiIIiIi.ALLATORIxDEMO("\u5ed2\u9518\u70db\u82d6\u6305\u7e8a\u65f2\u95b3\uff28\u0012\u5779\u9abf\u53c9\u4f3c\u5f09\u676a\u53eb\u8087\u65f9\u7518\u3051"));
        iIiiiIiiiI.IiIiIIIIiI = new CopyOnWriteArrayList<class_6374>();
        iIiiiIiiiI.iiiiiIIiiI = this.settings.getDefaultGroup();
        iIiiiIiiiI.IiIIiIiiiI = iIiiiIiiiI.iiiiiIIiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u676c\u5964\u636d\u7eae\u65ba\u9597"))).description(iiIiiIIiIi.ALLATORIxDEMO("\u7098\u8295\u639a\u8f8a\u76e3\u6704\u5947\u6302\u7e8a\u65f2\u958e1\u79e2z"))).defaultValue((Object)(0x7E & 0x2D))).min(--1).max(0x7D & 0x7A).sliderMax(0x7B & 0x7C).build());
        this.ALLATORIxDEMO = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u772c\u9605\u8186\u52eb\u5010\u6b01"))).description(iiIiiIIiIi.ALLATORIxDEMO("\u7764\u9674\u65a7\u818d\u52ac\u503c\u6b61\u5e91\u957b\u70a5\u82a8\u6398\u8f88"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIiiIIiII.ALLATORIxDEMO(";(Ne?\u0006l\u0016\u001c'\r7\tbl\u8b94\u6698\u65f3\u525c\u6743\u65dc\u720b\u6760\uff62"));
        }
    }

    public String getInfoString() {
        IIiiiIiiiI iIiiiIiiiI = this;
        if (!iIiiiIiiiI.iiIIIIiIII) {
            return null;
        }
        float f = (float)(System.currentTimeMillis() - iIiiiIiiiI.iiIiIIiIIi) / 1000.0f;
        return new DecimalFormat(iiIiiIIiIi.ALLATORIxDEMO("3G:")).format(f) + "s";
    }

    public boolean ALLATORIxDEMO() {
        return this.iiIIIIiIII;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IIiiiIiiiI iIiiiIiiiI = iIiiiIiiiI2;
        IIiiiIiiiI iIiiiIiiiI2 = pre;
        IIiiiIiiiI IiIIiIiiiI = iIiiiIiiiI;
        if (!IiIIiIiiiI.iiIIIIiIII) {
            block4: {
                IIiiiIiiiI iIiiiIiiiI3;
                for (class_1297 class_12972 : IiIIiIiiiI.iiIIIIiIII.world.getEntities()) {
                    AccessorFireworkRocketEntity accessorFireworkRocketEntity;
                    if (!(class_12972 instanceof class_1671) || !(accessorFireworkRocketEntity = (AccessorFireworkRocketEntity)((Object)(iIiiiIiiiI2 = (class_1671)class_12972))).hookWasShotByEntity() || accessorFireworkRocketEntity.hookGetShooter() != IiIIiIiiiI.iiIIIIiIII.player) continue;
                    iIiiiIiiiI3 = IiIIiIiiiI;
                    IiIIiIiiiI.IIIIiIiiIi = iIiiiIiiiI2;
                    break block4;
                }
                iIiiiIiiiI3 = IiIIiIiiiI;
            }
            iIiiiIiiiI3.iiIiIIiIIi = System.currentTimeMillis();
            return;
        }
        long l = System.currentTimeMillis() - IiIIiIiiiI.iiIiIIiIIi;
        int this2 = l >= (long)((Integer)IiIIiIiiiI.IiIIiIiiiI.get()).intValue() * 1000L ? --1 : 0;
        if (((Boolean)IiIIiIiiiI.ALLATORIxDEMO.get()).booleanValue() && IiIIiIiiiI.iiIIIIiIII.player.isOnGround()) {
            this2 = --1;
        }
        if (this2 != 0) {
            IIiiiIiiiI iIiiiIiiiI4 = IiIIiIiiiI;
            iIiiiIiiiI4.iiIIIIiIII = 3 & 4;
            iIiiiIiiiI4.IiiiiiiIIi();
            iIiiiIiiiI4.ALLATORIxDEMO();
        }
    }

    private /* synthetic */ void IiiiiiiIIi() {
        if (this.IIIIiIiiIi != null) {
            this.IIIIiIiiIi.discard();
            this.IIIIiIiiIi = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        void IiIIiIiiiI;
        IIiiiIiiiI iIiiiIiiiI = object;
        Object object = IiIIiIiiiI.packet;
        if (object instanceof class_2716) {
            class_2716 class_27162 = (class_2716)object;
            if (iIiiiIiiiI.IIIIiIiiIi != null) {
                object = class_27162.getEntityIds().iterator();
                while (object.hasNext()) {
                    if (((Integer)object.next()).intValue() != iIiiiIiiiI.IIIIiIiiIi.getId()) continue;
                    IIiiiIiiiI iIiiiIiiiI2 = iIiiiIiiiI;
                    IiIIiIiiiI.cancel();
                    iIiiiIiiiI2.iiIIIIiIII = 3 >> 1;
                    iIiiiIiiiI2.iiIiIIiIIi = System.currentTimeMillis();
                    return;
                }
            }
        }
        if (IiIIiIiiiI.packet instanceof class_2708 && iIiiiIiiiI.iiIIIIiIII) {
            IIiiiIiiiI iIiiiIiiiI3 = iIiiiIiiiI;
            iIiiiIiiiI3.iiIIIIiIII = 2 & 5;
            iIiiiIiiiI3.IiiiiiiIIi();
            iIiiiIiiiI3.ALLATORIxDEMO();
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IIiiiIiiiI iIiiiIiiiI = this;
        Object object = this = iIiiiIiiiI.IiIiIIIIiI.iterator();
        while (object.hasNext()) {
            class_6374 class_63742 = (class_6374)this.next();
            object = this;
            iIiiiIiiiI.iiIIIIiIII.getNetworkHandler().sendPacket((class_2596)class_63742);
        }
        iIiiiIiiiI.IiIiIIIIiI.clear();
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Send send) {
        void IiIIiIiiiI;
        IIiiiIiiiI iIiiiIiiiI = iIiiiIiiiI2;
        IIiiiIiiiI iIiiiIiiiI2 = IiIIiIiiiI.packet;
        if (iIiiiIiiiI2 instanceof class_6374) {
            class_6374 class_63742 = (class_6374)iIiiiIiiiI2;
            if (iIiiiIiiiI.iiIIIIiIII) {
                IiIIiIiiiI.cancel();
                iIiiiIiiiI.IiIiIIIIiI.add(class_63742);
            }
        }
    }
}

