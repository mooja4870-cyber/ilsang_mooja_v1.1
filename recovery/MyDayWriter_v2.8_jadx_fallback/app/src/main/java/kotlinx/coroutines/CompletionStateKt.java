package kotlinx.coroutines;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0000¢\u0006\u0002\u0010\u0007\u001aF\u0010\b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012%\b\u0002\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nH\u0000¢\u0006\u0002\u0010\u0010\u001a+\u0010\b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0000¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"recoverResult", "Lkotlin/Result;", "T", "state", "", "uCont", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toState", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "caller", "Lkotlinx/coroutines/CancellableContinuation;", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CompletionStateKt {
    public static final <T> java.lang.Object recoverResult(java.lang.Object r3, kotlin.coroutines.Continuation<? super T> r4) {
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L28
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            r0 = r3
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            r1 = 0
            boolean r2 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r2 == 0) goto L1f
            boolean r2 = r4 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r2 != 0) goto L17
            goto L1f
        L17:
            r2 = r4
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r2 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r2
            java.lang.Throwable r2 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r0, r2)
            r0 = r2
        L1f:
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r0)
            goto L2e
        L28:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r3)
        L2e:
            return r0
    }

    public static final <T> java.lang.Object toState(java.lang.Object r6, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r7) {
            java.lang.Throwable r0 = kotlin.Result.m156exceptionOrNullimpl(r6)
            if (r0 != 0) goto L11
            r0 = r6
            r1 = 0
            if (r7 == 0) goto L10
            kotlinx.coroutines.CompletedWithCancellation r2 = new kotlinx.coroutines.CompletedWithCancellation
            r2.<init>(r0, r7)
            r0 = r2
        L10:
            goto L1b
        L11:
            r1 = 0
            kotlinx.coroutines.CompletedExceptionally r2 = new kotlinx.coroutines.CompletedExceptionally
            r3 = 2
            r4 = 0
            r5 = 0
            r2.<init>(r0, r5, r3, r4)
            r0 = r2
        L1b:
            return r0
    }

    public static final <T> java.lang.Object toState(java.lang.Object r7, kotlinx.coroutines.CancellableContinuation<?> r8) {
            java.lang.Throwable r0 = kotlin.Result.m156exceptionOrNullimpl(r7)
            if (r0 != 0) goto La
            r0 = r7
            r1 = 0
            goto L2e
        La:
            r1 = 0
            kotlinx.coroutines.CompletedExceptionally r2 = new kotlinx.coroutines.CompletedExceptionally
            r3 = 0
            boolean r4 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r4 == 0) goto L26
            r4 = r8
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            boolean r4 = r4 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r4 != 0) goto L1c
            goto L26
        L1c:
            r4 = r8
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r4 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r4
            java.lang.Throwable r4 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r0, r4)
            goto L27
        L26:
            r4 = r0
        L27:
            r3 = 2
            r5 = 0
            r6 = 0
            r2.<init>(r4, r6, r3, r5)
            r0 = r2
        L2e:
            return r0
    }

    public static /* synthetic */ java.lang.Object toState$default(java.lang.Object r0, kotlin.jvm.functions.Function1 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.Object r0 = toState(r0, r1)
            return r0
    }
}
