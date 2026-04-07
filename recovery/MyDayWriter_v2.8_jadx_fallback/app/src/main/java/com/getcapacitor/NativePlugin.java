package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.Deprecated
public @interface NativePlugin {
    java.lang.String name() default "";

    int permissionRequestCode() default 9000;

    java.lang.String[] permissions() default {};

    int[] requestCodes() default {};
}
