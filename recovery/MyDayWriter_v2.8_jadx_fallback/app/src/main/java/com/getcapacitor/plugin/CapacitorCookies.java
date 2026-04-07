package com.getcapacitor.plugin;

/* JADX INFO: loaded from: classes4.dex */
@com.getcapacitor.annotation.CapacitorPlugin
public class CapacitorCookies extends com.getcapacitor.Plugin {
    com.getcapacitor.plugin.CapacitorCookieManager cookieManager;

    public CapacitorCookies() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void lambda$getCookies$0(com.getcapacitor.PluginCall r13, java.lang.String r14) {
            int r0 = r14.length()
            r1 = 1
            int r0 = r0 - r1
            java.lang.String r0 = r14.substring(r1, r0)
            java.lang.String r2 = ";"
            java.lang.String[] r2 = r0.split(r2)
            com.getcapacitor.JSObject r3 = new com.getcapacitor.JSObject
            r3.<init>()
            int r4 = r2.length
            r5 = 0
            r6 = r5
        L18:
            if (r6 >= r4) goto L63
            r7 = r2[r6]
            int r8 = r7.length()
            if (r8 <= 0) goto L60
            java.lang.String r8 = "="
            r9 = 2
            java.lang.String[] r8 = r7.split(r8, r9)
            int r10 = r8.length
            if (r10 != r9) goto L60
            r9 = r8[r5]
            java.lang.String r9 = r9.trim()
            r10 = r8[r1]
            java.lang.String r10 = r10.trim()
            r11 = r8[r5]     // Catch: java.io.UnsupportedEncodingException -> L5b
            java.lang.String r11 = r11.trim()     // Catch: java.io.UnsupportedEncodingException -> L5b
            java.nio.charset.Charset r12 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.io.UnsupportedEncodingException -> L5b
            java.lang.String r12 = r12.name()     // Catch: java.io.UnsupportedEncodingException -> L5b
            java.lang.String r11 = java.net.URLDecoder.decode(r11, r12)     // Catch: java.io.UnsupportedEncodingException -> L5b
            r9 = r11
            r11 = r8[r1]     // Catch: java.io.UnsupportedEncodingException -> L5b
            java.lang.String r11 = r11.trim()     // Catch: java.io.UnsupportedEncodingException -> L5b
            java.nio.charset.Charset r12 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.io.UnsupportedEncodingException -> L5b
            java.lang.String r12 = r12.name()     // Catch: java.io.UnsupportedEncodingException -> L5b
            java.lang.String r11 = java.net.URLDecoder.decode(r11, r12)     // Catch: java.io.UnsupportedEncodingException -> L5b
            r10 = r11
            goto L5c
        L5b:
            r11 = move-exception
        L5c:
            r3.put(r9, r10)
        L60:
            int r6 = r6 + 1
            goto L18
        L63:
            r13.resolve(r3)
            return
    }

    @com.getcapacitor.PluginMethod
    public void clearAllCookies(com.getcapacitor.PluginCall r2) {
            r1 = this;
            com.getcapacitor.plugin.CapacitorCookieManager r0 = r1.cookieManager
            r0.removeAllCookies()
            r2.resolve()
            return
    }

    @com.getcapacitor.PluginMethod
    public void clearCookies(com.getcapacitor.PluginCall r9) {
            r8 = this;
            java.lang.String r0 = "url"
            java.lang.String r0 = r9.getString(r0)
            com.getcapacitor.plugin.CapacitorCookieManager r1 = r8.cookieManager
            java.net.HttpCookie[] r1 = r1.getCookies(r0)
            int r2 = r1.length
            r3 = 0
        Le:
            if (r3 >= r2) goto L31
            r4 = r1[r3]
            com.getcapacitor.plugin.CapacitorCookieManager r5 = r8.cookieManager
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r4.getName()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = "=; Expires=Wed, 31 Dec 2000 23:59:59 GMT"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.setCookie(r0, r6)
            int r3 = r3 + 1
            goto Le
        L31:
            r9.resolve()
            return
    }

    @com.getcapacitor.PluginMethod
    public void deleteCookie(com.getcapacitor.PluginCall r6) {
            r5 = this;
            java.lang.String r0 = "key"
            java.lang.String r0 = r6.getString(r0)
            if (r0 != 0) goto Ld
            java.lang.String r1 = "Must provide key"
            r6.reject(r1)
        Ld:
            java.lang.String r1 = "url"
            java.lang.String r1 = r6.getString(r1)
            com.getcapacitor.plugin.CapacitorCookieManager r2 = r5.cookieManager
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = "=; Expires=Wed, 31 Dec 2000 23:59:59 GMT"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.setCookie(r1, r3)
            r6.resolve()
            return
    }

    @com.getcapacitor.PluginMethod
    public void getCookies(com.getcapacitor.PluginCall r4) {
            r3 = this;
            com.getcapacitor.Bridge r0 = r3.bridge
            com.getcapacitor.plugin.CapacitorCookies$$ExternalSyntheticLambda0 r1 = new com.getcapacitor.plugin.CapacitorCookies$$ExternalSyntheticLambda0
            r1.<init>(r4)
            java.lang.String r2 = "document.cookie"
            r0.eval(r2, r1)
            return
    }

    @Override // com.getcapacitor.Plugin
    protected void handleOnDestroy() {
            r1 = this;
            super.handleOnDestroy()
            com.getcapacitor.plugin.CapacitorCookieManager r0 = r1.cookieManager
            r0.removeSessionCookies()
            return
    }

    @android.webkit.JavascriptInterface
    public boolean isEnabled() {
            r3 = this;
            com.getcapacitor.Bridge r0 = r3.getBridge()
            com.getcapacitor.CapConfig r0 = r0.getConfig()
            java.lang.String r1 = "CapacitorCookies"
            com.getcapacitor.PluginConfig r0 = r0.getPluginConfiguration(r1)
            java.lang.String r1 = "enabled"
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            return r1
    }

    @Override // com.getcapacitor.Plugin
    public void load() {
            r4 = this;
            com.getcapacitor.Bridge r0 = r4.bridge
            android.webkit.WebView r0 = r0.getWebView()
            java.lang.String r1 = "CapacitorCookiesAndroidInterface"
            r0.addJavascriptInterface(r4, r1)
            com.getcapacitor.plugin.CapacitorCookieManager r0 = new com.getcapacitor.plugin.CapacitorCookieManager
            java.net.CookiePolicy r1 = java.net.CookiePolicy.ACCEPT_ALL
            com.getcapacitor.Bridge r2 = r4.bridge
            r3 = 0
            r0.<init>(r3, r1, r2)
            r4.cookieManager = r0
            com.getcapacitor.plugin.CapacitorCookieManager r0 = r4.cookieManager
            r0.removeSessionCookies()
            com.getcapacitor.plugin.CapacitorCookieManager r0 = r4.cookieManager
            java.net.CookieHandler.setDefault(r0)
            super.load()
            return
    }

    @com.getcapacitor.PluginMethod
    public void setCookie(com.getcapacitor.PluginCall r8) {
            r7 = this;
            java.lang.String r0 = "key"
            java.lang.String r3 = r8.getString(r0)
            if (r3 != 0) goto Ld
            java.lang.String r0 = "Must provide key"
            r8.reject(r0)
        Ld:
            java.lang.String r0 = "value"
            java.lang.String r4 = r8.getString(r0)
            if (r4 != 0) goto L1a
            java.lang.String r0 = "Must provide value"
            r8.reject(r0)
        L1a:
            java.lang.String r0 = "url"
            java.lang.String r2 = r8.getString(r0)
            java.lang.String r0 = "expires"
            java.lang.String r1 = ""
            java.lang.String r5 = r8.getString(r0, r1)
            java.lang.String r0 = "path"
            java.lang.String r1 = "/"
            java.lang.String r6 = r8.getString(r0, r1)
            com.getcapacitor.plugin.CapacitorCookieManager r1 = r7.cookieManager
            r1.setCookie(r2, r3, r4, r5, r6)
            r8.resolve()
            return
    }

    @android.webkit.JavascriptInterface
    public void setCookie(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.getcapacitor.plugin.CapacitorCookieManager r0 = r1.cookieManager
            r0.setCookie(r2, r3)
            return
    }
}
