package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes.dex */
public final class AeadKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_CTR_HMAC_SHA256 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_EAX = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_GCM = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_CTR_HMAC_SHA256 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_EAX = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_GCM = null;
    public static final com.google.crypto.tink.proto.KeyTemplate CHACHA20_POLY1305 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate XCHACHA20_POLY1305 = null;

    static {
            r0 = 16
            com.google.crypto.tink.proto.KeyTemplate r1 = createAesGcmKeyTemplate(r0)
            com.google.crypto.tink.aead.AeadKeyTemplates.AES128_GCM = r1
            r1 = 32
            com.google.crypto.tink.proto.KeyTemplate r2 = createAesGcmKeyTemplate(r1)
            com.google.crypto.tink.aead.AeadKeyTemplates.AES256_GCM = r2
            com.google.crypto.tink.proto.KeyTemplate r2 = createAesEaxKeyTemplate(r0, r0)
            com.google.crypto.tink.aead.AeadKeyTemplates.AES128_EAX = r2
            com.google.crypto.tink.proto.KeyTemplate r2 = createAesEaxKeyTemplate(r1, r0)
            com.google.crypto.tink.aead.AeadKeyTemplates.AES256_EAX = r2
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.KeyTemplate r2 = createAesCtrHmacAeadKeyTemplate(r0, r0, r1, r0, r2)
            com.google.crypto.tink.aead.AeadKeyTemplates.AES128_CTR_HMAC_SHA256 = r2
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesCtrHmacAeadKeyTemplate(r1, r0, r1, r1, r2)
            com.google.crypto.tink.aead.AeadKeyTemplates.AES256_CTR_HMAC_SHA256 = r0
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager r1 = new com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setOutputPrefixType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTemplate r0 = (com.google.crypto.tink.proto.KeyTemplate) r0
            com.google.crypto.tink.aead.AeadKeyTemplates.CHACHA20_POLY1305 = r0
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager r1 = new com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setOutputPrefixType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTemplate r0 = (com.google.crypto.tink.proto.KeyTemplate) r0
            com.google.crypto.tink.aead.AeadKeyTemplates.XCHACHA20_POLY1305 = r0
            return
    }

    private AeadKeyTemplates() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.proto.KeyTemplate createAesCtrHmacAeadKeyTemplate(int r5, int r6, int r7, int r8, com.google.crypto.tink.proto.HashType r9) {
            com.google.crypto.tink.proto.AesCtrKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesCtrKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesCtrParams$Builder r1 = com.google.crypto.tink.proto.AesCtrParams.newBuilder()
            com.google.crypto.tink.proto.AesCtrParams$Builder r1 = r1.setIvSize(r6)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesCtrParams r1 = (com.google.crypto.tink.proto.AesCtrParams) r1
            com.google.crypto.tink.proto.AesCtrKeyFormat$Builder r0 = r0.setParams(r1)
            com.google.crypto.tink.proto.AesCtrKeyFormat$Builder r0 = r0.setKeySize(r5)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesCtrKeyFormat r0 = (com.google.crypto.tink.proto.AesCtrKeyFormat) r0
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r1 = com.google.crypto.tink.proto.HmacKeyFormat.newBuilder()
            com.google.crypto.tink.proto.HmacParams$Builder r2 = com.google.crypto.tink.proto.HmacParams.newBuilder()
            com.google.crypto.tink.proto.HmacParams$Builder r2 = r2.setHash(r9)
            com.google.crypto.tink.proto.HmacParams$Builder r2 = r2.setTagSize(r8)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.HmacParams r2 = (com.google.crypto.tink.proto.HmacParams) r2
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r1 = r1.setParams(r2)
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r1 = r1.setKeySize(r7)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.HmacKeyFormat r1 = (com.google.crypto.tink.proto.HmacKeyFormat) r1
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat$Builder r2 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat$Builder r2 = r2.setAesCtrKeyFormat(r0)
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat$Builder r2 = r2.setHmacKeyFormat(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r2 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r2
            com.google.crypto.tink.proto.KeyTemplate$Builder r3 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r2.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r3 = r3.setValue(r4)
            com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager r4 = new com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager
            r4.<init>()
            java.lang.String r4 = r4.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r3 = r3.setTypeUrl(r4)
            com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r3 = r3.setOutputPrefixType(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
            com.google.crypto.tink.proto.KeyTemplate r3 = (com.google.crypto.tink.proto.KeyTemplate) r3
            return r3
    }

    public static com.google.crypto.tink.proto.KeyTemplate createAesEaxKeyTemplate(int r3, int r4) {
            com.google.crypto.tink.proto.AesEaxKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesEaxKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesEaxKeyFormat$Builder r0 = r0.setKeySize(r3)
            com.google.crypto.tink.proto.AesEaxParams$Builder r1 = com.google.crypto.tink.proto.AesEaxParams.newBuilder()
            com.google.crypto.tink.proto.AesEaxParams$Builder r1 = r1.setIvSize(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesEaxParams r1 = (com.google.crypto.tink.proto.AesEaxParams) r1
            com.google.crypto.tink.proto.AesEaxKeyFormat$Builder r0 = r0.setParams(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesEaxKeyFormat r0 = (com.google.crypto.tink.proto.AesEaxKeyFormat) r0
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setValue(r2)
            com.google.crypto.tink.aead.AesEaxKeyManager r2 = new com.google.crypto.tink.aead.AesEaxKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r2)
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyTemplate createAesGcmKeyTemplate(int r3) {
            com.google.crypto.tink.proto.AesGcmKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesGcmKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesGcmKeyFormat$Builder r0 = r0.setKeySize(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesGcmKeyFormat r0 = (com.google.crypto.tink.proto.AesGcmKeyFormat) r0
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setValue(r2)
            com.google.crypto.tink.aead.AesGcmKeyManager r2 = new com.google.crypto.tink.aead.AesGcmKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r2)
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyTemplate createKmsAeadKeyTemplate(java.lang.String r3) {
            com.google.crypto.tink.proto.KmsAeadKeyFormat$Builder r0 = com.google.crypto.tink.proto.KmsAeadKeyFormat.newBuilder()
            com.google.crypto.tink.proto.KmsAeadKeyFormat$Builder r0 = r0.setKeyUri(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KmsAeadKeyFormat r0 = (com.google.crypto.tink.proto.KmsAeadKeyFormat) r0
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setValue(r2)
            com.google.crypto.tink.aead.KmsAeadKeyManager r2 = new com.google.crypto.tink.aead.KmsAeadKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r2)
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyTemplate createKmsEnvelopeAeadKeyTemplate(java.lang.String r3, com.google.crypto.tink.proto.KeyTemplate r4) {
            com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat$Builder r0 = com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat.newBuilder()
            com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat$Builder r0 = r0.setDekTemplate(r4)
            com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat$Builder r0 = r0.setKekUri(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat r0 = (com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat) r0
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setValue(r2)
            com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager r2 = new com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r2)
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }
}
