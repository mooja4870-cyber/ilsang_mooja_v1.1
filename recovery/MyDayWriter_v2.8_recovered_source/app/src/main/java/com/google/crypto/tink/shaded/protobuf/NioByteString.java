package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class NioByteString extends com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString {
    private final java.nio.ByteBuffer buffer;


    NioByteString(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "buffer"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3, r0)
            java.nio.ByteBuffer r0 = r3.slice()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r0.order(r1)
            r2.buffer = r0
            return
    }

    static /* synthetic */ java.nio.ByteBuffer access$000(com.google.crypto.tink.shaded.protobuf.NioByteString r1) {
            java.nio.ByteBuffer r0 = r1.buffer
            return r0
    }

    private void readObject(java.io.ObjectInputStream r3) throws java.io.IOException {
            r2 = this;
            java.io.InvalidObjectException r0 = new java.io.InvalidObjectException
            java.lang.String r1 = "NioByteString instances are not to be serialized directly"
            r0.<init>(r1)
            throw r0
    }

    private java.nio.ByteBuffer slice(int r4, int r5) {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.buffer
            int r0 = r0.position()
            if (r4 < r0) goto L2f
            java.nio.ByteBuffer r0 = r3.buffer
            int r0 = r0.limit()
            if (r5 > r0) goto L2f
            if (r4 > r5) goto L2f
            java.nio.ByteBuffer r0 = r3.buffer
            java.nio.ByteBuffer r0 = r0.slice()
            java.nio.ByteBuffer r1 = r3.buffer
            int r1 = r1.position()
            int r1 = r4 - r1
            r0.position(r1)
            java.nio.ByteBuffer r1 = r3.buffer
            int r1 = r1.position()
            int r1 = r5 - r1
            r0.limit(r1)
            return r0
        L2f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "Invalid indices [%d, %d]"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    private java.lang.Object writeReplace() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            java.nio.ByteBuffer r0 = r0.slice()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public java.nio.ByteBuffer asReadOnlyByteBuffer() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.asReadOnlyByteBuffer()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public byte byteAt(int r4) {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L7 java.lang.ArrayIndexOutOfBoundsException -> L12
            byte r0 = r0.get(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L7 java.lang.ArrayIndexOutOfBoundsException -> L12
            return r0
        L7:
            r0 = move-exception
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2)
            throw r1
        L12:
            r0 = move-exception
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void copyTo(java.nio.ByteBuffer r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            java.nio.ByteBuffer r0 = r0.slice()
            r2.put(r0)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    protected void copyToInternal(byte[] r2, int r3, int r4, int r5) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            java.nio.ByteBuffer r0 = r0.slice()
            r0.position(r3)
            r0.get(r2, r4, r5)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = (com.google.crypto.tink.shaded.protobuf.ByteString) r1
            int r3 = r5.size()
            int r4 = r1.size()
            if (r3 == r4) goto L18
            return r2
        L18:
            int r2 = r5.size()
            if (r2 != 0) goto L1f
            return r0
        L1f:
            boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.NioByteString
            if (r0 == 0) goto L2f
            java.nio.ByteBuffer r0 = r5.buffer
            r2 = r6
            com.google.crypto.tink.shaded.protobuf.NioByteString r2 = (com.google.crypto.tink.shaded.protobuf.NioByteString) r2
            java.nio.ByteBuffer r2 = r2.buffer
            boolean r0 = r0.equals(r2)
            return r0
        L2f:
            boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.RopeByteString
            if (r0 == 0) goto L38
            boolean r0 = r6.equals(r5)
            return r0
        L38:
            java.nio.ByteBuffer r0 = r5.buffer
            java.nio.ByteBuffer r2 = r1.asReadOnlyByteBuffer()
            boolean r0 = r0.equals(r2)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString
    boolean equalsRange(com.google.crypto.tink.shaded.protobuf.ByteString r3, int r4, int r5) {
            r2 = this;
            r0 = 0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.substring(r0, r5)
            int r1 = r4 + r5
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r3.substring(r4, r1)
            boolean r0 = r0.equals(r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public byte internalByteAt(int r2) {
            r1 = this;
            byte r0 = r1.byteAt(r2)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public boolean isValidUtf8() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            boolean r0 = com.google.crypto.tink.shaded.protobuf.Utf8.isValidUtf8(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public com.google.crypto.tink.shaded.protobuf.CodedInputStream newCodedInput() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buffer
            r1 = 1
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r0, r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public java.io.InputStream newInput() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.NioByteString$1 r0 = new com.google.crypto.tink.shaded.protobuf.NioByteString$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    protected int partialHash(int r4, int r5, int r6) {
            r3 = this;
            r0 = r5
        L1:
            int r1 = r5 + r6
            if (r0 >= r1) goto L12
            int r1 = r4 * 31
            java.nio.ByteBuffer r2 = r3.buffer
            byte r2 = r2.get(r0)
            int r4 = r1 + r2
            int r0 = r0 + 1
            goto L1
        L12:
            return r4
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    protected int partialIsValidUtf8(int r3, int r4, int r5) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buffer
            int r1 = r4 + r5
            int r0 = com.google.crypto.tink.shaded.protobuf.Utf8.partialIsValidUtf8(r3, r0, r4, r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public int size() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            int r0 = r0.remaining()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public com.google.crypto.tink.shaded.protobuf.ByteString substring(int r4, int r5) {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.slice(r4, r5)     // Catch: java.lang.IndexOutOfBoundsException -> La java.lang.ArrayIndexOutOfBoundsException -> L15
            com.google.crypto.tink.shaded.protobuf.NioByteString r1 = new com.google.crypto.tink.shaded.protobuf.NioByteString     // Catch: java.lang.IndexOutOfBoundsException -> La java.lang.ArrayIndexOutOfBoundsException -> L15
            r1.<init>(r0)     // Catch: java.lang.IndexOutOfBoundsException -> La java.lang.ArrayIndexOutOfBoundsException -> L15
            return r1
        La:
            r0 = move-exception
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2)
            throw r1
        L15:
            r0 = move-exception
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    protected java.lang.String toStringInternal(java.nio.charset.Charset r5) {
            r4 = this;
            java.nio.ByteBuffer r0 = r4.buffer
            boolean r0 = r0.hasArray()
            if (r0 == 0) goto L22
            java.nio.ByteBuffer r0 = r4.buffer
            byte[] r0 = r0.array()
            java.nio.ByteBuffer r1 = r4.buffer
            int r1 = r1.arrayOffset()
            java.nio.ByteBuffer r2 = r4.buffer
            int r2 = r2.position()
            int r1 = r1 + r2
            java.nio.ByteBuffer r2 = r4.buffer
            int r2 = r2.remaining()
            goto L28
        L22:
            byte[] r0 = r4.toByteArray()
            r1 = 0
            int r2 = r0.length
        L28:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0, r1, r2, r5)
            return r3
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    void writeTo(com.google.crypto.tink.shaded.protobuf.ByteOutput r2) throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            java.nio.ByteBuffer r0 = r0.slice()
            r2.writeLazy(r0)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void writeTo(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            byte[] r0 = r1.toByteArray()
            r2.write(r0)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    void writeToInternal(java.io.OutputStream r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buffer
            boolean r0 = r0.hasArray()
            if (r0 == 0) goto L20
            java.nio.ByteBuffer r0 = r2.buffer
            int r0 = r0.arrayOffset()
            java.nio.ByteBuffer r1 = r2.buffer
            int r1 = r1.position()
            int r0 = r0 + r1
            int r0 = r0 + r4
            java.nio.ByteBuffer r1 = r2.buffer
            byte[] r1 = r1.array()
            r3.write(r1, r0, r5)
            return
        L20:
            int r0 = r4 + r5
            java.nio.ByteBuffer r0 = r2.slice(r4, r0)
            com.google.crypto.tink.shaded.protobuf.ByteBufferWriter.write(r0, r3)
            return
    }
}
