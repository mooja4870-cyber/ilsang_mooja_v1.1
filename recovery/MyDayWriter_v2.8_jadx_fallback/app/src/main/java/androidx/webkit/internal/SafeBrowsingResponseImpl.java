package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class SafeBrowsingResponseImpl extends androidx.webkit.SafeBrowsingResponseCompat {
    private org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface mBoundaryInterface;
    private android.webkit.SafeBrowsingResponse mFrameworksImpl;

    public SafeBrowsingResponseImpl(android.webkit.SafeBrowsingResponse r1) {
            r0 = this;
            r0.<init>()
            r0.mFrameworksImpl = r1
            return
    }

    public SafeBrowsingResponseImpl(java.lang.reflect.InvocationHandler r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface> r0 = org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r2)
            org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface r0 = (org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface) r0
            r1.mBoundaryInterface = r0
            return
    }

    private org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface getBoundaryInterface() {
            r3 = this;
            org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface r0 = r3.mBoundaryInterface
            if (r0 != 0) goto L18
            java.lang.Class<org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface> r0 = org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface.class
            androidx.webkit.internal.WebkitToCompatConverter r1 = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter()
            android.webkit.SafeBrowsingResponse r2 = r3.mFrameworksImpl
            java.lang.reflect.InvocationHandler r1 = r1.convertSafeBrowsingResponse(r2)
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r1)
            org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface r0 = (org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface) r0
            r3.mBoundaryInterface = r0
        L18:
            org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface r0 = r3.mBoundaryInterface
            return r0
    }

    private android.webkit.SafeBrowsingResponse getFrameworksImpl() {
            r2 = this;
            android.webkit.SafeBrowsingResponse r0 = r2.mFrameworksImpl
            if (r0 != 0) goto L15
        L5:
            androidx.webkit.internal.WebkitToCompatConverter r0 = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter()
            org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface r1 = r2.mBoundaryInterface
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r1)
            android.webkit.SafeBrowsingResponse r0 = r0.convertSafeBrowsingResponse(r1)
            r2.mFrameworksImpl = r0
        L15:
            android.webkit.SafeBrowsingResponse r0 = r2.mFrameworksImpl
            return r0
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void backToSafety(boolean r3) {
            r2 = this;
            androidx.webkit.internal.ApiFeature$O_MR1 r0 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L10
            android.webkit.SafeBrowsingResponse r1 = r2.getFrameworksImpl()
            androidx.webkit.internal.ApiHelperForOMR1.backToSafety(r1, r3)
            goto L1d
        L10:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1e
            org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface r1 = r2.getBoundaryInterface()
            r1.backToSafety(r3)
        L1d:
            return
        L1e:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void proceed(boolean r3) {
            r2 = this;
            androidx.webkit.internal.ApiFeature$O_MR1 r0 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_PROCEED
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L10
            android.webkit.SafeBrowsingResponse r1 = r2.getFrameworksImpl()
            androidx.webkit.internal.ApiHelperForOMR1.proceed(r1, r3)
            goto L1d
        L10:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1e
            org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface r1 = r2.getBoundaryInterface()
            r1.proceed(r3)
        L1d:
            return
        L1e:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void showInterstitial(boolean r3) {
            r2 = this;
            androidx.webkit.internal.ApiFeature$O_MR1 r0 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L10
            android.webkit.SafeBrowsingResponse r1 = r2.getFrameworksImpl()
            androidx.webkit.internal.ApiHelperForOMR1.showInterstitial(r1, r3)
            goto L1d
        L10:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1e
            org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface r1 = r2.getBoundaryInterface()
            r1.showInterstitial(r3)
        L1d:
            return
        L1e:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }
}
