package com.google.crypto.tink.hybrid;

/* JADX INFO: loaded from: classes.dex */
class EciesAeadHkdfPublicKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.EciesAeadHkdfPublicKey> {


    public EciesAeadHkdfPublicKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.EciesAeadHkdfPublicKey> r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.hybrid.EciesAeadHkdfPublicKeyManager$1 r2 = new com.google.crypto.tink.hybrid.EciesAeadHkdfPublicKeyManager$1
            java.lang.Class<com.google.crypto.tink.HybridEncrypt> r3 = com.google.crypto.tink.HybridEncrypt.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType() {
            r1 = this;
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.EciesAeadHkdfPublicKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.proto.EciesAeadHkdfParams r0 = r3.getParams()
            com.google.crypto.tink.hybrid.HybridUtil.validate(r0)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r1 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r1
            r0.validateKey(r1)
            return
    }
}
