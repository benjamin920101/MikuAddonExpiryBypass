/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Send
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.pathing.PathManagers
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EntityTypeListSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.friends.Friends
 *  meteordevelopment.meteorclient.systems.modules.Modules
 *  meteordevelopment.meteorclient.systems.modules.combat.CrystalAura
 *  meteordevelopment.meteorclient.utils.entity.EntityUtils
 *  meteordevelopment.meteorclient.utils.entity.SortPriority
 *  meteordevelopment.meteorclient.utils.entity.Target
 *  meteordevelopment.meteorclient.utils.entity.TargetUtils
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.world.TickRate
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.passive.AnimalEntity
 *  net.minecraft.entity.passive.WolfEntity
 *  net.minecraft.entity.mob.EndermanEntity
 *  net.minecraft.entity.mob.ZombifiedPiglinEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.TridentItem
 *  net.minecraft.world.GameMode
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.item.MaceItem
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiiIIiiiI;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIiIiIiIIi;
import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiIIiIiIII;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.KillAuraMiku;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.pathing.PathManagers;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EntityTypeListSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.combat.CrystalAura;
import meteordevelopment.meteorclient.utils.entity.EntityUtils;
import meteordevelopment.meteorclient.utils.entity.SortPriority;
import meteordevelopment.meteorclient.utils.entity.Target;
import meteordevelopment.meteorclient.utils.entity.TargetUtils;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.world.TickRate;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.mob.ZombifiedPiglinEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TridentItem;
import net.minecraft.world.GameMode;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.item.MaceItem;

public class IIIiiIIIIi
extends iiiiIiIiii {
    private final Setting<KillAuraMiku.ShieldMode> iIIIIiiiIi;
    private final Setting<KillAuraMiku.EntityAge> iiIIiiIiIi;
    private final Setting<Double> IiiIIiIiIi;
    private final Setting<Boolean> iiiiIiiIIi;
    private int iiIIiIiiIi;
    private final SettingGroup IiIiiiiIIi;
    private final Setting<Boolean> iiIIiIiiII;
    private final Setting<Double> IIiIiiIiIi;
    private final Setting<KillAuraMiku.RotationMode> IIiIIiIIii;
    private final Setting<Boolean> iIiiIiiiii;
    private final List<class_1297> iIiIiiIiiI;
    private final Setting<Integer> IIiiiiiiII;
    private final Setting<Boolean> IIiiiIIIIi;
    private boolean IIIiIIIiII;
    private final Setting<Boolean> iiIiIiiiiI;
    private final Setting<Boolean> IIiiIiiiII;
    private final Setting<Boolean> IIIiIiiIIi;
    private final Setting<Boolean> iiiIiIiIIi;
    private final Setting<Integer> iIiIiIiIii;
    private final Setting<Boolean> iiiiiIIIii;
    private final Setting<Boolean> iIIiIIiiII;
    private final Setting<Boolean> IiiIIiiiiI;
    private final SettingGroup IiIIIIiiii;
    private final Setting<Boolean> IiiIIIiiIi;
    private final Setting<Set<class_1299<?>>> iiIIiiIiii;
    private final Setting<SortPriority> iIiiIiiiII;
    private final Setting<KillAuraMiku.Weapon> iIIiiIIIII;
    private int iiIiIIiIIi;
    private final Setting<Integer> IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private final Setting<Boolean> iiiiiIIiiI;
    private final SettingGroup iiIIIIiIII;
    public boolean IiIIiIiiiI;
    private final Setting<Boolean> ALLATORIxDEMO;

    private /* synthetic */ boolean iIIiiiIiiI() {
        IIIiiIIIIi iIIiiIIIIi = this;
        if (iIIiiIIIIi.iiIIiIiiIi > 0) {
            iIIiiIIIIi.iiIIiIiiIi -= 3 & 5;
            return (3 & 4) != 0;
        }
        float f = this = (Boolean)iIIiiIIIIi.IIiiIiiiII.get() != false ? (float)((Integer)iIIiiIIIIi.IIiiiiiiII.get()).intValue() : 0.5f;
        if (((Boolean)iIIiiIIIIi.iiiiiIIIii.get()).booleanValue()) {
            this /= TickRate.INSTANCE.getTickRate() / 20.0f;
        }
        if (((Boolean)iIIiiIIIIi.IIiiIiiiII.get()).booleanValue()) {
            if ((float)iIIiiIIIIi.iiIiIIiIIi < this) {
                iIIiiIIIIi.iiIiIIiIIi += 3 & 5;
                return 3 >> 2;
            }
            return true;
        }
        if (iIIiiIIIIi.iiIIIIiIII.player.getAttackCooldownProgress(this) >= 1.0f) {
            return 3 >> 1;
        }
        return false;
    }

    public void onDeactivate() {
        this.iIiIiiIiiI.clear();
        this.IiIIiIiiiI = 3 & 4;
    }

    public IIIiiIIIIi() {
        IIIiiIIIIi iIIiiIIIIi = this;
        super(iiiiIiIiii.ALLATORIxDEMO, iiIIiIiIII.ALLATORIxDEMO("}<\\'\u676a\u6261\u5129\u73aa"), iiIIiIiIII.ALLATORIxDEMO("\u8db2\u7ef5\u5f0d\u52c9\u7693\u6732\u655b\u513b\u73b8^\u81fd\u52da\u650c\u51a9\u4f02\u546f\u56c3\u6355\u5baa\u76d1\u5ba9\u4f01\u0006\u4e42\u5301\u811f"));
        iIIiiIIIIi.iiIIIIiIII = iIIiiIIIIi.settings.getDefaultGroup();
        iIIiiIIIIi.IiIiiiiIIi = iIIiiIIIIi.settings.createGroup(iiIIiIiIII.ALLATORIxDEMO("\u76c4\u6848\u9069\u62ec"));
        iIIiiIIIIi.IiIIIIiiii = iIIiiIIIIi.settings.createGroup(iiIIiIiIII.ALLATORIxDEMO("\u65dc\u6775\u63c7\u5233"));
        iIIiiIIIIi.iIIiiIIIII = iIIiiIIIIi.iiIIIIiIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u6b4c\u5627\u7c1b\u578e"))).description(iiIIiIiIII.ALLATORIxDEMO("\u4e97\u574a\u624c\u6336\u6355\u5baa\u6b33\u565f\u65a4\u6511\u51b4\u5bfe\u4f56"))).defaultValue((Object)KillAuraMiku.Weapon.IiIIiIiiiI)).build());
        this.IIiIIiIIii = this.iiIIIIiIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u89ec\u899d\u65ab\u8f69"))).description(iiIIiIiIII.ALLATORIxDEMO("\u51b4\u5bad\u4f07\u65c6\u5c53\u89f1\u8980\u8f46\u545e\u768e\u6802"))).defaultValue((Object)KillAuraMiku.RotationMode.ALLATORIxDEMO)).build());
        this.IIiiiIIIIi = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u81c0\u52e7\u5267\u6367"))).description(iiIIiIiIII.ALLATORIxDEMO("\u6549\u51cc\u76bc\u6865\u65f1\u81dd\u52fa\u5237\u6337\u5207\u905b\u5bb0\u76cb\u6b06\u566d"))).defaultValue((Object)(3 >> 2))).build());
        this.iiiiIiiIIi = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u53fb\u534a\u655b\u51fe"))).description(iiIIiIiIII.ALLATORIxDEMO("\u66a6\u5957\u76cb\u6a41\u5f0a"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.IiIiIIIIiI = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u5076\u6b2d\u75de\u8dd4"))).description(iiIIiIiIII.ALLATORIxDEMO("\u650c\u51a9\u522f\u505b\u6b55\u75ec\u8de1\u4eb0\u4fea\u6353\u53b5\u7207\u882c\u4e3f"))).defaultValue((Object)(5 >> 3))).build());
        this.iiIiIiiiiI = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u5076\u6b2d\u685c\u6324"))).description(iiIIiIiIII.ALLATORIxDEMO("\u653c\u51cc\u521f\u81da\u52fd\u5933\u7454\u76d4\u7203\u685c\u6324"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iiiIiIiIIi = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u4e97\u5702\u70f6\u519b\u65f3"))).description(iiIIiIiIII.ALLATORIxDEMO("\u4ec2\u571f\u635b\u4f7f\u9f75\u6830\u5db4\u9504\u65b9\u655b\u51fe"))).defaultValue((Object)(5 >> 3))).build());
        this.IIIiIiiIIi = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u4e97\u5702\u6ca7\u89a6\u65f3"))).description(iiIIiIiIII.ALLATORIxDEMO("\u4e97\u5718\u6cbd\u89f1\u5bcc\u4f79\u65b9\u655b\u51fe"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.IiiIIiiiiI = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u66b5\u500er4E;^ \u000e`"))).description(iiIIiIiIII.ALLATORIxDEMO("\u571f\u6569\u51ec\u5bec\u4f44\u6584\u6695\u6584\u51ac\u7ea1\u0017\u0010\u0003u^&_;Rr\u81c0\u52e7\u5b9b\u8dea"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iIIIIiiiIi = this.iiIIIIiIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u781e\u76b1\u6a41\u5f0a"))).description(iiIIiIiIII.ALLATORIxDEMO("\u5c4f\u8bb7\u4f78\u751f\u65f5\u5904\u7861\u5778\u76bc\u682d\u76cb\u769e\u7249"))).defaultValue((Object)KillAuraMiku.ShieldMode.IiIIiIiiiI)).visible(() -> {
            if (((Boolean)this.IIiiiIIIIi.get()).booleanValue() && this.iIIiiIIIII.get() != KillAuraMiku.Weapon.IIIIiIiiIi) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        class_1299[] class_1299Array = new class_1299[0x29 & 0x7F];
        class_1299Array[2 & 5] = class_1299.PLAYER;
        class_1299Array[2 ^ 3] = class_1299.BLAZE;
        class_1299Array[5 >> 1] = class_1299.HUSK;
        class_1299Array[--3] = class_1299.WIND_CHARGE;
        class_1299Array[--4] = class_1299.CAVE_SPIDER;
        class_1299Array[--5] = class_1299.CREEPER;
        class_1299Array[0x26 & 0x5F] = class_1299.DROWNED;
        class_1299Array[0x3F & 0x47] = class_1299.ELDER_GUARDIAN;
        class_1299Array[0x4C & 0x3B] = class_1299.ENDER_DRAGON;
        class_1299Array[0x4D & 0x3B] = class_1299.ENDERMAN;
        class_1299Array[0x7A & 0xF] = class_1299.ENDERMITE;
        class_1299Array[0xB & 0x7F] = class_1299.EVOKER;
        class_1299Array[0x1D & 0x6E] = class_1299.GHAST;
        class_1299Array[0x5F & 0x2D] = class_1299.GIANT;
        class_1299Array[0x1E & 0x6F] = class_1299.GUARDIAN;
        class_1299Array[0x5F & 0x2F] = class_1299.HOGLIN;
        class_1299Array[0x73 & 0x1C] = class_1299.HUSK;
        class_1299Array[0x73 & 0x1D] = class_1299.ILLUSIONER;
        class_1299Array[0x53 & 0x3E] = class_1299.MAGMA_CUBE;
        class_1299Array[0x7B & 0x17] = class_1299.PHANTOM;
        class_1299Array[0x5D & 0x36] = class_1299.PIGLIN;
        class_1299Array[0x35 & 0x5F] = class_1299.PIGLIN_BRUTE;
        class_1299Array[0x17 & 0x7E] = class_1299.PILLAGER;
        class_1299Array[0x1F & 0x77] = class_1299.RAVAGER;
        class_1299Array[0x5A & 0x3D] = class_1299.SHULKER;
        class_1299Array[0x1B & 0x7D] = class_1299.SILVERFISH;
        class_1299Array[0x5A & 0x3F] = class_1299.SKELETON;
        class_1299Array[0x7F & 0x1B] = class_1299.SLIME;
        class_1299Array[0x3E & 0x5D] = class_1299.SPIDER;
        class_1299Array[0x1F & 0x7D] = class_1299.STRAY;
        class_1299Array[0x3F & 0x5E] = class_1299.VEX;
        class_1299Array[0x5F & 0x3F] = class_1299.VINDICATOR;
        class_1299Array[0x3B & 0x64] = class_1299.WARDEN;
        class_1299Array[0x63 & 0x3D] = class_1299.WITCH;
        class_1299Array[0x73 & 0x2E] = class_1299.WITHER;
        class_1299Array[0x27 & 0x7B] = class_1299.WITHER_SKELETON;
        class_1299Array[0x34 & 0x6F] = class_1299.ZOMBIE;
        class_1299Array[37] = class_1299.ZOMBIFIED_PIGLIN;
        class_1299Array[38] = class_1299.ZOGLIN;
        class_1299Array[39] = class_1299.FIREBALL;
        class_1299Array[40] = class_1299.SHULKER_BULLET;
        this.iiIIiiIiii = this.IiIiiiiIIi.add((Setting)((EntityTypeListSetting.Builder)((EntityTypeListSetting.Builder)new EntityTypeListSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u5bb4\u4f1c\u7c1b\u578e"))).description(iiIIiIiIII.ALLATORIxDEMO("\u89b1\u656e\u51cc\u76d6\u5bb4\u4f1c\u7c1b\u578e"))).onlyAttackable().defaultValue(class_1299Array).build());
        this.iIiiIiiiII = this.IiIiiiiIIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u4f57\u5128\u7ea2"))).description(iiIIiIiIII.ALLATORIxDEMO("\u8334\u56a6\u51b5\u76bb\u6830\u76d6\u7b71\u9046\u65d9\u5f0a"))).defaultValue((Object)SortPriority.ClosestAngle)).build());
        this.iIiIiIiIii = this.IiIiiiiIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u6752\u590d\u76a1\u6867\u6575"))).description(iiIIiIiIII.ALLATORIxDEMO("\u545e\u65c6\u9554\u5bad\u76d6\u5bb4\u4f1c\u6510\u91ca"))).defaultValue((Object)(4 ^ 5))).min(3 >> 1).sliderRange(5 >> 2, --5).visible(() -> {
            if (!((Boolean)this.IIIiIiiIIi.get()).booleanValue()) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.IIiIiiIiIi = this.IiIiiiiIIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u6511\u51b4\u8363\u56f1"))).description(iiIIiIiIII.ALLATORIxDEMO("\u53d8\u6569\u51cb\u5bcb\u4f64\u76d6\u672a\u5968\u8dbd\u79be"))).defaultValue(3.1).min(3.0).sliderMax(7.0).build());
        this.IiiIIiIiIi = this.IiIiiiiIIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u7a55\u58d6\u8363\u56f1"))).description(iiIIiIiIII.ALLATORIxDEMO("\u538d\u7a78\u58ae\u6569\u51cb\u5bcb\u4f64\u76d6\u672a\u5968\u8dbd\u79be"))).defaultValue(4.5).min(2.0).sliderMax(7.0).build());
        this.iiIIiiIiIi = this.IiIiiiiIIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u7528\u723b\u5e5e\u9fcb\u8fa7\u6ee1"))).description(iiIIiIiIII.ALLATORIxDEMO("\u51a4\u5be8\u8996\u6549\u51ec\u76f6\u7528\u723b\u5e16\u9f83\uff3f\u5e2e\u5e44\u3054\u6227\u5e26\u623c\u5127\u9088\uff0c"))).defaultValue((Object)KillAuraMiku.EntityAge.iiiiiIIiiI)).build());
        this.iiiiiIIiiI = this.IiIiiiiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u5fca\u7537\u5457\u5442\u757f\u726c"))).description(iiIIiIiIII.ALLATORIxDEMO("\u6618\u5474\u6559\u51fc\u62d2\u675b\u81da\u5bcf\u4e7e\u545f\u79da\u76cb\u757f\u726c"))).defaultValue((Object)(5 >> 2))).build());
        this.ALLATORIxDEMO = this.IiIiiiiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u5fca\u7537\u8881\u52e7\u757f\u726c"))).description(iiIIiIiIII.ALLATORIxDEMO("\u4eb7\u571f\u88f9\u529f\u57d9\u7508\u721b\u4e2c\u52da\u652c\u5189\u4f77\u6584\u627a\u8f89\u882e\u53ca\u51cc|\u59b2\u737f\u4e8d\u3053\u5c25\u9e9e\u3061\u72f9"))).defaultValue((Object)(--1 != 0))).build());
        this.iIiiIiiiii = this.IiIiiiiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u5fca\u7537\u9a45\u6742\u757f\u726c"))).description(iiIIiIiIII.ALLATORIxDEMO("\u9048\u511f\u650b\u51ae\u4f57\u9a3d\u6727\u76cb\u757f\u726c"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.IiiIIIiiIi = this.IiIIIIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u5333\u9855\u65b9\u66e2\u5059"))).description(iiIIiIiIII.ALLATORIxDEMO("\u673a\u52f3\u5658\u5334\u9848\u65a4\u66a8\u5013\u655b\u51fe"))).defaultValue((Object)(--1 != 0))).build());
        this.iiIIiIiiII = this.IiIIIIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u4f2a\u751f\u723b\u54eb\u65b9\u66e2\u5059"))).description(iiIIiIiIII.ALLATORIxDEMO("\u4f48\u757a\u7259\u5494\u65c1\u4e5f\u8ff1\u8803\u655b\u51fe"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iIIiIIiiII = this.IiIIIIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u6c61\u6641\u511b\u7385\u65b9\u66e2\u5059"))).description(iiIIiIiIII.ALLATORIxDEMO("\u6c56\u6671\u517e\u73fd\u650e\u7f3b\u65c1\u4e5f\u8ff1\u8803\u655b\u51fe"))).defaultValue((Object)(5 >> 2))).build());
        this.iiiiiIIIii = this.IiIIIIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u0006z\u001c\u546c\u6b60"))).description(iiIIiIiIII.ALLATORIxDEMO("\u5c0a\u8ba7\u5c11\u6549\u51cc\u5ea4\u8fbd\u4e09\u673a\u52f3\u5658uc\u0002yo\u546c\u6b60"))).defaultValue((Object)(--1 != 0))).build());
        this.IIiiIiiiII = this.IiIIIIiiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u81b8\u5bb0\u4e06\u5e96\u8fda"))).description(iiIIiIiIII.ALLATORIxDEMO("\u4f0d\u751f\u81b8\u5bf8\u4e4e\u5ec1\u8f8d\u803c\u970b\u53a8\u721a\u519d\u533b\u6596\u95f1"))).defaultValue((Object)(3 >> 2))).build());
        this.IIiiiiiiII = this.IiIIIIiiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u6511\u51b4\u5e96\u8fda"))).description(iiIIiIiIII.ALLATORIxDEMO("\u650c\u51a9\u5bfc\u4f54\u76b3\u904d\u5e96\uff5d\u4ed2\u5269\u4e10\u531a\u4f2d\uff0c"))).defaultValue((Object)13)).min(5 >> 3).sliderMax(60).visible(() -> this.IIiiIiiiII.get())).build());
        this.IIIIiIiiIi = this.IiIIIIiiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIiIiIII.ALLATORIxDEMO("\u522d\u632d\u5e96\u8fda"))).description(iiIIiIiIII.ALLATORIxDEMO("\u5275\u6375\u5f99\u6340\u685d\u546c\u7b4e\u5fb2\u5948\u5c21\u526e\u627a\u80af\u6511\u51b4\u5bfe\u4f56"))).defaultValue((Object)(3 >> 2))).min(3 ^ 3).sliderMax(10).build());
        IIIiiIIIIi iIIiiIIIIi2 = this;
        IIIiiIIIIi iIIiiIIIIi3 = this;
        iIIiiIIIIi2.iIiIiiIiiI = new ArrayList<class_1297>();
        iIIiiIIIIi2.IIIiIIIiII = 3 >> 2;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIIiIiIII.ALLATORIxDEMO("g>r\u0013d\u00177\u0007g\u0016V&\u0007&\u0017\u8ba5\u66c4\u65e5\u5207\u6752\u659a\u7207\u674c\uff04"));
        }
    }

    public String getInfoString() {
        if (!this.iIiIiiIiiI.isEmpty()) {
            return EntityUtils.getName((class_1297)this.ALLATORIxDEMO());
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private /* synthetic */ boolean IiiIIIIiiI() {
        IIIiiIIIIi iIIiiIIIIi;
        IIIiiIIIIi iIIiiIIIIi2 = iIIiiIIIIi = iIIiiIIIIi3;
        IIIiiIIIIi iIIiiIIIIi3 = iIIiiIIIIi2.iiIIIIiIII.player.getMainHandStack().getItem();
        if (iIIiiIIIIi2.IiiiiiiIIi()) {
            return iIIiiIIIIi3 instanceof class_1743;
        }
        switch (((KillAuraMiku.Weapon)((Object)iIIiiIIIIi.iIIiiIIIII.get())).ordinal()) {
            case 1: {
                return iIIiiIIIIi3 instanceof class_1743;
            }
            case 0: {
                return iiIIIIiiIi.IiiIIIIiiI((class_1792)iIIiiIIIIi3);
            }
            case 2: {
                return iIIiiIIIIi3 instanceof class_9362;
            }
            case 3: {
                return iIIiiIIIIi3 instanceof class_1835;
            }
            case 4: {
                if (iIIiiIIIIi3 instanceof class_1743) return true;
                if (iiIIIIiiIi.IiiIIIIiiI((class_1792)iIIiiIIIIi3)) return true;
                if (iIIiiIIIIi3 instanceof class_9362) return true;
                if (!(iIIiiIIIIi3 instanceof class_1835)) return false;
                return true;
            }
        }
        return true;
    }

    private /* synthetic */ boolean IiiiiiiIIi() {
        return (2 & 5) != 0;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IIIiiIIIIi iIIiiIIIIi;
        class_1297 IiIIiIiiiI2;
        IIIiiIIIIi iIIiiIIIIi2 = object;
        if (!iIIiiIIIIi2.iiIIIIiIII.player.isAlive() || PlayerUtils.getGameMode() == class_1934.SPECTATOR) {
            return;
        }
        if (((Boolean)iIIiiIIIIi2.iiIIiIiiII.get()).booleanValue() && (iIIiiIIIIi2.iiIIIIiIII.interactionManager.isBreakingBlock() || iIIiiIIIIi2.iiIIIIiIII.player.isUsingItem())) {
            return;
        }
        if (((Boolean)iIIiiIIIIi2.iiiIiIiIIi.get()).booleanValue() && !iIIiiIIIIi2.iiIIIIiIII.options.attackKey.isPressed()) {
            return;
        }
        if (TickRate.INSTANCE.getTimeSinceLastTick() >= 1.0f && ((Boolean)iIIiiIIIIi2.IiiIIIiiIi.get()).booleanValue()) {
            return;
        }
        if (((Boolean)iIIiiIIIIi2.iIIiIIiiII.get()).booleanValue() && ((CrystalAura)Modules.get().get(CrystalAura.class)).isActive() && ((CrystalAura)Modules.get().get(CrystalAura.class)).kaTimer > 0) {
            return;
        }
        if (((Boolean)iIIiiIIIIi2.IIIiIiiIIi.get()).booleanValue()) {
            IiIIiIiiiI2 = iIIiiIIIIi2.iiIIIIiIII.targetedEntity;
            if (IiIIiIiiiI2 == null) {
                return;
            }
            if (!iIIiiIIIIi2.ALLATORIxDEMO(IiIIiIiiiI2)) {
                return;
            }
            IIIiiIIIIi iIIiiIIIIi3 = iIIiiIIIIi2;
            iIIiiIIIIi = iIIiiIIIIi3;
            iIIiiIIIIi3.iIiIiiIiiI.clear();
            iIIiiIIIIi3.iIiIiiIiiI.add(iIIiiIIIIi2.iiIIIIiIII.targetedEntity);
        } else {
            IIIiiIIIIi iIIiiIIIIi4 = iIIiiIIIIi2;
            iIIiiIIIIi4.iIiIiiIiiI.clear();
            TargetUtils.getList(iIIiiIIIIi4.iIiIiiIiiI, class_12972 -> {
                class_1309 class_13092;
                IIIiiIIIIi iIIiiIIIIi = iIIiiIIIIi2;
                IIIiiIIIIi iIIiiIIIIi2 = class_12972;
                IIIiiIIIIi IiIIiIiiiI = iIIiiIIIIi;
                if (iIIiiIIIIi2.equals(IiIIiIiiiI.iiIIIIiIII.player)) return false;
                if (iIIiiIIIIi2.equals(IiIIiIiiiI.iiIIIIiIII.cameraEntity)) {
                    return false;
                }
                if (iIIiiIIIIi2 instanceof class_1309) {
                    class_13092 = (class_1309)iIIiiIIIIi2;
                    if (class_13092.isDead()) return false;
                }
                if (!iIIiiIIIIi2.isAlive()) {
                    return false;
                }
                class_13092 = iIIiiIIIIi2.getBoundingBox();
                if (!PlayerUtils.isWithin((double)class_3532.clamp((double)IiIIiIiiiI.iiIIIIiIII.player.getX(), (double)class_13092.minX, (double)class_13092.maxX), (double)class_3532.clamp((double)IiIIiIiiiI.iiIIIIiIII.player.getY(), (double)class_13092.minY, (double)class_13092.maxY), (double)class_3532.clamp((double)IiIIiIiiiI.iiIIIIiIII.player.getZ(), (double)class_13092.minZ, (double)class_13092.maxZ), (double)((Double)IiIIiIiiiI.IIiIiiIiIi.get()))) {
                    return 3 >> 2;
                }
                if (!((Set)IiIIiIiiiI.iiIIiiIiii.get()).contains(iIIiiIIIIi2.getType())) {
                    return (2 & 5) != 0;
                }
                if (((Boolean)IiIIiIiiiI.iiiiiIIiiI.get()).booleanValue() && iIIiiIIIIi2.hasCustomName()) {
                    return (2 & 5) != 0;
                }
                if (!PlayerUtils.canSeeEntity((class_1297)iIIiiIIIIi2) && !PlayerUtils.isWithin((class_1297)iIIiiIIIIi2, (double)((Double)IiIIiIiiiI.IiiIIiIiIi.get()))) {
                    return 5 >> 3;
                }
                if (((Boolean)IiIIiIiiiI.iIiiIiiiii.get()).booleanValue()) {
                    // empty if block
                }
                if (((Boolean)IiIIiIiiiI.ALLATORIxDEMO.get()).booleanValue()) {
                    if (iIIiiIIIIi2 instanceof class_1560 && !(class_13092 = (class_1560)iIIiiIIIIi2).isAngry()) {
                        return (2 & 5) != 0;
                    }
                    if (iIIiiIIIIi2 instanceof class_1590 && !(class_13092 = (class_1590)iIIiiIIIIi2).isAttacking()) {
                        return (3 & 4) != 0;
                    }
                    if (iIIiiIIIIi2 instanceof class_1493 && !(class_13092 = (class_1493)iIIiiIIIIi2).isAttacking()) {
                        return (2 & 5) != 0;
                    }
                }
                if (iIIiiIIIIi2 instanceof class_1657) {
                    class_13092 = (class_1657)iIIiiIIIIi2;
                    if (class_13092.isCreative()) {
                        return 3 >> 2;
                    }
                    if (!Friends.get().shouldAttack((class_1657)class_13092)) {
                        return (2 & 5) != 0;
                    }
                }
                if (!(iIIiiIIIIi2 instanceof class_1429)) return true;
                class_13092 = (class_1429)iIIiiIIIIi2;
                switch (((KillAuraMiku.EntityAge)((Object)((Object)IiIIiIiiiI.iiIIiiIiIi.get()))).ordinal()) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case 0: {
                        return class_13092.isBaby();
                    }
                    case 1: {
                        if (class_13092.isBaby()) return false;
                        return 5 >> 2;
                    }
                    case 2: 
                }
                return true;
            }, (SortPriority)((SortPriority)iIIiiIIIIi2.iIiiIiiiII.get()), (int)((Integer)iIIiiIIIIi2.iIiIiIiIii.get()));
            iIIiiIIIIi = iIIiiIIIIi2;
        }
        if (iIIiiIIIIi.iIiIiiIiiI.isEmpty()) {
            iIIiiIIIIi2.IiIIiIiiiI = 3 & 4;
            if (iIIiiIIIIi2.IIIiIIIiII) {
                PathManagers.get().resume();
                iIIiiIIIIi2.IIIiIIIiII = 2 & 5;
            }
            return;
        }
        IiIIiIiiiI2 = iIIiiIIIIi2.iIiIiiIiiI.getFirst();
        if (((Boolean)iIIiiIIIIi2.IIiiiIIIIi.get()).booleanValue()) {
            FindItemResult findItemResult;
            Predicate<class_1799> predicate;
            switch (((KillAuraMiku.Weapon)((Object)iIIiiIIIIi2.iIIiiIIIII.get())).ordinal()) {
                case 1: {
                    predicate = IiIIiIiiiI -> IiIIiIiiiI.getItem() instanceof class_1743;
                    break;
                }
                case 0: {
                    predicate = IiIIiIiiiI -> iiIIIIiiIi.IiiIIIIiiI(IiIIiIiiiI.getItem());
                    while (false) {
                    }
                    break;
                }
                case 2: {
                    predicate = IiIIiIiiiI -> IiIIiIiiiI.getItem() instanceof class_9362;
                    break;
                }
                case 3: {
                    predicate = IiIIiIiiiI -> IiIIiIiiiI.getItem() instanceof class_1835;
                    break;
                }
                case 4: {
                    predicate = IiIIiIiiiI -> {
                        if (IiIIiIiiiI.getItem() instanceof class_1743 || iiIIIIiiIi.IiiIIIIiiI(IiIIiIiiiI.getItem()) || IiIIiIiiiI.getItem() instanceof class_9362 || IiIIiIiiiI.getItem() instanceof class_1835) {
                            return true;
                        }
                        return false;
                    };
                    break;
                }
                default: {
                    predicate = class_17992 -> --1 != 0;
                }
            }
            Object object = predicate;
            object = InvUtils.findInHotbar((Predicate)object);
            if (iIIiiIIIIi2.IiiiiiiIIi() && (findItemResult = InvUtils.findInHotbar(IiIIiIiiiI -> IiIIiIiiiI.getItem() instanceof class_1743)).found()) {
                object = findItemResult;
            }
            InvUtils.swap((int)object.slot(), (3 ^ 3) != 0);
        }
        if (!iIIiiIIIIi2.IiiIIIIiiI()) {
            return;
        }
        iIIiiIIIIi2.IiIIiIiiiI = 2 ^ 3;
        if (iIIiiIIIIi2.IIiIIiIIii.get() == KillAuraMiku.RotationMode.IiIiIIIIiI) {
            Rotations.rotate((double)Rotations.getYaw((class_1297)IiIIiIiiiI2), (double)Rotations.getPitch((class_1297)IiIIiIiiiI2, (Target)Target.Body));
        }
        if (((Boolean)iIIiiIIIIi2.IiiIIiiiiI.get()).booleanValue() && PathManagers.get().isPathing() && !iIIiiIIIIi2.IIIiIIIiII) {
            PathManagers.get().pause();
            iIIiiIIIIi2.IIIiIIIiII = 3 & 5;
        }
        if (iIIiiIIIIi2.iIIiiiIiiI()) {
            iIIiiIIIIi2.iIiIiiIiiI.forEach(class_12972 -> {
                IIIiiIIIIi iIIiiIIIIi = iIIiiIIIIi2;
                IIIiiIIIIi iIIiiIIIIi2 = class_12972;
                IIIiiIIIIi IiIIiIiiiI = iIIiiIIIIi;
                if (((Boolean)IiIIiIiiiI.IiIiIIIIiI.get()).booleanValue()) {
                    if (IiIIiIiiiI.iiIIIIiIII.player.isSneaking()) {
                        IiiiIiiIII.IiiiiiiIIi();
                    }
                    if (IiIIiIiiiI.iiIIIIiIII.player.isSprinting()) {
                        IiIIiIiiiI.iiIIIIiIII.getNetworkHandler().sendPacket((class_2596)new class_2848((class_1297)IiIIiIiiiI.iiIIIIiIII.player, class_2848.class_2849.STOP_SPRINTING));
                    }
                }
                IIIiiIIIIi iIIiiIIIIi3 = iIIiiIIIIi2;
                Object object = iIIiiIIIIi3.getPos();
                class_243 class_2433 = object.add(0.0, (double)(iIIiiIIIIi2.getHeight() / 2.0f), 0.0);
                class_243 class_2434 = iIIiiIIIIi3.getEyePos();
                class_243[] class_243Array = new class_243[--3];
                class_243Array[3 ^ 3] = object;
                class_243Array[--1] = class_2433;
                class_243Array[1 ^ 3] = class_2434;
                object = Stream.of(class_243Array).min(Comparator.comparing(class_2432 -> {
                    IIIiiIIIIi iIIiiIIIIi = iIIiiIIIIi2;
                    IIIiiIIIIi iIIiiIIIIi2 = class_2432;
                    IIIiiIIIIi IiIIiIiiiI = iIIiiIIIIi;
                    return IiIIiIiiiI.iiIIIIiIII.player.getEyePos().squaredDistanceTo((class_243)iIIiiIIIIi2);
                })).orElse(class_2434);
                object = new IiiiIIiiiI((class_243)object).ALLATORIxDEMO(0x4E & 0x3B);
                new IiiiIIiiiI((float)Rotations.getYaw((class_1297)iIIiiIIIIi2), (float)Rotations.getPitch((class_1297)iIIiiIIIIi2, (Target)Target.Body));
                iIiIiIiIIi.ALLATORIxDEMO().ALLATORIxDEMO((IiiiIIiiiI)object);
                IIIiiIIIIi iIIiiIIIIi4 = IiIIiIiiiI;
                IiIIiIiiiI.iiIIIIiIII.interactionManager.attackEntity((class_1657)iIIiiIIIIi4.iiIIIIiIII.player, (class_1297)iIIiiIIIIi2);
                iIIiiIIIIi4.iiIIIIiIII.player.swingHand(class_1268.MAIN_HAND);
                IIIiiIIIIi iIIiiIIIIi5 = IiIIiIiiiI;
                if (((Boolean)IiIIiIiiiI.iiiiIiiIIi.get()).booleanValue()) {
                    iIIiiIIIIi5.iiIIIIiIII.getNetworkHandler().sendPacket((class_2596)class_2824.attack((class_1297)iIIiiIIIIi2, (boolean)IiIIiIiiiI.iiIIIIiIII.player.isSneaking()));
                    IIIiiIIIIi iIIiiIIIIi6 = IiIIiIiiiI;
                    v6 = iIIiiIIIIi6;
                    iIIiiIIIIi6.iiIIIIiIII.player.swingHand(class_1268.MAIN_HAND);
                } else {
                    iIIiiIIIIi5.iiIIIIiIII.interactionManager.attackEntity((class_1657)IiIIiIiiiI.iiIIIIiIII.player, (class_1297)iIIiiIIIIi2);
                    IIIiiIIIIi iIIiiIIIIi7 = IiIIiIiiiI;
                    v6 = iIIiiIIIIi7;
                    iIIiiIIIIi7.iiIIIIiIII.player.swingHand(class_1268.MAIN_HAND);
                }
                v6.iiIiIIiIIi = 0;
                if (IiIIiIiiiI.IIiIIiIIii.get() == KillAuraMiku.RotationMode.ALLATORIxDEMO) {
                    iIiIiIiIIi.ALLATORIxDEMO().ALLATORIxDEMO();
                }
            });
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Send send) {
        IIIiiIIIIi iIIiiIIIIi = iIIiiIIIIi2;
        IIIiiIIIIi iIIiiIIIIi2 = send;
        IIIiiIIIIi IiIIiIiiiI = iIIiiIIIIi;
        if (((PacketEvent.Send)iIIiiIIIIi2).packet instanceof class_2868) {
            IiIIiIiiiI.iiIIiIiiIi = (Integer)IiIIiIiiiI.IIIIiIiiIi.get();
        }
    }

    public class_1297 ALLATORIxDEMO() {
        if (!this.iIiIiiIiiI.isEmpty()) {
            return this.iIiIiiIiiI.getFirst();
        }
        return null;
    }
}

