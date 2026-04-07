package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface KeysetInfoOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.KeysetInfo.KeyInfo getKeyInfo(int r1);

    int getKeyInfoCount();

    java.util.List<com.google.crypto.tink.proto.KeysetInfo.KeyInfo> getKeyInfoList();

    int getPrimaryKeyId();
}
