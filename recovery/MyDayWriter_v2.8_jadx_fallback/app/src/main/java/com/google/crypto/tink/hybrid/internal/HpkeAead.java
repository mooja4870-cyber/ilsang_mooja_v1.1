package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
interface HpkeAead {
    byte[] getAeadId() throws java.security.GeneralSecurityException;

    int getKeyLength();

    int getNonceLength();

    byte[] open(byte[] r1, byte[] r2, byte[] r3, byte[] r4) throws java.security.GeneralSecurityException;

    byte[] seal(byte[] r1, byte[] r2, byte[] r3, byte[] r4) throws java.security.GeneralSecurityException;
}
