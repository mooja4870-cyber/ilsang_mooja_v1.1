package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface HmacKeyFormatOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    int getKeySize();

    com.google.crypto.tink.proto.HmacParams getParams();

    int getVersion();

    boolean hasParams();
}
