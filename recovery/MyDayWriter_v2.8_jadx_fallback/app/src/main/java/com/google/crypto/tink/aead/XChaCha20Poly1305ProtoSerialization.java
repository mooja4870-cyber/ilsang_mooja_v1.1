package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes.dex */
final class XChaCha20Poly1305ProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER = null;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.aead.XChaCha20Poly1305Key, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER = null;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER = null;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.aead.XChaCha20Poly1305Parameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER = null;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r0
                int[] r0 = com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L3c
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

    public static /* synthetic */ com.google.crypto.tink.aead.XChaCha20Poly1305Key $r8$lambda$CshRoNazMt5NRtdRkSWAYsXM9uI(com.google.crypto.tink.internal.ProtoKeySerialization r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.aead.XChaCha20Poly1305Key r0 = parseKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoParametersSerialization $r8$lambda$MkgHpbYeGHUDeWUdbQUBFvvRGho(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters r0) {
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = serializeParameters(r0)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoKeySerialization $r8$lambda$bEkdnXQxuYKf9bXoZfJjPvsAnmw(com.google.crypto.tink.aead.XChaCha20Poly1305Key r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = serializeKey(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$rNXME44dfY3cISY2b0jZ-pUuaLo, reason: not valid java name */
    public static /* synthetic */ com.google.crypto.tink.aead.XChaCha20Poly1305Parameters m141$r8$lambda$rNXME44dfY3cISY2b0jZpUuaLo(com.google.crypto.tink.internal.ProtoParametersSerialization r0) {
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters r0 = parseParameters(r0)
            return r0
    }

    static {
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r0)
            com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization.TYPE_URL_BYTES = r0
            com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda0 r0 = new com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda0
            r0.<init>()
            java.lang.Class<com.google.crypto.tink.aead.XChaCha20Poly1305Parameters> r1 = com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersSerializer r0 = com.google.crypto.tink.internal.ParametersSerializer.create(r0, r1, r2)
            com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization.PARAMETERS_SERIALIZER = r0
            com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda1 r0 = new com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda1
            r0.<init>()
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization.TYPE_URL_BYTES
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersParser r0 = com.google.crypto.tink.internal.ParametersParser.create(r0, r1, r2)
            com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization.PARAMETERS_PARSER = r0
            com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda2 r0 = new com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda2
            r0.<init>()
            java.lang.Class<com.google.crypto.tink.aead.XChaCha20Poly1305Key> r1 = com.google.crypto.tink.aead.XChaCha20Poly1305Key.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeySerializer r0 = com.google.crypto.tink.internal.KeySerializer.create(r0, r1, r2)
            com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization.KEY_SERIALIZER = r0
            com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda3 r0 = new com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda3
            r0.<init>()
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization.TYPE_URL_BYTES
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeyParser r0 = com.google.crypto.tink.internal.KeyParser.create(r0, r1, r2)
            com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization.KEY_PARSER = r0
            return
    }

    private XChaCha20Poly1305ProtoSerialization() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.crypto.tink.aead.XChaCha20Poly1305Key parseKey(com.google.crypto.tink.internal.ProtoKeySerialization r4, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r5) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r4.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L52
        Ld:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L49
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L49
            com.google.crypto.tink.proto.XChaCha20Poly1305Key r0 = com.google.crypto.tink.proto.XChaCha20Poly1305Key.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L49
            int r1 = r0.getVersion()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L49
            if (r1 != 0) goto L41
        L20:
            com.google.crypto.tink.proto.OutputPrefixType r1 = r4.getOutputPrefixType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L49
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r1 = toVariant(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L49
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.getKeyValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L49
            byte[] r2 = r2.toByteArray()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L49
            com.google.crypto.tink.SecretKeyAccess r3 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L49
            com.google.crypto.tink.util.SecretBytes r2 = com.google.crypto.tink.util.SecretBytes.copyFrom(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L49
            java.lang.Integer r3 = r4.getIdRequirementOrNull()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L49
            com.google.crypto.tink.aead.XChaCha20Poly1305Key r1 = com.google.crypto.tink.aead.XChaCha20Poly1305Key.create(r1, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L49
            return r1
        L41:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L49
            java.lang.String r2 = "Only version 0 keys are accepted"
            r1.<init>(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L49
            throw r1     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L49
        L49:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parsing XChaCha20Poly1305Key failed"
            r1.<init>(r2)
            throw r1
        L52:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters"
            r0.<init>(r1)
            throw r0
    }

    private static com.google.crypto.tink.aead.XChaCha20Poly1305Parameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()
            java.lang.String r0 = r0.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c
        L11:
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L33
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L33
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L33
            com.google.crypto.tink.proto.XChaCha20Poly1305KeyFormat.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L33
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r0 = r0.getOutputPrefixType()
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r0 = toVariant(r0)
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters r0 = com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.create(r0)
            return r0
        L33:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parsing XChaCha20Poly1305Parameters failed: "
            r1.<init>(r2, r0)
            throw r1
        L3c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters: "
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
            com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.aead.XChaCha20Poly1305Parameters, com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization.PARAMETERS_SERIALIZER
            r1.registerParametersSerializer(r0)
            com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization.PARAMETERS_PARSER
            r1.registerParametersParser(r0)
            com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.aead.XChaCha20Poly1305Key, com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization.KEY_SERIALIZER
            r1.registerKeySerializer(r0)
            com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization.KEY_PARSER
            r1.registerKeyParser(r0)
            return
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.aead.XChaCha20Poly1305Key r5, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r6) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.XChaCha20Poly1305Key$Builder r0 = com.google.crypto.tink.proto.XChaCha20Poly1305Key.newBuilder()
            com.google.crypto.tink.util.SecretBytes r1 = r5.getKeyBytes()
            com.google.crypto.tink.SecretKeyAccess r2 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r6)
            byte[] r1 = r1.toByteArray(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            com.google.crypto.tink.proto.XChaCha20Poly1305Key$Builder r0 = r0.setKeyValue(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.XChaCha20Poly1305Key r0 = (com.google.crypto.tink.proto.XChaCha20Poly1305Key) r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters r2 = r5.getParameters()
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r2 = r2.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r2 = toProtoOutputPrefixType(r2)
            java.lang.Integer r3 = r5.getIdRequirementOrNull()
            java.lang.String r4 = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r4, r0, r1, r2, r3)
            return r0
    }

    private static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.XChaCha20Poly1305KeyFormat r1 = com.google.crypto.tink.proto.XChaCha20Poly1305KeyFormat.getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setValue(r1)
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r1 = r2.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r1 = toProtoOutputPrefixType(r1)
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setOutputPrefixType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTemplate r0 = (com.google.crypto.tink.proto.KeyTemplate) r0
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = com.google.crypto.tink.internal.ProtoParametersSerialization.create(r0)
            return r0
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toProtoOutputPrefixType(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r0 = com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.TINK
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            return r0
        Lb:
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r0 = com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.CRUNCHY
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY
            return r0
        L16:
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r0 = com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.NO_PREFIX
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

    private static com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant toVariant(com.google.crypto.tink.proto.OutputPrefixType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.aead.XChaCha20Poly1305ProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
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
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r0 = com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.NO_PREFIX
            return r0
        L2b:
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r0 = com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.CRUNCHY
            return r0
        L2e:
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r0 = com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.TINK
            return r0
    }
}
