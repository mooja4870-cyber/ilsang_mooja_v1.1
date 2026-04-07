package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class CordovaHttpAuthHandler implements org.apache.cordova.ICordovaHttpAuthHandler {
    private final android.webkit.HttpAuthHandler handler;

    public CordovaHttpAuthHandler(android.webkit.HttpAuthHandler r1) {
            r0 = this;
            r0.<init>()
            r0.handler = r1
            return
    }

    @Override // org.apache.cordova.ICordovaHttpAuthHandler
    public void cancel() {
            r1 = this;
            android.webkit.HttpAuthHandler r0 = r1.handler
            r0.cancel()
            return
    }

    @Override // org.apache.cordova.ICordovaHttpAuthHandler
    public void proceed(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.webkit.HttpAuthHandler r0 = r1.handler
            r0.proceed(r2, r3)
            return
    }
}
