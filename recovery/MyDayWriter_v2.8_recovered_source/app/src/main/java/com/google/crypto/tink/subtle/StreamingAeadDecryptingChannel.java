package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
class StreamingAeadDecryptingChannel implements java.nio.channels.ReadableByteChannel {
    private static final int PLAINTEXT_SEGMENT_EXTRA_SIZE = 16;
    private final byte[] associatedData;
    private java.nio.channels.ReadableByteChannel ciphertextChannel;
    private java.nio.ByteBuffer ciphertextSegment;
    private final int ciphertextSegmentSize;
    private final com.google.crypto.tink.subtle.StreamSegmentDecrypter decrypter;
    private boolean definedState;
    private boolean endOfCiphertext;
    private boolean endOfPlaintext;
    private final int firstCiphertextSegmentSize;
    private java.nio.ByteBuffer header;
    private boolean headerRead;
    private java.nio.ByteBuffer plaintextSegment;
    private int segmentNr;

    public StreamingAeadDecryptingChannel(com.google.crypto.tink.subtle.NonceBasedStreamingAead r5, java.nio.channels.ReadableByteChannel r6, byte[] r7) throws java.security.GeneralSecurityException, java.io.IOException {
            r4 = this;
            r4.<init>()
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r0 = r5.newStreamSegmentDecrypter()
            r4.decrypter = r0
            r4.ciphertextChannel = r6
            int r0 = r5.getHeaderLength()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r4.header = r0
            int r0 = r7.length
            byte[] r0 = java.util.Arrays.copyOf(r7, r0)
            r4.associatedData = r0
            int r0 = r5.getCiphertextSegmentSize()
            r4.ciphertextSegmentSize = r0
            int r0 = r4.ciphertextSegmentSize
            r1 = 1
            int r0 = r0 + r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r4.ciphertextSegment = r0
            java.nio.ByteBuffer r0 = r4.ciphertextSegment
            r2 = 0
            r0.limit(r2)
            int r0 = r4.ciphertextSegmentSize
            int r3 = r5.getCiphertextOffset()
            int r0 = r0 - r3
            r4.firstCiphertextSegmentSize = r0
            int r0 = r5.getPlaintextSegmentSize()
            int r0 = r0 + 16
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r4.plaintextSegment = r0
            java.nio.ByteBuffer r0 = r4.plaintextSegment
            r0.limit(r2)
            r4.headerRead = r2
            r4.endOfCiphertext = r2
            r4.endOfPlaintext = r2
            r4.segmentNr = r2
            r4.definedState = r1
            return
    }

    private void readSomeCiphertext(java.nio.ByteBuffer r3) throws java.io.IOException {
            r2 = this;
        L1:
            java.nio.channels.ReadableByteChannel r0 = r2.ciphertextChannel
            int r0 = r0.read(r3)
            if (r0 <= 0) goto Lf
            int r1 = r3.remaining()
            if (r1 > 0) goto L1
        Lf:
            r1 = -1
            if (r0 != r1) goto L15
            r1 = 1
            r2.endOfCiphertext = r1
        L15:
            return
    }

    private void setUndefinedState() {
            r2 = this;
            r0 = 0
            r2.definedState = r0
            java.nio.ByteBuffer r1 = r2.plaintextSegment
            r1.limit(r0)
            return
    }

    private boolean tryLoadSegment() throws java.io.IOException {
            r7 = this;
            boolean r0 = r7.endOfCiphertext
            if (r0 != 0) goto L9
            java.nio.ByteBuffer r0 = r7.ciphertextSegment
            r7.readSomeCiphertext(r0)
        L9:
            java.nio.ByteBuffer r0 = r7.ciphertextSegment
            int r0 = r0.remaining()
            if (r0 <= 0) goto L17
            boolean r0 = r7.endOfCiphertext
            if (r0 != 0) goto L17
            r0 = 0
            return r0
        L17:
            r0 = 0
            boolean r1 = r7.endOfCiphertext
            r2 = 1
            if (r1 != 0) goto L36
            java.nio.ByteBuffer r1 = r7.ciphertextSegment
            java.nio.ByteBuffer r3 = r7.ciphertextSegment
            int r3 = r3.position()
            int r3 = r3 - r2
            byte r0 = r1.get(r3)
            java.nio.ByteBuffer r1 = r7.ciphertextSegment
            java.nio.ByteBuffer r3 = r7.ciphertextSegment
            int r3 = r3.position()
            int r3 = r3 - r2
            r1.position(r3)
        L36:
            java.nio.ByteBuffer r1 = r7.ciphertextSegment
            r1.flip()
            java.nio.ByteBuffer r1 = r7.plaintextSegment
            r1.clear()
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r1 = r7.decrypter     // Catch: java.security.GeneralSecurityException -> L74
            java.nio.ByteBuffer r3 = r7.ciphertextSegment     // Catch: java.security.GeneralSecurityException -> L74
            int r4 = r7.segmentNr     // Catch: java.security.GeneralSecurityException -> L74
            boolean r5 = r7.endOfCiphertext     // Catch: java.security.GeneralSecurityException -> L74
            java.nio.ByteBuffer r6 = r7.plaintextSegment     // Catch: java.security.GeneralSecurityException -> L74
            r1.decryptSegment(r3, r4, r5, r6)     // Catch: java.security.GeneralSecurityException -> L74
            int r1 = r7.segmentNr
            int r1 = r1 + r2
            r7.segmentNr = r1
            java.nio.ByteBuffer r1 = r7.plaintextSegment
            r1.flip()
            java.nio.ByteBuffer r1 = r7.ciphertextSegment
            r1.clear()
            boolean r1 = r7.endOfCiphertext
            if (r1 != 0) goto L73
            java.nio.ByteBuffer r1 = r7.ciphertextSegment
            r1.clear()
            java.nio.ByteBuffer r1 = r7.ciphertextSegment
            int r3 = r7.ciphertextSegmentSize
            int r3 = r3 + r2
            r1.limit(r3)
            java.nio.ByteBuffer r1 = r7.ciphertextSegment
            r1.put(r0)
        L73:
            return r2
        L74:
            r1 = move-exception
            r7.setUndefinedState()
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

    private boolean tryReadHeader() throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.endOfCiphertext
            if (r0 != 0) goto L30
            java.nio.ByteBuffer r0 = r3.header
            r3.readSomeCiphertext(r0)
            java.nio.ByteBuffer r0 = r3.header
            int r0 = r0.remaining()
            if (r0 <= 0) goto L13
            r0 = 0
            return r0
        L13:
            java.nio.ByteBuffer r0 = r3.header
            r0.flip()
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r0 = r3.decrypter     // Catch: java.security.GeneralSecurityException -> L26
            java.nio.ByteBuffer r1 = r3.header     // Catch: java.security.GeneralSecurityException -> L26
            byte[] r2 = r3.associatedData     // Catch: java.security.GeneralSecurityException -> L26
            r0.init(r1, r2)     // Catch: java.security.GeneralSecurityException -> L26
            r0 = 1
            r3.headerRead = r0     // Catch: java.security.GeneralSecurityException -> L26
            return r0
        L26:
            r0 = move-exception
            r3.setUndefinedState()
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L30:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Ciphertext is too short"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.ReadableByteChannel r0 = r1.ciphertextChannel     // Catch: java.lang.Throwable -> L8
            r0.close()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // java.nio.channels.Channel
    public synchronized boolean isOpen() {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.ReadableByteChannel r0 = r1.ciphertextChannel     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // java.nio.channels.ReadableByteChannel
    public synchronized int read(java.nio.ByteBuffer r8) throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.definedState     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L8b
            boolean r0 = r7.headerRead     // Catch: java.lang.Throwable -> L93
            r1 = 1
            if (r0 != 0) goto L20
            boolean r0 = r7.tryReadHeader()     // Catch: java.lang.Throwable -> L93
            if (r0 != 0) goto L13
            monitor-exit(r7)
            r0 = 0
            return r0
        L13:
            java.nio.ByteBuffer r0 = r7.ciphertextSegment     // Catch: java.lang.Throwable -> L93
            r0.clear()     // Catch: java.lang.Throwable -> L93
            java.nio.ByteBuffer r0 = r7.ciphertextSegment     // Catch: java.lang.Throwable -> L93
            int r2 = r7.firstCiphertextSegmentSize     // Catch: java.lang.Throwable -> L93
            int r2 = r2 + r1
            r0.limit(r2)     // Catch: java.lang.Throwable -> L93
        L20:
            boolean r0 = r7.endOfPlaintext     // Catch: java.lang.Throwable -> L93
            r2 = -1
            if (r0 == 0) goto L27
            monitor-exit(r7)
            return r2
        L27:
            int r0 = r8.position()     // Catch: java.lang.Throwable -> L93
        L2b:
            int r3 = r8.remaining()     // Catch: java.lang.Throwable -> L93
            if (r3 <= 0) goto L7c
            java.nio.ByteBuffer r3 = r7.plaintextSegment     // Catch: java.lang.Throwable -> L93
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L93
            if (r3 != 0) goto L47
            boolean r3 = r7.endOfCiphertext     // Catch: java.lang.Throwable -> L93
            if (r3 == 0) goto L40
            r7.endOfPlaintext = r1     // Catch: java.lang.Throwable -> L93
            goto L7c
        L40:
            boolean r3 = r7.tryLoadSegment()     // Catch: java.lang.Throwable -> L93
            if (r3 != 0) goto L47
            goto L7c
        L47:
            java.nio.ByteBuffer r3 = r7.plaintextSegment     // Catch: java.lang.Throwable -> L93
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L93
            int r4 = r8.remaining()     // Catch: java.lang.Throwable -> L93
            if (r3 > r4) goto L59
            java.nio.ByteBuffer r3 = r7.plaintextSegment     // Catch: java.lang.Throwable -> L93
            r8.put(r3)     // Catch: java.lang.Throwable -> L93
            goto L2b
        L59:
            int r3 = r8.remaining()     // Catch: java.lang.Throwable -> L93
            java.nio.ByteBuffer r4 = r7.plaintextSegment     // Catch: java.lang.Throwable -> L93
            java.nio.ByteBuffer r4 = r4.duplicate()     // Catch: java.lang.Throwable -> L93
            int r5 = r4.position()     // Catch: java.lang.Throwable -> L93
            int r5 = r5 + r3
            r4.limit(r5)     // Catch: java.lang.Throwable -> L93
            r8.put(r4)     // Catch: java.lang.Throwable -> L93
            java.nio.ByteBuffer r5 = r7.plaintextSegment     // Catch: java.lang.Throwable -> L93
            java.nio.ByteBuffer r6 = r7.plaintextSegment     // Catch: java.lang.Throwable -> L93
            int r6 = r6.position()     // Catch: java.lang.Throwable -> L93
            int r6 = r6 + r3
            r5.position(r6)     // Catch: java.lang.Throwable -> L93
            goto L2b
        L7c:
            int r1 = r8.position()     // Catch: java.lang.Throwable -> L93
            int r1 = r1 - r0
            if (r1 != 0) goto L89
            boolean r3 = r7.endOfPlaintext     // Catch: java.lang.Throwable -> L93
            if (r3 == 0) goto L89
            monitor-exit(r7)
            return r2
        L89:
            monitor-exit(r7)
            return r1
        L8b:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "This StreamingAeadDecryptingChannel is in an undefined state"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L93
            throw r0     // Catch: java.lang.Throwable -> L93
        L93:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L93
            throw r8
    }

    public synchronized java.lang.String toString() {
            r3 = this;
            monitor-enter(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r0.<init>()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = "StreamingAeadDecryptingChannel"
            java.lang.StringBuilder r1 = r0.append(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = "\nsegmentNr:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            int r2 = r3.segmentNr     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = "\nciphertextSegmentSize:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            int r2 = r3.ciphertextSegmentSize     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = "\nheaderRead:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            boolean r2 = r3.headerRead     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = "\nendOfCiphertext:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            boolean r2 = r3.endOfCiphertext     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = "\nendOfPlaintext:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            boolean r2 = r3.endOfPlaintext     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = "\ndefinedState:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            boolean r2 = r3.definedState     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = "\nHeader"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = " position:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.nio.ByteBuffer r2 = r3.header     // Catch: java.lang.Throwable -> Lcb
            int r2 = r2.position()     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = " limit:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.nio.ByteBuffer r2 = r3.header     // Catch: java.lang.Throwable -> Lcb
            int r2 = r2.position()     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = "\nciphertextSgement"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = " position:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.nio.ByteBuffer r2 = r3.ciphertextSegment     // Catch: java.lang.Throwable -> Lcb
            int r2 = r2.position()     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = " limit:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.nio.ByteBuffer r2 = r3.ciphertextSegment     // Catch: java.lang.Throwable -> Lcb
            int r2 = r2.limit()     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = "\nplaintextSegment"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = " position:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.nio.ByteBuffer r2 = r3.plaintextSegment     // Catch: java.lang.Throwable -> Lcb
            int r2 = r2.position()     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = " limit:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.nio.ByteBuffer r2 = r3.plaintextSegment     // Catch: java.lang.Throwable -> Lcb
            int r2 = r2.limit()     // Catch: java.lang.Throwable -> Lcb
            r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r3)
            return r1
        Lcb:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lcb
            throw r0
    }
}
