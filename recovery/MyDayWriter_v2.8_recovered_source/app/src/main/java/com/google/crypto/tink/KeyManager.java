package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public interface KeyManager<P> {
    boolean doesSupport(java.lang.String r1);

    java.lang.String getKeyType();

    P getPrimitive(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws java.security.GeneralSecurityException;

    P getPrimitive(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException;

    java.lang.Class<P> getPrimitiveClass();

    int getVersion();

    com.google.crypto.tink.shaded.protobuf.MessageLite newKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws java.security.GeneralSecurityException;

    com.google.crypto.tink.shaded.protobuf.MessageLite newKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException;

    com.google.crypto.tink.proto.KeyData newKeyData(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws java.security.GeneralSecurityException;
}
