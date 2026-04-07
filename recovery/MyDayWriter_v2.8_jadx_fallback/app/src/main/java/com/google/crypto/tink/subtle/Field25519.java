package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
final class Field25519 {
    private static final int[] EXPAND_SHIFT = null;
    private static final int[] EXPAND_START = null;
    static final int FIELD_LEN = 32;
    static final int LIMB_CNT = 10;
    private static final int[] MASK = null;
    private static final int[] SHIFT = null;
    private static final long TWO_TO_25 = 33554432;
    private static final long TWO_TO_26 = 67108864;

    static {
            r0 = 10
            int[] r1 = new int[r0]
            r1 = {x0028: FILL_ARRAY_DATA , data: [0, 3, 6, 9, 12, 16, 19, 22, 25, 28} // fill-array
            com.google.crypto.tink.subtle.Field25519.EXPAND_START = r1
            int[] r0 = new int[r0]
            r0 = {x0040: FILL_ARRAY_DATA , data: [0, 2, 3, 5, 6, 0, 1, 3, 4, 6} // fill-array
            com.google.crypto.tink.subtle.Field25519.EXPAND_SHIFT = r0
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r1 = 33554431(0x1ffffff, float:9.403954E-38)
            int[] r0 = new int[]{r0, r1}
            com.google.crypto.tink.subtle.Field25519.MASK = r0
            r0 = 26
            r1 = 25
            int[] r0 = new int[]{r0, r1}
            com.google.crypto.tink.subtle.Field25519.SHIFT = r0
            return
    }

    private Field25519() {
            r0 = this;
            r0.<init>()
            return
    }

    static byte[] contract(long[] r15) {
            r0 = 10
            long[] r1 = java.util.Arrays.copyOf(r15, r0)
            r2 = 0
        L7:
            r3 = 25
            r4 = 31
            r5 = 2
            r6 = 9
            r7 = 0
            if (r2 >= r5) goto L5a
            r5 = 0
        L12:
            if (r5 >= r6) goto L3c
            r8 = r1[r5]
            r10 = r1[r5]
            long r10 = r10 >> r4
            long r8 = r8 & r10
            int[] r10 = com.google.crypto.tink.subtle.Field25519.SHIFT
            r11 = r5 & 1
            r10 = r10[r11]
            long r8 = r8 >> r10
            int r8 = (int) r8
            int r8 = -r8
            r9 = r1[r5]
            int[] r11 = com.google.crypto.tink.subtle.Field25519.SHIFT
            r12 = r5 & 1
            r11 = r11[r12]
            int r11 = r8 << r11
            long r11 = (long) r11
            long r9 = r9 + r11
            r1[r5] = r9
            int r9 = r5 + 1
            r10 = r1[r9]
            long r12 = (long) r8
            long r10 = r10 - r12
            r1[r9] = r10
            int r5 = r5 + 1
            goto L12
        L3c:
            r8 = r1[r6]
            r10 = r1[r6]
            long r4 = r10 >> r4
            long r4 = r4 & r8
            long r3 = r4 >> r3
            int r3 = (int) r3
            int r3 = -r3
            r4 = r1[r6]
            int r8 = r3 << 25
            long r8 = (long) r8
            long r4 = r4 + r8
            r1[r6] = r4
            r4 = r1[r7]
            int r6 = r3 * 19
            long r8 = (long) r6
            long r4 = r4 - r8
            r1[r7] = r4
            int r2 = r2 + 1
            goto L7
        L5a:
            r8 = r1[r7]
            r10 = r1[r7]
            long r10 = r10 >> r4
            long r8 = r8 & r10
            r2 = 26
            long r8 = r8 >> r2
            int r2 = (int) r8
            int r2 = -r2
            r8 = r1[r7]
            int r4 = r2 << 26
            long r10 = (long) r4
            long r8 = r8 + r10
            r1[r7] = r8
            r4 = 1
            r8 = r1[r4]
            long r10 = (long) r2
            long r8 = r8 - r10
            r1[r4] = r8
            r2 = 0
        L75:
            if (r2 >= r5) goto L9e
            r8 = 0
        L78:
            if (r8 >= r6) goto L9b
            r9 = r1[r8]
            int[] r11 = com.google.crypto.tink.subtle.Field25519.SHIFT
            r12 = r8 & 1
            r11 = r11[r12]
            long r9 = r9 >> r11
            int r9 = (int) r9
            r10 = r1[r8]
            int[] r12 = com.google.crypto.tink.subtle.Field25519.MASK
            r13 = r8 & 1
            r12 = r12[r13]
            long r12 = (long) r12
            long r10 = r10 & r12
            r1[r8] = r10
            int r10 = r8 + 1
            r11 = r1[r10]
            long r13 = (long) r9
            long r11 = r11 + r13
            r1[r10] = r11
            int r8 = r8 + 1
            goto L78
        L9b:
            int r2 = r2 + 1
            goto L75
        L9e:
            r8 = r1[r6]
            long r2 = r8 >> r3
            int r2 = (int) r2
            r8 = r1[r6]
            r10 = 33554431(0x1ffffff, double:1.65780916E-316)
            long r8 = r8 & r10
            r1[r6] = r8
            r8 = r1[r7]
            int r3 = r2 * 19
            long r10 = (long) r3
            long r8 = r8 + r10
            r1[r7] = r8
            r2 = r1[r7]
            int r2 = (int) r2
            r3 = 67108845(0x3ffffed, float:1.5046311E-36)
            int r2 = gte(r2, r3)
            r6 = 1
        Lbe:
            if (r6 >= r0) goto Ld1
            r8 = r1[r6]
            int r8 = (int) r8
            int[] r9 = com.google.crypto.tink.subtle.Field25519.MASK
            r10 = r6 & 1
            r9 = r9[r10]
            int r8 = eq(r8, r9)
            r2 = r2 & r8
            int r6 = r6 + 1
            goto Lbe
        Ld1:
            r8 = r1[r7]
            r3 = r3 & r2
            long r10 = (long) r3
            long r8 = r8 - r10
            r1[r7] = r8
            r6 = r1[r4]
            r3 = 33554431(0x1ffffff, float:9.403954E-38)
            r8 = r2 & r3
            long r8 = (long) r8
            long r6 = r6 - r8
            r1[r4] = r6
            r6 = 2
        Le4:
            if (r6 >= r0) goto Lfd
            r7 = r1[r6]
            r9 = 67108863(0x3ffffff, float:1.5046327E-36)
            r9 = r9 & r2
            long r9 = (long) r9
            long r7 = r7 - r9
            r1[r6] = r7
            int r7 = r6 + 1
            r8 = r1[r7]
            r10 = r2 & r3
            long r10 = (long) r10
            long r8 = r8 - r10
            r1[r7] = r8
            int r6 = r6 + 2
            goto Le4
        Lfd:
            r3 = 0
        Lfe:
            if (r3 >= r0) goto L10c
            r6 = r1[r3]
            int[] r8 = com.google.crypto.tink.subtle.Field25519.EXPAND_SHIFT
            r8 = r8[r3]
            long r6 = r6 << r8
            r1[r3] = r6
            int r3 = r3 + 1
            goto Lfe
        L10c:
            r3 = 32
            byte[] r3 = new byte[r3]
            r6 = 0
        L111:
            if (r6 >= r0) goto L161
            int[] r7 = com.google.crypto.tink.subtle.Field25519.EXPAND_START
            r7 = r7[r6]
            r8 = r3[r7]
            long r8 = (long) r8
            r10 = r1[r6]
            r12 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r12
            long r8 = r8 | r10
            int r8 = (int) r8
            byte r8 = (byte) r8
            r3[r7] = r8
            int[] r7 = com.google.crypto.tink.subtle.Field25519.EXPAND_START
            r7 = r7[r6]
            int r7 = r7 + r4
            r8 = r3[r7]
            long r8 = (long) r8
            r10 = r1[r6]
            r14 = 8
            long r10 = r10 >> r14
            long r10 = r10 & r12
            long r8 = r8 | r10
            int r8 = (int) r8
            byte r8 = (byte) r8
            r3[r7] = r8
            int[] r7 = com.google.crypto.tink.subtle.Field25519.EXPAND_START
            r7 = r7[r6]
            int r7 = r7 + r5
            r8 = r3[r7]
            long r8 = (long) r8
            r10 = r1[r6]
            r14 = 16
            long r10 = r10 >> r14
            long r10 = r10 & r12
            long r8 = r8 | r10
            int r8 = (int) r8
            byte r8 = (byte) r8
            r3[r7] = r8
            int[] r7 = com.google.crypto.tink.subtle.Field25519.EXPAND_START
            r7 = r7[r6]
            int r7 = r7 + 3
            r8 = r3[r7]
            long r8 = (long) r8
            r10 = r1[r6]
            r14 = 24
            long r10 = r10 >> r14
            long r10 = r10 & r12
            long r8 = r8 | r10
            int r8 = (int) r8
            byte r8 = (byte) r8
            r3[r7] = r8
            int r6 = r6 + 1
            goto L111
        L161:
            return r3
    }

    private static int eq(int r1, int r2) {
            r0 = r1 ^ r2
            int r1 = ~r0
            int r0 = r1 << 16
            r1 = r1 & r0
            int r0 = r1 << 8
            r1 = r1 & r0
            int r0 = r1 << 4
            r1 = r1 & r0
            int r0 = r1 << 2
            r1 = r1 & r0
            int r0 = r1 << 1
            r1 = r1 & r0
            int r0 = r1 >> 31
            return r0
    }

    static long[] expand(byte[] r8) {
            r0 = 10
            long[] r1 = new long[r0]
            r2 = 0
        L5:
            if (r2 >= r0) goto L4f
            int[] r3 = com.google.crypto.tink.subtle.Field25519.EXPAND_START
            r3 = r3[r2]
            r3 = r8[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            int[] r5 = com.google.crypto.tink.subtle.Field25519.EXPAND_START
            r5 = r5[r2]
            int r5 = r5 + 1
            r5 = r8[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            r7 = 8
            long r5 = r5 << r7
            long r3 = r3 | r5
            int[] r5 = com.google.crypto.tink.subtle.Field25519.EXPAND_START
            r5 = r5[r2]
            int r5 = r5 + 2
            r5 = r8[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            r7 = 16
            long r5 = r5 << r7
            long r3 = r3 | r5
            int[] r5 = com.google.crypto.tink.subtle.Field25519.EXPAND_START
            r5 = r5[r2]
            int r5 = r5 + 3
            r5 = r8[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            r7 = 24
            long r5 = r5 << r7
            long r3 = r3 | r5
            int[] r5 = com.google.crypto.tink.subtle.Field25519.EXPAND_SHIFT
            r5 = r5[r2]
            long r3 = r3 >> r5
            int[] r5 = com.google.crypto.tink.subtle.Field25519.MASK
            r6 = r2 & 1
            r5 = r5[r6]
            long r5 = (long) r5
            long r3 = r3 & r5
            r1[r2] = r3
            int r2 = r2 + 1
            goto L5
        L4f:
            return r1
    }

    private static int gte(int r1, int r2) {
            int r1 = r1 - r2
            int r0 = r1 >> 31
            int r0 = ~r0
            return r0
    }

    static void inverse(long[] r13, long[] r14) {
            r0 = 10
            long[] r1 = new long[r0]
            long[] r2 = new long[r0]
            long[] r3 = new long[r0]
            long[] r4 = new long[r0]
            long[] r5 = new long[r0]
            long[] r6 = new long[r0]
            long[] r7 = new long[r0]
            long[] r8 = new long[r0]
            long[] r9 = new long[r0]
            long[] r10 = new long[r0]
            square(r1, r14)
            square(r10, r1)
            square(r9, r10)
            mult(r2, r9, r14)
            mult(r3, r2, r1)
            square(r9, r3)
            mult(r4, r9, r2)
            square(r9, r4)
            square(r10, r9)
            square(r9, r10)
            square(r10, r9)
            square(r9, r10)
            mult(r5, r9, r4)
            square(r9, r5)
            square(r10, r9)
            r11 = 2
        L44:
            if (r11 >= r0) goto L4f
            square(r9, r10)
            square(r10, r9)
            int r11 = r11 + 2
            goto L44
        L4f:
            mult(r6, r10, r5)
            square(r9, r6)
            square(r10, r9)
            r11 = 2
        L59:
            r12 = 20
            if (r11 >= r12) goto L66
            square(r9, r10)
            square(r10, r9)
            int r11 = r11 + 2
            goto L59
        L66:
            mult(r9, r10, r6)
            square(r10, r9)
            square(r9, r10)
            r11 = 2
        L70:
            if (r11 >= r0) goto L7b
            square(r10, r9)
            square(r9, r10)
            int r11 = r11 + 2
            goto L70
        L7b:
            mult(r7, r9, r5)
            square(r9, r7)
            square(r10, r9)
            r0 = 2
        L85:
            r11 = 50
            if (r0 >= r11) goto L92
            square(r9, r10)
            square(r10, r9)
            int r0 = r0 + 2
            goto L85
        L92:
            mult(r8, r10, r7)
            square(r10, r8)
            square(r9, r10)
            r0 = 2
        L9c:
            r12 = 100
            if (r0 >= r12) goto La9
            square(r10, r9)
            square(r9, r10)
            int r0 = r0 + 2
            goto L9c
        La9:
            mult(r10, r9, r8)
            square(r9, r10)
            square(r10, r9)
            r0 = 2
        Lb3:
            if (r0 >= r11) goto Lbe
            square(r9, r10)
            square(r10, r9)
            int r0 = r0 + 2
            goto Lb3
        Lbe:
            mult(r9, r10, r7)
            square(r10, r9)
            square(r9, r10)
            square(r10, r9)
            square(r9, r10)
            square(r10, r9)
            mult(r13, r10, r3)
            return
    }

    static void mult(long[] r1, long[] r2, long[] r3) {
            r0 = 19
            long[] r0 = new long[r0]
            product(r0, r2, r3)
            reduce(r0, r1)
            return
    }

    static void product(long[] r18, long[] r19, long[] r20) {
            r0 = 0
            r1 = r19[r0]
            r3 = r20[r0]
            long r1 = r1 * r3
            r18[r0] = r1
            r1 = r19[r0]
            r3 = 1
            r4 = r20[r3]
            long r1 = r1 * r4
            r4 = r19[r3]
            r6 = r20[r0]
            long r4 = r4 * r6
            long r1 = r1 + r4
            r18[r3] = r1
            r1 = r19[r3]
            r4 = 2
            long r1 = r1 * r4
            r6 = r20[r3]
            long r1 = r1 * r6
            r6 = r19[r0]
            r8 = 2
            r9 = r20[r8]
            long r6 = r6 * r9
            long r1 = r1 + r6
            r6 = r19[r8]
            r9 = r20[r0]
            long r6 = r6 * r9
            long r1 = r1 + r6
            r18[r8] = r1
            r1 = r19[r3]
            r6 = r20[r8]
            long r1 = r1 * r6
            r6 = r19[r8]
            r9 = r20[r3]
            long r6 = r6 * r9
            long r1 = r1 + r6
            r6 = r19[r0]
            r9 = 3
            r10 = r20[r9]
            long r6 = r6 * r10
            long r1 = r1 + r6
            r6 = r19[r9]
            r10 = r20[r0]
            long r6 = r6 * r10
            long r1 = r1 + r6
            r18[r9] = r1
            r1 = r19[r8]
            r6 = r20[r8]
            long r1 = r1 * r6
            r6 = r19[r3]
            r10 = r20[r9]
            long r6 = r6 * r10
            r10 = r19[r9]
            r12 = r20[r3]
            long r10 = r10 * r12
            long r6 = r6 + r10
            long r6 = r6 * r4
            long r1 = r1 + r6
            r6 = r19[r0]
            r10 = 4
            r11 = r20[r10]
            long r6 = r6 * r11
            long r1 = r1 + r6
            r6 = r19[r10]
            r11 = r20[r0]
            long r6 = r6 * r11
            long r1 = r1 + r6
            r18[r10] = r1
            r1 = r19[r8]
            r6 = r20[r9]
            long r1 = r1 * r6
            r6 = r19[r9]
            r11 = r20[r8]
            long r6 = r6 * r11
            long r1 = r1 + r6
            r6 = r19[r3]
            r11 = r20[r10]
            long r6 = r6 * r11
            long r1 = r1 + r6
            r6 = r19[r10]
            r11 = r20[r3]
            long r6 = r6 * r11
            long r1 = r1 + r6
            r6 = r19[r0]
            r11 = 5
            r12 = r20[r11]
            long r6 = r6 * r12
            long r1 = r1 + r6
            r6 = r19[r11]
            r12 = r20[r0]
            long r6 = r6 * r12
            long r1 = r1 + r6
            r18[r11] = r1
            r1 = r19[r9]
            r6 = r20[r9]
            long r1 = r1 * r6
            r6 = r19[r3]
            r12 = r20[r11]
            long r6 = r6 * r12
            long r1 = r1 + r6
            r6 = r19[r11]
            r12 = r20[r3]
            long r6 = r6 * r12
            long r1 = r1 + r6
            long r1 = r1 * r4
            r6 = r19[r8]
            r12 = r20[r10]
            long r6 = r6 * r12
            long r1 = r1 + r6
            r6 = r19[r10]
            r12 = r20[r8]
            long r6 = r6 * r12
            long r1 = r1 + r6
            r6 = r19[r0]
            r12 = 6
            r13 = r20[r12]
            long r6 = r6 * r13
            long r1 = r1 + r6
            r6 = r19[r12]
            r13 = r20[r0]
            long r6 = r6 * r13
            long r1 = r1 + r6
            r18[r12] = r1
            r1 = r19[r9]
            r6 = r20[r10]
            long r1 = r1 * r6
            r6 = r19[r10]
            r13 = r20[r9]
            long r6 = r6 * r13
            long r1 = r1 + r6
            r6 = r19[r8]
            r13 = r20[r11]
            long r6 = r6 * r13
            long r1 = r1 + r6
            r6 = r19[r11]
            r13 = r20[r8]
            long r6 = r6 * r13
            long r1 = r1 + r6
            r6 = r19[r3]
            r13 = r20[r12]
            long r6 = r6 * r13
            long r1 = r1 + r6
            r6 = r19[r12]
            r13 = r20[r3]
            long r6 = r6 * r13
            long r1 = r1 + r6
            r6 = r19[r0]
            r13 = 7
            r14 = r20[r13]
            long r6 = r6 * r14
            long r1 = r1 + r6
            r6 = r19[r13]
            r14 = r20[r0]
            long r6 = r6 * r14
            long r1 = r1 + r6
            r18[r13] = r1
            r1 = r19[r10]
            r6 = r20[r10]
            long r1 = r1 * r6
            r6 = r19[r9]
            r14 = r20[r11]
            long r6 = r6 * r14
            r14 = r19[r11]
            r16 = r20[r9]
            long r14 = r14 * r16
            long r6 = r6 + r14
            r14 = r19[r3]
            r16 = r20[r13]
            long r14 = r14 * r16
            long r6 = r6 + r14
            r14 = r19[r13]
            r16 = r20[r3]
            long r14 = r14 * r16
            long r6 = r6 + r14
            long r6 = r6 * r4
            long r1 = r1 + r6
            r6 = r19[r8]
            r14 = r20[r12]
            long r6 = r6 * r14
            long r1 = r1 + r6
            r6 = r19[r12]
            r14 = r20[r8]
            long r6 = r6 * r14
            long r1 = r1 + r6
            r6 = r19[r0]
            r14 = 8
            r15 = r20[r14]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r19[r14]
            r15 = r20[r0]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r18[r14] = r1
            r1 = r19[r10]
            r6 = r20[r11]
            long r1 = r1 * r6
            r6 = r19[r11]
            r15 = r20[r10]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r19[r9]
            r15 = r20[r12]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r19[r12]
            r15 = r20[r9]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r19[r8]
            r15 = r20[r13]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r19[r13]
            r15 = r20[r8]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r19[r3]
            r15 = r20[r14]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r19[r14]
            r15 = r20[r3]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r19[r0]
            r15 = 9
            r16 = r20[r15]
            long r6 = r6 * r16
            long r1 = r1 + r6
            r6 = r19[r15]
            r16 = r20[r0]
            long r6 = r6 * r16
            long r1 = r1 + r6
            r18[r15] = r1
            r0 = r19[r11]
            r6 = r20[r11]
            long r0 = r0 * r6
            r6 = r19[r9]
            r16 = r20[r13]
            long r6 = r6 * r16
            long r0 = r0 + r6
            r6 = r19[r13]
            r16 = r20[r9]
            long r6 = r6 * r16
            long r0 = r0 + r6
            r6 = r19[r3]
            r16 = r20[r15]
            long r6 = r6 * r16
            long r0 = r0 + r6
            r6 = r19[r15]
            r2 = r20[r3]
            long r6 = r6 * r2
            long r0 = r0 + r6
            long r0 = r0 * r4
            r2 = r19[r10]
            r6 = r20[r12]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r12]
            r6 = r20[r10]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r8]
            r6 = r20[r14]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r14]
            r6 = r20[r8]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = 10
            r18[r2] = r0
            r0 = r19[r11]
            r2 = r20[r12]
            long r0 = r0 * r2
            r2 = r19[r12]
            r6 = r20[r11]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r10]
            r6 = r20[r13]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r13]
            r6 = r20[r10]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r9]
            r6 = r20[r14]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r14]
            r6 = r20[r9]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r8]
            r6 = r20[r15]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r15]
            r6 = r20[r8]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = 11
            r18[r2] = r0
            r0 = r19[r12]
            r2 = r20[r12]
            long r0 = r0 * r2
            r2 = r19[r11]
            r6 = r20[r13]
            long r2 = r2 * r6
            r6 = r19[r13]
            r16 = r20[r11]
            long r6 = r6 * r16
            long r2 = r2 + r6
            r6 = r19[r9]
            r16 = r20[r15]
            long r6 = r6 * r16
            long r2 = r2 + r6
            r6 = r19[r15]
            r8 = r20[r9]
            long r6 = r6 * r8
            long r2 = r2 + r6
            long r2 = r2 * r4
            long r0 = r0 + r2
            r2 = r19[r10]
            r6 = r20[r14]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r14]
            r6 = r20[r10]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = 12
            r18[r2] = r0
            r0 = r19[r12]
            r2 = r20[r13]
            long r0 = r0 * r2
            r2 = r19[r13]
            r6 = r20[r12]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r11]
            r6 = r20[r14]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r14]
            r6 = r20[r11]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r10]
            r6 = r20[r15]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r15]
            r6 = r20[r10]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = 13
            r18[r2] = r0
            r0 = r19[r13]
            r2 = r20[r13]
            long r0 = r0 * r2
            r2 = r19[r11]
            r6 = r20[r15]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r15]
            r6 = r20[r11]
            long r2 = r2 * r6
            long r0 = r0 + r2
            long r0 = r0 * r4
            r2 = r19[r12]
            r6 = r20[r14]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r14]
            r6 = r20[r12]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = 14
            r18[r2] = r0
            r0 = r19[r13]
            r2 = r20[r14]
            long r0 = r0 * r2
            r2 = r19[r14]
            r6 = r20[r13]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r12]
            r6 = r20[r15]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r15]
            r6 = r20[r12]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = 15
            r18[r2] = r0
            r0 = r19[r14]
            r2 = r20[r14]
            long r0 = r0 * r2
            r2 = r19[r13]
            r6 = r20[r15]
            long r2 = r2 * r6
            r6 = r19[r15]
            r8 = r20[r13]
            long r6 = r6 * r8
            long r2 = r2 + r6
            long r2 = r2 * r4
            long r0 = r0 + r2
            r2 = 16
            r18[r2] = r0
            r0 = r19[r14]
            r2 = r20[r15]
            long r0 = r0 * r2
            r2 = r19[r15]
            r6 = r20[r14]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = 17
            r18[r2] = r0
            r0 = r19[r15]
            long r0 = r0 * r4
            r2 = r20[r15]
            long r0 = r0 * r2
            r2 = 18
            r18[r2] = r0
            return
    }

    static void reduce(long[] r3, long[] r4) {
            int r0 = r3.length
            r1 = 0
            r2 = 19
            if (r0 != r2) goto L8
            r0 = r3
            goto Le
        L8:
            long[] r0 = new long[r2]
            int r2 = r3.length
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        Le:
            reduceSizeByModularReduction(r0)
            reduceCoefficients(r0)
            r2 = 10
            java.lang.System.arraycopy(r0, r1, r4, r1, r2)
            return
    }

    static void reduceCoefficients(long[] r12) {
            r0 = 10
            r1 = 0
            r12[r0] = r1
            r3 = 0
        L7:
            r4 = 26
            r5 = 67108864(0x4000000, double:3.3156184E-316)
            if (r3 >= r0) goto L3c
            r7 = r12[r3]
            long r7 = r7 / r5
            r5 = r12[r3]
            long r9 = r7 << r4
            long r5 = r5 - r9
            r12[r3] = r5
            int r4 = r3 + 1
            r5 = r12[r4]
            long r5 = r5 + r7
            r12[r4] = r5
            int r4 = r3 + 1
            r4 = r12[r4]
            r9 = 33554432(0x2000000, double:1.6578092E-316)
            long r4 = r4 / r9
            int r6 = r3 + 1
            r7 = r12[r6]
            r9 = 25
            long r9 = r4 << r9
            long r7 = r7 - r9
            r12[r6] = r7
            int r6 = r3 + 2
            r7 = r12[r6]
            long r7 = r7 + r4
            r12[r6] = r7
            int r3 = r3 + 2
            goto L7
        L3c:
            r3 = 0
            r7 = r12[r3]
            r9 = r12[r0]
            r11 = 4
            long r9 = r9 << r11
            long r7 = r7 + r9
            r12[r3] = r7
            r7 = r12[r3]
            r9 = r12[r0]
            r11 = 1
            long r9 = r9 << r11
            long r7 = r7 + r9
            r12[r3] = r7
            r7 = r12[r3]
            r9 = r12[r0]
            long r7 = r7 + r9
            r12[r3] = r7
            r12[r0] = r1
            r0 = r12[r3]
            long r0 = r0 / r5
            r5 = r12[r3]
            long r7 = r0 << r4
            long r5 = r5 - r7
            r12[r3] = r5
            r2 = r12[r11]
            long r2 = r2 + r0
            r12[r11] = r2
            return
    }

    static void reduceSizeByModularReduction(long[] r8) {
            r0 = 8
            r1 = r8[r0]
            r3 = 18
            r4 = r8[r3]
            r6 = 4
            long r4 = r4 << r6
            long r1 = r1 + r4
            r8[r0] = r1
            r1 = r8[r0]
            r4 = r8[r3]
            r7 = 1
            long r4 = r4 << r7
            long r1 = r1 + r4
            r8[r0] = r1
            r1 = r8[r0]
            r3 = r8[r3]
            long r1 = r1 + r3
            r8[r0] = r1
            r0 = 7
            r1 = r8[r0]
            r3 = 17
            r4 = r8[r3]
            long r4 = r4 << r6
            long r1 = r1 + r4
            r8[r0] = r1
            r1 = r8[r0]
            r4 = r8[r3]
            long r4 = r4 << r7
            long r1 = r1 + r4
            r8[r0] = r1
            r1 = r8[r0]
            r3 = r8[r3]
            long r1 = r1 + r3
            r8[r0] = r1
            r0 = 6
            r1 = r8[r0]
            r3 = 16
            r4 = r8[r3]
            long r4 = r4 << r6
            long r1 = r1 + r4
            r8[r0] = r1
            r1 = r8[r0]
            r4 = r8[r3]
            long r4 = r4 << r7
            long r1 = r1 + r4
            r8[r0] = r1
            r1 = r8[r0]
            r3 = r8[r3]
            long r1 = r1 + r3
            r8[r0] = r1
            r0 = 5
            r1 = r8[r0]
            r3 = 15
            r4 = r8[r3]
            long r4 = r4 << r6
            long r1 = r1 + r4
            r8[r0] = r1
            r1 = r8[r0]
            r4 = r8[r3]
            long r4 = r4 << r7
            long r1 = r1 + r4
            r8[r0] = r1
            r1 = r8[r0]
            r3 = r8[r3]
            long r1 = r1 + r3
            r8[r0] = r1
            r0 = r8[r6]
            r2 = 14
            r3 = r8[r2]
            long r3 = r3 << r6
            long r0 = r0 + r3
            r8[r6] = r0
            r0 = r8[r6]
            r3 = r8[r2]
            long r3 = r3 << r7
            long r0 = r0 + r3
            r8[r6] = r0
            r0 = r8[r6]
            r2 = r8[r2]
            long r0 = r0 + r2
            r8[r6] = r0
            r0 = 3
            r1 = r8[r0]
            r3 = 13
            r4 = r8[r3]
            long r4 = r4 << r6
            long r1 = r1 + r4
            r8[r0] = r1
            r1 = r8[r0]
            r4 = r8[r3]
            long r4 = r4 << r7
            long r1 = r1 + r4
            r8[r0] = r1
            r1 = r8[r0]
            r3 = r8[r3]
            long r1 = r1 + r3
            r8[r0] = r1
            r0 = 2
            r1 = r8[r0]
            r3 = 12
            r4 = r8[r3]
            long r4 = r4 << r6
            long r1 = r1 + r4
            r8[r0] = r1
            r1 = r8[r0]
            r4 = r8[r3]
            long r4 = r4 << r7
            long r1 = r1 + r4
            r8[r0] = r1
            r1 = r8[r0]
            r3 = r8[r3]
            long r1 = r1 + r3
            r8[r0] = r1
            r0 = r8[r7]
            r2 = 11
            r3 = r8[r2]
            long r3 = r3 << r6
            long r0 = r0 + r3
            r8[r7] = r0
            r0 = r8[r7]
            r3 = r8[r2]
            long r3 = r3 << r7
            long r0 = r0 + r3
            r8[r7] = r0
            r0 = r8[r7]
            r2 = r8[r2]
            long r0 = r0 + r2
            r8[r7] = r0
            r0 = 0
            r1 = r8[r0]
            r3 = 10
            r4 = r8[r3]
            long r4 = r4 << r6
            long r1 = r1 + r4
            r8[r0] = r1
            r1 = r8[r0]
            r4 = r8[r3]
            long r4 = r4 << r7
            long r1 = r1 + r4
            r8[r0] = r1
            r1 = r8[r0]
            r3 = r8[r3]
            long r1 = r1 + r3
            r8[r0] = r1
            return
    }

    static void scalarProduct(long[] r3, long[] r4, long r5) {
            r0 = 0
        L1:
            r1 = 10
            if (r0 >= r1) goto Ld
            r1 = r4[r0]
            long r1 = r1 * r5
            r3[r0] = r1
            int r0 = r0 + 1
            goto L1
        Ld:
            return
    }

    static void square(long[] r1, long[] r2) {
            r0 = 19
            long[] r0 = new long[r0]
            squareInner(r0, r2)
            reduce(r0, r1)
            return
    }

    private static void squareInner(long[] r23, long[] r24) {
            r0 = 0
            r1 = r24[r0]
            r3 = r24[r0]
            long r1 = r1 * r3
            r23[r0] = r1
            r1 = r24[r0]
            r3 = 2
            long r1 = r1 * r3
            r5 = 1
            r6 = r24[r5]
            long r1 = r1 * r6
            r23[r5] = r1
            r1 = r24[r5]
            r6 = r24[r5]
            long r1 = r1 * r6
            r6 = r24[r0]
            r8 = 2
            r9 = r24[r8]
            long r6 = r6 * r9
            long r1 = r1 + r6
            long r1 = r1 * r3
            r23[r8] = r1
            r1 = r24[r5]
            r6 = r24[r8]
            long r1 = r1 * r6
            r6 = r24[r0]
            r9 = 3
            r10 = r24[r9]
            long r6 = r6 * r10
            long r1 = r1 + r6
            long r1 = r1 * r3
            r23[r9] = r1
            r1 = r24[r8]
            r6 = r24[r8]
            long r1 = r1 * r6
            r6 = r24[r5]
            r10 = 4
            long r6 = r6 * r10
            r12 = r24[r9]
            long r6 = r6 * r12
            long r1 = r1 + r6
            r6 = r24[r0]
            long r6 = r6 * r3
            r12 = 4
            r13 = r24[r12]
            long r6 = r6 * r13
            long r1 = r1 + r6
            r23[r12] = r1
            r1 = r24[r8]
            r6 = r24[r9]
            long r1 = r1 * r6
            r6 = r24[r5]
            r13 = r24[r12]
            long r6 = r6 * r13
            long r1 = r1 + r6
            r6 = r24[r0]
            r13 = 5
            r14 = r24[r13]
            long r6 = r6 * r14
            long r1 = r1 + r6
            long r1 = r1 * r3
            r23[r13] = r1
            r1 = r24[r9]
            r6 = r24[r9]
            long r1 = r1 * r6
            r6 = r24[r8]
            r14 = r24[r12]
            long r6 = r6 * r14
            long r1 = r1 + r6
            r6 = r24[r0]
            r14 = 6
            r15 = r24[r14]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r24[r5]
            long r6 = r6 * r3
            r15 = r24[r13]
            long r6 = r6 * r15
            long r1 = r1 + r6
            long r1 = r1 * r3
            r23[r14] = r1
            r1 = r24[r9]
            r6 = r24[r12]
            long r1 = r1 * r6
            r6 = r24[r8]
            r15 = r24[r13]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r24[r5]
            r15 = r24[r14]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r24[r0]
            r15 = 7
            r16 = r24[r15]
            long r6 = r6 * r16
            long r1 = r1 + r6
            long r1 = r1 * r3
            r23[r15] = r1
            r1 = r24[r12]
            r6 = r24[r12]
            long r1 = r1 * r6
            r6 = r24[r8]
            r16 = r24[r14]
            long r6 = r6 * r16
            r16 = r24[r0]
            r18 = 8
            r19 = r24[r18]
            long r16 = r16 * r19
            long r6 = r6 + r16
            r16 = r24[r5]
            r19 = r24[r15]
            long r16 = r16 * r19
            r19 = r24[r9]
            r21 = r24[r13]
            long r19 = r19 * r21
            long r16 = r16 + r19
            long r16 = r16 * r3
            long r6 = r6 + r16
            long r6 = r6 * r3
            long r1 = r1 + r6
            r23[r18] = r1
            r1 = r24[r12]
            r6 = r24[r13]
            long r1 = r1 * r6
            r6 = r24[r9]
            r16 = r24[r14]
            long r6 = r6 * r16
            long r1 = r1 + r6
            r6 = r24[r8]
            r16 = r24[r15]
            long r6 = r6 * r16
            long r1 = r1 + r6
            r6 = r24[r5]
            r16 = r24[r18]
            long r6 = r6 * r16
            long r1 = r1 + r6
            r6 = r24[r0]
            r0 = 9
            r16 = r24[r0]
            long r6 = r6 * r16
            long r1 = r1 + r6
            long r1 = r1 * r3
            r23[r0] = r1
            r1 = r24[r13]
            r6 = r24[r13]
            long r1 = r1 * r6
            r6 = r24[r12]
            r16 = r24[r14]
            long r6 = r6 * r16
            long r1 = r1 + r6
            r6 = r24[r8]
            r16 = r24[r18]
            long r6 = r6 * r16
            long r1 = r1 + r6
            r6 = r24[r9]
            r16 = r24[r15]
            long r6 = r6 * r16
            r16 = r24[r5]
            r19 = r24[r0]
            long r16 = r16 * r19
            long r6 = r6 + r16
            long r6 = r6 * r3
            long r1 = r1 + r6
            long r1 = r1 * r3
            r5 = 10
            r23[r5] = r1
            r1 = r24[r13]
            r5 = r24[r14]
            long r1 = r1 * r5
            r5 = r24[r12]
            r16 = r24[r15]
            long r5 = r5 * r16
            long r1 = r1 + r5
            r5 = r24[r9]
            r16 = r24[r18]
            long r5 = r5 * r16
            long r1 = r1 + r5
            r5 = r24[r8]
            r7 = r24[r0]
            long r5 = r5 * r7
            long r1 = r1 + r5
            long r1 = r1 * r3
            r5 = 11
            r23[r5] = r1
            r1 = r24[r14]
            r5 = r24[r14]
            long r1 = r1 * r5
            r5 = r24[r12]
            r7 = r24[r18]
            long r5 = r5 * r7
            r7 = r24[r13]
            r16 = r24[r15]
            long r7 = r7 * r16
            r16 = r24[r9]
            r19 = r24[r0]
            long r16 = r16 * r19
            long r7 = r7 + r16
            long r7 = r7 * r3
            long r5 = r5 + r7
            long r5 = r5 * r3
            long r1 = r1 + r5
            r5 = 12
            r23[r5] = r1
            r1 = r24[r14]
            r5 = r24[r15]
            long r1 = r1 * r5
            r5 = r24[r13]
            r7 = r24[r18]
            long r5 = r5 * r7
            long r1 = r1 + r5
            r5 = r24[r12]
            r7 = r24[r0]
            long r5 = r5 * r7
            long r1 = r1 + r5
            long r1 = r1 * r3
            r5 = 13
            r23[r5] = r1
            r1 = r24[r15]
            r5 = r24[r15]
            long r1 = r1 * r5
            r5 = r24[r14]
            r7 = r24[r18]
            long r5 = r5 * r7
            long r1 = r1 + r5
            r5 = r24[r13]
            long r5 = r5 * r3
            r7 = r24[r0]
            long r5 = r5 * r7
            long r1 = r1 + r5
            long r1 = r1 * r3
            r5 = 14
            r23[r5] = r1
            r1 = r24[r15]
            r5 = r24[r18]
            long r1 = r1 * r5
            r5 = r24[r14]
            r7 = r24[r0]
            long r5 = r5 * r7
            long r1 = r1 + r5
            long r1 = r1 * r3
            r5 = 15
            r23[r5] = r1
            r1 = r24[r18]
            r5 = r24[r18]
            long r1 = r1 * r5
            r5 = r24[r15]
            long r5 = r5 * r10
            r7 = r24[r0]
            long r5 = r5 * r7
            long r1 = r1 + r5
            r5 = 16
            r23[r5] = r1
            r1 = r24[r18]
            long r1 = r1 * r3
            r5 = r24[r0]
            long r1 = r1 * r5
            r5 = 17
            r23[r5] = r1
            r1 = r24[r0]
            long r1 = r1 * r3
            r3 = r24[r0]
            long r1 = r1 * r3
            r0 = 18
            r23[r0] = r1
            return
    }

    static void sub(long[] r0, long[] r1) {
            sub(r0, r1, r0)
            return
    }

    static void sub(long[] r5, long[] r6, long[] r7) {
            r0 = 0
        L1:
            r1 = 10
            if (r0 >= r1) goto Lf
            r1 = r6[r0]
            r3 = r7[r0]
            long r1 = r1 - r3
            r5[r0] = r1
            int r0 = r0 + 1
            goto L1
        Lf:
            return
    }

    static void sum(long[] r0, long[] r1) {
            sum(r0, r0, r1)
            return
    }

    static void sum(long[] r5, long[] r6, long[] r7) {
            r0 = 0
        L1:
            r1 = 10
            if (r0 >= r1) goto Lf
            r1 = r6[r0]
            r3 = r7[r0]
            long r1 = r1 + r3
            r5[r0] = r1
            int r0 = r0 + 1
            goto L1
        Lf:
            return
    }
}
