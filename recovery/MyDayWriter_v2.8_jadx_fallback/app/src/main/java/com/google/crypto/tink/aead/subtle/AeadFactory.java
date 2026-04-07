package com.google.crypto.tink.aead.subtle;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public interface AeadFactory {
    com.google.crypto.tink.Aead createAead(byte[] r1) throws java.security.GeneralSecurityException;

    int getKeySizeInBytes();
}
