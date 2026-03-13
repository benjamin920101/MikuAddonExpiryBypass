/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.renderer.Renderer3D
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BlockListSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.entity.EntityUtils
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.BlockBox
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IIIiiiiiII;
import com.github.mikumiku.addon.IiIIIIIIiI;
import com.github.mikumiku.addon.IiIIiIIIIi;
import com.github.mikumiku.addon.IiiiIIiiiI;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIiIiIiIIi;
import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.SelfTrapPlusPlus;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.renderer.Renderer3D;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BlockListSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.entity.EntityUtils;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.BlockBox;

public class IIIIiIiIiI
extends iiiiIiIiii {
    private class_2338 IiIiiiiIIi;
    private final Setting<Boolean> iiIIiIiiII;
    private final SettingGroup IIiIiiIiIi;
    private final Setting<List<class_2248>> IIiIIiIIii;
    private final SettingGroup iIiiIiiiii;
    private boolean iIiIiiIiiI;
    private int IIiiiiiiII;
    private final Setting<Integer> IIiiiIIIIi;
    private final Setting<Boolean> IIIiIIIiII;
    private final Setting<Boolean> iiIiIiiiiI;
    private final Setting<SelfTrapPlusPlus.SwitchMode> IIiiIiiiII;
    private final Setting<ShapeMode> IIIiIiiIIi;
    private final Setting<Boolean> iiiIiIiIIi;
    private final Setting<SettingColor> iIiIiIiIii;
    private final Setting<SettingColor> iiiiiIIIii;
    public static boolean iIIiIIiiII = 3 & 4;
    private final Setting<Boolean> IiiIIiiiiI;
    private final Setting<SettingColor> IiIIIIiiii;
    private final Map<class_2338, IiIIiIIIIi> IiiIIIiiIi;
    private final Setting<SettingColor> iiIIiiIiii;
    private final IiIIiIIIIi iIiiIiiiII;
    private final Setting<Double> iIIiiIIIII;
    private final List<IiIIIIIIiI> iiIiIIiIIi;
    private final Setting<SelfTrapPlusPlus.ToggleYMode> IIIIiIiiIi;
    private final SettingGroup IiIiIIIIiI;
    private final Setting<Double> iiiiiIIiiI;
    private final Map<class_2338, IiIIiIIIIi> iiIIIIiIII;
    private final SettingGroup IiIIiIiiiI;
    private final Setting<SelfTrapPlusPlus.TrapMode> ALLATORIxDEMO;

    private /* synthetic */ class_1268 ALLATORIxDEMO() {
        IIIIiIiIiI iIIIiIiIiI;
        IIIIiIiIiI iIIIiIiIiI2 = iIIIiIiIiI = iIIIiIiIiI3;
        class_1799 class_17992 = ((class_310)iIIIiIiIiI2.iiIIIIiIII).player.getMainHandStack();
        IIIIiIiIiI iIIIiIiIiI3 = ((class_310)iIIIiIiIiI2.iiIIIIiIII).player.getOffHandStack();
        if (iIIIiIiIiI2.ALLATORIxDEMO(class_17992)) {
            return class_1268.MAIN_HAND;
        }
        if (iIIIiIiIiI.ALLATORIxDEMO((class_1799)iIIIiIiIiI3)) {
            return class_1268.OFF_HAND;
        }
        return null;
    }

    private /* synthetic */ boolean IiiIIIIiiI() {
        if (this.ALLATORIxDEMO.get() == SelfTrapPlusPlus.TrapMode.IiIIiIiiiI || this.ALLATORIxDEMO.get() == SelfTrapPlusPlus.TrapMode.ALLATORIxDEMO) {
            return true;
        }
        return false;
    }

    private /* synthetic */ FindItemResult IiiiiiiIIi() {
        return InvUtils.findInHotbar(class_17992 -> {
            IIIIiIiIiI iIIIiIiIiI = iIIIiIiIiI2;
            IIIIiIiIiI iIIIiIiIiI2 = class_17992;
            IIIIiIiIiI IiIIiIiiiI = iIIIiIiIiI;
            if (iIIIiIiIiI2.getItem() instanceof class_1747 && ((List)IiIIiIiiiI.IIiIIiIIii.get()).contains(((class_1747)iIIIiIiIiI2.getItem()).getBlock())) {
                return (3 & 5) != 0;
            }
            return false;
        });
    }

    public void onDeactivate() {
        IIIIiIiIiI iIIIiIiIiI = this;
        super.onDeactivate();
        iIIIiIiIiI.IIiiiiiiII = (Integer)iIIIiIiIiI.IIiiiIIIIi.get();
        this.iIiiIiiiII.ALLATORIxDEMO();
        IIIIiIiIiI iIIIiIiIiI2 = this;
        iIIIiIiIiI2.iiIIIIiIII.clear();
        iIIIiIiIiI2.IiiIIIiiIi.clear();
        iIiIiIiIIi.ALLATORIxDEMO().ALLATORIxDEMO();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ List<class_2338> ALLATORIxDEMO(List<class_2338> list) {
        void IiIIiIiiiI;
        IIIIiIiIiI iIIIiIiIiI = arrayList;
        ArrayList arrayList = new ArrayList();
        if (IiIIiIiiiI.isEmpty()) {
            return arrayList;
        }
        IiIIiIiiiI.forEach(class_23382 -> {
            int n;
            void IiIIiIiiiI2;
            IIIIiIiIiI iIIIiIiIiI = iIIIiIiIiI2;
            IIIIiIiIiI iIIIiIiIiI2 = class_23382;
            IIIIiIiIiI IiIIiIiiiI3 = iIIIiIiIiI;
            if (!((class_310)IiIIiIiiiI3.iiIIIIiIII).world.getBlockState((class_2338)iIIIiIiIiI2).isAir()) {
                return;
            }
            if (iiiIIIIiiI.IiiiiiiIIi((class_2338)iIIIiIiIiI2, (3 & 5) != 0) && IiIIiIiiiI3.IiiiiiiIIi((class_2338)iIIIiIiIiI2)) {
                IiIIiIiiiI3.iiIiIIiIIi.add(new IiIIIIIIiI((class_2338)iIIIiIiIiI2, (3 & 4) != 0));
                if (!EntityUtils.intersectsWithEntity((class_238)class_238.from((class_3341)new class_3341((class_2338)iIIIiIiIiI2)), IiIIiIiiiI -> {
                    if (!IiIIiIiiiI.isSpectator() && !(IiIIiIiiiI instanceof class_1542)) {
                        return --1 != 0;
                    }
                    return false;
                }) && !IiIIiIiiiI3.iiIIIIiIII.containsKey(iIIIiIiIiI2)) {
                    IiIIiIiiiI2.add(iIIIiIiIiI2);
                }
                return;
            }
            class_2350[] class_2350Array = IiIIiIiiiI3.ALLATORIxDEMO((class_2338)iIIIiIiIiI2);
            if (class_2350Array != null) {
                IiIIiIiiiI3.iiIiIIiIIi.add(new IiIIIIIIiI((class_2338)iIIIiIiIiI2, 3 >> 2));
                IiIIiIiiiI3.iiIiIIiIIi.add(new IiIIIIIIiI(iIIIiIiIiI2.offset((class_2350)class_2350Array), (3 & 5) != 0));
                if (!EntityUtils.intersectsWithEntity((class_238)class_238.from((class_3341)new class_3341(iIIIiIiIiI2.offset((class_2350)class_2350Array))), IiIIiIiiiI -> {
                    if (!IiIIiIiiiI.isSpectator() && !(IiIIiIiiiI instanceof class_1542)) {
                        return (4 ^ 5) != 0;
                    }
                    return false;
                }) && !IiIIiIiiiI3.iiIIIIiIII.containsKey(iIIIiIiIiI2.offset((class_2350)class_2350Array))) {
                    IiIIiIiiiI2.add(iIIIiIiIiI2.offset((class_2350)class_2350Array));
                }
                return;
            }
            class_2350Array = class_2350.values();
            int n2 = class_2350Array.length;
            int n3 = n = 2 & 5;
            while (n3 < n2) {
                class_2350 class_23502;
                class_2350 class_23503 = class_2350Array[n];
                if (((class_310)IiIIiIiiiI3.iiIIIIiIII).world.getBlockState(iIIIiIiIiI2.offset(class_23503)).isAir() && IiIIiIiiiI3.IiiiiiiIIi(iIIIiIiIiI2.offset(class_23503)) && (class_23502 = IiIIiIiiiI3.ALLATORIxDEMO(iIIIiIiIiI2.offset(class_23503))) != null) {
                    IiIIiIiiiI3.iiIiIIiIIi.add(new IiIIIIIIiI((class_2338)iIIIiIiIiI2, 5 >> 3));
                    IiIIiIiiiI3.iiIiIIiIIi.add(new IiIIIIIIiI(iIIIiIiIiI2.offset(class_23503), 3 >> 1));
                    IiIIiIiiiI3.iiIiIIiIIi.add(new IiIIIIIIiI(iIIIiIiIiI2.offset(class_23503).offset(class_23502), 5 >> 2));
                    if (!EntityUtils.intersectsWithEntity((class_238)class_238.from((class_3341)new class_3341(iIIIiIiIiI2.offset(class_23503).offset(class_23502))), IiIIiIiiiI -> {
                        if (!IiIIiIiiiI.isSpectator() && !(IiIIiIiiiI instanceof class_1542)) {
                            return --1 != 0;
                        }
                        return false;
                    }) && !IiIIiIiiiI3.iiIIIIiIII.containsKey(iIIIiIiIiI2.offset(class_23503).offset(class_23502))) {
                        IiIIiIiiiI2.add(iIIIiIiIiI2.offset(class_23503).offset(class_23502));
                    }
                    return;
                }
                n3 = ++n;
            }
        });
        return arrayList;
    }

    private /* synthetic */ boolean IiiiiiiIIi(class_2338 class_23382) {
        IIIIiIiIiI iIIIiIiIiI = iIIIiIiIiI2;
        IIIIiIiIiI iIIIiIiIiI2 = class_23382;
        IIIIiIiIiI IiIIiIiiiI = iIIIiIiIiI;
        if (!iiiIIIIiiI.IiiiiiiIIi((class_2338)iIIIiIiIiI2, 3 >> 1)) {
            return 3 >> 2;
        }
        if (((class_310)IiIIiIiiiI.iiIIIIiIII).player.getEyePos().distanceTo(iIIIiIiIiI2.toCenterPos()) <= 6.0) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    @Override
    public void onActivate() {
        IIIIiIiIiI iIIIiIiIiI = this;
        super.onActivate();
        if (((class_310)iIIIiIiIiI.iiIIIIiIII).player == null || ((class_310)this.iiIIIIiIII).world == null) {
            this.toggle();
            return;
        }
        IIIIiIiIiI iIIIiIiIiI2 = this;
        iIIIiIiIiI2.IiIiiiiIIi = ((class_310)iIIIiIiIiI2.iiIIIIiIII).player.getBlockPos();
        iIIIiIiIiI2.IIiiiiiiII = (Integer)iIIIiIiIiI2.IIiiiIIIIi.get();
        this.iIiiIiiiII.ALLATORIxDEMO();
    }

    private /* synthetic */ boolean IiiiiiiIIi() {
        if (this.ALLATORIxDEMO.get() == SelfTrapPlusPlus.TrapMode.IiIIiIiiiI || this.ALLATORIxDEMO.get() == SelfTrapPlusPlus.TrapMode.iiiiiIIiiI) {
            return true;
        }
        return false;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        this.iiIIIIiIII.entrySet().removeIf(entry -> {
            IIIIiIiIiI iIIIiIiIiI = entry2;
            Map.Entry entry2 = entry;
            IIIIiIiIiI IiIIiIiiiI = iIIIiIiIiI;
            return ((IiIIiIIIIi)entry2.getValue()).IiiiiiiIIi((Double)IiIIiIiiiI.iIIiiIIIII.get() * 1000.0);
        });
        this.IiiIIIiiIi.entrySet().removeIf(IiIIiIiiiI -> ((IiIIiIIIIi)IiIIiIiiiI.getValue()).IiiiiiiIIi(1000L));
    }

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

