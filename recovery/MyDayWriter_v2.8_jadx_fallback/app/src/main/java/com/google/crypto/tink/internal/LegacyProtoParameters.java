package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class LegacyProtoParameters extends com.google.crypto.tink.Parameters {
    private final com.google.crypto.tink.internal.ProtoParametersSerialization serialization;

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.LegacyProtoParameters$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.internal.LegacyProtoParameters.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r0
                int[] r0 = com.google.crypto.tink.internal.LegacyProtoParameters.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.internal.LegacyProtoParameters.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.internal.LegacyProtoParameters.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.internal.LegacyProtoParameters.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                return
        }
    }

    public LegacyProtoParameters(com.google.crypto.tink.internal.ProtoParametersSerialization r1) {
            r0 = this;
            r0.<init>()
            r0.serialization = r1
            return
    }

    private static java.lang.String outputPrefixToString(com.google.crypto.tink.proto.OutputPrefixType r2) {
            int[] r0 = com.google.crypto.tink.internal.LegacyProtoParameters.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L17;
                case 2: goto L14;
                case 3: goto L11;
                case 4: goto Le;
                default: goto Lb;
            }
        Lb:
            java.lang.String r0 = "UNKNOWN"
            return r0
        Le:
            java.lang.String r0 = "CRUNCHY"
            return r0
        L11:
            java.lang.String r0 = "RAW"
            return r0
        L14:
            java.lang.String r0 = "LEGACY"
            return r0
        L17:
            java.lang.String r0 = "TINK"
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.internal.LegacyProtoParameters
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            com.google.crypto.tink.internal.LegacyProtoParameters r0 = (com.google.crypto.tink.internal.LegacyProtoParameters) r0
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = r0.serialization
            com.google.crypto.tink.internal.ProtoParametersSerialization r2 = r4.serialization
            com.google.crypto.tink.proto.KeyTemplate r2 = r2.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r2 = r2.getOutputPrefixType()
            com.google.crypto.tink.proto.KeyTemplate r3 = r0.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r3 = r3.getOutputPrefixType()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L55
            com.google.crypto.tink.internal.ProtoParametersSerialization r2 = r4.serialization
            com.google.crypto.tink.proto.KeyTemplate r2 = r2.getKeyTemplate()
            java.lang.String r2 = r2.getTypeUrl()
            com.google.crypto.tink.proto.KeyTemplate r3 = r0.getKeyTemplate()
            java.lang.String r3 = r3.getTypeUrl()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L55
            com.google.crypto.tink.internal.ProtoParametersSerialization r2 = r4.serialization
            com.google.crypto.tink.proto.KeyTemplate r2 = r2.getKeyTemplate()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.getValue()
            com.google.crypto.tink.proto.KeyTemplate r3 = r0.getKeyTemplate()
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r3.getValue()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L55
            r1 = 1
            goto L56
        L55:
        L56:
            return r1
    }

    public com.google.crypto.tink.internal.ProtoParametersSerialization getSerialization() {
            r1 = this;
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = r1.serialization
            return r0
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
            r2 = this;
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = r2.serialization
            com.google.crypto.tink.proto.KeyTemplate r0 = r0.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r0 = r0.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            if (r0 == r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public int hashCode() {
            r2 = this;
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = r2.serialization
            com.google.crypto.tink.proto.KeyTemplate r0 = r0.getKeyTemplate()
            com.google.crypto.tink.internal.ProtoParametersSerialization r1 = r2.serialization
            com.google.crypto.tink.util.Bytes r1 = r1.getObjectIdentifier()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = r2.serialization
            com.google.crypto.tink.proto.KeyTemplate r0 = r0.getKeyTemplate()
            java.lang.String r0 = r0.getTypeUrl()
            com.google.crypto.tink.internal.ProtoParametersSerialization r1 = r2.serialization
            com.google.crypto.tink.proto.KeyTemplate r1 = r1.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r1 = r1.getOutputPrefixType()
            java.lang.String r1 = outputPrefixToString(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "(typeUrl=%s, outputPrefixType=%s)"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
