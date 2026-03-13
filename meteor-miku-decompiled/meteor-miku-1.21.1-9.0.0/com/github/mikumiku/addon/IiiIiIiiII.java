/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iiIiIiiiIi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.fusesource.hawtjni.runtime.MethodFlag;

@Documented
@Target(value={ElementType.METHOD})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface IiiIiIiiII {
    public String IiIiiiIIiI() default "";

    public String IiiiiiiiII() default "";

    public MethodFlag[] iIIiiiIiiI() default {};

    public iiIiIiiiIi[] iiIiiiiiII() default {};

    public String IiiIIIIiiI() default "";

    public String IiiiiiiIIi() default "";
}

