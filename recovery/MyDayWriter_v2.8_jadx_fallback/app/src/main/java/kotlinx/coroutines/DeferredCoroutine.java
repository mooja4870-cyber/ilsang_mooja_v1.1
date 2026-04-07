package kotlinx.coroutines;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u000eJ\r\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/DeferredCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Lkotlinx/coroutines/Deferred;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "active", "", "(Lkotlin/coroutines/CoroutineContext;Z)V", "onAwait", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwait", "()Lkotlinx/coroutines/selects/SelectClause1;", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompleted", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
class DeferredCoroutine<T> extends kotlinx.coroutines.AbstractCoroutine<T> implements kotlinx.coroutines.Deferred<T> {
    public DeferredCoroutine(kotlin.coroutines.CoroutineContext r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r3)
            return
    }

    static /* synthetic */ <T> java.lang.Object await$suspendImpl(kotlinx.coroutines.DeferredCoroutine<T> r1, kotlin.coroutines.Continuation<? super T> r2) {
            java.lang.Object r0 = r1.awaitInternal(r2)
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r0
    }

    @Override // kotlinx.coroutines.Deferred
    public java.lang.Object await(kotlin.coroutines.Continuation<? super T> r2) {
            r1 = this;
            java.lang.Object r0 = await$suspendImpl(r1, r2)
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
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            return r0
    }
}
