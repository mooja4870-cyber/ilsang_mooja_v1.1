package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class TracingControllerImpl extends androidx.webkit.TracingController {
    private org.chromium.support_lib_boundary.TracingControllerBoundaryInterface mBoundaryInterface;
    private android.webkit.TracingController mFrameworksImpl;

    public TracingControllerImpl() {
            r3 = this;
            r3.<init>()
            androidx.webkit.internal.ApiFeature$P r0 = androidx.webkit.internal.WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE
            boolean r1 = r0.isSupportedByFramework()
            r2 = 0
            if (r1 == 0) goto L15
            android.webkit.TracingController r1 = androidx.webkit.internal.ApiHelperForP.getTracingControllerInstance()
            r3.mFrameworksImpl = r1
            r3.mBoundaryInterface = r2
            goto L27
        L15:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L28
            r3.mFrameworksImpl = r2
            androidx.webkit.internal.WebViewProviderFactory r1 = androidx.webkit.internal.WebViewGlueCommunicator.getFactory()
            org.chromium.support_lib_boundary.TracingControllerBoundaryInterface r1 = r1.getTracingController()
            r3.mBoundaryInterface = r1
        L27:
            return
        L28:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    private org.chromium.support_lib_boundary.TracingControllerBoundaryInterface getBoundaryInterface() {
            r1 = this;
            org.chromium.support_lib_boundary.TracingControllerBoundaryInterface r0 = r1.mBoundaryInterface
            if (r0 != 0) goto Le
            androidx.webkit.internal.WebViewProviderFactory r0 = androidx.webkit.internal.WebViewGlueCommunicator.getFactory()
            org.chromium.support_lib_boundary.TracingControllerBoundaryInterface r0 = r0.getTracingController()
            r1.mBoundaryInterface = r0
        Le:
            org.chromium.support_lib_boundary.TracingControllerBoundaryInterface r0 = r1.mBoundaryInterface
            return r0
    }

    private android.webkit.TracingController getFrameworksImpl() {
            r1 = this;
            android.webkit.TracingController r0 = r1.mFrameworksImpl
            if (r0 != 0) goto La
            android.webkit.TracingController r0 = androidx.webkit.internal.ApiHelperForP.getTracingControllerInstance()
            r1.mFrameworksImpl = r0
        La:
            android.webkit.TracingController r0 = r1.mFrameworksImpl
            return r0
    }

    @Override // androidx.webkit.TracingController
    public boolean isTracing() {
            r2 = this;
            androidx.webkit.internal.ApiFeature$P r0 = androidx.webkit.internal.WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L11
            android.webkit.TracingController r1 = r2.getFrameworksImpl()
            boolean r1 = androidx.webkit.internal.ApiHelperForP.isTracing(r1)
            return r1
        L11:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L20
            org.chromium.support_lib_boundary.TracingControllerBoundaryInterface r1 = r2.getBoundaryInterface()
            boolean r1 = r1.isTracing()
            return r1
        L20:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.TracingController
    public void start(androidx.webkit.TracingConfig r6) {
            r5 = this;
            if (r6 == 0) goto L31
            androidx.webkit.internal.ApiFeature$P r0 = androidx.webkit.internal.WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L12
            android.webkit.TracingController r1 = r5.getFrameworksImpl()
            androidx.webkit.internal.ApiHelperForP.start(r1, r6)
            goto L2b
        L12:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L2c
            org.chromium.support_lib_boundary.TracingControllerBoundaryInterface r1 = r5.getBoundaryInterface()
            int r2 = r6.getPredefinedCategories()
            java.util.List r3 = r6.getCustomIncludedCategories()
            int r4 = r6.getTracingMode()
            r1.start(r2, r3, r4)
        L2b:
            return
        L2c:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
        L31:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Tracing config must be non null"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.webkit.TracingController
    public boolean stop(java.io.OutputStream r3, java.util.concurrent.Executor r4) {
            r2 = this;
            androidx.webkit.internal.ApiFeature$P r0 = androidx.webkit.internal.WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L11
            android.webkit.TracingController r1 = r2.getFrameworksImpl()
            boolean r1 = androidx.webkit.internal.ApiHelperForP.stop(r1, r3, r4)
            return r1
        L11:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L20
            org.chromium.support_lib_boundary.TracingControllerBoundaryInterface r1 = r2.getBoundaryInterface()
            boolean r1 = r1.stop(r3, r4)
            return r1
        L20:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }
}
