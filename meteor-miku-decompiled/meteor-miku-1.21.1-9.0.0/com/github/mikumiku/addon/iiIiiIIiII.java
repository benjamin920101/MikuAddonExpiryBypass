/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  net.minecraft.screen.GenericContainerScreenHandler
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.ChestBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.block.BlockState
 *  net.minecraft.block.enums.ChestType
 *  net.minecraft.state.property.Property
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiIIiIII;
import com.github.mikumiku.addon.IiiIIIiiII;
import com.github.mikumiku.addon.IiiiIIiiIi;
import com.github.mikumiku.addon.iIIiiIiiIi;
import com.github.mikumiku.addon.iIiIIiiIiI;
import com.github.mikumiku.addon.iiIIiIiIII;
import com.github.mikumiku.addon.iiIiiIIIiI;
import com.github.mikumiku.addon.iiiiIiiiII;
import com.github.mikumiku.addon.iiiiiiIIiI;
import com.github.mikumiku.addon.modules.sorter.ContainerSearcher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.block.ChestBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.ChestType;
import net.minecraft.state.property.Property;
import net.minecraft.client.MinecraftClient;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiiIIiII {
    public int iiIiIIiIIi;
    private final IiiIIIiiII IIIIiIiiIi;
    private Map<String, IiiiIIiiIi> IiIiIIIIiI;
    public List<iIiIIiiIiI> iiiiiIIiiI;
    private long iiIIIIiIII;
    private final Map<String, iIiIIiiIiI> IiIIiIiiiI;
    public class_310 ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public iiIiiIIiII(List<iIiIIiiIiI> list, int n, IiiIIIiiII iiiIIIiiII) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        iiIiiIIiII IiIIiIiiiI3;
        iiIiiIIiII iiIiiIIiII2 = iiiIIIiiII2;
        IiiIIIiiII iiiIIIiiII2 = iiiIIIiiII;
        iiIiiIIiII iiIiiIIiII3 = IiIIiIiiiI3 = iiIiiIIiII2;
        iiIiiIIiII iiIiiIIiII4 = IiIIiIiiiI3;
        iiIiiIIiII iiIiiIIiII5 = IiIIiIiiiI3;
        iiIiiIIiII5.ALLATORIxDEMO = class_310.getInstance();
        iiIiiIIiII iiIiiIIiII6 = IiIIiIiiiI3;
        iiIiiIIiII5.iiiiiIIiiI = new ArrayList<iIiIIiiIiI>();
        iiIiiIIiII5.iiIiIIiIIi = 0x37 & 0x5C;
        iiIiiIIiII iiIiiIIiII7 = IiIIiIiiiI3;
        iiIiiIIiII5.IiIiIIIIiI = new ConcurrentHashMap<String, IiiiIIiiIi>();
        iiIiiIIiII iiIiiIIiII8 = IiIIiIiiiI3;
        iiIiiIIiII7.IiIIiIiiiI = new ConcurrentHashMap<String, iIiIIiiIiI>();
        iiIiiIIiII4.iiIIIIiIII = 0L;
        iiIiiIIiII4.iiiiiIIiiI = IiIIiIiiiI2;
        iiIiiIIiII3.iiIiIIiIIi = IiIIiIiiiI;
        iiIiiIIiII3.IIIIiIiiIi = iiiIIIiiII2;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIiiIIIiI.ALLATORIxDEMO("r=\u0007pV3\u0005#u\u0012D\"@w%\u8b81\u66f1\u65c6\u5215\u6756\u65b5\u723e\u6729\uff77"));
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public iIiIIiiIiI ALLATORIxDEMO(int n, int n2, int n3) {
        iiIiiIIiII iiIiiIIiII2 = iiIiiIIiII3;
        try {
            void IiIIiIiiiI;
            void IiIIiIiiiI2;
            void IiIIiIiiiI3;
            class_2680 class_26802 = iiIiiIIiII2.ALLATORIxDEMO.world.getBlockState(new class_2338((int)IiIIiIiiiI3, (int)IiIIiIiiiI2, (int)IiIIiIiiiI));
            if (class_26802.isAir()) {
                return null;
            }
            iiIiiIIiII iiIiiIIiII3 = (class_2745)class_26802.get((class_2769)class_2281.CHEST_TYPE);
            class_2350 class_23502 = (class_2350)class_26802.get((class_2769)class_2281.FACING);
            iiiiIiiiII.ALLATORIxDEMO("\u67e5\u627e\u5927\u7bb1\u5b50\u7684\u914d\u5bf9\u4f4d\u7f6efaceing: " + String.valueOf(class_23502) + "chestType: " + String.valueOf(iiIiiIIiII3));
            if (iiIiiIIiII3 == null) return null;
            if (class_23502 == null) return null;
            if (iiIiiIIiII3 == class_2745.SINGLE) {
                return null;
            }
            void var7_8 = IiIIiIiiiI3;
            void var8_9 = IiIIiIiiiI;
            switch (iiiiiiIIiI.ALLATORIxDEMO[class_23502.ordinal()]) {
                case 1: {
                    if (iiIiiIIiII3 == class_2745.LEFT) {
                        var7_8 = IiIIiIiiiI3 + (2 ^ 3);
                        return new iIiIIiiIiI((int)var7_8, (int)IiIIiIiiiI2, (int)var8_9);
                    }
                }
                var7_8 = IiIIiIiiiI3 - (5 >> 2);
                return new iIiIIiiIiI((int)var7_8, (int)IiIIiIiiiI2, (int)var8_9);
                case 2: {
                    if (iiIiiIIiII3 == class_2745.LEFT) {
                        var7_8 = IiIIiIiiiI3 - --1;
                        return new iIiIIiiIiI((int)var7_8, (int)IiIIiIiiiI2, (int)var8_9);
                    }
                }
                var7_8 = IiIIiIiiiI3 + --1;
                return new iIiIIiiIiI((int)var7_8, (int)IiIIiIiiiI2, (int)var8_9);
                case 3: {
                    if (iiIiiIIiII3 == class_2745.LEFT) {
                        var8_9 = IiIIiIiiiI - (2 ^ 3);
                        return new iIiIIiiIiI((int)var7_8, (int)IiIIiIiiiI2, (int)var8_9);
                    }
                }
                var8_9 = IiIIiIiiiI + (2 ^ 3);
                return new iIiIIiiIiI((int)var7_8, (int)IiIIiIiiiI2, (int)var8_9);
                case 4: {
                    if (iiIiiIIiII3 != class_2745.LEFT) break;
                    var8_9 = IiIIiIiiiI + (3 & 5);
                    return new iIiIIiiIiI((int)var7_8, (int)IiIIiIiiiI2, (int)var8_9);
                }
                default: {
                    return null;
                }
            }
            var8_9 = IiIIiIiiiI - (3 & 5);
            return new iIiIIiiIiI((int)var7_8, (int)IiIIiIiiiI2, (int)var8_9);
        } catch (Exception exception) {
            iiiiIiiiII.ALLATORIxDEMO("\u67e5\u627e\u5927\u7bb1\u5b50\u7684\u914d\u5bf9\u4f4d\u7f6e\u51fa\u9519\u4e86," + String.valueOf(exception));
            return null;
        }
    }

    public Collection<IiiiIIiiIi> ALLATORIxDEMO() {
        return this.IiIiIIIIiI.values();
    }

    public void IiiIIIIiiI() {
        iiIiiIIiII iiIiiIIiII2 = this;
        iiIiiIIiII2.IiIiIIIIiI.clear();
        iiIiiIIiII2.IiIIiIiiiI.clear();
    }

    private /* synthetic */ void IiiiiiiIIi() {
        iiIiiIIiII iiIiiIIiII2 = this;
        for (IiiiIIiiIi iiiiIIiiIi : iiIiiIIiII2.IiIiIIIIiI.values()) {
            if (iiiiIIiiIi.IiIiIIIIiI == null) continue;
            IiiiIIiiIi iiiiIIiiIi2 = iiiiIIiiIi;
            iiIiiIIiII2.IiIIiIiiiI.put(iiiiIIiiIi2.IiIiIIIIiI, iiiiIIiiIi2.IIIIiIiiIi);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ iIiIIiiIiI ALLATORIxDEMO(int n, int n2, int n3, List<iIIiiIiiIi> list) {
        int n4;
        iiIiiIIiII iiIiiIIiII2 = object;
        int[][] nArrayArray = new int[--4][];
        int[] nArray = new int[--2];
        int n5 = 2 & 5;
        nArray[n5] = --1;
        nArray[3 & 5] = 2 & 5;
        nArrayArray[n5] = nArray;
        int[] nArray2 = new int[--2];
        nArray2[3 & 4] = -4 >> 2;
        int n6 = 2 ^ 3;
        nArray2[n6] = 5 >> 3;
        nArrayArray[n6] = nArray2;
        int[] nArray3 = new int[1 ^ 3];
        nArray3[2 & 5] = 5 >> 3;
        int n7 = 4 ^ 5;
        nArray3[n7] = n7;
        nArrayArray[5 >> 1] = nArray3;
        int[] nArray4 = new int[--2];
        nArray4[5 >> 3] = 3 >> 2;
        nArray4[2 ^ 3] = -4 >> 2;
        nArrayArray[--3] = nArray4;
        int[][] nArrayArray2 = nArrayArray;
        int n8 = nArrayArray.length;
        int n9 = n4 = 3 & 4;
        while (n9 < n8) {
            void IiIIiIiiiI;
            void IiIIiIiiiI2;
            void IiIIiIiiiI3;
            Object object = nArrayArray2[n4];
            void var9_10 = IiIIiIiiiI3 + object[3 & 4];
            void this2 = IiIIiIiiiI2 + object[2 ^ 3];
            for (iIIiiIiiIi iIIiiIiiIi2 : IiIIiIiiiI) {
                void IiIIiIiiiI4;
                if (iIIiiIiiIi2.iiiiiIIiiI != ContainerSearcher.ContainerType.iiIIIIiIII || iIIiiIiiIi2.ALLATORIxDEMO != var9_10 || iIIiiIiiIi2.IiIIiIiiiI != IiIIiIiiiI4 || iIIiiIiiIi2.iiIIIIiIII != this2) continue;
                return new iIiIIiiIiI((int)var9_10, (int)IiIIiIiiiI4, (int)this2);
            }
            n9 = ++n4;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean IiiiiiiIIi(int n, int n2, int n3) {
        void IiIIiIiiiI;
        int IiIIiIiiiI22 = n2;
        int IiIIiIiiiI3 = n;
        class_310 class_3102 = class_310.getInstance();
        class_2338 IiIIiIiiiI22 = new class_2338(IiIIiIiiiI3, IiIIiIiiiI22, (int)IiIIiIiiiI);
        if (!((IiIIiIiiiI22 = class_3102.world.getBlockState(IiIIiIiiiI22)).getBlock() instanceof class_2281)) {
            return (3 ^ 3) != 0;
        }
        if ((class_2745)IiIIiIiiiI22.get((class_2769)class_2281.CHEST_TYPE) != class_2745.SINGLE) {
            return 3 >> 1;
        }
        return false;
    }

    public Boolean ALLATORIxDEMO(class_2680 class_26802) {
        iiIiiIIiII iiIiiIIiII2 = iiIiiIIiII3;
        iiIiiIIiII iiIiiIIiII3 = class_26802;
        iiIiiIIiII IiIIiIiiiI = iiIiiIIiII2;
        try {
            if (!(iiIiiIIiII3.getBlock() instanceof class_2281)) {
                return (2 & 5) != 0;
            }
            return ((class_2745)iiIiiIIiII3.get((class_2769)class_2281.CHEST_TYPE) != class_2745.SINGLE ? 3 & 5 : 0) != 0;
        } catch (Exception exception) {
            return (2 & 5) != 0;
        }
    }

    public void ALLATORIxDEMO() {
        iiIiiIIiII iiIiiIIiII2 = object3;
        long l = System.currentTimeMillis();
        if (l - iiIiiIIiII2.iiIIIIiIII < 600000L) {
            return;
        }
        iiiiIiiiII.ALLATORIxDEMO(iiIIiIiIII.ALLATORIxDEMO("\u66ee\u65cf\u5b43\u50d6\u7ba2\u5b26\u7f02\u5b2c"));
        iiIiiIIiII iiIiiIIiII3 = iiIiiIIiII2;
        iiIiiIIiII3.iiIIIIiIII = l;
        int n = iiIiiIIiII3.ALLATORIxDEMO.player.getBlockPos().getX();
        int n2 = iiIiiIIiII3.ALLATORIxDEMO.player.getBlockPos().getY();
        int n3 = iiIiiIIiII3.ALLATORIxDEMO.player.getBlockPos().getZ();
        Object object = IiIiIIiIII.ALLATORIxDEMO(n, n2, n3, iiIiiIIiII2.iiIiIIiIIi);
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<Object>();
        HashSet<iIiIIiiIiI> hashSet = new HashSet<iIiIIiiIiI>();
        object = object.iterator();
        block0: while (true) {
            Object object2 = object;
            while (object2.hasNext()) {
                Object object3 = (iIIiiIiiIi)object.next();
                if (((iIIiiIiiIi)object3).iiiiiIIiiI != ContainerSearcher.ContainerType.iiIIIIiIII) continue block0;
                Object object4 = object3;
                iIiIIiiIiI iIiIIiiIiI2 = new iIiIIiiIiI(((iIIiiIiiIi)object4).ALLATORIxDEMO, ((iIIiiIiiIi)object4).IiIIiIiiiI, ((iIIiiIiiIi)object3).iiIIIIiIII);
                if (hashSet.contains(iIiIIiiIiI2)) {
                    object2 = object;
                    continue;
                }
                Object object5 = object3;
                if (iiIiiIIiII2.ALLATORIxDEMO(((iIIiiIiiIi)object5).ALLATORIxDEMO, ((iIIiiIiiIi)object5).IiIIiIiiiI, ((iIIiiIiiIi)object3).iiIIIIiIII)) {
                    object2 = object;
                    continue;
                }
                Object object6 = object3;
                if (iiIiiIIiII.IiiiiiiIIi(((iIIiiIiiIi)object6).ALLATORIxDEMO, ((iIIiiIiiIi)object6).IiIIiIiiiI, ((iIIiiIiiIi)object3).iiIIIIiIII)) {
                    Object object7 = object3;
                    iIiIIiiIiI iIiIIiiIiI3 = iiIiiIIiII2.ALLATORIxDEMO(((iIIiiIiiIi)object7).ALLATORIxDEMO, ((iIIiiIiiIi)object7).IiIIiIiiiI, ((iIIiiIiiIi)object3).iiIIIIiIII);
                    if (iIiIIiiIiI3 != null) {
                        Object object8 = object3;
                        object3 = new iIiIIiiIiI(((iIIiiIiiIi)object8).ALLATORIxDEMO, ((iIIiiIiiIi)object8).IiIIiIiiiI, ((iIIiiIiiIi)object3).iiIIIIiIII, --1 != 0, iIiIIiiIiI3).ALLATORIxDEMO(iIiIIiiIiI3);
                        linkedHashSet.add(object3);
                        hashSet.add(iIiIIiiIiI2);
                        hashSet.add(iIiIIiiIiI3);
                        if (iiIiiIIiII2.IiIiIIIIiI.containsKey(((iIiIIiiIiI)object3).ALLATORIxDEMO())) continue block0;
                        iiIiiIIiII2.IiIiIIIIiI.put(((iIiIIiiIiI)object3).ALLATORIxDEMO(), new IiiiIIiiIi((iIiIIiiIiI)object3));
                        continue block0;
                    }
                    linkedHashSet.add(iIiIIiiIiI2);
                    hashSet.add(iIiIIiiIiI2);
                    if (iiIiiIIiII2.IiIiIIIIiI.containsKey(iIiIIiiIiI2.ALLATORIxDEMO())) continue block0;
                    iiIiiIIiII2.IiIiIIIIiI.put(iIiIIiiIiI2.ALLATORIxDEMO(), new IiiiIIiiIi(iIiIIiiIiI2));
                    continue block0;
                }
                linkedHashSet.add(iIiIIiiIiI2);
                hashSet.add(iIiIIiiIiI2);
                if (iiIiiIIiII2.IiIiIIIIiI.containsKey(iIiIIiiIiI2.ALLATORIxDEMO())) continue block0;
                iiIiiIIiII2.IiIiIIIIiI.put(iIiIIiiIiI2.ALLATORIxDEMO(), new IiiiIIiiIi(iIiIIiiIiI2));
                continue block0;
            }
            break;
        }
        iiiiIiiiII.ALLATORIxDEMO("\u66f4\u65b0\u5b58\u50a8\u7bb1\u5b50\u7f13\u5b58\u5b8c\u6210\uff0c\u6570\u91cf:" + iiIiiIIiII2.IiIiIIIIiI.size());
        if (iiIiiIIiII2.IiIiIIIIiI.size() == 0) {
            iiIiiIIiII2.iiIIIIiIII = 0L;
        }
        iiIiiIIiII2.IiiiiiiIIi();
    }

    public iIiIIiiIiI ALLATORIxDEMO(iIiIIiiIiI iIiIIiiIiI2) {
        iiIiiIIiII iiIiiIIiII2 = iIiIIiiIiI3;
        iIiIIiiIiI iIiIIiiIiI3 = iIiIIiiIiI2;
        iiIiiIIiII IiIIiIiiiI = iiIiiIIiII2;
        iIiIIiiIiI iIiIIiiIiI4 = iIiIIiiIiI3;
        return IiIIiIiiiI.ALLATORIxDEMO(iIiIIiiIiI4.iiiiiIIiiI, iIiIIiiIiI4.ALLATORIxDEMO, iIiIIiiIiI3.iiIIIIiIII);
    }

    private static /* synthetic */ double ALLATORIxDEMO(class_310 class_3102, IiiiIIiiIi iiiiIIiiIi) {
        class_310 IiIIiIiiiI;
        Object IiIIiIiiiI22 = iiiiIIiiIi;
        class_310 class_3103 = IiIIiIiiiI = class_3102;
        int IiIIiIiiiI22 = class_3103.player.getBlockPos().getX();
        int n = class_3103.player.getBlockPos().getY();
        int n2 = class_3103.player.getBlockPos().getZ();
        return IiIIiIiiiI22.IIIIiIiiIi.ALLATORIxDEMO(IiIIiIiiiI22, n, n2);
    }

    public String ALLATORIxDEMO() {
        iiIiiIIiII iiIiiIIiII2;
        iiIiiIIiII iiIiiIIiII3 = iiIiiIIiII2 = this;
        int n = iiIiiIIiII3.IiIiIIIIiI.size();
        int n2 = (int)iiIiiIIiII3.IiIiIIIIiI.values().stream().filter(IiIIiIiiiI -> IiIIiIiiiI.ALLATORIxDEMO).count();
        int n3 = (int)iiIiiIIiII2.IiIiIIIIiI.values().stream().filter(IiIIiIiiiI -> {
            if (IiIIiIiiiI.IiIiIIIIiI != null) {
                return (3 & 5) != 0;
            }
            return false;
        }).count();
        int n4 = (int)iiIiiIIiII2.IiIiIIIIiI.keySet().stream().filter(IiIIiIiiiI -> iIiIIiiIiI.ALLATORIxDEMO((String)IiIIiIiiiI).IiIIiIiiiI).count();
        int n5 = iiIiiIIiII2.iiiiiIIiiI.size();
        Object[] objectArray = new Object[--5];
        objectArray[3 >> 2] = n;
        objectArray[5 >> 2] = n2;
        objectArray[5 >> 1] = n3;
        objectArray[--3] = n4;
        objectArray[--4] = n5;
        return String.format(iiIIiIiIII.ALLATORIxDEMO("\u7bc1\u5b45\u7f24\u5b0a\rr\u602c\u8bd3\u00126\u4e1d~7\u7a08\u7ba6\u5b22\u00126\u4e3d^7\u4e61\u7537\u7bcb\u5b42Rv\u4e5d3Z\u592d\u7bde\u5b41Qh\u4e437Z\u5dd4\u63d1\u967eZ\u007f\u4e54\u6e83\u7bc7\u5b41]"), objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public boolean ALLATORIxDEMO(int n, int n2, int n3, class_1707 class_17072, String string) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        iiIiiIIiII iiIiiIIiII2;
        Object object;
        int IiIIiIiiiI3;
        void IiIIiIiiiI422;
        void IiIIiIiiiI522;
        Object object3;
        Object object2 = object3;
        if (((iiIiiIIiII)object2).ALLATORIxDEMO((int)IiIIiIiiiI522, (int)IiIIiIiiiI422, IiIIiIiiiI3)) {
            iiiiIiiiII.ALLATORIxDEMO("[ChestCache] onChestOpened: \u6392\u9664\u6e90\u7bb1\u5b50 (" + (int)IiIIiIiiiI522 + ", " + (int)IiIIiIiiiI422 + ", " + IiIIiIiiiI3 + ")");
            return (2 ^ 3) != 0;
        }
        Object this_ = null;
        if (iiIiiIIiII.IiiiiiiIIi((int)IiIIiIiiiI522, (int)IiIIiIiiiI422, IiIIiIiiiI3)) {
            object = ((iiIiiIIiII)object2).ALLATORIxDEMO((int)IiIIiIiiiI522, (int)IiIIiIiiiI422, IiIIiIiiiI3);
            if (object != null) {
                v0 = new iIiIIiiIiI((int)IiIIiIiiiI522, (int)IiIIiIiiiI422, IiIIiIiiiI3, --1 != 0, (iIiIIiiIiI)object);
                iIiIIiiIiI hashMap2 = v0;
                this_ = v0.ALLATORIxDEMO((iIiIIiiIiI)object);
            } else {
                v0 = new iIiIIiiIiI((int)IiIIiIiiiI522, (int)IiIIiIiiiI422, IiIIiIiiiI3);
                this_ = v0;
            }
        } else {
            this_ = new iIiIIiiIiI((int)IiIIiIiiiI522, (int)IiIIiIiiiI422, IiIIiIiiiI3);
        }
        if (!((iiIiiIIiII)object2).IiIiIIIIiI.containsKey(((iIiIIiiIiI)this_).ALLATORIxDEMO()) && ((iIiIIiiIiI)this_).IiIIiIiiiI) {
            for (String string2 : ((iiIiiIIiII)object2).IiIiIIIIiI.keySet()) {
                iIiIIiiIiI IiIIiIiiiI522 = iIiIIiiIiI.ALLATORIxDEMO(string2);
                if (!IiIIiIiiiI522.IiIIiIiiiI) continue;
                iIiIIiiIiI IiIIiIiiiI422 = ((iiIiiIIiII)object2).ALLATORIxDEMO(IiIIiIiiiI522);
                if ((IiIIiIiiiI522.iiiiiIIiiI != ((iIiIIiiIiI)this_).iiiiiIIiiI || IiIIiIiiiI522.ALLATORIxDEMO != ((iIiIIiiIiI)this_).ALLATORIxDEMO || IiIIiIiiiI522.iiIIIIiIII != ((iIiIIiiIiI)this_).iiIIIIiIII) && (IiIIiIiiiI422.iiiiiIIiiI != ((iIiIIiiIiI)this_).iiiiiIIiiI || IiIIiIiiiI422.ALLATORIxDEMO != ((iIiIIiiIiI)this_).ALLATORIxDEMO || IiIIiIiiiI422.iiIIIIiIII != ((iIiIIiiIiI)this_).iiIIIIiIII)) continue;
                this_ = IiIIiIiiiI522;
                iiIiiIIiII2 = object2;
                break;
            }
        } else {
            iiIiiIIiII2 = object2;
        }
        object = iiIiiIIiII2.IiIiIIIIiI.computeIfAbsent(((iIiIIiiIiI)this_).ALLATORIxDEMO(), IiiiIIiiIi::new);
        ((IiiiIIiiIi)object).ALLATORIxDEMO((class_1707)IiIIiIiiiI2, ((iiIiiIIiII)object2).IIIIiIiiIi);
        if (((IiiiIIiiIi)object).IiIiIIIIiI != null) {
            ((iiIiiIIiII)object2).IiIIiIiiiI.put(((IiiiIIiiIi)object).IiIiIIIIiI, (iIiIIiiIiI)this_);
        }
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        int IiIIiIiiiI522 = 2 & 5;
        int IiIIiIiiiI422 = 0x1E & 0x7B;
        if (IiIIiIiiiI2.getInventory().size() > (0x7E & 0x3F)) {
            IiIIiIiiiI422 = 0x35 & 0x7F;
        }
        int n4 = IiIIiIiiiI3 = 0;
        while (n4 <= IiIIiIiiiI422) {
            this_ = IiIIiIiiiI2.getInventory().getStack(IiIIiIiiiI3);
            if (this_ != null && !this_.isEmpty()) {
                object = ((iiIiiIIiII)object2).IIIIiIiiIi.IiiiiiiIIi((class_1799)this_);
                HashMap<String, Integer> hashMap2 = hashMap;
                hashMap2.put((String)object, hashMap2.getOrDefault(object, 3 ^ 3) + this_.getCount());
                IiIIiIiiiI522 += this_.getCount();
            }
            n4 = ++IiIIiIiiiI3;
        }
        if (IiIIiIiiiI522 > 0 && (IiIIiIiiiI3 = (String)hashMap.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null)) != null && !IiIIiIiiiI3.equals(IiIIiIiiiI)) {
            iiiiIiiiII.ALLATORIxDEMO("\u7bb1\u5b50\u4e3b\u8981\u5b58\u50a8 " + IiIIiIiiiI3 + "\uff0c\u4e0d\u9002\u5408\u5b58\u50a8 " + (String)IiIIiIiiiI + "\uff0c\u8df3\u8fc7\u6b64\u5206\u7c7b");
            return (2 ^ 3) != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(int n, int n2, int n3) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        iiIiiIIiII iterator;
        iiIiiIIiII iiIiiIIiII2 = iterator;
        if (iiIiiIIiII2.iiiiiIIiiI.isEmpty()) {
            iiiiIiiiII.ALLATORIxDEMO(iiIiiIIIiI.ALLATORIxDEMO("y\u0012\ntV\"f7f\u001e@\u000b\u0005\u8b30\u544fL%\u6cd7\u672c\u911b\u7f6b\u6ee6\u7bb4\u5b26"));
        }
        for (iIiIIiiIiI this_ : iiIiiIIiII2.iiiiiIIiiI) {
            if (this_.iiiiiIIiiI == IiIIiIiiiI3 && this_.ALLATORIxDEMO == IiIIiIiiiI2 && this_.iiIIIIiIII == IiIIiIiiiI) {
                iiiiIiiiII.ALLATORIxDEMO("[ChestCache] \u5339\u914d\u5230\u6e90\u7bb1\u5b50: (" + (int)IiIIiIiiiI3 + ", " + (int)IiIIiIiiiI2 + ", " + (int)IiIIiIiiiI + ")");
                return (2 ^ 3) != 0;
            }
            iIiIIiiIiI iIiIIiiIiI2 = this_;
            if (!iiIiiIIiII.IiiiiiiIIi(iIiIIiiIiI2.iiiiiIIiiI, iIiIIiiIiI2.ALLATORIxDEMO, this_.iiIIIIiIII)) continue;
            iiiiIiiiII.ALLATORIxDEMO("[ChestCache] \u6e90\u7bb1\u5b50\u662f\u5927\u7bb1\u5b50: (" + (int)IiIIiIiiiI3 + ", " + (int)IiIIiIiiiI2 + ", " + (int)IiIIiIiiiI + ")");
            iIiIIiiIiI iIiIIiiIiI3 = this_;
            iIiIIiiIiI iIiIIiiIiI4 = iiIiiIIiII2.ALLATORIxDEMO(iIiIIiiIiI3.iiiiiIIiiI, iIiIIiiIiI3.ALLATORIxDEMO, this_.iiIIIIiIII);
            if (iIiIIiiIiI4 != null) {
                if (iIiIIiiIiI4.iiiiiIIiiI != IiIIiIiiiI3 || iIiIIiiIiI4.ALLATORIxDEMO != IiIIiIiiiI2 || iIiIIiiIiI4.iiIIIIiIII != IiIIiIiiiI) continue;
                iiiiIiiiII.ALLATORIxDEMO("[ChestCache] \u5339\u914d\u5230\u5927\u7bb1\u5b50\u914d\u5bf9\u4f4d\u7f6e: (" + (int)IiIIiIiiiI3 + ", " + (int)IiIIiIiiiI2 + ", " + (int)IiIIiIiiiI + ")");
                return (3 & 5) != 0;
            }
            iiiiIiiiII.ALLATORIxDEMO(iiIIiIiIII.ALLATORIxDEMO("I4z\u0012l\u000eI\u000er\u001ci47\u6ee2\u7b97\u5b13\u593d\u7bce\u5b4b\u6651}\u0003}\u0018"));
        }
        if (iiIiiIIiII.IiiiiiiIIi((int)IiIIiIiiiI3, (int)IiIIiIiiiI2, (int)IiIIiIiiiI)) {
            iiiiIiiiII.ALLATORIxDEMO("[ChestCache] \u7bb1\u5b50\u662f\u5927\u7bb1\u5b50: (" + (int)IiIIiIiiiI3 + ", " + (int)IiIIiIiiiI2 + ", " + (int)IiIIiIiiiI + ")");
            iIiIIiiIiI iIiIIiiIiI5 = iiIiiIIiII2.ALLATORIxDEMO((int)IiIIiIiiiI3, (int)IiIIiIiiiI2, (int)IiIIiIiiiI);
            if (iIiIIiiIiI5 != null) {
                for (iIiIIiiIiI iIiIIiiIiI4 : iiIiiIIiII2.iiiiiIIiiI) {
                    if (iIiIIiiIiI4.iiiiiIIiiI != iIiIIiiIiI5.iiiiiIIiiI || iIiIIiiIiI4.ALLATORIxDEMO != iIiIIiiIiI5.ALLATORIxDEMO || iIiIIiiIiI4.iiIIIIiIII != iIiIIiiIiI5.iiIIIIiIII) continue;
                    iiiiIiiiII.ALLATORIxDEMO("[ChestCache] \u4f20\u5165\u4f4d\u7f6e\u662f\u5927\u7bb1\u5b50\uff0c\u5176\u914d\u5bf9\u4f4d\u7f6e\u5339\u914d\u6e90\u7bb1\u5b50: (" + (int)IiIIiIiiiI3 + ", " + (int)IiIIiIiiiI2 + ", " + (int)IiIIiIiiiI + ")");
                    return 3 >> 1;
                }
            } else {
                iiiiIiiiII.ALLATORIxDEMO(iiIiiIIIiI.ALLATORIxDEMO("Jf>@%q5D5M3XV\u5922\u7bc7\u5b75\u6679k\u0003i\u001a"));
            }
        }
        iiiiIiiiII.ALLATORIxDEMO("[ChestCache] \u4f4d\u7f6e (" + (int)IiIIiIiiiI3 + ", " + (int)IiIIiIiiiI2 + ", " + (int)IiIIiIiiiI + ") \u4e0d\u662f\u6e90\u7bb1\u5b50");
        return 3 >> 2;
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 & 5];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(3 ^ 3, stackTraceElement.getMethodName()).toString();
        int n = string2.length();
        int n2 = n - (3 >> 1);
        char[] cArray = new char[n];
        int n3 = --5;
        int cfr_ignored_0 = --3 ^ --5;
        int n4 = --5 << --3 ^ --2;
        int n5 = IiIIiIiiiI = string3.length() - (5 >> 2);
        int n6 = n2;
        String string4 = string3;
        while (n6 >= 0) {
            int n7 = n2--;
            cArray[n7] = (char)(n4 ^ (string2.charAt(n7) ^ string4.charAt(IiIIiIiiiI)));
            if (n2 < 0) break;
            int n8 = n2--;
            char c = cArray[n8] = (char)(n3 ^ (string2.charAt(n8) ^ string4.charAt(IiIIiIiiiI)));
            if (--IiIIiIiiiI < 0) {
                IiIIiIiiiI = n5;
            }
            n6 = n2;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public iIiIIiiIiI ALLATORIxDEMO(String string) {
        void IiIIiIiiiI2;
        iiIiiIIiII iiIiiIIiII2 = object;
        iIiIIiiIiI iIiIIiiIiI2 = iiIiiIIiII2.IiIIiIiiiI.get(IiIIiIiiiI2);
        if (iIiIIiiIiI2 != null && iiIiiIIiII2.IiIiIIIIiI.containsKey(iIiIIiiIiI2.ALLATORIxDEMO()) && ((IiiiIIiiIi)(object = iiIiiIIiII2.IiIiIIIIiI.get(iIiIIiiIiI2.ALLATORIxDEMO()))).ALLATORIxDEMO((String)IiIIiIiiiI2) && ((IiiiIIiiIi)object).ALLATORIxDEMO() > 0) {
            return iIiIIiiIiI2;
        }
        Object object = class_310.getInstance();
        return iiIiiIIiII2.IiIiIIIIiI.values().stream().filter(IiIIiIiiiI -> IiIIiIiiiI.ALLATORIxDEMO).min(Comparator.comparingDouble(arg_0 -> iiIiiIIiII.ALLATORIxDEMO((class_310)object, arg_0))).map(IiIIiIiiiI -> IiIIiIiiiI.IIIIiIiiIi).orElse(null);
    }
}

