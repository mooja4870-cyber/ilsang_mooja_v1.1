package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface EnumOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.EnumValue getEnumvalue(int r1);

    int getEnumvalueCount();

    java.util.List<com.google.crypto.tink.shaded.protobuf.EnumValue> getEnumvalueList();

    java.lang.String getName();

    com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes();

    com.google.crypto.tink.shaded.protobuf.Option getOptions(int r1);

    int getOptionsCount();

    java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList();

    com.google.crypto.tink.shaded.protobuf.SourceContext getSourceContext();

    com.google.crypto.tink.shaded.protobuf.Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
