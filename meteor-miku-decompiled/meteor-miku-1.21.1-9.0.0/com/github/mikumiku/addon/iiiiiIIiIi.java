/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Util
 *  net.minecraft.text.Text
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.widget.TextFieldWidget
 *  net.minecraft.client.gui.Element
 *  net.minecraft.client.gui.widget.ButtonWidget
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.TitleScreen
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiIIiIII;
import com.github.mikumiku.addon.iiiiIiiiIi;
import com.github.mikumiku.addon.mixinface.MySettings;
import java.util.Date;
import net.minecraft.util.Util;
import net.minecraft.text.Text;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;

public class iiiiiIIiIi
extends class_437 {
    private String iiiiiIIiiI = "";
    private static final String iiIIIIiIII = "https://qm.qq.com/q/ugixHq8ceI";
    private class_342 IiIIiIiiiI;
    private class_342 ALLATORIxDEMO;

    public iiiiiIIiIi() {
        super((class_2561)class_2561.literal((String)MySettings.ALLATORIxDEMO("\u7653\u5f72\u752e\u970f")));
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiIiIIiIII.ALLATORIxDEMO("H`=-ln?~oo~\u007fz*\u001f\u8bdc\u66cb\u659b\u522f\u670b\u658f\u7263\u6733\uff0a"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void render(class_332 class_3322, int n, int n2, float f) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        iiiiiIIiIi IiIIiIiiiI4;
        iiiiiIIiIi iiiiiIIiIi2 = iiiiiIIiIi3;
        iiiiiIIiIi iiiiiIIiIi3 = class_3322;
        iiiiiIIiIi iiiiiIIiIi4 = IiIIiIiiiI4 = iiiiiIIiIi2;
        iiiiiIIiIi iiiiiIIiIi5 = iiiiiIIiIi3;
        iiiiiIIiIi4.renderBackground((class_332)iiiiiIIiIi5, (int)IiIIiIiiiI3, (int)IiIIiIiiiI2, (float)IiIIiIiiiI);
        int n3 = iiiiiIIiIi4.IiIIiIiiiI.getY() - (0x3E & 0x73);
        iiiiiIIiIi iiiiiIIiIi6 = IiIIiIiiiI4;
        iiiiiIIiIi iiiiiIIiIi7 = iiiiiIIiIi3;
        iiiiiIIiIi7.drawCenteredTextWithShadow(IiIIiIiiiI4.textRenderer, IiIiIIiIII.ALLATORIxDEMO("\u6b3d\u8fc5\u4f40\u7503rBt~\u001f{md"), IiIIiIiiiI4.width / (1 ^ 3), n3, 0xFFFF00);
        iiiiiIIiIi7.drawCenteredTextWithShadow(IiIIiIiiiI4.textRenderer, MySettings.ALLATORIxDEMO("\u8bcf\u764c\u5f6c\u6220\u8d03\u4e51"), IiIIiIiiiI4.width / --2, n3 + (0x17 & 0x7C), 0xFFFFFF);
        iiiiiIIiIi3.drawCenteredTextWithShadow(iiiiiIIiIi6.textRenderer, IiIiIIiIII.ALLATORIxDEMO("\u70a6\u51f0\u0018\u7ae0\u534c\u8d06\u4e6f,\u8388\u53fd\u8d39\u623c"), IiIIiIiiiI4.width / (1 ^ 3), n3 + (0x7D & 0x2A), 0xAAAAAA);
        iiiiiIIiIi5.drawTextWithShadow(iiiiiIIiIi6.textRenderer, MySettings.ALLATORIxDEMO("g\u007f\u001b"), IiIIiIiiiI4.IiIIiIiiiI.getX() - (0x7E & 0x33), IiIIiIiiiI4.IiIIiIiiiI.getY() + (0x67 & 0x1E), 0xFFFFFF);
        iiiiiIIiIi3.drawTextWithShadow(IiIIiIiiiI4.textRenderer, IiIiIIiIII.ALLATORIxDEMO("\u5bed\u781e1"), IiIIiIiiiI4.ALLATORIxDEMO.getX() - (0x3F & 0x72), IiIIiIiiiI4.ALLATORIxDEMO.getY() + (0x26 & 0x5F), 0xFFFFFF);
        iiiiiIIiIi iiiiiIIiIi8 = iiiiiIIiIi3;
        iiiiiIIiIi iiiiiIIiIi9 = IiIIiIiiiI4;
        IiIIiIiiiI4.IiIIiIiiiI.render((class_332)iiiiiIIiIi3, (int)IiIIiIiiiI3, (int)IiIIiIiiiI2, (float)IiIIiIiiiI);
        iiiiiIIiIi9.ALLATORIxDEMO.render((class_332)iiiiiIIiIi3, (int)IiIIiIiiiI3, (int)IiIIiIiiiI2, (float)IiIIiIiiiI);
        iiiiiIIiIi iiiiiIIiIi10 = IiIIiIiiiI4;
        iiiiiIIiIi8.drawCenteredTextWithShadow(iiiiiIIiIi10.textRenderer, iiiiiIIiIi10.iiiiiIIiiI, IiIIiIiiiI4.width / --2, IiIIiIiiiI4.height / (1 ^ 3) + (0x7F & 0x37), 0xFF0000);
        super.render((class_332)iiiiiIIiIi8, (int)IiIIiIiiiI3, (int)IiIIiIiiiI2, (float)IiIIiIiiiI);
    }

    public void init() {
        iiiiiIIiIi iiiiiIIiIi2;
        iiiiiIIiIi iiiiiIIiIi3 = iiiiiIIiIi2 = this;
        int n = iiiiiIIiIi3.width / --2;
        int n2 = iiiiiIIiIi3.height / (1 ^ 3);
        iiiiiIIiIi iiiiiIIiIi4 = iiiiiIIiIi2;
        iiiiiIIiIi2.IiIIiIiiiI = new class_342(iiiiiIIiIi2.textRenderer, n - (0x77 & 0x6C), n2 - (0x3B & 0x6C), 0x3C9 & 0x7CFE, 0x7E & 0x15, (class_2561)class_2561.literal((String)MySettings.ALLATORIxDEMO("\u7512\u621f\u542a")));
        iiiiiIIiIi iiiiiIIiIi5 = iiiiiIIiIi2;
        iiiiiIIiIi3.ALLATORIxDEMO = new class_342(iiiiiIIiIi2.textRenderer, n - (0x76 & 0x6D), n2 - (0x7A & 0xF), 0x9D9 & 0x76EE, 0x74 & 0x1F, (class_2561)class_2561.literal((String)IiIiIIiIII.ALLATORIxDEMO("\u5bd9\u780a")));
        iiiiiIIiIi3.addSelectableChild((class_364)iiiiiIIiIi3.IiIIiIiiiI);
        iiiiiIIiIi iiiiiIIiIi6 = iiiiiIIiIi2;
        iiiiiIIiIi6.addSelectableChild((class_364)iiiiiIIiIi6.ALLATORIxDEMO);
        iiiiiIIiIi3.addDrawableChild((class_364)class_4185.builder((class_2561)class_2561.literal((String)MySettings.ALLATORIxDEMO("\u7653\u5f72")), class_41852 -> {
            iiiiiIIiIi iiiiiIIiIi2 = iiiiiIIiIi3;
            iiiiiIIiIi iiiiiIIiIi3 = class_41852;
            iiiiiIIiIi IiIIiIiiiI = iiiiiIIiIi2;
            IiIIiIiiiI.ALLATORIxDEMO();
        }).dimensions(n - (0x67 & 0x7C), n2 + (0x3F & 0x59), 0x5E & 0x7B, 0x57 & 0x3C).build());
        iiiiiIIiIi2.addDrawableChild((class_364)class_4185.builder((class_2561)class_2561.literal((String)IiIiIIiIII.ALLATORIxDEMO("\u7af4\u5358\u8d32\u4e7b")), IiIIiIiiiI -> class_156.getOperatingSystem().open(iiIIIIiIII)).dimensions(n - (0x7C & 0x67), n2 + (0x32 & 0x7F), 0x16D8 & 0x69EF, 0x55 & 0x3E).build());
        iiiiiIIiIi2.addDrawableChild((class_364)class_4185.builder((class_2561)class_2561.literal((String)MySettings.ALLATORIxDEMO("\u9035\u51c0\u6e10\u6228")), IiIIiIiiiI -> class_310.getInstance().scheduleStop()).dimensions(n + (0x5B & 0x2E), n2 + (0x5F & 0x39), 0x5F & 0x7A, 0x35 & 0x5E).build());
    }

    public boolean shouldCloseOnEsc() {
        return (3 ^ 3) != 0;
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iiiiiIIiIi iiiiiIIiIi2 = this;
        iiiiiIIiIi2.IiIIiIiiiI.getText();
        iiiiiIIiIi2.ALLATORIxDEMO.getText();
        iiiiIiiiIi.ALLATORIxDEMO(--1 != 0);
        iiiiiIIiIi2.iiiiiIIiiI = "\u767b\u5f55\u6210\u529f\uff01";
        class_310.getInstance().setScreen((class_437)new class_442());
    }
}

