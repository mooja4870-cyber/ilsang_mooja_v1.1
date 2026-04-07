package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class AesGcmJce implements com.google.crypto.tink.Aead {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce insecureNonceAesGcmJce;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.subtle.AesGcmJce.FIPS = r0
            return
    }

    public AesGcmJce(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.AesGcmJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L14
            com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce r0 = new com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce
            r1 = 1
            r0.<init>(r3, r1)
            r2.insecureNonceAesGcmJce = r0
            return
        L14:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] r3, byte[] r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r0 = 12
            byte[] r0 = java.util.Arrays.copyOf(r3, r0)
            com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce r1 = r2.insecureNonceAesGcmJce
            byte[] r1 = r1.decrypt(r0, r3, r4)
            return r1
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] r3, byte[] r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r0 = 12
            byte[] r0 = com.google.crypto.tink.subtle.Random.randBytes(r0)
            com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce r1 = r2.insecureNonceAesGcmJce
            byte[] r1 = r1.encrypt(r0, r3, r4)
            return r1
    }
}
