package kotlinx.coroutines;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0000\u001a.\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000fH\u0002\u001a\u0019\u0010\u0016\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0080\b\u001a'\u0010\u0019\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010\b\u001a\u00020\t*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\n\"\u0018\u0010\u000b\u001a\u00020\t*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u001e"}, d2 = {"MODE_ATOMIC", "", "MODE_CANCELLABLE", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE_REUSABLE", "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "isCancellableMode", "", "(I)Z", "isReusableMode", "dispatch", "", "T", "Lkotlinx/coroutines/DispatchedTask;", "mode", "resume", "delegate", "Lkotlin/coroutines/Continuation;", "undispatched", "resumeUnconfined", "resumeWithStackTrace", "exception", "", "runUnconfinedEventLoop", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "block", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DispatchedTaskKt {
    public static final int MODE_ATOMIC = 0;
    public static final int MODE_CANCELLABLE = 1;
    public static final int MODE_CANCELLABLE_REUSABLE = 2;
    public static final int MODE_UNDISPATCHED = 4;
    public static final int MODE_UNINITIALIZED = -1;

    public static final <T> void dispatch(kotlinx.coroutines.DispatchedTask<? super T> r5, int r6) {
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L18
            r0 = 0
            r3 = -1
            if (r6 == r3) goto Le
            r0 = r1
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L12
            goto L18
        L12:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L18:
            kotlin.coroutines.Continuation r0 = r5.getDelegate$kotlinx_coroutines_core()
            r3 = 4
            if (r6 != r3) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            if (r1 != 0) goto L4d
            boolean r2 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r2 == 0) goto L4d
            boolean r2 = isCancellableMode(r6)
            int r3 = r5.resumeMode
            boolean r3 = isCancellableMode(r3)
            if (r2 != r3) goto L4d
            r2 = r0
            kotlinx.coroutines.internal.DispatchedContinuation r2 = (kotlinx.coroutines.internal.DispatchedContinuation) r2
            kotlinx.coroutines.CoroutineDispatcher r2 = r2.dispatcher
            kotlin.coroutines.CoroutineContext r3 = r0.getContext()
            boolean r4 = r2.isDispatchNeeded(r3)
            if (r4 == 0) goto L49
            r4 = r5
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r2.mo1712dispatch(r3, r4)
            goto L50
        L49:
            resumeUnconfined(r5)
            goto L50
        L4d:
            resume(r5, r0, r1)
        L50:
            return
    }

    public static /* synthetic */ void getMODE_CANCELLABLE$annotations() {
            return
    }

    public static final boolean isCancellableMode(int r2) {
            r0 = 1
            if (r2 == r0) goto L8
            r1 = 2
            if (r2 != r1) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public static final boolean isReusableMode(int r1) {
            r0 = 2
            if (r1 != r0) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }

    public static final <T> void resume(kotlinx.coroutines.DispatchedTask<? super T> r13, kotlin.coroutines.Continuation<? super T> r14, boolean r15) {
            java.lang.Object r0 = r13.takeState$kotlinx_coroutines_core()
            java.lang.Throwable r1 = r13.getExceptionalResult$kotlinx_coroutines_core(r0)
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            if (r1 == 0) goto L11
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r1)
            goto L15
        L11:
            java.lang.Object r2 = r13.getSuccessfulResult$kotlinx_coroutines_core(r0)
        L15:
            java.lang.Object r2 = kotlin.Result.m153constructorimpl(r2)
            if (r15 == 0) goto L63
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14, r3)
            r3 = r14
            kotlinx.coroutines.internal.DispatchedContinuation r3 = (kotlinx.coroutines.internal.DispatchedContinuation) r3
            r4 = 0
            kotlin.coroutines.Continuation<T> r5 = r3.continuation
            java.lang.Object r6 = r3.countOrElement
            r7 = 0
            kotlin.coroutines.CoroutineContext r8 = r5.getContext()
            java.lang.Object r9 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r8, r6)
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r9 == r10) goto L3b
            kotlinx.coroutines.UndispatchedCoroutine r10 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r5, r8, r9)
            goto L3c
        L3b:
            r10 = 0
        L3c:
            r11 = 0
            kotlin.coroutines.Continuation<T> r12 = r3.continuation     // Catch: java.lang.Throwable -> L56
            r12.resumeWith(r2)     // Catch: java.lang.Throwable -> L56
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L56
            if (r10 == 0) goto L50
            boolean r11 = r10.clearThreadContext()
            if (r11 == 0) goto L53
        L50:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r8, r9)
        L53:
            goto L66
        L56:
            r11 = move-exception
            if (r10 == 0) goto L5f
            boolean r12 = r10.clearThreadContext()
            if (r12 == 0) goto L62
        L5f:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r8, r9)
        L62:
            throw r11
        L63:
            r14.resumeWith(r2)
        L66:
            return
    }

    private static final void resumeUnconfined(kotlinx.coroutines.DispatchedTask<?> r6) {
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r0 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r1 = r0.isUnconfinedLoopActive()
            if (r1 == 0) goto L10
            r0.dispatchUnconfined(r6)
            goto L33
        L10:
            r1 = r6
            r2 = 0
            r3 = 1
            r0.incrementUseCount(r3)
            r4 = 0
            kotlin.coroutines.Continuation r5 = r6.getDelegate$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L29
            resume(r6, r5, r3)     // Catch: java.lang.Throwable -> L29
        L21:
            boolean r4 = r0.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L29
            if (r4 != 0) goto L21
            goto L2e
        L29:
            r4 = move-exception
            r5 = 0
            r1.handleFatalException$kotlinx_coroutines_core(r4, r5)     // Catch: java.lang.Throwable -> L34
        L2e:
            r0.decrementUseCount(r3)
        L33:
            return
        L34:
            r4 = move-exception
            r0.decrementUseCount(r3)
            throw r4
    }

    public static final void resumeWithStackTrace(kotlin.coroutines.Continuation<?> r3, java.lang.Throwable r4) {
            r0 = 0
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            r1 = 0
            boolean r2 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r2 == 0) goto L17
            boolean r2 = r3 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r2 != 0) goto Lf
            goto L17
        Lf:
            r2 = r3
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r2 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r2
            java.lang.Throwable r2 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r4, r2)
            goto L18
        L17:
            r2 = r4
        L18:
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
            r3.resumeWith(r1)
            return
    }

    public static final void runUnconfinedEventLoop(kotlinx.coroutines.DispatchedTask<?> r4, kotlinx.coroutines.EventLoop r5, kotlin.jvm.functions.Function0<kotlin.Unit> r6) {
            r0 = 0
            r1 = 1
            r5.incrementUseCount(r1)
            r6.invoke()     // Catch: java.lang.Throwable -> L11
        L9:
            boolean r2 = r5.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto L9
            goto L16
        L11:
            r2 = move-exception
            r3 = 0
            r4.handleFatalException$kotlinx_coroutines_core(r2, r3)     // Catch: java.lang.Throwable -> L1b
        L16:
            r5.decrementUseCount(r1)
            return
        L1b:
            r2 = move-exception
            r5.decrementUseCount(r1)
            throw r2
    }
}
