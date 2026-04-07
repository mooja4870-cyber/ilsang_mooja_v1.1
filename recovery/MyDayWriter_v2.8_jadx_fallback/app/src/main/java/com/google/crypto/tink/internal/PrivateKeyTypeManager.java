package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.MessageLite;

/* JADX INFO: loaded from: classes.dex */
public abstract class PrivateKeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> extends com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT> {
    private final java.lang.Class<PublicKeyProtoT> publicKeyClazz;

    @java.lang.SafeVarargs
    protected PrivateKeyTypeManager(java.lang.Class<KeyProtoT> r1, java.lang.Class<PublicKeyProtoT> r2, com.google.crypto.tink.internal.PrimitiveFactory<?, KeyProtoT>... r3) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.publicKeyClazz = r2
            return
    }

    public abstract PublicKeyProtoT getPublicKey(KeyProtoT r1) throws java.security.GeneralSecurityException;

    public final java.lang.Class<PublicKeyProtoT> getPublicKeyClass() {
            r1 = this;
            java.lang.Class<PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r1.publicKeyClazz
            return r0
    }
}
