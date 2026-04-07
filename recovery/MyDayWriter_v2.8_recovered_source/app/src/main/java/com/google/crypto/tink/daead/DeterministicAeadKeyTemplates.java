package com.google.crypto.tink.daead;

/* JADX INFO: loaded from: classes.dex */
public final class DeterministicAeadKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_SIV = null;

    static {
            r0 = 64
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesSivKeyTemplate(r0)
            com.google.crypto.tink.daead.DeterministicAeadKeyTemplates.AES256_SIV = r0
            return
    }

    private DeterministicAeadKeyTemplates() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.proto.KeyTemplate createAesSivKeyTemplate(int r3) {
            com.google.crypto.tink.proto.AesSivKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesSivKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesSivKeyFormat$Builder r0 = r0.setKeySize(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesSivKeyFormat r0 = (com.google.crypto.tink.proto.AesSivKeyFormat) r0
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setValue(r2)
            com.google.crypto.tink.daead.AesSivKeyManager r2 = new com.google.crypto.tink.daead.AesSivKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r2)
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }
}
