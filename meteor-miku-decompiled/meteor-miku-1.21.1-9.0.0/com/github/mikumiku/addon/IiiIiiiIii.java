/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiIIIIi;
import com.github.mikumiku.addon.IIiIiIiIiI;
import com.github.mikumiku.addon.IIiiIiIIIi;
import com.github.mikumiku.addon.IiIIIIiIiI;
import com.github.mikumiku.addon.IiiIIiiiII;
import com.github.mikumiku.addon.IiiiiiiIIi;
import com.github.mikumiku.addon.iIIIIIIIiI;
import com.github.mikumiku.addon.iIIIiIiiiI;
import com.github.mikumiku.addon.iIIiiiIiii;
import com.github.mikumiku.addon.iiiiiIiIIi;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class IiiIiiiIii {
    private static long IiiIIiiiiI;
    private static String IiIIIIiiii;
    private static double IiiIIIiiIi;
    private static boolean iiIIiiIiii;
    private static String iIiiIiiiII;
    private static boolean iIIiiIIIII;
    private static long iiIiIIiIIi;
    private static long IIIIiIiiIi;
    private static int IiIiIIIIiI;
    private static int iiiiiIIiiI;
    private static final Random iiIIIIiIII;
    private static double IiIIiIiiiI;
    private static int ALLATORIxDEMO;

    private static /* synthetic */ String IiiiiiiiII(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI > (0x3A & 0x4F)) {
            return IiiIiiiIii.ALLATORIxDEMO(IiIIiIiiiI2);
        }
        iIIiiIIIII ^= iiIIiiIiii;
        ALLATORIxDEMO *= --2;
        iiIiIIiIIi /= 2L;
        IiiIiiiIii.IiIIiIiiiI *= 2.0;
        IiIIIIiiii = IiIIIIiiii + IiIIiIiiiI2;
        IiIiIIIIiI = (IiIiIIIIiI + IiIIiIiiiI2.length() * (0x7D & 0x13)) % (0x73DF & 0xFFF);
        if (IiIiIIIIiI % (5 >> 1) == 0) {
            if (IiIiIIIIiI % --3 == 0) {
                if (IiIiIIIIiI % --5 == 0) {
                    return IiiIiiiIii.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + (3 >> 1));
                }
                return IiiIiiiIii.IiiIIIIiiI(IiIIiIiiiI2, IiIIiIiiiI + (3 & 5));
            }
            return IiiIiiiIii.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (3 >> 1));
        }
        return IiiIiiiIii.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + (4 ^ 5));
    }

    private static /* synthetic */ String iIIiiiIiiI(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI > (0xE & 0x7B)) {
            return IiiIiiiIii.ALLATORIxDEMO(IiIIiIiiiI2);
        }
        iiIIiiIiii = !iIIiiIIIII ? 2 ^ 3 : 0;
        iiiiiIIiiI = ALLATORIxDEMO + iiiiiIIiiI;
        IiiIIiiiiI = iiIiIIiIIi + IiiIIiiiiI;
        IiiIIIiiIi = IiiIiiiIii.IiIIiIiiiI + IiiIIIiiIi;
        iIiiIiiiII = IiIIiIiiiI2 + IiIIIIiiii;
        IiIiIIIIiI = (int)(IIIIiIiiIi * 13L % 977L);
        if (Math.sqrt(-1.0) > 0.0) {
            return IiiIiiiIii.ALLATORIxDEMO(IiIIiIiiiI2, IiIIiIiiiI + (3 >> 1));
        }
        int n2 = iiIIIIiIII.nextInt(0x6C & 0x77);
        if (n2 < (0x3B & 0x5D)) {
            return IiiIiiiIii.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + --1);
        }
        if (n2 < (0x3B & 0x76)) {
            return IiiIiiiIii.IiiIIIIiiI(IiIIiIiiiI2, IiIIiIiiiI + (4 ^ 5));
        }
        if (n2 < (0x4F & 0x7B)) {
            return IiiIiiiIii.IiiiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (3 & 5));
        }
        return IiiIiiiIii.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + (5 >> 2));
    }

    static {
        iiIIIIiIII = new Random();
        IiIiIIIIiI = 2 & 5;
        IIIIiIiiIi = System.currentTimeMillis();
        iIIiiIIIII = 3 & 4;
        iiIIiiIiii = 3 >> 1;
        ALLATORIxDEMO = 0x7A & 0x2F;
        iiiiiIIiiI = -4 >> 2;
        iiIiIIiIIi = 123456789L;
        IiiIIiiiiI = -987654321L;
        IiIIiIiiiI = 3.14159;
        IiiIIIiiIi = 2.71828;
        IiIIIIiiii = "dummy";
        iIiiIiiiII = "";
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String iiIiiiiiII(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI > (0x2B & 0x5E)) {
            return IiiIiiiIii.ALLATORIxDEMO(IiIIiIiiiI2);
        }
        iIIiiIIIII = iIIiiIIIII && iiIIiiIiii ? 5 >> 2 : 0;
        ALLATORIxDEMO += 4 ^ 5;
        --iiIiIIiIIi;
        IiiIiiiIii.IiIIiIiiiI += 0.001;
        IiIIIIiiii = IiIIiIiiiI2;
        IiIiIIIIiI = (IiIiIIIIiI * (0x7F & 0x1F) + IiIIiIiiiI2.length()) % (0x73F5 & 0xFEF);
        if (IiIiIIIIiI < 0 && IiIiIIIIiI > 0) {
            IiIIIIiIiI iiIIIIiIiI = new IiIIIIiIiI("dummy", "dummy", null, null, null, null);
            iiIIIIiIiI.get();
            return IiiIiiiIii.iIIiiiIiiI(IiIIiIiiiI2, IiIIiIiiiI + --1);
        }
        switch (IiIiIIIIiI % (0x2F & 0x57)) {
            case 0: {
                return IiiIiiiIii.IiiIIIIiiI(IiIIiIiiiI2, IiIIiIiiiI + (4 ^ 5));
            }
            case 1: {
                return IiiIiiiIii.IiiiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (4 ^ 5));
            }
            case 2: {
                if (IIIIiIiiIi < 0L && IIIIiIiiIi > 0L) {
                    iIIIiIiiiI iIIIiIiiiI2 = new iIIIiIiiiI("dummy", "dummy", null, null, null, null, null, --1 != 0);
                    iIIIiIiiiI2.get();
                    return IiiIiiiIii.ALLATORIxDEMO(IiIIiIiiiI2, IiIIiIiiiI + (5 >> 2));
                }
            }
            return IiiIiiiIii.IiiIIIIiiI(IiIIiIiiiI2, IiIIiIiiiI + (4 ^ 5));
            case 3: {
                return IiiIiiiIii.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + (5 >> 2));
            }
            case 4: {
                return IiiIiiiIii.IiiiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (3 >> 1));
            }
            case 5: {
                if (iiIIIIiIII.nextInt() == Integer.MAX_VALUE && iiIIIIiIII.nextInt() == Integer.MIN_VALUE) {
                    IIiiIiIIIi iIiiIiIIIi = new IIiiIiIIIi("dummy", "dummy", null, null, null, null, null);
                    return IiiIiiiIii.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (4 ^ 5));
                }
            }
            return IiiIiiiIii.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + (3 >> 1));
            case 6: {
                return IiiIiiiIii.IiiIIIIiiI(IiIIiIiiiI2, IiIIiIiiiI + --1);
            }
        }
        return IiiIiiiIii.iIIiiiIiiI(IiIIiIiiiI2, IiIIiIiiiI + --1);
    }

    public static void main(String[] IiIIiIiiiI) {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIIiiiIiii.ALLATORIxDEMO("*\f?!\t\u0005Z\u0015\n\u0004;4\u001fAZ\u8b97\u668a\u65d4\u5242\u6768\u65ca\u7228\u6751\uff66"));
        }
        System.out.println(IiiIIiiiII.ALLATORIxDEMO("#]\u0007Q\u000bS\t\u0010JY\u0003W\rJ\u0010V\fK\u0011\\\u0006\u0010JS\tW\rU\u000fK\u0011S\tW\rU\u000fK\u0011\u0010J_\u0005Z)Z\u0003R\bS\t\u0013It.T\u000eT\u000et.T\u000eT\u000eT\u000et.T\u000eT\u000eP\n\\\u0006T\u000eS\t^\u0004R\bP\n\u0010cY\u0000T\u000eI\u0013U\fK\u0012\\\u0005\u0013IS\nT\u000eV\u000fK\u0012S\tW\u000eU\u000fK\u0012\u0010J\\\u0006Z\u0000Z\u0003R\bS\t\u0010cw.T\u000eT\u000ew.W\u000eW\u000eT\u000ew.T\u000eW\u000eS\n\\\u0005T\u000eP\t]\u0004Q\bS\n\u0013JZ\u0000T\u000eI\u0013V%K\u0012_\u0005\u0013IS\tW\u000eU\fH\u0012S\nT\u000eU\u000fK\u0012\u0013J\\\u0006Z\u0003Z\u0003Q\u000bS\t\u0013Jt.T\u000eT\u000ew\u0004W\u000eT\u000eT\u000ew.W\u000eW\rS\n_\u0005W\u000eP\t]\u0004R\u000bP\n\u0010JY\u0000W\u000eJ\u0013V\fK\u0012_\u0005\u0013IS W\u000eV\fH\u0012P\nT\u000eV\fH\u0012\u0013I\\\u0006Y\u0003Y\u0003R\bS\t\u0013It.T\u000eT\u000et.T\u000eT\u000eT\u000ew\u0004W\u000e$\\\u001f^\u0019E\u0000G\u001dN^n\u0013^\u0011\nR\u0019\nL\u001dM\bG\u001c@\u0006A_VZ\u0007\u0013OT\u001cF\u001c^\u0012S W\u000eV\fH\u0012\u0013I\\\u0006Y\u0003Y\u0003R\bS\t\u0013It.T\u000eT\u000et.T\u000eT\u000eT\u000et.T\u000eT\u000eP\n_,W\u000eS\t^\u0004Ri\u001cFR\u001d\u0015R\u001d\u000e&Q\u0013Z\u001bQ\u001eQ\\\u001bP\\M\u0000C\f,w=eT\u000eV\fH\u0012\u0010c_\u0006Y\u0003Y\u0003R\bS\t\u0013It.T\u000eT\u000et.T\u000eT\u000eT\u000et.T\u000eT\u000eP\n\\\u0006T\u000eS\t^\u0004Q\"S\n\u0013IZ\u0000T\u000eI\u0013U\u000fH\u0012_av$?\n\"k$\u007f!}>\u000bT\u000eV\fH\u0012\u0013I\\\u0006Y\u0003Y\u0003Q\"P\t\u0013It.T\u000eT\u000et.T\u000eT\u000eT\u000et.T\u000eT\u000eP\n\\\u0006T\u000eS\t^\u0004R\bP\n\u0013IZ\u0000W$J\u0013U\u000fH\u0012_\u0005\u0013I>e \u000e0c:\u00123e9c3~+{r%\\s*fX\u0003R\bS\t\u0013It.W$W\u000et.T\u000eT\u000eT\u000et.T\u000eT\u000eP\n\\\u0006T\u000eS\t^\u0004R\bP\n\u0013IZ\u0000T\u000eI\u0013U\u000fH\u0012\\/\u0010IP\nT\u000eV\fH\u0012PB\u0000Z\u0006_R\u001d\u001c\b\u0010J\u0018W\u0016Q\u001b\u0006\u0010F^It.T\u000eT\u000et.T\u000eW$W\u000et.T\u000eT\u000eP\n\\\u0006T\u000eS\t^\u0004R\bP\n\u0013IZ\u0000T\u000eI\u0013U\u000fH\u0012_\u0005\u0013IP\nT\u000eU&K\u0011S\tW\rU\u000fK\u0011\u0010J_\u0005Z\u0000Z\u0000Q\u000bP\n\u0010Jw-W\rW\rw-W\rW\rW\rw-W\rW$"));
        System.out.println(iIIiiiIiii.ALLATORIxDEMO("\b\u001f\f\u0016\u000fRD%\u0007\b\f\u0019F"));
        System.out.println(IIIIiIIIIi.IiiiiiiIIi(IiiIIiiiII.ALLATORIxDEMO("\u001cF\u001c")));
    }

    public IiiIiiiIii() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiIIiiiII.ALLATORIxDEMO("#EV\b'kT[\u0004J5z\u0011\u000fT\u8bd9\u6680\u659e\u5264\u670e\u65c4\u7266\u6758\uff2f"));
        }
    }

    public static String IiiiiiiIIi(String IiIIiIiiiI) {
        IiIiIIIIiI = Math.abs(IiIIiIiiiI.hashCode()) % (0x2FEA & 0x53FD);
        IIIIiIiiIi = System.nanoTime();
        iIIiiIIIII = !iIIiiIIIII ? 5 >> 2 : 0;
        iiIIiiIiii = !iiIIiiIiii ? 3 & 5 : 0;
        ALLATORIxDEMO ^= iiiiiIIiiI;
        iiiiiIIiiI = ALLATORIxDEMO ^ iiiiiIIiiI;
        iiIiIIiIIi += IiiIIiiiiI;
        IiiIIiiiiI = iiIiIIiIIi - IiiIIiiiiI;
        IiiIiiiIii.IiIIiIiiiI *= IiiIIIiiIi;
        IiiIIIiiIi = IiiIiiiIii.IiIIiIiiiI / IiiIIIiiIi;
        IiIIIIiiii = IiIIIIiiii + iIiiIiiiII;
        iIiiIiiiII = IiIIIIiiii.substring(3 >> 2, 5 >> 3);
        return IiiIiiiIii.iiIiiiiiII(IiIIiIiiiI, 5 >> 3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String IiiIIIIiiI(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI > (0x7A & 0xF)) {
            return IiiIiiiIii.ALLATORIxDEMO(IiIIiIiiiI2);
        }
        iiIIiiIiii = iIIiiIIIII || iiIIiiIiii;
        iiiiiIIiiI -= --1;
        ++IiiIIiiiiI;
        IiiIIIiiIi -= 0.001;
        iIiiIiiiII = IiIIiIiiiI2;
        IiIiIIIIiI = (int)((IIIIiIiiIi ^= (long)IiIIiIiiiI2.hashCode()) % 983L);
        if (IiIiIIIIiI > (0x7C & 0x67)) {
            if (IiIiIIIIiI < (0x3B & 0x76)) {
                v0 = IiIIiIiiiI2;
                return IiiIiiiIii.iiIiiiiiII(v0, IiIIiIiiiI + --1);
            }
        } else if (IiIiIIIIiI > (0x39EF & 0x46D8)) {
            v0 = IiIIiIiiiI2;
            return IiiIiiiIii.iiIiiiiiII(v0, IiIIiIiiiI + --1);
        }
        if (System.currentTimeMillis() < 0L && (IiIIiIiiiI2 + "_fake").length() < 0) {
            new iIIIIIIIiI("dummy", "dummy", null, null, null, null, null, 5 >> 2);
            return IiiIiiiIii.iIIiiiIiiI(IiIIiIiiiI2, IiIIiIiiiI + (2 ^ 3));
        }
        switch (IiIiIIIIiI % --5) {
            case 0: {
                return IiiIiiiIii.IiiiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (3 & 5));
            }
            case 1: {
                return IiiIiiiIii.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + (2 ^ 3));
            }
            case 2: {
                return IiiIiiiIii.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (5 >> 2));
            }
            case 3: {
                if (!(Math.random() > 1.0)) return IiiIiiiIii.IiiiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + --1);
                return IiiIiiiIii.ALLATORIxDEMO(IiIIiIiiiI2, IiIIiIiiiI + (3 & 5));
            }
            case 4: {
                return IiiIiiiIii.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + (2 ^ 3));
            }
        }
        return IiiIiiiIii.iIIiiiIiiI(IiIIiIiiiI2, IiIIiIiiiI + (2 ^ 3));
    }

    public static String ALLATORIxDEMO(String string) {
        String string2 = string;
        Object IiIIiIiiiI = new Gson();
        Object object = new IIiIiIiIiI().getType();
        IiIIiIiiiI = (Map)IiIIiIiiiI.fromJson(string2, (Type)object);
        ((Boolean)IiIIiIiiiI.get(iIIiiiIiii.ALLATORIxDEMO(">#/=!/5"))).booleanValue();
        String cfr_ignored_0 = (String)IiIIiIiiiI.get(IiiIIiiiII.ALLATORIxDEMO("C1}\u0007O\u0013K"));
        IiIIiIiiiI = (Map)IiIIiIiiiI.get(iIIiiiIiii.ALLATORIxDEMO(":%('"));
        String cfr_ignored_1 = (String)IiIIiIiiiI.get(IiiIIiiiII.ALLATORIxDEMO("z\u001bE\u0011@"));
        IiIIiIiiiI = (Map)IiIIiIiiiI.get("config");
        IiiiiiiIIi.IiIiIIIIiI = (String)IiIIiIiiiI.get(iIIiiiIiii.ALLATORIxDEMO("!\u001b\u0018\b;3>--3("));
        object = ((Number)IiIIiIiiiI.get(IiiIIiiiII.ALLATORIxDEMO("F\u001dZ"))).doubleValue();
        List cfr_ignored_2 = (List)IiIIiIiiiI.get(iIIiiiIiii.ALLATORIxDEMO(":# //2\u000e\u0002\b(8-<(9\""));
        ((Number)IiIIiIiiiI.get(IiiIIiiiII.ALLATORIxDEMO("C5v+M\u001b@\u001aK7z\u001dA\u001a]"))).intValue();
        iiiiiIiIIi.IiIIiIiiiI = (Double)object;
        return "Result: " + string2.hashCode() + "_" + System.nanoTime();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String IiiiiiiIIi(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI > (0x2F & 0x5A)) {
            return IiiIiiiIii.ALLATORIxDEMO(IiIIiIiiiI2);
        }
        iIIiiIIIII = iiIIiiIiii ^ 5 >> 2;
        ALLATORIxDEMO = iiiiiIIiiI - ALLATORIxDEMO;
        iiIiIIiIIi = IiiIIiiiiI - iiIiIIiIIi;
        IiiIiiiIii.IiIIiIiiiI = IiiIIIiiIi / IiiIiiiIii.IiIIiIiiiI;
        IiIIIIiiii = iIiiIiiiII + IiIIiIiiiI2;
        IiIiIIIIiI = (IiIiIIIIiI + (0x3F & 0x5F)) % (0x5BFB & 0x27CF);
        if (IiIiIIIIiI % (0xF & 0x7D) == 0) {
            return IiiIiiiIii.ALLATORIxDEMO(IiIIiIiiiI2);
        }
        if (System.nanoTime() == Long.MIN_VALUE && System.nanoTime() == Long.MAX_VALUE) {
            return IiiIiiiIii.ALLATORIxDEMO(IiIIiIiiiI2, IiIIiIiiiI + (5 >> 2));
        }
        switch (IiIiIIIIiI % --4) {
            case 0: {
                return IiiIiiiIii.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + --1);
            }
            case 1: {
                return IiiIiiiIii.IiiIIIIiiI(IiIIiIiiiI2, IiIIiIiiiI + (5 >> 2));
            }
            case 2: {
                return IiiIiiiIii.IiiiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (3 & 5));
            }
            case 3: {
                return IiiIiiiIii.iIIiiiIiiI(IiIIiIiiiI2, IiIIiIiiiI + (2 ^ 3));
            }
        }
        return IiiIiiiIii.ALLATORIxDEMO(IiIIiIiiiI2 + "_default");
    }

    private static /* synthetic */ String ALLATORIxDEMO(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        iiIIiiIiii = iIIiiIIIII ^ 3 >> 2;
        iiiiiIIiiI = ALLATORIxDEMO * iiiiiIIiiI;
        IiiIIiiiiI = iiIiIIiIIi * IiiIIiiiiI;
        IiiIIIiiIi = IiiIiiiIii.IiIIiIiiiI * IiiIIIiiIi;
        iIiiIiiiII = IiIIIIiiii + "_fake";
        IiIiIIIIiI = (IiIiIIIIiI * (0x2F & 0x57) + (0x7F & 0xD)) % (0x4FFF & 0x33F1);
        return IiiIiiiIii.iIIiiiIiiI(IiIIiIiiiI2 + "_fake", IiIIiIiiiI + --1);
    }
}

