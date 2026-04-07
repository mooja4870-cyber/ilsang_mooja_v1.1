package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes.dex */
public class AesCtrKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.AesCtrKey> {
    private static final int MIN_IV_SIZE_IN_BYTES = 12;



    AesCtrKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.AesCtrKey> r0 = com.google.crypto.tink.proto.AesCtrKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.aead.AesCtrKeyManager$1 r2 = new com.google.crypto.tink.aead.AesCtrKeyManager$1
            java.lang.Class<com.google.crypto.tink.subtle.IndCpaCipher> r3 = com.google.crypto.tink.subtle.IndCpaCipher.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static /* synthetic */ void access$000(com.google.crypto.tink.aead.AesCtrKeyManager r0, com.google.crypto.tink.proto.AesCtrParams r1) throws java.security.GeneralSecurityException {
            r0.validateParams(r1)
            return
    }

    public static void register(boolean r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.AesCtrKeyManager r0 = new com.google.crypto.tink.aead.AesCtrKeyManager
            r0.<init>()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r1)
            return
    }

    private void validateParams(com.google.crypto.tink.proto.AesCtrParams r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getIvSize()
            r1 = 12
            if (r0 < r1) goto L11
            int r0 = r3.getIvSize()
            r1 = 16
            if (r0 > r1) goto L11
            return
        L11:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "invalid IV size"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesCtrKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.AesCtrKeyFormat, com.google.crypto.tink.proto.AesCtrKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.aead.AesCtrKeyManager$2 r0 = new com.google.crypto.tink.aead.AesCtrKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.AesCtrKeyFormat> r1 = com.google.crypto.tink.proto.AesCtrKeyFormat.class
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
    public com.google.crypto.tink.proto.AesCtrKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.AesCtrKey r0 = com.google.crypto.tink.proto.AesCtrKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.AesCtrKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.AesCtrKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getKeyValue()
            int r0 = r0.size()
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r0)
            com.google.crypto.tink.proto.AesCtrParams r0 = r3.getParams()
            r2.validateParams(r0)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.AesCtrKey r1 = (com.google.crypto.tink.proto.AesCtrKey) r1
            r0.validateKey(r1)
            return
    }
}
