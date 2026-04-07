package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface AesCtrHmacAeadKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.AesCtrKey getAesCtrKey();

    com.google.crypto.tink.proto.HmacKey getHmacKey();

    int getVersion();

    boolean hasAesCtrKey();

    boolean hasHmacKey();
}
