package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.MessageLite;

/* JADX INFO: loaded from: classes.dex */
public abstract class PrimitiveFactory<PrimitiveT, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> {
    private final java.lang.Class<PrimitiveT> clazz;

    public PrimitiveFactory(java.lang.Class<PrimitiveT> r1) {
            r0 = this;
            r0.<init>()
            r0.clazz = r1
            return
    }

    public abstract PrimitiveT getPrimitive(KeyProtoT r1) throws java.security.GeneralSecurityException;

    final java.lang.Class<PrimitiveT> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<PrimitiveT> r0 = r1.clazz
            return r0
    }
}
