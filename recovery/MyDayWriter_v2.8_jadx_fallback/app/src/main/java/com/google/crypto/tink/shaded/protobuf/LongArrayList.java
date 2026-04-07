package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class LongArrayList extends com.google.crypto.tink.shaded.protobuf.AbstractProtobufList<java.lang.Long> implements com.google.crypto.tink.shaded.protobuf.Internal.LongList, java.util.RandomAccess, com.google.crypto.tink.shaded.protobuf.PrimitiveNonBoxingCollection {
    private static final com.google.crypto.tink.shaded.protobuf.LongArrayList EMPTY_LIST = null;
    private long[] array;
    private int size;

    static {
            com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = new com.google.crypto.tink.shaded.protobuf.LongArrayList
            r1 = 0
            long[] r2 = new long[r1]
            r0.<init>(r2, r1)
            com.google.crypto.tink.shaded.protobuf.LongArrayList.EMPTY_LIST = r0
            com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = com.google.crypto.tink.shaded.protobuf.LongArrayList.EMPTY_LIST
            r0.makeImmutable()
            return
    }

    LongArrayList() {
            r2 = this;
            r0 = 10
            long[] r0 = new long[r0]
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    private LongArrayList(long[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.array = r1
            r0.size = r2
            return
    }

    private void addLong(int r6, long r7) {
            r5 = this;
            r5.ensureIsMutable()
            if (r6 < 0) goto L4a
            int r0 = r5.size
            if (r6 > r0) goto L4a
            int r0 = r5.size
            long[] r1 = r5.array
            int r1 = r1.length
            if (r0 >= r1) goto L1d
            long[] r0 = r5.array
            long[] r1 = r5.array
            int r2 = r6 + 1
            int r3 = r5.size
            int r3 = r3 - r6
            java.lang.System.arraycopy(r0, r6, r1, r2, r3)
            goto L39
        L1d:
            int r0 = r5.size
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + 1
            long[] r1 = new long[r0]
            long[] r2 = r5.array
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r6)
            long[] r2 = r5.array
            int r3 = r6 + 1
            int r4 = r5.size
            int r4 = r4 - r6
            java.lang.System.arraycopy(r2, r6, r1, r3, r4)
            r5.array = r1
        L39:
            long[] r0 = r5.array
            r0[r6] = r7
            int r0 = r5.size
            int r0 = r0 + 1
            r5.size = r0
            int r0 = r5.modCount
            int r0 = r0 + 1
            r5.modCount = r0
            return
        L4a:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = r5.makeOutOfBoundsExceptionMessage(r6)
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.shaded.protobuf.LongArrayList emptyList() {
            com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = com.google.crypto.tink.shaded.protobuf.LongArrayList.EMPTY_LIST
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

    public void add(int r3, java.lang.Long r4) {
            r2 = this;
            long r0 = r4.longValue()
            r2.addLong(r3, r0)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Long r2 = (java.lang.Long) r2
            r0.add(r1, r2)
            return
    }

    public boolean add(java.lang.Long r3) {
            r2 = this;
            long r0 = r3.longValue()
            r2.addLong(r0)
            r0 = 1
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.Long r1 = (java.lang.Long) r1
            boolean r1 = r0.add(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.Long> r9) {
            r8 = this;
            r8.ensureIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r9)
            boolean r0 = r9 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r0 != 0) goto Lf
            boolean r0 = super.addAll(r9)
            return r0
        Lf:
            r0 = r9
            com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r0
            int r1 = r0.size
            r2 = 0
            if (r1 != 0) goto L18
            return r2
        L18:
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r8.size
            int r1 = r1 - r3
            int r3 = r0.size
            if (r1 < r3) goto L48
            int r3 = r8.size
            int r4 = r0.size
            int r3 = r3 + r4
            long[] r4 = r8.array
            int r4 = r4.length
            if (r3 <= r4) goto L34
            long[] r4 = r8.array
            long[] r4 = java.util.Arrays.copyOf(r4, r3)
            r8.array = r4
        L34:
            long[] r4 = r0.array
            long[] r5 = r8.array
            int r6 = r8.size
            int r7 = r0.size
            java.lang.System.arraycopy(r4, r2, r5, r6, r7)
            r8.size = r3
            int r2 = r8.modCount
            r4 = 1
            int r2 = r2 + r4
            r8.modCount = r2
            return r4
        L48:
            java.lang.OutOfMemoryError r2 = new java.lang.OutOfMemoryError
            r2.<init>()
            throw r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.LongList
    public void addLong(long r6) {
            r5 = this;
            r5.ensureIsMutable()
            int r0 = r5.size
            long[] r1 = r5.array
            int r1 = r1.length
            if (r0 != r1) goto L1e
            int r0 = r5.size
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + 1
            long[] r1 = new long[r0]
            long[] r2 = r5.array
            int r3 = r5.size
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r1, r4, r3)
            r5.array = r1
        L1e:
            long[] r0 = r5.array
            int r1 = r5.size
            int r2 = r1 + 1
            r5.size = r2
            r0[r1] = r6
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.indexOf(r3)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object r11) {
            r10 = this;
            r0 = 1
            if (r10 != r11) goto L4
            return r0
        L4:
            boolean r1 = r11 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r1 != 0) goto Ld
            boolean r0 = super.equals(r11)
            return r0
        Ld:
            r1 = r11
            com.google.crypto.tink.shaded.protobuf.LongArrayList r1 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r1
            int r2 = r10.size
            int r3 = r1.size
            r4 = 0
            if (r2 == r3) goto L18
            return r4
        L18:
            long[] r2 = r1.array
            r3 = 0
        L1b:
            int r5 = r10.size
            if (r3 >= r5) goto L2d
            long[] r5 = r10.array
            r6 = r5[r3]
            r8 = r2[r3]
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 == 0) goto L2a
            return r4
        L2a:
            int r3 = r3 + 1
            goto L1b
        L2d:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Long get(int r3) {
            r2 = this;
            long r0 = r2.getLong(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.Long r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.LongList
    public long getLong(int r4) {
            r3 = this;
            r3.ensureIndexInRange(r4)
            long[] r0 = r3.array
            r1 = r0[r4]
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
            r6 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r6.size
            if (r1 >= r2) goto L15
            int r2 = r0 * 31
            long[] r3 = r6.array
            r4 = r3[r1]
            int r3 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r4)
            int r0 = r2 + r3
            int r1 = r1 + 1
            goto L2
        L15:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object r9) {
            r8 = this;
            boolean r0 = r9 instanceof java.lang.Long
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r9
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            int r0 = r8.size()
            r4 = 0
        L12:
            if (r4 >= r0) goto L20
            long[] r5 = r8.array
            r6 = r5[r4]
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 != 0) goto L1d
            return r4
        L1d:
            int r4 = r4 + 1
            goto L12
        L20:
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Long> mutableCopyWithCapacity(int r4) {
            r3 = this;
            int r0 = r3.size
            if (r4 < r0) goto L12
            com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = new com.google.crypto.tink.shaded.protobuf.LongArrayList
            long[] r1 = r3.array
            long[] r1 = java.util.Arrays.copyOf(r1, r4)
            int r2 = r3.size
            r0.<init>(r1, r2)
            return r0
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Long> mutableCopyWithCapacity2(int r1) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$LongList r1 = r0.mutableCopyWithCapacity(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.Long remove(int r7) {
            r6 = this;
            r6.ensureIsMutable()
            r6.ensureIndexInRange(r7)
            long[] r0 = r6.array
            r1 = r0[r7]
            int r0 = r6.size
            int r0 = r0 + (-1)
            if (r7 >= r0) goto L1e
            long[] r0 = r6.array
            int r3 = r7 + 1
            long[] r4 = r6.array
            int r5 = r6.size
            int r5 = r5 - r7
            int r5 = r5 + (-1)
            java.lang.System.arraycopy(r0, r3, r4, r7, r5)
        L1e:
            int r0 = r6.size
            int r0 = r0 + (-1)
            r6.size = r0
            int r0 = r6.modCount
            int r0 = r0 + 1
            r6.modCount = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.Long r1 = r0.remove(r1)
            return r1
    }

    @Override // java.util.AbstractList
    protected void removeRange(int r4, int r5) {
            r3 = this;
            r3.ensureIsMutable()
            if (r5 < r4) goto L1d
            long[] r0 = r3.array
            long[] r1 = r3.array
            int r2 = r3.size
            int r2 = r2 - r5
            java.lang.System.arraycopy(r0, r5, r1, r4, r2)
            int r0 = r3.size
            int r1 = r5 - r4
            int r0 = r0 - r1
            r3.size = r0
            int r0 = r3.modCount
            int r0 = r0 + 1
            r3.modCount = r0
            return
        L1d:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "toIndex < fromIndex"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.Long set(int r3, java.lang.Long r4) {
            r2 = this;
            long r0 = r4.longValue()
            long r0 = r2.setLong(r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.Long r1 = r0.set(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.LongList
    public long setLong(int r4, long r5) {
            r3 = this;
            r3.ensureIsMutable()
            r3.ensureIndexInRange(r4)
            long[] r0 = r3.array
            r1 = r0[r4]
            long[] r0 = r3.array
            r0[r4] = r5
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
