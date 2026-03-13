/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.mixininterface.IChatHud
 *  meteordevelopment.meteorclient.systems.config.Config
 *  net.minecraft.util.Formatting
 *  net.minecraft.text.Text
 *  net.minecraft.text.Style
 *  net.minecraft.text.MutableText
 *  org.jetbrains.annotations.Nullable
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiiiIIii;
import com.github.mikumiku.addon.iIiIIIiiiI;
import com.github.mikumiku.addon.mixinface.MoveEvent;
import com.mojang.brigadier.StringReader;
import java.awt.Color;
import java.util.Date;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.mixininterface.IChatHud;
import meteordevelopment.meteorclient.systems.config.Config;
import net.minecraft.util.Formatting;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.text.MutableText;
import org.jetbrains.annotations.Nullable;

public class iiiiIiiiII {
    public static String ALLATORIxDEMO = "";

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(int n, @Nullable String string, @Nullable class_124 class_1242, class_124 class_1243, String string2, Object ... objectArray) {
        void prefixColor;
        void prefixTitle;
        void args;
        void messageContent;
        class_124 id = class_1243;
        int messageColor = n;
        id = iiiiIiiiII.IiiiiiiIIi(String.format((String)messageContent, (Object[])args), id);
        iiiiIiiiII.ALLATORIxDEMO(messageColor, (String)prefixTitle, (class_124)prefixColor, (class_2561)id);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ class_5250 IiiiiiiIIi(String string, class_124 class_1242) {
        void IiIIiIiiiI;
        String string2 = string;
        StringReader stringReader = new StringReader(string2);
        class_5250 class_52502 = class_2561.empty();
        String IiIIiIiiiI2 = class_2583.EMPTY.withFormatting((class_124)IiIIiIiiiI);
        StringBuilder stringBuilder = new StringBuilder();
        int n = 5 >> 3;
        while (stringReader.canRead()) {
            int n2;
            block15: {
                char c = stringReader.read();
                if (c == (0x6B & 0x3C)) {
                    class_52502.append((class_2561)class_2561.literal((String)stringBuilder.toString()).setStyle((class_2583)IiIIiIiiiI2));
                    StringBuilder stringBuilder2 = stringBuilder;
                    stringBuilder2.setLength(3 & 4);
                    stringBuilder2.append(c);
                    int cfr_ignored_0 = --1;
                    continue;
                }
                stringBuilder.append(c);
                if (n == 0) continue;
                if (c != (0x79 & 0x2F)) continue;
                String string3 = stringBuilder.toString();
                int n3 = -4 >> 2;
                switch (string3.hashCode()) {
                    case 1360546352: {
                        if (!string3.equals(iIiIIIiiiI.ALLATORIxDEMO("\u001f\"R V\u0013{\u0012>"))) break;
                        n2 = n3 = 3 >> 2;
                        break block15;
                    }
                    case 1493694493: {
                        if (!string3.equals(MoveEvent.ALLATORIxDEMO("O(.'/,.\u0007\u000f\u0014N"))) break;
                        n2 = n3 = 5 >> 2;
                        break block15;
                    }
                    case -634715899: {
                        if (!string3.equals(iIiIIIiiiI.ALLATORIxDEMO("?3Y\"R4[\u000fy\u0003>"))) break;
                        n2 = n3 = --2;
                        break block15;
                    }
                    case 1239084828: {
                        if (!string3.equals(MoveEvent.ALLATORIxDEMO("h%\u000f\u000b\u0004N"))) break;
                        n3 = --3;
                    }
                }
                n2 = n3;
            }
            switch (n2) {
                case 0: {
                    IiIIiIiiiI2 = IiIIiIiiiI2.withFormatting((class_124)IiIIiIiiiI);
                    stringBuilder.setLength(2 & 5);
                    break;
                }
                case 1: {
                    IiIIiIiiiI2 = IiIIiIiiiI2.withFormatting(class_124.WHITE);
                    stringBuilder.setLength(5 >> 3);
                    break;
                }
                case 2: {
                    IiIIiIiiiI2 = IiIIiIiiiI2.withFormatting(class_124.UNDERLINE);
                    stringBuilder.setLength(2 & 5);
                    break;
                }
                case 3: {
                    IiIIiIiiiI2 = IiIIiIiiiI2.withFormatting(class_124.BOLD);
                    stringBuilder.setLength(3 ^ 3);
                    break;
                }
            }
            n = 0;
        }
        if (!stringBuilder.isEmpty()) {
            class_52502.append((class_2561)class_2561.literal((String)stringBuilder.toString()).setStyle((class_2583)IiIIiIiiiI2));
        }
        return class_52502;
    }

    public static void IiiiiiiiII(String IiIIiIiiiI) {
        if (IiIIiIiiiI == null) {
            return;
        }
        if (IiIIiIiiiI.equals(ALLATORIxDEMO)) {
            return;
        }
        iiiiIiiiII.ALLATORIxDEMO("\u00a7a " + IiIIiIiiiI);
        ALLATORIxDEMO = IiIIiIiiiI;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ class_5250 ALLATORIxDEMO(String string, class_124 class_1242) {
        void IiIIiIiiiI;
        String IiIIiIiiiI2;
        String string2 = string;
        String string3 = IiIIiIiiiI2 = class_2561.empty();
        IiIIiIiiiI2.setStyle(IiIIiIiiiI2.getStyle().withFormatting(class_124.GRAY));
        string3.append(iIiIIIiiiI.ALLATORIxDEMO("L"));
        class_5250 class_52502 = class_2561.literal((String)string2);
        class_52502.setStyle(class_52502.getStyle().withFormatting((class_124)IiIIiIiiiI));
        IiIIiIiiiI2.append((class_2561)class_52502);
        IiIIiIiiiI2.append(MoveEvent.ALLATORIxDEMO("=G"));
        return string3;
    }

    public iiiiIiiiII() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIiIIIiiiI.ALLATORIxDEMO("\u0011\\d\u00115RfB6S'C\u00036f\u8bc0\u66b2\u6587\u5276\u6737\u65d6\u725f\u674a\uff16"));
        }
    }

    public static void iIIiiiIiiI(String IiIIiIiiiI) {
        if (IiIIiIiiiI == null) {
            return;
        }
        if (IiIIiIiiiI.equals(ALLATORIxDEMO)) {
            return;
        }
        String string = IiIIiIiiiI;
        iiiiIiiiII.ALLATORIxDEMO(string);
        ALLATORIxDEMO = string;
    }

    public static class_2561 ALLATORIxDEMO() {
        int n;
        String string = MoveEvent.ALLATORIxDEMO("\r.+2-\u000e\u000b\u0012");
        Color color = new Color(3 ^ 3, 0x7AFF & 0x5FF, 0x11F7 & 0x6EFF);
        Color color2 = new Color(0x70 & 0x3F, 0x649B & 0x1BFF, 0x16BA & 0x69FF);
        char[] cArray = string.toCharArray();
        class_5250 class_52502 = class_2561.empty();
        int n2 = cArray.length;
        int n3 = n = 2 & 5;
        while (n3 < n2) {
            char c = cArray[n];
            double d = (double)n / (double)(n2 - --1);
            Color color3 = iIiIIIiiiI.ALLATORIxDEMO(color, color2, d);
            class_52502.append((class_2561)class_2561.literal((String)String.valueOf(c)).setStyle(class_2583.EMPTY.withColor(color3.getRGB())));
            n3 = ++n;
        }
        class_52502 = class_2561.literal((String)iIiIIIiiiI.ALLATORIxDEMO("L")).append((class_2561)class_52502).append(MoveEvent.ALLATORIxDEMO("=G"));
        return class_52502;
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(class_2561 class_25612, int n) {
        class_2561 class_25613 = class_25612;
        if (MeteorClient.mc.world == null) {
            return;
        }
        class_2561 IiIIiIiiiI = class_2561.empty();
        IiIIiIiiiI.setStyle(class_2583.EMPTY.withFormatting(class_124.GRAY));
        IiIIiIiiiI.append(iiiiIiiiII.ALLATORIxDEMO());
        IiIIiIiiiI.append(class_25613);
        try {
            void IiIIiIiiiI2;
            ((IChatHud)MeteorClient.mc.inGameHud.getChatHud()).meteor$add(IiIIiIiiiI, (int)IiIIiIiiiI2);
            return;
        } catch (Exception IiIIiIiiiI2) {
            IiIIiIiiiI2.printStackTrace();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(int n, @Nullable String string, @Nullable class_124 class_1242, String string2, class_124 class_1243) {
        void prefixColor;
        void prefixTitle;
        void messageColor;
        String id = string2;
        int messageContent = n;
        id = iiiiIiiiII.IiiiiiiIIi(id, (class_124)messageColor);
        iiiiIiiiII.ALLATORIxDEMO(messageContent, (String)prefixTitle, (class_124)prefixColor, (class_2561)id);
    }

    public static void IiiIIIIiiI(String IiIIiIiiiI) {
        if (IiIIiIiiiI == null) {
            return;
        }
        if (IiIIiIiiiI.equals(ALLATORIxDEMO)) {
            return;
        }
        new IIIiiiIIii(50L).ALLATORIxDEMO(() -> iiiiIiiiII.ALLATORIxDEMO(class_2561.of((String)IiIIiIiiiI)));
        ALLATORIxDEMO = IiIIiIiiiI;
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(int n, @Nullable String string, @Nullable class_124 class_1242, class_2561 class_25612) {
        void msg;
        void prefixTitle;
        int n2 = n;
        if (MeteorClient.mc.world == null) {
            return;
        }
        class_5250 id = class_2561.empty();
        id.append(iiiiIiiiII.ALLATORIxDEMO());
        if (prefixTitle != null) {
            void prefixColor;
            id.append((class_2561)iiiiIiiiII.ALLATORIxDEMO((String)prefixTitle, (class_124)prefixColor));
        }
        id.append((class_2561)msg);
        if (!((Boolean)Config.get().deleteChatFeedback.get()).booleanValue()) {
            n2 = 2 & 5;
        }
        ((IChatHud)MeteorClient.mc.inGameHud.getChatHud()).meteor$add((class_2561)id, n2);
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(String string, class_2561 object) {
        String IiIIiIiiiI;
        void IiIIiIiiiI2;
        String string2 = string;
        string = object;
        object = string2;
        iiiiIiiiII.ALLATORIxDEMO(3 ^ 3, (String)IiIIiIiiiI2, class_124.LIGHT_PURPLE, (class_2561)IiIIiIiiiI);
    }

    public static void ALLATORIxDEMO(String string, int n) {
        int IiIIiIiiiI = n;
        String IiIIiIiiiI2 = string;
        iiiiIiiiII.ALLATORIxDEMO(class_2561.of((String)IiIIiIiiiI2), IiIIiIiiiI);
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(class_124 objectArray, String string, Object ... objectArray2) {
        class_124 IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        Object[] objectArray3 = objectArray;
        objectArray = objectArray2;
        objectArray2 = objectArray3;
        iiiiIiiiII.ALLATORIxDEMO(3 ^ 3, null, null, (class_124)IiIIiIiiiI3, (String)IiIIiIiiiI2, (Object[])IiIIiIiiiI);
    }

    public static void IiiiiiiIIi(String IiIIiIiiiI) {
        if (IiIIiIiiiI == null) {
            return;
        }
        if (IiIIiIiiiI.equals(ALLATORIxDEMO)) {
            return;
        }
        iiiiIiiiII.ALLATORIxDEMO("\u00a7c " + IiIIiIiiiI);
        ALLATORIxDEMO = IiIIiIiiiI;
    }

    public static void ALLATORIxDEMO(class_2561 class_25612) {
        class_2561 class_25613 = class_25612;
        if (MeteorClient.mc.world == null) {
            return;
        }
        class_2561 IiIIiIiiiI = class_2561.empty();
        IiIIiIiiiI.setStyle(class_2583.EMPTY.withFormatting(class_124.GRAY));
        IiIIiIiiiI.append(iiiiIiiiII.ALLATORIxDEMO());
        IiIIiIiiiI.append(class_25613);
        ((IChatHud)MeteorClient.mc.inGameHud.getChatHud()).meteor$add(IiIIiIiiiI, 2 & 5);
    }

    public static void ALLATORIxDEMO(String IiIIiIiiiI) {
        if (IiIIiIiiiI == null) {
            return;
        }
        if (IiIIiIiiiI.equals(ALLATORIxDEMO)) {
            return;
        }
        String string = IiIIiIiiiI;
        iiiiIiiiII.ALLATORIxDEMO(class_2561.of((String)string));
        ALLATORIxDEMO = string;
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(int n, class_124 class_1242, String string, Object ... objectArray) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        Object[] IiIIiIiiiI3 = objectArray;
        int IiIIiIiiiI4 = n;
        iiiiIiiiII.ALLATORIxDEMO(IiIIiIiiiI4, null, null, (class_124)IiIIiIiiiI2, (String)IiIIiIiiiI, IiIIiIiiiI3);
    }
}

