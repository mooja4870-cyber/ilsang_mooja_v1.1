package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class CordovaWebViewImpl implements org.apache.cordova.CordovaWebView {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final java.lang.String TAG = "CordovaWebViewImpl";
    private org.apache.cordova.CoreAndroid appPlugin;
    private java.util.Set<java.lang.Integer> boundKeyCodes;
    private org.apache.cordova.CordovaInterface cordova;
    protected final org.apache.cordova.CordovaWebViewEngine engine;
    private org.apache.cordova.CordovaWebViewImpl.EngineClient engineClient;
    private boolean hasPausedEver;
    private int loadUrlTimeout;
    java.lang.String loadedUrl;
    private android.view.View mCustomView;
    private android.webkit.WebChromeClient.CustomViewCallback mCustomViewCallback;
    private org.apache.cordova.NativeToJsMessageQueue nativeToJsMessageQueue;
    private org.apache.cordova.PluginManager pluginManager;
    private org.apache.cordova.CordovaPreferences preferences;
    private org.apache.cordova.CordovaResourceApi resourceApi;




    protected class EngineClient implements org.apache.cordova.CordovaWebViewEngine.Client {
        final /* synthetic */ org.apache.cordova.CordovaWebViewImpl this$0;


        protected EngineClient(org.apache.cordova.CordovaWebViewImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // org.apache.cordova.CordovaWebViewEngine.Client
        public void clearLoadTimeoutTimer() {
                r2 = this;
                org.apache.cordova.CordovaWebViewImpl r0 = r2.this$0
                int r1 = org.apache.cordova.CordovaWebViewImpl.m1733$$Nest$fgetloadUrlTimeout(r0)
                int r1 = r1 + 1
                org.apache.cordova.CordovaWebViewImpl.m1736$$Nest$fputloadUrlTimeout(r0, r1)
                return
        }

        @Override // org.apache.cordova.CordovaWebViewEngine.Client
        public java.lang.Boolean onDispatchKeyEvent(android.view.KeyEvent r6) {
                r5 = this;
                int r0 = r6.getKeyCode()
                r1 = 4
                r2 = 1
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
                if (r0 != r1) goto Le
                r1 = r2
                goto Lf
            Le:
                r1 = 0
            Lf:
                int r4 = r6.getAction()
                if (r4 != 0) goto L40
                if (r1 == 0) goto L20
                org.apache.cordova.CordovaWebViewImpl r2 = r5.this$0
                android.view.View r2 = org.apache.cordova.CordovaWebViewImpl.m1734$$Nest$fgetmCustomView(r2)
                if (r2 == 0) goto L20
                return r3
            L20:
                org.apache.cordova.CordovaWebViewImpl r2 = r5.this$0
                java.util.Set r2 = org.apache.cordova.CordovaWebViewImpl.m1731$$Nest$fgetboundKeyCodes(r2)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                boolean r2 = r2.contains(r4)
                if (r2 == 0) goto L31
                return r3
            L31:
                if (r1 == 0) goto L92
                org.apache.cordova.CordovaWebViewImpl r2 = r5.this$0
                org.apache.cordova.CordovaWebViewEngine r2 = r2.engine
                boolean r2 = r2.canGoBack()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
            L40:
                int r4 = r6.getAction()
                if (r4 != r2) goto L92
                if (r1 == 0) goto L56
                org.apache.cordova.CordovaWebViewImpl r2 = r5.this$0
                android.view.View r2 = org.apache.cordova.CordovaWebViewImpl.m1734$$Nest$fgetmCustomView(r2)
                if (r2 == 0) goto L56
                org.apache.cordova.CordovaWebViewImpl r2 = r5.this$0
                r2.hideCustomView()
                return r3
            L56:
                org.apache.cordova.CordovaWebViewImpl r2 = r5.this$0
                java.util.Set r2 = org.apache.cordova.CordovaWebViewImpl.m1731$$Nest$fgetboundKeyCodes(r2)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                boolean r2 = r2.contains(r4)
                if (r2 == 0) goto L82
                r2 = 0
                switch(r0) {
                    case 4: goto L77;
                    case 24: goto L74;
                    case 25: goto L71;
                    case 82: goto L6e;
                    case 84: goto L6b;
                    default: goto L6a;
                }
            L6a:
                goto L79
            L6b:
                java.lang.String r2 = "searchbutton"
                goto L79
            L6e:
                java.lang.String r2 = "menubutton"
                goto L79
            L71:
                java.lang.String r2 = "volumedownbutton"
                goto L79
            L74:
                java.lang.String r2 = "volumeupbutton"
                goto L79
            L77:
                java.lang.String r2 = "backbutton"
            L79:
                if (r2 == 0) goto L81
                org.apache.cordova.CordovaWebViewImpl r4 = r5.this$0
                org.apache.cordova.CordovaWebViewImpl.m1737$$Nest$msendJavascriptEvent(r4, r2)
                return r3
            L81:
                goto L91
            L82:
                if (r1 == 0) goto L91
                org.apache.cordova.CordovaWebViewImpl r2 = r5.this$0
                org.apache.cordova.CordovaWebViewEngine r2 = r2.engine
                boolean r2 = r2.goBack()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
            L91:
            L92:
                r2 = 0
                return r2
        }

        @Override // org.apache.cordova.CordovaWebViewEngine.Client
        public boolean onNavigationAttempt(java.lang.String r5) {
                r4 = this;
                org.apache.cordova.CordovaWebViewImpl r0 = r4.this$0
                org.apache.cordova.PluginManager r0 = org.apache.cordova.CordovaWebViewImpl.m1735$$Nest$fgetpluginManager(r0)
                boolean r0 = r0.onOverrideUrlLoading(r5)
                r1 = 1
                if (r0 == 0) goto Le
                return r1
            Le:
                org.apache.cordova.CordovaWebViewImpl r0 = r4.this$0
                org.apache.cordova.PluginManager r0 = org.apache.cordova.CordovaWebViewImpl.m1735$$Nest$fgetpluginManager(r0)
                boolean r0 = r0.shouldAllowNavigation(r5)
                r2 = 0
                if (r0 == 0) goto L1c
                return r2
            L1c:
                org.apache.cordova.CordovaWebViewImpl r0 = r4.this$0
                org.apache.cordova.PluginManager r0 = org.apache.cordova.CordovaWebViewImpl.m1735$$Nest$fgetpluginManager(r0)
                java.lang.Boolean r0 = r0.shouldOpenExternalUrl(r5)
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L33
                org.apache.cordova.CordovaWebViewImpl r0 = r4.this$0
                r3 = 0
                r0.showWebPage(r5, r1, r2, r3)
                return r1
            L33:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Blocked (possibly sub-frame) navigation to non-allowed URL: "
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "CordovaWebViewImpl"
                org.apache.cordova.LOG.w(r2, r0)
                return r1
        }

        @Override // org.apache.cordova.CordovaWebViewEngine.Client
        public void onPageFinishedLoading(java.lang.String r4) {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onPageFinished("
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r1 = ")"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "CordovaWebViewImpl"
                org.apache.cordova.LOG.d(r1, r0)
                r3.clearLoadTimeoutTimer()
                org.apache.cordova.CordovaWebViewImpl r0 = r3.this$0
                org.apache.cordova.PluginManager r0 = org.apache.cordova.CordovaWebViewImpl.m1735$$Nest$fgetpluginManager(r0)
                java.lang.String r1 = "onPageFinished"
                r0.postMessage(r1, r4)
                org.apache.cordova.CordovaWebViewImpl r0 = r3.this$0
                org.apache.cordova.CordovaWebViewEngine r0 = r0.engine
                android.view.View r0 = r0.getView()
                int r0 = r0.getVisibility()
                if (r0 == 0) goto L47
                java.lang.Thread r0 = new java.lang.Thread
                org.apache.cordova.CordovaWebViewImpl$EngineClient$1 r1 = new org.apache.cordova.CordovaWebViewImpl$EngineClient$1
                r1.<init>(r3)
                r0.<init>(r1)
                r0.start()
            L47:
                java.lang.String r0 = "about:blank"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L5b
                org.apache.cordova.CordovaWebViewImpl r0 = r3.this$0
                org.apache.cordova.PluginManager r0 = org.apache.cordova.CordovaWebViewImpl.m1735$$Nest$fgetpluginManager(r0)
                java.lang.String r1 = "exit"
                r2 = 0
                r0.postMessage(r1, r2)
            L5b:
                return
        }

        @Override // org.apache.cordova.CordovaWebViewEngine.Client
        public void onPageStarted(java.lang.String r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onPageDidNavigate("
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.String r1 = ")"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "CordovaWebViewImpl"
                org.apache.cordova.LOG.d(r1, r0)
                org.apache.cordova.CordovaWebViewImpl r0 = r2.this$0
                java.util.Set r0 = org.apache.cordova.CordovaWebViewImpl.m1731$$Nest$fgetboundKeyCodes(r0)
                r0.clear()
                org.apache.cordova.CordovaWebViewImpl r0 = r2.this$0
                org.apache.cordova.PluginManager r0 = org.apache.cordova.CordovaWebViewImpl.m1735$$Nest$fgetpluginManager(r0)
                r0.onReset()
                org.apache.cordova.CordovaWebViewImpl r0 = r2.this$0
                org.apache.cordova.PluginManager r0 = org.apache.cordova.CordovaWebViewImpl.m1735$$Nest$fgetpluginManager(r0)
                java.lang.String r1 = "onPageStarted"
                r0.postMessage(r1, r3)
                return
        }

        @Override // org.apache.cordova.CordovaWebViewEngine.Client
        public void onReceivedError(int r4, java.lang.String r5, java.lang.String r6) {
                r3 = this;
                r3.clearLoadTimeoutTimer()
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "errorCode"
                r0.put(r1, r4)     // Catch: org.json.JSONException -> L18
                java.lang.String r1 = "description"
                r0.put(r1, r5)     // Catch: org.json.JSONException -> L18
                java.lang.String r1 = "url"
                r0.put(r1, r6)     // Catch: org.json.JSONException -> L18
                goto L1c
            L18:
                r1 = move-exception
                r1.printStackTrace()
            L1c:
                org.apache.cordova.CordovaWebViewImpl r1 = r3.this$0
                org.apache.cordova.PluginManager r1 = org.apache.cordova.CordovaWebViewImpl.m1735$$Nest$fgetpluginManager(r1)
                java.lang.String r2 = "onReceivedError"
                r1.postMessage(r2, r0)
                return
        }
    }

    private static class WrapperView extends android.widget.FrameLayout {
        private final org.apache.cordova.CordovaWebViewEngine engine;

        public WrapperView(android.content.Context r1, org.apache.cordova.CordovaWebViewEngine r2) {
                r0 = this;
                r0.<init>(r1)
                r0.engine = r2
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
                r1 = this;
                org.apache.cordova.CordovaWebViewEngine r0 = r1.engine
                android.view.View r0 = r0.getView()
                boolean r0 = r0.dispatchKeyEvent(r2)
                if (r0 != 0) goto L10
                boolean r0 = super.dispatchKeyEvent(r2)
            L10:
                return r0
        }
    }

    /* JADX INFO: renamed from: -$$Nest$fgetboundKeyCodes, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.Set m1731$$Nest$fgetboundKeyCodes(org.apache.cordova.CordovaWebViewImpl r0) {
            java.util.Set<java.lang.Integer> r0 = r0.boundKeyCodes
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetcordova, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.apache.cordova.CordovaInterface m1732$$Nest$fgetcordova(org.apache.cordova.CordovaWebViewImpl r0) {
            org.apache.cordova.CordovaInterface r0 = r0.cordova
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetloadUrlTimeout, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m1733$$Nest$fgetloadUrlTimeout(org.apache.cordova.CordovaWebViewImpl r0) {
            int r0 = r0.loadUrlTimeout
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetmCustomView, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.view.View m1734$$Nest$fgetmCustomView(org.apache.cordova.CordovaWebViewImpl r0) {
            android.view.View r0 = r0.mCustomView
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetpluginManager, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.apache.cordova.PluginManager m1735$$Nest$fgetpluginManager(org.apache.cordova.CordovaWebViewImpl r0) {
            org.apache.cordova.PluginManager r0 = r0.pluginManager
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fputloadUrlTimeout, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1736$$Nest$fputloadUrlTimeout(org.apache.cordova.CordovaWebViewImpl r0, int r1) {
            r0.loadUrlTimeout = r1
            return
    }

    /* JADX INFO: renamed from: -$$Nest$msendJavascriptEvent, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1737$$Nest$msendJavascriptEvent(org.apache.cordova.CordovaWebViewImpl r0, java.lang.String r1) {
            r0.sendJavascriptEvent(r1)
            return
    }

    static {
            return
    }

    public CordovaWebViewImpl(org.apache.cordova.CordovaWebViewEngine r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.loadUrlTimeout = r0
            org.apache.cordova.CordovaWebViewImpl$EngineClient r0 = new org.apache.cordova.CordovaWebViewImpl$EngineClient
            r0.<init>(r1)
            r1.engineClient = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.boundKeyCodes = r0
            r1.engine = r2
            return
    }

    public static org.apache.cordova.CordovaWebViewEngine createEngine(android.content.Context r5, org.apache.cordova.CordovaPreferences r6) {
            java.lang.Class<org.apache.cordova.engine.SystemWebViewEngine> r0 = org.apache.cordova.engine.SystemWebViewEngine.class
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.String r1 = "webview"
            java.lang.String r0 = r6.getString(r1, r0)
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L2c
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L2c
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L2c
            java.lang.Class<org.apache.cordova.CordovaPreferences> r3 = org.apache.cordova.CordovaPreferences.class
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.Exception -> L2c
            java.lang.reflect.Constructor r2 = r1.getConstructor(r2)     // Catch: java.lang.Exception -> L2c
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r6}     // Catch: java.lang.Exception -> L2c
            java.lang.Object r3 = r2.newInstance(r3)     // Catch: java.lang.Exception -> L2c
            org.apache.cordova.CordovaWebViewEngine r3 = (org.apache.cordova.CordovaWebViewEngine) r3     // Catch: java.lang.Exception -> L2c
            return r3
        L2c:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Failed to create webview. "
            r2.<init>(r3, r1)
            throw r2
    }

    private void sendJavascriptEvent(java.lang.String r3) {
            r2 = this;
            org.apache.cordova.CoreAndroid r0 = r2.appPlugin
            if (r0 != 0) goto L10
            org.apache.cordova.PluginManager r0 = r2.pluginManager
            java.lang.String r1 = "CoreAndroid"
            org.apache.cordova.CordovaPlugin r0 = r0.getPlugin(r1)
            org.apache.cordova.CoreAndroid r0 = (org.apache.cordova.CoreAndroid) r0
            r2.appPlugin = r0
        L10:
            org.apache.cordova.CoreAndroid r0 = r2.appPlugin
            if (r0 != 0) goto L1c
            java.lang.String r0 = "CordovaWebViewImpl"
            java.lang.String r1 = "Unable to fire event without existing plugin"
            org.apache.cordova.LOG.w(r0, r1)
            return
        L1c:
            org.apache.cordova.CoreAndroid r0 = r2.appPlugin
            r0.fireJavascriptEvent(r3)
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public boolean backHistory() {
            r1 = this;
            org.apache.cordova.CordovaWebViewEngine r0 = r1.engine
            boolean r0 = r0.goBack()
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public boolean canGoBack() {
            r1 = this;
            org.apache.cordova.CordovaWebViewEngine r0 = r1.engine
            boolean r0 = r0.canGoBack()
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public void clearCache() {
            r1 = this;
            org.apache.cordova.CordovaWebViewEngine r0 = r1.engine
            r0.clearCache()
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    @java.lang.Deprecated
    public void clearCache(boolean r2) {
            r1 = this;
            org.apache.cordova.CordovaWebViewEngine r0 = r1.engine
            r0.clearCache()
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public void clearHistory() {
            r1 = this;
            org.apache.cordova.CordovaWebViewEngine r0 = r1.engine
            r0.clearHistory()
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public android.content.Context getContext() {
            r1 = this;
            org.apache.cordova.CordovaWebViewEngine r0 = r1.engine
            android.view.View r0 = r0.getView()
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public org.apache.cordova.ICordovaCookieManager getCookieManager() {
            r1 = this;
            org.apache.cordova.CordovaWebViewEngine r0 = r1.engine
            org.apache.cordova.ICordovaCookieManager r0 = r0.getCookieManager()
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public org.apache.cordova.CordovaWebViewEngine getEngine() {
            r1 = this;
            org.apache.cordova.CordovaWebViewEngine r0 = r1.engine
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
            org.apache.cordova.CordovaWebViewEngine r0 = r1.engine
            java.lang.String r0 = r0.getUrl()
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public android.view.View getView() {
            r1 = this;
            org.apache.cordova.CordovaWebViewEngine r0 = r1.engine
            android.view.View r0 = r0.getView()
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    public void handleDestroy() {
            r1 = this;
            boolean r0 = r1.isInitialized()
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.loadUrlTimeout
            int r0 = r0 + 1
            r1.loadUrlTimeout = r0
            org.apache.cordova.PluginManager r0 = r1.pluginManager
            r0.onDestroy()
            java.lang.String r0 = "about:blank"
            r1.loadUrl(r0)
            org.apache.cordova.CordovaWebViewEngine r0 = r1.engine
            r0.destroy()
            r1.hideCustomView()
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
            r2.sendJavascriptEvent(r1)
            if (r3 != 0) goto L1b
            org.apache.cordova.CordovaWebViewEngine r1 = r2.engine
            r1.setPaused(r0)
        L1b:
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public void handleResume(boolean r3) {
            r2 = this;
            boolean r0 = r2.isInitialized()
            if (r0 != 0) goto L7
            return
        L7:
            org.apache.cordova.CordovaWebViewEngine r0 = r2.engine
            r1 = 0
            r0.setPaused(r1)
            org.apache.cordova.PluginManager r0 = r2.pluginManager
            r0.onResume(r3)
            boolean r0 = r2.hasPausedEver
            if (r0 == 0) goto L1b
            java.lang.String r0 = "resume"
            r2.sendJavascriptEvent(r0)
        L1b:
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
            r3 = this;
            android.view.View r0 = r3.mCustomView
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "CordovaWebViewImpl"
            java.lang.String r1 = "Hiding Custom View"
            org.apache.cordova.LOG.d(r0, r1)
            android.view.View r0 = r3.mCustomView
            r1 = 8
            r0.setVisibility(r1)
            org.apache.cordova.CordovaWebViewEngine r0 = r3.engine
            android.view.View r0 = r0.getView()
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r3.mCustomView
            r0.removeView(r1)
            r1 = 0
            r3.mCustomView = r1
            android.webkit.WebChromeClient$CustomViewCallback r1 = r3.mCustomViewCallback
            r1.onCustomViewHidden()
            org.apache.cordova.CordovaWebViewEngine r1 = r3.engine
            android.view.View r1 = r1.getView()
            r2 = 0
            r1.setVisibility(r2)
            org.apache.cordova.CordovaWebViewEngine r1 = r3.engine
            android.view.View r1 = r1.getView()
            r1.requestFocus()
            return
    }

    public void init(org.apache.cordova.CordovaInterface r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.apache.cordova.CordovaPreferences r1 = new org.apache.cordova.CordovaPreferences
            r1.<init>()
            r2.init(r3, r0, r1)
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public void init(org.apache.cordova.CordovaInterface r10, java.util.List<org.apache.cordova.PluginEntry> r11, org.apache.cordova.CordovaPreferences r12) {
            r9 = this;
            org.apache.cordova.CordovaInterface r0 = r9.cordova
            if (r0 != 0) goto L83
            r9.cordova = r10
            r9.preferences = r12
            org.apache.cordova.PluginManager r0 = new org.apache.cordova.PluginManager
            org.apache.cordova.CordovaInterface r1 = r9.cordova
            r0.<init>(r9, r1, r11)
            r9.pluginManager = r0
            org.apache.cordova.CordovaResourceApi r0 = new org.apache.cordova.CordovaResourceApi
            org.apache.cordova.CordovaWebViewEngine r1 = r9.engine
            android.view.View r1 = r1.getView()
            android.content.Context r1 = r1.getContext()
            org.apache.cordova.PluginManager r2 = r9.pluginManager
            r0.<init>(r1, r2)
            r9.resourceApi = r0
            org.apache.cordova.NativeToJsMessageQueue r0 = new org.apache.cordova.NativeToJsMessageQueue
            r0.<init>()
            r9.nativeToJsMessageQueue = r0
            org.apache.cordova.NativeToJsMessageQueue r0 = r9.nativeToJsMessageQueue
            org.apache.cordova.NativeToJsMessageQueue$NoOpBridgeMode r1 = new org.apache.cordova.NativeToJsMessageQueue$NoOpBridgeMode
            r1.<init>()
            r0.addBridgeMode(r1)
            org.apache.cordova.NativeToJsMessageQueue r0 = r9.nativeToJsMessageQueue
            org.apache.cordova.NativeToJsMessageQueue$LoadUrlBridgeMode r1 = new org.apache.cordova.NativeToJsMessageQueue$LoadUrlBridgeMode
            org.apache.cordova.CordovaWebViewEngine r2 = r9.engine
            r1.<init>(r2, r10)
            r0.addBridgeMode(r1)
            java.lang.String r0 = "DisallowOverscroll"
            r1 = 0
            boolean r0 = r12.getBoolean(r0, r1)
            if (r0 == 0) goto L54
            org.apache.cordova.CordovaWebViewEngine r0 = r9.engine
            android.view.View r0 = r0.getView()
            r1 = 2
            r0.setOverScrollMode(r1)
        L54:
            org.apache.cordova.CordovaWebViewEngine r2 = r9.engine
            org.apache.cordova.CordovaWebViewImpl$EngineClient r5 = r9.engineClient
            org.apache.cordova.CordovaResourceApi r6 = r9.resourceApi
            org.apache.cordova.PluginManager r7 = r9.pluginManager
            org.apache.cordova.NativeToJsMessageQueue r8 = r9.nativeToJsMessageQueue
            r3 = r9
            r4 = r10
            r2.init(r3, r4, r5, r6, r7, r8)
            org.apache.cordova.CordovaWebViewEngine r10 = r3.engine
            android.view.View r10 = r10.getView()
            boolean r10 = r10 instanceof org.apache.cordova.CordovaWebViewEngine.EngineView
            if (r10 == 0) goto L7d
            org.apache.cordova.PluginManager r10 = r3.pluginManager
            java.lang.String r0 = "org.apache.cordova.CoreAndroid"
            r1 = 1
            java.lang.String r2 = "CoreAndroid"
            r10.addService(r2, r0, r1)
            org.apache.cordova.PluginManager r10 = r3.pluginManager
            r10.init()
            return
        L7d:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            r10.<init>()
            throw r10
        L83:
            r4 = r10
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
    }

    @Override // org.apache.cordova.CordovaWebView
    public boolean isButtonPlumbedToJs(int r3) {
            r2 = this;
            java.util.Set<java.lang.Integer> r0 = r2.boundKeyCodes
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r1)
            return r0
    }

    @Override // org.apache.cordova.CordovaWebView
    @java.lang.Deprecated
    public boolean isCustomViewShowing() {
            r1 = this;
            android.view.View r0 = r1.mCustomView
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
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
    public void loadUrlIntoView(java.lang.String r12, boolean r13) {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ">>> loadUrl("
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CordovaWebViewImpl"
            org.apache.cordova.LOG.d(r1, r0)
            java.lang.String r0 = "about:blank"
            boolean r0 = r12.equals(r0)
            r2 = 0
            if (r0 != 0) goto L81
            java.lang.String r0 = "javascript:"
            boolean r0 = r12.startsWith(r0)
            if (r0 == 0) goto L32
            r6 = r11
            r9 = r12
            goto L83
        L32:
            if (r13 != 0) goto L38
            java.lang.String r0 = r11.loadedUrl
            if (r0 != 0) goto L39
        L38:
            r2 = 1
        L39:
            if (r2 == 0) goto L49
            java.lang.String r13 = r11.loadedUrl
            if (r13 == 0) goto L47
            r13 = 0
            r11.appPlugin = r13
            org.apache.cordova.PluginManager r13 = r11.pluginManager
            r13.init()
        L47:
            r11.loadedUrl = r12
        L49:
            int r13 = r11.loadUrlTimeout
            org.apache.cordova.CordovaPreferences r0 = r11.preferences
            java.lang.String r3 = "LoadUrlTimeoutValue"
            r4 = 20000(0x4e20, float:2.8026E-41)
            int r7 = r0.getInteger(r3, r4)
            org.apache.cordova.CordovaWebViewImpl$1 r0 = new org.apache.cordova.CordovaWebViewImpl$1
            r0.<init>(r11, r12)
            org.apache.cordova.CordovaWebViewImpl$2 r8 = new org.apache.cordova.CordovaWebViewImpl$2
            r8.<init>(r11, r7, r13, r0)
            org.apache.cordova.CordovaInterface r3 = r11.cordova
            androidx.appcompat.app.AppCompatActivity r3 = r3.getActivity()
            if (r3 == 0) goto L79
            r10 = r2
            org.apache.cordova.CordovaInterface r1 = r11.cordova
            androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
            org.apache.cordova.CordovaWebViewImpl$3 r5 = new org.apache.cordova.CordovaWebViewImpl$3
            r6 = r11
            r9 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r1.runOnUiThread(r5)
            goto L80
        L79:
            r6 = r11
            r9 = r12
            java.lang.String r12 = "Cordova activity does not exist."
            org.apache.cordova.LOG.d(r1, r12)
        L80:
            return
        L81:
            r6 = r11
            r9 = r12
        L83:
            org.apache.cordova.CordovaWebViewEngine r12 = r6.engine
            r12.loadUrl(r9, r2)
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
    public void setButtonPlumbedToJs(int r4, boolean r5) {
            r3 = this;
            switch(r4) {
                case 4: goto L1c;
                case 24: goto L1c;
                case 25: goto L1c;
                case 82: goto L1c;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported keycode: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1c:
            if (r5 == 0) goto L28
            java.util.Set<java.lang.Integer> r0 = r3.boundKeyCodes
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.add(r1)
            goto L31
        L28:
            java.util.Set<java.lang.Integer> r0 = r3.boundKeyCodes
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.remove(r1)
        L31:
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    @java.lang.Deprecated
    public void showCustomView(android.view.View r6, android.webkit.WebChromeClient.CustomViewCallback r7) {
            r5 = this;
            java.lang.String r0 = "CordovaWebViewImpl"
            java.lang.String r1 = "showing Custom View"
            org.apache.cordova.LOG.d(r0, r1)
            android.view.View r0 = r5.mCustomView
            if (r0 == 0) goto Lf
            r7.onCustomViewHidden()
            return
        Lf:
            org.apache.cordova.CordovaWebViewImpl$WrapperView r0 = new org.apache.cordova.CordovaWebViewImpl$WrapperView
            android.content.Context r1 = r5.getContext()
            org.apache.cordova.CordovaWebViewEngine r2 = r5.engine
            r0.<init>(r1, r2)
            r0.addView(r6)
            r5.mCustomView = r0
            r5.mCustomViewCallback = r7
            org.apache.cordova.CordovaWebViewEngine r1 = r5.engine
            android.view.View r1 = r1.getView()
            android.view.ViewParent r1 = r1.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 17
            r4 = -1
            r2.<init>(r4, r4, r3)
            r1.addView(r0, r2)
            org.apache.cordova.CordovaWebViewEngine r2 = r5.engine
            android.view.View r2 = r2.getView()
            r3 = 8
            r2.setVisibility(r3)
            r2 = 0
            r1.setVisibility(r2)
            r1.bringToFront()
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public void showWebPage(java.lang.String r7, boolean r8, boolean r9, java.util.Map<java.lang.String, java.lang.Object> r10) {
            r6 = this;
            java.lang.String r0 = "intent://"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r1, r2}
            java.lang.String r2 = "CordovaWebViewImpl"
            java.lang.String r3 = "showWebPage(%s, %b, %b, HashMap)"
            org.apache.cordova.LOG.d(r2, r3, r1)
            if (r9 == 0) goto L1c
            org.apache.cordova.CordovaWebViewEngine r1 = r6.engine
            r1.clearHistory()
        L1c:
            r1 = 1
            if (r8 != 0) goto L42
            org.apache.cordova.PluginManager r0 = r6.pluginManager
            boolean r0 = r0.shouldAllowNavigation(r7)
            if (r0 == 0) goto L2b
            r6.loadUrlIntoView(r7, r1)
            return
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "showWebPage: Refusing to load URL into webview since it is not in the <allow-navigation> allow list. URL="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r0 = r0.toString()
            org.apache.cordova.LOG.w(r2, r0)
            return
        L42:
            org.apache.cordova.PluginManager r3 = r6.pluginManager
            java.lang.Boolean r3 = r3.shouldOpenExternalUrl(r7)
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L65
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "showWebPage: Refusing to send intent for URL since it is not in the <allow-intent> allow list. URL="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r0 = r0.toString()
            org.apache.cordova.LOG.w(r2, r0)
            return
        L65:
            r3 = 0
            boolean r4 = r7.startsWith(r0)     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
            if (r4 == 0) goto L72
            android.content.Intent r1 = android.content.Intent.parseUri(r7, r1)     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
            r3 = r1
            goto L9c
        L72:
            android.content.Intent r1 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
            java.lang.String r4 = "android.intent.action.VIEW"
            r1.<init>(r4)     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
            r3 = r1
            java.lang.String r1 = "android.intent.category.BROWSABLE"
            r3.addCategory(r1)     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
            android.net.Uri r1 = android.net.Uri.parse(r7)     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
            java.lang.String r4 = "file"
            java.lang.String r5 = r1.getScheme()     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
            boolean r4 = r4.equals(r5)     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
            if (r4 == 0) goto L99
            org.apache.cordova.CordovaResourceApi r4 = r6.resourceApi     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
            java.lang.String r4 = r4.getMimeType(r1)     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
            r3.setDataAndType(r1, r4)     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
            goto L9c
        L99:
            r3.setData(r1)     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
        L9c:
            org.apache.cordova.CordovaInterface r1 = r6.cordova     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
            androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
            if (r1 == 0) goto Lae
            org.apache.cordova.CordovaInterface r1 = r6.cordova     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
            androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
            goto Lfb
        Lae:
            java.lang.String r1 = "Cordova activity does not exist."
            org.apache.cordova.LOG.d(r2, r1)     // Catch: android.content.ActivityNotFoundException -> Lb4 java.net.URISyntaxException -> Le4
            goto Lfb
        Lb4:
            r1 = move-exception
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto Lcd
            if (r3 == 0) goto Lcd
            java.lang.String r0 = "browser_fallback_url"
            java.lang.String r4 = r3.getStringExtra(r0)
            if (r4 == 0) goto Lcd
            java.lang.String r0 = r3.getStringExtra(r0)
            r6.showWebPage(r0, r8, r9, r10)
            goto Lfc
        Lcd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Error loading url "
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r0 = r0.toString()
            org.apache.cordova.LOG.e(r2, r0, r1)
            goto Lfc
        Le4:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Error parsing url "
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r1 = r1.toString()
            org.apache.cordova.LOG.e(r2, r1, r0)
        Lfb:
        Lfc:
            return
    }

    @Override // org.apache.cordova.CordovaWebView
    public void stopLoading() {
            r1 = this;
            int r0 = r1.loadUrlTimeout
            int r0 = r0 + 1
            r1.loadUrlTimeout = r0
            return
    }
}
