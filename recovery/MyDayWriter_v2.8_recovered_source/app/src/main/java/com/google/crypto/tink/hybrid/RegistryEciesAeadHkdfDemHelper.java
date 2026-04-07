package com.google.crypto.tink.hybrid;

/* JADX INFO: loaded from: classes.dex */
class RegistryEciesAeadHkdfDemHelper implements com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper {
    private com.google.crypto.tink.proto.AesCtrHmacAeadKey aesCtrHmacAeadKey;
    private int aesCtrKeySize;
    private com.google.crypto.tink.proto.AesGcmKey aesGcmKey;
    private com.google.crypto.tink.proto.AesSivKey aesSivKey;
    private final java.lang.String demKeyTypeUrl;
    private final int symmetricKeySize;

    RegistryEciesAeadHkdfDemHelper(com.google.crypto.tink.proto.KeyTemplate r5) throws java.security.GeneralSecurityException {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = r5.getTypeUrl()
            r4.demKeyTypeUrl = r0
            java.lang.String r0 = r4.demKeyTypeUrl
            java.lang.String r1 = com.google.crypto.tink.aead.AeadConfig.AES_GCM_TYPE_URL
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L38
        L14:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r5.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2f
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2f
            com.google.crypto.tink.proto.AesGcmKeyFormat r0 = com.google.crypto.tink.proto.AesGcmKeyFormat.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2f
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = com.google.crypto.tink.Registry.newKey(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2f
            com.google.crypto.tink.proto.AesGcmKey r1 = (com.google.crypto.tink.proto.AesGcmKey) r1     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2f
            r4.aesGcmKey = r1     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2f
            int r1 = r0.getKeySize()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2f
            r4.symmetricKeySize = r1     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2f
            goto L9e
        L2f:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "invalid KeyFormat protobuf, expected AesGcmKeyFormat"
            r1.<init>(r2, r0)
            throw r1
        L38:
            java.lang.String r0 = r4.demKeyTypeUrl
            java.lang.String r1 = com.google.crypto.tink.aead.AeadConfig.AES_CTR_HMAC_AEAD_TYPE_URL
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = "invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat"
            if (r0 == 0) goto L78
        L45:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r5.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L71
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L71
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.parseFrom(r0, r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L71
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = com.google.crypto.tink.Registry.newKey(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L71
            com.google.crypto.tink.proto.AesCtrHmacAeadKey r2 = (com.google.crypto.tink.proto.AesCtrHmacAeadKey) r2     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L71
            r4.aesCtrHmacAeadKey = r2     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L71
            com.google.crypto.tink.proto.AesCtrKeyFormat r2 = r0.getAesCtrKeyFormat()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L71
            int r2 = r2.getKeySize()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L71
            r4.aesCtrKeySize = r2     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L71
            com.google.crypto.tink.proto.HmacKeyFormat r2 = r0.getHmacKeyFormat()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L71
            int r2 = r2.getKeySize()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L71
            int r3 = r4.aesCtrKeySize     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L71
            int r3 = r3 + r2
            r4.symmetricKeySize = r3     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L71
            goto L9e
        L71:
            r0 = move-exception
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            r2.<init>(r1, r0)
            throw r2
        L78:
            java.lang.String r0 = r4.demKeyTypeUrl
            java.lang.String r2 = com.google.crypto.tink.daead.DeterministicAeadConfig.AES_SIV_TYPE_URL
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto La6
        L83:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r5.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L9f
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L9f
            com.google.crypto.tink.proto.AesSivKeyFormat r0 = com.google.crypto.tink.proto.AesSivKeyFormat.parseFrom(r0, r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L9f
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = com.google.crypto.tink.Registry.newKey(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L9f
            com.google.crypto.tink.proto.AesSivKey r2 = (com.google.crypto.tink.proto.AesSivKey) r2     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L9f
            r4.aesSivKey = r2     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L9f
            int r2 = r0.getKeySize()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L9f
            r4.symmetricKeySize = r2     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L9f
        L9e:
            return
        L9f:
            r0 = move-exception
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            r2.<init>(r1, r0)
            throw r2
        La6:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported AEAD DEM key type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r4.demKeyTypeUrl
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper
    public com.google.crypto.tink.hybrid.subtle.AeadOrDaead getAeadOrDaead(byte[] r9) throws java.security.GeneralSecurityException {
            r8 = this;
            int r0 = r9.length
            int r1 = r8.getSymmetricKeySizeInBytes()
            if (r0 != r1) goto Lfc
            java.lang.String r0 = r8.demKeyTypeUrl
            java.lang.String r1 = com.google.crypto.tink.aead.AeadConfig.AES_GCM_TYPE_URL
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L3e
            com.google.crypto.tink.proto.AesGcmKey$Builder r0 = com.google.crypto.tink.proto.AesGcmKey.newBuilder()
            com.google.crypto.tink.proto.AesGcmKey r2 = r8.aesGcmKey
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.mergeFrom(r2)
            com.google.crypto.tink.proto.AesGcmKey$Builder r0 = (com.google.crypto.tink.proto.AesGcmKey.Builder) r0
            int r2 = r8.symmetricKeySize
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r9, r1, r2)
            com.google.crypto.tink.proto.AesGcmKey$Builder r0 = r0.setKeyValue(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesGcmKey r0 = (com.google.crypto.tink.proto.AesGcmKey) r0
            com.google.crypto.tink.hybrid.subtle.AeadOrDaead r1 = new com.google.crypto.tink.hybrid.subtle.AeadOrDaead
            java.lang.String r2 = r8.demKeyTypeUrl
            java.lang.Class<com.google.crypto.tink.Aead> r3 = com.google.crypto.tink.Aead.class
            java.lang.Object r2 = com.google.crypto.tink.Registry.getPrimitive(r2, r0, r3)
            com.google.crypto.tink.Aead r2 = (com.google.crypto.tink.Aead) r2
            r1.<init>(r2)
            return r1
        L3e:
            java.lang.String r0 = r8.demKeyTypeUrl
            java.lang.String r2 = com.google.crypto.tink.aead.AeadConfig.AES_CTR_HMAC_AEAD_TYPE_URL
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lbe
            int r0 = r8.aesCtrKeySize
            byte[] r0 = java.util.Arrays.copyOfRange(r9, r1, r0)
            int r1 = r8.aesCtrKeySize
            int r2 = r8.symmetricKeySize
            byte[] r1 = java.util.Arrays.copyOfRange(r9, r1, r2)
            com.google.crypto.tink.proto.AesCtrKey$Builder r2 = com.google.crypto.tink.proto.AesCtrKey.newBuilder()
            com.google.crypto.tink.proto.AesCtrHmacAeadKey r3 = r8.aesCtrHmacAeadKey
            com.google.crypto.tink.proto.AesCtrKey r3 = r3.getAesCtrKey()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r2 = r2.mergeFrom(r3)
            com.google.crypto.tink.proto.AesCtrKey$Builder r2 = (com.google.crypto.tink.proto.AesCtrKey.Builder) r2
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r0)
            com.google.crypto.tink.proto.AesCtrKey$Builder r2 = r2.setKeyValue(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.AesCtrKey r2 = (com.google.crypto.tink.proto.AesCtrKey) r2
            com.google.crypto.tink.proto.HmacKey$Builder r3 = com.google.crypto.tink.proto.HmacKey.newBuilder()
            com.google.crypto.tink.proto.AesCtrHmacAeadKey r4 = r8.aesCtrHmacAeadKey
            com.google.crypto.tink.proto.HmacKey r4 = r4.getHmacKey()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r3 = r3.mergeFrom(r4)
            com.google.crypto.tink.proto.HmacKey$Builder r3 = (com.google.crypto.tink.proto.HmacKey.Builder) r3
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            com.google.crypto.tink.proto.HmacKey$Builder r3 = r3.setKeyValue(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
            com.google.crypto.tink.proto.HmacKey r3 = (com.google.crypto.tink.proto.HmacKey) r3
            com.google.crypto.tink.proto.AesCtrHmacAeadKey$Builder r4 = com.google.crypto.tink.proto.AesCtrHmacAeadKey.newBuilder()
            com.google.crypto.tink.proto.AesCtrHmacAeadKey r5 = r8.aesCtrHmacAeadKey
            int r5 = r5.getVersion()
            com.google.crypto.tink.proto.AesCtrHmacAeadKey$Builder r4 = r4.setVersion(r5)
            com.google.crypto.tink.proto.AesCtrHmacAeadKey$Builder r4 = r4.setAesCtrKey(r2)
            com.google.crypto.tink.proto.AesCtrHmacAeadKey$Builder r4 = r4.setHmacKey(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r4 = r4.build()
            com.google.crypto.tink.proto.AesCtrHmacAeadKey r4 = (com.google.crypto.tink.proto.AesCtrHmacAeadKey) r4
            com.google.crypto.tink.hybrid.subtle.AeadOrDaead r5 = new com.google.crypto.tink.hybrid.subtle.AeadOrDaead
            java.lang.String r6 = r8.demKeyTypeUrl
            java.lang.Class<com.google.crypto.tink.Aead> r7 = com.google.crypto.tink.Aead.class
            java.lang.Object r6 = com.google.crypto.tink.Registry.getPrimitive(r6, r4, r7)
            com.google.crypto.tink.Aead r6 = (com.google.crypto.tink.Aead) r6
            r5.<init>(r6)
            return r5
        Lbe:
            java.lang.String r0 = r8.demKeyTypeUrl
            java.lang.String r2 = com.google.crypto.tink.daead.DeterministicAeadConfig.AES_SIV_TYPE_URL
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lf4
            com.google.crypto.tink.proto.AesSivKey$Builder r0 = com.google.crypto.tink.proto.AesSivKey.newBuilder()
            com.google.crypto.tink.proto.AesSivKey r2 = r8.aesSivKey
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.mergeFrom(r2)
            com.google.crypto.tink.proto.AesSivKey$Builder r0 = (com.google.crypto.tink.proto.AesSivKey.Builder) r0
            int r2 = r8.symmetricKeySize
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r9, r1, r2)
            com.google.crypto.tink.proto.AesSivKey$Builder r0 = r0.setKeyValue(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesSivKey r0 = (com.google.crypto.tink.proto.AesSivKey) r0
            com.google.crypto.tink.hybrid.subtle.AeadOrDaead r1 = new com.google.crypto.tink.hybrid.subtle.AeadOrDaead
            java.lang.String r2 = r8.demKeyTypeUrl
            java.lang.Class<com.google.crypto.tink.DeterministicAead> r3 = com.google.crypto.tink.DeterministicAead.class
            java.lang.Object r2 = com.google.crypto.tink.Registry.getPrimitive(r2, r0, r3)
            com.google.crypto.tink.DeterministicAead r2 = (com.google.crypto.tink.DeterministicAead) r2
            r1.<init>(r2)
            return r1
        Lf4:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "unknown DEM key type"
            r0.<init>(r1)
            throw r0
        Lfc:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Symmetric key has incorrect length"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper
    public int getSymmetricKeySizeInBytes() {
            r1 = this;
            int r0 = r1.symmetricKeySize
            return r0
    }
}
