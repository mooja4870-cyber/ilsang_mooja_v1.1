package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public interface RegistryConfigOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    java.lang.String getConfigName();

    com.google.crypto.tink.shaded.protobuf.ByteString getConfigNameBytes();

    com.google.crypto.tink.proto.KeyTypeEntry getEntry(int r1);

    int getEntryCount();

    java.util.List<com.google.crypto.tink.proto.KeyTypeEntry> getEntryList();
}
