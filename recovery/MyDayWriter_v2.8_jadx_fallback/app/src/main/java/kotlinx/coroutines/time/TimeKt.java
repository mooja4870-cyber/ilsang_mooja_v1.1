package kotlinx.coroutines.time;

/* JADX INFO: compiled from: Time.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086@¢\u0006\u0002\u0010\u0004\u001aR\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0002\u001a\u00020\u00032'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\r\u001aG\u0010\u000e\u001a\u0004\u0018\u0001H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0002\u001a\u00020\u00032'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0086@¢\u0006\u0002\u0010\r\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0003H\u0002\u001a&\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0012\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0007\u001aA\u0010\u0014\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00150\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0017¢\u0006\u0002\u0010\u0018\u001a&\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0012\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0003H\u0007¨\u0006\u001b"}, d2 = {"delay", "", "duration", "Ljava/time/Duration;", "(Ljava/time/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeout", "T", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/time/Duration;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeoutOrNull", "coerceToMillis", "", "debounce", "Lkotlinx/coroutines/flow/Flow;", "timeout", "onTimeout", "R", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlin/Function1;", "(Lkotlinx/coroutines/selects/SelectBuilder;Ljava/time/Duration;Lkotlin/jvm/functions/Function1;)V", "sample", "period", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TimeKt {
    private static final long coerceToMillis(java.time.Duration r5) {
            java.time.Duration r0 = java.time.Duration.ZERO
            int r0 = r5.compareTo(r0)
            if (r0 > 0) goto Lb
            r0 = 0
            return r0
        Lb:
            java.time.temporal.ChronoUnit r0 = java.time.temporal.ChronoUnit.MILLIS
            java.time.Duration r0 = r0.getDuration()
            int r0 = r5.compareTo(r0)
            if (r0 > 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            r2 = 807000000(0x3019d7c0, float:5.5967675E-10)
            long r3 = r5.getSeconds()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 < 0) goto L3f
            long r3 = r5.getSeconds()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L39
            int r3 = r5.getNano()
            if (r3 >= r2) goto L39
            goto L3f
        L39:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L43
        L3f:
            long r3 = r5.toMillis()
        L43:
            return r3
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(kotlinx.coroutines.flow.Flow<? extends T> r2, java.time.Duration r3) {
            long r0 = coerceToMillis(r3)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.debounce(r2, r0)
            return r0
    }

    public static final java.lang.Object delay(java.time.Duration r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            long r0 = coerceToMillis(r2)
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r3)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto Lf
            return r0
        Lf:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public static final <R> void onTimeout(kotlinx.coroutines.selects.SelectBuilder<? super R> r2, java.time.Duration r3, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            long r0 = coerceToMillis(r3)
            kotlinx.coroutines.selects.OnTimeoutKt.onTimeout(r2, r0, r4)
            return
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> sample(kotlinx.coroutines.flow.Flow<? extends T> r2, java.time.Duration r3) {
            long r0 = coerceToMillis(r3)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.sample(r2, r0)
            return r0
    }

    public static final <T> java.lang.Object withTimeout(java.time.Duration r2, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super T> r4) {
            long r0 = coerceToMillis(r2)
            java.lang.Object r0 = kotlinx.coroutines.TimeoutKt.withTimeout(r0, r3, r4)
            return r0
    }

    public static final <T> java.lang.Object withTimeoutOrNull(java.time.Duration r2, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super T> r4) {
            long r0 = coerceToMillis(r2)
            java.lang.Object r0 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r0, r3, r4)
            return r0
    }
}
