/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import java.util.Date;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIIiIiIII {
    private final String iiIIIIiIII;
    private final boolean IiIIiIiiiI;
    private final String ALLATORIxDEMO;

    public String IiiiiiiIIi() {
        return this.iiIIIIiIII;
    }

    public static iiIIiIiIII ALLATORIxDEMO(String string, String string2) {
        String IiIIiIiiiI = string2;
        String IiIIiIiiiI2 = string;
        return new iiIIiIiIII((2 ^ 3) != 0, IiIIiIiiiI2, IiIIiIiiiI);
    }

    public String ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public boolean ALLATORIxDEMO() {
        return this.IiIIiIiiiI;
    }

    public String toString() {
        iiIIiIiIII iiIIiIiIII2 = this;
        return "AuthResult{success=" + iiIIiIiIII2.IiIIiIiiiI + ", message='" + iiIIiIiIII2.ALLATORIxDEMO + "', data=" + this.iiIIIIiIII + "}";
    }

    /*
     * WARNING - void declaration
     */
    public iiIIiIiIII(boolean bl, String string, String string2) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        iiIIiIiIII IiIIiIiiiI3;
        iiIIiIiIII iiIIiIiIII2 = string3;
        String string3 = string2;
        iiIIiIiIII iiIIiIiIII3 = IiIIiIiiiI3 = iiIIiIiIII2;
        IiIIiIiiiI3.IiIIiIiiiI = IiIIiIiiiI2;
        iiIIiIiIII3.ALLATORIxDEMO = IiIIiIiiiI;
        iiIIiIiIII3.iiIIIIiIII = string3;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 & 5];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).insert(2 & 5, stackTraceElement.getClassName()).toString();
        int n = string2.length();
        int n2 = n - (2 ^ 3);
        char[] cArray = new char[n];
        int n3 = --5 << --4 ^ (1 ^ 3 ^ --5) << --1;
        int cfr_ignored_0 = --5 << --3 ^ (--2 ^ --5);
        int n4 = (1 ^ 3 ^ --5) << --3 ^ --3;
        int n5 = IiIIiIiiiI = string3.length() - --1;
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

    public static iiIIiIiIII ALLATORIxDEMO(String IiIIiIiiiI) {
        return new iiIIiIiIII(3 >> 2, IiIIiIiiiI, null);
    }
}

