package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface RsaSsaPssPrivateKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.ByteString getCrt();

    com.google.crypto.tink.shaded.protobuf.ByteString getD();

    com.google.crypto.tink.shaded.protobuf.ByteString getDp();

    com.google.crypto.tink.shaded.protobuf.ByteString getDq();

    com.google.crypto.tink.shaded.protobuf.ByteString getP();

    com.google.crypto.tink.proto.RsaSsaPssPublicKey getPublicKey();

    com.google.crypto.tink.shaded.protobuf.ByteString getQ();

    int getVersion();

    boolean hasPublicKey();
}
