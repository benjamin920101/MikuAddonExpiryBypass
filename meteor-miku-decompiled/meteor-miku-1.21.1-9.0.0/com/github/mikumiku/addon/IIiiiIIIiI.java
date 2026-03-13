/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Send
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Modules
 *  meteordevelopment.meteorclient.systems.modules.movement.Blink
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.item.Items
 *  net.minecraft.world.BlockView
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IIiIiiIIiI;
import com.github.mikumiku.addon.IiiIiIIIIi;
import com.github.mikumiku.addon.IiiiIIiiiI;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIiIiIiIIi;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.movement.Blink;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.item.Items;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.client.MinecraftClient;

public class IIiiiIIIiI
extends iiiiIiIiii {
    public Setting<Boolean> IIiiiiiiII;
    private final SettingGroup IIiiiIIIIi;
    private final Setting<SettingColor> IIIiIIIiII;
    private final Setting<Boolean> iiIiIiiiiI;
    private final Setting<SettingColor> IIiiIiiiII;
    private final Setting<Boolean> IIIiIiiIIi;
    public Setting<Boolean> iiiIiIiIIi;
    private final Setting<ShapeMode> iIiIiIiIii;
    public Setting<Integer> iiiiiIIIii;
    public Setting<Integer> iIIiIIiiII;
    private final SettingGroup IiiIIiiiiI;
    private boolean IiIIIIiiii;
    private final Setting<Boolean> IiiIIIiiIi;
    public Setting<Boolean> iiIIiiIiii;
    private final Setting<Boolean> iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private int iiIiIIiIIi;
    private Thread IIIIiIiiIi;
    public Setting<Integer> IiIiIIIIiI;
    private int iiiiiIIiiI;
    private final SettingGroup iiIIIIiIII;
    private final Setting<Boolean> IiIIiIiiiI;
    private final ConcurrentHashMap<class_2338, Long> ALLATORIxDEMO;

    @Override
    public void onActivate() {
        IIiiiIIIiI iIiiiIIIiI = this;
        iIiiiIIIiI.iiIiIIiIIi = 0x5F & 0x34;
        iIiiiIIIiI.iiiiiIIiiI = 0xFFFFFE3F & 0xFFFFFDD8;
        this.IiIIIIiiii = 2 & 5;
        this.IIIIiIiiIi = null;
        this.ALLATORIxDEMO.clear();
    }

    @EventHandler
    public void ALLATORIxDEMO(PacketEvent.Send send) {
        IIiiiIIIiI iIiiiIIIiI = iIiiiIIIiI2;
        IIiiiIIIiI iIiiiIIIiI2 = send;
        IIiiiIIIiI IiIIiIiiiI = iIiiiIIIiI;
        iIiiiIIIiI2 = ((PacketEvent.Send)iIiiiIIIiI2).packet;
        if (iIiiiIIIiI2 instanceof class_2886) {
            class_2886 cfr_ignored_0 = (class_2886)iIiiiIIIiI2;
            if (((Boolean)IiIIiIiiiI.iIIiiIIIII.get()).booleanValue() && IiIIiIiiiI.iiIIIIiIII.player.getMainHandStack().getItem() == class_1802.ENDER_PEARL) {
                IiIIiIiiiI.info(IiiIiIIIIi.ALLATORIxDEMO("\u4f6e\u7536\u671a\u5f6f\u73fc\u73fe\uff3d\u514d\u95fc\u6a3f\u5766"), new Object[3 & 4]);
                IiIIiIiiiI.toggle();
            }
        }
    }

    @EventHandler
    public void ALLATORIxDEMO(TickEvent.Pre pre) {
        IIiiiIIIiI iIiiiIIIiI = this;
        if (IiiiIiiIII.IiiiiiiIIi((class_310)iIiiiIIIiI.iiIIIIiIII) && ((Boolean)iIiiiIIIiI.iiIiIiiiiI.get()).booleanValue()) {
            iIiiiIIIiI.info(IiiIiIIIIi.ALLATORIxDEMO("\u73b8\u5ba8\u6b52\u5736\u98ef\u8852\uff3d\u514d\u95fc\u6a3f\u5766"), new Object[3 & 4]);
            iIiiiIIIiI.toggle();
            return;
        }
        if (!Modules.get().isActive(Blink.class)) {
            int n;
            if (((Boolean)iIiiiIIIiI.IIIiIiiIIi.get()).booleanValue()) {
                if (iIiiiIIIiI.iiiiiIIiiI == (0xFFFFFDDE & 0xFFFFFE39)) {
                    iIiiiIIIiI.iiiiiIIiiI = iIiiiIIIiI.iiIIIIiIII.player.getBlockPos().getY();
                }
                if (iIiiiIIIiI.iiIIIIiIII.player.getBlockPos().getY() != iIiiiIIIiI.iiiiiIIiiI) {
                    iIiiiIIIiI.info(IIiIiiIIiI.ALLATORIxDEMO("\u7388\u5bd3x\u8f11\u5771\u6842\u53d0\u755a\u53d9\u5353\uff0d\u5116\u95cc\u6a64\u5756"), new Object[3 >> 2]);
                    iIiiiIIIiI.toggle();
                    return;
                }
            }
            if (((Boolean)iIiiiIIIiI.IiiIIIiiIi.get()).booleanValue()) {
                iIiiiIIIiI.IiIIIIiiii = iIiiiIIIiI.iiIIIIiIII.player.getActiveItem().getItem() == class_1802.CHORUS_FRUIT ? 5 >> 2 : 0;
            }
            if (((Boolean)iIiiiIIIiI.iIiiIiiiII.get()).booleanValue() && iIiiiIIIiI.iiIIIIiIII.player.isDead()) {
                iIiiiIIIiI.info(IiiIiIIIIi.ALLATORIxDEMO("\u73b7\u5b87\u5dec\u6b4a\u4ebf\uff3d\u514d\u95fc\u6a3f\u5766"), new Object[2 & 5]);
                iIiiiIIIiI.toggle();
                return;
            }
            int IiIIiIiiiI = IIIiIiIiii.ALLATORIxDEMO(class_1802.OBSIDIAN);
            int this232 = IiIIiIiiiI != -4 >> 2 ? --1 : 0;
            if (this232 == 0) {
                if (((Boolean)iIiiiIIIiI.IIiiiiiiII.get()).booleanValue()) {
                    return;
                }
                IiIIiIiiiI = IIIiIiIiii.ALLATORIxDEMO(class_1802.ENDER_CHEST);
                this232 = IiIIiIiiiI != -4 >> 2 ? 4 ^ 5 : 0;
                if (this232 == 0) {
                    return;
                }
            }
            IIiiiIIIiI iIiiiIIIiI2 = iIiiiIIIiI;
            if (iIiiiIIIiI2.iiIiIIiIIi <= (Integer)iIiiiIIIiI2.IiIiIIIIiI.get()) {
                iIiiiIIIiI.iiIiIIiIIi += 3 & 5;
                return;
            }
            IIiiiIIIiI iIiiiIIIiI3 = iIiiiIIIiI;
            iIiiiIIIiI3.iiIiIIiIIi = 2 & 5;
            List<Object> this232 = iIiiiIIIiI3.ALLATORIxDEMO();
            if (((Boolean)iIiiiIIIiI3.iiIIiiIiii.get()).booleanValue()) {
                this232.add(2 & 5, iIiiiIIIiI.iiIIIIiIII.player.getBlockPos().down());
            }
            Object object = new ArrayList();
            this232 = this232.stream().filter(class_23382 -> {
                IIiiiIIIiI iIiiiIIIiI2;
                IIiiiIIIiI this_ = class_23382;
                IIiiiIIIiI IiIIiIiiiI = iIiiiIIIiI2;
                boolean bl = !((Boolean)IiIIiIiiiI.iiiIiIiIIi.get()).booleanValue() ? 5 >> 2 : false;
                if (BlockUtils.canPlace((class_2338)this_, (boolean)bl) && !IiIIiIiiiI.iiIIIIiIII.world.getBlockState((class_2338)this_).isFullCube((class_1922)IiIIiIiiiI.iiIIIIiIII.world, (class_2338)this_)) {
                    if (iiiIIIIiiI.IiiiiiiIIi((class_2338)this_, 3 >> 1)) {
                        return --1 != 0;
                    }
                }
                if (IiIIiIiiiI.iiIIIIiIII.world.getBlockState((class_2338)this_).getBlock().asItem() == class_1802.AIR) {
                    void IiIIiIiiiI2;
                    IiIIiIiiiI2.add(this_);
                }
                return false;
            }).collect(Collectors.toList());
            object = object.iterator();
            while (object.hasNext()) {
                class_2338 class_23383 = (class_2338)object.next();
                class_2338 class_23384 = class_23383.down();
                if (!iiiIIIIiiI.IiiiiiiIIi(class_23384, 5 >> 2) || this232.contains(class_23384)) continue;
                this232.add(5 >> 3, class_23384);
            }
            int n2 = Math.min(this232.size(), (Integer)iIiiiIIIiI.iiiiiIIIii.get());
            int n3 = n = 3 >> 2;
            while (n3 < n2) {
                IIIiIiIiii.ALLATORIxDEMO(IiIIiIiiiI);
                if (((Boolean)iIiiiIIIiI.iiiIiIiIIi.get()).booleanValue()) {
                    for (class_1297 class_12972 : iIiiiIIIiI.iiIIIIiIII.world.getEntities()) {
                        if (!(class_12972 instanceof class_1511)) continue;
                        class_1511 class_15112 = (class_1511)class_12972;
                        if (!(PlayerUtils.distanceTo((class_1297)class_12972) < 3.0) || !class_12972.getBoundingBox().intersects(new class_238((class_2338)this232.get(n)))) continue;
                        class_12972 = class_15112.getBlockPos();
                        iIiIiIiIIi.ALLATORIxDEMO().ALLATORIxDEMO(new IiiiIIiiiI((float)Rotations.getYaw((class_2338)class_12972), (float)Rotations.getPitch((class_2338)class_12972)));
                        IIiiiIIIiI iIiiiIIIiI4 = iIiiiIIIiI;
                        iIiiiIIIiI.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)class_2824.attack((class_1297)class_15112, (boolean)iIiiiIIIiI4.iiIIIIiIII.player.isSneaking()));
                        iIiiiIIIiI4.iiIIIIiIII.player.swingHand(class_1268.MAIN_HAND);
                    }
                }
                boolean bl = 3 & 5;
                iiiIIIIiiI.ALLATORIxDEMO((class_2338)this232.get(n), bl, bl, bl);
                if (!iIiiiIIIiI.ALLATORIxDEMO.containsKey(this232.get(n))) {
                    iIiiiIIIiI.ALLATORIxDEMO.put((class_2338)this232.get(n), System.currentTimeMillis());
                }
                IIIiIiIiii.ALLATORIxDEMO(IiIIiIiiiI);
                n3 = ++n;
            }
        }
    }

    public List<class_2338> ALLATORIxDEMO() {
        class_2350 class_23502;
        int n;
        IIiiiIIIiI iIiiiIIIiI3;
        IIiiiIIIiI iIiiiIIIiI = iIiiiIIIiI3;
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<Object>();
        LinkedHashSet<class_2338> linkedHashSet2 = new LinkedHashSet<class_2338>();
        IIiiiIIIiI iIiiiIIIiI2 = iIiiiIIIiI;
        class_2338 class_23382 = iIiiiIIIiI2.iiIIIIiIII.player.getBlockPos();
        class_238 class_2383 = iIiiiIIIiI2.iiIIIIiIII.player.getBoundingBox();
        linkedHashSet.add(class_23382);
        class_2350[] class_2350Array = class_2350.values();
        int n2 = class_2350Array.length;
        int n3 = n = 2 & 5;
        while (n3 < n2) {
            class_2350 class_23503 = class_2350Array[n];
            if (class_23503 != class_2350.UP && class_23503 != class_2350.DOWN) {
                IIiiiIIIiI this_ = class_23382.offset(class_23503);
                if (class_2383.intersects(new class_238((class_2338)this_))) {
                    linkedHashSet.add(this_);
                    class_23502 = class_2350.values();
                    int n4 = ((class_2350)class_23502).length;
                    int n5 = 2 & 5;
                    while (n5 < n4) {
                        int n6;
                        class_2350 class_23504 = class_23502[n6];
                        if (class_23504 != class_2350.UP && class_23504 != class_2350.DOWN) {
                            class_23504 = this_.offset(class_23504);
                            if (class_2383.intersects(new class_238((class_2338)class_23504))) {
                                linkedHashSet.add(class_23504);
                            }
                        }
                        n5 = ++n6;
                    }
                }
            }
            n3 = ++n;
        }
        for (class_2338 class_23383 : linkedHashSet) {
            class_2350[] class_2350Array2 = class_2350.values();
            int n7 = class_2350Array2.length;
            int n6 = 5 >> 3;
            while (n6 < n7) {
                class_23502 = class_2350Array2[this_];
                if (class_23502 != class_2350.UP && class_23502 != class_2350.DOWN) {
                    class_2338 class_23384 = class_23383.offset(class_23502);
                    if (!class_2383.intersects(new class_238(class_23384))) {
                        linkedHashSet2.add(class_23384);
                    }
                }
                n6 = ++this_;
            }
        }
        return new ArrayList<class_2338>(linkedHashSet2);
    }

    public void onDeactivate() {
        this.iiIiIIiIIi = 0x57 & 0x3C;
        this.iiiiiIIiiI = 0xFFFFFE19 & 0xFFFFFDFE;
        this.IiIIIIiiii = 3 & 4;
        if (this.IIIIiIiiIi != null) {
            this.IIIIiIiiIi.interrupt();
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        IIiiiIIIiI iIiiiIIIiI = iterator;
        if (!((Boolean)iIiiiIIIiI.IiIIiIiiiI.get()).booleanValue() || iIiiiIIIiI.ALLATORIxDEMO.isEmpty()) {
            return;
        }
        long l = System.currentTimeMillis();
        Iterator<Map.Entry<class_2338, Long>> iterator = iIiiiIIIiI.ALLATORIxDEMO.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            class_2338 class_23382 = (class_2338)entry.getKey();
            long l2 = l - (Long)entry.getValue();
            if (l2 <= 300L) {
                void IiIIiIiiiI;
                double d = 0.5 * ((double)l2 / 300.0);
                class_2338 class_23383 = class_23382;
                double d2 = (double)class_23383.getX() + d;
                double d3 = (double)class_23383.getY() + d;
                double d4 = (double)class_23383.getZ() + d;
                double d5 = (double)(class_23383.getX() + (3 & 5)) - d;
                double d6 = (double)(class_23383.getY() + (4 ^ 5)) - d;
                d = (double)(class_23383.getZ() + (3 & 5)) - d;
                IiIIiIiiiI.renderer.box(d2, d3, d4, d5, d6, d, (Color)iIiiiIIIiI.IIIiIIIiII.get(), (Color)iIiiiIIIiI.IIiiIiiiII.get(), (ShapeMode)iIiiiIIIiI.iIiIiIiIii.get(), 3 >> 2);
                continue;
            }
            iterator.remove();
        }
    }

    @EventHandler
    public void ALLATORIxDEMO(PacketEvent.Receive receive) {
        IIiiiIIIiI iIiiiIIIiI = iIiiiIIIiI2;
        IIiiiIIIiI iIiiiIIIiI2 = receive;
        IIiiiIIIiI IiIIiIiiiI = iIiiiIIIiI;
        if (((PacketEvent.Receive)iIiiiIIIiI2).packet instanceof class_2708 && ((Boolean)IiIIiIiiiI.IiiIIIiiIi.get()).booleanValue() && IiIIiIiiiI.IiIIIIiiii) {
            IiIIiIiiiI.info(IIiIiiIIiI.ALLATORIxDEMO("\u68e1\u6d2e\u5211\u6748\u52a0\u562d\u4f21\u9044\uff0d\u5116\u95cc\u6a64\u5756"), new Object[3 & 4]);
            IiIIiIiiiI.toggle();
        }
    }

    public IIiiiIIIiI() {
        IIiiiIIIiI iIiiiIIIiI = this;
        super(iiiiIiIiii.ALLATORIxDEMO, IiiIiIIIIi.ALLATORIxDEMO("\u56e5\u8104\u001a"), IIiIiiIIiI.ALLATORIxDEMO("\u4f1c\u750f\u65db\u5771\u5fc9\u9079\u5340\u88f8\u81af\u5df0\u76e1\u73a8\u8dd6\uff2d\u51aa\u5c30\u6c71\u6677\u7243\u70b9\u9065\u6211\u76e1\u4f05\u5bf6\u3003"));
        iIiiiIIIiI.iiIIIIiIII = iIiiiIIIiI.settings.getDefaultGroup();
        iIiiiIIIiI.IIiiiiiiII = iIiiiIIIiI.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIiIIIIi.ALLATORIxDEMO("\u4edb\u4f4e\u7516\u9ec0\u66c2\u77c2"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.IiIiIIIIiI = this.iiIIIIiIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u5eb3\u8fde"))).sliderRange(3 ^ 3, 0x16 & 0x7D).defaultValue((Object)(3 >> 2))).build());
        this.iiiiiIIIii = this.iiIIIIiIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiIiIIIIi.ALLATORIxDEMO("\u6500\u7f7f\u656e\u91fe"))).sliderRange(4 ^ 5, 0x5B & 0x2C).defaultValue((Object)(--4))).build());
        this.iiiIiIiIIi = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u655e\u51da\u6c71\u6677"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiIIiiII = this.iiIIIIiIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiIiIIIIi.ALLATORIxDEMO("\u6c0a\u6667\u5e6a\u9fb5"))).sliderRange(3 & 4, 0xA & 0x7F).defaultValue((Object)(--4))).build());
        this.iiIIiiIiii = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u5ed0\u90e9"))).defaultValue((Object)(--1 != 0))).build());
        IIiiiIIIiI iIiiiIIIiI2 = this;
        iIiiiIIIiI2.IIiiiIIIIi = iIiiiIIIiI2.settings.createGroup(IiiIiIIIIi.ALLATORIxDEMO("\u5239\u6373\u8ba0\u7f5f"));
        iIiiiIIIiI2.IIIiIiiIIi = iIiiiIIIiI2.IIiiiIIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("<\u8f55\u539d\u5317"))).defaultValue((Object)(5 >> 3))).build());
        this.IiiIIIiiIi = this.IIiiiIIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIiIIIIi.ALLATORIxDEMO("\u7d3a\u989c\u67ad"))).defaultValue((Object)(3 >> 2))).build());
        this.iIIiiIIIII = this.IIiiiIIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u674e\u5f50\u7388\u73e1"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iiIiIiiiiI = this.IIiiiIIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIiIIIIi.ALLATORIxDEMO("\u98c0\u887d"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iIiiIiiiII = this.IIiiiIIIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u6b3e\u4ea0"))).defaultValue((Object)((3 & 4) != 0))).build());
        IIiiiIIIiI iIiiiIIIiI3 = this;
        iIiiiIIIiI3.IiiIIiiiiI = iIiiiIIIiI3.settings.createGroup(IiiIiIIIIi.ALLATORIxDEMO("\u6e0c\u67c2\u8ba0\u7f5f"));
        iIiiiIIIiI3.IiIIiIiiiI = iIiiiIIIiI3.IiiIIiiiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u6e77\u67d2"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u6611\u5437\u6e2c\u67e2"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iIiIiIiIii = this.IiiIIiiiiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u5f07\u7297\u6a64\u5f0e"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u6e03\u67ed\u7695\u5f7c\u7287"))).defaultValue((Object)ShapeMode.Both)).visible(() -> this.IiIIiIiiiI.get())).build());
        this.IIIiIIIiII = this.IiiIIiiiiI.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u5183\u5906\u4fc2\u9743\u98d9\u8273"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u51f7\u5919\u76b5\u4f99\u9773\u9882\u8243"))).defaultValue(new SettingColor(0x1FEE & 0x60FF, 0x5F & 0x6C, 0x24ED & 0x5BF7, 0x77 & 0x3A)).build());
        int n = 0x6FFF & 0x10FF;
        this.IIiiIiiiII = this.IiiIIiiiiI.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIiIiiIIiI.ALLATORIxDEMO("\u5183\u5906\u7eda\u6740\u98d9\u8273"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u51f7\u5919\u76b5\u7e81\u6770\u9882\u8243"))).defaultValue(new SettingColor(n, 0x5EFF & 0x21FF, n, 0x46EC & 0x3993)).build());
        IIiiiIIIiI iIiiiIIIiI4 = this;
        IIiiiIIIiI iIiiiIIIiI5 = this;
        iIiiiIIIiI5.iiIiIIiIIi = 3 >> 2;
        iIiiiIIIiI5.iiiiiIIiiI = 0xFFFFFC9D & 0xFFFFFF7A;
        iIiiiIIIiI4.IiIIIIiiii = 5 >> 3;
        iIiiiIIIiI4.IIIIiIiiIi = null;
        IIiiiIIIiI iIiiiIIIiI6 = this;
        iIiiiIIIiI4.ALLATORIxDEMO = new ConcurrentHashMap();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiIiiIIiI.ALLATORIxDEMO("2JG\u00076det\u0015E\u0004U\u0000\u0000e\u8bf6\u66b1\u65b1\u5275\u6701\u65d5\u7269\u6769\uff00"));
        }
    }
}

