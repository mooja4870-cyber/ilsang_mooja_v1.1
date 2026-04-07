package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.MessageLite;

/* JADX INFO: loaded from: classes.dex */
public abstract class KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> {
    private final java.lang.Class<KeyProtoT> clazz;
    private final java.util.Map<java.lang.Class<?>, com.google.crypto.tink.internal.PrimitiveFactory<?, KeyProtoT>> factories;
    private final java.lang.Class<?> firstPrimitiveClass;

    public static abstract class KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> {
        private final java.lang.Class<KeyFormatProtoT> clazz;

        public static final class KeyFormat<KeyFormatProtoT> {
            public KeyFormatProtoT keyFormat;
            public com.google.crypto.tink.KeyTemplate.OutputPrefixType outputPrefixType;

            public KeyFormat(KeyFormatProtoT r1, com.google.crypto.tink.KeyTemplate.OutputPrefixType r2) {
                    r0 = this;
                    r0.<init>()
                    r0.keyFormat = r1
                    r0.outputPrefixType = r2
                    return
            }
        }

        public KeyFactory(java.lang.Class<KeyFormatProtoT> r1) {
                r0 = this;
                r0.<init>()
                r0.clazz = r1
                return
        }

        protected static void readFully(java.io.InputStream r5, byte[] r6) throws java.io.IOException, java.security.GeneralSecurityException {
                int r0 = r6.length
                r1 = 0
            L2:
                if (r1 >= r0) goto L17
                int r2 = r0 - r1
                int r2 = r5.read(r6, r1, r2)
                r3 = -1
                if (r2 == r3) goto Lf
                int r1 = r1 + r2
                goto L2
            Lf:
                java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
                java.lang.String r4 = "Not enough pseudorandomness provided"
                r3.<init>(r4)
                throw r3
            L17:
                return
        }

        public abstract KeyProtoT createKey(KeyFormatProtoT r1) throws java.security.GeneralSecurityException;

        public KeyProtoT deriveKey(KeyFormatProtoT r4, java.io.InputStream r5) throws java.security.GeneralSecurityException {
                r3 = this;
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "deriveKey not implemented for key of type "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.Class<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r2 = r3.clazz
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public final java.lang.Class<KeyFormatProtoT> getKeyFormatClass() {
                r1 = this;
                java.lang.Class<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r1.clazz
                return r0
        }

        public java.util.Map<java.lang.String, com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> keyFormats() throws java.security.GeneralSecurityException {
                r1 = this;
                java.util.Map r0 = java.util.Collections.emptyMap()
                return r0
        }

        public abstract KeyFormatProtoT parseKeyFormat(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        public abstract void validateKeyFormat(KeyFormatProtoT r1) throws java.security.GeneralSecurityException;
    }

    @java.lang.SafeVarargs
    protected KeyTypeManager(java.lang.Class<KeyProtoT> r7, com.google.crypto.tink.internal.PrimitiveFactory<?, KeyProtoT>... r8) {
            r6 = this;
            r6.<init>()
            r6.clazz = r7
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = r2
        Ld:
            if (r3 >= r1) goto L46
            r4 = r8[r3]
            java.lang.Class r5 = r4.getPrimitiveClass()
            boolean r5 = r0.containsKey(r5)
            if (r5 != 0) goto L25
            java.lang.Class r5 = r4.getPrimitiveClass()
            r0.put(r5, r4)
            int r3 = r3 + 1
            goto Ld
        L25:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "KeyTypeManager constructed with duplicate factories for primitive "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Class r3 = r4.getPrimitiveClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L46:
            int r1 = r8.length
            if (r1 <= 0) goto L52
            r1 = r8[r2]
            java.lang.Class r1 = r1.getPrimitiveClass()
            r6.firstPrimitiveClass = r1
            goto L56
        L52:
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            r6.firstPrimitiveClass = r1
        L56:
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r0)
            r6.factories = r1
            return
    }

    public com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility fipsStatus() {
            r1 = this;
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS
            return r0
    }

    public final java.lang.Class<?> firstSupportedPrimitiveClass() {
            r1 = this;
            java.lang.Class<?> r0 = r1.firstPrimitiveClass
            return r0
    }

    public final java.lang.Class<KeyProtoT> getKeyClass() {
            r1 = this;
            java.lang.Class<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r1.clazz
            return r0
    }

    public abstract java.lang.String getKeyType();

    public final <P> P getPrimitive(KeyProtoT r5, java.lang.Class<P> r6) throws java.security.GeneralSecurityException {
            r4 = this;
            java.util.Map<java.lang.Class<?>, com.google.crypto.tink.internal.PrimitiveFactory<?, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite>> r0 = r4.factories
            java.lang.Object r0 = r0.get(r6)
            com.google.crypto.tink.internal.PrimitiveFactory r0 = (com.google.crypto.tink.internal.PrimitiveFactory) r0
            if (r0 == 0) goto Lf
            java.lang.Object r1 = r0.getPrimitive(r5)
            return r1
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Requested primitive class "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r6.getCanonicalName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " not supported."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public abstract int getVersion();

    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<?, KeyProtoT> keyFactory() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Creating keys is not supported."
            r0.<init>(r1)
            throw r0
    }

    public abstract com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType();

    public abstract KeyProtoT parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    public final java.util.Set<java.lang.Class<?>> supportedPrimitives() {
            r1 = this;
            java.util.Map<java.lang.Class<?>, com.google.crypto.tink.internal.PrimitiveFactory<?, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite>> r0 = r1.factories
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public abstract void validateKey(KeyProtoT r1) throws java.security.GeneralSecurityException;
}
