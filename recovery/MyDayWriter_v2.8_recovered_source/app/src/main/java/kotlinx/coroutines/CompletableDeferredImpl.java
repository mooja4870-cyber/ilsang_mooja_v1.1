package kotlinx.coroutines;

/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\r\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/CompletableDeferredImpl;", "T", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/CompletableDeferred;", "parent", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "onAwait", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwait", "()Lkotlinx/coroutines/selects/SelectClause1;", "onCancelComplete", "", "getOnCancelComplete$kotlinx_coroutines_core", "()Z", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "value", "(Ljava/lang/Object;)Z", "completeExceptionally", "exception", "", "getCompleted", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class CompletableDeferredImpl<T> extends kotlinx.coroutines.JobSupport implements kotlinx.coroutines.CompletableDeferred<T> {
    public CompletableDeferredImpl(kotlinx.coroutines.Job r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.initParentJob(r2)
            return
    }

    @Override // kotlinx.coroutines.Deferred
    public java.lang.Object await(kotlin.coroutines.Continuation<? super T> r2) {
            r1 = this;
            java.lang.Object r0 = r1.awaitInternal(r2)
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r0
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public boolean complete(T r2) {
            r1 = this;
            boolean r0 = r1.makeCompleting$kotlinx_coroutines_core(r2)
            return r0
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public boolean completeExceptionally(java.lang.Throwable r5) {
            r4 = this;
            kotlinx.coroutines.CompletedExceptionally r0 = new kotlinx.coroutines.CompletedExceptionally
            r1 = 2
            r2 = 0
            r3 = 0
            r0.<init>(r5, r3, r1, r2)
            boolean r0 = r4.makeCompleting$kotlinx_coroutines_core(r0)
            return r0
    }

    @Override // kotlinx.coroutines.Deferred
    public T getCompleted() {
            r1 = this;
            java.lang.Object r0 = r1.getCompletedInternal$kotlinx_coroutines_core()
            return r0
    }

    @Override // kotlinx.coroutines.Deferred
    public kotlinx.coroutines.selects.SelectClause1<T> getOnAwait() {
            r2 = this;
            kotlinx.coroutines.selects.SelectClause1 r0 = r2.getOnAwaitInternal()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            return r0
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
            r1 = this;
            r0 = 1
            return r0
    }
}
