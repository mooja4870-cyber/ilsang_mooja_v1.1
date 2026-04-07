package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
class StreamingAeadEncryptingChannel implements java.nio.channels.WritableByteChannel {
    private java.nio.channels.WritableByteChannel ciphertextChannel;
    java.nio.ByteBuffer ctBuffer;
    private com.google.crypto.tink.subtle.StreamSegmentEncrypter encrypter;
    boolean open;
    private int plaintextSegmentSize;
    java.nio.ByteBuffer ptBuffer;

    public StreamingAeadEncryptingChannel(com.google.crypto.tink.subtle.NonceBasedStreamingAead r4, java.nio.channels.WritableByteChannel r5, byte[] r6) throws java.security.GeneralSecurityException, java.io.IOException {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.open = r0
            r3.ciphertextChannel = r5
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r0 = r4.newStreamSegmentEncrypter(r6)
            r3.encrypter = r0
            int r0 = r4.getPlaintextSegmentSize()
            r3.plaintextSegmentSize = r0
            int r0 = r3.plaintextSegmentSize
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r3.ptBuffer = r0
            java.nio.ByteBuffer r0 = r3.ptBuffer
            int r1 = r3.plaintextSegmentSize
            int r2 = r4.getCiphertextOffset()
            int r1 = r1 - r2
            r0.limit(r1)
            int r0 = r4.getCiphertextSegmentSize()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r3.ctBuffer = r0
            java.nio.ByteBuffer r0 = r3.ctBuffer
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r1 = r3.encrypter
            java.nio.ByteBuffer r1 = r1.getHeader()
            r0.put(r1)
            java.nio.ByteBuffer r0 = r3.ctBuffer
            r0.flip()
            java.nio.ByteBuffer r0 = r3.ctBuffer
            r5.write(r0)
            return
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.open     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L7
            monitor-exit(r4)
            return
        L7:
            java.nio.ByteBuffer r0 = r4.ctBuffer     // Catch: java.lang.Throwable -> L68
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L68
            if (r0 <= 0) goto L22
            java.nio.channels.WritableByteChannel r0 = r4.ciphertextChannel     // Catch: java.lang.Throwable -> L68
            java.nio.ByteBuffer r1 = r4.ctBuffer     // Catch: java.lang.Throwable -> L68
            int r0 = r0.write(r1)     // Catch: java.lang.Throwable -> L68
            if (r0 <= 0) goto L1a
            goto L7
        L1a:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "Failed to write ciphertext before closing"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L68
            throw r1     // Catch: java.lang.Throwable -> L68
        L22:
            java.nio.ByteBuffer r0 = r4.ctBuffer     // Catch: java.security.GeneralSecurityException -> L61 java.lang.Throwable -> L68
            r0.clear()     // Catch: java.security.GeneralSecurityException -> L61 java.lang.Throwable -> L68
            java.nio.ByteBuffer r0 = r4.ptBuffer     // Catch: java.security.GeneralSecurityException -> L61 java.lang.Throwable -> L68
            r0.flip()     // Catch: java.security.GeneralSecurityException -> L61 java.lang.Throwable -> L68
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r0 = r4.encrypter     // Catch: java.security.GeneralSecurityException -> L61 java.lang.Throwable -> L68
            java.nio.ByteBuffer r1 = r4.ptBuffer     // Catch: java.security.GeneralSecurityException -> L61 java.lang.Throwable -> L68
            java.nio.ByteBuffer r2 = r4.ctBuffer     // Catch: java.security.GeneralSecurityException -> L61 java.lang.Throwable -> L68
            r3 = 1
            r0.encryptSegment(r1, r3, r2)     // Catch: java.security.GeneralSecurityException -> L61 java.lang.Throwable -> L68
            java.nio.ByteBuffer r0 = r4.ctBuffer     // Catch: java.lang.Throwable -> L68
            r0.flip()     // Catch: java.lang.Throwable -> L68
        L3c:
            java.nio.ByteBuffer r0 = r4.ctBuffer     // Catch: java.lang.Throwable -> L68
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L68
            if (r0 <= 0) goto L57
            java.nio.channels.WritableByteChannel r0 = r4.ciphertextChannel     // Catch: java.lang.Throwable -> L68
            java.nio.ByteBuffer r1 = r4.ctBuffer     // Catch: java.lang.Throwable -> L68
            int r0 = r0.write(r1)     // Catch: java.lang.Throwable -> L68
            if (r0 <= 0) goto L4f
            goto L3c
        L4f:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "Failed to write ciphertext before closing"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L68
            throw r1     // Catch: java.lang.Throwable -> L68
        L57:
            java.nio.channels.WritableByteChannel r0 = r4.ciphertextChannel     // Catch: java.lang.Throwable -> L68
            r0.close()     // Catch: java.lang.Throwable -> L68
            r0 = 0
            r4.open = r0     // Catch: java.lang.Throwable -> L68
            monitor-exit(r4)
            return
        L61:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L68
            throw r1     // Catch: java.lang.Throwable -> L68
        L68:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L68
            throw r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            boolean r0 = r1.open
            return r0
    }

    @Override // java.nio.channels.WritableByteChannel
    public synchronized int write(java.nio.ByteBuffer r8) throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.open     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L9a
            java.nio.ByteBuffer r0 = r7.ctBuffer     // Catch: java.lang.Throwable -> La0
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> La0
            if (r0 <= 0) goto L14
            java.nio.channels.WritableByteChannel r0 = r7.ciphertextChannel     // Catch: java.lang.Throwable -> La0
            java.nio.ByteBuffer r1 = r7.ctBuffer     // Catch: java.lang.Throwable -> La0
            r0.write(r1)     // Catch: java.lang.Throwable -> La0
        L14:
            int r0 = r8.position()     // Catch: java.lang.Throwable -> La0
        L18:
            int r1 = r8.remaining()     // Catch: java.lang.Throwable -> La0
            java.nio.ByteBuffer r2 = r7.ptBuffer     // Catch: java.lang.Throwable -> La0
            int r2 = r2.remaining()     // Catch: java.lang.Throwable -> La0
            if (r1 <= r2) goto L8e
            java.nio.ByteBuffer r1 = r7.ctBuffer     // Catch: java.lang.Throwable -> La0
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> La0
            if (r1 <= 0) goto L33
            int r1 = r8.position()     // Catch: java.lang.Throwable -> La0
            int r1 = r1 - r0
            monitor-exit(r7)
            return r1
        L33:
            java.nio.ByteBuffer r1 = r7.ptBuffer     // Catch: java.lang.Throwable -> La0
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> La0
            java.nio.ByteBuffer r2 = r8.slice()     // Catch: java.lang.Throwable -> La0
            r2.limit(r1)     // Catch: java.lang.Throwable -> La0
            int r3 = r8.position()     // Catch: java.lang.Throwable -> La0
            int r3 = r3 + r1
            r8.position(r3)     // Catch: java.lang.Throwable -> La0
            java.nio.ByteBuffer r3 = r7.ptBuffer     // Catch: java.security.GeneralSecurityException -> L87 java.lang.Throwable -> La0
            r3.flip()     // Catch: java.security.GeneralSecurityException -> L87 java.lang.Throwable -> La0
            java.nio.ByteBuffer r3 = r7.ctBuffer     // Catch: java.security.GeneralSecurityException -> L87 java.lang.Throwable -> La0
            r3.clear()     // Catch: java.security.GeneralSecurityException -> L87 java.lang.Throwable -> La0
            int r3 = r2.remaining()     // Catch: java.security.GeneralSecurityException -> L87 java.lang.Throwable -> La0
            r4 = 0
            if (r3 == 0) goto L63
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r3 = r7.encrypter     // Catch: java.security.GeneralSecurityException -> L87 java.lang.Throwable -> La0
            java.nio.ByteBuffer r5 = r7.ptBuffer     // Catch: java.security.GeneralSecurityException -> L87 java.lang.Throwable -> La0
            java.nio.ByteBuffer r6 = r7.ctBuffer     // Catch: java.security.GeneralSecurityException -> L87 java.lang.Throwable -> La0
            r3.encryptSegment(r5, r2, r4, r6)     // Catch: java.security.GeneralSecurityException -> L87 java.lang.Throwable -> La0
            goto L6c
        L63:
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r3 = r7.encrypter     // Catch: java.security.GeneralSecurityException -> L87 java.lang.Throwable -> La0
            java.nio.ByteBuffer r5 = r7.ptBuffer     // Catch: java.security.GeneralSecurityException -> L87 java.lang.Throwable -> La0
            java.nio.ByteBuffer r6 = r7.ctBuffer     // Catch: java.security.GeneralSecurityException -> L87 java.lang.Throwable -> La0
            r3.encryptSegment(r5, r4, r6)     // Catch: java.security.GeneralSecurityException -> L87 java.lang.Throwable -> La0
        L6c:
            java.nio.ByteBuffer r3 = r7.ctBuffer     // Catch: java.lang.Throwable -> La0
            r3.flip()     // Catch: java.lang.Throwable -> La0
            java.nio.channels.WritableByteChannel r3 = r7.ciphertextChannel     // Catch: java.lang.Throwable -> La0
            java.nio.ByteBuffer r4 = r7.ctBuffer     // Catch: java.lang.Throwable -> La0
            r3.write(r4)     // Catch: java.lang.Throwable -> La0
            java.nio.ByteBuffer r3 = r7.ptBuffer     // Catch: java.lang.Throwable -> La0
            r3.clear()     // Catch: java.lang.Throwable -> La0
            java.nio.ByteBuffer r3 = r7.ptBuffer     // Catch: java.lang.Throwable -> La0
            int r4 = r7.plaintextSegmentSize     // Catch: java.lang.Throwable -> La0
            r3.limit(r4)     // Catch: java.lang.Throwable -> La0
            goto L18
        L87:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> La0
            r4.<init>(r3)     // Catch: java.lang.Throwable -> La0
            throw r4     // Catch: java.lang.Throwable -> La0
        L8e:
            java.nio.ByteBuffer r1 = r7.ptBuffer     // Catch: java.lang.Throwable -> La0
            r1.put(r8)     // Catch: java.lang.Throwable -> La0
            int r1 = r8.position()     // Catch: java.lang.Throwable -> La0
            int r1 = r1 - r0
            monitor-exit(r7)
            return r1
        L9a:
            java.nio.channels.ClosedChannelException r0 = new java.nio.channels.ClosedChannelException     // Catch: java.lang.Throwable -> La0
            r0.<init>()     // Catch: java.lang.Throwable -> La0
            throw r0     // Catch: java.lang.Throwable -> La0
        La0:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> La0
            throw r8
    }
}
