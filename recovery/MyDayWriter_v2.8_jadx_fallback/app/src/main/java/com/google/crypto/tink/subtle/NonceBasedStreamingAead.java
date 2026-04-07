package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
abstract class NonceBasedStreamingAead implements com.google.crypto.tink.StreamingAead {
    NonceBasedStreamingAead() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract int getCiphertextOffset();

    public abstract int getCiphertextOverhead();

    public abstract int getCiphertextSegmentSize();

    public abstract int getHeaderLength();

    public abstract int getPlaintextSegmentSize();

    @Override // com.google.crypto.tink.StreamingAead
    public java.nio.channels.ReadableByteChannel newDecryptingChannel(java.nio.channels.ReadableByteChannel r2, byte[] r3) throws java.security.GeneralSecurityException, java.io.IOException {
            r1 = this;
            com.google.crypto.tink.subtle.StreamingAeadDecryptingChannel r0 = new com.google.crypto.tink.subtle.StreamingAeadDecryptingChannel
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.io.InputStream newDecryptingStream(java.io.InputStream r2, byte[] r3) throws java.security.GeneralSecurityException, java.io.IOException {
            r1 = this;
            com.google.crypto.tink.subtle.StreamingAeadDecryptingStream r0 = new com.google.crypto.tink.subtle.StreamingAeadDecryptingStream
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.nio.channels.WritableByteChannel newEncryptingChannel(java.nio.channels.WritableByteChannel r2, byte[] r3) throws java.security.GeneralSecurityException, java.io.IOException {
            r1 = this;
            com.google.crypto.tink.subtle.StreamingAeadEncryptingChannel r0 = new com.google.crypto.tink.subtle.StreamingAeadEncryptingChannel
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.io.OutputStream newEncryptingStream(java.io.OutputStream r2, byte[] r3) throws java.security.GeneralSecurityException, java.io.IOException {
            r1 = this;
            com.google.crypto.tink.subtle.StreamingAeadEncryptingStream r0 = new com.google.crypto.tink.subtle.StreamingAeadEncryptingStream
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.nio.channels.SeekableByteChannel newSeekableDecryptingChannel(java.nio.channels.SeekableByteChannel r2, byte[] r3) throws java.security.GeneralSecurityException, java.io.IOException {
            r1 = this;
            com.google.crypto.tink.subtle.StreamingAeadSeekableDecryptingChannel r0 = new com.google.crypto.tink.subtle.StreamingAeadSeekableDecryptingChannel
            r0.<init>(r1, r2, r3)
            return r0
    }

    public abstract com.google.crypto.tink.subtle.StreamSegmentDecrypter newStreamSegmentDecrypter() throws java.security.GeneralSecurityException;

    public abstract com.google.crypto.tink.subtle.StreamSegmentEncrypter newStreamSegmentEncrypter(byte[] r1) throws java.security.GeneralSecurityException;
}
