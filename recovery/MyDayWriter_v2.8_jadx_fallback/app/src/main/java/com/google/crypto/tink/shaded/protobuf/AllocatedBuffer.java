package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
abstract class AllocatedBuffer {



    AllocatedBuffer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.AllocatedBuffer wrap(java.nio.ByteBuffer r1) {
            java.lang.String r0 = "buffer"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r1, r0)
            com.google.crypto.tink.shaded.protobuf.AllocatedBuffer$1 r0 = new com.google.crypto.tink.shaded.protobuf.AllocatedBuffer$1
            r0.<init>(r1)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.AllocatedBuffer wrap(byte[] r2) {
            r0 = 0
            int r1 = r2.length
            com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = wrapNoCheck(r2, r0, r1)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.AllocatedBuffer wrap(byte[] r4, int r5, int r6) {
            if (r5 < 0) goto Le
            if (r6 < 0) goto Le
            int r0 = r5 + r6
            int r1 = r4.length
            if (r0 > r1) goto Le
            com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = wrapNoCheck(r4, r5, r6)
            return r0
        Le:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            int r1 = r4.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "bytes.length=%d, offset=%d, length=%d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    private static com.google.crypto.tink.shaded.protobuf.AllocatedBuffer wrapNoCheck(byte[] r1, int r2, int r3) {
            com.google.crypto.tink.shaded.protobuf.AllocatedBuffer$2 r0 = new com.google.crypto.tink.shaded.protobuf.AllocatedBuffer$2
            r0.<init>(r1, r2, r3)
            return r0
    }

    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract java.nio.ByteBuffer nioBuffer();

    public abstract int position();

    public abstract com.google.crypto.tink.shaded.protobuf.AllocatedBuffer position(int r1);

    public abstract int remaining();
}
