package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public interface CordovaWebView {
    public static final java.lang.String CORDOVA_VERSION = "14.0.1";

    boolean backHistory();

    boolean canGoBack();

    void clearCache();

    @java.lang.Deprecated
    void clearCache(boolean r1);

    void clearHistory();

    android.content.Context getContext();

    org.apache.cordova.ICordovaCookieManager getCookieManager();

    org.apache.cordova.CordovaWebViewEngine getEngine();

    org.apache.cordova.PluginManager getPluginManager();

    org.apache.cordova.CordovaPreferences getPreferences();

    org.apache.cordova.CordovaResourceApi getResourceApi();

    java.lang.String getUrl();

    android.view.View getView();

    void handleDestroy();

    void handlePause(boolean r1);

    void handleResume(boolean r1);

    void handleStart();

    void handleStop();

    @java.lang.Deprecated
    void hideCustomView();

    void init(org.apache.cordova.CordovaInterface r1, java.util.List<org.apache.cordova.PluginEntry> r2, org.apache.cordova.CordovaPreferences r3);

    boolean isButtonPlumbedToJs(int r1);

    @java.lang.Deprecated
    boolean isCustomViewShowing();

    boolean isInitialized();

    void loadUrl(java.lang.String r1);

    void loadUrlIntoView(java.lang.String r1, boolean r2);

    void onNewIntent(android.content.Intent r1);

    java.lang.Object postMessage(java.lang.String r1, java.lang.Object r2);

    @java.lang.Deprecated
    void sendJavascript(java.lang.String r1);

    void sendPluginResult(org.apache.cordova.PluginResult r1, java.lang.String r2);

    void setButtonPlumbedToJs(int r1, boolean r2);

    @java.lang.Deprecated
    void showCustomView(android.view.View r1, android.webkit.WebChromeClient.CustomViewCallback r2);

    void showWebPage(java.lang.String r1, boolean r2, boolean r3, java.util.Map<java.lang.String, java.lang.Object> r4);

    void stopLoading();
}
