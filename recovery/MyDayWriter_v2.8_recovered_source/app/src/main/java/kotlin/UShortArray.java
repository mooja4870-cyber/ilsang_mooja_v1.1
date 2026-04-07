package kotlin;

/* JADX INFO: compiled from: UShortArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0096\u0002¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\r\u0088\u0001\u0007\u0092\u0001\u00020\b\u0082\u0002\u0004\n\u0002\b!¨\u00063"}, d2 = {"Lkotlin/UShortArray;", "", "Lkotlin/UShort;", "size", "", "constructor-impl", "(I)[S", "storage", "", "([S)[S", "getSize-impl", "([S)I", "getStorage$annotations", "()V", "contains", "", "element", "contains-xj2QHRw", "([SS)Z", "containsAll", "elements", "containsAll-impl", "([SLjava/util/Collection;)Z", "equals", "other", "", "equals-impl", "([SLjava/lang/Object;)Z", "get", "index", "get-Mh2AYeg", "([SI)S", "hashCode", "hashCode-impl", "isEmpty", "isEmpty-impl", "([S)Z", "iterator", "", "iterator-impl", "([S)Ljava/util/Iterator;", "set", "", "value", "set-01HTLdE", "([SIS)V", "toString", "", "toString-impl", "([S)Ljava/lang/String;", "Iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.JvmInline
public final class UShortArray implements java.util.Collection<kotlin.UShort>, kotlin.jvm.internal.markers.KMappedMarker {
    private final short[] storage;

    /* JADX INFO: compiled from: UShortArray.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0013\u0010\n\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\r"}, d2 = {"Lkotlin/UShortArray$Iterator;", "", "Lkotlin/UShort;", "array", "", "([S)V", "index", "", "hasNext", "", "next", "next-Mh2AYeg", "()S", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Iterator implements java.util.Iterator<kotlin.UShort>, kotlin.jvm.internal.markers.KMappedMarker {
        private final short[] array;
        private int index;

        public Iterator(short[] r2) {
                r1 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.array = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.index
                short[] r1 = r2.array
                int r1 = r1.length
                if (r0 >= r1) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ kotlin.UShort next() {
                r1 = this;
                short r0 = r1.m502nextMh2AYeg()
                kotlin.UShort r0 = kotlin.UShort.m428boximpl(r0)
                return r0
        }

        /* JADX INFO: renamed from: next-Mh2AYeg, reason: not valid java name */
        public short m502nextMh2AYeg() {
                r3 = this;
                int r0 = r3.index
                short[] r1 = r3.array
                int r1 = r1.length
                if (r0 >= r1) goto L16
                short[] r0 = r3.array
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                short r0 = r0[r1]
                short r0 = kotlin.UShort.m434constructorimpl(r0)
                return r0
            L16:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                int r1 = r3.index
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }
    }

    private /* synthetic */ UShortArray(short[] r1) {
            r0 = this;
            r0.<init>()
            r0.storage = r1
            return
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShortArray m485boximpl(short[] r1) {
            kotlin.UShortArray r0 = new kotlin.UShortArray
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short[] m486constructorimpl(int r1) {
            short[] r0 = new short[r1]
            short[] r0 = m487constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short[] m487constructorimpl(short[] r1) {
            java.lang.String r0 = "storage"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: contains-xj2QHRw, reason: not valid java name */
    public static boolean m488containsxj2QHRw(short[] r1, short r2) {
            boolean r0 = kotlin.collections.ArraysKt.contains(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m489containsAllimpl(short[] r9, java.util.Collection<kotlin.UShort> r10) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r10
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r3 = 1
            if (r2 == 0) goto L14
            goto L3e
        L14:
            java.util.Iterator r2 = r0.iterator()
        L18:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3d
            java.lang.Object r4 = r2.next()
            r5 = r4
            r6 = 0
            boolean r7 = r5 instanceof kotlin.UShort
            r8 = 0
            if (r7 == 0) goto L38
            r7 = r5
            kotlin.UShort r7 = (kotlin.UShort) r7
            short r7 = r7.m484unboximpl()
            boolean r7 = kotlin.collections.ArraysKt.contains(r9, r7)
            if (r7 == 0) goto L38
            r5 = r3
            goto L39
        L38:
            r5 = r8
        L39:
            if (r5 != 0) goto L18
            r3 = r8
            goto L3e
        L3d:
        L3e:
            return r3
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m490equalsimpl(short[] r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof kotlin.UShortArray
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r3
            kotlin.UShortArray r0 = (kotlin.UShortArray) r0
            short[] r0 = r0.m501unboximpl()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 != 0) goto L14
            return r1
        L14:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m491equalsimpl0(short[] r1, short[] r2) {
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: get-Mh2AYeg, reason: not valid java name */
    public static final short m492getMh2AYeg(short[] r1, int r2) {
            short r0 = r1[r2]
            short r0 = kotlin.UShort.m434constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static int m493getSizeimpl(short[] r1) {
            int r0 = r1.length
            return r0
    }

    public static /* synthetic */ void getStorage$annotations() {
            return
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m494hashCodeimpl(short[] r1) {
            int r0 = java.util.Arrays.hashCode(r1)
            return r0
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m495isEmptyimpl(short[] r1) {
            int r0 = r1.length
            if (r0 != 0) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }

    /* JADX INFO: renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator<kotlin.UShort> m496iteratorimpl(short[] r1) {
            kotlin.UShortArray$Iterator r0 = new kotlin.UShortArray$Iterator
            r0.<init>(r1)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    /* JADX INFO: renamed from: set-01HTLdE, reason: not valid java name */
    public static final void m497set01HTLdE(short[] r0, int r1, short r2) {
            r0[r1] = r2
            return
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m498toStringimpl(short[] r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UShortArray(storage="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = java.util.Arrays.toString(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(kotlin.UShort r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: add-xj2QHRw, reason: not valid java name */
    public boolean m499addxj2QHRw(short r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends kotlin.UShort> r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.UShort
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r2
            kotlin.UShort r0 = (kotlin.UShort) r0
            short r0 = r0.m484unboximpl()
            boolean r0 = r1.m500containsxj2QHRw(r0)
            return r0
    }

    /* JADX INFO: renamed from: contains-xj2QHRw, reason: not valid java name */
    public boolean m500containsxj2QHRw(short r2) {
            r1 = this;
            short[] r0 = r1.storage
            boolean r0 = m488containsxj2QHRw(r0, r2)
            return r0
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            short[] r0 = r1.storage
            boolean r0 = m489containsAllimpl(r0, r2)
            return r0
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            short[] r0 = r1.storage
            boolean r0 = m490equalsimpl(r0, r2)
            return r0
    }

    public int getSize() {
            r1 = this;
            short[] r0 = r1.storage
            int r0 = m493getSizeimpl(r0)
            return r0
    }

    @Override // java.util.Collection
    public int hashCode() {
            r1 = this;
            short[] r0 = r1.storage
            int r0 = m494hashCodeimpl(r0)
            return r0
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            short[] r0 = r1.storage
            boolean r0 = m495isEmptyimpl(r0)
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<kotlin.UShort> iterator() {
            r1 = this;
            short[] r0 = r1.storage
            java.util.Iterator r0 = m496iteratorimpl(r0)
            return r0
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object[] r0 = kotlin.jvm.internal.CollectionToArray.toArray(r0)
            return r0
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object[] r0 = kotlin.jvm.internal.CollectionToArray.toArray(r0, r2)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            short[] r0 = r1.storage
            java.lang.String r0 = m498toStringimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short[] m501unboximpl() {
            r1 = this;
            short[] r0 = r1.storage
            return r0
    }
}
