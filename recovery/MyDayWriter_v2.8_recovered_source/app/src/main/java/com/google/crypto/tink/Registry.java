package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public final class Registry {
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Catalogue<?>> catalogueMap = null;
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Registry.KeyDeriverContainer> keyDeriverMap = null;
    private static final java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> keyManagerRegistry = null;
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> keyTemplateMap = null;
    private static final java.util.logging.Logger logger = null;
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> newKeyAllowedMap = null;


    private interface KeyDeriverContainer {
        com.google.crypto.tink.proto.KeyData deriveKey(com.google.crypto.tink.shaded.protobuf.ByteString r1, java.io.InputStream r2) throws java.security.GeneralSecurityException;
    }

    static {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.crypto.tink.Registry.logger = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            com.google.crypto.tink.KeyManagerRegistry r1 = new com.google.crypto.tink.KeyManagerRegistry
            r1.<init>()
            r0.<init>(r1)
            com.google.crypto.tink.Registry.keyManagerRegistry = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.crypto.tink.Registry.keyDeriverMap = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.crypto.tink.Registry.newKeyAllowedMap = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.crypto.tink.Registry.catalogueMap = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.crypto.tink.Registry.keyTemplateMap = r0
            return
    }

    private Registry() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static synchronized void addCatalogue(java.lang.String r5, com.google.crypto.tink.Catalogue<?> r6) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            if (r5 == 0) goto L86
            if (r6 == 0) goto L7e
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Catalogue<?>> r1 = com.google.crypto.tink.Registry.catalogueMap     // Catch: java.lang.Throwable -> L8e
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = r5.toLowerCase(r2)     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L71
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Catalogue<?>> r1 = com.google.crypto.tink.Registry.catalogueMap     // Catch: java.lang.Throwable -> L8e
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = r5.toLowerCase(r2)     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L8e
            com.google.crypto.tink.Catalogue r1 = (com.google.crypto.tink.Catalogue) r1     // Catch: java.lang.Throwable -> L8e
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L8e
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L8e
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L3a
            goto L71
        L3a:
            java.util.logging.Logger r2 = com.google.crypto.tink.Registry.logger     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r3.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = "Attempted overwrite of a catalogueName catalogue for name "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L8e
            r2.warning(r3)     // Catch: java.lang.Throwable -> L8e
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r3.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = "catalogue for name "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = " has been already registered"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L8e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8e
            throw r2     // Catch: java.lang.Throwable -> L8e
        L71:
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Catalogue<?>> r1 = com.google.crypto.tink.Registry.catalogueMap     // Catch: java.lang.Throwable -> L8e
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = r5.toLowerCase(r2)     // Catch: java.lang.Throwable -> L8e
            r1.put(r2, r6)     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r0)
            return
        L7e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = "catalogue must be non-null."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        L86:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = "catalogueName must be non-null."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        L8e:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r5
    }

    private static <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> com.google.crypto.tink.Registry.KeyDeriverContainer createDeriverFor(com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT> r1) {
            com.google.crypto.tink.Registry$1 r0 = new com.google.crypto.tink.Registry$1
            r0.<init>(r1)
            return r0
    }

    static synchronized com.google.crypto.tink.proto.KeyData deriveKey(com.google.crypto.tink.proto.KeyTemplate r5, java.io.InputStream r6) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            java.lang.String r1 = r5.getTypeUrl()     // Catch: java.lang.Throwable -> L3a
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Registry$KeyDeriverContainer> r2 = com.google.crypto.tink.Registry.keyDeriverMap     // Catch: java.lang.Throwable -> L3a
            boolean r2 = r2.containsKey(r1)     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L21
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Registry$KeyDeriverContainer> r2 = com.google.crypto.tink.Registry.keyDeriverMap     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L3a
            com.google.crypto.tink.Registry$KeyDeriverContainer r2 = (com.google.crypto.tink.Registry.KeyDeriverContainer) r2     // Catch: java.lang.Throwable -> L3a
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r5.getValue()     // Catch: java.lang.Throwable -> L3a
            com.google.crypto.tink.proto.KeyData r3 = r2.deriveKey(r3, r6)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)
            return r3
        L21:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r3.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "No keymanager registered or key manager cannot derive keys for "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r3 = r3.append(r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3a
            throw r2     // Catch: java.lang.Throwable -> L3a
        L3a:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r5
    }

    private static synchronized <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> void ensureKeyManagerInsertable(java.lang.String r5, java.util.Map<java.lang.String, com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> r6, boolean r7) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            if (r7 == 0) goto L38
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r1 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L35
            boolean r1 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L38
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r1 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L35
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L1c
            goto L38
        L1c:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r2.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "New keys are already disallowed for key type "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r2 = r2.append(r5)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L35
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L35
            throw r1     // Catch: java.lang.Throwable -> L35
        L35:
            r5 = move-exception
            goto Ld3
        L38:
            if (r7 == 0) goto Ld5
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r1 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L35
            com.google.crypto.tink.KeyManagerRegistry r1 = (com.google.crypto.tink.KeyManagerRegistry) r1     // Catch: java.lang.Throwable -> L35
            boolean r1 = r1.typeUrlExists(r5)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L93
            java.util.Set r1 = r6.entrySet()     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L35
        L50:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L92
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L35
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r3 = com.google.crypto.tink.Registry.keyTemplateMap     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L35
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L69
            goto L50
        L69:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r3.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "Attempted to register a new key template "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = " from an existing key manager of type "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L35
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L35
            throw r1     // Catch: java.lang.Throwable -> L35
        L92:
            goto Ld5
        L93:
            java.util.Set r1 = r6.entrySet()     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L35
        L9b:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto Ld5
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L35
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r3 = com.google.crypto.tink.Registry.keyTemplateMap     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L35
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto Lb4
            goto L9b
        Lb4:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r3.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "Attempted overwrite of a registered key template "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L35
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L35
            throw r1     // Catch: java.lang.Throwable -> L35
        Ld3:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r5
        Ld5:
            monitor-exit(r0)
            return
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.Catalogue<?> getCatalogue(java.lang.String r4) throws java.security.GeneralSecurityException {
            if (r4 == 0) goto L12b
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Catalogue<?>> r0 = com.google.crypto.tink.Registry.catalogueMap
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = r4.toLowerCase(r1)
            java.lang.Object r0 = r0.get(r1)
            com.google.crypto.tink.Catalogue r0 = (com.google.crypto.tink.Catalogue) r0
            if (r0 != 0) goto L12a
            java.lang.String r1 = "no catalogue found for %s. "
            java.lang.Object[] r2 = new java.lang.Object[]{r4}
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r4.toLowerCase(r2)
            java.lang.String r3 = "tinkaead"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L3d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r3 = "Maybe call AeadConfig.register()."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r1 = r2.toString()
        L3d:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r4.toLowerCase(r2)
            java.lang.String r3 = "tinkdeterministicaead"
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto L111
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r4.toLowerCase(r2)
            java.lang.String r3 = "tinkstreamingaead"
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto Lfd
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r4.toLowerCase(r2)
            java.lang.String r3 = "tinkhybriddecrypt"
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto Le9
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r4.toLowerCase(r2)
            java.lang.String r3 = "tinkhybridencrypt"
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto Le9
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r4.toLowerCase(r2)
            java.lang.String r3 = "tinkmac"
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto Ld5
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r4.toLowerCase(r2)
            java.lang.String r3 = "tinkpublickeysign"
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto Lc1
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r4.toLowerCase(r2)
            java.lang.String r3 = "tinkpublickeyverify"
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto Lc1
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r4.toLowerCase(r2)
            java.lang.String r3 = "tink"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L124
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r3 = "Maybe call TinkConfig.register()."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r1 = r2.toString()
            goto L124
        Lc1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r3 = "Maybe call SignatureConfig.register()."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r1 = r2.toString()
            goto L124
        Ld5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r3 = "Maybe call MacConfig.register()."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r1 = r2.toString()
            goto L124
        Le9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r3 = "Maybe call HybridConfig.register()."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r1 = r2.toString()
            goto L124
        Lfd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r3 = "Maybe call StreamingAeadConfig.register()."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r1 = r2.toString()
            goto L124
        L111:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r3 = "Maybe call DeterministicAeadConfig.register()."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r1 = r2.toString()
        L124:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            r2.<init>(r1)
            throw r2
        L12a:
            return r0
        L12b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "catalogueName must be non-null."
            r0.<init>(r1)
            throw r0
    }

    static <KeyT extends com.google.crypto.tink.Key, P> P getFullPrimitive(KeyT r1, java.lang.Class<P> r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.MutablePrimitiveRegistry r0 = com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance()
            java.lang.Object r0 = r0.getPrimitive(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.Class<?> getInputPrimitive(java.lang.Class<?> r2) {
            com.google.crypto.tink.internal.MutablePrimitiveRegistry r0 = com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance()     // Catch: java.security.GeneralSecurityException -> L9
            java.lang.Class r0 = r0.getInputPrimitiveClass(r2)     // Catch: java.security.GeneralSecurityException -> L9
            return r0
        L9:
            r0 = move-exception
            r1 = 0
            return r1
    }

    @java.lang.Deprecated
    public static <P> com.google.crypto.tink.KeyManager<P> getKeyManager(java.lang.String r1) throws java.security.GeneralSecurityException {
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.Registry.keyManagerRegistry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.KeyManagerRegistry r0 = (com.google.crypto.tink.KeyManagerRegistry) r0
            com.google.crypto.tink.KeyManager r0 = r0.getKeyManager(r1)
            return r0
    }

    public static <P> com.google.crypto.tink.KeyManager<P> getKeyManager(java.lang.String r1, java.lang.Class<P> r2) throws java.security.GeneralSecurityException {
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.Registry.keyManagerRegistry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.KeyManagerRegistry r0 = (com.google.crypto.tink.KeyManagerRegistry) r0
            com.google.crypto.tink.KeyManager r0 = r0.getKeyManager(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static <P> P getPrimitive(com.google.crypto.tink.proto.KeyData r2) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r2.getTypeUrl()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r2.getValue()
            java.lang.Object r0 = getPrimitive(r0, r1)
            return r0
    }

    public static <P> P getPrimitive(com.google.crypto.tink.proto.KeyData r2, java.lang.Class<P> r3) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r2.getTypeUrl()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r2.getValue()
            java.lang.Object r0 = getPrimitive(r0, r1, r3)
            return r0
    }

    @java.lang.Deprecated
    public static <P> P getPrimitive(java.lang.String r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) throws java.security.GeneralSecurityException {
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.Registry.keyManagerRegistry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.KeyManagerRegistry r0 = (com.google.crypto.tink.KeyManagerRegistry) r0
            com.google.crypto.tink.KeyManager r0 = r0.getKeyManager(r2)
            java.lang.Object r1 = r0.getPrimitive(r3)
            return r1
    }

    public static <P> P getPrimitive(java.lang.String r2, com.google.crypto.tink.shaded.protobuf.ByteString r3, java.lang.Class<P> r4) throws java.security.GeneralSecurityException {
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.Registry.keyManagerRegistry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.KeyManagerRegistry r0 = (com.google.crypto.tink.KeyManagerRegistry) r0
            com.google.crypto.tink.KeyManager r0 = r0.getKeyManager(r2, r4)
            java.lang.Object r1 = r0.getPrimitive(r3)
            return r1
    }

    @java.lang.Deprecated
    public static <P> P getPrimitive(java.lang.String r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3) throws java.security.GeneralSecurityException {
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.Registry.keyManagerRegistry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.KeyManagerRegistry r0 = (com.google.crypto.tink.KeyManagerRegistry) r0
            com.google.crypto.tink.KeyManager r0 = r0.getKeyManager(r2)
            java.lang.Object r1 = r0.getPrimitive(r3)
            return r1
    }

    public static <P> P getPrimitive(java.lang.String r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3, java.lang.Class<P> r4) throws java.security.GeneralSecurityException {
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.Registry.keyManagerRegistry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.KeyManagerRegistry r0 = (com.google.crypto.tink.KeyManagerRegistry) r0
            com.google.crypto.tink.KeyManager r0 = r0.getKeyManager(r2, r4)
            java.lang.Object r1 = r0.getPrimitive(r3)
            return r1
    }

    @java.lang.Deprecated
    public static <P> P getPrimitive(java.lang.String r1, byte[] r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2)
            java.lang.Object r0 = getPrimitive(r1, r0)
            return r0
    }

    public static <P> P getPrimitive(java.lang.String r1, byte[] r2, java.lang.Class<P> r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2)
            java.lang.Object r0 = getPrimitive(r1, r0, r3)
            return r0
    }

    public static com.google.crypto.tink.proto.KeyData getPublicKeyData(java.lang.String r4, com.google.crypto.tink.shaded.protobuf.ByteString r5) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.KeyManager r0 = getKeyManager(r4)
            boolean r1 = r0 instanceof com.google.crypto.tink.PrivateKeyManager
            if (r1 == 0) goto L10
            r1 = r0
            com.google.crypto.tink.PrivateKeyManager r1 = (com.google.crypto.tink.PrivateKeyManager) r1
            com.google.crypto.tink.proto.KeyData r1 = r1.getPublicKeyData(r5)
            return r1
        L10:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "manager for key type "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " is not a PrivateKeyManager"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static com.google.crypto.tink.KeyManager<?> getUntypedKeyManager(java.lang.String r1) throws java.security.GeneralSecurityException {
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.Registry.keyManagerRegistry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.KeyManagerRegistry r0 = (com.google.crypto.tink.KeyManagerRegistry) r0
            com.google.crypto.tink.KeyManager r0 = r0.getUntypedKeyManager(r1)
            return r0
    }

    static synchronized java.util.Map<java.lang.String, com.google.crypto.tink.KeyTemplate> keyTemplateMap() {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r1 = com.google.crypto.tink.Registry.keyTemplateMap     // Catch: java.lang.Throwable -> Lb
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public static synchronized java.util.List<java.lang.String> keyTemplates() {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r2 = com.google.crypto.tink.Registry.keyTemplateMap     // Catch: java.lang.Throwable -> L17
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L17
            r1.addAll(r2)     // Catch: java.lang.Throwable -> L17
            java.util.List r2 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r2
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    public static synchronized com.google.crypto.tink.shaded.protobuf.MessageLite newKey(com.google.crypto.tink.proto.KeyTemplate r5) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            java.lang.String r1 = r5.getTypeUrl()     // Catch: java.lang.Throwable -> L44
            com.google.crypto.tink.KeyManager r1 = getUntypedKeyManager(r1)     // Catch: java.lang.Throwable -> L44
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r2 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r5.getTypeUrl()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L44
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L27
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r5.getValue()     // Catch: java.lang.Throwable -> L44
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r1.newKey(r2)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)
            return r2
        L27:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r3.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "newKey-operation not permitted for key type "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = r5.getTypeUrl()     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L44
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L44
            throw r2     // Catch: java.lang.Throwable -> L44
        L44:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r5
    }

    public static synchronized com.google.crypto.tink.shaded.protobuf.MessageLite newKey(java.lang.String r5, com.google.crypto.tink.shaded.protobuf.MessageLite r6) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            com.google.crypto.tink.KeyManager r1 = getKeyManager(r5)     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r2 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L34
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L1b
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r1.newKey(r6)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)
            return r2
        L1b:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r3.<init>()     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = "newKey-operation not permitted for key type "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L34
            throw r2     // Catch: java.lang.Throwable -> L34
        L34:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r5
    }

    public static synchronized com.google.crypto.tink.proto.KeyData newKeyData(com.google.crypto.tink.KeyTemplate r2) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            com.google.crypto.tink.proto.KeyTemplate r1 = r2.getProto()     // Catch: java.lang.Throwable -> Ld
            com.google.crypto.tink.proto.KeyData r1 = newKeyData(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r1
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public static synchronized com.google.crypto.tink.proto.KeyData newKeyData(com.google.crypto.tink.proto.KeyTemplate r5) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            java.lang.String r1 = r5.getTypeUrl()     // Catch: java.lang.Throwable -> L44
            com.google.crypto.tink.KeyManager r1 = getUntypedKeyManager(r1)     // Catch: java.lang.Throwable -> L44
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r2 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r5.getTypeUrl()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L44
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L27
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r5.getValue()     // Catch: java.lang.Throwable -> L44
            com.google.crypto.tink.proto.KeyData r2 = r1.newKeyData(r2)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)
            return r2
        L27:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r3.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "newKey-operation not permitted for key type "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = r5.getTypeUrl()     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L44
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L44
            throw r2     // Catch: java.lang.Throwable -> L44
        L44:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r5
    }

    static com.google.crypto.tink.shaded.protobuf.MessageLite parseKeyData(com.google.crypto.tink.proto.KeyData r1) throws java.security.GeneralSecurityException, com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.Registry.keyManagerRegistry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.KeyManagerRegistry r0 = (com.google.crypto.tink.KeyManagerRegistry) r0
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.parseKeyData(r1)
            return r0
    }

    public static synchronized <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> void registerAsymmetricKeyManagers(com.google.crypto.tink.internal.PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> r7, com.google.crypto.tink.internal.KeyTypeManager<PublicKeyProtoT> r8, boolean r9) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            if (r7 == 0) goto L7c
            if (r8 == 0) goto L7c
            com.google.crypto.tink.KeyManagerRegistry r1 = new com.google.crypto.tink.KeyManagerRegistry     // Catch: java.lang.Throwable -> L84
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r2 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L84
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L84
            com.google.crypto.tink.KeyManagerRegistry r2 = (com.google.crypto.tink.KeyManagerRegistry) r2     // Catch: java.lang.Throwable -> L84
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L84
            r1.registerAsymmetricKeyManagers(r7, r8)     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = r7.getKeyType()     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = r8.getKeyType()     // Catch: java.lang.Throwable -> L84
            if (r9 == 0) goto L2b
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory r4 = r7.keyFactory()     // Catch: java.lang.Throwable -> L84
            java.util.Map r4 = r4.keyFormats()     // Catch: java.lang.Throwable -> L84
            goto L2f
        L2b:
            java.util.Map r4 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L84
        L2f:
            ensureKeyManagerInsertable(r2, r4, r9)     // Catch: java.lang.Throwable -> L84
            java.util.Map r4 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L84
            r5 = 0
            ensureKeyManagerInsertable(r3, r4, r5)     // Catch: java.lang.Throwable -> L84
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r4 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L84
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L84
            com.google.crypto.tink.KeyManagerRegistry r4 = (com.google.crypto.tink.KeyManagerRegistry) r4     // Catch: java.lang.Throwable -> L84
            boolean r4 = r4.typeUrlExists(r2)     // Catch: java.lang.Throwable -> L84
            if (r4 != 0) goto L63
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Registry$KeyDeriverContainer> r4 = com.google.crypto.tink.Registry.keyDeriverMap     // Catch: java.lang.Throwable -> L84
            com.google.crypto.tink.Registry$KeyDeriverContainer r6 = createDeriverFor(r7)     // Catch: java.lang.Throwable -> L84
            r4.put(r2, r6)     // Catch: java.lang.Throwable -> L84
            if (r9 == 0) goto L63
        L54:
            java.lang.String r4 = r7.getKeyType()     // Catch: java.lang.Throwable -> L84
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory r6 = r7.keyFactory()     // Catch: java.lang.Throwable -> L84
            java.util.Map r6 = r6.keyFormats()     // Catch: java.lang.Throwable -> L84
            registerKeyTemplates(r4, r6)     // Catch: java.lang.Throwable -> L84
        L63:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r4 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L84
            r4.put(r2, r6)     // Catch: java.lang.Throwable -> L84
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r4 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L84
            r4.put(r3, r5)     // Catch: java.lang.Throwable -> L84
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r4 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L84
            r4.set(r1)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r0)
            return
        L7c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = "given key managers must be non-null."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L84
        L84:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            throw r7
    }

    public static synchronized <P> void registerKeyManager(com.google.crypto.tink.KeyManager<P> r2) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            r1 = 1
            registerKeyManager(r2, r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public static synchronized <P> void registerKeyManager(com.google.crypto.tink.KeyManager<P> r5, boolean r6) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            if (r5 == 0) goto L42
            com.google.crypto.tink.KeyManagerRegistry r1 = new com.google.crypto.tink.KeyManagerRegistry     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r2 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L40
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L40
            com.google.crypto.tink.KeyManagerRegistry r2 = (com.google.crypto.tink.KeyManagerRegistry) r2     // Catch: java.lang.Throwable -> L40
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L40
            r1.registerKeyManager(r5)     // Catch: java.lang.Throwable -> L40
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r2 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS     // Catch: java.lang.Throwable -> L40
            boolean r2 = r2.isCompatible()     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L38
            java.lang.String r2 = r5.getKeyType()     // Catch: java.lang.Throwable -> L40
            java.util.Map r3 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L40
            ensureKeyManagerInsertable(r2, r3, r6)     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r3 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L40
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L40
            r3.put(r2, r4)     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r3 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L40
            r3.set(r1)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)
            return
        L38:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "Registering key managers is not supported in FIPS mode"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L40
            throw r2     // Catch: java.lang.Throwable -> L40
        L40:
            r5 = move-exception
            goto L4a
        L42:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "key manager must be non-null."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L40
            throw r1     // Catch: java.lang.Throwable -> L40
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r5
    }

    public static synchronized <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> void registerKeyManager(com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT> r5, boolean r6) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            if (r5 == 0) goto L62
            com.google.crypto.tink.KeyManagerRegistry r1 = new com.google.crypto.tink.KeyManagerRegistry     // Catch: java.lang.Throwable -> L60
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r2 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L60
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L60
            com.google.crypto.tink.KeyManagerRegistry r2 = (com.google.crypto.tink.KeyManagerRegistry) r2     // Catch: java.lang.Throwable -> L60
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L60
            r1.registerKeyManager(r5)     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = r5.getKeyType()     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L25
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory r3 = r5.keyFactory()     // Catch: java.lang.Throwable -> L60
            java.util.Map r3 = r3.keyFormats()     // Catch: java.lang.Throwable -> L60
            goto L29
        L25:
            java.util.Map r3 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L60
        L29:
            ensureKeyManagerInsertable(r2, r3, r6)     // Catch: java.lang.Throwable -> L60
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r3 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L60
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L60
            com.google.crypto.tink.KeyManagerRegistry r3 = (com.google.crypto.tink.KeyManagerRegistry) r3     // Catch: java.lang.Throwable -> L60
            boolean r3 = r3.typeUrlExists(r2)     // Catch: java.lang.Throwable -> L60
            if (r3 != 0) goto L50
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Registry$KeyDeriverContainer> r3 = com.google.crypto.tink.Registry.keyDeriverMap     // Catch: java.lang.Throwable -> L60
            com.google.crypto.tink.Registry$KeyDeriverContainer r4 = createDeriverFor(r5)     // Catch: java.lang.Throwable -> L60
            r3.put(r2, r4)     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L50
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory r3 = r5.keyFactory()     // Catch: java.lang.Throwable -> L60
            java.util.Map r3 = r3.keyFormats()     // Catch: java.lang.Throwable -> L60
            registerKeyTemplates(r2, r3)     // Catch: java.lang.Throwable -> L60
        L50:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r3 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L60
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L60
            r3.put(r2, r4)     // Catch: java.lang.Throwable -> L60
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r3 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L60
            r3.set(r1)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r0)
            return
        L60:
            r5 = move-exception
            goto L6a
        L62:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "key manager must be non-null."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L60
            throw r1     // Catch: java.lang.Throwable -> L60
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            throw r5
    }

    @java.lang.Deprecated
    public static synchronized <P> void registerKeyManager(java.lang.String r2, com.google.crypto.tink.KeyManager<P> r3) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            r1 = 1
            registerKeyManager(r2, r3, r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    @java.lang.Deprecated
    public static synchronized <P> void registerKeyManager(java.lang.String r4, com.google.crypto.tink.KeyManager<P> r5, boolean r6) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            if (r5 == 0) goto L35
            java.lang.String r1 = r5.getKeyType()     // Catch: java.lang.Throwable -> L33
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L14
            registerKeyManager(r5, r6)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)
            return
        L14:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r2.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "Manager does not support key type "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "."
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L33
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L33
            throw r1     // Catch: java.lang.Throwable -> L33
        L33:
            r4 = move-exception
            goto L3d
        L35:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "key manager must be non-null."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L33
            throw r1     // Catch: java.lang.Throwable -> L33
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r4
    }

    private static <KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> void registerKeyTemplates(java.lang.String r6, java.util.Map<java.lang.String, com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> r7) {
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r2 = com.google.crypto.tink.Registry.keyTemplateMap
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.getValue()
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r4 = (com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat) r4
            KeyFormatProtoT r4 = r4.keyFormat
            com.google.crypto.tink.shaded.protobuf.MessageLite r4 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r4
            byte[] r4 = r4.toByteArray()
            java.lang.Object r5 = r1.getValue()
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r5 = (com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat) r5
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r5 = r5.outputPrefixType
            com.google.crypto.tink.KeyTemplate r4 = com.google.crypto.tink.KeyTemplate.create(r6, r4, r5)
            r2.put(r3, r4)
            goto L8
        L3a:
            return
    }

    public static synchronized <B, P> void registerPrimitiveWrapper(com.google.crypto.tink.PrimitiveWrapper<B, P> r2) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            com.google.crypto.tink.internal.MutablePrimitiveRegistry r1 = com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance()     // Catch: java.lang.Throwable -> Lc
            r1.registerPrimitiveWrapper(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    static synchronized void reset() {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r1 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L26
            com.google.crypto.tink.KeyManagerRegistry r2 = new com.google.crypto.tink.KeyManagerRegistry     // Catch: java.lang.Throwable -> L26
            r2.<init>()     // Catch: java.lang.Throwable -> L26
            r1.set(r2)     // Catch: java.lang.Throwable -> L26
            com.google.crypto.tink.internal.MutablePrimitiveRegistry.resetGlobalInstanceTestOnly()     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Registry$KeyDeriverContainer> r1 = com.google.crypto.tink.Registry.keyDeriverMap     // Catch: java.lang.Throwable -> L26
            r1.clear()     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r1 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L26
            r1.clear()     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.Catalogue<?>> r1 = com.google.crypto.tink.Registry.catalogueMap     // Catch: java.lang.Throwable -> L26
            r1.clear()     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r1 = com.google.crypto.tink.Registry.keyTemplateMap     // Catch: java.lang.Throwable -> L26
            r1.clear()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            return
        L26:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
    }

    public static synchronized void restrictToFipsIfEmpty() throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            boolean r1 = com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto Lb
            monitor-exit(r0)
            return
        Lb:
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r1 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L26
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L26
            com.google.crypto.tink.KeyManagerRegistry r1 = (com.google.crypto.tink.KeyManagerRegistry) r1     // Catch: java.lang.Throwable -> L26
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L1e
            com.google.crypto.tink.config.internal.TinkFipsUtil.setFipsRestricted()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            return
        L1e:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "Could not enable FIPS mode as Registry is not empty."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L26
            throw r1     // Catch: java.lang.Throwable -> L26
        L26:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
    }

    public static <P> P wrap(com.google.crypto.tink.PrimitiveSet<P> r1) throws java.security.GeneralSecurityException {
            java.lang.Class r0 = r1.getPrimitiveClass()
            java.lang.Object r0 = wrap(r1, r0)
            return r0
    }

    public static <B, P> P wrap(com.google.crypto.tink.PrimitiveSet<B> r1, java.lang.Class<P> r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.MutablePrimitiveRegistry r0 = com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance()
            java.lang.Object r0 = r0.wrap(r1, r2)
            return r0
    }
}
