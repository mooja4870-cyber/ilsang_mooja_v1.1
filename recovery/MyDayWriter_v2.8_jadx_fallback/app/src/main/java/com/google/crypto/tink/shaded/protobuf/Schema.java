package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
interface Schema<T> {
    boolean equals(T r1, T r2);

    int getSerializedSize(T r1);

    int hashCode(T r1);

    boolean isInitialized(T r1);

    void makeImmutable(T r1);

    void mergeFrom(T r1, com.google.crypto.tink.shaded.protobuf.Reader r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException;

    void mergeFrom(T r1, T r2);

    void mergeFrom(T r1, byte[] r2, int r3, int r4, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r5) throws java.io.IOException;

    T newInstance();

    void writeTo(T r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException;
}
