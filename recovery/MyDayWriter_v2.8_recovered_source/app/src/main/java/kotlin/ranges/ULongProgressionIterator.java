package kotlin.ranges;

/* JADX INFO: compiled from: ULongRange.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\n\u001a\u00020\u000bH\u0096\u0002J\u0013\u0010\f\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u00020\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u00020\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/ULongProgressionIterator;", "", "Lkotlin/ULong;", "first", "last", "step", "", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "finalElement", "J", "hasNext", "", "next", "next-s-VKNKU", "()J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ULongProgressionIterator implements java.util.Iterator<kotlin.ULong>, kotlin.jvm.internal.markers.KMappedMarker {
    private final long finalElement;
    private boolean hasNext;
    private long next;
    private final long step;

    private ULongProgressionIterator(long r4, long r6, long r8) {
            r3 = this;
            r3.<init>()
            r3.finalElement = r6
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L14
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r4, r6)
            if (r0 > 0) goto L1b
            goto L1a
        L14:
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r4, r6)
            if (r0 < 0) goto L1b
        L1a:
            goto L1c
        L1b:
            r1 = r2
        L1c:
            r3.hasNext = r1
            long r0 = kotlin.ULong.m327constructorimpl(r8)
            r3.step = r0
            boolean r0 = r3.hasNext
            if (r0 == 0) goto L2a
            r0 = r4
            goto L2c
        L2a:
            long r0 = r3.finalElement
        L2c:
            r3.next = r0
            return
    }

    public /* synthetic */ ULongProgressionIterator(long r1, long r3, long r5, kotlin.jvm.internal.DefaultConstructorMarker r7) {
            r0 = this;
            r0.<init>(r1, r3, r5)
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.hasNext
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ kotlin.ULong next() {
            r2 = this;
            long r0 = r2.m1388nextsVKNKU()
            kotlin.ULong r0 = kotlin.ULong.m321boximpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: next-s-VKNKU, reason: not valid java name */
    public long m1388nextsVKNKU() {
            r6 = this;
            long r0 = r6.next
            long r2 = r6.finalElement
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L16
            boolean r2 = r6.hasNext
            if (r2 == 0) goto L10
            r2 = 0
            r6.hasNext = r2
            goto L21
        L10:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
        L16:
            long r2 = r6.next
            long r4 = r6.step
            long r2 = r2 + r4
            long r2 = kotlin.ULong.m327constructorimpl(r2)
            r6.next = r2
        L21:
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
