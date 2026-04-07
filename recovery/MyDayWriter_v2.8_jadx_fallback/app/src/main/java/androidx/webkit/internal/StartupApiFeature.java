package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class StartupApiFeature {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final java.lang.String METADATA_HOLDER_SERVICE_NAME = "org.chromium.android_webview.services.StartupFeatureMetadataHolder";
    private static final java.util.Set<androidx.webkit.internal.StartupApiFeature> sValues = null;
    private final java.lang.String mInternalFeatureValue;
    private final java.lang.String mPublicFeatureValue;

    public static class NoFramework extends androidx.webkit.internal.StartupApiFeature {
        NoFramework(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.webkit.internal.StartupApiFeature
        public final boolean isSupportedByFramework() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    public static class P extends androidx.webkit.internal.StartupApiFeature {
        P(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.webkit.internal.StartupApiFeature
        public final boolean isSupportedByFramework() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.webkit.internal.StartupApiFeature.sValues = r0
            return
    }

    StartupApiFeature(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r1.mPublicFeatureValue = r2
            r1.mInternalFeatureValue = r3
            java.util.Set<androidx.webkit.internal.StartupApiFeature> r0 = androidx.webkit.internal.StartupApiFeature.sValues
            r0.add(r1)
            return
    }

    private static android.os.Bundle getMetaDataFromWebViewManifestOrNull(android.content.Context r5) {
            android.content.pm.PackageInfo r0 = androidx.webkit.WebViewCompat.getCurrentWebViewPackage(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = r0.packageName
            java.lang.String r4 = "org.chromium.android_webview.services.StartupFeatureMetadataHolder"
            r2.<init>(r3, r4)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r3 < r4) goto L2b
        L18:
            r3 = 640(0x280, double:3.16E-321)
            android.content.pm.PackageManager$ComponentInfoFlags r3 = androidx.webkit.internal.ApiHelperForTiramisu.of(r3)
            android.content.pm.PackageManager r4 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            android.content.pm.ServiceInfo r4 = androidx.webkit.internal.ApiHelperForTiramisu.getServiceInfo(r4, r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            android.os.Bundle r1 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            return r1
        L29:
            r4 = move-exception
            return r1
        L2b:
            r3 = 128(0x80, float:1.8E-43)
            r3 = r3 | 512(0x200, float:7.17E-43)
            android.content.pm.ServiceInfo r4 = getServiceInfo(r5, r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.os.Bundle r1 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            return r1
        L37:
            r4 = move-exception
            return r1
    }

    private static android.content.pm.ServiceInfo getServiceInfo(android.content.Context r2, android.content.ComponentName r3, int r4) throws android.content.pm.PackageManager.NameNotFoundException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto Lf
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            android.content.pm.ServiceInfo r0 = r0.getServiceInfo(r3, r4)
            return r0
        Lf:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    public static java.util.Set<androidx.webkit.internal.StartupApiFeature> values() {
            java.util.Set<androidx.webkit.internal.StartupApiFeature> r0 = androidx.webkit.internal.StartupApiFeature.sValues
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    public java.lang.String getPublicFeatureName() {
            r1 = this;
            java.lang.String r0 = r1.mPublicFeatureValue
            return r0
    }

    public boolean isSupported(android.content.Context r2) {
            r1 = this;
            boolean r0 = r1.isSupportedByFramework()
            if (r0 != 0) goto Lf
            boolean r0 = r1.isSupportedByWebView(r2)
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    public abstract boolean isSupportedByFramework();

    public boolean isSupportedByWebView(android.content.Context r3) {
            r2 = this;
            android.os.Bundle r0 = getMetaDataFromWebViewManifestOrNull(r3)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = r2.mInternalFeatureValue
            boolean r1 = r0.containsKey(r1)
            return r1
    }
}
