package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class IncompatibleApkWebViewProviderFactory implements androidx.webkit.internal.WebViewProviderFactory {
    private static final java.lang.String[] EMPTY_STRING_ARRAY = null;
    private static final java.lang.String UNSUPPORTED_EXCEPTION_EXPLANATION = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily";

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            androidx.webkit.internal.IncompatibleApkWebViewProviderFactory.EMPTY_STRING_ARRAY = r0
            return
    }

    public IncompatibleApkWebViewProviderFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface createWebView(android.webkit.WebView r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface getDropDataProvider() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface getProfileStore() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface getProxyController() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.StaticsBoundaryInterface getStatics() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.TracingControllerBoundaryInterface getTracingController() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface getWebViewBuilder() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public java.lang.String[] getWebViewFeatures() {
            r1 = this;
            java.lang.String[] r0 = androidx.webkit.internal.IncompatibleApkWebViewProviderFactory.EMPTY_STRING_ARRAY
            return r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public void startUpWebView(androidx.webkit.WebViewStartUpConfig r3, androidx.webkit.WebViewCompat.WebViewStartUpCallback r4) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily"
            r0.<init>(r1)
            throw r0
    }
}
