package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public interface DeterministicAead {
    byte[] decryptDeterministically(byte[] r1, byte[] r2) throws java.security.GeneralSecurityException;

    byte[] encryptDeterministically(byte[] r1, byte[] r2) throws java.security.GeneralSecurityException;
}
