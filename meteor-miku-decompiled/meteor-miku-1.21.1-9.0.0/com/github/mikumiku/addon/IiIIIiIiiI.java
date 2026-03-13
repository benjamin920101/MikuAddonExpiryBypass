/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.world.BlockView
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Position
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIIIiiIi;
import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiIiiIIiIi;
import com.github.mikumiku.addon.IiiiIIiiiI;
import com.github.mikumiku.addon.iIiIiIiIIi;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.BlockView;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

public class IiIIIiIiiI
extends iiiiIiIiii {
    private final Setting<Double> IIiiiIIIIi;
    private final Setting<Boolean> IIIiIIIiII;
    private final Setting<Integer> iiIiIiiiiI;
    private final Setting<Boolean> IIiiIiiiII;
    private final Setting<Double> IIIiIiiIIi;
    private final Setting<Boolean> iiiIiIiIIi;
    private final Setting<Boolean> iIiIiIiIii;
    private final Setting<Double> iiiiiIIIii;
    private final Setting<Double> iIIiIIiiII;
    private final Setting<Boolean> IiiIIiiiiI;
    private final Setting<Integer> IiIIIIiiii;
    private int IiiIIIiiIi;
    private long iiIIiiIiii;
    private final SettingGroup iIiiIiiiII;
    private final SettingGroup iIIiiIIIII;
    private final SettingGroup iiIiIIiIIi;
    private final Setting<Boolean> IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private final SettingGroup iiiiiIIiiI;
    private final Setting<Boolean> iiIIIIiIII;
    private final Setting<Integer> IiIIiIiiiI;
    private final Setting<Boolean> ALLATORIxDEMO;

    private /* synthetic */ class_243 ALLATORIxDEMO(class_1657 class_16572) {
        IiIIIiIiiI iiIIIiIiiI = iiIIIiIiiI2;
        IiIIIiIiiI iiIIIiIiiI2 = class_16572;
        IiIIIiIiiI IiIIiIiiiI = iiIIIiIiiI;
        class_243 class_2432 = new class_243(iiIIIiIiiI2.getX() - ((class_1657)iiIIIiIiiI2).lastRenderX, iiIIIiIiiI2.getY() - ((class_1657)iiIIIiIiiI2).lastRenderY, iiIIIiIiiI2.getZ() - ((class_1657)iiIIIiIiiI2).lastRenderZ);
        return iiIIIiIiiI2.getPos().add(class_2432.multiply((double)((Integer)IiIIiIiiiI.IiIIIIiiii.get()).intValue()));
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        IiIIIiIiiI iiIIIiIiiI = this;
        if (((Boolean)iiIIIiIiiI.iiIIIIiIII.get()).booleanValue()) {
            int n = IIIiIiIiii.ALLATORIxDEMO(class_2246.COBWEB.asItem());
            if (n != -4 >> 2) {
                return n;
            }
        }
        return IIIiIiIiii.ALLATORIxDEMO(class_2246.OBSIDIAN.asItem());
    }

    private /* synthetic */ boolean iiIiiiiiII(class_2338 class_23382) {
        IiIIIiIiiI iiIIIiIiiI = iiIIIiIiiI2;
        IiIIIiIiiI iiIIIiIiiI2 = class_23382;
        IiIIIiIiiI IiIIiIiiiI = iiIIIiIiiI;
        if (IiIIiIiiiI.iiIIIIiIII.player.getPos().distanceTo(iiIIIiIiiI2.toCenterPos()) <= (Double)IiIIiIiiiI.iIIiIIiiII.get() && IiIIiIiiiI.iiIIIIiIII.world.getBlockState((class_2338)iiIIIiIiiI2).isReplaceable()) {
            return (3 & 5) != 0;
        }
        return false;
    }

    private /* synthetic */ boolean IiiIIIIiiI(class_2338 class_23382) {
        IiIIIiIiiI iiIIIiIiiI = iiIIIiIiiI2;
        IiIIIiIiiI iiIIIiIiiI2 = class_23382;
        IiIIIiIiiI IiIIiIiiiI = iiIIIiIiiI;
        if (!IiIIiIiiiI.iiIIIIiIII.world.getBlockState((class_2338)iiIIIiIiiI2).isAir()) {
            return 5 >> 3;
        }
        return IiIIiIiiiI.iiIIIIiIII.world.getBlockState(iiIIIiIiiI2.down()).isSolidBlock((class_1922)IiIIiIiiiI.iiIIIIiIII.world, iiIIIiIiiI2.down());
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        IiIIIiIiiI iiIIIiIiiI = iiIIIiIiiI2;
        IiIIIiIiiI iiIIIiIiiI2 = class_23382;
        IiIIIiIiiI IiIIiIiiiI = iiIIIiIiiI;
        if (!IiIIiIiiiI.iiIIIIiIII.world.getOtherEntities(null, new class_238((class_2338)iiIIIiIiiI2)).isEmpty()) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IiiIIIIiiI(class_2338 class_23382) {
        void IiIIiIiiiI;
        IiIIIiIiiI iiIIIiIiiI = this;
        int n = IIIiIiIiii.ALLATORIxDEMO(class_2246.OBSIDIAN.asItem());
        if (n == -4 >> 2) {
            return;
        }
        IIIiIiIiii.ALLATORIxDEMO(n);
        iiiIIIIiiI.IiIiiiIIiI((class_2338)IiIIiIiiiI);
        IIIiIiIiii.ALLATORIxDEMO(n);
    }

    /*
     * WARNING - void declaration
     */
    public List<class_2338> ALLATORIxDEMO(class_243 class_2432, double d) {
        int n;
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IiIIIiIiiI iiIIIiIiiI = this;
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        class_2338 class_23382 = class_2338.ofFloored((class_2374)IiIIiIiiiI2);
        int n2 = (int)Math.ceil((double)IiIIiIiiiI);
        int n3 = n = -n2;
        while (n3 <= n2) {
            int n4 = -n2;
            while (n4 <= n2) {
                int n5;
                int n6 = -n2;
                while (n6 <= n2) {
                    int n7;
                    class_2338 class_23383 = class_23382.add(n, n5, n7);
                    if (IiIIiIiiiI2.distanceTo(class_23383.toCenterPos()) <= IiIIiIiiiI) {
                        arrayList.add(class_23383);
                    }
                    n6 = ++n7;
                }
                n4 = ++n5;
            }
            n3 = ++n;
        }
        return arrayList;
    }

    private /* synthetic */ List<class_1657> ALLATORIxDEMO() {
        return this.iiIIIIiIII.world.getPlayers().stream().filter(class_7422 -> {
            IiIIIiIiiI iiIIIiIiiI = iiIIIiIiiI2;
            IiIIIiIiiI iiIIIiIiiI2 = class_7422;
            IiIIIiIiiI IiIIiIiiiI = iiIIIiIiiI;
            if (iiIIIiIiiI2 != IiIIiIiiiI.iiIIIIiIII.player) {
                return 5 >> 2;
            }
            return false;
        }).filter(IiIIiIiiiI -> {
            if (!IiIIiIiiiI.isDead()) {
                return 3 >> 1;
            }
            return false;
        }).filter(class_7422 -> {
            IiIIIiIiiI iiIIIiIiiI = iiIIIiIiiI2;
            IiIIIiIiiI iiIIIiIiiI2 = class_7422;
            IiIIIiIiiI IiIIiIiiiI = iiIIIiIiiI;
            if ((double)iiIIIiIiiI2.distanceTo((class_1297)IiIIiIiiiI.iiIIIIiIII.player) <= (Double)IiIIiIiiiI.IIiiiIIIIi.get()) {
                return --1 != 0;
            }
            return false;
        }).collect(Collectors.toList());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IiiiiiiIIi(class_2338 class_23382) {
        Iterator iterator;
        IiIIIiIiiI iiIIIiIiiI = iiIIIiIiiI2;
        Iterator iterator2 = iterator = iiIIIiIiiI.iiIIIIiIII.world.getEntities().iterator();
        while (iterator2.hasNext()) {
            void IiIIiIiiiI;
            IiIIIiIiiI iiIIIiIiiI2 = (class_1297)iterator.next();
            if (iiIIIiIiiI2 == null) {
                iterator2 = iterator;
                continue;
            }
            if (!iiIIIiIiiI2.getBlockPos().equals((Object)IiIIiIiiiI)) {
                iterator2 = iterator;
                continue;
            }
            if (!(iiIIIiIiiI2 instanceof class_1511)) break;
            iIiIiIiIIi.ALLATORIxDEMO().ALLATORIxDEMO(new IiiiIIiiiI((float)Rotations.getYaw((class_1297)iiIIIiIiiI2), (float)Rotations.getPitch((class_1297)iiIIIiIiiI2)));
            IiIIIiIiiI iiIIIiIiiI3 = iiIIIiIiiI;
            iiIIIiIiiI.iiIIIIiIII.interactionManager.attackEntity((class_1657)iiIIIiIiiI3.iiIIIIiIII.player, (class_1297)iiIIIiIiiI2);
            iiIIIiIiiI3.iiIIIIiIII.player.swingHand(class_1268.MAIN_HAND);
            return;
        }
    }

    public IiIIIiIiiI() {
        IiIIIiIiiI iiIIIiIiiI = this;
        super(iiiiIiIiii.ALLATORIxDEMO, IiIiiIIiIi.ALLATORIxDEMO("\u81c9\u52e9\u5802\u575a"), IIIIIIiiIi.ALLATORIxDEMO("\u81e0\u52df\u5841\u5112\u6546\u4ecd\u5442\u5683\u76ae\u6d49\u7a7e"));
        iiIIIiIiiI.iiiiiIIiiI = iiIIIiIiiI.settings.getDefaultGroup();
        iiIIIiIiiI.iIIiiIIIII = iiIIIiIiiI.settings.createGroup(IiIiiIIiIi.ALLATORIxDEMO("\u651d\u7f2f\u8bd7\u7f65"));
        iiIIIiIiiI.iiIiIIiIIi = iiIIIiIiiI.settings.createGroup(IIIIIIiiIi.ALLATORIxDEMO("\u8374\u56de\u8be9\u7f64"));
        iiIIIiIiiI.iIiiIiiiII = iiIIIiIiiI.settings.createGroup(IiIiiIIiIi.ALLATORIxDEMO("\u5155\u4e97\u8bd7\u7f65"));
        iiIIIiIiiI.iiIiIiiiiI = iiIIIiIiiI.iiiiiIIiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u6549\u7f44\u5ea1\u8fd5"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u6bb3\u6b4a\u6537\u7f50\u65e5\u576e\u4e10\u95ca\u76d8\u5ed5\u8f9e\u659f\u95ff"))).defaultValue((Object)(0x77 & 0x3A))).min(5 >> 3).max(0x77FD & 0x9F6).sliderMax(0x1DFD & 0x63F6).build());
        this.IiIIiIiiiI = this.iiiiiIIiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u6bb8\u6b0b\u6549\u7f44\u6527\u91c5"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u6bb3\u6b4a}W?R\u6565\u7f50\u76d8\u659a\u5716\u6519\u91c4"))).defaultValue((Object)(3 & 5))).min(3 & 5).max(0x1E & 0x69).sliderMax(0x1C & 0x6B).build());
        this.IIiiIiiiII = this.iIIiiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u659c\u8f66"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u6500\u7f32\u65cf\u6590\u8f52\u526c\u76cd\u6846\u4f24\u7f65"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.IIIiIIIiII = this.iIIiiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u655a\u6319\u532f\u6569\u7f64"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u4f23\u7511\u652b\u6350\u5359\u8ff8\u880d\u6557\u7f65"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iiiIiIiIIi = this.iIIiiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u7843\u5765\u6c63\u667c"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u6565\u7f50\u5211\u7817\u570e\u6c5d\u667d"))).defaultValue((Object)(5 >> 2))).build());
        this.ALLATORIxDEMO = this.iIIiiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u8fac\u98f5\u66d5\u5056"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u8f87\u98e6\u65ad\u66bc\u5000\u7817\u570e\u6c5d\u667d"))).defaultValue((Object)((2 ^ 3) != 0))).visible(() -> this.iiiIiIiIIi.get())).build());
        this.IiIiIIIIiI = this.iIIiiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u68b7\u6d61\u6341\u6392"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u689c\u6d72\u6b38\u5716\u634a\u63bb\u76c5\u65d0\u575c"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iIIiIIiiII = this.iiIiIIiIIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u6549\u7f44\u8354\u56fe"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u6562\u7f57\u65e2\u5769\u76d8\u6723\u5966\u836a\u56ff"))).defaultValue(5.0).min(0.0).max(8.0).sliderMax(8.0).build());
        this.IIiiiIIIIi = this.iiIiIIiIIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u653b\u4e90\u8354\u56fe"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u689b\u6d75\u6510\u4e99\u76c5\u836a\u56ff"))).defaultValue(6.0).min(0.0).max(8.0).sliderMax(8.0).build());
        this.IIIiIiiIIi = this.iiIiIIiIIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u6d69\u7a5e\u8354\u56fe"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u5743\u6545\u4e84\u5434\u56cd\u6447\u7d1c\u6d42\u7a57\u76c5\u836a\u56ff"))).defaultValue(2.0).min(0.0).max(8.0).sliderMax(8.0).build());
        this.iiiiiIIIii = this.iiIiIIiIIi.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u819d\u8e81\u8354\u56fe"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u8dd4\u7985\u73f5\u5b8f\u76df\u673e\u5c53\u5baa\u5129\u8db4\u79b0"))).defaultValue(2.0).min(0.0).max(8.0).sliderMax(8.0).build());
        this.IiIIIIiiii = this.iIiiIiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u98f3\u6d61\u526c\u657a"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u98ef\u6d42\u6572\u4ee6\u4f74\u7f35\u76ba(J\"\u0002\u657b"))).defaultValue((Object)(4 ^ 5))).min(4 ^ 5).max(0x1F & 0x68).sliderMax(0x58 & 0x2F).build());
        this.iIiIiIiIii = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u4f08\u7502\u721e\u54eb\u66d5\u5056"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u4f23\u7511\u7232\u54ff\u65aa\u66a1\u501d\u5802\u575a"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.IiiIIiiiiI = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u7a0d\u4e07\u66d5\u5056"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u5711\u7a21\u4e13\u65aa\u66a1\u501d\u5802\u575a"))).defaultValue((Object)(5 >> 2))).build());
        this.IIIIiIiiIi = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u80bb\u532f\u5250\u6368"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u4f41\u7574\u80f5\u535e\u7257\u549d\u8ff8\u880d\u526e\u6369"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iiIIIIiIII = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u8732\u86ac\u7f7b\u4f4f\u5142"))).description(IiIiiIIiIi.ALLATORIxDEMO("\u4f64\u5123\u4f76\u7516\u8744\u86e2\u7f0a\u8032\u4e51\u660c\u9e90\u66b5\u77f8"))).defaultValue((Object)(--1 != 0))).build());
        IiIIIiIiiI iiIIIiIiiI2 = this;
        iiIIIiIiiI2.iiIIiiIiii = 0L;
        iiIIIiIiiI2.IiiIIIiiIi = 3 ^ 3;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIIIIIiiIi.ALLATORIxDEMO(" AU\f$oW_'n6~2+W\u8bdd\u66a3\u65ba\u5247\u672a\u65c7\u7262\u677b\uff0b"));
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IiIIIiIiiI iiIIIiIiiI = iiIIIiIiiI2;
        IiIIIiIiiI iiIIIiIiiI2 = pre;
        IiIIIiIiiI IiIIiIiiiI = iiIIIiIiiI;
        if (System.currentTimeMillis() - IiIIiIiiiI.iiIIiiIiii < (long)((Integer)IiIIiIiiiI.iiIiIiiiiI.get()).intValue()) {
            return;
        }
        IiIIiIiiiI.IiiIIIiiIi = 2 & 5;
        if (IiIIiIiiiI.ALLATORIxDEMO() == -4 >> 2) {
            return;
        }
        if (((Boolean)IiIIiIiiiI.iIiIiIiIii.get()).booleanValue() && IiIIiIiiiI.iiIIIIiIII.player.isUsingItem()) {
            return;
        }
        if (((Boolean)IiIIiIiiiI.IiiIIiiiiI.get()).booleanValue() && !IiIIiIiiiI.iiIIIIiIII.player.isOnGround()) {
            return;
        }
        IiIIiIiiiI.ALLATORIxDEMO().stream().flatMap(class_16572 -> {
            IiIIIiIiiI iiIIIiIiiI = iiIIIiIiiI2;
            IiIIIiIiiI iiIIIiIiiI2 = class_16572;
            IiIIIiIiiI IiIIiIiiiI = iiIIIiIiiI;
            return IiIIiIiiiI.ALLATORIxDEMO((class_1657)iiIIIiIiiI2).stream();
        }).filter(class_23382 -> {
            IiIIIiIiiI iiIIIiIiiI = iiIIIiIiiI2;
            IiIIIiIiiI iiIIIiIiiI2 = class_23382;
            IiIIIiIiiI IiIIiIiiiI = iiIIIiIiiI;
            if (iiIIIiIiiI2.toCenterPos().distanceTo(IiIIiIiiiI.iiIIIIiIII.player.getPos()) <= (Double)IiIIiIiiiI.iiiiiIIIii.get()) {
                return (3 & 4) != 0;
            }
            return IiIIiIiiiI.IiiIIIIiiI((class_2338)iiIIIiIiiI2);
        }).distinct().forEach(class_23382 -> {
            IiIIIiIiiI iiIIIiIiiI;
            IiIIIiIiiI iiIIIiIiiI2 = iiIIIiIiiI3;
            IiIIIiIiiI iiIIIiIiiI3 = class_23382;
            IiIIIiIiiI IiIIiIiiiI = iiIIIiIiiI2;
            if (iiIIIiIiiI3 == null) {
                return;
            }
            IiIIIiIiiI iiIIIiIiiI4 = IiIIiIiiiI;
            if (iiIIIiIiiI4.IiiIIIiiIi >= (Integer)iiIIIiIiiI4.IiIIiIiiiI.get()) {
                return;
            }
            if (IiIIiIiiiI.ALLATORIxDEMO() == -4 >> 2) {
                return;
            }
            if (!IiIIiIiiiI.iiIiiiiiII((class_2338)iiIIIiIiiI3)) {
                return;
            }
            IiIIIiIiiI iiIIIiIiiI5 = IiIIiIiiiI;
            if (((Boolean)IiIIiIiiiI.iiiIiIiIIi.get()).booleanValue()) {
                iiIIIiIiiI5.IiiiiiiIIi((class_2338)iiIIIiIiiI3);
                iiIIIiIiiI = IiIIiIiiiI;
            } else {
                if (iiIIIiIiiI5.ALLATORIxDEMO((class_2338)iiIIIiIiiI3)) {
                    return;
                }
                iiIIIiIiiI = IiIIiIiiiI;
            }
            iiIIIiIiiI.IiiIIIIiiI((class_2338)iiIIIiIiiI3);
            IiIIiIiiiI.IiiIIIiiIi += 5 >> 2;
            IiIIiIiiiI.iiIIiiIiii = System.currentTimeMillis();
        });
    }

    private /* synthetic */ List<class_2338> ALLATORIxDEMO(class_1657 class_16572) {
        IiIIIiIiiI IiIIiIiiiI;
        IiIIIiIiiI iiIIIiIiiI = iiIIIiIiiI2;
        IiIIIiIiiI iiIIIiIiiI2 = class_16572;
        IiIIIiIiiI iiIIIiIiiI3 = IiIIiIiiiI = iiIIIiIiiI;
        return iiIIIiIiiI3.ALLATORIxDEMO(IiIIiIiiiI.ALLATORIxDEMO((class_1657)iiIIIiIiiI2), (Double)iiIIIiIiiI3.IIIiIiiIIi.get());
    }
}

