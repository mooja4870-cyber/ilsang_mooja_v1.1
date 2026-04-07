package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0014J\u0006\u0010\u0011\u001a\u00020\tJ\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "threadLocalIsSet", "", "threadStateToRecover", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "", "afterResume", "", "state", "clearThreadContext", "saveThreadContext", "oldValue", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UndispatchedCoroutine<T> extends kotlinx.coroutines.internal.ScopeCoroutine<T> {
    private volatile boolean threadLocalIsSet;
    private final java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> threadStateToRecover;

    public UndispatchedCoroutine(kotlin.coroutines.CoroutineContext r3, kotlin.coroutines.Continuation<? super T> r4) {
            r2 = this;
            kotlinx.coroutines.UndispatchedMarker r0 = kotlinx.coroutines.UndispatchedMarker.INSTANCE
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r3.get(r0)
            if (r0 != 0) goto L13
            kotlinx.coroutines.UndispatchedMarker r0 = kotlinx.coroutines.UndispatchedMarker.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            kotlin.coroutines.CoroutineContext r0 = r3.plus(r0)
            goto L14
        L13:
            r0 = r3
        L14:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.threadStateToRecover = r0
            kotlin.coroutines.CoroutineContext r0 = r4.getContext()
            kotlin.coroutines.ContinuationInterceptor$Key r1 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Key r1 = (kotlin.coroutines.CoroutineContext.Key) r1
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            boolean r0 = r0 instanceof kotlinx.coroutines.CoroutineDispatcher
            if (r0 != 0) goto L3a
            r0 = 0
            java.lang.Object r0 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r3, r0)
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r3, r0)
            r2.saveThreadContext(r3, r0)
        L3a:
            return
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    protected void afterResume(java.lang.Object r10) {
            r9 = this;
            boolean r0 = r9.threadLocalIsSet
            if (r0 == 0) goto L23
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r9.threadStateToRecover
            java.lang.Object r0 = r0.get()
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 == 0) goto L1d
            r1 = 0
            java.lang.Object r2 = r0.component1()
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            java.lang.Object r0 = r0.component2()
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r2, r0)
        L1d:
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r9.threadStateToRecover
            r0.remove()
        L23:
            kotlin.coroutines.Continuation<T> r0 = r9.uCont
            java.lang.Object r0 = kotlinx.coroutines.CompletionStateKt.recoverResult(r10, r0)
            kotlin.coroutines.Continuation<T> r1 = r9.uCont
            r2 = 0
            r3 = 0
            kotlin.coroutines.CoroutineContext r4 = r1.getContext()
            java.lang.Object r5 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r2)
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r5 == r6) goto L3e
            kotlinx.coroutines.UndispatchedCoroutine r6 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r1, r4, r5)
            goto L3f
        L3e:
            r6 = 0
        L3f:
            r7 = 0
            kotlin.coroutines.Continuation<T> r8 = r9.uCont     // Catch: java.lang.Throwable -> L58
            r8.resumeWith(r0)     // Catch: java.lang.Throwable -> L58
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L53
            boolean r7 = r6.clearThreadContext()
            if (r7 == 0) goto L56
        L53:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r5)
        L56:
            return
        L58:
            r7 = move-exception
            if (r6 == 0) goto L61
            boolean r8 = r6.clearThreadContext()
            if (r8 == 0) goto L64
        L61:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r5)
        L64:
            throw r7
    }

    public final boolean clearThreadContext() {
            r5 = this;
            boolean r0 = r5.threadLocalIsSet
            r1 = 1
            if (r0 == 0) goto Lf
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r5.threadStateToRecover
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = 0
        L10:
            r2 = r0
            r3 = 0
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r4 = r5.threadStateToRecover
            r4.remove()
            r0 = r0 ^ r1
            return r0
    }

    public final void saveThreadContext(kotlin.coroutines.CoroutineContext r3, java.lang.Object r4) {
            r2 = this;
            r0 = 1
            r2.threadLocalIsSet = r0
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r2.threadStateToRecover
            kotlin.Pair r1 = kotlin.TuplesKt.to(r3, r4)
            r0.set(r1)
            return
    }
}
