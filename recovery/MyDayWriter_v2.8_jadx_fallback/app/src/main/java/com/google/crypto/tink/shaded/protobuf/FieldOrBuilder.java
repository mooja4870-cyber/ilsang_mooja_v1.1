package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface FieldOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.Field.Cardinality getCardinality();

    int getCardinalityValue();

    java.lang.String getDefaultValue();

    com.google.crypto.tink.shaded.protobuf.ByteString getDefaultValueBytes();

    java.lang.String getJsonName();

    com.google.crypto.tink.shaded.protobuf.ByteString getJsonNameBytes();

    com.google.crypto.tink.shaded.protobuf.Field.Kind getKind();

    int getKindValue();

    java.lang.String getName();

    com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes();

    int getNumber();

    int getOneofIndex();

    com.google.crypto.tink.shaded.protobuf.Option getOptions(int r1);

    int getOptionsCount();

    java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList();

    boolean getPacked();

    java.lang.String getTypeUrl();

    com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes();
}
