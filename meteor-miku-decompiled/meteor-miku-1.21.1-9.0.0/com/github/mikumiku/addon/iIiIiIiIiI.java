/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BlockSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiiIIIiiII;
import com.github.mikumiku.addon.IiiiIIiiIi;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.iiiiIiiiII;
import com.github.mikumiku.addon.modules.CometTunnel;
import java.util.Date;
import meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BlockSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

public class iIiIiIiIiI
extends iiiiIiIiii {
    private final Setting<Integer> IiiIIIiiIi;
    private int iiIIiiIiii;
    private final SettingGroup iIiiIiiiII;
    private class_2338 iIIiiIIIII;
    private final Setting<Boolean> iiIiIIiIIi;
    private int IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private CometTunnel.TunnelState iiiiiIIiiI;
    private final Setting<class_2248> iiIIIIiIII;
    private class_2338 IiIIiIiiiI;
    private class_2338 ALLATORIxDEMO;

    public void onDeactivate() {
        iIiIiIiIiI iIiIiIiIiI2 = this;
        iIiIiIiIiI iIiIiIiIiI3 = this;
        this.iiiiiIIiiI = CometTunnel.TunnelState.IiIIiIiiiI;
        iIiIiIiIiI3.ALLATORIxDEMO = null;
        iIiIiIiIiI3.IiIIiIiiiI = null;
        iIiIiIiIiI2.iiIIiiIiii = 2 & 5;
        iIiIiIiIiI2.iIIiiIIIII = null;
        iiiiIiiiII.ALLATORIxDEMO(IiiiIIiiIi.ALLATORIxDEMO("\u5f5a\u6624\u968a\u9048\u6a2c\u576c\u5ddf\u5047\u6b6f"));
    }

    private /* synthetic */ void iiIiiiiiII() {
        iIiIiIiIiI iIiIiIiIiI2 = iIiIiIiIiI4;
        if (iIiIiIiIiI2.IiIIiIiiiI == null) {
            return;
        }
        iIiIiIiIiI iIiIiIiIiI3 = iIiIiIiIiI2;
        iIiIiIiIiI iIiIiIiIiI4 = iIiIiIiIiI3.iiIIIIiIII.world.getBlockState(iIiIiIiIiI2.IiIIiIiiiI).getBlock();
        if (((Boolean)iIiIiIiIiI3.IiIiIIIIiI.get()).booleanValue() && iIiIiIiIiI4 == class_2246.BEDROCK) {
            iiiiIiiiII.ALLATORIxDEMO(IiiiIIiiIi.ALLATORIxDEMO("\u522b\u8fb3\u57c1\u5c84\u5c59\uff01\u5067\u6b4f\u630d\u6395"));
            iIiIiIiIiI2.iiiiiIIiiI = CometTunnel.TunnelState.IiIIiIiiiI;
            iIiIiIiIiI2.toggle();
            return;
        }
        if (iIiIiIiIiI4 == class_2246.BEDROCK) {
            iIiIiIiIiI2.IiiIIIIiiI();
            return;
        }
        if (iIiIiIiIiI4 != class_2246.AIR) {
            iIiIiIiIiI iIiIiIiIiI5 = iIiIiIiIiI2;
            BlockUtils.breakBlock((class_2338)iIiIiIiIiI2.IiIIiIiiiI, (2 ^ 3) != 0);
            iIiIiIiIiI5.iiIIiiIiii += --1;
            if (iIiIiIiIiI5.iiIIiiIiii >= --3) {
                iIiIiIiIiI2.iiiiiIIiiI = CometTunnel.TunnelState.iiIIIIiIII;
                iIiIiIiIiI2.IiiiiiiIIi();
                iIiIiIiIiI2.iiIIiiIiii = 3 ^ 3;
                return;
            }
        } else {
            iIiIiIiIiI iIiIiIiIiI6 = iIiIiIiIiI2;
            iIiIiIiIiI6.iiIIiiIiii += 2 ^ 3;
            if (iIiIiIiIiI6.iiIIiiIiii >= --3) {
                iIiIiIiIiI2.iiiiiIIiiI = CometTunnel.TunnelState.iiIIIIiIII;
                iIiIiIiIiI2.IiiiiiiIIi();
                iIiIiIiIiI2.iiIIiiIiii = 2 & 5;
            }
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIiIiIiIiI iIiIiIiIiI2 = iIiIiIiIiI3;
        iIiIiIiIiI iIiIiIiIiI3 = pre;
        iIiIiIiIiI IiIIiIiiiI = iIiIiIiIiI2;
        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) {
            return;
        }
        if (IiIIiIiiiI.iiiiiIIiiI == CometTunnel.TunnelState.IiIiIIIIiI || IiIIiIiiiI.iiiiiIIiiI == CometTunnel.TunnelState.IiIIiIiiiI) {
            return;
        }
        if (IiIIiIiiiI.IIIIiIiiIi > 0) {
            IiIIiIiiiI.IIIIiIiiIi -= 4 ^ 5;
            return;
        }
        switch (IiIIiIiiiI.iiiiiIIiiI.ordinal()) {
            case 2: {
                iIiIiIiIiI iIiIiIiIiI4 = IiIIiIiiiI;
                while (false) {
                }
                iIiIiIiIiI iIiIiIiIiI5 = iIiIiIiIiI4;
                iIiIiIiIiI4.iiIiiiiiII();
                break;
            }
            case 3: {
                IiIIiIiiiI.ALLATORIxDEMO();
            }
            default: {
                iIiIiIiIiI iIiIiIiIiI5 = IiIIiIiiiI;
            }
        }
        iIiIiIiIiI5.IIIIiIiiIi = (Integer)IiIIiIiiiI.IiiIIIiiIi.get();
    }

    public iIiIiIiIiI() {
        iIiIiIiIiI iIiIiIiIiI2 = this;
        super(IiiIIIiiII.IiiiiiiIIi("\u6300=\u5837u"), IiiiIIiiIi.ALLATORIxDEMO("\u632d\u001e\u5870<\u001b\u0000;\u6287\u81d1\u5ddc\u57d0\u8fd6\u4e3b\u4e07\u574a\u91c1"));
        iIiIiIiIiI2.iIiiIiiiII = iIiIiIiIiI2.settings.getDefaultGroup();
        iIiIiIiIiI2.IiIiIIIIiI = iIiIiIiIiI2.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u523b\u5e86\u81fc\u52a6\u5000\u6b26"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u522b\u8fb3\u57c1\u5c84\u5c59\u65fb\u81d1\u5285\u5047\u6b6f"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.IiiIIIiiIi = this.iIiiIiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u5eaa\u8f9b"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u64c0\u4f67\u4e66\u95ef\u7689\u5ecd\u8ff2\uff13yRNp\uff04"))).defaultValue((Object)(5 >> 1))).min(5 >> 3).max(0x35 & 0x5E).sliderMin(5 >> 3).sliderMax(0x7E & 0x15).build());
        this.iiIIIIiIII = this.iIiiIiiiII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u587d\u514b\u65e5\u5713"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u7525\u4eb5\u5846\u515e\u7689\u6582\u577a\u7c60\u5786"))).defaultValue((Object)class_2246.COBBLESTONE)).build());
        this.iiIiIIiIIi = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u81fc\u52a6\u5837\u5101"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u81e7\u5293\u5705\u8eb0\u5403\u5850\u5168\u65a2\u575a"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        iIiIiIiIiI iIiIiIiIiI3 = this;
        iIiIiIiIiI iIiIiIiIiI4 = this;
        iIiIiIiIiI iIiIiIiIiI5 = this;
        iIiIiIiIiI5.iiiiiIIiiI = CometTunnel.TunnelState.IiIIiIiiiI;
        iIiIiIiIiI5.IIIIiIiiIi = 5 >> 3;
        iIiIiIiIiI4.ALLATORIxDEMO = null;
        iIiIiIiIiI4.IiIIiIiiiI = null;
        iIiIiIiIiI3.iiIIiiIiii = 2 & 5;
        iIiIiIiIiI3.iIIiiIIIII = null;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiIIIiiII.IiiiiiiIIi("[\u007fNRxv\u000bF{wJG;g+\u8be4\u66f8\u65a4\u523b\u6713\u65a6\u7246\u6770\uff45"));
        }
    }

    private /* synthetic */ void IiiIIIIiiI() {
        if (this.IiIIiIiiiI == null) {
            return;
        }
        iIiIiIiIiI iIiIiIiIiI2 = this;
        iIiIiIiIiI2.IiIIiIiiiI = iIiIiIiIiI2.IiIIiIiiiI.down(4 ^ 5);
        if (!iIiIiIiIiI2.ALLATORIxDEMO(iIiIiIiIiI2.iiIIIIiIII.player.getBlockPos())) {
            this.warning(IiiIIIiiII.IiiiiiiIIi("\u739a\u5bbd\u5de1\u79b0\u5f13\u968c\u9060"), new Object[3 ^ 3]);
            this.iiiiiIIiiI = CometTunnel.TunnelState.IiIIiIiiiI;
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(InteractBlockEvent interactBlockEvent) {
        iIiIiIiIiI iIiIiIiIiI2 = iIiIiIiIiI3;
        iIiIiIiIiI iIiIiIiIiI3 = interactBlockEvent;
        iIiIiIiIiI IiIIiIiiiI = iIiIiIiIiI2;
        if (IiIIiIiiiI.iiiiiIIiiI != CometTunnel.TunnelState.IiIiIIIIiI) {
            return;
        }
        iIiIiIiIiI iIiIiIiIiI4 = iIiIiIiIiI3;
        iIiIiIiIiI3 = ((InteractBlockEvent)iIiIiIiIiI4).result.getBlockPos();
        iIiIiIiIiI iIiIiIiIiI5 = IiIIiIiiiI;
        iIiIiIiIiI iIiIiIiIiI6 = IiIIiIiiiI;
        iIiIiIiIiI6.ALLATORIxDEMO = iIiIiIiIiI3;
        iIiIiIiIiI6.IiIIiIiiiI = iIiIiIiIiI3;
        iIiIiIiIiI6.iiiiiIIiiI = CometTunnel.TunnelState.iiiiiIIiiI;
        iIiIiIiIiI5.iiIIiiIiii = 3 >> 2;
        iIiIiIiIiI5.iIIiiIIIII = null;
        iIiIiIiIiI4.cancel();
        iiiiIiiiII.ALLATORIxDEMO("\u8d77\u59cb\u4f4d\u7f6e\u5df2\u9009\u62e9: " + IiIIiIiiiI.ALLATORIxDEMO.toShortString());
        iiiiIiiiII.ALLATORIxDEMO(IiiIIIiiII.IiiiiiiIIi("\u5f28\u59e0\u6325\u6382\u96a5\u9075\u001e\u000f\u6329\u001c\u585c\u001c\u001c"));
    }

    @Override
    public void onActivate() {
        iIiIiIiIiI iIiIiIiIiI2 = this;
        iIiIiIiIiI iIiIiIiIiI3 = this;
        super.onActivate();
        this.iiiiiIIiiI = CometTunnel.TunnelState.IiIiIIIIiI;
        this.IIIIiIiiIi = 3 ^ 3;
        iIiIiIiIiI3.ALLATORIxDEMO = null;
        iIiIiIiIiI3.IiIIiIiiiI = null;
        iIiIiIiIiI2.iiIIiiIiii = 3 >> 2;
        iIiIiIiIiI2.iIIiiIIIII = null;
        iiiiIiiiII.ALLATORIxDEMO(IiiiIIiiIi.ALLATORIxDEMO("\u5f5a\u6624\u968a\u9048\u6a2c\u576c\u5ddf\u5434\u52a5"));
        iiiiIiiiII.ALLATORIxDEMO(IiiIIIiiII.IiiiiiiIIi("\u8bfb\u573c\u8139\u4e30\u53f2\u9537\u70af\u51f5\u65b2\u5744\u6771\u9005\u62ea\u8d6c\u59dd\u4f43\u7f69\uff1e"));
    }

    private /* synthetic */ void IiiiiiiIIi() {
        if (this.ALLATORIxDEMO == null) {
            return;
        }
        this.iIIiiIIIII = this.IiIIiIiiiI.down(--3);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iIiIiIiIiI iIiIiIiIiI2 = iIiIiIiIiI3;
        if (iIiIiIiIiI2.iIIiiIIIII == null) {
            iIiIiIiIiI2.iiiiiIIiiI = CometTunnel.TunnelState.iiiiiIIiiI;
            iIiIiIiIiI2.IiiIIIIiiI();
            return;
        }
        iIiIiIiIiI iIiIiIiIiI3 = iIiIiIiIiI2.iiIIIIiIII.world.getBlockState(iIiIiIiIiI2.iIIiiIIIII).getBlock();
        if (iIiIiIiIiI3 == class_2246.AIR || iIiIiIiIiI3 == class_2246.CAVE_AIR) {
            int this_ = IIIiIiIiii.iiIiiiiiII(((class_2248)iIiIiIiIiI2.iiIIIIiIII.get()).asItem());
            if (this_ == -4 >> 2) {
                iIiIiIiIiI iIiIiIiIiI4 = iIiIiIiIiI2;
                iIiIiIiIiI4.warning("\u80cc\u5305\u4e2d\u6ca1\u6709 " + ((class_2248)iIiIiIiIiI4.iiIIIIiIII.get()).getName().getString(), new Object[3 ^ 3]);
                iIiIiIiIiI iIiIiIiIiI5 = iIiIiIiIiI2;
                iIiIiIiIiI5.iiiiiIIiiI = CometTunnel.TunnelState.iiiiiIIiiI;
                iIiIiIiIiI5.iIIiiIIIII = null;
                return;
            }
            IIIiIiIiii.ALLATORIxDEMO(this_);
            iIiIiIiIiI iIiIiIiIiI6 = iIiIiIiIiI2;
            iiiIIIIiiI.IiIiiiIIiI(iIiIiIiIiI6.iIIiiIIIII);
            IIIiIiIiii.ALLATORIxDEMO(this_);
            IIIiIiIiii.IiiiiiiIIi();
            iIiIiIiIiI iIiIiIiIiI7 = iIiIiIiIiI2;
            iIiIiIiIiI7.info("\u5728 " + iIiIiIiIiI6.iIIiiIIIII.toShortString() + " \u653e\u7f6e " + ((class_2248)iIiIiIiIiI7.iiIIIIiIII.get()).getName().getString(), new Object[2 & 5]);
            iIiIiIiIiI iIiIiIiIiI8 = iIiIiIiIiI2;
            iIiIiIiIiI8.iIIiiIIIII = null;
            iIiIiIiIiI8.iiiiiIIiiI = CometTunnel.TunnelState.iiiiiIIiiI;
            return;
        }
        iIiIiIiIiI iIiIiIiIiI9 = iIiIiIiIiI2;
        iIiIiIiIiI9.iIIiiIIIII = null;
        iIiIiIiIiI9.iiiiiIIiiI = CometTunnel.TunnelState.iiiiiIIiiI;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2248 class_22482) {
        class_1792 IiIIiIiiiI;
        iIiIiIiIiI iIiIiIiIiI2 = this;
        IiIIiIiiiI = IiIIiIiiiI.asItem();
        int n = this = 3 ^ 3;
        while (n < iIiIiIiIiI2.iiIIIIiIII.player.getInventory().size()) {
            class_1799 class_17992 = iIiIiIiIiI2.iiIIIIiIII.player.getInventory().getStack(this);
            if (!class_17992.isEmpty() && class_17992.getItem() == IiIIiIiiiI) {
                return --1 != 0;
            }
            n = ++this;
        }
        return false;
    }

    private /* synthetic */ String ALLATORIxDEMO() {
        switch (this.iiiiiIIiiI.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                while (false) {
                }
                return IiiiIIiiIi.ALLATORIxDEMO("\u7a61\u95ff");
            }
            case 1: {
                return IiiIIIiiII.IiiiiiiIIi("\u7b66\u5fb2\u9024\u62dc");
            }
            case 2: {
                return "\u6316\u6398 (" + this.iiIIiiIiii + "/3)";
            }
            case 3: {
                return IiiiIIiiIi.ALLATORIxDEMO("\u5870\u5148");
            }
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        iIiIiIiIiI iIiIiIiIiI2 = iIiIiIiIiI3;
        iIiIiIiIiI iIiIiIiIiI3 = class_23382;
        iIiIiIiIiI IiIIiIiiiI = iIiIiIiIiI2;
        if (IiIIiIiiiI.ALLATORIxDEMO == null || IiIIiIiiiI.IiIIiIiiiI == null) {
            return false;
        }
        if (iIiIiIiIiI3.getX() == IiIIiIiiiI.ALLATORIxDEMO.getX() && iIiIiIiIiI3.getZ() == IiIIiIiiiI.ALLATORIxDEMO.getZ() && iIiIiIiIiI3.getY() <= IiIIiIiiiI.ALLATORIxDEMO.getY() && iIiIiIiIiI3.getY() >= IiIIiIiiiI.IiIIiIiiiI.getY()) {
            return (3 & 5) != 0;
        }
        return false;
    }
}

