/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.EntityAddedEvent
 *  meteordevelopment.meteorclient.events.entity.EntityRemovedEvent
 *  meteordevelopment.meteorclient.events.game.ReceiveMessageEvent
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Send
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BlockListSetting$Builder
 *  meteordevelopment.meteorclient.settings.BlockPosSetting$Builder
 *  meteordevelopment.meteorclient.settings.BlockSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorListSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnchantmentListSetting$Builder
 *  meteordevelopment.meteorclient.settings.EntityTypeListSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.ItemListSetting$Builder
 *  meteordevelopment.meteorclient.settings.ItemSetting$Builder
 *  meteordevelopment.meteorclient.settings.KeybindSetting$Builder
 *  meteordevelopment.meteorclient.settings.PacketListSetting$Builder
 *  meteordevelopment.meteorclient.settings.ParticleTypeListSetting$Builder
 *  meteordevelopment.meteorclient.settings.PotionSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.SoundEventListSetting$Builder
 *  meteordevelopment.meteorclient.settings.StatusEffectListSetting$Builder
 *  meteordevelopment.meteorclient.settings.StorageBlockListSetting$Builder
 *  meteordevelopment.meteorclient.settings.StringListSetting$Builder
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.meteorclient.settings.Vector3dSetting$Builder
 *  meteordevelopment.meteorclient.systems.modules.Category
 *  meteordevelopment.meteorclient.utils.misc.Keybind
 *  meteordevelopment.meteorclient.utils.misc.MyPotion
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityType
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.particle.ParticleType
 *  net.minecraft.particle.ParticleTypes
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.entity.BlockEntityType
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.ButtonClickC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket
 *  net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.network.packet.c2s.play.HandSwingC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.network.packet.c2s.play.SlotChangedStateC2SPacket
 *  org.joml.Vector3d
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIIiiii;
import com.github.mikumiku.addon.IIiIIIiIii;
import com.github.mikumiku.addon.IIiIiiiIII;
import com.github.mikumiku.addon.IiiIIIiiII;
import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiIiiiIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.iiiiIiiiII;
import com.github.mikumiku.addon.util.DebugModule;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import meteordevelopment.meteorclient.events.entity.EntityAddedEvent;
import meteordevelopment.meteorclient.events.entity.EntityRemovedEvent;
import meteordevelopment.meteorclient.events.game.ReceiveMessageEvent;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BlockListSetting;
import meteordevelopment.meteorclient.settings.BlockPosSetting;
import meteordevelopment.meteorclient.settings.BlockSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorListSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnchantmentListSetting;
import meteordevelopment.meteorclient.settings.EntityTypeListSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.ItemListSetting;
import meteordevelopment.meteorclient.settings.ItemSetting;
import meteordevelopment.meteorclient.settings.KeybindSetting;
import meteordevelopment.meteorclient.settings.PacketListSetting;
import meteordevelopment.meteorclient.settings.ParticleTypeListSetting;
import meteordevelopment.meteorclient.settings.PotionSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.SoundEventListSetting;
import meteordevelopment.meteorclient.settings.StatusEffectListSetting;
import meteordevelopment.meteorclient.settings.StorageBlockListSetting;
import meteordevelopment.meteorclient.settings.StringListSetting;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.meteorclient.settings.Vector3dSetting;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.utils.misc.Keybind;
import meteordevelopment.meteorclient.utils.misc.MyPotion;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ButtonClickC2SPacket;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.registry.RegistryKey;
import net.minecraft.network.packet.c2s.play.SlotChangedStateC2SPacket;
import org.joml.Vector3d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiiiIiiii
extends iiiiIiIiii {
    private final Setting<Boolean> iiiIiiIIII;
    private final Setting<Boolean> iIIiiiIiII;
    private final Setting<Keybind> iIiIiiiiII;
    private final SettingGroup IiIIiiIiii;
    private final Setting<List<SettingColor>> IiiiiIIiiI;
    private final SettingGroup iIiiIIIIii;
    private final Setting<Set<Class<? extends class_2596<?>>>> IIIIiIiIIi;
    private final Setting<Vector3d> IiiiiIIIIi;
    private int iiIiIiIiiI;
    private final Setting<List<class_1792>> IiiIiIIIiI;
    private final Setting<MyPotion> IiIiiIIiii;
    private final Setting<Map<String, List<class_1792>>> iIiIiIIiiI;
    private final SettingGroup IIIiIIiiIi;
    private final Setting<List<class_2248>> IiIiiIIiiI;
    private final Setting<class_2248> iIIIIiiiii;
    private final DecimalFormat IiIiIIIiiI;
    private final List<class_1297> iIIIIiiiIi;
    private final Setting<Double> iiIIiiIiIi;
    private final Setting<String> IiiIIiIiIi;
    private final Setting<Set<Class<? extends class_2596<?>>>> iiiiIiiIIi;
    private final Setting<List<class_3414>> iiIIiIiiIi;
    private final class_310 iiIIIIiIII;
    private final Setting<DebugModule.TestEnum> IiIiiiiIIi;
    private int iiIIiIiiII;
    private final Setting<class_2338> IIiIiiIiIi;
    private final Setting<Set<class_5321<class_1887>>> IIiIIiIIii;
    private int iIiiIiiiii;
    private final Setting<List<class_2396<?>>> iIiIiiIiiI;
    private final Setting<List<class_1291>> IIiiiiiiII;
    private final Setting<Integer> IIiiiIIIIi;
    private final Setting<List<String>> IIIiIIIiII;
    private final Setting<List<class_2338>> iiIiIiiiiI;
    private final SettingGroup IIiiIiiiII;
    private final Setting<Boolean> IIIiIiiIIi;
    private final Setting<Boolean> iiiIiIiIIi;
    private final SettingGroup iIiIiIiIii;
    private int iiiiiIIIii;
    private final Setting<Integer> iIIiIIiiII;
    private final SettingGroup IiiIIiiiiI;
    private final Setting<class_1792> IiIIIIiiii;
    private final Setting<Map<String, String>> IiiIIIiiIi;
    private final Setting<Boolean> iiIIiiIiii;
    private final Setting<String> iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private final Setting<Set<class_1299<?>>> iiIiIIiIIi;
    private final Setting<List<class_2591<?>>> IIIIiIiiIi;
    private final SettingGroup IiIiIIIIiI;
    private final Setting<Double> iiiiiIIiiI;
    private final Setting<String> iiIIIIiIII;
    public final Setting<Boolean> IiIIiIiiiI;
    private final Setting<SettingColor> ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent object) {
        IiiiiIiiii iiiiiIiiii = iiiiiIiiii2;
        IiiiiIiiii iiiiiIiiii2 = object;
        object = iiiiiIiiii;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(ReceiveMessageEvent object) {
        IiiiiIiiii iiiiiIiiii = iiiiiIiiii2;
        IiiiiIiiii iiiiiIiiii2 = object;
        object = iiiiiIiiii;
    }

    @Override
    public void onActivate() {
        IiiiiIiiii iiiiiIiiii = this;
        super.onActivate();
        iiiiiIiiii.iiIiIiIiiI = 3 >> 2;
        iiiiiIiiii.iIIIIiiiIi.clear();
        this.iiiiiIIIii = iiiiiIiiii.iiIiIiIiiI;
        this.iIiiIiiiii = 3 ^ 3;
        this.iiIIiIiiII = this.iIiiIiiiii;
        iiiiIiiiII.ALLATORIxDEMO(IIiIIIiIii.ALLATORIxDEMO("\u00a4%X\u8c47\u8bd6\u6a65\u57549\u0003\u6534\u636d\u5341\u8ffe\u8e6e\u5df1\u6f84\u6d38"));
        if (((Boolean)this.IiIIiIiiiI.get()).booleanValue()) {
            iiIIIIiiIi.IiiiiiiIIi();
            this.IiIIiIiiiI.set((Object)((3 & 4) != 0));
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(EntityAddedEvent object) {
        IiiiiIiiii iiiiiIiiii = iiiiiIiiii2;
        IiiiiIiiii iiiiiIiiii2 = object;
        object = iiiiiIiiii;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        IiiiiIiiii IiIIiIiiiI;
        IiiiiIiiii iiiiiIiiii = iiiiiIiiii2;
        IiiiiIiiii iiiiiIiiii2 = post;
        IiiiiIiiii iiiiiIiiii3 = IiIIiIiiiI = iiiiiIiiii;
        iiiiiIiiii3.iiIiIiIiiI += 2 ^ 3;
        if (iiiiiIiiii3.iiIiIiIiiI % (0x6E & 0x75) == 0 && ((Boolean)IiIIiIiiiI.iIIiiIIIII.get()).booleanValue() && IiIIiIiiiI.iiiiiIIIii > 0) {
            Object[] objectArray = new Object[--3];
            objectArray[3 >> 2] = IiIIiIiiiI.iiiiiIIIii;
            objectArray[3 & 5] = IiIIiIiiiI.iIiiIiiiii;
            objectArray[1 ^ 3] = IiIIiIiiiI.iiIIiIiiII;
            iiiiIiiiII.ALLATORIxDEMO(String.format(IiiIIIiiII.IiiiiiiIIi("\u00acqP\u6563\u6365\u5316\u7ed4\u8bb2~\u001b\u6015\u8b97\u0014\u0016\u0006_\u0016R\r\u6390\u6506\u0012\u000b\u0016~\"Z\u001e\u53f6\u903e\u0015\u0017\bQ"), objectArray));
        }
    }

    private static /* synthetic */ String ALLATORIxDEMO(Int2ObjectMap<class_1799> int2ObjectMap) {
        Object IiIIiIiiiI;
        Int2ObjectMap<class_1799> int2ObjectMap2 = int2ObjectMap;
        if (int2ObjectMap2 == null || int2ObjectMap2.isEmpty()) {
            return IiiIIIiiII.IiiiiiiIIi("\u65d7\u4fc3\u650c");
        }
        Object object = IiIIiIiiiI = new StringBuilder();
        ((StringBuilder)object).append(IIiIIIiIii.ALLATORIxDEMO("\u4faa\u653a\u69b9\u4f4e~\t"));
        int2ObjectMap2.forEach((arg_0, arg_1) -> IiiiiIiiii.ALLATORIxDEMO((StringBuilder)object, arg_0, arg_1));
        return ((StringBuilder)IiIIiIiiiI).toString();
    }

    public IiiiiIiiii() {
        IiiiiIiiii iiiiiIiiii = this;
        super((Category)IiIIiIiiiI, IIiIIIiIii.ALLATORIxDEMO("G!a1d"), IiiIIIiiII.IiiiiiiIIi("\u590e\u5294\u80ee\u8c15\u8bdb\u6a7d\u5713"));
        iiiiiIiiii.IiIIiiIiii = iiiiiIiiii.settings.getDefaultGroup();
        iiiiiIiiii.IiIiIIIIiI = iiiiiIiiii.settings.createGroup(IIiIIIiIii.ALLATORIxDEMO("\u667a\u7939\u8bfa\u7f6d"));
        iiiiiIiiii.IIIiIIiiIi = iiiiiIiiii.settings.createGroup(IiiIIIiiII.IiiiiiiIIi("\u8feb\u8e24\u8be2\u7f2a"));
        iiiiiIiiii.IiiIIiiiiI = iiiiiIiiii.settings.createGroup(IIiIIIiIii.ALLATORIxDEMO("\u6063\u80fe\u7695\u63a4"));
        iiiiiIiiii.IIiiIiiiII = iiiiiIiiii.settings.createGroup(IiiIIIiiII.IiiiiiiIIi("\u8ba8\u7f60\u5c09\u797e"));
        iiiiiIiiii.IiIIiIiiiI = iiiiiIiiii.IiIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u6217\u5373\u5ed7\u5b5b"))).description(IiiIIIiiII.IiiiiiiIIi("\u6245\u537e\u5ecf\u5b1c"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.IiiIIIiiIi = this.IiIiIIIIiI.add((Setting)((IIIiIIiiii)((Object)((IIIiIIiiii)((Object)new IIIiIIiiii().name(IIiIIIiIii.ALLATORIxDEMO("N%s")))).description(IiiIIIiiII.IiiiiiiIIi("C=4")))).ALLATORIxDEMO());
        this.iIiIiIIiiI = this.IiIiIIIIiI.add((Setting)((iiIiiiIiiI)((Object)((iiIiiiIiiI)((Object)new iiIiiiIiiI().name(IIiIIIiIii.ALLATORIxDEMO("\rw!n\bj7w)B4P!w0j*d")))).description(IiiIIIiiII.IiiiiiiIIi("Bgn~Gz-2Fr|Gngbg2#")))).ALLATORIxDEMO());
        this.iiIiIiiiiI = this.IiIiIIIIiI.add((Setting)((IIiIiiiIII)((Object)((IIiIiiiIII)((Object)new IIiIiiiIII().name(IIiIIIiIii.ALLATORIxDEMO("a(l'h\u0014l7O\rP0P!w0j*d")))).description(IiiIIIiiII.IiiiiiiIIi("Qg|hx[|-\nb`xGngbg2#")))).ALLATORIxDEMO());
        this.iiIIiiIiii = this.IIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("A\u000bL(P!w0j*d"))).description(IiiIIIiiII.IiiiiiiIIi("\u5e17\u5c1f\u502f\u8ba8\u7f60\u7966\u4fcf"))).defaultValue((Object)(3 >> 1))).build());
        this.IIiiiIIIIi = this.IIiiIiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("-M0P!w0j*d"))).description(IiiIIIiiII.IiiiiiiIIi("\u657f\u6563\u8ba8\u7f60\u7966\u4fcf"))).defaultValue((Object)(0x2A & 0x7F))).min(2 & 5).max(0x6E & 0x75).sliderMin(3 >> 2).sliderMax(0x7C & 0x67).build());
        this.iiiiiIIiiI = this.IIiiIiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("G+v\u0006O!P!w0j*d"))).description(IiiIIIiiII.IiiiiiiIIi("\u53c7\u7cad\u5eaa\u6d7a\u70b2\u6563\u8ba8\u7f60\u7966\u4fcf"))).defaultValue(3.14).min(0.0).max(10.0).sliderMin(0.0).sliderMax(10.0).build());
        this.iiIIIIiIII = this.IIiiIiiiII.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("P0q\rM#P!w0j*d"))).description(IiiIIIiiII.IiiiiiiIIi("\u5b43\u7b2d\u4e21\u8ba8\u7f60\u7966\u4fcf"))).defaultValue((Object)IIiIIIiIii.ALLATORIxDEMO("K!o\bLh#\u0013l6o \""))).build());
        this.iIIIIiiiii = this.IIiiIiiiII.add((Setting)((BlockSetting.Builder)((BlockSetting.Builder)((BlockSetting.Builder)new BlockSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u001c*dpgGngbg2#"))).description(IIiIIIiIii.ALLATORIxDEMO("\u65fd\u5754\u8bfa\u7f6d\u797e\u4f88"))).defaultValue((Object)class_2246.DIAMOND_BLOCK)).build());
        this.IiIIIIiiii = this.IIiiIiiiII.add((Setting)((ItemSetting.Builder)((ItemSetting.Builder)((ItemSetting.Builder)new ItemSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u000f\u007fvaGngbg2#"))).description(IIiIIIiIii.ALLATORIxDEMO("\u722d\u54c2\u8bfa\u7f6d\u797e\u4f88"))).defaultValue((Object)class_1802.DIAMOND_SWORD)).build());
        this.IiIiiIIiiI = this.IIiiIiiiII.add((Setting)((BlockListSetting.Builder)((BlockListSetting.Builder)((BlockListSetting.Builder)new BlockListSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("I\u007fdp5\nb`xGngbg2#"))).description(IIiIIIiIii.ALLATORIxDEMO("\u65fd\u5754\u5253\u886b\u8bfa\u7f6d\u797e\u4f88"))).defaultValue(List.of(class_2246.DIAMOND_BLOCK, class_2246.EMERALD_BLOCK, class_2246.GOLD_BLOCK))).build());
        this.IiiIiIIIiI = this.IIiiIiiiII.add((Setting)((ItemListSetting.Builder)((ItemListSetting.Builder)((ItemListSetting.Builder)new ItemListSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("Z\u007fv3\nb`xGngbg2#"))).description(IIiIIIiIii.ALLATORIxDEMO("\u722d\u54c2\u5253\u886b\u8bfa\u7f6d\u797e\u4f88"))).defaultValue(List.of(class_1802.DIAMOND_SWORD, class_1802.DIAMOND_PICKAXE, class_1802.DIAMOND_SHOVEL))).build());
        int n = 5 >> 3;
        this.IIiIiiIiIi = this.IIiiIiiiII.add((Setting)((BlockPosSetting.Builder)((BlockPosSetting.Builder)((BlockPosSetting.Builder)new BlockPosSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("Qg|=-[|\u007fGngbg2#"))).description(IIiIIIiIii.ALLATORIxDEMO("\u65fd\u5754\u4f09\u7f6d\u8bfa\u7f6d\u797e\u4f88"))).defaultValue((Object)new class_2338(n, 0x51 & 0x6E, n))).build());
        this.IiiiiIIIIi = this.IIiiIiiiII.add((Setting)((Vector3dSetting.Builder)((Vector3dSetting.Builder)new Vector3dSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("Enp*)y hGngbg2#"))).description(IIiIIIiIii.ALLATORIxDEMO("\u4e4d\u7ef7\u5455\u91cc\u8bfa\u7f6d\u797e\u4f88"))).build());
        this.IiIiiiiIIi = this.IIiiIiiiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u0003efaGngbg2#"))).description(IIiIIIiIii.ALLATORIxDEMO("\u67de\u4e3d\u8bfa\u7f6d\u797e\u4f88"))).defaultValue((Object)DebugModule.TestEnum.ALLATORIxDEMO)).build());
        this.ALLATORIxDEMO = this.IIiiIiiiII.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u001d)g|~Gngbg2#"))).description(IIiIIIiIii.ALLATORIxDEMO("\u98d8\u8271\u8bfa\u7f6d\u797e\u4f88"))).build());
        this.IiiiiIIiiI = this.IIiiIiiiII.add((Setting)((ColorListSetting.Builder)((ColorListSetting.Builder)new ColorListSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("H|g|,\nb`xGngbg2#"))).description(IIiIIIiIii.ALLATORIxDEMO("\u98d8\u8271\u5253\u886b\u8bfa\u7f6d\u797e\u4f88"))).build());
        this.iiIiIIiIIi = this.IIiiIiiiII.add((Setting)((EntityTypeListSetting.Builder)((EntityTypeListSetting.Builder)new EntityTypeListSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("vegbgrGrc;\nb`xGngbg2#"))).description(IIiIIIiIii.ALLATORIxDEMO("\u5bfa\u4f70\u7c3f\u5788\u5253\u886b\u8bfa\u7f6d\u797e\u4f88"))).build());
        this.IIiiiiiiII = this.IIiiIiiiII.add((Setting)((StatusEffectListSetting.Builder)((StatusEffectListSetting.Builder)new StatusEffectListSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("@_R\u007ffxVmunp*\nb`xGngbg2#"))).description(IIiIIIiIii.ALLATORIxDEMO("\u72d2\u6022\u650c\u679f\u5253\u886b\u8bfa\u7f6d\u797e\u4f88"))).build());
        this.iIiIiiIiiI = this.IIiiIiiiII.add((Setting)((ParticleTypeListSetting.Builder)((ParticleTypeListSetting.Builder)((ParticleTypeListSetting.Builder)new ParticleTypeListSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("CJA\u007fzh\u007fnGrc;\nb`xGngbg2#"))).description(IIiIIIiIii.ALLATORIxDEMO("\u7cf6\u5b73\u7c3f\u5788\u5253\u886b\u8bfa\u7f6d\u797e\u4f88"))).defaultValue(List.of(class_2398.FLAME, class_2398.SMOKE, class_2398.EXPLOSION))).build());
        this.iiIIiIiiIi = this.IIiiIiiiII.add((Setting)((SoundEventListSetting.Builder)((SoundEventListSetting.Builder)((SoundEventListSetting.Builder)new SoundEventListSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("`dfewNen}*\nb`xGngbg2#"))).description(IIiIIIiIii.ALLATORIxDEMO("\u5894\u97d0\u4ecf\u4ef5\u5253\u886b\u8bfa\u7f6d\u797e\u4f88"))).defaultValue(List.of(class_3417.ENTITY_PLAYER_LEVELUP, class_3417.BLOCK_ANVIL_USE))).build());
        this.IIIiIIIiII = this.IIiiIiiiII.add((Setting)((StringListSetting.Builder)((StringListSetting.Builder)((StringListSetting.Builder)new StringListSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("@\u007fab}9\nb`xGngbg2#"))).description(IIiIIIiIii.ALLATORIxDEMO("\u5b74\u7b62\u4e31\u5253\u886b\u8bfa\u7f6d\u797e\u4f88"))).defaultValue(List.of(IiiIIIiiII.IiiiiiiIIi("\u7934\u4fd7u"), IIiIIIiIii.ALLATORIxDEMO("\u7939\u4fcf1"), IiiIIIiiII.IiiiiiiIIi("\u7934\u4fd7w")))).build());
        this.IIiIIiIIii = this.IIiiIiiiII.add((Setting)((EnchantmentListSetting.Builder)((EnchantmentListSetting.Builder)new EnchantmentListSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("F*\u0007K%m0n!m0O\rP0P!w0j*d"))).description(IiiIIIiiII.IiiiiiiIIi("\u9648\u9b40\u521c\u887b\u8ba8\u7f60\u7966\u4fcf"))).build());
        this.iIiIiiiiII = this.IIiiIiiiII.add((Setting)((KeybindSetting.Builder)((KeybindSetting.Builder)new KeybindSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u000ff=a\rM P!w0j*d"))).description(IiiIIIiiII.IiiiiiiIIi("\u9522\u4f59\u7eda\u5b89\u8ba8\u7f60\u7966\u4fcf"))).build());
        this.IiIiiIIiii = this.IIiiIiiiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new PotionSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("S+w\rL*P!w0j*d"))).description(IiiIIIiiII.IiiiiiiIIi("\u8364\u6c27\u8ba8\u7f60\u7966\u4fcf"))).defaultValue((Object)MyPotion.RegenerationLong)).build());
        this.IIIIiIiiIi = this.IIiiIiiiII.add((Setting)((StorageBlockListSetting.Builder)((StorageBlockListSetting.Builder)new StorageBlockListSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("Ww+\u0016B#f\u0006o+`/O\rP0P!w0j*d"))).description(IiiIIIiiII.IiiiiiiIIi("\u5b53\u50bb\u65b5\u5743\u521c\u887b\u8ba8\u7f60\u7966\u4fcf"))).build());
        this.iiiiIiiIIi = this.IIiiIiiiII.add((Setting)((PacketListSetting.Builder)((PacketListSetting.Builder)((PacketListSetting.Builder)new PacketListSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("S%`/f0O\rP0P!w0j*d"))).description(IiiIIIiiII.IiiiiiiIIi("\u6563\u6362\u5311\u521c\u887b\u8ba8\u7f60\u7966\u4fcf"))).defaultValue(Set.of(class_2828.class))).build());
        this.iiiIiIiIIi = this.IIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("@+m j0j\u000bM%o\u0010l#d(f"))).description(IiiIIIiiII.IiiiiiiIIi("\u6777\u4ef8\u5f5c\u5137"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.IiiIIiIiIi = this.IIiiIiiiII.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("@+m j0j\u000bM%o\u0017w6j*d"))).description(IiiIIIiiII.IiiiiiiIIi("\u53f9\u6702\u5f40H|ewBGb|ergGdt9*n\u4e29xf~v\u65e0\u6243\u53b3\u8985"))).defaultValue((Object)IIiIIIiIii.ALLATORIxDEMO("\u6725\u4ef5\u53ab\u89c2\u76c0\u5b54\u7b62\u4e31"))).visible(() -> (Boolean)this.iiiIiIiIIi.get())).build());
        IiiiiIiiii iiiiiIiiii2 = this;
        iiiiiIiiii2.iIiIiIiIii = iiiiiIiiii2.IIiiIiiiII;
        iiiiiIiiii2.iIiiIIIIii = iiiiiIiiii2.IIiiIiiiII;
        iiiiiIiiii2.iiiIiiIIII = iiiiiIiiii2.iIiIiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u9ace\u7ea9\u6a7d\u5f4b"))).description(IIiIIIiIii.ALLATORIxDEMO("\u546b\u752b\u9a9c\u7ea4\u52db\u80fe"))).defaultValue((Object)(5 >> 3))).build());
        this.iiIIiiIiIi = this.iIiIiIiIii.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u7ca8\u5ea8\u8be2\u7f2a"))).description(IIiIIIiIii.ALLATORIxDEMO("\u9a9c\u7ea4\u7cfa\u5ea5\u63e3\u5235"))).defaultValue(0.001).min(1.0E-4).max(1.0).visible(() -> (Boolean)this.iiiIiiIIII.get())).sliderMin(1.0E-4).sliderMax(0.1).build());
        this.IIIiIiiIIi = this.iIiiIIIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u5b8d\u9a9a\u6029\u52c3\u80b9"))).description(IIiIIIiIii.ALLATORIxDEMO("\u546b\u752b\u5bda\u9a8f\u6043\u52bc\u80b9\uff0b\u53ab\u80fe\u674d\u98cd\u962d\uff0a"))).defaultValue((Object)(5 >> 3))).build());
        this.iIiiIiiiII = this.iIiiIIIIii.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u5b88\u9a82\u9111\u7f2a"))).description(IIiIIIiIii.ALLATORIxDEMO("\u5bda\u9a8f\u6063\u529c\u80b9\u7687\u9109\u7f6d"))).defaultValue((Object)IiiIIIiiII.IiiiiiiIIi("'9"))).visible(() -> (Boolean)this.IIIiIiiIIi.get())).build());
        this.iIIiiIIIII = this.IIIiIIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u8ffe\u8e6e\u6573\u632a\u5306"))).description(IiiIIIiiII.IiiiiiiIIi("\u8fe9\u8e21\u7f42\u7eca\u657e\u6332\u5341"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iIIiiiIiII = this.IIIiIIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u663d\u797e\u6573\u632a\u5306\u8ba2\u60c6"))).description(IiiIIIiiII.IiiiiiiIIi("\u6660\u797c\u657b\u637d\u5309\u7690\u8bed\u7ed5\u5b41\u6bbb\u4fbd\u602b"))).defaultValue((Object)((3 & 5) != 0))).visible(() -> (Boolean)this.iIIiiIIIII.get())).build());
        this.IIIIiIiIIi = this.IIIiIIiiIi.add((Setting)((PacketListSetting.Builder)((PacketListSetting.Builder)((PacketListSetting.Builder)((PacketListSetting.Builder)new PacketListSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u6573\u632a\u5306\u7c3f\u5788"))).description(IiiIIIiiII.IiiiiiiIIi("\u904f\u62e2\u8992\u8ff1\u8e3e\u768f\u6563\u6378\u530b\u7c27\u57cf"))).defaultValue(new LinkedHashSet())).visible(() -> (Boolean)this.iIIiiIIIII.get())).build());
        this.iIIiIIiiII = this.IIIiIIiiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u6744\u5924\u667a\u7939\u953b\u5ea5"))).description(IiiIIIiiII.IiiiiiiIIi("\u6563\u6330\u5343\u4fea\u607c\u7688\u6714\u592c\u662d\u792c\u5b59\u7b7a\u6534"))).defaultValue((Object)(0x77F9 & 0x1B8E))).min(0x67 & 0x7C).max(0x6EB4 & 0x5F6B).sliderMin(0x77 & 0x6C).sliderMax(0x7FB4 & 0x275B).visible(() -> {
            if (((Boolean)this.iIIiiIIIII.get()).booleanValue() && ((Boolean)this.iIIiiiIiII.get()).booleanValue()) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        IiiiiIiiii iiiiiIiiii3 = this;
        this.iiIiIiIiiI = 3 >> 2;
        IiiiiIiiii iiiiiIiiii4 = this;
        this.IiIiIIIiiI = new DecimalFormat(IIiIIIiIii.ALLATORIxDEMO("g-g "));
        IiiiiIiiii iiiiiIiiii5 = this;
        this.iIIIIiiiIi = new ArrayList<class_1297>();
        this.iiiiiIIIii = 2 & 5;
        iiiiiIiiii3.iIiiIiiiii = this.iiiiiIIIii;
        iiiiiIiiii3.iiIIiIiiII = 3 ^ 3;
        iiiiiIiiii3.iiIIIIiIII = class_310.getInstance();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiIIIiiII.IiiiiiiIIi("[\u007fNRxv+f{wjg;g+\u8be4\u66f8\u65a4\u523b\u6713\u65a6\u7246\u6770\uff45"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ String ALLATORIxDEMO(String string, int n) {
        void IiIIiIiiiI;
        IiiiiIiiii iiiiiIiiii = string2;
        String string2 = string;
        IiiiiIiiii IiIIiIiiiI2 = iiiiiIiiii;
        if (string2.length() <= IiIIiIiiiI) {
            return string2;
        }
        return string2.substring(2 & 5, (int)(IiIIiIiiiI - --3)) + "...";
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ String ALLATORIxDEMO(Object object, String string) {
        void IiIIiIiiiI;
        IiiiiIiiii iiiiiIiiii = object2;
        Object object2 = object;
        IiiiiIiiii IiIIiIiiiI2 = iiiiiIiiii;
        if (object2 == null) {
            return "null";
        }
        Object object3 = object2;
        String string2 = object3.getClass().getSimpleName();
        if (object3 instanceof String) {
            String string3 = (String)object2;
            if (string3.length() > (0x7A & 0x37)) {
                return "\u00a7b\"" + string3.substring(3 & 4, 0x2F & 0x7F) + "...\"\u00a77";
            }
            return "\u00a7b\"" + string3 + "\"\u00a77";
        }
        if (object2 instanceof Number) {
            return "\u00a76" + String.valueOf(object2) + "\u00a77";
        }
        if (object2 instanceof Boolean) {
            return "\u00a7a" + String.valueOf(object2) + "\u00a77";
        }
        if (object2 instanceof Enum) {
            return "\u00a7d" + ((Enum)object2).name() + "\u00a77";
        }
        if (string2.contains(IiiIIIiiII.IiiiiiiIIi("dRH\\DgBF"))) {
            return "\u00a7e" + String.valueOf(object2) + "\u00a77";
        }
        if (string2.contains(IIiIIIiIii.ALLATORIxDEMO("U!`wg"))) {
            return "\u00a7e" + String.valueOf(object2) + "\u00a77";
        }
        if (string2.contains(IiiIIIiiII.IiiiiiiIIi("iJT\u001e\\"))) {
            return "\u00a7e" + String.valueOf(object2) + "\u00a77";
        }
        if (string2.contains(IIiIIIiIii.ALLATORIxDEMO("\u0001m0j0z\rg")) || string2.contains(IiiIIIiiII.IiiiiiiIIi("^CA")) && IiIIiIiiiI != null && (IiIIiIiiiI.contains(IIiIIIiIii.ALLATORIxDEMO("-g")) || IiIIiIiiiI.contains(IiiIIIiiII.IiiiiiiIIi("dQ")))) {
            return "\u00a7c" + String.valueOf(object2) + "\u00a77";
        }
        if (object2.getClass().isArray()) {
            if (object2 instanceof byte[]) {
                int n = ((byte[])object2).length;
                return "\u00a7cbyte[" + n + "]\u00a77";
            }
            if (object2 instanceof int[]) {
                int n = ((int[])object2).length;
                return "\u00a7cint[" + n + "]\u00a77";
            }
            return "\u00a7c" + string2 + "[]\u00a77";
        }
        if (object2 instanceof Collection) {
            int n = ((Collection)object2).size();
            return "\u00a7d" + string2 + "(" + n + " items)\u00a77";
        }
        if (string2.contains(IIiIIIiIii.ALLATORIxDEMO("M&w")) || string2.contains(IiiIIIiiII.IiiiiiiIIi("yoa"))) {
            String string4 = object2.toString();
            if (string4.length() > (0x75 & 0x6E)) {
                return "\u00a7c" + string2 + "[...]\u00a77";
            }
            return "\u00a7c" + string4 + "\u00a77";
        }
        if (string2.contains(IIiIIIiIii.ALLATORIxDEMO("j0f)P0b'h"))) {
            return IiiIIIiiII.IiiiiiiIIi("\u008fNzngKmS^L\\\u008a\u0002");
        }
        if (string2.contains(IIiIIIiIii.ALLATORIxDEMO("\u0010f<w"))) {
            return "\u00a7b" + object2.toString().replace(IiiIIIiiII.IiiiiiiIIi("?"), IIiIIIiIii.ALLATORIxDEMO("\u0018m")) + "\u00a77";
        }
        String string5 = object2.toString();
        if (string5.length() > (0x7DD7 & 0x2BE)) {
            return "\u00a7c" + string2 + "[\u6570\u636e\u8fc7\u957f]\u00a77";
        }
        return "\u00a7f" + string5 + "\u00a77";
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        IiiiiIiiii iiiiiIiiii = object;
        Object object = receive;
        IiiiiIiiii IiIIiIiiiI = iiiiiIiiii;
        if (!((Boolean)IiIIiIiiiI.iIIiiIIIII.get()).booleanValue()) {
            return;
        }
        object = ((PacketEvent.Receive)object).packet;
        Object object2 = IiiiiIiiii.IiiiiiiIIi(object);
        if (!((Set)IiIIiIiiiI.IIIIiIiIIi.get()).contains(object.getClass())) {
            return;
        }
        IiiiiIiiii iiiiiIiiii2 = IiIIiIiiiI;
        iiiiiIiiii2.iIiiIiiiii += 3 & 5;
        iiiiiIiiii2.iiiiiIIIii += 3 >> 1;
        String string = IIiIIIiIii.ALLATORIxDEMO("\u00e3b\u63e1\u6535x.");
        Object[] objectArray = new Object[--3];
        objectArray[2 & 5] = string;
        objectArray[3 & 5] = object2;
        objectArray[5 >> 1] = IiIIiIiiiI.iiiiiIIIii;
        object2 = String.format(IiiIIIiiII.IiiiiiiIIi("\u0091Km\u6553\u6355\u5333\u000e\bFm\b\u008cU?q\u0006\u0099\u0010\u0017\f\u0012I\u001c"), objectArray);
        if (((Boolean)IiIIiIiiiI.iIIiiiIiII.get()).booleanValue() && !((String)(object = IiIIiIiiiI.ALLATORIxDEMO((class_2596<?>)object))).isEmpty()) {
            IiiiiIiiii iiiiiIiiii3 = IiIIiIiiiI;
            object = iiiiiIiiii3.ALLATORIxDEMO((String)object, (Integer)iiiiiIiiii3.iIIiIIiiII.get());
            object2 = (String)object2 + "\n\u00a77" + ((String)object).replace(IIiIIIiIii.ALLATORIxDEMO("\t"), IiiIIIiiII.IiiiiiiIIi("=\u008a\u0002"));
        }
        iiiiIiiiII.ALLATORIxDEMO((String)object2);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Send send) {
        IiiiiIiiii iiiiiIiiii = object;
        Object object = send;
        IiiiiIiiii IiIIiIiiiI = iiiiiIiiii;
        if (!((Boolean)IiIIiIiiiI.iIIiiIIIII.get()).booleanValue()) {
            return;
        }
        object = ((PacketEvent.Send)object).packet;
        Object object2 = IiiiiIiiii.IiiiiiiIIi(object);
        if (!((Set)IiIIiIiiiI.IIIIiIiIIi.get()).contains(object.getClass())) {
            return;
        }
        IiiiiIiiii iiiiiIiiii2 = IiIIiIiiiI;
        iiiiiIiiii2.iiIIiIiiII += 3 & 5;
        iiiiiIiiii2.iiiiiIIIii += --1;
        String string = IIiIIIiIii.ALLATORIxDEMO("\u00e3`\u5395\u9002i=");
        Object[] objectArray = new Object[--3];
        objectArray[3 >> 2] = string;
        objectArray[3 >> 1] = object2;
        objectArray[5 >> 1] = IiIIiIiiiI.iiiiiIIIii;
        object2 = String.format(IiiIIIiiII.IiiiiiiIIi("\u0091Km\u6553\u6355\u5333\u000e\bFm\b\u008cU?q\u0006\u0099\u0010\u0017\f\u0012I\u001c"), objectArray);
        if (((Boolean)IiIIiIiiiI.iIIiiiIiII.get()).booleanValue() && !((String)(object = IiIIiIiiiI.ALLATORIxDEMO((class_2596<?>)object))).isEmpty()) {
            IiiiiIiiii iiiiiIiiii3 = IiIIiIiiiI;
            object = iiiiiIiiii3.ALLATORIxDEMO((String)object, (Integer)iiiiiIiiii3.iIIiIIiiII.get());
            object2 = (String)object2 + "\n\u00a77" + ((String)object).replace(IIiIIIiIii.ALLATORIxDEMO("\t"), IiiIIIiiII.IiiiiiiIIi("=\u008a\u0002"));
        }
        iiiiIiiiII.IiiIIIIiiI((String)object2);
    }

    private static /* synthetic */ String IiiiiiiIIi(class_2596<?> IiIIiIiiiI) {
        String string = IiIIiIiiiI.getClass().getSimpleName();
        return string.substring(string.lastIndexOf(0x6F & 0x3E) + (4 ^ 5));
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(StringBuilder stringBuilder, Integer n, class_1799 class_17992) {
        void IiIIiIiiiI;
        StringBuilder IiIIiIiiiI2 = class_17992;
        StringBuilder IiIIiIiiiI3 = stringBuilder;
        String string = IiIIiIiiiI2.isEmpty() ? IiiIIIiiII.IiiiiiiIIi("\u7a4f") : IiIIiIiiiI2.getItem().getName().getString();
        Object[] objectArray = new Object[--3];
        objectArray[3 ^ 3] = IiIIiIiiiI;
        objectArray[3 & 5] = string;
        objectArray[1 ^ 3] = IiIIiIiiiI2.getCount();
        IiIIiIiiiI3.append(String.format(IIiIIIiIii.ALLATORIxDEMO("d#\u001f&\u0000~d&7#<& \t"), objectArray));
    }

    private /* synthetic */ String ALLATORIxDEMO(class_2596<?> class_25962) {
        class_2596<?> class_25963 = class_25964;
        class_2596<?> class_25964 = class_25962;
        class_2596<?> IiIIiIiiiI = class_25963;
        StringBuilder stringBuilder = new StringBuilder();
        if (class_25964 instanceof class_2828) {
            class_2828 class_28282;
            class_2828 class_28283 = class_28282 = (class_2828)class_25964;
            class_2596<?> class_25965 = IiIIiIiiiI;
            class_2828 class_28284 = class_28282;
            double d = class_28284.getX(IiIIiIiiiI.iiIIIIiIII.player.getX());
            double d2 = class_28284.getY(IiIIiIiiiI.iiIIIIiIII.player.getY());
            double d3 = class_28282.getZ(class_25965.iiIIIIiIII.player.getZ());
            float f = class_28283.getYaw(class_25965.iiIIIIiIII.player.getYaw());
            float f2 = class_28283.getPitch(IiIIiIiiiI.iiIIIIiIII.player.getPitch());
            boolean bl = class_28283.isOnGround();
            Object[] objectArray = new Object[0x1E & 0x67];
            objectArray[3 >> 2] = d;
            objectArray[2 ^ 3] = d2;
            objectArray[--2] = d3;
            objectArray[--3] = Float.valueOf(f);
            objectArray[--4] = Float.valueOf(f2);
            objectArray[--5] = bl;
            return String.format(IIiIIIiIii.ALLATORIxDEMO("}:>\t%{!>d#O\u4f4f\u7f36%o &jsah#c/kyl'a-ugq\u0015\u89c5\u8996v+0o>3g+rb#4\rW'ky&j2\"\t\u664b\u5405\u576c\u5733\u97269d&7\t"), objectArray);
        }
        if (class_25964 instanceof class_2885) {
            class_2885 class_28852 = (class_2885)class_25964;
            class_1268 class_12682 = class_28852.getHand();
            class_3965 class_39652 = class_28852.getBlockHitResult();
            class_2338 class_23382 = class_39652.getBlockPos();
            class_2350 class_23502 = class_39652.getSide();
            class_243 class_2432 = class_39652.getPos();
            Object[] objectArray = new Object[0x37 & 0x4F];
            objectArray[3 ^ 3] = class_12682;
            objectArray[4 ^ 5] = class_23382.toShortString();
            objectArray[1 ^ 3] = class_23502;
            objectArray[--3] = class_2432.x;
            objectArray[--4] = class_2432.y;
            objectArray[--5] = class_2432.z;
            objectArray[0x76 & 0xF] = class_39652.isInsideBlock();
            return String.format(IiiIIIiiII.IiiiiiiIIi("i2*B}}tenlcI\u007ffr|2qi\t\u6250<>#m\u0007\u65ac\u575b\u5744\u684bn\u000b\u0016x\u0019\u9769)+6x\u0019\u5456\u4e1e\u4f46\u7f7d13#6% E\u0017\u000e\u0013\u0000\u0005E\u0017\u0016\u000b\u0003\u0006V\u0001!\u661c\u543c\u5187\u90ce\u5443\u4e0a\u0005\u000f\u0012^?"), objectArray);
        }
        if (class_25964 instanceof class_2846) {
            class_2846 class_28462 = (class_2846)class_25964;
            class_2338 class_23383 = class_28462.getPos();
            class_2350 class_23503 = class_28462.getDirection();
            class_2846.class_2847 class_28472 = class_28462.getAction();
            Object[] objectArray = new Object[--3];
            objectArray[5 >> 3] = class_28472;
            objectArray[5 >> 2] = class_23383 != null ? class_23383.toShortString() : IiiIIIiiII.IiiiiiiIIi("\u001f\u65cd\u001c");
            objectArray[5 >> 1] = class_23503 != null ? class_23503 : IIiIIIiIii.ALLATORIxDEMO("+\u65a4*");
            return String.format(IIiIIIiIii.ALLATORIxDEMO("}:yS*`!zq\u0005/\u007f a'3\u007f8I\u52ac\u4f5f~D\u00067\t\u76aa\u6804\u65fd\u5754~#APN\u671e\u54559d&7\t"), objectArray);
        }
        if (class_25964 instanceof class_8875) {
            class_8875 class_88752 = (class_8875)class_25964;
            int n = class_88752.comp_1998();
            boolean bl = class_88752.comp_2000();
            Object[] objectArray = new Object[5 >> 1];
            objectArray[3 ^ 3] = n;
            objectArray[--1] = bl ? IIiIIIiIii.ALLATORIxDEMO("\u5db6\u542c\u756c,\u904d\u4e2e") : IiiIIIiiII.IiiiiiiIIi("\u671d\u5402\u751d");
            return String.format(IiiIIIiiII.IiiiiiiIIi(".\u0016\u000eX\u007fdgH{j}D^JeZWW^\u000b\u0013\u0010?\u69cd\u4f65\u0011\u0013?f,\u7288\u6026\u0005\u000f\u0012^?"), objectArray);
        }
        if (class_25964 instanceof class_2848) {
            class_2848 class_28482 = (class_2848)class_25964;
            class_2848.class_2849 class_28492 = class_28482.getMode();
            int n = class_28482.getMountJumpHeight();
            Object[] objectArray = new Object[5 >> 1];
            objectArray[3 ^ 3] = class_28492;
            objectArray[3 >> 1] = n;
            return String.format(IIiIIIiIii.ALLATORIxDEMO("{<e\\o-)e=M&c/d-`>yY)\u6a65\u5f0c~#apN\u9a92\u4e3c\u8dd0\u8d87\u5f39\u5ee29d& \t"), objectArray);
        }
        if (class_25964 instanceof class_2813) {
            class_2813 class_28132 = (class_2813)class_25964;
            int n = class_28132.getSlot();
            int n2 = class_28132.getButton();
            class_1713 class_17132 = class_28132.getActionType();
            class_1799 class_17992 = class_28132.getStack();
            Int2ObjectMap int2ObjectMap = class_28132.getModifiedStacks();
            Object[] objectArray = new Object[0x7F & 6];
            objectArray[2 & 5] = n;
            objectArray[3 >> 1] = n2;
            objectArray[--2] = class_17132;
            objectArray[--3] = class_17992.getItem().getName().getString();
            objectArray[--4] = class_17992.getCount();
            objectArray[--5] = IiiiiIiiii.ALLATORIxDEMO(int2ObjectMap);
            return String.format(IiiIIIiiII.IiiiiiiIIi("22*H\u007f`r|\\ ;w&;#\f\u7a89\u53ee\\H.lqO9\u69f6\u4f5e13.w\u0001\u631a\u9485\t+6o\u0019\u52a3\u4f4f\u7c70\u5798\u0019\u001b\u000bE$\u725f\u54e2\u0001\u0016\u000b^\u0015H\rO9\u4ff4\u653b\u985f\u0004-\u001f\u000f\u0012^?"), objectArray);
        }
        if (class_25964 instanceof class_2811) {
            class_2811 class_28112 = (class_2811)class_25964;
            int n = class_28112.comp_2649();
            int n3 = class_28112.comp_2650();
            Object[] objectArray = new Object[5 >> 1];
            objectArray[3 & 4] = n;
            objectArray[3 >> 1] = n3;
            return String.format(IIiIIIiIii.ALLATORIxDEMO("e\">\u00069\u007f=a'M.l o>yY)\u7ad3\u53e0\rG~#agn\u632a\u94eaJ\u00009d& \t"), objectArray);
        }
        if (class_25964 instanceof class_2815) {
            class_2815 class_28152 = (class_2815)class_25964;
            int n = class_28152.getSyncId();
            Object[] objectArray = new Object[--1];
            objectArray[2 & 5] = n;
            return String.format(IiiIIIiiII.IiiiiiiIIi("6.6Pg|xvkZ@RBSGhU\\HP^\u0015\u0016\u000e\u0010\u7a95\u53c5wc\u0005\u000f\u0012I?"), objectArray);
        }
        if (class_25964 instanceof class_2879) {
            class_2879 class_28792 = (class_2879)class_25964;
            class_1268 class_12683 = class_28792.getHand();
            Object[] objectArray = new Object[--1];
            objectArray[5 >> 3] = class_12683;
            return String.format(IIiIIIiIii.ALLATORIxDEMO(">yYk%m P3j*dY\u001ey\t\u620f9d&7\t"), objectArray);
        }
        try {
            int n;
            Field[] fieldArray;
            Class clazz = class_25964.getClass();
            Field[] fieldArray2 = fieldArray = clazz.getDeclaredFields();
            int n4 = fieldArray2.length;
            int n5 = n = 3 & 4;
            while (n5 < n4) {
                Field field = fieldArray2[n];
                field.setAccessible((2 ^ 3) != 0);
                String string = field.getName();
                if (!(string.equals(IiiIIIiiII.IiiiiiiIIi("kphphg")) || string.equals(IIiIIIiIii.ALLATORIxDEMO("`+g!`")) || string.equals(IiiIIIiiII.IiiiiiiIIi("UsgJZx\f\u0018\u000e\u001e\u0000")) || string.equals(IIiIIIiIii.ALLATORIxDEMO("e\rF(g\u001b0s:w5")))) {
                    try {
                        Object object = field.get(class_25964);
                        String string2 = IiIIiIiiiI.ALLATORIxDEMO(object, string);
                        if (!string2.isEmpty()) {
                            Object[] objectArray = new Object[1 ^ 3];
                            objectArray[3 & 4] = string;
                            objectArray[3 & 5] = string2;
                            stringBuilder.append(String.format(IiiIIIiiII.IiiiiiiIIi("\"\u0006\u001bT\u0005\u000f\u0012^?"), objectArray));
                        }
                    } catch (IllegalAccessException illegalAccessException) {
                        Object[] objectArray = new Object[--1];
                        objectArray[5 >> 3] = string;
                        stringBuilder.append(String.format(IIiIIIiIii.ALLATORIxDEMO("#d&\u0017\u0019dX\u8bfb\u95ed\u5975\u8d26\u0019\t"), objectArray));
                    }
                }
                n5 = ++n;
            }
            if (stringBuilder.length() > 0) {
                StringBuilder stringBuilder2 = stringBuilder;
                stringBuilder2.setLength(stringBuilder2.length() - (2 ^ 3));
            }
        } catch (Exception exception) {
            return "[\u89e3\u6790\u5931\u8d25: " + exception.getMessage() + "]";
        }
        return stringBuilder.toString();
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(EntityRemovedEvent object) {
        IiiiiIiiii iiiiiIiiii = iiiiiIiiii2;
        IiiiiIiiii iiiiiIiiii2 = object;
        object = iiiiiIiiii;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
    }
}

