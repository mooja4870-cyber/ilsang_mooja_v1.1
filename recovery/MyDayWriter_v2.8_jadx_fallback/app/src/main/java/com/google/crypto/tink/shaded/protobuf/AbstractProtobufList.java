package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class AbstractProtobufList<E> extends java.util.AbstractList<E> implements com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<E> {
    protected static final int DEFAULT_CAPACITY = 10;
    private boolean isMutable;

    AbstractProtobufList() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.isMutable = r0
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int r1, E r2) {
            r0 = this;
            r0.ensureIsMutable()
            super.add(r1, r2)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r2) {
            r1 = this;
            r1.ensureIsMutable()
            boolean r0 = super.add(r2)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r2, java.util.Collection<? extends E> r3) {
            r1 = this;
            r1.ensureIsMutable()
            boolean r0 = super.addAll(r2, r3)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends E> r2) {
            r1 = this;
            r1.ensureIsMutable()
            boolean r0 = super.addAll(r2)
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r0 = this;
            r0.ensureIsMutable()
            super.clear()
            return
    }

    protected void ensureIsMutable() {
            r1 = this;
            boolean r0 = r1.isMutable
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof java.util.List
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            boolean r1 = r8 instanceof java.util.RandomAccess
            if (r1 != 0) goto L13
            boolean r0 = super.equals(r8)
            return r0
        L13:
            r1 = r8
            java.util.List r1 = (java.util.List) r1
            int r3 = r7.size()
            int r4 = r1.size()
            if (r3 == r4) goto L21
            return r2
        L21:
            r4 = 0
        L22:
            if (r4 >= r3) goto L36
            java.lang.Object r5 = r7.get(r4)
            java.lang.Object r6 = r1.get(r4)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L33
            return r2
        L33:
            int r4 = r4 + 1
            goto L22
        L36:
            return r0
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
            r5 = this;
            int r0 = r5.size()
            r1 = 1
            r2 = 0
        L6:
            if (r2 >= r0) goto L17
            int r3 = r1 * 31
            java.lang.Object r4 = r5.get(r2)
            int r4 = r4.hashCode()
            int r1 = r3 + r4
            int r2 = r2 + 1
            goto L6
        L17:
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
    public boolean isModifiable() {
            r1 = this;
            boolean r0 = r1.isMutable
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
    public final void makeImmutable() {
            r1 = this;
            r0 = 0
            r1.isMutable = r0
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int r2) {
            r1 = this;
            r1.ensureIsMutable()
            java.lang.Object r0 = super.remove(r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object r3) {
            r2 = this;
            r2.ensureIsMutable()
            int r0 = r2.indexOf(r3)
            r1 = -1
            if (r0 != r1) goto Lc
            r1 = 0
            return r1
        Lc:
            r2.remove(r0)
            r1 = 1
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            r1.ensureIsMutable()
            boolean r0 = super.removeAll(r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection<?> r2) {
            r1 = this;
            r1.ensureIsMutable()
            boolean r0 = super.retainAll(r2)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int r2, E r3) {
            r1 = this;
            r1.ensureIsMutable()
            java.lang.Object r0 = super.set(r2, r3)
            return r0
    }
}
