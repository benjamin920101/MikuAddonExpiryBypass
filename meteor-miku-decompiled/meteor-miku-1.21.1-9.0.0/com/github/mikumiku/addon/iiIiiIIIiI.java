/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIIIiiiiII;
import com.github.mikumiku.addon.mixinface.MySettings;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.util.math.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiiIIIiI {
    private Thread IiIiIIIIiI;
    private volatile boolean iiiiiIIiiI;
    private volatile long iiIIIIiIII;
    private static final long IiIIiIiiiI = 10000L;
    private final Map<class_2338, Long> ALLATORIxDEMO;

    public void iIIiiiIiiI() {
        iiIiiIIIiI iiIiiIIIiI2;
        block3: {
            this.iiiiiIIiiI = 3 & 4;
            if (this.IiIiIIIIiI != null && this.IiIiIIIIiI.isAlive()) {
                this.IiIiIIIIiI.interrupt();
                try {
                    this.IiIiIIIIiI.join(1000L);
                    iiIiiIIIiI2 = this;
                    break block3;
                } catch (InterruptedException interruptedException) {
                    Thread.currentThread().interrupt();
                }
            }
            iiIiiIIIiI2 = this;
        }
        iiIiiIIIiI2.ALLATORIxDEMO();
    }

    public boolean ALLATORIxDEMO() {
        if (this.iiiiiIIiiI && this.IiIiIIIIiI != null && this.IiIiIIIIiI.isAlive()) {
            return 3 >> 1;
        }
        return false;
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 >> 1];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = --4;
        int n2 = 5 >> 2;
        int n3 = --4;
        int n4 = string2.length();
        int n5 = n4 - --1;
        char[] cArray = new char[n4];
        int n6 = n3 << n3 ^ (--3 ^ --5) << (5 >> 2);
        int cfr_ignored_0 = n << n ^ n2 << n2;
        int n7 = (--2 ^ --5) << --3 ^ (5 >> 1 ^ --5);
        int n8 = IiIIiIiiiI = string3.length() - (4 ^ 5);
        int n9 = n5;
        String string4 = string3;
        while (n9 >= 0) {
            int n10 = n5--;
            cArray[n10] = (char)(n7 ^ (string2.charAt(n10) ^ string4.charAt(IiIIiIiiiI)));
            if (n5 < 0) break;
            int n11 = n5--;
            char c = cArray[n11] = (char)(n6 ^ (string2.charAt(n11) ^ string4.charAt(IiIIiIiiiI)));
            if (--IiIIiIiiiI < 0) {
                IiIIiIiiiI = n8;
            }
            n9 = n5;
        }
        return new String(cArray);
    }

    public void IiiIIIIiiI() {
        this.iIIiiiIiiI();
        this.iiiiiIIiiI = --1;
        iiIiiIIIiI iiIiiIIIiI2 = this;
        this.IiIiIIIIiI = new Thread(() -> {
            iiIiiIIIiI iiIiiIIIiI2 = this;
            block3: while (true) {
                iiIiiIIIiI iiIiiIIIiI3 = iiIiiIIIiI2;
                while (iiIiiIIIiI3.iiiiiIIiiI) {
                    try {
                        Thread.sleep(10000L);
                        if (!iiIiiIIIiI2.iiiiiIIiiI) continue block3;
                        iiIiiIIIiI2.IiiiiiiIIi();
                    } catch (InterruptedException interruptedException) {
                        Thread.currentThread().interrupt();
                        return;
                    } catch (Exception interruptedException) {
                        System.err.println("PositionCache \u6e05\u7406\u7ebf\u7a0b\u53d1\u751f\u5f02\u5e38: " + interruptedException.getMessage());
                        iiIiiIIIiI3 = iiIiiIIIiI2;
                        continue;
                    }
                    continue block3;
                }
                break;
            }
        });
        iiIiiIIIiI iiIiiIIIiI3 = this;
        iiIiiIIIiI3.IiIiIIIIiI.setDaemon((4 ^ 5) != 0);
        iiIiiIIIiI3.IiIiIIIIiI.setName(MySettings.ALLATORIxDEMO("Jzi\\N|u{YTY]_8Yy\u007ftt`jaRG_t~"));
        iiIiiIIIiI3.IiIiIIIIiI.start();
    }

    public void IiiiiiiIIi() {
        iiIiiIIIiI iiIiiIIIiI2 = iterator;
        long l = System.currentTimeMillis();
        Iterator<Map.Entry<class_2338, Long>> iterator = iiIiiIIIiI2.ALLATORIxDEMO.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            if (l - (Long)entry.getValue() < iiIiiIIIiI2.iiIIIIiIII) continue;
            iterator.remove();
        }
    }

    public iiIiiIIIiI(long IiIIiIiiiI) {
        iiIiiIIIiI iiIiiIIIiI2 = this;
        this.ALLATORIxDEMO = new ConcurrentHashMap<class_2338, Long>();
        this.iiiiiIIiiI = 2 ^ 3;
        if (IiIIiIiiiI <= 0L) {
            throw new IllegalArgumentException(iIIIiiiiII.ALLATORIxDEMO("\u8f88\u6757\u65b9\u95bc\u5f8a\u9813\u5948\u4ec6\u007f"));
        }
        this.iiIIIIiIII = IiIIiIiiiI;
        this.IiiIIIIiiI();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(MySettings.ALLATORIxDEMO("eVp{f\u007f5oE^tn\u0005N\u0015\u8bcd\u66c6\u658d\u5205\u673a\u6598\u726f\u674e\uff6c"));
        }
    }

    public boolean ALLATORIxDEMO(class_2338 class_23382) {
        iiIiiIIIiI iiIiiIIIiI2 = iiIiiIIIiI3;
        iiIiiIIIiI iiIiiIIIiI3 = class_23382;
        iiIiiIIIiI IiIIiIiiiI = iiIiiIIIiI2;
        if (iiIiiIIIiI3 == null || !IiIIiIiiiI.ALLATORIxDEMO.containsKey(iiIiiIIIiI3)) {
            return false;
        }
        long l = IiIIiIiiiI.ALLATORIxDEMO.get(iiIiiIIIiI3);
        if (System.currentTimeMillis() - l >= IiIIiIiiiI.iiIIIIiIII) {
            IiIIiIiiiI.ALLATORIxDEMO.remove(iiIiiIIIiI3);
            return (3 ^ 3) != 0;
        }
        return true;
    }

    public void ALLATORIxDEMO(long IiIIiIiiiI) {
        if (IiIIiIiiiI <= 0L) {
            throw new IllegalArgumentException(iIIIiiiiII.ALLATORIxDEMO("\u8f88\u6757\u65b9\u95bc\u5f8a\u9813\u5948\u4ec6\u007f"));
        }
        this.iiIIIIiIII = IiIIiIiiiI;
    }

    public iiIiiIIIiI() {
        this(1000L);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(MySettings.ALLATORIxDEMO("eVp{f\u007f5oE^tn\u0005N\u0015\u8bcd\u66c6\u658d\u5205\u673a\u6598\u726f\u674e\uff6c"));
        }
    }

    public int ALLATORIxDEMO() {
        return this.ALLATORIxDEMO.size();
    }

    public String ALLATORIxDEMO() {
        Object[] objectArray = new Object[--3];
        objectArray[5 >> 3] = this.ALLATORIxDEMO();
        objectArray[--1] = this.iiIIIIiIII;
        objectArray[5 >> 1] = this.ALLATORIxDEMO();
        return String.format(iIIIiiiiII.ALLATORIxDEMO("=\u001b\u0000\u0005\u001f\u0001\u0000\u0004.\u0015\u0010GM;\u5940\u5c6aXEG\nEO\u8faf\u6730\u65de\u959cUHJ,\"\u001bCH\u6e6a\u744e\u7ef0\u7a43\u8f9f\u8804uHJ;\u0012"), objectArray);
    }

    public long ALLATORIxDEMO() {
        return this.iiIIIIiIII;
    }

    public void ALLATORIxDEMO() {
        this.ALLATORIxDEMO.clear();
    }

    public void ALLATORIxDEMO(class_2338 class_23382) {
        iiIiiIIIiI iiIiiIIIiI2 = iiIiiIIIiI3;
        iiIiiIIIiI iiIiiIIIiI3 = class_23382;
        iiIiiIIIiI IiIIiIiiiI = iiIiiIIIiI2;
        if (iiIiiIIIiI3 == null) {
            return;
        }
        long l = System.currentTimeMillis();
        IiIIiIiiiI.ALLATORIxDEMO.put((class_2338)iiIiiIIIiI3, l);
    }
}

