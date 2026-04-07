package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes.dex */
final class AesGcmProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER = null;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.aead.AesGcmKey, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER = null;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER = null;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.aead.AesGcmParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER = null;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.aead.AesGcmProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.aead.AesGcmProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r0
                int[] r0 = com.google.crypto.tink.aead.AesGcmProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.aead.AesGcmProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.aead.AesGcmProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.aead.AesGcmProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L3c
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

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoKeySerialization $r8$lambda$EUz4ME7O9dcEVpDksD4G5pFlPQA(com.google.crypto.tink.aead.AesGcmKey r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = serializeKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.aead.AesGcmParameters $r8$lambda$uQT556We0XfoRJcWuy27A6jAebE(com.google.crypto.tink.internal.ProtoParametersSerialization r0) {
            com.google.crypto.tink.aead.AesGcmParameters r0 = parseParameters(r0)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.aead.AesGcmKey $r8$lambda$vgZA9XPoksba5kVX1QfZs6Wg60E(com.google.crypto.tink.internal.ProtoKeySerialization r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.aead.AesGcmKey r0 = parseKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoParametersSerialization $r8$lambda$xlok2PY_IO6uwuqHTkpSWLES9S8(com.google.crypto.tink.aead.AesGcmParameters r0) {
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = serializeParameters(r0)
            return r0
    }

    static {
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesGcmKey"
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r0)
            com.google.crypto.tink.aead.AesGcmProtoSerialization.TYPE_URL_BYTES = r0
            com.google.crypto.tink.aead.AesGcmProtoSerialization$$ExternalSyntheticLambda0 r0 = new com.google.crypto.tink.aead.AesGcmProtoSerialization$$ExternalSyntheticLambda0
            r0.<init>()
            java.lang.Class<com.google.crypto.tink.aead.AesGcmParameters> r1 = com.google.crypto.tink.aead.AesGcmParameters.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersSerializer r0 = com.google.crypto.tink.internal.ParametersSerializer.create(r0, r1, r2)
            com.google.crypto.tink.aead.AesGcmProtoSerialization.PARAMETERS_SERIALIZER = r0
            com.google.crypto.tink.aead.AesGcmProtoSerialization$$ExternalSyntheticLambda1 r0 = new com.google.crypto.tink.aead.AesGcmProtoSerialization$$ExternalSyntheticLambda1
            r0.<init>()
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.aead.AesGcmProtoSerialization.TYPE_URL_BYTES
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersParser r0 = com.google.crypto.tink.internal.ParametersParser.create(r0, r1, r2)
            com.google.crypto.tink.aead.AesGcmProtoSerialization.PARAMETERS_PARSER = r0
            com.google.crypto.tink.aead.AesGcmProtoSerialization$$ExternalSyntheticLambda2 r0 = new com.google.crypto.tink.aead.AesGcmProtoSerialization$$ExternalSyntheticLambda2
            r0.<init>()
            java.lang.Class<com.google.crypto.tink.aead.AesGcmKey> r1 = com.google.crypto.tink.aead.AesGcmKey.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeySerializer r0 = com.google.crypto.tink.internal.KeySerializer.create(r0, r1, r2)
            com.google.crypto.tink.aead.AesGcmProtoSerialization.KEY_SERIALIZER = r0
            com.google.crypto.tink.aead.AesGcmProtoSerialization$$ExternalSyntheticLambda3 r0 = new com.google.crypto.tink.aead.AesGcmProtoSerialization$$ExternalSyntheticLambda3
            r0.<init>()
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.aead.AesGcmProtoSerialization.TYPE_URL_BYTES
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeyParser r0 = com.google.crypto.tink.internal.KeyParser.create(r0, r1, r2)
            com.google.crypto.tink.aead.AesGcmProtoSerialization.KEY_PARSER = r0
            return
    }

    private AesGcmProtoSerialization() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.crypto.tink.aead.AesGcmKey parseKey(com.google.crypto.tink.internal.ProtoKeySerialization r5, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r6) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r5.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.AesGcmKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L85
        Ld:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r5.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.proto.AesGcmKey r0 = com.google.crypto.tink.proto.AesGcmKey.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            int r1 = r0.getVersion()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            if (r1 != 0) goto L74
            com.google.crypto.tink.aead.AesGcmParameters$Builder r1 = com.google.crypto.tink.aead.AesGcmParameters.builder()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.getKeyValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            int r2 = r2.size()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.aead.AesGcmParameters$Builder r1 = r1.setKeySizeBytes(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            r2 = 12
            com.google.crypto.tink.aead.AesGcmParameters$Builder r1 = r1.setIvSizeBytes(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            r2 = 16
            com.google.crypto.tink.aead.AesGcmParameters$Builder r1 = r1.setTagSizeBytes(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.proto.OutputPrefixType r2 = r5.getOutputPrefixType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.aead.AesGcmParameters$Variant r2 = toVariant(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.aead.AesGcmParameters$Builder r1 = r1.setVariant(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.aead.AesGcmParameters r1 = r1.build()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.aead.AesGcmKey$Builder r2 = com.google.crypto.tink.aead.AesGcmKey.builder()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.aead.AesGcmKey$Builder r2 = r2.setParameters(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r0.getKeyValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            byte[] r3 = r3.toByteArray()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.SecretKeyAccess r4 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r6)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.util.SecretBytes r3 = com.google.crypto.tink.util.SecretBytes.copyFrom(r3, r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.aead.AesGcmKey$Builder r2 = r2.setKeyBytes(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            java.lang.Integer r3 = r5.getIdRequirementOrNull()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.aead.AesGcmKey$Builder r2 = r2.setIdRequirement(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.aead.AesGcmKey r2 = r2.build()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            return r2
        L74:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            java.lang.String r2 = "Only version 0 keys are accepted"
            r1.<init>(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            throw r1     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
        L7c:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parsing AesGcmKey failed"
            r1.<init>(r2)
            throw r1
        L85:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Wrong type URL in call to AesGcmParameters.parseParameters"
            r0.<init>(r1)
            throw r0
    }

    private static com.google.crypto.tink.aead.AesGcmParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()
            java.lang.String r0 = r0.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.AesGcmKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L58
        L11:
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4f
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4f
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4f
            com.google.crypto.tink.proto.AesGcmKeyFormat r0 = com.google.crypto.tink.proto.AesGcmKeyFormat.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4f
            com.google.crypto.tink.aead.AesGcmParameters$Builder r1 = com.google.crypto.tink.aead.AesGcmParameters.builder()
            int r2 = r0.getKeySize()
            com.google.crypto.tink.aead.AesGcmParameters$Builder r1 = r1.setKeySizeBytes(r2)
            r2 = 12
            com.google.crypto.tink.aead.AesGcmParameters$Builder r1 = r1.setIvSizeBytes(r2)
            r2 = 16
            com.google.crypto.tink.aead.AesGcmParameters$Builder r1 = r1.setTagSizeBytes(r2)
            com.google.crypto.tink.proto.KeyTemplate r2 = r3.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r2 = r2.getOutputPrefixType()
            com.google.crypto.tink.aead.AesGcmParameters$Variant r2 = toVariant(r2)
            com.google.crypto.tink.aead.AesGcmParameters$Builder r1 = r1.setVariant(r2)
            com.google.crypto.tink.aead.AesGcmParameters r1 = r1.build()
            return r1
        L4f:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parsing AesGcmParameters failed: "
            r1.<init>(r2, r0)
            throw r1
        L58:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wrong type URL in call to AesGcmParameters.parseParameters: "
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
            com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.aead.AesGcmParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.aead.AesGcmProtoSerialization.PARAMETERS_SERIALIZER
            r1.registerParametersSerializer(r0)
            com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.aead.AesGcmProtoSerialization.PARAMETERS_PARSER
            r1.registerParametersParser(r0)
            com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.aead.AesGcmKey, com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.aead.AesGcmProtoSerialization.KEY_SERIALIZER
            r1.registerKeySerializer(r0)
            com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.aead.AesGcmProtoSerialization.KEY_PARSER
            r1.registerKeyParser(r0)
            return
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.aead.AesGcmKey r5, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r6) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.AesGcmParameters r0 = r5.getParameters()
            validateParameters(r0)
            com.google.crypto.tink.proto.AesGcmKey$Builder r0 = com.google.crypto.tink.proto.AesGcmKey.newBuilder()
            com.google.crypto.tink.util.SecretBytes r1 = r5.getKeyBytes()
            com.google.crypto.tink.SecretKeyAccess r2 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r6)
            byte[] r1 = r1.toByteArray(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            com.google.crypto.tink.proto.AesGcmKey$Builder r0 = r0.setKeyValue(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesGcmKey r0 = (com.google.crypto.tink.proto.AesGcmKey) r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            com.google.crypto.tink.aead.AesGcmParameters r2 = r5.getParameters()
            com.google.crypto.tink.aead.AesGcmParameters$Variant r2 = r2.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r2 = toProtoOutputPrefixType(r2)
            java.lang.Integer r3 = r5.getIdRequirementOrNull()
            java.lang.String r4 = "type.googleapis.com/google.crypto.tink.AesGcmKey"
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r4, r0, r1, r2, r3)
            return r0
    }

    private static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.aead.AesGcmParameters r3) throws java.security.GeneralSecurityException {
            validateParameters(r3)
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.AesGcmKey"
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.AesGcmKeyFormat$Builder r1 = com.google.crypto.tink.proto.AesGcmKeyFormat.newBuilder()
            int r2 = r3.getKeySizeBytes()
            com.google.crypto.tink.proto.AesGcmKeyFormat$Builder r1 = r1.setKeySize(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesGcmKeyFormat r1 = (com.google.crypto.tink.proto.AesGcmKeyFormat) r1
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setValue(r1)
            com.google.crypto.tink.aead.AesGcmParameters$Variant r1 = r3.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r1 = toProtoOutputPrefixType(r1)
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setOutputPrefixType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTemplate r0 = (com.google.crypto.tink.proto.KeyTemplate) r0
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = com.google.crypto.tink.internal.ProtoParametersSerialization.create(r0)
            return r0
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toProtoOutputPrefixType(com.google.crypto.tink.aead.AesGcmParameters.Variant r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.AesGcmParameters$Variant r0 = com.google.crypto.tink.aead.AesGcmParameters.Variant.TINK
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            return r0
        Lb:
            com.google.crypto.tink.aead.AesGcmParameters$Variant r0 = com.google.crypto.tink.aead.AesGcmParameters.Variant.CRUNCHY
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY
            return r0
        L16:
            com.google.crypto.tink.aead.AesGcmParameters$Variant r0 = com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            return r0
        L21:
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

    private static com.google.crypto.tink.aead.AesGcmParameters.Variant toVariant(com.google.crypto.tink.proto.OutputPrefixType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.aead.AesGcmProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2e;
                case 2: goto L2b;
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
            com.google.crypto.tink.aead.AesGcmParameters$Variant r0 = com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX
            return r0
        L2b:
            com.google.crypto.tink.aead.AesGcmParameters$Variant r0 = com.google.crypto.tink.aead.AesGcmParameters.Variant.CRUNCHY
            return r0
        L2e:
            com.google.crypto.tink.aead.AesGcmParameters$Variant r0 = com.google.crypto.tink.aead.AesGcmParameters.Variant.TINK
            return r0
    }

    private static void validateParameters(com.google.crypto.tink.aead.AesGcmParameters r3) throws java.security.GeneralSecurityException {
            int r0 = r3.getTagSizeBytes()
            r1 = 16
            if (r0 != r1) goto L29
            int r0 = r3.getIvSizeBytes()
            r1 = 12
            if (r0 != r1) goto L11
            return
        L11:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            int r1 = r3.getIvSizeBytes()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L29:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            int r1 = r3.getTagSizeBytes()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }
}
