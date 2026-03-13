/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class IIIiiiIIii {
    private final long IiIIiIiiiI;
    private final AtomicLong ALLATORIxDEMO;

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[4 ^ 5];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n = string2.length();
        int n2 = n - --1;
        char[] cArray = new char[n];
        int n3 = --5 << --4 ^ (--3 << (5 >> 1) ^ (4 ^ 5));
        int n4 = (1 ^ 3 ^ --5) << --4 ^ (1 ^ 3 ^ --5);
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

    public void ALLATORIxDEMO(Runnable runnable, long l) {
        IIIiiiIIii iIIiiiIIii2 = runnable2;
        Runnable runnable2 = runnable;
        IIIiiiIIii IiIIiIiiiI = iIIiiiIIii2;
        new IIIiiiIIii(1000L).ALLATORIxDEMO(() -> System.out.println("\u6267\u884c\u4e00\u6b21: " + System.currentTimeMillis()));
    }

    public void ALLATORIxDEMO(Runnable runnable) {
        long l;
        IIIiiiIIii iIIiiiIIii2 = runnable2;
        Runnable runnable2 = runnable;
        IIIiiiIIii IiIIiIiiiI = iIIiiiIIii2;
        long l2 = System.nanoTime();
        if (l2 - (l = IiIIiIiiiI.ALLATORIxDEMO.get()) < IiIIiIiiiI.IiIIiIiiiI) {
            return;
        }
        if (IiIIiIiiiI.ALLATORIxDEMO.compareAndSet(l, l2)) {
            try {
                runnable2.run();
                return;
            } catch (Throwable this_) {
                this_.printStackTrace();
            }
        }
    }

    public IIIiiiIIii(long IiIIiIiiiI) {
        IIIiiiIIii iIIiiiIIii2 = this;
        IIIiiiIIii iIIiiiIIii3 = this;
        iIIiiiIIii2.ALLATORIxDEMO = new AtomicLong(0L);
        iIIiiiIIii2.IiIIiIiiiI = IiIIiIiiiI * 1000000L;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }
}

