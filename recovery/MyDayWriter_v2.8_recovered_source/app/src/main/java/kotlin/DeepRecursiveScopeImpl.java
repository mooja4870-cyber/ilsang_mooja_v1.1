package kotlin;

/* JADX INFO: compiled from: DeepRecursive.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004BH\u00129\u0010\u0005\u001a5\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0002\b\b\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u0016\u0010\u0015\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0016J`\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000429\u0010\u0018\u001a5\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0002\b\b2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0002¢\u0006\u0002\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016¢\u0006\u0002\u0010\u001cJ\u000b\u0010\u001d\u001a\u00028\u0001¢\u0006\u0002\u0010\u001eJ2\u0010\u0015\u001a\u0002H\u001f\"\u0004\b\u0002\u0010 \"\u0004\b\u0003\u0010\u001f*\u000e\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H\u001f0!2\u0006\u0010\t\u001a\u0002H H\u0096@¢\u0006\u0002\u0010\"R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fRC\u0010\u0010\u001a5\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0002\b\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u001b\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0013X\u0082\u000eø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006#"}, d2 = {"Lkotlin/DeepRecursiveScopeImpl;", "T", "R", "Lkotlin/DeepRecursiveScope;", "Lkotlin/coroutines/Continuation;", "block", "Lkotlin/Function3;", "", "Lkotlin/ExtensionFunctionType;", "value", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;)V", "cont", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "function", "Lkotlin/jvm/functions/Function3;", "result", "Lkotlin/Result;", "Ljava/lang/Object;", "callRecursive", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "crossFunctionCompletion", "currentFunction", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "resumeWith", "", "(Ljava/lang/Object;)V", "runCallLoop", "()Ljava/lang/Object;", "S", "U", "Lkotlin/DeepRecursiveFunction;", "(Lkotlin/DeepRecursiveFunction;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DeepRecursiveScopeImpl<T, R> extends kotlin.DeepRecursiveScope<T, R> implements kotlin.coroutines.Continuation<R> {
    private kotlin.coroutines.Continuation<java.lang.Object> cont;
    private kotlin.jvm.functions.Function3<? super kotlin.DeepRecursiveScope<?, ?>, java.lang.Object, ? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> function;
    private java.lang.Object result;
    private java.lang.Object value;

    public DeepRecursiveScopeImpl(kotlin.jvm.functions.Function3<? super kotlin.DeepRecursiveScope<T, R>, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2, T r3) {
            r1 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            r1.<init>(r0)
            r1.function = r2
            r1.value = r3
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            r0 = r1
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            r1.cont = r0
            java.lang.Object r0 = kotlin.DeepRecursiveKt.access$getUNDEFINED_RESULT$p()
            r1.result = r0
            return
    }

    public static final /* synthetic */ void access$setCont$p(kotlin.DeepRecursiveScopeImpl r0, kotlin.coroutines.Continuation r1) {
            r0.cont = r1
            return
    }

    public static final /* synthetic */ void access$setFunction$p(kotlin.DeepRecursiveScopeImpl r0, kotlin.jvm.functions.Function3 r1) {
            r0.function = r1
            return
    }

    public static final /* synthetic */ void access$setResult$p(kotlin.DeepRecursiveScopeImpl r0, java.lang.Object r1) {
            r0.result = r1
            return
    }

    private final kotlin.coroutines.Continuation<java.lang.Object> crossFunctionCompletion(kotlin.jvm.functions.Function3<? super kotlin.DeepRecursiveScope<?, ?>, java.lang.Object, ? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<java.lang.Object> r4) {
            r2 = this;
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            kotlin.DeepRecursiveScopeImpl$crossFunctionCompletion$$inlined$Continuation$1 r1 = new kotlin.DeepRecursiveScopeImpl$crossFunctionCompletion$$inlined$Continuation$1
            r1.<init>(r0, r2, r3, r4)
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            return r1
    }

    @Override // kotlin.DeepRecursiveScope
    public java.lang.Object callRecursive(T r4, kotlin.coroutines.Continuation<? super R> r5) {
            r3 = this;
            r0 = r5
            r1 = 0
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)
            r3.cont = r0
            r3.value = r4
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L18
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L18:
            return r0
    }

    @Override // kotlin.DeepRecursiveScope
    public <U, S> java.lang.Object callRecursive(kotlin.DeepRecursiveFunction<U, S> r8, U r9, kotlin.coroutines.Continuation<? super S> r10) {
            r7 = this;
            r0 = r10
            r1 = 0
            kotlin.jvm.functions.Function3 r2 = r8.getBlock$kotlin_stdlib()
            java.lang.String r3 = "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>{ kotlin.DeepRecursiveKt.DeepRecursiveFunctionBlock }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            r3 = r7
            kotlin.DeepRecursiveScopeImpl r3 = (kotlin.DeepRecursiveScopeImpl) r3
            r4 = 0
            kotlin.jvm.functions.Function3<? super kotlin.DeepRecursiveScope<?, ?>, java.lang.Object, ? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> r5 = r3.function
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"
            if (r2 == r5) goto L21
            r3.function = r2
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r6)
            kotlin.coroutines.Continuation r6 = r3.crossFunctionCompletion(r5, r0)
            r3.cont = r6
            goto L26
        L21:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r6)
            r3.cont = r0
        L26:
            r3.value = r9
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L37
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r10)
        L37:
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            r1.cont = r0
            r1.result = r2
            return
    }

    public final R runCallLoop() {
            r5 = this;
        L1:
            java.lang.Object r0 = r5.result
            kotlin.coroutines.Continuation<java.lang.Object> r1 = r5.cont
            if (r1 != 0) goto Lc
            kotlin.ResultKt.throwOnFailure(r0)
            return r0
        Lc:
            java.lang.Object r2 = kotlin.DeepRecursiveKt.access$getUNDEFINED_RESULT$p()
            boolean r2 = kotlin.Result.m155equalsimpl0(r2, r0)
            if (r2 == 0) goto L4f
        L17:
            kotlin.jvm.functions.Function3<? super kotlin.DeepRecursiveScope<?, ?>, java.lang.Object, ? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> r2 = r5.function     // Catch: java.lang.Throwable -> L40
            java.lang.Object r3 = r5.value     // Catch: java.lang.Throwable -> L40
            boolean r4 = r2 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl     // Catch: java.lang.Throwable -> L40
            if (r4 != 0) goto L24
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.wrapWithContinuationImpl(r2, r5, r3, r1)     // Catch: java.lang.Throwable -> L40
            goto L2f
        L24:
            r4 = 3
            java.lang.Object r2 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r2, r4)     // Catch: java.lang.Throwable -> L40
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2     // Catch: java.lang.Throwable -> L40
            java.lang.Object r2 = r2.invoke(r5, r3, r1)     // Catch: java.lang.Throwable -> L40
        L2f:
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 == r3) goto L1
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.Result.m153constructorimpl(r2)
            r1.resumeWith(r3)
            goto L1
        L40:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r3 = kotlin.Result.m153constructorimpl(r3)
            r1.resumeWith(r3)
            goto L1
        L4f:
            java.lang.Object r2 = kotlin.DeepRecursiveKt.access$getUNDEFINED_RESULT$p()
            r5.result = r2
            r1.resumeWith(r0)
            goto L1
    }
}
