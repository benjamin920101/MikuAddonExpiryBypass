/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIIIiiII;
import com.github.mikumiku.addon.iiIiiIIiII;
import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class IiIIiiIIIi {
    private static final Gson IiIIiIiiiI = new Gson();
    private static final SecureRandom ALLATORIxDEMO = new SecureRandom();

    /*
     * WARNING - void declaration
     */
    public static byte[] ALLATORIxDEMO(byte[] byArray, PublicKey publicKey) throws Exception {
        void IiIIiIiiiI;
        Object IiIIiIiiiI2;
        byte[] byArray2 = byArray;
        Object object = IiIIiIiiiI2 = (Object)Cipher.getInstance(IiiIIIiiII.IiiiiiiIIi("AXR\u0004vhq\u0004|JVslGBFekz\u001b\u001c\u0018\u0003qFO~]D\u0017nF[K^CR"));
        ((Cipher)object).init(2 ^ 3, (Key)IiIIiIiiiI);
        return ((Cipher)object).doFinal(byArray2);
    }

    public static Map<String, byte[]> ALLATORIxDEMO(byte[] byArray, String string) throws Exception {
        byte[] IiIIiIiiiI;
        byte[] byArray2 = byArray;
        byte[] byArray3 = new byte[0x5F & 0x2C];
        ALLATORIxDEMO.nextBytes(byArray3);
        Object IiIIiIiiiI2 = new SecretKeySpec(byArray2, iiIiiIIiII.ALLATORIxDEMO("\")\u0010"));
        Cipher cipher = Cipher.getInstance(IiiIIIiiII.IiiiiiiIIi("ohf\u001foh~5LInF[K^CR"));
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(0x4DAA & 0x32D5, byArray3);
        Cipher cipher2 = cipher;
        cipher2.init(--1, (Key)IiIIiIiiiI2, gCMParameterSpec);
        IiIIiIiiiI = cipher2.doFinal(IiIIiIiiiI.getBytes(StandardCharsets.UTF_8));
        HashMap<String, byte[]> hashMap = new HashMap<String, byte[]>();
        Object object = IiIIiIiiiI2 = (Object)hashMap;
        hashMap.put(iiIiiIIiII.ALLATORIxDEMO("\u00055"), byArray3);
        object.put(IiiIIIiiII.IiiiiiiIIi("DV__HG"), IiIIiIiiiI);
        return object;
    }

    public IiIIiiIIIi() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIiiIIiII.ALLATORIxDEMO(";(Ne?\u0006L6<\u0007-\u0017\tbL\u8bb4\u66b8\u65d3\u527c\u6763\u65fc\u722b\u6740\uff42"));
        }
    }

    public static PublicKey ALLATORIxDEMO(String string) throws Exception {
        String string2 = string;
        Object IiIIiIiiiI = Base64.getDecoder().decode(string2);
        IiIIiIiiiI = new X509EncodedKeySpec((byte[])IiIIiIiiiI);
        return KeyFactory.getInstance(iiIiiIIiII.ALLATORIxDEMO("1?\u0002")).generatePublic((KeySpec)IiIIiIiiiI);
    }

    public static byte[] ALLATORIxDEMO() {
        byte[] byArray = new byte[0x6B & 0x34];
        ALLATORIxDEMO.nextBytes(byArray);
        return byArray;
    }

    public static String ALLATORIxDEMO(Map<String, Object> map) throws Exception {
        Map<String, Object> IiIIiIiiiI;
        Map<String, Object> map2 = map;
        Object object = IiIIiiIIIi.ALLATORIxDEMO((String)map2.get(IiiIIIiiII.IiiiiiiIIi("H_sgHJwJM|HL")));
        byte[] byArray = IiIIiiIIIi.ALLATORIxDEMO();
        object = IiIIiiIIIi.ALLATORIxDEMO(byArray, (PublicKey)object);
        Object object2 = List.of(iiIiiIIiII.ALLATORIxDEMO("\u0010)\u0000>\u0006\u0018r"), IiiIIIiiII.IiiiiiiIIi("MB\\]RY\u0007"), iiIiiIIiII.ALLATORIxDEMO("\u0000#\r*\n\u000b\u001b"));
        object2 = IiIIiiIIIi.ALLATORIxDEMO(byArray, IiIIiiIIIi.IiIIiIiiiI.toJson(object2));
        Map<String, Object> map3 = IiIIiIiiiI = new HashMap<String, Object>();
        map3.put(IiiIIIiiII.IiiiiiiIIi("gH]lZVu\u001b\u0001"), Base64.getEncoder().encodeToString((byte[])object));
        map3.put(iiIiiIIiII.ALLATORIxDEMO("\n:!Zw"), Base64.getEncoder().encodeToString((byte[])object2.get(IiiIIIiiII.IiiiiiiIIi("DC"))));
        IiIIiIiiiI.put(iiIiiIIiII.ALLATORIxDEMO(" %\u0013$\u0006>!Zw"), Base64.getEncoder().encodeToString((byte[])object2.get(IiiIIIiiII.IiiiiiiIIi("DV__HG"))));
        IiIIiIiiiI.put(iiIiiIIiII.ALLATORIxDEMO(")\u001b<\n\u001e:"), System.currentTimeMillis() + 600000L);
        return IiIIiiIIIi.IiIIiIiiiI.toJson(IiIIiIiiiI);
    }
}

