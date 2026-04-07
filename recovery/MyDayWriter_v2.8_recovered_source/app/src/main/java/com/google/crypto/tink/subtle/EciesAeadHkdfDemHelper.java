package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public interface EciesAeadHkdfDemHelper {
    com.google.crypto.tink.hybrid.subtle.AeadOrDaead getAeadOrDaead(byte[] r1) throws java.security.GeneralSecurityException;

    int getSymmetricKeySizeInBytes();
}
