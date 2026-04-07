package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class ByteBufferWriter {
    private static final java.lang.ThreadLocal<java.lang.ref.SoftReference<byte[]>> BUFFER = null;
    private static final float BUFFER_REALLOCATION_THRESHOLD = 0.5f;
    private static final long CHANNEL_FIELD_OFFSET = 0;
    private static final java.lang.Class<?> FILE_OUTPUT_STREAM_CLASS = null;
    private static final int MAX_CACHED_BUFFER_SIZE = 16384;
    private static final int MIN_CACHED_BUFFER_SIZE = 1024;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.ByteBufferWriter.BUFFER = r0
            java.lang.String r0 = "java.io.FileOutputStream"
            java.lang.Class r0 = safeGetClass(r0)
            com.google.crypto.tink.shaded.protobuf.ByteBufferWriter.FILE_OUTPUT_STREAM_CLASS = r0
            java.lang.Class<?> r0 = com.google.crypto.tink.shaded.protobuf.ByteBufferWriter.FILE_OUTPUT_STREAM_CLASS
            long r0 = getChannelFieldOffset(r0)
            com.google.crypto.tink.shaded.protobuf.ByteBufferWriter.CHANNEL_FIELD_OFFSET = r0
            return
    }

    private ByteBufferWriter() {
            r0 = this;
            r0.<init>()
            return
    }

    static void clearCachedBuffer() {
            java.lang.ThreadLocal<java.lang.ref.SoftReference<byte[]>> r0 = com.google.crypto.tink.shaded.protobuf.ByteBufferWriter.BUFFER
            r1 = 0
            r0.set(r1)
            return
    }

    private static byte[] getBuffer() {
            java.lang.ThreadLocal<java.lang.ref.SoftReference<byte[]>> r0 = com.google.crypto.tink.shaded.protobuf.ByteBufferWriter.BUFFER
            java.lang.Object r0 = r0.get()
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0
            if (r0 != 0) goto Lc
            r1 = 0
            goto L12
        Lc:
            java.lang.Object r1 = r0.get()
            byte[] r1 = (byte[]) r1
        L12:
            return r1
    }

    private static long getChannelFieldOffset(java.lang.Class<?> r3) {
            if (r3 == 0) goto L15
            boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.hasUnsafeArrayOperations()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            java.lang.String r0 = "channel"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L13
            long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            r0 = move-exception
            goto L16
        L15:
        L16:
            r0 = -1
            return r0
    }

    private static byte[] getOrCreateBuffer(int r2) {
            r0 = 1024(0x400, float:1.435E-42)
            int r2 = java.lang.Math.max(r2, r0)
            byte[] r0 = getBuffer()
            if (r0 == 0) goto L13
            int r1 = r0.length
            boolean r1 = needToReallocate(r2, r1)
            if (r1 == 0) goto L1c
        L13:
            byte[] r0 = new byte[r2]
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r2 > r1) goto L1c
            setBuffer(r0)
        L1c:
            return r0
    }

    private static boolean needToReallocate(int r3, int r4) {
            if (r4 >= r3) goto Ld
            float r0 = (float) r4
            float r1 = (float) r3
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    private static java.lang.Class<?> safeGetClass(java.lang.String r2) {
            java.lang.Class r0 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L5
            return r0
        L5:
            r0 = move-exception
            r1 = 0
            return r1
    }

    private static void setBuffer(byte[] r2) {
            java.lang.ThreadLocal<java.lang.ref.SoftReference<byte[]>> r0 = com.google.crypto.tink.shaded.protobuf.ByteBufferWriter.BUFFER
            java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference
            r1.<init>(r2)
            r0.set(r1)
            return
    }

    static void write(java.nio.ByteBuffer r4, java.io.OutputStream r5) throws java.io.IOException {
            int r0 = r4.position()
            boolean r1 = r4.hasArray()     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L1f
            byte[] r1 = r4.array()     // Catch: java.lang.Throwable -> L49
            int r2 = r4.arrayOffset()     // Catch: java.lang.Throwable -> L49
            int r3 = r4.position()     // Catch: java.lang.Throwable -> L49
            int r2 = r2 + r3
            int r3 = r4.remaining()     // Catch: java.lang.Throwable -> L49
            r5.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L49
            goto L44
        L1f:
            boolean r1 = writeToChannel(r4, r5)     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L44
            int r1 = r4.remaining()     // Catch: java.lang.Throwable -> L49
            byte[] r1 = getOrCreateBuffer(r1)     // Catch: java.lang.Throwable -> L49
        L2d:
            boolean r2 = r4.hasRemaining()     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L44
            int r2 = r4.remaining()     // Catch: java.lang.Throwable -> L49
            int r3 = r1.length     // Catch: java.lang.Throwable -> L49
            int r2 = java.lang.Math.min(r2, r3)     // Catch: java.lang.Throwable -> L49
            r3 = 0
            r4.get(r1, r3, r2)     // Catch: java.lang.Throwable -> L49
            r5.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L49
            goto L2d
        L44:
            r4.position(r0)
            return
        L49:
            r1 = move-exception
            r4.position(r0)
            throw r1
    }

    private static boolean writeToChannel(java.nio.ByteBuffer r4, java.io.OutputStream r5) throws java.io.IOException {
            long r0 = com.google.crypto.tink.shaded.protobuf.ByteBufferWriter.CHANNEL_FIELD_OFFSET
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L23
            java.lang.Class<?> r0 = com.google.crypto.tink.shaded.protobuf.ByteBufferWriter.FILE_OUTPUT_STREAM_CLASS
            boolean r0 = r0.isInstance(r5)
            if (r0 == 0) goto L23
            r0 = 0
            long r1 = com.google.crypto.tink.shaded.protobuf.ByteBufferWriter.CHANNEL_FIELD_OFFSET     // Catch: java.lang.ClassCastException -> L1b
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r5, r1)     // Catch: java.lang.ClassCastException -> L1b
            java.nio.channels.WritableByteChannel r1 = (java.nio.channels.WritableByteChannel) r1     // Catch: java.lang.ClassCastException -> L1b
            r0 = r1
            goto L1c
        L1b:
            r1 = move-exception
        L1c:
            if (r0 == 0) goto L23
            r0.write(r4)
            r1 = 1
            return r1
        L23:
            r0 = 0
            return r0
    }
}
