package androidx.collection;

/* JADX INFO: compiled from: ArraySet.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010)\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001?B\u0019\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0019\b\u0016\u0012\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0011\b\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0015\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020$2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000J\u0016\u0010#\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\b\u0010&\u001a\u00020$H\u0016J\u0016\u0010'\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\"J\u0016\u0010(\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u000e\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\fJ\u0013\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010-\u001a\u00020\fH\u0016J\u0010\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0012J\b\u00100\u001a\u00020 H\u0016J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0096\u0002J\u0015\u00103\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\"J\u0016\u00104\u001a\u00020 2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000J\u0016\u00104\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u0013\u00105\u001a\u00028\u00002\u0006\u00106\u001a\u00020\f¢\u0006\u0002\u00107J\u0016\u00108\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u0013\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\t¢\u0006\u0002\u0010\u0014J%\u00109\u001a\b\u0012\u0004\u0012\u0002H:0\t\"\u0004\b\u0001\u0010:2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H:0\t¢\u0006\u0002\u0010;J\b\u0010<\u001a\u00020=H\u0016J\u0013\u0010>\u001a\u00028\u00002\u0006\u00106\u001a\u00020\f¢\u0006\u0002\u00107R\u001a\u0010\u000e\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\rR$\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\tX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010¨\u0006@"}, d2 = {"Landroidx/collection/ArraySet;", "E", "", "", "set", "(Landroidx/collection/ArraySet;)V", "", "(Ljava/util/Collection;)V", "array", "", "([Ljava/lang/Object;)V", "capacity", "", "(I)V", "_size", "get_size$collection", "()I", "set_size$collection", "", "getArray$collection", "()[Ljava/lang/Object;", "setArray$collection", "[Ljava/lang/Object;", "hashes", "", "getHashes$collection", "()[I", "setHashes$collection", "([I)V", "size", "getSize", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "", "elements", "clear", "contains", "containsAll", "ensureCapacity", "minimumCapacity", "equals", "other", "hashCode", "indexOf", "key", "isEmpty", "iterator", "", "remove", "removeAll", "removeAt", "index", "(I)Ljava/lang/Object;", "retainAll", "toArray", "T", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "valueAt", "ElementIterator", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ArraySet<E> implements java.util.Collection<E>, java.util.Set<E>, kotlin.jvm.internal.markers.KMutableCollection, kotlin.jvm.internal.markers.KMutableSet {
    private int _size;
    private java.lang.Object[] array;
    private int[] hashes;

    /* JADX INFO: compiled from: ArraySet.jvm.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\t"}, d2 = {"Landroidx/collection/ArraySet$ElementIterator;", "Landroidx/collection/IndexBasedArrayIterator;", "(Landroidx/collection/ArraySet;)V", "elementAt", "index", "", "(I)Ljava/lang/Object;", "removeAt", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class ElementIterator extends androidx.collection.IndexBasedArrayIterator<E> {
        final /* synthetic */ androidx.collection.ArraySet<E> this$0;

        public ElementIterator(androidx.collection.ArraySet r2) {
                r1 = this;
                r1.this$0 = r2
                int r0 = r2.get_size$collection()
                r1.<init>(r0)
                return
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected E elementAt(int r2) {
                r1 = this;
                androidx.collection.ArraySet<E> r0 = r1.this$0
                java.lang.Object r0 = r0.valueAt(r2)
                return r0
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int r2) {
                r1 = this;
                androidx.collection.ArraySet<E> r0 = r1.this$0
                r0.removeAt(r2)
                return
        }
    }

    public ArraySet() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public ArraySet(int r2) {
            r1 = this;
            r1.<init>()
            int[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS
            r1.hashes = r0
            java.lang.Object[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            r1.array = r0
            if (r2 <= 0) goto L11
            androidx.collection.ArraySetKt.allocArrays(r1, r2)
        L11:
            return
    }

    public /* synthetic */ ArraySet(int r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1)
            return
    }

    public ArraySet(androidx.collection.ArraySet<? extends E> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            if (r2 == 0) goto L9
            r1.addAll(r2)
        L9:
            return
    }

    public ArraySet(java.util.Collection<? extends E> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            if (r2 == 0) goto L9
            r1.addAll(r2)
        L9:
            return
    }

    public ArraySet(E[] r3) {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            if (r3 == 0) goto L18
            java.util.Iterator r0 = kotlin.jvm.internal.ArrayIteratorKt.iterator(r3)
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            r2.add(r1)
            goto La
        L18:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E r18) {
            r17 = this;
            r0 = r18
            r1 = r17
            r2 = 0
            int r3 = r1.get_size$collection()
            r4 = 0
            r5 = 0
            if (r0 != 0) goto L13
            r4 = 0
            int r5 = androidx.collection.ArraySetKt.indexOfNull(r1)
            goto L1b
        L13:
            int r4 = r0.hashCode()
            int r5 = androidx.collection.ArraySetKt.indexOf(r1, r0, r4)
        L1b:
            r6 = 0
            if (r5 < 0) goto L20
            goto Lb9
        L20:
            int r5 = ~r5
            int[] r7 = r1.getHashes$collection()
            int r7 = r7.length
            r8 = 1
            if (r3 < r7) goto L77
        L2a:
            r7 = 8
            if (r3 < r7) goto L32
            int r7 = r3 >> 1
            int r7 = r7 + r3
            goto L37
        L32:
            r9 = 4
            if (r3 < r9) goto L36
            goto L37
        L36:
            r7 = r9
        L37:
            int[] r9 = r1.getHashes$collection()
            java.lang.Object[] r10 = r1.getArray$collection()
            androidx.collection.ArraySetKt.allocArrays(r1, r7)
            int r11 = r1.get_size$collection()
            if (r3 != r11) goto L71
            int[] r11 = r1.getHashes$collection()
            int r11 = r11.length
            if (r11 != 0) goto L52
            r6 = r8
        L52:
            if (r6 != 0) goto L6f
            r6 = r10
            int[] r10 = r1.getHashes$collection()
            int r13 = r9.length
            r14 = 6
            r15 = 0
            r11 = 0
            r12 = 0
            kotlin.collections.ArraysKt.copyInto$default(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object[] r11 = r1.getArray$collection()
            int r14 = r6.length
            r15 = 6
            r16 = 0
            r13 = 0
            r10 = r6
            kotlin.collections.ArraysKt.copyInto$default(r10, r11, r12, r13, r14, r15, r16)
            goto L77
        L6f:
            r6 = r10
            goto L77
        L71:
            java.util.ConcurrentModificationException r8 = new java.util.ConcurrentModificationException
            r8.<init>()
            throw r8
        L77:
            if (r5 >= r3) goto L97
            int[] r6 = r1.getHashes$collection()
            int[] r7 = r1.getHashes$collection()
            int r9 = r5 + 1
            kotlin.collections.ArraysKt.copyInto(r6, r7, r9, r5, r3)
            java.lang.Object[] r6 = r1.getArray$collection()
            java.lang.Object[] r7 = r1.getArray$collection()
            int r9 = r5 + 1
            kotlin.collections.ArraysKt.copyInto(r6, r7, r9, r5, r3)
        L97:
            int r6 = r1.get_size$collection()
            if (r3 != r6) goto Lba
            int[] r6 = r1.getHashes$collection()
            int r6 = r6.length
            if (r5 >= r6) goto Lba
            int[] r6 = r1.getHashes$collection()
            r6[r5] = r4
            java.lang.Object[] r6 = r1.getArray$collection()
            r6[r5] = r0
            int r6 = r1.get_size$collection()
            int r6 = r6 + r8
            r1.set_size$collection(r6)
            r6 = r8
        Lb9:
            return r6
        Lba:
            java.util.ConcurrentModificationException r6 = new java.util.ConcurrentModificationException
            r6.<init>()
            throw r6
    }

    public final void addAll(androidx.collection.ArraySet<? extends E> r10) {
            r9 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r9
            r1 = 0
            int r6 = r10.get_size$collection()
            int r2 = r0.get_size$collection()
            int r2 = r2 + r6
            r0.ensureCapacity(r2)
            int r2 = r0.get_size$collection()
            if (r2 != 0) goto L45
            if (r6 <= 0) goto L52
            int[] r2 = r10.getHashes$collection()
            int[] r3 = r0.getHashes$collection()
            r7 = 6
            r8 = 0
            r4 = 0
            r5 = 0
            kotlin.collections.ArraysKt.copyInto$default(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object[] r2 = r10.getArray$collection()
            java.lang.Object[] r3 = r0.getArray$collection()
            kotlin.collections.ArraysKt.copyInto$default(r2, r3, r4, r5, r6, r7, r8)
            int r2 = r0.get_size$collection()
            if (r2 != 0) goto L3f
            r0.set_size$collection(r6)
            goto L52
        L3f:
            java.util.ConcurrentModificationException r2 = new java.util.ConcurrentModificationException
            r2.<init>()
            throw r2
        L45:
            r2 = 0
        L46:
            if (r2 >= r6) goto L52
            java.lang.Object r3 = r10.valueAt(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L46
        L52:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(java.util.Collection<? extends E> r7) {
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r6
            r1 = 0
            int r2 = r0.get_size$collection()
            int r3 = r7.size()
            int r2 = r2 + r3
            r0.ensureCapacity(r2)
            r2 = 0
            java.util.Iterator r3 = r7.iterator()
        L18:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L28
            java.lang.Object r4 = r3.next()
            boolean r5 = r0.add(r4)
            r2 = r2 | r5
            goto L18
        L28:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
            r3 = this;
            r0 = r3
            r1 = 0
            int r2 = r0.get_size$collection()
            if (r2 == 0) goto L16
            int[] r2 = androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS
            r0.setHashes$collection(r2)
            java.lang.Object[] r2 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            r0.setArray$collection(r2)
            r2 = 0
            r0.set_size$collection(r2)
        L16:
            int r2 = r0.get_size$collection()
            if (r2 != 0) goto L1e
        L1d:
            return
        L1e:
            java.util.ConcurrentModificationException r2 = new java.util.ConcurrentModificationException
            r2.<init>()
            throw r2
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = 0
            int r2 = r0.indexOf(r4)
            if (r2 < 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> r6) {
            r5 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            r1 = 0
            java.util.Iterator r2 = r6.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1d
            java.lang.Object r3 = r2.next()
            boolean r4 = r0.contains(r3)
            if (r4 != 0) goto Lb
            r2 = 0
            goto L1e
        L1d:
            r2 = 1
        L1e:
            return r2
    }

    public final void ensureCapacity(int r13) {
            r12 = this;
            r0 = r12
            r1 = 0
            int r2 = r0.get_size$collection()
            int[] r3 = r0.getHashes$collection()
            int r3 = r3.length
            if (r3 >= r13) goto L3e
            int[] r4 = r0.getHashes$collection()
            java.lang.Object[] r3 = r0.getArray$collection()
            androidx.collection.ArraySetKt.allocArrays(r0, r13)
            int r5 = r0.get_size$collection()
            if (r5 <= 0) goto L3d
            int[] r5 = r0.getHashes$collection()
            int r8 = r0.get_size$collection()
            r9 = 6
            r10 = 0
            r6 = 0
            r7 = 0
            kotlin.collections.ArraysKt.copyInto$default(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object[] r6 = r0.getArray$collection()
            int r9 = r0.get_size$collection()
            r10 = 6
            r11 = 0
            r8 = 0
            r5 = r3
            kotlin.collections.ArraysKt.copyInto$default(r5, r6, r7, r8, r9, r10, r11)
            goto L3e
        L3d:
            r5 = r3
        L3e:
            int r3 = r0.get_size$collection()
            if (r3 != r2) goto L46
        L45:
            return
        L46:
            java.util.ConcurrentModificationException r3 = new java.util.ConcurrentModificationException
            r3.<init>()
            throw r3
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = r8
            r1 = 0
            r2 = 1
            if (r0 != r9) goto L6
            goto L3c
        L6:
            boolean r3 = r9 instanceof java.util.Set
            r4 = 0
            if (r3 == 0) goto L3b
            int r3 = r0.size()
            r5 = r9
            java.util.Set r5 = (java.util.Set) r5
            int r5 = r5.size()
            if (r3 == r5) goto L1a
            r2 = r4
            goto L3c
        L1a:
            r3 = 0
            int r5 = r0.get_size$collection()     // Catch: java.lang.ClassCastException -> L35 java.lang.NullPointerException -> L38
        L20:
            if (r3 >= r5) goto L34
            java.lang.Object r6 = r0.valueAt(r3)     // Catch: java.lang.ClassCastException -> L35 java.lang.NullPointerException -> L38
            r7 = r9
            java.util.Set r7 = (java.util.Set) r7     // Catch: java.lang.ClassCastException -> L35 java.lang.NullPointerException -> L38
            boolean r7 = r7.contains(r6)     // Catch: java.lang.ClassCastException -> L35 java.lang.NullPointerException -> L38
            if (r7 != 0) goto L31
            r2 = r4
            goto L3c
        L31:
            int r3 = r3 + 1
            goto L20
        L34:
            goto L3c
        L35:
            r2 = move-exception
            r2 = r4
            goto L3c
        L38:
            r2 = move-exception
            r2 = r4
            goto L3c
        L3b:
            r2 = r4
        L3c:
            return r2
    }

    public final java.lang.Object[] getArray$collection() {
            r1 = this;
            java.lang.Object[] r0 = r1.array
            return r0
    }

    public final int[] getHashes$collection() {
            r1 = this;
            int[] r0 = r1.hashes
            return r0
    }

    public int getSize() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    public final int get_size$collection() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r7 = this;
            r0 = r7
            r1 = 0
            int[] r2 = r0.getHashes$collection()
            int r3 = r0.get_size$collection()
            r4 = 0
            r5 = 0
        Lc:
            if (r5 >= r3) goto L14
            r6 = r2[r5]
            int r4 = r4 + r6
            int r5 = r5 + 1
            goto Lc
        L14:
            return r4
    }

    public final int indexOf(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = 0
            if (r4 != 0) goto L9
            int r2 = androidx.collection.ArraySetKt.indexOfNull(r0)
            goto L11
        L9:
            int r2 = r4.hashCode()
            int r2 = androidx.collection.ArraySetKt.indexOf(r0, r4, r2)
        L11:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r3 = this;
            r0 = r3
            r1 = 0
            int r2 = r0.get_size$collection()
            if (r2 > 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<E> iterator() {
            r1 = this;
            androidx.collection.ArraySet$ElementIterator r0 = new androidx.collection.ArraySet$ElementIterator
            r0.<init>(r1)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            int r2 = r0.indexOf(r5)
            if (r2 < 0) goto Ld
            r0.removeAt(r2)
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            return r3
    }

    public final boolean removeAll(androidx.collection.ArraySet<? extends E> r7) {
            r6 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r6
            r1 = 0
            int r2 = r7.get_size$collection()
            int r3 = r0.get_size$collection()
            r4 = 0
        L10:
            if (r4 >= r2) goto L1c
            java.lang.Object r5 = r7.valueAt(r4)
            r0.remove(r5)
            int r4 = r4 + 1
            goto L10
        L1c:
            int r4 = r0.get_size$collection()
            if (r3 == r4) goto L24
            r4 = 1
            goto L25
        L24:
            r4 = 0
        L25:
            return r4
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r7) {
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r6
            r1 = 0
            r2 = 0
            java.util.Iterator r3 = r7.iterator()
        Lc:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1c
            java.lang.Object r4 = r3.next()
            boolean r5 = r0.remove(r4)
            r2 = r2 | r5
            goto Lc
        L1c:
            return r2
    }

    public final E removeAt(int r16) {
            r15 = this;
            r7 = r15
            r8 = 0
            int r9 = r7.get_size$collection()
            java.lang.Object[] r0 = r7.getArray$collection()
            r10 = r0[r16]
            r0 = 1
            if (r9 > r0) goto L16
            r7.clear()
            r4 = r16
            goto Lbd
        L16:
            int r11 = r9 + (-1)
            int[] r1 = r7.getHashes$collection()
            int r1 = r1.length
            r2 = 8
            if (r1 <= r2) goto L89
            int r1 = r7.get_size$collection()
            int[] r3 = r7.getHashes$collection()
            int r3 = r3.length
            int r3 = r3 / 3
            if (r1 >= r3) goto L89
        L2f:
            int r1 = r7.get_size$collection()
            if (r1 <= r2) goto L42
            int r1 = r7.get_size$collection()
            int r2 = r7.get_size$collection()
            int r0 = r2 >> 1
            int r2 = r1 + r0
            goto L43
        L42:
        L43:
            r12 = r2
            int[] r0 = r7.getHashes$collection()
            java.lang.Object[] r13 = r7.getArray$collection()
            androidx.collection.ArraySetKt.allocArrays(r7, r12)
            if (r16 <= 0) goto L68
            int[] r1 = r7.getHashes$collection()
            r5 = 6
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = r16
            kotlin.collections.ArraysKt.copyInto$default(r0, r1, r2, r3, r4, r5, r6)
            r14 = r0
            java.lang.Object[] r1 = r7.getArray$collection()
            r0 = r13
            kotlin.collections.ArraysKt.copyInto$default(r0, r1, r2, r3, r4, r5, r6)
            goto L6c
        L68:
            r4 = r16
            r14 = r0
            r0 = r13
        L6c:
            if (r4 >= r11) goto Lb4
        L6f:
            int[] r1 = r7.getHashes$collection()
            int r2 = r4 + 1
            int r3 = r11 + 1
            kotlin.collections.ArraysKt.copyInto(r14, r1, r4, r2, r3)
            java.lang.Object[] r1 = r7.getArray$collection()
            int r2 = r4 + 1
            int r3 = r11 + 1
            kotlin.collections.ArraysKt.copyInto(r0, r1, r4, r2, r3)
            goto Lb4
        L89:
            r4 = r16
            if (r4 >= r11) goto Lad
            int[] r0 = r7.getHashes$collection()
            int[] r1 = r7.getHashes$collection()
            int r2 = r4 + 1
            int r3 = r11 + 1
            kotlin.collections.ArraysKt.copyInto(r0, r1, r4, r2, r3)
            java.lang.Object[] r0 = r7.getArray$collection()
            java.lang.Object[] r1 = r7.getArray$collection()
            int r2 = r4 + 1
            int r3 = r11 + 1
            kotlin.collections.ArraysKt.copyInto(r0, r1, r4, r2, r3)
        Lad:
            java.lang.Object[] r0 = r7.getArray$collection()
            r1 = 0
            r0[r11] = r1
        Lb4:
            int r0 = r7.get_size$collection()
            if (r9 != r0) goto Lbf
            r7.set_size$collection(r11)
        Lbd:
            return r10
        Lbf:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r7) {
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r6
            r1 = 0
            r2 = 0
            int r3 = r0.get_size$collection()
            int r3 = r3 + (-1)
        Le:
            r4 = -1
            if (r4 >= r3) goto L27
            r4 = r7
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Object[] r5 = r0.getArray$collection()
            r5 = r5[r3]
            boolean r4 = kotlin.collections.CollectionsKt.contains(r4, r5)
            if (r4 != 0) goto L24
            r0.removeAt(r3)
            r2 = 1
        L24:
            int r3 = r3 + (-1)
            goto Le
        L27:
            return r2
    }

    public final void setArray$collection(java.lang.Object[] r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.array = r2
            return
    }

    public final void setHashes$collection(int[] r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.hashes = r2
            return
    }

    public final void set_size$collection(int r1) {
            r0 = this;
            r0._size = r1
            return
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
            r3 = this;
            java.lang.Object[] r0 = r3.array
            r1 = 0
            int r2 = r3._size
            java.lang.Object[] r0 = kotlin.collections.ArraysKt.copyOfRange(r0, r1, r2)
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] r5) {
            r4 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r4._size
            java.lang.Object[] r0 = androidx.collection.ArraySetJvmUtil.resizeForToArray(r5, r0)
            java.lang.Object[] r1 = r4.array
            r2 = 0
            int r3 = r4._size
            kotlin.collections.ArraysKt.copyInto(r1, r0, r2, r2, r3)
            java.lang.String r1 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public java.lang.String toString() {
            r9 = this;
            r0 = r9
            r1 = 0
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Lb
            java.lang.String r2 = "{}"
            goto L4c
        Lb:
            int r2 = r0.get_size$collection()
            int r2 = r2 * 14
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r2 = r3
            r4 = 0
            r5 = 123(0x7b, float:1.72E-43)
            r2.append(r5)
            r5 = 0
            int r6 = r0.get_size$collection()
        L22:
            if (r5 >= r6) goto L3d
            if (r5 <= 0) goto L2b
            java.lang.String r7 = ", "
            r2.append(r7)
        L2b:
            java.lang.Object r7 = r0.valueAt(r5)
            if (r7 == r0) goto L35
            r2.append(r7)
            goto L3a
        L35:
            java.lang.String r8 = "(this Set)"
            r2.append(r8)
        L3a:
            int r5 = r5 + 1
            goto L22
        L3d:
            r5 = 125(0x7d, float:1.75E-43)
            r2.append(r5)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
        L4c:
            return r2
    }

    public final E valueAt(int r4) {
            r3 = this;
            r0 = r3
            r1 = 0
            java.lang.Object[] r2 = r0.getArray$collection()
            r0 = r2[r4]
            return r0
    }
}
