package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface HpkePublicKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.HpkeParams getParams();

    com.google.crypto.tink.shaded.protobuf.ByteString getPublicKey();

    int getVersion();

    boolean hasParams();
}
