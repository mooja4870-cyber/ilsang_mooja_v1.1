package kotlin.collections;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0016\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0011J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0017\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/collections/ReversedList;", "T", "Lkotlin/collections/AbstractMutableList;", "delegate", "", "(Ljava/util/List;)V", "size", "", "getSize", "()I", "add", "", "index", "element", "(ILjava/lang/Object;)V", "clear", "get", "(I)Ljava/lang/Object;", "iterator", "", "listIterator", "", "removeAt", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ReversedList<T> extends kotlin.collections.AbstractMutableList<T> {
    private final java.util.List<T> delegate;

    /* JADX INFO: renamed from: kotlin.collections.ReversedList$listIterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ReversedViews.kt */
    @kotlin.Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010+\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\bJ\t\u0010\t\u001a\u00020\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\r\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0014"}, d2 = {"kotlin/collections/ReversedList$listIterator$1", "", "delegateIterator", "getDelegateIterator", "()Ljava/util/ListIterator;", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "", "previous", "previousIndex", "remove", "set", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 implements java.util.ListIterator<T>, kotlin.jvm.internal.markers.KMutableListIterator {
        private final java.util.ListIterator<T> delegateIterator;
        final /* synthetic */ kotlin.collections.ReversedList<T> this$0;

        AnonymousClass1(kotlin.collections.ReversedList<T> r3, int r4) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                java.util.List r0 = kotlin.collections.ReversedList.access$getDelegate$p(r3)
                r1 = r3
                java.util.List r1 = (java.util.List) r1
                int r1 = kotlin.collections.CollectionsKt__ReversedViewsKt.access$reversePositionIndex(r1, r4)
                java.util.ListIterator r0 = r0.listIterator(r1)
                r2.delegateIterator = r0
                return
        }

        @Override // java.util.ListIterator
        public void add(T r2) {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.delegateIterator
                r0.add(r2)
                java.util.ListIterator<T> r0 = r1.delegateIterator
                r0.previous()
                return
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
                kotlin.collections.ReversedList<T> r0 = r2.this$0
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
                kotlin.collections.ReversedList<T> r0 = r2.this$0
                java.util.List r0 = (java.util.List) r0
                java.util.ListIterator<T> r1 = r2.delegateIterator
                int r1 = r1.nextIndex()
                int r0 = kotlin.collections.CollectionsKt__ReversedViewsKt.access$reverseIteratorIndex(r0, r1)
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.delegateIterator
                r0.remove()
                return
        }

        @Override // java.util.ListIterator
        public void set(T r2) {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.delegateIterator
                r0.set(r2)
                return
        }
    }

    public ReversedList(java.util.List<T> r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.delegate = r2
            return
    }

    public static final /* synthetic */ java.util.List access$getDelegate$p(kotlin.collections.ReversedList r1) {
            java.util.List<T> r0 = r1.delegate
            return r0
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int r3, T r4) {
            r2 = this;
            java.util.List<T> r0 = r2.delegate
            r1 = r2
            java.util.List r1 = (java.util.List) r1
            int r1 = kotlin.collections.CollectionsKt__ReversedViewsKt.access$reversePositionIndex(r1, r3)
            r0.add(r1, r4)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r1 = this;
            java.util.List<T> r0 = r1.delegate
            r0.clear()
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int r3) {
            r2 = this;
            java.util.List<T> r0 = r2.delegate
            r1 = r2
            java.util.List r1 = (java.util.List) r1
            int r1 = kotlin.collections.CollectionsKt__ReversedViewsKt.access$reverseElementIndex(r1, r3)
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
            r1 = this;
            java.util.List<T> r0 = r1.delegate
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<T> iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<T> listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<T> listIterator(int r2) {
            r1 = this;
            kotlin.collections.ReversedList$listIterator$1 r0 = new kotlin.collections.ReversedList$listIterator$1
            r0.<init>(r1, r2)
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            return r0
    }

    @Override // kotlin.collections.AbstractMutableList
    public T removeAt(int r3) {
            r2 = this;
            java.util.List<T> r0 = r2.delegate
            r1 = r2
            java.util.List r1 = (java.util.List) r1
            int r1 = kotlin.collections.CollectionsKt__ReversedViewsKt.access$reverseElementIndex(r1, r3)
            java.lang.Object r0 = r0.remove(r1)
            return r0
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public T set(int r3, T r4) {
            r2 = this;
            java.util.List<T> r0 = r2.delegate
            r1 = r2
            java.util.List r1 = (java.util.List) r1
            int r1 = kotlin.collections.CollectionsKt__ReversedViewsKt.access$reverseElementIndex(r1, r3)
            java.lang.Object r0 = r0.set(r1, r4)
            return r0
    }
}
