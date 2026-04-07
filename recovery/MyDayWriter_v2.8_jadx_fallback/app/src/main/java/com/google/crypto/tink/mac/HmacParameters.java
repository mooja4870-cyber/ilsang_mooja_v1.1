package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes.dex */
public final class HmacParameters extends com.google.crypto.tink.mac.MacParameters {
    private final com.google.crypto.tink.mac.HmacParameters.HashType hashType;
    private final int keySizeBytes;
    private final int tagSizeBytes;
    private final com.google.crypto.tink.mac.HmacParameters.Variant variant;

    /* JADX INFO: renamed from: com.google.crypto.tink.mac.HmacParameters$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private com.google.crypto.tink.mac.HmacParameters.HashType hashType;

        @javax.annotation.Nullable
        private java.lang.Integer keySizeBytes;

        @javax.annotation.Nullable
        private java.lang.Integer tagSizeBytes;
        private com.google.crypto.tink.mac.HmacParameters.Variant variant;

        private Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.keySizeBytes = r0
                r1.tagSizeBytes = r0
                r1.hashType = r0
                com.google.crypto.tink.mac.HmacParameters$Variant r0 = com.google.crypto.tink.mac.HmacParameters.Variant.NO_PREFIX
                r1.variant = r0
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.mac.HmacParameters.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private static void validateTagSizeBytes(int r3, com.google.crypto.tink.mac.HmacParameters.HashType r4) throws java.security.GeneralSecurityException {
                r0 = 10
                if (r3 < r0) goto L9d
                com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA1
                if (r4 != r0) goto L21
                r0 = 20
                if (r3 > r0) goto Ld
                return
            Ld:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "Invalid tag size in bytes %d; can be at most 20 bytes for SHA1"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
            L21:
                com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA224
                if (r4 != r0) goto L3e
                r0 = 28
                if (r3 > r0) goto L2a
                return
            L2a:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "Invalid tag size in bytes %d; can be at most 28 bytes for SHA224"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
            L3e:
                com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA256
                if (r4 != r0) goto L5b
                r0 = 32
                if (r3 > r0) goto L47
                return
            L47:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "Invalid tag size in bytes %d; can be at most 32 bytes for SHA256"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
            L5b:
                com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA384
                if (r4 != r0) goto L78
                r0 = 48
                if (r3 > r0) goto L64
                return
            L64:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "Invalid tag size in bytes %d; can be at most 48 bytes for SHA384"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
            L78:
                com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA512
                if (r4 != r0) goto L95
                r0 = 64
                if (r3 > r0) goto L81
                return
            L81:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "Invalid tag size in bytes %d; can be at most 64 bytes for SHA512"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
            L95:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "unknown hash type; must be SHA256, SHA384 or SHA512"
                r0.<init>(r1)
                throw r0
            L9d:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "Invalid tag size in bytes %d; must be at least 10 bytes"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.mac.HmacParameters build() throws java.security.GeneralSecurityException {
                r8 = this;
                java.lang.Integer r0 = r8.keySizeBytes
                if (r0 == 0) goto L66
                java.lang.Integer r0 = r8.tagSizeBytes
                if (r0 == 0) goto L5e
                com.google.crypto.tink.mac.HmacParameters$HashType r0 = r8.hashType
                if (r0 == 0) goto L56
                com.google.crypto.tink.mac.HmacParameters$Variant r0 = r8.variant
                if (r0 == 0) goto L4e
                java.lang.Integer r0 = r8.keySizeBytes
                int r0 = r0.intValue()
                r1 = 16
                if (r0 < r1) goto L3c
                java.lang.Integer r0 = r8.tagSizeBytes
                int r0 = r0.intValue()
                com.google.crypto.tink.mac.HmacParameters$HashType r1 = r8.hashType
                validateTagSizeBytes(r0, r1)
                com.google.crypto.tink.mac.HmacParameters r2 = new com.google.crypto.tink.mac.HmacParameters
                java.lang.Integer r0 = r8.keySizeBytes
                int r3 = r0.intValue()
                java.lang.Integer r0 = r8.tagSizeBytes
                int r4 = r0.intValue()
                com.google.crypto.tink.mac.HmacParameters$Variant r5 = r8.variant
                com.google.crypto.tink.mac.HmacParameters$HashType r6 = r8.hashType
                r7 = 0
                r2.<init>(r3, r4, r5, r6, r7)
                return r2
            L3c:
                java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
                java.lang.Integer r1 = r8.keySizeBytes
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "Invalid key size in bytes %d; must be at least 16 bytes"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
            L4e:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "variant is not set"
                r0.<init>(r1)
                throw r0
            L56:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "hash type is not set"
                r0.<init>(r1)
                throw r0
            L5e:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "tag size is not set"
                r0.<init>(r1)
                throw r0
            L66:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "key size is not set"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.mac.HmacParameters.Builder setHashType(com.google.crypto.tink.mac.HmacParameters.HashType r1) {
                r0 = this;
                r0.hashType = r1
                return r0
        }

        public com.google.crypto.tink.mac.HmacParameters.Builder setKeySizeBytes(int r2) throws java.security.GeneralSecurityException {
                r1 = this;
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                r1.keySizeBytes = r0
                return r1
        }

        public com.google.crypto.tink.mac.HmacParameters.Builder setTagSizeBytes(int r2) throws java.security.GeneralSecurityException {
                r1 = this;
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                r1.tagSizeBytes = r0
                return r1
        }

        public com.google.crypto.tink.mac.HmacParameters.Builder setVariant(com.google.crypto.tink.mac.HmacParameters.Variant r1) {
                r0 = this;
                r0.variant = r1
                return r0
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class HashType {
        public static final com.google.crypto.tink.mac.HmacParameters.HashType SHA1 = null;
        public static final com.google.crypto.tink.mac.HmacParameters.HashType SHA224 = null;
        public static final com.google.crypto.tink.mac.HmacParameters.HashType SHA256 = null;
        public static final com.google.crypto.tink.mac.HmacParameters.HashType SHA384 = null;
        public static final com.google.crypto.tink.mac.HmacParameters.HashType SHA512 = null;
        private final java.lang.String name;

        static {
                com.google.crypto.tink.mac.HmacParameters$HashType r0 = new com.google.crypto.tink.mac.HmacParameters$HashType
                java.lang.String r1 = "SHA1"
                r0.<init>(r1)
                com.google.crypto.tink.mac.HmacParameters.HashType.SHA1 = r0
                com.google.crypto.tink.mac.HmacParameters$HashType r0 = new com.google.crypto.tink.mac.HmacParameters$HashType
                java.lang.String r1 = "SHA224"
                r0.<init>(r1)
                com.google.crypto.tink.mac.HmacParameters.HashType.SHA224 = r0
                com.google.crypto.tink.mac.HmacParameters$HashType r0 = new com.google.crypto.tink.mac.HmacParameters$HashType
                java.lang.String r1 = "SHA256"
                r0.<init>(r1)
                com.google.crypto.tink.mac.HmacParameters.HashType.SHA256 = r0
                com.google.crypto.tink.mac.HmacParameters$HashType r0 = new com.google.crypto.tink.mac.HmacParameters$HashType
                java.lang.String r1 = "SHA384"
                r0.<init>(r1)
                com.google.crypto.tink.mac.HmacParameters.HashType.SHA384 = r0
                com.google.crypto.tink.mac.HmacParameters$HashType r0 = new com.google.crypto.tink.mac.HmacParameters$HashType
                java.lang.String r1 = "SHA512"
                r0.<init>(r1)
                com.google.crypto.tink.mac.HmacParameters.HashType.SHA512 = r0
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
    public static final class Variant {
        public static final com.google.crypto.tink.mac.HmacParameters.Variant CRUNCHY = null;
        public static final com.google.crypto.tink.mac.HmacParameters.Variant LEGACY = null;
        public static final com.google.crypto.tink.mac.HmacParameters.Variant NO_PREFIX = null;
        public static final com.google.crypto.tink.mac.HmacParameters.Variant TINK = null;
        private final java.lang.String name;

        static {
                com.google.crypto.tink.mac.HmacParameters$Variant r0 = new com.google.crypto.tink.mac.HmacParameters$Variant
                java.lang.String r1 = "TINK"
                r0.<init>(r1)
                com.google.crypto.tink.mac.HmacParameters.Variant.TINK = r0
                com.google.crypto.tink.mac.HmacParameters$Variant r0 = new com.google.crypto.tink.mac.HmacParameters$Variant
                java.lang.String r1 = "CRUNCHY"
                r0.<init>(r1)
                com.google.crypto.tink.mac.HmacParameters.Variant.CRUNCHY = r0
                com.google.crypto.tink.mac.HmacParameters$Variant r0 = new com.google.crypto.tink.mac.HmacParameters$Variant
                java.lang.String r1 = "LEGACY"
                r0.<init>(r1)
                com.google.crypto.tink.mac.HmacParameters.Variant.LEGACY = r0
                com.google.crypto.tink.mac.HmacParameters$Variant r0 = new com.google.crypto.tink.mac.HmacParameters$Variant
                java.lang.String r1 = "NO_PREFIX"
                r0.<init>(r1)
                com.google.crypto.tink.mac.HmacParameters.Variant.NO_PREFIX = r0
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

    private HmacParameters(int r1, int r2, com.google.crypto.tink.mac.HmacParameters.Variant r3, com.google.crypto.tink.mac.HmacParameters.HashType r4) {
            r0 = this;
            r0.<init>()
            r0.keySizeBytes = r1
            r0.tagSizeBytes = r2
            r0.variant = r3
            r0.hashType = r4
            return
    }

    /* synthetic */ HmacParameters(int r1, int r2, com.google.crypto.tink.mac.HmacParameters.Variant r3, com.google.crypto.tink.mac.HmacParameters.HashType r4, com.google.crypto.tink.mac.HmacParameters.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static com.google.crypto.tink.mac.HmacParameters.Builder builder() {
            com.google.crypto.tink.mac.HmacParameters$Builder r0 = new com.google.crypto.tink.mac.HmacParameters$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.mac.HmacParameters
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            com.google.crypto.tink.mac.HmacParameters r0 = (com.google.crypto.tink.mac.HmacParameters) r0
            int r2 = r0.getKeySizeBytes()
            int r3 = r4.getKeySizeBytes()
            if (r2 != r3) goto L33
            int r2 = r0.getTotalTagSizeBytes()
            int r3 = r4.getTotalTagSizeBytes()
            if (r2 != r3) goto L33
            com.google.crypto.tink.mac.HmacParameters$Variant r2 = r0.getVariant()
            com.google.crypto.tink.mac.HmacParameters$Variant r3 = r4.getVariant()
            if (r2 != r3) goto L33
            com.google.crypto.tink.mac.HmacParameters$HashType r2 = r0.getHashType()
            com.google.crypto.tink.mac.HmacParameters$HashType r3 = r4.getHashType()
            if (r2 != r3) goto L33
            r1 = 1
            goto L34
        L33:
        L34:
            return r1
    }

    public int getCryptographicTagSizeBytes() {
            r1 = this;
            int r0 = r1.tagSizeBytes
            return r0
    }

    public com.google.crypto.tink.mac.HmacParameters.HashType getHashType() {
            r1 = this;
            com.google.crypto.tink.mac.HmacParameters$HashType r0 = r1.hashType
            return r0
    }

    public int getKeySizeBytes() {
            r1 = this;
            int r0 = r1.keySizeBytes
            return r0
    }

    public int getTotalTagSizeBytes() {
            r2 = this;
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = r2.variant
            com.google.crypto.tink.mac.HmacParameters$Variant r1 = com.google.crypto.tink.mac.HmacParameters.Variant.NO_PREFIX
            if (r0 != r1) goto Lb
            int r0 = r2.getCryptographicTagSizeBytes()
            return r0
        Lb:
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = r2.variant
            com.google.crypto.tink.mac.HmacParameters$Variant r1 = com.google.crypto.tink.mac.HmacParameters.Variant.TINK
            if (r0 != r1) goto L18
            int r0 = r2.getCryptographicTagSizeBytes()
            int r0 = r0 + 5
            return r0
        L18:
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = r2.variant
            com.google.crypto.tink.mac.HmacParameters$Variant r1 = com.google.crypto.tink.mac.HmacParameters.Variant.CRUNCHY
            if (r0 != r1) goto L25
            int r0 = r2.getCryptographicTagSizeBytes()
            int r0 = r0 + 5
            return r0
        L25:
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = r2.variant
            com.google.crypto.tink.mac.HmacParameters$Variant r1 = com.google.crypto.tink.mac.HmacParameters.Variant.LEGACY
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

    public com.google.crypto.tink.mac.HmacParameters.Variant getVariant() {
            r1 = this;
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = r1.variant
            return r0
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
            r2 = this;
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = r2.variant
            com.google.crypto.tink.mac.HmacParameters$Variant r1 = com.google.crypto.tink.mac.HmacParameters.Variant.NO_PREFIX
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
            int r1 = r4.tagSizeBytes
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.crypto.tink.mac.HmacParameters$Variant r2 = r4.variant
            com.google.crypto.tink.mac.HmacParameters$HashType r3 = r4.hashType
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HMAC Parameters (variant: "
            java.lang.StringBuilder r0 = r0.append(r1)
            com.google.crypto.tink.mac.HmacParameters$Variant r1 = r2.variant
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", hashType: "
            java.lang.StringBuilder r0 = r0.append(r1)
            com.google.crypto.tink.mac.HmacParameters$HashType r1 = r2.hashType
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
