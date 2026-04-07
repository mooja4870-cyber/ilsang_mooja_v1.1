package org.apache.cordova.engine;

/* JADX INFO: loaded from: classes7.dex */
public class SystemWebView extends android.webkit.WebView implements org.apache.cordova.CordovaWebViewEngine.EngineView {
    org.apache.cordova.engine.SystemWebChromeClient chromeClient;
    private org.apache.cordova.CordovaInterface cordova;
    private org.apache.cordova.engine.SystemWebViewEngine parentEngine;
    private org.apache.cordova.engine.SystemWebViewClient viewClient;

    public SystemWebView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SystemWebView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            org.apache.cordova.engine.SystemWebViewEngine r0 = r2.parentEngine
            org.apache.cordova.CordovaWebViewEngine$Client r0 = r0.client
            java.lang.Boolean r0 = r0.onDispatchKeyEvent(r3)
            if (r0 == 0) goto Lf
            boolean r1 = r0.booleanValue()
            return r1
        Lf:
            boolean r1 = super.dispatchKeyEvent(r3)
            return r1
    }

    @Override // org.apache.cordova.CordovaWebViewEngine.EngineView
    public org.apache.cordova.CordovaWebView getCordovaWebView() {
            r1 = this;
            org.apache.cordova.engine.SystemWebViewEngine r0 = r1.parentEngine
            if (r0 == 0) goto Lb
            org.apache.cordova.engine.SystemWebViewEngine r0 = r1.parentEngine
            org.apache.cordova.CordovaWebView r0 = r0.getCordovaWebView()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    void init(org.apache.cordova.engine.SystemWebViewEngine r2, org.apache.cordova.CordovaInterface r3) {
            r1 = this;
            r1.cordova = r3
            r1.parentEngine = r2
            org.apache.cordova.engine.SystemWebViewClient r0 = r1.viewClient
            if (r0 != 0) goto L10
            org.apache.cordova.engine.SystemWebViewClient r0 = new org.apache.cordova.engine.SystemWebViewClient
            r0.<init>(r2)
            r1.setWebViewClient(r0)
        L10:
            org.apache.cordova.engine.SystemWebChromeClient r0 = r1.chromeClient
            if (r0 != 0) goto L1c
            org.apache.cordova.engine.SystemWebChromeClient r0 = new org.apache.cordova.engine.SystemWebChromeClient
            r0.<init>(r2)
            r1.setWebChromeClient(r0)
        L1c:
            return
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(android.webkit.WebChromeClient r2) {
            r1 = this;
            r0 = r2
            org.apache.cordova.engine.SystemWebChromeClient r0 = (org.apache.cordova.engine.SystemWebChromeClient) r0
            r1.chromeClient = r0
            super.setWebChromeClient(r2)
            return
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(android.webkit.WebViewClient r2) {
            r1 = this;
            r0 = r2
            org.apache.cordova.engine.SystemWebViewClient r0 = (org.apache.cordova.engine.SystemWebViewClient) r0
            r1.viewClient = r0
            super.setWebViewClient(r2)
            return
    }
}
