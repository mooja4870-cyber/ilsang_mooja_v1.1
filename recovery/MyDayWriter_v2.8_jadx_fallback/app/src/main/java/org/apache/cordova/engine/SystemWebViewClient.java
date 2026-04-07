package org.apache.cordova.engine;

/* JADX INFO: loaded from: classes7.dex */
public class SystemWebViewClient extends android.webkit.WebViewClient {
    private static final java.lang.String TAG = "SystemWebViewClient";
    private final androidx.webkit.WebViewAssetLoader assetLoader;
    private java.util.Hashtable<java.lang.String, org.apache.cordova.AuthenticationToken> authenticationTokens;
    private boolean doClearHistory;
    boolean isCurrentlyLoading;
    protected final org.apache.cordova.engine.SystemWebViewEngine parentEngine;


    /* JADX INFO: renamed from: -$$Nest$fgetassetLoader, reason: not valid java name */
    static /* bridge */ /* synthetic */ androidx.webkit.WebViewAssetLoader m1747$$Nest$fgetassetLoader(org.apache.cordova.engine.SystemWebViewClient r0) {
            androidx.webkit.WebViewAssetLoader r0 = r0.assetLoader
            return r0
    }

    public SystemWebViewClient(org.apache.cordova.engine.SystemWebViewEngine r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.doClearHistory = r0
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r4.authenticationTokens = r0
            r4.parentEngine = r5
            androidx.webkit.WebViewAssetLoader$Builder r0 = new androidx.webkit.WebViewAssetLoader$Builder
            r0.<init>()
            org.apache.cordova.CordovaPreferences r1 = r5.preferences
            java.lang.String r2 = "hostname"
            java.lang.String r3 = "localhost"
            java.lang.String r1 = r1.getString(r2, r3)
            java.lang.String r1 = r1.toLowerCase()
            androidx.webkit.WebViewAssetLoader$Builder r0 = r0.setDomain(r1)
            r1 = 1
            androidx.webkit.WebViewAssetLoader$Builder r0 = r0.setHttpAllowed(r1)
            org.apache.cordova.engine.SystemWebViewClient$$ExternalSyntheticLambda0 r2 = new org.apache.cordova.engine.SystemWebViewClient$$ExternalSyntheticLambda0
            r2.<init>(r4, r5)
            java.lang.String r3 = "/"
            r0.addPathHandler(r3, r2)
            androidx.webkit.WebViewAssetLoader r2 = r0.build()
            r4.assetLoader = r2
            org.apache.cordova.CordovaPreferences r2 = r5.preferences
            java.lang.String r3 = "ResolveServiceWorkerRequests"
            boolean r1 = r2.getBoolean(r3, r1)
            r2 = 0
            if (r1 == 0) goto L52
            android.webkit.ServiceWorkerController r2 = android.webkit.ServiceWorkerController.getInstance()
            org.apache.cordova.engine.SystemWebViewClient$1 r3 = new org.apache.cordova.engine.SystemWebViewClient$1
            r3.<init>(r4)
            r2.setServiceWorkerClient(r3)
        L52:
            return
    }

    private static boolean needsContentUrlFix(android.net.Uri r2) {
            java.lang.String r0 = "content"
            java.lang.String r1 = r2.getScheme()
            boolean r0 = r0.equals(r1)
            return r0
    }

    private static boolean needsSpecialsInAssetUrlFix(android.net.Uri r3) {
            int r0 = org.apache.cordova.CordovaResourceApi.getUriType(r3)
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L9
            return r1
        L9:
            java.lang.String r0 = r3.getQuery()
            if (r0 != 0) goto L24
            java.lang.String r0 = r3.getFragment()
            if (r0 == 0) goto L16
            goto L24
        L16:
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "%"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L23
            return r1
        L23:
            return r1
        L24:
            return r2
    }

    public void clearAuthenticationTokens() {
            r1 = this;
            java.util.Hashtable<java.lang.String, org.apache.cordova.AuthenticationToken> r0 = r1.authenticationTokens
            r0.clear()
            return
    }

    public org.apache.cordova.AuthenticationToken getAuthenticationToken(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            java.util.Hashtable<java.lang.String, org.apache.cordova.AuthenticationToken> r1 = r3.authenticationTokens
            java.lang.String r2 = r4.concat(r5)
            java.lang.Object r1 = r1.get(r2)
            r0 = r1
            org.apache.cordova.AuthenticationToken r0 = (org.apache.cordova.AuthenticationToken) r0
            if (r0 != 0) goto L31
            java.util.Hashtable<java.lang.String, org.apache.cordova.AuthenticationToken> r1 = r3.authenticationTokens
            java.lang.Object r1 = r1.get(r4)
            r0 = r1
            org.apache.cordova.AuthenticationToken r0 = (org.apache.cordova.AuthenticationToken) r0
            if (r0 != 0) goto L24
            java.util.Hashtable<java.lang.String, org.apache.cordova.AuthenticationToken> r1 = r3.authenticationTokens
            java.lang.Object r1 = r1.get(r5)
            r0 = r1
            org.apache.cordova.AuthenticationToken r0 = (org.apache.cordova.AuthenticationToken) r0
        L24:
            if (r0 != 0) goto L31
            java.util.Hashtable<java.lang.String, org.apache.cordova.AuthenticationToken> r1 = r3.authenticationTokens
            java.lang.String r2 = ""
            java.lang.Object r1 = r1.get(r2)
            r0 = r1
            org.apache.cordova.AuthenticationToken r0 = (org.apache.cordova.AuthenticationToken) r0
        L31:
            return r0
    }

    /* JADX INFO: renamed from: lambda$new$0$org-apache-cordova-engine-SystemWebViewClient, reason: not valid java name */
    /* synthetic */ android.webkit.WebResourceResponse m1748lambda$new$0$orgapachecordovaengineSystemWebViewClient(org.apache.cordova.engine.SystemWebViewEngine r7, java.lang.String r8) {
            r6 = this;
            r0 = 0
            org.apache.cordova.engine.SystemWebViewEngine r1 = r6.parentEngine     // Catch: java.lang.Exception -> L90
            org.apache.cordova.PluginManager r1 = r1.pluginManager     // Catch: java.lang.Exception -> L90
            if (r1 == 0) goto L2d
            java.util.ArrayList r2 = r1.getPluginPathHandlers()     // Catch: java.lang.Exception -> L90
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L90
        Lf:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L90
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L90
            org.apache.cordova.CordovaPluginPathHandler r3 = (org.apache.cordova.CordovaPluginPathHandler) r3     // Catch: java.lang.Exception -> L90
            androidx.webkit.WebViewAssetLoader$PathHandler r4 = r3.getPathHandler()     // Catch: java.lang.Exception -> L90
            if (r4 == 0) goto L2c
            androidx.webkit.WebViewAssetLoader$PathHandler r4 = r3.getPathHandler()     // Catch: java.lang.Exception -> L90
            android.webkit.WebResourceResponse r4 = r4.handle(r8)     // Catch: java.lang.Exception -> L90
            if (r4 == 0) goto L2c
            return r4
        L2c:
            goto Lf
        L2d:
            boolean r2 = r8.isEmpty()     // Catch: java.lang.Exception -> L90
            if (r2 == 0) goto L36
            java.lang.String r2 = "index.html"
            r8 = r2
        L36:
            org.apache.cordova.engine.SystemWebView r2 = r7.webView     // Catch: java.lang.Exception -> L90
            android.content.Context r2 = r2.getContext()     // Catch: java.lang.Exception -> L90
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch: java.lang.Exception -> L90
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L90
            r3.<init>()     // Catch: java.lang.Exception -> L90
            java.lang.String r4 = "www/"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Exception -> L90
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Exception -> L90
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L90
            r4 = 2
            java.io.InputStream r2 = r2.open(r3, r4)     // Catch: java.lang.Exception -> L90
            java.lang.String r3 = "text/html"
            java.lang.String r4 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r8)     // Catch: java.lang.Exception -> L90
            if (r4 == 0) goto L8a
            java.lang.String r5 = ".js"
            boolean r5 = r8.endsWith(r5)     // Catch: java.lang.Exception -> L90
            if (r5 != 0) goto L87
            java.lang.String r5 = ".mjs"
            boolean r5 = r8.endsWith(r5)     // Catch: java.lang.Exception -> L90
            if (r5 == 0) goto L71
            goto L87
        L71:
            java.lang.String r5 = ".wasm"
            boolean r5 = r8.endsWith(r5)     // Catch: java.lang.Exception -> L90
            if (r5 == 0) goto L7d
            java.lang.String r5 = "application/wasm"
            r3 = r5
            goto L8a
        L7d:
            android.webkit.MimeTypeMap r5 = android.webkit.MimeTypeMap.getSingleton()     // Catch: java.lang.Exception -> L90
            java.lang.String r5 = r5.getMimeTypeFromExtension(r4)     // Catch: java.lang.Exception -> L90
            r3 = r5
            goto L8a
        L87:
            java.lang.String r5 = "application/javascript"
            r3 = r5
        L8a:
            android.webkit.WebResourceResponse r5 = new android.webkit.WebResourceResponse     // Catch: java.lang.Exception -> L90
            r5.<init>(r3, r0, r2)     // Catch: java.lang.Exception -> L90
            return r5
        L90:
            r1 = move-exception
            r1.printStackTrace()
            java.lang.String r2 = "SystemWebViewClient"
            java.lang.String r3 = r1.getMessage()
            org.apache.cordova.LOG.e(r2, r3)
            return r0
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView r3, java.lang.String r4) {
            r2 = this;
            super.onPageFinished(r3, r4)
            boolean r0 = r2.isCurrentlyLoading
            if (r0 != 0) goto L10
            java.lang.String r0 = "about:"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L10
            return
        L10:
            r0 = 0
            r2.isCurrentlyLoading = r0
            boolean r1 = r2.doClearHistory
            if (r1 == 0) goto L1c
            r3.clearHistory()
            r2.doClearHistory = r0
        L1c:
            org.apache.cordova.engine.SystemWebViewEngine r0 = r2.parentEngine
            org.apache.cordova.CordovaWebViewEngine$Client r0 = r0.client
            r0.onPageFinishedLoading(r4)
            return
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView r2, java.lang.String r3, android.graphics.Bitmap r4) {
            r1 = this;
            super.onPageStarted(r2, r3, r4)
            r0 = 1
            r1.isCurrentlyLoading = r0
            org.apache.cordova.engine.SystemWebViewEngine r0 = r1.parentEngine
            org.apache.cordova.CordovaBridge r0 = r0.bridge
            r0.reset()
            org.apache.cordova.engine.SystemWebViewEngine r0 = r1.parentEngine
            org.apache.cordova.CordovaWebViewEngine$Client r0 = r0.client
            r0.onPageStarted(r3)
            return
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(android.webkit.WebView r4, android.webkit.ClientCertRequest r5) {
            r3 = this;
            org.apache.cordova.engine.SystemWebViewEngine r0 = r3.parentEngine
            org.apache.cordova.PluginManager r0 = r0.pluginManager
            if (r0 == 0) goto L1a
            org.apache.cordova.CordovaClientCertRequest r1 = new org.apache.cordova.CordovaClientCertRequest
            r1.<init>(r5)
            r2 = 0
            boolean r1 = r0.onReceivedClientCertRequest(r2, r1)
            if (r1 == 0) goto L1a
            org.apache.cordova.engine.SystemWebViewEngine r1 = r3.parentEngine
            org.apache.cordova.CordovaWebViewEngine$Client r1 = r1.client
            r1.clearLoadTimeoutTimer()
            return
        L1a:
            super.onReceivedClientCertRequest(r4, r5)
            return
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView r4, int r5, java.lang.String r6, java.lang.String r7) {
            r3 = this;
            boolean r0 = r3.isCurrentlyLoading
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r6, r7}
            java.lang.String r1 = "SystemWebViewClient"
            java.lang.String r2 = "CordovaWebViewClient.onReceivedError: Error code=%s Description=%s URL=%s"
            org.apache.cordova.LOG.d(r1, r2, r0)
            r0 = -10
            if (r5 != r0) goto L2c
            org.apache.cordova.engine.SystemWebViewEngine r0 = r3.parentEngine
            org.apache.cordova.CordovaWebViewEngine$Client r0 = r0.client
            r0.clearLoadTimeoutTimer()
            boolean r0 = r4.canGoBack()
            if (r0 == 0) goto L29
            r4.goBack()
            return
        L29:
            super.onReceivedError(r4, r5, r6, r7)
        L2c:
            org.apache.cordova.engine.SystemWebViewEngine r0 = r3.parentEngine
            org.apache.cordova.CordovaWebViewEngine$Client r0 = r0.client
            r0.onReceivedError(r5, r6, r7)
            return
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(android.webkit.WebView r5, android.webkit.HttpAuthHandler r6, java.lang.String r7, java.lang.String r8) {
            r4 = this;
            org.apache.cordova.AuthenticationToken r0 = r4.getAuthenticationToken(r7, r8)
            if (r0 == 0) goto L12
            java.lang.String r1 = r0.getUserName()
            java.lang.String r2 = r0.getPassword()
            r6.proceed(r1, r2)
            return
        L12:
            org.apache.cordova.engine.SystemWebViewEngine r1 = r4.parentEngine
            org.apache.cordova.PluginManager r1 = r1.pluginManager
            if (r1 == 0) goto L2c
            org.apache.cordova.CordovaHttpAuthHandler r2 = new org.apache.cordova.CordovaHttpAuthHandler
            r2.<init>(r6)
            r3 = 0
            boolean r2 = r1.onReceivedHttpAuthRequest(r3, r2, r7, r8)
            if (r2 == 0) goto L2c
            org.apache.cordova.engine.SystemWebViewEngine r2 = r4.parentEngine
            org.apache.cordova.CordovaWebViewEngine$Client r2 = r2.client
            r2.clearLoadTimeoutTimer()
            return
        L2c:
            super.onReceivedHttpAuthRequest(r5, r6, r7, r8)
            return
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(android.webkit.WebView r5, android.webkit.SslErrorHandler r6, android.net.http.SslError r7) {
            r4 = this;
            org.apache.cordova.engine.SystemWebViewEngine r0 = r4.parentEngine
            org.apache.cordova.CordovaInterface r0 = r0.cordova
            androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
            java.lang.String r0 = r0.getPackageName()
            org.apache.cordova.engine.SystemWebViewEngine r1 = r4.parentEngine
            org.apache.cordova.CordovaInterface r1 = r1.cordova
            androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r1.getApplicationInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            int r3 = r2.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            r3 = r3 & 2
            if (r3 == 0) goto L28
            r6.proceed()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            return
        L28:
            super.onReceivedSslError(r5, r6, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            goto L30
        L2c:
            r2 = move-exception
            super.onReceivedSslError(r5, r6, r7)
        L30:
            return
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(android.webkit.WebView r3, android.webkit.RenderProcessGoneDetail r4) {
            r2 = this;
            org.apache.cordova.engine.SystemWebViewEngine r0 = r2.parentEngine
            org.apache.cordova.PluginManager r0 = r0.pluginManager
            if (r0 == 0) goto Le
            boolean r1 = r0.onRenderProcessGone(r3, r4)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            boolean r1 = super.onRenderProcessGone(r3, r4)
            return r1
    }

    public org.apache.cordova.AuthenticationToken removeAuthenticationToken(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.Hashtable<java.lang.String, org.apache.cordova.AuthenticationToken> r0 = r2.authenticationTokens
            java.lang.String r1 = r3.concat(r4)
            java.lang.Object r0 = r0.remove(r1)
            org.apache.cordova.AuthenticationToken r0 = (org.apache.cordova.AuthenticationToken) r0
            return r0
    }

    public void setAuthenticationToken(org.apache.cordova.AuthenticationToken r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            if (r4 != 0) goto L4
            java.lang.String r4 = ""
        L4:
            if (r5 != 0) goto L8
            java.lang.String r5 = ""
        L8:
            java.util.Hashtable<java.lang.String, org.apache.cordova.AuthenticationToken> r0 = r2.authenticationTokens
            java.lang.String r1 = r4.concat(r5)
            r0.put(r1, r3)
            return
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r3, android.webkit.WebResourceRequest r4) {
            r2 = this;
            androidx.webkit.WebViewAssetLoader r0 = r2.assetLoader
            android.net.Uri r1 = r4.getUrl()
            android.webkit.WebResourceResponse r0 = r0.shouldInterceptRequest(r1)
            return r0
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r12, java.lang.String r13) {
            r11 = this;
            java.lang.String r0 = "SystemWebViewClient"
            java.lang.String r1 = "text/plain"
            java.lang.String r2 = "UTF-8"
            r3 = 0
            org.apache.cordova.engine.SystemWebViewEngine r4 = r11.parentEngine     // Catch: java.io.IOException -> L5c
            org.apache.cordova.PluginManager r4 = r4.pluginManager     // Catch: java.io.IOException -> L5c
            boolean r4 = r4.shouldAllowRequest(r13)     // Catch: java.io.IOException -> L5c
            if (r4 != 0) goto L2d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L5c
            r4.<init>()     // Catch: java.io.IOException -> L5c
            java.lang.String r5 = "URL blocked by allow list: "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.io.IOException -> L5c
            java.lang.StringBuilder r4 = r4.append(r13)     // Catch: java.io.IOException -> L5c
            java.lang.String r4 = r4.toString()     // Catch: java.io.IOException -> L5c
            org.apache.cordova.LOG.w(r0, r4)     // Catch: java.io.IOException -> L5c
            android.webkit.WebResourceResponse r4 = new android.webkit.WebResourceResponse     // Catch: java.io.IOException -> L5c
            r4.<init>(r1, r2, r3)     // Catch: java.io.IOException -> L5c
            return r4
        L2d:
            org.apache.cordova.engine.SystemWebViewEngine r4 = r11.parentEngine     // Catch: java.io.IOException -> L5c
            org.apache.cordova.CordovaResourceApi r4 = r4.resourceApi     // Catch: java.io.IOException -> L5c
            android.net.Uri r5 = android.net.Uri.parse(r13)     // Catch: java.io.IOException -> L5c
            android.net.Uri r6 = r4.remapUri(r5)     // Catch: java.io.IOException -> L5c
            boolean r7 = r5.equals(r6)     // Catch: java.io.IOException -> L5c
            if (r7 == 0) goto L4d
            boolean r7 = needsSpecialsInAssetUrlFix(r5)     // Catch: java.io.IOException -> L5c
            if (r7 != 0) goto L4d
            boolean r7 = needsContentUrlFix(r5)     // Catch: java.io.IOException -> L5c
            if (r7 == 0) goto L4c
            goto L4d
        L4c:
            return r3
        L4d:
            r7 = 1
            org.apache.cordova.CordovaResourceApi$OpenForReadResult r7 = r4.openForRead(r6, r7)     // Catch: java.io.IOException -> L5c
            android.webkit.WebResourceResponse r8 = new android.webkit.WebResourceResponse     // Catch: java.io.IOException -> L5c
            java.lang.String r9 = r7.mimeType     // Catch: java.io.IOException -> L5c
            java.io.InputStream r10 = r7.inputStream     // Catch: java.io.IOException -> L5c
            r8.<init>(r9, r2, r10)     // Catch: java.io.IOException -> L5c
            return r8
        L5c:
            r4 = move-exception
            boolean r5 = r4 instanceof java.io.FileNotFoundException
            if (r5 != 0) goto L66
            java.lang.String r5 = "Error occurred while loading a file (returning a 404)."
            org.apache.cordova.LOG.e(r0, r5, r4)
        L66:
            android.webkit.WebResourceResponse r0 = new android.webkit.WebResourceResponse
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r2, java.lang.String r3) {
            r1 = this;
            org.apache.cordova.engine.SystemWebViewEngine r0 = r1.parentEngine
            org.apache.cordova.CordovaWebViewEngine$Client r0 = r0.client
            boolean r0 = r0.onNavigationAttempt(r3)
            return r0
    }
}
