package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface AesCtrHmacStreamingKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.ByteString getKeyValue();

    com.google.crypto.tink.proto.AesCtrHmacStreamingParams getParams();

    int getVersion();

    boolean hasParams();
}
