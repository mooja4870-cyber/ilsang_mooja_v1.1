package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes.dex */
public final class AesCtrHmacAeadKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.AesCtrHmacAeadKey> {



    AesCtrHmacAeadKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.AesCtrHmacAeadKey> r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager$1 r2 = new com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager$1
            java.lang.Class<com.google.crypto.tink.Aead> r3 = com.google.crypto.tink.Aead.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static /* synthetic */ com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat access$000(int r1, int r2, int r3, int r4, com.google.crypto.tink.proto.HashType r5, com.google.crypto.tink.KeyTemplate.OutputPrefixType r6) {
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r0 = createKeyFormat(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate aes128CtrHmacSha256Template() {
            r0 = 32
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            r2 = 16
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r2, r2, r0, r2, r1)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate aes256CtrHmacSha256Template() {
            r0 = 16
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            r2 = 32
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r2, r0, r2, r2, r1)
            return r0
    }

    private static com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat> createKeyFormat(int r2, int r3, int r4, int r5, com.google.crypto.tink.proto.HashType r6, com.google.crypto.tink.KeyTemplate.OutputPrefixType r7) {
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r0 = new com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r1 = createKeyFormat(r2, r3, r4, r5, r6)
            r0.<init>(r1, r7)
            return r0
    }

    private static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat createKeyFormat(int r3, int r4, int r5, int r6, com.google.crypto.tink.proto.HashType r7) {
            com.google.crypto.tink.proto.AesCtrKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesCtrKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesCtrParams$Builder r1 = com.google.crypto.tink.proto.AesCtrParams.newBuilder()
            com.google.crypto.tink.proto.AesCtrParams$Builder r1 = r1.setIvSize(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesCtrParams r1 = (com.google.crypto.tink.proto.AesCtrParams) r1
            com.google.crypto.tink.proto.AesCtrKeyFormat$Builder r0 = r0.setParams(r1)
            com.google.crypto.tink.proto.AesCtrKeyFormat$Builder r0 = r0.setKeySize(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesCtrKeyFormat r0 = (com.google.crypto.tink.proto.AesCtrKeyFormat) r0
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r1 = com.google.crypto.tink.proto.HmacKeyFormat.newBuilder()
            com.google.crypto.tink.proto.HmacParams$Builder r2 = com.google.crypto.tink.proto.HmacParams.newBuilder()
            com.google.crypto.tink.proto.HmacParams$Builder r2 = r2.setHash(r7)
            com.google.crypto.tink.proto.HmacParams$Builder r2 = r2.setTagSize(r6)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.HmacParams r2 = (com.google.crypto.tink.proto.HmacParams) r2
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r1 = r1.setParams(r2)
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r1 = r1.setKeySize(r5)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.HmacKeyFormat r1 = (com.google.crypto.tink.proto.HmacKeyFormat) r1
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat$Builder r2 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat$Builder r2 = r2.setAesCtrKeyFormat(r0)
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat$Builder r2 = r2.setHmacKeyFormat(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r2 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r2
            return r2
    }

    private static com.google.crypto.tink.KeyTemplate createKeyTemplate(int r4, int r5, int r6, int r7, com.google.crypto.tink.proto.HashType r8) {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = createKeyFormat(r4, r5, r6, r7, r8)
            com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager r1 = new com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            byte[] r2 = r0.toByteArray()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            com.google.crypto.tink.KeyTemplate r1 = com.google.crypto.tink.KeyTemplate.create(r1, r2, r3)
            return r1
    }

    public static void register(boolean r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager r0 = new com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager
            r0.<init>()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r1)
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
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat, com.google.crypto.tink.proto.AesCtrHmacAeadKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager$2 r0 = new com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat> r1 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.class
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
    public com.google.crypto.tink.proto.AesCtrHmacAeadKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.AesCtrHmacAeadKey r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.AesCtrHmacAeadKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.AesCtrHmacAeadKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.aead.AesCtrKeyManager r0 = new com.google.crypto.tink.aead.AesCtrKeyManager
            r0.<init>()
            com.google.crypto.tink.proto.AesCtrKey r1 = r3.getAesCtrKey()
            r0.validateKey(r1)
            com.google.crypto.tink.mac.HmacKeyManager r0 = new com.google.crypto.tink.mac.HmacKeyManager
            r0.<init>()
            com.google.crypto.tink.proto.HmacKey r1 = r3.getHmacKey()
            r0.validateKey(r1)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.AesCtrHmacAeadKey r1 = (com.google.crypto.tink.proto.AesCtrHmacAeadKey) r1
            r0.validateKey(r1)
            return
    }
}
