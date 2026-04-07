package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public class WebResourceRequestCompat {
    private WebResourceRequestCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static androidx.webkit.internal.WebResourceRequestAdapter getAdapter(android.webkit.WebResourceRequest r1) {
            androidx.webkit.internal.WebkitToCompatConverter r0 = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter()
            androidx.webkit.internal.WebResourceRequestAdapter r0 = r0.convertWebResourceRequest(r1)
            return r0
    }

    public static boolean isRedirect(android.webkit.WebResourceRequest r2) {
            androidx.webkit.internal.ApiFeature$N r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_RESOURCE_REQUEST_IS_REDIRECT
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto Ld
            boolean r1 = androidx.webkit.internal.ApiHelperForN.isRedirect(r2)
            return r1
        Ld:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1c
            androidx.webkit.internal.WebResourceRequestAdapter r1 = getAdapter(r2)
            boolean r1 = r1.isRedirect()
            return r1
        L1c:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }
}
