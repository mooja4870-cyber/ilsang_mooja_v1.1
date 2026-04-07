package com.google.crypto.tink.prf;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class HkdfPrfKey extends com.google.crypto.tink.prf.PrfKey {
    private final com.google.crypto.tink.util.SecretBytes keyBytes;
    private final com.google.crypto.tink.prf.HkdfPrfParameters parameters;

    /* JADX INFO: renamed from: com.google.crypto.tink.prf.HkdfPrfKey$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.SecretBytes keyBytes;

        @javax.annotation.Nullable
        private com.google.crypto.tink.prf.HkdfPrfParameters parameters;

        private Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.parameters = r0
                r1.keyBytes = r0
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.prf.HkdfPrfKey.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.prf.HkdfPrfKey build() throws java.security.GeneralSecurityException {
                r4 = this;
                com.google.crypto.tink.prf.HkdfPrfParameters r0 = r4.parameters
                if (r0 == 0) goto L29
                com.google.crypto.tink.util.SecretBytes r0 = r4.keyBytes
                if (r0 == 0) goto L29
                com.google.crypto.tink.prf.HkdfPrfParameters r0 = r4.parameters
                int r0 = r0.getKeySizeBytes()
                com.google.crypto.tink.util.SecretBytes r1 = r4.keyBytes
                int r1 = r1.size()
                if (r0 != r1) goto L21
                com.google.crypto.tink.prf.HkdfPrfKey r0 = new com.google.crypto.tink.prf.HkdfPrfKey
                com.google.crypto.tink.prf.HkdfPrfParameters r1 = r4.parameters
                com.google.crypto.tink.util.SecretBytes r2 = r4.keyBytes
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
            L21:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Key size mismatch"
                r0.<init>(r1)
                throw r0
            L29:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Cannot build without parameters and/or key material"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.prf.HkdfPrfKey.Builder setKeyBytes(com.google.crypto.tink.util.SecretBytes r1) {
                r0 = this;
                r0.keyBytes = r1
                return r0
        }

        public com.google.crypto.tink.prf.HkdfPrfKey.Builder setParameters(com.google.crypto.tink.prf.HkdfPrfParameters r1) {
                r0 = this;
                r0.parameters = r1
                return r0
        }
    }

    private HkdfPrfKey(com.google.crypto.tink.prf.HkdfPrfParameters r1, com.google.crypto.tink.util.SecretBytes r2) {
            r0 = this;
            r0.<init>()
            r0.parameters = r1
            r0.keyBytes = r2
            return
    }

    /* synthetic */ HkdfPrfKey(com.google.crypto.tink.prf.HkdfPrfParameters r1, com.google.crypto.tink.util.SecretBytes r2, com.google.crypto.tink.prf.HkdfPrfKey.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.crypto.tink.prf.HkdfPrfKey.Builder builder() {
            com.google.crypto.tink.prf.HkdfPrfKey$Builder r0 = new com.google.crypto.tink.prf.HkdfPrfKey$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(com.google.crypto.tink.Key r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.prf.HkdfPrfKey
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            com.google.crypto.tink.prf.HkdfPrfKey r0 = (com.google.crypto.tink.prf.HkdfPrfKey) r0
            com.google.crypto.tink.prf.HkdfPrfParameters r2 = r0.parameters
            com.google.crypto.tink.prf.HkdfPrfParameters r3 = r4.parameters
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1e
            com.google.crypto.tink.util.SecretBytes r2 = r0.keyBytes
            com.google.crypto.tink.util.SecretBytes r3 = r4.keyBytes
            boolean r2 = r2.equalsSecretBytes(r3)
            if (r2 == 0) goto L1e
            r1 = 1
        L1e:
            return r1
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public java.lang.Integer getIdRequirementOrNull() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.google.crypto.tink.util.SecretBytes getKeyBytes() {
            r1 = this;
            com.google.crypto.tink.util.SecretBytes r0 = r1.keyBytes
            return r0
    }

    @Override // com.google.crypto.tink.prf.PrfKey, com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.Parameters getParameters() {
            r1 = this;
            com.google.crypto.tink.prf.HkdfPrfParameters r0 = r1.getParameters()
            return r0
    }

    @Override // com.google.crypto.tink.prf.PrfKey, com.google.crypto.tink.Key
    public com.google.crypto.tink.prf.HkdfPrfParameters getParameters() {
            r1 = this;
            com.google.crypto.tink.prf.HkdfPrfParameters r0 = r1.parameters
            return r0
    }

    @Override // com.google.crypto.tink.prf.PrfKey, com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.prf.PrfParameters getParameters() {
            r1 = this;
            com.google.crypto.tink.prf.HkdfPrfParameters r0 = r1.getParameters()
            return r0
    }
}
