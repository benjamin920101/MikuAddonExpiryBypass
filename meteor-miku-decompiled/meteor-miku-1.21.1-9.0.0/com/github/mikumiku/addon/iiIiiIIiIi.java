/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtLong
 *  net.minecraft.nbt.NbtString
 *  net.minecraft.nbt.NbtElement
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIIIIiiI;
import com.github.mikumiku.addon.iIIiiIIiii;
import com.seedfinding.mccore.version.MCVersion;
import java.util.Date;
import java.util.Optional;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtLong;
import net.minecraft.nbt.NbtString;
import net.minecraft.nbt.NbtElement;

public class iiIiiIIiIi {
    public final Long IiIIiIiiiI;
    public final MCVersion ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public iiIiiIIiIi(Long l, MCVersion mCVersion) {
        void IiIIiIiiiI;
        iiIiiIIiIi iiIiiIIiIi2 = object;
        Object object = mCVersion;
        iiIiiIIiIi IiIIiIiiiI2 = iiIiiIIiIi2;
        IiIIiIiiiI2.IiIIiIiiiI = IiIIiIiiiI;
        if (object == null) {
            object = MCVersion.latest();
        }
        IiIIiIiiiI2.ALLATORIxDEMO = object;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiIIIIiiI.ALLATORIxDEMO("C9V\u0014@\u00103 C\u0011r!#!3\u8ba2\u66e0\u65e2\u5223\u6755\u65be\u7200\u6768\uff03"));
        }
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[5 >> 2];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n = string2.length();
        int n2 = n - (3 >> 1);
        char[] cArray = new char[n];
        int n3 = (4 ^ 5) << --3 ^ (--3 ^ --5);
        int cfr_ignored_0 = (1 ^ 3 ^ --5) << --4 ^ 3 & 5;
        int n4 = (--3 ^ --5) << --4 ^ (--3 << --2 ^ 3 & 5);
        int n5 = IiIIiIiiiI = string3.length() - --1;
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

    public static iiIiiIIiIi ALLATORIxDEMO(class_2487 class_24872) {
        class_2487 class_24873;
        Object IiIIiIiiiI;
        String string;
        class_2487 class_24874 = class_24872;
        String string2 = string = class_24874.getString(iIIiiIIiii.ALLATORIxDEMO("u3Q\u0005j9M"));
        if (string instanceof Optional) {
            IiIIiIiiiI = (Optional)((Object)string2);
            string = (String)IiIIiIiiiI.get();
            class_24873 = class_24874;
        } else {
            string = string2;
            class_24873 = class_24874;
        }
        Object object = IiIIiIiiiI = Long.valueOf(class_24873.getLong(IiiIIIIiiI.ALLATORIxDEMO("D\u0014P\u0017")));
        IiIIiIiiiI = IiIIiIiiiI instanceof Optional ? (Long)((Optional)object).get() : (Long)object;
        return new iiIiiIIiIi((Long)IiIIiIiiiI, MCVersion.fromString(string));
    }

    public class_2487 ALLATORIxDEMO() {
        iiIiiIIiIi iiIiiIIiIi2 = this;
        iiIiiIIiIi iiIiiIIiIi3 = this = new class_2487();
        this.put(iIIiiIIiii.ALLATORIxDEMO("\u0005f3G"), (class_2520)class_2503.of((long)iiIiiIIiIi2.IiIIiIiiiI));
        iiIiiIIiIi3.put(IiiIIIIiiI.ALLATORIxDEMO("\u000eZ\u000bD\u0018Z\u001d"), (class_2520)class_2519.of((String)iiIiiIIiIi2.ALLATORIxDEMO.name));
        return iiIiiIIiIi3;
    }
}

