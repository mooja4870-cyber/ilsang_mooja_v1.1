package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u00032\u00020\u0004B\u001b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u001bJ%\u0010\u001a\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001cH\u0002J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001d\u0010$\u001a\u00020\u001c2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0&H\u0016¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0010H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collector", "collectContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collectContextSize", "", "completion_", "Lkotlin/coroutines/Continuation;", "", "context", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "lastEmissionContext", "checkContext", "currentContext", "previousContext", "value", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "uCont", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)Ljava/lang/Object;", "exceptionTransparencyViolated", "exception", "Lkotlinx/coroutines/flow/internal/DownstreamExceptionContext;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "invokeSuspend", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SafeCollector<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl implements kotlinx.coroutines.flow.FlowCollector<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {
    public final kotlin.coroutines.CoroutineContext collectContext;
    public final int collectContextSize;
    public final kotlinx.coroutines.flow.FlowCollector<T> collector;
    private kotlin.coroutines.Continuation<? super kotlin.Unit> completion_;
    private kotlin.coroutines.CoroutineContext lastEmissionContext;

    public SafeCollector(kotlinx.coroutines.flow.FlowCollector<? super T> r4, kotlin.coroutines.CoroutineContext r5) {
            r3 = this;
            kotlinx.coroutines.flow.internal.NoOpContinuation r0 = kotlinx.coroutines.flow.internal.NoOpContinuation.INSTANCE
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            r3.<init>(r0, r1)
            r3.collector = r4
            r3.collectContext = r5
            kotlin.coroutines.CoroutineContext r0 = r3.collectContext
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1 r2 = kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1.INSTANCE
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            java.lang.Object r0 = r0.fold(r1, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r3.collectContextSize = r0
            return
    }

    private final void checkContext(kotlin.coroutines.CoroutineContext r2, kotlin.coroutines.CoroutineContext r3, T r4) {
            r1 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.flow.internal.DownstreamExceptionContext
            if (r0 == 0) goto La
            r0 = r3
            kotlinx.coroutines.flow.internal.DownstreamExceptionContext r0 = (kotlinx.coroutines.flow.internal.DownstreamExceptionContext) r0
            r1.exceptionTransparencyViolated(r0, r4)
        La:
            kotlinx.coroutines.flow.internal.SafeCollector_commonKt.checkContext(r1, r2)
            return
    }

    private final java.lang.Object emit(kotlin.coroutines.Continuation<? super kotlin.Unit> r6, T r7) {
            r5 = this;
            kotlin.coroutines.CoroutineContext r0 = r6.getContext()
            kotlinx.coroutines.JobKt.ensureActive(r0)
            kotlin.coroutines.CoroutineContext r1 = r5.lastEmissionContext
            if (r1 == r0) goto L10
            r5.checkContext(r0, r1, r7)
            r5.lastEmissionContext = r0
        L10:
            r5.completion_ = r6
            kotlin.jvm.functions.Function3 r2 = kotlinx.coroutines.flow.internal.SafeCollectorKt.access$getEmitFun$p()
            kotlinx.coroutines.flow.FlowCollector<T> r3 = r5.collector
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r4)
            r4 = r5
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            java.lang.Object r2 = r2.invoke(r3, r7, r4)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r3 != 0) goto L36
            r3 = 0
            r5.completion_ = r3
        L36:
            return r2
    }

    private final void exceptionTransparencyViolated(kotlinx.coroutines.flow.internal.DownstreamExceptionContext r4, java.lang.Object r5) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Throwable r2 = r4.e
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", but then emission attempt of value '"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = kotlin.text.StringsKt.trimIndent(r1)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            r5 = this;
            r0 = r7
            r1 = 0
            java.lang.Object r2 = r5.emit(r0, r6)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r0) goto L11
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r7)
        L11:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r0) goto L18
            return r2
        L18:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L1b:
            r2 = move-exception
            kotlinx.coroutines.flow.internal.DownstreamExceptionContext r3 = new kotlinx.coroutines.flow.internal.DownstreamExceptionContext
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            r3.<init>(r2, r4)
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            r5.lastEmissionContext = r3
            throw r2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<? super kotlin.Unit> r0 = r2.completion_
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.lastEmissionContext
            if (r0 != 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
        L8:
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public java.lang.Object invokeSuspend(java.lang.Object r5) {
            r4 = this;
            java.lang.Throwable r0 = kotlin.Result.m156exceptionOrNullimpl(r5)
            if (r0 == 0) goto L14
            r1 = 0
            kotlinx.coroutines.flow.internal.DownstreamExceptionContext r2 = new kotlinx.coroutines.flow.internal.DownstreamExceptionContext
            kotlin.coroutines.CoroutineContext r3 = r4.getContext()
            r2.<init>(r0, r3)
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            r4.lastEmissionContext = r2
        L14:
            kotlin.coroutines.Continuation<? super kotlin.Unit> r0 = r4.completion_
            if (r0 == 0) goto L1b
            r0.resumeWith(r5)
        L1b:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
            r0 = this;
            super.releaseIntercepted()
            return
    }
}
