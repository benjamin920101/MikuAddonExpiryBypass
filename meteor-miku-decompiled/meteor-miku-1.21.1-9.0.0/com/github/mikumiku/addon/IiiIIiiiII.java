/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiIIIIi;
import com.github.mikumiku.addon.IIiIIIiIii;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Date;

public class IiiIIiiiII {
    private static final String ALLATORIxDEMO = "https://googlese.bbbbbbb.top/time";

    public static long ALLATORIxDEMO() {
        int n;
        HttpClient httpClient = HttpClient.newHttpClient();
        int n2 = --3;
        int n3 = n = 3 >> 1;
        while (n3 <= n2) {
            try {
                JsonObject jsonObject;
                HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(ALLATORIxDEMO)).GET().header(IIiIIIiIii.ALLATORIxDEMO("\u0011p!qiB\u0003F\nW"), IIIIiIIIIi.ALLATORIxDEMO("\u001f\u001e \u0015;\u00106^oJ\u007f_|5 \u00176'\u0014\u0007\u007f;\n]gOzcC\u007f#4\u0018(\u0001l\\!DpFx25\u001e>\u001cIP?=0\u0006tEvYsEoRs;\r:Sy}Z8\u0016?\u001a\u007f3;\u0016uZPr\u001a\u001a+\u001d\u00147Vcm@wBwBWbY\u0001\u0010<\u001d%\u0015xDiSaLbB\f\u001d5gR@m[nSfQd")).build();
                HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
                if (httpResponse.statusCode() == (0x15DC & 0x6AEB) && (jsonObject = JsonParser.parseString((String)httpResponse.body()).getAsJsonObject()).has(IIiIIIiIii.ALLATORIxDEMO("\u0000B\u0010B"))) {
                    long l = jsonObject.get(IIIIiIIIIi.ALLATORIxDEMO("\u00197\u000b5")).getAsLong();
                    return l;
                }
            } catch (Exception exception) {
                System.err.println("\u8bf7\u6c42\u5931\u8d25\uff0c\u6b63\u5728\u91cd\u8bd5 (" + n + "/" + n2 + ")\uff1a" + exception.getMessage());
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException interruptedException) {
                    // empty catch block
                }
            }
            n3 = ++n;
        }
        throw new RuntimeException(IIiIIIiIii.ALLATORIxDEMO("\u8b93\u6c61\u7fea\u56c1\u65b2\u95f7\u5975\u8d26\uff48\u5df1\u91a9\u8bf6W\u6b02"));
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[2 ^ 3];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(5 >> 3, stackTraceElement.getMethodName()).toString();
        int n = --4;
        int n2 = --4;
        int n3 = --3;
        int n4 = string2.length();
        int n5 = n4 - --1;
        char[] cArray = new char[n4];
        int n6 = n3 << n3 ^ --5;
        int cfr_ignored_0 = n << n;
        int n7 = n2 << n2 ^ (5 >> 1 ^ --5);
        int n8 = IiIIiIiiiI = string3.length() - --1;
        int n9 = n5;
        String string4 = string3;
        while (n9 >= 0) {
            int n10 = n5--;
            cArray[n10] = (char)(n7 ^ (string2.charAt(n10) ^ string4.charAt(IiIIiIiiiI)));
            if (n5 < 0) break;
            int n11 = n5--;
            char c = cArray[n11] = (char)(n6 ^ (string2.charAt(n11) ^ string4.charAt(IiIIiIiiiI)));
            if (--IiIIiIiiiI < 0) {
                IiIIiIiiiI = n8;
            }
            n9 = n5;
        }
        return new String(cArray);
    }

    public IiiIIiiiII() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIIIiIIIIi.ALLATORIxDEMO(")><\u0013*\u0017y\u0007\t6\u0018&i\u0006y\u8b85\u66aa\u65c5\u5269\u6772\u65f4\u7227\u6722\uff24"));
        }
    }
}

