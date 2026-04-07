package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public interface ICordovaCookieManager {
    void clearCookies();

    void flush();

    java.lang.String getCookie(java.lang.String r1);

    void setCookie(java.lang.String r1, java.lang.String r2);

    void setCookiesEnabled(boolean r1);
}
