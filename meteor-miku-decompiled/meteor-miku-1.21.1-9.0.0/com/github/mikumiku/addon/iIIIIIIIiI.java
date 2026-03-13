/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.settings.IVisible
 *  meteordevelopment.meteorclient.settings.Setting
 *  net.minecraft.registry.Registry
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtList
 *  net.minecraft.nbt.NbtString
 *  net.minecraft.nbt.NbtElement
 *  net.minecraft.util.Identifier
 *  net.minecraft.village.VillagerProfession
 *  net.minecraft.registry.Registries
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIiiIIiI;
import com.github.mikumiku.addon.iIiIiIiIII;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import meteordevelopment.meteorclient.settings.IVisible;
import meteordevelopment.meteorclient.settings.Setting;
import net.minecraft.registry.Registry;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.nbt.NbtElement;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.registry.Registries;

public class iIIIIIIIiI
extends Setting<List<class_3852>> {
    private final boolean IiIIiIiiiI;
    public final Predicate<class_3852> ALLATORIxDEMO;

    public List<class_3852> ALLATORIxDEMO(class_2487 class_24872) {
        Iterator IiIIiIiiiI;
        iIIIIIIIiI iIIIIIIIiI2 = iIIIIIIIiI3;
        ((List)iIIIIIIIiI2.get()).clear();
        for (iIIIIIIIiI iIIIIIIIiI3 : IiIIiIiiiI.getList(IIiIiiIIiI.ALLATORIxDEMO("w\u0004M0d"), 0x6A & 0x1D)) {
            iIIIIIIIiI3 = (class_3852)class_7923.VILLAGER_PROFESSION.get(class_2960.of((String)iIIIIIIIiI3.asString()));
            if (!iIIIIIIIiI2.IiIIiIiiiI && iIIIIIIIiI2.ALLATORIxDEMO != null && !iIIIIIIIiI2.ALLATORIxDEMO.test((class_3852)iIIIIIIIiI3)) continue;
            ((List)iIIIIIIIiI2.get()).add(iIIIIIIIiI3);
        }
        return (List)iIIIIIIIiI2.get();
    }

    /*
     * WARNING - void declaration
     */
    public iIIIIIIIiI(String string, String string2, List<class_3852> list, Consumer<List<class_3852>> consumer, Consumer<Setting<List<class_3852>>> consumer2, IVisible iVisible, Predicate<class_3852> predicate, boolean bl) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        void IiIIiIiiiI5;
        void IiIIiIiiiI6;
        void IiIIiIiiiI7;
        iIIIIIIIiI IiIIiIiiiI8;
        boolean bl2 = bl;
        iIIIIIIIiI iIIIIIIIiI2 = IiIIiIiiiI8 = this;
        super((String)IiIIiIiiiI7, (String)IiIIiIiiiI6, (Object)IiIIiIiiiI5, (Consumer)IiIIiIiiiI4, (Consumer)IiIIiIiiiI3, (IVisible)IiIIiIiiiI2);
        iIIIIIIIiI2.ALLATORIxDEMO = IiIIiIiiiI;
        iIIIIIIIiI2.IiIIiIiiiI = this;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIiIiIiIII.ALLATORIxDEMO("4R\u0001_\u0017[DK4z\u0005Jtjd\u8be9\u66b7\u65a9\u5274\u671e\u65e9\u724b\u673f\uff48"));
        }
    }

    public void resetImpl() {
        iIIIIIIIiI iIIIIIIIiI2 = this;
        this.value = new ArrayList((Collection)this.defaultValue);
    }

    public List<class_3852> ALLATORIxDEMO(String string) {
        iIIIIIIIiI iIIIIIIIiI2 = object;
        Object object = string;
        iIIIIIIIiI IiIIiIiiiI = iIIIIIIIiI2;
        object = ((String)object).split(IIiIiiIIiI.ALLATORIxDEMO("-"));
        ArrayList<class_3852> arrayList = new ArrayList<class_3852>(((Object)object).length);
        try {
            int n = ((Object)object).length;
            for (int i = 2 & 5; i < n; ++i) {
                Object object2 = object[i];
                if ((object2 = (class_3852)iIIIIIIIiI.parseId((class_2378)class_7923.VILLAGER_PROFESSION, (String)object2)) == null || IiIIiIiiiI.ALLATORIxDEMO != null && !IiIIiIiiiI.ALLATORIxDEMO.test((class_3852)object2)) continue;
                arrayList.add((class_3852)object2);
            }
        } catch (Exception this2) {
            // empty catch block
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public class_2487 save(class_2487 class_24872) {
        void IiIIiIiiiI;
        iIIIIIIIiI iIIIIIIIiI2 = iIIIIIIIiI3;
        class_2499 class_24992 = new class_2499();
        for (iIIIIIIIiI iIIIIIIIiI3 : (List)iIIIIIIIiI2.get()) {
            if (!iIIIIIIIiI2.IiIIiIiiiI && iIIIIIIIiI2.ALLATORIxDEMO != null && !iIIIIIIIiI2.ALLATORIxDEMO.test((class_3852)iIIIIIIIiI3)) continue;
            class_24992.add((Object)class_2519.of((String)class_7923.VILLAGER_PROFESSION.getId((Object)iIIIIIIIiI3).toString()));
        }
        void v0 = IiIIiIiiiI;
        v0.put(iIiIiIiIII.ALLATORIxDEMO("`:m=w"), (class_2520)class_24992);
        return v0;
    }

    public Iterable<class_2960> getIdentifierSuggestions() {
        return class_7923.VILLAGER_PROFESSION.getIds();
    }

    public boolean ALLATORIxDEMO(List<class_3852> object) {
        iIIIIIIIiI iIIIIIIIiI2 = object2;
        Object object2 = object;
        object = iIIIIIIIiI2;
        return (4 ^ 5) != 0;
    }
}

