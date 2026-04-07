package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
final class ChaCha20Poly1305HpkeAead implements com.google.crypto.tink.hybrid.internal.HpkeAead {
    ChaCha20Poly1305HpkeAead() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] getAeadId() {
            r1 = this;
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.CHACHA20_POLY1305_AEAD_ID
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public int getKeyLength() {
            r1 = this;
            r0 = 32
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
            int r1 = r3.getKeyLength()
            if (r0 != r1) goto L11
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305 r0 = new com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305
            r0.<init>(r4)
            byte[] r1 = r0.decrypt(r5, r6, r7)
            return r1
        L11:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected key length: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r3.getKeyLength()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] seal(byte[] r4, byte[] r5, byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.getKeyLength()
            if (r0 != r1) goto L11
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305 r0 = new com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305
            r0.<init>(r4)
            byte[] r1 = r0.encrypt(r5, r6, r7)
            return r1
        L11:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected key length: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r3.getKeyLength()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
