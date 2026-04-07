package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class Protobuf {
    private static final com.google.crypto.tink.shaded.protobuf.Protobuf INSTANCE = null;
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.crypto.tink.shaded.protobuf.Schema<?>> schemaCache;
    private final com.google.crypto.tink.shaded.protobuf.SchemaFactory schemaFactory;

    static {
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = new com.google.crypto.tink.shaded.protobuf.Protobuf
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.Protobuf.INSTANCE = r0
            return
    }

    private Protobuf() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.schemaCache = r0
            com.google.crypto.tink.shaded.protobuf.ManifestSchemaFactory r0 = new com.google.crypto.tink.shaded.protobuf.ManifestSchemaFactory
            r0.<init>()
            r1.schemaFactory = r0
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.Protobuf getInstance() {
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.INSTANCE
            return r0
    }

    int getTotalSchemaSize() {
            r4 = this;
            r0 = 0
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.crypto.tink.shaded.protobuf.Schema<?>> r1 = r4.schemaCache
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()
            com.google.crypto.tink.shaded.protobuf.Schema r2 = (com.google.crypto.tink.shaded.protobuf.Schema) r2
            boolean r3 = r2 instanceof com.google.crypto.tink.shaded.protobuf.MessageSchema
            if (r3 == 0) goto L23
            r3 = r2
            com.google.crypto.tink.shaded.protobuf.MessageSchema r3 = (com.google.crypto.tink.shaded.protobuf.MessageSchema) r3
            int r3 = r3.getSchemaSize()
            int r0 = r0 + r3
        L23:
            goto Lb
        L24:
            return r0
    }

    <T> boolean isInitialized(T r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r1.schemaFor(r2)
            boolean r0 = r0.isInitialized(r2)
            return r0
    }

    public <T> void makeImmutable(T r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r1.schemaFor(r2)
            r0.makeImmutable(r2)
            return
    }

    public <T> void mergeFrom(T r2, com.google.crypto.tink.shaded.protobuf.Reader r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            r1.mergeFrom(r2, r3, r0)
            return
    }

    public <T> void mergeFrom(T r2, com.google.crypto.tink.shaded.protobuf.Reader r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r1.schemaFor(r2)
            r0.mergeFrom(r2, r3, r4)
            return
    }

    public com.google.crypto.tink.shaded.protobuf.Schema<?> registerSchema(java.lang.Class<?> r2, com.google.crypto.tink.shaded.protobuf.Schema<?> r3) {
            r1 = this;
            java.lang.String r0 = "messageType"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r2, r0)
            java.lang.String r0 = "schema"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3, r0)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.crypto.tink.shaded.protobuf.Schema<?>> r0 = r1.schemaCache
            java.lang.Object r0 = r0.putIfAbsent(r2, r3)
            com.google.crypto.tink.shaded.protobuf.Schema r0 = (com.google.crypto.tink.shaded.protobuf.Schema) r0
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.Schema<?> registerSchemaOverride(java.lang.Class<?> r2, com.google.crypto.tink.shaded.protobuf.Schema<?> r3) {
            r1 = this;
            java.lang.String r0 = "messageType"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r2, r0)
            java.lang.String r0 = "schema"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3, r0)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.crypto.tink.shaded.protobuf.Schema<?>> r0 = r1.schemaCache
            java.lang.Object r0 = r0.put(r2, r3)
            com.google.crypto.tink.shaded.protobuf.Schema r0 = (com.google.crypto.tink.shaded.protobuf.Schema) r0
            return r0
    }

    public <T> com.google.crypto.tink.shaded.protobuf.Schema<T> schemaFor(java.lang.Class<T> r3) {
            r2 = this;
            java.lang.String r0 = "messageType"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3, r0)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.crypto.tink.shaded.protobuf.Schema<?>> r0 = r2.schemaCache
            java.lang.Object r0 = r0.get(r3)
            com.google.crypto.tink.shaded.protobuf.Schema r0 = (com.google.crypto.tink.shaded.protobuf.Schema) r0
            if (r0 != 0) goto L1c
            com.google.crypto.tink.shaded.protobuf.SchemaFactory r1 = r2.schemaFactory
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r1.createSchema(r3)
            com.google.crypto.tink.shaded.protobuf.Schema r1 = r2.registerSchema(r3, r0)
            if (r1 == 0) goto L1c
            r0 = r1
        L1c:
            return r0
    }

    public <T> com.google.crypto.tink.shaded.protobuf.Schema<T> schemaFor(T r2) {
            r1 = this;
            java.lang.Class r0 = r2.getClass()
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r1.schemaFor(r0)
            return r0
    }

    public <T> void writeTo(T r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r1.schemaFor(r2)
            r0.writeTo(r2, r3)
            return
    }
}
