package kotlin.coroutines.intrinsics;

/* JADX INFO: compiled from: IntrinsicsJvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\u001c\b\u0004\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0083\b¢\u0006\u0002\b\b\u001a'\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0002¢\u0006\u0002\b\n\u001aA\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007¢\u0006\u0002\u0010\f\u001aZ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u0002H\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001a>\u0010\u0013\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\b¢\u0006\u0002\u0010\u0014\u001aW\u0010\u0013\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u0002H\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\b¢\u0006\u0002\u0010\u0015\u001ak\u0010\u0013\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0016\"\u0004\b\u0002\u0010\u0003*)\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0017¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u0002H\r2\u0006\u0010\u0018\u001a\u0002H\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0081\b¢\u0006\u0002\u0010\u0019\u001a=\u0010\u001a\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0001¢\u0006\u0002\u0010\u0014\u001aV\u0010\u001a\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u0002H\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0001¢\u0006\u0002\u0010\u0015\u001aj\u0010\u001a\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0016\"\u0004\b\u0002\u0010\u0003*)\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0017¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u0002H\r2\u0006\u0010\u0018\u001a\u0002H\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0001¢\u0006\u0002\u0010\u0019¨\u0006\u001b"}, d2 = {"createCoroutineFromSuspendFunction", "Lkotlin/coroutines/Continuation;", "", "T", "completion", "block", "Lkotlin/Function1;", "", "createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "createSimpleCoroutineForSuspendFunction", "createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "createCoroutineUnintercepted", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "intercepted", "startCoroutineUninterceptedOrReturn", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "P", "Lkotlin/Function3;", "param", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wrapWithContinuationImpl", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
class IntrinsicsKt__IntrinsicsJvmKt {
    public IntrinsicsKt__IntrinsicsJvmKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final <T> kotlin.coroutines.Continuation<kotlin.Unit> createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(kotlin.coroutines.Continuation<? super T> r3, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r4) {
            r0 = 0
            kotlin.coroutines.CoroutineContext r1 = r3.getContext()
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r1 != r2) goto L11
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1 r2 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1
            r2.<init>(r3, r4)
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            goto L18
        L11:
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2 r2 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2
            r2.<init>(r3, r1, r4)
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
        L18:
            return r2
    }

    public static final <T> kotlin.coroutines.Continuation<kotlin.Unit> createCoroutineUnintercepted(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r4, kotlin.coroutines.Continuation<? super T> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r5)
            boolean r1 = r4 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl
            if (r1 == 0) goto L1a
            r1 = r4
            kotlin.coroutines.jvm.internal.BaseContinuationImpl r1 = (kotlin.coroutines.jvm.internal.BaseContinuationImpl) r1
            kotlin.coroutines.Continuation r1 = r1.create(r0)
            goto L33
        L1a:
            r1 = 0
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r2 != r3) goto L2b
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1 r3 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
            r3.<init>(r0, r4)
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            goto L32
        L2b:
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2 r3 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
            r3.<init>(r0, r2, r4)
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
        L32:
            r1 = r3
        L33:
            return r1
    }

    public static final <R, T> kotlin.coroutines.Continuation<kotlin.Unit> createCoroutineUnintercepted(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r4, R r5, kotlin.coroutines.Continuation<? super T> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r6)
            boolean r1 = r4 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl
            if (r1 == 0) goto L1a
            r1 = r4
            kotlin.coroutines.jvm.internal.BaseContinuationImpl r1 = (kotlin.coroutines.jvm.internal.BaseContinuationImpl) r1
            kotlin.coroutines.Continuation r1 = r1.create(r5, r0)
            goto L33
        L1a:
            r1 = 0
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r2 != r3) goto L2b
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3 r3 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            r3.<init>(r0, r4, r5)
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            goto L32
        L2b:
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4 r3 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            r3.<init>(r0, r2, r4, r5)
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
        L32:
            r1 = r3
        L33:
            return r1
    }

    private static final <T> kotlin.coroutines.Continuation<T> createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(kotlin.coroutines.Continuation<? super T> r2) {
            kotlin.coroutines.CoroutineContext r0 = r2.getContext()
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r0 != r1) goto L10
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 r1 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
            r1.<init>(r2)
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            goto L17
        L10:
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2 r1 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            r1.<init>(r2, r0)
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
        L17:
            return r1
    }

    public static final <T> kotlin.coroutines.Continuation<T> intercepted(kotlin.coroutines.Continuation<? super T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof kotlin.coroutines.jvm.internal.ContinuationImpl
            if (r0 == 0) goto Ld
            r0 = r1
            kotlin.coroutines.jvm.internal.ContinuationImpl r0 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L16
            kotlin.coroutines.Continuation r0 = r0.intercepted()
            if (r0 != 0) goto L17
        L16:
            r0 = r1
        L17:
            return r0
    }

    private static final <T> java.lang.Object startCoroutineUninterceptedOrReturn(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r1, kotlin.coroutines.Continuation<? super T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl
            if (r0 != 0) goto L13
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.wrapWithContinuationImpl(r1, r2)
            goto L1e
        L13:
            r0 = 1
            java.lang.Object r0 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, r0)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r0 = r0.invoke(r2)
        L1e:
            return r0
    }

    private static final <R, T> java.lang.Object startCoroutineUninterceptedOrReturn(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r1, R r2, kotlin.coroutines.Continuation<? super T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r1 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl
            if (r0 != 0) goto L13
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.wrapWithContinuationImpl(r1, r2, r3)
            goto L1e
        L13:
            r0 = 2
            java.lang.Object r0 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, r0)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            java.lang.Object r0 = r0.invoke(r2, r3)
        L1e:
            return r0
    }

    private static final <R, P, T> java.lang.Object startCoroutineUninterceptedOrReturn(kotlin.jvm.functions.Function3<? super R, ? super P, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r1, R r2, P r3, kotlin.coroutines.Continuation<? super T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r1 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl
            if (r0 != 0) goto L13
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.wrapWithContinuationImpl(r1, r2, r3, r4)
            goto L1e
        L13:
            r0 = 3
            java.lang.Object r0 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, r0)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            java.lang.Object r0 = r0.invoke(r2, r3, r4)
        L1e:
            return r0
    }

    public static final <T> java.lang.Object wrapWithContinuationImpl(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r3)
            kotlin.coroutines.Continuation r0 = createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(r0)
            r1 = 1
            java.lang.Object r1 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r2, r1)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r1 = r1.invoke(r0)
            return r1
    }

    public static final <R, T> java.lang.Object wrapWithContinuationImpl(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2, R r3, kotlin.coroutines.Continuation<? super T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r4)
            kotlin.coroutines.Continuation r0 = createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(r0)
            r1 = 2
            java.lang.Object r1 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r2, r1)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            java.lang.Object r1 = r1.invoke(r3, r0)
            return r1
    }

    public static final <R, P, T> java.lang.Object wrapWithContinuationImpl(kotlin.jvm.functions.Function3<? super R, ? super P, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2, R r3, P r4, kotlin.coroutines.Continuation<? super T> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r5)
            kotlin.coroutines.Continuation r0 = createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(r0)
            r1 = 3
            java.lang.Object r1 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r2, r1)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            java.lang.Object r1 = r1.invoke(r3, r4, r0)
            return r1
    }
}
