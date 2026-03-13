/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.InteractItemEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIIIiIii;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIIIiiiiII;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.Date;
import meteordevelopment.meteorclient.events.entity.player.InteractItemEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.client.MinecraftClient;

public class iIiiIIIiII
extends iiiiIiIiii {
    private final SettingGroup iiIIiiIiii;
    private final Setting<Boolean> iIiiIiiiII;
    private boolean iIIiiIIIII;
    private final Setting<Integer> iiIiIIiIIi;
    private final Setting<Integer> IIIIiIiiIi;
    private final Setting<Integer> IiIiIIIIiI;
    private int iiiiiIIiiI;
    private int iiIIIIiIII;
    private int IiIIiIiiiI;
    private boolean ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        iIiiIIIiII iIiiIIIiII2;
        int this2;
        iIiiIIIiII IiIIiIiiiI;
        block23: {
            block22: {
                class_1799 class_17992;
                block21: {
                    class_1799 class_17993;
                    block18: {
                        iIiiIIIiII iIiiIIIiII3 = iIiiIIIiII4;
                        iIiiIIIiII iIiiIIIiII4 = post;
                        IiIIiIiiiI = iIiiIIIiII3;
                        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) {
                            return;
                        }
                        if (!IiIIiIiiiI.ALLATORIxDEMO) {
                            IiIIiIiiiI.ALLATORIxDEMO = IiiiIiiIII.IiiiiiiIIi((class_310)IiIIiIiiiI.iiIIIIiIII);
                        }
                        if (!IiIIiIiiiI.ALLATORIxDEMO) {
                            return;
                        }
                        iIiiIIIiII iIiiIIIiII5 = IiIIiIiiiI;
                        iIiiIIIiII5.IiIIiIiiiI += --1;
                        if (((Boolean)iIiiIIIiII5.iIiiIiiiII.get()).booleanValue()) {
                            IiIIiIiiiI.iiIIIIiIII = (Integer)IiIIiIiiiI.IIIIiIiiIi.get();
                            IiIIiIiiiI.iiiiiIIiiI += --1;
                        }
                        this2 = (Integer)IiIIiIiiiI.IiIiIIIIiI.get() + (Integer)IiIIiIiiiI.iiIiIIiIIi.get();
                        if ((this2 = IiIIiIiiiI.IiIIiIiiiI % this2) == 0) {
                            IiIIiIiiiI.IiIIiIiiiI = 3 ^ 3;
                        }
                        class_17992 = IiIIiIiiiI.iiIIIIiIII.player.getEquippedStack(class_1304.CHEST);
                        if (this2 >= (Integer)IiIIiIiiiI.IiIiIIIIiI.get()) break block21;
                        IiIIiIiiiI.iIIiiIIIII = 3 >> 1;
                        if (class_17992.getItem() != class_1802.ELYTRA) {
                            int n = this2 = 5 >> 3;
                            while (n < IiIIiIiiiI.iiIIIIiIII.player.getInventory().size()) {
                                class_1799 class_17994 = IiIIiIiiiI.iiIIIIiIII.player.getInventory().getStack(this2);
                                if (class_17994.getItem() == class_1802.ELYTRA) {
                                    InvUtils.move().from(this2).toArmor(1 ^ 3);
                                    class_17993 = class_17992;
                                    break block18;
                                }
                                n = ++this2;
                            }
                        }
                        class_17993 = class_17992;
                    }
                    if (class_17993.getItem() != class_1802.ELYTRA || IiIIiIiiiI.iiIIIIiIII.player.isOnGround() || IiiiIiiIII.IiiiiiiIIi((class_310)IiIIiIiiiI.iiIIIIiIII)) break block22;
                    iIiiIIIiII iIiiIIIiII6 = IiIIiIiiiI;
                    iIiiIIIiII2 = iIiiIIIiII6;
                    iIiiIIIiII6.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)new class_2848((class_1297)IiIIiIiiiI.iiIIIIiIII.player, class_2848.class_2849.START_FALL_FLYING));
                    break block23;
                }
                IiIIiIiiiI.iIIiiIIIII = 5 >> 3;
                if (class_17992.getItem() == class_1802.ELYTRA) {
                    int n;
                    block19: {
                        int n2;
                        this2 = -4 >> 2;
                        int n3 = n2 = 3 & 4;
                        while (true) {
                            if (n3 >= 36) break;
                            if (IiIIiIiiiI.iiIIIIiIII.player.getInventory().getStack(n2).isEmpty()) {
                                n = this2 = n2;
                                break block19;
                            }
                            n3 = ++n2;
                        }
                        n = this2;
                    }
                    if (n != -1) {
                        InvUtils.move().fromArmor(--2).to(this2);
                    }
                }
            }
            iIiiIIIiII2 = IiIIiIiiiI;
        }
        if (iIiiIIIiII2.iIIiiIIIII && ((Boolean)IiIIiIiiiI.iIiiIiiiII.get()).booleanValue()) {
            iIiiIIIiII iIiiIIIiII7 = IiIIiIiiiI;
            if (iIiiIIIiII7.iiiiiIIiiI >= iIiiIIIiII7.iiIIIIiIII) {
                int n;
                int n4;
                block20: {
                    this2 = -4 >> 2;
                    int n5 = n4 = 3 & 4;
                    while (true) {
                        if (n5 >= 9) break;
                        if (IiIIiIiiiI.iiIIIIiIII.player.getInventory().getStack(n4).getItem() == class_1802.FIREWORK_ROCKET) {
                            n = this2 = n4;
                            break block20;
                        }
                        n5 = ++n4;
                    }
                    n = this2;
                }
                if (n != -1) {
                    n4 = IiiiIiiIII.ALLATORIxDEMO();
                    if (this2 != n4) {
                        IiiiIiiIII.ALLATORIxDEMO(this2);
                        IiIIiIiiiI.iiIIIIiIII.interactionManager.interactItem((class_1657)IiIIiIiiiI.iiIIIIiIII.player, class_1268.MAIN_HAND);
                        IiiiIiiIII.ALLATORIxDEMO(n4);
                        return;
                    }
                    IiIIiIiiiI.iiIIIIiIII.interactionManager.interactItem((class_1657)IiIIiIiiiI.iiIIIIiIII.player, class_1268.MAIN_HAND);
                }
            }
        }
    }

    @Override
    public void onActivate() {
        super.onActivate();
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(InteractItemEvent interactItemEvent) {
        iIiiIIIiII iIiiIIIiII2 = iIiiIIIiII3;
        iIiiIIIiII iIiiIIIiII3 = interactItemEvent;
        iIiiIIIiII IiIIiIiiiI = iIiiIIIiII2;
        if (IiIIiIiiiI.iiIIIIiIII.player == null) {
            return;
        }
        iIiiIIIiII3 = IiIIiIiiiI.iiIIIIiIII.player.getStackInHand(((InteractItemEvent)iIiiIIIiII3).hand);
        if (iIiiIIIiII3 != null && iIiiIIIiII3.getItem() == class_1802.FIREWORK_ROCKET) {
            IiIIiIiiiI.iiiiiIIiiI = 3 ^ 3;
        }
    }

    public iIiiIIIiII() {
        iIiiIIIiII iIiiIIIiII2 = this;
        super(IIiIIIiIii.ALLATORIxDEMO("\u65a4\u9653\u8074\u4e66\u97fc\u7fe6"), iIIIiiiiII.ALLATORIxDEMO("\u8188\u52cd\u5265\u630c\u97f1\u7faa\u5f68\u515c\u4ecd\u82ea\u776e\u8058\u4e0a\u5ece\uff63\u5e1e\u8185\u52e0\u4f30\u7560\u7090\u82f9\u7024\u7bc5\u7e9b\u6349\u9891\u8804\u304d"));
        iIiiIIIiII2.iiIIiiIiii = iIiiIIIiII2.settings.getDefaultGroup();
        iIiiIIIiII2.IiIiIIIIiI = iIiiIIIiII2.iiIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u97dc\u7fc6\u5f64\u540c\u6592\u955c"))).description(iIIIiiiiII.ALLATORIxDEMO("\u4fb5\u636e\u97d0\u7f8a\u888d\u5948\u72fe\u604e\u76ec\u6e57\u6247\u5274\u6538\u304d"))).defaultValue((Object)(0x3F & 0x4F))).min(3 >> 1).sliderRange(5 >> 2, 0x3FCE & 0x40F9).build());
        this.iiIiIIiIIi = this.iiIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u97dc\u7fc6\u5117\u95ce\u6592\u955c"))).description(iIIIiiiiII.ALLATORIxDEMO("\u4fb5\u636e\u97d0\u7f8a\u5330\u4e44\u72fe\u604e\u76ec\u6e57\u6247\u5274\u6538\u304d"))).defaultValue((Object)(--2))).min(3 >> 1).sliderRange(4 ^ 5, 0x22EB & 0x5DDC).build());
        this.iIiiIiiiII = this.iiIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u81ae\u52ab\u53b5\u5c27\u70bb\u8292"))).description(iIIIiiiiII.ALLATORIxDEMO("\u8185\u52e0\u4f30\u7560\u7090\u82f9\u7024\u7bc5\u7e9b\u6349\u9891\u8804\u304d"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.IIIIiIiiIi = this.iiIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u709b\u82b2\u53b5\u5c27\u9590\u96b7"))).description(iIIIiiiiII.ALLATORIxDEMO("\u4e4c\u6b4e\u70b7\u82de\u5399\u5c4b\u4e03\u95bb\u76cc\u6e77\u6267\u5254\u6538\u95bb\u96dc\u304d"))).defaultValue((Object)(0x2B & 0x7C))).min(3 >> 1).sliderRange(5 >> 2, 0x77FF & 0x8C8).build());
        iIiiIIIiII iIiiIIIiII3 = this;
        this.IiIIiIiiiI = 2 & 5;
        this.ALLATORIxDEMO = this.IiIIiIiiiI;
        this.iIIiiIIIII = 3 >> 2;
        iIiiIIIiII3.iiIIIIiIII = this.iIIiiIIIII;
        iIiiIIIiII3.iiiiiIIiiI = 3 >> 2;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiIIIiIii.ALLATORIxDEMO("\u0013hf%7fDV4g%w\u0001\u0002D\u8bd4\u6690\u6593\u5274\u6703\u65d4\u726b\u6748\uff22"));
        }
    }
}

