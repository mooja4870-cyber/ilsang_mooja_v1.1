package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes7.dex */
@org.jspecify.annotations.NullMarked
public interface WebViewProviderFactoryBoundaryInterface {
    public static final java.lang.String MULTI_COOKIE_HEADER_NAME = "\u0000Set-Cookie-Multivalue\u0000";
    public static final java.lang.String MULTI_COOKIE_VALUE_SEPARATOR = "\u0000";

    java.lang.reflect.InvocationHandler createWebView(android.webkit.WebView r1);

    java.lang.reflect.InvocationHandler getDropDataProvider();

    java.lang.reflect.InvocationHandler getProfileStore();

    java.lang.reflect.InvocationHandler getProxyController();

    java.lang.reflect.InvocationHandler getServiceWorkerController();

    java.lang.reflect.InvocationHandler getStatics();

    java.lang.String[] getSupportedFeatures();

    java.lang.reflect.InvocationHandler getTracingController();

    java.lang.reflect.InvocationHandler getWebViewBuilder();

    java.lang.reflect.InvocationHandler getWebkitToCompatConverter();

    void startUpWebView(java.lang.reflect.InvocationHandler r1, java.lang.reflect.InvocationHandler r2);
}
