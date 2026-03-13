/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Send
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.gui.utils.StarscriptTextBoxRenderer
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.block.AnvilBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket
 *  net.minecraft.network.packet.s2c.play.InventoryS2CPacket
 *  net.minecraft.network.packet.c2s.play.RenameItemC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiIIIIII;
import com.github.mikumiku.addon.iIIIiiiiII;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.mixinface.IClientPlayerInteractionManager;
import com.github.mikumiku.addon.nerv_printer.modules.MapNamer;
import java.util.ArrayList;
import java.util.Date;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.gui.utils.StarscriptTextBoxRenderer;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.block.AnvilBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket;
import net.minecraft.network.packet.s2c.play.InventoryS2CPacket;
import net.minecraft.network.packet.c2s.play.RenameItemC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.client.MinecraftClient;

public class iIIIIiIiIi
extends iiiiIiIiii {
    public ArrayList<Integer> iIIiIIiiII;
    public final Setting<String> IiiIIiiiiI;
    public int IiIIIIiiii;
    public int IiiIIIiiIi;
    private final SettingGroup iiIIiiIiii;
    private final Setting<Integer> iIiiIiiiII;
    private final Setting<Integer> iIIiiIIIII;
    private final Setting<Integer> iiIiIIiIIi;
    public int IIIIiIiiIi;
    private final Setting<Integer> IiIiIIIIiI;
    private final Setting<MapNamer.Order> iiiiiIIiiI;
    public MapNamer.State iiIIIIiIII;
    private final Setting<Integer> IiIIiIiiiI;
    public final Setting<String> ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Send send) {
        iIIIIiIiIi iIIIIiIiIi2 = iIIIIiIiIi3;
        iIIIIiIiIi iIIIIiIiIi3 = send;
        iIIIIiIiIi IiIIiIiiiI = iIIIIiIiIi2;
        if (IiIIiIiiiI.iiIIIIiIII == MapNamer.State.IiIIiIiiiI && (iIIIIiIiIi3 = ((PacketEvent.Send)iIIIIiIiIi3).packet) instanceof class_2885 && ((class_310)IiIIiIiiiI.iiIIIIiIII).world.getBlockState((class_2338)(iIIIIiIiIi3 = ((class_2885)iIIIIiIiIi3).getBlockHitResult().getBlockPos())).getBlock() instanceof class_2199) {
            IiIIiIiiiI.iiIIIIiIII = MapNamer.State.iiIIIIiIII;
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        int n;
        iIIIIiIiIi iIIIIiIiIi2 = iIIIIiIiIi3;
        iIIIIiIiIi iIIIIiIiIi3 = receive;
        iIIIIiIiIi IiIIiIiiiI = iIIIIiIiIi2;
        if (IiIIiIiiiI.iiIIIIiIII == MapNamer.State.iiiiiIIiiI && ((PacketEvent.Receive)iIIIIiIiIi3).packet instanceof class_2645) {
            IiIIiIiiiI.info(iIIIiiiiII.ALLATORIxDEMO("!\u0001\u001c\b\u001a\u0007\u0003\u0019\u0011O\u0019\u000e\u0006\u0016JF@\u0004\t\r\u0016\u0007\nGO!A\\\r\u001d),<o?&<'H\u000e&o\t\u0001>&\u0004A"), new Object[3 & 4]);
            IiIIiIiiiI.iiIIIIiIII = MapNamer.State.IiIIiIiiiI;
            return;
        }
        if (IiIIiIiiiI.iiIIIIiIII != MapNamer.State.iiIIIIiIII) {
            return;
        }
        class_2596 class_25962 = ((PacketEvent.Receive)iIIIIiIiIi3).packet;
        if (class_25962 instanceof class_2855) {
            if (!((class_2855)class_25962).getName().startsWith((String)IiIIiIiiiI.ALLATORIxDEMO.get())) {
                iIIIIiIiIi3.cancel();
            }
        }
        if (!((class_25962 = ((PacketEvent.Receive)iIIIIiIiIi3).packet) instanceof class_2649)) {
            return;
        }
        class_2649 cfr_ignored_0 = (class_2649)class_25962;
        if ((Integer)IiIIiIiiiI.IiIIiIiiiI.get() > (Integer)IiIIiIiiiI.IiIiIIIIiI.get() || (Integer)IiIIiIiiiI.iIIiiIIIII.get() > (Integer)IiIIiIiiiI.iiIiIIiIIi.get()) {
            IiIIiIiiiI.warning(IIiiIIIIII.ALLATORIxDEMO("k\u001fGB\t_[\u0014S\u001fOQU\u0003\u001d\\\u001c\u0005]2hwn?{9:\u0012T3:\u001eT3\u007f\u000f\u0014"), new Object[3 & 4]);
            return;
        }
        IiIIiIiiiI.iIIiIIiiII.clear();
        int n2 = n = 3 >> 2;
        while (n2 < ((class_310)IiIIiIiiiI.iiIIIIiIII).player.getInventory().size()) {
            class_1799 class_17992;
            int this_ = n;
            if (IiIIiIiiiI.iiiiiIIiiI.get() == MapNamer.Order.iiIIIIiIII) {
                this_ = ((class_310)IiIIiIiiiI.iiIIIIiIII).player.getInventory().size() - n - --1;
            }
            if ((class_17992 = ((class_310)IiIIiIiiiI.iiIIIIiIII).player.getInventory().getStack(this_)).getItem() == class_1802.FILLED_MAP && class_17992.getName().getString().equals(iIIIiiiiII.ALLATORIxDEMO("\u0002\t\u001f"))) {
                iIIIIiIiIi iIIIIiIiIi4;
                if (this_ < (0x6D & 0x1B)) {
                    iIIIIiIiIi4 = IiIIiIiiiI;
                    this_ += 30;
                } else {
                    this_ -= 6;
                    iIIIIiIiIi4 = IiIIiIiiiI;
                }
                iIIIIiIiIi4.iIIiIIiiII.add(this_);
            }
            n2 = ++n;
        }
        IiIIiIiiiI.IiIIIIiiii = (Integer)IiIIiIiiiI.iIiiIiiiII.get();
        IiIIiIiiiI.iiIIIIiIII = MapNamer.State.iiiiiIIiiI;
    }

    @Override
    public void onActivate() {
        iIIIIiIiIi iIIIIiIiIi2 = this;
        iIIIIiIiIi iIIIIiIiIi3 = this;
        iIIIIiIiIi iIIIIiIiIi4 = this;
        iIIIIiIiIi3.iIIiIIiiII = new ArrayList();
        iIIIIiIiIi3.iiIIIIiIII = MapNamer.State.IiIIiIiiiI;
        iIIIIiIiIi3.IiIIIIiiii = 3 ^ 3;
        iIIIIiIiIi2.IiiIIIiiIi = -4 >> 2;
        iIIIIiIiIi2.IIIIiIiiIi = -4 >> 2;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIIIIiIiIi iIIIIiIiIi2 = iIIIIiIiIi3;
        iIIIIiIiIi iIIIIiIiIi3 = pre;
        iIIIIiIiIi IiIIiIiiiI = iIIIIiIiIi2;
        if (IiIIiIiiiI.IiIIIIiiii == 0 || IiIIiIiiiI.iiIIIIiIII != MapNamer.State.iiiiiIIiiI) {
            return;
        }
        iIIIIiIiIi iIIIIiIiIi4 = IiIIiIiiiI;
        iIIIIiIiIi4.IiIIIIiiii -= 4 ^ 5;
        if (iIIIIiIiIi4.IiIIIIiiii == 0 && !IiIIiIiiiI.iIIiIIiiII.isEmpty()) {
            if (((class_310)IiIIiIiiiI.iiIIIIiIII).player.experienceLevel < (4 ^ 5)) {
                IiIIiIiiiI.info(IIiiIIIIII.ALLATORIxDEMO("\u0019u#:\u0012T8o\u0010RwB'\u0014"), new Object[3 >> 2]);
                IiIIiIiiiI.iiIIIIiIII = MapNamer.State.IiIIiIiiiI;
                if (((class_310)IiIIiIiiiI.iiIIIIiIII).currentScreen != null) {
                    ((class_310)IiIIiIiiiI.iiIIIIiIII).player.closeHandledScreen();
                }
                return;
            }
            int this22 = IiIIiIiiiI.iIIiIIiiII.remove(5 >> 3);
            if (IiIIiIiiiI.IiiIIIiiIi == -4 >> 2) {
                IiIIiIiiiI.IiiIIIiiIi = (Integer)IiIIiIiiiI.IiIIiIiiiI.get();
            }
            if (IiIIiIiiiI.IIIIiIiiIi == -4 >> 2) {
                IiIIiIiiiI.IIIIiIiiIi = (Integer)IiIIiIiiiI.iIIiiIIIII.get();
            }
            IClientPlayerInteractionManager iClientPlayerInteractionManager = (IClientPlayerInteractionManager)((class_310)IiIIiIiiiI.iiIIIIiIII).interactionManager;
            iIIIIiIiIi iIIIIiIiIi5 = IiIIiIiiiI;
            iClientPlayerInteractionManager.clickSlot(((class_310)iIIIIiIiIi5.iiIIIIiIII).player.currentScreenHandler.syncId, this22, 3 & 5, class_1713.QUICK_MOVE, (class_1657)((class_310)IiIIiIiiiI.iiIIIIiIII).player);
            iIIIIiIiIi iIIIIiIiIi6 = IiIIiIiiiI;
            String this22 = (String)iIIIIiIiIi5.ALLATORIxDEMO.get() + iIIIIiIiIi6.IiiIIIiiIi + String.valueOf(iIIIIiIiIi6.IiiIIiiiiI) + IiIIiIiiiI.IIIIiIiiIi;
            iIIIIiIiIi iIIIIiIiIi7 = IiIIiIiiiI;
            IiIIiIiiiI.iiIIIIiIII.getNetworkHandler().sendPacket((class_2596)new class_2855(this22));
            iClientPlayerInteractionManager.clickSlot(((class_310)iIIIIiIiIi7.iiIIIIiIII).player.currentScreenHandler.syncId, --2, 3 >> 1, class_1713.QUICK_MOVE, (class_1657)((class_310)IiIIiIiiiI.iiIIIIiIII).player);
            iIIIIiIiIi7.IIIIiIiiIi += 4 ^ 5;
            if (iIIIIiIiIi7.IIIIiIiiIi > (Integer)IiIIiIiiiI.iiIiIIiIIi.get()) {
                iIIIIiIiIi iIIIIiIiIi8 = IiIIiIiiiI;
                iIIIIiIiIi8.IIIIiIiiIi = 3 >> 2;
                iIIIIiIiIi8.IiiIIIiiIi += 2 ^ 3;
                if (iIIIIiIiIi8.IiiIIIiiIi > (Integer)IiIIiIiiiI.IiIiIIIIiI.get()) {
                    iIIIIiIiIi iIIIIiIiIi9;
                    iIIIIiIiIi iIIIIiIiIi10 = IiIIiIiiiI;
                    if (IiIIiIiiiI.iIIiIIiiII.isEmpty()) {
                        iIIIIiIiIi10.info(iIIIiiiiII.ALLATORIxDEMO("7\u001cBX\f\u0002\u0011\u0007E\u000f\u000f\u0019O\u001fN[H\u001c=,+*;<.:\u0004\u00031o\u0006\u000e%*\fA"), new Object[3 & 4]);
                        iIIIIiIiIi iIIIIiIiIi11 = IiIIiIiiiI;
                        IiIIiIiiiI.IiIIiIiiiI.set((Object)(5 >> 3));
                        iIIIIiIiIi9 = iIIIIiIiIi11;
                        iIIIIiIiIi11.iIIiiIIIII.set((Object)(5 >> 3));
                    } else {
                        iIIIIiIiIi10.info(IIiiIIIIII.ALLATORIxDEMO(">Q\u0005_UU\nV\u0000\u001e\u0011U\u0000V\u000f\u0006D\u0015\u001e\\Z@\u0013C\u0019\u001c\u0015ST%W[9~w\u007f9~\u000e:\u0013_$y\u0005S5\u007f\u0013\u0014"), new Object[3 ^ 3]);
                        iIIIIiIiIi9 = IiIIiIiiiI;
                    }
                    if (((class_310)iIIIIiIiIi9.iiIIIIiIII).currentScreen != null) {
                        ((class_310)IiIIiIiiiI.iiIIIIiIII).player.closeHandledScreen();
                    }
                    IiIIiIiiiI.toggle();
                    return;
                }
            }
            if (IiIIiIiiiI.iIIiIIiiII.isEmpty()) {
                iIIIIiIiIi iIIIIiIiIi12 = IiIIiIiiiI;
                iIIIIiIiIi iIIIIiIiIi13 = IiIIiIiiiI;
                iIIIIiIiIi12.IiIIiIiiiI.set((Object)iIIIIiIiIi13.IiiIIIiiIi);
                iIIIIiIiIi iIIIIiIiIi14 = IiIIiIiiiI;
                iIIIIiIiIi14.iIIiiIIIII.set((Object)iIIIIiIiIi14.IIIIiIiiIi);
                IiIIiIiiiI.iiIIIIiIII = MapNamer.State.IiIIiIiiiI;
                iIIIIiIiIi13.info("All maps in inventory named. Progress (x: " + iIIIIiIiIi12.IiiIIIiiIi + ", y: " + IiIIiIiiiI.IIIIiIiiIi + ") saved. Interact with an anvil with the next batch in the inventory.", new Object[2 & 5]);
                if (((class_310)IiIIiIiiiI.iiIIIIiIII).currentScreen != null) {
                    ((class_310)IiIIiIiiiI.iiIIIIiIII).player.closeHandledScreen();
                    return;
                }
            } else {
                IiIIiIiiiI.IiIIIIiiii = (Integer)IiIIiIiiiI.iIiiIiiiII.get();
            }
        }
    }

    public iIIIIiIiIi() {
        iIIIIiIiIi iIIIIiIiIi2 = this;
        super(iiiiIiIiii.IiIiIIIIiI, IIiiIIIIII.ALLATORIxDEMO("\u570a\u56a9\u5467\u547a\u5652"), iIIIiiiiII.ALLATORIxDEMO("\u4f13\u7543\u6854\u5f60\u8180\u52c5\u5409\u547e\u7205\u54aa\u6867\u4e42\u76ee\u575d\u568aI\u571f\u56d6\u546d\u7997EIE:NBO\u526e\u96bb\u7b0eHDh\u0016\u304a\u57b5\u4ec6o&*\u001a\u0019\u0017?\u001a\u0006&;\r\u001d"));
        iIIIIiIiIi2.iiIIiiIiii = iIIIIiIiIi2.settings.getDefaultGroup();
        iIIIIiIiIi2.IiIIiIiiiI = iIIIIiIiIi2.iiIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u8d4d\u599cB\u5727\u683d"))).description(iIIIiiiiII.ALLATORIxDEMO("\u577f\u56b6\u67d5\u4e76\u5edb\u8b8d\u4ea1\u54a2\u4e650\u7d4d\u5f5d\u5f4f\u59a3\u306d"))).defaultValue((Object)(3 ^ 3))).min(3 & 4).sliderRange(5 >> 3, 0x2B & 0x5E).build());
        this.IiIiIIIIiI = this.iiIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u7ee9\u6708B\u5727\u683d"))).description(iIIIiiiiII.ALLATORIxDEMO("\u5778\u56b1\u76ec\u676f\u596f\u0017\u5054\u306d"))).defaultValue((Object)(3 & 4))).min(3 & 4).sliderRange(2 & 5, 0xE & 0x7B).build());
        this.iIIiiIIIII = this.iiIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u8d4d\u599cC\u5727\u683d"))).description(iIIIiiiiII.ALLATORIxDEMO("\u577f\u56b6\u67d5\u4e76\u5edb\u8b8d\u4ea1\u54a2\u4e651\u7d4d\u5f5d\u5f4f\u59a3\u306d"))).defaultValue((Object)(3 ^ 3))).min(3 >> 2).sliderRange(3 >> 2, 0x4E & 0x3B).build());
        this.iiIiIIiIIi = this.iiIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u7ee9\u6708C\u5727\u683d"))).description(iIIIiiiiII.ALLATORIxDEMO("\u5778\u56b1\u76ec\u676f\u596f\u0016\u5054\u306d"))).defaultValue((Object)(3 & 4))).min(3 & 4).sliderRange(3 & 4, 0x2E & 0x5B).build());
        this.ALLATORIxDEMO = this.iiIIiiIiii.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u5767\u56e4\u547a\u79ca"))).description(iIIIiiiiII.ALLATORIxDEMO("\u5758\u5691\u7221\u548e\u76ec\u5462\u79b8\u5202\u7f68\u306d"))).defaultValue((Object)IIiiIIIIII.ALLATORIxDEMO("\u572a\u5689e"))).wide().renderer(StarscriptTextBoxRenderer.class).build());
        this.IiiIIiiiiI = this.iiIIiiIiii.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iIIIiiiiII.ALLATORIxDEMO("\u5249\u96fc\u7b49"))).description(IIiiIIIIII.ALLATORIxDEMO("\u000f\u5496.\u7d18\u5f42\u4e51\u9583\u76be\u5251\u968e\u7b51\u3038"))).defaultValue((Object)iIIIiiiiII.ALLATORIxDEMO("0"))).wide().renderer(StarscriptTextBoxRenderer.class).build());
        this.iIiiIiiiII = this.iiIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u91f7\u542a\u5417\u5e81\u8fe5"))).description(iIIIiiiiII.ALLATORIxDEMO("\u5778\u56b1\u9185\u5432\u5445\u4e04\u959c\u76eb\u5ebe\u8f90\u659e\u959b`\u5274A\u306d"))).defaultValue((Object)(0x5B & 0x2E))).min(3 >> 1).sliderRange(--1, 0x7F & 0x14).build());
        this.iiiiiIIiiI = this.iiIIiiIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u542a\u5417\u980d\u5eb5"))).description(iIIIiiiiII.ALLATORIxDEMO("\u5759\u5691\u5415\u5422\u76ac\u9812\u5ee0\u304a\u69b2\u4f05ouo\u5fa3\u6338\u6867D\u7221\u548e\u6867\u4ea1\u5dae\u527f\u539b\u306d"))).defaultValue((Object)MapNamer.Order.ALLATORIxDEMO)).build());
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiiIIIIII.ALLATORIxDEMO(" QU\u001c\u0004_wo'~6n2;W\u8bcd\u66a3\u65aa\u5247\u673a\u65e7\u7252\u675b\uff3b"));
        }
    }
}

