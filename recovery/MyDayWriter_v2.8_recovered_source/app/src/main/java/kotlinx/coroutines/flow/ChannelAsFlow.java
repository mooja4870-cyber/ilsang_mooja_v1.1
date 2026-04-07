package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B9\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u001c\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096@¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0094@¢\u0006\u0002\u0010\u001aJ&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0018\u001a\u00020 H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\t\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¨\u0006!"}, d2 = {"Lkotlinx/coroutines/flow/ChannelAsFlow;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "channel", "Lkotlinx/coroutines/channels/ReceiveChannel;", "consume", "", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "consumed", "Lkotlinx/atomicfu/AtomicBoolean;", "additionalToStringProps", "", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectTo", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "dropChannelOperators", "Lkotlinx/coroutines/flow/Flow;", "markConsumed", "produceImpl", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ChannelAsFlow<T> extends kotlinx.coroutines.flow.internal.ChannelFlow<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater consumed$volatile$FU = null;
    private final kotlinx.coroutines.channels.ReceiveChannel<T> channel;
    private final boolean consume;
    private volatile /* synthetic */ int consumed$volatile;

    static {
            java.lang.Class<kotlinx.coroutines.flow.ChannelAsFlow> r0 = kotlinx.coroutines.flow.ChannelAsFlow.class
            java.lang.String r1 = "consumed$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.flow.ChannelAsFlow.consumed$volatile$FU = r0
            return
    }

    public ChannelAsFlow(kotlinx.coroutines.channels.ReceiveChannel<? extends T> r2, boolean r3, kotlin.coroutines.CoroutineContext r4, int r5, kotlinx.coroutines.channels.BufferOverflow r6) {
            r1 = this;
            r1.<init>(r4, r5, r6)
            r1.channel = r2
            r1.consume = r3
            r0 = 0
            r1.consumed$volatile = r0
            return
    }

    public /* synthetic */ ChannelAsFlow(kotlinx.coroutines.channels.ReceiveChannel r7, boolean r8, kotlin.coroutines.CoroutineContext r9, int r10, kotlinx.coroutines.channels.BufferOverflow r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto La
            kotlin.coroutines.EmptyCoroutineContext r9 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9
            r3 = r9
            goto Lb
        La:
            r3 = r9
        Lb:
            r9 = r12 & 8
            if (r9 == 0) goto L12
            r10 = -3
            r4 = r10
            goto L13
        L12:
            r4 = r10
        L13:
            r9 = r12 & 16
            if (r9 == 0) goto L1b
            kotlinx.coroutines.channels.BufferOverflow r11 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r5 = r11
            goto L1c
        L1b:
            r5 = r11
        L1c:
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private final /* synthetic */ int getConsumed$volatile() {
            r1 = this;
            int r0 = r1.consumed$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getConsumed$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.flow.ChannelAsFlow.consumed$volatile$FU
            return r0
    }

    private final void markConsumed() {
            r2 = this;
            boolean r0 = r2.consume
            if (r0 == 0) goto L22
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getConsumed$volatile$FU()
            r1 = 1
            int r0 = r0.getAndSet(r2, r1)
            if (r0 != 0) goto L10
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto L14
            goto L22
        L14:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ReceiveChannel.consumeAsFlow can be collected just once"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L22:
            return
    }

    private final /* synthetic */ void setConsumed$volatile(int r1) {
            r0 = this;
            r0.consumed$volatile = r1
            return
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected java.lang.String additionalToStringProps() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel="
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlinx.coroutines.channels.ReceiveChannel<T> r1 = r2.channel
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            int r0 = r2.capacity
            r1 = -3
            if (r0 != r1) goto L1a
            r2.markConsumed()
            kotlinx.coroutines.channels.ReceiveChannel<T> r0 = r2.channel
            boolean r1 = r2.consume
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.access$emitAllImpl$FlowKt__ChannelsKt(r3, r0, r1, r4)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L17
            return r0
        L17:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L19:
            return r0
        L1a:
            java.lang.Object r0 = super.collect(r3, r4)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L25
            return r0
        L25:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L19
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected java.lang.Object collectTo(kotlinx.coroutines.channels.ProducerScope<? super T> r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r3 = this;
            kotlinx.coroutines.flow.internal.SendingCollector r0 = new kotlinx.coroutines.flow.internal.SendingCollector
            r1 = r4
            kotlinx.coroutines.channels.SendChannel r1 = (kotlinx.coroutines.channels.SendChannel) r1
            r0.<init>(r1)
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            kotlinx.coroutines.channels.ReceiveChannel<T> r1 = r3.channel
            boolean r2 = r3.consume
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.access$emitAllImpl$FlowKt__ChannelsKt(r0, r1, r2, r5)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L19
            return r0
        L19:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected kotlinx.coroutines.flow.internal.ChannelFlow<T> create(kotlin.coroutines.CoroutineContext r7, int r8, kotlinx.coroutines.channels.BufferOverflow r9) {
            r6 = this;
            kotlinx.coroutines.flow.ChannelAsFlow r0 = new kotlinx.coroutines.flow.ChannelAsFlow
            kotlinx.coroutines.channels.ReceiveChannel<T> r1 = r6.channel
            boolean r2 = r6.consume
            r3 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            kotlinx.coroutines.flow.internal.ChannelFlow r0 = (kotlinx.coroutines.flow.internal.ChannelFlow) r0
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public kotlinx.coroutines.flow.Flow<T> dropChannelOperators() {
            r8 = this;
            kotlinx.coroutines.flow.ChannelAsFlow r0 = new kotlinx.coroutines.flow.ChannelAsFlow
            kotlinx.coroutines.channels.ReceiveChannel<T> r1 = r8.channel
            boolean r2 = r8.consume
            r6 = 28
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public kotlinx.coroutines.channels.ReceiveChannel<T> produceImpl(kotlinx.coroutines.CoroutineScope r3) {
            r2 = this;
            r2.markConsumed()
            int r0 = r2.capacity
            r1 = -3
            if (r0 != r1) goto Lb
            kotlinx.coroutines.channels.ReceiveChannel<T> r0 = r2.channel
            goto Lf
        Lb:
            kotlinx.coroutines.channels.ReceiveChannel r0 = super.produceImpl(r3)
        Lf:
            return r0
    }
}
