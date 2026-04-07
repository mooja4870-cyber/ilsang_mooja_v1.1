package kotlin.collections;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010*\n\u0000\b\u0012\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\fJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lkotlin/collections/ReversedListReadOnly;", "T", "Lkotlin/collections/AbstractList;", "delegate", "", "(Ljava/util/List;)V", "size", "", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "iterator", "", "listIterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
class ReversedListReadOnly<T> extends kotlin.collections.AbstractList<T> {
    private final java.util.List<T> delegate;

    /* JADX INFO: renamed from: kotlin.collections.ReversedListReadOnly$listIterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ReversedViews.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\r\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000bH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000e"}, d2 = {"kotlin/collections/ReversedListReadOnly$listIterator$1", "", "delegateIterator", "getDelegateIterator", "()Ljava/util/ListIterator;", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "", "previous", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 implements java.util.ListIterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
        private final java.util.ListIterator<T> delegateIterator;
        final /* synthetic */ kotlin.collections.ReversedListReadOnly<T> this$0;

        AnonymousClass1(kotlin.collections.ReversedListReadOnly<? extends T> r3, int r4) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                java.util.List r0 = kotlin.collections.ReversedListReadOnly.access$getDelegate$p(r3)
                r1 = r3
                java.util.List r1 = (java.util.List) r1
                int r1 = kotlin.collections.CollectionsKt__ReversedViewsKt.access$reversePositionIndex(r1, r4)
                java.util.ListIterator r0 = r0.listIterator(r1)
                r2.delegateIterator = r0
                return
        }

        @Override // java.util.ListIterator
        public void add(T r3) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        public final java.util.ListIterator<T> getDelegateIterator() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.delegateIterator
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.delegateIterator
                boolean r0 = r0.hasPrevious()
                return r0
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.delegateIterator
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.delegateIterator
                java.lang.Object r0 = r0.previous()
                return r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r2 = this;
                kotlin.collections.ReversedListReadOnly<T> r0 = r2.this$0
                java.util.List r0 = (java.util.List) r0
                java.util.ListIterator<T> r1 = r2.delegateIterator
                int r1 = r1.previousIndex()
                int r0 = kotlin.collections.CollectionsKt__ReversedViewsKt.access$reverseIteratorIndex(r0, r1)
                return r0
        }

        @Override // java.util.ListIterator
        public T previous() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.delegateIterator
                java.lang.Object r0 = r0.next()
                return r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r2 = this;
                kotlin.collections.ReversedListReadOnly<T> r0 = r2.this$0
                java.util.List r0 = (java.util.List) r0
                java.util.ListIterator<T> r1 = r2.delegateIterator
                int r1 = r1.nextIndex()
                int r0 = kotlin.collections.CollectionsKt__ReversedViewsKt.access$reverseIteratorIndex(r0, r1)
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.ListIterator
        public void set(T r3) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }
    }

    public ReversedListReadOnly(java.util.List<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.delegate = r2
            return
    }

    public static final /* synthetic */ java.util.List access$getDelegate$p(kotlin.collections.ReversedListReadOnly r1) {
            java.util.List<T> r0 = r1.delegate
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int r3) {
            r2 = this;
            java.util.List<T> r0 = r2.delegate
            r1 = r2
            java.util.List r1 = (java.util.List) r1
            int r1 = kotlin.collections.CollectionsKt__ReversedViewsKt.access$reverseElementIndex(r1, r3)
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
            r1 = this;
            java.util.List<T> r0 = r1.delegate
            int r0 = r0.size()
            return r0
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public java.util.ListIterator<T> listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public java.util.ListIterator<T> listIterator(int r2) {
            r1 = this;
            kotlin.collections.ReversedListReadOnly$listIterator$1 r0 = new kotlin.collections.ReversedListReadOnly$listIterator$1
            r0.<init>(r1, r2)
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            return r0
    }
}
