package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface ValueOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    boolean getBoolValue();

    com.google.crypto.tink.shaded.protobuf.Value.KindCase getKindCase();

    com.google.crypto.tink.shaded.protobuf.ListValue getListValue();

    com.google.crypto.tink.shaded.protobuf.NullValue getNullValue();

    int getNullValueValue();

    double getNumberValue();

    java.lang.String getStringValue();

    com.google.crypto.tink.shaded.protobuf.ByteString getStringValueBytes();

    com.google.crypto.tink.shaded.protobuf.Struct getStructValue();

    boolean hasBoolValue();

    boolean hasListValue();

    boolean hasNullValue();

    boolean hasNumberValue();

    boolean hasStringValue();

    boolean hasStructValue();
}
