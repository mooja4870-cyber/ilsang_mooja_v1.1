package kotlin.ranges;

/* JADX INFO: compiled from: ULongRange.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001cB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u001d\u0010\b\u001a\u00020\u00038VX\u0097\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lkotlin/ranges/ULongRange;", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/ULong;", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "endExclusive", "getEndExclusive-s-VKNKU$annotations", "()V", "getEndExclusive-s-VKNKU", "()J", "getEndInclusive-s-VKNKU", "getStart-s-VKNKU", "contains", "", "value", "contains-VKZWuLQ", "(J)Z", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ULongRange extends kotlin.ranges.ULongProgression implements kotlin.ranges.ClosedRange<kotlin.ULong>, kotlin.ranges.OpenEndRange<kotlin.ULong> {
    public static final kotlin.ranges.ULongRange.Companion Companion = null;
    private static final kotlin.ranges.ULongRange EMPTY = null;

    /* JADX INFO: compiled from: ULongRange.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/ULongRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/ULongRange;", "getEMPTY", "()Lkotlin/ranges/ULongRange;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        public final kotlin.ranges.ULongRange getEMPTY() {
                r1 = this;
                kotlin.ranges.ULongRange r0 = kotlin.ranges.ULongRange.access$getEMPTY$cp()
                return r0
        }
    }

    static {
            kotlin.ranges.ULongRange$Companion r0 = new kotlin.ranges.ULongRange$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.ULongRange.Companion = r0
            kotlin.ranges.ULongRange r2 = new kotlin.ranges.ULongRange
            r5 = 0
            r7 = 0
            r3 = -1
            r2.<init>(r3, r5, r7)
            kotlin.ranges.ULongRange.EMPTY = r2
            return
    }

    private ULongRange(long r9, long r11) {
            r8 = this;
            r5 = 1
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r0.<init>(r1, r3, r5, r7)
            return
    }

    public /* synthetic */ ULongRange(long r1, long r3, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    public static final /* synthetic */ kotlin.ranges.ULongRange access$getEMPTY$cp() {
            kotlin.ranges.ULongRange r0 = kotlin.ranges.ULongRange.EMPTY
            return r0
    }

    @kotlin.Deprecated(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    /* JADX INFO: renamed from: getEndExclusive-s-VKNKU$annotations, reason: not valid java name */
    public static /* synthetic */ void m1389getEndExclusivesVKNKU$annotations() {
            return
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable r3) {
            r2 = this;
            r0 = r3
            kotlin.ULong r0 = (kotlin.ULong) r0
            long r0 = r0.m379unboximpl()
            boolean r0 = r2.m1390containsVKZWuLQ(r0)
            return r0
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m1390containsVKZWuLQ(long r3) {
            r2 = this;
            long r0 = r2.m1385getFirstsVKNKU()
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r0, r3)
            if (r0 > 0) goto L16
            long r0 = r2.m1386getLastsVKNKU()
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r3, r0)
            if (r0 > 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    @Override // kotlin.ranges.ULongProgression
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof kotlin.ranges.ULongRange
            if (r0 == 0) goto L33
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L13
            r0 = r5
            kotlin.ranges.ULongRange r0 = (kotlin.ranges.ULongRange) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L31
        L13:
            long r0 = r4.m1385getFirstsVKNKU()
            r2 = r5
            kotlin.ranges.ULongRange r2 = (kotlin.ranges.ULongRange) r2
            long r2 = r2.m1385getFirstsVKNKU()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L33
            long r0 = r4.m1386getLastsVKNKU()
            r2 = r5
            kotlin.ranges.ULongRange r2 = (kotlin.ranges.ULongRange) r2
            long r2 = r2.m1386getLastsVKNKU()
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
            r2 = this;
            long r0 = r2.m1391getEndExclusivesVKNKU()
            kotlin.ULong r0 = kotlin.ULong.m321boximpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: getEndExclusive-s-VKNKU, reason: not valid java name */
    public long m1391getEndExclusivesVKNKU() {
            r6 = this;
            long r0 = r6.m1386getLastsVKNKU()
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L20
            long r0 = r6.m1386getLastsVKNKU()
            r2 = 1
            long r2 = (long) r2
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r2 = kotlin.ULong.m327constructorimpl(r2)
            long r0 = r0 + r2
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            return r0
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot return the exclusive upper bound of a range that includes MAX_VALUE."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getEndInclusive() {
            r2 = this;
            long r0 = r2.m1392getEndInclusivesVKNKU()
            kotlin.ULong r0 = kotlin.ULong.m321boximpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: getEndInclusive-s-VKNKU, reason: not valid java name */
    public long m1392getEndInclusivesVKNKU() {
            r2 = this;
            long r0 = r2.m1386getLastsVKNKU()
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getStart() {
            r2 = this;
            long r0 = r2.m1393getStartsVKNKU()
            kotlin.ULong r0 = kotlin.ULong.m321boximpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: getStart-s-VKNKU, reason: not valid java name */
    public long m1393getStartsVKNKU() {
            r2 = this;
            long r0 = r2.m1385getFirstsVKNKU()
            return r0
    }

    @Override // kotlin.ranges.ULongProgression
    public int hashCode() {
            r7 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L34
        L8:
            long r0 = r7.m1385getFirstsVKNKU()
            long r2 = r7.m1385getFirstsVKNKU()
            r4 = 32
            long r2 = r2 >>> r4
            long r2 = kotlin.ULong.m327constructorimpl(r2)
            long r0 = r0 ^ r2
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            int r0 = (int) r0
            int r0 = r0 * 31
            long r1 = r7.m1386getLastsVKNKU()
            long r5 = r7.m1386getLastsVKNKU()
            long r3 = r5 >>> r4
            long r3 = kotlin.ULong.m327constructorimpl(r3)
            long r1 = r1 ^ r3
            long r1 = kotlin.ULong.m327constructorimpl(r1)
            int r1 = (int) r1
            int r0 = r0 + r1
        L34:
            return r0
    }

    @Override // kotlin.ranges.ULongProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
            r4 = this;
            long r0 = r4.m1385getFirstsVKNKU()
            long r2 = r4.m1386getLastsVKNKU()
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r0, r2)
            if (r0 <= 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // kotlin.ranges.ULongProgression
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.m1385getFirstsVKNKU()
            java.lang.String r1 = kotlin.ULong.m373toStringimpl(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".."
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.m1386getLastsVKNKU()
            java.lang.String r1 = kotlin.ULong.m373toStringimpl(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
