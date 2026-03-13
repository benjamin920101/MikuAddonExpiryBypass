/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiIiIiI;
import com.github.mikumiku.addon.IiIiiIiiIi;
import com.github.mikumiku.addon.iIiIiiIiIi;
import com.github.mikumiku.addon.mixinface.MoveEvent;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIiiiiiII {
    private final HashMap<IiIiiIiIiI, ArrayList<iIiIiiIiIi>> ALLATORIxDEMO;

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = string2.length();
        int n2 = n - (2 ^ 3);
        char[] cArray = new char[n];
        int n3 = (--3 ^ --5) << --4 ^ (--3 << (5 >> 1) ^ --3);
        int cfr_ignored_0 = 1 ^ 3 ^ --5;
        int n4 = --3 ^ --5;
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

    public IIIiiiiiII IiiIIIIiiI() {
        Iterator<Map.Entry<IiIiiIiIiI, ArrayList<iIiIiiIiIi>>> iterator;
        IIIiiiiiII iIIiiiiiII = iterator3;
        HashMap<IiIiiIiIiI, ArrayList<iIiIiiIiIi>> hashMap = new HashMap<IiIiiIiIiI, ArrayList<iIiIiiIiIi>>(iIIiiiiiII.ALLATORIxDEMO.size() * --2);
        Iterator<Map.Entry<IiIiiIiIiI, ArrayList<iIiIiiIiIi>>> iterator2 = iterator = iIIiiiiiII.ALLATORIxDEMO.entrySet().iterator();
        while (iterator2.hasNext()) {
            Iterator iterator3 = iterator.next();
            IiIiiIiIiI iiIiiIiIiI = iterator3.getKey();
            ArrayList<iIiIiiIiIi> arrayList = new ArrayList<iIiIiiIiIi>(((ArrayList)iterator3.getValue()).size());
            Iterator iterator4 = iterator3 = ((ArrayList)iterator3.getValue()).iterator();
            while (iterator4.hasNext()) {
                iIiIiiIiIi iIiIiiIiIi2 = (iIiIiiIiIi)iterator3.next();
                iIiIiiIiIi iIiIiiIiIi3 = iIiIiiIiIi2.ALLATORIxDEMO();
                iterator4 = iterator3;
                iIiIiiIiIi iIiIiiIiIi4 = iIiIiiIiIi3;
                iIiIiiIiIi4.ALLATORIxDEMO(iiIiiIiIiI.ALLATORIxDEMO(iIiIiiIiIi3.IiiiiiiIIi()));
                iIiIiiIiIi4.ALLATORIxDEMO(iIiIiiIiIi2);
                arrayList.add(iIiIiiIiIi4);
            }
            hashMap.put(iiIiiIiIiI, arrayList);
            iterator2 = iterator;
        }
        return new IIIiiiiiII(hashMap);
    }

    public IIIiiiiiII IiiiiiiIIi() {
        Iterator<Map.Entry<IiIiiIiIiI, ArrayList<iIiIiiIiIi>>> iterator;
        IIIiiiiiII iIIiiiiiII = entry;
        HashMap<IiIiiIiIiI, ArrayList<iIiIiiIiIi>> hashMap = new HashMap<IiIiiIiIiI, ArrayList<iIiIiiIiIi>>(iIIiiiiiII.ALLATORIxDEMO.size() * --2);
        Iterator<Map.Entry<IiIiiIiIiI, ArrayList<iIiIiiIiIi>>> iterator2 = iterator = iIIiiiiiII.ALLATORIxDEMO.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<IiIiiIiIiI, ArrayList<iIiIiiIiIi>> entry = iterator.next();
            ArrayList<iIiIiiIiIi> arrayList = new ArrayList<iIiIiiIiIi>(((ArrayList)entry.getValue()).size());
            Iterator iterator3 = ((ArrayList)entry.getValue()).iterator();
            while (iterator3.hasNext()) {
                Iterator iterator4;
                iIiIiiIiIi iIiIiiIiIi2 = (iIiIiiIiIi)iterator4.next();
                iterator3 = iterator4;
                arrayList.add(iIiIiiIiIi2.ALLATORIxDEMO());
            }
            hashMap.put((IiIiiIiIiI)entry.getKey(), arrayList);
            iterator2 = iterator;
        }
        return new IIIiiiiiII(hashMap);
    }

    public void IiiiiiiIIi() {
        IIIiiiiiII iterator;
        IIIiiiiiII iIIiiiiiII = iterator;
        for (Map.Entry<IiIiiIiIiI, ArrayList<iIiIiiIiIi>> this_ : iIIiiiiiII.ALLATORIxDEMO.entrySet()) {
            IiIiiIiIiI iiIiiIiIiI = this_.getKey();
            Iterator<iIiIiiIiIi> iterator2 = this_.getValue().iterator();
            while (iterator2.hasNext()) {
                iIiIiiIiIi iIiIiiIiIi2 = this_.next();
                iterator2 = this_;
                iIiIiiIiIi iIiIiiIiIi3 = iIiIiiIiIi2;
                iIiIiiIiIi3.ALLATORIxDEMO(iiIiiIiIiI.ALLATORIxDEMO(iIiIiiIiIi3.IiiiiiiIIi()));
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(PrintStream object) {
        void IiIIiIiiiI;
        Iterator<Map.Entry<IiIiiIiIiI, ArrayList<iIiIiiIiIi>>> iterator;
        IIIiiiiiII iIIiiiiiII = object2;
        Object object2 = object;
        object = iIIiiiiiII;
        int n = 3 & 5;
        Iterator<Map.Entry<IiIiiIiIiI, ArrayList<iIiIiiIiIi>>> iterator2 = iterator = IiIIiIiiiI.ALLATORIxDEMO.entrySet().iterator();
        while (iterator2.hasNext()) {
            Object object3;
            Object object4 = iterator.next();
            IiIiiIiIiI iiIiiIiIiI = object4.getKey();
            object4 = object4.getValue();
            int n2 = 3 ^ 3;
            Iterator iterator3 = ((ArrayList)object4).iterator();
            while (iterator3.hasNext()) {
                Iterator iterator4;
                object3 = (iIiIiiIiIi)iterator4.next();
                n2 += ((iIiIiiIiIi)object3).ALLATORIxDEMO();
                iterator3 = iterator4;
            }
            if (n == 0) {
                ((PrintStream)object2).print(MoveEvent.ALLATORIxDEMO("LG"));
            }
            n = 0;
            ((PrintStream)object2).print(IiIiiIiiIi.ALLATORIxDEMO("\u0010"));
            if (n2 > 0) {
                int n3 = --1;
                Object object5 = object2;
                ((PrintStream)object2).println(MoveEvent.ALLATORIxDEMO("\u001bG"));
                Object object6 = object2;
                ((PrintStream)object5).println(IiIiiIiiIi.ALLATORIxDEMO("WKU\b\u001b\n\u0004\u0018uqwi") + iiIiiIiIiI.ALLATORIxDEMO() + MoveEvent.ALLATORIxDEMO("BK"));
                Object object7 = object2;
                ((PrintStream)object5).println(IiIiiIiiIi.ALLATORIxDEMO("KWI\u0003\u0004\u0003\n;imk") + n2 + MoveEvent.ALLATORIxDEMO("LG"));
                ((PrintStream)object5).print(IiIiiIiiIi.ALLATORIxDEMO("wkU\r\u0002\u0005\u0014\u001f\u001e\u0004\u0019\u0018uqw0"));
                int n4 = n3;
                object3 = ((ArrayList)object4).iterator();
                while (object3.hasNext()) {
                    object4 = (iIiIiiIiIi)object3.next();
                    if (((iIiIiiIiIi)object4).ALLATORIxDEMO() <= 0) continue;
                    if (n4 == 0) {
                        ((PrintStream)object2).print(MoveEvent.ALLATORIxDEMO("K"));
                    }
                    n4 = 0;
                    ((PrintStream)object2).println();
                    ((PrintStream)object2).print(IiIiiIiiIi.ALLATORIxDEMO("Kwkwi") + ((iIiIiiIiIi)object4).ALLATORIxDEMO() + MoveEvent.ALLATORIxDEMO("EZG") + ((iIiIiiIiIi)object4).ALLATORIxDEMO());
                }
                Object object8 = object2;
                ((PrintStream)object8).println();
                ((PrintStream)object8).println(IiIiiIiiIi.ALLATORIxDEMO("kw6"));
                ((PrintStream)object2).print(MoveEvent.ALLATORIxDEMO("\u001a"));
            }
            ((PrintStream)object2).print(IiIiiIiiIi.ALLATORIxDEMO("\u0016"));
            iterator2 = iterator;
        }
    }

    public void ALLATORIxDEMO() {
        IIIiiiiiII iIIiiiiiII = this;
        Iterator<ArrayList<iIiIiiIiIi>> iterator = iIIiiiiiII.ALLATORIxDEMO.values().iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next().iterator();
            while (object.hasNext()) {
                ((iIiIiiIiIi)this.next()).ALLATORIxDEMO();
                object = this;
            }
        }
    }

    public IIIiiiiiII ALLATORIxDEMO() {
        IIIiiiiiII iIIiiiiiII = this.IiiiiiiIIi();
        iIIiiiiiII.IiiiiiiIIi();
        return iIIiiiiiII;
    }

    public IIIiiiiiII(Collection<IiIiiIiIiI> collection) {
        IIIiiiiiII iIIiiiiiII = collection2;
        Collection<IiIiiIiIiI> collection2 = collection;
        IIIiiiiiII IiIIiIiiiI = iIIiiiiiII;
        IiIIiIiiiI(IIIiiiiiII.ALLATORIxDEMO(collection2));
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(MoveEvent.ALLATORIxDEMO("\u0017,ba\u0013\u0002@\u0012\u0010\u0003!3%f`\u8bb0\u66b4\u65f7\u5270\u6747\u65d0\u722f\u674c\uff66"));
        }
    }

    private static /* synthetic */ HashMap<IiIiiIiIiI, ArrayList<iIiIiiIiIi>> ALLATORIxDEMO(Collection<IiIiiIiIiI> collection) {
        Iterator<IiIiiIiIiI> iterator;
        Collection<IiIiiIiIiI> collection2 = collection;
        HashMap<IiIiiIiIiI, ArrayList<iIiIiiIiIi>> hashMap = new HashMap<IiIiiIiIiI, ArrayList<iIiIiiIiIi>>();
        Iterator<IiIiiIiIiI> iterator2 = iterator = collection2.iterator();
        while (iterator2.hasNext()) {
            IiIiiIiIiI iiIiiIiIiI = iterator.next();
            int n = iiIiiIiIiI.ALLATORIxDEMO();
            Collection<IiIiiIiIiI> IiIIiIiiiI = new ArrayList<IiIiiIiIiI>(n);
            int n2 = 2 & 5;
            while (n2 < n) {
                int n3;
                String string = iiIiiIiIiI.ALLATORIxDEMO(n3);
                int n4 = 3 >> 1;
                ((ArrayList)IiIIiIiiiI).add((IiIiiIiIiI)((Object)new iIiIiiIiIi(n3++, string, 2 & 5)));
                n2 = n3;
            }
            Collections.sort(IiIIiIiiiI);
            iterator2 = iterator;
            hashMap.put(iiIiiIiIiI, (ArrayList<iIiIiiIiIi>)IiIIiIiiiI);
        }
        return hashMap;
    }

    public IIIiiiiiII(IiIiiIiIiI ... iiIiiIiIiIArray) {
        IiIiiIiIiI[] iiIiiIiIiIArray2 = iiIiiIiIiIArray3;
        IiIiiIiIiI[] iiIiiIiIiIArray3 = iiIiiIiIiIArray;
        IiIiiIiIiI[] IiIIiIiiiI = iiIiiIiIiIArray2;
        super(Arrays.asList(iiIiiIiIiIArray3));
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiIiiIiiIi.ALLATORIxDEMO(" \u0000UM$.w>'/\u0016\u001f\u0012JW\u8b9c\u6683\u65db\u5247\u676b\u65e7\u7203\u677b\uff4a"));
        }
    }

    private /* synthetic */ IIIiiiiiII(HashMap<IiIiiIiIiI, ArrayList<iIiIiiIiIi>> hashMap) {
        IIIiiiiiII iIIiiiiiII = hashMap2;
        HashMap<IiIiiIiIiI, ArrayList<iIiIiiIiIi>> hashMap2 = hashMap;
        IIIiiiiiII IiIIiIiiiI = iIIiiiiiII;
        IiIIiIiiiI.ALLATORIxDEMO = hashMap2;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiIiiIiiIi.ALLATORIxDEMO(" \u0000UM$.w>'/\u0016\u001f\u0012JW\u8b9c\u6683\u65db\u5247\u676b\u65e7\u7203\u677b\uff4a"));
        }
    }
}

