/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  meteordevelopment.meteorclient.addons.GithubRepo
 *  meteordevelopment.meteorclient.addons.MeteorAddon
 *  meteordevelopment.meteorclient.systems.hud.HudGroup
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.github.mikumiku.addon.ok;

import com.github.mikumiku.addon.IIIIiIiIii;
import com.github.mikumiku.addon.IIIIiiiIIi;
import com.github.mikumiku.addon.iiIiIIiiii;
import java.util.Date;
import lombok.Generated;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MikuMikuAddon
extends MeteorAddon {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(MikuMikuAddon.class);
    public static final HudGroup HUD_GROUP = new HudGroup(IIIIiiiIIi.ALLATORIxDEMO("\u0013\\4A"));

    public void onRegisterCategories() {
        IIIIiIiIii.IiiiiiiIIi();
    }

    public String getPackage() {
        return iiIiIIiiii.ALLATORIxDEMO("<~\u0016=\u001ed\u0013]*sU~\u0010f\u0012T:w\u00032\u0017s\u0019y\u0012");
    }

    public MikuMikuAddon() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIIIiiiIIi.ALLATORIxDEMO("\b_?P7J\\b(W;E!\u000eP\u8bec\u66a1\u658e\u5265\u673e\u65ee\u727d\u6773\uff35"));
        }
    }

    public void onInitialize() {
        IIIIiIiIii.ALLATORIxDEMO();
    }

    public GithubRepo getRepo() {
        return new GithubRepo(IIIIiiiIIi.ALLATORIxDEMO("v<U S7^*\u0003"), iiIiIIiiii.ALLATORIxDEMO("\n\\'y\u0019n[z\u0014}\t"));
    }
}

