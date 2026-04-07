package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface RsaSsaPssParamsOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.HashType getMgf1Hash();

    int getMgf1HashValue();

    int getSaltLength();

    com.google.crypto.tink.proto.HashType getSigHash();

    int getSigHashValue();
}
