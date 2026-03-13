/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.systems.hud.HudElement
 *  meteordevelopment.meteorclient.systems.hud.HudElementInfo
 *  meteordevelopment.meteorclient.systems.hud.HudRenderer
 *  meteordevelopment.meteorclient.utils.render.color.Color
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiiIIiIIii;
import com.github.mikumiku.addon.ok.MikuMikuAddon;
import java.util.Date;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;

public class IIiiIIIiiI
extends HudElement {
    public static final HudElementInfo<IIiiIIIiiI> ALLATORIxDEMO = new HudElementInfo(MikuMikuAddon.HUD_GROUP, IiiiIiiIII.ALLATORIxDEMO("'|\u0001@"), iiiIIiIIii.ALLATORIxDEMO("M@4jJ)E-@)V`H4Sb\\"), IIiiIIIiiI::new);

    public void render(HudRenderer hudRenderer) {
        IIiiIIIiiI iIiiIIIiiI = iIiiIIIiiI2;
        IIiiIIIiiI iIiiIIIiiI2 = hudRenderer;
        IIiiIIIiiI IiIIiIiiiI = iIiiIIIiiI;
        IIiiIIIiiI iIiiIIIiiI3 = iIiiIIIiiI2;
        IiIIiIiiiI.setSize(iIiiIIIiiI3.textWidth(IiiiIiiIII.ALLATORIxDEMO("'\\\u0001@JP&p'p\u0004A"), 3 >> 1), iIiiIIIiiI2.textHeight((2 ^ 3) != 0));
        iIiiIIIiiI3.quad(IiIIiIiiiI.x, IiIIiIiiiI.y, IiIIiIiiiI.getWidth(), IiIIiIiiiI.getHeight(), Color.LIGHT_GRAY);
        iIiiIIIiiI3.text(iiiIIiIIii.ALLATORIxDEMO("\u0016W'\\gG!M!L5J"), IiIIiIiiiI.x, IiIIiIiiiI.y, Color.WHITE, --1 != 0);
    }

    public IIiiIIIiiI() {
        super(ALLATORIxDEMO);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiiIIiIIii.ALLATORIxDEMO("0i\u0005d\u0013``P0A\u0001qpQ`\u8bd2\u66b3\u6592\u5270\u6725\u65ed\u7270\u673b\uff73"));
        }
    }
}

