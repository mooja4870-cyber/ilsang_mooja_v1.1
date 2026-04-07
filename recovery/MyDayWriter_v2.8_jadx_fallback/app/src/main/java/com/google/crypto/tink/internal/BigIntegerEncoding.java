package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes.dex */
public final class BigIntegerEncoding {
    private BigIntegerEncoding() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.math.BigInteger fromUnsignedBigEndianBytes(byte[] r2) {
            java.math.BigInteger r0 = new java.math.BigInteger
            r1 = 1
            r0.<init>(r1, r2)
            return r0
    }

    public static byte[] toBigEndianBytes(java.math.BigInteger r2) {
            int r0 = r2.signum()
            r1 = -1
            if (r0 == r1) goto Lc
            byte[] r0 = r2.toByteArray()
            return r0
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "n must not be negative"
            r0.<init>(r1)
            throw r0
    }

    public static byte[] toBigEndianBytesOfFixedLength(java.math.BigInteger r5, int r6) throws java.security.GeneralSecurityException {
            int r0 = r5.signum()
            r1 = -1
            if (r0 == r1) goto L3d
            byte[] r0 = r5.toByteArray()
            int r1 = r0.length
            if (r1 != r6) goto Lf
            return r0
        Lf:
            int r1 = r0.length
            int r2 = r6 + 1
            java.lang.String r3 = "integer too large"
            if (r1 > r2) goto L37
            int r1 = r0.length
            int r2 = r6 + 1
            r4 = 0
            if (r1 != r2) goto L2d
            r1 = r0[r4]
            if (r1 != 0) goto L27
            int r1 = r0.length
            r2 = 1
            byte[] r1 = java.util.Arrays.copyOfRange(r0, r2, r1)
            return r1
        L27:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            r1.<init>(r3)
            throw r1
        L2d:
            byte[] r1 = new byte[r6]
            int r2 = r0.length
            int r2 = r6 - r2
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r4, r1, r2, r3)
            return r1
        L37:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            r1.<init>(r3)
            throw r1
        L3d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "integer must be nonnegative"
            r0.<init>(r1)
            throw r0
    }
}
