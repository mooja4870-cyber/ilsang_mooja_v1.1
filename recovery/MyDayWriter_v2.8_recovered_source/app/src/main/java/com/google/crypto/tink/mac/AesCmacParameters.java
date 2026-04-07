package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes.dex */
public final class AesCmacParameters extends com.google.crypto.tink.mac.MacParameters {
    private final int keySizeBytes;
    private final int tagSizeBytes;
    private final com.google.crypto.tink.mac.AesCmacParameters.Variant variant;

    /* JADX INFO: renamed from: com.google.crypto.tink.mac.AesCmacParameters$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer keySizeBytes;

        @javax.annotation.Nullable
        private java.lang.Integer tagSizeBytes;
        private com.google.crypto.tink.mac.AesCmacParameters.Variant variant;

        private Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.keySizeBytes = r0
                r1.tagSizeBytes = r0
                com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = com.google.crypto.tink.mac.AesCmacParameters.Variant.NO_PREFIX
                r1.variant = r0
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.mac.AesCmacParameters.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.mac.AesCmacParameters build() throws java.security.GeneralSecurityException {
                r5 = this;
                java.lang.Integer r0 = r5.keySizeBytes
                if (r0 == 0) goto L31
                java.lang.Integer r0 = r5.tagSizeBytes
                if (r0 == 0) goto L29
                com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = r5.variant
                if (r0 == 0) goto L21
                com.google.crypto.tink.mac.AesCmacParameters r0 = new com.google.crypto.tink.mac.AesCmacParameters
                java.lang.Integer r1 = r5.keySizeBytes
                int r1 = r1.intValue()
                java.lang.Integer r2 = r5.tagSizeBytes
                int r2 = r2.intValue()
                com.google.crypto.tink.mac.AesCmacParameters$Variant r3 = r5.variant
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return r0
            L21:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "variant not set"
                r0.<init>(r1)
                throw r0
            L29:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "tag size not set"
                r0.<init>(r1)
                throw r0
            L31:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "key size not set"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.mac.AesCmacParameters.Builder setKeySizeBytes(int r4) throws java.security.GeneralSecurityException {
                r3 = this;
                r0 = 16
                if (r4 == r0) goto L1f
                r0 = 32
                if (r4 != r0) goto L9
                goto L1f
            L9:
                java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
                int r1 = r4 * 8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "Invalid key size %d; only 128-bit and 256-bit AES keys are supported"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
            L1f:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
                r3.keySizeBytes = r0
                return r3
        }

        public com.google.crypto.tink.mac.AesCmacParameters.Builder setTagSizeBytes(int r4) throws java.security.GeneralSecurityException {
                r3 = this;
                r0 = 10
                if (r4 < r0) goto Lf
                r0 = 16
                if (r0 < r4) goto Lf
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
                r3.tagSizeBytes = r0
                return r3
            Lf:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid tag size for AesCmacParameters: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.mac.AesCmacParameters.Builder setVariant(com.google.crypto.tink.mac.AesCmacParameters.Variant r1) {
                r0 = this;
                r0.variant = r1
                return r0
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {
        public static final com.google.crypto.tink.mac.AesCmacParameters.Variant CRUNCHY = null;
        public static final com.google.crypto.tink.mac.AesCmacParameters.Variant LEGACY = null;
        public static final com.google.crypto.tink.mac.AesCmacParameters.Variant NO_PREFIX = null;
        public static final com.google.crypto.tink.mac.AesCmacParameters.Variant TINK = null;
        private final java.lang.String name;

        static {
                com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = new com.google.crypto.tink.mac.AesCmacParameters$Variant
                java.lang.String r1 = "TINK"
                r0.<init>(r1)
                com.google.crypto.tink.mac.AesCmacParameters.Variant.TINK = r0
                com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = new com.google.crypto.tink.mac.AesCmacParameters$Variant
                java.lang.String r1 = "CRUNCHY"
                r0.<init>(r1)
                com.google.crypto.tink.mac.AesCmacParameters.Variant.CRUNCHY = r0
                com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = new com.google.crypto.tink.mac.AesCmacParameters$Variant
                java.lang.String r1 = "LEGACY"
                r0.<init>(r1)
                com.google.crypto.tink.mac.AesCmacParameters.Variant.LEGACY = r0
                com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = new com.google.crypto.tink.mac.AesCmacParameters$Variant
                java.lang.String r1 = "NO_PREFIX"
                r0.<init>(r1)
                com.google.crypto.tink.mac.AesCmacParameters.Variant.NO_PREFIX = r0
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

    private AesCmacParameters(int r1, int r2, com.google.crypto.tink.mac.AesCmacParameters.Variant r3) {
            r0 = this;
            r0.<init>()
            r0.keySizeBytes = r1
            r0.tagSizeBytes = r2
            r0.variant = r3
            return
    }

    /* synthetic */ AesCmacParameters(int r1, int r2, com.google.crypto.tink.mac.AesCmacParameters.Variant r3, com.google.crypto.tink.mac.AesCmacParameters.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public static com.google.crypto.tink.mac.AesCmacParameters.Builder builder() {
            com.google.crypto.tink.mac.AesCmacParameters$Builder r0 = new com.google.crypto.tink.mac.AesCmacParameters$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.mac.AesCmacParameters
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            com.google.crypto.tink.mac.AesCmacParameters r0 = (com.google.crypto.tink.mac.AesCmacParameters) r0
            int r2 = r0.getKeySizeBytes()
            int r3 = r4.getKeySizeBytes()
            if (r2 != r3) goto L29
            int r2 = r0.getTotalTagSizeBytes()
            int r3 = r4.getTotalTagSizeBytes()
            if (r2 != r3) goto L29
            com.google.crypto.tink.mac.AesCmacParameters$Variant r2 = r0.getVariant()
            com.google.crypto.tink.mac.AesCmacParameters$Variant r3 = r4.getVariant()
            if (r2 != r3) goto L29
            r1 = 1
            goto L2a
        L29:
        L2a:
            return r1
    }

    public int getCryptographicTagSizeBytes() {
            r1 = this;
            int r0 = r1.tagSizeBytes
            return r0
    }

    public int getKeySizeBytes() {
            r1 = this;
            int r0 = r1.keySizeBytes
            return r0
    }

    public int getTotalTagSizeBytes() {
            r2 = this;
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = r2.variant
            com.google.crypto.tink.mac.AesCmacParameters$Variant r1 = com.google.crypto.tink.mac.AesCmacParameters.Variant.NO_PREFIX
            if (r0 != r1) goto Lb
            int r0 = r2.getCryptographicTagSizeBytes()
            return r0
        Lb:
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = r2.variant
            com.google.crypto.tink.mac.AesCmacParameters$Variant r1 = com.google.crypto.tink.mac.AesCmacParameters.Variant.TINK
            if (r0 != r1) goto L18
            int r0 = r2.getCryptographicTagSizeBytes()
            int r0 = r0 + 5
            return r0
        L18:
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = r2.variant
            com.google.crypto.tink.mac.AesCmacParameters$Variant r1 = com.google.crypto.tink.mac.AesCmacParameters.Variant.CRUNCHY
            if (r0 != r1) goto L25
            int r0 = r2.getCryptographicTagSizeBytes()
            int r0 = r0 + 5
            return r0
        L25:
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = r2.variant
            com.google.crypto.tink.mac.AesCmacParameters$Variant r1 = com.google.crypto.tink.mac.AesCmacParameters.Variant.LEGACY
            if (r0 != r1) goto L32
            int r0 = r2.getCryptographicTagSizeBytes()
            int r0 = r0 + 5
            return r0
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown variant"
            r0.<init>(r1)
            throw r0
    }

    public com.google.crypto.tink.mac.AesCmacParameters.Variant getVariant() {
            r1 = this;
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = r1.variant
            return r0
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
            r2 = this;
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = r2.variant
            com.google.crypto.tink.mac.AesCmacParameters$Variant r1 = com.google.crypto.tink.mac.AesCmacParameters.Variant.NO_PREFIX
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.keySizeBytes
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r3.tagSizeBytes
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.crypto.tink.mac.AesCmacParameters$Variant r2 = r3.variant
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AES-CMAC Parameters (variant: "
            java.lang.StringBuilder r0 = r0.append(r1)
            com.google.crypto.tink.mac.AesCmacParameters$Variant r1 = r2.variant
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.tagSizeBytes
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "-byte tags, and "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.keySizeBytes
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "-byte key)"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
