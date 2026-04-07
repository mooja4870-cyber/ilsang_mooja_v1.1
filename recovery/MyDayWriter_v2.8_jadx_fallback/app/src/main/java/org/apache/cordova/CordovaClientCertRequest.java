package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class CordovaClientCertRequest implements org.apache.cordova.ICordovaClientCertRequest {
    private final android.webkit.ClientCertRequest request;

    public CordovaClientCertRequest(android.webkit.ClientCertRequest r1) {
            r0 = this;
            r0.<init>()
            r0.request = r1
            return
    }

    @Override // org.apache.cordova.ICordovaClientCertRequest
    public void cancel() {
            r1 = this;
            android.webkit.ClientCertRequest r0 = r1.request
            r0.cancel()
            return
    }

    @Override // org.apache.cordova.ICordovaClientCertRequest
    public java.lang.String getHost() {
            r1 = this;
            android.webkit.ClientCertRequest r0 = r1.request
            java.lang.String r0 = r0.getHost()
            return r0
    }

    @Override // org.apache.cordova.ICordovaClientCertRequest
    public java.lang.String[] getKeyTypes() {
            r1 = this;
            android.webkit.ClientCertRequest r0 = r1.request
            java.lang.String[] r0 = r0.getKeyTypes()
            return r0
    }

    @Override // org.apache.cordova.ICordovaClientCertRequest
    public int getPort() {
            r1 = this;
            android.webkit.ClientCertRequest r0 = r1.request
            int r0 = r0.getPort()
            return r0
    }

    @Override // org.apache.cordova.ICordovaClientCertRequest
    public java.security.Principal[] getPrincipals() {
            r1 = this;
            android.webkit.ClientCertRequest r0 = r1.request
            java.security.Principal[] r0 = r0.getPrincipals()
            return r0
    }

    @Override // org.apache.cordova.ICordovaClientCertRequest
    public void ignore() {
            r1 = this;
            android.webkit.ClientCertRequest r0 = r1.request
            r0.ignore()
            return
    }

    @Override // org.apache.cordova.ICordovaClientCertRequest
    public void proceed(java.security.PrivateKey r2, java.security.cert.X509Certificate[] r3) {
            r1 = this;
            android.webkit.ClientCertRequest r0 = r1.request
            r0.proceed(r2, r3)
            return
    }
}
