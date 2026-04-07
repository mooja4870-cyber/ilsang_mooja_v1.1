package com.google.crypto.tink.prf;

/* JADX INFO: loaded from: classes.dex */
final class HkdfPrfProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER = null;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.prf.HkdfPrfKey, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER = null;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER = null;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.prf.HkdfPrfParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER = null;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.HkdfPrfKey";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.prf.HkdfPrfProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType = null;

        static {
                com.google.crypto.tink.proto.HashType[] r0 = com.google.crypto.tink.proto.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.prf.HkdfPrfProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType = r0
                int[] r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA1     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA224     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$Cd7BK-0UX4it_C-F5LEzj5wO9ak, reason: not valid java name */
    public static /* synthetic */ com.google.crypto.tink.internal.ProtoKeySerialization m144$r8$lambda$Cd7BK0UX4it_CF5LEzj5wO9ak(com.google.crypto.tink.prf.HkdfPrfKey r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = serializeKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.prf.HkdfPrfKey $r8$lambda$IpFaC26ZHcYc5OZmbpVL0zf3U9I(com.google.crypto.tink.internal.ProtoKeySerialization r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.prf.HkdfPrfKey r0 = parseKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoParametersSerialization $r8$lambda$WLzwSoWAQkBnmSJqjqrLA0gJJjM(com.google.crypto.tink.prf.HkdfPrfParameters r0) {
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = serializeParameters(r0)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.prf.HkdfPrfParameters $r8$lambda$yumWNCDl_IPEwJGNKCgAQCdZimM(com.google.crypto.tink.internal.ProtoParametersSerialization r0) {
            com.google.crypto.tink.prf.HkdfPrfParameters r0 = parseParameters(r0)
            return r0
    }

    static {
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.HkdfPrfKey"
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r0)
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization.TYPE_URL_BYTES = r0
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization$$ExternalSyntheticLambda0 r0 = new com.google.crypto.tink.prf.HkdfPrfProtoSerialization$$ExternalSyntheticLambda0
            r0.<init>()
            java.lang.Class<com.google.crypto.tink.prf.HkdfPrfParameters> r1 = com.google.crypto.tink.prf.HkdfPrfParameters.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersSerializer r0 = com.google.crypto.tink.internal.ParametersSerializer.create(r0, r1, r2)
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization.PARAMETERS_SERIALIZER = r0
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization$$ExternalSyntheticLambda1 r0 = new com.google.crypto.tink.prf.HkdfPrfProtoSerialization$$ExternalSyntheticLambda1
            r0.<init>()
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.TYPE_URL_BYTES
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersParser r0 = com.google.crypto.tink.internal.ParametersParser.create(r0, r1, r2)
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization.PARAMETERS_PARSER = r0
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization$$ExternalSyntheticLambda2 r0 = new com.google.crypto.tink.prf.HkdfPrfProtoSerialization$$ExternalSyntheticLambda2
            r0.<init>()
            java.lang.Class<com.google.crypto.tink.prf.HkdfPrfKey> r1 = com.google.crypto.tink.prf.HkdfPrfKey.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeySerializer r0 = com.google.crypto.tink.internal.KeySerializer.create(r0, r1, r2)
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization.KEY_SERIALIZER = r0
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization$$ExternalSyntheticLambda3 r0 = new com.google.crypto.tink.prf.HkdfPrfProtoSerialization$$ExternalSyntheticLambda3
            r0.<init>()
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.TYPE_URL_BYTES
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeyParser r0 = com.google.crypto.tink.internal.KeyParser.create(r0, r1, r2)
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization.KEY_PARSER = r0
            return
    }

    private HkdfPrfProtoSerialization() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.crypto.tink.proto.HkdfPrfParams getProtoParams(com.google.crypto.tink.prf.HkdfPrfParameters r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.HkdfPrfParams$Builder r0 = com.google.crypto.tink.proto.HkdfPrfParams.newBuilder()
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r1 = r2.getHashType()
            com.google.crypto.tink.proto.HashType r1 = toProtoHashType(r1)
            com.google.crypto.tink.proto.HkdfPrfParams$Builder r0 = r0.setHash(r1)
            com.google.crypto.tink.util.Bytes r1 = r2.getSalt()
            if (r1 == 0) goto L2f
            com.google.crypto.tink.util.Bytes r1 = r2.getSalt()
            int r1 = r1.size()
            if (r1 <= 0) goto L2f
            com.google.crypto.tink.util.Bytes r1 = r2.getSalt()
            byte[] r1 = r1.toByteArray()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            r0.setSalt(r1)
        L2f:
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r0.build()
            com.google.crypto.tink.proto.HkdfPrfParams r1 = (com.google.crypto.tink.proto.HkdfPrfParams) r1
            return r1
    }

    private static com.google.crypto.tink.prf.HkdfPrfKey parseKey(com.google.crypto.tink.internal.ProtoKeySerialization r5, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r6) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r5.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.HkdfPrfKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L99
        Ld:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r5.getValue()     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.proto.HkdfPrfKey r0 = com.google.crypto.tink.proto.HkdfPrfKey.parseFrom(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            int r1 = r0.getVersion()     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            if (r1 != 0) goto L86
            java.lang.Integer r1 = r5.getIdRequirementOrNull()     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            if (r1 != 0) goto L7e
            com.google.crypto.tink.prf.HkdfPrfParameters$Builder r1 = com.google.crypto.tink.prf.HkdfPrfParameters.builder()     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.getKeyValue()     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            int r2 = r2.size()     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.prf.HkdfPrfParameters$Builder r1 = r1.setKeySizeBytes(r2)     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.proto.HkdfPrfParams r2 = r0.getParams()     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.proto.HashType r2 = r2.getHash()     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r2 = toHashType(r2)     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.prf.HkdfPrfParameters$Builder r1 = r1.setHashType(r2)     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.proto.HkdfPrfParams r2 = r0.getParams()     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.getSalt()     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            byte[] r2 = r2.toByteArray()     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.util.Bytes r2 = com.google.crypto.tink.util.Bytes.copyFrom(r2)     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.prf.HkdfPrfParameters$Builder r1 = r1.setSalt(r2)     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.prf.HkdfPrfParameters r1 = r1.build()     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.prf.HkdfPrfKey$Builder r2 = com.google.crypto.tink.prf.HkdfPrfKey.builder()     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.prf.HkdfPrfKey$Builder r2 = r2.setParameters(r1)     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r0.getKeyValue()     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            byte[] r3 = r3.toByteArray()     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.SecretKeyAccess r4 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r6)     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.util.SecretBytes r3 = com.google.crypto.tink.util.SecretBytes.copyFrom(r3, r4)     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.prf.HkdfPrfKey$Builder r2 = r2.setKeyBytes(r3)     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            com.google.crypto.tink.prf.HkdfPrfKey r2 = r2.build()     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            return r2
        L7e:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            java.lang.String r2 = "ID requirement must be null."
            r1.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            throw r1     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
        L86:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            java.lang.String r2 = "Only version 0 keys are accepted"
            r1.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
            throw r1     // Catch: java.lang.IllegalArgumentException -> L8e com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L90
        L8e:
            r0 = move-exception
            goto L91
        L90:
            r0 = move-exception
        L91:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parsing HkdfPrfKey failed"
            r1.<init>(r2)
            throw r1
        L99:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Wrong type URL in call to HkdfPrfProtoSerialization.parseKey"
            r0.<init>(r1)
            throw r0
    }

    private static com.google.crypto.tink.prf.HkdfPrfParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate r0 = r4.getKeyTemplate()
            java.lang.String r0 = r0.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.HkdfPrfKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L97
        L11:
            com.google.crypto.tink.proto.KeyTemplate r0 = r4.getKeyTemplate()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            com.google.crypto.tink.proto.HkdfPrfKeyFormat r0 = com.google.crypto.tink.proto.HkdfPrfKeyFormat.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L8e
            int r1 = r0.getVersion()
            if (r1 != 0) goto L71
            com.google.crypto.tink.proto.KeyTemplate r1 = r4.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r1 = r1.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            if (r1 != r2) goto L69
            com.google.crypto.tink.prf.HkdfPrfParameters$Builder r1 = com.google.crypto.tink.prf.HkdfPrfParameters.builder()
            int r2 = r0.getKeySize()
            com.google.crypto.tink.prf.HkdfPrfParameters$Builder r1 = r1.setKeySizeBytes(r2)
            com.google.crypto.tink.proto.HkdfPrfParams r2 = r0.getParams()
            com.google.crypto.tink.proto.HashType r2 = r2.getHash()
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r2 = toHashType(r2)
            com.google.crypto.tink.prf.HkdfPrfParameters$Builder r1 = r1.setHashType(r2)
            com.google.crypto.tink.proto.HkdfPrfParams r2 = r0.getParams()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.getSalt()
            byte[] r2 = r2.toByteArray()
            com.google.crypto.tink.util.Bytes r2 = com.google.crypto.tink.util.Bytes.copyFrom(r2)
            com.google.crypto.tink.prf.HkdfPrfParameters$Builder r1 = r1.setSalt(r2)
            com.google.crypto.tink.prf.HkdfPrfParameters r1 = r1.build()
            return r1
        L69:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parsing HkdfPrfParameters failed: only RAW output prefix type is accepted"
            r1.<init>(r2)
            throw r1
        L71:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Parsing HkdfPrfParameters failed: unknown Version "
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r0.getVersion()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L8e:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parsing HkdfPrfParameters failed: "
            r1.<init>(r2, r0)
            throw r1
        L97:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wrong type URL in call to HkdfPrfProtoSerialization.parseParameters: "
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
            com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.prf.HkdfPrfParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.PARAMETERS_SERIALIZER
            r1.registerParametersSerializer(r0)
            com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.PARAMETERS_PARSER
            r1.registerParametersParser(r0)
            com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.prf.HkdfPrfKey, com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.KEY_SERIALIZER
            r1.registerKeySerializer(r0)
            com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.KEY_PARSER
            r1.registerKeyParser(r0)
            return
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.prf.HkdfPrfKey r5, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r6) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.HkdfPrfKey$Builder r0 = com.google.crypto.tink.proto.HkdfPrfKey.newBuilder()
            com.google.crypto.tink.prf.HkdfPrfParameters r1 = r5.getParameters()
            com.google.crypto.tink.proto.HkdfPrfParams r1 = getProtoParams(r1)
            com.google.crypto.tink.proto.HkdfPrfKey$Builder r0 = r0.setParams(r1)
            com.google.crypto.tink.util.SecretBytes r1 = r5.getKeyBytes()
            com.google.crypto.tink.SecretKeyAccess r2 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r6)
            byte[] r1 = r1.toByteArray(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            com.google.crypto.tink.proto.HkdfPrfKey$Builder r0 = r0.setKeyValue(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.HkdfPrfKey r0 = (com.google.crypto.tink.proto.HkdfPrfKey) r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            java.lang.Integer r3 = r5.getIdRequirementOrNull()
            java.lang.String r4 = "type.googleapis.com/google.crypto.tink.HkdfPrfKey"
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r4, r0, r1, r2, r3)
            return r0
    }

    private static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.prf.HkdfPrfParameters r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.HkdfPrfKey"
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.HkdfPrfKeyFormat$Builder r1 = com.google.crypto.tink.proto.HkdfPrfKeyFormat.newBuilder()
            com.google.crypto.tink.proto.HkdfPrfParams r2 = getProtoParams(r3)
            com.google.crypto.tink.proto.HkdfPrfKeyFormat$Builder r1 = r1.setParams(r2)
            int r2 = r3.getKeySizeBytes()
            com.google.crypto.tink.proto.HkdfPrfKeyFormat$Builder r1 = r1.setKeySize(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.HkdfPrfKeyFormat r1 = (com.google.crypto.tink.proto.HkdfPrfKeyFormat) r1
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setValue(r1)
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setOutputPrefixType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTemplate r0 = (com.google.crypto.tink.proto.KeyTemplate) r0
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = com.google.crypto.tink.internal.ProtoParametersSerialization.create(r0)
            return r0
    }

    private static com.google.crypto.tink.prf.HkdfPrfParameters.HashType toHashType(com.google.crypto.tink.proto.HashType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType
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
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA512
            return r0
        L2b:
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA384
            return r0
        L2e:
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA256
            return r0
        L31:
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA224
            return r0
        L34:
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA1
            return r0
    }

    private static com.google.crypto.tink.proto.HashType toProtoHashType(com.google.crypto.tink.prf.HkdfPrfParameters.HashType r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA1
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA1
            return r0
        Lb:
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA224
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA224
            return r0
        L16:
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA256
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            return r0
        L21:
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA384
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L2c
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA384
            return r0
        L2c:
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA512
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
}
