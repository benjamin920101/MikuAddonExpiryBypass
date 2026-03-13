/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.settings.IVisible
 *  meteordevelopment.meteorclient.settings.Setting
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtIntArray
 *  net.minecraft.nbt.NbtList
 *  net.minecraft.nbt.NbtElement
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiIIIIi;
import com.github.mikumiku.addon.iiIiiIIiII;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import meteordevelopment.meteorclient.settings.IVisible;
import meteordevelopment.meteorclient.settings.Setting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtIntArray;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtElement;

public class IiIIIIiIiI
extends Setting<List<class_2338>> {
    public List<class_2338> ALLATORIxDEMO(String string) {
        IiIIIIiIiI iiIIIIiIiI = object;
        Object object = string;
        IiIIIIiIiI IiIIiIiiiI = iiIIIIiIiI;
        object = ((String)object).split(iiIiiIIiII.ALLATORIxDEMO("X"));
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>(((Object)object).length);
        try {
            int n = ((Object)object).length;
            for (int i = 2 & 5; i < n; ++i) {
                String[] stringArray = ((String)object[i]).trim().split(IIIIiIIIIi.ALLATORIxDEMO("x"));
                if (stringArray.length != --3) continue;
                int n2 = Integer.parseInt(stringArray[2 & 5].trim());
                int n3 = Integer.parseInt(stringArray[--1].trim());
                int n4 = Integer.parseInt(stringArray[--2].trim());
                arrayList.add(new class_2338(n2, n3, n4));
            }
        } catch (NumberFormatException this2) {
            // empty catch block
        }
        return arrayList;
    }

    public boolean ALLATORIxDEMO(List<class_2338> list) {
        IiIIIIiIiI iiIIIIiIiI = object;
        Object object = list;
        IiIIIIiIiI IiIIiIiiiI = iiIIIIiIiI;
        return --1 != 0;
    }

    public List<class_2338> ALLATORIxDEMO(class_2487 class_24872) {
        Iterator IiIIiIiiiI;
        IiIIIIiIiI iiIIIIiIiI = object;
        ((List)iiIIIIiIiI.get()).clear();
        IiIIiIiiiI = IiIIiIiiiI.getList(IIIIiIIIIi.ALLATORIxDEMO("(\u001c:\n1"), 0x7F & 0xB).iterator();
        while (IiIIiIiiiI.hasNext()) {
            int[] nArray = ((class_2495)((class_2520)IiIIiIiiiI.next())).getIntArray();
            Object object = nArray;
            if (nArray.length != --3) continue;
            ((List)iiIIIIiIiI.get()).add(new class_2338((int)object[3 ^ 3], (int)object[2 ^ 3], (int)object[1 ^ 3]));
        }
        return (List)iiIIIIiIiI.get();
    }

    /*
     * WARNING - void declaration
     */
    public IiIIIIiIiI(String string, String string2, List<class_2338> list, Consumer<List<class_2338>> consumer, Consumer<Setting<List<class_2338>>> consumer2, IVisible iVisible) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        void IiIIiIiiiI5;
        IiIIIIiIiI iiIIIIiIiI = iiIIIIiIiI2;
        IiIIIIiIiI iiIIIIiIiI2 = iVisible;
        IiIIIIiIiI IiIIiIiiiI6 = iiIIIIiIiI;
        super((String)IiIIiIiiiI5, (String)IiIIiIiiiI4, (Object)IiIIiIiiiI3, (Consumer)IiIIiIiiiI2, (Consumer)IiIIiIiiiI, (IVisible)iiIIIIiIiI2);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIIIiIIIIi.ALLATORIxDEMO(")>\u001c3*\u0017Y')\u0016\u0018&i\u0006y\u8b85\u66aa\u65c5\u5269\u6772\u65f4\u7227\u6722\uff24"));
        }
    }

    public void resetImpl() {
        IiIIIIiIiI iiIIIIiIiI = this;
        this.value = new ArrayList((Collection)this.defaultValue);
    }

    /*
     * WARNING - void declaration
     */
    public class_2487 save(class_2487 class_24872) {
        void IiIIiIiiiI;
        Iterator iterator;
        IiIIIIiIiI iiIIIIiIiI = iiIIIIiIiI2;
        class_2499 class_24992 = new class_2499();
        Iterator iterator2 = iterator = ((List)iiIIIIiIiI.get()).iterator();
        while (iterator2.hasNext()) {
            IiIIIIiIiI iiIIIIiIiI2 = (class_2338)iterator.next();
            iterator2 = iterator;
            int[] nArray = new int[--3];
            nArray[3 ^ 3] = iiIIIIiIiI2.getX();
            nArray[4 ^ 5] = iiIIIIiIiI2.getY();
            nArray[1 ^ 3] = iiIIIIiIiI2.getZ();
            class_24992.add((Object)new class_2495(nArray));
        }
        void v2 = IiIIiIiiiI;
        v2.put(iiIiiIIiII.ALLATORIxDEMO("\u0015\r/9\u0006"), (class_2520)class_24992);
        return v2;
    }
}

