package kotlin.ranges;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0019B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002J\u0013\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u001a\u0010\b\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "(II)V", "endExclusive", "getEndExclusive$annotations", "()V", "getEndExclusive", "()Ljava/lang/Integer;", "getEndInclusive", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IntRange extends kotlin.ranges.IntProgression implements kotlin.ranges.ClosedRange<java.lang.Integer>, kotlin.ranges.OpenEndRange<java.lang.Integer> {
    public static final kotlin.ranges.IntRange.Companion Companion = null;
    private static final kotlin.ranges.IntRange EMPTY = null;

    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/IntRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/IntRange;", "getEMPTY", "()Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        public final kotlin.ranges.IntRange getEMPTY() {
                r1 = this;
                kotlin.ranges.IntRange r0 = kotlin.ranges.IntRange.access$getEMPTY$cp()
                return r0
        }
    }

    static {
            kotlin.ranges.IntRange$Companion r0 = new kotlin.ranges.IntRange$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.IntRange.Companion = r0
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.ranges.IntRange.EMPTY = r0
            return
    }

    public IntRange(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public static final /* synthetic */ kotlin.ranges.IntRange access$getEMPTY$cp() {
            kotlin.ranges.IntRange r0 = kotlin.ranges.IntRange.EMPTY
            return r0
    }

    @kotlin.Deprecated(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void getEndExclusive$annotations() {
            return
    }

    public boolean contains(int r2) {
            r1 = this;
            int r0 = r1.getFirst()
            if (r0 > r2) goto Le
            int r0 = r1.getLast()
            if (r2 > r0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable r2) {
            r1 = this;
            r0 = r2
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r0 = r1.contains(r0)
            return r0
    }

    @Override // kotlin.ranges.IntProgression
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.IntRange
            if (r0 == 0) goto L2f
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            kotlin.ranges.IntRange r0 = (kotlin.ranges.IntRange) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
        L13:
            int r0 = r2.getFirst()
            r1 = r3
            kotlin.ranges.IntRange r1 = (kotlin.ranges.IntRange) r1
            int r1 = r1.getFirst()
            if (r0 != r1) goto L2f
            int r0 = r2.getLast()
            r1 = r3
            kotlin.ranges.IntRange r1 = (kotlin.ranges.IntRange) r1
            int r1 = r1.getLast()
            if (r0 != r1) goto L2f
        L2d:
            r0 = 1
            goto L30
        L2f:
            r0 = 0
        L30:
            return r0
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getEndExclusive() {
            r1 = this;
            java.lang.Integer r0 = r1.getEndExclusive()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            return r0
    }

    @Override // kotlin.ranges.OpenEndRange
    public java.lang.Integer getEndExclusive() {
            r2 = this;
            int r0 = r2.getLast()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L14
            int r0 = r2.getLast()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot return the exclusive upper bound of a range that includes MAX_VALUE."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getEndInclusive() {
            r1 = this;
            java.lang.Integer r0 = r1.getEndInclusive()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public java.lang.Integer getEndInclusive() {
            r1 = this;
            int r0 = r1.getLast()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getStart() {
            r1 = this;
            java.lang.Integer r0 = r1.getStart()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public java.lang.Integer getStart() {
            r1 = this;
            int r0 = r1.getFirst()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // kotlin.ranges.IntProgression
    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L13
        L8:
            int r0 = r2.getFirst()
            int r0 = r0 * 31
            int r1 = r2.getLast()
            int r0 = r0 + r1
        L13:
            return r0
    }

    @Override // kotlin.ranges.IntProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
            r2 = this;
            int r0 = r2.getFirst()
            int r1 = r2.getLast()
            if (r0 <= r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // kotlin.ranges.IntProgression
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.getFirst()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".."
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.getLast()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
