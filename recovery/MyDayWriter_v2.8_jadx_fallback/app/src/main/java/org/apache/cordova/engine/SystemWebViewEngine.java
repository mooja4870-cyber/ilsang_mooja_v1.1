package org.apache.cordova.engine;

/* JADX INFO: loaded from: classes7.dex */
public class SystemWebViewEngine implements org.apache.cordova.CordovaWebViewEngine {
    public static final java.lang.String TAG = "SystemWebViewEngine";
    protected org.apache.cordova.CordovaBridge bridge;
    protected org.apache.cordova.CordovaWebViewEngine.Client client;
    protected final org.apache.cordova.engine.SystemCookieManager cookieManager;
    protected org.apache.cordova.CordovaInterface cordova;
    protected org.apache.cordova.NativeToJsMessageQueue nativeToJsMessageQueue;
    protected org.apache.cordova.CordovaWebView parentWebView;
    protected org.apache.cordova.PluginManager pluginManager;
    protected org.apache.cordova.CordovaPreferences preferences;
    private android.content.BroadcastReceiver receiver;
    protected org.apache.cordova.CordovaResourceApi resourceApi;
    protected final org.apache.cordova.engine.SystemWebView webView;



    public SystemWebViewEngine(android.content.Context r2, org.apache.cordova.CordovaPreferences r3) {
            r1 = this;
            org.apache.cordova.engine.SystemWebView r0 = new org.apache.cordova.engine.SystemWebView
            r0.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    public SystemWebViewEngine(org.apache.cordova.engine.SystemWebView r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SystemWebViewEngine(org.apache.cordova.engine.SystemWebView r2, org.apache.cordova.CordovaPreferences r3) {
            r1 = this;
            r1.<init>()
            r1.preferences = r3
            r1.webView = r2
            org.apache.cordova.engine.SystemCookieManager r0 = new org.apache.cordova.engine.SystemCookieManager
            r0.<init>(r2)
            r1.cookieManager = r0
            return
    }

    private void enableRemoteDebugging() {
            r3 = this;
            r0 = 1
            android.webkit.WebView.setWebContentsDebuggingEnabled(r0)     // Catch: java.lang.IllegalArgumentException -> L5
            goto L10
        L5:
            r0 = move-exception
            java.lang.String r1 = "SystemWebViewEngine"
            java.lang.String r2 = "You have one job! To turn on Remote Web Debugging! YOU HAVE FAILED! "
            org.apache.cordova.LOG.d(r1, r2)
            r0.printStackTrace()
        L10:
            return
    }

    private static void exposeJsInterface(android.webkit.WebView r2, org.apache.cordova.CordovaBridge r3) {
            org.apache.cordova.engine.SystemExposedJsApi r0 = new org.apache.cordova.engine.SystemExposedJsApi
            r0.<init>(r3)
            java.lang.String r1 = "_cordovaNative"
            r2.addJavascriptInterface(r0, r1)
            return
    }

    private void initWebViewSettings() {
            r10 = this;
            org.apache.cordova.engine.SystemWebView r0 = r10.webView
            r1 = 0
            r0.setInitialScale(r1)
            org.apache.cordova.engine.SystemWebView r0 = r10.webView
            r0.setVerticalScrollBarEnabled(r1)
            org.apache.cordova.engine.SystemWebView r0 = r10.webView
            android.webkit.WebSettings r0 = r0.getSettings()
            r2 = 1
            r0.setJavaScriptEnabled(r2)
            r0.setJavaScriptCanOpenWindowsAutomatically(r2)
            android.webkit.WebSettings$LayoutAlgorithm r3 = android.webkit.WebSettings.LayoutAlgorithm.NORMAL
            r0.setLayoutAlgorithm(r3)
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "CordovaWebView is running on device made by: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "SystemWebViewEngine"
            org.apache.cordova.LOG.d(r5, r4)
            r0.setSaveFormData(r1)
            org.apache.cordova.CordovaPreferences r4 = r10.preferences
            java.lang.String r6 = "AndroidInsecureFileModeEnabled"
            boolean r4 = r4.getBoolean(r6, r1)
            if (r4 == 0) goto L54
            java.lang.String r4 = "Enabled insecure file access"
            org.apache.cordova.LOG.d(r5, r4)
            r0.setAllowFileAccess(r2)
            r0.setAllowUniversalAccessFromFileURLs(r2)
            org.apache.cordova.engine.SystemCookieManager r4 = r10.cookieManager
            r4.setAcceptFileSchemeCookies()
        L54:
            r0.setMediaPlaybackRequiresUserGesture(r1)
            org.apache.cordova.engine.SystemWebView r4 = r10.webView
            android.content.Context r4 = r4.getContext()
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.String r5 = "database"
            java.io.File r4 = r4.getDir(r5, r1)
            java.lang.String r4 = r4.getPath()
            r0.setDatabaseEnabled(r2)
            org.apache.cordova.CordovaPreferences r5 = r10.preferences
            java.lang.String r6 = "InspectableWebview"
            r7 = 0
            java.lang.String r5 = r5.getString(r6, r7)
            r6 = 0
            if (r5 != 0) goto L91
            org.apache.cordova.engine.SystemWebView r8 = r10.webView
            android.content.Context r8 = r8.getContext()
            android.content.Context r8 = r8.getApplicationContext()
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo()
            int r9 = r8.flags
            r9 = r9 & 2
            if (r9 == 0) goto L8f
            r1 = r2
        L8f:
            r6 = r1
            goto L9a
        L91:
            java.lang.String r1 = "true"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L9a
            r6 = 1
        L9a:
            if (r6 == 0) goto L9f
            r10.enableRemoteDebugging()
        L9f:
            r0.setGeolocationDatabasePath(r4)
            r0.setDomStorageEnabled(r2)
            r0.setGeolocationEnabled(r2)
            java.lang.String r1 = r0.getUserAgentString()
            org.apache.cordova.CordovaPreferences r2 = r10.preferences
            java.lang.String r8 = "OverrideUserAgent"
            java.lang.String r2 = r2.getString(r8, r7)
            if (r2 == 0) goto Lba
            r0.setUserAgentString(r2)
            goto Lde
        Lba:
            org.apache.cordova.CordovaPreferences r8 = r10.preferences
            java.lang.String r9 = "AppendUserAgent"
            java.lang.String r7 = r8.getString(r9, r7)
            if (r7 == 0) goto Lde
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r9 = " "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r7)
            java.lang.String r8 = r8.toString()
            r0.setUserAgentString(r8)
        Lde:
            android.content.IntentFilter r7 = new android.content.IntentFilter
            r7.<init>()
            java.lang.String r8 = "android.intent.action.CONFIGURATION_CHANGED"
            r7.addAction(r8)
            android.content.BroadcastReceiver r8 = r10.receiver
            if (r8 != 0) goto Lfe
            org.apache.cordova.engine.SystemWebViewEngine$2 r8 = new org.apache.cordova.engine.SystemWebViewEngine$2
            r8.<init>(r10, r0)
            r10.receiver = r8
            org.apache.cordova.engine.SystemWebView r8 = r10.webView
            android.content.Context r8 = r8.getContext()
            android.content.BroadcastReceiver r9 = r10.receiver
            r8.registerReceiver(r9, r7)
        Lfe:
            return
    }

    @Override // org.apache.cordova.CordovaWebViewEngine
    public boolean canGoBack() {
            r1 = this;
            org.apache.cordova.engine.SystemWebView r0 = r1.webView
            boolean r0 = r0.canGoBack()
            return r0
    }

    @Override // org.apache.cordova.CordovaWebViewEngine
    public void clearCache() {
            r2 = this;
            org.apache.cordova.engine.SystemWebView r0 = r2.webView
            r1 = 1
            r0.clearCache(r1)
            return
    }

    @Override // org.apache.cordova.CordovaWebViewEngine
    public void clearHistory() {
            r1 = this;
            org.apache.cordova.engine.SystemWebView r0 = r1.webView
            r0.clearHistory()
            return
    }

    @Override // org.apache.cordova.CordovaWebViewEngine
    public void destroy() {
            r3 = this;
            org.apache.cordova.engine.SystemWebView r0 = r3.webView
            org.apache.cordova.engine.SystemWebChromeClient r0 = r0.chromeClient
            r0.destroyLastDialog()
            org.apache.cordova.engine.SystemWebView r0 = r3.webView
            r0.destroy()
            android.content.BroadcastReceiver r0 = r3.receiver
            if (r0 == 0) goto L39
            org.apache.cordova.engine.SystemWebView r0 = r3.webView     // Catch: java.lang.Exception -> L1c
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Exception -> L1c
            android.content.BroadcastReceiver r1 = r3.receiver     // Catch: java.lang.Exception -> L1c
            r0.unregisterReceiver(r1)     // Catch: java.lang.Exception -> L1c
            goto L39
        L1c:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error unregistering configuration receiver: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r0.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SystemWebViewEngine"
            org.apache.cordova.LOG.e(r2, r1, r0)
        L39:
            return
    }

    @Override // org.apache.cordova.CordovaWebViewEngine
    public void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
            r1 = this;
            org.apache.cordova.engine.SystemWebView r0 = r1.webView
            r0.evaluateJavascript(r2, r3)
            return
    }

    @Override // org.apache.cordova.CordovaWebViewEngine
    public org.apache.cordova.ICordovaCookieManager getCookieManager() {
            r1 = this;
            org.apache.cordova.engine.SystemCookieManager r0 = r1.cookieManager
            return r0
    }

    @Override // org.apache.cordova.CordovaWebViewEngine
    public org.apache.cordova.CordovaWebView getCordovaWebView() {
            r1 = this;
            org.apache.cordova.CordovaWebView r0 = r1.parentWebView
            return r0
    }

    @Override // org.apache.cordova.CordovaWebViewEngine
    public java.lang.String getUrl() {
            r1 = this;
            org.apache.cordova.engine.SystemWebView r0 = r1.webView
            java.lang.String r0 = r0.getUrl()
            return r0
    }

    @Override // org.apache.cordova.CordovaWebViewEngine
    public android.view.View getView() {
            r1 = this;
            org.apache.cordova.engine.SystemWebView r0 = r1.webView
            return r0
    }

    @Override // org.apache.cordova.CordovaWebViewEngine
    public boolean goBack() {
            r1 = this;
            org.apache.cordova.engine.SystemWebView r0 = r1.webView
            boolean r0 = r0.canGoBack()
            if (r0 == 0) goto Lf
            org.apache.cordova.engine.SystemWebView r0 = r1.webView
            r0.goBack()
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // org.apache.cordova.CordovaWebViewEngine
    public void init(org.apache.cordova.CordovaWebView r3, org.apache.cordova.CordovaInterface r4, org.apache.cordova.CordovaWebViewEngine.Client r5, org.apache.cordova.CordovaResourceApi r6, org.apache.cordova.PluginManager r7, org.apache.cordova.NativeToJsMessageQueue r8) {
            r2 = this;
            org.apache.cordova.CordovaInterface r0 = r2.cordova
            if (r0 != 0) goto L46
            org.apache.cordova.CordovaPreferences r0 = r2.preferences
            if (r0 != 0) goto Le
            org.apache.cordova.CordovaPreferences r0 = r3.getPreferences()
            r2.preferences = r0
        Le:
            r2.parentWebView = r3
            r2.cordova = r4
            r2.client = r5
            r2.resourceApi = r6
            r2.pluginManager = r7
            r2.nativeToJsMessageQueue = r8
            org.apache.cordova.engine.SystemWebView r0 = r2.webView
            r0.init(r2, r4)
            r2.initWebViewSettings()
            org.apache.cordova.NativeToJsMessageQueue$OnlineEventsBridgeMode r0 = new org.apache.cordova.NativeToJsMessageQueue$OnlineEventsBridgeMode
            org.apache.cordova.engine.SystemWebViewEngine$1 r1 = new org.apache.cordova.engine.SystemWebViewEngine$1
            r1.<init>(r2)
            r0.<init>(r1)
            r8.addBridgeMode(r0)
            org.apache.cordova.NativeToJsMessageQueue$EvalBridgeMode r0 = new org.apache.cordova.NativeToJsMessageQueue$EvalBridgeMode
            r0.<init>(r2, r4)
            r8.addBridgeMode(r0)
            org.apache.cordova.CordovaBridge r0 = new org.apache.cordova.CordovaBridge
            r0.<init>(r7, r8)
            r2.bridge = r0
            org.apache.cordova.engine.SystemWebView r0 = r2.webView
            org.apache.cordova.CordovaBridge r1 = r2.bridge
            exposeJsInterface(r0, r1)
            return
        L46:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // org.apache.cordova.CordovaWebViewEngine
    public void loadUrl(java.lang.String r2, boolean r3) {
            r1 = this;
            org.apache.cordova.engine.SystemWebView r0 = r1.webView
            r0.loadUrl(r2)
            return
    }

    @Override // org.apache.cordova.CordovaWebViewEngine
    public void setPaused(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            org.apache.cordova.engine.SystemWebView r0 = r1.webView
            r0.onPause()
            org.apache.cordova.engine.SystemWebView r0 = r1.webView
            r0.pauseTimers()
            goto L17
        Ld:
            org.apache.cordova.engine.SystemWebView r0 = r1.webView
            r0.onResume()
            org.apache.cordova.engine.SystemWebView r0 = r1.webView
            r0.resumeTimers()
        L17:
            return
    }

    @Override // org.apache.cordova.CordovaWebViewEngine
    public void stopLoading() {
            r1 = this;
            org.apache.cordova.engine.SystemWebView r0 = r1.webView
            r0.stopLoading()
            return
    }
}
