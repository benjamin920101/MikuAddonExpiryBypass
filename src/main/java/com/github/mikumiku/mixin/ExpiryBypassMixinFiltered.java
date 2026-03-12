package com.github.mikumiku.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(java.util.Date.class)
public class ExpiryBypassMixinFiltered {
    private static final long TARGET = 1773504000082L;

    @Inject(method = "after(Ljava/util/Date;)Z", at = @At("HEAD"), cancellable = true)
    private void onAfter(java.util.Date other, CallbackInfoReturnable<Boolean> cir) {
        try {
            if (other != null && other.getTime() == TARGET) {
                cir.setReturnValue(false);
            }
        } catch (Throwable t) {
            // 保守處理：避免 mixin 本身因例外導致遊戲崩潰
        }
    }
}
