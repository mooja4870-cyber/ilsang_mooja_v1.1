package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public interface CordovaWebViewEngine {

    public interface Client {
        void clearLoadTimeoutTimer();

        java.lang.Boolean onDispatchKeyEvent(android.view.KeyEvent r1);

        boolean onNavigationAttempt(java.lang.String r1);

        void onPageFinishedLoading(java.lang.String r1);

        void onPageStarted(java.lang.String r1);

        void onReceivedError(int r1, java.lang.String r2, java.lang.String r3);
    }

    public interface EngineView {
        org.apache.cordova.CordovaWebView getCordovaWebView();
    }

    boolean canGoBack();

    void clearCache();

    void clearHistory();

    void destroy();

    void evaluateJavascript(java.lang.String r1, android.webkit.ValueCallback<java.lang.String> r2);

    org.apache.cordova.ICordovaCookieManager getCookieManager();

    org.apache.cordova.CordovaWebView getCordovaWebView();

    java.lang.String getUrl();

    android.view.View getView();

    boolean goBack();

    void init(org.apache.cordova.CordovaWebView r1, org.apache.cordova.CordovaInterface r2, org.apache.cordova.CordovaWebViewEngine.Client r3, org.apache.cordova.CordovaResourceApi r4, org.apache.cordova.PluginManager r5, org.apache.cordova.NativeToJsMessageQueue r6);

    void loadUrl(java.lang.String r1, boolean r2);

    void setPaused(boolean r1);

    void stopLoading();
}
