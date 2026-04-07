package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes.dex */
public final class EcdsaParameters extends com.google.crypto.tink.signature.SignatureParameters {
    private final com.google.crypto.tink.signature.EcdsaParameters.CurveType curveType;
    private final com.google.crypto.tink.signature.EcdsaParameters.HashType hashType;
    private final com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding signatureEncoding;
    private final com.google.crypto.tink.signature.EcdsaParameters.Variant variant;

    /* JADX INFO: renamed from: com.google.crypto.tink.signature.EcdsaParameters$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private com.google.crypto.tink.signature.EcdsaParameters.CurveType curveType;
        private com.google.crypto.tink.signature.EcdsaParameters.HashType hashType;
        private com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding signatureEncoding;
        private com.google.crypto.tink.signature.EcdsaParameters.Variant variant;

        private Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.signatureEncoding = r0
                r1.curveType = r0
                r1.hashType = r0
                com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = com.google.crypto.tink.signature.EcdsaParameters.Variant.NO_PREFIX
                r1.variant = r0
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.signature.EcdsaParameters.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.signature.EcdsaParameters build() throws java.security.GeneralSecurityException {
                r8 = this;
                com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r0 = r8.signatureEncoding
                if (r0 == 0) goto L7c
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = r8.curveType
                if (r0 == 0) goto L74
                com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = r8.hashType
                if (r0 == 0) goto L6c
                com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = r8.variant
                if (r0 == 0) goto L64
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = r8.curveType
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r1 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256
                if (r0 != r1) goto L25
                com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = r8.hashType
                com.google.crypto.tink.signature.EcdsaParameters$HashType r1 = com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA256
                if (r0 != r1) goto L1d
                goto L25
            L1d:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "NIST_P256 requires SHA256"
                r0.<init>(r1)
                throw r0
            L25:
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = r8.curveType
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r1 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384
                if (r0 != r1) goto L40
                com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = r8.hashType
                com.google.crypto.tink.signature.EcdsaParameters$HashType r1 = com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA384
                if (r0 == r1) goto L40
                com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = r8.hashType
                com.google.crypto.tink.signature.EcdsaParameters$HashType r1 = com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512
                if (r0 != r1) goto L38
                goto L40
            L38:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "NIST_P384 requires SHA384 or SHA512"
                r0.<init>(r1)
                throw r0
            L40:
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = r8.curveType
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r1 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521
                if (r0 != r1) goto L55
                com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = r8.hashType
                com.google.crypto.tink.signature.EcdsaParameters$HashType r1 = com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512
                if (r0 != r1) goto L4d
                goto L55
            L4d:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "NIST_P521 requires SHA512"
                r0.<init>(r1)
                throw r0
            L55:
                com.google.crypto.tink.signature.EcdsaParameters r2 = new com.google.crypto.tink.signature.EcdsaParameters
                com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r3 = r8.signatureEncoding
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r4 = r8.curveType
                com.google.crypto.tink.signature.EcdsaParameters$HashType r5 = r8.hashType
                com.google.crypto.tink.signature.EcdsaParameters$Variant r6 = r8.variant
                r7 = 0
                r2.<init>(r3, r4, r5, r6, r7)
                return r2
            L64:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "variant is not set"
                r0.<init>(r1)
                throw r0
            L6c:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "hash type is not set"
                r0.<init>(r1)
                throw r0
            L74:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "EC curve type is not set"
                r0.<init>(r1)
                throw r0
            L7c:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "signature encoding is not set"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.signature.EcdsaParameters.Builder setCurveType(com.google.crypto.tink.signature.EcdsaParameters.CurveType r1) {
                r0 = this;
                r0.curveType = r1
                return r0
        }

        public com.google.crypto.tink.signature.EcdsaParameters.Builder setHashType(com.google.crypto.tink.signature.EcdsaParameters.HashType r1) {
                r0 = this;
                r0.hashType = r1
                return r0
        }

        public com.google.crypto.tink.signature.EcdsaParameters.Builder setSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding r1) {
                r0 = this;
                r0.signatureEncoding = r1
                return r0
        }

        public com.google.crypto.tink.signature.EcdsaParameters.Builder setVariant(com.google.crypto.tink.signature.EcdsaParameters.Variant r1) {
                r0 = this;
                r0.variant = r1
                return r0
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class CurveType {
        public static final com.google.crypto.tink.signature.EcdsaParameters.CurveType NIST_P256 = null;
        public static final com.google.crypto.tink.signature.EcdsaParameters.CurveType NIST_P384 = null;
        public static final com.google.crypto.tink.signature.EcdsaParameters.CurveType NIST_P521 = null;
        private final java.lang.String name;
        private final java.security.spec.ECParameterSpec spec;

        static {
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = new com.google.crypto.tink.signature.EcdsaParameters$CurveType
                java.lang.String r1 = "NIST_P256"
                java.security.spec.ECParameterSpec r2 = com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P256_PARAMS
                r0.<init>(r1, r2)
                com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256 = r0
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = new com.google.crypto.tink.signature.EcdsaParameters$CurveType
                java.lang.String r1 = "NIST_P384"
                java.security.spec.ECParameterSpec r2 = com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P384_PARAMS
                r0.<init>(r1, r2)
                com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384 = r0
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = new com.google.crypto.tink.signature.EcdsaParameters$CurveType
                java.lang.String r1 = "NIST_P521"
                java.security.spec.ECParameterSpec r2 = com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P521_PARAMS
                r0.<init>(r1, r2)
                com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521 = r0
                return
        }

        private CurveType(java.lang.String r1, java.security.spec.ECParameterSpec r2) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.spec = r2
                return
        }

        public static com.google.crypto.tink.signature.EcdsaParameters.CurveType fromParameterSpec(java.security.spec.ECParameterSpec r2) throws java.security.GeneralSecurityException {
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256
                java.security.spec.ECParameterSpec r0 = r0.toParameterSpec()
                boolean r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.isSameEcParameterSpec(r2, r0)
                if (r0 == 0) goto Lf
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256
                return r0
            Lf:
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384
                java.security.spec.ECParameterSpec r0 = r0.toParameterSpec()
                boolean r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.isSameEcParameterSpec(r2, r0)
                if (r0 == 0) goto L1e
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384
                return r0
            L1e:
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521
                java.security.spec.ECParameterSpec r0 = r0.toParameterSpec()
                boolean r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.isSameEcParameterSpec(r2, r0)
                if (r0 == 0) goto L2d
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521
                return r0
            L2d:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "unknown ECParameterSpec"
                r0.<init>(r1)
                throw r0
        }

        public java.security.spec.ECParameterSpec toParameterSpec() {
                r1 = this;
                java.security.spec.ECParameterSpec r0 = r1.spec
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class HashType {
        public static final com.google.crypto.tink.signature.EcdsaParameters.HashType SHA256 = null;
        public static final com.google.crypto.tink.signature.EcdsaParameters.HashType SHA384 = null;
        public static final com.google.crypto.tink.signature.EcdsaParameters.HashType SHA512 = null;
        private final java.lang.String name;

        static {
                com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = new com.google.crypto.tink.signature.EcdsaParameters$HashType
                java.lang.String r1 = "SHA256"
                r0.<init>(r1)
                com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA256 = r0
                com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = new com.google.crypto.tink.signature.EcdsaParameters$HashType
                java.lang.String r1 = "SHA384"
                r0.<init>(r1)
                com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA384 = r0
                com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = new com.google.crypto.tink.signature.EcdsaParameters$HashType
                java.lang.String r1 = "SHA512"
                r0.<init>(r1)
                com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512 = r0
                return
        }

        private HashType(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class SignatureEncoding {
        public static final com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding DER = null;
        public static final com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding IEEE_P1363 = null;
        private final java.lang.String name;

        static {
                com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r0 = new com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding
                java.lang.String r1 = "IEEE_P1363"
                r0.<init>(r1)
                com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.IEEE_P1363 = r0
                com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r0 = new com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding
                java.lang.String r1 = "DER"
                r0.<init>(r1)
                com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.DER = r0
                return
        }

        private SignatureEncoding(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {
        public static final com.google.crypto.tink.signature.EcdsaParameters.Variant CRUNCHY = null;
        public static final com.google.crypto.tink.signature.EcdsaParameters.Variant LEGACY = null;
        public static final com.google.crypto.tink.signature.EcdsaParameters.Variant NO_PREFIX = null;
        public static final com.google.crypto.tink.signature.EcdsaParameters.Variant TINK = null;
        private final java.lang.String name;

        static {
                com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = new com.google.crypto.tink.signature.EcdsaParameters$Variant
                java.lang.String r1 = "TINK"
                r0.<init>(r1)
                com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK = r0
                com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = new com.google.crypto.tink.signature.EcdsaParameters$Variant
                java.lang.String r1 = "CRUNCHY"
                r0.<init>(r1)
                com.google.crypto.tink.signature.EcdsaParameters.Variant.CRUNCHY = r0
                com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = new com.google.crypto.tink.signature.EcdsaParameters$Variant
                java.lang.String r1 = "LEGACY"
                r0.<init>(r1)
                com.google.crypto.tink.signature.EcdsaParameters.Variant.LEGACY = r0
                com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = new com.google.crypto.tink.signature.EcdsaParameters$Variant
                java.lang.String r1 = "NO_PREFIX"
                r0.<init>(r1)
                com.google.crypto.tink.signature.EcdsaParameters.Variant.NO_PREFIX = r0
                return
        }

        private Variant(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }
    }

    private EcdsaParameters(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding r1, com.google.crypto.tink.signature.EcdsaParameters.CurveType r2, com.google.crypto.tink.signature.EcdsaParameters.HashType r3, com.google.crypto.tink.signature.EcdsaParameters.Variant r4) {
            r0 = this;
            r0.<init>()
            r0.signatureEncoding = r1
            r0.curveType = r2
            r0.hashType = r3
            r0.variant = r4
            return
    }

    /* synthetic */ EcdsaParameters(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding r1, com.google.crypto.tink.signature.EcdsaParameters.CurveType r2, com.google.crypto.tink.signature.EcdsaParameters.HashType r3, com.google.crypto.tink.signature.EcdsaParameters.Variant r4, com.google.crypto.tink.signature.EcdsaParameters.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static com.google.crypto.tink.signature.EcdsaParameters.Builder builder() {
            com.google.crypto.tink.signature.EcdsaParameters$Builder r0 = new com.google.crypto.tink.signature.EcdsaParameters$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.signature.EcdsaParameters
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            com.google.crypto.tink.signature.EcdsaParameters r0 = (com.google.crypto.tink.signature.EcdsaParameters) r0
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r2 = r0.getSignatureEncoding()
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r3 = r4.getSignatureEncoding()
            if (r2 != r3) goto L33
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r2 = r0.getCurveType()
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r3 = r4.getCurveType()
            if (r2 != r3) goto L33
            com.google.crypto.tink.signature.EcdsaParameters$HashType r2 = r0.getHashType()
            com.google.crypto.tink.signature.EcdsaParameters$HashType r3 = r4.getHashType()
            if (r2 != r3) goto L33
            com.google.crypto.tink.signature.EcdsaParameters$Variant r2 = r0.getVariant()
            com.google.crypto.tink.signature.EcdsaParameters$Variant r3 = r4.getVariant()
            if (r2 != r3) goto L33
            r1 = 1
            goto L34
        L33:
        L34:
            return r1
    }

    public com.google.crypto.tink.signature.EcdsaParameters.CurveType getCurveType() {
            r1 = this;
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = r1.curveType
            return r0
    }

    public com.google.crypto.tink.signature.EcdsaParameters.HashType getHashType() {
            r1 = this;
            com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = r1.hashType
            return r0
    }

    public com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding getSignatureEncoding() {
            r1 = this;
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r0 = r1.signatureEncoding
            return r0
    }

    public com.google.crypto.tink.signature.EcdsaParameters.Variant getVariant() {
            r1 = this;
            com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = r1.variant
            return r0
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
            r2 = this;
            com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = r2.variant
            com.google.crypto.tink.signature.EcdsaParameters$Variant r1 = com.google.crypto.tink.signature.EcdsaParameters.Variant.NO_PREFIX
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public int hashCode() {
            r4 = this;
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r0 = r4.signatureEncoding
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r1 = r4.curveType
            com.google.crypto.tink.signature.EcdsaParameters$HashType r2 = r4.hashType
            com.google.crypto.tink.signature.EcdsaParameters$Variant r3 = r4.variant
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ECDSA Parameters (variant: "
            java.lang.StringBuilder r0 = r0.append(r1)
            com.google.crypto.tink.signature.EcdsaParameters$Variant r1 = r2.variant
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", hashType: "
            java.lang.StringBuilder r0 = r0.append(r1)
            com.google.crypto.tink.signature.EcdsaParameters$HashType r1 = r2.hashType
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", encoding: "
            java.lang.StringBuilder r0 = r0.append(r1)
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r1 = r2.signatureEncoding
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", curve: "
            java.lang.StringBuilder r0 = r0.append(r1)
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r1 = r2.curveType
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
