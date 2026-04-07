package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
public abstract class ByteString implements java.lang.Iterable<java.lang.Byte>, java.io.Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final com.google.crypto.tink.shaded.protobuf.ByteString EMPTY = null;
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final java.util.Comparator<com.google.crypto.tink.shaded.protobuf.ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = null;
    private static final com.google.crypto.tink.shaded.protobuf.ByteString.ByteArrayCopier byteArrayCopier = null;
    private int hash;



    static abstract class AbstractByteIterator implements com.google.crypto.tink.shaded.protobuf.ByteString.ByteIterator {
        AbstractByteIterator() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public final java.lang.Byte next() {
                r1 = this;
                byte r0 = r1.nextByte()
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Byte next() {
                r1 = this;
                java.lang.Byte r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public final void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    private static final class ArraysByteArrayCopier implements com.google.crypto.tink.shaded.protobuf.ByteString.ByteArrayCopier {
        private ArraysByteArrayCopier() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ ArraysByteArrayCopier(com.google.crypto.tink.shaded.protobuf.ByteString.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] r2, int r3, int r4) {
                r1 = this;
                int r0 = r3 + r4
                byte[] r0 = java.util.Arrays.copyOfRange(r2, r3, r0)
                return r0
        }
    }

    private static final class BoundedByteString extends com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        BoundedByteString(byte[] r3, int r4, int r5) {
                r2 = this;
                r2.<init>(r3)
                int r0 = r4 + r5
                int r1 = r3.length
                checkRange(r4, r0, r1)
                r2.bytesOffset = r4
                r2.bytesLength = r5
                return
        }

        private void readObject(java.io.ObjectInputStream r3) throws java.io.IOException {
                r2 = this;
                java.io.InvalidObjectException r0 = new java.io.InvalidObjectException
                java.lang.String r1 = "BoundedByteStream instances are not to be serialized directly"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public byte byteAt(int r3) {
                r2 = this;
                int r0 = r2.size()
                checkIndex(r3, r0)
                byte[] r0 = r2.bytes
                int r1 = r2.bytesOffset
                int r1 = r1 + r3
                r0 = r0[r1]
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        protected void copyToInternal(byte[] r3, int r4, int r5, int r6) {
                r2 = this;
                byte[] r0 = r2.bytes
                int r1 = r2.getOffsetIntoBytes()
                int r1 = r1 + r4
                java.lang.System.arraycopy(r0, r1, r3, r5, r6)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString
        protected int getOffsetIntoBytes() {
                r1 = this;
                int r0 = r1.bytesOffset
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        byte internalByteAt(int r3) {
                r2 = this;
                byte[] r0 = r2.bytes
                int r1 = r2.bytesOffset
                int r1 = r1 + r3
                r0 = r0[r1]
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public int size() {
                r1 = this;
                int r0 = r1.bytesLength
                return r0
        }

        java.lang.Object writeReplace() {
                r1 = this;
                byte[] r0 = r1.toByteArray()
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r0)
                return r0
        }
    }

    private interface ByteArrayCopier {
        byte[] copyFrom(byte[] r1, int r2, int r3);
    }

    public interface ByteIterator extends java.util.Iterator<java.lang.Byte> {
        byte nextByte();
    }

    static final class CodedBuilder {
        private final byte[] buffer;
        private final com.google.crypto.tink.shaded.protobuf.CodedOutputStream output;

        private CodedBuilder(int r2) {
                r1 = this;
                r1.<init>()
                byte[] r0 = new byte[r2]
                r1.buffer = r0
                byte[] r0 = r1.buffer
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.newInstance(r0)
                r1.output = r0
                return
        }

        /* synthetic */ CodedBuilder(int r1, com.google.crypto.tink.shaded.protobuf.ByteString.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public com.google.crypto.tink.shaded.protobuf.ByteString build() {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r2.output
                r0.checkNoSpaceLeft()
                com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString r0 = new com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString
                byte[] r1 = r2.buffer
                r0.<init>(r1)
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.CodedOutputStream getCodedOutput() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
                return r0
        }
    }

    static abstract class LeafByteString extends com.google.crypto.tink.shaded.protobuf.ByteString {
        LeafByteString() {
                r0 = this;
                r0.<init>()
                return
        }

        abstract boolean equalsRange(com.google.crypto.tink.shaded.protobuf.ByteString r1, int r2, int r3);

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        protected final int getTreeDepth() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        protected final boolean isBalanced() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ByteString$ByteIterator r0 = super.iterator()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        void writeToReverse(com.google.crypto.tink.shaded.protobuf.ByteOutput r1) throws java.io.IOException {
                r0 = this;
                r0.writeTo(r1)
                return
        }
    }

    private static class LiteralByteString extends com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        LiteralByteString(byte[] r2) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto L8
                r1.bytes = r2
                return
            L8:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final java.nio.ByteBuffer asReadOnlyByteBuffer() {
                r3 = this;
                byte[] r0 = r3.bytes
                int r1 = r3.getOffsetIntoBytes()
                int r2 = r3.size()
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0, r1, r2)
                java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.asReadOnlyByteBuffer()
                java.util.List r0 = java.util.Collections.singletonList(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte byteAt(int r2) {
                r1 = this;
                byte[] r0 = r1.bytes
                r0 = r0[r2]
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final void copyTo(java.nio.ByteBuffer r4) {
                r3 = this;
                byte[] r0 = r3.bytes
                int r1 = r3.getOffsetIntoBytes()
                int r2 = r3.size()
                r4.put(r0, r1, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        protected void copyToInternal(byte[] r2, int r3, int r4, int r5) {
                r1 = this;
                byte[] r0 = r1.bytes
                java.lang.System.arraycopy(r0, r3, r2, r4, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final boolean equals(java.lang.Object r7) {
                r6 = this;
                r0 = 1
                if (r7 != r6) goto L4
                return r0
            L4:
                boolean r1 = r7 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                int r1 = r6.size()
                r3 = r7
                com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
                int r3 = r3.size()
                if (r1 == r3) goto L18
                return r2
            L18:
                int r1 = r6.size()
                if (r1 != 0) goto L1f
                return r0
            L1f:
                boolean r0 = r7 instanceof com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString
                if (r0 == 0) goto L41
                r0 = r7
                com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString) r0
                int r1 = r6.peekCachedHashCode()
                int r3 = r0.peekCachedHashCode()
                if (r1 == 0) goto L35
                if (r3 == 0) goto L35
                if (r1 == r3) goto L35
                return r2
            L35:
                r4 = r7
                com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString) r4
                int r5 = r6.size()
                boolean r2 = r6.equalsRange(r4, r2, r5)
                return r2
            L41:
                boolean r0 = r7.equals(r6)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString
        final boolean equalsRange(com.google.crypto.tink.shaded.protobuf.ByteString r10, int r11, int r12) {
                r9 = this;
                int r0 = r10.size()
                if (r12 > r0) goto L76
                int r0 = r11 + r12
                int r1 = r10.size()
                if (r0 > r1) goto L47
                boolean r0 = r10 instanceof com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString
                r1 = 0
                if (r0 == 0) goto L38
                r0 = r10
                com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString) r0
                byte[] r2 = r9.bytes
                byte[] r3 = r0.bytes
                int r4 = r9.getOffsetIntoBytes()
                int r4 = r4 + r12
                int r5 = r9.getOffsetIntoBytes()
                int r6 = r0.getOffsetIntoBytes()
                int r6 = r6 + r11
            L28:
                if (r5 >= r4) goto L36
                r7 = r2[r5]
                r8 = r3[r6]
                if (r7 == r8) goto L31
                return r1
            L31:
                int r5 = r5 + 1
                int r6 = r6 + 1
                goto L28
            L36:
                r1 = 1
                return r1
            L38:
                int r0 = r11 + r12
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r10.substring(r11, r0)
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = r9.substring(r1, r12)
                boolean r0 = r0.equals(r1)
                return r0
            L47:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Ran off end of other: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r11)
                java.lang.String r2 = ", "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r12)
                java.lang.StringBuilder r1 = r1.append(r2)
                int r2 = r10.size()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L76:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Length too large: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r12)
                int r2 = r9.size()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        protected int getOffsetIntoBytes() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        byte internalByteAt(int r2) {
                r1 = this;
                byte[] r0 = r1.bytes
                r0 = r0[r2]
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final boolean isValidUtf8() {
                r3 = this;
                int r0 = r3.getOffsetIntoBytes()
                byte[] r1 = r3.bytes
                int r2 = r3.size()
                int r2 = r2 + r0
                boolean r1 = com.google.crypto.tink.shaded.protobuf.Utf8.isValidUtf8(r1, r0, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final com.google.crypto.tink.shaded.protobuf.CodedInputStream newCodedInput() {
                r4 = this;
                byte[] r0 = r4.bytes
                int r1 = r4.getOffsetIntoBytes()
                int r2 = r4.size()
                r3 = 1
                com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r0, r1, r2, r3)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final java.io.InputStream newInput() {
                r4 = this;
                java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
                byte[] r1 = r4.bytes
                int r2 = r4.getOffsetIntoBytes()
                int r3 = r4.size()
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        protected final int partialHash(int r3, int r4, int r5) {
                r2 = this;
                byte[] r0 = r2.bytes
                int r1 = r2.getOffsetIntoBytes()
                int r1 = r1 + r4
                int r0 = com.google.crypto.tink.shaded.protobuf.Internal.partialHash(r3, r0, r1, r5)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        protected final int partialIsValidUtf8(int r4, int r5, int r6) {
                r3 = this;
                int r0 = r3.getOffsetIntoBytes()
                int r0 = r0 + r5
                byte[] r1 = r3.bytes
                int r2 = r0 + r6
                int r1 = com.google.crypto.tink.shaded.protobuf.Utf8.partialIsValidUtf8(r4, r1, r0, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public int size() {
                r1 = this;
                byte[] r0 = r1.bytes
                int r0 = r0.length
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final com.google.crypto.tink.shaded.protobuf.ByteString substring(int r5, int r6) {
                r4 = this;
                int r0 = r4.size()
                int r0 = checkRange(r5, r6, r0)
                if (r0 != 0) goto Ld
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
                return r1
            Ld:
                com.google.crypto.tink.shaded.protobuf.ByteString$BoundedByteString r1 = new com.google.crypto.tink.shaded.protobuf.ByteString$BoundedByteString
                byte[] r2 = r4.bytes
                int r3 = r4.getOffsetIntoBytes()
                int r3 = r3 + r5
                r1.<init>(r2, r3, r0)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        protected final java.lang.String toStringInternal(java.nio.charset.Charset r5) {
                r4 = this;
                java.lang.String r0 = new java.lang.String
                byte[] r1 = r4.bytes
                int r2 = r4.getOffsetIntoBytes()
                int r3 = r4.size()
                r0.<init>(r1, r2, r3, r5)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        final void writeTo(com.google.crypto.tink.shaded.protobuf.ByteOutput r4) throws java.io.IOException {
                r3 = this;
                byte[] r0 = r3.bytes
                int r1 = r3.getOffsetIntoBytes()
                int r2 = r3.size()
                r4.writeLazy(r0, r1, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final void writeTo(java.io.OutputStream r2) throws java.io.IOException {
                r1 = this;
                byte[] r0 = r1.toByteArray()
                r2.write(r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        final void writeToInternal(java.io.OutputStream r3, int r4, int r5) throws java.io.IOException {
                r2 = this;
                byte[] r0 = r2.bytes
                int r1 = r2.getOffsetIntoBytes()
                int r1 = r1 + r4
                r3.write(r0, r1, r5)
                return
        }
    }

    public static final class Output extends java.io.OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = null;
        private byte[] buffer;
        private int bufferPos;
        private final java.util.ArrayList<com.google.crypto.tink.shaded.protobuf.ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        static {
                r0 = 0
                byte[] r0 = new byte[r0]
                com.google.crypto.tink.shaded.protobuf.ByteString.Output.EMPTY_BYTE_ARRAY = r0
                return
        }

        Output(int r3) {
                r2 = this;
                r2.<init>()
                if (r3 < 0) goto L13
                r2.initialCapacity = r3
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.flushedBuffers = r0
                byte[] r0 = new byte[r3]
                r2.buffer = r0
                return
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Buffer size < 0"
                r0.<init>(r1)
                throw r0
        }

        private byte[] copyArray(byte[] r4, int r5) {
                r3 = this;
                byte[] r0 = new byte[r5]
                int r1 = r4.length
                int r1 = java.lang.Math.min(r1, r5)
                r2 = 0
                java.lang.System.arraycopy(r4, r2, r0, r2, r1)
                return r0
        }

        private void flushFullBuffer(int r4) {
                r3 = this;
                java.util.ArrayList<com.google.crypto.tink.shaded.protobuf.ByteString> r0 = r3.flushedBuffers
                com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString r1 = new com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString
                byte[] r2 = r3.buffer
                r1.<init>(r2)
                r0.add(r1)
                int r0 = r3.flushedBuffersTotalBytes
                byte[] r1 = r3.buffer
                int r1 = r1.length
                int r0 = r0 + r1
                r3.flushedBuffersTotalBytes = r0
                int r0 = r3.initialCapacity
                int r1 = r3.flushedBuffersTotalBytes
                int r1 = r1 >>> 1
                int r1 = java.lang.Math.max(r4, r1)
                int r0 = java.lang.Math.max(r0, r1)
                byte[] r1 = new byte[r0]
                r3.buffer = r1
                r1 = 0
                r3.bufferPos = r1
                return
        }

        private void flushLastBuffer() {
                r3 = this;
                int r0 = r3.bufferPos
                byte[] r1 = r3.buffer
                int r1 = r1.length
                if (r0 >= r1) goto L1e
                int r0 = r3.bufferPos
                if (r0 <= 0) goto L2e
                byte[] r0 = r3.buffer
                int r1 = r3.bufferPos
                byte[] r0 = r3.copyArray(r0, r1)
                java.util.ArrayList<com.google.crypto.tink.shaded.protobuf.ByteString> r1 = r3.flushedBuffers
                com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString r2 = new com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString
                r2.<init>(r0)
                r1.add(r2)
                goto L2e
            L1e:
                java.util.ArrayList<com.google.crypto.tink.shaded.protobuf.ByteString> r0 = r3.flushedBuffers
                com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString r1 = new com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString
                byte[] r2 = r3.buffer
                r1.<init>(r2)
                r0.add(r1)
                byte[] r0 = com.google.crypto.tink.shaded.protobuf.ByteString.Output.EMPTY_BYTE_ARRAY
                r3.buffer = r0
            L2e:
                int r0 = r3.flushedBuffersTotalBytes
                int r1 = r3.bufferPos
                int r0 = r0 + r1
                r3.flushedBuffersTotalBytes = r0
                r0 = 0
                r3.bufferPos = r0
                return
        }

        public synchronized void reset() {
                r1 = this;
                monitor-enter(r1)
                java.util.ArrayList<com.google.crypto.tink.shaded.protobuf.ByteString> r0 = r1.flushedBuffers     // Catch: java.lang.Throwable -> Ld
                r0.clear()     // Catch: java.lang.Throwable -> Ld
                r0 = 0
                r1.flushedBuffersTotalBytes = r0     // Catch: java.lang.Throwable -> Ld
                r1.bufferPos = r0     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r1)
                return
            Ld:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
                throw r0
        }

        public synchronized int size() {
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.flushedBuffersTotalBytes     // Catch: java.lang.Throwable -> L8
                int r1 = r2.bufferPos     // Catch: java.lang.Throwable -> L8
                int r0 = r0 + r1
                monitor-exit(r2)
                return r0
            L8:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
                throw r0
        }

        public synchronized com.google.crypto.tink.shaded.protobuf.ByteString toByteString() {
                r1 = this;
                monitor-enter(r1)
                r1.flushLastBuffer()     // Catch: java.lang.Throwable -> Lc
                java.util.ArrayList<com.google.crypto.tink.shaded.protobuf.ByteString> r0 = r1.flushedBuffers     // Catch: java.lang.Throwable -> Lc
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r0)     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r1)
                return r0
            Lc:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                throw r0
        }

        public java.lang.String toString() {
                r2 = this;
                int r0 = java.lang.System.identityHashCode(r2)
                java.lang.String r0 = java.lang.Integer.toHexString(r0)
                int r1 = r2.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                java.lang.String r1 = "<ByteString.Output@%s size=%d>"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // java.io.OutputStream
        public synchronized void write(int r4) {
                r3 = this;
                monitor-enter(r3)
                int r0 = r3.bufferPos     // Catch: java.lang.Throwable -> L19
                byte[] r1 = r3.buffer     // Catch: java.lang.Throwable -> L19
                int r1 = r1.length     // Catch: java.lang.Throwable -> L19
                if (r0 != r1) goto Lc
                r0 = 1
                r3.flushFullBuffer(r0)     // Catch: java.lang.Throwable -> L19
            Lc:
                byte[] r0 = r3.buffer     // Catch: java.lang.Throwable -> L19
                int r1 = r3.bufferPos     // Catch: java.lang.Throwable -> L19
                int r2 = r1 + 1
                r3.bufferPos = r2     // Catch: java.lang.Throwable -> L19
                byte r2 = (byte) r4     // Catch: java.lang.Throwable -> L19
                r0[r1] = r2     // Catch: java.lang.Throwable -> L19
                monitor-exit(r3)
                return
            L19:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
                throw r4
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] r4, int r5, int r6) {
                r3 = this;
                monitor-enter(r3)
                byte[] r0 = r3.buffer     // Catch: java.lang.Throwable -> L32
                int r0 = r0.length     // Catch: java.lang.Throwable -> L32
                int r1 = r3.bufferPos     // Catch: java.lang.Throwable -> L32
                int r0 = r0 - r1
                if (r6 > r0) goto L16
                byte[] r0 = r3.buffer     // Catch: java.lang.Throwable -> L32
                int r1 = r3.bufferPos     // Catch: java.lang.Throwable -> L32
                java.lang.System.arraycopy(r4, r5, r0, r1, r6)     // Catch: java.lang.Throwable -> L32
                int r0 = r3.bufferPos     // Catch: java.lang.Throwable -> L32
                int r0 = r0 + r6
                r3.bufferPos = r0     // Catch: java.lang.Throwable -> L32
                goto L30
            L16:
                byte[] r0 = r3.buffer     // Catch: java.lang.Throwable -> L32
                int r0 = r0.length     // Catch: java.lang.Throwable -> L32
                int r1 = r3.bufferPos     // Catch: java.lang.Throwable -> L32
                int r0 = r0 - r1
                byte[] r1 = r3.buffer     // Catch: java.lang.Throwable -> L32
                int r2 = r3.bufferPos     // Catch: java.lang.Throwable -> L32
                java.lang.System.arraycopy(r4, r5, r1, r2, r0)     // Catch: java.lang.Throwable -> L32
                int r5 = r5 + r0
                int r6 = r6 - r0
                r3.flushFullBuffer(r6)     // Catch: java.lang.Throwable -> L32
                byte[] r1 = r3.buffer     // Catch: java.lang.Throwable -> L32
                r2 = 0
                java.lang.System.arraycopy(r4, r5, r1, r2, r6)     // Catch: java.lang.Throwable -> L32
                r3.bufferPos = r6     // Catch: java.lang.Throwable -> L32
            L30:
                monitor-exit(r3)
                return
            L32:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
                throw r4
        }

        public void writeTo(java.io.OutputStream r7) throws java.io.IOException {
                r6 = this;
                monitor-enter(r6)
                java.util.ArrayList<com.google.crypto.tink.shaded.protobuf.ByteString> r0 = r6.flushedBuffers     // Catch: java.lang.Throwable -> L2a
                java.util.ArrayList<com.google.crypto.tink.shaded.protobuf.ByteString> r1 = r6.flushedBuffers     // Catch: java.lang.Throwable -> L2a
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L2a
                com.google.crypto.tink.shaded.protobuf.ByteString[] r1 = new com.google.crypto.tink.shaded.protobuf.ByteString[r1]     // Catch: java.lang.Throwable -> L2a
                java.lang.Object[] r0 = r0.toArray(r1)     // Catch: java.lang.Throwable -> L2a
                com.google.crypto.tink.shaded.protobuf.ByteString[] r0 = (com.google.crypto.tink.shaded.protobuf.ByteString[]) r0     // Catch: java.lang.Throwable -> L2a
                byte[] r1 = r6.buffer     // Catch: java.lang.Throwable -> L2a
                int r2 = r6.bufferPos     // Catch: java.lang.Throwable -> L2a
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L2a
                int r3 = r0.length
                r4 = 0
            L18:
                if (r4 >= r3) goto L22
                r5 = r0[r4]
                r5.writeTo(r7)
                int r4 = r4 + 1
                goto L18
            L22:
                byte[] r3 = r6.copyArray(r1, r2)
                r7.write(r3)
                return
            L2a:
                r0 = move-exception
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L2a
                throw r0
        }
    }

    private static final class SystemByteArrayCopier implements com.google.crypto.tink.shaded.protobuf.ByteString.ByteArrayCopier {
        private SystemByteArrayCopier() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ SystemByteArrayCopier(com.google.crypto.tink.shaded.protobuf.ByteString.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] r3, int r4, int r5) {
                r2 = this;
                byte[] r0 = new byte[r5]
                r1 = 0
                java.lang.System.arraycopy(r3, r4, r0, r1, r5)
                return r0
        }
    }

    static {
            com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString r0 = new com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString
            byte[] r1 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_ARRAY
            r0.<init>(r1)
            com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY = r0
            boolean r0 = com.google.crypto.tink.shaded.protobuf.Android.isOnAndroidDevice()
            r1 = 0
            if (r0 == 0) goto L16
            com.google.crypto.tink.shaded.protobuf.ByteString$SystemByteArrayCopier r0 = new com.google.crypto.tink.shaded.protobuf.ByteString$SystemByteArrayCopier
            r0.<init>(r1)
            goto L1b
        L16:
            com.google.crypto.tink.shaded.protobuf.ByteString$ArraysByteArrayCopier r0 = new com.google.crypto.tink.shaded.protobuf.ByteString$ArraysByteArrayCopier
            r0.<init>(r1)
        L1b:
            com.google.crypto.tink.shaded.protobuf.ByteString.byteArrayCopier = r0
            com.google.crypto.tink.shaded.protobuf.ByteString$2 r0 = new com.google.crypto.tink.shaded.protobuf.ByteString$2
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.ByteString.UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = r0
            return
    }

    ByteString() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.hash = r0
            return
    }

    static /* synthetic */ int access$200(byte r1) {
            int r0 = toInt(r1)
            return r0
    }

    private static com.google.crypto.tink.shaded.protobuf.ByteString balancedConcat(java.util.Iterator<com.google.crypto.tink.shaded.protobuf.ByteString> r4, int r5) {
            r0 = 1
            if (r5 < r0) goto L1e
            if (r5 != r0) goto Lc
            java.lang.Object r0 = r4.next()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString) r0
            goto L1d
        Lc:
            int r0 = r5 >>> 1
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = balancedConcat(r4, r0)
            int r2 = r5 - r0
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = balancedConcat(r4, r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r1.concat(r2)
            r0 = r3
        L1d:
            return r0
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "length (%s) must be >= 1"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    static void checkIndex(int r3, int r4) {
            int r0 = r3 + 1
            int r0 = r4 - r0
            r0 = r0 | r3
            if (r0 >= 0) goto L45
            if (r3 >= 0) goto L22
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index < 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L22:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index > length: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = ", "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L45:
            return
    }

    static int checkRange(int r4, int r5, int r6) {
            int r0 = r5 - r4
            r1 = r4 | r5
            r1 = r1 | r0
            int r2 = r6 - r5
            r1 = r1 | r2
            if (r1 >= 0) goto L73
            if (r4 < 0) goto L54
            if (r5 >= r4) goto L31
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Beginning index larger than ending index: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = ", "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L31:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "End index: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = " >= "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L54:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Beginning index: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " < 0"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L73:
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString copyFrom(java.lang.Iterable<com.google.crypto.tink.shaded.protobuf.ByteString> r3) {
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 != 0) goto L17
            r0 = 0
            java.util.Iterator r1 = r3.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L15
            r1.next()
            int r0 = r0 + 1
            goto L9
        L15:
            goto L1e
        L17:
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
        L1e:
            if (r0 != 0) goto L23
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            return r1
        L23:
            java.util.Iterator r1 = r3.iterator()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = balancedConcat(r1, r0)
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString copyFrom(java.lang.String r2, java.lang.String r3) throws java.io.UnsupportedEncodingException {
            com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString r0 = new com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString
            byte[] r1 = r2.getBytes(r3)
            r0.<init>(r1)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString copyFrom(java.lang.String r2, java.nio.charset.Charset r3) {
            com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString r0 = new com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString
            byte[] r1 = r2.getBytes(r3)
            r0.<init>(r1)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString copyFrom(java.nio.ByteBuffer r1) {
            int r0 = r1.remaining()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = copyFrom(r1, r0)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString copyFrom(java.nio.ByteBuffer r2, int r3) {
            r0 = 0
            int r1 = r2.remaining()
            checkRange(r0, r3, r1)
            byte[] r0 = new byte[r3]
            r2.get(r0)
            com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString r1 = new com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString
            r1.<init>(r0)
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString copyFrom(byte[] r2) {
            r0 = 0
            int r1 = r2.length
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = copyFrom(r2, r0, r1)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString copyFrom(byte[] r2, int r3, int r4) {
            int r0 = r3 + r4
            int r1 = r2.length
            checkRange(r3, r0, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString r0 = new com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString
            com.google.crypto.tink.shaded.protobuf.ByteString$ByteArrayCopier r1 = com.google.crypto.tink.shaded.protobuf.ByteString.byteArrayCopier
            byte[] r1 = r1.copyFrom(r2, r3, r4)
            r0.<init>(r1)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString copyFromUtf8(java.lang.String r2) {
            com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString r0 = new com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString
            java.nio.charset.Charset r1 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
            byte[] r1 = r2.getBytes(r1)
            r0.<init>(r1)
            return r0
    }

    public static final com.google.crypto.tink.shaded.protobuf.ByteString empty() {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            return r0
    }

    private static int extractHexDigit(java.lang.String r4, int r5) {
            char r0 = r4.charAt(r5)
            int r0 = hexDigit(r0)
            r1 = -1
            if (r0 == r1) goto Lc
            return r0
        Lc:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid hexString "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " must only contain [0-9a-fA-F] but contained "
            java.lang.StringBuilder r2 = r2.append(r3)
            char r3 = r4.charAt(r5)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " at index "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString fromHex(java.lang.String r5) {
            int r0 = r5.length()
            int r0 = r0 % 2
            if (r0 != 0) goto L31
            int r0 = r5.length()
            int r0 = r0 / 2
            byte[] r0 = new byte[r0]
            r1 = 0
        L11:
            int r2 = r0.length
            if (r1 >= r2) goto L2b
            int r2 = r1 * 2
            int r2 = extractHexDigit(r5, r2)
            int r3 = r1 * 2
            int r3 = r3 + 1
            int r3 = extractHexDigit(r5, r3)
            int r4 = r2 << 4
            r4 = r4 | r3
            byte r4 = (byte) r4
            r0[r1] = r4
            int r1 = r1 + 1
            goto L11
        L2b:
            com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString r1 = new com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString
            r1.<init>(r0)
            return r1
        L31:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid hexString "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = " of length "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r5.length()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " must be even."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static int hexDigit(char r1) {
            r0 = 48
            if (r1 < r0) goto Lb
            r0 = 57
            if (r1 > r0) goto Lb
            int r0 = r1 + (-48)
            return r0
        Lb:
            r0 = 65
            if (r1 < r0) goto L18
            r0 = 70
            if (r1 > r0) goto L18
            int r0 = r1 + (-65)
            int r0 = r0 + 10
            return r0
        L18:
            r0 = 97
            if (r1 < r0) goto L25
            r0 = 102(0x66, float:1.43E-43)
            if (r1 > r0) goto L25
            int r0 = r1 + (-97)
            int r0 = r0 + 10
            return r0
        L25:
            r0 = -1
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.ByteString.CodedBuilder newCodedBuilder(int r2) {
            com.google.crypto.tink.shaded.protobuf.ByteString$CodedBuilder r0 = new com.google.crypto.tink.shaded.protobuf.ByteString$CodedBuilder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString.Output newOutput() {
            com.google.crypto.tink.shaded.protobuf.ByteString$Output r0 = new com.google.crypto.tink.shaded.protobuf.ByteString$Output
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString.Output newOutput(int r1) {
            com.google.crypto.tink.shaded.protobuf.ByteString$Output r0 = new com.google.crypto.tink.shaded.protobuf.ByteString$Output
            r0.<init>(r1)
            return r0
    }

    private static com.google.crypto.tink.shaded.protobuf.ByteString readChunk(java.io.InputStream r4, int r5) throws java.io.IOException {
            byte[] r0 = new byte[r5]
            r1 = 0
        L3:
            if (r1 >= r5) goto L11
            int r2 = r5 - r1
            int r2 = r4.read(r0, r1, r2)
            r3 = -1
            if (r2 != r3) goto Lf
            goto L11
        Lf:
            int r1 = r1 + r2
            goto L3
        L11:
            if (r1 != 0) goto L15
            r2 = 0
            return r2
        L15:
            r2 = 0
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = copyFrom(r0, r2, r1)
            return r2
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString readFrom(java.io.InputStream r2) throws java.io.IOException {
            r0 = 256(0x100, float:3.59E-43)
            r1 = 8192(0x2000, float:1.148E-41)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = readFrom(r2, r0, r1)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString readFrom(java.io.InputStream r1, int r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = readFrom(r1, r2, r2)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString readFrom(java.io.InputStream r4, int r5, int r6) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r5
        L6:
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = readChunk(r4, r1)
            if (r2 != 0) goto L12
        Ld:
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = copyFrom(r0)
            return r2
        L12:
            r0.add(r2)
            int r3 = r1 * 2
            int r1 = java.lang.Math.min(r3, r6)
            goto L6
    }

    private static int toInt(byte r1) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            return r0
    }

    private java.lang.String truncateAndEscapeForDisplay() {
            r4 = this;
            r0 = 50
            int r1 = r4.size()
            r2 = 50
            if (r1 > r2) goto Lf
            java.lang.String r1 = com.google.crypto.tink.shaded.protobuf.TextFormatEscaper.escapeBytes(r4)
            goto L2d
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            r3 = 47
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r4.substring(r2, r3)
            java.lang.String r2 = com.google.crypto.tink.shaded.protobuf.TextFormatEscaper.escapeBytes(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "..."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        L2d:
            return r1
    }

    public static java.util.Comparator<com.google.crypto.tink.shaded.protobuf.ByteString> unsignedLexicographicalComparator() {
            java.util.Comparator<com.google.crypto.tink.shaded.protobuf.ByteString> r0 = com.google.crypto.tink.shaded.protobuf.ByteString.UNSIGNED_LEXICOGRAPHICAL_COMPARATOR
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.ByteString wrap(java.nio.ByteBuffer r4) {
            boolean r0 = r4.hasArray()
            if (r0 == 0) goto L1c
            int r0 = r4.arrayOffset()
            byte[] r1 = r4.array()
            int r2 = r4.position()
            int r2 = r2 + r0
            int r3 = r4.remaining()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = wrap(r1, r2, r3)
            return r1
        L1c:
            com.google.crypto.tink.shaded.protobuf.NioByteString r0 = new com.google.crypto.tink.shaded.protobuf.NioByteString
            r0.<init>(r4)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.ByteString wrap(byte[] r1) {
            com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString r0 = new com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString
            r0.<init>(r1)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.ByteString wrap(byte[] r1, int r2, int r3) {
            com.google.crypto.tink.shaded.protobuf.ByteString$BoundedByteString r0 = new com.google.crypto.tink.shaded.protobuf.ByteString$BoundedByteString
            r0.<init>(r1, r2, r3)
            return r0
    }

    public abstract java.nio.ByteBuffer asReadOnlyByteBuffer();

    public abstract java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int r1);

    public final com.google.crypto.tink.shaded.protobuf.ByteString concat(com.google.crypto.tink.shaded.protobuf.ByteString r4) {
            r3 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r3.size()
            int r0 = r0 - r1
            int r1 = r4.size()
            if (r0 < r1) goto L13
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.RopeByteString.concatenate(r3, r4)
            return r0
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ByteString would be too long: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r3.size()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "+"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r4.size()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public abstract void copyTo(java.nio.ByteBuffer r1);

    public void copyTo(byte[] r3, int r4) {
            r2 = this;
            r0 = 0
            int r1 = r2.size()
            r2.copyTo(r3, r0, r4, r1)
            return
    }

    @java.lang.Deprecated
    public final void copyTo(byte[] r3, int r4, int r5, int r6) {
            r2 = this;
            int r0 = r4 + r6
            int r1 = r2.size()
            checkRange(r4, r0, r1)
            int r0 = r5 + r6
            int r1 = r3.length
            checkRange(r5, r0, r1)
            if (r6 <= 0) goto L14
            r2.copyToInternal(r3, r4, r5, r6)
        L14:
            return
    }

    protected abstract void copyToInternal(byte[] r1, int r2, int r3, int r4);

    public final boolean endsWith(com.google.crypto.tink.shaded.protobuf.ByteString r3) {
            r2 = this;
            int r0 = r2.size()
            int r1 = r3.size()
            if (r0 < r1) goto L1f
            int r0 = r2.size()
            int r1 = r3.size()
            int r0 = r0 - r1
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.substring(r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }

    public abstract boolean equals(java.lang.Object r1);

    protected abstract int getTreeDepth();

    public final int hashCode() {
            r3 = this;
            int r0 = r3.hash
            if (r0 != 0) goto L12
            int r1 = r3.size()
            r2 = 0
            int r0 = r3.partialHash(r1, r2, r1)
            if (r0 != 0) goto L10
            r0 = 1
        L10:
            r3.hash = r0
        L12:
            return r0
    }

    abstract byte internalByteAt(int r1);

    protected abstract boolean isBalanced();

    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public abstract boolean isValidUtf8();

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.Byte> iterator() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString$1 r0 = new com.google.crypto.tink.shaded.protobuf.ByteString$1
            r0.<init>(r1)
            return r0
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator2() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString$ByteIterator r0 = r1.iterator()
            return r0
    }

    public abstract com.google.crypto.tink.shaded.protobuf.CodedInputStream newCodedInput();

    public abstract java.io.InputStream newInput();

    protected abstract int partialHash(int r1, int r2, int r3);

    protected abstract int partialIsValidUtf8(int r1, int r2, int r3);

    protected final int peekCachedHashCode() {
            r1 = this;
            int r0 = r1.hash
            return r0
    }

    public abstract int size();

    public final boolean startsWith(com.google.crypto.tink.shaded.protobuf.ByteString r4) {
            r3 = this;
            int r0 = r3.size()
            int r1 = r4.size()
            r2 = 0
            if (r0 < r1) goto L1a
            int r0 = r4.size()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.substring(r2, r0)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L1a
            r2 = 1
        L1a:
            return r2
    }

    public final com.google.crypto.tink.shaded.protobuf.ByteString substring(int r2) {
            r1 = this;
            int r0 = r1.size()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.substring(r2, r0)
            return r0
    }

    public abstract com.google.crypto.tink.shaded.protobuf.ByteString substring(int r1, int r2);

    public final byte[] toByteArray() {
            r3 = this;
            int r0 = r3.size()
            if (r0 != 0) goto L9
            byte[] r1 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_ARRAY
            return r1
        L9:
            byte[] r1 = new byte[r0]
            r2 = 0
            r3.copyToInternal(r1, r2, r2, r0)
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            int r1 = java.lang.System.identityHashCode(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            int r2 = r4.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = r4.truncateAndEscapeForDisplay()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "<ByteString@%s size=%d contents=\"%s\">"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }

    public final java.lang.String toString(java.lang.String r3) throws java.io.UnsupportedEncodingException {
            r2 = this;
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r3)     // Catch: java.nio.charset.UnsupportedCharsetException -> L9
            java.lang.String r0 = r2.toString(r0)     // Catch: java.nio.charset.UnsupportedCharsetException -> L9
            return r0
        L9:
            r0 = move-exception
            java.io.UnsupportedEncodingException r1 = new java.io.UnsupportedEncodingException
            r1.<init>(r3)
            r1.initCause(r0)
            throw r1
    }

    public final java.lang.String toString(java.nio.charset.Charset r2) {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            goto Ld
        L9:
            java.lang.String r0 = r1.toStringInternal(r2)
        Ld:
            return r0
    }

    protected abstract java.lang.String toStringInternal(java.nio.charset.Charset r1);

    public final java.lang.String toStringUtf8() {
            r1 = this;
            java.nio.charset.Charset r0 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
            java.lang.String r0 = r1.toString(r0)
            return r0
    }

    abstract void writeTo(com.google.crypto.tink.shaded.protobuf.ByteOutput r1) throws java.io.IOException;

    public abstract void writeTo(java.io.OutputStream r1) throws java.io.IOException;

    final void writeTo(java.io.OutputStream r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            int r0 = r4 + r5
            int r1 = r2.size()
            checkRange(r4, r0, r1)
            if (r5 <= 0) goto Le
            r2.writeToInternal(r3, r4, r5)
        Le:
            return
    }

    abstract void writeToInternal(java.io.OutputStream r1, int r2, int r3) throws java.io.IOException;

    abstract void writeToReverse(com.google.crypto.tink.shaded.protobuf.ByteOutput r1) throws java.io.IOException;
}
