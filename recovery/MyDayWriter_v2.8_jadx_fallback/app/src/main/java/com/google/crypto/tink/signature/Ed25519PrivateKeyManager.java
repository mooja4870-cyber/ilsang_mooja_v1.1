package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes.dex */
public final class Ed25519PrivateKeyManager extends com.google.crypto.tink.internal.PrivateKeyTypeManager<com.google.crypto.tink.proto.Ed25519PrivateKey, com.google.crypto.tink.proto.Ed25519PublicKey> {



    Ed25519PrivateKeyManager() {
            r5 = this;
            java.lang.Class<com.google.crypto.tink.proto.Ed25519PrivateKey> r0 = com.google.crypto.tink.proto.Ed25519PrivateKey.class
            java.lang.Class<com.google.crypto.tink.proto.Ed25519PublicKey> r1 = com.google.crypto.tink.proto.Ed25519PublicKey.class
            r2 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r2 = new com.google.crypto.tink.internal.PrimitiveFactory[r2]
            com.google.crypto.tink.signature.Ed25519PrivateKeyManager$1 r3 = new com.google.crypto.tink.signature.Ed25519PrivateKeyManager$1
            java.lang.Class<com.google.crypto.tink.PublicKeySign> r4 = com.google.crypto.tink.PublicKeySign.class
            r3.<init>(r4)
            r4 = 0
            r2[r4] = r3
            r5.<init>(r0, r1, r2)
            return
    }

    public static final com.google.crypto.tink.KeyTemplate ed25519Template() {
            com.google.crypto.tink.signature.Ed25519PrivateKeyManager r0 = new com.google.crypto.tink.signature.Ed25519PrivateKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            r1 = 0
            byte[] r1 = new byte[r1]
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            com.google.crypto.tink.KeyTemplate r0 = com.google.crypto.tink.KeyTemplate.create(r0, r1, r2)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate rawEd25519Template() {
            com.google.crypto.tink.signature.Ed25519PrivateKeyManager r0 = new com.google.crypto.tink.signature.Ed25519PrivateKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            r1 = 0
            byte[] r1 = new byte[r1]
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r0 = com.google.crypto.tink.KeyTemplate.create(r0, r1, r2)
            return r0
    }

    public static void registerPair(boolean r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.Ed25519PrivateKeyManager r0 = new com.google.crypto.tink.signature.Ed25519PrivateKeyManager
            r0.<init>()
            com.google.crypto.tink.signature.Ed25519PublicKeyManager r1 = new com.google.crypto.tink.signature.Ed25519PublicKeyManager
            r1.<init>()
            com.google.crypto.tink.Registry.registerAsymmetricKeyManagers(r0, r1, r2)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"
            return r0
    }

    public com.google.crypto.tink.proto.Ed25519PublicKey getPublicKey(com.google.crypto.tink.proto.Ed25519PrivateKey r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.proto.Ed25519PublicKey r0 = r2.getPublicKey()
            return r0
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getPublicKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.Ed25519PrivateKey r1 = (com.google.crypto.tink.proto.Ed25519PrivateKey) r1
            com.google.crypto.tink.proto.Ed25519PublicKey r1 = r0.getPublicKey(r1)
            return r1
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.Ed25519KeyFormat, com.google.crypto.tink.proto.Ed25519PrivateKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.signature.Ed25519PrivateKeyManager$2 r0 = new com.google.crypto.tink.signature.Ed25519PrivateKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.Ed25519KeyFormat> r1 = com.google.crypto.tink.proto.Ed25519KeyFormat.class
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
    public com.google.crypto.tink.proto.Ed25519PrivateKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.Ed25519PrivateKey r0 = com.google.crypto.tink.proto.Ed25519PrivateKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.Ed25519PrivateKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.Ed25519PrivateKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.signature.Ed25519PublicKeyManager r0 = new com.google.crypto.tink.signature.Ed25519PublicKeyManager
            r0.<init>()
            com.google.crypto.tink.proto.Ed25519PublicKey r1 = r3.getPublicKey()
            r0.validateKey(r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getKeyValue()
            int r0 = r0.size()
            r1 = 32
            if (r0 != r1) goto L24
            return
        L24:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "invalid Ed25519 private key: incorrect key length"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.Ed25519PrivateKey r1 = (com.google.crypto.tink.proto.Ed25519PrivateKey) r1
            r0.validateKey(r1)
            return
    }
}
