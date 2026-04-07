package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class ProtobufArrayList<E> extends com.google.crypto.tink.shaded.protobuf.AbstractProtobufList<E> implements java.util.RandomAccess {
    private static final com.google.crypto.tink.shaded.protobuf.ProtobufArrayList<java.lang.Object> EMPTY_LIST = null;
    private E[] array;
    private int size;

    static {
            com.google.crypto.tink.shaded.protobuf.ProtobufArrayList r0 = new com.google.crypto.tink.shaded.protobuf.ProtobufArrayList
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2, r1)
            com.google.crypto.tink.shaded.protobuf.ProtobufArrayList.EMPTY_LIST = r0
            com.google.crypto.tink.shaded.protobuf.ProtobufArrayList<java.lang.Object> r0 = com.google.crypto.tink.shaded.protobuf.ProtobufArrayList.EMPTY_LIST
            r0.makeImmutable()
            return
    }

    ProtobufArrayList() {
            r2 = this;
            r0 = 10
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    private ProtobufArrayList(E[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.array = r1
            r0.size = r2
            return
    }

    private static <E> E[] createArray(int r1) {
            java.lang.Object[] r0 = new java.lang.Object[r1]
            return r0
    }

    public static <E> com.google.crypto.tink.shaded.protobuf.ProtobufArrayList<E> emptyList() {
            com.google.crypto.tink.shaded.protobuf.ProtobufArrayList<java.lang.Object> r0 = com.google.crypto.tink.shaded.protobuf.ProtobufArrayList.EMPTY_LIST
            return r0
    }

    private void ensureIndexInRange(int r3) {
            r2 = this;
            if (r3 < 0) goto L7
            int r0 = r2.size
            if (r3 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = r2.makeOutOfBoundsExceptionMessage(r3)
            r0.<init>(r1)
            throw r0
    }

    private java.lang.String makeOutOfBoundsExceptionMessage(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Index:"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = ", Size:"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.size
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int r6, E r7) {
            r5 = this;
            r5.ensureIsMutable()
            if (r6 < 0) goto L4c
            int r0 = r5.size
            if (r6 > r0) goto L4c
            int r0 = r5.size
            E[] r1 = r5.array
            int r1 = r1.length
            if (r0 >= r1) goto L1d
            E[] r0 = r5.array
            E[] r1 = r5.array
            int r2 = r6 + 1
            int r3 = r5.size
            int r3 = r3 - r6
            java.lang.System.arraycopy(r0, r6, r1, r2, r3)
            goto L3b
        L1d:
            int r0 = r5.size
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + 1
            java.lang.Object[] r1 = createArray(r0)
            E[] r2 = r5.array
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r6)
            E[] r2 = r5.array
            int r3 = r6 + 1
            int r4 = r5.size
            int r4 = r4 - r6
            java.lang.System.arraycopy(r2, r6, r1, r3, r4)
            r5.array = r1
        L3b:
            E[] r0 = r5.array
            r0[r6] = r7
            int r0 = r5.size
            int r0 = r0 + 1
            r5.size = r0
            int r0 = r5.modCount
            int r0 = r0 + 1
            r5.modCount = r0
            return
        L4c:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = r5.makeOutOfBoundsExceptionMessage(r6)
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r5) {
            r4 = this;
            r4.ensureIsMutable()
            int r0 = r4.size
            E[] r1 = r4.array
            int r1 = r1.length
            r2 = 1
            if (r0 != r1) goto L1a
            int r0 = r4.size
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + r2
            E[] r1 = r4.array
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.array = r1
        L1a:
            E[] r0 = r4.array
            int r1 = r4.size
            int r3 = r1 + 1
            r4.size = r3
            r0[r1] = r5
            int r0 = r4.modCount
            int r0 = r0 + r2
            r4.modCount = r0
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r2) {
            r1 = this;
            r1.ensureIndexInRange(r2)
            E[] r0 = r1.array
            r0 = r0[r2]
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList mutableCopyWithCapacity(int r1) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.ProtobufArrayList r1 = r0.mutableCopyWithCapacity(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public com.google.crypto.tink.shaded.protobuf.ProtobufArrayList<E> mutableCopyWithCapacity(int r4) {
            r3 = this;
            int r0 = r3.size
            if (r4 < r0) goto L12
            E[] r0 = r3.array
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            com.google.crypto.tink.shaded.protobuf.ProtobufArrayList r1 = new com.google.crypto.tink.shaded.protobuf.ProtobufArrayList
            int r2 = r3.size
            r1.<init>(r0, r2)
            return r1
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E remove(int r6) {
            r5 = this;
            r5.ensureIsMutable()
            r5.ensureIndexInRange(r6)
            E[] r0 = r5.array
            r0 = r0[r6]
            int r1 = r5.size
            int r1 = r1 + (-1)
            if (r6 >= r1) goto L1e
            E[] r1 = r5.array
            int r2 = r6 + 1
            E[] r3 = r5.array
            int r4 = r5.size
            int r4 = r4 - r6
            int r4 = r4 + (-1)
            java.lang.System.arraycopy(r1, r2, r3, r6, r4)
        L1e:
            int r1 = r5.size
            int r1 = r1 + (-1)
            r5.size = r1
            int r1 = r5.modCount
            int r1 = r1 + 1
            r5.modCount = r1
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E set(int r3, E r4) {
            r2 = this;
            r2.ensureIsMutable()
            r2.ensureIndexInRange(r3)
            E[] r0 = r2.array
            r0 = r0[r3]
            E[] r1 = r2.array
            r1[r3] = r4
            int r1 = r2.modCount
            int r1 = r1 + 1
            r2.modCount = r1
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
