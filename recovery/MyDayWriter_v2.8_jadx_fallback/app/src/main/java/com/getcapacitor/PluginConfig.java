package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class PluginConfig {
    private final org.json.JSONObject config;

    PluginConfig(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>()
            r0.config = r1
            return
    }

    public java.lang.String[] getArray(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.lang.String[] r0 = r1.getArray(r2, r0)
            return r0
    }

    public java.lang.String[] getArray(java.lang.String r2, java.lang.String[] r3) {
            r1 = this;
            org.json.JSONObject r0 = r1.config
            java.lang.String[] r0 = com.getcapacitor.util.JSONUtils.getArray(r0, r2, r3)
            return r0
    }

    public boolean getBoolean(java.lang.String r2, boolean r3) {
            r1 = this;
            org.json.JSONObject r0 = r1.config
            boolean r0 = com.getcapacitor.util.JSONUtils.getBoolean(r0, r2, r3)
            return r0
    }

    public org.json.JSONObject getConfigJSON() {
            r1 = this;
            org.json.JSONObject r0 = r1.config
            return r0
    }

    public int getInt(java.lang.String r2, int r3) {
            r1 = this;
            org.json.JSONObject r0 = r1.config
            int r0 = com.getcapacitor.util.JSONUtils.getInt(r0, r2, r3)
            return r0
    }

    public org.json.JSONObject getObject(java.lang.String r2) {
            r1 = this;
            org.json.JSONObject r0 = r1.config
            org.json.JSONObject r0 = com.getcapacitor.util.JSONUtils.getObject(r0, r2)
            return r0
    }

    public java.lang.String getString(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.getString(r2, r0)
            return r0
    }

    public java.lang.String getString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            org.json.JSONObject r0 = r1.config
            java.lang.String r0 = com.getcapacitor.util.JSONUtils.getString(r0, r2, r3)
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            org.json.JSONObject r0 = r1.config
            int r0 = r0.length()
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }
}
