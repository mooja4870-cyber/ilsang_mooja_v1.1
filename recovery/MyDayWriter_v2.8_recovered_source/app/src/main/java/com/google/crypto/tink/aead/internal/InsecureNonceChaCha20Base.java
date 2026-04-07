package com.google.crypto.tink.aead.internal;

/* JADX INFO: loaded from: classes.dex */
abstract class InsecureNonceChaCha20Base {
    private final int initialCounter;
    int[] key;

    public InsecureNonceChaCha20Base(byte[] r3, int r4) throws java.security.InvalidKeyException {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            r1 = 32
            if (r0 != r1) goto L11
            int[] r0 = com.google.crypto.tink.aead.internal.ChaCha20Util.toIntArray(r3)
            r2.key = r0
            r2.initialCounter = r4
            return
        L11:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            java.lang.String r1 = "The key length in bytes must be 32."
            r0.<init>(r1)
            throw r0
    }

    private void process(byte[] r6, java.nio.ByteBuffer r7, java.nio.ByteBuffer r8) throws java.security.GeneralSecurityException {
            r5 = this;
            int r0 = r6.length
            int r1 = r5.nonceSizeInBytes()
            if (r0 != r1) goto L2c
            int r0 = r8.remaining()
            int r1 = r0 / 64
            int r1 = r1 + 1
            r2 = 0
        L10:
            if (r2 >= r1) goto L2b
            int r3 = r5.initialCounter
            int r3 = r3 + r2
            java.nio.ByteBuffer r3 = r5.chacha20Block(r6, r3)
            int r4 = r1 + (-1)
            if (r2 != r4) goto L23
            int r4 = r0 % 64
            com.google.crypto.tink.subtle.Bytes.xor(r7, r8, r3, r4)
            goto L28
        L23:
            r4 = 64
            com.google.crypto.tink.subtle.Bytes.xor(r7, r8, r3, r4)
        L28:
            int r2 = r2 + 1
            goto L10
        L2b:
            return
        L2c:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The nonce length (in bytes) must be "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r5.nonceSizeInBytes()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    java.nio.ByteBuffer chacha20Block(byte[] r7, int r8) {
            r6 = this;
            int[] r0 = com.google.crypto.tink.aead.internal.ChaCha20Util.toIntArray(r7)
            int[] r0 = r6.createInitialState(r0, r8)
            java.lang.Object r1 = r0.clone()
            int[] r1 = (int[]) r1
            com.google.crypto.tink.aead.internal.ChaCha20Util.shuffleState(r1)
            r2 = 0
        L12:
            int r3 = r0.length
            if (r2 >= r3) goto L1f
            r3 = r0[r2]
            r4 = r1[r2]
            int r3 = r3 + r4
            r0[r2] = r3
            int r2 = r2 + 1
            goto L12
        L1f:
            r2 = 64
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            java.nio.IntBuffer r3 = r2.asIntBuffer()
            r4 = 0
            r5 = 16
            r3.put(r0, r4, r5)
            return r2
    }

    abstract int[] createInitialState(int[] r1, int r2);

    public byte[] decrypt(byte[] r3, java.nio.ByteBuffer r4) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r4.remaining()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r2.process(r3, r0, r4)
            byte[] r1 = r0.array()
            return r1
    }

    public byte[] decrypt(byte[] r2, byte[] r3) throws java.security.GeneralSecurityException {
            r1 = this;
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r3)
            byte[] r0 = r1.decrypt(r2, r0)
            return r0
    }

    public void encrypt(java.nio.ByteBuffer r3, byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.remaining()
            int r1 = r5.length
            if (r0 < r1) goto Lf
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r5)
            r2.process(r4, r3, r0)
            return
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Given ByteBuffer output is too small"
            r0.<init>(r1)
            throw r0
    }

    public byte[] encrypt(byte[] r3, byte[] r4) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r4.length
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r2.encrypt(r0, r3, r4)
            byte[] r1 = r0.array()
            return r1
    }

    abstract int nonceSizeInBytes();
}
