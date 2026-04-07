package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u000e\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ'\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00100\u000f2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\tR\"\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "Lkotlinx/coroutines/flow/StateFlowImpl;", "()V", "_state", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "allocateLocked", "", "flow", "awaitPending", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "freeLocked", "", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/flow/StateFlowImpl;)[Lkotlin/coroutines/Continuation;", "makePending", "takePending", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class StateFlowSlot extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlinx.coroutines.flow.StateFlowImpl<?>> {
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> _state;

    public StateFlowSlot() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            r2._state = r0
            return
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReference access$get_state$p(kotlinx.coroutines.flow.StateFlowSlot r1) {
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r1._state
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public /* bridge */ /* synthetic */ boolean allocateLocked(kotlinx.coroutines.flow.StateFlowImpl<?> r2) {
            r1 = this;
            r0 = r2
            kotlinx.coroutines.flow.StateFlowImpl r0 = (kotlinx.coroutines.flow.StateFlowImpl) r0
            boolean r0 = r1.allocateLocked2(r0)
            return r0
    }

    /* JADX INFO: renamed from: allocateLocked, reason: avoid collision after fix types in other method */
    public boolean allocateLocked2(kotlinx.coroutines.flow.StateFlowImpl<?> r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2._state
            java.lang.Object r0 = kotlinx.coroutines.internal.Concurrent_commonKt.getValue(r0)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2._state
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            kotlinx.coroutines.internal.Concurrent_commonKt.setValue(r0, r1)
            r0 = 1
            return r0
    }

    public final java.lang.Object awaitPending(kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            r10 = this;
            r0 = 0
            r1 = r11
            r2 = 0
            kotlinx.coroutines.CancellableContinuationImpl r3 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            r5 = 1
            r3.<init>(r4, r5)
            r3.initCancellability()
            r4 = r3
            kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
            r6 = 0
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r7 == 0) goto L2e
            r7 = 0
            java.util.concurrent.atomic.AtomicReference r8 = access$get_state$p(r10)
            java.lang.Object r8 = kotlinx.coroutines.internal.Concurrent_commonKt.getValue(r8)
            boolean r8 = r8 instanceof kotlinx.coroutines.CancellableContinuationImpl
            if (r8 != 0) goto L28
            goto L2e
        L28:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L2e:
            java.util.concurrent.atomic.AtomicReference r7 = access$get_state$p(r10)
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            boolean r7 = androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(r7, r8, r4)
            if (r7 != 0) goto L6b
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r7 == 0) goto L5c
            r7 = 0
            java.util.concurrent.atomic.AtomicReference r8 = access$get_state$p(r10)
            java.lang.Object r8 = kotlinx.coroutines.internal.Concurrent_commonKt.getValue(r8)
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
            if (r8 != r9) goto L52
            goto L53
        L52:
            r5 = 0
        L53:
            if (r5 == 0) goto L56
            goto L5c
        L56:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L5c:
            r5 = r4
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            kotlin.Result$Companion r7 = kotlin.Result.Companion
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            java.lang.Object r7 = kotlin.Result.m153constructorimpl(r7)
            r5.resumeWith(r7)
        L6b:
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L79
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r11)
        L79:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L80
            return r1
        L80:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public /* bridge */ /* synthetic */ kotlin.coroutines.Continuation[] freeLocked(kotlinx.coroutines.flow.StateFlowImpl<?> r2) {
            r1 = this;
            r0 = r2
            kotlinx.coroutines.flow.StateFlowImpl r0 = (kotlinx.coroutines.flow.StateFlowImpl) r0
            kotlin.coroutines.Continuation[] r0 = r1.freeLocked2(r0)
            return r0
    }

    /* JADX INFO: renamed from: freeLocked, reason: avoid collision after fix types in other method */
    public kotlin.coroutines.Continuation<kotlin.Unit>[] freeLocked2(kotlinx.coroutines.flow.StateFlowImpl<?> r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2._state
            r1 = 0
            kotlinx.coroutines.internal.Concurrent_commonKt.setValue(r0, r1)
            kotlin.coroutines.Continuation<kotlin.Unit>[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            return r0
    }

    public final void makePending() {
            r7 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r7._state
            r1 = 0
        L3:
            java.lang.Object r2 = kotlinx.coroutines.internal.Concurrent_commonKt.getValue(r0)
            r3 = r0
            r4 = 0
            if (r2 != 0) goto Le
            return
        Le:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
            if (r2 != r5) goto L15
            return
        L15:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            if (r2 != r5) goto L28
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r5 = r7._state
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
            boolean r5 = androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(r5, r2, r6)
            if (r5 == 0) goto L45
            return
        L28:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r5 = r7._state
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            boolean r5 = androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(r5, r2, r6)
            if (r5 == 0) goto L45
            r5 = r2
            kotlinx.coroutines.CancellableContinuationImpl r5 = (kotlinx.coroutines.CancellableContinuationImpl) r5
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            kotlin.Result$Companion r6 = kotlin.Result.Companion
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            java.lang.Object r6 = kotlin.Result.m153constructorimpl(r6)
            r5.resumeWith(r6)
            return
        L45:
            goto L3
    }

    public final boolean takePending() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r4._state
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            java.lang.Object r0 = r0.getAndSet(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = 0
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto L20
            r2 = 0
            boolean r3 = r0 instanceof kotlinx.coroutines.CancellableContinuationImpl
            if (r3 != 0) goto L1a
            goto L20
        L1a:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L20:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
            if (r0 != r2) goto L28
            r2 = 1
            goto L29
        L28:
            r2 = 0
        L29:
            return r2
    }
}
