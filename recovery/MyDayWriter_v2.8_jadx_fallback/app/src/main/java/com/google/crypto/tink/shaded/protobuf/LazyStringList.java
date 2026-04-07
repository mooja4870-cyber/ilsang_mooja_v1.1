package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface LazyStringList extends com.google.crypto.tink.shaded.protobuf.ProtocolStringList {
    void add(com.google.crypto.tink.shaded.protobuf.ByteString r1);

    void add(byte[] r1);

    boolean addAllByteArray(java.util.Collection<byte[]> r1);

    boolean addAllByteString(java.util.Collection<? extends com.google.crypto.tink.shaded.protobuf.ByteString> r1);

    java.util.List<byte[]> asByteArrayList();

    byte[] getByteArray(int r1);

    com.google.crypto.tink.shaded.protobuf.ByteString getByteString(int r1);

    java.lang.Object getRaw(int r1);

    java.util.List<?> getUnderlyingElements();

    com.google.crypto.tink.shaded.protobuf.LazyStringList getUnmodifiableView();

    void mergeFrom(com.google.crypto.tink.shaded.protobuf.LazyStringList r1);

    void set(int r1, com.google.crypto.tink.shaded.protobuf.ByteString r2);

    void set(int r1, byte[] r2);
}
