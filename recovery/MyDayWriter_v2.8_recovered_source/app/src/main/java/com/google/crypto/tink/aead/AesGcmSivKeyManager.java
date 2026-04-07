package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes.dex */
public final class AesGcmSivKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.AesGcmSivKey> {



    AesGcmSivKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.AesGcmSivKey> r0 = com.google.crypto.tink.proto.AesGcmSivKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.aead.AesGcmSivKeyManager$1 r2 = new com.google.crypto.tink.aead.AesGcmSivKeyManager$1
            java.lang.Class<com.google.crypto.tink.Aead> r3 = com.google.crypto.tink.Aead.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static /* synthetic */ com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat access$000(int r1, com.google.crypto.tink.KeyTemplate.OutputPrefixType r2) {
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r0 = createKeyFormat(r1, r2)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate aes128GcmSivTemplate() {
            r0 = 16
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate aes256GcmSivTemplate() {
            r0 = 32
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1)
            return r0
    }

    private static boolean canUseAesGcmSive() {
            java.lang.String r0 = "AES/GCM-SIV/NoPadding"
            javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Throwable -> L7
            r0 = 1
            return r0
        L7:
            r0 = move-exception
            r1 = 0
            return r1
    }

    private static com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<com.google.crypto.tink.proto.AesGcmSivKeyFormat> createKeyFormat(int r2, com.google.crypto.tink.KeyTemplate.OutputPrefixType r3) {
            com.google.crypto.tink.proto.AesGcmSivKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesGcmSivKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesGcmSivKeyFormat$Builder r0 = r0.setKeySize(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesGcmSivKeyFormat r0 = (com.google.crypto.tink.proto.AesGcmSivKeyFormat) r0
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r1 = new com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat
            r1.<init>(r0, r3)
            return r1
    }

    private static com.google.crypto.tink.KeyTemplate createKeyTemplate(int r3, com.google.crypto.tink.KeyTemplate.OutputPrefixType r4) {
            com.google.crypto.tink.proto.AesGcmSivKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesGcmSivKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesGcmSivKeyFormat$Builder r0 = r0.setKeySize(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesGcmSivKeyFormat r0 = (com.google.crypto.tink.proto.AesGcmSivKeyFormat) r0
            com.google.crypto.tink.aead.AesGcmSivKeyManager r1 = new com.google.crypto.tink.aead.AesGcmSivKeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            byte[] r2 = r0.toByteArray()
            com.google.crypto.tink.KeyTemplate r1 = com.google.crypto.tink.KeyTemplate.create(r1, r2, r4)
            return r1
    }

    public static final com.google.crypto.tink.KeyTemplate rawAes128GcmSivTemplate() {
            r0 = 16
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate rawAes256GcmSivTemplate() {
            r0 = 32
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1)
            return r0
    }

    public static void register(boolean r1) throws java.security.GeneralSecurityException {
            boolean r0 = canUseAesGcmSive()
            if (r0 == 0) goto L11
            com.google.crypto.tink.aead.AesGcmSivKeyManager r0 = new com.google.crypto.tink.aead.AesGcmSivKeyManager
            r0.<init>()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r1)
            com.google.crypto.tink.aead.AesGcmSivProtoSerialization.register()
        L11:
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesGcmSivKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.AesGcmSivKeyFormat, com.google.crypto.tink.proto.AesGcmSivKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.aead.AesGcmSivKeyManager$2 r0 = new com.google.crypto.tink.aead.AesGcmSivKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.AesGcmSivKeyFormat> r1 = com.google.crypto.tink.proto.AesGcmSivKeyFormat.class
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
    public com.google.crypto.tink.proto.AesGcmSivKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.AesGcmSivKey r0 = com.google.crypto.tink.proto.AesGcmSivKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.AesGcmSivKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.AesGcmSivKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getKeyValue()
            int r0 = r0.size()
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r0)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.AesGcmSivKey r1 = (com.google.crypto.tink.proto.AesGcmSivKey) r1
            r0.validateKey(r1)
            return
    }
}
