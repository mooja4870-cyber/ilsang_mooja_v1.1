package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface AesGcmHkdfStreamingParamsOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    int getCiphertextSegmentSize();

    int getDerivedKeySize();

    com.google.crypto.tink.proto.HashType getHkdfHashType();

    int getHkdfHashTypeValue();
}
