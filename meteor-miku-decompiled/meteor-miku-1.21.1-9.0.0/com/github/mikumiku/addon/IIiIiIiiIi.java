/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtList
 *  net.minecraft.nbt.NbtIo
 *  net.minecraft.nbt.NbtElement
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIiiiiIi;
import com.github.mikumiku.addon.iIIiiIIIii;
import com.github.mikumiku.addon.iiIIIiiIII;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtIo;
import net.minecraft.nbt.NbtElement;

public class IIiIiIiiIi {
    public IIiIiIiiIi() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIIIiiIII.ALLATORIxDEMO("\u0005\u007f\u0010R&vuf\u0005W4gegu\u8be4\u66a6\u65a4\u5265\u6713\u65f8\u7246\u672e\uff45"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public static boolean IiiiiiiIIi(File file, List<iIIiiIIIii> list, Consumer<String> consumer) {
        class_2487 IiIIiIiiiI = list;
        File IiIIiIiiiI2 = file;
        class_2499 class_24992 = new class_2499();
        class_2487 class_24872 = IiIIiIiiiI = IiIIiIiiiI.iterator();
        while (class_24872.hasNext()) {
            iIIiiIIIii iIIiiIIIii2 = (iIIiiIIIii)IiIIiIiiiI.next();
            class_24872 = IiIIiIiiiI;
            class_24992.add((Object)iIIiiIIIii2.toTag());
        }
        IiIIiIiiiI = new class_2487();
        IiIIiIiiiI.put(IIiIiiiiIi.IiiiiiiIIi("u}k^N|`"), (class_2520)class_24992);
        if (Files.notExists(IiIIiIiiiI2.getParentFile().toPath(), new LinkOption[5 >> 3]) && !IiIIiIiiiI2.getParentFile().mkdirs()) {
            void IiIIiIiiiI3;
            IiIIiIiiiI3.accept(iiIIIiiIII.ALLATORIxDEMO("\u526e\u5ec9\u769b\u5f66\u5964\u8d36"));
            return (2 & 5) != 0;
        }
        try {
            class_2507.write((class_2487)IiIIiIiiiI, (Path)IiIIiIiiiI2.toPath());
        } catch (IOException iOException) {
            iOException.printStackTrace();
            return 3 >> 2;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean ALLATORIxDEMO(File file, List<iIIiiIIIii> list, Consumer<String> consumer) {
        void IiIIiIiiiI;
        File file2;
        void IiIIiIiiiI2;
        File file3 = file;
        if (!file3.exists() || !file3.canRead()) {
            IiIIiIiiiI2.accept(IIiIiiiiIi.IiiiiiiIIi("\u65b5\u4ed1\u4e1f\u5b5f\u573a\u6211\u65d2\u6cf2\u52b2\u8f7a"));
            return (2 & 5) != 0;
        }
        Object IiIIiIiiiI3 = null;
        try {
            IiIIiIiiiI3 = class_2507.read((Path)file3.toPath());
            file2 = IiIIiIiiiI3;
        } catch (IOException iOException) {
            file2 = IiIIiIiiiI3;
            iOException.printStackTrace();
        }
        if (file2 == null) {
            IiIIiIiiiI2.accept(iiIIIiiIII.ALLATORIxDEMO("\u4e8a\u6585\u4e8e\u529e\u8f04q3c\u5942\u8d10"));
            return (3 & 4) != 0;
        }
        class_2499 class_24992 = IiIIiIiiiI3.getList(IIiIiiiiIi.IiiiiiiIIi("u}k^N|`"), 0x1E & 0x6B);
        IiIIiIiiiI.clear();
        Object object = IiIIiIiiiI3 = class_24992.iterator();
        while (object.hasNext()) {
            class_24992 = (class_2520)IiIIiIiiiI3.next();
            if (class_24992.getType() != (0x2A & 0x5F)) {
                IiIIiIiiiI2.accept(iiIIIiiIII.ALLATORIxDEMO("\u65de\u6531\u76bb\u5266\u885f\u5130\u7d15"));
                return 5 >> 3;
            }
            IiIIiIiiiI.add(new iIIiiIIIii().ALLATORIxDEMO((class_2487)class_24992));
            object = IiIIiIiiiI3;
        }
        return true;
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[5 >> 2];
        String string3 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n = --4;
        int n2 = string2.length();
        int n3 = n2 - --1;
        char[] cArray = new char[n2];
        int n4 = (1 ^ 3 ^ --5) << --3 ^ 3 & 5;
        int cfr_ignored_0 = n << n ^ (5 >> 1 ^ --5);
        int n5 = (1 ^ 3) << --3 ^ --5;
        int n6 = IiIIiIiiiI = string3.length() - --1;
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
}

