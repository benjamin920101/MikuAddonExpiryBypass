/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringListSetting$Builder
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.network.packet.s2c.play.GameMessageS2CPacket
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIIiiiII;
import com.github.mikumiku.addon.iIIiiiIiii;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringListSetting;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;

public class iiIIIiIiII
extends iiiiIiIiii {
    private final Setting<Boolean> iiIiIIiIIi;
    private final SettingGroup IIIIiIiiIi;
    private final Setting<List<String>> IiIiIIIIiI;
    private final Setting<String> iiiiiIIiiI;
    private Map<String, String> iiIIIIiIII;
    private String IiIIiIiiiI;
    private final SettingGroup ALLATORIxDEMO;

    @Override
    public void onActivate() {
        iiIIIiIiII iiIIIiIiII2 = this;
        super.onActivate();
        iiIIIiIiII2.ALLATORIxDEMO();
        iiIIIiIiII2.IiiiiiiIIi();
        if (((Boolean)iiIIIiIiII2.iiIiIIiIIi.get()).booleanValue()) {
            this.info(iIIiiiIiii.ALLATORIxDEMO("\u818a\u52cd\u7604\u5f27\u6a49\u5730\u5d8f\u6fb6\u6d57"), new Object[2 & 5]);
            iiIIIiIiII iiIIIiIiII3 = this;
            iiIIIiIiII3.info("\u5f53\u524d\u7528\u6237\u540d: " + iiIIIiIiII3.ALLATORIxDEMO(), new Object[3 >> 2]);
            iiIIIiIiII iiIIIiIiII4 = this;
            iiIIIiIiII4.info("\u5df2\u914d\u7f6e\u8d26\u6237\u6570\u91cf: " + iiIIIiIiII4.iiIIIIiIII.size(), new Object[2 & 5]);
        }
    }

    private /* synthetic */ String IiiiiiiIIi() {
        iiIIIiIiII iiIIIiIiII2;
        iiIIIiIiII iiIIIiIiII3 = iiIIIiIiII2 = string;
        String string = iiIIIiIiII3.ALLATORIxDEMO();
        return iiIIIiIiII3.iiIIIIiIII.get(string);
    }

    private /* synthetic */ void IiiiiiiIIi() {
        iiIIIiIiII iiIIIiIiII2;
        iiIIIiIiII iiIIIiIiII3 = iiIIIiIiII2 = iterator;
        iiIIIiIiII3.iiIIIIiIII.clear();
        Iterator iterator = (List)iiIIIiIiII3.IiIiIIIIiI.get();
        if (iterator.isEmpty()) {
            if (((Boolean)iiIIIiIiII2.iiIiIIiIIi.get()).booleanValue()) {
                iiIIIiIiII2.warning(iIIiiiIiii.ALLATORIxDEMO("\u8d7c\u6277\u524d\u8828\u4e40\u7a1a"), new Object[3 ^ 3]);
            }
            return;
        }
        try {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Object object = ((String)iterator.next()).trim().split(IiiIIiiiII.ALLATORIxDEMO("4"));
                if (((String[])object).length != (1 ^ 3)) continue;
                object = object[3 & 4].trim();
                String string = object[--1].trim();
                if (((String)object).isEmpty() || string.isEmpty()) continue;
                iiIIIiIiII iiIIIiIiII4 = iiIIIiIiII2;
                iiIIIiIiII4.iiIIIIiIII.put((String)object, string);
                if (!((Boolean)iiIIIiIiII4.iiIiIIiIIi.get()).booleanValue()) continue;
                iiIIIiIiII2.info("\u5df2\u6dfb\u52a0\u8d26\u6237: " + (String)object, new Object[2 & 5]);
            }
        } catch (Exception this2) {
            iiIIIiIiII2.error("\u89e3\u6790\u8d26\u6237\u5217\u8868\u5931\u8d25: " + this2.getMessage(), new Object[3 ^ 3]);
        }
    }

    private /* synthetic */ String ALLATORIxDEMO() {
        block3: {
            iiIIIiIiII iiIIIiIiII2 = string;
            try {
                if (iiIIIiIiII2.iiIIIIiIII != null && ((class_310)iiIIIiIiII2.iiIIIIiIII).player != null) {
                    String string = ((class_310)iiIIIiIiII2.iiIIIIiIII).player.getName().getString();
                    return string;
                }
            } catch (Exception exception) {
                if (!((Boolean)iiIIIiIiII2.iiIiIIiIIi.get()).booleanValue()) break block3;
                iiIIIiIiII2.error("\u83b7\u53d6\u7528\u6237\u540d\u5931\u8d25: " + exception.getMessage(), new Object[2 & 5]);
            }
        }
        return IiiIIiiiII.ALLATORIxDEMO("\u677e\u77eb\u757c\u6239");
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        Object object = this;
        if (!((String)(this = ((iiIIIiIiII)object).ALLATORIxDEMO())).equals(((iiIIIiIiII)object).IiIIiIiiiI)) {
            iiIIIiIiII iiIIIiIiII2 = object;
            iiIIIiIiII2.IiIIiIiiiI = this;
            iiIIIiIiII2.iiiiiIIiiI.set(this);
            if (((Boolean)iiIIIiIiII2.iiIiIIiIIi.get()).booleanValue()) {
                object.info("\u68c0\u6d4b\u5230\u7528\u6237\u540d: " + (String)this, new Object[3 >> 2]);
            }
        }
    }

    @EventHandler
    public void ALLATORIxDEMO(PacketEvent.Receive receive) {
        iiIIIiIiII iiIIIiIiII2 = object;
        Object object = receive;
        iiIIIiIiII IiIIiIiiiI = iiIIIiIiII2;
        object = ((PacketEvent.Receive)object).packet;
        if (object instanceof class_7439 && ((class_7439)object).comp_763().getString().contains(iIIiiiIiii.ALLATORIxDEMO("y 1#5("))) {
            if (((Boolean)IiIIiIiiiI.iiIiIIiIIi.get()).booleanValue()) {
                IiIIiIiiiI.info(IiiIIiiiII.ALLATORIxDEMO("\u68ce\u6d3f\u521e\u9754\u898f\u762f\u5f5b"), new Object[3 >> 2]);
            }
            iiIIIiIiII iiIIIiIiII3 = IiIIiIiiiI;
            iiIIIiIiII3.ALLATORIxDEMO();
            iiIIIiIiII3.IiiiiiiIIi();
            object = iiIIIiIiII3.IiiiiiiIIi();
            String string = iiIIIiIiII3.ALLATORIxDEMO();
            if (object != null && !((String)object).isEmpty()) {
                IiIIiIiiiI.iiIIIIiIII.getNetworkHandler().sendChatCommand("login " + (String)object);
                if (((Boolean)IiIIiIiiiI.iiIiIIiIIi.get()).booleanValue()) {
                    IiIIiIiiiI.info("\u4e3a\u7528\u6237 " + string + " \u81ea\u52a8\u767b\u5f55", new Object[3 & 4]);
                    return;
                }
            } else if (((Boolean)IiIIiIiiiI.iiIiIIiIIi.get()).booleanValue()) {
                IiIIiIiiiI.warning("\u672a\u627e\u5230\u7528\u6237 " + string + " \u7684\u5bc6\u7801\u914d\u7f6e", new Object[3 >> 2]);
            }
        }
    }

    public iiIIIiIiII() {
        iiIIIiIiII iiIIIiIiII2 = this;
        super(IiiIIiiiII.ALLATORIxDEMO("\u81be\u52a6\u760f\u5f7b\u0004b!}"), iIIiiiIiii.ALLATORIxDEMO("\u6880\u6d31\u5f33\u5217\r9\u7548\u626d\u544d\u5e2c\u81aa\u5287\u530c\u9137\u5b99\u5ee9\u5ba1\u787b\u761b\u5f32\u6770\u528c\u565f"));
        iiIIIiIiII2.IIIIiIiiIi = iiIIIiIiII2.settings.getDefaultGroup();
        iiIIIiIiII2.ALLATORIxDEMO = iiIIIiIiII2.settings.createGroup(IiiIIiiiII.ALLATORIxDEMO("\u8d72\u6239\u7bf5\u7408"));
        iiIIIiIiII2.iiiiiIIiiI = iiIIIiIiII2.IIIIiIiiIi.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iIIiiiIiii.ALLATORIxDEMO("\u5f33\u522a\u7555\u621a\u543a"))).description(IiiIIiiiII.ALLATORIxDEMO("\u6630\u796e\u5f5d\u5219C7\u5b8c\u6263\u7ae1\u760f\u5f7b\u76d0\u7526\u6263\u5403"))).defaultValue((Object)iIIiiiIiii.ALLATORIxDEMO("\u674d\u68bd\u6d66\u5207"))).build());
        this.IiIiIIIIiI = this.ALLATORIxDEMO.add((Setting)((StringListSetting.Builder)((StringListSetting.Builder)new StringListSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u8d72\u6239\u5243\u8866"))).description(iIIiiiIiii.ALLATORIxDEMO("\u6baf\u8816\u4e40\u4e70\u8d66\u6218\uff39\u6846\u5f6fGG\u7552\u6257\u546aG\u5beb\u7836"))).defaultValue(new String[2 & 5]).build());
        this.iiIiIIiIIi = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIiiiII.ALLATORIxDEMO("\u8c57\u8bdb\u6a75\u5f01"))).description(iIIiiiIiii.ALLATORIxDEMO("\u665e\u7947\u8b81\u7ebc\u76e4\u8c64\u8ba8\u4fcc\u6058"))).defaultValue((Object)((3 & 4) != 0))).build());
        iiIIIiIiII iiIIIiIiII3 = this;
        iiIIIiIiII iiIIIiIiII4 = this;
        iiIIIiIiII3.iiIIIIiIII = new HashMap<String, String>();
        iiIIIiIiII3.IiIIiIiiiI = "";
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiIIiiiII.ALLATORIxDEMO("#EV\b\u0007KT[$j5z1/T\u8bd9\u66a0\u65be\u5244\u672e\u65e4\u7246\u6778\uff0f"));
        }
    }
}

