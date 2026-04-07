package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes.dex */
public final class AesGcmParameters extends com.google.crypto.tink.aead.AeadParameters {
    private final int ivSizeBytes;
    private final int keySizeBytes;
    private final int tagSizeBytes;
    private final com.google.crypto.tink.aead.AesGcmParameters.Variant variant;

    /* JADX INFO: renamed from: com.google.crypto.tink.aead.AesGcmParameters$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer ivSizeBytes;

        @javax.annotation.Nullable
        private java.lang.Integer keySizeBytes;

        @javax.annotation.Nullable
        private java.lang.Integer tagSizeBytes;
        private com.google.crypto.tink.aead.AesGcmParameters.Variant variant;

        private Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.keySizeBytes = r0
                r1.ivSizeBytes = r0
                r1.tagSizeBytes = r0
                com.google.crypto.tink.aead.AesGcmParameters$Variant r0 = com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX
                r1.variant = r0
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.aead.AesGcmParameters.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.aead.AesGcmParameters build() throws java.security.GeneralSecurityException {
                r7 = this;
                java.lang.Integer r0 = r7.keySizeBytes
                if (r0 == 0) goto L43
                com.google.crypto.tink.aead.AesGcmParameters$Variant r0 = r7.variant
                if (r0 == 0) goto L3b
                java.lang.Integer r0 = r7.ivSizeBytes
                if (r0 == 0) goto L33
                java.lang.Integer r0 = r7.tagSizeBytes
                if (r0 == 0) goto L2b
                com.google.crypto.tink.aead.AesGcmParameters r1 = new com.google.crypto.tink.aead.AesGcmParameters
                java.lang.Integer r0 = r7.keySizeBytes
                int r2 = r0.intValue()
                java.lang.Integer r0 = r7.ivSizeBytes
                int r3 = r0.intValue()
                java.lang.Integer r0 = r7.tagSizeBytes
                int r4 = r0.intValue()
                com.google.crypto.tink.aead.AesGcmParameters$Variant r5 = r7.variant
                r6 = 0
                r1.<init>(r2, r3, r4, r5, r6)
                return r1
            L2b:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Tag size is not set"
                r0.<init>(r1)
                throw r0
            L33:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "IV size is not set"
                r0.<init>(r1)
                throw r0
            L3b:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Variant is not set"
                r0.<init>(r1)
                throw r0
            L43:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Key size is not set"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.aead.AesGcmParameters.Builder setIvSizeBytes(int r4) throws java.security.GeneralSecurityException {
                r3 = this;
                if (r4 <= 0) goto L9
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
                r3.ivSizeBytes = r0
                return r3
            L9:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "Invalid IV size in bytes %d; IV size must be positive"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.aead.AesGcmParameters.Builder setKeySizeBytes(int r4) throws java.security.GeneralSecurityException {
                r3 = this;
                r0 = 16
                if (r4 == r0) goto L21
                r0 = 24
                if (r4 == r0) goto L21
                r0 = 32
                if (r4 != r0) goto Ld
                goto L21
            Ld:
                java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
            L21:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
                r3.keySizeBytes = r0
                return r3
        }

        public com.google.crypto.tink.aead.AesGcmParameters.Builder setTagSizeBytes(int r4) throws java.security.GeneralSecurityException {
                r3 = this;
                r0 = 12
                if (r4 == r0) goto L29
                r0 = 13
                if (r4 == r0) goto L29
                r0 = 14
                if (r4 == r0) goto L29
                r0 = 15
                if (r4 == r0) goto L29
                r0 = 16
                if (r4 != r0) goto L15
                goto L29
            L15:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
            L29:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
                r3.tagSizeBytes = r0
                return r3
        }

        public com.google.crypto.tink.aead.AesGcmParameters.Builder setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant r1) {
                r0 = this;
                r0.variant = r1
                return r0
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {
        public static final com.google.crypto.tink.aead.AesGcmParameters.Variant CRUNCHY = null;
        public static final com.google.crypto.tink.aead.AesGcmParameters.Variant NO_PREFIX = null;
        public static final com.google.crypto.tink.aead.AesGcmParameters.Variant TINK = null;
        private final java.lang.String name;

        static {
                com.google.crypto.tink.aead.AesGcmParameters$Variant r0 = new com.google.crypto.tink.aead.AesGcmParameters$Variant
                java.lang.String r1 = "TINK"
                r0.<init>(r1)
                com.google.crypto.tink.aead.AesGcmParameters.Variant.TINK = r0
                com.google.crypto.tink.aead.AesGcmParameters$Variant r0 = new com.google.crypto.tink.aead.AesGcmParameters$Variant
                java.lang.String r1 = "CRUNCHY"
                r0.<init>(r1)
                com.google.crypto.tink.aead.AesGcmParameters.Variant.CRUNCHY = r0
                com.google.crypto.tink.aead.AesGcmParameters$Variant r0 = new com.google.crypto.tink.aead.AesGcmParameters$Variant
                java.lang.String r1 = "NO_PREFIX"
                r0.<init>(r1)
                com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX = r0
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

    private AesGcmParameters(int r1, int r2, int r3, com.google.crypto.tink.aead.AesGcmParameters.Variant r4) {
            r0 = this;
            r0.<init>()
            r0.keySizeBytes = r1
            r0.ivSizeBytes = r2
            r0.tagSizeBytes = r3
            r0.variant = r4
            return
    }

    /* synthetic */ AesGcmParameters(int r1, int r2, int r3, com.google.crypto.tink.aead.AesGcmParameters.Variant r4, com.google.crypto.tink.aead.AesGcmParameters.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static com.google.crypto.tink.aead.AesGcmParameters.Builder builder() {
            com.google.crypto.tink.aead.AesGcmParameters$Builder r0 = new com.google.crypto.tink.aead.AesGcmParameters$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.aead.AesGcmParameters
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            com.google.crypto.tink.aead.AesGcmParameters r0 = (com.google.crypto.tink.aead.AesGcmParameters) r0
            int r2 = r0.getKeySizeBytes()
            int r3 = r4.getKeySizeBytes()
            if (r2 != r3) goto L33
            int r2 = r0.getIvSizeBytes()
            int r3 = r4.getIvSizeBytes()
            if (r2 != r3) goto L33
            int r2 = r0.getTagSizeBytes()
            int r3 = r4.getTagSizeBytes()
            if (r2 != r3) goto L33
            com.google.crypto.tink.aead.AesGcmParameters$Variant r2 = r0.getVariant()
            com.google.crypto.tink.aead.AesGcmParameters$Variant r3 = r4.getVariant()
            if (r2 != r3) goto L33
            r1 = 1
            goto L34
        L33:
        L34:
            return r1
    }

    public int getIvSizeBytes() {
            r1 = this;
            int r0 = r1.ivSizeBytes
            return r0
    }

    public int getKeySizeBytes() {
            r1 = this;
            int r0 = r1.keySizeBytes
            return r0
    }

    public int getTagSizeBytes() {
            r1 = this;
            int r0 = r1.tagSizeBytes
            return r0
    }

    public com.google.crypto.tink.aead.AesGcmParameters.Variant getVariant() {
            r1 = this;
            com.google.crypto.tink.aead.AesGcmParameters$Variant r0 = r1.variant
            return r0
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
            r2 = this;
            com.google.crypto.tink.aead.AesGcmParameters$Variant r0 = r2.variant
            com.google.crypto.tink.aead.AesGcmParameters$Variant r1 = com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX
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
            int r0 = r4.keySizeBytes
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r4.ivSizeBytes
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r4.tagSizeBytes
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.crypto.tink.aead.AesGcmParameters$Variant r3 = r4.variant
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AesGcm Parameters (variant: "
            java.lang.StringBuilder r0 = r0.append(r1)
            com.google.crypto.tink.aead.AesGcmParameters$Variant r1 = r2.variant
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.ivSizeBytes
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "-byte IV, "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.tagSizeBytes
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "-byte tag, and "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.keySizeBytes
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "-byte key)"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
