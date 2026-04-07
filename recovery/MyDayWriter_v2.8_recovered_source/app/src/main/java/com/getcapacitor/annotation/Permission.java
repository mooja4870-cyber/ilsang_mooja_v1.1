package com.getcapacitor.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Permission {
    java.lang.String alias() default "";

    java.lang.String[] strings() default {};
}
