package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class JSArray extends org.json.JSONArray {
    public JSArray() {
            r0 = this;
            r0.<init>()
            return
    }

    public JSArray(java.lang.Object r1) throws org.json.JSONException {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public JSArray(java.lang.String r1) throws org.json.JSONException {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public JSArray(java.util.Collection r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.getcapacitor.JSArray from(java.lang.Object r1) {
            com.getcapacitor.JSArray r0 = new com.getcapacitor.JSArray     // Catch: org.json.JSONException -> L6
            r0.<init>(r1)     // Catch: org.json.JSONException -> L6
            return r0
        L6:
            r0 = move-exception
            r0 = 0
            return r0
    }

    public <E> java.util.List<E> toList() throws org.json.JSONException {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r6.length()
            if (r2 >= r3) goto L25
            java.lang.Object r1 = r6.get(r2)
            java.lang.Object r3 = r6.get(r2)     // Catch: java.lang.Exception -> L1c
            r0.add(r3)     // Catch: java.lang.Exception -> L1c
            int r2 = r2 + 1
            goto L7
        L1c:
            r3 = move-exception
            org.json.JSONException r4 = new org.json.JSONException
            java.lang.String r5 = "Not all items are instances of the given type"
            r4.<init>(r5)
            throw r4
        L25:
            return r0
    }
}
