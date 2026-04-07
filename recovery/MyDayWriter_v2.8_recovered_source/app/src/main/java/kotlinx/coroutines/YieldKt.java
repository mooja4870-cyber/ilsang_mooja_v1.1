package kotlinx.coroutines;

/* JADX INFO: compiled from: Yield.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u0001H\u0086@¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"yield", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class YieldKt {
    public static final java.lang.Object yield(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            r0 = r7
            r1 = 0
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            kotlinx.coroutines.JobKt.ensureActive(r2)
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            boolean r4 = r3 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r4 == 0) goto L14
            kotlinx.coroutines.internal.DispatchedContinuation r3 = (kotlinx.coroutines.internal.DispatchedContinuation) r3
            goto L15
        L14:
            r3 = 0
        L15:
            if (r3 != 0) goto L1a
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            goto L51
        L1a:
            kotlinx.coroutines.CoroutineDispatcher r4 = r3.dispatcher
            boolean r4 = r4.isDispatchNeeded(r2)
            if (r4 == 0) goto L28
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            r3.dispatchYield$kotlinx_coroutines_core(r2, r4)
            goto L4c
        L28:
            kotlinx.coroutines.YieldContext r4 = new kotlinx.coroutines.YieldContext
            r4.<init>()
            r5 = r4
            kotlin.coroutines.CoroutineContext r5 = (kotlin.coroutines.CoroutineContext) r5
            kotlin.coroutines.CoroutineContext r5 = r2.plus(r5)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r3.dispatchYield$kotlinx_coroutines_core(r5, r6)
            boolean r5 = r4.dispatcherWasUnconfined
            if (r5 == 0) goto L4c
            boolean r5 = kotlinx.coroutines.internal.DispatchedContinuationKt.yieldUndispatched(r3)
            if (r5 == 0) goto L48
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            goto L4a
        L48:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
        L4a:
            r3 = r5
            goto L51
        L4c:
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r3 = r4
        L51:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r0) goto L5a
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r7)
        L5a:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r0) goto L61
            return r3
        L61:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
