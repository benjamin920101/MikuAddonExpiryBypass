/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.item.ItemStack
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.ingame.HandledScreen
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIIIiiIi;
import com.github.mikumiku.addon.IIiIiiIIiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.InventoryPrinter;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreen;

public class iIIiIIiiIi
extends iiiiIiIiii {
    private final Setting<Boolean> iiIiIIiIIi;
    private final Setting<Boolean> IIIIiIiiIi;
    private boolean IiIiIIIIiI;
    private int iiiiiIIiiI;
    private final SettingGroup iiIIIIiIII;
    private final Setting<InventoryPrinter.Mode> IiIIiIiiiI;
    private final Setting<Boolean> ALLATORIxDEMO;

    private /* synthetic */ void IiiiiiiIIi() {
        class_1799 class_17992;
        iIIiIIiiIi iIIiIIiiIi2 = this;
        iIIiIIiiIi2.info(IIiIiiIIiI.ALLATORIxDEMO("X\u001cx!\u73ec\u5bb7\u5ef6\u5b79\u4f84\u604ee<X\u001c"), new Object[3 ^ 3]);
        iIIiIIiiIi iIIiIIiiIi3 = iIIiIIiiIi2;
        class_1661 class_16612 = iIIiIIiiIi3.iiIIIIiIII.player.getInventory();
        int n = class_16612.size();
        int n2 = 3 >> 2;
        iIIiIIiiIi3.info("\u603b\u69fd\u4f4d\u6570: " + n, new Object[3 >> 2]);
        iIIiIIiiIi2.info(IIIIIIiiIi.ALLATORIxDEMO("'z'W\u5fc1\u6320\u6805w\"G\u0007O\u0003w'Z\u0007"), new Object[2 & 5]);
        int n3 = class_17993 = 3 ^ 3;
        while (true) {
            if (n3 >= 9) break;
            class_17992 = class_16612.getStack(class_17993);
            if (!class_17992.isEmpty() || ((Boolean)iIIiIIiiIi2.IIIIiIiiIi.get()).booleanValue()) {
                iIIiIIiiIi2.ALLATORIxDEMO(class_17993, class_17992, IIiIiiIIiI.ALLATORIxDEMO("\u5fea\u6312\u682e"));
                if (!class_17992.isEmpty()) {
                    ++n2;
                }
            }
            n3 = ++class_17993;
        }
        iIIiIIiiIi2.info(IIIIIIiiIi.ALLATORIxDEMO("z'z*\u4e4c\u5eb9\u5b0f*\u007f3Z\u0019B\u0003w'Z\u0007"), new Object[3 & 4]);
        int n4 = class_17993 = 0x79 & 0xF;
        while (true) {
            if (n4 >= 36) break;
            class_17992 = class_16612.getStack(class_17993);
            if (!class_17992.isEmpty() || ((Boolean)iIIiIIiiIi2.IIIIiIiiIi.get()).booleanValue()) {
                iIIiIIiiIi2.ALLATORIxDEMO(class_17993, class_17992, IIiIiiIIiI.ALLATORIxDEMO("\u4e3a\u5ef6\u5b79"));
                if (!class_17992.isEmpty()) {
                    ++n2;
                }
            }
            n4 = ++class_17993;
        }
        iIIiIIiiIi2.info(IIIIIIiiIi.ALLATORIxDEMO("\u0007z'w\u88cf\u5970\u6825w\"d<Z\u0019N\u0003w'Z\u0007"), new Object[3 >> 2]);
        int n5 = class_17993 = 0x36 & 0x6D;
        while (true) {
            if (n5 >= 40) break;
            class_17992 = class_16612.getStack(class_17993);
            if (!class_17992.isEmpty() || ((Boolean)iIIiIIiiIi2.IIIIiIiiIi.get()).booleanValue()) {
                iIIiIIiiIi iIIiIIiiIi4 = iIIiIIiiIi2;
                String string = iIIiIIiiIi4.ALLATORIxDEMO(class_17993);
                iIIiIIiiIi4.ALLATORIxDEMO(class_17993, class_17992, string);
                if (!class_17992.isEmpty()) {
                    ++n2;
                }
            }
            n5 = ++class_17993;
        }
        iIIiIIiiIi2.info(IIiIiiIIiI.ALLATORIxDEMO(",H\fe\u526e\u620e!M\u0015U\be,H\f"), new Object[3 >> 2]);
        class_1799 class_17993 = class_16612.getStack(0x7D & 0x2A);
        if (!class_17993.isEmpty() || ((Boolean)iIIiIIiiIi2.IIIIiIiiIi.get()).booleanValue()) {
            iIIiIIiiIi2.ALLATORIxDEMO(0x7C & 0x2B, class_17993, IIIIIIiiIi.ALLATORIxDEMO("\u5218\u6261"));
            if (!class_17993.isEmpty()) {
                ++n2;
            }
        }
        iIIiIIiiIi2.info("\u73a9\u5bb6\u5e93\u5b58\u7edf\u8ba1: " + n2 + " \u4e2a\u975e\u7a7a\u69fd\u4f4d / " + n + " \u603b\u69fd\u4f4d", new Object[3 ^ 3]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ String ALLATORIxDEMO(int n) {
        int n2 = n;
        iIIiIIiiIi IiIIiIiiiI = this;
        switch (n2) {
            case 36: {
                return IIiIiiIIiI.ALLATORIxDEMO("\u9711\u5b71");
            }
            case 37: {
                return IIIIIIiiIi.ALLATORIxDEMO("\u62d3\u8155");
            }
            case 38: {
                return IIiIiiIIiI.ALLATORIxDEMO("\u809d\u7513");
            }
            case 39: {
                return IIIIIIiiIi.ALLATORIxDEMO("\u5943\u76fe");
            }
        }
        return IIiIiiIIiI.ALLATORIxDEMO("\u88a0\u5926");
    }

    @Override
    public void onActivate() {
        if (this.iiIIIIiIII.player == null || this.iiIIIIiIII.world == null) {
            this.error(IIiIiiIIiI.ALLATORIxDEMO("\u73cc\u5b97\u6273\u4e37\u7509\u4e3b\u7a1f\uff20"), new Object[2 & 5]);
            this.toggle();
            return;
        }
        this.IiIiIIIIiI = 3 >> 2;
        this.iiiiiIIiiI = 3 >> 2;
        this.info("\u5e93\u5b58\u6253\u5370\u5668\u5df2\u6fc0\u6d3b - \u6a21\u5f0f: " + ((InventoryPrinter.Mode)((Object)this.IiIIiIiiiI.get())).name(), new Object[3 & 4]);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(int n, class_1799 class_17992, String string) {
        iIIiIIiiIi iIIiIIiiIi2;
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        iIIiIIiiIi iIIiIIiiIi3 = iIIiIIiiIi4;
        iIIiIIiiIi iIIiIIiiIi4 = class_17992;
        iIIiIIiiIi IiIIiIiiiI3 = iIIiIIiiIi3;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(IIIIIIiiIi.ALLATORIxDEMO("\u69f7\u4f3a\n")).append((int)IiIIiIiiiI2).append(IIiIiiIIiI.ALLATORIxDEMO("Ez")).append((String)IiIIiIiiiI).append(IIIIIIiiIi.ALLATORIxDEMO("WM\n"));
        StringBuilder stringBuilder2 = stringBuilder;
        if (iIIiIIiiIi4.isEmpty()) {
            stringBuilder2.append(IIiIiiIIiI.ALLATORIxDEMO("\u7a5b"));
            iIIiIIiiIi2 = IiIIiIiiiI3;
        } else {
            stringBuilder2.append(iIIiIIiiIi4.getItem().getName().getString());
            if (((Boolean)IiIIiIiiiI3.iiIiIIiIIi.get()).booleanValue()) {
                stringBuilder.append(IIIIIIiiIi.ALLATORIxDEMO("WR")).append(iIIiIIiiIi4.getCount());
            }
            if (!iIIiIIiiIi4.getComponents().isEmpty()) {
                stringBuilder.append(IIiIiiIIiI.ALLATORIxDEMO("E\t\u674c\u6571\u630b\b"));
            }
            if (iIIiIIiiIi4.isDamaged()) {
                stringBuilder.append(IIIIIIiiIi.ALLATORIxDEMO("W\u0002\u8047\u4e4fM\n")).append(iIIiIIiiIi4.getMaxDamage() - iIIiIIiiIi4.getDamage()).append(IIiIiiIIiI.ALLATORIxDEMO("\u000e")).append(iIIiIIiiIi4.getMaxDamage()).append(IIIIIIiiIi.ALLATORIxDEMO("\u0003"));
            }
            iIIiIIiiIi2 = IiIIiIiiiI3;
        }
        iIIiIIiiIi2.info(stringBuilder.toString(), new Object[3 & 4]);
    }

    public iIIiIIiiIi() {
        iIIiIIiiIi iIIiIIiiIi2 = this;
        super(IIIIIIiiIi.ALLATORIxDEMO("\u5ec4\u5b52\u6224\u535a"), IIiIiiIIiI.ALLATORIxDEMO("\u6216\u5371\u5ed6\u5b59\u6998\u4f6c\u4f84\u604e\u5275\u804b\u594c\u682e"));
        iIIiIIiiIi2.iiIIIIiIII = iIIiIIiiIi2.settings.getDefaultGroup();
        iIIiIIiiIi2.IiIIiIiiiI = iIIiIIiiIi2.iiIIIIiIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO(":e\u0013O"))).description(IIiIiiIIiI.ALLATORIxDEMO("2I$ueu\n\u0001\u0015S,o\u0011\u000f"))).defaultValue((Object)InventoryPrinter.Mode.IiIIiIiiiI)).build());
        this.IIIIiIiiIi = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("C9i;\u007f\u0013OZO:z\u0003S"))).description(IIiIiiIIiI.ALLATORIxDEMO("k\b\u000eE\u001dH\r\f\u0006J\u0012R[F\u0016M*u6!\fOeu-dEN\u0010U5t\u0011\u000f"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iiIiIIiIIi = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("$b\u0018]ZI8\u007f\u0019^"))).description(IIiIiiIIiI.ALLATORIxDEMO(";D\u0007[CN\u0016COF\u0006N0o1!\u0003N7! `\u0006IER)n\u0011\u000f"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.ALLATORIxDEMO = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u0004B8}zy\u001bE\u0003\u0007#s\u0007O"))).description(IIiIiiIIiI.ALLATORIxDEMO("\u007f\u000bH\u0015\u0006Q\n\nUeu<q\u0000\u0001,o#n\u0017L\u0004U,n\u000b\u000f"))).defaultValue((Object)((2 & 5) != 0))).build());
        iIIiIIiiIi iIIiIIiiIi3 = this;
        iIIiIIiiIi3.IiIiIIIIiI = 3 ^ 3;
        iIIiIIiiIi3.iiiiiIIiiI = 5 >> 3;
        iIIiIIiiIi3.iiIIIIiIII = class_310.getInstance();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIIIIIiiIi.ALLATORIxDEMO(" AU\f\u0004Ow\u007f'n\u0016^2+w\u8bfd\u6683\u659a\u5247\u672a\u65e7\u7242\u675b\uff2b"));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        Object object;
        class_1735 class_17352;
        class_1799 class_17992;
        iIIiIIiiIi iIIiIIiiIi2 = this;
        if (!(iIIiIIiiIi2.iiIIIIiIII.currentScreen instanceof class_465)) {
            iIIiIIiiIi2.info(IIiIiiIIiI.ALLATORIxDEMO("X\u001cx!\u5f16\u524c\u5bdc\u5649\u4f84\u604ee<X\u001c"), new Object[3 & 4]);
            iIIiIIiiIi2.info(IIIIIIiiIi.ALLATORIxDEMO("\u6cab\u677e\u6279\u5f77\u76ae\u5bee\u5662\u753b\u9748"), new Object[3 & 4]);
            return;
        }
        class_465 class_4652 = (class_465)iIIiIIiiIi2.iiIIIIiIII.currentScreen;
        class_1703 class_17032 = class_4652.getScreenHandler();
        iIIiIIiiIi2.info(IIiIiiIIiI.ALLATORIxDEMO("X\u001cx!\u5f16\u524c\u5bdc\u5649\u4f84\u604ee<X\u001c"), new Object[5 >> 3]);
        iIIiIIiiIi2.info("\u5bb9\u5668\u7c7b\u578b: " + class_4652.getClass().getSimpleName(), new Object[3 >> 2]);
        iIIiIIiiIi2.info("\u603b\u69fd\u4f4d\u6570: " + class_17032.slots.size(), new Object[3 ^ 3]);
        int n = class_17032.slots.size() - (0x7D & 0x26);
        int n2 = 3 >> 2;
        iIIiIIiiIi2.info("--- \u5bb9\u5668\u69fd\u4f4d (0-" + (n - (3 & 5)) + ") ---", new Object[3 ^ 3]);
        int n3 = this = 5 >> 3;
        while (n3 < n) {
            if (this < class_17032.slots.size() && (!(class_17992 = (class_17352 = (class_1735)class_17032.slots.get(this)).getStack()).isEmpty() || ((Boolean)iIIiIIiiIi2.IIIIiIiiIi.get()).booleanValue())) {
                object = IIIIIIiiIi.ALLATORIxDEMO("\u5bce\u5642");
                if (((Boolean)iIIiIIiiIi2.ALLATORIxDEMO.get()).booleanValue()) {
                    object = (String)object + " [" + class_17352.getClass().getSimpleName() + "]";
                }
                iIIiIIiiIi2.ALLATORIxDEMO(this, class_17992, (String)object);
                if (!class_17992.isEmpty()) {
                    ++n2;
                }
            }
            n3 = ++this;
        }
        iIIiIIiiIi2.info("--- \u73a9\u5bb6\u5e93\u5b58\u90e8\u5206 (" + n + "-" + (class_17032.slots.size() - (2 ^ 3)) + ") ---", new Object[3 >> 2]);
        int n4 = this = n;
        while (n4 < class_17032.slots.size()) {
            if (this < class_17032.slots.size() && (!(class_17992 = (class_17352 = (class_1735)class_17032.slots.get(this)).getStack()).isEmpty() || ((Boolean)iIIiIIiiIi2.IIIIiIiiIi.get()).booleanValue())) {
                object = IIiIiiIIiI.ALLATORIxDEMO("\u73ec\u5bb7\u5ef6\u5b79");
                if (((Boolean)iIIiIIiiIi2.ALLATORIxDEMO.get()).booleanValue()) {
                    object = (String)object + " [" + class_17352.getClass().getSimpleName() + "]";
                }
                iIIiIIiiIi2.ALLATORIxDEMO(this, class_17992, (String)object);
            }
            n4 = ++this;
        }
        iIIiIIiiIi2.info("\u5bb9\u5668\u7edf\u8ba1: " + n2 + " \u4e2a\u975e\u7a7a\u69fd\u4f4d / " + n + " \u5bb9\u5668\u69fd\u4f4d", new Object[2 & 5]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIIiIIiiIi iIIiIIiiIi2 = iIIiIIiiIi3;
        iIIiIIiiIi iIIiIIiiIi3 = pre;
        iIIiIIiiIi IiIIiIiiiI = iIIiIIiiIi2;
        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null || IiIIiIiiiI.IiIiIIIIiI) {
            return;
        }
        iIIiIIiiIi iIIiIIiiIi4 = IiIIiIiiiI;
        iIIiIIiiIi4.iiiiiIIiiI += 5 >> 2;
        if (iIIiIIiiIi4.iiiiiIIiiI < --3) {
            return;
        }
        try {
            switch (((InventoryPrinter.Mode)((Object)IiIIiIiiiI.IiIIiIiiiI.get())).ordinal()) {
                case 0: {
                    IiIIiIiiiI.IiiiiiiIIi();
                    break;
                }
                case 1: {
                    IiIIiIiiiI.ALLATORIxDEMO();
                    break;
                }
                case 2: {
                    IiIIiIiiiI.IiiiiiiIIi();
                    IiIIiIiiiI.info(IIiIiiIIiI.ALLATORIxDEMO(",h,E\u5227\u96f1\u7e9ee,H\f"), new Object[3 ^ 3]);
                    IiIIiIiiiI.ALLATORIxDEMO();
                }
            }
        } catch (Exception this2) {
            IiIIiIiiiI.error("\u6253\u5370\u5e93\u5b58\u65f6\u51fa\u9519: " + this2.getMessage(), new Object[3 >> 2]);
        }
        IiIIiIiiiI.IiIiIIIIiI = --1;
        IiIIiIiiiI.info(IIIIIIiiIi.ALLATORIxDEMO("\u6259\u5327\u5b86\u6267\uff26\u819d\u5282\u5124\u95e7\u6a56\u577d"), new Object[3 >> 2]);
        IiIIiIiiiI.toggle();
    }

    public void onDeactivate() {
        this.info(IIIIIIiiIi.ALLATORIxDEMO("\u5ee4\u5b72\u6224\u535a\u563f\u5df8\u5104\u95c7"), new Object[3 ^ 3]);
    }
}

