package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface HkdfPrfParamsOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.HashType getHash();

    int getHashValue();

    com.google.crypto.tink.shaded.protobuf.ByteString getSalt();
}
