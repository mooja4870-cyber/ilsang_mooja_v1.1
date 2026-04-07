package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class EcdsaPrivateKey extends com.google.crypto.tink.signature.SignaturePrivateKey {
    private final com.google.crypto.tink.util.SecretBigInteger privateValue;
    private final com.google.crypto.tink.signature.EcdsaPublicKey publicKey;

    /* JADX INFO: renamed from: com.google.crypto.tink.signature.EcdsaPrivateKey$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private com.google.crypto.tink.util.SecretBigInteger privateValue;
        private com.google.crypto.tink.signature.EcdsaPublicKey publicKey;

        private Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.publicKey = r0
                r1.privateValue = r0
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.signature.EcdsaPrivateKey.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private static void validatePrivateValue(java.math.BigInteger r4, java.security.spec.ECPoint r5, com.google.crypto.tink.signature.EcdsaParameters.CurveType r6) throws java.security.GeneralSecurityException {
                java.security.spec.ECParameterSpec r0 = r6.toParameterSpec()
                java.math.BigInteger r0 = r0.getOrder()
                int r1 = r4.signum()
                java.lang.String r2 = "Invalid private value"
                if (r1 <= 0) goto L2b
                int r1 = r4.compareTo(r0)
                if (r1 >= 0) goto L2b
                java.security.spec.ECParameterSpec r1 = r6.toParameterSpec()
                java.security.spec.ECPoint r1 = com.google.crypto.tink.internal.EllipticCurvesUtil.multiplyByGenerator(r4, r1)
                boolean r3 = r1.equals(r5)
                if (r3 == 0) goto L25
                return
            L25:
                java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
                r3.<init>(r2)
                throw r3
            L2b:
                java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
                r1.<init>(r2)
                throw r1
        }

        public com.google.crypto.tink.signature.EcdsaPrivateKey build() throws java.security.GeneralSecurityException {
                r4 = this;
                com.google.crypto.tink.signature.EcdsaPublicKey r0 = r4.publicKey
                if (r0 == 0) goto L38
                com.google.crypto.tink.util.SecretBigInteger r0 = r4.privateValue
                if (r0 == 0) goto L30
                com.google.crypto.tink.util.SecretBigInteger r0 = r4.privateValue
                com.google.crypto.tink.SecretKeyAccess r1 = com.google.crypto.tink.InsecureSecretKeyAccess.get()
                java.math.BigInteger r0 = r0.getBigInteger(r1)
                com.google.crypto.tink.signature.EcdsaPublicKey r1 = r4.publicKey
                java.security.spec.ECPoint r1 = r1.getPublicPoint()
                com.google.crypto.tink.signature.EcdsaPublicKey r2 = r4.publicKey
                com.google.crypto.tink.signature.EcdsaParameters r2 = r2.getParameters()
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r2 = r2.getCurveType()
                validatePrivateValue(r0, r1, r2)
                com.google.crypto.tink.signature.EcdsaPrivateKey r0 = new com.google.crypto.tink.signature.EcdsaPrivateKey
                com.google.crypto.tink.signature.EcdsaPublicKey r1 = r4.publicKey
                com.google.crypto.tink.util.SecretBigInteger r2 = r4.privateValue
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
            L30:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Cannot build without a private value"
                r0.<init>(r1)
                throw r0
            L38:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Cannot build without a ecdsa public key"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.signature.EcdsaPrivateKey.Builder setPrivateValue(com.google.crypto.tink.util.SecretBigInteger r1) {
                r0 = this;
                r0.privateValue = r1
                return r0
        }

        public com.google.crypto.tink.signature.EcdsaPrivateKey.Builder setPublicKey(com.google.crypto.tink.signature.EcdsaPublicKey r1) {
                r0 = this;
                r0.publicKey = r1
                return r0
        }
    }

    private EcdsaPrivateKey(com.google.crypto.tink.signature.EcdsaPublicKey r1, com.google.crypto.tink.util.SecretBigInteger r2) {
            r0 = this;
            r0.<init>()
            r0.publicKey = r1
            r0.privateValue = r2
            return
    }

    /* synthetic */ EcdsaPrivateKey(com.google.crypto.tink.signature.EcdsaPublicKey r1, com.google.crypto.tink.util.SecretBigInteger r2, com.google.crypto.tink.signature.EcdsaPrivateKey.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.crypto.tink.signature.EcdsaPrivateKey.Builder builder() {
            com.google.crypto.tink.signature.EcdsaPrivateKey$Builder r0 = new com.google.crypto.tink.signature.EcdsaPrivateKey$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(com.google.crypto.tink.Key r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.signature.EcdsaPrivateKey
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            com.google.crypto.tink.signature.EcdsaPrivateKey r0 = (com.google.crypto.tink.signature.EcdsaPrivateKey) r0
            com.google.crypto.tink.signature.EcdsaPublicKey r2 = r0.publicKey
            com.google.crypto.tink.signature.EcdsaPublicKey r3 = r4.publicKey
            boolean r2 = r2.equalsKey(r3)
            if (r2 == 0) goto L1f
            com.google.crypto.tink.util.SecretBigInteger r2 = r4.privateValue
            com.google.crypto.tink.util.SecretBigInteger r3 = r0.privateValue
            boolean r2 = r2.equalsSecretBigInteger(r3)
            if (r2 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
        L20:
            return r1
    }

    @Override // com.google.crypto.tink.signature.SignaturePrivateKey, com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.Parameters getParameters() {
            r1 = this;
            com.google.crypto.tink.signature.EcdsaParameters r0 = r1.getParameters()
            return r0
    }

    @Override // com.google.crypto.tink.signature.SignaturePrivateKey, com.google.crypto.tink.Key
    public com.google.crypto.tink.signature.EcdsaParameters getParameters() {
            r1 = this;
            com.google.crypto.tink.signature.EcdsaPublicKey r0 = r1.publicKey
            com.google.crypto.tink.signature.EcdsaParameters r0 = r0.getParameters()
            return r0
    }

    @Override // com.google.crypto.tink.signature.SignaturePrivateKey, com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.signature.SignatureParameters getParameters() {
            r1 = this;
            com.google.crypto.tink.signature.EcdsaParameters r0 = r1.getParameters()
            return r0
    }

    public com.google.crypto.tink.util.SecretBigInteger getPrivateValue() {
            r1 = this;
            com.google.crypto.tink.util.SecretBigInteger r0 = r1.privateValue
            return r0
    }

    @Override // com.google.crypto.tink.signature.SignaturePrivateKey, com.google.crypto.tink.PrivateKey
    public /* bridge */ /* synthetic */ com.google.crypto.tink.Key getPublicKey() {
            r1 = this;
            com.google.crypto.tink.signature.EcdsaPublicKey r0 = r1.getPublicKey()
            return r0
    }

    @Override // com.google.crypto.tink.signature.SignaturePrivateKey, com.google.crypto.tink.PrivateKey
    public com.google.crypto.tink.signature.EcdsaPublicKey getPublicKey() {
            r1 = this;
            com.google.crypto.tink.signature.EcdsaPublicKey r0 = r1.publicKey
            return r0
    }

    @Override // com.google.crypto.tink.signature.SignaturePrivateKey, com.google.crypto.tink.PrivateKey
    public /* bridge */ /* synthetic */ com.google.crypto.tink.signature.SignaturePublicKey getPublicKey() {
            r1 = this;
            com.google.crypto.tink.signature.EcdsaPublicKey r0 = r1.getPublicKey()
            return r0
    }
}
