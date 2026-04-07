package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.Serialization;

/* JADX INFO: loaded from: classes.dex */
public abstract class ParametersParser<SerializationT extends com.google.crypto.tink.internal.Serialization> {
    private final com.google.crypto.tink.util.Bytes objectIdentifier;
    private final java.lang.Class<SerializationT> serializationClass;


    public interface ParametersParsingFunction<SerializationT extends com.google.crypto.tink.internal.Serialization> {
        com.google.crypto.tink.Parameters parseParameters(SerializationT r1) throws java.security.GeneralSecurityException;
    }

    private ParametersParser(com.google.crypto.tink.util.Bytes r1, java.lang.Class<SerializationT> r2) {
            r0 = this;
            r0.<init>()
            r0.objectIdentifier = r1
            r0.serializationClass = r2
            return
    }

    /* synthetic */ ParametersParser(com.google.crypto.tink.util.Bytes r1, java.lang.Class r2, com.google.crypto.tink.internal.ParametersParser.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.ParametersParser<SerializationT> create(com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction<SerializationT> r1, com.google.crypto.tink.util.Bytes r2, java.lang.Class<SerializationT> r3) {
            com.google.crypto.tink.internal.ParametersParser$1 r0 = new com.google.crypto.tink.internal.ParametersParser$1
            r0.<init>(r2, r3, r1)
            return r0
    }

    public final com.google.crypto.tink.util.Bytes getObjectIdentifier() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.objectIdentifier
            return r0
    }

    public final java.lang.Class<SerializationT> getSerializationClass() {
            r1 = this;
            java.lang.Class<SerializationT extends com.google.crypto.tink.internal.Serialization> r0 = r1.serializationClass
            return r0
    }

    public abstract com.google.crypto.tink.Parameters parseParameters(SerializationT r1) throws java.security.GeneralSecurityException;
}
