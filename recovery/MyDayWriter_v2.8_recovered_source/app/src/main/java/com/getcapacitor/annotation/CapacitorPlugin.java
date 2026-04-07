package com.getcapacitor.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface CapacitorPlugin {
    java.lang.String name() default "";

    com.getcapacitor.annotation.Permission[] permissions() default {};

    int[] requestCodes() default {};
}
