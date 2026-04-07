package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public class WebViewCompat {
    private static final android.net.Uri EMPTY_URI = null;
    private static final android.net.Uri WILDCARD_URI = null;
    private static final java.util.WeakHashMap<android.webkit.WebView, androidx.webkit.internal.WebViewProviderAdapter> sProviderAdapterCache = null;
    private static boolean sShouldCacheProvider;

    /* JADX INFO: renamed from: androidx.webkit.WebViewCompat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface ExperimentalAsyncStartUp {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface ExperimentalCacheProvider {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface ExperimentalSaveState {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface ExperimentalUrlPrerender {
    }

    private static class NullReturningWebViewStartUpResult implements androidx.webkit.WebViewStartUpResult {
        private NullReturningWebViewStartUpResult() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ NullReturningWebViewStartUpResult(androidx.webkit.WebViewCompat.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.webkit.WebViewStartUpResult
        public java.util.List<androidx.webkit.BlockingStartUpLocation> getBlockingStartUpLocations() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.webkit.WebViewStartUpResult
        public java.lang.Long getMaxTimePerTaskInUiThreadMillis() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.webkit.WebViewStartUpResult
        public java.lang.Long getTotalTimeInUiThreadMillis() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    public interface VisualStateCallback {
        void onComplete(long r1);
    }

    public interface WebMessageListener {
        void onPostMessage(android.webkit.WebView r1, androidx.webkit.WebMessageCompat r2, android.net.Uri r3, boolean r4, androidx.webkit.JavaScriptReplyProxy r5);
    }

    public interface WebViewStartUpCallback {
        void onSuccess(androidx.webkit.WebViewStartUpResult r1);
    }

    static {
            java.lang.String r0 = "*"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            androidx.webkit.WebViewCompat.WILDCARD_URI = r0
            java.lang.String r0 = ""
            android.net.Uri r0 = android.net.Uri.parse(r0)
            androidx.webkit.WebViewCompat.EMPTY_URI = r0
            r0 = 1
            androidx.webkit.WebViewCompat.sShouldCacheProvider = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            androidx.webkit.WebViewCompat.sProviderAdapterCache = r0
            return
    }

    private WebViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.webkit.ScriptHandler addDocumentStartJavaScript(android.webkit.WebView r3, java.lang.String r4, java.util.Set<java.lang.String> r5) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.DOCUMENT_START_SCRIPT
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1a
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r3)
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r2 = r5.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            androidx.webkit.internal.ScriptHandlerImpl r1 = r1.addDocumentStartJavaScript(r4, r2)
            return r1
        L1a:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void addWebMessageListener(android.webkit.WebView r3, java.lang.String r4, java.util.Set<java.lang.String> r5, androidx.webkit.WebViewCompat.WebMessageListener r6) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_LISTENER
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L19
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r3)
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r2 = r5.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r1.addWebMessageListener(r4, r2, r6)
            return
        L19:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    private static void checkThread(android.webkit.WebView r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L5e
            android.os.Looper r0 = androidx.webkit.internal.ApiHelperForP.getWebViewLooper(r4)
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto L11
            goto L73
        L11:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "A WebView method was called on thread '"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "'. All WebView methods must be called on the same thread. (Expected Looper "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " called on "
            java.lang.StringBuilder r2 = r2.append(r3)
            android.os.Looper r3 = android.os.Looper.myLooper()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", FYI main Looper is "
            java.lang.StringBuilder r2 = r2.append(r3)
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ")"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L5e:
            java.lang.Class<android.webkit.WebView> r0 = android.webkit.WebView.class
            java.lang.String r1 = "checkThread"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L74 java.lang.IllegalAccessException -> L76 java.lang.NoSuchMethodException -> L78
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L74 java.lang.IllegalAccessException -> L76 java.lang.NoSuchMethodException -> L78
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L74 java.lang.IllegalAccessException -> L76 java.lang.NoSuchMethodException -> L78
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L74 java.lang.IllegalAccessException -> L76 java.lang.NoSuchMethodException -> L78
            r0.invoke(r4, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L74 java.lang.IllegalAccessException -> L76 java.lang.NoSuchMethodException -> L78
        L73:
            return
        L74:
            r0 = move-exception
            goto L79
        L76:
            r0 = move-exception
            goto L79
        L78:
            r0 = move-exception
        L79:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    private static org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface createProvider(android.webkit.WebView r1) {
            androidx.webkit.internal.WebViewProviderFactory r0 = getFactory()
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r0.createWebView(r1)
            return r0
    }

    public static androidx.webkit.WebMessagePortCompat[] createWebMessageChannel(android.webkit.WebView r2) {
            androidx.webkit.internal.ApiFeature$M r0 = androidx.webkit.internal.WebViewFeatureInternal.CREATE_WEB_MESSAGE_CHANNEL
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L11
            android.webkit.WebMessagePort[] r1 = androidx.webkit.internal.ApiHelperForM.createWebMessageChannel(r2)
            androidx.webkit.WebMessagePortCompat[] r1 = androidx.webkit.internal.WebMessagePortImpl.portsToCompat(r1)
            return r1
        L11:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L23
            checkThread(r2)
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r2)
            androidx.webkit.WebMessagePortCompat[] r1 = r1.createWebMessageChannel()
            return r1
        L23:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static android.content.pm.PackageInfo getCurrentLoadedWebViewPackage() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.content.pm.PackageInfo r0 = androidx.webkit.internal.ApiHelperForO.getCurrentWebViewPackage()
            return r0
        Lb:
            android.content.pm.PackageInfo r0 = getLoadedWebViewPackageInfo()     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r0 = move-exception
            r0 = 0
            return r0
    }

    public static android.content.pm.PackageInfo getCurrentWebViewPackage(android.content.Context r2) {
            android.content.pm.PackageInfo r0 = getCurrentLoadedWebViewPackage()
            if (r0 == 0) goto L7
            return r0
        L7:
            android.content.pm.PackageInfo r1 = getNotYetLoadedWebViewPackageInfo(r2)
            return r1
    }

    private static androidx.webkit.internal.WebViewProviderFactory getFactory() {
            androidx.webkit.internal.WebViewProviderFactory r0 = androidx.webkit.internal.WebViewGlueCommunicator.getFactory()
            return r0
    }

    private static android.content.pm.PackageInfo getLoadedWebViewPackageInfo() throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
            java.lang.String r0 = "android.webkit.WebViewFactory"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.String r3 = "getLoadedPackageInfo"
            java.lang.reflect.Method r2 = r0.getMethod(r3, r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            java.lang.Object r1 = r2.invoke(r3, r1)
            android.content.pm.PackageInfo r1 = (android.content.pm.PackageInfo) r1
            return r1
    }

    private static android.content.pm.PackageInfo getNotYetLoadedWebViewPackageInfo(android.content.Context r5) {
            r0 = 0
            java.lang.String r1 = "android.webkit.WebViewUpdateService"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L2c java.lang.ClassNotFoundException -> L2e
            java.lang.String r2 = "getCurrentWebViewPackageName"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L2c java.lang.ClassNotFoundException -> L2e
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L2c java.lang.ClassNotFoundException -> L2e
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L2c java.lang.ClassNotFoundException -> L2e
            java.lang.Object r2 = r2.invoke(r0, r4)     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L2c java.lang.ClassNotFoundException -> L2e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L2c java.lang.ClassNotFoundException -> L2e
            if (r2 != 0) goto L1d
            return r0
        L1d:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            return r0
        L26:
            r3 = move-exception
            return r0
        L28:
            r1 = move-exception
            goto L2f
        L2a:
            r1 = move-exception
            goto L2f
        L2c:
            r1 = move-exception
            goto L2f
        L2e:
            r1 = move-exception
        L2f:
            return r0
    }

    public static androidx.webkit.Profile getProfile(android.webkit.WebView r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r2)
            androidx.webkit.Profile r1 = r1.getProfile()
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    private static androidx.webkit.internal.WebViewProviderAdapter getProvider(android.webkit.WebView r4) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.CACHE_PROVIDER
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L26
            boolean r1 = androidx.webkit.WebViewCompat.sShouldCacheProvider
            if (r1 == 0) goto L26
            java.util.WeakHashMap<android.webkit.WebView, androidx.webkit.internal.WebViewProviderAdapter> r1 = androidx.webkit.WebViewCompat.sProviderAdapterCache
            java.lang.Object r1 = r1.get(r4)
            androidx.webkit.internal.WebViewProviderAdapter r1 = (androidx.webkit.internal.WebViewProviderAdapter) r1
            if (r1 != 0) goto L25
            androidx.webkit.internal.WebViewProviderAdapter r2 = new androidx.webkit.internal.WebViewProviderAdapter
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r3 = createProvider(r4)
            r2.<init>(r3)
            r1 = r2
            java.util.WeakHashMap<android.webkit.WebView, androidx.webkit.internal.WebViewProviderAdapter> r2 = androidx.webkit.WebViewCompat.sProviderAdapterCache
            r2.put(r4, r1)
        L25:
            return r1
        L26:
            androidx.webkit.internal.WebViewProviderAdapter r1 = new androidx.webkit.internal.WebViewProviderAdapter
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r2 = createProvider(r4)
            r1.<init>(r2)
            return r1
    }

    static java.util.WeakHashMap<android.webkit.WebView, androidx.webkit.internal.WebViewProviderAdapter> getProviderAdapterCacheForTesting() {
            java.util.WeakHashMap<android.webkit.WebView, androidx.webkit.internal.WebViewProviderAdapter> r0 = androidx.webkit.WebViewCompat.sProviderAdapterCache
            return r0
    }

    public static android.net.Uri getSafeBrowsingPrivacyPolicyUrl() {
            androidx.webkit.internal.ApiFeature$O_MR1 r0 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_PRIVACY_POLICY_URL
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto Ld
            android.net.Uri r1 = androidx.webkit.internal.ApiHelperForOMR1.getSafeBrowsingPrivacyPolicyUrl()
            return r1
        Ld:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L20
            androidx.webkit.internal.WebViewProviderFactory r1 = getFactory()
            org.chromium.support_lib_boundary.StaticsBoundaryInterface r1 = r1.getStatics()
            android.net.Uri r1 = r1.getSafeBrowsingPrivacyPolicyUrl()
            return r1
        L20:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static java.lang.String getVariationsHeader() {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.GET_VARIATIONS_HEADER
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L15
            androidx.webkit.internal.WebViewProviderFactory r1 = getFactory()
            org.chromium.support_lib_boundary.StaticsBoundaryInterface r1 = r1.getStatics()
            java.lang.String r1 = r1.getVariationsHeader()
            return r1
        L15:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static android.webkit.WebChromeClient getWebChromeClient(android.webkit.WebView r2) {
            androidx.webkit.internal.ApiFeature$O r0 = androidx.webkit.internal.WebViewFeatureInternal.GET_WEB_CHROME_CLIENT
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto Ld
            android.webkit.WebChromeClient r1 = androidx.webkit.internal.ApiHelperForO.getWebChromeClient(r2)
            return r1
        Ld:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1f
            checkThread(r2)
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r2)
            android.webkit.WebChromeClient r1 = r1.getWebChromeClient()
            return r1
        L1f:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static androidx.webkit.WebNavigationClient getWebNavigationClient(android.webkit.WebView r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.NAVIGATION_CALLBACK_BASIC
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r2)
            androidx.webkit.WebNavigationClient r1 = r1.getWebNavigationClient()
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static android.webkit.WebViewClient getWebViewClient(android.webkit.WebView r2) {
            androidx.webkit.internal.ApiFeature$O r0 = androidx.webkit.internal.WebViewFeatureInternal.GET_WEB_VIEW_CLIENT
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto Ld
            android.webkit.WebViewClient r1 = androidx.webkit.internal.ApiHelperForO.getWebViewClient(r2)
            return r1
        Ld:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1f
            checkThread(r2)
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r2)
            android.webkit.WebViewClient r1 = r1.getWebViewClient()
            return r1
        L1f:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static androidx.webkit.WebViewRenderProcess getWebViewRenderProcess(android.webkit.WebView r3) {
            androidx.webkit.internal.ApiFeature$Q r0 = androidx.webkit.internal.WebViewFeatureInternal.GET_WEB_VIEW_RENDERER
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L15
            android.webkit.WebViewRenderProcess r1 = androidx.webkit.internal.ApiHelperForQ.getWebViewRenderProcess(r3)
            if (r1 == 0) goto L13
            androidx.webkit.internal.WebViewRenderProcessImpl r2 = androidx.webkit.internal.WebViewRenderProcessImpl.forFrameworkObject(r1)
            goto L14
        L13:
            r2 = 0
        L14:
            return r2
        L15:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L27
            checkThread(r3)
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r3)
            androidx.webkit.WebViewRenderProcess r1 = r1.getWebViewRenderProcess()
            return r1
        L27:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static androidx.webkit.WebViewRenderProcessClient getWebViewRenderProcessClient(android.webkit.WebView r3) {
            androidx.webkit.internal.ApiFeature$Q r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L1e
        L9:
            android.webkit.WebViewRenderProcessClient r1 = androidx.webkit.internal.ApiHelperForQ.getWebViewRenderProcessClient(r3)
            if (r1 == 0) goto L1c
            boolean r2 = r1 instanceof androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter
            if (r2 != 0) goto L14
            goto L1c
        L14:
            r2 = r1
            androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter r2 = (androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter) r2
            androidx.webkit.WebViewRenderProcessClient r2 = r2.getFrameworkRenderProcessClient()
            return r2
        L1c:
            r2 = 0
            return r2
        L1e:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L30
            checkThread(r3)
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r3)
            androidx.webkit.WebViewRenderProcessClient r1 = r1.getWebViewRenderProcessClient()
            return r1
        L30:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static boolean isAudioMuted(android.webkit.WebView r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.MUTE_AUDIO
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r2)
            boolean r1 = r1.isAudioMuted()
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static boolean isMultiProcessEnabled() {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROCESS
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L15
            androidx.webkit.internal.WebViewProviderFactory r1 = getFactory()
            org.chromium.support_lib_boundary.StaticsBoundaryInterface r1 = r1.getStatics()
            boolean r1 = r1.isMultiProcessEnabled()
            return r1
        L15:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    static /* synthetic */ void lambda$startUpWebView$0(androidx.webkit.WebViewCompat.WebViewStartUpCallback r0, androidx.webkit.WebViewStartUpResult r1) {
            r0.onSuccess(r1)
            return
    }

    static /* synthetic */ void lambda$startUpWebView$1(androidx.webkit.WebViewCompat.WebViewStartUpCallback r2, androidx.webkit.WebViewStartUpResult r3) {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            androidx.webkit.WebViewCompat$$ExternalSyntheticLambda1 r1 = new androidx.webkit.WebViewCompat$$ExternalSyntheticLambda1
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    static /* synthetic */ void lambda$startUpWebView$2(androidx.webkit.WebViewCompat.WebViewStartUpCallback r2) {
            androidx.webkit.WebViewCompat$NullReturningWebViewStartUpResult r0 = new androidx.webkit.WebViewCompat$NullReturningWebViewStartUpResult
            r1 = 0
            r0.<init>(r1)
            r2.onSuccess(r0)
            return
    }

    static /* synthetic */ void lambda$startUpWebView$3(androidx.webkit.WebViewStartUpConfig r2, androidx.webkit.WebViewCompat.WebViewStartUpCallback r3, android.content.Context r4) {
            androidx.webkit.internal.WebViewGlueCommunicator.getWebViewClassLoader()
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.ASYNC_WEBVIEW_STARTUP
            boolean r0 = r0.isSupportedByWebView()
            if (r0 == 0) goto L18
            androidx.webkit.internal.WebViewProviderFactory r0 = getFactory()
            androidx.webkit.WebViewCompat$$ExternalSyntheticLambda2 r1 = new androidx.webkit.WebViewCompat$$ExternalSyntheticLambda2
            r1.<init>(r3)
            r0.startUpWebView(r2, r1)
            return
        L18:
            boolean r0 = r2.shouldRunUiThreadStartUpTasks()
            if (r0 == 0) goto L25
            android.content.Context r0 = r4.getApplicationContext()
            android.webkit.WebSettings.getDefaultUserAgent(r0)
        L25:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            androidx.webkit.WebViewCompat$$ExternalSyntheticLambda3 r1 = new androidx.webkit.WebViewCompat$$ExternalSyntheticLambda3
            r1.<init>(r3)
            r0.post(r1)
            return
    }

    public static void postVisualStateCallback(android.webkit.WebView r2, long r3, androidx.webkit.WebViewCompat.VisualStateCallback r5) {
            androidx.webkit.internal.ApiFeature$M r0 = androidx.webkit.internal.WebViewFeatureInternal.VISUAL_STATE_CALLBACK
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto Lc
            androidx.webkit.internal.ApiHelperForM.postVisualStateCallback(r2, r3, r5)
            goto L1c
        Lc:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1d
            checkThread(r2)
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r2)
            r1.insertVisualStateCallback(r3, r5)
        L1c:
            return
        L1d:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void postWebMessage(android.webkit.WebView r2, androidx.webkit.WebMessageCompat r3, android.net.Uri r4) {
            android.net.Uri r0 = androidx.webkit.WebViewCompat.WILDCARD_URI
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto La
            android.net.Uri r4 = androidx.webkit.WebViewCompat.EMPTY_URI
        La:
            androidx.webkit.internal.ApiFeature$M r0 = androidx.webkit.internal.WebViewFeatureInternal.POST_WEB_MESSAGE
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L21
            int r1 = r3.getType()
            if (r1 != 0) goto L21
        L19:
            android.webkit.WebMessage r1 = androidx.webkit.internal.WebMessagePortImpl.compatToFrameworkMessage(r3)
            androidx.webkit.internal.ApiHelperForM.postWebMessage(r2, r1, r4)
            goto L3b
        L21:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L3c
            int r1 = r3.getType()
            boolean r1 = androidx.webkit.internal.WebMessageAdapter.isMessagePayloadTypeSupportedByWebView(r1)
            if (r1 == 0) goto L3c
            checkThread(r2)
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r2)
            r1.postWebMessage(r3, r4)
        L3b:
            return
        L3c:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void prerenderUrlAsync(android.webkit.WebView r2, java.lang.String r3, android.os.CancellationSignal r4, java.util.concurrent.Executor r5, androidx.webkit.PrerenderOperationCallback r6) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.PRERENDER_WITH_URL
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r2)
            r1.prerenderUrlAsync(r3, r4, r5, r6)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void prerenderUrlAsync(android.webkit.WebView r8, java.lang.String r9, android.os.CancellationSignal r10, java.util.concurrent.Executor r11, androidx.webkit.SpeculativeLoadingParameters r12, androidx.webkit.PrerenderOperationCallback r13) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.PRERENDER_WITH_URL
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L15
            androidx.webkit.internal.WebViewProviderAdapter r2 = getProvider(r8)
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r2.prerenderUrlAsync(r3, r4, r5, r6, r7)
            return
        L15:
            r3 = r9
            java.lang.UnsupportedOperationException r9 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r9
    }

    public static void removeWebMessageListener(android.webkit.WebView r2, java.lang.String r3) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_LISTENER
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r2)
            r1.removeWebMessageListener(r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void saveState(android.webkit.WebView r2, android.os.Bundle r3, int r4, boolean r5) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.SAVE_STATE
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r2)
            r1.saveState(r3, r4, r5)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setAudioMuted(android.webkit.WebView r2, boolean r3) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.MUTE_AUDIO
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r2)
            r1.setAudioMuted(r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setDefaultTrafficStatsTag(int r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.DEFAULT_TRAFFICSTATS_TAGGING
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L14
            androidx.webkit.internal.WebViewProviderFactory r1 = getFactory()
            org.chromium.support_lib_boundary.StaticsBoundaryInterface r1 = r1.getStatics()
            r1.setDefaultTrafficStatsTag(r2)
            return
        L14:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setProfile(android.webkit.WebView r2, java.lang.String r3) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r2)
            r1.setProfileWithName(r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setSafeBrowsingAllowlist(java.util.Set<java.lang.String> r4, android.webkit.ValueCallback<java.lang.Boolean> r5) {
            androidx.webkit.internal.ApiFeature$O_MR1 r0 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED
            androidx.webkit.internal.ApiFeature$O_MR1 r1 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED
            boolean r2 = r0.isSupportedByWebView()
            if (r2 == 0) goto L16
            androidx.webkit.internal.WebViewProviderFactory r2 = getFactory()
            org.chromium.support_lib_boundary.StaticsBoundaryInterface r2 = r2.getStatics()
            r2.setSafeBrowsingAllowlist(r4, r5)
            return
        L16:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r4)
            boolean r3 = r1.isSupportedByFramework()
            if (r3 == 0) goto L25
            androidx.webkit.internal.ApiHelperForOMR1.setSafeBrowsingWhitelist(r2, r5)
            goto L36
        L25:
            boolean r3 = r1.isSupportedByWebView()
            if (r3 == 0) goto L37
            androidx.webkit.internal.WebViewProviderFactory r3 = getFactory()
            org.chromium.support_lib_boundary.StaticsBoundaryInterface r3 = r3.getStatics()
            r3.setSafeBrowsingWhitelist(r2, r5)
        L36:
            return
        L37:
            java.lang.UnsupportedOperationException r3 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r3
    }

    @java.lang.Deprecated
    public static void setSafeBrowsingWhitelist(java.util.List<java.lang.String> r1, android.webkit.ValueCallback<java.lang.Boolean> r2) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            setSafeBrowsingAllowlist(r0, r2)
            return
    }

    public static void setShouldCacheProvider(boolean r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.CACHE_PROVIDER
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto Lb
            androidx.webkit.WebViewCompat.sShouldCacheProvider = r2
            return
        Lb:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setWebNavigationClient(android.webkit.WebView r2, androidx.webkit.WebNavigationClient r3) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.NAVIGATION_CALLBACK_BASIC
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r2)
            r1.setWebNavigationClient(r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setWebViewRenderProcessClient(android.webkit.WebView r3, androidx.webkit.WebViewRenderProcessClient r4) {
            androidx.webkit.internal.ApiFeature$Q r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto Lc
            androidx.webkit.internal.ApiHelperForQ.setWebViewRenderProcessClient(r3, r4)
            goto L1d
        Lc:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1e
            checkThread(r3)
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r3)
            r2 = 0
            r1.setWebViewRenderProcessClient(r2, r4)
        L1d:
            return
        L1e:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setWebViewRenderProcessClient(android.webkit.WebView r2, java.util.concurrent.Executor r3, androidx.webkit.WebViewRenderProcessClient r4) {
            androidx.webkit.internal.ApiFeature$Q r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto Lc
            androidx.webkit.internal.ApiHelperForQ.setWebViewRenderProcessClient(r2, r3, r4)
            goto L1c
        Lc:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1d
            checkThread(r2)
            androidx.webkit.internal.WebViewProviderAdapter r1 = getProvider(r2)
            r1.setWebViewRenderProcessClient(r3, r4)
        L1c:
            return
        L1d:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @java.lang.Deprecated
    public static void startSafeBrowsing(android.content.Context r2, android.webkit.ValueCallback<java.lang.Boolean> r3) {
            androidx.webkit.internal.ApiFeature$O_MR1 r0 = androidx.webkit.internal.WebViewFeatureInternal.START_SAFE_BROWSING
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto Lc
            androidx.webkit.internal.ApiHelperForOMR1.startSafeBrowsing(r2, r3)
            goto L1d
        Lc:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1e
            androidx.webkit.internal.WebViewProviderFactory r1 = getFactory()
            org.chromium.support_lib_boundary.StaticsBoundaryInterface r1 = r1.getStatics()
            r1.initSafeBrowsing(r2, r3)
        L1d:
            return
        L1e:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void startUpWebView(android.content.Context r2, androidx.webkit.WebViewStartUpConfig r3, androidx.webkit.WebViewCompat.WebViewStartUpCallback r4) {
            java.util.concurrent.Executor r0 = r3.getBackgroundExecutor()
            androidx.webkit.WebViewCompat$$ExternalSyntheticLambda0 r1 = new androidx.webkit.WebViewCompat$$ExternalSyntheticLambda0
            r1.<init>(r3, r4, r2)
            r0.execute(r1)
            return
    }
}
