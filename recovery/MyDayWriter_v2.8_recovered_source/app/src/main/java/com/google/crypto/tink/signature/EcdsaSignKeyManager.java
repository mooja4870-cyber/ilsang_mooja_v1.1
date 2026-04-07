package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes.dex */
public final class EcdsaSignKeyManager extends com.google.crypto.tink.internal.PrivateKeyTypeManager<com.google.crypto.tink.proto.EcdsaPrivateKey, com.google.crypto.tink.proto.EcdsaPublicKey> {



    EcdsaSignKeyManager() {
            r5 = this;
            java.lang.Class<com.google.crypto.tink.proto.EcdsaPrivateKey> r0 = com.google.crypto.tink.proto.EcdsaPrivateKey.class
            java.lang.Class<com.google.crypto.tink.proto.EcdsaPublicKey> r1 = com.google.crypto.tink.proto.EcdsaPublicKey.class
            r2 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r2 = new com.google.crypto.tink.internal.PrimitiveFactory[r2]
            com.google.crypto.tink.signature.EcdsaSignKeyManager$1 r3 = new com.google.crypto.tink.signature.EcdsaSignKeyManager$1
            java.lang.Class<com.google.crypto.tink.PublicKeySign> r4 = com.google.crypto.tink.PublicKeySign.class
            r3.<init>(r4)
            r4 = 0
            r2[r4] = r3
            r5.<init>(r0, r1, r2)
            return
    }

    static /* synthetic */ com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat access$000(com.google.crypto.tink.proto.HashType r1, com.google.crypto.tink.proto.EllipticCurveType r2, com.google.crypto.tink.proto.EcdsaSignatureEncoding r3, com.google.crypto.tink.KeyTemplate.OutputPrefixType r4) {
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r0 = createKeyFormat(r1, r2, r3, r4)
            return r0
    }

    private static com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<com.google.crypto.tink.proto.EcdsaKeyFormat> createKeyFormat(com.google.crypto.tink.proto.HashType r3, com.google.crypto.tink.proto.EllipticCurveType r4, com.google.crypto.tink.proto.EcdsaSignatureEncoding r5, com.google.crypto.tink.KeyTemplate.OutputPrefixType r6) {
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = com.google.crypto.tink.proto.EcdsaParams.newBuilder()
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = r0.setHashType(r3)
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = r0.setCurve(r4)
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = r0.setEncoding(r5)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.EcdsaParams r0 = (com.google.crypto.tink.proto.EcdsaParams) r0
            com.google.crypto.tink.proto.EcdsaKeyFormat$Builder r1 = com.google.crypto.tink.proto.EcdsaKeyFormat.newBuilder()
            com.google.crypto.tink.proto.EcdsaKeyFormat$Builder r1 = r1.setParams(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EcdsaKeyFormat r1 = (com.google.crypto.tink.proto.EcdsaKeyFormat) r1
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r2 = new com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat
            r2.<init>(r1, r6)
            return r2
    }

    public static com.google.crypto.tink.KeyTemplate createKeyTemplate(com.google.crypto.tink.proto.HashType r4, com.google.crypto.tink.proto.EllipticCurveType r5, com.google.crypto.tink.proto.EcdsaSignatureEncoding r6, com.google.crypto.tink.KeyTemplate.OutputPrefixType r7) {
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = com.google.crypto.tink.proto.EcdsaParams.newBuilder()
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = r0.setHashType(r4)
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = r0.setCurve(r5)
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = r0.setEncoding(r6)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.EcdsaParams r0 = (com.google.crypto.tink.proto.EcdsaParams) r0
            com.google.crypto.tink.proto.EcdsaKeyFormat$Builder r1 = com.google.crypto.tink.proto.EcdsaKeyFormat.newBuilder()
            com.google.crypto.tink.proto.EcdsaKeyFormat$Builder r1 = r1.setParams(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EcdsaKeyFormat r1 = (com.google.crypto.tink.proto.EcdsaKeyFormat) r1
            com.google.crypto.tink.signature.EcdsaSignKeyManager r2 = new com.google.crypto.tink.signature.EcdsaSignKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            byte[] r3 = r1.toByteArray()
            com.google.crypto.tink.KeyTemplate r2 = com.google.crypto.tink.KeyTemplate.create(r2, r3, r7)
            return r2
    }

    public static final com.google.crypto.tink.KeyTemplate ecdsaP256Template() {
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1, r2, r3)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate rawEcdsaP256Template() {
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1, r2, r3)
            return r0
    }

    public static void registerPair(boolean r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.EcdsaSignKeyManager r0 = new com.google.crypto.tink.signature.EcdsaSignKeyManager
            r0.<init>()
            com.google.crypto.tink.signature.EcdsaVerifyKeyManager r1 = new com.google.crypto.tink.signature.EcdsaVerifyKeyManager
            r1.<init>()
            com.google.crypto.tink.Registry.registerAsymmetricKeyManagers(r0, r1, r2)
            com.google.crypto.tink.signature.EcdsaProtoSerialization.register()
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
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"
            return r0
    }

    public com.google.crypto.tink.proto.EcdsaPublicKey getPublicKey(com.google.crypto.tink.proto.EcdsaPrivateKey r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.proto.EcdsaPublicKey r0 = r2.getPublicKey()
            return r0
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getPublicKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.EcdsaPrivateKey r1 = (com.google.crypto.tink.proto.EcdsaPrivateKey) r1
            com.google.crypto.tink.proto.EcdsaPublicKey r1 = r0.getPublicKey(r1)
            return r1
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.EcdsaKeyFormat, com.google.crypto.tink.proto.EcdsaPrivateKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.signature.EcdsaSignKeyManager$2 r0 = new com.google.crypto.tink.signature.EcdsaSignKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.EcdsaKeyFormat> r1 = com.google.crypto.tink.proto.EcdsaKeyFormat.class
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType() {
            r1 = this;
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.EcdsaPrivateKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.EcdsaPrivateKey r0 = com.google.crypto.tink.proto.EcdsaPrivateKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.EcdsaPrivateKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.EcdsaPrivateKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.proto.EcdsaPublicKey r0 = r3.getPublicKey()
            com.google.crypto.tink.proto.EcdsaParams r0 = r0.getParams()
            com.google.crypto.tink.signature.internal.SigUtil.validateEcdsaParams(r0)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.EcdsaPrivateKey r1 = (com.google.crypto.tink.proto.EcdsaPrivateKey) r1
            r0.validateKey(r1)
            return
    }
}
