package kotlinx.coroutines;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0097@¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H&¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/Delay;", "", "delay", "", "time", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "context", "Lkotlin/coroutines/CoroutineContext;", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Delay {

    /* JADX INFO: compiled from: Delay.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        public static java.lang.Object delay(kotlinx.coroutines.Delay r6, long r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                r0 = 0
                int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r0 > 0) goto L9
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L9:
                r0 = 0
                r1 = r9
                r2 = 0
                kotlinx.coroutines.CancellableContinuationImpl r3 = new kotlinx.coroutines.CancellableContinuationImpl
                kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
                r5 = 1
                r3.<init>(r4, r5)
                r3.initCancellability()
                r4 = r3
                kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
                r5 = 0
                r6.mo1713scheduleResumeAfterDelay(r7, r4)
                java.lang.Object r1 = r3.getResult()
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r1 != r2) goto L2e
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r9)
            L2e:
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r1 != r2) goto L35
                return r1
            L35:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }

        public static kotlinx.coroutines.DisposableHandle invokeOnTimeout(kotlinx.coroutines.Delay r1, long r2, java.lang.Runnable r4, kotlin.coroutines.CoroutineContext r5) {
                kotlinx.coroutines.Delay r0 = kotlinx.coroutines.DefaultExecutorKt.getDefaultDelay()
                kotlinx.coroutines.DisposableHandle r0 = r0.invokeOnTimeout(r2, r4, r5)
                return r0
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    java.lang.Object delay(long r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r3);

    kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r1, java.lang.Runnable r3, kotlin.coroutines.CoroutineContext r4);

    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    void mo1713scheduleResumeAfterDelay(long r1, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r3);
}
