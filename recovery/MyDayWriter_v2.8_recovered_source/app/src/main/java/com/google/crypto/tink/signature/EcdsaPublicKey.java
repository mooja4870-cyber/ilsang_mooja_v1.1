package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class EcdsaPublicKey extends com.google.crypto.tink.signature.SignaturePublicKey {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.signature.EcdsaParameters parameters;
    private final java.security.spec.ECPoint publicPoint;

    /* JADX INFO: renamed from: com.google.crypto.tink.signature.EcdsaPublicKey$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer idRequirement;

        @javax.annotation.Nullable
        private com.google.crypto.tink.signature.EcdsaParameters parameters;

        @javax.annotation.Nullable
        private java.security.spec.ECPoint publicPoint;

        private Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.parameters = r0
                r1.publicPoint = r0
                r1.idRequirement = r0
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.signature.EcdsaPublicKey.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private com.google.crypto.tink.util.Bytes getOutputPrefix() {
                r4 = this;
                com.google.crypto.tink.signature.EcdsaParameters r0 = r4.parameters
                com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = r0.getVariant()
                com.google.crypto.tink.signature.EcdsaParameters$Variant r1 = com.google.crypto.tink.signature.EcdsaParameters.Variant.NO_PREFIX
                r2 = 0
                if (r0 != r1) goto L12
                byte[] r0 = new byte[r2]
                com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
                return r0
            L12:
                com.google.crypto.tink.signature.EcdsaParameters r0 = r4.parameters
                com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = r0.getVariant()
                com.google.crypto.tink.signature.EcdsaParameters$Variant r1 = com.google.crypto.tink.signature.EcdsaParameters.Variant.LEGACY
                r3 = 5
                if (r0 == r1) goto L6d
                com.google.crypto.tink.signature.EcdsaParameters r0 = r4.parameters
                com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = r0.getVariant()
                com.google.crypto.tink.signature.EcdsaParameters$Variant r1 = com.google.crypto.tink.signature.EcdsaParameters.Variant.CRUNCHY
                if (r0 != r1) goto L28
                goto L6d
            L28:
                com.google.crypto.tink.signature.EcdsaParameters r0 = r4.parameters
                com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = r0.getVariant()
                com.google.crypto.tink.signature.EcdsaParameters$Variant r1 = com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK
                if (r0 != r1) goto L4e
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r3)
                r1 = 1
                java.nio.ByteBuffer r0 = r0.put(r1)
                java.lang.Integer r1 = r4.idRequirement
                int r1 = r1.intValue()
                java.nio.ByteBuffer r0 = r0.putInt(r1)
                byte[] r0 = r0.array()
                com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
                return r0
            L4e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unknown EcdsaParameters.Variant: "
                java.lang.StringBuilder r1 = r1.append(r2)
                com.google.crypto.tink.signature.EcdsaParameters r2 = r4.parameters
                com.google.crypto.tink.signature.EcdsaParameters$Variant r2 = r2.getVariant()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L6d:
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r3)
                java.nio.ByteBuffer r0 = r0.put(r2)
                java.lang.Integer r1 = r4.idRequirement
                int r1 = r1.intValue()
                java.nio.ByteBuffer r0 = r0.putInt(r1)
                byte[] r0 = r0.array()
                com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
                return r0
        }

        public com.google.crypto.tink.signature.EcdsaPublicKey build() throws java.security.GeneralSecurityException {
                r8 = this;
                com.google.crypto.tink.signature.EcdsaParameters r0 = r8.parameters
                if (r0 == 0) goto L5e
                java.security.spec.ECPoint r0 = r8.publicPoint
                if (r0 == 0) goto L56
                java.security.spec.ECPoint r0 = r8.publicPoint
                com.google.crypto.tink.signature.EcdsaParameters r1 = r8.parameters
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r1 = r1.getCurveType()
                java.security.spec.ECParameterSpec r1 = r1.toParameterSpec()
                java.security.spec.EllipticCurve r1 = r1.getCurve()
                com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(r0, r1)
                com.google.crypto.tink.signature.EcdsaParameters r0 = r8.parameters
                boolean r0 = r0.hasIdRequirement()
                if (r0 == 0) goto L30
                java.lang.Integer r0 = r8.idRequirement
                if (r0 == 0) goto L28
                goto L30
            L28:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Cannot create key without ID requirement with parameters with ID requirement"
                r0.<init>(r1)
                throw r0
            L30:
                com.google.crypto.tink.signature.EcdsaParameters r0 = r8.parameters
                boolean r0 = r0.hasIdRequirement()
                if (r0 != 0) goto L45
                java.lang.Integer r0 = r8.idRequirement
                if (r0 != 0) goto L3d
                goto L45
            L3d:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Cannot create key with ID requirement with parameters without ID requirement"
                r0.<init>(r1)
                throw r0
            L45:
                com.google.crypto.tink.util.Bytes r5 = r8.getOutputPrefix()
                com.google.crypto.tink.signature.EcdsaPublicKey r2 = new com.google.crypto.tink.signature.EcdsaPublicKey
                com.google.crypto.tink.signature.EcdsaParameters r3 = r8.parameters
                java.security.spec.ECPoint r4 = r8.publicPoint
                java.lang.Integer r6 = r8.idRequirement
                r7 = 0
                r2.<init>(r3, r4, r5, r6, r7)
                return r2
            L56:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Cannot build without public point"
                r0.<init>(r1)
                throw r0
            L5e:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Cannot build without parameters"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.signature.EcdsaPublicKey.Builder setIdRequirement(@javax.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                r0.idRequirement = r1
                return r0
        }

        public com.google.crypto.tink.signature.EcdsaPublicKey.Builder setParameters(com.google.crypto.tink.signature.EcdsaParameters r1) {
                r0 = this;
                r0.parameters = r1
                return r0
        }

        public com.google.crypto.tink.signature.EcdsaPublicKey.Builder setPublicPoint(java.security.spec.ECPoint r1) {
                r0 = this;
                r0.publicPoint = r1
                return r0
        }
    }

    private EcdsaPublicKey(com.google.crypto.tink.signature.EcdsaParameters r1, java.security.spec.ECPoint r2, com.google.crypto.tink.util.Bytes r3, @javax.annotation.Nullable java.lang.Integer r4) {
            r0 = this;
            r0.<init>()
            r0.parameters = r1
            r0.publicPoint = r2
            r0.outputPrefix = r3
            r0.idRequirement = r4
            return
    }

    /* synthetic */ EcdsaPublicKey(com.google.crypto.tink.signature.EcdsaParameters r1, java.security.spec.ECPoint r2, com.google.crypto.tink.util.Bytes r3, java.lang.Integer r4, com.google.crypto.tink.signature.EcdsaPublicKey.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static com.google.crypto.tink.signature.EcdsaPublicKey.Builder builder() {
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r0 = new com.google.crypto.tink.signature.EcdsaPublicKey$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(com.google.crypto.tink.Key r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.signature.EcdsaPublicKey
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            com.google.crypto.tink.signature.EcdsaPublicKey r0 = (com.google.crypto.tink.signature.EcdsaPublicKey) r0
            com.google.crypto.tink.signature.EcdsaParameters r2 = r0.parameters
            com.google.crypto.tink.signature.EcdsaParameters r3 = r4.parameters
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L29
            java.security.spec.ECPoint r2 = r0.publicPoint
            java.security.spec.ECPoint r3 = r4.publicPoint
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L29
            java.lang.Integer r2 = r0.idRequirement
            java.lang.Integer r3 = r4.idRequirement
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L29
            r1 = 1
            goto L2a
        L29:
        L2a:
            return r1
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public java.lang.Integer getIdRequirementOrNull() {
            r1 = this;
            java.lang.Integer r0 = r1.idRequirement
            return r0
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey
    public com.google.crypto.tink.util.Bytes getOutputPrefix() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.outputPrefix
            return r0
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey, com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.Parameters getParameters() {
            r1 = this;
            com.google.crypto.tink.signature.EcdsaParameters r0 = r1.getParameters()
            return r0
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey, com.google.crypto.tink.Key
    public com.google.crypto.tink.signature.EcdsaParameters getParameters() {
            r1 = this;
            com.google.crypto.tink.signature.EcdsaParameters r0 = r1.parameters
            return r0
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey, com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.signature.SignatureParameters getParameters() {
            r1 = this;
            com.google.crypto.tink.signature.EcdsaParameters r0 = r1.getParameters()
            return r0
    }

    public java.security.spec.ECPoint getPublicPoint() {
            r1 = this;
            java.security.spec.ECPoint r0 = r1.publicPoint
            return r0
    }
}
