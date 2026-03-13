/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.StartBreakingBlockEvent
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Send
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ShovelItem
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIIIIIIi;
import com.github.mikumiku.addon.IiiiIIiiiI;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiIiiiiIii;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.GhostMine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.events.entity.player.StartBreakingBlockEvent;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.client.MinecraftClient;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIIIIIiiI
extends iiiiIiIiii {
    public Setting<Integer> IIiiiIIIIi;
    private final Setting<SettingColor> IIIiIIIiII;
    private final Setting<Boolean> iiIiIiiiiI;
    private final Setting<SettingColor> IIiiIiiiII;
    public Setting<Integer> IIIiIiiIIi;
    public Setting<Boolean> iiiIiIiIIi;
    private int iIiIiIiIii;
    public static final List<class_2248> iiiiiIIIii;
    public static IiIIIIIIIi iIIiIIiiII;
    public Setting<Boolean> IiiIIiiiiI;
    private final SettingGroup IiIIIIiiii;
    public static iiIIIIIiiI IiiIIIiiIi;
    public Setting<Double> iiIIiiIiii;
    public static IiIIIIIIIi iIiiIiiiII;
    public Setting<GhostMine.SwapMode> iIIiiIIIII;
    private final SettingGroup iiIiIIiIIi;
    private final List<IiIIIIIIIi> IIIIiIiiIi;
    private IiIIIIIIIi IiIiIIIIiI;
    public static IiIIIIIIIi iiiiiIIiiI;
    private final Setting<ShapeMode> iiIIIIiIII;
    private final Setting<SettingColor> IiIIiIiiiI;
    private final Setting<SettingColor> ALLATORIxDEMO;

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

