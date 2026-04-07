package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public class WebViewClientCompat extends android.webkit.WebViewClient implements org.chromium.support_lib_boundary.WebViewClientBoundaryInterface {
    private static final java.lang.String[] sSupportedFeatures = null;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SafeBrowsingThreat {
    }

    static {
            r0 = 5
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "VISUAL_STATE_CALLBACK"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "RECEIVE_WEB_RESOURCE_ERROR"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "RECEIVE_HTTP_ERROR"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "SHOULD_OVERRIDE_WITH_REDIRECTS"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "SAFE_BROWSING_HIT"
            r0[r1] = r2
            androidx.webkit.WebViewClientCompat.sSupportedFeatures = r0
            return
    }

    public WebViewClientCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final java.lang.String[] getSupportedFeatures() {
            r1 = this;
            java.lang.String[] r0 = androidx.webkit.WebViewClientCompat.sSupportedFeatures
            return r0
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onPageCommitVisible(android.webkit.WebView r1, java.lang.String r2) {
            r0 = this;
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView r2, android.webkit.WebResourceRequest r3, android.webkit.WebResourceError r4) {
            r1 = this;
            androidx.webkit.internal.WebResourceErrorImpl r0 = new androidx.webkit.internal.WebResourceErrorImpl
            r0.<init>(r4)
            r1.onReceivedError(r2, r3, r0)
            return
    }

    public void onReceivedError(android.webkit.WebView r4, android.webkit.WebResourceRequest r5, androidx.webkit.WebResourceErrorCompat r6) {
            r3 = this;
            java.lang.String r0 = "WEB_RESOURCE_ERROR_GET_CODE"
            boolean r0 = androidx.webkit.WebViewFeature.isFeatureSupported(r0)
            if (r0 == 0) goto L30
            java.lang.String r0 = "WEB_RESOURCE_ERROR_GET_DESCRIPTION"
            boolean r0 = androidx.webkit.WebViewFeature.isFeatureSupported(r0)
            if (r0 != 0) goto L11
            goto L30
        L11:
            boolean r0 = r5.isForMainFrame()
            if (r0 == 0) goto L2f
        L18:
            int r0 = r6.getErrorCode()
            java.lang.CharSequence r1 = r6.getDescription()
            java.lang.String r1 = r1.toString()
            android.net.Uri r2 = r5.getUrl()
            java.lang.String r2 = r2.toString()
            r3.onReceivedError(r4, r0, r1, r2)
        L2f:
            return
        L30:
            return
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(android.webkit.WebView r2, android.webkit.WebResourceRequest r3, java.lang.reflect.InvocationHandler r4) {
            r1 = this;
            androidx.webkit.internal.WebResourceErrorImpl r0 = new androidx.webkit.internal.WebResourceErrorImpl
            r0.<init>(r4)
            r1.onReceivedError(r2, r3, r0)
            return
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(android.webkit.WebView r1, android.webkit.WebResourceRequest r2, android.webkit.WebResourceResponse r3) {
            r0 = this;
            return
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(android.webkit.WebView r2, android.webkit.WebResourceRequest r3, int r4, android.webkit.SafeBrowsingResponse r5) {
            r1 = this;
            androidx.webkit.internal.SafeBrowsingResponseImpl r0 = new androidx.webkit.internal.SafeBrowsingResponseImpl
            r0.<init>(r5)
            r1.onSafeBrowsingHit(r2, r3, r4, r0)
            return
    }

    public void onSafeBrowsingHit(android.webkit.WebView r2, android.webkit.WebResourceRequest r3, int r4, androidx.webkit.SafeBrowsingResponseCompat r5) {
            r1 = this;
            java.lang.String r0 = "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL"
            boolean r0 = androidx.webkit.WebViewFeature.isFeatureSupported(r0)
            if (r0 == 0) goto Ld
            r0 = 1
            r5.showInterstitial(r0)
            return
        Ld:
            java.lang.UnsupportedOperationException r0 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r0
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(android.webkit.WebView r2, android.webkit.WebResourceRequest r3, int r4, java.lang.reflect.InvocationHandler r5) {
            r1 = this;
            androidx.webkit.internal.SafeBrowsingResponseImpl r0 = new androidx.webkit.internal.SafeBrowsingResponseImpl
            r0.<init>(r5)
            r1.onSafeBrowsingHit(r2, r3, r4, r0)
            return
    }

    public boolean onWebAuthnIntent(android.webkit.WebView r2, android.app.PendingIntent r3, java.lang.reflect.InvocationHandler r4) {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r2, android.webkit.WebResourceRequest r3) {
            r1 = this;
            android.net.Uri r0 = r3.getUrl()
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.shouldOverrideUrlLoading(r2, r0)
            return r0
    }
}
