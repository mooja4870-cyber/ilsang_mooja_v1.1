package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public class PrfMac implements com.google.crypto.tink.Mac {
    static final int MIN_TAG_SIZE_IN_BYTES = 10;
    private final int tagSize;
    private final com.google.crypto.tink.prf.Prf wrappedPrf;

    public PrfMac(com.google.crypto.tink.prf.Prf r3, int r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            r2.wrappedPrf = r3
            r2.tagSize = r4
            r0 = 10
            if (r4 < r0) goto L13
            r0 = 0
            byte[] r0 = new byte[r0]
            byte[] r0 = r3.compute(r0, r4)
            return
        L13:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r1 = "tag size too small, need at least 10 bytes"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.Mac
    public byte[] computeMac(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.prf.Prf r0 = r2.wrappedPrf
            int r1 = r2.tagSize
            byte[] r0 = r0.compute(r3, r1)
            return r0
    }

    @Override // com.google.crypto.tink.Mac
    public void verifyMac(byte[] r3, byte[] r4) throws java.security.GeneralSecurityException {
            r2 = this;
            byte[] r0 = r2.computeMac(r4)
            boolean r0 = com.google.crypto.tink.subtle.Bytes.equal(r0, r3)
            if (r0 == 0) goto Lb
            return
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "invalid MAC"
            r0.<init>(r1)
            throw r0
    }
}
