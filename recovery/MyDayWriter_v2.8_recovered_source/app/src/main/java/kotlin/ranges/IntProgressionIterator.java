package kotlin.ranges;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "first", "", "last", "step", "(III)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextInt", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IntProgressionIterator extends kotlin.collections.IntIterator {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    public IntProgressionIterator(int r4, int r5, int r6) {
            r3 = this;
            r3.<init>()
            r3.step = r6
            r3.finalElement = r5
            int r0 = r3.step
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L10
            if (r4 > r5) goto L13
            goto L12
        L10:
            if (r4 < r5) goto L13
        L12:
            goto L14
        L13:
            r1 = r2
        L14:
            r3.hasNext = r1
            boolean r0 = r3.hasNext
            if (r0 == 0) goto L1c
            r0 = r4
            goto L1e
        L1c:
            int r0 = r3.finalElement
        L1e:
            r3.next = r0
            return
    }

    public final int getStep() {
            r1 = this;
            int r0 = r1.step
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.hasNext
            return r0
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
            r3 = this;
            int r0 = r3.next
            int r1 = r3.finalElement
            if (r0 != r1) goto L14
            boolean r1 = r3.hasNext
            if (r1 == 0) goto Le
            r1 = 0
            r3.hasNext = r1
            goto L1b
        Le:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        L14:
            int r1 = r3.next
            int r2 = r3.step
            int r1 = r1 + r2
            r3.next = r1
        L1b:
            return r0
    }
}
