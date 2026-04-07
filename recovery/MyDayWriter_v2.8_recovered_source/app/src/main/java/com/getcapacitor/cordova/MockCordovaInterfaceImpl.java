package com.getcapacitor.cordova;

/* JADX INFO: loaded from: classes2.dex */
public class MockCordovaInterfaceImpl extends org.apache.cordova.CordovaInterfaceImpl {
    public MockCordovaInterfaceImpl(androidx.appcompat.app.AppCompatActivity r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            r1.<init>(r2, r0)
            return
    }

    public org.apache.cordova.CordovaPlugin getActivityResultCallback() {
            r1 = this;
            org.apache.cordova.CordovaPlugin r0 = r1.activityResultCallback
            return r0
    }

    public boolean handlePermissionResult(int r4, java.lang.String[] r5, int[] r6) throws org.json.JSONException {
            r3 = this;
            org.apache.cordova.CallbackMap r0 = r3.permissionResultCallbacks
            android.util.Pair r0 = r0.getAndRemoveCallback(r4)
            if (r0 == 0) goto L19
            java.lang.Object r1 = r0.first
            org.apache.cordova.CordovaPlugin r1 = (org.apache.cordova.CordovaPlugin) r1
            java.lang.Object r2 = r0.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.onRequestPermissionResult(r2, r5, r6)
            r1 = 1
            return r1
        L19:
            r1 = 0
            return r1
    }
}
