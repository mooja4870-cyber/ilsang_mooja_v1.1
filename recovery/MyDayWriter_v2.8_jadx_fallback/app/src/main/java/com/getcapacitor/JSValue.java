package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class JSValue {
    private final java.lang.Object value;

    public JSValue(com.getcapacitor.PluginCall r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = r1.toValue(r2, r3)
            r1.value = r0
            return
    }

    private java.lang.Object toValue(com.getcapacitor.PluginCall r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            r1 = 0
            com.getcapacitor.JSArray r0 = r3.getArray(r4, r1)
            if (r0 == 0) goto L9
            return r0
        L9:
            com.getcapacitor.JSObject r0 = r3.getObject(r4, r1)
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.String r0 = r3.getString(r4, r1)
            if (r0 == 0) goto L17
            return r0
        L17:
            com.getcapacitor.JSObject r1 = r3.getData()
            java.lang.Object r1 = r1.opt(r4)
            return r1
    }

    public java.lang.Object getValue() {
            r1 = this;
            java.lang.Object r0 = r1.value
            return r0
    }

    public com.getcapacitor.JSArray toJSArray() throws org.json.JSONException {
            r2 = this;
            java.lang.Object r0 = r2.value
            boolean r0 = r0 instanceof com.getcapacitor.JSArray
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r2.value
            com.getcapacitor.JSArray r0 = (com.getcapacitor.JSArray) r0
            return r0
        Lb:
            org.json.JSONException r0 = new org.json.JSONException
            java.lang.String r1 = "JSValue could not be coerced to JSArray."
            r0.<init>(r1)
            throw r0
    }

    public com.getcapacitor.JSObject toJSObject() throws org.json.JSONException {
            r2 = this;
            java.lang.Object r0 = r2.value
            boolean r0 = r0 instanceof com.getcapacitor.JSObject
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r2.value
            com.getcapacitor.JSObject r0 = (com.getcapacitor.JSObject) r0
            return r0
        Lb:
            org.json.JSONException r0 = new org.json.JSONException
            java.lang.String r1 = "JSValue could not be coerced to JSObject."
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
