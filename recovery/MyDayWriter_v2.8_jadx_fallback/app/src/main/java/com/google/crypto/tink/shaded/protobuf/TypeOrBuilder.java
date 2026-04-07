package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface TypeOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.Field getFields(int r1);

    int getFieldsCount();

    java.util.List<com.google.crypto.tink.shaded.protobuf.Field> getFieldsList();

    java.lang.String getName();

    com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes();

    java.lang.String getOneofs(int r1);

    com.google.crypto.tink.shaded.protobuf.ByteString getOneofsBytes(int r1);

    int getOneofsCount();

    java.util.List<java.lang.String> getOneofsList();

    com.google.crypto.tink.shaded.protobuf.Option getOptions(int r1);

    int getOptionsCount();

    java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList();

    com.google.crypto.tink.shaded.protobuf.SourceContext getSourceContext();

    com.google.crypto.tink.shaded.protobuf.Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
