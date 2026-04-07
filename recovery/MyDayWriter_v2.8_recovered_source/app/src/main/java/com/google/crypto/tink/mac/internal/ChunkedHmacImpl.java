package com.google.crypto.tink.mac.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class ChunkedHmacImpl implements com.google.crypto.tink.mac.ChunkedMac {
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final com.google.crypto.tink.mac.HmacKey key;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.mac.internal.ChunkedHmacImpl.FIPS = r0
            return
    }

    public ChunkedHmacImpl(com.google.crypto.tink.mac.HmacKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.mac.internal.ChunkedHmacImpl.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto Le
            r2.key = r3
            return
        Le:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.mac.ChunkedMac
    public com.google.crypto.tink.mac.ChunkedMacComputation createComputation() throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.mac.internal.ChunkedHmacComputation r0 = new com.google.crypto.tink.mac.internal.ChunkedHmacComputation
            com.google.crypto.tink.mac.HmacKey r1 = r2.key
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.mac.ChunkedMac
    public com.google.crypto.tink.mac.ChunkedMacVerification createVerification(byte[] r4) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.length
            com.google.crypto.tink.mac.HmacKey r1 = r3.key
            com.google.crypto.tink.util.Bytes r1 = r1.getOutputPrefix()
            int r1 = r1.size()
            if (r0 < r1) goto L38
            com.google.crypto.tink.mac.HmacKey r0 = r3.key
            com.google.crypto.tink.util.Bytes r0 = r0.getOutputPrefix()
            com.google.crypto.tink.mac.HmacKey r1 = r3.key
            com.google.crypto.tink.util.Bytes r1 = r1.getOutputPrefix()
            int r1 = r1.size()
            r2 = 0
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.util.Bytes.copyFrom(r4, r2, r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            com.google.crypto.tink.mac.internal.ChunkedHmacVerification r0 = new com.google.crypto.tink.mac.internal.ChunkedHmacVerification
            com.google.crypto.tink.mac.HmacKey r1 = r3.key
            r0.<init>(r1, r4)
            return r0
        L30:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Wrong tag prefix"
            r0.<init>(r1)
            throw r0
        L38:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Tag too short"
            r0.<init>(r1)
            throw r0
    }
}
