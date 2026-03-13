/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.world.BlockIterator
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.util.Identifier
 *  net.minecraft.registry.Registries
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIIIiiIi;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIiIiIiIIi;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.lang.invoke.LambdaMetafactory;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.world.BlockIterator;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;

public class IIiiIIIIIi
extends iiiiIiIiii {
    private final Setting<Integer> IiiIIiiiiI;
    private boolean IiIIIIiiii;
    private static final class_1291 IiiIIIiiIi = (class_1291)class_7923.STATUS_EFFECT.get(class_2960.of((String)IIIIIIiiIi.ALLATORIxDEMO("L\u001eX2U%o$c$~6d\u0014O")));
    private boolean iiIIiiIiii;
    private final Setting<Integer> iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private final Setting<Boolean> iiIiIIiIIi;
    private final SettingGroup IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private final Setting<Boolean> iiiiiIIiiI;
    private class_2338 iiIIIIiIII;
    private final Setting<Integer> IiIIiIiiiI;
    private final SettingGroup ALLATORIxDEMO;

    public IIiiIIIIIi() {
        IIiiIIIIIi iIiiIIIIIi = this;
        super(iIiIiIiIIi.ALLATORIxDEMO("\u81c6\u52af\u6dee\u967f"), IIIIIIiiIi.ALLATORIxDEMO("\u81e0\u52ff\u625b\u703a\u4f6a\u543f\u56fe\u76f3\u7041"));
        iIiiIIIIIi.IIIIiIiiIi = iIiiIIIIIi.settings.createGroup(iIiIiIiIIi.ALLATORIxDEMO("\u6260\u7077\u5444\u56f3\u76e2\u7026"));
        iIiiIIIIIi.ALLATORIxDEMO = iIiiIIIIIi.settings.createGroup(IIIIIIiiIi.ALLATORIxDEMO("\u6206\u7067\u8efc\u4e00\u76f3\u7041"));
        iIiiIIIIIi.iiiiiIIiiI = iIiiIIIIIi.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIIi.ALLATORIxDEMO("\u700b\u7026"))).description(IIIIIIiiIi.ALLATORIxDEMO("\u81bd\u52a2\u6206\u7067\u4f37\u5462\u56a3\u768e\u701c\u3028"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.IiiIIiiiiI = this.IIIIiIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiIiIiIIi.ALLATORIxDEMO("\u6c18\u5e74\u532c\u5fc9"))).description(IIIIIIiiIi.ALLATORIxDEMO("\u6416\u7d75\u7061\u76d3\u6c3e\u5e24\u5340\u5ff3\u3028"))).defaultValue((Object)(--4))).min(3 ^ 3).sliderMax(0x77 & 0xE).build());
        this.iIiiIiiiII = this.IIIIiIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiIiIiIIi.ALLATORIxDEMO("\u57ae\u76f3\u532c\u5fc9"))).description(IIIIIIiiIi.ALLATORIxDEMO("\u6416\u7d75\u7061\u76d3\u5788\u76a3\u5340\u5ff3\u3028"))).defaultValue((Object)(--4))).min(2 & 5).sliderMax(0x1E & 0x67).build());
        this.IiIIiIiiiI = this.IIIIiIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiIiIiIIi.ALLATORIxDEMO("\u6516\u9182"))).description(IIIIIIiiIi.ALLATORIxDEMO("\u6b98\u5231\u6757\u5910\u6206\u7067\u76d3\u65b3\u5700\u657a\u91b8\u3028"))).defaultValue((Object)(--5))).min(3 >> 1).sliderMax(0x3A & 0x77).build());
        this.iiIiIIiIIi = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIIi.ALLATORIxDEMO("\u81c6\u52af\u6558\u6c79"))).description(IIIIIIiiIi.ALLATORIxDEMO("\u5f63\u4f0d\u8efc\u4e00\u7717\u7061\u6581\uff22\u4e63\u6c8b\u675e\u629d\u703c\u6542\u67cb\uff03\u81bd\u52a2\u6569\u7f64\u6c43\u3028"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.IiIiIIIIiI = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIIi.ALLATORIxDEMO("\u5c69\u4e2a\u6558\u6c79"))).description(IIIIIIiiIi.ALLATORIxDEMO("\u6534\u7f39\u6c3e\u65a1\u81e0\u52ff\u5c0c\u4f37\u5c4f\u4e5a\u3028"))).defaultValue((Object)(3 >> 2))).build());
        this.iIIiiIIIII = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIiIiIIi.ALLATORIxDEMO("\u571c\u9765\u622b\u6c79"))).description(IIIIIIiiIi.ALLATORIxDEMO("\u53bd\u6703\u577f\u573a\u9735\u4e00\u65a1\u6247\u6569\u7f64\u6c43\u3028"))).defaultValue((Object)(3 >> 2))).build());
        IIiiIIIIIi iIiiIIIIIi2 = this;
        this.iiIIiiIiii = 3 ^ 3;
        iIiiIIIIIi2.iiIIIIiIII = null;
        iIiiIIIIIi2.IiIIIIiiii = 4 ^ 5;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIiIiIiIIi.ALLATORIxDEMO("AVt[b_1Oa^Pn\u0001n\u0011\u8bed\u66c2\u65ad\u5201\u671a\u659c\u724f\u674a\uff4c"));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        IIiiIIIIIi IiIIiIiiiI;
        IIiiIIIIIi iIiiIIIIIi = iIiiIIIIIi2;
        IIiiIIIIIi iIiiIIIIIi2 = class_23382;
        IIiiIIIIIi iIiiIIIIIi3 = IiIIiIiiiI = iIiiIIIIIi;
        iIiiIIIIIi3.iiIIIIiIII.getNetworkHandler().sendPacket((class_2596)new class_2846(class_2846.class_2847.START_DESTROY_BLOCK, (class_2338)iIiiIIIIIi2, class_2350.UP));
        iIiiIIIIIi3.iiIIIIiIII.player.swingHand(class_1268.MAIN_HAND);
        iIiiIIIIIi3.iiIIIIiIII.getNetworkHandler().sendPacket((class_2596)new class_2846(class_2846.class_2847.STOP_DESTROY_BLOCK, (class_2338)iIiiIIIIIi2, class_2350.UP));
    }

    private /* synthetic */ void ALLATORIxDEMO(int n) {
        int n22 = n;
        IIiiIIIIIi IiIIiIiiiI = this;
        if (n22 != -4 >> 2) {
            int n3 = IiiiIiiIII.ALLATORIxDEMO();
            if (((Boolean)IiIIiIiiiI.IiIiIIIIiI.get()).booleanValue()) {
                PlayerUtils.centerPlayer();
            }
            IiiiIiiIII.ALLATORIxDEMO(n22);
            IIiiIIIIIi iIiiIIIIIi = IiIIiIiiiI;
            float n22 = iIiiIIIIIi.iiIIIIiIII.gameRenderer.getCamera().getYaw() % 360.0f;
            float f = iIiiIIIIIi.iiIIIIiIII.gameRenderer.getCamera().getPitch() % 360.0f;
            Rotations.rotate((double)n22, (double)90.0);
            iIiiIIIIIi.iiIIIIiIII.interactionManager.interactItem((class_1657)IiIIiIiiiI.iiIIIIiIII.player, class_1268.MAIN_HAND);
            IiiiIiiIII.ALLATORIxDEMO(n3);
            Rotations.rotate((double)n22, (double)f);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(AtomicInteger atomicInteger, class_2338 class_23382, class_2680 class_26802) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IIiiIIIIIi iIiiIIIIIi = iIiiIIIIIi2;
        IIiiIIIIIi iIiiIIIIIi2 = class_23382;
        IIiiIIIIIi IiIIiIiiiI3 = iIiiIIIIIi;
        if (IiIIiIiiiI2.get() <= (Integer)IiIIiIiiiI3.IiIIiIiiiI.get() && (IiIIiIiiiI.getBlock() == class_2246.FIRE || IiIIiIiiiI3.iiIIIIiIII.world.getBlockState((class_2338)iIiiIIIIIi2).getBlock() == class_2246.SOUL_FIRE)) {
            IiIIiIiiiI3.ALLATORIxDEMO((class_2338)iIiiIIIIIi2);
            IiIIiIiiiI2.getAndIncrement();
        }
    }

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

