/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Streams
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BlockListSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.render.RenderUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.world.BlockView
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.block.FallingBlock
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.block.BlockState
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiiiIIiiIi;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIIiiIIiii;
import com.github.mikumiku.addon.iiIiiIIIiI;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.MEnum;
import com.google.common.collect.Streams;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BlockListSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.render.RenderUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.BlockView;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.FallingBlock;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.block.BlockState;

public class IiIiiiIIiI
extends iiiiIiIiii {
    private final Setting<ShapeMode> IIIiIiiIIi;
    private final Setting<Double> iiiIiIiIIi;
    private final SettingGroup iIiIiIiIii;
    private final Setting<Double> iiiiiIIIii;
    private final Setting<Boolean> iIIiIIiiII;
    private final Setting<SettingColor> IiiIIiiiiI;
    private final Setting<Boolean> IiIIIIiiii;
    private final class_2338.class_2339 IiiIIIiiIi;
    private final Setting<MEnum.ListMode> iiIIiiIiii;
    private final Setting<Integer> iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private final iiIiiIIIiI iiIiIIiIIi;
    private final Setting<List<class_2248>> IIIIiIiiIi;
    private final Setting<Double> IiIiIIIIiI;
    private final Setting<Boolean> iiiiiIIiiI;
    private final Setting<SettingColor> iiIIIIiIII;
    private final Setting<Double> IiIIiIiiiI;
    private final SettingGroup ALLATORIxDEMO;

    public void onDeactivate() {
        this.iiIiIIiIIi.iIIiiiIiiI();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382, class_1799 class_17992) {
        void IiIIiIiiiI;
        IiIiiiIIiI iiIiiiIIiI = iiIiiiIIiI2;
        IiIiiiIIiI iiIiiiIIiI2 = class_17992;
        IiIiiiIIiI IiIIiIiiiI2 = iiIiiiIIiI;
        return IiIIiIiiiI2.ALLATORIxDEMO((class_1799)iiIiiiIIiI2, (class_2338)IiIIiIiiiI);
    }

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

