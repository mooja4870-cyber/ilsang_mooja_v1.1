package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00060\u0003j\u0002`\u0004B\u0005¢\u0006\u0002\u0010\u0005J\r\u0010\u0017\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0018J\r\u0010\u0019\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0018J\u001d\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000e2\u0006\u0010\u001b\u001a\u00020\tH$¢\u0006\u0002\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e0 H\u0084\bJ\u0015\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010#R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e2\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e@BX\u0084\u000e¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "S", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "()V", "_subscriptionCount", "Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "<set-?>", "", "nCollectors", "getNCollectors", "()I", "nextIndex", "", "slots", "getSlots", "()[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "getSubscriptionCount", "()Lkotlinx/coroutines/flow/StateFlow;", "allocateSlot", "()Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "createSlot", "createSlotArray", "size", "(I)[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "forEachSlotLocked", "", "block", "Lkotlin/Function1;", "freeSlot", "slot", "(Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractSharedFlow<S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>> {
    private kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow _subscriptionCount;
    private int nCollectors;
    private int nextIndex;
    private S[] slots;

    public AbstractSharedFlow() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ int access$getNCollectors(kotlinx.coroutines.flow.internal.AbstractSharedFlow r1) {
            int r0 = r1.nCollectors
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] access$getSlots(kotlinx.coroutines.flow.internal.AbstractSharedFlow r1) {
            S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>[] r0 = r1.slots
            return r0
    }

    protected final S allocateSlot() {
            r10 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            monitor-enter(r10)
            r3 = 0
            S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>[] r4 = r10.slots     // Catch: java.lang.Throwable -> L68
            r5 = 2
            if (r4 != 0) goto L15
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r5 = r10.createSlotArray(r5)     // Catch: java.lang.Throwable -> L68
            r6 = r5
            r7 = 0
            r10.slots = r6     // Catch: java.lang.Throwable -> L68
            r4 = r5
            goto L30
        L15:
            int r6 = r10.nCollectors     // Catch: java.lang.Throwable -> L68
            int r7 = r4.length     // Catch: java.lang.Throwable -> L68
            if (r6 < r7) goto L2f
            int r6 = r4.length     // Catch: java.lang.Throwable -> L68
            int r6 = r6 * r5
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r4, r6)     // Catch: java.lang.Throwable -> L68
            java.lang.String r6 = "copyOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch: java.lang.Throwable -> L68
            r6 = r5
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r6 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) r6     // Catch: java.lang.Throwable -> L68
            r7 = 0
            r10.slots = r6     // Catch: java.lang.Throwable -> L68
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r5 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) r5     // Catch: java.lang.Throwable -> L68
            r4 = r5
            goto L30
        L2f:
        L30:
            r5 = 0
            int r6 = r10.nextIndex     // Catch: java.lang.Throwable -> L68
            r5 = 0
        L35:
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L68
            if (r7 != 0) goto L42
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r7 = r10.createSlot()     // Catch: java.lang.Throwable -> L68
            r8 = r7
            r9 = 0
            r4[r6] = r8     // Catch: java.lang.Throwable -> L68
        L42:
            r5 = r7
            int r6 = r6 + 1
            int r7 = r4.length     // Catch: java.lang.Throwable -> L68
            if (r6 < r7) goto L49
            r6 = 0
        L49:
            java.lang.String r7 = "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r7)     // Catch: java.lang.Throwable -> L68
            boolean r7 = r5.allocateLocked(r10)     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L35
            r10.nextIndex = r6     // Catch: java.lang.Throwable -> L68
            int r7 = r10.nCollectors     // Catch: java.lang.Throwable -> L68
            r8 = 1
            int r7 = r7 + r8
            r10.nCollectors = r7     // Catch: java.lang.Throwable -> L68
            kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow r7 = r10._subscriptionCount     // Catch: java.lang.Throwable -> L68
            monitor-exit(r10)
            if (r7 == 0) goto L67
            r7.increment(r8)
        L67:
            return r5
        L68:
            r3 = move-exception
            monitor-exit(r10)
            throw r3
    }

    protected abstract S createSlot();

    protected abstract S[] createSlotArray(int r1);

    protected final void forEachSlotLocked(kotlin.jvm.functions.Function1<? super S, kotlin.Unit> r9) {
            r8 = this;
            r0 = 0
            int r1 = access$getNCollectors(r8)
            if (r1 != 0) goto L8
            return
        L8:
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r1 = access$getSlots(r8)
            if (r1 == 0) goto L22
            r2 = 0
            int r3 = r1.length
            r4 = 0
        L11:
            if (r4 >= r3) goto L21
            r5 = r1[r4]
            r6 = r5
            r7 = 0
            if (r6 == 0) goto L1c
            r9.invoke(r6)
        L1c:
            int r4 = r4 + 1
            goto L11
        L21:
        L22:
            return
    }

    protected final void freeSlot(S r8) {
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            monitor-enter(r7)
            r3 = 0
            int r4 = r7.nCollectors     // Catch: java.lang.Throwable -> L3d
            r5 = -1
            int r4 = r4 + r5
            r7.nCollectors = r4     // Catch: java.lang.Throwable -> L3d
            kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow r4 = r7._subscriptionCount     // Catch: java.lang.Throwable -> L3d
            r0 = r4
            int r4 = r7.nCollectors     // Catch: java.lang.Throwable -> L3d
            r6 = 0
            if (r4 != 0) goto L16
            r7.nextIndex = r6     // Catch: java.lang.Throwable -> L3d
        L16:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r4)     // Catch: java.lang.Throwable -> L3d
            kotlin.coroutines.Continuation[] r4 = r8.freeLocked(r7)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r7)
            int r1 = r4.length
        L23:
            if (r6 >= r1) goto L37
            r2 = r4[r6]
            if (r2 == 0) goto L34
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r3 = kotlin.Result.m153constructorimpl(r3)
            r2.resumeWith(r3)
        L34:
            int r6 = r6 + 1
            goto L23
        L37:
            if (r0 == 0) goto L3c
            r0.increment(r5)
        L3c:
            return
        L3d:
            r3 = move-exception
            monitor-exit(r7)
            throw r3
    }

    protected final int getNCollectors() {
            r1 = this;
            int r0 = r1.nCollectors
            return r0
    }

    protected final S[] getSlots() {
            r1 = this;
            S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>[] r0 = r1.slots
            return r0
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getSubscriptionCount() {
            r6 = this;
            r0 = 0
            r1 = 0
            monitor-enter(r6)
            r2 = 0
            kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow r3 = r6._subscriptionCount     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L15
            kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow r3 = new kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow     // Catch: java.lang.Throwable -> L1b
            int r4 = r6.nCollectors     // Catch: java.lang.Throwable -> L1b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1b
            r4 = r3
            r5 = 0
            r6._subscriptionCount = r4     // Catch: java.lang.Throwable -> L1b
        L15:
            monitor-exit(r6)
            kotlinx.coroutines.flow.StateFlow r3 = (kotlinx.coroutines.flow.StateFlow) r3
            return r3
        L1b:
            r2 = move-exception
            monitor-exit(r6)
            throw r2
    }
}
