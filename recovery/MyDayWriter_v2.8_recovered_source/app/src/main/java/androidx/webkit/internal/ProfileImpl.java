package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class ProfileImpl implements androidx.webkit.Profile {
    private final org.chromium.support_lib_boundary.ProfileBoundaryInterface mProfileImpl;

    private ProfileImpl() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mProfileImpl = r0
            return
    }

    ProfileImpl(org.chromium.support_lib_boundary.ProfileBoundaryInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mProfileImpl = r1
            return
    }

    @Override // androidx.webkit.Profile
    public void clearPrefetchAsync(java.lang.String r4, java.util.concurrent.Executor r5, androidx.webkit.OutcomeReceiverCompat<java.lang.Void, androidx.webkit.PrefetchException> r6) {
            r3 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.PROFILE_URL_PREFETCH
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L12
            org.chromium.support_lib_boundary.ProfileBoundaryInterface r1 = r3.mProfileImpl
            java.lang.reflect.InvocationHandler r2 = androidx.webkit.internal.PrefetchOperationCallbackAdapter.buildInvocationHandler(r6)
            r1.clearPrefetch(r4, r5, r2)
            return
        L12:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.Profile
    public android.webkit.CookieManager getCookieManager() throws java.lang.IllegalStateException {
            r2 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto Lf
            org.chromium.support_lib_boundary.ProfileBoundaryInterface r1 = r2.mProfileImpl
            android.webkit.CookieManager r1 = r1.getCookieManager()
            return r1
        Lf:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.Profile
    public android.webkit.GeolocationPermissions getGeolocationPermissions() throws java.lang.IllegalStateException {
            r2 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto Lf
            org.chromium.support_lib_boundary.ProfileBoundaryInterface r1 = r2.mProfileImpl
            android.webkit.GeolocationPermissions r1 = r1.getGeoLocationPermissions()
            return r1
        Lf:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.Profile
    public java.lang.String getName() {
            r2 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto Lf
            org.chromium.support_lib_boundary.ProfileBoundaryInterface r1 = r2.mProfileImpl
            java.lang.String r1 = r1.getName()
            return r1
        Lf:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.Profile
    public android.webkit.ServiceWorkerController getServiceWorkerController() throws java.lang.IllegalStateException {
            r2 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto Lf
            org.chromium.support_lib_boundary.ProfileBoundaryInterface r1 = r2.mProfileImpl
            android.webkit.ServiceWorkerController r1 = r1.getServiceWorkerController()
            return r1
        Lf:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.Profile
    public android.webkit.WebStorage getWebStorage() throws java.lang.IllegalStateException {
            r2 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto Lf
            org.chromium.support_lib_boundary.ProfileBoundaryInterface r1 = r2.mProfileImpl
            android.webkit.WebStorage r1 = r1.getWebStorage()
            return r1
        Lf:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.Profile
    public void prefetchUrlAsync(java.lang.String r4, android.os.CancellationSignal r5, java.util.concurrent.Executor r6, androidx.webkit.OutcomeReceiverCompat<java.lang.Void, androidx.webkit.PrefetchException> r7) {
            r3 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.PROFILE_URL_PREFETCH
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L12
            org.chromium.support_lib_boundary.ProfileBoundaryInterface r1 = r3.mProfileImpl
            java.lang.reflect.InvocationHandler r2 = androidx.webkit.internal.PrefetchOperationCallbackAdapter.buildInvocationHandler(r7)
            r1.prefetchUrl(r4, r5, r6, r2)
            return
        L12:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.Profile
    public void prefetchUrlAsync(java.lang.String r9, android.os.CancellationSignal r10, java.util.concurrent.Executor r11, androidx.webkit.SpeculativeLoadingParameters r12, androidx.webkit.OutcomeReceiverCompat<java.lang.Void, androidx.webkit.PrefetchException> r13) {
            r8 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.PROFILE_URL_PREFETCH
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1f
            androidx.webkit.internal.SpeculativeLoadingParametersAdapter r1 = new androidx.webkit.internal.SpeculativeLoadingParametersAdapter
            r1.<init>(r12)
            java.lang.reflect.InvocationHandler r6 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r1)
            org.chromium.support_lib_boundary.ProfileBoundaryInterface r2 = r8.mProfileImpl
            java.lang.reflect.InvocationHandler r7 = androidx.webkit.internal.PrefetchOperationCallbackAdapter.buildInvocationHandler(r13)
            r3 = r9
            r4 = r10
            r5 = r11
            r2.prefetchUrl(r3, r4, r5, r6, r7)
            return
        L1f:
            r3 = r9
            java.lang.UnsupportedOperationException r9 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r9
    }

    @Override // androidx.webkit.Profile
    public void setSpeculativeLoadingConfig(androidx.webkit.SpeculativeLoadingConfig r4) {
            r3 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.SPECULATIVE_LOADING_CONFIG
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L18
            androidx.webkit.internal.SpeculativeLoadingConfigAdapter r1 = new androidx.webkit.internal.SpeculativeLoadingConfigAdapter
            r1.<init>(r4)
            java.lang.reflect.InvocationHandler r1 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r1)
            org.chromium.support_lib_boundary.ProfileBoundaryInterface r2 = r3.mProfileImpl
            r2.setSpeculativeLoadingConfig(r1)
            return
        L18:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }
}
