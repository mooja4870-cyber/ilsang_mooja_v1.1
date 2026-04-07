package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes7.dex */
@org.jspecify.annotations.NullMarked
public interface WebViewProviderBoundaryInterface {
    java.lang.reflect.InvocationHandler addDocumentStartJavaScript(java.lang.String r1, java.lang.String[] r2);

    void addWebMessageListener(java.lang.String r1, java.lang.String[] r2, java.lang.reflect.InvocationHandler r3);

    java.lang.reflect.InvocationHandler[] createWebMessageChannel();

    java.lang.reflect.InvocationHandler getProfile();

    android.webkit.WebChromeClient getWebChromeClient();

    android.webkit.WebViewClient getWebViewClient();

    java.lang.reflect.InvocationHandler getWebViewNavigationClient();

    java.lang.reflect.InvocationHandler getWebViewRenderer();

    java.lang.reflect.InvocationHandler getWebViewRendererClient();

    void insertVisualStateCallback(long r1, java.lang.reflect.InvocationHandler r3);

    boolean isAudioMuted();

    void postMessageToMainFrame(java.lang.reflect.InvocationHandler r1, android.net.Uri r2);

    void prerenderUrl(java.lang.String r1, android.os.CancellationSignal r2, java.util.concurrent.Executor r3, android.webkit.ValueCallback<java.lang.Void> r4, android.webkit.ValueCallback<java.lang.Throwable> r5);

    void prerenderUrl(java.lang.String r1, android.os.CancellationSignal r2, java.util.concurrent.Executor r3, java.lang.reflect.InvocationHandler r4, android.webkit.ValueCallback<java.lang.Void> r5, android.webkit.ValueCallback<java.lang.Throwable> r6);

    void removeWebMessageListener(java.lang.String r1);

    void saveState(android.os.Bundle r1, int r2, boolean r3);

    void setAudioMuted(boolean r1);

    void setProfile(java.lang.String r1);

    void setWebViewNavigationClient(java.lang.reflect.InvocationHandler r1);

    void setWebViewRendererClient(java.lang.reflect.InvocationHandler r1);
}
