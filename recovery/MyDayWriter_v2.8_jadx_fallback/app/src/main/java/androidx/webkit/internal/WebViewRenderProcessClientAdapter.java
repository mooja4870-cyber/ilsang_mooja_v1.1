package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebViewRenderProcessClientAdapter implements org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface {
    private static final java.lang.String[] sSupportedFeatures = null;
    private final java.util.concurrent.Executor mExecutor;
    private final androidx.webkit.WebViewRenderProcessClient mWebViewRenderProcessClient;

    static {
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"
            r0[r1] = r2
            androidx.webkit.internal.WebViewRenderProcessClientAdapter.sSupportedFeatures = r0
            return
    }

    public WebViewRenderProcessClientAdapter(java.util.concurrent.Executor r1, androidx.webkit.WebViewRenderProcessClient r2) {
            r0 = this;
            r0.<init>()
            r0.mExecutor = r1
            r0.mWebViewRenderProcessClient = r2
            return
    }

    static /* synthetic */ void lambda$onRendererResponsive$1(androidx.webkit.WebViewRenderProcessClient r0, android.webkit.WebView r1, androidx.webkit.WebViewRenderProcess r2) {
            r0.onRenderProcessResponsive(r1, r2)
            return
    }

    static /* synthetic */ void lambda$onRendererUnresponsive$0(androidx.webkit.WebViewRenderProcessClient r0, android.webkit.WebView r1, androidx.webkit.WebViewRenderProcess r2) {
            r0.onRenderProcessUnresponsive(r1, r2)
            return
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final java.lang.String[] getSupportedFeatures() {
            r1 = this;
            java.lang.String[] r0 = androidx.webkit.internal.WebViewRenderProcessClientAdapter.sSupportedFeatures
            return r0
    }

    public androidx.webkit.WebViewRenderProcessClient getWebViewRenderProcessClient() {
            r1 = this;
            androidx.webkit.WebViewRenderProcessClient r0 = r1.mWebViewRenderProcessClient
            return r0
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(android.webkit.WebView r5, java.lang.reflect.InvocationHandler r6) {
            r4 = this;
            androidx.webkit.internal.WebViewRenderProcessImpl r0 = androidx.webkit.internal.WebViewRenderProcessImpl.forInvocationHandler(r6)
            androidx.webkit.WebViewRenderProcessClient r1 = r4.mWebViewRenderProcessClient
            java.util.concurrent.Executor r2 = r4.mExecutor
            if (r2 != 0) goto Lf
            r1.onRenderProcessResponsive(r5, r0)
            goto L19
        Lf:
            java.util.concurrent.Executor r2 = r4.mExecutor
            androidx.webkit.internal.WebViewRenderProcessClientAdapter$$ExternalSyntheticLambda0 r3 = new androidx.webkit.internal.WebViewRenderProcessClientAdapter$$ExternalSyntheticLambda0
            r3.<init>(r1, r5, r0)
            r2.execute(r3)
        L19:
            return
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(android.webkit.WebView r5, java.lang.reflect.InvocationHandler r6) {
            r4 = this;
            androidx.webkit.internal.WebViewRenderProcessImpl r0 = androidx.webkit.internal.WebViewRenderProcessImpl.forInvocationHandler(r6)
            androidx.webkit.WebViewRenderProcessClient r1 = r4.mWebViewRenderProcessClient
            java.util.concurrent.Executor r2 = r4.mExecutor
            if (r2 != 0) goto Lf
            r1.onRenderProcessUnresponsive(r5, r0)
            goto L19
        Lf:
            java.util.concurrent.Executor r2 = r4.mExecutor
            androidx.webkit.internal.WebViewRenderProcessClientAdapter$$ExternalSyntheticLambda1 r3 = new androidx.webkit.internal.WebViewRenderProcessClientAdapter$$ExternalSyntheticLambda1
            r3.<init>(r1, r5, r0)
            r2.execute(r3)
        L19:
            return
    }
}
