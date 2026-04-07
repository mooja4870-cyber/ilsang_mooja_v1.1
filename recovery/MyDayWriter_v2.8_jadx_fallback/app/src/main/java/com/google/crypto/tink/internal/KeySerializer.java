package com.google.crypto.tink.internal;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.internal.Serialization;

/* JADX INFO: loaded from: classes.dex */
public abstract class KeySerializer<KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> {
    private final java.lang.Class<KeyT> keyClass;
    private final java.lang.Class<SerializationT> serializationClass;


    public interface KeySerializationFunction<KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> {
        SerializationT serializeKey(KeyT r1, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r2) throws java.security.GeneralSecurityException;
    }

    private KeySerializer(java.lang.Class<KeyT> r1, java.lang.Class<SerializationT> r2) {
            r0 = this;
            r0.<init>()
            r0.keyClass = r1
            r0.serializationClass = r2
            return
    }

    /* synthetic */ KeySerializer(java.lang.Class r1, java.lang.Class r2, com.google.crypto.tink.internal.KeySerializer.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.KeySerializer<KeyT, SerializationT> create(com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction<KeyT, SerializationT> r1, java.lang.Class<KeyT> r2, java.lang.Class<SerializationT> r3) {
            com.google.crypto.tink.internal.KeySerializer$1 r0 = new com.google.crypto.tink.internal.KeySerializer$1
            r0.<init>(r2, r3, r1)
            return r0
    }

    public java.lang.Class<KeyT> getKeyClass() {
            r1 = this;
            java.lang.Class<KeyT extends com.google.crypto.tink.Key> r0 = r1.keyClass
            return r0
    }

    public java.lang.Class<SerializationT> getSerializationClass() {
            r1 = this;
            java.lang.Class<SerializationT extends com.google.crypto.tink.internal.Serialization> r0 = r1.serializationClass
            return r0
    }

    public abstract SerializationT serializeKey(KeyT r1, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r2) throws java.security.GeneralSecurityException;
}
