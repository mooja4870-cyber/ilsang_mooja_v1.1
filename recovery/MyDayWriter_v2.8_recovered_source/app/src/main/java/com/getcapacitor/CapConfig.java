package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class CapConfig {
    private static final java.lang.String LOG_BEHAVIOR_DEBUG = "debug";
    private static final java.lang.String LOG_BEHAVIOR_NONE = "none";
    private static final java.lang.String LOG_BEHAVIOR_PRODUCTION = "production";
    private boolean allowMixedContent;
    private java.lang.String[] allowNavigation;
    private java.lang.String androidScheme;
    private java.lang.String appendedUserAgentString;
    private java.lang.String backgroundColor;
    private boolean captureInput;
    private org.json.JSONObject configJSON;
    private java.lang.String errorPath;
    private java.lang.String hostname;
    private boolean html5mode;
    private boolean initialFocus;
    private boolean loggingEnabled;
    private int minHuaweiWebViewVersion;
    private int minWebViewVersion;
    private java.lang.String overriddenUserAgentString;
    private java.util.Map<java.lang.String, com.getcapacitor.PluginConfig> pluginsConfiguration;
    private boolean resolveServiceWorkerRequests;
    private java.lang.String serverUrl;
    private java.lang.String startPath;
    private boolean useLegacyBridge;
    private boolean webContentsDebuggingEnabled;
    private boolean zoomableWebView;

    public static class Builder {
        private boolean allowMixedContent;
        private java.lang.String[] allowNavigation;
        private java.lang.String androidScheme;
        private java.lang.String appendedUserAgentString;
        private java.lang.String backgroundColor;
        private boolean captureInput;
        private android.content.Context context;
        private java.lang.String errorPath;
        private java.lang.String hostname;
        private boolean html5mode;
        private boolean initialFocus;
        private boolean loggingEnabled;
        private int minHuaweiWebViewVersion;
        private int minWebViewVersion;
        private java.lang.String overriddenUserAgentString;
        private java.util.Map<java.lang.String, com.getcapacitor.PluginConfig> pluginsConfiguration;
        private boolean resolveServiceWorkerRequests;
        private java.lang.String serverUrl;
        private java.lang.String startPath;
        private boolean useLegacyBridge;
        private java.lang.Boolean webContentsDebuggingEnabled;
        private boolean zoomableWebView;

        /* JADX INFO: renamed from: -$$Nest$fgetallowMixedContent, reason: not valid java name */
        static /* bridge */ /* synthetic */ boolean m106$$Nest$fgetallowMixedContent(com.getcapacitor.CapConfig.Builder r0) {
                boolean r0 = r0.allowMixedContent
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetallowNavigation, reason: not valid java name */
        static /* bridge */ /* synthetic */ java.lang.String[] m107$$Nest$fgetallowNavigation(com.getcapacitor.CapConfig.Builder r0) {
                java.lang.String[] r0 = r0.allowNavigation
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetandroidScheme, reason: not valid java name */
        static /* bridge */ /* synthetic */ java.lang.String m108$$Nest$fgetandroidScheme(com.getcapacitor.CapConfig.Builder r0) {
                java.lang.String r0 = r0.androidScheme
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetappendedUserAgentString, reason: not valid java name */
        static /* bridge */ /* synthetic */ java.lang.String m109$$Nest$fgetappendedUserAgentString(com.getcapacitor.CapConfig.Builder r0) {
                java.lang.String r0 = r0.appendedUserAgentString
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetbackgroundColor, reason: not valid java name */
        static /* bridge */ /* synthetic */ java.lang.String m110$$Nest$fgetbackgroundColor(com.getcapacitor.CapConfig.Builder r0) {
                java.lang.String r0 = r0.backgroundColor
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetcaptureInput, reason: not valid java name */
        static /* bridge */ /* synthetic */ boolean m111$$Nest$fgetcaptureInput(com.getcapacitor.CapConfig.Builder r0) {
                boolean r0 = r0.captureInput
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgeterrorPath, reason: not valid java name */
        static /* bridge */ /* synthetic */ java.lang.String m112$$Nest$fgeterrorPath(com.getcapacitor.CapConfig.Builder r0) {
                java.lang.String r0 = r0.errorPath
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgethostname, reason: not valid java name */
        static /* bridge */ /* synthetic */ java.lang.String m113$$Nest$fgethostname(com.getcapacitor.CapConfig.Builder r0) {
                java.lang.String r0 = r0.hostname
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgethtml5mode, reason: not valid java name */
        static /* bridge */ /* synthetic */ boolean m114$$Nest$fgethtml5mode(com.getcapacitor.CapConfig.Builder r0) {
                boolean r0 = r0.html5mode
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetinitialFocus, reason: not valid java name */
        static /* bridge */ /* synthetic */ boolean m115$$Nest$fgetinitialFocus(com.getcapacitor.CapConfig.Builder r0) {
                boolean r0 = r0.initialFocus
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetloggingEnabled, reason: not valid java name */
        static /* bridge */ /* synthetic */ boolean m116$$Nest$fgetloggingEnabled(com.getcapacitor.CapConfig.Builder r0) {
                boolean r0 = r0.loggingEnabled
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetminHuaweiWebViewVersion, reason: not valid java name */
        static /* bridge */ /* synthetic */ int m117$$Nest$fgetminHuaweiWebViewVersion(com.getcapacitor.CapConfig.Builder r0) {
                int r0 = r0.minHuaweiWebViewVersion
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetminWebViewVersion, reason: not valid java name */
        static /* bridge */ /* synthetic */ int m118$$Nest$fgetminWebViewVersion(com.getcapacitor.CapConfig.Builder r0) {
                int r0 = r0.minWebViewVersion
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetoverriddenUserAgentString, reason: not valid java name */
        static /* bridge */ /* synthetic */ java.lang.String m119$$Nest$fgetoverriddenUserAgentString(com.getcapacitor.CapConfig.Builder r0) {
                java.lang.String r0 = r0.overriddenUserAgentString
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetpluginsConfiguration, reason: not valid java name */
        static /* bridge */ /* synthetic */ java.util.Map m120$$Nest$fgetpluginsConfiguration(com.getcapacitor.CapConfig.Builder r0) {
                java.util.Map<java.lang.String, com.getcapacitor.PluginConfig> r0 = r0.pluginsConfiguration
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetresolveServiceWorkerRequests, reason: not valid java name */
        static /* bridge */ /* synthetic */ boolean m121$$Nest$fgetresolveServiceWorkerRequests(com.getcapacitor.CapConfig.Builder r0) {
                boolean r0 = r0.resolveServiceWorkerRequests
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetserverUrl, reason: not valid java name */
        static /* bridge */ /* synthetic */ java.lang.String m122$$Nest$fgetserverUrl(com.getcapacitor.CapConfig.Builder r0) {
                java.lang.String r0 = r0.serverUrl
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetstartPath, reason: not valid java name */
        static /* bridge */ /* synthetic */ java.lang.String m123$$Nest$fgetstartPath(com.getcapacitor.CapConfig.Builder r0) {
                java.lang.String r0 = r0.startPath
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetuseLegacyBridge, reason: not valid java name */
        static /* bridge */ /* synthetic */ boolean m124$$Nest$fgetuseLegacyBridge(com.getcapacitor.CapConfig.Builder r0) {
                boolean r0 = r0.useLegacyBridge
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetwebContentsDebuggingEnabled, reason: not valid java name */
        static /* bridge */ /* synthetic */ java.lang.Boolean m125$$Nest$fgetwebContentsDebuggingEnabled(com.getcapacitor.CapConfig.Builder r0) {
                java.lang.Boolean r0 = r0.webContentsDebuggingEnabled
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetzoomableWebView, reason: not valid java name */
        static /* bridge */ /* synthetic */ boolean m126$$Nest$fgetzoomableWebView(com.getcapacitor.CapConfig.Builder r0) {
                boolean r0 = r0.zoomableWebView
                return r0
        }

        public Builder(android.content.Context r5) {
                r4 = this;
                r4.<init>()
                r0 = 1
                r4.html5mode = r0
                java.lang.String r1 = "localhost"
                r4.hostname = r1
                java.lang.String r1 = "https"
                r4.androidScheme = r1
                r1 = 0
                r4.allowMixedContent = r1
                r4.captureInput = r1
                r2 = 0
                r4.webContentsDebuggingEnabled = r2
                r4.loggingEnabled = r0
                r4.initialFocus = r1
                r4.useLegacyBridge = r1
                r3 = 60
                r4.minWebViewVersion = r3
                r3 = 10
                r4.minHuaweiWebViewVersion = r3
                r4.zoomableWebView = r1
                r4.resolveServiceWorkerRequests = r0
                r4.startPath = r2
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r4.pluginsConfiguration = r0
                r4.context = r5
                return
        }

        public com.getcapacitor.CapConfig create() {
                r2 = this;
                java.lang.Boolean r0 = r2.webContentsDebuggingEnabled
                if (r0 != 0) goto L19
                android.content.Context r0 = r2.context
                android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
                int r0 = r0.flags
                r0 = r0 & 2
                if (r0 == 0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r2.webContentsDebuggingEnabled = r0
            L19:
                com.getcapacitor.CapConfig r0 = new com.getcapacitor.CapConfig
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.getcapacitor.CapConfig.Builder setAllowMixedContent(boolean r1) {
                r0 = this;
                r0.allowMixedContent = r1
                return r0
        }

        public com.getcapacitor.CapConfig.Builder setAllowNavigation(java.lang.String[] r1) {
                r0 = this;
                r0.allowNavigation = r1
                return r0
        }

        public com.getcapacitor.CapConfig.Builder setAndroidScheme(java.lang.String r1) {
                r0 = this;
                r0.androidScheme = r1
                return r0
        }

        public com.getcapacitor.CapConfig.Builder setAppendedUserAgentString(java.lang.String r1) {
                r0 = this;
                r0.appendedUserAgentString = r1
                return r0
        }

        public com.getcapacitor.CapConfig.Builder setBackgroundColor(java.lang.String r1) {
                r0 = this;
                r0.backgroundColor = r1
                return r0
        }

        public com.getcapacitor.CapConfig.Builder setCaptureInput(boolean r1) {
                r0 = this;
                r0.captureInput = r1
                return r0
        }

        public com.getcapacitor.CapConfig.Builder setErrorPath(java.lang.String r1) {
                r0 = this;
                r0.errorPath = r1
                return r0
        }

        public com.getcapacitor.CapConfig.Builder setHTML5mode(boolean r1) {
                r0 = this;
                r0.html5mode = r1
                return r0
        }

        public com.getcapacitor.CapConfig.Builder setHostname(java.lang.String r1) {
                r0 = this;
                r0.hostname = r1
                return r0
        }

        public com.getcapacitor.CapConfig.Builder setInitialFocus(boolean r1) {
                r0 = this;
                r0.initialFocus = r1
                return r0
        }

        public com.getcapacitor.CapConfig.Builder setLoggingEnabled(boolean r1) {
                r0 = this;
                r0.loggingEnabled = r1
                return r0
        }

        public com.getcapacitor.CapConfig.Builder setOverriddenUserAgentString(java.lang.String r1) {
                r0 = this;
                r0.overriddenUserAgentString = r1
                return r0
        }

        public com.getcapacitor.CapConfig.Builder setPluginsConfiguration(org.json.JSONObject r2) {
                r1 = this;
                java.util.Map r0 = com.getcapacitor.CapConfig.m105$$Nest$smdeserializePluginsConfig(r2)
                r1.pluginsConfiguration = r0
                return r1
        }

        public com.getcapacitor.CapConfig.Builder setResolveServiceWorkerRequests(boolean r1) {
                r0 = this;
                r0.resolveServiceWorkerRequests = r1
                return r0
        }

        public com.getcapacitor.CapConfig.Builder setServerUrl(java.lang.String r1) {
                r0 = this;
                r0.serverUrl = r1
                return r0
        }

        public com.getcapacitor.CapConfig.Builder setStartPath(java.lang.String r1) {
                r0 = this;
                r0.startPath = r1
                return r0
        }

        public com.getcapacitor.CapConfig.Builder setUseLegacyBridge(boolean r1) {
                r0 = this;
                r0.useLegacyBridge = r1
                return r0
        }

        public com.getcapacitor.CapConfig.Builder setWebContentsDebuggingEnabled(boolean r2) {
                r1 = this;
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                r1.webContentsDebuggingEnabled = r0
                return r1
        }

        public com.getcapacitor.CapConfig.Builder setZoomableWebView(boolean r1) {
                r0 = this;
                r0.zoomableWebView = r1
                return r0
        }
    }

    /* JADX INFO: renamed from: -$$Nest$smdeserializePluginsConfig, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.Map m105$$Nest$smdeserializePluginsConfig(org.json.JSONObject r0) {
            java.util.Map r0 = deserializePluginsConfig(r0)
            return r0
    }

    private CapConfig() {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.html5mode = r0
            java.lang.String r1 = "localhost"
            r3.hostname = r1
            java.lang.String r1 = "https"
            r3.androidScheme = r1
            r1 = 0
            r3.allowMixedContent = r1
            r3.captureInput = r1
            r3.webContentsDebuggingEnabled = r1
            r3.loggingEnabled = r0
            r3.initialFocus = r0
            r3.useLegacyBridge = r1
            r2 = 60
            r3.minWebViewVersion = r2
            r2 = 10
            r3.minHuaweiWebViewVersion = r2
            r3.zoomableWebView = r1
            r3.resolveServiceWorkerRequests = r0
            r0 = 0
            r3.pluginsConfiguration = r0
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r3.configJSON = r0
            return
    }

    @java.lang.Deprecated
    public CapConfig(android.content.res.AssetManager r4, org.json.JSONObject r5) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.html5mode = r0
            java.lang.String r1 = "localhost"
            r3.hostname = r1
            java.lang.String r1 = "https"
            r3.androidScheme = r1
            r1 = 0
            r3.allowMixedContent = r1
            r3.captureInput = r1
            r3.webContentsDebuggingEnabled = r1
            r3.loggingEnabled = r0
            r3.initialFocus = r0
            r3.useLegacyBridge = r1
            r2 = 60
            r3.minWebViewVersion = r2
            r2 = 10
            r3.minHuaweiWebViewVersion = r2
            r3.zoomableWebView = r1
            r3.resolveServiceWorkerRequests = r0
            r0 = 0
            r3.pluginsConfiguration = r0
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r3.configJSON = r1
            if (r5 == 0) goto L36
            r3.configJSON = r5
            goto L39
        L36:
            r3.loadConfigFromAssets(r4, r0)
        L39:
            r3.deserializeConfig(r0)
            return
    }

    private CapConfig(com.getcapacitor.CapConfig.Builder r4) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.html5mode = r0
            java.lang.String r1 = "localhost"
            r3.hostname = r1
            java.lang.String r1 = "https"
            r3.androidScheme = r1
            r1 = 0
            r3.allowMixedContent = r1
            r3.captureInput = r1
            r3.webContentsDebuggingEnabled = r1
            r3.loggingEnabled = r0
            r3.initialFocus = r0
            r3.useLegacyBridge = r1
            r2 = 60
            r3.minWebViewVersion = r2
            r2 = 10
            r3.minHuaweiWebViewVersion = r2
            r3.zoomableWebView = r1
            r3.resolveServiceWorkerRequests = r0
            r0 = 0
            r3.pluginsConfiguration = r0
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r3.configJSON = r0
            boolean r0 = com.getcapacitor.CapConfig.Builder.m114$$Nest$fgethtml5mode(r4)
            r3.html5mode = r0
            java.lang.String r0 = com.getcapacitor.CapConfig.Builder.m122$$Nest$fgetserverUrl(r4)
            r3.serverUrl = r0
            java.lang.String r0 = com.getcapacitor.CapConfig.Builder.m113$$Nest$fgethostname(r4)
            r3.hostname = r0
            java.lang.String r0 = com.getcapacitor.CapConfig.Builder.m108$$Nest$fgetandroidScheme(r4)
            boolean r0 = r3.validateScheme(r0)
            if (r0 == 0) goto L53
            java.lang.String r0 = com.getcapacitor.CapConfig.Builder.m108$$Nest$fgetandroidScheme(r4)
            r3.androidScheme = r0
        L53:
            java.lang.String[] r0 = com.getcapacitor.CapConfig.Builder.m107$$Nest$fgetallowNavigation(r4)
            r3.allowNavigation = r0
            java.lang.String r0 = com.getcapacitor.CapConfig.Builder.m119$$Nest$fgetoverriddenUserAgentString(r4)
            r3.overriddenUserAgentString = r0
            java.lang.String r0 = com.getcapacitor.CapConfig.Builder.m109$$Nest$fgetappendedUserAgentString(r4)
            r3.appendedUserAgentString = r0
            java.lang.String r0 = com.getcapacitor.CapConfig.Builder.m110$$Nest$fgetbackgroundColor(r4)
            r3.backgroundColor = r0
            boolean r0 = com.getcapacitor.CapConfig.Builder.m106$$Nest$fgetallowMixedContent(r4)
            r3.allowMixedContent = r0
            boolean r0 = com.getcapacitor.CapConfig.Builder.m111$$Nest$fgetcaptureInput(r4)
            r3.captureInput = r0
            java.lang.Boolean r0 = com.getcapacitor.CapConfig.Builder.m125$$Nest$fgetwebContentsDebuggingEnabled(r4)
            boolean r0 = r0.booleanValue()
            r3.webContentsDebuggingEnabled = r0
            boolean r0 = com.getcapacitor.CapConfig.Builder.m116$$Nest$fgetloggingEnabled(r4)
            r3.loggingEnabled = r0
            boolean r0 = com.getcapacitor.CapConfig.Builder.m115$$Nest$fgetinitialFocus(r4)
            r3.initialFocus = r0
            boolean r0 = com.getcapacitor.CapConfig.Builder.m124$$Nest$fgetuseLegacyBridge(r4)
            r3.useLegacyBridge = r0
            int r0 = com.getcapacitor.CapConfig.Builder.m118$$Nest$fgetminWebViewVersion(r4)
            r3.minWebViewVersion = r0
            int r0 = com.getcapacitor.CapConfig.Builder.m117$$Nest$fgetminHuaweiWebViewVersion(r4)
            r3.minHuaweiWebViewVersion = r0
            java.lang.String r0 = com.getcapacitor.CapConfig.Builder.m112$$Nest$fgeterrorPath(r4)
            r3.errorPath = r0
            boolean r0 = com.getcapacitor.CapConfig.Builder.m126$$Nest$fgetzoomableWebView(r4)
            r3.zoomableWebView = r0
            boolean r0 = com.getcapacitor.CapConfig.Builder.m121$$Nest$fgetresolveServiceWorkerRequests(r4)
            r3.resolveServiceWorkerRequests = r0
            java.lang.String r0 = com.getcapacitor.CapConfig.Builder.m123$$Nest$fgetstartPath(r4)
            r3.startPath = r0
            java.util.Map r0 = com.getcapacitor.CapConfig.Builder.m120$$Nest$fgetpluginsConfiguration(r4)
            r3.pluginsConfiguration = r0
            return
    }

    /* synthetic */ CapConfig(com.getcapacitor.CapConfig.Builder r1, com.getcapacitor.CapConfigIA r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void deserializeConfig(android.content.Context r9) {
            r8 = this;
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L10
            android.content.pm.ApplicationInfo r2 = r9.getApplicationInfo()
            int r2 = r2.flags
            r2 = r2 & 2
            if (r2 == 0) goto L10
            r2 = r0
            goto L11
        L10:
            r2 = r1
        L11:
            org.json.JSONObject r3 = r8.configJSON
            java.lang.String r4 = "server.html5mode"
            boolean r5 = r8.html5mode
            boolean r3 = com.getcapacitor.util.JSONUtils.getBoolean(r3, r4, r5)
            r8.html5mode = r3
            org.json.JSONObject r3 = r8.configJSON
            java.lang.String r4 = "server.url"
            r5 = 0
            java.lang.String r3 = com.getcapacitor.util.JSONUtils.getString(r3, r4, r5)
            r8.serverUrl = r3
            org.json.JSONObject r3 = r8.configJSON
            java.lang.String r4 = "server.hostname"
            java.lang.String r6 = r8.hostname
            java.lang.String r3 = com.getcapacitor.util.JSONUtils.getString(r3, r4, r6)
            r8.hostname = r3
            org.json.JSONObject r3 = r8.configJSON
            java.lang.String r4 = "server.errorPath"
            java.lang.String r3 = com.getcapacitor.util.JSONUtils.getString(r3, r4, r5)
            r8.errorPath = r3
            org.json.JSONObject r3 = r8.configJSON
            java.lang.String r4 = "server.appStartPath"
            java.lang.String r3 = com.getcapacitor.util.JSONUtils.getString(r3, r4, r5)
            r8.startPath = r3
            org.json.JSONObject r3 = r8.configJSON
            java.lang.String r4 = "server.androidScheme"
            java.lang.String r6 = r8.androidScheme
            java.lang.String r3 = com.getcapacitor.util.JSONUtils.getString(r3, r4, r6)
            boolean r4 = r8.validateScheme(r3)
            if (r4 == 0) goto L5a
            r8.androidScheme = r3
        L5a:
            org.json.JSONObject r4 = r8.configJSON
            java.lang.String r6 = "server.allowNavigation"
            java.lang.String[] r4 = com.getcapacitor.util.JSONUtils.getArray(r4, r6, r5)
            r8.allowNavigation = r4
            org.json.JSONObject r4 = r8.configJSON
            org.json.JSONObject r6 = r8.configJSON
            java.lang.String r7 = "overrideUserAgent"
            java.lang.String r6 = com.getcapacitor.util.JSONUtils.getString(r6, r7, r5)
            java.lang.String r7 = "android.overrideUserAgent"
            java.lang.String r4 = com.getcapacitor.util.JSONUtils.getString(r4, r7, r6)
            r8.overriddenUserAgentString = r4
            org.json.JSONObject r4 = r8.configJSON
            org.json.JSONObject r6 = r8.configJSON
            java.lang.String r7 = "appendUserAgent"
            java.lang.String r6 = com.getcapacitor.util.JSONUtils.getString(r6, r7, r5)
            java.lang.String r7 = "android.appendUserAgent"
            java.lang.String r4 = com.getcapacitor.util.JSONUtils.getString(r4, r7, r6)
            r8.appendedUserAgentString = r4
            org.json.JSONObject r4 = r8.configJSON
            org.json.JSONObject r6 = r8.configJSON
            java.lang.String r7 = "backgroundColor"
            java.lang.String r5 = com.getcapacitor.util.JSONUtils.getString(r6, r7, r5)
            java.lang.String r6 = "android.backgroundColor"
            java.lang.String r4 = com.getcapacitor.util.JSONUtils.getString(r4, r6, r5)
            r8.backgroundColor = r4
            org.json.JSONObject r4 = r8.configJSON
            org.json.JSONObject r5 = r8.configJSON
            boolean r6 = r8.allowMixedContent
            java.lang.String r7 = "allowMixedContent"
            boolean r5 = com.getcapacitor.util.JSONUtils.getBoolean(r5, r7, r6)
            java.lang.String r6 = "android.allowMixedContent"
            boolean r4 = com.getcapacitor.util.JSONUtils.getBoolean(r4, r6, r5)
            r8.allowMixedContent = r4
            org.json.JSONObject r4 = r8.configJSON
            java.lang.String r5 = "android.minWebViewVersion"
            r6 = 60
            int r4 = com.getcapacitor.util.JSONUtils.getInt(r4, r5, r6)
            r8.minWebViewVersion = r4
            org.json.JSONObject r4 = r8.configJSON
            java.lang.String r5 = "android.minHuaweiWebViewVersion"
            r6 = 10
            int r4 = com.getcapacitor.util.JSONUtils.getInt(r4, r5, r6)
            r8.minHuaweiWebViewVersion = r4
            org.json.JSONObject r4 = r8.configJSON
            java.lang.String r5 = "android.captureInput"
            boolean r6 = r8.captureInput
            boolean r4 = com.getcapacitor.util.JSONUtils.getBoolean(r4, r5, r6)
            r8.captureInput = r4
            org.json.JSONObject r4 = r8.configJSON
            java.lang.String r5 = "android.useLegacyBridge"
            boolean r6 = r8.useLegacyBridge
            boolean r4 = com.getcapacitor.util.JSONUtils.getBoolean(r4, r5, r6)
            r8.useLegacyBridge = r4
            org.json.JSONObject r4 = r8.configJSON
            java.lang.String r5 = "android.webContentsDebuggingEnabled"
            boolean r4 = com.getcapacitor.util.JSONUtils.getBoolean(r4, r5, r2)
            r8.webContentsDebuggingEnabled = r4
            org.json.JSONObject r4 = r8.configJSON
            org.json.JSONObject r5 = r8.configJSON
            java.lang.String r6 = "zoomEnabled"
            boolean r5 = com.getcapacitor.util.JSONUtils.getBoolean(r5, r6, r1)
            java.lang.String r6 = "android.zoomEnabled"
            boolean r4 = com.getcapacitor.util.JSONUtils.getBoolean(r4, r6, r5)
            r8.zoomableWebView = r4
            org.json.JSONObject r4 = r8.configJSON
            java.lang.String r5 = "android.resolveServiceWorkerRequests"
            boolean r4 = com.getcapacitor.util.JSONUtils.getBoolean(r4, r5, r0)
            r8.resolveServiceWorkerRequests = r4
            org.json.JSONObject r4 = r8.configJSON
            org.json.JSONObject r5 = r8.configJSON
            java.lang.String r6 = "loggingBehavior"
            java.lang.String r7 = "debug"
            java.lang.String r5 = com.getcapacitor.util.JSONUtils.getString(r5, r6, r7)
            java.lang.String r6 = "android.loggingBehavior"
            java.lang.String r4 = com.getcapacitor.util.JSONUtils.getString(r4, r6, r5)
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r5 = r4.toLowerCase(r5)
            int r6 = r5.hashCode()
            switch(r6) {
                case 3387192: goto L12e;
                case 1753018553: goto L124;
                default: goto L123;
            }
        L123:
            goto L138
        L124:
            java.lang.String r6 = "production"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L123
            r5 = r1
            goto L139
        L12e:
            java.lang.String r6 = "none"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L123
            r5 = r0
            goto L139
        L138:
            r5 = -1
        L139:
            switch(r5) {
                case 0: goto L142;
                case 1: goto L13f;
                default: goto L13c;
            }
        L13c:
            r8.loggingEnabled = r2
            goto L145
        L13f:
            r8.loggingEnabled = r1
            goto L145
        L142:
            r8.loggingEnabled = r0
        L145:
            org.json.JSONObject r0 = r8.configJSON
            org.json.JSONObject r1 = r8.configJSON
            boolean r5 = r8.initialFocus
            java.lang.String r6 = "initialFocus"
            boolean r1 = com.getcapacitor.util.JSONUtils.getBoolean(r1, r6, r5)
            java.lang.String r5 = "android.initialFocus"
            boolean r0 = com.getcapacitor.util.JSONUtils.getBoolean(r0, r5, r1)
            r8.initialFocus = r0
            org.json.JSONObject r0 = r8.configJSON
            java.lang.String r1 = "plugins"
            org.json.JSONObject r0 = com.getcapacitor.util.JSONUtils.getObject(r0, r1)
            java.util.Map r0 = deserializePluginsConfig(r0)
            r8.pluginsConfiguration = r0
            return
    }

    private static java.util.Map<java.lang.String, com.getcapacitor.PluginConfig> deserializePluginsConfig(org.json.JSONObject r5) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r5 != 0) goto L8
            return r0
        L8:
            java.util.Iterator r1 = r5.keys()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            org.json.JSONObject r4 = r5.getJSONObject(r2)     // Catch: org.json.JSONException -> L28
            r3 = r4
            com.getcapacitor.PluginConfig r4 = new com.getcapacitor.PluginConfig     // Catch: org.json.JSONException -> L28
            r4.<init>(r3)     // Catch: org.json.JSONException -> L28
            r0.put(r2, r4)     // Catch: org.json.JSONException -> L28
            goto L2c
        L28:
            r4 = move-exception
            r4.printStackTrace()
        L2c:
            goto Lc
        L2d:
            return r0
    }

    private void loadConfigFromAssets(android.content.res.AssetManager r3, java.lang.String r4) {
            r2 = this;
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            goto L26
        L5:
            int r0 = r4.length()
            int r0 = r0 + (-1)
            char r0 = r4.charAt(r0)
            r1 = 47
            if (r0 == r1) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r4 = r0.toString()
        L26:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L45 java.io.IOException -> L4c
            r0.<init>()     // Catch: org.json.JSONException -> L45 java.io.IOException -> L4c
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: org.json.JSONException -> L45 java.io.IOException -> L4c
            java.lang.String r1 = "capacitor.config.json"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: org.json.JSONException -> L45 java.io.IOException -> L4c
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> L45 java.io.IOException -> L4c
            java.lang.String r0 = com.getcapacitor.FileUtils.readFileFromAssets(r3, r0)     // Catch: org.json.JSONException -> L45 java.io.IOException -> L4c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L45 java.io.IOException -> L4c
            r1.<init>(r0)     // Catch: org.json.JSONException -> L45 java.io.IOException -> L4c
            r2.configJSON = r1     // Catch: org.json.JSONException -> L45 java.io.IOException -> L4c
            goto L52
        L45:
            r0 = move-exception
            java.lang.String r1 = "Unable to parse capacitor.config.json. Make sure it's valid json"
            com.getcapacitor.Logger.error(r1, r0)
            goto L53
        L4c:
            r0 = move-exception
            java.lang.String r1 = "Unable to load capacitor.config.json. Run npx cap copy first"
            com.getcapacitor.Logger.error(r1, r0)
        L52:
        L53:
            return
    }

    private void loadConfigFromFile(java.lang.String r4) {
            r3 = this;
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            goto L26
        L5:
            int r0 = r4.length()
            int r0 = r0 + (-1)
            char r0 = r4.charAt(r0)
            r1 = 47
            if (r0 == r1) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r4 = r0.toString()
        L26:
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L4a org.json.JSONException -> L51
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L4a org.json.JSONException -> L51
            r1.<init>()     // Catch: java.io.IOException -> L4a org.json.JSONException -> L51
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.io.IOException -> L4a org.json.JSONException -> L51
            java.lang.String r2 = "capacitor.config.json"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L4a org.json.JSONException -> L51
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L4a org.json.JSONException -> L51
            r0.<init>(r1)     // Catch: java.io.IOException -> L4a org.json.JSONException -> L51
            java.lang.String r1 = com.getcapacitor.FileUtils.readFileFromDisk(r0)     // Catch: java.io.IOException -> L4a org.json.JSONException -> L51
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.io.IOException -> L4a org.json.JSONException -> L51
            r2.<init>(r1)     // Catch: java.io.IOException -> L4a org.json.JSONException -> L51
            r3.configJSON = r2     // Catch: java.io.IOException -> L4a org.json.JSONException -> L51
            goto L57
        L4a:
            r0 = move-exception
            java.lang.String r1 = "Unable to load capacitor.config.json."
            com.getcapacitor.Logger.error(r1, r0)
            goto L58
        L51:
            r0 = move-exception
            java.lang.String r1 = "Unable to parse capacitor.config.json. Make sure it's valid json"
            com.getcapacitor.Logger.error(r1, r0)
        L57:
        L58:
            return
    }

    public static com.getcapacitor.CapConfig loadDefault(android.content.Context r3) {
            com.getcapacitor.CapConfig r0 = new com.getcapacitor.CapConfig
            r0.<init>()
            if (r3 != 0) goto Ld
            java.lang.String r1 = "Capacitor Config could not be created from file. Context must not be null."
            com.getcapacitor.Logger.error(r1)
            return r0
        Ld:
            android.content.res.AssetManager r1 = r3.getAssets()
            r2 = 0
            r0.loadConfigFromAssets(r1, r2)
            r0.deserializeConfig(r3)
            return r0
    }

    public static com.getcapacitor.CapConfig loadFromAssets(android.content.Context r2, java.lang.String r3) {
            com.getcapacitor.CapConfig r0 = new com.getcapacitor.CapConfig
            r0.<init>()
            if (r2 != 0) goto Ld
            java.lang.String r1 = "Capacitor Config could not be created from file. Context must not be null."
            com.getcapacitor.Logger.error(r1)
            return r0
        Ld:
            android.content.res.AssetManager r1 = r2.getAssets()
            r0.loadConfigFromAssets(r1, r3)
            r0.deserializeConfig(r2)
            return r0
    }

    public static com.getcapacitor.CapConfig loadFromFile(android.content.Context r2, java.lang.String r3) {
            com.getcapacitor.CapConfig r0 = new com.getcapacitor.CapConfig
            r0.<init>()
            if (r2 != 0) goto Ld
            java.lang.String r1 = "Capacitor Config could not be created from file. Context must not be null."
            com.getcapacitor.Logger.error(r1)
            return r0
        Ld:
            r0.loadConfigFromFile(r3)
            r0.deserializeConfig(r2)
            return r0
    }

    private boolean validateScheme(java.lang.String r6) {
            r5 = this;
            r0 = 8
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "file"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "ftp"
            r3 = 1
            r0[r3] = r1
            r1 = 2
            java.lang.String r4 = "ftps"
            r0[r1] = r4
            r1 = 3
            java.lang.String r4 = "ws"
            r0[r1] = r4
            r1 = 4
            java.lang.String r4 = "wss"
            r0[r1] = r4
            r1 = 5
            java.lang.String r4 = "about"
            r0[r1] = r4
            r1 = 6
            java.lang.String r4 = "blob"
            r0[r1] = r4
            r1 = 7
            java.lang.String r4 = "data"
            r0[r1] = r4
            java.util.List r0 = java.util.Arrays.asList(r0)
            boolean r1 = r0.contains(r6)
            if (r1 == 0) goto L4d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r3 = " is not an allowed scheme.  Defaulting to https."
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.getcapacitor.Logger.warn(r1)
            return r2
        L4d:
            java.lang.String r1 = "http"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L79
            java.lang.String r1 = "https"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L79
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Using a non-standard scheme: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " for Android. This is known to cause issues as of Android Webview 117."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.getcapacitor.Logger.warn(r1)
        L79:
            return r3
    }

    public java.lang.String[] getAllowNavigation() {
            r1 = this;
            java.lang.String[] r0 = r1.allowNavigation
            return r0
    }

    public java.lang.String getAndroidScheme() {
            r1 = this;
            java.lang.String r0 = r1.androidScheme
            return r0
    }

    public java.lang.String getAppendedUserAgentString() {
            r1 = this;
            java.lang.String r0 = r1.appendedUserAgentString
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String[] getArray(java.lang.String r3) {
            r2 = this;
            org.json.JSONObject r0 = r2.configJSON
            r1 = 0
            java.lang.String[] r0 = com.getcapacitor.util.JSONUtils.getArray(r0, r3, r1)
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String[] getArray(java.lang.String r2, java.lang.String[] r3) {
            r1 = this;
            org.json.JSONObject r0 = r1.configJSON
            java.lang.String[] r0 = com.getcapacitor.util.JSONUtils.getArray(r0, r2, r3)
            return r0
    }

    public java.lang.String getBackgroundColor() {
            r1 = this;
            java.lang.String r0 = r1.backgroundColor
            return r0
    }

    @java.lang.Deprecated
    public boolean getBoolean(java.lang.String r2, boolean r3) {
            r1 = this;
            org.json.JSONObject r0 = r1.configJSON
            boolean r0 = com.getcapacitor.util.JSONUtils.getBoolean(r0, r2, r3)
            return r0
    }

    public java.lang.String getErrorPath() {
            r1 = this;
            java.lang.String r0 = r1.errorPath
            return r0
    }

    public java.lang.String getHostname() {
            r1 = this;
            java.lang.String r0 = r1.hostname
            return r0
    }

    @java.lang.Deprecated
    public int getInt(java.lang.String r2, int r3) {
            r1 = this;
            org.json.JSONObject r0 = r1.configJSON
            int r0 = com.getcapacitor.util.JSONUtils.getInt(r0, r2, r3)
            return r0
    }

    public int getMinHuaweiWebViewVersion() {
            r2 = this;
            int r0 = r2.minHuaweiWebViewVersion
            r1 = 10
            if (r0 >= r1) goto Lc
            java.lang.String r0 = "Specified minimum Huawei webview version is too low, defaulting to 10"
            com.getcapacitor.Logger.warn(r0)
            return r1
        Lc:
            int r0 = r2.minHuaweiWebViewVersion
            return r0
    }

    public int getMinWebViewVersion() {
            r2 = this;
            int r0 = r2.minWebViewVersion
            r1 = 55
            if (r0 >= r1) goto Lc
            java.lang.String r0 = "Specified minimum webview version is too low, defaulting to 55"
            com.getcapacitor.Logger.warn(r0)
            return r1
        Lc:
            int r0 = r2.minWebViewVersion
            return r0
    }

    @java.lang.Deprecated
    public org.json.JSONObject getObject(java.lang.String r2) {
            r1 = this;
            org.json.JSONObject r0 = r1.configJSON     // Catch: java.lang.Exception -> L7
            org.json.JSONObject r0 = r0.getJSONObject(r2)     // Catch: java.lang.Exception -> L7
            return r0
        L7:
            r0 = move-exception
            r0 = 0
            return r0
    }

    public java.lang.String getOverriddenUserAgentString() {
            r1 = this;
            java.lang.String r0 = r1.overriddenUserAgentString
            return r0
    }

    public com.getcapacitor.PluginConfig getPluginConfiguration(java.lang.String r4) {
            r3 = this;
            java.util.Map<java.lang.String, com.getcapacitor.PluginConfig> r0 = r3.pluginsConfiguration
            java.lang.Object r0 = r0.get(r4)
            com.getcapacitor.PluginConfig r0 = (com.getcapacitor.PluginConfig) r0
            if (r0 != 0) goto L15
            com.getcapacitor.PluginConfig r1 = new com.getcapacitor.PluginConfig
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r1.<init>(r2)
            r0 = r1
        L15:
            return r0
    }

    public java.lang.String getServerUrl() {
            r1 = this;
            java.lang.String r0 = r1.serverUrl
            return r0
    }

    public java.lang.String getStartPath() {
            r1 = this;
            java.lang.String r0 = r1.startPath
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getString(java.lang.String r3) {
            r2 = this;
            org.json.JSONObject r0 = r2.configJSON
            r1 = 0
            java.lang.String r0 = com.getcapacitor.util.JSONUtils.getString(r0, r3, r1)
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            org.json.JSONObject r0 = r1.configJSON
            java.lang.String r0 = com.getcapacitor.util.JSONUtils.getString(r0, r2, r3)
            return r0
    }

    public boolean isHTML5Mode() {
            r1 = this;
            boolean r0 = r1.html5mode
            return r0
    }

    public boolean isInitialFocus() {
            r1 = this;
            boolean r0 = r1.initialFocus
            return r0
    }

    public boolean isInputCaptured() {
            r1 = this;
            boolean r0 = r1.captureInput
            return r0
    }

    public boolean isLoggingEnabled() {
            r1 = this;
            boolean r0 = r1.loggingEnabled
            return r0
    }

    public boolean isMixedContentAllowed() {
            r1 = this;
            boolean r0 = r1.allowMixedContent
            return r0
    }

    public boolean isResolveServiceWorkerRequests() {
            r1 = this;
            boolean r0 = r1.resolveServiceWorkerRequests
            return r0
    }

    public boolean isUsingLegacyBridge() {
            r1 = this;
            boolean r0 = r1.useLegacyBridge
            return r0
    }

    public boolean isWebContentsDebuggingEnabled() {
            r1 = this;
            boolean r0 = r1.webContentsDebuggingEnabled
            return r0
    }

    public boolean isZoomableWebView() {
            r1 = this;
            boolean r0 = r1.zoomableWebView
            return r0
    }
}
