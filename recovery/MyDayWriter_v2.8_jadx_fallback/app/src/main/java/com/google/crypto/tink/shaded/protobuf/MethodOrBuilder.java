package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface MethodOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    java.lang.String getName();

    com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes();

    com.google.crypto.tink.shaded.protobuf.Option getOptions(int r1);

    int getOptionsCount();

    java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList();

    boolean getRequestStreaming();

    java.lang.String getRequestTypeUrl();

    com.google.crypto.tink.shaded.protobuf.ByteString getRequestTypeUrlBytes();

    boolean getResponseStreaming();

    java.lang.String getResponseTypeUrl();

    com.google.crypto.tink.shaded.protobuf.ByteString getResponseTypeUrlBytes();

    com.google.crypto.tink.shaded.protobuf.Syntax getSyntax();

    int getSyntaxValue();
}
