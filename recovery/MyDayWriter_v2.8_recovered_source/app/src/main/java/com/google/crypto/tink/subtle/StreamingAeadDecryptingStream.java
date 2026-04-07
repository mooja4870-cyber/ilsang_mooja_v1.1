package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
class StreamingAeadDecryptingStream extends java.io.FilterInputStream {
    private static final int PLAINTEXT_SEGMENT_EXTRA_SIZE = 16;
    private final byte[] aad;
    private final java.nio.ByteBuffer ciphertextSegment;
    private final int ciphertextSegmentSize;
    private final com.google.crypto.tink.subtle.StreamSegmentDecrypter decrypter;
    private boolean decryptionErrorOccured;
    private boolean endOfCiphertext;
    private boolean endOfPlaintext;
    private final int firstCiphertextSegmentSize;
    private final int headerLength;
    private boolean headerRead;
    private final java.nio.ByteBuffer plaintextSegment;
    private int segmentNr;

    public StreamingAeadDecryptingStream(com.google.crypto.tink.subtle.NonceBasedStreamingAead r4, java.io.InputStream r5, byte[] r6) throws java.security.GeneralSecurityException, java.io.IOException {
            r3 = this;
            r3.<init>(r5)
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r0 = r4.newStreamSegmentDecrypter()
            r3.decrypter = r0
            int r0 = r4.getHeaderLength()
            r3.headerLength = r0
            int r0 = r6.length
            byte[] r0 = java.util.Arrays.copyOf(r6, r0)
            r3.aad = r0
            int r0 = r4.getCiphertextSegmentSize()
            r3.ciphertextSegmentSize = r0
            int r0 = r3.ciphertextSegmentSize
            int r0 = r0 + 1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r3.ciphertextSegment = r0
            java.nio.ByteBuffer r0 = r3.ciphertextSegment
            r1 = 0
            r0.limit(r1)
            int r0 = r3.ciphertextSegmentSize
            int r2 = r4.getCiphertextOffset()
            int r0 = r0 - r2
            r3.firstCiphertextSegmentSize = r0
            int r0 = r4.getPlaintextSegmentSize()
            int r0 = r0 + 16
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r3.plaintextSegment = r0
            java.nio.ByteBuffer r0 = r3.plaintextSegment
            r0.limit(r1)
            r3.headerRead = r1
            r3.endOfCiphertext = r1
            r3.endOfPlaintext = r1
            r3.segmentNr = r1
            r3.decryptionErrorOccured = r1
            return
    }

    private void loadSegment() throws java.io.IOException {
            r7 = this;
        L1:
            boolean r0 = r7.endOfCiphertext
            r1 = 1
            if (r0 != 0) goto L46
            java.nio.ByteBuffer r0 = r7.ciphertextSegment
            int r0 = r0.remaining()
            if (r0 <= 0) goto L46
            java.io.InputStream r0 = r7.in
            java.nio.ByteBuffer r2 = r7.ciphertextSegment
            byte[] r2 = r2.array()
            java.nio.ByteBuffer r3 = r7.ciphertextSegment
            int r3 = r3.position()
            java.nio.ByteBuffer r4 = r7.ciphertextSegment
            int r4 = r4.remaining()
            int r0 = r0.read(r2, r3, r4)
            if (r0 <= 0) goto L35
            java.nio.ByteBuffer r1 = r7.ciphertextSegment
            java.nio.ByteBuffer r2 = r7.ciphertextSegment
            int r2 = r2.position()
            int r2 = r2 + r0
            r1.position(r2)
            goto L3d
        L35:
            r2 = -1
            if (r0 != r2) goto L3b
            r7.endOfCiphertext = r1
            goto L3d
        L3b:
            if (r0 == 0) goto L3e
        L3d:
            goto L1
        L3e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Could not read bytes from the ciphertext stream"
            r1.<init>(r2)
            throw r1
        L46:
            r0 = 0
            boolean r2 = r7.endOfCiphertext
            if (r2 != 0) goto L64
            java.nio.ByteBuffer r2 = r7.ciphertextSegment
            java.nio.ByteBuffer r3 = r7.ciphertextSegment
            int r3 = r3.position()
            int r3 = r3 - r1
            byte r0 = r2.get(r3)
            java.nio.ByteBuffer r2 = r7.ciphertextSegment
            java.nio.ByteBuffer r3 = r7.ciphertextSegment
            int r3 = r3.position()
            int r3 = r3 - r1
            r2.position(r3)
        L64:
            java.nio.ByteBuffer r2 = r7.ciphertextSegment
            r2.flip()
            java.nio.ByteBuffer r2 = r7.plaintextSegment
            r2.clear()
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r2 = r7.decrypter     // Catch: java.security.GeneralSecurityException -> La2
            java.nio.ByteBuffer r3 = r7.ciphertextSegment     // Catch: java.security.GeneralSecurityException -> La2
            int r4 = r7.segmentNr     // Catch: java.security.GeneralSecurityException -> La2
            boolean r5 = r7.endOfCiphertext     // Catch: java.security.GeneralSecurityException -> La2
            java.nio.ByteBuffer r6 = r7.plaintextSegment     // Catch: java.security.GeneralSecurityException -> La2
            r2.decryptSegment(r3, r4, r5, r6)     // Catch: java.security.GeneralSecurityException -> La2
            int r2 = r7.segmentNr
            int r2 = r2 + r1
            r7.segmentNr = r2
            java.nio.ByteBuffer r2 = r7.plaintextSegment
            r2.flip()
            java.nio.ByteBuffer r2 = r7.ciphertextSegment
            r2.clear()
            boolean r2 = r7.endOfCiphertext
            if (r2 != 0) goto La1
            java.nio.ByteBuffer r2 = r7.ciphertextSegment
            r2.clear()
            java.nio.ByteBuffer r2 = r7.ciphertextSegment
            int r3 = r7.ciphertextSegmentSize
            int r3 = r3 + r1
            r2.limit(r3)
            java.nio.ByteBuffer r1 = r7.ciphertextSegment
            r1.put(r0)
        La1:
            return
        La2:
            r1 = move-exception
            r7.setDecryptionErrorOccured()
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r1.getMessage()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "\n"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "\nsegmentNr:"
            java.lang.StringBuilder r3 = r3.append(r4)
            int r4 = r7.segmentNr
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " endOfCiphertext:"
            java.lang.StringBuilder r3 = r3.append(r4)
            boolean r4 = r7.endOfCiphertext
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r1)
            throw r2
    }

    private void readHeader() throws java.io.IOException {
            r5 = this;
            boolean r0 = r5.headerRead
            if (r0 != 0) goto L59
            int r0 = r5.headerLength
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
        La:
            int r1 = r0.remaining()
            if (r1 <= 0) goto L43
            java.io.InputStream r1 = r5.in
            byte[] r2 = r0.array()
            int r3 = r0.position()
            int r4 = r0.remaining()
            int r1 = r1.read(r2, r3, r4)
            r2 = -1
            if (r1 == r2) goto L38
            if (r1 == 0) goto L30
            int r2 = r0.position()
            int r2 = r2 + r1
            r0.position(r2)
            goto La
        L30:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Could not read bytes from the ciphertext stream"
            r2.<init>(r3)
            throw r2
        L38:
            r5.setDecryptionErrorOccured()
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Ciphertext is too short"
            r2.<init>(r3)
            throw r2
        L43:
            r0.flip()
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r1 = r5.decrypter     // Catch: java.security.GeneralSecurityException -> L52
            byte[] r2 = r5.aad     // Catch: java.security.GeneralSecurityException -> L52
            r1.init(r0, r2)     // Catch: java.security.GeneralSecurityException -> L52
            r1 = 1
            r5.headerRead = r1
            return
        L52:
            r1 = move-exception
            java.io.IOException r2 = new java.io.IOException
            r2.<init>(r1)
            throw r2
        L59:
            r5.setDecryptionErrorOccured()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Decryption failed."
            r0.<init>(r1)
            throw r0
    }

    private void setDecryptionErrorOccured() {
            r2 = this;
            r0 = 1
            r2.decryptionErrorOccured = r0
            java.nio.ByteBuffer r0 = r2.plaintextSegment
            r1 = 0
            r0.limit(r1)
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
            r1 = this;
            monitor-enter(r1)
            java.nio.ByteBuffer r0 = r1.plaintextSegment     // Catch: java.lang.Throwable -> L9
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            super.close()     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r1) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r4 = this;
            r0 = 1
            byte[] r1 = new byte[r0]
            r2 = 0
            int r3 = r4.read(r1, r2, r0)
            if (r3 != r0) goto Lf
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
        Lf:
            r0 = -1
            if (r3 != r0) goto L13
            return r3
        L13:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Reading failed"
            r0.<init>(r2)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r0 = r2.read(r3, r0, r1)
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.decryptionErrorOccured     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L55
            boolean r0 = r6.headerRead     // Catch: java.lang.Throwable -> L5d
            r1 = 1
            if (r0 != 0) goto L1a
            r6.readHeader()     // Catch: java.lang.Throwable -> L5d
            java.nio.ByteBuffer r0 = r6.ciphertextSegment     // Catch: java.lang.Throwable -> L5d
            r0.clear()     // Catch: java.lang.Throwable -> L5d
            java.nio.ByteBuffer r0 = r6.ciphertextSegment     // Catch: java.lang.Throwable -> L5d
            int r2 = r6.firstCiphertextSegmentSize     // Catch: java.lang.Throwable -> L5d
            int r2 = r2 + r1
            r0.limit(r2)     // Catch: java.lang.Throwable -> L5d
        L1a:
            boolean r0 = r6.endOfPlaintext     // Catch: java.lang.Throwable -> L5d
            r2 = -1
            if (r0 == 0) goto L21
            monitor-exit(r6)
            return r2
        L21:
            r0 = 0
        L22:
            if (r0 >= r9) goto L4b
            java.nio.ByteBuffer r3 = r6.plaintextSegment     // Catch: java.lang.Throwable -> L5d
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L5d
            if (r3 != 0) goto L36
            boolean r3 = r6.endOfCiphertext     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L33
            r6.endOfPlaintext = r1     // Catch: java.lang.Throwable -> L5d
            goto L4b
        L33:
            r6.loadSegment()     // Catch: java.lang.Throwable -> L5d
        L36:
            java.nio.ByteBuffer r3 = r6.plaintextSegment     // Catch: java.lang.Throwable -> L5d
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L5d
            int r4 = r9 - r0
            int r3 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> L5d
            java.nio.ByteBuffer r4 = r6.plaintextSegment     // Catch: java.lang.Throwable -> L5d
            int r5 = r0 + r8
            r4.get(r7, r5, r3)     // Catch: java.lang.Throwable -> L5d
            int r0 = r0 + r3
            goto L22
        L4b:
            if (r0 != 0) goto L53
            boolean r1 = r6.endOfPlaintext     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L53
            monitor-exit(r6)
            return r2
        L53:
            monitor-exit(r6)
            return r0
        L55:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = "Decryption failed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5d
            throw r0     // Catch: java.lang.Throwable -> L5d
        L5d:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5d
            throw r7
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long r12) throws java.io.IOException {
            r11 = this;
            int r0 = r11.ciphertextSegmentSize
            long r0 = (long) r0
            r2 = r12
            r4 = 0
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 > 0) goto Lb
            return r4
        Lb:
            long r6 = java.lang.Math.min(r0, r2)
            int r6 = (int) r6
            byte[] r7 = new byte[r6]
        L12:
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L27
            long r8 = (long) r6
            long r8 = java.lang.Math.min(r8, r2)
            int r8 = (int) r8
            r9 = 0
            int r8 = r11.read(r7, r9, r8)
            if (r8 > 0) goto L24
            goto L27
        L24:
            long r9 = (long) r8
            long r2 = r2 - r9
            goto L12
        L27:
            long r4 = r12 - r2
            return r4
    }

    public synchronized java.lang.String toString() {
            r3 = this;
            monitor-enter(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La5
            r0.<init>()     // Catch: java.lang.Throwable -> La5
            java.lang.String r1 = "StreamingAeadDecryptingStream"
            java.lang.StringBuilder r1 = r0.append(r1)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "\nsegmentNr:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            int r2 = r3.segmentNr     // Catch: java.lang.Throwable -> La5
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "\nciphertextSegmentSize:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            int r2 = r3.ciphertextSegmentSize     // Catch: java.lang.Throwable -> La5
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "\nheaderRead:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            boolean r2 = r3.headerRead     // Catch: java.lang.Throwable -> La5
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "\nendOfCiphertext:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            boolean r2 = r3.endOfCiphertext     // Catch: java.lang.Throwable -> La5
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "\nendOfPlaintext:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            boolean r2 = r3.endOfPlaintext     // Catch: java.lang.Throwable -> La5
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "\ndecryptionErrorOccured:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            boolean r2 = r3.decryptionErrorOccured     // Catch: java.lang.Throwable -> La5
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "\nciphertextSgement"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = " position:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            java.nio.ByteBuffer r2 = r3.ciphertextSegment     // Catch: java.lang.Throwable -> La5
            int r2 = r2.position()     // Catch: java.lang.Throwable -> La5
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = " limit:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            java.nio.ByteBuffer r2 = r3.ciphertextSegment     // Catch: java.lang.Throwable -> La5
            int r2 = r2.limit()     // Catch: java.lang.Throwable -> La5
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "\nplaintextSegment"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = " position:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            java.nio.ByteBuffer r2 = r3.plaintextSegment     // Catch: java.lang.Throwable -> La5
            int r2 = r2.position()     // Catch: java.lang.Throwable -> La5
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = " limit:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La5
            java.nio.ByteBuffer r2 = r3.plaintextSegment     // Catch: java.lang.Throwable -> La5
            int r2 = r2.limit()     // Catch: java.lang.Throwable -> La5
            r1.append(r2)     // Catch: java.lang.Throwable -> La5
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> La5
            monitor-exit(r3)
            return r1
        La5:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La5
            throw r0
    }
}
