package com.google.crypto.tink.aead.internal;

/* JADX INFO: loaded from: classes.dex */
public class InsecureNonceChaCha20 extends com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base {
    public InsecureNonceChaCha20(byte[] r1, int r2) throws java.security.InvalidKeyException {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public int[] createInitialState(int[] r5, int r6) {
            r4 = this;
            int r0 = r5.length
            int r1 = r4.nonceSizeInBytes()
            int r1 = r1 / 4
            if (r0 != r1) goto L1e
            r0 = 16
            int[] r0 = new int[r0]
            int[] r1 = r4.key
            com.google.crypto.tink.aead.internal.ChaCha20Util.setSigmaAndKey(r0, r1)
            r1 = 12
            r0[r1] = r6
            r1 = 13
            int r2 = r5.length
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r0, r1, r2)
            return r0
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r5.length
            int r1 = r1 * 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "ChaCha20 uses 96-bit nonces, but got a %d-bit nonce"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ byte[] decrypt(byte[] r1, java.nio.ByteBuffer r2) throws java.security.GeneralSecurityException {
            r0 = this;
            byte[] r1 = super.decrypt(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ byte[] decrypt(byte[] r1, byte[] r2) throws java.security.GeneralSecurityException {
            r0 = this;
            byte[] r1 = super.decrypt(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ void encrypt(java.nio.ByteBuffer r1, byte[] r2, byte[] r3) throws java.security.GeneralSecurityException {
            r0 = this;
            super.encrypt(r1, r2, r3)
            return
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ byte[] encrypt(byte[] r1, byte[] r2) throws java.security.GeneralSecurityException {
            r0 = this;
            byte[] r1 = super.encrypt(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public int nonceSizeInBytes() {
            r1 = this;
            r0 = 12
            return r0
    }
}
