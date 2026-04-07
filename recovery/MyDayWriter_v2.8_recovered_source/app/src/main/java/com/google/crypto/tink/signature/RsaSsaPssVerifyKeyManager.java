package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes.dex */
class RsaSsaPssVerifyKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.RsaSsaPssPublicKey> {


    public RsaSsaPssVerifyKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.RsaSsaPssPublicKey> r0 = com.google.crypto.tink.proto.RsaSsaPssPublicKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager$1 r2 = new com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager$1
            java.lang.Class<com.google.crypto.tink.PublicKeyVerify> r3 = com.google.crypto.tink.PublicKeyVerify.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey"
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
    public com.google.crypto.tink.proto.RsaSsaPssPublicKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.RsaSsaPssPublicKey r0 = com.google.crypto.tink.proto.RsaSsaPssPublicKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.RsaSsaPssPublicKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.RsaSsaPssPublicKey r4) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.getVersion()
            int r1 = r3.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            java.math.BigInteger r0 = new java.math.BigInteger
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r4.getN()
            byte[] r1 = r1.toByteArray()
            r2 = 1
            r0.<init>(r2, r1)
            int r0 = r0.bitLength()
            com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r4.getE()
            byte[] r1 = r1.toByteArray()
            r0.<init>(r2, r1)
            com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(r0)
            com.google.crypto.tink.proto.RsaSsaPssParams r0 = r4.getParams()
            com.google.crypto.tink.signature.internal.SigUtil.validateRsaSsaPssParams(r0)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.RsaSsaPssPublicKey r1 = (com.google.crypto.tink.proto.RsaSsaPssPublicKey) r1
            r0.validateKey(r1)
            return
    }
}
