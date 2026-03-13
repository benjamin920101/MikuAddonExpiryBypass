/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.systems.modules.Modules
 *  meteordevelopment.meteorclient.systems.modules.player.InstantRebreak
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  net.minecraft.util.Hand
 *  net.minecraft.util.ActionResult
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.ExperienceOrbEntity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.decoration.ArmorStandEntity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.projectile.ArrowEntity
 *  net.minecraft.entity.projectile.thrown.ExperienceBottleEntity
 *  net.minecraft.item.Item
 *  net.minecraft.block.AirBlock
 *  net.minecraft.block.BedBlock
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.block.ButtonBlock
 *  net.minecraft.block.DoorBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Direction$Type
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.block.FluidBlock
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.block.SlabBlock
 *  net.minecraft.block.SignBlock
 *  net.minecraft.block.TrapdoorBlock
 *  net.minecraft.block.WallSignBlock
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.block.BlockState
 *  net.minecraft.state.property.Properties
 *  net.minecraft.state.property.Property
 *  net.minecraft.block.enums.SlabType
 *  net.minecraft.network.packet.c2s.play.HandSwingC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.block.AbstractFireBlock
 *  net.minecraft.block.HangingSignBlock
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiiiIIiiiI;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.IiiiIiiiiI;
import com.github.mikumiku.addon.iIiIiIiIIi;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.iiiiiIiIIi;
import com.github.mikumiku.addon.util.BaritoneUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.player.InstantRebreak;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.thrown.ExperienceBottleEntity;
import net.minecraft.item.Item;
import net.minecraft.block.AirBlock;
import net.minecraft.block.BedBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.hit.HitResult;
import net.minecraft.block.FluidBlock;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SignBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.WallSignBlock;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.block.enums.SlabType;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.HangingSignBlock;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiiIIIIiiI {
    public static final class_310 iiIIIIiIII = class_310.getInstance();
    public static final List<Class> IiIIiIiiiI;
    public static final List<class_2248> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public static List<class_2350> ALLATORIxDEMO(class_2338 class_23382, boolean bl) {
        int n;
        class_2338 class_23383 = class_23382;
        Set<class_2350> set = iiiIIIIiiI.ALLATORIxDEMO(iiiIIIIiiI.iiIIIIiIII.player.getEyePos(), class_23383.toCenterPos());
        ArrayList<class_2350> arrayList = new ArrayList<class_2350>();
        class_2350[] class_2350Array = class_2350.values();
        int n2 = class_2350Array.length;
        int n3 = n = 5 >> 3;
        while (n3 < n2) {
            void IiIIiIiiiI;
            class_2338 IiIIiIiiiI2 = class_2350Array[n];
            class_2680 class_26802 = iiiIIIIiiI.iiIIIIiIII.world.getBlockState(class_23383.offset((class_2350)IiIIiIiiiI2));
            if (!(class_26802.isAir() || class_26802.getBlock() instanceof class_2404 || IiIIiIiiiI != false && !set.contains(IiIIiIiiiI2.getOpposite()))) {
                arrayList.add(IiIIiIiiiI2.getOpposite());
            }
            n3 = ++n;
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean ALLATORIxDEMO(class_2338 class_23382, double d, boolean bl) {
        void IiIIiIiiiI;
        boolean IiIIiIiiiI2 = bl;
        class_2338 IiIIiIiiiI3 = class_23382;
        if (iiiIIIIiiI.ALLATORIxDEMO(IiIIiIiiiI3, (double)IiIIiIiiiI) == null) {
            return 3 >> 2;
        }
        if (iiiIIIIiiI.iIIiIIiIii(IiIIiIiiiI3) && !iiiIIIIiiI.ALLATORIxDEMO(IiIIiIiiiI3, IiIIiIiiiI2)) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    public static boolean IIIIIIiIii(class_2338 class_23382) {
        class_2338 class_23383 = class_23382;
        if (class_23383 == null) {
            return (2 ^ 3) != 0;
        }
        Iterator IiIIiIiiiI = iiiIIIIiiI.iiIIIIiIII.world.getEntities().iterator();
        while (IiIIiIiiiI.hasNext()) {
            if (!((class_1297)IiIIiIiiiI.next()).getBoundingBox().intersects(new class_238(class_23383))) continue;
            return (4 ^ 5) != 0;
        }
        return false;
    }

    public static boolean IiiiiiiIIi(class_2338 class_23382, class_1792 class_17922) {
        class_2338 IiIIiIiiiI232 = class_17922;
        class_2338 IiIIiIiiiI = class_23382;
        int IiIIiIiiiI232 = IIIiIiIiii.iiIiiiiiII((class_1792)IiIIiIiiiI232);
        if (IiIIiIiiiI232 == -4 >> 2) {
            return (2 & 5) != 0;
        }
        IIIiIiIiii.ALLATORIxDEMO(IiIIiIiiiI232);
        boolean bl = 3 & 5;
        boolean bl2 = iiiIIIIiiI.ALLATORIxDEMO(IiIIiIiiiI, bl, bl, bl);
        IIIiIiIiii.ALLATORIxDEMO(IiIIiIiiiI232);
        return bl2;
    }

    public static boolean iIIiIIiIii(class_2338 IiIIiIiiiI) {
        return iiiIIIIiiI.iiIIIIiIII.world.getBlockState(IiIIiIiiiI).isReplaceable();
    }

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

