package com.example.mixin;

import com.github.mikumiku.addon.iIiIiIiIIi;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import java.util.Date;

@Mixin(value = iIiIiIiIIi.class, priority = -2000, remap = false)
public class MikuBypassMixin {
    /**
     * 攔截建構子中的 Date.after() 調用
     * 讓時間檢查永遠判定為「尚未過期」
     */
    @Redirect(
        method = "<init>()V",
        at = @At(value = "INVOKE", target = "Ljava/util/Date;after(Ljava/util/Date;)Z")
    )
    private boolean redirectAfter(Date instance, Date when) {
        // 強制回傳 false，略過 if (true) { throw ... }
        return false;
    }
}
