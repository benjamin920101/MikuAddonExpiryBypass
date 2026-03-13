/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.pathing.NopPathManager
 *  meteordevelopment.meteorclient.pathing.PathManagers
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.misc.input.Input
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIiiiiIi;
import com.github.mikumiku.addon.IiIIiIIIIi;
import com.github.mikumiku.addon.IiiIiiIIIi;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.MEnum;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.pathing.NopPathManager;
import meteordevelopment.meteorclient.pathing.PathManagers;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.misc.input.Input;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIIiiiIIii
extends iiiiIiIiii {
    private int iIIiiIIIII;
    private final Setting<MEnum.WalkMode> iiIiIIiIIi;
    private final SettingGroup IIIIiIiiIi;
    public class_310 iiIIIIiIII;
    private final Setting<Boolean> IiIiIIIIiI;
    private final Setting<Boolean> iiiiiIIiiI;
    private static final int iiIIIIiIII = 20;
    private final Setting<MEnum.WalkDirection> IiIIiIiiiI;
    private final Setting<Integer> ALLATORIxDEMO;

    private /* synthetic */ void IiiiiiiIIi() {
        iIIiiiIIii iIIiiiIIii2;
        switch (IiiIiiIIIi.ALLATORIxDEMO[((MEnum.WalkDirection)((Object)this.IiIIiIiiiI.get())).ordinal()]) {
            case 1: {
                iIIiiiIIii iIIiiiIIii3 = this;
                while (false) {
                }
                iIIiiiIIii2 = iIIiiiIIii3;
                iIIiiiIIii3.ALLATORIxDEMO(iIIiiiIIii3.iiIIIIiIII.options.forwardKey, 5 >> 2);
                break;
            }
            case 2: {
                iIIiiiIIii iIIiiiIIii4 = this;
                iIIiiiIIii2 = iIIiiiIIii4;
                iIIiiiIIii4.ALLATORIxDEMO(iIIiiiIIii4.iiIIIIiIII.options.backKey, (3 & 5) != 0);
                break;
            }
            case 3: {
                iIIiiiIIii iIIiiiIIii5 = this;
                iIIiiiIIii2 = iIIiiiIIii5;
                iIIiiiIIii5.ALLATORIxDEMO(iIIiiiIIii5.iiIIIIiIII.options.leftKey, (3 & 5) != 0);
                break;
            }
            case 4: {
                iIIiiiIIii iIIiiiIIii6 = this;
                iIIiiiIIii6.ALLATORIxDEMO(iIIiiiIIii6.iiIIIIiIII.options.rightKey, (2 ^ 3) != 0);
            }
            default: {
                iIIiiiIIii2 = this;
            }
        }
        if (((Boolean)iIIiiiIIii2.iiiiiIIiiI.get()).booleanValue()) {
            iIIiiiIIii iIIiiiIIii7 = this;
            iIIiiiIIii7.ALLATORIxDEMO(this.iiIIIIiIII.options.sprintKey, (Boolean)iIIiiiIIii7.iiiiiIIiiI.get());
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(boolean bl) {
        iIIiiiIIii IiIIiIiiiI;
        boolean bl2 = bl;
        iIIiiiIIii iIIiiiIIii2 = IiIIiIiiiI = this;
        iIIiiiIIii2.ALLATORIxDEMO(iIIiiiIIii2.iiIIIIiIII.options.forwardKey, 5 >> 3);
        iIIiiiIIii2.ALLATORIxDEMO(iIIiiiIIii2.iiIIIIiIII.options.backKey, 3 >> 2);
        iIIiiiIIii2.ALLATORIxDEMO(iIIiiiIIii2.iiIIIIiIII.options.leftKey, 5 >> 3);
        iIIiiiIIii2.ALLATORIxDEMO(iIIiiiIIii2.iiIIIIiIII.options.rightKey, (2 & 5) != 0);
        if (bl2) {
            iIIiiiIIii iIIiiiIIii3 = IiIIiIiiiI;
            iIIiiiIIii3.ALLATORIxDEMO(iIIiiiIIii3.iiIIIIiIII.options.sprintKey, 5 >> 3);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_304 class_3042, boolean bl) {
        void IiIIiIiiiI;
        boolean bl2 = bl;
        iIIiiiIIii IiIIiIiiiI2 = this;
        void v0 = IiIIiIiiiI;
        v0.setPressed(bl2);
        Input.setKeyState((class_304)v0, (boolean)bl2);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        PathManagers.get().moveInDirection(this.iiIIIIiIII.player.getYaw());
    }

    public iIIiiiIIii() {
        iIIiiiIIii iIIiiiIIii2 = this;
        iIIiiiIIii iIIiiiIIii3 = this;
        super(IiIIiIIIIi.ALLATORIxDEMO("\u81a6\u52af\u8d3c\u8de8"), IIiIiiiiIi.IiiiiiiIIi("\u81ed\u529a\u8d57\u8ddd\t2\u5899\u52b2\u4e81\u4e12\u4e2d\u6150\u9038\u6a13\u5f28<'\u65ab\u4fb8"));
        this.IIIIiIiiIi = iIIiiiIIii3.settings.getDefaultGroup();
        iIIiiiIIii2.iIIiiIIIII = 3 >> 2;
        iIIiiiIIii2.iiIiIIiIIi = this.IIIIiIiiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIIiIIIIi.ALLATORIxDEMO("\u6a6d\u5f08"))).description(IIiIiiiiIi.IiiiiiiIIi("\u886b\u8d62\u6a26\u5f1d\u3005"))).defaultValue((Object)MEnum.WalkMode.ALLATORIxDEMO)).onChanged(walkMode -> {
            iIIiiiIIii iIIiiiIIii2 = object;
            Object object = walkMode;
            iIIiiiIIii IiIIiIiiiI = iIIiiiIIii2;
            if (IiIIiIiiiI.isActive()) {
                iIIiiiIIii iIIiiiIIii3;
                if (object == MEnum.WalkMode.IiIIiIiiiI) {
                    PathManagers.get().stop();
                    iIIiiiIIii3 = IiIIiIiiiI;
                } else {
                    iIIiiiIIii iIIiiiIIii4 = IiIIiIiiiI;
                    iIIiiiIIii3 = iIIiiiIIii4;
                    iIIiiiIIii4.ALLATORIxDEMO();
                }
                iIIiiiIIii3.ALLATORIxDEMO(true);
            }
        })).build());
        this.IiIIiIiiiI = this.IIIIiIiiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIIiIIIIi.ALLATORIxDEMO("\u7bec\u5372\u6a6d\u5f08\u65f5\u5416"))).description(IIiIiiiiIi.IiiiiiiIIi("\u7b87\u5347\u6a26\u5f3d\u4e2c\u76b6\u886b\u8d62\u65be\u5403\u3005"))).defaultValue((Object)MEnum.WalkDirection.IiIiIIIIiI)).onChanged(walkDirection -> {
            iIIiiiIIii iIIiiiIIii2 = object;
            Object object = walkDirection;
            iIIiiiIIii IiIIiIiiiI = iIIiiiIIii2;
            if (IiIIiIiiiI.isActive()) {
                IiIIiIiiiI.ALLATORIxDEMO(5 >> 3);
            }
        })).visible(() -> {
            if (this.iiIiIIiIIi.get() == MEnum.WalkMode.IiIIiIiiiI) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.iiiiiIIiiI = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIiIIIIi.ALLATORIxDEMO("\u75f2\u8dd6"))).description(IIiIiiiiIi.IiiiiiiIIi("\u887e\u8d57\u65e4\u75b9\u8dc3\u3005"))).defaultValue((Object)(3 >> 2))).visible(() -> {
            if (this.iiIiIIiIIi.get() == MEnum.WalkMode.IiIIiIiiiI) {
                return (2 ^ 3) != 0;
            }
            return false;
        })).build());
        this.IiIiIIIIiI = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIIiIIIIi.ALLATORIxDEMO("\u612e\u9018\u8800\u8d77"))).description(IIiIiiiiIi.IiiiiiiIIi("\u5428\u751a\u6145\u902d\u886b\u8d62\u6a26\u5f1d\u3005"))).defaultValue((Object)((3 & 4) != 0))).visible(() -> {
            if (this.iiIiIIiIIi.get() == MEnum.WalkMode.IiIIiIiiiI) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.ALLATORIxDEMO = this.IIIIiIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIIiIIIIi.ALLATORIxDEMO("\u6365\u9509\u634d\u7eea\u65ba\u95f3"))).description(IIiIiiiiIi.IiiiiiiIIi("\u6168\u900b\u884d\u8d65\u65f6\u6b9ar\"\u523c\u545a\u6738\u51b7\u632e\u953c\u6306\u7eff\u7683\u5229\u6577\u3030\u6557\u500e\u8dad\u5c1d\u8d8d\u6170\u3005"))).defaultValue((Object)(--1))).min(3 >> 1).max(0x77 & 0x1B).sliderMax(0x3E & 0x55).visible(() -> {
            if (this.iiIiIIiIIi.get() == MEnum.WalkMode.IiIIiIiiiI && ((Boolean)this.IiIiIIIIiI.get()).booleanValue()) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        this.iiIIIIiIII = class_310.getInstance();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiIIiIIIIi.ALLATORIxDEMO("\u001bln!?bLR\u001cC-s)&l\u8bf0\u6698\u6597\u525c\u6727\u65fc\u724f\u6760\uff06"));
        }
    }

    @Override
    public void onActivate() {
        this.iIIiiIIIII = 3 ^ 3;
        if (this.iiIiIIiIIi.get() == MEnum.WalkMode.ALLATORIxDEMO) {
            this.ALLATORIxDEMO();
        }
    }

    public void onDeactivate() {
        if (this.iiIiIIiIIi.get() == MEnum.WalkMode.IiIIiIiiiI) {
            this.ALLATORIxDEMO(--1 != 0);
            return;
        }
        PathManagers.get().stop();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @EventHandler(priority=100)
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIIiiiIIii iIIiiiIIii2 = iIIiiiIIii3;
        iIIiiiIIii iIIiiiIIii3 = pre;
        iIIiiiIIii IiIIiIiiiI = iIIiiiIIii2;
        if (IiIIiIiiiI.iiIiIIiIIi.get() == MEnum.WalkMode.IiIIiIiiiI) {
            if (((Boolean)IiIIiIiiiI.IiIiIIIIiI.get()).booleanValue()) {
                iIIiiiIIii iIIiiiIIii4;
                iIIiiiIIii iIIiiiIIii5 = IiIIiIiiiI;
                iIIiiiIIii5.iIIiiIIIII += 4 ^ 5;
                if (iIIiiiIIii5.iIIiiIIIII <= (Integer)IiIIiIiiiI.ALLATORIxDEMO.get()) {
                    iIIiiiIIii iIIiiiIIii6 = IiIIiIiiiI;
                    iIIiiiIIii4 = iIIiiiIIii6;
                    iIIiiiIIii6.IiiiiiiIIi();
                } else {
                    iIIiiiIIii iIIiiiIIii7 = IiIIiIiiiI;
                    iIIiiiIIii4 = iIIiiiIIii7;
                    iIIiiiIIii7.ALLATORIxDEMO((3 ^ 3) != 0);
                }
                if (iIIiiiIIii4.iIIiiIIIII < (0x5E & 0x35)) return;
                IiIIiIiiiI.iIIiiIIIII = 2 & 5;
                return;
            }
            IiIIiIiiiI.IiiiiiiIIi();
            return;
        }
        if (!(PathManagers.get() instanceof NopPathManager)) return;
        IiIIiIiiiI.info(IIiIiiiiIi.IiiiiiiIIi("\u665d\u80ef\u6a26\u5f1d\u9707\u8993'pF@Nfh|b"), new Object[5 >> 3]);
        IiIIiIiiiI.toggle();
    }
}

