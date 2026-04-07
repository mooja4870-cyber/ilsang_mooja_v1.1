package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes.dex */
public final class AesCmacKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.AesCmacKey> {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.mac.AesCmacKey, com.google.crypto.tink.mac.ChunkedMac> CHUNKED_MAC_PRIMITIVE_CONSTRUCTOR = null;
    private static final int KEY_SIZE_IN_BYTES = 32;
    private static final int MAX_TAG_SIZE_IN_BYTES = 16;
    private static final int MIN_TAG_SIZE_IN_BYTES = 10;
    private static final int VERSION = 0;



    static {
            com.google.crypto.tink.mac.AesCmacKeyManager$$ExternalSyntheticLambda0 r0 = new com.google.crypto.tink.mac.AesCmacKeyManager$$ExternalSyntheticLambda0
            r0.<init>()
            java.lang.Class<com.google.crypto.tink.mac.AesCmacKey> r1 = com.google.crypto.tink.mac.AesCmacKey.class
            java.lang.Class<com.google.crypto.tink.mac.ChunkedMac> r2 = com.google.crypto.tink.mac.ChunkedMac.class
            com.google.crypto.tink.internal.PrimitiveConstructor r0 = com.google.crypto.tink.internal.PrimitiveConstructor.create(r0, r1, r2)
            com.google.crypto.tink.mac.AesCmacKeyManager.CHUNKED_MAC_PRIMITIVE_CONSTRUCTOR = r0
            return
    }

    AesCmacKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.AesCmacKey> r0 = com.google.crypto.tink.proto.AesCmacKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.mac.AesCmacKeyManager$1 r2 = new com.google.crypto.tink.mac.AesCmacKeyManager$1
            java.lang.Class<com.google.crypto.tink.Mac> r3 = com.google.crypto.tink.Mac.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static /* synthetic */ void access$000(com.google.crypto.tink.proto.AesCmacParams r0) throws java.security.GeneralSecurityException {
            validateParams(r0)
            return
    }

    static /* synthetic */ void access$100(int r0) throws java.security.GeneralSecurityException {
            validateSize(r0)
            return
    }

    public static final com.google.crypto.tink.KeyTemplate aes256CmacTemplate() {
            com.google.crypto.tink.proto.AesCmacKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesCmacKeyFormat.newBuilder()
            r1 = 32
            com.google.crypto.tink.proto.AesCmacKeyFormat$Builder r0 = r0.setKeySize(r1)
            com.google.crypto.tink.proto.AesCmacParams$Builder r1 = com.google.crypto.tink.proto.AesCmacParams.newBuilder()
            r2 = 16
            com.google.crypto.tink.proto.AesCmacParams$Builder r1 = r1.setTagSize(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesCmacParams r1 = (com.google.crypto.tink.proto.AesCmacParams) r1
            com.google.crypto.tink.proto.AesCmacKeyFormat$Builder r0 = r0.setParams(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesCmacKeyFormat r0 = (com.google.crypto.tink.proto.AesCmacKeyFormat) r0
            com.google.crypto.tink.mac.AesCmacKeyManager r1 = new com.google.crypto.tink.mac.AesCmacKeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            byte[] r2 = r0.toByteArray()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            com.google.crypto.tink.KeyTemplate r1 = com.google.crypto.tink.KeyTemplate.create(r1, r2, r3)
            return r1
    }

    public static final com.google.crypto.tink.KeyTemplate rawAes256CmacTemplate() {
            com.google.crypto.tink.proto.AesCmacKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesCmacKeyFormat.newBuilder()
            r1 = 32
            com.google.crypto.tink.proto.AesCmacKeyFormat$Builder r0 = r0.setKeySize(r1)
            com.google.crypto.tink.proto.AesCmacParams$Builder r1 = com.google.crypto.tink.proto.AesCmacParams.newBuilder()
            r2 = 16
            com.google.crypto.tink.proto.AesCmacParams$Builder r1 = r1.setTagSize(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesCmacParams r1 = (com.google.crypto.tink.proto.AesCmacParams) r1
            com.google.crypto.tink.proto.AesCmacKeyFormat$Builder r0 = r0.setParams(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesCmacKeyFormat r0 = (com.google.crypto.tink.proto.AesCmacKeyFormat) r0
            com.google.crypto.tink.mac.AesCmacKeyManager r1 = new com.google.crypto.tink.mac.AesCmacKeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            byte[] r2 = r0.toByteArray()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r1 = com.google.crypto.tink.KeyTemplate.create(r1, r2, r3)
            return r1
    }

    public static void register(boolean r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.mac.AesCmacKeyManager r0 = new com.google.crypto.tink.mac.AesCmacKeyManager
            r0.<init>()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r2)
            com.google.crypto.tink.mac.AesCmacProtoSerialization.register()
            com.google.crypto.tink.internal.MutablePrimitiveRegistry r0 = com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance()
            com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.mac.AesCmacKey, com.google.crypto.tink.mac.ChunkedMac> r1 = com.google.crypto.tink.mac.AesCmacKeyManager.CHUNKED_MAC_PRIMITIVE_CONSTRUCTOR
            r0.registerPrimitiveConstructor(r1)
            return
    }

    private static void validateParams(com.google.crypto.tink.proto.AesCmacParams r2) throws java.security.GeneralSecurityException {
            int r0 = r2.getTagSize()
            r1 = 10
            if (r0 < r1) goto L19
            int r0 = r2.getTagSize()
            r1 = 16
            if (r0 > r1) goto L11
            return
        L11:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "tag size too long"
            r0.<init>(r1)
            throw r0
        L19:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "tag size too short"
            r0.<init>(r1)
            throw r0
    }

    private static void validateSize(int r2) throws java.security.GeneralSecurityException {
            r0 = 32
            if (r2 != r0) goto L5
            return
        L5:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "AesCmacKey size wrong, must be 32 bytes"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesCmacKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.AesCmacKeyFormat, com.google.crypto.tink.proto.AesCmacKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.mac.AesCmacKeyManager$2 r0 = new com.google.crypto.tink.mac.AesCmacKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.AesCmacKeyFormat> r1 = com.google.crypto.tink.proto.AesCmacKeyFormat.class
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
    public com.google.crypto.tink.proto.AesCmacKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.AesCmacKey r0 = com.google.crypto.tink.proto.AesCmacKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.AesCmacKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.AesCmacKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getKeyValue()
            int r0 = r0.size()
            validateSize(r0)
            com.google.crypto.tink.proto.AesCmacParams r0 = r3.getParams()
            validateParams(r0)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.AesCmacKey r1 = (com.google.crypto.tink.proto.AesCmacKey) r1
            r0.validateKey(r1)
            return
    }
}
