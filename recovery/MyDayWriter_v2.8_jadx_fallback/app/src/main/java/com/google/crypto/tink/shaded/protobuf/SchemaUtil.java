package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final java.lang.Class<?> GENERATED_MESSAGE_CLASS = null;
    private static final com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> PROTO2_UNKNOWN_FIELD_SET_SCHEMA = null;
    private static final com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> PROTO3_UNKNOWN_FIELD_SET_SCHEMA = null;
    private static final com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = null;

    static {
            java.lang.Class r0 = getGeneratedMessageClass()
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.GENERATED_MESSAGE_CLASS = r0
            r0 = 0
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema r0 = getUnknownFieldSetSchema(r0)
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.PROTO2_UNKNOWN_FIELD_SET_SCHEMA = r0
            r0 = 1
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema r0 = getUnknownFieldSetSchema(r0)
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.PROTO3_UNKNOWN_FIELD_SET_SCHEMA = r0
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLiteSchema r0 = new com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLiteSchema
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.UNKNOWN_FIELD_SET_LITE_SCHEMA = r0
            return
    }

    private SchemaUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static int computeSizeBoolList(int r3, java.util.List<?> r4, boolean r5) {
            int r0 = r4.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            if (r5 == 0) goto L14
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r3)
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r0)
            int r1 = r1 + r2
            return r1
        L14:
            r1 = 1
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBoolSize(r3, r1)
            int r1 = r1 * r0
            return r1
    }

    static int computeSizeBoolListNoTag(java.util.List<?> r1) {
            int r0 = r1.size()
            return r0
    }

    static int computeSizeByteStringList(int r4, java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> r5) {
            int r0 = r5.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r1 = r1 * r0
            r2 = 0
        Le:
            int r3 = r5.size()
            if (r2 >= r3) goto L22
            java.lang.Object r3 = r5.get(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSizeNoTag(r3)
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto Le
        L22:
            return r1
    }

    static int computeSizeEnumList(int r4, java.util.List<java.lang.Integer> r5, boolean r6) {
            int r0 = r5.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = computeSizeEnumListNoTag(r5)
            if (r6 == 0) goto L18
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r1)
            int r2 = r2 + r3
            return r2
        L18:
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r2 = r2 * r0
            int r2 = r2 + r1
            return r2
    }

    static int computeSizeEnumListNoTag(java.util.List<java.lang.Integer> r5) {
            int r0 = r5.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r1 = 0
            boolean r2 = r5 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r2 == 0) goto L20
            r2 = r5
            com.google.crypto.tink.shaded.protobuf.IntArrayList r2 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r2
            r3 = 0
        L11:
            if (r3 >= r0) goto L1f
            int r4 = r2.getInt(r3)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSizeNoTag(r4)
            int r1 = r1 + r4
            int r3 = r3 + 1
            goto L11
        L1f:
            goto L35
        L20:
            r2 = 0
        L21:
            if (r2 >= r0) goto L35
            java.lang.Object r3 = r5.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSizeNoTag(r3)
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L21
        L35:
            return r1
    }

    static int computeSizeFixed32List(int r4, java.util.List<?> r5, boolean r6) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r6 == 0) goto L16
            int r1 = r0 * 4
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r1)
            int r2 = r2 + r3
            return r2
        L16:
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32Size(r4, r1)
            int r1 = r1 * r0
            return r1
    }

    static int computeSizeFixed32ListNoTag(java.util.List<?> r1) {
            int r0 = r1.size()
            int r0 = r0 * 4
            return r0
    }

    static int computeSizeFixed64List(int r4, java.util.List<?> r5, boolean r6) {
            int r0 = r5.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            if (r6 == 0) goto L16
            int r1 = r0 * 8
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r1)
            int r2 = r2 + r3
            return r2
        L16:
            r1 = 0
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64Size(r4, r1)
            int r1 = r1 * r0
            return r1
    }

    static int computeSizeFixed64ListNoTag(java.util.List<?> r1) {
            int r0 = r1.size()
            int r0 = r0 * 8
            return r0
    }

    static int computeSizeGroupList(int r4, java.util.List<com.google.crypto.tink.shaded.protobuf.MessageLite> r5) {
            int r0 = r5.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r1 = 0
            r2 = 0
        La:
            if (r2 >= r0) goto L1a
            java.lang.Object r3 = r5.get(r2)
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeGroupSize(r4, r3)
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto La
        L1a:
            return r1
    }

    static int computeSizeGroupList(int r4, java.util.List<com.google.crypto.tink.shaded.protobuf.MessageLite> r5, com.google.crypto.tink.shaded.protobuf.Schema r6) {
            int r0 = r5.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r1 = 0
            r2 = 0
        La:
            if (r2 >= r0) goto L1a
            java.lang.Object r3 = r5.get(r2)
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeGroupSize(r4, r3, r6)
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto La
        L1a:
            return r1
    }

    static int computeSizeInt32List(int r4, java.util.List<java.lang.Integer> r5, boolean r6) {
            int r0 = r5.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = computeSizeInt32ListNoTag(r5)
            if (r6 == 0) goto L18
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r1)
            int r2 = r2 + r3
            return r2
        L18:
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r2 = r2 * r0
            int r2 = r2 + r1
            return r2
    }

    static int computeSizeInt32ListNoTag(java.util.List<java.lang.Integer> r5) {
            int r0 = r5.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r1 = 0
            boolean r2 = r5 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r2 == 0) goto L20
            r2 = r5
            com.google.crypto.tink.shaded.protobuf.IntArrayList r2 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r2
            r3 = 0
        L11:
            if (r3 >= r0) goto L1f
            int r4 = r2.getInt(r3)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32SizeNoTag(r4)
            int r1 = r1 + r4
            int r3 = r3 + 1
            goto L11
        L1f:
            goto L35
        L20:
            r2 = 0
        L21:
            if (r2 >= r0) goto L35
            java.lang.Object r3 = r5.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32SizeNoTag(r3)
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L21
        L35:
            return r1
    }

    static int computeSizeInt64List(int r4, java.util.List<java.lang.Long> r5, boolean r6) {
            int r0 = r5.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = computeSizeInt64ListNoTag(r5)
            if (r6 == 0) goto L18
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r1)
            int r2 = r2 + r3
            return r2
        L18:
            int r2 = r5.size()
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r2 = r2 * r3
            int r2 = r2 + r1
            return r2
    }

    static int computeSizeInt64ListNoTag(java.util.List<java.lang.Long> r6) {
            int r0 = r6.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r1 = 0
            boolean r2 = r6 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r2 == 0) goto L20
            r2 = r6
            com.google.crypto.tink.shaded.protobuf.LongArrayList r2 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r2
            r3 = 0
        L11:
            if (r3 >= r0) goto L1f
            long r4 = r2.getLong(r3)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64SizeNoTag(r4)
            int r1 = r1 + r4
            int r3 = r3 + 1
            goto L11
        L1f:
            goto L35
        L20:
            r2 = 0
        L21:
            if (r2 >= r0) goto L35
            java.lang.Object r3 = r6.get(r2)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64SizeNoTag(r3)
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L21
        L35:
            return r1
    }

    static int computeSizeMessage(int r1, java.lang.Object r2, com.google.crypto.tink.shaded.protobuf.Schema r3) {
            boolean r0 = r2 instanceof com.google.crypto.tink.shaded.protobuf.LazyFieldLite
            if (r0 == 0) goto Lc
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.LazyFieldLite r0 = (com.google.crypto.tink.shaded.protobuf.LazyFieldLite) r0
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLazyFieldSize(r1, r0)
            return r0
        Lc:
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeMessageSize(r1, r0, r3)
            return r0
    }

    static int computeSizeMessageList(int r5, java.util.List<?> r6) {
            int r0 = r6.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r5)
            int r1 = r1 * r0
            r2 = 0
        Le:
            if (r2 >= r0) goto L2c
            java.lang.Object r3 = r6.get(r2)
            boolean r4 = r3 instanceof com.google.crypto.tink.shaded.protobuf.LazyFieldLite
            if (r4 == 0) goto L21
            r4 = r3
            com.google.crypto.tink.shaded.protobuf.LazyFieldLite r4 = (com.google.crypto.tink.shaded.protobuf.LazyFieldLite) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag(r4)
            int r1 = r1 + r4
            goto L29
        L21:
            r4 = r3
            com.google.crypto.tink.shaded.protobuf.MessageLite r4 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeMessageSizeNoTag(r4)
            int r1 = r1 + r4
        L29:
            int r2 = r2 + 1
            goto Le
        L2c:
            return r1
    }

    static int computeSizeMessageList(int r5, java.util.List<?> r6, com.google.crypto.tink.shaded.protobuf.Schema r7) {
            int r0 = r6.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r5)
            int r1 = r1 * r0
            r2 = 0
        Le:
            if (r2 >= r0) goto L2c
            java.lang.Object r3 = r6.get(r2)
            boolean r4 = r3 instanceof com.google.crypto.tink.shaded.protobuf.LazyFieldLite
            if (r4 == 0) goto L21
            r4 = r3
            com.google.crypto.tink.shaded.protobuf.LazyFieldLite r4 = (com.google.crypto.tink.shaded.protobuf.LazyFieldLite) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag(r4)
            int r1 = r1 + r4
            goto L29
        L21:
            r4 = r3
            com.google.crypto.tink.shaded.protobuf.MessageLite r4 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeMessageSizeNoTag(r4, r7)
            int r1 = r1 + r4
        L29:
            int r2 = r2 + 1
            goto Le
        L2c:
            return r1
    }

    static int computeSizeSInt32List(int r4, java.util.List<java.lang.Integer> r5, boolean r6) {
            int r0 = r5.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = computeSizeSInt32ListNoTag(r5)
            if (r6 == 0) goto L18
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r1)
            int r2 = r2 + r3
            return r2
        L18:
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r2 = r2 * r0
            int r2 = r2 + r1
            return r2
    }

    static int computeSizeSInt32ListNoTag(java.util.List<java.lang.Integer> r5) {
            int r0 = r5.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r1 = 0
            boolean r2 = r5 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r2 == 0) goto L20
            r2 = r5
            com.google.crypto.tink.shaded.protobuf.IntArrayList r2 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r2
            r3 = 0
        L11:
            if (r3 >= r0) goto L1f
            int r4 = r2.getInt(r3)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32SizeNoTag(r4)
            int r1 = r1 + r4
            int r3 = r3 + 1
            goto L11
        L1f:
            goto L35
        L20:
            r2 = 0
        L21:
            if (r2 >= r0) goto L35
            java.lang.Object r3 = r5.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32SizeNoTag(r3)
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L21
        L35:
            return r1
    }

    static int computeSizeSInt64List(int r4, java.util.List<java.lang.Long> r5, boolean r6) {
            int r0 = r5.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = computeSizeSInt64ListNoTag(r5)
            if (r6 == 0) goto L18
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r1)
            int r2 = r2 + r3
            return r2
        L18:
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r2 = r2 * r0
            int r2 = r2 + r1
            return r2
    }

    static int computeSizeSInt64ListNoTag(java.util.List<java.lang.Long> r6) {
            int r0 = r6.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r1 = 0
            boolean r2 = r6 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r2 == 0) goto L20
            r2 = r6
            com.google.crypto.tink.shaded.protobuf.LongArrayList r2 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r2
            r3 = 0
        L11:
            if (r3 >= r0) goto L1f
            long r4 = r2.getLong(r3)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64SizeNoTag(r4)
            int r1 = r1 + r4
            int r3 = r3 + 1
            goto L11
        L1f:
            goto L35
        L20:
            r2 = 0
        L21:
            if (r2 >= r0) goto L35
            java.lang.Object r3 = r6.get(r2)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64SizeNoTag(r3)
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L21
        L35:
            return r1
    }

    static int computeSizeStringList(int r6, java.util.List<?> r7) {
            int r0 = r7.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r6)
            int r1 = r1 * r0
            boolean r2 = r7 instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList
            if (r2 == 0) goto L34
            r2 = r7
            com.google.crypto.tink.shaded.protobuf.LazyStringList r2 = (com.google.crypto.tink.shaded.protobuf.LazyStringList) r2
            r3 = 0
        L15:
            if (r3 >= r0) goto L33
            java.lang.Object r4 = r2.getRaw(r3)
            boolean r5 = r4 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r5 == 0) goto L28
            r5 = r4
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = (com.google.crypto.tink.shaded.protobuf.ByteString) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSizeNoTag(r5)
            int r1 = r1 + r5
            goto L30
        L28:
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeStringSizeNoTag(r5)
            int r1 = r1 + r5
        L30:
            int r3 = r3 + 1
            goto L15
        L33:
            goto L53
        L34:
            r2 = 0
        L35:
            if (r2 >= r0) goto L53
            java.lang.Object r3 = r7.get(r2)
            boolean r4 = r3 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r4 == 0) goto L48
            r4 = r3
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSizeNoTag(r4)
            int r1 = r1 + r4
            goto L50
        L48:
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeStringSizeNoTag(r4)
            int r1 = r1 + r4
        L50:
            int r2 = r2 + 1
            goto L35
        L53:
            return r1
    }

    static int computeSizeUInt32List(int r4, java.util.List<java.lang.Integer> r5, boolean r6) {
            int r0 = r5.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = computeSizeUInt32ListNoTag(r5)
            if (r6 == 0) goto L18
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r1)
            int r2 = r2 + r3
            return r2
        L18:
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r2 = r2 * r0
            int r2 = r2 + r1
            return r2
    }

    static int computeSizeUInt32ListNoTag(java.util.List<java.lang.Integer> r5) {
            int r0 = r5.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r1 = 0
            boolean r2 = r5 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r2 == 0) goto L20
            r2 = r5
            com.google.crypto.tink.shaded.protobuf.IntArrayList r2 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r2
            r3 = 0
        L11:
            if (r3 >= r0) goto L1f
            int r4 = r2.getInt(r3)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r4)
            int r1 = r1 + r4
            int r3 = r3 + 1
            goto L11
        L1f:
            goto L35
        L20:
            r2 = 0
        L21:
            if (r2 >= r0) goto L35
            java.lang.Object r3 = r5.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L21
        L35:
            return r1
    }

    static int computeSizeUInt64List(int r4, java.util.List<java.lang.Long> r5, boolean r6) {
            int r0 = r5.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = computeSizeUInt64ListNoTag(r5)
            if (r6 == 0) goto L18
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r1)
            int r2 = r2 + r3
            return r2
        L18:
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r4)
            int r2 = r2 * r0
            int r2 = r2 + r1
            return r2
    }

    static int computeSizeUInt64ListNoTag(java.util.List<java.lang.Long> r6) {
            int r0 = r6.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r1 = 0
            boolean r2 = r6 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r2 == 0) goto L20
            r2 = r6
            com.google.crypto.tink.shaded.protobuf.LongArrayList r2 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r2
            r3 = 0
        L11:
            if (r3 >= r0) goto L1f
            long r4 = r2.getLong(r3)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64SizeNoTag(r4)
            int r1 = r1 + r4
            int r3 = r3 + 1
            goto L11
        L1f:
            goto L35
        L20:
            r2 = 0
        L21:
            if (r2 >= r0) goto L35
            java.lang.Object r3 = r6.get(r2)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64SizeNoTag(r3)
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L21
        L35:
            return r1
    }

    static <UT, UB> UB filterUnknownEnumList(java.lang.Object r5, int r6, java.util.List<java.lang.Integer> r7, com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> r8, UB r9, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r10) {
            if (r8 != 0) goto L3
            return r9
        L3:
            boolean r0 = r7 instanceof java.util.RandomAccess
            if (r0 == 0) goto L3d
            r0 = 0
            int r1 = r7.size()
            r2 = 0
        Ld:
            if (r2 >= r1) goto L33
            java.lang.Object r3 = r7.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r4 = r8.findValueByNumber(r3)
            if (r4 == 0) goto L2b
            if (r2 == r0) goto L28
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r7.set(r0, r4)
        L28:
            int r0 = r0 + 1
            goto L30
        L2b:
            java.lang.Object r9 = storeUnknownEnum(r5, r6, r3, r9, r10)
        L30:
            int r2 = r2 + 1
            goto Ld
        L33:
            if (r0 == r1) goto L3c
            java.util.List r2 = r7.subList(r0, r1)
            r2.clear()
        L3c:
            goto L60
        L3d:
            java.util.Iterator r0 = r7.iterator()
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r2 = r8.findValueByNumber(r1)
            if (r2 != 0) goto L5f
        L58:
            java.lang.Object r9 = storeUnknownEnum(r5, r6, r1, r9, r10)
            r0.remove()
        L5f:
            goto L41
        L60:
            return r9
    }

    static <UT, UB> UB filterUnknownEnumList(java.lang.Object r5, int r6, java.util.List<java.lang.Integer> r7, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r8, UB r9, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r10) {
            if (r8 != 0) goto L3
            return r9
        L3:
            boolean r0 = r7 instanceof java.util.RandomAccess
            if (r0 == 0) goto L3d
            r0 = 0
            int r1 = r7.size()
            r2 = 0
        Ld:
            if (r2 >= r1) goto L33
            java.lang.Object r3 = r7.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            boolean r4 = r8.isInRange(r3)
            if (r4 == 0) goto L2b
            if (r2 == r0) goto L28
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r7.set(r0, r4)
        L28:
            int r0 = r0 + 1
            goto L30
        L2b:
            java.lang.Object r9 = storeUnknownEnum(r5, r6, r3, r9, r10)
        L30:
            int r2 = r2 + 1
            goto Ld
        L33:
            if (r0 == r1) goto L3c
            java.util.List r2 = r7.subList(r0, r1)
            r2.clear()
        L3c:
            goto L60
        L3d:
            java.util.Iterator r0 = r7.iterator()
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            boolean r2 = r8.isInRange(r1)
            if (r2 != 0) goto L5f
        L58:
            java.lang.Object r9 = storeUnknownEnum(r5, r6, r1, r9, r10)
            r0.remove()
        L5f:
            goto L41
        L60:
            return r9
    }

    private static java.lang.Class<?> getGeneratedMessageClass() {
            java.lang.String r0 = "com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = move-exception
            r1 = 0
            return r1
    }

    static java.lang.Object getMapDefaultEntry(java.lang.Class<?> r5, java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r0.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = r5.getName()     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = "$"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L60
            r1 = 1
            java.lang.String r2 = toCamelCase(r6, r1)     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "DefaultEntryHolder"
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L60
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.reflect.Field[] r2 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L60
            int r3 = r2.length     // Catch: java.lang.Throwable -> L60
            if (r3 != r1) goto L39
            r1 = 0
            r1 = r2[r1]     // Catch: java.lang.Throwable -> L60
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getStaticObject(r1)     // Catch: java.lang.Throwable -> L60
            return r1
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r3.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = "Unable to look up map field default entry holder class for "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = " in "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = r5.getName()     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L60
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L60
            throw r1     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    private static com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> getUnknownFieldSetSchema(boolean r5) {
            r0 = 0
            java.lang.Class r1 = getUnknownFieldSetSchemaClass()     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L8
            return r0
        L8:
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L23
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L23
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L23
            java.lang.reflect.Constructor r2 = r1.getConstructor(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L23
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L23
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> L23
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema r2 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema) r2     // Catch: java.lang.Throwable -> L23
            return r2
        L23:
            r1 = move-exception
            return r0
    }

    private static java.lang.Class<?> getUnknownFieldSetSchemaClass() {
            java.lang.String r0 = "com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = move-exception
            r1 = 0
            return r1
    }

    static <T, FT extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(com.google.crypto.tink.shaded.protobuf.ExtensionSchema<FT> r2, T r3, T r4) {
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r2.getExtensions(r4)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L11
            com.google.crypto.tink.shaded.protobuf.FieldSet r1 = r2.getMutableExtensions(r3)
            r1.mergeFrom(r0)
        L11:
            return
    }

    static <T> void mergeMap(com.google.crypto.tink.shaded.protobuf.MapFieldSchema r2, T r3, T r4, long r5) {
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r3, r5)
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r4, r5)
            java.lang.Object r0 = r2.mergeFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r3, r5, r0)
            return
    }

    static <T, UT, UB> void mergeUnknownFields(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r3, T r4, T r5) {
            java.lang.Object r0 = r3.getFromMessage(r4)
            java.lang.Object r1 = r3.getFromMessage(r5)
            java.lang.Object r2 = r3.merge(r0, r1)
            r3.setToMessage(r4, r2)
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> proto2UnknownFieldSetSchema() {
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.PROTO2_UNKNOWN_FIELD_SET_SCHEMA
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> proto3UnknownFieldSetSchema() {
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.PROTO3_UNKNOWN_FIELD_SET_SCHEMA
            return r0
    }

    public static void requireGeneratedMessage(java.lang.Class<?> r2) {
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite> r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L1d
            java.lang.Class<?> r0 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.GENERATED_MESSAGE_CLASS
            if (r0 == 0) goto L1d
            java.lang.Class<?> r0 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.GENERATED_MESSAGE_CLASS
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L15
            goto L1d
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Message classes must extend GeneratedMessageV3 or GeneratedMessageLite"
            r0.<init>(r1)
            throw r0
        L1d:
            return
    }

    static boolean safeEquals(java.lang.Object r1, java.lang.Object r2) {
            if (r1 == r2) goto Ld
            if (r1 == 0) goto Lb
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    public static boolean shouldUseTableSwitch(int r16, int r17, int r18) {
            r0 = r17
            r1 = r18
            r2 = 40
            r3 = 1
            if (r0 >= r2) goto La
            return r3
        La:
            long r4 = (long) r0
            r2 = r16
            long r6 = (long) r2
            long r4 = r4 - r6
            r6 = 1
            long r4 = r4 + r6
            r6 = 3
            r8 = 2
            long r10 = (long) r1
            long r10 = r10 * r8
            r8 = 3
            long r10 = r10 + r8
            long r12 = (long) r1
            long r12 = r12 + r8
            long r14 = r6 * r8
            long r14 = r14 + r4
            long r8 = r8 * r12
            long r8 = r8 + r10
            int r8 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r8 > 0) goto L27
            goto L28
        L27:
            r3 = 0
        L28:
            return r3
    }

    public static boolean shouldUseTableSwitch(com.google.crypto.tink.shaded.protobuf.FieldInfo[] r3) {
            int r0 = r3.length
            r1 = 0
            if (r0 != 0) goto L5
            return r1
        L5:
            r0 = r3[r1]
            int r0 = r0.getFieldNumber()
            int r1 = r3.length
            int r1 = r1 + (-1)
            r1 = r3[r1]
            int r1 = r1.getFieldNumber()
            int r2 = r3.length
            boolean r2 = shouldUseTableSwitch(r0, r1, r2)
            return r2
    }

    static <UT, UB> UB storeUnknownEnum(java.lang.Object r2, int r3, int r4, UB r5, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r6) {
            if (r5 != 0) goto L6
            java.lang.Object r5 = r6.getBuilderFromMessage(r2)
        L6:
            long r0 = (long) r4
            r6.addVarint(r5, r3, r0)
            return r5
    }

    static java.lang.String toCamelCase(java.lang.String r4, boolean r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.length()
            if (r1 >= r2) goto L4f
            char r2 = r4.charAt(r1)
            r3 = 97
            if (r3 > r2) goto L26
            r3 = 122(0x7a, float:1.71E-43)
            if (r2 > r3) goto L26
            if (r5 == 0) goto L21
            int r3 = r2 + (-32)
            char r3 = (char) r3
            r0.append(r3)
            goto L24
        L21:
            r0.append(r2)
        L24:
            r5 = 0
            goto L4c
        L26:
            r3 = 65
            if (r3 > r2) goto L3e
            r3 = 90
            if (r2 > r3) goto L3e
            if (r1 != 0) goto L39
            if (r5 != 0) goto L39
            int r3 = r2 + 32
            char r3 = (char) r3
            r0.append(r3)
            goto L3c
        L39:
            r0.append(r2)
        L3c:
            r5 = 0
            goto L4c
        L3e:
            r3 = 48
            if (r3 > r2) goto L4b
            r3 = 57
            if (r2 > r3) goto L4b
            r0.append(r2)
            r5 = 1
            goto L4c
        L4b:
            r5 = 1
        L4c:
            int r1 = r1 + 1
            goto L6
        L4f:
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.UNKNOWN_FIELD_SET_LITE_SCHEMA
            return r0
    }

    public static void writeBool(int r1, boolean r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            if (r2 == 0) goto L6
            r0 = 1
            r3.writeBool(r1, r0)
        L6:
            return
    }

    public static void writeBoolList(int r1, java.util.List<java.lang.Boolean> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeBoolList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeBytes(int r1, com.google.crypto.tink.shaded.protobuf.ByteString r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeBytes(r1, r2)
        Lb:
            return
    }

    public static void writeBytesList(int r1, java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeBytesList(r1, r2)
        Lb:
            return
    }

    public static void writeDouble(int r4, double r5, com.google.crypto.tink.shaded.protobuf.Writer r7) throws java.io.IOException {
            long r0 = java.lang.Double.doubleToRawLongBits(r5)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld
            r7.writeDouble(r4, r5)
        Ld:
            return
    }

    public static void writeDoubleList(int r1, java.util.List<java.lang.Double> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeDoubleList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeEnum(int r0, int r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            if (r1 == 0) goto L5
            r2.writeEnum(r0, r1)
        L5:
            return
    }

    public static void writeEnumList(int r1, java.util.List<java.lang.Integer> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeEnumList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeFixed32(int r0, int r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            if (r1 == 0) goto L5
            r2.writeFixed32(r0, r1)
        L5:
            return
    }

    public static void writeFixed32List(int r1, java.util.List<java.lang.Integer> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeFixed32List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeFixed64(int r2, long r3, com.google.crypto.tink.shaded.protobuf.Writer r5) throws java.io.IOException {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L9
            r5.writeFixed64(r2, r3)
        L9:
            return
    }

    public static void writeFixed64List(int r1, java.util.List<java.lang.Long> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeFixed64List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeFloat(int r1, float r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            int r0 = java.lang.Float.floatToRawIntBits(r2)
            if (r0 == 0) goto L9
            r3.writeFloat(r1, r2)
        L9:
            return
    }

    public static void writeFloatList(int r1, java.util.List<java.lang.Float> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeFloatList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeGroupList(int r1, java.util.List<?> r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeGroupList(r1, r2)
        Lb:
            return
    }

    public static void writeGroupList(int r1, java.util.List<?> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeGroupList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeInt32(int r0, int r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            if (r1 == 0) goto L5
            r2.writeInt32(r0, r1)
        L5:
            return
    }

    public static void writeInt32List(int r1, java.util.List<java.lang.Integer> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeInt32List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeInt64(int r2, long r3, com.google.crypto.tink.shaded.protobuf.Writer r5) throws java.io.IOException {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L9
            r5.writeInt64(r2, r3)
        L9:
            return
    }

    public static void writeInt64List(int r1, java.util.List<java.lang.Long> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeInt64List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeLazyFieldList(int r3, java.util.List<?> r4, com.google.crypto.tink.shaded.protobuf.Writer r5) throws java.io.IOException {
            if (r4 == 0) goto L1d
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L1d
            java.util.Iterator r0 = r4.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.google.crypto.tink.shaded.protobuf.LazyFieldLite r2 = (com.google.crypto.tink.shaded.protobuf.LazyFieldLite) r2
            r2.writeTo(r5, r3)
            goto Lc
        L1d:
            return
    }

    public static void writeMessage(int r0, java.lang.Object r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            if (r1 == 0) goto L5
            r2.writeMessage(r0, r1)
        L5:
            return
    }

    public static void writeMessageList(int r1, java.util.List<?> r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeMessageList(r1, r2)
        Lb:
            return
    }

    public static void writeMessageList(int r1, java.util.List<?> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeMessageList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeSFixed32(int r0, int r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            if (r1 == 0) goto L5
            r2.writeSFixed32(r0, r1)
        L5:
            return
    }

    public static void writeSFixed32List(int r1, java.util.List<java.lang.Integer> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeSFixed32List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeSFixed64(int r2, long r3, com.google.crypto.tink.shaded.protobuf.Writer r5) throws java.io.IOException {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L9
            r5.writeSFixed64(r2, r3)
        L9:
            return
    }

    public static void writeSFixed64List(int r1, java.util.List<java.lang.Long> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeSFixed64List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeSInt32(int r0, int r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            if (r1 == 0) goto L5
            r2.writeSInt32(r0, r1)
        L5:
            return
    }

    public static void writeSInt32List(int r1, java.util.List<java.lang.Integer> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeSInt32List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeSInt64(int r2, long r3, com.google.crypto.tink.shaded.protobuf.Writer r5) throws java.io.IOException {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L9
            r5.writeSInt64(r2, r3)
        L9:
            return
    }

    public static void writeSInt64List(int r1, java.util.List<java.lang.Long> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeSInt64List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeString(int r1, java.lang.Object r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Lb
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
            writeStringInternal(r1, r0, r3)
            goto L11
        Lb:
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString) r0
            writeBytes(r1, r0, r3)
        L11:
            return
    }

    private static void writeStringInternal(int r1, java.lang.String r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeString(r1, r2)
        Lb:
            return
    }

    public static void writeStringList(int r1, java.util.List<java.lang.String> r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeStringList(r1, r2)
        Lb:
            return
    }

    public static void writeUInt32(int r0, int r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            if (r1 == 0) goto L5
            r2.writeUInt32(r0, r1)
        L5:
            return
    }

    public static void writeUInt32List(int r1, java.util.List<java.lang.Integer> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeUInt32List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeUInt64(int r2, long r3, com.google.crypto.tink.shaded.protobuf.Writer r5) throws java.io.IOException {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L9
            r5.writeUInt64(r2, r3)
        L9:
            return
    }

    public static void writeUInt64List(int r1, java.util.List<java.lang.Long> r2, com.google.crypto.tink.shaded.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeUInt64List(r1, r2, r4)
        Lb:
            return
    }
}
