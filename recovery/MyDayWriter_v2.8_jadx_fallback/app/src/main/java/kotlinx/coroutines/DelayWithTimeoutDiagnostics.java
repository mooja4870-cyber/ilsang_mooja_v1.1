package kotlinx.coroutines;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/DelayWithTimeoutDiagnostics;", "Lkotlinx/coroutines/Delay;", "timeoutMessage", "", "timeout", "Lkotlin/time/Duration;", "timeoutMessage-LRDsOJo", "(J)Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DelayWithTimeoutDiagnostics extends kotlinx.coroutines.Delay {

    /* JADX INFO: compiled from: Delay.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        public static java.lang.Object delay(kotlinx.coroutines.DelayWithTimeoutDiagnostics r2, long r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                r0 = r2
                kotlinx.coroutines.Delay r0 = (kotlinx.coroutines.Delay) r0
                java.lang.Object r0 = kotlinx.coroutines.Delay.DefaultImpls.delay(r0, r3, r5)
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r0 != r1) goto Le
                return r0
            Le:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }

        public static kotlinx.coroutines.DisposableHandle invokeOnTimeout(kotlinx.coroutines.DelayWithTimeoutDiagnostics r1, long r2, java.lang.Runnable r4, kotlin.coroutines.CoroutineContext r5) {
                r0 = r1
                kotlinx.coroutines.Delay r0 = (kotlinx.coroutines.Delay) r0
                kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.Delay.DefaultImpls.invokeOnTimeout(r0, r2, r4, r5)
                return r0
        }
    }

    /* JADX INFO: renamed from: timeoutMessage-LRDsOJo, reason: not valid java name */
    java.lang.String m1646timeoutMessageLRDsOJo(long r1);
}
