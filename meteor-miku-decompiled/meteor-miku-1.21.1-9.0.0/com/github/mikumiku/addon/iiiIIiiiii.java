/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BlockListSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.ModuleListSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Module
 *  meteordevelopment.meteorclient.utils.entity.DamageUtils
 *  meteordevelopment.meteorclient.utils.misc.input.Input
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.meteorclient.utils.world.CardinalDirection
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.HandSwingC2SPacket
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.entity.player.BlockBreakingInfo
 *  net.minecraft.network.packet.s2c.play.DeathMessageS2CPacket
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiiIiIIIIi;
import com.github.mikumiku.addon.IiiiIIiiiI;
import com.github.mikumiku.addon.iIiIiIiIIi;
import com.github.mikumiku.addon.iiIiiiiIii;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.mixin.WorldRendererAccessor;
import com.github.mikumiku.addon.modules.Surround;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BlockListSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.ModuleListSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.entity.DamageUtils;
import meteordevelopment.meteorclient.utils.misc.input.Input;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.CardinalDirection;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.entity.player.BlockBreakingInfo;
import net.minecraft.network.packet.s2c.play.DeathMessageS2CPacket;

public class iiiIIiiiii
extends iiiiIiIiii {
    private final Setting<Boolean> iiiiIiiIIi;
    private final Setting<Boolean> iiIIiIiiIi;
    private final Setting<SettingColor> IiIiiiiIIi;
    private final class_2338.class_2339 iiIIiIiiII;
    private final Setting<Boolean> IIiIiiIiIi;
    private final class_2338.class_2339 IIiIIiIIii;
    private final Setting<Boolean> iIiiIiiiii;
    private final Setting<Boolean> iIiIiiIiiI;
    private final Setting<Boolean> IIiiiiiiII;
    private final Setting<Boolean> IIiiiIIIIi;
    private final Setting<SettingColor> IIIiIIIiII;
    private final SettingGroup iiIiIiiiiI;
    private final SettingGroup IIiiIiiiII;
    private final Setting<Boolean> IIIiIiiIIi;
    private final Setting<SettingColor> iiiIiIiIIi;
    private final Setting<List<Module>> iIiIiIiIii;
    private final Setting<ShapeMode> iiiiiIIIii;
    private final Setting<List<class_2248>> iIIiIIiiII;
    private final Setting<Boolean> IiiIIiiiiI;
    private final Setting<Integer> IiIIIIiiii;
    public ArrayList<Module> IiiIIIiiIi;
    private final Setting<Boolean> iiIIiiIiii;
    private final Setting<Boolean> iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private int iiIiIIiIIi;
    private final Setting<SettingColor> IIIIiIiiIi;
    private final class_2338.class_2339 IiIiIIIIiI;
    private final Setting<Surround.Center> iiiiiIIiiI;
    private final Setting<SettingColor> iiIIIIiIII;
    private final Setting<SettingColor> IiIIiIiiiI;
    private final SettingGroup ALLATORIxDEMO;

    @Override
    public void onActivate() {
        iiiIIiiiii iiiIIiiiii2 = iiiIIiiiii3;
        if (iiiIIiiiii2.iiiiiIIiiI.get() == Surround.Center.IiIIiIiiiI) {
            PlayerUtils.centerPlayer();
        }
        iiiIIiiiii2.iiIiIIiIIi = 2 & 5;
        if (((Boolean)iiiIIiiiii2.IIiiiiiiII.get()).booleanValue() && !((List)iiiIIiiiii2.iIiIiIiIii.get()).isEmpty() && iiiIIiiiii2.iiIIIIiIII.world != null && iiiIIiiiii2.iiIIIIiIII.player != null) {
            for (iiiIIiiiii iiiIIiiiii3 : (List)iiiIIiiiii2.iIiIiIiIii.get()) {
                if (!iiiIIiiiii3.isActive()) continue;
                iiiIIiiiii3.toggle();
                iiiIIiiiii2.IiiIIIiiIi.add(iiiIIiiiii3);
            }
        }
    }

    private /* synthetic */ Color IiiiiiiIIi(class_2338 class_23382) {
        iiiIIiiiii iiiIIiiiii2 = iiiIIiiiii3;
        iiiIIiiiii iiiIIiiiii3 = class_23382;
        iiiIIiiiii IiIIiIiiiI = iiiIIiiiii2;
        switch (IiIIiIiiiI.ALLATORIxDEMO((class_2338)iiiIIiiiii3).ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                while (false) {
                }
                return (SettingColor)IiIIiIiiiI.IIIIiIiiIi.get();
            }
            case 1: {
                return (SettingColor)IiIIiIiiiI.iiiIiIiIIi.get();
            }
            case 2: {
                return (SettingColor)IiIIiIiiiI.IIIiIIIiII.get();
            }
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        class_5892 IiIIiIiiiI;
        iiiIIiiiii iiiIIiiiii2 = iiiIIiiiii3;
        iiiIIiiiii iiiIIiiiii3 = IiIIiIiiiI.packet;
        if (iiiIIiiiii3 instanceof class_5892 && (iiiIIiiiii3 = iiiIIiiiii2.iiIIIIiIII.world.getEntityById((IiIIiIiiiI = (class_5892)iiiIIiiiii3).comp_2275())) == iiiIIiiiii2.iiIIIIiIII.player && ((Boolean)iiiIIiiiii2.iiIIiiIiii.get()).booleanValue()) {
            iiiIIiiiii iiiIIiiiii4 = iiiIIiiiii2;
            iiiIIiiiii4.toggle();
            iiiIIiiiii4.info(IiiIiIIIIi.ALLATORIxDEMO("\u4f71\u6b45\u4e97\uff32\u519c\u639b\u519c\u53b7?"), new Object[3 ^ 3]);
        }
    }

    public iiiIIiiiii() {
        iiiIIiiiii iiiIIiiiii2 = this;
        super(iiiiIiIiii.ALLATORIxDEMO, iiIiiiiIii.ALLATORIxDEMO("\u5687\u810e"), IiiIiIIIIi.ALLATORIxDEMO("\u4f47\u753f\u6580\u5741\u5f92\u9049\u533b\u88e8\u81d4\u5de0\u76ba\u7398\u8dad\uff3d\u51d1\u5c20\u6c0a\u6667\u7238\u70a9\u901e\u6201\u76ba\u4f35\u5b8d\u3013"));
        iiiIIiiiii2.IIiiIiiiII = iiiIIiiiii2.settings.getDefaultGroup();
        iiiIIiiiii2.iiIiIiiiiI = iiiIIiiiii2.settings.createGroup(iiIiiiiIii.ALLATORIxDEMO("\u523e\u633c\u8bcd\u7f7a"));
        iiiIIiiiii2.ALLATORIxDEMO = iiiIIiiiii2.settings.createGroup(IiiIiIIIIi.ALLATORIxDEMO("\u6e0c\u67c2\u8b80\u7f7f"));
        class_2248[] class_2248Array = new class_2248[--4];
        class_2248Array[3 & 4] = class_2246.OBSIDIAN;
        class_2248Array[2 ^ 3] = class_2246.CRYING_OBSIDIAN;
        class_2248Array[--2] = class_2246.ENDER_CHEST;
        class_2248Array[--3] = class_2246.NETHERITE_BLOCK;
        iiiIIiiiii2.iIIiIIiiII = iiiIIiiiii2.IIiiIiiiII.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u6580\u5709\u7c08\u579f"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u7536\u4ebf\u533b\u88e8\u81d4\u8eba\u76ba\u65a8\u5769\u7c6a\u57b5\u3013"))).defaultValue(class_2248Array).filter(class_22482 -> {
            iiiIIiiiii iiiIIiiiii2 = iiiIIiiiii3;
            iiiIIiiiii iiiIIiiiii3 = class_22482;
            iiiIIiiiii IiIIiIiiiI = iiiIIiiiii2;
            if (iiiIIiiiii3 == class_2246.OBSIDIAN || iiiIIiiiii3 == class_2246.CRYING_OBSIDIAN || iiiIIiiiii3 == class_2246.NETHERITE_BLOCK || iiiIIiiiii3 == class_2246.ENDER_CHEST || iiiIIiiiii3 == class_2246.RESPAWN_ANCHOR) {
                return true;
            }
            return false;
        }).build());
        this.IiIIIIiiii = this.IIiiIiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u6507\u7f30\u5e85\u8fcb"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u6bde\u6b1f\u652f\u7f50\u65a8\u5749\u4e7a\u95ea\u76b5\u5ec8\u8fce\uff36\u4ef4\u5205\u4e2b\u536b\u4f5c\uff37\u3013"))).min(5 >> 3).defaultValue((Object)(5 >> 3))).build());
        this.iiiiiIIiiI = this.IIiiIiiiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u81d3\u52f6\u5c36\u4e39"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u543e\u7516\u541f\u4f24\u5c17\u73b7\u5b87\u4f3e\u9030\u81cd\u5f42\u5273\u65a8\u5769\u4e3c\u5ffd\u4f5c\u7f50\u3013"))).defaultValue((Object)Surround.Center.iiiiiIIiiI)).build());
        this.iIiiIiiiii = this.IIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u79b8\u5291\u65a8\u66f1\u5048"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u5f6d\u73b8\u5b88\u79ea\u5296\u65e7\u66bc\u504d"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiiIIIII = this.IIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u53f5\u5c1c\u9aab\u5eb2"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u5734\u53a7\u59dc\u533c\u88ef\u65c0\u5701\u4e34\u65a8\u51b3\u652f\u7f50\u4e11\u5c5c\u9ee0\u66c2\u77c2\uff32\u9623\u6b5c\u4ec7\u4e84\u76e5\u639b\u7825\u960c\u3013"))).defaultValue((Object)(3 >> 2))).build());
        this.IiiIIiiiiI = this.IIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u4ee1\u576b\u5709\u973c\u756c\u655c"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u4edb\u5f62\u73b7\u5b87\u7ae7\u5739\u6587\u5746\u4e34\u65e7\u6273\u5df4\u4f62\u3013"))).defaultValue((Object)(3 >> 1))).build());
        this.IIiiiiiiII = this.IIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u546c\u750b\u65b2\u5157\u95ae\u514f\u4e88\u6a52\u5743"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u5716\u543e\u5296\u5314\u88c7\u6a30\u5749\u65c7\u81f4\u5299\u514d\u95fc\u6339\u5b8b\u76ba\u5167\u4ee8\u6a30\u5769\u3013"))).defaultValue((Object)(3 >> 2))).build());
        this.IIIiIiiIIi = this.IIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u5137\u95c9\u544d\u91f4\u65ee\u545c\u753c"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u577e\u533b\u88e8\u6a1f\u5746\u514d\u95fc\u65e8\uff3d\u91d3\u6581\u5f3e\u543e\u4e75\u525c\u514d\u95fc\u76ba\u6a30\u5769\u3013"))).defaultValue((Object)((3 & 4) != 0))).visible(() -> this.IIiiiiiiII.get())).build());
        this.iIiIiIiIii = this.IIiiIiiiII.add((Setting)((ModuleListSetting.Builder)((ModuleListSetting.Builder)((ModuleListSetting.Builder)new ModuleListSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u5394\u5f48\u5493\u6a52\u5743"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u6316\u5ba4\u5739\u5431\u7519\u531b\u88c8\u6a1f\u5746\u65c8\u5e85\u514d\u95fc\u76ba\u6a30\u5769\u3013"))).visible(() -> this.IIiiiiiiII.get())).build());
        this.IIiIiiIiIi = this.IIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u960b\u62fa\u7847\u575b"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u5c23\u8bc4\u626d\u6398\u5456\u56e5\u769a\u6c05\u6668\u4ed4\u960c\u6b73\u533b\u88e8\u6587\u5746\u8895\u7825\u5771\u3013"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iIiIiiIiiI = this.iiIiIiiiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u9a9c\u5e82\u539b\u532f\u65a8\u5100\u95f9"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u5f60\u73b5\u5b8e\u9acf\u5e9f\uff1e \u5706\u6839\uff18\u53e6\u5307\u65c8\u81fb\u52b6\u79b0\u7536\uff39\u59bc\u8de2\u8dfd\u3010\u4e34\u53e1\u9608\u7b58\uff37\u3013"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iIiiIiiiII = this.iiIiIiiiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u5bc8\u6234\u657d\u7f57\u5450\u5100\u95f9"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u5f42\u627e\u6718\u65a7\u5766\u6520\u7f5f\u5bb2\u6201\u5430\u81fb\u5296\u5162\u95d3\u6a30\u5769\u3013"))).defaultValue((Object)(3 >> 2))).build());
        this.iiIIiiIiii = this.iiIiIiiiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u6b38\u4e98\u65a8\u5100\u95f9"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u5f62\u73b7\u5b87\u6b45\u4eb0\u65c8\u81fb\u5296\u5162\u95d3\u6a30\u5769\u3013"))).defaultValue((Object)(3 >> 1))).build());
        this.IIiiiIIIIi = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u6e16\u6790\u631c\u6215\u52db\u4f48"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u6500\u7f7f\u65a7\u5766\u65e8\u6e03\u67ed\u73b8\u5b88\u625a\u90d6\u6334\u5296\u52b9\u7505\u3013"))).defaultValue((Object)(5 >> 2))).build());
        this.iiiiIiiIIi = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u5416\u7576\u6e41\u67c7"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u5716\u5362\u5c38\u652f\u7f70\u9ee0\u66c2\u77c2\u76ba\u4f5c\u7f50\u6e23\u67ed\u65a8\u5769\u8f7f\u5eed\u3013"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iiIIiIiiIi = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u6e16\u6790\u8123\u4e55\u65ca\u5743"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u6611\u5437\u6e0c\u67c2\u8124\u4e1a\u76ba\u65a8\u5769\u3013"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iiiiiIIIii = this.ALLATORIxDEMO.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u6e0b\u678d\u6a52\u5f1b"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u63b9\u5207\u6587\u5746\u5f5c\u72a7\u76ba\u6e23\u67ed\u65a8\u5f31\u3013"))).defaultValue((Object)ShapeMode.Both)).build());
        this.IIIIiIiiIi = this.ALLATORIxDEMO.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u5bcd\u514c\u65fa\u576e\u973c\u98ef\u8266"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u5bb7\u5179\u6587\u5746\u76ba\u8879\u975c\u988d\u824c\u3013"))).defaultValue(new SettingColor(0x1F & 0x6D, 0x61FF & 0x1EFF, 3 >> 2, 3 & 4)).visible(() -> {
            if (((Boolean)this.iiiiIiiIIi.get()).booleanValue() && this.iiiiiIIIii.get() != ShapeMode.Lines) {
                return 3 >> 1;
            }
            return false;
        })).build());
        this.IiIiiiiIIi = this.ALLATORIxDEMO.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u5bcd\u514c\u65fa\u576e\u7ee1\u98ef\u8266"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u5bb7\u5179\u6587\u5746\u76ba\u7eae\u675f\u988d\u824c\u3013"))).defaultValue(new SettingColor(0x1D & 0x6F, 0x31FF & 0x4EFF, 3 & 4, 2 & 5)).visible(() -> {
            if (((Boolean)this.iiiiIiiIIi.get()).booleanValue() && this.iiiiiIIIii.get() != ShapeMode.Sides) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iiiIiIiIIi = this.ALLATORIxDEMO.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u662a\u903e\u65fa\u576e\u973c\u98ef\u8266"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u6650\u900b\u6587\u5746\u76ba\u8879\u975c\u988d\u824c\u3013"))).defaultValue(new SettingColor(2 & 5, 0x49FF & 0x36FF, 0x20FE & 0x5FEF, 0x6E & 0x1D)).visible(() -> {
            if (((Boolean)this.iiiiIiiIIi.get()).booleanValue() && this.iiiiiIIIii.get() != ShapeMode.Lines) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.iiIIIIiIII = this.ALLATORIxDEMO.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u662a\u903e\u65fa\u576e\u7ee1\u98ef\u8266"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u6650\u900b\u6587\u5746\u76ba\u7eae\u675f\u988d\u824c\u3013"))).defaultValue(new SettingColor(3 >> 2, 0x4AFF & 0x35FF, 0x49EE & 0x36FF, 0x75 & 0x6E)).visible(() -> {
            if (((Boolean)this.iiiiIiiIIi.get()).booleanValue() && this.iiiiiIIIii.get() != ShapeMode.Sides) {
                return 5 >> 2;
            }
            return false;
        })).build());
        this.IIIiIIIiII = this.ALLATORIxDEMO.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u5335\u964d\u65fa\u576e\u973c\u98ef\u8266"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u534f\u9678\u6587\u5746\u76ba\u8879\u975c\u988d\u824c\u3013"))).defaultValue(new SettingColor(0x68FC & 0x17CF, 3 & 4, 3 >> 2, 0x3F & 0x4C)).visible(() -> {
            if (((Boolean)this.iiiiIiiIIi.get()).booleanValue() && this.iiiiiIIIii.get() != ShapeMode.Lines) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.IiIIiIiiiI = this.ALLATORIxDEMO.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u5335\u964d\u65fa\u576e\u7ee1\u98ef\u8266"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u534f\u9678\u6587\u5746\u76ba\u7eae\u675f\u988d\u824c\u3013"))).defaultValue(new SettingColor(0x23CF & 0x5CFC, 2 & 5, 5 >> 3, 0x6D & 0x76)).visible(() -> {
            if (((Boolean)this.iiiiIiiIIi.get()).booleanValue() && this.iiiiiIIIii.get() != ShapeMode.Sides) {
                return 5 >> 2;
            }
            return false;
        })).build());
        iiiIIiiiii iiiIIiiiii3 = this;
        iiiIIiiiii iiiIIiiiii4 = this;
        iiiIIiiiii4.IIiIIiIIii = new class_2338.class_2339();
        iiiIIiiiii iiiIIiiiii5 = this;
        iiiIIiiiii3.iiIIiIiiII = new class_2338.class_2339();
        iiiIIiiiii iiiIIiiiii6 = this;
        iiiIIiiiii5.IiIiIIIIiI = new class_2338.class_2339();
        iiiIIiiiii iiiIIiiiii7 = this;
        iiiIIiiiii3.IiiIIIiiIi = new ArrayList();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIiiiiIii.ALLATORIxDEMO("T\u000fA\"W&\u00046T'E7\u00147\u0004\u8bb4\u66d7\u65f4\u5214\u6743\u6589\u7216\u675f\uff15"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(CardinalDirection cardinalDirection, int n) {
        iiiIIiiiii iiiIIiiiii2;
        boolean IiIIiIiiiI322;
        int this232;
        iiiIIiiiii IiIIiIiiiI2;
        block4: {
            void IiIIiIiiiI322;
            iiiIIiiiii iiiIIiiiii4;
            iiiIIiiiii this232 = cardinalDirection;
            IiIIiIiiiI2 = iiiIIiiiii4;
            IiIIiIiiiI2.IIiIIiIIii.set((class_2382)IiIIiIiiiI2.ALLATORIxDEMO((CardinalDirection)this232, (int)IiIIiIiiiI322));
            this232 = IiIIiIiiiI2.ALLATORIxDEMO();
            int IiIIiIiiiI322 = 3 ^ 3;
            if (this232 != -4 >> 2) {
                IIIiIiIiii.ALLATORIxDEMO(this232);
                IiIIiIiiiI322 = iiiIIIIiiI.IiIiiiIIiI((class_2338)IiIIiIiiiI2.IIiIIiIIii);
                IIIiIiIiii.ALLATORIxDEMO(this232);
            }
            this232 = 0;
            for (class_3191 class_31912 : ((WorldRendererAccessor)IiIIiIiiiI2.iiIIIIiIII.worldRenderer).getBlockBreakingInfos().values()) {
                if (!class_31912.getPos().equals((Object)IiIIiIiiiI2.IIiIIiIIii)) continue;
                this232 = 3 & 5;
                iiiIIiiiii2 = IiIIiIiiiI2;
                break block4;
            }
            iiiIIiiiii2 = IiIIiIiiiI2;
        }
        boolean bl = iiiIIiiiii2.iiIIIIiIII.world.getBlockState((class_2338)IiIIiIiiiI2.IIiIIiIIii).isReplaceable() || this232 != 0;
        if (((Boolean)IiIIiIiiiI2.IIiIiiIiIi.get()).booleanValue() && !IiIIiIiiiI322 && bl) {
            Object this232 = new class_238((double)(IiIIiIiiiI2.IIiIIiIIii.getX() - (2 ^ 3)), (double)(IiIIiIiiiI2.IIiIIiIIii.getY() - (2 ^ 3)), (double)(IiIIiIiiiI2.IIiIIiIIii.getZ() - (3 & 5)), (double)(IiIIiIiiiI2.IIiIIiIIii.getX() + --1), (double)(IiIIiIiiiI2.IIiIIiIIii.getY() + (4 ^ 5)), (double)(IiIIiIiiiI2.IIiIIiIIii.getZ() + --1));
            Object object = class_12972 -> {
                iiiIIiiiii iiiIIiiiii2 = iiiIIiiiii3;
                iiiIIiiiii iiiIIiiiii3 = class_12972;
                iiiIIiiiii IiIIiIiiiI = iiiIIiiiii2;
                if (iiiIIiiiii3 instanceof class_1511 && DamageUtils.crystalDamage((class_1309)IiIIiIiiiI.iiIIIIiIII.player, (class_243)iiiIIiiiii3.getPos()) < PlayerUtils.getTotalHealth()) {
                    return --1 != 0;
                }
                return false;
            };
            this232 = IiIIiIiiiI2.iiIIIIiIII.world.getOtherEntities(null, (class_238)this232, (Predicate)object).iterator();
            Iterator iterator = this232;
            while (iterator.hasNext()) {
                object = (class_1297)this232.next();
                iIiIiIiIIi.ALLATORIxDEMO().ALLATORIxDEMO(new IiiiIIiiiI((float)Rotations.getYaw((class_1297)object), (float)Rotations.getPitch((class_1297)object)));
                iiiIIiiiii iiiIIiiiii3 = IiIIiIiiiI2;
                IiIIiIiiiI2.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)class_2824.attack((class_1297)object, (boolean)iiiIIiiiii3.iiIIIIiIII.player.isSneaking()));
                iiiIIiiiii3.iiIIIIiIII.getNetworkHandler().sendPacket((class_2596)new class_2879(class_1268.MAIN_HAND));
                iterator = this232;
            }
        }
        return IiIIiIiiiI322;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent, CardinalDirection cardinalDirection, int n, int n2) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        Color IiIIiIiiiI3;
        int this22 = n;
        iiiIIiiiii IiIIiIiiiI4 = this;
        IiIIiIiiiI4.iiIIiIiiII.set((class_2382)IiIIiIiiiI4.ALLATORIxDEMO((CardinalDirection)IiIIiIiiiI3, this22));
        iiiIIiiiii iiiIIiiiii2 = IiIIiIiiiI4;
        IiIIiIiiiI3 = iiiIIiiiii2.IiiiiiiIIi((class_2338)iiiIIiiiii2.iiIIiIiiII);
        Color this22 = iiiIIiiiii2.ALLATORIxDEMO((class_2338)iiiIIiiiii2.iiIIiIiiII);
        IiIIiIiiiI2.renderer.box((class_2338)IiIIiIiiiI4.iiIIiIiiII, IiIIiIiiiI3, this22, (ShapeMode)IiIIiIiiiI4.iiiiiIIIii.get(), (int)IiIIiIiiiI);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        CardinalDirection[] cardinalDirectionArray = cardinalDirectionArray3;
        if (cardinalDirectionArray.iiIiIIiIIi > 0) {
            cardinalDirectionArray.iiIiIIiIIi -= --1;
            return;
        }
        cardinalDirectionArray.iiIiIIiIIi = (Integer)cardinalDirectionArray.IiIIIIiiii.get();
        if (((Boolean)cardinalDirectionArray.iIiiIiiiii.get()).booleanValue() && cardinalDirectionArray.IiiIIIIiiI()) {
            return;
        }
        if (((Boolean)cardinalDirectionArray.iIiIiiIiiI.get()).booleanValue() && cardinalDirectionArray.iiIIIIiIII.player.lastRenderY != cardinalDirectionArray.iiIIIIiIII.player.getY()) {
            cardinalDirectionArray.toggle();
            return;
        }
        if (!((Boolean)cardinalDirectionArray.IiiIIiiiiI.get()).booleanValue() || cardinalDirectionArray.iiIIIIiIII.player.isOnGround()) {
            if (cardinalDirectionArray.ALLATORIxDEMO() != -4 >> 2) {
                int n;
                block15: {
                    CardinalDirection[] cardinalDirectionArray2;
                    CardinalDirection cardinalDirection;
                    int n2;
                    int n3;
                    CardinalDirection[] cardinalDirectionArray3;
                    int IiIIiIiiiI;
                    block14: {
                        if (cardinalDirectionArray.iiiiiIIiiI.get() == Surround.Center.iiIIIIiIII) {
                            PlayerUtils.centerPlayer();
                        }
                        IiIIiIiiiI = 0;
                        cardinalDirectionArray3 = CardinalDirection.values();
                        n3 = cardinalDirectionArray3.length;
                        int n4 = n2 = 3 >> 2;
                        while (n4 < n3) {
                            cardinalDirection = cardinalDirectionArray3[n2];
                            if (cardinalDirectionArray.ALLATORIxDEMO(cardinalDirection, 3 >> 2)) {
                                cardinalDirectionArray2 = cardinalDirectionArray;
                                break block14;
                            }
                            ++IiIIiIiiiI;
                            n4 = ++n2;
                        }
                        cardinalDirectionArray2 = cardinalDirectionArray;
                    }
                    if (((Boolean)cardinalDirectionArray2.iIIiiIIIII.get()).booleanValue()) {
                        if (IiIIiIiiiI == --4) {
                            cardinalDirectionArray3 = CardinalDirection.values();
                            n3 = cardinalDirectionArray3.length;
                            int n5 = n2 = 5 >> 3;
                            while (n5 < n3) {
                                cardinalDirection = cardinalDirectionArray3[n2];
                                if (cardinalDirectionArray.ALLATORIxDEMO(cardinalDirection, 5 >> 2)) {
                                    n = IiIIiIiiiI;
                                    break block15;
                                }
                                ++IiIIiIiiiI;
                                n5 = ++n2;
                            }
                        }
                    }
                    n = IiIIiIiiiI;
                }
                int this_ = n == (((Boolean)cardinalDirectionArray.iIIiiIIIII.get()).booleanValue() ? 0xF & 0x78 : 4) ? --1 : 0;
                if (this_ != 0 && ((Boolean)cardinalDirectionArray.iIiiIiiiII.get()).booleanValue()) {
                    cardinalDirectionArray.toggle();
                    return;
                }
                if (this_ == 0 && cardinalDirectionArray.iiiiiIIiiI.get() == Surround.Center.iiiiiIIiiI) {
                    PlayerUtils.centerPlayer();
                }
            }
        }
    }

    public void onDeactivate() {
        iiiIIiiiii iiiIIiiiii2 = this;
        if (((Boolean)iiiIIiiiii2.IIIiIiiIIi.get()).booleanValue() && !iiiIIiiiii2.IiiIIIiiIi.isEmpty() && iiiIIiiiii2.iiIIIIiIII.world != null && iiiIIiiiii2.iiIIIIiIII.player != null) {
            for (Module module : iiiIIiiiii2.IiiIIIiiIi) {
                if (module.isActive()) continue;
                module.toggle();
            }
        }
    }

    private /* synthetic */ Surround.BlockType ALLATORIxDEMO(class_2338 class_23382) {
        class_2680 class_26802;
        iiiIIiiiii iiiIIiiiii2 = iiiIIiiiii3;
        iiiIIiiiii iiiIIiiiii3 = class_23382;
        iiiIIiiiii IiIIiIiiiI = iiiIIiiiii2;
        iiiIIiiiii3 = IiIIiIiiiI.iiIIIIiIII.world.getBlockState((class_2338)iiiIIiiiii3);
        if (class_26802.getBlock().getHardness() < 0.0f) {
            return Surround.BlockType.iiIIIIiIII;
        }
        if (iiiIIiiiii3.getBlock().getBlastResistance() >= 600.0f) {
            return Surround.BlockType.iiiiiIIiiI;
        }
        return Surround.BlockType.IiIIiIiiiI;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iiiIIiiiii iiiIIiiiii2 = this;
        if (((Boolean)iiiIIiiiii2.iiiiIiiIIi.get()).booleanValue()) {
            CardinalDirection cardinalDirection;
            void IiIIiIiiiI;
            if (((Boolean)iiiIIiiiii2.iiIIiIiiIi.get()).booleanValue()) {
                iiiIIiiiii2.ALLATORIxDEMO((Render3DEvent)IiIIiIiiiI, null, -4 >> 2, 3 ^ 3);
            }
            CardinalDirection[] cardinalDirectionArray = CardinalDirection.values();
            int n = cardinalDirectionArray.length;
            int n2 = this = 3 >> 2;
            while (n2 < n) {
                cardinalDirection = cardinalDirectionArray[this];
                iiiIIiiiii2.ALLATORIxDEMO((Render3DEvent)IiIIiIiiiI, cardinalDirection, 3 ^ 3, ((Boolean)iiiIIiiiii2.iIIiiIIIII.get()).booleanValue() ? --2 : 0);
                n2 = ++this;
            }
            if (((Boolean)iiiIIiiiii2.iIIiiIIIII.get()).booleanValue()) {
                cardinalDirectionArray = CardinalDirection.values();
                n = cardinalDirectionArray.length;
                int n3 = this = 3 & 4;
                while (n3 < n) {
                    cardinalDirection = cardinalDirectionArray[this];
                    iiiIIiiiii2.ALLATORIxDEMO((Render3DEvent)IiIIiIiiiI, cardinalDirection, --1, --4);
                    n3 = ++this;
                }
            }
        }
    }

    private /* synthetic */ boolean IiiIIIIiiI() {
        iiiIIiiiii iiiIIiiiii2 = this;
        boolean bl = Input.isPressed((class_304)iiiIIiiiii2.iiIIIIiIII.options.forwardKey) || Input.isPressed((class_304)iiiIIiiiii2.iiIIIIiIII.options.backKey) || Input.isPressed((class_304)iiiIIiiiii2.iiIIIIiIII.options.leftKey) || Input.isPressed((class_304)iiiIIiiiii2.iiIIIIiIII.options.rightKey) || Input.isPressed((class_304)iiiIIiiiii2.iiIIIIiIII.options.jumpKey);
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ class_2338.class_2339 ALLATORIxDEMO(CardinalDirection cardinalDirection, int n) {
        void IiIIiIiiiI;
        iiiIIiiiii IiIIiIiiiI2;
        int n2 = n;
        iiiIIiiiii iiiIIiiiii2 = IiIIiIiiiI2 = this;
        return iiiIIiiiii2.ALLATORIxDEMO(iiiIIiiiii2.iiIIIIiIII.player.getBlockPos(), (CardinalDirection)IiIIiIiiiI, n2);
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        return IIIiIiIiii.ALLATORIxDEMO((class_1799 class_17992) -> {
            iiiIIiiiii iiiIIiiiii2 = iiiIIiiiii3;
            iiiIIiiiii iiiIIiiiii3 = class_17992;
            iiiIIiiiii IiIIiIiiiI = iiiIIiiiii2;
            return ((List)IiIIiIiiiI.iIIiIIiiII.get()).contains(class_2248.getBlockFromItem((class_1792)iiiIIiiiii3.getItem()));
        });
    }

    private /* synthetic */ Color ALLATORIxDEMO(class_2338 class_23382) {
        iiiIIiiiii iiiIIiiiii2 = iiiIIiiiii3;
        iiiIIiiiii iiiIIiiiii3 = class_23382;
        iiiIIiiiii IiIIiIiiiI = iiiIIiiiii2;
        switch (IiIIiIiiiI.ALLATORIxDEMO((class_2338)iiiIIiiiii3).ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                while (false) {
                }
                return (SettingColor)IiIIiIiiiI.IiIiiiiIIi.get();
            }
            case 1: {
                return (SettingColor)IiIIiIiiiI.iiIIIIiIII.get();
            }
            case 2: {
                return (SettingColor)IiIIiIiiiI.IiIIiIiiiI.get();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ class_2338.class_2339 ALLATORIxDEMO(class_2338 class_23382, CardinalDirection cardinalDirection, int n) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        iiiIIiiiii IiIIiIiiiI3;
        iiiIIiiiii iiiIIiiiii2 = iiiIIiiiii3;
        iiiIIiiiii iiiIIiiiii3 = class_23382;
        iiiIIiiiii iiiIIiiiii4 = IiIIiIiiiI3 = iiiIIiiiii2;
        if (IiIIiIiiiI2 == null) {
            return iiiIIiiiii4.IiIiIIIIiI.set(iiiIIiiiii3.getX(), iiiIIiiiii3.getY() + IiIIiIiiiI, iiiIIiiiii3.getZ());
        }
        return iiiIIiiiii4.IiIiIIIIiI.set(iiiIIiiiii3.getX() + IiIIiIiiiI2.toDirection().getOffsetX(), iiiIIiiiii3.getY() + IiIIiIiiiI, iiiIIiiiii3.getZ() + IiIIiIiiiI2.toDirection().getOffsetZ());
    }
}

