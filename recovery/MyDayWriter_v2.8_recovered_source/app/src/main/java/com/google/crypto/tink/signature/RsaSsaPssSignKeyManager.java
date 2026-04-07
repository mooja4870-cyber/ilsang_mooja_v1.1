package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes.dex */
public final class RsaSsaPssSignKeyManager extends com.google.crypto.tink.internal.PrivateKeyTypeManager<com.google.crypto.tink.proto.RsaSsaPssPrivateKey, com.google.crypto.tink.proto.RsaSsaPssPublicKey> {



    RsaSsaPssSignKeyManager() {
            r5 = this;
            java.lang.Class<com.google.crypto.tink.proto.RsaSsaPssPrivateKey> r0 = com.google.crypto.tink.proto.RsaSsaPssPrivateKey.class
            java.lang.Class<com.google.crypto.tink.proto.RsaSsaPssPublicKey> r1 = com.google.crypto.tink.proto.RsaSsaPssPublicKey.class
            r2 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r2 = new com.google.crypto.tink.internal.PrimitiveFactory[r2]
            com.google.crypto.tink.signature.RsaSsaPssSignKeyManager$1 r3 = new com.google.crypto.tink.signature.RsaSsaPssSignKeyManager$1
            java.lang.Class<com.google.crypto.tink.PublicKeySign> r4 = com.google.crypto.tink.PublicKeySign.class
            r3.<init>(r4)
            r4 = 0
            r2[r4] = r3
            r5.<init>(r0, r1, r2)
            return
    }

    static /* synthetic */ com.google.crypto.tink.proto.RsaSsaPssKeyFormat access$000(com.google.crypto.tink.proto.HashType r1, com.google.crypto.tink.proto.HashType r2, int r3, int r4, java.math.BigInteger r5) {
            com.google.crypto.tink.proto.RsaSsaPssKeyFormat r0 = createKeyFormat(r1, r2, r3, r4, r5)
            return r0
    }

    private static com.google.crypto.tink.proto.RsaSsaPssKeyFormat createKeyFormat(com.google.crypto.tink.proto.HashType r3, com.google.crypto.tink.proto.HashType r4, int r5, int r6, java.math.BigInteger r7) {
            com.google.crypto.tink.proto.RsaSsaPssParams$Builder r0 = com.google.crypto.tink.proto.RsaSsaPssParams.newBuilder()
            com.google.crypto.tink.proto.RsaSsaPssParams$Builder r0 = r0.setSigHash(r3)
            com.google.crypto.tink.proto.RsaSsaPssParams$Builder r0 = r0.setMgf1Hash(r4)
            com.google.crypto.tink.proto.RsaSsaPssParams$Builder r0 = r0.setSaltLength(r5)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.RsaSsaPssParams r0 = (com.google.crypto.tink.proto.RsaSsaPssParams) r0
            com.google.crypto.tink.proto.RsaSsaPssKeyFormat$Builder r1 = com.google.crypto.tink.proto.RsaSsaPssKeyFormat.newBuilder()
            com.google.crypto.tink.proto.RsaSsaPssKeyFormat$Builder r1 = r1.setParams(r0)
            com.google.crypto.tink.proto.RsaSsaPssKeyFormat$Builder r1 = r1.setModulusSizeInBits(r6)
            byte[] r2 = r7.toByteArray()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2)
            com.google.crypto.tink.proto.RsaSsaPssKeyFormat$Builder r1 = r1.setPublicExponent(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.RsaSsaPssKeyFormat r1 = (com.google.crypto.tink.proto.RsaSsaPssKeyFormat) r1
            return r1
    }

    private static com.google.crypto.tink.KeyTemplate createKeyTemplate(com.google.crypto.tink.proto.HashType r3, com.google.crypto.tink.proto.HashType r4, int r5, int r6, java.math.BigInteger r7, com.google.crypto.tink.KeyTemplate.OutputPrefixType r8) {
            com.google.crypto.tink.proto.RsaSsaPssKeyFormat r0 = createKeyFormat(r3, r4, r5, r6, r7)
            com.google.crypto.tink.signature.RsaSsaPssSignKeyManager r1 = new com.google.crypto.tink.signature.RsaSsaPssSignKeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            byte[] r2 = r0.toByteArray()
            com.google.crypto.tink.KeyTemplate r1 = com.google.crypto.tink.KeyTemplate.create(r1, r2, r8)
            return r1
    }

    public static final com.google.crypto.tink.KeyTemplate rawRsa3072PssSha256F4Template() {
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            java.math.BigInteger r4 = java.security.spec.RSAKeyGenParameterSpec.F4
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r5 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            r2 = 32
            r3 = 3072(0xc00, float:4.305E-42)
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate rawRsa4096PssSha512F4Template() {
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA512
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512
            java.math.BigInteger r4 = java.security.spec.RSAKeyGenParameterSpec.F4
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r5 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            r2 = 64
            r3 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static void registerPair(boolean r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.RsaSsaPssSignKeyManager r0 = new com.google.crypto.tink.signature.RsaSsaPssSignKeyManager
            r0.<init>()
            com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager r1 = new com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager
            r1.<init>()
            com.google.crypto.tink.Registry.registerAsymmetricKeyManagers(r0, r1, r2)
            return
    }

    public static final com.google.crypto.tink.KeyTemplate rsa3072PssSha256F4Template() {
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            java.math.BigInteger r4 = java.security.spec.RSAKeyGenParameterSpec.F4
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r5 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            r2 = 32
            r3 = 3072(0xc00, float:4.305E-42)
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate rsa4096PssSha512F4Template() {
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA512
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512
            java.math.BigInteger r4 = java.security.spec.RSAKeyGenParameterSpec.F4
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r5 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            r2 = 64
            r3 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"
            return r0
    }

    public com.google.crypto.tink.proto.RsaSsaPssPublicKey getPublicKey(com.google.crypto.tink.proto.RsaSsaPssPrivateKey r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.proto.RsaSsaPssPublicKey r0 = r2.getPublicKey()
            return r0
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getPublicKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.RsaSsaPssPrivateKey r1 = (com.google.crypto.tink.proto.RsaSsaPssPrivateKey) r1
            com.google.crypto.tink.proto.RsaSsaPssPublicKey r1 = r0.getPublicKey(r1)
            return r1
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.RsaSsaPssKeyFormat, com.google.crypto.tink.proto.RsaSsaPssPrivateKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.signature.RsaSsaPssSignKeyManager$2 r0 = new com.google.crypto.tink.signature.RsaSsaPssSignKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.RsaSsaPssKeyFormat> r1 = com.google.crypto.tink.proto.RsaSsaPssKeyFormat.class
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
    public com.google.crypto.tink.proto.RsaSsaPssPrivateKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.RsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.RsaSsaPssPrivateKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.RsaSsaPssPrivateKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.RsaSsaPssPrivateKey r4) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.getVersion()
            int r1 = r3.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            java.math.BigInteger r0 = new java.math.BigInteger
            com.google.crypto.tink.proto.RsaSsaPssPublicKey r1 = r4.getPublicKey()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.getN()
            byte[] r1 = r1.toByteArray()
            r2 = 1
            r0.<init>(r2, r1)
            int r0 = r0.bitLength()
            com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            com.google.crypto.tink.proto.RsaSsaPssPublicKey r1 = r4.getPublicKey()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.getE()
            byte[] r1 = r1.toByteArray()
            r0.<init>(r2, r1)
            com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(r0)
            com.google.crypto.tink.proto.RsaSsaPssPublicKey r0 = r4.getPublicKey()
            com.google.crypto.tink.proto.RsaSsaPssParams r0 = r0.getParams()
            com.google.crypto.tink.signature.internal.SigUtil.validateRsaSsaPssParams(r0)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.RsaSsaPssPrivateKey r1 = (com.google.crypto.tink.proto.RsaSsaPssPrivateKey) r1
            r0.validateKey(r1)
            return
    }
}
