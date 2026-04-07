package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public class FlatBufferBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    java.nio.ByteBuffer bb;
    androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory bb_factory;
    boolean finished;
    boolean force_defaults;
    int minalign;
    boolean nested;
    int num_vtables;
    int object_start;
    int space;
    final androidx.emoji2.text.flatbuffer.Utf8 utf8;
    int vector_num_elems;
    int[] vtable;
    int vtable_in_use;
    int[] vtables;

    static class ByteBufferBackedInputStream extends java.io.InputStream {
        java.nio.ByteBuffer buf;

        public ByteBufferBackedInputStream(java.nio.ByteBuffer r1) {
                r0 = this;
                r0.<init>()
                r0.buf = r1
                return
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.buf     // Catch: java.nio.BufferUnderflowException -> L9
                byte r0 = r0.get()     // Catch: java.nio.BufferUnderflowException -> L9
                r0 = r0 & 255(0xff, float:3.57E-43)
                return r0
            L9:
                r0 = move-exception
                r1 = -1
                return r1
        }
    }

    public static abstract class ByteBufferFactory {
        public ByteBufferFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract java.nio.ByteBuffer newByteBuffer(int r1);

        public void releaseByteBuffer(java.nio.ByteBuffer r1) {
                r0 = this;
                return
        }
    }

    public static final class HeapByteBufferFactory extends androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory {
        public static final androidx.emoji2.text.flatbuffer.FlatBufferBuilder.HeapByteBufferFactory INSTANCE = null;

        static {
                androidx.emoji2.text.flatbuffer.FlatBufferBuilder$HeapByteBufferFactory r0 = new androidx.emoji2.text.flatbuffer.FlatBufferBuilder$HeapByteBufferFactory
                r0.<init>()
                androidx.emoji2.text.flatbuffer.FlatBufferBuilder.HeapByteBufferFactory.INSTANCE = r0
                return
        }

        public HeapByteBufferFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory
        public java.nio.ByteBuffer newByteBuffer(int r3) {
                r2 = this;
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r3)
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r0 = r0.order(r1)
                return r0
        }
    }

    static {
            return
    }

    public FlatBufferBuilder() {
            r1 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1.<init>(r0)
            return
    }

    public FlatBufferBuilder(int r4) {
            r3 = this;
            androidx.emoji2.text.flatbuffer.FlatBufferBuilder$HeapByteBufferFactory r0 = androidx.emoji2.text.flatbuffer.FlatBufferBuilder.HeapByteBufferFactory.INSTANCE
            r1 = 0
            androidx.emoji2.text.flatbuffer.Utf8 r2 = androidx.emoji2.text.flatbuffer.Utf8.getDefault()
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public FlatBufferBuilder(int r3, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory r4) {
            r2 = this;
            r0 = 0
            androidx.emoji2.text.flatbuffer.Utf8 r1 = androidx.emoji2.text.flatbuffer.Utf8.getDefault()
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public FlatBufferBuilder(int r3, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory r4, java.nio.ByteBuffer r5, androidx.emoji2.text.flatbuffer.Utf8 r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.minalign = r0
            r0 = 0
            r2.vtable = r0
            r0 = 0
            r2.vtable_in_use = r0
            r2.nested = r0
            r2.finished = r0
            r1 = 16
            int[] r1 = new int[r1]
            r2.vtables = r1
            r2.num_vtables = r0
            r2.vector_num_elems = r0
            r2.force_defaults = r0
            if (r3 > 0) goto L1f
            r3 = 1
        L1f:
            r2.bb_factory = r4
            if (r5 == 0) goto L32
            r2.bb = r5
            java.nio.ByteBuffer r0 = r2.bb
            r0.clear()
            java.nio.ByteBuffer r0 = r2.bb
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r1)
            goto L38
        L32:
            java.nio.ByteBuffer r0 = r4.newByteBuffer(r3)
            r2.bb = r0
        L38:
            r2.utf8 = r6
            java.nio.ByteBuffer r0 = r2.bb
            int r0 = r0.capacity()
            r2.space = r0
            return
    }

    public FlatBufferBuilder(java.nio.ByteBuffer r2) {
            r1 = this;
            androidx.emoji2.text.flatbuffer.FlatBufferBuilder$HeapByteBufferFactory r0 = new androidx.emoji2.text.flatbuffer.FlatBufferBuilder$HeapByteBufferFactory
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public FlatBufferBuilder(java.nio.ByteBuffer r3, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory r4) {
            r2 = this;
            int r0 = r3.capacity()
            androidx.emoji2.text.flatbuffer.Utf8 r1 = androidx.emoji2.text.flatbuffer.Utf8.getDefault()
            r2.<init>(r0, r4, r3, r1)
            return
    }

    @java.lang.Deprecated
    private int dataStart() {
            r1 = this;
            r1.finished()
            int r0 = r1.space
            return r0
    }

    static java.nio.ByteBuffer growByteBuffer(java.nio.ByteBuffer r4, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory r5) {
            int r0 = r4.capacity()
            r1 = -1073741824(0xffffffffc0000000, float:-2.0)
            r1 = r1 & r0
            if (r1 != 0) goto L28
            if (r0 != 0) goto Ld
            r1 = 1
            goto Lf
        Ld:
            int r1 = r0 << 1
        Lf:
            r2 = 0
            r4.position(r2)
            java.nio.ByteBuffer r2 = r5.newByteBuffer(r1)
            java.nio.Buffer r3 = r2.clear()
            int r1 = r3.capacity()
            int r3 = r1 - r0
            r2.position(r3)
            r2.put(r4)
            return r2
        L28:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "FlatBuffers: cannot grow buffer beyond 2 gigabytes."
            r1.<init>(r2)
            throw r1
    }

    public static boolean isFieldPresent(androidx.emoji2.text.flatbuffer.Table r1, int r2) {
            int r0 = r1.__offset(r2)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public void Nested(int r3) {
            r2 = this;
            int r0 = r2.offset()
            if (r3 != r0) goto L7
            return
        L7:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: struct must be serialized inline."
            r0.<init>(r1)
            throw r0
    }

    public void addBoolean(int r2, boolean r3, boolean r4) {
            r1 = this;
            boolean r0 = r1.force_defaults
            if (r0 != 0) goto L6
            if (r3 == r4) goto Lc
        L6:
            r1.addBoolean(r3)
            r1.slot(r2)
        Lc:
            return
    }

    public void addBoolean(boolean r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.prep(r0, r1)
            r2.putBoolean(r3)
            return
    }

    public void addByte(byte r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.prep(r0, r1)
            r2.putByte(r3)
            return
    }

    public void addByte(int r2, byte r3, int r4) {
            r1 = this;
            boolean r0 = r1.force_defaults
            if (r0 != 0) goto L6
            if (r3 == r4) goto Lc
        L6:
            r1.addByte(r3)
            r1.slot(r2)
        Lc:
            return
    }

    public void addDouble(double r3) {
            r2 = this;
            r0 = 8
            r1 = 0
            r2.prep(r0, r1)
            r2.putDouble(r3)
            return
    }

    public void addDouble(int r2, double r3, double r5) {
            r1 = this;
            boolean r0 = r1.force_defaults
            if (r0 != 0) goto L8
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto Le
        L8:
            r1.addDouble(r3)
            r1.slot(r2)
        Le:
            return
    }

    public void addFloat(float r3) {
            r2 = this;
            r0 = 4
            r1 = 0
            r2.prep(r0, r1)
            r2.putFloat(r3)
            return
    }

    public void addFloat(int r3, float r4, double r5) {
            r2 = this;
            boolean r0 = r2.force_defaults
            if (r0 != 0) goto L9
            double r0 = (double) r4
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto Lf
        L9:
            r2.addFloat(r4)
            r2.slot(r3)
        Lf:
            return
    }

    public void addInt(int r3) {
            r2 = this;
            r0 = 4
            r1 = 0
            r2.prep(r0, r1)
            r2.putInt(r3)
            return
    }

    public void addInt(int r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.force_defaults
            if (r0 != 0) goto L6
            if (r3 == r4) goto Lc
        L6:
            r1.addInt(r3)
            r1.slot(r2)
        Lc:
            return
    }

    public void addLong(int r2, long r3, long r5) {
            r1 = this;
            boolean r0 = r1.force_defaults
            if (r0 != 0) goto L8
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto Le
        L8:
            r1.addLong(r3)
            r1.slot(r2)
        Le:
            return
    }

    public void addLong(long r3) {
            r2 = this;
            r0 = 8
            r1 = 0
            r2.prep(r0, r1)
            r2.putLong(r3)
            return
    }

    public void addOffset(int r3) {
            r2 = this;
            r0 = 0
            r1 = 4
            r2.prep(r1, r0)
            int r0 = r2.offset()
            if (r3 > r0) goto L15
            int r0 = r2.offset()
            int r0 = r0 - r3
            int r0 = r0 + r1
            r2.putInt(r0)
            return
        L15:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    public void addOffset(int r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.force_defaults
            if (r0 != 0) goto L6
            if (r3 == r4) goto Lc
        L6:
            r1.addOffset(r3)
            r1.slot(r2)
        Lc:
            return
    }

    public void addShort(int r2, short r3, int r4) {
            r1 = this;
            boolean r0 = r1.force_defaults
            if (r0 != 0) goto L6
            if (r3 == r4) goto Lc
        L6:
            r1.addShort(r3)
            r1.slot(r2)
        Lc:
            return
    }

    public void addShort(short r3) {
            r2 = this;
            r0 = 2
            r1 = 0
            r2.prep(r0, r1)
            r2.putShort(r3)
            return
    }

    public void addStruct(int r1, int r2, int r3) {
            r0 = this;
            if (r2 == r3) goto L8
            r0.Nested(r2)
            r0.slot(r1)
        L8:
            return
    }

    public void clear() {
            r4 = this;
            java.nio.ByteBuffer r0 = r4.bb
            int r0 = r0.capacity()
            r4.space = r0
            java.nio.ByteBuffer r0 = r4.bb
            r0.clear()
            r0 = 1
            r4.minalign = r0
        L10:
            int r1 = r4.vtable_in_use
            r2 = 0
            if (r1 <= 0) goto L1f
            int[] r1 = r4.vtable
            int r3 = r4.vtable_in_use
            int r3 = r3 - r0
            r4.vtable_in_use = r3
            r1[r3] = r2
            goto L10
        L1f:
            r4.vtable_in_use = r2
            r4.nested = r2
            r4.finished = r2
            r4.object_start = r2
            r4.num_vtables = r2
            r4.vector_num_elems = r2
            return
    }

    public int createByteVector(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.remaining()
            r1 = 1
            r3.startVector(r1, r0, r1)
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.space
            int r2 = r2 - r0
            r3.space = r2
            r1.position(r2)
            java.nio.ByteBuffer r1 = r3.bb
            r1.put(r4)
            int r1 = r3.endVector()
            return r1
    }

    public int createByteVector(byte[] r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 1
            r3.startVector(r1, r0, r1)
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.space
            int r2 = r2 - r0
            r3.space = r2
            r1.position(r2)
            java.nio.ByteBuffer r1 = r3.bb
            r1.put(r4)
            int r1 = r3.endVector()
            return r1
    }

    public int createByteVector(byte[] r3, int r4, int r5) {
            r2 = this;
            r0 = 1
            r2.startVector(r0, r5, r0)
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.space
            int r1 = r1 - r5
            r2.space = r1
            r0.position(r1)
            java.nio.ByteBuffer r0 = r2.bb
            r0.put(r3, r4, r5)
            int r0 = r2.endVector()
            return r0
    }

    public <T extends androidx.emoji2.text.flatbuffer.Table> int createSortedVectorOfTables(T r2, int[] r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.bb
            r2.sortTables(r3, r0)
            int r0 = r1.createVectorOfTables(r3)
            return r0
    }

    public int createString(java.lang.CharSequence r4) {
            r3 = this;
            androidx.emoji2.text.flatbuffer.Utf8 r0 = r3.utf8
            int r0 = r0.encodedLength(r4)
            r1 = 0
            r3.addByte(r1)
            r1 = 1
            r3.startVector(r1, r0, r1)
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.space
            int r2 = r2 - r0
            r3.space = r2
            r1.position(r2)
            androidx.emoji2.text.flatbuffer.Utf8 r1 = r3.utf8
            java.nio.ByteBuffer r2 = r3.bb
            r1.encodeUtf8(r4, r2)
            int r1 = r3.endVector()
            return r1
    }

    public int createString(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.remaining()
            r1 = 0
            r3.addByte(r1)
            r1 = 1
            r3.startVector(r1, r0, r1)
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.space
            int r2 = r2 - r0
            r3.space = r2
            r1.position(r2)
            java.nio.ByteBuffer r1 = r3.bb
            r1.put(r4)
            int r1 = r3.endVector()
            return r1
    }

    public java.nio.ByteBuffer createUnintializedVector(int r4, int r5, int r6) {
            r3 = this;
            int r0 = r4 * r5
            r3.startVector(r4, r5, r6)
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.space
            int r2 = r2 - r0
            r3.space = r2
            r1.position(r2)
            java.nio.ByteBuffer r1 = r3.bb
            java.nio.ByteBuffer r1 = r1.slice()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            r1.limit(r0)
            return r1
    }

    public int createVectorOfTables(int[] r3) {
            r2 = this;
            r2.notNested()
            r0 = 4
            int r1 = r3.length
            r2.startVector(r0, r1, r0)
            int r0 = r3.length
            int r0 = r0 + (-1)
        Lb:
            if (r0 < 0) goto L15
            r1 = r3[r0]
            r2.addOffset(r1)
            int r0 = r0 + (-1)
            goto Lb
        L15:
            int r0 = r2.endVector()
            return r0
    }

    public java.nio.ByteBuffer dataBuffer() {
            r1 = this;
            r1.finished()
            java.nio.ByteBuffer r0 = r1.bb
            return r0
    }

    public int endTable() {
            r13 = this;
            int[] r0 = r13.vtable
            if (r0 == 0) goto Ld5
            boolean r0 = r13.nested
            if (r0 == 0) goto Ld5
            r0 = 0
            r13.addInt(r0)
            int r1 = r13.offset()
            int r2 = r13.vtable_in_use
            int r2 = r2 + (-1)
        L14:
            if (r2 < 0) goto L1f
            int[] r3 = r13.vtable
            r3 = r3[r2]
            if (r3 != 0) goto L1f
            int r2 = r2 + (-1)
            goto L14
        L1f:
            int r3 = r2 + 1
        L21:
            if (r2 < 0) goto L38
            int[] r4 = r13.vtable
            r4 = r4[r2]
            if (r4 == 0) goto L30
            int[] r4 = r13.vtable
            r4 = r4[r2]
            int r4 = r1 - r4
            goto L31
        L30:
            r4 = r0
        L31:
            short r4 = (short) r4
            r13.addShort(r4)
            int r2 = r2 + (-1)
            goto L21
        L38:
            r4 = 2
            int r5 = r13.object_start
            int r5 = r1 - r5
            short r5 = (short) r5
            r13.addShort(r5)
            int r5 = r3 + 2
            int r5 = r5 * 2
            short r5 = (short) r5
            r13.addShort(r5)
            r5 = 0
            r2 = 0
        L4b:
            int r6 = r13.num_vtables
            if (r2 >= r6) goto L8b
            java.nio.ByteBuffer r6 = r13.bb
            int r6 = r6.capacity()
            int[] r7 = r13.vtables
            r7 = r7[r2]
            int r6 = r6 - r7
            int r7 = r13.space
            java.nio.ByteBuffer r8 = r13.bb
            short r8 = r8.getShort(r6)
            java.nio.ByteBuffer r9 = r13.bb
            short r9 = r9.getShort(r7)
            if (r8 != r9) goto L88
            r9 = 2
        L6b:
            if (r9 >= r8) goto L83
            java.nio.ByteBuffer r10 = r13.bb
            int r11 = r6 + r9
            short r10 = r10.getShort(r11)
            java.nio.ByteBuffer r11 = r13.bb
            int r12 = r7 + r9
            short r11 = r11.getShort(r12)
            if (r10 == r11) goto L80
            goto L88
        L80:
            int r9 = r9 + 2
            goto L6b
        L83:
            int[] r9 = r13.vtables
            r5 = r9[r2]
            goto L8b
        L88:
            int r2 = r2 + 1
            goto L4b
        L8b:
            if (r5 == 0) goto La0
            java.nio.ByteBuffer r6 = r13.bb
            int r6 = r6.capacity()
            int r6 = r6 - r1
            r13.space = r6
            java.nio.ByteBuffer r6 = r13.bb
            int r7 = r13.space
            int r8 = r5 - r1
            r6.putInt(r7, r8)
            goto Ld2
        La0:
            int r6 = r13.num_vtables
            int[] r7 = r13.vtables
            int r7 = r7.length
            if (r6 != r7) goto Lb3
            int[] r6 = r13.vtables
            int r7 = r13.num_vtables
            int r7 = r7 * 2
            int[] r6 = java.util.Arrays.copyOf(r6, r7)
            r13.vtables = r6
        Lb3:
            int[] r6 = r13.vtables
            int r7 = r13.num_vtables
            int r8 = r7 + 1
            r13.num_vtables = r8
            int r8 = r13.offset()
            r6[r7] = r8
            java.nio.ByteBuffer r6 = r13.bb
            java.nio.ByteBuffer r7 = r13.bb
            int r7 = r7.capacity()
            int r7 = r7 - r1
            int r8 = r13.offset()
            int r8 = r8 - r1
            r6.putInt(r7, r8)
        Ld2:
            r13.nested = r0
            return r1
        Ld5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: endTable called without startTable"
            r0.<init>(r1)
            throw r0
    }

    public int endVector() {
            r2 = this;
            boolean r0 = r2.nested
            if (r0 == 0) goto L11
            r0 = 0
            r2.nested = r0
            int r0 = r2.vector_num_elems
            r2.putInt(r0)
            int r0 = r2.offset()
            return r0
        L11:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: endVector called without startVector"
            r0.<init>(r1)
            throw r0
    }

    public void finish(int r2) {
            r1 = this;
            r0 = 0
            r1.finish(r2, r0)
            return
    }

    public void finish(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.finish(r2, r3, r0)
            return
    }

    protected void finish(int r4, java.lang.String r5, boolean r6) {
            r3 = this;
            int r0 = r3.minalign
            r1 = 4
            if (r6 == 0) goto L7
            r2 = r1
            goto L8
        L7:
            r2 = 0
        L8:
            int r2 = r2 + 8
            r3.prep(r0, r2)
            int r0 = r5.length()
            if (r0 != r1) goto L25
            r0 = 3
        L14:
            if (r0 < 0) goto L21
            char r1 = r5.charAt(r0)
            byte r1 = (byte) r1
            r3.addByte(r1)
            int r0 = r0 + (-1)
            goto L14
        L21:
            r3.finish(r4, r6)
            return
        L25:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: file identifier must be length 4"
            r0.<init>(r1)
            throw r0
    }

    protected void finish(int r4, boolean r5) {
            r3 = this;
            int r0 = r3.minalign
            r1 = 4
            if (r5 == 0) goto L7
            r2 = r1
            goto L8
        L7:
            r2 = 0
        L8:
            int r2 = r2 + r1
            r3.prep(r0, r2)
            r3.addOffset(r4)
            if (r5 == 0) goto L1d
            java.nio.ByteBuffer r0 = r3.bb
            int r0 = r0.capacity()
            int r1 = r3.space
            int r0 = r0 - r1
            r3.addInt(r0)
        L1d:
            java.nio.ByteBuffer r0 = r3.bb
            int r1 = r3.space
            r0.position(r1)
            r0 = 1
            r3.finished = r0
            return
    }

    public void finishSizePrefixed(int r2) {
            r1 = this;
            r0 = 1
            r1.finish(r2, r0)
            return
    }

    public void finishSizePrefixed(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            r1.finish(r2, r3, r0)
            return
    }

    public void finished() {
            r2 = this;
            boolean r0 = r2.finished
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish()."
            r0.<init>(r1)
            throw r0
    }

    public androidx.emoji2.text.flatbuffer.FlatBufferBuilder forceDefaults(boolean r1) {
            r0 = this;
            r0.force_defaults = r1
            return r0
    }

    public androidx.emoji2.text.flatbuffer.FlatBufferBuilder init(java.nio.ByteBuffer r3, androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory r4) {
            r2 = this;
            r2.bb_factory = r4
            r2.bb = r3
            java.nio.ByteBuffer r0 = r2.bb
            r0.clear()
            java.nio.ByteBuffer r0 = r2.bb
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r1)
            r0 = 1
            r2.minalign = r0
            java.nio.ByteBuffer r0 = r2.bb
            int r0 = r0.capacity()
            r2.space = r0
            r0 = 0
            r2.vtable_in_use = r0
            r2.nested = r0
            r2.finished = r0
            r2.object_start = r0
            r2.num_vtables = r0
            r2.vector_num_elems = r0
            return r2
    }

    public void notNested() {
            r2 = this;
            boolean r0 = r2.nested
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: object serialization must not be nested."
            r0.<init>(r1)
            throw r0
    }

    public int offset() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r0 = r0.capacity()
            int r1 = r2.space
            int r0 = r0 - r1
            return r0
    }

    public void pad(int r5) {
            r4 = this;
            r0 = 0
        L1:
            if (r0 >= r5) goto L12
            java.nio.ByteBuffer r1 = r4.bb
            int r2 = r4.space
            int r2 = r2 + (-1)
            r4.space = r2
            r3 = 0
            r1.put(r2, r3)
            int r0 = r0 + 1
            goto L1
        L12:
            return
    }

    public void prep(int r6, int r7) {
            r5 = this;
            int r0 = r5.minalign
            if (r6 <= r0) goto L6
            r5.minalign = r6
        L6:
            java.nio.ByteBuffer r0 = r5.bb
            int r0 = r0.capacity()
            int r1 = r5.space
            int r0 = r0 - r1
            int r0 = r0 + r7
            int r0 = ~r0
            int r0 = r0 + 1
            int r1 = r6 + (-1)
            r0 = r0 & r1
        L16:
            int r1 = r5.space
            int r2 = r0 + r6
            int r2 = r2 + r7
            if (r1 >= r2) goto L43
            java.nio.ByteBuffer r1 = r5.bb
            int r1 = r1.capacity()
            java.nio.ByteBuffer r2 = r5.bb
            androidx.emoji2.text.flatbuffer.FlatBufferBuilder$ByteBufferFactory r3 = r5.bb_factory
            java.nio.ByteBuffer r3 = growByteBuffer(r2, r3)
            r5.bb = r3
            java.nio.ByteBuffer r3 = r5.bb
            if (r2 == r3) goto L36
            androidx.emoji2.text.flatbuffer.FlatBufferBuilder$ByteBufferFactory r3 = r5.bb_factory
            r3.releaseByteBuffer(r2)
        L36:
            int r3 = r5.space
            java.nio.ByteBuffer r4 = r5.bb
            int r4 = r4.capacity()
            int r4 = r4 - r1
            int r3 = r3 + r4
            r5.space = r3
            goto L16
        L43:
            r5.pad(r0)
            return
    }

    public void putBoolean(boolean r4) {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.bb
            int r1 = r3.space
            int r1 = r1 + (-1)
            r3.space = r1
            byte r2 = (byte) r4
            r0.put(r1, r2)
            return
    }

    public void putByte(byte r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.space
            int r1 = r1 + (-1)
            r2.space = r1
            r0.put(r1, r3)
            return
    }

    public void putDouble(double r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.space
            int r1 = r1 + (-8)
            r2.space = r1
            r0.putDouble(r1, r3)
            return
    }

    public void putFloat(float r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.space
            int r1 = r1 + (-4)
            r2.space = r1
            r0.putFloat(r1, r3)
            return
    }

    public void putInt(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.space
            int r1 = r1 + (-4)
            r2.space = r1
            r0.putInt(r1, r3)
            return
    }

    public void putLong(long r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.space
            int r1 = r1 + (-8)
            r2.space = r1
            r0.putLong(r1, r3)
            return
    }

    public void putShort(short r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.space
            int r1 = r1 + (-2)
            r2.space = r1
            r0.putShort(r1, r3)
            return
    }

    public void required(int r7, int r8) {
            r6 = this;
            java.nio.ByteBuffer r0 = r6.bb
            int r0 = r0.capacity()
            int r0 = r0 - r7
            java.nio.ByteBuffer r1 = r6.bb
            int r1 = r1.getInt(r0)
            int r1 = r0 - r1
            java.nio.ByteBuffer r2 = r6.bb
            int r3 = r1 + r8
            short r2 = r2.getShort(r3)
            if (r2 == 0) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 == 0) goto L1f
            return
        L1f:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "FlatBuffers: field "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r5 = " must be set"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public byte[] sizedByteArray() {
            r3 = this;
            int r0 = r3.space
            java.nio.ByteBuffer r1 = r3.bb
            int r1 = r1.capacity()
            int r2 = r3.space
            int r1 = r1 - r2
            byte[] r0 = r3.sizedByteArray(r0, r1)
            return r0
    }

    public byte[] sizedByteArray(int r3, int r4) {
            r2 = this;
            r2.finished()
            byte[] r0 = new byte[r4]
            java.nio.ByteBuffer r1 = r2.bb
            r1.position(r3)
            java.nio.ByteBuffer r1 = r2.bb
            r1.get(r0)
            return r0
    }

    public java.io.InputStream sizedInputStream() {
            r2 = this;
            r2.finished()
            java.nio.ByteBuffer r0 = r2.bb
            java.nio.ByteBuffer r0 = r0.duplicate()
            int r1 = r2.space
            r0.position(r1)
            java.nio.ByteBuffer r1 = r2.bb
            int r1 = r1.capacity()
            r0.limit(r1)
            androidx.emoji2.text.flatbuffer.FlatBufferBuilder$ByteBufferBackedInputStream r1 = new androidx.emoji2.text.flatbuffer.FlatBufferBuilder$ByteBufferBackedInputStream
            r1.<init>(r0)
            return r1
    }

    public void slot(int r3) {
            r2 = this;
            int[] r0 = r2.vtable
            int r1 = r2.offset()
            r0[r3] = r1
            return
    }

    public void startTable(int r4) {
            r3 = this;
            r3.notNested()
            int[] r0 = r3.vtable
            if (r0 == 0) goto Lc
            int[] r0 = r3.vtable
            int r0 = r0.length
            if (r0 >= r4) goto L10
        Lc:
            int[] r0 = new int[r4]
            r3.vtable = r0
        L10:
            r3.vtable_in_use = r4
            int[] r0 = r3.vtable
            int r1 = r3.vtable_in_use
            r2 = 0
            java.util.Arrays.fill(r0, r2, r1, r2)
            r0 = 1
            r3.nested = r0
            int r0 = r3.offset()
            r3.object_start = r0
            return
    }

    public void startVector(int r3, int r4, int r5) {
            r2 = this;
            r2.notNested()
            r2.vector_num_elems = r4
            r0 = 4
            int r1 = r3 * r4
            r2.prep(r0, r1)
            int r0 = r3 * r4
            r2.prep(r5, r0)
            r0 = 1
            r2.nested = r0
            return
    }
}
