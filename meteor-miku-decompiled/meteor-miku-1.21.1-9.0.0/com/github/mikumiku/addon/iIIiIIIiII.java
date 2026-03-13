/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.player.AttackEntityEvent
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Sent
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Modules
 *  meteordevelopment.meteorclient.systems.modules.combat.CrystalAura
 *  meteordevelopment.meteorclient.systems.modules.combat.Surround
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.world.BlockView
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Box
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiIiIiI;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIiiIiiiII;
import com.github.mikumiku.addon.iiIIIiiIII;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.Criticals;
import java.util.Date;
import java.util.Random;
import meteordevelopment.meteorclient.events.entity.player.AttackEntityEvent;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.combat.CrystalAura;
import meteordevelopment.meteorclient.systems.modules.combat.Surround;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.client.MinecraftClient;

public class iIIiIIIiII
extends iiiiIiIiii {
    private boolean IiiIIIiiIi;
    private final SettingGroup iiIIiiIiii;
    private final Setting<Boolean> iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private final Setting<Criticals.Mode> iiIiIIiIIi;
    private final Setting<Boolean> IIIIiIiiIi;
    private boolean IiIiIIIIiI;
    private final Random iiiiiIIiiI;
    private long iiIIIIiIII;
    private final Setting<Boolean> IiIIiIiiiI;
    private final Setting<Boolean> ALLATORIxDEMO;

    private /* synthetic */ boolean iIIiiiIiiI() {
        int n;
        iIIiIIIiII iIIiIIIiII2 = iIIiIIIiII3;
        class_238 class_2383 = iIIiIIIiII2.iiIIIIiIII.player.getBoundingBox();
        iIIiIIIiII iIIiIIIiII3 = new class_2338.class_2339();
        int n2 = n = (int)Math.floor(class_2383.minX);
        while ((double)n2 < Math.ceil(class_2383.maxX)) {
            int n3 = (int)Math.floor(class_2383.minY);
            while ((double)n3 < Math.ceil(class_2383.maxY)) {
                int n4;
                int n5 = (int)Math.floor(class_2383.minZ);
                while ((double)n5 < Math.ceil(class_2383.maxZ)) {
                    int n6;
                    iIIiIIIiII3.set(n, n4, n6);
                    iIIiIIIiII3.set(n, n4 + (2 ^ 3), n6);
                    if (!iIIiIIIiII2.iiIIIIiIII.world.getBlockState((class_2338)iIIiIIIiII3).getCollisionShape((class_1922)iIIiIIIiII2.iiIIIIiIII.world, (class_2338)iIIiIIIiII3).isEmpty() && !iIIiIIIiII2.iiIIIIiIII.world.getBlockState(iIIiIIIiII3.up()).getCollisionShape((class_1922)iIIiIIIiII2.iiIIIIiIII.world, iIIiIIIiII3.up()).isEmpty()) {
                        return 5 >> 2;
                    }
                    n5 = ++n6;
                }
                n3 = ++n4;
            }
            n2 = ++n;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1297 class_12972) {
        iIIiIIIiII iIIiIIIiII2 = this;
        if (!iIIiIIIiII2.iiIIIIiIII.player.isOnGround() || IiiiIiiIII.ALLATORIxDEMO((class_310)iIIiIIIiII2.iiIIIIiIII)) {
            return;
        }
        iIIiIIIiII iIIiIIIiII3 = iIIiIIIiII2;
        double d = iIIiIIIiII3.iiIIIIiIII.player.getX();
        double d2 = iIIiIIIiII3.iiIIIIiIII.player.getY();
        double d3 = iIIiIIIiII3.iiIIIIiIII.player.getZ();
        float f = iIIiIIIiII3.iiIIIIiIII.player.getYaw();
        float f2 = iIIiIIIiII3.iiIIIIiIII.player.getPitch();
        switch (((Criticals.Mode)((Object)iIIiIIIiII3.iiIiIIiIIi.get())).ordinal()) {
            case 0: {
                void IiIIiIiiiI;
                iIIiIIIiII iIIiIIIiII4 = iIIiIIIiII2;
                double d4 = 1.0E-7 + 1.0E-7 * (1.0 + (double)iIIiIIIiII4.iiiiiIIiiI.nextInt(iIIiIIIiII4.iiiiiIIiiI.nextBoolean() ? 0x26 & 0x7B : 43));
                iIIiIIIiII iIIiIIIiII5 = iIIiIIIiII2;
                double d5 = d;
                iIIiIIIiII2.ALLATORIxDEMO(d5, d2 + 0.1016 + d4 * 3.0, d3, 3 >> 2);
                iIIiIIIiII5.ALLATORIxDEMO(d5, d2 + 0.0202 + d4 * 2.0, d3, (3 & 4) != 0);
                iIIiIIIiII5.ALLATORIxDEMO(d, d2 + 3.239E-4 + d4, d3, (2 & 5) != 0);
                iIIiIIIiII5.iiIIIIiIII.player.addCritParticles((class_1297)IiIIiIiiiI);
                return;
            }
            case 1: {
                void IiIIiIiiiI;
                iIIiIIIiII iIIiIIIiII6 = iIIiIIIiII2;
                iIIiIIIiII6.ALLATORIxDEMO(d, d2 + 0.0625, d3, (3 & 4) != 0);
                iIIiIIIiII6.ALLATORIxDEMO(d, d2, d3, (2 & 5) != 0);
                iIIiIIIiII2.iiIIIIiIII.player.addCritParticles((class_1297)IiIIiIiiiI);
                return;
            }
            case 2: {
                if (System.currentTimeMillis() - iIIiIIIiII2.iiIIIIiIII < 500L) return;
                double d6 = d;
                iIIiIIIiII2.ALLATORIxDEMO(d6, d2 + 1.1E-7, d3, (3 & 4) != 0);
                iIIiIIIiII2.ALLATORIxDEMO(d6, d2 + 1.0E-8, d3, 5 >> 3);
                iIIiIIIiII2.IiIiIIIIiI = --1;
                iIIiIIIiII2.iiIIIIiIII = System.currentTimeMillis();
                return;
            }
            case 3: {
                if (((Boolean)iIIiIIIiII2.iIiiIiiiII.get()).booleanValue() && ((Boolean)iIIiIIIiII2.ALLATORIxDEMO.get() != false ? !iIIiIIIiII2.iIIiiiIiiI() : !iIIiIIIiII2.iiIiiiiiII())) {
                    return;
                }
                if (((Boolean)iIIiIIIiII2.IIIIiIiiIi.get()).booleanValue() && PlayerUtils.isMoving()) {
                    return;
                }
                if (System.currentTimeMillis() - iIIiIIIiII2.iiIIIIiIII < 250L || iIIiIIIiII2.iiIIIIiIII.player.isCrawling()) return;
                iIIiIIIiII iIIiIIIiII7 = iIIiIIIiII2;
                double d7 = d;
                iIIiIIIiII2.ALLATORIxDEMO(d7, d2 + 0.0625, d3, f, f2, (3 ^ 3) != 0);
                iIIiIIIiII7.ALLATORIxDEMO(d7, d2 + 0.0625013579, d3, f, f2, 5 >> 3);
                iIIiIIIiII7.ALLATORIxDEMO(d, d2 + 1.3579E-6, d3, f, f2, (3 & 4) != 0);
                iIIiIIIiII7.iiIIIIiIII = System.currentTimeMillis();
                return;
            }
            case 4: {
                if (((Boolean)iIIiIIIiII2.iIiiIiiiII.get()).booleanValue() && ((Boolean)iIIiIIIiII2.ALLATORIxDEMO.get() != false ? !iIIiIIIiII2.iIIiiiIiiI() : !iIIiIIIiII2.iiIiiiiiII())) {
                    return;
                }
                if (((Boolean)iIIiIIIiII2.IIIIiIiiIi.get()).booleanValue() && PlayerUtils.isMoving()) {
                    return;
                }
                if (iIIiIIIiII2.iiIIIIiIII.player.isCrawling()) return;
                iIIiIIIiII iIIiIIIiII8 = iIIiIIIiII2;
                double d8 = d;
                iIIiIIIiII2.ALLATORIxDEMO(d8, d2, d3, f, f2, (3 & 5) != 0);
                iIIiIIIiII8.ALLATORIxDEMO(d8, d2 + 0.0625, d3, f, f2, (2 & 5) != 0);
                iIIiIIIiII8.ALLATORIxDEMO(d, d2 + 0.04535, d3, f, f2, (3 & 4) != 0);
                return;
            }
            case 5: {
                iIIiIIIiII2.iiIIIIiIII.player.setVelocity(iIIiIIIiII2.iiIIIIiIII.player.getVelocity().x, 0.3425, iIIiIIIiII2.iiIIIIiIII.player.getVelocity().z);
                return;
            }
        }
    }

    public iIIiIIIiII() {
        iIIiIIIiII iIIiIIIiII2 = this;
        super(iiiiIiIiii.ALLATORIxDEMO, iiIIIiiIII.ALLATORIxDEMO("\u5248\u66ba\u51f9o"), com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u8b90\u6ba4\u6b18\u6550\u51c2\u9096\u624a\u51b1\u668d\u5190\u4f1d\u5bd8"));
        iIIiIIIiII2.iiIIiiIiii = iIIiIIIiII2.settings.getDefaultGroup();
        iIIiIIIiII2.iiIiIIiIIi = iIIiIIIiII2.iiIIiiIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIIIiiIII.ALLATORIxDEMO("\u6a23\u5f4b"))).description(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u66df\u51c2\u6550\u51e2\u76cf\u89df\u53ba\u6580\u5f64"))).defaultValue((Object)Criticals.Mode.iiIIIIiIII)).build());
        this.iIIiiIIIII = this.iiIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIiiIII.ALLATORIxDEMO("\u5914\u4ef9\u52e5"))).description(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u513d\u4eef\u6a4a\u576e\u5444\u7511\u659d\u4e46\u80b6\u89df\u53ba\u668d\u5190"))).defaultValue((Object)(3 >> 1))).build());
        this.iIiiIiiiII = this.iiIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIiiIII.ALLATORIxDEMO("\u4e8d\u536f\u589b\u65b2"))).description(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u4eae\u5711\u7693\u4f74\u72dd\u6018\u4e40\u5c24\u8bbe\u668d\u5190"))).defaultValue((Object)((2 & 5) != 0))).visible(() -> {
            if (this.iiIiIIiIIi.get() == Criticals.Mode.IiIIiIiiiI || this.iiIiIIiIIi.get() == Criticals.Mode.iiIIIIiIII) {
                return true;
            }
            return false;
        })).build());
        this.ALLATORIxDEMO = this.iiIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIiiIII.ALLATORIxDEMO("\u4ecb\u589b\u51c1"))).description(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u53a1\u5711\u5be7\u5151\u530a\u5711\u58f2\u91d5\u65bd\u89df\u53ba\u668d\u5190"))).defaultValue((Object)((2 & 5) != 0))).visible(() -> {
            if ((this.iiIiIIiIIi.get() == Criticals.Mode.IiIIiIiiiI || this.iiIiIIiIIi.get() == Criticals.Mode.iiIIIIiIII) && ((Boolean)this.iIiiIiiiII.get()).booleanValue()) {
                return 5 >> 2;
            }
            return false;
        })).build());
        this.IIIIiIiiIi = this.iiIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIiiIII.ALLATORIxDEMO("\u79e8\u52e0\u65f8\u6680\u5018"))).description(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u79c2\u52c3\u65ef\u4e46\u89df\u53ba\u668d\u5190"))).defaultValue((Object)((2 & 5) != 0))).visible(() -> {
            if (this.iiIiIIiIIi.get() == Criticals.Mode.IiIIiIiiiI || this.iiIiIIiIIi.get() == Criticals.Mode.iiIIIIiIII) {
                return true;
            }
            return false;
        })).build());
        this.IiIIiIiiiI = this.iiIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIiiIII.ALLATORIxDEMO("\u6c27\u663e\u65f8\u6680\u5018"))).description(com.github.mikumiku.addon.iIiiIiiiII.ALLATORIxDEMO("\u4f46\u7543\u6c0d\u661d\u5170\u73c4\u65ef\u4e46\u89df\u53ba\u668d\u5190"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        iIIiIIIiII iIIiIIIiII3 = this;
        iIIiIIIiII iIIiIIIiII4 = this;
        iIIiIIIiII iIIiIIIiII5 = this;
        iIIiIIIiII4.iiiiiIIiiI = new Random();
        iIIiIIIiII4.iiIIIIiIII = 0L;
        iIIiIIIiII3.IiIiIIIIiI = 2 & 5;
        iIIiIIIiII3.IiiIIIiiIi = 3 & 4;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIIIiiIII.ALLATORIxDEMO("%_\u0010R\u0006Vuf\u0005W\u0014Gegu\u8be4\u66a6\u65a4\u5265\u6713\u65f8\u7246\u672e\uff45"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(double d, double d2, double d3, float f, float f2, boolean bl) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        void IiIIiIiiiI5;
        boolean bl2 = bl;
        iIIiIIIiII IiIIiIiiiI6 = this;
        IiIIiIiiiI6.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)IiiiIiiIII.ALLATORIxDEMO((double)IiIIiIiiiI5, (double)IiIIiIiiiI4, (double)IiIIiIiiiI3, (float)IiIIiIiiiI2, (float)IiIIiIiiiI, (boolean)this));
    }

    private /* synthetic */ boolean iiIiiiiiII() {
        int n;
        iIIiIIIiII iIIiIIIiII2 = iIIiIIIiII3;
        iIIiIIIiII iIIiIIIiII3 = iIIiIIIiII2.iiIIIIiIII.player.getBoundingBox();
        class_2338.class_2339 class_23392 = new class_2338.class_2339();
        int n2 = n = (int)Math.floor(((class_238)iIIiIIIiII3).minX);
        while ((double)n2 < Math.ceil(((class_238)iIIiIIIiII3).maxX)) {
            int n3 = (int)Math.floor(((class_238)iIIiIIIiII3).minY);
            while ((double)n3 < Math.ceil(((class_238)iIIiIIIiII3).maxY)) {
                int n4;
                int n5 = (int)Math.floor(((class_238)iIIiIIIiII3).minZ);
                while ((double)n5 < Math.ceil(((class_238)iIIiIIIiII3).maxZ)) {
                    int n6;
                    class_23392.set(n, n4, n6);
                    if (!iIIiIIIiII2.iiIIIIiIII.world.getBlockState((class_2338)class_23392).getCollisionShape((class_1922)iIIiIIIiII2.iiIIIIiIII.world, (class_2338)class_23392).isEmpty()) {
                        return (4 ^ 5) != 0;
                    }
                    n5 = ++n6;
                }
                n3 = ++n4;
            }
            n2 = ++n;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(AttackEntityEvent attackEntityEvent) {
        void IiIIiIiiiI;
        iIIiIIIiII iIIiIIIiII2 = iIIiIIIiII3;
        if (((Boolean)iIIiIIIiII2.IiIIiIiiiI.get()).booleanValue() && (iIIiIIIiII3 = (CrystalAura)Modules.get().get(CrystalAura.class)) != null && iIIiIIIiII3.isActive()) {
            return;
        }
        if (!((Boolean)iIIiIIIiII2.iIIiiIIIII.get()).booleanValue() && (Modules.get().isActive(Surround.class) || Modules.get().isActive(IIIIiIiIiI.class))) {
            return;
        }
        iIIiIIIiII iIIiIIIiII3 = IiIIiIiiiI.entity;
        if (iIIiIIIiII3 == null || !iIIiIIIiII3.isAlive() || !(iIIiIIIiII3 instanceof class_1309)) {
            return;
        }
        if (iIIiIIIiII2.iiIIIIiIII.player.isRiding() || IiiiIiiIII.IiiiiiiIIi((class_310)iIIiIIIiII2.iiIIIIiIII) || iIIiIIIiII2.iiIIIIiIII.player.isTouchingWater() || iIIiIIIiII2.iiIIIIiIII.player.isInLava() || iIIiIIIiII2.iiIIIIiIII.player.isClimbing() || iIIiIIIiII2.iiIIIIiIII.player.hasStatusEffect(class_1294.BLINDNESS)) {
            return;
        }
        iIIiIIIiII iIIiIIIiII4 = iIIiIIIiII2;
        iIIiIIIiII4.IiiIIIiiIi = iIIiIIIiII4.iiIIIIiIII.player.isSprinting();
        if (iIIiIIIiII4.IiiIIIiiIi) {
            iIIiIIIiII2.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)new class_2848((class_1297)iIIiIIIiII2.iiIIIIiIII.player, class_2848.class_2849.STOP_SPRINTING));
        }
        iIIiIIIiII2.ALLATORIxDEMO((class_1297)iIIiIIIiII3);
    }

    public String getInfoString() {
        return ((Criticals.Mode)((Object)this.iiIiIIiIIi.get())).name();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(double d, double d2, double d3, boolean bl) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        boolean bl2 = bl;
        iIIiIIIiII IiIIiIiiiI4 = this;
        IiIIiIiiiI4.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)IiiiIiiIII.ALLATORIxDEMO((double)IiIIiIiiiI3, (double)IiIIiIiiiI2, (double)IiIIiIiiiI, (boolean)this));
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Sent sent) {
        iIIiIIIiII iIIiIIIiII2 = iIIiIIIiII3;
        iIIiIIIiII iIIiIIIiII3 = sent;
        iIIiIIIiII IiIIiIiiiI = iIIiIIIiII2;
        if (IiIIiIiiiI.iiIIIIiIII.player == null) {
            return;
        }
        if (((PacketEvent.Sent)iIIiIIIiII3).packet instanceof class_2824) {
            if (IiIIiIiiiI.IiIiIIIIiI) {
                IiIIiIiiiI.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)IiiiIiiIII.ALLATORIxDEMO(IiIIiIiiiI.iiIIIIiIII.player.getX(), IiIIiIiiiI.iiIIIIiIII.player.getY(), IiIIiIiiiI.iiIIIIiIII.player.getZ(), (2 & 5) != 0));
                IiIIiIiiiI.IiIiIIIIiI = 3 >> 2;
            }
            if (IiIIiIiiiI.IiiIIIiiIi) {
                IiIIiIiiiI.iiIIIIiIII.player.networkHandler.sendPacket((class_2596)new class_2848((class_1297)IiIIiIiiiI.iiIIIIiIII.player, class_2848.class_2849.START_SPRINTING));
                IiIIiIiiiI.IiiIIIiiIi = 3 >> 2;
            }
        }
    }
}

