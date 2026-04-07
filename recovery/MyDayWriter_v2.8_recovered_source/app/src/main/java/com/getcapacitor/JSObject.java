package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class JSObject extends org.json.JSONObject {
    public JSObject() {
            r0 = this;
            r0.<init>()
            return
    }

    public JSObject(java.lang.String r1) throws org.json.JSONException {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public JSObject(org.json.JSONObject r1, java.lang.String[] r2) throws org.json.JSONException {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.getcapacitor.JSObject fromJSONObject(org.json.JSONObject r4) throws org.json.JSONException {
            java.util.Iterator r0 = r4.keys()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            goto L9
        L19:
            com.getcapacitor.JSObject r2 = new com.getcapacitor.JSObject
            int r3 = r1.size()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r3 = r1.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r2.<init>(r4, r3)
            return r2
    }

    public java.lang.Boolean getBool(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.lang.Boolean r0 = r1.getBoolean(r2, r0)
            return r0
    }

    public java.lang.Boolean getBoolean(java.lang.String r2, java.lang.Boolean r3) {
            r1 = this;
            boolean r0 = super.getBoolean(r2)     // Catch: org.json.JSONException -> L9
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: org.json.JSONException -> L9
            return r0
        L9:
            r0 = move-exception
            return r3
    }

    public java.lang.Integer getInteger(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.lang.Integer r0 = r1.getInteger(r2, r0)
            return r0
    }

    public java.lang.Integer getInteger(java.lang.String r2, java.lang.Integer r3) {
            r1 = this;
            int r0 = super.getInt(r2)     // Catch: org.json.JSONException -> L9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: org.json.JSONException -> L9
            return r0
        L9:
            r0 = move-exception
            return r3
    }

    public com.getcapacitor.JSObject getJSObject(java.lang.String r3) {
            r2 = this;
            r0 = 0
            com.getcapacitor.JSObject r0 = r2.getJSObject(r3, r0)     // Catch: org.json.JSONException -> L6
            return r0
        L6:
            r1 = move-exception
            return r0
    }

    public com.getcapacitor.JSObject getJSObject(java.lang.String r7, com.getcapacitor.JSObject r8) throws org.json.JSONException {
            r6 = this;
            java.lang.Object r0 = r6.get(r7)     // Catch: org.json.JSONException -> L3a
            boolean r1 = r0 instanceof org.json.JSONObject     // Catch: org.json.JSONException -> L3a
            if (r1 == 0) goto L39
            r1 = r0
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: org.json.JSONException -> L3a
            java.util.Iterator r1 = r1.keys()     // Catch: org.json.JSONException -> L3a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: org.json.JSONException -> L3a
            r2.<init>()     // Catch: org.json.JSONException -> L3a
        L14:
            boolean r3 = r1.hasNext()     // Catch: org.json.JSONException -> L3a
            if (r3 == 0) goto L24
            java.lang.Object r3 = r1.next()     // Catch: org.json.JSONException -> L3a
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L3a
            r2.add(r3)     // Catch: org.json.JSONException -> L3a
            goto L14
        L24:
            com.getcapacitor.JSObject r3 = new com.getcapacitor.JSObject     // Catch: org.json.JSONException -> L3a
            r4 = r0
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch: org.json.JSONException -> L3a
            int r5 = r2.size()     // Catch: org.json.JSONException -> L3a
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: org.json.JSONException -> L3a
            java.lang.Object[] r5 = r2.toArray(r5)     // Catch: org.json.JSONException -> L3a
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: org.json.JSONException -> L3a
            r3.<init>(r4, r5)     // Catch: org.json.JSONException -> L3a
            return r3
        L39:
            goto L3b
        L3a:
            r0 = move-exception
        L3b:
            return r8
    }

    @Override // org.json.JSONObject
    public java.lang.String getString(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.getString(r2, r0)
            return r0
    }

    public java.lang.String getString(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = super.getString(r3)     // Catch: org.json.JSONException -> Lc
            boolean r1 = super.isNull(r3)     // Catch: org.json.JSONException -> Lc
            if (r1 != 0) goto Lb
            return r0
        Lb:
            goto Ld
        Lc:
            r0 = move-exception
        Ld:
            return r4
    }

    @Override // org.json.JSONObject
    public com.getcapacitor.JSObject put(java.lang.String r2, double r3) {
            r1 = this;
            super.put(r2, r3)     // Catch: org.json.JSONException -> L4
        L3:
            goto L6
        L4:
            r0 = move-exception
            goto L3
        L6:
            return r1
    }

    @Override // org.json.JSONObject
    public com.getcapacitor.JSObject put(java.lang.String r2, int r3) {
            r1 = this;
            super.put(r2, r3)     // Catch: org.json.JSONException -> L4
        L3:
            goto L6
        L4:
            r0 = move-exception
            goto L3
        L6:
            return r1
    }

    @Override // org.json.JSONObject
    public com.getcapacitor.JSObject put(java.lang.String r2, long r3) {
            r1 = this;
            super.put(r2, r3)     // Catch: org.json.JSONException -> L4
        L3:
            goto L6
        L4:
            r0 = move-exception
            goto L3
        L6:
            return r1
    }

    @Override // org.json.JSONObject
    public com.getcapacitor.JSObject put(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            super.put(r2, r3)     // Catch: org.json.JSONException -> L4
        L3:
            goto L6
        L4:
            r0 = move-exception
            goto L3
        L6:
            return r1
    }

    public com.getcapacitor.JSObject put(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            super.put(r2, r3)     // Catch: org.json.JSONException -> L4
        L3:
            goto L6
        L4:
            r0 = move-exception
            goto L3
        L6:
            return r1
    }

    @Override // org.json.JSONObject
    public com.getcapacitor.JSObject put(java.lang.String r2, boolean r3) {
            r1 = this;
            super.put(r2, r3)     // Catch: org.json.JSONException -> L4
        L3:
            goto L6
        L4:
            r0 = move-exception
            goto L3
        L6:
            return r1
    }

    @Override // org.json.JSONObject
    public /* bridge */ /* synthetic */ org.json.JSONObject put(java.lang.String r1, double r2) throws org.json.JSONException {
            r0 = this;
            com.getcapacitor.JSObject r1 = r0.put(r1, r2)
            return r1
    }

    @Override // org.json.JSONObject
    public /* bridge */ /* synthetic */ org.json.JSONObject put(java.lang.String r1, int r2) throws org.json.JSONException {
            r0 = this;
            com.getcapacitor.JSObject r1 = r0.put(r1, r2)
            return r1
    }

    @Override // org.json.JSONObject
    public /* bridge */ /* synthetic */ org.json.JSONObject put(java.lang.String r1, long r2) throws org.json.JSONException {
            r0 = this;
            com.getcapacitor.JSObject r1 = r0.put(r1, r2)
            return r1
    }

    @Override // org.json.JSONObject
    public /* bridge */ /* synthetic */ org.json.JSONObject put(java.lang.String r1, java.lang.Object r2) throws org.json.JSONException {
            r0 = this;
            com.getcapacitor.JSObject r1 = r0.put(r1, r2)
            return r1
    }

    @Override // org.json.JSONObject
    public /* bridge */ /* synthetic */ org.json.JSONObject put(java.lang.String r1, boolean r2) throws org.json.JSONException {
            r0 = this;
            com.getcapacitor.JSObject r1 = r0.put(r1, r2)
            return r1
    }

    public com.getcapacitor.JSObject putSafe(java.lang.String r2, java.lang.Object r3) throws org.json.JSONException {
            r1 = this;
            org.json.JSONObject r0 = super.put(r2, r3)
            com.getcapacitor.JSObject r0 = (com.getcapacitor.JSObject) r0
            return r0
    }
}
