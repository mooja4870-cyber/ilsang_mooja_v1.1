package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes.dex */
public interface ChunkedMacVerification {
    void update(java.nio.ByteBuffer r1) throws java.security.GeneralSecurityException;

    void verifyMac() throws java.security.GeneralSecurityException;
}
