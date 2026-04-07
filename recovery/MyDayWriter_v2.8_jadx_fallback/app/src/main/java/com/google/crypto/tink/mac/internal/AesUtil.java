package com.google.crypto.tink.mac.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AesUtil {
    public static final int BLOCK_SIZE = 16;

    private AesUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] cmacPad(byte[] r3) {
            int r0 = r3.length
            r1 = 16
            if (r0 >= r1) goto Lf
            byte[] r0 = java.util.Arrays.copyOf(r3, r1)
            int r1 = r3.length
            r2 = -128(0xffffffffffffff80, float:NaN)
            r0[r1] = r2
            return r0
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "x must be smaller than a block."
            r0.<init>(r1)
            throw r0
    }

    public static byte[] dbl(byte[] r5) {
            int r0 = r5.length
            r1 = 16
            if (r0 != r1) goto L38
            byte[] r0 = new byte[r1]
            r2 = 0
        L8:
            r3 = 15
            if (r2 >= r1) goto L29
            r4 = r5[r2]
            int r4 = r4 << 1
            r4 = r4 & 254(0xfe, float:3.56E-43)
            byte r4 = (byte) r4
            r0[r2] = r4
            if (r2 >= r3) goto L26
            r3 = r0[r2]
            int r4 = r2 + 1
            r4 = r5[r4]
            int r4 = r4 >> 7
            r4 = r4 & 1
            byte r4 = (byte) r4
            r3 = r3 | r4
            byte r3 = (byte) r3
            r0[r2] = r3
        L26:
            int r2 = r2 + 1
            goto L8
        L29:
            r1 = r0[r3]
            r2 = 0
            r2 = r5[r2]
            int r2 = r2 >> 7
            r2 = r2 & 135(0x87, float:1.89E-43)
            byte r2 = (byte) r2
            r1 = r1 ^ r2
            byte r1 = (byte) r1
            r0[r3] = r1
            return r0
        L38:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "value must be a block."
            r0.<init>(r1)
            throw r0
    }
}
