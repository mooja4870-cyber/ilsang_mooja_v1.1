package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface EncryptedKeysetOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.ByteString getEncryptedKeyset();

    com.google.crypto.tink.proto.KeysetInfo getKeysetInfo();

    boolean hasKeysetInfo();
}
