package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class CodedOutputStreamWriter implements com.google.crypto.tink.shaded.protobuf.Writer {
    private final com.google.crypto.tink.shaded.protobuf.CodedOutputStream output;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L56
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r0 = move-exception
            L57:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L63
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64     // Catch: java.lang.NoSuchFieldError -> L63
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L63
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L63
                goto L64
            L63:
                r0 = move-exception
            L64:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L71
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
                goto L72
            L71:
                r0 = move-exception
            L72:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L7f
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64     // Catch: java.lang.NoSuchFieldError -> L7f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7f
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7f
                goto L80
            L7f:
                r0 = move-exception
            L80:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L8d
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64     // Catch: java.lang.NoSuchFieldError -> L8d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8d
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8d
                goto L8e
            L8d:
                r0 = move-exception
            L8e:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L9b
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64     // Catch: java.lang.NoSuchFieldError -> L9b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9b
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9b
                goto L9c
            L9b:
                r0 = move-exception
            L9c:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> La9
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING     // Catch: java.lang.NoSuchFieldError -> La9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La9
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La9
                goto Laa
            La9:
                r0 = move-exception
            Laa:
                return
        }
    }

    private CodedOutputStreamWriter(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "output"
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r2, r0)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = (com.google.crypto.tink.shaded.protobuf.CodedOutputStream) r0
            r1.output = r0
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.wrapper = r1
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter forCodedOutput(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1) {
            com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter r0 = r1.wrapper
            if (r0 == 0) goto L7
            com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter r0 = r1.wrapper
            return r0
        L7:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter
            r0.<init>(r1)
            return r0
    }

    private <V> void writeDeterministicBooleanMapEntry(int r3, boolean r4, V r5, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<java.lang.Boolean, V> r6) throws java.io.IOException {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r2.output
            r1 = 2
            r0.writeTag(r3, r1)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r2.output
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            int r1 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.computeSerializedSize(r6, r1, r5)
            r0.writeUInt32NoTag(r1)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r2.output
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite.writeTo(r0, r6, r1, r5)
            return
    }

    private <V> void writeDeterministicIntegerMap(int r9, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<java.lang.Integer, V> r10, java.util.Map<java.lang.Integer, V> r11) throws java.io.IOException {
            r8 = this;
            int r0 = r11.size()
            int[] r0 = new int[r0]
            r1 = 0
            java.util.Set r2 = r11.keySet()
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L25
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r4 = r1 + 1
            r0[r1] = r3
            r1 = r4
            goto Lf
        L25:
            java.util.Arrays.sort(r0)
            int r2 = r0.length
            r3 = 0
        L2a:
            if (r3 >= r2) goto L55
            r4 = r0[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r11.get(r5)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r8.output
            r7 = 2
            r6.writeTag(r9, r7)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r8.output
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            int r7 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.computeSerializedSize(r10, r7, r5)
            r6.writeUInt32NoTag(r7)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r8.output
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite.writeTo(r6, r10, r7, r5)
            int r3 = r3 + 1
            goto L2a
        L55:
            return
    }

    private <V> void writeDeterministicLongMap(int r10, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<java.lang.Long, V> r11, java.util.Map<java.lang.Long, V> r12) throws java.io.IOException {
            r9 = this;
            int r0 = r12.size()
            long[] r0 = new long[r0]
            r1 = 0
            java.util.Set r2 = r12.keySet()
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L25
            java.lang.Object r3 = r2.next()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r5 = r1 + 1
            r0[r1] = r3
            r1 = r5
            goto Lf
        L25:
            java.util.Arrays.sort(r0)
            int r2 = r0.length
            r3 = 0
        L2a:
            if (r3 >= r2) goto L55
            r4 = r0[r3]
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            java.lang.Object r6 = r12.get(r6)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r7 = r9.output
            r8 = 2
            r7.writeTag(r10, r8)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r7 = r9.output
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            int r8 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.computeSerializedSize(r11, r8, r6)
            r7.writeUInt32NoTag(r8)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r7 = r9.output
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite.writeTo(r7, r11, r8, r6)
            int r3 = r3 + 1
            goto L2a
        L55:
            return
    }

    private <K, V> void writeDeterministicMap(int r4, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r5, java.util.Map<K, V> r6) throws java.io.IOException {
            r3 = this;
            int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = r5.keyType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L34;
                case 2: goto L30;
                case 3: goto L30;
                case 4: goto L30;
                case 5: goto L30;
                case 6: goto L30;
                case 7: goto L2c;
                case 8: goto L2c;
                case 9: goto L2c;
                case 10: goto L2c;
                case 11: goto L2c;
                case 12: goto L28;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "does not support key type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r2 = r5.keyType
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L28:
            r3.writeDeterministicStringMap(r4, r5, r6)
            goto L4e
        L2c:
            r3.writeDeterministicLongMap(r4, r5, r6)
            goto L4e
        L30:
            r3.writeDeterministicIntegerMap(r4, r5, r6)
            goto L4e
        L34:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r6.get(r0)
            r1 = r0
            if (r0 == 0) goto L41
            r0 = 0
            r3.writeDeterministicBooleanMapEntry(r4, r0, r1, r5)
        L41:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r6.get(r0)
            r1 = r0
            if (r0 == 0) goto L4e
            r0 = 1
            r3.writeDeterministicBooleanMapEntry(r4, r0, r1, r5)
        L4e:
            return
    }

    private <V> void writeDeterministicStringMap(int r9, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<java.lang.String, V> r10, java.util.Map<java.lang.String, V> r11) throws java.io.IOException {
            r8 = this;
            int r0 = r11.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.util.Set r2 = r11.keySet()
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L21
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r1 + 1
            r0[r1] = r3
            r1 = r4
            goto Lf
        L21:
            java.util.Arrays.sort(r0)
            int r2 = r0.length
            r3 = 0
        L26:
            if (r3 >= r2) goto L45
            r4 = r0[r3]
            java.lang.Object r5 = r11.get(r4)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r8.output
            r7 = 2
            r6.writeTag(r9, r7)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r8.output
            int r7 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.computeSerializedSize(r10, r4, r5)
            r6.writeUInt32NoTag(r7)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r8.output
            com.google.crypto.tink.shaded.protobuf.MapEntryLite.writeTo(r6, r10, r4, r5)
            int r3 = r3 + 1
            goto L26
        L45:
            return
    }

    private void writeLazyString(int r3, java.lang.Object r4) throws java.io.IOException {
            r2 = this;
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto Ld
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r2.output
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1
            r0.writeString(r3, r1)
            goto L15
        Ld:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r2.output
            r1 = r4
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = (com.google.crypto.tink.shaded.protobuf.ByteString) r1
            r0.writeBytes(r3, r1)
        L15:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder fieldOrder() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r0 = com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder.ASCENDING
            return r0
    }

    public int getTotalBytesWritten() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            int r0 = r0.getTotalBytesWritten()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBool(int r2, boolean r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeBool(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBoolList(int r5, java.util.List<java.lang.Boolean> r6, boolean r7) throws java.io.IOException {
            r4 = this;
            if (r7 == 0) goto L41
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r4.output
            r1 = 2
            r0.writeTag(r5, r1)
            r0 = 0
            r1 = 0
        La:
            int r2 = r6.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r6.get(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBoolSizeNoTag(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto La
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            r1.writeUInt32NoTag(r0)
            r1 = 0
        L28:
            int r2 = r6.size()
            if (r1 >= r2) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r4.output
            java.lang.Object r3 = r6.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.writeBoolNoTag(r3)
            int r1 = r1 + 1
            goto L28
        L40:
            goto L5a
        L41:
            r0 = 0
        L42:
            int r1 = r6.size()
            if (r0 >= r1) goto L5a
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            java.lang.Object r2 = r6.get(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r1.writeBool(r5, r2)
            int r0 = r0 + 1
            goto L42
        L5a:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBytes(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeBytes(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBytesList(int r4, java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> r5) throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r5.size()
            if (r0 >= r1) goto L15
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r3.output
            java.lang.Object r2 = r5.get(r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
            r1.writeBytes(r4, r2)
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeDouble(int r2, double r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeDouble(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeDoubleList(int r6, java.util.List<java.lang.Double> r7, boolean r8) throws java.io.IOException {
            r5 = this;
            if (r8 == 0) goto L41
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r5.output
            r1 = 2
            r0.writeTag(r6, r1)
            r0 = 0
            r1 = 0
        La:
            int r2 = r7.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r7.get(r1)
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeDoubleSizeNoTag(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto La
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r5.output
            r1.writeUInt32NoTag(r0)
            r1 = 0
        L28:
            int r2 = r7.size()
            if (r1 >= r2) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r5.output
            java.lang.Object r3 = r7.get(r1)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r2.writeDoubleNoTag(r3)
            int r1 = r1 + 1
            goto L28
        L40:
            goto L5a
        L41:
            r0 = 0
        L42:
            int r1 = r7.size()
            if (r0 >= r1) goto L5a
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r5.output
            java.lang.Object r2 = r7.get(r0)
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            r1.writeDouble(r6, r2)
            int r0 = r0 + 1
            goto L42
        L5a:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @java.lang.Deprecated
    public void writeEndGroup(int r3) throws java.io.IOException {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r2.output
            r1 = 4
            r0.writeTag(r3, r1)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeEnum(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeEnum(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeEnumList(int r5, java.util.List<java.lang.Integer> r6, boolean r7) throws java.io.IOException {
            r4 = this;
            if (r7 == 0) goto L41
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r4.output
            r1 = 2
            r0.writeTag(r5, r1)
            r0 = 0
            r1 = 0
        La:
            int r2 = r6.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r6.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSizeNoTag(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto La
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            r1.writeUInt32NoTag(r0)
            r1 = 0
        L28:
            int r2 = r6.size()
            if (r1 >= r2) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r4.output
            java.lang.Object r3 = r6.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.writeEnumNoTag(r3)
            int r1 = r1 + 1
            goto L28
        L40:
            goto L5a
        L41:
            r0 = 0
        L42:
            int r1 = r6.size()
            if (r0 >= r1) goto L5a
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            java.lang.Object r2 = r6.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.writeEnum(r5, r2)
            int r0 = r0 + 1
            goto L42
        L5a:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed32(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeFixed32(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed32List(int r5, java.util.List<java.lang.Integer> r6, boolean r7) throws java.io.IOException {
            r4 = this;
            if (r7 == 0) goto L41
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r4.output
            r1 = 2
            r0.writeTag(r5, r1)
            r0 = 0
            r1 = 0
        La:
            int r2 = r6.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r6.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32SizeNoTag(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto La
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            r1.writeUInt32NoTag(r0)
            r1 = 0
        L28:
            int r2 = r6.size()
            if (r1 >= r2) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r4.output
            java.lang.Object r3 = r6.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.writeFixed32NoTag(r3)
            int r1 = r1 + 1
            goto L28
        L40:
            goto L5a
        L41:
            r0 = 0
        L42:
            int r1 = r6.size()
            if (r0 >= r1) goto L5a
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            java.lang.Object r2 = r6.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.writeFixed32(r5, r2)
            int r0 = r0 + 1
            goto L42
        L5a:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed64(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeFixed64(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed64List(int r6, java.util.List<java.lang.Long> r7, boolean r8) throws java.io.IOException {
            r5 = this;
            if (r8 == 0) goto L41
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r5.output
            r1 = 2
            r0.writeTag(r6, r1)
            r0 = 0
            r1 = 0
        La:
            int r2 = r7.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r7.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64SizeNoTag(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto La
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r5.output
            r1.writeUInt32NoTag(r0)
            r1 = 0
        L28:
            int r2 = r7.size()
            if (r1 >= r2) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r5.output
            java.lang.Object r3 = r7.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r2.writeFixed64NoTag(r3)
            int r1 = r1 + 1
            goto L28
        L40:
            goto L5a
        L41:
            r0 = 0
        L42:
            int r1 = r7.size()
            if (r0 >= r1) goto L5a
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r5.output
            java.lang.Object r2 = r7.get(r0)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r1.writeFixed64(r6, r2)
            int r0 = r0 + 1
            goto L42
        L5a:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFloat(int r2, float r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeFloat(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFloatList(int r5, java.util.List<java.lang.Float> r6, boolean r7) throws java.io.IOException {
            r4 = this;
            if (r7 == 0) goto L41
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r4.output
            r1 = 2
            r0.writeTag(r5, r1)
            r0 = 0
            r1 = 0
        La:
            int r2 = r6.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r6.get(r1)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFloatSizeNoTag(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto La
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            r1.writeUInt32NoTag(r0)
            r1 = 0
        L28:
            int r2 = r6.size()
            if (r1 >= r2) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r4.output
            java.lang.Object r3 = r6.get(r1)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2.writeFloatNoTag(r3)
            int r1 = r1 + 1
            goto L28
        L40:
            goto L5a
        L41:
            r0 = 0
        L42:
            int r1 = r6.size()
            if (r0 >= r1) goto L5a
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            java.lang.Object r2 = r6.get(r0)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.writeFloat(r5, r2)
            int r0 = r0 + 1
            goto L42
        L5a:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @java.lang.Deprecated
    public void writeGroup(int r3, java.lang.Object r4) throws java.io.IOException {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r2.output
            r1 = r4
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1
            r0.writeGroup(r3, r1)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeGroup(int r3, java.lang.Object r4, com.google.crypto.tink.shaded.protobuf.Schema r5) throws java.io.IOException {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r2.output
            r1 = r4
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1
            r0.writeGroup(r3, r1, r5)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @java.lang.Deprecated
    public void writeGroupList(int r3, java.util.List<?> r4) throws java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L11
            java.lang.Object r1 = r4.get(r0)
            r2.writeGroup(r3, r1)
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeGroupList(int r3, java.util.List<?> r4, com.google.crypto.tink.shaded.protobuf.Schema r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L11
            java.lang.Object r1 = r4.get(r0)
            r2.writeGroup(r3, r1, r5)
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt32(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeInt32(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt32List(int r5, java.util.List<java.lang.Integer> r6, boolean r7) throws java.io.IOException {
            r4 = this;
            if (r7 == 0) goto L41
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r4.output
            r1 = 2
            r0.writeTag(r5, r1)
            r0 = 0
            r1 = 0
        La:
            int r2 = r6.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r6.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32SizeNoTag(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto La
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            r1.writeUInt32NoTag(r0)
            r1 = 0
        L28:
            int r2 = r6.size()
            if (r1 >= r2) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r4.output
            java.lang.Object r3 = r6.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.writeInt32NoTag(r3)
            int r1 = r1 + 1
            goto L28
        L40:
            goto L5a
        L41:
            r0 = 0
        L42:
            int r1 = r6.size()
            if (r0 >= r1) goto L5a
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            java.lang.Object r2 = r6.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.writeInt32(r5, r2)
            int r0 = r0 + 1
            goto L42
        L5a:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt64(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeInt64(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt64List(int r6, java.util.List<java.lang.Long> r7, boolean r8) throws java.io.IOException {
            r5 = this;
            if (r8 == 0) goto L41
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r5.output
            r1 = 2
            r0.writeTag(r6, r1)
            r0 = 0
            r1 = 0
        La:
            int r2 = r7.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r7.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64SizeNoTag(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto La
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r5.output
            r1.writeUInt32NoTag(r0)
            r1 = 0
        L28:
            int r2 = r7.size()
            if (r1 >= r2) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r5.output
            java.lang.Object r3 = r7.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r2.writeInt64NoTag(r3)
            int r1 = r1 + 1
            goto L28
        L40:
            goto L5a
        L41:
            r0 = 0
        L42:
            int r1 = r7.size()
            if (r0 >= r1) goto L5a
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r5.output
            java.lang.Object r2 = r7.get(r0)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r1.writeInt64(r6, r2)
            int r0 = r0 + 1
            goto L42
        L5a:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public <K, V> void writeMap(int r6, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r7, java.util.Map<K, V> r8) throws java.io.IOException {
            r5 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r5.output
            boolean r0 = r0.isSerializationDeterministic()
            if (r0 == 0) goto Lc
            r5.writeDeterministicMap(r6, r7, r8)
            return
        Lc:
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r5.output
            r3 = 2
            r2.writeTag(r6, r3)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r5.output
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r4 = r1.getValue()
            int r3 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.computeSerializedSize(r7, r3, r4)
            r2.writeUInt32NoTag(r3)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r5.output
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r4 = r1.getValue()
            com.google.crypto.tink.shaded.protobuf.MapEntryLite.writeTo(r2, r7, r3, r4)
            goto L14
        L45:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeMessage(int r3, java.lang.Object r4) throws java.io.IOException {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r2.output
            r1 = r4
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1
            r0.writeMessage(r3, r1)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeMessage(int r3, java.lang.Object r4, com.google.crypto.tink.shaded.protobuf.Schema r5) throws java.io.IOException {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r2.output
            r1 = r4
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1
            r0.writeMessage(r3, r1, r5)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeMessageList(int r3, java.util.List<?> r4) throws java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L11
            java.lang.Object r1 = r4.get(r0)
            r2.writeMessage(r3, r1)
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeMessageList(int r3, java.util.List<?> r4, com.google.crypto.tink.shaded.protobuf.Schema r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L11
            java.lang.Object r1 = r4.get(r0)
            r2.writeMessage(r3, r1, r5)
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageSetItem(int r3, java.lang.Object r4) throws java.io.IOException {
            r2 = this;
            boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r0 == 0) goto Ld
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r2.output
            r1 = r4
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = (com.google.crypto.tink.shaded.protobuf.ByteString) r1
            r0.writeRawMessageSetExtension(r3, r1)
            goto L15
        Ld:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r2.output
            r1 = r4
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1
            r0.writeMessageSetExtension(r3, r1)
        L15:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed32(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeSFixed32(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed32List(int r5, java.util.List<java.lang.Integer> r6, boolean r7) throws java.io.IOException {
            r4 = this;
            if (r7 == 0) goto L41
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r4.output
            r1 = 2
            r0.writeTag(r5, r1)
            r0 = 0
            r1 = 0
        La:
            int r2 = r6.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r6.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto La
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            r1.writeUInt32NoTag(r0)
            r1 = 0
        L28:
            int r2 = r6.size()
            if (r1 >= r2) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r4.output
            java.lang.Object r3 = r6.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.writeSFixed32NoTag(r3)
            int r1 = r1 + 1
            goto L28
        L40:
            goto L5a
        L41:
            r0 = 0
        L42:
            int r1 = r6.size()
            if (r0 >= r1) goto L5a
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            java.lang.Object r2 = r6.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.writeSFixed32(r5, r2)
            int r0 = r0 + 1
            goto L42
        L5a:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed64(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeSFixed64(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed64List(int r6, java.util.List<java.lang.Long> r7, boolean r8) throws java.io.IOException {
            r5 = this;
            if (r8 == 0) goto L41
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r5.output
            r1 = 2
            r0.writeTag(r6, r1)
            r0 = 0
            r1 = 0
        La:
            int r2 = r7.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r7.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto La
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r5.output
            r1.writeUInt32NoTag(r0)
            r1 = 0
        L28:
            int r2 = r7.size()
            if (r1 >= r2) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r5.output
            java.lang.Object r3 = r7.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r2.writeSFixed64NoTag(r3)
            int r1 = r1 + 1
            goto L28
        L40:
            goto L5a
        L41:
            r0 = 0
        L42:
            int r1 = r7.size()
            if (r0 >= r1) goto L5a
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r5.output
            java.lang.Object r2 = r7.get(r0)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r1.writeSFixed64(r6, r2)
            int r0 = r0 + 1
            goto L42
        L5a:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt32(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeSInt32(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt32List(int r5, java.util.List<java.lang.Integer> r6, boolean r7) throws java.io.IOException {
            r4 = this;
            if (r7 == 0) goto L41
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r4.output
            r1 = 2
            r0.writeTag(r5, r1)
            r0 = 0
            r1 = 0
        La:
            int r2 = r6.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r6.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32SizeNoTag(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto La
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            r1.writeUInt32NoTag(r0)
            r1 = 0
        L28:
            int r2 = r6.size()
            if (r1 >= r2) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r4.output
            java.lang.Object r3 = r6.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.writeSInt32NoTag(r3)
            int r1 = r1 + 1
            goto L28
        L40:
            goto L5a
        L41:
            r0 = 0
        L42:
            int r1 = r6.size()
            if (r0 >= r1) goto L5a
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            java.lang.Object r2 = r6.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.writeSInt32(r5, r2)
            int r0 = r0 + 1
            goto L42
        L5a:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt64(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeSInt64(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt64List(int r6, java.util.List<java.lang.Long> r7, boolean r8) throws java.io.IOException {
            r5 = this;
            if (r8 == 0) goto L41
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r5.output
            r1 = 2
            r0.writeTag(r6, r1)
            r0 = 0
            r1 = 0
        La:
            int r2 = r7.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r7.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64SizeNoTag(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto La
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r5.output
            r1.writeUInt32NoTag(r0)
            r1 = 0
        L28:
            int r2 = r7.size()
            if (r1 >= r2) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r5.output
            java.lang.Object r3 = r7.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r2.writeSInt64NoTag(r3)
            int r1 = r1 + 1
            goto L28
        L40:
            goto L5a
        L41:
            r0 = 0
        L42:
            int r1 = r7.size()
            if (r0 >= r1) goto L5a
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r5.output
            java.lang.Object r2 = r7.get(r0)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r1.writeSInt64(r6, r2)
            int r0 = r0 + 1
            goto L42
        L5a:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @java.lang.Deprecated
    public void writeStartGroup(int r3) throws java.io.IOException {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r2.output
            r1 = 3
            r0.writeTag(r3, r1)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeString(int r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeString(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeStringList(int r4, java.util.List<java.lang.String> r5) throws java.io.IOException {
            r3 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList
            if (r0 == 0) goto L19
            r0 = r5
            com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = (com.google.crypto.tink.shaded.protobuf.LazyStringList) r0
            r1 = 0
        L8:
            int r2 = r5.size()
            if (r1 >= r2) goto L18
            java.lang.Object r2 = r0.getRaw(r1)
            r3.writeLazyString(r4, r2)
            int r1 = r1 + 1
            goto L8
        L18:
            goto L2e
        L19:
            r0 = 0
        L1a:
            int r1 = r5.size()
            if (r0 >= r1) goto L2e
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r3.output
            java.lang.Object r2 = r5.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.writeString(r4, r2)
            int r0 = r0 + 1
            goto L1a
        L2e:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt32(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeUInt32(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt32List(int r5, java.util.List<java.lang.Integer> r6, boolean r7) throws java.io.IOException {
            r4 = this;
            if (r7 == 0) goto L41
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r4.output
            r1 = 2
            r0.writeTag(r5, r1)
            r0 = 0
            r1 = 0
        La:
            int r2 = r6.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r6.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto La
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            r1.writeUInt32NoTag(r0)
            r1 = 0
        L28:
            int r2 = r6.size()
            if (r1 >= r2) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r4.output
            java.lang.Object r3 = r6.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.writeUInt32NoTag(r3)
            int r1 = r1 + 1
            goto L28
        L40:
            goto L5a
        L41:
            r0 = 0
        L42:
            int r1 = r6.size()
            if (r0 >= r1) goto L5a
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            java.lang.Object r2 = r6.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.writeUInt32(r5, r2)
            int r0 = r0 + 1
            goto L42
        L5a:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt64(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeUInt64(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt64List(int r6, java.util.List<java.lang.Long> r7, boolean r8) throws java.io.IOException {
            r5 = this;
            if (r8 == 0) goto L41
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r5.output
            r1 = 2
            r0.writeTag(r6, r1)
            r0 = 0
            r1 = 0
        La:
            int r2 = r7.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r7.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64SizeNoTag(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto La
        L22:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r5.output
            r1.writeUInt32NoTag(r0)
            r1 = 0
        L28:
            int r2 = r7.size()
            if (r1 >= r2) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = r5.output
            java.lang.Object r3 = r7.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r2.writeUInt64NoTag(r3)
            int r1 = r1 + 1
            goto L28
        L40:
            goto L5a
        L41:
            r0 = 0
        L42:
            int r1 = r7.size()
            if (r0 >= r1) goto L5a
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r5.output
            java.lang.Object r2 = r7.get(r0)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r1.writeUInt64(r6, r2)
            int r0 = r0 + 1
            goto L42
        L5a:
            return
    }
}
