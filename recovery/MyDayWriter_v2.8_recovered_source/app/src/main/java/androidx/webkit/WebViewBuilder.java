package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public final class WebViewBuilder {
    org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface mBuilderStateBoundary;
    private androidx.webkit.Policy mPolicy;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface Experimental {
    }

    public WebViewBuilder() {
            r0 = this;
            r0.<init>()
            return
    }

    public android.webkit.WebView build(android.content.Context r4) throws androidx.webkit.WebViewBuilderException {
            r3 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.WEBVIEW_BUILDER
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L27
            org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface r1 = r3.mBuilderStateBoundary
            if (r1 != 0) goto L16
            androidx.webkit.internal.WebViewProviderFactory r1 = androidx.webkit.internal.WebViewGlueCommunicator.getFactory()
            org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface r1 = r1.getWebViewBuilder()
            r3.mBuilderStateBoundary = r1
        L16:
            org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface$Config r1 = new org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface$Config
            r1.<init>()
            androidx.webkit.Policy r2 = r3.mPolicy
            r2.configure(r1)
            org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface r2 = r3.mBuilderStateBoundary
            android.webkit.WebView r2 = r2.build(r4, r1)
            return r2
        L27:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public androidx.webkit.WebViewBuilder setPolicy(androidx.webkit.Policy r1) {
            r0 = this;
            r0.mPolicy = r1
            return r0
    }
}
