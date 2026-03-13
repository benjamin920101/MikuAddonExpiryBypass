/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIIiiIIiii;
import com.github.mikumiku.addon.mixinface.MySettings;
import com.google.gson.Gson;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class IIIIiIIIIi {
    public static String IiiIIIIiiI(String string, String string2) throws Exception {
        Cipher cipher;
        Object IiIIiIiiiI = string2;
        String IiIIiIiiiI2 = string;
        IiIIiIiiiI = IIIIiIIIIi.ALLATORIxDEMO((String)IiIIiIiiiI);
        IvParameterSpec ivParameterSpec = IIIIiIIIIi.ALLATORIxDEMO(((SecretKeySpec)IiIIiIiiiI).getEncoded());
        Cipher cipher2 = cipher = Cipher.getInstance(MySettings.ALLATORIxDEMO("T_f\u0015vxV5EQVI JT^QS{}"));
        cipher2.init(4 ^ 5, (Key)IiIIiIiiiI, ivParameterSpec);
        IiIIiIiiiI = cipher2.doFinal(IiIIiIiiiI2.getBytes(iIIiiIIiii.ALLATORIxDEMO("V\"E{\u001b")));
        return Base64.getEncoder().encodeToString((byte[])IiIIiIiiiI);
    }

    public static String IiiIIIIiiI(String string) throws Exception {
        String string2 = string;
        Object IiIIiIiiiI = MessageDigest.getInstance(MySettings.ALLATORIxDEMO("I}{\u0018\b ,")).digest(string2.getBytes(iIIiiIIiii.ALLATORIxDEMO("V\"E{\u001b")));
        return Base64.getEncoder().encodeToString((byte[])IiIIiIiiiI);
    }

    public static void main(String[] stringArray) throws Exception {
        String[] stringArray2 = stringArray;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(MySettings.ALLATORIxDEMO("Evp{F_5oe~tnp;\u0015\u8bcd\u66c5\u658e\u520d\u6732\u6585\u7272\u671e\uff3c"));
        }
        System.out.println(iIIiiIIiii.ALLATORIxDEMO(".\u007f\ns\u0006q\u00042G{\u000eu\u0000h\u001dt\u0001i\u001c~\u000b2Gq\u0004u\u0000w\u0002i\u001cq\u0004u\u0000w\u0002i\u001c2G}\bx$x\u000ep\u0005q\u00041DV#V#V#V#v\u0003V#V#V#V#v\u0003r\u0007~\u000bv\u0003q\u0004|\tp\u0005r\u00072n{\rv\u0003k\u001ew\u0001i\u001f~\b1Dq\u0007v\u0003t\u0002i\u001fq\u0004u\u0003w\u0002i\u001f2G~\u000bx\rx\u000ep\u0005q\u00042nU#V#V#U#u\u0003U#V#U#V#u\u0003q\u0007~\bv\u0003r\u0004\u007f\ts\u0005q\u00071Gx\rv\u0003k\u001et(i\u001f}\b1Dq\u0004u\u0003w\u0001j\u001fq\u0007v\u0003w\u0002i\u001f1G~\u000bx\u000ex\u000es\u0006q\u00041GV#V#V#U\tu\u0003V#V#U#U#u\u0000q\u0007}\bu\u0003r\u0004\u007f\tp\u0006r\u00072G{\ru\u0003h\u001et\u0001i\u001f}\b1Dq-u\u0003t\u0001j\u001fr\u0007v\u0003t\u0001j\u001f1D~\u000b{\u000e{\u000ep\u0005q\u00041DV#V#V#V#v\u0003V#V#U\tU#\u0006Q=S;H\"J?C|c1S3\u0007p\u0014(A?@*J>M$L}[x\n1Bv\u0011d\u0011|\u001fq-u\u0003t\u0001j\u001f1D~\u000b{\u000e{\u000ep\u0005q\u00041DV#V#V#V#v\u0003V#V#V#V#v\u0003r\u0007}!u\u0003q\u0004|\tpd>Kp\u00107_?\u0003\u0004\\1W9\\<\\~\u0016rQo\ra\u0001\u000ez\u001fhv\u0003t\u0001j\u001f2n}\u000b{\u000e{\u000ep\u0005q\u00041DV#V#V#V#v\u0003V#V#V#V#v\u0003r\u0007~\u000bv\u0003q\u0004|\ts/q\u00071Dx\rv\u0003k\u001ew\u0002j\u001f}lT)\u001d\u0007\u0000f\u0006r\u0003p\u001c\u0006v\u0003t\u0001j\u001f1D~\u000b{\u000e{\u000es/r\u00041DV#V#V#V#v\u0003V#V#V#V#v\u0003r\u0007~\u000bv\u0003q\u0004|\tp\u0005r\u00071Dx\ru)h\u001ew\u0002j\u001f}\b1D\u001ch\u0002\u0003\u0012n\u0018\u001f\u0011h\u001bn\u0011s\tvP(~~\bkz\u000ep\u0005q\u00041DV#U\tU#V#v\u0003V#V#V#V#v\u0003r\u0007~\u000bv\u0003q\u0004|\tp\u0005r\u00071Dx\rv\u0003k\u001ew\u0002j\u001f~\"2Dr\u0007v\u0003t\u0001j\u001frO\"W$Rp\u0010>\u00052G:Z4\\9\u000b2K|DV#V#V#V#v\u0003U\tU#V#V#v\u0003r\u0007~\u000bv\u0003q\u0004|\tp\u0005r\u00071Dx\rv\u0003k\u001ew\u0002j\u001f}\b1Dr\u0007v\u0003w+i\u001cq\u0004u\u0000w\u0002i\u001c2G}\bx\rx\rs\u0006r\u00072GU U U U u\u0000U U U U u)"));
        Object IiIIiIiiiI = MySettings.ALLATORIxDEMO("s{^_a_NABU@Y");
        String string = iIIiiIIiii.ALLATORIxDEMO("<U>Ob^q\u00046MvO%Q>\t~\u0014\u0013m[b\u0003w\u001e-!L\u0004h\u0013q\u0005-\u0012f \f");
        String string2 = IIIIiIIIIi.IiiIIIIiiI(string, (String)IiIIiIiiiI);
        System.out.println("Encrypted: " + string2);
        IiIIiIiiiI = IIIIiIIIIi.IiiiiiiIIi(string2, (String)IiIIiIiiiI);
        System.out.println("Decrypted: " + (String)IiIIiIiiiI);
        IiIIiIiiiI = string;
        string = IIIIiIIIIi.IiiIIIIiiI((String)IiIIiIiiiI);
        System.out.println("SHA-256 digest: " + string);
        string = IIIIiIIIIi.IiiiiiiIIi((String)IiIIiIiiiI);
        System.out.println("SHA-256 digest (hex): " + string);
    }

    private static /* synthetic */ IvParameterSpec ALLATORIxDEMO(byte[] byArray) {
        byte[] byArray2 = byArray;
        byte[] IiIIiIiiiI = Arrays.copyOfRange(byArray2, 2 & 5, 0x3F & 0x50);
        return new IvParameterSpec(IiIIiIiiiI);
    }

    public static String IiiiiiiIIi(String string, String string2) throws Exception {
        Object IiIIiIiiiI = string2;
        String IiIIiIiiiI2 = string;
        IiIIiIiiiI = IIIIiIIIIi.ALLATORIxDEMO((String)IiIIiIiiiI);
        IvParameterSpec ivParameterSpec = IIIIiIIIIi.ALLATORIxDEMO(((SecretKeySpec)IiIIiIiiiI).getEncoded());
        Cipher cipher = Cipher.getInstance(MySettings.ALLATORIxDEMO("T_f\u0015vxv\u0015eqvi\u0000jt~qs[]"));
        cipher.init(5 >> 1, (Key)IiIIiIiiiI, ivParameterSpec);
        IiIIiIiiiI = cipher.doFinal(Base64.getDecoder().decode(IiIIiIiiiI2));
        return new String((byte[])IiIIiIiiiI, iIIiiIIiii.ALLATORIxDEMO("V\"E{\u001b"));
    }

    private static /* synthetic */ String ALLATORIxDEMO(byte[] byArray) {
        int IiIIiIiiiI;
        byte[] byArray2 = byArray;
        StringBuilder stringBuilder = new StringBuilder();
        byte[] byArray3 = byArray2;
        int n = byArray2.length;
        int n2 = IiIIiIiiiI = 3 & 4;
        while (n2 < n) {
            String string = Integer.toHexString(byArray3[IiIIiIiiiI] & (0x29FF & 0x56FF) | 0x5FB4 & 0x214B);
            stringBuilder.append(string.substring(--1));
            n2 = ++IiIIiIiiiI;
        }
        return stringBuilder.toString();
    }

    public static String IiiiiiiIIi(String string) {
        String string2 = string;
        byte[] byArray = null;
        try {
            MessageDigest IiIIiIiiiI = MessageDigest.getInstance(MySettings.ALLATORIxDEMO("i][8(\u0000\f"));
            byArray = IiIIiIiiiI.digest(string2.getBytes(iIIiiIIiii.ALLATORIxDEMO("V\"E{\u001b")));
        } catch (NoSuchAlgorithmException IiIIiIiiiI) {
            throw new RuntimeException(IiIIiIiiiI);
        } catch (UnsupportedEncodingException IiIIiIiiiI) {
            throw new RuntimeException(IiIIiIiiiI);
        }
        return IIIIiIIIIi.ALLATORIxDEMO(byArray);
    }

    private static /* synthetic */ SecretKeySpec ALLATORIxDEMO(String string) throws Exception {
        String string2 = string;
        Object IiIIiIiiiI = MessageDigest.getInstance(iIIiiIIiii.ALLATORIxDEMO("P>B[1c\u0015")).digest(string2.getBytes(MySettings.ALLATORIxDEMO("CEX>$")));
        return new SecretKeySpec((byte[])IiIIiIiiiI, iIIiiIIiii.ALLATORIxDEMO("B\u0013p"));
    }

    public static String ALLATORIxDEMO(String string, String string2) throws Exception {
        String IiIIiIiiiI;
        String string3 = string;
        Object IiIIiIiiiI2 = new HashMap<String, String>();
        IiIIiIiiiI2.put(MySettings.ALLATORIxDEMO("vzu~k}h"), string3);
        IiIIiIiiiI2.put(iIIiiIIiii.ALLATORIxDEMO("\u0006b\u0005p\u0001l$G"), IiIIiIiiiI);
        IiIIiIiiiI = new Gson().toJson(IiIIiIiiiI2);
        IiIIiIiiiI2 = String.valueOf(System.currentTimeMillis() / 1000L / 10L);
        return IIIIiIIIIi.IiiIIIIiiI(IiIIiIiiiI, (String)IiIIiIiiiI2);
    }

    public IIIIiIIIIi() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(MySettings.ALLATORIxDEMO("eVp{f\u007f5oe~TN\u0005N\u0015\u8bcd\u66c6\u658d\u5205\u673a\u6598\u726f\u674e\uff6c"));
        }
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).insert(3 >> 2, stackTraceElement.getClassName()).toString();
        int n = --3;
        int n2 = --3;
        int n3 = string2.length();
        int n4 = n3 - (4 ^ 5);
        char[] cArray = new char[n3];
        int n5 = (--3 ^ --5) << --3;
        int cfr_ignored_0 = n << n ^ (1 ^ 3);
        int n6 = n2 << n2 ^ --3;
        int n7 = IiIIiIiiiI = string3.length() - (3 & 5);
        int n8 = n4;
        String string4 = string3;
        while (n8 >= 0) {
            int n9 = n4--;
            cArray[n9] = (char)(n6 ^ (string2.charAt(n9) ^ string4.charAt(IiIIiIiiiI)));
            if (n4 < 0) break;
            int n10 = n4--;
            char c = cArray[n10] = (char)(n5 ^ (string2.charAt(n10) ^ string4.charAt(IiIIiIiiiI)));
            if (--IiIIiIiiiI < 0) {
                IiIIiIiiiI = n7;
            }
            n8 = n4;
        }
        return new String(cArray);
    }
}

