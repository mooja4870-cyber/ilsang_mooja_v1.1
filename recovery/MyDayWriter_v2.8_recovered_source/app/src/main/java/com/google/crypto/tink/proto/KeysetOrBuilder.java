package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface KeysetOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.Keyset.Key getKey(int r1);

    int getKeyCount();

    java.util.List<com.google.crypto.tink.proto.Keyset.Key> getKeyList();

    int getPrimaryKeyId();
}
