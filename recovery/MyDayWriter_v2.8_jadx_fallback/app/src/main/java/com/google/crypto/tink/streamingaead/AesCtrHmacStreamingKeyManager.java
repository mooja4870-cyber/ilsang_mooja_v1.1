package com.google.crypto.tink.streamingaead;

/* JADX INFO: loaded from: classes.dex */
public final class AesCtrHmacStreamingKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.AesCtrHmacStreamingKey> {
    private static final int MIN_TAG_SIZE_IN_BYTES = 10;
    private static final int NONCE_PREFIX_IN_BYTES = 7;



    /* JADX INFO: renamed from: com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType = null;

        static {
                com.google.crypto.tink.proto.HashType[] r0 = com.google.crypto.tink.proto.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType = r0
                int[] r0 = com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA1     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L2f
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

    AesCtrHmacStreamingKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.AesCtrHmacStreamingKey> r0 = com.google.crypto.tink.proto.AesCtrHmacStreamingKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager$1 r2 = new com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager$1
            java.lang.Class<com.google.crypto.tink.StreamingAead> r3 = com.google.crypto.tink.StreamingAead.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static /* synthetic */ void access$000(com.google.crypto.tink.proto.AesCtrHmacStreamingParams r0) throws java.security.GeneralSecurityException {
            validateParams(r0)
            return
    }

    static /* synthetic */ com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat access$100(int r1, com.google.crypto.tink.proto.HashType r2, int r3, com.google.crypto.tink.proto.HashType r4, int r5, int r6) {
            com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat r0 = createKeyFormat(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate aes128CtrHmacSha2561MBTemplate() {
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA256
            r4 = 32
            r5 = 1048576(0x100000, float:1.469368E-39)
            r0 = 16
            r2 = 16
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate aes128CtrHmacSha2564KBTemplate() {
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA256
            r4 = 32
            r5 = 4096(0x1000, float:5.74E-42)
            r0 = 16
            r2 = 16
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate aes256CtrHmacSha2561MBTemplate() {
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA256
            r4 = 32
            r5 = 1048576(0x100000, float:1.469368E-39)
            r0 = 32
            r2 = 32
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate aes256CtrHmacSha2564KBTemplate() {
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA256
            r4 = 32
            r5 = 4096(0x1000, float:5.74E-42)
            r0 = 32
            r2 = 32
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1, r2, r3, r4, r5)
            return r0
    }

    private static com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat createKeyFormat(int r3, com.google.crypto.tink.proto.HashType r4, int r5, com.google.crypto.tink.proto.HashType r6, int r7, int r8) {
            com.google.crypto.tink.proto.HmacParams$Builder r0 = com.google.crypto.tink.proto.HmacParams.newBuilder()
            com.google.crypto.tink.proto.HmacParams$Builder r0 = r0.setHash(r6)
            com.google.crypto.tink.proto.HmacParams$Builder r0 = r0.setTagSize(r7)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.HmacParams r0 = (com.google.crypto.tink.proto.HmacParams) r0
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams$Builder r1 = com.google.crypto.tink.proto.AesCtrHmacStreamingParams.newBuilder()
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams$Builder r1 = r1.setCiphertextSegmentSize(r8)
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams$Builder r1 = r1.setDerivedKeySize(r5)
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams$Builder r1 = r1.setHkdfHashType(r4)
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams$Builder r1 = r1.setHmacParams(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams r1 = (com.google.crypto.tink.proto.AesCtrHmacStreamingParams) r1
            com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat$Builder r2 = com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat$Builder r2 = r2.setParams(r1)
            com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat$Builder r2 = r2.setKeySize(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat r2 = (com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat) r2
            return r2
    }

    private static com.google.crypto.tink.KeyTemplate createKeyTemplate(int r4, com.google.crypto.tink.proto.HashType r5, int r6, com.google.crypto.tink.proto.HashType r7, int r8, int r9) {
            com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat r0 = createKeyFormat(r4, r5, r6, r7, r8, r9)
            com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager r1 = new com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            byte[] r2 = r0.toByteArray()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r1 = com.google.crypto.tink.KeyTemplate.create(r1, r2, r3)
            return r1
    }

    public static void register(boolean r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager r0 = new com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager
            r0.<init>()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r1)
            return
    }

    private static void validateHmacParams(com.google.crypto.tink.proto.HmacParams r3) throws java.security.GeneralSecurityException {
            int r0 = r3.getTagSize()
            r1 = 10
            if (r0 < r1) goto L4e
            int[] r0 = com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType
            com.google.crypto.tink.proto.HashType r1 = r3.getHash()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            java.lang.String r1 = "tag size too big"
            switch(r0) {
                case 1: goto L3f;
                case 2: goto L30;
                case 3: goto L21;
                default: goto L19;
            }
        L19:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "unknown hash type"
            r0.<init>(r1)
            throw r0
        L21:
            int r0 = r3.getTagSize()
            r2 = 64
            if (r0 > r2) goto L2a
            goto L47
        L2a:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r1)
            throw r0
        L30:
            int r0 = r3.getTagSize()
            r2 = 32
            if (r0 > r2) goto L39
            goto L47
        L39:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r1)
            throw r0
        L3f:
            int r0 = r3.getTagSize()
            r2 = 20
            if (r0 > r2) goto L48
        L47:
            return
        L48:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r1)
            throw r0
        L4e:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "tag size too small"
            r0.<init>(r1)
            throw r0
    }

    private static void validateParams(com.google.crypto.tink.proto.AesCtrHmacStreamingParams r3) throws java.security.GeneralSecurityException {
            int r0 = r3.getDerivedKeySize()
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r0)
            com.google.crypto.tink.proto.HashType r0 = r3.getHkdfHashType()
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA1
            if (r0 == r1) goto L41
            com.google.crypto.tink.proto.HashType r0 = r3.getHkdfHashType()
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            if (r0 == r1) goto L41
            com.google.crypto.tink.proto.HashType r0 = r3.getHkdfHashType()
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512
            if (r0 != r1) goto L20
            goto L41
        L20:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid HKDF hash type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            com.google.crypto.tink.proto.HashType r2 = r3.getHkdfHashType()
            int r2 = r2.getNumber()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L41:
            com.google.crypto.tink.proto.HmacParams r0 = r3.getHmacParams()
            com.google.crypto.tink.proto.HashType r0 = r0.getHash()
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.UNKNOWN_HASH
            if (r0 == r1) goto L74
            com.google.crypto.tink.proto.HmacParams r0 = r3.getHmacParams()
            validateHmacParams(r0)
            int r0 = r3.getCiphertextSegmentSize()
            int r1 = r3.getDerivedKeySize()
            com.google.crypto.tink.proto.HmacParams r2 = r3.getHmacParams()
            int r2 = r2.getTagSize()
            int r1 = r1 + r2
            int r1 = r1 + 2
            int r1 = r1 + 7
            if (r0 < r1) goto L6c
            return
        L6c:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "ciphertext_segment_size must be at least (derived_key_size + tag_size + NONCE_PREFIX_IN_BYTES + 2)"
            r0.<init>(r1)
            throw r0
        L74:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "unknown HMAC hash type"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat, com.google.crypto.tink.proto.AesCtrHmacStreamingKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager$2 r0 = new com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat> r1 = com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat.class
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
    public com.google.crypto.tink.proto.AesCtrHmacStreamingKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.AesCtrHmacStreamingKey r0 = com.google.crypto.tink.proto.AesCtrHmacStreamingKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.AesCtrHmacStreamingKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.AesCtrHmacStreamingKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getKeyValue()
            int r0 = r0.size()
            r1 = 16
            if (r0 < r1) goto L39
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getKeyValue()
            int r0 = r0.size()
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams r1 = r3.getParams()
            int r1 = r1.getDerivedKeySize()
            if (r0 < r1) goto L31
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams r0 = r3.getParams()
            validateParams(r0)
            return
        L31:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "key_value must have at least as many bits as derived keys"
            r0.<init>(r1)
            throw r0
        L39:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "key_value must have at least 16 bytes"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.AesCtrHmacStreamingKey r1 = (com.google.crypto.tink.proto.AesCtrHmacStreamingKey) r1
            r0.validateKey(r1)
            return
    }
}
