package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public interface StreamingAead {
    java.nio.channels.ReadableByteChannel newDecryptingChannel(java.nio.channels.ReadableByteChannel r1, byte[] r2) throws java.security.GeneralSecurityException, java.io.IOException;

    java.io.InputStream newDecryptingStream(java.io.InputStream r1, byte[] r2) throws java.security.GeneralSecurityException, java.io.IOException;

    java.nio.channels.WritableByteChannel newEncryptingChannel(java.nio.channels.WritableByteChannel r1, byte[] r2) throws java.security.GeneralSecurityException, java.io.IOException;

    java.io.OutputStream newEncryptingStream(java.io.OutputStream r1, byte[] r2) throws java.security.GeneralSecurityException, java.io.IOException;

    java.nio.channels.SeekableByteChannel newSeekableDecryptingChannel(java.nio.channels.SeekableByteChannel r1, byte[] r2) throws java.security.GeneralSecurityException, java.io.IOException;
}
