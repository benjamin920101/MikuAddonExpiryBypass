/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.render.Render2DEvent
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.renderer.text.TextRenderer
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EntityTypeListSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.friends.Friends
 *  meteordevelopment.meteorclient.utils.entity.DamageUtils
 *  meteordevelopment.meteorclient.utils.entity.EntityUtils
 *  meteordevelopment.meteorclient.utils.entity.SortPriority
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.render.NametagUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.ExperienceOrbEntity
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.decoration.ArmorStandEntity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.item.PotionItem
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntitiesDestroyS2CPacket
 *  net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.sound.SoundCategory
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.item.MaceItem
 *  org.joml.Vector3d
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IIiIIIIIii;
import com.github.mikumiku.addon.IiiIiIIIIi;
import com.github.mikumiku.addon.IiiiIIiiiI;
import com.github.mikumiku.addon.iIiIiIiIII;
import com.github.mikumiku.addon.iIiIiIiIIi;
import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.mixinface.MoveEvent;
import com.github.mikumiku.addon.modules.AutoCrystal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.render.Render2DEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.renderer.text.TextRenderer;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EntityTypeListSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.utils.entity.DamageUtils;
import meteordevelopment.meteorclient.utils.entity.EntityUtils;
import meteordevelopment.meteorclient.utils.entity.SortPriority;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.render.NametagUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PotionItem;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.network.packet.s2c.play.EntitiesDestroyS2CPacket;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundCategory;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.item.MaceItem;
import org.joml.Vector3d;

public class IiiiiIiIiI
extends iiiiIiIiii {
    private final Setting<Double> IiIIiiIiii;
    private final Setting<ShapeMode> IiiiiIIiiI;
    private final Setting<Boolean> iIiiIIIIii;
    private final Setting<Boolean> IIIIiIiIIi;
    private final Setting<Boolean> IiiiiIIIIi;
    private final Setting<Integer> iiIiIiIiiI;
    private final Setting<Double> IiiIiIIIiI;
    private final Setting<SettingColor> IiIiiIIiii;
    private double iIiIiIIiiI;
    private final Setting<Boolean> IIIiIIiiIi;
    private class_2338 IiIiiIIiiI;
    private final Setting<Double> iIIIIiiiii;
    private final Setting<Boolean> IiIiIIIiiI;
    private final Setting<AutoCrystal.SupportMode> iIIIIiiiIi;
    private class_1309 iiIIiiIiIi;
    private final Setting<Integer> IiiIIiIiIi;
    private final SettingGroup iiiiIiiIIi;
    private final IIiIIIIIii iiIIiIiiIi;
    private final SettingGroup IiIiiiiIIi;
    private final Setting<Double> iiIIiIiiII;
    private final SettingGroup IIiIiiIiIi;
    private final Setting<Boolean> IIiIIiIIii;
    private final Setting<SortPriority> iIiiIiiiii;
    private final List<class_1309> iIiIiiIiiI;
    private final Setting<Boolean> IIiiiiiiII;
    private final SettingGroup IIiiiIIIIi;
    private final Map<class_2338, Long> IIIiIIIiII;
    private final Map<Integer, Long> iiIiIiiiiI;
    private final IIiIIIIIii IIiiIiiiII;
    private final Setting<Double> IIIiIiiIIi;
    private final Setting<Boolean> iiiIiIiIIi;
    private final Setting<Double> iIiIiIiIii;
    private final Setting<Boolean> iiiiiIIIii;
    private final Setting<Boolean> iIIiIIiiII;
    private final Setting<Boolean> IiiIIiiiiI;
    private final Setting<Boolean> IiIIIIiiii;
    private final Setting<Boolean> IiiIIIiiIi;
    private final Setting<Boolean> iiIIiiIiii;
    private final Setting<Double> iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private final Setting<Double> iiIiIIiIIi;
    private final SettingGroup IIIIiIiiIi;
    private final Setting<Double> IiIiIIIIiI;
    private final Setting<SettingColor> iiiiiIIiiI;
    private final SettingGroup iiIIIIiIII;
    private final Setting<Set<class_1299<?>>> IiIIiIiiiI;
    private final Setting<Double> ALLATORIxDEMO;

    private /* synthetic */ class_1309 ALLATORIxDEMO() {
        IiiiiIiIiI iiiiiIiIiI = this;
        class_1309 class_13092 = null;
        double d = Double.MAX_VALUE;
        for (class_1309 class_13093 : iiiiiIiIiI.iIiIiiIiiI) {
            double d2;
            double d3 = PlayerUtils.squaredDistanceTo((class_1297)class_13093);
            if (!(d2 < d)) continue;
            class_13092 = class_13093;
            d = d3;
        }
        return class_13092;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        class_2604 class_26042;
        void IiIIiIiiiI;
        IiiiiIiIiI iiiiiIiIiI = object;
        Object object = IiIIiIiiiI.packet;
        if (object instanceof class_2604 && (class_26042 = (class_2604)object).getEntityType() == class_1299.END_CRYSTAL) {
            object = class_2338.ofFloored((double)class_26042.getX(), (double)(class_26042.getY() - 1.0), (double)class_26042.getZ());
            iiiiiIiIiI.IIIiIIIiII.remove(object);
        }
        if ((object = IiIIiIiiiI.packet) instanceof class_2716) {
            class_26042 = (class_2716)object;
            Object object2 = object = class_26042.getEntityIds().iterator();
            while (object2.hasNext()) {
                int n = (Integer)object.next();
                object2 = object;
                iiiiiIiIiI.iiIiIiiiiI.remove(n);
            }
        }
        if ((object = IiIIiIiiiI.packet) instanceof class_2767 && (class_26042 = (class_2767)object).getSound().comp_349() == class_3417.ENTITY_GENERIC_EXPLODE.comp_349() && class_26042.getCategory() == class_3419.BLOCKS) {
            object = new class_243(class_26042.getX(), class_26042.getY(), class_26042.getZ());
            iiiiiIiIiI.iiIIIIiIII.world.getEntities().forEach(arg_0 -> iiiiiIiIiI.ALLATORIxDEMO((class_243)object, arg_0));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IiiiiiiIIi(class_2338 class_23382) {
        void IiIIiIiiiI;
        IiiiiIiIiI iiiiiIiIiI = this;
        int n = IIIiIiIiii.ALLATORIxDEMO(class_1802.END_CRYSTAL);
        if (n == -4 >> 2) {
            return;
        }
        IIIiIiIiii.ALLATORIxDEMO(n);
        class_243 class_2432 = class_243.ofCenter((class_2382)IiIIiIiiiI);
        if (iIiIiIiIIi.ALLATORIxDEMO().ALLATORIxDEMO(new IiiiIIiiiI(class_2432))) {
            iiiiiIiIiI.ALLATORIxDEMO((class_2338)IiIIiIiiiI);
        }
        IIIiIiIiii.ALLATORIxDEMO(n);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render2DEvent render2DEvent) {
        IiiiiIiIiI iiiiiIiIiI = object;
        Object object = render2DEvent;
        IiiiiIiIiI IiIIiIiiiI = iiiiiIiIiI;
        if (((Boolean)IiIIiIiiiI.IiIIIIiiii.get()).booleanValue() && IiIIiIiiiI.iIiIiIIiiI > 0.0) {
            object = new Vector3d();
            IiiiiIiIiI iiiiiIiIiI2 = object;
            iiiiiIiIiI2.set((double)IiIIiIiiiI.IiIiiIIiiI.getX() + 0.5, (double)IiIIiIiiiI.IiIiiIIiiI.getY() + 0.5, (double)IiIIiIiiiI.IiIiiIIiiI.getZ() + 0.5);
            if (NametagUtils.to2D((Vector3d)iiiiiIiIiI2, (double)1.25)) {
                NametagUtils.begin((Vector3d)object);
                TextRenderer.get().begin(1.0, (2 & 5) != 0, 5 >> 2);
                Object[] objectArray = new Object[4 ^ 5];
                objectArray[5 >> 3] = IiIIiIiiiI.iIiIiIIiiI;
                object = String.format(IiiiIIiiiI.ALLATORIxDEMO("\u000f[;3"), objectArray);
                double d = TextRenderer.get().getWidth((String)object) / 2.0;
                TextRenderer.get().render((String)object, -d, 0.0, (Color)IiIIiIiiiI.iiiiiIIiiI.get(), 5 >> 2);
                TextRenderer.get().end();
                NametagUtils.end();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

