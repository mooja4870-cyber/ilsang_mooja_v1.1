package com.google.crypto.tink.hybrid.subtle;

/* JADX INFO: loaded from: classes.dex */
class RsaKem {
    static final byte[] EMPTY_AAD = null;
    static final int MIN_RSA_KEY_LENGTH_BITS = 2048;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.hybrid.subtle.RsaKem.EMPTY_AAD = r0
            return
    }

    private RsaKem() {
            r0 = this;
            r0.<init>()
            return
    }

    static int bigIntSizeInBytes(java.math.BigInteger r1) {
            int r0 = r1.bitLength()
            int r0 = r0 + 7
            int r0 = r0 / 8
            return r0
    }

    static byte[] bigIntToByteArray(java.math.BigInteger r6, int r7) {
            byte[] r0 = r6.toByteArray()
            int r1 = r0.length
            if (r1 != r7) goto L8
            return r0
        L8:
            byte[] r1 = new byte[r7]
            int r2 = r0.length
            int r3 = r1.length
            r4 = 1
            int r3 = r3 + r4
            r5 = 0
            if (r2 != r3) goto L22
            r2 = r0[r5]
            if (r2 != 0) goto L1a
            int r2 = r1.length
            java.lang.System.arraycopy(r0, r4, r1, r5, r2)
            goto L2d
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Value is one-byte longer than the expected size, but its first byte is not 0"
            r2.<init>(r3)
            throw r2
        L22:
            int r2 = r0.length
            int r3 = r1.length
            if (r2 >= r3) goto L2e
            int r2 = r1.length
            int r3 = r0.length
            int r2 = r2 - r3
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r5, r1, r2, r3)
        L2d:
            return r1
        L2e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            int r4 = r0.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            java.lang.String r4 = "Value has invalid length, must be of length at most (%d + 1), but got %d"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.<init>(r3)
            throw r2
    }

    static java.security.KeyPair generateRsaKeyPair(int r3) {
            java.lang.String r0 = "RSA"
            java.security.KeyPairGenerator r0 = java.security.KeyPairGenerator.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> Lf
            r0.initialize(r3)     // Catch: java.security.NoSuchAlgorithmException -> Lf
            java.security.KeyPair r1 = r0.generateKeyPair()
            return r1
        Lf:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No support for RSA algorithm."
            r1.<init>(r2, r0)
            throw r1
    }

    static byte[] generateSecret(java.math.BigInteger r4) {
            int r0 = bigIntSizeInBytes(r4)
            java.security.SecureRandom r1 = new java.security.SecureRandom
            r1.<init>()
        L9:
            java.math.BigInteger r2 = new java.math.BigInteger
            int r3 = r4.bitLength()
            r2.<init>(r3, r1)
            int r3 = r2.signum()
            if (r3 <= 0) goto L9
            int r3 = r2.compareTo(r4)
            if (r3 >= 0) goto L9
            byte[] r3 = bigIntToByteArray(r2, r0)
            return r3
    }

    static void validateRsaModulus(java.math.BigInteger r3) throws java.security.GeneralSecurityException {
            int r0 = r3.bitLength()
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 < r1) goto L9
            return
        L9:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r3.bitLength()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "RSA key must be of at least size %d bits, but got %d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }
}
