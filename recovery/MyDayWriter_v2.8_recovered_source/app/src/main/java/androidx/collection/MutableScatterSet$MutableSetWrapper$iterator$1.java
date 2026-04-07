package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\f\u001a\u00020\rH\u0096\u0002J\u000e\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"androidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "iterator", "", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "remove", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableScatterSet$MutableSetWrapper$iterator$1<E> implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMutableIterator {
    private int current;
    private final java.util.Iterator<E> iterator;
    final /* synthetic */ androidx.collection.MutableScatterSet<E> this$0;

    MutableScatterSet$MutableSetWrapper$iterator$1(androidx.collection.MutableScatterSet<E> r3) {
            r2 = this;
            r2.this$0 = r3
            r2.<init>()
            r0 = -1
            r2.current = r0
            androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 r0 = new androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1
            r1 = 0
            r0.<init>(r3, r2, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            java.util.Iterator r0 = kotlin.sequences.SequencesKt.iterator(r0)
            r2.iterator = r0
            return
    }

    public final int getCurrent() {
            r1 = this;
            int r0 = r1.current
            return r0
    }

    public final java.util.Iterator<E> getIterator() {
            r1 = this;
            java.util.Iterator<E> r0 = r1.iterator
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            java.util.Iterator<E> r0 = r1.iterator
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public E next() {
            r1 = this;
            java.util.Iterator<E> r0 = r1.iterator
            java.lang.Object r0 = r0.next()
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r3 = this;
            int r0 = r3.current
            r1 = -1
            if (r0 == r1) goto Le
            androidx.collection.MutableScatterSet<E> r0 = r3.this$0
            int r2 = r3.current
            r0.removeElementAt(r2)
            r3.current = r1
        Le:
            return
    }

    public final void setCurrent(int r1) {
            r0 = this;
            r0.current = r1
            return
    }
}
