package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class X25519 {
    private X25519() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] computeSharedSecret(byte[] r4, byte[] r5) throws java.security.InvalidKeyException {
            int r0 = r4.length
            r1 = 32
            if (r0 != r1) goto L2d
            r0 = 11
            long[] r0 = new long[r0]
            byte[] r1 = java.util.Arrays.copyOf(r4, r1)
            r2 = 0
            r3 = r1[r2]
            r3 = r3 & 248(0xf8, float:3.48E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            r2 = 31
            r3 = r1[r2]
            r3 = r3 & 127(0x7f, float:1.78E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            r3 = r1[r2]
            r3 = r3 | 64
            byte r3 = (byte) r3
            r1[r2] = r3
            com.google.crypto.tink.subtle.Curve25519.curveMult(r0, r1, r5)
            byte[] r2 = com.google.crypto.tink.subtle.Field25519.contract(r0)
            return r2
        L2d:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            java.lang.String r1 = "Private key must have 32 bytes."
            r0.<init>(r1)
            throw r0
    }

    public static byte[] generatePrivateKey() {
            r0 = 32
            byte[] r0 = com.google.crypto.tink.subtle.Random.randBytes(r0)
            r1 = 0
            r2 = r0[r1]
            r2 = r2 | 7
            byte r2 = (byte) r2
            r0[r1] = r2
            r1 = 31
            r2 = r0[r1]
            r2 = r2 & 63
            byte r2 = (byte) r2
            r0[r1] = r2
            r2 = r0[r1]
            r2 = r2 | 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2
            r0[r1] = r2
            return r0
    }

    public static byte[] publicFromPrivate(byte[] r3) throws java.security.InvalidKeyException {
            int r0 = r3.length
            r1 = 32
            if (r0 != r1) goto L11
            byte[] r0 = new byte[r1]
            r1 = 0
            r2 = 9
            r0[r1] = r2
            byte[] r1 = computeSharedSecret(r3, r0)
            return r1
        L11:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            java.lang.String r1 = "Private key must have 32 bytes."
            r0.<init>(r1)
            throw r0
    }
}
