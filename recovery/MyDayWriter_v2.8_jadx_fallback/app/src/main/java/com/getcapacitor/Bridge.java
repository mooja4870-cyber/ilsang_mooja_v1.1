package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class Bridge {
    private static final java.lang.String BUNDLE_LAST_PLUGIN_CALL_METHOD_NAME_KEY = "capacitorLastActivityPluginMethod";
    private static final java.lang.String BUNDLE_LAST_PLUGIN_ID_KEY = "capacitorLastActivityPluginId";
    private static final java.lang.String BUNDLE_PLUGIN_CALL_BUNDLE_KEY = "capacitorLastPluginCallBundle";
    private static final java.lang.String BUNDLE_PLUGIN_CALL_OPTIONS_SAVED_KEY = "capacitorLastPluginCallOptions";
    public static final java.lang.String CAPACITOR_CONTENT_START = "/_capacitor_content_";
    public static final java.lang.String CAPACITOR_FILE_START = "/_capacitor_file_";

    @java.lang.Deprecated
    public static final java.lang.String CAPACITOR_HTTPS_INTERCEPTOR_START = "/_capacitor_https_interceptor_";
    public static final java.lang.String CAPACITOR_HTTPS_SCHEME = "https";
    public static final java.lang.String CAPACITOR_HTTP_INTERCEPTOR_START = "/_capacitor_http_interceptor_";
    public static final java.lang.String CAPACITOR_HTTP_INTERCEPTOR_URL_PARAM = "u";
    public static final java.lang.String CAPACITOR_HTTP_SCHEME = "http";
    public static final int DEFAULT_ANDROID_WEBVIEW_VERSION = 60;
    public static final int DEFAULT_HUAWEI_WEBVIEW_VERSION = 10;
    public static final java.lang.String DEFAULT_WEB_ASSET_DIR = "public";
    private static final java.lang.String LAST_BINARY_VERSION_CODE = "lastBinaryVersionCode";
    private static final java.lang.String LAST_BINARY_VERSION_NAME = "lastBinaryVersionName";
    private static final java.lang.String MINIMUM_ANDROID_WEBVIEW_ERROR = "System WebView is not supported";
    public static final int MINIMUM_ANDROID_WEBVIEW_VERSION = 55;
    public static final int MINIMUM_HUAWEI_WEBVIEW_VERSION = 10;
    private static final java.lang.String PERMISSION_PREFS_NAME = "PluginPermStates";
    private java.util.Set<java.lang.String> allowedOriginRules;
    private com.getcapacitor.App app;
    private com.getcapacitor.util.HostMask appAllowNavigationMask;
    private java.lang.String appUrl;
    private java.lang.String appUrlConfig;
    private java.util.ArrayList<java.lang.String> authorities;
    private java.lang.Boolean canInjectJS;
    private com.getcapacitor.CapConfig config;
    private final androidx.appcompat.app.AppCompatActivity context;
    public final com.getcapacitor.cordova.MockCordovaInterfaceImpl cordovaInterface;
    private org.apache.cordova.CordovaWebView cordovaWebView;
    private final androidx.fragment.app.Fragment fragment;
    private final android.os.HandlerThread handlerThread;
    private final java.util.List<java.lang.Class<? extends com.getcapacitor.Plugin>> initialPlugins;
    private android.net.Uri intentUri;
    private com.getcapacitor.WebViewLocalServer localServer;
    private java.lang.String localUrl;
    private java.util.ArrayList<java.lang.String> miscJSFileInjections;
    private final com.getcapacitor.MessageHandler msgHandler;
    private com.getcapacitor.PluginCall pluginCallForLastActivity;
    private final java.util.List<com.getcapacitor.Plugin> pluginInstances;
    private java.util.Map<java.lang.String, com.getcapacitor.PluginHandle> plugins;
    private org.apache.cordova.CordovaPreferences preferences;
    private com.getcapacitor.RouteProcessor routeProcessor;
    private java.util.Map<java.lang.String, com.getcapacitor.PluginCall> savedCalls;
    private java.util.Map<java.lang.String, java.util.LinkedList<java.lang.String>> savedPermissionCallIds;
    private com.getcapacitor.ServerPath serverPath;
    private android.os.Handler taskHandler;
    private final android.webkit.WebView webView;
    private com.getcapacitor.BridgeWebViewClient webViewClient;
    private java.util.List<com.getcapacitor.WebViewListener> webViewListeners;


    public static class Builder {
        private androidx.appcompat.app.AppCompatActivity activity;
        private com.getcapacitor.CapConfig config;
        private androidx.fragment.app.Fragment fragment;
        private android.os.Bundle instanceState;
        private java.util.List<com.getcapacitor.Plugin> pluginInstances;
        private java.util.List<java.lang.Class<? extends com.getcapacitor.Plugin>> plugins;
        private com.getcapacitor.RouteProcessor routeProcessor;
        private com.getcapacitor.ServerPath serverPath;
        private final java.util.List<com.getcapacitor.WebViewListener> webViewListeners;

        public Builder(androidx.appcompat.app.AppCompatActivity r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.instanceState = r0
                r1.config = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.plugins = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.pluginInstances = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.webViewListeners = r0
                r1.activity = r2
                return
        }

        public Builder(androidx.fragment.app.Fragment r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.instanceState = r0
                r1.config = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.plugins = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.pluginInstances = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.webViewListeners = r0
                androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
                androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
                r1.activity = r0
                r1.fragment = r2
                return
        }

        public com.getcapacitor.Bridge.Builder addPlugin(java.lang.Class<? extends com.getcapacitor.Plugin> r2) {
                r1 = this;
                java.util.List<java.lang.Class<? extends com.getcapacitor.Plugin>> r0 = r1.plugins
                r0.add(r2)
                return r1
        }

        public com.getcapacitor.Bridge.Builder addPluginInstance(com.getcapacitor.Plugin r2) {
                r1 = this;
                java.util.List<com.getcapacitor.Plugin> r0 = r1.pluginInstances
                r0.add(r2)
                return r1
        }

        public com.getcapacitor.Bridge.Builder addPluginInstances(java.util.List<com.getcapacitor.Plugin> r2) {
                r1 = this;
                java.util.List<com.getcapacitor.Plugin> r0 = r1.pluginInstances
                r0.addAll(r2)
                return r1
        }

        public com.getcapacitor.Bridge.Builder addPlugins(java.util.List<java.lang.Class<? extends com.getcapacitor.Plugin>> r3) {
                r2 = this;
                java.util.Iterator r0 = r3.iterator()
            L4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L14
                java.lang.Object r1 = r0.next()
                java.lang.Class r1 = (java.lang.Class) r1
                r2.addPlugin(r1)
                goto L4
            L14:
                return r2
        }

        public com.getcapacitor.Bridge.Builder addWebViewListener(com.getcapacitor.WebViewListener r2) {
                r1 = this;
                java.util.List<com.getcapacitor.WebViewListener> r0 = r1.webViewListeners
                r0.add(r2)
                return r1
        }

        public com.getcapacitor.Bridge.Builder addWebViewListeners(java.util.List<com.getcapacitor.WebViewListener> r3) {
                r2 = this;
                java.util.Iterator r0 = r3.iterator()
            L4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L14
                java.lang.Object r1 = r0.next()
                com.getcapacitor.WebViewListener r1 = (com.getcapacitor.WebViewListener) r1
                r2.addWebViewListener(r1)
                goto L4
            L14:
                return r2
        }

        public com.getcapacitor.Bridge create() {
                r15 = this;
                org.apache.cordova.ConfigXmlParser r0 = new org.apache.cordova.ConfigXmlParser
                r0.<init>()
                androidx.appcompat.app.AppCompatActivity r1 = r15.activity
                android.content.Context r1 = r1.getApplicationContext()
                r0.parse(r1)
                org.apache.cordova.CordovaPreferences r11 = r0.getPreferences()
                androidx.appcompat.app.AppCompatActivity r1 = r15.activity
                android.content.Intent r1 = r1.getIntent()
                android.os.Bundle r1 = r1.getExtras()
                r11.setPreferencesBundle(r1)
                java.util.ArrayList r1 = r0.getPluginEntries()
                com.getcapacitor.cordova.MockCordovaInterfaceImpl r9 = new com.getcapacitor.cordova.MockCordovaInterfaceImpl
                androidx.appcompat.app.AppCompatActivity r2 = r15.activity
                r9.<init>(r2)
                android.os.Bundle r2 = r15.instanceState
                if (r2 == 0) goto L33
                android.os.Bundle r2 = r15.instanceState
                r9.restoreInstanceState(r2)
            L33:
                androidx.fragment.app.Fragment r2 = r15.fragment
                if (r2 == 0) goto L44
                androidx.fragment.app.Fragment r2 = r15.fragment
                android.view.View r2 = r2.getView()
                int r3 = com.getcapacitor.android.R.id.webview
                android.view.View r2 = r2.findViewById(r3)
                goto L4c
            L44:
                androidx.appcompat.app.AppCompatActivity r2 = r15.activity
                int r3 = com.getcapacitor.android.R.id.webview
                android.view.View r2 = r2.findViewById(r3)
            L4c:
                android.webkit.WebView r2 = (android.webkit.WebView) r2
                r6 = r2
                com.getcapacitor.cordova.MockCordovaWebViewImpl r2 = new com.getcapacitor.cordova.MockCordovaWebViewImpl
                androidx.appcompat.app.AppCompatActivity r3 = r15.activity
                android.content.Context r3 = r3.getApplicationContext()
                r2.<init>(r3)
                r14 = r2
                r14.init(r9, r1, r11, r6)
                org.apache.cordova.PluginManager r10 = r14.getPluginManager()
                r9.onCordovaInit(r10)
                com.getcapacitor.Bridge r2 = new com.getcapacitor.Bridge
                androidx.appcompat.app.AppCompatActivity r3 = r15.activity
                com.getcapacitor.ServerPath r4 = r15.serverPath
                androidx.fragment.app.Fragment r5 = r15.fragment
                java.util.List<java.lang.Class<? extends com.getcapacitor.Plugin>> r7 = r15.plugins
                java.util.List<com.getcapacitor.Plugin> r8 = r15.pluginInstances
                com.getcapacitor.CapConfig r12 = r15.config
                r13 = 0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                boolean r3 = r6 instanceof com.getcapacitor.CapacitorWebView
                if (r3 == 0) goto L81
                r3 = r6
                com.getcapacitor.CapacitorWebView r3 = (com.getcapacitor.CapacitorWebView) r3
                r3.setBridge(r2)
            L81:
                r2.setCordovaWebView(r14)
                java.util.List<com.getcapacitor.WebViewListener> r3 = r15.webViewListeners
                r2.setWebViewListeners(r3)
                com.getcapacitor.RouteProcessor r3 = r15.routeProcessor
                r2.setRouteProcessor(r3)
                android.os.Bundle r3 = r15.instanceState
                if (r3 == 0) goto L97
                android.os.Bundle r3 = r15.instanceState
                r2.restoreInstanceState(r3)
            L97:
                return r2
        }

        public com.getcapacitor.Bridge.Builder setConfig(com.getcapacitor.CapConfig r1) {
                r0 = this;
                r0.config = r1
                return r0
        }

        public com.getcapacitor.Bridge.Builder setInstanceState(android.os.Bundle r1) {
                r0 = this;
                r0.instanceState = r1
                return r0
        }

        public com.getcapacitor.Bridge.Builder setPlugins(java.util.List<java.lang.Class<? extends com.getcapacitor.Plugin>> r1) {
                r0 = this;
                r0.plugins = r1
                return r0
        }

        public com.getcapacitor.Bridge.Builder setRouteProcessor(com.getcapacitor.RouteProcessor r1) {
                r0 = this;
                r0.routeProcessor = r1
                return r0
        }

        public com.getcapacitor.Bridge.Builder setServerPath(com.getcapacitor.ServerPath r1) {
                r0 = this;
                r0.serverPath = r1
                return r0
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$FNYM7cvgeBk0k8YXQH7M96Mrf-c, reason: not valid java name */
    public static /* synthetic */ void m101$r8$lambda$FNYM7cvgeBk0k8YXQH7M96Mrfc(com.getcapacitor.Bridge r0, com.getcapacitor.PluginHandle r1, java.lang.String r2, com.getcapacitor.PluginCall r3) {
            r0.lambda$callPluginMethod$0(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$P1FKFq8tICTLOO-zenvtsccrBL0, reason: not valid java name */
    public static /* synthetic */ void m102$r8$lambda$P1FKFq8tICTLOOzenvtsccrBL0(com.getcapacitor.Bridge r0) {
            r0.lambda$setServerBasePath$4()
            return
    }

    public static /* synthetic */ void $r8$lambda$QUlHKAKwPPB6h_MMqUErymPLE_w(com.getcapacitor.Bridge r0) {
            r0.lambda$setServerAssetPath$5()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$c2-kVWtq9znSXhzGkR-eRCLRvA8, reason: not valid java name */
    public static /* synthetic */ void m103$r8$lambda$c2kVWtq9znSXhzGkReRCLRvA8(com.getcapacitor.Bridge r0) {
            r0.lambda$reload$6()
            return
    }

    public static /* synthetic */ void $r8$lambda$c8L_lcj5D7mie6Lox_r5YdIsoIQ(com.getcapacitor.Bridge r0, java.lang.String r1, android.webkit.ValueCallback r2) {
            r0.lambda$eval$1(r1, r2)
            return
    }

    @java.lang.Deprecated
    public Bridge(androidx.appcompat.app.AppCompatActivity r12, android.webkit.WebView r13, java.util.List<java.lang.Class<? extends com.getcapacitor.Plugin>> r14, com.getcapacitor.cordova.MockCordovaInterfaceImpl r15, org.apache.cordova.PluginManager r16, org.apache.cordova.CordovaPreferences r17, com.getcapacitor.CapConfig r18) {
            r11 = this;
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r2 = 0
            r3 = 0
            r0 = r11
            r1 = r12
            r4 = r13
            r5 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    private Bridge(androidx.appcompat.app.AppCompatActivity r3, com.getcapacitor.ServerPath r4, androidx.fragment.app.Fragment r5, android.webkit.WebView r6, java.util.List<java.lang.Class<? extends com.getcapacitor.Plugin>> r7, java.util.List<com.getcapacitor.Plugin> r8, com.getcapacitor.cordova.MockCordovaInterfaceImpl r9, org.apache.cordova.PluginManager r10, org.apache.cordova.CordovaPreferences r11, com.getcapacitor.CapConfig r12) {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.allowedOriginRules = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.authorities = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.miscJSFileInjections = r0
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.canInjectJS = r0
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "CapacitorPlugins"
            r0.<init>(r1)
            r2.handlerThread = r0
            r0 = 0
            r2.taskHandler = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.plugins = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.savedCalls = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.savedPermissionCallIds = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.webViewListeners = r0
            com.getcapacitor.App r0 = new com.getcapacitor.App
            r0.<init>()
            r2.app = r0
            r2.serverPath = r4
            r2.context = r3
            r2.fragment = r5
            r2.webView = r6
            com.getcapacitor.BridgeWebViewClient r0 = new com.getcapacitor.BridgeWebViewClient
            r0.<init>(r2)
            r2.webViewClient = r0
            r2.initialPlugins = r7
            r2.pluginInstances = r8
            r2.cordovaInterface = r9
            r2.preferences = r11
            android.os.HandlerThread r0 = r2.handlerThread
            r0.start()
            android.os.Handler r0 = new android.os.Handler
            android.os.HandlerThread r1 = r2.handlerThread
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r1)
            r2.taskHandler = r0
            if (r12 == 0) goto L7b
            r0 = r12
            goto L83
        L7b:
            androidx.appcompat.app.AppCompatActivity r0 = r2.getActivity()
            com.getcapacitor.CapConfig r0 = com.getcapacitor.CapConfig.loadDefault(r0)
        L83:
            r2.config = r0
            com.getcapacitor.CapConfig r0 = r2.config
            com.getcapacitor.Logger.init(r0)
            r2.initWebView()
            r2.setAllowedOriginRules()
            com.getcapacitor.MessageHandler r0 = new com.getcapacitor.MessageHandler
            r0.<init>(r2, r6, r10)
            r2.msgHandler = r0
            android.content.Intent r0 = r3.getIntent()
            android.net.Uri r1 = r0.getData()
            r2.intentUri = r1
            r2.registerAllPlugins()
            r2.loadWebView()
            return
    }

    /* synthetic */ Bridge(androidx.appcompat.app.AppCompatActivity r1, com.getcapacitor.ServerPath r2, androidx.fragment.app.Fragment r3, android.webkit.WebView r4, java.util.List r5, java.util.List r6, com.getcapacitor.cordova.MockCordovaInterfaceImpl r7, org.apache.cordova.PluginManager r8, org.apache.cordova.CordovaPreferences r9, com.getcapacitor.CapConfig r10, com.getcapacitor.BridgeIA r11) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    private int extractWebViewMajorVersion(android.content.pm.PackageManager r5, java.lang.String r6) {
            r4 = this;
            r0 = 0
            android.content.pm.PackageInfo r1 = com.getcapacitor.util.InternalUtils.getPackageInfo(r5, r6)     // Catch: java.lang.Exception -> L14
            java.lang.String r2 = r1.versionName     // Catch: java.lang.Exception -> L14
            java.lang.String r3 = "\\."
            java.lang.String[] r2 = r2.split(r3)     // Catch: java.lang.Exception -> L14
            r2 = r2[r0]     // Catch: java.lang.Exception -> L14
            int r0 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L14
            return r0
        L14:
            r1 = move-exception
            java.lang.String r2 = "Unable to get package info for '%s' with err '%s'"
            java.lang.Object[] r3 = new java.lang.Object[]{r6, r1}
            java.lang.String r2 = java.lang.String.format(r2, r3)
            com.getcapacitor.Logger.warn(r2)
            return r0
    }

    private com.getcapacitor.JSInjector getJSInjector() {
            r10 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r10.context     // Catch: java.lang.Exception -> L6a
            com.getcapacitor.CapConfig r1 = r10.config     // Catch: java.lang.Exception -> L6a
            boolean r1 = r1.isLoggingEnabled()     // Catch: java.lang.Exception -> L6a
            boolean r2 = r10.isDevMode()     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = com.getcapacitor.JSExport.getGlobalJS(r0, r1, r2)     // Catch: java.lang.Exception -> L6a
            r2 = r0
            androidx.appcompat.app.AppCompatActivity r0 = r10.context     // Catch: java.lang.Exception -> L6a
            java.lang.String r3 = com.getcapacitor.JSExport.getBridgeJS(r0)     // Catch: java.lang.Exception -> L6a
            java.util.Map<java.lang.String, com.getcapacitor.PluginHandle> r0 = r10.plugins     // Catch: java.lang.Exception -> L6a
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Exception -> L6a
            java.lang.String r4 = com.getcapacitor.JSExport.getPluginJS(r0)     // Catch: java.lang.Exception -> L6a
            androidx.appcompat.app.AppCompatActivity r0 = r10.context     // Catch: java.lang.Exception -> L6a
            java.lang.String r5 = com.getcapacitor.JSExport.getCordovaJS(r0)     // Catch: java.lang.Exception -> L6a
            androidx.appcompat.app.AppCompatActivity r0 = r10.context     // Catch: java.lang.Exception -> L6a
            java.lang.String r6 = com.getcapacitor.JSExport.getCordovaPluginJS(r0)     // Catch: java.lang.Exception -> L6a
            androidx.appcompat.app.AppCompatActivity r0 = r10.context     // Catch: java.lang.Exception -> L6a
            java.lang.String r7 = com.getcapacitor.JSExport.getCordovaPluginsFileJS(r0)     // Catch: java.lang.Exception -> L6a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6a
            r0.<init>()     // Catch: java.lang.Exception -> L6a
            java.lang.String r1 = "window.WEBVIEW_SERVER_URL = '"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L6a
            java.lang.String r1 = r10.localUrl     // Catch: java.lang.Exception -> L6a
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L6a
            java.lang.String r1 = "';"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L6a
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Exception -> L6a
            java.util.ArrayList<java.lang.String> r0 = r10.miscJSFileInjections     // Catch: java.lang.Exception -> L6a
            androidx.appcompat.app.AppCompatActivity r1 = r10.context     // Catch: java.lang.Exception -> L6a
            java.lang.String r9 = com.getcapacitor.JSExport.getMiscFileJS(r0, r1)     // Catch: java.lang.Exception -> L6a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L6a
            r0.<init>()     // Catch: java.lang.Exception -> L6a
            r10.miscJSFileInjections = r0     // Catch: java.lang.Exception -> L6a
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L6a
            r10.canInjectJS = r0     // Catch: java.lang.Exception -> L6a
            com.getcapacitor.JSInjector r1 = new com.getcapacitor.JSInjector     // Catch: java.lang.Exception -> L6a
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L6a
            return r1
        L6a:
            r0 = move-exception
            java.lang.String r1 = "Unable to export Capacitor JS. App will not function!"
            com.getcapacitor.Logger.error(r1, r0)
            r0 = 0
            return r0
    }

    private java.lang.String getLegacyPluginName(java.lang.Class<? extends com.getcapacitor.Plugin> r3) {
            r2 = this;
            java.lang.Class<com.getcapacitor.NativePlugin> r0 = com.getcapacitor.NativePlugin.class
            java.lang.annotation.Annotation r0 = r3.getAnnotation(r0)
            com.getcapacitor.NativePlugin r0 = (com.getcapacitor.NativePlugin) r0
            if (r0 != 0) goto L11
            java.lang.String r1 = "Plugin doesn't have the @CapacitorPlugin annotation. Please add it"
            com.getcapacitor.Logger.error(r1)
            r1 = 0
            return r1
        L11:
            java.lang.String r1 = r0.name()
            return r1
    }

    private void initWebView() {
            r10 = this;
            android.webkit.WebView r0 = r10.webView
            android.webkit.WebSettings r0 = r0.getSettings()
            r1 = 1
            r0.setJavaScriptEnabled(r1)
            r0.setDomStorageEnabled(r1)
            r0.setGeolocationEnabled(r1)
            r2 = 0
            r0.setMediaPlaybackRequiresUserGesture(r2)
            r0.setJavaScriptCanOpenWindowsAutomatically(r1)
            com.getcapacitor.CapConfig r1 = r10.config
            boolean r1 = r1.isMixedContentAllowed()
            if (r1 == 0) goto L22
            r0.setMixedContentMode(r2)
        L22:
            com.getcapacitor.CapConfig r1 = r10.config
            java.lang.String r1 = r1.getAppendedUserAgentString()
            if (r1 == 0) goto L48
            java.lang.String r3 = r0.getUserAgentString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r5 = " "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.setUserAgentString(r4)
        L48:
            com.getcapacitor.CapConfig r3 = r10.config
            java.lang.String r3 = r3.getOverriddenUserAgentString()
            if (r3 == 0) goto L53
            r0.setUserAgentString(r3)
        L53:
            com.getcapacitor.CapConfig r4 = r10.config
            java.lang.String r4 = r4.getBackgroundColor()
            if (r4 == 0) goto L6c
            android.webkit.WebView r5 = r10.webView     // Catch: java.lang.IllegalArgumentException -> L65
            int r6 = com.getcapacitor.util.WebColor.parseColor(r4)     // Catch: java.lang.IllegalArgumentException -> L65
            r5.setBackgroundColor(r6)     // Catch: java.lang.IllegalArgumentException -> L65
            goto L6c
        L65:
            r5 = move-exception
            java.lang.String r6 = "WebView background color not applied"
            com.getcapacitor.Logger.debug(r6)
            goto L6d
        L6c:
        L6d:
            r0.setDisplayZoomControls(r2)
            com.getcapacitor.CapConfig r2 = r10.config
            boolean r2 = r2.isZoomableWebView()
            r0.setBuiltInZoomControls(r2)
            com.getcapacitor.CapConfig r2 = r10.config
            boolean r2 = r2.isInitialFocus()
            if (r2 == 0) goto L86
            android.webkit.WebView r2 = r10.webView
            r2.requestFocusFromTouch()
        L86:
            com.getcapacitor.CapConfig r2 = r10.config
            boolean r2 = r2.isWebContentsDebuggingEnabled()
            android.webkit.WebView.setWebContentsDebuggingEnabled(r2)
            java.lang.String r2 = r10.getServerUrl()
            r10.appUrlConfig = r2
            java.lang.String r2 = r10.getHost()
            java.util.ArrayList<java.lang.String> r5 = r10.authorities
            r5.add(r2)
            java.lang.String r5 = r10.getScheme()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.String r7 = "://"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r6 = r6.toString()
            r10.localUrl = r6
            java.lang.String r6 = r10.appUrlConfig
            if (r6 == 0) goto L110
            java.net.URL r6 = new java.net.URL     // Catch: java.lang.Exception -> Lf4
            java.lang.String r8 = r10.appUrlConfig     // Catch: java.lang.Exception -> Lf4
            r6.<init>(r8)     // Catch: java.lang.Exception -> Lf4
            java.util.ArrayList<java.lang.String> r8 = r10.authorities     // Catch: java.lang.Exception -> Lf4
            java.lang.String r9 = r6.getAuthority()     // Catch: java.lang.Exception -> Lf4
            r8.add(r9)     // Catch: java.lang.Exception -> Lf4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf4
            r8.<init>()     // Catch: java.lang.Exception -> Lf4
            java.lang.String r9 = r6.getProtocol()     // Catch: java.lang.Exception -> Lf4
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Exception -> Lf4
            java.lang.StringBuilder r7 = r8.append(r7)     // Catch: java.lang.Exception -> Lf4
            java.lang.String r8 = r6.getAuthority()     // Catch: java.lang.Exception -> Lf4
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Lf4
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> Lf4
            r10.localUrl = r7     // Catch: java.lang.Exception -> Lf4
            java.lang.String r6 = r10.appUrlConfig
            r10.appUrl = r6
            goto L13b
        Lf4:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Provided server url is invalid: "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = r6.getMessage()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.getcapacitor.Logger.error(r7)
            return
        L110:
            java.lang.String r6 = r10.localUrl
            r10.appUrl = r6
            java.lang.String r6 = "http"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L13b
            java.lang.String r6 = "https"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L13b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r10.appUrl
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = "/"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r10.appUrl = r6
        L13b:
            com.getcapacitor.CapConfig r6 = r10.config
            java.lang.String r6 = r6.getStartPath()
            if (r6 == 0) goto L162
            java.lang.String r7 = r6.trim()
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L162
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r10.appUrl
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r6)
            java.lang.String r7 = r7.toString()
            r10.appUrl = r7
        L162:
            return
    }

    private boolean isNewBinary() {
            r12 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = ""
            android.content.Context r2 = r12.getContext()
            java.lang.String r3 = "CapWebViewSettings"
            r4 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)
            java.lang.String r3 = "lastBinaryVersionCode"
            r5 = 0
            java.lang.String r6 = r2.getString(r3, r5)
            java.lang.String r7 = "lastBinaryVersionName"
            java.lang.String r5 = r2.getString(r7, r5)
            android.content.Context r8 = r12.getContext()     // Catch: java.lang.Exception -> L3e
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: java.lang.Exception -> L3e
            android.content.Context r9 = r12.getContext()     // Catch: java.lang.Exception -> L3e
            java.lang.String r9 = r9.getPackageName()     // Catch: java.lang.Exception -> L3e
            android.content.pm.PackageInfo r9 = com.getcapacitor.util.InternalUtils.getPackageInfo(r8, r9)     // Catch: java.lang.Exception -> L3e
            long r10 = androidx.core.content.pm.PackageInfoCompat.getLongVersionCode(r9)     // Catch: java.lang.Exception -> L3e
            int r10 = (int) r10     // Catch: java.lang.Exception -> L3e
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch: java.lang.Exception -> L3e
            r0 = r10
            java.lang.String r10 = r9.versionName     // Catch: java.lang.Exception -> L3e
            r1 = r10
            goto L44
        L3e:
            r8 = move-exception
            java.lang.String r9 = "Unable to get package info"
            com.getcapacitor.Logger.error(r9, r8)
        L44:
            boolean r8 = r0.equals(r6)
            if (r8 == 0) goto L52
            boolean r8 = r1.equals(r5)
            if (r8 != 0) goto L51
            goto L52
        L51:
            return r4
        L52:
            android.content.SharedPreferences$Editor r4 = r2.edit()
            r4.putString(r3, r0)
            r4.putString(r7, r1)
            java.lang.String r3 = "serverBasePath"
            java.lang.String r7 = ""
            r4.putString(r3, r7)
            r4.apply()
            r3 = 1
            return r3
    }

    private /* synthetic */ void lambda$callPluginMethod$0(com.getcapacitor.PluginHandle r3, java.lang.String r4, com.getcapacitor.PluginCall r5) {
            r2 = this;
            r3.invoke(r4, r5)     // Catch: java.lang.Exception -> Ld com.getcapacitor.InvalidPluginMethodException -> L19 com.getcapacitor.PluginLoadException -> L1b
            boolean r0 = r5.isKeptAlive()     // Catch: java.lang.Exception -> Ld com.getcapacitor.InvalidPluginMethodException -> L19 com.getcapacitor.PluginLoadException -> L1b
            if (r0 == 0) goto L21
            r2.saveCall(r5)     // Catch: java.lang.Exception -> Ld com.getcapacitor.InvalidPluginMethodException -> L19 com.getcapacitor.PluginLoadException -> L1b
            goto L21
        Ld:
            r0 = move-exception
            java.lang.String r1 = "Serious error executing plugin"
            com.getcapacitor.Logger.error(r1, r0)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L19:
            r0 = move-exception
            goto L1c
        L1b:
            r0 = move-exception
        L1c:
            java.lang.String r1 = "Unable to execute plugin method"
            com.getcapacitor.Logger.error(r1, r0)
        L21:
            return
    }

    private /* synthetic */ void lambda$eval$1(java.lang.String r2, android.webkit.ValueCallback r3) {
            r1 = this;
            android.webkit.WebView r0 = r1.webView
            r0.evaluateJavascript(r2, r3)
            return
    }

    private /* synthetic */ void lambda$reload$6() {
            r2 = this;
            android.webkit.WebView r0 = r2.webView
            java.lang.String r1 = r2.appUrl
            r0.loadUrl(r1)
            return
    }

    private /* synthetic */ void lambda$setServerAssetPath$5() {
            r2 = this;
            android.webkit.WebView r0 = r2.webView
            java.lang.String r1 = r2.appUrl
            r0.loadUrl(r1)
            return
    }

    private /* synthetic */ void lambda$setServerBasePath$4() {
            r2 = this;
            android.webkit.WebView r0 = r2.webView
            java.lang.String r1 = r2.appUrl
            r0.loadUrl(r1)
            return
    }

    static /* synthetic */ void lambda$triggerJSEvent$2(java.lang.String r0) {
            return
    }

    static /* synthetic */ void lambda$triggerJSEvent$3(java.lang.String r0) {
            return
    }

    private void loadWebView() {
            r8 = this;
            com.getcapacitor.CapConfig r0 = r8.config
            boolean r6 = r0.isHTML5Mode()
            com.getcapacitor.JSInjector r1 = r8.getJSInjector()
            java.lang.String r0 = "DOCUMENT_START_SCRIPT"
            boolean r0 = androidx.webkit.WebViewFeature.isFeatureSupported(r0)
            r7 = 0
            if (r0 == 0) goto L47
            java.lang.String r0 = r8.appUrl
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r7)
            android.net.Uri$Builder r0 = r0.fragment(r7)
            android.net.Uri$Builder r0 = r0.clearQuery()
            android.net.Uri r0 = r0.build()
            java.lang.String r2 = r0.toString()
            android.webkit.WebView r0 = r8.webView     // Catch: java.lang.IllegalArgumentException -> L41
            java.lang.String r3 = r1.getScriptString()     // Catch: java.lang.IllegalArgumentException -> L41
            java.util.Set r4 = java.util.Collections.singleton(r2)     // Catch: java.lang.IllegalArgumentException -> L41
            androidx.webkit.WebViewCompat.addDocumentStartJavaScript(r0, r3, r4)     // Catch: java.lang.IllegalArgumentException -> L41
            r1 = 0
            r4 = r1
            goto L48
        L41:
            r0 = move-exception
            java.lang.String r3 = "Invalid url, using fallback"
            com.getcapacitor.Logger.warn(r3)
        L47:
            r4 = r1
        L48:
            com.getcapacitor.WebViewLocalServer r1 = new com.getcapacitor.WebViewLocalServer
            androidx.appcompat.app.AppCompatActivity r2 = r8.context
            java.util.ArrayList<java.lang.String> r5 = r8.authorities
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r3.localServer = r1
            com.getcapacitor.WebViewLocalServer r0 = r3.localServer
            java.lang.String r1 = "public"
            r0.hostAssets(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Loading app at "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.appUrl
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.getcapacitor.Logger.debug(r0)
            android.webkit.WebView r0 = r3.webView
            com.getcapacitor.BridgeWebChromeClient r1 = new com.getcapacitor.BridgeWebChromeClient
            r1.<init>(r8)
            r0.setWebChromeClient(r1)
            android.webkit.WebView r0 = r3.webView
            com.getcapacitor.BridgeWebViewClient r1 = r3.webViewClient
            r0.setWebViewClient(r1)
            com.getcapacitor.CapConfig r0 = r3.config
            boolean r0 = r0.isResolveServiceWorkerRequests()
            if (r0 == 0) goto L98
            android.webkit.ServiceWorkerController r0 = android.webkit.ServiceWorkerController.getInstance()
            com.getcapacitor.Bridge$1 r1 = new com.getcapacitor.Bridge$1
            r1.<init>(r8)
            r0.setServiceWorkerClient(r1)
        L98:
            boolean r0 = r8.isDeployDisabled()
            if (r0 != 0) goto Lcb
            boolean r0 = r8.isNewBinary()
            if (r0 != 0) goto Lcb
            android.content.Context r0 = r8.getContext()
            java.lang.String r1 = "CapWebViewSettings"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "serverBasePath"
            java.lang.String r1 = r0.getString(r1, r7)
            if (r1 == 0) goto Lcb
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lcb
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r2 = r2.exists()
            if (r2 == 0) goto Lcb
            r8.setServerBasePath(r1)
        Lcb:
            boolean r0 = r8.isMinimumWebViewInstalled()
            if (r0 != 0) goto Le2
            java.lang.String r0 = r8.getErrorUrl()
            if (r0 == 0) goto Ldd
            android.webkit.WebView r1 = r3.webView
            r1.loadUrl(r0)
            return
        Ldd:
            java.lang.String r1 = "System WebView is not supported"
            com.getcapacitor.Logger.error(r1)
        Le2:
            com.getcapacitor.ServerPath r0 = r3.serverPath
            if (r0 == 0) goto L104
            com.getcapacitor.ServerPath r0 = r3.serverPath
            com.getcapacitor.ServerPath$PathType r0 = r0.getType()
            com.getcapacitor.ServerPath$PathType r1 = com.getcapacitor.ServerPath.PathType.ASSET_PATH
            if (r0 != r1) goto Lfa
            com.getcapacitor.ServerPath r0 = r3.serverPath
            java.lang.String r0 = r0.getPath()
            r8.setServerAssetPath(r0)
            goto L10b
        Lfa:
            com.getcapacitor.ServerPath r0 = r3.serverPath
            java.lang.String r0 = r0.getPath()
            r8.setServerBasePath(r0)
            goto L10b
        L104:
            android.webkit.WebView r0 = r3.webView
            java.lang.String r1 = r3.appUrl
            r0.loadUrl(r1)
        L10b:
            return
    }

    private void logInvalidPluginException(java.lang.Class<? extends com.getcapacitor.Plugin> r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NativePlugin "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " is invalid. Ensure the @CapacitorPlugin annotation exists on the plugin class and the class extends Plugin"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.getcapacitor.Logger.error(r0)
            return
    }

    private void logPluginLoadException(java.lang.Class<? extends com.getcapacitor.Plugin> r3, java.lang.Exception r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NativePlugin "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " failed to load"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.getcapacitor.Logger.error(r0, r4)
            return
    }

    private java.lang.String pluginId(java.lang.Class<? extends com.getcapacitor.Plugin> r5) {
            r4 = this;
            java.lang.String r0 = r4.pluginName(r5)
            java.lang.String r1 = r5.getSimpleName()
            if (r0 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            java.lang.String r2 = ""
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L15
            r1 = r0
        L15:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Registering plugin instance: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.getcapacitor.Logger.debug(r2)
            return r1
    }

    private java.lang.String pluginName(java.lang.Class<? extends com.getcapacitor.Plugin> r3) {
            r2 = this;
            java.lang.Class<com.getcapacitor.annotation.CapacitorPlugin> r0 = com.getcapacitor.annotation.CapacitorPlugin.class
            java.lang.annotation.Annotation r0 = r3.getAnnotation(r0)
            com.getcapacitor.annotation.CapacitorPlugin r0 = (com.getcapacitor.annotation.CapacitorPlugin) r0
            if (r0 != 0) goto Lf
            java.lang.String r1 = r2.getLegacyPluginName(r3)
            goto L13
        Lf:
            java.lang.String r1 = r0.name()
        L13:
            return r1
    }

    private void registerAllPlugins() {
            r2 = this;
            java.lang.Class<com.getcapacitor.plugin.CapacitorCookies> r0 = com.getcapacitor.plugin.CapacitorCookies.class
            r2.registerPlugin(r0)
            java.lang.Class<com.getcapacitor.plugin.WebView> r0 = com.getcapacitor.plugin.WebView.class
            r2.registerPlugin(r0)
            java.lang.Class<com.getcapacitor.plugin.CapacitorHttp> r0 = com.getcapacitor.plugin.CapacitorHttp.class
            r2.registerPlugin(r0)
            java.lang.Class<com.getcapacitor.plugin.SystemBars> r0 = com.getcapacitor.plugin.SystemBars.class
            r2.registerPlugin(r0)
            java.util.List<java.lang.Class<? extends com.getcapacitor.Plugin>> r0 = r2.initialPlugins
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            java.lang.Class r1 = (java.lang.Class) r1
            r2.registerPlugin(r1)
            goto L1a
        L2a:
            java.util.List<com.getcapacitor.Plugin> r0 = r2.pluginInstances
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            com.getcapacitor.Plugin r1 = (com.getcapacitor.Plugin) r1
            r2.registerPluginInstance(r1)
            goto L30
        L40:
            return
    }

    private void setAllowedOriginRules() {
            r9 = this;
            com.getcapacitor.CapConfig r0 = r9.config
            java.lang.String[] r0 = r0.getAllowNavigation()
            java.lang.String r1 = r9.getHost()
            java.lang.String r2 = r9.getScheme()
            java.util.Set<java.lang.String> r3 = r9.allowedOriginRules
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r5 = "://"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r3.add(r4)
            java.lang.String r3 = r9.getServerUrl()
            if (r3 == 0) goto L39
            java.util.Set<java.lang.String> r3 = r9.allowedOriginRules
            java.lang.String r4 = r9.getServerUrl()
            r3.add(r4)
        L39:
            if (r0 == 0) goto L73
            int r3 = r0.length
            r4 = 0
        L3d:
            if (r4 >= r3) goto L6a
            r5 = r0[r4]
            java.lang.String r6 = "http"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L62
            java.util.Set<java.lang.String> r6 = r9.allowedOriginRules
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "https://"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r7 = r7.toString()
            r6.add(r7)
            goto L67
        L62:
            java.util.Set<java.lang.String> r6 = r9.allowedOriginRules
            r6.add(r5)
        L67:
            int r4 = r4 + 1
            goto L3d
        L6a:
            java.util.ArrayList<java.lang.String> r3 = r9.authorities
            java.util.List r4 = java.util.Arrays.asList(r0)
            r3.addAll(r4)
        L73:
            com.getcapacitor.util.HostMask r3 = com.getcapacitor.util.HostMask.Parser.parse(r0)
            r9.appAllowNavigationMask = r3
            return
    }

    public void addWebViewListener(com.getcapacitor.WebViewListener r2) {
            r1 = this;
            java.util.List<com.getcapacitor.WebViewListener> r0 = r1.webViewListeners
            r0.add(r2)
            return
    }

    public void callPluginMethod(java.lang.String r5, java.lang.String r6, com.getcapacitor.PluginCall r7) {
            r4 = this;
            java.lang.String r0 = "unable to find plugin : "
            com.getcapacitor.PluginHandle r1 = r4.getPlugin(r5)     // Catch: java.lang.Exception -> L87
            if (r1 != 0) goto L31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L87
            r2.<init>()     // Catch: java.lang.Exception -> L87
            java.lang.StringBuilder r2 = r2.append(r0)     // Catch: java.lang.Exception -> L87
            java.lang.StringBuilder r2 = r2.append(r5)     // Catch: java.lang.Exception -> L87
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L87
            com.getcapacitor.Logger.error(r2)     // Catch: java.lang.Exception -> L87
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L87
            r2.<init>()     // Catch: java.lang.Exception -> L87
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Exception -> L87
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch: java.lang.Exception -> L87
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L87
            r7.errorCallback(r0)     // Catch: java.lang.Exception -> L87
            return
        L31:
            boolean r0 = com.getcapacitor.Logger.shouldLog()     // Catch: java.lang.Exception -> L87
            if (r0 == 0) goto L7b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L87
            r0.<init>()     // Catch: java.lang.Exception -> L87
            java.lang.String r2 = "callback: "
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Exception -> L87
            java.lang.String r2 = r7.getCallbackId()     // Catch: java.lang.Exception -> L87
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Exception -> L87
            java.lang.String r2 = ", pluginId: "
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Exception -> L87
            java.lang.String r2 = r1.getId()     // Catch: java.lang.Exception -> L87
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Exception -> L87
            java.lang.String r2 = ", methodName: "
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Exception -> L87
            java.lang.StringBuilder r0 = r0.append(r6)     // Catch: java.lang.Exception -> L87
            java.lang.String r2 = ", methodData: "
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Exception -> L87
            com.getcapacitor.JSObject r2 = r7.getData()     // Catch: java.lang.Exception -> L87
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L87
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Exception -> L87
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L87
            com.getcapacitor.Logger.verbose(r0)     // Catch: java.lang.Exception -> L87
        L7b:
            com.getcapacitor.Bridge$$ExternalSyntheticLambda0 r0 = new com.getcapacitor.Bridge$$ExternalSyntheticLambda0     // Catch: java.lang.Exception -> L87
            r0.<init>(r4, r1, r6, r7)     // Catch: java.lang.Exception -> L87
            android.os.Handler r2 = r4.taskHandler     // Catch: java.lang.Exception -> L87
            r2.post(r0)     // Catch: java.lang.Exception -> L87
            goto Lb2
        L87:
            r0 = move-exception
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "callPluginMethod"
            r1[r2] = r3
            java.lang.String r1 = com.getcapacitor.Logger.tags(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "error : "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r3 = 0
            com.getcapacitor.Logger.error(r1, r2, r3)
            java.lang.String r1 = r0.toString()
            r7.errorCallback(r1)
        Lb2:
            return
    }

    public void eval(java.lang.String r3, android.webkit.ValueCallback<java.lang.String> r4) {
            r2 = this;
            android.os.Handler r0 = new android.os.Handler
            androidx.appcompat.app.AppCompatActivity r1 = r2.context
            android.os.Looper r1 = r1.getMainLooper()
            r0.<init>(r1)
            com.getcapacitor.Bridge$$ExternalSyntheticLambda1 r1 = new com.getcapacitor.Bridge$$ExternalSyntheticLambda1
            r1.<init>(r2, r3, r4)
            r0.post(r1)
            return
    }

    public void execute(java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.taskHandler
            r0.post(r2)
            return
    }

    public void executeOnMainThread(java.lang.Runnable r3) {
            r2 = this;
            android.os.Handler r0 = new android.os.Handler
            androidx.appcompat.app.AppCompatActivity r1 = r2.context
            android.os.Looper r1 = r1.getMainLooper()
            r0.<init>(r1)
            r0.post(r3)
            return
    }

    public androidx.appcompat.app.AppCompatActivity getActivity() {
            r1 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r1.context
            return r0
    }

    public java.util.Set<java.lang.String> getAllowedOriginRules() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.allowedOriginRules
            return r0
    }

    public com.getcapacitor.App getApp() {
            r1 = this;
            com.getcapacitor.App r0 = r1.app
            return r0
    }

    public com.getcapacitor.util.HostMask getAppAllowNavigationMask() {
            r1 = this;
            com.getcapacitor.util.HostMask r0 = r1.appAllowNavigationMask
            return r0
    }

    public java.lang.String getAppUrl() {
            r1 = this;
            java.lang.String r0 = r1.appUrl
            return r0
    }

    public com.getcapacitor.CapConfig getConfig() {
            r1 = this;
            com.getcapacitor.CapConfig r0 = r1.config
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r1.context
            return r0
    }

    public java.lang.String getErrorUrl() {
            r6 = this;
            com.getcapacitor.CapConfig r0 = r6.config
            java.lang.String r0 = r0.getErrorPath()
            if (r0 == 0) goto L49
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L49
            java.lang.String r1 = r6.getHost()
            java.lang.String r2 = r6.getScheme()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r4 = "://"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r5 = "/"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L49:
            r1 = 0
            return r1
    }

    public androidx.fragment.app.Fragment getFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.fragment
            return r0
    }

    public java.lang.String getHost() {
            r1 = this;
            com.getcapacitor.CapConfig r0 = r1.config
            java.lang.String r0 = r0.getHostname()
            return r0
    }

    public android.net.Uri getIntentUri() {
            r1 = this;
            android.net.Uri r0 = r1.intentUri
            return r0
    }

    public com.getcapacitor.WebViewLocalServer getLocalServer() {
            r1 = this;
            com.getcapacitor.WebViewLocalServer r0 = r1.localServer
            return r0
    }

    public java.lang.String getLocalUrl() {
            r1 = this;
            java.lang.String r0 = r1.localUrl
            return r0
    }

    protected com.getcapacitor.PluginCall getPermissionCall(java.lang.String r4) {
            r3 = this;
            java.util.Map<java.lang.String, java.util.LinkedList<java.lang.String>> r0 = r3.savedPermissionCallIds
            java.lang.Object r0 = r0.get(r4)
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.Object r2 = r0.poll()
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
        L12:
            com.getcapacitor.PluginCall r2 = r3.getSavedCall(r1)
            return r2
    }

    protected java.util.Map<java.lang.String, com.getcapacitor.PermissionState> getPermissionStates(com.getcapacitor.Plugin r16) {
            r15 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.getcapacitor.PluginHandle r1 = r16.getPluginHandle()
            com.getcapacitor.annotation.CapacitorPlugin r1 = r1.getPluginAnnotation()
            com.getcapacitor.annotation.Permission[] r2 = r1.permissions()
            int r3 = r2.length
            r4 = 0
            r5 = r4
        L14:
            if (r5 >= r3) goto La0
            r6 = r2[r5]
            java.lang.String[] r7 = r6.strings()
            int r7 = r7.length
            if (r7 == 0) goto L84
            java.lang.String[] r7 = r6.strings()
            int r7 = r7.length
            r8 = 1
            if (r7 != r8) goto L34
            java.lang.String[] r7 = r6.strings()
            r7 = r7[r4]
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L34
            goto L84
        L34:
            java.lang.String[] r7 = r6.strings()
            int r8 = r7.length
            r9 = r4
        L3a:
            if (r9 >= r8) goto L9c
            r10 = r7[r9]
            java.lang.String r11 = r6.alias()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L4a
            r11 = r10
            goto L4e
        L4a:
            java.lang.String r11 = r6.alias()
        L4e:
            android.content.Context r12 = r15.getContext()
            int r12 = androidx.core.app.ActivityCompat.checkSelfPermission(r12, r10)
            if (r12 != 0) goto L5b
            com.getcapacitor.PermissionState r12 = com.getcapacitor.PermissionState.GRANTED
            goto L72
        L5b:
            com.getcapacitor.PermissionState r12 = com.getcapacitor.PermissionState.PROMPT
            android.content.Context r13 = r15.getContext()
            java.lang.String r14 = "PluginPermStates"
            android.content.SharedPreferences r13 = r13.getSharedPreferences(r14, r4)
            r14 = 0
            java.lang.String r14 = r13.getString(r10, r14)
            if (r14 == 0) goto L72
            com.getcapacitor.PermissionState r12 = com.getcapacitor.PermissionState.byState(r14)
        L72:
            java.lang.Object r13 = r0.get(r11)
            com.getcapacitor.PermissionState r13 = (com.getcapacitor.PermissionState) r13
            if (r13 == 0) goto L7e
            com.getcapacitor.PermissionState r14 = com.getcapacitor.PermissionState.GRANTED
            if (r13 != r14) goto L81
        L7e:
            r0.put(r11, r12)
        L81:
            int r9 = r9 + 1
            goto L3a
        L84:
            java.lang.String r7 = r6.alias()
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L9b
            java.lang.Object r8 = r0.get(r7)
            com.getcapacitor.PermissionState r8 = (com.getcapacitor.PermissionState) r8
            if (r8 != 0) goto L9b
            com.getcapacitor.PermissionState r9 = com.getcapacitor.PermissionState.GRANTED
            r0.put(r7, r9)
        L9b:
        L9c:
            int r5 = r5 + 1
            goto L14
        La0:
            return r0
    }

    public com.getcapacitor.PluginHandle getPlugin(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, com.getcapacitor.PluginHandle> r0 = r1.plugins
            java.lang.Object r0 = r0.get(r2)
            com.getcapacitor.PluginHandle r0 = (com.getcapacitor.PluginHandle) r0
            return r0
    }

    com.getcapacitor.PluginCall getPluginCallForLastActivity() {
            r2 = this;
            com.getcapacitor.PluginCall r0 = r2.pluginCallForLastActivity
            r1 = 0
            r2.pluginCallForLastActivity = r1
            return r0
    }

    @java.lang.Deprecated
    public com.getcapacitor.PluginHandle getPluginWithRequestCode(int r9) {
            r8 = this;
            java.util.Map<java.lang.String, com.getcapacitor.PluginHandle> r0 = r8.plugins
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.next()
            com.getcapacitor.PluginHandle r1 = (com.getcapacitor.PluginHandle) r1
            com.getcapacitor.annotation.CapacitorPlugin r2 = r1.getPluginAnnotation()
            r3 = 0
            if (r2 != 0) goto L3b
            com.getcapacitor.NativePlugin r4 = r1.getLegacyPluginAnnotation()
            if (r4 != 0) goto L24
            goto La
        L24:
            int r5 = r4.permissionRequestCode()
            if (r5 != r9) goto L2b
            return r1
        L2b:
            int[] r5 = r4.requestCodes()
            int r6 = r5.length
        L30:
            if (r3 >= r6) goto L3a
            r7 = r5[r3]
            if (r7 != r9) goto L37
            return r1
        L37:
            int r3 = r3 + 1
            goto L30
        L3a:
            goto L4a
        L3b:
            int[] r4 = r2.requestCodes()
            int r5 = r4.length
        L40:
            if (r3 >= r5) goto L4a
            r6 = r4[r3]
            if (r6 != r9) goto L47
            return r1
        L47:
            int r3 = r3 + 1
            goto L40
        L4a:
            goto La
        L4b:
            r0 = 0
            return r0
    }

    com.getcapacitor.RouteProcessor getRouteProcessor() {
            r1 = this;
            com.getcapacitor.RouteProcessor r0 = r1.routeProcessor
            return r0
    }

    public com.getcapacitor.PluginCall getSavedCall(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.util.Map<java.lang.String, com.getcapacitor.PluginCall> r0 = r1.savedCalls
            java.lang.Object r0 = r0.get(r2)
            com.getcapacitor.PluginCall r0 = (com.getcapacitor.PluginCall) r0
            return r0
    }

    public java.lang.String getScheme() {
            r1 = this;
            com.getcapacitor.CapConfig r0 = r1.config
            java.lang.String r0 = r0.getAndroidScheme()
            return r0
    }

    public java.lang.String getServerBasePath() {
            r1 = this;
            com.getcapacitor.WebViewLocalServer r0 = r1.localServer
            java.lang.String r0 = r0.getBasePath()
            return r0
    }

    com.getcapacitor.ServerPath getServerPath() {
            r1 = this;
            com.getcapacitor.ServerPath r0 = r1.serverPath
            return r0
    }

    public java.lang.String getServerUrl() {
            r1 = this;
            com.getcapacitor.CapConfig r0 = r1.config
            java.lang.String r0 = r0.getServerUrl()
            return r0
    }

    public android.webkit.WebView getWebView() {
            r1 = this;
            android.webkit.WebView r0 = r1.webView
            return r0
    }

    public com.getcapacitor.BridgeWebViewClient getWebViewClient() {
            r1 = this;
            com.getcapacitor.BridgeWebViewClient r0 = r1.webViewClient
            return r0
    }

    java.util.List<com.getcapacitor.WebViewListener> getWebViewListeners() {
            r1 = this;
            java.util.List<com.getcapacitor.WebViewListener> r0 = r1.webViewListeners
            return r0
    }

    public void handleAppUrlLoadError(java.lang.Exception r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to load app. Ensure the server is running at "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.appUrl
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", or modify the appUrl setting in capacitor.config.json (make sure to npx cap copy after to commit changes)."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.getcapacitor.Logger.error(r0, r3)
        L22:
            return
    }

    public void injectScriptBeforeLoad(java.lang.String r2) {
            r1 = this;
            java.lang.Boolean r0 = r1.canInjectJS
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld
            java.util.ArrayList<java.lang.String> r0 = r1.miscJSFileInjections
            r0.add(r2)
        Ld:
            return
    }

    public boolean isDeployDisabled() {
            r3 = this;
            org.apache.cordova.CordovaPreferences r0 = r3.preferences
            java.lang.String r1 = "DisableDeploy"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    public boolean isDevMode() {
            r1 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r1.getActivity()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r0 = r0 & 2
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public boolean isMinimumWebViewInstalled() {
            r10 = this;
            java.lang.String r0 = "\\."
            android.content.Context r1 = r10.getContext()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r4 = 1
            r5 = 0
            if (r2 < r3) goto L51
            android.content.pm.PackageInfo r0 = android.webkit.WebView.getCurrentWebViewPackage()
            java.lang.String r2 = "(\\d+)"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r3 = r0.versionName
            java.util.regex.Matcher r3 = r2.matcher(r3)
            boolean r6 = r3.find()
            if (r6 == 0) goto L50
            java.lang.String r6 = r3.group(r5)
            int r7 = java.lang.Integer.parseInt(r6)
            java.lang.String r8 = r0.packageName
            java.lang.String r9 = "com.huawei.webview"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L45
            com.getcapacitor.CapConfig r8 = r10.config
            int r8 = r8.getMinHuaweiWebViewVersion()
            if (r7 < r8) goto L43
            goto L44
        L43:
            r4 = r5
        L44:
            return r4
        L45:
            com.getcapacitor.CapConfig r8 = r10.config
            int r8 = r8.getMinWebViewVersion()
            if (r7 < r8) goto L4e
            goto L4f
        L4e:
            r4 = r5
        L4f:
            return r4
        L50:
            return r5
        L51:
            java.lang.String r2 = "com.android.chrome"
            android.content.pm.PackageInfo r2 = com.getcapacitor.util.InternalUtils.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> L6e
            java.lang.String r3 = r2.versionName     // Catch: java.lang.Exception -> L6e
            java.lang.String[] r3 = r3.split(r0)     // Catch: java.lang.Exception -> L6e
            r3 = r3[r5]     // Catch: java.lang.Exception -> L6e
            int r6 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L6e
            com.getcapacitor.CapConfig r7 = r10.config     // Catch: java.lang.Exception -> L6e
            int r0 = r7.getMinWebViewVersion()     // Catch: java.lang.Exception -> L6e
            if (r6 < r0) goto L6c
            goto L6d
        L6c:
            r4 = r5
        L6d:
            return r4
        L6e:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Unable to get package info for 'com.google.android.webview'"
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r6 = r2.toString()
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.getcapacitor.Logger.warn(r3)
            java.lang.String r2 = "com.android.webview"
            android.content.pm.PackageInfo r2 = com.getcapacitor.util.InternalUtils.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> La6
            java.lang.String r3 = r2.versionName     // Catch: java.lang.Exception -> La6
            java.lang.String[] r0 = r3.split(r0)     // Catch: java.lang.Exception -> La6
            r0 = r0[r5]     // Catch: java.lang.Exception -> La6
            int r3 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> La6
            com.getcapacitor.CapConfig r6 = r10.config     // Catch: java.lang.Exception -> La6
            int r6 = r6.getMinWebViewVersion()     // Catch: java.lang.Exception -> La6
            if (r3 < r6) goto La4
            goto La5
        La4:
            r4 = r5
        La5:
            return r4
        La6:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to get package info for 'com.android.webview'"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.getcapacitor.Logger.warn(r2)
            java.lang.String r0 = "com.amazon.webview.chromium"
            int r0 = r10.extractWebViewMajorVersion(r1, r0)
            com.getcapacitor.CapConfig r2 = r10.config
            int r2 = r2.getMinWebViewVersion()
            if (r0 < r2) goto Ld0
            return r4
        Ld0:
            return r5
    }

    public boolean launchIntent(android.net.Uri r5) {
            r4 = this;
            java.util.Map<java.lang.String, com.getcapacitor.PluginHandle> r0 = r4.plugins
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.getcapacitor.PluginHandle r2 = (com.getcapacitor.PluginHandle) r2
            com.getcapacitor.Plugin r2 = r2.getInstance()
            if (r2 == 0) goto L2d
            java.lang.Boolean r3 = r2.shouldOverrideLoad(r5)
            if (r3 == 0) goto L2d
            boolean r0 = r3.booleanValue()
            return r0
        L2d:
            goto La
        L2e:
            java.lang.String r0 = r5.getScheme()
            java.lang.String r1 = "data"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L8a
            java.lang.String r0 = r5.getScheme()
            java.lang.String r2 = "blob"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L48
            goto L8a
        L48:
            java.lang.String r0 = r4.appUrl
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r2 = r0.getHost()
            java.lang.String r3 = r5.getHost()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L6b
            java.lang.String r2 = r5.getScheme()
            java.lang.String r3 = r0.getScheme()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L89
        L6b:
            com.getcapacitor.util.HostMask r2 = r4.appAllowNavigationMask
            java.lang.String r3 = r5.getHost()
            boolean r2 = r2.matches(r3)
            if (r2 != 0) goto L89
            android.content.Intent r1 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L86
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2, r5)     // Catch: android.content.ActivityNotFoundException -> L86
            android.content.Context r2 = r4.getContext()     // Catch: android.content.ActivityNotFoundException -> L86
            r2.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L86
            goto L87
        L86:
            r1 = move-exception
        L87:
            r1 = 1
            return r1
        L89:
            return r1
        L8a:
            return r1
    }

    public void logToJs(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "log"
            r1.logToJs(r2, r0)
            return
    }

    public void logToJs(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "window.Capacitor.logJs(\""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = "\", \""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = "\")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2.eval(r0, r1)
            return
    }

    boolean onActivityResult(int r5, int r6, android.content.Intent r7) {
            r4 = this;
            com.getcapacitor.PluginHandle r0 = r4.getPluginWithRequestCode(r5)
            if (r0 == 0) goto L30
            com.getcapacitor.Plugin r1 = r0.getInstance()
            if (r1 != 0) goto Ld
            goto L30
        Ld:
            com.getcapacitor.Plugin r1 = r0.getInstance()
            com.getcapacitor.PluginCall r1 = r1.getSavedCall()
            if (r1 != 0) goto L24
            com.getcapacitor.PluginCall r2 = r4.pluginCallForLastActivity
            if (r2 == 0) goto L24
            com.getcapacitor.Plugin r2 = r0.getInstance()
            com.getcapacitor.PluginCall r3 = r4.pluginCallForLastActivity
            r2.saveCall(r3)
        L24:
            com.getcapacitor.Plugin r2 = r0.getInstance()
            r2.handleOnActivityResult(r5, r6, r7)
            r2 = 0
            r4.pluginCallForLastActivity = r2
            r2 = 1
            return r2
        L30:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to find a Capacitor plugin to handle requestCode, trying Cordova plugins "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.getcapacitor.Logger.debug(r1)
            com.getcapacitor.cordova.MockCordovaInterfaceImpl r1 = r4.cordovaInterface
            boolean r1 = r1.onActivityResult(r5, r6, r7)
            return r1
    }

    public void onConfigurationChanged(android.content.res.Configuration r4) {
            r3 = this;
            java.util.Map<java.lang.String, com.getcapacitor.PluginHandle> r0 = r3.plugins
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            com.getcapacitor.PluginHandle r1 = (com.getcapacitor.PluginHandle) r1
            com.getcapacitor.Plugin r2 = r1.getInstance()
            r2.handleOnConfigurationChanged(r4)
            goto La
        L1e:
            return
    }

    public void onDestroy() {
            r3 = this;
            java.util.Map<java.lang.String, com.getcapacitor.PluginHandle> r0 = r3.plugins
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            com.getcapacitor.PluginHandle r1 = (com.getcapacitor.PluginHandle) r1
            com.getcapacitor.Plugin r2 = r1.getInstance()
            r2.handleOnDestroy()
            goto La
        L1e:
            android.os.HandlerThread r0 = r3.handlerThread
            r0.quitSafely()
            org.apache.cordova.CordovaWebView r0 = r3.cordovaWebView
            if (r0 == 0) goto L2c
            org.apache.cordova.CordovaWebView r0 = r3.cordovaWebView
            r0.handleDestroy()
        L2c:
            return
    }

    public void onDetachedFromWindow() {
            r1 = this;
            android.webkit.WebView r0 = r1.webView
            r0.removeAllViews()
            android.webkit.WebView r0 = r1.webView
            r0.destroy()
            return
    }

    public void onNewIntent(android.content.Intent r4) {
            r3 = this;
            java.util.Map<java.lang.String, com.getcapacitor.PluginHandle> r0 = r3.plugins
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            com.getcapacitor.PluginHandle r1 = (com.getcapacitor.PluginHandle) r1
            com.getcapacitor.Plugin r2 = r1.getInstance()
            r2.handleOnNewIntent(r4)
            goto La
        L1e:
            org.apache.cordova.CordovaWebView r0 = r3.cordovaWebView
            if (r0 == 0) goto L27
            org.apache.cordova.CordovaWebView r0 = r3.cordovaWebView
            r0.onNewIntent(r4)
        L27:
            return
    }

    public void onPause() {
            r3 = this;
            java.util.Map<java.lang.String, com.getcapacitor.PluginHandle> r0 = r3.plugins
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            com.getcapacitor.PluginHandle r1 = (com.getcapacitor.PluginHandle) r1
            com.getcapacitor.Plugin r2 = r1.getInstance()
            r2.handleOnPause()
            goto La
        L1e:
            org.apache.cordova.CordovaWebView r0 = r3.cordovaWebView
            if (r0 == 0) goto L39
            boolean r0 = r3.shouldKeepRunning()
            if (r0 != 0) goto L33
            com.getcapacitor.cordova.MockCordovaInterfaceImpl r0 = r3.cordovaInterface
            org.apache.cordova.CordovaPlugin r0 = r0.getActivityResultCallback()
            if (r0 == 0) goto L31
            goto L33
        L31:
            r0 = 0
            goto L34
        L33:
            r0 = 1
        L34:
            org.apache.cordova.CordovaWebView r1 = r3.cordovaWebView
            r1.handlePause(r0)
        L39:
            return
    }

    boolean onRequestPermissionsResult(int r6, java.lang.String[] r7, int[] r8) {
            r5 = this;
            com.getcapacitor.PluginHandle r0 = r5.getPluginWithRequestCode(r6)
            if (r0 != 0) goto L41
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to find a Capacitor plugin to handle permission requestCode, trying Cordova plugins "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.getcapacitor.Logger.debug(r2)
            com.getcapacitor.cordova.MockCordovaInterfaceImpl r2 = r5.cordovaInterface     // Catch: org.json.JSONException -> L25
            boolean r2 = r2.handlePermissionResult(r6, r7, r8)     // Catch: org.json.JSONException -> L25
            r1 = r2
            goto L40
        L25:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error on Cordova plugin permissions request "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r2.getMessage()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.getcapacitor.Logger.debug(r3)
        L40:
            return r1
        L41:
            com.getcapacitor.annotation.CapacitorPlugin r1 = r0.getPluginAnnotation()
            if (r1 != 0) goto L50
            com.getcapacitor.Plugin r1 = r0.getInstance()
            r1.handleRequestPermissionsResult(r6, r7, r8)
            r1 = 1
            return r1
        L50:
            r1 = 0
            return r1
    }

    public void onRestart() {
            r3 = this;
            java.util.Map<java.lang.String, com.getcapacitor.PluginHandle> r0 = r3.plugins
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            com.getcapacitor.PluginHandle r1 = (com.getcapacitor.PluginHandle) r1
            com.getcapacitor.Plugin r2 = r1.getInstance()
            r2.handleOnRestart()
            goto La
        L1e:
            return
    }

    public void onResume() {
            r3 = this;
            java.util.Map<java.lang.String, com.getcapacitor.PluginHandle> r0 = r3.plugins
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            com.getcapacitor.PluginHandle r1 = (com.getcapacitor.PluginHandle) r1
            com.getcapacitor.Plugin r2 = r1.getInstance()
            r2.handleOnResume()
            goto La
        L1e:
            org.apache.cordova.CordovaWebView r0 = r3.cordovaWebView
            if (r0 == 0) goto L2b
            org.apache.cordova.CordovaWebView r0 = r3.cordovaWebView
            boolean r1 = r3.shouldKeepRunning()
            r0.handleResume(r1)
        L2b:
            return
    }

    public void onStart() {
            r3 = this;
            java.util.Map<java.lang.String, com.getcapacitor.PluginHandle> r0 = r3.plugins
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            com.getcapacitor.PluginHandle r1 = (com.getcapacitor.PluginHandle) r1
            com.getcapacitor.Plugin r2 = r1.getInstance()
            r2.handleOnStart()
            goto La
        L1e:
            org.apache.cordova.CordovaWebView r0 = r3.cordovaWebView
            if (r0 == 0) goto L27
            org.apache.cordova.CordovaWebView r0 = r3.cordovaWebView
            r0.handleStart()
        L27:
            return
    }

    public void onStop() {
            r3 = this;
            java.util.Map<java.lang.String, com.getcapacitor.PluginHandle> r0 = r3.plugins
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            com.getcapacitor.PluginHandle r1 = (com.getcapacitor.PluginHandle) r1
            com.getcapacitor.Plugin r2 = r1.getInstance()
            r2.handleOnStop()
            goto La
        L1e:
            org.apache.cordova.CordovaWebView r0 = r3.cordovaWebView
            if (r0 == 0) goto L27
            org.apache.cordova.CordovaWebView r0 = r3.cordovaWebView
            r0.handleStop()
        L27:
            return
    }

    public <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> r2, androidx.activity.result.ActivityResultCallback<O> r3) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.fragment
            if (r0 == 0) goto Lb
            androidx.fragment.app.Fragment r0 = r1.fragment
            androidx.activity.result.ActivityResultLauncher r0 = r0.registerForActivityResult(r2, r3)
            return r0
        Lb:
            androidx.appcompat.app.AppCompatActivity r0 = r1.context
            androidx.activity.result.ActivityResultLauncher r0 = r0.registerForActivityResult(r2, r3)
            return r0
    }

    public void registerPlugin(java.lang.Class<? extends com.getcapacitor.Plugin> r4) {
            r3 = this;
            java.lang.String r0 = r3.pluginId(r4)
            if (r0 != 0) goto L7
            return
        L7:
            java.util.Map<java.lang.String, com.getcapacitor.PluginHandle> r1 = r3.plugins     // Catch: com.getcapacitor.PluginLoadException -> L12 com.getcapacitor.InvalidPluginException -> L17
            com.getcapacitor.PluginHandle r2 = new com.getcapacitor.PluginHandle     // Catch: com.getcapacitor.PluginLoadException -> L12 com.getcapacitor.InvalidPluginException -> L17
            r2.<init>(r3, r4)     // Catch: com.getcapacitor.PluginLoadException -> L12 com.getcapacitor.InvalidPluginException -> L17
            r1.put(r0, r2)     // Catch: com.getcapacitor.PluginLoadException -> L12 com.getcapacitor.InvalidPluginException -> L17
            goto L1b
        L12:
            r1 = move-exception
            r3.logPluginLoadException(r4, r1)
            goto L1c
        L17:
            r1 = move-exception
            r3.logInvalidPluginException(r4)
        L1b:
        L1c:
            return
    }

    public void registerPluginInstance(com.getcapacitor.Plugin r5) {
            r4 = this;
            java.lang.Class r0 = r5.getClass()
            java.lang.String r1 = r4.pluginId(r0)
            if (r1 != 0) goto Lb
            return
        Lb:
            java.util.Map<java.lang.String, com.getcapacitor.PluginHandle> r2 = r4.plugins     // Catch: com.getcapacitor.InvalidPluginException -> L16
            com.getcapacitor.PluginHandle r3 = new com.getcapacitor.PluginHandle     // Catch: com.getcapacitor.InvalidPluginException -> L16
            r3.<init>(r4, r5)     // Catch: com.getcapacitor.InvalidPluginException -> L16
            r2.put(r1, r3)     // Catch: com.getcapacitor.InvalidPluginException -> L16
            goto L1a
        L16:
            r2 = move-exception
            r4.logInvalidPluginException(r0)
        L1a:
            return
    }

    public void registerPluginInstances(com.getcapacitor.Plugin[] r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r4[r1]
            r3.registerPluginInstance(r2)
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }

    public void registerPlugins(java.lang.Class<? extends com.getcapacitor.Plugin>[] r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r4[r1]
            r3.registerPlugin(r2)
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }

    public void releaseCall(com.getcapacitor.PluginCall r2) {
            r1 = this;
            java.lang.String r0 = r2.getCallbackId()
            r1.releaseCall(r0)
            return
    }

    public void releaseCall(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, com.getcapacitor.PluginCall> r0 = r1.savedCalls
            r0.remove(r2)
            return
    }

    public void reload() {
            r2 = this;
            android.webkit.WebView r0 = r2.webView
            com.getcapacitor.Bridge$$ExternalSyntheticLambda5 r1 = new com.getcapacitor.Bridge$$ExternalSyntheticLambda5
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    public void removeWebViewListener(com.getcapacitor.WebViewListener r2) {
            r1 = this;
            java.util.List<com.getcapacitor.WebViewListener> r0 = r1.webViewListeners
            r0.remove(r2)
            return
    }

    public void reset() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.savedCalls = r0
            java.util.Map<java.lang.String, com.getcapacitor.PluginHandle> r0 = r3.plugins
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            com.getcapacitor.PluginHandle r1 = (com.getcapacitor.PluginHandle) r1
            com.getcapacitor.Plugin r2 = r1.getInstance()
            r2.removeAllListeners()
            goto L11
        L25:
            return
    }

    public void restoreInstanceState(android.os.Bundle r9) {
            r8 = this;
            java.lang.String r0 = "capacitorLastActivityPluginId"
            java.lang.String r3 = r9.getString(r0)
            java.lang.String r0 = "capacitorLastActivityPluginMethod"
            java.lang.String r5 = r9.getString(r0)
            java.lang.String r0 = "capacitorLastPluginCallOptions"
            java.lang.String r7 = r9.getString(r0)
            if (r3 == 0) goto L48
            if (r7 == 0) goto L2d
            com.getcapacitor.JSObject r6 = new com.getcapacitor.JSObject     // Catch: org.json.JSONException -> L27
            r6.<init>(r7)     // Catch: org.json.JSONException -> L27
            com.getcapacitor.PluginCall r1 = new com.getcapacitor.PluginCall     // Catch: org.json.JSONException -> L27
            com.getcapacitor.MessageHandler r2 = r8.msgHandler     // Catch: org.json.JSONException -> L27
            java.lang.String r4 = "-1"
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: org.json.JSONException -> L27
            r8.pluginCallForLastActivity = r1     // Catch: org.json.JSONException -> L27
            goto L2d
        L27:
            r0 = move-exception
            java.lang.String r1 = "Unable to restore plugin call, unable to parse persisted JSON object"
            com.getcapacitor.Logger.error(r1, r0)
        L2d:
            java.lang.String r0 = "capacitorLastPluginCallBundle"
            android.os.Bundle r0 = r9.getBundle(r0)
            com.getcapacitor.PluginHandle r1 = r8.getPlugin(r3)
            if (r0 == 0) goto L43
            if (r1 == 0) goto L43
            com.getcapacitor.Plugin r2 = r1.getInstance()
            r2.restoreState(r0)
            goto L48
        L43:
            java.lang.String r2 = "Unable to restore last plugin call"
            com.getcapacitor.Logger.error(r2)
        L48:
            return
    }

    public void saveCall(com.getcapacitor.PluginCall r3) {
            r2 = this;
            java.util.Map<java.lang.String, com.getcapacitor.PluginCall> r0 = r2.savedCalls
            java.lang.String r1 = r3.getCallbackId()
            r0.put(r1, r3)
            return
    }

    public void saveInstanceState(android.os.Bundle r6) {
            r5 = this;
            java.lang.String r0 = "Saving instance state!"
            com.getcapacitor.Logger.debug(r0)
            com.getcapacitor.PluginCall r0 = r5.pluginCallForLastActivity
            if (r0 == 0) goto L72
            com.getcapacitor.PluginCall r0 = r5.pluginCallForLastActivity
            java.lang.String r1 = r0.getPluginId()
            com.getcapacitor.PluginHandle r1 = r5.getPlugin(r1)
            if (r1 == 0) goto L72
            com.getcapacitor.Plugin r2 = r1.getInstance()
            android.os.Bundle r2 = r2.saveInstanceState()
            if (r2 == 0) goto L44
            java.lang.String r3 = "capacitorLastActivityPluginId"
            java.lang.String r4 = r0.getPluginId()
            r6.putString(r3, r4)
            java.lang.String r3 = "capacitorLastActivityPluginMethod"
            java.lang.String r4 = r0.getMethodName()
            r6.putString(r3, r4)
            com.getcapacitor.JSObject r3 = r0.getData()
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "capacitorLastPluginCallOptions"
            r6.putString(r4, r3)
            java.lang.String r3 = "capacitorLastPluginCallBundle"
            r6.putBundle(r3, r2)
            goto L72
        L44:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Couldn't save last "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r0.getPluginId()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "'s Plugin "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r0.getMethodName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " call"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.getcapacitor.Logger.error(r3)
        L72:
            return
    }

    protected void savePermissionCall(com.getcapacitor.PluginCall r4) {
            r3 = this;
            if (r4 == 0) goto L32
            java.util.Map<java.lang.String, java.util.LinkedList<java.lang.String>> r0 = r3.savedPermissionCallIds
            java.lang.String r1 = r4.getPluginId()
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L1c
            java.util.Map<java.lang.String, java.util.LinkedList<java.lang.String>> r0 = r3.savedPermissionCallIds
            java.lang.String r1 = r4.getPluginId()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r0.put(r1, r2)
        L1c:
            java.util.Map<java.lang.String, java.util.LinkedList<java.lang.String>> r0 = r3.savedPermissionCallIds
            java.lang.String r1 = r4.getPluginId()
            java.lang.Object r0 = r0.get(r1)
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            java.lang.String r1 = r4.getCallbackId()
            r0.add(r1)
            r3.saveCall(r4)
        L32:
            return
    }

    protected void setCordovaWebView(org.apache.cordova.CordovaWebView r1) {
            r0 = this;
            r0.cordovaWebView = r1
            return
    }

    void setPluginCallForLastActivity(com.getcapacitor.PluginCall r1) {
            r0 = this;
            r0.pluginCallForLastActivity = r1
            return
    }

    void setRouteProcessor(com.getcapacitor.RouteProcessor r1) {
            r0 = this;
            r0.routeProcessor = r1
            return
    }

    public void setServerAssetPath(java.lang.String r3) {
            r2 = this;
            com.getcapacitor.WebViewLocalServer r0 = r2.localServer
            r0.hostAssets(r3)
            android.webkit.WebView r0 = r2.webView
            com.getcapacitor.Bridge$$ExternalSyntheticLambda6 r1 = new com.getcapacitor.Bridge$$ExternalSyntheticLambda6
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    public void setServerBasePath(java.lang.String r3) {
            r2 = this;
            com.getcapacitor.WebViewLocalServer r0 = r2.localServer
            r0.hostFiles(r3)
            android.webkit.WebView r0 = r2.webView
            com.getcapacitor.Bridge$$ExternalSyntheticLambda3 r1 = new com.getcapacitor.Bridge$$ExternalSyntheticLambda3
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    public void setWebViewClient(com.getcapacitor.BridgeWebViewClient r2) {
            r1 = this;
            r1.webViewClient = r2
            android.webkit.WebView r0 = r1.webView
            r0.setWebViewClient(r2)
            return
    }

    void setWebViewListeners(java.util.List<com.getcapacitor.WebViewListener> r1) {
            r0 = this;
            r0.webViewListeners = r1
            return
    }

    public boolean shouldKeepRunning() {
            r3 = this;
            org.apache.cordova.CordovaPreferences r0 = r3.preferences
            java.lang.String r1 = "KeepRunning"
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public void startActivityForPluginWithResult(com.getcapacitor.PluginCall r2, android.content.Intent r3, int r4) {
            r1 = this;
            java.lang.String r0 = "Starting activity for result"
            com.getcapacitor.Logger.debug(r0)
            r1.pluginCallForLastActivity = r2
            androidx.appcompat.app.AppCompatActivity r0 = r1.getActivity()
            r0.startActivityForResult(r3, r4)
            return
    }

    public void triggerDocumentJSEvent(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "document"
            r1.triggerJSEvent(r2, r0)
            return
    }

    public void triggerDocumentJSEvent(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "document"
            r1.triggerJSEvent(r2, r0, r3)
            return
    }

    public void triggerJSEvent(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "window.Capacitor.triggerEvent(\""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = "\", \""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = "\")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.getcapacitor.Bridge$$ExternalSyntheticLambda2 r1 = new com.getcapacitor.Bridge$$ExternalSyntheticLambda2
            r1.<init>()
            r2.eval(r0, r1)
            return
    }

    public void triggerJSEvent(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "window.Capacitor.triggerEvent(\""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = "\", \""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = "\", "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.getcapacitor.Bridge$$ExternalSyntheticLambda4 r1 = new com.getcapacitor.Bridge$$ExternalSyntheticLambda4
            r1.<init>()
            r2.eval(r0, r1)
            return
    }

    public void triggerWindowJSEvent(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "window"
            r1.triggerJSEvent(r2, r0)
            return
    }

    public void triggerWindowJSEvent(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "window"
            r1.triggerJSEvent(r2, r0, r3)
            return
    }

    protected boolean validatePermissions(com.getcapacitor.Plugin r11, com.getcapacitor.PluginCall r12, java.util.Map<java.lang.String, java.lang.Boolean> r13) {
            r10 = this;
            android.content.Context r0 = r10.getContext()
            java.lang.String r1 = "PluginPermStates"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.util.Set r1 = r13.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L68
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r3.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L43
            r6 = 0
            java.lang.String r6 = r0.getString(r4, r6)
            if (r6 == 0) goto L42
            android.content.SharedPreferences$Editor r7 = r0.edit()
            r7.remove(r4)
            r7.apply()
        L42:
            goto L67
        L43:
            android.content.SharedPreferences$Editor r6 = r0.edit()
            androidx.appcompat.app.AppCompatActivity r7 = r10.getActivity()
            boolean r7 = androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(r7, r4)
            if (r7 == 0) goto L5b
            com.getcapacitor.PermissionState r7 = com.getcapacitor.PermissionState.PROMPT_WITH_RATIONALE
            java.lang.String r7 = r7.toString()
            r6.putString(r4, r7)
            goto L64
        L5b:
            com.getcapacitor.PermissionState r7 = com.getcapacitor.PermissionState.DENIED
            java.lang.String r7 = r7.toString()
            r6.putString(r4, r7)
        L64:
            r6.apply()
        L67:
            goto L13
        L68:
            java.util.Set r1 = r13.keySet()
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r3)
            java.lang.String[] r1 = (java.lang.String[]) r1
            android.content.Context r3 = r10.getContext()
            boolean r3 = com.getcapacitor.util.PermissionHelper.hasDefinedPermissions(r3, r1)
            if (r3 != 0) goto Lb7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Missing the following permissions in AndroidManifest.xml:\n"
            r3.append(r4)
            android.content.Context r4 = r10.getContext()
            java.lang.String[] r4 = com.getcapacitor.util.PermissionHelper.getUndefinedPermissions(r4, r1)
            int r5 = r4.length
            r6 = r2
        L92:
            if (r6 >= r5) goto Laf
            r7 = r4[r6]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r8 = r8.append(r7)
            java.lang.String r9 = "\n"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r3.append(r8)
            int r6 = r6 + 1
            goto L92
        Laf:
            java.lang.String r5 = r3.toString()
            r12.reject(r5)
            return r2
        Lb7:
            r2 = 1
            return r2
    }
}
