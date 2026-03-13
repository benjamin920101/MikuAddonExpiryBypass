/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import java.util.Date;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIIiIIIIi {
    private long ALLATORIxDEMO;

    public boolean IiiIIIIiiI(long IiIIiIiiiI) {
        if (System.nanoTime() - this.ALLATORIxDEMO >= IiIIiIiiiI) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    public boolean IiiiiiiIIi(int n) {
        int n2 = n;
        IiIIiIIIIi IiIIiIiiiI = this;
        return IiIIiIiiiI.IiiiiiiIIi((long)(n2 * (0x33 & 0x7E)));
    }

    public long IiiiiiiIIi(long IiIIiIiiiI) {
        return IiIIiIiiiI / 1000000L;
    }

    public boolean IiiiiiiIIi(long IiIIiIiiiI) {
        IiIIiIIIIi iiIIiIIIIi = this;
        return iiIIiIIIIi.IiiIIIIiiI(iiIIiIIIIi.ALLATORIxDEMO(IiIIiIiiiI));
    }

    public boolean ALLATORIxDEMO(int n) {
        int n2 = n;
        IiIIiIIIIi IiIIiIiiiI = this;
        return IiIIiIiiiI.IiiiiiiIIi((long)(n2 * (0x3F & 0x72)));
    }

    public boolean IiiIIIIiiI(double IiIIiIiiiI) {
        return this.IiiiiiiIIi((long)IiIIiIiiiI);
    }

    public IiIIiIIIIi ALLATORIxDEMO() {
        this.ALLATORIxDEMO = System.nanoTime();
        return this;
    }

    public long ALLATORIxDEMO() {
        IiIIiIIIIi iiIIiIIIIi = this;
        return iiIIiIIIIi.IiiiiiiIIi(System.nanoTime() - iiIIiIIIIi.ALLATORIxDEMO);
    }

    public boolean IiiiiiiIIi(double IiIIiIiiiI) {
        return this.IiiiiiiIIi((long)IiIIiIiiiI);
    }

    public boolean ALLATORIxDEMO(long IiIIiIiiiI) {
        return this.IiiiiiiIIi(IiIIiIiiiI);
    }

    public boolean ALLATORIxDEMO(double IiIIiIiiiI) {
        return this.IiiiiiiIIi(IiIIiIiiiI * 1000.0);
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[4 ^ 5];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = string2.length();
        int n2 = n - (5 >> 2);
        char[] cArray = new char[n];
        int n3 = --4 << --3 ^ --5;
        int cfr_ignored_0 = 5 >> 2 << --3 ^ --5;
        int n4 = (--3 ^ --5) << --4 ^ (1 ^ 3 ^ --5) << --1;
        int n5 = IiIIiIiiiI = string3.length() - (3 & 5);
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

    public long ALLATORIxDEMO(long IiIIiIiiiI) {
        return IiIIiIiiiI * 1000000L;
    }

    public IiIIiIIIIi() {
        IiIIiIIIIi iiIIiIIIIi = this;
        iiIIiIIIIi.ALLATORIxDEMO = -1L;
        iiIIiIIIIi.ALLATORIxDEMO();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public void ALLATORIxDEMO(long IiIIiIiiiI) {
        this.ALLATORIxDEMO = System.nanoTime() - this.ALLATORIxDEMO(IiIIiIiiiI);
    }
}

