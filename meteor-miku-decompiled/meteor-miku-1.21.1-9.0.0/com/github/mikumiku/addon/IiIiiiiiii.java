/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.orbit.EventHandler
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiIIIIi;
import com.github.mikumiku.addon.IIIIiiiIIi;
import com.github.mikumiku.addon.IIIiiIiIII;
import com.github.mikumiku.addon.IIiIiiIIiI;
import com.github.mikumiku.addon.IIiiIiIIIi;
import com.github.mikumiku.addon.IiIIIIiIiI;
import com.github.mikumiku.addon.IiiiiiiIIi;
import com.github.mikumiku.addon.iIIIIIIIiI;
import com.github.mikumiku.addon.iIIIiIiiiI;
import java.util.Date;
import java.util.Random;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.orbit.EventHandler;

public class IiIiiiiiii {
    private static long IiiIIiiiiI;
    private static boolean IiIIIIiiii;
    private static int IiiIIIiiIi;
    private static int iiIIiiIiii;
    private static int iIiiIiiiII;
    private static double iIIiiIIIII;
    private static final Random iiIiIIiIIi;
    private static boolean IIIIiIiiIi;
    private static String IiIiIIIIiI;
    private static long iiiiiIIiiI;
    public static String iiIIIIiIII;
    private static double IiIIiIiiiI;
    private static long ALLATORIxDEMO;

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String IiiiiiiiII(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI > (0xA & 0x7F)) {
            return IiIiiiiiii.ALLATORIxDEMO(IiIIiIiiiI2);
        }
        IiIIIIiiii = IiIIIIiiii && IIIIiIiiIi ? 3 & 5 : 0;
        IiiIIIiiIi += 3 >> 1;
        --iiiiiIIiiI;
        IiIiiiiiii.IiIIiIiiiI += 0.001;
        iiIIIIiIII = IiIIiIiiiI2;
        iIiiIiiiII = (iIiiIiiiII * (0x1F & 0x7F) + IiIIiIiiiI2.length()) % (0x4FEF & 0x33F5);
        if (iIiiIiiiII < 0 && iIiiIiiiII > 0) {
            IiIIIIiIiI iiIIIIiIiI = new IiIIIIiIiI("dummy", "dummy", null, null, null, null);
            iiIIIIiIiI.get();
            return IiIiiiiiii.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + (5 >> 2));
        }
        switch (iIiiIiiiII % (0x57 & 0x2F)) {
            case 0: {
                return IiIiiiiiii.ALLATORIxDEMO(IiIIiIiiiI2, IiIIiIiiiI + (2 ^ 3));
            }
            case 1: {
                return IiIiiiiiii.iIIiiiIiiI(IiIIiIiiiI2, IiIIiIiiiI + (3 >> 1));
            }
            case 2: {
                if (ALLATORIxDEMO < 0L && ALLATORIxDEMO > 0L) {
                    iIIIiIiiiI iIIIiIiiiI2 = new iIIIiIiiiI("dummy", "dummy", null, null, null, null, null, --1 != 0);
                    iIIIiIiiiI2.get();
                    return IiIiiiiiii.IiiIIIIiiI(IiIIiIiiiI2, IiIIiIiiiI + --1);
                }
            }
            return IiIiiiiiii.ALLATORIxDEMO(IiIIiIiiiI2, IiIIiIiiiI + (2 ^ 3));
            case 3: {
                return IiIiiiiiii.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + --1);
            }
            case 4: {
                return IiIiiiiiii.iIIiiiIiiI(IiIIiIiiiI2, IiIIiIiiiI + (4 ^ 5));
            }
            case 5: {
                if (iiIiIIiIIi.nextInt() == Integer.MAX_VALUE && iiIiIIiIIi.nextInt() == Integer.MIN_VALUE) {
                    IIiiIiIIIi iIiiIiIIIi = new IIiiIiIIIi("dummy", "dummy", null, null, null, null, null);
                    return IiIiiiiiii.IiiiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (4 ^ 5));
                }
            }
            return IiIiiiiiii.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (5 >> 2));
            case 6: {
                return IiIiiiiiii.ALLATORIxDEMO(IiIIiIiiiI2, IiIIiIiiiI + --1);
            }
        }
        return IiIiiiiiii.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + (3 & 5));
    }

    public static String IiiiiiiIIi(String IiIIiIiiiI) {
        iIiiIiiiII = Math.abs(IiIIiIiiiI.hashCode()) % (0x77ED & 0xBFA);
        ALLATORIxDEMO = System.nanoTime();
        IiIIIIiiii = !IiIIIIiiii ? 2 ^ 3 : 0;
        IIIIiIiiIi = !IIIIiIiiIi ? 4 ^ 5 : 0;
        IiiIIIiiIi ^= iiIIiiIiii;
        iiIIiiIiii = IiiIIIiiIi ^ iiIIiiIiii;
        iiiiiIIiiI += IiiIIiiiiI;
        IiiIIiiiiI = iiiiiIIiiI - IiiIIiiiiI;
        IiIiiiiiii.IiIIiIiiiI *= iIIiiIIIII;
        iIIiiIIIII = IiIiiiiiii.IiIIiIiiiI / iIIiiIIIII;
        iiIIIIiIII = iiIIIIiIII + IiIiIIIIiI;
        IiIiIIIIiI = iiIIIIiIII.substring(3 >> 2, 3 ^ 3);
        return IiIiiiiiii.IiiiiiiiII(IiIIiIiiiI, 3 >> 2);
    }

    public static String ALLATORIxDEMO(String IiIIiIiiiI) {
        if (IIIIiIIIIi.IiiiiiiIIi(IiiiiiiIIi.IiIiIIIIiI).equals(IIIIiiiIIi.ALLATORIxDEMO("o[iU|J:Ww\u001ej[+Cl\u0007=Uh\t!LdTm\u00008UwL|L5\r4\\0\bjVi\f,LM'o\n\u0019q`\nj\u0002m\u000bh\u00059\u0006:W<\u0005"))) {
            if (!IIIiiIiIII.ALLATORIxDEMO("").equals("ok")) {
                IiiiiiiIIi.ALLATORIxDEMO();
            }
            return "6" + IiIIiIiiiI;
        }
        IiiiiiiIIi.ALLATORIxDEMO();
        return "Result: " + IiIIiIiiiI.hashCode() + "_" + System.nanoTime();
    }

    private static /* synthetic */ String iIIiiiIiiI(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI > (0x4B & 0x3E)) {
            return IiIiiiiiii.ALLATORIxDEMO(IiIIiIiiiI2);
        }
        IiIIIIiiii ^= IIIIiIiiIi;
        IiiIIIiiIi *= --2;
        iiiiiIIiiI /= 2L;
        IiIiiiiiii.IiIIiIiiiI *= 2.0;
        iiIIIIiIII = iiIIIIiIII + IiIIiIiiiI2;
        iIiiIiiiII = (iIiiIiiiII + IiIIiIiiiI2.length() * (0x17 & 0x79)) % (0x3FDF & 0x43FF);
        if (iIiiIiiiII % (5 >> 1) == 0) {
            if (iIiiIiiiII % --3 == 0) {
                if (iIiiIiiiII % --5 == 0) {
                    return IiIiiiiiii.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + --1);
                }
                return IiIiiiiiii.ALLATORIxDEMO(IiIIiIiiiI2, IiIIiIiiiI + (3 >> 1));
            }
            return IiIiiiiiii.IiiiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (4 ^ 5));
        }
        return IiIiiiiiii.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (5 >> 2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String iiIiiiiiII(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI > (0x1E & 0x6B)) {
            return IiIiiiiiii.ALLATORIxDEMO(IiIIiIiiiI2);
        }
        IiIIIIiiii = IIIIiIiiIi ^ --1;
        IiiIIIiiIi = iiIIiiIiii - IiiIIIiiIi;
        iiiiiIIiiI = IiiIIiiiiI - iiiiiIIiiI;
        IiIiiiiiii.IiIIiIiiiI = iIIiiIIIII / IiIiiiiiii.IiIIiIiiiI;
        iiIIIIiIII = IiIiIIIIiI + IiIIiIiiiI2;
        iIiiIiiiII = (iIiiIiiiII + (0x1F & 0x7F)) % (0x37EB & 0x4BDF);
        if (iIiiIiiiII % (0x6D & 0x1F) == 0) {
            return IiIiiiiiii.ALLATORIxDEMO(IiIIiIiiiI2);
        }
        if (System.nanoTime() == Long.MIN_VALUE && System.nanoTime() == Long.MAX_VALUE) {
            return IiIiiiiiii.IiiIIIIiiI(IiIIiIiiiI2, IiIIiIiiiI + --1);
        }
        switch (iIiiIiiiII % --4) {
            case 0: {
                return IiIiiiiiii.IiiiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + --1);
            }
            case 1: {
                return IiIiiiiiii.ALLATORIxDEMO(IiIIiIiiiI2, IiIIiIiiiI + (3 >> 1));
            }
            case 2: {
                return IiIiiiiiii.iIIiiiIiiI(IiIIiIiiiI2, IiIIiIiiiI + (2 ^ 3));
            }
            case 3: {
                return IiIiiiiiii.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + (2 ^ 3));
            }
        }
        return IiIiiiiiii.ALLATORIxDEMO(IiIIiIiiiI2 + "_default");
    }

    private static /* synthetic */ String IiiIIIIiiI(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        IIIIiIiiIi = IiIIIIiiii ^ 2 & 5;
        iiIIiiIiii = IiiIIIiiIi * iiIIiiIiii;
        IiiIIiiiiI = iiiiiIIiiI * IiiIIiiiiI;
        iIIiiIIIII = IiIiiiiiii.IiIIiIiiiI * iIIiiIIIII;
        IiIiIIIIiI = iiIIIIiIII + "_fake";
        iIiiIiiiII = (iIiiIiiiII * (0x27 & 0x5F) + (0x6D & 0x1F)) % (0x6FF5 & 0x13FB);
        return IiIiiiiiii.IiiiiiiIIi(IiIIiIiiiI2 + "_fake", IiIIiIiiiI + (3 >> 1));
    }

    private static /* synthetic */ String IiiiiiiIIi(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI > (0x5B & 0x2E)) {
            return IiIiiiiiii.ALLATORIxDEMO(IiIIiIiiiI2);
        }
        IIIIiIiiIi = !IiIIIIiiii ? 5 >> 2 : 0;
        iiIIiiIiii = IiiIIIiiIi + iiIIiiIiii;
        IiiIIiiiiI = iiiiiIIiiI + IiiIIiiiiI;
        iIIiiIIIII = IiIiiiiiii.IiIIiIiiiI + iIIiiIIIII;
        IiIiIIIIiI = IiIIiIiiiI2 + iiIIIIiIII;
        iIiiIiiiII = (int)(ALLATORIxDEMO * 13L % 977L);
        if (Math.sqrt(-1.0) > 0.0) {
            return IiIiiiiiii.IiiIIIIiiI(IiIIiIiiiI2, IiIIiIiiiI + --1);
        }
        int n2 = iiIiIIiIIi.nextInt(0x6C & 0x77);
        if (n2 < (0x5B & 0x3D)) {
            return IiIiiiiiii.IiiiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + --1);
        }
        if (n2 < (0x76 & 0x3B)) {
            return IiIiiiiiii.ALLATORIxDEMO(IiIIiIiiiI2, IiIIiIiiiI + (3 & 5));
        }
        if (n2 < (0x5F & 0x6B)) {
            return IiIiiiiiii.iIIiiiIiiI(IiIIiIiiiI2, IiIIiIiiiI + --1);
        }
        return IiIiiiiiii.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + --1);
    }

    public IiIiiiiiii() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIIIiiiIIi.ALLATORIxDEMO("\u000fXz\u0015\u000bvxF\bw9G=\u0012x\u8bc4\u66ac\u6583\u5268\u6733\u65e8\u727b\u6774\uff32"));
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        IiIiiiiiii iiIiiiiiii = iiIiiiiiii2;
        IiIiiiiiii iiIiiiiiii2 = post;
        IiIiiiiiii IiIIiIiiiI = iiIiiiiiii;
        if (iiIIIIiIII.equals("dummy")) {
            iiIIIIiIII = "dummy!";
            IiIiiiiiii.IiiiiiiIIi(IIiIiiIIiI.ALLATORIxDEMO("H\u0016C\u0011AD\u000e,`\u0002G,t\u0016E\u0004T\f@\u0016F\fT\u0016@\fE"));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String ALLATORIxDEMO(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI > (0x6A & 0x1F)) {
            return IiIiiiiiii.ALLATORIxDEMO(IiIIiIiiiI2);
        }
        IIIIiIiiIi = IiIIIIiiii || IIIIiIiiIi;
        iiIIiiIiii -= 5 >> 2;
        ++IiiIIiiiiI;
        iIIiiIIIII -= 0.001;
        IiIiIIIIiI = IiIIiIiiiI2;
        iIiiIiiiII = (int)((ALLATORIxDEMO ^= (long)IiIIiIiiiI2.hashCode()) % 983L);
        if (iIiiIiiiII > (0x77 & 0x6C)) {
            if (iIiiIiiiII < (0x73 & 0x3E)) {
                v0 = IiIIiIiiiI2;
                return IiIiiiiiii.IiiiiiiiII(v0, IiIIiIiiiI + (4 ^ 5));
            }
        } else if (iIiiIiiiII > (0xDD9 & 0x72EE)) {
            v0 = IiIIiIiiiI2;
            return IiIiiiiiii.IiiiiiiiII(v0, IiIIiIiiiI + (4 ^ 5));
        }
        if (System.currentTimeMillis() < 0L && (IiIIiIiiiI2 + "_fake").length() < 0) {
            new iIIIIIIIiI("dummy", "dummy", null, null, null, null, null, --1 != 0);
            return IiIiiiiiii.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + (3 & 5));
        }
        switch (iIiiIiiiII % --5) {
            case 0: {
                return IiIiiiiiii.iIIiiiIiiI(IiIIiIiiiI2, IiIIiIiiiI + (4 ^ 5));
            }
            case 1: {
                return IiIiiiiiii.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (5 >> 2));
            }
            case 2: {
                return IiIiiiiiii.IiiiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + --1);
            }
            case 3: {
                if (!(Math.random() > 1.0)) return IiIiiiiiii.iIIiiiIiiI(IiIIiIiiiI2, IiIIiIiiiI + (3 >> 1));
                return IiIiiiiiii.IiiIIIIiiI(IiIIiIiiiI2, IiIIiIiiiI + --1);
            }
            case 4: {
                return IiIiiiiiii.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (4 ^ 5));
            }
        }
        return IiIiiiiiii.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + (5 >> 2));
    }

    static {
        iiIiIIiIIi = new Random();
        iIiiIiiiII = 3 & 4;
        ALLATORIxDEMO = System.currentTimeMillis();
        IiIIIIiiii = 2 & 5;
        IIIIiIiiIi = 3 >> 1;
        IiiIIIiiIi = 0x6E & 0x3B;
        iiIIiiIiii = -4 >> 2;
        iiiiiIIiiI = 123456789L;
        IiiIIiiiiI = -987654321L;
        IiIIiIiiiI = 3.14159;
        iIIiiIIIII = 2.71828;
        iiIIIIiIII = "dummy";
        IiIiIIIIiI = "";
    }

    public static void main(String[] IiIIiIiiiI) {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiIiiIIiI.ALLATORIxDEMO("2JG\u00076dET5e\u0004U\u0000\u0000E\u8bd6\u6691\u6591\u5255\u6721\u65d5\u7269\u6749\uff20"));
        }
        System.out.println(IIIIiiiIIi.ALLATORIxDEMO(">q\u001a}\u0016\u007f\u0014<Wu\u001e{\u0010f\rz\u0011g\fp\u001b<W\u007f\u0014{\u0010y\u0012g\f\u007f\u0014{\u0010y\u0012g\f<Ws\u0018v4v\u001e~\u0015\u007f\u0014?TX3x\u0013X3x\u0013x\u0013x\u0013x\u0013x\u0013x\u0013x\u0013|\u0017p\u001bx\u0013\u007f\u0014r\u0019~\u0015|\u0017<~u\u001dx\u0013e\u000ey\u0011g\u000fp\u0018?T\u007f\u0017x\u0013z\u0012g\u000f\u007f\u0014{\u0013y\u0012g\u000f<Wp\u001bv\u001dv\u001e~\u0015\u007f\u0014<~[3x\u0013X3{\u0013{\u0013{\u0013x\u0013{\u0013x\u0013{\u0013\u007f\u0017p\u0018x\u0013|\u0014q\u0019}\u0015\u007f\u0017?Wv\u001dx\u0013e\u000ez8g\u000fs\u0018?T\u007f\u0014{\u0013y\u0011d\u000f\u007f\u0017x\u0013y\u0012g\u000f?Wp\u001bv\u001ev\u001e}\u0016\u007f\u0014?WX3x\u0013X3{9{\u0013x\u0013x\u0013{\u0013{\u0013{\u0010\u007f\u0017s\u0018{\u0013|\u0014q\u0019~\u0016|\u0017<Wu\u001d{\u0013f\u000ez\u0011g\u000fs\u0018?T\u007f={\u0013z\u0011d\u000f|\u0017x\u0013z\u0011d\u000f?Tp\u001bu\u001eu\u001e~\u0015\u007f\u0014?TX3x\u0013X3x\u0013x\u0013x\u0013x\u0013{9{\u0013\bA3C5X,Z1Srs?C=\u0017~\u0004&Q1P$Z0]*\\sKv\u001a?Rx\u0001j\u0001r\u000f\u007f={\u0013z\u0011d\u000f?Tp\u001bu\u001eu\u001e~\u0015\u007f\u0014?TX3x\u0013X3x\u0013x\u0013x\u0013x\u0013x\u0013x\u0013x\u0013|\u0017s1{\u0013\u007f\u0014r\u0019~t0[~\u00009O1\u0013\nL?G7L2Lp\u0006|Aa\u001do\u0011\u0000j\u0011xx\u0013z\u0011d\u000f<~s\u001bu\u001eu\u001e~\u0015\u007f\u0014?TX3x\u0013X3x\u0013x\u0013x\u0013x\u0013x\u0013x\u0013x\u0013|\u0017p\u001bx\u0013\u007f\u0014r\u0019}?\u007f\u0017?Tv\u001dx\u0013e\u000ey\u0012d\u000fs|Z9\u0013\u0017\u000ev\bb\r`\u0012\u0016x\u0013z\u0011d\u000f?Tp\u001bu\u001eu\u001e}?|\u0014?TX3x\u0013X3x\u0013x\u0013x\u0013x\u0013x\u0013x\u0013x\u0013|\u0017p\u001bx\u0013\u007f\u0014r\u0019~\u0015|\u0017?Tv\u001d{9f\u000ey\u0012d\u000fs\u0018?T\u0012x\f\u0013\u001c~\u0016\u000f\u001fx\u0015~\u001fc\u0007f^8pn\u0006{t\u001e~\u0015\u007f\u0014?TX3{9[3x\u0013x\u0013x\u0013x\u0013x\u0013x\u0013x\u0013|\u0017p\u001bx\u0013\u007f\u0014r\u0019~\u0015|\u0017?Tv\u001dx\u0013e\u000ey\u0012d\u000fp2<T|\u0017x\u0013z\u0011d\u000f|_,G*B~\u00000\u0015<W4J:L7\u001b<[rTX3x\u0013X3x\u0013x\u0013{9{\u0013x\u0013x\u0013x\u0013|\u0017p\u001bx\u0013\u007f\u0014r\u0019~\u0015|\u0017?Tv\u001dx\u0013e\u000ey\u0012d\u000fs\u0018?T|\u0017x\u0013y;g\f\u007f\u0014{\u0010y\u0012g\f<Ws\u0018v\u001dv\u001d}\u0016|\u0017<W[0{\u0010[0{\u0010{\u0010{\u0010{\u0010{\u0010{\u0010{9"));
        System.out.println(IIiIiiIIiI.ALLATORIxDEMO("i\u0000M\tNI\u00012N\u0017M\u0001\u0000"));
        System.out.println(IiIiiiiiii.IiiiiiiIIi(IIIIiiiIIi.ALLATORIxDEMO("{=_4\\t\u0013\u000f\\*_<\u0012")));
    }
}

