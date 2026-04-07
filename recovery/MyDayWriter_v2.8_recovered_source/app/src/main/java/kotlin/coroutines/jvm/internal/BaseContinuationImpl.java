package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0017\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0002\u0010\u0006J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013H$¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\rH\u0014J\u001b\u0010\u0016\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/io/Serializable;", "completion", "(Lkotlin/coroutines/Continuation;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getCompletion", "()Lkotlin/coroutines/Continuation;", "create", "", "value", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "invokeSuspend", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "resumeWith", "(Ljava/lang/Object;)V", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BaseContinuationImpl implements kotlin.coroutines.Continuation<java.lang.Object>, kotlin.coroutines.jvm.internal.CoroutineStackFrame, java.io.Serializable {
    private final kotlin.coroutines.Continuation<java.lang.Object> completion;

    public BaseContinuationImpl(kotlin.coroutines.Continuation<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.completion = r1
            return
    }

    public kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "create(Any?;Continuation) has not been overridden"
            r0.<init>(r1)
            throw r0
    }

    public kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> r3) {
            r2 = this;
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "create(Continuation) has not been overridden"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<java.lang.Object> r0 = r2.completion
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public final kotlin.coroutines.Continuation<java.lang.Object> getCompletion() {
            r1 = this;
            kotlin.coroutines.Continuation<java.lang.Object> r0 = r1.completion
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            java.lang.StackTraceElement r0 = kotlin.coroutines.jvm.internal.DebugMetadataKt.getStackTraceElement(r1)
            return r0
    }

    protected abstract java.lang.Object invokeSuspend(java.lang.Object r1);

    protected void releaseIntercepted() {
            r0 = this;
            return
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(java.lang.Object r8) {
            r7 = this;
            r0 = 0
            r0 = r7
            r1 = 0
            r1 = r8
        L4:
            r2 = r0
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineResumed(r2)
            r2 = r0
            kotlin.coroutines.jvm.internal.BaseContinuationImpl r2 = (kotlin.coroutines.jvm.internal.BaseContinuationImpl) r2
            r3 = 0
            kotlin.coroutines.Continuation<java.lang.Object> r4 = r2.completion
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.Object r5 = r2.invokeSuspend(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L27
            if (r5 != r6) goto L20
            return
        L20:
            kotlin.Result$Companion r6 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = kotlin.Result.m153constructorimpl(r5)     // Catch: java.lang.Throwable -> L27
            goto L32
        L27:
            r5 = move-exception
            kotlin.Result$Companion r6 = kotlin.Result.Companion
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r5)
            java.lang.Object r6 = kotlin.Result.m153constructorimpl(r6)
        L32:
            r2.releaseIntercepted()
            boolean r5 = r4 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl
            if (r5 == 0) goto L3f
            r0 = r4
            r1 = r6
            goto L4
        L3f:
            r4.resumeWith(r6)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation at "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StackTraceElement r1 = r2.getStackTraceElement()
            if (r1 == 0) goto L12
            goto L1a
        L12:
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
        L1a:
            java.io.Serializable r1 = (java.io.Serializable) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
