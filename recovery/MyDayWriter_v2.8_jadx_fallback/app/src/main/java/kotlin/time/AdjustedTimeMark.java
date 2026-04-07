package kotlin.time;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u000b\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0007J\u0018\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lkotlin/time/AdjustedTimeMark;", "Lkotlin/time/TimeMark;", "mark", "adjustment", "Lkotlin/time/Duration;", "(Lkotlin/time/TimeMark;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdjustment-UwyO8pc", "()J", "J", "getMark", "()Lkotlin/time/TimeMark;", "elapsedNow", "elapsedNow-UwyO8pc", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AdjustedTimeMark implements kotlin.time.TimeMark {
    private final long adjustment;
    private final kotlin.time.TimeMark mark;

    private AdjustedTimeMark(kotlin.time.TimeMark r2, long r3) {
            r1 = this;
            java.lang.String r0 = "mark"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.mark = r2
            r1.adjustment = r3
            return
    }

    public /* synthetic */ AdjustedTimeMark(kotlin.time.TimeMark r1, long r2, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    public long mo1469elapsedNowUwyO8pc() {
            r4 = this;
            kotlin.time.TimeMark r0 = r4.mark
            long r0 = r0.mo1469elapsedNowUwyO8pc()
            long r2 = r4.adjustment
            long r0 = kotlin.time.Duration.m1514minusLRDsOJo(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: getAdjustment-UwyO8pc, reason: not valid java name */
    public final long m1473getAdjustmentUwyO8pc() {
            r2 = this;
            long r0 = r2.adjustment
            return r0
    }

    public final kotlin.time.TimeMark getMark() {
            r1 = this;
            kotlin.time.TimeMark r0 = r1.mark
            return r0
    }

    @Override // kotlin.time.TimeMark
    public boolean hasNotPassedNow() {
            r1 = this;
            boolean r0 = kotlin.time.TimeMark.DefaultImpls.hasNotPassedNow(r1)
            return r0
    }

    @Override // kotlin.time.TimeMark
    public boolean hasPassedNow() {
            r1 = this;
            boolean r0 = kotlin.time.TimeMark.DefaultImpls.hasPassedNow(r1)
            return r0
    }

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: minus-LRDsOJo */
    public kotlin.time.TimeMark mo1470minusLRDsOJo(long r2) {
            r1 = this;
            kotlin.time.TimeMark r0 = kotlin.time.TimeMark.DefaultImpls.m1616minusLRDsOJo(r1, r2)
            return r0
    }

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: plus-LRDsOJo */
    public kotlin.time.TimeMark mo1472plusLRDsOJo(long r6) {
            r5 = this;
            kotlin.time.AdjustedTimeMark r0 = new kotlin.time.AdjustedTimeMark
            kotlin.time.TimeMark r1 = r5.mark
            long r2 = r5.adjustment
            long r2 = kotlin.time.Duration.m1515plusLRDsOJo(r2, r6)
            r4 = 0
            r0.<init>(r1, r2, r4)
            kotlin.time.TimeMark r0 = (kotlin.time.TimeMark) r0
            return r0
    }
}
