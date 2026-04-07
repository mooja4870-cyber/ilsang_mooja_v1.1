package com.getcapacitor.plugin;

/* JADX INFO: loaded from: classes4.dex */
public class CapacitorCookieManager extends java.net.CookieManager {
    private final java.lang.String TAG;
    private final java.lang.String localUrl;
    private final java.lang.String serverUrl;
    private final android.webkit.CookieManager webkitCookieManager;

    public CapacitorCookieManager(com.getcapacitor.Bridge r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0, r2)
            return
    }

    public CapacitorCookieManager(java.net.CookieStore r2, java.net.CookiePolicy r3, com.getcapacitor.Bridge r4) {
            r1 = this;
            r1.<init>(r2, r3)
            java.lang.String r0 = "CapacitorCookies"
            r1.TAG = r0
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            r1.webkitCookieManager = r0
            java.lang.String r0 = r4.getLocalUrl()
            r1.localUrl = r0
            java.lang.String r0 = r4.getServerUrl()
            r1.serverUrl = r0
            return
    }

    private java.lang.String getDomainFromCookieString(java.lang.String r4) throws java.net.URISyntaxException {
            r3 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r4.toLowerCase(r0)
            java.lang.String r1 = "domain="
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 1
            if (r1 > r2) goto L12
            r1 = 0
            goto L21
        L12:
            r1 = r0[r2]
            java.lang.String r2 = ";"
            java.lang.String[] r1 = r1.split(r2)
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = r1.trim()
        L21:
            java.lang.String r1 = r3.getSanitizedDomain(r1)
            return r1
    }

    public void flush() {
            r1 = this;
            android.webkit.CookieManager r0 = r1.webkitCookieManager
            r0.flush()
            return
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> get(java.net.URI r6, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7) {
            r5 = this;
            if (r6 == 0) goto L1d
            if (r7 == 0) goto L1d
            java.lang.String r0 = r6.toString()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = r5.getCookieString(r0)
            if (r2 == 0) goto L1c
            java.lang.String r3 = "Cookie"
            java.util.List r4 = java.util.Collections.singletonList(r2)
            r1.put(r3, r4)
        L1c:
            return r1
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Argument is null"
            r0.<init>(r1)
            throw r0
    }

    public java.net.HttpCookie getCookie(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            java.net.HttpCookie[] r0 = r5.getCookies(r6)
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L15
            return r3
        L15:
            int r2 = r2 + 1
            goto L6
        L18:
            r1 = 0
            return r1
    }

    @Override // java.net.CookieManager
    public java.net.CookieStore getCookieStore() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public java.lang.String getCookieString(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "CapacitorCookies"
            java.lang.String r1 = r3.getSanitizedDomain(r4)     // Catch: java.lang.Exception -> L2a
            r4 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2a
            r1.<init>()     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = "Getting cookies at: '"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L2a
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = "'"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L2a
            com.getcapacitor.Logger.info(r0, r1)     // Catch: java.lang.Exception -> L2a
            android.webkit.CookieManager r1 = r3.webkitCookieManager     // Catch: java.lang.Exception -> L2a
            java.lang.String r0 = r1.getCookie(r4)     // Catch: java.lang.Exception -> L2a
            return r0
        L2a:
            r1 = move-exception
            java.lang.String r2 = "Failed to get cookies at the given URL."
            com.getcapacitor.Logger.error(r0, r2, r1)
            r0 = 0
            return r0
    }

    public java.net.HttpCookie[] getCookies(java.lang.String r10) {
            r9 = this;
            r0 = 0
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3d
            r1.<init>()     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = r9.getCookieString(r10)     // Catch: java.lang.Exception -> L3d
            if (r2 == 0) goto L30
            java.lang.String r3 = ";"
            java.lang.String[] r3 = r2.split(r3)     // Catch: java.lang.Exception -> L3d
            int r4 = r3.length     // Catch: java.lang.Exception -> L3d
            r5 = r0
        L14:
            if (r5 >= r4) goto L30
            r6 = r3[r5]     // Catch: java.lang.Exception -> L3d
            java.util.List r7 = java.net.HttpCookie.parse(r6)     // Catch: java.lang.Exception -> L3d
            java.lang.Object r7 = r7.get(r0)     // Catch: java.lang.Exception -> L3d
            java.net.HttpCookie r7 = (java.net.HttpCookie) r7     // Catch: java.lang.Exception -> L3d
            java.lang.String r8 = r7.getValue()     // Catch: java.lang.Exception -> L3d
            r7.setValue(r8)     // Catch: java.lang.Exception -> L3d
            r1.add(r7)     // Catch: java.lang.Exception -> L3d
            int r5 = r5 + 1
            goto L14
        L30:
            int r3 = r1.size()     // Catch: java.lang.Exception -> L3d
            java.net.HttpCookie[] r3 = new java.net.HttpCookie[r3]     // Catch: java.lang.Exception -> L3d
            java.lang.Object[] r4 = r1.toArray(r3)     // Catch: java.lang.Exception -> L3d
            java.net.HttpCookie[] r4 = (java.net.HttpCookie[]) r4     // Catch: java.lang.Exception -> L3d
            return r4
        L3d:
            r1 = move-exception
            java.net.HttpCookie[] r0 = new java.net.HttpCookie[r0]
            return r0
    }

    public java.lang.String getSanitizedDomain(java.lang.String r6) throws java.net.URISyntaxException {
            r5 = this;
            java.lang.String r0 = r5.serverUrl
            java.lang.String r1 = "CapacitorCookies"
            if (r0 == 0) goto L21
            java.lang.String r0 = r5.serverUrl
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
            if (r6 == 0) goto L1e
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L1e
            java.lang.String r0 = r5.serverUrl
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L21
        L1e:
            java.lang.String r6 = r5.serverUrl
            goto L6c
        L21:
            java.lang.String r0 = r5.localUrl
            if (r0 == 0) goto L40
            java.lang.String r0 = r5.localUrl
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L40
            if (r6 == 0) goto L3d
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L3d
            java.lang.String r0 = r5.localUrl
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L40
        L3d:
            java.lang.String r6 = r5.localUrl
            goto L6c
        L40:
            java.net.URI r0 = new java.net.URI     // Catch: java.net.URISyntaxException -> L66
            r0.<init>(r6)     // Catch: java.net.URISyntaxException -> L66
            java.lang.String r2 = r0.getScheme()     // Catch: java.net.URISyntaxException -> L66
            if (r2 == 0) goto L51
            boolean r3 = r2.isEmpty()     // Catch: java.net.URISyntaxException -> L66
            if (r3 == 0) goto L65
        L51:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> L66
            r3.<init>()     // Catch: java.net.URISyntaxException -> L66
            java.lang.String r4 = "https://"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.net.URISyntaxException -> L66
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.net.URISyntaxException -> L66
            java.lang.String r3 = r3.toString()     // Catch: java.net.URISyntaxException -> L66
            r6 = r3
        L65:
            goto L6c
        L66:
            r0 = move-exception
            java.lang.String r2 = "Failed to get scheme from URL."
            com.getcapacitor.Logger.error(r1, r2, r0)
        L6c:
            java.net.URI r0 = new java.net.URI     // Catch: java.lang.Exception -> L73
            r0.<init>(r6)     // Catch: java.lang.Exception -> L73
            return r6
        L73:
            r0 = move-exception
            java.lang.String r2 = "Failed to get sanitized URL."
            com.getcapacitor.Logger.error(r1, r2, r0)
            throw r0
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public void put(java.net.URI r6, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7) {
            r5 = this;
            if (r6 == 0) goto L5c
            if (r7 != 0) goto L5
            goto L5c
        L5:
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Ld
            java.lang.String r2 = "Set-Cookie2"
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 != 0) goto L2c
            java.lang.String r2 = "Set-Cookie"
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 != 0) goto L2c
            goto Ld
        L2c:
            java.lang.Object r2 = r7.get(r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2)
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L3c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Exception -> L57
            r5.setCookie(r4, r3)     // Catch: java.lang.Exception -> L57
            java.lang.String r4 = r5.getDomainFromCookieString(r3)     // Catch: java.lang.Exception -> L57
            r5.setCookie(r4, r3)     // Catch: java.lang.Exception -> L57
            goto L58
        L57:
            r4 = move-exception
        L58:
            goto L3c
        L5a:
            goto Ld
        L5b:
            return
        L5c:
            return
    }

    public void removeAllCookies() {
            r2 = this;
            android.webkit.CookieManager r0 = r2.webkitCookieManager
            r1 = 0
            r0.removeAllCookies(r1)
            r2.flush()
            return
    }

    public void removeSessionCookies() {
            r2 = this;
            android.webkit.CookieManager r0 = r2.webkitCookieManager
            r1 = 0
            r0.removeSessionCookies(r1)
            return
    }

    public void setCookie(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "CapacitorCookies"
            java.lang.String r1 = r3.getSanitizedDomain(r4)     // Catch: java.lang.Exception -> L36
            r4 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L36
            r1.<init>()     // Catch: java.lang.Exception -> L36
            java.lang.String r2 = "Setting cookie '"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L36
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Exception -> L36
            java.lang.String r2 = "' at: '"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L36
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Exception -> L36
            java.lang.String r2 = "'"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L36
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L36
            com.getcapacitor.Logger.info(r0, r1)     // Catch: java.lang.Exception -> L36
            android.webkit.CookieManager r1 = r3.webkitCookieManager     // Catch: java.lang.Exception -> L36
            r1.setCookie(r4, r5)     // Catch: java.lang.Exception -> L36
            r3.flush()     // Catch: java.lang.Exception -> L36
            goto L3c
        L36:
            r1 = move-exception
            java.lang.String r2 = "Failed to set cookie."
            com.getcapacitor.Logger.error(r0, r2, r1)
        L3c:
            return
    }

    public void setCookie(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = "="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            r2.setCookie(r3, r0)
            return
    }

    public void setCookie(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = "="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r1 = "; expires="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r1 = "; path="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r0 = r0.toString()
            r2.setCookie(r3, r0)
            return
    }
}
