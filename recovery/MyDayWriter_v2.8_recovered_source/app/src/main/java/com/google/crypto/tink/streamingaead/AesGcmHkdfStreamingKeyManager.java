package com.google.crypto.tink.streamingaead;

/* JADX INFO: loaded from: classes.dex */
public final class AesGcmHkdfStreamingKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.AesGcmHkdfStreamingKey> {
    private static final int NONCE_PREFIX_IN_BYTES = 7;
    private static final int TAG_SIZE_IN_BYTES = 16;



    AesGcmHkdfStreamingKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.AesGcmHkdfStreamingKey> r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager$1 r2 = new com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager$1
            java.lang.Class<com.google.crypto.tink.StreamingAead> r3 = com.google.crypto.tink.StreamingAead.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static /* synthetic */ void access$000(com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0) throws java.security.GeneralSecurityException {
            validateParams(r0)
            return
    }

    static /* synthetic */ com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat access$100(int r1, com.google.crypto.tink.proto.HashType r2, int r3, int r4) {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat r0 = createKeyFormat(r1, r2, r3, r4)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate aes128GcmHkdf1MBTemplate() {
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            r1 = 1048576(0x100000, float:1.469368E-39)
            r2 = 16
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r2, r0, r2, r1)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate aes128GcmHkdf4KBTemplate() {
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            r1 = 4096(0x1000, float:5.74E-42)
            r2 = 16
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r2, r0, r2, r1)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate aes256GcmHkdf1MBTemplate() {
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            r1 = 1048576(0x100000, float:1.469368E-39)
            r2 = 32
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r2, r0, r2, r1)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate aes256GcmHkdf4KBTemplate() {
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            r1 = 4096(0x1000, float:5.74E-42)
            r2 = 32
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r2, r0, r2, r1)
            return r0
    }

    private static com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat createKeyFormat(int r2, com.google.crypto.tink.proto.HashType r3, int r4, int r5) {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$Builder r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.newBuilder()
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$Builder r0 = r0.setCiphertextSegmentSize(r5)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$Builder r0 = r0.setDerivedKeySize(r4)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$Builder r0 = r0.setHkdfHashType(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
            com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat$Builder r1 = com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat$Builder r1 = r1.setKeySize(r2)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat$Builder r1 = r1.setParams(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat r1 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat) r1
            return r1
    }

    private static com.google.crypto.tink.KeyTemplate createKeyTemplate(int r4, com.google.crypto.tink.proto.HashType r5, int r6, int r7) {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat r0 = createKeyFormat(r4, r5, r6, r7)
            com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager r1 = new com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            byte[] r2 = r0.toByteArray()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r1 = com.google.crypto.tink.KeyTemplate.create(r1, r2, r3)
            return r1
    }

    public static void register(boolean r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager r0 = new com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager
            r0.<init>()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r1)
            return
    }

    private static void validateParams(com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r2) throws java.security.GeneralSecurityException {
            int r0 = r2.getDerivedKeySize()
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r0)
            com.google.crypto.tink.proto.HashType r0 = r2.getHkdfHashType()
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.UNKNOWN_HASH
            if (r0 == r1) goto L28
            int r0 = r2.getCiphertextSegmentSize()
            int r1 = r2.getDerivedKeySize()
            int r1 = r1 + 7
            int r1 = r1 + 16
            int r1 = r1 + 2
            if (r0 < r1) goto L20
            return
        L20:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "ciphertext_segment_size must be at least (derived_key_size + NONCE_PREFIX_IN_BYTES + TAG_SIZE_IN_BYTES + 2)"
            r0.<init>(r1)
            throw r0
        L28:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "unknown HKDF hash type"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat, com.google.crypto.tink.proto.AesGcmHkdfStreamingKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager$2 r0 = new com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat> r1 = com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat.class
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
    public com.google.crypto.tink.proto.AesGcmHkdfStreamingKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.AesGcmHkdfStreamingKey r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.AesGcmHkdfStreamingKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.AesGcmHkdfStreamingKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = r3.getParams()
            validateParams(r0)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.AesGcmHkdfStreamingKey r1 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingKey) r1
            r0.validateKey(r1)
            return
    }
}
