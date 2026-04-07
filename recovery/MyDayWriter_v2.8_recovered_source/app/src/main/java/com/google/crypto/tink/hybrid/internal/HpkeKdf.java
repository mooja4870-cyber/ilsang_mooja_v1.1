package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
interface HpkeKdf {
    byte[] extractAndExpand(byte[] r1, byte[] r2, java.lang.String r3, byte[] r4, java.lang.String r5, byte[] r6, int r7) throws java.security.GeneralSecurityException;

    byte[] getKdfId() throws java.security.GeneralSecurityException;

    byte[] labeledExpand(byte[] r1, byte[] r2, java.lang.String r3, byte[] r4, int r5) throws java.security.GeneralSecurityException;

    byte[] labeledExtract(byte[] r1, byte[] r2, java.lang.String r3, byte[] r4) throws java.security.GeneralSecurityException;
}
