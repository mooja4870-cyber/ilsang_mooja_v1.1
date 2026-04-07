package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
final class KeyManagerRegistry {
    private static final java.util.logging.Logger logger = null;
    private final java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer> keyManagerMap;




    private interface KeyManagerContainer {
        java.lang.Class<?> getImplementingClass();

        <P> com.google.crypto.tink.KeyManager<P> getKeyManager(java.lang.Class<P> r1) throws java.security.GeneralSecurityException;

        com.google.crypto.tink.KeyManager<?> getUntypedKeyManager();

        com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws java.security.GeneralSecurityException, com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        java.lang.Class<?> publicKeyManagerClassOrNull();

        java.util.Set<java.lang.Class<?>> supportedPrimitives();
    }

    static {
            java.lang.Class<com.google.crypto.tink.KeyManagerRegistry> r0 = com.google.crypto.tink.KeyManagerRegistry.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.crypto.tink.KeyManagerRegistry.logger = r0
            return
    }

    KeyManagerRegistry() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.keyManagerMap = r0
            return
    }

    KeyManagerRegistry(com.google.crypto.tink.KeyManagerRegistry r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r1 = r3.keyManagerMap
            r0.<init>(r1)
            r2.keyManagerMap = r0
            return
    }

    private static <T> T checkNotNull(T r1) {
            if (r1 == 0) goto L3
            return r1
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
    }

    private static <P> com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer createContainerFor(com.google.crypto.tink.KeyManager<P> r2) {
            r0 = r2
            com.google.crypto.tink.KeyManagerRegistry$1 r1 = new com.google.crypto.tink.KeyManagerRegistry$1
            r1.<init>(r0)
            return r1
    }

    private static <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer createContainerFor(com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT> r2) {
            r0 = r2
            com.google.crypto.tink.KeyManagerRegistry$2 r1 = new com.google.crypto.tink.KeyManagerRegistry$2
            r1.<init>(r0)
            return r1
    }

    private static <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer createPrivateKeyContainerFor(com.google.crypto.tink.internal.PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> r3, com.google.crypto.tink.internal.KeyTypeManager<PublicKeyProtoT> r4) {
            r0 = r3
            r1 = r4
            com.google.crypto.tink.KeyManagerRegistry$3 r2 = new com.google.crypto.tink.KeyManagerRegistry$3
            r2.<init>(r0, r1)
            return r2
    }

    private synchronized com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer getKeyManagerContainerOrThrow(java.lang.String r4) throws java.security.GeneralSecurityException {
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r0 = r3.keyManagerMap     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.containsKey(r4)     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L13
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r0 = r3.keyManagerMap     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L2c
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r0 = (com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer) r0     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)
            return r0
        L13:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r1.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "No key manager found for key type "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L2c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            throw r4
    }

    private <P> com.google.crypto.tink.KeyManager<P> getKeyManagerInternal(java.lang.String r5, java.lang.Class<P> r6) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r0 = r4.getKeyManagerContainerOrThrow(r5)
            if (r6 != 0) goto Lb
            com.google.crypto.tink.KeyManager r1 = r0.getUntypedKeyManager()
            return r1
        Lb:
            java.util.Set r1 = r0.supportedPrimitives()
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L1a
            com.google.crypto.tink.KeyManager r1 = r0.getKeyManager(r6)
            return r1
        L1a:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Primitive type "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r6.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " not supported by key manager of type "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Class r3 = r0.getImplementingClass()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", supported primitives: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.util.Set r3 = r0.supportedPrimitives()
            java.lang.String r3 = toCommaSeparatedString(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private synchronized <P> void registerKeyManagerContainer(com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer r7, boolean r8) throws java.security.GeneralSecurityException {
            r6 = this;
            monitor-enter(r6)
            com.google.crypto.tink.KeyManager r0 = r7.getUntypedKeyManager()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.getKeyType()     // Catch: java.lang.Throwable -> L69
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r1 = r6.keyManagerMap     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L69
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r1 = (com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer) r1     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L5a
            java.lang.Class r2 = r1.getImplementingClass()     // Catch: java.lang.Throwable -> L69
            java.lang.Class r3 = r7.getImplementingClass()     // Catch: java.lang.Throwable -> L69
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L22
            goto L5a
        L22:
            java.util.logging.Logger r2 = com.google.crypto.tink.KeyManagerRegistry.logger     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r3.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = "Attempted overwrite of a registered key manager for key type "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r3 = r3.append(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L69
            r2.warning(r3)     // Catch: java.lang.Throwable -> L69
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.Class r4 = r1.getImplementingClass()     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L69
            java.lang.Class r5 = r7.getImplementingClass()     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L69
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L69
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L69
            throw r2     // Catch: java.lang.Throwable -> L69
        L5a:
            if (r8 != 0) goto L62
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r2 = r6.keyManagerMap     // Catch: java.lang.Throwable -> L69
            r2.putIfAbsent(r0, r7)     // Catch: java.lang.Throwable -> L69
            goto L67
        L62:
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r2 = r6.keyManagerMap     // Catch: java.lang.Throwable -> L69
            r2.put(r0, r7)     // Catch: java.lang.Throwable -> L69
        L67:
            monitor-exit(r6)
            return
        L69:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L69
            throw r7
    }

    private static java.lang.String toCommaSeparatedString(java.util.Set<java.lang.Class<?>> r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 1
            java.util.Iterator r2 = r5.iterator()
        La:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.next()
            java.lang.Class r3 = (java.lang.Class) r3
            if (r1 != 0) goto L1d
            java.lang.String r4 = ", "
            r0.append(r4)
        L1d:
            java.lang.String r4 = r3.getCanonicalName()
            r0.append(r4)
            r1 = 0
            goto La
        L26:
            java.lang.String r2 = r0.toString()
            return r2
    }

    @java.lang.Deprecated
    <P> com.google.crypto.tink.KeyManager<P> getKeyManager(java.lang.String r2) throws java.security.GeneralSecurityException {
            r1 = this;
            r0 = 0
            com.google.crypto.tink.KeyManager r0 = r1.getKeyManagerInternal(r2, r0)
            return r0
    }

    <P> com.google.crypto.tink.KeyManager<P> getKeyManager(java.lang.String r2, java.lang.Class<P> r3) throws java.security.GeneralSecurityException {
            r1 = this;
            java.lang.Object r0 = checkNotNull(r3)
            java.lang.Class r0 = (java.lang.Class) r0
            com.google.crypto.tink.KeyManager r0 = r1.getKeyManagerInternal(r2, r0)
            return r0
    }

    com.google.crypto.tink.KeyManager<?> getUntypedKeyManager(java.lang.String r3) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r0 = r2.getKeyManagerContainerOrThrow(r3)
            com.google.crypto.tink.KeyManager r1 = r0.getUntypedKeyManager()
            return r1
    }

    boolean isEmpty() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r0 = r1.keyManagerMap
            boolean r0 = r0.isEmpty()
            return r0
    }

    com.google.crypto.tink.shaded.protobuf.MessageLite parseKeyData(com.google.crypto.tink.proto.KeyData r3) throws java.security.GeneralSecurityException, com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r2 = this;
            java.lang.String r0 = r3.getTypeUrl()
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r0 = r2.getKeyManagerContainerOrThrow(r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r3.getValue()
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseKey(r1)
            return r1
    }

    synchronized <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> void registerAsymmetricKeyManagers(com.google.crypto.tink.internal.PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> r11, com.google.crypto.tink.internal.KeyTypeManager<PublicKeyProtoT> r12) throws java.security.GeneralSecurityException {
            r10 = this;
            monitor-enter(r10)
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = r11.fipsStatus()     // Catch: java.lang.Throwable -> Lf6
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r1 = r12.fipsStatus()     // Catch: java.lang.Throwable -> Lf6
            boolean r2 = r0.isCompatible()     // Catch: java.lang.Throwable -> Lf6
            if (r2 == 0) goto Ld3
            boolean r2 = r1.isCompatible()     // Catch: java.lang.Throwable -> Lf6
            if (r2 == 0) goto Lb0
            java.lang.String r2 = r11.getKeyType()     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r3 = r12.getKeyType()     // Catch: java.lang.Throwable -> Lf6
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r4 = r10.keyManagerMap     // Catch: java.lang.Throwable -> Lf6
            boolean r4 = r4.containsKey(r2)     // Catch: java.lang.Throwable -> Lf6
            if (r4 == 0) goto L9c
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r4 = r10.keyManagerMap     // Catch: java.lang.Throwable -> Lf6
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> Lf6
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r4 = (com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer) r4     // Catch: java.lang.Throwable -> Lf6
            java.lang.Class r4 = r4.publicKeyManagerClassOrNull()     // Catch: java.lang.Throwable -> Lf6
            if (r4 == 0) goto L9c
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r4 = r10.keyManagerMap     // Catch: java.lang.Throwable -> Lf6
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> Lf6
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r4 = (com.google.crypto.tink.KeyManagerRegistry.KeyManagerContainer) r4     // Catch: java.lang.Throwable -> Lf6
            java.lang.Class r4 = r4.publicKeyManagerClassOrNull()     // Catch: java.lang.Throwable -> Lf6
            if (r4 == 0) goto L9c
        L43:
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> Lf6
            java.lang.Class r6 = r12.getClass()     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> Lf6
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> Lf6
            if (r5 == 0) goto L56
            goto L9c
        L56:
            java.util.logging.Logger r5 = com.google.crypto.tink.KeyManagerRegistry.logger     // Catch: java.lang.Throwable -> Lf6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf6
            r6.<init>()     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r7 = "Attempted overwrite of a registered key manager for key type "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Lf6
            java.lang.StringBuilder r6 = r6.append(r2)     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r7 = " with inconsistent public key type "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Lf6
            java.lang.StringBuilder r6 = r6.append(r3)     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lf6
            r5.warning(r6)     // Catch: java.lang.Throwable -> Lf6
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r6 = "public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s"
            java.lang.Class r7 = r11.getClass()     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r8 = r4.getName()     // Catch: java.lang.Throwable -> Lf6
            java.lang.Class r9 = r12.getClass()     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> Lf6
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8, r9}     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch: java.lang.Throwable -> Lf6
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lf6
            throw r5     // Catch: java.lang.Throwable -> Lf6
        L9c:
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r4 = createPrivateKeyContainerFor(r11, r12)     // Catch: java.lang.Throwable -> Lf6
            r5 = 1
            r10.registerKeyManagerContainer(r4, r5)     // Catch: java.lang.Throwable -> Lf6
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r4 = createContainerFor(r12)     // Catch: java.lang.Throwable -> Lf6
            r5 = 0
            r10.registerKeyManagerContainer(r4, r5)     // Catch: java.lang.Throwable -> Lf6
            monitor-exit(r10)
            return
        Lb0:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> Lf6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf6
            r3.<init>()     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r4 = "failed to register key manager "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Lf6
            java.lang.Class r4 = r12.getClass()     // Catch: java.lang.Throwable -> Lf6
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r4 = " as it is not FIPS compatible."
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lf6
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lf6
            throw r2     // Catch: java.lang.Throwable -> Lf6
        Ld3:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> Lf6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf6
            r3.<init>()     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r4 = "failed to register key manager "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Lf6
            java.lang.Class r4 = r11.getClass()     // Catch: java.lang.Throwable -> Lf6
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r4 = " as it is not FIPS compatible."
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lf6
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lf6
            throw r2     // Catch: java.lang.Throwable -> Lf6
        Lf6:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf6
            throw r11
    }

    synchronized <P> void registerKeyManager(com.google.crypto.tink.KeyManager<P> r3) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.isCompatible()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L13
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r0 = createContainerFor(r3)     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            r2.registerKeyManagerContainer(r0, r1)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r2)
            return
        L13:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "Registering key managers is not supported in FIPS mode"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            throw r0     // Catch: java.lang.Throwable -> L1b
        L1b:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    synchronized <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> void registerKeyManager(com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT> r4) throws java.security.GeneralSecurityException {
            r3 = this;
            monitor-enter(r3)
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = r4.fipsStatus()     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.isCompatible()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L15
            com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer r0 = createContainerFor(r4)     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r3.registerKeyManagerContainer(r0, r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L15:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r1.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = "failed to register key manager "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = " as it is not FIPS compatible."
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L38
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L38
            throw r0     // Catch: java.lang.Throwable -> L38
        L38:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r4
    }

    boolean typeUrlExists(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyManagerRegistry$KeyManagerContainer> r0 = r1.keyManagerMap
            boolean r0 = r0.containsKey(r2)
            return r0
    }
}
