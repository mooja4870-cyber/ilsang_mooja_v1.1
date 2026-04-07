package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public class FlexBuffers {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final androidx.emoji2.text.flatbuffer.ReadBuf EMPTY_BB = null;
    public static final int FBT_BLOB = 25;
    public static final int FBT_BOOL = 26;
    public static final int FBT_FLOAT = 3;
    public static final int FBT_INDIRECT_FLOAT = 8;
    public static final int FBT_INDIRECT_INT = 6;
    public static final int FBT_INDIRECT_UINT = 7;
    public static final int FBT_INT = 1;
    public static final int FBT_KEY = 4;
    public static final int FBT_MAP = 9;
    public static final int FBT_NULL = 0;
    public static final int FBT_STRING = 5;
    public static final int FBT_UINT = 2;
    public static final int FBT_VECTOR = 10;
    public static final int FBT_VECTOR_BOOL = 36;
    public static final int FBT_VECTOR_FLOAT = 13;
    public static final int FBT_VECTOR_FLOAT2 = 18;
    public static final int FBT_VECTOR_FLOAT3 = 21;
    public static final int FBT_VECTOR_FLOAT4 = 24;
    public static final int FBT_VECTOR_INT = 11;
    public static final int FBT_VECTOR_INT2 = 16;
    public static final int FBT_VECTOR_INT3 = 19;
    public static final int FBT_VECTOR_INT4 = 22;
    public static final int FBT_VECTOR_KEY = 14;
    public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
    public static final int FBT_VECTOR_UINT = 12;
    public static final int FBT_VECTOR_UINT2 = 17;
    public static final int FBT_VECTOR_UINT3 = 20;
    public static final int FBT_VECTOR_UINT4 = 23;

    public static class Blob extends androidx.emoji2.text.flatbuffer.FlexBuffers.Sized {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final androidx.emoji2.text.flatbuffer.FlexBuffers.Blob EMPTY = null;

        static {
                java.lang.Class<androidx.emoji2.text.flatbuffer.FlexBuffers> r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.class
                androidx.emoji2.text.flatbuffer.FlexBuffers$Blob r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Blob
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$000()
                r2 = 1
                r0.<init>(r1, r2, r2)
                androidx.emoji2.text.flatbuffer.FlexBuffers.Blob.EMPTY = r0
                return
        }

        Blob(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.Blob empty() {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Blob r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Blob.EMPTY
                return r0
        }

        public java.nio.ByteBuffer data() {
                r3 = this;
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                byte[] r0 = r0.data()
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                int r1 = r3.end
                r0.position(r1)
                int r1 = r3.end
                int r2 = r3.size()
                int r1 = r1 + r2
                r0.limit(r1)
                java.nio.ByteBuffer r1 = r0.asReadOnlyBuffer()
                java.nio.ByteBuffer r1 = r1.slice()
                return r1
        }

        public byte get(int r3) {
                r2 = this;
                if (r3 < 0) goto L12
                int r0 = r2.size()
                if (r3 > r0) goto L12
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r2.bb
                int r1 = r2.end
                int r1 = r1 + r3
                byte r0 = r0.get(r1)
                return r0
            L12:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        public byte[] getBytes() {
                r5 = this;
                int r0 = r5.size()
                byte[] r1 = new byte[r0]
                r2 = 0
            L7:
                if (r2 >= r0) goto L17
                androidx.emoji2.text.flatbuffer.ReadBuf r3 = r5.bb
                int r4 = r5.end
                int r4 = r4 + r2
                byte r3 = r3.get(r4)
                r1[r2] = r3
                int r2 = r2 + 1
                goto L7
            L17:
                return r1
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
                r1 = this;
                int r0 = super.size()
                return r0
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.String toString() {
                r3 = this;
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r1 = r3.end
                int r2 = r3.size()
                java.lang.String r0 = r0.getString(r1, r2)
                return r0
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder r5) {
                r4 = this;
                r0 = 34
                r5.append(r0)
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.size()
                java.lang.String r1 = r1.getString(r2, r3)
                r5.append(r1)
                java.lang.StringBuilder r0 = r5.append(r0)
                return r0
        }
    }

    public static class FlexBufferException extends java.lang.RuntimeException {
        FlexBufferException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public static class Key extends androidx.emoji2.text.flatbuffer.FlexBuffers.Object {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.Key EMPTY = null;

        static {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Key
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$000()
                r2 = 0
                r0.<init>(r1, r2, r2)
                androidx.emoji2.text.flatbuffer.FlexBuffers.Key.EMPTY = r0
                return
        }

        Key(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        static /* synthetic */ androidx.emoji2.text.flatbuffer.FlexBuffers.Key access$700() {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Key.EMPTY
                return r0
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.Key empty() {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Key.EMPTY
                return r0
        }

        int compareTo(byte[] r6) {
                r5 = this;
                int r0 = r5.end
                r1 = 0
            L3:
                androidx.emoji2.text.flatbuffer.ReadBuf r2 = r5.bb
                byte r2 = r2.get(r0)
                r3 = r6[r1]
                if (r2 != 0) goto L10
                int r4 = r2 - r3
                return r4
            L10:
                int r0 = r0 + 1
                int r1 = r1 + 1
                int r4 = r6.length
                if (r1 != r4) goto L1a
                int r4 = r2 - r3
                return r4
            L1a:
                if (r2 == r3) goto L3
                int r4 = r2 - r3
                return r4
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof androidx.emoji2.text.flatbuffer.FlexBuffers.Key
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                r0 = r4
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r0 = (androidx.emoji2.text.flatbuffer.FlexBuffers.Key) r0
                int r0 = r0.end
                int r2 = r3.end
                if (r0 != r2) goto L19
                r0 = r4
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r0 = (androidx.emoji2.text.flatbuffer.FlexBuffers.Key) r0
                int r0 = r0.byteWidth
                int r2 = r3.byteWidth
                if (r0 != r2) goto L19
                r1 = 1
            L19:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.end
                int r1 = r2.byteWidth
                r0 = r0 ^ r1
                return r0
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.String toString() {
                r3 = this;
                int r0 = r3.end
            L2:
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r3.bb
                byte r1 = r1.get(r0)
                if (r1 != 0) goto L18
                int r1 = r3.end
                int r1 = r0 - r1
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r3.bb
                int r2 = r3.end
                java.lang.String r0 = r0.getString(r2, r1)
                return r0
            L18:
                int r0 = r0 + 1
                goto L2
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder r2) {
                r1 = this;
                java.lang.String r0 = r1.toString()
                java.lang.StringBuilder r0 = r2.append(r0)
                return r0
        }
    }

    public static class KeyVector {
        private final androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector vec;

        KeyVector(androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector r1) {
                r0 = this;
                r0.<init>()
                r0.vec = r1
                return
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Key get(int r7) {
                r6 = this;
                int r0 = r6.size()
                if (r7 < r0) goto Lb
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.Key.access$700()
                return r1
            Lb:
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r1 = r6.vec
                int r1 = r1.end
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r2 = r6.vec
                int r2 = r2.byteWidth
                int r2 = r2 * r7
                int r1 = r1 + r2
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r2 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Key
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r3 = r6.vec
                androidx.emoji2.text.flatbuffer.ReadBuf r3 = r3.bb
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r4 = r6.vec
                androidx.emoji2.text.flatbuffer.ReadBuf r4 = r4.bb
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r5 = r6.vec
                int r5 = r5.byteWidth
                int r4 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r4, r1, r5)
                r5 = 1
                r2.<init>(r3, r4, r5)
                return r2
        }

        public int size() {
                r1 = this;
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r0 = r1.vec
                int r0 = r0.size()
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 91
                r0.append(r1)
                r1 = 0
            Lb:
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r2 = r3.vec
                int r2 = r2.size()
                if (r1 >= r2) goto L2e
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r2 = r3.vec
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r2 = r2.get(r1)
                r2.toString(r0)
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r2 = r3.vec
                int r2 = r2.size()
                int r2 = r2 + (-1)
                if (r1 == r2) goto L2b
                java.lang.String r2 = ", "
                r0.append(r2)
            L2b:
                int r1 = r1 + 1
                goto Lb
            L2e:
                java.lang.String r1 = "]"
                java.lang.StringBuilder r1 = r0.append(r1)
                java.lang.String r1 = r1.toString()
                return r1
        }
    }

    public static class Map extends androidx.emoji2.text.flatbuffer.FlexBuffers.Vector {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.Map EMPTY_MAP = null;

        static {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Map r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Map
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$000()
                r2 = 1
                r0.<init>(r1, r2, r2)
                androidx.emoji2.text.flatbuffer.FlexBuffers.Map.EMPTY_MAP = r0
                return
        }

        Map(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        private int binarySearch(androidx.emoji2.text.flatbuffer.FlexBuffers.KeyVector r6, byte[] r7) {
                r5 = this;
                r0 = 0
                int r1 = r6.size()
                int r1 = r1 + (-1)
            L7:
                if (r0 > r1) goto L20
                int r2 = r0 + r1
                int r2 = r2 >>> 1
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r3 = r6.get(r2)
                int r4 = r3.compareTo(r7)
                if (r4 >= 0) goto L1a
                int r0 = r2 + 1
                goto L1e
            L1a:
                if (r4 <= 0) goto L1f
                int r1 = r2 + (-1)
            L1e:
                goto L7
            L1f:
                return r2
            L20:
                int r2 = r0 + 1
                int r2 = -r2
                return r2
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.Map empty() {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Map r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Map.EMPTY_MAP
                return r0
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Reference get(java.lang.String r2) {
                r1 = this;
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
                byte[] r0 = r2.getBytes(r0)
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r0 = r1.get(r0)
                return r0
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Reference get(byte[] r5) {
                r4 = this;
                androidx.emoji2.text.flatbuffer.FlexBuffers$KeyVector r0 = r4.keys()
                int r1 = r0.size()
                int r2 = r4.binarySearch(r0, r5)
                if (r2 < 0) goto L15
                if (r2 >= r1) goto L15
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r3 = r4.get(r2)
                return r3
            L15:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r3 = androidx.emoji2.text.flatbuffer.FlexBuffers.Reference.access$600()
                return r3
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.KeyVector keys() {
                r9 = this;
                r0 = 3
                int r1 = r9.end
                int r2 = r9.byteWidth
                int r2 = r2 * 3
                int r1 = r1 - r2
                androidx.emoji2.text.flatbuffer.FlexBuffers$KeyVector r2 = new androidx.emoji2.text.flatbuffer.FlexBuffers$KeyVector
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r3 = new androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector
                androidx.emoji2.text.flatbuffer.ReadBuf r4 = r9.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r5 = r9.bb
                int r6 = r9.byteWidth
                int r5 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r5, r1, r6)
                androidx.emoji2.text.flatbuffer.ReadBuf r6 = r9.bb
                int r7 = r9.byteWidth
                int r7 = r7 + r1
                int r8 = r9.byteWidth
                int r6 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r6, r7, r8)
                r7 = 4
                r3.<init>(r4, r5, r6, r7)
                r2.<init>(r3)
                return r2
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder r7) {
                r6 = this;
                java.lang.String r0 = "{ "
                r7.append(r0)
                androidx.emoji2.text.flatbuffer.FlexBuffers$KeyVector r0 = r6.keys()
                int r1 = r6.size()
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r2 = r6.values()
                r3 = 0
            L12:
                if (r3 >= r1) goto L42
                r4 = 34
                java.lang.StringBuilder r4 = r7.append(r4)
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r5 = r0.get(r3)
                java.lang.String r5 = r5.toString()
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.String r5 = "\" : "
                r4.append(r5)
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r4 = r2.get(r3)
                java.lang.String r4 = r4.toString()
                r7.append(r4)
                int r4 = r1 + (-1)
                if (r3 == r4) goto L3f
                java.lang.String r4 = ", "
                r7.append(r4)
            L3f:
                int r3 = r3 + 1
                goto L12
            L42:
                java.lang.String r3 = " }"
                r7.append(r3)
                return r7
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Vector values() {
                r4 = this;
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Vector
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.byteWidth
                r0.<init>(r1, r2, r3)
                return r0
        }
    }

    private static abstract class Object {
        androidx.emoji2.text.flatbuffer.ReadBuf bb;
        int byteWidth;
        int end;

        Object(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.bb = r1
                r0.end = r2
                r0.byteWidth = r3
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 128(0x80, float:1.8E-43)
                r0.<init>(r1)
                java.lang.StringBuilder r0 = r2.toString(r0)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public abstract java.lang.StringBuilder toString(java.lang.StringBuilder r1);
    }

    public static class Reference {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.Reference NULL_REFERENCE = null;
        private androidx.emoji2.text.flatbuffer.ReadBuf bb;
        private int byteWidth;
        private int end;
        private int parentWidth;
        private int type;

        static {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Reference
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$000()
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3, r2)
                androidx.emoji2.text.flatbuffer.FlexBuffers.Reference.NULL_REFERENCE = r0
                return
        }

        Reference(androidx.emoji2.text.flatbuffer.ReadBuf r9, int r10, int r11, int r12) {
                r8 = this;
                r0 = r12 & 3
                r1 = 1
                int r6 = r1 << r0
                int r7 = r12 >> 2
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r2.<init>(r3, r4, r5, r6, r7)
                return
        }

        Reference(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.bb = r1
                r0.end = r2
                r0.parentWidth = r3
                r0.byteWidth = r4
                r0.type = r5
                return
        }

        static /* synthetic */ androidx.emoji2.text.flatbuffer.FlexBuffers.Reference access$600() {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Reference.NULL_REFERENCE
                return r0
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Blob asBlob() {
                r5 = this;
                boolean r0 = r5.isBlob()
                if (r0 != 0) goto L12
                boolean r0 = r5.isString()
                if (r0 == 0) goto Ld
                goto L12
            Ld:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Blob r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Blob.empty()
                return r0
            L12:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Blob r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Blob
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r5.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r2 = r5.bb
                int r3 = r5.end
                int r4 = r5.parentWidth
                int r2 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r2, r3, r4)
                int r3 = r5.byteWidth
                r0.<init>(r1, r2, r3)
                return r0
        }

        public boolean asBoolean() {
                r7 = this;
                boolean r0 = r7.isBoolean()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L15
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r7.bb
                int r3 = r7.end
                byte r0 = r0.get(r3)
                if (r0 == 0) goto L13
                goto L14
            L13:
                r1 = r2
            L14:
                return r1
            L15:
                long r3 = r7.asUInt()
                r5 = 0
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 == 0) goto L20
                goto L21
            L20:
                r1 = r2
            L21:
                return r1
        }

        public double asFloat() {
                r4 = this;
                int r0 = r4.type
                r1 = 3
                if (r0 != r1) goto L10
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                double r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$400(r0, r1, r2)
                return r0
            L10:
                int r0 = r4.type
                r1 = 0
                switch(r0) {
                    case 0: goto L7e;
                    case 1: goto L72;
                    case 2: goto L66;
                    case 5: goto L5d;
                    case 6: goto L49;
                    case 7: goto L35;
                    case 8: goto L22;
                    case 10: goto L18;
                    case 26: goto L66;
                    default: goto L17;
                }
            L17:
                return r1
            L18:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = r4.asVector()
                int r0 = r0.size()
                double r0 = (double) r0
                return r0
            L22:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                double r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$400(r0, r1, r2)
                return r0
            L35:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r0, r1, r2)
                double r0 = (double) r0
                return r0
            L49:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r0, r1, r2)
                double r0 = (double) r0
                return r0
            L5d:
                java.lang.String r0 = r4.asString()
                double r0 = java.lang.Double.parseDouble(r0)
                return r0
            L66:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r0, r1, r2)
                double r0 = (double) r0
                return r0
            L72:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r0, r1, r2)
                double r0 = (double) r0
                return r0
            L7e:
                return r1
        }

        public int asInt() {
                r4 = this;
                int r0 = r4.type
                r1 = 1
                if (r0 != r1) goto L10
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r0, r1, r2)
                return r0
            L10:
                int r0 = r4.type
                r1 = 0
                switch(r0) {
                    case 0: goto L87;
                    case 2: goto L7b;
                    case 3: goto L6f;
                    case 5: goto L66;
                    case 6: goto L53;
                    case 7: goto L3f;
                    case 8: goto L2b;
                    case 10: goto L22;
                    case 26: goto L17;
                    default: goto L16;
                }
            L16:
                return r1
            L17:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r0, r1, r2)
                return r0
            L22:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = r4.asVector()
                int r0 = r0.size()
                return r0
            L2b:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                double r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$400(r0, r1, r2)
                int r0 = (int) r0
                return r0
            L3f:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.parentWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r0, r1, r2)
                int r0 = (int) r0
                return r0
            L53:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r0, r1, r2)
                return r0
            L66:
                java.lang.String r0 = r4.asString()
                int r0 = java.lang.Integer.parseInt(r0)
                return r0
            L6f:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                double r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$400(r0, r1, r2)
                int r0 = (int) r0
                return r0
            L7b:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r0, r1, r2)
                int r0 = (int) r0
                return r0
            L87:
                return r1
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Key asKey() {
                r5 = this;
                boolean r0 = r5.isKey()
                if (r0 == 0) goto L1a
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Key
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r5.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r2 = r5.bb
                int r3 = r5.end
                int r4 = r5.parentWidth
                int r2 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r2, r3, r4)
                int r3 = r5.byteWidth
                r0.<init>(r1, r2, r3)
                return r0
            L1a:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Key.empty()
                return r0
        }

        public long asLong() {
                r4 = this;
                int r0 = r4.type
                r1 = 1
                if (r0 != r1) goto L10
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$500(r0, r1, r2)
                return r0
            L10:
                int r0 = r4.type
                r1 = 0
                switch(r0) {
                    case 0: goto L8a;
                    case 2: goto L7f;
                    case 3: goto L73;
                    case 5: goto L68;
                    case 6: goto L55;
                    case 7: goto L42;
                    case 8: goto L2e;
                    case 10: goto L24;
                    case 26: goto L18;
                    default: goto L17;
                }
            L17:
                return r1
            L18:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L24:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = r4.asVector()
                int r0 = r0.size()
                long r0 = (long) r0
                return r0
            L2e:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                double r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$400(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L42:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.parentWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r0, r1, r2)
                return r0
            L55:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$500(r0, r1, r2)
                return r0
            L68:
                java.lang.String r0 = r4.asString()     // Catch: java.lang.NumberFormatException -> L71
                long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L71
                return r0
            L71:
                r0 = move-exception
                return r1
            L73:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                double r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$400(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L7f:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r0, r1, r2)
                return r0
            L8a:
                return r1
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Map asMap() {
                r5 = this;
                boolean r0 = r5.isMap()
                if (r0 == 0) goto L1a
                androidx.emoji2.text.flatbuffer.FlexBuffers$Map r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Map
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r5.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r2 = r5.bb
                int r3 = r5.end
                int r4 = r5.parentWidth
                int r2 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r2, r3, r4)
                int r3 = r5.byteWidth
                r0.<init>(r1, r2, r3)
                return r0
            L1a:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Map r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Map.empty()
                return r0
        }

        public java.lang.String asString() {
                r4 = this;
                boolean r0 = r4.isString()
                if (r0 == 0) goto L24
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r0, r1, r2)
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.byteWidth
                int r2 = r0 - r2
                int r3 = r4.byteWidth
                long r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r1, r2, r3)
                int r1 = (int) r1
                androidx.emoji2.text.flatbuffer.ReadBuf r2 = r4.bb
                java.lang.String r2 = r2.getString(r0, r1)
                return r2
            L24:
                boolean r0 = r4.isKey()
                if (r0 == 0) goto L49
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.byteWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r0, r1, r2)
                r1 = r0
            L35:
                androidx.emoji2.text.flatbuffer.ReadBuf r2 = r4.bb
                byte r2 = r2.get(r1)
                if (r2 != 0) goto L46
                androidx.emoji2.text.flatbuffer.ReadBuf r2 = r4.bb
                int r3 = r1 - r0
                java.lang.String r2 = r2.getString(r0, r3)
                return r2
            L46:
                int r1 = r1 + 1
                goto L35
            L49:
                java.lang.String r0 = ""
                return r0
        }

        public long asUInt() {
                r4 = this;
                int r0 = r4.type
                r1 = 2
                if (r0 != r1) goto L10
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r0, r1, r2)
                return r0
            L10:
                int r0 = r4.type
                r1 = 0
                switch(r0) {
                    case 0: goto L88;
                    case 1: goto L7d;
                    case 3: goto L71;
                    case 5: goto L68;
                    case 6: goto L55;
                    case 7: goto L42;
                    case 8: goto L2e;
                    case 10: goto L24;
                    case 26: goto L18;
                    default: goto L17;
                }
            L17:
                return r1
            L18:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L24:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = r4.asVector()
                int r0 = r0.size()
                long r0 = (long) r0
                return r0
            L2e:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.parentWidth
                double r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$400(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L42:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$300(r0, r1, r2)
                return r0
            L55:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r4.bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$500(r0, r1, r2)
                return r0
            L68:
                java.lang.String r0 = r4.asString()
                long r0 = java.lang.Long.parseLong(r0)
                return r0
            L71:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                double r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$400(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L7d:
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r4.bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$500(r0, r1, r2)
                return r0
            L88:
                return r1
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Vector asVector() {
                r5 = this;
                boolean r0 = r5.isVector()
                if (r0 == 0) goto L1a
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Vector
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r5.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r2 = r5.bb
                int r3 = r5.end
                int r4 = r5.parentWidth
                int r2 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r2, r3, r4)
                int r3 = r5.byteWidth
                r0.<init>(r1, r2, r3)
                return r0
            L1a:
                int r0 = r5.type
                r1 = 15
                if (r0 != r1) goto L35
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r5.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r2 = r5.bb
                int r3 = r5.end
                int r4 = r5.parentWidth
                int r2 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r2, r3, r4)
                int r3 = r5.byteWidth
                r4 = 4
                r0.<init>(r1, r2, r3, r4)
                return r0
            L35:
                int r0 = r5.type
                boolean r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.isTypedVector(r0)
                if (r0 == 0) goto L57
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = r5.bb
                androidx.emoji2.text.flatbuffer.ReadBuf r2 = r5.bb
                int r3 = r5.end
                int r4 = r5.parentWidth
                int r2 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$200(r2, r3, r4)
                int r3 = r5.byteWidth
                int r4 = r5.type
                int r4 = androidx.emoji2.text.flatbuffer.FlexBuffers.toTypedVectorElementType(r4)
                r0.<init>(r1, r2, r3, r4)
                return r0
            L57:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Vector.empty()
                return r0
        }

        public int getType() {
                r1 = this;
                int r0 = r1.type
                return r0
        }

        public boolean isBlob() {
                r2 = this;
                int r0 = r2.type
                r1 = 25
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public boolean isBoolean() {
                r2 = this;
                int r0 = r2.type
                r1 = 26
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public boolean isFloat() {
                r2 = this;
                int r0 = r2.type
                r1 = 3
                if (r0 == r1) goto Le
                int r0 = r2.type
                r1 = 8
                if (r0 != r1) goto Lc
                goto Le
            Lc:
                r0 = 0
                goto Lf
            Le:
                r0 = 1
            Lf:
                return r0
        }

        public boolean isInt() {
                r3 = this;
                int r0 = r3.type
                r1 = 1
                if (r0 == r1) goto Lc
                int r0 = r3.type
                r2 = 6
                if (r0 != r2) goto Lb
                goto Lc
            Lb:
                r1 = 0
            Lc:
                return r1
        }

        public boolean isIntOrUInt() {
                r1 = this;
                boolean r0 = r1.isInt()
                if (r0 != 0) goto Lf
                boolean r0 = r1.isUInt()
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        public boolean isKey() {
                r2 = this;
                int r0 = r2.type
                r1 = 4
                if (r0 != r1) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                return r0
        }

        public boolean isMap() {
                r2 = this;
                int r0 = r2.type
                r1 = 9
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public boolean isNull() {
                r1 = this;
                int r0 = r1.type
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public boolean isNumeric() {
                r1 = this;
                boolean r0 = r1.isIntOrUInt()
                if (r0 != 0) goto Lf
                boolean r0 = r1.isFloat()
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        public boolean isString() {
                r2 = this;
                int r0 = r2.type
                r1 = 5
                if (r0 != r1) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                return r0
        }

        public boolean isTypedVector() {
                r1 = this;
                int r0 = r1.type
                boolean r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.isTypedVector(r0)
                return r0
        }

        public boolean isUInt() {
                r2 = this;
                int r0 = r2.type
                r1 = 2
                if (r0 == r1) goto Ld
                int r0 = r2.type
                r1 = 7
                if (r0 != r1) goto Lb
                goto Ld
            Lb:
                r0 = 0
                goto Le
            Ld:
                r0 = 1
            Le:
                return r0
        }

        public boolean isVector() {
                r2 = this;
                int r0 = r2.type
                r1 = 10
                if (r0 == r1) goto Lf
                int r0 = r2.type
                r1 = 9
                if (r0 != r1) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 128(0x80, float:1.8E-43)
                r0.<init>(r1)
                java.lang.StringBuilder r0 = r2.toString(r0)
                java.lang.String r0 = r0.toString()
                return r0
        }

        java.lang.StringBuilder toString(java.lang.StringBuilder r4) {
                r3 = this;
                int r0 = r3.type
                r1 = 34
                switch(r0) {
                    case 0: goto L8d;
                    case 1: goto L84;
                    case 2: goto L7b;
                    case 3: goto L72;
                    case 4: goto L61;
                    case 5: goto L50;
                    case 6: goto L84;
                    case 7: goto L7b;
                    case 8: goto L72;
                    case 9: goto L47;
                    case 10: goto L3e;
                    case 11: goto L35;
                    case 12: goto L35;
                    case 13: goto L35;
                    case 14: goto L35;
                    case 15: goto L35;
                    case 16: goto L1a;
                    case 17: goto L1a;
                    case 18: goto L1a;
                    case 19: goto L1a;
                    case 20: goto L1a;
                    case 21: goto L1a;
                    case 22: goto L1a;
                    case 23: goto L1a;
                    case 24: goto L1a;
                    case 25: goto L11;
                    case 26: goto L8;
                    case 27: goto L7;
                    case 28: goto L7;
                    case 29: goto L7;
                    case 30: goto L7;
                    case 31: goto L7;
                    case 32: goto L7;
                    case 33: goto L7;
                    case 34: goto L7;
                    case 35: goto L7;
                    case 36: goto L35;
                    default: goto L7;
                }
            L7:
                return r4
            L8:
                boolean r0 = r3.asBoolean()
                java.lang.StringBuilder r0 = r4.append(r0)
                return r0
            L11:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Blob r0 = r3.asBlob()
                java.lang.StringBuilder r0 = r0.toString(r4)
                return r0
            L1a:
                androidx.emoji2.text.flatbuffer.FlexBuffers$FlexBufferException r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$FlexBufferException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "not_implemented:"
                java.lang.StringBuilder r1 = r1.append(r2)
                int r2 = r3.type
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L35:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = r3.asVector()
                java.lang.StringBuilder r0 = r4.append(r0)
                return r0
            L3e:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = r3.asVector()
                java.lang.StringBuilder r0 = r0.toString(r4)
                return r0
            L47:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Map r0 = r3.asMap()
                java.lang.StringBuilder r0 = r0.toString(r4)
                return r0
            L50:
                java.lang.StringBuilder r0 = r4.append(r1)
                java.lang.String r2 = r3.asString()
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                return r0
            L61:
                androidx.emoji2.text.flatbuffer.FlexBuffers$Key r0 = r3.asKey()
                java.lang.StringBuilder r2 = r4.append(r1)
                java.lang.StringBuilder r0 = r0.toString(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                return r0
            L72:
                double r0 = r3.asFloat()
                java.lang.StringBuilder r0 = r4.append(r0)
                return r0
            L7b:
                long r0 = r3.asUInt()
                java.lang.StringBuilder r0 = r4.append(r0)
                return r0
            L84:
                long r0 = r3.asLong()
                java.lang.StringBuilder r0 = r4.append(r0)
                return r0
            L8d:
                java.lang.String r0 = "null"
                java.lang.StringBuilder r0 = r4.append(r0)
                return r0
        }
    }

    private static abstract class Sized extends androidx.emoji2.text.flatbuffer.FlexBuffers.Object {
        protected final int size;

        Sized(androidx.emoji2.text.flatbuffer.ReadBuf r3, int r4, int r5) {
                r2 = this;
                r2.<init>(r3, r4, r5)
                androidx.emoji2.text.flatbuffer.ReadBuf r0 = r2.bb
                int r1 = r4 - r5
                int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$100(r0, r1, r5)
                r2.size = r0
                return
        }

        public int size() {
                r1 = this;
                int r0 = r1.size
                return r0
        }
    }

    public static class TypedVector extends androidx.emoji2.text.flatbuffer.FlexBuffers.Vector {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector EMPTY_VECTOR = null;
        private final int elemType;

        static {
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$000()
                r2 = 1
                r0.<init>(r1, r2, r2, r2)
                androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector.EMPTY_VECTOR = r0
                return
        }

        TypedVector(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.elemType = r4
                return
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector empty() {
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector.EMPTY_VECTOR
                return r0
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public androidx.emoji2.text.flatbuffer.FlexBuffers.Reference get(int r10) {
                r9 = this;
                int r0 = r9.size()
                if (r10 < r0) goto Lb
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.Reference.access$600()
                return r1
            Lb:
                int r1 = r9.end
                int r2 = r9.byteWidth
                int r2 = r2 * r10
                int r5 = r1 + r2
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r3 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Reference
                androidx.emoji2.text.flatbuffer.ReadBuf r4 = r9.bb
                int r6 = r9.byteWidth
                r7 = 1
                int r8 = r9.elemType
                r3.<init>(r4, r5, r6, r7, r8)
                return r3
        }

        public int getElemType() {
                r1 = this;
                int r0 = r1.elemType
                return r0
        }

        public boolean isEmptyVector() {
                r1 = this;
                androidx.emoji2.text.flatbuffer.FlexBuffers$TypedVector r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector.EMPTY_VECTOR
                if (r1 != r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }
    }

    static class Unsigned {
        Unsigned() {
                r0 = this;
                r0.<init>()
                return
        }

        static int byteToUnsignedInt(byte r1) {
                r0 = r1 & 255(0xff, float:3.57E-43)
                return r0
        }

        static long intToUnsignedLong(int r4) {
                long r0 = (long) r4
                r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r0 = r0 & r2
                return r0
        }

        static int shortToUnsignedInt(short r1) {
                r0 = 65535(0xffff, float:9.1834E-41)
                r0 = r0 & r1
                return r0
        }
    }

    public static class Vector extends androidx.emoji2.text.flatbuffer.FlexBuffers.Sized {
        private static final androidx.emoji2.text.flatbuffer.FlexBuffers.Vector EMPTY_VECTOR = null;

        static {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Vector
                androidx.emoji2.text.flatbuffer.ReadBuf r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.access$000()
                r2 = 1
                r0.<init>(r1, r2, r2)
                androidx.emoji2.text.flatbuffer.FlexBuffers.Vector.EMPTY_VECTOR = r0
                return
        }

        Vector(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static androidx.emoji2.text.flatbuffer.FlexBuffers.Vector empty() {
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Vector.EMPTY_VECTOR
                return r0
        }

        public androidx.emoji2.text.flatbuffer.FlexBuffers.Reference get(int r8) {
                r7 = this;
                int r0 = r7.size()
                long r0 = (long) r0
                long r2 = (long) r8
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 < 0) goto Lf
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r2 = androidx.emoji2.text.flatbuffer.FlexBuffers.Reference.access$600()
                return r2
            Lf:
                androidx.emoji2.text.flatbuffer.ReadBuf r2 = r7.bb
                int r3 = r7.end
                long r3 = (long) r3
                int r5 = r7.byteWidth
                long r5 = (long) r5
                long r5 = r5 * r0
                long r3 = r3 + r5
                long r5 = (long) r8
                long r3 = r3 + r5
                int r3 = (int) r3
                byte r2 = r2.get(r3)
                int r2 = androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.byteToUnsignedInt(r2)
                int r3 = r7.end
                int r4 = r7.byteWidth
                int r4 = r4 * r8
                int r3 = r3 + r4
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r4 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Reference
                androidx.emoji2.text.flatbuffer.ReadBuf r5 = r7.bb
                int r6 = r7.byteWidth
                r4.<init>(r5, r3, r6, r2)
                return r4
        }

        public boolean isEmpty() {
                r1 = this;
                androidx.emoji2.text.flatbuffer.FlexBuffers$Vector r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Vector.EMPTY_VECTOR
                if (r1 != r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
                r1 = this;
                int r0 = super.size()
                return r0
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public /* bridge */ /* synthetic */ java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = super.toString()
                return r0
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder r4) {
                r3 = this;
                java.lang.String r0 = "[ "
                r4.append(r0)
                int r0 = r3.size()
                r1 = 0
            La:
                if (r1 >= r0) goto L1f
                androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r2 = r3.get(r1)
                r2.toString(r4)
                int r2 = r0 + (-1)
                if (r1 == r2) goto L1c
                java.lang.String r2 = ", "
                r4.append(r2)
            L1c:
                int r1 = r1 + 1
                goto La
            L1f:
                java.lang.String r1 = " ]"
                r4.append(r1)
                return r4
        }
    }

    static {
            androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf r0 = new androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf
            r1 = 1
            byte[] r2 = new byte[r1]
            r3 = 0
            r2[r3] = r3
            r0.<init>(r2, r1)
            androidx.emoji2.text.flatbuffer.FlexBuffers.EMPTY_BB = r0
            return
    }

    public FlexBuffers() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ androidx.emoji2.text.flatbuffer.ReadBuf access$000() {
            androidx.emoji2.text.flatbuffer.ReadBuf r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.EMPTY_BB
            return r0
    }

    static /* synthetic */ int access$100(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3) {
            int r0 = readInt(r1, r2, r3)
            return r0
    }

    static /* synthetic */ int access$200(androidx.emoji2.text.flatbuffer.ReadBuf r1, int r2, int r3) {
            int r0 = indirect(r1, r2, r3)
            return r0
    }

    static /* synthetic */ long access$300(androidx.emoji2.text.flatbuffer.ReadBuf r2, int r3, int r4) {
            long r0 = readUInt(r2, r3, r4)
            return r0
    }

    static /* synthetic */ double access$400(androidx.emoji2.text.flatbuffer.ReadBuf r2, int r3, int r4) {
            double r0 = readDouble(r2, r3, r4)
            return r0
    }

    static /* synthetic */ long access$500(androidx.emoji2.text.flatbuffer.ReadBuf r2, int r3, int r4) {
            long r0 = readLong(r2, r3, r4)
            return r0
    }

    public static androidx.emoji2.text.flatbuffer.FlexBuffers.Reference getRoot(androidx.emoji2.text.flatbuffer.ReadBuf r4) {
            int r0 = r4.limit()
            int r0 = r0 + (-1)
            byte r1 = r4.get(r0)
            int r0 = r0 + (-1)
            byte r2 = r4.get(r0)
            int r2 = androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.byteToUnsignedInt(r2)
            int r0 = r0 - r1
            androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r3 = new androidx.emoji2.text.flatbuffer.FlexBuffers$Reference
            r3.<init>(r4, r0, r1, r2)
            return r3
    }

    @java.lang.Deprecated
    public static androidx.emoji2.text.flatbuffer.FlexBuffers.Reference getRoot(java.nio.ByteBuffer r3) {
            boolean r0 = r3.hasArray()
            if (r0 == 0) goto L14
            androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf r0 = new androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf
            byte[] r1 = r3.array()
            int r2 = r3.limit()
            r0.<init>(r1, r2)
            goto L19
        L14:
            androidx.emoji2.text.flatbuffer.ByteBufferReadWriteBuf r0 = new androidx.emoji2.text.flatbuffer.ByteBufferReadWriteBuf
            r0.<init>(r3)
        L19:
            androidx.emoji2.text.flatbuffer.FlexBuffers$Reference r0 = getRoot(r0)
            return r0
    }

    private static int indirect(androidx.emoji2.text.flatbuffer.ReadBuf r4, int r5, int r6) {
            long r0 = (long) r5
            long r2 = readUInt(r4, r5, r6)
            long r0 = r0 - r2
            int r0 = (int) r0
            return r0
    }

    static boolean isTypeInline(int r1) {
            r0 = 3
            if (r1 <= r0) goto La
            r0 = 26
            if (r1 != r0) goto L8
            goto La
        L8:
            r0 = 0
            goto Lb
        La:
            r0 = 1
        Lb:
            return r0
    }

    static boolean isTypedVector(int r1) {
            r0 = 11
            if (r1 < r0) goto L8
            r0 = 15
            if (r1 <= r0) goto Lc
        L8:
            r0 = 36
            if (r1 != r0) goto Le
        Lc:
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    static boolean isTypedVectorElementType(int r2) {
            r0 = 1
            if (r2 < r0) goto L6
            r1 = 4
            if (r2 <= r1) goto La
        L6:
            r1 = 26
            if (r2 != r1) goto Lb
        La:
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    private static double readDouble(androidx.emoji2.text.flatbuffer.ReadBuf r2, int r3, int r4) {
            switch(r4) {
                case 4: goto Lb;
                case 8: goto L6;
                default: goto L3;
            }
        L3:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            return r0
        L6:
            double r0 = r2.getDouble(r3)
            return r0
        Lb:
            float r0 = r2.getFloat(r3)
            double r0 = (double) r0
            return r0
    }

    private static int readInt(androidx.emoji2.text.flatbuffer.ReadBuf r2, int r3, int r4) {
            long r0 = readLong(r2, r3, r4)
            int r0 = (int) r0
            return r0
    }

    private static long readLong(androidx.emoji2.text.flatbuffer.ReadBuf r2, int r3, int r4) {
            switch(r4) {
                case 1: goto L17;
                case 2: goto L11;
                case 4: goto Lb;
                case 8: goto L6;
                default: goto L3;
            }
        L3:
            r0 = -1
            return r0
        L6:
            long r0 = r2.getLong(r3)
            return r0
        Lb:
            int r0 = r2.getInt(r3)
            long r0 = (long) r0
            return r0
        L11:
            short r0 = r2.getShort(r3)
            long r0 = (long) r0
            return r0
        L17:
            byte r0 = r2.get(r3)
            long r0 = (long) r0
            return r0
    }

    private static long readUInt(androidx.emoji2.text.flatbuffer.ReadBuf r2, int r3, int r4) {
            switch(r4) {
                case 1: goto L1e;
                case 2: goto L14;
                case 4: goto Lb;
                case 8: goto L6;
                default: goto L3;
            }
        L3:
            r0 = -1
            return r0
        L6:
            long r0 = r2.getLong(r3)
            return r0
        Lb:
            int r0 = r2.getInt(r3)
            long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.intToUnsignedLong(r0)
            return r0
        L14:
            short r0 = r2.getShort(r3)
            int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.shortToUnsignedInt(r0)
            long r0 = (long) r0
            return r0
        L1e:
            byte r0 = r2.get(r3)
            int r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.byteToUnsignedInt(r0)
            long r0 = (long) r0
            return r0
    }

    static int toTypedVector(int r1, int r2) {
            boolean r0 = isTypedVectorElementType(r1)
            if (r0 == 0) goto L24
            switch(r2) {
                case 0: goto L19;
                case 1: goto L9;
                case 2: goto L14;
                case 3: goto Lf;
                case 4: goto La;
                default: goto L9;
            }
        L9:
            goto L1e
        La:
            int r0 = r1 + (-1)
            int r0 = r0 + 22
            return r0
        Lf:
            int r0 = r1 + (-1)
            int r0 = r0 + 19
            return r0
        L14:
            int r0 = r1 + (-1)
            int r0 = r0 + 16
            return r0
        L19:
            int r0 = r1 + (-1)
            int r0 = r0 + 11
            return r0
        L1e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L24:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    static int toTypedVectorElementType(int r1) {
            int r0 = r1 + (-11)
            int r0 = r0 + 1
            return r0
    }
}
