package com.getcapacitor.util;

/* JADX INFO: loaded from: classes2.dex */
public class JSONUtils {
    public JSONUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String[] getArray(org.json.JSONObject r7, java.lang.String r8, java.lang.String[] r9) {
            java.lang.String r0 = getDeepestKey(r8)
            org.json.JSONObject r1 = getDeepestObject(r7, r8)     // Catch: org.json.JSONException -> L24
            org.json.JSONArray r2 = r1.getJSONArray(r0)     // Catch: org.json.JSONException -> L24
            if (r2 != 0) goto Lf
            return r9
        Lf:
            int r3 = r2.length()     // Catch: org.json.JSONException -> L24
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: org.json.JSONException -> L24
            r5 = 0
        L16:
            if (r5 >= r3) goto L23
            java.lang.Object r6 = r2.get(r5)     // Catch: org.json.JSONException -> L24
            java.lang.String r6 = (java.lang.String) r6     // Catch: org.json.JSONException -> L24
            r4[r5] = r6     // Catch: org.json.JSONException -> L24
            int r5 = r5 + 1
            goto L16
        L23:
            return r4
        L24:
            r1 = move-exception
            return r9
    }

    public static boolean getBoolean(org.json.JSONObject r3, java.lang.String r4, boolean r5) {
            java.lang.String r0 = getDeepestKey(r4)
            org.json.JSONObject r1 = getDeepestObject(r3, r4)     // Catch: org.json.JSONException -> Ld
            boolean r2 = r1.getBoolean(r0)     // Catch: org.json.JSONException -> Ld
            return r2
        Ld:
            r1 = move-exception
            return r5
    }

    private static java.lang.String getDeepestKey(java.lang.String r2) {
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r2.split(r0)
            int r1 = r0.length
            if (r1 <= 0) goto Lf
            int r1 = r0.length
            int r1 = r1 + (-1)
            r1 = r0[r1]
            return r1
        Lf:
            r1 = 0
            return r1
    }

    private static org.json.JSONObject getDeepestObject(org.json.JSONObject r4, java.lang.String r5) throws org.json.JSONException {
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r5.split(r0)
            r1 = r4
            r2 = 0
        L8:
            int r3 = r0.length
            int r3 = r3 + (-1)
            if (r2 >= r3) goto L16
            r3 = r0[r2]
            org.json.JSONObject r1 = r1.getJSONObject(r3)
            int r2 = r2 + 1
            goto L8
        L16:
            return r1
    }

    public static int getInt(org.json.JSONObject r3, java.lang.String r4, int r5) {
            java.lang.String r0 = getDeepestKey(r4)
            org.json.JSONObject r1 = getDeepestObject(r3, r4)     // Catch: org.json.JSONException -> Ld
            int r2 = r1.getInt(r0)     // Catch: org.json.JSONException -> Ld
            return r2
        Ld:
            r1 = move-exception
            return r5
    }

    public static org.json.JSONObject getObject(org.json.JSONObject r3, java.lang.String r4) {
            java.lang.String r0 = getDeepestKey(r4)
            org.json.JSONObject r1 = getDeepestObject(r3, r4)     // Catch: org.json.JSONException -> Ld
            org.json.JSONObject r2 = r1.getJSONObject(r0)     // Catch: org.json.JSONException -> Ld
            return r2
        Ld:
            r1 = move-exception
            r1 = 0
            return r1
    }

    public static java.lang.String getString(org.json.JSONObject r3, java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = getDeepestKey(r4)
            org.json.JSONObject r1 = getDeepestObject(r3, r4)     // Catch: org.json.JSONException -> L10
            java.lang.String r2 = r1.getString(r0)     // Catch: org.json.JSONException -> L10
            if (r2 != 0) goto Lf
            return r5
        Lf:
            return r2
        L10:
            r1 = move-exception
            return r5
    }
}
