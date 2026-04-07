package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
class StreamingAeadEncryptingStream extends java.io.FilterOutputStream {
    java.nio.ByteBuffer ctBuffer;
    private com.google.crypto.tink.subtle.StreamSegmentEncrypter encrypter;
    boolean open;
    private int plaintextSegmentSize;
    java.nio.ByteBuffer ptBuffer;

    public StreamingAeadEncryptingStream(com.google.crypto.tink.subtle.NonceBasedStreamingAead r4, java.io.OutputStream r5, byte[] r6) throws java.security.GeneralSecurityException, java.io.IOException {
            r3 = this;
            r3.<init>(r5)
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r0 = r4.newStreamSegmentEncrypter(r6)
            r3.encrypter = r0
            int r0 = r4.getPlaintextSegmentSize()
            r3.plaintextSegmentSize = r0
            int r0 = r3.plaintextSegmentSize
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r3.ptBuffer = r0
            int r0 = r4.getCiphertextSegmentSize()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r3.ctBuffer = r0
            java.nio.ByteBuffer r0 = r3.ptBuffer
            int r1 = r3.plaintextSegmentSize
            int r2 = r4.getCiphertextOffset()
            int r1 = r1 - r2
            r0.limit(r1)
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r0 = r3.encrypter
            java.nio.ByteBuffer r0 = r0.getHeader()
            int r1 = r0.remaining()
            byte[] r1 = new byte[r1]
            r0.get(r1)
            java.io.OutputStream r2 = r3.out
            r2.write(r1)
            r2 = 1
            r3.open = r2
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.open     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L7
            monitor-exit(r4)
            return
        L7:
            java.nio.ByteBuffer r0 = r4.ptBuffer     // Catch: java.security.GeneralSecurityException -> L40 java.lang.Throwable -> L70
            r0.flip()     // Catch: java.security.GeneralSecurityException -> L40 java.lang.Throwable -> L70
            java.nio.ByteBuffer r0 = r4.ctBuffer     // Catch: java.security.GeneralSecurityException -> L40 java.lang.Throwable -> L70
            r0.clear()     // Catch: java.security.GeneralSecurityException -> L40 java.lang.Throwable -> L70
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r0 = r4.encrypter     // Catch: java.security.GeneralSecurityException -> L40 java.lang.Throwable -> L70
            java.nio.ByteBuffer r1 = r4.ptBuffer     // Catch: java.security.GeneralSecurityException -> L40 java.lang.Throwable -> L70
            java.nio.ByteBuffer r2 = r4.ctBuffer     // Catch: java.security.GeneralSecurityException -> L40 java.lang.Throwable -> L70
            r3 = 1
            r0.encryptSegment(r1, r3, r2)     // Catch: java.security.GeneralSecurityException -> L40 java.lang.Throwable -> L70
            java.nio.ByteBuffer r0 = r4.ctBuffer     // Catch: java.lang.Throwable -> L70
            r0.flip()     // Catch: java.lang.Throwable -> L70
            java.io.OutputStream r0 = r4.out     // Catch: java.lang.Throwable -> L70
            java.nio.ByteBuffer r1 = r4.ctBuffer     // Catch: java.lang.Throwable -> L70
            byte[] r1 = r1.array()     // Catch: java.lang.Throwable -> L70
            java.nio.ByteBuffer r2 = r4.ctBuffer     // Catch: java.lang.Throwable -> L70
            int r2 = r2.position()     // Catch: java.lang.Throwable -> L70
            java.nio.ByteBuffer r3 = r4.ctBuffer     // Catch: java.lang.Throwable -> L70
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L70
            r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L70
            r0 = 0
            r4.open = r0     // Catch: java.lang.Throwable -> L70
            super.close()     // Catch: java.lang.Throwable -> L70
            monitor-exit(r4)
            return
        L40:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r2.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = "ptBuffer.remaining():"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L70
            java.nio.ByteBuffer r3 = r4.ptBuffer     // Catch: java.lang.Throwable -> L70
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = " ctBuffer.remaining():"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L70
            java.nio.ByteBuffer r3 = r4.ctBuffer     // Catch: java.lang.Throwable -> L70
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L70
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L70
            throw r1     // Catch: java.lang.Throwable -> L70
        L70:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            throw r0
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r4) throws java.io.IOException {
            r3 = this;
            byte r0 = (byte) r4
            r1 = 1
            byte[] r1 = new byte[r1]
            r2 = 0
            r1[r2] = r0
            r3.write(r1)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.write(r3, r0, r1)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] r9, int r10, int r11) throws java.io.IOException {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.open     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L68
            r0 = r10
            r1 = r11
        L7:
            java.nio.ByteBuffer r2 = r8.ptBuffer     // Catch: java.lang.Throwable -> L70
            int r2 = r2.remaining()     // Catch: java.lang.Throwable -> L70
            if (r1 <= r2) goto L61
            java.nio.ByteBuffer r2 = r8.ptBuffer     // Catch: java.lang.Throwable -> L70
            int r2 = r2.remaining()     // Catch: java.lang.Throwable -> L70
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r9, r0, r2)     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r2
            int r1 = r1 - r2
            java.nio.ByteBuffer r4 = r8.ptBuffer     // Catch: java.security.GeneralSecurityException -> L5a java.lang.Throwable -> L70
            r4.flip()     // Catch: java.security.GeneralSecurityException -> L5a java.lang.Throwable -> L70
            java.nio.ByteBuffer r4 = r8.ctBuffer     // Catch: java.security.GeneralSecurityException -> L5a java.lang.Throwable -> L70
            r4.clear()     // Catch: java.security.GeneralSecurityException -> L5a java.lang.Throwable -> L70
            com.google.crypto.tink.subtle.StreamSegmentEncrypter r4 = r8.encrypter     // Catch: java.security.GeneralSecurityException -> L5a java.lang.Throwable -> L70
            java.nio.ByteBuffer r5 = r8.ptBuffer     // Catch: java.security.GeneralSecurityException -> L5a java.lang.Throwable -> L70
            java.nio.ByteBuffer r6 = r8.ctBuffer     // Catch: java.security.GeneralSecurityException -> L5a java.lang.Throwable -> L70
            r7 = 0
            r4.encryptSegment(r5, r3, r7, r6)     // Catch: java.security.GeneralSecurityException -> L5a java.lang.Throwable -> L70
            java.nio.ByteBuffer r4 = r8.ctBuffer     // Catch: java.lang.Throwable -> L70
            r4.flip()     // Catch: java.lang.Throwable -> L70
            java.io.OutputStream r4 = r8.out     // Catch: java.lang.Throwable -> L70
            java.nio.ByteBuffer r5 = r8.ctBuffer     // Catch: java.lang.Throwable -> L70
            byte[] r5 = r5.array()     // Catch: java.lang.Throwable -> L70
            java.nio.ByteBuffer r6 = r8.ctBuffer     // Catch: java.lang.Throwable -> L70
            int r6 = r6.position()     // Catch: java.lang.Throwable -> L70
            java.nio.ByteBuffer r7 = r8.ctBuffer     // Catch: java.lang.Throwable -> L70
            int r7 = r7.remaining()     // Catch: java.lang.Throwable -> L70
            r4.write(r5, r6, r7)     // Catch: java.lang.Throwable -> L70
            java.nio.ByteBuffer r4 = r8.ptBuffer     // Catch: java.lang.Throwable -> L70
            r4.clear()     // Catch: java.lang.Throwable -> L70
            java.nio.ByteBuffer r4 = r8.ptBuffer     // Catch: java.lang.Throwable -> L70
            int r5 = r8.plaintextSegmentSize     // Catch: java.lang.Throwable -> L70
            r4.limit(r5)     // Catch: java.lang.Throwable -> L70
            goto L7
        L5a:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L70
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L70
            throw r5     // Catch: java.lang.Throwable -> L70
        L61:
            java.nio.ByteBuffer r2 = r8.ptBuffer     // Catch: java.lang.Throwable -> L70
            r2.put(r9, r0, r1)     // Catch: java.lang.Throwable -> L70
            monitor-exit(r8)
            return
        L68:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "Trying to write to closed stream"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L70
            throw r0     // Catch: java.lang.Throwable -> L70
        L70:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L70
            throw r9
    }
}
