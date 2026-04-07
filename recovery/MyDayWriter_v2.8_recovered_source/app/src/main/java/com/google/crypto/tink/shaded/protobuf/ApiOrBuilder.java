package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface ApiOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.Method getMethods(int r1);

    int getMethodsCount();

    java.util.List<com.google.crypto.tink.shaded.protobuf.Method> getMethodsList();

    com.google.crypto.tink.shaded.protobuf.Mixin getMixins(int r1);

    int getMixinsCount();

    java.util.List<com.google.crypto.tink.shaded.protobuf.Mixin> getMixinsList();

    java.lang.String getName();

    com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes();

    com.google.crypto.tink.shaded.protobuf.Option getOptions(int r1);

    int getOptionsCount();

    java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList();

    com.google.crypto.tink.shaded.protobuf.SourceContext getSourceContext();

    com.google.crypto.tink.shaded.protobuf.Syntax getSyntax();

    int getSyntaxValue();

    java.lang.String getVersion();

    com.google.crypto.tink.shaded.protobuf.ByteString getVersionBytes();

    boolean hasSourceContext();
}
