package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public class ProcessGlobalConfig {
    private static boolean sApplyCalled;
    private static final java.lang.Object sLock = null;
    private static final java.util.concurrent.atomic.AtomicReference<java.util.HashMap<java.lang.String, java.lang.Object>> sProcessGlobalConfig = null;
    java.lang.String mCacheDirectoryBasePath;
    java.lang.String mDataDirectoryBasePath;
    java.lang.String mDataDirectorySuffix;
    java.lang.Boolean mPartitionedCookiesEnabled;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            androidx.webkit.ProcessGlobalConfig.sProcessGlobalConfig = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.webkit.ProcessGlobalConfig.sLock = r0
            r0 = 0
            androidx.webkit.ProcessGlobalConfig.sApplyCalled = r0
            return
    }

    public ProcessGlobalConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void apply(androidx.webkit.ProcessGlobalConfig r4) {
            java.lang.Object r0 = androidx.webkit.ProcessGlobalConfig.sLock
            monitor-enter(r0)
            boolean r1 = androidx.webkit.ProcessGlobalConfig.sApplyCalled     // Catch: java.lang.Throwable -> L72
            if (r1 != 0) goto L6a
            r1 = 1
            androidx.webkit.ProcessGlobalConfig.sApplyCalled = r1     // Catch: java.lang.Throwable -> L72
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = webViewCurrentlyLoaded()
            if (r1 != 0) goto L62
            java.lang.String r1 = r4.mDataDirectorySuffix
            if (r1 == 0) goto L2f
            androidx.webkit.internal.StartupApiFeature$P r1 = androidx.webkit.internal.WebViewFeatureInternal.STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX
            boolean r2 = r1.isSupportedByFramework()
            if (r2 == 0) goto L28
            java.lang.String r2 = r4.mDataDirectorySuffix
            androidx.webkit.internal.ApiHelperForP.setDataDirectorySuffix(r2)
            goto L2f
        L28:
            java.lang.String r2 = "DATA_DIRECTORY_SUFFIX"
            java.lang.String r3 = r4.mDataDirectorySuffix
            r0.put(r2, r3)
        L2f:
            java.lang.String r1 = r4.mDataDirectoryBasePath
            if (r1 == 0) goto L3a
            java.lang.String r1 = "DATA_DIRECTORY_BASE_PATH"
            java.lang.String r2 = r4.mDataDirectoryBasePath
            r0.put(r1, r2)
        L3a:
            java.lang.String r1 = r4.mCacheDirectoryBasePath
            if (r1 == 0) goto L45
            java.lang.String r1 = "CACHE_DIRECTORY_BASE_PATH"
            java.lang.String r2 = r4.mCacheDirectoryBasePath
            r0.put(r1, r2)
        L45:
            java.lang.Boolean r1 = r4.mPartitionedCookiesEnabled
            if (r1 == 0) goto L50
            java.lang.String r1 = "CONFIGURE_PARTITIONED_COOKIES"
            java.lang.Boolean r2 = r4.mPartitionedCookiesEnabled
            r0.put(r1, r2)
        L50:
            java.util.concurrent.atomic.AtomicReference<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = androidx.webkit.ProcessGlobalConfig.sProcessGlobalConfig
            r2 = 0
            boolean r1 = androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(r1, r2, r0)
            if (r1 == 0) goto L5a
            return
        L5a:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Attempting to set ProcessGlobalConfig#sProcessGlobalConfig when it was already set"
            r1.<init>(r2)
            throw r1
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "WebView has already been loaded in the current process, so any attempt to apply the settings in ProcessGlobalConfig will have no effect. ProcessGlobalConfig#apply needs to be called before any calls to android.webkit APIs, such as during early app startup."
            r1.<init>(r2)
            throw r1
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = "ProcessGlobalConfig#apply was called more than once, which is an illegal operation. The configuration settings provided by ProcessGlobalConfig take effect only once, when WebView is first loaded into the current process. Every process should only ever create a single instance of ProcessGlobalConfig and apply it once, before any calls to android.webkit APIs, such as during early app startup."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L72
            throw r1     // Catch: java.lang.Throwable -> L72
        L72:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            throw r1
    }

    private static boolean webViewCurrentlyLoaded() {
            r0 = 0
            java.lang.String r1 = "android.webkit.WebViewFactory"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L1a
            java.lang.String r2 = "sProviderInstance"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L1a
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Exception -> L1a
            r4 = 0
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Exception -> L1a
            if (r4 == 0) goto L19
            r0 = r3
        L19:
            return r0
        L1a:
            r1 = move-exception
            return r0
    }

    public androidx.webkit.ProcessGlobalConfig setDataDirectorySuffix(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            androidx.webkit.internal.StartupApiFeature$P r0 = androidx.webkit.internal.WebViewFeatureInternal.STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX
            boolean r1 = r0.isSupported(r5)
            if (r1 == 0) goto L42
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L3a
            char r1 = java.io.File.separatorChar
            int r1 = r6.indexOf(r1)
            if (r1 >= 0) goto L1b
            r4.mDataDirectorySuffix = r6
            return r4
        L1b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Suffix "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r3 = " contains a path separator"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L3a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Suffix cannot be an empty string"
            r1.<init>(r2)
            throw r1
        L42:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public androidx.webkit.ProcessGlobalConfig setDirectoryBasePaths(android.content.Context r4, java.io.File r5, java.io.File r6) {
            r3 = this;
            androidx.webkit.internal.StartupApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH
            boolean r1 = r0.isSupported(r4)
            if (r1 == 0) goto L31
            boolean r1 = r5.isAbsolute()
            if (r1 == 0) goto L29
            boolean r1 = r6.isAbsolute()
            if (r1 == 0) goto L21
            java.lang.String r1 = r5.getAbsolutePath()
            r3.mDataDirectoryBasePath = r1
            java.lang.String r1 = r6.getAbsolutePath()
            r3.mCacheDirectoryBasePath = r1
            return r3
        L21:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "cacheDirectoryBasePath must be a non-empty absolute path"
            r1.<init>(r2)
            throw r1
        L29:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "dataDirectoryBasePath must be a non-empty absolute path"
            r1.<init>(r2)
            throw r1
        L31:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public androidx.webkit.ProcessGlobalConfig setPartitionedCookiesEnabled(android.content.Context r3, boolean r4) {
            r2 = this;
            androidx.webkit.internal.StartupApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES
            boolean r1 = r0.isSupported(r3)
            if (r1 == 0) goto Lf
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r2.mPartitionedCookiesEnabled = r1
            return r2
        Lf:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }
}
