package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class ProtoKeySerialization implements com.google.crypto.tink.internal.Serialization {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType;
    private final com.google.crypto.tink.util.Bytes objectIdentifier;
    private final com.google.crypto.tink.proto.OutputPrefixType outputPrefixType;
    private final java.lang.String typeUrl;
    private final com.google.crypto.tink.shaded.protobuf.ByteString value;

    private ProtoKeySerialization(java.lang.String r2, com.google.crypto.tink.shaded.protobuf.ByteString r3, com.google.crypto.tink.proto.KeyData.KeyMaterialType r4, com.google.crypto.tink.proto.OutputPrefixType r5, @javax.annotation.Nullable java.lang.Integer r6) {
            r1 = this;
            r1.<init>()
            r1.typeUrl = r2
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r2)
            r1.objectIdentifier = r0
            r1.value = r3
            r1.keyMaterialType = r4
            r1.outputPrefixType = r5
            r1.idRequirement = r6
            return
    }

    public static com.google.crypto.tink.internal.ProtoKeySerialization create(java.lang.String r8, com.google.crypto.tink.shaded.protobuf.ByteString r9, com.google.crypto.tink.proto.KeyData.KeyMaterialType r10, com.google.crypto.tink.proto.OutputPrefixType r11, @javax.annotation.Nullable java.lang.Integer r12) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            if (r11 != r0) goto Lf
            if (r12 != 0) goto L7
            goto L11
        L7:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Keys with output prefix type raw should not have an id requirement."
            r0.<init>(r1)
            throw r0
        Lf:
            if (r12 == 0) goto L1c
        L11:
            com.google.crypto.tink.internal.ProtoKeySerialization r2 = new com.google.crypto.tink.internal.ProtoKeySerialization
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L1c:
            r3 = r8
            r4 = r9
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "Keys with output prefix type different from raw should have an id requirement."
            r8.<init>(r9)
            throw r8
    }

    @javax.annotation.Nullable
    public java.lang.Integer getIdRequirementOrNull() {
            r1 = this;
            java.lang.Integer r0 = r1.idRequirement
            return r0
    }

    public com.google.crypto.tink.proto.KeyData.KeyMaterialType getKeyMaterialType() {
            r1 = this;
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = r1.keyMaterialType
            return r0
    }

    @Override // com.google.crypto.tink.internal.Serialization
    public com.google.crypto.tink.util.Bytes getObjectIdentifier() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.objectIdentifier
            return r0
    }

    public com.google.crypto.tink.proto.OutputPrefixType getOutputPrefixType() {
            r1 = this;
            com.google.crypto.tink.proto.OutputPrefixType r0 = r1.outputPrefixType
            return r0
    }

    public java.lang.String getTypeUrl() {
            r1 = this;
            java.lang.String r0 = r1.typeUrl
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.ByteString getValue() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.value
            return r0
    }
}
