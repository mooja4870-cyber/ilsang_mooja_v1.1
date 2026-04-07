package org.apache.cordova.engine;

/* JADX INFO: loaded from: classes7.dex */
class SystemExposedJsApi implements org.apache.cordova.ExposedJsApi {
    private final org.apache.cordova.CordovaBridge bridge;

    SystemExposedJsApi(org.apache.cordova.CordovaBridge r1) {
            r0 = this;
            r0.<init>()
            r0.bridge = r1
            return
    }

    @Override // org.apache.cordova.ExposedJsApi
    @android.webkit.JavascriptInterface
    public java.lang.String exec(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) throws org.json.JSONException, java.lang.IllegalAccessException {
            r6 = this;
            org.apache.cordova.CordovaBridge r0 = r6.bridge
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.String r7 = r0.jsExec(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // org.apache.cordova.ExposedJsApi
    @android.webkit.JavascriptInterface
    public java.lang.String retrieveJsMessages(int r2, boolean r3) throws java.lang.IllegalAccessException {
            r1 = this;
            org.apache.cordova.CordovaBridge r0 = r1.bridge
            java.lang.String r0 = r0.jsRetrieveJsMessages(r2, r3)
            return r0
    }

    @Override // org.apache.cordova.ExposedJsApi
    @android.webkit.JavascriptInterface
    public void setNativeToJsBridgeMode(int r2, int r3) throws java.lang.IllegalAccessException {
            r1 = this;
            org.apache.cordova.CordovaBridge r0 = r1.bridge
            r0.jsSetNativeToJsBridgeMode(r2, r3)
            return
    }
}
