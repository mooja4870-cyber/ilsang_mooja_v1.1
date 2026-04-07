package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface JwtRsaSsaPssPublicKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm getAlgorithm();

    int getAlgorithmValue();

    com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.CustomKid getCustomKid();

    com.google.crypto.tink.shaded.protobuf.ByteString getE();

    com.google.crypto.tink.shaded.protobuf.ByteString getN();

    int getVersion();

    boolean hasCustomKid();
}
