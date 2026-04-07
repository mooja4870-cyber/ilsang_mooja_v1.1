package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface EciesHkdfKemParamsOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.EllipticCurveType getCurveType();

    int getCurveTypeValue();

    com.google.crypto.tink.proto.HashType getHkdfHashType();

    int getHkdfHashTypeValue();

    com.google.crypto.tink.shaded.protobuf.ByteString getHkdfSalt();
}
