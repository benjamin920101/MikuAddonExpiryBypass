/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iiIIIiiIII;
import com.github.mikumiku.addon.iiIiiIIiIi;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.security.Key;
import java.util.Base64;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class iiIiIIiiii {
    private static final String iiIIIIiIII = "user.dat";
    private static final String IiIIiIiiiI = "MySecretKey12345";
    private static final String ALLATORIxDEMO = "config";

    public iiIiIIiiii() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIiiIIiIi.ALLATORIxDEMO("\u0017H\"E\u0014aGq\u0017`\u0006pWpG\u8bf3\u6694\u65b3\u5257\u6704\u65ca\u7251\u671c\uff52"));
        }
    }

    private static /* synthetic */ String IiiIIIIiiI(String string) throws Exception {
        Cipher cipher;
        String string2 = string;
        Object IiIIiIiiiI = new SecretKeySpec(IiIIiIiiiI.getBytes(iiIiiIIiIi.ALLATORIxDEMO("Q3Bj\u001c")), iiIIIiiIII.ALLATORIxDEMO("R0`"));
        Cipher cipher2 = cipher = Cipher.getInstance(iiIiiIIiIi.ALLATORIxDEMO("\u0006a4+\"G\u0005\u000b\u0017o\u0004wrt\u0006`\u0003m)C"));
        cipher2.init(--1, (Key)IiIIiIiiiI);
        IiIIiIiiiI = cipher2.doFinal(string2.getBytes(iiIIIiiIII.ALLATORIxDEMO("F\u0001UX\u000b")));
        return Base64.getEncoder().encodeToString((byte[])IiIIiIiiiI);
    }

    public static JsonObject ALLATORIxDEMO() {
        try {
            File file = new File(ALLATORIxDEMO, iiIIIIiIII);
            if (!file.exists()) {
                return null;
            }
            String[] stringArray = new String[--1];
            stringArray[5 >> 3] = iiIIIIiIII;
            String string = iiIiIIiiii.IiiiiiiIIi(new String(Files.readAllBytes(Paths.get(ALLATORIxDEMO, stringArray))));
            return (JsonObject)new Gson().fromJson(string, JsonObject.class);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static /* synthetic */ String IiiiiiiIIi(String string) throws Exception {
        String string2 = string;
        Object IiIIiIiiiI = new SecretKeySpec(IiIIiIiiiI.getBytes(iiIiiIIiIi.ALLATORIxDEMO("q\u0013bJ<")), iiIIIiiIII.ALLATORIxDEMO("r\u0010@"));
        Cipher cipher = Cipher.getInstance(iiIiiIIiIi.ALLATORIxDEMO("\u0006a4+\"G%+7O$WRT&@#M\tc"));
        cipher.init(--2, (Key)IiIIiIiiiI);
        IiIIiIiiiI = cipher.doFinal(Base64.getDecoder().decode(string2));
        return new String((byte[])IiIIiIiiiI, iiIIIiiIII.ALLATORIxDEMO("f!ux+"));
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(String string, String string2, boolean bl) {
        String string3 = string;
        try {
            String IiIIiIiiiI;
            void IiIIiIiiiI2;
            String IiIIiIiiiI3;
            File file = new File(ALLATORIxDEMO);
            if (!file.exists()) {
                file.mkdirs();
            }
            String string4 = IiIIiIiiiI3 = new JsonObject();
            string4.addProperty(iiIIIiiIII.ALLATORIxDEMO("\rM\u001cM\u001fV\u001eP"), string3);
            string4.addProperty(iiIiiIIiIi.ALLATORIxDEMO(":H8[4O3F"), IiIIiIiiiI2 != false ? IiIIiIiiiI : "");
            IiIIiIiiiI3.addProperty(iiIIIiiIII.ALLATORIxDEMO("\n[\u0014Z\u001cU\u0016G"), Boolean.valueOf((boolean)IiIIiIiiiI2));
            IiIIiIiiiI = iiIiIIiiii.IiiIIIIiiI(new Gson().toJson((JsonElement)IiIIiIiiiI3));
            String[] stringArray = new String[5 >> 2];
            stringArray[3 & 4] = iiIIIIiIII;
            Files.write(Paths.get(ALLATORIxDEMO, stringArray), IiIIiIiiiI.getBytes(), new OpenOption[3 ^ 3]);
            return;
        } catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 >> 1];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = --3;
        int n2 = string2.length();
        int n3 = n2 - (4 ^ 5);
        char[] cArray = new char[n2];
        int n4 = (5 >> 1 ^ --5) << --4 ^ --4 << --1;
        int cfr_ignored_0 = n << n;
        int n5 = (1 ^ 3) << --3 ^ (1 ^ 3);
        int n6 = IiIIiIiiiI = string3.length() - --1;
        int n7 = n3;
        String string4 = string3;
        while (n7 >= 0) {
            int n8 = n3--;
            cArray[n8] = (char)(n5 ^ (string2.charAt(n8) ^ string4.charAt(IiIIiIiiiI)));
            if (n3 < 0) break;
            int n9 = n3--;
            char c = cArray[n9] = (char)(n4 ^ (string2.charAt(n9) ^ string4.charAt(IiIIiIiiiI)));
            if (--IiIIiIiiiI < 0) {
                IiIIiIiiiI = n6;
            }
            n7 = n3;
        }
        return new String(cArray);
    }
}

