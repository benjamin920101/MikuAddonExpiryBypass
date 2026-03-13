/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIiiiiIi;
import com.github.mikumiku.addon.auth.security.AuthenticationObfuscator;
import com.github.mikumiku.addon.iIIiiIIiii;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.NetworkInterface;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIIiiIIiI {
    private final List<String> iiIIiiIiii;
    private static final Pattern iIiiIiiiII;
    private volatile long iIIiiIIIII;
    private volatile boolean iiIiIIiIIi;
    private static final byte[] IIIIiIiiIi;
    private static final String IiIiIIIIiI = "X9#mK$pL@vN&qR*wE!tY^uI+oP";
    private static final Pattern iiiiiIIiiI;
    private final Map<String, Object> iiIIIIiIII;
    private final SecureRandom IiIIiIiiiI;
    private static final String[] ALLATORIxDEMO;

    private /* synthetic */ boolean IiiiiiiiII() {
        block5: {
            long l;
            block4: {
                boolean bl;
                try {
                    l = System.currentTimeMillis();
                    long l2 = this.iIIiiIIIII;
                    if (l2 <= 0L || l - l2 >= 1000L) break block4;
                    bl = false;
                } catch (Exception exception) {
                    return (3 & 4) != 0;
                }
                return bl;
            }
            if (this.ALLATORIxDEMO(l)) break block5;
            boolean bl = false;
            return bl;
        }
        boolean bl = true;
        return bl;
    }

    private /* synthetic */ Map<String, Object> IiiiiiiIIi(String string) {
        IiIIiiIIiI iiIIiiIIiI = string2;
        try {
            int n;
            String[] IiIIiIiiiI;
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            if (IiIIiIiiiI == null || !IiIIiIiiiI.startsWith(iIIiiIIiii.ALLATORIxDEMO("x")) || !IiIIiIiiiI.endsWith(IIiIiiiiIi.IiiiiiiIIi("Z"))) {
                return null;
            }
            int n2 = 2 ^ 3;
            IiIIiIiiiI = IiIIiIiiiI.substring(n2, IiIIiIiiiI.length() - n2).split(iIIiiIIiii.ALLATORIxDEMO("/"));
            int n3 = IiIIiIiiiI.length;
            int n4 = n = 3 >> 2;
            while (n4 < n3) {
                Object object = IiIIiIiiiI[n].split(IIiIiiiiIi.IiiiiiiIIi("\u001d"));
                if (((String[])object).length == 5 >> 1) {
                    object = object[3 ^ 3].trim().replace(iIIiiIIiii.ALLATORIxDEMO("!"), "");
                    String string2 = object[3 >> 1].trim().replace(IIiIiiiiIi.IiiiiiiIIi("\u0005"), "");
                    if (iIIiiIIiii.ALLATORIxDEMO("\"Q\u0003f").equals(string2) || "false".equals(string2)) {
                        hashMap.put((String)object, Boolean.parseBoolean(string2));
                    } else {
                        HashMap<String, Object> hashMap2 = hashMap;
                        if (string2.matches(IIiIiiiiIi.IiiiiiiIIi("[V\f"))) {
                            hashMap2.put((String)object, Long.parseLong(string2));
                        } else {
                            hashMap2.put((String)object, string2);
                        }
                    }
                }
                n4 = ++n;
            }
            return hashMap;
        } catch (Exception exception) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean IiiiiiiiII(String string, String string2) {
        void IiIIiIiiiI;
        IiIIiiIIiI IiIIiIiiiI2;
        block4: {
            boolean bl;
            IiIIiiIIiI iiIIiiIIiI = string3;
            String string3 = string2;
            IiIIiIiiiI2 = iiIIiiIIiI;
            try {
                if (IiIIiIiiiI != null && string3 != null) break block4;
                bl = false;
            } catch (Exception exception) {
                return (3 ^ 3) != 0;
            }
            return bl;
        }
        if (IiIIiIiiiI2.ALLATORIxDEMO((String)IiIIiIiiiI, string3) >= (0x57 & 0x7D)) {
            return (2 ^ 3) != 0;
        }
        boolean bl = false;
        return bl;
    }

    private /* synthetic */ String IIIIIIiIii() {
        try {
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            return dimension.width + "x" + dimension.height;
        } catch (Exception exception) {
            return null;
        }
    }

    private /* synthetic */ void iiIiiiiiII() {
        IiIIiiIIiI iiIIiiIIiI = this;
        try {
            long l = System.currentTimeMillis();
            IiIIiiIIiI iiIIiiIIiI2 = iiIIiiIIiI;
            iiIIiiIIiI.iiIIIIiIII.put(IIiIiiiiIi.IiiiiiiIIi("W`bqoWDYxfn_B"), l);
            boolean bl = iiIIiiIIiI2.iiIiiiiiII();
            iiIIiiIIiI2.iiIIIIiIII.put(iIIiiIIiii.ALLATORIxDEMO("\u001fm\u0002f1Q?W\u000f\\\u0005w7W\u0003p"), bl);
            bl = iiIIiiIIiI.IiiiiiiIIi();
            iiIIiiIIiI2.iiIIIIiIII.put(IIiIiiiiIi.IiiiiiiIIi("cWEG@ub`XVBFBqsWC"), bl);
            return;
        } catch (Exception exception) {
            return;
        }
    }

    private static /* synthetic */ String ALLATORIxDEMO(byte[] byArray) {
        int IiIIiIiiiI;
        byte[] byArray2 = byArray;
        StringBuilder stringBuilder = new StringBuilder();
        byte[] byArray3 = byArray2;
        int n = byArray2.length;
        int n2 = IiIIiIiiiI = 3 >> 2;
        while (n2 < n) {
            byte by = byArray3[IiIIiIiiiI];
            Object[] objectArray = new Object[3 >> 1];
            objectArray[2 & 5] = by;
            stringBuilder.append(String.format(iIIiiIIiii.ALLATORIxDEMO("s\u0013D["), objectArray));
            n2 = ++IiIIiIiiiI;
        }
        return stringBuilder.toString();
    }

    public boolean iIIiiiIiiI() {
        return this.iiIiIIiIIi;
    }

    private /* synthetic */ Map<String, Object> ALLATORIxDEMO(String string) {
        IiIIiiIIiI iiIIiiIIiI = iterator;
        Iterator iterator = string;
        IiIIiiIIiI IiIIiIiiiI = iiIIiiIIiI;
        try {
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            if (iterator == null || ((String)((Object)iterator)).trim().isEmpty()) {
                return null;
            }
            if (!((String)((Object)(iterator = ((String)((Object)iterator)).trim()))).startsWith(iIIiiIIiii.ALLATORIxDEMO("x")) || !((String)((Object)iterator)).endsWith(IIiIiiiiIi.IiiiiiiIIi("Z"))) {
                return null;
            }
            int n = --1;
            if (((String)((Object)(iterator = ((String)((Object)iterator)).substring(n, ((String)((Object)iterator)).length() - n).trim()))).isEmpty()) {
                return hashMap;
            }
            iterator = IiIIiIiiiI.ALLATORIxDEMO((String)((Object)iterator)).iterator();
            while (iterator.hasNext()) {
                Object object = (String[])iterator.next();
                object = IiIIiIiiiI.ALLATORIxDEMO((String)object);
                if (((String[])object).length != --2) continue;
                IiIIiiIIiI iiIIiiIIiI2 = IiIIiIiiiI;
                String string2 = iiIIiiIIiI2.iiIiiiiiII(object[5 >> 3]);
                object = iiIIiiIIiI2.ALLATORIxDEMO(object[--1].trim());
                hashMap.put(string2, object);
            }
            return hashMap;
        } catch (Exception exception) {
            System.err.println("JSON\u89e3\u6790\u9519\u8bef: " + exception.getMessage());
            return null;
        }
    }

    private /* synthetic */ boolean IIIIIIiIii(String string) {
        boolean bl;
        IiIIiiIIiI iiIIiiIIiI = string2;
        String string2 = string;
        IiIIiiIIiI IiIIiIiiiI = iiIIiiIIiI;
        try {
            long l = IiIIiIiiiI.ALLATORIxDEMO(string2);
            if (System.currentTimeMillis() - l < 86400000L) {
                return (3 & 5) != 0;
            }
            bl = false;
        } catch (Exception exception) {
            return 5 >> 3;
        }
        return bl;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(HttpResponse<String> httpResponse) {
        block13: {
            Object object;
            IiIIiiIIiI IiIIiIiiiI;
            block11: {
                Object object2;
                block12: {
                    block10: {
                        block9: {
                            block8: {
                                boolean bl;
                                IiIIiiIIiI iiIIiiIIiI = object3;
                                Object object3 = httpResponse;
                                IiIIiIiiiI = iiIIiiIIiI;
                                try {
                                    if (object3.statusCode() == (0x19CC & 0x66FB)) break block8;
                                    System.err.println("\u670d\u52a1\u5668\u8fd4\u56de\u9519\u8bef\u72b6\u6001\u7801: " + object3.statusCode());
                                    bl = false;
                                } catch (Exception this2) {
                                    System.err.println("\u89e3\u6790\u54cd\u5e94\u65f6\u53d1\u751f\u9519\u8bef: " + this2.getMessage());
                                    return (2 & 5) != 0;
                                }
                                return bl;
                            }
                            object3 = (String)object3.body();
                            if (object3 != null && !((String)object3).trim().isEmpty()) break block9;
                            System.err.println(IIiIiiiiIi.IiiiiiiIIi("\u673f\u5286\u565a\u8ff3\u56cc\u7a7d\u54ff\u5eb3"));
                            boolean bl = false;
                            return bl;
                        }
                        object = IiIIiIiiiI.ALLATORIxDEMO((String)object3);
                        if (object != null) break block10;
                        System.err.println(iIIiiIIiii.ALLATORIxDEMO("\u65c3\u6ca3\u89e0\u67e6\u670e\u52f7\u564b\u54bb\u5e97"));
                        boolean bl = false;
                        return bl;
                    }
                    object2 = object.get(IIiIiiiiIi.IiiiiiiIIi("TGDqbAT"));
                    if (!(object2 instanceof Boolean)) break block11;
                    boolean bl = (Boolean)object2;
                    if (!bl) break block12;
                    IiIIiIiiiI.ALLATORIxDEMO((Map<String, Object>)object);
                    boolean bl2 = true;
                    return bl2;
                }
                object2 = (String)object.get(iIIiiIIiii.ALLATORIxDEMO("n\u0013p%B\u0011f"));
                System.err.println("\u9a8c\u8bc1\u5931\u8d25: " + (object2 != null ? object2 : IIiIiiiiIi.IiiiiiiIIi("\u6738\u77e2\u952b\u8bc8")));
                boolean bl = false;
                return bl;
            }
            Object v = object.get(iIIiiIIiii.ALLATORIxDEMO("\u0005w7W\u0003p"));
            if (!IIiIiiiiIi.IiiiiiiIIi("TGDqbAT").equals(v) && !"ok".equals(v)) break block13;
            IiIIiIiiiI.ALLATORIxDEMO((Map<String, Object>)object);
            boolean bl = true;
            return bl;
        }
        boolean bl = false;
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ String iiIiiiiiII(String string, String string2) {
        IiIIiiIIiI iiIIiiIIiI = object;
        Object object = string;
        IiIIiiIIiI IiIIiIiiiI = iiIIiiIIiI;
        try {
            void IiIIiIiiiI2;
            object = (String)object + (String)IiIIiIiiiI2 + IiIiIIIIiI;
            return IiIIiiIIiI.ALLATORIxDEMO(MessageDigest.getInstance(IIiIiiiiIi.IiiiiiiIIi("tzf?5\u0007\u0011")).digest(((String)object).getBytes(StandardCharsets.UTF_8))).substring(3 ^ 3, 0x65 & 0x3A);
        } catch (Exception this2) {
            return iIIiiIIiii.ALLATORIxDEMO("\u0010b:O4B\u0015h\tp?D8B\u0002v$F");
        }
    }

    private /* synthetic */ boolean iIIiIIiIii(String string) {
        Object object;
        block3: {
            boolean bl;
            IiIIiiIIiI iiIIiiIIiI = object;
            object = string;
            IiIIiiIIiI IiIIiIiiiI = iiIIiiIIiI;
            try {
                if (((String)object).length() >= (0x75 & 0x1E)) break block3;
                bl = false;
            } catch (Exception exception) {
                return (3 & 4) != 0;
            }
            return bl;
        }
        String string2 = IiIIiiIIiI.ALLATORIxDEMO(MessageDigest.getInstance(iIIiiIIiii.ALLATORIxDEMO("P>B{\u0011C5")).digest(((String)object).getBytes(StandardCharsets.UTF_8))).substring(5 >> 3, 0x5D & 0x32);
        Object object2 = object;
        object = ((String)object2).substring(((String)object2).length() - (0x31 & 0x5E));
        return string2.equals(object);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ String[] ALLATORIxDEMO(String string) {
        int n;
        void IiIIiIiiiI;
        int n2;
        block8: {
            IiIIiiIIiI iiIIiiIIiI = this;
            n2 = -4 >> 2;
            int n3 = 3 ^ 3;
            int n4 = this = 3 ^ 3;
            while (n4 < IiIIiIiiiI.length()) {
                char c;
                block7: {
                    c = IiIIiIiiiI.charAt(this);
                    if (c == (0x37 & 0x6A)) {
                        if (this != 0) {
                            if (IiIIiIiiiI.charAt(this - (3 & 5)) == (0x7F & 0x5C)) break block7;
                        }
                        n3 = n3 == 0 ? 3 >> 1 : 0;
                    }
                }
                if (n3 == 0) {
                    if (c == (0x7F & 0x3A)) {
                        n = n2 = this;
                        break block8;
                    }
                }
                n4 = ++this;
            }
            n = n2;
        }
        if (n == -1) {
            String[] stringArray = new String[--1];
            stringArray[2 & 5] = IiIIiIiiiI;
            return stringArray;
        }
        String[] stringArray = new String[2];
        int n5 = 3 ^ 3;
        stringArray[n5] = IiIIiIiiiI.substring(n5, n2).trim();
        int n6 = 3 & 5;
        stringArray[n6] = IiIIiIiiiI.substring(n2 + n6).trim();
        return stringArray;
    }

    /*
     * WARNING - void declaration
     */
    public boolean IiIiiiIIiI(String string) {
        String string2;
        IiIIiiIIiI iiIIiiIIiI = string2;
        if (!iiIIiiIIiI.iiIiIIiIIi) {
            iiIIiiIIiI.IiiiiiiIIi();
        }
        try {
            void IiIIiIiiiI;
            IiIIiiIIiI iiIIiiIIiI2 = iiIIiiIIiI;
            String exception = iiIIiiIIiI2.IiiiiiiIIi();
            return iiIIiiIIiI2.IiiIIIIiiI((String)IiIIiIiiiI, exception);
        } catch (Exception exception) {
            boolean bl = 3 ^ 3;
            iiIIiiIIiI.ALLATORIxDEMO(bl);
            return bl;
        }
    }

    private /* synthetic */ long ALLATORIxDEMO(String string) {
        IiIIiiIIiI iiIIiiIIiI = string2;
        String string2 = string;
        IiIIiiIIiI IiIIiIiiiI = iiIIiiIIiI;
        try {
            int this_ = string2.hashCode();
            return System.currentTimeMillis() - (long)Math.abs(this_ % 86400000);
        } catch (Exception this_) {
            return System.currentTimeMillis();
        }
    }

    private /* synthetic */ boolean iiIiiiiiII() {
        block3: {
            boolean bl;
            IiIIiiIIiI iiIIiiIIiI = string;
            try {
                String string = System.getProperty(IIiIiiiiIi.IiiiiiiIIi("xfdf\u001cQWUan]I"));
                String string2 = System.getProperty(iIIiiIIiii.ALLATORIxDEMO("l\u0005-8B\u001bf"));
                if (!string.contains(IIiIiiiiIi.IiiiiiiIIi("CweG@")) && !string2.contains(iIIiiIIiii.ALLATORIxDEMO("\"F\u0005w"))) break block3;
                bl = false;
            } catch (Exception exception) {
                return 5 >> 3;
            }
            return bl;
        }
        boolean bl = true;
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public boolean iIIiiiIiiI(String string, String string2) {
        IiIIiiIIiI IiIIiIiiiI;
        block12: {
            block11: {
                void IiIIiIiiiI2;
                block10: {
                    block9: {
                        block8: {
                            boolean bl;
                            String string3;
                            String this_ = string2;
                            IiIIiIiiiI = string3;
                            if (!IiIIiIiiiI.iiIiIIiIIi) {
                                return (2 & 5) != 0;
                            }
                            try {
                                if (IiIIiIiiiI.iIIiiiIiiI((String)IiIIiIiiiI2)) break block8;
                                bl = false;
                            } catch (Exception exception) {
                                boolean bl2 = 5 >> 3;
                                IiIIiIiiiI.ALLATORIxDEMO(bl2);
                                return bl2;
                            }
                            return bl;
                        }
                        if (IiIIiIiiiI.ALLATORIxDEMO(this_)) break block9;
                        boolean bl = false;
                        return bl;
                    }
                    if (IiIIiIiiiI.IiiIIIIiiI()) break block10;
                    boolean bl = false;
                    return bl;
                }
                if (IiIIiIiiiI.IiiiiiiIIi((String)IiIIiIiiiI2, this_)) break block11;
                boolean bl = false;
                return bl;
            }
            if (IiIIiIiiiI.IiiiiiiiII()) break block12;
            boolean bl = false;
            return bl;
        }
        IiIIiIiiiI.ALLATORIxDEMO((2 ^ 3) != 0);
        IiIIiIiiiI.iIIiiIIIII = System.currentTimeMillis();
        boolean bl = true;
        return bl;
    }

    private /* synthetic */ String IiiIIIIiiI(String string, String string2) {
        IiIIiiIIiI iiIIiiIIiI = hashMap;
        HashMap<String, Object> hashMap = string;
        IiIIiiIIiI IiIIiIiiiI = iiIIiiIIiI;
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(0x7F & 0x64, 0x43F8 & 0x3FEF));
            HashMap<String, Object> hashMap2 = hashMap = new HashMap<String, Object>();
            hashMap.put(IIiIiiiiIi.IiiiiiiIIi("ASssGT"), iIIiiIIiii.ALLATORIxDEMO("p\u0003`5F\u0005p"));
            hashMap2.put(IIiIiiiiIi.IiiiiiiIIi("Qsk[C"), (2 ^ 3) != 0);
            hashMap.put(iIIiiIIiii.ALLATORIxDEMO("f\u000es?Q\u0013p"), System.currentTimeMillis() + 2592000000L);
            String[] stringArray = new String[--3];
            stringArray[3 & 4] = iIIiiIIiii.ALLATORIxDEMO("$F\u0017g");
            stringArray[3 & 5] = IIiIiiiiIi.IiiiiiiIIi("P`nFB");
            stringArray[1 ^ 3] = iIIiiIIiii.ALLATORIxDEMO("f\u000ef5V\u0002f");
            hashMap2.put(IIiIiiiiIi.IiiiiiiIIi("wwu_NAT{h\\T"), Arrays.asList(stringArray));
            hashMap.put(IIiIiiiiIi.IiiiiiiIIi("twuDB@xfn_B"), System.currentTimeMillis());
            return IiIIiIiiiI.ALLATORIxDEMO(hashMap);
        } catch (Exception this2) {
            return iIIiiIIiii.ALLATORIxDEMO("%\t(Z:Z%Vs\u001e3\u0001\u0004q9QT/Tu7O?GT9\u0010b:P\u0013~");
        }
    }

    public boolean IiiiiiiiII(String string) {
        boolean bl;
        IiIIiiIIiI iiIIiiIIiI = string2;
        String string2 = string;
        IiIIiiIIiI IiIIiIiiiI = iiIIiiIIiI;
        if (!IiIIiIiiiI.iiIiIIiIIi) {
            return 3 >> 2;
        }
        try {
            if (IiIIiIiiiI.ALLATORIxDEMO(string2) && IiIIiIiiiI.IiiIIIIiiI()) {
                return 3 >> 1;
            }
            bl = false;
        } catch (Exception exception) {
            return (3 ^ 3) != 0;
        }
        return bl;
    }

    public String iIIiIIiIii() {
        return (String)this.iiIIIIiIII.get(iIIiiIIiii.ALLATORIxDEMO(">T\u001fg"));
    }

    public Map<String, Object> IiiiiiiIIi() {
        return (Map)this.iiIIIIiIII.get(IIiIiiiiIi.IiiiiiiIIi("Qsk[CSS{h|X@BAW}iAB"));
    }

    private /* synthetic */ String iiIiiiiiII(String string) {
        IiIIiiIIiI iiIIiiIIiI = object;
        Object object = string;
        IiIIiiIIiI IiIIiIiiiI = iiIIiiIIiI;
        if (object == null) {
            return null;
        }
        if (((String)(object = ((String)object).trim())).startsWith(iIIiiIIiii.ALLATORIxDEMO("!")) && ((String)object).endsWith(IIiIiiiiIi.IiiiiiiIIi("\u0005"))) {
            Object object2 = object;
            return ((String)object2).substring(3 >> 1, ((String)object2).length() - --1);
        }
        return object;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean iiIiiiiiII(String string, String string2) {
        void IiIIiIiiiI;
        IiIIiiIIiI IiIIiIiiiI2;
        block4: {
            boolean bl;
            IiIIiiIIiI iiIIiiIIiI = string3;
            String string3 = string2;
            IiIIiIiiiI2 = iiIIiiIIiI;
            try {
                long l = (Long)IiIIiIiiiI2.iiIIIIiIII.getOrDefault(IIiIiiiiIi.IiiiiiiIIi("9!ASMh\\K[IwXdf^NVFfn]I"), 0L);
                long l2 = System.currentTimeMillis();
                long l3 = 604800000L;
                if (l2 - l <= l3) break block4;
                bl = false;
            } catch (Exception exception) {
                return (3 ^ 3) != 0;
            }
            return bl;
        }
        if (IiIIiIiiiI2.iIIiiiIiiI((String)IiIIiIiiiI) && IiIIiIiiiI2.ALLATORIxDEMO(string3)) {
            return (4 ^ 5) != 0;
        }
        boolean bl = false;
        return bl;
    }

    private /* synthetic */ boolean iIIiiiIiiI(String string) {
        IiIIiiIIiI IiIIiIiiiI;
        block7: {
            block6: {
                boolean bl;
                Object object;
                block9: {
                    block8: {
                        IiIIiiIIiI iiIIiiIIiI = object;
                        object = string;
                        IiIIiIiiiI = iiIIiiIIiI;
                        if (object == null) break block8;
                        if (((String)object).length() >= (0x3D & 0x52)) break block9;
                    }
                    return false;
                }
                try {
                    IiIIiiIIiI iiIIiiIIiI = IiIIiIiiiI;
                    object = iiIIiiIIiI.IiiIIIIiiI((String)object);
                    if (iiIIiiIIiI.iIIiIIiIii((String)object)) break block6;
                    bl = false;
                } catch (Exception this_) {
                    return 3 >> 2;
                }
                return bl;
            }
            if (IiIIiIiiiI.IIIIIIiIii((String)object)) break block7;
            boolean bl = false;
            return bl;
        }
        return IiIIiIiiiI.IiiiiiiIIi((String)object);
    }

    public Map<String, Object> ALLATORIxDEMO() {
        IiIIiiIIiI iiIIiiIIiI = hashMap;
        HashMap<String, Boolean> hashMap = new HashMap<String, Boolean>();
        Boolean bl = hashMap.put(IIiIiiiiIi.IiiiiiiIIi("n|nFNSK{}WC"), iiIIiiIIiI.iiIiIIiIIi);
        HashMap<String, Boolean> hashMap2 = hashMap;
        hashMap.put(iIIiiIIiii.ALLATORIxDEMO("o\u0017p\"| B\u001aj\u0012b\"J\u0019m"), (Boolean)((Object)Long.valueOf(iiIIiiIIiI.iIIiiIIIII)));
        hashMap2.put(IIiIiiiiIi.IiiiiiiIIi("DF^Nvffn]ImD}r\\S"), (Boolean)((Object)Integer.valueOf(iiIIiiIIiI.iiIIiiIiii.size())));
        hashMap.put(iIIiiIIiii.ALLATORIxDEMO(">T\u001fg"), (Boolean)iiIIiiIIiI.iiIIIIiIII.get(IIiIiiiiIi.IiiiiiiIIi("zp[C")));
        hashMap.put(iIIiiIIiii.ALLATORIxDEMO("N\u0017`"), (Boolean)iiIIiiIIiI.iiIIIIiIII.get(IIiIiiiiIi.IiiiiiiIIi("jSD")));
        hashMap.put(iIIiiIIiii.ALLATORIxDEMO("\u001fm\u0002f1Q?W\u000f\\\u0005w7W\u0003p"), (Boolean)iiIIiiIIiI.iiIIIIiIII.get(IIiIiiiiIi.IiiiiiiIIi("[IFBuu{sKxASssGT")));
        hashMap.put(iIIiiIIiii.ALLATORIxDEMO("G\u0013a\u0003d1F$|\u0012f\u0002f5W\u0013g"), (Boolean)iiIIiiIIiI.iiIIIIiIII.get(IIiIiiiiIi.IiiiiiiIIi("cWEG@ub`XVBFBqsWC")));
        return hashMap2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ String IiiiiiiIIi(String string, String string2) {
        IiIIiiIIiI iiIIiiIIiI = hashMap;
        try {
            void IiIIiIiiiI;
            void IiIIiIiiiI2;
            HashMap hashMap = new HashMap();
            void v0 = hashMap.put(iIIiiIIiii.ALLATORIxDEMO("w9H\u0013m"), IiIIiIiiiI2);
            HashMap hashMap2 = hashMap;
            hashMap.put(IIiIiiiiIi.IiiiiiiIIi("K[DwiAB"), IiIIiIiiiI);
            hashMap2.put(iIIiiIIiii.ALLATORIxDEMO(">T\u001fg"), iiIIiiIIiI.iiIIIIiIII.get(IIiIiiiiIi.IiiiiiiIIi("zp[C")));
            hashMap.put(iIIiiIIiii.ALLATORIxDEMO("W\u001fn\u0013p\"B\u001bs"), System.currentTimeMillis());
            hashMap.put(IIiIiiiiIi.IiiiiiiIIi("QWUan]I"), iIIiiIIiii.ALLATORIxDEMO("0x\u0014X1"));
            hashMap.put(IIiIiiiiIi.IiiiiiiIIi("t[@\\Ffr@B"), iiIIiiIIiI.iiIiiiiiII((String)IiIIiIiiiI2, (String)IiIIiIiiiI));
            return iiIIiiIIiI.ALLATORIxDEMO(hashMap2);
        } catch (Exception exception) {
            return iIIiiIIiii.ALLATORIxDEMO("\r~");
        }
    }

    private /* synthetic */ String IiiIIIIiiI(String string) {
        IiIIiiIIiI iiIIiiIIiI = object;
        try {
            byte[] IiIIiIiiiI;
            IiIIiIiiiI = Base64.getDecoder().decode((String)IiIIiIiiiI);
            Object object = Cipher.getInstance(iIIiiIIiii.ALLATORIxDEMO("7F\u0005\f3@4,\u0006h\u0015pCS\u0017g2J\u0018d"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(IIIIiIiiIi, IIiIiiiiIi.IiiiiiiIIi("Fwt"));
            Object object2 = object;
            ((Cipher)object2).init(--2, secretKeySpec);
            object = ((Cipher)object2).doFinal(IiIIiIiiiI);
            return new String((byte[])object, StandardCharsets.UTF_8);
        } catch (Exception IiIIiIiiiI) {
            return "DECRYPTED_TOKEN_" + System.currentTimeMillis();
        }
    }

    public static String IiIiiiIIiI() {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(System.getProperty(IIiIiiiiIi.IiiiiiiIIi("HA\t|f_B"), iIIiiIIiii.ALLATORIxDEMO("v\u0018h8L\u0001m")));
            stringBuilder.append(System.getProperty(IIiIiiiiIi.IiiiiiiIIi("}t\u001cQWUan]I"), iIIiiIIiii.ALLATORIxDEMO("v\u0018h8L\u0001m")));
            stringBuilder.append(System.getProperty(IIiIiiiiIi.IiiiiiiIIi("rAB@\t|f_B"), iIIiiIIiii.ALLATORIxDEMO("v\u0018h8L\u0001m")));
            stringBuilder.append(Runtime.getRuntime().availableProcessors());
            stringBuilder.append(System.getProperty(IIiIiiiiIi.IiiiiiiIIi("xfdf\u001cQWUan]I"), iIIiiIIiii.ALLATORIxDEMO("v\u0018h8L\u0001m")));
            return IiIIiiIIiI.ALLATORIxDEMO(MessageDigest.getInstance(IIiIiiiiIi.IiiiiiiIIi("tzf?5\u0007\u0011")).digest(stringBuilder.toString().getBytes(StandardCharsets.UTF_8))).substring(3 >> 2, 0x70 & 0x2F);
        } catch (Exception exception) {
            return "FALLBACK_HWID_" + System.currentTimeMillis();
        }
    }

    public void IiiIIIIiiI() {
        this.iiIIIIiIII.clear();
        this.iiIIiiIiii.clear();
        this.iIIiiIIIII = 0L;
    }

    private /* synthetic */ int ALLATORIxDEMO(String string) {
        IiIIiiIIiI iiIIiiIIiI = string2;
        String string2 = string;
        IiIIiiIIiI IiIIiIiiiI = iiIIiiIIiI;
        try {
            return Math.abs(string2.hashCode() % (0x2F & 0x5A));
        } catch (Exception exception) {
            return 5 >> 3;
        }
    }

    private /* synthetic */ boolean IiiIIIIiiI() {
        String string;
        IiIIiiIIiI iiIIiiIIiI;
        block3: {
            boolean bl;
            iiIIiiIIiI = string2;
            try {
                String string2 = IiIIiiIIiI.IiIiiiIIiI();
                string = (String)iiIIiiIIiI.iiIIIIiIII.get(iIIiiIIiii.ALLATORIxDEMO(">T\u001fg"));
                if (string != null) break block3;
                bl = false;
            } catch (Exception this_) {
                return 5 >> 3;
            }
            return bl;
        }
        return iiIIiiIIiI.IiiiiiiiII(string2, string);
    }

    static {
        String[] stringArray = new String[--3];
        stringArray[5 >> 3] = IIiIiiiiIi.IiiiiiiIIi("odq~h,,=feqf5&%yzmo2f}bpn&%\u001cD}j\u001dFBN=q (DF^NvfFB");
        stringArray[--1] = iIIiiIIiii.ALLATORIxDEMO("W&S&Pn\u000eeIt\u00167M2M:Z9J?\na\u0016\u0013n?V\u001b.\u0017v\"KxM\u0013wY`>F\u0015h");
        stringArray[5 >> 1] = IIiIiiiiIi.IiiiiiiIIi("xqzke9=(|lm~;3\u007f!zdkofqgi&%\u001fTwdGU[Sk)}uU\bDB`nT^");
        ALLATORIxDEMO = stringArray;
        byte[] byArray = new byte[0x55 & 0x3A];
        byArray[3 ^ 3] = 0x5A & 0x6F;
        byArray[3 >> 1] = 0x7B & 0x7F;
        byArray[--2] = 0x7C & 0x2F;
        byArray[--3] = 0x1F & 0x7D;
        byArray[--4] = 0x7F & 0x1E;
        byArray[--5] = 0x7F & 0x3F;
        byArray[0x56 & 0x2F] = 0x7A & 0x3F;
        byArray[7 & 0x7F] = 0x6F & 0x7B;
        byArray[0x5F & 0x28] = 0x5D & 0x7E;
        byArray[0x7B & 0xD] = 0xF & 0x7D;
        byArray[0xF & 0x7A] = 0x7E & 0x7F;
        byArray[0x7F & 0xB] = 0x6F & 0x5F;
        byArray[0x7D & 0xE] = 0x6A & 0x3F;
        byArray[0x2D & 0x5F] = 0x6B & 0x3F;
        byArray[0xE & 0x7F] = 0x6F & 0x5C;
        byArray[0x5F & 0x2F] = 0x1F & 0x7D;
        IIIIiIiiIi = byArray;
        iiiiiIIiiI = Pattern.compile(iIIiiIIiii.ALLATORIxDEMO("(X\u0017\u000e\u0010\u0013[:+xe\u0011\u000b'"));
        iIiiIiiiII = Pattern.compile(IIiIiiiiIi.IiiiiiiIIi("E}\u001b*\"&K2LIz'}\u000ez\u001fz;|\u0007Z\u001a|\"*+F\u001fao\\ z\u001b\u0003"));
    }

    private /* synthetic */ void ALLATORIxDEMO(Map<String, Object> map) {
        IiIIiiIIiI iiIIiiIIiI = object;
        Object object = map;
        IiIIiiIIiI IiIIiIiiiI = iiIIiiIIiI;
        try {
            IiIIiIiiiI.iiIIIIiIII.put(IIiIiiiiIi.IiiiiiiIIi("9!ASMh\\K[IwXdf^NVFfn]I"), System.currentTimeMillis());
            IiIIiIiiiI.iiIIIIiIII.put(iIIiiIIiii.ALLATORIxDEMO("u7O\u001fg\u0017w?L8|\u0004f\u0005s9M\u0005f"), object);
            IiIIiIiiiI.ALLATORIxDEMO(5 >> 2);
            Object v = object.get(IIiIiiiiIi.IiiiiiiIIi("BJW{uWT"));
            if (v != null) {
                IiIIiIiiiI.iiIIIIiIII.put(iIIiiIIiii.ALLATORIxDEMO("o\u001f`3M%F)f\u000es?Q\u0013p"), v);
            }
            if ((object = object.get(IIiIiiiiIi.IiiiiiiIIi("gtWU"))) != null) {
                IiIIiIiiiI.iiIIIIiIII.put(iIIiiIIiii.ALLATORIxDEMO("V\u0005f\u0004\\?M\u0010l"), object);
                return;
            }
        } catch (Exception exception) {
            // empty catch block
        }
    }

    private /* synthetic */ boolean IiiiiiiIIi() {
        boolean bl;
        IiIIiiIIiI iiIIiiIIiI = this;
        try {
            int n;
            long l = System.nanoTime();
            int n2 = 3 >> 2;
            int n3 = n = 3 ^ 3;
            while (true) {
                if (n3 >= 1000) break;
                int n4 = n++;
                n2 += n4 * n4;
                n3 = n;
            }
            long l2 = System.nanoTime();
            if (l2 - l > 10000000L) {
                return 5 >> 2;
            }
            bl = false;
        } catch (Exception exception) {
            return (3 & 4) != 0;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ String ALLATORIxDEMO(String string, String string2) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IiIIiiIIiI iiIIiiIIiI = hashMap;
        try {
            HashMap<String, void> hashMap = new HashMap<String, void>();
            hashMap.put(IIiIiiiiIi.IiiiiiiIIi("lW^"), IiIIiIiiiI2);
            hashMap.put(iIIiiIIiii.ALLATORIxDEMO(">T\u001fg"), IiIIiIiiiI);
            hashMap.put(IIiIiiiiIi.IiiiiiiIIi("s[JWTff_W"), (void)String.valueOf(System.currentTimeMillis()));
            StringBuilder stringBuilder = new StringBuilder(iIIiiIIiii.ALLATORIxDEMO("x"));
            int n = 5 >> 2;
            Iterator iterator = hashMap.entrySet().iterator();
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                Map.Entry entry = iterator.next();
                if (n == 0) {
                    stringBuilder.append(IIiIiiiiIi.IiiiiiiIIi("\u000b"));
                }
                stringBuilder.append(iIIiiIIiii.ALLATORIxDEMO("!")).append((String)entry.getKey()).append(IIiIiiiiIi.IiiiiiiIIi("\u0010\u001d")).append(iIIiiIIiii.ALLATORIxDEMO("!")).append((String)entry.getValue()).append(IIiIiiiiIi.IiiiiiiIIi("\u0005"));
                n = 2 & 5;
                iterator2 = iterator;
            }
            StringBuilder stringBuilder2 = stringBuilder;
            stringBuilder2.append(iIIiiIIiii.ALLATORIxDEMO("~"));
            return stringBuilder2.toString();
        } catch (Exception exception) {
            return "{\"key\":\"" + (String)IiIIiIiiiI2 + "\",\"hwid\":\"" + (String)IiIIiIiiiI + "\"}";
        }
    }

    private /* synthetic */ Object ALLATORIxDEMO(String string) {
        IiIIiiIIiI iiIIiiIIiI = object;
        Object object = string;
        IiIIiiIIiI IiIIiIiiiI = iiIIiiIIiI;
        if (object == null) {
            return null;
        }
        if ("null".equals(object = ((String)object).trim())) {
            return null;
        }
        if (iIIiiIIiii.ALLATORIxDEMO("\"Q\u0003f").equals(object)) {
            return --1 != 0;
        }
        if ("false".equals(object)) {
            return 5 >> 3;
        }
        if (((String)object).matches(IIiIiiiiIi.IiiiiiiIIi("\n-[V\f"))) {
            try {
                return Long.parseLong((String)object);
            } catch (NumberFormatException numberFormatException) {}
        }
        if (((String)object).matches(iIIiiIIiii.ALLATORIxDEMO("{\u001c*g]_x\u007f\u0012("))) {
            try {
                return Double.parseDouble((String)object);
            } catch (NumberFormatException numberFormatException) {}
        }
        if (((String)object).startsWith(IIiIiiiiIi.IiiiiiiIIi("\u0005")) && ((String)object).endsWith(iIIiiIIiii.ALLATORIxDEMO("!"))) {
            Object object2 = object;
            return ((String)object2).substring(3 & 5, ((String)object2).length() - --1);
        }
        return object;
    }

    private /* synthetic */ AuthenticationObfuscator.LicenseStatus ALLATORIxDEMO(String string) {
        IiIIiiIIiI iiIIiiIIiI = string2;
        String string2 = string;
        IiIIiiIIiI IiIIiIiiiI = iiIIiiIIiI;
        try {
            int this_ = Math.abs(string2.hashCode()) % AuthenticationObfuscator.LicenseStatus.values().length;
            if (this_ <= --4) {
                return AuthenticationObfuscator.LicenseStatus.iIIiiIIIII;
            }
            return AuthenticationObfuscator.LicenseStatus.values()[this_];
        } catch (Exception exception) {
            return AuthenticationObfuscator.LicenseStatus.iiIiIIiIIi;
        }
    }

    private /* synthetic */ String IiiiiiiiII() {
        IiIIiiIIiI iiIIiiIIiI = this;
        try {
            int n = ThreadLocalRandom.current().nextInt(ALLATORIxDEMO.length);
            String string = ALLATORIxDEMO[n];
            if (iiIIiiIIiI.iiIiiiiiII(string)) {
                return string;
            }
            return ALLATORIxDEMO[(n + (3 >> 1)) % ALLATORIxDEMO.length];
        } catch (Exception n) {
            return ALLATORIxDEMO[2 & 5];
        }
    }

    private /* synthetic */ boolean IiiIIIIiiI(String string, String string2) {
        IiIIiiIIiI iiIIiiIIiI = object;
        Object object = string;
        IiIIiiIIiI IiIIiIiiiI = iiIIiiIIiI;
        HttpClient httpClient = null;
        try {
            HttpRequest IiIIiIiiiI2;
            httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10L)).build();
            IiIIiiIIiI iiIIiiIIiI2 = IiIIiIiiiI;
            object = iiIIiiIIiI2.ALLATORIxDEMO((String)object, (String)((Object)IiIIiIiiiI2));
            IiIIiIiiiI2 = HttpRequest.newBuilder().uri(URI.create(iIIiiIIiii.ALLATORIxDEMO("<U>Ob^q\u0004:[/A?U4JiJ\u0001l$H\u0013q\u0005-2F \f\u0017s\u001f,7V\u0002k"))).header(IIiIiiiiIi.IiiiiiiIIi("Qh|sWIF\nF~BB"), iIIiiIIiii.ALLATORIxDEMO("\u0017s\u0006o?@7W\u001fl\u0018,<P\u0019m")).header(IIiIiiiiIi.IiiiiiiIIi("GtWU\u001ffub\\S"), iIIiiIIiii.ALLATORIxDEMO("\u0017V\u0002l9s3M\u0006O\u0003d\u001fmy\u0012X3")).POST(HttpRequest.BodyPublishers.ofString((String)object)).timeout(Duration.ofSeconds(30L)).build();
            return iiIIiiIIiI2.ALLATORIxDEMO(httpClient.send(IiIIiIiiiI2, HttpResponse.BodyHandlers.ofString()));
        } catch (Exception this2) {
            System.err.println("\u9a8c\u8bc1\u8bf7\u6c42\u5931\u8d25: " + this2.getMessage());
            return (3 ^ 3) != 0;
        }
    }

    private /* synthetic */ void IiiiiiiIIi() {
        IiIIiiIIiI iiIIiiIIiI = string;
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(0x6E & 0x75, 0x69F5 & 0x17FE));
            String string = IiIIiiIIiI.IiIiiiIIiI();
            IiIIiiIIiI iiIIiiIIiI2 = iiIIiiIIiI;
            iiIIiiIIiI.iiIIIIiIII.put(iIIiiIIiii.ALLATORIxDEMO(">T\u001fg"), string);
            String string2 = iiIIiiIIiI2.ALLATORIxDEMO();
            iiIIiiIIiI2.iiIIIIiIII.put(IIiIiiiiIi.IiiiiiiIIi("jSD"), string2);
            long l = System.currentTimeMillis();
            iiIIiiIIiI.iiIIIIiIII.put(iIIiiIIiii.ALLATORIxDEMO("J\u0018j\u0002\\\"J\u001bf"), l);
            iiIIiiIIiI.iiIiiiiiII();
            iiIIiiIIiI2.iiIiIIiIIi = 5 >> 2;
            return;
        } catch (Exception exception) {
            return;
        }
    }

    private /* synthetic */ String iIIiiiIiiI() {
        IiIIiiIIiI iiIIiiIIiI = string;
        try {
            String string = System.getProperty(IIiIiiiiIi.IiiiiiiIIi("HA\t|f_B"), "").toLowerCase();
            if (string.contains(iIIiiIIiii.ALLATORIxDEMO("t\u001fm2L\u0001p"))) {
                return iiIIiiIIiI.ALLATORIxDEMO(IIiIiiiiIi.IiiiiiiIIi("ghgxu$s|tnmcbd5g04\u0012Twu[F^Igjpb@\u0007\u001dQskGB"));
            }
            if (string.contains(iIIiiIIiii.ALLATORIxDEMO("o?M\u0003{"))) {
                return iiIIiiIIiI.ALLATORIxDEMO(IIiIiiiiIi.IiiiiiiIIi("^TPKy'?i]\u0007ab@Nsk"));
            }
        } catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    private /* synthetic */ String iiIiiiiiII() {
        IiIIiiIIiI iiIIiiIIiI = string;
        try {
            String string = System.getProperty(iIIiiIIiii.ALLATORIxDEMO("l\u0005-8B\u001bf"), "").toLowerCase();
            if (string.contains(IIiIiiiiIi.IiiiiiiIIi("P[IvhET"))) {
                return iiIIiiIIiI.ALLATORIxDEMO(iIIiiIIiii.ALLATORIxDEMO(",C2MpF\"Tc\u000b\u0012v5WVd\u0013wvV#J\u0012#Yu7O\u0003f"));
            }
            if (string.contains(IIiIiiiiIi.IiiiiiiIIi("K{iG_"))) {
                return iiIIiiIIiI.ALLATORIxDEMO(iIIiiIIiii.ALLATORIxDEMO("r\u0005*\u000bt]\"]\u007fF=Eb\u0017Yg;JYj\u0012,&Q9G\u0003`\u0002\\#V\u001fg"));
            }
            if (string.contains(IIiIiiiiIi.IiiiiiiIIi("jSD"))) {
                return iiIIiiIIiI.ALLATORIxDEMO(iIIiiIIiii.ALLATORIxDEMO("V2Zt\u0003r\n$Ge\u0001g\\rn\u0019s8@>Y~\u00163n#^>\\$a4Rx\u0007\u0013#*\u0003\u0011q\u0013sv\u000e\u0013\u0003Q+#V\u001fg_$"));
            }
        } catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    public IiIIiiIIiI() {
        IiIIiiIIiI iiIIiiIIiI = this;
        iiIIiiIIiI.iiIiIIiIIi = 2 & 5;
        iiIIiiIIiI.iIIiiIIIII = 0L;
        IiIIiiIIiI iiIIiiIIiI2 = this;
        this.IiIIiIiiiI = new SecureRandom();
        IiIIiiIIiI iiIIiiIIiI3 = this;
        iiIIiiIIiI2.iiIIIIiIII = new HashMap<String, Object>();
        IiIIiiIIiI iiIIiiIIiI4 = this;
        this.iiIIiiIiii = new ArrayList<String>();
        this.IiiiiiiIIi();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiIiiiiIi.IiiiiiiIIi("El0!AB2rBCSSw&2\u8bf0\u66c6\u6597\u5202\u6727\u65a2\u724f\u671e\uff26"));
        }
    }

    private /* synthetic */ String IiiIIIIiiI() {
        IiIIiiIIiI iiIIiiIIiI = object;
        try {
            Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
            while (enumeration.hasMoreElements()) {
                int n;
                byte[] byArray = enumeration.nextElement().getHardwareAddress();
                Object object = byArray;
                if (byArray == null || ((Object)object).length <= 0) continue;
                StringBuilder stringBuilder = new StringBuilder();
                int n2 = ((Object)object).length;
                int n3 = n = 3 >> 2;
                while (n3 < n2) {
                    Object object2 = object[n];
                    Object[] objectArray = new Object[3 >> 1];
                    objectArray[3 >> 2] = (byte)object2;
                    stringBuilder.append(String.format(IIiIiiiiIi.IiiiiiiIIi("77\u0000\u007f"), objectArray));
                    n3 = ++n;
                }
                return stringBuilder.toString();
            }
        } catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    private /* synthetic */ String IiiiiiiIIi() {
        IiIIiiIIiI iiIIiiIIiI = stringBuilder;
        try {
            int n;
            Object object;
            String string;
            String string2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Runtime.getRuntime().availableProcessors());
            stringBuilder.append(Runtime.getRuntime().maxMemory());
            stringBuilder.append(System.getProperty(iIIiiIIiii.ALLATORIxDEMO("l\u0005-7Q\u0015k"), ""));
            String string3 = iiIIiiIIiI.IiiIIIIiiI();
            if (string3 != null) {
                stringBuilder.append(string3);
            }
            if ((string2 = iiIIiiIIiI.iiIiiiiiII()) != null) {
                stringBuilder.append(string2);
            }
            if ((string = iiIIiiIIiI.IIIIIIiIii()) != null) {
                stringBuilder.append(string);
            }
            if ((object = iiIIiiIIiI.iIIiiiIiiI()) != null) {
                stringBuilder.append((String)object);
            }
            if (stringBuilder.length() < (0x1E & 0x75)) {
                stringBuilder.append(IIiIiiiiIi.IiiiiiiIIi("J[I{jskMOex")).append(System.currentTimeMillis() % 1000000L);
            }
            object = MessageDigest.getInstance(iIIiiIIiii.ALLATORIxDEMO("P>B{\u0011C5")).digest(stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
            StringBuilder stringBuilder2 = new StringBuilder();
            int n2 = ((Object)object).length;
            int n3 = n = 3 & 4;
            while (n3 < n2) {
                Object object2 = object[n];
                String string4 = Integer.toHexString(0x57FF & 0x28FF & object2);
                if (string4.length() == --1) {
                    stringBuilder2.append((char)(0x3C & 0x73));
                }
                stringBuilder2.append(string4);
                n3 = ++n;
            }
            return stringBuilder2.toString().toUpperCase();
        } catch (Exception exception) {
            long l = Runtime.getRuntime().maxMemory();
            int n = Runtime.getRuntime().availableProcessors();
            return "HW_BACKUP_" + Long.toHexString(l + (long)n).toUpperCase();
        }
    }

    private /* synthetic */ String IiiiiiiIIi(String string) {
        IiIIiiIIiI iiIIiiIIiI = object;
        Object object = string;
        IiIIiiIIiI IiIIiIiiiI = iiIIiiIIiI;
        try {
            int n;
            object = ((String)object).replace(IIiIiiiiIi.IiiiiiiIIi("\n"), "");
            int n2 = 5 >> 3;
            int n3 = n = 3 ^ 3;
            while (n3 < ((String)object).length()) {
                char c = ((String)object).charAt(n);
                int n4 = n + (3 >> 1);
                n2 += c * n4;
                n3 = ++n;
            }
            Object[] objectArray = new Object[3 & 5];
            objectArray[3 & 4] = n2;
            return String.format(iIIiiIIiii.ALLATORIxDEMO("s\u0013N["), objectArray);
        } catch (Exception this2) {
            return IIiIiiiiIi.IiiiiiiIIi("\u0002\u0017\u0002\u0017\"7\u0002\u0017");
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean IiiiiiiIIi(String string, String string2) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IiIIiiIIiI iiIIiiIIiI = string3;
        try {
            IiIIiiIIiI iiIIiiIIiI2 = iiIIiiIIiI;
            String string3 = iiIIiiIIiI2.IiiiiiiiII();
            String string4 = iiIIiiIIiI2.IiiiiiiIIi((String)IiIIiIiiiI2, (String)IiIIiIiiiI);
            return iiIIiiIIiI2.IiiIIIIiiI(iiIIiiIIiI2.IiiIIIIiiI(string3, string4));
        } catch (Exception exception) {
            return iiIIiiIIiI.iiIiiiiiII((String)IiIIiIiiiI2, (String)IiIIiIiiiI);
        }
    }

    private /* synthetic */ String ALLATORIxDEMO(String string) {
        IiIIiiIIiI iiIIiiIIiI = this;
        try {
            String[] stringArray;
            Process IiIIiIiiiI;
            IiIIiIiiiI = Runtime.getRuntime().exec((String)((Object)IiIIiIiiiI));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(IiIIiIiiiI.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            block2: while (true) {
                BufferedReader bufferedReader2 = bufferedReader;
                while ((this = bufferedReader2.readLine()) != null) {
                    if (((String)(this = ((String)this).trim())).isEmpty()) continue block2;
                    if (((String)this).contains(iIIiiIIiii.ALLATORIxDEMO(">"))) {
                        stringArray = ((String)this).split(IIiIiiiiIi.IiiiiiiIIi("\u001a"), 1 ^ 3);
                        if (stringArray.length <= (3 & 5)) continue block2;
                        if (stringArray[--1].trim().isEmpty()) continue block2;
                        stringBuilder.append(stringArray[3 & 5].trim());
                        continue block2;
                    }
                    stringBuilder.append((String)this);
                    bufferedReader2 = bufferedReader;
                }
                break;
            }
            IiIIiIiiiI.waitFor();
            stringArray = stringBuilder.toString();
            if (stringArray.isEmpty()) {
                return null;
            }
            return stringArray;
        } catch (Exception IiIIiIiiiI) {
            return null;
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO(long IiIIiIiiiI) {
        boolean bl;
        try {
            long l = 1577836800000L;
            long l2 = System.currentTimeMillis() + 31536000000L;
            if (IiIIiIiiiI >= l && IiIIiIiiiI <= l2) {
                return 5 >> 2;
            }
            bl = false;
        } catch (Exception exception) {
            return (2 & 5) != 0;
        }
        return bl;
    }

    private /* synthetic */ boolean iiIiiiiiII(String string) {
        boolean bl;
        IiIIiiIIiI iiIIiiIIiI = string2;
        String string2 = string;
        IiIIiiIIiI IiIIiIiiiI = iiIIiiIIiI;
        try {
            if (Math.abs(string2.hashCode() % (0x2E & 0x5B)) > --2) {
                return (4 ^ 5) != 0;
            }
            bl = false;
        } catch (Exception exception) {
            return (2 & 5) != 0;
        }
        return bl;
    }

    private /* synthetic */ String ALLATORIxDEMO() {
        IiIIiiIIiI iiIIiiIIiI = object;
        try {
            int n;
            Object object = new byte[6];
            iiIIiiIIiI.IiIIiIiiiI.nextBytes((byte[])object);
            StringBuilder stringBuilder = new StringBuilder();
            int n2 = n = 5 >> 3;
            while (n2 < ((Object)object).length) {
                Object[] objectArray = new Object[--1];
                objectArray[2 & 5] = (byte)object[n];
                stringBuilder.append(String.format(iIIiiIIiii.ALLATORIxDEMO("s\u0013D["), objectArray));
                if (n < ((Object)object).length - --1) {
                    stringBuilder.append(IIiIiiiiIi.IiiiiiiIIi("\u001d"));
                }
                n2 = ++n;
            }
            return stringBuilder.toString();
        } catch (Exception exception) {
            return iIIiiIIiii.ALLATORIxDEMO("\u0013F9F3l\u0013f\u0019F3L3f\u0019F3");
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int ALLATORIxDEMO(String string, String string2) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        block5: {
            IiIIiiIIiI iiIIiiIIiI = this;
            if (IiIIiIiiiI2 != null && IiIIiIiiiI != null) break block5;
            int n = 0;
            return n;
        }
        try {
            int n = 0;
            int n2 = Math.min(IiIIiIiiiI2.length(), IiIIiIiiiI.length());
            int n3 = this = 3 ^ 3;
            while (n3 < n2) {
                if (IiIIiIiiiI2.charAt(this) == IiIIiIiiiI.charAt(this)) {
                    ++n;
                }
                n3 = ++this;
            }
            return n * (0x74 & 0x6F) / Math.max(IiIIiIiiiI2.length(), IiIIiIiiiI.length());
        } catch (Exception exception) {
            return 3 & 4;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(String string, String string2) {
        IiIIiiIIiI iiIIiiIIiI = string3;
        String string3 = string2;
        IiIIiiIIiI IiIIiIiiiI = iiIIiiIIiI;
        try {
            void IiIIiIiiiI2;
            return IiIIiIiiiI.IiiiiiiIIi((String)IiIIiIiiiI2).equals(string3);
        } catch (Exception exception) {
            return (3 ^ 3) != 0;
        }
    }

    private /* synthetic */ boolean IiiIIIIiiI(String string) {
        block9: {
            Object object;
            Map<String, Object> IiIIiIiiiI2;
            block8: {
                block7: {
                    block6: {
                        boolean bl;
                        IiIIiiIIiI iiIIiiIIiI = object;
                        try {
                            IiIIiIiiiI2 = iiIIiiIIiI.IiiiiiiIIi((String)((Object)IiIIiIiiiI2));
                            if (IiIIiIiiiI2 != null) break block6;
                            bl = false;
                        } catch (Exception IiIIiIiiiI2) {
                            return (2 & 5) != 0;
                        }
                        return bl;
                    }
                    object = (String)IiIIiIiiiI2.get(IIiIiiiiIi.IiiiiiiIIi("ASssGT"));
                    if (iIIiiIIiii.ALLATORIxDEMO("p\u0003`5F\u0005p").equals(object)) break block7;
                    boolean bl = false;
                    return bl;
                }
                object = (Boolean)IiIIiIiiiI2.get(IIiIiiiiIi.IiiiiiiIIi("Qsk[C"));
                if (object != null && ((Boolean)object).booleanValue()) break block8;
                boolean bl = false;
                return bl;
            }
            object = (Long)IiIIiIiiiI2.get(iIIiiIIiii.ALLATORIxDEMO("f\u000es?Q\u0013p"));
            if (object != null && (Long)object >= System.currentTimeMillis()) break block9;
            boolean bl = false;
            return bl;
        }
        boolean bl = true;
        return bl;
    }

    private /* synthetic */ boolean IiiiiiiIIi(String string) {
        boolean bl;
        IiIIiiIIiI iiIIiiIIiI = string2;
        String string2 = string;
        IiIIiiIIiI IiIIiIiiiI = iiIIiiIIiI;
        try {
            if (IiIIiIiiiI.ALLATORIxDEMO(string2) >= --3) {
                return (3 & 5) != 0;
            }
            bl = false;
        } catch (Exception exception) {
            return (3 ^ 3) != 0;
        }
        return bl;
    }

    private /* synthetic */ void ALLATORIxDEMO(boolean bl) {
        boolean bl22 = bl;
        IiIIiiIIiI IiIIiIiiiI = this;
        try {
            String bl22 = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + " - " + (bl22 ? iIIiiIIiii.ALLATORIxDEMO("P#@\u0015f%P") : IIiIiiiiIi.IiiiiiiIIi("asn^R`b"));
            IiIIiiIIiI iiIIiiIIiI = IiIIiIiiiI;
            iiIIiiIIiI.iiIIiiIiii.add(bl22);
            if (iiIIiiIIiI.iiIIiiIiii.size() > (0x7E & 0x65)) {
                IiIIiIiiiI.iiIIiiIiii.remove(5 >> 3);
                return;
            }
        } catch (Exception exception) {}
    }

    private /* synthetic */ String ALLATORIxDEMO(Map<String, Object> map) {
        IiIIiiIIiI iiIIiiIIiI = stringBuilder;
        try {
            Iterator IiIIiIiiiI;
            StringBuilder stringBuilder = new StringBuilder(IIiIiiiiIi.IiiiiiiIIi("\\"));
            int n = 2 ^ 3;
            Iterator iterator = IiIIiIiiiI = IiIIiIiiiI.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = IiIIiIiiiI.next();
                if (n == 0) {
                    stringBuilder.append(iIIiiIIiii.ALLATORIxDEMO("/"));
                }
                stringBuilder.append(IIiIiiiiIi.IiiiiiiIIi("\u0005")).append((String)entry.getKey()).append(iIIiiIIiii.ALLATORIxDEMO("T9"));
                entry = entry.getValue();
                if (entry instanceof String) {
                    stringBuilder.append(IIiIiiiiIi.IiiiiiiIIi("\u0005")).append(entry).append(iIIiiIIiii.ALLATORIxDEMO("!"));
                } else if (entry instanceof List) {
                    stringBuilder.append(IIiIiiiiIi.IiiiiiiIIi("|"));
                    List list = (List)((Object)entry);
                    int n2 = 3 >> 2;
                    while (n2 < list.size()) {
                        int n3;
                        if (n3 > 0) {
                            stringBuilder.append(iIIiiIIiii.ALLATORIxDEMO("/"));
                        }
                        StringBuilder stringBuilder2 = stringBuilder.append(IIiIiiiiIi.IiiiiiiIIi("\u0005")).append(list.get(n3));
                        stringBuilder2.append(iIIiiIIiii.ALLATORIxDEMO("!"));
                        n2 = ++n3;
                    }
                    stringBuilder.append(IIiIiiiiIi.IiiiiiiIIi("z"));
                } else {
                    stringBuilder.append(entry);
                }
                n = 0;
                iterator = IiIIiIiiiI;
            }
            StringBuilder stringBuilder3 = stringBuilder;
            stringBuilder3.append(iIIiiIIiii.ALLATORIxDEMO("~"));
            return stringBuilder3.toString();
        } catch (Exception exception) {
            return IIiIiiiiIi.IiiiiiiIIi("IZ");
        }
    }

    public boolean ALLATORIxDEMO() {
        long l;
        block8: {
            block7: {
                boolean bl;
                IiIIiiIIiI iiIIiiIIiI = object;
                try {
                    Object object = iiIIiiIIiI.iiIIIIiIII.get(iIIiiIIiii.ALLATORIxDEMO("o\u001f`3M%F)f\u000es?Q\u0013p"));
                    if (object != null) break block7;
                    bl = true;
                } catch (Exception exception) {
                    return --1 != 0;
                }
                return bl;
            }
            Object object = object;
            if (object instanceof Long) {
                l = (Long)object;
                break block8;
            }
            if (object instanceof String) {
                l = Long.parseLong((String)object);
                break block8;
            }
            boolean bl = true;
            return bl;
        }
        if (System.currentTimeMillis() > l) {
            return (3 & 5) != 0;
        }
        boolean bl = false;
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

