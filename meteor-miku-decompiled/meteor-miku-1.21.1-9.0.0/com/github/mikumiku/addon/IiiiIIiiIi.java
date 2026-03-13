/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  net.minecraft.screen.GenericContainerScreenHandler
 *  net.minecraft.item.ItemStack
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIIIiiII;
import com.github.mikumiku.addon.iIiIIiiIiI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.item.ItemStack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiiIIiiIi {
    public final iIiIIiiIiI IIIIiIiiIi;
    public String IiIiIIIIiI;
    public long iiiiiIIiiI;
    public iIiIIiiIiI iiIIIIiIII;
    public Map<String, Integer> IiIIiIiiiI;
    public boolean ALLATORIxDEMO;

    public boolean ALLATORIxDEMO(String string) {
        IiiiIIiiIi iiiiIIiiIi = string2;
        String string2 = string;
        IiiiIIiiIi IiIIiIiiiI = iiiiIIiiIi;
        if (IiIIiIiiiI.ALLATORIxDEMO || Objects.equals(IiIIiIiiiI.IiIiIIIIiI, string2)) {
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(class_1707 class_17072, IiiIIIiiII iiiIIIiiII) {
        int n;
        void IiIIiIiiiI;
        IiiiIIiiIi iiiiIIiiIi = iiiiIIiiIi2;
        iiiiIIiiIi.IiIIiIiiiI.clear();
        iiiiIIiiIi.ALLATORIxDEMO = 3 >> 1;
        int n2 = 0x7F & 0x1A;
        if (IiIIiIiiiI.getInventory().size() > (0x3E & 0x7F)) {
            n2 = 0x77 & 0x3D;
        }
        int n3 = n = 0;
        while (n3 <= n2) {
            IiiiIIiiIi iiiiIIiiIi2 = IiIIiIiiiI.getInventory().getStack(n);
            if (iiiiIIiiIi2 != null && !iiiiIIiiIi2.isEmpty()) {
                void IiIIiIiiiI2;
                String string;
                iiiiIIiiIi.ALLATORIxDEMO = 3 >> 2;
                String string2 = string = IiIIiIiiiI2.IiiiiiiIIi((class_1799)iiiiIIiiIi2);
                iiiiIIiiIi.IiIIiIiiiI.put(string2, iiiiIIiiIi.IiIIiIiiiI.getOrDefault(string2, 3 >> 2) + iiiiIIiiIi2.getCount());
            }
            n3 = ++n;
        }
        if (iiiiIIiiIi.ALLATORIxDEMO) {
            iiiiIIiiIi.IiIiIIIIiI = null;
            v2 = iiiiIIiiIi;
        } else if (iiiiIIiiIi.IiIIiIiiiI.size() == --1) {
            iiiiIIiiIi.IiIiIIIIiI = iiiiIIiiIi.IiIIiIiiiI.keySet().iterator().next();
            v2 = iiiiIIiiIi;
        } else {
            iiiiIIiiIi.IiIiIIIIiI = iiiiIIiiIi.IiIIiIiiiI.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
            v2 = iiiiIIiiIi;
        }
        v2.iiiiiIIiiI = System.currentTimeMillis();
    }

    public String toString() {
        IiiiIIiiIi iiiiIIiiIi = this;
        return "ChestInfo{location=" + String.valueOf(this.IIIIiIiiIi) + ", dedicatedItemType='" + iiiiIIiiIi.IiIiIIIIiI + "', isEmpty=" + iiiiIIiiIi.ALLATORIxDEMO + ", itemCounts=" + String.valueOf(this.IiIIiIiiiI) + "}";
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(3 & 4, stackTraceElement.getMethodName()).toString();
        int n = --4;
        int n2 = --1;
        int n3 = string2.length();
        int n4 = n3 - --1;
        char[] cArray = new char[n3];
        int n5 = --5 << --4 ^ n2 << n2;
        int cfr_ignored_0 = (5 >> 1 ^ --5) << --4 ^ (5 >> 1 ^ --5);
        int n6 = n << n ^ 5 >> 1 << (3 & 5);
        int n7 = IiIIiIiiiI = string3.length() - --1;
        int n8 = n4;
        String string4 = string3;
        while (n8 >= 0) {
            int n9 = n4--;
            cArray[n9] = (char)(n6 ^ (string2.charAt(n9) ^ string4.charAt(IiIIiIiiiI)));
            if (n4 < 0) break;
            int n10 = n4--;
            char c = cArray[n10] = (char)(n5 ^ (string2.charAt(n10) ^ string4.charAt(IiIIiIiiiI)));
            if (--IiIIiIiiiI < 0) {
                IiIIiIiiiI = n7;
            }
            n8 = n4;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public IiiiIIiiIi(iIiIIiiIiI iIiIIiiIiI2, iIiIIiiIiI iIiIIiiIiI3) {
        void IiIIiIiiiI;
        IiiiIIiiIi IiIIiIiiiI2;
        IiiiIIiiIi iiiiIIiiIi = iIiIIiiIiI4;
        iIiIIiiIiI iIiIIiiIiI4 = iIiIIiiIiI3;
        IiiiIIiiIi iiiiIIiiIi2 = IiIIiIiiiI2 = iiiiIIiiIi;
        IiiiIIiiIi iiiiIIiiIi3 = IiIIiIiiiI2;
        iiiiIIiiIi3.iiIIIIiIII = null;
        IiiiIIiiIi iiiiIIiiIi4 = IiIIiIiiiI2;
        iiiiIIiiIi3.IiIIiIiiiI = new HashMap<String, Integer>();
        iiiiIIiiIi3.IIIIiIiiIi = IiIIiIiiiI;
        IiiiIIiiIi iiiiIIiiIi5 = IiIIiIiiiI2;
        iiiiIIiiIi3.IiIIiIiiiI = new HashMap<String, Integer>();
        iiiiIIiiIi5.iiiiiIIiiI = System.currentTimeMillis();
        iiiiIIiiIi2.ALLATORIxDEMO = 3 >> 1;
        iiiiIIiiIi2.iiIIIIiIII = iIiIIiiIiI4;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public int ALLATORIxDEMO() {
        IiiiIIiiIi iiiiIIiiIi;
        IiiiIIiiIi iiiiIIiiIi2 = this;
        if (iiiiIIiiIi2.IIIIiIiiIi.IiIIiIiiiI) {
            this = 0x6F94 & 0x1DEB;
            iiiiIIiiIi = iiiiIIiiIi2;
        } else {
            this = 1728;
            iiiiIIiiIi = iiiiIIiiIi2;
        }
        if (iiiiIIiiIi.ALLATORIxDEMO) {
            return this;
        }
        int n = iiiiIIiiIi2.IiIIiIiiiI.values().stream().mapToInt(Integer::intValue).sum();
        return Math.max(3 ^ 3, this - n);
    }

    public IiiiIIiiIi(String string) {
        IiiiIIiiIi IiIIiIiiiI;
        IiiiIIiiIi iiiiIIiiIi = string2;
        String string2 = string;
        IiiiIIiiIi iiiiIIiiIi2 = IiIIiIiiiI = iiiiIIiiIi;
        IiiiIIiiIi iiiiIIiiIi3 = IiIIiIiiiI;
        iiiiIIiiIi3.iiIIIIiIII = null;
        IiiiIIiiIi iiiiIIiiIi4 = IiIIiIiiiI;
        iiiiIIiiIi3.IiIIiIiiiI = new HashMap<String, Integer>();
        iiiiIIiiIi3.IIIIiIiiIi = iIiIIiiIiI.ALLATORIxDEMO(string2);
        IiiiIIiiIi iiiiIIiiIi5 = IiIIiIiiiI;
        iiiiIIiiIi2.IiIIiIiiiI = new HashMap<String, Integer>();
        iiiiIIiiIi5.iiiiiIIiiI = System.currentTimeMillis();
        iiiiIIiiIi2.ALLATORIxDEMO = 3 & 5;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    /*
     * WARNING - void declaration
     */
    public IiiiIIiiIi(iIiIIiiIiI object) {
        void IiIIiIiiiI;
        IiiiIIiiIi iiiiIIiiIi = object2;
        Object object2 = object;
        object = iiiiIIiiIi;
        void v1 = IiIIiIiiiI;
        void v2 = IiIIiIiiiI;
        v2.iiIIIIiIII = null;
        void v3 = IiIIiIiiiI;
        v2.IiIIiIiiiI = new HashMap<String, Integer>();
        v2.IIIIiIiiIi = object2;
        void v4 = IiIIiIiiiI;
        v1.IiIIiIiiiI = new HashMap<String, Integer>();
        v1.iiiiiIIiiI = System.currentTimeMillis();
        v1.ALLATORIxDEMO = 2 ^ 3;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }
}

