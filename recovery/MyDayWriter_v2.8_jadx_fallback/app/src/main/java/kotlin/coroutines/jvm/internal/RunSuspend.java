package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: RunSuspend.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u0002J\u001b\u0010\u000f\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R%\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tX\u0086\u000eø\u0001\u0000¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lkotlin/coroutines/jvm/internal/RunSuspend;", "Lkotlin/coroutines/Continuation;", "", "()V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "result", "Lkotlin/Result;", "getResult-xLWZpok", "()Lkotlin/Result;", "setResult", "(Lkotlin/Result;)V", "await", "resumeWith", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class RunSuspend implements kotlin.coroutines.Continuation<kotlin.Unit> {
    private kotlin.Result<kotlin.Unit> result;

    public RunSuspend() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void await() {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
        L2:
            kotlin.Result<kotlin.Unit> r1 = r3.result     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L13
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r2)     // Catch: java.lang.Throwable -> L1d
            r2 = r3
            java.lang.Object r2 = (java.lang.Object) r2     // Catch: java.lang.Throwable -> L1d
            r2.wait()     // Catch: java.lang.Throwable -> L1d
            goto L2
        L13:
            java.lang.Object r2 = r1.m162unboximpl()     // Catch: java.lang.Throwable -> L1d
            kotlin.ResultKt.throwOnFailure(r2)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return
        L1d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            return r0
    }

    /* JADX INFO: renamed from: getResult-xLWZpok, reason: not valid java name */
    public final kotlin.Result<kotlin.Unit> m1358getResultxLWZpok() {
            r1 = this;
            kotlin.Result<kotlin.Unit> r0 = r1.result
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object r3) {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            kotlin.Result r1 = kotlin.Result.m152boximpl(r3)     // Catch: java.lang.Throwable -> L18
            r2.result = r1     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r1)     // Catch: java.lang.Throwable -> L18
            r1 = r2
            java.lang.Object r1 = (java.lang.Object) r1     // Catch: java.lang.Throwable -> L18
            r1.notifyAll()     // Catch: java.lang.Throwable -> L18
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            return
        L18:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final void setResult(kotlin.Result<kotlin.Unit> r1) {
            r0 = this;
            r0.result = r1
            return
    }
}
