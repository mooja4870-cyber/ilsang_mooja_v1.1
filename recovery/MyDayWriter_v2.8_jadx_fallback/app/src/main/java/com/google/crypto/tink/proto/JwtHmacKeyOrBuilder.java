package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface JwtHmacKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.JwtHmacAlgorithm getAlgorithm();

    int getAlgorithmValue();

    com.google.crypto.tink.proto.JwtHmacKey.CustomKid getCustomKid();

    com.google.crypto.tink.shaded.protobuf.ByteString getKeyValue();

    int getVersion();

    boolean hasCustomKid();
}
