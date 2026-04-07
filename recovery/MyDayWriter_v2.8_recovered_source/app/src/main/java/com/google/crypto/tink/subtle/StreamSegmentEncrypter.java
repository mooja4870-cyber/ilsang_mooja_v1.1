package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public interface StreamSegmentEncrypter {
    void encryptSegment(java.nio.ByteBuffer r1, java.nio.ByteBuffer r2, boolean r3, java.nio.ByteBuffer r4) throws java.security.GeneralSecurityException;

    void encryptSegment(java.nio.ByteBuffer r1, boolean r2, java.nio.ByteBuffer r3) throws java.security.GeneralSecurityException;

    java.nio.ByteBuffer getHeader();
}
