/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iiIIIIiiII;
import com.github.mikumiku.addon.iiIiiIIiIi;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIiiIiiIi {
    public IiIiiIiiIi() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIiiIIiIi.ALLATORIxDEMO("7h\"E\u0014aGq7@\u0006pWpG\u8bf3\u6694\u65b3\u5257\u6704\u65ca\u7251\u671c\uff52"));
        }
    }

    public static String IiiIIIIiiI(String string) {
        String string2 = string;
        if (string2 == null) {
            return null;
        }
        try {
            int n;
            MessageDigest messageDigest = MessageDigest.getInstance(iiIIIIiiII.ALLATORIxDEMO("\u0015}\u00078T\u0000p"));
            byte[] byArray = messageDigest.digest(string2.getBytes(StandardCharsets.UTF_8));
            CharSequence IiIIiIiiiI = new StringBuilder();
            int n2 = byArray.length;
            int n3 = n = 3 & 4;
            while (n3 < n2) {
                byte by = byArray[n];
                String string3 = Integer.toHexString(0x77FF & 0x8FF & by);
                if (string3.length() == 3 >> 1) {
                    ((StringBuilder)IiIIiIiiiI).append((char)(0x79 & 0x36));
                }
                ((StringBuilder)IiIIiIiiiI).append(string3);
                n3 = ++n;
            }
            return ((StringBuilder)IiIIiIiiiI).toString();
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(iiIiiIIiIi.ALLATORIxDEMO("\u0014l\u0006\tu\u0011Q\u7b93\u6cb2\u4e09\u53a8\u750c"), noSuchAlgorithmException);
        }
    }

    public static String ALLATORIxDEMO(String string, String string2) {
        String IiIIiIiiiI = string2;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI2 == null || IiIIiIiiiI == null) {
            return null;
        }
        return IiIiiIiiIi.IiiIIIIiiI(IiIIiIiiiI2 + IiIIiIiiiI);
    }

    public static String IiiiiiiIIi(String string) {
        String string2 = string;
        if (string2 == null) {
            return null;
        }
        try {
            int n;
            MessageDigest messageDigest = MessageDigest.getInstance(iiIIIIiiII.ALLATORIxDEMO("+qs"));
            byte[] byArray = messageDigest.digest(string2.getBytes(StandardCharsets.UTF_8));
            CharSequence IiIIiIiiiI = new StringBuilder();
            int n2 = byArray.length;
            int n3 = n = 5 >> 3;
            while (n3 < n2) {
                byte by = byArray[n];
                String string3 = Integer.toHexString(0x51FF & 0x2EFF & by);
                if (string3.length() == (4 ^ 5)) {
                    ((StringBuilder)IiIIiIiiiI).append((char)(0x7A & 0x35));
                }
                ((StringBuilder)IiIIiIiiiI).append(string3);
                n3 = ++n;
            }
            return ((StringBuilder)IiIIiIiiiI).toString();
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(iiIiiIIiIi.ALLATORIxDEMO("*@r\u7bb3\u6c92\u4e29\u5388\u752c"), noSuchAlgorithmException);
        }
    }

    public static String ALLATORIxDEMO(int n) {
        int n2;
        int n3 = n;
        StringBuilder stringBuilder = new StringBuilder();
        String IiIIiIiiiI = iiIIIIiiII.ALLATORIxDEMO("t\u0004k\u001fq\u0001n\u0012w\u00079M|\fz\u0016f\u0016z\u000ed\u0014b\u001en\u001eH8\u0011eX(_#Q!X,_/\u001dqd\u0014F2`\u0010B>L<%W\u0007u\u0001s#Q\r\u007f");
        int n4 = n2 = 2 & 5;
        while (n4 < n3) {
            int n5 = (int)(Math.random() * (double)IiIIiIiiiI.length());
            stringBuilder.append(IiIIiIiiiI.charAt(n5));
            n4 = ++n2;
        }
        return stringBuilder.toString();
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(2 & 5, stackTraceElement.getMethodName()).toString();
        int n = --3;
        int n2 = string2.length();
        int n3 = n2 - (3 >> 1);
        char[] cArray = new char[n2];
        int n4 = n << n ^ (--3 ^ --5);
        int cfr_ignored_0 = --5 << --4 ^ --5 << --1;
        int n5 = 5 >> 1;
        int n6 = IiIIiIiiiI = string3.length() - (4 ^ 5);
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

    /*
     * WARNING - void declaration
     */
    public static boolean ALLATORIxDEMO(String string, String string2) {
        void IiIIiIiiiI;
        String string3 = string;
        if (string3 == null || IiIIiIiiiI == null) {
            return false;
        }
        String IiIIiIiiiI2 = IiIiiIiiIi.IiiIIIIiiI(string3);
        return IiIIiIiiiI.equalsIgnoreCase(IiIIiIiiiI2);
    }
}

