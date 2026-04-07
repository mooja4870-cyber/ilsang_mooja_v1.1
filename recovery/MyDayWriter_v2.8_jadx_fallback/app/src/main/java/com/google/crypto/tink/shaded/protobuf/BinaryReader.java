package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
abstract class BinaryReader implements com.google.crypto.tink.shaded.protobuf.Reader {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.BinaryReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BYTES     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L56
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r0 = move-exception
            L57:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L63
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L63
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L63
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L63
                goto L64
            L63:
                r0 = move-exception
            L64:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L71
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
                goto L72
            L71:
                r0 = move-exception
            L72:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L7f
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64     // Catch: java.lang.NoSuchFieldError -> L7f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7f
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7f
                goto L80
            L7f:
                r0 = move-exception
            L80:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L8d
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L8d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8d
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8d
                goto L8e
            L8d:
                r0 = move-exception
            L8e:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L9b
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32     // Catch: java.lang.NoSuchFieldError -> L9b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9b
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9b
                goto L9c
            L9b:
                r0 = move-exception
            L9c:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> La9
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64     // Catch: java.lang.NoSuchFieldError -> La9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La9
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La9
                goto Laa
            La9:
                r0 = move-exception
            Laa:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lb7
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32     // Catch: java.lang.NoSuchFieldError -> Lb7
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb7
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb7
                goto Lb8
            Lb7:
                r0 = move-exception
            Lb8:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lc5
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64     // Catch: java.lang.NoSuchFieldError -> Lc5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc5
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc5
                goto Lc6
            Lc5:
                r0 = move-exception
            Lc6:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Ld3
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING     // Catch: java.lang.NoSuchFieldError -> Ld3
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld3
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld3
                goto Ld4
            Ld3:
                r0 = move-exception
            Ld4:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Le1
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32     // Catch: java.lang.NoSuchFieldError -> Le1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le1
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Le1
                goto Le2
            Le1:
                r0 = move-exception
            Le2:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lef
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

    private static final class SafeHeapReader extends com.google.crypto.tink.shaded.protobuf.BinaryReader {
        private final byte[] buffer;
        private final boolean bufferIsImmutable;
        private int endGroupTag;
        private final int initialPos;
        private int limit;
        private int pos;
        private int tag;

        public SafeHeapReader(java.nio.ByteBuffer r3, boolean r4) {
                r2 = this;
                r0 = 0
                r2.<init>(r0)
                r2.bufferIsImmutable = r4
                byte[] r0 = r3.array()
                r2.buffer = r0
                int r0 = r3.arrayOffset()
                int r1 = r3.position()
                int r0 = r0 + r1
                r2.pos = r0
                r2.initialPos = r0
                int r0 = r3.arrayOffset()
                int r1 = r3.limit()
                int r0 = r0 + r1
                r2.limit = r0
                return
        }

        private boolean isAtEnd() {
                r2 = this;
                int r0 = r2.pos
                int r1 = r2.limit
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        private byte readByte() throws java.io.IOException {
                r3 = this;
                int r0 = r3.pos
                int r1 = r3.limit
                if (r0 == r1) goto L11
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + 1
                r3.pos = r2
                r0 = r0[r1]
                return r0
            L11:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        private java.lang.Object readField(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r3, java.lang.Class<?> r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws java.io.IOException {
                r2 = this;
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
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
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
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
                r1.mergeGroupField(r0, r2, r3)
                r2.makeImmutable(r0)
                return r0
        }

        private int readLittleEndian32() throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.requireBytes(r0)
                int r0 = r1.readLittleEndian32_NoCheck()
                return r0
        }

        private int readLittleEndian32_NoCheck() {
                r4 = this;
                int r0 = r4.pos
                byte[] r1 = r4.buffer
                int r2 = r0 + 4
                r4.pos = r2
                r2 = r1[r0]
                r2 = r2 & 255(0xff, float:3.57E-43)
                int r3 = r0 + 1
                r3 = r1[r3]
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 8
                r2 = r2 | r3
                int r3 = r0 + 2
                r3 = r1[r3]
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 16
                r2 = r2 | r3
                int r3 = r0 + 3
                r3 = r1[r3]
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 24
                r2 = r2 | r3
                return r2
        }

        private long readLittleEndian64() throws java.io.IOException {
                r2 = this;
                r0 = 8
                r2.requireBytes(r0)
                long r0 = r2.readLittleEndian64_NoCheck()
                return r0
        }

        private long readLittleEndian64_NoCheck() {
                r9 = this;
                int r0 = r9.pos
                byte[] r1 = r9.buffer
                int r2 = r0 + 8
                r9.pos = r2
                r2 = r1[r0]
                long r2 = (long) r2
                r4 = 255(0xff, double:1.26E-321)
                long r2 = r2 & r4
                int r6 = r0 + 1
                r6 = r1[r6]
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 8
                long r6 = r6 << r8
                long r2 = r2 | r6
                int r6 = r0 + 2
                r6 = r1[r6]
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 16
                long r6 = r6 << r8
                long r2 = r2 | r6
                int r6 = r0 + 3
                r6 = r1[r6]
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 24
                long r6 = r6 << r8
                long r2 = r2 | r6
                int r6 = r0 + 4
                r6 = r1[r6]
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 32
                long r6 = r6 << r8
                long r2 = r2 | r6
                int r6 = r0 + 5
                r6 = r1[r6]
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 40
                long r6 = r6 << r8
                long r2 = r2 | r6
                int r6 = r0 + 6
                r6 = r1[r6]
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 48
                long r6 = r6 << r8
                long r2 = r2 | r6
                int r6 = r0 + 7
                r6 = r1[r6]
                long r6 = (long) r6
                long r4 = r4 & r6
                r6 = 56
                long r4 = r4 << r6
                long r2 = r2 | r4
                return r2
        }

        private <T> T readMessage(com.google.crypto.tink.shaded.protobuf.Schema<T> r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException {
                r1 = this;
                java.lang.Object r0 = r2.newInstance()
                r1.mergeMessageField(r0, r2, r3)
                r2.makeImmutable(r0)
                return r0
        }

        private int readVarint32() throws java.io.IOException {
                r5 = this;
                int r0 = r5.pos
                int r1 = r5.limit
                int r2 = r5.pos
                if (r1 == r2) goto L99
                byte[] r1 = r5.buffer
                int r2 = r0 + 1
                r0 = r1[r0]
                r1 = r0
                if (r0 < 0) goto L14
                r5.pos = r2
                return r1
            L14:
                int r0 = r5.limit
                int r0 = r0 - r2
                r3 = 9
                if (r0 >= r3) goto L21
                long r3 = r5.readVarint64SlowPath()
                int r0 = (int) r3
                return r0
            L21:
                byte[] r0 = r5.buffer
                int r3 = r2 + 1
                r0 = r0[r2]
                int r0 = r0 << 7
                r0 = r0 ^ r1
                r1 = r0
                if (r0 >= 0) goto L31
                r0 = r1 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L96
            L31:
                byte[] r0 = r5.buffer
                int r2 = r3 + 1
                r0 = r0[r3]
                int r0 = r0 << 14
                r0 = r0 ^ r1
                r1 = r0
                if (r0 < 0) goto L41
                r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
                r3 = r2
                goto L96
            L41:
                byte[] r0 = r5.buffer
                int r3 = r2 + 1
                r0 = r0[r2]
                int r0 = r0 << 21
                r0 = r0 ^ r1
                r1 = r0
                if (r0 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L96
            L52:
                byte[] r0 = r5.buffer
                int r2 = r3 + 1
                r0 = r0[r3]
                int r3 = r0 << 28
                r1 = r1 ^ r3
                r3 = 266354560(0xfe03f80, float:2.2112565E-29)
                r1 = r1 ^ r3
                if (r0 >= 0) goto L94
                byte[] r3 = r5.buffer
                int r4 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L91
                byte[] r2 = r5.buffer
                int r3 = r4 + 1
                r2 = r2[r4]
                if (r2 >= 0) goto L8f
                byte[] r2 = r5.buffer
                int r4 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L91
                byte[] r2 = r5.buffer
                int r3 = r4 + 1
                r2 = r2[r4]
                if (r2 >= 0) goto L8f
                byte[] r2 = r5.buffer
                int r4 = r3 + 1
                r2 = r2[r3]
                if (r2 < 0) goto L8a
                goto L91
            L8a:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r2
            L8f:
                r0 = r1
                goto L96
            L91:
                r0 = r1
                r3 = r4
                goto L96
            L94:
                r0 = r1
                r3 = r2
            L96:
                r5.pos = r3
                return r0
            L99:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
        }

        private long readVarint64SlowPath() throws java.io.IOException {
                r6 = this;
                r0 = 0
                r2 = 0
            L3:
                r3 = 64
                if (r2 >= r3) goto L18
                byte r3 = r6.readByte()
                r4 = r3 & 127(0x7f, float:1.78E-43)
                long r4 = (long) r4
                long r4 = r4 << r2
                long r0 = r0 | r4
                r4 = r3 & 128(0x80, float:1.8E-43)
                if (r4 != 0) goto L15
                return r0
            L15:
                int r2 = r2 + 7
                goto L3
            L18:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r2
        }

        private void requireBytes(int r3) throws java.io.IOException {
                r2 = this;
                if (r3 < 0) goto La
                int r0 = r2.limit
                int r1 = r2.pos
                int r0 = r0 - r1
                if (r3 > r0) goto La
                return
            La:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        private void requirePosition(int r2) throws java.io.IOException {
                r1 = this;
                int r0 = r1.pos
                if (r0 != r2) goto L5
                return
            L5:
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

        private void skipBytes(int r2) throws java.io.IOException {
                r1 = this;
                r1.requireBytes(r2)
                int r0 = r1.pos
                int r0 = r0 + r2
                r1.pos = r0
                return
        }

        private void skipGroup() throws java.io.IOException {
                r3 = this;
                int r0 = r3.endGroupTag
                int r1 = r3.tag
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r1)
                r2 = 4
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r1, r2)
                r3.endGroupTag = r1
            Lf:
                int r1 = r3.getFieldNumber()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L1f
                boolean r1 = r3.skipField()
                if (r1 != 0) goto Lf
            L1f:
                int r1 = r3.tag
                int r2 = r3.endGroupTag
                if (r1 != r2) goto L28
                r3.endGroupTag = r0
                return
            L28:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
                throw r1
        }

        private void skipVarint() throws java.io.IOException {
                r5 = this;
                int r0 = r5.limit
                int r1 = r5.pos
                int r0 = r0 - r1
                r1 = 10
                if (r0 < r1) goto L1d
                byte[] r0 = r5.buffer
                int r2 = r5.pos
                r3 = 0
            Le:
                if (r3 >= r1) goto L1d
                int r4 = r2 + 1
                r2 = r0[r2]
                if (r2 < 0) goto L19
                r5.pos = r4
                return
            L19:
                int r3 = r3 + 1
                r2 = r4
                goto Le
            L1d:
                r5.skipVarintSlowPath()
                return
        }

        private void skipVarintSlowPath() throws java.io.IOException {
                r2 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto Lf
                byte r1 = r2.readByte()
                if (r1 < 0) goto Lc
                return
            Lc:
                int r0 = r0 + 1
                goto L1
            Lf:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        private void verifyPackedFixed32Length(int r2) throws java.io.IOException {
                r1 = this;
                r1.requireBytes(r2)
                r0 = r2 & 3
                if (r0 != 0) goto L8
                return
            L8:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
                throw r0
        }

        private void verifyPackedFixed64Length(int r2) throws java.io.IOException {
                r1 = this;
                r1.requireBytes(r2)
                r0 = r2 & 7
                if (r0 != 0) goto L8
                return
            L8:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public int getFieldNumber() throws java.io.IOException {
                r3 = this;
                boolean r0 = r3.isAtEnd()
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == 0) goto La
                return r1
            La:
                int r0 = r3.readVarint32()
                r3.tag = r0
                int r0 = r3.tag
                int r2 = r3.endGroupTag
                if (r0 != r2) goto L17
                return r1
            L17:
                int r0 = r3.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public int getTag() {
                r1 = this;
                int r0 = r1.tag
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryReader
        public int getTotalBytesRead() {
                r2 = this;
                int r0 = r2.pos
                int r1 = r2.initialPos
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public <T> void mergeGroupField(T r4, com.google.crypto.tink.shaded.protobuf.Schema<T> r5, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r6) throws java.io.IOException {
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

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public <T> void mergeMessageField(T r5, com.google.crypto.tink.shaded.protobuf.Schema<T> r6, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r7) throws java.io.IOException {
                r4 = this;
                int r0 = r4.readVarint32()
                r4.requireBytes(r0)
                int r1 = r4.limit
                int r2 = r4.pos
                int r2 = r2 + r0
                r4.limit = r2
                r6.mergeFrom(r5, r4, r7)     // Catch: java.lang.Throwable -> L1e
                int r3 = r4.pos     // Catch: java.lang.Throwable -> L1e
                if (r3 != r2) goto L19
                r4.limit = r1
                return
            L19:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()     // Catch: java.lang.Throwable -> L1e
                throw r3     // Catch: java.lang.Throwable -> L1e
            L1e:
                r3 = move-exception
                r4.limit = r1
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public boolean readBool() throws java.io.IOException {
                r2 = this;
                r0 = 0
                r2.requireWireType(r0)
                int r1 = r2.readVarint32()
                if (r1 == 0) goto Lb
                r0 = 1
            Lb:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public void readBoolList(java.util.List<java.lang.Boolean> r7) throws java.io.IOException {
                r6 = this;
                boolean r0 = r7 instanceof com.google.crypto.tink.shaded.protobuf.BooleanArrayList
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L50
                r0 = r7
                com.google.crypto.tink.shaded.protobuf.BooleanArrayList r0 = (com.google.crypto.tink.shaded.protobuf.BooleanArrayList) r0
                int r3 = r6.tag
                int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r3)
                switch(r3) {
                    case 0: goto L34;
                    case 1: goto L12;
                    case 2: goto L17;
                    default: goto L12;
                }
            L12:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r1
            L17:
                int r3 = r6.readVarint32()
                int r4 = r6.pos
                int r4 = r4 + r3
            L1e:
                int r5 = r6.pos
                if (r5 >= r4) goto L2f
                int r5 = r6.readVarint32()
                if (r5 == 0) goto L2a
                r5 = r1
                goto L2b
            L2a:
                r5 = r2
            L2b:
                r0.addBoolean(r5)
                goto L1e
            L2f:
                r6.requirePosition(r4)
                goto L7e
            L34:
                boolean r1 = r6.readBool()
                r0.addBoolean(r1)
                boolean r1 = r6.isAtEnd()
                if (r1 == 0) goto L42
                return
            L42:
                int r1 = r6.pos
                int r2 = r6.readVarint32()
                int r3 = r6.tag
                if (r2 == r3) goto L4f
                r6.pos = r1
                return
            L4f:
                goto L34
            L50:
                int r0 = r6.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                switch(r0) {
                    case 0: goto L7f;
                    case 1: goto L59;
                    case 2: goto L5e;
                    default: goto L59;
                }
            L59:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            L5e:
                int r0 = r6.readVarint32()
                int r3 = r6.pos
                int r3 = r3 + r0
            L65:
                int r4 = r6.pos
                if (r4 >= r3) goto L7a
                int r4 = r6.readVarint32()
                if (r4 == 0) goto L71
                r4 = r1
                goto L72
            L71:
                r4 = r2
            L72:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                r7.add(r4)
                goto L65
            L7a:
                r6.requirePosition(r3)
            L7e:
                return
            L7f:
                boolean r0 = r6.readBool()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r7.add(r0)
                boolean r0 = r6.isAtEnd()
                if (r0 == 0) goto L91
                return
            L91:
                int r0 = r6.pos
                int r1 = r6.readVarint32()
                int r2 = r6.tag
                if (r1 == r2) goto L9e
                r6.pos = r0
                return
            L9e:
                goto L7f
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public com.google.crypto.tink.shaded.protobuf.ByteString readBytes() throws java.io.IOException {
                r3 = this;
                r0 = 2
                r3.requireWireType(r0)
                int r0 = r3.readVarint32()
                if (r0 != 0) goto Ld
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
                return r1
            Ld:
                r3.requireBytes(r0)
                boolean r1 = r3.bufferIsImmutable
                if (r1 == 0) goto L1d
                byte[] r1 = r3.buffer
                int r2 = r3.pos
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r1, r2, r0)
                goto L25
            L1d:
                byte[] r1 = r3.buffer
                int r2 = r3.pos
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1, r2, r0)
            L25:
                int r2 = r3.pos
                int r2 = r2 + r0
                r3.pos = r2
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public void readBytesList(java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> r4) throws java.io.IOException {
                r3 = this;
                int r0 = r3.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                r1 = 2
                if (r0 != r1) goto L25
            L9:
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.readBytes()
                r4.add(r0)
                boolean r0 = r3.isAtEnd()
                if (r0 == 0) goto L17
                return
            L17:
                int r0 = r3.pos
                int r1 = r3.readVarint32()
                int r2 = r3.tag
                if (r1 == r2) goto L24
                r3.pos = r0
                return
            L24:
                goto L9
            L25:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public double readDouble() throws java.io.IOException {
                r2 = this;
                r0 = 1
                r2.requireWireType(r0)
                long r0 = r2.readLittleEndian64()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public void readDoubleList(java.util.List<java.lang.Double> r6) throws java.io.IOException {
                r5 = this;
                boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.DoubleArrayList
                if (r0 == 0) goto L4c
                r0 = r6
                com.google.crypto.tink.shaded.protobuf.DoubleArrayList r0 = (com.google.crypto.tink.shaded.protobuf.DoubleArrayList) r0
                int r1 = r5.tag
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
                switch(r1) {
                    case 1: goto L30;
                    case 2: goto L15;
                    default: goto L10;
                }
            L10:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r1
            L15:
                int r1 = r5.readVarint32()
                r5.verifyPackedFixed64Length(r1)
                int r2 = r5.pos
                int r2 = r2 + r1
            L1f:
                int r3 = r5.pos
                if (r3 >= r2) goto L2f
                long r3 = r5.readLittleEndian64_NoCheck()
                double r3 = java.lang.Double.longBitsToDouble(r3)
                r0.addDouble(r3)
                goto L1f
            L2f:
                goto L78
            L30:
                double r1 = r5.readDouble()
                r0.addDouble(r1)
                boolean r1 = r5.isAtEnd()
                if (r1 == 0) goto L3e
                return
            L3e:
                int r1 = r5.pos
                int r2 = r5.readVarint32()
                int r3 = r5.tag
                if (r2 == r3) goto L4b
                r5.pos = r1
                return
            L4b:
                goto L30
            L4c:
                int r0 = r5.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                switch(r0) {
                    case 1: goto L79;
                    case 2: goto L5a;
                    default: goto L55;
                }
            L55:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            L5a:
                int r0 = r5.readVarint32()
                r5.verifyPackedFixed64Length(r0)
                int r1 = r5.pos
                int r1 = r1 + r0
            L64:
                int r2 = r5.pos
                if (r2 >= r1) goto L78
                long r2 = r5.readLittleEndian64_NoCheck()
                double r2 = java.lang.Double.longBitsToDouble(r2)
                java.lang.Double r2 = java.lang.Double.valueOf(r2)
                r6.add(r2)
                goto L64
            L78:
                return
            L79:
                double r0 = r5.readDouble()
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                r6.add(r0)
                boolean r0 = r5.isAtEnd()
                if (r0 == 0) goto L8b
                return
            L8b:
                int r0 = r5.pos
                int r1 = r5.readVarint32()
                int r2 = r5.tag
                if (r1 == r2) goto L98
                r5.pos = r0
                return
            L98:
                goto L79
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public int readEnum() throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.requireWireType(r0)
                int r0 = r1.readVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public void readEnumList(java.util.List<java.lang.Integer> r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
                if (r0 == 0) goto L45
                r0 = r5
                com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r0
                int r1 = r4.tag
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
                switch(r1) {
                    case 0: goto L29;
                    case 1: goto L10;
                    case 2: goto L15;
                    default: goto L10;
                }
            L10:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r1
            L15:
                int r1 = r4.readVarint32()
                int r2 = r4.pos
                int r2 = r2 + r1
            L1c:
                int r3 = r4.pos
                if (r3 >= r2) goto L28
                int r3 = r4.readVarint32()
                r0.addInt(r3)
                goto L1c
            L28:
                goto L6a
            L29:
                int r1 = r4.readEnum()
                r0.addInt(r1)
                boolean r1 = r4.isAtEnd()
                if (r1 == 0) goto L37
                return
            L37:
                int r1 = r4.pos
                int r2 = r4.readVarint32()
                int r3 = r4.tag
                if (r2 == r3) goto L44
                r4.pos = r1
                return
            L44:
                goto L29
            L45:
                int r0 = r4.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                switch(r0) {
                    case 0: goto L6b;
                    case 1: goto L4e;
                    case 2: goto L53;
                    default: goto L4e;
                }
            L4e:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            L53:
                int r0 = r4.readVarint32()
                int r1 = r4.pos
                int r1 = r1 + r0
            L5a:
                int r2 = r4.pos
                if (r2 >= r1) goto L6a
                int r2 = r4.readVarint32()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5.add(r2)
                goto L5a
            L6a:
                return
            L6b:
                int r0 = r4.readEnum()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r5.add(r0)
                boolean r0 = r4.isAtEnd()
                if (r0 == 0) goto L7d
                return
            L7d:
                int r0 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L8a
                r4.pos = r0
                return
            L8a:
                goto L6b
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public int readFixed32() throws java.io.IOException {
                r1 = this;
                r0 = 5
                r1.requireWireType(r0)
                int r0 = r1.readLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public void readFixed32List(java.util.List<java.lang.Integer> r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
                if (r0 == 0) goto L48
                r0 = r5
                com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r0
                int r1 = r4.tag
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
                switch(r1) {
                    case 2: goto L31;
                    case 5: goto L15;
                    default: goto L10;
                }
            L10:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r1
            L15:
                int r1 = r4.readFixed32()
                r0.addInt(r1)
                boolean r1 = r4.isAtEnd()
                if (r1 == 0) goto L23
                return
            L23:
                int r1 = r4.pos
                int r2 = r4.readVarint32()
                int r3 = r4.tag
                if (r2 == r3) goto L30
                r4.pos = r1
                return
            L30:
                goto L15
            L31:
                int r1 = r4.readVarint32()
                r4.verifyPackedFixed32Length(r1)
                int r2 = r4.pos
                int r2 = r2 + r1
            L3b:
                int r3 = r4.pos
                if (r3 >= r2) goto L47
                int r3 = r4.readLittleEndian32_NoCheck()
                r0.addInt(r3)
                goto L3b
            L47:
                goto L90
            L48:
                int r0 = r4.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                switch(r0) {
                    case 2: goto L76;
                    case 5: goto L56;
                    default: goto L51;
                }
            L51:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            L56:
                int r0 = r4.readFixed32()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r5.add(r0)
                boolean r0 = r4.isAtEnd()
                if (r0 == 0) goto L68
                return
            L68:
                int r0 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L75
                r4.pos = r0
                return
            L75:
                goto L56
            L76:
                int r0 = r4.readVarint32()
                r4.verifyPackedFixed32Length(r0)
                int r1 = r4.pos
                int r1 = r1 + r0
            L80:
                int r2 = r4.pos
                if (r2 >= r1) goto L90
                int r2 = r4.readLittleEndian32_NoCheck()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5.add(r2)
                goto L80
            L90:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public long readFixed64() throws java.io.IOException {
                r2 = this;
                r0 = 1
                r2.requireWireType(r0)
                long r0 = r2.readLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public void readFixed64List(java.util.List<java.lang.Long> r6) throws java.io.IOException {
                r5 = this;
                boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
                if (r0 == 0) goto L48
                r0 = r6
                com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r0
                int r1 = r5.tag
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
                switch(r1) {
                    case 1: goto L2c;
                    case 2: goto L15;
                    default: goto L10;
                }
            L10:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r1
            L15:
                int r1 = r5.readVarint32()
                r5.verifyPackedFixed64Length(r1)
                int r2 = r5.pos
                int r2 = r2 + r1
            L1f:
                int r3 = r5.pos
                if (r3 >= r2) goto L2b
                long r3 = r5.readLittleEndian64_NoCheck()
                r0.addLong(r3)
                goto L1f
            L2b:
                goto L70
            L2c:
                long r1 = r5.readFixed64()
                r0.addLong(r1)
                boolean r1 = r5.isAtEnd()
                if (r1 == 0) goto L3a
                return
            L3a:
                int r1 = r5.pos
                int r2 = r5.readVarint32()
                int r3 = r5.tag
                if (r2 == r3) goto L47
                r5.pos = r1
                return
            L47:
                goto L2c
            L48:
                int r0 = r5.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                switch(r0) {
                    case 1: goto L71;
                    case 2: goto L56;
                    default: goto L51;
                }
            L51:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            L56:
                int r0 = r5.readVarint32()
                r5.verifyPackedFixed64Length(r0)
                int r1 = r5.pos
                int r1 = r1 + r0
            L60:
                int r2 = r5.pos
                if (r2 >= r1) goto L70
                long r2 = r5.readLittleEndian64_NoCheck()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r6.add(r2)
                goto L60
            L70:
                return
            L71:
                long r0 = r5.readFixed64()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r6.add(r0)
                boolean r0 = r5.isAtEnd()
                if (r0 == 0) goto L83
                return
            L83:
                int r0 = r5.pos
                int r1 = r5.readVarint32()
                int r2 = r5.tag
                if (r1 == r2) goto L90
                r5.pos = r0
                return
            L90:
                goto L71
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public float readFloat() throws java.io.IOException {
                r1 = this;
                r0 = 5
                r1.requireWireType(r0)
                int r0 = r1.readLittleEndian32()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public void readFloatList(java.util.List<java.lang.Float> r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.FloatArrayList
                if (r0 == 0) goto L4c
                r0 = r5
                com.google.crypto.tink.shaded.protobuf.FloatArrayList r0 = (com.google.crypto.tink.shaded.protobuf.FloatArrayList) r0
                int r1 = r4.tag
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
                switch(r1) {
                    case 2: goto L31;
                    case 5: goto L15;
                    default: goto L10;
                }
            L10:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r1
            L15:
                float r1 = r4.readFloat()
                r0.addFloat(r1)
                boolean r1 = r4.isAtEnd()
                if (r1 == 0) goto L23
                return
            L23:
                int r1 = r4.pos
                int r2 = r4.readVarint32()
                int r3 = r4.tag
                if (r2 == r3) goto L30
                r4.pos = r1
                return
            L30:
                goto L15
            L31:
                int r1 = r4.readVarint32()
                r4.verifyPackedFixed32Length(r1)
                int r2 = r4.pos
                int r2 = r2 + r1
            L3b:
                int r3 = r4.pos
                if (r3 >= r2) goto L4b
                int r3 = r4.readLittleEndian32_NoCheck()
                float r3 = java.lang.Float.intBitsToFloat(r3)
                r0.addFloat(r3)
                goto L3b
            L4b:
                goto L98
            L4c:
                int r0 = r4.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                switch(r0) {
                    case 2: goto L7a;
                    case 5: goto L5a;
                    default: goto L55;
                }
            L55:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            L5a:
                float r0 = r4.readFloat()
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                r5.add(r0)
                boolean r0 = r4.isAtEnd()
                if (r0 == 0) goto L6c
                return
            L6c:
                int r0 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L79
                r4.pos = r0
                return
            L79:
                goto L5a
            L7a:
                int r0 = r4.readVarint32()
                r4.verifyPackedFixed32Length(r0)
                int r1 = r4.pos
                int r1 = r1 + r0
            L84:
                int r2 = r4.pos
                if (r2 >= r1) goto L98
                int r2 = r4.readLittleEndian32_NoCheck()
                float r2 = java.lang.Float.intBitsToFloat(r2)
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r5.add(r2)
                goto L84
            L98:
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
        public <T> void readGroupList(java.util.List<T> r4, com.google.crypto.tink.shaded.protobuf.Schema<T> r5, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r6) throws java.io.IOException {
                r3 = this;
                int r0 = r3.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                r1 = 3
                if (r0 != r1) goto L25
                int r0 = r3.tag
            Lb:
                java.lang.Object r1 = r3.readGroup(r5, r6)
                r4.add(r1)
                boolean r1 = r3.isAtEnd()
                if (r1 == 0) goto L19
                return
            L19:
                int r1 = r3.pos
                int r2 = r3.readVarint32()
                if (r2 == r0) goto L24
                r3.pos = r1
                return
            L24:
                goto Lb
            L25:
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
                int r0 = r1.readVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public void readInt32List(java.util.List<java.lang.Integer> r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
                if (r0 == 0) goto L49
                r0 = r5
                com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r0
                int r1 = r4.tag
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
                switch(r1) {
                    case 0: goto L2d;
                    case 1: goto L10;
                    case 2: goto L15;
                    default: goto L10;
                }
            L10:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r1
            L15:
                int r1 = r4.readVarint32()
                int r2 = r4.pos
                int r2 = r2 + r1
            L1c:
                int r3 = r4.pos
                if (r3 >= r2) goto L28
                int r3 = r4.readVarint32()
                r0.addInt(r3)
                goto L1c
            L28:
                r4.requirePosition(r2)
                goto L72
            L2d:
                int r1 = r4.readInt32()
                r0.addInt(r1)
                boolean r1 = r4.isAtEnd()
                if (r1 == 0) goto L3b
                return
            L3b:
                int r1 = r4.pos
                int r2 = r4.readVarint32()
                int r3 = r4.tag
                if (r2 == r3) goto L48
                r4.pos = r1
                return
            L48:
                goto L2d
            L49:
                int r0 = r4.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                switch(r0) {
                    case 0: goto L73;
                    case 1: goto L52;
                    case 2: goto L57;
                    default: goto L52;
                }
            L52:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            L57:
                int r0 = r4.readVarint32()
                int r1 = r4.pos
                int r1 = r1 + r0
            L5e:
                int r2 = r4.pos
                if (r2 >= r1) goto L6e
                int r2 = r4.readVarint32()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5.add(r2)
                goto L5e
            L6e:
                r4.requirePosition(r1)
            L72:
                return
            L73:
                int r0 = r4.readInt32()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r5.add(r0)
                boolean r0 = r4.isAtEnd()
                if (r0 == 0) goto L85
                return
            L85:
                int r0 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L92
                r4.pos = r0
                return
            L92:
                goto L73
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public long readInt64() throws java.io.IOException {
                r2 = this;
                r0 = 0
                r2.requireWireType(r0)
                long r0 = r2.readVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public void readInt64List(java.util.List<java.lang.Long> r6) throws java.io.IOException {
                r5 = this;
                boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
                if (r0 == 0) goto L49
                r0 = r6
                com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r0
                int r1 = r5.tag
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
                switch(r1) {
                    case 0: goto L2d;
                    case 1: goto L10;
                    case 2: goto L15;
                    default: goto L10;
                }
            L10:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r1
            L15:
                int r1 = r5.readVarint32()
                int r2 = r5.pos
                int r2 = r2 + r1
            L1c:
                int r3 = r5.pos
                if (r3 >= r2) goto L28
                long r3 = r5.readVarint64()
                r0.addLong(r3)
                goto L1c
            L28:
                r5.requirePosition(r2)
                goto L72
            L2d:
                long r1 = r5.readInt64()
                r0.addLong(r1)
                boolean r1 = r5.isAtEnd()
                if (r1 == 0) goto L3b
                return
            L3b:
                int r1 = r5.pos
                int r2 = r5.readVarint32()
                int r3 = r5.tag
                if (r2 == r3) goto L48
                r5.pos = r1
                return
            L48:
                goto L2d
            L49:
                int r0 = r5.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                switch(r0) {
                    case 0: goto L73;
                    case 1: goto L52;
                    case 2: goto L57;
                    default: goto L52;
                }
            L52:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            L57:
                int r0 = r5.readVarint32()
                int r1 = r5.pos
                int r1 = r1 + r0
            L5e:
                int r2 = r5.pos
                if (r2 >= r1) goto L6e
                long r2 = r5.readVarint64()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r6.add(r2)
                goto L5e
            L6e:
                r5.requirePosition(r1)
            L72:
                return
            L73:
                long r0 = r5.readInt64()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r6.add(r0)
                boolean r0 = r5.isAtEnd()
                if (r0 == 0) goto L85
                return
            L85:
                int r0 = r5.pos
                int r1 = r5.readVarint32()
                int r2 = r5.tag
                if (r1 == r2) goto L92
                r5.pos = r0
                return
            L92:
                goto L73
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public <K, V> void readMap(java.util.Map<K, V> r10, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r11, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r12) throws java.io.IOException {
                r9 = this;
                r0 = 2
                r9.requireWireType(r0)
                int r0 = r9.readVarint32()
                r9.requireBytes(r0)
                int r1 = r9.limit
                int r2 = r9.pos
                int r2 = r2 + r0
                r9.limit = r2
                K r3 = r11.defaultKey     // Catch: java.lang.Throwable -> L61
                V r4 = r11.defaultValue     // Catch: java.lang.Throwable -> L61
            L16:
                int r5 = r9.getFieldNumber()     // Catch: java.lang.Throwable -> L61
                r6 = 2147483647(0x7fffffff, float:NaN)
                if (r5 != r6) goto L28
            L20:
                r10.put(r3, r4)     // Catch: java.lang.Throwable -> L61
                r9.limit = r1
                return
            L28:
                java.lang.String r6 = "Unable to parse map entry."
                switch(r5) {
                    case 1: goto L40;
                    case 2: goto L32;
                    default: goto L2d;
                }
            L2d:
                boolean r7 = r9.skipField()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L49 java.lang.Throwable -> L61
                goto L4b
            L32:
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r7 = r11.valueType     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L49 java.lang.Throwable -> L61
                V r8 = r11.defaultValue     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L49 java.lang.Throwable -> L61
                java.lang.Class r8 = r8.getClass()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L49 java.lang.Throwable -> L61
                java.lang.Object r6 = r9.readField(r7, r8, r12)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L49 java.lang.Throwable -> L61
                r4 = r6
                goto L4d
            L40:
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r7 = r11.keyType     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L49 java.lang.Throwable -> L61
                r8 = 0
                java.lang.Object r6 = r9.readField(r7, r8, r8)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L49 java.lang.Throwable -> L61
                r3 = r6
                goto L4d
            L49:
                r7 = move-exception
                goto L54
            L4b:
                if (r7 == 0) goto L4e
            L4d:
                goto L5a
            L4e:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r7 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L49 java.lang.Throwable -> L61
                r7.<init>(r6)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L49 java.lang.Throwable -> L61
                throw r7     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L49 java.lang.Throwable -> L61
            L54:
                boolean r8 = r9.skipField()     // Catch: java.lang.Throwable -> L61
                if (r8 == 0) goto L5b
            L5a:
                goto L16
            L5b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L61
                r8.<init>(r6)     // Catch: java.lang.Throwable -> L61
                throw r8     // Catch: java.lang.Throwable -> L61
            L61:
                r3 = move-exception
                r9.limit = r1
                throw r3
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
        public <T> void readMessageList(java.util.List<T> r4, com.google.crypto.tink.shaded.protobuf.Schema<T> r5, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r6) throws java.io.IOException {
                r3 = this;
                int r0 = r3.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                r1 = 2
                if (r0 != r1) goto L25
                int r0 = r3.tag
            Lb:
                java.lang.Object r1 = r3.readMessage(r5, r6)
                r4.add(r1)
                boolean r1 = r3.isAtEnd()
                if (r1 == 0) goto L19
                return
            L19:
                int r1 = r3.pos
                int r2 = r3.readVarint32()
                if (r2 == r0) goto L24
                r3.pos = r1
                return
            L24:
                goto Lb
            L25:
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
                int r0 = r1.readLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public void readSFixed32List(java.util.List<java.lang.Integer> r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
                if (r0 == 0) goto L48
                r0 = r5
                com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r0
                int r1 = r4.tag
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
                switch(r1) {
                    case 2: goto L31;
                    case 5: goto L15;
                    default: goto L10;
                }
            L10:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r1
            L15:
                int r1 = r4.readSFixed32()
                r0.addInt(r1)
                boolean r1 = r4.isAtEnd()
                if (r1 == 0) goto L23
                return
            L23:
                int r1 = r4.pos
                int r2 = r4.readVarint32()
                int r3 = r4.tag
                if (r2 == r3) goto L30
                r4.pos = r1
                return
            L30:
                goto L15
            L31:
                int r1 = r4.readVarint32()
                r4.verifyPackedFixed32Length(r1)
                int r2 = r4.pos
                int r2 = r2 + r1
            L3b:
                int r3 = r4.pos
                if (r3 >= r2) goto L47
                int r3 = r4.readLittleEndian32_NoCheck()
                r0.addInt(r3)
                goto L3b
            L47:
                goto L90
            L48:
                int r0 = r4.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                switch(r0) {
                    case 2: goto L76;
                    case 5: goto L56;
                    default: goto L51;
                }
            L51:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            L56:
                int r0 = r4.readSFixed32()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r5.add(r0)
                boolean r0 = r4.isAtEnd()
                if (r0 == 0) goto L68
                return
            L68:
                int r0 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L75
                r4.pos = r0
                return
            L75:
                goto L56
            L76:
                int r0 = r4.readVarint32()
                r4.verifyPackedFixed32Length(r0)
                int r1 = r4.pos
                int r1 = r1 + r0
            L80:
                int r2 = r4.pos
                if (r2 >= r1) goto L90
                int r2 = r4.readLittleEndian32_NoCheck()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5.add(r2)
                goto L80
            L90:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public long readSFixed64() throws java.io.IOException {
                r2 = this;
                r0 = 1
                r2.requireWireType(r0)
                long r0 = r2.readLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public void readSFixed64List(java.util.List<java.lang.Long> r6) throws java.io.IOException {
                r5 = this;
                boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
                if (r0 == 0) goto L48
                r0 = r6
                com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r0
                int r1 = r5.tag
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
                switch(r1) {
                    case 1: goto L2c;
                    case 2: goto L15;
                    default: goto L10;
                }
            L10:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r1
            L15:
                int r1 = r5.readVarint32()
                r5.verifyPackedFixed64Length(r1)
                int r2 = r5.pos
                int r2 = r2 + r1
            L1f:
                int r3 = r5.pos
                if (r3 >= r2) goto L2b
                long r3 = r5.readLittleEndian64_NoCheck()
                r0.addLong(r3)
                goto L1f
            L2b:
                goto L70
            L2c:
                long r1 = r5.readSFixed64()
                r0.addLong(r1)
                boolean r1 = r5.isAtEnd()
                if (r1 == 0) goto L3a
                return
            L3a:
                int r1 = r5.pos
                int r2 = r5.readVarint32()
                int r3 = r5.tag
                if (r2 == r3) goto L47
                r5.pos = r1
                return
            L47:
                goto L2c
            L48:
                int r0 = r5.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                switch(r0) {
                    case 1: goto L71;
                    case 2: goto L56;
                    default: goto L51;
                }
            L51:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            L56:
                int r0 = r5.readVarint32()
                r5.verifyPackedFixed64Length(r0)
                int r1 = r5.pos
                int r1 = r1 + r0
            L60:
                int r2 = r5.pos
                if (r2 >= r1) goto L70
                long r2 = r5.readLittleEndian64_NoCheck()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r6.add(r2)
                goto L60
            L70:
                return
            L71:
                long r0 = r5.readSFixed64()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r6.add(r0)
                boolean r0 = r5.isAtEnd()
                if (r0 == 0) goto L83
                return
            L83:
                int r0 = r5.pos
                int r1 = r5.readVarint32()
                int r2 = r5.tag
                if (r1 == r2) goto L90
                r5.pos = r0
                return
            L90:
                goto L71
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public int readSInt32() throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.requireWireType(r0)
                int r0 = r1.readVarint32()
                int r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag32(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public void readSInt32List(java.util.List<java.lang.Integer> r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
                if (r0 == 0) goto L49
                r0 = r5
                com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r0
                int r1 = r4.tag
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
                switch(r1) {
                    case 0: goto L2d;
                    case 1: goto L10;
                    case 2: goto L15;
                    default: goto L10;
                }
            L10:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r1
            L15:
                int r1 = r4.readVarint32()
                int r2 = r4.pos
                int r2 = r2 + r1
            L1c:
                int r3 = r4.pos
                if (r3 >= r2) goto L2c
                int r3 = r4.readVarint32()
                int r3 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag32(r3)
                r0.addInt(r3)
                goto L1c
            L2c:
                goto L72
            L2d:
                int r1 = r4.readSInt32()
                r0.addInt(r1)
                boolean r1 = r4.isAtEnd()
                if (r1 == 0) goto L3b
                return
            L3b:
                int r1 = r4.pos
                int r2 = r4.readVarint32()
                int r3 = r4.tag
                if (r2 == r3) goto L48
                r4.pos = r1
                return
            L48:
                goto L2d
            L49:
                int r0 = r4.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                switch(r0) {
                    case 0: goto L73;
                    case 1: goto L52;
                    case 2: goto L57;
                    default: goto L52;
                }
            L52:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            L57:
                int r0 = r4.readVarint32()
                int r1 = r4.pos
                int r1 = r1 + r0
            L5e:
                int r2 = r4.pos
                if (r2 >= r1) goto L72
                int r2 = r4.readVarint32()
                int r2 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag32(r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5.add(r2)
                goto L5e
            L72:
                return
            L73:
                int r0 = r4.readSInt32()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r5.add(r0)
                boolean r0 = r4.isAtEnd()
                if (r0 == 0) goto L85
                return
            L85:
                int r0 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L92
                r4.pos = r0
                return
            L92:
                goto L73
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public long readSInt64() throws java.io.IOException {
                r2 = this;
                r0 = 0
                r2.requireWireType(r0)
                long r0 = r2.readVarint64()
                long r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag64(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public void readSInt64List(java.util.List<java.lang.Long> r6) throws java.io.IOException {
                r5 = this;
                boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
                if (r0 == 0) goto L49
                r0 = r6
                com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r0
                int r1 = r5.tag
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
                switch(r1) {
                    case 0: goto L2d;
                    case 1: goto L10;
                    case 2: goto L15;
                    default: goto L10;
                }
            L10:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r1
            L15:
                int r1 = r5.readVarint32()
                int r2 = r5.pos
                int r2 = r2 + r1
            L1c:
                int r3 = r5.pos
                if (r3 >= r2) goto L2c
                long r3 = r5.readVarint64()
                long r3 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag64(r3)
                r0.addLong(r3)
                goto L1c
            L2c:
                goto L72
            L2d:
                long r1 = r5.readSInt64()
                r0.addLong(r1)
                boolean r1 = r5.isAtEnd()
                if (r1 == 0) goto L3b
                return
            L3b:
                int r1 = r5.pos
                int r2 = r5.readVarint32()
                int r3 = r5.tag
                if (r2 == r3) goto L48
                r5.pos = r1
                return
            L48:
                goto L2d
            L49:
                int r0 = r5.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                switch(r0) {
                    case 0: goto L73;
                    case 1: goto L52;
                    case 2: goto L57;
                    default: goto L52;
                }
            L52:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            L57:
                int r0 = r5.readVarint32()
                int r1 = r5.pos
                int r1 = r1 + r0
            L5e:
                int r2 = r5.pos
                if (r2 >= r1) goto L72
                long r2 = r5.readVarint64()
                long r2 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag64(r2)
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r6.add(r2)
                goto L5e
            L72:
                return
            L73:
                long r0 = r5.readSInt64()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r6.add(r0)
                boolean r0 = r5.isAtEnd()
                if (r0 == 0) goto L85
                return
            L85:
                int r0 = r5.pos
                int r1 = r5.readVarint32()
                int r2 = r5.tag
                if (r1 == r2) goto L92
                r5.pos = r0
                return
            L92:
                goto L73
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public java.lang.String readString() throws java.io.IOException {
                r1 = this;
                r0 = 0
                java.lang.String r0 = r1.readStringInternal(r0)
                return r0
        }

        public java.lang.String readStringInternal(boolean r6) throws java.io.IOException {
                r5 = this;
                r0 = 2
                r5.requireWireType(r0)
                int r0 = r5.readVarint32()
                if (r0 != 0) goto Ld
                java.lang.String r1 = ""
                return r1
            Ld:
                r5.requireBytes(r0)
                if (r6 == 0) goto L25
                byte[] r1 = r5.buffer
                int r2 = r5.pos
                int r3 = r5.pos
                int r3 = r3 + r0
                boolean r1 = com.google.crypto.tink.shaded.protobuf.Utf8.isValidUtf8(r1, r2, r3)
                if (r1 == 0) goto L20
                goto L25
            L20:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r1
            L25:
                java.lang.String r1 = new java.lang.String
                byte[] r2 = r5.buffer
                int r3 = r5.pos
                java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                r1.<init>(r2, r3, r0, r4)
                int r2 = r5.pos
                int r2 = r2 + r0
                r5.pos = r2
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public void readStringList(java.util.List<java.lang.String> r2) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.readStringListInternal(r2, r0)
                return
        }

        public void readStringListInternal(java.util.List<java.lang.String> r5, boolean r6) throws java.io.IOException {
                r4 = this;
                int r0 = r4.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                r1 = 2
                if (r0 != r1) goto L4a
                boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList
                if (r0 == 0) goto L2e
                if (r6 != 0) goto L2e
                r0 = r5
                com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = (com.google.crypto.tink.shaded.protobuf.LazyStringList) r0
            L12:
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = r4.readBytes()
                r0.add(r1)
                boolean r1 = r4.isAtEnd()
                if (r1 == 0) goto L20
                return
            L20:
                int r1 = r4.pos
                int r2 = r4.readVarint32()
                int r3 = r4.tag
                if (r2 == r3) goto L2d
                r4.pos = r1
                return
            L2d:
                goto L12
            L2e:
                java.lang.String r0 = r4.readStringInternal(r6)
                r5.add(r0)
                boolean r0 = r4.isAtEnd()
                if (r0 == 0) goto L3c
                return
            L3c:
                int r0 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L49
                r4.pos = r0
                return
            L49:
                goto L2e
            L4a:
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
                r0 = 1
                java.lang.String r0 = r1.readStringInternal(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public int readUInt32() throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.requireWireType(r0)
                int r0 = r1.readVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public void readUInt32List(java.util.List<java.lang.Integer> r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
                if (r0 == 0) goto L45
                r0 = r5
                com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r0
                int r1 = r4.tag
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
                switch(r1) {
                    case 0: goto L29;
                    case 1: goto L10;
                    case 2: goto L15;
                    default: goto L10;
                }
            L10:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r1
            L15:
                int r1 = r4.readVarint32()
                int r2 = r4.pos
                int r2 = r2 + r1
            L1c:
                int r3 = r4.pos
                if (r3 >= r2) goto L28
                int r3 = r4.readVarint32()
                r0.addInt(r3)
                goto L1c
            L28:
                goto L6a
            L29:
                int r1 = r4.readUInt32()
                r0.addInt(r1)
                boolean r1 = r4.isAtEnd()
                if (r1 == 0) goto L37
                return
            L37:
                int r1 = r4.pos
                int r2 = r4.readVarint32()
                int r3 = r4.tag
                if (r2 == r3) goto L44
                r4.pos = r1
                return
            L44:
                goto L29
            L45:
                int r0 = r4.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                switch(r0) {
                    case 0: goto L6b;
                    case 1: goto L4e;
                    case 2: goto L53;
                    default: goto L4e;
                }
            L4e:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            L53:
                int r0 = r4.readVarint32()
                int r1 = r4.pos
                int r1 = r1 + r0
            L5a:
                int r2 = r4.pos
                if (r2 >= r1) goto L6a
                int r2 = r4.readVarint32()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5.add(r2)
                goto L5a
            L6a:
                return
            L6b:
                int r0 = r4.readUInt32()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r5.add(r0)
                boolean r0 = r4.isAtEnd()
                if (r0 == 0) goto L7d
                return
            L7d:
                int r0 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L8a
                r4.pos = r0
                return
            L8a:
                goto L6b
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public long readUInt64() throws java.io.IOException {
                r2 = this;
                r0 = 0
                r2.requireWireType(r0)
                long r0 = r2.readVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public void readUInt64List(java.util.List<java.lang.Long> r6) throws java.io.IOException {
                r5 = this;
                boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
                if (r0 == 0) goto L49
                r0 = r6
                com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r0
                int r1 = r5.tag
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
                switch(r1) {
                    case 0: goto L2d;
                    case 1: goto L10;
                    case 2: goto L15;
                    default: goto L10;
                }
            L10:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r1
            L15:
                int r1 = r5.readVarint32()
                int r2 = r5.pos
                int r2 = r2 + r1
            L1c:
                int r3 = r5.pos
                if (r3 >= r2) goto L28
                long r3 = r5.readVarint64()
                r0.addLong(r3)
                goto L1c
            L28:
                r5.requirePosition(r2)
                goto L72
            L2d:
                long r1 = r5.readUInt64()
                r0.addLong(r1)
                boolean r1 = r5.isAtEnd()
                if (r1 == 0) goto L3b
                return
            L3b:
                int r1 = r5.pos
                int r2 = r5.readVarint32()
                int r3 = r5.tag
                if (r2 == r3) goto L48
                r5.pos = r1
                return
            L48:
                goto L2d
            L49:
                int r0 = r5.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                switch(r0) {
                    case 0: goto L73;
                    case 1: goto L52;
                    case 2: goto L57;
                    default: goto L52;
                }
            L52:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            L57:
                int r0 = r5.readVarint32()
                int r1 = r5.pos
                int r1 = r1 + r0
            L5e:
                int r2 = r5.pos
                if (r2 >= r1) goto L6e
                long r2 = r5.readVarint64()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r6.add(r2)
                goto L5e
            L6e:
                r5.requirePosition(r1)
            L72:
                return
            L73:
                long r0 = r5.readUInt64()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r6.add(r0)
                boolean r0 = r5.isAtEnd()
                if (r0 == 0) goto L85
                return
            L85:
                int r0 = r5.pos
                int r1 = r5.readVarint32()
                int r2 = r5.tag
                if (r1 == r2) goto L92
                r5.pos = r0
                return
            L92:
                goto L73
        }

        public long readVarint64() throws java.io.IOException {
                r10 = this;
                int r0 = r10.pos
                int r1 = r10.limit
                if (r1 == r0) goto Lcc
                byte[] r1 = r10.buffer
                int r2 = r0 + 1
                r0 = r1[r0]
                r3 = r0
                if (r0 < 0) goto L13
                r10.pos = r2
                long r4 = (long) r3
                return r4
            L13:
                int r0 = r10.limit
                int r0 = r0 - r2
                r4 = 9
                if (r0 >= r4) goto L1f
                long r4 = r10.readVarint64SlowPath()
                return r4
            L1f:
                int r0 = r2 + 1
                r2 = r1[r2]
                int r2 = r2 << 7
                r2 = r2 ^ r3
                r3 = r2
                if (r2 >= 0) goto L2e
                r2 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
                long r4 = (long) r2
                goto Lc9
            L2e:
                int r2 = r0 + 1
                r0 = r1[r0]
                int r0 = r0 << 14
                r0 = r0 ^ r3
                r3 = r0
                if (r0 < 0) goto L3e
                r0 = r3 ^ 16256(0x3f80, float:2.278E-41)
                long r4 = (long) r0
                r0 = r2
                goto Lc9
            L3e:
                int r0 = r2 + 1
                r2 = r1[r2]
                int r2 = r2 << 21
                r2 = r2 ^ r3
                r3 = r2
                if (r2 >= 0) goto L4f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r2 = r2 ^ r3
                long r4 = (long) r2
                goto Lc9
            L4f:
                long r4 = (long) r3
                int r2 = r0 + 1
                r0 = r1[r0]
                long r6 = (long) r0
                r0 = 28
                long r6 = r6 << r0
                long r4 = r4 ^ r6
                r6 = r4
                r8 = 0
                int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r0 < 0) goto L66
                r4 = 266354560(0xfe03f80, double:1.315966377E-315)
                long r4 = r4 ^ r6
                r0 = r2
                goto Lc9
            L66:
                int r0 = r2 + 1
                r2 = r1[r2]
                long r4 = (long) r2
                r2 = 35
                long r4 = r4 << r2
                long r4 = r4 ^ r6
                r6 = r4
                int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r2 >= 0) goto L7b
                r4 = -34093383808(0xfffffff80fe03f80, double:NaN)
                long r4 = r4 ^ r6
                goto Lc9
            L7b:
                int r2 = r0 + 1
                r0 = r1[r0]
                long r4 = (long) r0
                r0 = 42
                long r4 = r4 << r0
                long r4 = r4 ^ r6
                r6 = r4
                int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r0 < 0) goto L91
                r4 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                long r4 = r4 ^ r6
                r0 = r2
                goto Lc9
            L91:
                int r0 = r2 + 1
                r2 = r1[r2]
                long r4 = (long) r2
                r2 = 49
                long r4 = r4 << r2
                long r4 = r4 ^ r6
                r6 = r4
                int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r2 >= 0) goto La6
                r4 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                long r4 = r4 ^ r6
                goto Lc9
            La6:
                int r2 = r0 + 1
                r0 = r1[r0]
                long r4 = (long) r0
                r0 = 56
                long r4 = r4 << r0
                long r4 = r4 ^ r6
                r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r4 = r4 ^ r6
                int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r0 >= 0) goto Lc8
                int r0 = r2 + 1
                r2 = r1[r2]
                long r6 = (long) r2
                int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r2 < 0) goto Lc3
                goto Lc9
            Lc3:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r2
            Lc8:
                r0 = r2
            Lc9:
                r10.pos = r0
                return r4
            Lcc:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public boolean skipField() throws java.io.IOException {
                r2 = this;
                boolean r0 = r2.isAtEnd()
                if (r0 != 0) goto L37
                int r0 = r2.tag
                int r1 = r2.endGroupTag
                if (r0 != r1) goto Ld
                goto L37
            Ld:
                int r0 = r2.tag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
                r1 = 1
                switch(r0) {
                    case 0: goto L33;
                    case 1: goto L2d;
                    case 2: goto L25;
                    case 3: goto L21;
                    case 4: goto L17;
                    case 5: goto L1c;
                    default: goto L17;
                }
            L17:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            L1c:
                r0 = 4
                r2.skipBytes(r0)
                return r1
            L21:
                r2.skipGroup()
                return r1
            L25:
                int r0 = r2.readVarint32()
                r2.skipBytes(r0)
                return r1
            L2d:
                r0 = 8
                r2.skipBytes(r0)
                return r1
            L33:
                r2.skipVarint()
                return r1
            L37:
                r0 = 0
                return r0
        }
    }

    private BinaryReader() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ BinaryReader(com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.BinaryReader newInstance(java.nio.ByteBuffer r2, boolean r3) {
            boolean r0 = r2.hasArray()
            if (r0 == 0) goto Lc
            com.google.crypto.tink.shaded.protobuf.BinaryReader$SafeHeapReader r0 = new com.google.crypto.tink.shaded.protobuf.BinaryReader$SafeHeapReader
            r0.<init>(r2, r3)
            return r0
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Direct buffers not yet supported"
            r0.<init>(r1)
            throw r0
    }

    public abstract int getTotalBytesRead();

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public boolean shouldDiscardUnknownFields() {
            r1 = this;
            r0 = 0
            return r0
    }
}
