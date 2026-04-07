package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public class FlexBuffersBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int BUILDER_FLAG_NONE = 0;
    public static final int BUILDER_FLAG_SHARE_ALL = 7;
    public static final int BUILDER_FLAG_SHARE_KEYS = 1;
    public static final int BUILDER_FLAG_SHARE_KEYS_AND_STRINGS = 3;
    public static final int BUILDER_FLAG_SHARE_KEY_VECTORS = 4;
    public static final int BUILDER_FLAG_SHARE_STRINGS = 2;
    private static final int WIDTH_16 = 1;
    private static final int WIDTH_32 = 2;
    private static final int WIDTH_64 = 3;
    private static final int WIDTH_8 = 0;
    private final androidx.emoji2.text.flatbuffer.ReadWriteBuf bb;
    private boolean finished;
    private final int flags;
    private java.util.Comparator<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value> keyComparator;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> keyPool;
    private final java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value> stack;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> stringPool;


    private static class Value {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final double dValue;
        long iValue;
        int key;
        final int minBitWidth;
        final int type;

        static {
                java.lang.Class<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder> r0 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.class
                return
        }

        Value(int r3, int r4, int r5, double r6) {
                r2 = this;
                r2.<init>()
                r2.key = r3
                r2.type = r4
                r2.minBitWidth = r5
                r2.dValue = r6
                r0 = -9223372036854775808
                r2.iValue = r0
                return
        }

        Value(int r3, int r4, int r5, long r6) {
                r2 = this;
                r2.<init>()
                r2.key = r3
                r2.type = r4
                r2.minBitWidth = r5
                r2.iValue = r6
                r0 = 1
                r2.dValue = r0
                return
        }

        static /* synthetic */ int access$100(int r1, int r2) {
                int r0 = paddingBytes(r1, r2)
                return r0
        }

        static /* synthetic */ int access$200(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value r1, int r2, int r3) {
                int r0 = r1.elemWidth(r2, r3)
                return r0
        }

        static /* synthetic */ byte access$300(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value r1) {
                byte r0 = r1.storedPackedType()
                return r0
        }

        static /* synthetic */ byte access$400(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value r1, int r2) {
                byte r0 = r1.storedPackedType(r2)
                return r0
        }

        static /* synthetic */ int access$500(int r1, int r2, long r3, int r5, int r6) {
                int r0 = elemWidth(r1, r2, r3, r5, r6)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value blob(int r6, int r7, int r8, int r9) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                long r4 = (long) r7
                r1 = r6
                r2 = r8
                r3 = r9
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value bool(int r6, boolean r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                if (r7 == 0) goto L7
                r1 = 1
                goto L9
            L7:
                r1 = 0
            L9:
                r4 = r1
                r2 = 26
                r3 = 0
                r1 = r6
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        private int elemWidth(int r7, int r8) {
                r6 = this;
                int r0 = r6.type
                int r1 = r6.minBitWidth
                long r2 = r6.iValue
                r4 = r7
                r5 = r8
                int r7 = elemWidth(r0, r1, r2, r4, r5)
                return r7
        }

        private static int elemWidth(int r9, int r10, long r11, int r13, int r14) {
                boolean r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.isTypeInline(r9)
                if (r0 == 0) goto L7
                return r10
            L7:
                r0 = 1
            L8:
                r1 = 32
                if (r0 > r1) goto L28
                int r1 = paddingBytes(r13, r0)
                int r1 = r1 + r13
                int r2 = r14 * r0
                int r1 = r1 + r2
                long r2 = (long) r1
                long r2 = r2 - r11
                int r4 = (int) r2
                long r4 = (long) r4
                int r4 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.widthUInBits(r4)
                r5 = 1
                long r5 = r5 << r4
                long r7 = (long) r0
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 != 0) goto L25
                return r4
            L25:
                int r0 = r0 * 2
                goto L8
            L28:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value float32(int r6, float r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 2
                double r4 = (double) r7
                r2 = 3
                r1 = r6
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value float64(int r6, double r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r2 = 3
                r3 = 3
                r1 = r6
                r4 = r7
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value int16(int r6, int r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 1
                long r4 = (long) r7
                r2 = 1
                r1 = r6
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value int32(int r6, int r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 2
                long r4 = (long) r7
                r2 = 1
                r1 = r6
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value int64(int r6, long r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r2 = 1
                r3 = 3
                r1 = r6
                r4 = r7
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value int8(int r6, int r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 0
                long r4 = (long) r7
                r2 = 1
                r1 = r6
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        private static byte packedType(int r1, int r2) {
                int r0 = r2 << 2
                r0 = r0 | r1
                byte r0 = (byte) r0
                return r0
        }

        private static int paddingBytes(int r2, int r3) {
                int r0 = ~r2
                int r0 = r0 + 1
                int r1 = r3 + (-1)
                r0 = r0 & r1
                return r0
        }

        private byte storedPackedType() {
                r1 = this;
                r0 = 0
                byte r0 = r1.storedPackedType(r0)
                return r0
        }

        private byte storedPackedType(int r3) {
                r2 = this;
                int r0 = r2.storedWidth(r3)
                int r1 = r2.type
                byte r0 = packedType(r0, r1)
                return r0
        }

        private int storedWidth(int r2) {
                r1 = this;
                int r0 = r1.type
                boolean r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.isTypeInline(r0)
                if (r0 == 0) goto Lf
                int r0 = r1.minBitWidth
                int r0 = java.lang.Math.max(r0, r2)
                return r0
            Lf:
                int r0 = r1.minBitWidth
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value uInt16(int r6, int r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 1
                long r4 = (long) r7
                r2 = 2
                r1 = r6
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value uInt32(int r6, int r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 2
                long r4 = (long) r7
                r2 = 2
                r1 = r6
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value uInt64(int r6, long r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r2 = 2
                r3 = 3
                r1 = r6
                r4 = r7
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value uInt8(int r6, int r7) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 0
                long r4 = (long) r7
                r2 = 2
                r1 = r6
                r0.<init>(r1, r2, r3, r4)
                return r0
        }
    }

    static {
            return
    }

    public FlexBuffersBuilder() {
            r1 = this;
            r0 = 256(0x100, float:3.59E-43)
            r1.<init>(r0)
            return
    }

    public FlexBuffersBuilder(int r3) {
            r2 = this;
            androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf r0 = new androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf
            r0.<init>(r3)
            r1 = 1
            r2.<init>(r0, r1)
            return
    }

    public FlexBuffersBuilder(androidx.emoji2.text.flatbuffer.ReadWriteBuf r2, int r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.stack = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.keyPool = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.stringPool = r0
            r0 = 0
            r1.finished = r0
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$1 r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$1
            r0.<init>(r1)
            r1.keyComparator = r0
            r1.bb = r2
            r1.flags = r3
            return
    }

    public FlexBuffersBuilder(java.nio.ByteBuffer r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public FlexBuffersBuilder(java.nio.ByteBuffer r3, int r4) {
            r2 = this;
            androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf r0 = new androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf
            byte[] r1 = r3.array()
            r0.<init>(r1)
            r2.<init>(r0, r4)
            return
    }

    static /* synthetic */ androidx.emoji2.text.flatbuffer.ReadWriteBuf access$000(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder r1) {
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r1.bb
            return r0
    }

    private int align(int r5) {
            r4 = this;
            r0 = 1
            int r0 = r0 << r5
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r1 = r4.bb
            int r1 = r1.writePosition()
            int r1 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$100(r1, r0)
        Lc:
            int r2 = r1 + (-1)
            if (r1 == 0) goto L18
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r1 = r4.bb
            r3 = 0
            r1.put(r3)
            r1 = r2
            goto Lc
        L18:
            return r0
    }

    private androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value createKeyVector(int r17, int r18) {
            r16 = this;
            r0 = r16
            r1 = r18
            long r2 = (long) r1
            int r2 = widthUInBits(r2)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            r4 = 1
            r5 = r17
            r9 = r2
        L12:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r2 = r0.stack
            int r2 = r2.size()
            if (r5 >= r2) goto L3a
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r2 = r0.stack
            java.lang.Object r2 = r2.get(r5)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r2
            int r2 = r2.key
            long r12 = (long) r2
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r2 = r0.bb
            int r14 = r2.writePosition()
            int r15 = r5 + r4
            r10 = 4
            r11 = 0
            int r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$500(r10, r11, r12, r14, r15)
            int r9 = java.lang.Math.max(r9, r2)
            int r5 = r5 + 1
            goto L12
        L3a:
            int r2 = r0.align(r9)
            long r5 = (long) r1
            r0.writeInt(r5, r2)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r5 = r0.bb
            int r5 = r5.writePosition()
            r6 = r17
        L4a:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r7 = r0.stack
            int r7 = r7.size()
            if (r6 >= r7) goto L76
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r7 = r0.stack
            java.lang.Object r7 = r7.get(r6)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r7 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r7
            int r7 = r7.key
            r8 = -1
            if (r7 == r8) goto L70
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r8 = r0.stack
            java.lang.Object r8 = r8.get(r6)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r8 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r8
            int r8 = r8.key
            long r10 = (long) r8
            r0.writeOffset(r10, r2)
            int r6 = r6 + 1
            goto L4a
        L70:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L76:
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
            r7 = 4
            int r8 = androidx.emoji2.text.flatbuffer.FlexBuffers.toTypedVector(r7, r3)
            long r10 = (long) r5
            r7 = -1
            r6.<init>(r7, r8, r9, r10)
            return r6
    }

    private androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value createVector(int r15, int r16, int r17, boolean r18, boolean r19, androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value r20) {
            r14 = this;
            r0 = r17
            r1 = r20
            if (r19 == 0) goto Lf
            if (r18 == 0) goto L9
            goto Lf
        L9:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        Lf:
            long r2 = (long) r0
            int r2 = widthUInBits(r2)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            r4 = 1
            if (r1 == 0) goto L2c
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r5 = r14.bb
            int r5 = r5.writePosition()
            int r5 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$200(r1, r5, r3)
            int r2 = java.lang.Math.max(r2, r5)
            int r4 = r4 + 2
        L2c:
            r5 = 4
            r6 = r16
            r10 = r2
        L30:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r2 = r14.stack
            int r2 = r2.size()
            if (r6 >= r2) goto L87
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r2 = r14.stack
            java.lang.Object r2 = r2.get(r6)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r2
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r7 = r14.bb
            int r7 = r7.writePosition()
            int r8 = r6 + r4
            int r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$200(r2, r7, r8)
            int r10 = java.lang.Math.max(r10, r2)
            if (r18 == 0) goto L82
            r13 = r16
            if (r6 != r13) goto L6f
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r7 = r14.stack
            java.lang.Object r7 = r7.get(r6)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r7 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r7
            int r5 = r7.type
            boolean r7 = androidx.emoji2.text.flatbuffer.FlexBuffers.isTypedVectorElementType(r5)
            if (r7 == 0) goto L67
            goto L84
        L67:
            androidx.emoji2.text.flatbuffer.FlexBuffers$FlexBufferException r3 = new androidx.emoji2.text.flatbuffer.FlexBuffers$FlexBufferException
            java.lang.String r7 = "TypedVector does not support this element type"
            r3.<init>(r7)
            throw r3
        L6f:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r7 = r14.stack
            java.lang.Object r7 = r7.get(r6)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r7 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r7
            int r7 = r7.type
            if (r5 != r7) goto L7c
            goto L84
        L7c:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L82:
            r13 = r16
        L84:
            int r6 = r6 + 1
            goto L30
        L87:
            r13 = r16
            if (r19 == 0) goto L98
            boolean r2 = androidx.emoji2.text.flatbuffer.FlexBuffers.isTypedVectorElementType(r5)
            if (r2 == 0) goto L92
            goto L98
        L92:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L98:
            int r2 = r14.align(r10)
            if (r1 == 0) goto Lab
            long r6 = r1.iValue
            r14.writeOffset(r6, r2)
            r6 = 1
            int r8 = r1.minBitWidth
            long r6 = r6 << r8
            r14.writeInt(r6, r2)
        Lab:
            if (r19 != 0) goto Lb1
            long r6 = (long) r0
            r14.writeInt(r6, r2)
        Lb1:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r6 = r14.bb
            int r6 = r6.writePosition()
            r7 = r16
        Lb9:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r8 = r14.stack
            int r8 = r8.size()
            if (r7 >= r8) goto Lcf
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r8 = r14.stack
            java.lang.Object r8 = r8.get(r7)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r8 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r8
            r14.writeAny(r8, r2)
            int r7 = r7 + 1
            goto Lb9
        Lcf:
            if (r18 != 0) goto Lef
            r7 = r16
        Ld3:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r8 = r14.stack
            int r8 = r8.size()
            if (r7 >= r8) goto Lef
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r8 = r14.bb
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r9 = r14.stack
            java.lang.Object r9 = r9.get(r7)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r9 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r9
            byte r9 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$400(r9, r10)
            r8.put(r9)
            int r7 = r7 + 1
            goto Ld3
        Lef:
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r7 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
            if (r1 == 0) goto Lf7
            r3 = 9
            r9 = r3
            goto L104
        Lf7:
            if (r18 == 0) goto L101
            if (r19 == 0) goto Lfc
            r3 = r0
        Lfc:
            int r3 = androidx.emoji2.text.flatbuffer.FlexBuffers.toTypedVector(r5, r3)
            goto L103
        L101:
            r3 = 10
        L103:
            r9 = r3
        L104:
            long r11 = (long) r6
            r8 = r15
            r7.<init>(r8, r9, r10, r11)
            return r7
    }

    private int putKey(java.lang.String r7) {
            r6 = this;
            if (r7 != 0) goto L4
            r0 = -1
            return r0
        L4:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r6.bb
            int r0 = r0.writePosition()
            int r1 = r6.flags
            r1 = r1 & 1
            r2 = 0
            if (r1 == 0) goto L3b
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r6.keyPool
            java.lang.Object r1 = r1.get(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L36
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r7.getBytes(r3)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r4 = r6.bb
            int r5 = r3.length
            r4.put(r3, r2, r5)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r4 = r6.bb
            r4.put(r2)
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r6.keyPool
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r2.put(r7, r4)
            goto L3a
        L36:
            int r0 = r1.intValue()
        L3a:
            goto L55
        L3b:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r7.getBytes(r1)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r3 = r6.bb
            int r4 = r1.length
            r3.put(r1, r2, r4)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r3 = r6.bb
            r3.put(r2)
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r6.keyPool
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2.put(r7, r3)
        L55:
            return r0
    }

    private void putUInt(java.lang.String r5, long r6) {
            r4 = this;
            int r0 = r4.putKey(r5)
            int r1 = widthUInBits(r6)
            if (r1 != 0) goto L10
            int r2 = (int) r6
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.uInt8(r0, r2)
            goto L26
        L10:
            r2 = 1
            if (r1 != r2) goto L19
            int r2 = (int) r6
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.uInt16(r0, r2)
            goto L26
        L19:
            r2 = 2
            if (r1 != r2) goto L22
            int r2 = (int) r6
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.uInt32(r0, r2)
            goto L26
        L22:
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.uInt64(r0, r6)
        L26:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r3 = r4.stack
            r3.add(r2)
            return
    }

    private void putUInt64(java.lang.String r3, long r4) {
            r2 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r2.stack
            int r1 = r2.putKey(r3)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r1 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.uInt64(r1, r4)
            r0.add(r1)
            return
    }

    static int widthUInBits(long r3) {
            r0 = -1
            int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.byteToUnsignedInt(r0)
            long r1 = (long) r1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto Lc
            r0 = 0
            return r0
        Lc:
            int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.shortToUnsignedInt(r0)
            long r1 = (long) r1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L17
            r0 = 1
            return r0
        L17:
            long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.intToUnsignedLong(r0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L21
            r0 = 2
            return r0
        L21:
            r0 = 3
            return r0
    }

    private void writeAny(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value r3, int r4) {
            r2 = this;
            int r0 = r3.type
            switch(r0) {
                case 0: goto L11;
                case 1: goto L11;
                case 2: goto L11;
                case 3: goto Lb;
                case 26: goto L11;
                default: goto L5;
            }
        L5:
            long r0 = r3.iValue
            r2.writeOffset(r0, r4)
            goto L17
        Lb:
            double r0 = r3.dValue
            r2.writeDouble(r0, r4)
            goto L17
        L11:
            long r0 = r3.iValue
            r2.writeInt(r0, r4)
        L17:
            return
    }

    private androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value writeBlob(int r7, byte[] r8, int r9, boolean r10) {
            r6 = this;
            int r0 = r8.length
            long r0 = (long) r0
            int r0 = widthUInBits(r0)
            int r1 = r6.align(r0)
            int r2 = r8.length
            long r2 = (long) r2
            r6.writeInt(r2, r1)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r2 = r6.bb
            int r2 = r2.writePosition()
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r3 = r6.bb
            int r4 = r8.length
            r5 = 0
            r3.put(r8, r5, r4)
            if (r10 == 0) goto L23
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r3 = r6.bb
            r3.put(r5)
        L23:
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.blob(r7, r2, r9, r0)
            return r3
    }

    private void writeDouble(double r3, int r5) {
            r2 = this;
            r0 = 4
            if (r5 != r0) goto La
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r2.bb
            float r1 = (float) r3
            r0.putFloat(r1)
            goto L13
        La:
            r0 = 8
            if (r5 != r0) goto L13
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r2.bb
            r0.putDouble(r3)
        L13:
            return
    }

    private void writeInt(long r3, int r5) {
            r2 = this;
            switch(r5) {
                case 1: goto L19;
                case 2: goto L11;
                case 4: goto La;
                case 8: goto L4;
                default: goto L3;
            }
        L3:
            goto L20
        L4:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r2.bb
            r0.putLong(r3)
            goto L20
        La:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r2.bb
            int r1 = (int) r3
            r0.putInt(r1)
            goto L20
        L11:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r2.bb
            int r1 = (int) r3
            short r1 = (short) r1
            r0.putShort(r1)
            goto L20
        L19:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r2.bb
            int r1 = (int) r3
            byte r1 = (byte) r1
            r0.put(r1)
        L20:
            return
    }

    private void writeOffset(long r7, int r9) {
            r6 = this;
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r6.bb
            int r0 = r0.writePosition()
            long r0 = (long) r0
            long r0 = r0 - r7
            int r0 = (int) r0
            r1 = 8
            if (r9 == r1) goto L1f
            long r1 = (long) r0
            int r3 = r9 * 8
            r4 = 1
            long r3 = r4 << r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L19
            goto L1f
        L19:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L1f:
            long r1 = (long) r0
            r6.writeInt(r1, r9)
            return
    }

    private androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value writeString(int r4, java.lang.String r5) {
            r3 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r5.getBytes(r0)
            r1 = 5
            r2 = 1
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = r3.writeBlob(r4, r0, r1, r2)
            return r0
    }

    public int endMap(java.lang.String r8, int r9) {
            r7 = this;
            int r1 = r7.putKey(r8)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r7.stack
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r2 = r7.stack
            int r2 = r2.size()
            java.util.List r0 = r0.subList(r9, r2)
            java.util.Comparator<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r2 = r7.keyComparator
            java.util.Collections.sort(r0, r2)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r7.stack
            int r0 = r0.size()
            int r0 = r0 - r9
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = r7.createKeyVector(r9, r0)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r7.stack
            int r0 = r0.size()
            int r3 = r0 - r9
            r4 = 0
            r5 = 0
            r0 = r7
            r2 = r9
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r9 = r0.createVector(r1, r2, r3, r4, r5, r6)
        L30:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r3 = r0.stack
            int r3 = r3.size()
            if (r3 <= r2) goto L46
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r3 = r0.stack
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r4 = r0.stack
            int r4 = r4.size()
            int r4 = r4 + (-1)
            r3.remove(r4)
            goto L30
        L46:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r3 = r0.stack
            r3.add(r9)
            long r3 = r9.iValue
            int r3 = (int) r3
            return r3
    }

    public int endVector(java.lang.String r8, int r9, boolean r10, boolean r11) {
            r7 = this;
            int r1 = r7.putKey(r8)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r7.stack
            int r0 = r0.size()
            int r3 = r0 - r9
            r6 = 0
            r0 = r7
            r2 = r9
            r4 = r10
            r5 = r11
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r9 = r0.createVector(r1, r2, r3, r4, r5, r6)
        L15:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r10 = r0.stack
            int r10 = r10.size()
            if (r10 <= r2) goto L2b
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r10 = r0.stack
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r11 = r0.stack
            int r11 = r11.size()
            int r11 = r11 + (-1)
            r10.remove(r11)
            goto L15
        L2b:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r10 = r0.stack
            r10.add(r9)
            long r10 = r9.iValue
            int r10 = (int) r10
            return r10
    }

    public java.nio.ByteBuffer finish() {
            r5 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r5.stack
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L55
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r5.stack
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r0
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r3 = r5.bb
            int r3 = r3.writePosition()
            int r0 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$200(r0, r3, r2)
            int r0 = r5.align(r0)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r3 = r5.stack
            java.lang.Object r3 = r3.get(r2)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r3
            r5.writeAny(r3, r0)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r3 = r5.bb
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r4 = r5.stack
            java.lang.Object r4 = r4.get(r2)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r4 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r4
            byte r4 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$300(r4)
            r3.put(r4)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r3 = r5.bb
            byte r4 = (byte) r0
            r3.put(r4)
            r5.finished = r1
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r1 = r5.bb
            byte[] r1 = r1.data()
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r3 = r5.bb
            int r3 = r3.writePosition()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1, r2, r3)
            return r1
        L55:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    public androidx.emoji2.text.flatbuffer.ReadWriteBuf getBuffer() {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 == 0) goto L7
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r1.bb
            return r0
        L7:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    public int putBlob(java.lang.String r5, byte[] r6) {
            r4 = this;
            int r0 = r4.putKey(r5)
            r1 = 25
            r2 = 0
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r1 = r4.writeBlob(r0, r6, r1, r2)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r2 = r4.stack
            r2.add(r1)
            long r2 = r1.iValue
            int r2 = (int) r2
            return r2
    }

    public int putBlob(byte[] r2) {
            r1 = this;
            r0 = 0
            int r0 = r1.putBlob(r0, r2)
            return r0
    }

    public void putBoolean(java.lang.String r3, boolean r4) {
            r2 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r2.stack
            int r1 = r2.putKey(r3)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r1 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.bool(r1, r4)
            r0.add(r1)
            return
    }

    public void putBoolean(boolean r2) {
            r1 = this;
            r0 = 0
            r1.putBoolean(r0, r2)
            return
    }

    public void putFloat(double r2) {
            r1 = this;
            r0 = 0
            r1.putFloat(r0, r2)
            return
    }

    public void putFloat(float r2) {
            r1 = this;
            r0 = 0
            r1.putFloat(r0, r2)
            return
    }

    public void putFloat(java.lang.String r3, double r4) {
            r2 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r2.stack
            int r1 = r2.putKey(r3)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r1 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.float64(r1, r4)
            r0.add(r1)
            return
    }

    public void putFloat(java.lang.String r3, float r4) {
            r2 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r2.stack
            int r1 = r2.putKey(r3)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r1 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.float32(r1, r4)
            r0.add(r1)
            return
    }

    public void putInt(int r2) {
            r1 = this;
            r0 = 0
            r1.putInt(r0, r2)
            return
    }

    public void putInt(long r2) {
            r1 = this;
            r0 = 0
            r1.putInt(r0, r2)
            return
    }

    public void putInt(java.lang.String r3, int r4) {
            r2 = this;
            long r0 = (long) r4
            r2.putInt(r3, r0)
            return
    }

    public void putInt(java.lang.String r4, long r5) {
            r3 = this;
            int r0 = r3.putKey(r4)
            r1 = -128(0xffffffffffffff80, double:NaN)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L1b
            r1 = 127(0x7f, double:6.27E-322)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L1b
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r1 = r3.stack
            int r2 = (int) r5
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.int8(r0, r2)
            r1.add(r2)
            goto L54
        L1b:
            r1 = -32768(0xffffffffffff8000, double:NaN)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L32
            r1 = 32767(0x7fff, double:1.6189E-319)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L32
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r1 = r3.stack
            int r2 = (int) r5
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.int16(r0, r2)
            r1.add(r2)
            goto L54
        L32:
            r1 = -2147483648(0xffffffff80000000, double:NaN)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L4b
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L4b
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r1 = r3.stack
            int r2 = (int) r5
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.int32(r0, r2)
            r1.add(r2)
            goto L54
        L4b:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r1 = r3.stack
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.int64(r0, r5)
            r1.add(r2)
        L54:
            return
    }

    public int putString(java.lang.String r2) {
            r1 = this;
            r0 = 0
            int r0 = r1.putString(r0, r2)
            return r0
    }

    public int putString(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            int r0 = r6.putKey(r7)
            int r1 = r6.flags
            r1 = r1 & 2
            if (r1 == 0) goto L49
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r6.stringPool
            java.lang.Object r1 = r1.get(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L2d
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = r6.writeString(r0, r8)
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r6.stringPool
            long r4 = r2.iValue
            int r4 = (int) r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r8, r4)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r3 = r6.stack
            r3.add(r2)
            long r3 = r2.iValue
            int r3 = (int) r3
            return r3
        L2d:
            int r2 = r8.length()
            long r2 = (long) r2
            int r2 = widthUInBits(r2)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r3 = r6.stack
            int r4 = r1.intValue()
            r5 = 5
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r4 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.blob(r0, r4, r5, r2)
            r3.add(r4)
            int r3 = r1.intValue()
            return r3
        L49:
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r1 = r6.writeString(r0, r8)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r2 = r6.stack
            r2.add(r1)
            long r2 = r1.iValue
            int r2 = (int) r2
            return r2
    }

    public void putUInt(int r4) {
            r3 = this;
            r0 = 0
            long r1 = (long) r4
            r3.putUInt(r0, r1)
            return
    }

    public void putUInt(long r2) {
            r1 = this;
            r0 = 0
            r1.putUInt(r0, r2)
            return
    }

    public void putUInt64(java.math.BigInteger r4) {
            r3 = this;
            r0 = 0
            long r1 = r4.longValue()
            r3.putUInt64(r0, r1)
            return
    }

    public int startMap() {
            r1 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r1.stack
            int r0 = r0.size()
            return r0
    }

    public int startVector() {
            r1 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r1.stack
            int r0 = r0.size()
            return r0
    }
}
