package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class RewindableReadableByteChannel implements java.nio.channels.ReadableByteChannel {
    final java.nio.channels.ReadableByteChannel baseChannel;
    java.nio.ByteBuffer buffer;
    boolean canRewind;
    boolean directRead;

    public RewindableReadableByteChannel(java.nio.channels.ReadableByteChannel r2) {
            r1 = this;
            r1.<init>()
            r1.baseChannel = r2
            r0 = 0
            r1.buffer = r0
            r0 = 1
            r1.canRewind = r0
            r0 = 0
            r1.directRead = r0
            return
    }

    private synchronized void setBufferLimit(int r5) {
            r4 = this;
            monitor-enter(r4)
            java.nio.ByteBuffer r0 = r4.buffer     // Catch: java.lang.Throwable -> L35
            int r0 = r0.capacity()     // Catch: java.lang.Throwable -> L35
            if (r0 >= r5) goto L2e
            java.nio.ByteBuffer r0 = r4.buffer     // Catch: java.lang.Throwable -> L35
            int r0 = r0.position()     // Catch: java.lang.Throwable -> L35
            java.nio.ByteBuffer r1 = r4.buffer     // Catch: java.lang.Throwable -> L35
            int r1 = r1.capacity()     // Catch: java.lang.Throwable -> L35
            int r1 = r1 * 2
            int r1 = java.lang.Math.max(r1, r5)     // Catch: java.lang.Throwable -> L35
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)     // Catch: java.lang.Throwable -> L35
            java.nio.ByteBuffer r3 = r4.buffer     // Catch: java.lang.Throwable -> L35
            r3.rewind()     // Catch: java.lang.Throwable -> L35
            java.nio.ByteBuffer r3 = r4.buffer     // Catch: java.lang.Throwable -> L35
            r2.put(r3)     // Catch: java.lang.Throwable -> L35
            r2.position(r0)     // Catch: java.lang.Throwable -> L35
            r4.buffer = r2     // Catch: java.lang.Throwable -> L35
        L2e:
            java.nio.ByteBuffer r0 = r4.buffer     // Catch: java.lang.Throwable -> L35
            r0.limit(r5)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)
            return
        L35:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            throw r5
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.canRewind = r0     // Catch: java.lang.Throwable -> Le
            r0 = 1
            r1.directRead = r0     // Catch: java.lang.Throwable -> Le
            java.nio.channels.ReadableByteChannel r0 = r1.baseChannel     // Catch: java.lang.Throwable -> Le
            r0.close()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Le:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    public synchronized void disableRewinding() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.canRewind = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    @Override // java.nio.channels.Channel
    public synchronized boolean isOpen() {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.ReadableByteChannel r0 = r1.baseChannel     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // java.nio.channels.ReadableByteChannel
    public synchronized int read(java.nio.ByteBuffer r11) throws java.io.IOException {
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.directRead     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto Ld
            java.nio.channels.ReadableByteChannel r0 = r10.baseChannel     // Catch: java.lang.Throwable -> Ld1
            int r0 = r0.read(r11)     // Catch: java.lang.Throwable -> Ld1
            monitor-exit(r10)
            return r0
        Ld:
            int r0 = r11.remaining()     // Catch: java.lang.Throwable -> Ld1
            if (r0 != 0) goto L16
            monitor-exit(r10)
            r1 = 0
            return r1
        L16:
            java.nio.ByteBuffer r1 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            r2 = 1
            if (r1 != 0) goto L45
            boolean r1 = r10.canRewind     // Catch: java.lang.Throwable -> Ld1
            if (r1 != 0) goto L29
            r10.directRead = r2     // Catch: java.lang.Throwable -> Ld1
            java.nio.channels.ReadableByteChannel r1 = r10.baseChannel     // Catch: java.lang.Throwable -> Ld1
            int r1 = r1.read(r11)     // Catch: java.lang.Throwable -> Ld1
            monitor-exit(r10)
            return r1
        L29:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)     // Catch: java.lang.Throwable -> Ld1
            r10.buffer = r1     // Catch: java.lang.Throwable -> Ld1
            java.nio.channels.ReadableByteChannel r1 = r10.baseChannel     // Catch: java.lang.Throwable -> Ld1
            java.nio.ByteBuffer r2 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            int r1 = r1.read(r2)     // Catch: java.lang.Throwable -> Ld1
            java.nio.ByteBuffer r2 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            r2.flip()     // Catch: java.lang.Throwable -> Ld1
            if (r1 <= 0) goto L43
            java.nio.ByteBuffer r2 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            r11.put(r2)     // Catch: java.lang.Throwable -> Ld1
        L43:
            monitor-exit(r10)
            return r1
        L45:
            java.nio.ByteBuffer r1 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> Ld1
            r3 = 0
            if (r1 < r0) goto L7c
            java.nio.ByteBuffer r1 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            int r1 = r1.limit()     // Catch: java.lang.Throwable -> Ld1
            java.nio.ByteBuffer r4 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            java.nio.ByteBuffer r5 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            int r5 = r5.position()     // Catch: java.lang.Throwable -> Ld1
            int r5 = r5 + r0
            r4.limit(r5)     // Catch: java.lang.Throwable -> Ld1
            java.nio.ByteBuffer r4 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            r11.put(r4)     // Catch: java.lang.Throwable -> Ld1
            java.nio.ByteBuffer r4 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            r4.limit(r1)     // Catch: java.lang.Throwable -> Ld1
            boolean r4 = r10.canRewind     // Catch: java.lang.Throwable -> Ld1
            if (r4 != 0) goto L7a
            java.nio.ByteBuffer r4 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            boolean r4 = r4.hasRemaining()     // Catch: java.lang.Throwable -> Ld1
            if (r4 != 0) goto L7a
            r10.buffer = r3     // Catch: java.lang.Throwable -> Ld1
            r10.directRead = r2     // Catch: java.lang.Throwable -> Ld1
        L7a:
            monitor-exit(r10)
            return r0
        L7c:
            java.nio.ByteBuffer r1 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> Ld1
            int r4 = r0 - r1
            java.nio.ByteBuffer r5 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            int r5 = r5.position()     // Catch: java.lang.Throwable -> Ld1
            java.nio.ByteBuffer r6 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            int r6 = r6.limit()     // Catch: java.lang.Throwable -> Ld1
            int r7 = r6 + r4
            r10.setBufferLimit(r7)     // Catch: java.lang.Throwable -> Ld1
            java.nio.ByteBuffer r7 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            r7.position(r6)     // Catch: java.lang.Throwable -> Ld1
            java.nio.channels.ReadableByteChannel r7 = r10.baseChannel     // Catch: java.lang.Throwable -> Ld1
            java.nio.ByteBuffer r8 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            int r7 = r7.read(r8)     // Catch: java.lang.Throwable -> Ld1
            java.nio.ByteBuffer r8 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            r8.flip()     // Catch: java.lang.Throwable -> Ld1
            java.nio.ByteBuffer r8 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            r8.position(r5)     // Catch: java.lang.Throwable -> Ld1
            java.nio.ByteBuffer r8 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            r11.put(r8)     // Catch: java.lang.Throwable -> Ld1
            if (r1 != 0) goto Lb8
            if (r7 >= 0) goto Lb8
            monitor-exit(r10)
            r2 = -1
            return r2
        Lb8:
            java.nio.ByteBuffer r8 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            int r8 = r8.position()     // Catch: java.lang.Throwable -> Ld1
            int r8 = r8 - r5
            boolean r9 = r10.canRewind     // Catch: java.lang.Throwable -> Ld1
            if (r9 != 0) goto Lcf
            java.nio.ByteBuffer r9 = r10.buffer     // Catch: java.lang.Throwable -> Ld1
            boolean r9 = r9.hasRemaining()     // Catch: java.lang.Throwable -> Ld1
            if (r9 != 0) goto Lcf
            r10.buffer = r3     // Catch: java.lang.Throwable -> Ld1
            r10.directRead = r2     // Catch: java.lang.Throwable -> Ld1
        Lcf:
            monitor-exit(r10)
            return r8
        Ld1:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Ld1
            throw r11
    }

    public synchronized void rewind() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.canRewind     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r0 = r2.buffer     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto Lf
            java.nio.ByteBuffer r0 = r2.buffer     // Catch: java.lang.Throwable -> L19
            r1 = 0
            r0.position(r1)     // Catch: java.lang.Throwable -> L19
        Lf:
            monitor-exit(r2)
            return
        L11:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "Cannot rewind anymore."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L19
            throw r0     // Catch: java.lang.Throwable -> L19
        L19:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r0
    }
}
