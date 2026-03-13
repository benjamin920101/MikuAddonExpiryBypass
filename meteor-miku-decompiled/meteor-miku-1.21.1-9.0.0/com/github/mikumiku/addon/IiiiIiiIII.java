/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.mixininterface.IRaycastContext
 *  meteordevelopment.meteorclient.mixininterface.IVec3d
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.passive.VillagerEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.EnchantedBookItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentLevelEntry
 *  net.minecraft.world.World
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.registry.Registry
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtList
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.InventoryS2CPacket
 *  net.minecraft.network.packet.s2c.play.ExplosionS2CPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$Full
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$LookAndOnGround
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$OnGroundOnly
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.village.VillagerData
 *  net.minecraft.village.VillagerProfession
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 *  net.minecraft.entity.attribute.EntityAttributes
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.registry.entry.RegistryEntry$Reference
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.registry.RegistryKeys
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIIiiIIIii;
import com.github.mikumiku.addon.iiIIIiiIII;
import com.github.mikumiku.addon.mixinface.MySettings;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.mixininterface.IRaycastContext;
import meteordevelopment.meteorclient.mixininterface.IVec3d;
import meteordevelopment.meteorclient.utils.player.Rotations;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.registry.Registry;
import net.minecraft.util.math.Vec3d;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.InventoryS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.village.VillagerData;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.RaycastContext;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.registry.RegistryKeys;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiiIiiIII {
    public static class_1799 ALLATORIxDEMO(Optional<class_6880.class_6883<class_1887>> IiIIiIiiiI) {
        return class_1772.forEnchantment((class_1889)new class_1889((class_6880)IiIIiIiiiI.get(), ((class_1887)IiIIiIiiiI.get().comp_349()).getMaxLevel()));
    }

    public static boolean ALLATORIxDEMO(class_3850 IiIIiIiiiI) {
        if (IiIIiIiiiI.getProfession() == class_3852.NONE) {
            return 5 >> 2;
        }
        return false;
    }

    public static void ALLATORIxDEMO(int IiIIiIiiiI) {
        class_310.getInstance().player.getInventory().selectedSlot = IiIIiIiiiI;
    }

    public static double ALLATORIxDEMO(class_1309 IiIIiIiiiI) {
        return IiIIiIiiiI.getAttributeValue(class_5134.GENERIC_ARMOR_TOUGHNESS);
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(class_332 class_3322, class_2960 class_29602, int n, int n2, int n3, int n4) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        void IiIIiIiiiI5;
        int n5 = n4;
        class_332 IiIIiIiiiI6 = class_3322;
        IiIIiIiiiI6.drawTexture((class_2960)IiIIiIiiiI5, (int)IiIIiIiiiI4, (int)IiIIiIiiiI3, 5 >> 3, 3 >> 2, (int)IiIIiIiiiI2, (int)IiIIiIiiiI);
    }

    public static class_2828.class_5911 ALLATORIxDEMO(boolean IiIIiIiiiI) {
        return new class_2828.class_5911(IiIIiIiiiI);
    }

    public static int ALLATORIxDEMO(class_2649 IiIIiIiiiI) {
        return IiIIiIiiiI.getSyncId();
    }

    public static class_243 ALLATORIxDEMO(class_1297 IiIIiIiiiI) {
        return IiIIiIiiiI.getPos();
    }

    public IiiiIiiIII() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIIIiiIII.ALLATORIxDEMO("%_0r&vUF\u0005W\u0014Gegu\u8be4\u66a6\u65a4\u5265\u6713\u65f8\u7246\u672e\uff45"));
        }
    }

    public static List<class_1799> ALLATORIxDEMO(class_2649 IiIIiIiiiI) {
        return IiIIiIiiiI.getContents();
    }

    public static String ALLATORIxDEMO(class_1657 IiIIiIiiiI) {
        return IiIIiIiiiI.getGameProfile().getName();
    }

    public static class_3852 ALLATORIxDEMO(class_1646 IiIIiIiiiI) {
        return IiIIiIiiiI.getVillagerData().getProfession();
    }

    public static void IiiiiiiIIi() {
        MeteorClient.mc.getNetworkHandler().sendPacket((class_2596)new class_2848((class_1297)MeteorClient.mc.player, class_2848.class_2849.RELEASE_SHIFT_KEY));
    }

    /*
     * WARNING - void declaration
     */
    public static class_2828.class_2831 ALLATORIxDEMO(float f, float f2, boolean bl) {
        void IiIIiIiiiI;
        boolean IiIIiIiiiI2 = bl;
        float IiIIiIiiiI3 = f;
        return new class_2828.class_2831(IiIIiIiiiI3, (float)IiIIiIiiiI, IiIIiIiiiI2);
    }

    /*
     * WARNING - void declaration
     */
    public static class_2828.class_2830 ALLATORIxDEMO(double d, double d2, double d3, float f, float f2, boolean bl) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        double IiIIiIiiiI5;
        boolean bl2 = bl;
        float IiIIiIiiiI6 = f;
        return new class_2828.class_2830(IiIIiIiiiI5, (double)IiIIiIiiiI4, (double)IiIIiIiiiI3, IiIIiIiiiI6, (float)IiIIiIiiiI2, (boolean)IiIIiIiiiI);
    }

    public static boolean IiiIIIIiiI(class_310 IiIIiIiiiI) {
        return IiIIiIiiiI.player.input.sneaking;
    }

    public static float IiiiiiiIIi(class_744 IiIIiIiiiI) {
        return IiIIiIiiiI.movementForward;
    }

    public static void ALLATORIxDEMO() {
        MeteorClient.mc.getNetworkHandler().sendPacket((class_2596)new class_2848((class_1297)MeteorClient.mc.player, class_2848.class_2849.PRESS_SHIFT_KEY));
    }

    public static class_243 ALLATORIxDEMO(class_2664 IiIIiIiiiI) {
        return new class_243((double)IiIIiIiiiI.getPlayerVelocityX(), (double)IiIIiIiiiI.getPlayerVelocityY(), (double)IiIIiIiiiI.getPlayerVelocityZ());
    }

    public static void ALLATORIxDEMO(class_2487 class_24872, iIIiiIIIii iIIiiIIIii2) {
        Object IiIIiIiiiI = iIIiiIIIii2;
        class_2487 IiIIiIiiiI2 = class_24872;
        Object object = IiIIiIiiiI;
        class_2487 class_24873 = IiIIiIiiiI2;
        IiIIiIiiiI.IiIIiIiiiI = class_2960.tryParse((String)IiIIiIiiiI2.getString(MySettings.ALLATORIxDEMO("\u007fJHpvwb|{}h")));
        IiIIiIiiiI.ALLATORIxDEMO = class_24873.getInt(iiIIIiiIII.ALLATORIxDEMO("\u0015W\u0017s\u0014A\u0016Y"));
        object.iiiiiIIiiI = class_24873.getInt(MySettings.ALLATORIxDEMO("zxnRq`h"));
        object.iiIIIIiIII = IiIIiIiiiI2.getBoolean(iiIIIiiIII.ALLATORIxDEMO("[\u0017^\u0013[\u0016Q"));
    }

    public static class_2350 ALLATORIxDEMO(class_2338 IiIIiIiiiI) {
        return class_2350.fromRotation((double)Rotations.getYaw((class_2338)IiIIiIiiiI)).getOpposite();
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(IRaycastContext iRaycastContext, class_243 class_2432, class_243 class_2433, class_3959.class_3960 class_39602, class_3959.class_242 class_2422, class_746 class_7462) {
        IRaycastContext IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        void IiIIiIiiiI5;
        IRaycastContext iRaycastContext2 = iRaycastContext;
        iRaycastContext = class_7462;
        IRaycastContext IiIIiIiiiI6 = iRaycastContext2;
        IiIIiIiiiI6.set((class_243)IiIIiIiiiI5, (class_243)IiIIiIiiiI4, (class_3959.class_3960)IiIIiIiiiI3, (class_3959.class_242)IiIIiIiiiI2, (class_1297)IiIIiIiiiI);
    }

    public static float ALLATORIxDEMO(class_744 IiIIiIiiiI) {
        return IiIIiIiiiI.movementSideways;
    }

    public static class_2828.class_2829 ALLATORIxDEMO(double IiIIiIiiiI, double IiIIiIiiiI2, double IiIIiIiiiI3, boolean IiIIiIiiiI4) {
        return new class_2828.class_2829(IiIIiIiiiI, IiIIiIiiiI2, IiIIiIiiiI3, IiIIiIiiiI4);
    }

    public static int ALLATORIxDEMO() {
        return class_310.getInstance().player.getInventory().selectedSlot;
    }

    public static int ALLATORIxDEMO(class_310 IiIIiIiiiI) {
        return IiIIiIiiiI.world.getTopY();
    }

    public static class_1937 ALLATORIxDEMO(class_1297 IiIIiIiiiI) {
        return IiIIiIiiiI.getWorld();
    }

    public static class_2499 ALLATORIxDEMO(class_2487 class_24872, String string) {
        Object IiIIiIiiiI = string;
        class_2487 IiIIiIiiiI2 = class_24872;
        return IiIIiIiiiI2.getList((String)IiIIiIiiiI, 0x2F & 0x5A);
    }

    public static boolean IiiiiiiIIi(class_310 IiIIiIiiiI) {
        return IiIIiIiiiI.player.isFallFlying();
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[4 ^ 5];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = 5 >> 1;
        int n2 = string2.length();
        int n3 = n2 - (3 & 5);
        char[] cArray = new char[n2];
        int n4 = --4 << --3 ^ --3;
        int cfr_ignored_0 = (--3 ^ --5) << --4 ^ (n << n ^ 3 & 5);
        int n5 = (1 ^ 3 ^ --5) << --4 ^ (--3 ^ --5) << (3 & 5);
        int n6 = IiIIiIiiiI = string3.length() - --1;
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

    public static void ALLATORIxDEMO(IVec3d IiIIiIiiiI, double IiIIiIiiiI2, double IiIIiIiiiI3, double IiIIiIiiiI4) {
        IiIIiIiiiI.set(IiIIiIiiiI2, IiIIiIiiiI3, IiIIiIiiiI4);
    }

    public static boolean ALLATORIxDEMO(class_310 IiIIiIiiiI) {
        return IiIIiIiiiI.player.input.jumping;
    }

    public static class_2378<class_1887> ALLATORIxDEMO() {
        return class_310.getInstance().world.getRegistryManager().get(class_7924.ENCHANTMENT);
    }

    public static class_2487 ALLATORIxDEMO(class_2487 class_24872, String string) {
        Object IiIIiIiiiI = string;
        class_2487 IiIIiIiiiI2 = class_24872;
        return IiIIiIiiiI2.getCompound((String)IiIIiIiiiI);
    }
}

