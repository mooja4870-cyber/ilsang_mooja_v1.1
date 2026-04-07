package kotlinx.coroutines.future;

/* JADX INFO: compiled from: Future.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a\u001e\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0086@¢\u0006\u0002\u0010\t\u001aX\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\u0010\u0015\u001a\u0018\u0010\u0016\u001a\u00020\u0004*\u00020\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¨\u0006\u0017"}, d2 = {"asCompletableFuture", "Ljava/util/concurrent/CompletableFuture;", "T", "Lkotlinx/coroutines/Deferred;", "", "Lkotlinx/coroutines/Job;", "asDeferred", "Ljava/util/concurrent/CompletionStage;", "await", "(Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "future", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "start", "Lkotlinx/coroutines/CoroutineStart;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Ljava/util/concurrent/CompletableFuture;", "setupCancellation", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FutureKt {




    /* JADX INFO: renamed from: $r8$lambda$CVsR10o-YJP4IN5741Ey9yO9s50, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m1700$r8$lambda$CVsR10oYJP4IN5741Ey9yO9s50(kotlin.jvm.functions.Function2 r0, java.lang.Object r1, java.lang.Throwable r2) {
            java.lang.Object r0 = asDeferred$lambda$4(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nhDb5E9NjAZTF31felWqlfP4Z1A(kotlinx.coroutines.Job r0, java.lang.Object r1, java.lang.Throwable r2) {
            kotlin.Unit r0 = setupCancellation$lambda$2(r0, r1, r2)
            return r0
    }

    public static final <T> java.util.concurrent.CompletableFuture<T> asCompletableFuture(kotlinx.coroutines.Deferred<? extends T> r2) {
            java.util.concurrent.CompletableFuture r0 = new java.util.concurrent.CompletableFuture
            r0.<init>()
            r1 = r2
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            setupCancellation(r1, r0)
            kotlinx.coroutines.future.FutureKt$asCompletableFuture$1 r1 = new kotlinx.coroutines.future.FutureKt$asCompletableFuture$1
            r1.<init>(r0, r2)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r2.invokeOnCompletion(r1)
            return r0
    }

    public static final java.util.concurrent.CompletableFuture<kotlin.Unit> asCompletableFuture(kotlinx.coroutines.Job r2) {
            java.util.concurrent.CompletableFuture r0 = new java.util.concurrent.CompletableFuture
            r0.<init>()
            setupCancellation(r2, r0)
            kotlinx.coroutines.future.FutureKt$asCompletableFuture$2 r1 = new kotlinx.coroutines.future.FutureKt$asCompletableFuture$2
            r1.<init>(r0)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r2.invokeOnCompletion(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.Deferred<T> asDeferred(java.util.concurrent.CompletionStage<T> r6) {
            java.util.concurrent.CompletableFuture r0 = r6.toCompletableFuture()
            boolean r1 = r0.isDone()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
        Ld:
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> L18
            kotlinx.coroutines.CompletableDeferred r1 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(r1)     // Catch: java.lang.Throwable -> L18
            kotlinx.coroutines.Deferred r1 = (kotlinx.coroutines.Deferred) r1     // Catch: java.lang.Throwable -> L18
            goto L37
        L18:
            r1 = move-exception
            boolean r4 = r1 instanceof java.util.concurrent.ExecutionException
            if (r4 == 0) goto L21
            r4 = r1
            java.util.concurrent.ExecutionException r4 = (java.util.concurrent.ExecutionException) r4
            goto L22
        L21:
            r4 = r3
        L22:
            if (r4 == 0) goto L2a
            java.lang.Throwable r4 = r4.getCause()
            if (r4 != 0) goto L2b
        L2a:
            r4 = r1
        L2b:
            kotlinx.coroutines.CompletableDeferred r2 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r3, r2, r3)
            r3 = r2
            r5 = 0
            r3.completeExceptionally(r4)
            kotlinx.coroutines.Deferred r2 = (kotlinx.coroutines.Deferred) r2
            r1 = r2
        L37:
            return r1
        L38:
            kotlinx.coroutines.CompletableDeferred r1 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r3, r2, r3)
            kotlinx.coroutines.future.FutureKt$asDeferred$2 r2 = new kotlinx.coroutines.future.FutureKt$asDeferred$2
            r2.<init>(r1)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda0 r3 = new kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda0
            r3.<init>(r2)
            r6.handle(r3)
            r2 = r1
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            r3 = r0
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            kotlinx.coroutines.JobKt.cancelFutureOnCompletion(r2, r3)
            r2 = r1
            kotlinx.coroutines.Deferred r2 = (kotlinx.coroutines.Deferred) r2
            return r2
    }

    private static final java.lang.Object asDeferred$lambda$4(kotlin.jvm.functions.Function2 r1, java.lang.Object r2, java.lang.Throwable r3) {
            java.lang.Object r0 = r1.invoke(r2, r3)
            return r0
    }

    public static final <T> java.lang.Object await(java.util.concurrent.CompletionStage<T> r9, kotlin.coroutines.Continuation<? super T> r10) {
            java.util.concurrent.CompletableFuture r0 = r9.toCompletableFuture()
            boolean r1 = r0.isDone()
            if (r1 == 0) goto L1b
        Lb:
            java.lang.Object r1 = r0.get()     // Catch: java.util.concurrent.ExecutionException -> L10
            return r1
        L10:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()
            if (r2 != 0) goto L1a
            r2 = r1
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L1a:
            throw r2
        L1b:
            r1 = 0
            r2 = r10
            r3 = 0
            kotlinx.coroutines.CancellableContinuationImpl r4 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r2)
            r6 = 1
            r4.<init>(r5, r6)
            r4.initCancellability()
            r5 = r4
            kotlinx.coroutines.CancellableContinuation r5 = (kotlinx.coroutines.CancellableContinuation) r5
            r6 = 0
            kotlinx.coroutines.future.ContinuationHandler r7 = new kotlinx.coroutines.future.ContinuationHandler
            r8 = r5
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            r7.<init>(r8)
            r8 = r7
            java.util.function.BiFunction r8 = (java.util.function.BiFunction) r8
            r9.handle(r8)
            kotlinx.coroutines.future.FutureKt$await$2$1 r8 = new kotlinx.coroutines.future.FutureKt$await$2$1
            r8.<init>(r0, r7)
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r5.invokeOnCancellation(r8)
            java.lang.Object r2 = r4.getResult()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L56
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r10)
        L56:
            return r2
    }

    public static final <T> java.util.concurrent.CompletableFuture<T> future(kotlinx.coroutines.CoroutineScope r4, kotlin.coroutines.CoroutineContext r5, kotlinx.coroutines.CoroutineStart r6, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r7) {
            boolean r0 = r6.isLazy()
            if (r0 != 0) goto L1e
            kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r4, r5)
            java.util.concurrent.CompletableFuture r1 = new java.util.concurrent.CompletableFuture
            r1.<init>()
            kotlinx.coroutines.future.CompletableFutureCoroutine r2 = new kotlinx.coroutines.future.CompletableFutureCoroutine
            r2.<init>(r0, r1)
            r3 = r2
            java.util.function.BiFunction r3 = (java.util.function.BiFunction) r3
            r1.handle(r3)
            r2.start(r6, r2, r7)
            return r1
        L1e:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " start is not supported"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static /* synthetic */ java.util.concurrent.CompletableFuture future$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, kotlinx.coroutines.CoroutineStart r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        L8:
            r4 = r4 & 2
            if (r4 == 0) goto Le
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.DEFAULT
        Le:
            java.util.concurrent.CompletableFuture r0 = future(r0, r1, r2, r3)
            return r0
    }

    private static final void setupCancellation(kotlinx.coroutines.Job r1, java.util.concurrent.CompletableFuture<?> r2) {
            kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda1 r0 = new kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda1
            r0.<init>(r1)
            r2.handle(r0)
            return
    }

    private static final kotlin.Unit setupCancellation$lambda$2(kotlinx.coroutines.Job r3, java.lang.Object r4, java.lang.Throwable r5) {
            r4 = 0
            if (r5 == 0) goto L14
            r0 = r5
            r1 = 0
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto Lc
            r4 = r0
            java.util.concurrent.CancellationException r4 = (java.util.concurrent.CancellationException) r4
        Lc:
            if (r4 != 0) goto L14
            java.lang.String r4 = "CompletableFuture was completed exceptionally"
            java.util.concurrent.CancellationException r4 = kotlinx.coroutines.ExceptionsKt.CancellationException(r4, r0)
        L14:
            r3.cancel(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }
}
