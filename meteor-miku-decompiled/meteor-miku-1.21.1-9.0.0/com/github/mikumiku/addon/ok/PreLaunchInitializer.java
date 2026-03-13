/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint
 */
package com.github.mikumiku.addon.ok;

import com.github.mikumiku.addon.IIiIIIiIii;
import java.util.Date;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class PreLaunchInitializer
implements PreLaunchEntrypoint {
    public static boolean authenticated = 5 >> 3;
    public static String auth = "false";
    public static final String PURCHASE_URL = "https://qm.qq.com/q/ugixHq8ceI";

    public PreLaunchInitializer() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public void onPreLaunch() {
        IIiIIIiIii.IiiiiiiIIi();
    }
}

