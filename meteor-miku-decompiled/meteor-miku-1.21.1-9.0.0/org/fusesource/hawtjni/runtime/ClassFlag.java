/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package org.fusesource.hawtjni.runtime;

import com.github.mikumiku.addon.iIiiIiiiII;
import com.github.mikumiku.addon.iiIiiIIiIi;
import java.util.Date;

public final class ClassFlag
extends Enum<ClassFlag> {
    public static final /* enum */ ClassFlag IIIIiIiiIi;
    private static final /* synthetic */ ClassFlag[] IiIiIIIIiI;
    public static final /* enum */ ClassFlag iiiiiIIiiI;
    public static final /* enum */ ClassFlag iiIIIIiIII;
    public static final /* enum */ ClassFlag IiIIiIiiiI;
    public static final /* enum */ ClassFlag ALLATORIxDEMO;

    public static ClassFlag valueOf(String IiIIiIiiiI) {
        return Enum.valueOf(ClassFlag.class, IiIIiIiiiI);
    }

    public static ClassFlag[] values() {
        return (ClassFlag[])IiIiIIIIiI.clone();
    }

    private static /* synthetic */ ClassFlag[] ALLATORIxDEMO() {
        ClassFlag[] classFlagArray = new ClassFlag[--5];
        classFlagArray[3 ^ 3] = iiiiiIIiiI;
        classFlagArray[--1] = IIIIiIiiIi;
        classFlagArray[--2] = ALLATORIxDEMO;
        classFlagArray[--3] = IiIIiIiiiI;
        classFlagArray[--4] = iiIIIIiIII;
        return classFlagArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private /* synthetic */ ClassFlag() {
        void var1_-1;
        void var2_-1;
        void this_ = var2_-1;
        ClassFlag classFlag = this;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIiiIiiiII.ALLATORIxDEMO("M#p&-i\u0013\u0014l*p7fp#\u8ba6\u66c2\u65d4\u522c\u674e\u65a1\u720b\u673b\uff44"));
        }
    }

    static {
        iiiiiIIiiI = new ClassFlag(iiIiiIIiIi.ALLATORIxDEMO("$H!P4[)Ry\u0003"), 3 >> 2);
        IIIIiIiiIi = new ClassFlag(iIiiIiiiII.ALLATORIxDEMO("\u0000G\u0015"), --1);
        ALLATORIxDEMO = new ClassFlag(iiIiiIIiIi.ALLATORIxDEMO("4P(Ls\u0007"), 1 ^ 3);
        IiIIiIiiiI = new ClassFlag(iIiiIiiiII.ALLATORIxDEMO("0E\u001eT\u0007R\u0003"), --3);
        iiIIIIiIII = new ClassFlag(iiIiiIIiIi.ALLATORIxDEMO(":F5K%Ve\u0007"), --4);
        IiIiIIIIiI = ClassFlag.ALLATORIxDEMO();
    }
}

