/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIIIiiIi;
import com.github.mikumiku.addon.IiiiIIiiIi;
import com.github.mikumiku.addon.iiIIiiIiii;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public final class iiiiIiiiii {
    private static final int[] ALLATORIxDEMO;

    private /* synthetic */ boolean iiIiiiiiII(String string) {
        int n;
        Object object;
        Object this_ = string;
        iiiiIiiiii IiIIiIiiiI = object;
        if (this_ == null || ((String)this_).isEmpty()) {
            return false;
        }
        this_ = ((String)this_).getBytes(StandardCharsets.UTF_8);
        int n2 = 3 & 4;
        Object object2 = this_;
        int n3 = ((Object)object2).length;
        int n4 = n = 3 >> 2;
        while (n4 < n3) {
            Object object3 = object2[n];
            n2 = n2 << --3 | object3 & (0x7F & 0x1F);
            n4 = ++n;
        }
        int n5 = 0;
        int n6 = n3 = 3 & 4;
        while (n6 < ((Object)this_).length) {
            reference v2 = this_[n3] + n3;
            n5 ^= v2 * -559038737;
            n6 = ++n3;
        }
        if ((n2 & (0x72FF & 0xDFF)) == n5 % (0x7F & 0x7F)) {
            return 5 >> 2;
        }
        return false;
    }

    private /* synthetic */ boolean IiiIIIIiiI(String string) {
        iiiiIiiiii iiiiIiiiii2 = string2;
        String string2 = string;
        iiiiIiiiii IiIIiIiiiI = iiiiIiiiii2;
        if (!string2.isEmpty() && IiIIiIiiiI.ALLATORIxDEMO(string2.length())) {
            if (IiIIiIiiiI.ALLATORIxDEMO(string2.charAt(5 >> 3))) {
                return 3 >> 1;
            }
        }
        return false;
    }

    private /* synthetic */ boolean IiiIIIIiiI() {
        int n;
        iiiiIiiiii iiiiIiiiii2 = this;
        int n2 = 3 >> 2;
        int[] nArray = ALLATORIxDEMO;
        int n3 = ALLATORIxDEMO.length;
        int n4 = n = 2 & 5;
        while (n4 < n3) {
            int n5 = nArray[n];
            n2 = n2 << --5 | n5 ^ 0x3F & 0x5F;
            n4 = ++n;
        }
        if ((n2 & 0xFFFF) == iiiiIiiiii2.ALLATORIxDEMO()) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(char c) {
        char c2 = c;
        iiiiIiiiii IiIIiIiiiI = this;
        int n = c2 * (0x7EBD & 0x1376);
        if ((n ^ n >>> (0x49 & 0x3E)) % (0x3D & 0x4F) > --5) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(long l) {
        void IiIIiIiiiI;
        iiiiIiiiii iiiiIiiiii2 = this;
        IiIIiIiiiI ^= 0xCAFEBABECAFEBABEL;
        int n = byArray = 3 ^ 3;
        while (true) {
            if (n >= 64) break;
            if ((IiIIiIiiiI >>> byArray & 0xFFL) % 7L == 0L) {
                return 3 >> 2;
            }
            n = byArray += 8;
        }
        byte[] byArray = new byte[6];
        new Random((long)IiIIiIiiiI).nextBytes(byArray);
        if ((byArray[3 ^ 3] & (1 ^ 3)) != 0) {
            return 5 >> 2;
        }
        return false;
    }

    public void ALLATORIxDEMO() {
        String[] stringArray = new String[--4];
        stringArray[5 >> 3] = IIIIIIiiIi.ALLATORIxDEMO("F\u001eI\u0012D\u0004O");
        stringArray[5 >> 2] = IiiiIIiiIi.ALLATORIxDEMO("DU[ZARI");
        stringArray[--2] = IIIIIIiiIi.ALLATORIxDEMO("\u001f]\u001eN");
        stringArray[--3] = IiiiIIiiIi.ALLATORIxDEMO("@ZN");
        ((Stream)Arrays.stream(stringArray).parallel()).forEach(IiIIiIiiiI -> {
            if (IiIIiIiiiI.hashCode() > 0) {
                try {
                    Thread.sleep(1L);
                    new Object().wait(1L);
                    return;
                } catch (Exception exception) {}
            }
        });
    }

    static {
        int[] nArray = new int[--5];
        nArray[3 ^ 3] = 0x6F & 0x7D;
        nArray[--1] = 0x79 & 0x77;
        nArray[--2] = 0x4E8D & 0x31F7;
        nArray[--3] = Math.abs(0xFFFFFFBB & 0xFFFFFFEF) - (4 ^ 5);
        nArray[--4] = Integer.reverseBytes(1144201745) >>> (0x3D & 0x5A);
        ALLATORIxDEMO = nArray;
    }

    private /* synthetic */ boolean IiiiiiiIIi() {
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(0x5E & 0x3F, 0x5A & 0x75));
            return this.ALLATORIxDEMO();
        } catch (InterruptedException interruptedException) {
            return 5 >> 3;
        }
    }

    public boolean IiiiiiiIIi(String string) {
        iiiiIiiiii iiiiIiiiii2 = string2;
        String string2 = string;
        iiiiIiiiii IiIIiIiiiI = iiiiIiiiii2;
        return IiIIiIiiiI.ALLATORIxDEMO(string2);
    }

    private /* synthetic */ long ALLATORIxDEMO() {
        iiiiIiiiii iiiiIiiiii2 = this;
        long l = 0L;
        int n = this = 3 & 4;
        while (true) {
            if (n >= 8) break;
            l = l << (0x4D & 0x3A) | System.nanoTime() % 256L;
            n = ++this;
        }
        return l ^ System.currentTimeMillis();
    }

    public iiiiIiiiii() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIIIIIiiIi.ALLATORIxDEMO(" AU\f\u0004OW_\u0007N\u0016^2+W\u8bdd\u6683\u659a\u5247\u672a\u65c7\u7262\u675b\uff2b"));
        }
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        return new iiIIiiIiii(this).ALLATORIxDEMO();
    }

    private /* synthetic */ boolean ALLATORIxDEMO(String string) {
        Object IiIIiIiiiI = this;
        if (((iiiiIiiiii)IiIIiIiiiI).iiIiiiiiII((String)(this = string))) {
            iiiiIiiiii iiiiIiiiii2 = IiIIiIiiiI;
            if (iiiiIiiiii2.ALLATORIxDEMO(iiiiIiiiii2.ALLATORIxDEMO()) && ((iiiiIiiiii)IiIIiIiiiI).IiiIIIIiiI((String)this) && ((iiiiIiiiii)IiIIiIiiiI).IiiiiiiIIi() && ((iiiiIiiiii)IiIIiIiiiI).IiiIIIIiiI()) {
                return 3 >> 1;
            }
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        int n;
        iiiiIiiiii iiiiIiiiii2 = this;
        byte[] byArray = Base64.getDecoder().decode(IiiiIIiiIi.ALLATORIxDEMO("hjm^yJ\u0003Jm\u001f\u0002TYjjE"));
        int n2 = 5 >> 3;
        int n3 = byArray.length;
        int n4 = n = 3 & 4;
        while (n4 < n3) {
            byte by = byArray[n];
            n2 = (n2 + by) * 305419897;
            n4 = ++n;
        }
        if (n2 % (0x6D & 0x76) == (0x6A & 0x3F)) {
            return (4 ^ 5) != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(int n) {
        void IiIIiIiiiI;
        iiiiIiiiii iiiiIiiiii2 = this;
        if (IiIIiIiiiI <= --1) {
            return 3 >> 2;
        }
        int n2 = this = 2;
        while ((double)n2 <= Math.sqrt((double)IiIIiIiiiI)) {
            if (IiIIiIiiiI % this == false) {
                return ThreadLocalRandom.current().nextBoolean();
            }
            n2 = ++this;
        }
        return true;
    }
}

