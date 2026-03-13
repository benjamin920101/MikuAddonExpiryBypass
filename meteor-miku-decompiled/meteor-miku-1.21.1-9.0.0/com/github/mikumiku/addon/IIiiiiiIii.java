/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.utils.BetterBlockPos
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.pathing.NopPathManager
 *  meteordevelopment.meteorclient.pathing.PathManagers
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.ItemSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.client.gui.screen.ingame.HandledScreen
 *  net.minecraft.component.type.ContainerComponent
 *  net.minecraft.component.DataComponentTypes
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.utils.BetterBlockPos;
import com.github.mikumiku.addon.IIIIiiiIIi;
import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiIiIIiIII;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.ShulkerBoxItemFetcher;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.pathing.NopPathManager;
import meteordevelopment.meteorclient.pathing.PathManagers;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.ItemSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.component.DataComponentTypes;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiiiiiIii
extends iiiiIiIiii {
    public int IIIiIIIiII;
    public final Setting<Boolean> iiIiIiiiiI;
    private final SettingGroup IIiiIiiiII;
    public final Setting<Boolean> IIIiIiiIIi;
    public boolean iiiIiIiIIi;
    public class_2338 iIiIiIiIii;
    public final Setting<Integer> iiiiiIIIii;
    public int iIIiIIiiII;
    public final Setting<Boolean> IiiIIiiiiI;
    public final Setting<Boolean> IiIIIIiiii;
    public final Setting<class_1792> IiiIIIiiIi;
    public int iiIIiiIiii;
    public final Setting<Integer> iIiiIiiiII;
    public final Setting<Boolean> iIIiiIIIII;
    public int iiIiIIiIIi;
    private final SettingGroup IIIIiIiiIi;
    public ShulkerBoxItemFetcher.State IiIiIIIIiI;
    public boolean iiiiiIIiiI;
    public class_1799 iiIIIIiIII;
    public static final int IiIIiIiiiI = 100;
    public IBaritone iiiiiIIiiI;
    public final Setting<Boolean> ALLATORIxDEMO;

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        IIiiiiiIii iIiiiiiIii = iIiiiiiIii2;
        IIiiiiiIii iIiiiiiIii2 = class_23382;
        IIiiiiiIii IiIIiIiiiI = iIiiiiiIii;
        if (IiIIiIiiiI.iiIIIIiIII.world.getBlockState((class_2338)iIiiiiiIii2).isAir() && BlockUtils.canPlace((class_2338)iIiiiiiIii2) && !IiIIiIiiiI.iiIIIIiIII.world.getBlockState(iIiiiiiIii2.down()).isAir()) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IIiiiiiIii iIiiiiiIii = iIiiiiiIii2;
        IIiiiiiIii iIiiiiiIii2 = pre;
        IIiiiiiIii IiIIiIiiiI = iIiiiiiIii;
        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) {
            return;
        }
        IIiiiiiIii iIiiiiiIii3 = IiIIiIiiiI;
        iIiiiiiIii3.iiIIiiIiii += --1;
        if (iIiiiiiIii3.iiIIiiIiii < (Integer)IiIIiIiiiI.iIiiIiiiII.get()) {
            return;
        }
        IiIIiIiiiI.iiIIiiIiii = 3 ^ 3;
        if (IiIIiIiiiI.iiiIiIiIIi) {
            return;
        }
        IIiiiiiIii iIiiiiiIii4 = IiIIiIiiiI;
        iIiiiiiIii4.iIIiIIiiII += --1;
        if (iIiiiiiIii4.iIIiIIiiII > (0x74 & 0x6F)) {
            if (((Boolean)IiIIiIiiiI.IiiIIiiiiI.get()).booleanValue()) {
                IIiiiiiIii iIiiiiiIii5 = IiIIiIiiiI;
                iIiiiiiIii5.error("\u72b6\u6001\u8d85\u65f6: " + IiIIiIiiiI.IiIiIIIIiI.name() + " (\u5df2\u7b49\u5f85 " + iIiiiiiIii5.iIIiIIiiII + " \u523b)", new Object[3 & 4]);
            }
            IiIIiIiiiI.ALLATORIxDEMO(ShulkerBoxItemFetcher.State.IIIIiIiiIi);
            return;
        }
        if (((Boolean)IiIIiIiiiI.iiIiIiiiiI.get()).booleanValue()) {
            IIiiiiiIii iIiiiiiIii6 = IiIIiIiiiI;
            iIiiiiiIii6.info("\u5f53\u524d\u72b6\u6001: " + IiIIiIiiiI.IiIiIIIIiI.name() + " (Tick: " + IiIIiIiiiI.iiIIiiIiii + ", \u8d85\u65f6: " + iIiiiiiIii6.iIIiIIiiII + ")", new Object[2 & 5]);
        }
        switch (IiIIiIiiiI.IiIiIIIIiI.ordinal()) {
            case 0: {
                IiIIiIiiiI.IiIiiiIIiI();
                return;
            }
            case 1: {
                IiIIiIiiiI.iIIiIIiIii();
                return;
            }
            case 2: {
                IiIIiIiiiI.IiiiiiiiII();
                return;
            }
            case 3: {
                IiIIiIiiiI.IiiIIIIiiI();
                return;
            }
            case 4: {
                IiIIiIiiiI.ALLATORIxDEMO();
                return;
            }
            case 5: {
                IiIIiIiiiI.iIIiiiIiiI();
                return;
            }
            case 6: {
                IiIIiIiiiI.IiiiiiiIIi();
                return;
            }
            case 7: {
                IiIIiIiiiI.IIIIIIiIii();
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        void IiIIiIiiiI;
        IIiiiiiIii iIiiiiiIii = iIiiiiiIii3;
        if (iIiiiiiIii.iiIIIIiIII.player == null || !((Boolean)iIiiiiiIii.iIIiiIIIII.get()).booleanValue()) {
            return;
        }
        IIiiiiiIii iIiiiiiIii2 = iIiiiiiIii;
        IIiiiiiIii iIiiiiiIii3 = iIiiiiiIii2.iiIIIIiIII.player.getEyePos();
        IIiiiiiIii iIiiiiiIii4 = iIiiiiiIii3 = class_243.ofCenter((class_2382)IiIIiIiiiI).subtract((class_243)iIiiiiiIii3).normalize();
        float f = (float)(class_3532.atan2((double)((class_243)iIiiiiiIii3).z, (double)((class_243)iIiiiiiIii4).x) * 180.0 / Math.PI) - 90.0f;
        float this2 = (float)(-(class_3532.atan2((double)((class_243)iIiiiiiIii4).y, (double)Math.sqrt(((class_243)iIiiiiiIii3).x * ((class_243)iIiiiiiIii3).x + ((class_243)iIiiiiiIii3).z * ((class_243)iIiiiiiIii3).z)) * 180.0 / Math.PI));
        Rotations.rotate((double)f, (double)this2);
        if (((Boolean)iIiiiiiIii2.iiIiIiiiiI.get()).booleanValue()) {
            Object[] objectArray = new Object[3 >> 1];
            objectArray[2 & 5] = Float.valueOf(f);
            Object[] objectArray2 = new Object[4 ^ 5];
            objectArray2[5 >> 3] = Float.valueOf(this2);
            iIiiiiiIii.info("\u8f6c\u5934\u770b\u5411\u65b9\u5757: " + IiIIiIiiiI.toShortString() + " (\u504f\u822a: " + String.format(IiIiIIiIII.ALLATORIxDEMO(":%.m"), objectArray) + ", \u4fef\u4ef0: " + String.format(IIIIiiiIIi.ALLATORIxDEMO("}\u001diU"), objectArray2) + ")", new Object[3 & 4]);
        }
    }

    public static int IiiiiiiIIi() {
        int n;
        int n2 = 3 ^ 3;
        class_310 class_3102 = class_310.getInstance();
        int n3 = n = 0x6F & 0x19;
        while (true) {
            if (n3 >= 36) break;
            if (class_3102.player.getInventory().getStack(n).isEmpty()) {
                ++n2;
            }
            n3 = ++n;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    public static int IiiiiiiIIi(class_1799 class_17992, class_1792 class_17922) {
        class_1799 class_17993 = class_17992;
        class_9288 IiIIiIiiiI = (class_9288)class_17993.get(class_9334.CONTAINER);
        if (IiIIiIiiiI == null) {
            return 2 & 5;
        }
        int n = 0;
        for (class_1799 class_17994 : IiIIiIiiiI.stream().toList()) {
            void IiIIiIiiiI2;
            if (class_17994.isEmpty() || class_17994.getItem() != IiIIiIiiiI2) continue;
            n += class_17994.getCount();
        }
        return n;
    }

    public static int ALLATORIxDEMO(class_1799 class_17992) {
        class_1799 class_17993 = class_17992;
        if (class_17993.isEmpty()) {
            return 3 & 4;
        }
        class_1799 class_17994 = class_17993;
        int n = class_17994.getMaxDamage();
        int IiIIiIiiiI = class_17994.getDamage();
        return n - IiIIiIiiiI;
    }

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

