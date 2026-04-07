package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class Ed25519Verify implements com.google.crypto.tink.PublicKeyVerify {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;
    private final com.google.crypto.tink.util.Bytes publicKey;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS
            com.google.crypto.tink.subtle.Ed25519Verify.FIPS = r0
            return
    }

    public Ed25519Verify(byte[] r4) {
            r3 = this;
            r3.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.Ed25519Verify.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L2b
            int r0 = r4.length
            r1 = 32
            if (r0 != r1) goto L17
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r4)
            r3.publicKey = r0
            return
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "Given public key's length is not %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Can not use Ed25519 in FIPS-mode."
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.length
            r1 = 64
            if (r0 != r1) goto L1a
            com.google.crypto.tink.util.Bytes r0 = r3.publicKey
            byte[] r0 = r0.toByteArray()
            boolean r0 = com.google.crypto.tink.subtle.Ed25519.verify(r5, r4, r0)
            if (r0 == 0) goto L12
            return
        L12:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Signature check failed."
            r0.<init>(r1)
            throw r0
        L1a:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "The length of the signature is not %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }
}
