package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public interface ChunkedMac {
    com.google.crypto.tink.mac.ChunkedMacComputation createComputation() throws java.security.GeneralSecurityException;

    com.google.crypto.tink.mac.ChunkedMacVerification createVerification(byte[] r1) throws java.security.GeneralSecurityException;
}
