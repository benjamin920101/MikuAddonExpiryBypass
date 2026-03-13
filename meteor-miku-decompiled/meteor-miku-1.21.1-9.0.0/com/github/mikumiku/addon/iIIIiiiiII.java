/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.events.game.GameJoinedEvent
 *  meteordevelopment.meteorclient.mixininterface.IRaycastContext
 *  meteordevelopment.meteorclient.utils.PreInit
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.world.Difficulty
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.enchantment.Enchantments
 *  net.minecraft.world.BlockView
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Position
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.block.BlockState
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.component.type.ItemEnchantmentsComponent
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiiIiiIII;
import java.util.Arrays;
import java.util.Date;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.game.GameJoinedEvent;
import meteordevelopment.meteorclient.mixininterface.IRaycastContext;
import meteordevelopment.meteorclient.utils.PreInit;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.world.Difficulty;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.world.BlockView;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import org.apache.commons.lang3.mutable.MutableInt;

public class iIIIiiiiII {
    public static class_3959 ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public static double ALLATORIxDEMO(class_1309 class_13092, double d, boolean n) {
        void IiIIiIiiiI;
        class_1309 IiIIiIiiiI2;
        int IiIIiIiiiI3 = n;
        class_1309 class_13093 = IiIIiIiiiI2 = class_13092;
        class_1799 class_17992 = class_13093.getEquippedStack(class_1304.HEAD);
        class_1799 class_17993 = class_13093.getEquippedStack(class_1304.CHEST);
        class_1799 class_17994 = class_13093.getEquippedStack(class_1304.LEGS);
        class_1799 class_17995 = class_13093.getEquippedStack(class_1304.FEET);
        class_1799[] class_1799Array = new class_1799[--4];
        class_1799Array[3 & 4] = class_17992;
        class_1799Array[3 & 5] = class_17993;
        class_1799Array[--2] = class_17994;
        class_1799Array[--3] = class_17995;
        IiIIiIiiiI3 = iIIIiiiiII.ALLATORIxDEMO(Arrays.asList(class_1799Array), IiIIiIiiiI3 != 0);
        if (IiIIiIiiiI3 > 0) {
            IiIIiIiiiI *= (double)(1.0f - class_3532.clamp((float)IiIIiIiiiI3, (float)0.0f, (float)20.0f) / 25.0f);
        }
        return (double)IiIIiIiiiI;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(class_9304 class_93042, MutableInt mutableInt, boolean bl, class_6880 class_68802) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        class_9304 class_93043 = class_93042;
        void v0 = IiIIiIiiiI3;
        int IiIIiIiiiI4 = class_93043.getLevel((class_6880)v0);
        if (v0.matchesId(class_1893.PROTECTION.getValue())) {
            IiIIiIiiiI2.add(IiIIiIiiiI4);
            return;
        }
        if (IiIIiIiiiI != false && IiIIiIiiiI3.matchesId(class_1893.BLAST_PROTECTION.getValue())) {
            IiIIiIiiiI2.add(IiIIiIiiiI4 * (5 >> 1));
        }
    }

    /*
     * WARNING - void declaration
     */
    public static double ALLATORIxDEMO(class_1309 class_13092, class_238 class_2383, class_243 class_2432, class_2338 class_23382, class_2338 class_23383, boolean bl) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        void IiIIiIiiiI5;
        boolean bl2 = bl;
        class_1309 IiIIiIiiiI6 = class_13092;
        return iIIIiiiiII.ALLATORIxDEMO(IiIIiIiiiI6, (class_238)IiIIiIiiiI5, (class_243)IiIIiIiiiI4, (class_2338)IiIIiIiiiI3, (class_2338)IiIIiIiiiI2, (boolean)IiIIiIiiiI, 6.0);
    }

    /*
     * WARNING - void declaration
     */
    public static int ALLATORIxDEMO(Iterable<class_1799> iterable, boolean bl) {
        Object IiIIiIiiiI;
        Iterable<class_1799> iterable2 = iterable;
        MutableInt mutableInt = new MutableInt();
        Object object = IiIIiIiiiI = iterable2.iterator();
        while (object.hasNext()) {
            void IiIIiIiiiI2;
            class_1799 class_17992 = (class_1799)IiIIiIiiiI.next();
            if (class_17992.isEmpty()) {
                object = IiIIiIiiiI;
                continue;
            }
            class_17992 = class_17992.getEnchantments();
            class_17992.getEnchantments().stream().forEach(arg_0 -> iIIIiiiiII.ALLATORIxDEMO((class_9304)class_17992, mutableInt, (boolean)IiIIiIiiiI2, arg_0));
            object = IiIIiIiiiI;
        }
        return mutableInt.intValue();
    }

    public static class_3965 IiiiiiiIIi(class_3959 IiIIiIiiiI) {
        return iIIIiiiiII.ALLATORIxDEMO(IiIIiIiiiI, (2 & 5) != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static double IiiiiiiIIi(class_1309 class_13092, class_238 class_2383, class_243 class_2432, boolean bl) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        boolean IiIIiIiiiI3 = bl;
        class_1309 IiIIiIiiiI4 = class_13092;
        return iIIIiiiiII.IiiiiiiIIi(IiIIiIiiiI4, (class_238)IiIIiIiiiI2, (class_243)IiIIiIiiiI, null, IiIIiIiiiI3);
    }

    public static double ALLATORIxDEMO(class_243 class_2432, class_238 class_2383) {
        class_243 IiIIiIiiiI = class_2383;
        class_243 IiIIiIiiiI2 = class_2432;
        return iIIIiiiiII.ALLATORIxDEMO(IiIIiIiiiI2, (class_238)IiIIiIiiiI, null, null, --1 != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static class_3965 ALLATORIxDEMO(class_3959 class_39593, class_2338 class_23382, class_2338 class_23383, boolean bl) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        boolean IiIIiIiiiI3 = bl;
        class_3959 IiIIiIiiiI4 = class_39593;
        return (class_3965)class_1922.raycast((class_243)IiIIiIiiiI4.getStart(), (class_243)IiIIiIiiiI4.getEnd(), (Object)IiIIiIiiiI4, (arg_0, arg_1) -> iIIIiiiiII.ALLATORIxDEMO((class_2338)IiIIiIiiiI2, (class_2338)IiIIiIiiiI, IiIIiIiiiI3, arg_0, arg_1), class_39592 -> {
            class_3959 class_39593;
            class_3959 class_39594 = class_39593 = class_39592;
            class_3959 IiIIiIiiiI = class_39593.getStart().subtract(class_39594.getEnd());
            return class_3965.createMissed((class_243)class_39594.getEnd(), (class_2350)class_2350.getFacing((double)IiIIiIiiiI.x, (double)IiIIiIiiiI.y, (double)IiIIiIiiiI.z), (class_2338)class_2338.ofFloored((class_2374)class_39593.getEnd()));
        });
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ class_3965 ALLATORIxDEMO(class_2338 class_23382, class_2338 class_23383, boolean bl, class_3959 class_39592, class_2338 class_23384) {
        class_243 class_2432;
        class_243 IiIIiIiiiI;
        void v0;
        void IiIIiIiiiI2;
        class_2338 IiIIiIiiiI3;
        void IiIIiIiiiI4;
        class_2338 class_23385 = class_23382;
        if (IiIIiIiiiI4.equals((Object)class_23385)) {
            IiIIiIiiiI3 = class_2246.OBSIDIAN.getDefaultState();
            v0 = IiIIiIiiiI2;
        } else if (IiIIiIiiiI4.equals((Object)IiIIiIiiiI)) {
            IiIIiIiiiI3 = class_2246.AIR.getDefaultState();
            v0 = IiIIiIiiiI2;
        } else {
            void IiIIiIiiiI5;
            class_2432 = MeteorClient.mc.world.getBlockState((class_2338)IiIIiIiiiI4);
            if (IiIIiIiiiI5 != false && class_2432.getBlock().getBlastResistance() < 200.0f) {
                IiIIiIiiiI3 = class_2246.AIR.getDefaultState();
                v0 = IiIIiIiiiI2;
            } else {
                IiIIiIiiiI3 = class_2432;
                v0 = IiIIiIiiiI2;
            }
        }
        class_2432 = v0.getStart();
        void v1 = IiIIiIiiiI2;
        IiIIiIiiiI = v1.getEnd();
        class_265 IiIIiIiiiI5 = v1.getBlockShape((class_2680)IiIIiIiiiI3, (class_1922)MeteorClient.mc.world, (class_2338)IiIIiIiiiI4);
        return MeteorClient.mc.world.raycastBlock(class_2432, IiIIiIiiiI, (class_2338)IiIIiIiiiI4, IiIIiIiiiI5, (class_2680)IiIIiIiiiI3);
    }

    /*
     * WARNING - void declaration
     */
    public static double IiiiiiiIIi(class_1309 class_13092, class_238 class_2383, class_243 class_2432, class_2338 class_23382, boolean bl) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        boolean bl2 = bl;
        class_1309 IiIIiIiiiI5 = class_13092;
        return iIIIiiiiII.ALLATORIxDEMO(IiIIiIiiiI5, (class_238)IiIIiIiiiI4, (class_243)IiIIiIiiiI3, (class_2338)IiIIiIiiiI2, (boolean)IiIIiIiiiI, 6.0);
    }

    /*
     * WARNING - void declaration
     */
    public static double IiiiiiiIIi(class_1309 class_13092, double d) {
        void IiIIiIiiiI;
        class_1309 class_13093 = class_13092;
        int IiIIiIiiiI2 = class_13093.hasStatusEffect(class_1294.RESISTANCE) ? class_13093.getStatusEffect(class_1294.RESISTANCE).getAmplifier() : 0;
        IiIIiIiiiI2 = (0x5F & 0x39) - (IiIIiIiiiI2 + (3 & 5)) * --5;
        return Math.max((double)(IiIIiIiiiI * (double)IiIIiIiiiI2 / 25.0), 0.0);
    }

    /*
     * WARNING - void declaration
     */
    public static double ALLATORIxDEMO(class_1309 class_13092, class_238 class_2383, class_243 class_2432, class_2338 class_23382, boolean bl) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        boolean bl2 = bl;
        class_1309 IiIIiIiiiI5 = class_13092;
        return iIIIiiiiII.ALLATORIxDEMO(IiIIiIiiiI5, (class_238)IiIIiIiiiI4, (class_243)IiIIiIiiiI3, (class_2338)IiIIiIiiiI2, (boolean)IiIIiIiiiI, 5.0);
    }

    @PreInit
    public static void ALLATORIxDEMO() {
        MeteorClient.EVENT_BUS.subscribe(iIIIiiiiII.class);
    }

    public static double ALLATORIxDEMO(class_1309 IiIIiIiiiI, double IiIIiIiiiI2) {
        double d = IiIIiIiiiI.getArmor();
        double d2 = 2.0 + IiiiIiiIII.ALLATORIxDEMO(IiIIiIiiiI) / 4.0;
        return IiIIiIiiiI2 * (1.0 - class_3532.clamp((double)(d - IiIIiIiiiI2 / d2), (double)(d * 0.2), (double)20.0) / 25.0);
    }

    /*
     * WARNING - void declaration
     */
    public static double ALLATORIxDEMO(class_1309 class_13092, class_238 class_2383, class_243 class_2432, boolean bl) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        boolean IiIIiIiiiI3 = bl;
        class_1309 IiIIiIiiiI4 = class_13092;
        return iIIIiiiiII.ALLATORIxDEMO(IiIIiIiiiI4, (class_238)IiIIiIiiiI2, (class_243)IiIIiIiiiI, null, IiIIiIiiiI3, 5.0);
    }

    public iIIIiiiiII() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[4 ^ 5];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(2 & 5, stackTraceElement.getMethodName()).toString();
        int n = 5 >> 1;
        int n2 = string2.length();
        int n3 = n2 - (3 >> 1);
        char[] cArray = new char[n2];
        int n4 = 3 >> 1;
        int cfr_ignored_0 = --5 << --4 ^ (n << n ^ --3);
        int n5 = --3 ^ --5;
        int n6 = IiIIiIiiiI = string3.length() - (4 ^ 5);
        int n7 = n3;
        String string4 = string3;
        while (n7 >= 0) {
            int n8 = n3--;
            cArray[n8] = (char)(n5 ^ (string2.charAt(n8) ^ string4.charAt(IiIIiIiiiI)));
            if (n3 < 0) break;
            int n9 = n3--;
            char c = cArray[n9] = (char)(n4 ^ (string2.charAt(n9) ^ string4.charAt(IiIIiIiiiI)));
            if (--IiIIiIiiiI < 0) {
                IiIIiIiiiI = n6;
            }
            n7 = n3;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ double ALLATORIxDEMO(class_1309 class_13092, class_238 class_2383, class_243 class_2432, class_2338 class_23382, class_2338 class_23383, boolean bl, double d) {
        double IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        void IiIIiIiiiI5;
        class_1309 IiIIiIiiiI6 = class_2383;
        class_1309 IiIIiIiiiI7 = class_13092;
        if (IiIIiIiiiI6 == null) {
            return 0.0;
        }
        IiIIiIiiiI = iIIIiiiiII.ALLATORIxDEMO((class_238)IiIIiIiiiI6, (class_243)IiIIiIiiiI5, (class_2338)IiIIiIiiiI4, (class_2338)IiIIiIiiiI3, (boolean)IiIIiIiiiI2, IiIIiIiiiI);
        IiIIiIiiiI = iIIIiiiiII.ALLATORIxDEMO(IiIIiIiiiI);
        class_1309 class_13093 = IiIIiIiiiI7;
        IiIIiIiiiI = iIIIiiiiII.ALLATORIxDEMO(class_13093, IiIIiIiiiI);
        IiIIiIiiiI = iIIIiiiiII.IiiiiiiIIi(class_13093, IiIIiIiiiI);
        IiIIiIiiiI = iIIIiiiiII.ALLATORIxDEMO(class_13093, IiIIiIiiiI, --1 != 0);
        return IiIIiIiiiI;
    }

    /*
     * WARNING - void declaration
     */
    public static class_3965 ALLATORIxDEMO(class_3959 class_39592, class_2338 class_23382, class_2338 class_23383) {
        void IiIIiIiiiI;
        class_3959 IiIIiIiiiI2 = class_23383;
        class_3959 IiIIiIiiiI3 = class_39592;
        return iIIIiiiiII.ALLATORIxDEMO(IiIIiIiiiI3, (class_2338)IiIIiIiiiI, (class_2338)IiIIiIiiiI2, (3 & 4) != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static double ALLATORIxDEMO(class_243 class_2432, class_238 class_2383, class_2338 class_23382, boolean bl) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        boolean IiIIiIiiiI3 = bl;
        class_243 IiIIiIiiiI4 = class_2432;
        return iIIIiiiiII.ALLATORIxDEMO(IiIIiIiiiI4, (class_238)IiIIiIiiiI2, (class_2338)IiIIiIiiiI, null, IiIIiIiiiI3);
    }

    public static class_3965 ALLATORIxDEMO(class_3959 class_39592, boolean bl) {
        boolean IiIIiIiiiI = bl;
        class_3959 IiIIiIiiiI2 = class_39592;
        return iIIIiiiiII.ALLATORIxDEMO(IiIIiIiiiI2, null, null, IiIIiIiiiI);
    }

    @EventHandler
    public static void ALLATORIxDEMO(GameJoinedEvent IiIIiIiiiI) {
        ALLATORIxDEMO = new class_3959(class_243.ZERO, class_243.ZERO, class_3959.class_3960.COLLIDER, class_3959.class_242.NONE, (class_1297)MeteorClient.mc.player);
    }

    public static double ALLATORIxDEMO(double IiIIiIiiiI) {
        class_1267 class_12672 = MeteorClient.mc.world.getDifficulty();
        if (class_12672 == class_1267.EASY) {
            return Math.min(IiIIiIiiiI / 2.0 + 1.0, IiIIiIiiiI);
        }
        if (class_12672 == class_1267.NORMAL) {
            return IiIIiIiiiI;
        }
        return IiIIiIiiiI * 1.5;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ double ALLATORIxDEMO(class_1309 class_13092, class_238 class_2383, class_243 class_2432, class_2338 class_23382, boolean bl, double d) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        void IiIIiIiiiI5;
        boolean bl2 = bl;
        class_1309 IiIIiIiiiI6 = class_13092;
        return iIIIiiiiII.ALLATORIxDEMO(IiIIiIiiiI6, (class_238)IiIIiIiiiI5, (class_243)IiIIiIiiiI4, (class_2338)IiIIiIiiiI3, null, (boolean)IiIIiIiiiI2, (double)IiIIiIiiiI);
    }

    /*
     * WARNING - void declaration
     */
    public static double ALLATORIxDEMO(class_238 class_2383, class_243 class_2432, class_2338 class_23382, class_2338 class_23383, boolean bl, double d) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        double d2;
        class_238 IiIIiIiiiI5 = class_2432;
        class_238 IiIIiIiiiI6 = class_2383;
        double d3 = new class_243((IiIIiIiiiI6.minX + IiIIiIiiiI6.maxX) / 2.0, IiIIiIiiiI6.minY, (IiIIiIiiiI6.minZ + IiIIiIiiiI6.maxZ) / 2.0).distanceTo((class_243)IiIIiIiiiI5) / (IiIIiIiiiI *= 2.0);
        if (d2 > 1.0) {
            return 0.0;
        }
        double d4 = iIIIiiiiII.ALLATORIxDEMO((class_243)IiIIiIiiiI5, IiIIiIiiiI6, (class_2338)IiIIiIiiiI4, (class_2338)IiIIiIiiiI3, (boolean)IiIIiIiiiI2);
        d3 = (1.0 - d3) * d4;
        return (int)((d3 * d3 + d3) * 3.5 * IiIIiIiiiI + 1.0);
    }

    /*
     * WARNING - void declaration
     */
    public static double ALLATORIxDEMO(class_243 class_2432, class_238 class_2383, class_2338 class_23382, class_2338 class_23383, boolean bl) {
        class_243 IiIIiIiiiI = class_2383;
        class_243 IiIIiIiiiI2 = class_2432;
        IiiiIiiIII.ALLATORIxDEMO((IRaycastContext)ALLATORIxDEMO, IiIIiIiiiI2, null, class_3959.class_3960.COLLIDER, class_3959.class_242.NONE, MeteorClient.mc.player);
        class_243 class_2433 = IiIIiIiiiI;
        double d = class_2433.getLengthX();
        double d2 = class_2433.getLengthY();
        double d3 = class_2433.getLengthZ();
        double d4 = 1.0 / (d * 2.0 + 1.0);
        double d5 = 1.0 / (d2 * 2.0 + 1.0);
        double d6 = 1.0 / (d3 * 2.0 + 1.0);
        double d7 = (1.0 - Math.floor(1.0 / d4) * d4) / 2.0;
        double d8 = (1.0 - Math.floor(1.0 / d6) * d6) / 2.0;
        d = d4 * d;
        d2 = d5 * d2;
        d3 = d6 * d3;
        if (d < 0.0 || d2 < 0.0 || d3 < 0.0) {
            return 0.0;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        class_243 class_2434 = IiIIiIiiiI;
        d4 = class_2434.minX + d7;
        d5 = class_2434.maxX + d7;
        double d9 = d4;
        while (d9 <= d5) {
            double d10 = IiIIiIiiiI.minY;
            while (d10 <= IiIIiIiiiI.maxY) {
                class_243 class_2435 = IiIIiIiiiI;
                d7 = class_2435.minZ + d8;
                double d11 = class_2435.maxZ + d8;
                double d12 = d7;
                while (d12 <= d11) {
                    void IiIIiIiiiI3;
                    void IiIIiIiiiI4;
                    void IiIIiIiiiI5;
                    class_243 class_2436 = new class_243(d4, d6, d7);
                    IiiiIiiIII.ALLATORIxDEMO((IRaycastContext)ALLATORIxDEMO, IiIIiIiiiI2, class_2436, class_3959.class_3960.COLLIDER, class_3959.class_242.NONE, MeteorClient.mc.player);
                    if (iIIIiiiiII.ALLATORIxDEMO(ALLATORIxDEMO, (class_2338)IiIIiIiiiI5, (class_2338)IiIIiIiiiI4, (boolean)IiIIiIiiiI3).getType() == class_239.class_240.MISS) {
                        f += 1.0f;
                    }
                    f2 += 1.0f;
                    d12 = d7 + d3;
                }
                d10 = d6 + d2;
            }
            d9 = d4 + d;
        }
        return f / f2;
    }
}

