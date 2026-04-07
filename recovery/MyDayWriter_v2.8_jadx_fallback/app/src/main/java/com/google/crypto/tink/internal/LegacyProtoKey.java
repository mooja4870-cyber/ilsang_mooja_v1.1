package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class LegacyProtoKey extends com.google.crypto.tink.Key {
    private final com.google.crypto.tink.internal.ProtoKeySerialization serialization;

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.LegacyProtoKey$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.KeyData$KeyMaterialType[] r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType = r0
                r0 = 1
                int[] r1 = com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC     // Catch: java.lang.NoSuchFieldError -> L15
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r1 = move-exception
            L16:
                r1 = 2
                int[] r2 = com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE     // Catch: java.lang.NoSuchFieldError -> L22
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r2 = move-exception
            L23:
                com.google.crypto.tink.proto.OutputPrefixType[] r2 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r2
                int[] r2 = com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L37
                com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L37
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L37
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L37
                goto L38
            L37:
                r0 = move-exception
            L38:
                int[] r0 = com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L43
                com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L43
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L43
                goto L44
            L43:
                r0 = move-exception
            L44:
                int[] r0 = com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L50
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L50
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L50
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L50
                goto L51
            L50:
                r0 = move-exception
            L51:
                int[] r0 = com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L5d
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
                goto L5e
            L5d:
                r0 = move-exception
            L5e:
                return
        }
    }

    @com.google.errorprone.annotations.Immutable
    private static class LegacyProtoParametersNotForCreation extends com.google.crypto.tink.Parameters {
        private final com.google.crypto.tink.proto.OutputPrefixType outputPrefixType;
        private final java.lang.String typeUrl;

        private LegacyProtoParametersNotForCreation(java.lang.String r1, com.google.crypto.tink.proto.OutputPrefixType r2) {
                r0 = this;
                r0.<init>()
                r0.typeUrl = r1
                r0.outputPrefixType = r2
                return
        }

        /* synthetic */ LegacyProtoParametersNotForCreation(java.lang.String r1, com.google.crypto.tink.proto.OutputPrefixType r2, com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static java.lang.String outputPrefixToString(com.google.crypto.tink.proto.OutputPrefixType r2) {
                int[] r0 = com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
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

        @Override // com.google.crypto.tink.Parameters
        public boolean hasIdRequirement() {
                r2 = this;
                com.google.crypto.tink.proto.OutputPrefixType r0 = r2.outputPrefixType
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW
                if (r0 == r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.typeUrl
                com.google.crypto.tink.proto.OutputPrefixType r1 = r2.outputPrefixType
                java.lang.String r1 = outputPrefixToString(r1)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                java.lang.String r1 = "(typeUrl=%s, outputPrefixType=%s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }
    }

    public LegacyProtoKey(com.google.crypto.tink.internal.ProtoKeySerialization r1, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r2) throws java.security.GeneralSecurityException {
            r0 = this;
            r0.<init>()
            throwIfMissingAccess(r1, r2)
            r0.serialization = r1
            return
    }

    private static void throwIfMissingAccess(com.google.crypto.tink.internal.ProtoKeySerialization r2, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = r2.getKeyMaterialType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L10;
                case 2: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L14
        L10:
            com.google.crypto.tink.SecretKeyAccess.requireAccess(r3)
        L14:
            return
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(com.google.crypto.tink.Key r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.internal.LegacyProtoKey
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            com.google.crypto.tink.internal.LegacyProtoKey r0 = (com.google.crypto.tink.internal.LegacyProtoKey) r0
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = r0.serialization
            com.google.crypto.tink.proto.OutputPrefixType r2 = r0.getOutputPrefixType()
            com.google.crypto.tink.internal.ProtoKeySerialization r3 = r4.serialization
            com.google.crypto.tink.proto.OutputPrefixType r3 = r3.getOutputPrefixType()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1c
            return r1
        L1c:
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = r0.getKeyMaterialType()
            com.google.crypto.tink.internal.ProtoKeySerialization r3 = r4.serialization
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = r3.getKeyMaterialType()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2d
            return r1
        L2d:
            java.lang.String r2 = r0.getTypeUrl()
            com.google.crypto.tink.internal.ProtoKeySerialization r3 = r4.serialization
            java.lang.String r3 = r3.getTypeUrl()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3e
            return r1
        L3e:
            java.lang.Integer r2 = r0.getIdRequirementOrNull()
            com.google.crypto.tink.internal.ProtoKeySerialization r3 = r4.serialization
            java.lang.Integer r3 = r3.getIdRequirementOrNull()
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 != 0) goto L4f
            return r1
        L4f:
            com.google.crypto.tink.internal.ProtoKeySerialization r1 = r4.serialization
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.getValue()
            byte[] r1 = r1.toByteArray()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.getValue()
            byte[] r2 = r2.toByteArray()
            boolean r1 = com.google.crypto.tink.subtle.Bytes.equal(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public java.lang.Integer getIdRequirementOrNull() {
            r1 = this;
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = r1.serialization
            java.lang.Integer r0 = r0.getIdRequirementOrNull()
            return r0
    }

    @Override // com.google.crypto.tink.Key
    public com.google.crypto.tink.Parameters getParameters() {
            r4 = this;
            com.google.crypto.tink.internal.LegacyProtoKey$LegacyProtoParametersNotForCreation r0 = new com.google.crypto.tink.internal.LegacyProtoKey$LegacyProtoParametersNotForCreation
            com.google.crypto.tink.internal.ProtoKeySerialization r1 = r4.serialization
            java.lang.String r1 = r1.getTypeUrl()
            com.google.crypto.tink.internal.ProtoKeySerialization r2 = r4.serialization
            com.google.crypto.tink.proto.OutputPrefixType r2 = r2.getOutputPrefixType()
            r3 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    public com.google.crypto.tink.internal.ProtoKeySerialization getSerialization(@javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = r1.serialization
            throwIfMissingAccess(r0, r2)
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = r1.serialization
            return r0
    }
}
