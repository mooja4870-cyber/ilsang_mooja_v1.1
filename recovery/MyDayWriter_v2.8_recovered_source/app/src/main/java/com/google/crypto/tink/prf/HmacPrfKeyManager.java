package com.google.crypto.tink.prf;

/* JADX INFO: loaded from: classes.dex */
public final class HmacPrfKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.HmacPrfKey> {
    private static final int MIN_KEY_SIZE_IN_BYTES = 16;



    /* JADX INFO: renamed from: com.google.crypto.tink.prf.HmacPrfKeyManager$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType = null;

        static {
                com.google.crypto.tink.proto.HashType[] r0 = com.google.crypto.tink.proto.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.prf.HmacPrfKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType = r0
                int[] r0 = com.google.crypto.tink.prf.HmacPrfKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA1     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.prf.HmacPrfKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA224     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.prf.HmacPrfKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.prf.HmacPrfKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.prf.HmacPrfKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                return
        }
    }

    public HmacPrfKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.HmacPrfKey> r0 = com.google.crypto.tink.proto.HmacPrfKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.prf.HmacPrfKeyManager$1 r2 = new com.google.crypto.tink.prf.HmacPrfKeyManager$1
            java.lang.Class<com.google.crypto.tink.prf.Prf> r3 = com.google.crypto.tink.prf.Prf.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static /* synthetic */ void access$000(com.google.crypto.tink.proto.HmacPrfParams r0) throws java.security.GeneralSecurityException {
            validateParams(r0)
            return
    }

    private static com.google.crypto.tink.KeyTemplate createTemplate(int r5, com.google.crypto.tink.proto.HashType r6) {
            com.google.crypto.tink.proto.HmacPrfParams$Builder r0 = com.google.crypto.tink.proto.HmacPrfParams.newBuilder()
            com.google.crypto.tink.proto.HmacPrfParams$Builder r0 = r0.setHash(r6)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.HmacPrfParams r0 = (com.google.crypto.tink.proto.HmacPrfParams) r0
            com.google.crypto.tink.proto.HmacPrfKeyFormat$Builder r1 = com.google.crypto.tink.proto.HmacPrfKeyFormat.newBuilder()
            com.google.crypto.tink.proto.HmacPrfKeyFormat$Builder r1 = r1.setParams(r0)
            com.google.crypto.tink.proto.HmacPrfKeyFormat$Builder r1 = r1.setKeySize(r5)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.HmacPrfKeyFormat r1 = (com.google.crypto.tink.proto.HmacPrfKeyFormat) r1
            com.google.crypto.tink.prf.HmacPrfKeyManager r2 = new com.google.crypto.tink.prf.HmacPrfKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            byte[] r3 = r1.toByteArray()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r4 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r2 = com.google.crypto.tink.KeyTemplate.create(r2, r3, r4)
            return r2
    }

    public static final com.google.crypto.tink.KeyTemplate hmacSha256Template() {
            r0 = 32
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.KeyTemplate r0 = createTemplate(r0, r1)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate hmacSha512Template() {
            r0 = 64
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512
            com.google.crypto.tink.KeyTemplate r0 = createTemplate(r0, r1)
            return r0
    }

    public static void register(boolean r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.prf.HmacPrfKeyManager r0 = new com.google.crypto.tink.prf.HmacPrfKeyManager
            r0.<init>()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r1)
            return
    }

    private static void validateParams(com.google.crypto.tink.proto.HmacPrfParams r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.HashType r0 = r2.getHash()
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA1
            if (r0 == r1) goto L31
            com.google.crypto.tink.proto.HashType r0 = r2.getHash()
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA224
            if (r0 == r1) goto L31
            com.google.crypto.tink.proto.HashType r0 = r2.getHash()
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            if (r0 == r1) goto L31
            com.google.crypto.tink.proto.HashType r0 = r2.getHash()
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA384
            if (r0 == r1) goto L31
            com.google.crypto.tink.proto.HashType r0 = r2.getHash()
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512
            if (r0 != r1) goto L29
            goto L31
        L29:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "unknown hash type"
            r0.<init>(r1)
            throw r0
        L31:
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility fipsStatus() {
            r1 = this;
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.HmacPrfKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.HmacPrfKeyFormat, com.google.crypto.tink.proto.HmacPrfKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.prf.HmacPrfKeyManager$2 r0 = new com.google.crypto.tink.prf.HmacPrfKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.HmacPrfKeyFormat> r1 = com.google.crypto.tink.proto.HmacPrfKeyFormat.class
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
    public com.google.crypto.tink.proto.HmacPrfKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.HmacPrfKey r0 = com.google.crypto.tink.proto.HmacPrfKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.HmacPrfKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.HmacPrfKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getKeyValue()
            int r0 = r0.size()
            r1 = 16
            if (r0 < r1) goto L1f
            com.google.crypto.tink.proto.HmacPrfParams r0 = r3.getParams()
            validateParams(r0)
            return
        L1f:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "key too short"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.HmacPrfKey r1 = (com.google.crypto.tink.proto.HmacPrfKey) r1
            r0.validateKey(r1)
            return
    }
}
