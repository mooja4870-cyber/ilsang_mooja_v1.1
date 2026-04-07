package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class Base64 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;
    private static final java.nio.charset.Charset UTF_8 = null;

    static abstract class Coder {
        public int op;
        public byte[] output;

        Coder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract int maxOutputSize(int r1);

        public abstract boolean process(byte[] r1, int r2, int r3, boolean r4);
    }

    static class Decoder extends com.google.crypto.tink.subtle.Base64.Coder {
        private static final int[] DECODE = null;
        private static final int[] DECODE_WEBSAFE = null;
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        static {
                r0 = 256(0x100, float:3.59E-43)
                int[] r0 = new int[r0]
                r0 = {x0014: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1} // fill-array
                com.google.crypto.tink.subtle.Base64.Decoder.DECODE = r0
                r0 = 256(0x100, float:3.59E-43)
                int[] r0 = new int[r0]
                r0 = {x0218: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1} // fill-array
                com.google.crypto.tink.subtle.Base64.Decoder.DECODE_WEBSAFE = r0
                return
        }

        public Decoder(int r2, byte[] r3) {
                r1 = this;
                r1.<init>()
                r1.output = r3
                r0 = r2 & 8
                if (r0 != 0) goto Lc
                int[] r0 = com.google.crypto.tink.subtle.Base64.Decoder.DECODE
                goto Le
            Lc:
                int[] r0 = com.google.crypto.tink.subtle.Base64.Decoder.DECODE_WEBSAFE
            Le:
                r1.alphabet = r0
                r0 = 0
                r1.state = r0
                r1.value = r0
                return
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public int maxOutputSize(int r2) {
                r1 = this;
                int r0 = r2 * 3
                int r0 = r0 / 4
                int r0 = r0 + 10
                return r0
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public boolean process(byte[] r12, int r13, int r14, boolean r15) {
                r11 = this;
                int r0 = r11.state
                r1 = 0
                r2 = 6
                if (r0 != r2) goto L7
                return r1
            L7:
                r0 = r13
                int r14 = r14 + r13
                int r3 = r11.state
                int r4 = r11.value
                r5 = 0
                byte[] r6 = r11.output
                int[] r7 = r11.alphabet
            L12:
                if (r0 >= r14) goto Le4
                if (r3 != 0) goto L5d
            L16:
                int r8 = r0 + 4
                if (r8 > r14) goto L59
                r8 = r12[r0]
                r8 = r8 & 255(0xff, float:3.57E-43)
                r8 = r7[r8]
                int r8 = r8 << 18
                int r9 = r0 + 1
                r9 = r12[r9]
                r9 = r9 & 255(0xff, float:3.57E-43)
                r9 = r7[r9]
                int r9 = r9 << 12
                r8 = r8 | r9
                int r9 = r0 + 2
                r9 = r12[r9]
                r9 = r9 & 255(0xff, float:3.57E-43)
                r9 = r7[r9]
                int r9 = r9 << r2
                r8 = r8 | r9
                int r9 = r0 + 3
                r9 = r12[r9]
                r9 = r9 & 255(0xff, float:3.57E-43)
                r9 = r7[r9]
                r8 = r8 | r9
                r4 = r8
                if (r8 < 0) goto L59
                int r8 = r5 + 2
                byte r9 = (byte) r4
                r6[r8] = r9
                int r8 = r5 + 1
                int r9 = r4 >> 8
                byte r9 = (byte) r9
                r6[r8] = r9
                int r8 = r4 >> 16
                byte r8 = (byte) r8
                r6[r5] = r8
                int r5 = r5 + 3
                int r0 = r0 + 4
                goto L16
            L59:
                if (r0 < r14) goto L5d
                goto Le4
            L5d:
                int r8 = r0 + 1
                r0 = r12[r0]
                r0 = r0 & 255(0xff, float:3.57E-43)
                r0 = r7[r0]
                r9 = -2
                r10 = -1
                switch(r3) {
                    case 0: goto Ld6;
                    case 1: goto Lc8;
                    case 2: goto Lae;
                    case 3: goto L7c;
                    case 4: goto L71;
                    case 5: goto L6c;
                    default: goto L6a;
                }
            L6a:
                goto Le1
            L6c:
                if (r0 == r10) goto Le1
                r11.state = r2
                return r1
            L71:
                if (r0 != r9) goto L77
                int r3 = r3 + 1
                goto Le1
            L77:
                if (r0 == r10) goto Le1
                r11.state = r2
                return r1
            L7c:
                if (r0 < 0) goto L97
                int r9 = r4 << 6
                r4 = r9 | r0
                int r9 = r5 + 2
                byte r10 = (byte) r4
                r6[r9] = r10
                int r9 = r5 + 1
                int r10 = r4 >> 8
                byte r10 = (byte) r10
                r6[r9] = r10
                int r9 = r4 >> 16
                byte r9 = (byte) r9
                r6[r5] = r9
                int r5 = r5 + 3
                r3 = 0
                goto Le1
            L97:
                if (r0 != r9) goto La9
                int r9 = r5 + 1
                int r10 = r4 >> 2
                byte r10 = (byte) r10
                r6[r9] = r10
                int r9 = r4 >> 10
                byte r9 = (byte) r9
                r6[r5] = r9
                int r5 = r5 + 2
                r3 = 5
                goto Le1
            La9:
                if (r0 == r10) goto Le1
                r11.state = r2
                return r1
            Lae:
                if (r0 < 0) goto Lb7
                int r9 = r4 << 6
                r4 = r9 | r0
                int r3 = r3 + 1
                goto Le1
            Lb7:
                if (r0 != r9) goto Lc3
                int r9 = r5 + 1
                int r10 = r4 >> 4
                byte r10 = (byte) r10
                r6[r5] = r10
                r3 = 4
                r5 = r9
                goto Le1
            Lc3:
                if (r0 == r10) goto Le1
                r11.state = r2
                return r1
            Lc8:
                if (r0 < 0) goto Ld1
                int r9 = r4 << 6
                r4 = r9 | r0
                int r3 = r3 + 1
                goto Le1
            Ld1:
                if (r0 == r10) goto Le1
                r11.state = r2
                return r1
            Ld6:
                if (r0 < 0) goto Ldc
                r4 = r0
                int r3 = r3 + 1
                goto Le1
            Ldc:
                if (r0 == r10) goto Le1
                r11.state = r2
                return r1
            Le1:
                r0 = r8
                goto L12
            Le4:
                r8 = 1
                if (r15 != 0) goto Lee
                r11.state = r3
                r11.value = r4
                r11.op = r5
                return r8
            Lee:
                switch(r3) {
                    case 0: goto L111;
                    case 1: goto L10e;
                    case 2: goto L105;
                    case 3: goto Lf6;
                    case 4: goto Lf3;
                    case 5: goto Lf2;
                    default: goto Lf1;
                }
            Lf1:
                goto L112
            Lf2:
                goto L112
            Lf3:
                r11.state = r2
                return r1
            Lf6:
                int r1 = r5 + 1
                int r2 = r4 >> 10
                byte r2 = (byte) r2
                r6[r5] = r2
                int r5 = r1 + 1
                int r2 = r4 >> 2
                byte r2 = (byte) r2
                r6[r1] = r2
                goto L112
            L105:
                int r1 = r5 + 1
                int r2 = r4 >> 4
                byte r2 = (byte) r2
                r6[r5] = r2
                r5 = r1
                goto L112
            L10e:
                r11.state = r2
                return r1
            L111:
            L112:
                r11.state = r3
                r11.op = r5
                return r8
        }
    }

    static class Encoder extends com.google.crypto.tink.subtle.Base64.Coder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final byte[] ENCODE = null;
        private static final byte[] ENCODE_WEBSAFE = null;
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        public final boolean doCr;
        public final boolean doNewline;
        public final boolean doPadding;
        private final byte[] tail;
        int tailLen;

        static {
                java.lang.Class<com.google.crypto.tink.subtle.Base64> r0 = com.google.crypto.tink.subtle.Base64.class
                r0 = 64
                byte[] r0 = new byte[r0]
                r0 = {x0016: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
                com.google.crypto.tink.subtle.Base64.Encoder.ENCODE = r0
                r0 = 64
                byte[] r0 = new byte[r0]
                r0 = {x003a: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95} // fill-array
                com.google.crypto.tink.subtle.Base64.Encoder.ENCODE_WEBSAFE = r0
                return
        }

        public Encoder(int r4, byte[] r5) {
                r3 = this;
                r3.<init>()
                r3.output = r5
                r0 = r4 & 1
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Ld
                r0 = r2
                goto Le
            Ld:
                r0 = r1
            Le:
                r3.doPadding = r0
                r0 = r4 & 2
                if (r0 != 0) goto L16
                r0 = r2
                goto L17
            L16:
                r0 = r1
            L17:
                r3.doNewline = r0
                r0 = r4 & 4
                if (r0 == 0) goto L1e
                goto L1f
            L1e:
                r2 = r1
            L1f:
                r3.doCr = r2
                r0 = r4 & 8
                if (r0 != 0) goto L28
                byte[] r0 = com.google.crypto.tink.subtle.Base64.Encoder.ENCODE
                goto L2a
            L28:
                byte[] r0 = com.google.crypto.tink.subtle.Base64.Encoder.ENCODE_WEBSAFE
            L2a:
                r3.alphabet = r0
                r0 = 2
                byte[] r0 = new byte[r0]
                r3.tail = r0
                r3.tailLen = r1
                boolean r0 = r3.doNewline
                if (r0 == 0) goto L3a
                r0 = 19
                goto L3b
            L3a:
                r0 = -1
            L3b:
                r3.count = r0
                return
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public int maxOutputSize(int r2) {
                r1 = this;
                int r0 = r2 * 8
                int r0 = r0 / 5
                int r0 = r0 + 10
                return r0
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public boolean process(byte[] r18, int r19, int r20, boolean r21) {
                r17 = this;
                r0 = r17
                byte[] r1 = r0.alphabet
                byte[] r2 = r0.output
                r3 = 0
                int r4 = r0.count
                r5 = r19
                int r6 = r20 + r19
                r7 = -1
                int r8 = r0.tailLen
                r9 = 0
                r10 = 1
                switch(r8) {
                    case 0: goto L58;
                    case 1: goto L37;
                    case 2: goto L16;
                    default: goto L15;
                }
            L15:
                goto L59
            L16:
                int r8 = r5 + 1
                if (r8 > r6) goto L59
                byte[] r8 = r0.tail
                r8 = r8[r9]
                r8 = r8 & 255(0xff, float:3.57E-43)
                int r8 = r8 << 16
                byte[] r11 = r0.tail
                r11 = r11[r10]
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 << 8
                r8 = r8 | r11
                int r11 = r5 + 1
                r5 = r18[r5]
                r5 = r5 & 255(0xff, float:3.57E-43)
                r7 = r8 | r5
                r0.tailLen = r9
                r5 = r11
                goto L59
            L37:
                int r8 = r5 + 2
                if (r8 > r6) goto L59
                byte[] r8 = r0.tail
                r8 = r8[r9]
                r8 = r8 & 255(0xff, float:3.57E-43)
                int r8 = r8 << 16
                int r11 = r5 + 1
                r5 = r18[r5]
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << 8
                r5 = r5 | r8
                int r8 = r11 + 1
                r11 = r18[r11]
                r11 = r11 & 255(0xff, float:3.57E-43)
                r7 = r5 | r11
                r0.tailLen = r9
                r5 = r8
                goto L59
            L58:
            L59:
                r8 = -1
                r9 = 13
                r11 = 10
                if (r7 == r8) goto L9a
                int r8 = r3 + 1
                int r12 = r7 >> 18
                r12 = r12 & 63
                r12 = r1[r12]
                r2[r3] = r12
                int r3 = r8 + 1
                int r12 = r7 >> 12
                r12 = r12 & 63
                r12 = r1[r12]
                r2[r8] = r12
                int r8 = r3 + 1
                int r12 = r7 >> 6
                r12 = r12 & 63
                r12 = r1[r12]
                r2[r3] = r12
                int r3 = r8 + 1
                r12 = r7 & 63
                r12 = r1[r12]
                r2[r8] = r12
                int r4 = r4 + (-1)
                if (r4 != 0) goto L9a
                boolean r8 = r0.doCr
                if (r8 == 0) goto L93
                int r8 = r3 + 1
                r2[r3] = r9
                r3 = r8
            L93:
                int r8 = r3 + 1
                r2[r3] = r11
                r4 = 19
                r3 = r8
            L9a:
                int r8 = r5 + 3
                if (r8 > r6) goto Lf2
                r8 = r18[r5]
                r8 = r8 & 255(0xff, float:3.57E-43)
                int r8 = r8 << 16
                int r12 = r5 + 1
                r12 = r18[r12]
                r12 = r12 & 255(0xff, float:3.57E-43)
                int r12 = r12 << 8
                r8 = r8 | r12
                int r12 = r5 + 2
                r12 = r18[r12]
                r12 = r12 & 255(0xff, float:3.57E-43)
                r7 = r8 | r12
                int r8 = r7 >> 18
                r8 = r8 & 63
                r8 = r1[r8]
                r2[r3] = r8
                int r8 = r3 + 1
                int r12 = r7 >> 12
                r12 = r12 & 63
                r12 = r1[r12]
                r2[r8] = r12
                int r8 = r3 + 2
                int r12 = r7 >> 6
                r12 = r12 & 63
                r12 = r1[r12]
                r2[r8] = r12
                int r8 = r3 + 3
                r12 = r7 & 63
                r12 = r1[r12]
                r2[r8] = r12
                int r5 = r5 + 3
                int r3 = r3 + 4
                int r4 = r4 + (-1)
                if (r4 != 0) goto L9a
                boolean r8 = r0.doCr
                if (r8 == 0) goto Lea
                int r8 = r3 + 1
                r2[r3] = r9
                r3 = r8
            Lea:
                int r8 = r3 + 1
                r2[r3] = r11
                r4 = 19
                r3 = r8
                goto L9a
            Lf2:
                if (r21 == 0) goto L1ee
                int r8 = r0.tailLen
                int r8 = r5 - r8
                int r12 = r6 + (-1)
                r13 = 61
                if (r8 != r12) goto L14c
                r8 = 0
                int r12 = r0.tailLen
                if (r12 <= 0) goto L10a
                byte[] r12 = r0.tail
                int r14 = r8 + 1
                r8 = r12[r8]
                goto L111
            L10a:
                int r12 = r5 + 1
                r5 = r18[r5]
                r14 = r8
                r8 = r5
                r5 = r12
            L111:
                r8 = r8 & 255(0xff, float:3.57E-43)
                int r7 = r8 << 4
                int r8 = r0.tailLen
                int r8 = r8 - r14
                r0.tailLen = r8
                int r8 = r3 + 1
                int r12 = r7 >> 6
                r12 = r12 & 63
                r12 = r1[r12]
                r2[r3] = r12
                int r3 = r8 + 1
                r12 = r7 & 63
                r12 = r1[r12]
                r2[r8] = r12
                boolean r8 = r0.doPadding
                if (r8 == 0) goto L138
                int r8 = r3 + 1
                r2[r3] = r13
                int r3 = r8 + 1
                r2[r8] = r13
            L138:
                boolean r8 = r0.doNewline
                if (r8 == 0) goto L14a
                boolean r8 = r0.doCr
                if (r8 == 0) goto L145
                int r8 = r3 + 1
                r2[r3] = r9
                r3 = r8
            L145:
                int r8 = r3 + 1
                r2[r3] = r11
                r3 = r8
            L14a:
                goto L1db
            L14c:
                int r8 = r0.tailLen
                int r8 = r5 - r8
                int r12 = r6 + (-2)
                if (r8 != r12) goto L1c3
                r8 = 0
                int r12 = r0.tailLen
                if (r12 <= r10) goto L160
                byte[] r12 = r0.tail
                int r14 = r8 + 1
                r8 = r12[r8]
                goto L167
            L160:
                int r12 = r5 + 1
                r5 = r18[r5]
                r14 = r8
                r8 = r5
                r5 = r12
            L167:
                r8 = r8 & 255(0xff, float:3.57E-43)
                int r8 = r8 << r11
                int r12 = r0.tailLen
                if (r12 <= 0) goto L176
                byte[] r12 = r0.tail
                int r15 = r14 + 1
                r12 = r12[r14]
                r14 = r15
                goto L17f
            L176:
                int r12 = r5 + 1
                r5 = r18[r5]
                r16 = r12
                r12 = r5
                r5 = r16
            L17f:
                r12 = r12 & 255(0xff, float:3.57E-43)
                int r12 = r12 << 2
                r7 = r8 | r12
                int r8 = r0.tailLen
                int r8 = r8 - r14
                r0.tailLen = r8
                int r8 = r3 + 1
                int r12 = r7 >> 12
                r12 = r12 & 63
                r12 = r1[r12]
                r2[r3] = r12
                int r3 = r8 + 1
                int r12 = r7 >> 6
                r12 = r12 & 63
                r12 = r1[r12]
                r2[r8] = r12
                int r8 = r3 + 1
                r12 = r7 & 63
                r12 = r1[r12]
                r2[r3] = r12
                boolean r3 = r0.doPadding
                if (r3 == 0) goto L1af
                int r3 = r8 + 1
                r2[r8] = r13
                r8 = r3
            L1af:
                boolean r3 = r0.doNewline
                if (r3 == 0) goto L1c1
                boolean r3 = r0.doCr
                if (r3 == 0) goto L1bc
                int r3 = r8 + 1
                r2[r8] = r9
                r8 = r3
            L1bc:
                int r3 = r8 + 1
                r2[r8] = r11
                r8 = r3
            L1c1:
                r3 = r8
                goto L1db
            L1c3:
                boolean r8 = r0.doNewline
                if (r8 == 0) goto L1db
                if (r3 <= 0) goto L1db
                r8 = 19
                if (r4 == r8) goto L1db
                boolean r8 = r0.doCr
                if (r8 == 0) goto L1d6
                int r8 = r3 + 1
                r2[r3] = r9
                r3 = r8
            L1d6:
                int r8 = r3 + 1
                r2[r3] = r11
                r3 = r8
            L1db:
                int r8 = r0.tailLen
                if (r8 != 0) goto L1e8
                if (r5 != r6) goto L1e2
                goto L21d
            L1e2:
                java.lang.AssertionError r8 = new java.lang.AssertionError
                r8.<init>()
                throw r8
            L1e8:
                java.lang.AssertionError r8 = new java.lang.AssertionError
                r8.<init>()
                throw r8
            L1ee:
                int r8 = r6 + (-1)
                if (r5 != r8) goto L1ff
                byte[] r8 = r0.tail
                int r9 = r0.tailLen
                int r11 = r9 + 1
                r0.tailLen = r11
                r11 = r18[r5]
                r8[r9] = r11
                goto L21d
            L1ff:
                int r8 = r6 + (-2)
                if (r5 != r8) goto L21d
                byte[] r8 = r0.tail
                int r9 = r0.tailLen
                int r11 = r9 + 1
                r0.tailLen = r11
                r11 = r18[r5]
                r8[r9] = r11
                byte[] r8 = r0.tail
                int r9 = r0.tailLen
                int r11 = r9 + 1
                r0.tailLen = r11
                int r11 = r5 + 1
                r11 = r18[r11]
                r8[r9] = r11
            L21d:
                r0.op = r3
                r0.count = r4
                return r10
        }
    }

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.crypto.tink.subtle.Base64.UTF_8 = r0
            return
    }

    private Base64() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] decode(java.lang.String r1) {
            r0 = 2
            byte[] r0 = decode(r1, r0)
            return r0
    }

    public static byte[] decode(java.lang.String r1, int r2) {
            java.nio.charset.Charset r0 = com.google.crypto.tink.subtle.Base64.UTF_8
            byte[] r0 = r1.getBytes(r0)
            byte[] r0 = decode(r0, r2)
            return r0
    }

    public static byte[] decode(byte[] r2, int r3) {
            r0 = 0
            int r1 = r2.length
            byte[] r0 = decode(r2, r0, r1, r3)
            return r0
    }

    public static byte[] decode(byte[] r5, int r6, int r7, int r8) {
            com.google.crypto.tink.subtle.Base64$Decoder r0 = new com.google.crypto.tink.subtle.Base64$Decoder
            int r1 = r7 * 3
            int r1 = r1 / 4
            byte[] r1 = new byte[r1]
            r0.<init>(r8, r1)
            r1 = 1
            boolean r1 = r0.process(r5, r6, r7, r1)
            if (r1 == 0) goto L29
            int r1 = r0.op
            byte[] r2 = r0.output
            int r2 = r2.length
            if (r1 != r2) goto L1c
            byte[] r1 = r0.output
            return r1
        L1c:
            int r1 = r0.op
            byte[] r1 = new byte[r1]
            byte[] r2 = r0.output
            int r3 = r0.op
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r1, r4, r3)
            return r1
        L29:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "bad base-64"
            r1.<init>(r2)
            throw r1
    }

    public static java.lang.String encode(byte[] r1) {
            r0 = 2
            java.lang.String r0 = encodeToString(r1, r0)
            return r0
    }

    public static byte[] encode(byte[] r2, int r3) {
            r0 = 0
            int r1 = r2.length
            byte[] r0 = encode(r2, r0, r1, r3)
            return r0
    }

    public static byte[] encode(byte[] r5, int r6, int r7, int r8) {
            com.google.crypto.tink.subtle.Base64$Encoder r0 = new com.google.crypto.tink.subtle.Base64$Encoder
            r1 = 0
            r0.<init>(r8, r1)
            int r1 = r7 / 3
            int r1 = r1 * 4
            boolean r2 = r0.doPadding
            if (r2 == 0) goto L15
            int r2 = r7 % 3
            if (r2 <= 0) goto L22
            int r1 = r1 + 4
            goto L22
        L15:
            int r2 = r7 % 3
            switch(r2) {
                case 0: goto L21;
                case 1: goto L1e;
                case 2: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L22
        L1b:
            int r1 = r1 + 3
            goto L22
        L1e:
            int r1 = r1 + 2
            goto L22
        L21:
        L22:
            boolean r2 = r0.doNewline
            r3 = 1
            if (r2 == 0) goto L37
            if (r7 <= 0) goto L37
            int r2 = r7 + (-1)
            int r2 = r2 / 57
            int r2 = r2 + r3
            boolean r4 = r0.doCr
            if (r4 == 0) goto L34
            r4 = 2
            goto L35
        L34:
            r4 = r3
        L35:
            int r2 = r2 * r4
            int r1 = r1 + r2
        L37:
            byte[] r2 = new byte[r1]
            r0.output = r2
            r0.process(r5, r6, r7, r3)
            int r2 = r0.op
            if (r2 != r1) goto L45
            byte[] r2 = r0.output
            return r2
        L45:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
    }

    public static java.lang.String encodeToString(byte[] r3, int r4) {
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> Lc
            byte[] r1 = encode(r3, r4)     // Catch: java.io.UnsupportedEncodingException -> Lc
            java.lang.String r2 = "US-ASCII"
            r0.<init>(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> Lc
            return r0
        Lc:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    public static java.lang.String encodeToString(byte[] r3, int r4, int r5, int r6) {
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> Lc
            byte[] r1 = encode(r3, r4, r5, r6)     // Catch: java.io.UnsupportedEncodingException -> Lc
            java.lang.String r2 = "US-ASCII"
            r0.<init>(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> Lc
            return r0
        Lc:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    public static byte[] urlSafeDecode(java.lang.String r1) {
            r0 = 11
            byte[] r0 = decode(r1, r0)
            return r0
    }

    public static java.lang.String urlSafeEncode(byte[] r1) {
            r0 = 11
            java.lang.String r0 = encodeToString(r1, r0)
            return r0
    }
}
