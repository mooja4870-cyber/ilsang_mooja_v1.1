package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class CordovaArgs {
    private org.json.JSONArray baseArgs;

    public CordovaArgs(org.json.JSONArray r1) {
            r0 = this;
            r0.<init>()
            r0.baseArgs = r1
            return
    }

    public java.lang.Object get(int r2) throws org.json.JSONException {
            r1 = this;
            org.json.JSONArray r0 = r1.baseArgs
            java.lang.Object r0 = r0.get(r2)
            return r0
    }

    public byte[] getArrayBuffer(int r3) throws org.json.JSONException {
            r2 = this;
            org.json.JSONArray r0 = r2.baseArgs
            java.lang.String r0 = r0.getString(r3)
            r1 = 0
            byte[] r1 = android.util.Base64.decode(r0, r1)
            return r1
    }

    public boolean getBoolean(int r2) throws org.json.JSONException {
            r1 = this;
            org.json.JSONArray r0 = r1.baseArgs
            boolean r0 = r0.getBoolean(r2)
            return r0
    }

    public double getDouble(int r3) throws org.json.JSONException {
            r2 = this;
            org.json.JSONArray r0 = r2.baseArgs
            double r0 = r0.getDouble(r3)
            return r0
    }

    public int getInt(int r2) throws org.json.JSONException {
            r1 = this;
            org.json.JSONArray r0 = r1.baseArgs
            int r0 = r0.getInt(r2)
            return r0
    }

    public org.json.JSONArray getJSONArray(int r2) throws org.json.JSONException {
            r1 = this;
            org.json.JSONArray r0 = r1.baseArgs
            org.json.JSONArray r0 = r0.getJSONArray(r2)
            return r0
    }

    public org.json.JSONObject getJSONObject(int r2) throws org.json.JSONException {
            r1 = this;
            org.json.JSONArray r0 = r1.baseArgs
            org.json.JSONObject r0 = r0.getJSONObject(r2)
            return r0
    }

    public long getLong(int r3) throws org.json.JSONException {
            r2 = this;
            org.json.JSONArray r0 = r2.baseArgs
            long r0 = r0.getLong(r3)
            return r0
    }

    public java.lang.String getString(int r2) throws org.json.JSONException {
            r1 = this;
            org.json.JSONArray r0 = r1.baseArgs
            java.lang.String r0 = r0.getString(r2)
            return r0
    }

    public boolean isNull(int r2) {
            r1 = this;
            org.json.JSONArray r0 = r1.baseArgs
            boolean r0 = r0.isNull(r2)
            return r0
    }

    public java.lang.Object opt(int r2) {
            r1 = this;
            org.json.JSONArray r0 = r1.baseArgs
            java.lang.Object r0 = r0.opt(r2)
            return r0
    }

    public boolean optBoolean(int r2) {
            r1 = this;
            org.json.JSONArray r0 = r1.baseArgs
            boolean r0 = r0.optBoolean(r2)
            return r0
    }

    public double optDouble(int r3) {
            r2 = this;
            org.json.JSONArray r0 = r2.baseArgs
            double r0 = r0.optDouble(r3)
            return r0
    }

    public int optInt(int r2) {
            r1 = this;
            org.json.JSONArray r0 = r1.baseArgs
            int r0 = r0.optInt(r2)
            return r0
    }

    public org.json.JSONArray optJSONArray(int r2) {
            r1 = this;
            org.json.JSONArray r0 = r1.baseArgs
            org.json.JSONArray r0 = r0.optJSONArray(r2)
            return r0
    }

    public org.json.JSONObject optJSONObject(int r2) {
            r1 = this;
            org.json.JSONArray r0 = r1.baseArgs
            org.json.JSONObject r0 = r0.optJSONObject(r2)
            return r0
    }

    public long optLong(int r3) {
            r2 = this;
            org.json.JSONArray r0 = r2.baseArgs
            long r0 = r0.optLong(r3)
            return r0
    }

    public java.lang.String optString(int r2) {
            r1 = this;
            org.json.JSONArray r0 = r1.baseArgs
            java.lang.String r0 = r0.optString(r2)
            return r0
    }
}
