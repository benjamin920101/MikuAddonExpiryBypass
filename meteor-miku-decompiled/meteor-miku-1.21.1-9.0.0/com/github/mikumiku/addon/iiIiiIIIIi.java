/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.github.mikumiku.addon;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.fusesource.hawtjni.runtime.FieldFlag;

@Documented
@Target(value={ElementType.FIELD})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface iiIiiIIIIi {
    public String iiIiiiiIIi() default "";

    public FieldFlag[] IiiIiIiIiI() default {};

    public String iIIIiIIIii() default "";

    public String iIiiIIiiIi() default "";

    public String IIIIIIiIii() default "";

    public String iIIiIIiIii() default "";
}

