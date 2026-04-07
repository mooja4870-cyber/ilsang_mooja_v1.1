package com.getcapacitor.cordova;

/* JADX INFO: loaded from: classes2.dex */
class CapacitorCordovaCookieManager implements org.apache.cordova.ICordovaCookieManager {
    private final android.webkit.CookieManager cookieManager;
    protected final android.webkit.WebView webView;

    public CapacitorCordovaCookieManager(android.webkit.WebView r4) {
            r3 = this;
            r3.<init>()
            r3.webView = r4
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            r3.cookieManager = r0
            android.webkit.CookieManager r0 = r3.cookieManager
            android.webkit.WebView r1 = r3.webView
            r2 = 1
            r0.setAcceptThirdPartyCookies(r1, r2)
            return
    }

    @Override // org.apache.cordova.ICordovaCookieManager
    public void clearCookies() {
            r2 = this;
            android.webkit.CookieManager r0 = r2.cookieManager
            r1 = 0
            r0.removeAllCookies(r1)
            return
    }

    @Override // org.apache.cordova.ICordovaCookieManager
    public void flush() {
            r1 = this;
            android.webkit.CookieManager r0 = r1.cookieManager
            r0.flush()
            return
    }

    @Override // org.apache.cordova.ICordovaCookieManager
    public java.lang.String getCookie(java.lang.String r2) {
            r1 = this;
            android.webkit.CookieManager r0 = r1.cookieManager
            java.lang.String r0 = r0.getCookie(r2)
            return r0
    }

    @Override // org.apache.cordova.ICordovaCookieManager
    public void setCookie(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.webkit.CookieManager r0 = r1.cookieManager
            r0.setCookie(r2, r3)
            return
    }

    @Override // org.apache.cordova.ICordovaCookieManager
    public void setCookiesEnabled(boolean r2) {
            r1 = this;
            android.webkit.CookieManager r0 = r1.cookieManager
            r0.setAcceptCookie(r2)
            return
    }
}
