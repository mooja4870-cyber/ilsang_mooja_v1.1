package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class MetadataList extends androidx.emoji2.text.flatbuffer.Table {

    public static final class Vector extends androidx.emoji2.text.flatbuffer.BaseVector {
        public Vector() {
                r0 = this;
                r0.<init>()
                return
        }

        public androidx.emoji2.text.flatbuffer.MetadataList.Vector __assign(int r1, int r2, java.nio.ByteBuffer r3) {
                r0 = this;
                r0.__reset(r1, r2, r3)
                return r0
        }

        public androidx.emoji2.text.flatbuffer.MetadataList get(int r2) {
                r1 = this;
                androidx.emoji2.text.flatbuffer.MetadataList r0 = new androidx.emoji2.text.flatbuffer.MetadataList
                r0.<init>()
                androidx.emoji2.text.flatbuffer.MetadataList r0 = r1.get(r0, r2)
                return r0
        }

        public androidx.emoji2.text.flatbuffer.MetadataList get(androidx.emoji2.text.flatbuffer.MetadataList r3, int r4) {
                r2 = this;
                int r0 = r2.__element(r4)
                java.nio.ByteBuffer r1 = r2.bb
                int r0 = androidx.emoji2.text.flatbuffer.MetadataList.access$000(r0, r1)
                java.nio.ByteBuffer r1 = r2.bb
                androidx.emoji2.text.flatbuffer.MetadataList r0 = r3.__assign(r0, r1)
                return r0
        }
    }

    public MetadataList() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void ValidateVersion() {
            androidx.emoji2.text.flatbuffer.Constants.FLATBUFFERS_1_12_0()
            return
    }

    static /* synthetic */ int access$000(int r1, java.nio.ByteBuffer r2) {
            int r0 = __indirect(r1, r2)
            return r0
    }

    public static void addList(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r2, int r3) {
            r0 = 1
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static void addSourceSha(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r2, int r3) {
            r0 = 2
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static void addVersion(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r1, int r2) {
            r0 = 0
            r1.addInt(r0, r2, r0)
            return
    }

    public static int createListVector(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r2, int[] r3) {
            r0 = 4
            int r1 = r3.length
            r2.startVector(r0, r1, r0)
            int r0 = r3.length
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L12
            r1 = r3[r0]
            r2.addOffset(r1)
            int r0 = r0 + (-1)
            goto L8
        L12:
            int r0 = r2.endVector()
            return r0
    }

    public static int createMetadataList(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r1, int r2, int r3, int r4) {
            r0 = 3
            r1.startTable(r0)
            addSourceSha(r1, r4)
            addList(r1, r3)
            addVersion(r1, r2)
            int r0 = endMetadataList(r1)
            return r0
    }

    public static int endMetadataList(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r1) {
            int r0 = r1.endTable()
            return r0
    }

    public static void finishMetadataListBuffer(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r0, int r1) {
            r0.finish(r1)
            return
    }

    public static void finishSizePrefixedMetadataListBuffer(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r0, int r1) {
            r0.finishSizePrefixed(r1)
            return
    }

    public static androidx.emoji2.text.flatbuffer.MetadataList getRootAsMetadataList(java.nio.ByteBuffer r1) {
            androidx.emoji2.text.flatbuffer.MetadataList r0 = new androidx.emoji2.text.flatbuffer.MetadataList
            r0.<init>()
            androidx.emoji2.text.flatbuffer.MetadataList r0 = getRootAsMetadataList(r1, r0)
            return r0
    }

    public static androidx.emoji2.text.flatbuffer.MetadataList getRootAsMetadataList(java.nio.ByteBuffer r2, androidx.emoji2.text.flatbuffer.MetadataList r3) {
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            int r0 = r2.position()
            int r0 = r2.getInt(r0)
            int r1 = r2.position()
            int r0 = r0 + r1
            androidx.emoji2.text.flatbuffer.MetadataList r0 = r3.__assign(r0, r2)
            return r0
    }

    public static void startListVector(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r1, int r2) {
            r0 = 4
            r1.startVector(r0, r2, r0)
            return
    }

    public static void startMetadataList(androidx.emoji2.text.flatbuffer.FlatBufferBuilder r1) {
            r0 = 3
            r1.startTable(r0)
            return
    }

    public androidx.emoji2.text.flatbuffer.MetadataList __assign(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.__init(r1, r2)
            return r0
    }

    public void __init(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.__reset(r1, r2)
            return
    }

    public androidx.emoji2.text.flatbuffer.MetadataItem list(int r2) {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataItem r0 = new androidx.emoji2.text.flatbuffer.MetadataItem
            r0.<init>()
            androidx.emoji2.text.flatbuffer.MetadataItem r0 = r1.list(r0, r2)
            return r0
    }

    public androidx.emoji2.text.flatbuffer.MetadataItem list(androidx.emoji2.text.flatbuffer.MetadataItem r4, int r5) {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L19
            int r1 = r3.__vector(r0)
            int r2 = r5 * 4
            int r1 = r1 + r2
            int r1 = r3.__indirect(r1)
            java.nio.ByteBuffer r2 = r3.bb
            androidx.emoji2.text.flatbuffer.MetadataItem r1 = r4.__assign(r1, r2)
            goto L1a
        L19:
            r1 = 0
        L1a:
            return r1
    }

    public int listLength() {
            r2 = this;
            r0 = 6
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto Lc
            int r1 = r2.__vector_len(r0)
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    public androidx.emoji2.text.flatbuffer.MetadataItem.Vector listVector() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataItem$Vector r0 = new androidx.emoji2.text.flatbuffer.MetadataItem$Vector
            r0.<init>()
            androidx.emoji2.text.flatbuffer.MetadataItem$Vector r0 = r1.listVector(r0)
            return r0
    }

    public androidx.emoji2.text.flatbuffer.MetadataItem.Vector listVector(androidx.emoji2.text.flatbuffer.MetadataItem.Vector r5) {
            r4 = this;
            r0 = 6
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L13
            int r1 = r4.__vector(r0)
            r2 = 4
            java.nio.ByteBuffer r3 = r4.bb
            androidx.emoji2.text.flatbuffer.MetadataItem$Vector r1 = r5.__assign(r1, r2, r3)
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    public java.lang.String sourceSha() {
            r2 = this;
            r0 = 8
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L10
            int r1 = r2.bb_pos
            int r1 = r1 + r0
            java.lang.String r1 = r2.__string(r1)
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public java.nio.ByteBuffer sourceShaAsByteBuffer() {
            r2 = this;
            r0 = 8
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_as_bytebuffer(r0, r1)
            return r0
    }

    public java.nio.ByteBuffer sourceShaInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            r0 = 8
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_in_bytebuffer(r3, r0, r1)
            return r0
    }

    public int version() {
            r3 = this;
            r0 = 4
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            int r1 = r1.getInt(r2)
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }
}
