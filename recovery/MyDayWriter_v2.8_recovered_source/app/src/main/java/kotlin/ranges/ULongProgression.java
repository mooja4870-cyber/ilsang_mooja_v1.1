package kotlin.ranges;

/* JADX INFO: compiled from: ULongRange.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0086\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\b\u001a\u00020\u0002ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001b"}, d2 = {"Lkotlin/ranges/ULongProgression;", "", "Lkotlin/ULong;", "start", "endInclusive", "step", "", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "first", "getFirst-s-VKNKU", "()J", "J", "last", "getLast-s-VKNKU", "getStep", "equals", "", "other", "", "hashCode", "", "isEmpty", "iterator", "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class ULongProgression implements java.lang.Iterable<kotlin.ULong>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final kotlin.ranges.ULongProgression.Companion Companion = null;
    private final long first;
    private final long last;
    private final long step;

    /* JADX INFO: compiled from: ULongRange.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/ranges/ULongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/ULongProgression;", "rangeStart", "Lkotlin/ULong;", "rangeEnd", "step", "", "fromClosedRange-7ftBX0g", "(JJJ)Lkotlin/ranges/ULongProgression;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* JADX INFO: renamed from: fromClosedRange-7ftBX0g, reason: not valid java name */
        public final kotlin.ranges.ULongProgression m1387fromClosedRange7ftBX0g(long r9, long r11, long r13) {
                r8 = this;
                kotlin.ranges.ULongProgression r0 = new kotlin.ranges.ULongProgression
                r7 = 0
                r1 = r9
                r3 = r11
                r5 = r13
                r0.<init>(r1, r3, r5, r7)
                return r0
        }
    }

    static {
            kotlin.ranges.ULongProgression$Companion r0 = new kotlin.ranges.ULongProgression$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.ULongProgression.Companion = r0
            return
    }

    private ULongProgression(long r3, long r5, long r7) {
            r2 = this;
            r2.<init>()
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L24
            r0 = -9223372036854775808
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L1c
        L11:
            r2.first = r3
            long r0 = kotlin.internal.UProgressionUtilKt.m1361getProgressionLastElement7ftBX0g(r3, r5, r7)
            r2.last = r0
            r2.step = r7
            return
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Step must be greater than Long.MIN_VALUE to avoid overflow on negation."
            r0.<init>(r1)
            throw r0
        L24:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Step must be non-zero."
            r0.<init>(r1)
            throw r0
    }

    public /* synthetic */ ULongProgression(long r1, long r3, long r5, kotlin.jvm.internal.DefaultConstructorMarker r7) {
            r0 = this;
            r0.<init>(r1, r3, r5)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof kotlin.ranges.ULongProgression
            if (r0 == 0) goto L36
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L13
            r0 = r5
            kotlin.ranges.ULongProgression r0 = (kotlin.ranges.ULongProgression) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L34
        L13:
            long r0 = r4.first
            r2 = r5
            kotlin.ranges.ULongProgression r2 = (kotlin.ranges.ULongProgression) r2
            long r2 = r2.first
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L36
            long r0 = r4.last
            r2 = r5
            kotlin.ranges.ULongProgression r2 = (kotlin.ranges.ULongProgression) r2
            long r2 = r2.last
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L36
            long r0 = r4.step
            r2 = r5
            kotlin.ranges.ULongProgression r2 = (kotlin.ranges.ULongProgression) r2
            long r2 = r2.step
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L36
        L34:
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            return r0
    }

    /* JADX INFO: renamed from: getFirst-s-VKNKU, reason: not valid java name */
    public final long m1385getFirstsVKNKU() {
            r2 = this;
            long r0 = r2.first
            return r0
    }

    /* JADX INFO: renamed from: getLast-s-VKNKU, reason: not valid java name */
    public final long m1386getLastsVKNKU() {
            r2 = this;
            long r0 = r2.last
            return r0
    }

    public final long getStep() {
            r2 = this;
            long r0 = r2.step
            return r0
    }

    public int hashCode() {
            r7 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L36
        L8:
            long r0 = r7.first
            long r2 = r7.first
            r4 = 32
            long r2 = r2 >>> r4
            long r2 = kotlin.ULong.m327constructorimpl(r2)
            long r0 = r0 ^ r2
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            int r0 = (int) r0
            int r0 = r0 * 31
            long r1 = r7.last
            long r5 = r7.last
            long r5 = r5 >>> r4
            long r5 = kotlin.ULong.m327constructorimpl(r5)
            long r1 = r1 ^ r5
            long r1 = kotlin.ULong.m327constructorimpl(r1)
            int r1 = (int) r1
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r7.step
            long r5 = r7.step
            long r3 = r5 >>> r4
            long r1 = r1 ^ r3
            int r1 = (int) r1
            int r0 = r0 + r1
        L36:
            return r0
    }

    public boolean isEmpty() {
            r7 = this;
            long r0 = r7.step
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r2 = 0
            long r3 = r7.first
            long r5 = r7.last
            if (r0 <= 0) goto L15
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r3, r5)
            if (r0 <= 0) goto L1c
            goto L1b
        L15:
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r3, r5)
            if (r0 >= 0) goto L1c
        L1b:
            goto L1d
        L1c:
            r1 = r2
        L1d:
            return r1
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<kotlin.ULong> iterator() {
            r8 = this;
            kotlin.ranges.ULongProgressionIterator r0 = new kotlin.ranges.ULongProgressionIterator
            long r1 = r8.first
            long r3 = r8.last
            long r5 = r8.step
            r7 = 0
            r0.<init>(r1, r3, r5, r7)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            long r0 = r4.step
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.lang.String r1 = " step "
            if (r0 <= 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r2 = r4.first
            java.lang.String r2 = kotlin.ULong.m373toStringimpl(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = ".."
            java.lang.StringBuilder r0 = r0.append(r2)
            long r2 = r4.last
            java.lang.String r2 = kotlin.ULong.m373toStringimpl(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r4.step
            goto L56
        L30:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r2 = r4.first
            java.lang.String r2 = kotlin.ULong.m373toStringimpl(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = " downTo "
            java.lang.StringBuilder r0 = r0.append(r2)
            long r2 = r4.last
            java.lang.String r2 = kotlin.ULong.m373toStringimpl(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r4.step
            long r1 = -r1
        L56:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
