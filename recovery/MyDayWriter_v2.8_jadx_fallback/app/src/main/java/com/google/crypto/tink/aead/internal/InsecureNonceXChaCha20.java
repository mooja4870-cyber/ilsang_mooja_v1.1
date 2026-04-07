package com.google.crypto.tink.aead.internal;

/* JADX INFO: loaded from: classes.dex */
public class InsecureNonceXChaCha20 extends com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base {
    public static final int NONCE_SIZE_IN_BYTES = 24;

    public InsecureNonceXChaCha20(byte[] r1, int r2) throws java.security.InvalidKeyException {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static int[] hChaCha20(int[] r6, int[] r7) {
            r0 = 16
            int[] r0 = new int[r0]
            com.google.crypto.tink.aead.internal.ChaCha20Util.setSigmaAndKey(r0, r6)
            r1 = 0
            r1 = r7[r1]
            r2 = 12
            r0[r2] = r1
            r1 = 1
            r1 = r7[r1]
            r3 = 13
            r0[r3] = r1
            r1 = 2
            r1 = r7[r1]
            r4 = 14
            r0[r4] = r1
            r1 = 3
            r1 = r7[r1]
            r5 = 15
            r0[r5] = r1
            com.google.crypto.tink.aead.internal.ChaCha20Util.shuffleState(r0)
            r1 = 4
            r2 = r0[r2]
            r0[r1] = r2
            r1 = 5
            r2 = r0[r3]
            r0[r1] = r2
            r1 = 6
            r2 = r0[r4]
            r0[r1] = r2
            r1 = 7
            r2 = r0[r5]
            r0[r1] = r2
            r1 = 8
            int[] r1 = java.util.Arrays.copyOf(r0, r1)
            return r1
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    int[] createInitialState(int[] r5, int r6) {
            r4 = this;
            int r0 = r5.length
            int r1 = r4.nonceSizeInBytes()
            r2 = 4
            int r1 = r1 / r2
            if (r0 != r1) goto L2d
            r0 = 16
            int[] r0 = new int[r0]
            int[] r1 = r4.key
            int[] r1 = hChaCha20(r1, r5)
            com.google.crypto.tink.aead.internal.ChaCha20Util.setSigmaAndKey(r0, r1)
            r1 = 12
            r0[r1] = r6
            r1 = 13
            r3 = 0
            r0[r1] = r3
            r1 = 14
            r2 = r5[r2]
            r0[r1] = r2
            r1 = 5
            r1 = r5[r1]
            r2 = 15
            r0[r2] = r1
            return r0
        L2d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r5.length
            int r1 = r1 * 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "XChaCha20 uses 192-bit nonces, but got a %d-bit nonce"
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
    int nonceSizeInBytes() {
            r1 = this;
            r0 = 24
            return r0
    }
}
