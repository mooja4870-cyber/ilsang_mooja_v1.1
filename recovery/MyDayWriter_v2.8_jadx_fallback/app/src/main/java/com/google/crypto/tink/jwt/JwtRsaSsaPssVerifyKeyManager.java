package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
class JwtRsaSsaPssVerifyKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey> {


    /* JADX INFO: renamed from: com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm = null;

        static {
                com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager.AnonymousClass2.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm = r0
                int[] r0 = com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager.AnonymousClass2.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r1 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS256     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager.AnonymousClass2.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r1 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS384     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager.AnonymousClass2.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r1 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS512     // Catch: java.lang.NoSuchFieldError -> L2f
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

    public JwtRsaSsaPssVerifyKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey> r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager$1 r2 = new com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager$1
            java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> r3 = com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static /* synthetic */ java.security.interfaces.RSAPublicKey access$000(com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r1) throws java.security.GeneralSecurityException {
            java.security.interfaces.RSAPublicKey r0 = createPublicKey(r1)
            return r0
    }

    private static final java.security.interfaces.RSAPublicKey createPublicKey(com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r5) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r0 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r1 = "RSA"
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.KeyFactory r0 = (java.security.KeyFactory) r0
            java.math.BigInteger r1 = new java.math.BigInteger
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r5.getN()
            byte[] r2 = r2.toByteArray()
            r3 = 1
            r1.<init>(r3, r2)
            java.math.BigInteger r2 = new java.math.BigInteger
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r5.getE()
            byte[] r4 = r4.toByteArray()
            r2.<init>(r3, r4)
            java.security.spec.RSAPublicKeySpec r3 = new java.security.spec.RSAPublicKeySpec
            r3.<init>(r1, r2)
            java.security.PublicKey r3 = r0.generatePublic(r3)
            java.security.interfaces.RSAPublicKey r3 = (java.security.interfaces.RSAPublicKey) r3
            return r3
    }

    static final com.google.crypto.tink.subtle.Enums.HashType hashForPssAlgorithm(com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager.AnonymousClass2.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm
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

    static final int saltLengthForPssAlgorithm(com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager.AnonymousClass2.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm
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
            r0 = 64
            return r0
        L2b:
            r0 = 48
            return r0
        L2e:
            r0 = 32
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey"
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
    public com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r4) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.getVersion()
            int r1 = r3.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            java.math.BigInteger r0 = new java.math.BigInteger
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r4.getN()
            byte[] r1 = r1.toByteArray()
            r2 = 1
            r0.<init>(r2, r1)
            int r0 = r0.bitLength()
            com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r4.getE()
            byte[] r1 = r1.toByteArray()
            r0.<init>(r2, r1)
            com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(r0)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r1 = (com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey) r1
            r0.validateKey(r1)
            return
    }
}
