package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public class CookieManagerCompat {
    private CookieManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static androidx.webkit.internal.CookieManagerAdapter getAdapter(android.webkit.CookieManager r1) {
            androidx.webkit.internal.WebkitToCompatConverter r0 = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter()
            androidx.webkit.internal.CookieManagerAdapter r0 = r0.convertCookieManager(r1)
            return r0
    }

    public static java.util.List<java.lang.String> getCookieInfo(android.webkit.CookieManager r2, java.lang.String r3) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.GET_COOKIE_INFO
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            androidx.webkit.internal.CookieManagerAdapter r1 = getAdapter(r2)
            java.util.List r1 = r1.getCookieInfo(r3)
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }
}
