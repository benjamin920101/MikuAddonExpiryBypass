/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import java.awt.Color;
import java.util.Date;

public class iIiIIIiiiI {
    public iIiIIIiiiI() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    /*
     * WARNING - void declaration
     */
    public static Color ALLATORIxDEMO(Color color, int n, int n2, double d) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        double IiIIiIiiiI3;
        Color color2 = color;
        Object IiIIiIiiiI4 = new float[--3];
        Color.RGBtoHSB(color2.getRed(), color2.getGreen(), color2.getBlue(), (float[])IiIIiIiiiI4);
        IiIIiIiiiI3 = Math.abs(((double)System.currentTimeMillis() * IiIIiIiiiI3 % 2000.0 / (double)Float.intBitsToFloat(Float.floatToIntBits(0.0013786979f) ^ 0x7ECEB56D) + (double)((float)IiIIiIiiiI2 / (float)IiIIiIiiiI * Float.intBitsToFloat(Float.floatToIntBits(0.09192204f) ^ 0x7DBC419F))) % (double)Float.intBitsToFloat(Float.floatToIntBits(0.7858098f) ^ 0x7F492AD5) - (double)Float.intBitsToFloat(Float.floatToIntBits(6.46708f) ^ 0x7F4EF252));
        IiIIiIiiiI3 = (double)Float.intBitsToFloat(Float.floatToIntBits(18.996923f) ^ 0x7E97F9B3) + (double)Float.intBitsToFloat(Float.floatToIntBits(2.7958195f) ^ 0x7F32EEB5) * IiIIiIiiiI3;
        IiIIiIiiiI4[5 >> 1] = (float)(IiIIiIiiiI3 % (double)Float.intBitsToFloat(Float.floatToIntBits(0.8992331f) ^ 0x7F663424));
        return new Color(Color.HSBtoRGB((float)IiIIiIiiiI4[5 >> 3], (float)IiIIiIiiiI4[3 & 5], (float)IiIIiIiiiI4[5 >> 1]));
    }

    public static Color ALLATORIxDEMO(Color color, Color color2, double d) {
        double IiIIiIiiiI;
        Color IiIIiIiiiI2 = color;
        Color IiIIiIiiiI222 = color2;
        if (IiIIiIiiiI2 == IiIIiIiiiI222) {
            return IiIIiIiiiI2;
        }
        IiIIiIiiiI = Math.min(Math.max(IiIIiIiiiI, 0.0), 1.0);
        Color color3 = IiIIiIiiiI2;
        int n = color3.getRed();
        int n2 = color3.getGreen();
        int n3 = color3.getBlue();
        int n4 = color3.getAlpha();
        Color color4 = IiIIiIiiiI222;
        int IiIIiIiiiI222 = color4.getRed();
        int n5 = color4.getGreen();
        int n6 = color4.getBlue();
        int n7 = color4.getAlpha();
        return new Color(Math.min((int)((double)n + (double)(IiIIiIiiiI222 - n) * IiIIiIiiiI), 0x69FF & 0x16FF), Math.min((int)((double)n2 + (double)(n5 - n2) * IiIIiIiiiI), 0x2DFF & 0x52FF), Math.min((int)((double)n3 + (double)(n6 - n3) * IiIIiIiiiI), 0x25FF & 0x5AFF), Math.min((int)((double)n4 + (double)(n7 - n4) * IiIIiIiiiI), 0x1DFF & 0x62FF));
    }

    /*
     * WARNING - void declaration
     */
    public static int ALLATORIxDEMO(int n, int n2, int n3, int n4) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        int IiIIiIiiiI3 = n4;
        int IiIIiIiiiI4 = n;
        return (IiIIiIiiiI4 << (0x1B & 0x74)) + (IiIIiIiiiI2 << (0x2F & 0x58)) + IiIIiIiiiI + (IiIIiIiiiI3 << (0x1B & 0x7C));
    }

    /*
     * WARNING - void declaration
     */
    public static Color ALLATORIxDEMO(Color color, Color color2, int n, int n2, double d) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        double IiIIiIiiiI3;
        int IiIIiIiiiI4 = n2;
        Color IiIIiIiiiI5 = color;
        IiIIiIiiiI3 = Math.abs(((double)System.currentTimeMillis() * IiIIiIiiiI3 % 2000.0 / (double)Float.intBitsToFloat(Float.floatToIntBits(0.0013786979f) ^ 0x7ECEB56D) + (double)IiIIiIiiiI2 / (double)IiIIiIiiiI4 * (double)Float.intBitsToFloat(Float.floatToIntBits(0.09192204f) ^ 0x7DBC419F)) % (double)Float.intBitsToFloat(Float.floatToIntBits(0.7858098f) ^ 0x7F492AD5) - (double)Float.intBitsToFloat(Float.floatToIntBits(6.46708f) ^ 0x7F4EF252)) % (double)Float.intBitsToFloat(Float.floatToIntBits(0.8992331f) ^ 0x7F663424);
        return iIiIIIiiiI.ALLATORIxDEMO(IiIIiIiiiI5, (Color)IiIIiIiiiI, IiIIiIiiiI3);
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 >> 1];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(3 & 4, stackTraceElement.getMethodName()).toString();
        int n = string2.length();
        int n2 = n - (4 ^ 5);
        char[] cArray = new char[n];
        int n3 = --5 << --3 ^ (1 ^ 3 ^ --5);
        int cfr_ignored_0 = --5 << --3 ^ --3;
        int n4 = --5 << --4 ^ (5 >> 1 ^ --5) << --1;
        int n5 = IiIIiIiiiI = string3.length() - (2 ^ 3);
        int n6 = n2;
        String string4 = string3;
        while (n6 >= 0) {
            int n7 = n2--;
            cArray[n7] = (char)(n4 ^ (string2.charAt(n7) ^ string4.charAt(IiIIiIiiiI)));
            if (n2 < 0) break;
            int n8 = n2--;
            char c = cArray[n8] = (char)(n3 ^ (string2.charAt(n8) ^ string4.charAt(IiIIiIiiiI)));
            if (--IiIIiIiiiI < 0) {
                IiIIiIiiiI = n5;
            }
            n6 = n2;
        }
        return new String(cArray);
    }

    public static int ALLATORIxDEMO(int n, int n2) {
        int IiIIiIiiiI = n2;
        int IiIIiIiiiI2 = n;
        return iIiIIIiiiI.ALLATORIxDEMO(new Color(IiIIiIiiiI2).getRed(), new Color(IiIIiIiiiI2).getGreen(), new Color(IiIIiIiiiI2).getBlue(), IiIIiIiiiI);
    }

    /*
     * WARNING - void declaration
     */
    public static Color ALLATORIxDEMO(Color color, int n) {
        void IiIIiIiiiI;
        int IiIIiIiiiI2;
        int n2 = n;
        Color color2 = color;
        IiIIiIiiiI2 = Math.max(Math.min(0x3BFF & 0x44FF, IiIIiIiiiI2), 3 >> 2);
        return new Color(IiIIiIiiiI.getRed(), IiIIiIiiiI.getGreen(), IiIIiIiiiI.getBlue(), IiIIiIiiiI2);
    }
}

