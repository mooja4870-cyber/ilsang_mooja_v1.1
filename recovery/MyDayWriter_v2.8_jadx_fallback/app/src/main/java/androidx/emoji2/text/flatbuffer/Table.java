package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public class Table {
    protected java.nio.ByteBuffer bb;
    protected int bb_pos;
    androidx.emoji2.text.flatbuffer.Utf8 utf8;
    private int vtable_size;
    private int vtable_start;


    public Table() {
            r1 = this;
            r1.<init>()
            androidx.emoji2.text.flatbuffer.Utf8 r0 = androidx.emoji2.text.flatbuffer.Utf8.getDefault()
            r1.utf8 = r0
            return
    }

    protected static boolean __has_identifier(java.nio.ByteBuffer r4, java.lang.String r5) {
            int r0 = r5.length()
            r1 = 4
            if (r0 != r1) goto L22
            r0 = 0
        L8:
            if (r0 >= r1) goto L20
            char r2 = r5.charAt(r0)
            int r3 = r4.position()
            int r3 = r3 + r1
            int r3 = r3 + r0
            byte r3 = r4.get(r3)
            char r3 = (char) r3
            if (r2 == r3) goto L1d
            r1 = 0
            return r1
        L1d:
            int r0 = r0 + 1
            goto L8
        L20:
            r0 = 1
            return r0
        L22:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: file identifier must be length 4"
            r0.<init>(r1)
            throw r0
    }

    protected static int __indirect(int r1, java.nio.ByteBuffer r2) {
            int r0 = r2.getInt(r1)
            int r0 = r0 + r1
            return r0
    }

    protected static int __offset(int r3, int r4, java.nio.ByteBuffer r5) {
            int r0 = r5.capacity()
            int r0 = r0 - r4
            int r1 = r0 + r3
            int r2 = r5.getInt(r0)
            int r1 = r1 - r2
            short r1 = r5.getShort(r1)
            int r1 = r1 + r0
            return r1
    }

    protected static java.lang.String __string(int r2, java.nio.ByteBuffer r3, androidx.emoji2.text.flatbuffer.Utf8 r4) {
            int r0 = r3.getInt(r2)
            int r2 = r2 + r0
            int r0 = r3.getInt(r2)
            int r1 = r2 + 4
            java.lang.String r1 = r4.decodeUtf8(r3, r1, r0)
            return r1
    }

    protected static androidx.emoji2.text.flatbuffer.Table __union(androidx.emoji2.text.flatbuffer.Table r1, int r2, java.nio.ByteBuffer r3) {
            int r0 = __indirect(r2, r3)
            r1.__reset(r0, r3)
            return r1
    }

    protected static int compareStrings(int r8, int r9, java.nio.ByteBuffer r10) {
            int r0 = r10.getInt(r8)
            int r8 = r8 + r0
            int r0 = r10.getInt(r9)
            int r9 = r9 + r0
            int r0 = r10.getInt(r8)
            int r1 = r10.getInt(r9)
            int r2 = r8 + 4
            int r3 = r9 + 4
            int r4 = java.lang.Math.min(r0, r1)
            r5 = 0
        L1b:
            if (r5 >= r4) goto L3c
            int r6 = r5 + r2
            byte r6 = r10.get(r6)
            int r7 = r5 + r3
            byte r7 = r10.get(r7)
            if (r6 == r7) goto L39
            int r6 = r5 + r2
            byte r6 = r10.get(r6)
            int r7 = r5 + r3
            byte r7 = r10.get(r7)
            int r6 = r6 - r7
            return r6
        L39:
            int r5 = r5 + 1
            goto L1b
        L3c:
            int r5 = r0 - r1
            return r5
    }

    protected static int compareStrings(int r7, byte[] r8, java.nio.ByteBuffer r9) {
            int r0 = r9.getInt(r7)
            int r7 = r7 + r0
            int r0 = r9.getInt(r7)
            int r1 = r8.length
            int r2 = r7 + 4
            int r3 = java.lang.Math.min(r0, r1)
            r4 = 0
        L11:
            if (r4 >= r3) goto L2a
            int r5 = r4 + r2
            byte r5 = r9.get(r5)
            r6 = r8[r4]
            if (r5 == r6) goto L27
            int r5 = r4 + r2
            byte r5 = r9.get(r5)
            r6 = r8[r4]
            int r5 = r5 - r6
            return r5
        L27:
            int r4 = r4 + 1
            goto L11
        L2a:
            int r4 = r0 - r1
            return r4
    }

    protected int __indirect(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.bb
            int r0 = r0.getInt(r2)
            int r0 = r0 + r2
            return r0
    }

    protected int __offset(int r3) {
            r2 = this;
            int r0 = r2.vtable_size
            if (r3 >= r0) goto Le
            java.nio.ByteBuffer r0 = r2.bb
            int r1 = r2.vtable_start
            int r1 = r1 + r3
            short r0 = r0.getShort(r1)
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public void __reset() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.__reset(r0, r1)
            return
    }

    protected void __reset(int r4, java.nio.ByteBuffer r5) {
            r3 = this;
            r3.bb = r5
            java.nio.ByteBuffer r0 = r3.bb
            if (r0 == 0) goto L20
            r3.bb_pos = r4
            int r0 = r3.bb_pos
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r1 = r1.getInt(r2)
            int r0 = r0 - r1
            r3.vtable_start = r0
            java.nio.ByteBuffer r0 = r3.bb
            int r1 = r3.vtable_start
            short r0 = r0.getShort(r1)
            r3.vtable_size = r0
            goto L27
        L20:
            r0 = 0
            r3.bb_pos = r0
            r3.vtable_start = r0
            r3.vtable_size = r0
        L27:
            return
    }

    protected java.lang.String __string(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.bb
            androidx.emoji2.text.flatbuffer.Utf8 r1 = r2.utf8
            java.lang.String r0 = __string(r3, r0, r1)
            return r0
    }

    protected androidx.emoji2.text.flatbuffer.Table __union(androidx.emoji2.text.flatbuffer.Table r2, int r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.bb
            androidx.emoji2.text.flatbuffer.Table r0 = __union(r2, r3, r0)
            return r0
    }

    protected int __vector(int r2) {
            r1 = this;
            int r0 = r1.bb_pos
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.bb
            int r0 = r0.getInt(r2)
            int r0 = r0 + r2
            int r0 = r0 + 4
            return r0
    }

    protected java.nio.ByteBuffer __vector_as_bytebuffer(int r5, int r6) {
            r4 = this;
            int r0 = r4.__offset(r5)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.nio.ByteBuffer r1 = r4.bb
            java.nio.ByteBuffer r1 = r1.duplicate()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            int r2 = r4.__vector(r0)
            r1.position(r2)
            int r3 = r4.__vector_len(r0)
            int r3 = r3 * r6
            int r3 = r3 + r2
            r1.limit(r3)
            return r1
    }

    protected java.nio.ByteBuffer __vector_in_bytebuffer(java.nio.ByteBuffer r4, int r5, int r6) {
            r3 = this;
            int r0 = r3.__offset(r5)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = r3.__vector(r0)
            r4.rewind()
            int r2 = r3.__vector_len(r0)
            int r2 = r2 * r6
            int r2 = r2 + r1
            r4.limit(r2)
            r4.position(r1)
            return r4
    }

    protected int __vector_len(int r2) {
            r1 = this;
            int r0 = r1.bb_pos
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.bb
            int r0 = r0.getInt(r2)
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.bb
            int r0 = r0.getInt(r2)
            return r0
    }

    public java.nio.ByteBuffer getByteBuffer() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.bb
            return r0
    }

    protected int keysCompare(java.lang.Integer r2, java.lang.Integer r3, java.nio.ByteBuffer r4) {
            r1 = this;
            r0 = 0
            return r0
    }

    protected void sortTables(int[] r4, java.nio.ByteBuffer r5) {
            r3 = this;
            int r0 = r4.length
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L12
            r2 = r4[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            androidx.emoji2.text.flatbuffer.Table$1 r1 = new androidx.emoji2.text.flatbuffer.Table$1
            r1.<init>(r3, r5)
            java.util.Arrays.sort(r0, r1)
            r1 = 0
        L1b:
            int r2 = r4.length
            if (r1 >= r2) goto L29
            r2 = r0[r1]
            int r2 = r2.intValue()
            r4[r1] = r2
            int r1 = r1 + 1
            goto L1b
        L29:
            return
    }
}
