package com.google.crypto.tink.internal;

import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.internal.Serialization;

/* JADX INFO: loaded from: classes.dex */
public abstract class ParametersSerializer<ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> {
    private final java.lang.Class<ParametersT> parametersClass;
    private final java.lang.Class<SerializationT> serializationClass;


    public interface ParametersSerializationFunction<ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> {
        SerializationT serializeParameters(ParametersT r1) throws java.security.GeneralSecurityException;
    }

    private ParametersSerializer(java.lang.Class<ParametersT> r1, java.lang.Class<SerializationT> r2) {
            r0 = this;
            r0.<init>()
            r0.parametersClass = r1
            r0.serializationClass = r2
            return
    }

    /* synthetic */ ParametersSerializer(java.lang.Class r1, java.lang.Class r2, com.google.crypto.tink.internal.ParametersSerializer.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.ParametersSerializer<ParametersT, SerializationT> create(com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction<ParametersT, SerializationT> r1, java.lang.Class<ParametersT> r2, java.lang.Class<SerializationT> r3) {
            com.google.crypto.tink.internal.ParametersSerializer$1 r0 = new com.google.crypto.tink.internal.ParametersSerializer$1
            r0.<init>(r2, r3, r1)
            return r0
    }

    public java.lang.Class<ParametersT> getParametersClass() {
            r1 = this;
            java.lang.Class<ParametersT extends com.google.crypto.tink.Parameters> r0 = r1.parametersClass
            return r0
    }

    public java.lang.Class<SerializationT> getSerializationClass() {
            r1 = this;
            java.lang.Class<SerializationT extends com.google.crypto.tink.internal.Serialization> r0 = r1.serializationClass
            return r0
    }

    public abstract SerializationT serializeParameters(ParametersT r1) throws java.security.GeneralSecurityException;
}
