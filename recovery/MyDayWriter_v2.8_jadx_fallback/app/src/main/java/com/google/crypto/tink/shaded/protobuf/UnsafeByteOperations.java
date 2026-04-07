package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class UnsafeByteOperations {
    private UnsafeByteOperations() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString unsafeWrap(java.nio.ByteBuffer r1) {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r1)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString unsafeWrap(byte[] r1) {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r1)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString unsafeWrap(byte[] r1, int r2, int r3) {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r1, r2, r3)
            return r0
    }

    public static void unsafeWriteTo(com.google.crypto.tink.shaded.protobuf.ByteString r0, com.google.crypto.tink.shaded.protobuf.ByteOutput r1) throws java.io.IOException {
            r0.writeTo(r1)
            return
    }
}
