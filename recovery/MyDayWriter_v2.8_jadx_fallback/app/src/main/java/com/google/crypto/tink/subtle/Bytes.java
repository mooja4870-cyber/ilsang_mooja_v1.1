package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class Bytes {
    private Bytes() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int byteArrayToInt(byte[] r1) {
            int r0 = r1.length
            int r0 = byteArrayToInt(r1, r0)
            return r0
    }

    public static int byteArrayToInt(byte[] r1, int r2) {
            r0 = 0
            int r0 = byteArrayToInt(r1, r0, r2)
            return r0
    }

    public static int byteArrayToInt(byte[] r4, int r5, int r6) {
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r6) goto L11
            int r2 = r1 + r5
            r2 = r4[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 * 8
            int r2 = r2 << r3
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L11:
            return r0
    }

    public static byte[] concat(byte[]... r8) throws java.security.GeneralSecurityException {
            r0 = 0
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L4:
            if (r3 >= r1) goto L1c
            r4 = r8[r3]
            r5 = 2147483647(0x7fffffff, float:NaN)
            int r6 = r4.length
            int r5 = r5 - r6
            if (r0 > r5) goto L14
            int r5 = r4.length
            int r0 = r0 + r5
            int r3 = r3 + 1
            goto L4
        L14:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "exceeded size limit"
            r1.<init>(r2)
            throw r1
        L1c:
            byte[] r1 = new byte[r0]
            r3 = 0
            int r4 = r8.length
            r5 = r2
        L21:
            if (r5 >= r4) goto L2e
            r6 = r8[r5]
            int r7 = r6.length
            java.lang.System.arraycopy(r6, r2, r1, r3, r7)
            int r7 = r6.length
            int r3 = r3 + r7
            int r5 = r5 + 1
            goto L21
        L2e:
            return r1
    }

    public static final boolean equal(byte[] r1, byte[] r2) {
            boolean r0 = java.security.MessageDigest.isEqual(r1, r2)
            return r0
    }

    public static byte[] intToByteArray(int r3, int r4) {
            byte[] r0 = new byte[r3]
            r1 = 0
        L3:
            if (r1 >= r3) goto L11
            int r2 = r1 * 8
            int r2 = r4 >> r2
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L3
        L11:
            return r0
    }

    public static final void xor(java.nio.ByteBuffer r3, java.nio.ByteBuffer r4, java.nio.ByteBuffer r5, int r6) {
            if (r6 < 0) goto L28
            int r0 = r4.remaining()
            if (r0 < r6) goto L28
            int r0 = r5.remaining()
            if (r0 < r6) goto L28
            int r0 = r3.remaining()
            if (r0 < r6) goto L28
            r0 = 0
        L15:
            if (r0 >= r6) goto L27
            byte r1 = r4.get()
            byte r2 = r5.get()
            r1 = r1 ^ r2
            byte r1 = (byte) r1
            r3.put(r1)
            int r0 = r0 + 1
            goto L15
        L27:
            return
        L28:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "That combination of buffers, offsets and length to xor result in out-of-bond accesses."
            r0.<init>(r1)
            throw r0
    }

    public static final byte[] xor(byte[] r4, int r5, byte[] r6, int r7, int r8) {
            if (r8 < 0) goto L1f
            int r0 = r4.length
            int r0 = r0 - r8
            if (r0 < r5) goto L1f
            int r0 = r6.length
            int r0 = r0 - r8
            if (r0 < r7) goto L1f
            byte[] r0 = new byte[r8]
            r1 = 0
        Ld:
            if (r1 >= r8) goto L1e
            int r2 = r1 + r5
            r2 = r4[r2]
            int r3 = r1 + r7
            r3 = r6[r3]
            r2 = r2 ^ r3
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto Ld
        L1e:
            return r0
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "That combination of buffers, offsets and length to xor result in out-of-bond accesses."
            r0.<init>(r1)
            throw r0
    }

    public static final byte[] xor(byte[] r2, byte[] r3) {
            int r0 = r2.length
            int r1 = r3.length
            if (r0 != r1) goto Lb
            int r0 = r2.length
            r1 = 0
            byte[] r0 = xor(r2, r1, r3, r1, r0)
            return r0
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The lengths of x and y should match."
            r0.<init>(r1)
            throw r0
    }

    public static final byte[] xorEnd(byte[] r6, byte[] r7) {
            int r0 = r6.length
            int r1 = r7.length
            if (r0 < r1) goto L1e
            int r0 = r6.length
            int r1 = r7.length
            int r0 = r0 - r1
            int r1 = r6.length
            byte[] r1 = java.util.Arrays.copyOf(r6, r1)
            r2 = 0
        Ld:
            int r3 = r7.length
            if (r2 >= r3) goto L1d
            int r3 = r0 + r2
            r4 = r1[r3]
            r5 = r7[r2]
            r4 = r4 ^ r5
            byte r4 = (byte) r4
            r1[r3] = r4
            int r2 = r2 + 1
            goto Ld
        L1d:
            return r1
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "xorEnd requires a.length >= b.length"
            r0.<init>(r1)
            throw r0
    }
}
