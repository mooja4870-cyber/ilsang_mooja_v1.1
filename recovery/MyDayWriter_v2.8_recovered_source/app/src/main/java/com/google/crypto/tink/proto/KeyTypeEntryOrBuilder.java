package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public interface KeyTypeEntryOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    java.lang.String getCatalogueName();

    com.google.crypto.tink.shaded.protobuf.ByteString getCatalogueNameBytes();

    int getKeyManagerVersion();

    boolean getNewKeyAllowed();

    java.lang.String getPrimitiveName();

    com.google.crypto.tink.shaded.protobuf.ByteString getPrimitiveNameBytes();

    java.lang.String getTypeUrl();

    com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes();
}
