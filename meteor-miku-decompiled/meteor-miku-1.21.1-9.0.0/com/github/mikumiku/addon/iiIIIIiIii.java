/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiiIiiII;
import com.github.mikumiku.addon.IiIIiiIIiI;
import com.github.mikumiku.addon.iiIIiIiIII;
import com.github.mikumiku.addon.iiiIIiIIii;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.util.Date;

public class iiIIIIiIii {
    private static /* synthetic */ void IiiIIIIiiI() {
        Object object;
        System.out.println("CPU\u6838\u5fc3\u6570: " + Runtime.getRuntime().availableProcessors());
        System.out.println("\u6700\u5927\u5185\u5b58: " + Runtime.getRuntime().maxMemory() / 0x100000L + " MB");
        System.out.println("\u7cfb\u7edf\u67b6\u6784: " + System.getProperty(iiiIIiIIii.ALLATORIxDEMO("j3\u000b!W\u0003m")));
        System.out.println("\u64cd\u4f5c\u7cfb\u7edf: " + System.getProperty(iiIIiIiIII.ALLATORIxDEMO("\u001dD|Y3z\u0017")));
        try {
            Dimension dimension;
            object = Toolkit.getDefaultToolkit();
            Dimension dimension2 = dimension = ((Toolkit)object).getScreenSize();
            System.out.println("\u5c4f\u5e55\u5206\u8fa8\u7387: " + dimension2.width + "x" + dimension2.height);
        } catch (Exception exception) {
            System.out.println(iiiIIiIIii.ALLATORIxDEMO("\u5c4a\u5e35\u5203\u8fc8\u7382z\u0005\u65a0\u6cf0\u83d7\u53d3"));
        }
        try {
            object = NetworkInterface.getNetworkInterfaces();
            int n = 2 & 5;
            while (object.hasMoreElements()) {
                if (n >= --3) break;
                byte[] byArray = ((NetworkInterface)object.nextElement()).getHardwareAddress();
                if (byArray == null || byArray.length <= 0) continue;
                StringBuilder stringBuilder = new StringBuilder();
                int n2 = byArray.length;
                int n3 = 5 >> 3;
                while (n3 < n2) {
                    int n4;
                    byte by = byArray[n4];
                    Object[] objectArray = new Object[2 ^ 3];
                    objectArray[2 & 5] = by;
                    stringBuilder.append(String.format(iiIIiIiIII.ALLATORIxDEMO("\u0012b%*"), objectArray));
                    n3 = ++n4;
                }
                System.out.println("\u7f51\u5361MAC[" + n++ + "]: " + stringBuilder.toString());
            }
            if (n == 0) {
                System.out.println(iiiIIiIIii.ALLATORIxDEMO("\u7f54\u5301H!Fz\u0005\u65a0\u6cf0\u83d7\u53d3"));
                return;
            }
        } catch (Exception exception) {
            System.out.println("\u7f51\u5361MAC: \u83b7\u53d6\u5931\u8d25 - " + exception.getMessage());
        }
    }

    private static /* synthetic */ double ALLATORIxDEMO(String string, String string2) {
        int n;
        String IiIIiIiiiI = string2;
        String IiIIiIiiiI2 = string;
        if (IiIIiIiiiI2 == null || IiIIiIiiiI == null) {
            return 0.0;
        }
        if (IiIIiIiiiI2.equals(IiIIiIiiiI)) {
            return 1.0;
        }
        int n2 = Math.min(IiIIiIiiiI2.length(), IiIIiIiiiI.length());
        int n3 = 5 >> 3;
        int n4 = n = 3 & 4;
        while (n4 < n2) {
            if (IiIIiIiiiI2.charAt(n) == IiIIiIiiiI.charAt(n)) {
                ++n3;
            }
            n4 = ++n;
        }
        return (double)n3 / (double)Math.max(IiIIiIiiiI2.length(), IiIIiIiiiI.length());
    }

    private static /* synthetic */ void IiiiiiiIIi() {
        IIiiiIiiII iIiiiIiiII2 = new IIiiiIiiII();
        Object object = iiIIiIiIII.ALLATORIxDEMO("C7D&\u001a9R+:C%A\u0003g");
        System.out.println("\u4f7f\u7528\u6d4b\u8bd5\u5bc6\u94a5: " + (String)object);
        System.out.println("\u786c\u4ef6ID: " + iIiiiIiiII2.iIIiiiIiiI());
        System.out.println(iiiIIiIIii.ALLATORIxDEMO("\u51ee\u594a\u53f9\u9047\u9aaf\u8b86\u8bd5\u6c45\u5252z\u0005(Q\u0014u\u0013?O*\u0001p4J\u000fu%K8\u000b\u0017j2N%W3\u000b$@6\n!U\t*\u0001p4M"));
        if (5 >> 3 != 0) {
            System.out.println(iiIIiIiIII.ALLATORIxDEMO("\u6b31\u571f\u6235\u887b\u774d\u5ba9\u9ade\u8bd6\u8b85\u6c55\\\u0019|"));
            object = iIiiiIiiII2.IiiIIIIiiI((String)object);
            System.out.println("\u9a8c\u8bc1\u7ed3\u679c: " + String.valueOf(object));
            return;
        }
        System.out.println(iiiIIiIIii.ALLATORIxDEMO("\u8db3\u8fe2\u775f\u5bbb\u8b97\u6c47\uff68\u8bbb\u7f0e%\u0010`2C\u000fw-w%D\fW%T5@3Q`\u0018`Q2P\u0005%\u6705\u6262\u880c\uff2c"));
    }

    public static void main(String[] stringArray) {
        Object object;
        Object IiIIiIiiiI2;
        block6: {
            Object object2;
            String[] stringArray2 = stringArray;
            if (new Date().after(new Date(1773504000178L))) {
                throw new Throwable(iiiIIiIIii.ALLATORIxDEMO("0i\u0005d\u0013`@p0A\u0001q%\u0004`\u8bd2\u66b0\u6591\u5278\u672d\u65f0\u726d\u676b\uff23"));
            }
            System.out.println(iiIIiIiIII.ALLATORIxDEMO("\u001f\u001a\u007f\u0014q\tl\u0015p\bm\u001fzS6\u0010u\u0014q\u0016s\bm\u0010u\u0014q\u0016s\bmS6\u001cy\u0019|\u0019|\u0012w\u0013vS\u001f\u0014r\u0017r7R7R7R7R\u0017r7R\u0017r\u0017r\u0013v\u001fz\u0017r\u0010u\u001dx\u0011t\u0013vP5\u0019|\u0017r\no\u0015Y\bn\u001cyP5\u0013u\u0014r\u0016p\u000bn\u0010v\u0017r\u0015s\bnS6\u001cz\u0019|\u0019\u007f\u0012w\u0010uS6\u0014r\u0017r7R4x4R7R\u0017r4R\u0014r\u0014r\u0013v\u001cz\u0017r\u0013u\u001ex\u0011w\u0013vS5\u001a|\u0014r\to\u0016p\u000bn\u001cyP5\u0010\\\u0014r\u0015p\u000bn\u0010u\u0014r\u0016p\u000bnS5\u001fz\u0019|\u0019\u007f\u0011w\u0010uS5\u0014r\u0014q7R7Q7R7R\u0017r4x\u0014r\u0017r\u0013v\u001cz\u0014r\u0013v\u001ex\u0012w\u0010vS5\u001a|\u0017q\no\u0015p\bn\u001fyS5\u0010u\u0014r\u0015p\u000bn\u0010\\\u0014r\u0015p\u000bnP5\u001fz\u001a\u007f\u001a\u007f\u0011t\u0010uP5\u0017r\u0017r7R7R7R7R\u0017r7R\u0017r\u0017r\u0013v\u001cP\u0014r`'R,T7G?\u001er\u0019\u0016V$KoW#[\"U:\u0011aZ9Y!\u0015#B P3\u0017`\u0005`\u001dnS\u001f\u001cz\u001a\u007f\u001a\u007f\u0011t\u0010uP5\u0017r\u0017r7R7R7R7R\u0017r7R\u0017r\u0017r\u0013v\u001fz\u0017r\u0010u\u001dx\u0012^\u0010vP5\u0019|\u0017\u0013F#W'D<Uy?wU#D1T$D<\u0013 \u000e|\u0000po\u000b=Z\u001fz\u001a\u007f\u001a\u007f\u0012^\u0013uP5\u0017r\u0017r7R7R7R7R\u0017r7R\u0017r\u0017r\u0013v\u001fz\u0017r\u0010u\u001dx\u0011t\u0013vP5\u0019|\u0014X\to\u0016s\u000bn\u001cyP5\u0013v\u0017r\u0015\u0014n\u0003|va\u0017g\u0003b\u0001>4\u001fz\u001a\u007f\u001a\u007f\u0011t\u0010uP5\u0017r\u0014X4R7R7R7R\u0017r7R\u0017r\u0017r\u0013v\u001fz\u0017r\u0010u\u001dx\u0011t\u0013vP5\u0019|\u0017r\no\u0016s\u000bn\u001fSS5\u0013v\u0017r\u0015p\u000bn}\u0019crs\u001fyn3Zr\u0017\u007f\ry\u0016p\u0018\u0010\u0000#P\u0016r\u0017r7R7R7R4x\u0014r7R\u0017r\u0017r\u0013v\u001fz\u0017r\u0010u\u001dx\u0011t\u0013vP5\u0019|\u0017r\no\u0016s\u000bn\u001cyP5\u0013v\u0017r\u0016Z\bn\u0013v\u0017r\u0015p\u000bnP}K.J,\u0000p\u001e5\\9\u0011aX ^|t\u001dzR7R7R\u0017r7R\u0017r\u0014X\u0010v\u001fz\u0017r\u0010u\u001dx\u0011t\u0013vP5\u0019|\u0017r\no\u0016s\u000bn\u001cyP5\u0013v\u0017r\u0015p\u000bn\u0013v\u0017r\u0016Z\bmS6\u001cy\u0019|\u0019|\u0012w\u0013vS6\u0014q\u0014q4Q4Q4Q4Q\u0014q4Q\u0014q\u0014q\u0010u\u001cy\u0014q\u0013_"));
            System.out.println(iiiIIiIIii.ALLATORIxDEMO("8}\u0018@\u7869\u4eb6l\u0004\u753a\u6254\u6d6a\u8b9d\r}\u0018z("));
            System.out.println(iiIIiIiIII.ALLATORIxDEMO("d^5\u6d7c\u8b87\u0017\u0000r\u0013{3b\u0006\u007f\u0017Y&~\u0011V&X \u0013\u783a\u4ec9\u0013s\u754d\u6220o"));
            Object object3 = new IIiiiIiiII();
            try {
                Object object4 = object2 = IIiiiIiiII.class.getDeclaredMethod(iiiIIiIIii.ALLATORIxDEMO("\u0007`.@\u0012d4@\bD6E?L2@\u000eF"), new Class[2 & 5]);
                ((Method)object4).setAccessible(--1 != 0);
                IiIIiIiiiI2 = (String)((Method)object4).invoke(object3, new Object[2 & 5]);
                System.out.println("\u786c\u4ef6ID: " + (String)IiIIiIiiiI2);
                System.out.println("\u957f\u5ea6: " + ((String)IiIIiIiiiI2).length());
                object3 = (String)((Method)object2).invoke(object3, new Object[3 & 4]);
                System.out.println("\u518d\u6b21\u751f\u6210: " + (String)object3);
                System.out.println("\u4e00\u81f4\u6027: " + ((String)IiIIiIiiiI2).equals(object3));
            } catch (Exception exception) {
                System.out.println("\u6d4b\u8bd5\u5931\u8d25: " + exception.getMessage());
            }
            System.out.println(iiIIiIiIII.ALLATORIxDEMO("P\bq\u001a\u6d14\u8be4tq \u0004}R<C;t\u0013c\u001bx\u001cX\u0010Q'd\u0011V&X \u0013\u783a\u4ec9\u635d\u7e8e\u754d\u6220o"));
            Object object5 = object2 = new IiIIiiIIiI();
            while (!((IiIIiiIIiI)object5).iIIiiiIiiI()) {
                try {
                    Thread.sleep(100L);
                    object5 = object2;
                } catch (InterruptedException IiIIiIiiiI2) {
                    Thread.currentThread().interrupt();
                    object = object2;
                    break block6;
                }
            }
            object = object2;
        }
        IiIIiIiiiI2 = ((IiIIiiIIiI)object).iIIiIIiIii();
        System.out.println("\u786c\u4ef6\u6307\u7eb9: " + (String)IiIIiIiiiI2);
        System.out.println("\u957f\u5ea6: " + String.valueOf(IiIIiIiiiI2 != null ? Integer.valueOf(((String)IiIIiIiiiI2).length()) : "null"));
        System.out.println(iiiIIiIIii.ALLATORIxDEMO("/s\u000bd\u7cda\u7e97\u7841\u4eb6\u4fc4\u6028\u0018"));
        iiIIIIiIii.IiiIIIIiiI();
        System.out.println(iiIIiIiIII.ALLATORIxDEMO("X\u0003|\u0013\u6d1d\u8bea\u7745\u5ba9\u9ade\u8bf1o"));
        iiIIIIiIii.IiiiiiiIIi();
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[2 ^ 3];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = --3;
        int n2 = string2.length();
        int n3 = n2 - (3 >> 1);
        char[] cArray = new char[n2];
        int n4 = 3 >> 1 << n ^ (2 ^ 3);
        int cfr_ignored_0 = --5 << --4 ^ 5 >> 1 << (5 >> 2);
        int n5 = n;
        int n6 = IiIIiIiiiI = string3.length() - (5 >> 2);
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

    public iiIIIIiIii() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIIiIiIII.ALLATORIxDEMO("G\u001er\u0013D77\u0007G6V&\u0007&\u0017\u8ba5\u66c4\u65e5\u5207\u6752\u659a\u7207\u674c\uff04"));
        }
    }

    public static void ALLATORIxDEMO() {
        int n;
        int n2;
        System.out.println(iiIIiIiIII.ALLATORIxDEMO("\u0000R,I,\u7805\u4ee1;b\u7a70\u5b80\u6058\u6d50\u8bab3K,I"));
        IIiiiIiiII iIiiiIiiII2 = new IIiiiIiiII();
        String[] stringArray = new String[--5];
        int n3 = n2 = 5 >> 3;
        while (true) {
            if (n3 >= 5) break;
            try {
                Method method = IIiiiIiiII.class.getDeclaredMethod(iiiIIiIIii.ALLATORIxDEMO("\u001a}\bf\t\u007f\u0014`\u0019U\u001fl\u001bh\u0016d/g"), new Class[3 ^ 3]);
                method.setAccessible(--1 != 0);
                stringArray[n2] = (String)method.invoke((Object)iIiiiIiiII2, new Object[3 & 4]);
                System.out.println("\u7b2c" + (n2 + (3 & 5)) + "\u6b21: " + stringArray[n2]);
                Thread.sleep(100L);
            } catch (Exception exception) {
                System.out.println("\u751f\u6210\u5931\u8d25: " + exception.getMessage());
            }
            n3 = ++n2;
        }
        n2 = 1;
        int n4 = n = --1;
        while (n4 < stringArray.length) {
            if (!stringArray[5 >> 3].equals(stringArray[n])) {
                n2 = 2 & 5;
                break;
            }
            n4 = ++n;
        }
        System.out.println("\u7a33\u5b9a\u6027\u6d4b\u8bd5\u7ed3\u679c: " + (n2 != 0 ? iiIIiIiIII.ALLATORIxDEMO("\u900b\u8fb3") : iiiIIiIIii.ALLATORIxDEMO("\u5957\u8d26")));
        if (n2 == 0) {
            System.out.println(iiIIiIiIII.ALLATORIxDEMO("\u76e3\u4f42\u5eb5\u5270\u6781N"));
            int n5 = n = --1;
            while (n5 < stringArray.length) {
                double d = iiIIIIiIii.ALLATORIxDEMO(stringArray[3 >> 2], stringArray[n]);
                int n6 = n + (3 & 5);
                System.out.println("ID1 vs ID" + n6 + ": " + d * 100.0 + "%");
                n5 = ++n;
            }
        }
    }
}

