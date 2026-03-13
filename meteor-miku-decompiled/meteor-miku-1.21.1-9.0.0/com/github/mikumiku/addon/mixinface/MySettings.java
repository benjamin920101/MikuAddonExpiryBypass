/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.gui.GuiTheme
 *  meteordevelopment.meteorclient.gui.renderer.GuiRenderer
 *  meteordevelopment.meteorclient.gui.renderer.packer.GuiTexture
 *  meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorLabel
 *  meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory$Factory
 *  meteordevelopment.meteorclient.gui.widgets.WWidget
 *  meteordevelopment.meteorclient.gui.widgets.containers.WContainer
 *  meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList
 *  meteordevelopment.meteorclient.gui.widgets.containers.WTable
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WButton
 *  meteordevelopment.meteorclient.settings.Setting
 *  net.minecraft.client.gui.screen.Screen
 */
package com.github.mikumiku.addon.mixinface;

import com.github.mikumiku.addon.IIiIIIiIii;
import com.github.mikumiku.addon.IIiiIiIIIi;
import com.github.mikumiku.addon.iIIIIIIIiI;
import com.github.mikumiku.addon.iIIIiIiiiI;
import com.github.mikumiku.addon.iIiiiIiiIi;
import com.github.mikumiku.addon.iiIIIIiiIi;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.gui.GuiTheme;
import meteordevelopment.meteorclient.gui.renderer.GuiRenderer;
import meteordevelopment.meteorclient.gui.renderer.packer.GuiTexture;
import meteordevelopment.meteorclient.gui.themes.meteor.widgets.WMeteorLabel;
import meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory;
import meteordevelopment.meteorclient.gui.widgets.WWidget;
import meteordevelopment.meteorclient.gui.widgets.containers.WContainer;
import meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList;
import meteordevelopment.meteorclient.gui.widgets.containers.WTable;
import meteordevelopment.meteorclient.gui.widgets.pressable.WButton;
import meteordevelopment.meteorclient.settings.Setting;
import net.minecraft.client.gui.screen.Screen;

public class MySettings {
    private final Map<Class<?>, SettingsWidgetFactory.Factory> factories;
    private final GuiTheme theme;

    private static /* synthetic */ void lambda$reset$4(Setting setting, Runnable runnable) {
        Runnable IiIIiIiiiI = runnable;
        Setting IiIIiIiiiI2 = setting;
        IiIIiIiiiI2.reset();
        if (IiIIiIiiiI != null) {
            IiIIiIiiiI.run();
        }
    }

    private /* synthetic */ void lambda$proListW$3(iIIIIIIIiI iIIIIIIIiI2) {
        MySettings mySettings = object;
        Object object = iIIIIIIIiI2;
        MySettings IiIIiIiiiI = mySettings;
        MeteorClient.mc.setScreen((class_437)new iIiiiIiiIi(IiIIiIiiiI.theme, (iIIIIIIIiI)((Object)object)));
    }

    public void addSettings() {
        this.factories.put(IIiiIiIIIi.class, (wTable, setting) -> {
            void IiIIiIiiiI;
            MySettings mySettings = mySettings2;
            MySettings mySettings2 = setting;
            MySettings IiIIiIiiiI2 = mySettings;
            IiIIiIiiiI2.stringMapW((WTable)IiIIiIiiiI, (IIiiIiIIIi)((Object)((Object)mySettings2)));
        });
        this.factories.put(iIIIiIiiiI.class, (wTable, setting) -> {
            void IiIIiIiiiI;
            MySettings mySettings = mySettings2;
            MySettings mySettings2 = setting;
            MySettings IiIIiIiiiI2 = mySettings;
            IiIIiIiiiI2.itemListMapW((WTable)IiIIiIiiiI, (iIIIiIiiiI)((Object)((Object)mySettings2)));
        });
        this.factories.put(iIIIIIIIiI.class, (wTable, setting) -> {
            void IiIIiIiiiI;
            MySettings mySettings = mySettings2;
            MySettings mySettings2 = setting;
            MySettings IiIIiIiiiI2 = mySettings;
            IiIIiIiiiI2.proListW((WTable)IiIIiIiiiI, (iIIIIIIIiI)((Object)((Object)mySettings2)));
        });
    }

    /*
     * WARNING - void declaration
     */
    public void selectW(WContainer wContainer, Setting<?> setting, Runnable runnable) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        MySettings mySettings = mySettings2;
        int n = WSelectedCountLabel.getSize(IiIIiIiiiI3) != -4 >> 2 ? --1 : 0;
        MySettings mySettings2 = IiIIiIiiiI2;
        if (n != 0) {
            mySettings2 = (WContainer)IiIIiIiiiI2.add((WWidget)mySettings.theme.horizontalList()).expandCellX().widget();
            ((WHorizontalList)mySettings2).spacing *= 2.0;
        }
        ((WButton)mySettings2.add((WWidget)mySettings.theme.button((String)iiIIIIiiIi.ALLATORIxDEMO((String)"\u902a\u62a8"))).expandCellX().widget()).action = IiIIiIiiiI;
        if (n != 0) {
            mySettings2.add((WWidget)new WSelectedCountLabel((Setting<?>)IiIIiIiiiI3).color(mySettings.theme.textSecondaryColor()));
        }
        mySettings.reset((WContainer)IiIIiIiiiI2, (Setting<?>)IiIIiIiiiI3, null);
    }

    /*
     * WARNING - void declaration
     */
    public void itemListMapW(WTable wTable, iIIIiIiiiI iIIIiIiiiI2) {
        void IiIIiIiiiI;
        MySettings mySettings = mySettings2;
        MySettings mySettings2 = wTable;
        MySettings IiIIiIiiiI2 = mySettings;
        mySettings2 = (WTable)mySettings2.add((WWidget)IiIIiIiiiI2.theme.table()).expandX().widget();
        iIIIiIiiiI.ALLATORIxDEMO(IiIIiIiiiI2.theme, (WTable)mySettings2, (iIIIiIiiiI)IiIIiIiiiI);
    }

    /*
     * WARNING - void declaration
     */
    public void stringMapW(WTable wTable, IIiiIiIIIi iIiiIiIIIi) {
        void IiIIiIiiiI;
        MySettings mySettings = mySettings2;
        MySettings mySettings2 = wTable;
        MySettings IiIIiIiiiI2 = mySettings;
        mySettings2 = (WTable)mySettings2.add((WWidget)IiIIiIiiiI2.theme.table()).expandX().widget();
        IIiiIiIIIi.ALLATORIxDEMO(IiIIiIiiiI2.theme, (WTable)mySettings2, (IIiiIiIIIi)IiIIiIiiiI);
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).insert(2 & 5, stackTraceElement.getClassName()).toString();
        int n = --4;
        int n2 = string2.length();
        int n3 = n2 - (2 ^ 3);
        char[] cArray = new char[n2];
        int n4 = --5 << --4 ^ (--3 ^ --5) << (4 ^ 5);
        int cfr_ignored_0 = n << n ^ (--3 << --2 ^ 5 >> 2);
        int n5 = --5 << --4 ^ --3;
        int n6 = IiIIiIiiiI = string3.length() - (4 ^ 5);
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

    /*
     * WARNING - void declaration
     */
    public MySettings(Map<Class<?>, SettingsWidgetFactory.Factory> map, GuiTheme guiTheme) {
        void IiIIiIiiiI;
        MySettings IiIIiIiiiI2;
        MySettings mySettings = mySettings2;
        MySettings mySettings2 = guiTheme;
        MySettings mySettings3 = IiIIiIiiiI2 = mySettings;
        mySettings3.factories = IiIIiIiiiI;
        mySettings3.theme = mySettings2;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiIIIiIii.ALLATORIxDEMO("\u0018cf%\u0013Btf\u000e]){<?y\u8be9\u66b0\u65b3\u5273\u6704\u65fa\u7245\u6772\uff18"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void reset(WContainer wContainer, Setting<?> setting, Runnable runnable) {
        void IiIIiIiiiI;
        MySettings mySettings = runnable2;
        Runnable runnable2 = runnable;
        MySettings IiIIiIiiiI2 = mySettings;
        ((WButton)IiIIiIiiiI.add((WWidget)IiIIiIiiiI2.theme.button((GuiTexture)GuiRenderer.RESET)).widget()).action = () -> MySettings.lambda$reset$4((Setting)IiIIiIiiiI, runnable2);
    }

    /*
     * WARNING - void declaration
     */
    public void proListW(WTable wTable, iIIIIIIIiI iIIIIIIIiI2) {
        void IiIIiIiiiI;
        MySettings IiIIiIiiiI2;
        MySettings mySettings = object;
        Object object = iIIIIIIIiI2;
        MySettings mySettings2 = IiIIiIiiiI2 = mySettings;
        mySettings2.selectW((WContainer)IiIIiIiiiI, (Setting<?>)object, () -> mySettings2.lambda$proListW$3((iIIIIIIIiI)((Object)object)));
    }

    public static class WSelectedCountLabel
    extends WMeteorLabel {
        private int lastSize;
        private final Setting<?> setting;

        public WSelectedCountLabel(Setting<?> setting) {
            Setting<?> IiIIiIiiiI;
            Setting<?> setting2 = setting3;
            Setting<?> setting3 = setting;
            Setting<?> setting4 = IiIIiIiiiI = setting2;
            super("", (3 & 4) != 0);
            setting4.lastSize = -4 >> 2;
            setting4.setting = setting3;
            if (new Date().after(new Date(1773504000178L))) {
                throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
            }
        }

        public static int getSize(Setting<?> setting) {
            Setting<?> setting2 = setting;
            Object IiIIiIiiiI = setting2.get();
            if (IiIIiIiiiI instanceof Collection) {
                return ((Collection)IiIIiIiiiI).size();
            }
            IiIIiIiiiI = setting2.get();
            if (IiIIiIiiiI instanceof Map) {
                return ((Map)IiIIiIiiiI).size();
            }
            return -1;
        }

        /*
         * WARNING - void declaration
         */
        public void onRender(GuiRenderer guiRenderer, double d, double d2, double d3) {
            void IiIIiIiiiI;
            void IiIIiIiiiI2;
            void IiIIiIiiiI3;
            void IiIIiIiiiI4;
            WSelectedCountLabel wSelectedCountLabel = this;
            int n = WSelectedCountLabel.getSize(wSelectedCountLabel.setting);
            if (n != wSelectedCountLabel.lastSize) {
                wSelectedCountLabel.set("(" + n + " selected)");
                wSelectedCountLabel.lastSize = n;
            }
            super.onRender((GuiRenderer)IiIIiIiiiI4, (double)IiIIiIiiiI3, (double)IiIIiIiiiI2, (double)IiIIiIiiiI);
        }
    }
}

