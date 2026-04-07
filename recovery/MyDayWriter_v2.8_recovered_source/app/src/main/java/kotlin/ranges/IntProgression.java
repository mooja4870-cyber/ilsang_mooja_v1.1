package kotlin.ranges;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class IntProgression implements java.lang.Iterable<java.lang.Integer>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final kotlin.ranges.IntProgression.Companion Companion = null;
    private final int first;
    private final int last;
    private final int step;

    /* JADX INFO: compiled from: Progressions.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lkotlin/ranges/IntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/IntProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        public final kotlin.ranges.IntProgression fromClosedRange(int r2, int r3, int r4) {
                r1 = this;
                kotlin.ranges.IntProgression r0 = new kotlin.ranges.IntProgression
                r0.<init>(r2, r3, r4)
                return r0
        }
    }

    static {
            kotlin.ranges.IntProgression$Companion r0 = new kotlin.ranges.IntProgression$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.IntProgression.Companion = r0
            return
    }

    public IntProgression(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            if (r5 == 0) goto L1e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r0) goto L16
        Lb:
            r2.first = r3
            int r0 = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(r3, r4, r5)
            r2.last = r0
            r2.step = r5
            return
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."
            r0.<init>(r1)
            throw r0
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Step must be non-zero."
            r0.<init>(r1)
            throw r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.IntProgression
            if (r0 == 0) goto L30
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            kotlin.ranges.IntProgression r0 = (kotlin.ranges.IntProgression) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2e
        L13:
            int r0 = r2.first
            r1 = r3
            kotlin.ranges.IntProgression r1 = (kotlin.ranges.IntProgression) r1
            int r1 = r1.first
            if (r0 != r1) goto L30
            int r0 = r2.last
            r1 = r3
            kotlin.ranges.IntProgression r1 = (kotlin.ranges.IntProgression) r1
            int r1 = r1.last
            if (r0 != r1) goto L30
            int r0 = r2.step
            r1 = r3
            kotlin.ranges.IntProgression r1 = (kotlin.ranges.IntProgression) r1
            int r1 = r1.step
            if (r0 != r1) goto L30
        L2e:
            r0 = 1
            goto L31
        L30:
            r0 = 0
        L31:
            return r0
    }

    public final int getFirst() {
            r1 = this;
            int r0 = r1.first
            return r0
    }

    public final int getLast() {
            r1 = this;
            int r0 = r1.last
            return r0
    }

    public final int getStep() {
            r1 = this;
            int r0 = r1.step
            return r0
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L14
        L8:
            int r0 = r2.first
            int r0 = r0 * 31
            int r1 = r2.last
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.step
            int r0 = r0 + r1
        L14:
            return r0
    }

    public boolean isEmpty() {
            r4 = this;
            int r0 = r4.step
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto Ld
            int r0 = r4.first
            int r3 = r4.last
            if (r0 <= r3) goto L14
            goto L13
        Ld:
            int r0 = r4.first
            int r3 = r4.last
            if (r0 >= r3) goto L14
        L13:
            goto L15
        L14:
            r1 = r2
        L15:
            return r1
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Integer> iterator() {
            r1 = this;
            kotlin.collections.IntIterator r0 = r1.iterator2()
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public java.util.Iterator<java.lang.Integer> iterator2() {
            r4 = this;
            kotlin.ranges.IntProgressionIterator r0 = new kotlin.ranges.IntProgressionIterator
            int r1 = r4.first
            int r2 = r4.last
            int r3 = r4.step
            r0.<init>(r1, r2, r3)
            kotlin.collections.IntIterator r0 = (kotlin.collections.IntIterator) r0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.step
            java.lang.String r1 = " step "
            if (r0 <= 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.first
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = ".."
            java.lang.StringBuilder r0 = r0.append(r2)
            int r2 = r3.last
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.step
            goto L42
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.first
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = " downTo "
            java.lang.StringBuilder r0 = r0.append(r2)
            int r2 = r3.last
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.step
            int r1 = -r1
        L42:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
