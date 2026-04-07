package kotlin.time;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\bH$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "zero", "", "getZero", "()J", "zero$delegate", "Lkotlin/Lazy;", "adjustedRead", "markNow", "Lkotlin/time/ComparableTimeMark;", "read", "LongTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractLongTimeSource implements kotlin.time.TimeSource.WithComparableMarks {
    private final kotlin.time.DurationUnit unit;
    private final kotlin.Lazy zero$delegate;

    /* JADX INFO: compiled from: TimeSources.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001b\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0013\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractLongTimeSource;", "offset", "Lkotlin/time/Duration;", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "equals", "", "other", "", "hashCode", "", "minus", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class LongTimeMark implements kotlin.time.ComparableTimeMark {
        private final long offset;
        private final long startedAt;
        private final kotlin.time.AbstractLongTimeSource timeSource;

        private LongTimeMark(long r2, kotlin.time.AbstractLongTimeSource r4, long r5) {
                r1 = this;
                java.lang.String r0 = "timeSource"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r1.<init>()
                r1.startedAt = r2
                r1.timeSource = r4
                r1.offset = r5
                return
        }

        public /* synthetic */ LongTimeMark(long r1, kotlin.time.AbstractLongTimeSource r3, long r4, kotlin.jvm.internal.DefaultConstructorMarker r6) {
                r0 = this;
                r0.<init>(r1, r3, r4)
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(kotlin.time.ComparableTimeMark r2) {
                r1 = this;
                r0 = r2
                kotlin.time.ComparableTimeMark r0 = (kotlin.time.ComparableTimeMark) r0
                int r0 = r1.compareTo2(r0)
                return r0
        }

        @Override // kotlin.time.ComparableTimeMark
        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(kotlin.time.ComparableTimeMark r2) {
                r1 = this;
                int r0 = kotlin.time.ComparableTimeMark.DefaultImpls.compareTo(r1, r2)
                return r0
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
        public long mo1469elapsedNowUwyO8pc() {
                r5 = this;
                kotlin.time.AbstractLongTimeSource r0 = r5.timeSource
                long r0 = kotlin.time.AbstractLongTimeSource.access$adjustedRead(r0)
                long r2 = r5.startedAt
                kotlin.time.AbstractLongTimeSource r4 = r5.timeSource
                kotlin.time.DurationUnit r4 = r4.getUnit()
                long r0 = kotlin.time.LongSaturatedMathKt.saturatingOriginsDiff(r0, r2, r4)
                long r2 = r5.offset
                long r0 = kotlin.time.Duration.m1514minusLRDsOJo(r0, r2)
                return r0
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof kotlin.time.AbstractLongTimeSource.LongTimeMark
                if (r0 == 0) goto L26
                kotlin.time.AbstractLongTimeSource r0 = r4.timeSource
                r1 = r5
                kotlin.time.AbstractLongTimeSource$LongTimeMark r1 = (kotlin.time.AbstractLongTimeSource.LongTimeMark) r1
                kotlin.time.AbstractLongTimeSource r1 = r1.timeSource
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L26
                r0 = r5
                kotlin.time.ComparableTimeMark r0 = (kotlin.time.ComparableTimeMark) r0
                long r0 = r4.mo1471minusUwyO8pc(r0)
                kotlin.time.Duration$Companion r2 = kotlin.time.Duration.Companion
                long r2 = r2.m1582getZEROUwyO8pc()
                boolean r0 = kotlin.time.Duration.m1484equalsimpl0(r0, r2)
                if (r0 == 0) goto L26
                r0 = 1
                goto L27
            L26:
                r0 = 0
            L27:
                return r0
        }

        @Override // kotlin.time.TimeMark
        public boolean hasNotPassedNow() {
                r1 = this;
                boolean r0 = kotlin.time.ComparableTimeMark.DefaultImpls.hasNotPassedNow(r1)
                return r0
        }

        @Override // kotlin.time.TimeMark
        public boolean hasPassedNow() {
                r1 = this;
                boolean r0 = kotlin.time.ComparableTimeMark.DefaultImpls.hasPassedNow(r1)
                return r0
        }

        @Override // kotlin.time.ComparableTimeMark
        public int hashCode() {
                r3 = this;
                long r0 = r3.offset
                int r0 = kotlin.time.Duration.m1507hashCodeimpl(r0)
                int r0 = r0 * 37
                long r1 = r3.startedAt
                int r1 = java.lang.Long.hashCode(r1)
                int r0 = r0 + r1
                return r0
        }

        @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
        /* JADX INFO: renamed from: minus-LRDsOJo */
        public kotlin.time.ComparableTimeMark mo1470minusLRDsOJo(long r2) {
                r1 = this;
                kotlin.time.ComparableTimeMark r0 = kotlin.time.ComparableTimeMark.DefaultImpls.m1474minusLRDsOJo(r1, r2)
                return r0
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: minus-LRDsOJo */
        public /* bridge */ /* synthetic */ kotlin.time.TimeMark mo1470minusLRDsOJo(long r2) {
                r1 = this;
                kotlin.time.ComparableTimeMark r0 = r1.mo1470minusLRDsOJo(r2)
                kotlin.time.TimeMark r0 = (kotlin.time.TimeMark) r0
                return r0
        }

        @Override // kotlin.time.ComparableTimeMark
        /* JADX INFO: renamed from: minus-UwyO8pc */
        public long mo1471minusUwyO8pc(kotlin.time.ComparableTimeMark r7) {
                r6 = this;
                java.lang.String r0 = "other"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                boolean r0 = r7 instanceof kotlin.time.AbstractLongTimeSource.LongTimeMark
                if (r0 == 0) goto L37
                kotlin.time.AbstractLongTimeSource r0 = r6.timeSource
                r1 = r7
                kotlin.time.AbstractLongTimeSource$LongTimeMark r1 = (kotlin.time.AbstractLongTimeSource.LongTimeMark) r1
                kotlin.time.AbstractLongTimeSource r1 = r1.timeSource
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L37
                long r0 = r6.startedAt
                r2 = r7
                kotlin.time.AbstractLongTimeSource$LongTimeMark r2 = (kotlin.time.AbstractLongTimeSource.LongTimeMark) r2
                long r2 = r2.startedAt
                kotlin.time.AbstractLongTimeSource r4 = r6.timeSource
                kotlin.time.DurationUnit r4 = r4.getUnit()
                long r0 = kotlin.time.LongSaturatedMathKt.saturatingOriginsDiff(r0, r2, r4)
                long r2 = r6.offset
                r4 = r7
                kotlin.time.AbstractLongTimeSource$LongTimeMark r4 = (kotlin.time.AbstractLongTimeSource.LongTimeMark) r4
                long r4 = r4.offset
                long r2 = kotlin.time.Duration.m1514minusLRDsOJo(r2, r4)
                long r2 = kotlin.time.Duration.m1515plusLRDsOJo(r0, r2)
                return r2
            L37:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Subtracting or comparing time marks from different time sources is not possible: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r6)
                java.lang.String r2 = " and "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r7)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
        /* JADX INFO: renamed from: plus-LRDsOJo */
        public kotlin.time.ComparableTimeMark mo1472plusLRDsOJo(long r24) {
                r23 = this;
                r0 = r23
                r1 = r24
                kotlin.time.AbstractLongTimeSource r3 = r0.timeSource
                kotlin.time.DurationUnit r3 = r3.getUnit()
                boolean r4 = kotlin.time.Duration.m1511isInfiniteimpl(r1)
                if (r4 == 0) goto L27
                long r4 = r0.startedAt
                long r7 = kotlin.time.LongSaturatedMathKt.m1608saturatingAddNuflL3o(r4, r3, r1)
                kotlin.time.AbstractLongTimeSource$LongTimeMark r6 = new kotlin.time.AbstractLongTimeSource$LongTimeMark
                kotlin.time.AbstractLongTimeSource r9 = r0.timeSource
                kotlin.time.Duration$Companion r4 = kotlin.time.Duration.Companion
                long r10 = r4.m1582getZEROUwyO8pc()
                r12 = 0
                r6.<init>(r7, r9, r10, r12)
                kotlin.time.ComparableTimeMark r6 = (kotlin.time.ComparableTimeMark) r6
                return r6
            L27:
                long r4 = kotlin.time.Duration.m1531truncateToUwyO8pc$kotlin_stdlib(r1, r3)
                long r6 = kotlin.time.Duration.m1514minusLRDsOJo(r1, r4)
                long r8 = r0.offset
                long r6 = kotlin.time.Duration.m1515plusLRDsOJo(r6, r8)
                long r8 = r0.startedAt
                long r8 = kotlin.time.LongSaturatedMathKt.m1608saturatingAddNuflL3o(r8, r3, r4)
                long r10 = kotlin.time.Duration.m1531truncateToUwyO8pc$kotlin_stdlib(r6, r3)
                long r8 = kotlin.time.LongSaturatedMathKt.m1608saturatingAddNuflL3o(r8, r3, r10)
                long r12 = kotlin.time.Duration.m1514minusLRDsOJo(r6, r10)
                long r14 = kotlin.time.Duration.m1499getInWholeNanosecondsimpl(r12)
                r16 = 0
                int r18 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
                if (r18 == 0) goto L6b
                int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r18 == 0) goto L6b
                long r18 = r8 ^ r14
                int r16 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
                if (r16 >= 0) goto L6b
                int r1 = kotlin.math.MathKt.getSign(r14)
                long r1 = kotlin.time.DurationKt.toDuration(r1, r3)
                long r8 = kotlin.time.LongSaturatedMathKt.m1608saturatingAddNuflL3o(r8, r3, r1)
                long r12 = kotlin.time.Duration.m1514minusLRDsOJo(r12, r1)
            L6b:
                r17 = r8
                r1 = r17
                r16 = 0
                r19 = 1
                long r21 = r1 - r19
                long r19 = r21 | r19
                r21 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r19 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
                if (r19 != 0) goto L83
                r19 = 1
                goto L85
            L83:
                r19 = 0
            L85:
                if (r19 == 0) goto L90
                kotlin.time.Duration$Companion r1 = kotlin.time.Duration.Companion
                long r1 = r1.m1582getZEROUwyO8pc()
                r20 = r1
                goto L92
            L90:
                r20 = r12
            L92:
                kotlin.time.AbstractLongTimeSource$LongTimeMark r16 = new kotlin.time.AbstractLongTimeSource$LongTimeMark
                kotlin.time.AbstractLongTimeSource r1 = r0.timeSource
                r22 = 0
                r19 = r1
                r16.<init>(r17, r19, r20, r22)
                kotlin.time.ComparableTimeMark r16 = (kotlin.time.ComparableTimeMark) r16
                return r16
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: plus-LRDsOJo */
        public /* bridge */ /* synthetic */ kotlin.time.TimeMark mo1472plusLRDsOJo(long r2) {
                r1 = this;
                kotlin.time.ComparableTimeMark r0 = r1.mo1472plusLRDsOJo(r2)
                kotlin.time.TimeMark r0 = (kotlin.time.TimeMark) r0
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "LongTimeMark("
                java.lang.StringBuilder r0 = r0.append(r1)
                long r1 = r3.startedAt
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlin.time.AbstractLongTimeSource r1 = r3.timeSource
                kotlin.time.DurationUnit r1 = r1.getUnit()
                java.lang.String r1 = kotlin.time.DurationUnitKt.shortName(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " + "
                java.lang.StringBuilder r0 = r0.append(r1)
                long r1 = r3.offset
                java.lang.String r1 = kotlin.time.Duration.m1528toStringimpl(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlin.time.AbstractLongTimeSource r1 = r3.timeSource
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 41
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public AbstractLongTimeSource(kotlin.time.DurationUnit r2) {
            r1 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.unit = r2
            kotlin.time.AbstractLongTimeSource$zero$2 r0 = new kotlin.time.AbstractLongTimeSource$zero$2
            r0.<init>(r1)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.zero$delegate = r0
            return
    }

    public static final /* synthetic */ long access$adjustedRead(kotlin.time.AbstractLongTimeSource r2) {
            long r0 = r2.adjustedRead()
            return r0
    }

    private final long adjustedRead() {
            r4 = this;
            long r0 = r4.read()
            long r2 = r4.getZero()
            long r0 = r0 - r2
            return r0
    }

    private final long getZero() {
            r2 = this;
            kotlin.Lazy r0 = r2.zero$delegate
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            return r0
    }

    protected final kotlin.time.DurationUnit getUnit() {
            r1 = this;
            kotlin.time.DurationUnit r0 = r1.unit
            return r0
    }

    @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
    public kotlin.time.ComparableTimeMark markNow() {
            r7 = this;
            kotlin.time.AbstractLongTimeSource$LongTimeMark r0 = new kotlin.time.AbstractLongTimeSource$LongTimeMark
            long r1 = r7.adjustedRead()
            kotlin.time.Duration$Companion r3 = kotlin.time.Duration.Companion
            long r4 = r3.m1582getZEROUwyO8pc()
            r6 = 0
            r3 = r7
            r0.<init>(r1, r3, r4, r6)
            kotlin.time.ComparableTimeMark r0 = (kotlin.time.ComparableTimeMark) r0
            return r0
    }

    @Override // kotlin.time.TimeSource
    public /* bridge */ /* synthetic */ kotlin.time.TimeMark markNow() {
            r1 = this;
            kotlin.time.ComparableTimeMark r0 = r1.markNow()
            kotlin.time.TimeMark r0 = (kotlin.time.TimeMark) r0
            return r0
    }

    protected abstract long read();
}
