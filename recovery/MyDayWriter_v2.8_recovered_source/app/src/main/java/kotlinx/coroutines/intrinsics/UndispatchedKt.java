package kotlinx.coroutines.intrinsics;

/* JADX INFO: compiled from: Undispatched.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0082\b\u001aO\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\u0002*\u001e\b\u0001\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n2\u0006\u0010\u000b\u001a\u0002H\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000¢\u0006\u0002\u0010\f\u001a;\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000¢\u0006\u0002\u0010\u000e\u001aV\u0010\u000f\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\u000b\u001a\u0002H\t2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n¢\u0006\u0002\b\u0011H\u0000¢\u0006\u0002\u0010\u0012\u001aV\u0010\u0013\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\u000b\u001a\u0002H\t2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n¢\u0006\u0002\b\u0011H\u0000¢\u0006\u0002\u0010\u0012\u001a?\u0010\u0014\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00062\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0019H\u0082\b¨\u0006\u001a"}, d2 = {"startDirect", "", "T", "completion", "Lkotlin/coroutines/Continuation;", "block", "Lkotlin/Function1;", "", "startCoroutineUndispatched", "R", "Lkotlin/Function2;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "startCoroutineUnintercepted", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "startUndispatchedOrReturn", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/internal/ScopeCoroutine;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "startUndispatchedOrReturnIgnoreTimeout", "undispatchedResult", "shouldThrow", "", "", "startBlock", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UndispatchedKt {
    public static final <R, T> void startCoroutineUndispatched(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r10, R r11, kotlin.coroutines.Continuation<? super T> r12) {
            r0 = 0
            r1 = 0
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r12)
            r2 = r1
            r3 = 0
            kotlin.coroutines.CoroutineContext r4 = r12.getContext()     // Catch: java.lang.Throwable -> L47
            r5 = 0
            r6 = 0
            java.lang.Object r7 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r5)     // Catch: java.lang.Throwable -> L47
            r8 = 0
            boolean r9 = r10 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl     // Catch: java.lang.Throwable -> L42
            if (r9 != 0) goto L1f
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.wrapWithContinuationImpl(r10, r11, r2)     // Catch: java.lang.Throwable -> L42
            goto L2a
        L1f:
            r9 = 2
            java.lang.Object r9 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r10, r9)     // Catch: java.lang.Throwable -> L42
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9     // Catch: java.lang.Throwable -> L42
            java.lang.Object r9 = r9.invoke(r11, r2)     // Catch: java.lang.Throwable -> L42
        L2a:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r7)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 == r2) goto L41
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.Result.m153constructorimpl(r9)
            r1.resumeWith(r2)
        L41:
            goto L56
        L42:
            r8 = move-exception
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r7)     // Catch: java.lang.Throwable -> L47
            throw r8     // Catch: java.lang.Throwable -> L47
        L47:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r3 = kotlin.Result.m153constructorimpl(r3)
            r1.resumeWith(r3)
        L56:
            return
    }

    public static final <T> void startCoroutineUnintercepted(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super T> r6) {
            r0 = 0
            r1 = 0
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r6)
            r2 = r1
            r3 = 0
            boolean r4 = r5 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L13
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.wrapWithContinuationImpl(r5, r2)     // Catch: java.lang.Throwable -> L30
            goto L1e
        L13:
            r4 = 1
            java.lang.Object r4 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r5, r4)     // Catch: java.lang.Throwable -> L30
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r4.invoke(r2)     // Catch: java.lang.Throwable -> L30
        L1e:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 == r2) goto L2f
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.Result.m153constructorimpl(r4)
            r1.resumeWith(r2)
        L2f:
            goto L3f
        L30:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r3 = kotlin.Result.m153constructorimpl(r3)
            r1.resumeWith(r3)
        L3f:
            return
    }

    private static final <T> void startDirect(kotlin.coroutines.Continuation<? super T> r4, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r5) {
            r0 = 0
            r1 = 0
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r4)
            java.lang.Object r2 = r5.invoke(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 == r3) goto L1c
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.Result.m153constructorimpl(r2)
            r1.resumeWith(r3)
        L1c:
            return
        L1d:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r3 = kotlin.Result.m153constructorimpl(r3)
            r1.resumeWith(r3)
            return
    }

    public static final <T, R> java.lang.Object startUndispatchedOrReturn(kotlinx.coroutines.internal.ScopeCoroutine<? super T> r8, R r9, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r10) {
            r0 = r8
            r1 = 0
            r2 = 0
            r3 = 2
            boolean r4 = r10 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl     // Catch: java.lang.Throwable -> L1f
            if (r4 != 0) goto L11
            r4 = r8
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.wrapWithContinuationImpl(r10, r9, r4)     // Catch: java.lang.Throwable -> L1f
            goto L1e
        L11:
            java.lang.Object r4 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r10, r3)     // Catch: java.lang.Throwable -> L1f
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4     // Catch: java.lang.Throwable -> L1f
            r5 = r8
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r3 = r4.invoke(r9, r5)     // Catch: java.lang.Throwable -> L1f
        L1e:
            goto L28
        L1f:
            r2 = move-exception
            kotlinx.coroutines.CompletedExceptionally r4 = new kotlinx.coroutines.CompletedExceptionally
            r5 = 0
            r6 = 0
            r4.<init>(r2, r5, r3, r6)
            r3 = r4
        L28:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r2) goto L34
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            goto L6f
        L34:
            java.lang.Object r2 = r0.makeCompletingOnce$kotlinx_coroutines_core(r3)
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r2 != r4) goto L42
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r2 = r4
            goto L6f
        L42:
            boolean r4 = r2 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r4 == 0) goto L6a
        L47:
            r4 = r2
            kotlinx.coroutines.CompletedExceptionally r4 = (kotlinx.coroutines.CompletedExceptionally) r4
            java.lang.Throwable r4 = r4.cause
            r5 = 0
            r4 = r2
            kotlinx.coroutines.CompletedExceptionally r4 = (kotlinx.coroutines.CompletedExceptionally) r4
            java.lang.Throwable r4 = r4.cause
            kotlin.coroutines.Continuation<T> r5 = r0.uCont
            r6 = 0
            boolean r7 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r7 == 0) goto L69
            boolean r7 = r5 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r7 != 0) goto L61
            goto L69
        L61:
            r7 = r5
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r7 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r7
            java.lang.Throwable r7 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r4, r7)
            r4 = r7
        L69:
            throw r4
        L6a:
            java.lang.Object r4 = kotlinx.coroutines.JobSupportKt.unboxState(r2)
            r2 = r4
        L6f:
            return r2
    }

    public static final <T, R> java.lang.Object startUndispatchedOrReturnIgnoreTimeout(kotlinx.coroutines.internal.ScopeCoroutine<? super T> r8, R r9, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r10) {
            r0 = r8
            r1 = 0
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r5 = r10 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl     // Catch: java.lang.Throwable -> L20
            if (r5 != 0) goto L12
            r5 = r8
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.wrapWithContinuationImpl(r10, r9, r5)     // Catch: java.lang.Throwable -> L20
            goto L1f
        L12:
            java.lang.Object r5 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r10, r3)     // Catch: java.lang.Throwable -> L20
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5     // Catch: java.lang.Throwable -> L20
            r6 = r8
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r5.invoke(r9, r6)     // Catch: java.lang.Throwable -> L20
        L1f:
            goto L28
        L20:
            r2 = move-exception
            kotlinx.coroutines.CompletedExceptionally r5 = new kotlinx.coroutines.CompletedExceptionally
            r6 = 0
            r5.<init>(r2, r4, r3, r6)
            r3 = r5
        L28:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r2) goto L35
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            goto L9f
        L35:
            java.lang.Object r2 = r0.makeCompletingOnce$kotlinx_coroutines_core(r3)
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r2 != r5) goto L43
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r2 = r4
            goto L9f
        L43:
            boolean r5 = r2 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r5 == 0) goto L9a
        L48:
            r5 = r2
            kotlinx.coroutines.CompletedExceptionally r5 = (kotlinx.coroutines.CompletedExceptionally) r5
            java.lang.Throwable r5 = r5.cause
            r6 = 0
            boolean r7 = r5 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r7 == 0) goto L59
            r7 = r5
            kotlinx.coroutines.TimeoutCancellationException r7 = (kotlinx.coroutines.TimeoutCancellationException) r7
            kotlinx.coroutines.Job r7 = r7.coroutine
            if (r7 == r8) goto L5a
        L59:
            r4 = 1
        L5a:
            if (r4 == 0) goto L78
            r4 = r2
            kotlinx.coroutines.CompletedExceptionally r4 = (kotlinx.coroutines.CompletedExceptionally) r4
            java.lang.Throwable r4 = r4.cause
            kotlin.coroutines.Continuation<T> r5 = r0.uCont
            r6 = 0
            boolean r7 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r7 == 0) goto L77
            boolean r7 = r5 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r7 != 0) goto L6f
            goto L77
        L6f:
            r7 = r5
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r7 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r7
            java.lang.Throwable r7 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r4, r7)
            r4 = r7
        L77:
            throw r4
        L78:
            boolean r4 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r4 == 0) goto L98
            r4 = r3
            kotlinx.coroutines.CompletedExceptionally r4 = (kotlinx.coroutines.CompletedExceptionally) r4
            java.lang.Throwable r4 = r4.cause
            kotlin.coroutines.Continuation<T> r5 = r0.uCont
            r6 = 0
            boolean r7 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r7 == 0) goto L97
            boolean r7 = r5 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r7 != 0) goto L8f
            goto L97
        L8f:
            r7 = r5
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r7 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r7
            java.lang.Throwable r7 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r4, r7)
            r4 = r7
        L97:
            throw r4
        L98:
            r4 = r3
            goto L9e
        L9a:
            java.lang.Object r4 = kotlinx.coroutines.JobSupportKt.unboxState(r2)
        L9e:
            r2 = r4
        L9f:
            return r2
    }

    private static final <T> java.lang.Object undispatchedResult(kotlinx.coroutines.internal.ScopeCoroutine<? super T> r7, kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> r8, kotlin.jvm.functions.Function0<? extends java.lang.Object> r9) {
            r0 = 0
            java.lang.Object r1 = r9.invoke()     // Catch: java.lang.Throwable -> L7
            goto L11
        L7:
            r1 = move-exception
            kotlinx.coroutines.CompletedExceptionally r2 = new kotlinx.coroutines.CompletedExceptionally
            r3 = 2
            r4 = 0
            r5 = 0
            r2.<init>(r1, r5, r3, r4)
            r1 = r2
        L11:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L1d
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r2
        L1d:
            java.lang.Object r2 = r7.makeCompletingOnce$kotlinx_coroutines_core(r1)
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r2 != r3) goto L2a
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r3
        L2a:
            boolean r3 = r2 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r3 == 0) goto L7e
        L2f:
            r3 = r2
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            java.lang.Throwable r3 = r3.cause
            java.lang.Object r3 = r8.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L5c
            r3 = r2
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            java.lang.Throwable r3 = r3.cause
            kotlin.coroutines.Continuation<T> r4 = r7.uCont
            r5 = 0
            boolean r6 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r6 == 0) goto L5b
            boolean r6 = r4 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r6 != 0) goto L53
            goto L5b
        L53:
            r6 = r4
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r6 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r6
            java.lang.Throwable r6 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r3, r6)
            r3 = r6
        L5b:
            throw r3
        L5c:
            boolean r3 = r1 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r3 == 0) goto L7c
            r3 = r1
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            java.lang.Throwable r3 = r3.cause
            kotlin.coroutines.Continuation<T> r4 = r7.uCont
            r5 = 0
            boolean r6 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r6 == 0) goto L7b
            boolean r6 = r4 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r6 != 0) goto L73
            goto L7b
        L73:
            r6 = r4
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r6 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r6
            java.lang.Throwable r6 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r3, r6)
            r3 = r6
        L7b:
            throw r3
        L7c:
            r3 = r1
            goto L82
        L7e:
            java.lang.Object r3 = kotlinx.coroutines.JobSupportKt.unboxState(r2)
        L82:
            return r3
    }
}
