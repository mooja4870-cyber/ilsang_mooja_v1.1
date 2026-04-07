package androidx.core.util;

/* JADX INFO: compiled from: Runnable.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/core/util/ContinuationRunnable;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "continuation", "Lkotlin/coroutines/Continuation;", "", "<init>", "(Lkotlin/coroutines/Continuation;)V", "run", "toString", "", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ContinuationRunnable extends java.util.concurrent.atomic.AtomicBoolean implements java.lang.Runnable {
    private final kotlin.coroutines.Continuation<kotlin.Unit> continuation;

    public ContinuationRunnable(kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.continuation = r2
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            r0 = 0
            r1 = 1
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L15
            kotlin.coroutines.Continuation<kotlin.Unit> r0 = r2.continuation
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
            r0.resumeWith(r1)
        L15:
            return
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ContinuationRunnable(ran = "
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.get()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
