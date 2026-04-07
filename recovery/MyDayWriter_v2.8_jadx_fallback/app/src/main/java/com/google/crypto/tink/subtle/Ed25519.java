package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
final class Ed25519 {
    private static final com.google.crypto.tink.subtle.Ed25519.CachedXYT CACHED_NEUTRAL = null;
    static final byte[] GROUP_ORDER = null;
    private static final com.google.crypto.tink.subtle.Ed25519.PartialXYZT NEUTRAL = null;
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SECRET_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;

    static class CachedXYT {
        final long[] t2d;
        final long[] yMinusX;
        final long[] yPlusX;

        CachedXYT() {
                r3 = this;
                r0 = 10
                long[] r1 = new long[r0]
                long[] r2 = new long[r0]
                long[] r0 = new long[r0]
                r3.<init>(r1, r2, r0)
                return
        }

        CachedXYT(com.google.crypto.tink.subtle.Ed25519.CachedXYT r3) {
                r2 = this;
                r2.<init>()
                long[] r0 = r3.yPlusX
                r1 = 10
                long[] r0 = java.util.Arrays.copyOf(r0, r1)
                r2.yPlusX = r0
                long[] r0 = r3.yMinusX
                long[] r0 = java.util.Arrays.copyOf(r0, r1)
                r2.yMinusX = r0
                long[] r0 = r3.t2d
                long[] r0 = java.util.Arrays.copyOf(r0, r1)
                r2.t2d = r0
                return
        }

        CachedXYT(long[] r1, long[] r2, long[] r3) {
                r0 = this;
                r0.<init>()
                r0.yPlusX = r1
                r0.yMinusX = r2
                r0.t2d = r3
                return
        }

        void copyConditional(com.google.crypto.tink.subtle.Ed25519.CachedXYT r3, int r4) {
                r2 = this;
                long[] r0 = r2.yPlusX
                long[] r1 = r3.yPlusX
                com.google.crypto.tink.subtle.Curve25519.copyConditional(r0, r1, r4)
                long[] r0 = r2.yMinusX
                long[] r1 = r3.yMinusX
                com.google.crypto.tink.subtle.Curve25519.copyConditional(r0, r1, r4)
                long[] r0 = r2.t2d
                long[] r1 = r3.t2d
                com.google.crypto.tink.subtle.Curve25519.copyConditional(r0, r1, r4)
                return
        }

        void multByZ(long[] r3, long[] r4) {
                r2 = this;
                r0 = 0
                r1 = 10
                java.lang.System.arraycopy(r4, r0, r3, r0, r1)
                return
        }
    }

    private static class CachedXYZT extends com.google.crypto.tink.subtle.Ed25519.CachedXYT {
        private final long[] z;

        CachedXYZT() {
                r4 = this;
                r0 = 10
                long[] r1 = new long[r0]
                long[] r2 = new long[r0]
                long[] r3 = new long[r0]
                long[] r0 = new long[r0]
                r4.<init>(r1, r2, r3, r0)
                return
        }

        CachedXYZT(com.google.crypto.tink.subtle.Ed25519.XYZT r5) {
                r4 = this;
                r4.<init>()
                long[] r0 = r4.yPlusX
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r5.xyz
                long[] r1 = r1.y
                com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r5.xyz
                long[] r2 = r2.x
                com.google.crypto.tink.subtle.Field25519.sum(r0, r1, r2)
                long[] r0 = r4.yMinusX
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r5.xyz
                long[] r1 = r1.y
                com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r5.xyz
                long[] r2 = r2.x
                com.google.crypto.tink.subtle.Field25519.sub(r0, r1, r2)
                com.google.crypto.tink.subtle.Ed25519$XYZ r0 = r5.xyz
                long[] r0 = r0.z
                long[] r1 = r4.z
                r2 = 10
                r3 = 0
                java.lang.System.arraycopy(r0, r3, r1, r3, r2)
                long[] r0 = r4.t2d
                long[] r1 = r5.t
                long[] r2 = com.google.crypto.tink.subtle.Ed25519Constants.D2
                com.google.crypto.tink.subtle.Field25519.mult(r0, r1, r2)
                return
        }

        CachedXYZT(long[] r1, long[] r2, long[] r3, long[] r4) {
                r0 = this;
                r0.<init>(r1, r2, r4)
                r0.z = r3
                return
        }

        @Override // com.google.crypto.tink.subtle.Ed25519.CachedXYT
        public void multByZ(long[] r2, long[] r3) {
                r1 = this;
                long[] r0 = r1.z
                com.google.crypto.tink.subtle.Field25519.mult(r2, r3, r0)
                return
        }
    }

    private static class PartialXYZT {
        final long[] t;
        final com.google.crypto.tink.subtle.Ed25519.XYZ xyz;

        PartialXYZT() {
                r2 = this;
                com.google.crypto.tink.subtle.Ed25519$XYZ r0 = new com.google.crypto.tink.subtle.Ed25519$XYZ
                r0.<init>()
                r1 = 10
                long[] r1 = new long[r1]
                r2.<init>(r0, r1)
                return
        }

        PartialXYZT(com.google.crypto.tink.subtle.Ed25519.PartialXYZT r3) {
                r2 = this;
                r2.<init>()
                com.google.crypto.tink.subtle.Ed25519$XYZ r0 = new com.google.crypto.tink.subtle.Ed25519$XYZ
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r3.xyz
                r0.<init>(r1)
                r2.xyz = r0
                long[] r0 = r3.t
                r1 = 10
                long[] r0 = java.util.Arrays.copyOf(r0, r1)
                r2.t = r0
                return
        }

        PartialXYZT(com.google.crypto.tink.subtle.Ed25519.XYZ r1, long[] r2) {
                r0 = this;
                r0.<init>()
                r0.xyz = r1
                r0.t = r2
                return
        }
    }

    private static class XYZ {
        final long[] x;
        final long[] y;
        final long[] z;

        XYZ() {
                r3 = this;
                r0 = 10
                long[] r1 = new long[r0]
                long[] r2 = new long[r0]
                long[] r0 = new long[r0]
                r3.<init>(r1, r2, r0)
                return
        }

        XYZ(com.google.crypto.tink.subtle.Ed25519.PartialXYZT r1) {
                r0 = this;
                r0.<init>()
                fromPartialXYZT(r0, r1)
                return
        }

        XYZ(com.google.crypto.tink.subtle.Ed25519.XYZ r3) {
                r2 = this;
                r2.<init>()
                long[] r0 = r3.x
                r1 = 10
                long[] r0 = java.util.Arrays.copyOf(r0, r1)
                r2.x = r0
                long[] r0 = r3.y
                long[] r0 = java.util.Arrays.copyOf(r0, r1)
                r2.y = r0
                long[] r0 = r3.z
                long[] r0 = java.util.Arrays.copyOf(r0, r1)
                r2.z = r0
                return
        }

        XYZ(long[] r1, long[] r2, long[] r3) {
                r0 = this;
                r0.<init>()
                r0.x = r1
                r0.y = r2
                r0.z = r3
                return
        }

        static com.google.crypto.tink.subtle.Ed25519.XYZ fromPartialXYZT(com.google.crypto.tink.subtle.Ed25519.XYZ r3, com.google.crypto.tink.subtle.Ed25519.PartialXYZT r4) {
                long[] r0 = r3.x
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
                long[] r1 = r1.x
                long[] r2 = r4.t
                com.google.crypto.tink.subtle.Field25519.mult(r0, r1, r2)
                long[] r0 = r3.y
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
                long[] r1 = r1.y
                com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
                long[] r2 = r2.z
                com.google.crypto.tink.subtle.Field25519.mult(r0, r1, r2)
                long[] r0 = r3.z
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
                long[] r1 = r1.z
                long[] r2 = r4.t
                com.google.crypto.tink.subtle.Field25519.mult(r0, r1, r2)
                return r3
        }

        boolean isOnCurve() {
                r8 = this;
                r0 = 10
                long[] r1 = new long[r0]
                long[] r2 = r8.x
                com.google.crypto.tink.subtle.Field25519.square(r1, r2)
                long[] r2 = new long[r0]
                long[] r3 = r8.y
                com.google.crypto.tink.subtle.Field25519.square(r2, r3)
                long[] r3 = new long[r0]
                long[] r4 = r8.z
                com.google.crypto.tink.subtle.Field25519.square(r3, r4)
                long[] r4 = new long[r0]
                com.google.crypto.tink.subtle.Field25519.square(r4, r3)
                long[] r5 = new long[r0]
                com.google.crypto.tink.subtle.Field25519.sub(r5, r2, r1)
                com.google.crypto.tink.subtle.Field25519.mult(r5, r5, r3)
                long[] r0 = new long[r0]
                com.google.crypto.tink.subtle.Field25519.mult(r0, r1, r2)
                long[] r6 = com.google.crypto.tink.subtle.Ed25519Constants.D
                com.google.crypto.tink.subtle.Field25519.mult(r0, r0, r6)
                com.google.crypto.tink.subtle.Field25519.sum(r0, r4)
                com.google.crypto.tink.subtle.Field25519.reduce(r0, r0)
                byte[] r6 = com.google.crypto.tink.subtle.Field25519.contract(r5)
                byte[] r7 = com.google.crypto.tink.subtle.Field25519.contract(r0)
                boolean r6 = com.google.crypto.tink.subtle.Bytes.equal(r6, r7)
                return r6
        }

        byte[] toBytes() {
                r7 = this;
                r0 = 10
                long[] r1 = new long[r0]
                long[] r2 = new long[r0]
                long[] r0 = new long[r0]
                long[] r3 = r7.z
                com.google.crypto.tink.subtle.Field25519.inverse(r1, r3)
                long[] r3 = r7.x
                com.google.crypto.tink.subtle.Field25519.mult(r2, r3, r1)
                long[] r3 = r7.y
                com.google.crypto.tink.subtle.Field25519.mult(r0, r3, r1)
                byte[] r3 = com.google.crypto.tink.subtle.Field25519.contract(r0)
                r4 = 31
                r5 = r3[r4]
                int r6 = com.google.crypto.tink.subtle.Ed25519.access$000(r2)
                int r6 = r6 << 7
                r5 = r5 ^ r6
                byte r5 = (byte) r5
                r3[r4] = r5
                return r3
        }
    }

    private static class XYZT {
        final long[] t;
        final com.google.crypto.tink.subtle.Ed25519.XYZ xyz;

        XYZT() {
                r2 = this;
                com.google.crypto.tink.subtle.Ed25519$XYZ r0 = new com.google.crypto.tink.subtle.Ed25519$XYZ
                r0.<init>()
                r1 = 10
                long[] r1 = new long[r1]
                r2.<init>(r0, r1)
                return
        }

        XYZT(com.google.crypto.tink.subtle.Ed25519.PartialXYZT r1) {
                r0 = this;
                r0.<init>()
                fromPartialXYZT(r0, r1)
                return
        }

        XYZT(com.google.crypto.tink.subtle.Ed25519.XYZ r1, long[] r2) {
                r0 = this;
                r0.<init>()
                r0.xyz = r1
                r0.t = r2
                return
        }

        static /* synthetic */ com.google.crypto.tink.subtle.Ed25519.XYZT access$400(com.google.crypto.tink.subtle.Ed25519.XYZT r1, com.google.crypto.tink.subtle.Ed25519.PartialXYZT r2) {
                com.google.crypto.tink.subtle.Ed25519$XYZT r0 = fromPartialXYZT(r1, r2)
                return r0
        }

        static /* synthetic */ com.google.crypto.tink.subtle.Ed25519.XYZT access$500(byte[] r1) throws java.security.GeneralSecurityException {
                com.google.crypto.tink.subtle.Ed25519$XYZT r0 = fromBytesNegateVarTime(r1)
                return r0
        }

        private static com.google.crypto.tink.subtle.Ed25519.XYZT fromBytesNegateVarTime(byte[] r11) throws java.security.GeneralSecurityException {
                r0 = 10
                long[] r1 = new long[r0]
                long[] r2 = com.google.crypto.tink.subtle.Field25519.expand(r11)
                long[] r3 = new long[r0]
                r4 = 0
                r5 = 1
                r3[r4] = r5
                long[] r4 = new long[r0]
                long[] r5 = new long[r0]
                long[] r6 = new long[r0]
                long[] r7 = new long[r0]
                long[] r8 = new long[r0]
                com.google.crypto.tink.subtle.Field25519.square(r5, r2)
                long[] r9 = com.google.crypto.tink.subtle.Ed25519Constants.D
                com.google.crypto.tink.subtle.Field25519.mult(r6, r5, r9)
                com.google.crypto.tink.subtle.Field25519.sub(r5, r5, r3)
                com.google.crypto.tink.subtle.Field25519.sum(r6, r6, r3)
                long[] r0 = new long[r0]
                com.google.crypto.tink.subtle.Field25519.square(r0, r6)
                com.google.crypto.tink.subtle.Field25519.mult(r0, r0, r6)
                com.google.crypto.tink.subtle.Field25519.square(r1, r0)
                com.google.crypto.tink.subtle.Field25519.mult(r1, r1, r6)
                com.google.crypto.tink.subtle.Field25519.mult(r1, r1, r5)
                com.google.crypto.tink.subtle.Ed25519.access$100(r1, r1)
                com.google.crypto.tink.subtle.Field25519.mult(r1, r1, r0)
                com.google.crypto.tink.subtle.Field25519.mult(r1, r1, r5)
                com.google.crypto.tink.subtle.Field25519.square(r7, r1)
                com.google.crypto.tink.subtle.Field25519.mult(r7, r7, r6)
                com.google.crypto.tink.subtle.Field25519.sub(r8, r7, r5)
                boolean r9 = com.google.crypto.tink.subtle.Ed25519.access$200(r8)
                if (r9 == 0) goto L67
                com.google.crypto.tink.subtle.Field25519.sum(r8, r7, r5)
                boolean r9 = com.google.crypto.tink.subtle.Ed25519.access$200(r8)
                if (r9 != 0) goto L5f
                long[] r9 = com.google.crypto.tink.subtle.Ed25519Constants.SQRTM1
                com.google.crypto.tink.subtle.Field25519.mult(r1, r1, r9)
                goto L67
            L5f:
                java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
                java.lang.String r10 = "Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19"
                r9.<init>(r10)
                throw r9
            L67:
                boolean r9 = com.google.crypto.tink.subtle.Ed25519.access$200(r1)
                r10 = 31
                if (r9 != 0) goto L80
                r9 = r11[r10]
                r9 = r9 & 255(0xff, float:3.57E-43)
                int r9 = r9 >> 7
                if (r9 != 0) goto L78
                goto L80
            L78:
                java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
                java.lang.String r10 = "Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero"
                r9.<init>(r10)
                throw r9
            L80:
                int r9 = com.google.crypto.tink.subtle.Ed25519.access$000(r1)
                r10 = r11[r10]
                r10 = r10 & 255(0xff, float:3.57E-43)
                int r10 = r10 >> 7
                if (r9 != r10) goto L8f
                com.google.crypto.tink.subtle.Ed25519.access$300(r1, r1)
            L8f:
                com.google.crypto.tink.subtle.Field25519.mult(r4, r1, r2)
                com.google.crypto.tink.subtle.Ed25519$XYZT r9 = new com.google.crypto.tink.subtle.Ed25519$XYZT
                com.google.crypto.tink.subtle.Ed25519$XYZ r10 = new com.google.crypto.tink.subtle.Ed25519$XYZ
                r10.<init>(r1, r2, r3)
                r9.<init>(r10, r4)
                return r9
        }

        private static com.google.crypto.tink.subtle.Ed25519.XYZT fromPartialXYZT(com.google.crypto.tink.subtle.Ed25519.XYZT r3, com.google.crypto.tink.subtle.Ed25519.PartialXYZT r4) {
                com.google.crypto.tink.subtle.Ed25519$XYZ r0 = r3.xyz
                long[] r0 = r0.x
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
                long[] r1 = r1.x
                long[] r2 = r4.t
                com.google.crypto.tink.subtle.Field25519.mult(r0, r1, r2)
                com.google.crypto.tink.subtle.Ed25519$XYZ r0 = r3.xyz
                long[] r0 = r0.y
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
                long[] r1 = r1.y
                com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
                long[] r2 = r2.z
                com.google.crypto.tink.subtle.Field25519.mult(r0, r1, r2)
                com.google.crypto.tink.subtle.Ed25519$XYZ r0 = r3.xyz
                long[] r0 = r0.z
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
                long[] r1 = r1.z
                long[] r2 = r4.t
                com.google.crypto.tink.subtle.Field25519.mult(r0, r1, r2)
                long[] r0 = r3.t
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
                long[] r1 = r1.x
                com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
                long[] r2 = r2.y
                com.google.crypto.tink.subtle.Field25519.mult(r0, r1, r2)
                return r3
        }
    }

    static {
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r0 = new com.google.crypto.tink.subtle.Ed25519$CachedXYT
            r1 = 10
            long[] r2 = new long[r1]
            r2 = {x0042: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            long[] r3 = new long[r1]
            r3 = {x006e: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            long[] r4 = new long[r1]
            r4 = {x009a: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            r0.<init>(r2, r3, r4)
            com.google.crypto.tink.subtle.Ed25519.CACHED_NEUTRAL = r0
            com.google.crypto.tink.subtle.Ed25519$PartialXYZT r0 = new com.google.crypto.tink.subtle.Ed25519$PartialXYZT
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = new com.google.crypto.tink.subtle.Ed25519$XYZ
            long[] r3 = new long[r1]
            r3 = {x00c6: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            long[] r4 = new long[r1]
            r4 = {x00f2: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            long[] r5 = new long[r1]
            r5 = {x011e: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            r2.<init>(r3, r4, r5)
            long[] r1 = new long[r1]
            r1 = {x014a: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            r0.<init>(r2, r1)
            com.google.crypto.tink.subtle.Ed25519.NEUTRAL = r0
            r0 = 32
            byte[] r0 = new byte[r0]
            r0 = {x0176: FILL_ARRAY_DATA , data: [-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16} // fill-array
            com.google.crypto.tink.subtle.Ed25519.GROUP_ORDER = r0
            return
    }

    private Ed25519() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ int access$000(long[] r1) {
            int r0 = getLsb(r1)
            return r0
    }

    static /* synthetic */ void access$100(long[] r0, long[] r1) {
            pow2252m3(r0, r1)
            return
    }

    static /* synthetic */ boolean access$200(long[] r1) {
            boolean r0 = isNonZeroVarTime(r1)
            return r0
    }

    static /* synthetic */ void access$300(long[] r0, long[] r1) {
            neg(r0, r1)
            return
    }

    private static void add(com.google.crypto.tink.subtle.Ed25519.PartialXYZT r4, com.google.crypto.tink.subtle.Ed25519.XYZT r5, com.google.crypto.tink.subtle.Ed25519.CachedXYT r6) {
            r0 = 10
            long[] r0 = new long[r0]
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r5.xyz
            long[] r2 = r2.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r3 = r5.xyz
            long[] r3 = r3.x
            com.google.crypto.tink.subtle.Field25519.sum(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r5.xyz
            long[] r2 = r2.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r3 = r5.xyz
            long[] r3 = r3.x
            com.google.crypto.tink.subtle.Field25519.sub(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.y
            long[] r3 = r6.yMinusX
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.x
            long[] r3 = r6.yPlusX
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r3)
            long[] r1 = r4.t
            long[] r2 = r5.t
            long[] r3 = r6.t2d
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r5.xyz
            long[] r2 = r2.z
            r6.multByZ(r1, r2)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.x
            com.google.crypto.tink.subtle.Field25519.sum(r0, r1, r2)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r3 = r4.xyz
            long[] r3 = r3.y
            com.google.crypto.tink.subtle.Field25519.sub(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r3 = r4.xyz
            long[] r3 = r3.y
            com.google.crypto.tink.subtle.Field25519.sum(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.z
            long[] r2 = r4.t
            com.google.crypto.tink.subtle.Field25519.sum(r1, r0, r2)
            long[] r1 = r4.t
            long[] r2 = r4.t
            com.google.crypto.tink.subtle.Field25519.sub(r1, r0, r2)
            return
    }

    private static com.google.crypto.tink.subtle.Ed25519.XYZ doubleScalarMultVarTime(byte[] r10, com.google.crypto.tink.subtle.Ed25519.XYZT r11, byte[] r12) {
            r0 = 8
            com.google.crypto.tink.subtle.Ed25519$CachedXYZT[] r0 = new com.google.crypto.tink.subtle.Ed25519.CachedXYZT[r0]
            com.google.crypto.tink.subtle.Ed25519$CachedXYZT r1 = new com.google.crypto.tink.subtle.Ed25519$CachedXYZT
            r1.<init>(r11)
            r2 = 0
            r0[r2] = r1
            com.google.crypto.tink.subtle.Ed25519$PartialXYZT r1 = new com.google.crypto.tink.subtle.Ed25519$PartialXYZT
            r1.<init>()
            doubleXYZT(r1, r11)
            com.google.crypto.tink.subtle.Ed25519$XYZT r2 = new com.google.crypto.tink.subtle.Ed25519$XYZT
            r2.<init>(r1)
            r3 = 1
        L1a:
            int r4 = r0.length
            if (r3 >= r4) goto L33
            int r4 = r3 + (-1)
            r4 = r0[r4]
            add(r1, r2, r4)
            com.google.crypto.tink.subtle.Ed25519$CachedXYZT r4 = new com.google.crypto.tink.subtle.Ed25519$CachedXYZT
            com.google.crypto.tink.subtle.Ed25519$XYZT r5 = new com.google.crypto.tink.subtle.Ed25519$XYZT
            r5.<init>(r1)
            r4.<init>(r5)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L1a
        L33:
            byte[] r3 = slide(r10)
            byte[] r4 = slide(r12)
            com.google.crypto.tink.subtle.Ed25519$PartialXYZT r5 = new com.google.crypto.tink.subtle.Ed25519$PartialXYZT
            com.google.crypto.tink.subtle.Ed25519$PartialXYZT r6 = com.google.crypto.tink.subtle.Ed25519.NEUTRAL
            r5.<init>(r6)
            com.google.crypto.tink.subtle.Ed25519$XYZT r1 = new com.google.crypto.tink.subtle.Ed25519$XYZT
            r1.<init>()
            r6 = 255(0xff, float:3.57E-43)
        L49:
            if (r6 < 0) goto L57
            r7 = r3[r6]
            if (r7 != 0) goto L57
            r7 = r4[r6]
            if (r7 == 0) goto L54
            goto L57
        L54:
            int r6 = r6 + (-1)
            goto L49
        L57:
            if (r6 < 0) goto Lb0
            com.google.crypto.tink.subtle.Ed25519$XYZ r7 = new com.google.crypto.tink.subtle.Ed25519$XYZ
            r7.<init>(r5)
            doubleXYZ(r5, r7)
            r7 = r3[r6]
            if (r7 <= 0) goto L73
            com.google.crypto.tink.subtle.Ed25519$XYZT r7 = com.google.crypto.tink.subtle.Ed25519.XYZT.access$400(r1, r5)
            r8 = r3[r6]
            int r8 = r8 / 2
            r8 = r0[r8]
            add(r5, r7, r8)
            goto L85
        L73:
            r7 = r3[r6]
            if (r7 >= 0) goto L85
            com.google.crypto.tink.subtle.Ed25519$XYZT r7 = com.google.crypto.tink.subtle.Ed25519.XYZT.access$400(r1, r5)
            r8 = r3[r6]
            int r8 = -r8
            int r8 = r8 / 2
            r8 = r0[r8]
            sub(r5, r7, r8)
        L85:
            r7 = r4[r6]
            if (r7 <= 0) goto L99
            com.google.crypto.tink.subtle.Ed25519$XYZT r7 = com.google.crypto.tink.subtle.Ed25519.XYZT.access$400(r1, r5)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[] r8 = com.google.crypto.tink.subtle.Ed25519Constants.B2
            r9 = r4[r6]
            int r9 = r9 / 2
            r8 = r8[r9]
            add(r5, r7, r8)
            goto Lad
        L99:
            r7 = r4[r6]
            if (r7 >= 0) goto Lad
            com.google.crypto.tink.subtle.Ed25519$XYZT r7 = com.google.crypto.tink.subtle.Ed25519.XYZT.access$400(r1, r5)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[] r8 = com.google.crypto.tink.subtle.Ed25519Constants.B2
            r9 = r4[r6]
            int r9 = -r9
            int r9 = r9 / 2
            r8 = r8[r9]
            sub(r5, r7, r8)
        Lad:
            int r6 = r6 + (-1)
            goto L57
        Lb0:
            com.google.crypto.tink.subtle.Ed25519$XYZ r7 = new com.google.crypto.tink.subtle.Ed25519$XYZ
            r7.<init>(r5)
            return r7
    }

    private static void doubleXYZ(com.google.crypto.tink.subtle.Ed25519.PartialXYZT r4, com.google.crypto.tink.subtle.Ed25519.XYZ r5) {
            r0 = 10
            long[] r0 = new long[r0]
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.x
            long[] r2 = r5.x
            com.google.crypto.tink.subtle.Field25519.square(r1, r2)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.z
            long[] r2 = r5.y
            com.google.crypto.tink.subtle.Field25519.square(r1, r2)
            long[] r1 = r4.t
            long[] r2 = r5.z
            com.google.crypto.tink.subtle.Field25519.square(r1, r2)
            long[] r1 = r4.t
            long[] r2 = r4.t
            long[] r3 = r4.t
            com.google.crypto.tink.subtle.Field25519.sum(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            long[] r2 = r5.x
            long[] r3 = r5.y
            com.google.crypto.tink.subtle.Field25519.sum(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            com.google.crypto.tink.subtle.Field25519.square(r0, r1)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r3 = r4.xyz
            long[] r3 = r3.x
            com.google.crypto.tink.subtle.Field25519.sum(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r3 = r4.xyz
            long[] r3 = r3.x
            com.google.crypto.tink.subtle.Field25519.sub(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.y
            com.google.crypto.tink.subtle.Field25519.sub(r1, r0, r2)
            long[] r1 = r4.t
            long[] r2 = r4.t
            com.google.crypto.tink.subtle.Ed25519$XYZ r3 = r4.xyz
            long[] r3 = r3.z
            com.google.crypto.tink.subtle.Field25519.sub(r1, r2, r3)
            return
    }

    private static void doubleXYZT(com.google.crypto.tink.subtle.Ed25519.PartialXYZT r1, com.google.crypto.tink.subtle.Ed25519.XYZT r2) {
            com.google.crypto.tink.subtle.Ed25519$XYZ r0 = r2.xyz
            doubleXYZ(r1, r0)
            return
    }

    private static int eq(int r2, int r3) {
            r0 = r2 ^ r3
            int r0 = ~r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 4
            r0 = r0 & r1
            int r1 = r0 << 2
            r0 = r0 & r1
            int r1 = r0 << 1
            r0 = r0 & r1
            int r1 = r0 >> 7
            r1 = r1 & 1
            return r1
    }

    static byte[] getHashedScalar(byte[] r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMessageDigest, java.security.MessageDigest> r0 = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST
            java.lang.String r1 = "SHA-512"
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.MessageDigest r0 = (java.security.MessageDigest) r0
            r1 = 32
            r2 = 0
            r0.update(r4, r2, r1)
            byte[] r1 = r0.digest()
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
            return r1
    }

    private static int getLsb(long[] r2) {
            byte[] r0 = com.google.crypto.tink.subtle.Field25519.contract(r2)
            r1 = 0
            r0 = r0[r1]
            r0 = r0 & 1
            return r0
    }

    private static boolean isNonZeroVarTime(long[] r7) {
            int r0 = r7.length
            r1 = 1
            int r0 = r0 + r1
            long[] r0 = new long[r0]
            int r2 = r7.length
            r3 = 0
            java.lang.System.arraycopy(r7, r3, r0, r3, r2)
            com.google.crypto.tink.subtle.Field25519.reduceCoefficients(r0)
            byte[] r2 = com.google.crypto.tink.subtle.Field25519.contract(r0)
            int r4 = r2.length
            r5 = r3
        L13:
            if (r5 >= r4) goto L1d
            r6 = r2[r5]
            if (r6 == 0) goto L1a
            return r1
        L1a:
            int r5 = r5 + 1
            goto L13
        L1d:
            return r3
    }

    private static boolean isSmallerThanGroupOrder(byte[] r4) {
            r0 = 31
        L2:
            r1 = 0
            if (r0 < 0) goto L18
            r2 = r4[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte[] r3 = com.google.crypto.tink.subtle.Ed25519.GROUP_ORDER
            r3 = r3[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r2 == r3) goto L15
            if (r2 >= r3) goto L14
            r1 = 1
        L14:
            return r1
        L15:
            int r0 = r0 + (-1)
            goto L2
        L18:
            return r1
    }

    private static long load3(byte[] r5, int r6) {
            r0 = r5[r6]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            int r2 = r6 + 1
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r4 = 8
            long r2 = r2 << r4
            long r0 = r0 | r2
            int r2 = r6 + 2
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r4 = 16
            long r2 = r2 << r4
            long r0 = r0 | r2
            return r0
    }

    private static long load4(byte[] r5, int r6) {
            long r0 = load3(r5, r6)
            int r2 = r6 + 3
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r4 = 24
            long r2 = r2 << r4
            long r0 = r0 | r2
            return r0
    }

    private static void mulAdd(byte[] r200, byte[] r201, byte[] r202, byte[] r203) {
            r0 = r201
            r1 = r202
            r2 = r203
            r3 = 0
            long r4 = load3(r0, r3)
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            r8 = 2
            long r9 = load4(r0, r8)
            r11 = 5
            long r9 = r9 >> r11
            long r9 = r9 & r6
            long r12 = load3(r0, r11)
            long r12 = r12 >> r8
            long r12 = r12 & r6
            r14 = 7
            long r15 = load4(r0, r14)
            long r15 = r15 >> r14
            long r15 = r15 & r6
            r17 = r6
            r6 = 10
            long r19 = load4(r0, r6)
            r7 = 4
            long r19 = r19 >> r7
            long r19 = r19 & r17
            r21 = r7
            r7 = 13
            long r22 = load3(r0, r7)
            r24 = 1
            long r22 = r22 >> r24
            long r22 = r22 & r17
            r7 = 15
            long r26 = load4(r0, r7)
            r28 = 6
            long r26 = r26 >> r28
            long r26 = r26 & r17
            r7 = 18
            long r30 = load3(r0, r7)
            r32 = 3
            long r30 = r30 >> r32
            long r30 = r30 & r17
            r7 = 21
            long r34 = load3(r0, r7)
            long r34 = r34 & r17
            r7 = 23
            long r37 = load4(r0, r7)
            long r37 = r37 >> r11
            long r37 = r37 & r17
            r7 = 26
            long r40 = load3(r0, r7)
            long r40 = r40 >> r8
            long r40 = r40 & r17
            r7 = 28
            long r42 = load4(r0, r7)
            long r42 = r42 >> r14
            long r44 = load3(r1, r3)
            long r44 = r44 & r17
            long r46 = load4(r1, r8)
            long r46 = r46 >> r11
            long r46 = r46 & r17
            long r48 = load3(r1, r11)
            long r48 = r48 >> r8
            long r48 = r48 & r17
            long r50 = load4(r1, r14)
            long r50 = r50 >> r14
            long r50 = r50 & r17
            long r52 = load4(r1, r6)
            long r52 = r52 >> r21
            long r52 = r52 & r17
            r7 = 13
            long r54 = load3(r1, r7)
            long r54 = r54 >> r24
            long r54 = r54 & r17
            r7 = 15
            long r56 = load4(r1, r7)
            long r56 = r56 >> r28
            long r56 = r56 & r17
            r7 = 18
            long r58 = load3(r1, r7)
            long r58 = r58 >> r32
            long r58 = r58 & r17
            r7 = 21
            long r60 = load3(r1, r7)
            long r60 = r60 & r17
            r7 = 23
            long r62 = load4(r1, r7)
            long r62 = r62 >> r11
            long r62 = r62 & r17
            r7 = 26
            long r64 = load3(r1, r7)
            long r64 = r64 >> r8
            long r64 = r64 & r17
            r7 = 28
            long r66 = load4(r1, r7)
            long r66 = r66 >> r14
            long r68 = load3(r2, r3)
            long r68 = r68 & r17
            long r70 = load4(r2, r8)
            long r70 = r70 >> r11
            long r70 = r70 & r17
            long r72 = load3(r2, r11)
            long r72 = r72 >> r8
            long r72 = r72 & r17
            long r74 = load4(r2, r14)
            long r74 = r74 >> r14
            long r74 = r74 & r17
            long r76 = load4(r2, r6)
            long r76 = r76 >> r21
            long r76 = r76 & r17
            r7 = 13
            long r78 = load3(r2, r7)
            long r78 = r78 >> r24
            long r78 = r78 & r17
            r7 = 15
            long r80 = load4(r2, r7)
            long r80 = r80 >> r28
            long r80 = r80 & r17
            r7 = 18
            long r82 = load3(r2, r7)
            long r82 = r82 >> r32
            long r82 = r82 & r17
            r7 = 21
            long r84 = load3(r2, r7)
            long r84 = r84 & r17
            r7 = 23
            long r86 = load4(r2, r7)
            long r86 = r86 >> r11
            long r86 = r86 & r17
            r7 = 26
            long r88 = load3(r2, r7)
            long r88 = r88 >> r8
            long r17 = r88 & r17
            r7 = 28
            long r88 = load4(r2, r7)
            long r88 = r88 >> r14
            long r90 = r4 * r44
            long r90 = r68 + r90
            long r92 = r4 * r46
            long r92 = r70 + r92
            long r94 = r9 * r44
            long r92 = r92 + r94
            long r94 = r4 * r48
            long r94 = r72 + r94
            long r96 = r9 * r46
            long r94 = r94 + r96
            long r96 = r12 * r44
            long r94 = r94 + r96
            long r96 = r4 * r50
            long r96 = r74 + r96
            long r98 = r9 * r48
            long r96 = r96 + r98
            long r98 = r12 * r46
            long r96 = r96 + r98
            long r98 = r15 * r44
            long r96 = r96 + r98
            long r98 = r4 * r52
            long r98 = r76 + r98
            long r100 = r9 * r50
            long r98 = r98 + r100
            long r100 = r12 * r48
            long r98 = r98 + r100
            long r100 = r15 * r46
            long r98 = r98 + r100
            long r100 = r19 * r44
            long r98 = r98 + r100
            long r100 = r4 * r54
            long r100 = r78 + r100
            long r102 = r9 * r52
            long r100 = r100 + r102
            long r102 = r12 * r50
            long r100 = r100 + r102
            long r102 = r15 * r48
            long r100 = r100 + r102
            long r102 = r19 * r46
            long r100 = r100 + r102
            long r102 = r22 * r44
            long r100 = r100 + r102
            long r102 = r4 * r56
            long r102 = r80 + r102
            long r104 = r9 * r54
            long r102 = r102 + r104
            long r104 = r12 * r52
            long r102 = r102 + r104
            long r104 = r15 * r50
            long r102 = r102 + r104
            long r104 = r19 * r48
            long r102 = r102 + r104
            long r104 = r22 * r46
            long r102 = r102 + r104
            long r104 = r26 * r44
            long r102 = r102 + r104
            long r104 = r4 * r58
            long r104 = r82 + r104
            long r106 = r9 * r56
            long r104 = r104 + r106
            long r106 = r12 * r54
            long r104 = r104 + r106
            long r106 = r15 * r52
            long r104 = r104 + r106
            long r106 = r19 * r50
            long r104 = r104 + r106
            long r106 = r22 * r48
            long r104 = r104 + r106
            long r106 = r26 * r46
            long r104 = r104 + r106
            long r106 = r30 * r44
            long r104 = r104 + r106
            long r106 = r4 * r60
            long r106 = r84 + r106
            long r108 = r9 * r58
            long r106 = r106 + r108
            long r108 = r12 * r56
            long r106 = r106 + r108
            long r108 = r15 * r54
            long r106 = r106 + r108
            long r108 = r19 * r52
            long r106 = r106 + r108
            long r108 = r22 * r50
            long r106 = r106 + r108
            long r108 = r26 * r48
            long r106 = r106 + r108
            long r108 = r30 * r46
            long r106 = r106 + r108
            long r108 = r34 * r44
            long r106 = r106 + r108
            long r108 = r4 * r62
            long r108 = r86 + r108
            long r110 = r9 * r60
            long r108 = r108 + r110
            long r110 = r12 * r58
            long r108 = r108 + r110
            long r110 = r15 * r56
            long r108 = r108 + r110
            long r110 = r19 * r54
            long r108 = r108 + r110
            long r110 = r22 * r52
            long r108 = r108 + r110
            long r110 = r26 * r50
            long r108 = r108 + r110
            long r110 = r30 * r48
            long r108 = r108 + r110
            long r110 = r34 * r46
            long r108 = r108 + r110
            long r110 = r37 * r44
            long r108 = r108 + r110
            long r110 = r4 * r64
            long r110 = r17 + r110
            long r112 = r9 * r62
            long r110 = r110 + r112
            long r112 = r12 * r60
            long r110 = r110 + r112
            long r112 = r15 * r58
            long r110 = r110 + r112
            long r112 = r19 * r56
            long r110 = r110 + r112
            long r112 = r22 * r54
            long r110 = r110 + r112
            long r112 = r26 * r52
            long r110 = r110 + r112
            long r112 = r30 * r50
            long r110 = r110 + r112
            long r112 = r34 * r48
            long r110 = r110 + r112
            long r112 = r37 * r46
            long r110 = r110 + r112
            long r112 = r40 * r44
            long r110 = r110 + r112
            long r112 = r4 * r66
            long r112 = r88 + r112
            long r114 = r9 * r64
            long r112 = r112 + r114
            long r114 = r12 * r62
            long r112 = r112 + r114
            long r114 = r15 * r60
            long r112 = r112 + r114
            long r114 = r19 * r58
            long r112 = r112 + r114
            long r114 = r22 * r56
            long r112 = r112 + r114
            long r114 = r26 * r54
            long r112 = r112 + r114
            long r114 = r30 * r52
            long r112 = r112 + r114
            long r114 = r34 * r50
            long r112 = r112 + r114
            long r114 = r37 * r48
            long r112 = r112 + r114
            long r114 = r40 * r46
            long r112 = r112 + r114
            long r114 = r42 * r44
            long r112 = r112 + r114
            long r114 = r9 * r66
            long r116 = r12 * r64
            long r114 = r114 + r116
            long r116 = r15 * r62
            long r114 = r114 + r116
            long r116 = r19 * r60
            long r114 = r114 + r116
            long r116 = r22 * r58
            long r114 = r114 + r116
            long r116 = r26 * r56
            long r114 = r114 + r116
            long r116 = r30 * r54
            long r114 = r114 + r116
            long r116 = r34 * r52
            long r114 = r114 + r116
            long r116 = r37 * r50
            long r114 = r114 + r116
            long r116 = r40 * r48
            long r114 = r114 + r116
            long r116 = r42 * r46
            long r114 = r114 + r116
            long r116 = r12 * r66
            long r118 = r15 * r64
            long r116 = r116 + r118
            long r118 = r19 * r62
            long r116 = r116 + r118
            long r118 = r22 * r60
            long r116 = r116 + r118
            long r118 = r26 * r58
            long r116 = r116 + r118
            long r118 = r30 * r56
            long r116 = r116 + r118
            long r118 = r34 * r54
            long r116 = r116 + r118
            long r118 = r37 * r52
            long r116 = r116 + r118
            long r118 = r40 * r50
            long r116 = r116 + r118
            long r118 = r42 * r48
            long r116 = r116 + r118
            long r118 = r15 * r66
            long r120 = r19 * r64
            long r118 = r118 + r120
            long r120 = r22 * r62
            long r118 = r118 + r120
            long r120 = r26 * r60
            long r118 = r118 + r120
            long r120 = r30 * r58
            long r118 = r118 + r120
            long r120 = r34 * r56
            long r118 = r118 + r120
            long r120 = r37 * r54
            long r118 = r118 + r120
            long r120 = r40 * r52
            long r118 = r118 + r120
            long r120 = r42 * r50
            long r118 = r118 + r120
            long r120 = r19 * r66
            long r122 = r22 * r64
            long r120 = r120 + r122
            long r122 = r26 * r62
            long r120 = r120 + r122
            long r122 = r30 * r60
            long r120 = r120 + r122
            long r122 = r34 * r58
            long r120 = r120 + r122
            long r122 = r37 * r56
            long r120 = r120 + r122
            long r122 = r40 * r54
            long r120 = r120 + r122
            long r122 = r42 * r52
            long r120 = r120 + r122
            long r122 = r22 * r66
            long r124 = r26 * r64
            long r122 = r122 + r124
            long r124 = r30 * r62
            long r122 = r122 + r124
            long r124 = r34 * r60
            long r122 = r122 + r124
            long r124 = r37 * r58
            long r122 = r122 + r124
            long r124 = r40 * r56
            long r122 = r122 + r124
            long r124 = r42 * r54
            long r122 = r122 + r124
            long r124 = r26 * r66
            long r126 = r30 * r64
            long r124 = r124 + r126
            long r126 = r34 * r62
            long r124 = r124 + r126
            long r126 = r37 * r60
            long r124 = r124 + r126
            long r126 = r40 * r58
            long r124 = r124 + r126
            long r126 = r42 * r56
            long r124 = r124 + r126
            long r126 = r30 * r66
            long r128 = r34 * r64
            long r126 = r126 + r128
            long r128 = r37 * r62
            long r126 = r126 + r128
            long r128 = r40 * r60
            long r126 = r126 + r128
            long r128 = r42 * r58
            long r126 = r126 + r128
            long r128 = r34 * r66
            long r130 = r37 * r64
            long r128 = r128 + r130
            long r130 = r40 * r62
            long r128 = r128 + r130
            long r130 = r42 * r60
            long r128 = r128 + r130
            long r130 = r37 * r66
            long r132 = r40 * r64
            long r130 = r130 + r132
            long r132 = r42 * r62
            long r130 = r130 + r132
            long r132 = r40 * r66
            long r134 = r42 * r64
            long r132 = r132 + r134
            long r134 = r42 * r66
            r136 = 0
            r138 = 1048576(0x100000, double:5.180654E-318)
            long r140 = r90 + r138
            r36 = 21
            long r140 = r140 >> r36
            long r92 = r92 + r140
            long r142 = r140 << r36
            long r90 = r90 - r142
            long r142 = r94 + r138
            long r142 = r142 >> r36
            long r96 = r96 + r142
            long r144 = r142 << r36
            long r94 = r94 - r144
            long r144 = r98 + r138
            long r144 = r144 >> r36
            long r100 = r100 + r144
            long r146 = r144 << r36
            long r98 = r98 - r146
            long r146 = r102 + r138
            long r146 = r146 >> r36
            long r104 = r104 + r146
            long r148 = r146 << r36
            long r102 = r102 - r148
            long r148 = r106 + r138
            long r148 = r148 >> r36
            long r108 = r108 + r148
            long r150 = r148 << r36
            long r106 = r106 - r150
            long r150 = r110 + r138
            long r150 = r150 >> r36
            long r112 = r112 + r150
            long r152 = r150 << r36
            long r110 = r110 - r152
            long r152 = r114 + r138
            long r152 = r152 >> r36
            long r116 = r116 + r152
            long r154 = r152 << r36
            long r114 = r114 - r154
            long r154 = r118 + r138
            long r154 = r154 >> r36
            long r120 = r120 + r154
            long r156 = r154 << r36
            long r118 = r118 - r156
            long r156 = r122 + r138
            long r156 = r156 >> r36
            long r124 = r124 + r156
            long r158 = r156 << r36
            long r122 = r122 - r158
            long r158 = r126 + r138
            long r158 = r158 >> r36
            long r128 = r128 + r158
            long r160 = r158 << r36
            long r126 = r126 - r160
            long r160 = r130 + r138
            long r160 = r160 >> r36
            long r132 = r132 + r160
            long r162 = r160 << r36
            long r130 = r130 - r162
            long r162 = r134 + r138
            long r162 = r162 >> r36
            long r136 = r136 + r162
            long r164 = r162 << r36
            long r134 = r134 - r164
            long r164 = r92 + r138
            long r164 = r164 >> r36
            long r94 = r94 + r164
            long r166 = r164 << r36
            long r92 = r92 - r166
            long r166 = r96 + r138
            long r166 = r166 >> r36
            long r98 = r98 + r166
            long r168 = r166 << r36
            long r96 = r96 - r168
            long r168 = r100 + r138
            long r168 = r168 >> r36
            long r102 = r102 + r168
            long r170 = r168 << r36
            long r100 = r100 - r170
            long r170 = r104 + r138
            long r170 = r170 >> r36
            long r106 = r106 + r170
            long r172 = r170 << r36
            long r104 = r104 - r172
            long r172 = r108 + r138
            long r172 = r172 >> r36
            long r110 = r110 + r172
            long r174 = r172 << r36
            long r108 = r108 - r174
            long r174 = r112 + r138
            long r174 = r174 >> r36
            long r114 = r114 + r174
            long r176 = r174 << r36
            long r112 = r112 - r176
            long r176 = r116 + r138
            long r176 = r176 >> r36
            long r118 = r118 + r176
            long r178 = r176 << r36
            long r116 = r116 - r178
            long r178 = r120 + r138
            long r178 = r178 >> r36
            long r122 = r122 + r178
            long r180 = r178 << r36
            long r120 = r120 - r180
            long r180 = r124 + r138
            long r180 = r180 >> r36
            long r126 = r126 + r180
            long r182 = r180 << r36
            long r124 = r124 - r182
            long r182 = r128 + r138
            long r182 = r182 >> r36
            long r130 = r130 + r182
            long r184 = r182 << r36
            long r128 = r128 - r184
            long r184 = r132 + r138
            long r184 = r184 >> r36
            long r134 = r134 + r184
            long r186 = r184 << r36
            long r132 = r132 - r186
            r186 = 666643(0xa2c13, double:3.293654E-318)
            long r188 = r136 * r186
            long r112 = r112 + r188
            r188 = 470296(0x72d18, double:2.32357E-318)
            long r190 = r136 * r188
            long r114 = r114 + r190
            r190 = 654183(0x9fb67, double:3.232093E-318)
            long r192 = r136 * r190
            long r116 = r116 + r192
            r192 = 997805(0xf39ad, double:4.92981E-318)
            long r194 = r136 * r192
            long r118 = r118 - r194
            r194 = 136657(0x215d1, double:6.75175E-319)
            long r196 = r136 * r194
            long r120 = r120 + r196
            r196 = 683901(0xa6f7d, double:3.37892E-318)
            long r198 = r136 * r196
            long r122 = r122 - r198
            long r198 = r134 * r186
            long r110 = r110 + r198
            long r198 = r134 * r188
            long r112 = r112 + r198
            long r198 = r134 * r190
            long r114 = r114 + r198
            long r198 = r134 * r192
            long r116 = r116 - r198
            long r198 = r134 * r194
            long r118 = r118 + r198
            long r198 = r134 * r196
            long r120 = r120 - r198
            long r198 = r132 * r186
            long r108 = r108 + r198
            long r198 = r132 * r188
            long r110 = r110 + r198
            long r198 = r132 * r190
            long r112 = r112 + r198
            long r198 = r132 * r192
            long r114 = r114 - r198
            long r198 = r132 * r194
            long r116 = r116 + r198
            long r198 = r132 * r196
            long r118 = r118 - r198
            long r198 = r130 * r186
            long r106 = r106 + r198
            long r198 = r130 * r188
            long r108 = r108 + r198
            long r198 = r130 * r190
            long r110 = r110 + r198
            long r198 = r130 * r192
            long r112 = r112 - r198
            long r198 = r130 * r194
            long r114 = r114 + r198
            long r198 = r130 * r196
            long r116 = r116 - r198
            long r198 = r128 * r186
            long r104 = r104 + r198
            long r198 = r128 * r188
            long r106 = r106 + r198
            long r198 = r128 * r190
            long r108 = r108 + r198
            long r198 = r128 * r192
            long r110 = r110 - r198
            long r198 = r128 * r194
            long r112 = r112 + r198
            long r198 = r128 * r196
            long r114 = r114 - r198
            long r198 = r126 * r186
            long r102 = r102 + r198
            long r198 = r126 * r188
            long r104 = r104 + r198
            long r198 = r126 * r190
            long r106 = r106 + r198
            long r198 = r126 * r192
            long r108 = r108 - r198
            long r198 = r126 * r194
            long r110 = r110 + r198
            long r198 = r126 * r196
            long r112 = r112 - r198
            long r198 = r102 + r138
            r36 = 21
            long r146 = r198 >> r36
            long r104 = r104 + r146
            long r198 = r146 << r36
            long r102 = r102 - r198
            long r198 = r106 + r138
            long r148 = r198 >> r36
            long r108 = r108 + r148
            long r198 = r148 << r36
            long r106 = r106 - r198
            long r198 = r110 + r138
            long r150 = r198 >> r36
            long r112 = r112 + r150
            long r198 = r150 << r36
            long r110 = r110 - r198
            long r198 = r114 + r138
            long r152 = r198 >> r36
            long r116 = r116 + r152
            long r198 = r152 << r36
            long r114 = r114 - r198
            long r198 = r118 + r138
            long r154 = r198 >> r36
            long r120 = r120 + r154
            long r198 = r154 << r36
            long r118 = r118 - r198
            long r198 = r122 + r138
            long r156 = r198 >> r36
            long r124 = r124 + r156
            long r198 = r156 << r36
            long r122 = r122 - r198
            long r198 = r104 + r138
            long r170 = r198 >> r36
            long r106 = r106 + r170
            long r198 = r170 << r36
            long r104 = r104 - r198
            long r198 = r108 + r138
            long r172 = r198 >> r36
            long r110 = r110 + r172
            long r198 = r172 << r36
            long r108 = r108 - r198
            long r198 = r112 + r138
            long r174 = r198 >> r36
            long r114 = r114 + r174
            long r198 = r174 << r36
            long r112 = r112 - r198
            long r198 = r116 + r138
            long r176 = r198 >> r36
            long r118 = r118 + r176
            long r198 = r176 << r36
            long r116 = r116 - r198
            long r198 = r120 + r138
            long r178 = r198 >> r36
            long r122 = r122 + r178
            long r198 = r178 << r36
            long r120 = r120 - r198
            long r198 = r124 * r186
            long r100 = r100 + r198
            long r198 = r124 * r188
            long r102 = r102 + r198
            long r198 = r124 * r190
            long r104 = r104 + r198
            long r198 = r124 * r192
            long r106 = r106 - r198
            long r198 = r124 * r194
            long r108 = r108 + r198
            long r198 = r124 * r196
            long r110 = r110 - r198
            long r198 = r122 * r186
            long r98 = r98 + r198
            long r198 = r122 * r188
            long r100 = r100 + r198
            long r198 = r122 * r190
            long r102 = r102 + r198
            long r198 = r122 * r192
            long r104 = r104 - r198
            long r198 = r122 * r194
            long r106 = r106 + r198
            long r198 = r122 * r196
            long r108 = r108 - r198
            long r198 = r120 * r186
            long r96 = r96 + r198
            long r198 = r120 * r188
            long r98 = r98 + r198
            long r198 = r120 * r190
            long r100 = r100 + r198
            long r198 = r120 * r192
            long r102 = r102 - r198
            long r198 = r120 * r194
            long r104 = r104 + r198
            long r198 = r120 * r196
            long r106 = r106 - r198
            long r198 = r118 * r186
            long r94 = r94 + r198
            long r198 = r118 * r188
            long r96 = r96 + r198
            long r198 = r118 * r190
            long r98 = r98 + r198
            long r198 = r118 * r192
            long r100 = r100 - r198
            long r198 = r118 * r194
            long r102 = r102 + r198
            long r198 = r118 * r196
            long r104 = r104 - r198
            long r198 = r116 * r186
            long r92 = r92 + r198
            long r198 = r116 * r188
            long r94 = r94 + r198
            long r198 = r116 * r190
            long r96 = r96 + r198
            long r198 = r116 * r192
            long r98 = r98 - r198
            long r198 = r116 * r194
            long r100 = r100 + r198
            long r198 = r116 * r196
            long r102 = r102 - r198
            long r198 = r114 * r186
            long r90 = r90 + r198
            long r198 = r114 * r188
            long r92 = r92 + r198
            long r198 = r114 * r190
            long r94 = r94 + r198
            long r198 = r114 * r192
            long r96 = r96 - r198
            long r198 = r114 * r194
            long r98 = r98 + r198
            long r198 = r114 * r196
            long r100 = r100 - r198
            r114 = 0
            long r198 = r90 + r138
            r36 = 21
            long r140 = r198 >> r36
            long r92 = r92 + r140
            long r198 = r140 << r36
            long r90 = r90 - r198
            long r198 = r94 + r138
            long r142 = r198 >> r36
            long r96 = r96 + r142
            long r198 = r142 << r36
            long r94 = r94 - r198
            long r198 = r98 + r138
            long r144 = r198 >> r36
            long r100 = r100 + r144
            long r198 = r144 << r36
            long r98 = r98 - r198
            long r198 = r102 + r138
            long r146 = r198 >> r36
            long r104 = r104 + r146
            long r198 = r146 << r36
            long r102 = r102 - r198
            long r198 = r106 + r138
            long r148 = r198 >> r36
            long r108 = r108 + r148
            long r198 = r148 << r36
            long r106 = r106 - r198
            long r198 = r110 + r138
            long r150 = r198 >> r36
            long r112 = r112 + r150
            long r198 = r150 << r36
            long r110 = r110 - r198
            long r198 = r92 + r138
            long r164 = r198 >> r36
            long r94 = r94 + r164
            long r198 = r164 << r36
            long r92 = r92 - r198
            long r198 = r96 + r138
            long r166 = r198 >> r36
            long r98 = r98 + r166
            long r198 = r166 << r36
            long r96 = r96 - r198
            long r198 = r100 + r138
            long r168 = r198 >> r36
            long r102 = r102 + r168
            long r198 = r168 << r36
            long r100 = r100 - r198
            long r198 = r104 + r138
            long r170 = r198 >> r36
            long r106 = r106 + r170
            long r198 = r170 << r36
            long r104 = r104 - r198
            long r198 = r108 + r138
            long r172 = r198 >> r36
            long r110 = r110 + r172
            long r198 = r172 << r36
            long r108 = r108 - r198
            long r138 = r112 + r138
            long r138 = r138 >> r36
            long r114 = r114 + r138
            long r174 = r138 << r36
            long r112 = r112 - r174
            long r174 = r114 * r186
            long r90 = r90 + r174
            long r174 = r114 * r188
            long r92 = r92 + r174
            long r174 = r114 * r190
            long r94 = r94 + r174
            long r174 = r114 * r192
            long r96 = r96 - r174
            long r174 = r114 * r194
            long r98 = r98 + r174
            long r174 = r114 * r196
            long r100 = r100 - r174
            r114 = 0
            r36 = 21
            long r140 = r90 >> r36
            long r92 = r92 + r140
            long r174 = r140 << r36
            long r90 = r90 - r174
            long r164 = r92 >> r36
            long r94 = r94 + r164
            long r174 = r164 << r36
            long r92 = r92 - r174
            long r142 = r94 >> r36
            long r96 = r96 + r142
            long r174 = r142 << r36
            long r94 = r94 - r174
            long r166 = r96 >> r36
            long r98 = r98 + r166
            long r174 = r166 << r36
            long r96 = r96 - r174
            long r144 = r98 >> r36
            long r100 = r100 + r144
            long r174 = r144 << r36
            long r98 = r98 - r174
            long r168 = r100 >> r36
            long r102 = r102 + r168
            long r174 = r168 << r36
            long r100 = r100 - r174
            long r146 = r102 >> r36
            long r104 = r104 + r146
            long r174 = r146 << r36
            long r102 = r102 - r174
            long r170 = r104 >> r36
            long r106 = r106 + r170
            long r174 = r170 << r36
            long r104 = r104 - r174
            long r148 = r106 >> r36
            long r108 = r108 + r148
            long r174 = r148 << r36
            long r106 = r106 - r174
            long r172 = r108 >> r36
            long r110 = r110 + r172
            long r174 = r172 << r36
            long r108 = r108 - r174
            long r150 = r110 >> r36
            long r112 = r112 + r150
            long r174 = r150 << r36
            long r110 = r110 - r174
            long r138 = r112 >> r36
            long r114 = r114 + r138
            long r174 = r138 << r36
            long r112 = r112 - r174
            long r186 = r186 * r114
            long r90 = r90 + r186
            long r188 = r188 * r114
            long r92 = r92 + r188
            long r190 = r190 * r114
            long r94 = r94 + r190
            long r192 = r192 * r114
            long r96 = r96 - r192
            long r194 = r194 * r114
            long r98 = r98 + r194
            long r196 = r196 * r114
            long r100 = r100 - r196
            r36 = 21
            long r140 = r90 >> r36
            long r92 = r92 + r140
            long r174 = r140 << r36
            r7 = r3
            r186 = r4
            long r3 = r90 - r174
            long r90 = r92 >> r36
            long r94 = r94 + r90
            long r164 = r90 << r36
            long r92 = r92 - r164
            long r142 = r94 >> r36
            long r96 = r96 + r142
            long r164 = r142 << r36
            long r94 = r94 - r164
            long r164 = r96 >> r36
            long r98 = r98 + r164
            long r166 = r164 << r36
            long r96 = r96 - r166
            long r144 = r98 >> r36
            long r100 = r100 + r144
            long r166 = r144 << r36
            long r98 = r98 - r166
            long r166 = r100 >> r36
            long r102 = r102 + r166
            long r168 = r166 << r36
            long r100 = r100 - r168
            long r146 = r102 >> r36
            long r104 = r104 + r146
            long r168 = r146 << r36
            long r102 = r102 - r168
            long r168 = r104 >> r36
            long r106 = r106 + r168
            long r170 = r168 << r36
            long r104 = r104 - r170
            long r148 = r106 >> r36
            long r108 = r108 + r148
            long r170 = r148 << r36
            r5 = r6
            r174 = r7
            long r6 = r106 - r170
            long r106 = r108 >> r36
            long r110 = r110 + r106
            long r170 = r106 << r36
            long r108 = r108 - r170
            long r150 = r110 >> r36
            long r112 = r112 + r150
            long r170 = r150 << r36
            long r110 = r110 - r170
            r170 = r5
            int r5 = (int) r3
            byte r5 = (byte) r5
            r200[r174] = r5
            r5 = 8
            r171 = r8
            r172 = r9
            long r8 = r3 >> r5
            int r5 = (int) r8
            byte r5 = (byte) r5
            r200[r24] = r5
            r5 = 16
            long r8 = r3 >> r5
            long r174 = r92 << r11
            long r8 = r8 | r174
            int r5 = (int) r8
            byte r5 = (byte) r5
            r200[r171] = r5
            long r8 = r92 >> r32
            int r5 = (int) r8
            byte r5 = (byte) r5
            r200[r32] = r5
            r5 = 11
            long r8 = r92 >> r5
            int r5 = (int) r8
            byte r5 = (byte) r5
            r200[r21] = r5
            r5 = 19
            long r8 = r92 >> r5
            long r174 = r94 << r171
            long r8 = r8 | r174
            int r5 = (int) r8
            byte r5 = (byte) r5
            r200[r11] = r5
            long r8 = r94 >> r28
            int r5 = (int) r8
            byte r5 = (byte) r5
            r200[r28] = r5
            r5 = 14
            long r8 = r94 >> r5
            long r174 = r96 << r14
            long r8 = r8 | r174
            int r5 = (int) r8
            byte r5 = (byte) r5
            r200[r14] = r5
            long r8 = r96 >> r24
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 8
            r200[r8] = r5
            r5 = 9
            long r8 = r96 >> r5
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 9
            r200[r8] = r5
            r5 = 17
            long r8 = r96 >> r5
            long r174 = r98 << r21
            long r8 = r8 | r174
            int r5 = (int) r8
            byte r5 = (byte) r5
            r200[r170] = r5
            long r8 = r98 >> r21
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 11
            r200[r8] = r5
            r5 = 12
            long r8 = r98 >> r5
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 12
            r200[r8] = r5
            r5 = 20
            long r8 = r98 >> r5
            long r174 = r100 << r24
            long r8 = r8 | r174
            int r5 = (int) r8
            byte r5 = (byte) r5
            r25 = 13
            r200[r25] = r5
            long r8 = r100 >> r14
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 14
            r200[r8] = r5
            r29 = 15
            long r8 = r100 >> r29
            long r174 = r102 << r28
            long r8 = r8 | r174
            int r5 = (int) r8
            byte r5 = (byte) r5
            r200[r29] = r5
            long r8 = r102 >> r171
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 16
            r200[r8] = r5
            long r8 = r102 >> r170
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 17
            r200[r8] = r5
            r33 = 18
            long r8 = r102 >> r33
            long r174 = r104 << r32
            long r8 = r8 | r174
            int r5 = (int) r8
            byte r5 = (byte) r5
            r200[r33] = r5
            long r8 = r104 >> r11
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 19
            r200[r8] = r5
            r25 = 13
            long r8 = r104 >> r25
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 20
            r200[r8] = r5
            int r5 = (int) r6
            byte r5 = (byte) r5
            r36 = 21
            r200[r36] = r5
            r5 = 8
            long r8 = r6 >> r5
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 22
            r200[r8] = r5
            r5 = 16
            long r8 = r6 >> r5
            long r10 = r108 << r11
            long r8 = r8 | r10
            int r5 = (int) r8
            byte r5 = (byte) r5
            r39 = 23
            r200[r39] = r5
            long r8 = r108 >> r32
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 24
            r200[r8] = r5
            r5 = 11
            long r8 = r108 >> r5
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 25
            r200[r8] = r5
            r5 = 19
            long r8 = r108 >> r5
            long r10 = r110 << r171
            long r8 = r8 | r10
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 26
            r200[r8] = r5
            long r8 = r110 >> r28
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 27
            r200[r8] = r5
            r5 = 14
            long r8 = r110 >> r5
            long r10 = r112 << r14
            long r8 = r8 | r10
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 28
            r200[r8] = r5
            long r8 = r112 >> r24
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 29
            r200[r8] = r5
            r5 = 9
            long r8 = r112 >> r5
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 30
            r200[r8] = r5
            r5 = 17
            long r8 = r112 >> r5
            int r5 = (int) r8
            byte r5 = (byte) r5
            r8 = 31
            r200[r8] = r5
            return
    }

    private static void neg(long[] r3, long[] r4) {
            r0 = 0
        L1:
            int r1 = r4.length
            if (r0 >= r1) goto Lc
            r1 = r4[r0]
            long r1 = -r1
            r3[r0] = r1
            int r0 = r0 + 1
            goto L1
        Lc:
            return
    }

    private static void pow2252m3(long[] r7, long[] r8) {
            r0 = 10
            long[] r1 = new long[r0]
            long[] r2 = new long[r0]
            long[] r3 = new long[r0]
            com.google.crypto.tink.subtle.Field25519.square(r1, r8)
            com.google.crypto.tink.subtle.Field25519.square(r2, r1)
            r4 = 1
        Lf:
            r5 = 2
            if (r4 >= r5) goto L18
            com.google.crypto.tink.subtle.Field25519.square(r2, r2)
            int r4 = r4 + 1
            goto Lf
        L18:
            com.google.crypto.tink.subtle.Field25519.mult(r2, r8, r2)
            com.google.crypto.tink.subtle.Field25519.mult(r1, r1, r2)
            com.google.crypto.tink.subtle.Field25519.square(r1, r1)
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r1)
            com.google.crypto.tink.subtle.Field25519.square(r2, r1)
            r4 = 1
        L28:
            r6 = 5
            if (r4 >= r6) goto L31
            com.google.crypto.tink.subtle.Field25519.square(r2, r2)
            int r4 = r4 + 1
            goto L28
        L31:
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r1)
            com.google.crypto.tink.subtle.Field25519.square(r2, r1)
            r4 = 1
        L38:
            if (r4 >= r0) goto L40
            com.google.crypto.tink.subtle.Field25519.square(r2, r2)
            int r4 = r4 + 1
            goto L38
        L40:
            com.google.crypto.tink.subtle.Field25519.mult(r2, r2, r1)
            com.google.crypto.tink.subtle.Field25519.square(r3, r2)
            r4 = 1
        L47:
            r6 = 20
            if (r4 >= r6) goto L51
            com.google.crypto.tink.subtle.Field25519.square(r3, r3)
            int r4 = r4 + 1
            goto L47
        L51:
            com.google.crypto.tink.subtle.Field25519.mult(r2, r3, r2)
            com.google.crypto.tink.subtle.Field25519.square(r2, r2)
            r4 = 1
        L58:
            if (r4 >= r0) goto L60
            com.google.crypto.tink.subtle.Field25519.square(r2, r2)
            int r4 = r4 + 1
            goto L58
        L60:
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r1)
            com.google.crypto.tink.subtle.Field25519.square(r2, r1)
            r0 = 1
        L67:
            r4 = 50
            if (r0 >= r4) goto L71
            com.google.crypto.tink.subtle.Field25519.square(r2, r2)
            int r0 = r0 + 1
            goto L67
        L71:
            com.google.crypto.tink.subtle.Field25519.mult(r2, r2, r1)
            com.google.crypto.tink.subtle.Field25519.square(r3, r2)
            r0 = 1
        L78:
            r6 = 100
            if (r0 >= r6) goto L82
            com.google.crypto.tink.subtle.Field25519.square(r3, r3)
            int r0 = r0 + 1
            goto L78
        L82:
            com.google.crypto.tink.subtle.Field25519.mult(r2, r3, r2)
            com.google.crypto.tink.subtle.Field25519.square(r2, r2)
            r0 = 1
        L89:
            if (r0 >= r4) goto L91
            com.google.crypto.tink.subtle.Field25519.square(r2, r2)
            int r0 = r0 + 1
            goto L89
        L91:
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r1)
            com.google.crypto.tink.subtle.Field25519.square(r1, r1)
            r0 = 1
        L98:
            if (r0 >= r5) goto La0
            com.google.crypto.tink.subtle.Field25519.square(r1, r1)
            int r0 = r0 + 1
            goto L98
        La0:
            com.google.crypto.tink.subtle.Field25519.mult(r7, r1, r8)
            return
    }

    private static void reduce(byte[] r112) {
            r0 = r112
            r1 = 0
            long r1 = load3(r0, r1)
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r1 = r1 & r3
            r5 = 2
            long r6 = load4(r0, r5)
            r8 = 5
            long r6 = r6 >> r8
            long r6 = r6 & r3
            long r9 = load3(r0, r8)
            long r9 = r9 >> r5
            long r9 = r9 & r3
            r11 = 7
            long r12 = load4(r0, r11)
            long r12 = r12 >> r11
            long r12 = r12 & r3
            r14 = 10
            long r15 = load4(r0, r14)
            r17 = 4
            long r15 = r15 >> r17
            long r15 = r15 & r3
            r18 = r3
            r3 = 13
            long r20 = load3(r0, r3)
            r4 = 1
            long r20 = r20 >> r4
            long r20 = r20 & r18
            r22 = r3
            r3 = 15
            long r23 = load4(r0, r3)
            r25 = 6
            long r23 = r23 >> r25
            long r23 = r23 & r18
            r26 = r3
            r3 = 18
            long r27 = load3(r0, r3)
            r29 = 3
            long r27 = r27 >> r29
            long r27 = r27 & r18
            r30 = r3
            r3 = 21
            long r31 = load3(r0, r3)
            long r31 = r31 & r18
            r33 = r3
            r3 = 23
            long r34 = load4(r0, r3)
            long r34 = r34 >> r8
            long r34 = r34 & r18
            r3 = 26
            long r36 = load3(r0, r3)
            long r36 = r36 >> r5
            long r36 = r36 & r18
            r3 = 28
            long r38 = load4(r0, r3)
            long r38 = r38 >> r11
            long r38 = r38 & r18
            r3 = 31
            long r40 = load4(r0, r3)
            long r40 = r40 >> r17
            long r40 = r40 & r18
            r3 = 34
            long r42 = load3(r0, r3)
            long r42 = r42 >> r4
            long r42 = r42 & r18
            r3 = 36
            long r44 = load4(r0, r3)
            long r44 = r44 >> r25
            long r44 = r44 & r18
            r3 = 39
            long r46 = load3(r0, r3)
            long r46 = r46 >> r29
            long r46 = r46 & r18
            r3 = 42
            long r48 = load3(r0, r3)
            long r48 = r48 & r18
            r3 = 44
            long r50 = load4(r0, r3)
            long r50 = r50 >> r8
            long r50 = r50 & r18
            r3 = 47
            long r52 = load3(r0, r3)
            long r52 = r52 >> r5
            long r52 = r52 & r18
            r3 = 49
            long r54 = load4(r0, r3)
            long r54 = r54 >> r11
            long r54 = r54 & r18
            r3 = 52
            long r56 = load4(r0, r3)
            long r56 = r56 >> r17
            long r56 = r56 & r18
            r3 = 55
            long r58 = load3(r0, r3)
            long r58 = r58 >> r4
            long r58 = r58 & r18
            r3 = 57
            long r60 = load4(r0, r3)
            long r60 = r60 >> r25
            long r18 = r60 & r18
            r3 = 60
            long r60 = load4(r0, r3)
            long r60 = r60 >> r29
            r62 = 666643(0xa2c13, double:3.293654E-318)
            long r64 = r60 * r62
            long r38 = r38 + r64
            r64 = 470296(0x72d18, double:2.32357E-318)
            long r66 = r60 * r64
            long r40 = r40 + r66
            r66 = 654183(0x9fb67, double:3.232093E-318)
            long r68 = r60 * r66
            long r42 = r42 + r68
            r68 = 997805(0xf39ad, double:4.92981E-318)
            long r70 = r60 * r68
            long r44 = r44 - r70
            r70 = 136657(0x215d1, double:6.75175E-319)
            long r72 = r60 * r70
            long r46 = r46 + r72
            r72 = 683901(0xa6f7d, double:3.37892E-318)
            long r74 = r60 * r72
            long r48 = r48 - r74
            long r74 = r18 * r62
            long r36 = r36 + r74
            long r74 = r18 * r64
            long r38 = r38 + r74
            long r74 = r18 * r66
            long r40 = r40 + r74
            long r74 = r18 * r68
            long r42 = r42 - r74
            long r74 = r18 * r70
            long r44 = r44 + r74
            long r74 = r18 * r72
            long r46 = r46 - r74
            long r74 = r58 * r62
            long r34 = r34 + r74
            long r74 = r58 * r64
            long r36 = r36 + r74
            long r74 = r58 * r66
            long r38 = r38 + r74
            long r74 = r58 * r68
            long r40 = r40 - r74
            long r74 = r58 * r70
            long r42 = r42 + r74
            long r74 = r58 * r72
            long r44 = r44 - r74
            long r74 = r56 * r62
            long r31 = r31 + r74
            long r74 = r56 * r64
            long r34 = r34 + r74
            long r74 = r56 * r66
            long r36 = r36 + r74
            long r74 = r56 * r68
            long r38 = r38 - r74
            long r74 = r56 * r70
            long r40 = r40 + r74
            long r74 = r56 * r72
            long r42 = r42 - r74
            long r74 = r54 * r62
            long r27 = r27 + r74
            long r74 = r54 * r64
            long r31 = r31 + r74
            long r74 = r54 * r66
            long r34 = r34 + r74
            long r74 = r54 * r68
            long r36 = r36 - r74
            long r74 = r54 * r70
            long r38 = r38 + r74
            long r74 = r54 * r72
            long r40 = r40 - r74
            long r74 = r52 * r62
            long r23 = r23 + r74
            long r74 = r52 * r64
            long r27 = r27 + r74
            long r74 = r52 * r66
            long r31 = r31 + r74
            long r74 = r52 * r68
            long r34 = r34 - r74
            long r74 = r52 * r70
            long r36 = r36 + r74
            long r74 = r52 * r72
            long r38 = r38 - r74
            r74 = 1048576(0x100000, double:5.180654E-318)
            long r76 = r23 + r74
            long r76 = r76 >> r33
            long r27 = r27 + r76
            long r78 = r76 << r33
            long r23 = r23 - r78
            long r78 = r31 + r74
            long r78 = r78 >> r33
            long r34 = r34 + r78
            long r80 = r78 << r33
            long r31 = r31 - r80
            long r80 = r36 + r74
            long r80 = r80 >> r33
            long r38 = r38 + r80
            long r82 = r80 << r33
            long r36 = r36 - r82
            long r82 = r40 + r74
            long r82 = r82 >> r33
            long r42 = r42 + r82
            long r84 = r82 << r33
            long r40 = r40 - r84
            long r84 = r44 + r74
            long r84 = r84 >> r33
            long r46 = r46 + r84
            long r86 = r84 << r33
            long r44 = r44 - r86
            long r86 = r48 + r74
            long r86 = r86 >> r33
            long r50 = r50 + r86
            long r88 = r86 << r33
            long r48 = r48 - r88
            long r88 = r27 + r74
            long r88 = r88 >> r33
            long r31 = r31 + r88
            long r90 = r88 << r33
            long r27 = r27 - r90
            long r90 = r34 + r74
            long r90 = r90 >> r33
            long r36 = r36 + r90
            long r92 = r90 << r33
            long r34 = r34 - r92
            long r92 = r38 + r74
            long r92 = r92 >> r33
            long r40 = r40 + r92
            long r94 = r92 << r33
            long r38 = r38 - r94
            long r94 = r42 + r74
            long r94 = r94 >> r33
            long r44 = r44 + r94
            long r96 = r94 << r33
            long r42 = r42 - r96
            long r96 = r46 + r74
            long r96 = r96 >> r33
            long r48 = r48 + r96
            long r98 = r96 << r33
            long r46 = r46 - r98
            long r98 = r50 * r62
            long r20 = r20 + r98
            long r98 = r50 * r64
            long r23 = r23 + r98
            long r98 = r50 * r66
            long r27 = r27 + r98
            long r98 = r50 * r68
            long r31 = r31 - r98
            long r98 = r50 * r70
            long r34 = r34 + r98
            long r98 = r50 * r72
            long r36 = r36 - r98
            long r98 = r48 * r62
            long r15 = r15 + r98
            long r98 = r48 * r64
            long r20 = r20 + r98
            long r98 = r48 * r66
            long r23 = r23 + r98
            long r98 = r48 * r68
            long r27 = r27 - r98
            long r98 = r48 * r70
            long r31 = r31 + r98
            long r98 = r48 * r72
            long r34 = r34 - r98
            long r98 = r46 * r62
            long r12 = r12 + r98
            long r98 = r46 * r64
            long r15 = r15 + r98
            long r98 = r46 * r66
            long r20 = r20 + r98
            long r98 = r46 * r68
            long r23 = r23 - r98
            long r98 = r46 * r70
            long r27 = r27 + r98
            long r98 = r46 * r72
            long r31 = r31 - r98
            long r98 = r44 * r62
            long r9 = r9 + r98
            long r98 = r44 * r64
            long r12 = r12 + r98
            long r98 = r44 * r66
            long r15 = r15 + r98
            long r98 = r44 * r68
            long r20 = r20 - r98
            long r98 = r44 * r70
            long r23 = r23 + r98
            long r98 = r44 * r72
            long r27 = r27 - r98
            long r98 = r42 * r62
            long r6 = r6 + r98
            long r98 = r42 * r64
            long r9 = r9 + r98
            long r98 = r42 * r66
            long r12 = r12 + r98
            long r98 = r42 * r68
            long r15 = r15 - r98
            long r98 = r42 * r70
            long r20 = r20 + r98
            long r98 = r42 * r72
            long r23 = r23 - r98
            long r98 = r40 * r62
            long r1 = r1 + r98
            long r98 = r40 * r64
            long r6 = r6 + r98
            long r98 = r40 * r66
            long r9 = r9 + r98
            long r98 = r40 * r68
            long r12 = r12 - r98
            long r98 = r40 * r70
            long r15 = r15 + r98
            long r98 = r40 * r72
            long r20 = r20 - r98
            r40 = 0
            long r98 = r1 + r74
            long r98 = r98 >> r33
            long r6 = r6 + r98
            long r100 = r98 << r33
            long r1 = r1 - r100
            long r100 = r9 + r74
            long r100 = r100 >> r33
            long r12 = r12 + r100
            long r102 = r100 << r33
            long r9 = r9 - r102
            long r102 = r15 + r74
            long r102 = r102 >> r33
            long r20 = r20 + r102
            long r104 = r102 << r33
            long r15 = r15 - r104
            long r104 = r23 + r74
            long r76 = r104 >> r33
            long r27 = r27 + r76
            long r104 = r76 << r33
            long r23 = r23 - r104
            long r104 = r31 + r74
            long r78 = r104 >> r33
            long r34 = r34 + r78
            long r104 = r78 << r33
            long r31 = r31 - r104
            long r104 = r36 + r74
            long r80 = r104 >> r33
            long r38 = r38 + r80
            long r104 = r80 << r33
            long r36 = r36 - r104
            long r104 = r6 + r74
            long r104 = r104 >> r33
            long r9 = r9 + r104
            long r106 = r104 << r33
            long r6 = r6 - r106
            long r106 = r12 + r74
            long r106 = r106 >> r33
            long r15 = r15 + r106
            long r108 = r106 << r33
            long r12 = r12 - r108
            long r108 = r20 + r74
            long r108 = r108 >> r33
            long r23 = r23 + r108
            long r110 = r108 << r33
            long r20 = r20 - r110
            long r110 = r27 + r74
            long r88 = r110 >> r33
            long r31 = r31 + r88
            long r110 = r88 << r33
            long r27 = r27 - r110
            long r110 = r34 + r74
            long r90 = r110 >> r33
            long r36 = r36 + r90
            long r110 = r90 << r33
            long r34 = r34 - r110
            long r74 = r38 + r74
            long r74 = r74 >> r33
            long r40 = r40 + r74
            long r92 = r74 << r33
            long r38 = r38 - r92
            long r92 = r40 * r62
            long r1 = r1 + r92
            long r92 = r40 * r64
            long r6 = r6 + r92
            long r92 = r40 * r66
            long r9 = r9 + r92
            long r92 = r40 * r68
            long r12 = r12 - r92
            long r92 = r40 * r70
            long r15 = r15 + r92
            long r92 = r40 * r72
            long r20 = r20 - r92
            r40 = 0
            long r92 = r1 >> r33
            long r6 = r6 + r92
            long r98 = r92 << r33
            long r1 = r1 - r98
            long r98 = r6 >> r33
            long r9 = r9 + r98
            long r104 = r98 << r33
            long r6 = r6 - r104
            long r100 = r9 >> r33
            long r12 = r12 + r100
            long r104 = r100 << r33
            long r9 = r9 - r104
            long r104 = r12 >> r33
            long r15 = r15 + r104
            long r106 = r104 << r33
            long r12 = r12 - r106
            long r102 = r15 >> r33
            long r20 = r20 + r102
            long r106 = r102 << r33
            long r15 = r15 - r106
            long r106 = r20 >> r33
            long r23 = r23 + r106
            long r108 = r106 << r33
            long r20 = r20 - r108
            long r76 = r23 >> r33
            long r27 = r27 + r76
            long r108 = r76 << r33
            long r23 = r23 - r108
            long r88 = r27 >> r33
            long r31 = r31 + r88
            long r108 = r88 << r33
            long r27 = r27 - r108
            long r78 = r31 >> r33
            long r34 = r34 + r78
            long r108 = r78 << r33
            long r31 = r31 - r108
            long r90 = r34 >> r33
            long r36 = r36 + r90
            long r108 = r90 << r33
            long r34 = r34 - r108
            long r80 = r36 >> r33
            long r38 = r38 + r80
            long r108 = r80 << r33
            long r36 = r36 - r108
            long r74 = r38 >> r33
            long r40 = r40 + r74
            long r108 = r74 << r33
            long r38 = r38 - r108
            long r62 = r62 * r40
            long r1 = r1 + r62
            long r64 = r64 * r40
            long r6 = r6 + r64
            long r66 = r66 * r40
            long r9 = r9 + r66
            long r68 = r68 * r40
            long r12 = r12 - r68
            long r70 = r70 * r40
            long r15 = r15 + r70
            long r72 = r72 * r40
            long r20 = r20 - r72
            long r62 = r1 >> r33
            long r6 = r6 + r62
            long r64 = r62 << r33
            long r1 = r1 - r64
            long r64 = r6 >> r33
            long r9 = r9 + r64
            long r66 = r64 << r33
            long r6 = r6 - r66
            long r66 = r9 >> r33
            long r12 = r12 + r66
            long r68 = r66 << r33
            long r9 = r9 - r68
            long r68 = r12 >> r33
            long r15 = r15 + r68
            long r70 = r68 << r33
            long r12 = r12 - r70
            long r70 = r15 >> r33
            long r20 = r20 + r70
            long r72 = r70 << r33
            long r15 = r15 - r72
            long r72 = r20 >> r33
            long r23 = r23 + r72
            long r92 = r72 << r33
            long r20 = r20 - r92
            long r76 = r23 >> r33
            long r27 = r27 + r76
            long r92 = r76 << r33
            long r23 = r23 - r92
            long r88 = r27 >> r33
            long r31 = r31 + r88
            long r92 = r88 << r33
            long r27 = r27 - r92
            long r78 = r31 >> r33
            long r34 = r34 + r78
            long r92 = r78 << r33
            r98 = r4
            r3 = r5
            long r4 = r31 - r92
            long r31 = r34 >> r33
            long r36 = r36 + r31
            long r90 = r31 << r33
            long r34 = r34 - r90
            long r80 = r36 >> r33
            long r38 = r38 + r80
            long r90 = r80 << r33
            long r36 = r36 - r90
            r90 = r3
            int r3 = (int) r1
            byte r3 = (byte) r3
            r91 = 0
            r0[r91] = r3
            r3 = 8
            r91 = r8
            r92 = r9
            long r8 = r1 >> r3
            int r8 = (int) r8
            byte r8 = (byte) r8
            r0[r98] = r8
            r8 = 16
            long r9 = r1 >> r8
            long r99 = r6 << r91
            long r9 = r9 | r99
            int r9 = (int) r9
            byte r9 = (byte) r9
            r0[r90] = r9
            long r9 = r6 >> r29
            int r9 = (int) r9
            byte r9 = (byte) r9
            r0[r29] = r9
            r9 = 11
            long r9 = r6 >> r9
            int r9 = (int) r9
            byte r9 = (byte) r9
            r0[r17] = r9
            r9 = 19
            long r9 = r6 >> r9
            long r99 = r92 << r90
            long r9 = r9 | r99
            int r9 = (int) r9
            byte r9 = (byte) r9
            r0[r91] = r9
            long r9 = r92 >> r25
            int r9 = (int) r9
            byte r9 = (byte) r9
            r0[r25] = r9
            r9 = 14
            long r9 = r92 >> r9
            long r99 = r12 << r11
            long r9 = r9 | r99
            int r9 = (int) r9
            byte r9 = (byte) r9
            r0[r11] = r9
            long r9 = r12 >> r98
            int r9 = (int) r9
            byte r9 = (byte) r9
            r0[r3] = r9
            r9 = 9
            long r9 = r12 >> r9
            int r9 = (int) r9
            byte r9 = (byte) r9
            r10 = 9
            r0[r10] = r9
            r9 = 17
            long r9 = r12 >> r9
            long r99 = r15 << r17
            long r9 = r9 | r99
            int r9 = (int) r9
            byte r9 = (byte) r9
            r0[r14] = r9
            long r9 = r15 >> r17
            int r9 = (int) r9
            byte r9 = (byte) r9
            r10 = 11
            r0[r10] = r9
            r9 = 12
            long r9 = r15 >> r9
            int r9 = (int) r9
            byte r9 = (byte) r9
            r10 = 12
            r0[r10] = r9
            r9 = 20
            long r9 = r15 >> r9
            long r99 = r20 << r98
            long r9 = r9 | r99
            int r9 = (int) r9
            byte r9 = (byte) r9
            r0[r22] = r9
            long r9 = r20 >> r11
            int r9 = (int) r9
            byte r9 = (byte) r9
            r10 = 14
            r0[r10] = r9
            long r9 = r20 >> r26
            long r99 = r23 << r25
            long r9 = r9 | r99
            int r9 = (int) r9
            byte r9 = (byte) r9
            r0[r26] = r9
            long r9 = r23 >> r90
            int r9 = (int) r9
            byte r9 = (byte) r9
            r0[r8] = r9
            long r9 = r23 >> r14
            int r9 = (int) r9
            byte r9 = (byte) r9
            r10 = 17
            r0[r10] = r9
            long r9 = r23 >> r30
            long r99 = r27 << r29
            long r9 = r9 | r99
            int r9 = (int) r9
            byte r9 = (byte) r9
            r0[r30] = r9
            long r9 = r27 >> r91
            int r9 = (int) r9
            byte r9 = (byte) r9
            r10 = 19
            r0[r10] = r9
            long r9 = r27 >> r22
            int r9 = (int) r9
            byte r9 = (byte) r9
            r10 = 20
            r0[r10] = r9
            int r9 = (int) r4
            byte r9 = (byte) r9
            r0[r33] = r9
            long r9 = r4 >> r3
            int r3 = (int) r9
            byte r3 = (byte) r3
            r9 = 22
            r0[r9] = r3
            long r8 = r4 >> r8
            long r99 = r34 << r91
            long r8 = r8 | r99
            int r3 = (int) r8
            byte r3 = (byte) r3
            r8 = 23
            r0[r8] = r3
            long r8 = r34 >> r29
            int r3 = (int) r8
            byte r3 = (byte) r3
            r8 = 24
            r0[r8] = r3
            r3 = 11
            long r8 = r34 >> r3
            int r3 = (int) r8
            byte r3 = (byte) r3
            r8 = 25
            r0[r8] = r3
            r3 = 19
            long r8 = r34 >> r3
            long r29 = r36 << r90
            long r8 = r8 | r29
            int r3 = (int) r8
            byte r3 = (byte) r3
            r8 = 26
            r0[r8] = r3
            long r8 = r36 >> r25
            int r3 = (int) r8
            byte r3 = (byte) r3
            r8 = 27
            r0[r8] = r3
            r3 = 14
            long r8 = r36 >> r3
            long r10 = r38 << r11
            long r8 = r8 | r10
            int r3 = (int) r8
            byte r3 = (byte) r3
            r8 = 28
            r0[r8] = r3
            long r8 = r38 >> r98
            int r3 = (int) r8
            byte r3 = (byte) r3
            r8 = 29
            r0[r8] = r3
            r3 = 9
            long r8 = r38 >> r3
            int r3 = (int) r8
            byte r3 = (byte) r3
            r8 = 30
            r0[r8] = r3
            r3 = 17
            long r8 = r38 >> r3
            int r3 = (int) r8
            byte r3 = (byte) r3
            r8 = 31
            r0[r8] = r3
            return
    }

    private static com.google.crypto.tink.subtle.Ed25519.XYZ scalarMultWithBase(byte[] r9) {
            r0 = 64
            byte[] r0 = new byte[r0]
            r1 = 0
        L5:
            r2 = 32
            if (r1 >= r2) goto L2a
            int r2 = r1 * 2
            int r2 = r2 + 0
            r3 = r9[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 >> 0
            r3 = r3 & 15
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 * 2
            int r2 = r2 + 1
            r3 = r9[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 >> 4
            r3 = r3 & 15
            byte r3 = (byte) r3
            r0[r2] = r3
            int r1 = r1 + 1
            goto L5
        L2a:
            r1 = 0
            r2 = 0
        L2c:
            int r3 = r0.length
            int r3 = r3 + (-1)
            if (r2 >= r3) goto L48
            r3 = r0[r2]
            int r3 = r3 + r1
            byte r3 = (byte) r3
            r0[r2] = r3
            r3 = r0[r2]
            int r3 = r3 + 8
            int r1 = r3 >> 4
            r3 = r0[r2]
            int r4 = r1 << 4
            int r3 = r3 - r4
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r2 + 1
            goto L2c
        L48:
            int r2 = r0.length
            int r2 = r2 + (-1)
            r3 = r0[r2]
            int r3 = r3 + r1
            byte r3 = (byte) r3
            r0[r2] = r3
            com.google.crypto.tink.subtle.Ed25519$PartialXYZT r2 = new com.google.crypto.tink.subtle.Ed25519$PartialXYZT
            com.google.crypto.tink.subtle.Ed25519$PartialXYZT r3 = com.google.crypto.tink.subtle.Ed25519.NEUTRAL
            r2.<init>(r3)
            com.google.crypto.tink.subtle.Ed25519$XYZT r3 = new com.google.crypto.tink.subtle.Ed25519$XYZT
            r3.<init>()
            r4 = 1
        L5e:
            int r5 = r0.length
            if (r4 >= r5) goto L79
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r5 = new com.google.crypto.tink.subtle.Ed25519$CachedXYT
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r6 = com.google.crypto.tink.subtle.Ed25519.CACHED_NEUTRAL
            r5.<init>(r6)
            int r6 = r4 / 2
            r7 = r0[r4]
            select(r5, r6, r7)
            com.google.crypto.tink.subtle.Ed25519$XYZT r6 = com.google.crypto.tink.subtle.Ed25519.XYZT.access$400(r3, r2)
            add(r2, r6, r5)
            int r4 = r4 + 2
            goto L5e
        L79:
            com.google.crypto.tink.subtle.Ed25519$XYZ r4 = new com.google.crypto.tink.subtle.Ed25519$XYZ
            r4.<init>()
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = com.google.crypto.tink.subtle.Ed25519.XYZ.fromPartialXYZT(r4, r2)
            doubleXYZ(r2, r5)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = com.google.crypto.tink.subtle.Ed25519.XYZ.fromPartialXYZT(r4, r2)
            doubleXYZ(r2, r5)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = com.google.crypto.tink.subtle.Ed25519.XYZ.fromPartialXYZT(r4, r2)
            doubleXYZ(r2, r5)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = com.google.crypto.tink.subtle.Ed25519.XYZ.fromPartialXYZT(r4, r2)
            doubleXYZ(r2, r5)
            r5 = 0
        L9b:
            int r6 = r0.length
            if (r5 >= r6) goto Lb6
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r6 = new com.google.crypto.tink.subtle.Ed25519$CachedXYT
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r7 = com.google.crypto.tink.subtle.Ed25519.CACHED_NEUTRAL
            r6.<init>(r7)
            int r7 = r5 / 2
            r8 = r0[r5]
            select(r6, r7, r8)
            com.google.crypto.tink.subtle.Ed25519$XYZT r7 = com.google.crypto.tink.subtle.Ed25519.XYZT.access$400(r3, r2)
            add(r2, r7, r6)
            int r5 = r5 + 2
            goto L9b
        Lb6:
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = new com.google.crypto.tink.subtle.Ed25519$XYZ
            r5.<init>(r2)
            boolean r6 = r5.isOnCurve()
            if (r6 == 0) goto Lc2
            return r5
        Lc2:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "arithmetic error in scalar multiplication"
            r6.<init>(r7)
            throw r6
    }

    static byte[] scalarMultWithBaseToBytes(byte[] r1) {
            com.google.crypto.tink.subtle.Ed25519$XYZ r0 = scalarMultWithBase(r1)
            byte[] r0 = r0.toBytes()
            return r0
    }

    private static void select(com.google.crypto.tink.subtle.Ed25519.CachedXYT r6, int r7, byte r8) {
            r0 = r8 & 255(0xff, float:3.57E-43)
            r1 = 7
            int r0 = r0 >> r1
            int r2 = -r0
            r2 = r2 & r8
            r3 = 1
            int r2 = r2 << r3
            int r2 = r8 - r2
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r4 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r4 = r4[r7]
            r5 = 0
            r4 = r4[r5]
            int r5 = eq(r2, r3)
            r6.copyConditional(r4, r5)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r4 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r4 = r4[r7]
            r3 = r4[r3]
            r4 = 2
            int r5 = eq(r2, r4)
            r6.copyConditional(r3, r5)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r3 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r3 = r3[r7]
            r3 = r3[r4]
            r4 = 3
            int r5 = eq(r2, r4)
            r6.copyConditional(r3, r5)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r3 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r3 = r3[r7]
            r3 = r3[r4]
            r4 = 4
            int r5 = eq(r2, r4)
            r6.copyConditional(r3, r5)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r3 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r3 = r3[r7]
            r3 = r3[r4]
            r4 = 5
            int r5 = eq(r2, r4)
            r6.copyConditional(r3, r5)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r3 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r3 = r3[r7]
            r3 = r3[r4]
            r4 = 6
            int r5 = eq(r2, r4)
            r6.copyConditional(r3, r5)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r3 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r3 = r3[r7]
            r3 = r3[r4]
            int r4 = eq(r2, r1)
            r6.copyConditional(r3, r4)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r3 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r3 = r3[r7]
            r1 = r3[r1]
            r3 = 8
            int r3 = eq(r2, r3)
            r6.copyConditional(r1, r3)
            long[] r1 = r6.yMinusX
            r3 = 10
            long[] r1 = java.util.Arrays.copyOf(r1, r3)
            long[] r4 = r6.yPlusX
            long[] r4 = java.util.Arrays.copyOf(r4, r3)
            long[] r5 = r6.t2d
            long[] r3 = java.util.Arrays.copyOf(r5, r3)
            neg(r3, r3)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r5 = new com.google.crypto.tink.subtle.Ed25519$CachedXYT
            r5.<init>(r1, r4, r3)
            r6.copyConditional(r5, r0)
            return
    }

    static byte[] sign(byte[] r7, byte[] r8, byte[] r9) throws java.security.GeneralSecurityException {
            int r0 = r7.length
            r1 = 0
            byte[] r0 = java.util.Arrays.copyOfRange(r7, r1, r0)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMessageDigest, java.security.MessageDigest> r2 = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST
            java.lang.String r3 = "SHA-512"
            java.lang.Object r2 = r2.getInstance(r3)
            java.security.MessageDigest r2 = (java.security.MessageDigest) r2
            r3 = 32
            r2.update(r9, r3, r3)
            r2.update(r0)
            byte[] r4 = r2.digest()
            reduce(r4)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = scalarMultWithBase(r4)
            byte[] r5 = r5.toBytes()
            byte[] r1 = java.util.Arrays.copyOfRange(r5, r1, r3)
            r2.reset()
            r2.update(r1)
            r2.update(r8)
            r2.update(r0)
            byte[] r5 = r2.digest()
            reduce(r5)
            byte[] r3 = new byte[r3]
            mulAdd(r3, r5, r9, r4)
            byte[][] r6 = new byte[][]{r1, r3}
            byte[] r6 = com.google.crypto.tink.subtle.Bytes.concat(r6)
            return r6
    }

    private static byte[] slide(byte[] r8) {
            r0 = 256(0x100, float:3.59E-43)
            byte[] r1 = new byte[r0]
            r2 = 0
        L5:
            r3 = 1
            if (r2 >= r0) goto L18
            int r4 = r2 >> 3
            r4 = r8[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = r2 & 7
            int r4 = r4 >> r5
            r3 = r3 & r4
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L5
        L18:
            r2 = 0
        L19:
            if (r2 >= r0) goto L77
            r4 = r1[r2]
            if (r4 == 0) goto L74
            r4 = 1
        L20:
            r5 = 6
            if (r4 > r5) goto L74
            int r5 = r2 + r4
            if (r5 >= r0) goto L74
            int r5 = r2 + r4
            r5 = r1[r5]
            if (r5 == 0) goto L71
            r5 = r1[r2]
            int r6 = r2 + r4
            r6 = r1[r6]
            int r6 = r6 << r4
            int r5 = r5 + r6
            r6 = 15
            r7 = 0
            if (r5 > r6) goto L4a
            r5 = r1[r2]
            int r6 = r2 + r4
            r6 = r1[r6]
            int r6 = r6 << r4
            int r5 = r5 + r6
            byte r5 = (byte) r5
            r1[r2] = r5
            int r5 = r2 + r4
            r1[r5] = r7
            goto L71
        L4a:
            r5 = r1[r2]
            int r6 = r2 + r4
            r6 = r1[r6]
            int r6 = r6 << r4
            int r5 = r5 - r6
            r6 = -15
            if (r5 < r6) goto L74
            r5 = r1[r2]
            int r6 = r2 + r4
            r6 = r1[r6]
            int r6 = r6 << r4
            int r5 = r5 - r6
            byte r5 = (byte) r5
            r1[r2] = r5
            int r5 = r2 + r4
        L63:
            if (r5 >= r0) goto L71
            r6 = r1[r5]
            if (r6 != 0) goto L6c
            r1[r5] = r3
            goto L71
        L6c:
            r1[r5] = r7
            int r5 = r5 + 1
            goto L63
        L71:
            int r4 = r4 + 1
            goto L20
        L74:
            int r2 = r2 + 1
            goto L19
        L77:
            return r1
    }

    private static void sub(com.google.crypto.tink.subtle.Ed25519.PartialXYZT r4, com.google.crypto.tink.subtle.Ed25519.XYZT r5, com.google.crypto.tink.subtle.Ed25519.CachedXYT r6) {
            r0 = 10
            long[] r0 = new long[r0]
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r5.xyz
            long[] r2 = r2.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r3 = r5.xyz
            long[] r3 = r3.x
            com.google.crypto.tink.subtle.Field25519.sum(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r5.xyz
            long[] r2 = r2.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r3 = r5.xyz
            long[] r3 = r3.x
            com.google.crypto.tink.subtle.Field25519.sub(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.y
            long[] r3 = r6.yPlusX
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.x
            long[] r3 = r6.yMinusX
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r3)
            long[] r1 = r4.t
            long[] r2 = r5.t
            long[] r3 = r6.t2d
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r5.xyz
            long[] r2 = r2.z
            r6.multByZ(r1, r2)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.x
            com.google.crypto.tink.subtle.Field25519.sum(r0, r1, r2)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r3 = r4.xyz
            long[] r3 = r3.y
            com.google.crypto.tink.subtle.Field25519.sub(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r3 = r4.xyz
            long[] r3 = r3.y
            com.google.crypto.tink.subtle.Field25519.sum(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.z
            long[] r2 = r4.t
            com.google.crypto.tink.subtle.Field25519.sub(r1, r0, r2)
            long[] r1 = r4.t
            long[] r2 = r4.t
            com.google.crypto.tink.subtle.Field25519.sum(r1, r0, r2)
            return
    }

    static boolean verify(byte[] r11, byte[] r12, byte[] r13) throws java.security.GeneralSecurityException {
            int r0 = r12.length
            r1 = 0
            r2 = 64
            if (r0 == r2) goto L7
            return r1
        L7:
            r0 = 32
            byte[] r2 = java.util.Arrays.copyOfRange(r12, r0, r2)
            boolean r3 = isSmallerThanGroupOrder(r2)
            if (r3 != 0) goto L14
            return r1
        L14:
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMessageDigest, java.security.MessageDigest> r3 = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST
            java.lang.String r4 = "SHA-512"
            java.lang.Object r3 = r3.getInstance(r4)
            java.security.MessageDigest r3 = (java.security.MessageDigest) r3
            r3.update(r12, r1, r0)
            r3.update(r13)
            r3.update(r11)
            byte[] r4 = r3.digest()
            reduce(r4)
            com.google.crypto.tink.subtle.Ed25519$XYZT r5 = com.google.crypto.tink.subtle.Ed25519.XYZT.access$500(r13)
            com.google.crypto.tink.subtle.Ed25519$XYZ r6 = doubleScalarMultVarTime(r4, r5, r2)
            byte[] r7 = r6.toBytes()
            r8 = 0
        L3b:
            if (r8 >= r0) goto L47
            r9 = r7[r8]
            r10 = r12[r8]
            if (r9 == r10) goto L44
            return r1
        L44:
            int r8 = r8 + 1
            goto L3b
        L47:
            r0 = 1
            return r0
    }
}
