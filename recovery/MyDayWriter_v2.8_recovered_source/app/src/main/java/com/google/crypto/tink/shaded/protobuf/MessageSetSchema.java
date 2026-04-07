package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class MessageSetSchema<T> implements com.google.crypto.tink.shaded.protobuf.Schema<T> {
    private final com.google.crypto.tink.shaded.protobuf.MessageLite defaultInstance;
    private final com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema;

    private MessageSetSchema(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r2, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r3, com.google.crypto.tink.shaded.protobuf.MessageLite r4) {
            r1 = this;
            r1.<init>()
            r1.unknownFieldSchema = r2
            boolean r0 = r3.hasExtensions(r4)
            r1.hasExtensions = r0
            r1.extensionSchema = r3
            r1.defaultInstance = r4
            return
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r3, T r4) {
            r2 = this;
            java.lang.Object r0 = r3.getFromMessage(r4)
            int r1 = r3.getSerializedSizeAsMessageSet(r0)
            return r1
    }

    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r9, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<ET> r10, T r11, com.google.crypto.tink.shaded.protobuf.Reader r12, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r13) throws java.io.IOException {
            r8 = this;
            java.lang.Object r7 = r9.getBuilderFromMessage(r11)
            com.google.crypto.tink.shaded.protobuf.FieldSet r5 = r10.getMutableExtensions(r11)
        L8:
            int r0 = r12.getFieldNumber()     // Catch: java.lang.Throwable -> L2c
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L15
            r9.setBuilderToMessage(r11, r7)
            return
        L15:
            r1 = r8
            r6 = r9
            r4 = r10
            r2 = r12
            r3 = r13
            boolean r9 = r1.parseMessageSetItemOrUnknownField(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L29
            if (r9 == 0) goto L25
            r12 = r2
            r13 = r3
            r10 = r4
            r9 = r6
            goto L8
        L25:
            r6.setBuilderToMessage(r11, r7)
            return
        L29:
            r0 = move-exception
            r9 = r0
            goto L32
        L2c:
            r0 = move-exception
            r6 = r9
            r4 = r10
            r2 = r12
            r3 = r13
            r9 = r0
        L32:
            r6.setBuilderToMessage(r11, r7)
            throw r9
    }

    static <T> com.google.crypto.tink.shaded.protobuf.MessageSetSchema<T> newSchema(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r1, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3) {
            com.google.crypto.tink.shaded.protobuf.MessageSetSchema r0 = new com.google.crypto.tink.shaded.protobuf.MessageSetSchema
            r0.<init>(r1, r2, r3)
            return r0
    }

    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(com.google.crypto.tink.shaded.protobuf.Reader r9, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r10, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<ET> r11, com.google.crypto.tink.shaded.protobuf.FieldSet<ET> r12, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r13, UB r14) throws java.io.IOException {
            r8 = this;
            int r0 = r9.getTag()
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG
            r2 = 1
            if (r0 == r1) goto L2a
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            r3 = 2
            if (r1 != r3) goto L25
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r8.defaultInstance
            int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r0)
            java.lang.Object r1 = r11.findExtensionByNumber(r10, r1, r3)
            if (r1 == 0) goto L20
            r11.parseLengthPrefixedMessageSetItem(r9, r1, r10, r12)
            return r2
        L20:
            boolean r2 = r13.mergeOneFieldFrom(r14, r9)
            return r2
        L25:
            boolean r1 = r9.skipField()
            return r1
        L2a:
            r1 = 0
            r3 = 0
            r4 = 0
        L2d:
            int r5 = r9.getFieldNumber()
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 != r6) goto L37
            goto L60
        L37:
            int r6 = r9.getTag()
            int r7 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_TYPE_ID_TAG
            if (r6 != r7) goto L4a
            int r1 = r9.readUInt32()
            com.google.crypto.tink.shaded.protobuf.MessageLite r7 = r8.defaultInstance
            java.lang.Object r4 = r11.findExtensionByNumber(r10, r7, r1)
            goto L2d
        L4a:
            int r7 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_MESSAGE_TAG
            if (r6 != r7) goto L59
            if (r4 == 0) goto L54
            r11.parseLengthPrefixedMessageSetItem(r9, r4, r10, r12)
            goto L2d
        L54:
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r9.readBytes()
            goto L2d
        L59:
            boolean r7 = r9.skipField()
            if (r7 != 0) goto L79
        L60:
            int r5 = r9.getTag()
            int r6 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG
            if (r5 != r6) goto L74
            if (r3 == 0) goto L73
            if (r4 == 0) goto L70
            r11.parseMessageSetItem(r3, r4, r10, r12)
            goto L73
        L70:
            r13.addLengthDelimited(r14, r1, r3)
        L73:
            return r2
        L74:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidEndTag()
            throw r2
        L79:
            goto L2d
    }

    private <UT, UB> void writeUnknownFieldsHelper(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r2, T r3, com.google.crypto.tink.shaded.protobuf.Writer r4) throws java.io.IOException {
            r1 = this;
            java.lang.Object r0 = r2.getFromMessage(r3)
            r2.writeAsMessageSetTo(r0, r4)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public boolean equals(T r6, T r7) {
            r5 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r5.unknownFieldSchema
            java.lang.Object r0 = r0.getFromMessage(r6)
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r1 = r5.unknownFieldSchema
            java.lang.Object r1 = r1.getFromMessage(r7)
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L14
            r2 = 0
            return r2
        L14:
            boolean r2 = r5.hasExtensions
            if (r2 == 0) goto L29
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r2 = r5.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r2 = r2.getExtensions(r6)
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r3 = r5.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r3 = r3.getExtensions(r7)
            boolean r4 = r2.equals(r3)
            return r4
        L29:
            r2 = 1
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public int getSerializedSize(T r3) {
            r2 = this;
            r0 = 0
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r1 = r2.unknownFieldSchema
            int r1 = r2.getUnknownFieldsSerializedSize(r1, r3)
            int r0 = r0 + r1
            boolean r1 = r2.hasExtensions
            if (r1 == 0) goto L17
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r1 = r2.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r1 = r1.getExtensions(r3)
            int r1 = r1.getMessageSetSerializedSize()
            int r0 = r0 + r1
        L17:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public int hashCode(T r5) {
            r4 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r4.unknownFieldSchema
            java.lang.Object r0 = r0.getFromMessage(r5)
            int r0 = r0.hashCode()
            boolean r1 = r4.hasExtensions
            if (r1 == 0) goto L1c
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r1 = r4.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r1 = r1.getExtensions(r5)
            int r2 = r0 * 53
            int r3 = r1.hashCode()
            int r0 = r2 + r3
        L1c:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final boolean isInitialized(T r3) {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r2.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r0.getExtensions(r3)
            boolean r1 = r0.isInitialized()
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void makeImmutable(T r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r1.unknownFieldSchema
            r0.makeImmutable(r2)
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r1.extensionSchema
            r0.makeImmutable(r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T r7, com.google.crypto.tink.shaded.protobuf.Reader r8, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r9) throws java.io.IOException {
            r6 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r1 = r6.unknownFieldSchema
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r2 = r6.extensionSchema
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.mergeFromHelper(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T r2, T r3) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r1.unknownFieldSchema
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.mergeUnknownFields(r0, r2, r3)
            boolean r0 = r1.hasExtensions
            if (r0 == 0) goto Le
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r1.extensionSchema
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.mergeExtensions(r0, r2, r3)
        Le:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T r18, byte[] r19, int r20, int r21, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r22) throws java.io.IOException {
            r17 = this;
            r0 = r17
            r2 = r19
            r4 = r21
            r6 = r22
            r1 = r18
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r1
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = r1.unknownFields
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.getDefaultInstance()
            if (r1 != r3) goto L20
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.newInstance()
            r3 = r18
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r3
            r3.unknownFields = r1
            r5 = r1
            goto L21
        L20:
            r5 = r1
        L21:
            r1 = r18
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r1
            com.google.crypto.tink.shaded.protobuf.FieldSet r7 = r1.ensureExtensionsAreMutable()
            r1 = 0
            r3 = r1
            r1 = r20
        L2d:
            if (r1 >= r4) goto L105
            r8 = r3
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r2, r1, r6)
            int r1 = r6.int1
            int r9 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG
            r10 = 2
            if (r1 == r9) goto L81
            int r9 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
            if (r9 != r10) goto L7a
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r9 = r0.extensionSchema
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r10 = r6.extensionRegistry
            com.google.crypto.tink.shaded.protobuf.MessageLite r11 = r0.defaultInstance
            int r12 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r1)
            java.lang.Object r9 = r9.findExtensionByNumber(r10, r11, r12)
            r8 = r9
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r8 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension) r8
            if (r8 == 0) goto L72
            com.google.crypto.tink.shaded.protobuf.Protobuf r9 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.MessageLite r10 = r8.getMessageDefaultInstance()
            java.lang.Class r10 = r10.getClass()
            com.google.crypto.tink.shaded.protobuf.Schema r9 = r9.schemaFor(r10)
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeMessageField(r9, r2, r3, r4, r6)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r8.descriptor
            java.lang.Object r10 = r6.object1
            r7.setField(r9, r10)
            r1 = r3
            r3 = r8
            goto L2d
        L72:
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeUnknownField(r1, r2, r3, r4, r5, r6)
            r1 = r3
            r3 = r8
            goto L2d
        L7a:
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.skipField(r1, r2, r3, r4, r6)
            r1 = r3
            r3 = r8
            goto L2d
        L81:
            r9 = 0
            r11 = 0
        L83:
            if (r3 >= r4) goto Lf4
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r2, r3, r6)
            int r12 = r6.int1
            int r13 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r12)
            int r14 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r12)
            switch(r13) {
                case 2: goto Lc9;
                case 3: goto L99;
                default: goto L96;
            }
        L96:
            r16 = r1
            goto Le6
        L99:
            if (r8 == 0) goto Lb8
            com.google.crypto.tink.shaded.protobuf.Protobuf r15 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.MessageLite r16 = r8.getMessageDefaultInstance()
            java.lang.Class r10 = r16.getClass()
            com.google.crypto.tink.shaded.protobuf.Schema r10 = r15.schemaFor(r10)
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeMessageField(r10, r2, r3, r4, r6)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r10 = r8.descriptor
            java.lang.Object r15 = r6.object1
            r7.setField(r10, r15)
            r10 = 2
            goto L83
        Lb8:
            r10 = 2
            if (r14 != r10) goto Lc6
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeBytes(r2, r3, r6)
            java.lang.Object r10 = r6.object1
            r11 = r10
            com.google.crypto.tink.shaded.protobuf.ByteString r11 = (com.google.crypto.tink.shaded.protobuf.ByteString) r11
            r10 = 2
            goto L83
        Lc6:
            r16 = r1
            goto Le6
        Lc9:
            if (r14 != 0) goto Le4
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r2, r3, r6)
            int r9 = r6.int1
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r10 = r0.extensionSchema
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r15 = r6.extensionRegistry
            r16 = r1
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.defaultInstance
            java.lang.Object r1 = r10.findExtensionByNumber(r15, r1, r9)
            r8 = r1
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r8 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension) r8
            r1 = r16
            r10 = 2
            goto L83
        Le4:
            r16 = r1
        Le6:
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG
            if (r12 != r1) goto Lec
            r1 = r3
            goto Lf7
        Lec:
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.skipField(r12, r2, r3, r4, r6)
            r1 = r16
            r10 = 2
            goto L83
        Lf4:
            r16 = r1
            r1 = r3
        Lf7:
            if (r11 == 0) goto L102
        Lfa:
            r10 = 2
            int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r9, r10)
            r5.storeField(r3, r11)
        L102:
            r3 = r8
            goto L2d
        L105:
            r8 = r3
            if (r1 != r4) goto L109
            return
        L109:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r3
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public T newInstance() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.defaultInstance
            boolean r0 = r0 instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
            if (r0 == 0) goto Lf
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.defaultInstance
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.newMutableInstance()
            return r0
        Lf:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.defaultInstance
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.newBuilderForType()
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.buildPartial()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void writeTo(T r7, com.google.crypto.tink.shaded.protobuf.Writer r8) throws java.io.IOException {
            r6 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r6.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r0.getExtensions(r7)
            java.util.Iterator r1 = r0.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r3 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r3
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r4 = r3.getLiteJavaType()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
            if (r4 != r5) goto L54
            boolean r4 = r3.isRepeated()
            if (r4 != 0) goto L54
            boolean r4 = r3.isPacked()
            if (r4 != 0) goto L54
            boolean r4 = r2 instanceof com.google.crypto.tink.shaded.protobuf.LazyField.LazyEntry
            if (r4 == 0) goto L48
        L35:
            int r4 = r3.getNumber()
            r5 = r2
            com.google.crypto.tink.shaded.protobuf.LazyField$LazyEntry r5 = (com.google.crypto.tink.shaded.protobuf.LazyField.LazyEntry) r5
            com.google.crypto.tink.shaded.protobuf.LazyField r5 = r5.getField()
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = r5.toByteString()
            r8.writeMessageSetItem(r4, r5)
            goto L53
        L48:
            int r4 = r3.getNumber()
            java.lang.Object r5 = r2.getValue()
            r8.writeMessageSetItem(r4, r5)
        L53:
            goto La
        L54:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Found invalid MessageSet item."
            r4.<init>(r5)
            throw r4
        L5c:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r2 = r6.unknownFieldSchema
            r6.writeUnknownFieldsHelper(r2, r7, r8)
            return
    }
}
