package com.google.crypto.tink.prf;

/* JADX INFO: loaded from: classes.dex */
public final class AesCmacPrfKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.AesCmacPrfKey> {
    private static final int KEY_SIZE_IN_BYTES = 32;
    private static final int VERSION = 0;



    AesCmacPrfKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.AesCmacPrfKey> r0 = com.google.crypto.tink.proto.AesCmacPrfKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.prf.AesCmacPrfKeyManager$1 r2 = new com.google.crypto.tink.prf.AesCmacPrfKeyManager$1
            java.lang.Class<com.google.crypto.tink.prf.Prf> r3 = com.google.crypto.tink.prf.Prf.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static /* synthetic */ void access$000(int r0) throws java.security.GeneralSecurityException {
            validateSize(r0)
            return
    }

    public static final com.google.crypto.tink.KeyTemplate aes256CmacTemplate() {
            com.google.crypto.tink.proto.AesCmacPrfKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesCmacPrfKeyFormat.newBuilder()
            r1 = 32
            com.google.crypto.tink.proto.AesCmacPrfKeyFormat$Builder r0 = r0.setKeySize(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesCmacPrfKeyFormat r0 = (com.google.crypto.tink.proto.AesCmacPrfKeyFormat) r0
            com.google.crypto.tink.prf.AesCmacPrfKeyManager r1 = new com.google.crypto.tink.prf.AesCmacPrfKeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            byte[] r2 = r0.toByteArray()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r1 = com.google.crypto.tink.KeyTemplate.create(r1, r2, r3)
            return r1
    }

    public static void register(boolean r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.prf.AesCmacPrfKeyManager r0 = new com.google.crypto.tink.prf.AesCmacPrfKeyManager
            r0.<init>()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r1)
            return
    }

    private static void validateSize(int r2) throws java.security.GeneralSecurityException {
            r0 = 32
            if (r2 != r0) goto L5
            return
        L5:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "AesCmacPrfKey size wrong, must be 32 bytes"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesCmacPrfKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.AesCmacPrfKeyFormat, com.google.crypto.tink.proto.AesCmacPrfKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.prf.AesCmacPrfKeyManager$2 r0 = new com.google.crypto.tink.prf.AesCmacPrfKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.AesCmacPrfKeyFormat> r1 = com.google.crypto.tink.proto.AesCmacPrfKeyFormat.class
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
    public com.google.crypto.tink.proto.AesCmacPrfKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.AesCmacPrfKey r0 = com.google.crypto.tink.proto.AesCmacPrfKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.AesCmacPrfKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.AesCmacPrfKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getKeyValue()
            int r0 = r0.size()
            validateSize(r0)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.AesCmacPrfKey r1 = (com.google.crypto.tink.proto.AesCmacPrfKey) r1
            r0.validateKey(r1)
            return
    }
}
