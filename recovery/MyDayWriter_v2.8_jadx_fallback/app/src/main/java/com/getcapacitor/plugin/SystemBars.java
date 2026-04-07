package com.getcapacitor.plugin;

/* JADX INFO: loaded from: classes4.dex */
@com.getcapacitor.annotation.CapacitorPlugin
public class SystemBars extends com.getcapacitor.Plugin {
    static final java.lang.String BAR_GESTURE_BAR = "NavigationBar";
    static final java.lang.String BAR_STATUS_BAR = "StatusBar";
    static final java.lang.String INSETS_HANDLING_CSS = "css";
    static final java.lang.String INSETS_HANDLING_DISABLE = "disable";
    static final java.lang.String STYLE_DARK = "DARK";
    static final java.lang.String STYLE_DEFAULT = "DEFAULT";
    static final java.lang.String STYLE_LIGHT = "LIGHT";
    private static final int WEBVIEW_VERSION_WITH_SAFE_AREA_FIX = 140;
    private static final int WEBVIEW_VERSION_WITH_SAFE_AREA_KEYBOARD_FIX = 144;
    static final java.lang.String viewportMetaJSFunction = "function capacitorSystemBarsCheckMetaViewport() {\n    const meta = document.querySelectorAll(\"meta[name=viewport]\");\n    if (meta.length == 0) {\n        return false;\n    }\n    // get the last found meta viewport tag\n    const metaContent = meta[meta.length - 1].content;\n    return metaContent.includes(\"viewport-fit=cover\");\n}\ncapacitorSystemBarsCheckMetaViewport();\n";
    private java.lang.String currentStyle;
    private boolean hasViewportCover;
    private boolean insetHandlingEnabled;


    public static /* synthetic */ void $r8$lambda$EvylPBzZjLdoAOeHbCFhbstdvp8(com.getcapacitor.plugin.SystemBars r0, java.lang.String r1, boolean r2) {
            r0.lambda$initSystemBars$0(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$HlI18or9g2v3jxTp55f72skUXyo(com.getcapacitor.plugin.SystemBars r0, float r1, float r2, float r3, float r4) {
            r0.lambda$injectSafeAreaCSS$7(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void $r8$lambda$MxcIqheKqAh0CeZVgL9o8jfnslI(com.getcapacitor.plugin.SystemBars r0, java.lang.String r1, java.lang.String r2, com.getcapacitor.PluginCall r3) {
            r0.lambda$setStyle$1(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$QMjT0isIammsCKWnfmRyRvdoGco(com.getcapacitor.plugin.SystemBars r0, java.lang.String r1, com.getcapacitor.PluginCall r2) {
            r0.lambda$hide$3(r1, r2)
            return
    }

    public static /* synthetic */ androidx.core.view.WindowInsetsCompat $r8$lambda$UjDIyPOa6OlxC3ysdJABQVA9OtA(com.getcapacitor.plugin.SystemBars r0, android.view.View r1, androidx.core.view.WindowInsetsCompat r2) {
            androidx.core.view.WindowInsetsCompat r0 = r0.lambda$initWindowInsetsListener$6(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$_TR-y5xYaIeYtWKuA4ceEIMUVag, reason: not valid java name */
    public static /* synthetic */ void m134$r8$lambda$_TRy5xYaIeYtWKuA4ceEIMUVag(com.getcapacitor.plugin.SystemBars r0) {
            r0.lambda$onDOMReady$5()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$mx3q8c48aQqW-qpHkXPpUu2eByA, reason: not valid java name */
    public static /* synthetic */ void m135$r8$lambda$mx3q8c48aQqWqpHkXPpUu2eByA(com.getcapacitor.plugin.SystemBars r0, java.lang.String r1, com.getcapacitor.PluginCall r2) {
            r0.lambda$show$2(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$ze9BKCK53rNqvFx6uwVYQomNzYY(com.getcapacitor.plugin.SystemBars r0, java.lang.String r1) {
            r0.lambda$onDOMReady$4(r1)
            return
    }

    public SystemBars() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.insetHandlingEnabled = r0
            r0 = 0
            r1.hasViewportCover = r0
            java.lang.String r0 = "DEFAULT"
            r1.currentStyle = r0
            return
    }

    private androidx.core.graphics.Insets calcSafeAreaInsets(androidx.core.view.WindowInsetsCompat r6) {
            r5 = this;
            int r0 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
            int r1 = androidx.core.view.WindowInsetsCompat.Type.displayCutout()
            r0 = r0 | r1
            androidx.core.graphics.Insets r0 = r6.getInsets(r0)
            int r1 = androidx.core.view.WindowInsetsCompat.Type.ime()
            boolean r1 = r6.isVisible(r1)
            if (r1 == 0) goto L23
            int r1 = r0.left
            int r2 = r0.top
            int r3 = r0.right
            r4 = 0
            androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.of(r1, r2, r3, r4)
            return r1
        L23:
            int r1 = r0.left
            int r2 = r0.top
            int r3 = r0.right
            int r4 = r0.bottom
            androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.of(r1, r2, r3, r4)
            return r1
    }

    private int getBottomInset(androidx.core.graphics.Insets r3, boolean r4) {
            r2 = this;
            java.lang.Integer r0 = r2.getWebViewMajorVersion()
            int r0 = r0.intValue()
            r1 = 144(0x90, float:2.02E-43)
            if (r0 >= r1) goto L10
            if (r4 == 0) goto L10
            r0 = 0
            return r0
        L10:
            int r0 = r3.bottom
            return r0
    }

    private java.lang.String getStyleForTheme() {
            r2 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r2.getActivity()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 == r1) goto L17
            java.lang.String r1 = "LIGHT"
            return r1
        L17:
            java.lang.String r1 = "DARK"
            return r1
    }

    private java.lang.Integer getWebViewMajorVersion() {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            android.content.pm.PackageInfo r0 = androidx.webkit.WebViewCompat.getCurrentWebViewPackage(r0)
            r1 = 0
            if (r0 == 0) goto L1e
            java.lang.String r2 = r0.versionName
            if (r2 == 0) goto L1e
            java.lang.String r2 = r0.versionName
            java.lang.String r3 = "\\."
            java.lang.String[] r2 = r2.split(r3)
            r1 = r2[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L1e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    private void initSafeAreaCSSVariables() {
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto L2d
            boolean r0 = r7.insetHandlingEnabled
            if (r0 == 0) goto L2d
            com.getcapacitor.Bridge r0 = r7.getBridge()
            android.webkit.WebView r0 = r0.getWebView()
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.ViewCompat.getRootWindowInsets(r0)
            if (r1 == 0) goto L2d
            androidx.core.graphics.Insets r2 = r7.calcSafeAreaInsets(r1)
            int r3 = r2.top
            int r4 = r2.right
            int r5 = r2.bottom
            int r6 = r2.left
            r7.injectSafeAreaCSS(r3, r4, r5, r6)
        L2d:
            return
    }

    private void initSystemBars() {
            r6 = this;
            com.getcapacitor.PluginConfig r0 = r6.getConfig()
            java.lang.String r1 = "style"
            java.lang.String r2 = "DEFAULT"
            java.lang.String r0 = r0.getString(r1, r2)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toUpperCase(r1)
            com.getcapacitor.PluginConfig r1 = r6.getConfig()
            java.lang.String r2 = "hidden"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            com.getcapacitor.PluginConfig r2 = r6.getConfig()
            java.lang.String r4 = "insetsHandling"
            java.lang.String r5 = "css"
            java.lang.String r2 = r2.getString(r4, r5)
            java.lang.String r4 = "disable"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L33
            r6.insetHandlingEnabled = r3
        L33:
            r6.initWindowInsetsListener()
            r6.initSafeAreaCSSVariables()
            com.getcapacitor.Bridge r3 = r6.getBridge()
            com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda5 r4 = new com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda5
            r4.<init>(r6, r0, r1)
            r3.executeOnMainThread(r4)
            return
    }

    private void initWindowInsetsListener() {
            r2 = this;
            com.getcapacitor.Bridge r0 = r2.getBridge()
            android.webkit.WebView r0 = r0.getWebView()
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda1 r1 = new com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda1
            r1.<init>(r2)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r0, r1)
            return
    }

    private void injectSafeAreaCSS(int r9, int r10, int r11, int r12) {
            r8 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r8.getActivity()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = (float) r9
            float r4 = r1 / r0
            float r1 = (float) r10
            float r5 = r1 / r0
            float r1 = (float) r11
            float r6 = r1 / r0
            float r1 = (float) r12
            float r7 = r1 / r0
            com.getcapacitor.Bridge r1 = r8.getBridge()
            com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda4 r2 = new com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda4
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r1.executeOnMainThread(r2)
            return
    }

    private /* synthetic */ void lambda$hide$3(java.lang.String r2, com.getcapacitor.PluginCall r3) {
            r1 = this;
            r0 = 1
            r1.setHidden(r0, r2)
            r3.resolve()
            return
    }

    private /* synthetic */ void lambda$initSystemBars$0(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = ""
            r1.setStyle(r2, r0)
            r1.setHidden(r3, r0)
            return
    }

    private /* synthetic */ androidx.core.view.WindowInsetsCompat lambda$initWindowInsetsListener$6(android.view.View r11, androidx.core.view.WindowInsetsCompat r12) {
            r10 = this;
            java.lang.Integer r0 = r10.getWebViewMajorVersion()
            int r0 = r0.intValue()
            r1 = 140(0x8c, float:1.96E-43)
            r2 = 0
            if (r0 < r1) goto L13
            boolean r0 = r10.hasViewportCover
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = r2
        L14:
            int r1 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
            int r3 = androidx.core.view.WindowInsetsCompat.Type.displayCutout()
            r1 = r1 | r3
            androidx.core.graphics.Insets r1 = r12.getInsets(r1)
            int r3 = androidx.core.view.WindowInsetsCompat.Type.ime()
            androidx.core.graphics.Insets r3 = r12.getInsets(r3)
            int r4 = androidx.core.view.WindowInsetsCompat.Type.ime()
            boolean r4 = r12.isVisible(r4)
            r5 = 35
            if (r0 == 0) goto L7e
            if (r4 == 0) goto L3a
            int r6 = r3.bottom
            goto L3b
        L3a:
            r6 = r2
        L3b:
            r11.setPadding(r2, r2, r2, r6)
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r5) goto L59
            boolean r2 = r10.hasViewportCover
            if (r2 == 0) goto L59
            boolean r2 = r10.insetHandlingEnabled
            if (r2 == 0) goto L59
            androidx.core.graphics.Insets r2 = r10.calcSafeAreaInsets(r12)
            int r5 = r2.top
            int r6 = r2.right
            int r7 = r2.bottom
            int r8 = r2.left
            r10.injectSafeAreaCSS(r5, r6, r7, r8)
        L59:
            androidx.core.view.WindowInsetsCompat$Builder r2 = new androidx.core.view.WindowInsetsCompat$Builder
            r2.<init>(r12)
            int r5 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
            int r6 = androidx.core.view.WindowInsetsCompat.Type.displayCutout()
            r5 = r5 | r6
            int r6 = r1.left
            int r7 = r1.top
            int r8 = r1.right
            int r9 = r10.getBottomInset(r1, r4)
            androidx.core.graphics.Insets r6 = androidx.core.graphics.Insets.of(r6, r7, r8, r9)
            androidx.core.view.WindowInsetsCompat$Builder r2 = r2.setInsets(r5, r6)
            androidx.core.view.WindowInsetsCompat r2 = r2.build()
            return r2
        L7e:
            int r6 = r1.left
            int r7 = r1.top
            int r8 = r1.right
            if (r4 == 0) goto L89
            int r9 = r3.bottom
            goto L8b
        L89:
            int r9 = r1.bottom
        L8b:
            r11.setPadding(r6, r7, r8, r9)
            androidx.core.view.WindowInsetsCompat$Builder r6 = new androidx.core.view.WindowInsetsCompat$Builder
            r6.<init>(r12)
            int r7 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
            int r8 = androidx.core.view.WindowInsetsCompat.Type.displayCutout()
            r7 = r7 | r8
            androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.of(r2, r2, r2, r2)
            androidx.core.view.WindowInsetsCompat$Builder r2 = r6.setInsets(r7, r2)
            androidx.core.view.WindowInsetsCompat r2 = r2.build()
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r5) goto Lc3
            boolean r5 = r10.hasViewportCover
            if (r5 == 0) goto Lc3
            boolean r5 = r10.insetHandlingEnabled
            if (r5 == 0) goto Lc3
            androidx.core.graphics.Insets r5 = r10.calcSafeAreaInsets(r2)
            int r6 = r5.top
            int r7 = r5.right
            int r8 = r5.bottom
            int r9 = r5.left
            r10.injectSafeAreaCSS(r6, r7, r8, r9)
        Lc3:
            return r2
    }

    private /* synthetic */ void lambda$injectSafeAreaCSS$7(float r6, float r7, float r8, float r9) {
            r5 = this;
            com.getcapacitor.Bridge r0 = r5.bridge
            if (r0 == 0) goto L36
            com.getcapacitor.Bridge r0 = r5.bridge
            android.webkit.WebView r0 = r0.getWebView()
            if (r0 == 0) goto L36
            java.util.Locale r0 = java.util.Locale.US
            int r1 = (int) r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = (int) r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = (int) r8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = (int) r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3, r4}
            java.lang.String r2 = "try {\n  document.documentElement.style.setProperty(\"--safe-area-inset-top\", \"%dpx\");\n  document.documentElement.style.setProperty(\"--safe-area-inset-right\", \"%dpx\");\n  document.documentElement.style.setProperty(\"--safe-area-inset-bottom\", \"%dpx\");\n  document.documentElement.style.setProperty(\"--safe-area-inset-left\", \"%dpx\");\n} catch(e) { console.error('Error injecting safe area CSS:', e); }\n"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            com.getcapacitor.Bridge r1 = r5.bridge
            android.webkit.WebView r1 = r1.getWebView()
            r2 = 0
            r1.evaluateJavascript(r0, r2)
        L36:
            return
    }

    private /* synthetic */ void lambda$onDOMReady$4(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "true"
            boolean r0 = r2.equals(r0)
            r1.hasViewportCover = r0
            com.getcapacitor.Bridge r0 = r1.getBridge()
            android.webkit.WebView r0 = r0.getWebView()
            r0.requestApplyInsets()
            return
    }

    private /* synthetic */ void lambda$onDOMReady$5() {
            r3 = this;
            com.getcapacitor.Bridge r0 = r3.bridge
            android.webkit.WebView r0 = r0.getWebView()
            com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda7 r1 = new com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda7
            r1.<init>(r3)
            java.lang.String r2 = "function capacitorSystemBarsCheckMetaViewport() {\n    const meta = document.querySelectorAll(\"meta[name=viewport]\");\n    if (meta.length == 0) {\n        return false;\n    }\n    // get the last found meta viewport tag\n    const metaContent = meta[meta.length - 1].content;\n    return metaContent.includes(\"viewport-fit=cover\");\n}\ncapacitorSystemBarsCheckMetaViewport();\n"
            r0.evaluateJavascript(r2, r1)
            return
    }

    private /* synthetic */ void lambda$setStyle$1(java.lang.String r1, java.lang.String r2, com.getcapacitor.PluginCall r3) {
            r0 = this;
            r0.setStyle(r1, r2)
            r3.resolve()
            return
    }

    private /* synthetic */ void lambda$show$2(java.lang.String r2, com.getcapacitor.PluginCall r3) {
            r1 = this;
            r0 = 0
            r1.setHidden(r0, r2)
            r3.resolve()
            return
    }

    private void setHidden(boolean r6, java.lang.String r7) {
            r5 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r5.getActivity()
            android.view.Window r0 = r0.getWindow()
            android.view.View r1 = r0.getDecorView()
            androidx.core.view.WindowInsetsControllerCompat r1 = androidx.core.view.WindowCompat.getInsetsController(r0, r1)
            java.lang.String r2 = "NavigationBar"
            java.lang.String r3 = "StatusBar"
            if (r6 == 0) goto L3d
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L22
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L29
        L22:
            int r3 = androidx.core.view.WindowInsetsCompat.Type.statusBars()
            r1.hide(r3)
        L29:
            boolean r3 = r7.isEmpty()
            if (r3 != 0) goto L35
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L3c
        L35:
            int r2 = androidx.core.view.WindowInsetsCompat.Type.navigationBars()
            r1.hide(r2)
        L3c:
            return
        L3d:
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L49
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L50
        L49:
            int r3 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
            r1.show(r3)
        L50:
            boolean r3 = r7.isEmpty()
            if (r3 != 0) goto L5c
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L63
        L5c:
            int r2 = androidx.core.view.WindowInsetsCompat.Type.navigationBars()
            r1.show(r2)
        L63:
            return
    }

    private void setStyle(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            r5.currentStyle = r6
            java.lang.String r0 = "DEFAULT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Le
            java.lang.String r6 = r5.getStyleForTheme()
        Le:
            androidx.appcompat.app.AppCompatActivity r0 = r5.getActivity()
            android.view.Window r0 = r0.getWindow()
            android.view.View r1 = r0.getDecorView()
            androidx.core.view.WindowInsetsControllerCompat r1 = androidx.core.view.WindowCompat.getInsetsController(r0, r1)
            boolean r2 = r7.isEmpty()
            java.lang.String r3 = "DARK"
            if (r2 != 0) goto L2e
            java.lang.String r2 = "StatusBar"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L37
        L2e:
            boolean r2 = r6.equals(r3)
            r2 = r2 ^ 1
            r1.setAppearanceLightStatusBars(r2)
        L37:
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L45
            java.lang.String r2 = "NavigationBar"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L4e
        L45:
            boolean r2 = r6.equals(r3)
            r2 = r2 ^ 1
            r1.setAppearanceLightNavigationBars(r2)
        L4e:
            androidx.appcompat.app.AppCompatActivity r2 = r5.getActivity()
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            android.content.Context r3 = r5.getContext()
            r4 = 16842836(0x1010054, float:2.3693793E-38)
            int r3 = r5.getThemeColor(r3, r4)
            r2.setBackgroundColor(r3)
            return
    }

    public int getThemeColor(android.content.Context r4, int r5) {
            r3 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 1
            r1.resolveAttribute(r5, r0, r2)
            int r2 = r0.data
            return r2
    }

    @Override // com.getcapacitor.Plugin
    protected void handleOnConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            super.handleOnConfigurationChanged(r3)
            java.lang.String r0 = r2.currentStyle
            java.lang.String r1 = ""
            r2.setStyle(r0, r1)
            return
    }

    @Override // com.getcapacitor.Plugin
    protected void handleOnStart() {
            r2 = this;
            super.handleOnStart()
            com.getcapacitor.Bridge r0 = r2.getBridge()
            com.getcapacitor.plugin.SystemBars$1 r1 = new com.getcapacitor.plugin.SystemBars$1
            r1.<init>(r2)
            r0.addWebViewListener(r1)
            return
    }

    @com.getcapacitor.PluginMethod
    public void hide(com.getcapacitor.PluginCall r4) {
            r3 = this;
            java.lang.String r0 = "bar"
            java.lang.String r1 = ""
            java.lang.String r0 = r4.getString(r0, r1)
            com.getcapacitor.Bridge r1 = r3.getBridge()
            com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda6 r2 = new com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda6
            r2.<init>(r3, r0, r4)
            r1.executeOnMainThread(r2)
            return
    }

    @Override // com.getcapacitor.Plugin
    public void load() {
            r2 = this;
            com.getcapacitor.Bridge r0 = r2.getBridge()
            android.webkit.WebView r0 = r0.getWebView()
            java.lang.String r1 = "CapacitorSystemBarsAndroidInterface"
            r0.addJavascriptInterface(r2, r1)
            super.load()
            r2.initSystemBars()
            return
    }

    @android.webkit.JavascriptInterface
    public void onDOMReady() {
            r2 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r2.getActivity()
            com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda2 r1 = new com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda2
            r1.<init>(r2)
            r0.runOnUiThread(r1)
            return
    }

    @com.getcapacitor.PluginMethod
    public void setAnimation(com.getcapacitor.PluginCall r1) {
            r0 = this;
            r1.resolve()
            return
    }

    @com.getcapacitor.PluginMethod
    public void setStyle(com.getcapacitor.PluginCall r5) {
            r4 = this;
            java.lang.String r0 = "bar"
            java.lang.String r1 = ""
            java.lang.String r0 = r5.getString(r0, r1)
            java.lang.String r1 = "style"
            java.lang.String r2 = "DEFAULT"
            java.lang.String r1 = r5.getString(r1, r2)
            com.getcapacitor.Bridge r2 = r4.getBridge()
            com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda3 r3 = new com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda3
            r3.<init>(r4, r1, r0, r5)
            r2.executeOnMainThread(r3)
            return
    }

    @com.getcapacitor.PluginMethod
    public void show(com.getcapacitor.PluginCall r4) {
            r3 = this;
            java.lang.String r0 = "bar"
            java.lang.String r1 = ""
            java.lang.String r0 = r4.getString(r0, r1)
            com.getcapacitor.Bridge r1 = r3.getBridge()
            com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda0 r2 = new com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda0
            r2.<init>(r3, r0, r4)
            r1.executeOnMainThread(r2)
            return
    }
}
