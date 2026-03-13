/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.world.PlaySoundEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.util.Identifier
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IIiIiIiiIi;
import com.github.mikumiku.addon.IiiIIIiiII;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiiiIiIiii;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.world.PlaySoundEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.util.Identifier;

public class IIiiIiIIiI
extends iiiiIiIiii {
    private final SettingGroup iiIIIIiIII;
    private boolean IiIIiIiiiI;
    private final Setting<Double> ALLATORIxDEMO;

    private /* synthetic */ void IiiIIIIiiI() {
        IIiiIiIIiI iIiiIiIIiI = iIiiIiIIiI2;
        class_1792[] class_1792Array = new class_1792[--1];
        class_1792Array[3 & 4] = class_1802.ELYTRA;
        IIiiIiIIiI iIiiIiIIiI2 = InvUtils.findInHotbar((class_1792[])class_1792Array);
        if (!iIiiIiIIiI2.found()) {
            return;
        }
        IIiiIiIIiI iIiiIiIIiI3 = iIiiIiIIiI;
        IIiiIiIIiI iIiiIiIIiI4 = iIiiIiIIiI2;
        iIiiIiIIiI3.ALLATORIxDEMO(iIiiIiIIiI4.slot());
        iIiiIiIIiI3.IiiiiiiIIi();
        iIiiIiIIiI3.ALLATORIxDEMO(iIiiIiIIiI4.slot());
    }

    public IIiiIiIIiI() {
        IIiiIiIIiI iIiiIiIIiI = this;
        super(IiIiIIIIiI, IIiIiIiiIi.ALLATORIxDEMO("\u757f\u98bf,\u0000"), IiiIIIiiII.IiiiiiiIIi("\u753f\u80f7\u757e\u988a\u884f\uff17\u4e0b\u8009\u979e\u7fdb\u801d\u4e50\u300e\u9714\u5764\u5fbf\u635c\u683c\u6515\u97ab\u7fce\u3011\u5178\u95fe\u515d\u4ee5\u51b9\u7a92\u6a0a\u5764\uff27\u59b1\u81e1\u52bb\u522c\u97ab\u7f9b\u80be\u7539\u3012\u6353\u575b\u81e1\u52bb\u6374\u88cb\u7b15\u3046"));
        iIiiIiIIiI.iiIIIIiIII = iIiiIiIIiI.settings.getDefaultGroup();
        iIiiIiIIiI.ALLATORIxDEMO = iIiiIiIIiI.iiIIIIiIII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIiIiIiiIi.ALLATORIxDEMO("\u6e32\u6eb0\u98d9\u8867"))).description(IiiIIIiiII.IiiiiiiIIi("\u6e69\u6edf\u9882\u8808"))).defaultValue(10.0).min(1.0).max(10.0).sliderMin(1.0).sliderMax(10.0).build());
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiIiIiiIi.ALLATORIxDEMO(" 05\u001d\u00039P) \u0018\u0011(`\bp\u8b8b\u66a3\u65cb\u5260\u677c\u65fd\u7229\u672b\uff2a"));
        }
    }

    private /* synthetic */ void IiiiiiiIIi() {
        if (this.iiIIIIiIII.player == null) {
            return;
        }
        this.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)new class_2848((class_1297)this.iiIIIIiIII.player, class_2848.class_2849.START_FALL_FLYING));
    }

    private static /* synthetic */ void ALLATORIxDEMO() {
        class_1792[] class_1792Array = new class_1792[5 >> 2];
        class_1792Array[3 ^ 3] = class_1802.ELYTRA;
        FindItemResult findItemResult = InvUtils.findInHotbar((class_1792[])class_1792Array);
        if (!findItemResult.found()) {
            findItemResult = InvUtils.findInHotbar(IiIIiIiiiI -> {
                if (IiIIiIiiiI.getItem() == class_1802.NETHERITE_CHESTPLATE || IiIIiIiiiI.getItem() == class_1802.DIAMOND_CHESTPLATE || IiIIiIiiiI.getItem() == class_1802.GOLDEN_CHESTPLATE || IiIIiIiiiI.getItem() == class_1802.IRON_CHESTPLATE) {
                    return true;
                }
                return false;
            });
            if (findItemResult.found()) {
                int n = IiiiIiiIII.ALLATORIxDEMO();
                FindItemResult findItemResult2 = findItemResult;
                int n2 = findItemResult2.slot();
                if (!findItemResult2.isMainHand()) {
                    IIIiIiIiii.ALLATORIxDEMO().ALLATORIxDEMO(n).IiiiiiiiII(n2);
                }
                MeteorClient.mc.interactionManager.interactItem((class_1657)MeteorClient.mc.player, class_1268.MAIN_HAND);
                return;
            }
            findItemResult = InvUtils.findInHotbar(IiIIiIiiiI -> IiIIiIiiiI.isEmpty());
            int n = IIIiIiIiii.ALLATORIxDEMO((class_1799 IiIIiIiiiI) -> {
                if (IiIIiIiiiI.getItem() == class_1802.NETHERITE_CHESTPLATE || IiIIiIiiiI.getItem() == class_1802.DIAMOND_CHESTPLATE || IiIIiIiiiI.getItem() == class_1802.GOLDEN_CHESTPLATE || IiIIiIiiiI.getItem() == class_1802.IRON_CHESTPLATE) {
                    return true;
                }
                return false;
            });
            if (findItemResult.found()) {
                if (n != -4 >> 2) {
                    IIIiIiIiii.IiiiiiiIIi(n, findItemResult.slot());
                }
            }
            return;
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IIiiIiIIiI iIiiIiIIiI = iIiiIiIIiI2;
        IIiiIiIIiI iIiiIiIIiI2 = pre;
        IIiiIiIIiI IiIIiIiiiI = iIiiIiIIiI;
        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.player.getAbilities().allowFlying) {
            return;
        }
        if (IiIIiIiiiI.iiIIIIiIII.player.isOnGround()) {
            return;
        }
        if (IiIIiIiiiI.ALLATORIxDEMO()) {
            IiIIiIiiiI.iiIIIIiIII.player.setSprinting(3 >> 1);
        }
        if (IiIIiIiiiI.ALLATORIxDEMO()) {
            IiIIiIiiiI.IiiIIIIiiI();
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(int n) {
        void IiIIiIiiiI;
        IIiiIiIIiI iIiiIiIIiI;
        IIiiIiIIiI iIiiIiIIiI2 = iIiiIiIIiI = int2ObjectOpenHashMap;
        class_1799 class_17992 = iIiiIiIIiI2.iiIIIIiIII.player.getInventory().getStack(0x6F & 0x36);
        class_1799 class_17993 = iIiiIiIIiI2.iiIIIIiIII.player.getInventory().getStack((int)IiIIiIiiiI);
        Int2ObjectOpenHashMap<class_1799> int2ObjectOpenHashMap = new Int2ObjectOpenHashMap<class_1799>();
        int2ObjectOpenHashMap.put(0x26 & 0x5F, class_17993);
        int2ObjectOpenHashMap.put((int)(IiIIiIiiiI + (0x74 & 0x2F)), class_17992);
        iIiiIiIIiI.ALLATORIxDEMO((Int2ObjectMap<class_1799>)int2ObjectOpenHashMap, (int)IiIIiIiiiI);
    }

    public void onDeactivate() {
        if (this.iiIIIIiIII.player == null) {
            return;
        }
        this.iiIIIIiIII.player.setSprinting(this.IiIIiIiiiI);
    }

    private /* synthetic */ void ALLATORIxDEMO(Int2ObjectMap<class_1799> int2ObjectMap, int n) {
        IIiiIiIIiI IiIIiIiiiI;
        int n2 = n;
        IIiiIiIIiI iIiiIiIIiI = IiIIiIiiiI = this;
        int cfr_ignored_0 = iIiiIiIIiI.iiIIIIiIII.player.currentScreenHandler.syncId;
        iIiiIiIIiI.iiIIIIiIII.player.currentScreenHandler.getRevision();
        IIIiIiIiii.ALLATORIxDEMO(0x56 & 0x2F);
        MeteorClient.mc.interactionManager.clickSlot(MeteorClient.mc.player.currentScreenHandler.syncId, 0x26 & 0x5F, n2 + (0x25 & 0x7E), class_1713.SWAP, (class_1657)MeteorClient.mc.player);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        IIiiIiIIiI iIiiIiIIiI = iIiiIiIIiI2;
        IIiiIiIIiI iIiiIiIIiI2 = receive;
        IIiiIiIIiI IiIIiIiiiI = iIiiIiIIiI;
        class_2596 class_25962 = ((PacketEvent.Receive)iIiiIiIIiI2).packet;
        if (class_25962 instanceof class_2708) {
            class_2708 cfr_ignored_0 = (class_2708)class_25962;
            return;
        }
        if (((PacketEvent.Receive)iIiiIiIIiI2).packet instanceof class_2645) {
            iIiiIiIIiI2.cancel();
        }
    }

    @Override
    public void onActivate() {
        if (this.iiIIIIiIII.player == null || this.iiIIIIiIII.player.getAbilities().allowFlying) {
            return;
        }
        if (this.iiIIIIiIII.player.isOnGround()) {
            this.error(IiiIIIiiII.IiiiiiiIIi("\u8be3\u5724\u7a79\u4e36\u6245\u5f0e\u6216\uff1e"), new Object[2 & 5]);
            this.toggle();
        }
        this.IiIIiIiiiI = this.iiIIIIiIII.player.isSprinting();
        IIiiIiIIiI.ALLATORIxDEMO();
    }

    public boolean ALLATORIxDEMO() {
        if (this.isActive() && this.iiIIIIiIII.player != null && !this.iiIIIIiIII.player.isOnGround()) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PlaySoundEvent playSoundEvent) {
        IIiiIiIIiI iIiiIiIIiI = iterator;
        Iterator<class_2960> iterator = List.of(class_2960.of((String)IIiIiIiiIi.ALLATORIxDEMO("\u001d5\u001e93\u000e\u0011:\fn\u001c-\u00104V5\u001f,\u0019(E\"\u0001)(\u001d\"6\u0019>\u0011*\u001f9")), class_2960.of((String)IiiIIIiiII.IiiiiiiIIi("fzEVHAju_\tJOK[\u0000WQVY\\\u0003PA]BCElCJOZ]^YP")), class_2960.of((String)IIiIiIiiIi.ALLATORIxDEMO("1\u001925\u001f\u0002=\u001e O0\u0001<\u0015z\f3\u001b5\u0019i\u0015-4\u0004\r\u000e\u0019<\r,\u0004;")), class_2960.of((String)IiiIIIiiII.IiiiiiiIIi("FZEVhaJUW\u0001GBK[\rZDCBG\u001eMZFsryZN^BXCQ")), class_2960.of((String)IIiIiIiiIi.ALLATORIxDEMO("19\u0012\u0015?\n5\u0013-O0\f1\u0000o\u0017(\u0006(\u0002r$\u001c\b8\f\u000f\u00137\u001a>")), class_2960.of((String)IiiIIIiiII.IiiiiiiIIi("^b}NPQZHB\u0014_W^[\u0000LG]GY\u001d\u007fsSWW`FEB[")), class_2960.of((String)IIiIiIiiIi.ALLATORIxDEMO("\u001d5>\u0019\u0013.\u00192\u0001c\u001c-\u001d9C \u00047\u00045^90\u0018\u0014!#3\u001c9\u001f4")), class_2960.of((String)IiiIIIiiII.IiiiiiiIIi("FZEVhaJUW\u0001GBK[\rZDCBG\u001eMZFsryRB^[_HG")), class_2960.of((String)IIiIiIiiIi.ALLATORIxDEMO("\u001d5\u00161\u0016+\u0014?\fn\u00045\u00137E\"\u001c%5\u001f\u001c\u007f\u001a<\r1\u0018="))).iterator();
        while (iterator.hasNext()) {
            void IiIIiIiiiI;
            if (!((class_2960)iterator.next()).equals((Object)IiIIiIiiiI.sound.getId())) continue;
            IiIIiIiiiI.cancel();
            return;
        }
    }
}

