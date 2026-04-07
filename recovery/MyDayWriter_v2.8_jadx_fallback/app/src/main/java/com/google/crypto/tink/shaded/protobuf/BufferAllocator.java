package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
abstract class BufferAllocator {
    private static final com.google.crypto.tink.shaded.protobuf.BufferAllocator UNPOOLED = null;


    static {
            com.google.crypto.tink.shaded.protobuf.BufferAllocator$1 r0 = new com.google.crypto.tink.shaded.protobuf.BufferAllocator$1
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.BufferAllocator.UNPOOLED = r0
            return
    }

    BufferAllocator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.BufferAllocator unpooled() {
            com.google.crypto.tink.shaded.protobuf.BufferAllocator r0 = com.google.crypto.tink.shaded.protobuf.BufferAllocator.UNPOOLED
            return r0
    }

    public abstract com.google.crypto.tink.shaded.protobuf.AllocatedBuffer allocateDirectBuffer(int r1);

    public abstract com.google.crypto.tink.shaded.protobuf.AllocatedBuffer allocateHeapBuffer(int r1);
}
