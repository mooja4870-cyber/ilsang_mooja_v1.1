package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes.dex */
public final class KeyTemplateProtoConverter {

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.KeyTemplateProtoConverter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.KeyTemplate$OutputPrefixType[] r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType = r0
                r0 = 1
                int[] r1 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L15
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r1 = move-exception
            L16:
                r1 = 2
                int[] r2 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L22
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r2 = move-exception
            L23:
                r2 = 3
                int[] r3 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r4 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L2f
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r3 = move-exception
            L30:
                r3 = 4
                int[] r4 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L3c
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
                com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r4
                int[] r4 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L51
                com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L51
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
                r4[r5] = r0     // Catch: java.lang.NoSuchFieldError -> L51
                goto L52
            L51:
                r0 = move-exception
            L52:
                int[] r0 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L5d
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L5d
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r0[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L5d
                goto L5e
            L5d:
                r0 = move-exception
            L5e:
                int[] r0 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L69
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
                goto L6a
            L69:
                r0 = move-exception
            L6a:
                int[] r0 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L75
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

    private KeyTemplateProtoConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.KeyTemplate fromByteArray(byte[] r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Le
            com.google.crypto.tink.proto.KeyTemplate r0 = com.google.crypto.tink.proto.KeyTemplate.parseFrom(r3, r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Le
            com.google.crypto.tink.KeyTemplate r1 = fromProto(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Le
            return r1
        Le:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "invalid key template"
            r1.<init>(r2, r0)
            throw r1
    }

    public static com.google.crypto.tink.KeyTemplate fromProto(com.google.crypto.tink.proto.KeyTemplate r3) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r3.getTypeUrl()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r3.getValue()
            byte[] r1 = r1.toByteArray()
            com.google.crypto.tink.proto.OutputPrefixType r2 = r3.getOutputPrefixType()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = prefixFromProto(r2)
            com.google.crypto.tink.KeyTemplate r0 = com.google.crypto.tink.KeyTemplate.create(r0, r1, r2)
            return r0
    }

    public static com.google.crypto.tink.KeyTemplate.OutputPrefixType prefixFromProto(com.google.crypto.tink.proto.OutputPrefixType r2) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
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
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
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

    private static com.google.crypto.tink.proto.OutputPrefixType prefixToProto(com.google.crypto.tink.KeyTemplate.OutputPrefixType r2) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.internal.KeyTemplateProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType
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
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
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

    public static byte[] toByteArray(com.google.crypto.tink.KeyTemplate r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate r0 = toProto(r1)
            byte[] r0 = r0.toByteArray()
            return r0
    }

    public static com.google.crypto.tink.proto.KeyTemplate toProto(com.google.crypto.tink.KeyTemplate r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            java.lang.String r1 = r2.getTypeUrl()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            byte[] r1 = r2.getValue()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setValue(r1)
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = r2.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r1 = prefixToProto(r1)
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setOutputPrefixType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTemplate r0 = (com.google.crypto.tink.proto.KeyTemplate) r0
            return r0
    }
}
