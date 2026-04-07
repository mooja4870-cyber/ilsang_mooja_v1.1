package kotlin.ranges;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "first", "", "last", "step", "(JJJ)V", "finalElement", "hasNext", "", "next", "getStep", "()J", "nextLong", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LongProgressionIterator extends kotlin.collections.LongIterator {
    private final long finalElement;
    private boolean hasNext;
    private long next;
    private final long step;

    public LongProgressionIterator(long r5, long r7, long r9) {
            r4 = this;
            r4.<init>()
            r4.step = r9
            r4.finalElement = r7
            long r0 = r4.step
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L16
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L1b
            goto L1a
        L16:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L1b
        L1a:
            goto L1c
        L1b:
            r1 = r2
        L1c:
            r4.hasNext = r1
            boolean r0 = r4.hasNext
            if (r0 == 0) goto L24
            r0 = r5
            goto L26
        L24:
            long r0 = r4.finalElement
        L26:
            r4.next = r0
            return
    }

    public final long getStep() {
            r2 = this;
            long r0 = r2.step
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.hasNext
            return r0
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
            r6 = this;
            long r0 = r6.next
            long r2 = r6.finalElement
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L16
            boolean r2 = r6.hasNext
            if (r2 == 0) goto L10
            r2 = 0
            r6.hasNext = r2
            goto L1d
        L10:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
        L16:
            long r2 = r6.next
            long r4 = r6.step
            long r2 = r2 + r4
            r6.next = r2
        L1d:
            return r0
    }
}
