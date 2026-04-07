package com.google.crypto.tink.internal;

import com.google.crypto.tink.Key;

/* JADX INFO: loaded from: classes.dex */
public abstract class PrimitiveConstructor<KeyT extends com.google.crypto.tink.Key, PrimitiveT> {
    private final java.lang.Class<KeyT> keyClass;
    private final java.lang.Class<PrimitiveT> primitiveClass;


    public interface PrimitiveConstructionFunction<KeyT extends com.google.crypto.tink.Key, PrimitiveT> {
        PrimitiveT constructPrimitive(KeyT r1) throws java.security.GeneralSecurityException;
    }

    private PrimitiveConstructor(java.lang.Class<KeyT> r1, java.lang.Class<PrimitiveT> r2) {
            r0 = this;
            r0.<init>()
            r0.keyClass = r1
            r0.primitiveClass = r2
            return
    }

    /* synthetic */ PrimitiveConstructor(java.lang.Class r1, java.lang.Class r2, com.google.crypto.tink.internal.PrimitiveConstructor.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <KeyT extends com.google.crypto.tink.Key, PrimitiveT> com.google.crypto.tink.internal.PrimitiveConstructor<KeyT, PrimitiveT> create(com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction<KeyT, PrimitiveT> r1, java.lang.Class<KeyT> r2, java.lang.Class<PrimitiveT> r3) {
            com.google.crypto.tink.internal.PrimitiveConstructor$1 r0 = new com.google.crypto.tink.internal.PrimitiveConstructor$1
            r0.<init>(r2, r3, r1)
            return r0
    }

    public abstract PrimitiveT constructPrimitive(KeyT r1) throws java.security.GeneralSecurityException;

    public java.lang.Class<KeyT> getKeyClass() {
            r1 = this;
            java.lang.Class<KeyT extends com.google.crypto.tink.Key> r0 = r1.keyClass
            return r0
    }

    public java.lang.Class<PrimitiveT> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<PrimitiveT> r0 = r1.primitiveClass
            return r0
    }
}
