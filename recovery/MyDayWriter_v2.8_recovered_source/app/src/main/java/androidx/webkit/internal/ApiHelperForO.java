package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class ApiHelperForO {
    private ApiHelperForO() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.pm.PackageInfo getCurrentWebViewPackage() {
            android.content.pm.PackageInfo r0 = android.webkit.WebView.getCurrentWebViewPackage()
            return r0
    }

    public static boolean getSafeBrowsingEnabled(android.webkit.WebSettings r1) {
            boolean r0 = r1.getSafeBrowsingEnabled()
            return r0
    }

    public static android.webkit.WebChromeClient getWebChromeClient(android.webkit.WebView r1) {
            android.webkit.WebChromeClient r0 = r1.getWebChromeClient()
            return r0
    }

    public static android.webkit.WebViewClient getWebViewClient(android.webkit.WebView r1) {
            android.webkit.WebViewClient r0 = r1.getWebViewClient()
            return r0
    }

    public static void setSafeBrowsingEnabled(android.webkit.WebSettings r0, boolean r1) {
            r0.setSafeBrowsingEnabled(r1)
            return
    }
}
