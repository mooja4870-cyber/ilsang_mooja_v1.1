package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public abstract class WebViewRenderProcessClient {
    public WebViewRenderProcessClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void onRenderProcessResponsive(android.webkit.WebView r1, androidx.webkit.WebViewRenderProcess r2);

    public abstract void onRenderProcessUnresponsive(android.webkit.WebView r1, androidx.webkit.WebViewRenderProcess r2);
}
