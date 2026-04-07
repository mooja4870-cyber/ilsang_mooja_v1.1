package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B7\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0094@¢\u0006\u0002\u0010\u0011J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u000f\u001a\u00020\u0015H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "flows", "", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Ljava/lang/Iterable;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "collectTo", "", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "produceImpl", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChannelLimitedFlowMerge<T> extends kotlinx.coroutines.flow.internal.ChannelFlow<T> {
    private final java.lang.Iterable<kotlinx.coroutines.flow.Flow<T>> flows;

    public ChannelLimitedFlowMerge(java.lang.Iterable<? extends kotlinx.coroutines.flow.Flow<? extends T>> r1, kotlin.coroutines.CoroutineContext r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.flows = r1
            return
    }

    public /* synthetic */ ChannelLimitedFlowMerge(java.lang.Iterable r1, kotlin.coroutines.CoroutineContext r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
        L8:
            r6 = r5 & 4
            if (r6 == 0) goto Ld
            r3 = -2
        Ld:
            r5 = r5 & 8
            if (r5 == 0) goto L13
            kotlinx.coroutines.channels.BufferOverflow r4 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L13:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected java.lang.Object collectTo(kotlinx.coroutines.channels.ProducerScope<? super T> r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
            r13 = this;
            kotlinx.coroutines.flow.internal.SendingCollector r0 = new kotlinx.coroutines.flow.internal.SendingCollector
            r1 = r14
            kotlinx.coroutines.channels.SendChannel r1 = (kotlinx.coroutines.channels.SendChannel) r1
            r0.<init>(r1)
            java.lang.Iterable<kotlinx.coroutines.flow.Flow<T>> r1 = r13.flows
            r2 = 0
            java.util.Iterator r3 = r1.iterator()
        Lf:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r3.next()
            r5 = r4
            kotlinx.coroutines.flow.Flow r5 = (kotlinx.coroutines.flow.Flow) r5
            r6 = 0
            r7 = r14
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1 r8 = new kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1
            r9 = 0
            r8.<init>(r5, r0, r9)
            r10 = r8
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r11 = 3
            r12 = 0
            r8 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
            goto Lf
        L31:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected kotlinx.coroutines.flow.internal.ChannelFlow<T> create(kotlin.coroutines.CoroutineContext r3, int r4, kotlinx.coroutines.channels.BufferOverflow r5) {
            r2 = this;
            kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge r0 = new kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge
            java.lang.Iterable<kotlinx.coroutines.flow.Flow<T>> r1 = r2.flows
            r0.<init>(r1, r3, r4, r5)
            kotlinx.coroutines.flow.internal.ChannelFlow r0 = (kotlinx.coroutines.flow.internal.ChannelFlow) r0
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public kotlinx.coroutines.channels.ReceiveChannel<T> produceImpl(kotlinx.coroutines.CoroutineScope r4) {
            r3 = this;
            kotlin.coroutines.CoroutineContext r0 = r3.context
            int r1 = r3.capacity
            kotlin.jvm.functions.Function2 r2 = r3.getCollectToFun$kotlinx_coroutines_core()
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ProduceKt.produce(r4, r0, r1, r2)
            return r0
    }
}
