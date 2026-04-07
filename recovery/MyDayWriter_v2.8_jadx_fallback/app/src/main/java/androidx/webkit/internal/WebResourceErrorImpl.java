package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebResourceErrorImpl extends androidx.webkit.WebResourceErrorCompat {
    private org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface mBoundaryInterface;
    private android.webkit.WebResourceError mFrameworksImpl;

    public WebResourceErrorImpl(android.webkit.WebResourceError r1) {
            r0 = this;
            r0.<init>()
            r0.mFrameworksImpl = r1
            return
    }

    public WebResourceErrorImpl(java.lang.reflect.InvocationHandler r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r2)
            org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface) r0
            r1.mBoundaryInterface = r0
            return
    }

    private org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface getBoundaryInterface() {
            r3 = this;
            org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface r0 = r3.mBoundaryInterface
            if (r0 != 0) goto L18
            java.lang.Class<org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface.class
            androidx.webkit.internal.WebkitToCompatConverter r1 = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter()
            android.webkit.WebResourceError r2 = r3.mFrameworksImpl
            java.lang.reflect.InvocationHandler r1 = r1.convertWebResourceError(r2)
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r1)
            org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface) r0
            r3.mBoundaryInterface = r0
        L18:
            org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface r0 = r3.mBoundaryInterface
            return r0
    }

    private android.webkit.WebResourceError getFrameworksImpl() {
            r2 = this;
            android.webkit.WebResourceError r0 = r2.mFrameworksImpl
            if (r0 != 0) goto L14
            androidx.webkit.internal.WebkitToCompatConverter r0 = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter()
            org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface r1 = r2.mBoundaryInterface
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r1)
            android.webkit.WebResourceError r0 = r0.convertWebResourceError(r1)
            r2.mFrameworksImpl = r0
        L14:
            android.webkit.WebResourceError r0 = r2.mFrameworksImpl
            return r0
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public java.lang.CharSequence getDescription() {
            r2 = this;
            androidx.webkit.internal.ApiFeature$M r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_RESOURCE_ERROR_GET_DESCRIPTION
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L11
            android.webkit.WebResourceError r1 = r2.getFrameworksImpl()
            java.lang.CharSequence r1 = androidx.webkit.internal.ApiHelperForM.getDescription(r1)
            return r1
        L11:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L20
            org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface r1 = r2.getBoundaryInterface()
            java.lang.CharSequence r1 = r1.getDescription()
            return r1
        L20:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public int getErrorCode() {
            r2 = this;
            androidx.webkit.internal.ApiFeature$M r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_RESOURCE_ERROR_GET_CODE
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L11
            android.webkit.WebResourceError r1 = r2.getFrameworksImpl()
            int r1 = androidx.webkit.internal.ApiHelperForM.getErrorCode(r1)
            return r1
        L11:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L20
            org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface r1 = r2.getBoundaryInterface()
            int r1 = r1.getErrorCode()
            return r1
        L20:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }
}
