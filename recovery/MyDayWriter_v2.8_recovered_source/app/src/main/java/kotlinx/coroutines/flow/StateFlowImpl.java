package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0003H\u0014J\u001d\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\"2\u0006\u0010#\u001a\u00020\u0011H\u0014¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020&2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010'J&\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020&H\u0016J\u0015\u00100\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u001a\u00102\u001a\u00020\u001c2\b\u00103\u001a\u0004\u0018\u00010\b2\u0006\u00104\u001a\u00020\bH\u0002R\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bX\u0082\u0004R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\t¨\u00065"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "initialState", "", "(Ljava/lang/Object;)V", "_state", "Lkotlinx/atomicfu/AtomicRef;", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "sequence", "", "value", "getValue", "()Ljava/lang/Object;", "setValue", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compareAndSet", "", "expect", "update", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "createSlot", "createSlotArray", "", "size", "(I)[Lkotlinx/coroutines/flow/StateFlowSlot;", "emit", "", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "resetReplayCache", "tryEmit", "(Ljava/lang/Object;)Z", "updateState", "expectedState", "newState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class StateFlowImpl<T> extends kotlinx.coroutines.flow.internal.AbstractSharedFlow<kotlinx.coroutines.flow.StateFlowSlot> implements kotlinx.coroutines.flow.MutableStateFlow<T>, kotlinx.coroutines.flow.CancellableFlow<T>, kotlinx.coroutines.flow.internal.FusibleFlow<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$volatile$FU = null;
    private volatile /* synthetic */ java.lang.Object _state$volatile;
    private int sequence;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: StateFlow.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {384, 396, 401}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.flow.StateFlowImpl<T> this$0;

        AnonymousClass1(kotlinx.coroutines.flow.StateFlowImpl<T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StateFlowImpl.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                r3.result = r4
                int r0 = r3.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r3.label = r0
                kotlinx.coroutines.flow.StateFlowImpl<T> r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.collect(r1, r2)
                return r0
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state$volatile"
            java.lang.Class<kotlinx.coroutines.flow.StateFlowImpl> r2 = kotlinx.coroutines.flow.StateFlowImpl.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.flow.StateFlowImpl._state$volatile$FU = r0
            return
    }

    public StateFlowImpl(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0._state$volatile = r1
            return
    }

    private final /* synthetic */ java.lang.Object get_state$volatile() {
            r1 = this;
            java.lang.Object r0 = r1._state$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_state$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.flow.StateFlowImpl._state$volatile$FU
            return r0
    }

    private final /* synthetic */ void set_state$volatile(java.lang.Object r1) {
            r0 = this;
            r0._state$volatile = r1
            return
    }

    private final boolean updateState(java.lang.Object r12, java.lang.Object r13) {
            r11 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            monitor-enter(r11)
            r4 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = get_state$volatile$FU()     // Catch: java.lang.Throwable -> L81
            java.lang.Object r5 = r5.get(r11)     // Catch: java.lang.Throwable -> L81
            r6 = 0
            if (r12 == 0) goto L1a
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r12)     // Catch: java.lang.Throwable -> L81
            if (r7 != 0) goto L1a
            monitor-exit(r11)
            return r6
        L1a:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r13)     // Catch: java.lang.Throwable -> L81
            r8 = 1
            if (r7 == 0) goto L23
            monitor-exit(r11)
            return r8
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = get_state$volatile$FU()     // Catch: java.lang.Throwable -> L81
            r7.set(r11, r13)     // Catch: java.lang.Throwable -> L81
            int r7 = r11.sequence     // Catch: java.lang.Throwable -> L81
            r0 = r7
            r7 = r0 & 1
            if (r7 != 0) goto L7a
            int r0 = r0 + 1
            r11.sequence = r0     // Catch: java.lang.Throwable -> L81
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r7 = r11.getSlots()     // Catch: java.lang.Throwable -> L81
            r1 = r7
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L81
            monitor-exit(r11)
        L3f:
            r2 = r1
            kotlinx.coroutines.flow.StateFlowSlot[] r2 = (kotlinx.coroutines.flow.StateFlowSlot[]) r2
            if (r2 == 0) goto L59
            r3 = 0
            int r4 = r2.length
            r5 = r6
        L48:
            if (r5 >= r4) goto L58
            r7 = r2[r5]
            r9 = r7
            r10 = 0
            if (r9 == 0) goto L53
            r9.makePending()
        L53:
            int r5 = r5 + 1
            goto L48
        L58:
        L59:
            r2 = 0
            r3 = 0
            monitor-enter(r11)
            r4 = 0
            int r5 = r11.sequence     // Catch: java.lang.Throwable -> L77
            if (r5 != r0) goto L69
            int r5 = r0 + 1
            r11.sequence = r5     // Catch: java.lang.Throwable -> L77
            monitor-exit(r11)
            return r8
        L69:
            int r5 = r11.sequence     // Catch: java.lang.Throwable -> L77
            r0 = r5
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r5 = r11.getSlots()     // Catch: java.lang.Throwable -> L77
            r1 = r5
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L77
            monitor-exit(r11)
            goto L3f
        L77:
            r4 = move-exception
            monitor-exit(r11)
            throw r4
        L7a:
            int r6 = r0 + 2
            r11.sequence = r6     // Catch: java.lang.Throwable -> L81
            monitor-exit(r11)
            return r8
        L81:
            r4 = move-exception
            monitor-exit(r11)
            throw r4
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r11, kotlin.coroutines.Continuation<?> r12) {
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.StateFlowImpl.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r12
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.StateFlowImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.StateFlowImpl$collect$1
            r0.<init>(r10, r12)
        L19:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L6f;
                case 1: goto L5d;
                case 2: goto L46;
                case 3: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2c:
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.flow.StateFlowSlot r3 = (kotlinx.coroutines.flow.StateFlowSlot) r3
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r5 = (kotlinx.coroutines.flow.StateFlowImpl) r5
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> Lf4
            r9 = r4
            r4 = r11
            r11 = r9
            goto Lf3
        L46:
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.flow.StateFlowSlot r3 = (kotlinx.coroutines.flow.StateFlowSlot) r3
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r5 = (kotlinx.coroutines.flow.StateFlowImpl) r5
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> Lf4
            goto Ld6
        L5d:
            java.lang.Object r11 = r0.L$2
            r3 = r11
            kotlinx.coroutines.flow.StateFlowSlot r3 = (kotlinx.coroutines.flow.StateFlowSlot) r3
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            java.lang.Object r2 = r0.L$0
            r5 = r2
            kotlinx.coroutines.flow.StateFlowImpl r5 = (kotlinx.coroutines.flow.StateFlowImpl) r5
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> Lf4
            goto L92
        L6f:
            kotlin.ResultKt.throwOnFailure(r12)
            r5 = r10
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r2 = r5.allocateSlot()
            r3 = r2
            kotlinx.coroutines.flow.StateFlowSlot r3 = (kotlinx.coroutines.flow.StateFlowSlot) r3
            boolean r2 = r11 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch: java.lang.Throwable -> Lf4
            if (r2 == 0) goto L93
            r2 = r11
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r2     // Catch: java.lang.Throwable -> Lf4
            r0.L$0 = r5     // Catch: java.lang.Throwable -> Lf4
            r0.L$1 = r11     // Catch: java.lang.Throwable -> Lf4
            r0.L$2 = r3     // Catch: java.lang.Throwable -> Lf4
            r4 = 1
            r0.label = r4     // Catch: java.lang.Throwable -> Lf4
            java.lang.Object r2 = r2.onSubscription(r0)     // Catch: java.lang.Throwable -> Lf4
            if (r2 != r1) goto L92
            return r1
        L92:
        L93:
            r2 = 0
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()     // Catch: java.lang.Throwable -> Lf4
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> Lf4
            kotlin.coroutines.CoroutineContext$Key r2 = (kotlin.coroutines.CoroutineContext.Key) r2     // Catch: java.lang.Throwable -> Lf4
            kotlin.coroutines.CoroutineContext$Element r2 = r4.get(r2)     // Catch: java.lang.Throwable -> Lf4
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2     // Catch: java.lang.Throwable -> Lf4
            r4 = 0
        La3:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = get_state$volatile$FU()     // Catch: java.lang.Throwable -> Lf4
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> Lf4
            if (r2 == 0) goto Lb0
            kotlinx.coroutines.JobKt.ensureActive(r2)     // Catch: java.lang.Throwable -> Lf4
        Lb0:
            if (r4 == 0) goto Lb8
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)     // Catch: java.lang.Throwable -> Lf4
            if (r7 != 0) goto Ld9
        Lb8:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL     // Catch: java.lang.Throwable -> Lf4
            r7 = 0
            if (r6 != r4) goto Lbf
            r8 = 0
            goto Lc0
        Lbf:
            r8 = r6
        Lc0:
            r0.L$0 = r5     // Catch: java.lang.Throwable -> Lf4
            r0.L$1 = r11     // Catch: java.lang.Throwable -> Lf4
            r0.L$2 = r3     // Catch: java.lang.Throwable -> Lf4
            r0.L$3 = r2     // Catch: java.lang.Throwable -> Lf4
            r0.L$4 = r6     // Catch: java.lang.Throwable -> Lf4
            r4 = 2
            r0.label = r4     // Catch: java.lang.Throwable -> Lf4
            java.lang.Object r4 = r11.emit(r8, r0)     // Catch: java.lang.Throwable -> Lf4
            if (r4 != r1) goto Ld4
            return r1
        Ld4:
            r4 = r11
            r11 = r6
        Ld6:
            r6 = r11
            r11 = r4
            r4 = r6
        Ld9:
            boolean r6 = r3.takePending()     // Catch: java.lang.Throwable -> Lf4
            if (r6 != 0) goto La3
            r0.L$0 = r5     // Catch: java.lang.Throwable -> Lf4
            r0.L$1 = r11     // Catch: java.lang.Throwable -> Lf4
            r0.L$2 = r3     // Catch: java.lang.Throwable -> Lf4
            r0.L$3 = r2     // Catch: java.lang.Throwable -> Lf4
            r0.L$4 = r4     // Catch: java.lang.Throwable -> Lf4
            r6 = 3
            r0.label = r6     // Catch: java.lang.Throwable -> Lf4
            java.lang.Object r6 = r3.awaitPending(r0)     // Catch: java.lang.Throwable -> Lf4
            if (r6 != r1) goto Lf3
            return r1
        Lf3:
            goto La3
        Lf4:
            r11 = move-exception
            r1 = r3
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r1 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot) r1
            r5.freeSlot(r1)
            throw r11
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public boolean compareAndSet(T r3, T r4) {
            r2 = this;
            if (r3 != 0) goto L5
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            goto L6
        L5:
            r0 = r3
        L6:
            if (r4 != 0) goto Lb
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            goto Lc
        Lb:
            r1 = r4
        Lc:
            boolean r0 = r2.updateState(r0, r1)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected kotlinx.coroutines.flow.StateFlowSlot createSlot() {
            r1 = this;
            kotlinx.coroutines.flow.StateFlowSlot r0 = new kotlinx.coroutines.flow.StateFlowSlot
            r0.<init>()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot createSlot() {
            r1 = this;
            kotlinx.coroutines.flow.StateFlowSlot r0 = r1.createSlot()
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r0 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot) r0
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected kotlinx.coroutines.flow.StateFlowSlot[] createSlotArray(int r2) {
            r1 = this;
            kotlinx.coroutines.flow.StateFlowSlot[] r0 = new kotlinx.coroutines.flow.StateFlowSlot[r2]
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] createSlotArray(int r2) {
            r1 = this;
            kotlinx.coroutines.flow.StateFlowSlot[] r0 = r1.createSlotArray(r2)
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r0 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) r0
            return r0
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            r1.setValue(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public kotlinx.coroutines.flow.Flow<T> fuse(kotlin.coroutines.CoroutineContext r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.flow.StateFlow r0 = (kotlinx.coroutines.flow.StateFlow) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.StateFlowKt.fuseStateFlow(r0, r2, r3, r4)
            return r0
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public java.util.List<T> getReplayCache() {
            r1 = this;
            java.lang.Object r0 = r1.getValue()
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            return r0
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public T getValue() {
            r4 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = get_state$volatile$FU()
            java.lang.Object r1 = r1.get(r4)
            r2 = 0
            if (r1 != r0) goto Lf
            r3 = 0
            r1 = r3
        Lf:
            return r1
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "MutableStateFlow.resetReplayCache is not supported"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(T r3) {
            r2 = this;
            if (r3 != 0) goto L5
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            goto L6
        L5:
            r0 = r3
        L6:
            r1 = 0
            r2.updateState(r1, r0)
            return
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T r2) {
            r1 = this;
            r1.setValue(r2)
            r0 = 1
            return r0
    }
}
