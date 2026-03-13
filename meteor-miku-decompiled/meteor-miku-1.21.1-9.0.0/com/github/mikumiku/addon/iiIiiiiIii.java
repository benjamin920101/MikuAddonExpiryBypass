/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIIIIIii;
import com.github.mikumiku.addon.IIIiIiIiII;
import com.github.mikumiku.addon.IiiIiIIIIi;
import com.github.mikumiku.addon.iIIIiIIIiI;
import com.github.mikumiku.addon.iiIIIIiIii;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.data.ThreadPool;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.ChestContent;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import com.seedfinding.mcfeature.structure.EndCity;
import com.seedfinding.mcfeature.structure.generator.Generator;
import com.seedfinding.mcfeature.structure.generator.structure.EndCityGenerator;
import com.seedfinding.mcterrain.TerrainGenerator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class iiIiiiiIii {
    private EndCityGenerator IiIIiIiiiI;
    private List<Pair<Generator.ILootType, BPos>> ALLATORIxDEMO;

    public void IiIiiiIIiI() {
        Iterator iterator;
        iiIiiiiIii iiIiiiiIii2;
        iiIiiiiIii iiIiiiiIii3 = iiIiiiiIii2 = pair;
        iiIiiiiIii3.ALLATORIxDEMO(1L, new BPos(-127280, 3 >> 2, 0xFFFFEF7E & 0xFFFF97A1).toChunkPos(), MCVersion.v1_16_5);
        Object[] objectArray = new Object[--1];
        objectArray[3 >> 2] = iiIiiiiIii2.IiIIiIiiiI.hasShip();
        iiIiiiiIii3.IiiiiiiIIi(objectArray);
        Iterator iterator2 = iterator = new iIIIiIIIiI(iiIiiiiIii2).iterator();
        while (iterator2.hasNext()) {
            Pair pair = (Pair)iterator.next();
            Object[] objectArray2 = new Object[5 >> 1];
            objectArray2[5 >> 3] = iiIiiiiIii2.ALLATORIxDEMO.contains(pair);
            Object[] objectArray3 = new Object[5 >> 1];
            objectArray3[3 >> 2] = pair.getFirst();
            objectArray3[4 ^ 5] = pair.getSecond();
            objectArray2[3 & 5] = String.format(iiIIIIiIii.ALLATORIxDEMO("!\u000e\u001eTD\u000e\r@\u0006/%\u0014JE\u0019@\u000b\u0014J0%\u0013JE\u0019"), objectArray3);
            iiIiiiiIii2.IiiiiiiIIi(objectArray2);
            iterator2 = iterator;
        }
    }

    public iiIiiiiIii() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiIiIIIIi.ALLATORIxDEMO("iz\u001c7Mt\u001ednU_e[0\u001e\u8be6\u66ca\u65a1\u522e\u6731\u658e\u7259\u6712\uff10"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(long l, CPos cPos, MCVersion mCVersion) {
        void IiIIiIiiiI;
        void IiIIiIiiiI22;
        iiIiiiiIii iiIiiiiIii2 = object;
        Object object = mCVersion;
        iiIiiiiIii IiIIiIiiiI3 = iiIiiiiIii2;
        BiomeSource IiIIiIiiiI22 = BiomeSource.of(Dimension.END, (MCVersion)((Object)object), (long)IiIIiIiiiI22);
        TerrainGenerator terrainGenerator = TerrainGenerator.of(Dimension.END, IiIIiIiiiI22);
        IiIIiIiiiI3.IiIIiIiiiI = new EndCityGenerator((MCVersion)((Object)object));
        object = new ChunkRand().asChunkRandDebugger();
        IiIIiIiiiI3.IiIIiIiiiI.generate(terrainGenerator, (CPos)IiIIiIiiiI, (ChunkRand)object);
        IiIIiIiiiI3.ALLATORIxDEMO = IiIIiIiiiI3.IiIIiIiiiI.getChestsPos();
    }

    public void IiiiiiiiII() {
        Iterator iterator;
        iiIiiiiIii iiIiiiiIii2 = pair;
        iiIiiiiIii2.ALLATORIxDEMO(1L, new BPos(0xFFFFCEBE & 0xFFFFFF71, 2 & 5, 0xFFFF8F01 & 0xFFFFF7FE).toChunkPos(), MCVersion.v1_16_5);
        Iterator iterator2 = iterator = new IIIIIIIIii(iiIiiiiIii2).iterator();
        while (iterator2.hasNext()) {
            Pair pair = (Pair)iterator.next();
            Object[] objectArray = new Object[1 ^ 3];
            objectArray[3 ^ 3] = iiIiiiiIii2.ALLATORIxDEMO.contains(pair);
            Object[] objectArray2 = new Object[5 >> 1];
            objectArray2[3 ^ 3] = pair.getFirst();
            objectArray2[--1] = pair.getSecond();
            objectArray[4 ^ 5] = String.format(IiiIiIIIIi.ALLATORIxDEMO("ZPe\n?Pv\u001e}q^J1\u001bb\u001epJ1n^M1\u001bb"), objectArray2);
            iiIiiiiIii2.IiiiiiiIIi(objectArray);
            iterator2 = iterator;
        }
    }

    public static void main(String[] IiIIiIiiiI) {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIIIIiIii.ALLATORIxDEMO("7\u0001BL\u0013\u000f@\u001f0.\u0001\u001e\u0005K@\u8b9d\u6694\u65da\u5270\u674a\u65d0\u7222\u674c\uff6b"));
        }
        System.out.println(IiiIiIIIIi.ALLATORIxDEMO("\u001c\u00178\u001b4\u00196Zu\u0013<\u001d2\u0000/\u001c3\u0001.\u00169Zu\u00196\u001d2\u001f0\u0001.\u00196\u001d2\u001f0\u0001.Zu\u0015:\u0010\u0016\u0010<\u00187\u00196Yv\u001e1\u001e1>\u0011\u001e1\u001e1\u001e1\u001e1>\u0011\u001e1\u001e1\u001a5\u00169\u001e1\u00196\u0014;\u00187\u001a5Z\\\u0013?\u001e1\u0003,\u001f3\u0001-\u0016:Yv\u00195\u001e1\u001c0\u0001-\u00196\u001d1\u001f0\u0001-Zu\u00169\u0010?\u0010<\u00187\u00196Z\\\u001d1\u001e1>\u0011\u001d1\u001d1\u001d1\u001e1=\u0011\u001e1\u001d1\u00195\u0016:\u001e1\u001a6\u0017;\u001b7\u00195Yu\u0010?\u001e1\u0003,\u001c\u001a\u0001-\u0015:Yv\u00196\u001d1\u001f3\u0002-\u00195\u001e1\u001f0\u0001-Yu\u00169\u0010<\u0010<\u001b4\u00196Yu\u001e1\u001e1>\u0011\u001d\u001b\u001d1\u001e1\u001e1=\u0011\u001d1\u001d2\u00195\u0015:\u001d1\u001a6\u0017;\u00184\u001a5Zu\u0013?\u001d1\u0000,\u001c3\u0001-\u0015:Yv\u0019\u001f\u001d1\u001c3\u0002-\u001a5\u001e1\u001c3\u0002-Yv\u00169\u0013<\u0013<\u00187\u00196Yv\u001e1\u001e1>\u0011\u001e1\u001e1\u001e1\u001e1=;\u001d1ncUaSzJxWq\u0014QYa[5\u0018&@sWrBxV\u007fL~\u0015i\u00108Yp\u001e#\f#\u0014-\u0019\u001f\u001d1\u001c3\u0002-Yv\u00169\u0013<\u0013<\u00187\u00196Yv\u001e1\u001e1>\u0011\u001e1\u001e1\u001e1\u001e1>\u0011\u001e1\u001e1\u001a5\u0015\u0013\u001d1\u00196\u0014;\u0018VVy\u0018\"_mW1lnYeQnTn\u0016$\u001ac\u0007?\t3fHwZ\u001e1\u001c3\u0002-Z\\\u00159\u0013<\u0013<\u00187\u00196Yv\u001e1\u001e1>\u0011\u001e1\u001e1\u001e1\u001e1>\u0011\u001e1\u001e1\u001a5\u00169\u001e1\u00196\u0014;\u001b\u001d\u00195Yv\u0010?\u001e1\u0003,\u001f0\u0002-\u0015^<\u001bu5hTn@kBt4\u001e1\u001c3\u0002-Yv\u00169\u0013<\u0013<\u001b\u001d\u001a6Yv\u001e1\u001e1>\u0011\u001e1\u001e1\u001e1\u001e1>\u0011\u001e1\u001e1\u001a5\u00169\u001e1\u00196\u0014;\u00187\u001a5Yv\u0010?\u001d\u001b\u0000,\u001f0\u0002-\u0015:YvtZj1z\\p-yZs\\yAaD8\u001a\u0016L`Y\u0012<\u00187\u00196Yv\u001e1\u001d\u001b=\u0011\u001e1\u001e1\u001e1\u001e1>\u0011\u001e1\u001e1\u001a5\u00169\u001e1\u00196\u0014;\u00187\u001a5Yv\u0010?\u001e1\u0003,\u001f0\u0002-\u0016\u0010Zv\u001a5\u001e1\u001c3\u0002-\u001a}JeL`\u0018\"V7ZuRh\\nQ9Zy\u0014v\u001e1\u001e1>\u0011\u001e1\u001e1\u001d\u001b\u001d1>\u0011\u001e1\u001e1\u001a5\u00169\u001e1\u00196\u0014;\u00187\u001a5Yv\u0010?\u001e1\u0003,\u001f0\u0002-\u0015:Yv\u001a5\u001e1\u001f\u0019\u0001.\u00196\u001d2\u001f0\u0001.Zu\u0015:\u0010?\u0010?\u001b4\u001a5Zu\u001d2\u001d2=\u0012\u001d2\u001d2\u001d2\u001d2=\u0012\u001d2\u001d\u001b"));
        new ThreadPool(Runtime.getRuntime().availableProcessors()).run(iiIiiiiIii::iiIiiiiiII);
    }

    public void iIIiiiIiiI() {
        iiIiiiiIii iiIiiiiIii2 = object2;
        iiIiiiiIii2.ALLATORIxDEMO(1L, new BPos(-127280, 5 >> 3, 0xFFFF8721 & 0xFFFFFFFE).toChunkPos(), MCVersion.v1_16_5);
        Object object = new EndCity(MCVersion.v1_16_5).getLoot(1L, iiIiiiiIii2.IiIIiIiiiI, new ChunkRand(), 3 >> 2);
        long l = 0L;
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = (ChestContent)object.next();
            if (((ChestContent)object2).ofType(EndCityGenerator.LootType.FAT_TOWER_TOP_CHEST_1)) {
                Object[] objectArray = new Object[1 ^ 3];
                objectArray[3 ^ 3] = iiIIIIiIii.ALLATORIxDEMO(".OH\u0013\u001e#\u0005.>\u0005\u0004\u0014\u0011\f\u0005\u000f\u001e\u00143\u0010\u000f],!>\u001f\u001e\u000f\u001d%8?>/:\u001f\t(/3>\u001f{F@\u0005\u0004\u0001\u001dSy\u0017\u0014\u0005W.>/,034\"oh7:LJ\u000b\u001c\u0019\u001b\u0017S;#\u0016\r\u0011%SL\u000b\t\u0016\u000e\u0019\u0002\u000bQ.\u0019B@\u001b\u0004\u0001\u0007%wG\r\u000f\u0006\u00045\t\u0004'%\u0014MLJ\u0005\u0004#\"!$\u0014\u0007\u0005\u0004\u0014\u0019}\u0011=F@\u000f&,\u000f\u0003\u0012\u001fY5zPBD\u0003\u0005\b\u0019\u0015VH\u000bGAnY\u0001\u00033\u001e\u0003\u000b\u0017\r\r\u001a\u0005\u0007_!\b\u0013JV\u0006\u0003\u0000\u0002P@\u0004\t\u0002\u0019UB\u000f\u001e?\u0019%/\u0004\u0019GF@\u000f\u000e\t(+\u000e\u001e\r\u000f\u000e\u001e3w\u001b\u0017LJ\u0005\f\u0006\u000f#>\u0013W;7=fJ\u0003\t\u0019\n\u001a\u001a\u001e\u0013H@#\t\u0012\f8\b\u0017\b\n\\D\u0010\u000b\rW+\u001c\u0019\u001b\u001f\u0000\u0001\u0007\u0007U[\u001fUB\u0006=\u0004\t\n\b\u0012KKMBC\u0003\u0002\u0001\u00044'\u0005\u0004\u0014\u0019]1=F`/\u0006\f\u0005\t\u0014\u0019}\u0011\u001d7LJ\u0003\u0005\u0015\u00044wQZ\u001dF`\u0003\u001e\u0005\u000b?\u0010\u000fDF\u0015\r\u0014\u000f\u0010J(\u001f\u0019\u001b\u0010\u000fF@\u0001SG\u0003\u0010\u0007\u0012)\u0007\u0006\u0005\u0019\u0016\u0018\u0010\u0017SHONM\u0002\u0003\u0004\u000e\r\t\u0019JH\u000e\u001e\u0013W\u001bb\u0010\u0018\u000f\u001e\u0005\t\u0014\u0003/$LJTCLJh'%$\u0004\u0003\u000e\rLJqc=F@\u000f&,\u000f\u0003\u0012\u001fY5zPBD\u0003\u0005\b\u0019\u0015VM\u000b6M\u0007]\u000b\u001d]:\r\u001b\u0007\u000eYCQXUZKF\u000b\r\u0011_\\U^KF\u0016Z@\u0014\u001dY^S\u0017lj\t\u0004\u0004\u000f\u0018\u000f\u0004W&+\f\u0019\u0005\u0017");
                objectArray[--1] = ((ChestContent)object2).toString();
                iiIiiiiIii2.ALLATORIxDEMO(objectArray);
            }
            if (((ChestContent)object2).ofType(EndCityGenerator.LootType.FAT_TOWER_TOP_CHEST_2)) {
                Object[] objectArray = new Object[--2];
                objectArray[3 >> 2] = IiiIiIIIIi.ALLATORIxDEMO("r\\~Kcyz\u0017\"UqJjOcPdvtE\u007fD\u0010{AaEsDg_eAqAcPjH*\u0002i+\u001f<Pt]dMB\u0000&[,mXPvrTaRvTmE2\u0011We[|M,ExjTSBJp]zeXJtS,WEQvCy[x\u001ck\u0017xQ}GSV~EbA=Uv_{]y]}V`_{Jb\u0001H\u007f!Y3P\u007fV\u007fGo\u0005LdkUv]~K\u007fj\f\fl\u00121we[|ME_rUjWe{\\#xJtSjPpsT\u00036Wcq_kw]p]|\u00171C8\u00121Fb\\xCcAw\u001c8Nf\u0003J\u0014qKc^|PvcpW\u007f\n3\u001a9\u00025n0\u0018r_p\u001c5Jb\u0003JCL\u00121]~K\u007fJ,/L\u00121we[|ME\u007fRUjWe[|#xJtSjpPY~\u00050Sg\u00168ow[}NiK7\u000e-Pt\u001a>[{J|Y}V~\u0007N\u0016aN|Vh\u001a\"_v]0\u0013.\u0011;\u0019>\f8\\c[puXPv\u00121\f8c=>TXw[rJb#jCL\u00121]~K\u007fj\f\u000fl\u00121WEQvkc[v\u0012-Yk[|\u001eEKuOv[{\u00143\u00072WcS}}oUzJb\u001b?\u0002h\u00175^x]h^yVcJ+\"~NcQe{RJxQ\u007f\u00121\n82\u0011\u0016sW\u007fZxpVARKcMt\u00121/\u0018c=\u001etxWQxLd\u0007N$+\u001c?]~VbK-\u0013ph6Y&Uf\u0003AS`Yu\u00078\u000f#\u000b!\u0015?UvO$\u0002.\u00000\u0018m\u0004;Jf\u0007%\u000bl2\u0011W\u007fZtFtZ,xPRb[l");
                objectArray[5 >> 2] = ((ChestContent)object2).toString();
                iiIiiiiIii2.ALLATORIxDEMO(objectArray);
            }
            if (((ChestContent)object2).ofType(EndCityGenerator.LootType.SHIP_CHEST_1)) {
                Object[] objectArray = new Object[1 ^ 3];
                objectArray[3 >> 2] = iiIIIIiIii.ALLATORIxDEMO("'\u0006B^\u001a'\u000f\u0004\t\u0012\u000f\u001f\u0007\u001a\u0004\u000eSy\u001d\u001e\u0005W1 5&;-(/1<#G\u000b\r\u000b\n\b\u0014\u00193\u001f\u001c\u0002Ptd.-,/\u001f\t(/3>LJ\t\u001e%'\u0013W;#\u0014\u000f-\u00194+\u0003\u0001\u001b\u0003\u0014\u000f-w)\u001e\u0005\u0007;$\u000b\r\u0003QC\nNL\u0003\u000b\u000e\u000e\"\u0004\u0016\u0004\u000e\u0012LM\u0007H\n\r\b\u000b\f\u001c\u0011\u0013\n\u001a\u0013W9@\u000f\u001eF_\u0018\f\b\u0014\u001eKFXNA\u0007\u0005\u000b\u0004\u000f\t+(\u0001\t\u000bF@XIF`b\u0015\u0004\u0002\u0018\u0005\u000b+#.-LJSC=F`/\u0006\f\u0005\t49W;;\u0011HNDB\u001b\n\u0014WL\nMK5\u0002\u000e\ftY\u0005\r\u000b\u0011\u000b\u001c\u0019\u001bY'\u0014\u000f\u000f\u0013\u0012\u0017JHUE\u0004\u0015\u0002\t9\u0005\t\nHYGF@\u000f.)\b\u000b\u000e\u001e\r\u000f\u000e\u001e3w;7LJ\u0005\f&/#>\u0013W;7\u001dF`)\u000f\u001f\u000e\u001e}\u007f\u0017LF%\u0010\u000bJ~\u001a\u0005\u0003\u0001\u0006\u001e\u0015\u000e\u0011K\"\u0015B@\u001f\u0000\u0001\u0007\u0007U[\u001f\u0016\u0001\u000e5\u0011\u001f\u0013\u0004C\nDB\b\t\u000e\u000f\u0007\u0002\u0013\u0000BC\u0014\u0019]1h!\u000e\u0005\u0003\u0001\u0002\u000b\u0003\u0001ljRCLJH\u0019(+2:\u000e\u000f\u0013\u0019LJsc=F@\u000f&,\u000f\u0003\u0012\u001fY5zPBD\u0003\u0005\b\u0019\u0015VM\u000b6M\u0007]\u000b\u001d]:\r\u001b\u0007\u000eYCQXUZKD\u000b\r\u0011_\\SXKF\u0016Z@\u0014\u001dYZW\u0017lj\t\u0004\u0004\u000f\u0018\u000f\u0004W&+\f\u0019\u0005\u0017");
                objectArray[3 >> 1] = ((ChestContent)object2).toString();
                iiIiiiiIii2.ALLATORIxDEMO(objectArray);
            }
            if (((ChestContent)object2).ofType(EndCityGenerator.LootType.SHIP_CHEST_2)) {
                Object[] objectArray = new Object[5 >> 1];
                objectArray[5 >> 3] = IiiIiIIIIi.ALLATORIxDEMO("XPrIa:9^k[\u007fWwS\u007fMyac\t3\u0007FvXlLaE\u007fFjN\u000e?\u0002n\u00113EmgeCy\u0005DpX>\u001a{N}Y[bj=\u001exJtSb#jwe[|me\u007fRuJWe[|\u0003XjTSjPpsT\t<QeU{&:UxYxMkL7\u000e-Pt\u001a>[{J|Y}V~\u0007N\u0016dRqPh\u0018=_wT0\u0013/\u0011;\u0019>\u001f?Ltaal^Jt]eW~P=>\u0003\u0017L\u00121[wxT}EM,eLC=>RQdPe#\u0000I7\u0018^Np\u0014\u0005D~]zXeKuO0|n\u001c;A{_|Y.\u0005dHzPN_{G~\r&ZxGy\u00140\u0018rWu\u00117PeStpEM,e9StPuw_Y=\u001e \u0017=>\u0019jYQcPb\u00121,\u0018c=\u001etxWQxLd\u0007N$+\u001c?]~VbK-\u0013ph6Y&Uf\u0003AS`Yu\u00078\u000f#\u000b!\u00159UvO$\u0002(\u00060\u0018m\u0004;Jf\u0007!\tl2\u0011W\u007fZtFtZ,xPRb[l");
                objectArray[2 ^ 3] = ((ChestContent)object2).toString();
                iiIiiiiIii2.ALLATORIxDEMO(objectArray);
            }
            if (((ChestContent)object2).ofType(EndCityGenerator.LootType.THIRD_FLOOR_CHEST)) {
                Object[] objectArray = new Object[--2];
                objectArray[3 ^ 3] = iiIIIIiIii.ALLATORIxDEMO("'\u0006\u0005\u0019\u0016+\u0013\u0018SH\u0006\u0016\u0016\u000b\u0002\b\u00128\u001e\u001dB\u00104\")8\u0004\u0015&&/%25#\"\u0005\u00194F@\t\b\u000f3>\u00143\u0010\u000f]9)$\u0007\u0006%5#\"\u0005\u0019>LF\u0005\u0010\u000bJ^S?)\u001e\u0018\u001a2\u001f\u001d\u0015\u0000\u001aNY\u0001\u0003]#\u0016\r\u0011\r\n\u000f\r\u000f_O\u0015\u0004HC7\u0011\u0005\b\u001b\u0002\nKKMBC\u0003\u0002\u0001\u00044'\u0005\u0004\u0014\u0019]1H\u000f&,\t\t\t\u000f\u000e\t9f`yI7LJ\u0005\f&/\u0003\u001e\u0013W\u001b\u0017\u0017LF\u000f\u000b\u001bIYSU\u001dF]>\u0015\u000e\u0011%\u001f\u0000DF\u001f\u0007\u0014\u000f\u000fU5\u0002\u0001\u0003\u001b\u0004\u0003\u0005\u0019K\u0000J\u0007\u000e\t8\u0004\t\u0001\u0003\u0013J\u000b\r\u0005\u0004\u0003\u0002!$\u0014\u0007\u0005\u0004\u0014\u0019]1\u001df@\u000f\u0006\f\u0005\t49}\u0011=\u0017LJ\u0003\u00055$\u0014WR\u0017lj#\u0014\u0003\u00017\u001aFN\u0005\u001f\t\u001e\u0018\u001a\\\"\b\u0013\u0006\u001aIL\t\u000b]M\u000b\u001a\u0013\u0018;\u001d\b\u0005\u0014\r\u0010Q\u000b\r\r\f\u000e\u000f\f\t\u0012\u0001\u0002\u0003S^]1H\u001f.(\u0012\u000f\u0001\u0001\t\u0004\u0007F`yIF@B\u0005\f&###\u0005\u0004\u0003\u0013LJtc=F@\u000f&,\u000f\u0003\u0012\u001fY5zPBD\u0003\u0005\b\u0019\u0015VM\u000b6M\u0007]\u000b\u001d]:\r\u001b\u0007\u000eYCQXUZK@\u000b\r\u0011_\\UZKF\u0016Z@\u0014\u001dYRY\u0017lj\t\u0004\u0004\u000f\u0018\u000f\u0004W&+\f\u0019\u0005\u0017");
                objectArray[3 >> 1] = ((ChestContent)object2).toString();
                iiIiiiiIii2.ALLATORIxDEMO(objectArray);
            }
            Iterator<ItemStack> iterator = object2 = ((ChestContent)object2).getItems().iterator();
            while (iterator.hasNext()) {
                ItemStack itemStack = object2.next();
                l += (long)itemStack.hashCode();
                iterator = object2;
            }
        }
        Object[] objectArray = new Object[--3];
        objectArray[5 >> 3] = -2289062442L;
        objectArray[3 >> 1] = l;
        objectArray[--2] = IiiIiIIIIi.ALLATORIxDEMO("we[|m\u0011]y_\u007fYtZ1sPGs[.");
        iiIiiiiIii2.ALLATORIxDEMO(objectArray);
    }

    public static void iiIiiiiiII() {
        int n;
        MCVersion mCVersion = MCVersion.v1_16_5;
        EndCity endCity = new EndCity(mCVersion);
        ChunkRand chunkRand = new ChunkRand();
        EndCityGenerator endCityGenerator = new EndCityGenerator(mCVersion);
        int n2 = n = 5 >> 3;
        while (n2 < 1000000000) {
            long l = chunkRand.nextLong();
            BiomeSource biomeSource = BiomeSource.of(Dimension.END, mCVersion, l);
            TerrainGenerator terrainGenerator = TerrainGenerator.of(Dimension.END, biomeSource);
            int n3 = (0xFFFFFF57 & 0xFFFFFFED) / endCity.getSpacing();
            while (true) {
                int n4;
                if (n3 >= 187 / endCity.getSpacing()) break;
                int n5 = (0xFFFFFF45 & 0xFFFFFFFF) / endCity.getSpacing();
                while (true) {
                    int n6;
                    if (n5 >= 187 / endCity.getSpacing()) break;
                    EndCity endCity2 = endCity;
                    CPos cPos = endCity2.getInRegion(l, n4, n6, chunkRand);
                    if (endCity2.canSpawn(cPos, biomeSource) && endCity.canGenerate(cPos, terrainGenerator)) {
                        endCityGenerator.generate(terrainGenerator, cPos.getX(), cPos.getZ(), chunkRand);
                        Object object = endCity.getLoot(l, endCityGenerator, chunkRand, 5 >> 3);
                        int n7 = 2 & 5;
                        object = object.iterator();
                        Object object2 = object;
                        while (object2.hasNext()) {
                            ChestContent chestContent = (ChestContent)object.next();
                            n7 += chestContent.getCount(IiIIiIiiiI -> IiIIiIiiiI.getName().contains(IiiIiIIIIi.ALLATORIxDEMO("uwPS~Pu")));
                            object2 = object;
                        }
                        if (n7 > (0x72 & 0x3F)) {
                            Object[] objectArray = new Object[--4];
                            objectArray[3 ^ 3] = n7;
                            objectArray[4 ^ 5] = l;
                            objectArray[5 >> 1] = cPos.getX() * (0x74 & 0x1B);
                            objectArray[--3] = cPos.getZ() * (0x54 & 0x3B);
                            System.out.printf(iiIIIIiIii.ALLATORIxDEMO("2\r\u000f\r\u0005\f\fFV\u0002IDB\u001e\u0002\b\u0003\\LB\t\u000b\r\u0014\u001aZJo>\u0010J \u001a@O\u0004J>jE\u000eE\u0004"), objectArray);
                        }
                        endCityGenerator.reset();
                    }
                    n5 = ++n6;
                }
                n3 = ++n4;
            }
            n2 = ++n;
        }
    }

    public void IiiIIIIiiI() {
        Iterator iterator;
        iiIiiiiIii iiIiiiiIii2;
        iiIiiiiIii iiIiiiiIii3 = iiIiiiiIii2 = pair;
        iiIiiiiIii3.ALLATORIxDEMO(1L, new BPos(0xFFFFFF79 & 0xFFFFFBB6, 3 ^ 3, 0xFFFFFFE9 & 0xFFFF9D56).toChunkPos(), MCVersion.v1_16_5);
        Object[] objectArray = new Object[3 >> 1];
        objectArray[2 & 5] = iiIiiiiIii2.IiIIiIiiiI.hasShip();
        iiIiiiiIii3.IiiiiiiIIi(objectArray);
        Iterator iterator2 = iterator = new IIIiIiIiII(iiIiiiiIii2).iterator();
        while (iterator2.hasNext()) {
            Pair pair = (Pair)iterator.next();
            Object[] objectArray2 = new Object[--2];
            objectArray2[3 & 4] = iiIiiiiIii2.ALLATORIxDEMO.contains(pair);
            Object[] objectArray3 = new Object[--2];
            objectArray3[2 & 5] = pair.getFirst();
            objectArray3[3 & 5] = pair.getSecond();
            objectArray2[3 & 5] = String.format(iiIIIIiIii.ALLATORIxDEMO("!\u000e\u001eTD\u000e\r@\u0006/%\u0014JE\u0019@\u000b\u0014J0%\u0013JE\u0019"), objectArray3);
            iiIiiiiIii2.IiiiiiiIIi(objectArray2);
            iterator2 = iterator;
        }
    }

    private /* synthetic */ void IiiiiiiIIi(Object ... objectArray) {
        Object[] objectArray2 = objectArray3;
        Object[] objectArray3 = objectArray;
        objectArray = objectArray2;
    }

    private /* synthetic */ void ALLATORIxDEMO(Object ... objectArray) {
        Object[] objectArray2 = objectArray3;
        Object[] objectArray3 = objectArray;
        objectArray = objectArray2;
    }

    public void IiiiiiiIIi() {
        iiIiiiiIii iiIiiiiIii2 = iterator;
        iiIiiiiIii2.ALLATORIxDEMO(172023L, new BPos(0x2BF1 & 0x57FE, 2 & 5, 0x6998 & 0x17E7).toChunkPos(), MCVersion.v1_16_1);
        Iterator iterator = new EndCity(MCVersion.v1_16_1).getLoot(172023L, iiIiiiiIii2.IiIIiIiiiI, new ChunkRand(), (2 & 5) != 0);
        long l = 0L;
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Iterator<ItemStack> iterator2 = ((ChestContent)iterator.next()).getItems().iterator();
            while (iterator2.hasNext()) {
                Iterator<ItemStack> iterator3;
                ItemStack itemStack = iterator3.next();
                l += (long)itemStack.hashCode();
                iterator2 = iterator3;
            }
        }
        Object[] objectArray = new Object[--3];
        objectArray[3 >> 2] = 4863304372L;
        objectArray[--1] = l;
        objectArray[--2] = IiiIiIIIIi.ALLATORIxDEMO("we[|m\u0011]y_\u007fYtZ1sPGs[.");
        iiIiiiiIii2.ALLATORIxDEMO(objectArray);
    }

    public void ALLATORIxDEMO() {
        iiIiiiiIii iiIiiiiIii2 = iterator;
        long l = -4425006226675986357L;
        iiIiiiiIii iiIiiiiIii3 = iiIiiiiIii2;
        iiIiiiiIii3.ALLATORIxDEMO(l, new BPos(0xFFFFFDCE & 0xFFFFF6F1, 3 ^ 3, 0xFFFFFEC9 & 0xFFFFFFF6).toChunkPos(), MCVersion.v1_16_5);
        Object[] objectArray = new Object[--3];
        objectArray[3 ^ 3] = 0x119F & 0x6EFB;
        objectArray[--1] = iiIiiiiIii2.IiIIiIiiiI.getGlobalPieces().size();
        objectArray[5 >> 1] = iiIIIIiIii.ALLATORIxDEMO(":\b\u000fB\r\u0012\u0012\u0007N\u0001\u0016\u0014G\t\b\u0003\u001f\tJS\r\b\u000b\u0016\u000f`>\b\u000f@\u001a\u0012\u0005\u0010\u000f2j\u0013\u0003\u001a\u000f");
        iiIiiiiIii3.ALLATORIxDEMO(objectArray);
        Object[] objectArray2 = new Object[3 >> 1];
        objectArray2[3 & 4] = iiIiiiiIii2.IiIIiIiiiI.hasShip();
        iiIiiiiIii2.IiiiiiiIIi(objectArray2);
        Iterator iterator = new EndCity(MCVersion.v1_16_5).getLoot(l, iiIiiiiIii2.IiIIiIiiiI, new ChunkRand(), 5 >> 3);
        l = 0L;
        Iterator iterator2 = iterator = iterator.iterator();
        while (iterator2.hasNext()) {
            ChestContent chestContent = (ChestContent)iterator.next();
            l += (long)chestContent.getCount(IiIIiIiiiI -> IiIIiIiiiI.getName().contains(iiIIIIiIii.ALLATORIxDEMO("\u000e)+\r\u0005\u000e\u000e")));
            iterator2 = iterator;
        }
        Object[] objectArray3 = new Object[--3];
        objectArray3[3 ^ 3] = 0x4C & 0x77;
        objectArray3[3 & 5] = l;
        objectArray3[5 >> 1] = IiiIiIIIIi.ALLATORIxDEMO("XQvTy\u00172\u001erQdpE\u001euQtM\u007f\u0019e>\\_e]y");
        iiIiiiiIii2.ALLATORIxDEMO(objectArray3);
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[2 ^ 3];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n = --4;
        int n2 = string2.length();
        int n3 = n2 - (4 ^ 5);
        char[] cArray = new char[n2];
        int n4 = n << n ^ (--3 << (1 ^ 3) ^ --1);
        int cfr_ignored_0 = --5 << --4 ^ --4 << (3 >> 1);
        int n5 = --5 << --3 ^ (1 ^ 3);
        int n6 = IiIIiIiiiI = string3.length() - (2 ^ 3);
        int n7 = n3;
        String string4 = string3;
        while (n7 >= 0) {
            int n8 = n3--;
            cArray[n8] = (char)(n5 ^ (string2.charAt(n8) ^ string4.charAt(IiIIiIiiiI)));
            if (n3 < 0) break;
            int n9 = n3--;
            char c = cArray[n9] = (char)(n4 ^ (string2.charAt(n9) ^ string4.charAt(IiIIiIiiiI)));
            if (--IiIIiIiiiI < 0) {
                IiIIiIiiiI = n6;
            }
            n7 = n3;
        }
        return new String(cArray);
    }
}

