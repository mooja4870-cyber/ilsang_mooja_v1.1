package com.google.crypto.tink.aead.internal;

/* JADX INFO: loaded from: classes.dex */
public class Poly1305 {
    public static final int MAC_KEY_SIZE_IN_BYTES = 32;
    public static final int MAC_TAG_SIZE_IN_BYTES = 16;

    private Poly1305() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] computeMac(byte[] r61, byte[] r62) {
            r0 = r61
            r1 = r62
            int r2 = r0.length
            r3 = 32
            if (r2 != r3) goto L1fa
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r2 = 0
            long r14 = load26(r0, r2, r2)
            r16 = 67108863(0x3ffffff, double:3.31561837E-316)
            long r14 = r14 & r16
            r18 = r3
            r3 = 3
            r2 = 2
            long r19 = load26(r0, r3, r2)
            r21 = 67108611(0x3ffff03, double:3.3156059E-316)
            long r19 = r19 & r21
            r2 = 6
            r3 = 4
            long r23 = load26(r0, r2, r3)
            r25 = 67092735(0x3ffc0ff, double:3.31482154E-316)
            long r23 = r23 & r25
            r3 = 9
            long r26 = load26(r0, r3, r2)
            r28 = 66076671(0x3f03fff, double:3.2646213E-316)
            long r26 = r26 & r28
            r3 = 12
            r2 = 8
            long r30 = load26(r0, r3, r2)
            r32 = 1048575(0xfffff, double:5.18065E-318)
            long r30 = r30 & r32
            r32 = 5
            long r34 = r19 * r32
            long r36 = r23 * r32
            long r38 = r26 * r32
            long r40 = r30 * r32
            r2 = 17
            byte[] r2 = new byte[r2]
            r43 = 0
            r3 = r43
        L5f:
            r44 = r4
            int r4 = r1.length
            r46 = 24
            r47 = 26
            if (r3 >= r4) goto L122
            copyBlockSize(r2, r1, r3)
            r4 = 0
            long r48 = load26(r2, r4, r4)
            long r44 = r44 + r48
            r4 = 2
            r5 = 3
            r21 = 16
            long r48 = load26(r2, r5, r4)
            long r6 = r6 + r48
            r4 = 4
            r5 = 6
            long r49 = load26(r2, r5, r4)
            long r8 = r8 + r49
            r4 = 9
            long r49 = load26(r2, r4, r5)
            long r10 = r10 + r49
            r4 = 12
            r5 = 8
            long r49 = load26(r2, r4, r5)
            r4 = r2[r21]
            int r4 = r4 << 24
            long r4 = (long) r4
            long r4 = r49 | r4
            long r12 = r12 + r4
            long r4 = r44 * r14
            long r49 = r6 * r40
            long r4 = r4 + r49
            long r49 = r8 * r38
            long r4 = r4 + r49
            long r49 = r10 * r36
            long r4 = r4 + r49
            long r49 = r12 * r34
            long r4 = r4 + r49
            long r49 = r44 * r19
            long r51 = r6 * r14
            long r49 = r49 + r51
            long r51 = r8 * r40
            long r49 = r49 + r51
            long r51 = r10 * r38
            long r49 = r49 + r51
            long r51 = r12 * r36
            long r49 = r49 + r51
            long r51 = r44 * r23
            long r53 = r6 * r19
            long r51 = r51 + r53
            long r53 = r8 * r14
            long r51 = r51 + r53
            long r53 = r10 * r40
            long r51 = r51 + r53
            long r53 = r12 * r38
            long r51 = r51 + r53
            long r53 = r44 * r26
            long r55 = r6 * r23
            long r53 = r53 + r55
            long r55 = r8 * r19
            long r53 = r53 + r55
            long r55 = r10 * r14
            long r53 = r53 + r55
            long r55 = r12 * r40
            long r53 = r53 + r55
            long r55 = r44 * r30
            long r57 = r6 * r26
            long r55 = r55 + r57
            long r57 = r8 * r23
            long r55 = r55 + r57
            long r57 = r10 * r19
            long r55 = r55 + r57
            long r57 = r12 * r14
            long r55 = r55 + r57
            long r57 = r4 >> r47
            long r44 = r4 & r16
            long r49 = r49 + r57
            long r57 = r49 >> r47
            long r6 = r49 & r16
            long r51 = r51 + r57
            long r57 = r51 >> r47
            long r8 = r51 & r16
            long r53 = r53 + r57
            long r57 = r53 >> r47
            long r10 = r53 & r16
            long r55 = r55 + r57
            long r57 = r55 >> r47
            long r12 = r55 & r16
            long r59 = r57 * r32
            long r44 = r44 + r59
            long r46 = r44 >> r47
            long r44 = r44 & r16
            long r6 = r6 + r46
            int r3 = r3 + 16
            r4 = r44
            goto L5f
        L122:
            r21 = 16
            long r3 = r6 >> r47
            long r5 = r6 & r16
            long r8 = r8 + r3
            long r3 = r8 >> r47
            long r7 = r8 & r16
            long r10 = r10 + r3
            long r3 = r10 >> r47
            long r9 = r10 & r16
            long r12 = r12 + r3
            long r3 = r12 >> r47
            long r11 = r12 & r16
            long r48 = r3 * r32
            long r44 = r44 + r48
            long r3 = r44 >> r47
            long r44 = r44 & r16
            long r5 = r5 + r3
            long r32 = r44 + r32
            long r3 = r32 >> r47
            long r32 = r32 & r16
            long r48 = r5 + r3
            long r3 = r48 >> r47
            long r48 = r48 & r16
            long r50 = r7 + r3
            long r3 = r50 >> r47
            long r50 = r50 & r16
            long r52 = r9 + r3
            long r3 = r52 >> r47
            long r16 = r52 & r16
            long r52 = r11 + r3
            r54 = 67108864(0x4000000, double:3.3156184E-316)
            long r52 = r52 - r54
            r13 = 63
            r22 = r2
            long r1 = r52 >> r13
            long r44 = r44 & r1
            long r5 = r5 & r1
            long r7 = r7 & r1
            long r9 = r9 & r1
            long r11 = r11 & r1
            long r1 = ~r1
            long r54 = r32 & r1
            long r44 = r44 | r54
            long r54 = r48 & r1
            long r5 = r5 | r54
            long r54 = r50 & r1
            long r7 = r7 | r54
            long r54 = r16 & r1
            long r9 = r9 | r54
            long r54 = r52 & r1
            long r11 = r11 | r54
            long r54 = r5 << r47
            long r54 = r44 | r54
            r56 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r44 = r54 & r56
            r29 = 6
            long r28 = r5 >> r29
            r13 = 20
            long r54 = r7 << r13
            long r28 = r28 | r54
            long r5 = r28 & r56
            r43 = 12
            long r28 = r7 >> r43
            r47 = 14
            long r54 = r9 << r47
            long r28 = r28 | r54
            long r7 = r28 & r56
            r28 = 18
            long r28 = r9 >> r28
            r42 = 8
            long r54 = r11 << r42
            long r28 = r28 | r54
            long r9 = r28 & r56
            r13 = r21
            long r54 = load32(r0, r13)
            long r54 = r44 + r54
            long r3 = r54 & r56
            r13 = 20
            long r28 = load32(r0, r13)
            long r28 = r5 + r28
            long r44 = r54 >> r18
            long r28 = r28 + r44
            long r5 = r28 & r56
            r13 = r46
            long r44 = load32(r0, r13)
            long r44 = r7 + r44
            long r46 = r28 >> r18
            long r44 = r44 + r46
            long r7 = r44 & r56
            r13 = 28
            long r28 = load32(r0, r13)
            long r28 = r9 + r28
            long r46 = r44 >> r18
            long r28 = r28 + r46
            long r9 = r28 & r56
            r13 = 16
            byte[] r13 = new byte[r13]
            r0 = 0
            toByteArray(r13, r3, r0)
            r0 = 4
            toByteArray(r13, r5, r0)
            r0 = 8
            toByteArray(r13, r7, r0)
            r0 = 12
            toByteArray(r13, r9, r0)
            return r13
        L1fa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The key length in bytes must be 32."
            r0.<init>(r1)
            throw r0
    }

    private static void copyBlockSize(byte[] r4, byte[] r5, int r6) {
            int r0 = r5.length
            int r0 = r0 - r6
            r1 = 16
            int r0 = java.lang.Math.min(r1, r0)
            r2 = 0
            java.lang.System.arraycopy(r5, r6, r4, r2, r0)
            r3 = 1
            r4[r0] = r3
            if (r0 == r1) goto L17
            int r1 = r0 + 1
            int r3 = r4.length
            java.util.Arrays.fill(r4, r1, r3, r2)
        L17:
            return
    }

    private static long load26(byte[] r4, int r5, int r6) {
            long r0 = load32(r4, r5)
            long r0 = r0 >> r6
            r2 = 67108863(0x3ffffff, double:3.31561837E-316)
            long r0 = r0 & r2
            return r0
    }

    private static long load32(byte[] r4, int r5) {
            r0 = r4[r5]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r5 + 1
            r1 = r4[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r5 + 2
            r1 = r4[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r5 + 3
            r1 = r4[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            r0 = r0 | r1
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    private static void toByteArray(byte[] r4, long r5, int r7) {
            r0 = 0
        L1:
            r1 = 4
            if (r0 >= r1) goto L13
            int r1 = r7 + r0
            r2 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r5
            int r2 = (int) r2
            byte r2 = (byte) r2
            r4[r1] = r2
            int r0 = r0 + 1
            r1 = 8
            long r5 = r5 >> r1
            goto L1
        L13:
            return
    }

    public static void verifyMac(byte[] r2, byte[] r3, byte[] r4) throws java.security.GeneralSecurityException {
            byte[] r0 = computeMac(r2, r3)
            boolean r0 = com.google.crypto.tink.subtle.Bytes.equal(r0, r4)
            if (r0 == 0) goto Lb
            return
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "invalid MAC"
            r0.<init>(r1)
            throw r0
    }
}
