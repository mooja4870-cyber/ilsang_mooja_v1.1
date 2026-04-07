package kotlinx.coroutines;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u000f\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\b\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002R\u000b\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/DispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "_decision", "Lkotlinx/atomicfu/AtomicInt;", "afterCompletion", "", "state", "", "afterResume", "getResult", "getResult$kotlinx_coroutines_core", "tryResume", "", "trySuspend", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DispatchedCoroutine<T> extends kotlinx.coroutines.internal.ScopeCoroutine<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _decision$volatile$FU = null;
    private volatile /* synthetic */ int _decision$volatile;

    static {
            java.lang.Class<kotlinx.coroutines.DispatchedCoroutine> r0 = kotlinx.coroutines.DispatchedCoroutine.class
            java.lang.String r1 = "_decision$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.DispatchedCoroutine._decision$volatile$FU = r0
            return
    }

    public DispatchedCoroutine(kotlin.coroutines.CoroutineContext r1, kotlin.coroutines.Continuation<? super T> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater get_decision$volatile$FU$kotlinx_coroutines_core() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.DispatchedCoroutine._decision$volatile$FU
            return r0
    }

    private final /* synthetic */ void loop$atomicfu(java.lang.Object r2, java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r4) {
            r1 = this;
        L0:
            int r0 = r3.get(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.invoke(r0)
            goto L0
    }

    private final boolean tryResume() {
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_decision$volatile$FU$kotlinx_coroutines_core()
            r1 = r7
        L5:
            int r2 = r0.get(r7)
            r3 = 0
            r4 = 0
            switch(r2) {
                case 0: goto L1b;
                case 1: goto L1a;
                default: goto Le;
            }
        Le:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already resumed"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L1a:
            return r4
        L1b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = get_decision$volatile$FU$kotlinx_coroutines_core()
            r6 = 2
            boolean r4 = r5.compareAndSet(r7, r4, r6)
            if (r4 == 0) goto L28
            r4 = 1
            return r4
        L28:
            goto L5
    }

    private final boolean trySuspend() {
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_decision$volatile$FU$kotlinx_coroutines_core()
            r1 = r7
        L5:
            int r2 = r0.get(r7)
            r3 = 0
            r4 = 0
            switch(r2) {
                case 0: goto L1b;
                case 1: goto Le;
                case 2: goto L1a;
                default: goto Le;
            }
        Le:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already suspended"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L1a:
            return r4
        L1b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = get_decision$volatile$FU$kotlinx_coroutines_core()
            r6 = 1
            boolean r4 = r5.compareAndSet(r7, r4, r6)
            if (r4 == 0) goto L27
            return r6
        L27:
            goto L5
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    protected void afterCompletion(java.lang.Object r1) {
            r0 = this;
            r0.afterResume(r1)
            return
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    protected void afterResume(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r4.tryResume()
            if (r0 == 0) goto L7
            return
        L7:
            kotlin.coroutines.Continuation<T> r0 = r4.uCont
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            kotlin.coroutines.Continuation<T> r1 = r4.uCont
            java.lang.Object r1 = kotlinx.coroutines.CompletionStateKt.recoverResult(r5, r1)
            r2 = 2
            r3 = 0
            kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith$default(r0, r1, r3, r2, r3)
            return
    }

    public final java.lang.Object getResult$kotlinx_coroutines_core() {
            r2 = this;
            boolean r0 = r2.trySuspend()
            if (r0 == 0) goto Lb
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r0
        Lb:
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            java.lang.Object r0 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L18
            return r0
        L18:
            r1 = r0
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            java.lang.Throwable r1 = r1.cause
            throw r1
    }
}
