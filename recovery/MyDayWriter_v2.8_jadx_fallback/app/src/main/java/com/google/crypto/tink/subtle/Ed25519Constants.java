package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
final class Ed25519Constants {
    static final com.google.crypto.tink.subtle.Ed25519.CachedXYT[] B2 = null;
    static final com.google.crypto.tink.subtle.Ed25519.CachedXYT[][] B_TABLE = null;
    static final long[] D = null;
    static final long[] D2 = null;
    private static final java.math.BigInteger D2_BI = null;
    private static final java.math.BigInteger D_BI = null;
    private static final java.math.BigInteger P_BI = null;
    static final long[] SQRTM1 = null;
    private static final java.math.BigInteger SQRTM1_BI = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.subtle.Ed25519Constants$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class Point {
        private java.math.BigInteger x;
        private java.math.BigInteger y;

        private Point() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Point(com.google.crypto.tink.subtle.Ed25519Constants.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.math.BigInteger access$100(com.google.crypto.tink.subtle.Ed25519Constants.Point r1) {
                java.math.BigInteger r0 = r1.y
                return r0
        }

        static /* synthetic */ java.math.BigInteger access$102(com.google.crypto.tink.subtle.Ed25519Constants.Point r0, java.math.BigInteger r1) {
                r0.y = r1
                return r1
        }

        static /* synthetic */ java.math.BigInteger access$200(com.google.crypto.tink.subtle.Ed25519Constants.Point r1) {
                java.math.BigInteger r0 = r1.x
                return r0
        }

        static /* synthetic */ java.math.BigInteger access$202(com.google.crypto.tink.subtle.Ed25519Constants.Point r0, java.math.BigInteger r1) {
                r0.x = r1
                return r1
        }
    }

    static {
            r0 = 2
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r0)
            r3 = 255(0xff, float:3.57E-43)
            java.math.BigInteger r2 = r2.pow(r3)
            r3 = 19
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r3)
            java.math.BigInteger r2 = r2.subtract(r3)
            com.google.crypto.tink.subtle.Ed25519Constants.P_BI = r2
            r2 = -121665(0xfffffffffffe24bf, double:NaN)
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
            r3 = 121666(0x1db42, double:6.0111E-319)
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r3)
            java.math.BigInteger r4 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r3 = r3.modInverse(r4)
            java.math.BigInteger r2 = r2.multiply(r3)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r2 = r2.mod(r3)
            com.google.crypto.tink.subtle.Ed25519Constants.D_BI = r2
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r0)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.D_BI
            java.math.BigInteger r2 = r2.multiply(r3)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r2 = r2.mod(r3)
            com.google.crypto.tink.subtle.Ed25519Constants.D2_BI = r2
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.math.BigInteger r1 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r2 = java.math.BigInteger.ONE
            java.math.BigInteger r1 = r1.subtract(r2)
            r2 = 4
            java.math.BigInteger r4 = java.math.BigInteger.valueOf(r2)
            java.math.BigInteger r1 = r1.divide(r4)
            java.math.BigInteger r4 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r0 = r0.modPow(r1, r4)
            com.google.crypto.tink.subtle.Ed25519Constants.SQRTM1_BI = r0
            com.google.crypto.tink.subtle.Ed25519Constants$Point r0 = new com.google.crypto.tink.subtle.Ed25519Constants$Point
            r1 = 0
            r0.<init>(r1)
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r2)
            r2 = 5
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r2 = r2.modInverse(r3)
            java.math.BigInteger r1 = r1.multiply(r2)
            java.math.BigInteger r2 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r1 = r1.mod(r2)
            com.google.crypto.tink.subtle.Ed25519Constants.Point.access$102(r0, r1)
            java.math.BigInteger r1 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r0)
            java.math.BigInteger r1 = recoverX(r1)
            com.google.crypto.tink.subtle.Ed25519Constants.Point.access$202(r0, r1)
            java.math.BigInteger r1 = com.google.crypto.tink.subtle.Ed25519Constants.D_BI
            byte[] r1 = toLittleEndian(r1)
            long[] r1 = com.google.crypto.tink.subtle.Field25519.expand(r1)
            com.google.crypto.tink.subtle.Ed25519Constants.D = r1
            java.math.BigInteger r1 = com.google.crypto.tink.subtle.Ed25519Constants.D2_BI
            byte[] r1 = toLittleEndian(r1)
            long[] r1 = com.google.crypto.tink.subtle.Field25519.expand(r1)
            com.google.crypto.tink.subtle.Ed25519Constants.D2 = r1
            java.math.BigInteger r1 = com.google.crypto.tink.subtle.Ed25519Constants.SQRTM1_BI
            byte[] r1 = toLittleEndian(r1)
            long[] r1 = com.google.crypto.tink.subtle.Field25519.expand(r1)
            com.google.crypto.tink.subtle.Ed25519Constants.SQRTM1 = r1
            r1 = r0
            r2 = 2
            int[] r2 = new int[r2]
            r3 = 1
            r4 = 8
            r2[r3] = r4
            r3 = 0
            r5 = 32
            r2[r3] = r5
            java.lang.Class<com.google.crypto.tink.subtle.Ed25519$CachedXYT> r3 = com.google.crypto.tink.subtle.Ed25519.CachedXYT.class
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r3, r2)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r2 = (com.google.crypto.tink.subtle.Ed25519.CachedXYT[][]) r2
            com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE = r2
            r2 = 0
        Ld6:
            if (r2 >= r5) goto Lfa
            r3 = r1
            r6 = 0
        Lda:
            if (r6 >= r4) goto Led
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r7 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r7 = r7[r2]
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r8 = getCachedXYT(r3)
            r7[r6] = r8
            com.google.crypto.tink.subtle.Ed25519Constants$Point r3 = edwards(r3, r1)
            int r6 = r6 + 1
            goto Lda
        Led:
            r6 = 0
        Lee:
            if (r6 >= r4) goto Lf7
            com.google.crypto.tink.subtle.Ed25519Constants$Point r1 = edwards(r1, r1)
            int r6 = r6 + 1
            goto Lee
        Lf7:
            int r2 = r2 + 1
            goto Ld6
        Lfa:
            r1 = r0
            com.google.crypto.tink.subtle.Ed25519Constants$Point r2 = edwards(r0, r0)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[] r3 = new com.google.crypto.tink.subtle.Ed25519.CachedXYT[r4]
            com.google.crypto.tink.subtle.Ed25519Constants.B2 = r3
            r3 = 0
        L104:
            if (r3 >= r4) goto L115
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[] r5 = com.google.crypto.tink.subtle.Ed25519Constants.B2
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r6 = getCachedXYT(r1)
            r5[r3] = r6
            com.google.crypto.tink.subtle.Ed25519Constants$Point r1 = edwards(r1, r2)
            int r3 = r3 + 1
            goto L104
        L115:
            return
    }

    private Ed25519Constants() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.crypto.tink.subtle.Ed25519Constants.Point edwards(com.google.crypto.tink.subtle.Ed25519Constants.Point r5, com.google.crypto.tink.subtle.Ed25519Constants.Point r6) {
            com.google.crypto.tink.subtle.Ed25519Constants$Point r0 = new com.google.crypto.tink.subtle.Ed25519Constants$Point
            r1 = 0
            r0.<init>(r1)
            java.math.BigInteger r1 = com.google.crypto.tink.subtle.Ed25519Constants.D_BI
            java.math.BigInteger r2 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r5)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r6)
            java.math.BigInteger r2 = r2.multiply(r3)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r5)
            java.math.BigInteger r2 = r2.multiply(r3)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r6)
            java.math.BigInteger r2 = r2.multiply(r3)
            java.math.BigInteger r1 = r1.multiply(r2)
            java.math.BigInteger r2 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r1 = r1.mod(r2)
            java.math.BigInteger r2 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r5)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r6)
            java.math.BigInteger r2 = r2.multiply(r3)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r6)
            java.math.BigInteger r4 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r5)
            java.math.BigInteger r3 = r3.multiply(r4)
            java.math.BigInteger r2 = r2.add(r3)
            java.math.BigInteger r3 = java.math.BigInteger.ONE
            java.math.BigInteger r3 = r3.add(r1)
            java.math.BigInteger r4 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r3 = r3.modInverse(r4)
            java.math.BigInteger r2 = r2.multiply(r3)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r2 = r2.mod(r3)
            com.google.crypto.tink.subtle.Ed25519Constants.Point.access$202(r0, r2)
            java.math.BigInteger r2 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r5)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r6)
            java.math.BigInteger r2 = r2.multiply(r3)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r5)
            java.math.BigInteger r4 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r6)
            java.math.BigInteger r3 = r3.multiply(r4)
            java.math.BigInteger r2 = r2.add(r3)
            java.math.BigInteger r3 = java.math.BigInteger.ONE
            java.math.BigInteger r3 = r3.subtract(r1)
            java.math.BigInteger r4 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r3 = r3.modInverse(r4)
            java.math.BigInteger r2 = r2.multiply(r3)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r2 = r2.mod(r3)
            com.google.crypto.tink.subtle.Ed25519Constants.Point.access$102(r0, r2)
            return r0
    }

    private static com.google.crypto.tink.subtle.Ed25519.CachedXYT getCachedXYT(com.google.crypto.tink.subtle.Ed25519Constants.Point r5) {
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r0 = new com.google.crypto.tink.subtle.Ed25519$CachedXYT
            java.math.BigInteger r1 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r5)
            java.math.BigInteger r2 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r5)
            java.math.BigInteger r1 = r1.add(r2)
            java.math.BigInteger r2 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r1 = r1.mod(r2)
            byte[] r1 = toLittleEndian(r1)
            long[] r1 = com.google.crypto.tink.subtle.Field25519.expand(r1)
            java.math.BigInteger r2 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r5)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r5)
            java.math.BigInteger r2 = r2.subtract(r3)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r2 = r2.mod(r3)
            byte[] r2 = toLittleEndian(r2)
            long[] r2 = com.google.crypto.tink.subtle.Field25519.expand(r2)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.D2_BI
            java.math.BigInteger r4 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r5)
            java.math.BigInteger r3 = r3.multiply(r4)
            java.math.BigInteger r4 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r5)
            java.math.BigInteger r3 = r3.multiply(r4)
            java.math.BigInteger r4 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r3 = r3.mod(r4)
            byte[] r3 = toLittleEndian(r3)
            long[] r3 = com.google.crypto.tink.subtle.Field25519.expand(r3)
            r0.<init>(r1, r2, r3)
            return r0
    }

    private static java.math.BigInteger recoverX(java.math.BigInteger r5) {
            r0 = 2
            java.math.BigInteger r1 = r5.pow(r0)
            java.math.BigInteger r2 = java.math.BigInteger.ONE
            java.math.BigInteger r1 = r1.subtract(r2)
            java.math.BigInteger r2 = com.google.crypto.tink.subtle.Ed25519Constants.D_BI
            java.math.BigInteger r3 = r5.pow(r0)
            java.math.BigInteger r2 = r2.multiply(r3)
            java.math.BigInteger r3 = java.math.BigInteger.ONE
            java.math.BigInteger r2 = r2.add(r3)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r2 = r2.modInverse(r3)
            java.math.BigInteger r1 = r1.multiply(r2)
            java.math.BigInteger r2 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            r3 = 3
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r3)
            java.math.BigInteger r2 = r2.add(r3)
            r3 = 8
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r3)
            java.math.BigInteger r2 = r2.divide(r3)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r2 = r1.modPow(r2, r3)
            java.math.BigInteger r0 = r2.pow(r0)
            java.math.BigInteger r0 = r0.subtract(r1)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r0 = r0.mod(r3)
            java.math.BigInteger r3 = java.math.BigInteger.ZERO
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L64
            java.math.BigInteger r0 = com.google.crypto.tink.subtle.Ed25519Constants.SQRTM1_BI
            java.math.BigInteger r0 = r2.multiply(r0)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r2 = r0.mod(r3)
        L64:
            r0 = 0
            boolean r0 = r2.testBit(r0)
            if (r0 == 0) goto L71
            java.math.BigInteger r0 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r2 = r0.subtract(r2)
        L71:
            return r2
    }

    private static byte[] toLittleEndian(java.math.BigInteger r5) {
            r0 = 32
            byte[] r1 = new byte[r0]
            byte[] r2 = r5.toByteArray()
            int r3 = r2.length
            int r0 = r0 - r3
            int r3 = r2.length
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r1, r0, r3)
            r0 = 0
        L10:
            int r3 = r1.length
            int r3 = r3 / 2
            if (r0 >= r3) goto L28
            r3 = r1[r0]
            int r4 = r1.length
            int r4 = r4 - r0
            int r4 = r4 + (-1)
            r4 = r1[r4]
            r1[r0] = r4
            int r4 = r1.length
            int r4 = r4 - r0
            int r4 = r4 + (-1)
            r1[r4] = r3
            int r0 = r0 + 1
            goto L10
        L28:
            return r1
    }
}
