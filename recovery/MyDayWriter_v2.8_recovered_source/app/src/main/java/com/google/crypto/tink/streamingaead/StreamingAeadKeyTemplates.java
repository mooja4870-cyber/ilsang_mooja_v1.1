package com.google.crypto.tink.streamingaead;

/* JADX INFO: loaded from: classes.dex */
public final class StreamingAeadKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_CTR_HMAC_SHA256_1MB = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_CTR_HMAC_SHA256_4KB = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_GCM_HKDF_1MB = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_GCM_HKDF_4KB = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_CTR_HMAC_SHA256_1MB = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_CTR_HMAC_SHA256_4KB = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_GCM_HKDF_1MB = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_GCM_HKDF_4KB = null;

    static {
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA256
            r0 = 16
            r2 = 16
            r4 = 32
            r5 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesCtrHmacStreamingKeyTemplate(r0, r1, r2, r3, r4, r5)
            com.google.crypto.tink.streamingaead.StreamingAeadKeyTemplates.AES128_CTR_HMAC_SHA256_4KB = r0
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA256
            r1 = 16
            r3 = 16
            r5 = 32
            r6 = 1048576(0x100000, float:1.469368E-39)
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesCtrHmacStreamingKeyTemplate(r1, r2, r3, r4, r5, r6)
            com.google.crypto.tink.streamingaead.StreamingAeadKeyTemplates.AES128_CTR_HMAC_SHA256_1MB = r0
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA256
            r1 = 32
            r3 = 32
            r6 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesCtrHmacStreamingKeyTemplate(r1, r2, r3, r4, r5, r6)
            com.google.crypto.tink.streamingaead.StreamingAeadKeyTemplates.AES256_CTR_HMAC_SHA256_4KB = r0
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA256
            r6 = 1048576(0x100000, float:1.469368E-39)
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesCtrHmacStreamingKeyTemplate(r1, r2, r3, r4, r5, r6)
            com.google.crypto.tink.streamingaead.StreamingAeadKeyTemplates.AES256_CTR_HMAC_SHA256_1MB = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            r1 = 16
            r2 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesGcmHkdfStreamingKeyTemplate(r1, r0, r1, r2)
            com.google.crypto.tink.streamingaead.StreamingAeadKeyTemplates.AES128_GCM_HKDF_4KB = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            r3 = 1048576(0x100000, float:1.469368E-39)
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesGcmHkdfStreamingKeyTemplate(r1, r0, r1, r3)
            com.google.crypto.tink.streamingaead.StreamingAeadKeyTemplates.AES128_GCM_HKDF_1MB = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            r1 = 32
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesGcmHkdfStreamingKeyTemplate(r1, r0, r1, r2)
            com.google.crypto.tink.streamingaead.StreamingAeadKeyTemplates.AES256_GCM_HKDF_4KB = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesGcmHkdfStreamingKeyTemplate(r1, r0, r1, r3)
            com.google.crypto.tink.streamingaead.StreamingAeadKeyTemplates.AES256_GCM_HKDF_1MB = r0
            return
    }

    private StreamingAeadKeyTemplates() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.proto.KeyTemplate createAesCtrHmacStreamingKeyTemplate(int r5, com.google.crypto.tink.proto.HashType r6, int r7, com.google.crypto.tink.proto.HashType r8, int r9, int r10) {
            com.google.crypto.tink.proto.HmacParams$Builder r0 = com.google.crypto.tink.proto.HmacParams.newBuilder()
            com.google.crypto.tink.proto.HmacParams$Builder r0 = r0.setHash(r8)
            com.google.crypto.tink.proto.HmacParams$Builder r0 = r0.setTagSize(r9)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.HmacParams r0 = (com.google.crypto.tink.proto.HmacParams) r0
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams$Builder r1 = com.google.crypto.tink.proto.AesCtrHmacStreamingParams.newBuilder()
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams$Builder r1 = r1.setCiphertextSegmentSize(r10)
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams$Builder r1 = r1.setDerivedKeySize(r7)
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams$Builder r1 = r1.setHkdfHashType(r6)
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams$Builder r1 = r1.setHmacParams(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams r1 = (com.google.crypto.tink.proto.AesCtrHmacStreamingParams) r1
            com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat$Builder r2 = com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat$Builder r2 = r2.setParams(r1)
            com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat$Builder r2 = r2.setKeySize(r5)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat r2 = (com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat) r2
            com.google.crypto.tink.proto.KeyTemplate$Builder r3 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r2.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r3 = r3.setValue(r4)
            com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager r4 = new com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager
            r4.<init>()
            java.lang.String r4 = r4.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r3 = r3.setTypeUrl(r4)
            com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.KeyTemplate$Builder r3 = r3.setOutputPrefixType(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
            com.google.crypto.tink.proto.KeyTemplate r3 = (com.google.crypto.tink.proto.KeyTemplate) r3
            return r3
    }

    public static com.google.crypto.tink.proto.KeyTemplate createAesGcmHkdfStreamingKeyTemplate(int r4, com.google.crypto.tink.proto.HashType r5, int r6, int r7) {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$Builder r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.newBuilder()
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$Builder r0 = r0.setCiphertextSegmentSize(r7)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$Builder r0 = r0.setDerivedKeySize(r6)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$Builder r0 = r0.setHkdfHashType(r5)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
            com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat$Builder r1 = com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat$Builder r1 = r1.setKeySize(r4)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat$Builder r1 = r1.setParams(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat r1 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat) r1
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setValue(r3)
            com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager r3 = new com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager
            r3.<init>()
            java.lang.String r3 = r3.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setTypeUrl(r3)
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setOutputPrefixType(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.KeyTemplate r2 = (com.google.crypto.tink.proto.KeyTemplate) r2
            return r2
    }
}
