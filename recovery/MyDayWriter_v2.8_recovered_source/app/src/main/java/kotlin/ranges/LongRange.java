package kotlin.ranges;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001aB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002J\u0013\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001a\u0010\b\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lkotlin/ranges/LongRange;", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "(JJ)V", "endExclusive", "getEndExclusive$annotations", "()V", "getEndExclusive", "()Ljava/lang/Long;", "getEndInclusive", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LongRange extends kotlin.ranges.LongProgression implements kotlin.ranges.ClosedRange<java.lang.Long>, kotlin.ranges.OpenEndRange<java.lang.Long> {
    public static final kotlin.ranges.LongRange.Companion Companion = null;
    private static final kotlin.ranges.LongRange EMPTY = null;

    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/LongRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/LongRange;", "getEMPTY", "()Lkotlin/ranges/LongRange;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        public final kotlin.ranges.LongRange getEMPTY() {
                r1 = this;
                kotlin.ranges.LongRange r0 = kotlin.ranges.LongRange.access$getEMPTY$cp()
                return r0
        }
    }

    static {
            kotlin.ranges.LongRange$Companion r0 = new kotlin.ranges.LongRange$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.LongRange.Companion = r0
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = 1
            r3 = 0
            r0.<init>(r1, r3)
            kotlin.ranges.LongRange.EMPTY = r0
            return
    }

    public LongRange(long r8, long r10) {
            r7 = this;
            r5 = 1
            r0 = r7
            r1 = r8
            r3 = r10
            r0.<init>(r1, r3, r5)
            return
    }

    public static final /* synthetic */ kotlin.ranges.LongRange access$getEMPTY$cp() {
            kotlin.ranges.LongRange r0 = kotlin.ranges.LongRange.EMPTY
            return r0
    }

    @kotlin.Deprecated(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void getEndExclusive$annotations() {
            return
    }

    public boolean contains(long r3) {
            r2 = this;
            long r0 = r2.getFirst()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L12
            long r0 = r2.getLast()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable r3) {
            r2 = this;
            r0 = r3
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            boolean r0 = r2.contains(r0)
            return r0
    }

    @Override // kotlin.ranges.LongProgression
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof kotlin.ranges.LongRange
            if (r0 == 0) goto L33
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L13
            r0 = r5
            kotlin.ranges.LongRange r0 = (kotlin.ranges.LongRange) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L31
        L13:
            long r0 = r4.getFirst()
            r2 = r5
            kotlin.ranges.LongRange r2 = (kotlin.ranges.LongRange) r2
            long r2 = r2.getFirst()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L33
            long r0 = r4.getLast()
            r2 = r5
            kotlin.ranges.LongRange r2 = (kotlin.ranges.LongRange) r2
            long r2 = r2.getLast()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L33
        L31:
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            return r0
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getEndExclusive() {
            r1 = this;
            java.lang.Long r0 = r1.getEndExclusive()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            return r0
    }

    @Override // kotlin.ranges.OpenEndRange
    public java.lang.Long getEndExclusive() {
            r4 = this;
            long r0 = r4.getLast()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L19
            long r0 = r4.getLast()
            r2 = 1
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot return the exclusive upper bound of a range that includes MAX_VALUE."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getEndInclusive() {
            r1 = this;
            java.lang.Long r0 = r1.getEndInclusive()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public java.lang.Long getEndInclusive() {
            r2 = this;
            long r0 = r2.getLast()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getStart() {
            r1 = this;
            java.lang.Long r0 = r1.getStart()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public java.lang.Long getStart() {
            r2 = this;
            long r0 = r2.getFirst()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    @Override // kotlin.ranges.LongProgression
    public int hashCode() {
            r7 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L24
        L8:
            r0 = 31
            long r0 = (long) r0
            long r2 = r7.getFirst()
            long r4 = r7.getFirst()
            r6 = 32
            long r4 = r4 >>> r6
            long r2 = r2 ^ r4
            long r0 = r0 * r2
            long r2 = r7.getLast()
            long r4 = r7.getLast()
            long r4 = r4 >>> r6
            long r2 = r2 ^ r4
            long r0 = r0 + r2
            int r0 = (int) r0
        L24:
            return r0
    }

    @Override // kotlin.ranges.LongProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
            r4 = this;
            long r0 = r4.getFirst()
            long r2 = r4.getLast()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // kotlin.ranges.LongProgression
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.getFirst()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".."
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.getLast()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
