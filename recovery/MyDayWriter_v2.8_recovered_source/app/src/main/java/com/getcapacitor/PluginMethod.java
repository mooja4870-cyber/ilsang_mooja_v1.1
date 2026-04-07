package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface PluginMethod {
    public static final java.lang.String RETURN_CALLBACK = "callback";
    public static final java.lang.String RETURN_NONE = "none";
    public static final java.lang.String RETURN_PROMISE = "promise";

    java.lang.String returnType() default "promise";
}
