package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface HkdfPrfKeyFormatOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    int getKeySize();

    com.google.crypto.tink.proto.HkdfPrfParams getParams();

    int getVersion();

    boolean hasParams();
}
