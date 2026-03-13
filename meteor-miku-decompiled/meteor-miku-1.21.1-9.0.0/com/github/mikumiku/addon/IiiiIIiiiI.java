/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 */
package com.github.mikumiku.addon;

import java.util.Date;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiiIIiiiI {
    public float iiiiiIIiiI;
    public float iiIIIIiIII;
    public int IiIIiIiiiI;
    public int ALLATORIxDEMO;

    public IiiiIIiiiI(class_243 class_2432) {
        class_310 class_3102;
        IiiiIIiiiI IiIIiIiiiI;
        IiiiIIiiiI iiiiIIiiiI = object;
        Object object = class_2432;
        IiiiIIiiiI iiiiIIiiiI2 = IiIIiIiiiI = iiiiIIiiiI;
        IiIIiIiiiI.ALLATORIxDEMO = 2 & 5;
        iiiiIIiiiI2.IiIIiIiiiI = 0x65 & 0x7E;
        class_310 class_3103 = class_3102 = class_310.getInstance();
        float[] fArray = IiIIiIiiiI.ALLATORIxDEMO(class_3102.player.getPos().add(0.0, (double)class_3103.player.getEyeHeight(class_3103.player.getPose()), 0.0), (class_243)object);
        object = fArray;
        iiiiIIiiiI2.iiIIIIiIII = fArray[5 >> 3];
        iiiiIIiiiI2.iiiiiIIiiI = (float)object[4 ^ 5];
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ float[] ALLATORIxDEMO(class_243 class_2432, class_243 class_2433) {
        void IiIIiIiiiI22;
        IiiiIIiiiI iiiiIIiiiI = iiiiIIiiiI2;
        IiiiIIiiiI iiiiIIiiiI2 = class_2432;
        IiiiIIiiiI IiIIiIiiiI = iiiiIIiiiI;
        void v1 = IiIIiIiiiI22;
        double d = v1.x - ((class_243)iiiiIIiiiI2).x;
        double d2 = v1.y - ((class_243)iiiiIIiiiI2).y;
        double d3 = v1.z - ((class_243)iiiiIIiiiI2).z;
        double d4 = d;
        double d5 = d3;
        double d6 = Math.sqrt(d4 * d4 + d5 * d5);
        float this2 = (float)Math.toDegrees(Math.atan2(d3, d)) - 90.0f;
        float IiIIiIiiiI22 = (float)(-Math.toDegrees(Math.atan2(d2, d6)));
        float[] fArray = new float[1 ^ 3];
        fArray[3 >> 2] = class_3532.wrapDegrees((float)this2);
        fArray[5 >> 2] = class_3532.wrapDegrees((float)IiIIiIiiiI22);
        return fArray;
    }

    public int IiiiiiiIIi() {
        return this.IiIIiIiiiI;
    }

    public float IiiiiiiIIi() {
        return this.iiiiiIIiiI;
    }

    public int ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public float ALLATORIxDEMO() {
        return this.iiIIIIiIII;
    }

    public IiiiIIiiiI IiiiiiiIIi(int n) {
        int n2 = n;
        IiiiIIiiiI IiIIiIiiiI = this;
        IiIIiIiiiI.IiIIiIiiiI = n2;
        return IiIIiIiiiI;
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = --3;
        int n2 = --4;
        int n3 = string2.length();
        int n4 = n3 - (3 & 5);
        char[] cArray = new char[n3];
        int n5 = n2 << n2 ^ --3;
        int cfr_ignored_0 = (5 >> 1 ^ --5) << --4 ^ (5 >> 1 ^ --5);
        int n6 = n << n ^ --4;
        int n7 = IiIIiIiiiI = string3.length() - (5 >> 2);
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

    /*
     * WARNING - void declaration
     */
    public IiiiIIiiiI(float f, float f2) {
        void IiIIiIiiiI;
        IiiiIIiiiI IiIIiIiiiI2;
        float f3 = f2;
        IiiiIIiiiI iiiiIIiiiI = IiIIiIiiiI2 = this;
        IiiiIIiiiI iiiiIIiiiI2 = IiIIiIiiiI2;
        iiiiIIiiiI2.ALLATORIxDEMO = 3 >> 2;
        iiiiIIiiiI2.IiIIiIiiiI = 0x6E & 0x75;
        iiiiIIiiiI.iiIIIIiIII = IiIIiIiiiI;
        iiiiIIiiiI.iiiiiIIiiI = f3;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public void IiiiiiiIIi(float f) {
        float f2 = f;
        IiiiIIiiiI IiIIiIiiiI = this;
        IiIIiIiiiI.iiiiiIIiiI = f2;
    }

    public void ALLATORIxDEMO(float f) {
        float f2 = f;
        IiiiIIiiiI IiIIiIiiiI = this;
        IiIIiIiiiI.iiIIIIiIII = f2;
    }

    public IiiiIIiiiI ALLATORIxDEMO(int n) {
        int n2 = n;
        IiiiIIiiiI IiIIiIiiiI = this;
        IiIIiIiiiI.ALLATORIxDEMO = n2;
        return IiIIiIiiiI;
    }
}

