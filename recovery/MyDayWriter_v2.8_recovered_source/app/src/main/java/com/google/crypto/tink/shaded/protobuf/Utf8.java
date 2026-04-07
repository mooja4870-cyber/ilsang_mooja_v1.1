package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final com.google.crypto.tink.shaded.protobuf.Utf8.Processor processor = null;

    private static class DecodeUtil {
        private DecodeUtil() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void access$1000(byte r0, byte r1, byte r2, byte r3, char[] r4, int r5) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                handleFourBytes(r0, r1, r2, r3, r4, r5)
                return
        }

        static /* synthetic */ boolean access$400(byte r1) {
                boolean r0 = isOneByte(r1)
                return r0
        }

        static /* synthetic */ void access$500(byte r0, char[] r1, int r2) {
                handleOneByte(r0, r1, r2)
                return
        }

        static /* synthetic */ boolean access$600(byte r1) {
                boolean r0 = isTwoBytes(r1)
                return r0
        }

        static /* synthetic */ void access$700(byte r0, byte r1, char[] r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                handleTwoBytes(r0, r1, r2, r3)
                return
        }

        static /* synthetic */ boolean access$800(byte r1) {
                boolean r0 = isThreeBytes(r1)
                return r0
        }

        static /* synthetic */ void access$900(byte r0, byte r1, byte r2, char[] r3, int r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                handleThreeBytes(r0, r1, r2, r3, r4)
                return
        }

        private static void handleFourBytes(byte r3, byte r4, byte r5, byte r6, char[] r7, int r8) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                boolean r0 = isNotTrailingByte(r4)
                if (r0 != 0) goto L41
                int r0 = r3 << 28
                int r1 = r4 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L41
                boolean r0 = isNotTrailingByte(r5)
                if (r0 != 0) goto L41
                boolean r0 = isNotTrailingByte(r6)
                if (r0 != 0) goto L41
                r0 = r3 & 7
                int r0 = r0 << 18
                int r1 = trailingByteValue(r4)
                int r1 = r1 << 12
                r0 = r0 | r1
                int r1 = trailingByteValue(r5)
                int r1 = r1 << 6
                r0 = r0 | r1
                int r1 = trailingByteValue(r6)
                r0 = r0 | r1
                char r1 = highSurrogate(r0)
                r7[r8] = r1
                int r1 = r8 + 1
                char r2 = lowSurrogate(r0)
                r7[r1] = r2
                return
            L41:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r0
        }

        private static void handleOneByte(byte r1, char[] r2, int r3) {
                char r0 = (char) r1
                r2[r3] = r0
                return
        }

        private static void handleThreeBytes(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                boolean r0 = isNotTrailingByte(r3)
                if (r0 != 0) goto L2e
                r0 = -32
                r1 = -96
                if (r2 != r0) goto Le
                if (r3 < r1) goto L2e
            Le:
                r0 = -19
                if (r2 != r0) goto L14
                if (r3 >= r1) goto L2e
            L14:
                boolean r0 = isNotTrailingByte(r4)
                if (r0 != 0) goto L2e
                r0 = r2 & 15
                int r0 = r0 << 12
                int r1 = trailingByteValue(r3)
                int r1 = r1 << 6
                r0 = r0 | r1
                int r1 = trailingByteValue(r4)
                r0 = r0 | r1
                char r0 = (char) r0
                r5[r6] = r0
                return
            L2e:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r0
        }

        private static void handleTwoBytes(byte r2, byte r3, char[] r4, int r5) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = -62
                if (r2 < r0) goto L17
                boolean r0 = isNotTrailingByte(r3)
                if (r0 != 0) goto L17
                r0 = r2 & 31
                int r0 = r0 << 6
                int r1 = trailingByteValue(r3)
                r0 = r0 | r1
                char r0 = (char) r0
                r4[r5] = r0
                return
            L17:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r0
        }

        private static char highSurrogate(int r2) {
                int r0 = r2 >>> 10
                r1 = 55232(0xd7c0, float:7.7397E-41)
                int r0 = r0 + r1
                char r0 = (char) r0
                return r0
        }

        private static boolean isNotTrailingByte(byte r1) {
                r0 = -65
                if (r1 <= r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        private static boolean isOneByte(byte r1) {
                if (r1 < 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                return r0
        }

        private static boolean isThreeBytes(byte r1) {
                r0 = -16
                if (r1 >= r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        private static boolean isTwoBytes(byte r1) {
                r0 = -32
                if (r1 >= r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        private static char lowSurrogate(int r2) {
                r0 = r2 & 1023(0x3ff, float:1.434E-42)
                r1 = 56320(0xdc00, float:7.8921E-41)
                int r0 = r0 + r1
                char r0 = (char) r0
                return r0
        }

        private static int trailingByteValue(byte r1) {
                r0 = r1 & 63
                return r0
        }
    }

    static abstract class Processor {
        Processor() {
                r0 = this;
                r0.<init>()
                return
        }

        private static int partialIsValidUtf8(java.nio.ByteBuffer r6, int r7, int r8) {
                int r0 = com.google.crypto.tink.shaded.protobuf.Utf8.access$200(r6, r7, r8)
                int r7 = r7 + r0
            L5:
                if (r7 < r8) goto L9
                r0 = 0
                return r0
            L9:
                int r0 = r7 + 1
                byte r7 = r6.get(r7)
                r1 = r7
                if (r7 >= 0) goto L8d
                r7 = -32
                r2 = -1
                r3 = -65
                if (r1 >= r7) goto L2c
                if (r0 < r8) goto L1c
                return r1
            L1c:
                r7 = -62
                if (r1 < r7) goto L2b
                byte r7 = r6.get(r0)
                if (r7 <= r3) goto L27
                goto L2b
            L27:
                int r0 = r0 + 1
                r7 = r0
                goto L89
            L2b:
                return r2
            L2c:
                r4 = -16
                if (r1 >= r4) goto L5c
                int r4 = r8 + (-1)
                if (r0 < r4) goto L3b
                int r7 = r8 - r0
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$300(r6, r1, r0, r7)
                return r7
            L3b:
                int r4 = r0 + 1
                byte r0 = r6.get(r0)
                if (r0 > r3) goto L5b
                r5 = -96
                if (r1 != r7) goto L49
                if (r0 < r5) goto L5b
            L49:
                r7 = -19
                if (r1 != r7) goto L4f
                if (r0 >= r5) goto L5b
            L4f:
                byte r7 = r6.get(r4)
                if (r7 <= r3) goto L56
                goto L5b
            L56:
                int r4 = r4 + 1
                r7 = r4
                goto L89
            L5b:
                return r2
            L5c:
                int r7 = r8 + (-2)
                if (r0 < r7) goto L67
                int r7 = r8 - r0
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$300(r6, r1, r0, r7)
                return r7
            L67:
                int r7 = r0 + 1
                byte r0 = r6.get(r0)
                if (r0 > r3) goto L8c
                int r4 = r1 << 28
                int r5 = r0 + 112
                int r4 = r4 + r5
                int r4 = r4 >> 30
                if (r4 != 0) goto L8c
                int r4 = r7 + 1
                byte r7 = r6.get(r7)
                if (r7 > r3) goto L8b
                int r7 = r4 + 1
                byte r4 = r6.get(r4)
                if (r4 <= r3) goto L89
                goto L8c
            L89:
                goto L5
            L8b:
                r7 = r4
            L8c:
                return r2
            L8d:
                r7 = r0
                goto L5
        }

        final java.lang.String decodeUtf8(java.nio.ByteBuffer r4, int r5, int r6) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r3 = this;
                boolean r0 = r4.hasArray()
                if (r0 == 0) goto L15
                int r0 = r4.arrayOffset()
                byte[] r1 = r4.array()
                int r2 = r0 + r5
                java.lang.String r1 = r3.decodeUtf8(r1, r2, r6)
                return r1
            L15:
                boolean r0 = r4.isDirect()
                if (r0 == 0) goto L20
                java.lang.String r0 = r3.decodeUtf8Direct(r4, r5, r6)
                return r0
            L20:
                java.lang.String r0 = r3.decodeUtf8Default(r4, r5, r6)
                return r0
        }

        abstract java.lang.String decodeUtf8(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        final java.lang.String decodeUtf8Default(java.nio.ByteBuffer r11, int r12, int r13) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r10 = this;
                r0 = r12 | r13
                int r1 = r11.limit()
                int r1 = r1 - r12
                int r1 = r1 - r13
                r0 = r0 | r1
                if (r0 < 0) goto Lc0
                r0 = r12
                int r1 = r0 + r13
                char[] r6 = new char[r13]
                r2 = 0
            L11:
                if (r0 >= r1) goto L27
                byte r3 = r11.get(r0)
                boolean r4 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r3)
                if (r4 != 0) goto L1e
                goto L27
            L1e:
                int r0 = r0 + 1
                int r4 = r2 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r3, r6, r2)
                r2 = r4
                goto L11
            L27:
                r7 = r2
            L28:
                if (r0 >= r1) goto Lb9
                int r2 = r0 + 1
                r3 = r2
                byte r2 = r11.get(r0)
                boolean r0 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r2)
                if (r0 == 0) goto L55
                int r0 = r7 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r2, r6, r7)
            L3c:
                if (r3 >= r1) goto L52
                byte r4 = r11.get(r3)
                boolean r5 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r4)
                if (r5 != 0) goto L49
                goto L52
            L49:
                int r3 = r3 + 1
                int r5 = r0 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r4, r6, r0)
                r0 = r5
                goto L3c
            L52:
                r7 = r0
                r0 = r3
                goto Lb2
            L55:
                boolean r0 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$600(r2)
                if (r0 == 0) goto L6f
                if (r3 >= r1) goto L6a
                int r0 = r3 + 1
                byte r3 = r11.get(r3)
                int r4 = r7 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$700(r2, r3, r6, r7)
                r7 = r4
                goto Lb2
            L6a:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r0
            L6f:
                boolean r0 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$800(r2)
                if (r0 == 0) goto L92
                int r0 = r1 + (-1)
                if (r3 >= r0) goto L8d
                int r0 = r3 + 1
                byte r3 = r11.get(r3)
                int r4 = r0 + 1
                byte r0 = r11.get(r0)
                int r5 = r7 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$900(r2, r3, r0, r6, r7)
                r0 = r4
                r7 = r5
                goto Lb2
            L8d:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r0
            L92:
                int r0 = r1 + (-2)
                if (r3 >= r0) goto Lb4
                int r0 = r3 + 1
                byte r3 = r11.get(r3)
                int r4 = r0 + 1
                byte r0 = r11.get(r0)
                int r8 = r4 + 1
                byte r5 = r11.get(r4)
                int r9 = r7 + 1
                r4 = r0
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$1000(r2, r3, r4, r5, r6, r7)
                int r9 = r9 + 1
                r0 = r8
                r7 = r9
            Lb2:
                goto L28
            Lb4:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r0
            Lb9:
                java.lang.String r2 = new java.lang.String
                r3 = 0
                r2.<init>(r6, r3, r7)
                return r2
            Lc0:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                int r1 = r11.limit()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
                java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
                java.lang.String r2 = "buffer limit=%d, index=%d, limit=%d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
        }

        abstract java.lang.String decodeUtf8Direct(java.nio.ByteBuffer r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        abstract int encodeUtf8(java.lang.CharSequence r1, byte[] r2, int r3, int r4);

        final void encodeUtf8(java.lang.CharSequence r5, java.nio.ByteBuffer r6) {
                r4 = this;
                boolean r0 = r6.hasArray()
                if (r0 == 0) goto L21
                int r0 = r6.arrayOffset()
                byte[] r1 = r6.array()
                int r2 = r6.position()
                int r2 = r2 + r0
                int r3 = r6.remaining()
                int r1 = com.google.crypto.tink.shaded.protobuf.Utf8.encode(r5, r1, r2, r3)
                int r2 = r1 - r0
                r6.position(r2)
                goto L2e
            L21:
                boolean r0 = r6.isDirect()
                if (r0 == 0) goto L2b
                r4.encodeUtf8Direct(r5, r6)
                goto L2e
            L2b:
                r4.encodeUtf8Default(r5, r6)
            L2e:
                return
        }

        final void encodeUtf8Default(java.lang.CharSequence r10, java.nio.ByteBuffer r11) {
                r9 = this;
                int r0 = r10.length()
                int r1 = r11.position()
                r2 = 0
            L9:
                r3 = 128(0x80, float:1.8E-43)
                if (r2 >= r0) goto L20
                char r4 = r10.charAt(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
                r5 = r4
                if (r4 >= r3) goto L20
                int r3 = r1 + r2
                byte r4 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L1d
                r11.put(r3, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
                int r2 = r2 + 1
                goto L9
            L1d:
                r3 = move-exception
                goto Lcc
            L20:
                if (r2 != r0) goto L28
                int r3 = r1 + r2
                r11.position(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
                return
            L28:
                int r1 = r1 + r2
            L29:
                if (r2 >= r0) goto Lc7
                char r4 = r10.charAt(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
                if (r4 >= r3) goto L37
                byte r5 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L1d
                r11.put(r1, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
                goto Lc1
            L37:
                r5 = 2048(0x800, float:2.87E-42)
                if (r4 >= r5) goto L53
                int r5 = r1 + 1
                int r6 = r4 >>> 6
                r6 = r6 | 192(0xc0, float:2.69E-43)
                byte r6 = (byte) r6
                r11.put(r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L4f
                r1 = r4 & 63
                r1 = r1 | r3
                byte r1 = (byte) r1     // Catch: java.lang.IndexOutOfBoundsException -> L4f
                r11.put(r5, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L4f
                r1 = r5
                goto Lc1
            L4f:
                r3 = move-exception
                r1 = r5
                goto Lcc
            L53:
                r5 = 55296(0xd800, float:7.7486E-41)
                if (r4 < r5) goto La5
                r5 = 57343(0xdfff, float:8.0355E-41)
                if (r5 >= r4) goto L5e
                goto La5
            L5e:
                int r5 = r2 + 1
                if (r5 == r0) goto L9f
                int r2 = r2 + 1
                char r5 = r10.charAt(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
                r6 = r5
                boolean r5 = java.lang.Character.isSurrogatePair(r4, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
                if (r5 == 0) goto L9f
                int r5 = java.lang.Character.toCodePoint(r4, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
                int r7 = r1 + 1
                int r8 = r5 >>> 18
                r8 = r8 | 240(0xf0, float:3.36E-43)
                byte r8 = (byte) r8
                r11.put(r1, r8)     // Catch: java.lang.IndexOutOfBoundsException -> L9c
                int r1 = r7 + 1
                int r8 = r5 >>> 12
                r8 = r8 & 63
                r8 = r8 | r3
                byte r8 = (byte) r8
                r11.put(r7, r8)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
                int r7 = r1 + 1
                int r8 = r5 >>> 6
                r8 = r8 & 63
                r8 = r8 | r3
                byte r8 = (byte) r8
                r11.put(r1, r8)     // Catch: java.lang.IndexOutOfBoundsException -> L9c
                r1 = r5 & 63
                r1 = r1 | r3
                byte r1 = (byte) r1     // Catch: java.lang.IndexOutOfBoundsException -> L9c
                r11.put(r7, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L9c
                r1 = r7
                goto Lc1
            L9c:
                r3 = move-exception
                r1 = r7
                goto Lcc
            L9f:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r3 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException     // Catch: java.lang.IndexOutOfBoundsException -> L1d
                r3.<init>(r2, r0)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
                throw r3     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            La5:
                int r5 = r1 + 1
                int r6 = r4 >>> 12
                r6 = r6 | 224(0xe0, float:3.14E-43)
                byte r6 = (byte) r6
                r11.put(r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L4f
                int r1 = r5 + 1
                int r6 = r4 >>> 6
                r6 = r6 & 63
                r6 = r6 | r3
                byte r6 = (byte) r6
                r11.put(r5, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
                r5 = r4 & 63
                r5 = r5 | r3
                byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L1d
                r11.put(r1, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            Lc1:
                int r2 = r2 + 1
                int r1 = r1 + 1
                goto L29
            Lc7:
                r11.position(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
                return
            Lcc:
                int r4 = r11.position()
                int r5 = r11.position()
                int r5 = r1 - r5
                int r5 = r5 + 1
                int r5 = java.lang.Math.max(r2, r5)
                int r4 = r4 + r5
                java.lang.ArrayIndexOutOfBoundsException r5 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "Failed writing "
                java.lang.StringBuilder r6 = r6.append(r7)
                char r7 = r10.charAt(r2)
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.String r7 = " at index "
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.StringBuilder r6 = r6.append(r4)
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                throw r5
        }

        abstract void encodeUtf8Direct(java.lang.CharSequence r1, java.nio.ByteBuffer r2);

        final boolean isValidUtf8(java.nio.ByteBuffer r3, int r4, int r5) {
                r2 = this;
                r0 = 0
                int r1 = r2.partialIsValidUtf8(r0, r3, r4, r5)
                if (r1 != 0) goto L8
                r0 = 1
            L8:
                return r0
        }

        final boolean isValidUtf8(byte[] r3, int r4, int r5) {
                r2 = this;
                r0 = 0
                int r1 = r2.partialIsValidUtf8(r0, r3, r4, r5)
                if (r1 != 0) goto L8
                r0 = 1
            L8:
                return r0
        }

        final int partialIsValidUtf8(int r5, java.nio.ByteBuffer r6, int r7, int r8) {
                r4 = this;
                boolean r0 = r6.hasArray()
                if (r0 == 0) goto L17
                int r0 = r6.arrayOffset()
                byte[] r1 = r6.array()
                int r2 = r0 + r7
                int r3 = r0 + r8
                int r1 = r4.partialIsValidUtf8(r5, r1, r2, r3)
                return r1
            L17:
                boolean r0 = r6.isDirect()
                if (r0 == 0) goto L22
                int r0 = r4.partialIsValidUtf8Direct(r5, r6, r7, r8)
                return r0
            L22:
                int r0 = r4.partialIsValidUtf8Default(r5, r6, r7, r8)
                return r0
        }

        abstract int partialIsValidUtf8(int r1, byte[] r2, int r3, int r4);

        final int partialIsValidUtf8Default(int r8, java.nio.ByteBuffer r9, int r10, int r11) {
                r7 = this;
                if (r8 == 0) goto L95
                if (r10 < r11) goto L5
                return r8
            L5:
                byte r0 = (byte) r8
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1f
                r1 = -62
                if (r0 < r1) goto L1e
                int r1 = r10 + 1
                byte r10 = r9.get(r10)
                if (r10 <= r3) goto L1b
                r10 = r1
                goto L1e
            L1b:
                r10 = r1
                goto L95
            L1e:
                return r2
            L1f:
                r4 = -16
                if (r0 >= r4) goto L52
                int r4 = r8 >> 8
                int r4 = ~r4
                byte r4 = (byte) r4
                if (r4 != 0) goto L37
                int r5 = r10 + 1
                byte r4 = r9.get(r10)
                if (r5 < r11) goto L36
                int r10 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r0, r4)
                return r10
            L36:
                r10 = r5
            L37:
                if (r4 > r3) goto L51
                r5 = -96
                if (r0 != r1) goto L3f
                if (r4 < r5) goto L51
            L3f:
                r1 = -19
                if (r0 != r1) goto L45
                if (r4 >= r5) goto L51
            L45:
                int r1 = r10 + 1
                byte r10 = r9.get(r10)
                if (r10 <= r3) goto L4f
                r10 = r1
                goto L51
            L4f:
                r10 = r1
                goto L95
            L51:
                return r2
            L52:
                int r1 = r8 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L68
                int r5 = r10 + 1
                byte r1 = r9.get(r10)
                if (r5 < r11) goto L66
                int r10 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r0, r1)
                return r10
            L66:
                r10 = r5
                goto L6b
            L68:
                int r5 = r8 >> 16
                byte r4 = (byte) r5
            L6b:
                if (r4 != 0) goto L7b
                int r5 = r10 + 1
                byte r4 = r9.get(r10)
                if (r5 < r11) goto L7a
                int r10 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r0, r1, r4)
                return r10
            L7a:
                r10 = r5
            L7b:
                if (r1 > r3) goto L94
                int r5 = r0 << 28
                int r6 = r1 + 112
                int r5 = r5 + r6
                int r5 = r5 >> 30
                if (r5 != 0) goto L94
                if (r4 > r3) goto L94
                int r5 = r10 + 1
                byte r10 = r9.get(r10)
                if (r10 <= r3) goto L92
                r10 = r5
                goto L94
            L92:
                r10 = r5
                goto L95
            L94:
                return r2
            L95:
                int r0 = partialIsValidUtf8(r9, r10, r11)
                return r0
        }

        abstract int partialIsValidUtf8Direct(int r1, java.nio.ByteBuffer r2, int r3, int r4);
    }

    static final class SafeProcessor extends com.google.crypto.tink.shaded.protobuf.Utf8.Processor {
        SafeProcessor() {
                r0 = this;
                r0.<init>()
                return
        }

        private static int partialIsValidUtf8(byte[] r1, int r2, int r3) {
            L1:
                if (r2 >= r3) goto La
                r0 = r1[r2]
                if (r0 < 0) goto La
                int r2 = r2 + 1
                goto L1
            La:
                if (r2 < r3) goto Le
                r0 = 0
                goto L12
            Le:
                int r0 = partialIsValidUtf8NonAscii(r1, r2, r3)
            L12:
                return r0
        }

        private static int partialIsValidUtf8NonAscii(byte[] r6, int r7, int r8) {
            L1:
                if (r7 < r8) goto L5
                r0 = 0
                return r0
            L5:
                int r0 = r7 + 1
                r7 = r6[r7]
                r1 = r7
                if (r7 >= 0) goto L73
                r7 = -32
                r2 = -1
                r3 = -65
                if (r1 >= r7) goto L22
                if (r0 < r8) goto L16
                return r1
            L16:
                r7 = -62
                if (r1 < r7) goto L21
                int r7 = r0 + 1
                r0 = r6[r0]
                if (r0 <= r3) goto L70
                r0 = r7
            L21:
                return r2
            L22:
                r4 = -16
                if (r1 >= r4) goto L4a
                int r4 = r8 + (-1)
                if (r0 < r4) goto L2f
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$1100(r6, r0, r8)
                return r7
            L2f:
                int r4 = r0 + 1
                r0 = r6[r0]
                r5 = r0
                if (r0 > r3) goto L49
                r0 = -96
                if (r1 != r7) goto L3c
                if (r5 < r0) goto L49
            L3c:
                r7 = -19
                if (r1 != r7) goto L42
                if (r5 >= r0) goto L49
            L42:
                int r7 = r4 + 1
                r0 = r6[r4]
                if (r0 <= r3) goto L70
                r4 = r7
            L49:
                return r2
            L4a:
                int r7 = r8 + (-2)
                if (r0 < r7) goto L53
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$1100(r6, r0, r8)
                return r7
            L53:
                int r7 = r0 + 1
                r0 = r6[r0]
                r4 = r0
                if (r0 > r3) goto L6f
                int r0 = r1 << 28
                int r5 = r4 + 112
                int r0 = r0 + r5
                int r0 = r0 >> 30
                if (r0 != 0) goto L6f
                int r0 = r7 + 1
                r7 = r6[r7]
                if (r7 > r3) goto L71
                int r7 = r0 + 1
                r0 = r6[r0]
                if (r0 <= r3) goto L70
            L6f:
                goto L72
            L70:
                goto L1
            L71:
                r7 = r0
            L72:
                return r2
            L73:
                r7 = r0
                goto L1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        java.lang.String decodeUtf8(byte[] r11, int r12, int r13) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r10 = this;
                r0 = r12 | r13
                int r1 = r11.length
                int r1 = r1 - r12
                int r1 = r1 - r13
                r0 = r0 | r1
                if (r0 < 0) goto Laa
                r0 = r12
                int r1 = r0 + r13
                char[] r6 = new char[r13]
                r2 = 0
            Le:
                if (r0 >= r1) goto L22
                r3 = r11[r0]
                boolean r4 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r3)
                if (r4 != 0) goto L19
                goto L22
            L19:
                int r0 = r0 + 1
                int r4 = r2 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r3, r6, r2)
                r2 = r4
                goto Le
            L22:
                r7 = r2
            L23:
                if (r0 >= r1) goto La3
                int r2 = r0 + 1
                r3 = r2
                r2 = r11[r0]
                boolean r0 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r2)
                if (r0 == 0) goto L4c
                int r0 = r7 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r2, r6, r7)
            L35:
                if (r3 >= r1) goto L49
                r4 = r11[r3]
                boolean r5 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r4)
                if (r5 != 0) goto L40
                goto L49
            L40:
                int r3 = r3 + 1
                int r5 = r0 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r4, r6, r0)
                r0 = r5
                goto L35
            L49:
                r7 = r0
                r0 = r3
                goto L9d
            L4c:
                boolean r0 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$600(r2)
                if (r0 == 0) goto L64
                if (r3 >= r1) goto L5f
                int r0 = r3 + 1
                r3 = r11[r3]
                int r4 = r7 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$700(r2, r3, r6, r7)
                r7 = r4
                goto L9d
            L5f:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r0
            L64:
                boolean r0 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$800(r2)
                if (r0 == 0) goto L83
                int r0 = r1 + (-1)
                if (r3 >= r0) goto L7e
                int r0 = r3 + 1
                r3 = r11[r3]
                int r4 = r0 + 1
                r0 = r11[r0]
                int r5 = r7 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$900(r2, r3, r0, r6, r7)
                r0 = r4
                r7 = r5
                goto L9d
            L7e:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r0
            L83:
                int r0 = r1 + (-2)
                if (r3 >= r0) goto L9e
                int r0 = r3 + 1
                r3 = r11[r3]
                int r4 = r0 + 1
                r0 = r11[r0]
                int r8 = r4 + 1
                r5 = r11[r4]
                int r9 = r7 + 1
                r4 = r0
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$1000(r2, r3, r4, r5, r6, r7)
                int r9 = r9 + 1
                r0 = r8
                r7 = r9
            L9d:
                goto L23
            L9e:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r0
            La3:
                java.lang.String r2 = new java.lang.String
                r3 = 0
                r2.<init>(r6, r3, r7)
                return r2
            Laa:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                int r1 = r11.length
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
                java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
                java.lang.String r2 = "buffer length=%d, index=%d, size=%d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        java.lang.String decodeUtf8Direct(java.nio.ByteBuffer r2, int r3, int r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                java.lang.String r0 = r1.decodeUtf8Default(r2, r3, r4)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        int encodeUtf8(java.lang.CharSequence r11, byte[] r12, int r13, int r14) {
                r10 = this;
                int r0 = r11.length()
                r1 = r13
                r2 = 0
                int r3 = r13 + r14
            L8:
                r4 = 128(0x80, float:1.8E-43)
                if (r2 >= r0) goto L1f
                int r5 = r2 + r1
                if (r5 >= r3) goto L1f
                char r5 = r11.charAt(r2)
                r6 = r5
                if (r5 >= r4) goto L1f
                int r4 = r1 + r2
                byte r5 = (byte) r6
                r12[r4] = r5
                int r2 = r2 + 1
                goto L8
            L1f:
                if (r2 != r0) goto L24
                int r4 = r1 + r0
                return r4
            L24:
                int r1 = r1 + r2
            L25:
                if (r2 >= r0) goto L10c
                char r5 = r11.charAt(r2)
                if (r5 >= r4) goto L37
                if (r1 >= r3) goto L37
                int r6 = r1 + 1
                byte r7 = (byte) r5
                r12[r1] = r7
                r1 = r6
                goto Lbf
            L37:
                r6 = 2048(0x800, float:2.87E-42)
                if (r5 >= r6) goto L51
                int r6 = r3 + (-2)
                if (r1 > r6) goto L51
                int r6 = r1 + 1
                int r7 = r5 >>> 6
                r7 = r7 | 960(0x3c0, float:1.345E-42)
                byte r7 = (byte) r7
                r12[r1] = r7
                int r1 = r6 + 1
                r7 = r5 & 63
                r7 = r7 | r4
                byte r7 = (byte) r7
                r12[r6] = r7
                goto Lbf
            L51:
                r6 = 57343(0xdfff, float:8.0355E-41)
                r7 = 55296(0xd800, float:7.7486E-41)
                if (r5 < r7) goto L5b
                if (r6 >= r5) goto L7c
            L5b:
                int r8 = r3 + (-3)
                if (r1 > r8) goto L7c
                int r6 = r1 + 1
                int r7 = r5 >>> 12
                r7 = r7 | 480(0x1e0, float:6.73E-43)
                byte r7 = (byte) r7
                r12[r1] = r7
                int r1 = r6 + 1
                int r7 = r5 >>> 6
                r7 = r7 & 63
                r7 = r7 | r4
                byte r7 = (byte) r7
                r12[r6] = r7
                int r6 = r1 + 1
                r7 = r5 & 63
                r7 = r7 | r4
                byte r7 = (byte) r7
                r12[r1] = r7
                r1 = r6
                goto Lbf
            L7c:
                int r8 = r3 + (-4)
                if (r1 > r8) goto Lcb
                int r6 = r2 + 1
                int r7 = r11.length()
                if (r6 == r7) goto Lc3
                int r2 = r2 + 1
                char r6 = r11.charAt(r2)
                r7 = r6
                boolean r6 = java.lang.Character.isSurrogatePair(r5, r6)
                if (r6 == 0) goto Lc3
                int r6 = java.lang.Character.toCodePoint(r5, r7)
                int r8 = r1 + 1
                int r9 = r6 >>> 18
                r9 = r9 | 240(0xf0, float:3.36E-43)
                byte r9 = (byte) r9
                r12[r1] = r9
                int r1 = r8 + 1
                int r9 = r6 >>> 12
                r9 = r9 & 63
                r9 = r9 | r4
                byte r9 = (byte) r9
                r12[r8] = r9
                int r8 = r1 + 1
                int r9 = r6 >>> 6
                r9 = r9 & 63
                r9 = r9 | r4
                byte r9 = (byte) r9
                r12[r1] = r9
                int r1 = r8 + 1
                r9 = r6 & 63
                r9 = r9 | r4
                byte r9 = (byte) r9
                r12[r8] = r9
            Lbf:
                int r2 = r2 + 1
                goto L25
            Lc3:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r4 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                int r6 = r2 + (-1)
                r4.<init>(r6, r0)
                throw r4
            Lcb:
                if (r7 > r5) goto Le9
                if (r5 > r6) goto Le9
                int r4 = r2 + 1
                int r6 = r11.length()
                if (r4 == r6) goto Le3
                int r4 = r2 + 1
                char r4 = r11.charAt(r4)
                boolean r4 = java.lang.Character.isSurrogatePair(r5, r4)
                if (r4 != 0) goto Le9
            Le3:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r4 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                r4.<init>(r2, r0)
                throw r4
            Le9:
                java.lang.ArrayIndexOutOfBoundsException r4 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "Failed writing "
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.StringBuilder r6 = r6.append(r5)
                java.lang.String r7 = " at index "
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.StringBuilder r6 = r6.append(r1)
                java.lang.String r6 = r6.toString()
                r4.<init>(r6)
                throw r4
            L10c:
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        void encodeUtf8Direct(java.lang.CharSequence r1, java.nio.ByteBuffer r2) {
                r0 = this;
                r0.encodeUtf8Default(r1, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        int partialIsValidUtf8(int r8, byte[] r9, int r10, int r11) {
                r7 = this;
                if (r8 == 0) goto L89
                if (r10 < r11) goto L5
                return r8
            L5:
                byte r0 = (byte) r8
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1d
                r1 = -62
                if (r0 < r1) goto L1c
                int r1 = r10 + 1
                r10 = r9[r10]
                if (r10 <= r3) goto L19
                r10 = r1
                goto L1c
            L19:
                r10 = r1
                goto L89
            L1c:
                return r2
            L1d:
                r4 = -16
                if (r0 >= r4) goto L4c
                int r4 = r8 >> 8
                int r4 = ~r4
                byte r4 = (byte) r4
                if (r4 != 0) goto L33
                int r5 = r10 + 1
                r4 = r9[r10]
                if (r5 < r11) goto L32
                int r10 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r0, r4)
                return r10
            L32:
                r10 = r5
            L33:
                if (r4 > r3) goto L4b
                r5 = -96
                if (r0 != r1) goto L3b
                if (r4 < r5) goto L4b
            L3b:
                r1 = -19
                if (r0 != r1) goto L41
                if (r4 >= r5) goto L4b
            L41:
                int r1 = r10 + 1
                r10 = r9[r10]
                if (r10 <= r3) goto L49
                r10 = r1
                goto L4b
            L49:
                r10 = r1
                goto L89
            L4b:
                return r2
            L4c:
                int r1 = r8 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L60
                int r5 = r10 + 1
                r1 = r9[r10]
                if (r5 < r11) goto L5e
                int r10 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r0, r1)
                return r10
            L5e:
                r10 = r5
                goto L63
            L60:
                int r5 = r8 >> 16
                byte r4 = (byte) r5
            L63:
                if (r4 != 0) goto L71
                int r5 = r10 + 1
                r4 = r9[r10]
                if (r5 < r11) goto L70
                int r10 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r0, r1, r4)
                return r10
            L70:
                r10 = r5
            L71:
                if (r1 > r3) goto L88
                int r5 = r0 << 28
                int r6 = r1 + 112
                int r5 = r5 + r6
                int r5 = r5 >> 30
                if (r5 != 0) goto L88
                if (r4 > r3) goto L88
                int r5 = r10 + 1
                r10 = r9[r10]
                if (r10 <= r3) goto L86
                r10 = r5
                goto L88
            L86:
                r10 = r5
                goto L89
            L88:
                return r2
            L89:
                int r0 = partialIsValidUtf8(r9, r10, r11)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        int partialIsValidUtf8Direct(int r2, java.nio.ByteBuffer r3, int r4, int r5) {
                r1 = this;
                int r0 = r1.partialIsValidUtf8Default(r2, r3, r4, r5)
                return r0
        }
    }

    static class UnpairedSurrogateException extends java.lang.IllegalArgumentException {
        UnpairedSurrogateException(int r3, int r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unpaired surrogate at index "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.String r1 = " of "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                return
        }
    }

    static final class UnsafeProcessor extends com.google.crypto.tink.shaded.protobuf.Utf8.Processor {
        UnsafeProcessor() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isAvailable() {
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.hasUnsafeArrayOperations()
                if (r0 == 0) goto Le
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations()
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        private static int partialIsValidUtf8(long r11, int r13) {
                int r0 = unsafeEstimateConsecutiveAscii(r11, r13)
                long r1 = (long) r0
                long r11 = r11 + r1
                int r13 = r13 - r0
            L7:
                r1 = 0
            L8:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11)
                r1 = r11
                if (r11 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L8
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1e
                r2 = 0
                return r2
            L1e:
                int r13 = r13 + (-1)
                r4 = -32
                r5 = -65
                r6 = -1
                if (r1 >= r4) goto L3c
                if (r13 != 0) goto L2a
                return r1
            L2a:
                int r13 = r13 + (-1)
                r4 = -62
                if (r1 < r4) goto L3b
                long r2 = r2 + r11
                byte r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11)
                if (r11 <= r5) goto L39
                r11 = r2
                goto L3b
            L39:
                r11 = r2
                goto L97
            L3b:
                return r6
            L3c:
                r7 = -16
                if (r1 >= r7) goto L6a
                r7 = 2
                if (r13 >= r7) goto L48
                int r2 = unsafeIncompleteStateFor(r11, r1, r13)
                return r2
            L48:
                int r13 = r13 + (-2)
                long r7 = r11 + r2
                byte r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11)
                if (r11 > r5) goto L69
                r12 = -96
                if (r1 != r4) goto L58
                if (r11 < r12) goto L69
            L58:
                r4 = -19
                if (r1 != r4) goto L5e
                if (r11 >= r12) goto L69
            L5e:
                long r2 = r2 + r7
                byte r12 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r7)
                if (r12 <= r5) goto L67
                r7 = r2
                goto L69
            L67:
                r11 = r2
                goto L97
            L69:
                return r6
            L6a:
                r4 = 3
                if (r13 >= r4) goto L72
                int r2 = unsafeIncompleteStateFor(r11, r1, r13)
                return r2
            L72:
                int r13 = r13 + (-3)
                long r7 = r11 + r2
                byte r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11)
                if (r11 > r5) goto L9a
                int r12 = r1 << 28
                int r4 = r11 + 112
                int r12 = r12 + r4
                int r12 = r12 >> 30
                if (r12 != 0) goto L9a
                long r9 = r7 + r2
                byte r12 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r7)
                if (r12 > r5) goto L99
                long r7 = r9 + r2
                byte r12 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r9)
                if (r12 <= r5) goto L96
                goto L9a
            L96:
                r11 = r7
            L97:
                goto L7
            L99:
                r7 = r9
            L9a:
                return r6
        }

        private static int partialIsValidUtf8(byte[] r11, long r12, int r14) {
                int r0 = unsafeEstimateConsecutiveAscii(r11, r12, r14)
                int r14 = r14 - r0
                long r1 = (long) r0
                long r12 = r12 + r1
            L7:
                r1 = 0
            L8:
                r2 = 1
                if (r14 <= 0) goto L1a
                long r4 = r12 + r2
                byte r12 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11, r12)
                r1 = r12
                if (r12 < 0) goto L19
                int r14 = r14 + (-1)
                r12 = r4
                goto L8
            L19:
                r12 = r4
            L1a:
                if (r14 != 0) goto L1e
                r2 = 0
                return r2
            L1e:
                int r14 = r14 + (-1)
                r4 = -32
                r5 = -65
                r6 = -1
                if (r1 >= r4) goto L3c
                if (r14 != 0) goto L2a
                return r1
            L2a:
                int r14 = r14 + (-1)
                r4 = -62
                if (r1 < r4) goto L3b
                long r2 = r2 + r12
                byte r12 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11, r12)
                if (r12 <= r5) goto L39
                r12 = r2
                goto L3b
            L39:
                r12 = r2
                goto L99
            L3b:
                return r6
            L3c:
                r7 = -16
                if (r1 >= r7) goto L6b
                r7 = 2
                if (r14 >= r7) goto L48
                int r2 = unsafeIncompleteStateFor(r11, r1, r12, r14)
                return r2
            L48:
                int r14 = r14 + (-2)
                long r7 = r12 + r2
                byte r12 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11, r12)
                r13 = r12
                if (r12 > r5) goto L6a
                r12 = -96
                if (r1 != r4) goto L59
                if (r13 < r12) goto L6a
            L59:
                r4 = -19
                if (r1 != r4) goto L5f
                if (r13 >= r12) goto L6a
            L5f:
                long r2 = r2 + r7
                byte r12 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11, r7)
                if (r12 <= r5) goto L68
                r7 = r2
                goto L6a
            L68:
                r12 = r2
                goto L99
            L6a:
                return r6
            L6b:
                r4 = 3
                if (r14 >= r4) goto L73
                int r2 = unsafeIncompleteStateFor(r11, r1, r12, r14)
                return r2
            L73:
                int r14 = r14 + (-3)
                long r7 = r12 + r2
                byte r12 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11, r12)
                r13 = r12
                if (r12 > r5) goto L9c
                int r12 = r1 << 28
                int r4 = r13 + 112
                int r12 = r12 + r4
                int r12 = r12 >> 30
                if (r12 != 0) goto L9c
                long r9 = r7 + r2
                byte r12 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11, r7)
                if (r12 > r5) goto L9b
                long r7 = r9 + r2
                byte r12 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11, r9)
                if (r12 <= r5) goto L98
                goto L9c
            L98:
                r12 = r7
            L99:
                goto L7
            L9b:
                r7 = r9
            L9c:
                return r6
        }

        private static int unsafeEstimateConsecutiveAscii(long r6, int r8) {
                r0 = r8
                r1 = 16
                if (r0 >= r1) goto L7
                r1 = 0
                return r1
            L7:
                long r1 = -r6
                r3 = 7
                long r1 = r1 & r3
                int r1 = (int) r1
                r2 = r1
            Ld:
                if (r2 <= 0) goto L1f
                r3 = 1
                long r3 = r3 + r6
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                if (r6 >= 0) goto L1b
                int r6 = r1 - r2
                return r6
            L1b:
                int r2 = r2 + (-1)
                r6 = r3
                goto Ld
            L1f:
                int r0 = r0 - r1
            L20:
                r2 = 8
                if (r0 < r2) goto L3a
                long r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r6)
                r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r2 = r2 & r4
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 != 0) goto L3a
                r2 = 8
                long r6 = r6 + r2
                int r0 = r0 + (-8)
                goto L20
            L3a:
                int r2 = r8 - r0
                return r2
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] r8, long r9, int r11) {
                r0 = 16
                if (r11 >= r0) goto L6
                r0 = 0
                return r0
            L6:
                int r0 = (int) r9
                r0 = r0 & 7
                int r0 = 8 - r0
                r1 = 0
            Lc:
                r2 = 1
                if (r1 >= r0) goto L1c
                long r2 = r2 + r9
                byte r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r9 >= 0) goto L18
                return r1
            L18:
                int r1 = r1 + 1
                r9 = r2
                goto Lc
            L1c:
                int r4 = r1 + 8
                if (r4 > r11) goto L3a
                long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BYTE_ARRAY_BASE_OFFSET
                long r4 = r4 + r9
                long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r8, r4)
                r6 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r4 = r4 & r6
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 == 0) goto L34
                goto L3a
            L34:
                r4 = 8
                long r9 = r9 + r4
                int r1 = r1 + 8
                goto L1c
            L3a:
                if (r1 >= r11) goto L49
                long r4 = r9 + r2
                byte r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r9 >= 0) goto L45
                return r1
            L45:
                int r1 = r1 + 1
                r9 = r4
                goto L3a
            L49:
                return r11
        }

        private static int unsafeIncompleteStateFor(long r3, int r5, int r6) {
                switch(r6) {
                    case 0: goto L23;
                    case 1: goto L1a;
                    case 2: goto L9;
                    default: goto L3;
                }
            L3:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L9:
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                r1 = 1
                long r1 = r1 + r3
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r1)
                int r0 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r5, r0, r1)
                return r0
            L1a:
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                int r0 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r5, r0)
                return r0
            L23:
                int r0 = com.google.crypto.tink.shaded.protobuf.Utf8.access$1200(r5)
                return r0
        }

        private static int unsafeIncompleteStateFor(byte[] r3, int r4, long r5, int r7) {
                switch(r7) {
                    case 0: goto L23;
                    case 1: goto L1a;
                    case 2: goto L9;
                    default: goto L3;
                }
            L3:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L9:
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3, r5)
                r1 = 1
                long r1 = r1 + r5
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3, r1)
                int r0 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r4, r0, r1)
                return r0
            L1a:
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3, r5)
                int r0 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r4, r0)
                return r0
            L23:
                int r0 = com.google.crypto.tink.shaded.protobuf.Utf8.access$1200(r4)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        java.lang.String decodeUtf8(byte[] r4, int r5, int r6) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r3 = this;
                java.lang.String r0 = new java.lang.String
                java.nio.charset.Charset r1 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                r0.<init>(r4, r5, r6, r1)
                java.lang.String r1 = "�"
                boolean r1 = r0.contains(r1)
                if (r1 != 0) goto L10
                return r0
            L10:
                java.nio.charset.Charset r1 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                byte[] r1 = r0.getBytes(r1)
                int r2 = r5 + r6
                byte[] r2 = java.util.Arrays.copyOfRange(r4, r5, r2)
                boolean r1 = java.util.Arrays.equals(r1, r2)
                if (r1 == 0) goto L23
                return r0
            L23:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        java.lang.String decodeUtf8Direct(java.nio.ByteBuffer r17, int r18, int r19) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r16 = this;
                r0 = r18
                r1 = r19
                r2 = r0 | r1
                int r3 = r17.limit()
                int r3 = r3 - r0
                int r3 = r3 - r1
                r2 = r2 | r3
                if (r2 < 0) goto Ld7
                long r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.addressOffset(r17)
                long r4 = (long) r0
                long r2 = r2 + r4
                long r4 = (long) r1
                long r4 = r4 + r2
                char[] r10 = new char[r1]
                r6 = 0
            L1a:
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r12 = 1
                if (r7 >= 0) goto L33
                byte r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                boolean r8 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r7)
                if (r8 != 0) goto L2b
                goto L33
            L2b:
                long r2 = r2 + r12
                int r8 = r6 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r7, r10, r6)
                r6 = r8
                goto L1a
            L33:
                r11 = r6
            L34:
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 >= 0) goto Ld0
                long r6 = r2 + r12
                r7 = r6
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                boolean r2 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r6)
                if (r2 == 0) goto L64
                int r2 = r11 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r6, r10, r11)
            L4a:
                int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r3 >= 0) goto L61
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r7)
                boolean r9 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r3)
                if (r9 != 0) goto L59
                goto L61
            L59:
                long r7 = r7 + r12
                int r9 = r2 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r3, r10, r2)
                r2 = r9
                goto L4a
            L61:
                r11 = r2
                r2 = r7
                goto Lc9
            L64:
                boolean r2 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$600(r6)
                if (r2 == 0) goto L80
                int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r2 >= 0) goto L7b
                long r2 = r7 + r12
                byte r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r7)
                int r8 = r11 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$700(r6, r7, r10, r11)
                r11 = r8
                goto Lc9
            L7b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r2
            L80:
                boolean r2 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$800(r6)
                if (r2 == 0) goto La5
                long r2 = r4 - r12
                int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r2 >= 0) goto La0
                long r2 = r7 + r12
                byte r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r7)
                long r8 = r2 + r12
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                int r3 = r11 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$900(r6, r7, r2, r10, r11)
                r11 = r3
                r2 = r8
                goto Lc9
            La0:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r2
            La5:
                r2 = 2
                long r2 = r4 - r2
                int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r2 >= 0) goto Lcb
                long r2 = r7 + r12
                byte r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r7)
                long r8 = r2 + r12
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                long r14 = r8 + r12
                byte r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8)
                int r3 = r11 + 1
                r8 = r2
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$1000(r6, r7, r8, r9, r10, r11)
                int r3 = r3 + 1
                r11 = r3
                r2 = r14
            Lc9:
                goto L34
            Lcb:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r2
            Ld0:
                java.lang.String r6 = new java.lang.String
                r7 = 0
                r6.<init>(r10, r7, r11)
                return r6
            Ld7:
                java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
                int r3 = r17.limit()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
                java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5}
                java.lang.String r4 = "buffer limit=%d, index=%d, limit=%d"
                java.lang.String r3 = java.lang.String.format(r4, r3)
                r2.<init>(r3)
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        int encodeUtf8(java.lang.CharSequence r21, byte[] r22, int r23, int r24) {
                r20 = this;
                r0 = r21
                r1 = r22
                r2 = r23
                r3 = r24
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r0.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L149
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L149
                r11 = 0
            L1a:
                r12 = 128(0x80, float:1.8E-43)
                r13 = 1
                if (r11 >= r8) goto L36
                char r15 = r0.charAt(r11)
                r16 = r15
                if (r15 >= r12) goto L34
                long r12 = r4 + r13
                r15 = r16
                byte r14 = (byte) r15
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r4, r14)
                int r11 = r11 + 1
                r4 = r12
                goto L1a
            L34:
                r15 = r16
            L36:
                if (r11 != r8) goto L3a
                int r9 = (int) r4
                return r9
            L3a:
                if (r11 >= r8) goto L147
                char r15 = r0.charAt(r11)
                if (r15 >= r12) goto L53
                int r16 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r16 >= 0) goto L53
                long r16 = r4 + r13
                r18 = r13
                byte r13 = (byte) r15
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r4, r13)
                r3 = r12
                r4 = r16
                goto Lfb
            L53:
                r18 = r13
                r13 = 2048(0x800, float:2.87E-42)
                if (r15 >= r13) goto L7a
                r13 = 2
                long r13 = r6 - r13
                int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
                if (r13 > 0) goto L7a
                long r13 = r4 + r18
                int r12 = r15 >>> 6
                r12 = r12 | 960(0x3c0, float:1.345E-42)
                byte r12 = (byte) r12
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r4, r12)
                long r4 = r13 + r18
                r12 = r15 & 63
                r2 = 128(0x80, float:1.8E-43)
                r12 = r12 | r2
                byte r2 = (byte) r12
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r13, r2)
                r3 = 128(0x80, float:1.8E-43)
                goto Lfb
            L7a:
                r2 = 57343(0xdfff, float:8.0355E-41)
                r12 = 55296(0xd800, float:7.7486E-41)
                if (r15 < r12) goto L84
                if (r2 >= r15) goto Lb0
            L84:
                r13 = 3
                long r13 = r6 - r13
                int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
                if (r13 > 0) goto Lb0
                long r13 = r4 + r18
                int r2 = r15 >>> 12
                r2 = r2 | 480(0x1e0, float:6.73E-43)
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r4, r2)
                long r4 = r13 + r18
                int r2 = r15 >>> 6
                r2 = r2 & 63
                r12 = 128(0x80, float:1.8E-43)
                r2 = r2 | r12
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r13, r2)
                long r13 = r4 + r18
                r2 = r15 & 63
                r2 = r2 | r12
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r4, r2)
                r4 = r13
                r3 = 128(0x80, float:1.8E-43)
                goto Lfb
            Lb0:
                r13 = 4
                long r13 = r6 - r13
                int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
                if (r13 > 0) goto L10e
                int r2 = r11 + 1
                if (r2 == r8) goto L106
                int r11 = r11 + 1
                char r2 = r0.charAt(r11)
                r12 = r2
                boolean r2 = java.lang.Character.isSurrogatePair(r15, r2)
                if (r2 == 0) goto L106
                int r2 = java.lang.Character.toCodePoint(r15, r12)
                long r13 = r4 + r18
                r17 = r2
                int r2 = r17 >>> 18
                r2 = r2 | 240(0xf0, float:3.36E-43)
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r4, r2)
                long r4 = r13 + r18
                int r2 = r17 >>> 12
                r2 = r2 & 63
                r3 = 128(0x80, float:1.8E-43)
                r2 = r2 | r3
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r13, r2)
                long r13 = r4 + r18
                int r2 = r17 >>> 6
                r2 = r2 & 63
                r2 = r2 | r3
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r4, r2)
                long r4 = r13 + r18
                r2 = r17 & 63
                r2 = r2 | r3
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r13, r2)
            Lfb:
                int r11 = r11 + 1
                r2 = r23
                r12 = r3
                r13 = r18
                r3 = r24
                goto L3a
            L106:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r2 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                int r3 = r11 + (-1)
                r2.<init>(r3, r8)
                throw r2
            L10e:
                if (r12 > r15) goto L128
                if (r15 > r2) goto L128
                int r2 = r11 + 1
                if (r2 == r8) goto L122
                int r2 = r11 + 1
                char r2 = r0.charAt(r2)
                boolean r2 = java.lang.Character.isSurrogatePair(r15, r2)
                if (r2 != 0) goto L128
            L122:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r2 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                r2.<init>(r11, r8)
                throw r2
            L128:
                java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r3 = r3.append(r10)
                java.lang.StringBuilder r3 = r3.append(r15)
                java.lang.StringBuilder r3 = r3.append(r9)
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L147:
                int r2 = (int) r4
                return r2
            L149:
                java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r3 = r3.append(r10)
                int r10 = r8 + (-1)
                char r10 = r0.charAt(r10)
                java.lang.StringBuilder r3 = r3.append(r10)
                java.lang.StringBuilder r3 = r3.append(r9)
                int r9 = r23 + r24
                java.lang.StringBuilder r3 = r3.append(r9)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        void encodeUtf8Direct(java.lang.CharSequence r23, java.nio.ByteBuffer r24) {
                r22 = this;
                r0 = r23
                r1 = r24
                long r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.addressOffset(r1)
                int r4 = r1.position()
                long r4 = (long) r4
                long r4 = r4 + r2
                int r6 = r1.limit()
                long r6 = (long) r6
                long r6 = r6 + r2
                int r8 = r0.length()
                long r9 = (long) r8
                long r11 = r6 - r4
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                java.lang.String r10 = " at index "
                java.lang.String r11 = "Failed writing "
                if (r9 > 0) goto L164
                r9 = 0
            L24:
                r12 = 128(0x80, float:1.8E-43)
                r13 = 1
                if (r9 >= r8) goto L40
                char r15 = r0.charAt(r9)
                r16 = r15
                if (r15 >= r12) goto L3e
                long r12 = r4 + r13
                r15 = r16
                byte r14 = (byte) r15
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r4, r14)
                int r9 = r9 + 1
                r4 = r12
                goto L24
            L3e:
                r15 = r16
            L40:
                if (r9 != r8) goto L49
                long r10 = r4 - r2
                int r10 = (int) r10
                r1.position(r10)
                return
            L49:
                if (r9 >= r8) goto L15b
                char r15 = r0.charAt(r9)
                if (r15 >= r12) goto L64
                int r16 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r16 >= 0) goto L64
                long r16 = r4 + r13
                r18 = r13
                byte r13 = (byte) r15
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r4, r13)
                r20 = r2
                r2 = r12
                r4 = r16
                goto L111
            L64:
                r18 = r13
                r13 = 2048(0x800, float:2.87E-42)
                if (r15 >= r13) goto L8e
                r13 = 2
                long r13 = r6 - r13
                int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
                if (r13 > 0) goto L8e
                long r13 = r4 + r18
                int r12 = r15 >>> 6
                r12 = r12 | 960(0x3c0, float:1.345E-42)
                byte r12 = (byte) r12
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r4, r12)
                long r4 = r13 + r18
                r12 = r15 & 63
                r20 = r2
                r2 = 128(0x80, float:1.8E-43)
                r3 = r12 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r13, r2)
                r2 = 128(0x80, float:1.8E-43)
                goto L111
            L8e:
                r20 = r2
                r2 = 57343(0xdfff, float:8.0355E-41)
                r3 = 55296(0xd800, float:7.7486E-41)
                if (r15 < r3) goto L9a
                if (r2 >= r15) goto Lc6
            L9a:
                r12 = 3
                long r12 = r6 - r12
                int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
                if (r12 > 0) goto Lc6
                long r13 = r4 + r18
                int r2 = r15 >>> 12
                r2 = r2 | 480(0x1e0, float:6.73E-43)
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r4, r2)
                long r2 = r13 + r18
                int r4 = r15 >>> 6
                r4 = r4 & 63
                r5 = 128(0x80, float:1.8E-43)
                r4 = r4 | r5
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r13, r4)
                long r13 = r2 + r18
                r4 = r15 & 63
                r4 = r4 | r5
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r2, r4)
                r4 = r13
                r2 = 128(0x80, float:1.8E-43)
                goto L111
            Lc6:
                r12 = 4
                long r12 = r6 - r12
                int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
                if (r12 > 0) goto L122
                int r2 = r9 + 1
                if (r2 == r8) goto L11a
                int r9 = r9 + 1
                char r2 = r0.charAt(r9)
                r3 = r2
                boolean r2 = java.lang.Character.isSurrogatePair(r15, r2)
                if (r2 == 0) goto L11a
                int r2 = java.lang.Character.toCodePoint(r15, r3)
                long r13 = r4 + r18
                int r12 = r2 >>> 18
                r12 = r12 | 240(0xf0, float:3.36E-43)
                byte r12 = (byte) r12
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r4, r12)
                long r4 = r13 + r18
                int r12 = r2 >>> 12
                r12 = r12 & 63
                r17 = r2
                r2 = 128(0x80, float:1.8E-43)
                r12 = r12 | r2
                byte r12 = (byte) r12
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r13, r12)
                long r13 = r4 + r18
                int r12 = r17 >>> 6
                r12 = r12 & 63
                r12 = r12 | r2
                byte r12 = (byte) r12
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r4, r12)
                long r4 = r13 + r18
                r12 = r17 & 63
                r12 = r12 | r2
                byte r12 = (byte) r12
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r13, r12)
            L111:
                int r9 = r9 + 1
                r12 = r2
                r13 = r18
                r2 = r20
                goto L49
            L11a:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r2 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                int r3 = r9 + (-1)
                r2.<init>(r3, r8)
                throw r2
            L122:
                if (r3 > r15) goto L13c
                if (r15 > r2) goto L13c
                int r2 = r9 + 1
                if (r2 == r8) goto L136
                int r2 = r9 + 1
                char r2 = r0.charAt(r2)
                boolean r2 = java.lang.Character.isSurrogatePair(r15, r2)
                if (r2 != 0) goto L13c
            L136:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r2 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                r2.<init>(r9, r8)
                throw r2
            L13c:
                java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r3 = r3.append(r11)
                java.lang.StringBuilder r3 = r3.append(r15)
                java.lang.StringBuilder r3 = r3.append(r10)
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L15b:
                r20 = r2
                long r2 = r4 - r20
                int r2 = (int) r2
                r1.position(r2)
                return
            L164:
                r20 = r2
                java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r3 = r3.append(r11)
                int r9 = r8 + (-1)
                char r9 = r0.charAt(r9)
                java.lang.StringBuilder r3 = r3.append(r9)
                java.lang.StringBuilder r3 = r3.append(r10)
                int r9 = r1.limit()
                java.lang.StringBuilder r3 = r3.append(r9)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        int partialIsValidUtf8(int r18, byte[] r19, int r20, int r21) {
                r17 = this;
                r0 = r18
                r1 = r19
                r2 = r20
                r3 = r21
                r4 = r2 | r3
                int r5 = r1.length
                int r5 = r5 - r3
                r4 = r4 | r5
                if (r4 < 0) goto Lb6
                long r4 = (long) r2
                long r6 = (long) r3
                if (r0 == 0) goto Lae
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 < 0) goto L18
                return r0
            L18:
                byte r8 = (byte) r0
                r9 = -32
                r10 = -1
                r11 = -65
                r12 = 1
                if (r8 >= r9) goto L33
                r9 = -62
                if (r8 < r9) goto L32
                long r12 = r12 + r4
                byte r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r1, r4)
                if (r4 <= r11) goto L2f
                r4 = r12
                goto L32
            L2f:
                r4 = r12
                goto Lae
            L32:
                return r10
            L33:
                r14 = -16
                if (r8 >= r14) goto L67
                int r14 = r0 >> 8
                int r14 = ~r14
                byte r14 = (byte) r14
                if (r14 != 0) goto L4d
                long r15 = r4 + r12
                byte r14 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r1, r4)
                int r4 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
                if (r4 < 0) goto L4c
                int r4 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r8, r14)
                return r4
            L4c:
                r4 = r15
            L4d:
                if (r14 > r11) goto L66
                r15 = -96
                if (r8 != r9) goto L55
                if (r14 < r15) goto L66
            L55:
                r9 = -19
                if (r8 != r9) goto L5b
                if (r14 >= r15) goto L66
            L5b:
                long r12 = r12 + r4
                byte r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r1, r4)
                if (r4 <= r11) goto L64
                r4 = r12
                goto L66
            L64:
                r4 = r12
                goto Lae
            L66:
                return r10
            L67:
                int r9 = r0 >> 8
                int r9 = ~r9
                byte r9 = (byte) r9
                r14 = 0
                if (r9 != 0) goto L7f
                long r15 = r4 + r12
                byte r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r1, r4)
                int r4 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
                if (r4 < 0) goto L7d
                int r4 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r8, r9)
                return r4
            L7d:
                r4 = r15
                goto L82
            L7f:
                int r15 = r0 >> 16
                byte r14 = (byte) r15
            L82:
                if (r14 != 0) goto L94
                long r15 = r4 + r12
                byte r14 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r1, r4)
                int r4 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
                if (r4 < 0) goto L93
                int r4 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r8, r9, r14)
                return r4
            L93:
                r4 = r15
            L94:
                if (r9 > r11) goto Lad
                int r15 = r8 << 28
                int r16 = r9 + 112
                int r15 = r15 + r16
                int r15 = r15 >> 30
                if (r15 != 0) goto Lad
                if (r14 > r11) goto Lad
                long r12 = r12 + r4
                byte r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r1, r4)
                if (r4 <= r11) goto Lab
                r4 = r12
                goto Lad
            Lab:
                r4 = r12
                goto Lae
            Lad:
                return r10
            Lae:
                long r8 = r6 - r4
                int r8 = (int) r8
                int r8 = partialIsValidUtf8(r1, r4, r8)
                return r8
            Lb6:
                java.lang.ArrayIndexOutOfBoundsException r4 = new java.lang.ArrayIndexOutOfBoundsException
                int r5 = r1.length
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
                java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r7}
                java.lang.String r6 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r5 = java.lang.String.format(r6, r5)
                r4.<init>(r5)
                throw r4
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        int partialIsValidUtf8Direct(int r16, java.nio.ByteBuffer r17, int r18, int r19) {
                r15 = this;
                r0 = r16
                r1 = r18
                r2 = r1 | r19
                int r3 = r17.limit()
                int r3 = r3 - r19
                r2 = r2 | r3
                if (r2 < 0) goto Lbd
                long r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.addressOffset(r17)
                long r4 = (long) r1
                long r2 = r2 + r4
                int r4 = r19 - r1
                long r4 = (long) r4
                long r4 = r4 + r2
                if (r0 == 0) goto Lb5
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L20
                return r0
            L20:
                byte r6 = (byte) r0
                r7 = -32
                r8 = -1
                r9 = -65
                r10 = 1
                if (r6 >= r7) goto L3b
                r7 = -62
                if (r6 < r7) goto L3a
                long r10 = r10 + r2
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                if (r2 <= r9) goto L37
                r2 = r10
                goto L3a
            L37:
                r2 = r10
                goto Lb5
            L3a:
                return r8
            L3b:
                r12 = -16
                if (r6 >= r12) goto L6f
                int r12 = r0 >> 8
                int r12 = ~r12
                byte r12 = (byte) r12
                if (r12 != 0) goto L55
                long r13 = r2 + r10
                byte r12 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                int r2 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
                if (r2 < 0) goto L54
                int r2 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r6, r12)
                return r2
            L54:
                r2 = r13
            L55:
                if (r12 > r9) goto L6e
                r13 = -96
                if (r6 != r7) goto L5d
                if (r12 < r13) goto L6e
            L5d:
                r7 = -19
                if (r6 != r7) goto L63
                if (r12 >= r13) goto L6e
            L63:
                long r10 = r10 + r2
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                if (r2 <= r9) goto L6c
                r2 = r10
                goto L6e
            L6c:
                r2 = r10
                goto Lb5
            L6e:
                return r8
            L6f:
                int r7 = r0 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                r12 = 0
                if (r7 != 0) goto L87
                long r13 = r2 + r10
                byte r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                int r2 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
                if (r2 < 0) goto L85
                int r2 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r6, r7)
                return r2
            L85:
                r2 = r13
                goto L8a
            L87:
                int r13 = r0 >> 16
                byte r12 = (byte) r13
            L8a:
                if (r12 != 0) goto L9c
                long r13 = r2 + r10
                byte r12 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                int r2 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
                if (r2 < 0) goto L9b
                int r2 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r6, r7, r12)
                return r2
            L9b:
                r2 = r13
            L9c:
                if (r7 > r9) goto Lb4
                int r13 = r6 << 28
                int r14 = r7 + 112
                int r13 = r13 + r14
                int r13 = r13 >> 30
                if (r13 != 0) goto Lb4
                if (r12 > r9) goto Lb4
                long r10 = r10 + r2
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                if (r2 <= r9) goto Lb2
                r2 = r10
                goto Lb4
            Lb2:
                r2 = r10
                goto Lb5
            Lb4:
                return r8
            Lb5:
                long r6 = r4 - r2
                int r6 = (int) r6
                int r6 = partialIsValidUtf8(r2, r6)
                return r6
            Lbd:
                java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
                int r3 = r17.limit()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r19)
                java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5}
                java.lang.String r4 = "buffer limit=%d, index=%d, limit=%d"
                java.lang.String r3 = java.lang.String.format(r4, r3)
                r2.<init>(r3)
                throw r2
        }
    }

    static {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.Utf8.UnsafeProcessor.isAvailable()
            if (r0 == 0) goto L12
            boolean r0 = com.google.crypto.tink.shaded.protobuf.Android.isOnAndroidDevice()
            if (r0 != 0) goto L12
            com.google.crypto.tink.shaded.protobuf.Utf8$UnsafeProcessor r0 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnsafeProcessor
            r0.<init>()
            goto L17
        L12:
            com.google.crypto.tink.shaded.protobuf.Utf8$SafeProcessor r0 = new com.google.crypto.tink.shaded.protobuf.Utf8$SafeProcessor
            r0.<init>()
        L17:
            com.google.crypto.tink.shaded.protobuf.Utf8.processor = r0
            return
    }

    private Utf8() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ int access$000(int r1, int r2) {
            int r0 = incompleteStateFor(r1, r2)
            return r0
    }

    static /* synthetic */ int access$100(int r1, int r2, int r3) {
            int r0 = incompleteStateFor(r1, r2, r3)
            return r0
    }

    static /* synthetic */ int access$1100(byte[] r1, int r2, int r3) {
            int r0 = incompleteStateFor(r1, r2, r3)
            return r0
    }

    static /* synthetic */ int access$1200(int r1) {
            int r0 = incompleteStateFor(r1)
            return r0
    }

    static /* synthetic */ int access$200(java.nio.ByteBuffer r1, int r2, int r3) {
            int r0 = estimateConsecutiveAscii(r1, r2, r3)
            return r0
    }

    static /* synthetic */ int access$300(java.nio.ByteBuffer r1, int r2, int r3, int r4) {
            int r0 = incompleteStateFor(r1, r2, r3, r4)
            return r0
    }

    static java.lang.String decodeUtf8(java.nio.ByteBuffer r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            java.lang.String r0 = r0.decodeUtf8(r1, r2, r3)
            return r0
    }

    static java.lang.String decodeUtf8(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            java.lang.String r0 = r0.decodeUtf8(r1, r2, r3)
            return r0
    }

    static int encode(java.lang.CharSequence r1, byte[] r2, int r3, int r4) {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            int r0 = r0.encodeUtf8(r1, r2, r3, r4)
            return r0
    }

    static void encodeUtf8(java.lang.CharSequence r1, java.nio.ByteBuffer r2) {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            r0.encodeUtf8(r1, r2)
            return
    }

    static int encodedLength(java.lang.CharSequence r9) {
            int r0 = r9.length()
            r1 = r0
            r2 = 0
        L6:
            if (r2 >= r0) goto L13
            char r3 = r9.charAt(r2)
            r4 = 128(0x80, float:1.8E-43)
            if (r3 >= r4) goto L13
            int r2 = r2 + 1
            goto L6
        L13:
            if (r2 >= r0) goto L2b
            char r3 = r9.charAt(r2)
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L25
            int r4 = 127 - r3
            int r4 = r4 >>> 31
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto L13
        L25:
            int r4 = encodedLengthGeneral(r9, r2)
            int r1 = r1 + r4
        L2b:
            if (r1 < r0) goto L2e
            return r1
        L2e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "UTF-8 length does not fit in int: "
            java.lang.StringBuilder r4 = r4.append(r5)
            long r5 = (long) r1
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            long r5 = r5 + r7
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    private static int encodedLengthGeneral(java.lang.CharSequence r6, int r7) {
            int r0 = r6.length()
            r1 = 0
            r2 = r7
        L6:
            if (r2 >= r0) goto L36
            char r3 = r6.charAt(r2)
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L16
            int r4 = 127 - r3
            int r4 = r4 >>> 31
            int r1 = r1 + r4
            goto L33
        L16:
            int r1 = r1 + 2
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r4 > r3) goto L33
            r4 = 57343(0xdfff, float:8.0355E-41)
            if (r3 > r4) goto L33
            int r4 = java.lang.Character.codePointAt(r6, r2)
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r4 < r5) goto L2d
            int r2 = r2 + 1
            goto L33
        L2d:
            com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r5 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
            r5.<init>(r2, r0)
            throw r5
        L33:
            int r2 = r2 + 1
            goto L6
        L36:
            return r1
    }

    private static int estimateConsecutiveAscii(java.nio.ByteBuffer r6, int r7, int r8) {
            r0 = r7
            int r1 = r8 + (-7)
        L3:
            if (r0 >= r1) goto L18
            long r2 = r6.getLong(r0)
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L18
            int r0 = r0 + 8
            goto L3
        L18:
            int r2 = r0 - r7
            return r2
    }

    private static int incompleteStateFor(int r1) {
            r0 = -12
            if (r1 <= r0) goto L6
            r0 = -1
            goto L7
        L6:
            r0 = r1
        L7:
            return r0
    }

    private static int incompleteStateFor(int r1, int r2) {
            r0 = -12
            if (r1 > r0) goto Ld
            r0 = -65
            if (r2 <= r0) goto L9
            goto Ld
        L9:
            int r0 = r2 << 8
            r0 = r0 ^ r1
            goto Le
        Ld:
            r0 = -1
        Le:
            return r0
    }

    private static int incompleteStateFor(int r2, int r3, int r4) {
            r0 = -12
            if (r2 > r0) goto L12
            r0 = -65
            if (r3 > r0) goto L12
            if (r4 <= r0) goto Lb
            goto L12
        Lb:
            int r0 = r3 << 8
            r0 = r0 ^ r2
            int r1 = r4 << 16
            r0 = r0 ^ r1
            goto L13
        L12:
            r0 = -1
        L13:
            return r0
    }

    private static int incompleteStateFor(java.nio.ByteBuffer r2, int r3, int r4, int r5) {
            switch(r5) {
                case 0: goto L21;
                case 1: goto L18;
                case 2: goto L9;
                default: goto L3;
            }
        L3:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L9:
            byte r0 = r2.get(r4)
            int r1 = r4 + 1
            byte r1 = r2.get(r1)
            int r0 = incompleteStateFor(r3, r0, r1)
            return r0
        L18:
            byte r0 = r2.get(r4)
            int r0 = incompleteStateFor(r3, r0)
            return r0
        L21:
            int r0 = incompleteStateFor(r3)
            return r0
    }

    private static int incompleteStateFor(byte[] r3, int r4, int r5) {
            int r0 = r4 + (-1)
            r0 = r3[r0]
            int r1 = r5 - r4
            switch(r1) {
                case 0: goto L21;
                case 1: goto L1a;
                case 2: goto Lf;
                default: goto L9;
            }
        L9:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        Lf:
            r1 = r3[r4]
            int r2 = r4 + 1
            r2 = r3[r2]
            int r1 = incompleteStateFor(r0, r1, r2)
            return r1
        L1a:
            r1 = r3[r4]
            int r1 = incompleteStateFor(r0, r1)
            return r1
        L21:
            int r1 = incompleteStateFor(r0)
            return r1
    }

    static boolean isValidUtf8(java.nio.ByteBuffer r3) {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            int r1 = r3.position()
            int r2 = r3.remaining()
            boolean r0 = r0.isValidUtf8(r3, r1, r2)
            return r0
    }

    static boolean isValidUtf8(byte[] r3) {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            r1 = 0
            int r2 = r3.length
            boolean r0 = r0.isValidUtf8(r3, r1, r2)
            return r0
    }

    static boolean isValidUtf8(byte[] r1, int r2, int r3) {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            boolean r0 = r0.isValidUtf8(r1, r2, r3)
            return r0
    }

    static int partialIsValidUtf8(int r1, java.nio.ByteBuffer r2, int r3, int r4) {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            int r0 = r0.partialIsValidUtf8(r1, r2, r3, r4)
            return r0
    }

    static int partialIsValidUtf8(int r1, byte[] r2, int r3, int r4) {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            int r0 = r0.partialIsValidUtf8(r1, r2, r3, r4)
            return r0
    }
}
