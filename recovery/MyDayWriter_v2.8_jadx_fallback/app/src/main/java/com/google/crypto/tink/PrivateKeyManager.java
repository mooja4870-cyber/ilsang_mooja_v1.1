package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public interface PrivateKeyManager<P> extends com.google.crypto.tink.KeyManager<P> {
    com.google.crypto.tink.proto.KeyData getPublicKeyData(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws java.security.GeneralSecurityException;
}
