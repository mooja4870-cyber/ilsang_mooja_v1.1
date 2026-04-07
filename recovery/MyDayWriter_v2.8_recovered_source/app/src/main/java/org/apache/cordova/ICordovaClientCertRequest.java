package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public interface ICordovaClientCertRequest {
    void cancel();

    java.lang.String getHost();

    java.lang.String[] getKeyTypes();

    int getPort();

    java.security.Principal[] getPrincipals();

    void ignore();

    void proceed(java.security.PrivateKey r1, java.security.cert.X509Certificate[] r2);
}
