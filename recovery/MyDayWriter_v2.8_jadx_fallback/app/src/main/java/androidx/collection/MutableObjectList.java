package androidx.collection;

/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003678B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000b\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u0019\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0002\u0010\u0016J\u001e\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J#\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018J\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aJ\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eJ\u0006\u0010\u001f\u001a\u00020\u000fJ\u000e\u0010 \u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010!\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010\"J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002J\u001c\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0086\u0002¢\u0006\u0002\u0010#J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\u0002J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\u0002J\u0016\u0010$\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010\"J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002J\u001c\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0086\u0002¢\u0006\u0002\u0010#J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\u0002J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\u0002J\u0013\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u0019\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0002\u0010\u0016J\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aJ\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ\u0015\u0010'\u001a\u00028\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u0004¢\u0006\u0002\u0010(J/\u0010)\u001a\u00020\u000f2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0+H\u0086\bø\u0001\u0000J\u001a\u0010.\u001a\u00020\u000f2\b\b\u0001\u0010/\u001a\u00020\u00042\b\b\u0001\u00100\u001a\u00020\u0004J\u0014\u00101\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0019\u00101\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0002\u0010\u0016J\u0014\u00101\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018J\u0014\u00101\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J\u0014\u00101\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ \u00102\u001a\u00028\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u00103J\u0010\u00104\u001a\u00020\u000f2\b\b\u0002\u00105\u001a\u00020\u0004R\u0012\u0010\u0006\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00069"}, d2 = {"Landroidx/collection/MutableObjectList;", "E", "Landroidx/collection/ObjectList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", "list", "Landroidx/collection/MutableObjectList$ObjectListMutableList;", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "Landroidx/collection/ScatterSet;", "", "([Ljava/lang/Object;)Z", "(I[Ljava/lang/Object;)Z", "", "", "", "Lkotlin/sequences/Sequence;", "asList", "asMutableList", "", "clear", "ensureCapacity", "minusAssign", "(Ljava/lang/Object;)V", "([Ljava/lang/Object;)V", "plusAssign", "remove", "removeAll", "removeAt", "(I)Ljava/lang/Object;", "removeIf", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "removeRange", "start", "end", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "trim", "minCapacity", "MutableObjectListIterator", "ObjectListMutableList", "SubList", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableObjectList<E> extends androidx.collection.ObjectList<E> {
    private androidx.collection.MutableObjectList.ObjectListMutableList<E> list;

    /* JADX INFO: compiled from: ObjectList.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0010\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\r\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/collection/MutableObjectList$MutableObjectListIterator;", "T", "", "list", "", "index", "", "(Ljava/util/List;I)V", "prevIndex", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class MutableObjectListIterator<T> implements java.util.ListIterator<T>, kotlin.jvm.internal.markers.KMutableListIterator {
        private final java.util.List<T> list;
        private int prevIndex;

        public MutableObjectListIterator(java.util.List<T> r2, int r3) {
                r1 = this;
                java.lang.String r0 = "list"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.list = r2
                int r0 = r3 + (-1)
                r1.prevIndex = r0
                return
        }

        @Override // java.util.ListIterator
        public void add(T r3) {
                r2 = this;
                java.util.List<T> r0 = r2.list
                int r1 = r2.prevIndex
                int r1 = r1 + 1
                r2.prevIndex = r1
                int r1 = r2.prevIndex
                r0.add(r1, r3)
                return
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                int r0 = r3.prevIndex
                java.util.List<T> r1 = r3.list
                int r1 = r1.size()
                r2 = 1
                int r1 = r1 - r2
                if (r0 >= r1) goto Ld
                goto Le
            Ld:
                r2 = 0
            Le:
                return r2
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                int r0 = r1.prevIndex
                if (r0 < 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
                r2 = this;
                java.util.List<T> r0 = r2.list
                int r1 = r2.prevIndex
                int r1 = r1 + 1
                r2.prevIndex = r1
                int r1 = r2.prevIndex
                java.lang.Object r0 = r0.get(r1)
                return r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                int r0 = r1.prevIndex
                int r0 = r0 + 1
                return r0
        }

        @Override // java.util.ListIterator
        public T previous() {
                r3 = this;
                java.util.List<T> r0 = r3.list
                int r1 = r3.prevIndex
                int r2 = r1 + (-1)
                r3.prevIndex = r2
                java.lang.Object r0 = r0.get(r1)
                return r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                int r0 = r1.prevIndex
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
                r2 = this;
                java.util.List<T> r0 = r2.list
                int r1 = r2.prevIndex
                r0.remove(r1)
                int r0 = r2.prevIndex
                int r0 = r0 + (-1)
                r2.prevIndex = r0
                return
        }

        @Override // java.util.ListIterator
        public void set(T r3) {
                r2 = this;
                java.util.List<T> r0 = r2.list
                int r1 = r2.prevIndex
                r0.set(r1, r3)
                return
        }
    }

    /* JADX INFO: compiled from: ObjectList.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ\u001d\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0016\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0016\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001dH\u0096\u0002J\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ\u0016\u0010\"\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0015\u0010#\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0018J\u0016\u0010$\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u001e\u0010%\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010&J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006*"}, d2 = {"Landroidx/collection/MutableObjectList$ObjectListMutableList;", "T", "", "objectList", "Landroidx/collection/MutableObjectList;", "(Landroidx/collection/MutableObjectList;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class ObjectListMutableList<T> implements java.util.List<T>, kotlin.jvm.internal.markers.KMutableList {
        private final androidx.collection.MutableObjectList<T> objectList;

        public ObjectListMutableList(androidx.collection.MutableObjectList<T> r2) {
                r1 = this;
                java.lang.String r0 = "objectList"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.objectList = r2
                return
        }

        @Override // java.util.List
        public void add(int r2, T r3) {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                r0.add(r2, r3)
                return
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T r2) {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                boolean r0 = r0.add(r2)
                return r0
        }

        @Override // java.util.List
        public boolean addAll(int r2, java.util.Collection<? extends T> r3) {
                r1 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                boolean r0 = r0.addAll(r2, r3)
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(java.util.Collection<? extends T> r3) {
                r2 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.collection.MutableObjectList<T> r0 = r2.objectList
                r1 = r3
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                boolean r0 = r0.addAll(r1)
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                r0.clear()
                return
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                boolean r0 = r0.contains(r2)
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(java.util.Collection<? extends java.lang.Object> r3) {
                r2 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.collection.MutableObjectList<T> r0 = r2.objectList
                r1 = r3
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                boolean r0 = r0.containsAll(r1)
                return r0
        }

        @Override // java.util.List
        public T get(int r2) {
                r1 = this;
                r0 = r1
                java.util.List r0 = (java.util.List) r0
                androidx.collection.ObjectListKt.access$checkIndex(r0, r2)
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                java.lang.Object r0 = r0.get(r2)
                return r0
        }

        public int getSize() {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                int r0 = r0.getSize()
                return r0
        }

        @Override // java.util.List
        public int indexOf(java.lang.Object r2) {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                int r0 = r0.indexOf(r2)
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<T> iterator() {
                r3 = this;
                androidx.collection.MutableObjectList$MutableObjectListIterator r0 = new androidx.collection.MutableObjectList$MutableObjectListIterator
                r1 = r3
                java.util.List r1 = (java.util.List) r1
                r2 = 0
                r0.<init>(r1, r2)
                java.util.Iterator r0 = (java.util.Iterator) r0
                return r0
        }

        @Override // java.util.List
        public int lastIndexOf(java.lang.Object r2) {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                int r0 = r0.lastIndexOf(r2)
                return r0
        }

        @Override // java.util.List
        public java.util.ListIterator<T> listIterator() {
                r3 = this;
                androidx.collection.MutableObjectList$MutableObjectListIterator r0 = new androidx.collection.MutableObjectList$MutableObjectListIterator
                r1 = r3
                java.util.List r1 = (java.util.List) r1
                r2 = 0
                r0.<init>(r1, r2)
                java.util.ListIterator r0 = (java.util.ListIterator) r0
                return r0
        }

        @Override // java.util.List
        public java.util.ListIterator<T> listIterator(int r3) {
                r2 = this;
                androidx.collection.MutableObjectList$MutableObjectListIterator r0 = new androidx.collection.MutableObjectList$MutableObjectListIterator
                r1 = r2
                java.util.List r1 = (java.util.List) r1
                r0.<init>(r1, r3)
                java.util.ListIterator r0 = (java.util.ListIterator) r0
                return r0
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int r2) {
                r1 = this;
                java.lang.Object r0 = r1.removeAt(r2)
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                boolean r0 = r0.remove(r2)
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(java.util.Collection<? extends java.lang.Object> r3) {
                r2 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.collection.MutableObjectList<T> r0 = r2.objectList
                r1 = r3
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                boolean r0 = r0.removeAll(r1)
                return r0
        }

        public T removeAt(int r2) {
                r1 = this;
                r0 = r1
                java.util.List r0 = (java.util.List) r0
                androidx.collection.ObjectListKt.access$checkIndex(r0, r2)
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                java.lang.Object r0 = r0.removeAt(r2)
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(java.util.Collection<? extends java.lang.Object> r2) {
                r1 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                boolean r0 = r0.retainAll(r2)
                return r0
        }

        @Override // java.util.List
        public T set(int r2, T r3) {
                r1 = this;
                r0 = r1
                java.util.List r0 = (java.util.List) r0
                androidx.collection.ObjectListKt.access$checkIndex(r0, r2)
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                java.lang.Object r0 = r0.set(r2, r3)
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
                r1 = this;
                int r0 = r1.getSize()
                return r0
        }

        @Override // java.util.List
        public java.util.List<T> subList(int r3, int r4) {
                r2 = this;
                r0 = r2
                java.util.List r0 = (java.util.List) r0
                androidx.collection.ObjectListKt.access$checkSubIndex(r0, r3, r4)
                androidx.collection.MutableObjectList$SubList r0 = new androidx.collection.MutableObjectList$SubList
                r1 = r2
                java.util.List r1 = (java.util.List) r1
                r0.<init>(r1, r3, r4)
                java.util.List r0 = (java.util.List) r0
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                r0 = r1
                java.util.Collection r0 = (java.util.Collection) r0
                java.lang.Object[] r0 = kotlin.jvm.internal.CollectionToArray.toArray(r0)
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] r2) {
                r1 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = r1
                java.util.Collection r0 = (java.util.Collection) r0
                java.lang.Object[] r0 = kotlin.jvm.internal.CollectionToArray.toArray(r0, r2)
                return r0
        }
    }

    /* JADX INFO: compiled from: ObjectList.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0017\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0002\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\fH\u0016J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0096\u0002J\u0015\u0010\u001f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u0016\u0010#\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0015\u0010$\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0019J\u0016\u0010%\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u001e\u0010&\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010'J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005H\u0016R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/collection/MutableObjectList$SubList;", "T", "", "list", "start", "", "end", "(Ljava/util/List;II)V", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class SubList<T> implements java.util.List<T>, kotlin.jvm.internal.markers.KMutableList {
        private int end;
        private final java.util.List<T> list;
        private final int start;

        public SubList(java.util.List<T> r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "list"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.list = r2
                r1.start = r3
                r1.end = r4
                return
        }

        @Override // java.util.List
        public void add(int r3, T r4) {
                r2 = this;
                java.util.List<T> r0 = r2.list
                int r1 = r2.start
                int r1 = r1 + r3
                r0.add(r1, r4)
                int r0 = r2.end
                int r0 = r0 + 1
                r2.end = r0
                return
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T r4) {
                r3 = this;
                java.util.List<T> r0 = r3.list
                int r1 = r3.end
                int r2 = r1 + 1
                r3.end = r2
                r0.add(r1, r4)
                r0 = 1
                return r0
        }

        @Override // java.util.List
        public boolean addAll(int r3, java.util.Collection<? extends T> r4) {
                r2 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.util.List<T> r0 = r2.list
                int r1 = r2.start
                int r1 = r1 + r3
                r0.addAll(r1, r4)
                int r0 = r2.end
                int r1 = r4.size()
                int r0 = r0 + r1
                r2.end = r0
                int r0 = r4.size()
                if (r0 <= 0) goto L1e
                r0 = 1
                goto L1f
            L1e:
                r0 = 0
            L1f:
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(java.util.Collection<? extends T> r3) {
                r2 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.util.List<T> r0 = r2.list
                int r1 = r2.end
                r0.addAll(r1, r3)
                int r0 = r2.end
                int r1 = r3.size()
                int r0 = r0 + r1
                r2.end = r0
                int r0 = r3.size()
                if (r0 <= 0) goto L1d
                r0 = 1
                goto L1e
            L1d:
                r0 = 0
            L1e:
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
                r3 = this;
                int r0 = r3.end
                int r0 = r0 + (-1)
                int r1 = r3.start
                if (r1 > r0) goto L12
            L8:
                java.util.List<T> r2 = r3.list
                r2.remove(r0)
                if (r0 == r1) goto L12
                int r0 = r0 + (-1)
                goto L8
            L12:
                int r0 = r3.start
                r3.end = r0
                return
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(java.lang.Object r4) {
                r3 = this;
                int r0 = r3.start
                int r1 = r3.end
            L4:
                if (r0 >= r1) goto L17
                java.util.List<T> r2 = r3.list
                java.lang.Object r2 = r2.get(r0)
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                if (r2 == 0) goto L14
                r1 = 1
                return r1
            L14:
                int r0 = r0 + 1
                goto L4
            L17:
                r0 = 0
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(java.util.Collection<? extends java.lang.Object> r8) {
                r7 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                r0 = r8
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r1 = 0
                java.util.Iterator r2 = r0.iterator()
            Ld:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L24
                java.lang.Object r3 = r2.next()
                r4 = r3
                r5 = 0
                boolean r6 = r7.contains(r4)
                if (r6 != 0) goto L21
                r2 = 0
                return r2
            L21:
                goto Ld
            L24:
                r0 = 1
                return r0
        }

        @Override // java.util.List
        public T get(int r3) {
                r2 = this;
                r0 = r2
                java.util.List r0 = (java.util.List) r0
                androidx.collection.ObjectListKt.access$checkIndex(r0, r3)
                java.util.List<T> r0 = r2.list
                int r1 = r2.start
                int r1 = r1 + r3
                java.lang.Object r0 = r0.get(r1)
                return r0
        }

        public int getSize() {
                r2 = this;
                int r0 = r2.end
                int r1 = r2.start
                int r0 = r0 - r1
                return r0
        }

        @Override // java.util.List
        public int indexOf(java.lang.Object r4) {
                r3 = this;
                int r0 = r3.start
                int r1 = r3.end
            L4:
                if (r0 >= r1) goto L1a
                java.util.List<T> r2 = r3.list
                java.lang.Object r2 = r2.get(r0)
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                if (r2 == 0) goto L17
                int r1 = r3.start
                int r1 = r0 - r1
                return r1
            L17:
                int r0 = r0 + 1
                goto L4
            L1a:
                r0 = -1
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
                r2 = this;
                int r0 = r2.end
                int r1 = r2.start
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<T> iterator() {
                r3 = this;
                androidx.collection.MutableObjectList$MutableObjectListIterator r0 = new androidx.collection.MutableObjectList$MutableObjectListIterator
                r1 = r3
                java.util.List r1 = (java.util.List) r1
                r2 = 0
                r0.<init>(r1, r2)
                java.util.Iterator r0 = (java.util.Iterator) r0
                return r0
        }

        @Override // java.util.List
        public int lastIndexOf(java.lang.Object r4) {
                r3 = this;
                int r0 = r3.end
                int r0 = r0 + (-1)
                int r1 = r3.start
                if (r1 > r0) goto L1e
            L8:
                java.util.List<T> r2 = r3.list
                java.lang.Object r2 = r2.get(r0)
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                if (r2 == 0) goto L19
                int r1 = r3.start
                int r1 = r0 - r1
                return r1
            L19:
                if (r0 == r1) goto L1e
                int r0 = r0 + (-1)
                goto L8
            L1e:
                r0 = -1
                return r0
        }

        @Override // java.util.List
        public java.util.ListIterator<T> listIterator() {
                r3 = this;
                androidx.collection.MutableObjectList$MutableObjectListIterator r0 = new androidx.collection.MutableObjectList$MutableObjectListIterator
                r1 = r3
                java.util.List r1 = (java.util.List) r1
                r2 = 0
                r0.<init>(r1, r2)
                java.util.ListIterator r0 = (java.util.ListIterator) r0
                return r0
        }

        @Override // java.util.List
        public java.util.ListIterator<T> listIterator(int r3) {
                r2 = this;
                androidx.collection.MutableObjectList$MutableObjectListIterator r0 = new androidx.collection.MutableObjectList$MutableObjectListIterator
                r1 = r2
                java.util.List r1 = (java.util.List) r1
                r0.<init>(r1, r3)
                java.util.ListIterator r0 = (java.util.ListIterator) r0
                return r0
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int r2) {
                r1 = this;
                java.lang.Object r0 = r1.removeAt(r2)
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(java.lang.Object r4) {
                r3 = this;
                int r0 = r3.start
                int r1 = r3.end
            L4:
                if (r0 >= r1) goto L22
                java.util.List<T> r2 = r3.list
                java.lang.Object r2 = r2.get(r0)
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                if (r2 == 0) goto L1f
                java.util.List<T> r1 = r3.list
                r1.remove(r0)
                int r1 = r3.end
                int r1 = r1 + (-1)
                r3.end = r1
                r1 = 1
                return r1
            L1f:
                int r0 = r0 + 1
                goto L4
            L22:
                r0 = 0
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(java.util.Collection<? extends java.lang.Object> r8) {
                r7 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                int r0 = r7.end
                r1 = r8
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                r2 = 0
                java.util.Iterator r3 = r1.iterator()
            Lf:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L21
                java.lang.Object r4 = r3.next()
                r5 = r4
                r6 = 0
                r7.remove(r5)
                goto Lf
            L21:
                int r1 = r7.end
                if (r0 == r1) goto L28
                r1 = 1
                goto L29
            L28:
                r1 = 0
            L29:
                return r1
        }

        public T removeAt(int r3) {
                r2 = this;
                r0 = r2
                java.util.List r0 = (java.util.List) r0
                androidx.collection.ObjectListKt.access$checkIndex(r0, r3)
                java.util.List<T> r0 = r2.list
                int r1 = r2.start
                int r1 = r1 + r3
                java.lang.Object r0 = r0.remove(r1)
                int r1 = r2.end
                int r1 = r1 + (-1)
                r2.end = r1
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(java.util.Collection<? extends java.lang.Object> r7) {
                r6 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                int r0 = r6.end
                int r1 = r6.end
                r2 = 1
                int r1 = r1 - r2
                int r3 = r6.start
                if (r3 > r1) goto L2b
            Lf:
                java.util.List<T> r4 = r6.list
                java.lang.Object r4 = r4.get(r1)
                boolean r5 = r7.contains(r4)
                if (r5 != 0) goto L26
                java.util.List<T> r5 = r6.list
                r5.remove(r1)
                int r5 = r6.end
                int r5 = r5 + (-1)
                r6.end = r5
            L26:
                if (r1 == r3) goto L2b
                int r1 = r1 + (-1)
                goto Lf
            L2b:
                int r1 = r6.end
                if (r0 == r1) goto L30
                goto L31
            L30:
                r2 = 0
            L31:
                return r2
        }

        @Override // java.util.List
        public T set(int r3, T r4) {
                r2 = this;
                r0 = r2
                java.util.List r0 = (java.util.List) r0
                androidx.collection.ObjectListKt.access$checkIndex(r0, r3)
                java.util.List<T> r0 = r2.list
                int r1 = r2.start
                int r1 = r1 + r3
                java.lang.Object r0 = r0.set(r1, r4)
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
                r1 = this;
                int r0 = r1.getSize()
                return r0
        }

        @Override // java.util.List
        public java.util.List<T> subList(int r3, int r4) {
                r2 = this;
                r0 = r2
                java.util.List r0 = (java.util.List) r0
                androidx.collection.ObjectListKt.access$checkSubIndex(r0, r3, r4)
                androidx.collection.MutableObjectList$SubList r0 = new androidx.collection.MutableObjectList$SubList
                r1 = r2
                java.util.List r1 = (java.util.List) r1
                r0.<init>(r1, r3, r4)
                java.util.List r0 = (java.util.List) r0
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                r0 = r1
                java.util.Collection r0 = (java.util.Collection) r0
                java.lang.Object[] r0 = kotlin.jvm.internal.CollectionToArray.toArray(r0)
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] r2) {
                r1 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = r1
                java.util.Collection r0 = (java.util.Collection) r0
                java.lang.Object[] r0 = kotlin.jvm.internal.CollectionToArray.toArray(r0, r2)
                return r0
        }
    }

    public MutableObjectList() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public MutableObjectList(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public /* synthetic */ MutableObjectList(int r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 16
        L6:
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ void trim$default(androidx.collection.MutableObjectList r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            int r1 = r0._size
        L6:
            r0.trim(r1)
            return
    }

    public final void add(int r5, E r6) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 < 0) goto L9
            int r2 = r4._size
            if (r5 > r2) goto L9
            r0 = r1
        L9:
            if (r0 == 0) goto L29
            int r0 = r4._size
            int r0 = r0 + r1
            r4.ensureCapacity(r0)
            java.lang.Object[] r0 = r4.content
            int r2 = r4._size
            if (r5 == r2) goto L21
        L19:
            int r2 = r5 + 1
            int r3 = r4._size
            kotlin.collections.ArraysKt.copyInto(r0, r0, r2, r5, r3)
        L21:
            r0[r5] = r6
            int r2 = r4._size
            int r2 = r2 + r1
            r4._size = r2
            return
        L29:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = " must be in 0.."
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r4._size
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final boolean add(E r4) {
            r3 = this;
            int r0 = r3._size
            r1 = 1
            int r0 = r0 + r1
            r3.ensureCapacity(r0)
            java.lang.Object[] r0 = r3.content
            int r2 = r3._size
            r0[r2] = r4
            int r0 = r3._size
            int r0 = r0 + r1
            r3._size = r0
            return r1
    }

    public final boolean addAll(int r6, androidx.collection.ObjectList<E> r7) {
            r5 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 1
            r1 = 0
            if (r6 < 0) goto Lf
            int r2 = r5._size
            if (r6 > r2) goto Lf
            r2 = r0
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L44
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L19
            return r1
        L19:
            int r2 = r5._size
            int r3 = r7._size
            int r2 = r2 + r3
            r5.ensureCapacity(r2)
            java.lang.Object[] r2 = r5.content
            int r3 = r5._size
            if (r6 == r3) goto L32
        L29:
            int r3 = r7._size
            int r3 = r3 + r6
            int r4 = r5._size
            kotlin.collections.ArraysKt.copyInto(r2, r2, r3, r6, r4)
        L32:
            java.lang.Object[] r3 = r7.content
            int r4 = r7._size
            kotlin.collections.ArraysKt.copyInto(r3, r2, r6, r1, r4)
            int r1 = r5._size
            int r3 = r7._size
            int r1 = r1 + r3
            r5._size = r1
            return r0
        L44:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " must be in 0.."
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r5._size
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final boolean addAll(int r12, java.util.Collection<? extends E> r13) {
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 1
            r1 = 0
            if (r12 < 0) goto Lf
            int r2 = r11._size
            if (r12 > r2) goto Lf
            r2 = r0
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L64
            boolean r2 = r13.isEmpty()
            if (r2 == 0) goto L19
            return r1
        L19:
            int r1 = r11._size
            int r2 = r13.size()
            int r1 = r1 + r2
            r11.ensureCapacity(r1)
            java.lang.Object[] r1 = r11.content
            int r2 = r11._size
            if (r12 == r2) goto L36
        L2b:
            int r2 = r13.size()
            int r2 = r2 + r12
            int r3 = r11._size
            kotlin.collections.ArraysKt.copyInto(r1, r1, r2, r12, r3)
        L36:
            r2 = r13
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            r4 = 0
            java.util.Iterator r5 = r2.iterator()
        L3f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L59
            java.lang.Object r6 = r5.next()
            int r7 = r4 + 1
            if (r4 >= 0) goto L50
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L50:
            r8 = r6
            r9 = 0
            int r10 = r12 + r4
            r1[r10] = r8
            r4 = r7
            goto L3f
        L59:
            int r2 = r11._size
            int r3 = r13.size()
            int r2 = r2 + r3
            r11._size = r2
            return r0
        L64:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r2 = " must be in 0.."
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r11._size
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final boolean addAll(int r10, E[] r11) {
            r9 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 1
            r1 = 0
            if (r10 < 0) goto Lf
            int r2 = r9._size
            if (r10 > r2) goto Lf
            r2 = r0
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L43
            int r2 = r11.length
            if (r2 != 0) goto L17
            r2 = r0
            goto L18
        L17:
            r2 = r1
        L18:
            if (r2 == 0) goto L1b
            return r1
        L1b:
            int r1 = r9._size
            int r2 = r11.length
            int r1 = r1 + r2
            r9.ensureCapacity(r1)
            java.lang.Object[] r3 = r9.content
            int r1 = r9._size
            if (r10 == r1) goto L32
        L2a:
            int r1 = r11.length
            int r1 = r1 + r10
            int r2 = r9._size
            kotlin.collections.ArraysKt.copyInto(r3, r3, r1, r10, r2)
        L32:
            r7 = 12
            r8 = 0
            r5 = 0
            r6 = 0
            r4 = r10
            r2 = r11
            kotlin.collections.ArraysKt.copyInto$default(r2, r3, r4, r5, r6, r7, r8)
            int r10 = r9._size
            int r11 = r2.length
            int r10 = r10 + r11
            r9._size = r10
            return r0
        L43:
            r4 = r10
            r2 = r11
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Index "
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.StringBuilder r11 = r11.append(r4)
            java.lang.String r0 = " must be in 0.."
            java.lang.StringBuilder r11 = r11.append(r0)
            int r0 = r9._size
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    public final boolean addAll(androidx.collection.ObjectList<E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2._size
            r2.plusAssign(r3)
            int r1 = r2._size
            if (r0 == r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public final boolean addAll(androidx.collection.ScatterSet<E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2._size
            r2.plusAssign(r3)
            int r1 = r2._size
            if (r0 == r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public final boolean addAll(java.lang.Iterable<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2._size
            r2.plusAssign(r3)
            int r1 = r2._size
            if (r0 == r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public final boolean addAll(java.util.List<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2._size
            r2.plusAssign(r3)
            int r1 = r2._size
            if (r0 == r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public final boolean addAll(kotlin.sequences.Sequence<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2._size
            r2.plusAssign(r3)
            int r1 = r2._size
            if (r0 == r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public final boolean addAll(E[] r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2._size
            r2.plusAssign(r3)
            int r1 = r2._size
            if (r0 == r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    @Override // androidx.collection.ObjectList
    public java.util.List<E> asList() {
            r1 = this;
            java.util.List r0 = r1.asMutableList()
            return r0
    }

    public final java.util.List<E> asMutableList() {
            r3 = this;
            androidx.collection.MutableObjectList$ObjectListMutableList<E> r0 = r3.list
            if (r0 == 0) goto L5
            goto L10
        L5:
            androidx.collection.MutableObjectList$ObjectListMutableList r0 = new androidx.collection.MutableObjectList$ObjectListMutableList
            r0.<init>(r3)
            r1 = r0
            r2 = 0
            r3.list = r1
        L10:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final void clear() {
            r4 = this;
            java.lang.Object[] r0 = r4.content
            int r1 = r4._size
            r2 = 0
            r3 = 0
            kotlin.collections.ArraysKt.fill(r0, r2, r3, r1)
            r4._size = r3
            return
    }

    public final void ensureCapacity(int r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.content
            int r1 = r0.length
            if (r1 >= r5) goto L19
            int r1 = r0.length
            int r1 = r1 * 3
            int r1 = r1 / 2
            int r1 = java.lang.Math.max(r5, r1)
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r3 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r4.content = r2
        L19:
            return
    }

    public final int getCapacity() {
            r2 = this;
            r0 = 0
            java.lang.Object[] r1 = r2.content
            int r1 = r1.length
            return r1
    }

    public final void minusAssign(androidx.collection.ObjectList<E> r10) {
            r9 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r10
            r1 = 0
            java.lang.Object[] r2 = r0.content
            r3 = 0
            int r4 = r0._size
        Ld:
            if (r3 >= r4) goto L1d
            r5 = r2[r3]
            r6 = 0
            r7 = r9
            r8 = 0
            r7.remove(r5)
            int r3 = r3 + 1
            goto Ld
        L1d:
            return
    }

    public final void minusAssign(androidx.collection.ScatterSet<E> r23) {
            r22 = this;
            java.lang.String r0 = "elements"
            r1 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = r23
            r2 = 0
            java.lang.Object[] r3 = r0.elements
            r4 = r0
            r5 = 0
            long[] r6 = r4.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 0
            if (r8 > r7) goto L86
        L18:
            r9 = r6[r8]
            r11 = r9
            r13 = 0
            long r14 = ~r11
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r11
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r14 & r16
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 == 0) goto L7d
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L37:
            if (r13 >= r11) goto L74
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 0
            r17 = 128(0x80, double:6.3E-322)
            int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r17 >= 0) goto L47
            r17 = 1
            goto L49
        L47:
            r17 = 0
        L49:
            if (r17 == 0) goto L67
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r17 = r12
            r12 = r3[r15]
            r18 = 0
            r19 = r22
            r20 = 0
            r21 = r0
            r0 = r19
            r0.remove(r12)
            goto L6b
        L67:
            r21 = r0
            r17 = r12
        L6b:
            long r9 = r9 >> r17
            int r13 = r13 + 1
            r12 = r17
            r0 = r21
            goto L37
        L74:
            r21 = r0
            r17 = r12
            r0 = r17
            if (r11 != r0) goto L89
            goto L7f
        L7d:
            r21 = r0
        L7f:
            if (r8 == r7) goto L88
            int r8 = r8 + 1
            r0 = r21
            goto L18
        L86:
            r21 = r0
        L88:
        L89:
            return
    }

    public final void minusAssign(java.lang.Iterable<? extends E> r9) {
            r8 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r9
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L20
            java.lang.Object r3 = r2.next()
            r4 = r3
            r5 = 0
            r6 = r8
            r7 = 0
            r6.remove(r4)
            goto Lb
        L20:
            return
    }

    public final void minusAssign(E r2) {
            r1 = this;
            r0 = 0
            r1.remove(r2)
            return
    }

    public final void minusAssign(java.util.List<? extends E> r6) {
            r5 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            int r1 = r6.size()
        La:
            if (r0 >= r1) goto L19
            java.lang.Object r2 = r6.get(r0)
            r3 = r5
            r4 = 0
            r3.remove(r2)
            int r0 = r0 + 1
            goto La
        L19:
            return
    }

    public final void minusAssign(kotlin.sequences.Sequence<? extends E> r9) {
            r8 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r9
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L20
            java.lang.Object r3 = r2.next()
            r4 = r3
            r5 = 0
            r6 = r8
            r7 = 0
            r6.remove(r4)
            goto Lb
        L20:
            return
    }

    public final void minusAssign(E[] r10) {
            r9 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r10
            r1 = 0
            int r2 = r0.length
            r3 = 0
        L9:
            if (r3 >= r2) goto L1a
            r4 = r0[r3]
            r5 = r4
            r6 = 0
            r7 = r9
            r8 = 0
            r7.remove(r5)
            int r3 = r3 + 1
            goto L9
        L1a:
            return
    }

    public final void plusAssign(androidx.collection.ObjectList<E> r6) {
            r5 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto Lc
            return
        Lc:
            int r0 = r5._size
            int r1 = r6._size
            int r0 = r0 + r1
            r5.ensureCapacity(r0)
            java.lang.Object[] r0 = r5.content
            java.lang.Object[] r1 = r6.content
            int r2 = r5._size
            int r3 = r6._size
            r4 = 0
            kotlin.collections.ArraysKt.copyInto(r1, r0, r2, r4, r3)
            int r1 = r5._size
            int r2 = r6._size
            int r1 = r1 + r2
            r5._size = r1
            return
    }

    public final void plusAssign(androidx.collection.ScatterSet<E> r22) {
            r21 = this;
            r0 = r21
            java.lang.String r1 = "elements"
            r2 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L10
            return
        L10:
            int r1 = r0._size
            int r3 = r2.getSize()
            int r1 = r1 + r3
            r0.ensureCapacity(r1)
            r1 = r22
            r3 = 0
            java.lang.Object[] r4 = r1.elements
            r5 = r1
            r6 = 0
            long[] r7 = r5.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            r9 = 0
            if (r9 > r8) goto L92
        L2b:
            r10 = r7[r9]
            r12 = r10
            r14 = 0
            r15 = r1
            long r0 = ~r12
            r16 = 7
            long r0 = r0 << r16
            long r0 = r0 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r16
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 == 0) goto L88
            int r0 = r9 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r1 = 8
            int r0 = 8 - r0
            r12 = 0
        L4b:
            if (r12 >= r0) goto L84
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r10
            r16 = 0
            r17 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r17 >= 0) goto L5b
            r17 = 1
            goto L5d
        L5b:
            r17 = 0
        L5d:
            if (r17 == 0) goto L79
            int r13 = r9 << 3
            int r13 = r13 + r12
            r14 = r13
            r16 = 0
            r17 = r1
            r1 = r4[r14]
            r18 = 0
            r19 = r21
            r20 = 0
            r2 = r19
            r2.add(r1)
            goto L7b
        L79:
            r17 = r1
        L7b:
            long r10 = r10 >> r17
            int r12 = r12 + 1
            r2 = r22
            r1 = r17
            goto L4b
        L84:
            r17 = r1
            if (r0 != r1) goto L94
        L88:
            if (r9 == r8) goto L93
            int r9 = r9 + 1
            r0 = r21
            r2 = r22
            r1 = r15
            goto L2b
        L92:
            r15 = r1
        L93:
        L94:
            return
    }

    public final void plusAssign(java.lang.Iterable<? extends E> r9) {
            r8 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r9
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L20
            java.lang.Object r3 = r2.next()
            r4 = r3
            r5 = 0
            r6 = r8
            r7 = 0
            r6.add(r4)
            goto Lb
        L20:
            return
    }

    public final void plusAssign(E r2) {
            r1 = this;
            r0 = 0
            r1.add(r2)
            return
    }

    public final void plusAssign(java.util.List<? extends E> r7) {
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto Lc
            return
        Lc:
            int r0 = r6._size
            int r1 = r7.size()
            int r1 = r1 + r0
            r6.ensureCapacity(r1)
            java.lang.Object[] r1 = r6.content
            r2 = 0
            int r3 = r7.size()
        L1d:
            if (r2 >= r3) goto L2a
            int r4 = r2 + r0
            java.lang.Object r5 = r7.get(r2)
            r1[r4] = r5
            int r2 = r2 + 1
            goto L1d
        L2a:
            int r2 = r6._size
            int r3 = r7.size()
            int r2 = r2 + r3
            r6._size = r2
            return
    }

    public final void plusAssign(kotlin.sequences.Sequence<? extends E> r9) {
            r8 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r9
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L20
            java.lang.Object r3 = r2.next()
            r4 = r3
            r5 = 0
            r6 = r8
            r7 = 0
            r6.add(r4)
            goto Lb
        L20:
            return
    }

    public final void plusAssign(E[] r9) {
            r8 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            int r0 = r9.length
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto Le
            return
        Le:
            int r0 = r8._size
            int r1 = r9.length
            int r0 = r0 + r1
            r8.ensureCapacity(r0)
            java.lang.Object[] r2 = r8.content
            int r3 = r8._size
            r6 = 12
            r7 = 0
            r4 = 0
            r5 = 0
            r1 = r9
            kotlin.collections.ArraysKt.copyInto$default(r1, r2, r3, r4, r5, r6, r7)
            int r9 = r8._size
            int r0 = r1.length
            int r9 = r9 + r0
            r8._size = r9
            return
    }

    public final boolean remove(E r3) {
            r2 = this;
            int r0 = r2.indexOf(r3)
            if (r0 < 0) goto Lb
            r2.removeAt(r0)
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public final boolean removeAll(androidx.collection.ObjectList<E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2._size
            r2.minusAssign(r3)
            int r1 = r2._size
            if (r0 == r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public final boolean removeAll(androidx.collection.ScatterSet<E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2._size
            r2.minusAssign(r3)
            int r1 = r2._size
            if (r0 == r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public final boolean removeAll(java.lang.Iterable<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2._size
            r2.minusAssign(r3)
            int r1 = r2._size
            if (r0 == r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public final boolean removeAll(java.util.List<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2._size
            r2.minusAssign(r3)
            int r1 = r2._size
            if (r0 == r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public final boolean removeAll(kotlin.sequences.Sequence<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2._size
            r2.minusAssign(r3)
            int r1 = r2._size
            if (r0 == r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public final boolean removeAll(E[] r5) {
            r4 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r4._size
            r1 = 0
            int r2 = r5.length
        L9:
            if (r1 >= r2) goto L13
            r3 = r5[r1]
            r4.remove(r3)
            int r1 = r1 + 1
            goto L9
        L13:
            int r1 = r4._size
            if (r0 == r1) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            return r1
    }

    public final E removeAt(int r7) {
            r6 = this;
            r0 = 0
            r1 = 1
            if (r7 < 0) goto L9
            int r2 = r6._size
            if (r7 >= r2) goto L9
            r0 = r1
        L9:
            if (r0 == 0) goto L2e
            java.lang.Object[] r0 = r6.content
            r2 = r0[r7]
            r3 = r6
            androidx.collection.ObjectList r3 = (androidx.collection.ObjectList) r3
            r4 = 0
            int r5 = r3._size
            int r5 = r5 - r1
            if (r7 == r5) goto L22
        L1b:
            int r1 = r7 + 1
            int r3 = r6._size
            kotlin.collections.ArraysKt.copyInto(r0, r0, r7, r1, r3)
        L22:
            int r1 = r6._size
            int r1 = r1 + (-1)
            r6._size = r1
            int r1 = r6._size
            r3 = 0
            r0[r1] = r3
            return r2
        L2e:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Index "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r3 = " must be in 0.."
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            androidx.collection.ObjectList r3 = (androidx.collection.ObjectList) r3
            r4 = 0
            int r5 = r3._size
            int r5 = r5 - r1
            java.lang.StringBuilder r1 = r2.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void removeIf(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r9) {
            r8 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            r1 = 0
            int r2 = r8._size
            java.lang.Object[] r3 = r8.content
            r4 = r8
            androidx.collection.ObjectList r4 = (androidx.collection.ObjectList) r4
            r5 = 0
            r6 = 0
            int r7 = r4._size
            kotlin.ranges.IntRange r4 = kotlin.ranges.RangesKt.until(r6, r7)
            int r5 = r4.getFirst()
            int r4 = r4.getLast()
            if (r5 > r4) goto L3b
        L20:
            int r6 = r5 - r1
            r7 = r3[r5]
            r3[r6] = r7
            r6 = r3[r5]
            java.lang.Object r6 = r9.invoke(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L36
            int r1 = r1 + 1
        L36:
            if (r5 == r4) goto L3b
            int r5 = r5 + 1
            goto L20
        L3b:
            r4 = 0
            int r5 = r2 - r1
            kotlin.collections.ArraysKt.fill(r3, r4, r5, r2)
            int r4 = r8._size
            int r4 = r4 - r1
            r8._size = r4
            return
    }

    public final void removeRange(int r5, int r6) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 < 0) goto La
            int r2 = r4._size
            if (r5 > r2) goto La
            r2 = r0
            goto Lb
        La:
            r2 = r1
        Lb:
            java.lang.String r3 = "Start ("
            if (r2 == 0) goto L63
            if (r6 < 0) goto L16
            int r2 = r4._size
            if (r6 > r2) goto L16
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 == 0) goto L63
            if (r6 < r5) goto L3c
            if (r6 == r5) goto L3b
            int r0 = r4._size
            if (r6 >= r0) goto L2c
            java.lang.Object[] r0 = r4.content
            java.lang.Object[] r1 = r4.content
            int r2 = r4._size
            kotlin.collections.ArraysKt.copyInto(r0, r1, r5, r6, r2)
        L2c:
            int r0 = r4._size
            int r1 = r6 - r5
            int r0 = r0 - r1
            java.lang.Object[] r1 = r4.content
            r2 = 0
            int r3 = r4._size
            kotlin.collections.ArraysKt.fill(r1, r2, r0, r3)
            r4._size = r0
        L3b:
            return
        L3c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = ") is more than end ("
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            r2 = 41
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L63:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = ") and end ("
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = ") must be in 0.."
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r4._size
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final boolean retainAll(androidx.collection.ObjectList<E> r7) {
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r6._size
            java.lang.Object[] r1 = r6.content
            r2 = r6
            androidx.collection.ObjectList r2 = (androidx.collection.ObjectList) r2
            r3 = 0
            int r4 = r2._size
            r5 = 1
            int r4 = r4 - r5
        L12:
            r2 = -1
            if (r2 >= r4) goto L23
            r2 = r1[r4]
            boolean r3 = r7.contains(r2)
            if (r3 != 0) goto L20
            r6.removeAt(r4)
        L20:
            int r4 = r4 + (-1)
            goto L12
        L23:
            int r2 = r6._size
            if (r0 == r2) goto L28
            goto L29
        L28:
            r5 = 0
        L29:
            return r5
    }

    public final boolean retainAll(java.lang.Iterable<? extends E> r7) {
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r6._size
            java.lang.Object[] r1 = r6.content
            r2 = r6
            androidx.collection.ObjectList r2 = (androidx.collection.ObjectList) r2
            r3 = 0
            int r4 = r2._size
            r5 = 1
            int r4 = r4 - r5
        L12:
            r2 = -1
            if (r2 >= r4) goto L23
            r2 = r1[r4]
            boolean r3 = kotlin.collections.CollectionsKt.contains(r7, r2)
            if (r3 != 0) goto L20
            r6.removeAt(r4)
        L20:
            int r4 = r4 + (-1)
            goto L12
        L23:
            int r2 = r6._size
            if (r0 == r2) goto L28
            goto L29
        L28:
            r5 = 0
        L29:
            return r5
    }

    public final boolean retainAll(java.util.Collection<? extends E> r7) {
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r6._size
            java.lang.Object[] r1 = r6.content
            r2 = r6
            androidx.collection.ObjectList r2 = (androidx.collection.ObjectList) r2
            r3 = 0
            int r4 = r2._size
            r5 = 1
            int r4 = r4 - r5
        L12:
            r2 = -1
            if (r2 >= r4) goto L23
            r2 = r1[r4]
            boolean r3 = r7.contains(r2)
            if (r3 != 0) goto L20
            r6.removeAt(r4)
        L20:
            int r4 = r4 + (-1)
            goto L12
        L23:
            int r2 = r6._size
            if (r0 == r2) goto L28
            goto L29
        L28:
            r5 = 0
        L29:
            return r5
    }

    public final boolean retainAll(kotlin.sequences.Sequence<? extends E> r7) {
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r6._size
            java.lang.Object[] r1 = r6.content
            r2 = r6
            androidx.collection.ObjectList r2 = (androidx.collection.ObjectList) r2
            r3 = 0
            int r4 = r2._size
            r5 = 1
            int r4 = r4 - r5
        L12:
            r2 = -1
            if (r2 >= r4) goto L23
            r2 = r1[r4]
            boolean r3 = kotlin.sequences.SequencesKt.contains(r7, r2)
            if (r3 != 0) goto L20
            r6.removeAt(r4)
        L20:
            int r4 = r4 + (-1)
            goto L12
        L23:
            int r2 = r6._size
            if (r0 == r2) goto L28
            goto L29
        L28:
            r5 = 0
        L29:
            return r5
    }

    public final boolean retainAll(E[] r7) {
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r6._size
            java.lang.Object[] r1 = r6.content
            r2 = r6
            androidx.collection.ObjectList r2 = (androidx.collection.ObjectList) r2
            r3 = 0
            int r4 = r2._size
            r5 = 1
            int r4 = r4 - r5
        L12:
            r2 = -1
            if (r2 >= r4) goto L23
            r2 = r1[r4]
            int r3 = kotlin.collections.ArraysKt.indexOf(r7, r2)
            if (r3 >= 0) goto L20
            r6.removeAt(r4)
        L20:
            int r4 = r4 + (-1)
            goto L12
        L23:
            int r2 = r6._size
            if (r0 == r2) goto L28
            goto L29
        L28:
            r5 = 0
        L29:
            return r5
    }

    public final E set(int r7, E r8) {
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 < 0) goto L9
            int r2 = r6._size
            if (r7 >= r2) goto L9
            r1 = r0
        L9:
            if (r1 == 0) goto L12
            java.lang.Object[] r0 = r6.content
            r1 = r0[r7]
            r0[r7] = r8
            return r1
        L12:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "set index "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r3 = " must be between 0 .. "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            androidx.collection.ObjectList r3 = (androidx.collection.ObjectList) r3
            r4 = 0
            int r5 = r3._size
            int r5 = r5 - r0
            java.lang.StringBuilder r0 = r2.append(r5)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public final void trim(int r5) {
            r4 = this;
            int r0 = r4._size
            int r0 = java.lang.Math.max(r5, r0)
            r1 = r4
            r2 = 0
            java.lang.Object[] r3 = r1.content
            int r1 = r3.length
            if (r1 <= r0) goto L1a
            java.lang.Object[] r1 = r4.content
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r4.content = r1
        L1a:
            return
    }
}
