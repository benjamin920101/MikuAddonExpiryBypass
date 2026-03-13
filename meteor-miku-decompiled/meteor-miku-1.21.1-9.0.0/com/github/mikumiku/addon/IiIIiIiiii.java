/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIiIIiiIiI;
import com.github.mikumiku.addon.iIiIiIiIII;
import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIIiIiiii {
    private static final String[] iiIIiiIiii;
    private static final String iIiiIiiiII = "FEncryptionKey123!@#";
    private final Map<String, Object> iIIiiIIIII;
    private String[] iiIiIIiIIi;
    private static final int[] IIIIiIiiIi;
    private volatile boolean IiIiIIIIiI;
    private final Random iiiiiIIiiI;
    private byte[] iiIIIIiIII;
    private static final String[] IiIIiIiiiI;
    private volatile int ALLATORIxDEMO;

    public void IiiiiiiIIi(int n) {
        int n2 = n;
        IiIIiIiiii IiIIiIiiiI = this;
        IiIIiIiiiI.ALLATORIxDEMO = n2;
    }

    private /* synthetic */ void iIIiIIiIii() {
        IiIIiIiiii iiIIiIiiii2 = this;
        iiIIiIiiii2.ALLATORIxDEMO(iIiIIiiIiI.ALLATORIxDEMO("=\u0013(\"\u00117\b\u000e2 \\\u00159\u0013.\u001erIr"));
        iiIIiIiiii2.iIIiiiIiiI();
        iiIIiIiiii2.ALLATORIxDEMO(iIiIiIiIII.ALLATORIxDEMO("6[\u0010L=>\u0002_-r!z"));
    }

    private /* synthetic */ boolean IiiiiiiiII(String string) {
        int n;
        char[] IiIIiIiiiI;
        IiIIiIiiii iiIIiIiiii2;
        block6: {
            block5: {
                iiIIiIiiii2 = this;
                if (IiIIiIiiiI == null) break block5;
                if (IiIIiIiiiI.length() >= (0x7F & 0xA)) break block6;
            }
            return false;
        }
        int n2 = 0;
        IiIIiIiiiI = IiIIiIiiiI.toCharArray();
        int n3 = IiIIiIiiiI.length;
        int n4 = n = 2 & 5;
        while (n4 < n3) {
            char c = IiIIiIiiiI[n];
            n2 += c;
            n4 = ++n;
        }
        iiIIiIiiii2.ALLATORIxDEMO(n2);
        if (n2 % (0x65 & 0x7B) == 0) {
            return 3 >> 1;
        }
        return false;
    }

    private /* synthetic */ void IiIiiiIIiI() {
        IiIIiIiiii iiIIiIiiii2;
        IiIIiIiiii iiIIiIiiii3;
        block2: {
            int n;
            iiIIiIiiii3 = stringArray;
            String[] stringArray = ManagementFactory.getRuntimeMXBean().getName();
            int n2 = --4;
            iiIIiIiiii3.iIIiiIIIII.put(iIiIIiiIiI.ALLATORIxDEMO("\r**#\u000e2\u0014(\u00062\u00049"), stringArray);
            String[] stringArray2 = new String[n2];
            stringArray2[3 & 4] = iIiIiIiIII.ALLATORIxDEMO("\u0012S3\u007f\u0016[");
            stringArray2[3 >> 1] = iIiIIiiIiI.ALLATORIxDEMO("1\u0015\u0015(\u0012=\u000b>\b$");
            stringArray2[5 >> 1] = iIiIiIiIII.ALLATORIxDEMO("5{\tK");
            stringArray2[--3] = iIiIIiiIiI.ALLATORIxDEMO("$\u00022");
            stringArray = stringArray2;
            int n3 = stringArray2.length;
            int n4 = n = 3 ^ 3;
            while (n4 < n3) {
                String string = stringArray[n];
                if (System.getProperty(iIiIiIiIII.ALLATORIxDEMO("t%h\u0005\u0010\u0012[*z\u000bL")).toLowerCase().contains(string)) {
                    IiIIiIiiii iiIIiIiiii4 = iiIIiIiiii3;
                    iiIIiIiiii2 = iiIIiIiiii4;
                    iiIIiIiiii4.iIIiiIIIII.put(iIiIIiiIiI.ALLATORIxDEMO("**#\u00039\u00139\u0004(\u00028"), 3 >> 1);
                    break block2;
                }
                n4 = ++n;
            }
            iiIIiIiiii2 = iiIIiIiiii3;
        }
        iiIIiIiiii2.iIIiiIIIII.put(iIiIiIiIII.ALLATORIxDEMO("m=m\u0010[\ta0w\t["), System.currentTimeMillis());
        iiIIiIiiii3.iIIiiIIIII.put(iIiIIiiIiI.ALLATORIxDEMO("&\n\u00065+\u001d%\u0010\u0002\u00037\u000e\b?\u0002/\u00143\u0015/"), Runtime.getRuntime().availableProcessors());
        iiIIiIiiii3.iIIiiIIIII.put(iIiIiIiIII.ALLATORIxDEMO(")\u007f\u001ca\t[)q\u0016G"), Runtime.getRuntime().maxMemory());
    }

    private /* synthetic */ void ALLATORIxDEMO(int n) {
        int n2 = n;
        IiIIiIiiii IiIIiIiiiI = this;
        double d = n2;
        int n3 = n2 = 3 >> 2;
        while (true) {
            if (n3 >= 100) break;
            d = Math.sqrt(d * (double)IIIIiIiiIi[n2 % IIIIiIiiIi.length]);
            d = Math.sin(d) * Math.cos(d);
            d = Math.abs(d) + IiIIiIiiiI.iiiiiIIiiI.nextDouble();
            n3 = ++n2;
        }
        IiIIiIiiiI.iIIiiIIIII.put(iIiIiIiIII.ALLATORIxDEMO("\u001aB\u000e[\nI\u0005J<`\u0007l\u001aW\u0013O\u000eL"), d);
    }

    public boolean ALLATORIxDEMO() {
        return this.IiIiIIIIiI;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ byte[] ALLATORIxDEMO(String string, String string2) {
        IiIIiIiiii iiIIiIiiii2 = string3;
        String string3 = string;
        IiIIiIiiii IiIIiIiiiI = iiIIiIiiii2;
        try {
            void IiIIiIiiiI2;
            return MessageDigest.getInstance((String)IiIIiIiiiI2).digest(string3.getBytes(StandardCharsets.UTF_8));
        } catch (Exception exception) {
            return string3.getBytes();
        }
    }

    private /* synthetic */ boolean iIIiiiIiiI(String string) {
        IiIIiIiiii IiIIiIiiiI;
        IiIIiIiiii iiIIiIiiii2 = object;
        Object object = string;
        IiIIiIiiii iiIIiIiiii3 = IiIIiIiiiI = iiIIiIiiii2;
        String string2 = iiIIiIiiii3.ALLATORIxDEMO();
        object = iiIIiIiiii3.ALLATORIxDEMO((String)object);
        if (iiIIiIiiii3.iiiiiIIiiI.nextInt(0x75 & 0x6E) < --5) {
            return 3 >> 2;
        }
        return IiIIiIiiiI.ALLATORIxDEMO(string2, (String)object);
    }

    private /* synthetic */ long ALLATORIxDEMO(String string) {
        char[] IiIIiIiiiI;
        IiIIiIiiii iiIIiIiiii2 = this;
        long l = System.currentTimeMillis() - 2592000000L;
        IiIIiIiiiI = IiIIiIiiiI.toCharArray();
        int n = IiIIiIiiiI.length;
        int n2 = this = 5 >> 3;
        while (n2 < n) {
            char c = IiIIiIiiiI[this];
            l += (long)c * 1000L;
            n2 = ++this;
        }
        return l;
    }

    private /* synthetic */ void IiiiiiiiII() {
        IiIIiIiiii iiIIiIiiii2 = this;
        iiIIiIiiii2.iiIiIIiIIi = new String[--5];
        int n = this = 3 & 4;
        while (n < iiIIiIiiii2.iiIiIIiIIi.length) {
            iiIIiIiiii2.iiIiIIiIIi[this++] = iiIIiIiiii2.IiiiiiiIIi();
            n = this;
        }
        iiIIiIiiii2.iiIIIIiIII = new byte[0x6132 & 0x1FCD];
        iiIIiIiiii2.iiiiiIIiiI.nextBytes(iiIIiIiiii2.iiIIIIiIII);
    }

    public boolean iiIiiiiiII(String string) {
        IiIIiIiiii iiIIiIiiii2 = string2;
        String string2 = string;
        IiIIiIiiii IiIIiIiiiI = iiIIiIiiii2;
        if (!IiIIiIiiiI.IiIiIIIIiI) {
            return (2 & 5) != 0;
        }
        if (!IiIIiIiiiI.IiiiiiiIIi(string2)) {
            return IiIIiIiiiI.ALLATORIxDEMO(iIiIiIiIII.ALLATORIxDEMO("P\u0001J\u0013Q\u0016U\u001b[6l+l"));
        }
        if (!IiIIiIiiiI.iIIiiiIiiI(string2)) {
            return IiIIiIiiiI.ALLATORIxDEMO(iIiIIiiIiI.ALLATORIxDEMO("\u0014\u0006.\u0003+&\u000e\u0002#*\u00154\u0011&\b$\u0014"));
        }
        if (!IiIIiIiiiI.IiiIIIIiiI(string2)) {
            return IiIIiIiiiI.ALLATORIxDEMO(iIiIiIiIII.ALLATORIxDEMO("r\r]\u0001P\u0017[\u001b[\u001cN-l!z"));
        }
        IiIIiIiiii iiIIiIiiii3 = IiIIiIiiiI;
        boolean this2 = iiIIiIiiii3.IiiiiiiiII(string2);
        iiIIiIiiii3.IiiIIIIiiI(string2);
        IiIIiIiiiI.iiIiiiiiII();
        return this2;
    }

    private /* synthetic */ void iIIiiiIiiI() {
        try {
            Thread.sleep(this.iiiiiIIiiI.nextInt(0x6C & 0x77) + (0x33 & 0x7E));
            return;
        } catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ String ALLATORIxDEMO(byte[] byArray) {
        void IiIIiIiiiI;
        IiIIiIiiii iiIIiIiiii2 = stringBuilder;
        StringBuilder stringBuilder = new StringBuilder(iIiIiIiIII.ALLATORIxDEMO("*l+uK\u000f{>I\u0001X\u0002@u)2"));
        StringBuilder stringBuilder2 = stringBuilder.append(iIiIIiiIiI.ALLATORIxDEMO("2?\u0012-Ei}\\&)3\u0014\u0011\u001d\u000b5#\u001d\u00133\u0015sUrVV"));
        StringBuilder stringBuilder3 = stringBuilder;
        stringBuilder.append(iIiIiIiIII.ALLATORIxDEMO("\u0007q*j!p\u0018\u001b5B\u0011^V\u0016\u0018S\u0012T\u0016F\u0005J<`\u0007\u001c\u0002A\u000fTh2"));
        stringBuilder3.append(iIiIIiiIiI.ALLATORIxDEMO("!B(Tz3\t\u0014~}^1\u001d\u000b5#^K~\u00043\u00039Ef"));
        stringBuilder.append(Arrays.hashCode((byte[])IiIIiIiiiI));
        stringBuilder.append(iIiIiIiIII.ALLATORIxDEMO("\tFJ<b\f@\u001cS\rJ@\u0002"));
        stringBuilder.append(System.currentTimeMillis());
        stringBuilder.append(iIiIIiiIiI.ALLATORIxDEMO("!"));
        return stringBuilder3.toString();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean IiiiiiiIIi(String string, String string2) {
        void IiIIiIiiiI;
        IiIIiIiiii iiIIiIiiii2 = string3;
        String string3 = string;
        IiIIiIiiii IiIIiIiiiI2 = iiIIiIiiii2;
        if (string3.contains(iIiIiIiIII.ALLATORIxDEMO("H\u0005R-z")) && string3.contains(String.valueOf(IiIIiIiiiI.hashCode()))) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void iiIiiiiiII(String string) {
        int n;
        IiIIiIiiii IiIIiIiiiI;
        block14: {
            IiIIiIiiii iiIIiIiiii2 = string2;
            String string2 = string;
            IiIIiIiiiI = iiIIiIiiii2;
            int n2 = -4 >> 2;
            switch (string2.hashCode()) {
                case 68624562: {
                    if (!string2.equals(iIiIIiiIiI.ALLATORIxDEMO("\u0014\"\u0010+\u0013"))) break;
                    n = n2 = 3 >> 2;
                    break block14;
                }
                case 2020776: {
                    if (!string2.equals(iIiIiIiIII.ALLATORIxDEMO("%k0v"))) break;
                    n = n2 = 5 >> 2;
                    break block14;
                }
                case -1766622087: {
                    if (!string2.equals(iIiIIiiIiI.ALLATORIxDEMO("1\u00195\u0015!\u0005"))) break;
                    n = n2 = --2;
                    break block14;
                }
                case 1669100192: {
                    if (!string2.equals(iIiIiIiIII.ALLATORIxDEMO("]\u000bP\"w6s"))) break;
                    n = n2 = --3;
                    break block14;
                }
                case 1015497884: {
                    if (!string2.equals(iIiIIiiIiI.ALLATORIxDEMO("\u000354\u001f(\u0012)\u0019$\b"))) break;
                    n2 = --4;
                }
            }
            n = n2;
        }
        switch (n) {
            case 0: {
                IiIIiIiiiI.iIIiiIIIII.put(iIiIiIiIII.ALLATORIxDEMO("v%p m\f_\u000f["), iIiIIiiIiI.ALLATORIxDEMO("\u0015\t5\u00135\u0006(\u00028"));
                return;
            }
            case 1: {
                IiIIiIiiiI.iIIiiIIIII.put(iIiIiIiIII.ALLATORIxDEMO("%k0v\u001bm\u0010_\u0010["), iIiIIiiIiI.ALLATORIxDEMO(",\u00022\u00035\t;"));
                return;
            }
            case 2: {
                IiIIiIiiiI.iIIiiIIIII.put(iIiIiIiIII.ALLATORIxDEMO("2{6w\"w'\u007f\u0010W\u000bP"), iIiIIiiIiI.ALLATORIxDEMO("5)#\u0017.\b;\u00159\u0014/"));
                return;
            }
            case 3: {
                IiIIiIiiiI.iIIiiIIIII.put(iIiIiIiIII.ALLATORIxDEMO("7j\u0005J\u0011M"), iIiIIiiIiI.ALLATORIxDEMO("\u001f\b2\u00015\u00151\u00028"));
                return;
            }
            case 4: {
                IiIIiIiiiI.iIIiiIIIII.clear();
                return;
            }
        }
    }

    private /* synthetic */ boolean IiiIIIIiiI(String string) {
        IiIIiIiiii iiIIiIiiii2 = string2;
        String string2 = string;
        IiIIiIiiii IiIIiIiiiI = iiIIiIiiii2;
        long l = IiIIiIiiiI.ALLATORIxDEMO(string2);
        if (System.currentTimeMillis() - l < 31536000000L) {
            return 3 >> 1;
        }
        return false;
    }

    private /* synthetic */ String ALLATORIxDEMO(String string) {
        IiIIiIiiii iiIIiIiiii2 = string2;
        String string2 = string;
        IiIIiIiiii IiIIiIiiiI = iiIIiIiiii2;
        if (string2.length() > (0x35 & 0x5E)) {
            return string2.substring(--5, 0x5D & 0x33).toUpperCase();
        }
        return iIiIIiiIiI.ALLATORIxDEMO("#\u0019\u0001=2\u00103\u0003/\u000b.\u0018");
    }

    private /* synthetic */ void IiiIIIIiiI(String string) {
        IiIIiIiiii iiIIiIiiii2 = cipher;
        try {
            byte[] IiIIiIiiiI;
            Cipher cipher = Cipher.getInstance(iIiIiIiIII.ALLATORIxDEMO("%{\u00171\u0001]&\u00114u'mQn%z w\nY"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(iIiiIiiiII.getBytes(), iIiIIiiIiI.ALLATORIxDEMO("\u001d\"\u000f"));
            Cipher cipher2 = cipher;
            Cipher cipher3 = cipher;
            cipher3.init(3 & 5, secretKeySpec);
            IiIIiIiiiI = cipher2.doFinal(IiIIiIiiiI.getBytes());
            cipher3.init(--2, secretKeySpec);
            cipher2.doFinal(IiIIiIiiiI);
            return;
        } catch (Exception exception) {
            return;
        }
    }

    static {
        String[] stringArray = new String[--3];
        stringArray[3 & 4] = iIiIIiiIiI.ALLATORIxDEMO("=2\b/R\u001035\u0017\u0002.\n?I?\b1");
        stringArray[--1] = iIiIiIiIII.ALLATORIxDEMO("h!lx-7:2~'k1p0gwmv=");
        stringArray[5 >> 1] = iIiIIiiIiI.ALLATORIxDEMO("\u0010\u000e?\"\u00124\u0019I1$\u001f\u000f9\u00047I3\u0015;");
        iiIIiiIiii = stringArray;
        int[] nArray = new int[0x3B & 0x4C];
        nArray[3 ^ 3] = 1514880045;
        nArray[--1] = 506411595;
        nArray[5 >> 1] = -1618051732;
        nArray[--3] = 1247505533;
        nArray[--4] = 775899739;
        nArray[--5] = -1919021286;
        nArray[7 & 0x7E] = 1803324830;
        nArray[0x1F & 0x67] = 1011703407;
        IIIIiIiiIi = nArray;
        String[] stringArray2 = new String[--4];
        stringArray2[5 >> 3] = iIiIiIiIII.ALLATORIxDEMO("BV\u001a");
        stringArray2[--1] = iIiIIiiIiI.ALLATORIxDEMO("\u0018\"\u000f");
        stringArray2[5 >> 1] = iIiIiIiIII.ALLATORIxDEMO("Q@\b");
        stringArray2[--3] = iIiIIiiIiI.ALLATORIxDEMO("\u000f/\u001dJnRj");
        IiIIiIiiiI = stringArray2;
    }

    private /* synthetic */ void iiIiiiiiII() {
        IiIIiIiiii iiIIiIiiii2 = this;
        String[] stringArray = new String[--5];
        stringArray[5 >> 3] = iIiIiIiIII.ALLATORIxDEMO("V!r(q");
        stringArray[4 ^ 5] = iIiIIiiIiI.ALLATORIxDEMO("&\t3\u0014");
        stringArray[5 >> 1] = iIiIiIiIII.ALLATORIxDEMO("\u0012[6w\"g");
        stringArray[--3] = iIiIIiiIiI.ALLATORIxDEMO("\u001f(\u0012!\u00155\u0011");
        stringArray[--4] = iIiIiIiIII.ALLATORIxDEMO("\u0000W\u0017]\u000bP*{'j");
        String[] stringArray2 = stringArray;
        int n = stringArray.length;
        int n2 = this = 3 >> 2;
        while (n2 < n) {
            String string = stringArray2[this];
            IiIIiIiiii iiIIiIiiii3 = iiIIiIiiii2;
            iiIIiIiiii3.iiIiiiiiII(string);
            iiIIiIiiii3.iIIiiiIiiI();
            n2 = ++this;
        }
    }

    private /* synthetic */ void IiiiiiiIIi(String string) {
        IiIIiIiiii iiIIiIiiii2 = string2;
        String string2 = string;
        IiIIiIiiii IiIIiIiiiI = iiIIiIiiii2;
        System.err.println("[ERROR] " + (String)string2);
    }

    private /* synthetic */ String IiiiiiiIIi() {
        int n;
        IiIIiIiiii iiIIiIiiii2 = object;
        Object object = new byte[0x56 & 0x39];
        iiIIiIiiii2.iiiiiIIiiI.nextBytes((byte[])object);
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = ((Object)object).length;
        int n3 = n = 5 >> 3;
        while (n3 < n2) {
            Object object2 = object[n];
            Object[] objectArray = new Object[--1];
            objectArray[3 ^ 3] = (byte)object2;
            stringBuilder.append(String.format(iIiIiIiIII.ALLATORIxDEMO("A\u000evf"), objectArray));
            n3 = ++n;
        }
        return stringBuilder.toString();
    }

    private /* synthetic */ void ALLATORIxDEMO(String string) {
        IiIIiIiiii iiIIiIiiii2 = string2;
        String string2 = string;
        IiIIiIiiii IiIIiIiiiI = iiIIiIiiii2;
        System.out.println("[NET] " + (String)string2);
    }

    private /* synthetic */ void IiiIIIIiiI() {
        IiIIiIiiii iiIIiIiiii2 = this;
        try {
            String[] stringArray = IiIIiIiiiI;
            int n = IiIIiIiiiI.length;
            for (int i = 3 ^ 3; i < n; ++i) {
                IiIIiIiiii iiIIiIiiii3;
                String string;
                String string2 = string = stringArray[i];
                if (string.startsWith(iIiIIiiIiI.ALLATORIxDEMO("\u000f/\u001d"))) {
                    MessageDigest.getInstance(string2);
                    iiIIiIiiii3 = iiIIiIiiii2;
                } else {
                    Cipher.getInstance(string2);
                    iiIIiIiiii3 = iiIIiIiiii2;
                }
                iiIIiIiiii3.iIIiiIIIII.put("crypto_" + string, iIiIiIiIII.ALLATORIxDEMO("_\u0012_-r%|\b["));
            }
        } catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean IiiiiiiIIi(String string) {
        void IiIIiIiiiI;
        IiIIiIiiii iiIIiIiiii2 = string2;
        iiIIiIiiii2.iIIiiiIiiI();
        String string2 = iiIIiiIiii[iiIIiIiiii2.iiiiiIIiiI.nextInt(iiIIiiIiii.length)];
        iiIIiIiiii2.ALLATORIxDEMO("Connecting to: " + (String)string2);
        IiIIiIiiii iiIIiIiiii3 = iiIIiIiiii2;
        return iiIIiIiiii3.IiiiiiiIIi(iiIIiIiiii3.ALLATORIxDEMO(iiIIiIiiii3.ALLATORIxDEMO((String)IiIIiIiiiI, iIiIIiiIiI.ALLATORIxDEMO("\u000f/\u001dJnRj"))), (String)IiIIiIiiiI);
    }

    public void IiiiiiiIIi() {
        IiIIiIiiii iiIIiIiiii2 = this;
        this.iIIiiIIIII.clear();
        this.iiIiIIiIIi = null;
        iiIIiIiiii2.iiIIIIiIII = null;
        iiIIiIiiii2.IiIiIIIIiI = 3 >> 2;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        int n;
        IiIIiIiiii iiIIiIiiii2 = string;
        String[] stringArray = iiIIiiIiii;
        int n2 = iiIIiiIiii.length;
        int n3 = n = 3 >> 2;
        while (n3 < n2) {
            String string = stringArray[n];
            try {
                new URL("http://" + (String)string);
                iiIIiIiiii2.iIIiiIIIII.put("server_" + (String)string, iIiIIiiIiI.ALLATORIxDEMO("\u000e\u0002=\u00044\u0006>\u000b9"));
            } catch (Exception exception) {
                iiIIiIiiii2.iIIiiIIIII.put("server_" + (String)string, iIiIiIiIII.ALLATORIxDEMO("K;}\fR\u000bZ\u0001X\u000e]"));
            }
            n3 = ++n;
        }
    }

    private /* synthetic */ String ALLATORIxDEMO() {
        IiIIiIiiii iiIIiIiiii2 = stringBuilder;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            NetworkInterface networkInterface = NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
            byte[] byArray = networkInterface.getHardwareAddress();
            if (byArray != null) {
                int n = byArray.length;
                for (int i = 3 >> 2; i < n; ++i) {
                    byte by = byArray[i];
                    Object[] objectArray = new Object[--1];
                    objectArray[3 ^ 3] = by;
                    stringBuilder.append(String.format(iIiIIiiIiI.ALLATORIxDEMO("BlU\u0004"), objectArray));
                }
            }
        } catch (Exception exception) {
            int n;
            int n2 = n = 2 & 5;
            while (true) {
                if (n2 >= 12) break;
                stringBuilder.append(Integer.toHexString(iiIIiIiiii2.iiiiiIIiiI.nextInt(0x3E & 0x51)));
                n2 = ++n;
            }
        }
        StringBuilder stringBuilder2 = stringBuilder;
        stringBuilder2.append(System.getProperty(iIiIiIiIII.ALLATORIxDEMO("\\\u001b\u001c\u000e[\u000f]")).hashCode());
        stringBuilder.append(System.getProperty(iIiIIiiIiI.ALLATORIxDEMO("\t\u00149\u0015r\t=\n9")).hashCode());
        return stringBuilder2.toString().toUpperCase();
    }

    public IiIIiIiiii() {
        IiIIiIiiii iiIIiIiiii2 = this;
        IiIIiIiiii iiIIiIiiii3 = this;
        iiIIiIiiii3.IiIiIIIIiI = 3 >> 2;
        iiIIiIiiii3.ALLATORIxDEMO = 5 >> 3;
        IiIIiIiiii iiIIiIiiii4 = this;
        iiIIiIiiii2.iiiiiIIiiI = new SecureRandom();
        IiIIiIiiii iiIIiIiiii5 = this;
        iiIIiIiiii4.iIIiiIIIII = new HashMap<String, Object>();
        iiIIiIiiii2.IiiiiiiiII();
        iiIIiIiiii2.ALLATORIxDEMO();
        IiIIiIiiii iiIIiIiiii6 = this;
        this.ALLATORIxDEMO();
        iiIIiIiiii6.IiiIIIIiiI();
        iiIIiIiiii6.IiIiiiIIiI();
        iiIIiIiiii6.IiIiIIIIiI = 4 ^ 5;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIiIIiiIiI.ALLATORIxDEMO("07Ez4\u0019G)7\u0018&\b\u0002}g\u8b8b\u6693\u65ec\u5257\u675c\u65d7\u7214\u674b\uff5d"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(String string, String string2) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IiIIiIiiii iiIIiIiiii2 = this;
        int n = 3 & 4;
        int n2 = Math.min(IiIIiIiiiI2.length(), IiIIiIiiiI.length());
        int n3 = this = 3 ^ 3;
        while (n3 < n2) {
            if (IiIIiIiiiI2.charAt(this) != IiIIiIiiiI.charAt(this)) {
                ++n;
            }
            n3 = ++this;
        }
        if (n <= (1 ^ 3)) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    public int ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(String string) {
        IiIIiIiiii iiIIiIiiii2 = string2;
        String string2 = string;
        IiIIiIiiii IiIIiIiiiI = iiIIiIiiii2;
        IiIIiIiiiI.IiiiiiiIIi("Validation failed: " + (String)string2);
        if (IiIIiIiiiI.iiiiiIIiiI.nextBoolean()) {
            IiIIiIiiiI.iIIiIIiIii();
        }
        return false;
    }
}

