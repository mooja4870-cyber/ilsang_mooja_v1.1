package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes.dex */
public final class MacKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate AES_CMAC = null;
    public static final com.google.crypto.tink.proto.KeyTemplate HMAC_SHA256_128BITTAG = null;
    public static final com.google.crypto.tink.proto.KeyTemplate HMAC_SHA256_256BITTAG = null;
    public static final com.google.crypto.tink.proto.KeyTemplate HMAC_SHA512_256BITTAG = null;
    public static final com.google.crypto.tink.proto.KeyTemplate HMAC_SHA512_512BITTAG = null;

    static {
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            r1 = 32
            r2 = 16
            com.google.crypto.tink.proto.KeyTemplate r0 = createHmacKeyTemplate(r1, r2, r0)
            com.google.crypto.tink.mac.MacKeyTemplates.HMAC_SHA256_128BITTAG = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.KeyTemplate r0 = createHmacKeyTemplate(r1, r1, r0)
            com.google.crypto.tink.mac.MacKeyTemplates.HMAC_SHA256_256BITTAG = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA512
            r3 = 64
            com.google.crypto.tink.proto.KeyTemplate r0 = createHmacKeyTemplate(r3, r1, r0)
            com.google.crypto.tink.mac.MacKeyTemplates.HMAC_SHA512_256BITTAG = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA512
            com.google.crypto.tink.proto.KeyTemplate r0 = createHmacKeyTemplate(r3, r3, r0)
            com.google.crypto.tink.mac.MacKeyTemplates.HMAC_SHA512_512BITTAG = r0
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.proto.AesCmacKeyFormat$Builder r3 = com.google.crypto.tink.proto.AesCmacKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesCmacKeyFormat$Builder r1 = r3.setKeySize(r1)
            com.google.crypto.tink.proto.AesCmacParams$Builder r3 = com.google.crypto.tink.proto.AesCmacParams.newBuilder()
            com.google.crypto.tink.proto.AesCmacParams$Builder r2 = r3.setTagSize(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.AesCmacParams r2 = (com.google.crypto.tink.proto.AesCmacParams) r2
            com.google.crypto.tink.proto.AesCmacKeyFormat$Builder r1 = r1.setParams(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesCmacKeyFormat r1 = (com.google.crypto.tink.proto.AesCmacKeyFormat) r1
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setValue(r1)
            com.google.crypto.tink.mac.AesCmacKeyManager r1 = new com.google.crypto.tink.mac.AesCmacKeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setOutputPrefixType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTemplate r0 = (com.google.crypto.tink.proto.KeyTemplate) r0
            com.google.crypto.tink.mac.MacKeyTemplates.AES_CMAC = r0
            return
    }

    private MacKeyTemplates() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.proto.KeyTemplate createHmacKeyTemplate(int r4, int r5, com.google.crypto.tink.proto.HashType r6) {
            com.google.crypto.tink.proto.HmacParams$Builder r0 = com.google.crypto.tink.proto.HmacParams.newBuilder()
            com.google.crypto.tink.proto.HmacParams$Builder r0 = r0.setHash(r6)
            com.google.crypto.tink.proto.HmacParams$Builder r0 = r0.setTagSize(r5)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.HmacParams r0 = (com.google.crypto.tink.proto.HmacParams) r0
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r1 = com.google.crypto.tink.proto.HmacKeyFormat.newBuilder()
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r1 = r1.setParams(r0)
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r1 = r1.setKeySize(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.HmacKeyFormat r1 = (com.google.crypto.tink.proto.HmacKeyFormat) r1
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setValue(r3)
            com.google.crypto.tink.mac.HmacKeyManager r3 = new com.google.crypto.tink.mac.HmacKeyManager
            r3.<init>()
            java.lang.String r3 = r3.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setTypeUrl(r3)
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setOutputPrefixType(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.KeyTemplate r2 = (com.google.crypto.tink.proto.KeyTemplate) r2
            return r2
    }
}
