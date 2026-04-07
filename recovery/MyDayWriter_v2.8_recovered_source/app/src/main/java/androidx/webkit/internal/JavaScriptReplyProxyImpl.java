package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class JavaScriptReplyProxyImpl extends androidx.webkit.JavaScriptReplyProxy {
    private final org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface mBoundaryInterface;

    public JavaScriptReplyProxyImpl(org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mBoundaryInterface = r1
            return
    }

    public static androidx.webkit.internal.JavaScriptReplyProxyImpl forInvocationHandler(java.lang.reflect.InvocationHandler r2) {
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r0 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r2)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r0 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r0
            androidx.webkit.internal.JavaScriptReplyProxyImpl$$ExternalSyntheticLambda0 r1 = new androidx.webkit.internal.JavaScriptReplyProxyImpl$$ExternalSyntheticLambda0
            r1.<init>(r0)
            java.lang.Object r1 = r0.getOrCreatePeer(r1)
            androidx.webkit.internal.JavaScriptReplyProxyImpl r1 = (androidx.webkit.internal.JavaScriptReplyProxyImpl) r1
            return r1
    }

    static /* synthetic */ java.lang.Object lambda$forInvocationHandler$0(org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r1) throws java.lang.Exception {
            androidx.webkit.internal.JavaScriptReplyProxyImpl r0 = new androidx.webkit.internal.JavaScriptReplyProxyImpl
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(java.lang.String r3) {
            r2 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_LISTENER
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto Le
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r1 = r2.mBoundaryInterface
            r1.postMessage(r3)
            return
        Le:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(byte[] r4) {
            r3 = this;
            java.lang.String r0 = "ArrayBuffer must be non-null"
            java.util.Objects.requireNonNull(r4, r0)
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1c
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r1 = r3.mBoundaryInterface
            androidx.webkit.internal.WebMessagePayloadAdapter r2 = new androidx.webkit.internal.WebMessagePayloadAdapter
            r2.<init>(r4)
            java.lang.reflect.InvocationHandler r2 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r2)
            r1.postMessageWithPayload(r2)
            return
        L1c:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }
}
