package com.google.crypto.tink.streamingaead;

/* JADX INFO: loaded from: classes.dex */
final class ReadableByteChannelDecrypter implements java.nio.channels.ReadableByteChannel {
    byte[] associatedData;
    java.nio.channels.ReadableByteChannel attemptingChannel;
    com.google.crypto.tink.subtle.RewindableReadableByteChannel ciphertextChannel;
    java.nio.channels.ReadableByteChannel matchingChannel;
    java.util.Deque<com.google.crypto.tink.StreamingAead> remainingPrimitives;

    public ReadableByteChannelDecrypter(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> r5, java.nio.channels.ReadableByteChannel r6, byte[] r7) {
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
            com.google.crypto.tink.subtle.RewindableReadableByteChannel r0 = new com.google.crypto.tink.subtle.RewindableReadableByteChannel
            r0.<init>(r6)
            r4.ciphertextChannel = r0
            java.lang.Object r0 = r7.clone()
            byte[] r0 = (byte[]) r0
            r4.associatedData = r0
            return
    }

    private synchronized java.nio.channels.ReadableByteChannel nextAttemptingChannel() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
        L2:
            java.util.Deque<com.google.crypto.tink.StreamingAead> r0 = r3.remainingPrimitives     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L23
            java.util.Deque<com.google.crypto.tink.StreamingAead> r0 = r3.remainingPrimitives     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.lang.Throwable -> L2b
            com.google.crypto.tink.StreamingAead r0 = (com.google.crypto.tink.StreamingAead) r0     // Catch: java.lang.Throwable -> L2b
            com.google.crypto.tink.subtle.RewindableReadableByteChannel r1 = r3.ciphertextChannel     // Catch: java.security.GeneralSecurityException -> L1c java.lang.Throwable -> L2b
            byte[] r2 = r3.associatedData     // Catch: java.security.GeneralSecurityException -> L1c java.lang.Throwable -> L2b
            java.nio.channels.ReadableByteChannel r1 = r0.newDecryptingChannel(r1, r2)     // Catch: java.security.GeneralSecurityException -> L1c java.lang.Throwable -> L2b
            monitor-exit(r3)
            return r1
        L1c:
            r1 = move-exception
            com.google.crypto.tink.subtle.RewindableReadableByteChannel r2 = r3.ciphertextChannel     // Catch: java.lang.Throwable -> L2b
            r2.rewind()     // Catch: java.lang.Throwable -> L2b
            goto L2
        L23:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "No matching key found for the ciphertext in the stream."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2b
            throw r0     // Catch: java.lang.Throwable -> L2b
        L2b:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
            throw r0
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.subtle.RewindableReadableByteChannel r0 = r1.ciphertextChannel     // Catch: java.lang.Throwable -> L8
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
            com.google.crypto.tink.subtle.RewindableReadableByteChannel r0 = r1.ciphertextChannel     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // java.nio.channels.ReadableByteChannel
    public synchronized int read(java.nio.ByteBuffer r4) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            int r0 = r4.remaining()     // Catch: java.lang.Throwable -> L45
            r1 = 0
            if (r0 != 0) goto La
            monitor-exit(r3)
            return r1
        La:
            java.nio.channels.ReadableByteChannel r0 = r3.matchingChannel     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L16
            java.nio.channels.ReadableByteChannel r0 = r3.matchingChannel     // Catch: java.lang.Throwable -> L45
            int r0 = r0.read(r4)     // Catch: java.lang.Throwable -> L45
            monitor-exit(r3)
            return r0
        L16:
            java.nio.channels.ReadableByteChannel r0 = r3.attemptingChannel     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L20
            java.nio.channels.ReadableByteChannel r0 = r3.nextAttemptingChannel()     // Catch: java.lang.Throwable -> L45
            r3.attemptingChannel = r0     // Catch: java.lang.Throwable -> L45
        L20:
            java.nio.channels.ReadableByteChannel r0 = r3.attemptingChannel     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L45
            int r0 = r0.read(r4)     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L45
            if (r0 != 0) goto L2a
            monitor-exit(r3)
            return r1
        L2a:
            java.nio.channels.ReadableByteChannel r2 = r3.attemptingChannel     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L45
            r3.matchingChannel = r2     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L45
            r2 = 0
            r3.attemptingChannel = r2     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L45
            com.google.crypto.tink.subtle.RewindableReadableByteChannel r2 = r3.ciphertextChannel     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L45
            r2.disableRewinding()     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L45
            monitor-exit(r3)
            return r0
        L38:
            r0 = move-exception
            com.google.crypto.tink.subtle.RewindableReadableByteChannel r2 = r3.ciphertextChannel     // Catch: java.lang.Throwable -> L45
            r2.rewind()     // Catch: java.lang.Throwable -> L45
            java.nio.channels.ReadableByteChannel r2 = r3.nextAttemptingChannel()     // Catch: java.lang.Throwable -> L45
            r3.attemptingChannel = r2     // Catch: java.lang.Throwable -> L45
            goto L20
        L45:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L45
            throw r4
    }
}
