/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiiiIIi;
import com.github.mikumiku.addon.IiiiIIiiiI;
import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class IIiIiIiiii {
    private static final Gson ALLATORIxDEMO = new Gson();

    public IIiIiIiiii() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiiIIiiiI.ALLATORIxDEMO("}\u001e\bSy0* Z\u0011k!OT*\u8ba2\u66de\u65c5\u521a\u6775\u659a\u723d\u6706\uff74"));
        }
    }

    public static List<String> ALLATORIxDEMO(String string, PrivateKey privateKey) throws Exception {
        String IiIIiIiiiI;
        String string2 = string;
        Object IiIIiIiiiI2 = (Map)ALLATORIxDEMO.fromJson(string2, Map.class);
        byte[] byArray = Base64.getDecoder().decode((String)IiIIiIiiiI2.get(IIIIiiiIIi.ALLATORIxDEMO("v6P\u0013V!qn\u0007")));
        byte[] byArray2 = Base64.getDecoder().decode((String)IiIIiIiiiI2.get(IiiiIIiiiI.ALLATORIxDEMO("\u001c\\7\u001cA")));
        IiIIiIiiiI2 = Base64.getDecoder().decode((String)IiIIiIiiiI2.get(IIIIiiiIIi.ALLATORIxDEMO("p1C0V*qn\u0007")));
        IiIIiIiiiI = IIiIiIiiii.ALLATORIxDEMO(IIiIiIiiii.ALLATORIxDEMO(byArray, (PrivateKey)((Object)IiIIiIiiiI)), byArray2, (byte[])IiIIiIiiiI2);
        return (List)ALLATORIxDEMO.fromJson(IiIIiIiiiI, List.class);
    }

    public static String ALLATORIxDEMO(PublicKey IiIIiIiiiI) {
        return Base64.getEncoder().encodeToString(IiIIiIiiiI.getEncoded());
    }

    /*
     * WARNING - void declaration
     */
    public static byte[] ALLATORIxDEMO(byte[] byArray, PrivateKey privateKey) throws Exception {
        void IiIIiIiiiI;
        Object IiIIiIiiiI2;
        byte[] byArray2 = byArray;
        Object object = IiIIiIiiiI2 = (Object)Cipher.getInstance(IiiiIIiiiI.ALLATORIxDEMO("%e(Bwa?\b7f=|$D\u0006\u0005aB\u0014'g\u001fCK;N8M\u0013\u001b%K\u0011N\u001cD\u0012"));
        ((Cipher)object).init(1 ^ 3, (Key)IiIIiIiiiI);
        return ((Cipher)object).doFinal(byArray2);
    }

    /*
     * WARNING - void declaration
     */
    public static String ALLATORIxDEMO(byte[] byArray, byte[] byArray2, byte[] byArray3) throws Exception {
        void IiIIiIiiiI;
        Object IiIIiIiiiI2 = byArray2;
        byte[] IiIIiIiiiI3 = byArray;
        SecretKeySpec secretKeySpec = new SecretKeySpec(IiIIiIiiiI3, IIIIiiiIIi.ALLATORIxDEMO("r\u001d`"));
        Cipher cipher = Cipher.getInstance(IiiiIIiiiI.ALLATORIxDEMO("\u0014o&%\u0012i8%\u001bE%K\u0011N\u001cD\u0012"));
        IiIIiIiiiI2 = new GCMParameterSpec(0x1AEB & 0x6594, (byte[])IiIIiIiiiI2);
        Cipher cipher2 = cipher;
        cipher2.init(5 >> 1, (Key)secretKeySpec, (AlgorithmParameterSpec)IiIIiIiiiI2);
        IiIIiIiiiI2 = cipher2.doFinal((byte[])IiIIiIiiiI);
        return new String((byte[])IiIIiIiiiI2, StandardCharsets.UTF_8);
    }

    public static KeyPair ALLATORIxDEMO() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(IIIIiiiIIi.ALLATORIxDEMO("a\u000br"));
        keyPairGenerator.initialize(0x6C17 & 0x1FE8, new SecureRandom());
        return keyPairGenerator.generateKeyPair();
    }
}

