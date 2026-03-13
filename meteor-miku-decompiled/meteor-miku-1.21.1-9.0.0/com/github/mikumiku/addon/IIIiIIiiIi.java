/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent
 *  meteordevelopment.meteorclient.events.world.CollisionShapeEvent
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.ItemFrameEntity
 *  net.minecraft.item.Items
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.shape.VoxelShapes
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.network.packet.c2s.play.HandSwingC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.block.ScaffoldingBlock
 *  net.minecraft.util.hit.BlockHitResult
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiIiiIiiIi;
import com.github.mikumiku.addon.IiiiIIiiiI;
import com.github.mikumiku.addon.iIiIiIiIIi;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.mixinface.MySettings;
import com.github.mikumiku.addon.modules.Phase;
import java.util.Date;
import meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent;
import meteordevelopment.meteorclient.events.world.CollisionShapeEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.ItemFrameEntity;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.block.ScaffoldingBlock;
import net.minecraft.util.hit.BlockHitResult;

public class IIIiIIiiIi
extends iiiiIiIiii {
    private final SettingGroup iiIIiiIiii;
    private final Setting<Double> iIiiIiiiII;
    private final SettingGroup iIIiiIIIII;
    private final Setting<Boolean> iiIiIIiIIi;
    private final SettingGroup IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private final Setting<Integer> iiiiiIIiiI;
    private final Setting<Phase.PhaseMode> iiIIIIiIII;
    private final Setting<Boolean> IiIIiIiiiI;
    private final Setting<Double> ALLATORIxDEMO;

    private /* synthetic */ void IiiiiiiIIi(float f) {
        float f2;
        float this22 = f;
        IIIiIIiiIi IiIIiIiiiI2 = this;
        this22 %= 360.0f;
        if (f2 < 0.0f) {
            this22 += 360.0f;
        }
        class_2338 class_23382 = IiIIiIiiiI2.iiIIIIiIII.player.getBlockPos();
        class_23382 = (double)this22 >= 22.5 && (double)this22 < 67.5 ? class_23382.south().west() : ((double)this22 >= 67.5 && (double)this22 < 112.5 ? class_23382.west() : ((double)this22 >= 112.5 && (double)this22 < 157.5 ? class_23382.north().west() : ((double)this22 >= 157.5 && (double)this22 < 202.5 ? class_23382.north() : ((double)this22 >= 202.5 && (double)this22 < 247.5 ? class_23382.north().east() : ((double)this22 >= 247.5 && (double)this22 < 292.5 ? class_23382.east() : ((double)this22 >= 292.5 && (double)this22 < 337.5 ? class_23382.south().east() : class_23382.south()))))));
        FindItemResult this22 = InvUtils.findInHotbar(IiIIiIiiiI -> {
            if (IiIIiIiiiI.getItem() == class_1802.OBSIDIAN || IiIIiIiiiI.getItem() == class_1802.END_STONE || IiIIiIiiiI.getItem() == class_1802.NETHERITE_BLOCK || IiIIiIiiiI.getItem() == class_1802.DIAMOND_BLOCK || IiIIiIiiiI.getItem() == class_1802.IRON_BLOCK || IiIIiIiiiI.getItem() == class_1802.GOLD_BLOCK || IiIIiIiiiI.getItem() == class_1802.COAL_BLOCK || IiIIiIiiiI.getItem() == class_1802.REDSTONE_BLOCK) {
                return true;
            }
            return false;
        });
        if (this22.found() && !IiIIiIiiiI2.iiIIIIiIII.world.getBlockState(class_23382.down()).isReplaceable()) {
            BlockUtils.place((class_2338)class_23382, (FindItemResult)this22, (boolean)(--1 != 0), (int)(3 ^ 3));
        }
    }

    private /* synthetic */ void IiiIIIIiiI() {
        IIIiIIiiIi iIIiIIiiIi2 = this;
        int n = IIIiIiIiii.ALLATORIxDEMO(class_1802.ENDER_PEARL);
        if (n == -4 >> 2) {
            iIIiIIiiIi2.error(IiIiiIiiIi.ALLATORIxDEMO("\u675d\u6215\u5267\u6760\u5f26\u7386\u7397\u627d\u73ba\u738b\u51e0\u533f\u4e5a\uff6a"), new Object[3 >> 2]);
            return;
        }
        IIIiIIiiIi iIIiIIiiIi3 = iIIiIIiiIi2;
        float f = iIIiIIiiIi3.iiIIIIiIII.player.getYaw();
        float f2 = iIIiIIiiIi3.iiIIIIiIII.player.getPitch();
        class_243 class_2432 = new class_243(Math.floor(iIIiIIiiIi2.iiIIIIiIII.player.getX()) + 0.5, 0.0, Math.floor(iIIiIIiiIi2.iiIIIIiIII.player.getZ()) + 0.5);
        double d = class_2432.x - iIIiIIiiIi2.iiIIIIiIII.player.getX();
        float f3 = (float)(Math.toDegrees(Math.atan2(class_2432.z - iIIiIIiiIi2.iiIIIIiIII.player.getZ(), d)) - 90.0) + 180.0f;
        if (((Boolean)iIIiIIiiIi3.iiIiIIiIIi.get()).booleanValue()) {
            IIIiIIiiIi iIIiIIiiIi4 = iIIiIIiiIi2;
            iIIiIIiiIi4.ALLATORIxDEMO(f3);
            iIIiIIiiIi4.IiiiiiiIIi();
        }
        if (((Boolean)iIIiIIiiIi2.IiIiIIIIiI.get()).booleanValue()) {
            iIIiIIiiIi2.IiiiiiiIIi(f3);
        }
        if (iIiIiIiIIi.ALLATORIxDEMO().ALLATORIxDEMO(new IiiiIIiiiI(f3, ((Integer)iIIiIIiiIi2.iiiiiIIiiI.get()).intValue()))) {
            // empty if block
        }
        Rotations.rotate((double)f3, (double)((Integer)iIIiIIiiIi2.iiiiiIIiiI.get()).intValue(), () -> {
            void IiIIiIiiiI;
            int n2 = n;
            IIIiIIiiIi IiIIiIiiiI2 = this;
            IIIiIiIiii.ALLATORIxDEMO(n2);
            IiIIiIiiiI2.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)new class_2886(class_1268.MAIN_HAND, 5 >> 3, (float)IiIIiIiiiI, (float)((Integer)IiIIiIiiiI2.iiiiiIIiiI.get()).intValue()));
            IiIIiIiiiI2.iiIIIIiIII.player.swingHand(class_1268.MAIN_HAND);
            IIIiIiIiii.ALLATORIxDEMO(n2);
        });
        IIIiIIiiIi iIIiIIiiIi5 = iIIiIIiiIi2;
        iIIiIIiiIi5.iiIIIIiIII.player.setYaw(f);
        iIIiIIiiIi5.iiIIIIiIII.player.setPitch(f2);
    }

    public String getInfoString() {
        return ((Phase.PhaseMode)((Object)this.iiIIIIiIII.get())).name();
    }

    private /* synthetic */ boolean iiIiiiiiII() {
        int n;
        IIIiIIiiIi iIIiIIiiIi2 = iIIiIIiiIi3;
        IIIiIIiiIi iIIiIIiiIi3 = iIIiIIiiIi2.iiIIIIiIII.player.getBoundingBox();
        int n2 = n = class_3532.floor((double)((class_238)iIIiIIiiIi3).minX);
        while (true) {
            if (n2 >= class_3532.floor((double)((class_238)iIIiIIiiIi3).maxX) + --1) break;
            int n3 = class_3532.floor((double)((class_238)iIIiIIiiIi3).minY);
            while (true) {
                int n4;
                if (n3 >= class_3532.floor((double)((class_238)iIIiIIiiIi3).maxY) + --1) break;
                int n5 = class_3532.floor((double)((class_238)iIIiIIiiIi3).minZ);
                while (true) {
                    int n6;
                    if (n5 >= class_3532.floor((double)((class_238)iIIiIIiiIi3).maxZ) + (4 ^ 5)) break;
                    class_2338 class_23382 = new class_2338(n, n4, n6);
                    if (iIIiIIiiIi2.iiIIIIiIII.world.getBlockState(class_23382).blocksMovement()) {
                        if (iIIiIIiiIi3.intersects(new class_238((double)n, (double)n4, (double)n6, (double)n + 1.0, (double)n4 + 1.0, (double)n6 + 1.0))) {
                            return 3 >> 1;
                        }
                    }
                    n5 = ++n6;
                }
                n3 = ++n4;
            }
            n2 = ++n;
        }
        return false;
    }

    @Override
    public void onActivate() {
        if (this.iiIIIIiIII.player == null) {
            return;
        }
        if (this.iiIIIIiIII.get() == Phase.PhaseMode.IiIIiIiiiI) {
            IIIiIIiiIi iIIiIIiiIi2 = this;
            iIIiIIiiIi2.IiiIIIIiiI();
            iIIiIIiiIi2.toggle();
            return;
        }
        if (((Boolean)this.IiIIiIiiiI.get()).booleanValue() && this.iiIIIIiIII.get() != Phase.PhaseMode.IiIiIIIIiI) {
            this.ALLATORIxDEMO();
        }
    }

    private /* synthetic */ void IiiiiiiIIi() {
        if (this.iiIIIIiIII.world.getBlockState(this.iiIIIIiIII.player.getBlockPos()).getBlock() instanceof class_3736) {
            IIIiIIiiIi iIIiIIiiIi2 = this;
            iIIiIIiiIi2.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)new class_2846(class_2846.class_2847.START_DESTROY_BLOCK, this.iiIIIIiIII.player.getBlockPos(), class_2350.UP));
            iIIiIIiiIi2.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)new class_2846(class_2846.class_2847.STOP_DESTROY_BLOCK, this.iiIIIIiIII.player.getBlockPos(), class_2350.UP));
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PlayerMoveEvent playerMoveEvent) {
        IIIiIIiiIi iIIiIIiiIi2 = iIIiIIiiIi3;
        IIIiIIiiIi iIIiIIiiIi3 = playerMoveEvent;
        IIIiIIiiIi IiIIiIiiiI = iIIiIIiiIi2;
        if (IiIIiIiiiI.iiIIIIiIII.get() == Phase.PhaseMode.IiIiIIIIiI && IiIIiIiiiI.iiIIIIiIII.player.isOnGround() && !IiIIiIiiiI.iiIIIIiIII.player.hasVehicle()) {
            class_243 class_2432;
            iIIiIIiiIi3 = IiIIiIiiiI.iiIIIIiIII.player.getBlockPos().toCenterPos();
            int n = class_2432.x - IiIIiIiiiI.iiIIIIiIII.player.getX() > 0.0 ? 5 >> 2 : 0;
            int n2 = ((class_243)iIIiIIiiIi3).z - IiIIiIiiiI.iiIIIIiIII.player.getZ() > 0.0 ? 5 >> 2 : 0;
            double d = ((class_243)iIIiIIiiIi3).x + 0.2 * (double)(n != 0 ? -4 >> 2 : 1);
            double d2 = ((class_243)iIIiIIiiIi3).z + 0.2 * (double)(n2 != 0 ? -4 >> 2 : 1);
            IIIiIIiiIi iIIiIIiiIi4 = IiIIiIiiiI;
            iIIiIIiiIi4.iiIIIIiIII.player.setPosition(d, IiIIiIiiiI.iiIIIIiIII.player.getY(), d2);
            iIIiIIiiIi4.toggle();
        }
    }

    public IIIiIIiiIi() {
        IIIiIIiiIi iIIiIIiiIi2 = this;
        super(iiiiIiIiii.ALLATORIxDEMO, MySettings.ALLATORIxDEMO("\u73e5\u73c7\u7a1d\u58f4"), IiIiiIiiIi.ALLATORIxDEMO("\u5116\u8bf3\u73de\u5bdd\u7a08\u8fac\u56ad\u4f18\u65ce\u573c"));
        iIIiIIiiIi2.iIIiiIIIII = iIIiIIiiIi2.settings.getDefaultGroup();
        iIIiIIiiIi2.IIIIiIiiIi = iIIiIIiiIi2.settings.createGroup(MySettings.ALLATORIxDEMO("\u6703\u5f56\u73af\u738d"));
        iIIiIIiiIi2.iiIIiiIiii = iIIiIIiiIi2.settings.createGroup(IiIiiIiiIi.ALLATORIxDEMO("\u7a28\u58d2\u8bc9\u7f05"));
        iIIiIIiiIi2.iiIIIIiIII = iIIiIIiiIi2.iIIiiIIIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(MySettings.ALLATORIxDEMO("\u6a43\u5f62"))).description(IiIiiIiiIi.ALLATORIxDEMO("\u7a08\u58f2\u6a76\u5f44\u907e\u6282"))).defaultValue((Object)Phase.PhaseMode.IIIIiIiiIi)).build());
        this.iiiiiIIiiI = this.IIIIiIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(MySettings.ALLATORIxDEMO("\u4fc8\u4e92\u89bf"))).description(IiIiiIiiIi.ALLATORIxDEMO("\u62de\u63e0\u6760\u5f06\u73a6\u7397\u76ef\u4fb8\u4ebb\u89a5\u5ecd"))).defaultValue((Object)(0x75 & 0x5F))).min(0x7F & 0x46).max(0x5A & 0x7F).visible(() -> {
            if (this.iiIIIIiIII.get() == Phase.PhaseMode.IiIIiIiiiI) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iiIiIIiIIi = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MySettings.ALLATORIxDEMO("\u6513\u51dc\u5bfc\u4f3e"))).description(IiIiiIiiIi.ALLATORIxDEMO("\u656c\u51b0\u73ba\u738b\u8d98\u5fef\u4e5d\u76cf\u5be9\u4f38"))).defaultValue((Object)((2 & 5) != 0))).visible(() -> {
            if (this.iiIIIIiIII.get() == Phase.PhaseMode.IiIIiIiiiI) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.IiIiIIIIiI = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MySettings.ALLATORIxDEMO("\u81c2\u528f\u5809\u5128"))).description(IiIiiIiiIi.ALLATORIxDEMO("\u81a1\u52ff\u5763\u7a08\u58f2\u4f3a\u7f05\u583c\u510e\u65ce\u573c"))).defaultValue((Object)((2 & 5) != 0))).visible(() -> {
            if (this.iiIIIIiIII.get() == Phase.PhaseMode.IiIIiIiiiI) {
                return 3 >> 1;
            }
            return false;
        })).build());
        this.ALLATORIxDEMO = this.iiIIiiIiii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(MySettings.ALLATORIxDEMO("\u7a57\u58be\u8dbf\u79d6"))).description(IiIiiIiiIi.ALLATORIxDEMO("\u7a14\u58ee\u76ef\u65ee\u571c\u8daa\u79d0"))).defaultValue(0.003).min(0.001).max(10.0).sliderMax(1.0).visible(() -> {
            if (this.iiIIIIiIII.get() != Phase.PhaseMode.IiIIiIiiiI && this.iiIIIIiIII.get() != Phase.PhaseMode.IiIiIIIIiI) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iIiiIiiiII = this.iiIIiiIiii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(MySettings.ALLATORIxDEMO("\u5067\u79dc\u8dbf\u79d6"))).description(IiIiiIiiIi.ALLATORIxDEMO("\u7a08\u58f2\u6581\u76ef\u5018\u79b0\u8daa\u79d0"))).defaultValue(0.2).min(0.0).max(10.0).sliderMax(1.0).visible(() -> {
            if (this.iiIIIIiIII.get() != Phase.PhaseMode.IiIIiIiiiI && this.iiIIIIiIII.get() != Phase.PhaseMode.IiIiIIIIiI) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.IiIIiIiiiI = this.iiIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(MySettings.ALLATORIxDEMO("\u81c2\u528f\u7a1d\u58f4"))).description(IiIiiIiiIi.ALLATORIxDEMO("\u819d\u52c3\u6210\u8827\u7a28\u58d2\u64ba\u4f37"))).defaultValue((Object)(--1 != 0))).visible(() -> {
            if (this.iiIIIIiIII.get() != Phase.PhaseMode.IiIIiIiiiI && this.iiIIIIiIII.get() != Phase.PhaseMode.IiIiIIIIiI) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(MySettings.ALLATORIxDEMO("Evp{F_\u0015Oe~TN\u0005N\u0015\u8bcd\u66c6\u658d\u5205\u673a\u6598\u726f\u674e\uff6c"));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IIIiIIiiIi iIIiIIiiIi2 = this;
        double d = Math.cos(Math.toRadians(iIIiIIiiIi2.iiIIIIiIII.player.getYaw() + 90.0f));
        double d2 = Math.sin(Math.toRadians(iIIiIIiiIi2.iiIIIIiIII.player.getYaw() + 90.0f));
        iIIiIIiiIi2.iiIIIIiIII.player.setPosition(this.iiIIIIiIII.player.getX() + (Double)this.ALLATORIxDEMO.get() * d, this.iiIIIIiIII.player.getY(), this.iiIIIIiIII.player.getZ() + (Double)this.ALLATORIxDEMO.get() * d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(CollisionShapeEvent collisionShapeEvent) {
        IIIiIIiiIi iIIiIIiiIi2 = iIIiIIiiIi3;
        IIIiIIiiIi iIIiIIiiIi3 = collisionShapeEvent;
        IIIiIIiiIi IiIIiIiiiI = iIIiIIiiIi2;
        if (IiIIiIiiiI.iiIIIIiIII.player == null) {
            return;
        }
        switch (((Phase.PhaseMode)((Object)IiIIiIiiiI.iiIIIIiIII.get())).ordinal()) {
            case 0: {
                if (((CollisionShapeEvent)iIIiIIiiIi3).shape == class_259.empty() || !(((CollisionShapeEvent)iIIiIIiiIi3).shape.getBoundingBox().maxY > IiIIiIiiiI.iiIIIIiIII.player.getBoundingBox().minY) || !IiIIiIiiiI.iiIIIIiIII.player.isSneaking()) return;
                ((CollisionShapeEvent)iIIiIIiiIi3).shape = class_259.empty();
                return;
            }
            case 1: {
                ((CollisionShapeEvent)iIIiIIiiIi3).shape = class_259.empty();
                IiIIiIiiiI.iiIIIIiIII.player.noClip = --1;
                return;
            }
            case 2: {
                if (!IiIIiIiiiI.iiIIIIiIII.player.horizontalCollision) return;
                ((CollisionShapeEvent)iIIiIIiiIi3).shape = class_259.empty();
                return;
            }
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(float f) {
        float this22 = f;
        IIIiIIiiIi IiIIiIiiiI = this;
        Object this22 = (class_3965)IiIIiIiiiI.iiIIIIiIII.player.raycast(3.0, 0.0f, (2 & 5) != 0);
        this22 = new class_238(this22.getBlockPos()).expand(0.2);
        for (class_1297 class_12972 : IiIIiIiiiI.iiIIIIiIII.world.getOtherEntities(null, (class_238)this22)) {
            if (!(class_12972 instanceof class_1533)) continue;
            IIIiIIiiIi iIIiIIiiIi2 = IiIIiIiiiI;
            IiIIiIiiiI.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)class_2824.attack((class_1297)class_12972, (boolean)iIIiIIiiIi2.iiIIIIiIII.player.isSneaking()));
            iIIiIIiiIi2.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)new class_2879(class_1268.MAIN_HAND));
        }
    }
}

