package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class CordovaPlugin {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public org.apache.cordova.CordovaInterface cordova;
    protected org.apache.cordova.CordovaPreferences preferences;
    private java.lang.String serviceName;
    public org.apache.cordova.CordovaWebView webView;

    static {
            return
    }

    public CordovaPlugin() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean execute(java.lang.String r3, java.lang.String r4, org.apache.cordova.CallbackContext r5) throws org.json.JSONException {
            r2 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r4)
            boolean r1 = r2.execute(r3, r0, r5)
            return r1
    }

    public boolean execute(java.lang.String r2, org.apache.cordova.CordovaArgs r3, org.apache.cordova.CallbackContext r4) throws org.json.JSONException {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean execute(java.lang.String r3, org.json.JSONArray r4, org.apache.cordova.CallbackContext r5) throws org.json.JSONException {
            r2 = this;
            org.apache.cordova.CordovaArgs r0 = new org.apache.cordova.CordovaArgs
            r0.<init>(r4)
            boolean r1 = r2.execute(r3, r0, r5)
            return r1
    }

    protected android.net.Uri fromPluginUri(android.net.Uri r2) {
            r1 = this;
            java.lang.String r0 = "origUri"
            java.lang.String r0 = r2.getQueryParameter(r0)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            return r0
    }

    public org.apache.cordova.CordovaPluginPathHandler getPathHandler() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getServiceName() {
            r1 = this;
            java.lang.String r0 = r1.serviceName
            return r0
    }

    public org.apache.cordova.CordovaResourceApi.OpenForReadResult handleOpenForRead(android.net.Uri r4) throws java.io.IOException {
            r3 = this;
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Plugin can't handle uri: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public boolean hasPermisssion() {
            r1 = this;
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public void initialize(org.apache.cordova.CordovaInterface r1, org.apache.cordova.CordovaWebView r2) {
            r0 = this;
            return
    }

    public void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            return
    }

    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    public void onDestroy() {
            r0 = this;
            return
    }

    public java.lang.Object onMessage(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            r0 = 0
            return r0
    }

    public void onNewIntent(android.content.Intent r1) {
            r0 = this;
            return
    }

    public boolean onOverrideUrlLoading(java.lang.String r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    public void onPause(boolean r1) {
            r0 = this;
            return
    }

    public boolean onReceivedClientCertRequest(org.apache.cordova.CordovaWebView r2, org.apache.cordova.ICordovaClientCertRequest r3) {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean onReceivedHttpAuthRequest(org.apache.cordova.CordovaWebView r2, org.apache.cordova.ICordovaHttpAuthHandler r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean onRenderProcessGone(android.webkit.WebView r2, android.webkit.RenderProcessGoneDetail r3) {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public void onRequestPermissionResult(int r1, java.lang.String[] r2, int[] r3) throws org.json.JSONException {
            r0 = this;
            return
    }

    public void onRequestPermissionsResult(int r1, java.lang.String[] r2, int[] r3) throws org.json.JSONException {
            r0 = this;
            return
    }

    public void onReset() {
            r0 = this;
            return
    }

    public void onRestoreStateForActivityResult(android.os.Bundle r1, org.apache.cordova.CallbackContext r2) {
            r0 = this;
            return
    }

    public void onResume(boolean r1) {
            r0 = this;
            return
    }

    public android.os.Bundle onSaveInstanceState() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void onStart() {
            r0 = this;
            return
    }

    public void onStop() {
            r0 = this;
            return
    }

    protected void pluginInitialize() {
            r0 = this;
            return
    }

    public final void privateInitialize(java.lang.String r2, org.apache.cordova.CordovaInterface r3, org.apache.cordova.CordovaWebView r4, org.apache.cordova.CordovaPreferences r5) {
            r1 = this;
            org.apache.cordova.CordovaInterface r0 = r1.cordova
            if (r0 != 0) goto L13
            r1.serviceName = r2
            r1.cordova = r3
            r1.webView = r4
            r1.preferences = r5
            r1.initialize(r3, r4)
            r1.pluginInitialize()
            return
        L13:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    public android.net.Uri remapUri(android.net.Uri r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    public void requestPermissions(int r1) {
            r0 = this;
            return
    }

    public java.lang.Boolean shouldAllowBridgeAccess(java.lang.String r2) {
            r1 = this;
            java.lang.Boolean r0 = r1.shouldAllowNavigation(r2)
            return r0
    }

    public java.lang.Boolean shouldAllowNavigation(java.lang.String r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.Boolean shouldAllowRequest(java.lang.String r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.Boolean shouldOpenExternalUrl(java.lang.String r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    protected android.net.Uri toPluginUri(android.net.Uri r4) {
            r3 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "cdvplugin"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            java.lang.String r1 = r3.serviceName
            android.net.Uri$Builder r0 = r0.authority(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "origUri"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r1)
            android.net.Uri r0 = r0.build()
            return r0
    }
}
