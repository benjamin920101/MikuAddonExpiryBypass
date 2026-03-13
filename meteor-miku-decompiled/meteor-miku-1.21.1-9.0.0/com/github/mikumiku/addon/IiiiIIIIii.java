/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiIIIIiiII;
import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiiIIiIIii;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;

public class IiiiIIIIii
extends iiiiIiIiii {
    private int iiiiiIIiiI;
    private int iiIIIIiIII;
    private final SettingGroup IiIIiIiiiI;
    private final Setting<Integer> ALLATORIxDEMO;

    public IiiiIIIIii() {
        IiiiIIIIii iiiiIIIIii = this;
        super(iiiiIiIiii.ALLATORIxDEMO, iiiIIiIIii.ALLATORIxDEMO("\u4e5d\u9516\u70c8\u82c3"), iiIIIIiiII.ALLATORIxDEMO("\u5ffe\u6311\u953b\u4e66\u951b\u6578\u70ea\u82f7"));
        iiiiIIIIii.IiIIiIiiiI = iiiiIIIIii.settings.getDefaultGroup();
        iiiiIIIIii.ALLATORIxDEMO = iiiiIIIIii.IiIIiIiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiiIIiIIii.ALLATORIxDEMO("\u512e\u95d5\u5ee1\u8fad"))).description(iiIIIIiiII.ALLATORIxDEMO("\u4f39\u751d\u7099\u8284\u5448\u5166\u958b\u7559\u9704\u7691\u5e90\u8fca\uff6e\u6e0d\u6249\u520e\uff4f"))).defaultValue((Object)(--4))).sliderRange(5 >> 2, 0x6C & 0x3B).build());
        this.iiiiiIIiiI = 2 & 5;
        int n = this.iiIIIIiIII.player == null ? 2 & 5 : (this.iiIIIIiIII = IiiiIiiIII.ALLATORIxDEMO());
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiiIIiIIii.ALLATORIxDEMO("0i\u0005d\u0013`@p0A!QpQ`\u8bd2\u66b3\u6592\u5270\u6725\u65ed\u7270\u673b\uff73"));
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        IiiiIIIIii IiIIiIiiiI;
        IiiiIIIIii iiiiIIIIii = iiiiIIIIii2;
        IiiiIIIIii iiiiIIIIii2 = post;
        IiiiIIIIii iiiiIIIIii3 = IiIIiIiiiI = iiiiIIIIii;
        if (IiIIiIiiiI.iiiiiIIiiI == 0) {
            InvUtils.swap((int)iiiiIIIIii3.iiIIIIiIII, (3 & 4) != 0);
            IiIIiIiiiI.toggle();
            return;
        }
        iiiiIIIIii3.iiiiiIIiiI -= 3 & 5;
    }

    private /* synthetic */ void IiiiiiiIIi() {
        iiiiIiIiii.ALLATORIxDEMO(n -> {
            int n2 = n;
            IiiiIIIIii IiIIiIiiiI = this;
            return new class_2886(class_1268.MAIN_HAND, n2, IiIIiIiiiI.iiIIIIiIII.player.getYaw(), IiIIiIiiiI.iiIIIIiIII.player.getPitch());
        });
    }

    public void ALLATORIxDEMO() {
        IiiiIIIIii iiiiIIIIii = this;
        try {
            if (!iiiiIIIIii.iiIIIIiIII.player.isOnGround()) {
                class_1792 class_17922;
                if (iiiiIIIIii.iiIIIIiIII.player.getInventory().getStack(0x66 & 0x3F).getItem().equals(class_1802.ELYTRA) && !iiIIIIiiIi.ALLATORIxDEMO(class_17922 = iiiiIIIIii.iiIIIIiIII.player.getMainHandStack().getItem())) {
                    if (class_17922 == class_1802.FIREWORK_ROCKET) {
                        iiiiIIIIii.IiiiiiiIIi();
                        return;
                    }
                    class_1792[] class_1792Array = new class_1792[1];
                    class_1792Array[5 >> 3] = class_1802.FIREWORK_ROCKET;
                    int n = InvUtils.findInHotbar((class_1792[])class_1792Array).slot();
                    if (n != -4 >> 2) {
                        int n2 = IiiiIiiIII.ALLATORIxDEMO();
                        IIIiIiIiii.IiiiiiiIIi(n);
                        IiiiIIIIii iiiiIIIIii2 = iiiiIIIIii;
                        iiiiIIIIii2.IiiiiiiIIi();
                        IIIiIiIiii.IiiiiiiIIi(n2);
                        iiiiIIIIii2.iiIIIIiIII.getNetworkHandler().sendPacket((class_2596)new class_2815(iiiiIIIIii.iiIIIIiIII.player.currentScreenHandler.syncId));
                        return;
                    }
                    class_1792[] class_1792Array2 = new class_1792[1];
                    class_1792Array2[3 & 4] = class_1802.FIREWORK_ROCKET;
                    n = InvUtils.find((class_1792[])class_1792Array2).slot();
                    if (n != -4 >> 2) {
                        IIIiIiIiii.IiiiiiiIIi(n, IiiiIiiIII.ALLATORIxDEMO());
                        iiiiIIIIii.IiiiiiiIIi();
                        IIIiIiIiii.IiiiiiiIIi(n, IiiiIiiIII.ALLATORIxDEMO());
                        IIIiIiIiii.IiiiiiiIIi();
                        return;
                    }
                }
            }
        } catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public void onActivate() {
        IiiiIIIIii iiiiIIIIii = this;
        iiiiIIIIii.ALLATORIxDEMO();
        iiiiIIIIii.iiiiiIIiiI = (Integer)iiiiIIIIii.ALLATORIxDEMO.get();
        this.iiIIIIiIII = this.iiIIIIiIII.player == null ? 3 >> 2 : IiiiIiiIII.ALLATORIxDEMO();
    }
}

