package com.google.crypto.tink.prf;

/* JADX INFO: loaded from: classes.dex */
public final class PrfKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate AES_CMAC_PRF = null;
    public static final com.google.crypto.tink.proto.KeyTemplate HKDF_SHA256 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate HMAC_SHA256_PRF = null;
    public static final com.google.crypto.tink.proto.KeyTemplate HMAC_SHA512_PRF = null;

    static {
            com.google.crypto.tink.proto.KeyTemplate r0 = createHkdfKeyTemplate()
            com.google.crypto.tink.prf.PrfKeyTemplates.HKDF_SHA256 = r0
            r0 = 32
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.KeyTemplate r0 = createHmacTemplate(r0, r1)
            com.google.crypto.tink.prf.PrfKeyTemplates.HMAC_SHA256_PRF = r0
            r0 = 64
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512
            com.google.crypto.tink.proto.KeyTemplate r0 = createHmacTemplate(r0, r1)
            com.google.crypto.tink.prf.PrfKeyTemplates.HMAC_SHA512_PRF = r0
            com.google.crypto.tink.proto.KeyTemplate r0 = createAes256CmacTemplate()
            com.google.crypto.tink.prf.PrfKeyTemplates.AES_CMAC_PRF = r0
            return
    }

    private PrfKeyTemplates() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.crypto.tink.proto.KeyTemplate createAes256CmacTemplate() {
            com.google.crypto.tink.proto.AesCmacPrfKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesCmacPrfKeyFormat.newBuilder()
            r1 = 32
            com.google.crypto.tink.proto.AesCmacPrfKeyFormat$Builder r0 = r0.setKeySize(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesCmacPrfKeyFormat r0 = (com.google.crypto.tink.proto.AesCmacPrfKeyFormat) r0
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.prf.AesCmacPrfKeyManager r2 = new com.google.crypto.tink.prf.AesCmacPrfKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setValue(r2)
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }

    private static com.google.crypto.tink.proto.KeyTemplate createHkdfKeyTemplate() {
            com.google.crypto.tink.proto.HkdfPrfKeyFormat$Builder r0 = com.google.crypto.tink.proto.HkdfPrfKeyFormat.newBuilder()
            r1 = 32
            com.google.crypto.tink.proto.HkdfPrfKeyFormat$Builder r0 = r0.setKeySize(r1)
            com.google.crypto.tink.proto.HkdfPrfParams$Builder r1 = com.google.crypto.tink.proto.HkdfPrfParams.newBuilder()
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HkdfPrfParams$Builder r1 = r1.setHash(r2)
            com.google.crypto.tink.proto.HkdfPrfKeyFormat$Builder r0 = r0.setParams(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.HkdfPrfKeyFormat r0 = (com.google.crypto.tink.proto.HkdfPrfKeyFormat) r0
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setValue(r2)
            java.lang.String r2 = com.google.crypto.tink.prf.HkdfPrfKeyManager.staticKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r2)
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }

    private static com.google.crypto.tink.proto.KeyTemplate createHmacTemplate(int r4, com.google.crypto.tink.proto.HashType r5) {
            com.google.crypto.tink.proto.HmacPrfParams$Builder r0 = com.google.crypto.tink.proto.HmacPrfParams.newBuilder()
            com.google.crypto.tink.proto.HmacPrfParams$Builder r0 = r0.setHash(r5)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.HmacPrfParams r0 = (com.google.crypto.tink.proto.HmacPrfParams) r0
            com.google.crypto.tink.proto.HmacPrfKeyFormat$Builder r1 = com.google.crypto.tink.proto.HmacPrfKeyFormat.newBuilder()
            com.google.crypto.tink.proto.HmacPrfKeyFormat$Builder r1 = r1.setParams(r0)
            com.google.crypto.tink.proto.HmacPrfKeyFormat$Builder r1 = r1.setKeySize(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.HmacPrfKeyFormat r1 = (com.google.crypto.tink.proto.HmacPrfKeyFormat) r1
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.prf.HmacPrfKeyManager r3 = new com.google.crypto.tink.prf.HmacPrfKeyManager
            r3.<init>()
            java.lang.String r3 = r3.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setTypeUrl(r3)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setValue(r3)
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setOutputPrefixType(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.KeyTemplate r2 = (com.google.crypto.tink.proto.KeyTemplate) r2
            return r2
    }
}
