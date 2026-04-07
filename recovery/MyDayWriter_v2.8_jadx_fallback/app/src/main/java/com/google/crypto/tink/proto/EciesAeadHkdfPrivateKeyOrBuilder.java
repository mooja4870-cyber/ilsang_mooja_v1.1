package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface EciesAeadHkdfPrivateKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.ByteString getKeyValue();

    com.google.crypto.tink.proto.EciesAeadHkdfPublicKey getPublicKey();

    int getVersion();

    boolean hasPublicKey();
}
