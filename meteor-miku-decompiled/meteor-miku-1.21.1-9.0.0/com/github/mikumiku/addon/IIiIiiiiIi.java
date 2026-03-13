/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiiiIIi;
import com.github.mikumiku.addon.IiiiIIiiIi;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.net.URL;
import java.net.URLConnection;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Date;
import java.util.Enumeration;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiIiiiiIi {
    private static /* synthetic */ boolean iIIiiiIiiI(String IiIIiIiiiI) {
        if (IiIIiIiiiI != null && IiIIiIiiiI.length() > 0) {
            return --1 != 0;
        }
        return false;
    }

    private static /* synthetic */ String IiiiiiiIIi() {
        try {
            Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
            while (enumeration.hasMoreElements()) {
                int n;
                byte[] byArray = enumeration.nextElement().getHardwareAddress();
                if (byArray == null) continue;
                if (byArray.length != (0x36 & 0x4F)) continue;
                StringBuilder stringBuilder = new StringBuilder();
                int n2 = byArray.length;
                int n3 = n = 3 ^ 3;
                while (n3 < n2) {
                    byte by = byArray[n];
                    Object[] objectArray = new Object[--1];
                    objectArray[2 & 5] = by;
                    stringBuilder.append(String.format(IIIIiiiIIi.ALLATORIxDEMO("]#jk"), objectArray));
                    n3 = ++n;
                }
                return stringBuilder.toString();
            }
        } catch (Exception exception) {
            // empty catch block
        }
        return IiiiIIiiIi.ALLATORIxDEMO("xufUBlc");
    }

    private static /* synthetic */ byte[] IiiiiiiIIi(byte[] byArray, byte[] byArray2) throws Exception {
        Cipher cipher;
        Object IiIIiIiiiI = byArray2;
        byte[] IiIIiIiiiI2 = byArray;
        IiIIiIiiiI = new SecretKeySpec((byte[])IiIIiIiiiI, IiiiIIiiIi.ALLATORIxDEMO("L~~"));
        Cipher cipher2 = cipher = Cipher.getInstance(IIIIiiiIIi.ALLATORIxDEMO("9V+<\u001dp:<\bx\u001b`mc9W\u001cz6T"));
        cipher2.init(1 ^ 3, (Key)IiIIiIiiiI);
        return cipher2.doFinal(IiIIiIiiiI2);
    }

    private static /* synthetic */ boolean iiIiiiiiII(String IiIIiIiiiI) {
        if (IiIIiIiiiI != null) {
            if (IiIIiIiiiI.length() > (0x7E & 0xB)) {
                return --1 != 0;
            }
        }
        return false;
    }

    private static /* synthetic */ void ALLATORIxDEMO() {
        int n;
        int n2 = n = 3 & 4;
        while (true) {
            if (n2 >= 10) break;
            if ((n << --3) % (1 ^ 3) == 0) {
                System.out.print("");
            } else {
                System.err.print("");
            }
            n2 = ++n;
        }
    }

    public IIiIiiiiIi() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiiIIiiIi.ALLATORIxDEMO("lF\u0019\u000bhh;xKIzy^\f\u001b\u8bda\u66cf\u659d\u520b\u672d\u65ab\u7245\u6717\uff2c"));
        }
    }

    private static /* synthetic */ byte[] ALLATORIxDEMO(byte[] byArray, byte[] byArray2) throws Exception {
        Cipher cipher;
        Object IiIIiIiiiI = byArray2;
        byte[] IiIIiIiiiI2 = byArray;
        IiIIiIiiiI = new SecretKeySpec((byte[])IiIIiIiiiI, IiiiIIiiIi.ALLATORIxDEMO("L~~"));
        Cipher cipher2 = cipher = Cipher.getInstance(IIIIiiiIIi.ALLATORIxDEMO("9V+<\u001dp:<\bx\u001b`mc9W\u001cz6T"));
        cipher2.init(5 >> 2, (Key)IiIIiIiiiI);
        return cipher2.doFinal(IiIIiIiiiI2);
    }

    private static /* synthetic */ boolean ALLATORIxDEMO() {
        long l = System.currentTimeMillis();
        if ((l >> --4 ^ l << (1 ^ 3)) > 0L) {
            return (3 & 5) != 0;
        }
        return false;
    }

    private static /* synthetic */ boolean IiiIIIIiiI(String string) {
        boolean bl;
        String string2 = string;
        try {
            Object IiIIiIiiiI;
            Object object = IiIIiIiiiI = (HttpURLConnection)new URL(string2 + "?t=" + System.nanoTime()).openConnection();
            int n = 0x5DFE & 0x23F5;
            ((URLConnection)IiIIiIiiiI).setConnectTimeout(n);
            ((URLConnection)object).setReadTimeout(n);
            ((HttpURLConnection)object).setRequestMethod(IiiiIIiiIi.ALLATORIxDEMO("J~y"));
            if (((HttpURLConnection)object).getResponseCode() == (0x39EA & 0x46DD)) {
                return --1 != 0;
            }
            bl = false;
        } catch (Exception exception) {
            return --1 != 0;
        }
        return bl;
    }

    public static boolean IiiiiiiIIi(String string) {
        String string2 = string;
        byte[] byArray = IIiIiiiiIi.ALLATORIxDEMO();
        String string3 = IIiIiiiiIi.IiiiiiiIIi();
        String IiIIiIiiiI = IIiIiiiiIi.ALLATORIxDEMO();
        if (!IIiIiiiiIi.ALLATORIxDEMO(string2)) {
            return (3 & 4) != 0;
        }
        if (!IIiIiiiiIi.ALLATORIxDEMO()) {
            return (2 & 5) != 0;
        }
        if (!IIiIiiiiIi.ALLATORIxDEMO(string2, byArray)) {
            return 5 >> 3;
        }
        if (!IIiIiiiiIi.IiiIIIIiiI(IIIIiiiIIi.ALLATORIxDEMO("8O!N&\u0004q\u001a>Ak\u001cVd\u0017a3V\n=;\\5\u001c.R4Z\u001cr,V"))) {
            return (2 & 5) != 0;
        }
        if (!IIiIiiiiIi.iIIiiiIiiI(string3)) {
            return (3 ^ 3) != 0;
        }
        if (!IIiIiiiiIi.iiIiiiiiII(IiIIiIiiiI)) {
            return 3 >> 2;
        }
        return true;
    }

    private static /* synthetic */ String ALLATORIxDEMO() {
        String string = System.getProperty(IIIIiiiIIi.ALLATORIxDEMO("\\+\u001d\u0016r5V"));
        String string2 = System.getProperty(IiiiIIiiIi.ALLATORIxDEMO("XHHI\u0003ulVH"));
        String string3 = System.getProperty(IIIIiiiIIi.ALLATORIxDEMO("\\+\u001d\u0019a;["));
        return Base64.getEncoder().encodeToString((string + string2 + string3).getBytes());
    }

    private static /* synthetic */ boolean ALLATORIxDEMO(String string, byte[] byArray) {
        Object IiIIiIiiiI = byArray;
        String IiIIiIiiiI2 = string;
        try {
            return new String(IIiIiiiiIi.IiiiiiiIIi(Base64.getDecoder().decode(IiIIiIiiiI2), (byte[])IiIIiIiiiI)).startsWith(IIIIiiiIIi.ALLATORIxDEMO("e9_\u0011w"));
        } catch (Exception exception) {
            return 3 >> 2;
        }
    }

    public static String IiiiiiiIIi(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(2 & 5, stackTraceElement.getMethodName()).toString();
        int n = 5 >> 1;
        int n2 = string2.length();
        int n3 = n2 - (5 >> 2);
        char[] cArray = new char[n2];
        int n4 = (1 ^ 3 ^ --5) << --4 ^ (n << n ^ --3);
        int n5 = (--3 ^ --5) << --4 ^ (5 >> 1 ^ --5) << (5 >> 2);
        int n6 = IiIIiIiiiI = string3.length() - --1;
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

    private static /* synthetic */ byte[] ALLATORIxDEMO() {
        int n;
        byte[] byArray = new byte[0x7C & 0x13];
        int n2 = n = 3 ^ 3;
        while (true) {
            if (n2 >= 16) break;
            int n3 = n++;
            byArray[n3] = (byte)(n3 * (0x3F & 0x5F) + (0x1F & 0x71) & (Short.MAX_VALUE & 0xFF));
            n2 = n;
        }
        return byArray;
    }

    private static /* synthetic */ String ALLATORIxDEMO(String string) throws Exception {
        int IiIIiIiiiI;
        String string2 = string;
        byte[] byArray = string2.getBytes();
        int n = IiIIiIiiiI = 5 >> 3;
        while (n < byArray.length) {
            int n2 = IiIIiIiiiI;
            byte by = (byte)(byArray[n2] ^ (byte)(IiIIiIiiiI * (0x4D & 0x3F)));
            byArray[n2] = by;
            n = ++IiIIiIiiiI;
        }
        return Base64.getEncoder().encodeToString(byArray);
    }

    private static /* synthetic */ int ALLATORIxDEMO(int n) {
        int IiIIiIiiiI22;
        int n2 = IiIIiIiiiI22;
        SecureRandom IiIIiIiiiI22 = new SecureRandom();
        return n2 ^ IiIIiIiiiI22.nextInt();
    }

    private static /* synthetic */ boolean ALLATORIxDEMO(String IiIIiIiiiI) {
        if (IiIIiIiiiI != null) {
            if (IiIIiIiiiI.length() > --3 && IiIIiIiiiI.matches(IiiiIIiiIi.ALLATORIxDEMO("@L\u0016wZ\u0000A\u001d\u0016\u0014DP\u0010\t"))) {
                return --1 != 0;
            }
        }
        return false;
    }
}

