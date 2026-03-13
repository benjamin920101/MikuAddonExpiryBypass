/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.PlaySoundEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.projectile.FireworkRocketEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.world.BlockView
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIiIIIIi;
import com.github.mikumiku.addon.IiIiIIiIII;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIiIIiiIiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.ChestplateFly;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import meteordevelopment.meteorclient.events.world.PlaySoundEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;

public class IiIiiIIIII
extends iiiiIiIiii {
    private class_243 iiIiIIiIIi;
    public final Setting<Integer> IIIIiIiiIi;
    private final Setting<ChestplateFly.Mode> IiIiIIIIiI;
    private boolean iiiiiIIiiI;
    private IIiIiIIIIi iiIIIIiIII;
    private final SettingGroup IiIIiIiiiI;
    private int ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    @EventHandler
    public void ALLATORIxDEMO(PlaySoundEvent playSoundEvent) {
        IiIiiIIIII iiIiiIIIII = iterator;
        Iterator<class_2960> iterator = List.of(class_2960.of((String)iIiIIiiIiI.ALLATORIxDEMO("Mr\u00011\t#\u000b7\u0015`\t/Evi\u001d\u00151(\u000eI9\u0016).\f\u0018\u001b\"\u0012\"\u000e.\u001f")), class_2960.of((String)IiIiIIiIII.ALLATORIxDEMO("n~6)tqs`f<py}av-MFpy\u0011Nn~v{`EZ_WNMBKN")), class_2960.of((String)iIiIIiiIiI.ALLATORIxDEMO("v\u0006:\u000f2\u00180\u0007.Z2T~*R\u0006.*\u0013\u0015r\u0002-2\u00157#\"\u0010>\b5\u001d")), class_2960.of((String)IiIiIIiIII.ALLATORIxDEMO("5%yfqts`m7qx=!\u0011JmfPY1nn~V[`OVJRDQO")), class_2960.of((String)iIiIIiiIiI.ALLATORIxDEMO("9\u0003?\u000f2\u0013;\u0006/\u001ar3\u0019\nr&\u000e\n3\u0015r\"\r2\u00157# \u0013+\u0018")), class_2960.of((String)IiIiIIiIII.ALLATORIxDEMO("n{hwekl~xb%KNr%^Yrdm%ZZJBOtVYPE")), class_2960.of((String)iIiIIiiIiI.ALLATORIxDEMO("\u0002=\u00044\t#\u0000<\u0014aIo\"\u0011I=5\u0011\b.I96\t.\f\u0018\u001f/\u001d.\u0012")), class_2960.of((String)IiIiIIiIII.ALLATORIxDEMO("5%yfqts`m7qx=!\u0011JmfPY1nn~V[`GZJKCZY")), class_2960.of((String)iIiIIiiIiI.ALLATORIxDEMO("\u00078\u000f?\u0003)A}3F\u000e(\"\u0011I9\u000b%3\u000e&R!\u0010>\u0015)\u001b"))).iterator();
        while (iterator.hasNext()) {
            void IiIIiIiiiI;
            if (!((class_2960)iterator.next()).equals((Object)IiIIiIiiiI.sound.getId())) continue;
            IiIIiIiiiI.cancel();
            return;
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        block10: {
            IiIiiIIIII iiIiiIIIII;
            IiIiiIIIII IiIIiIiiiI;
            Object object;
            block9: {
                IiIiiIIIII iiIiiIIIII2 = object;
                object = post;
                IiIIiIiiiI = iiIiiIIIII2;
                if (IiIIiIiiiI.ALLATORIxDEMO()) break block9;
                class_1792[] class_1792Array = new class_1792[--1];
                class_1792Array[2 & 5] = class_1802.FIREWORK_ROCKET;
                if (!InvUtils.find((class_1792[])class_1792Array).found()) break block10;
            }
            object = ((class_310)IiIIiIiiiI.iiIIIIiIII).player.getBoundingBox();
            double d = ((class_238)object).minY;
            object = new class_238(((class_238)object).minX, d - 0.1, ((class_238)object).minZ, ((class_238)object).maxX, d, ((class_238)object).maxZ);
            for (class_2338 class_23382 : class_2338.iterate((int)((int)Math.floor(((class_238)object).minX)), (int)((int)Math.floor(((class_238)object).minY)), (int)((int)Math.floor(((class_238)object).minZ)), (int)((int)Math.floor(((class_238)object).maxX)), (int)((int)Math.floor(((class_238)object).maxY)), (int)((int)Math.floor(((class_238)object).maxZ)))) {
                double d2;
                if (!((class_310)IiIIiIiiiI.iiIIIIiIII).world.getBlockState(class_23382).isSolidBlock((class_1922)((class_310)IiIIiIiiiI.iiIIIIiIII).world, class_23382)) continue;
                double d3 = (double)class_23382.getY() + 1.0;
                d3 = d - d3;
                if (!(d2 >= 0.0) || !(d3 < 0.1) || !(IiIIiIiiiI.iiIiIIiIIi.y < 0.0)) continue;
                IiIiiIIIII iiIiiIIIII3 = IiIIiIiiiI;
                IiIIiIiiiI.iiIiIIiIIi = new class_243(IiIIiIiiiI.iiIiIIiIIi.x, 0.1, IiIIiIiiiI.iiIiIIiIIi.z);
            }
            IiIiiIIIII iiIiiIIIII4 = IiIIiIiiiI;
            iiIiiIIIII4.iiIIIIiIII = iiIiiIIIII4.ALLATORIxDEMO();
            ((class_310)iiIiiIIIII4.iiIIIIiIII).player.networkHandler.sendPacket((class_2596)new class_2848((class_1297)((class_310)IiIIiIiiiI.iiIIIIiIII).player, class_2848.class_2849.START_FALL_FLYING));
            if (iiIiiIIIII4.ALLATORIxDEMO <= 0) {
                IiIIiIiiiI.iiiiiIIiiI = 4 ^ 5;
            }
            if (IiIIiIiiiI.iiiiiIIiiI && IiIIiIiiiI.iiIiIIiIIi.length() > 1.0E-7) {
                IiIIiIiiiI.ALLATORIxDEMO();
                IiIIiIiiiI.iiiiiIIiiI = 2 & 5;
            }
            if (IiIIiIiiiI.ALLATORIxDEMO >= 0) {
                IiIIiIiiiI.ALLATORIxDEMO -= --1;
                iiIiiIIIII = IiIIiIiiiI;
            } else {
                IiIIiIiiiI.ALLATORIxDEMO = (Integer)IiIIiIiiiI.IIIIiIiiIi.get();
                iiIiiIIIII = IiIIiIiiiI;
            }
            if (iiIiiIIIII.IiIiIIIIiI.get() == ChestplateFly.Mode.IiIIiIiiiI) {
                IiIiiIIIII iiIiiIIIII5 = IiIIiIiiiI;
                iiIiiIIIII5.ALLATORIxDEMO(iiIiiIIIII5.iiIIIIiIII);
                iiIiiIIIII5.iiIIIIiIII = null;
            }
        }
    }

    public void onDeactivate() {
        IiIiiIIIII iiIiiIIIII = this;
        iiIiiIIIII.ALLATORIxDEMO(this.iiIIIIiIII);
        IiiiIiiIII.IiiiiiiIIi();
        ((class_310)iiIiiIIIII.iiIIIIiIII).player.setSneaking((2 & 5) != 0);
        iiIiiIIIII.ALLATORIxDEMO = 3 & 4;
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        IiIiiIIIII iiIiiIIIII = iiIiiIIIII2;
        int n = 2 & 5;
        for (IiIiiIIIII iiIiiIIIII2 : ((class_310)iiIiiIIIII.iiIIIIiIII).world.getEntities()) {
            if (!(iiIiiIIIII2 instanceof class_1671) || (iiIiiIIIII2 = (class_1671)iiIiiIIIII2).getOwner() == null || !iiIiiIIIII2.getOwner().equals((Object)((class_310)iiIiiIIIII.iiIIIIiIII).player)) continue;
            int cfr_ignored_0 = 2 ^ 3;
        }
        return n != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(IIiIiIIIIi iIiIiIIIIi) {
        IiIiiIIIII iiIiiIIIII = iiIiiIIIII2;
        if (!((class_310)iiIiiIIIII.iiIIIIiIII).player.getEquippedStack(class_1304.CHEST).getItem().equals(class_1802.DIAMOND_CHESTPLATE) && !((class_310)iiIiiIIIII.iiIIIIiIII).player.getEquippedStack(class_1304.CHEST).getItem().equals(class_1802.NETHERITE_CHESTPLATE)) {
            class_1792[] class_1792Array = new class_1792[2 ^ 3];
            class_1792Array[3 >> 2] = class_1802.NETHERITE_CHESTPLATE;
            IiIiiIIIII iiIiiIIIII2 = InvUtils.findInHotbar((class_1792[])class_1792Array);
            if (!iiIiiIIIII2.found()) {
                class_1792[] class_1792Array2 = new class_1792[--1];
                class_1792Array2[5 >> 3] = class_1802.DIAMOND_CHESTPLATE;
                iiIiiIIIII2 = InvUtils.findInHotbar((class_1792[])class_1792Array2);
            }
            if (iiIiiIIIII2.found()) {
                void IiIIiIiiiI;
                ((class_310)iiIiiIIIII.iiIIIIiIII).interactionManager.clickSlot(((class_310)iiIiiIIIII.iiIIIIiIII).player.playerScreenHandler.syncId, 0x4F & 0x36, iiIiiIIIII2.slot(), class_1713.SWAP, (class_1657)((class_310)iiIiiIIIII.iiIIIIiIII).player);
                if (IiIIiIiiiI != null) {
                    ((class_310)iiIiiIIIII.iiIIIIiIII).interactionManager.clickSlot(((class_310)iiIiiIIIII.iiIIIIiIII).player.playerScreenHandler.syncId, IiIIiIiiiI.ALLATORIxDEMO, iiIiiIIIII2.slot(), class_1713.SWAP, (class_1657)((class_310)iiIiiIIIII.iiIIIIiIII).player);
                    return;
                }
            } else {
                class_1792[] class_1792Array3 = new class_1792[1];
                class_1792Array3[5 >> 3] = class_1802.NETHERITE_CHESTPLATE;
                iiIiiIIIII2 = InvUtils.find((class_1792[])class_1792Array3);
                if (!iiIiiIIIII2.found()) {
                    class_1792[] class_1792Array4 = new class_1792[3 >> 1];
                    class_1792Array4[5 >> 3] = class_1802.DIAMOND_CHESTPLATE;
                    iiIiiIIIII2 = InvUtils.find((class_1792[])class_1792Array4);
                }
                if (iiIiiIIIII2.found()) {
                    InvUtils.move().from(iiIiiIIIII2.slot()).toArmor(1 ^ 3);
                }
            }
        }
    }

    public IIiIiIIIIi ALLATORIxDEMO() {
        IiIiiIIIII iiIiiIIIII = iiIiiIIIII2;
        if (((class_310)iiIiiIIIII.iiIIIIiIII).player.getEquippedStack(class_1304.CHEST).getItem().equals(class_1802.ELYTRA)) {
            return null;
        }
        class_1792[] class_1792Array = new class_1792[1];
        class_1792Array[3 >> 2] = class_1802.ELYTRA;
        FindItemResult findItemResult = InvUtils.findInHotbar((class_1792[])class_1792Array);
        if (findItemResult.found()) {
            ((class_310)iiIiiIIIII.iiIIIIiIII).interactionManager.clickSlot(((class_310)iiIiiIIIII.iiIIIIiIII).player.playerScreenHandler.syncId, 0x3E & 0x47, findItemResult.slot(), class_1713.SWAP, (class_1657)((class_310)iiIiiIIIII.iiIIIIiIII).player);
            return null;
        }
        class_1792[] class_1792Array2 = new class_1792[1];
        class_1792Array2[3 ^ 3] = class_1802.ELYTRA;
        findItemResult = InvUtils.find((class_1792[])class_1792Array2);
        if (!findItemResult.found()) {
            return null;
        }
        IiIiiIIIII iiIiiIIIII2 = InvUtils.findInHotbar(IiIIiIiiiI -> {
            if (IiIIiIiiiI.getItem() != class_1802.TOTEM_OF_UNDYING) {
                return (3 & 5) != 0;
            }
            return false;
        });
        ((class_310)iiIiiIIIII.iiIIIIiIII).interactionManager.clickSlot(((class_310)iiIiiIIIII.iiIIIIiIII).player.playerScreenHandler.syncId, findItemResult.slot(), iiIiiIIIII2.found() ? iiIiiIIIII2.slot() : 0, class_1713.SWAP, (class_1657)((class_310)iiIiiIIIII.iiIIIIiIII).player);
        ((class_310)iiIiiIIIII.iiIIIIiIII).interactionManager.clickSlot(((class_310)iiIiiIIIII.iiIIIIiIII).player.playerScreenHandler.syncId, 0xE & 0x77, iiIiiIIIII2.found() ? iiIiiIIIII2.slot() : 0, class_1713.SWAP, (class_1657)((class_310)iiIiiIIIII.iiIIIIiIII).player);
        IIiIiIIIIi iIiIiIIIIi = new IIiIiIIIIi(iiIiiIIIII);
        new IIiIiIIIIi(iiIiiIIIII).IiIIiIiiiI = iiIiiIIIII2.found() ? iiIiiIIIII2.slot() : 0;
        iIiIiIIIIi.ALLATORIxDEMO = findItemResult.slot();
        return iIiIiIIIIi;
    }

    public IiIiiIIIII() {
        IiIiiIIIII iiIiiIIIII = this;
        super(IiIiIIiIII.ALLATORIxDEMO("\u750d\u98f5"), iIiIIiiIiI.ALLATORIxDEMO("\u51ca\u4e7c\u6b66\u307e"));
        iiIiiIIIII.IiIIiIiiiI = iiIiiIIIII.settings.getDefaultGroup();
        iiIiiIIIII.IiIiIIIIiI = iiIiiIIIII.IiIIiIiiiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIiIIiIII.ALLATORIxDEMO("\u6a1e\u5f24"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u51f4\u5be6\u6a66\u572b\u571a\u98d7\u882b\u65aa\u59e2\u4f0e\u5963\u745a\u88bf\u5946\uff2a\u0001M{A\u80a2\u7551\u6a79\u5f2f\uff01\u6ba6\u6b73\u4f18\u7574\u97e2\u7f84\u98b8\u8811\u5475\u4f5a\u7aa7\u5324\u6342\u56c5\u809b\u756a\uff6b\u7574\u4eeb\u5776\u98a5\u880c\u4e6d\u6240\u65f0\u95a8\u5f8e\u9041\u527c\u6322\u3022\u0011OyJ\u97c9\u7faf\u6a70\u5f6e\uff40\u4fbd\u635a\u97b8\u7fde\u4e4a\u631e\u56b9\u80a4\u7575\uff70\u9065\u5454\u9518\u65aa\u95b3\u98a2\u880b\u626a\u8f9b\u8da1\u79fc\u63de\u7d65\u307e"))).defaultValue((Object)ChestplateFly.Mode.IiIIiIiiiI)).build());
        this.IIIIiIiiIi = this.IiIIiIiiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiIIiIII.ALLATORIxDEMO("\u70e0\u829a\u5ec9\u8ff4"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u63db\u5271\u8196\u52ef\u4f03\u751a\u70d6\u82d6\u7037\u7bcd\u76df\u6591\u95a8\u958e\u96d5\uff38\u535e\u4f20\uff4c\u79b3\uff53\u3061R\u6550\u5027\u8de3\u4f1c\uff6b\u7083\u82cb\u4f3e\u754e\u8dd7\u98ea\u7e01\uff60\u9889\u886c\u9004\u5ec5\u8dd2\u5e14\u7a6f\uff7e\u652e\u5047\u8dca\u9abb\uff54\u527e\u4f23\u754d\u95aa\u96ef\u8dca\u955f\uff17\u82ed\u7755\u70b5\u82e0\u3068[\u9eb9\u8bfe\u505c{\u0015;\u882f\u7946\u6ba8\u96c8\u7ee1\\R|\u79b5\u4f23\u756f\u4e7c\u6b66\u70a3\u82f6\u63d4\u8f9c\u98a2\u880b\u307e"))).defaultValue((Object)(--5))).sliderRange(2 & 5, 0x4A & 0x3F).build());
        IiIiiIIIII iiIiiIIIII2 = this;
        this.ALLATORIxDEMO = 3 ^ 3;
        iiIiiIIIII2.iiiiiIIiiI = this.ALLATORIxDEMO;
        iiIiiIIIII2.iiIiIIiIIi = class_243.ZERO;
        iiIiiIIIII2.iiIIIIiIII = null;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiIiIIiIII.ALLATORIxDEMO("H`=-LN?~OO~\u007fz*\u001f\u8bdc\u66cb\u659b\u520f\u672b\u658f\u7263\u6713\uff2a"));
        }
    }

    @Override
    public void onActivate() {
        IiIiiIIIII iiIiiIIIII = this;
        super.onActivate();
        iiIiiIIIII.iiiiiIIiiI = iiIiiIIIII.ALLATORIxDEMO();
        iiIiiIIIII.iiIiIIiIIi = ((class_310)iiIiiIIIII.iiIIIIiIII).player.getVelocity();
        ((class_310)iiIiiIIIII.iiIIIIiIII).player.jump();
        ((class_310)iiIiiIIIII.iiIIIIiIII).player.setOnGround((3 ^ 3) != 0);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IiIiiIIIII iiIiiIIIII = this;
        iiIiiIIIII.ALLATORIxDEMO = (int)((double)((Integer)iiIiiIIIII.IIIIiIiiIi.get()).intValue() * 20.0);
        int n = -4 >> 2;
        int n2 = -4 >> 2;
        class_1792[] class_1792Array = new class_1792[3 & 5];
        class_1792Array[3 ^ 3] = class_1802.FIREWORK_ROCKET;
        FindItemResult findItemResult = InvUtils.findInHotbar((class_1792[])class_1792Array);
        if (!findItemResult.found()) {
            class_1792[] class_1792Array2 = new class_1792[3 & 5];
            class_1792Array2[2 & 5] = class_1802.FIREWORK_ROCKET;
            FindItemResult findItemResult2 = InvUtils.find((class_1792[])class_1792Array2);
            if (!findItemResult2.found()) {
                return;
            }
            FindItemResult findItemResult3 = InvUtils.findInHotbar(IiIIiIiiiI -> {
                if (IiIIiIiiiI.getItem() != class_1802.TOTEM_OF_UNDYING) {
                    return 3 >> 1;
                }
                return false;
            });
            n2 = findItemResult2.slot();
            n = findItemResult3.found() ? findItemResult3.slot() : 0;
            int n3 = --1;
            ((class_310)iiIiiIIIII.iiIIIIiIII).interactionManager.clickSlot(((class_310)iiIiiIIIII.iiIIIIiIII).player.playerScreenHandler.syncId, n2, n, class_1713.SWAP, (class_1657)((class_310)iiIiiIIIII.iiIIIIiIII).player);
            class_1792[] class_1792Array3 = new class_1792[n3];
            class_1792Array3[3 & 4] = class_1802.FIREWORK_ROCKET;
            findItemResult = InvUtils.findInHotbar((class_1792[])class_1792Array3);
        }
        if (findItemResult.found()) {
            int n4;
            if (findItemResult.isOffhand()) {
                n4 = n2;
                ((class_310)iiIiiIIIII.iiIIIIiIII).interactionManager.interactItem((class_1657)((class_310)iiIiiIIIII.iiIIIIiIII).player, class_1268.OFF_HAND);
                ((class_310)iiIiiIIIII.iiIIIIiIII).player.swingHand(class_1268.OFF_HAND);
            } else {
                InvUtils.swap((int)findItemResult.slot(), (boolean)(--1 != 0));
                ((class_310)iiIiiIIIII.iiIIIIiIII).interactionManager.interactItem((class_1657)((class_310)iiIiiIIIII.iiIIIIiIII).player, class_1268.MAIN_HAND);
                ((class_310)iiIiiIIIII.iiIIIIiIII).player.swingHand(class_1268.MAIN_HAND);
                InvUtils.swapBack();
                n4 = n2;
            }
            if (n4 != -1) {
                if (n != -4 >> 2) {
                    ((class_310)iiIiiIIIII.iiIIIIiIII).interactionManager.clickSlot(((class_310)iiIiiIIIII.iiIIIIiIII).player.playerScreenHandler.syncId, n2, n, class_1713.SWAP, (class_1657)((class_310)iiIiiIIIII.iiIIIIiIII).player);
                }
            }
        }
    }
}

