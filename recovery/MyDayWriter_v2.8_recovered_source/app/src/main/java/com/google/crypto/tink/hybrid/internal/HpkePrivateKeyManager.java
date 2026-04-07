package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
public final class HpkePrivateKeyManager extends com.google.crypto.tink.internal.PrivateKeyTypeManager<com.google.crypto.tink.proto.HpkePrivateKey, com.google.crypto.tink.proto.HpkePublicKey> {



    /* JADX INFO: renamed from: com.google.crypto.tink.hybrid.internal.HpkePrivateKeyManager$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HpkeKem = null;

        static {
                com.google.crypto.tink.proto.HpkeKem[] r0 = com.google.crypto.tink.proto.HpkeKem.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.hybrid.internal.HpkePrivateKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HpkeKem = r0
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkePrivateKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_X25519_HKDF_SHA256     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkePrivateKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P256_HKDF_SHA256     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkePrivateKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P384_HKDF_SHA384     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkePrivateKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P521_HKDF_SHA512     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                return
        }
    }

    public HpkePrivateKeyManager() {
            r5 = this;
            java.lang.Class<com.google.crypto.tink.proto.HpkePrivateKey> r0 = com.google.crypto.tink.proto.HpkePrivateKey.class
            java.lang.Class<com.google.crypto.tink.proto.HpkePublicKey> r1 = com.google.crypto.tink.proto.HpkePublicKey.class
            r2 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r2 = new com.google.crypto.tink.internal.PrimitiveFactory[r2]
            com.google.crypto.tink.hybrid.internal.HpkePrivateKeyManager$1 r3 = new com.google.crypto.tink.hybrid.internal.HpkePrivateKeyManager$1
            java.lang.Class<com.google.crypto.tink.HybridDecrypt> r4 = com.google.crypto.tink.HybridDecrypt.class
            r3.<init>(r4)
            r4 = 0
            r2[r4] = r3
            r5.<init>(r0, r1, r2)
            return
    }

    static /* synthetic */ com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat access$000(com.google.crypto.tink.proto.HpkeKem r1, com.google.crypto.tink.proto.HpkeKdf r2, com.google.crypto.tink.proto.HpkeAead r3, com.google.crypto.tink.KeyTemplate.OutputPrefixType r4) {
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r0 = createKeyFormat(r1, r2, r3, r4)
            return r0
    }

    private static com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<com.google.crypto.tink.proto.HpkeKeyFormat> createKeyFormat(com.google.crypto.tink.proto.HpkeKem r3, com.google.crypto.tink.proto.HpkeKdf r4, com.google.crypto.tink.proto.HpkeAead r5, com.google.crypto.tink.KeyTemplate.OutputPrefixType r6) {
            com.google.crypto.tink.proto.HpkeParams$Builder r0 = com.google.crypto.tink.proto.HpkeParams.newBuilder()
            com.google.crypto.tink.proto.HpkeParams$Builder r0 = r0.setKem(r3)
            com.google.crypto.tink.proto.HpkeParams$Builder r0 = r0.setKdf(r4)
            com.google.crypto.tink.proto.HpkeParams$Builder r0 = r0.setAead(r5)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.HpkeParams r0 = (com.google.crypto.tink.proto.HpkeParams) r0
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r1 = new com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat
            com.google.crypto.tink.proto.HpkeKeyFormat$Builder r2 = com.google.crypto.tink.proto.HpkeKeyFormat.newBuilder()
            com.google.crypto.tink.proto.HpkeKeyFormat$Builder r2 = r2.setParams(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.HpkeKeyFormat r2 = (com.google.crypto.tink.proto.HpkeKeyFormat) r2
            r1.<init>(r2, r6)
            return r1
    }

    public static void registerPair(boolean r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.hybrid.internal.HpkePrivateKeyManager r0 = new com.google.crypto.tink.hybrid.internal.HpkePrivateKeyManager
            r0.<init>()
            com.google.crypto.tink.hybrid.internal.HpkePublicKeyManager r1 = new com.google.crypto.tink.hybrid.internal.HpkePublicKeyManager
            r1.<init>()
            com.google.crypto.tink.Registry.registerAsymmetricKeyManagers(r0, r1, r2)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.HpkePrivateKey"
            return r0
    }

    public com.google.crypto.tink.proto.HpkePublicKey getPublicKey(com.google.crypto.tink.proto.HpkePrivateKey r2) {
            r1 = this;
            com.google.crypto.tink.proto.HpkePublicKey r0 = r2.getPublicKey()
            return r0
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getPublicKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.HpkePrivateKey r1 = (com.google.crypto.tink.proto.HpkePrivateKey) r1
            com.google.crypto.tink.proto.HpkePublicKey r1 = r0.getPublicKey(r1)
            return r1
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.HpkeKeyFormat, com.google.crypto.tink.proto.HpkePrivateKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.hybrid.internal.HpkePrivateKeyManager$2 r0 = new com.google.crypto.tink.hybrid.internal.HpkePrivateKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.HpkeKeyFormat> r1 = com.google.crypto.tink.proto.HpkeKeyFormat.class
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
    public com.google.crypto.tink.proto.HpkePrivateKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.HpkePrivateKey r0 = com.google.crypto.tink.proto.HpkePrivateKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.HpkePrivateKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.HpkePrivateKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getPrivateKey()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2f
            boolean r0 = r3.hasPublicKey()
            if (r0 == 0) goto L27
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.proto.HpkePublicKey r0 = r3.getPublicKey()
            com.google.crypto.tink.proto.HpkeParams r0 = r0.getParams()
            com.google.crypto.tink.hybrid.internal.HpkeUtil.validateParams(r0)
            return
        L27:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Missing public key."
            r0.<init>(r1)
            throw r0
        L2f:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Private key is empty."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.HpkePrivateKey r1 = (com.google.crypto.tink.proto.HpkePrivateKey) r1
            r0.validateKey(r1)
            return
    }
}
