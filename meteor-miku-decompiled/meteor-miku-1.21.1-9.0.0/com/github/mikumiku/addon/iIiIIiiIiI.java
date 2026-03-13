/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  net.minecraft.util.math.BlockPos
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iiIIIiiIii;
import com.github.mikumiku.addon.iiiiIiiiII;
import com.github.mikumiku.addon.mixinface.MoveEvent;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import net.minecraft.util.math.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiIIiiIiI
implements Serializable {
    public final int iiiiiIIiiI;
    public final int iiIIIIiIII;
    public final boolean IiIIiIiiiI;
    public final int ALLATORIxDEMO;

    public iIiIIiiIiI ALLATORIxDEMO(iIiIIiiIiI iIiIIiiIiI2) {
        iIiIIiiIiI iIiIIiiIiI3 = iIiIIiiIiI4;
        iIiIIiiIiI iIiIIiiIiI4 = iIiIIiiIiI2;
        iIiIIiiIiI IiIIiIiiiI = iIiIIiiIiI3;
        if (!IiIIiIiiiI.IiIIiIiiiI || iIiIIiiIiI4 == null) {
            return IiIIiIiiiI;
        }
        if (IiIIiIiiiI.iiiiiIIiiI < iIiIIiiIiI4.iiiiiIIiiI || IiIIiIiiiI.iiiiiIIiiI == iIiIIiiIiI4.iiiiiIIiiI && IiIIiIiiiI.iiIIIIiIII < iIiIIiiIiI4.iiIIIIiIII) {
            return IiIIiIiiiI;
        }
        return iIiIIiiIiI4;
    }

    public int hashCode() {
        Object[] objectArray = new Object[--3];
        objectArray[2 & 5] = this.iiiiiIIiiI;
        objectArray[5 >> 2] = this.ALLATORIxDEMO;
        objectArray[--2] = this.iiIIIIiIII;
        return Objects.hash(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public double ALLATORIxDEMO(int n, int n2, int n3) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        int n4 = n3;
        iIiIIiiIiI IiIIiIiiiI3 = this;
        return Math.sqrt(Math.pow(IiIIiIiiiI3.iiiiiIIiiI - IiIIiIiiiI2, 2.0) + Math.pow(IiIIiIiiiI3.ALLATORIxDEMO - IiIIiIiiiI, 2.0) + Math.pow(IiIIiIiiiI3.iiIIIIiIII - n4, 2.0));
    }

    public String toString() {
        iIiIIiiIiI iIiIIiiIiI2 = this;
        return "(" + iIiIIiiIiI2.iiiiiIIiiI + ", " + iIiIIiiIiI2.ALLATORIxDEMO + ", " + this.iiIIIIiIII + ")";
    }

    public String ALLATORIxDEMO() {
        iIiIIiiIiI iIiIIiiIiI2 = map;
        Map<String, Boolean> map = Map.of(MoveEvent.ALLATORIxDEMO("\u001f"), iIiIIiiIiI2.iiiiiIIiiI, MoveEvent.ALLATORIxDEMO("\u001e"), iIiIIiiIiI2.ALLATORIxDEMO, MoveEvent.ALLATORIxDEMO("\u001d"), iIiIIiiIiI2.iiIIIIiIII, MoveEvent.ALLATORIxDEMO("\u000e\u0013#/2\"+\u0005$(\"\u0013\u0013"), iIiIIiiIiI2.IiIIiIiiiI);
        return new Gson().toJson((Object)map);
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[4 ^ 5];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).insert(3 ^ 3, stackTraceElement.getMethodName()).toString();
        int n = string2.length();
        int n2 = n - (4 ^ 5);
        char[] cArray = new char[n];
        int n3 = (2 ^ 3) << --3 ^ (--3 ^ --5);
        int cfr_ignored_0 = --2 << --3;
        int n4 = (--3 ^ --5) << --3 ^ --5;
        int n5 = IiIIiIiiiI = string3.length() - (3 & 5);
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

    /*
     * WARNING - void declaration
     */
    public iIiIIiiIiI(int n, int n2, int n3, boolean bl, iIiIIiiIiI iIiIIiiIiI2) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        iIiIIiiIiI IiIIiIiiiI4;
        boolean bl2 = bl;
        iIiIIiiIiI iIiIIiiIiI3 = IiIIiIiiiI4 = this;
        iIiIIiiIiI iIiIIiiIiI4 = IiIIiIiiiI4;
        iIiIIiiIiI4.iiiiiIIiiI = IiIIiIiiiI3;
        iIiIIiiIiI4.ALLATORIxDEMO = IiIIiIiiiI2;
        iIiIIiiIiI3.iiIIIIiIII = IiIIiIiiiI;
        iIiIIiiIiI3.IiIIiIiiiI = this;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(MoveEvent.ALLATORIxDEMO("\u0017,ba3\"@\u00120#\u0001\u0013\u0005F`\u8bb0\u66b4\u65f7\u5250\u6767\u65f0\u720f\u674c\uff66"));
        }
    }

    public static iIiIIiiIiI ALLATORIxDEMO(String string) {
        String string2 = string;
        if (string2 == null || string2.trim().isEmpty()) {
            return null;
        }
        try {
            iiIIIiiIii iiIIIiiIii2 = new iiIIIiiIii();
            Map IiIIiIiiiI22 = (Map)new Gson().fromJson(string2, iiIIIiiIii2.getType());
            if (IiIIiIiiiI22 == null) {
                return null;
            }
            int n = ((Number)IiIIiIiiiI22.get(MoveEvent.ALLATORIxDEMO("\u001f"))).intValue();
            int n2 = ((Number)IiIIiIiiiI22.get(MoveEvent.ALLATORIxDEMO("\u001e"))).intValue();
            int n3 = ((Number)IiIIiIiiiI22.get(MoveEvent.ALLATORIxDEMO("\u001d"))).intValue();
            boolean IiIIiIiiiI22 = Boolean.TRUE.equals(IiIIiIiiiI22.getOrDefault(MoveEvent.ALLATORIxDEMO("\u000e\u0013#/2\"+\u0005$(\"\u0013\u0013"), (3 & 4) != 0));
            return new iIiIIiiIiI(n, n2, n3, IiIIiIiiiI22, null);
        } catch (Exception exception) {
            iiiiIiiiII.ALLATORIxDEMO("Failed to parse ChestLocation from JSON: " + string2);
            return null;
        }
    }

    public boolean equals(Object object) {
        Object IiIIiIiiiI = object2;
        if (IiIIiIiiiI == (object2 = object)) {
            return 3 >> 1;
        }
        if (object2 == null || IiIIiIiiiI.getClass() != object2.getClass()) {
            return false;
        }
        Object object2 = (iIiIIiiIiI)object2;
        if (((iIiIIiiIiI)IiIIiIiiiI).iiiiiIIiiI == ((iIiIIiiIiI)object2).iiiiiIIiiI && ((iIiIIiiIiI)IiIIiIiiiI).ALLATORIxDEMO == ((iIiIIiiIiI)object2).ALLATORIxDEMO && ((iIiIIiiIiI)IiIIiIiiiI).iiIIIIiIII == ((iIiIIiiIiI)object2).iiIIIIiIII) {
            return --1 != 0;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public iIiIIiiIiI(int n, int n2, int n3) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        int n4 = n3;
        iIiIIiiIiI IiIIiIiiiI3 = this;
        IiIIiIiiiI3((int)IiIIiIiiiI2, (int)IiIIiIiiiI, n4, 3 >> 2, null);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(MoveEvent.ALLATORIxDEMO("\u0017,ba3\"@\u00120#\u0001\u0013\u0005F`\u8bb0\u66b4\u65f7\u5250\u6767\u65f0\u720f\u674c\uff66"));
        }
    }

    public class_2338 ALLATORIxDEMO() {
        iIiIIiiIiI iIiIIiiIiI2 = this;
        return new class_2338(iIiIIiiIiI2.iiiiiIIiiI, iIiIIiiIiI2.ALLATORIxDEMO, this.iiIIIIiIII);
    }

    public static iIiIIiiIiI ALLATORIxDEMO(class_2338 IiIIiIiiiI) {
        return new iIiIIiiIiI(IiIIiIiiiI.getX(), IiIIiIiiiI.getY(), IiIIiIiiiI.getZ());
    }
}

