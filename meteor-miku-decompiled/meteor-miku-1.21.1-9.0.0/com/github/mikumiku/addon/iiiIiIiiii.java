/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Module
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIiiIiiiII;
import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.Date;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;

public class iiiIiIiiii
extends Module {
    private final SettingGroup iiiiiIIiiI;
    private final Setting<SettingColor> iiIIIIiIII;
    private final Setting<Double> IiIIiIiiiI;
    private final SettingGroup ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        void IiIIiIiiiI;
        iiiIiIiiii iiiIiIiiii2 = iiiIiIiiii3;
        iiiIiIiiii iiiIiIiiii3 = new class_238(class_2338.ORIGIN);
        iiiIiIiiii3 = iiiIiIiiii3.stretch((Double)iiiIiIiiii2.IiIIiIiiiI.get() * iiiIiIiiii3.getLengthX(), (Double)iiiIiIiiii2.IiIIiIiiiI.get() * iiiIiIiiii3.getLengthY(), (Double)iiiIiIiiii2.IiIIiIiiiI.get() * iiiIiIiiii3.getLengthZ());
        IiIIiIiiiI.renderer.box((class_238)iiiIiIiiii3, (Color)iiiIiIiiii2.iiIIIIiIII.get(), (Color)iiiIiIiiii2.iiIIIIiIII.get(), ShapeMode.Both, 3 ^ 3);
    }

    public iiiIiIiiii() {
        iiiIiIiiii iiiIiIiiii2 = this;
        super(iiiiIiIiii.IiIIiIiiiI, iIiiIiiiII.ALLATORIxDEMO("n$K\u0007}fv9p,p%"), iiIIIIiiIi.ALLATORIxDEMO("y4\u0005\"J1\u0013lQ:\u00196T=P+X\u007fM3Z-\u0005/\u0017{Y?]1\\\"L}J4\u001b<Z>W/\\)9\u0014_{m\u0013\\{N4K7]u"));
        iiiIiIiiii2.iiiiiIIiiI = iiiIiIiiii2.settings.getDefaultGroup();
        iiiIiIiiii2.ALLATORIxDEMO = iiiIiIiiii2.settings.createGroup(iIiiIiiiII.ALLATORIxDEMO("K.w/|9"));
        iiiIiIiiii2.IiIIiIiiiI = iiiIiIiiii2.iiiiiIIiiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("(Z:U>"))).description(iIiiIiiiII.ALLATORIxDEMO("\u00186i98p1|kV\r9?Q\u000e9&x9r.ke"))).defaultValue(2.0).range(0.5, 10.0).build());
        this.iiIIIIiIII = this.ALLATORIxDEMO.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("8V7V)"))).description(iIiiIiiiII.ALLATORIxDEMO("J$;,z$u$kkV\r9?Q\u000e9&x9r.ke"))).defaultValue(Color.MAGENTA).build());
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIIIIiiIi.ALLATORIxDEMO("n0\u001b}J>\u0019.I?x\u000f\\z9\u8b8c\u66cd\u65eb\u5209\u675b\u6589\u7213\u6715\uff5a"));
        }
    }
}

