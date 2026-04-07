package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes7.dex */
@org.jspecify.annotations.NullMarked
public interface WebViewClientBoundaryInterface extends org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface {
    void onPageCommitVisible(android.webkit.WebView r1, java.lang.String r2);

    void onReceivedError(android.webkit.WebView r1, android.webkit.WebResourceRequest r2, java.lang.reflect.InvocationHandler r3);

    void onReceivedHttpError(android.webkit.WebView r1, android.webkit.WebResourceRequest r2, android.webkit.WebResourceResponse r3);

    void onSafeBrowsingHit(android.webkit.WebView r1, android.webkit.WebResourceRequest r2, int r3, java.lang.reflect.InvocationHandler r4);

    boolean shouldOverrideUrlLoading(android.webkit.WebView r1, android.webkit.WebResourceRequest r2);
}
