package kotlinx.coroutines;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000\u001a0\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0086H¢\u0006\u0002\u0010\n\u001a0\u0010\u000b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0001\u0012\u0004\u0012\u00020\t0\u0007H\u0080H¢\u0006\u0002\u0010\n\u001a\u0018\u0010\f\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a \u0010\u000f\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¨\u0006\u0012"}, d2 = {"getOrCreateCancellableContinuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "delegate", "Lkotlin/coroutines/Continuation;", "suspendCancellableCoroutine", "block", "Lkotlin/Function1;", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suspendCancellableCoroutineReusable", "disposeOnCancellation", "handle", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCancellation", "handler", "Lkotlinx/coroutines/CancelHandler;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CancellableContinuationKt {
    public static final void disposeOnCancellation(kotlinx.coroutines.CancellableContinuation<?> r1, kotlinx.coroutines.DisposableHandle r2) {
            kotlinx.coroutines.DisposeOnCancel r0 = new kotlinx.coroutines.DisposeOnCancel
            r0.<init>(r2)
            kotlinx.coroutines.CancelHandler r0 = (kotlinx.coroutines.CancelHandler) r0
            invokeOnCancellation(r1, r0)
            return
    }

    public static final <T> kotlinx.coroutines.CancellableContinuationImpl<T> getOrCreateCancellableContinuation(kotlin.coroutines.Continuation<? super T> r3) {
            boolean r0 = r3 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 != 0) goto Lb
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            r1 = 1
            r0.<init>(r3, r1)
            return r0
        Lb:
            r0 = r3
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            kotlinx.coroutines.CancellableContinuationImpl r0 = r0.claimReusableCancellableContinuation$kotlinx_coroutines_core()
            if (r0 == 0) goto L22
            r1 = r0
            r2 = 0
            boolean r1 = r1.resetStateReusable()
            if (r1 == 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 != 0) goto L21
            goto L22
        L21:
            return r0
        L22:
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            r1 = 2
            r0.<init>(r3, r1)
            return r0
    }

    public static final <T> void invokeOnCancellation(kotlinx.coroutines.CancellableContinuation<? super T> r2, kotlinx.coroutines.CancelHandler r3) {
            boolean r0 = r2 instanceof kotlinx.coroutines.CancellableContinuationImpl
            if (r0 == 0) goto Lc
            r0 = r2
            kotlinx.coroutines.CancellableContinuationImpl r0 = (kotlinx.coroutines.CancellableContinuationImpl) r0
            r0.invokeOnCancellationInternal$kotlinx_coroutines_core(r3)
            return
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "third-party implementation of CancellableContinuation is not supported"
            r0.<init>(r1)
            throw r0
    }

    public static final <T> java.lang.Object suspendCancellableCoroutine(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuation<? super T>, kotlin.Unit> r6, kotlin.coroutines.Continuation<? super T> r7) {
            r0 = 0
            r1 = r7
            r2 = 0
            kotlinx.coroutines.CancellableContinuationImpl r3 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            r5 = 1
            r3.<init>(r4, r5)
            r3.initCancellability()
            r6.invoke(r3)
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L20
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r7)
        L20:
            return r1
    }

    private static final <T> java.lang.Object suspendCancellableCoroutine$$forInline(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuation<? super T>, kotlin.Unit> r6, kotlin.coroutines.Continuation<? super T> r7) {
            r0 = 0
            r1 = r7
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r2 = 0
            kotlinx.coroutines.CancellableContinuationImpl r3 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            r5 = 1
            r3.<init>(r4, r5)
            r3.initCancellability()
            r6.invoke(r3)
            java.lang.Object r4 = r3.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r1) goto L25
            r1 = r7
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r1)
        L25:
            return r4
    }

    public static final <T> java.lang.Object suspendCancellableCoroutineReusable(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuationImpl<? super T>, kotlin.Unit> r5, kotlin.coroutines.Continuation<? super T> r6) {
            r0 = 0
            r1 = r6
            r2 = 0
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            kotlinx.coroutines.CancellableContinuationImpl r3 = getOrCreateCancellableContinuation(r3)
            r5.invoke(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L1c
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
        L1c:
            return r1
        L1d:
            r4 = move-exception
            r3.releaseClaimedReusableContinuation$kotlinx_coroutines_core()
            throw r4
    }

    private static final <T> java.lang.Object suspendCancellableCoroutineReusable$$forInline(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuationImpl<? super T>, kotlin.Unit> r5, kotlin.coroutines.Continuation<? super T> r6) {
            r0 = 0
            r1 = r6
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r2 = 0
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            kotlinx.coroutines.CancellableContinuationImpl r3 = getOrCreateCancellableContinuation(r3)
            r5.invoke(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r4 = r3.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r1) goto L21
            r1 = r6
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r1)
        L21:
            return r4
        L22:
            r4 = move-exception
            r3.releaseClaimedReusableContinuation$kotlinx_coroutines_core()
            throw r4
    }
}
