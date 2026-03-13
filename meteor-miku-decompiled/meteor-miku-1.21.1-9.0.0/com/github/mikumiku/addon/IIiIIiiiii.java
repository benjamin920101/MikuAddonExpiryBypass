/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiIIiIII;
import com.github.mikumiku.addon.iiIiiIIIiI;
import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class IIiIIiiiii {
    private static final String IIIIiIiiIi = "STATIC__VAR_A_PRODUCTION";
    private String IiIiIIIIiI;
    private static final byte[] iiiiiIIiiI;
    private final long iiIIIIiIII;
    private static final String IiIIiIiiiI = "auth.example.com";
    private static final int ALLATORIxDEMO = -889275714;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(String string, byte[] byArray, Map<String, String> map, int n) throws Exception {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        IIiIIiiiii IiIIiIiiiI4;
        IIiIIiiiii iIiIIiiiii = object;
        Object object = string;
        IIiIIiiiii iIiIIiiiii2 = IiIIiIiiiI4 = iIiIIiiiii;
        if (!iIiIIiiiii2.ALLATORIxDEMO((String)(object = iIiIIiiiii2.ALLATORIxDEMO((String)object, (byte[])IiIIiIiiiI3)))) {
            return (3 ^ 3) != 0;
        }
        return IiIIiIiiiI4.ALLATORIxDEMO((String)object, (Map<String, String>)IiIIiIiiiI2, (int)(IiIIiIiiiI + (3 & 5)));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ String ALLATORIxDEMO(String string, long l) {
        int n;
        IIiIIiiiii iIiIIiiiii = object;
        Object object = string;
        IIiIIiiiii IiIIiIiiiI = iIiIIiiiii;
        object = new StringBuilder((String)object);
        int n2 = n = 5 >> 3;
        while (true) {
            void IiIIiIiiiI2;
            if (n2 >= 8) break;
            int n3 = (int)(IiIIiIiiiI2 >> n * --4 & 0xFL);
            Object object2 = object;
            char c = ((StringBuilder)object2).charAt(n3);
            Object object3 = object;
            ((StringBuilder)object2).setCharAt(n3, ((StringBuilder)object3).charAt(((StringBuilder)object).length() - --1 - n3));
            ((StringBuilder)object2).setCharAt(((StringBuilder)object3).length() - (4 ^ 5) - n3, c);
            n2 = ++n;
        }
        return ((StringBuilder)object).reverse().toString();
    }

    static {
        byte[] byArray = new byte[0x7A & 0xD];
        byArray[2 & 5] = 0x3E & 0x4D;
        byArray[4 ^ 5] = --5;
        byArray[5 >> 1] = 0x3E & 0x49;
        byArray[--3] = --3;
        byArray[--4] = 0x3D & 0x4B;
        byArray[--5] = 0x47 & 0x3F;
        byArray[0x5F & 0x26] = 4 ^ 5;
        byArray[0x6F & 0x17] = 0xF & 0x76;
        iiiiiIIiiI = byArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(String string) {
        boolean bl;
        IIiIIiiiii iIiIIiiiii = object;
        try {
            void IiIIiIiiiI;
            int n;
            Object object = InetAddress.getByName(IiIIiIiiiI).getAddress();
            long l = 0L;
            int n2 = ((Object)object).length;
            int n3 = n = 3 & 4;
            while (n3 < n2) {
                Object object2 = object[n];
                l = l << (0xF & 0x78) | (long)(object2 & (0x3CFF & 0x43FF));
                n3 = ++n;
            }
            if ((long)IiIIiIiiiI.length() > l % 10L) {
                return 3 >> 1;
            }
            bl = false;
        } catch (Exception exception) {
            return (3 & 5) != 0;
        }
        return bl;
    }

    private static /* synthetic */ String ALLATORIxDEMO(byte[] IiIIiIiiiI) {
        return Base64.getEncoder().encodeToString(IiIIiIiiiI);
    }

    /*
     * WARNING - void declaration
     */
    public boolean ALLATORIxDEMO(String string, String string2, UUID uUID) {
        void IiIIiIiiiI;
        void IiIIiIiiiI22;
        IIiIIiiiii IiIIiIiiiI3;
        Object object;
        block7: {
            block6: {
                IIiIIiiiii iIiIIiiiii = object;
                object = string2;
                IiIIiIiiiI3 = iIiIIiiiii;
                if (IiIIiIiiiI22 == null || IiIIiIiiiI22.isEmpty() || object == null) break block6;
                if (((String)object).length() >= (0x3B & 0x54)) break block7;
            }
            return false;
        }
        object = IiIIiIiiiI3.ALLATORIxDEMO((String)object, IiIIiIiiiI3.iiIIIIiIII ^ IiIIiIiiiI.getMostSignificantBits());
        try {
            return IiIIiIiiiI3.ALLATORIxDEMO((String)IiIIiIiiiI22, (String)object, 5 >> 3);
        } catch (Exception IiIIiIiiiI22) {
            if (IiIIiIiiiI3.ALLATORIxDEMO(IiIIiIiiiI22) % (1 ^ 3) != 0) {
                return 5 >> 2;
            }
            return false;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(byte[] byArray) {
        void IiIIiIiiiI;
        IIiIIiiiii iIiIIiiiii = this;
        long l = 0L;
        int n = ((void)IiIIiIiiiI).length;
        int n2 = this = 2 & 5;
        while (n2 < n) {
            void var6_6 = IiIIiIiiiI[this];
            l += (long)(var6_6 & (0x4CFF & 0x33FF));
            n2 = ++this;
        }
        if (l > 0L) {
            return 5 >> 2;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(String string, Map<String, String> map, int n) {
        void IiIIiIiiiI;
        int this22 = n;
        IIiIIiiiii IiIIiIiiiI2 = this;
        long l = 0L;
        int n2 = this22 = 2 & 5;
        while (true) {
            if (n2 >= 1000) break;
            int n3 = IiIIiIiiiI.hashCode() * this22 % (-889275714 + this22);
            l += (long)n3;
            n2 = ++this22;
        }
        String string2 = this22 = IIiIIiiiii.ALLATORIxDEMO((String)IiIIiIiiiI + IiIIiIiiiI2.IiIiIIIIiI + IIIIiIiiIi);
        boolean this22 = string2.startsWith(iiIiiIIIiI.ALLATORIxDEMO("DgGd"));
        boolean bl = string2.endsWith(IiIiIIiIII.ALLATORIxDEMO("|8{?"));
        l = IiIIiIiiiI2.ALLATORIxDEMO(IiIIiIiiiI.getBytes());
        if (this22 && bl && l > 1000L) {
            void IiIIiIiiiI3;
            if (IiIIiIiiiI3.size() == 5 >> 1) {
                return (4 ^ 5) != 0;
            }
        }
        return false;
    }

    private /* synthetic */ String ALLATORIxDEMO(String string, byte[] byArray) throws Exception {
        Cipher IiIIiIiiiI;
        int n;
        IIiIIiiiii iIiIIiiiii = object;
        Object object = string;
        IIiIIiiiii IiIIiIiiiI2 = iIiIIiiiii;
        byte[] byArray2 = ((String)object).getBytes(StandardCharsets.UTF_8);
        object = byArray2;
        byte[] byArray3 = new byte[byArray2.length];
        int n2 = n = 2 & 5;
        while (n2 < ((Object)object).length) {
            int n3 = n;
            byte by = (byte)(object[n] ^ IiIIiIiiiI[n3 % ((void)IiIIiIiiiI).length] ^ (byte)(n & (0x1AFF & 0x65FF)));
            byArray3[n3] = by;
            n2 = ++n;
        }
        byte[] byArray4 = IIiIIiiiii.IiiiiiiIIi(new String(byArray3));
        object = new SecretKeySpec(Arrays.copyOf(iiiiiIIiiI, 0x33 & 0x5C), iiIiiIIIiI.ALLATORIxDEMO("\u0017`\u0005"));
        Cipher cipher = IiIIiIiiiI = Cipher.getInstance(IiIiIIiIII.ALLATORIxDEMO("~nl\u0004ZH}\u0004o`\\X*[^O[BQL"));
        cipher.init(5 >> 1, (Key)object);
        object = cipher.doFinal(byArray4);
        return new String((byte[])object, StandardCharsets.UTF_8);
    }

    private /* synthetic */ int ALLATORIxDEMO(Exception exception) {
        IIiIIiiiii iIiIIiiiii = exception2;
        Exception exception2 = exception;
        IIiIIiiiii IiIIiIiiiI = iIiIIiiiii;
        if (exception2.getMessage() != null) {
            return exception2.getMessage().hashCode();
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ long ALLATORIxDEMO(byte[] byArray) {
        void IiIIiIiiiI;
        IIiIIiiiii iIiIIiiiii = this;
        long l = 0L;
        int n = this = 3 & 4;
        while (n < ((void)IiIIiIiiiI).length) {
            long l2 = IiIIiIiiiI[this] & (0x76FF & 0x9FF);
            long l3 = (long)Math.pow(31.0, ((void)IiIIiIiiiI).length - (3 & 5) - this);
            l += l2 * l3;
            n = ++this;
        }
        return l;
    }

    public IIiIIiiiii(String string) {
        IIiIIiiiii iIiIIiiiii = string2;
        String string2 = string;
        IIiIIiiiii IiIIiIiiiI = iIiIIiiiii;
        IiIIiIiiiI.IiIiIIIIiI = IIiIIiiiii.ALLATORIxDEMO(string2.getBytes(StandardCharsets.UTF_8));
        IiIIiIiiiI.iiIIIIiIII = System.currentTimeMillis();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiIiIIiIII.ALLATORIxDEMO("H`=-LN\u001f^oo^_Z\n?\u8bfc\u66eb\u65bb\u522f\u670b\u65af\u7243\u6733\uff0a"));
        }
    }

    private static /* synthetic */ byte[] IiiiiiiIIi(String IiIIiIiiiI) {
        return Base64.getDecoder().decode(IiIIiIiiiI);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ byte[] ALLATORIxDEMO(String string) {
        IIiIIiiiii iIiIIiiiii = object2;
        try {
            void IiIIiIiiiI;
            Object object;
            Object object2;
            byte[] byArray;
            Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
            String string2 = "";
            if (enumeration.hasMoreElements() && (byArray = enumeration.nextElement().getHardwareAddress()) != null) {
                int n;
                object2 = new StringBuilder();
                object = byArray;
                int n2 = byArray.length;
                int n3 = n = 3 >> 2;
                while (n3 < n2) {
                    byte by = object[n];
                    Object[] objectArray = new Object[3 >> 1];
                    objectArray[3 >> 2] = by;
                    ((StringBuilder)object2).append(String.format(iiIiiIIIiI.ALLATORIxDEMO("\u0000f\u0017\u000e"), objectArray));
                    n3 = ++n;
                }
                string2 = ((StringBuilder)object2).toString();
            }
            int n = Runtime.getRuntime().availableProcessors();
            object2 = ManagementFactory.getRuntimeMXBean().getInputArguments().stream().collect(Collectors.joining());
            String string3 = string2 + ":" + n + ":" + (String)object2 + ":" + (String)IiIIiIiiiI;
            object = string3;
            return IIiIIiiiii.ALLATORIxDEMO(string3).getBytes();
        } catch (Exception exception) {
            return iiiiiIIiiI;
        }
    }

    private static /* synthetic */ String ALLATORIxDEMO(String string) {
        String string2 = string;
        try {
            int n;
            MessageDigest messageDigest = MessageDigest.getInstance(IiIiIIiIII.ALLATORIxDEMO("XWJ29*="));
            byte[] byArray = messageDigest.digest(string2.getBytes(StandardCharsets.UTF_8));
            CharSequence IiIIiIiiiI = new StringBuilder();
            int n2 = byArray.length;
            int n3 = n = 3 & 4;
            while (n3 < n2) {
                byte by = byArray[n];
                String string3 = Integer.toHexString(0x11FF & 0x6EFF & by);
                if (string3.length() == --1) {
                    ((StringBuilder)IiIIiIiiiI).append((char)(0x72 & 0x3D));
                }
                ((StringBuilder)IiIIiIiiiI).append(string3);
                n3 = ++n;
            }
            return ((StringBuilder)IiIIiIiiiI).toString();
        } catch (Exception exception) {
            throw new RuntimeException(iiIiiIIIiI.ALLATORIxDEMO("M\u0017v\u001eL8BvC7L:@2"), exception);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(String string, String string2, int n) throws Exception {
        void IiIIiIiiiI;
        byte[] IiIIiIiiiI2;
        void IiIIiIiiiI3;
        IIiIIiiiii iIiIIiiiii = hashMap;
        if (IiIIiIiiiI3 > --5) {
            throw new StackOverflowError(iiIiiIIIiI.ALLATORIxDEMO("\u0003K<\u0017}d\u0002`\u0012\u0005$`\u0015p\u0004V?J8\u0005:L;L\""));
        }
        IIiIIiiiii iIiIIiiiii2 = iIiIIiiiii;
        if (!iIiIIiiiii2.ALLATORIxDEMO(IiIIiIiiiI2 = iIiIIiiiii2.ALLATORIxDEMO((String)IiIIiIiiiI2))) {
            return (3 & 4) != 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IiIiIIiIII.ALLATORIxDEMO("|jsgzy"), iiIiiIIIiI.ALLATORIxDEMO("f>D?K\u0017"));
        hashMap.put(IiIiIIiIII.ALLATORIxDEMO("\u007fvfzxkjr{"), String.valueOf(System.nanoTime()));
        return iIiIIiiiii.ALLATORIxDEMO((String)IiIIiIiiiI, IiIIiIiiiI2, hashMap, (int)(IiIIiIiiiI3 + (2 ^ 3)));
    }
}

