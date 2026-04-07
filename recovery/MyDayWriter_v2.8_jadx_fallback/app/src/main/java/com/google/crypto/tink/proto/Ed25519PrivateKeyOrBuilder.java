package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface Ed25519PrivateKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.ByteString getKeyValue();

    com.google.crypto.tink.proto.Ed25519PublicKey getPublicKey();

    int getVersion();

    boolean hasPublicKey();
}
