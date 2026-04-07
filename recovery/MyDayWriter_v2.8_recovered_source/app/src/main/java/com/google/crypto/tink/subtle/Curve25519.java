package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
final class Curve25519 {
    static final byte[][] BANNED_PUBLIC_KEYS = null;

    static {
            r0 = 32
            byte[] r1 = new byte[r0]
            r1 = {x002c: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            byte[] r2 = new byte[r0]
            r2 = {x0040: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            byte[] r3 = new byte[r0]
            r3 = {x0054: FILL_ARRAY_DATA , data: [-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0} // fill-array
            byte[] r4 = new byte[r0]
            r4 = {x0068: FILL_ARRAY_DATA , data: [95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87} // fill-array
            byte[] r5 = new byte[r0]
            r5 = {x007c: FILL_ARRAY_DATA , data: [-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127} // fill-array
            byte[] r6 = new byte[r0]
            r6 = {x0090: FILL_ARRAY_DATA , data: [-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127} // fill-array
            byte[] r7 = new byte[r0]
            r7 = {x00a4: FILL_ARRAY_DATA , data: [-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127} // fill-array
            byte[][] r0 = new byte[][]{r1, r2, r3, r4, r5, r6, r7}
            com.google.crypto.tink.subtle.Curve25519.BANNED_PUBLIC_KEYS = r0
            return
    }

    private Curve25519() {
            r0 = this;
            r0.<init>()
            return
    }

    static void copyConditional(long[] r5, long[] r6, int r7) {
            int r0 = -r7
            r1 = 0
        L2:
            r2 = 10
            if (r1 >= r2) goto L18
            r2 = r5[r1]
            int r2 = (int) r2
            r3 = r6[r1]
            int r3 = (int) r3
            r2 = r2 ^ r3
            r2 = r2 & r0
            r3 = r5[r1]
            int r3 = (int) r3
            r3 = r3 ^ r2
            long r3 = (long) r3
            r5[r1] = r3
            int r1 = r1 + 1
            goto L2
        L18:
            return
    }

    static void curveMult(long[] r17, byte[] r18, byte[] r19) throws java.security.InvalidKeyException {
            r0 = r17
            byte[] r1 = validatePubKeyAndClearMsb(r19)
            long[] r10 = com.google.crypto.tink.subtle.Field25519.expand(r1)
            r2 = 19
            long[] r3 = new long[r2]
            long[] r4 = new long[r2]
            r5 = 0
            r6 = 1
            r4[r5] = r6
            long[] r8 = new long[r2]
            r8[r5] = r6
            long[] r9 = new long[r2]
            long[] r11 = new long[r2]
            long[] r12 = new long[r2]
            r12[r5] = r6
            long[] r13 = new long[r2]
            long[] r14 = new long[r2]
            r14[r5] = r6
            long[] r2 = new long[r2]
            r15 = 10
            java.lang.System.arraycopy(r10, r5, r3, r5, r15)
            r5 = 0
            r16 = r11
            r11 = r5
            r5 = r16
        L34:
            r6 = 32
            if (r11 >= r6) goto L8a
            int r6 = 32 - r11
            int r6 = r6 + (-1)
            r6 = r18[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 0
            r16 = r12
            r12 = r2
            r2 = r13
            r13 = r7
            r7 = r9
            r9 = r4
            r4 = r5
            r5 = r16
            r16 = r8
            r8 = r3
            r3 = r14
            r14 = r6
            r6 = r16
        L52:
            r15 = 8
            if (r13 >= r15) goto L7c
            int r15 = 7 - r13
            int r15 = r14 >> r15
            r15 = r15 & 1
            swapConditional(r6, r8, r15)
            swapConditional(r7, r9, r15)
            monty(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            swapConditional(r2, r4, r15)
            swapConditional(r3, r5, r15)
            r12 = r6
            r6 = r2
            r2 = r12
            r12 = r7
            r7 = r3
            r3 = r12
            r12 = r8
            r8 = r4
            r4 = r12
            r12 = r9
            r9 = r5
            r5 = r12
            int r13 = r13 + 1
            r15 = 10
            goto L52
        L7c:
            int r11 = r11 + 1
            r13 = r2
            r14 = r3
            r3 = r8
            r2 = r12
            r15 = 10
            r12 = r5
            r8 = r6
            r5 = r4
            r4 = r9
            r9 = r7
            goto L34
        L8a:
            r6 = 10
            long[] r6 = new long[r6]
            com.google.crypto.tink.subtle.Field25519.inverse(r6, r9)
            com.google.crypto.tink.subtle.Field25519.mult(r0, r8, r6)
            boolean r7 = isCollinear(r10, r0, r3, r4)
            if (r7 == 0) goto L9b
            return
        L9b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r15 = "Arithmetic error in curve multiplication with the public key: "
            java.lang.StringBuilder r11 = r11.append(r15)
            java.lang.String r15 = com.google.crypto.tink.subtle.Hex.encode(r19)
            java.lang.StringBuilder r11 = r11.append(r15)
            java.lang.String r11 = r11.toString()
            r7.<init>(r11)
            throw r7
    }

    private static boolean isCollinear(long[] r9, long[] r10, long[] r11, long[] r12) {
            r0 = 10
            long[] r1 = new long[r0]
            long[] r2 = new long[r0]
            r3 = 11
            long[] r4 = new long[r3]
            long[] r5 = new long[r3]
            long[] r3 = new long[r3]
            com.google.crypto.tink.subtle.Field25519.mult(r1, r9, r10)
            com.google.crypto.tink.subtle.Field25519.sum(r2, r9, r10)
            long[] r0 = new long[r0]
            r6 = 0
            r7 = 486662(0x76d06, double:2.40443E-318)
            r0[r6] = r7
            com.google.crypto.tink.subtle.Field25519.sum(r5, r2, r0)
            com.google.crypto.tink.subtle.Field25519.mult(r5, r5, r12)
            com.google.crypto.tink.subtle.Field25519.sum(r5, r11)
            com.google.crypto.tink.subtle.Field25519.mult(r5, r5, r1)
            com.google.crypto.tink.subtle.Field25519.mult(r5, r5, r11)
            r6 = 4
            com.google.crypto.tink.subtle.Field25519.scalarProduct(r4, r5, r6)
            com.google.crypto.tink.subtle.Field25519.reduceCoefficients(r4)
            com.google.crypto.tink.subtle.Field25519.mult(r5, r1, r12)
            com.google.crypto.tink.subtle.Field25519.sub(r5, r5, r12)
            com.google.crypto.tink.subtle.Field25519.mult(r3, r2, r11)
            com.google.crypto.tink.subtle.Field25519.sum(r5, r5, r3)
            com.google.crypto.tink.subtle.Field25519.square(r5, r5)
            byte[] r6 = com.google.crypto.tink.subtle.Field25519.contract(r4)
            byte[] r7 = com.google.crypto.tink.subtle.Field25519.contract(r5)
            boolean r6 = com.google.crypto.tink.subtle.Bytes.equal(r6, r7)
            return r6
    }

    private static void monty(long[] r16, long[] r17, long[] r18, long[] r19, long[] r20, long[] r21, long[] r22, long[] r23, long[] r24) {
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = 10
            long[] r5 = java.util.Arrays.copyOf(r0, r4)
            r6 = 19
            long[] r7 = new long[r6]
            long[] r8 = new long[r6]
            long[] r9 = new long[r6]
            long[] r10 = new long[r6]
            long[] r11 = new long[r6]
            long[] r12 = new long[r6]
            long[] r6 = new long[r6]
            com.google.crypto.tink.subtle.Field25519.sum(r20, r21)
            com.google.crypto.tink.subtle.Field25519.sub(r1, r5)
            long[] r13 = java.util.Arrays.copyOf(r2, r4)
            com.google.crypto.tink.subtle.Field25519.sum(r22, r23)
            com.google.crypto.tink.subtle.Field25519.sub(r3, r13)
            com.google.crypto.tink.subtle.Field25519.product(r10, r2, r1)
            com.google.crypto.tink.subtle.Field25519.product(r11, r0, r3)
            com.google.crypto.tink.subtle.Field25519.reduceSizeByModularReduction(r10)
            com.google.crypto.tink.subtle.Field25519.reduceCoefficients(r10)
            com.google.crypto.tink.subtle.Field25519.reduceSizeByModularReduction(r11)
            com.google.crypto.tink.subtle.Field25519.reduceCoefficients(r11)
            r14 = 0
            java.lang.System.arraycopy(r10, r14, r13, r14, r4)
            com.google.crypto.tink.subtle.Field25519.sum(r10, r11)
            com.google.crypto.tink.subtle.Field25519.sub(r11, r13)
            com.google.crypto.tink.subtle.Field25519.square(r6, r10)
            com.google.crypto.tink.subtle.Field25519.square(r12, r11)
            r15 = r24
            com.google.crypto.tink.subtle.Field25519.product(r11, r12, r15)
            com.google.crypto.tink.subtle.Field25519.reduceSizeByModularReduction(r11)
            com.google.crypto.tink.subtle.Field25519.reduceCoefficients(r11)
            r2 = r18
            java.lang.System.arraycopy(r6, r14, r2, r14, r4)
            r2 = r19
            java.lang.System.arraycopy(r11, r14, r2, r14, r4)
            com.google.crypto.tink.subtle.Field25519.square(r8, r0)
            com.google.crypto.tink.subtle.Field25519.square(r9, r1)
            r14 = r16
            com.google.crypto.tink.subtle.Field25519.product(r14, r8, r9)
            com.google.crypto.tink.subtle.Field25519.reduceSizeByModularReduction(r14)
            com.google.crypto.tink.subtle.Field25519.reduceCoefficients(r14)
            com.google.crypto.tink.subtle.Field25519.sub(r9, r8)
            int r4 = r7.length
            int r4 = r4 + (-1)
            r0 = 0
            r2 = 10
            java.util.Arrays.fill(r7, r2, r4, r0)
            r0 = 121665(0x1db41, double:6.01105E-319)
            com.google.crypto.tink.subtle.Field25519.scalarProduct(r7, r9, r0)
            com.google.crypto.tink.subtle.Field25519.reduceCoefficients(r7)
            com.google.crypto.tink.subtle.Field25519.sum(r7, r8)
            r0 = r17
            com.google.crypto.tink.subtle.Field25519.product(r0, r9, r7)
            com.google.crypto.tink.subtle.Field25519.reduceSizeByModularReduction(r0)
            com.google.crypto.tink.subtle.Field25519.reduceCoefficients(r0)
            return
    }

    static void swapConditional(long[] r5, long[] r6, int r7) {
            int r0 = -r7
            r1 = 0
        L2:
            r2 = 10
            if (r1 >= r2) goto L1f
            r2 = r5[r1]
            int r2 = (int) r2
            r3 = r6[r1]
            int r3 = (int) r3
            r2 = r2 ^ r3
            r2 = r2 & r0
            r3 = r5[r1]
            int r3 = (int) r3
            r3 = r3 ^ r2
            long r3 = (long) r3
            r5[r1] = r3
            r3 = r6[r1]
            int r3 = (int) r3
            r3 = r3 ^ r2
            long r3 = (long) r3
            r6[r1] = r3
            int r1 = r1 + 1
            goto L2
        L1f:
            return
    }

    private static byte[] validatePubKeyAndClearMsb(byte[] r5) throws java.security.InvalidKeyException {
            int r0 = r5.length
            r1 = 32
            if (r0 != r1) goto L48
            int r0 = r5.length
            byte[] r0 = java.util.Arrays.copyOf(r5, r0)
            r1 = 31
            r2 = r0[r1]
            r2 = r2 & 127(0x7f, float:1.78E-43)
            byte r2 = (byte) r2
            r0[r1] = r2
            r1 = 0
        L14:
            byte[][] r2 = com.google.crypto.tink.subtle.Curve25519.BANNED_PUBLIC_KEYS
            int r2 = r2.length
            if (r1 >= r2) goto L47
            byte[][] r2 = com.google.crypto.tink.subtle.Curve25519.BANNED_PUBLIC_KEYS
            r2 = r2[r1]
            boolean r2 = com.google.crypto.tink.subtle.Bytes.equal(r2, r0)
            if (r2 != 0) goto L26
            int r1 = r1 + 1
            goto L14
        L26:
            java.security.InvalidKeyException r2 = new java.security.InvalidKeyException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Banned public key: "
            java.lang.StringBuilder r3 = r3.append(r4)
            byte[][] r4 = com.google.crypto.tink.subtle.Curve25519.BANNED_PUBLIC_KEYS
            r4 = r4[r1]
            java.lang.String r4 = com.google.crypto.tink.subtle.Hex.encode(r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L47:
            return r0
        L48:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            java.lang.String r1 = "Public key length is not 32-byte"
            r0.<init>(r1)
            throw r0
    }
}
