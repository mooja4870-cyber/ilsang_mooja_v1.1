package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0003\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082\b\u001aR\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00122%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0012\u0010\u001a\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\r0\u0005H\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"REUSABLE_CLAIMED", "Lkotlinx/coroutines/internal/Symbol;", "UNDEFINED", "executeUnconfined", "", "Lkotlinx/coroutines/internal/DispatchedContinuation;", "contState", "", "mode", "", "doYield", "block", "Lkotlin/Function0;", "", "resumeCancellableWith", "T", "Lkotlin/coroutines/Continuation;", "result", "Lkotlin/Result;", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "yieldUndispatched", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DispatchedContinuationKt {
    public static final kotlinx.coroutines.internal.Symbol REUSABLE_CLAIMED = null;
    private static final kotlinx.coroutines.internal.Symbol UNDEFINED = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "UNDEFINED"
            r0.<init>(r1)
            kotlinx.coroutines.internal.DispatchedContinuationKt.UNDEFINED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "REUSABLE_CLAIMED"
            r0.<init>(r1)
            kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getUNDEFINED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.DispatchedContinuationKt.UNDEFINED
            return r0
    }

    private static final boolean executeUnconfined(kotlinx.coroutines.internal.DispatchedContinuation<?> r8, java.lang.Object r9, int r10, boolean r11, kotlin.jvm.functions.Function0<kotlin.Unit> r12) {
            r0 = 0
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            r1 = 0
            r4 = -1
            if (r10 == r4) goto Lf
            r1 = r3
            goto L10
        Lf:
            r1 = r2
        L10:
            if (r1 == 0) goto L13
            goto L19
        L13:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L19:
            kotlinx.coroutines.ThreadLocalEventLoop r1 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r1 = r1.getEventLoop$kotlinx_coroutines_core()
            if (r11 == 0) goto L28
            boolean r4 = r1.isUnconfinedQueueEmpty()
            if (r4 == 0) goto L28
            return r2
        L28:
            boolean r4 = r1.isUnconfinedLoopActive()
            if (r4 == 0) goto L3a
            r8._state = r9
            r8.resumeMode = r10
            r2 = r8
            kotlinx.coroutines.DispatchedTask r2 = (kotlinx.coroutines.DispatchedTask) r2
            r1.dispatchUnconfined(r2)
            r2 = r3
            goto L58
        L3a:
            r4 = r8
            kotlinx.coroutines.DispatchedTask r4 = (kotlinx.coroutines.DispatchedTask) r4
            r5 = 0
            r1.incrementUseCount(r3)
            r12.invoke()     // Catch: java.lang.Throwable -> L4d
        L45:
            boolean r6 = r1.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L4d
            if (r6 != 0) goto L45
            goto L52
        L4d:
            r6 = move-exception
            r7 = 0
            r4.handleFatalException$kotlinx_coroutines_core(r6, r7)     // Catch: java.lang.Throwable -> L59
        L52:
            r1.decrementUseCount(r3)
        L58:
            return r2
        L59:
            r2 = move-exception
            r1.decrementUseCount(r3)
            throw r2
    }

    static /* synthetic */ boolean executeUnconfined$default(kotlinx.coroutines.internal.DispatchedContinuation r6, java.lang.Object r7, int r8, boolean r9, kotlin.jvm.functions.Function0 r10, int r11, java.lang.Object r12) {
            r11 = r11 & 4
            if (r11 == 0) goto L5
            r9 = 0
        L5:
            r11 = 0
            boolean r12 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L1e
            r12 = 0
            r2 = -1
            if (r8 == r2) goto L14
            r12 = r1
            goto L15
        L14:
            r12 = r0
        L15:
            if (r12 == 0) goto L18
            goto L1e
        L18:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            r12.<init>()
            throw r12
        L1e:
            kotlinx.coroutines.ThreadLocalEventLoop r12 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r12 = r12.getEventLoop$kotlinx_coroutines_core()
            if (r9 == 0) goto L2d
            boolean r2 = r12.isUnconfinedQueueEmpty()
            if (r2 == 0) goto L2d
            return r0
        L2d:
            boolean r2 = r12.isUnconfinedLoopActive()
            if (r2 == 0) goto L3f
            r6._state = r7
            r6.resumeMode = r8
            r0 = r6
            kotlinx.coroutines.DispatchedTask r0 = (kotlinx.coroutines.DispatchedTask) r0
            r12.dispatchUnconfined(r0)
            r0 = r1
            goto L5d
        L3f:
            r2 = r6
            kotlinx.coroutines.DispatchedTask r2 = (kotlinx.coroutines.DispatchedTask) r2
            r3 = 0
            r12.incrementUseCount(r1)
            r10.invoke()     // Catch: java.lang.Throwable -> L52
        L4a:
            boolean r4 = r12.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L52
            if (r4 != 0) goto L4a
            goto L57
        L52:
            r4 = move-exception
            r5 = 0
            r2.handleFatalException$kotlinx_coroutines_core(r4, r5)     // Catch: java.lang.Throwable -> L5e
        L57:
            r12.decrementUseCount(r1)
        L5d:
            return r0
        L5e:
            r0 = move-exception
            r12.decrementUseCount(r1)
            throw r0
    }

    public static final <T> void resumeCancellableWith(kotlin.coroutines.Continuation<? super T> r22, java.lang.Object r23, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r24) {
            r1 = r22
            boolean r0 = r1 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto L145
            r2 = r1
            kotlinx.coroutines.internal.DispatchedContinuation r2 = (kotlinx.coroutines.internal.DispatchedContinuation) r2
            r3 = 0
            java.lang.Object r4 = kotlinx.coroutines.CompletionStateKt.toState(r23, r24)
            kotlinx.coroutines.CoroutineDispatcher r0 = r2.dispatcher
            kotlin.coroutines.CoroutineContext r5 = r2.getContext()
            boolean r0 = r0.isDispatchNeeded(r5)
            r5 = 1
            if (r0 == 0) goto L33
            r2._state = r4
            r2.resumeMode = r5
            kotlinx.coroutines.CoroutineDispatcher r0 = r2.dispatcher
            kotlin.coroutines.CoroutineContext r5 = r2.getContext()
            r6 = r2
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r0.mo1712dispatch(r5, r6)
            r1 = r23
            r18 = r2
            r19 = r3
            goto L13d
        L33:
            r0 = 1
            r6 = r2
            r7 = r0
            r8 = 0
            r9 = 0
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L41
            r0 = 0
        L41:
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r10 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r0 = r10.isUnconfinedLoopActive()
            if (r0 == 0) goto L60
            r6._state = r4
            r6.resumeMode = r7
            r0 = r6
            kotlinx.coroutines.DispatchedTask r0 = (kotlinx.coroutines.DispatchedTask) r0
            r10.dispatchUnconfined(r0)
            r1 = r23
            r18 = r2
            r19 = r3
            goto L13c
        L60:
            r11 = r6
            kotlinx.coroutines.DispatchedTask r11 = (kotlinx.coroutines.DispatchedTask) r11
            r12 = 0
            r10.incrementUseCount(r5)
            r13 = 0
            r0 = r2
            r14 = 0
            kotlin.coroutines.CoroutineContext r15 = r0.getContext()     // Catch: java.lang.Throwable -> L12a
            kotlinx.coroutines.Job$Key r16 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> L12a
            r5 = r16
            kotlin.coroutines.CoroutineContext$Key r5 = (kotlin.coroutines.CoroutineContext.Key) r5     // Catch: java.lang.Throwable -> L12a
            kotlin.coroutines.CoroutineContext$Element r5 = r15.get(r5)     // Catch: java.lang.Throwable -> L12a
            kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5     // Catch: java.lang.Throwable -> L12a
            if (r5 == 0) goto Lae
            boolean r15 = r5.isActive()     // Catch: java.lang.Throwable -> La5
            if (r15 != 0) goto Lae
            java.util.concurrent.CancellationException r15 = r5.getCancellationException()     // Catch: java.lang.Throwable -> La5
            r1 = r15
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> La5
            r0.cancelCompletedResult$kotlinx_coroutines_core(r4, r1)     // Catch: java.lang.Throwable -> La5
            r1 = r0
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1     // Catch: java.lang.Throwable -> La5
            kotlin.Result$Companion r16 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> La5
            r16 = r15
            java.lang.Throwable r16 = (java.lang.Throwable) r16     // Catch: java.lang.Throwable -> La5
            java.lang.Object r16 = kotlin.ResultKt.createFailure(r16)     // Catch: java.lang.Throwable -> La5
            r17 = r0
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r16)     // Catch: java.lang.Throwable -> La5
            r1.resumeWith(r0)     // Catch: java.lang.Throwable -> La5
            r0 = 1
            goto Lb1
        La5:
            r0 = move-exception
            r1 = r23
            r18 = r2
            r19 = r3
            goto L131
        Lae:
            r17 = r0
            r0 = 0
        Lb1:
            if (r0 != 0) goto L118
            r1 = r2
            r5 = 0
            kotlin.coroutines.Continuation<T> r0 = r1.continuation     // Catch: java.lang.Throwable -> L12a
            java.lang.Object r14 = r1.countOrElement     // Catch: java.lang.Throwable -> L12a
            r15 = r0
            r16 = 0
            kotlin.coroutines.CoroutineContext r0 = r15.getContext()     // Catch: java.lang.Throwable -> L12a
            r17 = r0
            r18 = r2
            r2 = r17
            java.lang.Object r0 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r2, r14)     // Catch: java.lang.Throwable -> L112
            r17 = r0
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> L112
            r19 = r3
            r3 = r17
            if (r3 == r0) goto Ldd
            kotlinx.coroutines.UndispatchedCoroutine r0 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r15, r2, r3)     // Catch: java.lang.Throwable -> Ld9
            goto Lde
        Ld9:
            r0 = move-exception
            r1 = r23
            goto L131
        Ldd:
            r0 = 0
        Lde:
            r17 = r0
            r0 = 0
            r20 = r0
            kotlin.coroutines.Continuation<T> r0 = r1.continuation     // Catch: java.lang.Throwable -> L100
            r21 = r1
            r1 = r23
            r0.resumeWith(r1)     // Catch: java.lang.Throwable -> Lfe
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lfe
            if (r17 == 0) goto Lf9
            boolean r0 = r17.clearThreadContext()     // Catch: java.lang.Throwable -> L128
            if (r0 == 0) goto Lfc
        Lf9:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r2, r3)     // Catch: java.lang.Throwable -> L128
        Lfc:
            goto L11e
        Lfe:
            r0 = move-exception
            goto L105
        L100:
            r0 = move-exception
            r21 = r1
            r1 = r23
        L105:
            if (r17 == 0) goto L10d
            boolean r20 = r17.clearThreadContext()     // Catch: java.lang.Throwable -> L128
            if (r20 == 0) goto L110
        L10d:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r2, r3)     // Catch: java.lang.Throwable -> L128
        L110:
            throw r0     // Catch: java.lang.Throwable -> L128
        L112:
            r0 = move-exception
            r1 = r23
            r19 = r3
            goto L131
        L118:
            r1 = r23
            r18 = r2
            r19 = r3
        L11e:
        L120:
            boolean r0 = r10.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L128
            if (r0 != 0) goto L120
            goto L135
        L128:
            r0 = move-exception
            goto L131
        L12a:
            r0 = move-exception
            r1 = r23
            r18 = r2
            r19 = r3
        L131:
            r2 = 0
            r11.handleFatalException$kotlinx_coroutines_core(r0, r2)     // Catch: java.lang.Throwable -> L13f
        L135:
            r2 = 1
            r10.decrementUseCount(r2)
        L13c:
        L13d:
            goto L14a
        L13f:
            r0 = move-exception
            r2 = 1
            r10.decrementUseCount(r2)
            throw r0
        L145:
            r1 = r23
            r22.resumeWith(r23)
        L14a:
            return
    }

    public static /* synthetic */ void resumeCancellableWith$default(kotlin.coroutines.Continuation r0, java.lang.Object r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            resumeCancellableWith(r0, r1, r2)
            return
    }

    public static final boolean yieldUndispatched(kotlinx.coroutines.internal.DispatchedContinuation<? super kotlin.Unit> r12) {
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r1 = 1
            r2 = 1
            r3 = r12
            r4 = 0
            boolean r5 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r5 == 0) goto Le
            r5 = 0
        Le:
            kotlinx.coroutines.ThreadLocalEventLoop r5 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r5 = r5.getEventLoop$kotlinx_coroutines_core()
            boolean r6 = r5.isUnconfinedQueueEmpty()
            r7 = 0
            if (r6 == 0) goto L1c
            goto L51
        L1c:
            boolean r6 = r5.isUnconfinedLoopActive()
            r8 = 1
            if (r6 == 0) goto L2f
            r3._state = r0
            r3.resumeMode = r1
            r6 = r3
            kotlinx.coroutines.DispatchedTask r6 = (kotlinx.coroutines.DispatchedTask) r6
            r5.dispatchUnconfined(r6)
            r7 = r8
            goto L50
        L2f:
            r6 = r3
            kotlinx.coroutines.DispatchedTask r6 = (kotlinx.coroutines.DispatchedTask) r6
            r9 = 0
            r5.incrementUseCount(r8)
            r10 = 0
            r12.run()     // Catch: java.lang.Throwable -> L45
        L3d:
            boolean r10 = r5.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L45
            if (r10 != 0) goto L3d
            goto L4a
        L45:
            r10 = move-exception
            r11 = 0
            r6.handleFatalException$kotlinx_coroutines_core(r10, r11)     // Catch: java.lang.Throwable -> L52
        L4a:
            r5.decrementUseCount(r8)
        L50:
        L51:
            return r7
        L52:
            r7 = move-exception
            r5.decrementUseCount(r8)
            throw r7
    }
}
