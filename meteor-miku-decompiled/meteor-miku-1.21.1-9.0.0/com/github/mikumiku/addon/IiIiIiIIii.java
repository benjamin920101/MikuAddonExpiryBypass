/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.world.Dimension
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.math.BlockPos
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIiIiIiI;
import com.github.mikumiku.addon.IiIiiIIiIi;
import com.github.mikumiku.addon.IiiIIIIIII;
import com.github.mikumiku.addon.IiiiIIiiIi;
import com.github.mikumiku.addon.iiIiiIIiII;
import com.github.mikumiku.addon.iiIiiIIiIi;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.structure.BastionRemnant;
import com.seedfinding.mcfeature.structure.BuriedTreasure;
import com.seedfinding.mcfeature.structure.DesertPyramid;
import com.seedfinding.mcfeature.structure.EndCity;
import com.seedfinding.mcfeature.structure.Fortress;
import com.seedfinding.mcfeature.structure.Igloo;
import com.seedfinding.mcfeature.structure.JunglePyramid;
import com.seedfinding.mcfeature.structure.Mansion;
import com.seedfinding.mcfeature.structure.Mineshaft;
import com.seedfinding.mcfeature.structure.Monument;
import com.seedfinding.mcfeature.structure.NetherFossil;
import com.seedfinding.mcfeature.structure.OceanRuin;
import com.seedfinding.mcfeature.structure.PillagerOutpost;
import com.seedfinding.mcfeature.structure.RegionStructure;
import com.seedfinding.mcfeature.structure.RuinedPortal;
import com.seedfinding.mcfeature.structure.Shipwreck;
import com.seedfinding.mcfeature.structure.Stronghold;
import com.seedfinding.mcfeature.structure.Structure;
import com.seedfinding.mcfeature.structure.SwampHut;
import com.seedfinding.mcfeature.structure.Village;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import lombok.Generated;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.world.Dimension;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.math.BlockPos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IiIiIiIIii
extends iiiiIiIiii {
    private final Setting<Boolean> iiiiIiiIIi;
    private CompletableFuture<Void> iiIIiIiiIi;
    private final Setting<Boolean> IiIiiiiIIi;
    private final SettingGroup iiIIiIiiII;
    private final Setting<Boolean> IIiIiiIiIi;
    private final Setting<Boolean> IIiIIiIIii;
    private final Setting<Boolean> iIiiIiiiii;
    private final SettingGroup iIiIiiIiiI;
    private final Setting<Boolean> IIiiiiiiII;
    private final Setting<Boolean> IIiiiIIIIi;
    private final Setting<Boolean> IIIiIIIiII;
    private final Setting<Boolean> iiIiIiiiiI;
    private final Setting<Boolean> IIiiIiiiII;
    private final Setting<Boolean> IIIiIiiIIi;
    private final Setting<Integer> iiiIiIiIIi;
    private final Setting<String> iIiIiIiIii;
    private final Setting<Boolean> iiiiiIIIii;
    @Generated
    private static final Logger iIIiIIiiII = LoggerFactory.getLogger(IiIiIiIIii.class);
    private final Setting<Boolean> IiiIIiiiiI;
    private final Setting<MCVersion> IiIIIIiiii;
    private final Setting<Boolean> IiiIIIiiIi;
    private final Setting<Boolean> iiIIiiIiii;
    private final Setting<Boolean> iIiiIiiiII;
    private boolean iIIiiIIIII;
    private final Setting<Boolean> iiIiIIiIIi;
    private final SettingGroup IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private final Setting<Boolean> iiiiiIIiiI;
    private final Setting<Boolean> iiIIIIiIII;
    private final Setting<Boolean> IiIIiIiiiI;
    private final Setting<Boolean> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(List<IiIIiIiIiI> list, class_2338 class_23382) {
        void IiIIiIiiiI;
        IiIiIiIIii iiIiIiIIii = this;
        if (IiIIiIiiiI.isEmpty()) {
            iiIiIiIIii.warning(IiiiIIiiIi.ALLATORIxDEMO("\u5705\u631c\u5b97\u8338\u56d9\u519e\u6727\u6265\u523d\u4ec0\u4f78\u7ee8\u67a9"), new Object[3 ^ 3]);
            return;
        }
        IiIIiIiiiI.sort((iiIIiIiIiI, iiIIiIiIiI2) -> {
            IiIIiIiIiI IiIIiIiiiI = iiIIiIiIiI2;
            IiIIiIiIiI IiIIiIiiiI2 = iiIIiIiIiI;
            return Double.compare(IiIIiIiiiI2.IiIIiIiiiI, IiIIiIiiiI.IiIIiIiiiI);
        });
        if (IiIiiIIiIi.ALLATORIxDEMO() == null) {
            iiIiIiIIii.warning(iiIiiIIiII.ALLATORIxDEMO("\u6581\u6c9b\u83d6\u53982$\u000e6D\u8deb\u5fc8\u70da\u96aa\u544b\uff40\u8b94\u7802\u4f9e\u5dbe\u5bea\u88a9\u001b-\u0006>\f\u575c\u56bd\u6a4d\u7e87"), new Object[3 ^ 3]);
            return;
        }
        int IiIIiIiiiI2 = 0;
        int n = this = 5 >> 3;
        while (n < IiIIiIiiiI.size()) {
            BPos bPos;
            String string;
            IiIIiIiIiI iiIIiIiIiI3 = (IiIIiIiIiI)IiIIiIiiiI.get(this);
            BPos bPos2 = iiIIiIiIiI3.ALLATORIxDEMO;
            if (((Boolean)iiIiIiIIii.IIiIiiIiIi.get()).booleanValue()) {
                Object[] objectArray = new Object[--3];
                objectArray[5 >> 3] = iiIIiIiIiI3.iiIIIIiIII;
                int n2 = 2 ^ 3;
                objectArray[n2] = this + n2;
                objectArray[5 >> 1] = iiIIiIiIiI3.IiIIiIiiiI;
                string = String.format(IiiiIIiiIi.ALLATORIxDEMO("\u001e^;.\u001eI;%>#\u000bKV\u0004"), objectArray);
                bPos = bPos2;
            } else {
                Object[] objectArray = new Object[5 >> 1];
                objectArray[5 >> 3] = iiIIiIiIiI3.iiIIIIiIII;
                int n3 = 4 ^ 5;
                objectArray[n3] = this + n3;
                string = String.format(iiIiiIIiII.ALLATORIxDEMO("i\u0010L`I'"), objectArray);
                bPos = bPos2;
            }
            ++IiIIiIiiiI2;
            IiIiiIIiIi.ALLATORIxDEMO(bPos.getX(), 0x64 & 0x7F, bPos2.getZ(), string, IiiiIIiiIi.ALLATORIxDEMO("\u7ee8\u67a9"));
            n = ++this;
        }
        Object[] objectArray = new Object[3 & 5];
        objectArray[2 & 5] = IiIIiIiiiI2;
        iiIiIiIIii.info(String.format(iiIiiIIiII.ALLATORIxDEMO("\u6452\u7d48\u5bc9\u627b\uff45\u6255\u5234lF\bc\u4e66\u7eb0\u67e8\uff4f\u5dbe\u6d98\u52cc\u5273\u0014\u0002)\u0011\u0003\u8dac\u5fe8\u70fa"), objectArray), new Object[2 & 5]);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(List<IiIIiIiIiI> list, Structure structure, long l, BiomeSource biomeSource, ChunkRand chunkRand, int n, int n2, int n3, String string) {
        void IiIIiIiiiI;
        IiIiIiIIii iiIiIiIIii = cPos2;
        try {
            void IiIIiIiiiI2;
            void IiIIiIiiiI3;
            void IiIIiIiiiI4;
            int IiIIiIiiiI5 = Math.max((int)(IiIIiIiiiI4 - IiIIiIiiiI3), -1073741824);
            int n4 = Math.min((int)(IiIIiIiiiI4 + IiIIiIiiiI3), 0x3FFFFFFF);
            int IiIIiIiiiI6 = Math.max((int)(IiIIiIiiiI2 - IiIIiIiiiI3), -1073741824);
            int n5 = Math.min((int)(IiIIiIiiiI2 + IiIIiIiiiI3), 0x3FFFFFFF);
            for (int i = IiIIiIiiiI5; i <= n4; ++i) {
                int n6 = IiIIiIiiiI6;
                while (n6 <= n5) {
                    int n7;
                    if (!iiIiIiIIii.iIIiiIIIII) {
                        return;
                    }
                    try {
                        void IiIIiIiiiI7;
                        void IiIIiIiiiI8;
                        CPos cPos;
                        CPos cPos2 = new CPos(i, n7);
                        if (!(Math.sqrt(Math.pow(cPos.getX() - IiIIiIiiiI4, 2.0) + Math.pow(cPos2.getZ() - IiIIiIiiiI2, 2.0)) > (double)IiIIiIiiiI3) && IiIIiIiiiI8.canSpawn(cPos2, (BiomeSource)IiIIiIiiiI7)) {
                            void IiIIiIiiiI9;
                            BPos bPos = new BPos(cPos2.getX() * (0x13 & 0x7C), 5 >> 3, cPos2.getZ() * (0x5C & 0x33));
                            double d = Math.sqrt(Math.pow(bPos.getX() - IiIIiIiiiI4 * (0x14 & 0x7B), 2.0) + Math.pow(bPos.getZ() - IiIIiIiiiI2 * (0x70 & 0x1F), 2.0));
                            IiIIiIiiiI9.add(new IiIIiIiIiI(bPos, d, (String)IiIIiIiiiI));
                        }
                    } catch (Exception exception) {
                        Object[] objectArray = new Object[--3];
                        objectArray[2 & 5] = i;
                        objectArray[--1] = n7;
                        objectArray[--2] = exception.getMessage();
                        iiIiIiIIii.warning(String.format(IiiiIIiiIi.ALLATORIxDEMO("\u591f\u740b\u5301\u577a;%\u001eI7(_\u0004;\u65fb\u51e1\u9514\u0001\r\u001e^"), objectArray), new Object[5 >> 3]);
                    }
                    n6 = ++n7;
                }
            }
        } catch (Exception IiIIiIiiiI5) {
            iiIiIiIIii.warning("\u641c\u7d22\u7ed3\u6784 " + (String)IiIIiIiiiI + " \u65f6\u51fa\u9519: " + IiIIiIiiiI5.getMessage(), new Object[2 & 5]);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IiiiiiiIIi(iiIiiIIiIi iiIiiIIiIi2, class_2338 class_23382) {
        void IiIIiIiiiI;
        IiIiIiIIii iiIiIiIIii = object;
        Object object = iiIiiIIiIi2;
        IiIiIiIIii IiIIiIiiiI2 = iiIiIiIIii;
        ArrayList<IiIIiIiIiI> arrayList = new ArrayList<IiIIiIiIiI>();
        try {
            if (object == null || ((iiIiiIIiIi)object).IiIIiIiiiI == null || ((iiIiiIIiIi)object).ALLATORIxDEMO == null) {
                IiIIiIiiiI2.error(iiIiiIIiII.ALLATORIxDEMO("\u7981\u5b33\u651c\u632d\u658c\u650b"), new Object[2 & 5]);
                return;
            }
            Object object2 = object;
            long l = ((iiIiiIIiIi)object2).IiIIiIiiiI;
            object = ((iiIiiIIiIi)object2).ALLATORIxDEMO;
            IiIIiIiiiI2.info("\u4f7f\u7528\u79cd\u5b50: " + l + ", \u7248\u672c: " + ((MCVersion)((Object)object)).name, new Object[3 >> 2]);
            BiomeSource biomeSource = BiomeSource.of(com.seedfinding.mccore.state.Dimension.OVERWORLD, (MCVersion)((Object)object), l);
            BiomeSource.of(com.seedfinding.mccore.state.Dimension.NETHER, (MCVersion)((Object)object), l);
            ChunkRand chunkRand = new ChunkRand();
            int n = (Integer)IiIIiIiiiI2.iiiIiIiIIi.get();
            if (n > (0x2BFD & 0x55F6)) {
                IiIIiIiiiI2.warning("\u641c\u7d22\u534a\u5f84\u8fc7\u5927 (" + n + ")\uff0c\u53ef\u80fd\u5bfc\u81f4\u6027\u80fd\u95ee\u9898\u6216\u9519\u8bef\u3002 ", new Object[5 >> 3]);
            }
            void v2 = IiIIiIiiiI;
            int n2 = v2.getX() >> --4;
            int n3 = v2.getZ() >> --4;
            if (((Boolean)IiIIiIiiiI2.ALLATORIxDEMO.get()).booleanValue()) {
                IiIIiIiiiI2.ALLATORIxDEMO(arrayList, new Village((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, IiiiIIiiIi.ALLATORIxDEMO("\u676a\u5ea9"));
            }
            if (((Boolean)IiIIiIiiiI2.IIiiiIIIIi.get()).booleanValue()) {
                IiIIiIiiiI2.ALLATORIxDEMO(arrayList, new Shipwreck((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, iiIiiIIiII.ALLATORIxDEMO("\u6ce5\u827a"));
            }
            if (((Boolean)IiIIiIiiiI2.IiIIiIiiiI.get()).booleanValue()) {
                IiIIiIiiiI2.ALLATORIxDEMO(arrayList, new BuriedTreasure((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, IiiiIIiiIi.ALLATORIxDEMO("\u57c6\u85f4\u76a9\u5ba6\u85e2"));
            }
            if (((Boolean)IiIIiIiiiI2.iiiiiIIiiI.get()).booleanValue()) {
                IiIIiIiiiI2.ALLATORIxDEMO(arrayList, new OceanRuin((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, iiIiiIIiII.ALLATORIxDEMO("\u6d1b\u5ed6\u5ef3\u58dc"));
            }
            if (((Boolean)IiIIiIiiiI2.IiiIIiiiiI.get()).booleanValue()) {
                IiIIiIiiiI2.ALLATORIxDEMO(arrayList, new PillagerOutpost((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, IiiiIIiiIi.ALLATORIxDEMO("\u63bb\u5937\u803e\u5260\u54d3\u7af4"));
            }
            if (((Boolean)IiIIiIiiiI2.IiiIIIiiIi.get()).booleanValue()) {
                IiIIiIiiiI2.ALLATORIxDEMO(arrayList, new DesertPyramid((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, iiIiiIIiII.ALLATORIxDEMO("\u6cf5\u6f63\u7932\u6bfc"));
            }
            if (((Boolean)IiIIiIiiiI2.iIiiIiiiII.get()).booleanValue()) {
                IiIIiIiiiI2.ALLATORIxDEMO(arrayList, new Igloo((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, IiiiIIiiIi.ALLATORIxDEMO("\u96d1\u5c66"));
            }
            if (((Boolean)IiIIiIiiiI2.iIiiIiiiii.get()).booleanValue()) {
                IiIIiIiiiI2.ALLATORIxDEMO(arrayList, new JunglePyramid((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, iiIiiIIiII.ALLATORIxDEMO("\u4e77\u67d4\u7932\u5eda"));
            }
            if (((Boolean)IiIIiIiiiI2.IIiiiiiiII.get()).booleanValue()) {
                IiIIiIiiiI2.ALLATORIxDEMO(arrayList, new Mansion((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, IiiiIIiiIi.ALLATORIxDEMO("\u67ac\u571d\u5ea7\u9095"));
            }
            if (((Boolean)IiIIiIiiiI2.iiIIiiIiii.get()).booleanValue()) {
                IiIIiIiiiI2.ALLATORIxDEMO(arrayList, new Mineshaft((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, iiIiiIIiII.ALLATORIxDEMO("\u5ef3\u5f40\u7793\u4ed6"));
            }
            if (((Boolean)IiIIiIiiiI2.IIiIIiIIii.get()).booleanValue()) {
                IiIIiIiiiI2.ALLATORIxDEMO(arrayList, new Monument((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, IiiiIIiiIi.ALLATORIxDEMO("\u6d4c\u5eb8\u7965\u6b92"));
            }
            if (((Boolean)IiIIiIiiiI2.IIiiIiiiII.get()).booleanValue()) {
                IiIIiIiiiI2.ALLATORIxDEMO(arrayList, new RuinedPortal(com.seedfinding.mccore.state.Dimension.OVERWORLD, (MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, iiIiiIIiII.ALLATORIxDEMO("\u5efc\u5f6f\u4f63\u906d\u95ab"));
            }
            if (((Boolean)IiIIiIiiiI2.IiIiIIIIiI.get()).booleanValue()) {
                IiIIiIiiiI2.ALLATORIxDEMO(arrayList, new Stronghold((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, IiiiIIiiIi.ALLATORIxDEMO("\u89ba\u5873"));
            }
            if (((Boolean)IiIIiIiiiI2.iiIiIIiIIi.get()).booleanValue()) {
                IiIIiIiiiI2.ALLATORIxDEMO(arrayList, new SwampHut((MCVersion)((Object)object)), l, biomeSource, chunkRand, n2, n3, n, iiIiiIIiII.ALLATORIxDEMO("\u6cd0\u6cbe\u5c63\u5c08"));
            }
            if (((Boolean)IiIIiIiiiI2.IIIiIiiIIi.get()).booleanValue()) {
                IiIIiIiiiI2.IiiiiiiIIi(arrayList, new Fortress((MCVersion)((Object)object)), l, (MCVersion)((Object)object), n2, n3, n, IiiiIIiiIi.ALLATORIxDEMO("\u4e30\u7561\u89ba\u5873"));
            }
            if (((Boolean)IiIIiIiiiI2.IIIiIIIiII.get()).booleanValue()) {
                IiIIiIiiiI2.IiiiiiiIIi(arrayList, new BastionRemnant((MCVersion)((Object)object)), l, (MCVersion)((Object)object), n2, n3, n, iiIiiIIiII.ALLATORIxDEMO("\u584d\u57d1\u903b\u8fba"));
            }
            if (((Boolean)IiIIiIiiiI2.iiiiIiiIIi.get()).booleanValue()) {
                IiIIiIiiiI2.IiiiiiiIIi(arrayList, new NetherFossil((MCVersion)((Object)object)), l, (MCVersion)((Object)object), n2, n3, n, IiiiIIiiIi.ALLATORIxDEMO("\u4e30\u7561\u532d\u77de"));
            }
            if (((Boolean)IiIIiIiiiI2.IiIiiiiIIi.get()).booleanValue()) {
                IiIIiIiiiI2.ALLATORIxDEMO(arrayList, new EndCity((MCVersion)((Object)object)), l, (MCVersion)((Object)object), n2, n3, n, iiIiiIIiII.ALLATORIxDEMO("\u6768\u575c\u578d"));
            }
        } catch (Exception exception) {
            IiIIiIiiiI2.error("\u641c\u7d22\u8fc7\u7a0b\u4e2d\u53d1\u751f\u9519\u8bef, \u5efa\u8bae\u8c03\u5c0f\u641c\u7d22\u534a\u5f84: " + exception.getMessage(), new Object[2 & 5]);
            return;
        }
        IiIIiIiiiI2.ALLATORIxDEMO(arrayList, (class_2338)IiIIiIiiiI);
        IiIIiIiiiI2.iIIiiIIIII = 2 & 5;
    }

    public void onDeactivate() {
        if (this.iiIIiIiiIi != null && !this.iiIIiIiiIi.isDone()) {
            this.iiIIiIiiIi.cancel((3 & 5) != 0);
            this.iIIiiIIIII = 3 & 4;
            this.info(iiIiiIIiII.ALLATORIxDEMO("\u647f\u7d4e\u5db1\u53ba\u6dcb"), new Object[2 & 5]);
        }
        this.info(IiiiIIiiIi.ALLATORIxDEMO("\u7efe\u679f\u6411\u7d39\u6a2c\u576c\u5ddf\u79ba\u7505"), new Object[3 ^ 3]);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        IiIiIiIIii iiIiIiIIii = iiIiiIIiIi2;
        if (iiIiIiIIii.iIIiiIIIII) {
            iiIiIiIIii.warning(IiiiIIiiIi.ALLATORIxDEMO("\u6427\u7d0f\u6b78\u5725\u8fc0\u8841\u4e16\u0003\u0015\u0003"), new Object[2 & 5]);
            return;
        }
        if (iiIiIiIIii.iiIIIIiIII.player == null) {
            iiIiIiIIii.error(iiIiiIIiII.ALLATORIxDEMO("\u73ca\u5bda\u4e4e\u5b34\u576b"), new Object[3 >> 2]);
            return;
        }
        iiIiiIIiIi iiIiiIIiIi2 = IiiIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO();
        if (iiIiiIIiIi2 == null) {
            iiIiIiIIii.error(IiiiIIiiIi.ALLATORIxDEMO("\u65fb\u6cd8\u838c\u53fb\u4e0d\u7541\u79f6\u5b7d\uff17\u8bfa\u6250\u52a5\u8b85\u7f43\u79f6\u5b7d"), new Object[3 >> 2]);
            return;
        }
        if (iiIiiIIiIi2.IiIIiIiiiI == null || iiIiiIIiIi2.ALLATORIxDEMO == null) {
            iiIiIiIIii.error(iiIiiIIiII.ALLATORIxDEMO("\u79a1\u5b13\u653c\u630d\u658c\u650b\uff40\u8b94\u9181\u65d3\u8bd2\u7f2d\u79a1\u5b13"), new Object[3 ^ 3]);
            return;
        }
        if (PlayerUtils.getDimension() != Dimension.Overworld) {
            iiIiIiIIii.warning(IiiiIIiiIi.ALLATORIxDEMO("\u5ee1\u8ba3\u5713\u4e16\u4e0d\u7541\u4f44\u7505\u6b7f\u5292\u80c6\u4ec8\u83ac\u5f9a\u671b\u51cb\u7855\u76a9\u7ee8\u67b1"), new Object[3 >> 2]);
        }
        IiIiIiIIii iiIiIiIIii2 = iiIiIiIIii;
        iiIiIiIIii2.iIIiiIIIII = --1;
        class_2338 class_23382 = iiIiIiIIii2.iiIIIIiIII.player.getBlockPos();
        iiIiIiIIii2.info("\u5f00\u59cb\u641c\u7d22\u7ed3\u6784\u4f4d\u7f6e... \u534a\u5f84: " + String.valueOf(iiIiIiIIii2.iiiIiIiIIi.get()) + " \u533a\u5757", new Object[3 >> 2]);
        iiIiIiIIii.iiIIiIiiIi = CompletableFuture.runAsync(() -> {
            IiIiIiIIii iiIiIiIIii = iiIiiIIiIi3;
            iiIiiIIiIi iiIiiIIiIi3 = iiIiiIIiIi2;
            IiIiIiIIii IiIIiIiiiI = iiIiIiIIii;
            try {
                void IiIIiIiiiI2;
                IiIIiIiiiI.IiiiiiiIIi(iiIiiIIiIi3, (class_2338)IiIIiIiiiI2);
                return;
            } catch (Exception this2) {
                IiIIiIiiiI.error("\u641c\u7d22\u8fc7\u7a0b\u4e2d\u53d1\u751f\u9519\u8bef: " + this2.getMessage(), new Object[5 >> 3]);
                iIIiIIiiII.error(IiiiIIiiIi.ALLATORIxDEMO("\u6411\u7d19\u8fea\u7a10\u4e20\u53ca\u7512\u9522\u8bc2\u0001\r"), (Throwable)this2);
                IiIIiIiiiI.iIIiiIIIII = 3 & 4;
                return;
            }
        });
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IiiiiiiIIi(List<IiIIiIiIiI> list, RegionStructure<?, ?> regionStructure, long l, MCVersion mCVersion, int n, int n2, int n3, String string) {
        void IiIIiIiiiI;
        IiIiIiIIii iiIiIiIIii = this;
        try {
            void IiIIiIiiiI2;
            void IiIIiIiiiI3;
            void IiIIiIiiiI4;
            void IiIIiIiiiI5;
            void IiIIiIiiiI6;
            BiomeSource IiIIiIiiiI7;
            IiIIiIiiiI7 = BiomeSource.of(com.seedfinding.mccore.state.Dimension.NETHER, (MCVersion)((Object)IiIIiIiiiI7), (long)IiIIiIiiiI6);
            int n4 = IiIIiIiiiI5.getSpacing();
            if (n4 <= 0) {
                iiIiIiIIii.warning("\u7ed3\u6784 " + (String)IiIIiIiiiI + " \u95f4\u8ddd\u65e0\u6548: " + n4, new Object[3 >> 2]);
                return;
            }
            int n5 = Math.max((int)(IiIIiIiiiI4 - IiIIiIiiiI3), -1073741824);
            int n6 = Math.min((int)(IiIIiIiiiI4 + IiIIiIiiiI3), 0x3FFFFFFF);
            int n7 = Math.max((int)(IiIIiIiiiI2 - IiIIiIiiiI3), -1073741824);
            int n8 = Math.min((int)(IiIIiIiiiI2 + IiIIiIiiiI3), 0x3FFFFFFF);
            n5 /= n4;
            n6 /= n4;
            n7 /= n4;
            n4 = n8 / n4;
            ChunkRand chunkRand = new ChunkRand();
            while (n5 <= n6) {
                int n9 = n7;
                while (n9 <= n4) {
                    int n10;
                    if (!iiIiIiIIii.iIIiiIIIII) {
                        return;
                    }
                    try {
                        CPos cPos;
                        CPos cPos2 = IiIIiIiiiI5.getInRegion((long)IiIIiIiiiI6, n5, n10, chunkRand);
                        if (!(Math.sqrt(Math.pow(cPos.getX() - IiIIiIiiiI4, 2.0) + Math.pow(cPos2.getZ() - IiIIiIiiiI2, 2.0)) > (double)IiIIiIiiiI3) && IiIIiIiiiI5.canSpawn(cPos2, IiIIiIiiiI7)) {
                            void IiIIiIiiiI8;
                            BPos bPos = new BPos(cPos2.getX() * (0x7B & 0x14), 3 ^ 3, cPos2.getZ() * (0x55 & 0x3A));
                            double d = Math.sqrt(Math.pow(bPos.getX() - IiIIiIiiiI4 * (0x17 & 0x78), 2.0) + Math.pow(bPos.getZ() - IiIIiIiiiI2 * (0x1C & 0x73), 2.0));
                            IiIIiIiiiI8.add(new IiIIiIiIiI(bPos, d, (String)IiIIiIiiiI));
                        }
                    } catch (Exception exception) {
                        Object[] objectArray = new Object[--3];
                        objectArray[3 >> 2] = n5;
                        objectArray[3 >> 1] = n10;
                        objectArray[1 ^ 3] = exception.getMessage();
                        iiIiIiIIii.warning(String.format(IiiiIIiiIi.ALLATORIxDEMO("\u591f\u740b\u5301\u57f2;%\u001eI7(_\u0004;\u65fb\u51e1\u9514\u0001\r\u001e^"), objectArray), new Object[3 >> 2]);
                    }
                    n9 = ++n10;
                }
                ++n5;
            }
        } catch (Exception IiIIiIiiiI7) {
            iiIiIiIIii.warning("\u641c\u7d22\u4e0b\u754c\u7ed3\u6784 " + (String)IiIIiIiiiI + " \u65f6\u51fa\u9519: " + IiIIiIiiiI7.getMessage(), new Object[3 & 4]);
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IiIiIiIIii iiIiIiIIii = iiIiIiIIii2;
        IiIiIiIIii iiIiIiIIii2 = pre;
        IiIiIiIIii IiIIiIiiiI = iiIiIiIIii;
        if (IiIIiIiiiI.iiIIiIiiIi != null && IiIIiIiiiI.iiIIiIiiIi.isDone()) {
            IiIIiIiiiI.iIIiiIIIII = 3 ^ 3;
            IiIIiIiiiI.iiIIiIiiIi = null;
            IiIIiIiiiI.iiIIIIiIII.set((Object)((3 & 4) != 0));
        }
    }

    @Override
    public void onActivate() {
        IiIiIiIIii iiIiIiIIii = this;
        super.onActivate();
        if (((Boolean)iiIiIiIIii.iiiiiIIIii.get()).booleanValue()) {
            this.ALLATORIxDEMO();
        }
        this.info(IiiiIIiiIi.ALLATORIxDEMO("\u7efe\u679f\u6411\u7d39\u6a2c\u576c\u5ddf\u5414\u7505"), new Object[3 & 4]);
    }

    public IiIiIiIIii() {
        IiIiIiIIii iiIiIiIIii = this;
        super(iiiiIiIiii.IiIIiIiiiI, iiIiiIIiII.ALLATORIxDEMO("\u7ebf\u67c7\u6470\u7d61"), IiiiIIiiIi.ALLATORIxDEMO("\u81dc\u5288\u642a\u7d02\u5439\u79e6\u7eef\u67ae\u4f31\u7f04\u3019\u6b69\u6a1a\u577a\u971b\u898c\u001bUzhIB;\u5c02\u572b\u56f3VB_\u302f"));
        iiIiIiIIii.iiIIiIiiII = iiIiIiIIii.settings.getDefaultGroup();
        iiIiIiIIii.iIiIiiIiiI = iiIiIiIIii.settings.createGroup(iiIiiIIiII.ALLATORIxDEMO("\u79a1\u5b13\u8bd2\u7f2d"));
        iiIiIiIIii.IIIIiIiiIi = iiIiIiIIii.settings.createGroup(IiiiIIiiIi.ALLATORIxDEMO("\u7ee8\u67a9\u8b85\u7f43"));
        iiIiIiIIii.iiiIiIiIIi = iiIiIiIIii.iiIIiIiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u6470\u7d61\u5326\u5fc7"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u4efe\u73a4\u5b8d\u4e17\u4e36\u5fce\u76bf\u6431\u7d39\u5347\u5f9f\uff05\u5301\u577a\uff32\u302f"))).defaultValue((Object)(0x7E & 0x65))).min(0x6B & 0x1E).max(0x4FBB & 0x7E64).sliderMin(0x7A & 0xF).sliderMax(0x7E34 & 0x4FEB).build());
        this.IIiIiiIiIi = this.iiIIiIiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u8d8c\u5fc8\u70da\u5369\u5468\u8db1\u79f8"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u5705\u8df4\u5f89\u7082\u5420\u79eb\u4e20\u531e\u5426\u8de6\u7996\u4fda\u6042"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iiiiiIIIii = this.iiIIiIiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u8186\u52eb\u6470\u7d61"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u5422\u7513\u6a0c\u574c\u65fb\u81f1\u52a5\u5f3b\u59e6\u6427\u7d0f"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.iIiIiIiIii = this.iIiIiiIiiI.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u79a1\u5b13"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u8f9e\u517e\u6700\u529a\u5645\u79f6\u5b7d"))).defaultValue((Object)"")).build());
        this.IiIIIIiiii = this.iIiIiiIiiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("!\u0000\u7224\u676f"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u9024\u62f2@RC~nil]Y\u7273\u6701"))).defaultValue((Object)MCVersion.latest())).build());
        this.iiIiIiiiiI = this.iIiIiiIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u5ef8\u756b\u79a1\u5b13"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u5e99\u7513\u6266\u52b3\u8f9e\u517e\u7689\u79f6\u5b7d\u8b85\u7f43"))).defaultValue((Object)((3 ^ 3) != 0))).onChanged(bl -> {
            boolean bl222 = bl;
            IiIiIiIIii IiIIiIiiiI = this;
            if (bl222) {
                IiIiIiIIii iiIiIiIIii;
                String bl222 = ((String)IiIIiIiiiI.iIiIiIiIii.get()).trim();
                if (!bl222.isEmpty()) {
                    try {
                        IiiIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO(bl222, (MCVersion)((Object)((Object)IiIIiIiiiI.IiIIIIiiii.get())));
                        IiIiIiIIii iiIiIiIIii2 = IiIIiIiiiI;
                        iiIiIiIIii2.info("\u5df2\u8bbe\u7f6e\u79cd\u5b50: " + bl222 + " \u7248\u672c: " + ((MCVersion)((Object)((Object)iiIiIiIIii2.IiIIIIiiii.get()))).name, new Object[5 >> 3]);
                        iiIiIiIIii = IiIIiIiiiI;
                    } catch (Exception bl222) {
                        IiIIiIiiiI.error("\u8bbe\u7f6e\u79cd\u5b50\u5931\u8d25: " + bl222.getMessage(), new Object[3 ^ 3]);
                        iiIiIiIIii = IiIIiIiiiI;
                    }
                } else {
                    IiIIiIiiiI.error(iiIiiIIiII.ALLATORIxDEMO("\u8bbb\u512b\u8fff\u5126\u79a1\u5b13"), new Object[2 & 5]);
                    iiIiIiIIii = IiIIiIiiiI;
                }
                iiIiIiIIii.iiIiIiiiiI.set((Object)((3 ^ 3) != 0 ? 1 : 0));
            }
        })).build());
        this.iiIIIIiIII = this.iiIIiIiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u5f6c\u5988\u6470\u7d61"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u5f1b\u59c6\u6407\u7d2f\u7ee8\u67a9\u4f76\u7f43"))).defaultValue((Object)((3 & 4) != 0))).onChanged(bl -> {
            boolean bl2 = bl;
            IiIiIiIIii IiIIiIiiiI = this;
            if (bl2 && !IiIIiIiiiI.iIIiiIIIII) {
                IiIIiIiiiI.ALLATORIxDEMO();
            }
        })).build());
        this.ALLATORIxDEMO = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u673d\u5ec7"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67fe\u6273\u676a\u5ea9\u7ee8\u67a9"))).defaultValue((Object)(3 >> 2))).build());
        this.IIiiiIIIIi = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u6ce5\u827a"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67fe\u6273\u6cb2\u8214\u7ee8\u67a9"))).defaultValue((Object)(5 >> 3))).build());
        this.IiIIiIiiiI = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u57a8\u85a3\u76c7\u5bf1\u858c"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67c8\u6265\u57c6\u85d4\u7689\u5ba6\u85e2\u7ee8\u67a9"))).defaultValue((Object)(3 >> 2))).build());
        this.iiiiiIIiiI = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u6d1b\u5ed6\u5ef3\u58dc"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67fe\u6273\u6d6c\u5e98\u5ea4\u58b2\u7ee8\u67a9"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.IiiIIiiiiI = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u63ec\u5959\u8069\u520e\u5484\u7a9a"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67de\u6253\u63bb\u5937\u801e\u5240\u54d3\u7af4\u7ee8\u67a9"))).defaultValue((Object)(3 >> 2))).build());
        this.IIIiIiiIIi = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u4e67\u750f\u89ed\u581d"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67fe\u6273\u4e10\u7541\u89ba\u5873\u7ee8\u67a9"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.IIIiIIIiII = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u584d\u57d1\u903b\u8fba"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67fe\u6273\u583a\u579f\u906c\u8fd4\u7ee8\u67a9"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.IiIiiiiIIi = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u6768\u575c\u578d"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67e8\u6265\u6726\u570b\u57e3\u7ee8\u67a9"))).defaultValue((Object)(3 >> 2))).build());
        this.IiiIIIiiIi = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u6cf5\u6f63\u7932\u6bfc"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67fe\u6273\u6c82\u6f2d\u7965\u6b92\u7ee8\u67a9"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iIiiIiiiII = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u9686\u5c08"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67fe\u6273\u96d1\u5c66\u7ee8\u67a9"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iIiiIiiiii = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u4e77\u67d4\u7932\u5eda"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67fe\u6273\u4e00\u679a\u7965\u5eb4\u7ee8\u67a9"))).defaultValue((Object)(3 >> 2))).build());
        this.IIiiiiiiII = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u67fb\u5773\u5ef0\u90fb"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67fe\u6273\u678c\u573d\u5ea7\u9095\u7ee8\u67a9"))).defaultValue((Object)(3 >> 2))).build());
        this.iiIIiiIiii = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u5ef3\u5f40\u7793\u4ed6"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67fe\u6273\u5e84\u5f0e\u77c4\u4eb8\u7ee8\u67a9"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.IIiIIiIIii = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u6d1b\u5ed6\u7932\u6bfc"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67fe\u6273\u6d6c\u5e98\u7965\u6b92\u7ee8\u67a9"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iiiiIiiIIi = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u4e67\u750f\u537a\u77b0"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67fe\u6273\u4e10\u7541\u532d\u77de\u7ee8\u67a9"))).defaultValue((Object)(3 >> 2))).build());
        this.IIiiIiiiII = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u5efc\u5f6f\u4f63\u906d\u95ab"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67c8\u6265\u5e92\u5f18\u4f2d\u903a\u95c5\u7ee8\u67a9"))).defaultValue((Object)(5 >> 3))).build());
        this.IiIiIIIIiI = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u89ed\u581d"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67fe\u6273\u89ba\u5873\u7ee8\u67a9"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iiIiIIiIIi = this.IIIIiIiiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u6cd0\u6cbe\u5c63\u5c08"))).description(IiiiIIiiIi.ALLATORIxDEMO("\u67fe\u6273\u6ca7\u6cf0\u5c34\u5c66\u7ee8\u67a9"))).defaultValue((Object)((2 & 5) != 0))).build());
        IiIiIiIIii iiIiIiIIii2 = this;
        iiIiIiIIii2.iIIiiIIIII = 3 ^ 3;
        iiIiIiIIii2.iiIIiIiiIi = null;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIiiIIiII.ALLATORIxDEMO(";(Ne?\u0006L6<\u0007\r7)BL\u8bb4\u66b8\u65d3\u527c\u6763\u65dc\u720b\u6740\uff42"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(List<IiIIiIiIiI> list, RegionStructure<?, ?> regionStructure, long l, MCVersion mCVersion, int n, int n2, int n3, String string) {
        void IiIIiIiiiI;
        IiIiIiIIii iiIiIiIIii = this;
        try {
            void IiIIiIiiiI2;
            void IiIIiIiiiI3;
            void IiIIiIiiiI4;
            void IiIIiIiiiI5;
            void IiIIiIiiiI6;
            BiomeSource IiIIiIiiiI7;
            IiIIiIiiiI7 = BiomeSource.of(com.seedfinding.mccore.state.Dimension.END, (MCVersion)((Object)IiIIiIiiiI7), (long)IiIIiIiiiI6);
            int n4 = IiIIiIiiiI5.getSpacing();
            if (n4 <= 0) {
                iiIiIiIIii.warning("\u7ed3\u6784 " + (String)IiIIiIiiiI + " \u95f4\u8ddd\u65e0\u6548: " + n4, new Object[5 >> 3]);
                return;
            }
            int n5 = Math.max((int)(IiIIiIiiiI4 - IiIIiIiiiI3), -1073741824);
            int n6 = Math.min((int)(IiIIiIiiiI4 + IiIIiIiiiI3), 0x3FFFFFFF);
            int n7 = Math.max((int)(IiIIiIiiiI2 - IiIIiIiiiI3), -1073741824);
            int n8 = Math.min((int)(IiIIiIiiiI2 + IiIIiIiiiI3), 0x3FFFFFFF);
            n5 /= n4;
            n6 /= n4;
            n7 /= n4;
            n4 = n8 / n4;
            ChunkRand chunkRand = new ChunkRand();
            while (n5 <= n6) {
                int n9 = n7;
                while (n9 <= n4) {
                    int n10;
                    if (!iiIiIiIIii.iIIiiIIIII) {
                        return;
                    }
                    try {
                        CPos cPos;
                        CPos cPos2 = IiIIiIiiiI5.getInRegion((long)IiIIiIiiiI6, n5, n10, chunkRand);
                        if (!(Math.sqrt(Math.pow(cPos.getX() - IiIIiIiiiI4, 2.0) + Math.pow(cPos2.getZ() - IiIIiIiiiI2, 2.0)) > (double)IiIIiIiiiI3) && IiIIiIiiiI5.canSpawn(cPos2, IiIIiIiiiI7)) {
                            void IiIIiIiiiI8;
                            BPos bPos = new BPos(cPos2.getX() * (0x1B & 0x74), 3 >> 2, cPos2.getZ() * (0x1F & 0x70));
                            double d = Math.sqrt(Math.pow(bPos.getX() - IiIIiIiiiI4 * (0x50 & 0x3F), 2.0) + Math.pow(bPos.getZ() - IiIIiIiiiI2 * (0x10 & 0x7F), 2.0));
                            IiIIiIiiiI8.add(new IiIIiIiIiI(bPos, d, (String)IiIIiIiiiI));
                        }
                    } catch (Exception exception) {
                        Object[] objectArray = new Object[--3];
                        objectArray[2 & 5] = n5;
                        objectArray[--1] = n10;
                        objectArray[1 ^ 3] = exception.getMessage();
                        iiIiIiIIii.warning(String.format(iiIiiIIiII.ALLATORIxDEMO("\u5948\u7465\u5356\u579clKI'`F\bjl\u6595\u51b6\u957aVcI0"), objectArray), new Object[3 ^ 3]);
                    }
                    n9 = ++n10;
                }
                ++n5;
            }
        } catch (Exception IiIIiIiiiI7) {
            iiIiIiIIii.warning("\u641c\u7d22\u672b\u5730\u7ed3\u6784 " + (String)IiIIiIiiiI + " \u65f6\u51fa\u9519: " + IiIIiIiiiI7.getMessage(), new Object[5 >> 3]);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(List<IiIIiIiIiI> list, RegionStructure<?, ?> regionStructure, long l, BiomeSource biomeSource, ChunkRand chunkRand, int n, int n2, int n3, String string) {
        void IiIIiIiiiI;
        IiIiIiIIii iiIiIiIIii = cPos;
        try {
            void IiIIiIiiiI2;
            void IiIIiIiiiI3;
            void IiIIiIiiiI4;
            void IiIIiIiiiI5;
            int n4 = IiIIiIiiiI5.getSpacing();
            if (n4 <= 0) {
                iiIiIiIIii.warning("\u7ed3\u6784 " + (String)IiIIiIiiiI + " \u95f4\u8ddd\u65e0\u6548: " + n4, new Object[5 >> 3]);
                return;
            }
            int n5 = Math.max((int)(IiIIiIiiiI4 - IiIIiIiiiI3), -1073741824);
            int n6 = Math.min((int)(IiIIiIiiiI4 + IiIIiIiiiI3), 0x3FFFFFFF);
            int n7 = Math.max((int)(IiIIiIiiiI2 - IiIIiIiiiI3), -1073741824);
            int n8 = Math.min((int)(IiIIiIiiiI2 + IiIIiIiiiI3), 0x3FFFFFFF);
            n5 /= n4;
            n6 /= n4;
            n7 /= n4;
            n8 /= n4;
            while (n5 <= n6) {
                int n9 = n7;
                while (n9 <= n8) {
                    int n10;
                    if (!iiIiIiIIii.iIIiiIIIII) {
                        return;
                    }
                    try {
                        void IiIIiIiiiI6;
                        void IiIIiIiiiI7;
                        void IiIIiIiiiI8;
                        CPos cPos = IiIIiIiiiI5.getInRegion((long)IiIIiIiiiI8, n5, n10, (ChunkRand)IiIIiIiiiI7);
                        if (cPos != null && !(Math.sqrt(Math.pow(cPos.getX() - IiIIiIiiiI4, 2.0) + Math.pow(cPos.getZ() - IiIIiIiiiI2, 2.0)) > (double)IiIIiIiiiI3) && IiIIiIiiiI5.canSpawn(cPos, (BiomeSource)IiIIiIiiiI6)) {
                            void IiIIiIiiiI9;
                            BPos bPos = new BPos(cPos.getX() * (0x30 & 0x5F), 3 >> 2, cPos.getZ() * (0x79 & 0x16));
                            double d = Math.sqrt(Math.pow(bPos.getX() - IiIIiIiiiI4 * (0x32 & 0x5D), 2.0) + Math.pow(bPos.getZ() - IiIIiIiiiI2 * (0x3D & 0x52), 2.0));
                            IiIIiIiiiI9.add(new IiIIiIiIiI(bPos, d, (String)IiIIiIiiiI));
                        }
                    } catch (Exception exception) {
                        Object[] objectArray = new Object[--3];
                        objectArray[5 >> 3] = n5;
                        objectArray[3 >> 1] = n10;
                        objectArray[1 ^ 3] = exception.getMessage();
                        iiIiIiIIii.warning(String.format(iiIiiIIiII.ALLATORIxDEMO("\u5948\u7465\u5356\u579clKI'`F\bjl\u6595\u51b6\u957aVcI0"), objectArray), new Object[3 & 4]);
                    }
                    n9 = ++n10;
                }
                ++n5;
            }
        } catch (Exception exception) {
            iiIiIiIIii.warning("\u641c\u7d22\u7ed3\u6784 " + (String)IiIIiIiiiI + " \u65f6\u51fa\u9519: " + exception.getMessage(), new Object[3 & 4]);
        }
    }
}

