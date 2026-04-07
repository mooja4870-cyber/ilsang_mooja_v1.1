package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebViewRenderProcessClientFrameworkAdapter extends android.webkit.WebViewRenderProcessClient {
    private final androidx.webkit.WebViewRenderProcessClient mWebViewRenderProcessClient;

    public WebViewRenderProcessClientFrameworkAdapter(androidx.webkit.WebViewRenderProcessClient r1) {
            r0 = this;
            r0.<init>()
            r0.mWebViewRenderProcessClient = r1
            return
    }

    public androidx.webkit.WebViewRenderProcessClient getFrameworkRenderProcessClient() {
            r1 = this;
            androidx.webkit.WebViewRenderProcessClient r0 = r1.mWebViewRenderProcessClient
            return r0
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessResponsive(android.webkit.WebView r3, android.webkit.WebViewRenderProcess r4) {
            r2 = this;
            androidx.webkit.WebViewRenderProcessClient r0 = r2.mWebViewRenderProcessClient
            androidx.webkit.internal.WebViewRenderProcessImpl r1 = androidx.webkit.internal.WebViewRenderProcessImpl.forFrameworkObject(r4)
            r0.onRenderProcessResponsive(r3, r1)
            return
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessUnresponsive(android.webkit.WebView r3, android.webkit.WebViewRenderProcess r4) {
            r2 = this;
            androidx.webkit.WebViewRenderProcessClient r0 = r2.mWebViewRenderProcessClient
            androidx.webkit.internal.WebViewRenderProcessImpl r1 = androidx.webkit.internal.WebViewRenderProcessImpl.forFrameworkObject(r4)
            r0.onRenderProcessUnresponsive(r3, r1)
            return
    }
}
