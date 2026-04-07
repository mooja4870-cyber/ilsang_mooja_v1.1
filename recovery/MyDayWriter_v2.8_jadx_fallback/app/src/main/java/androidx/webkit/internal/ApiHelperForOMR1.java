package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class ApiHelperForOMR1 {
    private ApiHelperForOMR1() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void backToSafety(android.webkit.SafeBrowsingResponse r0, boolean r1) {
            r0.backToSafety(r1)
            return
    }

    public static android.net.Uri getSafeBrowsingPrivacyPolicyUrl() {
            android.net.Uri r0 = android.webkit.WebView.getSafeBrowsingPrivacyPolicyUrl()
            return r0
    }

    public static void proceed(android.webkit.SafeBrowsingResponse r0, boolean r1) {
            r0.proceed(r1)
            return
    }

    public static void setSafeBrowsingWhitelist(java.util.List<java.lang.String> r0, android.webkit.ValueCallback<java.lang.Boolean> r1) {
            android.webkit.WebView.setSafeBrowsingWhitelist(r0, r1)
            return
    }

    public static void showInterstitial(android.webkit.SafeBrowsingResponse r0, boolean r1) {
            r0.showInterstitial(r1)
            return
    }

    public static void startSafeBrowsing(android.content.Context r0, android.webkit.ValueCallback<java.lang.Boolean> r1) {
            android.webkit.WebView.startSafeBrowsing(r0, r1)
            return
    }
}
