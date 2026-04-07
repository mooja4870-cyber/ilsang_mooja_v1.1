package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes.dex */
public class ChaCha20Poly1305KeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.ChaCha20Poly1305Key> {
    private static final int KEY_SIZE_IN_BYTES = 32;



    ChaCha20Poly1305KeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.ChaCha20Poly1305Key> r0 = com.google.crypto.tink.proto.ChaCha20Poly1305Key.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager$1 r2 = new com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager$1
            java.lang.Class<com.google.crypto.tink.Aead> r3 = com.google.crypto.tink.Aead.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    public static final com.google.crypto.tink.KeyTemplate chaCha20Poly1305Template() {
            com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager r0 = new com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.proto.ChaCha20Poly1305KeyFormat r1 = com.google.crypto.tink.proto.ChaCha20Poly1305KeyFormat.getDefaultInstance()
            byte[] r1 = r1.toByteArray()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            com.google.crypto.tink.KeyTemplate r0 = com.google.crypto.tink.KeyTemplate.create(r0, r1, r2)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate rawChaCha20Poly1305Template() {
            com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager r0 = new com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.proto.ChaCha20Poly1305KeyFormat r1 = com.google.crypto.tink.proto.ChaCha20Poly1305KeyFormat.getDefaultInstance()
            byte[] r1 = r1.toByteArray()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r0 = com.google.crypto.tink.KeyTemplate.create(r0, r1, r2)
            return r0
    }

    public static void register(boolean r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager r0 = new com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager
            r0.<init>()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r1)
            com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization.register()
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.ChaCha20Poly1305KeyFormat, com.google.crypto.tink.proto.ChaCha20Poly1305Key> keyFactory() {
            r2 = this;
            com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager$2 r0 = new com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.ChaCha20Poly1305KeyFormat> r1 = com.google.crypto.tink.proto.ChaCha20Poly1305KeyFormat.class
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
    public com.google.crypto.tink.proto.ChaCha20Poly1305Key parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.ChaCha20Poly1305Key r0 = com.google.crypto.tink.proto.ChaCha20Poly1305Key.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.ChaCha20Poly1305Key r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.ChaCha20Poly1305Key r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getKeyValue()
            int r0 = r0.size()
            r1 = 32
            if (r0 != r1) goto L18
            return
        L18:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "invalid ChaCha20Poly1305Key: incorrect key length"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.ChaCha20Poly1305Key r1 = (com.google.crypto.tink.proto.ChaCha20Poly1305Key) r1
            r0.validateKey(r1)
            return
    }
}
