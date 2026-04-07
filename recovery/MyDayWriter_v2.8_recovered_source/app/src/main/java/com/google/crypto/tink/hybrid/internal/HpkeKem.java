package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
interface HpkeKem {
    byte[] decapsulate(byte[] r1, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey r2) throws java.security.GeneralSecurityException;

    com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput encapsulate(byte[] r1) throws java.security.GeneralSecurityException;

    byte[] getKemId() throws java.security.GeneralSecurityException;
}
