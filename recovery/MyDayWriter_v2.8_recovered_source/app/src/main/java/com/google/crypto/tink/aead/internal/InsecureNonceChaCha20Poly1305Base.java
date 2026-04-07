package com.google.crypto.tink.aead.internal;

/* JADX INFO: loaded from: classes.dex */
abstract class InsecureNonceChaCha20Poly1305Base {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base chacha20;
    private final com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base macKeyChaCha20;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base.FIPS = r0
            return
    }

    public InsecureNonceChaCha20Poly1305Base(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L1a
            r0 = 1
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base r0 = r2.newChaCha20Instance(r3, r0)
            r2.chacha20 = r0
            r0 = 0
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base r0 = r2.newChaCha20Instance(r3, r0)
            r2.macKeyChaCha20 = r0
            return
        L1a:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use ChaCha20Poly1305 in FIPS-mode."
            r0.<init>(r1)
            throw r0
    }

    private byte[] getMacKey(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base r0 = r2.macKeyChaCha20
            r1 = 0
            java.nio.ByteBuffer r0 = r0.chacha20Block(r3, r1)
            r1 = 32
            byte[] r1 = new byte[r1]
            r0.get(r1)
            return r1
    }

    private static byte[] macDataRfc8439(byte[] r6, java.nio.ByteBuffer r7) {
            int r0 = r6.length
            int r0 = r0 % 16
            if (r0 != 0) goto L7
            int r0 = r6.length
            goto Le
        L7:
            int r0 = r6.length
            int r0 = r0 + 16
            int r1 = r6.length
            int r1 = r1 % 16
            int r0 = r0 - r1
        Le:
            int r1 = r7.remaining()
            int r2 = r1 % 16
            if (r2 != 0) goto L18
            r2 = r1
            goto L1d
        L18:
            int r2 = r1 + 16
            int r3 = r1 % 16
            int r2 = r2 - r3
        L1d:
            int r3 = r0 + r2
            int r3 = r3 + 16
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r3 = r3.order(r4)
            r3.put(r6)
            r3.position(r0)
            r3.put(r7)
            int r4 = r0 + r2
            r3.position(r4)
            int r4 = r6.length
            long r4 = (long) r4
            r3.putLong(r4)
            long r4 = (long) r1
            r3.putLong(r4)
            byte[] r4 = r3.array()
            return r4
    }

    public byte[] decrypt(java.nio.ByteBuffer r7, byte[] r8, byte[] r9) throws java.security.GeneralSecurityException {
            r6 = this;
            int r0 = r7.remaining()
            r1 = 16
            if (r0 < r1) goto L4b
            int r0 = r7.position()
            byte[] r2 = new byte[r1]
            int r3 = r7.limit()
            int r3 = r3 - r1
            r7.position(r3)
            r7.get(r2)
            r7.position(r0)
            int r3 = r7.limit()
            int r3 = r3 - r1
            r7.limit(r3)
            r1 = r9
            if (r1 != 0) goto L2a
            r3 = 0
            byte[] r1 = new byte[r3]
        L2a:
            byte[] r3 = r6.getMacKey(r8)     // Catch: java.security.GeneralSecurityException -> L40
            byte[] r4 = macDataRfc8439(r1, r7)     // Catch: java.security.GeneralSecurityException -> L40
            com.google.crypto.tink.aead.internal.Poly1305.verifyMac(r3, r4, r2)     // Catch: java.security.GeneralSecurityException -> L40
            r7.position(r0)
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base r3 = r6.chacha20
            byte[] r3 = r3.decrypt(r8, r7)
            return r3
        L40:
            r3 = move-exception
            javax.crypto.AEADBadTagException r4 = new javax.crypto.AEADBadTagException
            java.lang.String r5 = r3.toString()
            r4.<init>(r5)
            throw r4
        L4b:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "ciphertext too short"
            r0.<init>(r1)
            throw r0
    }

    public byte[] decrypt(byte[] r2, byte[] r3, byte[] r4) throws java.security.GeneralSecurityException {
            r1 = this;
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r3)
            byte[] r0 = r1.decrypt(r0, r2, r4)
            return r0
    }

    public void encrypt(java.nio.ByteBuffer r5, byte[] r6, byte[] r7, byte[] r8) throws java.security.GeneralSecurityException {
            r4 = this;
            int r0 = r5.remaining()
            int r1 = r7.length
            int r1 = r1 + 16
            if (r0 < r1) goto L3d
            int r0 = r5.position()
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base r1 = r4.chacha20
            r1.encrypt(r5, r6, r7)
            r5.position(r0)
            int r1 = r5.limit()
            int r1 = r1 + (-16)
            r5.limit(r1)
            r1 = r8
            if (r1 != 0) goto L24
            r2 = 0
            byte[] r1 = new byte[r2]
        L24:
            byte[] r2 = r4.getMacKey(r6)
            byte[] r3 = macDataRfc8439(r1, r5)
            byte[] r2 = com.google.crypto.tink.aead.internal.Poly1305.computeMac(r2, r3)
            int r3 = r5.limit()
            int r3 = r3 + 16
            r5.limit(r3)
            r5.put(r2)
            return
        L3d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Given ByteBuffer output is too small"
            r0.<init>(r1)
            throw r0
    }

    public byte[] encrypt(byte[] r3, byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r4.length
            r1 = 2147483631(0x7fffffef, float:NaN)
            if (r0 > r1) goto L15
            int r0 = r4.length
            int r0 = r0 + 16
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r2.encrypt(r0, r3, r4, r5)
            byte[] r1 = r0.array()
            return r1
        L15:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "plaintext too long"
            r0.<init>(r1)
            throw r0
    }

    abstract com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base newChaCha20Instance(byte[] r1, int r2) throws java.security.InvalidKeyException;
}
