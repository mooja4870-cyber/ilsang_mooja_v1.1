package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface JwtRsaSsaPssKeyFormatOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm getAlgorithm();

    int getAlgorithmValue();

    int getModulusSizeInBits();

    com.google.crypto.tink.shaded.protobuf.ByteString getPublicExponent();

    int getVersion();
}
