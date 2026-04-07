package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class CordovaPluginPathHandler {
    private final androidx.webkit.WebViewAssetLoader.PathHandler handler;

    public CordovaPluginPathHandler(androidx.webkit.WebViewAssetLoader.PathHandler r1) {
            r0 = this;
            r0.<init>()
            r0.handler = r1
            return
    }

    public androidx.webkit.WebViewAssetLoader.PathHandler getPathHandler() {
            r1 = this;
            androidx.webkit.WebViewAssetLoader$PathHandler r0 = r1.handler
            return r0
    }
}
