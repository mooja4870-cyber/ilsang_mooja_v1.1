package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes.dex */
final class HmacProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER = null;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.mac.HmacKey, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER = null;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER = null;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.mac.HmacParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER = null;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.HmacKey";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.mac.HmacProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r0
                r0 = 1
                int[] r1 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L15
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r1 = move-exception
            L16:
                r1 = 2
                int[] r2 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L22
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r2 = move-exception
            L23:
                r2 = 3
                int[] r3 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L2f
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r3 = move-exception
            L30:
                r3 = 4
                int[] r4 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L3c
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r4 = move-exception
            L3d:
                com.google.crypto.tink.proto.HashType[] r4 = com.google.crypto.tink.proto.HashType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType = r4
                int[] r4 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L51
                com.google.crypto.tink.proto.HashType r5 = com.google.crypto.tink.proto.HashType.SHA1     // Catch: java.lang.NoSuchFieldError -> L51
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
                r4[r5] = r0     // Catch: java.lang.NoSuchFieldError -> L51
                goto L52
            L51:
                r0 = move-exception
            L52:
                int[] r0 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L5d
                com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA224     // Catch: java.lang.NoSuchFieldError -> L5d
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r0[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L5d
                goto L5e
            L5d:
                r0 = move-exception
            L5e:
                int[] r0 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L69
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
                goto L6a
            L69:
                r0 = move-exception
            L6a:
                int[] r0 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L75
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L75
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L75
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L75
                goto L76
            L75:
                r0 = move-exception
            L76:
                int[] r0 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L82
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L82
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L82
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L82
                goto L83
            L82:
                r0 = move-exception
            L83:
                return
        }
    }

    public static /* synthetic */ com.google.crypto.tink.mac.HmacParameters $r8$lambda$D9KNC5jR9YqvL7EOqeF5Ognp3rc(com.google.crypto.tink.internal.ProtoParametersSerialization r0) {
            com.google.crypto.tink.mac.HmacParameters r0 = parseParameters(r0)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.mac.HmacKey $r8$lambda$IoMtUrUtLG8MzwN1oB0SwnssxTQ(com.google.crypto.tink.internal.ProtoKeySerialization r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.mac.HmacKey r0 = parseKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoParametersSerialization $r8$lambda$tC06darXYVAj1L6fPLrf2h7YmuE(com.google.crypto.tink.mac.HmacParameters r0) {
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = serializeParameters(r0)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoKeySerialization $r8$lambda$tyWLoSUw9rNzlp_7oBscuA3ucvE(com.google.crypto.tink.mac.HmacKey r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = serializeKey(r0, r1)
            return r0
    }

    static {
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.HmacKey"
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r0)
            com.google.crypto.tink.mac.HmacProtoSerialization.TYPE_URL_BYTES = r0
            com.google.crypto.tink.mac.HmacProtoSerialization$$ExternalSyntheticLambda0 r0 = new com.google.crypto.tink.mac.HmacProtoSerialization$$ExternalSyntheticLambda0
            r0.<init>()
            java.lang.Class<com.google.crypto.tink.mac.HmacParameters> r1 = com.google.crypto.tink.mac.HmacParameters.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersSerializer r0 = com.google.crypto.tink.internal.ParametersSerializer.create(r0, r1, r2)
            com.google.crypto.tink.mac.HmacProtoSerialization.PARAMETERS_SERIALIZER = r0
            com.google.crypto.tink.mac.HmacProtoSerialization$$ExternalSyntheticLambda1 r0 = new com.google.crypto.tink.mac.HmacProtoSerialization$$ExternalSyntheticLambda1
            r0.<init>()
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.mac.HmacProtoSerialization.TYPE_URL_BYTES
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersParser r0 = com.google.crypto.tink.internal.ParametersParser.create(r0, r1, r2)
            com.google.crypto.tink.mac.HmacProtoSerialization.PARAMETERS_PARSER = r0
            com.google.crypto.tink.mac.HmacProtoSerialization$$ExternalSyntheticLambda2 r0 = new com.google.crypto.tink.mac.HmacProtoSerialization$$ExternalSyntheticLambda2
            r0.<init>()
            java.lang.Class<com.google.crypto.tink.mac.HmacKey> r1 = com.google.crypto.tink.mac.HmacKey.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeySerializer r0 = com.google.crypto.tink.internal.KeySerializer.create(r0, r1, r2)
            com.google.crypto.tink.mac.HmacProtoSerialization.KEY_SERIALIZER = r0
            com.google.crypto.tink.mac.HmacProtoSerialization$$ExternalSyntheticLambda3 r0 = new com.google.crypto.tink.mac.HmacProtoSerialization$$ExternalSyntheticLambda3
            r0.<init>()
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.mac.HmacProtoSerialization.TYPE_URL_BYTES
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeyParser r0 = com.google.crypto.tink.internal.KeyParser.create(r0, r1, r2)
            com.google.crypto.tink.mac.HmacProtoSerialization.KEY_PARSER = r0
            return
    }

    private HmacProtoSerialization() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.crypto.tink.proto.HmacParams getProtoParams(com.google.crypto.tink.mac.HmacParameters r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.HmacParams$Builder r0 = com.google.crypto.tink.proto.HmacParams.newBuilder()
            int r1 = r2.getCryptographicTagSizeBytes()
            com.google.crypto.tink.proto.HmacParams$Builder r0 = r0.setTagSize(r1)
            com.google.crypto.tink.mac.HmacParameters$HashType r1 = r2.getHashType()
            com.google.crypto.tink.proto.HashType r1 = toProtoHashType(r1)
            com.google.crypto.tink.proto.HmacParams$Builder r0 = r0.setHash(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.HmacParams r0 = (com.google.crypto.tink.proto.HmacParams) r0
            return r0
    }

    private static com.google.crypto.tink.mac.HmacKey parseKey(com.google.crypto.tink.internal.ProtoKeySerialization r5, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r6) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r5.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.HmacKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L97
        Ld:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r5.getValue()     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.proto.HmacKey r0 = com.google.crypto.tink.proto.HmacKey.parseFrom(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            int r1 = r0.getVersion()     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            if (r1 != 0) goto L84
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = com.google.crypto.tink.mac.HmacParameters.builder()     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.getKeyValue()     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            int r2 = r2.size()     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = r1.setKeySizeBytes(r2)     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.proto.HmacParams r2 = r0.getParams()     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            int r2 = r2.getTagSize()     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = r1.setTagSizeBytes(r2)     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.proto.HmacParams r2 = r0.getParams()     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.proto.HashType r2 = r2.getHash()     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.mac.HmacParameters$HashType r2 = toHashType(r2)     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = r1.setHashType(r2)     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.proto.OutputPrefixType r2 = r5.getOutputPrefixType()     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.mac.HmacParameters$Variant r2 = toVariant(r2)     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = r1.setVariant(r2)     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.mac.HmacParameters r1 = r1.build()     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.mac.HmacKey$Builder r2 = com.google.crypto.tink.mac.HmacKey.builder()     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.mac.HmacKey$Builder r2 = r2.setParameters(r1)     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r0.getKeyValue()     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            byte[] r3 = r3.toByteArray()     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.SecretKeyAccess r4 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r6)     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.util.SecretBytes r3 = com.google.crypto.tink.util.SecretBytes.copyFrom(r3, r4)     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.mac.HmacKey$Builder r2 = r2.setKeyBytes(r3)     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            java.lang.Integer r3 = r5.getIdRequirementOrNull()     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.mac.HmacKey$Builder r2 = r2.setIdRequirement(r3)     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.mac.HmacKey r2 = r2.build()     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            return r2
        L84:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            java.lang.String r2 = "Only version 0 keys are accepted"
            r1.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            throw r1     // Catch: java.lang.IllegalArgumentException -> L8c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
        L8c:
            r0 = move-exception
            goto L8f
        L8e:
            r0 = move-exception
        L8f:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parsing HmacKey failed"
            r1.<init>(r2)
            throw r1
        L97:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Wrong type URL in call to HmacProtoSerialization.parseKey"
            r0.<init>(r1)
            throw r0
    }

    private static com.google.crypto.tink.mac.HmacParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate r0 = r4.getKeyTemplate()
            java.lang.String r0 = r0.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.HmacKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8b
        L11:
            com.google.crypto.tink.proto.KeyTemplate r0 = r4.getKeyTemplate()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L82
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L82
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L82
            com.google.crypto.tink.proto.HmacKeyFormat r0 = com.google.crypto.tink.proto.HmacKeyFormat.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L82
            int r1 = r0.getVersion()
            if (r1 != 0) goto L65
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = com.google.crypto.tink.mac.HmacParameters.builder()
            int r2 = r0.getKeySize()
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = r1.setKeySizeBytes(r2)
            com.google.crypto.tink.proto.HmacParams r2 = r0.getParams()
            int r2 = r2.getTagSize()
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = r1.setTagSizeBytes(r2)
            com.google.crypto.tink.proto.HmacParams r2 = r0.getParams()
            com.google.crypto.tink.proto.HashType r2 = r2.getHash()
            com.google.crypto.tink.mac.HmacParameters$HashType r2 = toHashType(r2)
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = r1.setHashType(r2)
            com.google.crypto.tink.proto.KeyTemplate r2 = r4.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r2 = r2.getOutputPrefixType()
            com.google.crypto.tink.mac.HmacParameters$Variant r2 = toVariant(r2)
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = r1.setVariant(r2)
            com.google.crypto.tink.mac.HmacParameters r1 = r1.build()
            return r1
        L65:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Parsing HmacParameters failed: unknown Version "
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r0.getVersion()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L82:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parsing HmacParameters failed: "
            r1.<init>(r2, r0)
            throw r1
        L8b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wrong type URL in call to HmacProtoSerialization.parseParameters: "
            java.lang.StringBuilder r1 = r1.append(r2)
            com.google.crypto.tink.proto.KeyTemplate r2 = r4.getKeyTemplate()
            java.lang.String r2 = r2.getTypeUrl()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.MutableSerializationRegistry r0 = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance()
            register(r0)
            return
    }

    public static void register(com.google.crypto.tink.internal.MutableSerializationRegistry r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.mac.HmacParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.mac.HmacProtoSerialization.PARAMETERS_SERIALIZER
            r1.registerParametersSerializer(r0)
            com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.mac.HmacProtoSerialization.PARAMETERS_PARSER
            r1.registerParametersParser(r0)
            com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.mac.HmacKey, com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.mac.HmacProtoSerialization.KEY_SERIALIZER
            r1.registerKeySerializer(r0)
            com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.mac.HmacProtoSerialization.KEY_PARSER
            r1.registerKeyParser(r0)
            return
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.mac.HmacKey r5, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r6) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.HmacKey$Builder r0 = com.google.crypto.tink.proto.HmacKey.newBuilder()
            com.google.crypto.tink.mac.HmacParameters r1 = r5.getParameters()
            com.google.crypto.tink.proto.HmacParams r1 = getProtoParams(r1)
            com.google.crypto.tink.proto.HmacKey$Builder r0 = r0.setParams(r1)
            com.google.crypto.tink.util.SecretBytes r1 = r5.getKeyBytes()
            com.google.crypto.tink.SecretKeyAccess r2 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r6)
            byte[] r1 = r1.toByteArray(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            com.google.crypto.tink.proto.HmacKey$Builder r0 = r0.setKeyValue(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.HmacKey r0 = (com.google.crypto.tink.proto.HmacKey) r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            com.google.crypto.tink.mac.HmacParameters r2 = r5.getParameters()
            com.google.crypto.tink.mac.HmacParameters$Variant r2 = r2.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r2 = toProtoOutputPrefixType(r2)
            java.lang.Integer r3 = r5.getIdRequirementOrNull()
            java.lang.String r4 = "type.googleapis.com/google.crypto.tink.HmacKey"
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r4, r0, r1, r2, r3)
            return r0
    }

    private static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.mac.HmacParameters r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.HmacKey"
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r1 = com.google.crypto.tink.proto.HmacKeyFormat.newBuilder()
            com.google.crypto.tink.proto.HmacParams r2 = getProtoParams(r3)
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r1 = r1.setParams(r2)
            int r2 = r3.getKeySizeBytes()
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r1 = r1.setKeySize(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.HmacKeyFormat r1 = (com.google.crypto.tink.proto.HmacKeyFormat) r1
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setValue(r1)
            com.google.crypto.tink.mac.HmacParameters$Variant r1 = r3.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r1 = toProtoOutputPrefixType(r1)
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setOutputPrefixType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTemplate r0 = (com.google.crypto.tink.proto.KeyTemplate) r0
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = com.google.crypto.tink.internal.ProtoParametersSerialization.create(r0)
            return r0
    }

    private static com.google.crypto.tink.mac.HmacParameters.HashType toHashType(com.google.crypto.tink.proto.HashType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L34;
                case 2: goto L31;
                case 3: goto L2e;
                case 4: goto L2b;
                case 5: goto L28;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to parse HashType: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r3.getNumber()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L28:
            com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA512
            return r0
        L2b:
            com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA384
            return r0
        L2e:
            com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA256
            return r0
        L31:
            com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA224
            return r0
        L34:
            com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA1
            return r0
    }

    private static com.google.crypto.tink.proto.HashType toProtoHashType(com.google.crypto.tink.mac.HmacParameters.HashType r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA1
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA1
            return r0
        Lb:
            com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA224
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA224
            return r0
        L16:
            com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA256
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            return r0
        L21:
            com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA384
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L2c
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA384
            return r0
        L2c:
            com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA512
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L37
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA512
            return r0
        L37:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to serialize HashType "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toProtoOutputPrefixType(com.google.crypto.tink.mac.HmacParameters.Variant r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = com.google.crypto.tink.mac.HmacParameters.Variant.TINK
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            return r0
        Lb:
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = com.google.crypto.tink.mac.HmacParameters.Variant.CRUNCHY
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY
            return r0
        L16:
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = com.google.crypto.tink.mac.HmacParameters.Variant.NO_PREFIX
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            return r0
        L21:
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = com.google.crypto.tink.mac.HmacParameters.Variant.LEGACY
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L2c
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY
            return r0
        L2c:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to serialize variant: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static com.google.crypto.tink.mac.HmacParameters.Variant toVariant(com.google.crypto.tink.proto.OutputPrefixType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L31;
                case 2: goto L2e;
                case 3: goto L2b;
                case 4: goto L28;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to parse OutputPrefixType: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r3.getNumber()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L28:
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = com.google.crypto.tink.mac.HmacParameters.Variant.NO_PREFIX
            return r0
        L2b:
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = com.google.crypto.tink.mac.HmacParameters.Variant.LEGACY
            return r0
        L2e:
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = com.google.crypto.tink.mac.HmacParameters.Variant.CRUNCHY
            return r0
        L31:
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = com.google.crypto.tink.mac.HmacParameters.Variant.TINK
            return r0
    }
}
