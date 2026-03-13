/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.component.type.ContainerComponent
 *  net.minecraft.component.DataComponentTypes
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIiiIIiI;
import com.github.mikumiku.addon.IiIiiIiiIi;
import com.github.mikumiku.addon.iiIIIIiiIi;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.component.DataComponentTypes;

public class IiiIIIiiII {
    public Map<String, List<class_1792>> IiIIiIiiiI;
    public boolean ALLATORIxDEMO;

    private /* synthetic */ boolean iiIiiiiiII(String string) {
        IiiIIIiiII iiiIIIiiII = string2;
        String string2 = string;
        IiiIIIiiII IiIIiIiiiI = iiiIIIiiII;
        if (string2.equals(IiIiiIiiIi.ALLATORIxDEMO("\u0012\u0007.?%*")) || string2.equals(IIiIiiIIiI.ALLATORIxDEMO("\u0011N1d(^*g:T\u000bE<h+f")) || string2.equals(IiIiiIiiIi.ALLATORIxDEMO("%2?\u001f\u000e\u00054$?69")) || string2.equals(IIiIiiIIiI.ALLATORIxDEMO("\u0007D$b*o")) || string2.equals(IiIiiIiiIi.ALLATORIxDEMO("\b\u0018\u00053>>?")) || string2.equals(IIiIiiIIiI.ALLATORIxDEMO("e7`\u0002N\u000b~-d$e"))) {
            return true;
        }
        return false;
    }

    private /* synthetic */ boolean IiiIIIIiiI(String string) {
        IiiIIIiiII iiiIIIiiII = string2;
        String string2 = string;
        IiiIIIiiII IiIIiIiiiI = iiiIIIiiII;
        if (string2.equals(IiIiiIiiIi.ALLATORIxDEMO("%$#?\u0012\u0005(\r;.$#")) || string2.equals(IIiIiiIIiI.ALLATORIxDEMO("6q\fE\u0000S\u001ad<d")) || string2.equals(IiIiiIiiIi.ALLATORIxDEMO("1.\u0005\u0006\u0012\u0005#.3\u0014$;\u001e\u000f\u0012\u0019\b...")) || string2.equals(IIiIiiIIiI.ALLATORIxDEMO("'n+d")) || string2.equals(IiIiiIiiIi.ALLATORIxDEMO("\u0004\u001f%\"9,")) || string2.equals(IIiIiiIIiI.ALLATORIxDEMO("G\u0000@1i s")) || string2.equals(IiIiiIiiIi.ALLATORIxDEMO("\u0007\u0012\n##29")) || string2.equals(IIiIiiIIiI.ALLATORIxDEMO("s$c\u0007H\u0011~-h!d")) || string2.equals(IiIiiIiiIi.ALLATORIxDEMO("$'\u001e\u0006\u001245*;'")) || string2.equals(IIiIiiIIiI.ALLATORIxDEMO("R1h&j")) || string2.equals(IiIiiIiiIi.ALLATORIxDEMO("\u0007\u00036%#$:\u0014\u001a\u000e\u001a\t%*9."))) {
            return true;
        }
        return false;
    }

    private /* synthetic */ boolean IiiiiiiIIi(class_1799 class_17992) {
        IiiIIIiiII iiiIIIiiII = iiiIIIiiII2;
        IiiIIIiiII iiiIIIiiII2 = class_17992;
        IiiIIIiiII IiIIiIiiiI = iiiIIIiiII;
        class_1792 class_17922 = iiiIIIiiII2.getItem();
        if (!(class_17922 instanceof class_1747)) {
            return false;
        }
        iiiIIIiiII2 = (class_1747)class_17922;
        return iiiIIIiiII2.getBlock() instanceof class_2480;
    }

    public static String IiiiiiiIIi(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[4 ^ 5];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).insert(2 & 5, stackTraceElement.getClassName()).toString();
        int n = 2 ^ 3;
        int n2 = string2.length();
        int n3 = n2 - (5 >> 2);
        char[] cArray = new char[n2];
        int n4 = (--3 ^ --5) << --4 ^ n << n;
        int cfr_ignored_0 = 5 >> 1 << --3;
        int n5 = (5 >> 1 ^ --5) << --4 ^ --5 << (4 ^ 5);
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

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ String ALLATORIxDEMO(String string, class_1799 class_17992) {
        Object IiIIiIiiiI = this;
        if (((IiiIIIiiII)IiIIiIiiiI).ALLATORIxDEMO((String)(this = string))) {
            void IiIIiIiiiI2;
            String string2 = ((IiiIIIiiII)IiIIiIiiiI).ALLATORIxDEMO((class_1799)IiIIiIiiiI2);
            if (string2 != null) {
                return string2;
            }
            return IiIiiIiiIi.ALLATORIxDEMO("8?>\u001b\u0000\u0012\u0019\b)83");
        }
        if (IIiIiiIIiI.ALLATORIxDEMO(" o&i$o\u0011D\u0001~'n*j").equals(this)) {
            return IiIiiIiiIi.ALLATORIxDEMO("\u000e9(?*9?\u0012\u000f(\t8$<8");
        }
        if (((IiiIIIiiII)IiIIiIiiiI).iiIiiiiiII((String)this)) {
            return IIiIiiIIiI.ALLATORIxDEMO("0m\u0011S\u0004~7`7d");
        }
        if (((String)this).startsWith(IiIiiIiiIi.ALLATORIxDEMO("&\"8\u001e\b(\u000f>84\u0014"))) {
            return IIiIiiIIiI.ALLATORIxDEMO("l0r\fB:E,r&r");
        }
        if (((String)this).endsWith(IiIiiIiiIi.ALLATORIxDEMO("\b;8?#.\u0005\u0012(\u0018?.%/"))) {
            return IIiIiiIIiI.ALLATORIxDEMO("5n1u s\u001c~\u0016I s!r");
        }
        if (((IiiIIIiiII)IiIIiIiiiI).IiiiiiiIIi((String)this)) {
            return IiIiiIiiIi.ALLATORIxDEMO("\u001b\u0018\u001f>$98");
        }
        if (((IiiIIIiiII)IiIIiIiiiI).IiiIIIIiiI((String)this)) {
            return IIiIiiIIiI.ALLATORIxDEMO("U7`6i");
        }
        String string3 = ((IiiIIIiiII)IiIIiIiiiI).ALLATORIxDEMO((String)this);
        if (string3 != null) {
            return string3;
        }
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public IiiIIIiiII(Map<String, List<class_1792>> map, boolean bl) {
        void IiIIiIiiiI;
        IiiIIIiiII IiIIiIiiiI2;
        boolean bl2 = bl;
        IiiIIIiiII iiiIIIiiII = IiIIiIiiiI2 = this;
        IiiIIIiiII iiiIIIiiII2 = IiIIiIiiiI2;
        IiIIiIiiiI2.IiIIiIiiiI = new HashMap<String, List<class_1792>>();
        IiIIiIiiiI2.ALLATORIxDEMO = 4 ^ 5;
        iiiIIIiiII.IiIIiIiiiI = IiIIiIiiiI;
        iiiIIIiiII.ALLATORIxDEMO = bl2;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiIiiIiiIi.ALLATORIxDEMO(" \u0000UM$.W\u001e\u0007\u000f6?2jw\u8bbc\u6683\u65db\u5247\u676b\u65e7\u7203\u677b\uff4a"));
        }
    }

    private /* synthetic */ boolean IiiiiiiIIi(String string) {
        IiiIIIiiII iiiIIIiiII = string2;
        String string2 = string;
        IiiIIIiiII IiIIiIiiiI = iiiIIIiiII;
        if (string2.contains(IIiIiiIIiI.ALLATORIxDEMO("\u0015N1h*o")) || string2.equals(IiIiiIiiIi.ALLATORIxDEMO("0'68\u00044\u0015\u0004#?;.")) || string2.equals(IIiIiiIIiI.ALLATORIxDEMO("e7`\"n\u000b~\u0007S `1i")) || string2.equals(IiIiiIiiIi.ALLATORIxDEMO("\u000e\u000f\u001b29>.9(\u00124\u0015\u0004#?;.")) || string2.equals(IIiIiiIIiI.ALLATORIxDEMO("*l,o*t\u0016~\u0007N1u)d"))) {
            return true;
        }
        return false;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(String string) {
        IiiIIIiiII iiiIIIiiII = string2;
        String string2 = string;
        IiiIIIiiII IiIIiIiiiI = iiiIIIiiII;
        return string2.contains(class_1802.SHULKER_BOX.getName().getString());
    }

    /*
     * WARNING - void declaration
     */
    public String IiiiiiiIIi(class_1799 class_17992) {
        void IiIIiIiiiI;
        IiiIIIiiII iiiIIIiiII = object;
        if (IiIIiIiiiI == null || IiIIiIiiiI.isEmpty()) {
            return IIiIiiIIiI.ALLATORIxDEMO("0o.o\nV\u000b~,u l");
        }
        String string = iiIIIIiiIi.ALLATORIxDEMO((class_1799)IiIIiIiiiI);
        Object object = iiiIIIiiII.IiIIiIiiiI.entrySet().iterator();
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            if (!((List)entry.getValue()).contains(IiIIiIiiiI.getItem())) continue;
            return (String)entry.getKey();
        }
        if (iiiIIIiiII.ALLATORIxDEMO && (object = iiiIIIiiII.ALLATORIxDEMO(string, (class_1799)IiIIiIiiiI)) != null) {
            return object;
        }
        return string;
    }

    public boolean ALLATORIxDEMO(class_1799 class_17992) {
        IiiIIIiiII iiiIIIiiII = iiiIIIiiII2;
        IiiIIIiiII iiiIIIiiII2 = class_17992;
        IiiIIIiiII IiIIiIiiiI = iiiIIIiiII;
        if (iiiIIIiiII2 == null || iiiIIIiiII2.isEmpty()) {
            return false;
        }
        return iiiIIIiiII2.hasEnchantments();
    }

    private /* synthetic */ String ALLATORIxDEMO(String string) {
        IiiIIIiiII iiiIIIiiII = string2;
        String string2 = string;
        IiiIIIiiII IiIIiIiiiI = iiiIIIiiII;
        if (string2.endsWith(IiIiiIiiIi.ALLATORIxDEMO("4 $8'"))) {
            return IIiIiiIIiI.ALLATORIxDEMO("2n*m");
        }
        if (string2.endsWith(IiIiiIiiIi.ALLATORIxDEMO("\u0014\u0014\u0004\u0019\b%.#."))) {
            return IIiIiiIIiI.ALLATORIxDEMO("\u0006N\u000bB7d1d");
        }
        if (string2.endsWith(IiIiiIiiIi.ALLATORIxDEMO("\u0014#.\u0005\u0019\u0016\b8?#*")) || string2.equals(IIiIiiIIiI.ALLATORIxDEMO("1d\u0017S\u0004B*u1`"))) {
            return IiIiiIiiIi.ALLATORIxDEMO("#.\u0005\u0019\u0016\b8?#*");
        }
        if (string2.endsWith(IIiIiiIIiI.ALLATORIxDEMO(":F)`6r")) || string2.equals(IiIiiIiiIi.ALLATORIxDEMO("\f;*$8")) || string2.equals(IIiIiiIIiI.ALLATORIxDEMO("1h+u\u0000E:F)`6r"))) {
            return IiIiiIiiIi.ALLATORIxDEMO("\f;*$8");
        }
        if (string2.endsWith(IIiIiiIIiI.ALLATORIxDEMO("~\u0006@7q u"))) {
            return IiIiiIiiIi.ALLATORIxDEMO("\u0014\n%;2?");
        }
        if (string2.endsWith(IIiIiiIIiI.ALLATORIxDEMO("\u001ac e"))) {
            return IiIiiIiiIi.ALLATORIxDEMO(")2/");
        }
        return null;
    }

    private /* synthetic */ String ALLATORIxDEMO(class_1799 class_17992) {
        class_9288 IiIIiIiiiI2;
        IiiIIIiiII iiiIIIiiII = object;
        if (IiIIiIiiiI2 == null || IiIIiIiiiI2.isEmpty()) {
            return null;
        }
        try {
            IiIIiIiiiI2 = (class_9288)IiIIiIiiiI2.get(class_9334.CONTAINER);
            if (IiIIiIiiiI2 == null) {
                return null;
            }
            Object object = IiIIiIiiiI2.stream().toList();
            if (object == null || object.isEmpty()) {
                return null;
            }
            HashMap<class_1799, Integer> hashMap = new HashMap<class_1799, Integer>();
            object = object.iterator();
            block2: while (true) {
                Iterator iterator = object;
                while (iterator.hasNext()) {
                    Object object2 = (class_1799)object.next();
                    if (object2 == null) continue block2;
                    if (object2.isEmpty()) {
                        iterator = object;
                        continue;
                    }
                    class_1799 class_17993 = object2;
                    String string = iiIIIIiiIi.ALLATORIxDEMO(class_17993);
                    object2 = iiiIIIiiII.ALLATORIxDEMO(string, (class_1799)object2);
                    int n = class_17993.getCount();
                    HashMap<class_1799, Integer> hashMap2 = hashMap;
                    hashMap2.put((class_1799)object2, hashMap2.getOrDefault(object2, 3 & 4) + n);
                    iterator = object;
                }
                break;
            }
            return hashMap.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
        } catch (Exception IiIIiIiiiI2) {
            return null;
        }
    }
}

