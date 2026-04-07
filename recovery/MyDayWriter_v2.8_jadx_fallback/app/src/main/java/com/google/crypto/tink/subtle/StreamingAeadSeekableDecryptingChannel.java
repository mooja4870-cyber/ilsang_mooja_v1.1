package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
class StreamingAeadSeekableDecryptingChannel implements java.nio.channels.SeekableByteChannel {
    private static final int PLAINTEXT_SEGMENT_EXTRA_SIZE = 16;
    private final byte[] aad;
    private final java.nio.channels.SeekableByteChannel ciphertextChannel;
    private final long ciphertextChannelSize;
    private final int ciphertextOffset;
    private final java.nio.ByteBuffer ciphertextSegment;
    private final int ciphertextSegmentSize;
    private int currentSegmentNr;
    private final com.google.crypto.tink.subtle.StreamSegmentDecrypter decrypter;
    private final int firstSegmentOffset;
    private final java.nio.ByteBuffer header;
    private boolean headerRead;
    private boolean isCurrentSegmentDecrypted;
    private boolean isopen;
    private final int lastCiphertextSegmentSize;
    private final int numberOfSegments;
    private long plaintextPosition;
    private final java.nio.ByteBuffer plaintextSegment;
    private final int plaintextSegmentSize;
    private long plaintextSize;

    public StreamingAeadSeekableDecryptingChannel(com.google.crypto.tink.subtle.NonceBasedStreamingAead r8, java.nio.channels.SeekableByteChannel r9, byte[] r10) throws java.io.IOException, java.security.GeneralSecurityException {
            r7 = this;
            r7.<init>()
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r0 = r8.newStreamSegmentDecrypter()
            r7.decrypter = r0
            r7.ciphertextChannel = r9
            int r0 = r8.getHeaderLength()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r7.header = r0
            int r0 = r8.getCiphertextSegmentSize()
            r7.ciphertextSegmentSize = r0
            int r0 = r7.ciphertextSegmentSize
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r7.ciphertextSegment = r0
            int r0 = r8.getPlaintextSegmentSize()
            r7.plaintextSegmentSize = r0
            int r0 = r7.plaintextSegmentSize
            int r0 = r0 + 16
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r7.plaintextSegment = r0
            r0 = 0
            r7.plaintextPosition = r0
            r0 = 0
            r7.headerRead = r0
            r1 = -1
            r7.currentSegmentNr = r1
            r7.isCurrentSegmentDecrypted = r0
            java.nio.channels.SeekableByteChannel r0 = r7.ciphertextChannel
            long r0 = r0.size()
            r7.ciphertextChannelSize = r0
            int r0 = r10.length
            byte[] r0 = java.util.Arrays.copyOf(r10, r0)
            r7.aad = r0
            java.nio.channels.SeekableByteChannel r0 = r7.ciphertextChannel
            boolean r0 = r0.isOpen()
            r7.isopen = r0
            long r0 = r7.ciphertextChannelSize
            int r2 = r7.ciphertextSegmentSize
            long r2 = (long) r2
            long r0 = r0 / r2
            int r0 = (int) r0
            long r1 = r7.ciphertextChannelSize
            int r3 = r7.ciphertextSegmentSize
            long r3 = (long) r3
            long r1 = r1 % r3
            int r1 = (int) r1
            int r2 = r8.getCiphertextOverhead()
            if (r1 <= 0) goto L7b
            int r3 = r0 + 1
            r7.numberOfSegments = r3
            if (r1 < r2) goto L73
            r7.lastCiphertextSegmentSize = r1
            goto L81
        L73:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Invalid ciphertext size"
            r3.<init>(r4)
            throw r3
        L7b:
            r7.numberOfSegments = r0
            int r3 = r7.ciphertextSegmentSize
            r7.lastCiphertextSegmentSize = r3
        L81:
            int r3 = r8.getCiphertextOffset()
            r7.ciphertextOffset = r3
            int r3 = r7.ciphertextOffset
            int r4 = r8.getHeaderLength()
            int r3 = r3 - r4
            r7.firstSegmentOffset = r3
            int r3 = r7.firstSegmentOffset
            if (r3 < 0) goto Lb1
            int r3 = r7.numberOfSegments
            long r3 = (long) r3
            long r5 = (long) r2
            long r3 = r3 * r5
            int r5 = r7.ciphertextOffset
            long r5 = (long) r5
            long r3 = r3 + r5
            long r5 = r7.ciphertextChannelSize
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 > 0) goto La9
            long r5 = r7.ciphertextChannelSize
            long r5 = r5 - r3
            r7.plaintextSize = r5
            return
        La9:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "Ciphertext is too short"
            r5.<init>(r6)
            throw r5
        Lb1:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Invalid ciphertext offset or header length"
            r3.<init>(r4)
            throw r3
    }

    private int getSegmentNr(long r5) {
            r4 = this;
            int r0 = r4.ciphertextOffset
            long r0 = (long) r0
            long r0 = r0 + r5
            int r2 = r4.plaintextSegmentSize
            long r2 = (long) r2
            long r0 = r0 / r2
            int r0 = (int) r0
            return r0
    }

    private boolean reachedEnd() {
            r3 = this;
            boolean r0 = r3.isCurrentSegmentDecrypted
            if (r0 == 0) goto L15
            int r0 = r3.currentSegmentNr
            int r1 = r3.numberOfSegments
            r2 = 1
            int r1 = r1 - r2
            if (r0 != r1) goto L15
            java.nio.ByteBuffer r0 = r3.plaintextSegment
            int r0 = r0.remaining()
            if (r0 != 0) goto L15
            goto L16
        L15:
            r2 = 0
        L16:
            return r2
    }

    private boolean tryLoadSegment(int r8) throws java.io.IOException {
            r7 = this;
            if (r8 < 0) goto L7f
            int r0 = r7.numberOfSegments
            if (r8 >= r0) goto L7f
            int r0 = r7.numberOfSegments
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            if (r8 != r0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = r2
        L10:
            int r3 = r7.currentSegmentNr
            if (r8 != r3) goto L19
            boolean r3 = r7.isCurrentSegmentDecrypted
            if (r3 == 0) goto L3f
            return r1
        L19:
            long r3 = (long) r8
            int r5 = r7.ciphertextSegmentSize
            long r5 = (long) r5
            long r3 = r3 * r5
            int r5 = r7.ciphertextSegmentSize
            if (r0 == 0) goto L24
            int r5 = r7.lastCiphertextSegmentSize
        L24:
            if (r8 != 0) goto L2c
            int r6 = r7.ciphertextOffset
            int r5 = r5 - r6
            int r6 = r7.ciphertextOffset
            long r3 = (long) r6
        L2c:
            java.nio.channels.SeekableByteChannel r6 = r7.ciphertextChannel
            r6.position(r3)
            java.nio.ByteBuffer r6 = r7.ciphertextSegment
            r6.clear()
            java.nio.ByteBuffer r6 = r7.ciphertextSegment
            r6.limit(r5)
            r7.currentSegmentNr = r8
            r7.isCurrentSegmentDecrypted = r2
        L3f:
            java.nio.ByteBuffer r3 = r7.ciphertextSegment
            int r3 = r3.remaining()
            if (r3 <= 0) goto L4e
            java.nio.channels.SeekableByteChannel r3 = r7.ciphertextChannel
            java.nio.ByteBuffer r4 = r7.ciphertextSegment
            r3.read(r4)
        L4e:
            java.nio.ByteBuffer r3 = r7.ciphertextSegment
            int r3 = r3.remaining()
            if (r3 <= 0) goto L57
            return r2
        L57:
            java.nio.ByteBuffer r2 = r7.ciphertextSegment
            r2.flip()
            java.nio.ByteBuffer r2 = r7.plaintextSegment
            r2.clear()
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r2 = r7.decrypter     // Catch: java.security.GeneralSecurityException -> L73
            java.nio.ByteBuffer r3 = r7.ciphertextSegment     // Catch: java.security.GeneralSecurityException -> L73
            java.nio.ByteBuffer r4 = r7.plaintextSegment     // Catch: java.security.GeneralSecurityException -> L73
            r2.decryptSegment(r3, r8, r0, r4)     // Catch: java.security.GeneralSecurityException -> L73
            java.nio.ByteBuffer r2 = r7.plaintextSegment
            r2.flip()
            r7.isCurrentSegmentDecrypted = r1
            return r1
        L73:
            r1 = move-exception
            r2 = -1
            r7.currentSegmentNr = r2
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Failed to decrypt"
            r2.<init>(r3, r1)
            throw r2
        L7f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Invalid position"
            r0.<init>(r1)
            throw r0
    }

    private boolean tryReadHeader() throws java.io.IOException {
            r3 = this;
            java.nio.channels.SeekableByteChannel r0 = r3.ciphertextChannel
            java.nio.ByteBuffer r1 = r3.header
            int r1 = r1.position()
            int r2 = r3.firstSegmentOffset
            int r1 = r1 + r2
            long r1 = (long) r1
            r0.position(r1)
            java.nio.channels.SeekableByteChannel r0 = r3.ciphertextChannel
            java.nio.ByteBuffer r1 = r3.header
            r0.read(r1)
            java.nio.ByteBuffer r0 = r3.header
            int r0 = r0.remaining()
            if (r0 <= 0) goto L20
            r0 = 0
            return r0
        L20:
            java.nio.ByteBuffer r0 = r3.header
            r0.flip()
            com.google.crypto.tink.subtle.StreamSegmentDecrypter r0 = r3.decrypter     // Catch: java.security.GeneralSecurityException -> L33
            java.nio.ByteBuffer r1 = r3.header     // Catch: java.security.GeneralSecurityException -> L33
            byte[] r2 = r3.aad     // Catch: java.security.GeneralSecurityException -> L33
            r0.init(r1, r2)     // Catch: java.security.GeneralSecurityException -> L33
            r0 = 1
            r3.headerRead = r0     // Catch: java.security.GeneralSecurityException -> L33
            return r0
        L33:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.SeekableByteChannel r0 = r1.ciphertextChannel     // Catch: java.lang.Throwable -> Lb
            r0.close()     // Catch: java.lang.Throwable -> Lb
            r0 = 0
            r1.isopen = r0     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    @Override // java.nio.channels.Channel
    public synchronized boolean isOpen() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isopen     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized long position() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.plaintextPosition     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized java.nio.channels.SeekableByteChannel position(long r1) {
            r0 = this;
            monitor-enter(r0)
            r0.plaintextPosition = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public synchronized int read(java.nio.ByteBuffer r10) throws java.io.IOException {
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.isopen     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L9e
            boolean r0 = r9.headerRead     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto L12
            boolean r0 = r9.tryReadHeader()     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto L12
            monitor-exit(r9)
            r0 = 0
            return r0
        L12:
            int r0 = r10.position()     // Catch: java.lang.Throwable -> La4
        L16:
            int r1 = r10.remaining()     // Catch: java.lang.Throwable -> La4
            if (r1 <= 0) goto L8c
            long r1 = r9.plaintextPosition     // Catch: java.lang.Throwable -> La4
            long r3 = r9.plaintextSize     // Catch: java.lang.Throwable -> La4
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L8c
            long r1 = r9.plaintextPosition     // Catch: java.lang.Throwable -> La4
            int r1 = r9.getSegmentNr(r1)     // Catch: java.lang.Throwable -> La4
            if (r1 != 0) goto L30
            long r2 = r9.plaintextPosition     // Catch: java.lang.Throwable -> La4
            int r2 = (int) r2     // Catch: java.lang.Throwable -> La4
            goto L3b
        L30:
            long r2 = r9.plaintextPosition     // Catch: java.lang.Throwable -> La4
            int r4 = r9.ciphertextOffset     // Catch: java.lang.Throwable -> La4
            long r4 = (long) r4     // Catch: java.lang.Throwable -> La4
            long r2 = r2 + r4
            int r4 = r9.plaintextSegmentSize     // Catch: java.lang.Throwable -> La4
            long r4 = (long) r4     // Catch: java.lang.Throwable -> La4
            long r2 = r2 % r4
            int r2 = (int) r2     // Catch: java.lang.Throwable -> La4
        L3b:
            boolean r3 = r9.tryLoadSegment(r1)     // Catch: java.lang.Throwable -> La4
            if (r3 == 0) goto L8c
            java.nio.ByteBuffer r3 = r9.plaintextSegment     // Catch: java.lang.Throwable -> La4
            r3.position(r2)     // Catch: java.lang.Throwable -> La4
            java.nio.ByteBuffer r3 = r9.plaintextSegment     // Catch: java.lang.Throwable -> La4
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> La4
            int r4 = r10.remaining()     // Catch: java.lang.Throwable -> La4
            if (r3 > r4) goto L64
            long r3 = r9.plaintextPosition     // Catch: java.lang.Throwable -> La4
            java.nio.ByteBuffer r5 = r9.plaintextSegment     // Catch: java.lang.Throwable -> La4
            int r5 = r5.remaining()     // Catch: java.lang.Throwable -> La4
            long r5 = (long) r5     // Catch: java.lang.Throwable -> La4
            long r3 = r3 + r5
            r9.plaintextPosition = r3     // Catch: java.lang.Throwable -> La4
            java.nio.ByteBuffer r3 = r9.plaintextSegment     // Catch: java.lang.Throwable -> La4
            r10.put(r3)     // Catch: java.lang.Throwable -> La4
            goto L8b
        L64:
            int r3 = r10.remaining()     // Catch: java.lang.Throwable -> La4
            java.nio.ByteBuffer r4 = r9.plaintextSegment     // Catch: java.lang.Throwable -> La4
            java.nio.ByteBuffer r4 = r4.duplicate()     // Catch: java.lang.Throwable -> La4
            int r5 = r4.position()     // Catch: java.lang.Throwable -> La4
            int r5 = r5 + r3
            r4.limit(r5)     // Catch: java.lang.Throwable -> La4
            r10.put(r4)     // Catch: java.lang.Throwable -> La4
            long r5 = r9.plaintextPosition     // Catch: java.lang.Throwable -> La4
            long r7 = (long) r3     // Catch: java.lang.Throwable -> La4
            long r5 = r5 + r7
            r9.plaintextPosition = r5     // Catch: java.lang.Throwable -> La4
            java.nio.ByteBuffer r5 = r9.plaintextSegment     // Catch: java.lang.Throwable -> La4
            java.nio.ByteBuffer r6 = r9.plaintextSegment     // Catch: java.lang.Throwable -> La4
            int r6 = r6.position()     // Catch: java.lang.Throwable -> La4
            int r6 = r6 + r3
            r5.position(r6)     // Catch: java.lang.Throwable -> La4
        L8b:
            goto L16
        L8c:
            int r1 = r10.position()     // Catch: java.lang.Throwable -> La4
            int r1 = r1 - r0
            if (r1 != 0) goto L9c
            boolean r2 = r9.reachedEnd()     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L9c
            monitor-exit(r9)
            r2 = -1
            return r2
        L9c:
            monitor-exit(r9)
            return r1
        L9e:
            java.nio.channels.ClosedChannelException r0 = new java.nio.channels.ClosedChannelException     // Catch: java.lang.Throwable -> La4
            r0.<init>()     // Catch: java.lang.Throwable -> La4
            throw r0     // Catch: java.lang.Throwable -> La4
        La4:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> La4
            throw r10
    }

    public synchronized int read(java.nio.ByteBuffer r4, long r5) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            long r0 = r3.position()     // Catch: java.lang.Throwable -> L16
            r3.position(r5)     // Catch: java.lang.Throwable -> L11
            int r2 = r3.read(r4)     // Catch: java.lang.Throwable -> L11
            r3.position(r0)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r3)
            return r2
        L11:
            r2 = move-exception
            r3.position(r0)     // Catch: java.lang.Throwable -> L16
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L16
            throw r4
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long size() {
            r2 = this;
            long r0 = r2.plaintextSize
            return r0
    }

    public synchronized java.lang.String toString() {
            r5 = this;
            monitor-enter(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10b
            r0.<init>()     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L10b
            r1.<init>()     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L10b
            java.lang.String r2 = "position:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L10b
            java.nio.channels.SeekableByteChannel r2 = r5.ciphertextChannel     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L10b
            long r2 = r2.position()     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L10b
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L10b
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L10b
            goto L24
        L20:
            r1 = move-exception
            java.lang.String r2 = "position: n/a"
            r1 = r2
        L24:
            java.lang.String r2 = "StreamingAeadSeekableDecryptingChannel"
            java.lang.StringBuilder r2 = r0.append(r2)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = "\nciphertextChannel"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r2 = r2.append(r1)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = "\nciphertextChannelSize:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            long r3 = r5.ciphertextChannelSize     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = "\nplaintextSize:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            long r3 = r5.plaintextSize     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = "\nciphertextSegmentSize:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            int r3 = r5.ciphertextSegmentSize     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = "\nnumberOfSegments:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            int r3 = r5.numberOfSegments     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = "\nheaderRead:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            boolean r3 = r5.headerRead     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = "\nplaintextPosition:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            long r3 = r5.plaintextPosition     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = "\nHeader"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = " position:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.nio.ByteBuffer r3 = r5.header     // Catch: java.lang.Throwable -> L10b
            int r3 = r3.position()     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = " limit:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.nio.ByteBuffer r3 = r5.header     // Catch: java.lang.Throwable -> L10b
            int r3 = r3.position()     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = "\ncurrentSegmentNr:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            int r3 = r5.currentSegmentNr     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = "\nciphertextSgement"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = " position:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.nio.ByteBuffer r3 = r5.ciphertextSegment     // Catch: java.lang.Throwable -> L10b
            int r3 = r3.position()     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = " limit:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.nio.ByteBuffer r3 = r5.ciphertextSegment     // Catch: java.lang.Throwable -> L10b
            int r3 = r3.limit()     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = "\nisCurrentSegmentDecrypted:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            boolean r3 = r5.isCurrentSegmentDecrypted     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = "\nplaintextSegment"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = " position:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.nio.ByteBuffer r3 = r5.plaintextSegment     // Catch: java.lang.Throwable -> L10b
            int r3 = r3.position()     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = " limit:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.nio.ByteBuffer r3 = r5.plaintextSegment     // Catch: java.lang.Throwable -> L10b
            int r3 = r3.limit()     // Catch: java.lang.Throwable -> L10b
            r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L10b
            monitor-exit(r5)
            return r2
        L10b:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L10b
            throw r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public java.nio.channels.SeekableByteChannel truncate(long r2) throws java.nio.channels.NonWritableChannelException {
            r1 = this;
            java.nio.channels.NonWritableChannelException r0 = new java.nio.channels.NonWritableChannelException
            r0.<init>()
            throw r0
    }

    public synchronized long verifiedSize() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.numberOfSegments     // Catch: java.lang.Throwable -> L17
            int r0 = r0 + (-1)
            boolean r0 = r2.tryLoadSegment(r0)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto Lf
            long r0 = r2.plaintextSize     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return r0
        Lf:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "could not verify the size"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            throw r0     // Catch: java.lang.Throwable -> L17
        L17:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r2) throws java.nio.channels.NonWritableChannelException {
            r1 = this;
            java.nio.channels.NonWritableChannelException r0 = new java.nio.channels.NonWritableChannelException
            r0.<init>()
            throw r0
    }
}
