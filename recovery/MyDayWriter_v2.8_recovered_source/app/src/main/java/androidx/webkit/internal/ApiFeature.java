package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class ApiFeature implements androidx.webkit.internal.ConditionallySupportedFeature {
    private static final java.util.Set<androidx.webkit.internal.ApiFeature> sValues = null;
    private final java.lang.String mInternalFeatureValue;
    private final java.lang.String mPublicFeatureValue;

    private static class LAZY_HOLDER {
        static final java.util.Set<java.lang.String> WEBVIEW_APK_FEATURES = null;

        static {
                java.util.HashSet r0 = new java.util.HashSet
                androidx.webkit.internal.WebViewProviderFactory r1 = androidx.webkit.internal.WebViewGlueCommunicator.getFactory()
                java.lang.String[] r1 = r1.getWebViewFeatures()
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                androidx.webkit.internal.ApiFeature.LAZY_HOLDER.WEBVIEW_APK_FEATURES = r0
                return
        }

        private LAZY_HOLDER() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class M extends androidx.webkit.internal.ApiFeature {
        M(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public static class N extends androidx.webkit.internal.ApiFeature {
        N(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public static class NoFramework extends androidx.webkit.internal.ApiFeature {
        NoFramework(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    public static class O extends androidx.webkit.internal.ApiFeature {
        O(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 < r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }
    }

    public static class O_MR1 extends androidx.webkit.internal.ApiFeature {
        O_MR1(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 27
                if (r0 < r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }
    }

    public static class P extends androidx.webkit.internal.ApiFeature {
        P(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.webkit.internal.ApiFeature
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

    public static class Q extends androidx.webkit.internal.ApiFeature {
        Q(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }
    }

    public static class T extends androidx.webkit.internal.ApiFeature {
        T(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 33
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
            androidx.webkit.internal.ApiFeature.sValues = r0
            return
    }

    ApiFeature(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r1.mPublicFeatureValue = r2
            r1.mInternalFeatureValue = r3
            java.util.Set<androidx.webkit.internal.ApiFeature> r0 = androidx.webkit.internal.ApiFeature.sValues
            r0.add(r1)
            return
    }

    public static java.util.Set<java.lang.String> getWebViewApkFeaturesForTesting() {
            java.util.Set<java.lang.String> r0 = androidx.webkit.internal.ApiFeature.LAZY_HOLDER.WEBVIEW_APK_FEATURES
            return r0
    }

    public static java.util.Set<androidx.webkit.internal.ApiFeature> values() {
            java.util.Set<androidx.webkit.internal.ApiFeature> r0 = androidx.webkit.internal.ApiFeature.sValues
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public java.lang.String getPublicFeatureName() {
            r1 = this;
            java.lang.String r0 = r1.mPublicFeatureValue
            return r0
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public boolean isSupported() {
            r1 = this;
            boolean r0 = r1.isSupportedByFramework()
            if (r0 != 0) goto Lf
            boolean r0 = r1.isSupportedByWebView()
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

    public boolean isSupportedByWebView() {
            r2 = this;
            java.util.Set<java.lang.String> r0 = androidx.webkit.internal.ApiFeature.LAZY_HOLDER.WEBVIEW_APK_FEATURES
            java.lang.String r1 = r2.mInternalFeatureValue
            boolean r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.containsFeature(r0, r1)
            return r0
    }
}
