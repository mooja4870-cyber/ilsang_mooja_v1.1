package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class CallbackContext {
    private static final java.lang.String LOG_TAG = "CordovaPlugin";
    private java.lang.String callbackId;
    private int changingThreads;
    protected boolean finished;
    private org.apache.cordova.CordovaWebView webView;

    public CallbackContext(java.lang.String r1, org.apache.cordova.CordovaWebView r2) {
            r0 = this;
            r0.<init>()
            r0.callbackId = r1
            r0.webView = r2
            return
    }

    public void error(int r3) {
            r2 = this;
            org.apache.cordova.PluginResult r0 = new org.apache.cordova.PluginResult
            org.apache.cordova.PluginResult$Status r1 = org.apache.cordova.PluginResult.Status.ERROR
            r0.<init>(r1, r3)
            r2.sendPluginResult(r0)
            return
    }

    public void error(java.lang.String r3) {
            r2 = this;
            org.apache.cordova.PluginResult r0 = new org.apache.cordova.PluginResult
            org.apache.cordova.PluginResult$Status r1 = org.apache.cordova.PluginResult.Status.ERROR
            r0.<init>(r1, r3)
            r2.sendPluginResult(r0)
            return
    }

    public void error(org.json.JSONObject r3) {
            r2 = this;
            org.apache.cordova.PluginResult r0 = new org.apache.cordova.PluginResult
            org.apache.cordova.PluginResult$Status r1 = org.apache.cordova.PluginResult.Status.ERROR
            r0.<init>(r1, r3)
            r2.sendPluginResult(r0)
            return
    }

    public java.lang.String getCallbackId() {
            r1 = this;
            java.lang.String r0 = r1.callbackId
            return r0
    }

    public boolean isChangingThreads() {
            r1 = this;
            int r0 = r1.changingThreads
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isFinished() {
            r1 = this;
            boolean r0 = r1.finished
            return r0
    }

    public void sendPluginResult(org.apache.cordova.PluginResult r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.finished     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L2f
            java.lang.String r0 = "CordovaPlugin"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r1.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "Attempted to send a second callback for ID: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r3.callbackId     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "\nResult was: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r4.getMessage()     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L43
            org.apache.cordova.LOG.w(r0, r1)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            return
        L2f:
            boolean r0 = r4.getKeepCallback()     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            r3.finished = r0     // Catch: java.lang.Throwable -> L43
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            org.apache.cordova.CordovaWebView r0 = r3.webView
            java.lang.String r1 = r3.callbackId
            r0.sendPluginResult(r4, r1)
            return
        L43:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            throw r0
    }

    public void success() {
            r2 = this;
            org.apache.cordova.PluginResult r0 = new org.apache.cordova.PluginResult
            org.apache.cordova.PluginResult$Status r1 = org.apache.cordova.PluginResult.Status.OK
            r0.<init>(r1)
            r2.sendPluginResult(r0)
            return
    }

    public void success(int r3) {
            r2 = this;
            org.apache.cordova.PluginResult r0 = new org.apache.cordova.PluginResult
            org.apache.cordova.PluginResult$Status r1 = org.apache.cordova.PluginResult.Status.OK
            r0.<init>(r1, r3)
            r2.sendPluginResult(r0)
            return
    }

    public void success(java.lang.String r3) {
            r2 = this;
            org.apache.cordova.PluginResult r0 = new org.apache.cordova.PluginResult
            org.apache.cordova.PluginResult$Status r1 = org.apache.cordova.PluginResult.Status.OK
            r0.<init>(r1, r3)
            r2.sendPluginResult(r0)
            return
    }

    public void success(org.json.JSONArray r3) {
            r2 = this;
            org.apache.cordova.PluginResult r0 = new org.apache.cordova.PluginResult
            org.apache.cordova.PluginResult$Status r1 = org.apache.cordova.PluginResult.Status.OK
            r0.<init>(r1, r3)
            r2.sendPluginResult(r0)
            return
    }

    public void success(org.json.JSONObject r3) {
            r2 = this;
            org.apache.cordova.PluginResult r0 = new org.apache.cordova.PluginResult
            org.apache.cordova.PluginResult$Status r1 = org.apache.cordova.PluginResult.Status.OK
            r0.<init>(r1, r3)
            r2.sendPluginResult(r0)
            return
    }

    public void success(byte[] r3) {
            r2 = this;
            org.apache.cordova.PluginResult r0 = new org.apache.cordova.PluginResult
            org.apache.cordova.PluginResult$Status r1 = org.apache.cordova.PluginResult.Status.OK
            r0.<init>(r1, r3)
            r2.sendPluginResult(r0)
            return
    }
}
