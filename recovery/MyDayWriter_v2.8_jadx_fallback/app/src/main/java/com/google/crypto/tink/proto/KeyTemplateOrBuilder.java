package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface KeyTemplateOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.OutputPrefixType getOutputPrefixType();

    int getOutputPrefixTypeValue();

    java.lang.String getTypeUrl();

    com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes();

    com.google.crypto.tink.shaded.protobuf.ByteString getValue();
}
