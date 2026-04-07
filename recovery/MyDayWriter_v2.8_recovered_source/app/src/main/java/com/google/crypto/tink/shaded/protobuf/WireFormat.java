package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class WireFormat {
    static final int FIXED32_SIZE = 4;
    static final int FIXED64_SIZE = 8;
    static final int MAX_VARINT32_SIZE = 5;
    static final int MAX_VARINT64_SIZE = 10;
    static final int MAX_VARINT_SIZE = 10;
    static final int MESSAGE_SET_ITEM = 1;
    static final int MESSAGE_SET_ITEM_END_TAG = 0;
    static final int MESSAGE_SET_ITEM_TAG = 0;
    static final int MESSAGE_SET_MESSAGE = 3;
    static final int MESSAGE_SET_MESSAGE_TAG = 0;
    static final int MESSAGE_SET_TYPE_ID = 2;
    static final int MESSAGE_SET_TYPE_ID_TAG = 0;
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.WireFormat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L56
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r0 = move-exception
            L57:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L63
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32     // Catch: java.lang.NoSuchFieldError -> L63
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L63
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L63
                goto L64
            L63:
                r0 = move-exception
            L64:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L71
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
                goto L72
            L71:
                r0 = move-exception
            L72:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L7f
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BYTES     // Catch: java.lang.NoSuchFieldError -> L7f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7f
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7f
                goto L80
            L7f:
                r0 = move-exception
            L80:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L8d
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32     // Catch: java.lang.NoSuchFieldError -> L8d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8d
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8d
                goto L8e
            L8d:
                r0 = move-exception
            L8e:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L9b
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32     // Catch: java.lang.NoSuchFieldError -> L9b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9b
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9b
                goto L9c
            L9b:
                r0 = move-exception
            L9c:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> La9
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64     // Catch: java.lang.NoSuchFieldError -> La9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La9
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La9
                goto Laa
            La9:
                r0 = move-exception
            Laa:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lb7
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32     // Catch: java.lang.NoSuchFieldError -> Lb7
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb7
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb7
                goto Lb8
            Lb7:
                r0 = move-exception
            Lb8:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lc5
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64     // Catch: java.lang.NoSuchFieldError -> Lc5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc5
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc5
                goto Lc6
            Lc5:
                r0 = move-exception
            Lc6:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Ld3
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING     // Catch: java.lang.NoSuchFieldError -> Ld3
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld3
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld3
                goto Ld4
            Ld3:
                r0 = move-exception
            Ld4:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Le1
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP     // Catch: java.lang.NoSuchFieldError -> Le1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le1
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Le1
                goto Le2
            Le1:
                r0 = move-exception
            Le2:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lef
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> Lef
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lef
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lef
                goto Lf0
            Lef:
                r0 = move-exception
            Lf0:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lfd
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM     // Catch: java.lang.NoSuchFieldError -> Lfd
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lfd
                r2 = 18
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lfd
                goto Lfe
            Lfd:
                r0 = move-exception
            Lfe:
                return
        }
    }

    public enum FieldType extends java.lang.Enum<com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType> {
        private static final /* synthetic */ com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType[] $VALUES = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType BOOL = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType BYTES = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType DOUBLE = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType ENUM = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType FIXED32 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType FIXED64 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType FLOAT = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType GROUP = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType INT32 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType INT64 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType MESSAGE = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType SFIXED32 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType SFIXED64 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType SINT32 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType SINT64 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType STRING = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType UINT32 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType UINT64 = null;
        private final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType javaType;
        private final int wireType;





        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.DOUBLE
                java.lang.String r2 = "DOUBLE"
                r3 = 0
                r4 = 1
                r0.<init>(r2, r3, r1, r4)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.DOUBLE = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.FLOAT
                java.lang.String r2 = "FLOAT"
                r5 = 5
                r0.<init>(r2, r4, r1, r5)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FLOAT = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.LONG
                java.lang.String r2 = "INT64"
                r6 = 2
                r0.<init>(r2, r6, r1, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64 = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.LONG
                java.lang.String r2 = "UINT64"
                r7 = 3
                r0.<init>(r2, r7, r1, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64 = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                r1 = 4
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.INT
                java.lang.String r8 = "INT32"
                r0.<init>(r8, r1, r2, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32 = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                java.lang.String r1 = "FIXED64"
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.LONG
                r0.<init>(r1, r5, r2, r4)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64 = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                r1 = 6
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.INT
                java.lang.String r8 = "FIXED32"
                r0.<init>(r8, r1, r2, r5)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32 = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                r1 = 7
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.BOOLEAN
                java.lang.String r8 = "BOOL"
                r0.<init>(r8, r1, r2, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$1 r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$1
                r1 = 8
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.STRING
                java.lang.String r8 = "STRING"
                r0.<init>(r8, r1, r2, r6)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$2 r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$2
                r1 = 9
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
                java.lang.String r8 = "GROUP"
                r0.<init>(r8, r1, r2, r7)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$3 r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$3
                r1 = 10
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
                java.lang.String r7 = "MESSAGE"
                r0.<init>(r7, r1, r2, r6)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$4 r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$4
                r1 = 11
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.BYTE_STRING
                java.lang.String r7 = "BYTES"
                r0.<init>(r7, r1, r2, r6)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BYTES = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                r1 = 12
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.INT
                java.lang.String r6 = "UINT32"
                r0.<init>(r6, r1, r2, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32 = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                r1 = 13
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM
                java.lang.String r6 = "ENUM"
                r0.<init>(r6, r1, r2, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                r1 = 14
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.INT
                java.lang.String r6 = "SFIXED32"
                r0.<init>(r6, r1, r2, r5)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32 = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                r1 = 15
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.LONG
                java.lang.String r5 = "SFIXED64"
                r0.<init>(r5, r1, r2, r4)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64 = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                r1 = 16
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.INT
                java.lang.String r4 = "SINT32"
                r0.<init>(r4, r1, r2, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32 = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                r1 = 17
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.LONG
                java.lang.String r4 = "SINT64"
                r0.<init>(r4, r1, r2, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64 = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.DOUBLE
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r6 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FLOAT
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r7 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r8 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r9 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r11 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r12 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r13 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r14 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r15 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r16 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BYTES
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r17 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r18 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r19 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r20 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r21 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r22 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22}
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.$VALUES = r0
                return
        }

        FieldType(java.lang.String r1, int r2, com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType r3, int r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.javaType = r3
                r0.wireType = r4
                return
        }

        /* synthetic */ FieldType(java.lang.String r1, int r2, com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType r3, int r4, com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public static com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType> r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = (com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType) r0
                return r0
        }

        public static com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType[] values() {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = (com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType[]) r0
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType getJavaType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = r1.javaType
                return r0
        }

        public int getWireType() {
                r1 = this;
                int r0 = r1.wireType
                return r0
        }

        public boolean isPackable() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public enum JavaType extends java.lang.Enum<com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType> {
        private static final /* synthetic */ com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType[] $VALUES = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType BOOLEAN = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType BYTE_STRING = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType DOUBLE = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType ENUM = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType FLOAT = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType INT = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType LONG = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType MESSAGE = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType STRING = null;
        private final java.lang.Object defaultDefault;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                r1 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                java.lang.String r3 = "INT"
                r0.<init>(r3, r1, r2)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.INT = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                r2 = 0
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                java.lang.String r3 = "LONG"
                r4 = 1
                r0.<init>(r3, r4, r2)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.LONG = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                r2 = 0
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                java.lang.String r3 = "FLOAT"
                r4 = 2
                r0.<init>(r3, r4, r2)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.FLOAT = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                r2 = 0
                java.lang.Double r2 = java.lang.Double.valueOf(r2)
                java.lang.String r3 = "DOUBLE"
                r4 = 3
                r0.<init>(r3, r4, r2)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.DOUBLE = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                r2 = 4
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                java.lang.String r3 = "BOOLEAN"
                r0.<init>(r3, r2, r1)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.BOOLEAN = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                r1 = 5
                java.lang.String r2 = ""
                java.lang.String r3 = "STRING"
                r0.<init>(r3, r1, r2)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.STRING = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                r1 = 6
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
                java.lang.String r3 = "BYTE_STRING"
                r0.<init>(r3, r1, r2)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.BYTE_STRING = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                java.lang.String r1 = "ENUM"
                r2 = 7
                r3 = 0
                r0.<init>(r1, r2, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                java.lang.String r1 = "MESSAGE"
                r2 = 8
                r0.<init>(r1, r2, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r4 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.INT
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.LONG
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r6 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.FLOAT
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r7 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.DOUBLE
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r8 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.BOOLEAN
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r9 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.STRING
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.BYTE_STRING
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r11 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r12 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType[] r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType[]{r4, r5, r6, r7, r8, r9, r10, r11, r12}
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.$VALUES = r0
                return
        }

        JavaType(java.lang.String r1, int r2, java.lang.Object r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.defaultDefault = r3
                return
        }

        public static com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType> r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = (com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType) r0
                return r0
        }

        public static com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType[] values() {
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType[] r0 = (com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType[]) r0
                return r0
        }

        java.lang.Object getDefaultDefault() {
                r1 = this;
                java.lang.Object r0 = r1.defaultDefault
                return r0
        }
    }

    enum Utf8Validation extends java.lang.Enum<com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation> {
        private static final /* synthetic */ com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation[] $VALUES = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation LAZY = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation LOOSE = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation STRICT = null;




        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation$1 r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation$1
                java.lang.String r1 = "LOOSE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.LOOSE = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation$2 r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation$2
                java.lang.String r1 = "STRICT"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.STRICT = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation$3 r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation$3
                java.lang.String r1 = "LAZY"
                r2 = 2
                r0.<init>(r1, r2)
                com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.LAZY = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.LOOSE
                com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.STRICT
                com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.LAZY
                com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation[] r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation[]{r0, r1, r2}
                com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.$VALUES = r0
                return
        }

        Utf8Validation(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Utf8Validation(java.lang.String r1, int r2, com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation> r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation r0 = (com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation) r0
                return r0
        }

        public static com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation[] values() {
                com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation[] r0 = (com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation[]) r0
                return r0
        }

        abstract java.lang.Object readString(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException;
    }

    static {
            r0 = 1
            r1 = 3
            int r2 = makeTag(r0, r1)
            com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG = r2
            r2 = 4
            int r0 = makeTag(r0, r2)
            com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG = r0
            r0 = 0
            r2 = 2
            int r0 = makeTag(r2, r0)
            com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_TYPE_ID_TAG = r0
            int r0 = makeTag(r1, r2)
            com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_MESSAGE_TAG = r0
            return
    }

    private WireFormat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getTagFieldNumber(int r1) {
            int r0 = r1 >>> 3
            return r0
    }

    public static int getTagWireType(int r1) {
            r0 = r1 & 7
            return r0
    }

    static int makeTag(int r1, int r2) {
            int r0 = r1 << 3
            r0 = r0 | r2
            return r0
    }

    static java.lang.Object readPrimitiveField(com.google.crypto.tink.shaded.protobuf.CodedInputStream r2, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r3, com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation r4) throws java.io.IOException {
            int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto La1;
                case 2: goto L98;
                case 3: goto L8f;
                case 4: goto L86;
                case 5: goto L7d;
                case 6: goto L74;
                case 7: goto L6b;
                case 8: goto L62;
                case 9: goto L5d;
                case 10: goto L54;
                case 11: goto L4b;
                case 12: goto L42;
                case 13: goto L39;
                case 14: goto L30;
                case 15: goto L2b;
                case 16: goto L23;
                case 17: goto L1b;
                case 18: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "There is no way to get here, but the compiler thinks otherwise."
            r0.<init>(r1)
            throw r0
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "readPrimitiveField() cannot handle enums."
            r0.<init>(r1)
            throw r0
        L1b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "readPrimitiveField() cannot handle embedded messages."
            r0.<init>(r1)
            throw r0
        L23:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "readPrimitiveField() cannot handle nested groups."
            r0.<init>(r1)
            throw r0
        L2b:
            java.lang.Object r0 = r4.readString(r2)
            return r0
        L30:
            long r0 = r2.readSInt64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L39:
            int r0 = r2.readSInt32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L42:
            long r0 = r2.readSFixed64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L4b:
            int r0 = r2.readSFixed32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L54:
            int r0 = r2.readUInt32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L5d:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.readBytes()
            return r0
        L62:
            boolean r0 = r2.readBool()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L6b:
            int r0 = r2.readFixed32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L74:
            long r0 = r2.readFixed64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L7d:
            int r0 = r2.readInt32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L86:
            long r0 = r2.readUInt64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L8f:
            long r0 = r2.readInt64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L98:
            float r0 = r2.readFloat()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        La1:
            double r0 = r2.readDouble()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }
}
