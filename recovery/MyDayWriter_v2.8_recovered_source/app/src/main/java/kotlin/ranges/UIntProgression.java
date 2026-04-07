package kotlin.ranges;

/* JADX INFO: compiled from: UIntRange.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0086\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0016\u0010\b\u001a\u00020\u0002ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lkotlin/ranges/UIntProgression;", "", "Lkotlin/UInt;", "start", "endInclusive", "step", "", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "first", "getFirst-pVg5ArA", "()I", "I", "last", "getLast-pVg5ArA", "getStep", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class UIntProgression implements java.lang.Iterable<kotlin.UInt>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final kotlin.ranges.UIntProgression.Companion Companion = null;
    private final int first;
    private final int last;
    private final int step;

    /* JADX INFO: compiled from: UIntRange.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/ranges/UIntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/UIntProgression;", "rangeStart", "Lkotlin/UInt;", "rangeEnd", "step", "", "fromClosedRange-Nkh28Cs", "(III)Lkotlin/ranges/UIntProgression;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* JADX INFO: renamed from: fromClosedRange-Nkh28Cs, reason: not valid java name */
        public final kotlin.ranges.UIntProgression m1378fromClosedRangeNkh28Cs(int r3, int r4, int r5) {
                r2 = this;
                kotlin.ranges.UIntProgression r0 = new kotlin.ranges.UIntProgression
                r1 = 0
                r0.<init>(r3, r4, r5, r1)
                return r0
        }
    }

    static {
            kotlin.ranges.UIntProgression$Companion r0 = new kotlin.ranges.UIntProgression$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.UIntProgression.Companion = r0
            return
    }

    private UIntProgression(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            if (r5 == 0) goto L1e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r0) goto L16
        Lb:
            r2.first = r3
            int r0 = kotlin.internal.UProgressionUtilKt.m1362getProgressionLastElementNkh28Cs(r3, r4, r5)
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

    public /* synthetic */ UIntProgression(int r1, int r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.UIntProgression
            if (r0 == 0) goto L30
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            kotlin.ranges.UIntProgression r0 = (kotlin.ranges.UIntProgression) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2e
        L13:
            int r0 = r2.first
            r1 = r3
            kotlin.ranges.UIntProgression r1 = (kotlin.ranges.UIntProgression) r1
            int r1 = r1.first
            if (r0 != r1) goto L30
            int r0 = r2.last
            r1 = r3
            kotlin.ranges.UIntProgression r1 = (kotlin.ranges.UIntProgression) r1
            int r1 = r1.last
            if (r0 != r1) goto L30
            int r0 = r2.step
            r1 = r3
            kotlin.ranges.UIntProgression r1 = (kotlin.ranges.UIntProgression) r1
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

    /* JADX INFO: renamed from: getFirst-pVg5ArA, reason: not valid java name */
    public final int m1376getFirstpVg5ArA() {
            r1 = this;
            int r0 = r1.first
            return r0
    }

    /* JADX INFO: renamed from: getLast-pVg5ArA, reason: not valid java name */
    public final int m1377getLastpVg5ArA() {
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
            if (r0 <= 0) goto L11
            int r0 = r4.first
            int r3 = r4.last
            int r0 = kotlin.UByte$$ExternalSyntheticBackport4.m(r0, r3)
            if (r0 <= 0) goto L1c
            goto L1b
        L11:
            int r0 = r4.first
            int r3 = r4.last
            int r0 = kotlin.UByte$$ExternalSyntheticBackport4.m(r0, r3)
            if (r0 >= 0) goto L1c
        L1b:
            goto L1d
        L1c:
            r1 = r2
        L1d:
            return r1
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<kotlin.UInt> iterator() {
            r5 = this;
            kotlin.ranges.UIntProgressionIterator r0 = new kotlin.ranges.UIntProgressionIterator
            int r1 = r5.first
            int r2 = r5.last
            int r3 = r5.step
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.step
            java.lang.String r1 = " step "
            if (r0 <= 0) goto L2c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.first
            java.lang.String r2 = kotlin.UInt.m294toStringimpl(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = ".."
            java.lang.StringBuilder r0 = r0.append(r2)
            int r2 = r3.last
            java.lang.String r2 = kotlin.UInt.m294toStringimpl(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.step
            goto L52
        L2c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.first
            java.lang.String r2 = kotlin.UInt.m294toStringimpl(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = " downTo "
            java.lang.StringBuilder r0 = r0.append(r2)
            int r2 = r3.last
            java.lang.String r2 = kotlin.UInt.m294toStringimpl(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.step
            int r1 = -r1
        L52:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
