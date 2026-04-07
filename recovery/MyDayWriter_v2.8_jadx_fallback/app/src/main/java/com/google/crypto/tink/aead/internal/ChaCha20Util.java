package com.google.crypto.tink.aead.internal;

/* JADX INFO: loaded from: classes.dex */
final class ChaCha20Util {
    static final int BLOCK_SIZE_IN_BYTES = 64;
    static final int BLOCK_SIZE_IN_INTS = 16;
    static final int KEY_SIZE_IN_BYTES = 32;
    static final int KEY_SIZE_IN_INTS = 8;
    private static final int[] SIGMA = null;

    static {
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107} // fill-array
            int[] r0 = toIntArray(r0)
            com.google.crypto.tink.aead.internal.ChaCha20Util.SIGMA = r0
            return
    }

    private ChaCha20Util() {
            r0 = this;
            r0.<init>()
            return
    }

    static void quarterRound(int[] r2, int r3, int r4, int r5, int r6) {
            r0 = r2[r3]
            r1 = r2[r4]
            int r0 = r0 + r1
            r2[r3] = r0
            r0 = r2[r6]
            r1 = r2[r3]
            r0 = r0 ^ r1
            r1 = 16
            int r0 = rotateLeft(r0, r1)
            r2[r6] = r0
            r0 = r2[r5]
            r1 = r2[r6]
            int r0 = r0 + r1
            r2[r5] = r0
            r0 = r2[r4]
            r1 = r2[r5]
            r0 = r0 ^ r1
            r1 = 12
            int r0 = rotateLeft(r0, r1)
            r2[r4] = r0
            r0 = r2[r3]
            r1 = r2[r4]
            int r0 = r0 + r1
            r2[r3] = r0
            r0 = r2[r6]
            r1 = r2[r3]
            r0 = r0 ^ r1
            r1 = 8
            int r0 = rotateLeft(r0, r1)
            r2[r6] = r0
            r0 = r2[r5]
            r1 = r2[r6]
            int r0 = r0 + r1
            r2[r5] = r0
            r0 = r2[r4]
            r1 = r2[r5]
            r0 = r0 ^ r1
            r1 = 7
            int r0 = rotateLeft(r0, r1)
            r2[r4] = r0
            return
    }

    private static int rotateLeft(int r2, int r3) {
            int r0 = r2 << r3
            int r1 = -r3
            int r1 = r2 >>> r1
            r0 = r0 | r1
            return r0
    }

    static void setSigmaAndKey(int[] r3, int[] r4) {
            int[] r0 = com.google.crypto.tink.aead.internal.ChaCha20Util.SIGMA
            int[] r1 = com.google.crypto.tink.aead.internal.ChaCha20Util.SIGMA
            int r1 = r1.length
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            int[] r0 = com.google.crypto.tink.aead.internal.ChaCha20Util.SIGMA
            int r0 = r0.length
            r1 = 8
            java.lang.System.arraycopy(r4, r2, r3, r0, r1)
            return
    }

    static void shuffleState(int[] r16) {
            r0 = r16
            r1 = 0
        L3:
            r2 = 10
            if (r1 >= r2) goto L3b
            r3 = 0
            r4 = 4
            r5 = 8
            r6 = 12
            quarterRound(r0, r3, r4, r5, r6)
            r7 = 1
            r8 = 5
            r9 = 9
            r10 = 13
            quarterRound(r0, r7, r8, r9, r10)
            r11 = 2
            r12 = 6
            r13 = 14
            quarterRound(r0, r11, r12, r2, r13)
            r14 = 3
            r15 = 7
            r4 = 11
            r9 = 15
            quarterRound(r0, r14, r15, r4, r9)
            quarterRound(r0, r3, r8, r2, r9)
            quarterRound(r0, r7, r12, r4, r6)
            quarterRound(r0, r11, r15, r5, r10)
            r2 = 9
            r3 = 4
            quarterRound(r0, r14, r3, r2, r13)
            int r1 = r1 + 1
            goto L3
        L3b:
            return
    }

    static int[] toIntArray(byte[] r2) {
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r2)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            java.nio.IntBuffer r0 = r0.asIntBuffer()
            int r1 = r0.remaining()
            int[] r1 = new int[r1]
            r0.get(r1)
            return r1
    }
}
