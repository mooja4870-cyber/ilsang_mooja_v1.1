package kotlin.time;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Deprecated(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "markNow", "Lkotlin/time/ComparableTimeMark;", "read", "", "DoubleTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractDoubleTimeSource implements kotlin.time.TimeSource.WithComparableMarks {
    private final kotlin.time.DurationUnit unit;

    /* JADX INFO: compiled from: TimeSources.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001b\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0013\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource$DoubleTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractDoubleTimeSource;", "offset", "Lkotlin/time/Duration;", "(DLkotlin/time/AbstractDoubleTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "equals", "", "other", "", "hashCode", "", "minus", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class DoubleTimeMark implements kotlin.time.ComparableTimeMark {
        private final long offset;
        private final double startedAt;
        private final kotlin.time.AbstractDoubleTimeSource timeSource;

        private DoubleTimeMark(double r2, kotlin.time.AbstractDoubleTimeSource r4, long r5) {
                r1 = this;
                java.lang.String r0 = "timeSource"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r1.<init>()
                r1.startedAt = r2
                r1.timeSource = r4
                r1.offset = r5
                return
        }

        public /* synthetic */ DoubleTimeMark(double r1, kotlin.time.AbstractDoubleTimeSource r3, long r4, kotlin.jvm.internal.DefaultConstructorMarker r6) {
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
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
        public long mo1469elapsedNowUwyO8pc() {
                r4 = this;
                kotlin.time.AbstractDoubleTimeSource r0 = r4.timeSource
                double r0 = r0.read()
                double r2 = r4.startedAt
                double r0 = r0 - r2
                kotlin.time.AbstractDoubleTimeSource r2 = r4.timeSource
                kotlin.time.DurationUnit r2 = r2.getUnit()
                long r0 = kotlin.time.DurationKt.toDuration(r0, r2)
                long r2 = r4.offset
                long r0 = kotlin.time.Duration.m1514minusLRDsOJo(r0, r2)
                return r0
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof kotlin.time.AbstractDoubleTimeSource.DoubleTimeMark
                if (r0 == 0) goto L26
                kotlin.time.AbstractDoubleTimeSource r0 = r4.timeSource
                r1 = r5
                kotlin.time.AbstractDoubleTimeSource$DoubleTimeMark r1 = (kotlin.time.AbstractDoubleTimeSource.DoubleTimeMark) r1
                kotlin.time.AbstractDoubleTimeSource r1 = r1.timeSource
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
                r4 = this;
                double r0 = r4.startedAt
                kotlin.time.AbstractDoubleTimeSource r2 = r4.timeSource
                kotlin.time.DurationUnit r2 = r2.getUnit()
                long r0 = kotlin.time.DurationKt.toDuration(r0, r2)
                long r2 = r4.offset
                long r0 = kotlin.time.Duration.m1515plusLRDsOJo(r0, r2)
                int r0 = kotlin.time.Duration.m1507hashCodeimpl(r0)
                return r0
        }

        @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
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
        /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
        public long mo1471minusUwyO8pc(kotlin.time.ComparableTimeMark r7) {
                r6 = this;
                java.lang.String r0 = "other"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                boolean r0 = r7 instanceof kotlin.time.AbstractDoubleTimeSource.DoubleTimeMark
                if (r0 == 0) goto L65
                kotlin.time.AbstractDoubleTimeSource r0 = r6.timeSource
                r1 = r7
                kotlin.time.AbstractDoubleTimeSource$DoubleTimeMark r1 = (kotlin.time.AbstractDoubleTimeSource.DoubleTimeMark) r1
                kotlin.time.AbstractDoubleTimeSource r1 = r1.timeSource
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L65
                long r0 = r6.offset
                r2 = r7
                kotlin.time.AbstractDoubleTimeSource$DoubleTimeMark r2 = (kotlin.time.AbstractDoubleTimeSource.DoubleTimeMark) r2
                long r2 = r2.offset
                boolean r0 = kotlin.time.Duration.m1484equalsimpl0(r0, r2)
                if (r0 == 0) goto L32
                long r0 = r6.offset
                boolean r0 = kotlin.time.Duration.m1511isInfiniteimpl(r0)
                if (r0 == 0) goto L32
                kotlin.time.Duration$Companion r0 = kotlin.time.Duration.Companion
                long r0 = r0.m1582getZEROUwyO8pc()
                return r0
            L32:
                long r0 = r6.offset
                r2 = r7
                kotlin.time.AbstractDoubleTimeSource$DoubleTimeMark r2 = (kotlin.time.AbstractDoubleTimeSource.DoubleTimeMark) r2
                long r2 = r2.offset
                long r0 = kotlin.time.Duration.m1514minusLRDsOJo(r0, r2)
                double r2 = r6.startedAt
                r4 = r7
                kotlin.time.AbstractDoubleTimeSource$DoubleTimeMark r4 = (kotlin.time.AbstractDoubleTimeSource.DoubleTimeMark) r4
                double r4 = r4.startedAt
                double r2 = r2 - r4
                kotlin.time.AbstractDoubleTimeSource r4 = r6.timeSource
                kotlin.time.DurationUnit r4 = r4.getUnit()
                long r2 = kotlin.time.DurationKt.toDuration(r2, r4)
                long r4 = kotlin.time.Duration.m1532unaryMinusUwyO8pc(r0)
                boolean r4 = kotlin.time.Duration.m1484equalsimpl0(r2, r4)
                if (r4 == 0) goto L60
                kotlin.time.Duration$Companion r4 = kotlin.time.Duration.Companion
                long r4 = r4.m1582getZEROUwyO8pc()
                goto L64
            L60:
                long r4 = kotlin.time.Duration.m1515plusLRDsOJo(r2, r0)
            L64:
                return r4
            L65:
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
        /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
        public kotlin.time.ComparableTimeMark mo1472plusLRDsOJo(long r8) {
                r7 = this;
                kotlin.time.AbstractDoubleTimeSource$DoubleTimeMark r0 = new kotlin.time.AbstractDoubleTimeSource$DoubleTimeMark
                double r1 = r7.startedAt
                kotlin.time.AbstractDoubleTimeSource r3 = r7.timeSource
                long r4 = r7.offset
                long r4 = kotlin.time.Duration.m1515plusLRDsOJo(r4, r8)
                r6 = 0
                r0.<init>(r1, r3, r4, r6)
                kotlin.time.ComparableTimeMark r0 = (kotlin.time.ComparableTimeMark) r0
                return r0
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
                java.lang.String r1 = "DoubleTimeMark("
                java.lang.StringBuilder r0 = r0.append(r1)
                double r1 = r3.startedAt
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlin.time.AbstractDoubleTimeSource r1 = r3.timeSource
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
                kotlin.time.AbstractDoubleTimeSource r1 = r3.timeSource
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 41
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public AbstractDoubleTimeSource(kotlin.time.DurationUnit r2) {
            r1 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.unit = r2
            return
    }

    protected final kotlin.time.DurationUnit getUnit() {
            r1 = this;
            kotlin.time.DurationUnit r0 = r1.unit
            return r0
    }

    @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
    public kotlin.time.ComparableTimeMark markNow() {
            r7 = this;
            kotlin.time.AbstractDoubleTimeSource$DoubleTimeMark r0 = new kotlin.time.AbstractDoubleTimeSource$DoubleTimeMark
            double r1 = r7.read()
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

    protected abstract double read();
}
