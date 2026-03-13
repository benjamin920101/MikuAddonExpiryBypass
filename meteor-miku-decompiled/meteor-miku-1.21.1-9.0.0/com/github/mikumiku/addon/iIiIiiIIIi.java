/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.game.OpenScreenEvent
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket
 *  net.minecraft.client.gui.screen.DeathScreen
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiIIiIi;
import com.github.mikumiku.addon.iiIiiiiIii;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.Date;
import meteordevelopment.meteorclient.events.game.OpenScreenEvent;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.client.gui.screen.DeathScreen;

public class iIiIiiIIIi
extends iiiiIiIiii {
    private int iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private final Setting<Boolean> iiIiIIiIIi;
    private final Setting<String> IIIIiIiiIi;
    private boolean IiIiIIIIiI;
    private final Setting<Boolean> iiiiiIIiiI;
    private final Setting<Integer> iiIIIIiIII;
    private final Setting<String> IiIIiIiiiI;
    private final SettingGroup ALLATORIxDEMO;

    private /* synthetic */ void IiiiiiiIIi() {
        this.IiIiIIIIiI = --1;
        this.iIiiIiiiII = 3 & 4;
        if (((Boolean)this.iIIiiIIIII.get()).booleanValue()) {
            iIiIiiIIIi iIiIiiIIIi2 = this;
            iIiIiiIIIi2.info("\u6b7b\u4ea1\u89e6\u53d1\uff0c\u5c06\u5728 " + String.valueOf(iIiIiiIIIi2.iiIIIIiIII.get()) + " tick \u540e\u53d1\u9001\u6307\u4ee4", new Object[3 >> 2]);
        }
    }

    @EventHandler(priority=100)
    private /* synthetic */ void ALLATORIxDEMO(OpenScreenEvent openScreenEvent) {
        iIiIiiIIIi iIiIiiIIIi2 = iIiIiiIIIi3;
        iIiIiiIIIi iIiIiiIIIi3 = openScreenEvent;
        iIiIiiIIIi IiIIiIiiiI = iIiIiiIIIi2;
        if (!(((OpenScreenEvent)iIiIiiIIIi3).screen instanceof class_418)) {
            return;
        }
        if (((Boolean)IiIIiIiiiI.iiiiiIIiiI.get()).booleanValue()) {
            return;
        }
        IiIIiIiiiI.info(IiIiiIIiIi.ALLATORIxDEMO("\u68b0\u6d51\u5248\u6b63\u4edb"), new Object[5 >> 3]);
        IiIIiIiiiI.IiiiiiiIIi();
    }

    public void onDeactivate() {
        iIiIiiIIIi iIiIiiIIIi2 = this;
        iIiIiiIIIi2.IiIiIIIIiI = 3 & 4;
        iIiIiiIIIi2.iIiiIiiiII = 3 & 4;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        iIiIiiIIIi iIiIiiIIIi2 = iIiIiiIIIi3;
        iIiIiiIIIi iIiIiiIIIi3 = receive;
        iIiIiiIIIi IiIIiIiiiI = iIiIiiIIIi2;
        if (IiIIiIiiiI.iiIIIIiIII.player == null) {
            return;
        }
        if (!((Boolean)IiIIiIiiiI.iiiiiIIiiI.get()).booleanValue()) {
            return;
        }
        iIiIiiIIIi3 = ((PacketEvent.Receive)iIiIiiIIIi3).packet;
        if (iIiIiiIIIi3 instanceof class_2724) {
            class_2724 cfr_ignored_0 = (class_2724)iIiIiiIIIi3;
            if (((Boolean)IiIIiIiiiI.iIIiiIIIII.get()).booleanValue()) {
                IiIIiIiiiI.info(iiIiiiiIii.ALLATORIxDEMO("\u68af\u6d4b\u5257\u91cf\u757a"), new Object[2 & 5]);
            }
            IiIIiIiiiI.IiiiiiiIIi();
        }
    }

    public iIiIiiIIIi() {
        iIiIiiIIIi iIiIiiIIIi2 = this;
        super(iiIiiiiIii.ALLATORIxDEMO("\u6b5f\u4ee2\u81d3\u52f6\u6374\u4ef0"), IiIiiIIiIi.ALLATORIxDEMO("\u6b45\u4efd\u5465\u81e3\u5296\u538d\u9038\u81b1\u5ba4\u4e15\u8069\u5968\u636e\u4eef"));
        iIiIiiIIIi2.ALLATORIxDEMO = iIiIiiIIIi2.settings.getDefaultGroup();
        iIiIiiIIIi2.IIIIiIiiIi = iIiIiiIIIi2.ALLATORIxDEMO.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u633e\u4eba\u51f6\u5bad"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u6b65\u4edd\u5410\u8196\u5296\u538d\u906a\u768d\u6339\u4eb8\uff31\u4e56\u973e\u89dd\u8fb0\u5124F\uff02"))).defaultValue((Object)iiIiiiiIii.ALLATORIxDEMO("Q1\u001eq"))).build());
        this.iiIIIIiIII = this.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u5e9f\u8fd4"))).description(iiIiiiiIii.ALLATORIxDEMO("\u6b7f\u4ec2\u542a\u5eb5\u8fae\u590c\u5c357J'O\u51ce\u53e8\u905f\u6374\u4ef0"))).defaultValue((Object)(0x7E & 0x15))).min(2 & 5).sliderMax(0x66 & 0x7D).build());
        this.iiiiiIIiiI = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u918c\u7576\u5405"))).description(iiIiiiiIii.ALLATORIxDEMO("\u918e\u7526\u5450\u51fe\u53c5"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iiIiIIiIIi = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u8069\u5968\u6a48\u5f04"))).description(iiIiiiiIii.ALLATORIxDEMO("\u4ec1\u8009\u5958\u6d9e\u604b\u65fa\u5f2c\u5395\u9025\u804f\u4e34\u6671\u540e\u4ef0"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.IiIIiIiiiI = this.ALLATORIxDEMO.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u545e\u4ea5\u5224\u7f0b"))).description(iiIiiiiIii.ALLATORIxDEMO("\u541e\u4ec0\u520e\u7f71\uff1e\u903e\u5e7b\u660cd\u000bc\u622f\u5128\u4ea5\uff1d"))).defaultValue((Object)IiIiiIIiIi.ALLATORIxDEMO("$"))).visible(() -> {
            if (!((Boolean)this.iiIiIIiIIi.get()).booleanValue()) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        this.iIIiiIIIII = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u8c3a\u8b8b\u6a52\u5f1b"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u6600\u7966\u8c20\u8b94\u4f88\u6064"))).defaultValue((Object)((3 & 4) != 0))).build());
        iIiIiiIIIi iIiIiiIIIi3 = this;
        iIiIiiIIIi3.iIiiIiiiII = 3 & 4;
        iIiIiiIIIi3.IiIiIIIIiI = 3 ^ 3;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIiiiiIii.ALLATORIxDEMO("t/A\"w\u0006$\u0016t\u0007E7\u00147\u0004\u8bb4\u66d7\u65f4\u5214\u6743\u6589\u7216\u675f\uff15"));
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIiIiiIIIi iIiIiiIIIi2 = iIiIiiIIIi3;
        iIiIiiIIIi iIiIiiIIIi3 = pre;
        iIiIiiIIIi IiIIiIiiiI = iIiIiiIIIi2;
        if (!IiIIiIiiiI.IiIiIIIIiI) {
            return;
        }
        if (IiIIiIiiiI.iiIIIIiIII.player == null) {
            return;
        }
        iIiIiiIIIi iIiIiiIIIi4 = IiIIiIiiiI;
        iIiIiiIIIi4.iIiiIiiiII += --1;
        if (iIiIiiIIIi4.iIiiIiiiII >= (Integer)IiIIiIiiiI.iiIIIIiIII.get()) {
            iIiIiiIIIi iIiIiiIIIi5 = IiIIiIiiiI;
            IiIIiIiiiI.ALLATORIxDEMO();
            iIiIiiIIIi5.IiIiIIIIiI = 3 ^ 3;
            iIiIiiIIIi5.iIiiIiiiII = 3 ^ 3;
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iIiIiiIIIi iIiIiiIIIi2 = string;
        String string = ((String)iIiIiiIIIi2.IIIIiIiiIi.get()).trim();
        if (string.isEmpty()) {
            iIiIiiIIIi2.warning(IiIiiIIiIi.ALLATORIxDEMO("\u6328\u4ea9\u5196\u5bc8\u4e28\u7a0a\uff16\u6752\u53c9\u907b"), new Object[3 & 4]);
            return;
        }
        try {
            iIiIiiIIIi iIiIiiIIIi3 = iIiIiiIIIi2;
            if (((Boolean)iIiIiiIIIi2.iiIiIIiIIi.get()).booleanValue()) {
                iIiIiiIIIi3.iiIIIIiIII.player.networkHandler.sendChatMessage(string);
                iIiIiiIIIi2.info("\u5df2\u53d1\u9001\u804a\u5929\u6d88\u606f: " + (String)string, new Object[3 ^ 3]);
                return;
            }
            String string2 = (String)iIiIiiIIIi3.IiIIiIiiiI.get() + (String)string;
            iIiIiiIIIi iIiIiiIIIi4 = iIiIiiIIIi2;
            iIiIiiIIIi4.iiIIIIiIII.player.networkHandler.sendChatCommand(string);
            iIiIiiIIIi4.info("\u5df2\u53d1\u9001\u6307\u4ee4: " + string2, new Object[3 >> 2]);
            return;
        } catch (Exception exception) {
            iIiIiiIIIi2.error("\u53d1\u9001\u6307\u4ee4\u5931\u8d25: " + exception.getMessage(), new Object[5 >> 3]);
            return;
        }
    }

    @Override
    public void onActivate() {
        iIiIiiIIIi iIiIiiIIIi2 = this;
        iIiIiiIIIi2.iIiiIiiiII = 5 >> 3;
        iIiIiiIIIi2.IiIiIIIIiI = 5 >> 3;
    }
}

