package com.google.crypto.tink.tinkkey.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class ProtoKey implements com.google.crypto.tink.tinkkey.TinkKey {
    private final boolean hasSecret;
    private final com.google.crypto.tink.proto.KeyData keyData;
    private final com.google.crypto.tink.KeyTemplate.OutputPrefixType outputPrefixType;

    public ProtoKey(com.google.crypto.tink.proto.KeyData r2, com.google.crypto.tink.KeyTemplate.OutputPrefixType r3) {
            r1 = this;
            r1.<init>()
            boolean r0 = isSecret(r2)
            r1.hasSecret = r0
            r1.keyData = r2
            r1.outputPrefixType = r3
            return
    }

    private static boolean isSecret(com.google.crypto.tink.proto.KeyData r2) {
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = r2.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL
            if (r0 == r1) goto L1b
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = r2.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            if (r0 == r1) goto L1b
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = r2.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE
            if (r0 != r1) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            return r0
    }

    @Override // com.google.crypto.tink.tinkkey.TinkKey
    public com.google.crypto.tink.KeyTemplate getKeyTemplate() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public com.google.crypto.tink.KeyTemplate.OutputPrefixType getOutputPrefixType() {
            r1 = this;
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = r1.outputPrefixType
            return r0
    }

    public com.google.crypto.tink.proto.KeyData getProtoKey() {
            r1 = this;
            com.google.crypto.tink.proto.KeyData r0 = r1.keyData
            return r0
    }

    @Override // com.google.crypto.tink.tinkkey.TinkKey
    public boolean hasSecret() {
            r1 = this;
            boolean r0 = r1.hasSecret
            return r0
    }
}
