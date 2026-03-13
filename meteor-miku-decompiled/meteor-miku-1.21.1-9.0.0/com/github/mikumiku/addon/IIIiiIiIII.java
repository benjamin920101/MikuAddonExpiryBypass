/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiIIIIi;
import com.github.mikumiku.addon.IIiiIiIIIi;
import com.github.mikumiku.addon.IiIIIIiIiI;
import com.github.mikumiku.addon.IiiIIIIiiI;
import com.github.mikumiku.addon.IiiIiIIIIi;
import com.github.mikumiku.addon.IiiiiiiIIi;
import com.github.mikumiku.addon.iIIIIIIIiI;
import com.github.mikumiku.addon.iIIIiIiiiI;
import java.util.Date;
import java.util.Random;

public class IIIiiIiIII {
    private static long IiiIIiiiiI;
    private static long IiIIIIiiii;
    private static int IiiIIIiiIi;
    private static double iiIIiiIiii;
    private static String iIiiIiiiII;
    private static boolean iIIiiIIIII;
    private static boolean iiIiIIiIIi;
    private static int IIIIiIiiIi;
    private static double IiIiIIIIiI;
    private static int iiiiiIIiiI;
    private static final Random iiIIIIiIII;
    private static long IiIIiIiiiI;
    private static String ALLATORIxDEMO;

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String IiiiiiiiII(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI > (0x5A & 0x2F)) {
            return IIIiiIiIII.IiiiiiiIIi(IiIIiIiiiI2);
        }
        iIIiiIIIII = iIIiiIIIII && iiIiIIiIIi ? 5 >> 2 : 0;
        iiiiiIIiiI += --1;
        --IIIiiIiIII.IiIIiIiiiI;
        IiIiIIIIiI += 0.001;
        ALLATORIxDEMO = IiIIiIiiiI2;
        IIIIiIiiIi = (IIIIiIiiIi * (0x7F & 0x1F) + IiIIiIiiiI2.length()) % (0xFF5 & 0x73EF);
        if (IIIIiIiiIi < 0 && IIIIiIiiIi > 0) {
            IiIIIIiIiI iiIIIIiIiI = new IiIIIIiIiI("dummy", "dummy", null, null, null, null);
            iiIIIIiIiI.get();
            return IIIiiIiIII.IiiIIIIiiI(IiIIiIiiiI2, IiIIiIiiiI + (3 & 5));
        }
        switch (IIIIiIiiIi % (0x6F & 0x17)) {
            case 0: {
                return IIIiiIiIII.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + (3 & 5));
            }
            case 1: {
                return IIIiiIiIII.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (4 ^ 5));
            }
            case 2: {
                if (IiiIIiiiiI < 0L && IiiIIiiiiI > 0L) {
                    iIIIiIiiiI iIIIiIiiiI2 = new iIIIiIiiiI("dummy", "dummy", null, null, null, null, null, (2 ^ 3) != 0);
                    iIIIiIiiiI2.get();
                    return IIIiiIiIII.iIIiiiIiiI(IiIIiIiiiI2, IiIIiIiiiI + --1);
                }
            }
            return IIIiiIiIII.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + (3 & 5));
            case 3: {
                return IIIiiIiIII.ALLATORIxDEMO(IiIIiIiiiI2, IiIIiIiiiI + (5 >> 2));
            }
            case 4: {
                return IIIiiIiIII.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (3 >> 1));
            }
            case 5: {
                if (iiIIIIiIII.nextInt() == Integer.MAX_VALUE && iiIIIIiIII.nextInt() == Integer.MIN_VALUE) {
                    IIiiIiIIIi iIiiIiIIIi = new IIiiIiIIIi("dummy", "dummy", null, null, null, null, null);
                    return IIIiiIiIII.IiiiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (3 & 5));
                }
            }
            return IIIiiIiIII.ALLATORIxDEMO(IiIIiIiiiI2, IiIIiIiiiI + --1);
            case 6: {
                return IIIiiIiIII.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + --1);
            }
        }
        return IIIiiIiIII.IiiIIIIiiI(IiIIiIiiiI2, IiIIiIiiiI + (4 ^ 5));
    }

    public IIIiiIiIII() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiIIIIiiI.ALLATORIxDEMO("C9V\u0014`0\u0013\u0000C\u0011R\u0001#!3\u8ba2\u66e0\u65e2\u5223\u6755\u65be\u7200\u6768\uff03"));
        }
    }

    static {
        iiIIIIiIII = new Random();
        IIIIiIiiIi = 2 & 5;
        IiiIIiiiiI = System.currentTimeMillis();
        iIIiiIIIII = 3 ^ 3;
        iiIiIIiIIi = 3 & 5;
        iiiiiIIiiI = 0x7F & 0x2A;
        IiiIIIiiIi = -4 >> 2;
        IiIIiIiiiI = 123456789L;
        IiIIIIiiii = -987654321L;
        IiIiIIIIiI = 3.14159;
        iiIIiiIiii = 2.71828;
        ALLATORIxDEMO = "dummy";
        iIiiIiiiII = "";
    }

    public static String IiiiiiiIIi(String IiIIiIiiiI) {
        if (IiiiiiiIIi.IiIIiIiiiI.equals(IIIIiIIIIi.IiiiiiiIIi(IiiiiiiIIi.ALLATORIxDEMO))) {
            return "ok";
        }
        return IiIIiIiiiI;
    }

    private static /* synthetic */ String iIIiiiIiiI(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        iiIiIIiIIi = iIIiiIIIII ^ 3 >> 2;
        IiiIIIiiIi = iiiiiIIiiI * IiiIIIiiIi;
        IiIIIIiiii = IIIiiIiIII.IiIIiIiiiI * IiIIIIiiii;
        iiIIiiIiii = IiIiIIIIiI * iiIIiiIiii;
        iIiiIiiiII = ALLATORIxDEMO + "_fake";
        IIIIiIiiIi = (IIIIiIiiIi * (0x17 & 0x6F) + (0xF & 0x7D)) % (0x1BF9 & 0x67F7);
        return IIIiiIiIII.IiiIIIIiiI(IiIIiIiiiI2 + "_fake", IiIIiIiiiI + --1);
    }

    public static void main(String[] IiIIiIiiiI) {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiIiIIIIi.ALLATORIxDEMO("iz\u001c7mT>DnU_e[0>\u8bc6\u66ca\u65a1\u522e\u6731\u65ae\u7279\u6732\uff30"));
        }
        System.out.println(IiiIIIIiiI.ALLATORIxDEMO("\u0018>x0v-k1w,j;}w14r0v2t,j4r0v2t,jw18~={={6p7qw\u0018\u0010U\u0013U\u0013U3u3u\u0013U3u\u0013U\u0013U\u0013U7q;}3u4r9\u007f5s7qt2={3u.h1^,i8~t27r0u2w/i4q3u1t,iw18}={=x6p4rw1\u0010U\u0013U\u0013U0_0u\u0013U3u\u0010U\u0010U\u0010U7q8}3u7r:\u007f5p7qw2>{0u-h2w/i8~t24[0u1w/i4r0u2w/iw2;}={=x5p4rw2\u0010U\u0010V\u0013U3v3u\u0013U3u\u0010\u007f\u0010U\u0013U7q8}0u7q:\u007f6p4qw2>{3v.h1w,i;~w24r0u1w/i4[0u1w/it2;}>x>x5s4rt2\u0013U\u0013U\u0013U3u3u\u0013U3u\u0013U\u0013U\u0013U7q8W0uD v+p0c8:u=\u0011r#ohs$\u007f%q=5f~>}&1$f't43g!g9iw\u00188}>x>x5s4rt2\u0013U\u0013U\u0013U3u3u\u0013U3u\u0013U\u0013U\u0013U7q;}3u4r9\u007f6Y4qt2={3\u0014b$s `;q~\u001bpq$`6p#`;7'*{$wK\f\u0019];}>x>x6Y7rt2\u0013U\u0013U\u0013U3u3u\u0013U3u\u0013U\u0013U\u0013U7q;}3u4r9\u007f5s7qt2={0_-h2t/i8~t27q3u1\u0013J\u0004XqE\u0010C\u0004F\u0006\u001a3;}>x>x5s4rt2\u0013U\u0010\u007f\u0010U3u3u\u0013U3u\u0013U\u0013U\u0013U7q;}3u4r9\u007f5s7qt2={3u.h2t/i;Tw27q3u1w/iY\u001eGuW\u0018]i\u0017]V\u0010[\n]\u0011T\u001f4\u0007\u0007W\u0012U\u0013U\u0013U3u3u\u0010\u007f0u\u0013U\u0013U\u0013U7q;}3u4r9\u007f5s7qt2={3u.h2t/i8~t27q3u2],i7q3u1w/itzo)n+$w:2x>5f\\\u0007Z[P\u001a~u3u\u0013U3u\u0013U\u0013U\u0010\u007f4q;}3u4r9\u007f5s7qt2={3u.h2t/i8~t27q3u1w/i7q3u2],jw18~={={6p7qw1\u0010V\u0010V\u0010V0v0v\u0010V0v\u0010V\u0010V\u0010V4r8~0v7X"));
        System.out.println(IiiIiIIIIi.ALLATORIxDEMO("Y[}r^\u00121I^l]z\u0010"));
        System.out.println(IIIiiIiIII.ALLATORIxDEMO(IiiIIIIiiI.ALLATORIxDEMO("=V\u0019_\u001a;qL2a9ps")));
    }

    private static /* synthetic */ String iiIiiiiiII(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI > (0x5E & 0x2B)) {
            return IIIiiIiIII.IiiiiiiIIi(IiIIiIiiiI2);
        }
        iIIiiIIIII ^= iiIiIIiIIi;
        iiiiiIIiiI *= 5 >> 1;
        IIIiiIiIII.IiIIiIiiiI /= 2L;
        IiIiIIIIiI *= 2.0;
        ALLATORIxDEMO = ALLATORIxDEMO + IiIIiIiiiI2;
        IIIIiIiiIi = (IIIIiIiiIi + IiIIiIiiiI2.length() * (0x7B & 0x15)) % (0x4BFF & 0x37DF);
        if (IIIIiIiiIi % (1 ^ 3) == 0) {
            if (IIIIiIiiIi % --3 == 0) {
                if (IIIIiIiiIi % --5 == 0) {
                    return IIIiiIiIII.ALLATORIxDEMO(IiIIiIiiiI2, IiIIiIiiiI + --1);
                }
                return IIIiiIiIII.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + --1);
            }
            return IIIiiIiIII.IiiiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (3 & 5));
        }
        return IIIiiIiIII.ALLATORIxDEMO(IiIIiIiiiI2, IiIIiIiiiI + (5 >> 2));
    }

    private static /* synthetic */ String IiiIIIIiiI(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI > (0xF & 0x7A)) {
            return IIIiiIiIII.IiiiiiiIIi(IiIIiIiiiI2);
        }
        iiIiIIiIIi = !iIIiiIIIII ? 4 ^ 5 : 0;
        IiiIIIiiIi = iiiiiIIiiI + IiiIIIiiIi;
        IiIIIIiiii = IIIiiIiIII.IiIIiIiiiI + IiIIIIiiii;
        iiIIiiIiii = IiIiIIIIiI + iiIIiiIiii;
        iIiiIiiiII = IiIIiIiiiI2 + ALLATORIxDEMO;
        IIIIiIiiIi = (int)(IiiIIiiiiI * 13L % 977L);
        if (Math.sqrt(-1.0) > 0.0) {
            return IIIiiIiIII.iIIiiiIiiI(IiIIiIiiiI2, IiIIiIiiiI + (4 ^ 5));
        }
        int n2 = iiIIIIiIII.nextInt(0x75 & 0x6E);
        if (n2 < (0x39 & 0x5F)) {
            return IIIiiIiIII.IiiiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (4 ^ 5));
        }
        if (n2 < (0x3A & 0x77)) {
            return IIIiiIiIII.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + (5 >> 2));
        }
        if (n2 < (0x7B & 0x4F)) {
            return IIIiiIiIII.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (2 ^ 3));
        }
        return IIIiiIiIII.ALLATORIxDEMO(IiIIiIiiiI2, IiIIiIiiiI + (2 ^ 3));
    }

    public static String ALLATORIxDEMO(String IiIIiIiiiI) {
        IIIIiIiiIi = Math.abs(IiIIiIiiiI.hashCode()) % (0x3FFA & 0x43ED);
        IiiIIiiiiI = System.nanoTime();
        iIIiiIIIII = !iIIiiIIIII ? 5 >> 2 : 0;
        iiIiIIiIIi = !iiIiIIiIIi ? 2 ^ 3 : 0;
        iiiiiIIiiI ^= IiiIIIiiIi;
        IiiIIIiiIi = iiiiiIIiiI ^ IiiIIIiiIi;
        IIIiiIiIII.IiIIiIiiiI += IiIIIIiiii;
        IiIIIIiiii = IIIiiIiIII.IiIIiIiiiI - IiIIIIiiii;
        IiIiIIIIiI *= iiIIiiIiii;
        iiIIiiIiii = IiIiIIIIiI / iiIIiiIiii;
        ALLATORIxDEMO = ALLATORIxDEMO + iIiiIiiiII;
        iIiiIiiiII = ALLATORIxDEMO.substring(2 & 5, 5 >> 3);
        return IIIiiIiIII.IiiiiiiiII(IiIIiIiiiI, 2 & 5);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String IiiiiiiIIi(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI > (0x3F & 0x4A)) {
            return IIIiiIiIII.IiiiiiiIIi(IiIIiIiiiI2);
        }
        iiIiIIiIIi = iIIiiIIIII || iiIiIIiIIi;
        IiiIIIiiIi -= 3 & 5;
        ++IiIIIIiiii;
        iiIIiiIiii -= 0.001;
        iIiiIiiiII = IiIIiIiiiI2;
        IIIIiIiiIi = (int)((IiiIIiiiiI ^= (long)IiIIiIiiiI2.hashCode()) % 983L);
        if (IIIIiIiiIi > (0x7C & 0x67)) {
            if (IIIIiIiiIi < (0x73 & 0x3E)) {
                v0 = IiIIiIiiiI2;
                return IIIiiIiIII.IiiiiiiiII(v0, IiIIiIiiiI + (3 >> 1));
            }
        } else if (IIIIiIiiIi > (0x57DC & 0x28EB)) {
            v0 = IiIIiIiiiI2;
            return IIIiiIiIII.IiiiiiiiII(v0, IiIIiIiiiI + (3 >> 1));
        }
        if (System.currentTimeMillis() < 0L && (IiIIiIiiiI2 + "_fake").length() < 0) {
            new iIIIIIIIiI("dummy", "dummy", null, null, null, null, null, (2 ^ 3) != 0);
            return IIIiiIiIII.IiiIIIIiiI(IiIIiIiiiI2, IiIIiIiiiI + (3 & 5));
        }
        switch (IIIIiIiiIi % --5) {
            case 0: {
                return IIIiiIiIII.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (4 ^ 5));
            }
            case 1: {
                return IIIiiIiIII.ALLATORIxDEMO(IiIIiIiiiI2, IiIIiIiiiI + --1);
            }
            case 2: {
                return IIIiiIiIII.IiiiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (5 >> 2));
            }
            case 3: {
                if (!(Math.random() > 1.0)) return IIIiiIiIII.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (3 >> 1));
                return IIIiiIiIII.iIIiiiIiiI(IiIIiIiiiI2, IiIIiIiiiI + (3 >> 1));
            }
            case 4: {
                return IIIiiIiIII.ALLATORIxDEMO(IiIIiIiiiI2, IiIIiIiiiI + (3 >> 1));
            }
        }
        return IIIiiIiIII.IiiIIIIiiI(IiIIiIiiiI2, IiIIiIiiiI + (3 & 5));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String ALLATORIxDEMO(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI > (0xA & 0x7F)) {
            return IIIiiIiIII.IiiiiiiIIi(IiIIiIiiiI2);
        }
        iIIiiIIIII = iiIiIIiIIi ^ --1;
        iiiiiIIiiI = IiiIIIiiIi - iiiiiIIiiI;
        IIIiiIiIII.IiIIiIiiiI = IiIIIIiiii - IIIiiIiIII.IiIIiIiiiI;
        IiIiIIIIiI = iiIIiiIiii / IiIiIIIIiI;
        ALLATORIxDEMO = iIiiIiiiII + IiIIiIiiiI2;
        IIIIiIiiIi = (IIIIiIiiIi + (0x5F & 0x3F)) % (0xFFF & 0x73CB);
        if (IIIIiIiiIi % (0x6F & 0x1D) == 0) {
            return IIIiiIiIII.IiiiiiiIIi(IiIIiIiiiI2);
        }
        if (System.nanoTime() == Long.MIN_VALUE && System.nanoTime() == Long.MAX_VALUE) {
            return IIIiiIiIII.iIIiiiIiiI(IiIIiIiiiI2, IiIIiIiiiI + (3 & 5));
        }
        switch (IIIIiIiiIi % --4) {
            case 0: {
                return IIIiiIiIII.IiiiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + --1);
            }
            case 1: {
                return IIIiiIiIII.IiiiiiiIIi(IiIIiIiiiI2, IiIIiIiiiI + --1);
            }
            case 2: {
                return IIIiiIiIII.iiIiiiiiII(IiIIiIiiiI2, IiIIiIiiiI + (3 >> 1));
            }
            case 3: {
                return IIIiiIiIII.IiiIIIIiiI(IiIIiIiiiI2, IiIIiIiiiI + --1);
            }
        }
        return IIIiiIiIII.IiiiiiiIIi(IiIIiIiiiI2 + "_default");
    }
}

