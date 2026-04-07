package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class UnknownFieldSetLite {
    private static final com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite DEFAULT_INSTANCE = null;
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private java.lang.Object[] objects;
    private int[] tags;

    static {
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = new com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite
            r1 = 0
            int[] r2 = new int[r1]
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.<init>(r1, r2, r3, r1)
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.DEFAULT_INSTANCE = r0
            return
    }

    private UnknownFieldSetLite() {
            r4 = this;
            r0 = 8
            int[] r1 = new int[r0]
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 1
            r3 = 0
            r4.<init>(r3, r1, r0, r2)
            return
    }

    private UnknownFieldSetLite(int r2, int[] r3, java.lang.Object[] r4, boolean r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.memoizedSerializedSize = r0
            r1.count = r2
            r1.tags = r3
            r1.objects = r4
            r1.isMutable = r5
            return
    }

    private void ensureCapacity(int r3) {
            r2 = this;
            int[] r0 = r2.tags
            int r0 = r0.length
            if (r3 <= r0) goto L25
            int r0 = r2.count
            int r1 = r2.count
            int r1 = r1 / 2
            int r0 = r0 + r1
            if (r0 >= r3) goto Lf
            r0 = r3
        Lf:
            r1 = 8
            if (r0 >= r1) goto L15
            r0 = 8
        L15:
            int[] r1 = r2.tags
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r2.tags = r1
            java.lang.Object[] r1 = r2.objects
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r2.objects = r1
        L25:
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite getDefaultInstance() {
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.DEFAULT_INSTANCE
            return r0
    }

    private static int hashCode(int[] r4, int r5) {
            r0 = 17
            r1 = 0
        L3:
            if (r1 >= r5) goto Le
            int r2 = r0 * 31
            r3 = r4[r1]
            int r0 = r2 + r3
            int r1 = r1 + 1
            goto L3
        Le:
            return r0
    }

    private static int hashCode(java.lang.Object[] r4, int r5) {
            r0 = 17
            r1 = 0
        L3:
            if (r1 >= r5) goto L12
            int r2 = r0 * 31
            r3 = r4[r1]
            int r3 = r3.hashCode()
            int r0 = r2 + r3
            int r1 = r1 + 1
            goto L3
        L12:
            return r0
    }

    private com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r3) throws java.io.IOException {
            r2 = this;
        L1:
            int r0 = r3.readTag()
            if (r0 == 0) goto Lf
            boolean r1 = r2.mergeFieldFrom(r0, r3)
            if (r1 != 0) goto Le
            goto Lf
        Le:
            goto L1
        Lf:
            return r2
    }

    static com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite mutableCopyOf(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r7, com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r8) {
            int r0 = r7.count
            int r1 = r8.count
            int r0 = r0 + r1
            int[] r1 = r7.tags
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            int[] r2 = r8.tags
            int r3 = r7.count
            int r4 = r8.count
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r1, r3, r4)
            java.lang.Object[] r2 = r7.objects
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.Object[] r3 = r8.objects
            int r4 = r7.count
            int r6 = r8.count
            java.lang.System.arraycopy(r3, r5, r2, r4, r6)
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3 = new com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite
            r4 = 1
            r3.<init>(r0, r1, r2, r4)
            return r3
    }

    static com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite newInstance() {
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = new com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite
            r0.<init>()
            return r0
    }

    private static boolean objectsEquals(java.lang.Object[] r3, java.lang.Object[] r4, int r5) {
            r0 = 0
        L1:
            if (r0 >= r5) goto L12
            r1 = r3[r0]
            r2 = r4[r0]
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lf
            r1 = 0
            return r1
        Lf:
            int r0 = r0 + 1
            goto L1
        L12:
            r0 = 1
            return r0
    }

    private static boolean tagsEquals(int[] r3, int[] r4, int r5) {
            r0 = 0
        L1:
            if (r0 >= r5) goto Le
            r1 = r3[r0]
            r2 = r4[r0]
            if (r1 == r2) goto Lb
            r1 = 0
            return r1
        Lb:
            int r0 = r0 + 1
            goto L1
        Le:
            r0 = 1
            return r0
    }

    private static void writeField(int r3, java.lang.Object r4, com.google.crypto.tink.shaded.protobuf.Writer r5) throws java.io.IOException {
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r3)
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r3)
            switch(r1) {
                case 0: goto L54;
                case 1: goto L49;
                case 2: goto L42;
                case 3: goto L20;
                case 4: goto Lb;
                case 5: goto L15;
                default: goto Lb;
            }
        Lb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            r1.<init>(r2)
            throw r1
        L15:
            r1 = r4
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.writeFixed32(r0, r1)
            goto L5f
        L20:
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r1 = r5.fieldOrder()
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r2 = com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder.ASCENDING
            if (r1 != r2) goto L35
            r5.writeStartGroup(r0)
            r1 = r4
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r1
            r1.writeTo(r5)
            r5.writeEndGroup(r0)
            goto L5f
        L35:
            r5.writeEndGroup(r0)
            r1 = r4
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r1
            r1.writeTo(r5)
            r5.writeStartGroup(r0)
            goto L5f
        L42:
            r1 = r4
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = (com.google.crypto.tink.shaded.protobuf.ByteString) r1
            r5.writeBytes(r0, r1)
            goto L5f
        L49:
            r1 = r4
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r5.writeFixed64(r0, r1)
            goto L5f
        L54:
            r1 = r4
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r5.writeInt64(r0, r1)
        L5f:
            return
    }

    void checkMutable() {
            r1 = this;
            boolean r0 = r1.isMutable
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 != 0) goto L8
            return r1
        L8:
            boolean r2 = r7 instanceof com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite
            if (r2 != 0) goto Ld
            return r1
        Ld:
            r2 = r7
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r2
            int r3 = r6.count
            int r4 = r2.count
            if (r3 != r4) goto L30
            int[] r3 = r6.tags
            int[] r4 = r2.tags
            int r5 = r6.count
            boolean r3 = tagsEquals(r3, r4, r5)
            if (r3 == 0) goto L30
            java.lang.Object[] r3 = r6.objects
            java.lang.Object[] r4 = r2.objects
            int r5 = r6.count
            boolean r3 = objectsEquals(r3, r4, r5)
            if (r3 != 0) goto L2f
            goto L30
        L2f:
            return r0
        L30:
            return r1
    }

    public int getSerializedSize() {
            r6 = this;
            int r0 = r6.memoizedSerializedSize
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            r0 = 0
            r1 = 0
        L8:
            int r2 = r6.count
            if (r1 >= r2) goto L78
            int[] r2 = r6.tags
            r2 = r2[r1]
            int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r2)
            int r4 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r2)
            switch(r4) {
                case 0: goto L65;
                case 1: goto L55;
                case 2: goto L49;
                case 3: goto L35;
                case 4: goto L1b;
                case 5: goto L25;
                default: goto L1b;
            }
        L1b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            r4.<init>(r5)
            throw r4
        L25:
            java.lang.Object[] r4 = r6.objects
            r4 = r4[r1]
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32Size(r3, r4)
            int r0 = r0 + r4
            goto L75
        L35:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r3)
            int r4 = r4 * 2
            java.lang.Object[] r5 = r6.objects
            r5 = r5[r1]
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r5 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r5
            int r5 = r5.getSerializedSize()
            int r4 = r4 + r5
            int r0 = r0 + r4
            goto L75
        L49:
            java.lang.Object[] r4 = r6.objects
            r4 = r4[r1]
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r3, r4)
            int r0 = r0 + r4
            goto L75
        L55:
            java.lang.Object[] r4 = r6.objects
            r4 = r4[r1]
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64Size(r3, r4)
            int r0 = r0 + r4
            goto L75
        L65:
            java.lang.Object[] r4 = r6.objects
            r4 = r4[r1]
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64Size(r3, r4)
            int r0 = r0 + r4
        L75:
            int r1 = r1 + 1
            goto L8
        L78:
            r6.memoizedSerializedSize = r0
            return r0
    }

    public int getSerializedSizeAsMessageSet() {
            r5 = this;
            int r0 = r5.memoizedSerializedSize
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            r0 = 0
            r1 = 0
        L8:
            int r2 = r5.count
            if (r1 >= r2) goto L22
            int[] r2 = r5.tags
            r2 = r2[r1]
            int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r2)
            java.lang.Object[] r4 = r5.objects
            r4 = r4[r1]
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeRawMessageSetExtensionSize(r3, r4)
            int r0 = r0 + r4
            int r1 = r1 + 1
            goto L8
        L22:
            r5.memoizedSerializedSize = r0
            return r0
    }

    public int hashCode() {
            r4 = this;
            r0 = 17
            int r1 = r0 * 31
            int r2 = r4.count
            int r1 = r1 + r2
            int r0 = r1 * 31
            int[] r2 = r4.tags
            int r3 = r4.count
            int r2 = hashCode(r2, r3)
            int r0 = r0 + r2
            int r1 = r0 * 31
            java.lang.Object[] r2 = r4.objects
            int r3 = r4.count
            int r2 = hashCode(r2, r3)
            int r1 = r1 + r2
            return r1
    }

    public void makeImmutable() {
            r1 = this;
            r0 = 0
            r1.isMutable = r0
            return
    }

    boolean mergeFieldFrom(int r6, com.google.crypto.tink.shaded.protobuf.CodedInputStream r7) throws java.io.IOException {
            r5 = this;
            r5.checkMutable()
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r6)
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r6)
            r2 = 1
            switch(r1) {
                case 0: goto L4a;
                case 1: goto L3e;
                case 2: goto L36;
                case 3: goto L22;
                case 4: goto L20;
                case 5: goto L14;
                default: goto Lf;
            }
        Lf:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r1
        L14:
            int r1 = r7.readFixed32()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.storeField(r6, r1)
            return r2
        L20:
            r1 = 0
            return r1
        L22:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = new com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite
            r1.<init>()
            r1.mergeFrom(r7)
            r3 = 4
            int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r0, r3)
            r7.checkLastTagWas(r3)
            r5.storeField(r6, r1)
            return r2
        L36:
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r7.readBytes()
            r5.storeField(r6, r1)
            return r2
        L3e:
            long r3 = r7.readFixed64()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r5.storeField(r6, r1)
            return r2
        L4a:
            long r3 = r7.readInt64()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r5.storeField(r6, r1)
            return r2
    }

    com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite mergeFrom(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r7) {
            r6 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = getDefaultInstance()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lb
            return r6
        Lb:
            r6.checkMutable()
            int r0 = r6.count
            int r1 = r7.count
            int r0 = r0 + r1
            r6.ensureCapacity(r0)
            int[] r1 = r7.tags
            int[] r2 = r6.tags
            int r3 = r6.count
            int r4 = r7.count
            r5 = 0
            java.lang.System.arraycopy(r1, r5, r2, r3, r4)
            java.lang.Object[] r1 = r7.objects
            java.lang.Object[] r2 = r6.objects
            int r3 = r6.count
            int r4 = r7.count
            java.lang.System.arraycopy(r1, r5, r2, r3, r4)
            r6.count = r0
            return r6
    }

    com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite mergeLengthDelimitedField(int r3, com.google.crypto.tink.shaded.protobuf.ByteString r4) {
            r2 = this;
            r2.checkMutable()
            if (r3 == 0) goto Le
            r0 = 2
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r3, r0)
            r2.storeField(r0, r4)
            return r2
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Zero is not a valid field number."
            r0.<init>(r1)
            throw r0
    }

    com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite mergeVarintField(int r4, int r5) {
            r3 = this;
            r3.checkMutable()
            if (r4 == 0) goto L13
            r0 = 0
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r4, r0)
            long r1 = (long) r5
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.storeField(r0, r1)
            return r3
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Zero is not a valid field number."
            r0.<init>(r1)
            throw r0
    }

    final void printWithIndent(java.lang.StringBuilder r5, int r6) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r4.count
            if (r0 >= r1) goto L1b
            int[] r1 = r4.tags
            r1 = r1[r0]
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r1)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.Object[] r3 = r4.objects
            r3 = r3[r0]
            com.google.crypto.tink.shaded.protobuf.MessageLiteToString.printField(r5, r6, r2, r3)
            int r0 = r0 + 1
            goto L1
        L1b:
            return
    }

    void storeField(int r3, java.lang.Object r4) {
            r2 = this;
            r2.checkMutable()
            int r0 = r2.count
            int r0 = r0 + 1
            r2.ensureCapacity(r0)
            int[] r0 = r2.tags
            int r1 = r2.count
            r0[r1] = r3
            java.lang.Object[] r0 = r2.objects
            int r1 = r2.count
            r0[r1] = r4
            int r0 = r2.count
            int r0 = r0 + 1
            r2.count = r0
            return
    }

    public void writeAsMessageSetTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.count
            if (r0 >= r1) goto L19
            int[] r1 = r3.tags
            r1 = r1[r0]
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r1)
            java.lang.Object[] r2 = r3.objects
            r2 = r2[r0]
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
            r4.writeRawMessageSetExtension(r1, r2)
            int r0 = r0 + 1
            goto L1
        L19:
            return
    }

    void writeAsMessageSetTo(com.google.crypto.tink.shaded.protobuf.Writer r4) throws java.io.IOException {
            r3 = this;
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r0 = r4.fieldOrder()
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r1 = com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder.DESCENDING
            if (r0 != r1) goto L21
            int r0 = r3.count
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L20
            int[] r1 = r3.tags
            r1 = r1[r0]
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r1)
            java.lang.Object[] r2 = r3.objects
            r2 = r2[r0]
            r4.writeMessageSetItem(r1, r2)
            int r0 = r0 + (-1)
            goto Lc
        L20:
            goto L38
        L21:
            r0 = 0
        L22:
            int r1 = r3.count
            if (r0 >= r1) goto L38
            int[] r1 = r3.tags
            r1 = r1[r0]
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r1)
            java.lang.Object[] r2 = r3.objects
            r2 = r2[r0]
            r4.writeMessageSetItem(r1, r2)
            int r0 = r0 + 1
            goto L22
        L38:
            return
    }

    public void writeTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6) throws java.io.IOException {
            r5 = this;
            r0 = 0
        L1:
            int r1 = r5.count
            if (r0 >= r1) goto L62
            int[] r1 = r5.tags
            r1 = r1[r0]
            int r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r1)
            int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
            switch(r3) {
                case 0: goto L51;
                case 1: goto L43;
                case 2: goto L39;
                case 3: goto L27;
                case 4: goto L14;
                case 5: goto L19;
                default: goto L14;
            }
        L14:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r3
        L19:
            java.lang.Object[] r3 = r5.objects
            r3 = r3[r0]
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r6.writeFixed32(r2, r3)
            goto L5f
        L27:
            r3 = 3
            r6.writeTag(r2, r3)
            java.lang.Object[] r3 = r5.objects
            r3 = r3[r0]
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r3
            r3.writeTo(r6)
            r3 = 4
            r6.writeTag(r2, r3)
            goto L5f
        L39:
            java.lang.Object[] r3 = r5.objects
            r3 = r3[r0]
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            r6.writeBytes(r2, r3)
            goto L5f
        L43:
            java.lang.Object[] r3 = r5.objects
            r3 = r3[r0]
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r6.writeFixed64(r2, r3)
            goto L5f
        L51:
            java.lang.Object[] r3 = r5.objects
            r3 = r3[r0]
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r6.writeUInt64(r2, r3)
        L5f:
            int r0 = r0 + 1
            goto L1
        L62:
            return
    }

    public void writeTo(com.google.crypto.tink.shaded.protobuf.Writer r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.count
            if (r0 != 0) goto L5
            return
        L5:
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r0 = r4.fieldOrder()
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r1 = com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder.ASCENDING
            if (r0 != r1) goto L21
            r0 = 0
        Le:
            int r1 = r3.count
            if (r0 >= r1) goto L20
            int[] r1 = r3.tags
            r1 = r1[r0]
            java.lang.Object[] r2 = r3.objects
            r2 = r2[r0]
            writeField(r1, r2, r4)
            int r0 = r0 + 1
            goto Le
        L20:
            goto L35
        L21:
            int r0 = r3.count
            int r0 = r0 + (-1)
        L25:
            if (r0 < 0) goto L35
            int[] r1 = r3.tags
            r1 = r1[r0]
            java.lang.Object[] r2 = r3.objects
            r2 = r2[r0]
            writeField(r1, r2, r4)
            int r0 = r0 + (-1)
            goto L25
        L35:
            return
    }
}
