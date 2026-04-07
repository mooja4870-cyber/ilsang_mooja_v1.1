package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class ProtoParametersSerialization implements com.google.crypto.tink.internal.Serialization {
    private final com.google.crypto.tink.proto.KeyTemplate keyTemplate;
    private final com.google.crypto.tink.util.Bytes objectIdentifier;

    private ProtoParametersSerialization(com.google.crypto.tink.proto.KeyTemplate r2) {
            r1 = this;
            r1.<init>()
            r1.keyTemplate = r2
            java.lang.String r0 = r2.getTypeUrl()
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r0)
            r1.objectIdentifier = r0
            return
    }

    public static com.google.crypto.tink.internal.ProtoParametersSerialization create(com.google.crypto.tink.proto.KeyTemplate r1) {
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = new com.google.crypto.tink.internal.ProtoParametersSerialization
            r0.<init>(r1)
            return r0
    }

    public static com.google.crypto.tink.internal.ProtoParametersSerialization create(java.lang.String r2, com.google.crypto.tink.proto.OutputPrefixType r3, com.google.crypto.tink.shaded.protobuf.MessageLite r4) {
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r2)
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setOutputPrefixType(r3)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r4.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setValue(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTemplate r0 = (com.google.crypto.tink.proto.KeyTemplate) r0
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = create(r0)
            return r0
    }

    public com.google.crypto.tink.proto.KeyTemplate getKeyTemplate() {
            r1 = this;
            com.google.crypto.tink.proto.KeyTemplate r0 = r1.keyTemplate
            return r0
    }

    @Override // com.google.crypto.tink.internal.Serialization
    public com.google.crypto.tink.util.Bytes getObjectIdentifier() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.objectIdentifier
            return r0
    }
}
