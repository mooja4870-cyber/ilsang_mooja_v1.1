package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes.dex */
final class EcdsaProtoSerialization {
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER = null;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.signature.EcdsaParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER = null;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_PARSER = null;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.signature.EcdsaPrivateKey, com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_SERIALIZER = null;
    private static final java.lang.String PRIVATE_TYPE_URL = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    private static final com.google.crypto.tink.util.Bytes PRIVATE_TYPE_URL_BYTES = null;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_PARSER = null;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.signature.EcdsaPublicKey, com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_SERIALIZER = null;
    private static final java.lang.String PUBLIC_TYPE_URL = "type.googleapis.com/google.crypto.tink.EcdsaPublicKey";
    private static final com.google.crypto.tink.util.Bytes PUBLIC_TYPE_URL_BYTES = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.signature.EcdsaProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.EcdsaSignatureEncoding[] r0 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding = r0
                r0 = 1
                int[] r1 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363     // Catch: java.lang.NoSuchFieldError -> L15
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r1 = move-exception
            L16:
                r1 = 2
                int[] r2 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.EcdsaSignatureEncoding r3 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER     // Catch: java.lang.NoSuchFieldError -> L22
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r2 = move-exception
            L23:
                com.google.crypto.tink.proto.EllipticCurveType[] r2 = com.google.crypto.tink.proto.EllipticCurveType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType = r2
                int[] r2 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType     // Catch: java.lang.NoSuchFieldError -> L37
                com.google.crypto.tink.proto.EllipticCurveType r3 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256     // Catch: java.lang.NoSuchFieldError -> L37
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L37
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L37
                goto L38
            L37:
                r2 = move-exception
            L38:
                int[] r2 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType     // Catch: java.lang.NoSuchFieldError -> L43
                com.google.crypto.tink.proto.EllipticCurveType r3 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P384     // Catch: java.lang.NoSuchFieldError -> L43
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L43
                goto L44
            L43:
                r2 = move-exception
            L44:
                r2 = 3
                int[] r3 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType     // Catch: java.lang.NoSuchFieldError -> L50
                com.google.crypto.tink.proto.EllipticCurveType r4 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P521     // Catch: java.lang.NoSuchFieldError -> L50
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L50
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L50
                goto L51
            L50:
                r3 = move-exception
            L51:
                com.google.crypto.tink.proto.OutputPrefixType[] r3 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r3
                int[] r3 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L65
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L65
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L65
                goto L66
            L65:
                r3 = move-exception
            L66:
                int[] r3 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L71
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L71
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L71
                goto L72
            L71:
                r3 = move-exception
            L72:
                int[] r3 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L7d
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L7d
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L7d
                goto L7e
            L7d:
                r3 = move-exception
            L7e:
                int[] r3 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L8a
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L8a
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8a
                r5 = 4
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L8a
                goto L8b
            L8a:
                r3 = move-exception
            L8b:
                com.google.crypto.tink.proto.HashType[] r3 = com.google.crypto.tink.proto.HashType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType = r3
                int[] r3 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L9f
                com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L9f
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9f
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L9f
                goto La0
            L9f:
                r0 = move-exception
            La0:
                int[] r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> Lab
                com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> Lab
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lab
                r0[r3] = r1     // Catch: java.lang.NoSuchFieldError -> Lab
                goto Lac
            Lab:
                r0 = move-exception
            Lac:
                int[] r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> Lb7
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> Lb7
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb7
                goto Lb8
            Lb7:
                r0 = move-exception
            Lb8:
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$-1QaVTEpxVoK9ADilVdLTv7koG4, reason: not valid java name */
    public static /* synthetic */ com.google.crypto.tink.signature.EcdsaParameters m147$r8$lambda$1QaVTEpxVoK9ADilVdLTv7koG4(com.google.crypto.tink.internal.ProtoParametersSerialization r0) {
            com.google.crypto.tink.signature.EcdsaParameters r0 = parseParameters(r0)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoKeySerialization $r8$lambda$QL64PlliBOEO_yvpgc5iADKWtsE(com.google.crypto.tink.signature.EcdsaPrivateKey r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = serializePrivateKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoParametersSerialization $r8$lambda$XUL5p5QSPtLET6REQv92nwwzNDw(com.google.crypto.tink.signature.EcdsaParameters r0) {
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = serializeParameters(r0)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.signature.EcdsaPrivateKey $r8$lambda$fyP_R8_FXP7yUskYeHgYdWzzYCM(com.google.crypto.tink.internal.ProtoKeySerialization r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.signature.EcdsaPrivateKey r0 = parsePrivateKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoKeySerialization $r8$lambda$yE7K0ejbZkHm9FdR1y2N5HSU7y8(com.google.crypto.tink.signature.EcdsaPublicKey r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = serializePublicKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.signature.EcdsaPublicKey $r8$lambda$yS9Hwh6FSrUpXOxo6QSA4zOibRQ(com.google.crypto.tink.internal.ProtoKeySerialization r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.signature.EcdsaPublicKey r0 = parsePublicKey(r0, r1)
            return r0
    }

    static {
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r0)
            com.google.crypto.tink.signature.EcdsaProtoSerialization.PRIVATE_TYPE_URL_BYTES = r0
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.EcdsaPublicKey"
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r0)
            com.google.crypto.tink.signature.EcdsaProtoSerialization.PUBLIC_TYPE_URL_BYTES = r0
            com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda0 r0 = new com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda0
            r0.<init>()
            java.lang.Class<com.google.crypto.tink.signature.EcdsaParameters> r1 = com.google.crypto.tink.signature.EcdsaParameters.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersSerializer r0 = com.google.crypto.tink.internal.ParametersSerializer.create(r0, r1, r2)
            com.google.crypto.tink.signature.EcdsaProtoSerialization.PARAMETERS_SERIALIZER = r0
            com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda1 r0 = new com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda1
            r0.<init>()
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.signature.EcdsaProtoSerialization.PRIVATE_TYPE_URL_BYTES
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersParser r0 = com.google.crypto.tink.internal.ParametersParser.create(r0, r1, r2)
            com.google.crypto.tink.signature.EcdsaProtoSerialization.PARAMETERS_PARSER = r0
            com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda2 r0 = new com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda2
            r0.<init>()
            java.lang.Class<com.google.crypto.tink.signature.EcdsaPublicKey> r1 = com.google.crypto.tink.signature.EcdsaPublicKey.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeySerializer r0 = com.google.crypto.tink.internal.KeySerializer.create(r0, r1, r2)
            com.google.crypto.tink.signature.EcdsaProtoSerialization.PUBLIC_KEY_SERIALIZER = r0
            com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda3 r0 = new com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda3
            r0.<init>()
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.signature.EcdsaProtoSerialization.PUBLIC_TYPE_URL_BYTES
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeyParser r0 = com.google.crypto.tink.internal.KeyParser.create(r0, r1, r2)
            com.google.crypto.tink.signature.EcdsaProtoSerialization.PUBLIC_KEY_PARSER = r0
            com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda4 r0 = new com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda4
            r0.<init>()
            java.lang.Class<com.google.crypto.tink.signature.EcdsaPrivateKey> r1 = com.google.crypto.tink.signature.EcdsaPrivateKey.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeySerializer r0 = com.google.crypto.tink.internal.KeySerializer.create(r0, r1, r2)
            com.google.crypto.tink.signature.EcdsaProtoSerialization.PRIVATE_KEY_SERIALIZER = r0
            com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda5 r0 = new com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda5
            r0.<init>()
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.signature.EcdsaProtoSerialization.PRIVATE_TYPE_URL_BYTES
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeyParser r0 = com.google.crypto.tink.internal.KeyParser.create(r0, r1, r2)
            com.google.crypto.tink.signature.EcdsaProtoSerialization.PRIVATE_KEY_PARSER = r0
            return
    }

    private EcdsaProtoSerialization() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int getEncodingLength(com.google.crypto.tink.signature.EcdsaParameters.CurveType r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            r0 = 33
            return r0
        Lb:
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            r0 = 49
            return r0
        L16:
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            r0 = 67
            return r0
        L21:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to serialize CurveType "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static com.google.crypto.tink.proto.EcdsaParams getProtoParams(com.google.crypto.tink.signature.EcdsaParameters r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = com.google.crypto.tink.proto.EcdsaParams.newBuilder()
            com.google.crypto.tink.signature.EcdsaParameters$HashType r1 = r2.getHashType()
            com.google.crypto.tink.proto.HashType r1 = toProtoHashType(r1)
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = r0.setHashType(r1)
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r1 = r2.getCurveType()
            com.google.crypto.tink.proto.EllipticCurveType r1 = toProtoCurveType(r1)
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = r0.setCurve(r1)
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r1 = r2.getSignatureEncoding()
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r1 = toProtoSignatureEncoding(r1)
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = r0.setEncoding(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.EcdsaParams r0 = (com.google.crypto.tink.proto.EcdsaParams) r0
            return r0
    }

    private static com.google.crypto.tink.proto.EcdsaPublicKey getProtoPublicKey(com.google.crypto.tink.signature.EcdsaPublicKey r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.EcdsaParameters r0 = r4.getParameters()
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = r0.getCurveType()
            int r0 = getEncodingLength(r0)
            java.security.spec.ECPoint r1 = r4.getPublicPoint()
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r2 = com.google.crypto.tink.proto.EcdsaPublicKey.newBuilder()
            com.google.crypto.tink.signature.EcdsaParameters r3 = r4.getParameters()
            com.google.crypto.tink.proto.EcdsaParams r3 = getProtoParams(r3)
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r2 = r2.setParams(r3)
            java.math.BigInteger r3 = r1.getAffineX()
            byte[] r3 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(r3, r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r3)
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r2 = r2.setX(r3)
            java.math.BigInteger r3 = r1.getAffineY()
            byte[] r3 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(r3, r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r3)
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r2 = r2.setY(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.EcdsaPublicKey r2 = (com.google.crypto.tink.proto.EcdsaPublicKey) r2
            return r2
    }

    private static com.google.crypto.tink.signature.EcdsaParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()
            java.lang.String r0 = r0.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L74
        L11:
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L6b
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L6b
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L6b
            com.google.crypto.tink.proto.EcdsaKeyFormat r0 = com.google.crypto.tink.proto.EcdsaKeyFormat.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L6b
            com.google.crypto.tink.signature.EcdsaParameters$Builder r1 = com.google.crypto.tink.signature.EcdsaParameters.builder()
            com.google.crypto.tink.proto.EcdsaParams r2 = r0.getParams()
            com.google.crypto.tink.proto.HashType r2 = r2.getHashType()
            com.google.crypto.tink.signature.EcdsaParameters$HashType r2 = toHashType(r2)
            com.google.crypto.tink.signature.EcdsaParameters$Builder r1 = r1.setHashType(r2)
            com.google.crypto.tink.proto.EcdsaParams r2 = r0.getParams()
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = r2.getEncoding()
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r2 = toSignatureEncoding(r2)
            com.google.crypto.tink.signature.EcdsaParameters$Builder r1 = r1.setSignatureEncoding(r2)
            com.google.crypto.tink.proto.EcdsaParams r2 = r0.getParams()
            com.google.crypto.tink.proto.EllipticCurveType r2 = r2.getCurve()
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r2 = toCurveType(r2)
            com.google.crypto.tink.signature.EcdsaParameters$Builder r1 = r1.setCurveType(r2)
            com.google.crypto.tink.proto.KeyTemplate r2 = r3.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r2 = r2.getOutputPrefixType()
            com.google.crypto.tink.signature.EcdsaParameters$Variant r2 = toVariant(r2)
            com.google.crypto.tink.signature.EcdsaParameters$Builder r1 = r1.setVariant(r2)
            com.google.crypto.tink.signature.EcdsaParameters r1 = r1.build()
            return r1
        L6b:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parsing EcdsaParameters failed: "
            r1.<init>(r2, r0)
            throw r1
        L74:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wrong type URL in call to EcdsaProtoSerialization.parseParameters: "
            java.lang.StringBuilder r1 = r1.append(r2)
            com.google.crypto.tink.proto.KeyTemplate r2 = r3.getKeyTemplate()
            java.lang.String r2 = r2.getTypeUrl()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static com.google.crypto.tink.signature.EcdsaPrivateKey parsePrivateKey(com.google.crypto.tink.internal.ProtoKeySerialization r7, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r8) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r7.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld4
        Ld:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r7.getValue()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.proto.EcdsaPrivateKey r0 = com.google.crypto.tink.proto.EcdsaPrivateKey.parseFrom(r0, r1)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            int r1 = r0.getVersion()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            if (r1 != 0) goto Lc1
            com.google.crypto.tink.proto.EcdsaPublicKey r1 = r0.getPublicKey()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaParameters$Builder r2 = com.google.crypto.tink.signature.EcdsaParameters.builder()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.proto.EcdsaParams r3 = r1.getParams()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.proto.HashType r3 = r3.getHashType()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaParameters$HashType r3 = toHashType(r3)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaParameters$Builder r2 = r2.setHashType(r3)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.proto.EcdsaParams r3 = r1.getParams()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r3 = r3.getEncoding()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r3 = toSignatureEncoding(r3)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaParameters$Builder r2 = r2.setSignatureEncoding(r3)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.proto.EcdsaParams r3 = r1.getParams()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.proto.EllipticCurveType r3 = r3.getCurve()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r3 = toCurveType(r3)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaParameters$Builder r2 = r2.setCurveType(r3)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.proto.OutputPrefixType r3 = r7.getOutputPrefixType()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaParameters$Variant r3 = toVariant(r3)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaParameters$Builder r2 = r2.setVariant(r3)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaParameters r2 = r2.build()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r3 = com.google.crypto.tink.signature.EcdsaPublicKey.builder()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r3 = r3.setParameters(r2)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            java.security.spec.ECPoint r4 = new java.security.spec.ECPoint     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = r1.getX()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            java.math.BigInteger r5 = com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(r5)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.shaded.protobuf.ByteString r6 = r1.getY()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            byte[] r6 = r6.toByteArray()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            java.math.BigInteger r6 = com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(r6)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            r4.<init>(r5, r6)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r3 = r3.setPublicPoint(r4)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            java.lang.Integer r4 = r7.getIdRequirementOrNull()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r3 = r3.setIdRequirement(r4)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaPublicKey r3 = r3.build()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaPrivateKey$Builder r4 = com.google.crypto.tink.signature.EcdsaPrivateKey.builder()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaPrivateKey$Builder r4 = r4.setPublicKey(r3)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = r0.getKeyValue()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            java.math.BigInteger r5 = com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(r5)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.SecretKeyAccess r6 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r8)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.util.SecretBigInteger r5 = com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(r5, r6)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaPrivateKey$Builder r4 = r4.setPrivateValue(r5)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            com.google.crypto.tink.signature.EcdsaPrivateKey r4 = r4.build()     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            return r4
        Lc1:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            java.lang.String r2 = "Only version 0 keys are accepted"
            r1.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
            throw r1     // Catch: java.lang.IllegalArgumentException -> Lc9 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lcb
        Lc9:
            r0 = move-exception
            goto Lcc
        Lcb:
            r0 = move-exception
        Lcc:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parsing EcdsaPrivateKey failed"
            r1.<init>(r2)
            throw r1
        Ld4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r7.getTypeUrl()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static com.google.crypto.tink.signature.EcdsaPublicKey parsePublicKey(com.google.crypto.tink.internal.ProtoKeySerialization r6, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r7) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r6.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.EcdsaPublicKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lac
        Ld:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r6.getValue()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.proto.EcdsaPublicKey r0 = com.google.crypto.tink.proto.EcdsaPublicKey.parseFrom(r0, r1)     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            int r1 = r0.getVersion()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            if (r1 != 0) goto L99
            com.google.crypto.tink.signature.EcdsaParameters$Builder r1 = com.google.crypto.tink.signature.EcdsaParameters.builder()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.proto.EcdsaParams r2 = r0.getParams()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.proto.HashType r2 = r2.getHashType()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.signature.EcdsaParameters$HashType r2 = toHashType(r2)     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.signature.EcdsaParameters$Builder r1 = r1.setHashType(r2)     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.proto.EcdsaParams r2 = r0.getParams()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = r2.getEncoding()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r2 = toSignatureEncoding(r2)     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.signature.EcdsaParameters$Builder r1 = r1.setSignatureEncoding(r2)     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.proto.EcdsaParams r2 = r0.getParams()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.proto.EllipticCurveType r2 = r2.getCurve()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r2 = toCurveType(r2)     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.signature.EcdsaParameters$Builder r1 = r1.setCurveType(r2)     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.proto.OutputPrefixType r2 = r6.getOutputPrefixType()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.signature.EcdsaParameters$Variant r2 = toVariant(r2)     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.signature.EcdsaParameters$Builder r1 = r1.setVariant(r2)     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.signature.EcdsaParameters r1 = r1.build()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r2 = com.google.crypto.tink.signature.EcdsaPublicKey.builder()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r2 = r2.setParameters(r1)     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            java.security.spec.ECPoint r3 = new java.security.spec.ECPoint     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r0.getX()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            byte[] r4 = r4.toByteArray()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            java.math.BigInteger r4 = com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(r4)     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = r0.getY()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            java.math.BigInteger r5 = com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(r5)     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            r3.<init>(r4, r5)     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r2 = r2.setPublicPoint(r3)     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            java.lang.Integer r3 = r6.getIdRequirementOrNull()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r2 = r2.setIdRequirement(r3)     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.signature.EcdsaPublicKey r2 = r2.build()     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            return r2
        L99:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            java.lang.String r2 = "Only version 0 keys are accepted"
            r1.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            throw r1     // Catch: java.lang.IllegalArgumentException -> La1 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
        La1:
            r0 = move-exception
            goto La4
        La3:
            r0 = move-exception
        La4:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parsing EcdsaPublicKey failed"
            r1.<init>(r2)
            throw r1
        Lac:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r6.getTypeUrl()
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
            com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.signature.EcdsaParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.PARAMETERS_SERIALIZER
            r1.registerParametersSerializer(r0)
            com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.PARAMETERS_PARSER
            r1.registerParametersParser(r0)
            com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.signature.EcdsaPublicKey, com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.PUBLIC_KEY_SERIALIZER
            r1.registerKeySerializer(r0)
            com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.PUBLIC_KEY_PARSER
            r1.registerKeyParser(r0)
            com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.signature.EcdsaPrivateKey, com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.PRIVATE_KEY_SERIALIZER
            r1.registerKeySerializer(r0)
            com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.PRIVATE_KEY_PARSER
            r1.registerKeyParser(r0)
            return
    }

    private static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.signature.EcdsaParameters r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.EcdsaKeyFormat$Builder r1 = com.google.crypto.tink.proto.EcdsaKeyFormat.newBuilder()
            com.google.crypto.tink.proto.EcdsaParams r2 = getProtoParams(r3)
            com.google.crypto.tink.proto.EcdsaKeyFormat$Builder r1 = r1.setParams(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EcdsaKeyFormat r1 = (com.google.crypto.tink.proto.EcdsaKeyFormat) r1
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setValue(r1)
            com.google.crypto.tink.signature.EcdsaParameters$Variant r1 = r3.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r1 = toProtoOutputPrefixType(r1)
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setOutputPrefixType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTemplate r0 = (com.google.crypto.tink.proto.KeyTemplate) r0
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = com.google.crypto.tink.internal.ProtoParametersSerialization.create(r0)
            return r0
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey(com.google.crypto.tink.signature.EcdsaPrivateKey r6, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r7) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.EcdsaParameters r0 = r6.getParameters()
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = r0.getCurveType()
            int r0 = getEncodingLength(r0)
            com.google.crypto.tink.proto.EcdsaPrivateKey$Builder r1 = com.google.crypto.tink.proto.EcdsaPrivateKey.newBuilder()
            com.google.crypto.tink.signature.EcdsaPublicKey r2 = r6.getPublicKey()
            com.google.crypto.tink.proto.EcdsaPublicKey r2 = getProtoPublicKey(r2)
            com.google.crypto.tink.proto.EcdsaPrivateKey$Builder r1 = r1.setPublicKey(r2)
            com.google.crypto.tink.util.SecretBigInteger r2 = r6.getPrivateValue()
            com.google.crypto.tink.SecretKeyAccess r3 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r7)
            java.math.BigInteger r2 = r2.getBigInteger(r3)
            byte[] r2 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(r2, r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2)
            com.google.crypto.tink.proto.EcdsaPrivateKey$Builder r1 = r1.setKeyValue(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EcdsaPrivateKey r1 = (com.google.crypto.tink.proto.EcdsaPrivateKey) r1
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE
            com.google.crypto.tink.signature.EcdsaParameters r3 = r6.getParameters()
            com.google.crypto.tink.signature.EcdsaParameters$Variant r3 = r3.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r3 = toProtoOutputPrefixType(r3)
            java.lang.Integer r4 = r6.getIdRequirementOrNull()
            java.lang.String r5 = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"
            com.google.crypto.tink.internal.ProtoKeySerialization r1 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r5, r1, r2, r3, r4)
            return r1
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey(com.google.crypto.tink.signature.EcdsaPublicKey r5, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r6) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.EcdsaPublicKey r0 = getProtoPublicKey(r5)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            com.google.crypto.tink.signature.EcdsaParameters r2 = r5.getParameters()
            com.google.crypto.tink.signature.EcdsaParameters$Variant r2 = r2.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r2 = toProtoOutputPrefixType(r2)
            java.lang.Integer r3 = r5.getIdRequirementOrNull()
            java.lang.String r4 = "type.googleapis.com/google.crypto.tink.EcdsaPublicKey"
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r4, r0, r1, r2, r3)
            return r0
    }

    private static com.google.crypto.tink.signature.EcdsaParameters.CurveType toCurveType(com.google.crypto.tink.proto.EllipticCurveType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2e;
                case 2: goto L2b;
                case 3: goto L28;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to parse EllipticCurveType: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r3.getNumber()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L28:
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521
            return r0
        L2b:
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384
            return r0
        L2e:
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256
            return r0
    }

    private static com.google.crypto.tink.signature.EcdsaParameters.HashType toHashType(com.google.crypto.tink.proto.HashType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2e;
                case 2: goto L2b;
                case 3: goto L28;
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
            com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512
            return r0
        L2b:
            com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA384
            return r0
        L2e:
            com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA256
            return r0
    }

    private static com.google.crypto.tink.proto.EllipticCurveType toProtoCurveType(com.google.crypto.tink.signature.EcdsaParameters.CurveType r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            return r0
        Lb:
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P384
            return r0
        L16:
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P521
            return r0
        L21:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to serialize CurveType "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static com.google.crypto.tink.proto.HashType toProtoHashType(com.google.crypto.tink.signature.EcdsaParameters.HashType r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA256
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            return r0
        Lb:
            com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA384
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA384
            return r0
        L16:
            com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA512
            return r0
        L21:
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

    private static com.google.crypto.tink.proto.OutputPrefixType toProtoOutputPrefixType(com.google.crypto.tink.signature.EcdsaParameters.Variant r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            return r0
        Lb:
            com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = com.google.crypto.tink.signature.EcdsaParameters.Variant.CRUNCHY
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY
            return r0
        L16:
            com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = com.google.crypto.tink.signature.EcdsaParameters.Variant.NO_PREFIX
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            return r0
        L21:
            com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = com.google.crypto.tink.signature.EcdsaParameters.Variant.LEGACY
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

    private static com.google.crypto.tink.proto.EcdsaSignatureEncoding toProtoSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r0 = com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.IEEE_P1363
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r0 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363
            return r0
        Lb:
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r0 = com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.DER
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r0 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER
            return r0
        L16:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to serialize SignatureEncoding "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding toSignatureEncoding(com.google.crypto.tink.proto.EcdsaSignatureEncoding r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2b;
                case 2: goto L28;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to parse EcdsaSignatureEncoding: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r3.getNumber()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L28:
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r0 = com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.DER
            return r0
        L2b:
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r0 = com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.IEEE_P1363
            return r0
    }

    private static com.google.crypto.tink.signature.EcdsaParameters.Variant toVariant(com.google.crypto.tink.proto.OutputPrefixType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
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
            com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = com.google.crypto.tink.signature.EcdsaParameters.Variant.NO_PREFIX
            return r0
        L2b:
            com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = com.google.crypto.tink.signature.EcdsaParameters.Variant.LEGACY
            return r0
        L2e:
            com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = com.google.crypto.tink.signature.EcdsaParameters.Variant.CRUNCHY
            return r0
        L31:
            com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK
            return r0
    }
}
