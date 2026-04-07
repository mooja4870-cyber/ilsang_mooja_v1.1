package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class KeyTemplate {
    private final com.google.crypto.tink.proto.KeyTemplate kt;

    /* JADX INFO: renamed from: com.google.crypto.tink.KeyTemplate$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.KeyTemplate$OutputPrefixType[] r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType = r0
                r0 = 1
                int[] r1 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L15
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r1 = move-exception
            L16:
                r1 = 2
                int[] r2 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L22
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r2 = move-exception
            L23:
                r2 = 3
                int[] r3 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r4 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L2f
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r3 = move-exception
            L30:
                r3 = 4
                int[] r4 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r5 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L3c
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r4 = move-exception
            L3d:
                com.google.crypto.tink.proto.OutputPrefixType[] r4 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r4
                int[] r4 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L51
                com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L51
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
                r4[r5] = r0     // Catch: java.lang.NoSuchFieldError -> L51
                goto L52
            L51:
                r0 = move-exception
            L52:
                int[] r0 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L5d
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L5d
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r0[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L5d
                goto L5e
            L5d:
                r0 = move-exception
            L5e:
                int[] r0 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L69
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
                goto L6a
            L69:
                r0 = move-exception
            L6a:
                int[] r0 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L75
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L75
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L75
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L75
                goto L76
            L75:
                r0 = move-exception
            L76:
                return
        }
    }

    public enum OutputPrefixType extends java.lang.Enum<com.google.crypto.tink.KeyTemplate.OutputPrefixType> {
        private static final /* synthetic */ com.google.crypto.tink.KeyTemplate.OutputPrefixType[] $VALUES = null;
        public static final com.google.crypto.tink.KeyTemplate.OutputPrefixType CRUNCHY = null;
        public static final com.google.crypto.tink.KeyTemplate.OutputPrefixType LEGACY = null;
        public static final com.google.crypto.tink.KeyTemplate.OutputPrefixType RAW = null;
        public static final com.google.crypto.tink.KeyTemplate.OutputPrefixType TINK = null;

        static {
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = new com.google.crypto.tink.KeyTemplate$OutputPrefixType
                java.lang.String r1 = "TINK"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK = r0
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = new com.google.crypto.tink.KeyTemplate$OutputPrefixType
                java.lang.String r1 = "LEGACY"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.crypto.tink.KeyTemplate.OutputPrefixType.LEGACY = r0
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = new com.google.crypto.tink.KeyTemplate$OutputPrefixType
                java.lang.String r1 = "RAW"
                r2 = 2
                r0.<init>(r1, r2)
                com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW = r0
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = new com.google.crypto.tink.KeyTemplate$OutputPrefixType
                java.lang.String r1 = "CRUNCHY"
                r2 = 3
                r0.<init>(r1, r2)
                com.google.crypto.tink.KeyTemplate.OutputPrefixType.CRUNCHY = r0
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.LEGACY
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.CRUNCHY
                com.google.crypto.tink.KeyTemplate$OutputPrefixType[] r0 = new com.google.crypto.tink.KeyTemplate.OutputPrefixType[]{r0, r1, r2, r3}
                com.google.crypto.tink.KeyTemplate.OutputPrefixType.$VALUES = r0
                return
        }

        OutputPrefixType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.crypto.tink.KeyTemplate.OutputPrefixType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.KeyTemplate$OutputPrefixType> r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = (com.google.crypto.tink.KeyTemplate.OutputPrefixType) r0
                return r0
        }

        public static com.google.crypto.tink.KeyTemplate.OutputPrefixType[] values() {
                com.google.crypto.tink.KeyTemplate$OutputPrefixType[] r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.KeyTemplate$OutputPrefixType[] r0 = (com.google.crypto.tink.KeyTemplate.OutputPrefixType[]) r0
                return r0
        }
    }

    private KeyTemplate(com.google.crypto.tink.proto.KeyTemplate r1) {
            r0 = this;
            r0.<init>()
            r0.kt = r1
            return
    }

    public static com.google.crypto.tink.KeyTemplate create(java.lang.String r3, byte[] r4, com.google.crypto.tink.KeyTemplate.OutputPrefixType r5) {
            com.google.crypto.tink.KeyTemplate r0 = new com.google.crypto.tink.KeyTemplate
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r3)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r4)
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setValue(r2)
            com.google.crypto.tink.proto.OutputPrefixType r2 = toProto(r5)
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            r0.<init>(r1)
            return r0
    }

    static com.google.crypto.tink.KeyTemplate.OutputPrefixType fromProto(com.google.crypto.tink.proto.OutputPrefixType r2) {
            int[] r0 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L1c;
                case 2: goto L19;
                case 3: goto L16;
                case 4: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown output prefix type"
            r0.<init>(r1)
            throw r0
        L13:
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.CRUNCHY
            return r0
        L16:
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            return r0
        L19:
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.LEGACY
            return r0
        L1c:
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            return r0
    }

    static com.google.crypto.tink.proto.OutputPrefixType toProto(com.google.crypto.tink.KeyTemplate.OutputPrefixType r2) {
            int[] r0 = com.google.crypto.tink.KeyTemplate.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L1c;
                case 2: goto L19;
                case 3: goto L16;
                case 4: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown output prefix type"
            r0.<init>(r1)
            throw r0
        L13:
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY
            return r0
        L16:
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            return r0
        L19:
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY
            return r0
        L1c:
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            return r0
    }

    public com.google.crypto.tink.KeyTemplate.OutputPrefixType getOutputPrefixType() {
            r1 = this;
            com.google.crypto.tink.proto.KeyTemplate r0 = r1.kt
            com.google.crypto.tink.proto.OutputPrefixType r0 = r0.getOutputPrefixType()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = fromProto(r0)
            return r0
    }

    com.google.crypto.tink.proto.KeyTemplate getProto() {
            r1 = this;
            com.google.crypto.tink.proto.KeyTemplate r0 = r1.kt
            return r0
    }

    public java.lang.String getTypeUrl() {
            r1 = this;
            com.google.crypto.tink.proto.KeyTemplate r0 = r1.kt
            java.lang.String r0 = r0.getTypeUrl()
            return r0
    }

    public byte[] getValue() {
            r1 = this;
            com.google.crypto.tink.proto.KeyTemplate r0 = r1.kt
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()
            byte[] r0 = r0.toByteArray()
            return r0
    }
}
