package kotlin.ranges;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001aB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002J\u0013\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001a\u0010\b\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lkotlin/ranges/CharRange;", "Lkotlin/ranges/CharProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "(CC)V", "endExclusive", "getEndExclusive$annotations", "()V", "getEndExclusive", "()Ljava/lang/Character;", "getEndInclusive", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CharRange extends kotlin.ranges.CharProgression implements kotlin.ranges.ClosedRange<java.lang.Character>, kotlin.ranges.OpenEndRange<java.lang.Character> {
    public static final kotlin.ranges.CharRange.Companion Companion = null;
    private static final kotlin.ranges.CharRange EMPTY = null;

    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/CharRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/CharRange;", "getEMPTY", "()Lkotlin/ranges/CharRange;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        public final kotlin.ranges.CharRange getEMPTY() {
                r1 = this;
                kotlin.ranges.CharRange r0 = kotlin.ranges.CharRange.access$getEMPTY$cp()
                return r0
        }
    }

    static {
            kotlin.ranges.CharRange$Companion r0 = new kotlin.ranges.CharRange$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.CharRange.Companion = r0
            kotlin.ranges.CharRange r0 = new kotlin.ranges.CharRange
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.ranges.CharRange.EMPTY = r0
            return
    }

    public CharRange(char r2, char r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public static final /* synthetic */ kotlin.ranges.CharRange access$getEMPTY$cp() {
            kotlin.ranges.CharRange r0 = kotlin.ranges.CharRange.EMPTY
            return r0
    }

    @kotlin.Deprecated(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void getEndExclusive$annotations() {
            return
    }

    public boolean contains(char r2) {
            r1 = this;
            char r0 = r1.getFirst()
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r2)
            if (r0 > 0) goto L16
            char r0 = r1.getLast()
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r2, r0)
            if (r0 > 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable r2) {
            r1 = this;
            r0 = r2
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
            boolean r0 = r1.contains(r0)
            return r0
    }

    @Override // kotlin.ranges.CharProgression
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.CharRange
            if (r0 == 0) goto L2f
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            kotlin.ranges.CharRange r0 = (kotlin.ranges.CharRange) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
        L13:
            char r0 = r2.getFirst()
            r1 = r3
            kotlin.ranges.CharRange r1 = (kotlin.ranges.CharRange) r1
            char r1 = r1.getFirst()
            if (r0 != r1) goto L2f
            char r0 = r2.getLast()
            r1 = r3
            kotlin.ranges.CharRange r1 = (kotlin.ranges.CharRange) r1
            char r1 = r1.getLast()
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
    public java.lang.Character getEndExclusive() {
            r2 = this;
            char r0 = r2.getLast()
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 == r1) goto L15
            char r0 = r2.getLast()
            int r0 = r0 + 1
            char r0 = (char) r0
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot return the exclusive upper bound of a range that includes MAX_VALUE."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getEndExclusive() {
            r1 = this;
            java.lang.Character r0 = r1.getEndExclusive()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public java.lang.Character getEndInclusive() {
            r1 = this;
            char r0 = r1.getLast()
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getEndInclusive() {
            r1 = this;
            java.lang.Character r0 = r1.getEndInclusive()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public java.lang.Character getStart() {
            r1 = this;
            char r0 = r1.getFirst()
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getStart() {
            r1 = this;
            java.lang.Character r0 = r1.getStart()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            return r0
    }

    @Override // kotlin.ranges.CharProgression
    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L13
        L8:
            char r0 = r2.getFirst()
            int r0 = r0 * 31
            char r1 = r2.getLast()
            int r0 = r0 + r1
        L13:
            return r0
    }

    @Override // kotlin.ranges.CharProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
            r2 = this;
            char r0 = r2.getFirst()
            char r1 = r2.getLast()
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r0 <= 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // kotlin.ranges.CharProgression
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r2.getFirst()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".."
            java.lang.StringBuilder r0 = r0.append(r1)
            char r1 = r2.getLast()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
