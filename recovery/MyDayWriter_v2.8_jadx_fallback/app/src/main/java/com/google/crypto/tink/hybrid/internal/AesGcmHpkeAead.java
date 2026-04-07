package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
final class AesGcmHpkeAead implements com.google.crypto.tink.hybrid.internal.HpkeAead {
    private final int keyLength;

    AesGcmHpkeAead(int r4) throws java.security.InvalidAlgorithmParameterException {
            r3 = this;
            r3.<init>()
            r0 = 16
            if (r4 == r0) goto L25
            r0 = 32
            if (r4 != r0) goto Lc
            goto L25
        Lc:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported key length: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L25:
            r3.keyLength = r4
            return
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] getAeadId() throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r2.keyLength
            switch(r0) {
                case 16: goto L10;
                case 32: goto Ld;
                default: goto L5;
            }
        L5:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE AEAD ID"
            r0.<init>(r1)
            throw r0
        Ld:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.AES_256_GCM_AEAD_ID
            return r0
        L10:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.AES_128_GCM_AEAD_ID
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public int getKeyLength() {
            r1 = this;
            int r0 = r1.keyLength
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public int getNonceLength() {
            r1 = this;
            r0 = 12
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] open(byte[] r4, byte[] r5, byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.keyLength
            if (r0 != r1) goto L10
            com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce r0 = new com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce
            r1 = 0
            r0.<init>(r4, r1)
            byte[] r1 = r0.decrypt(r5, r6, r7)
            return r1
        L10:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected key length: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r4.length
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] seal(byte[] r4, byte[] r5, byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.keyLength
            if (r0 != r1) goto L10
            com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce r0 = new com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce
            r1 = 0
            r0.<init>(r4, r1)
            byte[] r1 = r0.encrypt(r5, r6, r7)
            return r1
        L10:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected key length: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r4.length
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
