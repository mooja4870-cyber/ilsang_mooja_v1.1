package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class PluginMethodHandle {
    private final java.lang.reflect.Method method;
    private final java.lang.String name;
    private final java.lang.String returnType;

    public PluginMethodHandle(java.lang.reflect.Method r2, com.getcapacitor.PluginMethod r3) {
            r1 = this;
            r1.<init>()
            r1.method = r2
            java.lang.String r0 = r2.getName()
            r1.name = r0
            java.lang.String r0 = r3.returnType()
            r1.returnType = r0
            return
    }

    public java.lang.reflect.Method getMethod() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.method
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.String getReturnType() {
            r1 = this;
            java.lang.String r0 = r1.returnType
            return r0
    }
}
