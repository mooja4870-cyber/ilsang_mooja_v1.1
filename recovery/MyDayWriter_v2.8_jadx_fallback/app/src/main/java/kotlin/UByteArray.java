package kotlin;

/* JADX INFO: compiled from: UByteArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0096\u0002¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\r\u0088\u0001\u0007\u0092\u0001\u00020\b\u0082\u0002\u0004\n\u0002\b!¨\u00063"}, d2 = {"Lkotlin/UByteArray;", "", "Lkotlin/UByte;", "size", "", "constructor-impl", "(I)[B", "storage", "", "([B)[B", "getSize-impl", "([B)I", "getStorage$annotations", "()V", "contains", "", "element", "contains-7apg3OU", "([BB)Z", "containsAll", "elements", "containsAll-impl", "([BLjava/util/Collection;)Z", "equals", "other", "", "equals-impl", "([BLjava/lang/Object;)Z", "get", "index", "get-w2LRezQ", "([BI)B", "hashCode", "hashCode-impl", "isEmpty", "isEmpty-impl", "([B)Z", "iterator", "", "iterator-impl", "([B)Ljava/util/Iterator;", "set", "", "value", "set-VurrAj0", "([BIB)V", "toString", "", "toString-impl", "([B)Ljava/lang/String;", "Iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.JvmInline
public final class UByteArray implements java.util.Collection<kotlin.UByte>, kotlin.jvm.internal.markers.KMappedMarker {
    private final byte[] storage;

    /* JADX INFO: compiled from: UByteArray.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0013\u0010\n\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\r"}, d2 = {"Lkotlin/UByteArray$Iterator;", "", "Lkotlin/UByte;", "array", "", "([B)V", "index", "", "hasNext", "", "next", "next-w2LRezQ", "()B", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Iterator implements java.util.Iterator<kotlin.UByte>, kotlin.jvm.internal.markers.KMappedMarker {
        private final byte[] array;
        private int index;

        public Iterator(byte[] r2) {
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
                byte[] r1 = r2.array
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
        public /* bridge */ /* synthetic */ kotlin.UByte next() {
                r1 = this;
                byte r0 = r1.m239nextw2LRezQ()
                kotlin.UByte r0 = kotlin.UByte.m165boximpl(r0)
                return r0
        }

        /* JADX INFO: renamed from: next-w2LRezQ, reason: not valid java name */
        public byte m239nextw2LRezQ() {
                r3 = this;
                int r0 = r3.index
                byte[] r1 = r3.array
                int r1 = r1.length
                if (r0 >= r1) goto L16
                byte[] r0 = r3.array
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                r0 = r0[r1]
                byte r0 = kotlin.UByte.m171constructorimpl(r0)
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

    private /* synthetic */ UByteArray(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.storage = r1
            return
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByteArray m222boximpl(byte[] r1) {
            kotlin.UByteArray r0 = new kotlin.UByteArray
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m223constructorimpl(int r1) {
            byte[] r0 = new byte[r1]
            byte[] r0 = m224constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m224constructorimpl(byte[] r1) {
            java.lang.String r0 = "storage"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: contains-7apg3OU, reason: not valid java name */
    public static boolean m225contains7apg3OU(byte[] r1, byte r2) {
            boolean r0 = kotlin.collections.ArraysKt.contains(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m226containsAllimpl(byte[] r9, java.util.Collection<kotlin.UByte> r10) {
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
            boolean r7 = r5 instanceof kotlin.UByte
            r8 = 0
            if (r7 == 0) goto L38
            r7 = r5
            kotlin.UByte r7 = (kotlin.UByte) r7
            byte r7 = r7.m221unboximpl()
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
    public static boolean m227equalsimpl(byte[] r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof kotlin.UByteArray
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r3
            kotlin.UByteArray r0 = (kotlin.UByteArray) r0
            byte[] r0 = r0.m238unboximpl()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 != 0) goto L14
            return r1
        L14:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m228equalsimpl0(byte[] r1, byte[] r2) {
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: get-w2LRezQ, reason: not valid java name */
    public static final byte m229getw2LRezQ(byte[] r1, int r2) {
            r0 = r1[r2]
            byte r0 = kotlin.UByte.m171constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static int m230getSizeimpl(byte[] r1) {
            int r0 = r1.length
            return r0
    }

    public static /* synthetic */ void getStorage$annotations() {
            return
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m231hashCodeimpl(byte[] r1) {
            int r0 = java.util.Arrays.hashCode(r1)
            return r0
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m232isEmptyimpl(byte[] r1) {
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
    public static java.util.Iterator<kotlin.UByte> m233iteratorimpl(byte[] r1) {
            kotlin.UByteArray$Iterator r0 = new kotlin.UByteArray$Iterator
            r0.<init>(r1)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    /* JADX INFO: renamed from: set-VurrAj0, reason: not valid java name */
    public static final void m234setVurrAj0(byte[] r0, int r1, byte r2) {
            r0[r1] = r2
            return
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m235toStringimpl(byte[] r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UByteArray(storage="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = java.util.Arrays.toString(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(kotlin.UByte r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: add-7apg3OU, reason: not valid java name */
    public boolean m236add7apg3OU(byte r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends kotlin.UByte> r3) {
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
            boolean r0 = r2 instanceof kotlin.UByte
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r2
            kotlin.UByte r0 = (kotlin.UByte) r0
            byte r0 = r0.m221unboximpl()
            boolean r0 = r1.m237contains7apg3OU(r0)
            return r0
    }

    /* JADX INFO: renamed from: contains-7apg3OU, reason: not valid java name */
    public boolean m237contains7apg3OU(byte r2) {
            r1 = this;
            byte[] r0 = r1.storage
            boolean r0 = m225contains7apg3OU(r0, r2)
            return r0
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r0 = r1.storage
            boolean r0 = m226containsAllimpl(r0, r2)
            return r0
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            byte[] r0 = r1.storage
            boolean r0 = m227equalsimpl(r0, r2)
            return r0
    }

    public int getSize() {
            r1 = this;
            byte[] r0 = r1.storage
            int r0 = m230getSizeimpl(r0)
            return r0
    }

    @Override // java.util.Collection
    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.storage
            int r0 = m231hashCodeimpl(r0)
            return r0
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            byte[] r0 = r1.storage
            boolean r0 = m232isEmptyimpl(r0)
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<kotlin.UByte> iterator() {
            r1 = this;
            byte[] r0 = r1.storage
            java.util.Iterator r0 = m233iteratorimpl(r0)
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
            byte[] r0 = r1.storage
            java.lang.String r0 = m235toStringimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte[] m238unboximpl() {
            r1 = this;
            byte[] r0 = r1.storage
            return r0
    }
}
