package androidx.collection;

/* JADX INFO: compiled from: CircularArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0016\u001a\u00020\u0012J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\u0016\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u000b\u0010\u001d\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\u000b\u0010\u001e\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0004R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\n\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Landroidx/collection/CircularArray;", "E", "", "minCapacity", "", "(I)V", "capacityBitmask", "elements", "", "[Ljava/lang/Object;", "first", "getFirst", "()Ljava/lang/Object;", "head", "last", "getLast", "tail", "addFirst", "", "element", "(Ljava/lang/Object;)V", "addLast", "clear", "doubleCapacity", "get", "index", "(I)Ljava/lang/Object;", "isEmpty", "", "popFirst", "popLast", "removeFromEnd", "count", "removeFromStart", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CircularArray<E> {
    private int capacityBitmask;
    private E[] elements;
    private int head;
    private int tail;

    public CircularArray() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public CircularArray(int r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r1 = 1
            if (r4 < r1) goto La
            r2 = r1
            goto Lb
        La:
            r2 = r0
        Lb:
            if (r2 == 0) goto L3c
            r2 = 1073741824(0x40000000, float:2.0)
            if (r4 > r2) goto L12
            r0 = r1
        L12:
            if (r0 == 0) goto L2e
            int r0 = java.lang.Integer.bitCount(r4)
            if (r0 == r1) goto L22
            int r0 = r4 + (-1)
            int r0 = java.lang.Integer.highestOneBit(r0)
            int r0 = r0 << r1
            goto L23
        L22:
            r0 = r4
        L23:
            int r1 = r0 + (-1)
            r3.capacityBitmask = r1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r3.elements = r1
            return
        L2e:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "capacity must be <= 2^30"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3c:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "capacity must be >= 1"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public /* synthetic */ CircularArray(int r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 8
        L6:
            r0.<init>(r1)
            return
    }

    private final void doubleCapacity() {
            r7 = this;
            E[] r0 = r7.elements
            int r0 = r0.length
            int r1 = r7.head
            int r1 = r0 - r1
            int r2 = r0 << 1
            if (r2 < 0) goto L27
            java.lang.Object[] r3 = new java.lang.Object[r2]
            E[] r4 = r7.elements
            int r5 = r7.head
            r6 = 0
            kotlin.collections.ArraysKt.copyInto(r4, r3, r6, r5, r0)
            E[] r4 = r7.elements
            int r5 = r7.head
            kotlin.collections.ArraysKt.copyInto(r4, r3, r1, r6, r5)
            r7.elements = r3
            r7.head = r6
            r7.tail = r0
            int r4 = r2 + (-1)
            r7.capacityBitmask = r4
            return
        L27:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Max array capacity exceeded"
            r3.<init>(r4)
            throw r3
    }

    public final void addFirst(E r3) {
            r2 = this;
            int r0 = r2.head
            int r0 = r0 + (-1)
            int r1 = r2.capacityBitmask
            r0 = r0 & r1
            r2.head = r0
            E[] r0 = r2.elements
            int r1 = r2.head
            r0[r1] = r3
            int r0 = r2.head
            int r1 = r2.tail
            if (r0 != r1) goto L18
            r2.doubleCapacity()
        L18:
            return
    }

    public final void addLast(E r3) {
            r2 = this;
            E[] r0 = r2.elements
            int r1 = r2.tail
            r0[r1] = r3
            int r0 = r2.tail
            int r0 = r0 + 1
            int r1 = r2.capacityBitmask
            r0 = r0 & r1
            r2.tail = r0
            int r0 = r2.tail
            int r1 = r2.head
            if (r0 != r1) goto L18
            r2.doubleCapacity()
        L18:
            return
    }

    public final void clear() {
            r1 = this;
            int r0 = r1.size()
            r1.removeFromStart(r0)
            return
    }

    public final E get(int r4) {
            r3 = this;
            if (r4 < 0) goto L16
            int r0 = r3.size()
            if (r4 >= r0) goto L16
            E[] r0 = r3.elements
            int r1 = r3.head
            int r1 = r1 + r4
            int r2 = r3.capacityBitmask
            r1 = r1 & r2
            r0 = r0[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
        L16:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            r1 = 0
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            java.lang.IndexOutOfBoundsException r2 = (java.lang.IndexOutOfBoundsException) r2
            throw r2
    }

    public final E getFirst() {
            r3 = this;
            int r0 = r3.head
            int r1 = r3.tail
            if (r0 == r1) goto L10
            E[] r0 = r3.elements
            int r1 = r3.head
            r0 = r0[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
        L10:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            r1 = 0
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            java.lang.IndexOutOfBoundsException r2 = (java.lang.IndexOutOfBoundsException) r2
            throw r2
    }

    public final E getLast() {
            r3 = this;
            int r0 = r3.head
            int r1 = r3.tail
            if (r0 == r1) goto L15
            E[] r0 = r3.elements
            int r1 = r3.tail
            int r1 = r1 + (-1)
            int r2 = r3.capacityBitmask
            r1 = r1 & r2
            r0 = r0[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
        L15:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            r1 = 0
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            java.lang.IndexOutOfBoundsException r2 = (java.lang.IndexOutOfBoundsException) r2
            throw r2
    }

    public final boolean isEmpty() {
            r2 = this;
            int r0 = r2.head
            int r1 = r2.tail
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final E popFirst() {
            r4 = this;
            int r0 = r4.head
            int r1 = r4.tail
            if (r0 == r1) goto L1d
            E[] r0 = r4.elements
            int r1 = r4.head
            r0 = r0[r1]
            E[] r1 = r4.elements
            int r2 = r4.head
            r3 = 0
            r1[r2] = r3
            int r1 = r4.head
            int r1 = r1 + 1
            int r2 = r4.capacityBitmask
            r1 = r1 & r2
            r4.head = r1
            return r0
        L1d:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            r1 = 0
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            java.lang.IndexOutOfBoundsException r2 = (java.lang.IndexOutOfBoundsException) r2
            throw r2
    }

    public final E popLast() {
            r4 = this;
            int r0 = r4.head
            int r1 = r4.tail
            if (r0 == r1) goto L19
            int r0 = r4.tail
            int r0 = r0 + (-1)
            int r1 = r4.capacityBitmask
            r0 = r0 & r1
            E[] r1 = r4.elements
            r1 = r1[r0]
            E[] r2 = r4.elements
            r3 = 0
            r2[r0] = r3
            r4.tail = r0
            return r1
        L19:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            r1 = 0
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            java.lang.IndexOutOfBoundsException r2 = (java.lang.IndexOutOfBoundsException) r2
            throw r2
    }

    public final void removeFromEnd(int r9) {
            r8 = this;
            if (r9 > 0) goto L3
            return
        L3:
            int r0 = r8.size()
            if (r9 > r0) goto L42
            r0 = r9
            r1 = 0
            int r2 = r8.tail
            if (r0 >= r2) goto L13
            int r2 = r8.tail
            int r1 = r2 - r0
        L13:
            r2 = r1
            int r3 = r8.tail
        L16:
            r4 = 0
            if (r2 >= r3) goto L20
            E[] r5 = r8.elements
            r5[r2] = r4
            int r2 = r2 + 1
            goto L16
        L20:
            int r2 = r8.tail
            int r2 = r2 - r1
            int r0 = r0 - r2
            int r3 = r8.tail
            int r3 = r3 - r2
            r8.tail = r3
            if (r0 <= 0) goto L41
            E[] r3 = r8.elements
            int r3 = r3.length
            r8.tail = r3
            int r3 = r8.tail
            int r3 = r3 - r0
            r5 = r3
            int r6 = r8.tail
        L36:
            if (r5 >= r6) goto L3f
            E[] r7 = r8.elements
            r7[r5] = r4
            int r5 = r5 + 1
            goto L36
        L3f:
            r8.tail = r3
        L41:
            return
        L42:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            r1 = 0
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            java.lang.IndexOutOfBoundsException r2 = (java.lang.IndexOutOfBoundsException) r2
            throw r2
    }

    public final void removeFromStart(int r7) {
            r6 = this;
            if (r7 > 0) goto L3
            return
        L3:
            int r0 = r6.size()
            if (r7 > r0) goto L3f
            r0 = r7
            E[] r1 = r6.elements
            int r1 = r1.length
            int r2 = r6.head
            int r2 = r1 - r2
            if (r0 >= r2) goto L17
            int r2 = r6.head
            int r1 = r2 + r0
        L17:
            int r2 = r6.head
        L19:
            r3 = 0
            if (r2 >= r1) goto L23
            E[] r4 = r6.elements
            r4[r2] = r3
            int r2 = r2 + 1
            goto L19
        L23:
            int r2 = r6.head
            int r2 = r1 - r2
            int r0 = r0 - r2
            int r4 = r6.head
            int r4 = r4 + r2
            int r5 = r6.capacityBitmask
            r4 = r4 & r5
            r6.head = r4
            if (r0 <= 0) goto L3e
            r4 = 0
        L33:
            if (r4 >= r0) goto L3c
            E[] r5 = r6.elements
            r5[r4] = r3
            int r4 = r4 + 1
            goto L33
        L3c:
            r6.head = r0
        L3e:
            return
        L3f:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            r1 = 0
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            java.lang.IndexOutOfBoundsException r2 = (java.lang.IndexOutOfBoundsException) r2
            throw r2
    }

    public final int size() {
            r2 = this;
            int r0 = r2.tail
            int r1 = r2.head
            int r0 = r0 - r1
            int r1 = r2.capacityBitmask
            r0 = r0 & r1
            return r0
    }
}
