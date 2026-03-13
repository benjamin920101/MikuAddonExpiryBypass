/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon.mixinface;

import java.util.Date;

public class MoveEvent {
    private boolean cancelled;
    public double y;
    public double x;
    public double z;

    public void setX(double IiIIiIiiiI) {
        this.x = IiIIiIiiiI;
    }

    public double getX() {
        return this.x;
    }

    public void cancel() {
        this.setCancelled(--1 != 0);
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 & 5];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = string2.length();
        int n2 = n - (4 ^ 5);
        char[] cArray = new char[n];
        int n3 = --5 << --3 ^ 3 & 5;
        int cfr_ignored_0 = (1 ^ 3) << --3 ^ (1 ^ 3 ^ --5);
        int n4 = --5 << --3 ^ (--3 ^ --5);
        int n5 = IiIIiIiiiI = string3.length() - (3 & 5);
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

    public double getZ() {
        return this.z;
    }

    public void setZ(double IiIIiIiiiI) {
        this.z = IiIIiIiiiI;
    }

    public void setY(double IiIIiIiiiI) {
        this.y = IiIIiIiiiI;
    }

    public MoveEvent(double IiIIiIiiiI, double IiIIiIiiiI2, double IiIIiIiiiI3) {
        MoveEvent moveEvent = this;
        this.x = IiIIiIiiiI;
        moveEvent.y = IiIIiIiiiI2;
        moveEvent.z = IiIIiIiiiI3;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable("Please update! \u8bf7\u66f4\u65b0\u5230\u6700\u65b0\u7248\u672c\uff01");
        }
    }

    public double getY() {
        return this.y;
    }

    public void setCancelled(boolean bl) {
        boolean bl2 = bl;
        MoveEvent IiIIiIiiiI = this;
        IiIIiIiiiI.cancelled = bl2;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }
}

