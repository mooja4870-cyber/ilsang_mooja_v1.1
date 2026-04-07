package kotlinx.coroutines;

/* JADX INFO: compiled from: Future.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¨\u0006\b"}, d2 = {"cancelFutureOnCancellation", "", "Lkotlinx/coroutines/CancellableContinuation;", "future", "Ljava/util/concurrent/Future;", "cancelFutureOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
final /* synthetic */ class JobKt__FutureKt {
    public static final void cancelFutureOnCancellation(kotlinx.coroutines.CancellableContinuation<?> r1, java.util.concurrent.Future<?> r2) {
            kotlinx.coroutines.CancelFutureOnCancel r0 = new kotlinx.coroutines.CancelFutureOnCancel
            r0.<init>(r2)
            kotlinx.coroutines.CancelHandler r0 = (kotlinx.coroutines.CancelHandler) r0
            kotlinx.coroutines.CancellableContinuationKt.invokeOnCancellation(r1, r0)
            return
    }

    public static final kotlinx.coroutines.DisposableHandle cancelFutureOnCompletion(kotlinx.coroutines.Job r7, java.util.concurrent.Future<?> r8) {
            kotlinx.coroutines.CancelFutureOnCompletion r0 = new kotlinx.coroutines.CancelFutureOnCompletion
            r0.<init>(r8)
            r4 = r0
            kotlinx.coroutines.InternalCompletionHandler r4 = (kotlinx.coroutines.InternalCompletionHandler) r4
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r1 = r7
            kotlinx.coroutines.DisposableHandle r7 = kotlinx.coroutines.JobKt.invokeOnCompletion$default(r1, r2, r3, r4, r5, r6)
            return r7
    }
}
