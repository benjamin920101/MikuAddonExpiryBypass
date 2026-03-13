/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon.ok;

import com.github.mikumiku.addon.IIIIiIIIIi;
import com.github.mikumiku.addon.IIiIIIiIii;
import com.github.mikumiku.addon.iIiIiIiIII;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LoginApiTester {
    private static final HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10L)).build();
    private static final List<String> LOGIN_ENDPOINTS;
    private static final String BASE_URL = "https://7027e3d4.mikulogin.pages.dev";
    private static String JSON_BY_USERNAME;
    private static String JSON_BY_EMAIL;

    static {
        String[] stringArray = new String[--5];
        stringArray[3 ^ 3] = iIiIiIiIII.ALLATORIxDEMO("kr6dz'");
        stringArray[4 ^ 5] = IIiIIIiIii.ALLATORIxDEMO("gn.pvr'h6v");
        stringArray[5 >> 1] = iIiIiIiIII.ALLATORIxDEMO("4%k7qkr6dz'");
        stringArray[--3] = IIiIIIiIii.ALLATORIxDEMO("\u0011=|;kvr'h6v");
        stringArray[--4] = iIiIiIiIII.ALLATORIxDEMO("67w>mz'");
        LOGIN_ENDPOINTS = Arrays.asList(stringArray);
        JSON_BY_USERNAME = "{\"username\": \"user\", \"password\": \"securePassword123!\"}\n";
        JSON_BY_EMAIL = "{\"email\": \"user@example.com\", \"password\": \"securePassword123!\"}\n";
    }

    public LoginApiTester() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIiIiIiIII.ALLATORIxDEMO(")O-s-ayv8v>qtjd\u8be9\u66b7\u65a9\u5274\u671e\u65e9\u724b\u673f\uff48"));
        }
    }

    public static void login() {
        Iterator<String> iterator;
        Iterator<String> iterator2 = iterator = LOGIN_ENDPOINTS.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            JSON_BY_USERNAME = "{\"username\": \"" + IIIIiIIIIi.IiiiiiiIIi(System.nanoTime() + "2") + "\", \"password\": \"" + IIIIiIIIIi.IiiiiiiIIi(System.nanoTime() + "securePassword123!") + "\"}";
            iterator2 = iterator;
            String string2 = string;
            LoginApiTester.testLoginEndpoint(string2, JSON_BY_USERNAME, IIiIIIiIii.ALLATORIxDEMO("+j<l&n2}"));
            LoginApiTester.testLoginEndpoint(string2, JSON_BY_EMAIL, iIiIiIiIII.ALLATORIxDEMO("u)\u007f*u"));
        }
    }

    private static /* synthetic */ String truncate(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI2 == null || IiIIiIiiiI2.isEmpty()) {
            return IIiIIIiIii.ALLATORIxDEMO("1<s8{&1");
        }
        if (IiIIiIiiiI2.length() <= IiIIiIiiiI) {
            return IiIIiIiiiI2;
        }
        return IiIIiIiiiI2.substring(3 >> 2, IiIIiIiiiI) + "...";
    }

    private static /* synthetic */ void testLoginEndpoint(String string, String string2, String string3) {
        Object IiIIiIiiiI22 = string3;
        String IiIIiIiiiI = string;
        try {
            HttpRequest IiIIiIiiiI3;
            IiIIiIiiiI22 = URI.create(BASE_URL + IiIIiIiiiI);
            IiIIiIiiiI3 = HttpRequest.newBuilder().uri((URI)IiIIiIiiiI22).timeout(Duration.ofSeconds(15L)).header(IIiIIIiIii.ALLATORIxDEMO(":Q&{;w-3\u001cv/}"), iIiIiIiIII.ALLATORIxDEMO("\tB3u p<s+w*1)j6m")).header(IIiIIIiIii.ALLATORIxDEMO("\u001d|;kt_/j1l"), iIiIiIiIII.ALLATORIxDEMO("\by<qdR,~\u0001\\cM,`)b08k>\u0012n<m")).POST(HttpRequest.BodyPublishers.ofString((String)((Object)IiIIiIiiiI3))).build();
            if (client.send(IiIIiIiiiI3, HttpResponse.BodyHandlers.ofString()).statusCode() != (0x7EFF & 0x1C8)) {
                return;
            }
        } catch (Exception IiIIiIiiiI22) {
            // empty catch block
        }
    }
}

