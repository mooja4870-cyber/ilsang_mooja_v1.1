package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface JwtRsaSsaPkcs1KeyFormatOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm getAlgorithm();

    int getAlgorithmValue();

    int getModulusSizeInBits();

    com.google.crypto.tink.shaded.protobuf.ByteString getPublicExponent();

    int getVersion();
}
