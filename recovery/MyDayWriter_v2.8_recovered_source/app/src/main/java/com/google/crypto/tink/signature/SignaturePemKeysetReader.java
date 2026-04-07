package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes.dex */
public final class SignaturePemKeysetReader implements com.google.crypto.tink.KeysetReader {
    private java.util.List<com.google.crypto.tink.signature.SignaturePemKeysetReader.PemKey> pemKeys;

    /* JADX INFO: renamed from: com.google.crypto.tink.signature.SignaturePemKeysetReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = null;

        static {
                com.google.crypto.tink.subtle.Enums$HashType[] r0 = com.google.crypto.tink.subtle.Enums.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.signature.SignaturePemKeysetReader.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = r0
                int[] r0 = com.google.crypto.tink.signature.SignaturePemKeysetReader.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.signature.SignaturePemKeysetReader.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.signature.SignaturePemKeysetReader.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                return
        }
    }

    public static final class Builder {
        private java.util.List<com.google.crypto.tink.signature.SignaturePemKeysetReader.PemKey> pemKeys;

        Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.pemKeys = r0
                return
        }

        public com.google.crypto.tink.signature.SignaturePemKeysetReader.Builder addPem(java.lang.String r4, com.google.crypto.tink.PemKeyType r5) {
                r3 = this;
                com.google.crypto.tink.signature.SignaturePemKeysetReader$PemKey r0 = new com.google.crypto.tink.signature.SignaturePemKeysetReader$PemKey
                r1 = 0
                r0.<init>(r1)
                java.io.BufferedReader r1 = new java.io.BufferedReader
                java.io.StringReader r2 = new java.io.StringReader
                r2.<init>(r4)
                r1.<init>(r2)
                r0.reader = r1
                r0.type = r5
                java.util.List<com.google.crypto.tink.signature.SignaturePemKeysetReader$PemKey> r1 = r3.pemKeys
                r1.add(r0)
                return r3
        }

        public com.google.crypto.tink.KeysetReader build() {
                r2 = this;
                com.google.crypto.tink.signature.SignaturePemKeysetReader r0 = new com.google.crypto.tink.signature.SignaturePemKeysetReader
                java.util.List<com.google.crypto.tink.signature.SignaturePemKeysetReader$PemKey> r1 = r2.pemKeys
                r0.<init>(r1)
                return r0
        }
    }

    private static final class PemKey {
        java.io.BufferedReader reader;
        com.google.crypto.tink.PemKeyType type;

        private PemKey() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ PemKey(com.google.crypto.tink.signature.SignaturePemKeysetReader.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    SignaturePemKeysetReader(java.util.List<com.google.crypto.tink.signature.SignaturePemKeysetReader.PemKey> r1) {
            r0 = this;
            r0.<init>()
            r0.pemKeys = r1
            return
    }

    private static com.google.crypto.tink.proto.KeyData convertEcPublicKey(com.google.crypto.tink.PemKeyType r4, java.security.interfaces.ECPublicKey r5) throws java.io.IOException {
            java.lang.String r0 = r4.algorithm
            java.lang.String r1 = "ECDSA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8b
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = com.google.crypto.tink.proto.EcdsaParams.newBuilder()
            com.google.crypto.tink.proto.HashType r1 = getHashType(r4)
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = r0.setHashType(r1)
            com.google.crypto.tink.proto.EllipticCurveType r1 = getCurveType(r4)
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = r0.setCurve(r1)
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r1 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = r0.setEncoding(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.EcdsaParams r0 = (com.google.crypto.tink.proto.EcdsaParams) r0
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r1 = com.google.crypto.tink.proto.EcdsaPublicKey.newBuilder()
            com.google.crypto.tink.signature.EcdsaVerifyKeyManager r2 = new com.google.crypto.tink.signature.EcdsaVerifyKeyManager
            r2.<init>()
            int r2 = r2.getVersion()
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r1 = r1.setVersion(r2)
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r1 = r1.setParams(r0)
            java.security.spec.ECPoint r2 = r5.getW()
            java.math.BigInteger r2 = r2.getAffineX()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(r2)
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r1 = r1.setX(r2)
            java.security.spec.ECPoint r2 = r5.getW()
            java.math.BigInteger r2 = r2.getAffineY()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(r2)
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r1 = r1.setY(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EcdsaPublicKey r1 = (com.google.crypto.tink.proto.EcdsaPublicKey) r1
            com.google.crypto.tink.proto.KeyData$Builder r2 = com.google.crypto.tink.proto.KeyData.newBuilder()
            com.google.crypto.tink.signature.EcdsaVerifyKeyManager r3 = new com.google.crypto.tink.signature.EcdsaVerifyKeyManager
            r3.<init>()
            java.lang.String r3 = r3.getKeyType()
            com.google.crypto.tink.proto.KeyData$Builder r2 = r2.setTypeUrl(r3)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r1.toByteString()
            com.google.crypto.tink.proto.KeyData$Builder r2 = r2.setValue(r3)
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            com.google.crypto.tink.proto.KeyData$Builder r2 = r2.setKeyMaterialType(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.KeyData r2 = (com.google.crypto.tink.proto.KeyData) r2
            return r2
        L8b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported EC signature algorithm: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r4.algorithm
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static com.google.crypto.tink.proto.KeyData convertRsaPublicKey(com.google.crypto.tink.PemKeyType r4, java.security.interfaces.RSAPublicKey r5) throws java.io.IOException {
            java.lang.String r0 = r4.algorithm
            java.lang.String r1 = "RSASSA-PKCS1-v1_5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L75
            com.google.crypto.tink.proto.RsaSsaPkcs1Params$Builder r0 = com.google.crypto.tink.proto.RsaSsaPkcs1Params.newBuilder()
            com.google.crypto.tink.proto.HashType r1 = getHashType(r4)
            com.google.crypto.tink.proto.RsaSsaPkcs1Params$Builder r0 = r0.setHashType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.RsaSsaPkcs1Params r0 = (com.google.crypto.tink.proto.RsaSsaPkcs1Params) r0
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey$Builder r1 = com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey.newBuilder()
            com.google.crypto.tink.signature.RsaSsaPkcs1VerifyKeyManager r2 = new com.google.crypto.tink.signature.RsaSsaPkcs1VerifyKeyManager
            r2.<init>()
            int r2 = r2.getVersion()
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey$Builder r1 = r1.setVersion(r2)
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey$Builder r1 = r1.setParams(r0)
            java.math.BigInteger r2 = r5.getPublicExponent()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(r2)
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey$Builder r1 = r1.setE(r2)
            java.math.BigInteger r2 = r5.getModulus()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(r2)
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey$Builder r1 = r1.setN(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey r1 = (com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey) r1
            com.google.crypto.tink.proto.KeyData$Builder r2 = com.google.crypto.tink.proto.KeyData.newBuilder()
            com.google.crypto.tink.signature.RsaSsaPkcs1VerifyKeyManager r3 = new com.google.crypto.tink.signature.RsaSsaPkcs1VerifyKeyManager
            r3.<init>()
            java.lang.String r3 = r3.getKeyType()
            com.google.crypto.tink.proto.KeyData$Builder r2 = r2.setTypeUrl(r3)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r1.toByteString()
            com.google.crypto.tink.proto.KeyData$Builder r2 = r2.setValue(r3)
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            com.google.crypto.tink.proto.KeyData$Builder r2 = r2.setKeyMaterialType(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.KeyData r2 = (com.google.crypto.tink.proto.KeyData) r2
            return r2
        L75:
            java.lang.String r0 = r4.algorithm
            java.lang.String r1 = "RSASSA-PSS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lfa
            com.google.crypto.tink.proto.RsaSsaPssParams$Builder r0 = com.google.crypto.tink.proto.RsaSsaPssParams.newBuilder()
            com.google.crypto.tink.proto.HashType r1 = getHashType(r4)
            com.google.crypto.tink.proto.RsaSsaPssParams$Builder r0 = r0.setSigHash(r1)
            com.google.crypto.tink.proto.HashType r1 = getHashType(r4)
            com.google.crypto.tink.proto.RsaSsaPssParams$Builder r0 = r0.setMgf1Hash(r1)
            int r1 = getDigestSizeInBytes(r4)
            com.google.crypto.tink.proto.RsaSsaPssParams$Builder r0 = r0.setSaltLength(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.RsaSsaPssParams r0 = (com.google.crypto.tink.proto.RsaSsaPssParams) r0
            com.google.crypto.tink.proto.RsaSsaPssPublicKey$Builder r1 = com.google.crypto.tink.proto.RsaSsaPssPublicKey.newBuilder()
            com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager r2 = new com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager
            r2.<init>()
            int r2 = r2.getVersion()
            com.google.crypto.tink.proto.RsaSsaPssPublicKey$Builder r1 = r1.setVersion(r2)
            com.google.crypto.tink.proto.RsaSsaPssPublicKey$Builder r1 = r1.setParams(r0)
            java.math.BigInteger r2 = r5.getPublicExponent()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(r2)
            com.google.crypto.tink.proto.RsaSsaPssPublicKey$Builder r1 = r1.setE(r2)
            java.math.BigInteger r2 = r5.getModulus()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(r2)
            com.google.crypto.tink.proto.RsaSsaPssPublicKey$Builder r1 = r1.setN(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.RsaSsaPssPublicKey r1 = (com.google.crypto.tink.proto.RsaSsaPssPublicKey) r1
            com.google.crypto.tink.proto.KeyData$Builder r2 = com.google.crypto.tink.proto.KeyData.newBuilder()
            com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager r3 = new com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager
            r3.<init>()
            java.lang.String r3 = r3.getKeyType()
            com.google.crypto.tink.proto.KeyData$Builder r2 = r2.setTypeUrl(r3)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r1.toByteString()
            com.google.crypto.tink.proto.KeyData$Builder r2 = r2.setValue(r3)
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            com.google.crypto.tink.proto.KeyData$Builder r2 = r2.setKeyMaterialType(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.KeyData r2 = (com.google.crypto.tink.proto.KeyData) r2
            return r2
        Lfa:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported RSA signature algorithm: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r4.algorithm
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static com.google.crypto.tink.proto.EllipticCurveType getCurveType(com.google.crypto.tink.PemKeyType r3) {
            int r0 = r3.keySizeInBits
            switch(r0) {
                case 256: goto L26;
                case 384: goto L23;
                case 521: goto L20;
                default: goto L5;
            }
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported curve for key size: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r3.keySizeInBits
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L20:
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P521
            return r0
        L23:
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P384
            return r0
        L26:
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            return r0
    }

    private static int getDigestSizeInBytes(com.google.crypto.tink.PemKeyType r3) {
            int[] r0 = com.google.crypto.tink.signature.SignaturePemKeysetReader.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType
            com.google.crypto.tink.subtle.Enums$HashType r1 = r3.hash
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L32;
                case 2: goto L2f;
                case 3: goto L2c;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported hash type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            com.google.crypto.tink.subtle.Enums$HashType r2 = r3.hash
            java.lang.String r2 = r2.name()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2c:
            r0 = 64
            return r0
        L2f:
            r0 = 48
            return r0
        L32:
            r0 = 32
            return r0
    }

    private static com.google.crypto.tink.proto.HashType getHashType(com.google.crypto.tink.PemKeyType r3) {
            int[] r0 = com.google.crypto.tink.signature.SignaturePemKeysetReader.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType
            com.google.crypto.tink.subtle.Enums$HashType r1 = r3.hash
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L32;
                case 2: goto L2f;
                case 3: goto L2c;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported hash type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            com.google.crypto.tink.subtle.Enums$HashType r2 = r3.hash
            java.lang.String r2 = r2.name()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2c:
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA512
            return r0
        L2f:
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA384
            return r0
        L32:
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            return r0
    }

    public static com.google.crypto.tink.signature.SignaturePemKeysetReader.Builder newBuilder() {
            com.google.crypto.tink.signature.SignaturePemKeysetReader$Builder r0 = new com.google.crypto.tink.signature.SignaturePemKeysetReader$Builder
            r0.<init>()
            return r0
    }

    private static com.google.crypto.tink.proto.Keyset.Key readKey(java.io.BufferedReader r4, com.google.crypto.tink.PemKeyType r5) throws java.io.IOException {
            java.security.Key r0 = r5.readKey(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r0 instanceof java.security.interfaces.RSAPublicKey
            if (r2 == 0) goto L14
            r1 = r0
            java.security.interfaces.RSAPublicKey r1 = (java.security.interfaces.RSAPublicKey) r1
            com.google.crypto.tink.proto.KeyData r1 = convertRsaPublicKey(r5, r1)
            goto L1f
        L14:
            boolean r2 = r0 instanceof java.security.interfaces.ECPublicKey
            if (r2 == 0) goto L42
            r1 = r0
            java.security.interfaces.ECPublicKey r1 = (java.security.interfaces.ECPublicKey) r1
            com.google.crypto.tink.proto.KeyData r1 = convertEcPublicKey(r5, r1)
        L1f:
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = com.google.crypto.tink.proto.Keyset.Key.newBuilder()
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = r2.setKeyData(r1)
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = r2.setStatus(r3)
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = r2.setOutputPrefixType(r3)
            int r3 = com.google.crypto.tink.subtle.Random.randInt()
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = r2.setKeyId(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.Keyset$Key r2 = (com.google.crypto.tink.proto.Keyset.Key) r2
            return r2
        L42:
            return r1
    }

    @Override // com.google.crypto.tink.KeysetReader
    public com.google.crypto.tink.proto.Keyset read() throws java.io.IOException {
            r6 = this;
            com.google.crypto.tink.proto.Keyset$Builder r0 = com.google.crypto.tink.proto.Keyset.newBuilder()
            java.util.List<com.google.crypto.tink.signature.SignaturePemKeysetReader$PemKey> r1 = r6.pemKeys
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            com.google.crypto.tink.signature.SignaturePemKeysetReader$PemKey r2 = (com.google.crypto.tink.signature.SignaturePemKeysetReader.PemKey) r2
            java.io.BufferedReader r3 = r2.reader
            com.google.crypto.tink.PemKeyType r4 = r2.type
            com.google.crypto.tink.proto.Keyset$Key r3 = readKey(r3, r4)
        L1e:
            if (r3 == 0) goto L2c
            r0.addKey(r3)
            java.io.BufferedReader r4 = r2.reader
            com.google.crypto.tink.PemKeyType r5 = r2.type
            com.google.crypto.tink.proto.Keyset$Key r3 = readKey(r4, r5)
            goto L1e
        L2c:
            goto La
        L2d:
            int r1 = r0.getKeyCount()
            if (r1 == 0) goto L46
            r1 = 0
            com.google.crypto.tink.proto.Keyset$Key r1 = r0.getKey(r1)
            int r1 = r1.getKeyId()
            r0.setPrimaryKeyId(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r0.build()
            com.google.crypto.tink.proto.Keyset r1 = (com.google.crypto.tink.proto.Keyset) r1
            return r1
        L46:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "cannot find any key"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.google.crypto.tink.KeysetReader
    public com.google.crypto.tink.proto.EncryptedKeyset readEncrypted() throws java.io.IOException {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
