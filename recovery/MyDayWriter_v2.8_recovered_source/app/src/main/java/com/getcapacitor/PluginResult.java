package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class PluginResult {
    private final com.getcapacitor.JSObject json;

    public PluginResult() {
            r1 = this;
            com.getcapacitor.JSObject r0 = new com.getcapacitor.JSObject
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public PluginResult(com.getcapacitor.JSObject r1) {
            r0 = this;
            r0.<init>()
            r0.json = r1
            return
    }

    public com.getcapacitor.JSObject getWrappedResult() {
            r4 = this;
            com.getcapacitor.JSObject r0 = new com.getcapacitor.JSObject
            r0.<init>()
            com.getcapacitor.JSObject r1 = r4.json
            java.lang.String r2 = "pluginId"
            java.lang.String r1 = r1.getString(r2)
            r0.put(r2, r1)
            com.getcapacitor.JSObject r1 = r4.json
            java.lang.String r2 = "methodName"
            java.lang.String r1 = r1.getString(r2)
            r0.put(r2, r1)
            com.getcapacitor.JSObject r1 = r4.json
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = "success"
            java.lang.Boolean r1 = r1.getBoolean(r3, r2)
            r0.put(r3, r1)
            com.getcapacitor.JSObject r1 = r4.json
            java.lang.String r2 = "data"
            com.getcapacitor.JSObject r1 = r1.getJSObject(r2)
            r0.put(r2, r1)
            com.getcapacitor.JSObject r1 = r4.json
            java.lang.String r2 = "error"
            com.getcapacitor.JSObject r1 = r1.getJSObject(r2)
            r0.put(r2, r1)
            return r0
    }

    com.getcapacitor.PluginResult jsonPut(java.lang.String r5, java.lang.Object r6) {
            r4 = this;
            com.getcapacitor.JSObject r0 = r4.json     // Catch: java.lang.Exception -> L6
            r0.put(r5, r6)     // Catch: java.lang.Exception -> L6
            goto L18
        L6:
            r0 = move-exception
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "Plugin"
            r1[r2] = r3
            java.lang.String r1 = com.getcapacitor.Logger.tags(r1)
            java.lang.String r2 = ""
            com.getcapacitor.Logger.error(r1, r2, r0)
        L18:
            return r4
    }

    public com.getcapacitor.PluginResult put(java.lang.String r2, double r3) {
            r1 = this;
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            com.getcapacitor.PluginResult r0 = r1.jsonPut(r2, r0)
            return r0
    }

    public com.getcapacitor.PluginResult put(java.lang.String r2, int r3) {
            r1 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            com.getcapacitor.PluginResult r0 = r1.jsonPut(r2, r0)
            return r0
    }

    public com.getcapacitor.PluginResult put(java.lang.String r2, long r3) {
            r1 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            com.getcapacitor.PluginResult r0 = r1.jsonPut(r2, r0)
            return r0
    }

    public com.getcapacitor.PluginResult put(java.lang.String r2, com.getcapacitor.PluginResult r3) {
            r1 = this;
            com.getcapacitor.JSObject r0 = r3.json
            com.getcapacitor.PluginResult r0 = r1.jsonPut(r2, r0)
            return r0
    }

    public com.getcapacitor.PluginResult put(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            com.getcapacitor.PluginResult r0 = r1.jsonPut(r2, r3)
            return r0
    }

    public com.getcapacitor.PluginResult put(java.lang.String r4, java.util.Date r5) {
            r3 = this;
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mm'Z'"
            r1.<init>(r2)
            r1.setTimeZone(r0)
            java.lang.String r2 = r1.format(r5)
            com.getcapacitor.PluginResult r2 = r3.jsonPut(r4, r2)
            return r2
    }

    public com.getcapacitor.PluginResult put(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            com.getcapacitor.PluginResult r0 = r1.jsonPut(r2, r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            com.getcapacitor.JSObject r0 = r1.json
            java.lang.String r0 = r0.toString()
            return r0
    }
}
