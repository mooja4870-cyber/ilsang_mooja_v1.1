package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class ChaCha20Poly1305 implements com.google.crypto.tink.Aead {
    private final com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305 cipher;

    public ChaCha20Poly1305(byte[] r2) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305 r0 = new com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305
            r0.<init>(r2)
            r1.cipher = r0
            return
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.length
            r1 = 28
            if (r0 < r1) goto L18
            r0 = 12
            byte[] r1 = java.util.Arrays.copyOf(r4, r0)
            int r2 = r4.length
            int r2 = r2 - r0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r4, r0, r2)
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305 r2 = r3.cipher
            byte[] r2 = r2.decrypt(r0, r1, r5)
            return r2
        L18:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "ciphertext too short"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.length
            r1 = 12
            int r0 = r0 + r1
            int r0 = r0 + 16
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            byte[] r1 = com.google.crypto.tink.subtle.Random.randBytes(r1)
            r0.put(r1)
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305 r2 = r3.cipher
            r2.encrypt(r0, r1, r4, r5)
            byte[] r2 = r0.array()
            return r2
    }
}
