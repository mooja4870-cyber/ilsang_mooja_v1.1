package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\tJ\r\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!J\u001f\u0010\"\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\f2\u0006\u0010$\u001a\u00020%H\u0010¢\u0006\u0002\b&J\u0015\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001cH\u0000¢\u0006\u0002\b(J\u001f\u0010)\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010*\u001a\u00028\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\n\u0018\u00010.j\u0004\u0018\u0001`/H\u0016J\r\u00100\u001a\u000201H\u0000¢\u0006\u0002\b2J\u0015\u00103\u001a\u0002012\u0006\u0010$\u001a\u00020%H\u0000¢\u0006\u0002\b4J\r\u00105\u001a\u00020 H\u0000¢\u0006\u0002\b6JE\u00107\u001a\u00020 2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000092%\b\b\u0010:\u001a\u001f\u0012\u0013\u0012\u00110%¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b($\u0012\u0004\u0012\u00020 \u0018\u00010;H\u0080\b¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u0002012\b\u0010A\u001a\u0004\u0018\u00010\fH\u0080\b¢\u0006\u0002\bBJ\u001e\u0010C\u001a\u00020 2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0080\b¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u00020 2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0016¢\u0006\u0002\u0010EJ\u000f\u0010G\u001a\u0004\u0018\u00010\fH\u0010¢\u0006\u0002\bHJ\b\u0010I\u001a\u00020JH\u0016J\u001b\u0010K\u001a\u0004\u0018\u00010%2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030LH\u0000¢\u0006\u0002\bMR\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004R\u001a\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006N"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "continuation", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "_reusableCancellableContinuation", "Lkotlinx/atomicfu/AtomicRef;", "", "_state", "get_state$kotlinx_coroutines_core$annotations", "()V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "countOrElement", "delegate", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "reusableCancellableContinuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "getReusableCancellableContinuation", "()Lkotlinx/coroutines/CancellableContinuationImpl;", "awaitReusability", "", "awaitReusability$kotlinx_coroutines_core", "cancelCompletedResult", "takenState", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "claimReusableCancellableContinuation", "claimReusableCancellableContinuation$kotlinx_coroutines_core", "dispatchYield", "value", "dispatchYield$kotlinx_coroutines_core", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "isReusable", "", "isReusable$kotlinx_coroutines_core", "postponeCancellation", "postponeCancellation$kotlinx_coroutines_core", "release", "release$kotlinx_coroutines_core", "resumeCancellableWith", "result", "Lkotlin/Result;", "onCancellation", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "resumeCancellableWith$kotlinx_coroutines_core", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "resumeCancelled", "state", "resumeCancelled$kotlinx_coroutines_core", "resumeUndispatchedWith", "resumeUndispatchedWith$kotlinx_coroutines_core", "(Ljava/lang/Object;)V", "resumeWith", "takeState", "takeState$kotlinx_coroutines_core", "toString", "", "tryReleaseClaimedContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "tryReleaseClaimedContinuation$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DispatchedContinuation<T> extends kotlinx.coroutines.DispatchedTask<T> implements kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlin.coroutines.Continuation<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _reusableCancellableContinuation$volatile$FU = null;
    private volatile /* synthetic */ java.lang.Object _reusableCancellableContinuation$volatile;
    public java.lang.Object _state;
    public final kotlin.coroutines.Continuation<T> continuation;
    public final java.lang.Object countOrElement;
    public final kotlinx.coroutines.CoroutineDispatcher dispatcher;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_reusableCancellableContinuation$volatile"
            java.lang.Class<kotlinx.coroutines.internal.DispatchedContinuation> r2 = kotlinx.coroutines.internal.DispatchedContinuation.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$volatile$FU = r0
            return
    }

    public DispatchedContinuation(kotlinx.coroutines.CoroutineDispatcher r2, kotlin.coroutines.Continuation<? super T> r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r0)
            r1.dispatcher = r2
            r1.continuation = r3
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.DispatchedContinuationKt.access$getUNDEFINED$p()
            r1._state = r0
            kotlin.coroutines.CoroutineContext r0 = r1.getContext()
            java.lang.Object r0 = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(r0)
            r1.countOrElement = r0
            return
    }

    private final kotlinx.coroutines.CancellableContinuationImpl<?> getReusableCancellableContinuation() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_reusableCancellableContinuation$volatile$FU()
            java.lang.Object r0 = r0.get(r2)
            boolean r1 = r0 instanceof kotlinx.coroutines.CancellableContinuationImpl
            if (r1 == 0) goto Lf
            kotlinx.coroutines.CancellableContinuationImpl r0 = (kotlinx.coroutines.CancellableContinuationImpl) r0
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    private final /* synthetic */ java.lang.Object get_reusableCancellableContinuation$volatile() {
            r1 = this;
            java.lang.Object r0 = r1._reusableCancellableContinuation$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_reusableCancellableContinuation$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$volatile$FU
            return r0
    }

    public static /* synthetic */ void get_state$kotlinx_coroutines_core$annotations() {
            return
    }

    private final /* synthetic */ void loop$atomicfu(java.lang.Object r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r3.get(r2)
            r4.invoke(r0)
            goto L0
    }

    private final /* synthetic */ void set_reusableCancellableContinuation$volatile(java.lang.Object r1) {
            r0 = this;
            r0._reusableCancellableContinuation$volatile = r1
            return
    }

    public final void awaitReusability$kotlinx_coroutines_core() {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_reusableCancellableContinuation$volatile$FU()
            r1 = r5
        L5:
            java.lang.Object r2 = r0.get(r5)
            r3 = 0
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            if (r2 == r4) goto Lf
            return
        Lf:
            goto L5
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object r2, java.lang.Throwable r3) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.CompletedWithCancellation
            if (r0 == 0) goto Lc
            r0 = r2
            kotlinx.coroutines.CompletedWithCancellation r0 = (kotlinx.coroutines.CompletedWithCancellation) r0
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r0 = r0.onCancellation
            r0.invoke(r3)
        Lc:
            return
    }

    public final kotlinx.coroutines.CancellableContinuationImpl<T> claimReusableCancellableContinuation$kotlinx_coroutines_core() {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_reusableCancellableContinuation$volatile$FU()
            r1 = r7
        L5:
            java.lang.Object r2 = r0.get(r7)
            r3 = 0
            if (r2 != 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_reusableCancellableContinuation$volatile$FU()
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            r4.set(r7, r5)
            r4 = 0
            return r4
        L18:
            boolean r4 = r2 instanceof kotlinx.coroutines.CancellableContinuationImpl
            if (r4 == 0) goto L2c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_reusableCancellableContinuation$volatile$FU()
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r7, r2, r5)
            if (r4 == 0) goto L52
            r4 = r2
            kotlinx.coroutines.CancellableContinuationImpl r4 = (kotlinx.coroutines.CancellableContinuationImpl) r4
            return r4
        L2c:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            if (r2 == r4) goto L52
            boolean r4 = r2 instanceof java.lang.Throwable
            if (r4 == 0) goto L35
            goto L52
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Inconsistent state "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L52:
            goto L5
    }

    public final void dispatchYield$kotlinx_coroutines_core(kotlin.coroutines.CoroutineContext r3, T r4) {
            r2 = this;
            r2._state = r4
            r0 = 1
            r2.resumeMode = r0
            kotlinx.coroutines.CoroutineDispatcher r0 = r2.dispatcher
            r1 = r2
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.dispatchYield(r3, r1)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<T> r0 = r2.continuation
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.Continuation<T> r0 = r1.continuation
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            return r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core() {
            r1 = this;
            r0 = r1
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean isReusable$kotlinx_coroutines_core() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_reusableCancellableContinuation$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public final boolean postponeCancellation$kotlinx_coroutines_core(java.lang.Throwable r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_reusableCancellableContinuation$volatile$FU()
            r1 = r7
        L5:
            java.lang.Object r2 = r0.get(r7)
            r3 = 0
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            r5 = 1
            if (r4 == 0) goto L21
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_reusableCancellableContinuation$volatile$FU()
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r7, r6, r8)
            if (r4 == 0) goto L33
            return r5
        L21:
            boolean r4 = r2 instanceof java.lang.Throwable
            if (r4 == 0) goto L26
            return r5
        L26:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_reusableCancellableContinuation$volatile$FU()
            r5 = 0
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r7, r2, r5)
            if (r4 == 0) goto L33
            r4 = 0
            return r4
        L33:
            goto L5
    }

    public final void release$kotlinx_coroutines_core() {
            r1 = this;
            r1.awaitReusability$kotlinx_coroutines_core()
            kotlinx.coroutines.CancellableContinuationImpl r0 = r1.getReusableCancellableContinuation()
            if (r0 == 0) goto Lc
            r0.detachChild$kotlinx_coroutines_core()
        Lc:
            return
    }

    public final void resumeCancellableWith$kotlinx_coroutines_core(java.lang.Object r23, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r24) {
            r22 = this;
            r1 = r22
            r2 = 0
            java.lang.Object r3 = kotlinx.coroutines.CompletionStateKt.toState(r23, r24)
            kotlinx.coroutines.CoroutineDispatcher r0 = r1.dispatcher
            kotlin.coroutines.CoroutineContext r4 = r1.getContext()
            boolean r0 = r0.isDispatchNeeded(r4)
            r4 = 1
            if (r0 == 0) goto L2c
            r1._state = r3
            r1.resumeMode = r4
            kotlinx.coroutines.CoroutineDispatcher r0 = r1.dispatcher
            kotlin.coroutines.CoroutineContext r4 = r1.getContext()
            r5 = r1
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r0.mo1712dispatch(r4, r5)
            r19 = r2
            r21 = r3
            r3 = r23
            goto L133
        L2c:
            r5 = 1
            r6 = r22
            r7 = 0
            r8 = 0
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L3a
            r0 = 0
        L3a:
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r9 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r0 = r9.isUnconfinedLoopActive()
            if (r0 == 0) goto L59
            r6._state = r3
            r6.resumeMode = r5
            r0 = r6
            kotlinx.coroutines.DispatchedTask r0 = (kotlinx.coroutines.DispatchedTask) r0
            r9.dispatchUnconfined(r0)
            r19 = r2
            r21 = r3
            r3 = r23
            goto L132
        L59:
            r10 = r6
            kotlinx.coroutines.DispatchedTask r10 = (kotlinx.coroutines.DispatchedTask) r10
            r11 = 0
            r9.incrementUseCount(r4)
            r12 = 0
            r0 = r22
            r13 = 0
            kotlin.coroutines.CoroutineContext r15 = r0.getContext()     // Catch: java.lang.Throwable -> L120
            kotlinx.coroutines.Job$Key r16 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> L120
            r14 = r16
            kotlin.coroutines.CoroutineContext$Key r14 = (kotlin.coroutines.CoroutineContext.Key) r14     // Catch: java.lang.Throwable -> L120
            kotlin.coroutines.CoroutineContext$Element r14 = r15.get(r14)     // Catch: java.lang.Throwable -> L120
            kotlinx.coroutines.Job r14 = (kotlinx.coroutines.Job) r14     // Catch: java.lang.Throwable -> L120
            if (r14 == 0) goto La8
            boolean r15 = r14.isActive()     // Catch: java.lang.Throwable -> L9f
            if (r15 != 0) goto La8
            java.util.concurrent.CancellationException r15 = r14.getCancellationException()     // Catch: java.lang.Throwable -> L9f
            r4 = r15
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> L9f
            r0.cancelCompletedResult$kotlinx_coroutines_core(r3, r4)     // Catch: java.lang.Throwable -> L9f
            r4 = r0
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Throwable -> L9f
            kotlin.Result$Companion r17 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L9f
            r17 = r15
            java.lang.Throwable r17 = (java.lang.Throwable) r17     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r17 = kotlin.ResultKt.createFailure(r17)     // Catch: java.lang.Throwable -> L9f
            r18 = r0
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r17)     // Catch: java.lang.Throwable -> L9f
            r4.resumeWith(r0)     // Catch: java.lang.Throwable -> L9f
            r0 = 1
            goto Lab
        L9f:
            r0 = move-exception
            r19 = r2
            r21 = r3
            r3 = r23
            goto L127
        La8:
            r18 = r0
            r0 = 0
        Lab:
            if (r0 != 0) goto L10e
            r4 = r22
            r13 = 0
            kotlin.coroutines.Continuation<T> r0 = r4.continuation     // Catch: java.lang.Throwable -> L120
            java.lang.Object r14 = r4.countOrElement     // Catch: java.lang.Throwable -> L120
            r15 = r0
            r17 = 0
            kotlin.coroutines.CoroutineContext r0 = r15.getContext()     // Catch: java.lang.Throwable -> L120
            r18 = r0
            r1 = r18
            java.lang.Object r0 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r1, r14)     // Catch: java.lang.Throwable -> L120
            r18 = r0
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> L120
            r19 = r2
            r2 = r18
            if (r2 == r0) goto Ld8
            kotlinx.coroutines.UndispatchedCoroutine r0 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r15, r1, r2)     // Catch: java.lang.Throwable -> Ld2
            goto Ld9
        Ld2:
            r0 = move-exception
            r21 = r3
            r3 = r23
            goto L127
        Ld8:
            r0 = 0
        Ld9:
            r18 = r0
            r0 = 0
            r20 = r0
            kotlin.coroutines.Continuation<T> r0 = r4.continuation     // Catch: java.lang.Throwable -> Lfc
            r21 = r3
            r3 = r23
            r0.resumeWith(r3)     // Catch: java.lang.Throwable -> Lfa
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lfa
            if (r18 == 0) goto Lf4
            boolean r0 = r18.clearThreadContext()     // Catch: java.lang.Throwable -> L11e
            if (r0 == 0) goto Lf7
        Lf4:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r1, r2)     // Catch: java.lang.Throwable -> L11e
        Lf7:
            goto L114
        Lfa:
            r0 = move-exception
            goto L101
        Lfc:
            r0 = move-exception
            r21 = r3
            r3 = r23
        L101:
            if (r18 == 0) goto L109
            boolean r20 = r18.clearThreadContext()     // Catch: java.lang.Throwable -> L11e
            if (r20 == 0) goto L10c
        L109:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r1, r2)     // Catch: java.lang.Throwable -> L11e
        L10c:
            throw r0     // Catch: java.lang.Throwable -> L11e
        L10e:
            r19 = r2
            r21 = r3
            r3 = r23
        L114:
        L116:
            boolean r0 = r9.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L11e
            if (r0 != 0) goto L116
            goto L12b
        L11e:
            r0 = move-exception
            goto L127
        L120:
            r0 = move-exception
            r19 = r2
            r21 = r3
            r3 = r23
        L127:
            r1 = 0
            r10.handleFatalException$kotlinx_coroutines_core(r0, r1)     // Catch: java.lang.Throwable -> L134
        L12b:
            r1 = 1
            r9.decrementUseCount(r1)
        L132:
        L133:
            return
        L134:
            r0 = move-exception
            r1 = 1
            r9.decrementUseCount(r1)
            throw r0
    }

    public final boolean resumeCancelled$kotlinx_coroutines_core(java.lang.Object r6) {
            r5 = this;
            r0 = 0
            kotlin.coroutines.CoroutineContext r1 = r5.getContext()
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r2 = (kotlin.coroutines.CoroutineContext.Key) r2
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r2)
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 == 0) goto L36
            boolean r2 = r1.isActive()
            if (r2 != 0) goto L36
            java.util.concurrent.CancellationException r2 = r1.getCancellationException()
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r5.cancelCompletedResult$kotlinx_coroutines_core(r6, r3)
            r3 = r5
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            r4 = r2
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m153constructorimpl(r4)
            r3.resumeWith(r4)
            r3 = 1
            return r3
        L36:
            r2 = 0
            return r2
    }

    public final void resumeUndispatchedWith$kotlinx_coroutines_core(java.lang.Object r10) {
            r9 = this;
            r0 = 0
            kotlin.coroutines.Continuation<T> r1 = r9.continuation
            java.lang.Object r2 = r9.countOrElement
            r3 = 0
            kotlin.coroutines.CoroutineContext r4 = r1.getContext()
            java.lang.Object r5 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r2)
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r5 == r6) goto L17
            kotlinx.coroutines.UndispatchedCoroutine r6 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r1, r4, r5)
            goto L18
        L17:
            r6 = 0
        L18:
            r7 = 0
            kotlin.coroutines.Continuation<T> r8 = r9.continuation     // Catch: java.lang.Throwable -> L32
            r8.resumeWith(r10)     // Catch: java.lang.Throwable -> L32
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L32
            if (r6 == 0) goto L2c
            boolean r7 = r6.clearThreadContext()
            if (r7 == 0) goto L2f
        L2c:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r5)
        L2f:
            return
        L32:
            r7 = move-exception
            if (r6 == 0) goto L3b
            boolean r8 = r6.clearThreadContext()
            if (r8 == 0) goto L3e
        L3b:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r5)
        L3e:
            throw r7
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object r19) {
            r18 = this;
            r1 = r18
            r2 = r19
            kotlin.coroutines.Continuation<T> r0 = r1.continuation
            kotlin.coroutines.CoroutineContext r3 = r0.getContext()
            r4 = 0
            r5 = 1
            java.lang.Object r6 = kotlinx.coroutines.CompletionStateKt.toState$default(r2, r4, r5, r4)
            kotlinx.coroutines.CoroutineDispatcher r0 = r1.dispatcher
            boolean r0 = r0.isDispatchNeeded(r3)
            if (r0 == 0) goto L27
            r1._state = r6
            r0 = 0
            r1.resumeMode = r0
            kotlinx.coroutines.CoroutineDispatcher r0 = r1.dispatcher
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r0.mo1712dispatch(r3, r4)
            goto L98
        L27:
            r0 = 0
            r7 = r18
            r8 = r0
            r9 = 0
            r10 = 0
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L36
            r0 = 0
        L36:
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r11 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r0 = r11.isUnconfinedLoopActive()
            if (r0 == 0) goto L4e
            r7._state = r6
            r7.resumeMode = r8
            r0 = r7
            kotlinx.coroutines.DispatchedTask r0 = (kotlinx.coroutines.DispatchedTask) r0
            r11.dispatchUnconfined(r0)
            goto L97
        L4e:
            r12 = r7
            kotlinx.coroutines.DispatchedTask r12 = (kotlinx.coroutines.DispatchedTask) r12
            r13 = 0
            r11.incrementUseCount(r5)
            r14 = 0
            kotlin.coroutines.CoroutineContext r0 = r1.getContext()     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r15 = r1.countOrElement     // Catch: java.lang.Throwable -> L8b
            r16 = r0
            r17 = 0
            r4 = r16
            java.lang.Object r0 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r15)     // Catch: java.lang.Throwable -> L8b
            r16 = r0
            r0 = 0
            kotlin.coroutines.Continuation<T> r5 = r1.continuation     // Catch: java.lang.Throwable -> L84
            r5.resumeWith(r2)     // Catch: java.lang.Throwable -> L84
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L84
            r5 = r16
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r5)     // Catch: java.lang.Throwable -> L8b
        L7c:
            boolean r0 = r11.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L8b
            if (r0 != 0) goto L7c
            goto L90
        L84:
            r0 = move-exception
            r5 = r16
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r5)     // Catch: java.lang.Throwable -> L8b
            throw r0     // Catch: java.lang.Throwable -> L8b
        L8b:
            r0 = move-exception
            r4 = 0
            r12.handleFatalException$kotlinx_coroutines_core(r0, r4)     // Catch: java.lang.Throwable -> L99
        L90:
            r4 = 1
            r11.decrementUseCount(r4)
        L97:
        L98:
            return
        L99:
            r0 = move-exception
            r4 = 1
            r11.decrementUseCount(r4)
            throw r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Object takeState$kotlinx_coroutines_core() {
            r3 = this;
            java.lang.Object r0 = r3._state
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r1 == 0) goto L1b
            r1 = 0
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.internal.DispatchedContinuationKt.access$getUNDEFINED$p()
            if (r0 == r2) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            if (r2 == 0) goto L15
            goto L1b
        L15:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L1b:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.access$getUNDEFINED$p()
            r3._state = r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DispatchedContinuation["
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlinx.coroutines.CoroutineDispatcher r1 = r2.dispatcher
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlin.coroutines.Continuation<T> r1 = r2.continuation
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.toDebugString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final java.lang.Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core(kotlinx.coroutines.CancellableContinuation<?> r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_reusableCancellableContinuation$volatile$FU()
            r1 = r7
        L5:
            java.lang.Object r2 = r0.get(r7)
            r3 = 0
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            r5 = 0
            if (r2 != r4) goto L1f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_reusableCancellableContinuation$volatile$FU()
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r7, r6, r8)
            if (r4 == 0) goto L1d
            return r5
        L1d:
            goto L5
        L1f:
            boolean r4 = r2 instanceof java.lang.Throwable
            if (r4 == 0) goto L3d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_reusableCancellableContinuation$volatile$FU()
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r7, r2, r5)
            if (r4 == 0) goto L31
            r4 = r2
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            return r4
        L31:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Failed requirement."
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L3d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Inconsistent state "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }
}
