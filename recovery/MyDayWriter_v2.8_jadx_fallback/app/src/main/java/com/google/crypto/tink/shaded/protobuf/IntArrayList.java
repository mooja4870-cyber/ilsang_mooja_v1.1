package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class IntArrayList extends com.google.crypto.tink.shaded.protobuf.AbstractProtobufList<java.lang.Integer> implements com.google.crypto.tink.shaded.protobuf.Internal.IntList, java.util.RandomAccess, com.google.crypto.tink.shaded.protobuf.PrimitiveNonBoxingCollection {
    private static final com.google.crypto.tink.shaded.protobuf.IntArrayList EMPTY_LIST = null;
    private int[] array;
    private int size;

    static {
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = new com.google.crypto.tink.shaded.protobuf.IntArrayList
            r1 = 0
            int[] r2 = new int[r1]
            r0.<init>(r2, r1)
            com.google.crypto.tink.shaded.protobuf.IntArrayList.EMPTY_LIST = r0
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = com.google.crypto.tink.shaded.protobuf.IntArrayList.EMPTY_LIST
            r0.makeImmutable()
            return
    }

    IntArrayList() {
            r2 = this;
            r0 = 10
            int[] r0 = new int[r0]
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    private IntArrayList(int[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.array = r1
            r0.size = r2
            return
    }

    private void addInt(int r6, int r7) {
            r5 = this;
            r5.ensureIsMutable()
            if (r6 < 0) goto L4a
            int r0 = r5.size
            if (r6 > r0) goto L4a
            int r0 = r5.size
            int[] r1 = r5.array
            int r1 = r1.length
            if (r0 >= r1) goto L1d
            int[] r0 = r5.array
            int[] r1 = r5.array
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
            int[] r1 = new int[r0]
            int[] r2 = r5.array
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r6)
            int[] r2 = r5.array
            int r3 = r6 + 1
            int r4 = r5.size
            int r4 = r4 - r6
            java.lang.System.arraycopy(r2, r6, r1, r3, r4)
            r5.array = r1
        L39:
            int[] r0 = r5.array
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

    public static com.google.crypto.tink.shaded.protobuf.IntArrayList emptyList() {
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = com.google.crypto.tink.shaded.protobuf.IntArrayList.EMPTY_LIST
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

    public void add(int r2, java.lang.Integer r3) {
            r1 = this;
            int r0 = r3.intValue()
            r1.addInt(r2, r0)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0.add(r1, r2)
            return
    }

    public boolean add(java.lang.Integer r2) {
            r1 = this;
            int r0 = r2.intValue()
            r1.addInt(r0)
            r0 = 1
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.Integer r1 = (java.lang.Integer) r1
            boolean r1 = r0.add(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.Integer> r9) {
            r8 = this;
            r8.ensureIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r9)
            boolean r0 = r9 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r0 != 0) goto Lf
            boolean r0 = super.addAll(r9)
            return r0
        Lf:
            r0 = r9
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r0
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
            int[] r4 = r8.array
            int r4 = r4.length
            if (r3 <= r4) goto L34
            int[] r4 = r8.array
            int[] r4 = java.util.Arrays.copyOf(r4, r3)
            r8.array = r4
        L34:
            int[] r4 = r0.array
            int[] r5 = r8.array
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

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.IntList
    public void addInt(int r6) {
            r5 = this;
            r5.ensureIsMutable()
            int r0 = r5.size
            int[] r1 = r5.array
            int r1 = r1.length
            if (r0 != r1) goto L1e
            int r0 = r5.size
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + 1
            int[] r1 = new int[r0]
            int[] r2 = r5.array
            int r3 = r5.size
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r1, r4, r3)
            r5.array = r1
        L1e:
            int[] r0 = r5.array
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
    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r1 != 0) goto Ld
            boolean r0 = super.equals(r8)
            return r0
        Ld:
            r1 = r8
            com.google.crypto.tink.shaded.protobuf.IntArrayList r1 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r1
            int r2 = r7.size
            int r3 = r1.size
            r4 = 0
            if (r2 == r3) goto L18
            return r4
        L18:
            int[] r2 = r1.array
            r3 = 0
        L1b:
            int r5 = r7.size
            if (r3 >= r5) goto L2b
            int[] r5 = r7.array
            r5 = r5[r3]
            r6 = r2[r3]
            if (r5 == r6) goto L28
            return r4
        L28:
            int r3 = r3 + 1
            goto L1b
        L2b:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Integer get(int r2) {
            r1 = this;
            int r0 = r1.getInt(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.Integer r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.IntList
    public int getInt(int r2) {
            r1 = this;
            r1.ensureIndexInRange(r2)
            int[] r0 = r1.array
            r0 = r0[r2]
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
            r4 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r4.size
            if (r1 >= r2) goto L11
            int r2 = r0 * 31
            int[] r3 = r4.array
            r3 = r3[r1]
            int r0 = r2 + r3
            int r1 = r1 + 1
            goto L2
        L11:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof java.lang.Integer
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r6
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r2 = r5.size()
            r3 = 0
        L12:
            if (r3 >= r2) goto L1e
            int[] r4 = r5.array
            r4 = r4[r3]
            if (r4 != r0) goto L1b
            return r3
        L1b:
            int r3 = r3 + 1
            goto L12
        L1e:
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Integer> mutableCopyWithCapacity(int r4) {
            r3 = this;
            int r0 = r3.size
            if (r4 < r0) goto L12
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = new com.google.crypto.tink.shaded.protobuf.IntArrayList
            int[] r1 = r3.array
            int[] r1 = java.util.Arrays.copyOf(r1, r4)
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
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Integer> mutableCopyWithCapacity2(int r1) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$IntList r1 = r0.mutableCopyWithCapacity(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.Integer remove(int r6) {
            r5 = this;
            r5.ensureIsMutable()
            r5.ensureIndexInRange(r6)
            int[] r0 = r5.array
            r0 = r0[r6]
            int r1 = r5.size
            int r1 = r1 + (-1)
            if (r6 >= r1) goto L1e
            int[] r1 = r5.array
            int r2 = r6 + 1
            int[] r3 = r5.array
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
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.Integer r1 = r0.remove(r1)
            return r1
    }

    @Override // java.util.AbstractList
    protected void removeRange(int r4, int r5) {
            r3 = this;
            r3.ensureIsMutable()
            if (r5 < r4) goto L1d
            int[] r0 = r3.array
            int[] r1 = r3.array
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

    public java.lang.Integer set(int r2, java.lang.Integer r3) {
            r1 = this;
            int r0 = r3.intValue()
            int r0 = r1.setInt(r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Integer r1 = r0.set(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.IntList
    public int setInt(int r3, int r4) {
            r2 = this;
            r2.ensureIsMutable()
            r2.ensureIndexInRange(r3)
            int[] r0 = r2.array
            r0 = r0[r3]
            int[] r1 = r2.array
            r1[r3] = r4
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
