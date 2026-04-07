package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface AesCtrHmacAeadKeyFormatOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.AesCtrKeyFormat getAesCtrKeyFormat();

    com.google.crypto.tink.proto.HmacKeyFormat getHmacKeyFormat();

    boolean hasAesCtrKeyFormat();

    boolean hasHmacKeyFormat();
}
