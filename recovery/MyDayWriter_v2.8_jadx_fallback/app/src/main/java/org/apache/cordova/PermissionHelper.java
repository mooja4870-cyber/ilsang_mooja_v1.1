package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class PermissionHelper {
    private static final java.lang.String LOG_TAG = "CordovaPermissionHelper";

    public PermissionHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void deliverPermissionResult(org.apache.cordova.CordovaPlugin r4, int r5, java.lang.String[] r6) {
            int r0 = r6.length
            int[] r0 = new int[r0]
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r4.onRequestPermissionResult(r5, r6, r0)     // Catch: org.json.JSONException -> Le
            r4.onRequestPermissionsResult(r5, r6, r0)     // Catch: org.json.JSONException -> Le
            goto L16
        Le:
            r1 = move-exception
            java.lang.String r2 = "CordovaPermissionHelper"
            java.lang.String r3 = "JSONException when delivering permissions results"
            org.apache.cordova.LOG.e(r2, r3, r1)
        L16:
            return
    }

    public static boolean hasPermission(org.apache.cordova.CordovaPlugin r1, java.lang.String r2) {
            org.apache.cordova.CordovaInterface r0 = r1.cordova
            boolean r0 = r0.hasPermission(r2)
            return r0
    }

    public static void requestPermission(org.apache.cordova.CordovaPlugin r2, int r3, java.lang.String r4) {
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r4
            requestPermissions(r2, r3, r0)
            return
    }

    public static void requestPermissions(org.apache.cordova.CordovaPlugin r1, int r2, java.lang.String[] r3) {
            org.apache.cordova.CordovaInterface r0 = r1.cordova
            r0.requestPermissions(r1, r2, r3)
            return
    }
}
