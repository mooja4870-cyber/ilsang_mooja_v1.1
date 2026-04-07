package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
class ChaCha20 implements com.google.crypto.tink.subtle.IndCpaCipher {
    static final int NONCE_LENGTH_IN_BYTES = 12;
    private final com.google.crypto.tink.aead.internal.InsecureNonceChaCha20 cipher;

    ChaCha20(byte[] r2, int r3) throws java.security.InvalidKeyException {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20 r0 = new com.google.crypto.tink.aead.internal.InsecureNonceChaCha20
            r0.<init>(r2, r3)
            r1.cipher = r0
            return
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] decrypt(byte[] r4) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.length
            r1 = 12
            if (r0 < r1) goto L16
            byte[] r0 = java.util.Arrays.copyOf(r4, r1)
            int r2 = r4.length
            int r2 = r2 - r1
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r4, r1, r2)
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20 r2 = r3.cipher
            byte[] r2 = r2.decrypt(r0, r1)
            return r2
        L16:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "ciphertext too short"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] encrypt(byte[] r4) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.length
            r1 = 12
            int r0 = r0 + r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            byte[] r1 = com.google.crypto.tink.subtle.Random.randBytes(r1)
            r0.put(r1)
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20 r2 = r3.cipher
            r2.encrypt(r0, r1, r4)
            byte[] r2 = r0.array()
            return r2
    }
}
