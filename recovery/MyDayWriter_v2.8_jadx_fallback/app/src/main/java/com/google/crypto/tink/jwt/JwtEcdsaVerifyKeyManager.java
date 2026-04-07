package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
class JwtEcdsaVerifyKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.JwtEcdsaPublicKey> {

    /* JADX INFO: renamed from: com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm = null;

        static {
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm[] r0 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm = r0
                int[] r0 = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r1 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES256     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r1 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES384     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r1 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES512     // Catch: java.lang.NoSuchFieldError -> L2f
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

    private static class JwtPublicKeyVerifyFactory extends com.google.crypto.tink.internal.PrimitiveFactory<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal, com.google.crypto.tink.proto.JwtEcdsaPublicKey> {


        public JwtPublicKeyVerifyFactory() {
                r1 = this;
                java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> r0 = com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal.class
                r1.<init>(r0)
                return
        }

        public com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal getPrimitive(com.google.crypto.tink.proto.JwtEcdsaPublicKey r8) throws java.security.GeneralSecurityException {
                r7 = this;
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r0 = r8.getAlgorithm()
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.getCurve(r0)
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = r8.getX()
                byte[] r1 = r1.toByteArray()
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = r8.getY()
                byte[] r2 = r2.toByteArray()
                java.security.interfaces.ECPublicKey r1 = com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(r0, r1, r2)
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r2 = r8.getAlgorithm()
                com.google.crypto.tink.subtle.Enums$HashType r2 = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.hashForEcdsaAlgorithm(r2)
                com.google.crypto.tink.subtle.EcdsaVerifyJce r3 = new com.google.crypto.tink.subtle.EcdsaVerifyJce
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r4 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.IEEE_P1363
                r3.<init>(r1, r2, r4)
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r4 = r8.getAlgorithm()
                java.lang.String r4 = r4.name()
                boolean r5 = r8.hasCustomKid()
                if (r5 == 0) goto L47
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r5 = r8.getCustomKid()
                java.lang.String r5 = r5.getValue()
                java.util.Optional r5 = java.util.Optional.of(r5)
                goto L4b
            L47:
                java.util.Optional r5 = java.util.Optional.empty()
            L4b:
                com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager$JwtPublicKeyVerifyFactory$1 r6 = new com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager$JwtPublicKeyVerifyFactory$1
                r6.<init>(r7, r3, r4, r5)
                return r6
        }

        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public /* bridge */ /* synthetic */ com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal getPrimitive(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
                r0 = this;
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r1
                com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal r1 = r0.getPrimitive(r1)
                return r1
        }
    }

    public JwtEcdsaVerifyKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.JwtEcdsaPublicKey> r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager$JwtPublicKeyVerifyFactory r2 = new com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager$JwtPublicKeyVerifyFactory
            r2.<init>()
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static final com.google.crypto.tink.subtle.EllipticCurves.CurveType getCurve(com.google.crypto.tink.proto.JwtEcdsaAlgorithm r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm
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
            java.lang.String r2 = "unknown algorithm "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.name()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L28:
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521
            return r0
        L2b:
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384
            return r0
        L2e:
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256
            return r0
    }

    public static com.google.crypto.tink.subtle.Enums.HashType hashForEcdsaAlgorithm(com.google.crypto.tink.proto.JwtEcdsaAlgorithm r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm
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
            java.lang.String r2 = "unknown algorithm "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.name()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L28:
            com.google.crypto.tink.subtle.Enums$HashType r0 = com.google.crypto.tink.subtle.Enums.HashType.SHA512
            return r0
        L2b:
            com.google.crypto.tink.subtle.Enums$HashType r0 = com.google.crypto.tink.subtle.Enums.HashType.SHA384
            return r0
        L2e:
            com.google.crypto.tink.subtle.Enums$HashType r0 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            return r0
    }

    static final void validateEcdsaAlgorithm(com.google.crypto.tink.proto.JwtEcdsaAlgorithm r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.Enums$HashType r0 = hashForEcdsaAlgorithm(r1)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType() {
            r1 = this;
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.JwtEcdsaPublicKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.JwtEcdsaPublicKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.proto.JwtEcdsaAlgorithm r0 = r3.getAlgorithm()
            validateEcdsaAlgorithm(r0)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r1
            r0.validateKey(r1)
            return
    }
}
