/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiIIIiiIII;
import com.github.mikumiku.addon.iiIiIIiiii;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class IiIIiIIiII
extends iiiiIiIiii {
    private final SettingGroup iiiiiIIiiI;
    private boolean iiIIIIiIII;
    private boolean IiIIiIiiiI;
    private final Setting<Boolean> ALLATORIxDEMO;

    private /* synthetic */ void IiiiiiiIIi() {
        if (this.IiIIiIiiiI) {
            this.iiIIIIiIII.options.useKey.setPressed((2 & 5) != 0);
            this.IiIIiIiiiI = 3 & 4;
        }
    }

    public void onDeactivate() {
        this.IiiiiiiIIi();
        this.iiIIIIiIII = 3 >> 2;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        if (!this.IiIIiIiiiI) {
            this.iiIIIIiIII.options.useKey.setPressed(3 >> 1);
            this.IiIIiIiiiI = 4 ^ 5;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_1792 class_17922) {
        IiIIiIIiII iiIIiIIiII = this;
        int n = this = 2 & 5;
        while (true) {
            void IiIIiIiiiI;
            if (n >= 9) break;
            if (iiIIiIIiII.iiIIIIiIII.player.getInventory().getStack(this).getItem() == IiIIiIiiiI) {
                IiiiIiiIII.ALLATORIxDEMO(this);
                return --1 != 0;
            }
            n = ++this;
        }
        return false;
    }

    public IiIIiIIiII() {
        IiIIiIIiII iiIIiIIiII = this;
        super(iiIiIIiiii.ALLATORIxDEMO("\u7d50\u98b3\u67c7\u967c\u8466"), iiIIIiiIII.ALLATORIxDEMO("\u571b\u7a7a\u4e6b\u81bf\u52bb\u5451\u7d3f\u98d7\u678f\u76bc\u523e\u843f\u5774"));
        iiIIiIIiII.iiiiiIIiiI = iiIIiIIiII.settings.getDefaultGroup();
        iiIIiIIiII.ALLATORIxDEMO = iiIIiIIiII.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiIIiiii.ALLATORIxDEMO("\u8446\u5701\u5455\u5142\u95b6"))).description(iiIIIiiIII.ALLATORIxDEMO("\u842e\u5762\u541a\u81bf\u52bb\u513b\u95e3\u6a23\u5713"))).defaultValue((Object)(5 >> 2))).build());
        IiIIiIIiII iiIIiIIiII2 = this;
        iiIIiIIiII2.iiIIIIiIII = 3 >> 2;
        iiIIiIIiII2.IiIIiIiiiI = 3 & 4;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIiIIiiii.ALLATORIxDEMO("F\u00103]B>1\u000eA?P/tZ\u0011\u8bac\u66c5\u65eb\u5221\u677b\u6581\u7213\u671d\uff5a"));
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IiIIiIIiII iiIIiIIiII = iiIIiIIiII2;
        IiIIiIIiII iiIIiIIiII2 = pre;
        IiIIiIIiII IiIIiIiiiI = iiIIiIIiII;
        if (IiIIiIiiiI.iiIIIIiIII.player == null) {
            return;
        }
        int this2 = !IiIIiIiiiI.iiIIIIiIII.player.isOnGround() ? 5 >> 2 : 0;
        if (this2 != 0) {
            IiIIiIiiiI.iiIIIIiIII = --1;
            if (IiIIiIiiiI.IiIIiIiiiI) {
                IiIIiIiiiI.ALLATORIxDEMO();
                return;
            }
            if (!IiIIiIiiiI.ALLATORIxDEMO(class_1802.CHORUS_FRUIT)) {
                this2 = IIIiIiIiii.ALLATORIxDEMO(class_1802.CHORUS_FRUIT);
                if (this2 != -4 >> 2) {
                    IIIiIiIiii.ALLATORIxDEMO(this2);
                    IiIIiIiiiI.iiIIIIiIII.interactionManager.interactItem((class_1657)IiIIiIiiiI.iiIIIIiIII.player, IiIIiIiiiI.iiIIIIiIII.player.getActiveHand());
                    IiIIiIiiiI.ALLATORIxDEMO();
                    return;
                }
                IiIIiIiiiI.IiiiiiiIIi();
                return;
            }
            IiIIiIiiiI.ALLATORIxDEMO();
            return;
        }
        if (IiIIiIiiiI.iiIIIIiIII && IiIIiIiiiI.IiIIiIiiiI) {
            IiIIiIIiII iiIIiIIiII3 = IiIIiIiiiI;
            iiIIiIIiII3.IiiiiiiIIi();
            iiIIiIIiII3.iiIIIIiIII = 3 & 4;
            if (((Boolean)iiIIiIIiII3.ALLATORIxDEMO.get()).booleanValue()) {
                IiIIiIiiiI.toggle();
            }
        }
    }

    @Override
    public void onActivate() {
        super.onActivate();
        if (IIIiIiIiii.ALLATORIxDEMO(class_1802.CHORUS_FRUIT) == -4 >> 2) {
            this.error(iiIIIiiIII.ALLATORIxDEMO("\u6cfc\u6712\u7d63\u988c\u67c5\u4e99"), new Object[3 >> 2]);
            this.toggle();
        }
    }
}

