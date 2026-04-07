package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public interface Aead {
    byte[] decrypt(byte[] r1, byte[] r2) throws java.security.GeneralSecurityException;

    byte[] encrypt(byte[] r1, byte[] r2) throws java.security.GeneralSecurityException;
}
