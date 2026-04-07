package org.apache.cordova.engine;

/* JADX INFO: loaded from: classes7.dex */
public class SystemWebChromeClient extends android.webkit.WebChromeClient {
    private static final int FILECHOOSER_RESULTCODE = 5173;
    private static final java.lang.String LOG_TAG = "SystemWebChromeClient";
    private long MAX_QUOTA;
    private android.content.Context appContext;
    private org.apache.cordova.CordovaDialogsHelper dialogsHelper;
    private android.view.View mCustomView;
    private android.webkit.WebChromeClient.CustomViewCallback mCustomViewCallback;
    private android.view.View mVideoProgressView;
    protected final org.apache.cordova.engine.SystemWebViewEngine parentEngine;





    public SystemWebChromeClient(org.apache.cordova.engine.SystemWebViewEngine r3) {
            r2 = this;
            r2.<init>()
            r0 = 104857600(0x6400000, double:5.1806538E-316)
            r2.MAX_QUOTA = r0
            r2.parentEngine = r3
            org.apache.cordova.engine.SystemWebView r0 = r3.webView
            android.content.Context r0 = r0.getContext()
            r2.appContext = r0
            org.apache.cordova.CordovaDialogsHelper r0 = new org.apache.cordova.CordovaDialogsHelper
            android.content.Context r1 = r2.appContext
            r0.<init>(r1)
            r2.dialogsHelper = r0
            return
    }

    private java.io.File createTempFile(android.content.Context r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = ".jpg"
            java.io.File r1 = r4.getCacheDir()
            java.lang.String r2 = "temp"
            java.io.File r0 = java.io.File.createTempFile(r2, r0, r1)
            return r0
    }

    private android.net.Uri createUriForFile(android.content.Context r4, java.io.File r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = r4.getPackageName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = ".cdv.core.file.provider"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.net.Uri r1 = androidx.core.content.FileProvider.getUriForFile(r4, r1, r5)
            return r1
    }

    public void destroyLastDialog() {
            r1 = this;
            org.apache.cordova.CordovaDialogsHelper r0 = r1.dialogsHelper
            r0.destroyLastDialog()
            return
    }

    @Override // android.webkit.WebChromeClient
    public android.view.View getVideoLoadingProgressView() {
            r5 = this;
            android.view.View r0 = r5.mVideoProgressView
            if (r0 != 0) goto L45
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            org.apache.cordova.engine.SystemWebViewEngine r1 = r5.parentEngine
            android.view.View r1 = r1.getView()
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            r1 = 1
            r0.setOrientation(r1)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            r3 = 13
            r1.addRule(r3)
            r0.setLayoutParams(r1)
            android.widget.ProgressBar r3 = new android.widget.ProgressBar
            org.apache.cordova.engine.SystemWebViewEngine r4 = r5.parentEngine
            android.view.View r4 = r4.getView()
            android.content.Context r4 = r4.getContext()
            r3.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r2, r2)
            r2 = 17
            r4.gravity = r2
            r3.setLayoutParams(r4)
            r0.addView(r3)
            r5.mVideoProgressView = r0
        L45:
            android.view.View r0 = r5.mVideoProgressView
            return r0
    }

    @Override // android.webkit.WebChromeClient
    public void onExceededDatabaseQuota(java.lang.String r4, java.lang.String r5, long r6, long r8, long r10, android.webkit.WebStorage.QuotaUpdater r12) {
            r3 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            java.lang.String r1 = "SystemWebChromeClient"
            java.lang.String r2 = "onExceededDatabaseQuota estimatedSize: %d  currentQuota: %d  totalUsedQuota: %d"
            org.apache.cordova.LOG.d(r1, r2, r0)
            long r0 = r3.MAX_QUOTA
            r12.updateQuota(r0)
            return
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(java.lang.String r4, android.webkit.GeolocationPermissions.Callback r5) {
            r3 = this;
            super.onGeolocationPermissionsShowPrompt(r4, r5)
            r0 = 1
            r1 = 0
            r5.invoke(r4, r0, r1)
            org.apache.cordova.engine.SystemWebViewEngine r0 = r3.parentEngine
            org.apache.cordova.PluginManager r0 = r0.pluginManager
            java.lang.String r2 = "Geolocation"
            org.apache.cordova.CordovaPlugin r0 = r0.getPlugin(r2)
            if (r0 == 0) goto L1d
            boolean r2 = r0.hasPermisssion()
            if (r2 != 0) goto L1d
            r0.requestPermissions(r1)
        L1d:
            return
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
            r1 = this;
            org.apache.cordova.engine.SystemWebViewEngine r0 = r1.parentEngine
            org.apache.cordova.CordovaWebView r0 = r0.getCordovaWebView()
            r0.hideCustomView()
            return
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(android.webkit.WebView r3, java.lang.String r4, java.lang.String r5, android.webkit.JsResult r6) {
            r2 = this;
            org.apache.cordova.CordovaDialogsHelper r0 = r2.dialogsHelper
            org.apache.cordova.engine.SystemWebChromeClient$1 r1 = new org.apache.cordova.engine.SystemWebChromeClient$1
            r1.<init>(r2, r6)
            r0.showAlert(r5, r1)
            r0 = 1
            return r0
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(android.webkit.WebView r3, java.lang.String r4, java.lang.String r5, android.webkit.JsResult r6) {
            r2 = this;
            org.apache.cordova.CordovaDialogsHelper r0 = r2.dialogsHelper
            org.apache.cordova.engine.SystemWebChromeClient$2 r1 = new org.apache.cordova.engine.SystemWebChromeClient$2
            r1.<init>(r2, r6)
            r0.showConfirm(r5, r1)
            r0 = 1
            return r0
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(android.webkit.WebView r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, android.webkit.JsPromptResult r8) {
            r3 = this;
            org.apache.cordova.engine.SystemWebViewEngine r0 = r3.parentEngine
            org.apache.cordova.CordovaBridge r0 = r0.bridge
            java.lang.String r0 = r0.promptOnJsPrompt(r5, r6, r7)
            if (r0 == 0) goto Le
            r8.confirm(r0)
            goto L18
        Le:
            org.apache.cordova.CordovaDialogsHelper r1 = r3.dialogsHelper
            org.apache.cordova.engine.SystemWebChromeClient$3 r2 = new org.apache.cordova.engine.SystemWebChromeClient$3
            r2.<init>(r3, r8)
            r1.showPrompt(r6, r7, r2)
        L18:
            r1 = 1
            return r1
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(android.webkit.PermissionRequest r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onPermissionRequest: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String[] r1 = r3.getResources()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SystemWebChromeClient"
            org.apache.cordova.LOG.d(r1, r0)
            java.lang.String[] r0 = r3.getResources()
            r3.grant(r0)
            return
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(android.view.View r2, android.webkit.WebChromeClient.CustomViewCallback r3) {
            r1 = this;
            org.apache.cordova.engine.SystemWebViewEngine r0 = r1.parentEngine
            org.apache.cordova.CordovaWebView r0 = r0.getCordovaWebView()
            r0.showCustomView(r2, r3)
            return
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(android.webkit.WebView r15, android.webkit.ValueCallback<android.net.Uri[]> r16, android.webkit.WebChromeClient.FileChooserParams r17) {
            r14 = this;
            r1 = r16
            android.content.Intent r2 = r17.createIntent()
            r3 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            int r4 = r17.getMode()
            r5 = 1
            if (r4 != r5) goto L18
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r4 = r0
            goto L19
        L18:
            r4 = r0
        L19:
            java.lang.String r0 = "android.intent.extra.ALLOW_MULTIPLE"
            r2.putExtra(r0, r4)
            java.lang.String[] r6 = r17.getAcceptTypes()
            int r0 = r6.length
            if (r0 <= r5) goto L2f
            java.lang.String r0 = "*/*"
            r2.setType(r0)
            java.lang.String r0 = "android.intent.extra.MIME_TYPES"
            r2.putExtra(r0, r6)
        L2f:
            r7 = 0
            r0 = 0
            boolean r8 = r17.isCaptureEnabled()
            java.lang.String r9 = "SystemWebChromeClient"
            if (r8 == 0) goto Lad
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r10 = "android.media.action.IMAGE_CAPTURE"
            r8.<init>(r10)
            org.apache.cordova.engine.SystemWebViewEngine r0 = r14.parentEngine
            android.view.View r0 = r0.getView()
            android.content.Context r10 = r0.getContext()
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            java.lang.String r11 = "android.hardware.camera.any"
            boolean r0 = r0.hasSystemFeature(r11)
            if (r0 == 0) goto La5
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            android.content.ComponentName r0 = r8.resolveActivity(r0)
            if (r0 == 0) goto La5
            java.io.File r0 = r14.createTempFile(r10)     // Catch: java.io.IOException -> L9c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L9c
            r11.<init>()     // Catch: java.io.IOException -> L9c
            java.lang.String r12 = "Temporary photo capture file: "
            java.lang.StringBuilder r11 = r11.append(r12)     // Catch: java.io.IOException -> L9c
            java.lang.StringBuilder r11 = r11.append(r0)     // Catch: java.io.IOException -> L9c
            java.lang.String r11 = r11.toString()     // Catch: java.io.IOException -> L9c
            org.apache.cordova.LOG.d(r9, r11)     // Catch: java.io.IOException -> L9c
            android.net.Uri r11 = r14.createUriForFile(r10, r0)     // Catch: java.io.IOException -> L9c
            r7 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L9c
            r11.<init>()     // Catch: java.io.IOException -> L9c
            java.lang.String r12 = "Temporary photo capture URI: "
            java.lang.StringBuilder r11 = r11.append(r12)     // Catch: java.io.IOException -> L9c
            java.lang.StringBuilder r11 = r11.append(r7)     // Catch: java.io.IOException -> L9c
            java.lang.String r11 = r11.toString()     // Catch: java.io.IOException -> L9c
            org.apache.cordova.LOG.d(r9, r11)     // Catch: java.io.IOException -> L9c
            java.lang.String r11 = "output"
            r8.putExtra(r11, r7)     // Catch: java.io.IOException -> L9c
            goto Lae
        L9c:
            r0 = move-exception
            java.lang.String r11 = "Unable to create temporary file for photo capture"
            org.apache.cordova.LOG.e(r9, r11, r0)
            r0 = 0
            r8 = r0
            goto Lae
        La5:
            java.lang.String r0 = "Device does not support photo capture"
            org.apache.cordova.LOG.w(r9, r0)
            r0 = 0
            r8 = r0
            goto Lae
        Lad:
            r8 = r0
        Lae:
            r10 = r7
            r11 = 0
            android.content.Intent r12 = android.content.Intent.createChooser(r2, r11)
            if (r8 == 0) goto Lbf
            android.content.Intent[] r0 = new android.content.Intent[r5]
            r0[r3] = r8
            java.lang.String r3 = "android.intent.extra.INITIAL_INTENTS"
            r12.putExtra(r3, r0)
        Lbf:
            java.lang.String r0 = "Starting intent for file chooser"
            org.apache.cordova.LOG.i(r9, r0)     // Catch: android.content.ActivityNotFoundException -> Ld3
            org.apache.cordova.engine.SystemWebViewEngine r0 = r14.parentEngine     // Catch: android.content.ActivityNotFoundException -> Ld3
            org.apache.cordova.CordovaInterface r0 = r0.cordova     // Catch: android.content.ActivityNotFoundException -> Ld3
            org.apache.cordova.engine.SystemWebChromeClient$4 r3 = new org.apache.cordova.engine.SystemWebChromeClient$4     // Catch: android.content.ActivityNotFoundException -> Ld3
            r3.<init>(r14, r10, r1)     // Catch: android.content.ActivityNotFoundException -> Ld3
            r13 = 5173(0x1435, float:7.249E-42)
            r0.startActivityForResult(r3, r12, r13)     // Catch: android.content.ActivityNotFoundException -> Ld3
            goto Ldc
        Ld3:
            r0 = move-exception
            java.lang.String r3 = "No activity found to handle file chooser intent."
            org.apache.cordova.LOG.w(r9, r3, r0)
            r1.onReceiveValue(r11)
        Ldc:
            return r5
    }
}
