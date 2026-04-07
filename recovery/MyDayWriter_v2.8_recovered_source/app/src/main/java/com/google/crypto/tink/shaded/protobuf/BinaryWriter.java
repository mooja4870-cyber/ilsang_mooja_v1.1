package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
abstract class BinaryWriter extends com.google.crypto.tink.shaded.protobuf.ByteOutput implements com.google.crypto.tink.shaded.protobuf.Writer {
    public static final int DEFAULT_CHUNK_SIZE = 4096;
    private static final int MAP_KEY_NUMBER = 1;
    private static final int MAP_VALUE_NUMBER = 2;
    private final com.google.crypto.tink.shaded.protobuf.BufferAllocator alloc;
    final java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> buffers;
    private final int chunkSize;
    int totalDoneBytes;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.BinaryWriter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L56
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r0 = move-exception
            L57:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L63
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64     // Catch: java.lang.NoSuchFieldError -> L63
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L63
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L63
                goto L64
            L63:
                r0 = move-exception
            L64:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L71
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
                goto L72
            L71:
                r0 = move-exception
            L72:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L7f
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64     // Catch: java.lang.NoSuchFieldError -> L7f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7f
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7f
                goto L80
            L7f:
                r0 = move-exception
            L80:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L8d
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING     // Catch: java.lang.NoSuchFieldError -> L8d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8d
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8d
                goto L8e
            L8d:
                r0 = move-exception
            L8e:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L9b
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32     // Catch: java.lang.NoSuchFieldError -> L9b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9b
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9b
                goto L9c
            L9b:
                r0 = move-exception
            L9c:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> La9
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64     // Catch: java.lang.NoSuchFieldError -> La9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La9
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La9
                goto Laa
            La9:
                r0 = move-exception
            Laa:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lb7
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> Lb7
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb7
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb7
                goto Lb8
            Lb7:
                r0 = move-exception
            Lb8:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lc5
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> Lc5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc5
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc5
                goto Lc6
            Lc5:
                r0 = move-exception
            Lc6:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Ld3
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> Ld3
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld3
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld3
                goto Ld4
            Ld3:
                r0 = move-exception
            Ld4:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Le1
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BYTES     // Catch: java.lang.NoSuchFieldError -> Le1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le1
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Le1
                goto Le2
            Le1:
                r0 = move-exception
            Le2:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lef
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM     // Catch: java.lang.NoSuchFieldError -> Lef
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

    private static final class SafeDirectWriter extends com.google.crypto.tink.shaded.protobuf.BinaryWriter {
        private java.nio.ByteBuffer buffer;
        private int limitMinusOne;
        private int pos;

        SafeDirectWriter(com.google.crypto.tink.shaded.protobuf.BufferAllocator r2, int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                r1.nextBuffer()
                return
        }

        private int bytesWrittenToCurrentBuffer() {
                r2 = this;
                int r0 = r2.limitMinusOne
                int r1 = r2.pos
                int r0 = r0 - r1
                return r0
        }

        private void nextBuffer() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r1.newDirectBuffer()
                r1.nextBuffer(r0)
                return
        }

        private void nextBuffer(int r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r1.newDirectBuffer(r2)
                r1.nextBuffer(r0)
                return
        }

        private void nextBuffer(com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r4) {
                r3 = this;
                boolean r0 = r4.hasNioBuffer()
                if (r0 == 0) goto L49
                java.nio.ByteBuffer r0 = r4.nioBuffer()
                boolean r1 = r0.isDirect()
                if (r1 == 0) goto L41
                r3.finishCurrentBuffer()
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r1 = r3.buffers
                r1.addFirst(r4)
                r3.buffer = r0
                java.nio.ByteBuffer r1 = r3.buffer
                java.nio.ByteBuffer r2 = r3.buffer
                int r2 = r2.capacity()
                r1.limit(r2)
                java.nio.ByteBuffer r1 = r3.buffer
                r2 = 0
                r1.position(r2)
                java.nio.ByteBuffer r1 = r3.buffer
                java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
                r1.order(r2)
                java.nio.ByteBuffer r1 = r3.buffer
                int r1 = r1.limit()
                int r1 = r1 + (-1)
                r3.limitMinusOne = r1
                int r1 = r3.limitMinusOne
                r3.pos = r1
                return
            L41:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Allocator returned non-direct buffer"
                r1.<init>(r2)
                throw r1
            L49:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Allocated buffer does not have NIO buffer"
                r0.<init>(r1)
                throw r0
        }

        private int spaceLeft() {
                r1 = this;
                int r0 = r1.pos
                int r0 = r0 + 1
                return r0
        }

        private void writeVarint32FiveBytes(int r5) {
                r4 = this;
                java.nio.ByteBuffer r0 = r4.buffer
                int r1 = r4.pos
                int r2 = r1 + (-1)
                r4.pos = r2
                int r2 = r5 >>> 28
                byte r2 = (byte) r2
                r0.put(r1, r2)
                int r0 = r4.pos
                int r0 = r0 + (-4)
                r4.pos = r0
                java.nio.ByteBuffer r0 = r4.buffer
                int r1 = r4.pos
                int r1 = r1 + 1
                int r2 = r5 >>> 21
                r2 = r2 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                int r2 = r2 << 24
                int r3 = r5 >>> 14
                r3 = r3 & 127(0x7f, float:1.78E-43)
                r3 = r3 | 128(0x80, float:1.8E-43)
                int r3 = r3 << 16
                r2 = r2 | r3
                int r3 = r5 >>> 7
                r3 = r3 & 127(0x7f, float:1.78E-43)
                r3 = r3 | 128(0x80, float:1.8E-43)
                int r3 = r3 << 8
                r2 = r2 | r3
                r3 = r5 & 127(0x7f, float:1.78E-43)
                r3 = r3 | 128(0x80, float:1.8E-43)
                r2 = r2 | r3
                r0.putInt(r1, r2)
                return
        }

        private void writeVarint32FourBytes(int r6) {
                r5 = this;
                int r0 = r5.pos
                int r0 = r0 + (-4)
                r5.pos = r0
                java.nio.ByteBuffer r0 = r5.buffer
                int r1 = r5.pos
                int r1 = r1 + 1
                r2 = 266338304(0xfe00000, float:2.2088105E-29)
                r2 = r2 & r6
                int r2 = r2 << 3
                r3 = 2080768(0x1fc000, float:2.915777E-39)
                r3 = r3 & r6
                r4 = 2097152(0x200000, float:2.938736E-39)
                r3 = r3 | r4
                int r3 = r3 << 2
                r2 = r2 | r3
                r3 = r6 & 16256(0x3f80, float:2.278E-41)
                r3 = r3 | 16384(0x4000, float:2.2959E-41)
                int r3 = r3 << 1
                r2 = r2 | r3
                r3 = r6 & 127(0x7f, float:1.78E-43)
                r3 = r3 | 128(0x80, float:1.8E-43)
                r2 = r2 | r3
                r0.putInt(r1, r2)
                return
        }

        private void writeVarint32OneByte(int r4) {
                r3 = this;
                java.nio.ByteBuffer r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                byte r2 = (byte) r4
                r0.put(r1, r2)
                return
        }

        private void writeVarint32ThreeBytes(int r5) {
                r4 = this;
                int r0 = r4.pos
                int r0 = r0 + (-3)
                r4.pos = r0
                java.nio.ByteBuffer r0 = r4.buffer
                int r1 = r4.pos
                r2 = 2080768(0x1fc000, float:2.915777E-39)
                r2 = r2 & r5
                int r2 = r2 << 10
                r3 = r5 & 16256(0x3f80, float:2.278E-41)
                r3 = r3 | 16384(0x4000, float:2.2959E-41)
                int r3 = r3 << 9
                r2 = r2 | r3
                r3 = r5 & 127(0x7f, float:1.78E-43)
                r3 = r3 | 128(0x80, float:1.8E-43)
                int r3 = r3 << 8
                r2 = r2 | r3
                r0.putInt(r1, r2)
                return
        }

        private void writeVarint32TwoBytes(int r5) {
                r4 = this;
                int r0 = r4.pos
                int r0 = r0 + (-2)
                r4.pos = r0
                java.nio.ByteBuffer r0 = r4.buffer
                int r1 = r4.pos
                int r1 = r1 + 1
                r2 = r5 & 16256(0x3f80, float:2.278E-41)
                int r2 = r2 << 1
                r3 = r5 & 127(0x7f, float:1.78E-43)
                r3 = r3 | 128(0x80, float:1.8E-43)
                r2 = r2 | r3
                short r2 = (short) r2
                r0.putShort(r1, r2)
                return
        }

        private void writeVarint64EightBytes(long r10) {
                r9 = this;
                int r0 = r9.pos
                int r0 = r0 + (-8)
                r9.pos = r0
                java.nio.ByteBuffer r0 = r9.buffer
                int r1 = r9.pos
                r2 = 1
                int r1 = r1 + r2
                r3 = 71494644084506624(0xfe000000000000, double:6.835426893334123E-304)
                long r3 = r3 & r10
                r5 = 7
                long r3 = r3 << r5
                r5 = 558551906910208(0x1fc0000000000, double:2.759613086234517E-309)
                long r5 = r5 & r10
                r7 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
                long r5 = r5 | r7
                r7 = 6
                long r5 = r5 << r7
                long r3 = r3 | r5
                r5 = 4363686772736(0x3f800000000, double:2.1559477236207E-311)
                long r5 = r5 & r10
                r7 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r5 = r5 | r7
                r7 = 5
                long r5 = r5 << r7
                long r3 = r3 | r5
                r5 = 34091302912(0x7f0000000, double:1.6843341591E-313)
                long r5 = r5 & r10
                r7 = 34359738368(0x800000000, double:1.69759663277E-313)
                long r5 = r5 | r7
                r7 = 4
                long r5 = r5 << r7
                long r3 = r3 | r5
                r5 = 266338304(0xfe00000, double:1.31588606E-315)
                long r5 = r5 & r10
                r7 = 268435456(0x10000000, double:1.32624737E-315)
                long r5 = r5 | r7
                r7 = 3
                long r5 = r5 << r7
                long r3 = r3 | r5
                r5 = 2080768(0x1fc000, double:1.028036E-317)
                long r5 = r5 & r10
                r7 = 2097152(0x200000, double:1.036131E-317)
                long r5 = r5 | r7
                r7 = 2
                long r5 = r5 << r7
                long r3 = r3 | r5
                r5 = 16256(0x3f80, double:8.0315E-320)
                long r5 = r5 & r10
                r7 = 16384(0x4000, double:8.095E-320)
                long r5 = r5 | r7
                long r5 = r5 << r2
                long r2 = r3 | r5
                r4 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r10
                r6 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r6
                long r2 = r2 | r4
                r0.putLong(r1, r2)
                return
        }

        private void writeVarint64EightBytesWithSign(long r10) {
                r9 = this;
                int r0 = r9.pos
                int r0 = r0 + (-8)
                r9.pos = r0
                java.nio.ByteBuffer r0 = r9.buffer
                int r1 = r9.pos
                r2 = 1
                int r1 = r1 + r2
                r3 = 71494644084506624(0xfe000000000000, double:6.835426893334123E-304)
                long r3 = r3 & r10
                r5 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
                long r3 = r3 | r5
                r5 = 7
                long r3 = r3 << r5
                r5 = 558551906910208(0x1fc0000000000, double:2.759613086234517E-309)
                long r5 = r5 & r10
                r7 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
                long r5 = r5 | r7
                r7 = 6
                long r5 = r5 << r7
                long r3 = r3 | r5
                r5 = 4363686772736(0x3f800000000, double:2.1559477236207E-311)
                long r5 = r5 & r10
                r7 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r5 = r5 | r7
                r7 = 5
                long r5 = r5 << r7
                long r3 = r3 | r5
                r5 = 34091302912(0x7f0000000, double:1.6843341591E-313)
                long r5 = r5 & r10
                r7 = 34359738368(0x800000000, double:1.69759663277E-313)
                long r5 = r5 | r7
                r7 = 4
                long r5 = r5 << r7
                long r3 = r3 | r5
                r5 = 266338304(0xfe00000, double:1.31588606E-315)
                long r5 = r5 & r10
                r7 = 268435456(0x10000000, double:1.32624737E-315)
                long r5 = r5 | r7
                r7 = 3
                long r5 = r5 << r7
                long r3 = r3 | r5
                r5 = 2080768(0x1fc000, double:1.028036E-317)
                long r5 = r5 & r10
                r7 = 2097152(0x200000, double:1.036131E-317)
                long r5 = r5 | r7
                r7 = 2
                long r5 = r5 << r7
                long r3 = r3 | r5
                r5 = 16256(0x3f80, double:8.0315E-320)
                long r5 = r5 & r10
                r7 = 16384(0x4000, double:8.095E-320)
                long r5 = r5 | r7
                long r5 = r5 << r2
                long r2 = r3 | r5
                r4 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r10
                r6 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r6
                long r2 = r2 | r4
                r0.putLong(r1, r2)
                return
        }

        private void writeVarint64FiveBytes(long r9) {
                r8 = this;
                int r0 = r8.pos
                int r0 = r0 + (-5)
                r8.pos = r0
                java.nio.ByteBuffer r0 = r8.buffer
                int r1 = r8.pos
                int r1 = r1 + (-2)
                r2 = 34091302912(0x7f0000000, double:1.6843341591E-313)
                long r2 = r2 & r9
                r4 = 28
                long r2 = r2 << r4
                r4 = 266338304(0xfe00000, double:1.31588606E-315)
                long r4 = r4 & r9
                r6 = 268435456(0x10000000, double:1.32624737E-315)
                long r4 = r4 | r6
                r6 = 27
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 2080768(0x1fc000, double:1.028036E-317)
                long r4 = r4 & r9
                r6 = 2097152(0x200000, double:1.036131E-317)
                long r4 = r4 | r6
                r6 = 26
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 16256(0x3f80, double:8.0315E-320)
                long r4 = r4 & r9
                r6 = 16384(0x4000, double:8.095E-320)
                long r4 = r4 | r6
                r6 = 25
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r9
                r6 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r6
                r6 = 24
                long r4 = r4 << r6
                long r2 = r2 | r4
                r0.putLong(r1, r2)
                return
        }

        private void writeVarint64FourBytes(long r2) {
                r1 = this;
                int r0 = (int) r2
                r1.writeVarint32FourBytes(r0)
                return
        }

        private void writeVarint64NineBytes(long r5) {
                r4 = this;
                java.nio.ByteBuffer r0 = r4.buffer
                int r1 = r4.pos
                int r2 = r1 + (-1)
                r4.pos = r2
                r2 = 56
                long r2 = r5 >>> r2
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0.put(r1, r2)
                r0 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
                long r0 = r0 & r5
                r4.writeVarint64EightBytesWithSign(r0)
                return
        }

        private void writeVarint64OneByte(long r2) {
                r1 = this;
                int r0 = (int) r2
                r1.writeVarint32OneByte(r0)
                return
        }

        private void writeVarint64SevenBytes(long r9) {
                r8 = this;
                int r0 = r8.pos
                int r0 = r0 + (-7)
                r8.pos = r0
                java.nio.ByteBuffer r0 = r8.buffer
                int r1 = r8.pos
                r2 = 558551906910208(0x1fc0000000000, double:2.759613086234517E-309)
                long r2 = r2 & r9
                r4 = 14
                long r2 = r2 << r4
                r4 = 4363686772736(0x3f800000000, double:2.1559477236207E-311)
                long r4 = r4 & r9
                r6 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r4 = r4 | r6
                r6 = 13
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 34091302912(0x7f0000000, double:1.6843341591E-313)
                long r4 = r4 & r9
                r6 = 34359738368(0x800000000, double:1.69759663277E-313)
                long r4 = r4 | r6
                r6 = 12
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 266338304(0xfe00000, double:1.31588606E-315)
                long r4 = r4 & r9
                r6 = 268435456(0x10000000, double:1.32624737E-315)
                long r4 = r4 | r6
                r6 = 11
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 2080768(0x1fc000, double:1.028036E-317)
                long r4 = r4 & r9
                r6 = 2097152(0x200000, double:1.036131E-317)
                long r4 = r4 | r6
                r6 = 10
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 16256(0x3f80, double:8.0315E-320)
                long r4 = r4 & r9
                r6 = 16384(0x4000, double:8.095E-320)
                long r4 = r4 | r6
                r6 = 9
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r9
                r6 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r6
                r6 = 8
                long r4 = r4 << r6
                long r2 = r2 | r4
                r0.putLong(r1, r2)
                return
        }

        private void writeVarint64SixBytes(long r9) {
                r8 = this;
                int r0 = r8.pos
                int r0 = r0 + (-6)
                r8.pos = r0
                java.nio.ByteBuffer r0 = r8.buffer
                int r1 = r8.pos
                int r1 = r1 + (-1)
                r2 = 4363686772736(0x3f800000000, double:2.1559477236207E-311)
                long r2 = r2 & r9
                r4 = 21
                long r2 = r2 << r4
                r4 = 34091302912(0x7f0000000, double:1.6843341591E-313)
                long r4 = r4 & r9
                r6 = 34359738368(0x800000000, double:1.69759663277E-313)
                long r4 = r4 | r6
                r6 = 20
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 266338304(0xfe00000, double:1.31588606E-315)
                long r4 = r4 & r9
                r6 = 268435456(0x10000000, double:1.32624737E-315)
                long r4 = r4 | r6
                r6 = 19
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 2080768(0x1fc000, double:1.028036E-317)
                long r4 = r4 & r9
                r6 = 2097152(0x200000, double:1.036131E-317)
                long r4 = r4 | r6
                r6 = 18
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 16256(0x3f80, double:8.0315E-320)
                long r4 = r4 & r9
                r6 = 16384(0x4000, double:8.095E-320)
                long r4 = r4 | r6
                r6 = 17
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r9
                r6 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r6
                r6 = 16
                long r4 = r4 << r6
                long r2 = r2 | r4
                r0.putLong(r1, r2)
                return
        }

        private void writeVarint64TenBytes(long r7) {
                r6 = this;
                java.nio.ByteBuffer r0 = r6.buffer
                int r1 = r6.pos
                int r2 = r1 + (-1)
                r6.pos = r2
                r2 = 63
                long r2 = r7 >>> r2
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0.put(r1, r2)
                java.nio.ByteBuffer r0 = r6.buffer
                int r1 = r6.pos
                int r2 = r1 + (-1)
                r6.pos = r2
                r2 = 56
                long r2 = r7 >>> r2
                r4 = 127(0x7f, double:6.27E-322)
                long r2 = r2 & r4
                r4 = 128(0x80, double:6.3E-322)
                long r2 = r2 | r4
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0.put(r1, r2)
                r0 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
                long r0 = r0 & r7
                r6.writeVarint64EightBytesWithSign(r0)
                return
        }

        private void writeVarint64ThreeBytes(long r2) {
                r1 = this;
                int r0 = (int) r2
                r1.writeVarint32ThreeBytes(r0)
                return
        }

        private void writeVarint64TwoBytes(long r2) {
                r1 = this;
                int r0 = (int) r2
                r1.writeVarint32TwoBytes(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void finishCurrentBuffer() {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.buffer
                if (r0 == 0) goto L1e
                int r0 = r2.totalDoneBytes
                int r1 = r2.bytesWrittenToCurrentBuffer()
                int r0 = r0 + r1
                r2.totalDoneBytes = r0
                java.nio.ByteBuffer r0 = r2.buffer
                int r1 = r2.pos
                int r1 = r1 + 1
                r0.position(r1)
                r0 = 0
                r2.buffer = r0
                r0 = 0
                r2.pos = r0
                r2.limitMinusOne = r0
            L1e:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
                r2 = this;
                int r0 = r2.totalDoneBytes
                int r1 = r2.bytesWrittenToCurrentBuffer()
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void requireSpace(int r2) {
                r1 = this;
                int r0 = r1.spaceLeft()
                if (r0 >= r2) goto L9
                r1.nextBuffer(r2)
            L9:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte r4) {
                r3 = this;
                java.nio.ByteBuffer r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                r0.put(r1, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer r4) {
                r3 = this;
                int r0 = r4.remaining()
                int r1 = r3.spaceLeft()
                if (r1 >= r0) goto Ld
                r3.nextBuffer(r0)
            Ld:
                int r1 = r3.pos
                int r1 = r1 - r0
                r3.pos = r1
                java.nio.ByteBuffer r1 = r3.buffer
                int r2 = r3.pos
                int r2 = r2 + 1
                r1.position(r2)
                java.nio.ByteBuffer r1 = r3.buffer
                r1.put(r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] r3, int r4, int r5) {
                r2 = this;
                int r0 = r2.spaceLeft()
                if (r0 >= r5) goto L9
                r2.nextBuffer(r5)
            L9:
                int r0 = r2.pos
                int r0 = r0 - r5
                r2.pos = r0
                java.nio.ByteBuffer r0 = r2.buffer
                int r1 = r2.pos
                int r1 = r1 + 1
                r0.position(r1)
                java.nio.ByteBuffer r0 = r2.buffer
                r0.put(r3, r4, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBool(int r2, boolean r3) {
                r1 = this;
                r0 = 6
                r1.requireSpace(r0)
                byte r0 = (byte) r3
                r1.write(r0)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeBool(boolean r2) {
                r1 = this;
                byte r0 = (byte) r2
                r1.write(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBytes(int r3, com.google.crypto.tink.shaded.protobuf.ByteString r4) {
                r2 = this;
                r4.writeToReverse(r2)     // Catch: java.io.IOException -> L15
                r0 = 10
                r2.requireSpace(r0)
                int r0 = r4.size()
                r2.writeVarint32(r0)
                r0 = 2
                r2.writeTag(r3, r0)
                return
            L15:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @java.lang.Deprecated
        public void writeEndGroup(int r2) {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed32(int r3) {
                r2 = this;
                int r0 = r2.pos
                int r0 = r0 + (-4)
                r2.pos = r0
                java.nio.ByteBuffer r0 = r2.buffer
                int r1 = r2.pos
                int r1 = r1 + 1
                r0.putInt(r1, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed32(int r2, int r3) {
                r1 = this;
                r0 = 9
                r1.requireSpace(r0)
                r1.writeFixed32(r3)
                r0 = 5
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed64(int r2, long r3) {
                r1 = this;
                r0 = 13
                r1.requireSpace(r0)
                r1.writeFixed64(r3)
                r0 = 1
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed64(long r3) {
                r2 = this;
                int r0 = r2.pos
                int r0 = r0 + (-8)
                r2.pos = r0
                java.nio.ByteBuffer r0 = r2.buffer
                int r1 = r2.pos
                int r1 = r1 + 1
                r0.putLong(r1, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @java.lang.Deprecated
        public void writeGroup(int r2, java.lang.Object r3) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                r0.writeTo(r3, r1)
                r0 = 3
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                r4.writeTo(r3, r1)
                r0 = 3
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeInt32(int r3) {
                r2 = this;
                if (r3 < 0) goto L6
                r2.writeVarint32(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.writeVarint64(r0)
            La:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeInt32(int r2, int r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeInt32(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer r4) {
                r3 = this;
                int r0 = r4.remaining()
                int r1 = r3.spaceLeft()
                if (r1 >= r0) goto L1c
                int r1 = r3.totalDoneBytes
                int r1 = r1 + r0
                r3.totalDoneBytes = r1
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r1 = r3.buffers
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r2 = com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(r4)
                r1.addFirst(r2)
                r3.nextBuffer()
                return
            L1c:
                int r1 = r3.pos
                int r1 = r1 - r0
                r3.pos = r1
                java.nio.ByteBuffer r1 = r3.buffer
                int r2 = r3.pos
                int r2 = r2 + 1
                r1.position(r2)
                java.nio.ByteBuffer r1 = r3.buffer
                r1.put(r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] r3, int r4, int r5) {
                r2 = this;
                int r0 = r2.spaceLeft()
                if (r0 >= r5) goto L18
                int r0 = r2.totalDoneBytes
                int r0 = r0 + r5
                r2.totalDoneBytes = r0
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r0 = r2.buffers
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r1 = com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(r3, r4, r5)
                r0.addFirst(r1)
                r2.nextBuffer()
                return
            L18:
                int r0 = r2.pos
                int r0 = r0 - r5
                r2.pos = r0
                java.nio.ByteBuffer r0 = r2.buffer
                int r1 = r2.pos
                int r1 = r1 + 1
                r0.position(r1)
                java.nio.ByteBuffer r0 = r2.buffer
                r0.put(r3, r4, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int r4, java.lang.Object r5) throws java.io.IOException {
                r3 = this;
                int r0 = r3.getTotalBytesWritten()
                com.google.crypto.tink.shaded.protobuf.Protobuf r1 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                r1.writeTo(r5, r3)
                int r1 = r3.getTotalBytesWritten()
                int r1 = r1 - r0
                r2 = 10
                r3.requireSpace(r2)
                r3.writeVarint32(r1)
                r2 = 2
                r3.writeTag(r4, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int r4, java.lang.Object r5, com.google.crypto.tink.shaded.protobuf.Schema r6) throws java.io.IOException {
                r3 = this;
                int r0 = r3.getTotalBytesWritten()
                r6.writeTo(r5, r3)
                int r1 = r3.getTotalBytesWritten()
                int r1 = r1 - r0
                r2 = 10
                r3.requireSpace(r2)
                r3.writeVarint32(r1)
                r2 = 2
                r3.writeTag(r4, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt32(int r2) {
                r1 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.encodeZigZag32(r2)
                r1.writeVarint32(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt32(int r2, int r3) {
                r1 = this;
                r0 = 10
                r1.requireSpace(r0)
                r1.writeSInt32(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt64(int r2, long r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeSInt64(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt64(long r3) {
                r2 = this;
                long r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.encodeZigZag64(r3)
                r2.writeVarint64(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @java.lang.Deprecated
        public void writeStartGroup(int r2) {
                r1 = this;
                r0 = 3
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeString(int r4, java.lang.String r5) {
                r3 = this;
                int r0 = r3.getTotalBytesWritten()
                r3.writeString(r5)
                int r1 = r3.getTotalBytesWritten()
                int r1 = r1 - r0
                r2 = 10
                r3.requireSpace(r2)
                r3.writeVarint32(r1)
                r2 = 2
                r3.writeTag(r4, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeString(java.lang.String r11) {
                r10 = this;
                int r0 = r11.length()
                r10.requireSpace(r0)
                int r0 = r11.length()
                r1 = 1
                int r0 = r0 - r1
                int r2 = r10.pos
                int r2 = r2 - r0
                r10.pos = r2
            L12:
                r2 = 128(0x80, float:1.8E-43)
                if (r0 < 0) goto L29
                char r3 = r11.charAt(r0)
                r4 = r3
                if (r3 >= r2) goto L29
                java.nio.ByteBuffer r2 = r10.buffer
                int r3 = r10.pos
                int r3 = r3 + r0
                byte r5 = (byte) r4
                r2.put(r3, r5)
                int r0 = r0 + (-1)
                goto L12
            L29:
                r3 = -1
                if (r0 != r3) goto L32
                int r2 = r10.pos
                int r2 = r2 - r1
                r10.pos = r2
                return
            L32:
                int r4 = r10.pos
                int r4 = r4 + r0
                r10.pos = r4
            L37:
                if (r0 < 0) goto L126
                char r4 = r11.charAt(r0)
                if (r4 >= r2) goto L51
                int r5 = r10.pos
                if (r5 < 0) goto L51
                java.nio.ByteBuffer r5 = r10.buffer
                int r6 = r10.pos
                int r7 = r6 + (-1)
                r10.pos = r7
                byte r7 = (byte) r4
                r5.put(r6, r7)
                goto L123
            L51:
                r5 = 2048(0x800, float:2.87E-42)
                if (r4 >= r5) goto L7a
                int r5 = r10.pos
                if (r5 <= 0) goto L7a
                java.nio.ByteBuffer r5 = r10.buffer
                int r6 = r10.pos
                int r7 = r6 + (-1)
                r10.pos = r7
                r7 = r4 & 63
                r7 = r7 | r2
                byte r7 = (byte) r7
                r5.put(r6, r7)
                java.nio.ByteBuffer r5 = r10.buffer
                int r6 = r10.pos
                int r7 = r6 + (-1)
                r10.pos = r7
                int r7 = r4 >>> 6
                r7 = r7 | 960(0x3c0, float:1.345E-42)
                byte r7 = (byte) r7
                r5.put(r6, r7)
                goto L123
            L7a:
                r5 = 55296(0xd800, float:7.7486E-41)
                if (r4 < r5) goto L84
                r5 = 57343(0xdfff, float:8.0355E-41)
                if (r5 >= r4) goto Lb9
            L84:
                int r5 = r10.pos
                if (r5 <= r1) goto Lb9
                java.nio.ByteBuffer r5 = r10.buffer
                int r6 = r10.pos
                int r7 = r6 + (-1)
                r10.pos = r7
                r7 = r4 & 63
                r7 = r7 | r2
                byte r7 = (byte) r7
                r5.put(r6, r7)
                java.nio.ByteBuffer r5 = r10.buffer
                int r6 = r10.pos
                int r7 = r6 + (-1)
                r10.pos = r7
                int r7 = r4 >>> 6
                r7 = r7 & 63
                r7 = r7 | r2
                byte r7 = (byte) r7
                r5.put(r6, r7)
                java.nio.ByteBuffer r5 = r10.buffer
                int r6 = r10.pos
                int r7 = r6 + (-1)
                r10.pos = r7
                int r7 = r4 >>> 12
                r7 = r7 | 480(0x1e0, float:6.73E-43)
                byte r7 = (byte) r7
                r5.put(r6, r7)
                goto L123
            Lb9:
                int r5 = r10.pos
                r6 = 2
                if (r5 <= r6) goto L11e
                r5 = 0
                if (r0 == 0) goto L116
                int r6 = r0 + (-1)
                char r6 = r11.charAt(r6)
                r5 = r6
                boolean r6 = java.lang.Character.isSurrogatePair(r6, r4)
                if (r6 == 0) goto L116
                int r0 = r0 + (-1)
                int r6 = java.lang.Character.toCodePoint(r5, r4)
                java.nio.ByteBuffer r7 = r10.buffer
                int r8 = r10.pos
                int r9 = r8 + (-1)
                r10.pos = r9
                r9 = r6 & 63
                r9 = r9 | r2
                byte r9 = (byte) r9
                r7.put(r8, r9)
                java.nio.ByteBuffer r7 = r10.buffer
                int r8 = r10.pos
                int r9 = r8 + (-1)
                r10.pos = r9
                int r9 = r6 >>> 6
                r9 = r9 & 63
                r9 = r9 | r2
                byte r9 = (byte) r9
                r7.put(r8, r9)
                java.nio.ByteBuffer r7 = r10.buffer
                int r8 = r10.pos
                int r9 = r8 + (-1)
                r10.pos = r9
                int r9 = r6 >>> 12
                r9 = r9 & 63
                r9 = r9 | r2
                byte r9 = (byte) r9
                r7.put(r8, r9)
                java.nio.ByteBuffer r7 = r10.buffer
                int r8 = r10.pos
                int r9 = r8 + (-1)
                r10.pos = r9
                int r9 = r6 >>> 18
                r9 = r9 | 240(0xf0, float:3.36E-43)
                byte r9 = (byte) r9
                r7.put(r8, r9)
                goto L123
            L116:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r1 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                int r2 = r0 + (-1)
                r1.<init>(r2, r0)
                throw r1
            L11e:
                r10.requireSpace(r0)
                int r0 = r0 + 1
            L123:
                int r0 = r0 + r3
                goto L37
            L126:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeTag(int r2, int r3) {
                r1 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r2, r3)
                r1.writeVarint32(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt32(int r2, int r3) {
                r1 = this;
                r0 = 10
                r1.requireSpace(r0)
                r1.writeVarint32(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt64(int r2, long r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeVarint64(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint32(int r2) {
                r1 = this;
                r0 = r2 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L8
                r1.writeVarint32OneByte(r2)
                goto L25
            L8:
                r0 = r2 & (-16384(0xffffffffffffc000, float:NaN))
                if (r0 != 0) goto L10
                r1.writeVarint32TwoBytes(r2)
                goto L25
            L10:
                r0 = -2097152(0xffffffffffe00000, float:NaN)
                r0 = r0 & r2
                if (r0 != 0) goto L19
                r1.writeVarint32ThreeBytes(r2)
                goto L25
            L19:
                r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
                r0 = r0 & r2
                if (r0 != 0) goto L22
                r1.writeVarint32FourBytes(r2)
                goto L25
            L22:
                r1.writeVarint32FiveBytes(r2)
            L25:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint64(long r2) {
                r1 = this;
                byte r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.access$200(r2)
                switch(r0) {
                    case 1: goto L2c;
                    case 2: goto L28;
                    case 3: goto L24;
                    case 4: goto L20;
                    case 5: goto L1c;
                    case 6: goto L18;
                    case 7: goto L14;
                    case 8: goto L10;
                    case 9: goto Lc;
                    case 10: goto L8;
                    default: goto L7;
                }
            L7:
                goto L30
            L8:
                r1.writeVarint64TenBytes(r2)
                goto L30
            Lc:
                r1.writeVarint64NineBytes(r2)
                goto L30
            L10:
                r1.writeVarint64EightBytes(r2)
                goto L30
            L14:
                r1.writeVarint64SevenBytes(r2)
                goto L30
            L18:
                r1.writeVarint64SixBytes(r2)
                goto L30
            L1c:
                r1.writeVarint64FiveBytes(r2)
                goto L30
            L20:
                r1.writeVarint64FourBytes(r2)
                goto L30
            L24:
                r1.writeVarint64ThreeBytes(r2)
                goto L30
            L28:
                r1.writeVarint64TwoBytes(r2)
                goto L30
            L2c:
                r1.writeVarint64OneByte(r2)
            L30:
                return
        }
    }

    private static final class SafeHeapWriter extends com.google.crypto.tink.shaded.protobuf.BinaryWriter {
        private com.google.crypto.tink.shaded.protobuf.AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private int limit;
        private int limitMinusOne;
        private int offset;
        private int offsetMinusOne;
        private int pos;

        SafeHeapWriter(com.google.crypto.tink.shaded.protobuf.BufferAllocator r2, int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                r1.nextBuffer()
                return
        }

        private void nextBuffer() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r1.newHeapBuffer()
                r1.nextBuffer(r0)
                return
        }

        private void nextBuffer(int r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r1.newHeapBuffer(r2)
                r1.nextBuffer(r0)
                return
        }

        private void nextBuffer(com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r3) {
                r2 = this;
                boolean r0 = r3.hasArray()
                if (r0 == 0) goto L39
                r2.finishCurrentBuffer()
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r0 = r2.buffers
                r0.addFirst(r3)
                r2.allocatedBuffer = r3
                byte[] r0 = r3.array()
                r2.buffer = r0
                int r0 = r3.arrayOffset()
                int r1 = r3.limit()
                int r1 = r1 + r0
                r2.limit = r1
                int r1 = r3.position()
                int r1 = r1 + r0
                r2.offset = r1
                int r1 = r2.offset
                int r1 = r1 + (-1)
                r2.offsetMinusOne = r1
                int r1 = r2.limit
                int r1 = r1 + (-1)
                r2.limitMinusOne = r1
                int r1 = r2.limitMinusOne
                r2.pos = r1
                return
            L39:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Allocator returned non-heap buffer"
                r0.<init>(r1)
                throw r0
        }

        private void writeVarint32FiveBytes(int r4) {
                r3 = this;
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                int r2 = r4 >>> 28
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                int r2 = r4 >>> 21
                r2 = r2 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                int r2 = r4 >>> 14
                r2 = r2 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                int r2 = r4 >>> 7
                r2 = r2 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                r2 = r4 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                return
        }

        private void writeVarint32FourBytes(int r4) {
                r3 = this;
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                int r2 = r4 >>> 21
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                int r2 = r4 >>> 14
                r2 = r2 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                int r2 = r4 >>> 7
                r2 = r2 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                r2 = r4 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                return
        }

        private void writeVarint32OneByte(int r4) {
                r3 = this;
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                byte r2 = (byte) r4
                r0[r1] = r2
                return
        }

        private void writeVarint32ThreeBytes(int r4) {
                r3 = this;
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                int r2 = r4 >>> 14
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                int r2 = r4 >>> 7
                r2 = r2 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                r2 = r4 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                return
        }

        private void writeVarint32TwoBytes(int r4) {
                r3 = this;
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                int r2 = r4 >>> 7
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                r2 = r4 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                return
        }

        private void writeVarint64EightBytes(long r9) {
                r8 = this;
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 49
                long r2 = r9 >>> r2
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 42
                long r2 = r9 >>> r2
                r4 = 127(0x7f, double:6.27E-322)
                long r2 = r2 & r4
                r6 = 128(0x80, double:6.3E-322)
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 35
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 28
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 21
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 14
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 7
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                long r2 = r9 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                return
        }

        private void writeVarint64FiveBytes(long r9) {
                r8 = this;
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 28
                long r2 = r9 >>> r2
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 21
                long r2 = r9 >>> r2
                r4 = 127(0x7f, double:6.27E-322)
                long r2 = r2 & r4
                r6 = 128(0x80, double:6.3E-322)
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 14
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 7
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                long r2 = r9 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                return
        }

        private void writeVarint64FourBytes(long r9) {
                r8 = this;
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 21
                long r2 = r9 >>> r2
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 14
                long r2 = r9 >>> r2
                r4 = 127(0x7f, double:6.27E-322)
                long r2 = r2 & r4
                r6 = 128(0x80, double:6.3E-322)
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 7
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                long r2 = r9 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                return
        }

        private void writeVarint64NineBytes(long r9) {
                r8 = this;
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 56
                long r2 = r9 >>> r2
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 49
                long r2 = r9 >>> r2
                r4 = 127(0x7f, double:6.27E-322)
                long r2 = r2 & r4
                r6 = 128(0x80, double:6.3E-322)
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 42
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 35
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 28
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 21
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 14
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 7
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                long r2 = r9 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                return
        }

        private void writeVarint64OneByte(long r4) {
                r3 = this;
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                int r2 = (int) r4
                byte r2 = (byte) r2
                r0[r1] = r2
                return
        }

        private void writeVarint64SevenBytes(long r9) {
                r8 = this;
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 42
                long r2 = r9 >>> r2
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 35
                long r2 = r9 >>> r2
                r4 = 127(0x7f, double:6.27E-322)
                long r2 = r2 & r4
                r6 = 128(0x80, double:6.3E-322)
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 28
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 21
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 14
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 7
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                long r2 = r9 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                return
        }

        private void writeVarint64SixBytes(long r9) {
                r8 = this;
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 35
                long r2 = r9 >>> r2
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 28
                long r2 = r9 >>> r2
                r4 = 127(0x7f, double:6.27E-322)
                long r2 = r2 & r4
                r6 = 128(0x80, double:6.3E-322)
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 21
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 14
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 7
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                long r2 = r9 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                return
        }

        private void writeVarint64TenBytes(long r9) {
                r8 = this;
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 63
                long r2 = r9 >>> r2
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 56
                long r2 = r9 >>> r2
                r4 = 127(0x7f, double:6.27E-322)
                long r2 = r2 & r4
                r6 = 128(0x80, double:6.3E-322)
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 49
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 42
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 35
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 28
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 21
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 14
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 7
                long r2 = r9 >>> r2
                long r2 = r2 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                long r2 = r9 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                return
        }

        private void writeVarint64ThreeBytes(long r9) {
                r8 = this;
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                int r2 = (int) r9
                int r2 = r2 >>> 14
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                r2 = 7
                long r2 = r9 >>> r2
                r4 = 127(0x7f, double:6.27E-322)
                long r2 = r2 & r4
                r6 = 128(0x80, double:6.3E-322)
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r8.buffer
                int r1 = r8.pos
                int r2 = r1 + (-1)
                r8.pos = r2
                long r2 = r9 & r4
                long r2 = r2 | r6
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                return
        }

        private void writeVarint64TwoBytes(long r5) {
                r4 = this;
                byte[] r0 = r4.buffer
                int r1 = r4.pos
                int r2 = r1 + (-1)
                r4.pos = r2
                r2 = 7
                long r2 = r5 >>> r2
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r4.buffer
                int r1 = r4.pos
                int r2 = r1 + (-1)
                r4.pos = r2
                int r2 = (int) r5
                r2 = r2 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                return
        }

        int bytesWrittenToCurrentBuffer() {
                r2 = this;
                int r0 = r2.limitMinusOne
                int r1 = r2.pos
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void finishCurrentBuffer() {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r3.allocatedBuffer
                if (r0 == 0) goto L25
                int r0 = r3.totalDoneBytes
                int r1 = r3.bytesWrittenToCurrentBuffer()
                int r0 = r0 + r1
                r3.totalDoneBytes = r0
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r3.allocatedBuffer
                int r1 = r3.pos
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r2 = r3.allocatedBuffer
                int r2 = r2.arrayOffset()
                int r1 = r1 - r2
                int r1 = r1 + 1
                r0.position(r1)
                r0 = 0
                r3.allocatedBuffer = r0
                r0 = 0
                r3.pos = r0
                r3.limitMinusOne = r0
            L25:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
                r2 = this;
                int r0 = r2.totalDoneBytes
                int r1 = r2.bytesWrittenToCurrentBuffer()
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void requireSpace(int r2) {
                r1 = this;
                int r0 = r1.spaceLeft()
                if (r0 >= r2) goto L9
                r1.nextBuffer(r2)
            L9:
                return
        }

        int spaceLeft() {
                r2 = this;
                int r0 = r2.pos
                int r1 = r2.offsetMinusOne
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte r4) {
                r3 = this;
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                r0[r1] = r4
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer r4) {
                r3 = this;
                int r0 = r4.remaining()
                int r1 = r3.spaceLeft()
                if (r1 >= r0) goto Ld
                r3.nextBuffer(r0)
            Ld:
                int r1 = r3.pos
                int r1 = r1 - r0
                r3.pos = r1
                byte[] r1 = r3.buffer
                int r2 = r3.pos
                int r2 = r2 + 1
                r4.get(r1, r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] r3, int r4, int r5) {
                r2 = this;
                int r0 = r2.spaceLeft()
                if (r0 >= r5) goto L9
                r2.nextBuffer(r5)
            L9:
                int r0 = r2.pos
                int r0 = r0 - r5
                r2.pos = r0
                byte[] r0 = r2.buffer
                int r1 = r2.pos
                int r1 = r1 + 1
                java.lang.System.arraycopy(r3, r4, r0, r1, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBool(int r2, boolean r3) throws java.io.IOException {
                r1 = this;
                r0 = 6
                r1.requireSpace(r0)
                byte r0 = (byte) r3
                r1.write(r0)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeBool(boolean r2) {
                r1 = this;
                byte r0 = (byte) r2
                r1.write(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBytes(int r3, com.google.crypto.tink.shaded.protobuf.ByteString r4) throws java.io.IOException {
                r2 = this;
                r4.writeToReverse(r2)     // Catch: java.io.IOException -> L15
                r0 = 10
                r2.requireSpace(r0)
                int r0 = r4.size()
                r2.writeVarint32(r0)
                r0 = 2
                r2.writeTag(r3, r0)
                return
            L15:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeEndGroup(int r2) {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed32(int r4) {
                r3 = this;
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                int r2 = r4 >> 24
                r2 = r2 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                int r2 = r4 >> 16
                r2 = r2 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                int r2 = r4 >> 8
                r2 = r2 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                r2 = r4 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 9
                r1.requireSpace(r0)
                r1.writeFixed32(r3)
                r0 = 5
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 13
                r1.requireSpace(r0)
                r1.writeFixed64(r3)
                r0 = 1
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed64(long r5) {
                r4 = this;
                byte[] r0 = r4.buffer
                int r1 = r4.pos
                int r2 = r1 + (-1)
                r4.pos = r2
                r2 = 56
                long r2 = r5 >> r2
                int r2 = (int) r2
                r2 = r2 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r4.buffer
                int r1 = r4.pos
                int r2 = r1 + (-1)
                r4.pos = r2
                r2 = 48
                long r2 = r5 >> r2
                int r2 = (int) r2
                r2 = r2 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r4.buffer
                int r1 = r4.pos
                int r2 = r1 + (-1)
                r4.pos = r2
                r2 = 40
                long r2 = r5 >> r2
                int r2 = (int) r2
                r2 = r2 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r4.buffer
                int r1 = r4.pos
                int r2 = r1 + (-1)
                r4.pos = r2
                r2 = 32
                long r2 = r5 >> r2
                int r2 = (int) r2
                r2 = r2 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r4.buffer
                int r1 = r4.pos
                int r2 = r1 + (-1)
                r4.pos = r2
                r2 = 24
                long r2 = r5 >> r2
                int r2 = (int) r2
                r2 = r2 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r4.buffer
                int r1 = r4.pos
                int r2 = r1 + (-1)
                r4.pos = r2
                r2 = 16
                long r2 = r5 >> r2
                int r2 = (int) r2
                r2 = r2 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r4.buffer
                int r1 = r4.pos
                int r2 = r1 + (-1)
                r4.pos = r2
                r2 = 8
                long r2 = r5 >> r2
                int r2 = (int) r2
                r2 = r2 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                byte[] r0 = r4.buffer
                int r1 = r4.pos
                int r2 = r1 + (-1)
                r4.pos = r2
                int r2 = (int) r5
                r2 = r2 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @java.lang.Deprecated
        public void writeGroup(int r2, java.lang.Object r3) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                r0.writeTo(r3, r1)
                r0 = 3
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                r4.writeTo(r3, r1)
                r0 = 3
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeInt32(int r3) {
                r2 = this;
                if (r3 < 0) goto L6
                r2.writeVarint32(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.writeVarint64(r0)
            La:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeInt32(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer r4) {
                r3 = this;
                int r0 = r4.remaining()
                int r1 = r3.spaceLeft()
                if (r1 >= r0) goto L1b
                int r1 = r3.totalDoneBytes
                int r1 = r1 + r0
                r3.totalDoneBytes = r1
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r1 = r3.buffers
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r2 = com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(r4)
                r1.addFirst(r2)
                r3.nextBuffer()
            L1b:
                int r1 = r3.pos
                int r1 = r1 - r0
                r3.pos = r1
                byte[] r1 = r3.buffer
                int r2 = r3.pos
                int r2 = r2 + 1
                r4.get(r1, r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] r3, int r4, int r5) {
                r2 = this;
                int r0 = r2.spaceLeft()
                if (r0 >= r5) goto L18
                int r0 = r2.totalDoneBytes
                int r0 = r0 + r5
                r2.totalDoneBytes = r0
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r0 = r2.buffers
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r1 = com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(r3, r4, r5)
                r0.addFirst(r1)
                r2.nextBuffer()
                return
            L18:
                int r0 = r2.pos
                int r0 = r0 - r5
                r2.pos = r0
                byte[] r0 = r2.buffer
                int r1 = r2.pos
                int r1 = r1 + 1
                java.lang.System.arraycopy(r3, r4, r0, r1, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int r4, java.lang.Object r5) throws java.io.IOException {
                r3 = this;
                int r0 = r3.getTotalBytesWritten()
                com.google.crypto.tink.shaded.protobuf.Protobuf r1 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                r1.writeTo(r5, r3)
                int r1 = r3.getTotalBytesWritten()
                int r1 = r1 - r0
                r2 = 10
                r3.requireSpace(r2)
                r3.writeVarint32(r1)
                r2 = 2
                r3.writeTag(r4, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int r4, java.lang.Object r5, com.google.crypto.tink.shaded.protobuf.Schema r6) throws java.io.IOException {
                r3 = this;
                int r0 = r3.getTotalBytesWritten()
                r6.writeTo(r5, r3)
                int r1 = r3.getTotalBytesWritten()
                int r1 = r1 - r0
                r2 = 10
                r3.requireSpace(r2)
                r3.writeVarint32(r1)
                r2 = 2
                r3.writeTag(r4, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt32(int r2) {
                r1 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.encodeZigZag32(r2)
                r1.writeVarint32(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 10
                r1.requireSpace(r0)
                r1.writeSInt32(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeSInt64(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt64(long r3) {
                r2 = this;
                long r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.encodeZigZag64(r3)
                r2.writeVarint64(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeStartGroup(int r2) {
                r1 = this;
                r0 = 3
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeString(int r4, java.lang.String r5) throws java.io.IOException {
                r3 = this;
                int r0 = r3.getTotalBytesWritten()
                r3.writeString(r5)
                int r1 = r3.getTotalBytesWritten()
                int r1 = r1 - r0
                r2 = 10
                r3.requireSpace(r2)
                r3.writeVarint32(r1)
                r2 = 2
                r3.writeTag(r4, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeString(java.lang.String r10) {
                r9 = this;
                int r0 = r10.length()
                r9.requireSpace(r0)
                int r0 = r10.length()
                int r0 = r0 + (-1)
                int r1 = r9.pos
                int r1 = r1 - r0
                r9.pos = r1
            L12:
                r1 = 128(0x80, float:1.8E-43)
                if (r0 < 0) goto L28
                char r2 = r10.charAt(r0)
                r3 = r2
                if (r2 >= r1) goto L28
                byte[] r1 = r9.buffer
                int r2 = r9.pos
                int r2 = r2 + r0
                byte r4 = (byte) r3
                r1[r2] = r4
                int r0 = r0 + (-1)
                goto L12
            L28:
                r2 = -1
                if (r0 != r2) goto L32
                int r1 = r9.pos
                int r1 = r1 + (-1)
                r9.pos = r1
                return
            L32:
                int r3 = r9.pos
                int r3 = r3 + r0
                r9.pos = r3
            L37:
                if (r0 < 0) goto L127
                char r3 = r10.charAt(r0)
                if (r3 >= r1) goto L52
                int r4 = r9.pos
                int r5 = r9.offsetMinusOne
                if (r4 <= r5) goto L52
                byte[] r4 = r9.buffer
                int r5 = r9.pos
                int r6 = r5 + (-1)
                r9.pos = r6
                byte r6 = (byte) r3
                r4[r5] = r6
                goto L124
            L52:
                r4 = 2048(0x800, float:2.87E-42)
                if (r3 >= r4) goto L7b
                int r4 = r9.pos
                int r5 = r9.offset
                if (r4 <= r5) goto L7b
                byte[] r4 = r9.buffer
                int r5 = r9.pos
                int r6 = r5 + (-1)
                r9.pos = r6
                r6 = r3 & 63
                r6 = r6 | r1
                byte r6 = (byte) r6
                r4[r5] = r6
                byte[] r4 = r9.buffer
                int r5 = r9.pos
                int r6 = r5 + (-1)
                r9.pos = r6
                int r6 = r3 >>> 6
                r6 = r6 | 960(0x3c0, float:1.345E-42)
                byte r6 = (byte) r6
                r4[r5] = r6
                goto L124
            L7b:
                r4 = 55296(0xd800, float:7.7486E-41)
                if (r3 < r4) goto L85
                r4 = 57343(0xdfff, float:8.0355E-41)
                if (r4 >= r3) goto Lbb
            L85:
                int r4 = r9.pos
                int r5 = r9.offset
                int r5 = r5 + 1
                if (r4 <= r5) goto Lbb
                byte[] r4 = r9.buffer
                int r5 = r9.pos
                int r6 = r5 + (-1)
                r9.pos = r6
                r6 = r3 & 63
                r6 = r6 | r1
                byte r6 = (byte) r6
                r4[r5] = r6
                byte[] r4 = r9.buffer
                int r5 = r9.pos
                int r6 = r5 + (-1)
                r9.pos = r6
                int r6 = r3 >>> 6
                r6 = r6 & 63
                r6 = r6 | r1
                byte r6 = (byte) r6
                r4[r5] = r6
                byte[] r4 = r9.buffer
                int r5 = r9.pos
                int r6 = r5 + (-1)
                r9.pos = r6
                int r6 = r3 >>> 12
                r6 = r6 | 480(0x1e0, float:6.73E-43)
                byte r6 = (byte) r6
                r4[r5] = r6
                goto L124
            Lbb:
                int r4 = r9.pos
                int r5 = r9.offset
                int r5 = r5 + 2
                if (r4 <= r5) goto L11f
                r4 = 0
                if (r0 == 0) goto L117
                int r5 = r0 + (-1)
                char r5 = r10.charAt(r5)
                r4 = r5
                boolean r5 = java.lang.Character.isSurrogatePair(r5, r3)
                if (r5 == 0) goto L117
                int r0 = r0 + (-1)
                int r5 = java.lang.Character.toCodePoint(r4, r3)
                byte[] r6 = r9.buffer
                int r7 = r9.pos
                int r8 = r7 + (-1)
                r9.pos = r8
                r8 = r5 & 63
                r8 = r8 | r1
                byte r8 = (byte) r8
                r6[r7] = r8
                byte[] r6 = r9.buffer
                int r7 = r9.pos
                int r8 = r7 + (-1)
                r9.pos = r8
                int r8 = r5 >>> 6
                r8 = r8 & 63
                r8 = r8 | r1
                byte r8 = (byte) r8
                r6[r7] = r8
                byte[] r6 = r9.buffer
                int r7 = r9.pos
                int r8 = r7 + (-1)
                r9.pos = r8
                int r8 = r5 >>> 12
                r8 = r8 & 63
                r8 = r8 | r1
                byte r8 = (byte) r8
                r6[r7] = r8
                byte[] r6 = r9.buffer
                int r7 = r9.pos
                int r8 = r7 + (-1)
                r9.pos = r8
                int r8 = r5 >>> 18
                r8 = r8 | 240(0xf0, float:3.36E-43)
                byte r8 = (byte) r8
                r6[r7] = r8
                goto L124
            L117:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r1 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                int r2 = r0 + (-1)
                r1.<init>(r2, r0)
                throw r1
            L11f:
                r9.requireSpace(r0)
                int r0 = r0 + 1
            L124:
                int r0 = r0 + r2
                goto L37
            L127:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeTag(int r2, int r3) {
                r1 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r2, r3)
                r1.writeVarint32(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 10
                r1.requireSpace(r0)
                r1.writeVarint32(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeVarint64(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint32(int r2) {
                r1 = this;
                r0 = r2 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L8
                r1.writeVarint32OneByte(r2)
                goto L25
            L8:
                r0 = r2 & (-16384(0xffffffffffffc000, float:NaN))
                if (r0 != 0) goto L10
                r1.writeVarint32TwoBytes(r2)
                goto L25
            L10:
                r0 = -2097152(0xffffffffffe00000, float:NaN)
                r0 = r0 & r2
                if (r0 != 0) goto L19
                r1.writeVarint32ThreeBytes(r2)
                goto L25
            L19:
                r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
                r0 = r0 & r2
                if (r0 != 0) goto L22
                r1.writeVarint32FourBytes(r2)
                goto L25
            L22:
                r1.writeVarint32FiveBytes(r2)
            L25:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint64(long r2) {
                r1 = this;
                byte r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.access$200(r2)
                switch(r0) {
                    case 1: goto L2c;
                    case 2: goto L28;
                    case 3: goto L24;
                    case 4: goto L20;
                    case 5: goto L1c;
                    case 6: goto L18;
                    case 7: goto L14;
                    case 8: goto L10;
                    case 9: goto Lc;
                    case 10: goto L8;
                    default: goto L7;
                }
            L7:
                goto L30
            L8:
                r1.writeVarint64TenBytes(r2)
                goto L30
            Lc:
                r1.writeVarint64NineBytes(r2)
                goto L30
            L10:
                r1.writeVarint64EightBytes(r2)
                goto L30
            L14:
                r1.writeVarint64SevenBytes(r2)
                goto L30
            L18:
                r1.writeVarint64SixBytes(r2)
                goto L30
            L1c:
                r1.writeVarint64FiveBytes(r2)
                goto L30
            L20:
                r1.writeVarint64FourBytes(r2)
                goto L30
            L24:
                r1.writeVarint64ThreeBytes(r2)
                goto L30
            L28:
                r1.writeVarint64TwoBytes(r2)
                goto L30
            L2c:
                r1.writeVarint64OneByte(r2)
            L30:
                return
        }
    }

    private static final class UnsafeDirectWriter extends com.google.crypto.tink.shaded.protobuf.BinaryWriter {
        private java.nio.ByteBuffer buffer;
        private long bufferOffset;
        private long limitMinusOne;
        private long pos;

        UnsafeDirectWriter(com.google.crypto.tink.shaded.protobuf.BufferAllocator r2, int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                r1.nextBuffer()
                return
        }

        static /* synthetic */ boolean access$000() {
                boolean r0 = isSupported()
                return r0
        }

        private int bufferPos() {
                r4 = this;
                long r0 = r4.pos
                long r2 = r4.bufferOffset
                long r0 = r0 - r2
                int r0 = (int) r0
                return r0
        }

        private int bytesWrittenToCurrentBuffer() {
                r4 = this;
                long r0 = r4.limitMinusOne
                long r2 = r4.pos
                long r0 = r0 - r2
                int r0 = (int) r0
                return r0
        }

        private static boolean isSupported() {
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations()
                return r0
        }

        private void nextBuffer() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r1.newDirectBuffer()
                r1.nextBuffer(r0)
                return
        }

        private void nextBuffer(int r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r1.newDirectBuffer(r2)
                r1.nextBuffer(r0)
                return
        }

        private void nextBuffer(com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r6) {
                r5 = this;
                boolean r0 = r6.hasNioBuffer()
                if (r0 == 0) goto L4e
                java.nio.ByteBuffer r0 = r6.nioBuffer()
                boolean r1 = r0.isDirect()
                if (r1 == 0) goto L46
                r5.finishCurrentBuffer()
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r1 = r5.buffers
                r1.addFirst(r6)
                r5.buffer = r0
                java.nio.ByteBuffer r1 = r5.buffer
                java.nio.ByteBuffer r2 = r5.buffer
                int r2 = r2.capacity()
                r1.limit(r2)
                java.nio.ByteBuffer r1 = r5.buffer
                r2 = 0
                r1.position(r2)
                java.nio.ByteBuffer r1 = r5.buffer
                long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.addressOffset(r1)
                r5.bufferOffset = r1
                long r1 = r5.bufferOffset
                java.nio.ByteBuffer r3 = r5.buffer
                int r3 = r3.limit()
                int r3 = r3 + (-1)
                long r3 = (long) r3
                long r1 = r1 + r3
                r5.limitMinusOne = r1
                long r1 = r5.limitMinusOne
                r5.pos = r1
                return
            L46:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Allocator returned non-direct buffer"
                r1.<init>(r2)
                throw r1
            L4e:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Allocated buffer does not have NIO buffer"
                r0.<init>(r1)
                throw r0
        }

        private int spaceLeft() {
                r1 = this;
                int r0 = r1.bufferPos()
                int r0 = r0 + 1
                return r0
        }

        private void writeVarint32FiveBytes(int r7) {
                r6 = this;
                long r0 = r6.pos
                r2 = 1
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 28
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 21
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 14
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 7
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r2 = r0 - r2
                r6.pos = r2
                r2 = r7 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r2)
                return
        }

        private void writeVarint32FourBytes(int r7) {
                r6 = this;
                long r0 = r6.pos
                r2 = 1
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 21
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 14
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 7
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r2 = r0 - r2
                r6.pos = r2
                r2 = r7 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r2)
                return
        }

        private void writeVarint32OneByte(int r5) {
                r4 = this;
                long r0 = r4.pos
                r2 = 1
                long r2 = r0 - r2
                r4.pos = r2
                byte r2 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r2)
                return
        }

        private void writeVarint32ThreeBytes(int r7) {
                r6 = this;
                long r0 = r6.pos
                r2 = 1
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 14
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 7
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r2 = r0 - r2
                r6.pos = r2
                r2 = r7 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r2)
                return
        }

        private void writeVarint32TwoBytes(int r7) {
                r6 = this;
                long r0 = r6.pos
                r2 = 1
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 7
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r2 = r0 - r2
                r6.pos = r2
                r2 = r7 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r2)
                return
        }

        private void writeVarint64EightBytes(long r11) {
                r10 = this;
                long r0 = r10.pos
                r2 = 1
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 49
                long r4 = r11 >>> r4
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 42
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 35
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 28
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 21
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 14
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r2 = r0 - r2
                r10.pos = r2
                long r2 = r11 & r6
                long r2 = r2 | r8
                int r2 = (int) r2
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r2)
                return
        }

        private void writeVarint64FiveBytes(long r11) {
                r10 = this;
                long r0 = r10.pos
                r2 = 1
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 28
                long r4 = r11 >>> r4
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 21
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 14
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r2 = r0 - r2
                r10.pos = r2
                long r2 = r11 & r6
                long r2 = r2 | r8
                int r2 = (int) r2
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r2)
                return
        }

        private void writeVarint64FourBytes(long r11) {
                r10 = this;
                long r0 = r10.pos
                r2 = 1
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 21
                long r4 = r11 >>> r4
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 14
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r2 = r0 - r2
                r10.pos = r2
                long r2 = r11 & r6
                long r2 = r2 | r8
                int r2 = (int) r2
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r2)
                return
        }

        private void writeVarint64NineBytes(long r11) {
                r10 = this;
                long r0 = r10.pos
                r2 = 1
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 56
                long r4 = r11 >>> r4
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 49
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 42
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 35
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 28
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 21
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 14
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r2 = r0 - r2
                r10.pos = r2
                long r2 = r11 & r6
                long r2 = r2 | r8
                int r2 = (int) r2
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r2)
                return
        }

        private void writeVarint64OneByte(long r5) {
                r4 = this;
                long r0 = r4.pos
                r2 = 1
                long r2 = r0 - r2
                r4.pos = r2
                int r2 = (int) r5
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r2)
                return
        }

        private void writeVarint64SevenBytes(long r11) {
                r10 = this;
                long r0 = r10.pos
                r2 = 1
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 42
                long r4 = r11 >>> r4
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 35
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 28
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 21
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 14
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r2 = r0 - r2
                r10.pos = r2
                long r2 = r11 & r6
                long r2 = r2 | r8
                int r2 = (int) r2
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r2)
                return
        }

        private void writeVarint64SixBytes(long r11) {
                r10 = this;
                long r0 = r10.pos
                r2 = 1
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 35
                long r4 = r11 >>> r4
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 28
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 21
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 14
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r2 = r0 - r2
                r10.pos = r2
                long r2 = r11 & r6
                long r2 = r2 | r8
                int r2 = (int) r2
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r2)
                return
        }

        private void writeVarint64TenBytes(long r11) {
                r10 = this;
                long r0 = r10.pos
                r2 = 1
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 63
                long r4 = r11 >>> r4
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 56
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 49
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 42
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 35
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 28
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 21
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 14
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r2 = r0 - r2
                r10.pos = r2
                long r2 = r11 & r6
                long r2 = r2 | r8
                int r2 = (int) r2
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r2)
                return
        }

        private void writeVarint64ThreeBytes(long r11) {
                r10 = this;
                long r0 = r10.pos
                r2 = 1
                long r4 = r0 - r2
                r10.pos = r4
                int r4 = (int) r11
                int r4 = r4 >>> 14
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 7
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r2 = r0 - r2
                r10.pos = r2
                long r2 = r11 & r6
                long r2 = r2 | r8
                int r2 = (int) r2
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r2)
                return
        }

        private void writeVarint64TwoBytes(long r7) {
                r6 = this;
                long r0 = r6.pos
                r2 = 1
                long r4 = r0 - r2
                r6.pos = r4
                r4 = 7
                long r4 = r7 >>> r4
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r2 = r0 - r2
                r6.pos = r2
                int r2 = (int) r7
                r2 = r2 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void finishCurrentBuffer() {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.buffer
                if (r0 == 0) goto L21
                int r0 = r2.totalDoneBytes
                int r1 = r2.bytesWrittenToCurrentBuffer()
                int r0 = r0 + r1
                r2.totalDoneBytes = r0
                java.nio.ByteBuffer r0 = r2.buffer
                int r1 = r2.bufferPos()
                int r1 = r1 + 1
                r0.position(r1)
                r0 = 0
                r2.buffer = r0
                r0 = 0
                r2.pos = r0
                r2.limitMinusOne = r0
            L21:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
                r2 = this;
                int r0 = r2.totalDoneBytes
                int r1 = r2.bytesWrittenToCurrentBuffer()
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void requireSpace(int r2) {
                r1 = this;
                int r0 = r1.spaceLeft()
                if (r0 >= r2) goto L9
                r1.nextBuffer(r2)
            L9:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte r5) {
                r4 = this;
                long r0 = r4.pos
                r2 = 1
                long r2 = r0 - r2
                r4.pos = r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer r6) {
                r5 = this;
                int r0 = r6.remaining()
                int r1 = r5.spaceLeft()
                if (r1 >= r0) goto Ld
                r5.nextBuffer(r0)
            Ld:
                long r1 = r5.pos
                long r3 = (long) r0
                long r1 = r1 - r3
                r5.pos = r1
                java.nio.ByteBuffer r1 = r5.buffer
                int r2 = r5.bufferPos()
                int r2 = r2 + 1
                r1.position(r2)
                java.nio.ByteBuffer r1 = r5.buffer
                r1.put(r6)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] r5, int r6, int r7) {
                r4 = this;
                int r0 = r4.spaceLeft()
                if (r0 >= r7) goto L9
                r4.nextBuffer(r7)
            L9:
                long r0 = r4.pos
                long r2 = (long) r7
                long r0 = r0 - r2
                r4.pos = r0
                java.nio.ByteBuffer r0 = r4.buffer
                int r1 = r4.bufferPos()
                int r1 = r1 + 1
                r0.position(r1)
                java.nio.ByteBuffer r0 = r4.buffer
                r0.put(r5, r6, r7)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBool(int r2, boolean r3) {
                r1 = this;
                r0 = 6
                r1.requireSpace(r0)
                byte r0 = (byte) r3
                r1.write(r0)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeBool(boolean r2) {
                r1 = this;
                byte r0 = (byte) r2
                r1.write(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBytes(int r3, com.google.crypto.tink.shaded.protobuf.ByteString r4) {
                r2 = this;
                r4.writeToReverse(r2)     // Catch: java.io.IOException -> L15
                r0 = 10
                r2.requireSpace(r0)
                int r0 = r4.size()
                r2.writeVarint32(r0)
                r0 = 2
                r2.writeTag(r3, r0)
                return
            L15:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @java.lang.Deprecated
        public void writeEndGroup(int r2) {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed32(int r7) {
                r6 = this;
                long r0 = r6.pos
                r2 = 1
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >> 24
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >> 16
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >> 8
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r2 = r0 - r2
                r6.pos = r2
                r2 = r7 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed32(int r2, int r3) {
                r1 = this;
                r0 = 9
                r1.requireSpace(r0)
                r1.writeFixed32(r3)
                r0 = 5
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed64(int r2, long r3) {
                r1 = this;
                r0 = 13
                r1.requireSpace(r0)
                r1.writeFixed64(r3)
                r0 = 1
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed64(long r7) {
                r6 = this;
                long r0 = r6.pos
                r2 = 1
                long r4 = r0 - r2
                r6.pos = r4
                r4 = 56
                long r4 = r7 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                r4 = 48
                long r4 = r7 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                r4 = 40
                long r4 = r7 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                r4 = 32
                long r4 = r7 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                r4 = 24
                long r4 = r7 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                r4 = 16
                long r4 = r7 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                r4 = 8
                long r4 = r7 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r2 = r0 - r2
                r6.pos = r2
                int r2 = (int) r7
                r2 = r2 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int r2, java.lang.Object r3) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                r0.writeTo(r3, r1)
                r0 = 3
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                r4.writeTo(r3, r1)
                r0 = 3
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeInt32(int r3) {
                r2 = this;
                if (r3 < 0) goto L6
                r2.writeVarint32(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.writeVarint64(r0)
            La:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeInt32(int r2, int r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeInt32(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer r6) {
                r5 = this;
                int r0 = r6.remaining()
                int r1 = r5.spaceLeft()
                if (r1 >= r0) goto L1c
                int r1 = r5.totalDoneBytes
                int r1 = r1 + r0
                r5.totalDoneBytes = r1
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r1 = r5.buffers
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r2 = com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(r6)
                r1.addFirst(r2)
                r5.nextBuffer()
                return
            L1c:
                long r1 = r5.pos
                long r3 = (long) r0
                long r1 = r1 - r3
                r5.pos = r1
                java.nio.ByteBuffer r1 = r5.buffer
                int r2 = r5.bufferPos()
                int r2 = r2 + 1
                r1.position(r2)
                java.nio.ByteBuffer r1 = r5.buffer
                r1.put(r6)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] r5, int r6, int r7) {
                r4 = this;
                int r0 = r4.spaceLeft()
                if (r0 >= r7) goto L18
                int r0 = r4.totalDoneBytes
                int r0 = r0 + r7
                r4.totalDoneBytes = r0
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r0 = r4.buffers
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r1 = com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(r5, r6, r7)
                r0.addFirst(r1)
                r4.nextBuffer()
                return
            L18:
                long r0 = r4.pos
                long r2 = (long) r7
                long r0 = r0 - r2
                r4.pos = r0
                java.nio.ByteBuffer r0 = r4.buffer
                int r1 = r4.bufferPos()
                int r1 = r1 + 1
                r0.position(r1)
                java.nio.ByteBuffer r0 = r4.buffer
                r0.put(r5, r6, r7)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int r4, java.lang.Object r5) throws java.io.IOException {
                r3 = this;
                int r0 = r3.getTotalBytesWritten()
                com.google.crypto.tink.shaded.protobuf.Protobuf r1 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                r1.writeTo(r5, r3)
                int r1 = r3.getTotalBytesWritten()
                int r1 = r1 - r0
                r2 = 10
                r3.requireSpace(r2)
                r3.writeVarint32(r1)
                r2 = 2
                r3.writeTag(r4, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int r4, java.lang.Object r5, com.google.crypto.tink.shaded.protobuf.Schema r6) throws java.io.IOException {
                r3 = this;
                int r0 = r3.getTotalBytesWritten()
                r6.writeTo(r5, r3)
                int r1 = r3.getTotalBytesWritten()
                int r1 = r1 - r0
                r2 = 10
                r3.requireSpace(r2)
                r3.writeVarint32(r1)
                r2 = 2
                r3.writeTag(r4, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt32(int r2) {
                r1 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.encodeZigZag32(r2)
                r1.writeVarint32(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt32(int r2, int r3) {
                r1 = this;
                r0 = 10
                r1.requireSpace(r0)
                r1.writeSInt32(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt64(int r2, long r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeSInt64(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt64(long r3) {
                r2 = this;
                long r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.encodeZigZag64(r3)
                r2.writeVarint64(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @java.lang.Deprecated
        public void writeStartGroup(int r2) {
                r1 = this;
                r0 = 3
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeString(int r4, java.lang.String r5) {
                r3 = this;
                int r0 = r3.getTotalBytesWritten()
                r3.writeString(r5)
                int r1 = r3.getTotalBytesWritten()
                int r1 = r1 - r0
                r2 = 10
                r3.requireSpace(r2)
                r3.writeVarint32(r1)
                r2 = 2
                r3.writeTag(r4, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeString(java.lang.String r13) {
                r12 = this;
                int r0 = r13.length()
                r12.requireSpace(r0)
                int r0 = r13.length()
                int r0 = r0 + (-1)
            Ld:
                r1 = 128(0x80, float:1.8E-43)
                r2 = 1
                if (r0 < 0) goto L27
                char r4 = r13.charAt(r0)
                r5 = r4
                if (r4 >= r1) goto L27
                long r6 = r12.pos
                long r1 = r6 - r2
                r12.pos = r1
                byte r1 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r1)
                int r0 = r0 + (-1)
                goto Ld
            L27:
                r4 = -1
                if (r0 != r4) goto L2b
                return
            L2b:
                if (r0 < 0) goto L118
                char r5 = r13.charAt(r0)
                if (r5 >= r1) goto L47
                long r6 = r12.pos
                long r8 = r12.bufferOffset
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 < 0) goto L47
                long r6 = r12.pos
                long r8 = r6 - r2
                r12.pos = r8
                byte r8 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r8)
                goto L115
            L47:
                r6 = 2048(0x800, float:2.87E-42)
                if (r5 >= r6) goto L70
                long r6 = r12.pos
                long r8 = r12.bufferOffset
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 <= 0) goto L70
                long r6 = r12.pos
                long r8 = r6 - r2
                r12.pos = r8
                r8 = r5 & 63
                r8 = r8 | r1
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r8)
                long r6 = r12.pos
                long r8 = r6 - r2
                r12.pos = r8
                int r8 = r5 >>> 6
                r8 = r8 | 960(0x3c0, float:1.345E-42)
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r8)
                goto L115
            L70:
                r6 = 55296(0xd800, float:7.7486E-41)
                if (r5 < r6) goto L7a
                r6 = 57343(0xdfff, float:8.0355E-41)
                if (r6 >= r5) goto Lae
            L7a:
                long r6 = r12.pos
                long r8 = r12.bufferOffset
                long r8 = r8 + r2
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 <= 0) goto Lae
                long r6 = r12.pos
                long r8 = r6 - r2
                r12.pos = r8
                r8 = r5 & 63
                r8 = r8 | r1
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r8)
                long r6 = r12.pos
                long r8 = r6 - r2
                r12.pos = r8
                int r8 = r5 >>> 6
                r8 = r8 & 63
                r8 = r8 | r1
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r8)
                long r6 = r12.pos
                long r8 = r6 - r2
                r12.pos = r8
                int r8 = r5 >>> 12
                r8 = r8 | 480(0x1e0, float:6.73E-43)
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r8)
                goto L115
            Lae:
                long r6 = r12.pos
                long r8 = r12.bufferOffset
                r10 = 2
                long r8 = r8 + r10
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 <= 0) goto L110
                if (r0 == 0) goto L108
                int r6 = r0 + (-1)
                char r6 = r13.charAt(r6)
                r7 = r6
                boolean r6 = java.lang.Character.isSurrogatePair(r6, r5)
                if (r6 == 0) goto L108
                int r0 = r0 + (-1)
                int r6 = java.lang.Character.toCodePoint(r7, r5)
                long r8 = r12.pos
                long r10 = r8 - r2
                r12.pos = r10
                r10 = r6 & 63
                r10 = r10 | r1
                byte r10 = (byte) r10
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r8, r10)
                long r8 = r12.pos
                long r10 = r8 - r2
                r12.pos = r10
                int r10 = r6 >>> 6
                r10 = r10 & 63
                r10 = r10 | r1
                byte r10 = (byte) r10
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r8, r10)
                long r8 = r12.pos
                long r10 = r8 - r2
                r12.pos = r10
                int r10 = r6 >>> 12
                r10 = r10 & 63
                r10 = r10 | r1
                byte r10 = (byte) r10
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r8, r10)
                long r8 = r12.pos
                long r10 = r8 - r2
                r12.pos = r10
                int r10 = r6 >>> 18
                r10 = r10 | 240(0xf0, float:3.36E-43)
                byte r10 = (byte) r10
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r8, r10)
                goto L115
            L108:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r1 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                int r2 = r0 + (-1)
                r1.<init>(r2, r0)
                throw r1
            L110:
                r12.requireSpace(r0)
                int r0 = r0 + 1
            L115:
                int r0 = r0 + r4
                goto L2b
            L118:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeTag(int r2, int r3) {
                r1 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r2, r3)
                r1.writeVarint32(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt32(int r2, int r3) {
                r1 = this;
                r0 = 10
                r1.requireSpace(r0)
                r1.writeVarint32(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt64(int r2, long r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeVarint64(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint32(int r2) {
                r1 = this;
                r0 = r2 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L8
                r1.writeVarint32OneByte(r2)
                goto L25
            L8:
                r0 = r2 & (-16384(0xffffffffffffc000, float:NaN))
                if (r0 != 0) goto L10
                r1.writeVarint32TwoBytes(r2)
                goto L25
            L10:
                r0 = -2097152(0xffffffffffe00000, float:NaN)
                r0 = r0 & r2
                if (r0 != 0) goto L19
                r1.writeVarint32ThreeBytes(r2)
                goto L25
            L19:
                r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
                r0 = r0 & r2
                if (r0 != 0) goto L22
                r1.writeVarint32FourBytes(r2)
                goto L25
            L22:
                r1.writeVarint32FiveBytes(r2)
            L25:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint64(long r2) {
                r1 = this;
                byte r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.access$200(r2)
                switch(r0) {
                    case 1: goto L2c;
                    case 2: goto L28;
                    case 3: goto L24;
                    case 4: goto L20;
                    case 5: goto L1c;
                    case 6: goto L18;
                    case 7: goto L14;
                    case 8: goto L10;
                    case 9: goto Lc;
                    case 10: goto L8;
                    default: goto L7;
                }
            L7:
                goto L30
            L8:
                r1.writeVarint64TenBytes(r2)
                goto L30
            Lc:
                r1.writeVarint64NineBytes(r2)
                goto L30
            L10:
                r1.writeVarint64EightBytes(r2)
                goto L30
            L14:
                r1.writeVarint64SevenBytes(r2)
                goto L30
            L18:
                r1.writeVarint64SixBytes(r2)
                goto L30
            L1c:
                r1.writeVarint64FiveBytes(r2)
                goto L30
            L20:
                r1.writeVarint64FourBytes(r2)
                goto L30
            L24:
                r1.writeVarint64ThreeBytes(r2)
                goto L30
            L28:
                r1.writeVarint64TwoBytes(r2)
                goto L30
            L2c:
                r1.writeVarint64OneByte(r2)
            L30:
                return
        }
    }

    private static final class UnsafeHeapWriter extends com.google.crypto.tink.shaded.protobuf.BinaryWriter {
        private com.google.crypto.tink.shaded.protobuf.AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private long limit;
        private long limitMinusOne;
        private long offset;
        private long offsetMinusOne;
        private long pos;

        UnsafeHeapWriter(com.google.crypto.tink.shaded.protobuf.BufferAllocator r2, int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                r1.nextBuffer()
                return
        }

        private int arrayPos() {
                r2 = this;
                long r0 = r2.pos
                int r0 = (int) r0
                return r0
        }

        static boolean isSupported() {
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.hasUnsafeArrayOperations()
                return r0
        }

        private void nextBuffer() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r1.newHeapBuffer()
                r1.nextBuffer(r0)
                return
        }

        private void nextBuffer(int r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r1.newHeapBuffer(r2)
                r1.nextBuffer(r0)
                return
        }

        private void nextBuffer(com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r6) {
                r5 = this;
                boolean r0 = r6.hasArray()
                if (r0 == 0) goto L3d
                r5.finishCurrentBuffer()
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r0 = r5.buffers
                r0.addFirst(r6)
                r5.allocatedBuffer = r6
                byte[] r0 = r6.array()
                r5.buffer = r0
                int r0 = r6.arrayOffset()
                long r1 = (long) r0
                int r3 = r6.limit()
                long r3 = (long) r3
                long r1 = r1 + r3
                r5.limit = r1
                long r1 = (long) r0
                int r3 = r6.position()
                long r3 = (long) r3
                long r1 = r1 + r3
                r5.offset = r1
                long r1 = r5.offset
                r3 = 1
                long r1 = r1 - r3
                r5.offsetMinusOne = r1
                long r1 = r5.limit
                long r1 = r1 - r3
                r5.limitMinusOne = r1
                long r1 = r5.limitMinusOne
                r5.pos = r1
                return
            L3d:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Allocator returned non-heap buffer"
                r0.<init>(r1)
                throw r0
        }

        private void writeVarint32FiveBytes(int r8) {
                r7 = this;
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                r3 = 1
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 28
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 21
                r5 = r5 & 127(0x7f, float:1.78E-43)
                r5 = r5 | 128(0x80, float:1.8E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 14
                r5 = r5 & 127(0x7f, float:1.78E-43)
                r5 = r5 | 128(0x80, float:1.8E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 7
                r5 = r5 & 127(0x7f, float:1.78E-43)
                r5 = r5 | 128(0x80, float:1.8E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r3 = r1 - r3
                r7.pos = r3
                r3 = r8 & 127(0x7f, float:1.78E-43)
                r3 = r3 | 128(0x80, float:1.8E-43)
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                return
        }

        private void writeVarint32FourBytes(int r8) {
                r7 = this;
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                r3 = 1
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 21
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 14
                r5 = r5 & 127(0x7f, float:1.78E-43)
                r5 = r5 | 128(0x80, float:1.8E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 7
                r5 = r5 & 127(0x7f, float:1.78E-43)
                r5 = r5 | 128(0x80, float:1.8E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r3 = r1 - r3
                r7.pos = r3
                r3 = r8 & 127(0x7f, float:1.78E-43)
                r3 = r3 | 128(0x80, float:1.8E-43)
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                return
        }

        private void writeVarint32OneByte(int r6) {
                r5 = this;
                byte[] r0 = r5.buffer
                long r1 = r5.pos
                r3 = 1
                long r3 = r1 - r3
                r5.pos = r3
                byte r3 = (byte) r6
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                return
        }

        private void writeVarint32ThreeBytes(int r8) {
                r7 = this;
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                r3 = 1
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 14
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 7
                r5 = r5 & 127(0x7f, float:1.78E-43)
                r5 = r5 | 128(0x80, float:1.8E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r3 = r1 - r3
                r7.pos = r3
                r3 = r8 & 127(0x7f, float:1.78E-43)
                r3 = r3 | 128(0x80, float:1.8E-43)
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                return
        }

        private void writeVarint32TwoBytes(int r8) {
                r7 = this;
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                r3 = 1
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 7
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r3 = r1 - r3
                r7.pos = r3
                r3 = r8 & 127(0x7f, float:1.78E-43)
                r3 = r3 | 128(0x80, float:1.8E-43)
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                return
        }

        private void writeVarint64EightBytes(long r12) {
                r11 = this;
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                r3 = 1
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 49
                long r5 = r12 >>> r5
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 42
                long r5 = r12 >>> r5
                r7 = 127(0x7f, double:6.27E-322)
                long r5 = r5 & r7
                r9 = 128(0x80, double:6.3E-322)
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 35
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 28
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 21
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 14
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 7
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r3 = r1 - r3
                r11.pos = r3
                long r3 = r12 & r7
                long r3 = r3 | r9
                int r3 = (int) r3
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                return
        }

        private void writeVarint64FiveBytes(long r12) {
                r11 = this;
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                r3 = 1
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 28
                long r5 = r12 >>> r5
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 21
                long r5 = r12 >>> r5
                r7 = 127(0x7f, double:6.27E-322)
                long r5 = r5 & r7
                r9 = 128(0x80, double:6.3E-322)
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 14
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 7
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r3 = r1 - r3
                r11.pos = r3
                long r3 = r12 & r7
                long r3 = r3 | r9
                int r3 = (int) r3
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                return
        }

        private void writeVarint64FourBytes(long r12) {
                r11 = this;
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                r3 = 1
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 21
                long r5 = r12 >>> r5
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 14
                long r5 = r12 >>> r5
                r7 = 127(0x7f, double:6.27E-322)
                long r5 = r5 & r7
                r9 = 128(0x80, double:6.3E-322)
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 7
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r3 = r1 - r3
                r11.pos = r3
                long r3 = r12 & r7
                long r3 = r3 | r9
                int r3 = (int) r3
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                return
        }

        private void writeVarint64NineBytes(long r12) {
                r11 = this;
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                r3 = 1
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 56
                long r5 = r12 >>> r5
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 49
                long r5 = r12 >>> r5
                r7 = 127(0x7f, double:6.27E-322)
                long r5 = r5 & r7
                r9 = 128(0x80, double:6.3E-322)
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 42
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 35
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 28
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 21
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 14
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 7
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r3 = r1 - r3
                r11.pos = r3
                long r3 = r12 & r7
                long r3 = r3 | r9
                int r3 = (int) r3
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                return
        }

        private void writeVarint64OneByte(long r6) {
                r5 = this;
                byte[] r0 = r5.buffer
                long r1 = r5.pos
                r3 = 1
                long r3 = r1 - r3
                r5.pos = r3
                int r3 = (int) r6
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                return
        }

        private void writeVarint64SevenBytes(long r12) {
                r11 = this;
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                r3 = 1
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 42
                long r5 = r12 >>> r5
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 35
                long r5 = r12 >>> r5
                r7 = 127(0x7f, double:6.27E-322)
                long r5 = r5 & r7
                r9 = 128(0x80, double:6.3E-322)
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 28
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 21
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 14
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 7
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r3 = r1 - r3
                r11.pos = r3
                long r3 = r12 & r7
                long r3 = r3 | r9
                int r3 = (int) r3
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                return
        }

        private void writeVarint64SixBytes(long r12) {
                r11 = this;
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                r3 = 1
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 35
                long r5 = r12 >>> r5
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 28
                long r5 = r12 >>> r5
                r7 = 127(0x7f, double:6.27E-322)
                long r5 = r5 & r7
                r9 = 128(0x80, double:6.3E-322)
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 21
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 14
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 7
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r3 = r1 - r3
                r11.pos = r3
                long r3 = r12 & r7
                long r3 = r3 | r9
                int r3 = (int) r3
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                return
        }

        private void writeVarint64TenBytes(long r12) {
                r11 = this;
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                r3 = 1
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 63
                long r5 = r12 >>> r5
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 56
                long r5 = r12 >>> r5
                r7 = 127(0x7f, double:6.27E-322)
                long r5 = r5 & r7
                r9 = 128(0x80, double:6.3E-322)
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 49
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 42
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 35
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 28
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 21
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 14
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 7
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r3 = r1 - r3
                r11.pos = r3
                long r3 = r12 & r7
                long r3 = r3 | r9
                int r3 = (int) r3
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                return
        }

        private void writeVarint64ThreeBytes(long r12) {
                r11 = this;
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                r3 = 1
                long r5 = r1 - r3
                r11.pos = r5
                int r5 = (int) r12
                int r5 = r5 >>> 14
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 7
                long r5 = r12 >>> r5
                r7 = 127(0x7f, double:6.27E-322)
                long r5 = r5 & r7
                r9 = 128(0x80, double:6.3E-322)
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r3 = r1 - r3
                r11.pos = r3
                long r3 = r12 & r7
                long r3 = r3 | r9
                int r3 = (int) r3
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                return
        }

        private void writeVarint64TwoBytes(long r8) {
                r7 = this;
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                r3 = 1
                long r5 = r1 - r3
                r7.pos = r5
                r5 = 7
                long r5 = r8 >>> r5
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r3 = r1 - r3
                r7.pos = r3
                int r3 = (int) r8
                r3 = r3 & 127(0x7f, float:1.78E-43)
                r3 = r3 | 128(0x80, float:1.8E-43)
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                return
        }

        int bytesWrittenToCurrentBuffer() {
                r4 = this;
                long r0 = r4.limitMinusOne
                long r2 = r4.pos
                long r0 = r0 - r2
                int r0 = (int) r0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void finishCurrentBuffer() {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r3.allocatedBuffer
                if (r0 == 0) goto L28
                int r0 = r3.totalDoneBytes
                int r1 = r3.bytesWrittenToCurrentBuffer()
                int r0 = r0 + r1
                r3.totalDoneBytes = r0
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r3.allocatedBuffer
                int r1 = r3.arrayPos()
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r2 = r3.allocatedBuffer
                int r2 = r2.arrayOffset()
                int r1 = r1 - r2
                int r1 = r1 + 1
                r0.position(r1)
                r0 = 0
                r3.allocatedBuffer = r0
                r0 = 0
                r3.pos = r0
                r3.limitMinusOne = r0
            L28:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
                r2 = this;
                int r0 = r2.totalDoneBytes
                int r1 = r2.bytesWrittenToCurrentBuffer()
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void requireSpace(int r2) {
                r1 = this;
                int r0 = r1.spaceLeft()
                if (r0 >= r2) goto L9
                r1.nextBuffer(r2)
            L9:
                return
        }

        int spaceLeft() {
                r4 = this;
                long r0 = r4.pos
                long r2 = r4.offsetMinusOne
                long r0 = r0 - r2
                int r0 = (int) r0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte r6) {
                r5 = this;
                byte[] r0 = r5.buffer
                long r1 = r5.pos
                r3 = 1
                long r3 = r1 - r3
                r5.pos = r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r6)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer r6) {
                r5 = this;
                int r0 = r6.remaining()
                r5.requireSpace(r0)
                long r1 = r5.pos
                long r3 = (long) r0
                long r1 = r1 - r3
                r5.pos = r1
                byte[] r1 = r5.buffer
                int r2 = r5.arrayPos()
                int r2 = r2 + 1
                r6.get(r1, r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] r5, int r6, int r7) {
                r4 = this;
                if (r6 < 0) goto L1c
                int r0 = r6 + r7
                int r1 = r5.length
                if (r0 > r1) goto L1c
                r4.requireSpace(r7)
                long r0 = r4.pos
                long r2 = (long) r7
                long r0 = r0 - r2
                r4.pos = r0
                byte[] r0 = r4.buffer
                int r1 = r4.arrayPos()
                int r1 = r1 + 1
                java.lang.System.arraycopy(r5, r6, r0, r1, r7)
                return
            L1c:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                int r1 = r5.length
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
                java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
                java.lang.String r2 = "value.length=%d, offset=%d, length=%d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBool(int r2, boolean r3) {
                r1 = this;
                r0 = 6
                r1.requireSpace(r0)
                byte r0 = (byte) r3
                r1.write(r0)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeBool(boolean r2) {
                r1 = this;
                byte r0 = (byte) r2
                r1.write(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBytes(int r3, com.google.crypto.tink.shaded.protobuf.ByteString r4) {
                r2 = this;
                r4.writeToReverse(r2)     // Catch: java.io.IOException -> L15
                r0 = 10
                r2.requireSpace(r0)
                int r0 = r4.size()
                r2.writeVarint32(r0)
                r0 = 2
                r2.writeTag(r3, r0)
                return
            L15:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeEndGroup(int r2) {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed32(int r8) {
                r7 = this;
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                r3 = 1
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >> 24
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >> 16
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >> 8
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r3 = r1 - r3
                r7.pos = r3
                r3 = r8 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed32(int r2, int r3) {
                r1 = this;
                r0 = 9
                r1.requireSpace(r0)
                r1.writeFixed32(r3)
                r0 = 5
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed64(int r2, long r3) {
                r1 = this;
                r0 = 13
                r1.requireSpace(r0)
                r1.writeFixed64(r3)
                r0 = 1
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed64(long r8) {
                r7 = this;
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                r3 = 1
                long r5 = r1 - r3
                r7.pos = r5
                r5 = 56
                long r5 = r8 >> r5
                int r5 = (int) r5
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                r5 = 48
                long r5 = r8 >> r5
                int r5 = (int) r5
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                r5 = 40
                long r5 = r8 >> r5
                int r5 = (int) r5
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                r5 = 32
                long r5 = r8 >> r5
                int r5 = (int) r5
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                r5 = 24
                long r5 = r8 >> r5
                int r5 = (int) r5
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                r5 = 16
                long r5 = r8 >> r5
                int r5 = (int) r5
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                r5 = 8
                long r5 = r8 >> r5
                int r5 = (int) r5
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r3 = r1 - r3
                r7.pos = r3
                int r3 = (int) r8
                r3 = r3 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int r2, java.lang.Object r3) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                r0.writeTo(r3, r1)
                r0 = 3
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                r4.writeTo(r3, r1)
                r0 = 3
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeInt32(int r3) {
                r2 = this;
                if (r3 < 0) goto L6
                r2.writeVarint32(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.writeVarint64(r0)
            La:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeInt32(int r2, int r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeInt32(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer r6) {
                r5 = this;
                int r0 = r6.remaining()
                int r1 = r5.spaceLeft()
                if (r1 >= r0) goto L1b
                int r1 = r5.totalDoneBytes
                int r1 = r1 + r0
                r5.totalDoneBytes = r1
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r1 = r5.buffers
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r2 = com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(r6)
                r1.addFirst(r2)
                r5.nextBuffer()
            L1b:
                long r1 = r5.pos
                long r3 = (long) r0
                long r1 = r1 - r3
                r5.pos = r1
                byte[] r1 = r5.buffer
                int r2 = r5.arrayPos()
                int r2 = r2 + 1
                r6.get(r1, r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] r5, int r6, int r7) {
                r4 = this;
                if (r6 < 0) goto L31
                int r0 = r6 + r7
                int r1 = r5.length
                if (r0 > r1) goto L31
                int r0 = r4.spaceLeft()
                if (r0 >= r7) goto L1f
                int r0 = r4.totalDoneBytes
                int r0 = r0 + r7
                r4.totalDoneBytes = r0
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r0 = r4.buffers
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r1 = com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(r5, r6, r7)
                r0.addFirst(r1)
                r4.nextBuffer()
                return
            L1f:
                long r0 = r4.pos
                long r2 = (long) r7
                long r0 = r0 - r2
                r4.pos = r0
                byte[] r0 = r4.buffer
                int r1 = r4.arrayPos()
                int r1 = r1 + 1
                java.lang.System.arraycopy(r5, r6, r0, r1, r7)
                return
            L31:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                int r1 = r5.length
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
                java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
                java.lang.String r2 = "value.length=%d, offset=%d, length=%d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int r4, java.lang.Object r5) throws java.io.IOException {
                r3 = this;
                int r0 = r3.getTotalBytesWritten()
                com.google.crypto.tink.shaded.protobuf.Protobuf r1 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                r1.writeTo(r5, r3)
                int r1 = r3.getTotalBytesWritten()
                int r1 = r1 - r0
                r2 = 10
                r3.requireSpace(r2)
                r3.writeVarint32(r1)
                r2 = 2
                r3.writeTag(r4, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int r4, java.lang.Object r5, com.google.crypto.tink.shaded.protobuf.Schema r6) throws java.io.IOException {
                r3 = this;
                int r0 = r3.getTotalBytesWritten()
                r6.writeTo(r5, r3)
                int r1 = r3.getTotalBytesWritten()
                int r1 = r1 - r0
                r2 = 10
                r3.requireSpace(r2)
                r3.writeVarint32(r1)
                r2 = 2
                r3.writeTag(r4, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt32(int r2) {
                r1 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.encodeZigZag32(r2)
                r1.writeVarint32(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt32(int r2, int r3) {
                r1 = this;
                r0 = 10
                r1.requireSpace(r0)
                r1.writeSInt32(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt64(int r2, long r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeSInt64(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt64(long r3) {
                r2 = this;
                long r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.encodeZigZag64(r3)
                r2.writeVarint64(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeStartGroup(int r2) {
                r1 = this;
                r0 = 3
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeString(int r4, java.lang.String r5) {
                r3 = this;
                int r0 = r3.getTotalBytesWritten()
                r3.writeString(r5)
                int r1 = r3.getTotalBytesWritten()
                int r1 = r1 - r0
                r2 = 10
                r3.requireSpace(r2)
                r3.writeVarint32(r1)
                r2 = 2
                r3.writeTag(r4, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeString(java.lang.String r14) {
                r13 = this;
                int r0 = r14.length()
                r13.requireSpace(r0)
                int r0 = r14.length()
                int r0 = r0 + (-1)
            Ld:
                r1 = 128(0x80, float:1.8E-43)
                r2 = 1
                if (r0 < 0) goto L29
                char r4 = r14.charAt(r0)
                r5 = r4
                if (r4 >= r1) goto L29
                byte[] r1 = r13.buffer
                long r6 = r13.pos
                long r2 = r6 - r2
                r13.pos = r2
                byte r2 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r6, r2)
                int r0 = r0 + (-1)
                goto Ld
            L29:
                r4 = -1
                if (r0 != r4) goto L2d
                return
            L2d:
                if (r0 < 0) goto L12e
                char r5 = r14.charAt(r0)
                if (r5 >= r1) goto L4b
                long r6 = r13.pos
                long r8 = r13.offsetMinusOne
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 <= 0) goto L4b
                byte[] r6 = r13.buffer
                long r7 = r13.pos
                long r9 = r7 - r2
                r13.pos = r9
                byte r9 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r7, r9)
                goto L12b
            L4b:
                r6 = 2048(0x800, float:2.87E-42)
                if (r5 >= r6) goto L78
                long r6 = r13.pos
                long r8 = r13.offset
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 <= 0) goto L78
                byte[] r6 = r13.buffer
                long r7 = r13.pos
                long r9 = r7 - r2
                r13.pos = r9
                r9 = r5 & 63
                r9 = r9 | r1
                byte r9 = (byte) r9
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r7, r9)
                byte[] r6 = r13.buffer
                long r7 = r13.pos
                long r9 = r7 - r2
                r13.pos = r9
                int r9 = r5 >>> 6
                r9 = r9 | 960(0x3c0, float:1.345E-42)
                byte r9 = (byte) r9
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r7, r9)
                goto L12b
            L78:
                r6 = 55296(0xd800, float:7.7486E-41)
                if (r5 < r6) goto L82
                r6 = 57343(0xdfff, float:8.0355E-41)
                if (r6 >= r5) goto Lbc
            L82:
                long r6 = r13.pos
                long r8 = r13.offset
                long r8 = r8 + r2
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 <= 0) goto Lbc
                byte[] r6 = r13.buffer
                long r7 = r13.pos
                long r9 = r7 - r2
                r13.pos = r9
                r9 = r5 & 63
                r9 = r9 | r1
                byte r9 = (byte) r9
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r7, r9)
                byte[] r6 = r13.buffer
                long r7 = r13.pos
                long r9 = r7 - r2
                r13.pos = r9
                int r9 = r5 >>> 6
                r9 = r9 & 63
                r9 = r9 | r1
                byte r9 = (byte) r9
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r7, r9)
                byte[] r6 = r13.buffer
                long r7 = r13.pos
                long r9 = r7 - r2
                r13.pos = r9
                int r9 = r5 >>> 12
                r9 = r9 | 480(0x1e0, float:6.73E-43)
                byte r9 = (byte) r9
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r7, r9)
                goto L12b
            Lbc:
                long r6 = r13.pos
                long r8 = r13.offset
                r10 = 2
                long r8 = r8 + r10
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 <= 0) goto L126
                if (r0 == 0) goto L11e
                int r6 = r0 + (-1)
                char r6 = r14.charAt(r6)
                r7 = r6
                boolean r6 = java.lang.Character.isSurrogatePair(r6, r5)
                if (r6 == 0) goto L11e
                int r0 = r0 + (-1)
                int r6 = java.lang.Character.toCodePoint(r7, r5)
                byte[] r8 = r13.buffer
                long r9 = r13.pos
                long r11 = r9 - r2
                r13.pos = r11
                r11 = r6 & 63
                r11 = r11 | r1
                byte r11 = (byte) r11
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r8, r9, r11)
                byte[] r8 = r13.buffer
                long r9 = r13.pos
                long r11 = r9 - r2
                r13.pos = r11
                int r11 = r6 >>> 6
                r11 = r11 & 63
                r11 = r11 | r1
                byte r11 = (byte) r11
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r8, r9, r11)
                byte[] r8 = r13.buffer
                long r9 = r13.pos
                long r11 = r9 - r2
                r13.pos = r11
                int r11 = r6 >>> 12
                r11 = r11 & 63
                r11 = r11 | r1
                byte r11 = (byte) r11
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r8, r9, r11)
                byte[] r8 = r13.buffer
                long r9 = r13.pos
                long r11 = r9 - r2
                r13.pos = r11
                int r11 = r6 >>> 18
                r11 = r11 | 240(0xf0, float:3.36E-43)
                byte r11 = (byte) r11
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r8, r9, r11)
                goto L12b
            L11e:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r1 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                int r2 = r0 + (-1)
                r1.<init>(r2, r0)
                throw r1
            L126:
                r13.requireSpace(r0)
                int r0 = r0 + 1
            L12b:
                int r0 = r0 + r4
                goto L2d
            L12e:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeTag(int r2, int r3) {
                r1 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r2, r3)
                r1.writeVarint32(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt32(int r2, int r3) {
                r1 = this;
                r0 = 10
                r1.requireSpace(r0)
                r1.writeVarint32(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt64(int r2, long r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeVarint64(r3)
                r0 = 0
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint32(int r2) {
                r1 = this;
                r0 = r2 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L8
                r1.writeVarint32OneByte(r2)
                goto L25
            L8:
                r0 = r2 & (-16384(0xffffffffffffc000, float:NaN))
                if (r0 != 0) goto L10
                r1.writeVarint32TwoBytes(r2)
                goto L25
            L10:
                r0 = -2097152(0xffffffffffe00000, float:NaN)
                r0 = r0 & r2
                if (r0 != 0) goto L19
                r1.writeVarint32ThreeBytes(r2)
                goto L25
            L19:
                r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
                r0 = r0 & r2
                if (r0 != 0) goto L22
                r1.writeVarint32FourBytes(r2)
                goto L25
            L22:
                r1.writeVarint32FiveBytes(r2)
            L25:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint64(long r2) {
                r1 = this;
                byte r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.access$200(r2)
                switch(r0) {
                    case 1: goto L2c;
                    case 2: goto L28;
                    case 3: goto L24;
                    case 4: goto L20;
                    case 5: goto L1c;
                    case 6: goto L18;
                    case 7: goto L14;
                    case 8: goto L10;
                    case 9: goto Lc;
                    case 10: goto L8;
                    default: goto L7;
                }
            L7:
                goto L30
            L8:
                r1.writeVarint64TenBytes(r2)
                goto L30
            Lc:
                r1.writeVarint64NineBytes(r2)
                goto L30
            L10:
                r1.writeVarint64EightBytes(r2)
                goto L30
            L14:
                r1.writeVarint64SevenBytes(r2)
                goto L30
            L18:
                r1.writeVarint64SixBytes(r2)
                goto L30
            L1c:
                r1.writeVarint64FiveBytes(r2)
                goto L30
            L20:
                r1.writeVarint64FourBytes(r2)
                goto L30
            L24:
                r1.writeVarint64ThreeBytes(r2)
                goto L30
            L28:
                r1.writeVarint64TwoBytes(r2)
                goto L30
            L2c:
                r1.writeVarint64OneByte(r2)
            L30:
                return
        }
    }

    private BinaryWriter(com.google.crypto.tink.shaded.protobuf.BufferAllocator r3, int r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 4
            r0.<init>(r1)
            r2.buffers = r0
            if (r4 <= 0) goto L1a
            java.lang.String r0 = "alloc"
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3, r0)
            com.google.crypto.tink.shaded.protobuf.BufferAllocator r0 = (com.google.crypto.tink.shaded.protobuf.BufferAllocator) r0
            r2.alloc = r0
            r2.chunkSize = r4
            return
        L1a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "chunkSize must be > 0"
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ BinaryWriter(com.google.crypto.tink.shaded.protobuf.BufferAllocator r1, int r2, com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ byte access$200(long r1) {
            byte r0 = computeUInt64SizeNoTag(r1)
            return r0
    }

    private static byte computeUInt64SizeNoTag(long r6) {
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r6
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lb
            r0 = 1
            return r0
        Lb:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L12
            r0 = 10
            return r0
        L12:
            r0 = 2
            r4 = -34359738368(0xfffffff800000000, double:NaN)
            long r4 = r4 & r6
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L23
            int r1 = r0 + 4
            byte r0 = (byte) r1
            r1 = 28
            long r6 = r6 >>> r1
        L23:
            r4 = -2097152(0xffffffffffe00000, double:NaN)
            long r4 = r4 & r6
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L31
            int r1 = r0 + 2
            byte r0 = (byte) r1
            r1 = 14
            long r6 = r6 >>> r1
        L31:
            r4 = -16384(0xffffffffffffc000, double:NaN)
            long r4 = r4 & r6
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L3b
            int r1 = r0 + 1
            byte r0 = (byte) r1
        L3b:
            return r0
    }

    static boolean isUnsafeDirectSupported() {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.UnsafeDirectWriter.access$000()
            return r0
    }

    static boolean isUnsafeHeapSupported() {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.UnsafeHeapWriter.isSupported()
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.BinaryWriter newDirectInstance(com.google.crypto.tink.shaded.protobuf.BufferAllocator r1) {
            r0 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.shaded.protobuf.BinaryWriter r0 = newDirectInstance(r1, r0)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.BinaryWriter newDirectInstance(com.google.crypto.tink.shaded.protobuf.BufferAllocator r1, int r2) {
            boolean r0 = isUnsafeDirectSupported()
            if (r0 == 0) goto Lb
            com.google.crypto.tink.shaded.protobuf.BinaryWriter r0 = newUnsafeDirectInstance(r1, r2)
            goto Lf
        Lb:
            com.google.crypto.tink.shaded.protobuf.BinaryWriter r0 = newSafeDirectInstance(r1, r2)
        Lf:
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.BinaryWriter newHeapInstance(com.google.crypto.tink.shaded.protobuf.BufferAllocator r1) {
            r0 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.shaded.protobuf.BinaryWriter r0 = newHeapInstance(r1, r0)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.BinaryWriter newHeapInstance(com.google.crypto.tink.shaded.protobuf.BufferAllocator r1, int r2) {
            boolean r0 = isUnsafeHeapSupported()
            if (r0 == 0) goto Lb
            com.google.crypto.tink.shaded.protobuf.BinaryWriter r0 = newUnsafeHeapInstance(r1, r2)
            goto Lf
        Lb:
            com.google.crypto.tink.shaded.protobuf.BinaryWriter r0 = newSafeHeapInstance(r1, r2)
        Lf:
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.BinaryWriter newSafeDirectInstance(com.google.crypto.tink.shaded.protobuf.BufferAllocator r1, int r2) {
            com.google.crypto.tink.shaded.protobuf.BinaryWriter$SafeDirectWriter r0 = new com.google.crypto.tink.shaded.protobuf.BinaryWriter$SafeDirectWriter
            r0.<init>(r1, r2)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.BinaryWriter newSafeHeapInstance(com.google.crypto.tink.shaded.protobuf.BufferAllocator r1, int r2) {
            com.google.crypto.tink.shaded.protobuf.BinaryWriter$SafeHeapWriter r0 = new com.google.crypto.tink.shaded.protobuf.BinaryWriter$SafeHeapWriter
            r0.<init>(r1, r2)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.BinaryWriter newUnsafeDirectInstance(com.google.crypto.tink.shaded.protobuf.BufferAllocator r2, int r3) {
            boolean r0 = isUnsafeDirectSupported()
            if (r0 == 0) goto Lc
            com.google.crypto.tink.shaded.protobuf.BinaryWriter$UnsafeDirectWriter r0 = new com.google.crypto.tink.shaded.protobuf.BinaryWriter$UnsafeDirectWriter
            r0.<init>(r2, r3)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Unsafe operations not supported"
            r0.<init>(r1)
            throw r0
    }

    static com.google.crypto.tink.shaded.protobuf.BinaryWriter newUnsafeHeapInstance(com.google.crypto.tink.shaded.protobuf.BufferAllocator r2, int r3) {
            boolean r0 = isUnsafeHeapSupported()
            if (r0 == 0) goto Lc
            com.google.crypto.tink.shaded.protobuf.BinaryWriter$UnsafeHeapWriter r0 = new com.google.crypto.tink.shaded.protobuf.BinaryWriter$UnsafeHeapWriter
            r0.<init>(r2, r3)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Unsafe operations not supported"
            r0.<init>(r1)
            throw r0
    }

    private final void writeBoolList_Internal(int r4, com.google.crypto.tink.shaded.protobuf.BooleanArrayList r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L2e
            int r0 = r5.size()
            int r0 = r0 + 10
            r3.requireSpace(r0)
            int r0 = r3.getTotalBytesWritten()
            int r1 = r5.size()
            int r1 = r1 + (-1)
        L15:
            if (r1 < 0) goto L21
            boolean r2 = r5.getBoolean(r1)
            r3.writeBool(r2)
            int r1 = r1 + (-1)
            goto L15
        L21:
            int r1 = r3.getTotalBytesWritten()
            int r1 = r1 - r0
            r3.writeVarint32(r1)
            r2 = 2
            r3.writeTag(r4, r2)
            goto L40
        L2e:
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L34:
            if (r0 < 0) goto L40
            boolean r1 = r5.getBoolean(r0)
            r3.writeBool(r4, r1)
            int r0 = r0 + (-1)
            goto L34
        L40:
            return
    }

    private final void writeBoolList_Internal(int r4, java.util.List<java.lang.Boolean> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L34
            int r0 = r5.size()
            int r0 = r0 + 10
            r3.requireSpace(r0)
            int r0 = r3.getTotalBytesWritten()
            int r1 = r5.size()
            int r1 = r1 + (-1)
        L15:
            if (r1 < 0) goto L27
            java.lang.Object r2 = r5.get(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3.writeBool(r2)
            int r1 = r1 + (-1)
            goto L15
        L27:
            int r1 = r3.getTotalBytesWritten()
            int r1 = r1 - r0
            r3.writeVarint32(r1)
            r2 = 2
            r3.writeTag(r4, r2)
            goto L4c
        L34:
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L3a:
            if (r0 < 0) goto L4c
            java.lang.Object r1 = r5.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3.writeBool(r4, r1)
            int r0 = r0 + (-1)
            goto L3a
        L4c:
            return
    }

    private final void writeDoubleList_Internal(int r5, com.google.crypto.tink.shaded.protobuf.DoubleArrayList r6, boolean r7) throws java.io.IOException {
            r4 = this;
            if (r7 == 0) goto L34
            int r0 = r6.size()
            int r0 = r0 * 8
            int r0 = r0 + 10
            r4.requireSpace(r0)
            int r0 = r4.getTotalBytesWritten()
            int r1 = r6.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L27
            double r2 = r6.getDouble(r1)
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            r4.writeFixed64(r2)
            int r1 = r1 + (-1)
            goto L17
        L27:
            int r1 = r4.getTotalBytesWritten()
            int r1 = r1 - r0
            r4.writeVarint32(r1)
            r2 = 2
            r4.writeTag(r5, r2)
            goto L46
        L34:
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L3a:
            if (r0 < 0) goto L46
            double r1 = r6.getDouble(r0)
            r4.writeDouble(r5, r1)
            int r0 = r0 + (-1)
            goto L3a
        L46:
            return
    }

    private final void writeDoubleList_Internal(int r5, java.util.List<java.lang.Double> r6, boolean r7) throws java.io.IOException {
            r4 = this;
            if (r7 == 0) goto L3a
            int r0 = r6.size()
            int r0 = r0 * 8
            int r0 = r0 + 10
            r4.requireSpace(r0)
            int r0 = r4.getTotalBytesWritten()
            int r1 = r6.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L2d
            java.lang.Object r2 = r6.get(r1)
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            r4.writeFixed64(r2)
            int r1 = r1 + (-1)
            goto L17
        L2d:
            int r1 = r4.getTotalBytesWritten()
            int r1 = r1 - r0
            r4.writeVarint32(r1)
            r2 = 2
            r4.writeTag(r5, r2)
            goto L52
        L3a:
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L40:
            if (r0 < 0) goto L52
            java.lang.Object r1 = r6.get(r0)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            r4.writeDouble(r5, r1)
            int r0 = r0 + (-1)
            goto L40
        L52:
            return
    }

    private final void writeFixed32List_Internal(int r4, com.google.crypto.tink.shaded.protobuf.IntArrayList r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L30
            int r0 = r5.size()
            int r0 = r0 * 4
            int r0 = r0 + 10
            r3.requireSpace(r0)
            int r0 = r3.getTotalBytesWritten()
            int r1 = r5.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L23
            int r2 = r5.getInt(r1)
            r3.writeFixed32(r2)
            int r1 = r1 + (-1)
            goto L17
        L23:
            int r1 = r3.getTotalBytesWritten()
            int r1 = r1 - r0
            r3.writeVarint32(r1)
            r2 = 2
            r3.writeTag(r4, r2)
            goto L42
        L30:
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L36:
            if (r0 < 0) goto L42
            int r1 = r5.getInt(r0)
            r3.writeFixed32(r4, r1)
            int r0 = r0 + (-1)
            goto L36
        L42:
            return
    }

    private final void writeFixed32List_Internal(int r4, java.util.List<java.lang.Integer> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L36
            int r0 = r5.size()
            int r0 = r0 * 4
            int r0 = r0 + 10
            r3.requireSpace(r0)
            int r0 = r3.getTotalBytesWritten()
            int r1 = r5.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L29
            java.lang.Object r2 = r5.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3.writeFixed32(r2)
            int r1 = r1 + (-1)
            goto L17
        L29:
            int r1 = r3.getTotalBytesWritten()
            int r1 = r1 - r0
            r3.writeVarint32(r1)
            r2 = 2
            r3.writeTag(r4, r2)
            goto L4e
        L36:
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L3c:
            if (r0 < 0) goto L4e
            java.lang.Object r1 = r5.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.writeFixed32(r4, r1)
            int r0 = r0 + (-1)
            goto L3c
        L4e:
            return
    }

    private final void writeFixed64List_Internal(int r5, com.google.crypto.tink.shaded.protobuf.LongArrayList r6, boolean r7) throws java.io.IOException {
            r4 = this;
            if (r7 == 0) goto L30
            int r0 = r6.size()
            int r0 = r0 * 8
            int r0 = r0 + 10
            r4.requireSpace(r0)
            int r0 = r4.getTotalBytesWritten()
            int r1 = r6.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L23
            long r2 = r6.getLong(r1)
            r4.writeFixed64(r2)
            int r1 = r1 + (-1)
            goto L17
        L23:
            int r1 = r4.getTotalBytesWritten()
            int r1 = r1 - r0
            r4.writeVarint32(r1)
            r2 = 2
            r4.writeTag(r5, r2)
            goto L42
        L30:
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L36:
            if (r0 < 0) goto L42
            long r1 = r6.getLong(r0)
            r4.writeFixed64(r5, r1)
            int r0 = r0 + (-1)
            goto L36
        L42:
            return
    }

    private final void writeFixed64List_Internal(int r5, java.util.List<java.lang.Long> r6, boolean r7) throws java.io.IOException {
            r4 = this;
            if (r7 == 0) goto L36
            int r0 = r6.size()
            int r0 = r0 * 8
            int r0 = r0 + 10
            r4.requireSpace(r0)
            int r0 = r4.getTotalBytesWritten()
            int r1 = r6.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L29
            java.lang.Object r2 = r6.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r4.writeFixed64(r2)
            int r1 = r1 + (-1)
            goto L17
        L29:
            int r1 = r4.getTotalBytesWritten()
            int r1 = r1 - r0
            r4.writeVarint32(r1)
            r2 = 2
            r4.writeTag(r5, r2)
            goto L4e
        L36:
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L3c:
            if (r0 < 0) goto L4e
            java.lang.Object r1 = r6.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r4.writeFixed64(r5, r1)
            int r0 = r0 + (-1)
            goto L3c
        L4e:
            return
    }

    private final void writeFloatList_Internal(int r4, com.google.crypto.tink.shaded.protobuf.FloatArrayList r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L34
            int r0 = r5.size()
            int r0 = r0 * 4
            int r0 = r0 + 10
            r3.requireSpace(r0)
            int r0 = r3.getTotalBytesWritten()
            int r1 = r5.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L27
            float r2 = r5.getFloat(r1)
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r3.writeFixed32(r2)
            int r1 = r1 + (-1)
            goto L17
        L27:
            int r1 = r3.getTotalBytesWritten()
            int r1 = r1 - r0
            r3.writeVarint32(r1)
            r2 = 2
            r3.writeTag(r4, r2)
            goto L46
        L34:
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L3a:
            if (r0 < 0) goto L46
            float r1 = r5.getFloat(r0)
            r3.writeFloat(r4, r1)
            int r0 = r0 + (-1)
            goto L3a
        L46:
            return
    }

    private final void writeFloatList_Internal(int r4, java.util.List<java.lang.Float> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L3a
            int r0 = r5.size()
            int r0 = r0 * 4
            int r0 = r0 + 10
            r3.requireSpace(r0)
            int r0 = r3.getTotalBytesWritten()
            int r1 = r5.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L2d
            java.lang.Object r2 = r5.get(r1)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r3.writeFixed32(r2)
            int r1 = r1 + (-1)
            goto L17
        L2d:
            int r1 = r3.getTotalBytesWritten()
            int r1 = r1 - r0
            r3.writeVarint32(r1)
            r2 = 2
            r3.writeTag(r4, r2)
            goto L52
        L3a:
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L40:
            if (r0 < 0) goto L52
            java.lang.Object r1 = r5.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r3.writeFloat(r4, r1)
            int r0 = r0 + (-1)
            goto L40
        L52:
            return
    }

    private final void writeInt32List_Internal(int r4, com.google.crypto.tink.shaded.protobuf.IntArrayList r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L30
            int r0 = r5.size()
            int r0 = r0 * 10
            int r0 = r0 + 10
            r3.requireSpace(r0)
            int r0 = r3.getTotalBytesWritten()
            int r1 = r5.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L23
            int r2 = r5.getInt(r1)
            r3.writeInt32(r2)
            int r1 = r1 + (-1)
            goto L17
        L23:
            int r1 = r3.getTotalBytesWritten()
            int r1 = r1 - r0
            r3.writeVarint32(r1)
            r2 = 2
            r3.writeTag(r4, r2)
            goto L42
        L30:
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L36:
            if (r0 < 0) goto L42
            int r1 = r5.getInt(r0)
            r3.writeInt32(r4, r1)
            int r0 = r0 + (-1)
            goto L36
        L42:
            return
    }

    private final void writeInt32List_Internal(int r4, java.util.List<java.lang.Integer> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L36
            int r0 = r5.size()
            int r0 = r0 * 10
            int r0 = r0 + 10
            r3.requireSpace(r0)
            int r0 = r3.getTotalBytesWritten()
            int r1 = r5.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L29
            java.lang.Object r2 = r5.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3.writeInt32(r2)
            int r1 = r1 + (-1)
            goto L17
        L29:
            int r1 = r3.getTotalBytesWritten()
            int r1 = r1 - r0
            r3.writeVarint32(r1)
            r2 = 2
            r3.writeTag(r4, r2)
            goto L4e
        L36:
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L3c:
            if (r0 < 0) goto L4e
            java.lang.Object r1 = r5.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.writeInt32(r4, r1)
            int r0 = r0 + (-1)
            goto L3c
        L4e:
            return
    }

    private void writeLazyString(int r2, java.lang.Object r3) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto Lb
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0
            r1.writeString(r2, r0)
            goto L11
        Lb:
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString) r0
            r1.writeBytes(r2, r0)
        L11:
            return
    }

    static final void writeMapEntryField(com.google.crypto.tink.shaded.protobuf.Writer r3, int r4, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r5, java.lang.Object r6) throws java.io.IOException {
            int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            int r1 = r5.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto Le7;
                case 2: goto Ldc;
                case 3: goto Ld1;
                case 4: goto Lc6;
                case 5: goto Lbb;
                case 6: goto Lb0;
                case 7: goto La5;
                case 8: goto L9a;
                case 9: goto L8f;
                case 10: goto L88;
                case 11: goto L7d;
                case 12: goto L71;
                case 13: goto L65;
                case 14: goto L59;
                case 15: goto L54;
                case 16: goto L4c;
                case 17: goto L24;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported map value type for: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L24:
            boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
            if (r0 == 0) goto L34
            r0 = r6
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r0 = (com.google.crypto.tink.shaded.protobuf.Internal.EnumLite) r0
            int r0 = r0.getNumber()
            r3.writeEnum(r4, r0)
            goto Lf2
        L34:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 == 0) goto L44
            r0 = r6
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.writeEnum(r4, r0)
            goto Lf2
        L44:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unexpected type for enum in map."
            r0.<init>(r1)
            throw r0
        L4c:
            r0 = r6
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString) r0
            r3.writeBytes(r4, r0)
            goto Lf2
        L54:
            r3.writeMessage(r4, r6)
            goto Lf2
        L59:
            r0 = r6
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            r3.writeDouble(r4, r0)
            goto Lf2
        L65:
            r0 = r6
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r3.writeFloat(r4, r0)
            goto Lf2
        L71:
            r0 = r6
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r3.writeUInt64(r4, r0)
            goto Lf2
        L7d:
            r0 = r6
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.writeUInt32(r4, r0)
            goto Lf2
        L88:
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
            r3.writeString(r4, r0)
            goto Lf2
        L8f:
            r0 = r6
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r3.writeSInt64(r4, r0)
            goto Lf2
        L9a:
            r0 = r6
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.writeSInt32(r4, r0)
            goto Lf2
        La5:
            r0 = r6
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r3.writeSFixed64(r4, r0)
            goto Lf2
        Lb0:
            r0 = r6
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.writeSFixed32(r4, r0)
            goto Lf2
        Lbb:
            r0 = r6
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r3.writeInt64(r4, r0)
            goto Lf2
        Lc6:
            r0 = r6
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.writeInt32(r4, r0)
            goto Lf2
        Ld1:
            r0 = r6
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r3.writeFixed64(r4, r0)
            goto Lf2
        Ldc:
            r0 = r6
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.writeFixed32(r4, r0)
            goto Lf2
        Le7:
            r0 = r6
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3.writeBool(r4, r0)
        Lf2:
            return
    }

    private final void writeSInt32List_Internal(int r4, com.google.crypto.tink.shaded.protobuf.IntArrayList r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L30
            int r0 = r5.size()
            int r0 = r0 * 5
            int r0 = r0 + 10
            r3.requireSpace(r0)
            int r0 = r3.getTotalBytesWritten()
            int r1 = r5.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L23
            int r2 = r5.getInt(r1)
            r3.writeSInt32(r2)
            int r1 = r1 + (-1)
            goto L17
        L23:
            int r1 = r3.getTotalBytesWritten()
            int r1 = r1 - r0
            r3.writeVarint32(r1)
            r2 = 2
            r3.writeTag(r4, r2)
            goto L42
        L30:
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L36:
            if (r0 < 0) goto L42
            int r1 = r5.getInt(r0)
            r3.writeSInt32(r4, r1)
            int r0 = r0 + (-1)
            goto L36
        L42:
            return
    }

    private final void writeSInt32List_Internal(int r4, java.util.List<java.lang.Integer> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L36
            int r0 = r5.size()
            int r0 = r0 * 5
            int r0 = r0 + 10
            r3.requireSpace(r0)
            int r0 = r3.getTotalBytesWritten()
            int r1 = r5.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L29
            java.lang.Object r2 = r5.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3.writeSInt32(r2)
            int r1 = r1 + (-1)
            goto L17
        L29:
            int r1 = r3.getTotalBytesWritten()
            int r1 = r1 - r0
            r3.writeVarint32(r1)
            r2 = 2
            r3.writeTag(r4, r2)
            goto L4e
        L36:
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L3c:
            if (r0 < 0) goto L4e
            java.lang.Object r1 = r5.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.writeSInt32(r4, r1)
            int r0 = r0 + (-1)
            goto L3c
        L4e:
            return
    }

    private final void writeSInt64List_Internal(int r5, com.google.crypto.tink.shaded.protobuf.LongArrayList r6, boolean r7) throws java.io.IOException {
            r4 = this;
            if (r7 == 0) goto L30
            int r0 = r6.size()
            int r0 = r0 * 10
            int r0 = r0 + 10
            r4.requireSpace(r0)
            int r0 = r4.getTotalBytesWritten()
            int r1 = r6.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L23
            long r2 = r6.getLong(r1)
            r4.writeSInt64(r2)
            int r1 = r1 + (-1)
            goto L17
        L23:
            int r1 = r4.getTotalBytesWritten()
            int r1 = r1 - r0
            r4.writeVarint32(r1)
            r2 = 2
            r4.writeTag(r5, r2)
            goto L42
        L30:
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L36:
            if (r0 < 0) goto L42
            long r1 = r6.getLong(r0)
            r4.writeSInt64(r5, r1)
            int r0 = r0 + (-1)
            goto L36
        L42:
            return
    }

    private final void writeSInt64List_Internal(int r5, java.util.List<java.lang.Long> r6, boolean r7) throws java.io.IOException {
            r4 = this;
            if (r7 == 0) goto L36
            int r0 = r6.size()
            int r0 = r0 * 10
            int r0 = r0 + 10
            r4.requireSpace(r0)
            int r0 = r4.getTotalBytesWritten()
            int r1 = r6.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L29
            java.lang.Object r2 = r6.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r4.writeSInt64(r2)
            int r1 = r1 + (-1)
            goto L17
        L29:
            int r1 = r4.getTotalBytesWritten()
            int r1 = r1 - r0
            r4.writeVarint32(r1)
            r2 = 2
            r4.writeTag(r5, r2)
            goto L4e
        L36:
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L3c:
            if (r0 < 0) goto L4e
            java.lang.Object r1 = r6.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r4.writeSInt64(r5, r1)
            int r0 = r0 + (-1)
            goto L3c
        L4e:
            return
    }

    private final void writeUInt32List_Internal(int r4, com.google.crypto.tink.shaded.protobuf.IntArrayList r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L30
            int r0 = r5.size()
            int r0 = r0 * 5
            int r0 = r0 + 10
            r3.requireSpace(r0)
            int r0 = r3.getTotalBytesWritten()
            int r1 = r5.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L23
            int r2 = r5.getInt(r1)
            r3.writeVarint32(r2)
            int r1 = r1 + (-1)
            goto L17
        L23:
            int r1 = r3.getTotalBytesWritten()
            int r1 = r1 - r0
            r3.writeVarint32(r1)
            r2 = 2
            r3.writeTag(r4, r2)
            goto L42
        L30:
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L36:
            if (r0 < 0) goto L42
            int r1 = r5.getInt(r0)
            r3.writeUInt32(r4, r1)
            int r0 = r0 + (-1)
            goto L36
        L42:
            return
    }

    private final void writeUInt32List_Internal(int r4, java.util.List<java.lang.Integer> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L36
            int r0 = r5.size()
            int r0 = r0 * 5
            int r0 = r0 + 10
            r3.requireSpace(r0)
            int r0 = r3.getTotalBytesWritten()
            int r1 = r5.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L29
            java.lang.Object r2 = r5.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3.writeVarint32(r2)
            int r1 = r1 + (-1)
            goto L17
        L29:
            int r1 = r3.getTotalBytesWritten()
            int r1 = r1 - r0
            r3.writeVarint32(r1)
            r2 = 2
            r3.writeTag(r4, r2)
            goto L4e
        L36:
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L3c:
            if (r0 < 0) goto L4e
            java.lang.Object r1 = r5.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.writeUInt32(r4, r1)
            int r0 = r0 + (-1)
            goto L3c
        L4e:
            return
    }

    private final void writeUInt64List_Internal(int r5, com.google.crypto.tink.shaded.protobuf.LongArrayList r6, boolean r7) throws java.io.IOException {
            r4 = this;
            if (r7 == 0) goto L30
            int r0 = r6.size()
            int r0 = r0 * 10
            int r0 = r0 + 10
            r4.requireSpace(r0)
            int r0 = r4.getTotalBytesWritten()
            int r1 = r6.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L23
            long r2 = r6.getLong(r1)
            r4.writeVarint64(r2)
            int r1 = r1 + (-1)
            goto L17
        L23:
            int r1 = r4.getTotalBytesWritten()
            int r1 = r1 - r0
            r4.writeVarint32(r1)
            r2 = 2
            r4.writeTag(r5, r2)
            goto L42
        L30:
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L36:
            if (r0 < 0) goto L42
            long r1 = r6.getLong(r0)
            r4.writeUInt64(r5, r1)
            int r0 = r0 + (-1)
            goto L36
        L42:
            return
    }

    private final void writeUInt64List_Internal(int r5, java.util.List<java.lang.Long> r6, boolean r7) throws java.io.IOException {
            r4 = this;
            if (r7 == 0) goto L36
            int r0 = r6.size()
            int r0 = r0 * 10
            int r0 = r0 + 10
            r4.requireSpace(r0)
            int r0 = r4.getTotalBytesWritten()
            int r1 = r6.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L29
            java.lang.Object r2 = r6.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r4.writeVarint64(r2)
            int r1 = r1 + (-1)
            goto L17
        L29:
            int r1 = r4.getTotalBytesWritten()
            int r1 = r1 - r0
            r4.writeVarint32(r1)
            r2 = 2
            r4.writeTag(r5, r2)
            goto L4e
        L36:
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L3c:
            if (r0 < 0) goto L4e
            java.lang.Object r1 = r6.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r4.writeUInt64(r5, r1)
            int r0 = r0 + (-1)
            goto L3c
        L4e:
            return
    }

    public final java.util.Queue<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> complete() {
            r1 = this;
            r1.finishCurrentBuffer()
            java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r0 = r1.buffers
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder fieldOrder() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r0 = com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder.DESCENDING
            return r0
    }

    abstract void finishCurrentBuffer();

    public abstract int getTotalBytesWritten();

    final com.google.crypto.tink.shaded.protobuf.AllocatedBuffer newDirectBuffer() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.BufferAllocator r0 = r2.alloc
            int r1 = r2.chunkSize
            com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r0.allocateDirectBuffer(r1)
            return r0
    }

    final com.google.crypto.tink.shaded.protobuf.AllocatedBuffer newDirectBuffer(int r3) {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.BufferAllocator r0 = r2.alloc
            int r1 = r2.chunkSize
            int r1 = java.lang.Math.max(r3, r1)
            com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r0.allocateDirectBuffer(r1)
            return r0
    }

    final com.google.crypto.tink.shaded.protobuf.AllocatedBuffer newHeapBuffer() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.BufferAllocator r0 = r2.alloc
            int r1 = r2.chunkSize
            com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r0.allocateHeapBuffer(r1)
            return r0
    }

    final com.google.crypto.tink.shaded.protobuf.AllocatedBuffer newHeapBuffer(int r3) {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.BufferAllocator r0 = r2.alloc
            int r1 = r2.chunkSize
            int r1 = java.lang.Math.max(r3, r1)
            com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r0.allocateHeapBuffer(r1)
            return r0
    }

    abstract void requireSpace(int r1);

    abstract void writeBool(boolean r1);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeBoolList(int r2, java.util.List<java.lang.Boolean> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.BooleanArrayList
            if (r0 == 0) goto Lb
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.BooleanArrayList r0 = (com.google.crypto.tink.shaded.protobuf.BooleanArrayList) r0
            r1.writeBoolList_Internal(r2, r0, r4)
            goto Le
        Lb:
            r1.writeBoolList_Internal(r2, r3, r4)
        Le:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeBytesList(int r3, java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> r4) throws java.io.IOException {
            r2 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L14
            java.lang.Object r1 = r4.get(r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = (com.google.crypto.tink.shaded.protobuf.ByteString) r1
            r2.writeBytes(r3, r1)
            int r0 = r0 + (-1)
            goto L6
        L14:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeDouble(int r3, double r4) throws java.io.IOException {
            r2 = this;
            long r0 = java.lang.Double.doubleToRawLongBits(r4)
            r2.writeFixed64(r3, r0)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeDoubleList(int r2, java.util.List<java.lang.Double> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.DoubleArrayList
            if (r0 == 0) goto Lb
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.DoubleArrayList r0 = (com.google.crypto.tink.shaded.protobuf.DoubleArrayList) r0
            r1.writeDoubleList_Internal(r2, r0, r4)
            goto Le
        Lb:
            r1.writeDoubleList_Internal(r2, r3, r4)
        Le:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeEnum(int r1, int r2) throws java.io.IOException {
            r0 = this;
            r0.writeInt32(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeEnumList(int r1, java.util.List<java.lang.Integer> r2, boolean r3) throws java.io.IOException {
            r0 = this;
            r0.writeInt32List(r1, r2, r3)
            return
    }

    abstract void writeFixed32(int r1);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFixed32List(int r2, java.util.List<java.lang.Integer> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r0 == 0) goto Lb
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r0
            r1.writeFixed32List_Internal(r2, r0, r4)
            goto Le
        Lb:
            r1.writeFixed32List_Internal(r2, r3, r4)
        Le:
            return
    }

    abstract void writeFixed64(long r1);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFixed64List(int r2, java.util.List<java.lang.Long> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r0 == 0) goto Lb
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r0
            r1.writeFixed64List_Internal(r2, r0, r4)
            goto Le
        Lb:
            r1.writeFixed64List_Internal(r2, r3, r4)
        Le:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFloat(int r2, float r3) throws java.io.IOException {
            r1 = this;
            int r0 = java.lang.Float.floatToRawIntBits(r3)
            r1.writeFixed32(r2, r0)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFloatList(int r2, java.util.List<java.lang.Float> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.FloatArrayList
            if (r0 == 0) goto Lb
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.FloatArrayList r0 = (com.google.crypto.tink.shaded.protobuf.FloatArrayList) r0
            r1.writeFloatList_Internal(r2, r0, r4)
            goto Le
        Lb:
            r1.writeFloatList_Internal(r2, r3, r4)
        Le:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @java.lang.Deprecated
    public final void writeGroupList(int r3, java.util.List<?> r4) throws java.io.IOException {
            r2 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L12
            java.lang.Object r1 = r4.get(r0)
            r2.writeGroup(r3, r1)
            int r0 = r0 + (-1)
            goto L6
        L12:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @java.lang.Deprecated
    public final void writeGroupList(int r3, java.util.List<?> r4, com.google.crypto.tink.shaded.protobuf.Schema r5) throws java.io.IOException {
            r2 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L12
            java.lang.Object r1 = r4.get(r0)
            r2.writeGroup(r3, r1, r5)
            int r0 = r0 + (-1)
            goto L6
        L12:
            return
    }

    abstract void writeInt32(int r1);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeInt32List(int r2, java.util.List<java.lang.Integer> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r0 == 0) goto Lb
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r0
            r1.writeInt32List_Internal(r2, r0, r4)
            goto Le
        Lb:
            r1.writeInt32List_Internal(r2, r3, r4)
        Le:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeInt64(int r1, long r2) throws java.io.IOException {
            r0 = this;
            r0.writeUInt64(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeInt64List(int r1, java.util.List<java.lang.Long> r2, boolean r3) throws java.io.IOException {
            r0 = this;
            r0.writeUInt64List(r1, r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public <K, V> void writeMap(int r8, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r9, java.util.Map<K, V> r10) throws java.io.IOException {
            r7 = this;
            java.util.Set r0 = r10.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            int r2 = r7.getTotalBytesWritten()
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = r9.valueType
            java.lang.Object r4 = r1.getValue()
            r5 = 2
            writeMapEntryField(r7, r5, r3, r4)
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = r9.keyType
            java.lang.Object r4 = r1.getKey()
            r6 = 1
            writeMapEntryField(r7, r6, r3, r4)
            int r3 = r7.getTotalBytesWritten()
            int r3 = r3 - r2
            r7.writeVarint32(r3)
            r7.writeTag(r8, r5)
            goto L8
        L38:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageList(int r3, java.util.List<?> r4) throws java.io.IOException {
            r2 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L12
            java.lang.Object r1 = r4.get(r0)
            r2.writeMessage(r3, r1)
            int r0 = r0 + (-1)
            goto L6
        L12:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageList(int r3, java.util.List<?> r4, com.google.crypto.tink.shaded.protobuf.Schema r5) throws java.io.IOException {
            r2 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L12
            java.lang.Object r1 = r4.get(r0)
            r2.writeMessage(r3, r1, r5)
            int r0 = r0 + (-1)
            goto L6
        L12:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageSetItem(int r4, java.lang.Object r5) throws java.io.IOException {
            r3 = this;
            r0 = 4
            r1 = 1
            r3.writeTag(r1, r0)
            boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            r2 = 3
            if (r0 == 0) goto L11
            r0 = r5
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString) r0
            r3.writeBytes(r2, r0)
            goto L14
        L11:
            r3.writeMessage(r2, r5)
        L14:
            r0 = 2
            r3.writeUInt32(r0, r4)
            r3.writeTag(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed32(int r1, int r2) throws java.io.IOException {
            r0 = this;
            r0.writeFixed32(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed32List(int r1, java.util.List<java.lang.Integer> r2, boolean r3) throws java.io.IOException {
            r0 = this;
            r0.writeFixed32List(r1, r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed64(int r1, long r2) throws java.io.IOException {
            r0 = this;
            r0.writeFixed64(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed64List(int r1, java.util.List<java.lang.Long> r2, boolean r3) throws java.io.IOException {
            r0 = this;
            r0.writeFixed64List(r1, r2, r3)
            return
    }

    abstract void writeSInt32(int r1);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSInt32List(int r2, java.util.List<java.lang.Integer> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r0 == 0) goto Lb
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r0
            r1.writeSInt32List_Internal(r2, r0, r4)
            goto Le
        Lb:
            r1.writeSInt32List_Internal(r2, r3, r4)
        Le:
            return
    }

    abstract void writeSInt64(long r1);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSInt64List(int r2, java.util.List<java.lang.Long> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r0 == 0) goto Lb
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r0
            r1.writeSInt64List_Internal(r2, r0, r4)
            goto Le
        Lb:
            r1.writeSInt64List_Internal(r2, r3, r4)
        Le:
            return
    }

    abstract void writeString(java.lang.String r1);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeStringList(int r4, java.util.List<java.lang.String> r5) throws java.io.IOException {
            r3 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList
            if (r0 == 0) goto L1a
            r0 = r5
            com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = (com.google.crypto.tink.shaded.protobuf.LazyStringList) r0
            int r1 = r5.size()
            int r1 = r1 + (-1)
        Ld:
            if (r1 < 0) goto L19
            java.lang.Object r2 = r0.getRaw(r1)
            r3.writeLazyString(r4, r2)
            int r1 = r1 + (-1)
            goto Ld
        L19:
            goto L2e
        L1a:
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L20:
            if (r0 < 0) goto L2e
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r3.writeString(r4, r1)
            int r0 = r0 + (-1)
            goto L20
        L2e:
            return
    }

    abstract void writeTag(int r1, int r2);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeUInt32List(int r2, java.util.List<java.lang.Integer> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r0 == 0) goto Lb
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r0
            r1.writeUInt32List_Internal(r2, r0, r4)
            goto Le
        Lb:
            r1.writeUInt32List_Internal(r2, r3, r4)
        Le:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeUInt64List(int r2, java.util.List<java.lang.Long> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r0 == 0) goto Lb
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r0
            r1.writeUInt64List_Internal(r2, r0, r4)
            goto Le
        Lb:
            r1.writeUInt64List_Internal(r2, r3, r4)
        Le:
            return
    }

    abstract void writeVarint32(int r1);

    abstract void writeVarint64(long r1);
}
