package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface EcdsaPublicKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.EcdsaParams getParams();

    int getVersion();

    com.google.crypto.tink.shaded.protobuf.ByteString getX();

    com.google.crypto.tink.shaded.protobuf.ByteString getY();

    boolean hasParams();
}
