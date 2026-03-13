/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.AttackEntityEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.component.type.ItemEnchantmentsComponent
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.item.MaceItem
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIiIiIiIII;
import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiIIIiiIII;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.MaceCombo;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Date;
import meteordevelopment.meteorclient.events.entity.player.AttackEntityEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.MaceItem;

public class IIiIIIiiIi
extends iiiiIiIiii {
    private int iIIiIIiiII;
    private final Setting<Boolean> IiiIIiiiiI;
    private boolean IiIIIIiiii;
    private final Setting<Integer> IiiIIIiiIi;
    private final Setting<Boolean> iiIIiiIiii;
    private final Setting<Integer> iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private final Setting<Boolean> iiIiIIiIIi;
    private final Setting<Boolean> IIIIiIiiIi;
    private int IiIiIIIIiI;
    private final SettingGroup iiiiiIIiiI;
    private final Setting<Boolean> iiIIIIiIII;
    private final SettingGroup IiIIiIiiiI;
    private final Setting<MaceCombo.WeaponType> ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        IIiIIIiiIi iIiIIIiiIi = iIiIIIiiIi2;
        IIiIIIiiIi iIiIIIiiIi2 = post;
        IIiIIIiiIi IiIIiIiiiI = iIiIIIiiIi;
        if (IiIIiIiiiI.iiIIIIiIII.player == null) {
            return;
        }
        if (IiIIiIiiiI.IiIiIIIIiI > 0) {
            IIiIIIiiIi iIiIIIiiIi3 = IiIIiIiiiI;
            iIiIIIiiIi3.IiIiIIIIiI -= 2 ^ 3;
            if (iIiIIIiiIi3.IiIiIIIIiI == 0) {
                if (IiIIiIiiiI.iIIiIIiiII != -4 >> 2) {
                    IIIiIiIiii.ALLATORIxDEMO(IiIIiIiiiI.iIIiIIiiII, 3 >> 2);
                    IiIIiIiiiI.iIIiIIiiII = -4 >> 2;
                }
            }
        }
        if (IiIIiIiiiI.IiIIIIiiii && !IiiiIiiIII.IiiiiiiIIi(IiIIiIiiiI.iiIIIIiIII)) {
            IiIIiIiiiI.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)new class_2848((class_1297)IiIIiIiiiI.iiIIIIiIII.player, class_2848.class_2849.START_FALL_FLYING));
            IiIIiIiiiI.IiIIIIiiii = 3 & 4;
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_1309 class_13092) {
        IIiIIIiiIi iIiIIIiiIi = iIiIIIiiIi2;
        IIiIIIiiIi iIiIIIiiIi2 = class_13092;
        IIiIIIiiIi IiIIiIiiiI = iIiIIIiiIi;
        if (!((Boolean)IiIIiIiiiI.iiIIiiIiii.get()).booleanValue()) {
            return (3 ^ 3) != 0;
        }
        if (iIiIIIiiIi2 instanceof class_1657) {
            class_1657 class_16572 = (class_1657)iIiIIIiiIi2;
            if (class_16572.isCreative() || class_16572.isBlocking()) {
                return true;
            }
            return false;
        }
        return iIiIIIiiIi2.isInvulnerable();
    }

    public IIiIIIiiIi() {
        IIiIIIiiIi iIiIIIiiIi = this;
        super(iiiiIiIiii.ALLATORIxDEMO, iIiIiIiIII.ALLATORIxDEMO("\u525e\u9527\u588d\u4f6d"), iiIIIiiIII.ALLATORIxDEMO("\u6b13\u565b\u9571\u8fcd\u51ae=U\u4f4c\u757d\u6314\u5b9a\u6b20\u563d\u6528\u51a9\u65e2\u81bf\u52bb\u524f\u952a\u589c\u4f60"));
        iIiIIIiiIi.IiIIiIiiiI = iIiIIIiiIi.settings.getDefaultGroup();
        iIiIIIiiIi.iiiiiIIiiI = iIiIIIiiIi.settings.createGroup(iIiIiIiIII.ALLATORIxDEMO("\u5a58\u5298\u588d\u5f73"));
        iIiIIIiiIi.ALLATORIxDEMO = iIiIIIiiIi.IiIIiIiiiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIIIiiIII.ALLATORIxDEMO("\u6b2e\u5666\u7c79\u57cf"))).description(iIiIiIiIII.ALLATORIxDEMO("\u89f8\u5392\u521e\u6326\u769a\u6b3f\u566b\u7c68\u57c2"))).defaultValue((Object)MaceCombo.WeaponType.iiiiiIIiiI)).build());
        this.IiiIIiiiiI = this.IiIIiIiiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIiiIII.ALLATORIxDEMO("\u81a2\u52a6\u5205\u6326"))).description(iIiIiIiIII.ALLATORIxDEMO("\u4f1b\u7516\u6343\u5b84\u6b77\u5623\u657f\u51e5\u65b5\u81f3\u52ec\u5219\u633b\u5233\u9537\u5b19"))).defaultValue((Object)(5 >> 2))).build());
        this.iIIiiIIIII = this.IiIIiIiiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIiiIII.ALLATORIxDEMO("\u4e8d\u783a\u7530\u9560"))).description(iIiIiIiIII.ALLATORIxDEMO("\u53fb\u524c\u6326\u522e\u674a\u782d\u7576\u965a\u9b0d\u7687\u9537\u5b19"))).defaultValue((Object)(--1 != 0))).visible(() -> this.IiiIIiiiiI.get())).build());
        this.iIiiIiiiII = this.IiIIiIiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIiiIII.ALLATORIxDEMO("\u524f\u56d0\u5ef4\u8f9b"))).description(iIiIiIiIII.ALLATORIxDEMO("\u652a\u51b0\u544a\u5904\u5c52m-}2\u5204\u56cd\u5218"))).defaultValue((Object)(5 >> 2))).min(3 ^ 3).max(--5).sliderMax(--5).visible(() -> this.IiiIIiiiiI.get())).build());
        this.IIIIiIiiIi = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIiiIII.ALLATORIxDEMO("\u5a49\u5295\u589c\u5f7e"))).description(iIiIiIiIII.ALLATORIxDEMO("\u4f61\u756b\u953d\u5b14\u65e8\u58c7\u5f39\u4f37\u5bfa"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iiIiIIiIIi = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIiiIII.ALLATORIxDEMO("\u4e8d\u9796\u7fc7\u65b2"))).description(iIiIiIiIII.ALLATORIxDEMO("\u53a1\u576c\u9786\u7f86\u98c7\u8808\u65e8\u58c7\u5f39\u5a12\u52d2"))).defaultValue((Object)((4 ^ 5) != 0))).visible(() -> this.IIIIiIiiIi.get())).build());
        this.iiIIIIiIII = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIiiIII.ALLATORIxDEMO("\u6748\u5929\u5a03\u52df"))).description(iIiIiIiIII.ALLATORIxDEMO("\u81ae\u52b6\u5bb8\u6267\u6744\u5939\u53b6\u752b\u9acb\u5eef"))).defaultValue((Object)((3 ^ 3) != 0))).visible(() -> this.IIIIiIiiIi.get())).build());
        this.IiiIIIiiIi = this.iiiiiIIiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIiiIII.ALLATORIxDEMO("\u4e43\u8433\u9ada\u5ee2"))).description(iIiIiIiIII.ALLATORIxDEMO("\u6a38\u629b\u769a\u4e52\u843e\u9acb\u5eef"))).defaultValue((Object)(0x77 & 0x1E))).min(2 ^ 3).max(0x36 & 0x7B).sliderMax(0x3F & 0x72).visible(() -> {
            if (((Boolean)this.IIIIiIiiIi.get()).booleanValue() && !((Boolean)this.iiIIIIiIII.get()).booleanValue()) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.iiIIiiIiii = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIiiIII.ALLATORIxDEMO("\u6888\u67eb\u76ec\u6843"))).description(iIiIiIiIII.ALLATORIxDEMO("\u4e13\u5b9d\u5225\u9064\u6a3f\u5f1e\u304a\u65a4\u6552\u3042\u6825\u6365\u769a\u73f0\u5bb5\u4f6c\u7561"))).defaultValue((Object)((2 ^ 3) != 0))).visible(() -> this.IIIIiIiiIi.get())).build());
        IIiIIIiiIi iIiIIIiiIi2 = this;
        this.IiIIIIiiii = 3 >> 2;
        iIiIIIiiIi2.iIIiIIiiII = -4 >> 2;
        iIiIIIiiIi2.IiIiIIIIiI = 3 & 4;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIIIiiIII.ALLATORIxDEMO("%_\u0010R&vuf\u0005W4gegu\u8be4\u66a6\u65a4\u5265\u6713\u65f8\u7246\u672e\uff45"));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IIiIIIiiIi iIiIIIiiIi = this;
        try {
            IIiIIIiiIi iIiIIIiiIi2 = iIiIIIiiIi;
            class_243 class_2432 = iIiIIIiiIi2.iiIIIIiIII.player.getPos();
            int n = iIiIIIiiIi2.ALLATORIxDEMO();
            if (n <= 0) {
                return;
            }
            IIiIIIiiIi iIiIIIiiIi3 = iIiIIIiiIi;
            int n2 = 5 >> 3;
            class_2338 class_23382 = iIiIIIiiIi3.iiIIIIiIII.player.getBlockPos().add(n2, n, n2);
            class_2338 class_23383 = class_23382.up();
            if (!iIiIIIiiIi3.ALLATORIxDEMO(class_23382) || !iIiIIIiiIi.ALLATORIxDEMO(class_23383)) {
                return;
            }
            iIiIIIiiIi.ALLATORIxDEMO(class_2432, n);
            return;
        } catch (Exception exception) {
            return;
        }
    }

    @EventHandler(priority=100)
    private /* synthetic */ void IiiiiiiIIi(AttackEntityEvent attackEntityEvent) {
        IIiIIIiiIi iIiIIIiiIi = iIiIIIiiIi2;
        IIiIIIiiIi iIiIIIiiIi2 = attackEntityEvent;
        IIiIIIiiIi IiIIiIiiiI = iIiIIIiiIi;
        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) {
            return;
        }
        iIiIIIiiIi2 = ((AttackEntityEvent)iIiIIIiiIi2).entity;
        if (iIiIIIiiIi2 == null || !iIiIIIiiIi2.isAlive() || !(iIiIIIiiIi2 instanceof class_1309)) {
            return;
        }
        IIiIIIiiIi iIiIIIiiIi3 = IiIIiIiiiI;
        iIiIIIiiIi3.IiIIIIiiii = IiiiIiiIII.IiiiiiiIIi(iIiIIIiiIi3.iiIIIIiIII);
        if (((Boolean)iIiIIIiiIi3.IiiIIiiiiI.get()).booleanValue() && IiIIiIiiiI.ALLATORIxDEMO() && (iIiIIIiiIi2 = IiIIiIiiiI.ALLATORIxDEMO()).found()) {
            IiIIiIiiiI.iIIiIIiiII = IiiiIiiIII.ALLATORIxDEMO();
            IIIiIiIiii.ALLATORIxDEMO(iIiIIIiiIi2.slot(), (3 & 4) != 0);
            IiIIiIiiiI.IiIiIIIIiI = (Integer)IiIIiIiiiI.iIiiIiiiII.get();
        }
    }

    public void onDeactivate() {
        if (this.iIIiIIiiII != -4 >> 2 && this.iiIIIIiIII.player != null) {
            IIIiIiIiii.ALLATORIxDEMO(this.iIIiIIiiII, (3 ^ 3) != 0);
            this.iIIiIIiiII = -4 >> 2;
        }
        this.IiIiIIIIiI = 2 & 5;
        this.IiIIIIiiii = this.IiIiIIIIiI;
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        int n;
        IIiIIIiiIi iIiIIIiiIi = iIiIIIiiIi2;
        if (!((Boolean)iIiIIIiiIi.iiIIIIiIII.get()).booleanValue()) {
            return (Integer)iIiIIIiiIi.IiiIIIiiIi.get();
        }
        IIiIIIiiIi iIiIIIiiIi2 = iIiIIIiiIi.iiIIIIiIII.player.getBlockPos();
        int n2 = n = iIiIIIiiIi2.getY() + (0x62AE & 0x1DFB);
        while (n2 > iIiIIIiiIi2.getY()) {
            class_2338 class_23382 = new class_2338(iIiIIIiiIi2.getX(), n, iIiIIIiiIi2.getZ());
            class_2338 class_23383 = class_23382.up();
            if (iIiIIIiiIi.ALLATORIxDEMO(class_23382) && iIiIIIiiIi.ALLATORIxDEMO(class_23383)) {
                return n - iIiIIIiiIi2.getY();
            }
            n2 = --n;
        }
        return 0;
    }

    @EventHandler(priority=-100)
    private /* synthetic */ void ALLATORIxDEMO(AttackEntityEvent attackEntityEvent) {
        IIiIIIiiIi iIiIIIiiIi = iIiIIIiiIi2;
        IIiIIIiiIi iIiIIIiiIi2 = attackEntityEvent;
        IIiIIIiiIi IiIIiIiiiI = iIiIIIiiIi;
        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) {
            return;
        }
        iIiIIIiiIi2 = ((AttackEntityEvent)iIiIIIiiIi2).entity;
        if (!(iIiIIIiiIi2 instanceof class_1309)) {
            return;
        }
        class_1309 class_13092 = (class_1309)iIiIIIiiIi2;
        if (((Boolean)IiIIiIiiiI.IIIIiIiiIi.get()).booleanValue() && IiIIiIiiiI.iiIIIIiIII.player.getMainHandStack().getItem() instanceof class_9362 && (!((Boolean)IiIIiIiiiI.iiIiIIiIIi.get()).booleanValue() || IiiiIiiIII.IiiiiiiIIi(IiIIiIiiiI.iiIIIIiIII)) && !IiIIiIiiiI.ALLATORIxDEMO(class_13092)) {
            IiIIiIiiiI.ALLATORIxDEMO();
        }
        if (IiIIiIiiiI.IiIIIIiiii && !IiiiIiiIII.IiiiiiiIIi(IiIIiIiiiI.iiIIIIiIII)) {
            IiIIiIiiiI.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)new class_2848((class_1297)IiIIiIiiiI.iiIIIIiIII.player, class_2848.class_2849.START_FALL_FLYING));
        }
    }

    private /* synthetic */ boolean IiiiiiiIIi(class_1799 class_17992) {
        IIiIIIiiIi iIiIIIiiIi = object;
        Object object = class_17992;
        IIiIIIiiIi IiIIiIiiiI = iIiIIIiiIi;
        if (!(object.getItem() instanceof class_9362)) {
            return (2 & 5) != 0;
        }
        object = ((class_9304)object.getOrDefault(class_9334.ENCHANTMENTS, (Object)class_9304.DEFAULT)).getEnchantmentEntries().iterator();
        while (object.hasNext()) {
            class_6880 class_68802 = (class_6880)((Object2IntMap.Entry)object.next()).getKey();
            if (!class_68802.getKey().isPresent() || !((class_5321)class_68802.getKey().get()).getValue().getPath().equals(iIiIiIiIII.ALLATORIxDEMO("\u0006L\u0001_'v"))) continue;
            return (3 & 5) != 0;
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        IIiIIIiiIi iIiIIIiiIi = iIiIIIiiIi2;
        IIiIIIiiIi iIiIIIiiIi2 = class_23382;
        IIiIIIiiIi IiIIiIiiiI = iIiIIIiiIi;
        if (IiIIiIiiiI.iiIIIIiIII.world.getBlockState((class_2338)iIiIIIiiIi2).isReplaceable() && IiIIiIiiiI.iiIIIIiIII.world.getFluidState((class_2338)iIiIIIiiIi2).isEmpty() && !IiIIiIiiiI.iiIIIIiIII.world.getBlockState((class_2338)iIiIIIiiIi2).isOf(class_2246.POWDER_SNOW)) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean ALLATORIxDEMO() {
        IIiIIIiiIi iIiIIIiiIi;
        IIiIIIiiIi iIiIIIiiIi2 = iIiIIIiiIi = iIiIIIiiIi3;
        IIiIIIiiIi iIiIIIiiIi3 = iIiIIIiiIi2.iiIIIIiIII.player.getMainHandStack().getItem();
        switch (((MaceCombo.WeaponType)((Object)iIiIIIiiIi2.ALLATORIxDEMO.get())).ordinal()) {
            case 0: {
                return iiIIIIiiIi.ALLATORIxDEMO((class_1792)iIiIIIiiIi3);
            }
            case 1: {
                return iIiIIIiiIi3 instanceof class_1743;
            }
            case 2: {
                return iIiIIIiiIi.iiIIIIiIII.player.getMainHandStack().isEmpty();
            }
            case 3: {
                return true;
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_243 class_2432, int n) {
        int n2;
        void IiIIiIiiiI;
        IIiIIIiiIi iIiIIIiiIi = iIiIIIiiIi2;
        IIiIIIiiIi iIiIIIiiIi2 = class_2432;
        IIiIIIiiIi IiIIiIiiiI2 = iIiIIIiiIi;
        int n3 = Math.min((int)Math.ceil((double)IiIIiIiiiI / 10.0), 0x5D & 0x36);
        int n4 = n2 = 2 & 5;
        while (true) {
            if (n4 >= Math.max(4, n3 - (5 >> 2))) break;
            int n5 = --1;
            IiIIiIiiiI2.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)IiiiIiiIII.ALLATORIxDEMO(3 >> 2));
            n4 = ++n2;
        }
        double d = IiIIiIiiiI2.iiIIIIiIII.player.getY() + (double)Math.min((int)IiIIiIiiiI, (Integer)IiIIiIiiiI2.IiiIIIiiIi.get());
        IIiIIIiiIi iIiIIIiiIi3 = IiIIiIiiiI2;
        IiIIiIiiiI2.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)IiiiIiiIII.ALLATORIxDEMO(iIiIIIiiIi3.iiIIIIiIII.player.getX(), d, IiIIiIiiiI2.iiIIIIiIII.player.getZ(), 3 >> 2));
        iIiIIIiiIi3.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)IiiiIiiIII.ALLATORIxDEMO(((class_243)iIiIIIiiIi2).x, ((class_243)iIiIIIiiIi2).y, ((class_243)iIiIIIiiIi2).z, (2 & 5) != 0));
    }

    private /* synthetic */ FindItemResult ALLATORIxDEMO() {
        if (((Boolean)this.iIIiiIIIII.get()).booleanValue()) {
            return IIIiIiIiii.ALLATORIxDEMO((class_1799 class_17992) -> {
                IIiIIIiiIi iIiIIIiiIi = iIiIIIiiIi2;
                IIiIIIiiIi iIiIIIiiIi2 = class_17992;
                IIiIIIiiIi IiIIiIiiiI = iIiIIIiiIi;
                return IiIIiIiiiI.IiiiiiiIIi((class_1799)iIiIIIiiIi2);
            });
        }
        return IIIiIiIiii.ALLATORIxDEMO((class_1799 IiIIiIiiiI) -> IiIIiIiiiI.getItem() instanceof class_9362);
    }
}

