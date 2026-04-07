package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes.dex */
public class KmsEnvelopeAeadKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.KmsEnvelopeAeadKey> {



    KmsEnvelopeAeadKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.KmsEnvelopeAeadKey> r0 = com.google.crypto.tink.proto.KmsEnvelopeAeadKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager$1 r2 = new com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager$1
            java.lang.Class<com.google.crypto.tink.Aead> r3 = com.google.crypto.tink.Aead.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat createKeyFormat(java.lang.String r3, com.google.crypto.tink.KeyTemplate r4) {
            com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat$Builder r0 = com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat.newBuilder()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            java.lang.String r2 = r4.getTypeUrl()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r2)
            byte[] r2 = r4.getValue()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2)
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setValue(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat$Builder r0 = r0.setDekTemplate(r1)
            com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat$Builder r0 = r0.setKekUri(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat r0 = (com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat) r0
            return r0
    }

    public static com.google.crypto.tink.KeyTemplate createKeyTemplate(java.lang.String r4, com.google.crypto.tink.KeyTemplate r5) {
            com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat r0 = createKeyFormat(r4, r5)
            com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager r1 = new com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            byte[] r2 = r0.toByteArray()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r1 = com.google.crypto.tink.KeyTemplate.create(r1, r2, r3)
            return r1
    }

    public static void register(boolean r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager r0 = new com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager
            r0.<init>()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r1)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat, com.google.crypto.tink.proto.KmsEnvelopeAeadKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager$2 r0 = new com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat> r1 = com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat.class
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType() {
            r1 = this;
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.REMOTE
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.KmsEnvelopeAeadKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.KmsEnvelopeAeadKey r0 = com.google.crypto.tink.proto.KmsEnvelopeAeadKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.KmsEnvelopeAeadKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.KmsEnvelopeAeadKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.KmsEnvelopeAeadKey r1 = (com.google.crypto.tink.proto.KmsEnvelopeAeadKey) r1
            r0.validateKey(r1)
            return
    }
}
