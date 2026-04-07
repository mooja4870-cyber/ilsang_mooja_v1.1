package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface MessageLite extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {

    public interface Builder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder, java.lang.Cloneable {
        com.google.crypto.tink.shaded.protobuf.MessageLite build();

        com.google.crypto.tink.shaded.protobuf.MessageLite buildPartial();

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder clear();

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder clone();

        boolean mergeDelimitedFrom(java.io.InputStream r1) throws java.io.IOException;

        boolean mergeDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.MessageLite r1);

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream r1) throws java.io.IOException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
    }

    com.google.crypto.tink.shaded.protobuf.Parser<? extends com.google.crypto.tink.shaded.protobuf.MessageLite> getParserForType();

    int getSerializedSize();

    com.google.crypto.tink.shaded.protobuf.MessageLite.Builder newBuilderForType();

    com.google.crypto.tink.shaded.protobuf.MessageLite.Builder toBuilder();

    byte[] toByteArray();

    com.google.crypto.tink.shaded.protobuf.ByteString toByteString();

    void writeDelimitedTo(java.io.OutputStream r1) throws java.io.IOException;

    void writeTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1) throws java.io.IOException;

    void writeTo(java.io.OutputStream r1) throws java.io.IOException;
}
