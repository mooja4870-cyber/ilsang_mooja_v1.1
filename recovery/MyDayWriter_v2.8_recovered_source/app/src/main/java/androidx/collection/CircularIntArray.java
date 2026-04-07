package androidx.collection;

/* JADX INFO: compiled from: CircularIntArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003J\u0006\u0010\u0013\u001a\u00020\u0010J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0011\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0086\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0003J\u0006\u0010\u001a\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0003J\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0003J\u0006\u0010\u001e\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/collection/CircularIntArray;", "", "minCapacity", "", "(I)V", "capacityBitmask", "elements", "", "first", "getFirst", "()I", "head", "last", "getLast", "tail", "addFirst", "", "element", "addLast", "clear", "doubleCapacity", "get", "index", "isEmpty", "", "popFirst", "popLast", "removeFromEnd", "count", "removeFromStart", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CircularIntArray {
    private int capacityBitmask;
    private int[] elements;
    private int head;
    private int tail;

    public CircularIntArray() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public CircularIntArray(int r4) {
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
            int[] r1 = new int[r0]
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

    public /* synthetic */ CircularIntArray(int r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
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
            int[] r0 = r7.elements
            int r0 = r0.length
            int r1 = r7.head
            int r1 = r0 - r1
            int r2 = r0 << 1
            if (r2 < 0) goto L27
            int[] r3 = new int[r2]
            int[] r4 = r7.elements
            int r5 = r7.head
            r6 = 0
            kotlin.collections.ArraysKt.copyInto(r4, r3, r6, r5, r0)
            int[] r4 = r7.elements
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

    public final void addFirst(int r3) {
            r2 = this;
            int r0 = r2.head
            int r0 = r0 + (-1)
            int r1 = r2.capacityBitmask
            r0 = r0 & r1
            r2.head = r0
            int[] r0 = r2.elements
            int r1 = r2.head
            r0[r1] = r3
            int r0 = r2.head
            int r1 = r2.tail
            if (r0 != r1) goto L18
            r2.doubleCapacity()
        L18:
            return
    }

    public final void addLast(int r3) {
            r2 = this;
            int[] r0 = r2.elements
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
            int r0 = r1.head
            r1.tail = r0
            return
    }

    public final int get(int r4) {
            r3 = this;
            if (r4 < 0) goto L13
            int r0 = r3.size()
            if (r4 >= r0) goto L13
            int[] r0 = r3.elements
            int r1 = r3.head
            int r1 = r1 + r4
            int r2 = r3.capacityBitmask
            r1 = r1 & r2
            r0 = r0[r1]
            return r0
        L13:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            r1 = 0
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            java.lang.IndexOutOfBoundsException r2 = (java.lang.IndexOutOfBoundsException) r2
            throw r2
    }

    public final int getFirst() {
            r3 = this;
            int r0 = r3.head
            int r1 = r3.tail
            if (r0 == r1) goto Ld
            int[] r0 = r3.elements
            int r1 = r3.head
            r0 = r0[r1]
            return r0
        Ld:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            r1 = 0
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            java.lang.IndexOutOfBoundsException r2 = (java.lang.IndexOutOfBoundsException) r2
            throw r2
    }

    public final int getLast() {
            r3 = this;
            int r0 = r3.head
            int r1 = r3.tail
            if (r0 == r1) goto L12
            int[] r0 = r3.elements
            int r1 = r3.tail
            int r1 = r1 + (-1)
            int r2 = r3.capacityBitmask
            r1 = r1 & r2
            r0 = r0[r1]
            return r0
        L12:
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

    public final int popFirst() {
            r3 = this;
            int r0 = r3.head
            int r1 = r3.tail
            if (r0 == r1) goto L16
            int[] r0 = r3.elements
            int r1 = r3.head
            r0 = r0[r1]
            int r1 = r3.head
            int r1 = r1 + 1
            int r2 = r3.capacityBitmask
            r1 = r1 & r2
            r3.head = r1
            return r0
        L16:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            r1 = 0
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            java.lang.IndexOutOfBoundsException r2 = (java.lang.IndexOutOfBoundsException) r2
            throw r2
    }

    public final int popLast() {
            r3 = this;
            int r0 = r3.head
            int r1 = r3.tail
            if (r0 == r1) goto L14
            int r0 = r3.tail
            int r0 = r0 + (-1)
            int r1 = r3.capacityBitmask
            r0 = r0 & r1
            int[] r1 = r3.elements
            r1 = r1[r0]
            r3.tail = r0
            return r1
        L14:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            r1 = 0
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            java.lang.IndexOutOfBoundsException r2 = (java.lang.IndexOutOfBoundsException) r2
            throw r2
    }

    public final void removeFromEnd(int r4) {
            r3 = this;
            if (r4 > 0) goto L3
            return
        L3:
            int r0 = r3.size()
            if (r4 > r0) goto L12
            int r0 = r3.tail
            int r0 = r0 - r4
            int r1 = r3.capacityBitmask
            r0 = r0 & r1
            r3.tail = r0
            return
        L12:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            r1 = 0
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            java.lang.IndexOutOfBoundsException r2 = (java.lang.IndexOutOfBoundsException) r2
            throw r2
    }

    public final void removeFromStart(int r4) {
            r3 = this;
            if (r4 > 0) goto L3
            return
        L3:
            int r0 = r3.size()
            if (r4 > r0) goto L12
            int r0 = r3.head
            int r0 = r0 + r4
            int r1 = r3.capacityBitmask
            r0 = r0 & r1
            r3.head = r0
            return
        L12:
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
