package com.google.crypto.tink.hybrid;

/* JADX INFO: loaded from: classes.dex */
public final class HybridKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM = null;
    public static final com.google.crypto.tink.proto.KeyTemplate ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX = null;
    private static final byte[] EMPTY_SALT = null;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.hybrid.HybridKeyTemplates.EMPTY_SALT = r0
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.EcPointFormat r3 = com.google.crypto.tink.proto.EcPointFormat.UNCOMPRESSED
            com.google.crypto.tink.proto.KeyTemplate r4 = com.google.crypto.tink.aead.AeadKeyTemplates.AES128_GCM
            com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            byte[] r6 = com.google.crypto.tink.hybrid.HybridKeyTemplates.EMPTY_SALT
            com.google.crypto.tink.proto.KeyTemplate r0 = createEciesAeadHkdfKeyTemplate(r1, r2, r3, r4, r5, r6)
            com.google.crypto.tink.hybrid.HybridKeyTemplates.ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM = r0
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.EcPointFormat r3 = com.google.crypto.tink.proto.EcPointFormat.COMPRESSED
            com.google.crypto.tink.proto.KeyTemplate r4 = com.google.crypto.tink.aead.AeadKeyTemplates.AES128_GCM
            com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            byte[] r6 = com.google.crypto.tink.hybrid.HybridKeyTemplates.EMPTY_SALT
            com.google.crypto.tink.proto.KeyTemplate r0 = createEciesAeadHkdfKeyTemplate(r1, r2, r3, r4, r5, r6)
            com.google.crypto.tink.hybrid.HybridKeyTemplates.ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX = r0
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.EcPointFormat r3 = com.google.crypto.tink.proto.EcPointFormat.UNCOMPRESSED
            com.google.crypto.tink.proto.KeyTemplate r4 = com.google.crypto.tink.aead.AeadKeyTemplates.AES128_CTR_HMAC_SHA256
            com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            byte[] r6 = com.google.crypto.tink.hybrid.HybridKeyTemplates.EMPTY_SALT
            com.google.crypto.tink.proto.KeyTemplate r0 = createEciesAeadHkdfKeyTemplate(r1, r2, r3, r4, r5, r6)
            com.google.crypto.tink.hybrid.HybridKeyTemplates.ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256 = r0
            return
    }

    private HybridKeyTemplates() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.proto.KeyTemplate createEciesAeadHkdfKeyTemplate(com.google.crypto.tink.proto.EllipticCurveType r3, com.google.crypto.tink.proto.HashType r4, com.google.crypto.tink.proto.EcPointFormat r5, com.google.crypto.tink.proto.KeyTemplate r6, com.google.crypto.tink.proto.OutputPrefixType r7, byte[] r8) {
            com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat$Builder r0 = com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat.newBuilder()
            com.google.crypto.tink.proto.EciesAeadHkdfParams r1 = createEciesAeadHkdfParams(r3, r4, r5, r6, r8)
            com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat$Builder r0 = r0.setParams(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat r0 = (com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat) r0
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager r2 = new com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r2)
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r7)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setValue(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfParams createEciesAeadHkdfParams(com.google.crypto.tink.proto.EllipticCurveType r3, com.google.crypto.tink.proto.HashType r4, com.google.crypto.tink.proto.EcPointFormat r5, com.google.crypto.tink.proto.KeyTemplate r6, byte[] r7) {
            com.google.crypto.tink.proto.EciesHkdfKemParams$Builder r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.newBuilder()
            com.google.crypto.tink.proto.EciesHkdfKemParams$Builder r0 = r0.setCurveType(r3)
            com.google.crypto.tink.proto.EciesHkdfKemParams$Builder r0 = r0.setHkdfHashType(r4)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r7)
            com.google.crypto.tink.proto.EciesHkdfKemParams$Builder r0 = r0.setHkdfSalt(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r0
            com.google.crypto.tink.proto.EciesAeadDemParams$Builder r1 = com.google.crypto.tink.proto.EciesAeadDemParams.newBuilder()
            com.google.crypto.tink.proto.EciesAeadDemParams$Builder r1 = r1.setAeadDem(r6)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EciesAeadDemParams r1 = (com.google.crypto.tink.proto.EciesAeadDemParams) r1
            com.google.crypto.tink.proto.EciesAeadHkdfParams$Builder r2 = com.google.crypto.tink.proto.EciesAeadHkdfParams.newBuilder()
            com.google.crypto.tink.proto.EciesAeadHkdfParams$Builder r2 = r2.setKemParams(r0)
            com.google.crypto.tink.proto.EciesAeadHkdfParams$Builder r2 = r2.setDemParams(r1)
            com.google.crypto.tink.proto.EciesAeadHkdfParams$Builder r2 = r2.setEcPointFormat(r5)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.EciesAeadHkdfParams r2 = (com.google.crypto.tink.proto.EciesAeadHkdfParams) r2
            return r2
    }
}
