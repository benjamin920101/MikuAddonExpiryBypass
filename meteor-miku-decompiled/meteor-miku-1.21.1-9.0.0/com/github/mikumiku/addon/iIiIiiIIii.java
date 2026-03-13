/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StorageBlockListSetting$Builder
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.block.ChestBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.entity.BlockEntity
 *  net.minecraft.block.entity.BlockEntityType
 *  net.minecraft.block.enums.ChestType
 *  net.minecraft.state.property.Property
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiiiiIII;
import com.github.mikumiku.addon.IiiiIIiiiI;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.iiiiiiiIii;
import com.github.mikumiku.addon.modules.ChestAura;
import com.github.mikumiku.addon.util.BaritoneUtil;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StorageBlockListSetting;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.block.ChestBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.enums.ChestType;
import net.minecraft.state.property.Property;

public class iIiIiiIIii
extends iiiiIiIiii {
    private final Setting<Integer> iiIIiiIiii;
    private final SettingGroup iIiiIiiiII;
    private final Setting<Double> iIIiiIIIII;
    private int iiIiIIiIIi;
    private final iiiiiiiIii IIIIiIiiIi;
    private final Setting<Integer> IiIiIIIIiI;
    private final Setting<ChestAura.CloseCondition> iiiiiIIiiI;
    private final Map<class_2338, Integer> iiIIIIiIII;
    private final Setting<Boolean> IiIIiIiiiI;
    private final Setting<List<class_2591<?>>> ALLATORIxDEMO;

    public iIiIiiIIii() {
        iIiIiiIIii iIiIiiIIii2 = this;
        super(IiiiIIiiiI.ALLATORIxDEMO("\u7fd1\u7bc4\u5038\u67a9"), IiiiIIiiiI.ALLATORIxDEMO("\u81c0\u52dd\u5f2a\u7bc4"));
        iIiIiiIIii2.iIiiIiiiII = iIiIiiIIii2.settings.getDefaultGroup();
        iIiIiiIIii2.iIIiiIIIII = iIiIiiIIii2.iIiiIiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u8329\u5681"))).description(IiiiIIiiiI.ALLATORIxDEMO("\u4e8e\u4ee7\u8329\u5681"))).defaultValue(4.0).min(0.0).build());
        class_2591[] class_2591Array = new class_2591[5 >> 1];
        class_2591Array[3 & 4] = class_2591.CHEST;
        class_2591Array[--1] = class_2591.SHULKER_BOX;
        this.ALLATORIxDEMO = this.iIiiIiiiII.add((Setting)((StorageBlockListSetting.Builder)((StorageBlockListSetting.Builder)new StorageBlockListSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u6593\u5722\u7c51\u57fe"))).description(IiiiIIiiiI.ALLATORIxDEMO("\u898b\u6206\u5f0a\u76d1\u6593\u5722\u7c51\u57fe"))).defaultValue(class_2591Array).build());
        this.IiIiIIIIiI = this.iIiiIiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u5edc\u8faa"))).description(IiiiIIiiiI.ALLATORIxDEMO("\u6226\u5f0a\u7be4\u5b5a\u4e1e\u95de\u76f1\u5edc\u8faa"))).defaultValue((Object)(--5))).sliderMax(0x2A & 0x7D).build());
        this.iiIIiiIiii = this.iIiiIiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u907d\u5fad\u65dc\u9581"))).description(IiiiIIiiiI.ALLATORIxDEMO("\u7b3a\u5fa8\u5968\u5c7cFC\u0016a\u545b\u907d\u5fad\u5df8\u6206\u5f2a\u76f1\u7b9b\u5b25\u3008e\u8862\u796f\u6c12\u4e78\u907d\u5fad"))).defaultValue((Object)(5 >> 3))).min(5 >> 3).sliderMax(0xE1F & 0x7FF0).build());
        this.iiiiiIIiiI = this.iIiiIiiiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u5159\u9598\u674b\u4e83"))).defaultValue((Object)ChestAura.CloseCondition.ALLATORIxDEMO)).description(IiiiIIiiiI.ALLATORIxDEMO("\u4f5f\u65a3\u5179\u95b8\u7b9b\u5b25\u7566\u9717"))).build());
        this.IiIIiIiiiI = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiiIIiiiI.ALLATORIxDEMO("\u5142\u909d\u4e08\u518f"))).description(IiiiIIiiiI.ALLATORIxDEMO("\u6259\u5f55\u7b9b\u5b25\u5424\u6595\u5efc\u8f8a\u4e28\u51af\u5142\u909d\u7243\u54b4"))).defaultValue((Object)((3 & 4) != 0))).build());
        iIiIiiIIii iIiIiiIIii3 = this;
        iIiIiiIIii iIiIiiIIii4 = this;
        iIiIiiIIii3.iiIIIIiIII = new HashMap<class_2338, Integer>();
        iIiIiiIIii iIiIiiIIii5 = this;
        iIiIiiIIii3.IIIIiIiiIi = new iiiiiiiIii(this);
        iIiIiiIIii3.iiIiIIiIIi = 3 & 4;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiiIIiiiI.ALLATORIxDEMO("}\u001e\bSY\u0010* Z\u0011k!OT\n\u8b82\u66fe\u65e5\u523a\u6755\u659a\u723d\u6706\uff74"));
        }
    }

    @Override
    public void onActivate() {
        this.iiIiIIiIIi = 3 & 4;
        this.iiIIIIiIII.clear();
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

