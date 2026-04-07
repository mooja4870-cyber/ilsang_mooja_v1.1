package com.getcapacitor.cordova;

/* JADX INFO: loaded from: classes2.dex */
public class MockCordovaWebViewImpl implements org.apache.cordova.CordovaWebView {
    private android.content.Context context;
    private com.getcapacitor.cordova.CapacitorCordovaCookieManager cookieManager;
    private org.apache.cordova.CordovaInterface cordova;
    private boolean hasPausedEver;
    private org.apache.cordova.NativeToJsMessageQueue nativeToJsMessageQueue;
    private org.apache.cordova.PluginManager pluginManager;
    private org.apache.cordova.CordovaPreferences preferences;
    private org.apache.cordova.CordovaResourceApi resourceApi;
    private android.webkit.WebView webView;

    public static class CapacitorEvalBridgeMode extends org.apache.cordova.NativeToJsMessageQueue.BridgeMode {
        private final org.apache.cordova.CordovaInterface cordova;
        private final android.webkit.WebView webView;

        public static /* synthetic */ void $r8$lambda$GdzFNn4MTr7j1niYQgZgehdgxSM(com.getcapacitor.cordova.MockCordovaWebViewImpl.CapacitorEvalBridgeMode r0, org.apache.cordova.NativeToJsMessageQueue r1) {
                r0.lambda$onNativeToJsMessageAvailable$0(r1)
                return
        }

        public CapacitorEvalBridgeMode(android.webkit.WebView r1, org.apache.cordova.CordovaInterface r2) {
                r0 = this;
                r0.<init>()
                r0.webView = r1
                r0.cordova = r2
                return
        }

        private /* synthetic */ void lambda$onNativeToJsMessageAvailable$0(org.apache.cordova.NativeToJsMessageQueue r4) {
                r3 = this;
                java.lang.String r0 = r4.popAndEncodeAsJs()
                if (r0 == 0) goto Lc
                android.webkit.WebView r1 = r3.webView
                r2 = 0
                r1.evaluateJavascript(r0, r2)
            Lc:
                return
        }

        @Override // org.apache.cordova.NativeToJsMessageQueue.BridgeMode
        public void onNativeToJsMessageAvailable(org.apache.cordova.NativeToJsMessageQueue r3) {
                r2 = this;
                org.apache.cordova.CordovaInterface r0 = r2.cordova
                androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
                com.getcapacitor.cordova.MockCordovaWebViewImpl$CapacitorEvalBridgeMode$$ExternalSyntheticLambda0 r1 = new com.getcapacitor.cordova.MockCordovaWebViewImpl$CapacitorEvalBridgeMode$$ExternalSyntheticLambda0
                r1.<init>(r2, r3)
                r0.runOnUiThread(r1)
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$4KdV8CYlWQxu6zbahMKlKsvDFpM(com.getcapacitor.cordova.MockCordovaWebViewImpl r0, java.lang.String r1, android.webkit.ValueCallback r2) {
            r0.lambda$eval$0(r1, r2)
            return
    }

    public MockCordovaWebViewImpl(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    private /* synthetic */ void lambda$eval$0(java.lang.String r2, android.webkit.ValueCallback r3) {
            r1 = this;
            android.webkit.WebView r0 = r1.webView
            r0.evaluateJavascript(r2, r3)
            return
    }

    static /* synthetic */ void lambda$triggerDocumentEvent$1(java.lang.String r0) {
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public boolean backHistory() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public boolean canGoBack() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public void clearCache() {
            r0 = this;
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    @java.lang.Deprecated
    public void clearCache(boolean r1) {
            r0 = this;
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public void clearHistory() {
            r0 = this;
            return
    }

    public void eval(java.lang.String r3, android.webkit.ValueCallback<java.lang.String> r4) {
            r2 = this;
            android.os.Handler r0 = new android.os.Handler
            android.content.Context r1 = r2.context
            android.os.Looper r1 = r1.getMainLooper()
            r0.<init>(r1)
            com.getcapacitor.cordova.MockCordovaWebViewImpl$$ExternalSyntheticLambda1 r1 = new com.getcapacitor.cordova.MockCordovaWebViewImpl$$ExternalSyntheticLambda1
            r1.<init>(r2, r3, r4)
            r0.post(r1)
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public android.content.Context getContext() {
            r1 = this;
            android.webkit.WebView r0 = r1.webView
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public org.apache.cordova.ICordovaCookieManager getCookieManager() {
            r1 = this;
            com.getcapacitor.cordova.CapacitorCordovaCookieManager r0 = r1.cookieManager
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public org.apache.cordova.CordovaWebViewEngine getEngine() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public org.apache.cordova.PluginManager getPluginManager() {
            r1 = this;
            org.apache.cordova.PluginManager r0 = r1.pluginManager
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public org.apache.cordova.CordovaPreferences getPreferences() {
            r1 = this;
            org.apache.cordova.CordovaPreferences r0 = r1.preferences
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public org.apache.cordova.CordovaResourceApi getResourceApi() {
            r1 = this;
            org.apache.cordova.CordovaResourceApi r0 = r1.resourceApi
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public java.lang.String getUrl() {
            r1 = this;
            android.webkit.WebView r0 = r1.webView
            java.lang.String r0 = r0.getUrl()
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public android.view.View getView() {
            r1 = this;
            android.webkit.WebView r0 = r1.webView
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public void handleDestroy() {
            r1 = this;
            boolean r0 = r1.isInitialized()
            if (r0 != 0) goto L7
            return
        L7:
            org.apache.cordova.PluginManager r0 = r1.pluginManager
            r0.onDestroy()
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public void handlePause(boolean r3) {
            r2 = this;
            boolean r0 = r2.isInitialized()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 1
            r2.hasPausedEver = r0
            org.apache.cordova.PluginManager r1 = r2.pluginManager
            r1.onPause(r3)
            java.lang.String r1 = "pause"
            r2.triggerDocumentEvent(r1)
            if (r3 != 0) goto L19
            r2.setPaused(r0)
        L19:
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public void handleResume(boolean r2) {
            r1 = this;
            boolean r0 = r1.isInitialized()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            r1.setPaused(r0)
            org.apache.cordova.PluginManager r0 = r1.pluginManager
            r0.onResume(r2)
            boolean r0 = r1.hasPausedEver
            if (r0 == 0) goto L19
            java.lang.String r0 = "resume"
            r1.triggerDocumentEvent(r0)
        L19:
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public void handleStart() {
            r1 = this;
            boolean r0 = r1.isInitialized()
            if (r0 != 0) goto L7
            return
        L7:
            org.apache.cordova.PluginManager r0 = r1.pluginManager
            r0.onStart()
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public void handleStop() {
            r1 = this;
            boolean r0 = r1.isInitialized()
            if (r0 != 0) goto L7
            return
        L7:
            org.apache.cordova.PluginManager r0 = r1.pluginManager
            r0.onStop()
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    @java.lang.Deprecated
    public void hideCustomView() {
            r0 = this;
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public void init(org.apache.cordova.CordovaInterface r4, java.util.List<org.apache.cordova.PluginEntry> r5, org.apache.cordova.CordovaPreferences r6) {
            r3 = this;
            r3.cordova = r4
            r3.preferences = r6
            org.apache.cordova.PluginManager r0 = new org.apache.cordova.PluginManager
            org.apache.cordova.CordovaInterface r1 = r3.cordova
            r0.<init>(r3, r1, r5)
            r3.pluginManager = r0
            org.apache.cordova.CordovaResourceApi r0 = new org.apache.cordova.CordovaResourceApi
            android.content.Context r1 = r3.context
            org.apache.cordova.PluginManager r2 = r3.pluginManager
            r0.<init>(r1, r2)
            r3.resourceApi = r0
            org.apache.cordova.PluginManager r0 = r3.pluginManager
            r0.init()
            return
    }

    public void init(org.apache.cordova.CordovaInterface r4, java.util.List<org.apache.cordova.PluginEntry> r5, org.apache.cordova.CordovaPreferences r6, android.webkit.WebView r7) {
            r3 = this;
            r3.cordova = r4
            r3.webView = r7
            r3.preferences = r6
            org.apache.cordova.PluginManager r0 = new org.apache.cordova.PluginManager
            org.apache.cordova.CordovaInterface r1 = r3.cordova
            r0.<init>(r3, r1, r5)
            r3.pluginManager = r0
            org.apache.cordova.CordovaResourceApi r0 = new org.apache.cordova.CordovaResourceApi
            android.content.Context r1 = r3.context
            org.apache.cordova.PluginManager r2 = r3.pluginManager
            r0.<init>(r1, r2)
            r3.resourceApi = r0
            org.apache.cordova.NativeToJsMessageQueue r0 = new org.apache.cordova.NativeToJsMessageQueue
            r0.<init>()
            r3.nativeToJsMessageQueue = r0
            org.apache.cordova.NativeToJsMessageQueue r0 = r3.nativeToJsMessageQueue
            com.getcapacitor.cordova.MockCordovaWebViewImpl$CapacitorEvalBridgeMode r1 = new com.getcapacitor.cordova.MockCordovaWebViewImpl$CapacitorEvalBridgeMode
            org.apache.cordova.CordovaInterface r2 = r3.cordova
            r1.<init>(r7, r2)
            r0.addBridgeMode(r1)
            org.apache.cordova.NativeToJsMessageQueue r0 = r3.nativeToJsMessageQueue
            r1 = 0
            r0.setBridgeMode(r1)
            com.getcapacitor.cordova.CapacitorCordovaCookieManager r0 = new com.getcapacitor.cordova.CapacitorCordovaCookieManager
            r0.<init>(r7)
            r3.cookieManager = r0
            org.apache.cordova.PluginManager r0 = r3.pluginManager
            r0.init()
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public boolean isButtonPlumbedToJs(int r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    @java.lang.Deprecated
    public boolean isCustomViewShowing() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public boolean isInitialized() {
            r1 = this;
            org.apache.cordova.CordovaInterface r0 = r1.cordova
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public void loadUrl(java.lang.String r2) {
            r1 = this;
            r0 = 1
            r1.loadUrlIntoView(r2, r0)
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public void loadUrlIntoView(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "about:blank"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L12
            java.lang.String r0 = "javascript:"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L11
            goto L12
        L11:
            return
        L12:
            android.webkit.WebView r0 = r1.webView
            r0.loadUrl(r2)
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public void onNewIntent(android.content.Intent r2) {
            r1 = this;
            org.apache.cordova.PluginManager r0 = r1.pluginManager
            if (r0 == 0) goto L9
            org.apache.cordova.PluginManager r0 = r1.pluginManager
            r0.onNewIntent(r2)
        L9:
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public java.lang.Object postMessage(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.apache.cordova.PluginManager r0 = r1.pluginManager
            java.lang.Object r0 = r0.postMessage(r2, r3)
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    @java.lang.Deprecated
    public void sendJavascript(java.lang.String r2) {
            r1 = this;
            org.apache.cordova.NativeToJsMessageQueue r0 = r1.nativeToJsMessageQueue
            r0.addJavaScript(r2)
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public void sendPluginResult(org.apache.cordova.PluginResult r2, java.lang.String r3) {
            r1 = this;
            org.apache.cordova.NativeToJsMessageQueue r0 = r1.nativeToJsMessageQueue
            r0.addPluginResult(r2, r3)
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public void setButtonPlumbedToJs(int r1, boolean r2) {
            r0 = this;
            return
    }

    public void setPaused(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            android.webkit.WebView r0 = r1.webView
            r0.onPause()
            android.webkit.WebView r0 = r1.webView
            r0.pauseTimers()
            goto L17
        Ld:
            android.webkit.WebView r0 = r1.webView
            r0.onResume()
            android.webkit.WebView r0 = r1.webView
            r0.resumeTimers()
        L17:
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    @java.lang.Deprecated
    public void showCustomView(android.view.View r1, android.webkit.WebChromeClient.CustomViewCallback r2) {
            r0 = this;
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public void showWebPage(java.lang.String r1, boolean r2, boolean r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            r0 = this;
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public void stopLoading() {
            r0 = this;
            return
    }

    public void triggerDocumentEvent(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "window.Capacitor.triggerEvent('"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = "', 'document');"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.getcapacitor.cordova.MockCordovaWebViewImpl$$ExternalSyntheticLambda0 r1 = new com.getcapacitor.cordova.MockCordovaWebViewImpl$$ExternalSyntheticLambda0
            r1.<init>()
            r2.eval(r0, r1)
            return
    }
}
