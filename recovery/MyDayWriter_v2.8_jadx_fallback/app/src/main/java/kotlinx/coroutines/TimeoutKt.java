package kotlinx.coroutines;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\\\u0010\b\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\n\"\b\b\u0001\u0010\u000b*\u0002H\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u000b0\f2'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e¢\u0006\u0002\b\u0011H\u0002¢\u0006\u0002\u0010\u0012\u001aR\u0010\u0013\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0014\u001a\u00020\u00032'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e¢\u0006\u0002\b\u0011H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u0015\u001aW\u0010\u0013\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0016\u001a\u00020\u00172'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e¢\u0006\u0002\b\u0011H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0018\u0010\u0015\u001aG\u0010\u0019\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0014\u001a\u00020\u00032'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e¢\u0006\u0002\b\u0011H\u0086@¢\u0006\u0002\u0010\u0015\u001aL\u0010\u0019\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0016\u001a\u00020\u00172'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e¢\u0006\u0002\b\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"TimeoutCancellationException", "Lkotlinx/coroutines/TimeoutCancellationException;", "time", "", "delay", "Lkotlinx/coroutines/Delay;", "coroutine", "Lkotlinx/coroutines/Job;", "setupTimeout", "", "U", "T", "Lkotlinx/coroutines/TimeoutCoroutine;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/TimeoutCoroutine;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "withTimeout", "timeMillis", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeout", "Lkotlin/time/Duration;", "withTimeout-KLykuaI", "withTimeoutOrNull", "withTimeoutOrNull-KLykuaI", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TimeoutKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1, reason: invalid class name */
    /* JADX INFO: compiled from: Timeout.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {101}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        long J$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.TimeoutKt.AnonymousClass1> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                r4 = this;
                r4.result = r5
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r4.label = r0
                r0 = 0
                r1 = r4
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r2 = 0
                java.lang.Object r0 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r2, r0, r1)
                return r0
        }
    }

    public static final kotlinx.coroutines.TimeoutCancellationException TimeoutCancellationException(long r3, kotlinx.coroutines.Delay r5, kotlinx.coroutines.Job r6) {
            boolean r0 = r5 instanceof kotlinx.coroutines.DelayWithTimeoutDiagnostics
            if (r0 == 0) goto L8
            r0 = r5
            kotlinx.coroutines.DelayWithTimeoutDiagnostics r0 = (kotlinx.coroutines.DelayWithTimeoutDiagnostics) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L19
            kotlin.time.Duration$Companion r1 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MILLISECONDS
            long r1 = kotlin.time.DurationKt.toDuration(r3, r1)
            java.lang.String r0 = r0.m1646timeoutMessageLRDsOJo(r1)
            if (r0 != 0) goto L32
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Timed out waiting for "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = " ms"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L32:
            kotlinx.coroutines.TimeoutCancellationException r1 = new kotlinx.coroutines.TimeoutCancellationException
            r1.<init>(r0, r6)
            return r1
    }

    private static final <U, T extends U> java.lang.Object setupTimeout(kotlinx.coroutines.TimeoutCoroutine<U, ? super T> r8, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r9) {
            kotlin.coroutines.Continuation<T> r0 = r8.uCont
            kotlin.coroutines.CoroutineContext r1 = r0.getContext()
            r2 = r8
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            kotlinx.coroutines.Delay r3 = kotlinx.coroutines.DelayKt.getDelay(r1)
            long r4 = r8.time
            r6 = r8
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            kotlin.coroutines.CoroutineContext r7 = r8.getContext()
            kotlinx.coroutines.DisposableHandle r3 = r3.invokeOnTimeout(r4, r6, r7)
            kotlinx.coroutines.JobKt.disposeOnCompletion(r2, r3)
            r2 = r8
            kotlinx.coroutines.internal.ScopeCoroutine r2 = (kotlinx.coroutines.internal.ScopeCoroutine) r2
            java.lang.Object r2 = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturnIgnoreTimeout(r2, r8, r9)
            return r2
    }

    public static final <T> java.lang.Object withTimeout(long r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super T> r6) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1c
            r0 = r6
            r1 = 0
            kotlinx.coroutines.TimeoutCoroutine r2 = new kotlinx.coroutines.TimeoutCoroutine
            r2.<init>(r3, r0)
            java.lang.Object r0 = setupTimeout(r2, r5)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L1b
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
        L1b:
            return r0
        L1c:
            kotlinx.coroutines.TimeoutCancellationException r0 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r1 = "Timed out immediately"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: withTimeout-KLykuaI, reason: not valid java name */
    public static final <T> java.lang.Object m1653withTimeoutKLykuaI(long r2, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r4, kotlin.coroutines.Continuation<? super T> r5) {
            long r0 = kotlinx.coroutines.DelayKt.m1645toDelayMillisLRDsOJo(r2)
            java.lang.Object r0 = withTimeout(r0, r4, r5)
            return r0
    }

    public static final <T> java.lang.Object withTimeoutOrNull(long r7, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r9, kotlin.coroutines.Continuation<? super T> r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.TimeoutKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r10
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = (kotlinx.coroutines.TimeoutKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L3e;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2d:
            long r7 = r0.J$0
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            java.lang.Object r8 = r0.L$0
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L3c
            r8 = r10
            goto L77
        L3c:
            r8 = move-exception
            goto L7a
        L3e:
            kotlin.ResultKt.throwOnFailure(r10)
            r4 = 0
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 > 0) goto L48
            return r3
        L48:
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            r0.L$0 = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            r0.L$1 = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            r0.J$0 = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            r4 = 1
            r0.label = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            r4 = r0
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            r5 = 0
            kotlinx.coroutines.TimeoutCoroutine r6 = new kotlinx.coroutines.TimeoutCoroutine     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            r6.<init>(r7, r4)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            r2.element = r6     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            java.lang.Object r7 = setupTimeout(r6, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            if (r7 != r8) goto L72
            r8 = r0
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L78
        L72:
            if (r7 != r1) goto L75
            return r1
        L75:
            r8 = r7
            r7 = r2
        L77:
            return r8
        L78:
            r8 = move-exception
            r7 = r2
        L7a:
            kotlinx.coroutines.Job r9 = r8.coroutine
            T r1 = r7.element
            if (r9 != r1) goto L81
            return r3
        L81:
            throw r8
    }

    /* JADX INFO: renamed from: withTimeoutOrNull-KLykuaI, reason: not valid java name */
    public static final <T> java.lang.Object m1654withTimeoutOrNullKLykuaI(long r2, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r4, kotlin.coroutines.Continuation<? super T> r5) {
            long r0 = kotlinx.coroutines.DelayKt.m1645toDelayMillisLRDsOJo(r2)
            java.lang.Object r0 = withTimeoutOrNull(r0, r4, r5)
            return r0
    }
}
