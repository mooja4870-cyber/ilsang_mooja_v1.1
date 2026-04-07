package com.google.crypto.tink.streamingaead;

/* JADX INFO: loaded from: classes.dex */
final class StreamingAeadHelper implements com.google.crypto.tink.StreamingAead {
    com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> primitives;

    public StreamingAeadHelper(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> r3) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            com.google.crypto.tink.PrimitiveSet$Entry r0 = r3.getPrimary()
            if (r0 == 0) goto Lc
            r2.primitives = r3
            return
        Lc:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Missing primary primitive."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.nio.channels.ReadableByteChannel newDecryptingChannel(java.nio.channels.ReadableByteChannel r3, byte[] r4) throws java.security.GeneralSecurityException, java.io.IOException {
            r2 = this;
            com.google.crypto.tink.streamingaead.ReadableByteChannelDecrypter r0 = new com.google.crypto.tink.streamingaead.ReadableByteChannelDecrypter
            com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> r1 = r2.primitives
            r0.<init>(r1, r3, r4)
            return r0
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.io.InputStream newDecryptingStream(java.io.InputStream r3, byte[] r4) throws java.security.GeneralSecurityException, java.io.IOException {
            r2 = this;
            com.google.crypto.tink.streamingaead.InputStreamDecrypter r0 = new com.google.crypto.tink.streamingaead.InputStreamDecrypter
            com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> r1 = r2.primitives
            r0.<init>(r1, r3, r4)
            return r0
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.nio.channels.WritableByteChannel newEncryptingChannel(java.nio.channels.WritableByteChannel r2, byte[] r3) throws java.security.GeneralSecurityException, java.io.IOException {
            r1 = this;
            com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> r0 = r1.primitives
            com.google.crypto.tink.PrimitiveSet$Entry r0 = r0.getPrimary()
            java.lang.Object r0 = r0.getPrimitive()
            com.google.crypto.tink.StreamingAead r0 = (com.google.crypto.tink.StreamingAead) r0
            java.nio.channels.WritableByteChannel r0 = r0.newEncryptingChannel(r2, r3)
            return r0
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.io.OutputStream newEncryptingStream(java.io.OutputStream r2, byte[] r3) throws java.security.GeneralSecurityException, java.io.IOException {
            r1 = this;
            com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> r0 = r1.primitives
            com.google.crypto.tink.PrimitiveSet$Entry r0 = r0.getPrimary()
            java.lang.Object r0 = r0.getPrimitive()
            com.google.crypto.tink.StreamingAead r0 = (com.google.crypto.tink.StreamingAead) r0
            java.io.OutputStream r0 = r0.newEncryptingStream(r2, r3)
            return r0
    }

    @Override // com.google.crypto.tink.StreamingAead
    public java.nio.channels.SeekableByteChannel newSeekableDecryptingChannel(java.nio.channels.SeekableByteChannel r3, byte[] r4) throws java.security.GeneralSecurityException, java.io.IOException {
            r2 = this;
            com.google.crypto.tink.streamingaead.SeekableByteChannelDecrypter r0 = new com.google.crypto.tink.streamingaead.SeekableByteChannelDecrypter
            com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> r1 = r2.primitives
            r0.<init>(r1, r3, r4)
            return r0
    }
}
