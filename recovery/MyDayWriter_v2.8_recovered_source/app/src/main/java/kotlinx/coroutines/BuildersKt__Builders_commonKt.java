package kotlinx.coroutines;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aR\u0010\u0004\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u000e\u001aX\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0010\"\u0004\b\u0000\u0010\u0005*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u0013\u001aC\u0010\u0014\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005*\u00020\u00152)\b\b\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0086J¢\u0006\u0002\u0010\u0016\u001aL\u0010\u0017\u001a\u00020\u0018*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"RESUMED", "", "SUSPENDED", "UNDECIDED", "withContext", "T", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "async", "Lkotlinx/coroutines/Deferred;", "start", "Lkotlinx/coroutines/CoroutineStart;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Deferred;", "invoke", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launch", "Lkotlinx/coroutines/Job;", "", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
final /* synthetic */ class BuildersKt__Builders_commonKt {
    private static final int RESUMED = 2;
    private static final int SUSPENDED = 1;
    private static final int UNDECIDED = 0;

    public static final <T> kotlinx.coroutines.Deferred<T> async(kotlinx.coroutines.CoroutineScope r3, kotlin.coroutines.CoroutineContext r4, kotlinx.coroutines.CoroutineStart r5, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r6) {
            kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r3, r4)
            boolean r1 = r5.isLazy()
            if (r1 == 0) goto L12
            kotlinx.coroutines.LazyDeferredCoroutine r1 = new kotlinx.coroutines.LazyDeferredCoroutine
            r1.<init>(r0, r6)
            kotlinx.coroutines.DeferredCoroutine r1 = (kotlinx.coroutines.DeferredCoroutine) r1
            goto L18
        L12:
            kotlinx.coroutines.DeferredCoroutine r1 = new kotlinx.coroutines.DeferredCoroutine
            r2 = 1
            r1.<init>(r0, r2)
        L18:
            r1.start(r5, r1, r6)
            r2 = r1
            kotlinx.coroutines.Deferred r2 = (kotlinx.coroutines.Deferred) r2
            return r2
    }

    public static /* synthetic */ kotlinx.coroutines.Deferred async$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, kotlinx.coroutines.CoroutineStart r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        L8:
            r4 = r4 & 2
            if (r4 == 0) goto Le
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.DEFAULT
        Le:
            kotlinx.coroutines.Deferred r0 = kotlinx.coroutines.BuildersKt.async(r0, r1, r2, r3)
            return r0
    }

    public static final <T> java.lang.Object invoke(kotlinx.coroutines.CoroutineDispatcher r2, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super T> r4) {
            r0 = 0
            r1 = r2
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r4)
            return r1
    }

    private static final <T> java.lang.Object invoke$$forInline(kotlinx.coroutines.CoroutineDispatcher r2, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super T> r4) {
            r0 = 0
            r1 = r2
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r4)
            return r1
    }

    public static final kotlinx.coroutines.Job launch(kotlinx.coroutines.CoroutineScope r3, kotlin.coroutines.CoroutineContext r4, kotlinx.coroutines.CoroutineStart r5, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6) {
            kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r3, r4)
            boolean r1 = r5.isLazy()
            if (r1 == 0) goto L12
            kotlinx.coroutines.LazyStandaloneCoroutine r1 = new kotlinx.coroutines.LazyStandaloneCoroutine
            r1.<init>(r0, r6)
            kotlinx.coroutines.StandaloneCoroutine r1 = (kotlinx.coroutines.StandaloneCoroutine) r1
            goto L18
        L12:
            kotlinx.coroutines.StandaloneCoroutine r1 = new kotlinx.coroutines.StandaloneCoroutine
            r2 = 1
            r1.<init>(r0, r2)
        L18:
            r1.start(r5, r1, r6)
            r2 = r1
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            return r2
    }

    public static /* synthetic */ kotlinx.coroutines.Job launch$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, kotlinx.coroutines.CoroutineStart r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        L8:
            r4 = r4 & 2
            if (r4 == 0) goto Le
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.DEFAULT
        Le:
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.launch(r0, r1, r2, r3)
            return r0
    }

    public static final <T> java.lang.Object withContext(kotlin.coroutines.CoroutineContext r12, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r13, kotlin.coroutines.Continuation<? super T> r14) {
            r1 = r14
            r2 = 0
            kotlin.coroutines.CoroutineContext r3 = r1.getContext()
            kotlin.coroutines.CoroutineContext r4 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r3, r12)
            kotlinx.coroutines.JobKt.ensureActive(r4)
            if (r4 != r3) goto L1d
            kotlinx.coroutines.internal.ScopeCoroutine r0 = new kotlinx.coroutines.internal.ScopeCoroutine
            r0.<init>(r4, r1)
            java.lang.Object r5 = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(r0, r0, r13)
            r11 = r5
            r5 = r13
            r13 = r11
            goto L6c
        L1d:
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r4.get(r0)
            kotlin.coroutines.ContinuationInterceptor$Key r5 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Key r5 = (kotlin.coroutines.CoroutineContext.Key) r5
            kotlin.coroutines.CoroutineContext$Element r5 = r3.get(r5)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r5)
            if (r0 == 0) goto L58
            kotlinx.coroutines.UndispatchedCoroutine r0 = new kotlinx.coroutines.UndispatchedCoroutine
            r0.<init>(r4, r1)
            r5 = r0
            kotlin.coroutines.CoroutineContext r6 = r5.getContext()
            r0 = 0
            r7 = r0
            r8 = 0
            java.lang.Object r9 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r6, r7)
            r0 = 0
            r10 = r5
            kotlinx.coroutines.internal.ScopeCoroutine r10 = (kotlinx.coroutines.internal.ScopeCoroutine) r10     // Catch: java.lang.Throwable -> L53
            java.lang.Object r10 = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(r10, r5, r13)     // Catch: java.lang.Throwable -> L53
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r6, r9)
            r5 = r13
            r13 = r10
            goto L6c
        L53:
            r0 = move-exception
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r6, r9)
            throw r0
        L58:
            kotlinx.coroutines.DispatchedCoroutine r0 = new kotlinx.coroutines.DispatchedCoroutine
            r0.<init>(r4, r1)
            r6 = r0
            r7 = r6
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            r9 = 4
            r10 = 0
            r8 = 0
            r5 = r13
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable$default(r5, r6, r7, r8, r9, r10)
            java.lang.Object r13 = r6.getResult$kotlinx_coroutines_core()
        L6c:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r13 != r0) goto L75
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r14)
        L75:
            return r13
    }
}
