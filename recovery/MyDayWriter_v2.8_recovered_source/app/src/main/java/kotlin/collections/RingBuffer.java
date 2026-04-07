package kotlin.collections;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001d\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\u0013\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0006J\u0016\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0096\u0002J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0006J\u0015\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0014¢\u0006\u0002\u0010#J'\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0001\u0010\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00010\tH\u0014¢\u0006\u0002\u0010%J\u0015\u0010&\u001a\u00020\u0006*\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0082\bR\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "capacity", "", "(I)V", "buffer", "", "", "filledSize", "([Ljava/lang/Object;I)V", "[Ljava/lang/Object;", "<set-?>", "size", "getSize", "()I", "startIndex", "add", "", "element", "(Ljava/lang/Object;)V", "expanded", "maxCapacity", "get", "index", "(I)Ljava/lang/Object;", "isFull", "", "iterator", "", "removeFirst", "n", "toArray", "()[Ljava/lang/Object;", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "forward", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class RingBuffer<T> extends kotlin.collections.AbstractList<T> implements java.util.RandomAccess {
    private final java.lang.Object[] buffer;
    private final int capacity;
    private int size;
    private int startIndex;


    public RingBuffer(int r3) {
            r2 = this;
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public RingBuffer(java.lang.Object[] r4, int r5) {
            r3 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.<init>()
            r3.buffer = r4
            r0 = 1
            r1 = 0
            if (r5 < 0) goto L11
            r2 = r0
            goto L12
        L11:
            r2 = r1
        L12:
            if (r2 == 0) goto L51
            java.lang.Object[] r2 = r3.buffer
            int r2 = r2.length
            if (r5 > r2) goto L1a
            goto L1b
        L1a:
            r0 = r1
        L1b:
            if (r0 == 0) goto L26
        L1e:
            java.lang.Object[] r0 = r3.buffer
            int r0 = r0.length
            r3.capacity = r0
            r3.size = r5
            return
        L26:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ring buffer filled size: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = " cannot be larger than the buffer size: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Object[] r2 = r3.buffer
            int r2 = r2.length
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L51:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ring buffer filled size should not be negative but it is "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final /* synthetic */ java.lang.Object[] access$getBuffer$p(kotlin.collections.RingBuffer r1) {
            java.lang.Object[] r0 = r1.buffer
            return r0
    }

    public static final /* synthetic */ int access$getCapacity$p(kotlin.collections.RingBuffer r1) {
            int r0 = r1.capacity
            return r0
    }

    public static final /* synthetic */ int access$getStartIndex$p(kotlin.collections.RingBuffer r1) {
            int r0 = r1.startIndex
            return r0
    }

    private final int forward(int r4, int r5) {
            r3 = this;
            r0 = 0
            int r1 = r4 + r5
            int r2 = access$getCapacity$p(r3)
            int r1 = r1 % r2
            return r1
    }

    @Override // java.util.Collection, java.util.List
    public final void add(T r8) {
            r7 = this;
            boolean r0 = r7.isFull()
            if (r0 != 0) goto L22
            java.lang.Object[] r0 = r7.buffer
            int r1 = r7.startIndex
            int r2 = r7.size()
            r3 = r7
            r4 = 0
            int r5 = r1 + r2
            int r6 = access$getCapacity$p(r3)
            int r5 = r5 % r6
            r0[r5] = r8
            int r0 = r7.size()
            int r0 = r0 + 1
            r7.size = r0
            return
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ring buffer is full"
            r0.<init>(r1)
            throw r0
    }

    public final kotlin.collections.RingBuffer<T> expanded(int r5) {
            r4 = this;
            int r0 = r4.capacity
            int r1 = r4.capacity
            int r1 = r1 >> 1
            int r0 = r0 + r1
            int r0 = r0 + 1
            int r0 = kotlin.ranges.RangesKt.coerceAtMost(r0, r5)
            int r1 = r4.startIndex
            if (r1 != 0) goto L1d
            java.lang.Object[] r1 = r4.buffer
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            goto L23
        L1d:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object[] r1 = r4.toArray(r1)
        L23:
            kotlin.collections.RingBuffer r2 = new kotlin.collections.RingBuffer
            int r3 = r4.size()
            r2.<init>(r1, r3)
            return r2
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int r7) {
            r6 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r6.size()
            r0.checkElementIndex$kotlin_stdlib(r7, r1)
            java.lang.Object[] r0 = r6.buffer
            int r1 = r6.startIndex
            r2 = r6
            r3 = 0
            int r4 = r1 + r7
            int r5 = access$getCapacity$p(r2)
            int r4 = r4 % r5
            r0 = r0[r4]
            return r0
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    public final boolean isFull() {
            r2 = this;
            int r0 = r2.size()
            int r1 = r2.capacity
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r1 = this;
            kotlin.collections.RingBuffer$iterator$1 r0 = new kotlin.collections.RingBuffer$iterator$1
            r0.<init>(r1)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    public final void removeFirst(int r8) {
            r7 = this;
            r0 = 1
            r1 = 0
            if (r8 < 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            if (r2 == 0) goto L6d
            int r2 = r7.size()
            if (r8 > r2) goto L10
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 == 0) goto L41
            if (r8 <= 0) goto L40
            int r0 = r7.startIndex
            r2 = r0
            r3 = r7
            r4 = 0
            int r5 = r2 + r8
            int r6 = access$getCapacity$p(r3)
            int r5 = r5 % r6
            r2 = 0
            if (r0 <= r5) goto L32
            java.lang.Object[] r3 = r7.buffer
            int r4 = r7.capacity
            kotlin.collections.ArraysKt.fill(r3, r2, r0, r4)
            java.lang.Object[] r3 = r7.buffer
            kotlin.collections.ArraysKt.fill(r3, r2, r1, r5)
            goto L37
        L32:
            java.lang.Object[] r1 = r7.buffer
            kotlin.collections.ArraysKt.fill(r1, r2, r0, r5)
        L37:
            r7.startIndex = r5
            int r1 = r7.size()
            int r1 = r1 - r8
            r7.size = r1
        L40:
            return
        L41:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "n shouldn't be greater than the buffer size: n = "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r2 = ", size = "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r7.size()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L6d:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "n shouldn't be negative but it is "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.size()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] r6) {
            r5 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.length
            int r1 = r5.size()
            if (r0 >= r1) goto L1a
            int r0 = r5.size()
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r6, r0)
            java.lang.String r1 = "copyOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L1b
        L1a:
            r0 = r6
        L1b:
            int r1 = r5.size()
            r2 = 0
            int r3 = r5.startIndex
        L23:
            if (r2 >= r1) goto L34
            int r4 = r5.capacity
            if (r3 >= r4) goto L34
            java.lang.Object[] r4 = r5.buffer
            r4 = r4[r3]
            r0[r2] = r4
            int r2 = r2 + 1
            int r3 = r3 + 1
            goto L23
        L34:
            r3 = 0
        L35:
            if (r2 >= r1) goto L42
            java.lang.Object[] r4 = r5.buffer
            r4 = r4[r3]
            r0[r2] = r4
            int r2 = r2 + 1
            int r3 = r3 + 1
            goto L35
        L42:
            java.lang.Object[] r4 = kotlin.collections.CollectionsKt.terminateCollectionToArray(r1, r0)
            return r4
    }
}
