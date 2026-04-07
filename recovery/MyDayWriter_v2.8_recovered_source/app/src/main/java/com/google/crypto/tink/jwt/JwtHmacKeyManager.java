package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
public final class JwtHmacKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.JwtHmacKey> {



    /* JADX INFO: renamed from: com.google.crypto.tink.jwt.JwtHmacKeyManager$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm = null;

        static {
                com.google.crypto.tink.proto.JwtHmacAlgorithm[] r0 = com.google.crypto.tink.proto.JwtHmacAlgorithm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.jwt.JwtHmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm = r0
                int[] r0 = com.google.crypto.tink.jwt.JwtHmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.JwtHmacAlgorithm r1 = com.google.crypto.tink.proto.JwtHmacAlgorithm.HS256     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.jwt.JwtHmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.JwtHmacAlgorithm r1 = com.google.crypto.tink.proto.JwtHmacAlgorithm.HS384     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.jwt.JwtHmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.JwtHmacAlgorithm r1 = com.google.crypto.tink.proto.JwtHmacAlgorithm.HS512     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                return
        }
    }

    @com.google.errorprone.annotations.Immutable
    private static final class JwtHmac implements com.google.crypto.tink.jwt.JwtMacInternal {
        private final java.lang.String algorithm;
        private final java.util.Optional<java.lang.String> customKidFromHmacKey;
        private final com.google.crypto.tink.subtle.PrfMac prfMac;

        public JwtHmac(java.lang.String r1, java.util.Optional<java.lang.String> r2, com.google.crypto.tink.subtle.PrfMac r3) {
                r0 = this;
                r0.<init>()
                r0.algorithm = r1
                r0.customKidFromHmacKey = r2
                r0.prfMac = r3
                return
        }

        @Override // com.google.crypto.tink.jwt.JwtMacInternal
        public java.lang.String computeMacAndEncodeWithKid(com.google.crypto.tink.jwt.RawJwt r4, java.util.Optional<java.lang.String> r5) throws java.security.GeneralSecurityException {
                r3 = this;
                java.util.Optional<java.lang.String> r0 = r3.customKidFromHmacKey
                boolean r0 = r0.isPresent()
                if (r0 == 0) goto L19
                boolean r0 = r5.isPresent()
                if (r0 != 0) goto L11
                java.util.Optional<java.lang.String> r5 = r3.customKidFromHmacKey
                goto L19
            L11:
                com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
                java.lang.String r1 = "custom_kid can only be set for RAW keys."
                r0.<init>(r1)
                throw r0
            L19:
                java.lang.String r0 = r3.algorithm
                java.lang.String r0 = com.google.crypto.tink.jwt.JwtFormat.createUnsignedCompact(r0, r5, r4)
                com.google.crypto.tink.subtle.PrfMac r1 = r3.prfMac
                java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
                byte[] r2 = r0.getBytes(r2)
                byte[] r1 = r1.computeMac(r2)
                java.lang.String r1 = com.google.crypto.tink.jwt.JwtFormat.createSignedCompact(r0, r1)
                return r1
        }

        @Override // com.google.crypto.tink.jwt.JwtMacInternal
        public com.google.crypto.tink.jwt.VerifiedJwt verifyMacAndDecodeWithKid(java.lang.String r6, com.google.crypto.tink.jwt.JwtValidator r7, java.util.Optional<java.lang.String> r8) throws java.security.GeneralSecurityException {
                r5 = this;
                com.google.crypto.tink.jwt.JwtFormat$Parts r0 = com.google.crypto.tink.jwt.JwtFormat.splitSignedCompact(r6)
                com.google.crypto.tink.subtle.PrfMac r1 = r5.prfMac
                byte[] r2 = r0.signatureOrMac
                java.lang.String r3 = r0.unsignedCompact
                java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.US_ASCII
                byte[] r3 = r3.getBytes(r4)
                r1.verifyMac(r2, r3)
                java.lang.String r1 = r0.header
                com.google.gson.JsonObject r1 = com.google.crypto.tink.jwt.JsonUtil.parseJson(r1)
                java.lang.String r2 = r5.algorithm
                java.util.Optional<java.lang.String> r3 = r5.customKidFromHmacKey
                com.google.crypto.tink.jwt.JwtFormat.validateHeader(r2, r8, r3, r1)
                java.util.Optional r2 = com.google.crypto.tink.jwt.JwtFormat.getTypeHeader(r1)
                java.lang.String r3 = r0.payload
                com.google.crypto.tink.jwt.RawJwt r2 = com.google.crypto.tink.jwt.RawJwt.fromJsonPayload(r2, r3)
                com.google.crypto.tink.jwt.VerifiedJwt r3 = r7.validate(r2)
                return r3
        }
    }

    public JwtHmacKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.JwtHmacKey> r0 = com.google.crypto.tink.proto.JwtHmacKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.jwt.JwtHmacKeyManager$1 r2 = new com.google.crypto.tink.jwt.JwtHmacKeyManager$1
            java.lang.Class<com.google.crypto.tink.jwt.JwtMacInternal> r3 = com.google.crypto.tink.jwt.JwtMacInternal.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static /* synthetic */ java.lang.String access$000(com.google.crypto.tink.proto.JwtHmacAlgorithm r1) throws java.security.GeneralSecurityException {
            java.lang.String r0 = getHmacAlgorithm(r1)
            return r0
    }

    static /* synthetic */ java.lang.String access$100(com.google.crypto.tink.proto.JwtHmacAlgorithm r1) throws java.security.GeneralSecurityException {
            java.lang.String r0 = getAlgorithmName(r1)
            return r0
    }

    static /* synthetic */ int access$200(com.google.crypto.tink.proto.JwtHmacAlgorithm r1) throws java.security.GeneralSecurityException {
            int r0 = getMinimumKeySizeInBytes(r1)
            return r0
    }

    static /* synthetic */ com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat access$300(com.google.crypto.tink.proto.JwtHmacAlgorithm r1, int r2, com.google.crypto.tink.KeyTemplate.OutputPrefixType r3) {
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r0 = createKeyFormat(r1, r2, r3)
            return r0
    }

    private static com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<com.google.crypto.tink.proto.JwtHmacKeyFormat> createKeyFormat(com.google.crypto.tink.proto.JwtHmacAlgorithm r2, int r3, com.google.crypto.tink.KeyTemplate.OutputPrefixType r4) {
            com.google.crypto.tink.proto.JwtHmacKeyFormat$Builder r0 = com.google.crypto.tink.proto.JwtHmacKeyFormat.newBuilder()
            com.google.crypto.tink.proto.JwtHmacKeyFormat$Builder r0 = r0.setAlgorithm(r2)
            com.google.crypto.tink.proto.JwtHmacKeyFormat$Builder r0 = r0.setKeySize(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.JwtHmacKeyFormat r0 = (com.google.crypto.tink.proto.JwtHmacKeyFormat) r0
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r1 = new com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat
            r1.<init>(r0, r4)
            return r1
    }

    private static com.google.crypto.tink.KeyTemplate createTemplate(com.google.crypto.tink.proto.JwtHmacAlgorithm r4, int r5) {
            com.google.crypto.tink.proto.JwtHmacKeyFormat$Builder r0 = com.google.crypto.tink.proto.JwtHmacKeyFormat.newBuilder()
            com.google.crypto.tink.proto.JwtHmacKeyFormat$Builder r0 = r0.setAlgorithm(r4)
            com.google.crypto.tink.proto.JwtHmacKeyFormat$Builder r0 = r0.setKeySize(r5)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.JwtHmacKeyFormat r0 = (com.google.crypto.tink.proto.JwtHmacKeyFormat) r0
            com.google.crypto.tink.jwt.JwtHmacKeyManager r1 = new com.google.crypto.tink.jwt.JwtHmacKeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            byte[] r2 = r0.toByteArray()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r1 = com.google.crypto.tink.KeyTemplate.create(r1, r2, r3)
            return r1
    }

    private static final java.lang.String getAlgorithmName(com.google.crypto.tink.proto.JwtHmacAlgorithm r2) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.jwt.JwtHmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L19;
                case 2: goto L16;
                case 3: goto L13;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "unknown algorithm"
            r0.<init>(r1)
            throw r0
        L13:
            java.lang.String r0 = "HS512"
            return r0
        L16:
            java.lang.String r0 = "HS384"
            return r0
        L19:
            java.lang.String r0 = "HS256"
            return r0
    }

    private static final java.lang.String getHmacAlgorithm(com.google.crypto.tink.proto.JwtHmacAlgorithm r2) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.jwt.JwtHmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L19;
                case 2: goto L16;
                case 3: goto L13;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "unknown algorithm"
            r0.<init>(r1)
            throw r0
        L13:
            java.lang.String r0 = "HMACSHA512"
            return r0
        L16:
            java.lang.String r0 = "HMACSHA384"
            return r0
        L19:
            java.lang.String r0 = "HMACSHA256"
            return r0
    }

    private static final int getMinimumKeySizeInBytes(com.google.crypto.tink.proto.JwtHmacAlgorithm r2) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.jwt.JwtHmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L19;
                case 2: goto L16;
                case 3: goto L13;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "unknown algorithm"
            r0.<init>(r1)
            throw r0
        L13:
            r0 = 64
            return r0
        L16:
            r0 = 48
            return r0
        L19:
            r0 = 32
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate hs256Template() {
            com.google.crypto.tink.proto.JwtHmacAlgorithm r0 = com.google.crypto.tink.proto.JwtHmacAlgorithm.HS256
            r1 = 32
            com.google.crypto.tink.KeyTemplate r0 = createTemplate(r0, r1)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate hs384Template() {
            com.google.crypto.tink.proto.JwtHmacAlgorithm r0 = com.google.crypto.tink.proto.JwtHmacAlgorithm.HS384
            r1 = 48
            com.google.crypto.tink.KeyTemplate r0 = createTemplate(r0, r1)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate hs512Template() {
            com.google.crypto.tink.proto.JwtHmacAlgorithm r0 = com.google.crypto.tink.proto.JwtHmacAlgorithm.HS512
            r1 = 64
            com.google.crypto.tink.KeyTemplate r0 = createTemplate(r0, r1)
            return r0
    }

    public static void register(boolean r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.jwt.JwtHmacKeyManager r0 = new com.google.crypto.tink.jwt.JwtHmacKeyManager
            r0.<init>()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r1)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.JwtHmacKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.JwtHmacKeyFormat, com.google.crypto.tink.proto.JwtHmacKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.jwt.JwtHmacKeyManager$2 r0 = new com.google.crypto.tink.jwt.JwtHmacKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.JwtHmacKeyFormat> r1 = com.google.crypto.tink.proto.JwtHmacKeyFormat.class
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType() {
            r1 = this;
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.JwtHmacKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.JwtHmacKey r0 = com.google.crypto.tink.proto.JwtHmacKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.JwtHmacKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.JwtHmacKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getKeyValue()
            int r0 = r0.size()
            com.google.crypto.tink.proto.JwtHmacAlgorithm r1 = r3.getAlgorithm()
            int r1 = getMinimumKeySizeInBytes(r1)
            if (r0 < r1) goto L1e
            return
        L1e:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "key too short"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.JwtHmacKey r1 = (com.google.crypto.tink.proto.JwtHmacKey) r1
            r0.validateKey(r1)
            return
    }
}
