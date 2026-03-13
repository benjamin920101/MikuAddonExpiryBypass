/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiIIiIiIII;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Date;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIIiiIi {
    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(3 >> 2, stackTraceElement.getMethodName()).toString();
        int n = --4;
        int n2 = --3;
        int n3 = string2.length();
        int n4 = n3 - (3 >> 1);
        char[] cArray = new char[n3];
        int n5 = n2 << n2 ^ (--3 ^ --5);
        int cfr_ignored_0 = (--3 ^ --5) << --3 ^ --2;
        int n6 = n << n ^ --3;
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

    public IIIIIIiiIi() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIIIIiiIi.ALLATORIxDEMO("n0\u001b}j\u001e9\u000ei\u001fx\u000f|Z9\u8b8c\u66cd\u65eb\u5209\u675b\u65a9\u7233\u6715\uff5a"));
        }
    }

    public static Boolean ALLATORIxDEMO(String string) {
        int n;
        String string2 = string;
        int cfr_ignored_0 = --3;
        Object object = Duration.ofSeconds(5L);
        HttpClient httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).build();
        object = HttpRequest.newBuilder().uri(URI.create(string2)).timeout((Duration)object).GET().build();
        int n2 = n = 2 ^ 3;
        while (true) {
            block7: {
                if (n2 > 3) break;
                try {
                    String string3;
                    HttpResponse<String> IiIIiIiiiI = httpClient.send((HttpRequest)object, HttpResponse.BodyHandlers.ofString());
                    if (IiIIiIiiiI.statusCode() == (0x78CD & 0x7FA) && (string3 = (String)IiIIiIiiiI.body()) != null && string3.trim().equals(iiIIiIiIII.ALLATORIxDEMO("c\u0019\u007f\u0013"))) {
                        return Boolean.TRUE;
                    }
                } catch (IOException | InterruptedException IiIIiIiiiI) {
                    if (!(IiIIiIiiiI instanceof InterruptedException)) break block7;
                    Thread.currentThread().interrupt();
                }
            }
            if (n < --3) {
                try {
                    Thread.sleep(500L * (long)n);
                } catch (InterruptedException IiIIiIiiiI) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
            n2 = ++n;
        }
        return Boolean.FALSE;
    }
}

