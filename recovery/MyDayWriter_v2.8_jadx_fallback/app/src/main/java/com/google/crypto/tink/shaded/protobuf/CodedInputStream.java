package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader wrapper;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.CodedInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class ArrayDecoder extends com.google.crypto.tink.shaded.protobuf.CodedInputStream {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        private ArrayDecoder(byte[] r2, int r3, int r4, boolean r5) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1.currentLimit = r0
                r1.buffer = r2
                int r0 = r3 + r4
                r1.limit = r0
                r1.pos = r3
                int r0 = r1.pos
                r1.startPos = r0
                r1.immutable = r5
                return
        }

        /* synthetic */ ArrayDecoder(byte[] r1, int r2, int r3, boolean r4, com.google.crypto.tink.shaded.protobuf.CodedInputStream.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        private void recomputeBufferSizeAfterLimit() {
                r3 = this;
                int r0 = r3.limit
                int r1 = r3.bufferSizeAfterLimit
                int r0 = r0 + r1
                r3.limit = r0
                int r0 = r3.limit
                int r1 = r3.startPos
                int r0 = r0 - r1
                int r1 = r3.currentLimit
                if (r0 <= r1) goto L1e
                int r1 = r3.currentLimit
                int r1 = r0 - r1
                r3.bufferSizeAfterLimit = r1
                int r1 = r3.limit
                int r2 = r3.bufferSizeAfterLimit
                int r1 = r1 - r2
                r3.limit = r1
                goto L21
            L1e:
                r1 = 0
                r3.bufferSizeAfterLimit = r1
            L21:
                return
        }

        private void skipRawVarint() throws java.io.IOException {
                r2 = this;
                int r0 = r2.limit
                int r1 = r2.pos
                int r0 = r0 - r1
                r1 = 10
                if (r0 < r1) goto Ld
                r2.skipRawVarintFastPath()
                goto L10
            Ld:
                r2.skipRawVarintSlowPath()
            L10:
                return
        }

        private void skipRawVarintFastPath() throws java.io.IOException {
                r4 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto L15
                byte[] r1 = r4.buffer
                int r2 = r4.pos
                int r3 = r2 + 1
                r4.pos = r3
                r1 = r1[r2]
                if (r1 < 0) goto L12
                return
            L12:
                int r0 = r0 + 1
                goto L1
            L15:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
                r2 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto Lf
                byte r1 = r2.readRawByte()
                if (r1 < 0) goto Lc
                return
            Lc:
                int r0 = r0 + 1
                goto L1
            Lf:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void checkLastTagWas(int r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                int r0 = r1.lastTag
                if (r0 != r2) goto L5
                return
            L5:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidEndTag()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void enableAliasing(boolean r1) {
                r0 = this;
                r0.enableAliasing = r1
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
                r2 = this;
                int r0 = r2.currentLimit
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L9
                r0 = -1
                return r0
            L9:
                int r0 = r2.currentLimit
                int r1 = r2.getTotalBytesRead()
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getLastTag() {
                r1 = this;
                int r0 = r1.lastTag
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getTotalBytesRead() {
                r2 = this;
                int r0 = r2.pos
                int r1 = r2.startPos
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
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

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void popLimit(int r1) {
                r0 = this;
                r0.currentLimit = r1
                r0.recomputeBufferSizeAfterLimit()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int pushLimit(int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r2 = this;
                if (r3 < 0) goto L1d
                int r0 = r2.getTotalBytesRead()
                int r3 = r3 + r0
                if (r3 < 0) goto L18
                int r0 = r2.currentLimit
                if (r3 > r0) goto L13
                r2.currentLimit = r3
                r2.recomputeBufferSizeAfterLimit()
                return r0
            L13:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
            L18:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
                throw r0
            L1d:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
                r4 = this;
                long r0 = r4.readRawVarint64()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
                r2 = this;
                int r0 = r2.readRawVarint32()
                byte[] r1 = r2.readRawBytes(r0)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
                r4 = this;
                int r0 = r4.readRawVarint32()
                if (r0 <= 0) goto L38
                int r1 = r4.limit
                int r2 = r4.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L38
                boolean r1 = r4.immutable
                if (r1 != 0) goto L22
                boolean r1 = r4.enableAliasing
                if (r1 == 0) goto L22
                byte[] r1 = r4.buffer
                int r2 = r4.pos
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1, r2, r0)
                java.nio.ByteBuffer r1 = r1.slice()
                goto L31
            L22:
                byte[] r1 = r4.buffer
                int r2 = r4.pos
                int r3 = r4.pos
                int r3 = r3 + r0
                byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            L31:
                int r2 = r4.pos
                int r2 = r2 + r0
                r4.pos = r2
                return r1
            L38:
                if (r0 != 0) goto L3d
                java.nio.ByteBuffer r1 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_BUFFER
                return r1
            L3d:
                if (r0 >= 0) goto L44
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r1
            L44:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public com.google.crypto.tink.shaded.protobuf.ByteString readBytes() throws java.io.IOException {
                r3 = this;
                int r0 = r3.readRawVarint32()
                if (r0 <= 0) goto L2d
                int r1 = r3.limit
                int r2 = r3.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L2d
                boolean r1 = r3.immutable
                if (r1 == 0) goto L1e
                boolean r1 = r3.enableAliasing
                if (r1 == 0) goto L1e
                byte[] r1 = r3.buffer
                int r2 = r3.pos
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r1, r2, r0)
                goto L26
            L1e:
                byte[] r1 = r3.buffer
                int r2 = r3.pos
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1, r2, r0)
            L26:
                int r2 = r3.pos
                int r2 = r2 + r0
                r3.pos = r2
                return r1
            L2d:
                if (r0 != 0) goto L32
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
                return r1
            L32:
                byte[] r1 = r3.readRawBytes(r0)
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readGroup(int r3, com.google.crypto.tink.shaded.protobuf.Parser<T> r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws java.io.IOException {
                r2 = this;
                r2.checkRecursionLimit()
                int r0 = r2.recursionDepth
                int r0 = r0 + 1
                r2.recursionDepth = r0
                java.lang.Object r0 = r4.parsePartialFrom(r2, r5)
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
                r1 = 4
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r3, r1)
                r2.checkLastTagWas(r1)
                int r1 = r2.recursionDepth
                int r1 = r1 + (-1)
                r2.recursionDepth = r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r1 = this;
                r1.checkRecursionLimit()
                int r0 = r1.recursionDepth
                int r0 = r0 + 1
                r1.recursionDepth = r0
                r3.mergeFrom(r1, r4)
                r0 = 4
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r2, r0)
                r1.checkLastTagWas(r0)
                int r0 = r1.recursionDepth
                int r0 = r0 + (-1)
                r1.recursionDepth = r0
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readMessage(com.google.crypto.tink.shaded.protobuf.Parser<T> r5, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r6) throws java.io.IOException {
                r4 = this;
                int r0 = r4.readRawVarint32()
                r4.checkRecursionLimit()
                int r1 = r4.pushLimit(r0)
                int r2 = r4.recursionDepth
                int r2 = r2 + 1
                r4.recursionDepth = r2
                java.lang.Object r2 = r5.parsePartialFrom(r4, r6)
                com.google.crypto.tink.shaded.protobuf.MessageLite r2 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r2
                r3 = 0
                r4.checkLastTagWas(r3)
                int r3 = r4.recursionDepth
                int r3 = r3 + (-1)
                r4.recursionDepth = r3
                int r3 = r4.getBytesUntilLimit()
                if (r3 != 0) goto L2b
                r4.popLimit(r1)
                return r2
            L2b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readMessage(com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws java.io.IOException {
                r3 = this;
                int r0 = r3.readRawVarint32()
                r3.checkRecursionLimit()
                int r1 = r3.pushLimit(r0)
                int r2 = r3.recursionDepth
                int r2 = r2 + 1
                r3.recursionDepth = r2
                r4.mergeFrom(r3, r5)
                r2 = 0
                r3.checkLastTagWas(r2)
                int r2 = r3.recursionDepth
                int r2 = r2 + (-1)
                r3.recursionDepth = r2
                int r2 = r3.getBytesUntilLimit()
                if (r2 != 0) goto L28
                r3.popLimit(r1)
                return
            L28:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
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

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readRawBytes(int r4) throws java.io.IOException {
                r3 = this;
                if (r4 <= 0) goto L19
                int r0 = r3.limit
                int r1 = r3.pos
                int r0 = r0 - r1
                if (r4 > r0) goto L19
                int r0 = r3.pos
                int r1 = r3.pos
                int r1 = r1 + r4
                r3.pos = r1
                byte[] r1 = r3.buffer
                int r2 = r3.pos
                byte[] r1 = java.util.Arrays.copyOfRange(r1, r0, r2)
                return r1
            L19:
                if (r4 > 0) goto L25
                if (r4 != 0) goto L20
                byte[] r0 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_ARRAY
                return r0
            L20:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L25:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
                r4 = this;
                int r0 = r4.pos
                int r1 = r4.limit
                int r1 = r1 - r0
                r2 = 4
                if (r1 < r2) goto L2e
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
            L2e:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
                r9 = this;
                int r0 = r9.pos
                int r1 = r9.limit
                int r1 = r1 - r0
                r2 = 8
                if (r1 < r2) goto L5c
                byte[] r1 = r9.buffer
                int r3 = r0 + 8
                r9.pos = r3
                r3 = r1[r0]
                long r3 = (long) r3
                r5 = 255(0xff, double:1.26E-321)
                long r3 = r3 & r5
                int r7 = r0 + 1
                r7 = r1[r7]
                long r7 = (long) r7
                long r7 = r7 & r5
                long r7 = r7 << r2
                long r2 = r3 | r7
                int r4 = r0 + 2
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 16
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 3
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 24
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 4
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 32
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 5
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 40
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 6
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 48
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 7
                r4 = r1[r4]
                long r7 = (long) r4
                long r4 = r7 & r5
                r6 = 56
                long r4 = r4 << r6
                long r2 = r2 | r4
                return r2
            L5c:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawVarint32() throws java.io.IOException {
                r6 = this;
                int r0 = r6.pos
                int r1 = r6.limit
                if (r1 != r0) goto L8
                goto L74
            L8:
                byte[] r1 = r6.buffer
                int r2 = r0 + 1
                r0 = r1[r0]
                r3 = r0
                if (r0 < 0) goto L14
                r6.pos = r2
                return r3
            L14:
                int r0 = r6.limit
                int r0 = r0 - r2
                r4 = 9
                if (r0 >= r4) goto L1c
                goto L74
            L1c:
                int r0 = r2 + 1
                r2 = r1[r2]
                int r2 = r2 << 7
                r2 = r2 ^ r3
                r3 = r2
                if (r2 >= 0) goto L29
                r2 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L7f
            L29:
                int r2 = r0 + 1
                r0 = r1[r0]
                int r0 = r0 << 14
                r0 = r0 ^ r3
                r3 = r0
                if (r0 < 0) goto L39
                r0 = r3 ^ 16256(0x3f80, float:2.278E-41)
                r5 = r2
                r2 = r0
                r0 = r5
                goto L7f
            L39:
                int r0 = r2 + 1
                r2 = r1[r2]
                int r2 = r2 << 21
                r2 = r2 ^ r3
                r3 = r2
                if (r2 >= 0) goto L48
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r2 = r2 ^ r3
                goto L7f
            L48:
                int r2 = r0 + 1
                r0 = r1[r0]
                int r4 = r0 << 28
                r3 = r3 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r3 = r3 ^ r4
                if (r0 >= 0) goto L7d
                int r4 = r2 + 1
                r2 = r1[r2]
                if (r2 >= 0) goto L7a
                int r2 = r4 + 1
                r4 = r1[r4]
                if (r4 >= 0) goto L7d
                int r4 = r2 + 1
                r2 = r1[r2]
                if (r2 >= 0) goto L7a
                int r2 = r4 + 1
                r4 = r1[r4]
                if (r4 >= 0) goto L7d
                int r4 = r2 + 1
                r2 = r1[r2]
                if (r2 >= 0) goto L7a
            L74:
                long r0 = r6.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L7a:
                r2 = r3
                r0 = r4
                goto L7f
            L7d:
                r0 = r2
                r2 = r3
            L7f:
                r6.pos = r0
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawVarint64() throws java.io.IOException {
                r10 = this;
                int r0 = r10.pos
                int r1 = r10.limit
                if (r1 != r0) goto L8
                goto Lc2
            L8:
                byte[] r1 = r10.buffer
                int r2 = r0 + 1
                r0 = r1[r0]
                r3 = r0
                if (r0 < 0) goto L15
                r10.pos = r2
                long r4 = (long) r3
                return r4
            L15:
                int r0 = r10.limit
                int r0 = r0 - r2
                r4 = 9
                if (r0 >= r4) goto L1e
                goto Lc2
            L1e:
                int r0 = r2 + 1
                r2 = r1[r2]
                int r2 = r2 << 7
                r2 = r2 ^ r3
                r3 = r2
                if (r2 >= 0) goto L2d
                r2 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
                long r4 = (long) r2
                goto Lc8
            L2d:
                int r2 = r0 + 1
                r0 = r1[r0]
                int r0 = r0 << 14
                r0 = r0 ^ r3
                r3 = r0
                if (r0 < 0) goto L3d
                r0 = r3 ^ 16256(0x3f80, float:2.278E-41)
                long r4 = (long) r0
                r0 = r2
                goto Lc8
            L3d:
                int r0 = r2 + 1
                r2 = r1[r2]
                int r2 = r2 << 21
                r2 = r2 ^ r3
                r3 = r2
                if (r2 >= 0) goto L4e
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r2 = r2 ^ r3
                long r4 = (long) r2
                goto Lc8
            L4e:
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
                if (r0 < 0) goto L65
                r4 = 266354560(0xfe03f80, double:1.315966377E-315)
                long r4 = r4 ^ r6
                r0 = r2
                goto Lc8
            L65:
                int r0 = r2 + 1
                r2 = r1[r2]
                long r4 = (long) r2
                r2 = 35
                long r4 = r4 << r2
                long r4 = r4 ^ r6
                r6 = r4
                int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r2 >= 0) goto L7a
                r4 = -34093383808(0xfffffff80fe03f80, double:NaN)
                long r4 = r4 ^ r6
                goto Lc8
            L7a:
                int r2 = r0 + 1
                r0 = r1[r0]
                long r4 = (long) r0
                r0 = 42
                long r4 = r4 << r0
                long r4 = r4 ^ r6
                r6 = r4
                int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r0 < 0) goto L90
                r4 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                long r4 = r4 ^ r6
                r0 = r2
                goto Lc8
            L90:
                int r0 = r2 + 1
                r2 = r1[r2]
                long r4 = (long) r2
                r2 = 49
                long r4 = r4 << r2
                long r4 = r4 ^ r6
                r6 = r4
                int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r2 >= 0) goto La5
                r4 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                long r4 = r4 ^ r6
                goto Lc8
            La5:
                int r2 = r0 + 1
                r0 = r1[r0]
                long r4 = (long) r0
                r0 = 56
                long r4 = r4 << r0
                long r4 = r4 ^ r6
                r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r4 = r4 ^ r6
                int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r0 >= 0) goto Lc7
                int r0 = r2 + 1
                r2 = r1[r2]
                long r6 = (long) r2
                int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r2 >= 0) goto Lc8
            Lc2:
                long r0 = r10.readRawVarint64SlowPath()
                return r0
            Lc7:
                r0 = r2
            Lc8:
                r10.pos = r0
                return r4
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
                r6 = this;
                r0 = 0
                r2 = 0
            L3:
                r3 = 64
                if (r2 >= r3) goto L18
                byte r3 = r6.readRawByte()
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

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                int r0 = decodeZigZag32(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                long r0 = decodeZigZag64(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
                r5 = this;
                int r0 = r5.readRawVarint32()
                if (r0 <= 0) goto L1e
                int r1 = r5.limit
                int r2 = r5.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L1e
                java.lang.String r1 = new java.lang.String
                byte[] r2 = r5.buffer
                int r3 = r5.pos
                java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                r1.<init>(r2, r3, r0, r4)
                int r2 = r5.pos
                int r2 = r2 + r0
                r5.pos = r2
                return r1
            L1e:
                if (r0 != 0) goto L23
                java.lang.String r1 = ""
                return r1
            L23:
                if (r0 >= 0) goto L2a
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r1
            L2a:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
                r3 = this;
                int r0 = r3.readRawVarint32()
                if (r0 <= 0) goto L1b
                int r1 = r3.limit
                int r2 = r3.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L1b
                byte[] r1 = r3.buffer
                int r2 = r3.pos
                java.lang.String r1 = com.google.crypto.tink.shaded.protobuf.Utf8.decodeUtf8(r1, r2, r0)
                int r2 = r3.pos
                int r2 = r2 + r0
                r3.pos = r2
                return r1
            L1b:
                if (r0 != 0) goto L20
                java.lang.String r1 = ""
                return r1
            L20:
                if (r0 > 0) goto L27
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r1
            L27:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.isAtEnd()
                if (r0 == 0) goto La
                r0 = 0
                r1.lastTag = r0
                return r0
            La:
                int r0 = r1.readRawVarint32()
                r1.lastTag = r0
                int r0 = r1.lastTag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r0)
                if (r0 == 0) goto L1b
                int r0 = r1.lastTag
                return r0
            L1b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidTag()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3) throws java.io.IOException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
                r1.readGroup(r2, r3, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void resetSizeCounter() {
                r1 = this;
                int r0 = r1.pos
                r1.startPos = r0
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int r4) throws java.io.IOException {
                r3 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r4)
                r1 = 4
                r2 = 1
                switch(r0) {
                    case 0: goto L32;
                    case 1: goto L2c;
                    case 2: goto L24;
                    case 3: goto L14;
                    case 4: goto L12;
                    case 5: goto Le;
                    default: goto L9;
                }
            L9:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            Le:
                r3.skipRawBytes(r1)
                return r2
            L12:
                r0 = 0
                return r0
            L14:
                r3.skipMessage()
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r4)
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r0, r1)
                r3.checkLastTagWas(r0)
                return r2
            L24:
                int r0 = r3.readRawVarint32()
                r3.skipRawBytes(r0)
                return r2
            L2c:
                r0 = 8
                r3.skipRawBytes(r0)
                return r2
            L32:
                r3.skipRawVarint()
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int r5, com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6) throws java.io.IOException {
                r4 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r5)
                r1 = 1
                switch(r0) {
                    case 0: goto L47;
                    case 1: goto L3c;
                    case 2: goto L31;
                    case 3: goto L1a;
                    case 4: goto L18;
                    case 5: goto Ld;
                    default: goto L8;
                }
            L8:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            Ld:
                int r0 = r4.readRawLittleEndian32()
                r6.writeUInt32NoTag(r5)
                r6.writeFixed32NoTag(r0)
                return r1
            L18:
                r0 = 0
                return r0
            L1a:
                r6.writeUInt32NoTag(r5)
                r4.skipMessage(r6)
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r5)
                r2 = 4
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r0, r2)
                r4.checkLastTagWas(r0)
                r6.writeUInt32NoTag(r0)
                return r1
            L31:
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.readBytes()
                r6.writeUInt32NoTag(r5)
                r6.writeBytesNoTag(r0)
                return r1
            L3c:
                long r2 = r4.readRawLittleEndian64()
                r6.writeUInt32NoTag(r5)
                r6.writeFixed64NoTag(r2)
                return r1
            L47:
                long r2 = r4.readInt64()
                r6.writeUInt32NoTag(r5)
                r6.writeUInt64NoTag(r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage() throws java.io.IOException {
                r2 = this;
            L1:
                int r0 = r2.readTag()
                if (r0 == 0) goto Lf
                boolean r1 = r2.skipField(r0)
                if (r1 != 0) goto Le
                goto Lf
            Le:
                goto L1
            Lf:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3) throws java.io.IOException {
                r2 = this;
            L1:
                int r0 = r2.readTag()
                if (r0 == 0) goto Lf
                boolean r1 = r2.skipField(r0, r3)
                if (r1 != 0) goto Le
                goto Lf
            Le:
                goto L1
            Lf:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipRawBytes(int r3) throws java.io.IOException {
                r2 = this;
                if (r3 < 0) goto Lf
                int r0 = r2.limit
                int r1 = r2.pos
                int r0 = r0 - r1
                if (r3 > r0) goto Lf
                int r0 = r2.pos
                int r0 = r0 + r3
                r2.pos = r0
                return
            Lf:
                if (r3 >= 0) goto L16
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L16:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }
    }

    private static final class IterableDirectByteBufferDecoder extends com.google.crypto.tink.shaded.protobuf.CodedInputStream {
        private int bufferSizeAfterCurrentLimit;
        private long currentAddress;
        private java.nio.ByteBuffer currentByteBuffer;
        private long currentByteBufferLimit;
        private long currentByteBufferPos;
        private long currentByteBufferStartPos;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private final java.lang.Iterable<java.nio.ByteBuffer> input;
        private final java.util.Iterator<java.nio.ByteBuffer> iterator;
        private int lastTag;
        private int startOffset;
        private int totalBufferSize;
        private int totalBytesRead;

        private IterableDirectByteBufferDecoder(java.lang.Iterable<java.nio.ByteBuffer> r3, int r4, boolean r5) {
                r2 = this;
                r0 = 0
                r2.<init>(r0)
                r0 = 2147483647(0x7fffffff, float:NaN)
                r2.currentLimit = r0
                r2.totalBufferSize = r4
                r2.input = r3
                java.lang.Iterable<java.nio.ByteBuffer> r0 = r2.input
                java.util.Iterator r0 = r0.iterator()
                r2.iterator = r0
                r2.immutable = r5
                r0 = 0
                r2.totalBytesRead = r0
                r2.startOffset = r0
                if (r4 != 0) goto L2d
                java.nio.ByteBuffer r0 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_BUFFER
                r2.currentByteBuffer = r0
                r0 = 0
                r2.currentByteBufferPos = r0
                r2.currentByteBufferStartPos = r0
                r2.currentByteBufferLimit = r0
                r2.currentAddress = r0
                goto L30
            L2d:
                r2.tryGetNextByteBuffer()
            L30:
                return
        }

        /* synthetic */ IterableDirectByteBufferDecoder(java.lang.Iterable r1, int r2, boolean r3, com.google.crypto.tink.shaded.protobuf.CodedInputStream.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        private long currentRemaining() {
                r4 = this;
                long r0 = r4.currentByteBufferLimit
                long r2 = r4.currentByteBufferPos
                long r0 = r0 - r2
                return r0
        }

        private void getNextByteBuffer() throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                java.util.Iterator<java.nio.ByteBuffer> r0 = r1.iterator
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Lc
                r1.tryGetNextByteBuffer()
                return
            Lc:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        private void readRawBytesTo(byte[] r10, int r11, int r12) throws java.io.IOException {
                r9 = this;
                if (r12 < 0) goto L35
                int r0 = r9.remaining()
                if (r12 > r0) goto L35
                r0 = r12
            L9:
                if (r0 <= 0) goto L34
                long r1 = r9.currentRemaining()
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 != 0) goto L18
                r9.getNextByteBuffer()
            L18:
                long r1 = r9.currentRemaining()
                int r1 = (int) r1
                int r1 = java.lang.Math.min(r0, r1)
                long r2 = r9.currentByteBufferPos
                int r4 = r12 - r0
                int r4 = r4 + r11
                long r5 = (long) r4
                long r7 = (long) r1
                r4 = r10
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.copyMemory(r2, r4, r5, r7)
                int r0 = r0 - r1
                long r2 = r9.currentByteBufferPos
                long r5 = (long) r1
                long r2 = r2 + r5
                r9.currentByteBufferPos = r2
                goto L9
            L34:
                return
            L35:
                r4 = r10
                if (r12 > 0) goto L40
                if (r12 != 0) goto L3b
                return
            L3b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r10 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r10
            L40:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r10 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r10
        }

        private void recomputeBufferSizeAfterLimit() {
                r3 = this;
                int r0 = r3.totalBufferSize
                int r1 = r3.bufferSizeAfterCurrentLimit
                int r0 = r0 + r1
                r3.totalBufferSize = r0
                int r0 = r3.totalBufferSize
                int r1 = r3.startOffset
                int r0 = r0 - r1
                int r1 = r3.currentLimit
                if (r0 <= r1) goto L1e
                int r1 = r3.currentLimit
                int r1 = r0 - r1
                r3.bufferSizeAfterCurrentLimit = r1
                int r1 = r3.totalBufferSize
                int r2 = r3.bufferSizeAfterCurrentLimit
                int r1 = r1 - r2
                r3.totalBufferSize = r1
                goto L21
            L1e:
                r1 = 0
                r3.bufferSizeAfterCurrentLimit = r1
            L21:
                return
        }

        private int remaining() {
                r4 = this;
                int r0 = r4.totalBufferSize
                int r1 = r4.totalBytesRead
                int r0 = r0 - r1
                long r0 = (long) r0
                long r2 = r4.currentByteBufferPos
                long r0 = r0 - r2
                long r2 = r4.currentByteBufferStartPos
                long r0 = r0 + r2
                int r0 = (int) r0
                return r0
        }

        private void skipRawVarint() throws java.io.IOException {
                r2 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto Lf
                byte r1 = r2.readRawByte()
                if (r1 < 0) goto Lc
                return
            Lc:
                int r0 = r0 + 1
                goto L1
            Lf:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        private java.nio.ByteBuffer slice(int r6, int r7) throws java.io.IOException {
                r5 = this;
                java.nio.ByteBuffer r0 = r5.currentByteBuffer
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r5.currentByteBuffer
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r5.currentByteBuffer
                r2.position(r6)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalArgumentException -> L23
                r2.limit(r7)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalArgumentException -> L23
                java.nio.ByteBuffer r3 = r5.currentByteBuffer     // Catch: java.lang.Throwable -> L21 java.lang.IllegalArgumentException -> L23
                java.nio.ByteBuffer r3 = r3.slice()     // Catch: java.lang.Throwable -> L21 java.lang.IllegalArgumentException -> L23
                r2.position(r0)
                r2.limit(r1)
                return r3
            L21:
                r3 = move-exception
                goto L29
            L23:
                r3 = move-exception
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()     // Catch: java.lang.Throwable -> L21
                throw r4     // Catch: java.lang.Throwable -> L21
            L29:
                r2.position(r0)
                r2.limit(r1)
                throw r3
        }

        private void tryGetNextByteBuffer() {
                r5 = this;
                java.util.Iterator<java.nio.ByteBuffer> r0 = r5.iterator
                java.lang.Object r0 = r0.next()
                java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
                r5.currentByteBuffer = r0
                int r0 = r5.totalBytesRead
                long r1 = r5.currentByteBufferPos
                long r3 = r5.currentByteBufferStartPos
                long r1 = r1 - r3
                int r1 = (int) r1
                int r0 = r0 + r1
                r5.totalBytesRead = r0
                java.nio.ByteBuffer r0 = r5.currentByteBuffer
                int r0 = r0.position()
                long r0 = (long) r0
                r5.currentByteBufferPos = r0
                long r0 = r5.currentByteBufferPos
                r5.currentByteBufferStartPos = r0
                java.nio.ByteBuffer r0 = r5.currentByteBuffer
                int r0 = r0.limit()
                long r0 = (long) r0
                r5.currentByteBufferLimit = r0
                java.nio.ByteBuffer r0 = r5.currentByteBuffer
                long r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.addressOffset(r0)
                r5.currentAddress = r0
                long r0 = r5.currentByteBufferPos
                long r2 = r5.currentAddress
                long r0 = r0 + r2
                r5.currentByteBufferPos = r0
                long r0 = r5.currentByteBufferStartPos
                long r2 = r5.currentAddress
                long r0 = r0 + r2
                r5.currentByteBufferStartPos = r0
                long r0 = r5.currentByteBufferLimit
                long r2 = r5.currentAddress
                long r0 = r0 + r2
                r5.currentByteBufferLimit = r0
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void checkLastTagWas(int r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                int r0 = r1.lastTag
                if (r0 != r2) goto L5
                return
            L5:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidEndTag()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void enableAliasing(boolean r1) {
                r0 = this;
                r0.enableAliasing = r1
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
                r2 = this;
                int r0 = r2.currentLimit
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L9
                r0 = -1
                return r0
            L9:
                int r0 = r2.currentLimit
                int r1 = r2.getTotalBytesRead()
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getLastTag() {
                r1 = this;
                int r0 = r1.lastTag
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getTotalBytesRead() {
                r4 = this;
                int r0 = r4.totalBytesRead
                int r1 = r4.startOffset
                int r0 = r0 - r1
                long r0 = (long) r0
                long r2 = r4.currentByteBufferPos
                long r0 = r0 + r2
                long r2 = r4.currentByteBufferStartPos
                long r0 = r0 - r2
                int r0 = (int) r0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
                r4 = this;
                int r0 = r4.totalBytesRead
                long r0 = (long) r0
                long r2 = r4.currentByteBufferPos
                long r0 = r0 + r2
                long r2 = r4.currentByteBufferStartPos
                long r0 = r0 - r2
                int r2 = r4.totalBufferSize
                long r2 = (long) r2
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void popLimit(int r1) {
                r0 = this;
                r0.currentLimit = r1
                r0.recomputeBufferSizeAfterLimit()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int pushLimit(int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r2 = this;
                if (r3 < 0) goto L16
                int r0 = r2.getTotalBytesRead()
                int r3 = r3 + r0
                int r0 = r2.currentLimit
                if (r3 > r0) goto L11
                r2.currentLimit = r3
                r2.recomputeBufferSizeAfterLimit()
                return r0
            L11:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
            L16:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
                r4 = this;
                long r0 = r4.readRawVarint64()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                byte[] r0 = r1.readRawBytes(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
                r9 = this;
                int r0 = r9.readRawVarint32()
                if (r0 <= 0) goto L45
                long r1 = (long) r0
                long r3 = r9.currentRemaining()
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 > 0) goto L45
                boolean r1 = r9.immutable
                if (r1 != 0) goto L30
                boolean r1 = r9.enableAliasing
                if (r1 == 0) goto L30
                long r1 = r9.currentByteBufferPos
                long r3 = (long) r0
                long r1 = r1 + r3
                r9.currentByteBufferPos = r1
                long r1 = r9.currentByteBufferPos
                long r3 = r9.currentAddress
                long r1 = r1 - r3
                long r3 = (long) r0
                long r1 = r1 - r3
                int r1 = (int) r1
                long r2 = r9.currentByteBufferPos
                long r4 = r9.currentAddress
                long r2 = r2 - r4
                int r2 = (int) r2
                java.nio.ByteBuffer r1 = r9.slice(r1, r2)
                return r1
            L30:
                byte[] r4 = new byte[r0]
                long r2 = r9.currentByteBufferPos
                r5 = 0
                long r7 = (long) r0
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.copyMemory(r2, r4, r5, r7)
                long r1 = r9.currentByteBufferPos
                long r5 = (long) r0
                long r1 = r1 + r5
                r9.currentByteBufferPos = r1
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r4)
                return r1
            L45:
                if (r0 <= 0) goto L58
                int r1 = r9.remaining()
                if (r0 > r1) goto L58
                byte[] r1 = new byte[r0]
                r2 = 0
                r9.readRawBytesTo(r1, r2, r0)
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r1)
                return r2
            L58:
                if (r0 != 0) goto L5d
                java.nio.ByteBuffer r1 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_BUFFER
                return r1
            L5d:
                if (r0 >= 0) goto L64
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r1
            L64:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public com.google.crypto.tink.shaded.protobuf.ByteString readBytes() throws java.io.IOException {
                r12 = this;
                int r0 = r12.readRawVarint32()
                if (r0 <= 0) goto L44
                long r1 = (long) r0
                long r3 = r12.currentByteBufferLimit
                long r5 = r12.currentByteBufferPos
                long r3 = r3 - r5
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 > 0) goto L44
                boolean r1 = r12.immutable
                if (r1 == 0) goto L2f
                boolean r1 = r12.enableAliasing
                if (r1 == 0) goto L2f
                long r1 = r12.currentByteBufferPos
                long r3 = r12.currentAddress
                long r1 = r1 - r3
                int r1 = (int) r1
                int r2 = r1 + r0
                java.nio.ByteBuffer r2 = r12.slice(r1, r2)
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r2)
                long r3 = r12.currentByteBufferPos
                long r5 = (long) r0
                long r3 = r3 + r5
                r12.currentByteBufferPos = r3
                return r2
            L2f:
                byte[] r7 = new byte[r0]
                long r5 = r12.currentByteBufferPos
                r8 = 0
                long r10 = (long) r0
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.copyMemory(r5, r7, r8, r10)
                long r1 = r12.currentByteBufferPos
                long r3 = (long) r0
                long r1 = r1 + r3
                r12.currentByteBufferPos = r1
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r7)
                return r1
            L44:
                if (r0 <= 0) goto L9d
                int r1 = r12.remaining()
                if (r0 > r1) goto L9d
                boolean r1 = r12.immutable
                if (r1 == 0) goto L92
                boolean r1 = r12.enableAliasing
                if (r1 == 0) goto L92
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r2 = r0
            L5a:
                if (r2 <= 0) goto L8d
                long r3 = r12.currentRemaining()
                r5 = 0
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 != 0) goto L69
                r12.getNextByteBuffer()
            L69:
                long r3 = r12.currentRemaining()
                int r3 = (int) r3
                int r3 = java.lang.Math.min(r2, r3)
                long r4 = r12.currentByteBufferPos
                long r6 = r12.currentAddress
                long r4 = r4 - r6
                int r4 = (int) r4
                int r5 = r4 + r3
                java.nio.ByteBuffer r5 = r12.slice(r4, r5)
                com.google.crypto.tink.shaded.protobuf.ByteString r5 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r5)
                r1.add(r5)
                int r2 = r2 - r3
                long r5 = r12.currentByteBufferPos
                long r7 = (long) r3
                long r5 = r5 + r7
                r12.currentByteBufferPos = r5
                goto L5a
            L8d:
                com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
                return r3
            L92:
                byte[] r1 = new byte[r0]
                r2 = 0
                r12.readRawBytesTo(r1, r2, r0)
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r1)
                return r2
            L9d:
                if (r0 != 0) goto La2
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
                return r1
            La2:
                if (r0 >= 0) goto La9
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r1
            La9:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readGroup(int r3, com.google.crypto.tink.shaded.protobuf.Parser<T> r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws java.io.IOException {
                r2 = this;
                r2.checkRecursionLimit()
                int r0 = r2.recursionDepth
                int r0 = r0 + 1
                r2.recursionDepth = r0
                java.lang.Object r0 = r4.parsePartialFrom(r2, r5)
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
                r1 = 4
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r3, r1)
                r2.checkLastTagWas(r1)
                int r1 = r2.recursionDepth
                int r1 = r1 + (-1)
                r2.recursionDepth = r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r1 = this;
                r1.checkRecursionLimit()
                int r0 = r1.recursionDepth
                int r0 = r0 + 1
                r1.recursionDepth = r0
                r3.mergeFrom(r1, r4)
                r0 = 4
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r2, r0)
                r1.checkLastTagWas(r0)
                int r0 = r1.recursionDepth
                int r0 = r0 + (-1)
                r1.recursionDepth = r0
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readMessage(com.google.crypto.tink.shaded.protobuf.Parser<T> r5, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r6) throws java.io.IOException {
                r4 = this;
                int r0 = r4.readRawVarint32()
                r4.checkRecursionLimit()
                int r1 = r4.pushLimit(r0)
                int r2 = r4.recursionDepth
                int r2 = r2 + 1
                r4.recursionDepth = r2
                java.lang.Object r2 = r5.parsePartialFrom(r4, r6)
                com.google.crypto.tink.shaded.protobuf.MessageLite r2 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r2
                r3 = 0
                r4.checkLastTagWas(r3)
                int r3 = r4.recursionDepth
                int r3 = r3 + (-1)
                r4.recursionDepth = r3
                int r3 = r4.getBytesUntilLimit()
                if (r3 != 0) goto L2b
                r4.popLimit(r1)
                return r2
            L2b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readMessage(com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws java.io.IOException {
                r3 = this;
                int r0 = r3.readRawVarint32()
                r3.checkRecursionLimit()
                int r1 = r3.pushLimit(r0)
                int r2 = r3.recursionDepth
                int r2 = r2 + 1
                r3.recursionDepth = r2
                r4.mergeFrom(r3, r5)
                r2 = 0
                r3.checkLastTagWas(r2)
                int r2 = r3.recursionDepth
                int r2 = r2 + (-1)
                r3.recursionDepth = r2
                int r2 = r3.getBytesUntilLimit()
                if (r2 != 0) goto L28
                r3.popLimit(r1)
                return
            L28:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
                r4 = this;
                long r0 = r4.currentRemaining()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto Ld
                r4.getNextByteBuffer()
            Ld:
                long r0 = r4.currentByteBufferPos
                r2 = 1
                long r2 = r2 + r0
                r4.currentByteBufferPos = r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readRawBytes(int r9) throws java.io.IOException {
                r8 = this;
                if (r9 < 0) goto L1c
                long r0 = (long) r9
                long r2 = r8.currentRemaining()
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 > 0) goto L1c
                byte[] r3 = new byte[r9]
                long r1 = r8.currentByteBufferPos
                r4 = 0
                long r6 = (long) r9
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.copyMemory(r1, r3, r4, r6)
                long r0 = r8.currentByteBufferPos
                long r4 = (long) r9
                long r0 = r0 + r4
                r8.currentByteBufferPos = r0
                return r3
            L1c:
                if (r9 < 0) goto L2b
                int r0 = r8.remaining()
                if (r9 > r0) goto L2b
                byte[] r0 = new byte[r9]
                r1 = 0
                r8.readRawBytesTo(r0, r1, r9)
                return r0
            L2b:
                if (r9 > 0) goto L37
                if (r9 != 0) goto L32
                byte[] r0 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_ARRAY
                return r0
            L32:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L37:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
                r6 = this;
                long r0 = r6.currentRemaining()
                r2 = 4
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto L3c
                long r0 = r6.currentByteBufferPos
                long r4 = r6.currentByteBufferPos
                long r4 = r4 + r2
                r6.currentByteBufferPos = r4
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                r2 = r2 & 255(0xff, float:3.57E-43)
                r3 = 1
                long r3 = r3 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 8
                r2 = r2 | r3
                r3 = 2
                long r3 = r3 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 16
                r2 = r2 | r3
                r3 = 3
                long r3 = r3 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 24
                r2 = r2 | r3
                return r2
            L3c:
                byte r0 = r6.readRawByte()
                r0 = r0 & 255(0xff, float:3.57E-43)
                byte r1 = r6.readRawByte()
                r1 = r1 & 255(0xff, float:3.57E-43)
                int r1 = r1 << 8
                r0 = r0 | r1
                byte r1 = r6.readRawByte()
                r1 = r1 & 255(0xff, float:3.57E-43)
                int r1 = r1 << 16
                r0 = r0 | r1
                byte r1 = r6.readRawByte()
                r1 = r1 & 255(0xff, float:3.57E-43)
                int r1 = r1 << 24
                r0 = r0 | r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
                r18 = this;
                r0 = r18
                long r1 = r0.currentRemaining()
                r3 = 8
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                r5 = 48
                r6 = 40
                r7 = 32
                r8 = 24
                r9 = 16
                r10 = 8
                r11 = 255(0xff, double:1.26E-321)
                if (r1 < 0) goto L7c
                long r13 = r0.currentByteBufferPos
                r15 = r3
                r1 = 56
                long r2 = r0.currentByteBufferPos
                long r2 = r2 + r15
                r0.currentByteBufferPos = r2
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r13)
                long r2 = (long) r2
                long r2 = r2 & r11
                r15 = 1
                long r15 = r15 + r13
                byte r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r15)
                r15 = r1
                r16 = r2
                long r1 = (long) r4
                long r1 = r1 & r11
                long r1 = r1 << r10
                long r1 = r16 | r1
                r3 = 2
                long r3 = r3 + r13
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                long r3 = (long) r3
                long r3 = r3 & r11
                long r3 = r3 << r9
                long r1 = r1 | r3
                r3 = 3
                long r3 = r3 + r13
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                long r3 = (long) r3
                long r3 = r3 & r11
                long r3 = r3 << r8
                long r1 = r1 | r3
                r3 = 4
                long r3 = r3 + r13
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                long r3 = (long) r3
                long r3 = r3 & r11
                long r3 = r3 << r7
                long r1 = r1 | r3
                r3 = 5
                long r3 = r3 + r13
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                long r3 = (long) r3
                long r3 = r3 & r11
                long r3 = r3 << r6
                long r1 = r1 | r3
                r3 = 6
                long r3 = r3 + r13
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                long r3 = (long) r3
                long r3 = r3 & r11
                long r3 = r3 << r5
                long r1 = r1 | r3
                r3 = 7
                long r3 = r3 + r13
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                long r3 = (long) r3
                long r3 = r3 & r11
                long r3 = r3 << r15
                long r1 = r1 | r3
                return r1
            L7c:
                r15 = 56
                byte r1 = r0.readRawByte()
                long r1 = (long) r1
                long r1 = r1 & r11
                byte r3 = r0.readRawByte()
                long r3 = (long) r3
                long r3 = r3 & r11
                long r3 = r3 << r10
                long r1 = r1 | r3
                byte r3 = r0.readRawByte()
                long r3 = (long) r3
                long r3 = r3 & r11
                long r3 = r3 << r9
                long r1 = r1 | r3
                byte r3 = r0.readRawByte()
                long r3 = (long) r3
                long r3 = r3 & r11
                long r3 = r3 << r8
                long r1 = r1 | r3
                byte r3 = r0.readRawByte()
                long r3 = (long) r3
                long r3 = r3 & r11
                long r3 = r3 << r7
                long r1 = r1 | r3
                byte r3 = r0.readRawByte()
                long r3 = (long) r3
                long r3 = r3 & r11
                long r3 = r3 << r6
                long r1 = r1 | r3
                byte r3 = r0.readRawByte()
                long r3 = (long) r3
                long r3 = r3 & r11
                long r3 = r3 << r5
                long r1 = r1 | r3
                byte r3 = r0.readRawByte()
                long r3 = (long) r3
                long r3 = r3 & r11
                long r3 = r3 << r15
                long r1 = r1 | r3
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawVarint32() throws java.io.IOException {
                r10 = this;
                long r0 = r10.currentByteBufferPos
                long r2 = r10.currentByteBufferLimit
                long r4 = r10.currentByteBufferPos
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 != 0) goto Lc
                goto L94
            Lc:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                r1 = r0
                if (r0 < 0) goto L1d
                long r6 = r10.currentByteBufferPos
                long r6 = r6 + r2
                r10.currentByteBufferPos = r6
                return r1
            L1d:
                long r6 = r10.currentByteBufferLimit
                long r8 = r10.currentByteBufferPos
                long r6 = r6 - r8
                r8 = 10
                int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r0 >= 0) goto L2a
                goto L94
            L2a:
                long r6 = r4 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                int r0 = r0 << 7
                r0 = r0 ^ r1
                r1 = r0
                if (r0 >= 0) goto L3a
                r0 = r1 ^ (-128(0xffffffffffffff80, float:NaN))
                goto La8
            L3a:
                long r4 = r6 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                int r0 = r0 << 14
                r0 = r0 ^ r1
                r1 = r0
                if (r0 < 0) goto L4b
                r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
                r6 = r4
                goto La8
            L4b:
                long r6 = r4 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                int r0 = r0 << 21
                r0 = r0 ^ r1
                r1 = r0
                if (r0 >= 0) goto L5c
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto La8
            L5c:
                long r4 = r6 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                int r6 = r0 << 28
                r1 = r1 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r1 = r1 ^ r6
                if (r0 >= 0) goto La6
                long r6 = r4 + r2
                byte r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                if (r4 >= 0) goto La4
                long r4 = r6 + r2
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                if (r6 >= 0) goto La1
                long r6 = r4 + r2
                byte r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                if (r4 >= 0) goto L9f
                long r4 = r6 + r2
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                if (r6 >= 0) goto L9c
                long r6 = r4 + r2
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                if (r2 >= 0) goto L9a
            L94:
                long r0 = r10.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L9a:
                r0 = r1
                goto La8
            L9c:
                r0 = r1
                r6 = r4
                goto La8
            L9f:
                r0 = r1
                goto La8
            La1:
                r0 = r1
                r6 = r4
                goto La8
            La4:
                r0 = r1
                goto La8
            La6:
                r0 = r1
                r6 = r4
            La8:
                r10.currentByteBufferPos = r6
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawVarint64() throws java.io.IOException {
                r12 = this;
                long r0 = r12.currentByteBufferPos
                long r2 = r12.currentByteBufferLimit
                long r4 = r12.currentByteBufferPos
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 != 0) goto Lc
                goto Le4
            Lc:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                r1 = r0
                if (r0 < 0) goto L1e
                long r6 = r12.currentByteBufferPos
                long r6 = r6 + r2
                r12.currentByteBufferPos = r6
                long r2 = (long) r1
                return r2
            L1e:
                long r6 = r12.currentByteBufferLimit
                long r8 = r12.currentByteBufferPos
                long r6 = r6 - r8
                r8 = 10
                int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r0 >= 0) goto L2b
                goto Le4
            L2b:
                long r6 = r4 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                int r0 = r0 << 7
                r0 = r0 ^ r1
                r1 = r0
                if (r0 >= 0) goto L3c
                r0 = r1 ^ (-128(0xffffffffffffff80, float:NaN))
                long r2 = (long) r0
                goto Led
            L3c:
                long r4 = r6 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                int r0 = r0 << 14
                r0 = r0 ^ r1
                r1 = r0
                if (r0 < 0) goto L4e
                r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
                long r2 = (long) r0
                r6 = r4
                goto Led
            L4e:
                long r6 = r4 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                int r0 = r0 << 21
                r0 = r0 ^ r1
                r1 = r0
                if (r0 >= 0) goto L61
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                long r2 = (long) r0
                goto Led
            L61:
                long r4 = (long) r1
                long r8 = r6 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r6 = (long) r0
                r0 = 28
                long r6 = r6 << r0
                long r4 = r4 ^ r6
                r6 = r4
                r10 = 0
                int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r0 < 0) goto L7b
                r2 = 266354560(0xfe03f80, double:1.315966377E-315)
                long r2 = r2 ^ r6
                r6 = r8
                goto Led
            L7b:
                long r4 = r8 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8)
                long r8 = (long) r0
                r0 = 35
                long r8 = r8 << r0
                long r8 = r8 ^ r6
                r6 = r8
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 >= 0) goto L93
                r2 = -34093383808(0xfffffff80fe03f80, double:NaN)
                long r2 = r2 ^ r6
                r6 = r4
                goto Led
            L93:
                long r8 = r4 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                long r4 = (long) r0
                r0 = 42
                long r4 = r4 << r0
                long r4 = r4 ^ r6
                r6 = r4
                int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r0 < 0) goto Lab
                r2 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                long r2 = r2 ^ r6
                r6 = r8
                goto Led
            Lab:
                long r4 = r8 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8)
                long r8 = (long) r0
                r0 = 49
                long r8 = r8 << r0
                long r8 = r8 ^ r6
                r6 = r8
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 >= 0) goto Lc3
                r2 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                long r2 = r2 ^ r6
                r6 = r4
                goto Led
            Lc3:
                long r8 = r4 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                long r4 = (long) r0
                r0 = 56
                long r4 = r4 << r0
                long r4 = r4 ^ r6
                r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r4 = r4 ^ r6
                int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r0 >= 0) goto Leb
                long r6 = r8 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8)
                long r2 = (long) r0
                int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                if (r0 >= 0) goto Le9
            Le4:
                long r0 = r12.readRawVarint64SlowPath()
                return r0
            Le9:
                r2 = r4
                goto Led
            Leb:
                r2 = r4
                r6 = r8
            Led:
                r12.currentByteBufferPos = r6
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
                r6 = this;
                r0 = 0
                r2 = 0
            L3:
                r3 = 64
                if (r2 >= r3) goto L18
                byte r3 = r6.readRawByte()
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

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                int r0 = decodeZigZag32(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                long r0 = decodeZigZag64(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
                r9 = this;
                int r0 = r9.readRawVarint32()
                if (r0 <= 0) goto L28
                long r1 = (long) r0
                long r3 = r9.currentByteBufferLimit
                long r5 = r9.currentByteBufferPos
                long r3 = r3 - r5
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 > 0) goto L28
                byte[] r4 = new byte[r0]
                long r2 = r9.currentByteBufferPos
                r5 = 0
                long r7 = (long) r0
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.copyMemory(r2, r4, r5, r7)
                java.lang.String r1 = new java.lang.String
                java.nio.charset.Charset r2 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                r1.<init>(r4, r2)
                long r2 = r9.currentByteBufferPos
                long r5 = (long) r0
                long r2 = r2 + r5
                r9.currentByteBufferPos = r2
                return r1
            L28:
                if (r0 <= 0) goto L3e
                int r1 = r9.remaining()
                if (r0 > r1) goto L3e
                byte[] r1 = new byte[r0]
                r2 = 0
                r9.readRawBytesTo(r1, r2, r0)
                java.lang.String r2 = new java.lang.String
                java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                r2.<init>(r1, r3)
                return r2
            L3e:
                if (r0 != 0) goto L43
                java.lang.String r1 = ""
                return r1
            L43:
                if (r0 >= 0) goto L4a
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r1
            L4a:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
                r7 = this;
                int r0 = r7.readRawVarint32()
                if (r0 <= 0) goto L23
                long r1 = (long) r0
                long r3 = r7.currentByteBufferLimit
                long r5 = r7.currentByteBufferPos
                long r3 = r3 - r5
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 > 0) goto L23
                long r1 = r7.currentByteBufferPos
                long r3 = r7.currentByteBufferStartPos
                long r1 = r1 - r3
                int r1 = (int) r1
                java.nio.ByteBuffer r2 = r7.currentByteBuffer
                java.lang.String r2 = com.google.crypto.tink.shaded.protobuf.Utf8.decodeUtf8(r2, r1, r0)
                long r3 = r7.currentByteBufferPos
                long r5 = (long) r0
                long r3 = r3 + r5
                r7.currentByteBufferPos = r3
                return r2
            L23:
                if (r0 < 0) goto L36
                int r1 = r7.remaining()
                if (r0 > r1) goto L36
                byte[] r1 = new byte[r0]
                r2 = 0
                r7.readRawBytesTo(r1, r2, r0)
                java.lang.String r2 = com.google.crypto.tink.shaded.protobuf.Utf8.decodeUtf8(r1, r2, r0)
                return r2
            L36:
                if (r0 != 0) goto L3b
                java.lang.String r1 = ""
                return r1
            L3b:
                if (r0 > 0) goto L42
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r1
            L42:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.isAtEnd()
                if (r0 == 0) goto La
                r0 = 0
                r1.lastTag = r0
                return r0
            La:
                int r0 = r1.readRawVarint32()
                r1.lastTag = r0
                int r0 = r1.lastTag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r0)
                if (r0 == 0) goto L1b
                int r0 = r1.lastTag
                return r0
            L1b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidTag()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3) throws java.io.IOException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
                r1.readGroup(r2, r3, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void resetSizeCounter() {
                r4 = this;
                int r0 = r4.totalBytesRead
                long r0 = (long) r0
                long r2 = r4.currentByteBufferPos
                long r0 = r0 + r2
                long r2 = r4.currentByteBufferStartPos
                long r0 = r0 - r2
                int r0 = (int) r0
                r4.startOffset = r0
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int r4) throws java.io.IOException {
                r3 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r4)
                r1 = 4
                r2 = 1
                switch(r0) {
                    case 0: goto L32;
                    case 1: goto L2c;
                    case 2: goto L24;
                    case 3: goto L14;
                    case 4: goto L12;
                    case 5: goto Le;
                    default: goto L9;
                }
            L9:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            Le:
                r3.skipRawBytes(r1)
                return r2
            L12:
                r0 = 0
                return r0
            L14:
                r3.skipMessage()
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r4)
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r0, r1)
                r3.checkLastTagWas(r0)
                return r2
            L24:
                int r0 = r3.readRawVarint32()
                r3.skipRawBytes(r0)
                return r2
            L2c:
                r0 = 8
                r3.skipRawBytes(r0)
                return r2
            L32:
                r3.skipRawVarint()
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int r5, com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6) throws java.io.IOException {
                r4 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r5)
                r1 = 1
                switch(r0) {
                    case 0: goto L47;
                    case 1: goto L3c;
                    case 2: goto L31;
                    case 3: goto L1a;
                    case 4: goto L18;
                    case 5: goto Ld;
                    default: goto L8;
                }
            L8:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            Ld:
                int r0 = r4.readRawLittleEndian32()
                r6.writeUInt32NoTag(r5)
                r6.writeFixed32NoTag(r0)
                return r1
            L18:
                r0 = 0
                return r0
            L1a:
                r6.writeUInt32NoTag(r5)
                r4.skipMessage(r6)
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r5)
                r2 = 4
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r0, r2)
                r4.checkLastTagWas(r0)
                r6.writeUInt32NoTag(r0)
                return r1
            L31:
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.readBytes()
                r6.writeUInt32NoTag(r5)
                r6.writeBytesNoTag(r0)
                return r1
            L3c:
                long r2 = r4.readRawLittleEndian64()
                r6.writeUInt32NoTag(r5)
                r6.writeFixed64NoTag(r2)
                return r1
            L47:
                long r2 = r4.readInt64()
                r6.writeUInt32NoTag(r5)
                r6.writeUInt64NoTag(r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage() throws java.io.IOException {
                r2 = this;
            L1:
                int r0 = r2.readTag()
                if (r0 == 0) goto Lf
                boolean r1 = r2.skipField(r0)
                if (r1 != 0) goto Le
                goto Lf
            Le:
                goto L1
            Lf:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3) throws java.io.IOException {
                r2 = this;
            L1:
                int r0 = r2.readTag()
                if (r0 == 0) goto Lf
                boolean r1 = r2.skipField(r0, r3)
                if (r1 != 0) goto Le
                goto Lf
            Le:
                goto L1
            Lf:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipRawBytes(int r7) throws java.io.IOException {
                r6 = this;
                if (r7 < 0) goto L35
                long r0 = (long) r7
                int r2 = r6.totalBufferSize
                int r3 = r6.totalBytesRead
                int r2 = r2 - r3
                long r2 = (long) r2
                long r4 = r6.currentByteBufferPos
                long r2 = r2 - r4
                long r4 = r6.currentByteBufferStartPos
                long r2 = r2 + r4
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 > 0) goto L35
                r0 = r7
            L14:
                if (r0 <= 0) goto L34
                long r1 = r6.currentRemaining()
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 != 0) goto L23
                r6.getNextByteBuffer()
            L23:
                long r1 = r6.currentRemaining()
                int r1 = (int) r1
                int r1 = java.lang.Math.min(r0, r1)
                int r0 = r0 - r1
                long r2 = r6.currentByteBufferPos
                long r4 = (long) r1
                long r2 = r2 + r4
                r6.currentByteBufferPos = r2
                goto L14
            L34:
                return
            L35:
                if (r7 >= 0) goto L3c
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L3c:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }
    }

    private static final class StreamDecoder extends com.google.crypto.tink.shaded.protobuf.CodedInputStream {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final java.io.InputStream input;
        private int lastTag;
        private int pos;
        private com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.RefillCallback refillCallback;
        private int totalBytesRetired;

        private interface RefillCallback {
            void onRefill();
        }

        private class SkippedDataSink implements com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.RefillCallback {
            private java.io.ByteArrayOutputStream byteArrayStream;
            private int lastPos;
            final /* synthetic */ com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder this$0;

            private SkippedDataSink(com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder r1 = r0.this$0
                    int r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.access$500(r1)
                    r0.lastPos = r1
                    return
            }

            java.nio.ByteBuffer getSkippedData() {
                    r4 = this;
                    java.io.ByteArrayOutputStream r0 = r4.byteArrayStream
                    if (r0 != 0) goto L1a
                    com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder r0 = r4.this$0
                    byte[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.access$600(r0)
                    int r1 = r4.lastPos
                    com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder r2 = r4.this$0
                    int r2 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.access$500(r2)
                    int r3 = r4.lastPos
                    int r2 = r2 - r3
                    java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0, r1, r2)
                    return r0
                L1a:
                    java.io.ByteArrayOutputStream r0 = r4.byteArrayStream
                    com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder r1 = r4.this$0
                    byte[] r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.access$600(r1)
                    int r2 = r4.lastPos
                    com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder r3 = r4.this$0
                    int r3 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.access$500(r3)
                    r0.write(r1, r2, r3)
                    java.io.ByteArrayOutputStream r0 = r4.byteArrayStream
                    byte[] r0 = r0.toByteArray()
                    java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                    return r0
            }

            @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.RefillCallback
            public void onRefill() {
                    r5 = this;
                    java.io.ByteArrayOutputStream r0 = r5.byteArrayStream
                    if (r0 != 0) goto Lb
                    java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
                    r0.<init>()
                    r5.byteArrayStream = r0
                Lb:
                    java.io.ByteArrayOutputStream r0 = r5.byteArrayStream
                    com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder r1 = r5.this$0
                    byte[] r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.access$600(r1)
                    int r2 = r5.lastPos
                    com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder r3 = r5.this$0
                    int r3 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.access$500(r3)
                    int r4 = r5.lastPos
                    int r3 = r3 - r4
                    r0.write(r1, r2, r3)
                    r0 = 0
                    r5.lastPos = r0
                    return
            }
        }

        private StreamDecoder(java.io.InputStream r3, int r4) {
                r2 = this;
                r0 = 0
                r2.<init>(r0)
                r1 = 2147483647(0x7fffffff, float:NaN)
                r2.currentLimit = r1
                r2.refillCallback = r0
                java.lang.String r0 = "input"
                com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3, r0)
                r2.input = r3
                byte[] r0 = new byte[r4]
                r2.buffer = r0
                r0 = 0
                r2.bufferSize = r0
                r2.pos = r0
                r2.totalBytesRetired = r0
                return
        }

        /* synthetic */ StreamDecoder(java.io.InputStream r1, int r2, com.google.crypto.tink.shaded.protobuf.CodedInputStream.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ int access$500(com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder r1) {
                int r0 = r1.pos
                return r0
        }

        static /* synthetic */ byte[] access$600(com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder r1) {
                byte[] r0 = r1.buffer
                return r0
        }

        private static int available(java.io.InputStream r1) throws java.io.IOException {
                int r0 = r1.available()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L5
                return r0
            L5:
                r0 = move-exception
                r0.setThrownFromInputStream()
                throw r0
        }

        private static int read(java.io.InputStream r1, byte[] r2, int r3, int r4) throws java.io.IOException {
                int r0 = r1.read(r2, r3, r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L5
                return r0
            L5:
                r0 = move-exception
                r0.setThrownFromInputStream()
                throw r0
        }

        private com.google.crypto.tink.shaded.protobuf.ByteString readBytesSlowPath(int r12) throws java.io.IOException {
                r11 = this;
                byte[] r0 = r11.readRawBytesSlowPathOneChunk(r12)
                if (r0 == 0) goto Lb
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r0)
                return r1
            Lb:
                int r1 = r11.pos
                int r2 = r11.bufferSize
                int r3 = r11.pos
                int r2 = r2 - r3
                int r3 = r11.totalBytesRetired
                int r4 = r11.bufferSize
                int r3 = r3 + r4
                r11.totalBytesRetired = r3
                r3 = 0
                r11.pos = r3
                r11.bufferSize = r3
                int r4 = r12 - r2
                java.util.List r5 = r11.readRawBytesSlowPathRemainingChunks(r4)
                byte[] r6 = new byte[r12]
                byte[] r7 = r11.buffer
                java.lang.System.arraycopy(r7, r1, r6, r3, r2)
                r7 = r2
                java.util.Iterator r8 = r5.iterator()
            L30:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L43
                java.lang.Object r9 = r8.next()
                byte[] r9 = (byte[]) r9
                int r10 = r9.length
                java.lang.System.arraycopy(r9, r3, r6, r7, r10)
                int r10 = r9.length
                int r7 = r7 + r10
                goto L30
            L43:
                com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r6)
                return r3
        }

        private byte[] readRawBytesSlowPath(int r12, boolean r13) throws java.io.IOException {
                r11 = this;
                byte[] r0 = r11.readRawBytesSlowPathOneChunk(r12)
                if (r0 == 0) goto L11
                if (r13 == 0) goto Lf
                java.lang.Object r1 = r0.clone()
                byte[] r1 = (byte[]) r1
                goto L10
            Lf:
                r1 = r0
            L10:
                return r1
            L11:
                int r1 = r11.pos
                int r2 = r11.bufferSize
                int r3 = r11.pos
                int r2 = r2 - r3
                int r3 = r11.totalBytesRetired
                int r4 = r11.bufferSize
                int r3 = r3 + r4
                r11.totalBytesRetired = r3
                r3 = 0
                r11.pos = r3
                r11.bufferSize = r3
                int r4 = r12 - r2
                java.util.List r5 = r11.readRawBytesSlowPathRemainingChunks(r4)
                byte[] r6 = new byte[r12]
                byte[] r7 = r11.buffer
                java.lang.System.arraycopy(r7, r1, r6, r3, r2)
                r7 = r2
                java.util.Iterator r8 = r5.iterator()
            L36:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L49
                java.lang.Object r9 = r8.next()
                byte[] r9 = (byte[]) r9
                int r10 = r9.length
                java.lang.System.arraycopy(r9, r3, r6, r7, r10)
                int r10 = r9.length
                int r7 = r7 + r10
                goto L36
            L49:
                return r6
        }

        private byte[] readRawBytesSlowPathOneChunk(int r8) throws java.io.IOException {
                r7 = this;
                if (r8 != 0) goto L5
                byte[] r0 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_ARRAY
                return r0
            L5:
                if (r8 < 0) goto L73
                int r0 = r7.totalBytesRetired
                int r1 = r7.pos
                int r0 = r0 + r1
                int r0 = r0 + r8
                int r1 = r7.sizeLimit
                int r1 = r0 - r1
                if (r1 > 0) goto L6e
                int r1 = r7.currentLimit
                if (r0 > r1) goto L5e
                int r1 = r7.bufferSize
                int r2 = r7.pos
                int r1 = r1 - r2
                int r2 = r8 - r1
                r3 = 4096(0x1000, float:5.74E-42)
                if (r2 < r3) goto L2d
                java.io.InputStream r3 = r7.input
                int r3 = available(r3)
                if (r2 > r3) goto L2b
                goto L2d
            L2b:
                r3 = 0
                return r3
            L2d:
                byte[] r3 = new byte[r8]
                byte[] r4 = r7.buffer
                int r5 = r7.pos
                r6 = 0
                java.lang.System.arraycopy(r4, r5, r3, r6, r1)
                int r4 = r7.totalBytesRetired
                int r5 = r7.bufferSize
                int r4 = r4 + r5
                r7.totalBytesRetired = r4
                r7.pos = r6
                r7.bufferSize = r6
                r4 = r1
            L43:
                int r5 = r3.length
                if (r4 >= r5) goto L5d
                java.io.InputStream r5 = r7.input
                int r6 = r8 - r4
                int r5 = read(r5, r3, r4, r6)
                r6 = -1
                if (r5 == r6) goto L58
                int r6 = r7.totalBytesRetired
                int r6 = r6 + r5
                r7.totalBytesRetired = r6
                int r4 = r4 + r5
                goto L43
            L58:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r6 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r6
            L5d:
                return r3
            L5e:
                int r1 = r7.currentLimit
                int r2 = r7.totalBytesRetired
                int r1 = r1 - r2
                int r2 = r7.pos
                int r1 = r1 - r2
                r7.skipRawBytes(r1)
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
            L6e:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.sizeLimitExceeded()
                throw r1
            L73:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
        }

        private java.util.List<byte[]> readRawBytesSlowPathRemainingChunks(int r6) throws java.io.IOException {
                r5 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            L5:
                if (r6 <= 0) goto L30
                r1 = 4096(0x1000, float:5.74E-42)
                int r1 = java.lang.Math.min(r6, r1)
                byte[] r1 = new byte[r1]
                r2 = 0
            L10:
                int r3 = r1.length
                if (r2 >= r3) goto L2a
                java.io.InputStream r3 = r5.input
                int r4 = r1.length
                int r4 = r4 - r2
                int r3 = r3.read(r1, r2, r4)
                r4 = -1
                if (r3 == r4) goto L25
                int r4 = r5.totalBytesRetired
                int r4 = r4 + r3
                r5.totalBytesRetired = r4
                int r2 = r2 + r3
                goto L10
            L25:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r4
            L2a:
                int r3 = r1.length
                int r6 = r6 - r3
                r0.add(r1)
                goto L5
            L30:
                return r0
        }

        private void recomputeBufferSizeAfterLimit() {
                r3 = this;
                int r0 = r3.bufferSize
                int r1 = r3.bufferSizeAfterLimit
                int r0 = r0 + r1
                r3.bufferSize = r0
                int r0 = r3.totalBytesRetired
                int r1 = r3.bufferSize
                int r0 = r0 + r1
                int r1 = r3.currentLimit
                if (r0 <= r1) goto L1e
                int r1 = r3.currentLimit
                int r1 = r0 - r1
                r3.bufferSizeAfterLimit = r1
                int r1 = r3.bufferSize
                int r2 = r3.bufferSizeAfterLimit
                int r1 = r1 - r2
                r3.bufferSize = r1
                goto L21
            L1e:
                r1 = 0
                r3.bufferSizeAfterLimit = r1
            L21:
                return
        }

        private void refillBuffer(int r3) throws java.io.IOException {
                r2 = this;
                boolean r0 = r2.tryRefillBuffer(r3)
                if (r0 != 0) goto L1a
                int r0 = r2.sizeLimit
                int r1 = r2.totalBytesRetired
                int r0 = r0 - r1
                int r1 = r2.pos
                int r0 = r0 - r1
                if (r3 <= r0) goto L15
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.sizeLimitExceeded()
                throw r0
            L15:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
            L1a:
                return
        }

        private static long skip(java.io.InputStream r2, long r3) throws java.io.IOException {
                long r0 = r2.skip(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L5
                return r0
            L5:
                r0 = move-exception
                r0.setThrownFromInputStream()
                throw r0
        }

        private void skipRawBytesSlowPath(int r9) throws java.io.IOException {
                r8 = this;
                if (r9 < 0) goto Lb2
                int r0 = r8.totalBytesRetired
                int r1 = r8.pos
                int r0 = r0 + r1
                int r0 = r0 + r9
                int r1 = r8.currentLimit
                if (r0 > r1) goto La2
                r0 = 0
                com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder$RefillCallback r1 = r8.refillCallback
                if (r1 != 0) goto L7d
                int r1 = r8.totalBytesRetired
                int r2 = r8.pos
                int r1 = r1 + r2
                r8.totalBytesRetired = r1
                int r1 = r8.bufferSize
                int r2 = r8.pos
                int r1 = r1 - r2
                r0 = 0
                r8.bufferSize = r0
                r8.pos = r0
                r0 = r1
            L23:
                if (r0 >= r9) goto L74
                int r1 = r9 - r0
                java.io.InputStream r2 = r8.input     // Catch: java.lang.Throwable -> L6a
                long r3 = (long) r1     // Catch: java.lang.Throwable -> L6a
                long r2 = skip(r2, r3)     // Catch: java.lang.Throwable -> L6a
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L41
                long r6 = (long) r1     // Catch: java.lang.Throwable -> L6a
                int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r6 > 0) goto L41
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 != 0) goto L3e
                goto L74
            L3e:
                int r4 = (int) r2     // Catch: java.lang.Throwable -> L6a
                int r0 = r0 + r4
                goto L23
            L41:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6a
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
                r5.<init>()     // Catch: java.lang.Throwable -> L6a
                java.io.InputStream r6 = r8.input     // Catch: java.lang.Throwable -> L6a
                java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L6a
                java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L6a
                java.lang.String r6 = "#skip returned invalid result: "
                java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L6a
                java.lang.StringBuilder r5 = r5.append(r2)     // Catch: java.lang.Throwable -> L6a
                java.lang.String r6 = "\nThe InputStream implementation is buggy."
                java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L6a
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L6a
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L6a
                throw r4     // Catch: java.lang.Throwable -> L6a
            L6a:
                r1 = move-exception
                int r2 = r8.totalBytesRetired
                int r2 = r2 + r0
                r8.totalBytesRetired = r2
                r8.recomputeBufferSizeAfterLimit()
                throw r1
            L74:
                int r1 = r8.totalBytesRetired
                int r1 = r1 + r0
                r8.totalBytesRetired = r1
                r8.recomputeBufferSizeAfterLimit()
            L7d:
                if (r0 >= r9) goto La1
                int r1 = r8.bufferSize
                int r2 = r8.pos
                int r1 = r1 - r2
                int r2 = r8.bufferSize
                r8.pos = r2
                r2 = 1
                r8.refillBuffer(r2)
            L8c:
                int r3 = r9 - r1
                int r4 = r8.bufferSize
                if (r3 <= r4) goto L9d
                int r3 = r8.bufferSize
                int r1 = r1 + r3
                int r3 = r8.bufferSize
                r8.pos = r3
                r8.refillBuffer(r2)
                goto L8c
            L9d:
                int r2 = r9 - r1
                r8.pos = r2
            La1:
                return
            La2:
                int r0 = r8.currentLimit
                int r1 = r8.totalBytesRetired
                int r0 = r0 - r1
                int r1 = r8.pos
                int r0 = r0 - r1
                r8.skipRawBytes(r0)
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
            Lb2:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
        }

        private void skipRawVarint() throws java.io.IOException {
                r2 = this;
                int r0 = r2.bufferSize
                int r1 = r2.pos
                int r0 = r0 - r1
                r1 = 10
                if (r0 < r1) goto Ld
                r2.skipRawVarintFastPath()
                goto L10
            Ld:
                r2.skipRawVarintSlowPath()
            L10:
                return
        }

        private void skipRawVarintFastPath() throws java.io.IOException {
                r4 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto L15
                byte[] r1 = r4.buffer
                int r2 = r4.pos
                int r3 = r2 + 1
                r4.pos = r3
                r1 = r1[r2]
                if (r1 < 0) goto L12
                return
            L12:
                int r0 = r0 + 1
                goto L1
            L15:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
                r2 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto Lf
                byte r1 = r2.readRawByte()
                if (r1 < 0) goto Lc
                return
            Lc:
                int r0 = r0 + 1
                goto L1
            Lf:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        private boolean tryRefillBuffer(int r9) throws java.io.IOException {
                r8 = this;
                int r0 = r8.pos
                int r0 = r0 + r9
                int r1 = r8.bufferSize
                if (r0 <= r1) goto Laa
                int r0 = r8.sizeLimit
                int r1 = r8.totalBytesRetired
                int r0 = r0 - r1
                int r1 = r8.pos
                int r0 = r0 - r1
                r1 = 0
                if (r9 <= r0) goto L13
                return r1
            L13:
                int r0 = r8.totalBytesRetired
                int r2 = r8.pos
                int r0 = r0 + r2
                int r0 = r0 + r9
                int r2 = r8.currentLimit
                if (r0 <= r2) goto L1e
                return r1
            L1e:
                com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder$RefillCallback r0 = r8.refillCallback
                if (r0 == 0) goto L27
                com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder$RefillCallback r0 = r8.refillCallback
                r0.onRefill()
            L27:
                int r0 = r8.pos
                if (r0 <= 0) goto L45
                int r2 = r8.bufferSize
                if (r2 <= r0) goto L39
                byte[] r2 = r8.buffer
                byte[] r3 = r8.buffer
                int r4 = r8.bufferSize
                int r4 = r4 - r0
                java.lang.System.arraycopy(r2, r0, r3, r1, r4)
            L39:
                int r2 = r8.totalBytesRetired
                int r2 = r2 + r0
                r8.totalBytesRetired = r2
                int r2 = r8.bufferSize
                int r2 = r2 - r0
                r8.bufferSize = r2
                r8.pos = r1
            L45:
                java.io.InputStream r2 = r8.input
                byte[] r3 = r8.buffer
                int r4 = r8.bufferSize
                byte[] r5 = r8.buffer
                int r5 = r5.length
                int r6 = r8.bufferSize
                int r5 = r5 - r6
                int r6 = r8.sizeLimit
                int r7 = r8.totalBytesRetired
                int r6 = r6 - r7
                int r7 = r8.bufferSize
                int r6 = r6 - r7
                int r5 = java.lang.Math.min(r5, r6)
                int r2 = read(r2, r3, r4, r5)
                if (r2 == 0) goto L81
                r3 = -1
                if (r2 < r3) goto L81
                byte[] r3 = r8.buffer
                int r3 = r3.length
                if (r2 > r3) goto L81
                if (r2 <= 0) goto L80
                int r1 = r8.bufferSize
                int r1 = r1 + r2
                r8.bufferSize = r1
                r8.recomputeBufferSizeAfterLimit()
                int r1 = r8.bufferSize
                if (r1 < r9) goto L7b
                r1 = 1
                goto L7f
            L7b:
                boolean r1 = r8.tryRefillBuffer(r9)
            L7f:
                return r1
            L80:
                return r1
            L81:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.io.InputStream r4 = r8.input
                java.lang.Class r4 = r4.getClass()
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = "#read(byte[]) returned invalid result: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r2)
                java.lang.String r4 = "\nThe InputStream implementation is buggy."
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                r1.<init>(r3)
                throw r1
            Laa:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "refillBuffer() called when "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r9)
                java.lang.String r2 = " bytes were already available in buffer"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void checkLastTagWas(int r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                int r0 = r1.lastTag
                if (r0 != r2) goto L5
                return
            L5:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidEndTag()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void enableAliasing(boolean r1) {
                r0 = this;
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
                r2 = this;
                int r0 = r2.currentLimit
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L9
                r0 = -1
                return r0
            L9:
                int r0 = r2.totalBytesRetired
                int r1 = r2.pos
                int r0 = r0 + r1
                int r1 = r2.currentLimit
                int r1 = r1 - r0
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getLastTag() {
                r1 = this;
                int r0 = r1.lastTag
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getTotalBytesRead() {
                r2 = this;
                int r0 = r2.totalBytesRetired
                int r1 = r2.pos
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
                r2 = this;
                int r0 = r2.pos
                int r1 = r2.bufferSize
                if (r0 != r1) goto Le
                r0 = 1
                boolean r1 = r2.tryRefillBuffer(r0)
                if (r1 != 0) goto Le
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void popLimit(int r1) {
                r0 = this;
                r0.currentLimit = r1
                r0.recomputeBufferSizeAfterLimit()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int pushLimit(int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r2 = this;
                if (r3 < 0) goto L17
                int r0 = r2.totalBytesRetired
                int r1 = r2.pos
                int r0 = r0 + r1
                int r3 = r3 + r0
                int r0 = r2.currentLimit
                if (r3 > r0) goto L12
                r2.currentLimit = r3
                r2.recomputeBufferSizeAfterLimit()
                return r0
            L12:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
            L17:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
                r4 = this;
                long r0 = r4.readRawVarint64()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
                r4 = this;
                int r0 = r4.readRawVarint32()
                int r1 = r4.bufferSize
                int r2 = r4.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L1e
                if (r0 <= 0) goto L1e
                byte[] r1 = r4.buffer
                int r2 = r4.pos
                int r3 = r4.pos
                int r3 = r3 + r0
                byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
                int r2 = r4.pos
                int r2 = r2 + r0
                r4.pos = r2
                return r1
            L1e:
                r1 = 0
                byte[] r1 = r4.readRawBytesSlowPath(r0, r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
                r4 = this;
                int r0 = r4.readRawVarint32()
                int r1 = r4.bufferSize
                int r2 = r4.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L22
                if (r0 <= 0) goto L22
                byte[] r1 = r4.buffer
                int r2 = r4.pos
                int r3 = r4.pos
                int r3 = r3 + r0
                byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
                int r2 = r4.pos
                int r2 = r2 + r0
                r4.pos = r2
                return r1
            L22:
                if (r0 != 0) goto L27
                java.nio.ByteBuffer r1 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_BUFFER
                return r1
            L27:
                r1 = 1
                byte[] r1 = r4.readRawBytesSlowPath(r0, r1)
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public com.google.crypto.tink.shaded.protobuf.ByteString readBytes() throws java.io.IOException {
                r3 = this;
                int r0 = r3.readRawVarint32()
                int r1 = r3.bufferSize
                int r2 = r3.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L1b
                if (r0 <= 0) goto L1b
                byte[] r1 = r3.buffer
                int r2 = r3.pos
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1, r2, r0)
                int r2 = r3.pos
                int r2 = r2 + r0
                r3.pos = r2
                return r1
            L1b:
                if (r0 != 0) goto L20
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
                return r1
            L20:
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = r3.readBytesSlowPath(r0)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readGroup(int r3, com.google.crypto.tink.shaded.protobuf.Parser<T> r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws java.io.IOException {
                r2 = this;
                r2.checkRecursionLimit()
                int r0 = r2.recursionDepth
                int r0 = r0 + 1
                r2.recursionDepth = r0
                java.lang.Object r0 = r4.parsePartialFrom(r2, r5)
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
                r1 = 4
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r3, r1)
                r2.checkLastTagWas(r1)
                int r1 = r2.recursionDepth
                int r1 = r1 + (-1)
                r2.recursionDepth = r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r1 = this;
                r1.checkRecursionLimit()
                int r0 = r1.recursionDepth
                int r0 = r0 + 1
                r1.recursionDepth = r0
                r3.mergeFrom(r1, r4)
                r0 = 4
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r2, r0)
                r1.checkLastTagWas(r0)
                int r0 = r1.recursionDepth
                int r0 = r0 + (-1)
                r1.recursionDepth = r0
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readMessage(com.google.crypto.tink.shaded.protobuf.Parser<T> r5, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r6) throws java.io.IOException {
                r4 = this;
                int r0 = r4.readRawVarint32()
                r4.checkRecursionLimit()
                int r1 = r4.pushLimit(r0)
                int r2 = r4.recursionDepth
                int r2 = r2 + 1
                r4.recursionDepth = r2
                java.lang.Object r2 = r5.parsePartialFrom(r4, r6)
                com.google.crypto.tink.shaded.protobuf.MessageLite r2 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r2
                r3 = 0
                r4.checkLastTagWas(r3)
                int r3 = r4.recursionDepth
                int r3 = r3 + (-1)
                r4.recursionDepth = r3
                int r3 = r4.getBytesUntilLimit()
                if (r3 != 0) goto L2b
                r4.popLimit(r1)
                return r2
            L2b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readMessage(com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws java.io.IOException {
                r3 = this;
                int r0 = r3.readRawVarint32()
                r3.checkRecursionLimit()
                int r1 = r3.pushLimit(r0)
                int r2 = r3.recursionDepth
                int r2 = r2 + 1
                r3.recursionDepth = r2
                r4.mergeFrom(r3, r5)
                r2 = 0
                r3.checkLastTagWas(r2)
                int r2 = r3.recursionDepth
                int r2 = r2 + (-1)
                r3.recursionDepth = r2
                int r2 = r3.getBytesUntilLimit()
                if (r2 != 0) goto L28
                r3.popLimit(r1)
                return
            L28:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
                r3 = this;
                int r0 = r3.pos
                int r1 = r3.bufferSize
                if (r0 != r1) goto La
                r0 = 1
                r3.refillBuffer(r0)
            La:
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + 1
                r3.pos = r2
                r0 = r0[r1]
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readRawBytes(int r4) throws java.io.IOException {
                r3 = this;
                int r0 = r3.pos
                int r1 = r3.bufferSize
                int r1 = r1 - r0
                if (r4 > r1) goto L16
                if (r4 <= 0) goto L16
                int r1 = r0 + r4
                r3.pos = r1
                byte[] r1 = r3.buffer
                int r2 = r0 + r4
                byte[] r1 = java.util.Arrays.copyOfRange(r1, r0, r2)
                return r1
            L16:
                r1 = 0
                byte[] r1 = r3.readRawBytesSlowPath(r4, r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
                r4 = this;
                int r0 = r4.pos
                int r1 = r4.bufferSize
                int r1 = r1 - r0
                r2 = 4
                if (r1 >= r2) goto Ld
                r4.refillBuffer(r2)
                int r0 = r4.pos
            Ld:
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

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
                r9 = this;
                int r0 = r9.pos
                int r1 = r9.bufferSize
                int r1 = r1 - r0
                r2 = 8
                if (r1 >= r2) goto Le
                r9.refillBuffer(r2)
                int r0 = r9.pos
            Le:
                byte[] r1 = r9.buffer
                int r3 = r0 + 8
                r9.pos = r3
                r3 = r1[r0]
                long r3 = (long) r3
                r5 = 255(0xff, double:1.26E-321)
                long r3 = r3 & r5
                int r7 = r0 + 1
                r7 = r1[r7]
                long r7 = (long) r7
                long r7 = r7 & r5
                long r7 = r7 << r2
                long r2 = r3 | r7
                int r4 = r0 + 2
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 16
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 3
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 24
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 4
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 32
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 5
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 40
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 6
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 48
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 7
                r4 = r1[r4]
                long r7 = (long) r4
                long r4 = r7 & r5
                r6 = 56
                long r4 = r4 << r6
                long r2 = r2 | r4
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawVarint32() throws java.io.IOException {
                r6 = this;
                int r0 = r6.pos
                int r1 = r6.bufferSize
                if (r1 != r0) goto L8
                goto L74
            L8:
                byte[] r1 = r6.buffer
                int r2 = r0 + 1
                r0 = r1[r0]
                r3 = r0
                if (r0 < 0) goto L14
                r6.pos = r2
                return r3
            L14:
                int r0 = r6.bufferSize
                int r0 = r0 - r2
                r4 = 9
                if (r0 >= r4) goto L1c
                goto L74
            L1c:
                int r0 = r2 + 1
                r2 = r1[r2]
                int r2 = r2 << 7
                r2 = r2 ^ r3
                r3 = r2
                if (r2 >= 0) goto L29
                r2 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L7f
            L29:
                int r2 = r0 + 1
                r0 = r1[r0]
                int r0 = r0 << 14
                r0 = r0 ^ r3
                r3 = r0
                if (r0 < 0) goto L39
                r0 = r3 ^ 16256(0x3f80, float:2.278E-41)
                r5 = r2
                r2 = r0
                r0 = r5
                goto L7f
            L39:
                int r0 = r2 + 1
                r2 = r1[r2]
                int r2 = r2 << 21
                r2 = r2 ^ r3
                r3 = r2
                if (r2 >= 0) goto L48
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r2 = r2 ^ r3
                goto L7f
            L48:
                int r2 = r0 + 1
                r0 = r1[r0]
                int r4 = r0 << 28
                r3 = r3 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r3 = r3 ^ r4
                if (r0 >= 0) goto L7d
                int r4 = r2 + 1
                r2 = r1[r2]
                if (r2 >= 0) goto L7a
                int r2 = r4 + 1
                r4 = r1[r4]
                if (r4 >= 0) goto L7d
                int r4 = r2 + 1
                r2 = r1[r2]
                if (r2 >= 0) goto L7a
                int r2 = r4 + 1
                r4 = r1[r4]
                if (r4 >= 0) goto L7d
                int r4 = r2 + 1
                r2 = r1[r2]
                if (r2 >= 0) goto L7a
            L74:
                long r0 = r6.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L7a:
                r2 = r3
                r0 = r4
                goto L7f
            L7d:
                r0 = r2
                r2 = r3
            L7f:
                r6.pos = r0
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawVarint64() throws java.io.IOException {
                r10 = this;
                int r0 = r10.pos
                int r1 = r10.bufferSize
                if (r1 != r0) goto L8
                goto Lc2
            L8:
                byte[] r1 = r10.buffer
                int r2 = r0 + 1
                r0 = r1[r0]
                r3 = r0
                if (r0 < 0) goto L15
                r10.pos = r2
                long r4 = (long) r3
                return r4
            L15:
                int r0 = r10.bufferSize
                int r0 = r0 - r2
                r4 = 9
                if (r0 >= r4) goto L1e
                goto Lc2
            L1e:
                int r0 = r2 + 1
                r2 = r1[r2]
                int r2 = r2 << 7
                r2 = r2 ^ r3
                r3 = r2
                if (r2 >= 0) goto L2d
                r2 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
                long r4 = (long) r2
                goto Lc8
            L2d:
                int r2 = r0 + 1
                r0 = r1[r0]
                int r0 = r0 << 14
                r0 = r0 ^ r3
                r3 = r0
                if (r0 < 0) goto L3d
                r0 = r3 ^ 16256(0x3f80, float:2.278E-41)
                long r4 = (long) r0
                r0 = r2
                goto Lc8
            L3d:
                int r0 = r2 + 1
                r2 = r1[r2]
                int r2 = r2 << 21
                r2 = r2 ^ r3
                r3 = r2
                if (r2 >= 0) goto L4e
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r2 = r2 ^ r3
                long r4 = (long) r2
                goto Lc8
            L4e:
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
                if (r0 < 0) goto L65
                r4 = 266354560(0xfe03f80, double:1.315966377E-315)
                long r4 = r4 ^ r6
                r0 = r2
                goto Lc8
            L65:
                int r0 = r2 + 1
                r2 = r1[r2]
                long r4 = (long) r2
                r2 = 35
                long r4 = r4 << r2
                long r4 = r4 ^ r6
                r6 = r4
                int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r2 >= 0) goto L7a
                r4 = -34093383808(0xfffffff80fe03f80, double:NaN)
                long r4 = r4 ^ r6
                goto Lc8
            L7a:
                int r2 = r0 + 1
                r0 = r1[r0]
                long r4 = (long) r0
                r0 = 42
                long r4 = r4 << r0
                long r4 = r4 ^ r6
                r6 = r4
                int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r0 < 0) goto L90
                r4 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                long r4 = r4 ^ r6
                r0 = r2
                goto Lc8
            L90:
                int r0 = r2 + 1
                r2 = r1[r2]
                long r4 = (long) r2
                r2 = 49
                long r4 = r4 << r2
                long r4 = r4 ^ r6
                r6 = r4
                int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r2 >= 0) goto La5
                r4 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                long r4 = r4 ^ r6
                goto Lc8
            La5:
                int r2 = r0 + 1
                r0 = r1[r0]
                long r4 = (long) r0
                r0 = 56
                long r4 = r4 << r0
                long r4 = r4 ^ r6
                r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r4 = r4 ^ r6
                int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r0 >= 0) goto Lc7
                int r0 = r2 + 1
                r2 = r1[r2]
                long r6 = (long) r2
                int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r2 >= 0) goto Lc8
            Lc2:
                long r0 = r10.readRawVarint64SlowPath()
                return r0
            Lc7:
                r0 = r2
            Lc8:
                r10.pos = r0
                return r4
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
                r6 = this;
                r0 = 0
                r2 = 0
            L3:
                r3 = 64
                if (r2 >= r3) goto L18
                byte r3 = r6.readRawByte()
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

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                int r0 = decodeZigZag32(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                long r0 = decodeZigZag64(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
                r5 = this;
                int r0 = r5.readRawVarint32()
                if (r0 <= 0) goto L1e
                int r1 = r5.bufferSize
                int r2 = r5.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L1e
                java.lang.String r1 = new java.lang.String
                byte[] r2 = r5.buffer
                int r3 = r5.pos
                java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                r1.<init>(r2, r3, r0, r4)
                int r2 = r5.pos
                int r2 = r2 + r0
                r5.pos = r2
                return r1
            L1e:
                if (r0 != 0) goto L23
                java.lang.String r1 = ""
                return r1
            L23:
                int r1 = r5.bufferSize
                if (r0 > r1) goto L3b
                r5.refillBuffer(r0)
                java.lang.String r1 = new java.lang.String
                byte[] r2 = r5.buffer
                int r3 = r5.pos
                java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                r1.<init>(r2, r3, r0, r4)
                int r2 = r5.pos
                int r2 = r2 + r0
                r5.pos = r2
                return r1
            L3b:
                java.lang.String r1 = new java.lang.String
                r2 = 0
                byte[] r2 = r5.readRawBytesSlowPath(r0, r2)
                java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                r1.<init>(r2, r3)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
                r5 = this;
                int r0 = r5.readRawVarint32()
                int r1 = r5.pos
                int r2 = r5.bufferSize
                int r2 = r2 - r1
                if (r0 > r2) goto L15
                if (r0 <= 0) goto L15
                byte[] r2 = r5.buffer
                int r3 = r1 + r0
                r5.pos = r3
                r3 = r1
                goto L2f
            L15:
                if (r0 != 0) goto L1a
                java.lang.String r2 = ""
                return r2
            L1a:
                int r2 = r5.bufferSize
                if (r0 > r2) goto L29
                r5.refillBuffer(r0)
                byte[] r2 = r5.buffer
                r3 = 0
                int r4 = r3 + r0
                r5.pos = r4
                goto L2f
            L29:
                r2 = 0
                byte[] r2 = r5.readRawBytesSlowPath(r0, r2)
                r3 = 0
            L2f:
                java.lang.String r4 = com.google.crypto.tink.shaded.protobuf.Utf8.decodeUtf8(r2, r3, r0)
                return r4
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.isAtEnd()
                if (r0 == 0) goto La
                r0 = 0
                r1.lastTag = r0
                return r0
            La:
                int r0 = r1.readRawVarint32()
                r1.lastTag = r0
                int r0 = r1.lastTag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r0)
                if (r0 == 0) goto L1b
                int r0 = r1.lastTag
                return r0
            L1b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidTag()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3) throws java.io.IOException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
                r1.readGroup(r2, r3, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void resetSizeCounter() {
                r1 = this;
                int r0 = r1.pos
                int r0 = -r0
                r1.totalBytesRetired = r0
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int r4) throws java.io.IOException {
                r3 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r4)
                r1 = 4
                r2 = 1
                switch(r0) {
                    case 0: goto L32;
                    case 1: goto L2c;
                    case 2: goto L24;
                    case 3: goto L14;
                    case 4: goto L12;
                    case 5: goto Le;
                    default: goto L9;
                }
            L9:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            Le:
                r3.skipRawBytes(r1)
                return r2
            L12:
                r0 = 0
                return r0
            L14:
                r3.skipMessage()
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r4)
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r0, r1)
                r3.checkLastTagWas(r0)
                return r2
            L24:
                int r0 = r3.readRawVarint32()
                r3.skipRawBytes(r0)
                return r2
            L2c:
                r0 = 8
                r3.skipRawBytes(r0)
                return r2
            L32:
                r3.skipRawVarint()
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int r5, com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6) throws java.io.IOException {
                r4 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r5)
                r1 = 1
                switch(r0) {
                    case 0: goto L47;
                    case 1: goto L3c;
                    case 2: goto L31;
                    case 3: goto L1a;
                    case 4: goto L18;
                    case 5: goto Ld;
                    default: goto L8;
                }
            L8:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            Ld:
                int r0 = r4.readRawLittleEndian32()
                r6.writeUInt32NoTag(r5)
                r6.writeFixed32NoTag(r0)
                return r1
            L18:
                r0 = 0
                return r0
            L1a:
                r6.writeUInt32NoTag(r5)
                r4.skipMessage(r6)
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r5)
                r2 = 4
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r0, r2)
                r4.checkLastTagWas(r0)
                r6.writeUInt32NoTag(r0)
                return r1
            L31:
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.readBytes()
                r6.writeUInt32NoTag(r5)
                r6.writeBytesNoTag(r0)
                return r1
            L3c:
                long r2 = r4.readRawLittleEndian64()
                r6.writeUInt32NoTag(r5)
                r6.writeFixed64NoTag(r2)
                return r1
            L47:
                long r2 = r4.readInt64()
                r6.writeUInt32NoTag(r5)
                r6.writeUInt64NoTag(r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage() throws java.io.IOException {
                r2 = this;
            L1:
                int r0 = r2.readTag()
                if (r0 == 0) goto Lf
                boolean r1 = r2.skipField(r0)
                if (r1 != 0) goto Le
                goto Lf
            Le:
                goto L1
            Lf:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3) throws java.io.IOException {
                r2 = this;
            L1:
                int r0 = r2.readTag()
                if (r0 == 0) goto Lf
                boolean r1 = r2.skipField(r0, r3)
                if (r1 != 0) goto Le
                goto Lf
            Le:
                goto L1
            Lf:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipRawBytes(int r3) throws java.io.IOException {
                r2 = this;
                int r0 = r2.bufferSize
                int r1 = r2.pos
                int r0 = r0 - r1
                if (r3 > r0) goto Lf
                if (r3 < 0) goto Lf
                int r0 = r2.pos
                int r0 = r0 + r3
                r2.pos = r0
                goto L12
            Lf:
                r2.skipRawBytesSlowPath(r3)
            L12:
                return
        }
    }

    private static final class UnsafeDirectNioDecoder extends com.google.crypto.tink.shaded.protobuf.CodedInputStream {
        private final long address;
        private final java.nio.ByteBuffer buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private long limit;
        private long pos;
        private long startPos;

        private UnsafeDirectNioDecoder(java.nio.ByteBuffer r5, boolean r6) {
                r4 = this;
                r0 = 0
                r4.<init>(r0)
                r0 = 2147483647(0x7fffffff, float:NaN)
                r4.currentLimit = r0
                r4.buffer = r5
                long r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.addressOffset(r5)
                r4.address = r0
                long r0 = r4.address
                int r2 = r5.limit()
                long r2 = (long) r2
                long r0 = r0 + r2
                r4.limit = r0
                long r0 = r4.address
                int r2 = r5.position()
                long r2 = (long) r2
                long r0 = r0 + r2
                r4.pos = r0
                long r0 = r4.pos
                r4.startPos = r0
                r4.immutable = r6
                return
        }

        /* synthetic */ UnsafeDirectNioDecoder(java.nio.ByteBuffer r1, boolean r2, com.google.crypto.tink.shaded.protobuf.CodedInputStream.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private int bufferPos(long r3) {
                r2 = this;
                long r0 = r2.address
                long r0 = r3 - r0
                int r0 = (int) r0
                return r0
        }

        static boolean isSupported() {
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations()
                return r0
        }

        private void recomputeBufferSizeAfterLimit() {
                r5 = this;
                long r0 = r5.limit
                int r2 = r5.bufferSizeAfterLimit
                long r2 = (long) r2
                long r0 = r0 + r2
                r5.limit = r0
                long r0 = r5.limit
                long r2 = r5.startPos
                long r0 = r0 - r2
                int r0 = (int) r0
                int r1 = r5.currentLimit
                if (r0 <= r1) goto L21
                int r1 = r5.currentLimit
                int r1 = r0 - r1
                r5.bufferSizeAfterLimit = r1
                long r1 = r5.limit
                int r3 = r5.bufferSizeAfterLimit
                long r3 = (long) r3
                long r1 = r1 - r3
                r5.limit = r1
                goto L24
            L21:
                r1 = 0
                r5.bufferSizeAfterLimit = r1
            L24:
                return
        }

        private int remaining() {
                r4 = this;
                long r0 = r4.limit
                long r2 = r4.pos
                long r0 = r0 - r2
                int r0 = (int) r0
                return r0
        }

        private void skipRawVarint() throws java.io.IOException {
                r2 = this;
                int r0 = r2.remaining()
                r1 = 10
                if (r0 < r1) goto Lc
                r2.skipRawVarintFastPath()
                goto Lf
            Lc:
                r2.skipRawVarintSlowPath()
            Lf:
                return
        }

        private void skipRawVarintFastPath() throws java.io.IOException {
                r5 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto L16
                long r1 = r5.pos
                r3 = 1
                long r3 = r3 + r1
                r5.pos = r3
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r1)
                if (r1 < 0) goto L13
                return
            L13:
                int r0 = r0 + 1
                goto L1
            L16:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
                r2 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto Lf
                byte r1 = r2.readRawByte()
                if (r1 < 0) goto Lc
                return
            Lc:
                int r0 = r0 + 1
                goto L1
            Lf:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        private java.nio.ByteBuffer slice(long r6, long r8) throws java.io.IOException {
                r5 = this;
                java.nio.ByteBuffer r0 = r5.buffer
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r5.buffer
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r5.buffer
                int r3 = r5.bufferPos(r6)     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L2b
                r2.position(r3)     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L2b
                int r3 = r5.bufferPos(r8)     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L2b
                r2.limit(r3)     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L2b
                java.nio.ByteBuffer r3 = r5.buffer     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L2b
                java.nio.ByteBuffer r3 = r3.slice()     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L2b
                r2.position(r0)
                r2.limit(r1)
                return r3
            L29:
                r3 = move-exception
                goto L35
            L2b:
                r3 = move-exception
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()     // Catch: java.lang.Throwable -> L29
                r4.initCause(r3)     // Catch: java.lang.Throwable -> L29
                throw r4     // Catch: java.lang.Throwable -> L29
            L35:
                r2.position(r0)
                r2.limit(r1)
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void checkLastTagWas(int r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                int r0 = r1.lastTag
                if (r0 != r2) goto L5
                return
            L5:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidEndTag()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void enableAliasing(boolean r1) {
                r0 = this;
                r0.enableAliasing = r1
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
                r2 = this;
                int r0 = r2.currentLimit
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L9
                r0 = -1
                return r0
            L9:
                int r0 = r2.currentLimit
                int r1 = r2.getTotalBytesRead()
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getLastTag() {
                r1 = this;
                int r0 = r1.lastTag
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getTotalBytesRead() {
                r4 = this;
                long r0 = r4.pos
                long r2 = r4.startPos
                long r0 = r0 - r2
                int r0 = (int) r0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
                r4 = this;
                long r0 = r4.pos
                long r2 = r4.limit
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void popLimit(int r1) {
                r0 = this;
                r0.currentLimit = r1
                r0.recomputeBufferSizeAfterLimit()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int pushLimit(int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r2 = this;
                if (r3 < 0) goto L16
                int r0 = r2.getTotalBytesRead()
                int r3 = r3 + r0
                int r0 = r2.currentLimit
                if (r3 > r0) goto L11
                r2.currentLimit = r3
                r2.recomputeBufferSizeAfterLimit()
                return r0
            L11:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
            L16:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
                r4 = this;
                long r0 = r4.readRawVarint64()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                byte[] r0 = r1.readRawBytes(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
                r11 = this;
                int r0 = r11.readRawVarint32()
                if (r0 <= 0) goto L3a
                int r1 = r11.remaining()
                if (r0 > r1) goto L3a
                boolean r1 = r11.immutable
                if (r1 != 0) goto L25
                boolean r1 = r11.enableAliasing
                if (r1 == 0) goto L25
                long r1 = r11.pos
                long r3 = r11.pos
                long r5 = (long) r0
                long r3 = r3 + r5
                java.nio.ByteBuffer r1 = r11.slice(r1, r3)
                long r2 = r11.pos
                long r4 = (long) r0
                long r2 = r2 + r4
                r11.pos = r2
                return r1
            L25:
                byte[] r6 = new byte[r0]
                long r4 = r11.pos
                r7 = 0
                long r9 = (long) r0
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.copyMemory(r4, r6, r7, r9)
                long r1 = r11.pos
                long r3 = (long) r0
                long r1 = r1 + r3
                r11.pos = r1
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r6)
                return r1
            L3a:
                if (r0 != 0) goto L3f
                java.nio.ByteBuffer r1 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_BUFFER
                return r1
            L3f:
                if (r0 >= 0) goto L46
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r1
            L46:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public com.google.crypto.tink.shaded.protobuf.ByteString readBytes() throws java.io.IOException {
                r10 = this;
                int r0 = r10.readRawVarint32()
                if (r0 <= 0) goto L3e
                int r1 = r10.remaining()
                if (r0 > r1) goto L3e
                boolean r1 = r10.immutable
                if (r1 == 0) goto L29
                boolean r1 = r10.enableAliasing
                if (r1 == 0) goto L29
                long r1 = r10.pos
                long r3 = r10.pos
                long r5 = (long) r0
                long r3 = r3 + r5
                java.nio.ByteBuffer r1 = r10.slice(r1, r3)
                long r2 = r10.pos
                long r4 = (long) r0
                long r2 = r2 + r4
                r10.pos = r2
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r1)
                return r2
            L29:
                byte[] r5 = new byte[r0]
                long r3 = r10.pos
                r6 = 0
                long r8 = (long) r0
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.copyMemory(r3, r5, r6, r8)
                long r1 = r10.pos
                long r3 = (long) r0
                long r1 = r1 + r3
                r10.pos = r1
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r5)
                return r1
            L3e:
                if (r0 != 0) goto L43
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
                return r1
            L43:
                if (r0 >= 0) goto L4a
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r1
            L4a:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readGroup(int r3, com.google.crypto.tink.shaded.protobuf.Parser<T> r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws java.io.IOException {
                r2 = this;
                r2.checkRecursionLimit()
                int r0 = r2.recursionDepth
                int r0 = r0 + 1
                r2.recursionDepth = r0
                java.lang.Object r0 = r4.parsePartialFrom(r2, r5)
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
                r1 = 4
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r3, r1)
                r2.checkLastTagWas(r1)
                int r1 = r2.recursionDepth
                int r1 = r1 + (-1)
                r2.recursionDepth = r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r1 = this;
                r1.checkRecursionLimit()
                int r0 = r1.recursionDepth
                int r0 = r0 + 1
                r1.recursionDepth = r0
                r3.mergeFrom(r1, r4)
                r0 = 4
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r2, r0)
                r1.checkLastTagWas(r0)
                int r0 = r1.recursionDepth
                int r0 = r0 + (-1)
                r1.recursionDepth = r0
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readMessage(com.google.crypto.tink.shaded.protobuf.Parser<T> r5, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r6) throws java.io.IOException {
                r4 = this;
                int r0 = r4.readRawVarint32()
                r4.checkRecursionLimit()
                int r1 = r4.pushLimit(r0)
                int r2 = r4.recursionDepth
                int r2 = r2 + 1
                r4.recursionDepth = r2
                java.lang.Object r2 = r5.parsePartialFrom(r4, r6)
                com.google.crypto.tink.shaded.protobuf.MessageLite r2 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r2
                r3 = 0
                r4.checkLastTagWas(r3)
                int r3 = r4.recursionDepth
                int r3 = r3 + (-1)
                r4.recursionDepth = r3
                int r3 = r4.getBytesUntilLimit()
                if (r3 != 0) goto L2b
                r4.popLimit(r1)
                return r2
            L2b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readMessage(com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws java.io.IOException {
                r3 = this;
                int r0 = r3.readRawVarint32()
                r3.checkRecursionLimit()
                int r1 = r3.pushLimit(r0)
                int r2 = r3.recursionDepth
                int r2 = r2 + 1
                r3.recursionDepth = r2
                r4.mergeFrom(r3, r5)
                r2 = 0
                r3.checkLastTagWas(r2)
                int r2 = r3.recursionDepth
                int r2 = r2 + (-1)
                r3.recursionDepth = r2
                int r2 = r3.getBytesUntilLimit()
                if (r2 != 0) goto L28
                r3.popLimit(r1)
                return
            L28:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
                r4 = this;
                long r0 = r4.pos
                long r2 = r4.limit
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L14
                long r0 = r4.pos
                r2 = 1
                long r2 = r2 + r0
                r4.pos = r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                return r0
            L14:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readRawBytes(int r8) throws java.io.IOException {
                r7 = this;
                if (r8 < 0) goto L1e
                int r0 = r7.remaining()
                if (r8 > r0) goto L1e
                byte[] r0 = new byte[r8]
                long r1 = r7.pos
                long r3 = r7.pos
                long r5 = (long) r8
                long r3 = r3 + r5
                java.nio.ByteBuffer r1 = r7.slice(r1, r3)
                r1.get(r0)
                long r1 = r7.pos
                long r3 = (long) r8
                long r1 = r1 + r3
                r7.pos = r1
                return r0
            L1e:
                if (r8 > 0) goto L2a
                if (r8 != 0) goto L25
                byte[] r0 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_ARRAY
                return r0
            L25:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L2a:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
                r6 = this;
                long r0 = r6.pos
                long r2 = r6.limit
                long r2 = r2 - r0
                r4 = 4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L39
                long r4 = r4 + r0
                r6.pos = r4
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                r2 = r2 & 255(0xff, float:3.57E-43)
                r3 = 1
                long r3 = r3 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 8
                r2 = r2 | r3
                r3 = 2
                long r3 = r3 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 16
                r2 = r2 | r3
                r3 = 3
                long r3 = r3 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 24
                r2 = r2 | r3
                return r2
            L39:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
                r9 = this;
                long r0 = r9.pos
                long r2 = r9.limit
                long r2 = r2 - r0
                r4 = 8
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L72
                long r4 = r4 + r0
                r9.pos = r4
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                long r2 = (long) r2
                r4 = 255(0xff, double:1.26E-321)
                long r2 = r2 & r4
                r6 = 1
                long r6 = r6 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 8
                long r6 = r6 << r8
                long r2 = r2 | r6
                r6 = 2
                long r6 = r6 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 16
                long r6 = r6 << r8
                long r2 = r2 | r6
                r6 = 3
                long r6 = r6 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 24
                long r6 = r6 << r8
                long r2 = r2 | r6
                r6 = 4
                long r6 = r6 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 32
                long r6 = r6 << r8
                long r2 = r2 | r6
                r6 = 5
                long r6 = r6 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 40
                long r6 = r6 << r8
                long r2 = r2 | r6
                r6 = 6
                long r6 = r6 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 48
                long r6 = r6 << r8
                long r2 = r2 | r6
                r6 = 7
                long r6 = r6 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r6 = (long) r6
                long r4 = r4 & r6
                r6 = 56
                long r4 = r4 << r6
                long r2 = r2 | r4
                return r2
            L72:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawVarint32() throws java.io.IOException {
                r10 = this;
                long r0 = r10.pos
                long r2 = r10.limit
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8d
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                r1 = r0
                if (r0 < 0) goto L18
                r10.pos = r4
                return r1
            L18:
                long r6 = r10.limit
                long r6 = r6 - r4
                r8 = 9
                int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r0 >= 0) goto L23
                goto L8d
            L23:
                long r6 = r4 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                int r0 = r0 << 7
                r0 = r0 ^ r1
                r1 = r0
                if (r0 >= 0) goto L33
                r0 = r1 ^ (-128(0xffffffffffffff80, float:NaN))
                goto La1
            L33:
                long r4 = r6 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                int r0 = r0 << 14
                r0 = r0 ^ r1
                r1 = r0
                if (r0 < 0) goto L44
                r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
                r6 = r4
                goto La1
            L44:
                long r6 = r4 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                int r0 = r0 << 21
                r0 = r0 ^ r1
                r1 = r0
                if (r0 >= 0) goto L55
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto La1
            L55:
                long r4 = r6 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                int r6 = r0 << 28
                r1 = r1 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r1 = r1 ^ r6
                if (r0 >= 0) goto L9f
                long r6 = r4 + r2
                byte r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                if (r4 >= 0) goto L9d
                long r4 = r6 + r2
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                if (r6 >= 0) goto L9a
                long r6 = r4 + r2
                byte r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                if (r4 >= 0) goto L98
                long r4 = r6 + r2
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                if (r6 >= 0) goto L95
                long r6 = r4 + r2
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                if (r2 >= 0) goto L93
            L8d:
                long r0 = r10.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L93:
                r0 = r1
                goto La1
            L95:
                r0 = r1
                r6 = r4
                goto La1
            L98:
                r0 = r1
                goto La1
            L9a:
                r0 = r1
                r6 = r4
                goto La1
            L9d:
                r0 = r1
                goto La1
            L9f:
                r0 = r1
                r6 = r4
            La1:
                r10.pos = r6
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawVarint64() throws java.io.IOException {
                r12 = this;
                long r0 = r12.pos
                long r2 = r12.limit
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto Ldd
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                r1 = r0
                if (r0 < 0) goto L19
                r12.pos = r4
                long r2 = (long) r1
                return r2
            L19:
                long r6 = r12.limit
                long r6 = r6 - r4
                r8 = 9
                int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r0 >= 0) goto L24
                goto Ldd
            L24:
                long r6 = r4 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                int r0 = r0 << 7
                r0 = r0 ^ r1
                r1 = r0
                if (r0 >= 0) goto L35
                r0 = r1 ^ (-128(0xffffffffffffff80, float:NaN))
                long r2 = (long) r0
                goto Le6
            L35:
                long r4 = r6 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                int r0 = r0 << 14
                r0 = r0 ^ r1
                r1 = r0
                if (r0 < 0) goto L47
                r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
                long r2 = (long) r0
                r6 = r4
                goto Le6
            L47:
                long r6 = r4 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                int r0 = r0 << 21
                r0 = r0 ^ r1
                r1 = r0
                if (r0 >= 0) goto L5a
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                long r2 = (long) r0
                goto Le6
            L5a:
                long r4 = (long) r1
                long r8 = r6 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r6 = (long) r0
                r0 = 28
                long r6 = r6 << r0
                long r4 = r4 ^ r6
                r6 = r4
                r10 = 0
                int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r0 < 0) goto L74
                r2 = 266354560(0xfe03f80, double:1.315966377E-315)
                long r2 = r2 ^ r6
                r6 = r8
                goto Le6
            L74:
                long r4 = r8 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8)
                long r8 = (long) r0
                r0 = 35
                long r8 = r8 << r0
                long r8 = r8 ^ r6
                r6 = r8
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 >= 0) goto L8c
                r2 = -34093383808(0xfffffff80fe03f80, double:NaN)
                long r2 = r2 ^ r6
                r6 = r4
                goto Le6
            L8c:
                long r8 = r4 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                long r4 = (long) r0
                r0 = 42
                long r4 = r4 << r0
                long r4 = r4 ^ r6
                r6 = r4
                int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r0 < 0) goto La4
                r2 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                long r2 = r2 ^ r6
                r6 = r8
                goto Le6
            La4:
                long r4 = r8 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8)
                long r8 = (long) r0
                r0 = 49
                long r8 = r8 << r0
                long r8 = r8 ^ r6
                r6 = r8
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 >= 0) goto Lbc
                r2 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                long r2 = r2 ^ r6
                r6 = r4
                goto Le6
            Lbc:
                long r8 = r4 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                long r4 = (long) r0
                r0 = 56
                long r4 = r4 << r0
                long r4 = r4 ^ r6
                r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r4 = r4 ^ r6
                int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r0 >= 0) goto Le4
                long r6 = r8 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8)
                long r2 = (long) r0
                int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                if (r0 >= 0) goto Le2
            Ldd:
                long r0 = r12.readRawVarint64SlowPath()
                return r0
            Le2:
                r2 = r4
                goto Le6
            Le4:
                r2 = r4
                r6 = r8
            Le6:
                r12.pos = r6
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
                r6 = this;
                r0 = 0
                r2 = 0
            L3:
                r3 = 64
                if (r2 >= r3) goto L18
                byte r3 = r6.readRawByte()
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

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                int r0 = decodeZigZag32(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                long r0 = decodeZigZag64(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
                r9 = this;
                int r0 = r9.readRawVarint32()
                if (r0 <= 0) goto L24
                int r1 = r9.remaining()
                if (r0 > r1) goto L24
                byte[] r4 = new byte[r0]
                long r2 = r9.pos
                r5 = 0
                long r7 = (long) r0
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.copyMemory(r2, r4, r5, r7)
                java.lang.String r1 = new java.lang.String
                java.nio.charset.Charset r2 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                r1.<init>(r4, r2)
                long r2 = r9.pos
                long r5 = (long) r0
                long r2 = r2 + r5
                r9.pos = r2
                return r1
            L24:
                if (r0 != 0) goto L29
                java.lang.String r1 = ""
                return r1
            L29:
                if (r0 >= 0) goto L30
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r1
            L30:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
                r7 = this;
                int r0 = r7.readRawVarint32()
                if (r0 <= 0) goto L1f
                int r1 = r7.remaining()
                if (r0 > r1) goto L1f
                long r1 = r7.pos
                int r1 = r7.bufferPos(r1)
                java.nio.ByteBuffer r2 = r7.buffer
                java.lang.String r2 = com.google.crypto.tink.shaded.protobuf.Utf8.decodeUtf8(r2, r1, r0)
                long r3 = r7.pos
                long r5 = (long) r0
                long r3 = r3 + r5
                r7.pos = r3
                return r2
            L1f:
                if (r0 != 0) goto L24
                java.lang.String r1 = ""
                return r1
            L24:
                if (r0 > 0) goto L2b
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r1
            L2b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.isAtEnd()
                if (r0 == 0) goto La
                r0 = 0
                r1.lastTag = r0
                return r0
            La:
                int r0 = r1.readRawVarint32()
                r1.lastTag = r0
                int r0 = r1.lastTag
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r0)
                if (r0 == 0) goto L1b
                int r0 = r1.lastTag
                return r0
            L1b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidTag()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3) throws java.io.IOException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
                r1.readGroup(r2, r3, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void resetSizeCounter() {
                r2 = this;
                long r0 = r2.pos
                r2.startPos = r0
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int r4) throws java.io.IOException {
                r3 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r4)
                r1 = 4
                r2 = 1
                switch(r0) {
                    case 0: goto L32;
                    case 1: goto L2c;
                    case 2: goto L24;
                    case 3: goto L14;
                    case 4: goto L12;
                    case 5: goto Le;
                    default: goto L9;
                }
            L9:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            Le:
                r3.skipRawBytes(r1)
                return r2
            L12:
                r0 = 0
                return r0
            L14:
                r3.skipMessage()
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r4)
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r0, r1)
                r3.checkLastTagWas(r0)
                return r2
            L24:
                int r0 = r3.readRawVarint32()
                r3.skipRawBytes(r0)
                return r2
            L2c:
                r0 = 8
                r3.skipRawBytes(r0)
                return r2
            L32:
                r3.skipRawVarint()
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int r5, com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6) throws java.io.IOException {
                r4 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r5)
                r1 = 1
                switch(r0) {
                    case 0: goto L47;
                    case 1: goto L3c;
                    case 2: goto L31;
                    case 3: goto L1a;
                    case 4: goto L18;
                    case 5: goto Ld;
                    default: goto L8;
                }
            L8:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            Ld:
                int r0 = r4.readRawLittleEndian32()
                r6.writeUInt32NoTag(r5)
                r6.writeFixed32NoTag(r0)
                return r1
            L18:
                r0 = 0
                return r0
            L1a:
                r6.writeUInt32NoTag(r5)
                r4.skipMessage(r6)
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r5)
                r2 = 4
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r0, r2)
                r4.checkLastTagWas(r0)
                r6.writeUInt32NoTag(r0)
                return r1
            L31:
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.readBytes()
                r6.writeUInt32NoTag(r5)
                r6.writeBytesNoTag(r0)
                return r1
            L3c:
                long r2 = r4.readRawLittleEndian64()
                r6.writeUInt32NoTag(r5)
                r6.writeFixed64NoTag(r2)
                return r1
            L47:
                long r2 = r4.readInt64()
                r6.writeUInt32NoTag(r5)
                r6.writeUInt64NoTag(r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage() throws java.io.IOException {
                r2 = this;
            L1:
                int r0 = r2.readTag()
                if (r0 == 0) goto Lf
                boolean r1 = r2.skipField(r0)
                if (r1 != 0) goto Le
                goto Lf
            Le:
                goto L1
            Lf:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3) throws java.io.IOException {
                r2 = this;
            L1:
                int r0 = r2.readTag()
                if (r0 == 0) goto Lf
                boolean r1 = r2.skipField(r0, r3)
                if (r1 != 0) goto Le
                goto Lf
            Le:
                goto L1
            Lf:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipRawBytes(int r5) throws java.io.IOException {
                r4 = this;
                if (r5 < 0) goto Lf
                int r0 = r4.remaining()
                if (r5 > r0) goto Lf
                long r0 = r4.pos
                long r2 = (long) r5
                long r0 = r0 + r2
                r4.pos = r0
                return
            Lf:
                if (r5 >= 0) goto L16
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L16:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }
    }

    static {
            r0 = 100
            com.google.crypto.tink.shaded.protobuf.CodedInputStream.defaultRecursionLimit = r0
            return
    }

    private CodedInputStream() {
            r1 = this;
            r1.<init>()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.defaultRecursionLimit
            r1.recursionLimit = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.sizeLimit = r0
            r0 = 0
            r1.shouldDiscardUnknownFields = r0
            return
    }

    /* synthetic */ CodedInputStream(com.google.crypto.tink.shaded.protobuf.CodedInputStream.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static int decodeZigZag32(int r2) {
            int r0 = r2 >>> 1
            r1 = r2 & 1
            int r1 = -r1
            r0 = r0 ^ r1
            return r0
    }

    public static long decodeZigZag64(long r4) {
            r0 = 1
            long r0 = r4 >>> r0
            r2 = 1
            long r2 = r2 & r4
            long r2 = -r2
            long r0 = r0 ^ r2
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(java.io.InputStream r1) {
            r0 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = newInstance(r1, r0)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(java.io.InputStream r2, int r3) {
            if (r3 <= 0) goto L12
            if (r2 != 0) goto Lb
            byte[] r0 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_ARRAY
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = newInstance(r0)
            return r0
        Lb:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder r0 = new com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "bufferSize must be > 0"
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(java.lang.Iterable<java.nio.ByteBuffer> r1) {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.UnsafeDirectNioDecoder.isSupported()
            if (r0 != 0) goto L10
            com.google.crypto.tink.shaded.protobuf.IterableByteBufferInputStream r0 = new com.google.crypto.tink.shaded.protobuf.IterableByteBufferInputStream
            r0.<init>(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = newInstance(r0)
            return r0
        L10:
            r0 = 0
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = newInstance(r1, r0)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(java.lang.Iterable<java.nio.ByteBuffer> r5, boolean r6) {
            r0 = 0
            r1 = 0
            java.util.Iterator r2 = r5.iterator()
        L6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r2.next()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r4 = r3.remaining()
            int r1 = r1 + r4
            boolean r4 = r3.hasArray()
            if (r4 == 0) goto L20
            r0 = r0 | 1
            goto L2b
        L20:
            boolean r4 = r3.isDirect()
            if (r4 == 0) goto L29
            r0 = r0 | 2
            goto L2b
        L29:
            r0 = r0 | 4
        L2b:
            goto L6
        L2c:
            r2 = 2
            if (r0 != r2) goto L36
            com.google.crypto.tink.shaded.protobuf.CodedInputStream$IterableDirectByteBufferDecoder r2 = new com.google.crypto.tink.shaded.protobuf.CodedInputStream$IterableDirectByteBufferDecoder
            r3 = 0
            r2.<init>(r5, r1, r6, r3)
            return r2
        L36:
            com.google.crypto.tink.shaded.protobuf.IterableByteBufferInputStream r2 = new com.google.crypto.tink.shaded.protobuf.IterableByteBufferInputStream
            r2.<init>(r5)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = newInstance(r2)
            return r2
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer r1) {
            r0 = 0
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = newInstance(r1, r0)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer r4, boolean r5) {
            boolean r0 = r4.hasArray()
            if (r0 == 0) goto L1d
        L7:
            byte[] r0 = r4.array()
            int r1 = r4.arrayOffset()
            int r2 = r4.position()
            int r1 = r1 + r2
            int r2 = r4.remaining()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = newInstance(r0, r1, r2, r5)
            return r0
        L1d:
            boolean r0 = r4.isDirect()
            if (r0 == 0) goto L30
            boolean r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.UnsafeDirectNioDecoder.isSupported()
            if (r0 == 0) goto L30
            com.google.crypto.tink.shaded.protobuf.CodedInputStream$UnsafeDirectNioDecoder r0 = new com.google.crypto.tink.shaded.protobuf.CodedInputStream$UnsafeDirectNioDecoder
            r1 = 0
            r0.<init>(r4, r5, r1)
            return r0
        L30:
            int r0 = r4.remaining()
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r1 = r4.duplicate()
            r1.get(r0)
            int r1 = r0.length
            r2 = 1
            r3 = 0
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = newInstance(r0, r3, r1, r2)
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(byte[] r2) {
            r0 = 0
            int r1 = r2.length
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = newInstance(r2, r0, r1)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(byte[] r1, int r2, int r3) {
            r0 = 0
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = newInstance(r1, r2, r3, r0)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(byte[] r6, int r7, int r8, boolean r9) {
            com.google.crypto.tink.shaded.protobuf.CodedInputStream$ArrayDecoder r0 = new com.google.crypto.tink.shaded.protobuf.CodedInputStream$ArrayDecoder
            r5 = 0
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6 = r0
            r6.pushLimit(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L10
            return r6
        L10:
            r0 = move-exception
            r7 = r0
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r7)
            throw r8
    }

    public static int readRawVarint32(int r5, java.io.InputStream r6) throws java.io.IOException {
            r0 = r5 & 128(0x80, float:1.8E-43)
            if (r0 != 0) goto L5
            return r5
        L5:
            r0 = r5 & 127(0x7f, float:1.78E-43)
            r1 = 7
        L8:
            r2 = 32
            r3 = -1
            if (r1 >= r2) goto L24
            int r2 = r6.read()
            if (r2 == r3) goto L1f
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << r1
            r0 = r0 | r3
            r3 = r2 & 128(0x80, float:1.8E-43)
            if (r3 != 0) goto L1c
            return r0
        L1c:
            int r1 = r1 + 7
            goto L8
        L1f:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r3
        L24:
            r2 = 64
            if (r1 >= r2) goto L3b
            int r2 = r6.read()
            if (r2 == r3) goto L36
            r4 = r2 & 128(0x80, float:1.8E-43)
            if (r4 != 0) goto L33
            return r0
        L33:
            int r1 = r1 + 7
            goto L24
        L36:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r3
        L3b:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
            throw r2
    }

    static int readRawVarint32(java.io.InputStream r2) throws java.io.IOException {
            int r0 = r2.read()
            r1 = -1
            if (r0 == r1) goto Lc
            int r1 = readRawVarint32(r0, r2)
            return r1
        Lc:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r1
    }

    public abstract void checkLastTagWas(int r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    public void checkRecursionLimit() throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r2 = this;
            int r0 = r2.recursionDepth
            int r1 = r2.recursionLimit
            if (r0 >= r1) goto L7
            return
        L7:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.recursionLimitExceeded()
            throw r0
    }

    final void discardUnknownFields() {
            r1 = this;
            r0 = 1
            r1.shouldDiscardUnknownFields = r0
            return
    }

    public abstract void enableAliasing(boolean r1);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws java.io.IOException;

    public abstract void popLimit(int r1);

    public abstract int pushLimit(int r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    public abstract boolean readBool() throws java.io.IOException;

    public abstract byte[] readByteArray() throws java.io.IOException;

    public abstract java.nio.ByteBuffer readByteBuffer() throws java.io.IOException;

    public abstract com.google.crypto.tink.shaded.protobuf.ByteString readBytes() throws java.io.IOException;

    public abstract double readDouble() throws java.io.IOException;

    public abstract int readEnum() throws java.io.IOException;

    public abstract int readFixed32() throws java.io.IOException;

    public abstract long readFixed64() throws java.io.IOException;

    public abstract float readFloat() throws java.io.IOException;

    public abstract <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readGroup(int r1, com.google.crypto.tink.shaded.protobuf.Parser<T> r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException;

    public abstract void readGroup(int r1, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException;

    public abstract int readInt32() throws java.io.IOException;

    public abstract long readInt64() throws java.io.IOException;

    public abstract <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readMessage(com.google.crypto.tink.shaded.protobuf.Parser<T> r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException;

    public abstract void readMessage(com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException;

    public abstract byte readRawByte() throws java.io.IOException;

    public abstract byte[] readRawBytes(int r1) throws java.io.IOException;

    public abstract int readRawLittleEndian32() throws java.io.IOException;

    public abstract long readRawLittleEndian64() throws java.io.IOException;

    public abstract int readRawVarint32() throws java.io.IOException;

    public abstract long readRawVarint64() throws java.io.IOException;

    abstract long readRawVarint64SlowPath() throws java.io.IOException;

    public abstract int readSFixed32() throws java.io.IOException;

    public abstract long readSFixed64() throws java.io.IOException;

    public abstract int readSInt32() throws java.io.IOException;

    public abstract long readSInt64() throws java.io.IOException;

    public abstract java.lang.String readString() throws java.io.IOException;

    public abstract java.lang.String readStringRequireUtf8() throws java.io.IOException;

    public abstract int readTag() throws java.io.IOException;

    public abstract int readUInt32() throws java.io.IOException;

    public abstract long readUInt64() throws java.io.IOException;

    @java.lang.Deprecated
    public abstract void readUnknownGroup(int r1, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r2) throws java.io.IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int r4) {
            r3 = this;
            if (r4 < 0) goto L7
            int r0 = r3.recursionLimit
            r3.recursionLimit = r4
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Recursion limit cannot be negative: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final int setSizeLimit(int r4) {
            r3 = this;
            if (r4 < 0) goto L7
            int r0 = r3.sizeLimit
            r3.sizeLimit = r4
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Size limit cannot be negative: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    final boolean shouldDiscardUnknownFields() {
            r1 = this;
            boolean r0 = r1.shouldDiscardUnknownFields
            return r0
    }

    public abstract boolean skipField(int r1) throws java.io.IOException;

    @java.lang.Deprecated
    public abstract boolean skipField(int r1, com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2) throws java.io.IOException;

    public abstract void skipMessage() throws java.io.IOException;

    public abstract void skipMessage(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1) throws java.io.IOException;

    public abstract void skipRawBytes(int r1) throws java.io.IOException;

    final void unsetDiscardUnknownFields() {
            r1 = this;
            r0 = 0
            r1.shouldDiscardUnknownFields = r0
            return
    }
}
