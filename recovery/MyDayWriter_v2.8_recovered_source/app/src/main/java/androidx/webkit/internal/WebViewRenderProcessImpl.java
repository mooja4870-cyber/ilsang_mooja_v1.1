package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebViewRenderProcessImpl extends androidx.webkit.WebViewRenderProcess {
    private static final java.util.WeakHashMap<android.webkit.WebViewRenderProcess, androidx.webkit.internal.WebViewRenderProcessImpl> sFrameworkMap = null;
    private org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface mBoundaryInterface;
    private java.lang.ref.WeakReference<android.webkit.WebViewRenderProcess> mFrameworkObject;

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            androidx.webkit.internal.WebViewRenderProcessImpl.sFrameworkMap = r0
            return
    }

    public WebViewRenderProcessImpl(android.webkit.WebViewRenderProcess r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.mFrameworkObject = r0
            return
    }

    public WebViewRenderProcessImpl(org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mBoundaryInterface = r1
            return
    }

    public static androidx.webkit.internal.WebViewRenderProcessImpl forFrameworkObject(android.webkit.WebViewRenderProcess r2) {
            java.util.WeakHashMap<android.webkit.WebViewRenderProcess, androidx.webkit.internal.WebViewRenderProcessImpl> r0 = androidx.webkit.internal.WebViewRenderProcessImpl.sFrameworkMap
            java.lang.Object r0 = r0.get(r2)
            androidx.webkit.internal.WebViewRenderProcessImpl r0 = (androidx.webkit.internal.WebViewRenderProcessImpl) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            androidx.webkit.internal.WebViewRenderProcessImpl r1 = new androidx.webkit.internal.WebViewRenderProcessImpl
            r1.<init>(r2)
            java.util.WeakHashMap<android.webkit.WebViewRenderProcess, androidx.webkit.internal.WebViewRenderProcessImpl> r0 = androidx.webkit.internal.WebViewRenderProcessImpl.sFrameworkMap
            r0.put(r2, r1)
            return r1
    }

    public static androidx.webkit.internal.WebViewRenderProcessImpl forInvocationHandler(java.lang.reflect.InvocationHandler r2) {
            java.lang.Class<org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r2)
            org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface) r0
            androidx.webkit.internal.WebViewRenderProcessImpl$$ExternalSyntheticLambda0 r1 = new androidx.webkit.internal.WebViewRenderProcessImpl$$ExternalSyntheticLambda0
            r1.<init>(r0)
            java.lang.Object r1 = r0.getOrCreatePeer(r1)
            androidx.webkit.internal.WebViewRenderProcessImpl r1 = (androidx.webkit.internal.WebViewRenderProcessImpl) r1
            return r1
    }

    static /* synthetic */ java.lang.Object lambda$forInvocationHandler$0(org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface r1) throws java.lang.Exception {
            androidx.webkit.internal.WebViewRenderProcessImpl r0 = new androidx.webkit.internal.WebViewRenderProcessImpl
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.webkit.WebViewRenderProcess
    public boolean terminate() {
            r3 = this;
            androidx.webkit.internal.ApiFeature$Q r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_VIEW_RENDERER_TERMINATE
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L1c
            java.lang.ref.WeakReference<android.webkit.WebViewRenderProcess> r1 = r3.mFrameworkObject
            java.lang.Object r1 = r1.get()
            android.webkit.WebViewRenderProcess r1 = (android.webkit.WebViewRenderProcess) r1
            if (r1 == 0) goto L1a
            boolean r2 = androidx.webkit.internal.ApiHelperForQ.terminate(r1)
            if (r2 == 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
        L1c:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L29
            org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface r1 = r3.mBoundaryInterface
            boolean r1 = r1.terminate()
            return r1
        L29:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }
}
