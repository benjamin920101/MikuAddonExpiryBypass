/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.friends.Friends
 *  meteordevelopment.meteorclient.utils.entity.EntityUtils
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.state.property.Properties
 *  net.minecraft.state.property.Property
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiIiiIiiIi;
import com.github.mikumiku.addon.IiiIIiIIIi;
import com.github.mikumiku.addon.iIIIiiiiII;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.mixinface.MoveEvent;
import com.github.mikumiku.addon.modules.AnchorAuraPlus;
import com.github.mikumiku.addon.util.BaritoneUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.utils.entity.EntityUtils;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;

public class IiIIIiIiII
extends iiiiIiIiii {
    private long IiIiiiiIIi;
    public final Setting<ShapeMode> iiIIiIiiII;
    private final Setting<Double> IIiIiiIiIi;
    private final Setting<Double> IIiIIiIIii;
    private double iIiiIiiiii;
    public final Setting<SettingColor> iIiIiiIiiI;
    private final Setting<Double> IIiiiiiiII;
    private class_2338 IIiiiIIIIi;
    private int IIIiIIIiII;
    private long iiIiIiiiiI;
    private final Setting<Boolean> IIiiIiiiII;
    private final Map<class_2338, IiiIIiIIIi> IIIiIiiIIi;
    private final SettingGroup iiiIiIiIIi;
    private class_2338 iIiIiIiIii;
    private final SettingGroup iiiiiIIIii;
    private class_2338 iIIiIIiiII;
    private int IiiIIiiiiI;
    private final Setting<SettingColor> IiIIIIiiii;
    private final Setting<Double> IiiIIIiiIi;
    private final Setting<Boolean> iiIIiiIiii;
    private final Setting<AnchorAuraPlus.LogicMode> iIiiIiiiII;
    private final SettingGroup iIIiiIIIII;
    private final Setting<AnchorAuraPlus.SwitchMode> iiIiIIiIIi;
    private final Setting<Boolean> IIIIiIiiIi;
    private class_2338[] IiIiIIIIiI;
    public double iiiiiIIiiI;
    private final Setting<Double> iiIIIIiIII;
    private class_2338 IiIIiIiiiI;
    private List<class_1657> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, class_2350 class_23502, class_1268 class_12682) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IiIIIiIiII iiIIIiIiII2 = iiIIIiIiII3;
        IiIIIiIiII iiIIIiIiII3 = class_12682;
        IiIIIiIiII IiIIiIiiiI3 = iiIIIiIiII2;
        iiiIIIIiiI.ALLATORIxDEMO((class_2338)IiIIiIiiiI2, (class_2350)IiIIiIiiiI, 3 >> 1, (class_1268)iiIIIiIiII3, BaritoneUtil.SwingSide.iiIIIIiIII);
    }

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

