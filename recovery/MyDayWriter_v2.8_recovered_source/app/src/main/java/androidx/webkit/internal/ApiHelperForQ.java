package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class ApiHelperForQ {
    private ApiHelperForQ() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static int getForceDark(android.webkit.WebSettings r1) {
            int r0 = r1.getForceDark()
            return r0
    }

    public static android.webkit.WebViewRenderProcess getWebViewRenderProcess(android.webkit.WebView r1) {
            android.webkit.WebViewRenderProcess r0 = r1.getWebViewRenderProcess()
            return r0
    }

    public static android.webkit.WebViewRenderProcessClient getWebViewRenderProcessClient(android.webkit.WebView r1) {
            android.webkit.WebViewRenderProcessClient r0 = r1.getWebViewRenderProcessClient()
            return r0
    }

    @java.lang.Deprecated
    public static void setForceDark(android.webkit.WebSettings r0, int r1) {
            r0.setForceDark(r1)
            return
    }

    public static void setWebViewRenderProcessClient(android.webkit.WebView r1, androidx.webkit.WebViewRenderProcessClient r2) {
            if (r2 == 0) goto L8
            androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter r0 = new androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            r1.setWebViewRenderProcessClient(r0)
            return
    }

    public static void setWebViewRenderProcessClient(android.webkit.WebView r1, java.util.concurrent.Executor r2, androidx.webkit.WebViewRenderProcessClient r3) {
            if (r3 == 0) goto L8
            androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter r0 = new androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter
            r0.<init>(r3)
            goto L9
        L8:
            r0 = 0
        L9:
            r1.setWebViewRenderProcessClient(r2, r0)
            return
    }

    public static boolean terminate(android.webkit.WebViewRenderProcess r1) {
            boolean r0 = r1.terminate()
            return r0
    }
}
