/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.utils.BetterBlockPos
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.BlockUpdateEvent
 *  meteordevelopment.meteorclient.events.world.ChunkDataEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.pathing.BaritoneUtils
 *  meteordevelopment.meteorclient.pathing.NopPathManager
 *  meteordevelopment.meteorclient.pathing.PathManagers
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.math.ChunkPos
 *  net.minecraft.world.biome.Biome
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.chunk.Chunk
 *  net.minecraft.world.chunk.ChunkStatus
 *  net.minecraft.world.chunk.ChunkSection
 *  net.minecraft.world.Heightmap$Type
 *  net.minecraft.util.math.random.ChunkRandom
 *  net.minecraft.util.math.random.ChunkRandom$RandomProvider
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.util.math.random.Random
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.world.chunk.ReadableContainer
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import baritone.api.utils.BetterBlockPos;
import com.github.mikumiku.addon.IIIIiIIIii;
import com.github.mikumiku.addon.IiiIIIIIII;
import com.github.mikumiku.addon.IiiIIIIiiI;
import com.github.mikumiku.addon.iIiIIiiIiI;
import com.github.mikumiku.addon.iiIiiIIiIi;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.mixinface.MagicMix;
import com.seedfinding.mccore.version.MCVersion;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.BlockUpdateEvent;
import meteordevelopment.meteorclient.events.world.ChunkDataEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.pathing.BaritoneUtils;
import meteordevelopment.meteorclient.pathing.NopPathManager;
import meteordevelopment.meteorclient.pathing.PathManagers;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.Heightmap;
import net.minecraft.util.math.random.ChunkRandom;
import net.minecraft.util.math.MathHelper;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.chunk.ReadableContainer;

public class iiIiIIIIII
extends iiiiIiIiii {
    private final Setting<Boolean> iIiIiIiIii;
    private final Setting<Integer> iiiiiIIIii;
    private final Setting<Boolean> iIIiIIiiII;
    private final Setting<Integer> IiiIIiiiiI;
    private final Setting<MCVersion> IiIIIIiiii;
    private final Map<Long, Map<IIIIiIIIii, Set<class_243>>> IiiIIIiiIi;
    private int iiIIiiIiii;
    private final Setting<Boolean> iIiiIiiiII;
    private final SettingGroup iIIiiIIIII;
    private final Setting<Boolean> iiIiIIiIIi;
    public List<class_2338> IIIIiIiiIi;
    private final Setting<String> IiIiIIIIiI;
    private Map<class_5321<class_1959>, List<IIIIiIIIii>> iiiiiIIiiI;
    private final SettingGroup iiIIIIiIII;
    private final Setting<Boolean> IiIIiIiiiI;
    private iiIiiIIiIi ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        int n;
        iiIiIIIIII iiIiIIIIII2 = iiIiIIIIII3;
        iiIiIIIIII iiIiIIIIII3 = pre;
        iiIiIIIIII IiIIiIiiiI2 = iiIiIIIIII2;
        if (IiIIiIiiiI2.iiIIIIiIII.player == null || IiIIiIiiiI2.iiIIIIiIII.world == null || IiIIiIiiiI2.iiiiiIIiiI == null) {
            return;
        }
        if (((Boolean)IiIIiIiiiI2.IiIIiIiiiI.get()).booleanValue() && BaritoneUtils.IS_AVAILABLE) {
            iiIiIIIIII iiIiIIIIII4 = IiIIiIiiiI2;
            iiIiIIIIII4.iiIIiiIiii += 2 ^ 3;
            int this_ = (Integer)iiIiIIIIII4.IiiIIiiiiI.get() * (0x17 & 0x7C);
            if (IiIIiIiiiI2.iiIIiiIiii >= this_) {
                IiIIiIiiiI2.iiIIiiIiii = 5 >> 3;
                IiIIiIiiiI2.ALLATORIxDEMO();
            }
        }
        ArrayList<class_2338> this_ = new ArrayList<class_2338>();
        int n2 = --4;
        class_1923 class_19232 = IiIIiIiiiI2.iiIIIIiIII.player.getChunkPos();
        int n3 = n = 2 & 5;
        while (n3 <= n2) {
            int n4;
            int n5 = n4 = -n + class_19232.x;
            while (n5 <= n + class_19232.x) {
                this_.addAll(IiIIiIiiiI2.ALLATORIxDEMO(n4++, class_19232.z + n - n2));
                n5 = n4;
            }
            int n6 = n4 = -n + --1 + class_19232.x;
            while (n6 < n + class_19232.x) {
                this_.addAll(IiIIiIiiiI2.ALLATORIxDEMO(n4++, class_19232.z - n + n2 + --1));
                n6 = n4;
            }
            n3 = ++n;
        }
        if (((Boolean)IiIIiIiiiI2.iiIiIIiIIi.get()).booleanValue()) {
            this_.removeIf(IiIIiIiiiI -> {
                block3: {
                    block2: {
                        if (IiIIiIiiiI.getY() < (0xF & 0x77)) break block2;
                        if (IiIIiIiiiI.getY() <= (0x1E & 0x7F)) break block3;
                    }
                    return true;
                }
                return false;
            });
        }
        if (((Boolean)IiIIiIiiiI2.iIiiIiiiII.get()).booleanValue()) {
            this_.removeIf(IiIIiIiiiI -> {
                block3: {
                    block2: {
                        if (IiIIiIiiiI.getY() < (0xFFFFFFDE & 0xFFFFFFE7)) break block2;
                        if (IiIIiIiiiI.getY() <= (0xFFFFFFFE & 0xFFFFFFF7)) break block3;
                    }
                    return true;
                }
                return false;
            });
        }
        this_.sort(Comparator.comparingInt(class_23382 -> {
            iiIiIIIIII iiIiIIIIII2 = iiIiIIIIII3;
            iiIiIIIIII iiIiIIIIII3 = class_23382;
            iiIiIIIIII IiIIiIiiiI = iiIiIIIIII2;
            return Math.abs(iiIiIIIIII3.getX() - IiIIiIiiiI.iiIIIIiIII.player.getBlockX()) + Math.abs(iiIiIIIIII3.getZ() - IiIIiIiiiI.iiIIIIiIII.player.getBlockZ());
        }));
        MagicMix.oreGoals.addAll(this_);
    }

    public boolean IiiiiiiIIi() {
        if (this.isActive() && ((Boolean)this.iIIiIIiiII.get()).booleanValue() && iiIiIIIIII.ALLATORIxDEMO()) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    private static /* synthetic */ void ALLATORIxDEMO(Set set, class_6880 class_68802) {
        Set IiIIiIiiiI = class_68802;
        Set IiIIiIiiiI2 = set;
        IiIIiIiiiI2.add((class_5321)IiIIiIiiiI.getKey().get());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int ALLATORIxDEMO(class_2919 class_29192, int n) {
        void IiIIiIiiiI;
        iiIiIIIIII iiIiIIIIII2 = iiIiIIIIII3;
        iiIiIIIIII iiIiIIIIII3 = class_29192;
        iiIiIIIIII IiIIiIiiiI2 = iiIiIIIIII2;
        return Math.round((iiIiIIIIII3.nextFloat() - iiIiIIIIII3.nextFloat()) * (float)IiIIiIiiiI);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ ArrayList<class_243> ALLATORIxDEMO(class_638 class_6382, class_2919 class_29192, class_2338 class_23382, int n) {
        int n2;
        void IiIIiIiiiI;
        int n3 = n;
        iiIiIIIIII IiIIiIiiiI2 = this;
        ArrayList<class_243> arrayList = new ArrayList<class_243>();
        int n4 = IiIIiIiiiI.nextInt((int)(n6 + (3 >> 1)));
        int n5 = n2 = 3 & 4;
        while (n5 < n4) {
            void IiIIiIiiiI3;
            void IiIIiIiiiI4;
            int n6 = Math.min(n2, 0x7F & 7);
            iiIiIIIIII iiIiIIIIII2 = IiIIiIiiiI2;
            void v2 = IiIIiIiiiI;
            int n7 = IiIIiIiiiI2.ALLATORIxDEMO((class_2919)IiIIiIiiiI, n6) + IiIIiIiiiI4.getX();
            int n8 = iiIiIIIIII2.ALLATORIxDEMO((class_2919)v2, n6) + IiIIiIiiiI4.getY();
            int n9 = iiIiIIIIII2.ALLATORIxDEMO((class_2919)v2, n6) + IiIIiIiiiI4.getZ();
            if (IiIIiIiiiI3.getBlockState(new class_2338(n7, n8, n9)).isOpaque()) {
                if (IiIIiIiiiI2.ALLATORIxDEMO((class_638)IiIIiIiiiI3, new class_2338(n7, n8, n9), 1.0f, (class_2919)IiIIiIiiiI)) {
                    arrayList.add(new class_243((double)n7, (double)n8, (double)n9));
                }
            }
            n5 = ++n2;
        }
        return arrayList;
    }

    @EventHandler
    public void ALLATORIxDEMO(ChunkDataEvent chunkDataEvent) {
        iiIiIIIIII iiIiIIIIII2 = iiIiIIIIII3;
        iiIiIIIIII iiIiIIIIII3 = chunkDataEvent;
        iiIiIIIIII IiIIiIiiiI = iiIiIIIIII2;
        IiIIiIiiiI.ALLATORIxDEMO((class_2791)iiIiIIIIII3.chunk());
    }

    private /* synthetic */ void IiiIIIIiiI() {
        iiIiIIIIII iiIiIIIIII2 = iiIiiIIiIi2;
        iiIiiIIiIi iiIiiIIiIi2 = IiiIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO();
        if (iiIiiIIiIi2 == null) {
            return;
        }
        iiIiIIIIII iiIiIIIIII3 = iiIiIIIIII2;
        iiIiIIIIII3.ALLATORIxDEMO = iiIiiIIiIi2;
        iiIiIIIIII3.iiiiiIIiiI = IIIIiIIIii.ALLATORIxDEMO(PlayerUtils.getDimension());
        MagicMix.oreGoals.clear();
        iiIiIIIIII3.IiiIIIiiIi.clear();
        if (iiIiIIIIII3.iiIIIIiIII.world != null && iiIiIIIIII2.ALLATORIxDEMO != null) {
            iiIiIIIIII2.IiiiiiiIIi();
        }
    }

    private /* synthetic */ void IiiiiiiIIi() {
        iiIiIIIIII iiIiIIIIII2 = this;
        if (iiIiIIIIII2.iiIIIIiIII.player == null) {
            return;
        }
        Object object = this = Utils.chunks((boolean)false).iterator();
        while (object.hasNext()) {
            class_2791 class_27912 = (class_2791)this.next();
            object = this;
            iiIiIIIIII2.ALLATORIxDEMO(class_27912);
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iiIiIIIIII iiIiIIIIII2 = this;
        if (iiIiIIIIII2.iiIIIIiIII.player == null || iiIiIIIIII2.iiiiiIIiiI == null) {
            return;
        }
        if (IiiIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO() != null) {
            iiIiIIIIII iiIiIIIIII3 = iiIiIIIIII2;
            int n = iiIiIIIIII3.iiIIIIiIII.player.getChunkPos().x;
            int n2 = iiIiIIIIII3.iiIIIIiIII.player.getChunkPos().z;
            int n3 = (Integer)iiIiIIIIII3.iiiiiIIIii.get();
            int n4 = this = 3 >> 2;
            while (n4 <= n3) {
                void IiIIiIiiiI;
                int n5;
                int n6 = n5 = -this + n;
                while (n6 <= this + n) {
                    iiIiIIIIII2.ALLATORIxDEMO(n5++, n2 + this - n3, (Render3DEvent)IiIIiIiiiI);
                    n6 = n5;
                }
                int n7 = n5 = -this + (5 >> 2) + n;
                while (n7 < this + n) {
                    iiIiIIIIII2.ALLATORIxDEMO(n5++, n2 - this + n3 + (3 >> 1), (Render3DEvent)IiIIiIiiiI);
                    n7 = n5;
                }
                n4 = ++this;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ ArrayList<class_243> ALLATORIxDEMO(class_638 class_6382, class_2919 class_29192, int n, double d, double d2, double d3, double d4, double d5, double d6, int n2, int n3, int n4, int n5, int n6, float f) {
        double d7;
        void IiIIiIiiiI;
        double d8;
        double IiIIiIiiiI2;
        double IiIIiIiiiI3;
        double d9;
        double IiIIiIiiiI4;
        double d10;
        double IiIIiIiiiI5;
        double IiIIiIiiiI6;
        void IiIIiIiiiI7;
        void IiIIiIiiiI8;
        void IiIIiIiiiI9;
        iiIiIIIIII iiIiIIIIII2 = this;
        BitSet bitSet = new BitSet((int)(IiIIiIiiiI9 * IiIIiIiiiI8 * IiIIiIiiiI9));
        class_2338.class_2339 class_23392 = new class_2338.class_2339();
        double[] dArray = new double[IiIIiIiiiI7 * --4];
        ArrayList<class_243> arrayList = new ArrayList<class_243>();
        int n7 = this = 2 & 5;
        while (n7 < IiIIiIiiiI7) {
            void IiIIiIiiiI10;
            float f2 = (float)this / (float)IiIIiIiiiI7;
            d10 = class_3532.lerp((double)f2, (double)IiIIiIiiiI6, (double)IiIIiIiiiI5);
            d9 = class_3532.lerp((double)f2, (double)IiIIiIiiiI4, (double)IiIIiIiiiI10);
            d8 = class_3532.lerp((double)f2, (double)IiIIiIiiiI3, (double)IiIIiIiiiI2);
            d7 = IiIIiIiiiI.nextDouble() * (double)IiIIiIiiiI7 / 16.0;
            double d11 = ((double)(class_3532.sin((float)((float)Math.PI * f2)) + 1.0f) * d7 + 1.0) / 2.0;
            int n8 = this;
            dArray[this * --4] = d10;
            dArray[n8 * --4 + --1] = d9;
            dArray[n8 * --4 + --2] = d8;
            int n9 = this * --4 + --3;
            dArray[n9] = d11;
            n7 = ++this;
        }
        int n10 = this = 0;
        while (true) {
            if (n10 >= IiIIiIiiiI7 - --1) break;
            if (!(dArray[this * --4 + --3] <= 0.0)) {
                int n11 = this + (4 ^ 5);
                while (n11 < IiIIiIiiiI7) {
                    int n12;
                    if (!(dArray[n12 * --4 + --3] <= 0.0)) {
                        double d12;
                        d10 = dArray[this * --4] - dArray[n12 * --4];
                        d9 = dArray[this * --4 + (4 ^ 5)] - dArray[n12 * --4 + (3 & 5)];
                        d8 = dArray[this * --4 + (1 ^ 3)] - dArray[n12 * --4 + (1 ^ 3)];
                        d7 = dArray[this * --4 + --3] - dArray[n12 * --4 + --3];
                        double d13 = d10;
                        double d14 = d9;
                        double d15 = d8;
                        if (d12 * d12 > d13 * d13 + d14 * d14 + d15 * d15) {
                            double[] dArray2 = dArray;
                            if (d7 > 0.0) {
                                dArray2[n12 * --4 + --3] = -1.0;
                            } else {
                                dArray2[this * --4 + --3] = -1.0;
                            }
                        }
                    }
                    n11 = ++n12;
                }
            }
            n10 = ++this;
        }
        int n13 = this = 0;
        while (n13 < IiIIiIiiiI7) {
            double d16 = dArray[this * --4 + --3];
            if (!(d16 < 0.0)) {
                void IiIIiIiiiI11;
                void IiIIiIiiiI12;
                void IiIIiIiiiI13;
                double d17 = dArray[this * --4];
                IiIIiIiiiI6 = dArray[this * --4 + (5 >> 2)];
                IiIIiIiiiI5 = dArray[this * --4 + 2];
                int IiIIiIiiiI10 = Math.max(class_3532.floor((double)(d17 - d16)), (int)IiIIiIiiiI13);
                int n14 = Math.max(class_3532.floor((double)(IiIIiIiiiI6 - d16)), (int)IiIIiIiiiI12);
                int n15 = Math.max(class_3532.floor((double)(IiIIiIiiiI5 - d16)), (int)IiIIiIiiiI11);
                int n16 = Math.max(class_3532.floor((double)(d17 + d16)), IiIIiIiiiI10);
                int n17 = Math.max(class_3532.floor((double)(IiIIiIiiiI6 + d16)), n14);
                int n18 = Math.max(class_3532.floor((double)(IiIIiIiiiI5 + d16)), n15);
                int n19 = IiIIiIiiiI10;
                while (n19 <= n16) {
                    double d18;
                    int n20;
                    IiIIiIiiiI3 = ((double)n20 + 0.5 - d17) / d16;
                    if (d18 * d18 < 1.0) {
                        int n21 = n14;
                        while (n21 <= n17) {
                            int n22;
                            IiIIiIiiiI2 = ((double)n22 + 0.5 - IiIIiIiiiI6) / d16;
                            double d19 = IiIIiIiiiI3;
                            double d20 = IiIIiIiiiI2;
                            if (d19 * d19 + d20 * d20 < 1.0) {
                                int n23 = n15;
                                while (n23 <= n18) {
                                    int n24;
                                    IiIIiIiiiI4 = ((double)n24 + 0.5 - IiIIiIiiiI5) / d16;
                                    double d21 = IiIIiIiiiI3;
                                    double d22 = IiIIiIiiiI2;
                                    double d23 = IiIIiIiiiI4;
                                    if (d21 * d21 + d22 * d22 + d23 * d23 < 1.0 && !bitSet.get(IiIIiIiiiI4 = n20 - IiIIiIiiiI13 + (n22 - IiIIiIiiiI12) * IiIIiIiiiI9 + (n24 - IiIIiIiiiI11) * IiIIiIiiiI9 * IiIIiIiiiI8)) {
                                        bitSet.set(IiIIiIiiiI4);
                                        int n25 = n22;
                                        class_23392.set(n20, n25, n24);
                                        if (n25 >= (0xFFFFFFED & 0xFFFFFFD2)) {
                                            void IiIIiIiiiI14;
                                            void IiIIiIiiiI15;
                                            if (n22 < (0x114B & 0x6FF4) && IiIIiIiiiI15.getBlockState((class_2338)class_23392).isOpaque() && iiIiIIIIII2.ALLATORIxDEMO((class_638)IiIIiIiiiI15, (class_2338)class_23392, (float)IiIIiIiiiI14, (class_2919)IiIIiIiiiI)) {
                                                arrayList.add(new class_243((double)n20, (double)n22, (double)n24));
                                            }
                                        }
                                    }
                                    n23 = ++n24;
                                }
                            }
                            n21 = ++n22;
                        }
                    }
                    n19 = ++n20;
                }
            }
            n13 = ++this;
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ ArrayList<class_2338> ALLATORIxDEMO(int n, int n2) {
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        iiIiIIIIII iiIiIIIIII2 = arrayList;
        ArrayList arrayList = new ArrayList();
        long l = class_1923.toLong((int)IiIIiIiiiI3, (int)IiIIiIiiiI2);
        if (iiIiIIIIII2.IiiIIIiiIi.containsKey(l)) {
            iiIiIIIIII2.IiiIIIiiIi.get(l).entrySet().stream().filter(IiIIiIiiiI -> (Boolean)((IIIIiIIIii)IiIIiIiiiI.getKey()).IiIIIIiiii.get()).flatMap(IiIIiIiiiI -> ((Set)IiIIiIiiiI.getValue()).stream()).map(class_2338::ofFloored).forEach(arrayList::add);
        }
        return arrayList;
    }

    @Override
    public void onActivate() {
        super.onActivate();
        if (IiiIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO() == null) {
            this.error(IiiIIIIiiI.ALLATORIxDEMO("\u6719\u620b\u5225\u799e\u5b44\u3050\u8bcc\u5755\u79d4\u5b0f\u8bb0\u7f26\u4e3e\u8fc6\u5169\u7987\u5b4b\u5e2b\u70b7\u51b3\u5e8b\u7571"), new Object[3 ^ 3]);
            this.toggle();
            return;
        }
        if (PathManagers.get() instanceof NopPathManager) {
            this.info(iIiIIiiIiI.ALLATORIxDEMO("\u977c\u89c6\\\u0005\u001d5\u00153\u0013)\u0019"), new Object[3 & 4]);
            this.toggle();
            return;
        }
        this.info("\u6ce8\u610f\u79cd\u5b50\u662f\u5426\u6b63\u786e\u3002\u5f53\u524d\u79cd\u5b50: " + IiiIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO().IiIIiIiiiI + " \u7248\u672c: " + ((MCVersion)((Object)this.IiIIIIiiii.get())).name, new Object[3 & 4]);
        this.IiiIIIIiiI();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_638 class_6382, class_2338 class_23382, float f, class_2919 class_29192) {
        int n;
        class_2350[] IiIIiIiiiI;
        float f2 = f;
        iiIiIIIIII IiIIiIiiiI2 = this;
        if (f2 == 0.0f || f2 != 1.0f && IiIIiIiiiI.nextFloat() >= f2) {
            return true;
        }
        IiIIiIiiiI = class_2350.values();
        int n2 = IiIIiIiiiI.length;
        int n3 = n = 2 & 5;
        while (n3 < n2) {
            void IiIIiIiiiI3;
            void IiIIiIiiiI4;
            class_2350 class_23502 = IiIIiIiiiI[n];
            if (!IiIIiIiiiI4.getBlockState(IiIIiIiiiI3.add(class_23502.getVector())).isOpaque() && f2 != 1.0f) {
                return (3 ^ 3) != 0;
            }
            n3 = ++n;
        }
        return true;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iiIiIIIIII iiIiIIIIII2 = this;
        if (iiIiIIIIII2.iiIIIIiIII.player == null || !BaritoneUtils.IS_AVAILABLE) {
            return;
        }
        List<Object> list = new ArrayList<class_2338>();
        int n = 0x1D & 0x6A;
        class_1923 class_19232 = iiIiIIIIII2.iiIIIIiIII.player.getChunkPos();
        int n2 = class_23383 = 3 >> 2;
        while (n2 <= n) {
            int n3;
            int n4 = n3 = -class_23383 + class_19232.x;
            while (n4 <= class_23383 + class_19232.x) {
                list.addAll(iiIiIIIIII2.ALLATORIxDEMO(n3++, class_19232.z + class_23383 - n));
                n4 = n3;
            }
            int n5 = n3 = -class_23383 + --1 + class_19232.x;
            while (n5 < class_23383 + class_19232.x) {
                list.addAll(iiIiIIIIII2.ALLATORIxDEMO(n3++, class_19232.z - class_23383 + n + (3 >> 1)));
                n5 = n3;
            }
            n2 = ++class_23383;
        }
        if (list.isEmpty()) {
            return;
        }
        list.sort(Comparator.comparingInt(class_23382 -> {
            iiIiIIIIII iiIiIIIIII2 = iiIiIIIIII3;
            iiIiIIIIII iiIiIIIIII3 = class_23382;
            iiIiIIIIII IiIIiIiiiI = iiIiIIIIII2;
            return Math.abs(iiIiIIIIII3.getX() - IiIIiIiiiI.iiIIIIiIII.player.getBlockX()) + Math.abs(iiIiIIIIII3.getY() - IiIIiIiiiI.iiIIIIiIII.player.getBlockY()) + Math.abs(iiIiIIIIII3.getZ() - IiIIiIiiiI.iiIIIIiIII.player.getBlockZ());
        }));
        class_2338 class_23383 = (class_2338)list.get(3 ^ 3);
        BetterBlockPos betterBlockPos = BetterBlockPos.from((class_2338)class_23383);
        list = IIIIiIIIii.iIiiIiiiII.stream().filter(IiIIiIiiiI -> (Boolean)IiIIiIiiiI.get()).map(IiIIiIiiiI -> IiIIiIiiiI.description).map(IiIIiIiiiI -> IiIIiIiiiI.toLowerCase()).toList();
        try {
            if (!BaritoneAPI.getProvider().getPrimaryBaritone().getMineProcess().isActive()) {
                iiIiIIIIII2.info("\u8bbe\u7f6e\u6316\u6398\u76ee\u6807: " + class_23383.getX() + ", " + class_23383.getY() + ", " + class_23383.getZ(), new Object[2 & 5]);
                BaritoneAPI.getProvider().getPrimaryBaritone().getMineProcess().mineByName(list.toArray(new String[2 & 5]));
                return;
            }
        } catch (Exception exception) {
            iiIiIIIIII2.info("\u8bbe\u7f6e\u6316\u6398\u76ee\u6807\u5931\u8d25" + String.valueOf(exception), new Object[5 >> 3]);
        }
    }

    public void onDeactivate() {
        this.IiiIIIiiIi.clear();
        this.iiiiiIIiiI = null;
    }

    public iiIiIIIIII() {
        iiIiIIIIII iiIiIIIIII2 = iiIiIIIIII6;
        super(iIiIIiiIiI.ALLATORIxDEMO("\u798a\u5b2c\u77b8\u9073"), IiiIIIIiiI.ALLATORIxDEMO("\u79da\u5b01\u901c\u8993\u588f\u5f6d\u7247\u304b\u8fc7\u5177\u79d6\u5b0d\uff12\u7bcf\u51e4\u77a7\u727c\u5bcd\u9651\u4f1f\u7f3a\u3010\u6cfb\u615a\u5fd6\u982e\u4f4c\u755d\u57e9\u4edb\u5f64\u666a\u727b\u76f1\u7504\u4e58\u97c0\u3077\u57c9\u4efb^\u00102e|'K v?k+0q"));
        iiIiIIIIII iiIiIIIIII3 = iiIiIIIIII2;
        iiIiIIIIII2.IiiIIIiiIi = new ConcurrentHashMap<Long, Map<IIIIiIIIii, Set<class_243>>>();
        iiIiIIIIII2.ALLATORIxDEMO = null;
        iiIiIIIIII iiIiIIIIII4 = iiIiIIIIII2;
        iiIiIIIIII2.IIIIiIiiIi = new ArrayList<class_2338>();
        iiIiIIIIII2.iiIIiiIiii = 5 >> 3;
        iiIiIIIIII2.iIIiiIIIII = iiIiIIIIII2.settings.createGroup(iIiIIiiIiI.ALLATORIxDEMO("\u798a\u5b2c\u8bf9\u7f12"));
        iiIiIIIIII2.IiIiIIIIiI = iiIiIIIIII2.iIIiiIIIII.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u7989\u5b52"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u8fcf\u5102\u4e4a\u750b\u79b1\u5b37\u305e\uff4f\u9ea4\u8be3\u5040\u4e7dO\u0004O\u0012\u79b1\u5b17\uff75"))).defaultValue((Object)IiiIIIIiiI.ALLATORIxDEMO("\u001eB\u0000A\u0005L\u0002F\u007f9+b$a$g8~|2"))).build());
        iiIiIIIIII2.IiIIIIiiii = iiIiIIIIII2.iIIiiIIIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\n?\u720f\u6750"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u907c\u62afMz;q1a4h<\u720c\u672e"))).defaultValue((Object)MCVersion.v1_21)).build());
        iiIiIIIIII2.iIiIiIiIii = iiIiIIIIII2.iIIiiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u5ed3\u7554\u798a\u5b2c"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u708a\u518e\u5ed2\u7528\u4e19\u9737\u8baa\u7f3c\u7697\u7998\u5b5e\u54c4\u720c\u672e"))).defaultValue((Object)((3 ^ 3) != 0))).onChanged(bl -> {
            boolean bl22 = bl;
            iiIiIIIIII IiIIiIiiiI = this;
            if (bl22) {
                iiIiIIIIII iiIiIIIIII2;
                String bl22 = (String)IiIIiIiiiI.IiIiIIIIiI.get();
                if (!bl22.isEmpty()) {
                    IiiIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO(bl22, (MCVersion)((Object)((Object)IiIIiIiiiI.IiIIIIiiii.get())));
                    iiIiIIIIII iiIiIIIIII3 = IiIIiIiiiI;
                    iiIiIIIIII3.info("\u5df2\u8bbe\u7f6e\u79cd\u5b50: " + bl22 + " \u7248\u672c: " + ((MCVersion)((Object)((Object)iiIiIIIIII3.IiIIIIiiii.get()))).name, new Object[3 ^ 3]);
                    iiIiIIIIII iiIiIIIIII4 = IiIIiIiiiI;
                    iiIiIIIIII2 = iiIiIIIIII4;
                    iiIiIIIIII4.IiiIIIIiiI();
                } else {
                    IiIIiIiiiI.error(iIiIIiiIiI.ALLATORIxDEMO("\u8bb0\u5134\u8fd4\u5119\u798a\u5b2c"), new Object[2 & 5]);
                    iiIiIIIIII2 = IiIIiIiiiI;
                }
                iiIiIIIIII2.iIiIiIiIii.set((Object)((2 & 5) != 0 ? 1 : 0));
            }
        })).build());
        iiIiIIIIII iiIiIIIIII5 = iiIiIIIIII2;
        iiIiIIIIII5.iiIIIIiIII = iiIiIIIIII5.settings.getDefaultGroup();
        iiIiIIIIII5.iiiiiIIIii = iiIiIIIIII5.iiIIIIiIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u537d\u572b\u8344\u5688"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u662d\u796f\u532e\u5705\u7697\u8d88\u79b5\u4e42\u9614\u3000"))).defaultValue((Object)(--5))).min(--1).sliderMax(0x3B & 0x4E).build());
        iiIiIIIIII2.iIIiIIiiII = iiIiIIIIII2.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name("\u540c\u6b65\u8bbe\u7f6ebaritone" + (BaritoneUtils.IS_AVAILABLE ? iIiIIiiIiI.ALLATORIxDEMO("\uff4f3\f\uff75") : IiiIIIIiiI.ALLATORIxDEMO("\uff5d\u6caf\u6236\u5274\uff0b")))).description(iIiIIiiIiI.ALLATORIxDEMO("\u5c678\u0001)Io\b2\u0002\u77a3\u722e\u4f31\u7f09\u8be2\u7f29\u4e46\u798a\u5b2c\u7bd0\u5186\u76c3\u5be2\u9602\u4f31\u7f29\u307e"))).defaultValue((Object)(5 >> 3))).build());
        iiIiIIIIII2.IiIIiIiiiI = iiIiIIIIII2.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u76fa\u63ed\u5f44\u6314"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u4e6a\u5ea6\u8be9\u4f03\u756f\uff70\u9623\u9722\u5bd9\u5754\u4e4a\u4f66\u543a\u4e98"))).defaultValue((Object)((2 & 5) != 0))).build());
        iiIiIIIIII2.iiIiIIiIIi = iiIiIIIIII2.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u4e97\u6305\u6bde\u9ab6\u5b8e\u9682\u5338"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u8fb3\u53b0\u6be1\u9ae9\u5742q8gX%\u0012/G\u5c1e\u6767\u969a\u4e6a\uff70\u6371\u63c4\u650f\u73fb\u6747\u9aa4\uff4b\u626d\u4eab\u5c4d\u6351\u8fa5\u4edc\u307e"))).defaultValue((Object)(3 >> 2))).build());
        iiIiIIIIII2.iIiiIiiiII = iiIiIIIIII2.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u4e97\u6305\u94ee\u77fd\u5b8e\u9682\u5338"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u94fb\u77d3\u6b90\u9ad7\u577cJ\bW|Tb\u001ev\u0011+G\u5c1e\u6767\u969a\u4e6a\uff70\u6371\u63c4\u650f\u73fb\u6747\u9aa4\uff4b\u626d\u4eab\u5c4d\u6351\u8fa5\u4edc\u307e"))).defaultValue((Object)((3 & 4) != 0))).build());
        iiIiIIIIII2.IiiIIiiiiI = iiIiIIIIII2.iiIIIIiIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiiIIIIiiI.ALLATORIxDEMO("\u66fa\u65f8\u95b0\u9696"))).description(iIiIIiiIiI.ALLATORIxDEMO("\u8bf9\u7f12\u76a9\u687b\u76c3\u9588\u96d3\u658a\u95b3\uff74\u7995\uff75"))).defaultValue((Object)(5 >> 2))).min(--1).max(0x2E & 0x5B).sliderMax(0x1E & 0x6B).build());
        iiIiIIIIII iiIiIIIIII6 = iiIiIIIIII2.settings.createGroup(IiiIIIIiiI.ALLATORIxDEMO("\u77bb\u726b"));
        IIIIiIIIii.iIiiIiiiII.forEach(arg_0 -> ((SettingGroup)iiIiIIIIII6).add(arg_0));
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIiIIiiIiI.ALLATORIxDEMO("07Ez\u00149G)7\u0018\u0006(\"]g\u8b8b\u66b3\u65cc\u5277\u677c\u65f7\u7234\u676b\uff7d"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2791 class_27912) {
        void IiIIiIiiiI;
        iiIiIIIIII iiIiIIIIII2 = iIIIiIIIii;
        class_1923 class_19233 = IiIIiIiiiI.getPos();
        long l = class_19233.toLong();
        class_638 class_6382 = iiIiIIIIII2.iiIIIIiIII.world;
        if (iiIiIIIIII2.IiiIIIiiIi.containsKey(l) || class_6382 == null) {
            return;
        }
        Object object = new HashSet();
        class_1923.stream((class_1923)class_19233, (int)(4 ^ 5)).forEach(class_19232 -> {
            int n;
            class_2791 IiIIiIiiiI = class_19232;
            class_638 IiIIiIiiiI2 = class_6382;
            IiIIiIiiiI = IiIIiIiiiI2.getChunk(IiIIiIiiiI.x, IiIIiIiiiI.z, class_2806.BIOMES, 3 >> 2);
            if (IiIIiIiiiI == null) {
                return;
            }
            IiIIiIiiiI = IiIIiIiiiI.getSectionArray();
            int n2 = ((class_2826[])IiIIiIiiiI).length;
            int n3 = n = 3 >> 2;
            while (n3 < n2) {
                void IiIIiIiiiI3;
                class_7522 class_75222 = IiIIiIiiiI[n].getBiomeContainer();
                class_75222.forEachValue(arg_0 -> iiIiIIIIII.ALLATORIxDEMO((Set)IiIIiIiiiI3, arg_0));
                n3 = ++n;
            }
        });
        object = object.stream().flatMap(class_53212 -> {
            iiIiIIIIII iiIiIIIIII2 = iiIiIIIIII3;
            iiIiIIIIII iiIiIIIIII3 = class_53212;
            iiIiIIIIII IiIIiIiiiI = iiIiIIIIII2;
            return IiIIiIiiiI.ALLATORIxDEMO((class_5321<class_1959>)iiIiIIIIII3).stream();
        }).collect(Collectors.toSet());
        class_1923 class_19234 = class_19233;
        int n = class_19234.x << --4;
        int n2 = class_19234.z << --4;
        class_2919 class_29192 = new class_2919(class_2919.class_6675.XOROSHIRO.create(0L));
        long l2 = class_29192.setPopulationSeed(iiIiIIIIII2.ALLATORIxDEMO.IiIIiIiiiI.longValue(), n, n2);
        HashMap hashMap = new HashMap();
        object = object.iterator();
        while (object.hasNext()) {
            IIIIiIIIii iIIIiIIIii = (IIIIiIIIii)object.next();
            HashSet<class_243> hashSet = new HashSet<class_243>();
            IIIIiIIIii iIIIiIIIii2 = iIIIiIIIii;
            class_29192.setDecoratorSeed(l2, iIIIiIIIii2.ALLATORIxDEMO, iIIIiIIIii2.IiiIIIiiIi);
            int n3 = iIIIiIIIii.IIIiIiiIIi.get((class_5819)class_29192);
            int n4 = 5 >> 3;
            while (n4 < n3) {
                int n5;
                if (iIIIiIIIii.IIiiIiiiII == 1.0f || !(class_29192.nextFloat() >= 1.0f / iIIIiIIIii.IIiiIiiiII)) {
                    class_2919 class_29193 = class_29192;
                    int n6 = class_29193.nextInt(0x52 & 0x3D) + n;
                    int n7 = class_29193.nextInt(0x50 & 0x3F) + n2;
                    int n8 = iIIIiIIIii.iiIIIIiIII.get((class_5819)class_29192, iIIIiIIIii.iiIIiiIiii);
                    class_2338 class_23382 = new class_2338(n6, n8, n7);
                    class_5321 class_53213 = (class_5321)IiIIiIiiiI.getBiomeForNoiseGen(n6, n8, n7).getKey().get();
                    if (iiIiIIIIII2.ALLATORIxDEMO((class_5321<class_1959>)class_53213).contains(iIIIiIIIii)) {
                        HashSet<class_243> hashSet2 = hashSet;
                        if (iIIIiIIIii.iIiIiIiIii) {
                            hashSet2.addAll(iiIiIIIIII2.ALLATORIxDEMO(class_6382, class_29192, class_23382, iIIIiIIIii.IiIiIIIIiI));
                        } else {
                            Object object2 = iIIIiIIIii;
                            hashSet2.addAll(iiIiIIIIII2.ALLATORIxDEMO(class_6382, class_29192, class_23382, ((IIIIiIIIii)object2).IiIiIIIIiI, ((IIIIiIIIii)object2).IiIIiIiiiI));
                        }
                    }
                }
                n4 = ++n5;
            }
            if (hashSet.isEmpty()) continue;
            hashMap.put(iIIIiIIIii, hashSet);
        }
        iiIiIIIIII2.IiiIIIiiIi.put(l, hashMap);
    }

    public static boolean ALLATORIxDEMO() {
        boolean bl;
        try {
            Class.forName(IiiIIIIiiI.ALLATORIxDEMO("T\u0011D\u0019O\u0012@\r\u001b\u0012X\u0007\u001d7c6W\fP\u0017R0e:"), 3 >> 2, ClassLoader.getSystemClassLoader());
            bl = true;
        } catch (ClassNotFoundException classNotFoundException) {
            return (3 ^ 3) != 0;
        } catch (Throwable throwable) {
            return (3 ^ 3) != 0;
        }
        return bl;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(BlockUpdateEvent blockUpdateEvent) {
        iiIiIIIIII iiIiIIIIII2 = iiIiIIIIII3;
        iiIiIIIIII iiIiIIIIII3 = blockUpdateEvent;
        iiIiIIIIII IiIIiIiiiI = iiIiIIIIII2;
        if (((BlockUpdateEvent)iiIiIIIIII3).newState.isOpaque()) {
            return;
        }
        long l = class_1923.toLong((class_2338)((BlockUpdateEvent)iiIiIIIIII3).pos);
        if (IiIIiIiiiI.IiiIIIiiIi.containsKey(l)) {
            Iterator<Set<class_243>> iterator;
            iiIiIIIIII3 = class_243.of((class_2382)((BlockUpdateEvent)iiIiIIIIII3).pos);
            Iterator<Set<class_243>> iterator2 = iterator = IiIIiIiiiI.IiiIIIiiIi.get(l).values().iterator();
            while (iterator2.hasNext()) {
                iterator.next().remove(iiIiIIIIII3);
                iterator2 = iterator;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ ArrayList<class_243> ALLATORIxDEMO(class_638 class_6382, class_2919 class_29192, class_2338 class_23382, int n, float f) {
        int n2;
        void IiIIiIiiiI22;
        void IiIIiIiiiI;
        void IiIIiIiiiI3;
        iiIiIIIIII iiIiIIIIII2 = this;
        float f2 = IiIIiIiiiI3.nextFloat() * (float)Math.PI;
        float this22 = (float)IiIIiIiiiI / 8.0f;
        int n3 = class_3532.ceil((float)(((float)IiIIiIiiiI / 16.0f * 2.0f + 1.0f) / 2.0f));
        void v0 = IiIIiIiiiI22;
        void v1 = IiIIiIiiiI22;
        double d = (double)v1.getX() + Math.sin(f2) * (double)this22;
        double d2 = (double)v1.getX() - Math.sin(f2) * (double)this22;
        double d3 = (double)v1.getZ() + Math.cos(f2) * (double)this22;
        double d4 = (double)v1.getZ() - Math.cos(f2) * (double)this22;
        double d5 = v1.getY() + IiIIiIiiiI3.nextInt(--3) - --2;
        double d6 = v0.getY() + IiIIiIiiiI3.nextInt(--3) - --2;
        int IiIIiIiiiI22 = v0.getX() - class_3532.ceil((float)this22) - n3;
        int n4 = v0.getY() - --2 - n3;
        int n5 = v0.getZ() - class_3532.ceil((float)this22) - n3;
        int this22 = --2 * (class_3532.ceil((float)this22) + n3);
        n3 = (5 >> 1) * ((1 ^ 3) + n3);
        int n6 = n2 = IiIIiIiiiI22;
        while (n6 <= IiIIiIiiiI22 + this22) {
            int n7 = n5;
            while (n7 <= n5 + this22) {
                int n8;
                void IiIIiIiiiI4;
                if (n4 <= IiIIiIiiiI4.getTopY(class_2902.class_2903.MOTION_BLOCKING, n2, n8)) {
                    void IiIIiIiiiI5;
                    return iiIiIIIIII2.ALLATORIxDEMO((class_638)IiIIiIiiiI4, (class_2919)IiIIiIiiiI3, (int)IiIIiIiiiI, d, d2, d3, d4, d5, d6, IiIIiIiiiI22, n4, n5, this22, n3, (float)IiIIiIiiiI5);
                }
                n7 = ++n8;
            }
            n6 = ++n2;
        }
        return new ArrayList<class_243>();
    }

    private /* synthetic */ List<IIIIiIIIii> ALLATORIxDEMO(class_5321<class_1959> class_53212) {
        class_5321<class_1959> class_53213 = class_53214;
        class_5321<class_1959> class_53214 = class_53212;
        class_5321<class_1959> IiIIiIiiiI = class_53213;
        if (IiIIiIiiiI.iiiiiIIiiI.containsKey(class_53214)) {
            return IiIIiIiiiI.iiiiiIIiiI.get(class_53214);
        }
        return IiIIiIiiiI.iiiiiIIiiI.values().stream().findAny().get();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(int n, int n2, Render3DEvent render3DEvent) {
        void IiIIiIiiiI;
        int n32 = n2;
        iiIiIIIIII IiIIiIiiiI2 = this;
        long l = class_1923.toLong((int)IiIIiIiiiI, (int)n32);
        if (IiIIiIiiiI2.IiiIIIiiIi.containsKey(l)) {
            for (Map.Entry<IIIIiIIIii, Set<class_243>> n32 : IiIIiIiiiI2.IiiIIIiiIi.get(l).entrySet()) {
                if (!((Boolean)n32.getKey().IiIIIIiiii.get()).booleanValue()) continue;
                Iterator<class_243> iterator = n32.getValue().iterator();
                while (iterator.hasNext()) {
                    void IiIIiIiiiI3;
                    Iterator<class_243> iterator2;
                    class_243 class_2432 = iterator2.next();
                    IiIIiIiiiI3.renderer.boxLines(class_2432.x, class_2432.y, class_2432.z, class_2432.x + 1.0, class_2432.y + 1.0, class_2432.z + 1.0, n32.getKey().IIiiiIIIIi, 5 >> 3);
                    iterator = iterator2;
                }
            }
        }
    }
}

