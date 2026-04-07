package com.google.crypto.tink.aead.subtle;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class AesGcmFactory implements com.google.crypto.tink.aead.subtle.AeadFactory {
    private final int keySizeInBytes;

    public AesGcmFactory(int r2) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            int r0 = validateAesKeySize(r2)
            r1.keySizeInBytes = r0
            return
    }

    private static int validateAesKeySize(int r3) throws java.security.InvalidAlgorithmParameterException {
            r0 = 16
            if (r3 == r0) goto L1d
            r0 = 32
            if (r3 != r0) goto L9
            goto L1d
        L9:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "Invalid AES key size, expected 16 or 32, but got %d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L1d:
            return r3
    }

    @Override // com.google.crypto.tink.aead.subtle.AeadFactory
    public com.google.crypto.tink.Aead createAead(byte[] r4) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.getKeySizeInBytes()
            if (r0 != r1) goto Ld
            com.google.crypto.tink.subtle.AesGcmJce r0 = new com.google.crypto.tink.subtle.AesGcmJce
            r0.<init>(r4)
            return r0
        Ld:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            int r1 = r3.getKeySizeInBytes()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r4.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "Symmetric key has incorrect length; expected %s, but got %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.aead.subtle.AeadFactory
    public int getKeySizeInBytes() {
            r1 = this;
            int r0 = r1.keySizeInBytes
            return r0
    }
}
