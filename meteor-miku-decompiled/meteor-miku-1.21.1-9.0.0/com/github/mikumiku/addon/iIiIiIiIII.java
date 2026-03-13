/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiIiiiI;
import com.github.mikumiku.addon.IIiIIIIIii;
import java.util.Date;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class iIiIiIiIII {
    public static IIIIiIiiiI IiiiiiiIIi() {
        return new IIIIiIiiiI();
    }

    public static IIIIiIiiiI ALLATORIxDEMO() {
        return new IIIIiIiiiI(50L);
    }

    public static IIIIiIiiiI ALLATORIxDEMO(long IiIIiIiiiI) {
        return new IIIIiIiiiI(IiIIiIiiiI);
    }

    private /* synthetic */ iIiIiIiIII() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public static IIiIIIIIii ALLATORIxDEMO() {
        return new IIiIIIIIii();
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[2 ^ 3];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n = --3;
        int n2 = string2.length();
        int n3 = n2 - (3 >> 1);
        char[] cArray = new char[n2];
        int n4 = --5 << --3 ^ --5;
        int cfr_ignored_0 = n << n;
        int n5 = (5 >> 1 ^ --5) << --4 ^ (1 ^ 3 ^ --5);
        int n6 = IiIIiIiiiI = string3.length() - (5 >> 2);
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

