package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class ResumeCallback extends org.apache.cordova.CallbackContext {
    private final java.lang.String TAG;
    private org.apache.cordova.PluginManager pluginManager;
    private java.lang.String serviceName;

    public ResumeCallback(java.lang.String r3, org.apache.cordova.PluginManager r4) {
            r2 = this;
            java.lang.String r0 = "resumecallback"
            r1 = 0
            r2.<init>(r0, r1)
            java.lang.String r0 = "CordovaResumeCallback"
            r2.TAG = r0
            r2.serviceName = r3
            r2.pluginManager = r4
            return
    }

    @Override // org.apache.cordova.CallbackContext
    public void sendPluginResult(org.apache.cordova.PluginResult r8) {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.finished     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L29
            java.lang.String r0 = "CordovaResumeCallback"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87
            r1.<init>()     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = r7.serviceName     // Catch: java.lang.Throwable -> L87
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = " attempted to send a second callback to ResumeCallback\nResult was: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = r8.getMessage()     // Catch: java.lang.Throwable -> L87
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L87
            org.apache.cordova.LOG.w(r0, r1)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L87
            return
        L29:
            r0 = 1
            r7.finished = r0     // Catch: java.lang.Throwable -> L87
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L87
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "pluginServiceName"
            java.lang.String r3 = r7.serviceName     // Catch: org.json.JSONException -> L58
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L58
            java.lang.String r2 = "pluginStatus"
            java.lang.String[] r3 = org.apache.cordova.PluginResult.StatusMessages     // Catch: org.json.JSONException -> L58
            int r4 = r8.getStatus()     // Catch: org.json.JSONException -> L58
            r3 = r3[r4]     // Catch: org.json.JSONException -> L58
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L58
            java.lang.String r2 = "action"
            java.lang.String r3 = "resume"
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L58
            java.lang.String r2 = "pendingResult"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L58
            goto L60
        L58:
            r2 = move-exception
            java.lang.String r3 = "CordovaResumeCallback"
            java.lang.String r4 = "Unable to create resume object for Activity Result"
            org.apache.cordova.LOG.e(r3, r4)
        L60:
            org.apache.cordova.PluginResult r2 = new org.apache.cordova.PluginResult
            org.apache.cordova.PluginResult$Status r3 = org.apache.cordova.PluginResult.Status.OK
            r2.<init>(r3, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r2)
            r3.add(r8)
            org.apache.cordova.PluginManager r4 = r7.pluginManager
            java.lang.String r5 = "CoreAndroid"
            org.apache.cordova.CordovaPlugin r4 = r4.getPlugin(r5)
            org.apache.cordova.CoreAndroid r4 = (org.apache.cordova.CoreAndroid) r4
            org.apache.cordova.PluginResult r5 = new org.apache.cordova.PluginResult
            org.apache.cordova.PluginResult$Status r6 = org.apache.cordova.PluginResult.Status.OK
            r5.<init>(r6, r3)
            r4.sendResumeEvent(r5)
            return
        L87:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L87
            throw r0
    }
}
