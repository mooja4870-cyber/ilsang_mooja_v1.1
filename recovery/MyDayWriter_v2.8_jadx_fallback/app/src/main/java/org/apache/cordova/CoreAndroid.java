package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class CoreAndroid extends org.apache.cordova.CordovaPlugin {
    public static final java.lang.String PLUGIN_NAME = "CoreAndroid";
    protected static final java.lang.String TAG = "CordovaApp";
    private org.apache.cordova.CallbackContext messageChannel;
    private final java.lang.Object messageChannelLock;
    private org.apache.cordova.PluginResult pendingPause;
    private org.apache.cordova.PluginResult pendingResume;
    private android.content.BroadcastReceiver telephonyReceiver;






    public CoreAndroid() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.messageChannelLock = r0
            return
    }

    @java.lang.Deprecated
    public static java.lang.Object getBuildConfigValue(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "CordovaApp"
            java.lang.String r1 = "CoreAndroid.getBuildConfigValue is deprecated and will be removed in a future release. Use BuildHelper.getBuildConfigValue instead."
            org.apache.cordova.LOG.w(r0, r1)
            java.lang.Object r0 = org.apache.cordova.BuildHelper.getBuildConfigValue(r2, r3)
            return r0
    }

    private void initTelephonyReceiver() {
            r3 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.intent.action.PHONE_STATE"
            r0.addAction(r1)
            org.apache.cordova.CoreAndroid$5 r1 = new org.apache.cordova.CoreAndroid$5
            r1.<init>(r3)
            r3.telephonyReceiver = r1
            org.apache.cordova.CordovaWebView r1 = r3.webView
            android.content.Context r1 = r1.getContext()
            android.content.BroadcastReceiver r2 = r3.telephonyReceiver
            r1.registerReceiver(r2, r0)
            return
    }

    private void sendEventMessage(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "CordovaApp"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "action"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> Ld
            goto L13
        Ld:
            r2 = move-exception
            java.lang.String r3 = "Failed to create event message"
            org.apache.cordova.LOG.e(r0, r3, r2)
        L13:
            org.apache.cordova.PluginResult r2 = new org.apache.cordova.PluginResult
            org.apache.cordova.PluginResult$Status r3 = org.apache.cordova.PluginResult.Status.OK
            r2.<init>(r3, r1)
            org.apache.cordova.CallbackContext r3 = r5.messageChannel
            if (r3 != 0) goto L4b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Request to send event before messageChannel initialised: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            org.apache.cordova.LOG.i(r0, r3)
            java.lang.String r0 = "pause"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L3f
            r5.pendingPause = r2
            goto L4e
        L3f:
            java.lang.String r0 = "resume"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L4e
            r0 = 0
            r5.pendingPause = r0
            goto L4e
        L4b:
            r5.sendEventMessage(r2)
        L4e:
            return
    }

    private void sendEventMessage(org.apache.cordova.PluginResult r2) {
            r1 = this;
            r0 = 1
            r2.setKeepCallback(r0)
            org.apache.cordova.CallbackContext r0 = r1.messageChannel
            if (r0 == 0) goto Ld
            org.apache.cordova.CallbackContext r0 = r1.messageChannel
            r0.sendPluginResult(r2)
        Ld:
            return
    }

    public void backHistory() {
            r2 = this;
            org.apache.cordova.CordovaInterface r0 = r2.cordova
            androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
            org.apache.cordova.CoreAndroid$4 r1 = new org.apache.cordova.CoreAndroid$4
            r1.<init>(r2)
            r0.runOnUiThread(r1)
            return
    }

    public void clearCache() {
            r2 = this;
            org.apache.cordova.CordovaInterface r0 = r2.cordova
            androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
            org.apache.cordova.CoreAndroid$2 r1 = new org.apache.cordova.CoreAndroid$2
            r1.<init>(r2)
            r0.runOnUiThread(r1)
            return
    }

    public void clearHistory() {
            r2 = this;
            org.apache.cordova.CordovaInterface r0 = r2.cordova
            androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
            org.apache.cordova.CoreAndroid$3 r1 = new org.apache.cordova.CoreAndroid$3
            r1.<init>(r2)
            r0.runOnUiThread(r1)
            return
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(java.lang.String r8, org.json.JSONArray r9, org.apache.cordova.CallbackContext r10) throws org.json.JSONException {
            r7 = this;
            org.apache.cordova.PluginResult$Status r0 = org.apache.cordova.PluginResult.Status.OK
            java.lang.String r1 = ""
            r2 = 0
            java.lang.String r3 = "clearCache"
            boolean r3 = r8.equals(r3)     // Catch: org.json.JSONException -> Lc4
            r4 = 1
            if (r3 == 0) goto L13
            r7.clearCache()     // Catch: org.json.JSONException -> Lc4
            goto Lbb
        L13:
            java.lang.String r3 = "show"
            boolean r3 = r8.equals(r3)     // Catch: org.json.JSONException -> Lc4
            if (r3 == 0) goto L2b
            org.apache.cordova.CordovaInterface r3 = r7.cordova     // Catch: org.json.JSONException -> Lc4
            androidx.appcompat.app.AppCompatActivity r3 = r3.getActivity()     // Catch: org.json.JSONException -> Lc4
            org.apache.cordova.CoreAndroid$1 r5 = new org.apache.cordova.CoreAndroid$1     // Catch: org.json.JSONException -> Lc4
            r5.<init>(r7)     // Catch: org.json.JSONException -> Lc4
            r3.runOnUiThread(r5)     // Catch: org.json.JSONException -> Lc4
            goto Lbb
        L2b:
            java.lang.String r3 = "loadUrl"
            boolean r3 = r8.equals(r3)     // Catch: org.json.JSONException -> Lc4
            if (r3 == 0) goto L40
            java.lang.String r3 = r9.getString(r2)     // Catch: org.json.JSONException -> Lc4
            org.json.JSONObject r5 = r9.optJSONObject(r4)     // Catch: org.json.JSONException -> Lc4
            r7.loadUrl(r3, r5)     // Catch: org.json.JSONException -> Lc4
            goto Lbb
        L40:
            java.lang.String r3 = "cancelLoadUrl"
            boolean r3 = r8.equals(r3)     // Catch: org.json.JSONException -> Lc4
            if (r3 == 0) goto L4a
            goto Lbb
        L4a:
            java.lang.String r3 = "clearHistory"
            boolean r3 = r8.equals(r3)     // Catch: org.json.JSONException -> Lc4
            if (r3 == 0) goto L56
            r7.clearHistory()     // Catch: org.json.JSONException -> Lc4
            goto Lbb
        L56:
            java.lang.String r3 = "backHistory"
            boolean r3 = r8.equals(r3)     // Catch: org.json.JSONException -> Lc4
            if (r3 == 0) goto L62
            r7.backHistory()     // Catch: org.json.JSONException -> Lc4
            goto Lbb
        L62:
            java.lang.String r3 = "overrideButton"
            boolean r3 = r8.equals(r3)     // Catch: org.json.JSONException -> Lc4
            if (r3 == 0) goto L76
            java.lang.String r3 = r9.getString(r2)     // Catch: org.json.JSONException -> Lc4
            boolean r5 = r9.getBoolean(r4)     // Catch: org.json.JSONException -> Lc4
            r7.overrideButton(r3, r5)     // Catch: org.json.JSONException -> Lc4
            goto Lbb
        L76:
            java.lang.String r3 = "overrideBackbutton"
            boolean r3 = r8.equals(r3)     // Catch: org.json.JSONException -> Lc4
            if (r3 == 0) goto L86
            boolean r3 = r9.getBoolean(r2)     // Catch: org.json.JSONException -> Lc4
            r7.overrideBackbutton(r3)     // Catch: org.json.JSONException -> Lc4
            goto Lbb
        L86:
            java.lang.String r3 = "exitApp"
            boolean r3 = r8.equals(r3)     // Catch: org.json.JSONException -> Lc4
            if (r3 == 0) goto L92
            r7.exitApp()     // Catch: org.json.JSONException -> Lc4
            goto Lbb
        L92:
            java.lang.String r3 = "messageChannel"
            boolean r3 = r8.equals(r3)     // Catch: org.json.JSONException -> Lc4
            if (r3 == 0) goto Lbb
            java.lang.Object r3 = r7.messageChannelLock     // Catch: org.json.JSONException -> Lc4
            monitor-enter(r3)     // Catch: org.json.JSONException -> Lc4
            r7.messageChannel = r10     // Catch: java.lang.Throwable -> Lb8
            org.apache.cordova.PluginResult r5 = r7.pendingPause     // Catch: java.lang.Throwable -> Lb8
            r6 = 0
            if (r5 == 0) goto Lab
            org.apache.cordova.PluginResult r5 = r7.pendingPause     // Catch: java.lang.Throwable -> Lb8
            r7.sendEventMessage(r5)     // Catch: java.lang.Throwable -> Lb8
            r7.pendingPause = r6     // Catch: java.lang.Throwable -> Lb8
        Lab:
            org.apache.cordova.PluginResult r5 = r7.pendingResume     // Catch: java.lang.Throwable -> Lb8
            if (r5 == 0) goto Lb6
            org.apache.cordova.PluginResult r5 = r7.pendingResume     // Catch: java.lang.Throwable -> Lb8
            r7.sendEventMessage(r5)     // Catch: java.lang.Throwable -> Lb8
            r7.pendingResume = r6     // Catch: java.lang.Throwable -> Lb8
        Lb6:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb8
            return r4
        Lb8:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb8
            throw r4     // Catch: org.json.JSONException -> Lc4
        Lbb:
            org.apache.cordova.PluginResult r3 = new org.apache.cordova.PluginResult     // Catch: org.json.JSONException -> Lc4
            r3.<init>(r0, r1)     // Catch: org.json.JSONException -> Lc4
            r10.sendPluginResult(r3)     // Catch: org.json.JSONException -> Lc4
            return r4
        Lc4:
            r3 = move-exception
            org.apache.cordova.PluginResult r4 = new org.apache.cordova.PluginResult
            org.apache.cordova.PluginResult$Status r5 = org.apache.cordova.PluginResult.Status.JSON_EXCEPTION
            r4.<init>(r5)
            r10.sendPluginResult(r4)
            return r2
    }

    public void exitApp() {
            r3 = this;
            org.apache.cordova.CordovaWebView r0 = r3.webView
            org.apache.cordova.PluginManager r0 = r0.getPluginManager()
            java.lang.String r1 = "exit"
            r2 = 0
            r0.postMessage(r1, r2)
            return
    }

    public void fireJavascriptEvent(java.lang.String r1) {
            r0 = this;
            r0.sendEventMessage(r1)
            return
    }

    public boolean isBackbuttonOverridden() {
            r2 = this;
            org.apache.cordova.CordovaWebView r0 = r2.webView
            r1 = 4
            boolean r0 = r0.isButtonPlumbedToJs(r1)
            return r0
    }

    public void loadUrl(java.lang.String r11, org.json.JSONObject r12) throws org.json.JSONException {
            r10 = this;
            java.lang.String r0 = "App"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "App.loadUrl("
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = ","
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r2 = ")"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.cordova.LOG.d(r0, r1)
            r0 = 0
            r1 = 0
            r2 = 0
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r12 == 0) goto Laa
            org.json.JSONArray r4 = r12.names()
            r5 = 0
        L37:
            int r6 = r4.length()
            if (r5 >= r6) goto Laa
            java.lang.String r6 = r4.getString(r5)
            java.lang.String r7 = "wait"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L4e
            int r0 = r12.getInt(r6)
            goto La7
        L4e:
            java.lang.String r7 = "openexternal"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L5b
            boolean r1 = r12.getBoolean(r6)
            goto La7
        L5b:
            java.lang.String r7 = "clearhistory"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L68
            boolean r2 = r12.getBoolean(r6)
            goto La7
        L68:
            java.lang.Object r7 = r12.get(r6)
            if (r7 != 0) goto L6f
            goto La7
        L6f:
            java.lang.Class r8 = r7.getClass()
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L82
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            r3.put(r6, r8)
            goto La7
        L82:
            java.lang.Class r8 = r7.getClass()
            java.lang.Class<java.lang.Boolean> r9 = java.lang.Boolean.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L95
            r8 = r7
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r3.put(r6, r8)
            goto La7
        L95:
            java.lang.Class r8 = r7.getClass()
            java.lang.Class<java.lang.Integer> r9 = java.lang.Integer.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto La7
            r8 = r7
            java.lang.Integer r8 = (java.lang.Integer) r8
            r3.put(r6, r8)
        La7:
            int r5 = r5 + 1
            goto L37
        Laa:
            if (r0 <= 0) goto Lba
            monitor-enter(r10)     // Catch: java.lang.InterruptedException -> Lb6
            long r4 = (long) r0
            r10.wait(r4)     // Catch: java.lang.Throwable -> Lb3
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb3
            goto Lba
        Lb3:
            r4 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb3
            throw r4     // Catch: java.lang.InterruptedException -> Lb6
        Lb6:
            r4 = move-exception
            r4.printStackTrace()
        Lba:
            org.apache.cordova.CordovaWebView r4 = r10.webView
            r4.showWebPage(r11, r1, r2, r3)
            return
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onDestroy() {
            r2 = this;
            org.apache.cordova.CordovaWebView r0 = r2.webView
            android.content.Context r0 = r0.getContext()
            android.content.BroadcastReceiver r1 = r2.telephonyReceiver
            r0.unregisterReceiver(r1)
            return
    }

    public void overrideBackbutton(boolean r3) {
            r2 = this;
            java.lang.String r0 = "App"
            java.lang.String r1 = "WARNING: Back Button Default Behavior will be overridden.  The backbutton event will be fired!"
            org.apache.cordova.LOG.i(r0, r1)
            org.apache.cordova.CordovaWebView r0 = r2.webView
            r1 = 4
            r0.setButtonPlumbedToJs(r1, r3)
            return
    }

    public void overrideButton(java.lang.String r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "App"
            java.lang.String r1 = "WARNING: Volume Button Default Behavior will be overridden.  The volume event will be fired!"
            org.apache.cordova.LOG.i(r0, r1)
            java.lang.String r0 = "volumeup"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L17
            org.apache.cordova.CordovaWebView r0 = r2.webView
            r1 = 24
            r0.setButtonPlumbedToJs(r1, r4)
            goto L36
        L17:
            java.lang.String r0 = "volumedown"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L27
            org.apache.cordova.CordovaWebView r0 = r2.webView
            r1 = 25
            r0.setButtonPlumbedToJs(r1, r4)
            goto L36
        L27:
            java.lang.String r0 = "menubutton"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L36
            org.apache.cordova.CordovaWebView r0 = r2.webView
            r1 = 82
            r0.setButtonPlumbedToJs(r1, r4)
        L36:
            return
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void pluginInitialize() {
            r0 = this;
            r0.initTelephonyReceiver()
            return
    }

    public void sendResumeEvent(org.apache.cordova.PluginResult r3) {
            r2 = this;
            java.lang.Object r0 = r2.messageChannelLock
            monitor-enter(r0)
            org.apache.cordova.CallbackContext r1 = r2.messageChannel     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto Lb
            r2.sendEventMessage(r3)     // Catch: java.lang.Throwable -> Lf
            goto Ld
        Lb:
            r2.pendingResume = r3     // Catch: java.lang.Throwable -> Lf
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }
}
