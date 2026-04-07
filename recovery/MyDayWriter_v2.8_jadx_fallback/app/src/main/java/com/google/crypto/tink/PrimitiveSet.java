package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public final class PrimitiveSet<P> {
    private final com.google.crypto.tink.monitoring.MonitoringAnnotations annotations;
    private final boolean isMutable;
    private com.google.crypto.tink.PrimitiveSet.Entry<P> primary;
    private final java.lang.Class<P> primitiveClass;
    private final java.util.concurrent.ConcurrentMap<com.google.crypto.tink.PrimitiveSet.Prefix, java.util.List<com.google.crypto.tink.PrimitiveSet.Entry<P>>> primitives;

    /* JADX INFO: renamed from: com.google.crypto.tink.PrimitiveSet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder<P> {
        private com.google.crypto.tink.monitoring.MonitoringAnnotations annotations;
        private com.google.crypto.tink.PrimitiveSet.Entry<P> primary;
        private final java.lang.Class<P> primitiveClass;
        private java.util.concurrent.ConcurrentMap<com.google.crypto.tink.PrimitiveSet.Prefix, java.util.List<com.google.crypto.tink.PrimitiveSet.Entry<P>>> primitives;

        private Builder(java.lang.Class<P> r2) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r0.<init>()
                r1.primitives = r0
                r1.primitiveClass = r2
                com.google.crypto.tink.monitoring.MonitoringAnnotations r0 = com.google.crypto.tink.monitoring.MonitoringAnnotations.EMPTY
                r1.annotations = r0
                return
        }

        /* synthetic */ Builder(java.lang.Class r1, com.google.crypto.tink.PrimitiveSet.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private com.google.crypto.tink.PrimitiveSet.Builder<P> addPrimitive(@javax.annotation.Nullable P r4, @javax.annotation.Nullable P r5, com.google.crypto.tink.proto.Keyset.Key r6, boolean r7) throws java.security.GeneralSecurityException {
                r3 = this;
                java.util.concurrent.ConcurrentMap<com.google.crypto.tink.PrimitiveSet$Prefix, java.util.List<com.google.crypto.tink.PrimitiveSet$Entry<P>>> r0 = r3.primitives
                if (r0 == 0) goto L39
                if (r4 != 0) goto L11
                if (r5 == 0) goto L9
                goto L11
            L9:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "at least one of the `fullPrimitive` or `primitive` must be set"
                r0.<init>(r1)
                throw r0
            L11:
                com.google.crypto.tink.proto.KeyStatusType r0 = r6.getStatus()
                com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
                if (r0 != r1) goto L31
                java.util.concurrent.ConcurrentMap<com.google.crypto.tink.PrimitiveSet$Prefix, java.util.List<com.google.crypto.tink.PrimitiveSet$Entry<P>>> r0 = r3.primitives
                com.google.crypto.tink.PrimitiveSet$Entry r0 = com.google.crypto.tink.PrimitiveSet.access$100(r4, r5, r6, r0)
                if (r7 == 0) goto L30
                com.google.crypto.tink.PrimitiveSet$Entry<P> r1 = r3.primary
                if (r1 != 0) goto L28
                r3.primary = r0
                goto L30
            L28:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "you cannot set two primary primitives"
                r1.<init>(r2)
                throw r1
            L30:
                return r3
            L31:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "only ENABLED key is allowed"
                r0.<init>(r1)
                throw r0
            L39:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "addPrimitive cannot be called after build"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.PrimitiveSet.Builder<P> addFullPrimitiveAndOptionalPrimitive(@javax.annotation.Nullable P r2, @javax.annotation.Nullable P r3, com.google.crypto.tink.proto.Keyset.Key r4) throws java.security.GeneralSecurityException {
                r1 = this;
                r0 = 0
                com.google.crypto.tink.PrimitiveSet$Builder r0 = r1.addPrimitive(r2, r3, r4, r0)
                return r0
        }

        public com.google.crypto.tink.PrimitiveSet.Builder<P> addPrimaryFullPrimitiveAndOptionalPrimitive(@javax.annotation.Nullable P r2, @javax.annotation.Nullable P r3, com.google.crypto.tink.proto.Keyset.Key r4) throws java.security.GeneralSecurityException {
                r1 = this;
                r0 = 1
                com.google.crypto.tink.PrimitiveSet$Builder r0 = r1.addPrimitive(r2, r3, r4, r0)
                return r0
        }

        public com.google.crypto.tink.PrimitiveSet.Builder<P> addPrimaryPrimitive(P r3, com.google.crypto.tink.proto.Keyset.Key r4) throws java.security.GeneralSecurityException {
                r2 = this;
                r0 = 0
                r1 = 1
                com.google.crypto.tink.PrimitiveSet$Builder r0 = r2.addPrimitive(r0, r3, r4, r1)
                return r0
        }

        public com.google.crypto.tink.PrimitiveSet.Builder<P> addPrimitive(P r3, com.google.crypto.tink.proto.Keyset.Key r4) throws java.security.GeneralSecurityException {
                r2 = this;
                r0 = 0
                r1 = 0
                com.google.crypto.tink.PrimitiveSet$Builder r0 = r2.addPrimitive(r0, r3, r4, r1)
                return r0
        }

        public com.google.crypto.tink.PrimitiveSet<P> build() throws java.security.GeneralSecurityException {
                r7 = this;
                java.util.concurrent.ConcurrentMap<com.google.crypto.tink.PrimitiveSet$Prefix, java.util.List<com.google.crypto.tink.PrimitiveSet$Entry<P>>> r0 = r7.primitives
                if (r0 == 0) goto L16
                com.google.crypto.tink.PrimitiveSet r1 = new com.google.crypto.tink.PrimitiveSet
                java.util.concurrent.ConcurrentMap<com.google.crypto.tink.PrimitiveSet$Prefix, java.util.List<com.google.crypto.tink.PrimitiveSet$Entry<P>>> r2 = r7.primitives
                com.google.crypto.tink.PrimitiveSet$Entry<P> r3 = r7.primary
                com.google.crypto.tink.monitoring.MonitoringAnnotations r4 = r7.annotations
                java.lang.Class<P> r5 = r7.primitiveClass
                r6 = 0
                r1.<init>(r2, r3, r4, r5, r6)
                r0 = 0
                r7.primitives = r0
                return r1
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "build cannot be called twice"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.PrimitiveSet.Builder<P> setAnnotations(com.google.crypto.tink.monitoring.MonitoringAnnotations r3) {
                r2 = this;
                java.util.concurrent.ConcurrentMap<com.google.crypto.tink.PrimitiveSet$Prefix, java.util.List<com.google.crypto.tink.PrimitiveSet$Entry<P>>> r0 = r2.primitives
                if (r0 == 0) goto L7
                r2.annotations = r3
                return r2
            L7:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "setAnnotations cannot be called after build"
                r0.<init>(r1)
                throw r0
        }
    }

    public static final class Entry<P> {

        @javax.annotation.Nullable
        private final P fullPrimitive;
        private final byte[] identifier;
        private final com.google.crypto.tink.Key key;
        private final int keyId;
        private final java.lang.String keyType;
        private final com.google.crypto.tink.proto.OutputPrefixType outputPrefixType;

        @javax.annotation.Nullable
        private final P primitive;
        private final com.google.crypto.tink.proto.KeyStatusType status;

        Entry(@javax.annotation.Nullable P r2, @javax.annotation.Nullable P r3, byte[] r4, com.google.crypto.tink.proto.KeyStatusType r5, com.google.crypto.tink.proto.OutputPrefixType r6, int r7, java.lang.String r8, com.google.crypto.tink.Key r9) {
                r1 = this;
                r1.<init>()
                r1.fullPrimitive = r2
                r1.primitive = r3
                int r0 = r4.length
                byte[] r0 = java.util.Arrays.copyOf(r4, r0)
                r1.identifier = r0
                r1.status = r5
                r1.outputPrefixType = r6
                r1.keyId = r7
                r1.keyType = r8
                r1.key = r9
                return
        }

        @javax.annotation.Nullable
        public P getFullPrimitive() {
                r1 = this;
                P r0 = r1.fullPrimitive
                return r0
        }

        @javax.annotation.Nullable
        public final byte[] getIdentifier() {
                r2 = this;
                byte[] r0 = r2.identifier
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                byte[] r0 = r2.identifier
                byte[] r1 = r2.identifier
                int r1 = r1.length
                byte[] r0 = java.util.Arrays.copyOf(r0, r1)
                return r0
        }

        public com.google.crypto.tink.Key getKey() {
                r1 = this;
                com.google.crypto.tink.Key r0 = r1.key
                return r0
        }

        public int getKeyId() {
                r1 = this;
                int r0 = r1.keyId
                return r0
        }

        public java.lang.String getKeyType() {
                r1 = this;
                java.lang.String r0 = r1.keyType
                return r0
        }

        public com.google.crypto.tink.proto.OutputPrefixType getOutputPrefixType() {
                r1 = this;
                com.google.crypto.tink.proto.OutputPrefixType r0 = r1.outputPrefixType
                return r0
        }

        @javax.annotation.Nullable
        public com.google.crypto.tink.Parameters getParameters() {
                r1 = this;
                com.google.crypto.tink.Key r0 = r1.key
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                com.google.crypto.tink.Key r0 = r1.key
                com.google.crypto.tink.Parameters r0 = r0.getParameters()
                return r0
        }

        @javax.annotation.Nullable
        public P getPrimitive() {
                r1 = this;
                P r0 = r1.primitive
                return r0
        }

        public com.google.crypto.tink.proto.KeyStatusType getStatus() {
                r1 = this;
                com.google.crypto.tink.proto.KeyStatusType r0 = r1.status
                return r0
        }
    }

    private static class Prefix implements java.lang.Comparable<com.google.crypto.tink.PrimitiveSet.Prefix> {
        private final byte[] prefix;

        private Prefix(byte[] r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.length
                byte[] r0 = java.util.Arrays.copyOf(r2, r0)
                r1.prefix = r0
                return
        }

        /* synthetic */ Prefix(byte[] r1, com.google.crypto.tink.PrimitiveSet.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.google.crypto.tink.PrimitiveSet.Prefix r4) {
                r3 = this;
                byte[] r0 = r3.prefix
                int r0 = r0.length
                byte[] r1 = r4.prefix
                int r1 = r1.length
                if (r0 == r1) goto L10
                byte[] r0 = r3.prefix
                int r0 = r0.length
                byte[] r1 = r4.prefix
                int r1 = r1.length
                int r0 = r0 - r1
                return r0
            L10:
                r0 = 0
            L11:
                byte[] r1 = r3.prefix
                int r1 = r1.length
                if (r0 >= r1) goto L2d
                byte[] r1 = r3.prefix
                r1 = r1[r0]
                byte[] r2 = r4.prefix
                r2 = r2[r0]
                if (r1 == r2) goto L2a
                byte[] r1 = r3.prefix
                r1 = r1[r0]
                byte[] r2 = r4.prefix
                r2 = r2[r0]
                int r1 = r1 - r2
                return r1
            L2a:
                int r0 = r0 + 1
                goto L11
            L2d:
                r0 = 0
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.google.crypto.tink.PrimitiveSet.Prefix r1) {
                r0 = this;
                com.google.crypto.tink.PrimitiveSet$Prefix r1 = (com.google.crypto.tink.PrimitiveSet.Prefix) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.crypto.tink.PrimitiveSet.Prefix
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                r0 = r4
                com.google.crypto.tink.PrimitiveSet$Prefix r0 = (com.google.crypto.tink.PrimitiveSet.Prefix) r0
                byte[] r1 = r3.prefix
                byte[] r2 = r0.prefix
                boolean r1 = java.util.Arrays.equals(r1, r2)
                return r1
        }

        public int hashCode() {
                r1 = this;
                byte[] r0 = r1.prefix
                int r0 = java.util.Arrays.hashCode(r0)
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                byte[] r0 = r1.prefix
                java.lang.String r0 = com.google.crypto.tink.subtle.Hex.encode(r0)
                return r0
        }
    }

    private PrimitiveSet(java.lang.Class<P> r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.primitives = r0
            r1.primitiveClass = r2
            com.google.crypto.tink.monitoring.MonitoringAnnotations r0 = com.google.crypto.tink.monitoring.MonitoringAnnotations.EMPTY
            r1.annotations = r0
            r0 = 1
            r1.isMutable = r0
            return
    }

    private PrimitiveSet(java.util.concurrent.ConcurrentMap<com.google.crypto.tink.PrimitiveSet.Prefix, java.util.List<com.google.crypto.tink.PrimitiveSet.Entry<P>>> r2, com.google.crypto.tink.PrimitiveSet.Entry<P> r3, com.google.crypto.tink.monitoring.MonitoringAnnotations r4, java.lang.Class<P> r5) {
            r1 = this;
            r1.<init>()
            r1.primitives = r2
            r1.primary = r3
            r1.primitiveClass = r5
            r1.annotations = r4
            r0 = 0
            r1.isMutable = r0
            return
    }

    /* synthetic */ PrimitiveSet(java.util.concurrent.ConcurrentMap r1, com.google.crypto.tink.PrimitiveSet.Entry r2, com.google.crypto.tink.monitoring.MonitoringAnnotations r3, java.lang.Class r4, com.google.crypto.tink.PrimitiveSet.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ com.google.crypto.tink.PrimitiveSet.Entry access$100(java.lang.Object r1, java.lang.Object r2, com.google.crypto.tink.proto.Keyset.Key r3, java.util.concurrent.ConcurrentMap r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.PrimitiveSet$Entry r0 = addEntryToMap(r1, r2, r3, r4)
            return r0
    }

    private static <P> com.google.crypto.tink.PrimitiveSet.Entry<P> addEntryToMap(@javax.annotation.Nullable P r14, @javax.annotation.Nullable P r15, com.google.crypto.tink.proto.Keyset.Key r16, java.util.concurrent.ConcurrentMap<com.google.crypto.tink.PrimitiveSet.Prefix, java.util.List<com.google.crypto.tink.PrimitiveSet.Entry<P>>> r17) throws java.security.GeneralSecurityException {
            r0 = r17
            int r1 = r16.getKeyId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.crypto.tink.proto.OutputPrefixType r2 = r16.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            if (r2 != r3) goto L13
            r1 = 0
        L13:
            com.google.crypto.tink.internal.MutableSerializationRegistry r2 = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance()
            com.google.crypto.tink.proto.KeyData r3 = r16.getKeyData()
            java.lang.String r3 = r3.getTypeUrl()
            com.google.crypto.tink.proto.KeyData r4 = r16.getKeyData()
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r4.getValue()
            com.google.crypto.tink.proto.KeyData r5 = r16.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r5 = r5.getKeyMaterialType()
            com.google.crypto.tink.proto.OutputPrefixType r6 = r16.getOutputPrefixType()
            com.google.crypto.tink.internal.ProtoKeySerialization r3 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r3, r4, r5, r6, r1)
            com.google.crypto.tink.SecretKeyAccess r4 = com.google.crypto.tink.InsecureSecretKeyAccess.get()
            com.google.crypto.tink.Key r13 = r2.parseKeyWithLegacyFallback(r3, r4)
            com.google.crypto.tink.PrimitiveSet$Entry r5 = new com.google.crypto.tink.PrimitiveSet$Entry
            byte[] r8 = com.google.crypto.tink.CryptoFormat.getOutputPrefix(r16)
            com.google.crypto.tink.proto.KeyStatusType r9 = r16.getStatus()
            com.google.crypto.tink.proto.OutputPrefixType r10 = r16.getOutputPrefixType()
            int r11 = r16.getKeyId()
            com.google.crypto.tink.proto.KeyData r2 = r16.getKeyData()
            java.lang.String r12 = r2.getTypeUrl()
            r6 = r14
            r7 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r5)
            com.google.crypto.tink.PrimitiveSet$Prefix r3 = new com.google.crypto.tink.PrimitiveSet$Prefix
            byte[] r4 = r5.getIdentifier()
            r6 = 0
            r3.<init>(r4, r6)
            java.util.List r4 = java.util.Collections.unmodifiableList(r2)
            java.lang.Object r4 = r0.put(r3, r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L8e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.addAll(r4)
            r6.add(r5)
            java.util.List r7 = java.util.Collections.unmodifiableList(r6)
            r0.put(r3, r7)
        L8e:
            return r5
    }

    public static <P> com.google.crypto.tink.PrimitiveSet.Builder<P> newBuilder(java.lang.Class<P> r2) {
            com.google.crypto.tink.PrimitiveSet$Builder r0 = new com.google.crypto.tink.PrimitiveSet$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @java.lang.Deprecated
    public static <P> com.google.crypto.tink.PrimitiveSet<P> newPrimitiveSet(java.lang.Class<P> r1) {
            com.google.crypto.tink.PrimitiveSet r0 = new com.google.crypto.tink.PrimitiveSet
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public com.google.crypto.tink.PrimitiveSet.Entry<P> addPrimitive(P r3, com.google.crypto.tink.proto.Keyset.Key r4) throws java.security.GeneralSecurityException {
            r2 = this;
            boolean r0 = r2.isMutable
            if (r0 == 0) goto L1c
            com.google.crypto.tink.proto.KeyStatusType r0 = r4.getStatus()
            com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
            if (r0 != r1) goto L14
            r0 = 0
            java.util.concurrent.ConcurrentMap<com.google.crypto.tink.PrimitiveSet$Prefix, java.util.List<com.google.crypto.tink.PrimitiveSet$Entry<P>>> r1 = r2.primitives
            com.google.crypto.tink.PrimitiveSet$Entry r0 = addEntryToMap(r0, r3, r4, r1)
            return r0
        L14:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "only ENABLED key is allowed"
            r0.<init>(r1)
            throw r0
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "addPrimitive cannot be called on an immutable primitive set"
            r0.<init>(r1)
            throw r0
    }

    public java.util.Collection<java.util.List<com.google.crypto.tink.PrimitiveSet.Entry<P>>> getAll() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<com.google.crypto.tink.PrimitiveSet$Prefix, java.util.List<com.google.crypto.tink.PrimitiveSet$Entry<P>>> r0 = r1.primitives
            java.util.Collection r0 = r0.values()
            return r0
    }

    public com.google.crypto.tink.monitoring.MonitoringAnnotations getAnnotations() {
            r1 = this;
            com.google.crypto.tink.monitoring.MonitoringAnnotations r0 = r1.annotations
            return r0
    }

    @javax.annotation.Nullable
    public com.google.crypto.tink.PrimitiveSet.Entry<P> getPrimary() {
            r1 = this;
            com.google.crypto.tink.PrimitiveSet$Entry<P> r0 = r1.primary
            return r0
    }

    public java.util.List<com.google.crypto.tink.PrimitiveSet.Entry<P>> getPrimitive(byte[] r4) {
            r3 = this;
            java.util.concurrent.ConcurrentMap<com.google.crypto.tink.PrimitiveSet$Prefix, java.util.List<com.google.crypto.tink.PrimitiveSet$Entry<P>>> r0 = r3.primitives
            com.google.crypto.tink.PrimitiveSet$Prefix r1 = new com.google.crypto.tink.PrimitiveSet$Prefix
            r2 = 0
            r1.<init>(r4, r2)
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L12
            r1 = r0
            goto L16
        L12:
            java.util.List r1 = java.util.Collections.emptyList()
        L16:
            return r1
    }

    public java.lang.Class<P> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<P> r0 = r1.primitiveClass
            return r0
    }

    public java.util.List<com.google.crypto.tink.PrimitiveSet.Entry<P>> getRawPrimitives() {
            r1 = this;
            byte[] r0 = com.google.crypto.tink.CryptoFormat.RAW_PREFIX
            java.util.List r0 = r1.getPrimitive(r0)
            return r0
    }

    public boolean hasAnnotations() {
            r1 = this;
            com.google.crypto.tink.monitoring.MonitoringAnnotations r0 = r1.annotations
            java.util.Map r0 = r0.toMap()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    @java.lang.Deprecated
    public void setPrimary(com.google.crypto.tink.PrimitiveSet.Entry<P> r4) {
            r3 = this;
            boolean r0 = r3.isMutable
            if (r0 == 0) goto L37
            if (r4 == 0) goto L2f
            com.google.crypto.tink.proto.KeyStatusType r0 = r4.getStatus()
            com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
            if (r0 != r1) goto L27
            byte[] r0 = r4.getIdentifier()
            java.util.List r0 = r3.getPrimitive(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1f
            r3.primary = r4
            return
        L1f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "the primary entry cannot be set to an entry which is not held by this primitive set"
            r1.<init>(r2)
            throw r1
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "the primary entry has to be ENABLED"
            r0.<init>(r1)
            throw r0
        L2f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "the primary entry must be non-null"
            r0.<init>(r1)
            throw r0
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "setPrimary cannot be called on an immutable primitive set"
            r0.<init>(r1)
            throw r0
    }
}
