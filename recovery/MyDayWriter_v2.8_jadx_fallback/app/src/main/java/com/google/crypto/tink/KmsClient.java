package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public interface KmsClient {
    boolean doesSupport(java.lang.String r1);

    com.google.crypto.tink.Aead getAead(java.lang.String r1) throws java.security.GeneralSecurityException;

    com.google.crypto.tink.KmsClient withCredentials(java.lang.String r1) throws java.security.GeneralSecurityException;

    com.google.crypto.tink.KmsClient withDefaultCredentials() throws java.security.GeneralSecurityException;
}
