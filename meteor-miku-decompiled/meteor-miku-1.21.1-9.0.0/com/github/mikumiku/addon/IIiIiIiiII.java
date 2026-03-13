/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIIiiiIiii;
import com.github.mikumiku.addon.iIiIiIiIIi;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

public class IIiIiIiiII {
    public static String IiiIIIIiiI(Throwable throwable) {
        int n;
        Throwable throwable2 = throwable;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(throwable2.getClass().getName()).append(iIiIiIiIIi.ALLATORIxDEMO("+\u001a")).append(throwable2.getMessage()).append(iIIiiiIiii.ALLATORIxDEMO("J"));
        Object IiIIiIiiiI = throwable2.getStackTrace();
        int n2 = ((StackTraceElement[])IiIIiIiiiI).length;
        int n3 = n = 5 >> 3;
        while (n3 < n2) {
            StackTraceElement stackTraceElement = IiIIiIiiiI[n];
            stringBuilder.append(iIiIiIiIIi.ALLATORIxDEMO("8{e\u001a")).append(stackTraceElement.toString()).append(iIIiiiIiii.ALLATORIxDEMO("J"));
            n3 = ++n;
        }
        Object object = IiIIiIiiiI = throwable2.getCause();
        while (object != null) {
            stringBuilder.append(iIiIiIiIIi.ALLATORIxDEMO("ypOb_U:Sc+\u001a")).append(IiIIiIiiiI.getClass().getName()).append(iIIiiiIiii.ALLATORIxDEMO("``")).append(((Throwable)IiIIiIiiiI).getMessage()).append(iIiIiIiIIi.ALLATORIxDEMO("0"));
            StackTraceElement[] stackTraceElementArray = ((Throwable)IiIIiIiiiI).getStackTrace();
            n = stackTraceElementArray.length;
            int n4 = 3 ^ 3;
            while (n4 < n) {
                int n5;
                StackTraceElement stackTraceElement = stackTraceElementArray[n5];
                stringBuilder.append(iIIiiiIiii.ALLATORIxDEMO("s\u0001.`")).append(stackTraceElement.toString()).append(iIiIiIiIIi.ALLATORIxDEMO("0"));
                n4 = ++n5;
            }
            object = ((Throwable)IiIIiIiiiI).getCause();
        }
        return stringBuilder.toString();
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = string2.length();
        int n2 = n - (3 >> 1);
        char[] cArray = new char[n];
        int n3 = 3 >> 1 << --3 ^ --4;
        int cfr_ignored_0 = (4 ^ 5) << --3 ^ (1 ^ 3);
        int n4 = --5 << --3 ^ (4 ^ 5);
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

    public IIiIiIiiII() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIIiiiIiii.ALLATORIxDEMO("*\f?!\t\u0005Z\u0015*$;4J\u0014Z\u8b97\u6689\u65d7\u524a\u6760\u65d7\u7235\u6701\uff36"));
        }
    }

    public static String IiiiiiiIIi(Throwable throwable) {
        Throwable throwable2 = throwable;
        StringWriter IiIIiIiiiI = new StringWriter();
        PrintWriter printWriter = new PrintWriter(IiIIiIiiiI);
        throwable2.printStackTrace(printWriter);
        return IiIIiIiiiI.toString();
    }

    /*
     * WARNING - void declaration
     */
    public static String ALLATORIxDEMO(Throwable throwable, int n) {
        int n2;
        void IiIIiIiiiI;
        Throwable throwable2 = throwable;
        Object IiIIiIiiiI2 = IIiIiIiiII.IiiiiiiIIi(throwable2);
        String[] stringArray = ((String)IiIIiIiiiI2).split(iIIiiiIiii.ALLATORIxDEMO("L"));
        if (stringArray.length <= IiIIiIiiiI) {
            return IiIIiIiiiI2;
        }
        IiIIiIiiiI2 = new StringBuilder();
        int n3 = n2 = 3 & 4;
        while (n3 < IiIIiIiiiI) {
            StringBuilder stringBuilder = ((StringBuilder)IiIIiIiiiI2).append(stringArray[n2]);
            stringBuilder.append(iIiIiIiIIi.ALLATORIxDEMO("6"));
            n3 = ++n2;
        }
        ((StringBuilder)IiIIiIiiiI2).append(iIIiiiIiii.ALLATORIxDEMO("bpj|n")).append(stringArray.length - IiIIiIiiiI).append(iIiIiIiIIi.ALLATORIxDEMO("1WOyy\u0017q_{[d\u0015"));
        return ((StringBuilder)IiIIiIiiiI2).toString();
    }

    public static String ALLATORIxDEMO(Throwable IiIIiIiiiI) {
        return IiIIiIiiiI.getClass().getSimpleName() + ": " + IiIIiIiiiI.getMessage();
    }
}

