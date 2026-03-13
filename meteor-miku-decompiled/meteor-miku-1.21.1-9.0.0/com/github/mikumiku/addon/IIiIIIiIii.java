/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iiiiiIiIIi;
import com.github.mikumiku.addon.ok.LoginApiTester;
import com.github.mikumiku.addon.ok.PreLaunchInitializer;
import java.util.Date;

public class IIiIIIiIii {
    public static void IiiiiiiIIi() {
        new Thread(() -> LoginApiTester.login()).start();
        PreLaunchInitializer.authenticated = 4 ^ 5;
        PreLaunchInitializer.auth = "null";
        iiiiiIiIIi.IiIIiIiiiI = 0.5;
    }

    public IIiIIIiIii() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = string2.length();
        int n2 = n - (3 & 5);
        char[] cArray = new char[n];
        int n3 = --5 << --3 ^ --5;
        int cfr_ignored_0 = --5 << --4 ^ --3;
        int n4 = (--3 ^ --5) << --4 ^ --5 << (5 >> 2);
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
}

