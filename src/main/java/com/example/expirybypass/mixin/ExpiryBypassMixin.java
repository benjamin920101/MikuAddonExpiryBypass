package com.example.expirybypass.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Date;

// TODO: 將 TargetClass.class 換成你要攔截的目標 class
// 例如：@Mixin(targets = "com.somemod.SomeClass")
@Mixin(targets = "com.example.targetmod.TargetClass", remap = false)
public class ExpiryBypassMixin {

    private static final long EXPIRY_TIMESTAMP = 1773504000082L;

    @Redirect(
        method = "<init>",
        at = @At(
            value = "INVOKE",
            target = "Ljava/util/Date;after(Ljava/util/Date;)Z"
        ),
        remap = false
    )
    private boolean redirectDateAfter(Date instance, Date other) {
        // 只攔截特定的到期時間戳，其他的 Date.after() 呼叫保持原本行為
        if (other.getTime() == EXPIRY_TIMESTAMP) {
            return false;
        }
        return instance.after(other);
    }
}
