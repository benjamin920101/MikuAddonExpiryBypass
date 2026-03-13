/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.item.ExperienceBottleItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.enchantment.Enchantments
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IIiIiiiiIi;
import com.github.mikumiku.addon.IiiiIIiiiI;
import com.github.mikumiku.addon.iIiIiIiIIi;
import com.github.mikumiku.addon.iiIIiIiIII;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ExperienceBottleItem;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;

public class IiiIiiIiII
extends iiiiIiIiii {
    private AtomicInteger iIIiiIIIII;
    private final Setting<Boolean> iiIiIIiIIi;
    private final Setting<Boolean> IIIIiIiiIi;
    private final SettingGroup IiIiIIIIiI;
    private int iiiiiIIiiI;
    private final Setting<Integer> iiIIIIiIII;
    private final Setting<Boolean> IiIIiIiiiI;
    private final Setting<Integer> ALLATORIxDEMO;

    public IiiIiiIiII() {
        IiiIiiIiII iiiIiiIiII = this;
        super(iiiiIiIiii.ALLATORIxDEMO, iiIIiIiIII.ALLATORIxDEMO("\nz\u81a5\u52c8\u4e27"), IIiIiiiiIi.IiiiiiiIIi("\u81ed\u529a\u4e05\u7edd\u9a8b\u74c4\u4fc9\u88f7\u5920"));
        iiiIiiIiII.IiIiIIIIiI = iiiIiiIiII.settings.getDefaultGroup();
        iiiIiiIiII.IiIIiIiiiI = iiiIiiIiII.IiIiIIIIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u5955\u4e9b\u52a4"))).description(IIiIiiiiIi.IiiiiiiIIi("\u570f\u4f6d\u752f\u727b\u54c6\u65c4\u4e78\u5153\u8bbf\u4e10\u7ee8\u9abe\u74d1"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iiIIIIiIII = this.IiIiIIIIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u5e96\u8fda"))).description(IIiIiiiiIi.IiiiiiiIIi("\u4e25\u7efd\u9aab\u74e4\u4e4c\u95e6\u7683\u5ec4\u8ff8\uff1as[DY\uff2e"))).defaultValue((Object)(--1))).min(--1).sliderMax(0x55 & 0x3E).build());
        this.ALLATORIxDEMO = this.IiIiIIIIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u6bf8\u6b73\u4e08\u74b9\u6510\u91ca"))).description(IIiIiiiiIi.IiiiiiiIIi("\u6bfd\u4e0dfnql\u4e10\u51dd\u7696\u7ec8\u9abe\u74d1\u6542\u91e8"))).defaultValue((Object)(--1))).min(2 ^ 3).sliderMax(0x73 & 0x4C).build());
        this.IIIIiIiiIi = this.IiIiIIIIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u8042\u4e6f\u5ee9\u68a0\u67e0"))).description(IIiIiiiiIi.IiiiiiiIIi("\u68d5\u67e5\u8890\u5947\u54be\u626c\u6313\u726e\u54d3\u7683\u8022\u4e62\u5eb4\uff0b\u5990\u679b\u6ed3\u8037\u4e57\u521e\u81d8\u528f\u79b3\u750f"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iiIiIIiIIi = this.IiIiIIIIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u4e90\u6ed6\u8042\u4e6f\u65b9\u544f\u752d"))).description(IIiIiiiiIi.IiiiiiiIIi("\u53f8\u670e\u571a\u88e2\u5915\u6ee6\u8002\u4e42\u65c4\u626a\u543d\u752f\u4e10\u7ee8\u9abe\u74d1"))).defaultValue((Object)(5 >> 3))).build());
        this.iiiiiIIiiI = 3 ^ 3;
        IiiIiiIiII iiiIiiIiII2 = this;
        iiiIiiIiII2.iIIiiIIIII = new AtomicInteger(3 & 4);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIIiIiIII.ALLATORIxDEMO("g>R3d\u0017\u0017'g\u0016v\u0006\u0007&\u0017\u8ba5\u66c4\u65e5\u5207\u6752\u659a\u7207\u674c\uff04"));
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        IiiIiiIiII iiiIiiIiII;
        block6: {
            block5: {
                IiiIiiIiII iiiIiiIiII2 = iiiIiiIiII = iiiIiiIiII5;
                if (!iiiIiiIiII2.ALLATORIxDEMO(iiiIiiIiII2.iiIIIIiIII.player.getMainHandStack())) break block5;
                IiiIiiIiII iiiIiiIiII3 = iiiIiiIiII;
                if (iiiIiiIiII3.ALLATORIxDEMO(iiiIiiIiII3.iiIIIIiIII.player.getOffHandStack())) break block6;
            }
            return false;
        }
        IiiIiiIiII iiiIiiIiII4 = iiiIiiIiII;
        class_1799[] class_1799Array = iiiIiiIiII4.iiIIIIiIII.player.getEquippedStack(class_1304.HEAD);
        class_1799 class_17992 = iiiIiiIiII4.iiIIIIiIII.player.getEquippedStack(class_1304.CHEST);
        IiiIiiIiII iiiIiiIiII5 = iiiIiiIiII4.iiIIIIiIII.player.getEquippedStack(class_1304.LEGS);
        class_1799 class_17993 = iiiIiiIiII4.iiIIIIiIII.player.getEquippedStack(class_1304.FEET);
        class_1799[] class_1799Array2 = new class_1799[--4];
        class_1799Array2[3 ^ 3] = class_1799Array;
        class_1799Array2[3 >> 1] = class_17992;
        class_1799Array2[1 ^ 3] = iiiIiiIiII5;
        class_1799Array2[--3] = class_17993;
        class_1799Array = class_1799Array2;
        int n = class_1799Array2.length;
        int n2 = this = 3 >> 2;
        while (n2 < n) {
            class_17993 = class_1799Array[this];
            if (!iiiIiiIiII.ALLATORIxDEMO(class_17993)) {
                return 5 >> 3;
            }
            n2 = ++this;
        }
        return true;
    }

    @Override
    public void onActivate() {
        IiiIiiIiII iiiIiiIiII = this;
        super.onActivate();
        iiiIiiIiII.iiiiiIIiiI = 3 >> 2;
        iiiIiiIiII.ALLATORIxDEMO();
    }

    private /* synthetic */ void IiiiiiiIIi() {
        IiiIiiIiII iiiIiiIiII = this;
        int n2 = Math.min((Integer)iiiIiiIiII.ALLATORIxDEMO.get(), iiiIiiIiII.iIIiiIIIII.get());
        int n3 = this = 2 & 5;
        while (n3 < n2) {
            iiiiIiIiii.ALLATORIxDEMO(n -> {
                int n2 = n;
                IiiIiiIiII IiIIiIiiiI = this;
                return new class_2886(class_1268.MAIN_HAND, n2, IiIIiIiiiI.iiIIIIiIII.player.getYaw(), IiIIiIiiiI.iiIIIIiIII.player.getPitch());
            });
            iiiIiiIiII.iiIIIIiIII.player.swingHand(class_1268.MAIN_HAND);
            n3 = ++this;
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        int n;
        IiiIiiIiII iiiIiiIiII = this;
        int n2 = 3 >> 2;
        int n3 = n = 2 & 5;
        while (true) {
            if (n3 >= 36) break;
            class_1799 class_17992 = iiiIiiIiII.iiIIIIiIII.player.getInventory().getStack(n);
            if (class_17992.getItem() instanceof class_1779) {
                n2 += class_17992.getCount();
            }
            n3 = ++n;
        }
        iiiIiiIiII.iIIiiIIIII.set(n2);
    }

    public String getInfoString() {
        return String.valueOf(this.iIIiiIIIII.get());
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        IiiIiiIiII iiiIiiIiII = iiiIiiIiII2;
        IiiIiiIiII iiiIiiIiII2 = post;
        IiiIiiIiII IiIIiIiiiI = iiiIiiIiII;
        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) {
            return;
        }
        if (IiIIiIiiiI.iiiiiIIiiI > 0) {
            IiIIiIiiiI.iiiiiIIiiI -= 3 >> 1;
            return;
        }
        if (IiIIiIiiiI.iiIIIIiIII.player.isUsingItem() && !((Boolean)IiIIiIiiiI.IiIIiIiiiI.get()).booleanValue()) {
            return;
        }
        IiiIiiIiII iiiIiiIiII3 = IiIIiIiiiI;
        iiiIiiIiII3.ALLATORIxDEMO();
        if (iiiIiiIiII3.iIIiiIIIII.get() <= 0) {
            IiIIiIiiiI.error(IIiIiiiiIi.IiiiiiiIIi("\u6cb3\u670e\u7efd\u9aab\u74e4\uff0b\u79b3\u750f\u6a13\u5770"), new Object[2 & 5]);
            IiIIiIiiiI.toggle();
            return;
        }
        if (((Boolean)IiIIiIiiiI.IIIIiIiiIi.get()).booleanValue()) {
            IiiIiiIiII iiiIiiIiII4 = IiIIiIiiiI;
            boolean this_ = iiiIiiIiII4.ALLATORIxDEMO();
            if (((Boolean)iiiIiiIiII4.iiIiIIiIIi.get()).booleanValue()) {
                if (!this_) {
                    return;
                }
            } else if (this_) {
                IiIIiIiiiI.info(iiIIiIiIII.ALLATORIxDEMO("\u624c\u6760\u88d2\u5975\u8036\u4e06\u5ebc\u5d8d\u6efa\uff72\u7992\u755e\u6a30\u5723"), new Object[2 & 5]);
                IiIIiIiiiI.toggle();
                return;
            }
        }
        int this_ = IiIIiIiiiI.ALLATORIxDEMO();
        if (this_ == -4 >> 2) {
            IiIIiIiiiI.error(IIiIiiiiIi.IiiiiiiIIi("\u80cb\u5337\u4e0a\u6cb3\u670e\u626c\u5237\u7efd\u9aab\u74e4\uff0b\u79b3\u750f\u6a13\u5770"), new Object[3 >> 2]);
            IiIIiIiiiI.toggle();
            return;
        }
        IIIiIiIiii.ALLATORIxDEMO(this_);
        iIiIiIiIIi.ALLATORIxDEMO().ALLATORIxDEMO(new IiiiIIiiiI(IiIIiIiiiI.iiIIIIiIII.player.getYaw(), 90.0f));
        IiIIiIiiiI.IiiiiiiIIi();
        IIIiIiIiii.ALLATORIxDEMO(this_);
        IiIIiIiiiI.iiiiiIIiiI = (Integer)IiIIiIiiiI.iiIIIIiIII.get();
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        return IIIiIiIiii.ALLATORIxDEMO((class_1799 IiIIiIiiiI) -> IiIIiIiiiI.getItem() instanceof class_1779);
    }

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

