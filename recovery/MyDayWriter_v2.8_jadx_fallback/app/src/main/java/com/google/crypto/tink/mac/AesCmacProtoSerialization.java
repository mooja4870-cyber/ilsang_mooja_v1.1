package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes.dex */
final class AesCmacProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER = null;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.mac.AesCmacKey, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER = null;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER = null;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.mac.AesCmacParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER = null;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.AesCmacKey";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.mac.AesCmacProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.mac.AesCmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r0
                int[] r0 = com.google.crypto.tink.mac.AesCmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.mac.AesCmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.mac.AesCmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.mac.AesCmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L3c
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

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoKeySerialization $r8$lambda$7L351wgjnjO4ZKV0ZQV15gTo0vg(com.google.crypto.tink.mac.AesCmacKey r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = serializeKey(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$XoAYR2uAeH9mIXNgu5uUJ0qQD-8, reason: not valid java name */
    public static /* synthetic */ com.google.crypto.tink.internal.ProtoParametersSerialization m142$r8$lambda$XoAYR2uAeH9mIXNgu5uUJ0qQD8(com.google.crypto.tink.mac.AesCmacParameters r0) {
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = serializeParameters(r0)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$aVUkw1tXpDU9iD7R6w_Z-dgG0sY, reason: not valid java name */
    public static /* synthetic */ com.google.crypto.tink.mac.AesCmacKey m143$r8$lambda$aVUkw1tXpDU9iD7R6w_ZdgG0sY(com.google.crypto.tink.internal.ProtoKeySerialization r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.mac.AesCmacKey r0 = parseKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.mac.AesCmacParameters $r8$lambda$kP_363MC8_7156Kgw7KikH01Utk(com.google.crypto.tink.internal.ProtoParametersSerialization r0) {
            com.google.crypto.tink.mac.AesCmacParameters r0 = parseParameters(r0)
            return r0
    }

    static {
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesCmacKey"
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r0)
            com.google.crypto.tink.mac.AesCmacProtoSerialization.TYPE_URL_BYTES = r0
            com.google.crypto.tink.mac.AesCmacProtoSerialization$$ExternalSyntheticLambda0 r0 = new com.google.crypto.tink.mac.AesCmacProtoSerialization$$ExternalSyntheticLambda0
            r0.<init>()
            java.lang.Class<com.google.crypto.tink.mac.AesCmacParameters> r1 = com.google.crypto.tink.mac.AesCmacParameters.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersSerializer r0 = com.google.crypto.tink.internal.ParametersSerializer.create(r0, r1, r2)
            com.google.crypto.tink.mac.AesCmacProtoSerialization.PARAMETERS_SERIALIZER = r0
            com.google.crypto.tink.mac.AesCmacProtoSerialization$$ExternalSyntheticLambda1 r0 = new com.google.crypto.tink.mac.AesCmacProtoSerialization$$ExternalSyntheticLambda1
            r0.<init>()
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.mac.AesCmacProtoSerialization.TYPE_URL_BYTES
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersParser r0 = com.google.crypto.tink.internal.ParametersParser.create(r0, r1, r2)
            com.google.crypto.tink.mac.AesCmacProtoSerialization.PARAMETERS_PARSER = r0
            com.google.crypto.tink.mac.AesCmacProtoSerialization$$ExternalSyntheticLambda2 r0 = new com.google.crypto.tink.mac.AesCmacProtoSerialization$$ExternalSyntheticLambda2
            r0.<init>()
            java.lang.Class<com.google.crypto.tink.mac.AesCmacKey> r1 = com.google.crypto.tink.mac.AesCmacKey.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeySerializer r0 = com.google.crypto.tink.internal.KeySerializer.create(r0, r1, r2)
            com.google.crypto.tink.mac.AesCmacProtoSerialization.KEY_SERIALIZER = r0
            com.google.crypto.tink.mac.AesCmacProtoSerialization$$ExternalSyntheticLambda3 r0 = new com.google.crypto.tink.mac.AesCmacProtoSerialization$$ExternalSyntheticLambda3
            r0.<init>()
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.mac.AesCmacProtoSerialization.TYPE_URL_BYTES
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeyParser r0 = com.google.crypto.tink.internal.KeyParser.create(r0, r1, r2)
            com.google.crypto.tink.mac.AesCmacProtoSerialization.KEY_PARSER = r0
            return
    }

    private AesCmacProtoSerialization() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.crypto.tink.proto.AesCmacParams getProtoParams(com.google.crypto.tink.mac.AesCmacParameters r2) {
            com.google.crypto.tink.proto.AesCmacParams$Builder r0 = com.google.crypto.tink.proto.AesCmacParams.newBuilder()
            int r1 = r2.getCryptographicTagSizeBytes()
            com.google.crypto.tink.proto.AesCmacParams$Builder r0 = r0.setTagSize(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesCmacParams r0 = (com.google.crypto.tink.proto.AesCmacParams) r0
            return r0
    }

    private static com.google.crypto.tink.mac.AesCmacKey parseKey(com.google.crypto.tink.internal.ProtoKeySerialization r5, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r6) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r5.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.AesCmacKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L87
        Ld:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r5.getValue()     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.proto.AesCmacKey r0 = com.google.crypto.tink.proto.AesCmacKey.parseFrom(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            int r1 = r0.getVersion()     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            if (r1 != 0) goto L74
            com.google.crypto.tink.mac.AesCmacParameters$Builder r1 = com.google.crypto.tink.mac.AesCmacParameters.builder()     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.getKeyValue()     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            int r2 = r2.size()     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.mac.AesCmacParameters$Builder r1 = r1.setKeySizeBytes(r2)     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.proto.AesCmacParams r2 = r0.getParams()     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            int r2 = r2.getTagSize()     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.mac.AesCmacParameters$Builder r1 = r1.setTagSizeBytes(r2)     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.proto.OutputPrefixType r2 = r5.getOutputPrefixType()     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.mac.AesCmacParameters$Variant r2 = toVariant(r2)     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.mac.AesCmacParameters$Builder r1 = r1.setVariant(r2)     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.mac.AesCmacParameters r1 = r1.build()     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.mac.AesCmacKey$Builder r2 = com.google.crypto.tink.mac.AesCmacKey.builder()     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.mac.AesCmacKey$Builder r2 = r2.setParameters(r1)     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r0.getKeyValue()     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            byte[] r3 = r3.toByteArray()     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.SecretKeyAccess r4 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r6)     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.util.SecretBytes r3 = com.google.crypto.tink.util.SecretBytes.copyFrom(r3, r4)     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.mac.AesCmacKey$Builder r2 = r2.setAesKeyBytes(r3)     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            java.lang.Integer r3 = r5.getIdRequirementOrNull()     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.mac.AesCmacKey$Builder r2 = r2.setIdRequirement(r3)     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            com.google.crypto.tink.mac.AesCmacKey r2 = r2.build()     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            return r2
        L74:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            java.lang.String r2 = "Only version 0 keys are accepted"
            r1.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
            throw r1     // Catch: java.lang.IllegalArgumentException -> L7c com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7e
        L7c:
            r0 = move-exception
            goto L7f
        L7e:
            r0 = move-exception
        L7f:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parsing AesCmacKey failed"
            r1.<init>(r2)
            throw r1
        L87:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Wrong type URL in call to AesCmacParameters.parseParameters"
            r0.<init>(r1)
            throw r0
    }

    private static com.google.crypto.tink.mac.AesCmacParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()
            java.lang.String r0 = r0.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.AesCmacKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L58
        L11:
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4f
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4f
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4f
            com.google.crypto.tink.proto.AesCmacKeyFormat r0 = com.google.crypto.tink.proto.AesCmacKeyFormat.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4f
            com.google.crypto.tink.mac.AesCmacParameters$Builder r1 = com.google.crypto.tink.mac.AesCmacParameters.builder()
            int r2 = r0.getKeySize()
            com.google.crypto.tink.mac.AesCmacParameters$Builder r1 = r1.setKeySizeBytes(r2)
            com.google.crypto.tink.proto.AesCmacParams r2 = r0.getParams()
            int r2 = r2.getTagSize()
            com.google.crypto.tink.mac.AesCmacParameters$Builder r1 = r1.setTagSizeBytes(r2)
            com.google.crypto.tink.proto.KeyTemplate r2 = r3.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r2 = r2.getOutputPrefixType()
            com.google.crypto.tink.mac.AesCmacParameters$Variant r2 = toVariant(r2)
            com.google.crypto.tink.mac.AesCmacParameters$Builder r1 = r1.setVariant(r2)
            com.google.crypto.tink.mac.AesCmacParameters r1 = r1.build()
            return r1
        L4f:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parsing AesCmacParameters failed: "
            r1.<init>(r2, r0)
            throw r1
        L58:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wrong type URL in call to AesCmacParameters.parseParameters: "
            java.lang.StringBuilder r1 = r1.append(r2)
            com.google.crypto.tink.proto.KeyTemplate r2 = r3.getKeyTemplate()
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
            com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.mac.AesCmacParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.mac.AesCmacProtoSerialization.PARAMETERS_SERIALIZER
            r1.registerParametersSerializer(r0)
            com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.mac.AesCmacProtoSerialization.PARAMETERS_PARSER
            r1.registerParametersParser(r0)
            com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.mac.AesCmacKey, com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.mac.AesCmacProtoSerialization.KEY_SERIALIZER
            r1.registerKeySerializer(r0)
            com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.mac.AesCmacProtoSerialization.KEY_PARSER
            r1.registerKeyParser(r0)
            return
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.mac.AesCmacKey r5, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r6) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.AesCmacKey$Builder r0 = com.google.crypto.tink.proto.AesCmacKey.newBuilder()
            com.google.crypto.tink.mac.AesCmacParameters r1 = r5.getParameters()
            com.google.crypto.tink.proto.AesCmacParams r1 = getProtoParams(r1)
            com.google.crypto.tink.proto.AesCmacKey$Builder r0 = r0.setParams(r1)
            com.google.crypto.tink.util.SecretBytes r1 = r5.getAesKey()
            com.google.crypto.tink.SecretKeyAccess r2 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r6)
            byte[] r1 = r1.toByteArray(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            com.google.crypto.tink.proto.AesCmacKey$Builder r0 = r0.setKeyValue(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesCmacKey r0 = (com.google.crypto.tink.proto.AesCmacKey) r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            com.google.crypto.tink.mac.AesCmacParameters r2 = r5.getParameters()
            com.google.crypto.tink.mac.AesCmacParameters$Variant r2 = r2.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r2 = toOutputPrefixType(r2)
            java.lang.Integer r3 = r5.getIdRequirementOrNull()
            java.lang.String r4 = "type.googleapis.com/google.crypto.tink.AesCmacKey"
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r4, r0, r1, r2, r3)
            return r0
    }

    private static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.mac.AesCmacParameters r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.AesCmacKey"
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.AesCmacKeyFormat$Builder r1 = com.google.crypto.tink.proto.AesCmacKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesCmacParams r2 = getProtoParams(r3)
            com.google.crypto.tink.proto.AesCmacKeyFormat$Builder r1 = r1.setParams(r2)
            int r2 = r3.getKeySizeBytes()
            com.google.crypto.tink.proto.AesCmacKeyFormat$Builder r1 = r1.setKeySize(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesCmacKeyFormat r1 = (com.google.crypto.tink.proto.AesCmacKeyFormat) r1
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setValue(r1)
            com.google.crypto.tink.mac.AesCmacParameters$Variant r1 = r3.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r1 = toOutputPrefixType(r1)
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setOutputPrefixType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTemplate r0 = (com.google.crypto.tink.proto.KeyTemplate) r0
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = com.google.crypto.tink.internal.ProtoParametersSerialization.create(r0)
            return r0
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toOutputPrefixType(com.google.crypto.tink.mac.AesCmacParameters.Variant r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = com.google.crypto.tink.mac.AesCmacParameters.Variant.TINK
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            return r0
        Lb:
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = com.google.crypto.tink.mac.AesCmacParameters.Variant.CRUNCHY
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY
            return r0
        L16:
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = com.google.crypto.tink.mac.AesCmacParameters.Variant.NO_PREFIX
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            return r0
        L21:
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = com.google.crypto.tink.mac.AesCmacParameters.Variant.LEGACY
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

    private static com.google.crypto.tink.mac.AesCmacParameters.Variant toVariant(com.google.crypto.tink.proto.OutputPrefixType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.mac.AesCmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
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
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = com.google.crypto.tink.mac.AesCmacParameters.Variant.NO_PREFIX
            return r0
        L2b:
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = com.google.crypto.tink.mac.AesCmacParameters.Variant.LEGACY
            return r0
        L2e:
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = com.google.crypto.tink.mac.AesCmacParameters.Variant.CRUNCHY
            return r0
        L31:
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = com.google.crypto.tink.mac.AesCmacParameters.Variant.TINK
            return r0
    }
}
