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

import com.github.mikumiku.addon.IIIIIIiiIi;
import com.github.mikumiku.addon.IiIIIiIIII;
import com.github.mikumiku.addon.IiIiiIIiIi;
import com.github.mikumiku.addon.IiiIIIIIII;
import com.github.mikumiku.addon.iIIIiiiiII;
import com.github.mikumiku.addon.iiIiiIIiIi;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.structure.EndCity;
import com.seedfinding.mcfeature.structure.generator.Generator;
import com.seedfinding.mcfeature.structure.generator.structure.EndCityGenerator;
import com.seedfinding.mcterrain.TerrainGenerator;
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

public class iIiiiiIIiI
extends iiiiIiIiii {
    private boolean IiIIIIiiii;
    private final Setting<String> IiiIIIiiIi;
    private final Setting<Boolean> iiIIiiIiii;
    private final SettingGroup iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private final Setting<MCVersion> iiIiIIiIIi;
    @Generated
    private static final Logger IIIIiIiiIi = LoggerFactory.getLogger(iIiiiiIIiI.class);
    private final Setting<Boolean> IiIiIIIIiI;
    private final Setting<Integer> iiiiiIIiiI;
    private final SettingGroup iiIIIIiIII;
    private final Setting<Boolean> IiIIiIiiiI;
    private CompletableFuture<Void> ALLATORIxDEMO;

    private /* synthetic */ void ALLATORIxDEMO() {
        iIiiiiIIiI iIiiiiIIiI2 = iiIiiIIiIi2;
        if (iIiiiiIIiI2.IiIIIIiiii) {
            iIiiiiIIiI2.warning(IIIIIIiiIi.ALLATORIxDEMO("\u646b\u7d08\u6b34\u5722\u8f8c\u8846\u4e5a\u0004y$"), new Object[5 >> 3]);
            return;
        }
        if (iIiiiiIIiI2.iiIIIIiIII.player == null) {
            iIiiiiIIiI2.error(iIIIiiiiII.ALLATORIxDEMO("\u73e6\u5bde\u4e62\u5b10\u5767"), new Object[2 & 5]);
            return;
        }
        iiIiiIIiIi iiIiiIIiIi2 = IiiIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO();
        if (iiIiiIIiIi2 == null) {
            iIiiiiIIiI2.error(IIIIIIiiIi.ALLATORIxDEMO("\u6597\u6cff\u83c0\u53fc\u4e61\u7566\u79ba\u5b7a\uff5b\u8bfd\u621c\u52a2\u8bc9\u7f44\u799a\u5b5a"), new Object[3 ^ 3]);
            return;
        }
        if (iiIiiIIiIi2.IiIIiIiiiI == null || iiIiiIIiIi2.ALLATORIxDEMO == null) {
            iIiiiiIIiI2.error(iIIIiiiiII.ALLATORIxDEMO("\u79a5\u5b3f\u6518\u6301\u6588\u6527\uff44\u8bb8\u9185\u65ff\u8bd6\u7f01\u7985\u5b1f"), new Object[3 & 4]);
            return;
        }
        if (PlayerUtils.getDimension() != Dimension.End) {
            iIiiiiIIiI2.warning(IIIIIIiiIi.ALLATORIxDEMO("\u5ed0\u8bf9\u5722\u675c\u571a\u4f08\u7502\u6b13\u52b5\u808a\u4ecf\u83e0\u5f9d\u6757\u51cc\u7819\u76ae\u7e84\u6796"), new Object[2 & 5]);
        }
        iIiiiiIIiI iIiiiiIIiI3 = iIiiiiIIiI2;
        iIiiiiIIiI3.IiIIIIiiii = 4 ^ 5;
        class_2338 class_23382 = iIiiiiIIiI3.iiIIIIiIII.player.getBlockPos();
        iIiiiiIIiI3.info("\u5f00\u59cb\u641c\u7d22\u9798\u7fc5\u4f4d\u7f6e... \u534a\u5f84: " + String.valueOf(iIiiiiIIiI3.iiiiiIIiiI.get()) + " \u533a\u5757", new Object[3 ^ 3]);
        iIiiiiIIiI2.ALLATORIxDEMO = CompletableFuture.runAsync(() -> {
            iIiiiiIIiI iIiiiiIIiI2 = iiIiiIIiIi3;
            iiIiiIIiIi iiIiiIIiIi3 = iiIiiIIiIi2;
            iIiiiiIIiI IiIIiIiiiI = iIiiiiIIiI2;
            try {
                void IiIIiIiiiI2;
                IiIIiIiiiI.IiiiiiiIIi(iiIiiIIiIi3, (class_2338)IiIIiIiiiI2);
                return;
            } catch (Exception this2) {
                IiIIiIiiiI.error("\u641c\u7d22\u8fc7\u7a0b\u4e2d\u53d1\u751f\u9519\u8bef: " + this2.getMessage(), new Object[3 >> 2]);
                IIIIiIiiIi.error(iIIIiiiiII.ALLATORIxDEMO("\u6473\u7d4a\u8fa8\u7a43\u4e62\u5399\u7550\u9571\u8b80ro"), (Throwable)this2);
                IiIIiIiiiI.IiIIIIiiii = 2 & 5;
                return;
            }
        });
    }

    public void onDeactivate() {
        if (this.ALLATORIxDEMO != null && !this.ALLATORIxDEMO.isDone()) {
            this.ALLATORIxDEMO.cancel((2 ^ 3) != 0);
            this.IiIIIIiiii = 3 >> 2;
            this.info(iIIIiiiiII.ALLATORIxDEMO("\u6453\u7d4a\u5d9d\u539e\u6dc7"), new Object[3 >> 2]);
        }
        this.info(IIIIIIiiIi.ALLATORIxDEMO("\u97b2\u7f92\u6416\u7d75\u6a2b\u5720\u5dd8\u79d6\u7522"), new Object[5 >> 3]);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(List<IiIIIiIIII> list, class_2338 class_23382) {
        void IiIIiIiiiI;
        iIiiiiIIiI iIiiiiIIiI2 = this;
        if (IiIIiIiiiI.isEmpty()) {
            iIiiiiIIiI2.warning(IIIIIIiiIi.ALLATORIxDEMO("\u575f\u632d\u5bed\u8329\u5683\u51af\u675d\u6254\u5267\u5e2c\u97cf\u7fcf\u76f3\u6701\u5767\u57c4"), new Object[5 >> 3]);
            return;
        }
        IiIIiIiiiI.sort((iiIIIiIIII, iiIIIiIIII2) -> {
            IiIIIiIIII IiIIiIiiiI = iiIIIiIIII2;
            IiIIIiIIII IiIIiIiiiI2 = iiIIIiIIII;
            return Double.compare(IiIIiIiiiI2.IiIIiIiiiI, IiIIiIiiiI.IiIIiIiiiI);
        });
        if (IiIiiIIiIi.ALLATORIxDEMO() == null) {
            iIiiiiIIiI2.warning(iIIIiiiiII.ALLATORIxDEMO("\u6585\u6cb7\u83d2\u53b46\b\n\u001a@\u8dc7\u5fec\u70d6\u968e\u5447\uff64\u8b98\u7806\u4fb2\u5d9a\u5be6\u88ad7)*: \u5758\u5691\u6a69\u7e8b"), new Object[3 ^ 3]);
            return;
        }
        int IiIIiIiiiI2 = 0;
        int n = this = 2 & 5;
        while (n < IiIIiIiiiI.size()) {
            BPos bPos;
            String string;
            IiIIIiIIII iiIIIiIIII3 = (IiIIIiIIII)IiIIiIiiiI.get(this);
            BPos bPos2 = iiIIIiIIII3.ALLATORIxDEMO;
            if (((Boolean)iIiiiiIIiI2.iiIIiiIiii.get()).booleanValue()) {
                Object[] objectArray = new Object[1 ^ 3];
                objectArray[3 ^ 3] = this + (3 & 5);
                objectArray[4 ^ 5] = iiIIIiIIII3.IiIIiIiiiI;
                string = String.format(IIIIIIiiIi.ALLATORIxDEMO("\u97ef\u7fefW\tRNw\"r$GL:#"), objectArray);
                bPos = bPos2;
            } else {
                Object[] objectArray = new Object[--1];
                objectArray[5 >> 3] = this + (2 ^ 3);
                string = String.format(iIIIiiiiII.ALLATORIxDEMO("\u97d0\u7f8aHLm+"), objectArray);
                bPos = bPos2;
            }
            ++IiIIiIiiiI2;
            IiIiiIIiIi.ALLATORIxDEMO(bPos.getX(), 0x65 & 0x7E, bPos2.getZ(), string);
            n = ++this;
        }
        Object[] objectArray = new Object[2 ^ 3];
        objectArray[5 >> 3] = IiIIiIiiiI2;
        iIiiiiIIiI2.info(String.format(IIIIIIiiIi.ALLATORIxDEMO("\u643b\u7d58\u5bab\u6261\uff2d\u620e\u521d\u0010H\u0013\n\u4e7d\u9792\u7fb2\u4f67\u7f19\uff26\u5d85\u6dd1\u52d7\u521a\u000fk2x\u0018\u8dc5\u5fd3\u70b3"), objectArray), new Object[3 ^ 3]);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void IiiiiiiIIi(iiIiiIIiIi iiIiiIIiIi2, class_2338 class_23382) {
        void IiIIiIiiiI;
        iIiiiiIIiI iIiiiiIIiI2 = this;
        ArrayList<IiIIIiIIII> arrayList = new ArrayList<IiIIIiIIII>();
        try {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            ChunkRand chunkRand;
            EndCity endCity;
            TerrainGenerator terrainGenerator;
            BiomeSource biomeSource;
            long l;
            Object IiIIiIiiiI2;
            block22: {
                block21: {
                    block20: {
                        block19: {
                            if (IiIIiIiiiI2 == null || ((iiIiiIIiIi)IiIIiIiiiI2).IiIIiIiiiI == null) break block19;
                            if (((iiIiiIIiIi)IiIIiIiiiI2).ALLATORIxDEMO != null) break block20;
                        }
                        iIiiiiIIiI2.error(iIIIiiiiII.ALLATORIxDEMO("\u7985\u5b1f\u6518\u6301\u65a8\u6507"), new Object[3 >> 2]);
                        return;
                    }
                    void v0 = IiIIiIiiiI2;
                    l = v0.IiIIiIiiiI;
                    IiIIiIiiiI2 = v0.ALLATORIxDEMO;
                    iIiiiiIIiI2.info("\u4f7f\u7528\u79cd\u5b50: " + l + ", \u7248\u672c: " + ((MCVersion)((Object)IiIIiIiiiI2)).name, new Object[5 >> 3]);
                    biomeSource = BiomeSource.of(com.seedfinding.mccore.state.Dimension.END, (MCVersion)((Object)IiIIiIiiiI2), l);
                    terrainGenerator = TerrainGenerator.of(com.seedfinding.mccore.state.Dimension.END, biomeSource);
                    endCity = new EndCity((MCVersion)((Object)IiIIiIiiiI2));
                    IiIIiIiiiI2 = new EndCityGenerator((MCVersion)((Object)IiIIiIiiiI2));
                    chunkRand = new ChunkRand();
                    n7 = (Integer)iIiiiiIIiI2.iiiiiIIiiI.get();
                    if (n7 > (0x43F6 & 0x3DFD)) {
                        iIiiiiIIiI2.warning("\u641c\u7d22\u534a\u5f84\u8fc7\u5927 (" + n7 + ")\uff0c\u53ef\u80fd\u5bfc\u81f4\u6027\u80fd\u95ee\u9898\u6216\u9519\u8bef\u3002 ", new Object[5 >> 3]);
                    }
                    void v1 = IiIIiIiiiI;
                    n6 = v1.getX() >> --4;
                    n5 = v1.getZ() >> --4;
                    int n82 = endCity.getSpacing();
                    if (n82 <= 0) {
                        iIiiiiIIiI2.error("\u672b\u5730\u57ce\u95f4\u8ddd\u65e0\u6548: " + n82, new Object[3 >> 2]);
                        return;
                    }
                    n4 = Math.max(n6 - n7, -1073741824);
                    n3 = Math.min(n6 + n7, 0x3FFFFFFF);
                    n2 = Math.max(n5 - n7, -1073741824);
                    n = Math.min(n5 + n7, 0x3FFFFFFF);
                    n2 /= n82;
                    n /= n82;
                    if ((n3 /= n82) - (n4 /= n82) > (0x23F8 & 0x5FEF)) break block21;
                    if (n - n2 <= (0x33FC & 0x4FEB)) break block22;
                }
                iIiiiiIIiI2.warning(IIIIIIiiIi.ALLATORIxDEMO("\u6430\u7d52\u832e\u56c4\u8faa\u5950\uff26\u53b8\u80f7\u5b8b\u81de\u6050\u80d7\u9599\u98b2\u3075\u5ed0\u8bf9\u51c5\u5c58\u6416\u7d55\u5360\u5fd3\u3008"), new Object[3 >> 2]);
            }
            int n9 = (n3 - n4 + (3 >> 1)) * (n - n2 + (3 >> 1));
            String n82 = "\u641c\u7d22\u53c2\u6570: \u534a\u5f84=" + n7 + ", \u95f4\u8ddd=" + n82 + ", \u533a\u57df\u8303\u56f4=(" + n4 + "," + n2 + ")\u5230(" + n3 + "," + n + "), \u603b\u533a\u57df=" + n9;
            iIiiiiIIiI2.info(n82, new Object[5 >> 3]);
            for (int n82 = n4; n82 <= n3; ++n82) {
                int n10 = n2;
                while (n10 <= n) {
                    if (!iIiiiiIIiI2.IiIIIIiiii) {
                        return;
                    }
                    try {
                        CPos cPos;
                        CPos cPos2 = endCity.getInRegion(l, n82, n4, chunkRand);
                        if (!(Math.sqrt(Math.pow(cPos.getX() - n6, 2.0) + Math.pow(cPos2.getZ() - n5, 2.0)) > (double)n7) && endCity.canSpawn(cPos2, biomeSource) && endCity.canGenerate(cPos2, terrainGenerator)) {
                            Object object = IiIIiIiiiI2;
                            ((Generator)object).generate(terrainGenerator, cPos2, chunkRand);
                            if (((EndCityGenerator)object).hasShip()) {
                                BPos bPos = new BPos(cPos2.getX() * (0x57 & 0x38), 5 >> 3, cPos2.getZ() * (0x18 & 0x77));
                                double d = Math.sqrt(Math.pow(bPos.getX() - IiIIiIiiiI.getX(), 2.0) + Math.pow(bPos.getZ() - IiIIiIiiiI.getZ(), 2.0));
                                arrayList.add(new IiIIIiIIII(bPos, d));
                            }
                            ((EndCityGenerator)IiIIiIiiiI2).reset();
                        }
                    } catch (Exception exception) {
                        Object[] objectArray = new Object[--3];
                        objectArray[2 & 5] = n82;
                        objectArray[4 ^ 5] = n4;
                        objectArray[5 >> 1] = exception.getMessage();
                        iIiiiiIIiI2.warning(String.format(iIIIiiiiII.ALLATORIxDEMO("\u596c\u7469\u5372\u5790HGM\u000bDJ\fFh\u65b9\u51b2\u9556ROm<"), objectArray), new Object[5 >> 3]);
                    }
                    n10 = ++n4;
                }
            }
        } catch (Exception exception) {
            iIiiiiIIiI2.error("\u641c\u7d22\u8fc7\u7a0b\u4e2d\u53d1\u751f\u9519\u8bef, \u5efa\u8bae\u8c03\u5c0f\u641c\u7d22\u534a\u5f84: " + exception.getMessage(), new Object[2 & 5]);
            return;
        }
        iIiiiiIIiI2.ALLATORIxDEMO(arrayList, (class_2338)IiIIiIiiiI);
        iIiiiiIIiI2.IiIIIIiiii = 2 & 5;
    }

    public iIiiiiIIiI() {
        iIiiiiIIiI iIiiiiIIiI2 = this;
        super(iiiiIiIiii.IiIIiIiiiI, iIIIiiiiII.ALLATORIxDEMO("\u97f0\u7faa\u6454\u7d6d"), IIIIIIiiIi.ALLATORIxDEMO("\u819d\u5282\u644b\u7d28\u5e51\u6701\u5747\u8213\u76f3\u6701\u5747\u57e4\u7e84\u678e\uff5f\u530f\u545c\u97b2\u7f92\uff03"));
        iIiiiiIIiI2.iIiiIiiiII = iIiiiiIIiI2.settings.getDefaultGroup();
        iIiiiiIIiI2.iiIIIIiIII = iIiiiiIIiI2.settings.createGroup(iIIIiiiiII.ALLATORIxDEMO("\u79a5\u5b3f\u8bf6\u7f21"));
        iIiiiiIIiI2.iiiiiIIiiI = iIiiiiIIiI2.iIiiIiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u646b\u7d08\u531d\u5f8e"))).description(iIIIiiiiII.ALLATORIxDEMO("\u4e8d\u73c6\u5bde\u4e55\u4e45\u5fac\u76ec\u6473\u7d6a\u5305\u5fcc\uff47\u5352\u5738\uff41\u304d"))).defaultValue((Object)(0x72 & 0x3F))).min(0xE & 0x7B).max(0x7FDE & 0x7F1).sliderMin(0x7A & 0xF).sliderMax(0x5FF1 & 0x27DE).build());
        this.iiIIiiIiii = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u8de5\u5fd3\u70b3\u5372\u5401\u8d8a\u79b1"))).description(iIIIiiiiII.ALLATORIxDEMO("\u5747\u8d87\u5feb\u70d1\u5462\u79b8\u4e62\u534d\u5464\u8db5\u79d4\u4fa9\u6020"))).defaultValue((Object)(5 >> 2))).build());
        this.IiIIiIiiiI = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u819d\u5282\u644b\u7d28"))).description(iIIIiiiiII.ALLATORIxDEMO("\u5440\u7540\u6a4e\u571f\u65b9\u81a2\u52e7\u5f68\u59a4\u6454\u7d6d"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.IiiIIIiiIi = this.iiIIIIiIII.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IIIIIIiiIi.ALLATORIxDEMO("\u799a\u5b5a"))).description(iIIIiiiiII.ALLATORIxDEMO("\u8fdc\u510d\u6762\u52c9\u5607\u79a5\u5b3f@\u9eb7\u8bec|\u000b|=\u79a2\u5b18f"))).defaultValue((Object)IIIIIIiiIi.ALLATORIxDEMO("Z\u001dd>A\u0013F\u0019N\u0013O\u001dg9`8A\u001co:"))).build());
        this.iiIiIIiIIi = this.iiIIIIiIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iIIIiiiiII.ALLATORIxDEMO("%,\u7200\u6763"))).description(IIIIIIiiIi.ALLATORIxDEMO("\u9023\u629eg\u001eD2i%k\u0011^\u721f\u6726"))).defaultValue((Object)MCVersion.latest())).build());
        this.iIIiiIIIII = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIiiiiII.ALLATORIxDEMO("\u5efc\u7547\u7985\u5b1f"))).description(IIIIIIiiIi.ALLATORIxDEMO("\u5ebe\u755f\u6261\u52ff\u8f99\u5132\u768e\u79ba\u5b7a\u8be9\u7f64"))).defaultValue((Object)((3 & 4) != 0))).onChanged(bl -> {
            boolean bl222 = bl;
            iIiiiiIIiI IiIIiIiiiI = this;
            if (bl222) {
                iIiiiiIIiI iIiiiiIIiI2;
                String bl222 = ((String)IiIIiIiiiI.IiiIIIiiIi.get()).trim();
                if (!bl222.isEmpty()) {
                    try {
                        IiiIIIIIII.ALLATORIxDEMO().ALLATORIxDEMO(bl222, (MCVersion)((Object)((Object)IiIIiIiiiI.iiIiIIiIIi.get())));
                        iIiiiiIIiI iIiiiiIIiI3 = IiIIiIiiiI;
                        iIiiiiIIiI3.info("\u5df2\u8bbe\u7f6e\u79cd\u5b50: " + bl222 + " \u7248\u672c: " + ((MCVersion)((Object)((Object)iIiiiiIIiI3.iiIiIIiIIi.get()))).name, new Object[3 & 4]);
                        iIiiiiIIiI2 = IiIIiIiiiI;
                    } catch (Exception bl222) {
                        IiIIiIiiiI.error("\u8bbe\u7f6e\u79cd\u5b50\u5931\u8d25: " + bl222.getMessage(), new Object[2 & 5]);
                        iIiiiiIIiI2 = IiIIiIiiiI;
                    }
                } else {
                    IiIIiIiiiI.error(iIIIiiiiII.ALLATORIxDEMO("\u8bbf\u5107\u8ffb\u510a\u7985\u5b1f"), new Object[3 ^ 3]);
                    iIiiiiIIiI2 = IiIIiIiiiI;
                }
                iIiiiiIIiI2.iIIiiIIIII.set((Object)(3 >> 2));
            }
        })).build());
        this.IiIiIIIIiI = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIIiiiiII.ALLATORIxDEMO("\u5f68\u59a4\u6454\u7d6d"))).description(IIIIIIiiIi.ALLATORIxDEMO("\u5f57\u59c1\u644b\u7d28\u97ef\u7fef\u4f1a\u7f64"))).defaultValue((Object)(5 >> 3))).onChanged(bl -> {
            boolean bl2 = bl;
            iIiiiiIIiI IiIIiIiiiI = this;
            if (bl2 && !IiIIiIiiiI.IiIIIIiiii) {
                IiIIiIiiiI.ALLATORIxDEMO();
            }
        })).build());
        iIiiiiIIiI iIiiiiIIiI3 = this;
        iIiiiiIIiI3.IiIIIIiiii = 3 & 4;
        iIiiiiIIiI3.ALLATORIxDEMO = null;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIIIiiiiII.ALLATORIxDEMO("?\u0004JI\u001b\nh:\u0018\u000b\t\u001b\rNH\u8b98\u66bc\u65ff\u5278\u674f\u65d8\u7227\u6764\uff4e"));
        }
    }

    @Override
    public void onActivate() {
        iIiiiiIIiI iIiiiiIIiI2 = this;
        super.onActivate();
        iIiiiiIIiI2.ALLATORIxDEMO();
        iIiiiiIIiI2.info(IIIIIIiiIi.ALLATORIxDEMO("\u97b2\u7f92\u6416\u7d75\u6a2b\u5720\u5dd8\u5478\u7522"), new Object[3 >> 2]);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIiiiiIIiI iIiiiiIIiI2 = iIiiiiIIiI3;
        iIiiiiIIiI iIiiiiIIiI3 = pre;
        iIiiiiIIiI IiIIiIiiiI = iIiiiiIIiI2;
        if (IiIIiIiiiI.ALLATORIxDEMO != null && IiIIiIiiiI.ALLATORIxDEMO.isDone()) {
            IiIIiIiiiI.IiIIIIiiii = 3 >> 2;
            IiIIiIiiiI.ALLATORIxDEMO = null;
            IiIIiIiiiI.IiIiIIIIiI.set((Object)(3 >> 2));
        }
    }
}

