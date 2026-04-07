package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface RsaSsaPssPublicKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.ByteString getE();

    com.google.crypto.tink.shaded.protobuf.ByteString getN();

    com.google.crypto.tink.proto.RsaSsaPssParams getParams();

    int getVersion();

    boolean hasParams();
}
