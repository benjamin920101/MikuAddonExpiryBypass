/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.item.Items
 *  net.minecraft.item.TridentItem
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIIIiIii;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiIiiIIiIi;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.item.Items;
import net.minecraft.item.TridentItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;

public class iiIiIiiiiI
extends iiiiIiIiii {
    private final Setting<Boolean> iIIiiIIIII;
    private int iiIiIIiIIi;
    private final Setting<Boolean> IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private final Setting<Double> iiiiiIIiiI;
    private boolean iiIIIIiIII;
    private final Setting<Integer> IiIIiIiiiI;
    private final SettingGroup ALLATORIxDEMO;

    private /* synthetic */ boolean IiiiiiiIIi() {
        if (this.iiIIIIiIII.player.getMainHandStack().getItem() == class_1802.TRIDENT || this.iiIIIIiIII.player.getOffHandStack().getItem() == class_1802.TRIDENT) {
            return true;
        }
        return false;
    }

    public void onDeactivate() {
        this.info(iiIiiIIiIi.ALLATORIxDEMO("\u4e10\u53ae\u621b\u98a6\u8857\u6a4e\u575b\u5d88\u5045\u7543\uff09"), new Object[3 ^ 3]);
    }

    @Override
    public void onActivate() {
        this.iiIiIIiIIi = 3 >> 2;
        this.iiIIIIiIII = this.iiIiIIiIIi;
        this.info(IIiIIIiIii.ALLATORIxDEMO("\u4e2a\u538d\u621c\u989a\u884f\u6a65\u5754\u5db6\u542c\u754c\uff22"), new Object[3 & 4]);
    }

    public iiIiIiiiiI() {
        iiIiIiiiiI iiIiIiiiiI2 = this;
        super(iiIiiIIiIi.ALLATORIxDEMO("\u4e0d\u53b3\u6206\u98ee\u881f"), IIiIIIiIii.ALLATORIxDEMO("\u4f7c\u756c\u4e0a\u538d\u621c\u98ba\u886f"));
        iiIiIiiiiI2.ALLATORIxDEMO = iiIiIiiiiI2.settings.getDefaultGroup();
        iiIiIiiiiI2.IIIIiIiiIi = iiIiIiiiiI2.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiIi.ALLATORIxDEMO("\u513b\u8ba1\u65d0\u6c67"))).description(IIiIIIiIii.ALLATORIxDEMO("\u5142\u8bdc\u570b\u6ce5\u670a\u6c50\u76a7\u6081\u51b6\u4e4f\u4f7c\u756c\u4e0a\u538d\u621c\u98ba\u886f"))).defaultValue((Object)(5 >> 2))).build());
        this.iIIiiIIIII = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiIi.ALLATORIxDEMO("\u8190\u52b1\u98ee\u881f"))).description(IIiIIIiIii.ALLATORIxDEMO("\u81ae\u52ab\u4f3b\u752b\u6f84\u6d42\u652c\u67bf"))).defaultValue((Object)(3 >> 2))).build());
        this.IiIIiIiiiI = this.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiIIiIi.ALLATORIxDEMO("\u899c\u53c8\u95c4\u96c7"))).description(IIiIIIiIii.ALLATORIxDEMO("\u6fe3\u6d05\u52a3\u907b\u4e68\u95b0\u7687\u95b0\u9697\uff4cw-`\u000f\uff2a"))).defaultValue((Object)(--3))).min(3 & 4).sliderMax(0x3D & 0x56).visible(() -> (Boolean)this.iIIiiIIIII.get())).build());
        this.iiiiiIIiiI = this.ALLATORIxDEMO.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIiiIIiIi.ALLATORIxDEMO("\u9065\u5ebf\u503d\u73d4"))).description(IIiIIIiIii.ALLATORIxDEMO("\u98dd\u8808\u901c\u5ee2\u7687\u5069\u6553"))).defaultValue(1.0).min(0.5).max(3.0).sliderMin(0.5).sliderMax(3.0).build());
        this.IiIiIIIIiI = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiIi.ALLATORIxDEMO("\u8190\u52b1\u5237\u6331"))).description(IIiIIIiIii.ALLATORIxDEMO("\u81ae\u52ab\u5243\u6361\u5274\u4e0a\u53ad\u623c"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        iiIiIiiiiI iiIiIiiiiI3 = this;
        iiIiIiiiiI3.iiIiIIiIIi = 2 & 5;
        iiIiIiiiiI3.iiIIIIiIII = 3 ^ 3;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIiiIIiIi.ALLATORIxDEMO("\u0017H\u0002e\u0014aGq\u0017`&PWpG\u8bf3\u6694\u65b3\u5257\u6704\u65ca\u7251\u671c\uff52"));
        }
    }

    private /* synthetic */ void IiiiiiiIIi() {
        iiIiIiiiiI iiIiIiiiiI2 = this;
        int n = this = 2 & 5;
        while (true) {
            if (n >= 9) break;
            if (iiIiIiiiiI2.iiIIIIiIII.player.getInventory().getStack(this).getItem() == class_1802.TRIDENT) {
                IiiiIiiIII.ALLATORIxDEMO(this);
                return;
            }
            n = ++this;
        }
        int n2 = this = 9;
        while (true) {
            if (n2 >= 36) break;
            if (iiIiIiiiiI2.iiIIIIiIII.player.getInventory().getStack(this).getItem() == class_1802.TRIDENT) {
                iiIiIiiiiI2.info(iiIiiIIiIi.ALLATORIxDEMO("\u576f\u4e1f\u722e\u54e5\u6868\u4e29\u6219\u5234\u4ee1\u4e0d\u53ae\u621b\uff6b\u8bf3\u622c\u52ac\u79bc\u528c\u5277\u5fcf\u6310\u680b"), new Object[3 ^ 3]);
                return;
            }
            n2 = ++this;
        }
        iiIiIiiiiI2.info(IIiIIIiIii.ALLATORIxDEMO("\u6ca2\u674d\u627d\u5274\u4e0a\u53ad\u623c"), new Object[5 >> 3]);
        iiIiIiiiiI2.toggle();
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        if (!this.IiiiiiiIIi()) {
            return (3 ^ 3) != 0;
        }
        if (this.iiIIIIiIII.player.getMainHandStack().getItem() == class_1802.TRIDENT) {
            return this.iiIIIIiIII.player.getMainHandStack().hasEnchantments();
        }
        if (this.iiIIIIiIII.player.getOffHandStack().getItem() == class_1802.TRIDENT) {
            return this.iiIIIIiIII.player.getOffHandStack().hasEnchantments();
        }
        return false;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iiIiIiiiiI iiIiIiiiiI2 = this;
        iiIiIiiiiI2.iiIiIIiIIi += 3 >> 1;
        if (iiIiIiiiiI2.iiIiIIiIIi >= (Integer)this.IiIIiIiiiI.get()) {
            if (this.iiIIIIiIII.player.isUsingItem() && this.iiIIIIiIII.player.getActiveHand() == class_1268.MAIN_HAND) {
                if (this.iiIIIIiIII.player.getItemUseTime() >= (Integer)this.IiIIiIiiiI.get()) {
                    iiIiIiiiiI iiIiIiiiiI3 = this;
                    this.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)new class_2846(class_2846.class_2847.RELEASE_USE_ITEM, class_2338.ORIGIN, class_2350.DOWN));
                    iiIiIiiiiI3.iiIIIIiIII.player.stopUsingItem();
                    iiIiIiiiiI3.iiIiIIiIIi = 5 >> 3;
                    if (!iiIiIiiiiI3.iiIIIIiIII) {
                        this.iiIIIIiIII = --1;
                        this.info(IIiIIIiIii.ALLATORIxDEMO("\u5f03\u598f\u98dd\u8828\uff22"), new Object[3 >> 2]);
                        return;
                    }
                }
            } else if (this.iiIIIIiIII.player.getMainHandStack().getItem() instanceof class_1835) {
                iiIiIiiiiI iiIiIiiiiI4 = this;
                iiIiIiiiiI4.iiIIIIiIII.player.setSneaking((3 ^ 3) != 0);
                iiIiIiiiiI4.iiIIIIiIII.player.jump();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        iiIiIiiiiI iiIiIiiiiI2;
        iiIiIiiiiI iiIiIiiiiI3 = iiIiIiiiiI4;
        iiIiIiiiiI iiIiIiiiiI4 = post;
        iiIiIiiiiI IiIIiIiiiI = iiIiIiiiiI3;
        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) {
            return;
        }
        if (!IiIIiIiiiI.IiiiiiiIIi()) {
            if (!((Boolean)IiIIiIiiiI.IiIiIIIIiI.get()).booleanValue()) return;
            iiIiIiiiiI iiIiIiiiiI5 = IiIIiIiiiI;
            iiIiIiiiiI2 = iiIiIiiiiI5;
            iiIiIiiiiI5.IiiiiiiIIi();
        } else {
            iiIiIiiiiI2 = IiIIiIiiiI;
        }
        if (!((Boolean)iiIiIiiiiI2.iIIiiIIIII.get()).booleanValue()) return;
        IiIIiIiiiI.ALLATORIxDEMO();
    }

    public String ALLATORIxDEMO() {
        Object object = string3;
        if (!object.isActive()) {
            return iiIiiIIiIi.ALLATORIxDEMO("\u670a\u546e\u750a");
        }
        String string = ((iiIiIiiiiI)object).iiIIIIiIII ? IIiIIIiIii.ALLATORIxDEMO("\u98dd\u8828\u4e0e") : iiIiiIIiIi.ALLATORIxDEMO("\u5fc4\u545f");
        String string2 = (Boolean)((iiIiIiiiiI)object).IIIIiIiiIi.get() != false ? IIiIIIiIii.ALLATORIxDEMO("\u5105\u8bbb\u6584\u6c17") : iiIiiIIiIi.ALLATORIxDEMO("\u9720\u89c0\u6c16");
        String string3 = (Boolean)((iiIiIiiiiI)object).iIIiiIIIII.get() != false ? IIiIIIiIii.ALLATORIxDEMO("\u818e\u528b") : iiIiiIIiIi.ALLATORIxDEMO("\u620a\u528a");
        Object[] objectArray = new Object[--3];
        objectArray[3 ^ 3] = string;
        objectArray[3 >> 1] = string2;
        objectArray[5 >> 1] = string3;
        return String.format(IIiIIIiIii.ALLATORIxDEMO("apD_d&7#8#ap\u6a45\u5f2c"), objectArray);
    }
}

