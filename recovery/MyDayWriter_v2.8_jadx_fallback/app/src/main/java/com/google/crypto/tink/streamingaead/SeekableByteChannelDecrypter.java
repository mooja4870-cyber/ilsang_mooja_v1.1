package com.google.crypto.tink.streamingaead;

/* JADX INFO: loaded from: classes.dex */
final class SeekableByteChannelDecrypter implements java.nio.channels.SeekableByteChannel {
    byte[] associatedData;
    java.nio.channels.SeekableByteChannel attemptingChannel;
    long cachedPosition;
    java.nio.channels.SeekableByteChannel ciphertextChannel;
    java.nio.channels.SeekableByteChannel matchingChannel;
    java.util.Deque<com.google.crypto.tink.StreamingAead> remainingPrimitives;
    long startingPosition;

    public SeekableByteChannelDecrypter(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> r5, java.nio.channels.SeekableByteChannel r6, byte[] r7) throws java.io.IOException {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.attemptingChannel = r0
            r4.matchingChannel = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r4.remainingPrimitives = r0
            java.util.List r0 = r5.getRawPrimitives()
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            com.google.crypto.tink.PrimitiveSet$Entry r1 = (com.google.crypto.tink.PrimitiveSet.Entry) r1
            java.util.Deque<com.google.crypto.tink.StreamingAead> r2 = r4.remainingPrimitives
            java.lang.Object r3 = r1.getPrimitive()
            com.google.crypto.tink.StreamingAead r3 = (com.google.crypto.tink.StreamingAead) r3
            r2.add(r3)
            goto L17
        L2f:
            r4.ciphertextChannel = r6
            r0 = -1
            r4.cachedPosition = r0
            long r0 = r6.position()
            r4.startingPosition = r0
            java.lang.Object r0 = r7.clone()
            byte[] r0 = (byte[]) r0
            r4.associatedData = r0
            return
    }

    private synchronized java.nio.channels.SeekableByteChannel nextAttemptingChannel() throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
        L2:
            java.util.Deque<com.google.crypto.tink.StreamingAead> r0 = r6.remainingPrimitives     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L32
            java.nio.channels.SeekableByteChannel r0 = r6.ciphertextChannel     // Catch: java.lang.Throwable -> L3a
            long r1 = r6.startingPosition     // Catch: java.lang.Throwable -> L3a
            r0.position(r1)     // Catch: java.lang.Throwable -> L3a
            java.util.Deque<com.google.crypto.tink.StreamingAead> r0 = r6.remainingPrimitives     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.lang.Throwable -> L3a
            com.google.crypto.tink.StreamingAead r0 = (com.google.crypto.tink.StreamingAead) r0     // Catch: java.lang.Throwable -> L3a
            java.nio.channels.SeekableByteChannel r1 = r6.ciphertextChannel     // Catch: java.security.GeneralSecurityException -> L30 java.lang.Throwable -> L3a
            byte[] r2 = r6.associatedData     // Catch: java.security.GeneralSecurityException -> L30 java.lang.Throwable -> L3a
            java.nio.channels.SeekableByteChannel r1 = r0.newSeekableDecryptingChannel(r1, r2)     // Catch: java.security.GeneralSecurityException -> L30 java.lang.Throwable -> L3a
            long r2 = r6.cachedPosition     // Catch: java.security.GeneralSecurityException -> L30 java.lang.Throwable -> L3a
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L2e
            long r2 = r6.cachedPosition     // Catch: java.security.GeneralSecurityException -> L30 java.lang.Throwable -> L3a
            r1.position(r2)     // Catch: java.security.GeneralSecurityException -> L30 java.lang.Throwable -> L3a
        L2e:
            monitor-exit(r6)
            return r1
        L30:
            r1 = move-exception
            goto L2
        L32:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = "No matching key found for the ciphertext in the stream."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3a
            throw r0     // Catch: java.lang.Throwable -> L3a
        L3a:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3a
            throw r0
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.SeekableByteChannel r0 = r1.ciphertextChannel     // Catch: java.lang.Throwable -> L8
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
            java.nio.channels.SeekableByteChannel r0 = r1.ciphertextChannel     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized long position() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.SeekableByteChannel r0 = r2.matchingChannel     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Ld
            java.nio.channels.SeekableByteChannel r0 = r2.matchingChannel     // Catch: java.lang.Throwable -> L11
            long r0 = r0.position()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r2)
            return r0
        Ld:
            long r0 = r2.cachedPosition     // Catch: java.lang.Throwable -> L11
            monitor-exit(r2)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized java.nio.channels.SeekableByteChannel position(long r4) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            java.nio.channels.SeekableByteChannel r0 = r3.matchingChannel     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto Lb
            java.nio.channels.SeekableByteChannel r0 = r3.matchingChannel     // Catch: java.lang.Throwable -> L28
            r0.position(r4)     // Catch: java.lang.Throwable -> L28
            goto L1e
        Lb:
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L20
            r3.cachedPosition = r4     // Catch: java.lang.Throwable -> L28
            java.nio.channels.SeekableByteChannel r0 = r3.attemptingChannel     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L1e
            java.nio.channels.SeekableByteChannel r0 = r3.attemptingChannel     // Catch: java.lang.Throwable -> L28
            long r1 = r3.cachedPosition     // Catch: java.lang.Throwable -> L28
            r0.position(r1)     // Catch: java.lang.Throwable -> L28
        L1e:
            monitor-exit(r3)
            return r3
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "Position must be non-negative"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L28
            throw r0     // Catch: java.lang.Throwable -> L28
        L28:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            throw r4
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public synchronized int read(java.nio.ByteBuffer r4) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            int r0 = r4.remaining()     // Catch: java.lang.Throwable -> L3b
            r1 = 0
            if (r0 != 0) goto La
            monitor-exit(r3)
            return r1
        La:
            java.nio.channels.SeekableByteChannel r0 = r3.matchingChannel     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L16
            java.nio.channels.SeekableByteChannel r0 = r3.matchingChannel     // Catch: java.lang.Throwable -> L3b
            int r0 = r0.read(r4)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)
            return r0
        L16:
            java.nio.channels.SeekableByteChannel r0 = r3.attemptingChannel     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L20
            java.nio.channels.SeekableByteChannel r0 = r3.nextAttemptingChannel()     // Catch: java.lang.Throwable -> L3b
            r3.attemptingChannel = r0     // Catch: java.lang.Throwable -> L3b
        L20:
            java.nio.channels.SeekableByteChannel r0 = r3.attemptingChannel     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L3b
            int r0 = r0.read(r4)     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L3b
            if (r0 != 0) goto L2a
            monitor-exit(r3)
            return r1
        L2a:
            java.nio.channels.SeekableByteChannel r2 = r3.attemptingChannel     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L3b
            r3.matchingChannel = r2     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L3b
            r2 = 0
            r3.attemptingChannel = r2     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L3b
            monitor-exit(r3)
            return r0
        L33:
            r0 = move-exception
            java.nio.channels.SeekableByteChannel r2 = r3.nextAttemptingChannel()     // Catch: java.lang.Throwable -> L3b
            r3.attemptingChannel = r2     // Catch: java.lang.Throwable -> L3b
            goto L20
        L3b:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            throw r4
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized long size() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.SeekableByteChannel r0 = r2.matchingChannel     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto Ld
            java.nio.channels.SeekableByteChannel r0 = r2.matchingChannel     // Catch: java.lang.Throwable -> L15
            long r0 = r0.size()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return r0
        Ld:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "Cannot determine size before first read()-call."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L15:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public java.nio.channels.SeekableByteChannel truncate(long r2) throws java.io.IOException {
            r1 = this;
            java.nio.channels.NonWritableChannelException r0 = new java.nio.channels.NonWritableChannelException
            r0.<init>()
            throw r0
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r2) throws java.io.IOException {
            r1 = this;
            java.nio.channels.NonWritableChannelException r0 = new java.nio.channels.NonWritableChannelException
            r0.<init>()
            throw r0
    }
}
