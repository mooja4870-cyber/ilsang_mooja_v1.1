package kotlin.collections;

/* JADX INFO: compiled from: AbstractList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\b\b'\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\u0016\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H¦\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096\u0002J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "size", "", "getSize", "()I", "equals", "", "other", "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "element", "(Ljava/lang/Object;)I", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractList<E> extends kotlin.collections.AbstractCollection<E> implements java.util.List<E>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final kotlin.collections.AbstractList.Companion Companion = null;
    private static final int maxArraySize = 2147483639;

    /* JADX INFO: compiled from: AbstractList.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\nJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000fJ%\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0017J%\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000¢\u0006\u0002\b\u001dJ\u0019\u0010\u001e\u001a\u00020\u00042\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000¢\u0006\u0002\b\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlin/collections/AbstractList$Companion;", "", "()V", "maxArraySize", "", "checkBoundsIndexes", "", "startIndex", "endIndex", "size", "checkBoundsIndexes$kotlin_stdlib", "checkElementIndex", "index", "checkElementIndex$kotlin_stdlib", "checkPositionIndex", "checkPositionIndex$kotlin_stdlib", "checkRangeIndexes", "fromIndex", "toIndex", "checkRangeIndexes$kotlin_stdlib", "newCapacity", "oldCapacity", "minCapacity", "newCapacity$kotlin_stdlib", "orderedEquals", "", "c", "", "other", "orderedEquals$kotlin_stdlib", "orderedHashCode", "orderedHashCode$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final void checkBoundsIndexes$kotlin_stdlib(int r4, int r5, int r6) {
                r3 = this;
                java.lang.String r0 = "startIndex: "
                if (r4 < 0) goto L2a
                if (r5 > r6) goto L2a
                if (r4 > r5) goto L9
                return
            L9:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r0 = r2.append(r0)
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r2 = " > endIndex: "
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L2a:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r0 = r2.append(r0)
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r2 = ", endIndex: "
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r2 = ", size: "
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r6)
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
        }

        public final void checkElementIndex$kotlin_stdlib(int r4, int r5) {
                r3 = this;
                if (r4 < 0) goto L5
                if (r4 >= r5) goto L5
                return
            L5:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "index: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r2 = ", size: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r5)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public final void checkPositionIndex$kotlin_stdlib(int r4, int r5) {
                r3 = this;
                if (r4 < 0) goto L5
                if (r4 > r5) goto L5
                return
            L5:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "index: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r2 = ", size: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r5)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public final void checkRangeIndexes$kotlin_stdlib(int r4, int r5, int r6) {
                r3 = this;
                java.lang.String r0 = "fromIndex: "
                if (r4 < 0) goto L2a
                if (r5 > r6) goto L2a
                if (r4 > r5) goto L9
                return
            L9:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r0 = r2.append(r0)
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r2 = " > toIndex: "
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L2a:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r0 = r2.append(r0)
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r2 = ", toIndex: "
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r2 = ", size: "
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r6)
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
        }

        public final int newCapacity$kotlin_stdlib(int r4, int r5) {
                r3 = this;
                int r0 = r4 >> 1
                int r0 = r0 + r4
                int r1 = r0 - r5
                if (r1 >= 0) goto L8
                r0 = r5
            L8:
                r1 = 2147483639(0x7ffffff7, float:NaN)
                int r2 = r0 - r1
                if (r2 <= 0) goto L15
                if (r5 <= r1) goto L14
                r1 = 2147483647(0x7fffffff, float:NaN)
            L14:
                r0 = r1
            L15:
                return r0
        }

        public final boolean orderedEquals$kotlin_stdlib(java.util.Collection<?> r7, java.util.Collection<?> r8) {
                r6 = this;
                java.lang.String r0 = "c"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.String r0 = "other"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                int r0 = r7.size()
                int r1 = r8.size()
                r2 = 0
                if (r0 == r1) goto L16
                return r2
            L16:
                java.util.Iterator r0 = r8.iterator()
                java.util.Iterator r1 = r7.iterator()
            L1e:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L33
                java.lang.Object r3 = r1.next()
                java.lang.Object r4 = r0.next()
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
                if (r5 != 0) goto L1e
                return r2
            L33:
                r1 = 1
                return r1
        }

        public final int orderedHashCode$kotlin_stdlib(java.util.Collection<?> r6) {
                r5 = this;
                java.lang.String r0 = "c"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                r0 = 1
                java.util.Iterator r1 = r6.iterator()
            La:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                int r3 = r0 * 31
                if (r2 == 0) goto L1d
                int r4 = r2.hashCode()
                goto L1e
            L1d:
                r4 = 0
            L1e:
                int r0 = r3 + r4
                goto La
            L21:
                return r0
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000e\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$IteratorImpl;", "", "(Lkotlin/collections/AbstractList;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private class IteratorImpl implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMappedMarker {
        private int index;
        final /* synthetic */ kotlin.collections.AbstractList<E> this$0;

        public IteratorImpl(kotlin.collections.AbstractList r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        protected final int getIndex() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.index
                kotlin.collections.AbstractList<E> r1 = r2.this$0
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.Iterator
        public E next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L13
                kotlin.collections.AbstractList<E> r0 = r3.this$0
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                java.lang.Object r0 = r0.get(r1)
                return r0
            L13:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
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

        protected final void setIndex(int r1) {
                r0 = this;
                r0.index = r1
                return
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\r\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "index", "", "(Lkotlin/collections/AbstractList;I)V", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private class ListIteratorImpl extends kotlin.collections.AbstractList<E>.IteratorImpl implements java.util.ListIterator<E>, kotlin.jvm.internal.markers.KMappedMarker {
        final /* synthetic */ kotlin.collections.AbstractList<E> this$0;

        public ListIteratorImpl(kotlin.collections.AbstractList r3, int r4) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>(r3)
                kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
                kotlin.collections.AbstractList<E> r1 = r2.this$0
                int r1 = r1.size()
                r0.checkPositionIndex$kotlin_stdlib(r4, r1)
                r2.setIndex(r4)
                return
        }

        @Override // java.util.ListIterator
        public void add(E r3) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                int r0 = r1.getIndex()
                if (r0 <= 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                int r0 = r1.getIndex()
                return r0
        }

        @Override // java.util.ListIterator
        public E previous() {
                r2 = this;
                boolean r0 = r2.hasPrevious()
                if (r0 == 0) goto L1a
                kotlin.collections.AbstractList<E> r0 = r2.this$0
                int r1 = r2.getIndex()
                int r1 = r1 + (-1)
                r2.setIndex(r1)
                int r1 = r2.getIndex()
                java.lang.Object r0 = r0.get(r1)
                return r0
            L1a:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                int r0 = r1.getIndex()
                int r0 = r0 + (-1)
                return r0
        }

        @Override // java.util.ListIterator
        public void set(E r3) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0016\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0010R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlin/collections/AbstractList$SubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "fromIndex", "", "toIndex", "(Lkotlin/collections/AbstractList;II)V", "_size", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class SubList<E> extends kotlin.collections.AbstractList<E> implements java.util.RandomAccess {
        private int _size;
        private final int fromIndex;
        private final kotlin.collections.AbstractList<E> list;

        public SubList(kotlin.collections.AbstractList<? extends E> r4, int r5, int r6) {
                r3 = this;
                java.lang.String r0 = "list"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r3.<init>()
                r3.list = r4
                r3.fromIndex = r5
                kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
                int r1 = r3.fromIndex
                kotlin.collections.AbstractList<E> r2 = r3.list
                int r2 = r2.size()
                r0.checkRangeIndexes$kotlin_stdlib(r1, r6, r2)
                int r0 = r3.fromIndex
                int r0 = r6 - r0
                r3._size = r0
                return
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public E get(int r3) {
                r2 = this;
                kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
                int r1 = r2._size
                r0.checkElementIndex$kotlin_stdlib(r3, r1)
                kotlin.collections.AbstractList<E> r0 = r2.list
                int r1 = r2.fromIndex
                int r1 = r1 + r3
                java.lang.Object r0 = r0.get(r1)
                return r0
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
                r1 = this;
                int r0 = r1._size
                return r0
        }
    }

    static {
            kotlin.collections.AbstractList$Companion r0 = new kotlin.collections.AbstractList$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.AbstractList.Companion = r0
            return
    }

    protected AbstractList() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.List
    public void add(int r3, E r4) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List
    public boolean addAll(int r3, java.util.Collection<? extends E> r4) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r4 != r3) goto L4
            r0 = 1
            return r0
        L4:
            boolean r0 = r4 instanceof java.util.List
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            r1 = r3
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = r4
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r0 = r0.orderedEquals$kotlin_stdlib(r1, r2)
            return r0
    }

    @Override // java.util.List
    public abstract E get(int r1);

    @Override // kotlin.collections.AbstractCollection
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
            r2 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            r1 = r2
            java.util.Collection r1 = (java.util.Collection) r1
            int r0 = r0.orderedHashCode$kotlin_stdlib(r1)
            return r0
    }

    @Override // java.util.List
    public int indexOf(E r8) {
            r7 = this;
            r0 = r7
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            r2 = 0
            java.util.Iterator r3 = r0.iterator()
        L9:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L20
            java.lang.Object r4 = r3.next()
            r5 = r4
            r6 = 0
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r8)
            if (r5 == 0) goto L1c
            goto L22
        L1c:
            int r2 = r2 + 1
            goto L9
        L20:
            r3 = -1
            r2 = r3
        L22:
            return r2
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
            r1 = this;
            kotlin.collections.AbstractList$IteratorImpl r0 = new kotlin.collections.AbstractList$IteratorImpl
            r0.<init>(r1)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    @Override // java.util.List
    public int lastIndexOf(E r6) {
            r5 = this;
            r0 = r5
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            int r2 = r0.size()
            java.util.ListIterator r2 = r0.listIterator(r2)
        Lc:
            boolean r3 = r2.hasPrevious()
            if (r3 == 0) goto L22
            java.lang.Object r3 = r2.previous()
            r4 = 0
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r6)
            if (r3 == 0) goto Lc
            int r3 = r2.nextIndex()
            goto L23
        L22:
            r3 = -1
        L23:
            return r3
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator() {
            r2 = this;
            kotlin.collections.AbstractList$ListIteratorImpl r0 = new kotlin.collections.AbstractList$ListIteratorImpl
            r1 = 0
            r0.<init>(r2, r1)
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            return r0
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator(int r2) {
            r1 = this;
            kotlin.collections.AbstractList$ListIteratorImpl r0 = new kotlin.collections.AbstractList$ListIteratorImpl
            r0.<init>(r1, r2)
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            return r0
    }

    @Override // java.util.List
    public E remove(int r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List
    public E set(int r3, E r4) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List
    public java.util.List<E> subList(int r2, int r3) {
            r1 = this;
            kotlin.collections.AbstractList$SubList r0 = new kotlin.collections.AbstractList$SubList
            r0.<init>(r1, r2, r3)
            java.util.List r0 = (java.util.List) r0
            return r0
    }
}
