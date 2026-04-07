package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public interface Mac {
    byte[] computeMac(byte[] r1) throws java.security.GeneralSecurityException;

    void verifyMac(byte[] r1, byte[] r2) throws java.security.GeneralSecurityException;
}
