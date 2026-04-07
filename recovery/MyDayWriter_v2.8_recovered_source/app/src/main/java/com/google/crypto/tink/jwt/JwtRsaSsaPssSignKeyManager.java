package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
public final class JwtRsaSsaPssSignKeyManager extends com.google.crypto.tink.internal.PrivateKeyTypeManager<com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey, com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey> {


    private static class JwtPublicKeySignFactory extends com.google.crypto.tink.internal.PrimitiveFactory<com.google.crypto.tink.jwt.JwtPublicKeySignInternal, com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey> {


        public JwtPublicKeySignFactory() {
                r1 = this;
                java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> r0 = com.google.crypto.tink.jwt.JwtPublicKeySignInternal.class
                r1.<init>(r0)
                return
        }

        public com.google.crypto.tink.jwt.JwtPublicKeySignInternal getPrimitive(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r9) throws java.security.GeneralSecurityException {
                r8 = this;
                java.security.interfaces.RSAPrivateCrtKey r0 = com.google.crypto.tink.jwt.JwtRsaSsaPssSignKeyManager.access$000(r9)
                com.google.crypto.tink.jwt.JwtRsaSsaPssSignKeyManager.access$100(r0, r9)
                com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r1 = r9.getPublicKey()
                com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r1 = r1.getAlgorithm()
                com.google.crypto.tink.subtle.Enums$HashType r2 = com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager.hashForPssAlgorithm(r1)
                int r3 = com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager.saltLengthForPssAlgorithm(r1)
                com.google.crypto.tink.subtle.RsaSsaPssSignJce r4 = new com.google.crypto.tink.subtle.RsaSsaPssSignJce
                r4.<init>(r0, r2, r2, r3)
                java.lang.String r5 = r1.name()
                com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r6 = r9.getPublicKey()
                boolean r6 = r6.hasCustomKid()
                if (r6 == 0) goto L3b
                com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r6 = r9.getPublicKey()
                com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$CustomKid r6 = r6.getCustomKid()
                java.lang.String r6 = r6.getValue()
                java.util.Optional r6 = java.util.Optional.of(r6)
                goto L3f
            L3b:
                java.util.Optional r6 = java.util.Optional.empty()
            L3f:
                com.google.crypto.tink.jwt.JwtRsaSsaPssSignKeyManager$JwtPublicKeySignFactory$1 r7 = new com.google.crypto.tink.jwt.JwtRsaSsaPssSignKeyManager$JwtPublicKeySignFactory$1
                r7.<init>(r8, r6, r5, r4)
                return r7
        }

        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public /* bridge */ /* synthetic */ com.google.crypto.tink.jwt.JwtPublicKeySignInternal getPrimitive(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
                r0 = this;
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r1
                com.google.crypto.tink.jwt.JwtPublicKeySignInternal r1 = r0.getPrimitive(r1)
                return r1
        }
    }

    JwtRsaSsaPssSignKeyManager() {
            r5 = this;
            java.lang.Class<com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey> r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.class
            java.lang.Class<com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey> r1 = com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.class
            r2 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r2 = new com.google.crypto.tink.internal.PrimitiveFactory[r2]
            com.google.crypto.tink.jwt.JwtRsaSsaPssSignKeyManager$JwtPublicKeySignFactory r3 = new com.google.crypto.tink.jwt.JwtRsaSsaPssSignKeyManager$JwtPublicKeySignFactory
            r3.<init>()
            r4 = 0
            r2[r4] = r3
            r5.<init>(r0, r1, r2)
            return
    }

    static /* synthetic */ java.security.interfaces.RSAPrivateCrtKey access$000(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1) throws java.security.GeneralSecurityException {
            java.security.interfaces.RSAPrivateCrtKey r0 = createPrivateKey(r1)
            return r0
    }

    static /* synthetic */ void access$100(java.security.interfaces.RSAPrivateCrtKey r0, com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1) throws java.security.GeneralSecurityException {
            selfTestKey(r0, r1)
            return
    }

    static /* synthetic */ com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat access$200(com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r1, int r2, java.math.BigInteger r3, com.google.crypto.tink.KeyTemplate.OutputPrefixType r4) {
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r0 = createKeyFormat(r1, r2, r3, r4)
            return r0
    }

    private static com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormat> createKeyFormat(com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r2, int r3, java.math.BigInteger r4, com.google.crypto.tink.KeyTemplate.OutputPrefixType r5) {
            com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormat$Builder r0 = com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormat.newBuilder()
            com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormat$Builder r0 = r0.setAlgorithm(r2)
            com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormat$Builder r0 = r0.setModulusSizeInBits(r3)
            byte[] r1 = r4.toByteArray()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormat$Builder r0 = r0.setPublicExponent(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormat) r0
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r1 = new com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat
            r1.<init>(r0, r5)
            return r1
    }

    private static final java.security.interfaces.RSAPrivateCrtKey createPrivateKey(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r12) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r0 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r1 = "RSA"
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.KeyFactory r0 = (java.security.KeyFactory) r0
            java.security.spec.RSAPrivateCrtKeySpec r1 = new java.security.spec.RSAPrivateCrtKeySpec
            java.math.BigInteger r2 = new java.math.BigInteger
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r3 = r12.getPublicKey()
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r3.getN()
            byte[] r3 = r3.toByteArray()
            r4 = 1
            r2.<init>(r4, r3)
            java.math.BigInteger r3 = new java.math.BigInteger
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r5 = r12.getPublicKey()
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = r5.getE()
            byte[] r5 = r5.toByteArray()
            r3.<init>(r4, r5)
            r5 = r4
            java.math.BigInteger r4 = new java.math.BigInteger
            com.google.crypto.tink.shaded.protobuf.ByteString r6 = r12.getD()
            byte[] r6 = r6.toByteArray()
            r4.<init>(r5, r6)
            r6 = r5
            java.math.BigInteger r5 = new java.math.BigInteger
            com.google.crypto.tink.shaded.protobuf.ByteString r7 = r12.getP()
            byte[] r7 = r7.toByteArray()
            r5.<init>(r6, r7)
            r7 = r6
            java.math.BigInteger r6 = new java.math.BigInteger
            com.google.crypto.tink.shaded.protobuf.ByteString r8 = r12.getQ()
            byte[] r8 = r8.toByteArray()
            r6.<init>(r7, r8)
            r8 = r7
            java.math.BigInteger r7 = new java.math.BigInteger
            com.google.crypto.tink.shaded.protobuf.ByteString r9 = r12.getDp()
            byte[] r9 = r9.toByteArray()
            r7.<init>(r8, r9)
            r9 = r8
            java.math.BigInteger r8 = new java.math.BigInteger
            com.google.crypto.tink.shaded.protobuf.ByteString r10 = r12.getDq()
            byte[] r10 = r10.toByteArray()
            r8.<init>(r9, r10)
            r10 = r9
            java.math.BigInteger r9 = new java.math.BigInteger
            com.google.crypto.tink.shaded.protobuf.ByteString r11 = r12.getCrt()
            byte[] r11 = r11.toByteArray()
            r9.<init>(r10, r11)
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.security.PrivateKey r1 = r0.generatePrivate(r1)
            java.security.interfaces.RSAPrivateCrtKey r1 = (java.security.interfaces.RSAPrivateCrtKey) r1
            return r1
    }

    public static void registerPair(boolean r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.jwt.JwtRsaSsaPssSignKeyManager r0 = new com.google.crypto.tink.jwt.JwtRsaSsaPssSignKeyManager
            r0.<init>()
            com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager r1 = new com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager
            r1.<init>()
            com.google.crypto.tink.Registry.registerAsymmetricKeyManagers(r0, r1, r2)
            return
    }

    private static final void selfTestKey(java.security.interfaces.RSAPrivateCrtKey r6, com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r7) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r0 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r1 = "RSA"
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.KeyFactory r0 = (java.security.KeyFactory) r0
            java.security.spec.RSAPublicKeySpec r1 = new java.security.spec.RSAPublicKeySpec
            java.math.BigInteger r2 = new java.math.BigInteger
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r3 = r7.getPublicKey()
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r3.getN()
            byte[] r3 = r3.toByteArray()
            r4 = 1
            r2.<init>(r4, r3)
            java.math.BigInteger r3 = new java.math.BigInteger
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r5 = r7.getPublicKey()
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = r5.getE()
            byte[] r5 = r5.toByteArray()
            r3.<init>(r4, r5)
            r1.<init>(r2, r3)
            java.security.PublicKey r1 = r0.generatePublic(r1)
            java.security.interfaces.RSAPublicKey r1 = (java.security.interfaces.RSAPublicKey) r1
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r2 = r7.getPublicKey()
            com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r2 = r2.getAlgorithm()
            com.google.crypto.tink.subtle.Enums$HashType r3 = com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager.hashForPssAlgorithm(r2)
            int r4 = com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager.saltLengthForPssAlgorithm(r2)
            com.google.crypto.tink.subtle.SelfKeyTestValidators.validateRsaSsaPss(r6, r1, r3, r3, r4)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPrivateKey"
            return r0
    }

    public com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey getPublicKey(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r2) {
            r1 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r0 = r2.getPublicKey()
            return r0
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getPublicKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r1
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r1 = r0.getPublicKey(r1)
            return r1
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormat, com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.jwt.JwtRsaSsaPssSignKeyManager$1 r0 = new com.google.crypto.tink.jwt.JwtRsaSsaPssSignKeyManager$1
            java.lang.Class<com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormat> r1 = com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormat.class
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
    public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r4) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.getVersion()
            int r1 = r3.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            java.math.BigInteger r0 = new java.math.BigInteger
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r1 = r4.getPublicKey()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.getN()
            byte[] r1 = r1.toByteArray()
            r2 = 1
            r0.<init>(r2, r1)
            int r0 = r0.bitLength()
            com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r1 = r4.getPublicKey()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.getE()
            byte[] r1 = r1.toByteArray()
            r0.<init>(r2, r1)
            com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(r0)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r1
            r0.validateKey(r1)
            return
    }
}
