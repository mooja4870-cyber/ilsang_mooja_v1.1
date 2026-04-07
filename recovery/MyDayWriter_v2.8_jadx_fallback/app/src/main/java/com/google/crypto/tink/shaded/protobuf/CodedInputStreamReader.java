package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class CodedInputStreamReader implements com.google.crypto.tink.shaded.protobuf.Reader {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;
    private static final int NEXT_TAG_UNSET = 0;
    private int endGroupTag;
    private final com.google.crypto.tink.shaded.protobuf.CodedInputStream input;
    private int nextTag;
    private int tag;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BYTES     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L56
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r0 = move-exception
            L57:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L63
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L63
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L63
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L63
                goto L64
            L63:
                r0 = move-exception
            L64:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L71
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
                goto L72
            L71:
                r0 = move-exception
            L72:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L7f
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64     // Catch: java.lang.NoSuchFieldError -> L7f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7f
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7f
                goto L80
            L7f:
                r0 = move-exception
            L80:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L8d
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L8d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8d
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8d
                goto L8e
            L8d:
                r0 = move-exception
            L8e:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L9b
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32     // Catch: java.lang.NoSuchFieldError -> L9b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9b
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9b
                goto L9c
            L9b:
                r0 = move-exception
            L9c:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> La9
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64     // Catch: java.lang.NoSuchFieldError -> La9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La9
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La9
                goto Laa
            La9:
                r0 = move-exception
            Laa:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lb7
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32     // Catch: java.lang.NoSuchFieldError -> Lb7
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb7
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb7
                goto Lb8
            Lb7:
                r0 = move-exception
            Lb8:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lc5
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64     // Catch: java.lang.NoSuchFieldError -> Lc5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc5
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc5
                goto Lc6
            Lc5:
                r0 = move-exception
            Lc6:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Ld3
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING     // Catch: java.lang.NoSuchFieldError -> Ld3
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld3
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld3
                goto Ld4
            Ld3:
                r0 = move-exception
            Ld4:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Le1
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32     // Catch: java.lang.NoSuchFieldError -> Le1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le1
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Le1
                goto Le2
            Le1:
                r0 = move-exception
            Le2:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lef
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64     // Catch: java.lang.NoSuchFieldError -> Lef
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lef
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lef
                goto Lf0
            Lef:
                r0 = move-exception
            Lf0:
                return
        }
    }

    private CodedInputStreamReader(com.google.crypto.tink.shaded.protobuf.CodedInputStream r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.nextTag = r0
            java.lang.String r0 = "input"
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r2, r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = (com.google.crypto.tink.shaded.protobuf.CodedInputStream) r0
            r1.input = r0
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r1.input
            r0.wrapper = r1
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader forCodedInput(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) {
            com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader r0 = r1.wrapper
            if (r0 == 0) goto L7
            com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader r0 = r1.wrapper
            return r0
        L7:
            com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader r0 = new com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader
            r0.<init>(r1)
            return r0
    }

    private <T> void mergeGroupFieldInternal(T r4, com.google.crypto.tink.shaded.protobuf.Schema<T> r5, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r6) throws java.io.IOException {
            r3 = this;
            int r0 = r3.endGroupTag
            int r1 = r3.tag
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r1)
            r2 = 4
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r1, r2)
            r3.endGroupTag = r1
            r5.mergeFrom(r4, r3, r6)     // Catch: java.lang.Throwable -> L21
            int r1 = r3.tag     // Catch: java.lang.Throwable -> L21
            int r2 = r3.endGroupTag     // Catch: java.lang.Throwable -> L21
            if (r1 != r2) goto L1c
            r3.endGroupTag = r0
            return
        L1c:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()     // Catch: java.lang.Throwable -> L21
            throw r1     // Catch: java.lang.Throwable -> L21
        L21:
            r1 = move-exception
            r3.endGroupTag = r0
            throw r1
    }

    private <T> void mergeMessageFieldInternal(T r5, com.google.crypto.tink.shaded.protobuf.Schema<T> r6, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r7) throws java.io.IOException {
            r4 = this;
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.recursionDepth
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.recursionLimit
            if (r1 >= r2) goto L35
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.pushLimit(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r3 = r2.recursionDepth
            int r3 = r3 + 1
            r2.recursionDepth = r3
            r6.mergeFrom(r5, r4, r7)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            r3 = 0
            r2.checkLastTagWas(r3)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r3 = r2.recursionDepth
            int r3 = r3 + (-1)
            r2.recursionDepth = r3
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            r2.popLimit(r1)
            return
        L35:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.recursionLimitExceeded()
            throw r1
    }

    private java.lang.Object readField(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r3, java.lang.Class<?> r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws java.io.IOException {
            r2 = this;
            int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L97;
                case 2: goto L92;
                case 3: goto L89;
                case 4: goto L80;
                case 5: goto L77;
                case 6: goto L6e;
                case 7: goto L65;
                case 8: goto L5c;
                case 9: goto L53;
                case 10: goto L4e;
                case 11: goto L45;
                case 12: goto L3c;
                case 13: goto L33;
                case 14: goto L2a;
                case 15: goto L25;
                case 16: goto L1c;
                case 17: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unsupported field type."
            r0.<init>(r1)
            throw r0
        L13:
            long r0 = r2.readUInt64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L1c:
            int r0 = r2.readUInt32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L25:
            java.lang.String r0 = r2.readStringRequireUtf8()
            return r0
        L2a:
            long r0 = r2.readSInt64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L33:
            int r0 = r2.readSInt32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L3c:
            long r0 = r2.readSFixed64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L45:
            int r0 = r2.readSFixed32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L4e:
            java.lang.Object r0 = r2.readMessage(r4, r5)
            return r0
        L53:
            long r0 = r2.readInt64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L5c:
            int r0 = r2.readInt32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L65:
            float r0 = r2.readFloat()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L6e:
            long r0 = r2.readFixed64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L77:
            int r0 = r2.readFixed32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L80:
            int r0 = r2.readEnum()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L89:
            double r0 = r2.readDouble()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L92:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.readBytes()
            return r0
        L97:
            boolean r0 = r2.readBool()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    private <T> T readGroup(com.google.crypto.tink.shaded.protobuf.Schema<T> r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException {
            r1 = this;
            java.lang.Object r0 = r2.newInstance()
            r1.mergeGroupFieldInternal(r0, r2, r3)
            r2.makeImmutable(r0)
            return r0
    }

    private <T> T readMessage(com.google.crypto.tink.shaded.protobuf.Schema<T> r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException {
            r1 = this;
            java.lang.Object r0 = r2.newInstance()
            r1.mergeMessageFieldInternal(r0, r2, r3)
            r2.makeImmutable(r0)
            return r0
    }

    private void requirePosition(int r2) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r1.input
            int r0 = r0.getTotalBytesRead()
            if (r0 != r2) goto L9
            return
        L9:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r0
    }

    private void requireWireType(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            if (r0 != r2) goto L9
            return
        L9:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
    }

    private void verifyPackedFixed32Length(int r2) throws java.io.IOException {
            r1 = this;
            r0 = r2 & 3
            if (r0 != 0) goto L5
            return
        L5:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
    }

    private void verifyPackedFixed64Length(int r2) throws java.io.IOException {
            r1 = this;
            r0 = r2 & 7
            if (r0 != 0) goto L5
            return
        L5:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public int getFieldNumber() throws java.io.IOException {
            r2 = this;
            int r0 = r2.nextTag
            if (r0 == 0) goto Lc
            int r0 = r2.nextTag
            r2.tag = r0
            r0 = 0
            r2.nextTag = r0
            goto L14
        Lc:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readTag()
            r2.tag = r0
        L14:
            int r0 = r2.tag
            if (r0 == 0) goto L26
            int r0 = r2.tag
            int r1 = r2.endGroupTag
            if (r0 != r1) goto L1f
            goto L26
        L1f:
            int r0 = r2.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r0)
            return r0
        L26:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public int getTag() {
            r1 = this;
            int r0 = r1.tag
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public <T> void mergeGroupField(T r2, com.google.crypto.tink.shaded.protobuf.Schema<T> r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            r1 = this;
            r0 = 3
            r1.requireWireType(r0)
            r1.mergeGroupFieldInternal(r2, r3, r4)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public <T> void mergeMessageField(T r2, com.google.crypto.tink.shaded.protobuf.Schema<T> r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.requireWireType(r0)
            r1.mergeMessageFieldInternal(r2, r3, r4)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public boolean readBool() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r1.input
            boolean r0 = r0.readBool()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public void readBoolList(java.util.List<java.lang.Boolean> r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.BooleanArrayList
            if (r0 == 0) goto L58
            r0 = r5
            com.google.crypto.tink.shaded.protobuf.BooleanArrayList r0 = (com.google.crypto.tink.shaded.protobuf.BooleanArrayList) r0
            int r1 = r4.tag
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
            switch(r1) {
                case 0: goto L38;
                case 1: goto L10;
                case 2: goto L15;
                default: goto L10;
            }
        L10:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r1
        L15:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.getTotalBytesRead()
            int r2 = r2 + r1
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r4.input
            boolean r3 = r3.readBool()
            r0.addBoolean(r3)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r4.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r2) goto L22
            r4.requirePosition(r2)
            goto L8c
        L38:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            boolean r1 = r1.readBool()
            r0.addBoolean(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            boolean r1 = r1.isAtEnd()
            if (r1 == 0) goto L4a
            return
        L4a:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readTag()
            int r2 = r4.tag
            if (r1 == r2) goto L57
            r4.nextTag = r1
            return
        L57:
            goto L38
        L58:
            int r0 = r4.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L61;
                case 2: goto L66;
                default: goto L61;
            }
        L61:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
        L66:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L73:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            boolean r2 = r2.readBool()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5.add(r2)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.getTotalBytesRead()
            if (r2 < r1) goto L73
            r4.requirePosition(r1)
        L8c:
            return
        L8d:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.readBool()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.add(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readTag()
            int r1 = r4.tag
            if (r0 == r1) goto Lb0
            r4.nextTag = r0
            return
        Lb0:
            goto L8d
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public com.google.crypto.tink.shaded.protobuf.ByteString readBytes() throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r1.input
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.readBytes()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public void readBytesList(java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            r1 = 2
            if (r0 != r1) goto L27
        L9:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.readBytes()
            r3.add(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r2.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto L19
            return
        L19:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readTag()
            int r1 = r2.tag
            if (r0 == r1) goto L26
            r2.nextTag = r0
            return
        L26:
            goto L9
        L27:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public double readDouble() throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r2.input
            double r0 = r0.readDouble()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public void readDoubleList(java.util.List<java.lang.Double> r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.DoubleArrayList
            if (r0 == 0) goto L58
            r0 = r6
            com.google.crypto.tink.shaded.protobuf.DoubleArrayList r0 = (com.google.crypto.tink.shaded.protobuf.DoubleArrayList) r0
            int r1 = r5.tag
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
            switch(r1) {
                case 1: goto L38;
                case 2: goto L15;
                default: goto L10;
            }
        L10:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r1
        L15:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.readUInt32()
            r5.verifyPackedFixed64Length(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            int r2 = r2.getTotalBytesRead()
            int r2 = r2 + r1
        L25:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r5.input
            double r3 = r3.readDouble()
            r0.addDouble(r3)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r5.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r2) goto L25
        L37:
            goto L8c
        L38:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            double r1 = r1.readDouble()
            r0.addDouble(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            boolean r1 = r1.isAtEnd()
            if (r1 == 0) goto L4a
            return
        L4a:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.readTag()
            int r2 = r5.tag
            if (r1 == r2) goto L57
            r5.nextTag = r1
            return
        L57:
            goto L38
        L58:
            int r0 = r5.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            switch(r0) {
                case 1: goto L8d;
                case 2: goto L66;
                default: goto L61;
            }
        L61:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
        L66:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            int r0 = r0.readUInt32()
            r5.verifyPackedFixed64Length(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L76:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            double r2 = r2.readDouble()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r6.add(r2)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            int r2 = r2.getTotalBytesRead()
            if (r2 < r1) goto L76
        L8c:
            return
        L8d:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            double r0 = r0.readDouble()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r6.add(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            int r0 = r0.readTag()
            int r1 = r5.tag
            if (r0 == r1) goto Lb0
            r5.nextTag = r0
            return
        Lb0:
            goto L8d
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public int readEnum() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r1.input
            int r0 = r0.readEnum()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public void readEnumList(java.util.List<java.lang.Integer> r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r0 == 0) goto L58
            r0 = r5
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r0
            int r1 = r4.tag
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
            switch(r1) {
                case 0: goto L38;
                case 1: goto L10;
                case 2: goto L15;
                default: goto L10;
            }
        L10:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r1
        L15:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.getTotalBytesRead()
            int r2 = r2 + r1
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r4.input
            int r3 = r3.readEnum()
            r0.addInt(r3)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r4.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r2) goto L22
            r4.requirePosition(r2)
            goto L8c
        L38:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readEnum()
            r0.addInt(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            boolean r1 = r1.isAtEnd()
            if (r1 == 0) goto L4a
            return
        L4a:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readTag()
            int r2 = r4.tag
            if (r1 == r2) goto L57
            r4.nextTag = r1
            return
        L57:
            goto L38
        L58:
            int r0 = r4.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L61;
                case 2: goto L66;
                default: goto L61;
            }
        L61:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
        L66:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L73:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.readEnum()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.add(r2)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.getTotalBytesRead()
            if (r2 < r1) goto L73
            r4.requirePosition(r1)
        L8c:
            return
        L8d:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readEnum()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readTag()
            int r1 = r4.tag
            if (r0 == r1) goto Lb0
            r4.nextTag = r0
            return
        Lb0:
            goto L8d
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public int readFixed32() throws java.io.IOException {
            r1 = this;
            r0 = 5
            r1.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r1.input
            int r0 = r0.readFixed32()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public void readFixed32List(java.util.List<java.lang.Integer> r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r0 == 0) goto L58
            r0 = r5
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r0
            int r1 = r4.tag
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
            switch(r1) {
                case 2: goto L35;
                case 5: goto L15;
                default: goto L10;
            }
        L10:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r1
        L15:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readFixed32()
            r0.addInt(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            boolean r1 = r1.isAtEnd()
            if (r1 == 0) goto L27
            return
        L27:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readTag()
            int r2 = r4.tag
            if (r1 == r2) goto L34
            r4.nextTag = r1
            return
        L34:
            goto L15
        L35:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readUInt32()
            r4.verifyPackedFixed32Length(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.getTotalBytesRead()
            int r2 = r2 + r1
        L45:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r4.input
            int r3 = r3.readFixed32()
            r0.addInt(r3)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r4.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r2) goto L45
        L57:
            goto Lb0
        L58:
            int r0 = r4.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            switch(r0) {
                case 2: goto L8a;
                case 5: goto L66;
                default: goto L61;
            }
        L61:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
        L66:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readFixed32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto L7c
            return
        L7c:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readTag()
            int r1 = r4.tag
            if (r0 == r1) goto L89
            r4.nextTag = r0
            return
        L89:
            goto L66
        L8a:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            r4.verifyPackedFixed32Length(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L9a:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.readFixed32()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.add(r2)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.getTotalBytesRead()
            if (r2 < r1) goto L9a
        Lb0:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public long readFixed64() throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r2.input
            long r0 = r0.readFixed64()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public void readFixed64List(java.util.List<java.lang.Long> r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r0 == 0) goto L58
            r0 = r6
            com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r0
            int r1 = r5.tag
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
            switch(r1) {
                case 1: goto L38;
                case 2: goto L15;
                default: goto L10;
            }
        L10:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r1
        L15:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.readUInt32()
            r5.verifyPackedFixed64Length(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            int r2 = r2.getTotalBytesRead()
            int r2 = r2 + r1
        L25:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r5.input
            long r3 = r3.readFixed64()
            r0.addLong(r3)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r5.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r2) goto L25
        L37:
            goto L8c
        L38:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            long r1 = r1.readFixed64()
            r0.addLong(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            boolean r1 = r1.isAtEnd()
            if (r1 == 0) goto L4a
            return
        L4a:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.readTag()
            int r2 = r5.tag
            if (r1 == r2) goto L57
            r5.nextTag = r1
            return
        L57:
            goto L38
        L58:
            int r0 = r5.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            switch(r0) {
                case 1: goto L8d;
                case 2: goto L66;
                default: goto L61;
            }
        L61:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
        L66:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            int r0 = r0.readUInt32()
            r5.verifyPackedFixed64Length(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L76:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            long r2 = r2.readFixed64()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.add(r2)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            int r2 = r2.getTotalBytesRead()
            if (r2 < r1) goto L76
        L8c:
            return
        L8d:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            long r0 = r0.readFixed64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.add(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            int r0 = r0.readTag()
            int r1 = r5.tag
            if (r0 == r1) goto Lb0
            r5.nextTag = r0
            return
        Lb0:
            goto L8d
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public float readFloat() throws java.io.IOException {
            r1 = this;
            r0 = 5
            r1.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r1.input
            float r0 = r0.readFloat()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public void readFloatList(java.util.List<java.lang.Float> r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.FloatArrayList
            if (r0 == 0) goto L58
            r0 = r5
            com.google.crypto.tink.shaded.protobuf.FloatArrayList r0 = (com.google.crypto.tink.shaded.protobuf.FloatArrayList) r0
            int r1 = r4.tag
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
            switch(r1) {
                case 2: goto L35;
                case 5: goto L15;
                default: goto L10;
            }
        L10:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r1
        L15:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            float r1 = r1.readFloat()
            r0.addFloat(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            boolean r1 = r1.isAtEnd()
            if (r1 == 0) goto L27
            return
        L27:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readTag()
            int r2 = r4.tag
            if (r1 == r2) goto L34
            r4.nextTag = r1
            return
        L34:
            goto L15
        L35:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readUInt32()
            r4.verifyPackedFixed32Length(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.getTotalBytesRead()
            int r2 = r2 + r1
        L45:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r4.input
            float r3 = r3.readFloat()
            r0.addFloat(r3)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r4.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r2) goto L45
        L57:
            goto Lb0
        L58:
            int r0 = r4.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            switch(r0) {
                case 2: goto L8a;
                case 5: goto L66;
                default: goto L61;
            }
        L61:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
        L66:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            float r0 = r0.readFloat()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.add(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto L7c
            return
        L7c:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readTag()
            int r1 = r4.tag
            if (r0 == r1) goto L89
            r4.nextTag = r0
            return
        L89:
            goto L66
        L8a:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            r4.verifyPackedFixed32Length(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L9a:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            float r2 = r2.readFloat()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r5.add(r2)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.getTotalBytesRead()
            if (r2 < r1) goto L9a
        Lb0:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    @java.lang.Deprecated
    public <T> T readGroup(java.lang.Class<T> r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException {
            r1 = this;
            r0 = 3
            r1.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r2)
            java.lang.Object r0 = r1.readGroup(r0, r3)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    @java.lang.Deprecated
    public <T> T readGroupBySchemaWithCheck(com.google.crypto.tink.shaded.protobuf.Schema<T> r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException {
            r1 = this;
            r0 = 3
            r1.requireWireType(r0)
            java.lang.Object r0 = r1.readGroup(r2, r3)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    @java.lang.Deprecated
    public <T> void readGroupList(java.util.List<T> r3, com.google.crypto.tink.shaded.protobuf.Schema<T> r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws java.io.IOException {
            r2 = this;
            int r0 = r2.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            r1 = 3
            if (r0 != r1) goto L2c
            int r0 = r2.tag
        Lb:
            java.lang.Object r1 = r2.readGroup(r4, r5)
            r3.add(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r2.input
            boolean r1 = r1.isAtEnd()
            if (r1 != 0) goto L2b
            int r1 = r2.nextTag
            if (r1 == 0) goto L1f
            goto L2b
        L1f:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r2.input
            int r1 = r1.readTag()
            if (r1 == r0) goto L2a
            r2.nextTag = r1
            return
        L2a:
            goto Lb
        L2b:
            return
        L2c:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    @java.lang.Deprecated
    public <T> void readGroupList(java.util.List<T> r2, java.lang.Class<T> r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r3)
            r1.readGroupList(r2, r0, r4)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public int readInt32() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r1.input
            int r0 = r0.readInt32()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public void readInt32List(java.util.List<java.lang.Integer> r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r0 == 0) goto L58
            r0 = r5
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r0
            int r1 = r4.tag
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
            switch(r1) {
                case 0: goto L38;
                case 1: goto L10;
                case 2: goto L15;
                default: goto L10;
            }
        L10:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r1
        L15:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.getTotalBytesRead()
            int r2 = r2 + r1
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r4.input
            int r3 = r3.readInt32()
            r0.addInt(r3)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r4.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r2) goto L22
            r4.requirePosition(r2)
            goto L8c
        L38:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readInt32()
            r0.addInt(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            boolean r1 = r1.isAtEnd()
            if (r1 == 0) goto L4a
            return
        L4a:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readTag()
            int r2 = r4.tag
            if (r1 == r2) goto L57
            r4.nextTag = r1
            return
        L57:
            goto L38
        L58:
            int r0 = r4.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L61;
                case 2: goto L66;
                default: goto L61;
            }
        L61:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
        L66:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L73:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.readInt32()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.add(r2)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.getTotalBytesRead()
            if (r2 < r1) goto L73
            r4.requirePosition(r1)
        L8c:
            return
        L8d:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readInt32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readTag()
            int r1 = r4.tag
            if (r0 == r1) goto Lb0
            r4.nextTag = r0
            return
        Lb0:
            goto L8d
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public long readInt64() throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r2.input
            long r0 = r0.readInt64()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public void readInt64List(java.util.List<java.lang.Long> r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r0 == 0) goto L58
            r0 = r6
            com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r0
            int r1 = r5.tag
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
            switch(r1) {
                case 0: goto L38;
                case 1: goto L10;
                case 2: goto L15;
                default: goto L10;
            }
        L10:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r1
        L15:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            int r2 = r2.getTotalBytesRead()
            int r2 = r2 + r1
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r5.input
            long r3 = r3.readInt64()
            r0.addLong(r3)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r5.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r2) goto L22
            r5.requirePosition(r2)
            goto L8c
        L38:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            long r1 = r1.readInt64()
            r0.addLong(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            boolean r1 = r1.isAtEnd()
            if (r1 == 0) goto L4a
            return
        L4a:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.readTag()
            int r2 = r5.tag
            if (r1 == r2) goto L57
            r5.nextTag = r1
            return
        L57:
            goto L38
        L58:
            int r0 = r5.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L61;
                case 2: goto L66;
                default: goto L61;
            }
        L61:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
        L66:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            int r0 = r0.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L73:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            long r2 = r2.readInt64()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.add(r2)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            int r2 = r2.getTotalBytesRead()
            if (r2 < r1) goto L73
            r5.requirePosition(r1)
        L8c:
            return
        L8d:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            long r0 = r0.readInt64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.add(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            int r0 = r0.readTag()
            int r1 = r5.tag
            if (r0 == r1) goto Lb0
            r5.nextTag = r0
            return
        Lb0:
            goto L8d
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public <K, V> void readMap(java.util.Map<K, V> r9, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r10, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r11) throws java.io.IOException {
            r8 = this;
            r0 = 2
            r8.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r8.input
            int r0 = r0.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r8.input
            int r1 = r1.pushLimit(r0)
            K r2 = r10.defaultKey
            V r3 = r10.defaultValue
        L14:
            int r4 = r8.getFieldNumber()     // Catch: java.lang.Throwable -> L69
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5f
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r5 = r8.input     // Catch: java.lang.Throwable -> L69
            boolean r5 = r5.isAtEnd()     // Catch: java.lang.Throwable -> L69
            if (r5 == 0) goto L26
            goto L5f
        L26:
            java.lang.String r5 = "Unable to parse map entry."
            switch(r4) {
                case 1: goto L3e;
                case 2: goto L30;
                default: goto L2b;
            }
        L2b:
            boolean r6 = r8.skipField()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L47 java.lang.Throwable -> L69
            goto L49
        L30:
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r6 = r10.valueType     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L47 java.lang.Throwable -> L69
            V r7 = r10.defaultValue     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L47 java.lang.Throwable -> L69
            java.lang.Class r7 = r7.getClass()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L47 java.lang.Throwable -> L69
            java.lang.Object r5 = r8.readField(r6, r7, r11)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L47 java.lang.Throwable -> L69
            r3 = r5
            goto L4b
        L3e:
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r6 = r10.keyType     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L47 java.lang.Throwable -> L69
            r7 = 0
            java.lang.Object r5 = r8.readField(r6, r7, r7)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L47 java.lang.Throwable -> L69
            r2 = r5
            goto L4b
        L47:
            r6 = move-exception
            goto L52
        L49:
            if (r6 == 0) goto L4c
        L4b:
            goto L58
        L4c:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r6 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L47 java.lang.Throwable -> L69
            r6.<init>(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L47 java.lang.Throwable -> L69
            throw r6     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L47 java.lang.Throwable -> L69
        L52:
            boolean r7 = r8.skipField()     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L59
        L58:
            goto L14
        L59:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r7 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L69
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L69
            throw r7     // Catch: java.lang.Throwable -> L69
        L5f:
            r9.put(r2, r3)     // Catch: java.lang.Throwable -> L69
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r4 = r8.input
            r4.popLimit(r1)
            return
        L69:
            r4 = move-exception
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r5 = r8.input
            r5.popLimit(r1)
            throw r4
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public <T> T readMessage(java.lang.Class<T> r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r2)
            java.lang.Object r0 = r1.readMessage(r0, r3)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public <T> T readMessageBySchemaWithCheck(com.google.crypto.tink.shaded.protobuf.Schema<T> r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.requireWireType(r0)
            java.lang.Object r0 = r1.readMessage(r2, r3)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public <T> void readMessageList(java.util.List<T> r3, com.google.crypto.tink.shaded.protobuf.Schema<T> r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws java.io.IOException {
            r2 = this;
            int r0 = r2.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            r1 = 2
            if (r0 != r1) goto L2c
            int r0 = r2.tag
        Lb:
            java.lang.Object r1 = r2.readMessage(r4, r5)
            r3.add(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r2.input
            boolean r1 = r1.isAtEnd()
            if (r1 != 0) goto L2b
            int r1 = r2.nextTag
            if (r1 == 0) goto L1f
            goto L2b
        L1f:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r2.input
            int r1 = r1.readTag()
            if (r1 == r0) goto L2a
            r2.nextTag = r1
            return
        L2a:
            goto Lb
        L2b:
            return
        L2c:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public <T> void readMessageList(java.util.List<T> r2, java.lang.Class<T> r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r3)
            r1.readMessageList(r2, r0, r4)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public int readSFixed32() throws java.io.IOException {
            r1 = this;
            r0 = 5
            r1.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r1.input
            int r0 = r0.readSFixed32()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public void readSFixed32List(java.util.List<java.lang.Integer> r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r0 == 0) goto L58
            r0 = r5
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r0
            int r1 = r4.tag
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
            switch(r1) {
                case 2: goto L35;
                case 5: goto L15;
                default: goto L10;
            }
        L10:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r1
        L15:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readSFixed32()
            r0.addInt(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            boolean r1 = r1.isAtEnd()
            if (r1 == 0) goto L27
            return
        L27:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readTag()
            int r2 = r4.tag
            if (r1 == r2) goto L34
            r4.nextTag = r1
            return
        L34:
            goto L15
        L35:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readUInt32()
            r4.verifyPackedFixed32Length(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.getTotalBytesRead()
            int r2 = r2 + r1
        L45:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r4.input
            int r3 = r3.readSFixed32()
            r0.addInt(r3)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r4.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r2) goto L45
        L57:
            goto Lb0
        L58:
            int r0 = r4.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            switch(r0) {
                case 2: goto L8a;
                case 5: goto L66;
                default: goto L61;
            }
        L61:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
        L66:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readSFixed32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto L7c
            return
        L7c:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readTag()
            int r1 = r4.tag
            if (r0 == r1) goto L89
            r4.nextTag = r0
            return
        L89:
            goto L66
        L8a:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            r4.verifyPackedFixed32Length(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L9a:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.readSFixed32()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.add(r2)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.getTotalBytesRead()
            if (r2 < r1) goto L9a
        Lb0:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public long readSFixed64() throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r2.input
            long r0 = r0.readSFixed64()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public void readSFixed64List(java.util.List<java.lang.Long> r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r0 == 0) goto L58
            r0 = r6
            com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r0
            int r1 = r5.tag
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
            switch(r1) {
                case 1: goto L38;
                case 2: goto L15;
                default: goto L10;
            }
        L10:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r1
        L15:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.readUInt32()
            r5.verifyPackedFixed64Length(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            int r2 = r2.getTotalBytesRead()
            int r2 = r2 + r1
        L25:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r5.input
            long r3 = r3.readSFixed64()
            r0.addLong(r3)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r5.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r2) goto L25
        L37:
            goto L8c
        L38:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            long r1 = r1.readSFixed64()
            r0.addLong(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            boolean r1 = r1.isAtEnd()
            if (r1 == 0) goto L4a
            return
        L4a:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.readTag()
            int r2 = r5.tag
            if (r1 == r2) goto L57
            r5.nextTag = r1
            return
        L57:
            goto L38
        L58:
            int r0 = r5.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            switch(r0) {
                case 1: goto L8d;
                case 2: goto L66;
                default: goto L61;
            }
        L61:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
        L66:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            int r0 = r0.readUInt32()
            r5.verifyPackedFixed64Length(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L76:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            long r2 = r2.readSFixed64()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.add(r2)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            int r2 = r2.getTotalBytesRead()
            if (r2 < r1) goto L76
        L8c:
            return
        L8d:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            long r0 = r0.readSFixed64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.add(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            int r0 = r0.readTag()
            int r1 = r5.tag
            if (r0 == r1) goto Lb0
            r5.nextTag = r0
            return
        Lb0:
            goto L8d
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public int readSInt32() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r1.input
            int r0 = r0.readSInt32()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public void readSInt32List(java.util.List<java.lang.Integer> r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r0 == 0) goto L58
            r0 = r5
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r0
            int r1 = r4.tag
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
            switch(r1) {
                case 0: goto L38;
                case 1: goto L10;
                case 2: goto L15;
                default: goto L10;
            }
        L10:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r1
        L15:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.getTotalBytesRead()
            int r2 = r2 + r1
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r4.input
            int r3 = r3.readSInt32()
            r0.addInt(r3)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r4.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r2) goto L22
            r4.requirePosition(r2)
            goto L8c
        L38:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readSInt32()
            r0.addInt(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            boolean r1 = r1.isAtEnd()
            if (r1 == 0) goto L4a
            return
        L4a:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readTag()
            int r2 = r4.tag
            if (r1 == r2) goto L57
            r4.nextTag = r1
            return
        L57:
            goto L38
        L58:
            int r0 = r4.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L61;
                case 2: goto L66;
                default: goto L61;
            }
        L61:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
        L66:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L73:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.readSInt32()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.add(r2)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.getTotalBytesRead()
            if (r2 < r1) goto L73
            r4.requirePosition(r1)
        L8c:
            return
        L8d:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readSInt32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readTag()
            int r1 = r4.tag
            if (r0 == r1) goto Lb0
            r4.nextTag = r0
            return
        Lb0:
            goto L8d
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public long readSInt64() throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r2.input
            long r0 = r0.readSInt64()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public void readSInt64List(java.util.List<java.lang.Long> r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r0 == 0) goto L58
            r0 = r6
            com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r0
            int r1 = r5.tag
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
            switch(r1) {
                case 0: goto L38;
                case 1: goto L10;
                case 2: goto L15;
                default: goto L10;
            }
        L10:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r1
        L15:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            int r2 = r2.getTotalBytesRead()
            int r2 = r2 + r1
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r5.input
            long r3 = r3.readSInt64()
            r0.addLong(r3)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r5.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r2) goto L22
            r5.requirePosition(r2)
            goto L8c
        L38:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            long r1 = r1.readSInt64()
            r0.addLong(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            boolean r1 = r1.isAtEnd()
            if (r1 == 0) goto L4a
            return
        L4a:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.readTag()
            int r2 = r5.tag
            if (r1 == r2) goto L57
            r5.nextTag = r1
            return
        L57:
            goto L38
        L58:
            int r0 = r5.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L61;
                case 2: goto L66;
                default: goto L61;
            }
        L61:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
        L66:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            int r0 = r0.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L73:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            long r2 = r2.readSInt64()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.add(r2)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            int r2 = r2.getTotalBytesRead()
            if (r2 < r1) goto L73
            r5.requirePosition(r1)
        L8c:
            return
        L8d:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            long r0 = r0.readSInt64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.add(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            int r0 = r0.readTag()
            int r1 = r5.tag
            if (r0 == r1) goto Lb0
            r5.nextTag = r0
            return
        Lb0:
            goto L8d
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public java.lang.String readString() throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r1.input
            java.lang.String r0 = r0.readString()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public void readStringList(java.util.List<java.lang.String> r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.readStringListInternal(r2, r0)
            return
    }

    public void readStringListInternal(java.util.List<java.lang.String> r4, boolean r5) throws java.io.IOException {
            r3 = this;
            int r0 = r3.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            r1 = 2
            if (r0 != r1) goto L55
            boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList
            if (r0 == 0) goto L30
            if (r5 != 0) goto L30
            r0 = r4
            com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = (com.google.crypto.tink.shaded.protobuf.LazyStringList) r0
        L12:
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r3.readBytes()
            r0.add(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r3.input
            boolean r1 = r1.isAtEnd()
            if (r1 == 0) goto L22
            return
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r3.input
            int r1 = r1.readTag()
            int r2 = r3.tag
            if (r1 == r2) goto L2f
            r3.nextTag = r1
            return
        L2f:
            goto L12
        L30:
            if (r5 == 0) goto L37
            java.lang.String r0 = r3.readStringRequireUtf8()
            goto L3b
        L37:
            java.lang.String r0 = r3.readString()
        L3b:
            r4.add(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r3.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto L47
            return
        L47:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r3.input
            int r0 = r0.readTag()
            int r1 = r3.tag
            if (r0 == r1) goto L54
            r3.nextTag = r0
            return
        L54:
            goto L30
        L55:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public void readStringListRequireUtf8(java.util.List<java.lang.String> r2) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.readStringListInternal(r2, r0)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public java.lang.String readStringRequireUtf8() throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r1.input
            java.lang.String r0 = r0.readStringRequireUtf8()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public int readUInt32() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r1.input
            int r0 = r0.readUInt32()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public void readUInt32List(java.util.List<java.lang.Integer> r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r0 == 0) goto L58
            r0 = r5
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r0
            int r1 = r4.tag
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
            switch(r1) {
                case 0: goto L38;
                case 1: goto L10;
                case 2: goto L15;
                default: goto L10;
            }
        L10:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r1
        L15:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.getTotalBytesRead()
            int r2 = r2 + r1
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r4.input
            int r3 = r3.readUInt32()
            r0.addInt(r3)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r4.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r2) goto L22
            r4.requirePosition(r2)
            goto L8c
        L38:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readUInt32()
            r0.addInt(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            boolean r1 = r1.isAtEnd()
            if (r1 == 0) goto L4a
            return
        L4a:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.readTag()
            int r2 = r4.tag
            if (r1 == r2) goto L57
            r4.nextTag = r1
            return
        L57:
            goto L38
        L58:
            int r0 = r4.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L61;
                case 2: goto L66;
                default: goto L61;
            }
        L61:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
        L66:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L73:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.readUInt32()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.add(r2)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r4.input
            int r2 = r2.getTotalBytesRead()
            if (r2 < r1) goto L73
            r4.requirePosition(r1)
        L8c:
            return
        L8d:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readTag()
            int r1 = r4.tag
            if (r0 == r1) goto Lb0
            r4.nextTag = r0
            return
        Lb0:
            goto L8d
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public long readUInt64() throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.requireWireType(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r2.input
            long r0 = r0.readUInt64()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public void readUInt64List(java.util.List<java.lang.Long> r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r0 == 0) goto L58
            r0 = r6
            com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r0
            int r1 = r5.tag
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
            switch(r1) {
                case 0: goto L38;
                case 1: goto L10;
                case 2: goto L15;
                default: goto L10;
            }
        L10:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r1
        L15:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            int r2 = r2.getTotalBytesRead()
            int r2 = r2 + r1
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r5.input
            long r3 = r3.readUInt64()
            r0.addLong(r3)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r5.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r2) goto L22
            r5.requirePosition(r2)
            goto L8c
        L38:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            long r1 = r1.readUInt64()
            r0.addLong(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            boolean r1 = r1.isAtEnd()
            if (r1 == 0) goto L4a
            return
        L4a:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.readTag()
            int r2 = r5.tag
            if (r1 == r2) goto L57
            r5.nextTag = r1
            return
        L57:
            goto L38
        L58:
            int r0 = r5.tag
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L61;
                case 2: goto L66;
                default: goto L61;
            }
        L61:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r0
        L66:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            int r0 = r0.readUInt32()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r5.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L73:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            long r2 = r2.readUInt64()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.add(r2)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r5.input
            int r2 = r2.getTotalBytesRead()
            if (r2 < r1) goto L73
            r5.requirePosition(r1)
        L8c:
            return
        L8d:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            long r0 = r0.readUInt64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.add(r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.input
            int r0 = r0.readTag()
            int r1 = r5.tag
            if (r0 == r1) goto Lb0
            r5.nextTag = r0
            return
        Lb0:
            goto L8d
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public boolean shouldDiscardUnknownFields() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r1.input
            boolean r0 = r0.shouldDiscardUnknownFields()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public boolean skipField() throws java.io.IOException {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r2.input
            boolean r0 = r0.isAtEnd()
            if (r0 != 0) goto L18
            int r0 = r2.tag
            int r1 = r2.endGroupTag
            if (r0 != r1) goto Lf
            goto L18
        Lf:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r2.input
            int r1 = r2.tag
            boolean r0 = r0.skipField(r1)
            return r0
        L18:
            r0 = 0
            return r0
    }
}
