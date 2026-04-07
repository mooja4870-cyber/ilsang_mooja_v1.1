package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes.dex */
public final class AesGcmSivParameters extends com.google.crypto.tink.aead.AeadParameters {
    private final int keySizeBytes;
    private final com.google.crypto.tink.aead.AesGcmSivParameters.Variant variant;

    /* JADX INFO: renamed from: com.google.crypto.tink.aead.AesGcmSivParameters$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer keySizeBytes;
        private com.google.crypto.tink.aead.AesGcmSivParameters.Variant variant;

        private Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.keySizeBytes = r0
                com.google.crypto.tink.aead.AesGcmSivParameters$Variant r0 = com.google.crypto.tink.aead.AesGcmSivParameters.Variant.NO_PREFIX
                r1.variant = r0
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.aead.AesGcmSivParameters.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.aead.AesGcmSivParameters build() throws java.security.GeneralSecurityException {
                r4 = this;
                java.lang.Integer r0 = r4.keySizeBytes
                if (r0 == 0) goto L1f
                com.google.crypto.tink.aead.AesGcmSivParameters$Variant r0 = r4.variant
                if (r0 == 0) goto L17
                com.google.crypto.tink.aead.AesGcmSivParameters r0 = new com.google.crypto.tink.aead.AesGcmSivParameters
                java.lang.Integer r1 = r4.keySizeBytes
                int r1 = r1.intValue()
                com.google.crypto.tink.aead.AesGcmSivParameters$Variant r2 = r4.variant
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
            L17:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Variant is not set"
                r0.<init>(r1)
                throw r0
            L1f:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Key size is not set"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.aead.AesGcmSivParameters.Builder setKeySizeBytes(int r4) throws java.security.GeneralSecurityException {
                r3 = this;
                r0 = 16
                if (r4 == r0) goto L1d
                r0 = 32
                if (r4 != r0) goto L9
                goto L1d
            L9:
                java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "Invalid key size %d; only 16-byte and 32-byte AES keys are supported"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
            L1d:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
                r3.keySizeBytes = r0
                return r3
        }

        public com.google.crypto.tink.aead.AesGcmSivParameters.Builder setVariant(com.google.crypto.tink.aead.AesGcmSivParameters.Variant r1) {
                r0 = this;
                r0.variant = r1
                return r0
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {
        public static final com.google.crypto.tink.aead.AesGcmSivParameters.Variant CRUNCHY = null;
        public static final com.google.crypto.tink.aead.AesGcmSivParameters.Variant NO_PREFIX = null;
        public static final com.google.crypto.tink.aead.AesGcmSivParameters.Variant TINK = null;
        private final java.lang.String name;

        static {
                com.google.crypto.tink.aead.AesGcmSivParameters$Variant r0 = new com.google.crypto.tink.aead.AesGcmSivParameters$Variant
                java.lang.String r1 = "TINK"
                r0.<init>(r1)
                com.google.crypto.tink.aead.AesGcmSivParameters.Variant.TINK = r0
                com.google.crypto.tink.aead.AesGcmSivParameters$Variant r0 = new com.google.crypto.tink.aead.AesGcmSivParameters$Variant
                java.lang.String r1 = "CRUNCHY"
                r0.<init>(r1)
                com.google.crypto.tink.aead.AesGcmSivParameters.Variant.CRUNCHY = r0
                com.google.crypto.tink.aead.AesGcmSivParameters$Variant r0 = new com.google.crypto.tink.aead.AesGcmSivParameters$Variant
                java.lang.String r1 = "NO_PREFIX"
                r0.<init>(r1)
                com.google.crypto.tink.aead.AesGcmSivParameters.Variant.NO_PREFIX = r0
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

    private AesGcmSivParameters(int r1, com.google.crypto.tink.aead.AesGcmSivParameters.Variant r2) {
            r0 = this;
            r0.<init>()
            r0.keySizeBytes = r1
            r0.variant = r2
            return
    }

    /* synthetic */ AesGcmSivParameters(int r1, com.google.crypto.tink.aead.AesGcmSivParameters.Variant r2, com.google.crypto.tink.aead.AesGcmSivParameters.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.crypto.tink.aead.AesGcmSivParameters.Builder builder() {
            com.google.crypto.tink.aead.AesGcmSivParameters$Builder r0 = new com.google.crypto.tink.aead.AesGcmSivParameters$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.aead.AesGcmSivParameters
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            com.google.crypto.tink.aead.AesGcmSivParameters r0 = (com.google.crypto.tink.aead.AesGcmSivParameters) r0
            int r2 = r0.getKeySizeBytes()
            int r3 = r4.getKeySizeBytes()
            if (r2 != r3) goto L1e
            com.google.crypto.tink.aead.AesGcmSivParameters$Variant r2 = r0.getVariant()
            com.google.crypto.tink.aead.AesGcmSivParameters$Variant r3 = r4.getVariant()
            if (r2 != r3) goto L1e
            r1 = 1
        L1e:
            return r1
    }

    public int getKeySizeBytes() {
            r1 = this;
            int r0 = r1.keySizeBytes
            return r0
    }

    public com.google.crypto.tink.aead.AesGcmSivParameters.Variant getVariant() {
            r1 = this;
            com.google.crypto.tink.aead.AesGcmSivParameters$Variant r0 = r1.variant
            return r0
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
            r2 = this;
            com.google.crypto.tink.aead.AesGcmSivParameters$Variant r0 = r2.variant
            com.google.crypto.tink.aead.AesGcmSivParameters$Variant r1 = com.google.crypto.tink.aead.AesGcmSivParameters.Variant.NO_PREFIX
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.keySizeBytes
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.google.crypto.tink.aead.AesGcmSivParameters$Variant r1 = r2.variant
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AesGcmSiv Parameters (variant: "
            java.lang.StringBuilder r0 = r0.append(r1)
            com.google.crypto.tink.aead.AesGcmSivParameters$Variant r1 = r2.variant
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.keySizeBytes
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "-byte key)"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
