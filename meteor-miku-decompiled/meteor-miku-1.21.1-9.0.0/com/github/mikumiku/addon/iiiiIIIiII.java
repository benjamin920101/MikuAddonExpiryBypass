/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringListSetting$Builder
 *  meteordevelopment.meteorclient.systems.friends.Friends
 *  meteordevelopment.meteorclient.utils.player.ChatUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.world.World
 *  net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiiiiiII;
import com.github.mikumiku.addon.IiIIIiIIiI;
import com.github.mikumiku.addon.iiIIIIiiII;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.AutoEz;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringListSetting;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;

public class iiiiIIIiII
extends iiiiIiIiii {
    private final Setting<Boolean> IIiiIiiiII;
    private boolean IIIiIiiIIi;
    private final String[] iiiIiIiIIi;
    private final Setting<List<String>> iIiIiIiIii;
    private final SettingGroup iiiiiIIIii;
    private final Setting<List<String>> iIIiIIiiII;
    private String IiiIIiiiiI;
    private final Setting<Integer> IiIIIIiiii;
    private final Setting<Double> IiiIIIiiIi;
    private final String[] iiIIiiIiii;
    private final SettingGroup iIiiIiiiII;
    private final List<IiIIIiIIiI> iIIiiIIIII;
    private final Random iiIiIIiIIi;
    private final Setting<Boolean> IIIIiIiiIi;
    private int IiIiIIIIiI;
    private int iiiiiIIiiI;
    private final Setting<AutoEz.MessageMode> iiIIIIiIII;
    private int IiIIiIiiiI;
    private final SettingGroup ALLATORIxDEMO;

    private /* synthetic */ void ALLATORIxDEMO() {
        iiiiIIIiII iiiiIIIiII2 = this;
        switch (((AutoEz.MessageMode)((Object)iiiiIIIiII2.iiIIIIiIII.get())).ordinal()) {
            case 1: {
                int n = iiiiIIIiII2.iiIiIIiIIi.nextInt(3 & 4, iiiiIIIiII2.iiiIiIiIIi.length);
                if (n == iiiiIIIiII2.iiiiiIIiiI) {
                    n = n < iiiiIIIiII2.iiiIiIiIIi.length - (2 ^ 3) ? n + (3 >> 1) : 0;
                }
                iiiiIIIiII2.iiiiiIIiiI = n;
                iiiiIIIiII2.iIIiiIIIII.add(3 ^ 3, new IiIIIiIIiI(iiiiIIIiII2.iiiIiIiIIi[n].replace(iiIIIIiiII.ALLATORIxDEMO("0\u0015"), iiiiIIIiII2.IiiIIiiiiI == null ? IIIiiiiiII.ALLATORIxDEMO("\u4f2f") : iiiiIIIiII2.IiiIIiiiiI), (4 ^ 5) != 0));
                return;
            }
            case 0: {
                while (false) {
                }
                if (((List)iiiiIIIiII2.iIiIiIiIii.get()).isEmpty()) break;
                int n = iiiiIIIiII2.iiIiIIiIIi.nextInt(3 & 4, ((List)iiiiIIIiII2.iIiIiIiIii.get()).size());
                if (n == iiiiIIIiII2.iiiiiIIiiI) {
                    n = n < ((List)iiiiIIIiII2.iIiIiIiIii.get()).size() - (3 >> 1) ? n + (2 ^ 3) : 0;
                }
                iiiiIIIiII2.iiiiiIIiiI = n;
                iiiiIIIiII2.iIIiiIIIII.add(3 ^ 3, new IiIIIiIIiI((String)((List)iiiiIIIiII2.iIiIiIiIii.get()).get(n), (4 ^ 5) != 0));
                return;
            }
            case 2: {
                int n = iiiiIIIiII2.iiIiIIiIIi.nextInt(5 >> 3, iiiiIIIiII2.iiIIiiIiii.length);
                if (n == iiiiIIIiII2.iiiiiIIiiI) {
                    n = n < iiiiIIIiII2.iiIIiiIiii.length - --1 ? n + (3 & 5) : 0;
                }
                iiiiIIIiII2.iiiiiIIiiI = n;
                iiiiIIIiII2.iIIiiIIIII.add(3 >> 2, new IiIIIiIIiI(iiiiIIIiII2.iiIIiiIiii[n].replace(iiIIIIiiII.ALLATORIxDEMO("0\u0015"), iiiiIIIiII2.IiiIIiiiiI == null ? IIIiiiiiII.ALLATORIxDEMO("\u4f2f") : iiiiIIIiII2.IiiIIiiiiI), 5 >> 2));
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(String string) {
        iiiiIIIiII iiiiIIIiII2 = this;
        if (!((List)iiiiIIIiII2.iIIiIIiiII.get()).isEmpty()) {
            void IiIIiIiiiI;
            int n = iiiiIIIiII2.iiIiIIiIIi.nextInt(2 & 5, ((List)iiiiIIIiII2.iIIiIIiiII.get()).size() - --1);
            if (n == iiiiIIIiII2.IiIiIIIIiI) {
                n = n < ((List)iiiiIIIiII2.iIIiIIiiII.get()).size() - --1 ? n + (2 ^ 3) : 0;
            }
            iiiiIIIiII2.IiIiIIIIiI = n;
            iiiiIIIiII2.iIIiiIIIII.add(new IiIIIiIIiI(((String)((List)iiiiIIIiII2.iIIiIIiiII.get()).get(n)).replace(iiIIIIiiII.ALLATORIxDEMO("\t\bT+PX"), (CharSequence)IiIIiIiiiI), 5 >> 3));
        }
    }

    public String getInfoString() {
        return ((AutoEz.MessageMode)((Object)this.iiIIIIiIII.get())).name();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(double d) {
        iiiiIIIiII iiiiIIIiII2 = iiiiIIIiII3;
        for (iiiiIIIiII iiiiIIIiII3 : iiiiIIIiII2.iiIIIIiIII.world.getPlayers()) {
            void IiIIiIiiiI;
            if (iiiiIIIiII3 == iiiiIIIiII2.iiIIIIiIII.player || Friends.get().isFriend((class_1657)iiiiIIIiII3) || !(iiiiIIIiII3.getPos().distanceTo(iiiiIIIiII2.iiIIIIiIII.player.getPos()) <= IiIIiIiiiI) || !(iiiiIIIiII3.getHealth() <= 0.0f)) continue;
            iiiiIIIiII2.IiiIIiiiiI = iiiiIIIiII3.getName().getString();
            return 3 >> 1;
        }
        return false;
    }

    public iiiiIIIiII() {
        iiiiIIIiII iiiiIIIiII2 = this;
        super(iiiiIiIiii.ALLATORIxDEMO, iiIIIIiiII.ALLATORIxDEMO("\u81ff\u52ceP<"), IIIiiiiiII.ALLATORIxDEMO("\u654a\u4ed5\u6b5d\u4eee\u5428\u539e\u9027\n\\\u565d\u8b9b\u6dc7\u6049\u304d"));
        iiiiIIIiII2.iiiiiIIIii = iiiiIIIiII2.settings.getDefaultGroup();
        iiiiIIIiII2.iIiiIiiiII = iiiiIIIiII2.settings.createGroup(iiIIIIiiII.ALLATORIxDEMO("\u51ee\u6726"));
        iiiiIIIiII2.ALLATORIxDEMO = iiiiIIIiII2.settings.createGroup(IIIiiiiiII.ALLATORIxDEMO("\u56d8\u8131"));
        iiiiIIIiII2.IiiIIIiiIi = iiiiIIIiII2.iiiiiIIIii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIIIIiiII.ALLATORIxDEMO("\u6559\u4edc\u8316\u5692"))).description(IIIiiiiiII.ALLATORIxDEMO("\u53ec\u6766\u654a\u4ed5\u572e\u6b0b\u8325\u56bb\u51a3\u6b34\u4e87\u65b9\u624b\u53be\u9027\u6dc7\u6049\u304d"))).defaultValue(25.0).min(0.0).sliderRange(0.0, 50.0).build());
        this.IiIIIIiiii = this.iiiiiIIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiII.ALLATORIxDEMO("\u5ee3\u8fb9"))).description(IIIiiiiiII.ALLATORIxDEMO("\u53d7\u906e\u6d8e\u6000\u4e6d\u95bb\u7b6f\u5fca\u76a2;o\fM\u653f\u91e9\u304d"))).defaultValue((Object)(0x73 & 0x3E))).min(3 >> 2).sliderRange(2 & 5, 0x77 & 0x6C).build());
        this.IIiiIiiiII = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiII.ALLATORIxDEMO("\u51ee\u6726\u6d9d\u6009"))).description(IIIiiiiiII.ALLATORIxDEMO("\u6503\u4e9c\u6b34\u4e87\u65b9\u6629\u5449\u53f7\u904e\u6dae\u6020"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iiIIIIiIII = this.iIiiIiiiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIIIIiiII.ALLATORIxDEMO("\u51ce\u6706\u6d9d\u6009\u6a34\u5f69"))).description(IIIiiiiiII.ALLATORIxDEMO("\u53f7\u904e\u4ee6\u4e07\u7c7d\u57e4\u76a2\u6dc7\u6049\u304d"))).defaultValue((Object)AutoEz.MessageMode.ALLATORIxDEMO)).build());
        this.iIiIiIiIii = this.iIiiIiiiII.add((Setting)((StringListSetting.Builder)((StringListSetting.Builder)((StringListSetting.Builder)((StringListSetting.Builder)new StringListSetting.Builder().name(iiIIIIiiII.ALLATORIxDEMO("\u51ee\u6726\u6d9d\u6009"))).description(IIIiiiiiII.ALLATORIxDEMO("\u5407\u752e\"o\u0004s\u6de7\u6069\u6a4e\u5f29\u65b9\u51dd\u670f\u656a\u4ef5\u8987\u53be\u9027\u76cb\u6dae\u6020"))).defaultValue(List.of(iiIIIIiiII.ALLATORIxDEMO("\u88cdX\u000f^3\u5e67\u63ef\u4e93\uff67"), IIIiiiiiII.ALLATORIxDEMO("K\u0006M:\u6726\u5f75"), iiIIIIiiII.ALLATORIxDEMO("x/~\u0013\u724e\u905a")))).visible(() -> {
            if (this.iiIIIIiIII.get() == AutoEz.MessageMode.ALLATORIxDEMO) {
                return 3 >> 1;
            }
            return false;
        })).build());
        this.IIIIiIiiIi = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiiiiiII.ALLATORIxDEMO("\u56d8\u8131\u6dae\u6020"))).description(iiIIIIiiII.ALLATORIxDEMO("\u6559\u4edc\u7213\u5698\u816b\u6590\u661a\u5460\u53c4\u9067\u6d9d\u6009"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iIIiIIiiII = this.ALLATORIxDEMO.add((Setting)((StringListSetting.Builder)((StringListSetting.Builder)((StringListSetting.Builder)new StringListSetting.Builder().name(IIIiiiiiII.ALLATORIxDEMO("\u56d8\u8131\u6dae\u6020"))).description(iiIIIIiiII.ALLATORIxDEMO("\u6559\u4edc\u7213\u5698\u816b\u6590\u89b4\u5397\u9014\u76e2\u6d9d\u6009"))).defaultValue(List.of(IIIiiiiiII.ALLATORIxDEMO("\u6217\u5c5e\u559a\u6b4d\u772d\u4f2f\u750e\u56b1\u8158o:!g\u0002cq"), iiIIIIiiII.ALLATORIxDEMO("\u772a\u6669\u60b3\u8055\u7691\u9795\u4e45F\t\bT+PX"), IIIiiiiiII.ALLATORIxDEMO("\u567a\u91a3\u556c\u5509\u505a\u4e62\u4e0d\u670a\u76d2\u527f\u4f46\u505d\u4e2do:!g\u0002cq")))).build());
        iiiiIIIiII iiiiIIIiII3 = this;
        iiiiIIIiII iiiiIIIiII4 = this;
        iiiiIIIiII iiiiIIIiII5 = this;
        iiiiIIIiII4.iiIiIIiIIi = new Random();
        iiiiIIIiII4.IiiIIiiiiI = null;
        iiiiIIIiII iiiiIIIiII6 = this;
        iiiiIIIiII4.iIIiiIIIII = new LinkedList<IiIIIiIIiI>();
        iiiiIIIiII3.IiIIiIiiiI = 3 >> 2;
        String[] stringArray = new String[0x19D5 & 0x66BF];
        stringArray[2 & 5] = iiIIIIiiII.ALLATORIxDEMO("\u5481\uff39cF\u8f9f\u90e8\u809b\u6b6e\uff6a\u4f75\u6649\u772a\u674f\u70ac\u4e7a\u896a\u552c");
        stringArray[3 >> 1] = IIIiiiiiII.ALLATORIxDEMO("\u0003<\u570e\u8f96\u91ca\u5bab\u4ea0\uff43\u7b37\u6b34");
        stringArray[5 >> 1] = iiIIIIiiII.ALLATORIxDEMO("\u00105\u753d\u5bef\u5346\u675c\u4e4a\u809b\u5bf1\uff4a\u4e45\u6b1d\u6204\u4ee0");
        stringArray[--3] = IIIiiiiiII.ALLATORIxDEMO("#\u001c\uff2a\u4f2f\u59ae\u7e92\u5bdf\u6660\u53cb\u547e\u616e\u6b82\u57ad\u76cb");
        stringArray[--4] = iiIIIIiiII.ALLATORIxDEMO("e\u80e9\u526f\u5912\u9045\u6775e\u7ec6\u6739\u4e93\uff6a\u4e1e\u6b47\u5948\u8f96\uff19Cf\uff67");
        stringArray[--5] = IIIiiiiiII.ALLATORIxDEMO("\u627e\u5950\u5939\u6275\u0002e\u90b2\u6bd2\u4f0f\u5f1c\uff43\u0003<");
        stringArray[0x27 & 0x5E] = iiIIIIiiII.ALLATORIxDEMO("cF\uff4a\u52a8\u4f26\u4e65\u4e4c\u70ca\u9698\u5432\uff6a\u4e38\u7170\u770a\u6cc7\u7729\u776d");
        stringArray[0x1F & 0x67] = IIIiiiiiII.ALLATORIxDEMO("\u54a1\u5446\uff63\u5bdf\u4e42\u8d51\u5505\u0003<\uff0e\u5028\u88e3\u5443\u60e3\uff46");
        stringArray[0x6F & 0x18] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff39\u4f26\u76b1\u76e8\u8091\u54ca\u4f75\u6649\u4e3f\u4f77\u95e7\u5ef9\u725c\u54ac\u4e3f\u6692\u70d7\uff79");
        stringArray[9 & 0x7F] = IIIiiiiiII.ALLATORIxDEMO("\u7b91\u4ee9\uff0aJu\uff63\u76f4\u4ed5\u738f\u5bf9\u4e79\u8baa\u672f\u6775\u4f1c\uff63\u6237\u6560\u6327\u4f2f");
        stringArray[0xF & 0x7A] = iiIIIIiiII.ALLATORIxDEMO("0\u0015\uff19\u4f06\u8fcc\u6c84\u64f8\u4f1a\u770a\u6649\u79ae\u8c57");
        stringArray[0x5F & 0x2B] = IIIiiiiiII.ALLATORIxDEMO("Ju\uff63\u888d\u625e\u8e0f\u5fd8\u672b\u6742\u5e10\u5e79\u6139\u8986\u59a4\u4f1a");
        stringArray[0xF & 0x7C] = iiIIIIiiII.ALLATORIxDEMO("0\u0015\uff19\u4f06\u663a\u7779\u76b1\u55da\u6b37\u6b1d\u5402\uff79");
        stringArray[0x7F & 0xD] = IIIiiiiiII.ALLATORIxDEMO("\u8987\u6640\u53cc\u80b2\u902f\u4f2f\u54aa\u856e\u5f96\u570b\uff2a\u625e\u902f\u572b");
        stringArray[0x2F & 0x5E] = iiIIIIiiII.ALLATORIxDEMO("$F\uff4a\u4f55\u76c2\u664f\u5500\u54b9\u51bd\u6755\u6516\u671c\u5117\u5419\u70df\uff2f\u90bb\u4f5b\u5ff1\u79ae\u8c57");
        stringArray[0x2F & 0x5F] = IIIiiiiiII.ALLATORIxDEMO("#\u001c\uff2a\u89ce\u4e2b\u89ce\u540a\u70f6V9v\u5eb5\u8b88\uff50");
        stringArray[0x35 & 0x5A] = iiIIIIiiII.ALLATORIxDEMO("\u54a1\uff19\u4f06\u573d\u4e36\u9aed\u6e7e\u621a\u91aa\u5bd1\u4ee0");
        stringArray[0x33 & 0x5D] = IIIiiiiiII.ALLATORIxDEMO("#\u001c\uff0a\u6cce\u60f5\u525f\u4f46\u5c0a\u7110\u80b2\u709f\u4e44\u201e\u5be6\u88e3\u2056\u632f\u94e1");
        stringArray[0x52 & 0x3F] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff39\u6257\u8be1\u4e4b\u6592\u4f06\u80e8\u524d\u53c8\u918a\u5464\u5500\u5402\uff79");
        stringArray[0x53 & 0x3F] = IIIiiiiiII.ALLATORIxDEMO("\u0003<\uff2a\u62b0\u597b\u4f0f\u76a2\u5968\u51bf\u0003");
        stringArray[0x7F & 0x14] = iiIIIIiiII.ALLATORIxDEMO("Cf\u88cd\u739c\u6256\u4e93\u880e\u60d0\u5363");
        stringArray[0x17 & 0x7D] = IIIiiiiiII.ALLATORIxDEMO("#\u001c\u6609\u4e65\u6596\u6204\u7688\uff4e\uff07\uff6e\u0017\uff4e\u0017\uff4e");
        stringArray[0x1F & 0x76] = iiIIIIiiII.ALLATORIxDEMO("cF\uff4a\u573d\u8fbf\u7821\u8fbf\u91d9\u909b\u80c8\u5b82\u4e4a\u6649\u7ec8\u6d5d");
        stringArray[0x7F & 0x17] = IIIiiiiiII.ALLATORIxDEMO("ju\u55f3\u6b04\u4ec3\u6b07\u510c");
        stringArray[0x7A & 0x1D] = iiIIIIiiII.ALLATORIxDEMO("cF\uff4a\u83c9\u72b1\uff19\u4f06\u8fcb\u6277\u90c8\u8e2b\u4e18\u5256\u51f5\u4e6d");
        stringArray[0x5B & 0x3D] = IIIiiiiiII.ALLATORIxDEMO("\u0003<\uff2a\u88e4\u6217\u623c\u5216\u904f\u672b\u4ec9");
        stringArray[0x3A & 0x5F] = iiIIIIiiII.ALLATORIxDEMO("Cf\uff6a\u76c1\u63e3\u88be\u7260\u5e67\u4ee0");
        stringArray[0x5F & 0x3B] = IIIiiiiiII.ALLATORIxDEMO("jU\u8f91\u0012\u6873\u8ddb\u79d4\u90db\u621c\u4e2b\u8f88");
        stringArray[0x7C & 0x1F] = iiIIIIiiII.ALLATORIxDEMO("\u673c\u4efc\u7eec\u8f9f\u5c1a\u5b0f\u9007\u4e4c\u7ead\uff6a\u00105\u8994\u548b\u4e93\uff67");
        stringArray[0x5F & 0x3D] = IIIiiiiiII.ALLATORIxDEMO("ju\u4f0f\u721f\u6660\u516f\u597b");
        stringArray[0x7E & 0x1F] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff39\u4f26\u5b83\u8c77\u663a\u4e6b\u663a\u4ebf\u4eaf\u63ea\uff39\u512e\u5ba3\u5e40\u522f\u76e2");
        stringArray[0x3F & 0x5F] = IIIiiiiiII.ALLATORIxDEMO("Ju\uff63\u4f46\u8393\u5fb1\u57cc\u5718\u8f29\u90fb\u62e5\u4f46\u6579\u8d56\u4ec9");
        stringArray[0x6A & 0x35] = iiIIIIiiII.ALLATORIxDEMO("Wr\uff39\u674f\u76b1\u4efc\u661a\u51bc\u752a\u65b0\u88be\u6432\u4e93\uff6a\u4f75\u6649\u76c1\u63e3\u6241\u58ff\u4e1f\u4ee0");
        stringArray[0x71 & 0x2F] = IIIiiiiiII.ALLATORIxDEMO("#\u001c\uff2a\u8d39\u7d01\u5691\u5a3e\u8081\u91ca\u56b1\u70af\u9182\u9006\u5468");
        stringArray[0x3B & 0x66] = iiIIIIiiII.ALLATORIxDEMO("\u8c37\u8c44\u9014\u76e2\u4e8f\u5972\uff19Cf\uff67");
        stringArray[35] = IIIiiiiiII.ALLATORIxDEMO("jU\uff43\u4f46\u6660\u88c3\u76eb\u8ffe\u6660\u83fa\u76cb");
        stringArray[36] = iiIIIIiiII.ALLATORIxDEMO("CF\uff4a\u4f75\u6649\u770a\u5ef9");
        stringArray[37] = IIIiiiiiII.ALLATORIxDEMO("JU\uff43\u6237\u59c7\u6275\u8f96\u6e3e\u6260\u90db\u6b9b\u4f46\u5f75");
        stringArray[38] = iiIIIIiiII.ALLATORIxDEMO("0\u0015\uff19\u54ae\u54fd\u548e\u54dd\u6043\u4e93\uff79");
        stringArray[39] = IIIiiiiiII.ALLATORIxDEMO("#\u001c\uff0a\u52cf\u6217\u5912\u53ed\uff43\u6237\u4ea3\u806c\u8005\u4f66\u525f\u5eb3\u6746\u593c\u5ed0");
        stringArray[40] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff2f\u205a\u7b94\u7440\u546d\uff47\u671c\u4edc\u6246\u6277\uff14\u6277\u889e\u6215\u70d7\u4ee0\uff14\u207b");
        stringArray[41] = IIIiiiiiII.ALLATORIxDEMO("Ju\uff63\u4f66\u5c5e\u8fdf\u70d6\u8dd5\u8dbc\u8dd5\u76cb\u6c12\u5e3c\u8fde\u609c\u6275\u527f\u6237\uff50");
        stringArray[42] = iiIIIIiiII.ALLATORIxDEMO("cF\uff4a\u70ea\u96b8\u663a\u4e4c\u5968\u4e7a\u896a\u4f06\u772a\u76c2\u8bf0\u8bb3\u8bc0\uff67");
        stringArray[43] = IIIiiiiiII.ALLATORIxDEMO("#\u001c\uff0a\u627e\u6c87\u5f4f\u9559\u818d\uff2a\u4f2f\u53ec\u6640\u709f\u5965\u6144\u4ec9");
        stringArray[44] = iiIIIIiiII.ALLATORIxDEMO("cF\uff4a\u5e19\u677d\u4f75\u5f33\u50da\u56b8\u650b\u81ac\u5de4\u676f\u590f\u83ba");
        stringArray[45] = IIIiiiiiII.ALLATORIxDEMO("Ju\uff63\u8fdf\u6e57\u6229\u5da9\u53d5\u9561\u90db\u89ce\u752e\u76eb\uff2a\u5264\u5ffe\u4ec9");
        stringArray[46] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff39\u4f26\u76b1\u5eb0\u8fca\u54ea\u666f\u5520\u663a\u4e66\u6be1\u4e46\u7691\uff6a\u50ae>");
        stringArray[47] = IIIiiiiiII.ALLATORIxDEMO("#\u001c\uff0a.j\u001b\r\t\u0012\u4e4f\u4e0d\u9581\u98be\u5c7e\u6c87\u4ec9");
        stringArray[48] = iiIIIIiiII.ALLATORIxDEMO("cF\uff4aT*AMSR\u6266\u5f46\u9685\u85a9\u799a\u524f");
        stringArray[49] = IIIiiiiiII.ALLATORIxDEMO("#\u001c\uff0a\u53a2\u6b65\u4f0f\u8fd9\u6586\u56f8\u53f4\u738f\u586e\u57b4\u4e04\u591a\uff63\u4e2b\u59cd\u7396\u5767");
        stringArray[50] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff39\u5698\u5814\u57d4\u4e5e\u597a\u53ae\u5441\uff19\u4ef2\u5cb4\u9040\u593c\u5c69\u5b73\u7579");
        stringArray[51] = IIIiiiiiII.ALLATORIxDEMO("#\u001c\uff0a\u627e\u89a7\u5bb6\u4f46\u5c77\u4f75\u8dbc\u4e2c\u6a36\u8254\u6b2c\u4e6f\u8251");
        stringArray[52] = iiIIIIiiII.ALLATORIxDEMO("cF\uff4a\u6224\u6669\u770a\u00d1\u73bc\u5bd0\uff19\u806a\u4f55\u53ac\u663a\u80aa\u667a\u6719");
        stringArray[53] = IIIiiiiiII.ALLATORIxDEMO("Ju\uff63\u5c3b\u5c52\u4f46\u81a5\u5dd7\u76cb\u8369\uff63\u5f26\u634d\u5eb9\u7226");
        stringArray[54] = iiIIIIiiII.ALLATORIxDEMO("cF\uff4a\u53ae\u6d9f\u6b6e\u574e\u4f75\u818c\u5dc4\u76c2\u7729\u6c8c\u91d9\u5441");
        stringArray[55] = IIIiiiiiII.ALLATORIxDEMO("#\u001c\uff0a\u4f0f\u8fff\u4e07\u83fa\uff43\u6237\u7744\u4f66\u627e\u90db\u63c6\u665c\u5509");
        stringArray[56] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff19\u4ea8\u5b73\u6847\u6969\u4e6c\u5e13\u7eb5\u5b45\u4e6d\u53ae\u5441");
        stringArray[57] = IIIiiiiiII.ALLATORIxDEMO("\u0003<\uff2a\u88e4\u6237\u6560\u914b\u4ee9\uff2a\u5c40\u7312\u5b1f");
        stringArray[58] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff39\u52e6\u6204\u591b\u53de\u6703\u55a2\u6277\u5412\uff4a\u6204\u5c57\u7224\u544a");
        stringArray[59] = IIIiiiiiII.ALLATORIxDEMO("\u0003<\uff0a\u627e\u65c3\u4ec9\u4f46\u7276");
        stringArray[60] = iiIIIIiiII.ALLATORIxDEMO("cF\uff4a\u6770\u552c\uff19\u6c72\u5f82\u9066\u6738\uff4a\u54a4\u4f8f\u90e8\u4e36");
        stringArray[61] = IIIiiiiiII.ALLATORIxDEMO("#\u001c\uff0a\u4e62\uff2a\u4f2f\u6c87\u77c1\uff2a\u625e\u7719\u62e5\u4f46\u621c\u7220\u4ec9");
        stringArray[62] = iiIIIIiiII.ALLATORIxDEMO("0\u0015\uff19\u8f1d\u8f6e\u6718\u674b\u6ea7\u8855\u6235\u7a6a\u4f06");
        stringArray[63] = IIIiiiiiII.ALLATORIxDEMO("Ju\uff63\u6237\u90b2\u80db\u96db\u7766\u5c00\u5e53\u5443\u5216\u4f2f\u60ce\u53a4");
        stringArray[64] = iiIIIIiiII.ALLATORIxDEMO("0\u0015\uff19\u776d\u8fcc\u5383\u8be8\u76c2\u5b8b\u9542\u5f3a\u4ee0");
        stringArray[65] = IIIiiiiiII.ALLATORIxDEMO("\ru\uff63\u4f66\u676f\u8fd7\u62a6\u5c48\u4ee9\u5431\uff50\u6237\u5255\u62ac\u4f2f\u5c48\u9092\u6275\u51b5\u6743\u4ec9");
        stringArray[66] = iiIIIIiiII.ALLATORIxDEMO("Cf\uff6a\u0003\u687a\u5966\u4edc\u6246\u622d");
        stringArray[67] = IIIiiiiiII.ALLATORIxDEMO("\u0003<\uff0a\u591c\u6765\u7249\u7812\u6775");
        stringArray[68] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff39\u4f26\u67c6\u8214\u4f46\u6516\u6bc1\u8fbf\u6e0d\u6249\u5725\u5698\u8fcd\u5941");
        stringArray[69] = IIIiiiiiII.ALLATORIxDEMO("\u51af\u7658\u4e48\u5e52\u8f94\u5310\u5195\u6743\u4e65\u0003<");
        stringArray[70] = iiIIIIiiII.ALLATORIxDEMO("\u4efc\u4f66q\u0005c\u661a\u6c72\uff19Cf\u6068\u4e5dW\u0005v0\u6649\u76c5\uff79");
        stringArray[71] = IIIiiiiiII.ALLATORIxDEMO("\u0003<\uff2a\u0003");
        stringArray[72] = iiIIIIiiII.ALLATORIxDEMO("0\u0015\uff39\u88ed\u6204\u6235\u70d7\u4ee0");
        stringArray[73] = IIIiiiiiII.ALLATORIxDEMO("d[\uff0a\u4f0f\u592c\u80b9\u4e80\uff63\u5bb0\u91a3\u5917\u7024\u4f46\u7567\u5f88\u6cad\u708f\u623c\u4ea0~\u0017v");
        stringArray[74] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff39\u6257\u4e4a\u6649\u593c\u594f\u88be\u8e44\uff39\u9539\u70ac\u8177\u5b45\u5441");
        stringArray[75] = IIIiiiiiII.ALLATORIxDEMO("#k\u000eio\u0003<\u752e\u88ad\u5f26\u5bed\u6211\u7aa0");
        stringArray[76] = iiIIIIiiII.ALLATORIxDEMO("cf\uff6a\u57ef\u4f0a");
        stringArray[77] = IIIiiiiiII.ALLATORIxDEMO("ju\uff63\u6c64\u4f2f\u95cb\u567b");
        stringArray[78] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff19\u6277\u5499\u4f06\u599d\u73cf\u5814\u57d4\u4e5e\u597a\u53d9\u63f4");
        stringArray[79] = IIIiiiiiII.ALLATORIxDEMO("#\u001c\u88e3\u5fd8\u5fae\u7823\uff2a\u4f09\u4f66\u7256\u6275\u4f2f\u66d2\u72af");
        stringArray[80] = iiIIIIiiII.ALLATORIxDEMO("\u54ae\u54ddCf\uff6a\u5ecf\u8be8\u9015\u676b\u81ff\u958b");
        stringArray[81] = IIIiiiiiII.ALLATORIxDEMO("\u4f66\u8fb6\u51c0\u6670\u6609\u6041\u4e6e\u70f6\u4e2d\u8f32\u630f\u94c1\u76a2\uff50\u0003<");
        stringArray[82] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff39\u4f26\u76b1\u77c2\u51f3\u5c77\u50da\u762a\u75d2\uff6a\u4f53\u762a\u75f2\u81b5\u5c04\u809b\u6755\u4edc");
        stringArray[83] = IIIiiiiiII.ALLATORIxDEMO("Ju\uff63\u4f46\u76cb\u750e\u594b\u54aa\u8f21\u6903\u8175\u8e29\u6730\u4e26\u6878");
        stringArray[84] = iiIIIIiiII.ALLATORIxDEMO("cf\uff6a\u7791\u51a0\u663a\u5e73\u91e4\u68a8\u8d4b\u52cf\u7691\u5471");
        stringArray[85] = IIIiiiiiII.ALLATORIxDEMO("\ru\uff63\u6217\u8bc6\u4f66\u5317\u8f7b\uff63\u4f46\u53a0\u80db\u8f91\u535e\u8f32\u630f\u94c1\u90db\u70f6\u4e2b\u4e62");
        stringArray[86] = iiIIIIiiII.ALLATORIxDEMO("Cf\uff6a\u6224\u8d0a\u4f75\u7f37\u605e\u8fa1");
        stringArray[87] = IIIiiiiiII.ALLATORIxDEMO("JU\uff43\u8bd1\u5264\u6b5d\u8803\u5411\uff63\u7211\u8c6d\u8c04\u4f2f");
        stringArray[88] = iiIIIIiiII.ALLATORIxDEMO("cf\uff6ap\u001c");
        stringArray[89] = IIIiiiiiII.ALLATORIxDEMO("#\u001c\uff2a\u4f2f\u6609\u4e42\u6609\u825b\u95ee\u62e5\u626d\u9530\u5901\u76cb");
        stringArray[90] = iiIIIIiiII.ALLATORIxDEMO("0\u0015\uff19\u5e9c\u8bbb\u524d\u5449\u547e\u4e93\uff6a\u666f\u96fa");
        stringArray[91] = IIIiiiiiII.ALLATORIxDEMO("jU\uff43\u8212\u9587\u62ac\u6204\u539d\u5468");
        stringArray[92] = iiIIIIiiII.ALLATORIxDEMO("\u60c6\u6396\u5372\u0016C6\u6c21\u5e15\u5402CF\uff59\u53ae\u8d95\u6d62\u5441");
        stringArray[93] = IIIiiiiiII.ALLATORIxDEMO("jo\u0003<");
        stringArray[94] = iiIIIIiiII.ALLATORIxDEMO("Cf\uff6a\u6cb4\u676f\u5948\u756e\u7691\u5bc4\u6222\u7a89");
        stringArray[95] = IIIiiiiiII.ALLATORIxDEMO("\u0003<\u7682\u5bcd\u6211\u7aa0\u5d0f\u4ec9");
        stringArray[96] = iiIIIIiiII.ALLATORIxDEMO("0\u0015\uff19\u524d\u5f35\u6344\u4e93\uff6a\u666f\u96fa");
        stringArray[97] = IIIiiiiiII.ALLATORIxDEMO("jUo\u001c?i\u001bG;Iu");
        stringArray[98] = iiIIIIiiII.ALLATORIxDEMO("cF\uff4a\u53ae\u6235\u889e\u9f46\u5432\uff6a\u6f86\u6d74\u9acd\u5e90\u8fca\u604c");
        stringArray[99] = IIIiiiiiII.ALLATORIxDEMO("\u0003<\uff2a\u8dca\u7e81\u9a23\u91ca\u590a\u6b5d\u4eee\u97d5\u6507");
        stringArray[100] = iiIIIIiiII.ALLATORIxDEMO("\u5926\u5b83\u5fad\u001a G/P(qFt\u0002qF\u00105\uff19\u55d1\u4ec3\u83ba");
        stringArray[101] = IIIiiiiiII.ALLATORIxDEMO("#\u001c\uff2a\u5b29\u5b40\u6c9a\u56db~?[\u0016\u62da\u966b\u5468");
        stringArray[102] = iiIIIIiiII.ALLATORIxDEMO("\u560acF\uff4a\u60e6\u544a\u4e3f\u7b77\u8bc8\u5471\uff2a\u4f26\u8d77\u4e6b\u4e93\u76e2");
        stringArray[103] = IIIiiiiiII.ALLATORIxDEMO("\u0003<\uff0a\u88c4i\u0000`\u4ec9");
        stringArray[104] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff19\u4f06\u722d\u59ee\u90e8\u6649\u4f55\u6ce7\u89d4\u8fa1\u7691\u4edc");
        stringArray[105] = IIIiiiiiII.ALLATORIxDEMO("jU\uff43\u6743\u55f8\u6217\u5448\uff2a\u625e\u7217\u5463");
        stringArray[106] = iiIIIIiiII.ALLATORIxDEMO("Z)sF0\u0015");
        stringArray[107] = IIIiiiiiII.ALLATORIxDEMO("Ju\uff63@-O\u5f6f\u95ce\uff43\u4f46\u6453\u88e4\u5f4f\u70d9\u9691\u888d\u539e\u7396\u4ec9");
        stringArray[108] = iiIIIIiiII.ALLATORIxDEMO("cF\uff4a\u4edb\u7af1\u6222\u8d95\u4e1e\u53dd\u9034\u4e6c\u5158\u8d5f\u4f0f\u543e");
        stringArray[109] = IIIiiiiiII.ALLATORIxDEMO("\u0003<\uff2a\u4f2f\u8ff8\u4e4f\u70bf\u6755\u4f3c\u90b2\u6c87\u6746");
        stringArray[110] = iiIIIIiiII.ALLATORIxDEMO("0\u0015\uff39\u7ea1\u7ef8\u52cc\u528e\u552c");
        stringArray[111] = IIIiiiiiII.ALLATORIxDEMO("Ju\uff63\u4f66\u6640\u9085\u7982\u00179\u0017\u4e10\u80fb\u6290\u7b0a\u4e46\u76a2\u4ef5");
        stringArray[112] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff39\u4e4b\u661a\u6257\u8bc1\uff4a\u4f75\u76e2\u5468\u6bb2\u6204\u622d\u670f\u7573\u8fcd\u4e6b\u5029\u94d7");
        stringArray[113] = IIIiiiiiII.ALLATORIxDEMO("\u53f0\u6743\u904e\u4e9c\u597b\u6609\u4f2f\u7682\u5946\u8d6d\uff43\u0003<");
        stringArray[114] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff19\u976b\u91c4\u76e2\u625e\u775a\u537a\u8c45\u90e8\u6bb2\u4f75\u591b");
        stringArray[115] = IIIiiiiiII.ALLATORIxDEMO("Ju\uff63\u4f46\u8f96\u5c17\u6660\u9059\u5b1a\u5951\u53be\u6628\u76cb\u6129\u4e06");
        stringArray[116] = iiIIIIiiII.ALLATORIxDEMO("Cf\uff6a\u4f75\u5c57\u661a\u61ee\u626c\u4e85\u5418\u8bab");
        stringArray[117] = IIIiiiiiII.ALLATORIxDEMO("\u0003<\uff0a\u54a7\u54ee\uff43a\b");
        stringArray[118] = iiIIIIiiII.ALLATORIxDEMO("CF\uff4a\u70d7\u5bc4\u6222\u7a89");
        stringArray[119] = IIIiiiiiII.ALLATORIxDEMO("\u0003<\uff2a(Aoc\u0015\uff2a\u5c40\u83fa\u9e6e");
        stringArray[120] = iiIIIIiiII.ALLATORIxDEMO("\u524d\u5fcd\u4ee0\u4e0b\u62e3\u6204\uff6a0\u0015");
        stringArray[121] = IIIiiiiiII.ALLATORIxDEMO("\u0003<\uff2a\u4f2f\u76a2\u6635\u5540\u5c5e\u6609\u4e65\\5");
        stringArray[122] = iiIIIIiiII.ALLATORIxDEMO("$F\uff4a\u4f55\u6746\u8fe4\u628f\u5c7b\u4ec0\u5402\uff79\u6204\u527c\u629f\u4f06\u5c7b\u90bb\u6246\u519c\u6770\u4ee0");
        stringArray[123] = IIIiiiiiII.ALLATORIxDEMO("Ju\uff63\u4e2d\u6b6e\u520d\u5767\u6237\u7553\u751a\u5767\u91ea\u6571\u8c60\u5b1f");
        stringArray[124] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff39t>T(R\uff19\u51a9\u0004\u6669\u4f75\u76e2\\7");
        stringArray[125] = IIIiiiiiII.ALLATORIxDEMO("\u4f46\u8baa\u750e\u7090\u96f8\u4ee9\uff2ajU\uff4e");
        stringArray[126] = iiIIIIiiII.ALLATORIxDEMO("Cf\uff6a\u4e15\u519d\u5ff0\u6706\uff19*@*");
        stringArray[127] = IIIiiiiiII.ALLATORIxDEMO("JU\uff43\u4f46\u6660\u9059\u5b1a\u5951\u5e10\u546c\u4eac\u8a26\u4ef5");
        stringArray[128] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff39\u6257\u4e18\u61a4\u4e2f\u5503\u906a\u5b33\u5962\u4e4b\u53fe\u4f06\u5418\u5b31");
        stringArray[129] = IIIiiiiiII.ALLATORIxDEMO("Ju\uff63\u6237\u77c1\u4ea0\u76cb\u7211\u7278\u7782\u5ff8\u90db\u6b9b\u4f46\u5932");
        stringArray[130] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff19#m\u000e|\u0004Z$\u90e8\u6bb2\u4f75\u5f5c");
        stringArray[131] = IIIiiiiiII.ALLATORIxDEMO("\u0003<\uff2a\u4f2f\u7719\u6640c\u0015\u5216\u7249");
        stringArray[132] = iiIIIIiiII.ALLATORIxDEMO("CF\uff4a[+F*");
        stringArray[133] = IIIiiiiiII.ALLATORIxDEMO("Ju\uff63\u4f66\u7259\u6beb\u4e42\u89a7\u4f2f\uff2a\u5b2b\u5139\u960d\u4e79\u4e42\u89a7\u4f2f");
        stringArray[134] = iiIIIIiiII.ALLATORIxDEMO("0\u0015\uff19\u4f06\u6be1\u62b9\u7821\u4eb7\u8fcd\u80b0");
        stringArray[135] = IIIiiiiiII.ALLATORIxDEMO("\u0003<\uff2a\u804c\u8657\u4e6f\u4e2d\u5264\u6d1d\u4ec9");
        stringArray[136] = iiIIIIiiII.ALLATORIxDEMO("cF\uff4a\u7385\u5bd8\u6755\u4ee0\u4eaf\u8fbe\u8be1\u6649\u613a\u5950\u7691\u90c5\u79d8\u4edc");
        stringArray[137] = IIIiiiiiII.ALLATORIxDEMO("#\u001c\uff2a\u4f2f\u7396\u5bd1\u91ea\u4e10\u6629\u79bd\u63af\u76cb\u8d01\u823d");
        stringArray[138] = iiIIIIiiII.ALLATORIxDEMO("Cf\uff6a\u666f\u5520\u6d7e\u9aca\u5f82\u4ee0\u4e3f ");
        stringArray[139] = IIIiiiiiII.ALLATORIxDEMO("\u5264\u5ffe\u4ec9\u4e38\u62ca\u6237\uff43\u0003<");
        stringArray[140] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff19\u4f06\u599d\u579c");
        stringArray[141] = IIIiiiiiII.ALLATORIxDEMO("#\u001c\uff2a\u625e\u523c\u5fcf\u4f46\u815e\u95ee\u623c\u4ea0\u4e65\u5591\u56c0");
        stringArray[142] = iiIIIIiiII.ALLATORIxDEMO("cF\uff4a\u4f55\u721f\u9f6a\u50a9\u660a\u6679\u2001\u2072\u91e4\u9e82\u8019\u4e72\u5213\u6505");
        stringArray[143] = IIIiiiiiII.ALLATORIxDEMO("d[\uff0a\u73c4\u7476\u6640\u84db\u76eb\uff0a\u6670\u6639\u6660\u7e84\u76cb\uff2a\u4f2f\u88ad\u5f6f\u6324\u5e3d\u6b5d\u4ec9");
        stringArray[144] = iiIIIIiiII.ALLATORIxDEMO("d\u0001\uff0d\u6224\u4e4b\u5f35\u6344\uff39\u56a6\u4e0f1t\u0012v\u000eq\tR\u80e9\u5b8f\u4f7c\u5c14\u6277");
        stringArray[145] = IIIiiiiiII.ALLATORIxDEMO("jU\uff43\u5c37\u5477\u70bf\u6cd6\u6f20\u5468\u5162\u5f50");
        stringArray[146] = iiIIIIiiII.ALLATORIxDEMO("n@\uff4c\u4f52\u666e\u88d9\u5169\u6738\u6746\u5f0f\u5be4\u6202\u7aa9\u5e47\u6b3d\u7691\uff6a\u73a5\u574e\u8fcd\u5e40\u65d5\u9616\u75ab\u8db7\u7ec0\u8fa1");
        stringArray[147] = IIIiiiiiII.ALLATORIxDEMO("Ju\uff63\u4f66\u80b9\u5fb1\u80d5\u8136\u6b9b\u4f46\u5107\u56d8\u5bd9\u0014\u007f\u5220\u94d0");
        stringArray[148] = iiIIIIiiII.ALLATORIxDEMO("\u00105\uff39\u4f26\u90b6\u73cf\u611a\u5c69\u5f82\u754e\u9e93\u574e\u90e8\u809b\u5942\u4e6c");
        iiiiIIIiII3.iiiIiIiIIi = stringArray;
        String[] stringArray2 = new String[12];
        stringArray2[5 >> 3] = IIIiiiiiII.ALLATORIxDEMO("\u6629\u5525\uff2a\u8f96\u5e08\u4ef5\u8bd2\u89ce\u5c07\u627e\uff2a\u618d\u4e0c\u5c0e");
        stringArray2[3 >> 1] = iiIIIIiiII.ALLATORIxDEMO("\u538c\u663a\u6095\u571d\u7e8e\u70ac\u5251\u4e3f\u5260");
        stringArray2[1 ^ 3] = IIIiiiiiII.ALLATORIxDEMO("\u6c87\u95a1\u4f46\u6140\u89e7\uff43\u4f66\u7bf8\u54cc\u6876\u8457\uff50");
        stringArray2[--3] = iiIIIIiiII.ALLATORIxDEMO("\u620d\u646d\u7726\u5215\uff6a\u5213\u5260\u94aa\u8bef\u4f75\u53be\u611a\u9704");
        stringArray2[--4] = IIIiiiiiII.ALLATORIxDEMO("\u8fb6\u5e08\u4ef5\u60d5\u5b29\u6237\uff43\u5170\u5bf1\u53cc\u6660\u5aef\u59dd");
        stringArray2[--5] = iiIIIIiiII.ALLATORIxDEMO("\u54b9\u5102\u5f0a\u4e8a\u55fd\u7726\uff19\u574e\u77ca\u8f20\u91d9\u62db\u7755\u70b9");
        stringArray2[6] = IIIiiiiiII.ALLATORIxDEMO("\u4e2b\u5fd8\u4e2b\u7566\u4ea0\u5936\uff0a\u5916\u8ffe\u61ba\u7766\u542d");
        stringArray2[7] = iiIIIIiiII.ALLATORIxDEMO("\u4e1f\u6703\u5c24\u6218\u6b4e\uff4a\u6d2e\u8b83\u88be\u79b4");
        stringArray2[8] = IIIiiiiiII.ALLATORIxDEMO("\u4f2f\u4eca\u8f96\u5e28\u4ed5\u90db\u6660\u5eb9\u7226");
        stringArray2[9] = iiIIIIiiII.ALLATORIxDEMO("\u4f55\u59ff\u5b45\u8db7\u6204\u5bd0\u6770\u4ee0\uff39\u6257\u53fa\u7779\u4f0f\u73cf");
        stringArray2[10] = IIIiiiiiII.ALLATORIxDEMO("\u5e49\u7766\u52fc\u52bd\u58a4\u4e02\u823d\u886e\u6288\u658b\u4f2f\u8130\u5b1f");
        stringArray2[11] = iiIIIIiiII.ALLATORIxDEMO("\u5e40\u7755\u4e4c\u5932\u9519\u814a\u76c2\u59ac\u5b36\u6656\u60c6");
        this.iiIIiiIiii = stringArray2;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIIiiiiiII.ALLATORIxDEMO("Q\u0004$Iu\n&\u001av\u000bg\u001bCn\u0006\u8bb8\u66d2\u65ff\u5236\u676f\u6596\u7207\u670a\uff4e"));
        }
    }

    @EventHandler(priority=200)
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        block2: {
            iiiiIIIiII iiiiIIIiII2;
            iiiiIIIiII IiIIiIiiiI;
            block5: {
                block4: {
                    block3: {
                        iiiiIIIiII iiiiIIIiII3 = object;
                        Object object = pre;
                        iiiiIIIiII iiiiIIIiII4 = IiIIiIiiiI = iiiiIIIiII3;
                        iiiiIIIiII4.IiIIiIiiiI += 2 ^ 3;
                        if (iiiiIIIiII4.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) break block2;
                        iiiiIIIiII iiiiIIIiII5 = IiIIiIiiiI;
                        if (!iiiiIIIiII5.ALLATORIxDEMO((Double)iiiiIIIiII5.IiiIIIiiIi.get()) || !((Boolean)IiIIiIiiiI.IIiiIiiiII.get()).booleanValue()) break block3;
                        if (IiIIiIiiiI.IIIiIiiIIi) break block4;
                        iiiiIIIiII iiiiIIIiII6 = IiIIiIiiiI;
                        iiiiIIIiII2 = iiiiIIIiII6;
                        iiiiIIIiII6.IIIiIiiIIi = 2 ^ 3;
                        iiiiIIIiII6.ALLATORIxDEMO();
                        break block5;
                    }
                    IiIIiIiiiI.IIIiIiiIIi = 3 >> 2;
                }
                iiiiIIIiII2 = IiIIiIiiiI;
            }
            if (iiiiIIIiII2.IiIIiIiiiI >= (Integer)IiIIiIiiiI.IiIIIIiiii.get() && !IiIIiIiiiI.iIIiiIIIII.isEmpty()) {
                Object object = object = IiIIiIiiiI.iIIiiIIIII.get(2 & 5);
                ChatUtils.sendPlayerMsg((String)((IiIIIiIIiI)object).ALLATORIxDEMO);
                IiIIiIiiiI.IiIIiIiiiI = 3 & 4;
                iiiiIIIiII iiiiIIIiII7 = IiIIiIiiiI;
                if (((IiIIIiIIiI)object).IiIIiIiiiI) {
                    iiiiIIIiII7.iIIiiIIIII.clear();
                    return;
                }
                iiiiIIIiII7.iIIiiIIIII.remove(2 & 5);
            }
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        class_2663 IiIIiIiiiI;
        iiiiIIIiII iiiiIIIiII2 = iiiiIIIiII3;
        iiiiIIIiII iiiiIIIiII3 = IiIIiIiiiI.packet;
        if (iiiiIIIiII3 instanceof class_2663) {
            IiIIiIiiiI = (class_2663)iiiiIIIiII3;
            if (IiIIiIiiiI.getStatus() == (0x37 & 0x6B)) {
                iiiiIIIiII3 = IiIIiIiiiI.getEntity((class_1937)iiiiIIIiII2.iiIIIIiIII.world);
                if (((Boolean)iiiiIIIiII2.IIIIiIiiIi.get()).booleanValue() && iiiiIIIiII2.iiIIIIiIII.player != null && iiiiIIIiII2.iiIIIIiIII.world != null && iiiiIIIiII3 instanceof class_1657 && iiiiIIIiII3 != iiiiIIIiII2.iiIIIIiIII.player && !Friends.get().isFriend((class_1657)iiiiIIIiII3) && iiiiIIIiII2.iiIIIIiIII.player.getPos().distanceTo(iiiiIIIiII3.getPos()) <= (Double)iiiiIIIiII2.IiiIIIiiIi.get()) {
                    iiiiIIIiII2.ALLATORIxDEMO(iiiiIIIiII3.getName().getString());
                }
            }
        }
    }

    @Override
    public void onActivate() {
        iiiiIIIiII iiiiIIIiII2 = this;
        super.onActivate();
        iiiiIIIiII2.IIIiIiiIIi = 5 >> 3;
        iiiiIIIiII2.iiiiiIIiiI = -4 >> 2;
    }
}

