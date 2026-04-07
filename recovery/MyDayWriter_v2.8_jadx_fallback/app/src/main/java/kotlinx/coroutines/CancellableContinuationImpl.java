package kotlinx.coroutines;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001b\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103J\u001a\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002042\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u0017\u00105\u001a\u00020/2\f\u00106\u001a\b\u0012\u0004\u0012\u00020/07H\u0082\bJ1\u00108\u001a\u00020/2!\u00109\u001a\u001d\u0012\u0013\u0012\u001103¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/0:2\u0006\u00102\u001a\u000203J\u001e\u0010=\u001a\u00020/2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030?2\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u0012\u0010@\u001a\u00020\u001d2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u001f\u0010A\u001a\u00020/2\b\u0010B\u001a\u0004\u0018\u00010\u00122\u0006\u00102\u001a\u000203H\u0010¢\u0006\u0002\bCJ\u0010\u0010D\u001a\u00020\u001d2\u0006\u00102\u001a\u000203H\u0002J\u0010\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020\u0012H\u0016J\r\u0010G\u001a\u00020/H\u0000¢\u0006\u0002\bHJ\b\u0010I\u001a\u00020/H\u0002J\u0010\u0010J\u001a\u00020/2\u0006\u0010K\u001a\u00020\nH\u0002J\u0010\u0010L\u001a\u0002032\u0006\u0010M\u001a\u00020NH\u0016J\u0019\u0010O\u001a\u0004\u0018\u0001032\b\u0010$\u001a\u0004\u0018\u00010\u0012H\u0010¢\u0006\u0002\bPJ\n\u0010Q\u001a\u0004\u0018\u00010\u0012H\u0001J\u0010\u0010R\u001a\n\u0018\u00010Sj\u0004\u0018\u0001`TH\u0016J\u001f\u0010U\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010$\u001a\u0004\u0018\u00010\u0012H\u0010¢\u0006\u0004\bV\u0010WJ\b\u0010X\u001a\u00020/H\u0016J\n\u0010Y\u001a\u0004\u0018\u00010\u0010H\u0002J1\u0010Z\u001a\u00020/2'\u00100\u001a#\u0012\u0015\u0012\u0013\u0018\u000103¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/0:j\u0002`[H\u0016J\u001c\u0010Z\u001a\u00020/2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030?2\u0006\u0010\\\u001a\u00020\nH\u0016J\u0010\u0010]\u001a\u00020/2\u0006\u00100\u001a\u00020\u0012H\u0002J\u0015\u0010^\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0000¢\u0006\u0002\b_J\b\u0010`\u001a\u00020\u001dH\u0002J\u001a\u0010a\u001a\u00020/2\u0006\u00100\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010b\u001a\u00020(H\u0014J\u0015\u0010c\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0000¢\u0006\u0002\bdJ\r\u0010e\u001a\u00020/H\u0000¢\u0006\u0002\bfJ\b\u0010g\u001a\u00020\u001dH\u0001J:\u0010h\u001a\u00020/2\u0006\u0010i\u001a\u00028\u00002#\u00109\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u00010:H\u0016¢\u0006\u0002\u0010jJA\u0010k\u001a\u00020/2\b\u0010-\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\n2%\b\u0002\u00109\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u00010:H\u0002J\u001b\u0010l\u001a\u00020/2\f\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000nH\u0016¢\u0006\u0002\u0010oJS\u0010p\u001a\u0004\u0018\u00010\u00122\u0006\u0010$\u001a\u00020q2\b\u0010-\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\n2#\u00109\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u00010:2\b\u0010r\u001a\u0004\u0018\u00010\u0012H\u0002J\u000f\u0010s\u001a\u0004\u0018\u00010\u0012H\u0010¢\u0006\u0002\btJ\b\u0010u\u001a\u00020(H\u0016J\b\u0010v\u001a\u00020\u001dH\u0002J!\u0010v\u001a\u0004\u0018\u00010\u00122\u0006\u0010i\u001a\u00028\u00002\b\u0010r\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010wJF\u0010v\u001a\u0004\u0018\u00010\u00122\u0006\u0010i\u001a\u00028\u00002\b\u0010r\u001a\u0004\u0018\u00010\u00122#\u00109\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u00010:H\u0016¢\u0006\u0002\u0010xJC\u0010y\u001a\u0004\u0018\u00010z2\b\u0010-\u001a\u0004\u0018\u00010\u00122\b\u0010r\u001a\u0004\u0018\u00010\u00122#\u00109\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u00010:H\u0002J\u0012\u0010{\u001a\u0004\u0018\u00010\u00122\u0006\u0010|\u001a\u000203H\u0016J\b\u0010}\u001a\u00020\u001dH\u0002J\u001a\u0010~\u001a\u00020/*\u00020\u007f2\u0006\u0010i\u001a\u00028\u0000H\u0016¢\u0006\u0003\u0010\u0080\u0001J\u0015\u0010\u0081\u0001\u001a\u00020/*\u00020\u007f2\u0006\u0010|\u001a\u000203H\u0016R\t\u0010\f\u001a\u00020\rX\u0082\u0004R\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004R\u0011\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fX\u0082\u0004R\u001c\u0010\u0013\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006\u0082\u0001"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/Waiter;", "delegate", "Lkotlin/coroutines/Continuation;", "resumeMode", "", "(Lkotlin/coroutines/Continuation;I)V", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicInt;", "_parentHandle", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/DisposableHandle;", "_state", "", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "isActive", "", "()Z", "isCancelled", "isCompleted", "parentHandle", "getParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "stateDebugRepresentation", "", "getStateDebugRepresentation", "()Ljava/lang/String;", "alreadyResumedError", "", "proposedUpdate", "callCancelHandler", "", "handler", "Lkotlinx/coroutines/CancelHandler;", "cause", "", "Lkotlinx/coroutines/InternalCompletionHandler;", "callCancelHandlerSafely", "block", "Lkotlin/Function0;", "callOnCancellation", "onCancellation", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "callSegmentOnCancellation", "segment", "Lkotlinx/coroutines/internal/Segment;", "cancel", "cancelCompletedResult", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "cancelLater", "completeResume", "token", "detachChild", "detachChild$kotlinx_coroutines_core", "detachChildIfNonResuable", "dispatchResume", "mode", "getContinuationCancellationCause", "parent", "Lkotlinx/coroutines/Job;", "getExceptionalResult", "getExceptionalResult$kotlinx_coroutines_core", "getResult", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "initCancellability", "installParentHandle", "invokeOnCancellation", "Lkotlinx/coroutines/CompletionHandler;", "index", "invokeOnCancellationImpl", "invokeOnCancellationInternal", "invokeOnCancellationInternal$kotlinx_coroutines_core", "isReusable", "multipleHandlersError", "nameString", "parentCancelled", "parentCancelled$kotlinx_coroutines_core", "releaseClaimedReusableContinuation", "releaseClaimedReusableContinuation$kotlinx_coroutines_core", "resetStateReusable", "resume", "value", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "resumeImpl", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "resumedState", "Lkotlinx/coroutines/NotCompleted;", "idempotent", "takeState", "takeState$kotlinx_coroutines_core", "toString", "tryResume", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tryResumeImpl", "Lkotlinx/coroutines/internal/Symbol;", "tryResumeWithException", "exception", "trySuspend", "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class CancellableContinuationImpl<T> extends kotlinx.coroutines.DispatchedTask<T> implements kotlinx.coroutines.CancellableContinuation<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.Waiter {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _decisionAndIndex$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _parentHandle$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$volatile$FU = null;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;
    private final kotlin.coroutines.CoroutineContext context;
    private final kotlin.coroutines.Continuation<T> delegate;

    static {
            java.lang.String r0 = "_decisionAndIndex$volatile"
            java.lang.Class<kotlinx.coroutines.CancellableContinuationImpl> r1 = kotlinx.coroutines.CancellableContinuationImpl.class
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.CancellableContinuationImpl._decisionAndIndex$volatile$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "_state$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.CancellableContinuationImpl._state$volatile$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "_parentHandle$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.CancellableContinuationImpl._parentHandle$volatile$FU = r0
            return
    }

    public CancellableContinuationImpl(kotlin.coroutines.Continuation<? super T> r5, int r6) {
            r4 = this;
            r4.<init>(r6)
            r4.delegate = r5
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L1c
            r0 = 0
            r1 = -1
            if (r6 == r1) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L16
            goto L1c
        L16:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1c:
            kotlin.coroutines.Continuation<T> r0 = r4.delegate
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            r4.context = r0
            r0 = 0
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r2 = 0
            int r3 = r0 << 29
            int r3 = r3 + r1
            r4._decisionAndIndex$volatile = r3
            kotlinx.coroutines.Active r0 = kotlinx.coroutines.Active.INSTANCE
            r4._state$volatile = r0
            return
    }

    private final java.lang.Void alreadyResumedError(java.lang.Object r4) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Already resumed, but proposed with update "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final void callCancelHandler(kotlinx.coroutines.InternalCompletionHandler r8, java.lang.Throwable r9) {
            r7 = this;
            r0 = r7
            r1 = 0
            r2 = 0
            r8.invoke(r9)     // Catch: java.lang.Throwable -> L8
            goto L2a
        L8:
            r2 = move-exception
            kotlin.coroutines.CoroutineContext r3 = r0.getContext()
            kotlinx.coroutines.CompletionHandlerException r4 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Exception in invokeOnCancellation handler for "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5, r2)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r3, r4)
        L2a:
            return
    }

    private final void callCancelHandlerSafely(kotlin.jvm.functions.Function0<kotlin.Unit> r7) {
            r6 = this;
            r0 = 0
            r7.invoke()     // Catch: java.lang.Throwable -> L6
            goto L28
        L6:
            r1 = move-exception
            kotlin.coroutines.CoroutineContext r2 = r6.getContext()
            kotlinx.coroutines.CompletionHandlerException r3 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Exception in invokeOnCancellation handler for "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4, r1)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r2, r3)
        L28:
            return
    }

    private final void callSegmentOnCancellation(kotlinx.coroutines.internal.Segment<?> r9, java.lang.Throwable r10) {
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_decisionAndIndex$volatile$FU()
            int r0 = r0.get(r8)
            r1 = 0
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r0 = r0 & r2
            if (r0 == r2) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L45
            r1 = r8
            r2 = 0
            r3 = 0
            kotlin.coroutines.CoroutineContext r4 = r8.getContext()     // Catch: java.lang.Throwable -> L21
            r9.onCancellation(r0, r10, r4)     // Catch: java.lang.Throwable -> L21
            goto L43
        L21:
            r3 = move-exception
            kotlin.coroutines.CoroutineContext r4 = r1.getContext()
            kotlinx.coroutines.CompletionHandlerException r5 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Exception in invokeOnCancellation handler for "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6, r3)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r4, r5)
        L43:
            return
        L45:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The index for Segment.onCancellation(..) is broken"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private final boolean cancelLater(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r2.isReusable()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            kotlin.coroutines.Continuation<T> r0 = r2.delegate
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            boolean r1 = r0.postponeCancellation$kotlinx_coroutines_core(r3)
            return r1
    }

    private final void detachChildIfNonResuable() {
            r1 = this;
            boolean r0 = r1.isReusable()
            if (r0 != 0) goto L9
            r1.detachChild$kotlinx_coroutines_core()
        L9:
            return
    }

    private final void dispatchResume(int r2) {
            r1 = this;
            boolean r0 = r1.tryResume()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = r1
            kotlinx.coroutines.DispatchedTask r0 = (kotlinx.coroutines.DispatchedTask) r0
            kotlinx.coroutines.DispatchedTaskKt.dispatch(r0, r2)
            return
    }

    private final kotlinx.coroutines.DisposableHandle getParentHandle() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_parentHandle$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.DisposableHandle r0 = (kotlinx.coroutines.DisposableHandle) r0
            return r0
    }

    private final java.lang.String getStateDebugRepresentation() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.NotCompleted
            if (r1 == 0) goto Lb
            java.lang.String r0 = "Active"
            goto L14
        Lb:
            boolean r0 = r0 instanceof kotlinx.coroutines.CancelledContinuation
            if (r0 == 0) goto L12
            java.lang.String r0 = "Cancelled"
            goto L14
        L12:
            java.lang.String r0 = "Completed"
        L14:
            return r0
    }

    private final /* synthetic */ int get_decisionAndIndex$volatile() {
            r1 = this;
            int r0 = r1._decisionAndIndex$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater get_decisionAndIndex$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._decisionAndIndex$volatile$FU
            return r0
    }

    private final /* synthetic */ java.lang.Object get_parentHandle$volatile() {
            r1 = this;
            java.lang.Object r0 = r1._parentHandle$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_parentHandle$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._parentHandle$volatile$FU
            return r0
    }

    private final /* synthetic */ java.lang.Object get_state$volatile() {
            r1 = this;
            java.lang.Object r0 = r1._state$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_state$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._state$volatile$FU
            return r0
    }

    private final kotlinx.coroutines.DisposableHandle installParentHandle() {
            r8 = this;
            kotlin.coroutines.CoroutineContext r0 = r8.getContext()
            kotlinx.coroutines.Job$Key r1 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r1 = (kotlin.coroutines.CoroutineContext.Key) r1
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            r2 = r0
            kotlinx.coroutines.ChildContinuation r0 = new kotlinx.coroutines.ChildContinuation
            r0.<init>(r8)
            r5 = r0
            kotlinx.coroutines.InternalCompletionHandler r5 = (kotlinx.coroutines.InternalCompletionHandler) r5
            r6 = 2
            r7 = 0
            r3 = 1
            r4 = 0
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.JobKt.invokeOnCompletion$default(r2, r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = get_parentHandle$volatile$FU()
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r8, r1, r0)
            return r0
    }

    private final void invokeOnCancellationImpl(java.lang.Object r23) {
            r22 = this;
            r0 = r22
            r1 = r23
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r3 = 1
            if (r2 == 0) goto L21
            r2 = 0
            boolean r4 = r1 instanceof kotlinx.coroutines.CancelHandler
            if (r4 != 0) goto L17
            boolean r4 = r1 instanceof kotlinx.coroutines.internal.Segment
            if (r4 == 0) goto L15
            goto L17
        L15:
            r4 = 0
            goto L18
        L17:
            r4 = r3
        L18:
            if (r4 == 0) goto L1b
            goto L21
        L1b:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L21:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = get_state$volatile$FU()
            r4 = r22
        L27:
            java.lang.Object r6 = r2.get(r0)
            r13 = 0
            boolean r5 = r6 instanceof kotlinx.coroutines.Active
            if (r5 == 0) goto L3c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = get_state$volatile$FU()
            boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r5, r0, r6, r1)
            if (r5 == 0) goto Lf9
            return
        L3c:
            boolean r5 = r6 instanceof kotlinx.coroutines.CancelHandler
            if (r5 == 0) goto L42
            r5 = r3
            goto L44
        L42:
            boolean r5 = r6 instanceof kotlinx.coroutines.internal.Segment
        L44:
            if (r5 == 0) goto L4b
            r0.multipleHandlersError(r1, r6)
            goto Lf9
        L4b:
            boolean r5 = r6 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r5 == 0) goto L84
            r3 = r6
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            boolean r3 = r3.makeHandled()
            if (r3 != 0) goto L5b
            r0.multipleHandlersError(r1, r6)
        L5b:
            boolean r3 = r6 instanceof kotlinx.coroutines.CancelledContinuation
            if (r3 == 0) goto L83
            boolean r3 = r6 instanceof kotlinx.coroutines.CompletedExceptionally
            r5 = 0
            if (r3 == 0) goto L68
            r3 = r6
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            goto L69
        L68:
            r3 = r5
        L69:
            if (r3 == 0) goto L6d
            java.lang.Throwable r5 = r3.cause
        L6d:
            boolean r3 = r1 instanceof kotlinx.coroutines.CancelHandler
            if (r3 == 0) goto L78
            r3 = r1
            kotlinx.coroutines.CancelHandler r3 = (kotlinx.coroutines.CancelHandler) r3
            r0.callCancelHandler(r3, r5)
            goto L83
        L78:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r3)
            r3 = r1
            kotlinx.coroutines.internal.Segment r3 = (kotlinx.coroutines.internal.Segment) r3
            r0.callSegmentOnCancellation(r3, r5)
        L83:
            return
        L84:
            boolean r5 = r6 instanceof kotlinx.coroutines.CompletedContinuation
            java.lang.String r7 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r5 == 0) goto Ld5
            r5 = r6
            kotlinx.coroutines.CompletedContinuation r5 = (kotlinx.coroutines.CompletedContinuation) r5
            kotlinx.coroutines.CancelHandler r5 = r5.cancelHandler
            if (r5 == 0) goto L94
            r0.multipleHandlersError(r1, r6)
        L94:
            boolean r5 = r1 instanceof kotlinx.coroutines.internal.Segment
            if (r5 == 0) goto L99
            return
        L99:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r7)
            r5 = r1
            kotlinx.coroutines.CancelHandler r5 = (kotlinx.coroutines.CancelHandler) r5
            r5 = r6
            kotlinx.coroutines.CompletedContinuation r5 = (kotlinx.coroutines.CompletedContinuation) r5
            boolean r5 = r5.getCancelled()
            if (r5 == 0) goto Lb4
            r3 = r1
            kotlinx.coroutines.CancelHandler r3 = (kotlinx.coroutines.CancelHandler) r3
            r5 = r6
            kotlinx.coroutines.CompletedContinuation r5 = (kotlinx.coroutines.CompletedContinuation) r5
            java.lang.Throwable r5 = r5.cancelCause
            r0.callCancelHandler(r3, r5)
            return
        Lb4:
            r14 = r6
            kotlinx.coroutines.CompletedContinuation r14 = (kotlinx.coroutines.CompletedContinuation) r14
            r16 = r1
            kotlinx.coroutines.CancelHandler r16 = (kotlinx.coroutines.CancelHandler) r16
            r20 = 29
            r21 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            kotlinx.coroutines.CompletedContinuation r5 = kotlinx.coroutines.CompletedContinuation.copy$default(r14, r15, r16, r17, r18, r19, r20, r21)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = get_state$volatile$FU()
            boolean r7 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r7, r0, r6, r5)
            if (r7 == 0) goto Lf9
            return
        Ld5:
            boolean r5 = r1 instanceof kotlinx.coroutines.internal.Segment
            if (r5 == 0) goto Lda
            return
        Lda:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r7)
            r5 = r1
            kotlinx.coroutines.CancelHandler r5 = (kotlinx.coroutines.CancelHandler) r5
            kotlinx.coroutines.CompletedContinuation r5 = new kotlinx.coroutines.CompletedContinuation
            r7 = r1
            kotlinx.coroutines.CancelHandler r7 = (kotlinx.coroutines.CancelHandler) r7
            r11 = 28
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = get_state$volatile$FU()
            boolean r7 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r7, r0, r6, r5)
            if (r7 == 0) goto Lf9
            return
        Lf9:
            goto L27
    }

    private final boolean isReusable() {
            r2 = this;
            int r0 = r2.resumeMode
            boolean r0 = kotlinx.coroutines.DispatchedTaskKt.isReusableMode(r0)
            if (r0 == 0) goto L19
            kotlin.coroutines.Continuation<T> r0 = r2.delegate
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            boolean r0 = r0.isReusable$kotlinx_coroutines_core()
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
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

    private final /* synthetic */ void loop$atomicfu(java.lang.Object r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r3.get(r2)
            r4.invoke(r0)
            goto L0
    }

    private final void multipleHandlersError(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "It's prohibited to register multiple handlers, tried to register "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = ", already has "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final void resumeImpl(java.lang.Object r12, int r13, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r14) {
            r11 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_state$volatile$FU()
            r1 = r11
        L5:
            java.lang.Object r2 = r0.get(r11)
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.NotCompleted
            if (r4 == 0) goto L30
            r6 = r2
            kotlinx.coroutines.NotCompleted r6 = (kotlinx.coroutines.NotCompleted) r6
            r10 = 0
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            java.lang.Object r12 = r5.resumedState(r6, r7, r8, r9, r10)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = get_state$volatile$FU()
            boolean r13 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r13, r11, r2, r12)
            if (r13 == 0) goto L2c
            r11.detachChildIfNonResuable()
            r11.dispatchResume(r8)
            return
        L2c:
            r12 = r7
            r13 = r8
            r14 = r9
            goto L5
        L30:
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            boolean r12 = r2 instanceof kotlinx.coroutines.CancelledContinuation
            if (r12 == 0) goto L4e
            r12 = r2
            kotlinx.coroutines.CancelledContinuation r12 = (kotlinx.coroutines.CancelledContinuation) r12
            boolean r12 = r12.makeResumed()
            if (r12 == 0) goto L4e
            if (r9 == 0) goto L4d
            r12 = r9
            r13 = 0
            r14 = r2
            kotlinx.coroutines.CancelledContinuation r14 = (kotlinx.coroutines.CancelledContinuation) r14
            java.lang.Throwable r14 = r14.cause
            r11.callOnCancellation(r12, r14)
        L4d:
            return
        L4e:
            r11.alreadyResumedError(r7)
            kotlin.KotlinNothingValueException r12 = new kotlin.KotlinNothingValueException
            r12.<init>()
            throw r12
    }

    static /* synthetic */ void resumeImpl$default(kotlinx.coroutines.CancellableContinuationImpl r0, java.lang.Object r1, int r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto Lb
            r4 = r4 & 4
            if (r4 == 0) goto L7
            r3 = 0
        L7:
            r0.resumeImpl(r1, r2, r3)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: resumeImpl"
            r0.<init>(r1)
            throw r0
    }

    private final java.lang.Object resumedState(kotlinx.coroutines.NotCompleted r10, java.lang.Object r11, int r12, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r13, java.lang.Object r14) {
            r9 = this;
            boolean r0 = r11 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L31
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1c
            r0 = 0
            if (r14 != 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            if (r0 == 0) goto L16
            goto L1c
        L16:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1c:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L30
            r0 = 0
            if (r13 != 0) goto L26
            goto L27
        L26:
            r1 = r2
        L27:
            if (r1 == 0) goto L2a
            goto L30
        L2a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L30:
            goto L44
        L31:
            boolean r0 = kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(r12)
            if (r0 != 0) goto L3a
            if (r14 != 0) goto L3a
            goto L44
        L3a:
            if (r13 != 0) goto L49
            boolean r0 = r10 instanceof kotlinx.coroutines.CancelHandler
            if (r0 != 0) goto L49
            if (r14 == 0) goto L43
            goto L49
        L43:
        L44:
            r1 = r11
            r2 = r1
            r4 = r13
            r5 = r14
            goto L5f
        L49:
            kotlinx.coroutines.CompletedContinuation r1 = new kotlinx.coroutines.CompletedContinuation
            boolean r0 = r10 instanceof kotlinx.coroutines.CancelHandler
            if (r0 == 0) goto L53
            r0 = r10
            kotlinx.coroutines.CancelHandler r0 = (kotlinx.coroutines.CancelHandler) r0
            goto L54
        L53:
            r0 = 0
        L54:
            r3 = r0
            r7 = 16
            r8 = 0
            r6 = 0
            r2 = r11
            r4 = r13
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L5f:
            return r1
    }

    private final /* synthetic */ void set_decisionAndIndex$volatile(int r1) {
            r0 = this;
            r0._decisionAndIndex$volatile = r1
            return
    }

    private final /* synthetic */ void set_parentHandle$volatile(java.lang.Object r1) {
            r0 = this;
            r0._parentHandle$volatile = r1
            return
    }

    private final /* synthetic */ void set_state$volatile(java.lang.Object r1) {
            r0 = this;
            r0._state$volatile = r1
            return
    }

    private final boolean tryResume() {
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_decisionAndIndex$volatile$FU()
            r1 = r9
        L5:
            int r2 = r0.get(r9)
            r3 = 0
            r4 = r2
            r5 = 0
            int r4 = r4 >> 29
            switch(r4) {
                case 0: goto L1f;
                case 1: goto L1d;
                default: goto L11;
            }
        L11:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already resumed"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L1d:
            r4 = 0
            return r4
        L1f:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = get_decisionAndIndex$volatile$FU()
            r5 = r2
            r6 = 0
            r7 = 536870911(0x1fffffff, float:1.0842021E-19)
            r5 = r5 & r7
            r6 = 2
            r7 = 0
            int r8 = r6 << 29
            int r8 = r8 + r5
            boolean r4 = r4.compareAndSet(r9, r2, r8)
            if (r4 == 0) goto L37
            r4 = 1
            return r4
        L37:
            goto L5
    }

    private final kotlinx.coroutines.internal.Symbol tryResumeImpl(java.lang.Object r12, java.lang.Object r13, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r14) {
            r11 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_state$volatile$FU()
            r1 = r11
        L5:
            java.lang.Object r2 = r0.get(r11)
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.NotCompleted
            if (r4 == 0) goto L30
            r6 = r2
            kotlinx.coroutines.NotCompleted r6 = (kotlinx.coroutines.NotCompleted) r6
            int r8 = r11.resumeMode
            r5 = r11
            r7 = r12
            r10 = r13
            r9 = r14
            java.lang.Object r12 = r5.resumedState(r6, r7, r8, r9, r10)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = get_state$volatile$FU()
            boolean r13 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r13, r11, r2, r12)
            if (r13 == 0) goto L2c
            r11.detachChildIfNonResuable()
            kotlinx.coroutines.internal.Symbol r13 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            return r13
        L2c:
            r12 = r7
            r14 = r9
            r13 = r10
            goto L5
        L30:
            r5 = r11
            r7 = r12
            r10 = r13
            r9 = r14
            boolean r12 = r2 instanceof kotlinx.coroutines.CompletedContinuation
            r13 = 0
            if (r12 == 0) goto L60
            if (r10 == 0) goto L5e
            r12 = r2
            kotlinx.coroutines.CompletedContinuation r12 = (kotlinx.coroutines.CompletedContinuation) r12
            java.lang.Object r12 = r12.idempotentResume
            if (r12 != r10) goto L5e
            boolean r12 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r12 == 0) goto L5b
            r12 = 0
            r13 = r2
            kotlinx.coroutines.CompletedContinuation r13 = (kotlinx.coroutines.CompletedContinuation) r13
            java.lang.Object r13 = r13.result
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual(r13, r7)
            if (r12 == 0) goto L55
            goto L5b
        L55:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            r12.<init>()
            throw r12
        L5b:
            kotlinx.coroutines.internal.Symbol r13 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            goto L5f
        L5e:
        L5f:
            return r13
        L60:
            return r13
    }

    private final boolean trySuspend() {
            r10 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_decisionAndIndex$volatile$FU()
            r1 = r10
        L5:
            int r2 = r0.get(r10)
            r3 = 0
            r4 = r2
            r5 = 0
            int r4 = r4 >> 29
            switch(r4) {
                case 0: goto L1f;
                case 1: goto L11;
                case 2: goto L1d;
                default: goto L11;
            }
        L11:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already suspended"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L1d:
            r4 = 0
            return r4
        L1f:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = get_decisionAndIndex$volatile$FU()
            r5 = r2
            r6 = 0
            r7 = 536870911(0x1fffffff, float:1.0842021E-19)
            r5 = r5 & r7
            r6 = 1
            r7 = r6
            r8 = 0
            int r9 = r7 << 29
            int r9 = r9 + r5
            boolean r4 = r4.compareAndSet(r10, r2, r9)
            if (r4 == 0) goto L37
            return r6
        L37:
            goto L5
    }

    private final /* synthetic */ void update$atomicfu(java.lang.Object r3, java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> r5) {
            r2 = this;
        L0:
            int r0 = r4.get(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r5.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            boolean r0 = r4.compareAndSet(r3, r0, r1)
            if (r0 == 0) goto L0
            return
    }

    public final void callCancelHandler(kotlinx.coroutines.CancelHandler r8, java.lang.Throwable r9) {
            r7 = this;
            r0 = r7
            r1 = 0
            r2 = 0
            r8.invoke(r9)     // Catch: java.lang.Throwable -> L8
            goto L2a
        L8:
            r2 = move-exception
            kotlin.coroutines.CoroutineContext r3 = r0.getContext()
            kotlinx.coroutines.CompletionHandlerException r4 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Exception in invokeOnCancellation handler for "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5, r2)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r3, r4)
        L2a:
            return
    }

    public final void callOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r6, java.lang.Throwable r7) {
            r5 = this;
            r6.invoke(r7)     // Catch: java.lang.Throwable -> L5
            goto L27
        L5:
            r0 = move-exception
            kotlin.coroutines.CoroutineContext r1 = r5.getContext()
            kotlinx.coroutines.CompletionHandlerException r2 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in resume onCancellation handler for "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r0)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r1, r2)
        L27:
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(java.lang.Throwable r10) {
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_state$volatile$FU()
            r1 = r9
        L5:
            java.lang.Object r2 = r0.get(r9)
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.NotCompleted
            r5 = 0
            if (r4 != 0) goto L10
            return r5
        L10:
            kotlinx.coroutines.CancelledContinuation r4 = new kotlinx.coroutines.CancelledContinuation
            r6 = r9
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            boolean r7 = r2 instanceof kotlinx.coroutines.CancelHandler
            r8 = 1
            if (r7 != 0) goto L1e
            boolean r7 = r2 instanceof kotlinx.coroutines.internal.Segment
            if (r7 == 0) goto L1f
        L1e:
            r5 = r8
        L1f:
            r4.<init>(r6, r10, r5)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = get_state$volatile$FU()
            boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r5, r9, r2, r4)
            if (r5 == 0) goto L5
            r5 = r2
            kotlinx.coroutines.NotCompleted r5 = (kotlinx.coroutines.NotCompleted) r5
            boolean r6 = r5 instanceof kotlinx.coroutines.CancelHandler
            if (r6 == 0) goto L3a
            r5 = r2
            kotlinx.coroutines.CancelHandler r5 = (kotlinx.coroutines.CancelHandler) r5
            r9.callCancelHandler(r5, r10)
            goto L44
        L3a:
            boolean r5 = r5 instanceof kotlinx.coroutines.internal.Segment
            if (r5 == 0) goto L44
            r5 = r2
            kotlinx.coroutines.internal.Segment r5 = (kotlinx.coroutines.internal.Segment) r5
            r9.callSegmentOnCancellation(r5, r10)
        L44:
            r9.detachChildIfNonResuable()
            int r5 = r9.resumeMode
            r9.dispatchResume(r5)
            return r8
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object r21, java.lang.Throwable r22) {
            r20 = this;
            r0 = r20
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = get_state$volatile$FU()
            r2 = r20
        L8:
            java.lang.Object r4 = r1.get(r0)
            r11 = 0
            boolean r3 = r4 instanceof kotlinx.coroutines.NotCompleted
            if (r3 != 0) goto L76
            boolean r3 = r4 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r3 == 0) goto L17
            return
        L17:
            boolean r3 = r4 instanceof kotlinx.coroutines.CompletedContinuation
            if (r3 == 0) goto L5c
            r3 = r4
            kotlinx.coroutines.CompletedContinuation r3 = (kotlinx.coroutines.CompletedContinuation) r3
            boolean r3 = r3.getCancelled()
            if (r3 != 0) goto L4c
            r12 = r4
            kotlinx.coroutines.CompletedContinuation r12 = (kotlinx.coroutines.CompletedContinuation) r12
            r18 = 15
            r19 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = r22
            kotlinx.coroutines.CompletedContinuation r3 = kotlinx.coroutines.CompletedContinuation.copy$default(r12, r13, r14, r15, r16, r17, r18, r19)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = get_state$volatile$FU()
            boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r5, r0, r4, r3)
            if (r5 == 0) goto L49
            r5 = r4
            kotlinx.coroutines.CompletedContinuation r5 = (kotlinx.coroutines.CompletedContinuation) r5
            r8 = r22
            r5.invokeHandlers(r0, r8)
            return
        L49:
            r8 = r22
            goto L74
        L4c:
            r8 = r22
            r3 = 0
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r5 = "Must be called at most once"
            java.lang.String r5 = r5.toString()
            r3.<init>(r5)
            throw r3
        L5c:
            r8 = r22
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = get_state$volatile$FU()
            kotlinx.coroutines.CompletedContinuation r3 = new kotlinx.coroutines.CompletedContinuation
            r9 = 14
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r12, r0, r4, r3)
            if (r3 == 0) goto L74
            return
        L74:
            goto L8
        L76:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r5 = "Not completed"
            java.lang.String r5 = r5.toString()
            r3.<init>(r5)
            throw r3
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void completeResume(java.lang.Object r3) {
            r2 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L17
            r0 = 0
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            if (r3 != r1) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 == 0) goto L11
            goto L17
        L11:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L17:
            int r0 = r2.resumeMode
            r2.dispatchResume(r0)
            return
    }

    public final void detachChild$kotlinx_coroutines_core() {
            r3 = this;
            kotlinx.coroutines.DisposableHandle r0 = r3.getParentHandle()
            if (r0 != 0) goto L7
            return
        L7:
            r0.dispose()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = get_parentHandle$volatile$FU()
            kotlinx.coroutines.NonDisposableHandle r2 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            r1.set(r3, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<T> r0 = r2.delegate
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
            kotlin.coroutines.CoroutineContext r0 = r1.context
            return r0
    }

    public java.lang.Throwable getContinuationCancellationCause(kotlinx.coroutines.Job r2) {
            r1 = this;
            java.util.concurrent.CancellationException r0 = r2.getCancellationException()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core() {
            r1 = this;
            kotlin.coroutines.Continuation<T> r0 = r1.delegate
            return r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Throwable getExceptionalResult$kotlinx_coroutines_core(java.lang.Object r6) {
            r5 = this;
            java.lang.Throwable r0 = super.getExceptionalResult$kotlinx_coroutines_core(r6)
            if (r0 == 0) goto L20
            r1 = 0
            kotlin.coroutines.Continuation<T> r2 = r5.delegate
            r3 = 0
            boolean r4 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r4 == 0) goto L1d
            boolean r4 = r2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r4 != 0) goto L15
            goto L1d
        L15:
            r4 = r2
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r4 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r4
            java.lang.Throwable r4 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r0, r4)
            goto L1e
        L1d:
            r4 = r0
        L1e:
            goto L21
        L20:
            r4 = 0
        L21:
            return r4
    }

    public final java.lang.Object getResult() {
            r7 = this;
            boolean r0 = r7.isReusable()
            boolean r1 = r7.trySuspend()
            if (r1 == 0) goto L1d
            kotlinx.coroutines.DisposableHandle r1 = r7.getParentHandle()
            if (r1 != 0) goto L13
            r7.installParentHandle()
        L13:
            if (r0 == 0) goto L18
            r7.releaseClaimedReusableContinuation$kotlinx_coroutines_core()
        L18:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r1
        L1d:
            if (r0 == 0) goto L22
            r7.releaseClaimedReusableContinuation$kotlinx_coroutines_core()
        L22:
            java.lang.Object r1 = r7.getState$kotlinx_coroutines_core()
            boolean r2 = r1 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r2 == 0) goto L49
            r2 = r1
            kotlinx.coroutines.CompletedExceptionally r2 = (kotlinx.coroutines.CompletedExceptionally) r2
            java.lang.Throwable r2 = r2.cause
            r3 = 0
            boolean r4 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r4 == 0) goto L48
            r4 = r7
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            boolean r4 = r4 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r4 != 0) goto L3e
            goto L48
        L3e:
            r4 = r7
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r4 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r4
            java.lang.Throwable r4 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r2, r4)
            r2 = r4
        L48:
            throw r2
        L49:
            int r2 = r7.resumeMode
            boolean r2 = kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(r2)
            if (r2 == 0) goto L91
            kotlin.coroutines.CoroutineContext r2 = r7.getContext()
            kotlinx.coroutines.Job$Key r3 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r3 = (kotlin.coroutines.CoroutineContext.Key) r3
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r3)
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            if (r2 == 0) goto L91
            boolean r3 = r2.isActive()
            if (r3 != 0) goto L91
            java.util.concurrent.CancellationException r3 = r2.getCancellationException()
            r4 = r3
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r7.cancelCompletedResult$kotlinx_coroutines_core(r1, r4)
            r4 = 0
            boolean r5 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r5 == 0) goto L8d
            r5 = r7
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            boolean r5 = r5 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r5 != 0) goto L80
            goto L8d
        L80:
            r5 = r3
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r6 = r7
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r6 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r6
            java.lang.Throwable r5 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r5, r6)
            goto L90
        L8d:
            r5 = r3
            java.lang.Throwable r5 = (java.lang.Throwable) r5
        L90:
            throw r5
        L91:
            java.lang.Object r2 = r7.getSuccessfulResult$kotlinx_coroutines_core(r1)
            return r2
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.Object getState$kotlinx_coroutines_core() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_state$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.CompletedContinuation
            if (r0 == 0) goto Lb
            r0 = r2
            kotlinx.coroutines.CompletedContinuation r0 = (kotlinx.coroutines.CompletedContinuation) r0
            java.lang.Object r0 = r0.result
            goto Lc
        Lb:
            r0 = r2
        Lc:
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void initCancellability() {
            r3 = this;
            kotlinx.coroutines.DisposableHandle r0 = r3.installParentHandle()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = r3.isCompleted()
            if (r1 == 0) goto L19
            r0.dispose()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = get_parentHandle$volatile$FU()
            kotlinx.coroutines.NonDisposableHandle r2 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            r1.set(r3, r2)
        L19:
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r2 = this;
            r0 = r2
            kotlinx.coroutines.CancellableContinuation r0 = (kotlinx.coroutines.CancellableContinuation) r0
            kotlinx.coroutines.CancelHandler$UserSupplied r1 = new kotlinx.coroutines.CancelHandler$UserSupplied
            r1.<init>(r3)
            kotlinx.coroutines.CancelHandler r1 = (kotlinx.coroutines.CancelHandler) r1
            kotlinx.coroutines.CancellableContinuationKt.invokeOnCancellation(r0, r1)
            return
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> r9, int r10) {
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_decisionAndIndex$volatile$FU()
            r1 = r8
        L5:
            int r2 = r0.get(r8)
            r3 = r2
            r4 = 0
            r5 = r3
            r6 = 0
            r7 = 536870911(0x1fffffff, float:1.0842021E-19)
            r5 = r5 & r7
            if (r5 != r7) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            if (r5 == 0) goto L2c
            r5 = r3
            r6 = 0
            int r5 = r5 >> 29
            r6 = 0
            int r7 = r5 << 29
            int r7 = r7 + r10
            boolean r2 = r0.compareAndSet(r8, r2, r7)
            if (r2 == 0) goto L5
            r8.invokeOnCancellationImpl(r9)
            return
        L2c:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r5 = "invokeOnCancellation should be called at most once"
            java.lang.String r5 = r5.toString()
            r2.<init>(r5)
            throw r2
    }

    public final void invokeOnCancellationInternal$kotlinx_coroutines_core(kotlinx.coroutines.CancelHandler r1) {
            r0 = this;
            r0.invokeOnCancellationImpl(r1)
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isActive() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.NotCompleted
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCancelled() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.CancelledContinuation
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCompleted() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.NotCompleted
            r0 = r0 ^ 1
            return r0
    }

    protected java.lang.String nameString() {
            r1 = this;
            java.lang.String r0 = "CancellableContinuation"
            return r0
    }

    public final void parentCancelled$kotlinx_coroutines_core(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.cancelLater(r2)
            if (r0 == 0) goto L7
            return
        L7:
            r1.cancel(r2)
            r1.detachChildIfNonResuable()
            return
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
            r2 = this;
            kotlin.coroutines.Continuation<T> r0 = r2.delegate
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r1 == 0) goto L9
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L1d
            r1 = r2
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            java.lang.Throwable r0 = r0.tryReleaseClaimedContinuation$kotlinx_coroutines_core(r1)
            if (r0 != 0) goto L16
            goto L1d
        L16:
            r2.detachChild$kotlinx_coroutines_core()
            r2.cancel(r0)
            return
        L1d:
            return
    }

    public final boolean resetStateReusable() {
            r7 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            r0 = 0
            int r3 = r7.resumeMode
            r4 = 2
            if (r3 != r4) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == 0) goto L14
            goto L1a
        L14:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1a:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L35
            r0 = 0
            kotlinx.coroutines.DisposableHandle r3 = r7.getParentHandle()
            kotlinx.coroutines.NonDisposableHandle r4 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r3 == r4) goto L2b
            r0 = r1
            goto L2c
        L2b:
            r0 = r2
        L2c:
            if (r0 == 0) goto L2f
            goto L35
        L2f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L35:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_state$volatile$FU()
            java.lang.Object r0 = r0.get(r7)
            boolean r3 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r3 == 0) goto L4f
            r3 = 0
            boolean r4 = r0 instanceof kotlinx.coroutines.NotCompleted
            if (r4 != 0) goto L49
            goto L4f
        L49:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L4f:
            boolean r3 = r0 instanceof kotlinx.coroutines.CompletedContinuation
            if (r3 == 0) goto L5e
            r3 = r0
            kotlinx.coroutines.CompletedContinuation r3 = (kotlinx.coroutines.CompletedContinuation) r3
            java.lang.Object r3 = r3.idempotentResume
            if (r3 == 0) goto L5e
            r7.detachChild$kotlinx_coroutines_core()
            return r2
        L5e:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = get_decisionAndIndex$volatile$FU()
            r3 = 0
            r4 = 536870911(0x1fffffff, float:1.0842021E-19)
            r5 = 0
            int r6 = r3 << 29
            int r6 = r6 + r4
            r2.set(r7, r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = get_state$volatile$FU()
            kotlinx.coroutines.Active r3 = kotlinx.coroutines.Active.INSTANCE
            r2.set(r7, r3)
            return r1
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resume(T r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r1 = this;
            int r0 = r1.resumeMode
            r1.resumeImpl(r2, r0, r3)
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatched(kotlinx.coroutines.CoroutineDispatcher r9, T r10) {
            r8 = this;
            kotlin.coroutines.Continuation<T> r0 = r8.delegate
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            r2 = 0
            if (r1 == 0) goto La
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto Lf
            kotlinx.coroutines.CoroutineDispatcher r2 = r0.dispatcher
        Lf:
            if (r2 != r9) goto L13
            r1 = 4
            goto L15
        L13:
            int r1 = r8.resumeMode
        L15:
            r4 = r1
            r6 = 4
            r7 = 0
            r5 = 0
            r2 = r8
            r3 = r10
            resumeImpl$default(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatchedWithException(kotlinx.coroutines.CoroutineDispatcher r10, java.lang.Throwable r11) {
            r9 = this;
            kotlin.coroutines.Continuation<T> r0 = r9.delegate
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            r2 = 0
            if (r1 == 0) goto La
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            kotlinx.coroutines.CompletedExceptionally r4 = new kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            r3 = 2
            r4.<init>(r11, r1, r3, r2)
            if (r0 == 0) goto L16
            kotlinx.coroutines.CoroutineDispatcher r2 = r0.dispatcher
        L16:
            if (r2 != r10) goto L1a
            r1 = 4
            goto L1c
        L1a:
            int r1 = r9.resumeMode
        L1c:
            r5 = r1
            r7 = 4
            r8 = 0
            r6 = 0
            r3 = r9
            resumeImpl$default(r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object r8) {
            r7 = this;
            r0 = r7
            kotlinx.coroutines.CancellableContinuation r0 = (kotlinx.coroutines.CancellableContinuation) r0
            java.lang.Object r2 = kotlinx.coroutines.CompletionStateKt.toState(r8, r0)
            int r3 = r7.resumeMode
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            resumeImpl$default(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Object takeState$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.nameString()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlin.coroutines.Continuation<T> r1 = r2.delegate
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.toDebugString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "){"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getStateDebugRepresentation()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "}@"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResume(T r2, java.lang.Object r3) {
            r1 = this;
            r0 = 0
            kotlinx.coroutines.internal.Symbol r0 = r1.tryResumeImpl(r2, r3, r0)
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResume(T r2, java.lang.Object r3, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4) {
            r1 = this;
            kotlinx.coroutines.internal.Symbol r0 = r1.tryResumeImpl(r2, r3, r4)
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResumeWithException(java.lang.Throwable r5) {
            r4 = this;
            kotlinx.coroutines.CompletedExceptionally r0 = new kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            r2 = 2
            r3 = 0
            r0.<init>(r5, r1, r2, r3)
            kotlinx.coroutines.internal.Symbol r0 = r4.tryResumeImpl(r0, r3, r3)
            return r0
    }
}
