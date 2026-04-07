package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public interface StreamSegmentDecrypter {
    void decryptSegment(java.nio.ByteBuffer r1, int r2, boolean r3, java.nio.ByteBuffer r4) throws java.security.GeneralSecurityException;

    void init(java.nio.ByteBuffer r1, byte[] r2) throws java.security.GeneralSecurityException;
}
