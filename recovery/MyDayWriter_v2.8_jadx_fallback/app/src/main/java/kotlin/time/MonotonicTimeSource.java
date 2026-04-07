package kotlin.time;

/* JADX INFO: compiled from: MonoTimeSource.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lkotlin/time/MonotonicTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "()V", "zero", "", "adjustReading", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "timeMark", "duration", "Lkotlin/time/Duration;", "adjustReading-6QKq23U", "(JJ)J", "differenceBetween", "one", "another", "differenceBetween-fRLX17w", "elapsedFrom", "elapsedFrom-6eNON_k", "(J)J", "markNow", "markNow-z9LOYto", "()J", "read", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MonotonicTimeSource implements kotlin.time.TimeSource.WithComparableMarks {
    public static final kotlin.time.MonotonicTimeSource INSTANCE = null;
    private static final long zero = 0;

    static {
            kotlin.time.MonotonicTimeSource r0 = new kotlin.time.MonotonicTimeSource
            r0.<init>()
            kotlin.time.MonotonicTimeSource.INSTANCE = r0
            long r0 = java.lang.System.nanoTime()
            kotlin.time.MonotonicTimeSource.zero = r0
            return
    }

    private MonotonicTimeSource() {
            r0 = this;
            r0.<init>()
            return
    }

    private final long read() {
            r4 = this;
            long r0 = java.lang.System.nanoTime()
            long r2 = kotlin.time.MonotonicTimeSource.zero
            long r0 = r0 - r2
            return r0
    }

    /* JADX INFO: renamed from: adjustReading-6QKq23U, reason: not valid java name */
    public final long m1610adjustReading6QKq23U(long r3, long r5) {
            r2 = this;
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = kotlin.time.LongSaturatedMathKt.m1608saturatingAddNuflL3o(r3, r0, r5)
            long r0 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1622constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: differenceBetween-fRLX17w, reason: not valid java name */
    public final long m1611differenceBetweenfRLX17w(long r3, long r5) {
            r2 = this;
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = kotlin.time.LongSaturatedMathKt.saturatingOriginsDiff(r3, r5, r0)
            return r0
    }

    /* JADX INFO: renamed from: elapsedFrom-6eNON_k, reason: not valid java name */
    public final long m1612elapsedFrom6eNON_k(long r4) {
            r3 = this;
            long r0 = r3.read()
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = kotlin.time.LongSaturatedMathKt.saturatingDiff(r0, r4, r2)
            return r0
    }

    @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
    public /* bridge */ /* synthetic */ kotlin.time.ComparableTimeMark markNow() {
            r2 = this;
            long r0 = r2.m1613markNowz9LOYto()
            kotlin.time.TimeSource$Monotonic$ValueTimeMark r0 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1619boximpl(r0)
            return r0
    }

    @Override // kotlin.time.TimeSource
    public /* bridge */ /* synthetic */ kotlin.time.TimeMark markNow() {
            r2 = this;
            long r0 = r2.m1613markNowz9LOYto()
            kotlin.time.TimeSource$Monotonic$ValueTimeMark r0 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1619boximpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
    public long m1613markNowz9LOYto() {
            r2 = this;
            long r0 = r2.read()
            long r0 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1622constructorimpl(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "TimeSource(System.nanoTime())"
            return r0
    }
}
