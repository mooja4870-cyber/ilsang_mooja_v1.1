package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class PluginCall {
    public static final java.lang.String CALLBACK_ID_DANGLING = "-1";
    private final java.lang.String callbackId;
    private final com.getcapacitor.JSObject data;

    @java.lang.Deprecated
    private boolean isReleased;
    private boolean keepAlive;
    private final java.lang.String methodName;
    private final com.getcapacitor.MessageHandler msgHandler;
    private final java.lang.String pluginId;

    class PluginCallDataTypeException extends java.lang.Exception {
        final /* synthetic */ com.getcapacitor.PluginCall this$0;

        PluginCallDataTypeException(com.getcapacitor.PluginCall r1, java.lang.String r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }
    }

    public PluginCall(com.getcapacitor.MessageHandler r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.getcapacitor.JSObject r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.keepAlive = r0
            r1.isReleased = r0
            r1.msgHandler = r2
            r1.pluginId = r3
            r1.callbackId = r4
            r1.methodName = r5
            r1.data = r6
            return
    }

    public void errorCallback(java.lang.String r7) {
            r6 = this;
            com.getcapacitor.PluginResult r0 = new com.getcapacitor.PluginResult
            r0.<init>()
            r1 = 0
            java.lang.String r2 = "message"
            r0.put(r2, r7)     // Catch: java.lang.Exception -> Lc
            goto L20
        Lc:
            r2 = move-exception
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = 0
            java.lang.String r5 = "Plugin"
            r3[r4] = r5
            java.lang.String r3 = com.getcapacitor.Logger.tags(r3)
            java.lang.String r4 = r2.toString()
            com.getcapacitor.Logger.error(r3, r4, r1)
        L20:
            com.getcapacitor.MessageHandler r2 = r6.msgHandler
            r2.sendResponseMessage(r6, r1, r0)
            return
    }

    public com.getcapacitor.JSArray getArray(java.lang.String r2) {
            r1 = this;
            r0 = 0
            com.getcapacitor.JSArray r0 = r1.getArray(r2, r0)
            return r0
    }

    public com.getcapacitor.JSArray getArray(java.lang.String r6, com.getcapacitor.JSArray r7) {
            r5 = this;
            com.getcapacitor.JSObject r0 = r5.data
            java.lang.Object r0 = r0.opt(r6)
            if (r0 != 0) goto L9
            return r7
        L9:
            boolean r1 = r0 instanceof org.json.JSONArray
            if (r1 == 0) goto L32
            r1 = r0
            org.json.JSONArray r1 = (org.json.JSONArray) r1     // Catch: org.json.JSONException -> L30
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: org.json.JSONException -> L30
            r2.<init>()     // Catch: org.json.JSONException -> L30
            r3 = 0
        L16:
            int r4 = r1.length()     // Catch: org.json.JSONException -> L30
            if (r3 >= r4) goto L26
            java.lang.Object r4 = r1.get(r3)     // Catch: org.json.JSONException -> L30
            r2.add(r4)     // Catch: org.json.JSONException -> L30
            int r3 = r3 + 1
            goto L16
        L26:
            com.getcapacitor.JSArray r3 = new com.getcapacitor.JSArray     // Catch: org.json.JSONException -> L30
            java.lang.Object[] r4 = r2.toArray()     // Catch: org.json.JSONException -> L30
            r3.<init>(r4)     // Catch: org.json.JSONException -> L30
            return r3
        L30:
            r1 = move-exception
            return r7
        L32:
            return r7
    }

    public java.lang.Boolean getBoolean(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.lang.Boolean r0 = r1.getBoolean(r2, r0)
            return r0
    }

    public java.lang.Boolean getBoolean(java.lang.String r3, java.lang.Boolean r4) {
            r2 = this;
            com.getcapacitor.JSObject r0 = r2.data
            java.lang.Object r0 = r0.opt(r3)
            if (r0 != 0) goto L9
            return r4
        L9:
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L11
            r1 = r0
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            return r1
        L11:
            return r4
    }

    public java.lang.String getCallbackId() {
            r1 = this;
            java.lang.String r0 = r1.callbackId
            return r0
    }

    public com.getcapacitor.JSObject getData() {
            r1 = this;
            com.getcapacitor.JSObject r0 = r1.data
            return r0
    }

    public java.lang.Double getDouble(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.lang.Double r0 = r1.getDouble(r2, r0)
            return r0
    }

    public java.lang.Double getDouble(java.lang.String r4, java.lang.Double r5) {
            r3 = this;
            com.getcapacitor.JSObject r0 = r3.data
            java.lang.Object r0 = r0.opt(r4)
            if (r0 != 0) goto L9
            return r5
        L9:
            boolean r1 = r0 instanceof java.lang.Double
            if (r1 == 0) goto L11
            r1 = r0
            java.lang.Double r1 = (java.lang.Double) r1
            return r1
        L11:
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L21
            r1 = r0
            java.lang.Float r1 = (java.lang.Float) r1
            double r1 = r1.doubleValue()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            return r1
        L21:
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L31
            r1 = r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            double r1 = r1.doubleValue()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            return r1
        L31:
            return r5
    }

    public java.lang.Float getFloat(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.lang.Float r0 = r1.getFloat(r2, r0)
            return r0
    }

    public java.lang.Float getFloat(java.lang.String r3, java.lang.Float r4) {
            r2 = this;
            com.getcapacitor.JSObject r0 = r2.data
            java.lang.Object r0 = r0.opt(r3)
            if (r0 != 0) goto L9
            return r4
        L9:
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L11
            r1 = r0
            java.lang.Float r1 = (java.lang.Float) r1
            return r1
        L11:
            boolean r1 = r0 instanceof java.lang.Double
            if (r1 == 0) goto L21
            r1 = r0
            java.lang.Double r1 = (java.lang.Double) r1
            float r1 = r1.floatValue()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        L21:
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L31
            r1 = r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            float r1 = r1.floatValue()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        L31:
            return r4
    }

    public java.lang.Integer getInt(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.lang.Integer r0 = r1.getInt(r2, r0)
            return r0
    }

    public java.lang.Integer getInt(java.lang.String r3, java.lang.Integer r4) {
            r2 = this;
            com.getcapacitor.JSObject r0 = r2.data
            java.lang.Object r0 = r0.opt(r3)
            if (r0 != 0) goto L9
            return r4
        L9:
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L11
            r1 = r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            return r1
        L11:
            return r4
    }

    public java.lang.Long getLong(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.lang.Long r0 = r1.getLong(r2, r0)
            return r0
    }

    public java.lang.Long getLong(java.lang.String r3, java.lang.Long r4) {
            r2 = this;
            com.getcapacitor.JSObject r0 = r2.data
            java.lang.Object r0 = r0.opt(r3)
            if (r0 != 0) goto L9
            return r4
        L9:
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L11
            r1 = r0
            java.lang.Long r1 = (java.lang.Long) r1
            return r1
        L11:
            return r4
    }

    public java.lang.String getMethodName() {
            r1 = this;
            java.lang.String r0 = r1.methodName
            return r0
    }

    public com.getcapacitor.JSObject getObject(java.lang.String r2) {
            r1 = this;
            r0 = 0
            com.getcapacitor.JSObject r0 = r1.getObject(r2, r0)
            return r0
    }

    public com.getcapacitor.JSObject getObject(java.lang.String r3, com.getcapacitor.JSObject r4) {
            r2 = this;
            com.getcapacitor.JSObject r0 = r2.data
            java.lang.Object r0 = r0.opt(r3)
            if (r0 != 0) goto L9
            return r4
        L9:
            boolean r1 = r0 instanceof org.json.JSONObject
            if (r1 == 0) goto L17
            r1 = r0
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: org.json.JSONException -> L15
            com.getcapacitor.JSObject r1 = com.getcapacitor.JSObject.fromJSONObject(r1)     // Catch: org.json.JSONException -> L15
            return r1
        L15:
            r1 = move-exception
            return r4
        L17:
            return r4
    }

    public java.lang.String getPluginId() {
            r1 = this;
            java.lang.String r0 = r1.pluginId
            return r0
    }

    public java.lang.String getString(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.getString(r2, r0)
            return r0
    }

    public java.lang.String getString(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.getcapacitor.JSObject r0 = r2.data
            java.lang.Object r0 = r0.opt(r3)
            if (r0 != 0) goto L9
            return r4
        L9:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L11
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L11:
            return r4
    }

    @java.lang.Deprecated
    public boolean hasOption(java.lang.String r2) {
            r1 = this;
            com.getcapacitor.JSObject r0 = r1.data
            boolean r0 = r0.has(r2)
            return r0
    }

    public boolean isKeptAlive() {
            r1 = this;
            boolean r0 = r1.keepAlive
            return r0
    }

    @java.lang.Deprecated
    public boolean isReleased() {
            r1 = this;
            boolean r0 = r1.isReleased
            return r0
    }

    @java.lang.Deprecated
    public boolean isSaved() {
            r1 = this;
            boolean r0 = r1.isKeptAlive()
            return r0
    }

    public void reject(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.reject(r2, r0, r0, r0)
            return
    }

    public void reject(java.lang.String r2, com.getcapacitor.JSObject r3) {
            r1 = this;
            r0 = 0
            r1.reject(r2, r0, r0, r3)
            return
    }

    public void reject(java.lang.String r2, java.lang.Exception r3) {
            r1 = this;
            r0 = 0
            r1.reject(r2, r0, r3, r0)
            return
    }

    public void reject(java.lang.String r2, java.lang.Exception r3, com.getcapacitor.JSObject r4) {
            r1 = this;
            r0 = 0
            r1.reject(r2, r0, r3, r4)
            return
    }

    public void reject(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.reject(r2, r3, r0, r0)
            return
    }

    public void reject(java.lang.String r2, java.lang.String r3, com.getcapacitor.JSObject r4) {
            r1 = this;
            r0 = 0
            r1.reject(r2, r3, r0, r4)
            return
    }

    public void reject(java.lang.String r2, java.lang.String r3, java.lang.Exception r4) {
            r1 = this;
            r0 = 0
            r1.reject(r2, r3, r4, r0)
            return
    }

    public void reject(java.lang.String r6, java.lang.String r7, java.lang.Exception r8, com.getcapacitor.JSObject r9) {
            r5 = this;
            com.getcapacitor.PluginResult r0 = new com.getcapacitor.PluginResult
            r0.<init>()
            java.lang.String r1 = "Plugin"
            r2 = 0
            r3 = 1
            if (r8 == 0) goto L16
            java.lang.String[] r4 = new java.lang.String[r3]
            r4[r2] = r1
            java.lang.String r4 = com.getcapacitor.Logger.tags(r4)
            com.getcapacitor.Logger.error(r4, r6, r8)
        L16:
            java.lang.String r4 = "message"
            r0.put(r4, r6)     // Catch: java.lang.Exception -> L28
            java.lang.String r4 = "code"
            r0.put(r4, r7)     // Catch: java.lang.Exception -> L28
            if (r9 == 0) goto L27
            java.lang.String r4 = "data"
            r0.put(r4, r9)     // Catch: java.lang.Exception -> L28
        L27:
            goto L38
        L28:
            r4 = move-exception
            java.lang.String[] r3 = new java.lang.String[r3]
            r3[r2] = r1
            java.lang.String r1 = com.getcapacitor.Logger.tags(r3)
            java.lang.String r2 = r4.getMessage()
            com.getcapacitor.Logger.error(r1, r2, r4)
        L38:
            com.getcapacitor.MessageHandler r1 = r5.msgHandler
            r2 = 0
            r1.sendResponseMessage(r5, r2, r0)
            return
    }

    public void release(com.getcapacitor.Bridge r2) {
            r1 = this;
            r0 = 0
            r1.keepAlive = r0
            r2.releaseCall(r1)
            r0 = 1
            r1.isReleased = r0
            return
    }

    public void resolve() {
            r2 = this;
            com.getcapacitor.MessageHandler r0 = r2.msgHandler
            r1 = 0
            r0.sendResponseMessage(r2, r1, r1)
            return
    }

    public void resolve(com.getcapacitor.JSObject r4) {
            r3 = this;
            com.getcapacitor.PluginResult r0 = new com.getcapacitor.PluginResult
            r0.<init>(r4)
            com.getcapacitor.MessageHandler r1 = r3.msgHandler
            r2 = 0
            r1.sendResponseMessage(r3, r0, r2)
            return
    }

    @java.lang.Deprecated
    public void save() {
            r1 = this;
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.setKeepAlive(r0)
            return
    }

    public void setKeepAlive(java.lang.Boolean r2) {
            r1 = this;
            boolean r0 = r2.booleanValue()
            r1.keepAlive = r0
            return
    }

    public void successCallback(com.getcapacitor.PluginResult r3) {
            r2 = this;
            java.lang.String r0 = "-1"
            java.lang.String r1 = r2.callbackId
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            com.getcapacitor.MessageHandler r0 = r2.msgHandler
            r1 = 0
            r0.sendResponseMessage(r2, r3, r1)
            return
    }

    public void unavailable() {
            r1 = this;
            java.lang.String r0 = "not available"
            r1.unavailable(r0)
            return
    }

    public void unavailable(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "UNAVAILABLE"
            r1 = 0
            r2.reject(r3, r0, r1, r1)
            return
    }

    public void unimplemented() {
            r1 = this;
            java.lang.String r0 = "not implemented"
            r1.unimplemented(r0)
            return
    }

    public void unimplemented(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "UNIMPLEMENTED"
            r1 = 0
            r2.reject(r3, r0, r1, r1)
            return
    }
}
