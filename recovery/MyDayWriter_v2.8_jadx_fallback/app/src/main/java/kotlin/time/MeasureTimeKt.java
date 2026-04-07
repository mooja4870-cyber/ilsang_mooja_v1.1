package kotlin.time;

/* JADX INFO: compiled from: measureTime.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0005\u001a3\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\n\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\f\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"measureTime", "Lkotlin/time/Duration;", "block", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)J", "measureTimedValue", "Lkotlin/time/TimedValue;", "T", "Lkotlin/time/TimeSource;", "(Lkotlin/time/TimeSource;Lkotlin/jvm/functions/Function0;)J", "Lkotlin/time/TimeSource$Monotonic;", "(Lkotlin/time/TimeSource$Monotonic;Lkotlin/jvm/functions/Function0;)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MeasureTimeKt {
    public static final long measureTime(kotlin.jvm.functions.Function0<kotlin.Unit> r5) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            kotlin.time.TimeSource$Monotonic r1 = kotlin.time.TimeSource.Monotonic.INSTANCE
            r2 = 0
            long r3 = r1.m1618markNowz9LOYto()
            r5.invoke()
            long r1 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1623elapsedNowUwyO8pc(r3)
            return r1
    }

    public static final long measureTime(kotlin.time.TimeSource.Monotonic r5, kotlin.jvm.functions.Function0<kotlin.Unit> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            long r1 = r5.m1618markNowz9LOYto()
            r6.invoke()
            long r3 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1623elapsedNowUwyO8pc(r1)
            return r3
    }

    public static final long measureTime(kotlin.time.TimeSource r4, kotlin.jvm.functions.Function0<kotlin.Unit> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            kotlin.time.TimeMark r1 = r4.markNow()
            r5.invoke()
            long r2 = r1.mo1469elapsedNowUwyO8pc()
            return r2
    }

    public static final <T> kotlin.time.TimedValue<T> measureTimedValue(kotlin.jvm.functions.Function0<? extends T> r10) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            kotlin.time.TimeSource$Monotonic r1 = kotlin.time.TimeSource.Monotonic.INSTANCE
            r2 = 0
            long r3 = r1.m1618markNowz9LOYto()
            java.lang.Object r5 = r10.invoke()
            kotlin.time.TimedValue r6 = new kotlin.time.TimedValue
            long r7 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1623elapsedNowUwyO8pc(r3)
            r9 = 0
            r6.<init>(r5, r7, r9)
            return r6
    }

    public static final <T> kotlin.time.TimedValue<T> measureTimedValue(kotlin.time.TimeSource.Monotonic r8, kotlin.jvm.functions.Function0<? extends T> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            long r1 = r8.m1618markNowz9LOYto()
            java.lang.Object r3 = r9.invoke()
            kotlin.time.TimedValue r4 = new kotlin.time.TimedValue
            long r5 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1623elapsedNowUwyO8pc(r1)
            r7 = 0
            r4.<init>(r3, r5, r7)
            return r4
    }

    public static final <T> kotlin.time.TimedValue<T> measureTimedValue(kotlin.time.TimeSource r7, kotlin.jvm.functions.Function0<? extends T> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            kotlin.time.TimeMark r1 = r7.markNow()
            java.lang.Object r2 = r8.invoke()
            kotlin.time.TimedValue r3 = new kotlin.time.TimedValue
            long r4 = r1.mo1469elapsedNowUwyO8pc()
            r6 = 0
            r3.<init>(r2, r4, r6)
            return r3
    }
}
