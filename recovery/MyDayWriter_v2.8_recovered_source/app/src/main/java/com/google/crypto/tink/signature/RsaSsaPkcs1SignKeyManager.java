package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes.dex */
public final class RsaSsaPkcs1SignKeyManager extends com.google.crypto.tink.internal.PrivateKeyTypeManager<com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey, com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey> {



    RsaSsaPkcs1SignKeyManager() {
            r5 = this;
            java.lang.Class<com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey> r0 = com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey.class
            java.lang.Class<com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey> r1 = com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey.class
            r2 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r2 = new com.google.crypto.tink.internal.PrimitiveFactory[r2]
            com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager$1 r3 = new com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager$1
            java.lang.Class<com.google.crypto.tink.PublicKeySign> r4 = com.google.crypto.tink.PublicKeySign.class
            r3.<init>(r4)
            r4 = 0
            r2[r4] = r3
            r5.<init>(r0, r1, r2)
            return
    }

    static /* synthetic */ com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat access$000(com.google.crypto.tink.proto.HashType r1, int r2, java.math.BigInteger r3) {
            com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat r0 = createKeyFormat(r1, r2, r3)
            return r0
    }

    private static com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat createKeyFormat(com.google.crypto.tink.proto.HashType r3, int r4, java.math.BigInteger r5) {
            com.google.crypto.tink.proto.RsaSsaPkcs1Params$Builder r0 = com.google.crypto.tink.proto.RsaSsaPkcs1Params.newBuilder()
            com.google.crypto.tink.proto.RsaSsaPkcs1Params$Builder r0 = r0.setHashType(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.RsaSsaPkcs1Params r0 = (com.google.crypto.tink.proto.RsaSsaPkcs1Params) r0
            com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat$Builder r1 = com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat.newBuilder()
            com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat$Builder r1 = r1.setParams(r0)
            com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat$Builder r1 = r1.setModulusSizeInBits(r4)
            byte[] r2 = r5.toByteArray()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2)
            com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat$Builder r1 = r1.setPublicExponent(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat r1 = (com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat) r1
            return r1
    }

    private static com.google.crypto.tink.KeyTemplate createKeyTemplate(com.google.crypto.tink.proto.HashType r3, int r4, java.math.BigInteger r5, com.google.crypto.tink.KeyTemplate.OutputPrefixType r6) {
            com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat r0 = createKeyFormat(r3, r4, r5)
            com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager r1 = new com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            byte[] r2 = r0.toByteArray()
            com.google.crypto.tink.KeyTemplate r1 = com.google.crypto.tink.KeyTemplate.create(r1, r2, r6)
            return r1
    }

    public static final com.google.crypto.tink.KeyTemplate rawRsa3072SsaPkcs1Sha256F4Template() {
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            java.math.BigInteger r1 = java.security.spec.RSAKeyGenParameterSpec.F4
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            r3 = 3072(0xc00, float:4.305E-42)
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r3, r1, r2)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate rawRsa4096SsaPkcs1Sha512F4Template() {
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA512
            java.math.BigInteger r1 = java.security.spec.RSAKeyGenParameterSpec.F4
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            r3 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r3, r1, r2)
            return r0
    }

    public static void registerPair(boolean r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager r0 = new com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager
            r0.<init>()
            com.google.crypto.tink.signature.RsaSsaPkcs1VerifyKeyManager r1 = new com.google.crypto.tink.signature.RsaSsaPkcs1VerifyKeyManager
            r1.<init>()
            com.google.crypto.tink.Registry.registerAsymmetricKeyManagers(r0, r1, r2)
            return
    }

    public static final com.google.crypto.tink.KeyTemplate rsa3072SsaPkcs1Sha256F4Template() {
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            java.math.BigInteger r1 = java.security.spec.RSAKeyGenParameterSpec.F4
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            r3 = 3072(0xc00, float:4.305E-42)
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r3, r1, r2)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate rsa4096SsaPkcs1Sha512F4Template() {
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA512
            java.math.BigInteger r1 = java.security.spec.RSAKeyGenParameterSpec.F4
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            r3 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r3, r1, r2)
            return r0
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
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"
            return r0
    }

    public com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey getPublicKey(com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey r0 = r2.getPublicKey()
            return r0
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getPublicKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey r1 = (com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey) r1
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey r1 = r0.getPublicKey(r1)
            return r1
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat, com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager$2 r0 = new com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat> r1 = com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat.class
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
    public com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey r0 = com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey r4) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.getVersion()
            int r1 = r3.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            java.math.BigInteger r0 = new java.math.BigInteger
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey r1 = r4.getPublicKey()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.getN()
            byte[] r1 = r1.toByteArray()
            r2 = 1
            r0.<init>(r2, r1)
            int r0 = r0.bitLength()
            com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey r1 = r4.getPublicKey()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.getE()
            byte[] r1 = r1.toByteArray()
            r0.<init>(r2, r1)
            com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(r0)
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey r0 = r4.getPublicKey()
            com.google.crypto.tink.proto.RsaSsaPkcs1Params r0 = r0.getParams()
            com.google.crypto.tink.signature.internal.SigUtil.validateRsaSsaPkcs1Params(r0)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey r1 = (com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey) r1
            r0.validateKey(r1)
            return
    }
}
