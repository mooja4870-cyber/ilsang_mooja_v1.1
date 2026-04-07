package kotlin.ranges;

/* JADX INFO: compiled from: UIntRange.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\n\u001a\u00020\u000bH\u0096\u0002J\u0013\u0010\f\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u00020\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u00020\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/UIntProgressionIterator;", "", "Lkotlin/UInt;", "first", "last", "step", "", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "finalElement", "I", "hasNext", "", "next", "next-pVg5ArA", "()I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class UIntProgressionIterator implements java.util.Iterator<kotlin.UInt>, kotlin.jvm.internal.markers.KMappedMarker {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    private UIntProgressionIterator(int r4, int r5, int r6) {
            r3 = this;
            r3.<init>()
            r3.finalElement = r5
            r0 = 1
            r1 = 0
            if (r6 <= 0) goto L10
            int r2 = kotlin.UByte$$ExternalSyntheticBackport4.m(r4, r5)
            if (r2 > 0) goto L17
            goto L16
        L10:
            int r2 = kotlin.UByte$$ExternalSyntheticBackport4.m(r4, r5)
            if (r2 < 0) goto L17
        L16:
            goto L18
        L17:
            r0 = r1
        L18:
            r3.hasNext = r0
            int r0 = kotlin.UInt.m248constructorimpl(r6)
            r3.step = r0
            boolean r0 = r3.hasNext
            if (r0 == 0) goto L26
            r0 = r4
            goto L28
        L26:
            int r0 = r3.finalElement
        L28:
            r3.next = r0
            return
    }

    public /* synthetic */ UIntProgressionIterator(int r1, int r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.hasNext
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ kotlin.UInt next() {
            r1 = this;
            int r0 = r1.m1379nextpVg5ArA()
            kotlin.UInt r0 = kotlin.UInt.m242boximpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: next-pVg5ArA, reason: not valid java name */
    public int m1379nextpVg5ArA() {
            r3 = this;
            int r0 = r3.next
            int r1 = r3.finalElement
            if (r0 != r1) goto L14
            boolean r1 = r3.hasNext
            if (r1 == 0) goto Le
            r1 = 0
            r3.hasNext = r1
            goto L1f
        Le:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        L14:
            int r1 = r3.next
            int r2 = r3.step
            int r1 = r1 + r2
            int r1 = kotlin.UInt.m248constructorimpl(r1)
            r3.next = r1
        L1f:
            return r0
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
