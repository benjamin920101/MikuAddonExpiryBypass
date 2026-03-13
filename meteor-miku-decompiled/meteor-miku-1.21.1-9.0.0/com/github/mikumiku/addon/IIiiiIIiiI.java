/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.meteorclient.utils.world.Dimension
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiIIiIII;
import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.Dimension;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiiiIIiiI
extends iiiiIiIiii {
    private final Setting<ShapeMode> IIiiIiiiII;
    private final Set<class_2338> IIIiIiiIIi;
    private final SettingGroup iiiIiIiIIi;
    private final SettingGroup iIiIiIiIii;
    private final Setting<SettingColor> iiiiiIIIii;
    private int iIIiIIiiII;
    private class_2338 IiiIIiiiiI;
    private final Setting<Boolean> IiIIIIiiii;
    private final Setting<Boolean> IiiIIIiiIi;
    private int iiIIiiIiii;
    private final Setting<SettingColor> iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private int iiIiIIiIIi;
    private boolean IIIIiIiiIi;
    private final Set<class_2338> IiIiIIIIiI;
    private final Setting<Integer> iiiiiIIiiI;
    private final Setting<Integer> iiIIIIiIII;
    private final Setting<Boolean> IiIIiIiiiI;
    private int ALLATORIxDEMO;

    public IIiiiIIiiI() {
        IIiiiIIiiI iIiiiIIiiI = this;
        super(IiIiIIiIII.ALLATORIxDEMO("\u676b\u96ca\u6731\u57e5\u5ca2\u5bc4\u6255"), iiIIIIiiIi.ALLATORIxDEMO("\u5b85\u6262\u903f\u7577\u4eb7\u671b\u96ee\u6763\u76a1tEl\u57c3\u5cf2\u5301\u5786\uff3f\u001eC-\u0003e\u0019g\u0006e\u4e74\u95a9\r$M\u57e6\u5cb0P\u4e34\u5fb8\u7080\u4e51\u6580\u57a1\u5c90p\u4e34\u5fb8\u70a0\u4e70\u6580i\u6805\u9705\u57e3\u5cd2"));
        iIiiiIIiiI.iIiIiIiIii = iIiiiIIiiI.settings.getDefaultGroup();
        iIiiiIIiiI.iiiIiIiIIi = iIiiiIIiiI.settings.createGroup(IiIiIIiIII.ALLATORIxDEMO("\u6e0d\u67f8"));
        iIiiiIIiiI.iiiiiIIiiI = iIiiiIIiiI.iIiIiIiIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u6425\u7d79\u831a\u568f"))).description(IiIiIIiIII.ALLATORIxDEMO("\u6417\u7d1d\u57d1\u5c96\u76af\u831c\u56ff\uff17\u65b2\u5768\uff22"))).defaultValue((Object)(0x68A4 & 0x17DB))).min(0x5F & 0x30).max(0xFD6 & 0x7129).sliderRange(0x3A & 0x55, 0x1E88 & 0x61F7).build());
        this.iiIIIIiIII = this.iIiIiIiIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u6425\u7d79\u9006\u5edd"))).description(IiIiIIiIII.ALLATORIxDEMO("\u6bc4\u4e35\u007fVHT\u68eb\u67fa\u768f\u65a6\u575c\u654f\u91e4"))).defaultValue((Object)(0x2F5C & 0x5EB3))).min(0xF & 0x7A).max(0x4FB5 & 0x7E6A).sliderRange(0x4F & 0x3A, 0x3FD7 & 0x6738).build());
        this.IiIIiIiiiI = this.iIiIiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u6225\u5209\u65ad\u9003\u779e"))).description(IiIiIIiIII.ALLATORIxDEMO("\u6261\u523b,s\f\u57d1\u5c96\u65dd\u53ce\u900a\u8055\u5922\u6db7\u6044"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.IiIIIIiiii = this.iIiIiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u6225\u5209\u5455\u669b\u5027"))).description(IiIiIIiIII.ALLATORIxDEMO("\u6261\u523b,s\f\u57d1\u5c96\u5425\u81f5\u52a3\u669d\u5057\u6423\u7d09"))).defaultValue((Object)(5 >> 3))).build());
        this.IiiIIIiiIi = this.iiiIiIiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u6e49\u67ea\u6225\u5209\u76df\u5323\u57a4"))).description(IiIiIIiIII.ALLATORIxDEMO("\u6e2d\u67d8\u6241\u521b\u76bb\u0018g8\u57e5\u5ca2\u5305\u57f4"))).defaultValue((Object)(--1 != 0))).build());
        this.iIIiiIIIII = this.iiiIiIiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u9036\u899d\u6e2b\u67a8"))).description(IiIiIIiIII.ALLATORIxDEMO("\u6630\u542d\u9010\u89cd\u6e0d\u67f8\uff37\u53c4\u4efa\u969f\u5886\u7700\u520f\uff22"))).defaultValue((Object)((2 ^ 3) != 0))).visible(() -> this.IiiIIIiiIi.get())).build());
        this.IIiiIiiiII = this.iiiIiIiIIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u5f5b\u72ed\u6a38\u5f74"))).description(IiIiIIiIII.ALLATORIxDEMO("\u6e2d\u67d8\u5f7d\u72bd\u6a1e\u5f24"))).defaultValue((Object)ShapeMode.Both)).visible(() -> this.IiiIIIiiIi.get())).build());
        this.iiiiiIIIii = this.iiiIiIiIIi.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u4f9e\u9739\u9885\u8209"))).description(IiIiIIiIII.ALLATORIxDEMO(",s\f\u57d1\u5c96\u5311\u57c0\u768f\u4fb8\u9769\u98a3\u8259"))).defaultValue(new SettingColor(5 >> 3, 0x78 & 0x7F, 0xEFF & 0x71FF, 0x7F & 0x32)).visible(() -> this.IiiIIIiiIi.get())).build());
        this.iIiiIiiiII = this.iiiIiIiIIi.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u7e86\u673a\u9885\u8209"))).description(IiIiIIiIII.ALLATORIxDEMO(",s\f\u57d1\u5c96\u5311\u57c0\u768f\u7ea0\u676a\u98a3\u8259"))).defaultValue(new SettingColor(0x76 & 0x1D, 0xAD7 & 0x75BA, 0x4EE & 0x7BF7, 0x2DFF & 0x52FF)).visible(() -> this.IiiIIIiiIi.get())).build());
        IIiiiIIiiI iIiiiIIiiI2 = this;
        this.iIIiIIiiII = 3 & 4;
        this.ALLATORIxDEMO = this.iIIiIIiiII;
        this.iiIiIIiIIi = 3 >> 2;
        iIiiiIIiiI2.iiIIiiIiii = this.iiIiIIiIIi;
        iIiiiIIiiI2.IIIIiIiiIi = 3 & 5;
        IIiiiIIiiI iIiiiIIiiI3 = this;
        iIiiiIIiiI2.IIIiIiiIIi = new HashSet<class_2338>();
        IIiiiIIiiI iIiiiIIiiI4 = this;
        iIiiiIIiiI3.IiIiIIIIiI = new HashSet<class_2338>();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIIIIiiIi.ALLATORIxDEMO("n0\u001b}j\u001e9\u000eI?X/\\z9\u8b8c\u66ed\u65cb\u5209\u675b\u6589\u7213\u6735\uff7a"));
        }
    }

    public void onDeactivate() {
        IIiiiIIiiI iIiiiIIiiI = this;
        super.onDeactivate();
        IIiiiIIiiI iIiiiIIiiI2 = this;
        iIiiiIIiiI2.info("\u57fa\u5ca9\u641c\u7d22\u5df2\u505c\u6b62\u3002\u603b\u5171\u68c0\u67e5\u4e86 " + iIiiiIIiiI.iiIIiiIiii + " \u4e2a\u65b9\u5757\uff0c\u627e\u5230\u4e86 " + iIiiiIIiiI2.IIIiIiiIIi.size() + " \u4e2a3x3\u57fa\u5ca9\u533a\u57df\u3002", new Object[2 & 5]);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean IiiIIIIiiI(class_2338 object) {
        void IiIIiIiiiI;
        int n;
        IIiiiIIiiI iIiiiIIiiI = iIiiiIIiiI2;
        IIiiiIIiiI iIiiiIIiiI2 = object;
        object = iIiiiIIiiI;
        int n2 = n = -4 >> 2;
        while (true) {
            if (n2 > 1) break;
            int n3 = -4 >> 2;
            while (true) {
                int n4;
                if (n3 > 1) break;
                class_2338 class_23382 = iIiiiIIiiI2.add(n, 5 >> 3, n4);
                if (IiIIiIiiiI.iiIIIIiIII.world.getBlockState(class_23382).getBlock() != class_2246.BEDROCK) {
                    return 3 >> 2;
                }
                n3 = ++n4;
            }
            n2 = ++n;
        }
        class_2338 class_23383 = iIiiiIIiiI2.up();
        if (IiIIiIiiiI.iiIIIIiIII.world.getBlockState(class_23383).getBlock() != class_2246.BEDROCK) {
            return (3 ^ 3) != 0;
        }
        class_2338 class_23384 = iIiiiIIiiI2.down(--2);
        if (IiIIiIiiiI.iiIIIIiIII.world.getBlockState(class_23384).getBlock() == class_2246.BEDROCK) {
            return (2 & 5) != 0;
        }
        if (!IiIIiIiiiI.IiiiiiiIIi(class_23384)) {
            return (3 ^ 3) != 0;
        }
        if (IiIIiIiiiI.IIIiIiiIIi.contains(iIiiiIIiiI2)) {
            return (3 ^ 3) != 0;
        }
        void v3 = IiIIiIiiiI;
        v3.IIIiIiiIIi.add((class_2338)iIiiiIIiiI2);
        if (((Boolean)v3.IiIIiIiiiI.get()).booleanValue()) {
            IiIIiIiiiI.info("\ud83c\udf89 \u627e\u52303x3\u57fa\u5ca9\u533a\u57df\uff01\u4f4d\u7f6e: " + iIiiiIIiiI2.getX() + ", " + iIiiiIIiiI2.getY() + ", " + iIiiiIIiiI2.getZ(), new Object[3 ^ 3]);
            void v4 = IiIIiIiiiI;
            v4.info("\u8ddd\u79bb: " + v4.iiIIIIiIII.player.getBlockPos().getManhattanDistance((class_2382)iIiiiIIiiI2) + " \u683c", new Object[3 >> 2]);
        }
        if (((Boolean)IiIIiIiiiI.IiIIIIiiii.get()).booleanValue()) {
            IiIIiIiiiI.IIIIiIiiIi = 5 >> 3;
            IiIIiIiiiI.info(IiIiIIiIII.ALLATORIxDEMO("\u6403\u7d29\u5ded\u6689\u5063\uff27\u6241\u521b\u4e99\u76e5\u6818\u4f46\u7f51\u3029"), new Object[5 >> 3]);
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        IIiiiIIiiI iIiiiIIiiI = iIiiiIIiiI2;
        if (!((Boolean)iIiiiIIiiI.IiiIIIiiIi.get()).booleanValue() || iIiiiIIiiI.IIIiIiiIIi.isEmpty()) {
            return;
        }
        Iterator<class_2338> iterator = iIiiiIIiiI.IIIiIiiIIi.iterator();
        block0: while (true) {
            Iterator<class_2338> iterator2 = iterator;
            while (iterator2.hasNext()) {
                double d;
                double d2;
                double d3;
                double d4;
                double d5;
                void IiIIiIiiiI;
                class_2338 class_23382;
                int n;
                class_2338 class_23383 = iterator.next();
                if (!((Boolean)iIiiiIIiiI.iIIiiIIIII.get()).booleanValue() && !iIiiiIIiiI.ALLATORIxDEMO(class_23383)) {
                    iterator2 = iterator;
                    continue;
                }
                int n2 = this = -1;
                while (true) {
                    if (n2 > 1) break;
                    int n3 = -4 >> 2;
                    while (true) {
                        if (n3 > 1) break;
                        class_23382 = class_23383.add(this, 3 ^ 3, n);
                        if (((Boolean)iIiiiIIiiI.iIIiiIIIII.get()).booleanValue() || iIiiiIIiiI.ALLATORIxDEMO(class_23382)) {
                            class_2338 class_23384 = class_23382;
                            double d6 = class_23384.getX();
                            double d7 = class_23384.getY();
                            double d8 = class_23384.getZ();
                            double d9 = class_23384.getX() + --1;
                            double d10 = class_23384.getY() + --1;
                            double d11 = class_23384.getZ() + --1;
                            IiIIiIiiiI.renderer.box(d6, d7, d8, d9, d10, d11, (Color)iIiiiIIiiI.iiiiiIIIii.get(), (Color)iIiiiIIiiI.iIiiIiiiII.get(), (ShapeMode)iIiiiIIiiI.IIiiIiiiII.get(), 3 ^ 3);
                        }
                        n3 = ++n;
                    }
                    n2 = ++this;
                }
                IIiiiIIiiI iIiiiIIiiI2 = class_23383.up();
                n = ((Boolean)iIiiiIIiiI.iIIiiIIIII.get()).booleanValue() || iIiiiIIiiI.ALLATORIxDEMO((class_2338)iIiiiIIiiI2) ? 1 : 0;
                if (n != 0) {
                    IIiiiIIiiI iIiiiIIiiI3 = iIiiiIIiiI2;
                    double d12 = iIiiiIIiiI3.getX();
                    d5 = iIiiiIIiiI3.getY();
                    d4 = iIiiiIIiiI3.getZ();
                    d3 = iIiiiIIiiI3.getX() + (2 ^ 3);
                    d2 = iIiiiIIiiI3.getY() + (2 ^ 3);
                    d = iIiiiIIiiI3.getZ() + (2 ^ 3);
                    int n4 = 0x4FFF & 0x30FF;
                    IiIIiIiiiI.renderer.box(d12, d5, d4, d3, d2, d, (Color)new SettingColor(0x3FF & 0x7CFF, 0x7AFF & 0x5FF, 3 >> 2, 0x78 & 0x7F), (Color)new SettingColor(n4, n4, 3 >> 2, n4), (ShapeMode)iIiiiIIiiI.IIiiIiiiII.get(), 3 >> 2);
                }
                class_23382 = class_23383.down(--2);
                boolean bl = ((Boolean)iIiiiIIiiI.iIIiiIIIII.get()).booleanValue() || iIiiiIIiiI.ALLATORIxDEMO(class_23382);
                boolean bl2 = bl;
                if (!bl2) continue block0;
                class_2338 class_23385 = class_23382;
                d5 = class_23385.getX();
                d4 = class_23385.getY();
                d3 = class_23385.getZ();
                d2 = class_23385.getX() + (3 & 5);
                d = class_23385.getY() + (3 >> 1);
                double d13 = class_23385.getZ() + (3 & 5);
                int n5 = 5 >> 3;
                int n6 = 3 & 4;
                IiIIiIiiiI.renderer.box(d5, d4, d3, d2, d, d13, (Color)new SettingColor(n5, 0x39FF & 0x46FF, n5, 0x65 & 0x7E), (Color)new SettingColor(n6, 0x40FF & 0x3FFF, n6, 0x1FDF & 0x60E8), (ShapeMode)iIiiiIIiiI.IIiiIiiiII.get(), 2 & 5);
                continue block0;
            }
            break;
        }
    }

    public void IiiIIIIiiI() {
        IIiiiIIiiI iIiiiIIiiI = this;
        iIiiiIIiiI.IiiiiiiIIi();
        iIiiiIIiiI.info(IiIiIIiIII.ALLATORIxDEMO("\u91d2\u65bb\u5f1f\u59c0\u6403\u7d29\fS\f\u57d1\u5cb6\u5331\u57c0%\u0011\u0005"), new Object[3 >> 2]);
    }

    public String ALLATORIxDEMO() {
        Object object = string;
        if (!object.isActive()) {
            return iiIIIIiiIi.ALLATORIxDEMO("\u57e3\u5cd2\u5be2\u6205\u5651a\u0019\u6771\u5436\u7553");
        }
        String string = ((IIiiiIIiiI)object).IIIIiIiiIi ? IiIiIIiIII.ALLATORIxDEMO("\u6417\u7d1d\u4e06") : iiIIIIiiIi.ALLATORIxDEMO("\u5da9\u669b\u5027");
        Object[] objectArray = new Object[--5];
        objectArray[3 & 4] = string;
        objectArray[3 >> 1] = ((IIiiiIIiiI)object).iIIiIIiiII;
        objectArray[1 ^ 3] = ((IIiiiIIiiI)object).iiiiiIIiiI.get();
        objectArray[--3] = ((IIiiiIIiiI)object).iiIIiiIiii;
        objectArray[--4] = ((IIiiiIIiiI)object).IIIiIiiIIi.size();
        return String.format(IiIiIIiIII.ALLATORIxDEMO("\u57e5\u5ca2\u5be6\u6277\u566b-xid#n&\u5358\u5f82#-=hwi[\u000bC\u000b\u5ded\u68cb\u67fa1?.[\u000bC\u000b\u6261\u523b%+\u001aO"), objectArray);
    }

    private /* synthetic */ boolean IiiiiiiIIi() {
        if (this.iiIIIIiIII.world == null) {
            return (2 & 5) != 0;
        }
        return PlayerUtils.getDimension().equals((Object)Dimension.Nether);
    }

    @Override
    public void onActivate() {
        IIiiiIIiiI iIiiiIIiiI = this;
        super.onActivate();
        iIiiiIIiiI.IiiiiiiIIi();
        iIiiiIIiiI.info(IiIiIIiIII.ALLATORIxDEMO("\u5f1f\u59c0\u6403\u7d29\fS\f\u57d1\u5cb6\u5331\u57c0%\u0011\u0005"), new Object[3 ^ 3]);
    }

    private /* synthetic */ void IiiiiiiIIi() {
        if (this.iiIIIIiIII.player == null || this.iiIIIIiIII.world == null) {
            return;
        }
        this.IiiIIiiiiI = this.iiIIIIiIII.player.getBlockPos();
        this.iIIiIIiiII = 3 >> 2;
        this.ALLATORIxDEMO = this.iIIiIIiiII;
        this.iiIiIIiIIi = 2 & 5;
        this.iiIIiiIiii = this.iiIiIIiIIi;
        this.IIIIiIiiIi = 2 ^ 3;
        this.IIIiIiiIIi.clear();
        this.IiIiIIIIiI.clear();
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IIiiiIIiiI iIiiiIIiiI;
        IIiiiIIiiI iIiiiIIiiI2;
        block7: {
            iIiiiIIiiI2 = this;
            if (iIiiiIIiiI2.iiIIIIiIII.player == null || iIiiiIIiiI2.iiIIIIiIII.world == null || !iIiiiIIiiI2.IiiiiiiIIi()) {
                iIiiiIIiiI2.error(iiIIIIiiIi.ALLATORIxDEMO("\u5f9e\u9842\u5773\u4e32\u7517\u6254\u8086\u4f66\u7553\u57c3\u5cf2\u5bc2\u6225\u5671\uff7a"), new Object[5 >> 3]);
                iIiiiIIiiI2.toggle();
                return;
            }
            if (!iIiiiIIiiI2.IIIIiIiiIi) {
                return;
            }
            int IiIIiIiiiI = (Integer)iIiiiIIiiI2.iiIIIIiIII.get();
            int n = this = 2 & 5;
            while (n < IiIIiIiiiI && iIiiiIIiiI2.IIIIiIiiIi) {
                if (!iIiiiIIiiI2.ALLATORIxDEMO()) {
                    iIiiiIIiiI = iIiiiIIiiI2;
                    iIiiiIIiiI2.IIIIiIiiIi = 5 >> 3;
                    break block7;
                }
                n = ++this;
                IIiiiIIiiI iIiiiIIiiI3 = iIiiiIIiiI2;
                iIiiiIIiiI3.iiIiIIiIIi += 3 & 5;
                iIiiiIIiiI3.iiIIiiIiii += --1;
            }
            iIiiiIIiiI = iIiiiIIiiI2;
        }
        IIiiiIIiiI iIiiiIIiiI4 = iIiiiIIiiI2;
        if (iIiiiIIiiI.iiIiIIiIIi >= iIiiiIIiiI4.iIIiIIiiII * iIiiiIIiiI4.iIIiIIiiII * --4) {
            IIiiiIIiiI iIiiiIIiiI5 = iIiiiIIiiI2;
            iIiiiIIiiI5.iIIiIIiiII += --1;
            iIiiiIIiiI5.iiIiIIiIIi = 3 & 4;
            if (iIiiiIIiiI5.iIIiIIiiII > (Integer)iIiiiIIiiI2.iiiiiIIiiI.get()) {
                IIiiiIIiiI iIiiiIIiiI6 = iIiiiIIiiI2;
                iIiiiIIiiI6.IIIIiIiiIi = 3 ^ 3;
                iIiiiIIiiI6.info("\u641c\u7d22\u5b8c\u6210\uff01\u641c\u7d22\u8303\u56f4\u5df2\u8fbe\u5230\u6700\u5927\u503c " + String.valueOf(iIiiiIIiiI6.iiiiiIIiiI.get()) + " \u683c\u3002", new Object[3 >> 2]);
                IIiiiIIiiI iIiiiIIiiI7 = iIiiiIIiiI2;
                iIiiiIIiiI7.info("\u603b\u5171\u68c0\u67e5\u4e86 " + iIiiiIIiiI2.iiIIiiIiii + " \u4e2a\u65b9\u5757\uff0c\u627e\u5230\u4e86 " + iIiiiIIiiI7.IIIiIiiIIi.size() + " \u4e2a3x3\u57fa\u5ca9\u533a\u57df\u3002", new Object[3 >> 2]);
                if (((Boolean)iIiiiIIiiI2.IiIIIIiiii.get()).booleanValue() && !iIiiiIIiiI2.IIIiIiiIIi.isEmpty()) {
                    iIiiiIIiiI2.IIIIiIiiIi = 2 & 5;
                }
            }
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        int n;
        IIiiiIIiiI iIiiiIIiiI;
        IIiiiIIiiI iIiiiIIiiI2 = iIiiiIIiiI = iIiiiIIiiI3;
        int n2 = iIiiiIIiiI.IiiIIiiiiI.getX() + (int)((double)iIiiiIIiiI2.iIIiIIiiII * Math.cos((double)iIiiiIIiiI.ALLATORIxDEMO * Math.PI / 180.0));
        int n3 = iIiiiIIiiI2.IiiIIiiiiI.getZ() + (int)((double)iIiiiIIiiI.iIIiIIiiII * Math.sin((double)iIiiiIIiiI.ALLATORIxDEMO * Math.PI / 180.0));
        int n4 = n = 0x7E & 0x7F;
        while (true) {
            if (n4 < 123) break;
            IIiiiIIiiI iIiiiIIiiI3 = new class_2338(n2, n, n3);
            if (!iIiiiIIiiI.IiIiIIIIiI.contains(iIiiiIIiiI3)) {
                IIiiiIIiiI iIiiiIIiiI4 = iIiiiIIiiI;
                iIiiiIIiiI4.IiIiIIIIiI.add((class_2338)iIiiiIIiiI3);
                if (iIiiiIIiiI4.iiIIIIiIII.world.getBlockState((class_2338)iIiiiIIiiI3).getBlock() == class_2246.BEDROCK && iIiiiIIiiI.IiiIIIIiiI((class_2338)iIiiiIIiiI3)) {
                    return (3 & 5) != 0;
                }
            }
            n4 = --n;
        }
        IIiiiIIiiI iIiiiIIiiI5 = iIiiiIIiiI;
        iIiiiIIiiI5.ALLATORIxDEMO += (0x1EB & 0x7F7C) / Math.max(3 >> 1, iIiiiIIiiI.iIIiIIiiII * (8 & 0x7F));
        if (iIiiiIIiiI5.ALLATORIxDEMO >= (0x97F & 0x77E8)) {
            iIiiiIIiiI.ALLATORIxDEMO = 3 ^ 3;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean IiiiiiiIIi(class_2338 class_23382) {
        int n;
        IIiiiIIiiI iIiiiIIiiI = object;
        int[][] nArrayArray = new int[--4][];
        int[] nArray = new int[1 ^ 3];
        int n2 = 3 & 4;
        nArray[n2] = 3 ^ 3;
        int n3 = 2 ^ 3;
        nArray[n3] = n3;
        nArrayArray[n2] = nArray;
        int[] nArray2 = new int[5 >> 1];
        nArray2[3 >> 2] = 3 & 4;
        int n4 = --1;
        nArray2[n4] = -4 >> 2;
        nArrayArray[n4] = nArray2;
        int[] nArray3 = new int[5 >> 1];
        nArray3[3 ^ 3] = 4 ^ 5;
        nArray3[--1] = 3 >> 2;
        nArrayArray[1 ^ 3] = nArray3;
        int[] nArray4 = new int[1 ^ 3];
        nArray4[2 & 5] = -4 >> 2;
        nArray4[--1] = 3 & 4;
        nArrayArray[--3] = nArray4;
        int[][] nArrayArray2 = nArrayArray;
        int n5 = nArrayArray.length;
        int n6 = n = 5 >> 3;
        while (n6 < n5) {
            int n7;
            block7: {
                int n8;
                void IiIIiIiiiI;
                Object object = nArrayArray2[n];
                object = IiIIiIiiiI.add((int)object[2 & 5], 3 >> 2, (int)object[4 ^ 5]);
                int cfr_ignored_0 = --1;
                int n9 = -4 >> 2;
                while (true) {
                    int n10;
                    int n11;
                    block6: {
                        if (n9 > 1) break;
                        int n12 = -4 >> 2;
                        while (true) {
                            int n13;
                            if (n12 > 1) break;
                            class_2338 class_23383 = object.add(n11, 3 ^ 3, n13);
                            if (iIiiiIIiiI.iiIIIIiIII.world.getBlockState(class_23383).getBlock() == class_2246.BEDROCK) {
                                n10 = 5 >> 3;
                                break block6;
                            }
                            n12 = ++n13;
                        }
                        n10 = n8;
                    }
                    if (n10 == 0) {
                        n7 = n8;
                        break block7;
                    }
                    n9 = ++n11;
                }
                n7 = n8;
            }
            if (n7 != 0) {
                return 5 >> 2;
            }
            n6 = ++n;
        }
        return false;
    }

    public void ALLATORIxDEMO() {
        IIiiiIIiiI iIiiiIIiiI = this;
        iIiiiIIiiI.IIIiIiiIIi.clear();
        iIiiiIIiiI.info(iiIIIIiiIi.ALLATORIxDEMO("\u5da9\u6e3c\u963f\u6279\u6752\u6267\u524b\u769d\u5781\u5c90\u5361\u57e6\u7f48\u5b41\u3079"), new Object[3 >> 2]);
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        IIiiiIIiiI iIiiiIIiiI = iIiiiIIiiI2;
        IIiiiIIiiI iIiiiIIiiI2 = class_23382;
        IIiiiIIiiI IiIIiIiiiI = iIiiiIIiiI;
        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) {
            return false;
        }
        IIiiiIIiiI iIiiiIIiiI3 = IiIIiIiiiI;
        class_243 class_2432 = iIiiiIIiiI3.iiIIIIiIII.player.getEyePos();
        iIiiiIIiiI2 = class_243.ofCenter((class_2382)iIiiiIIiiI2);
        if (iIiiiIIiiI3.iiIIIIiIII.world.raycast((class_3959)(iIiiiIIiiI2 = new class_3959(class_2432, (class_243)iIiiiIIiiI2, class_3959.class_3960.COLLIDER, class_3959.class_242.NONE, (class_1297)IiIIiIiiiI.iiIIIIiIII.player))).getType() == class_239.class_240.MISS) {
            return (3 & 5) != 0;
        }
        return false;
    }
}

