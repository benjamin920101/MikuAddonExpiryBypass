/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package org.fusesource.hawtjni.runtime;

import com.github.mikumiku.addon.iIiiIiiiII;
import com.github.mikumiku.addon.iiIIIIiiII;
import java.util.Date;

public final class FieldFlag
extends Enum<FieldFlag> {
    public static final /* enum */ FieldFlag iiIiIIiIIi;
    public static final /* enum */ FieldFlag IIIIiIiiIi;
    public static final /* enum */ FieldFlag IiIiIIIIiI;
    public static final /* enum */ FieldFlag iiiiiIIiiI;
    public static final /* enum */ FieldFlag iiIIIIiIII;
    public static final /* enum */ FieldFlag IiIIiIiiiI;
    private static final /* synthetic */ FieldFlag[] ALLATORIxDEMO;

    private static /* synthetic */ FieldFlag[] ALLATORIxDEMO() {
        FieldFlag[] fieldFlagArray = new FieldFlag[0x66 & 0x1F];
        fieldFlagArray[3 & 4] = IIIIiIiiIi;
        fieldFlagArray[5 >> 2] = iiIiIIiIIi;
        fieldFlagArray[5 >> 1] = IiIIiIiiiI;
        fieldFlagArray[--3] = IiIiIIIIiI;
        fieldFlagArray[--4] = iiiiiIIiiI;
        fieldFlagArray[--5] = iiIIIIiIII;
        return fieldFlagArray;
    }

    public static FieldFlag[] values() {
        return (FieldFlag[])ALLATORIxDEMO.clone();
    }

    public static FieldFlag valueOf(String IiIIiIiiiI) {
        return Enum.valueOf(FieldFlag.class, IiIIiIiiiI);
    }

    static {
        IIIIiIiiIi = new FieldFlag(iiIIIIiiII.ALLATORIxDEMO("~\u0002_%t\u001cn\u0005r\u0018"), 3 & 4);
        iiIiIIiIIi = new FieldFlag(iIiiIiiiII.ALLATORIxDEMO("u+R\u001dE\u0002Y\u0011"), --1);
        IiIIiIiiiI = new FieldFlag(iiIIIIiiII.ALLATORIxDEMO("\u001a\u007f\nv\u001f_;o\u0005t\u000bw\f"), 1 ^ 3);
        IiIiIIIIiI = new FieldFlag(iIiiIiiiII.ALLATORIxDEMO("G\u000ew6Y\nN\u0013C\u0017"), --3);
        iiiiiIIiiI = new FieldFlag(iiIIIIiiII.ALLATORIxDEMO("r\u0003m\u001eu\u0011g\u0005U'}\u0006p\f~\u001a"), --4);
        iiIIIIiIII = new FieldFlag(iIiiIiiiII.ALLATORIxDEMO("J\u000eA\u0013Y\u001cK\by*Q\u000b\\\u0001R\u0017"), --5);
        ALLATORIxDEMO = FieldFlag.ALLATORIxDEMO();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private /* synthetic */ FieldFlag() {
        void var1_-1;
        void var2_-1;
        void this_ = var2_-1;
        FieldFlag fieldFlag = this;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIiiIiiiII.ALLATORIxDEMO("M#p&-i\u0016\u0011i/t3yo4\u8bb1\u66c2\u65d4\u522c\u674e\u65a1\u720b\u673b\uff44"));
        }
    }
}

