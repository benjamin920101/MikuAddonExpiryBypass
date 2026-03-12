package com.example.expirybypass.mixin;

public final class ExpiryBypassController {
    private static final ThreadLocal<Boolean> BYPASS = ThreadLocal.withInitial(() -> false);

    private ExpiryBypassController() {}

    public static void setBypass(boolean v) {
        BYPASS.set(v);
    }

    public static void clear() {
        BYPASS.remove();
    }

    public static boolean isBypass() {
        return Boolean.TRUE.equals(BYPASS.get());
    }
}
