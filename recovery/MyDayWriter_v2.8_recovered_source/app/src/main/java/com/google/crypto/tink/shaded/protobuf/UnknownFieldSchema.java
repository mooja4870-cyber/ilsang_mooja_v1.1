package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
abstract class UnknownFieldSchema<T, B> {
    UnknownFieldSchema() {
            r0 = this;
            r0.<init>()
            return
    }

    abstract void addFixed32(B r1, int r2, int r3);

    abstract void addFixed64(B r1, int r2, long r3);

    abstract void addGroup(B r1, int r2, T r3);

    abstract void addLengthDelimited(B r1, int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3);

    abstract void addVarint(B r1, int r2, long r3);

    abstract B getBuilderFromMessage(java.lang.Object r1);

    abstract T getFromMessage(java.lang.Object r1);

    abstract int getSerializedSize(T r1);

    abstract int getSerializedSizeAsMessageSet(T r1);

    abstract void makeImmutable(java.lang.Object r1);

    abstract T merge(T r1, T r2);

    final void mergeFrom(B r3, com.google.crypto.tink.shaded.protobuf.Reader r4) throws java.io.IOException {
            r2 = this;
        L1:
            int r0 = r4.getFieldNumber()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L11
            boolean r0 = r2.mergeOneFieldFrom(r3, r4)
            if (r0 != 0) goto L1
        L11:
            return
    }

    final boolean mergeOneFieldFrom(B r7, com.google.crypto.tink.shaded.protobuf.Reader r8) throws java.io.IOException {
            r6 = this;
            int r0 = r8.getTag()
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r0)
            int r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            r3 = 1
            switch(r2) {
                case 0: goto L4e;
                case 1: goto L46;
                case 2: goto L3e;
                case 3: goto L1f;
                case 4: goto L1d;
                case 5: goto L15;
                default: goto L10;
            }
        L10:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r2
        L15:
            int r2 = r8.readFixed32()
            r6.addFixed32(r7, r1, r2)
            return r3
        L1d:
            r2 = 0
            return r2
        L1f:
            java.lang.Object r2 = r6.newBuilder()
            r4 = 4
            int r4 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r1, r4)
            r6.mergeFrom(r2, r8)
            int r5 = r8.getTag()
            if (r4 != r5) goto L39
            java.lang.Object r5 = r6.toImmutable(r2)
            r6.addGroup(r7, r1, r5)
            return r3
        L39:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidEndTag()
            throw r3
        L3e:
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r8.readBytes()
            r6.addLengthDelimited(r7, r1, r2)
            return r3
        L46:
            long r4 = r8.readFixed64()
            r6.addFixed64(r7, r1, r4)
            return r3
        L4e:
            long r4 = r8.readInt64()
            r6.addVarint(r7, r1, r4)
            return r3
    }

    abstract B newBuilder();

    abstract void setBuilderToMessage(java.lang.Object r1, B r2);

    abstract void setToMessage(java.lang.Object r1, T r2);

    abstract boolean shouldDiscardUnknownFields(com.google.crypto.tink.shaded.protobuf.Reader r1);

    abstract T toImmutable(B r1);

    abstract void writeAsMessageSetTo(T r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException;

    abstract void writeTo(T r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException;
}
