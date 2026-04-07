package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes.dex */
public final class MutableSerializationRegistry {
    private static final com.google.crypto.tink.internal.MutableSerializationRegistry GLOBAL_INSTANCE = null;
    private final java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> registry;

    static {
            com.google.crypto.tink.internal.MutableSerializationRegistry r0 = new com.google.crypto.tink.internal.MutableSerializationRegistry
            r0.<init>()
            com.google.crypto.tink.internal.MutableSerializationRegistry.GLOBAL_INSTANCE = r0
            return
    }

    public MutableSerializationRegistry() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            com.google.crypto.tink.internal.SerializationRegistry$Builder r1 = new com.google.crypto.tink.internal.SerializationRegistry$Builder
            r1.<init>()
            com.google.crypto.tink.internal.SerializationRegistry r1 = r1.build()
            r0.<init>(r1)
            r2.registry = r0
            return
    }

    public static com.google.crypto.tink.internal.MutableSerializationRegistry globalInstance() {
            com.google.crypto.tink.internal.MutableSerializationRegistry r0 = com.google.crypto.tink.internal.MutableSerializationRegistry.GLOBAL_INSTANCE
            return r0
    }

    public <SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasParserForKey(SerializationT r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> r0 = r1.registry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.internal.SerializationRegistry r0 = (com.google.crypto.tink.internal.SerializationRegistry) r0
            boolean r0 = r0.hasParserForKey(r2)
            return r0
    }

    public <SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasParserForParameters(SerializationT r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> r0 = r1.registry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.internal.SerializationRegistry r0 = (com.google.crypto.tink.internal.SerializationRegistry) r0
            boolean r0 = r0.hasParserForParameters(r2)
            return r0
    }

    public <KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasSerializerForKey(KeyT r2, java.lang.Class<SerializationT> r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> r0 = r1.registry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.internal.SerializationRegistry r0 = (com.google.crypto.tink.internal.SerializationRegistry) r0
            boolean r0 = r0.hasSerializerForKey(r2, r3)
            return r0
    }

    public <ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasSerializerForParameters(ParametersT r2, java.lang.Class<SerializationT> r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> r0 = r1.registry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.internal.SerializationRegistry r0 = (com.google.crypto.tink.internal.SerializationRegistry) r0
            boolean r0 = r0.hasSerializerForParameters(r2, r3)
            return r0
    }

    public <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.Key parseKey(SerializationT r2, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r3) throws java.security.GeneralSecurityException {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> r0 = r1.registry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.internal.SerializationRegistry r0 = (com.google.crypto.tink.internal.SerializationRegistry) r0
            com.google.crypto.tink.Key r0 = r0.parseKey(r2, r3)
            return r0
    }

    public com.google.crypto.tink.Key parseKeyWithLegacyFallback(com.google.crypto.tink.internal.ProtoKeySerialization r4, com.google.crypto.tink.SecretKeyAccess r5) throws java.security.GeneralSecurityException {
            r3 = this;
            if (r5 == 0) goto L1c
            boolean r0 = r3.hasParserForKey(r4)
            if (r0 != 0) goto L17
            com.google.crypto.tink.internal.LegacyProtoKey r0 = new com.google.crypto.tink.internal.LegacyProtoKey     // Catch: java.security.GeneralSecurityException -> Le
            r0.<init>(r4, r5)     // Catch: java.security.GeneralSecurityException -> Le
            return r0
        Le:
            r0 = move-exception
            com.google.crypto.tink.internal.TinkBugException r1 = new com.google.crypto.tink.internal.TinkBugException
            java.lang.String r2 = "Creating a LegacyProtoKey failed"
            r1.<init>(r2, r0)
            throw r1
        L17:
            com.google.crypto.tink.Key r0 = r3.parseKey(r4, r5)
            return r0
        L1c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "access cannot be null"
            r0.<init>(r1)
            throw r0
    }

    public <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.Parameters parseParameters(SerializationT r2) throws java.security.GeneralSecurityException {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> r0 = r1.registry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.internal.SerializationRegistry r0 = (com.google.crypto.tink.internal.SerializationRegistry) r0
            com.google.crypto.tink.Parameters r0 = r0.parseParameters(r2)
            return r0
    }

    public com.google.crypto.tink.Parameters parseParametersWithLegacyFallback(com.google.crypto.tink.internal.ProtoParametersSerialization r3) {
            r2 = this;
            com.google.crypto.tink.Parameters r0 = r2.parseParameters(r3)     // Catch: java.security.GeneralSecurityException -> L5
            return r0
        L5:
            r0 = move-exception
            com.google.crypto.tink.internal.LegacyProtoParameters r1 = new com.google.crypto.tink.internal.LegacyProtoParameters
            r1.<init>(r3)
            return r1
    }

    public synchronized <SerializationT extends com.google.crypto.tink.internal.Serialization> void registerKeyParser(com.google.crypto.tink.internal.KeyParser<SerializationT> r3) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            com.google.crypto.tink.internal.SerializationRegistry$Builder r0 = new com.google.crypto.tink.internal.SerializationRegistry$Builder     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> r1 = r2.registry     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.SerializationRegistry r1 = (com.google.crypto.tink.internal.SerializationRegistry) r1     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.SerializationRegistry$Builder r0 = r0.registerKeyParser(r3)     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.SerializationRegistry r0 = r0.build()     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> r1 = r2.registry     // Catch: java.lang.Throwable -> L1d
            r1.set(r0)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return
        L1d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    public synchronized <KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> void registerKeySerializer(com.google.crypto.tink.internal.KeySerializer<KeyT, SerializationT> r3) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            com.google.crypto.tink.internal.SerializationRegistry$Builder r0 = new com.google.crypto.tink.internal.SerializationRegistry$Builder     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> r1 = r2.registry     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.SerializationRegistry r1 = (com.google.crypto.tink.internal.SerializationRegistry) r1     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.SerializationRegistry$Builder r0 = r0.registerKeySerializer(r3)     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.SerializationRegistry r0 = r0.build()     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> r1 = r2.registry     // Catch: java.lang.Throwable -> L1d
            r1.set(r0)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return
        L1d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    public synchronized <SerializationT extends com.google.crypto.tink.internal.Serialization> void registerParametersParser(com.google.crypto.tink.internal.ParametersParser<SerializationT> r3) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            com.google.crypto.tink.internal.SerializationRegistry$Builder r0 = new com.google.crypto.tink.internal.SerializationRegistry$Builder     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> r1 = r2.registry     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.SerializationRegistry r1 = (com.google.crypto.tink.internal.SerializationRegistry) r1     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.SerializationRegistry$Builder r0 = r0.registerParametersParser(r3)     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.SerializationRegistry r0 = r0.build()     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> r1 = r2.registry     // Catch: java.lang.Throwable -> L1d
            r1.set(r0)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return
        L1d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    public synchronized <ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> void registerParametersSerializer(com.google.crypto.tink.internal.ParametersSerializer<ParametersT, SerializationT> r3) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            com.google.crypto.tink.internal.SerializationRegistry$Builder r0 = new com.google.crypto.tink.internal.SerializationRegistry$Builder     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> r1 = r2.registry     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.SerializationRegistry r1 = (com.google.crypto.tink.internal.SerializationRegistry) r1     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.SerializationRegistry$Builder r0 = r0.registerParametersSerializer(r3)     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.SerializationRegistry r0 = r0.build()     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> r1 = r2.registry     // Catch: java.lang.Throwable -> L1d
            r1.set(r0)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return
        L1d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    public <KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> SerializationT serializeKey(KeyT r2, java.lang.Class<SerializationT> r3, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r4) throws java.security.GeneralSecurityException {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> r0 = r1.registry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.internal.SerializationRegistry r0 = (com.google.crypto.tink.internal.SerializationRegistry) r0
            com.google.crypto.tink.internal.Serialization r0 = r0.serializeKey(r2, r3, r4)
            return r0
    }

    public <ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> SerializationT serializeParameters(ParametersT r2, java.lang.Class<SerializationT> r3) throws java.security.GeneralSecurityException {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> r0 = r1.registry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.internal.SerializationRegistry r0 = (com.google.crypto.tink.internal.SerializationRegistry) r0
            com.google.crypto.tink.internal.Serialization r0 = r0.serializeParameters(r2, r3)
            return r0
    }
}
