package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BR\u0012-\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0012\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0094@¢\u0006\u0002\u0010\u0014J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0016R7\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/flow/ChannelFlowBuilder;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlin/jvm/functions/Function2;", "collectTo", "scope", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
class ChannelFlowBuilder<T> extends kotlinx.coroutines.flow.internal.ChannelFlow<T> {
    private final kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> block;

    public ChannelFlowBuilder(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1, kotlin.coroutines.CoroutineContext r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.block = r1
            return
    }

    public /* synthetic */ ChannelFlowBuilder(kotlin.jvm.functions.Function2 r1, kotlin.coroutines.CoroutineContext r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
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

    static /* synthetic */ <T> java.lang.Object collectTo$suspendImpl(kotlinx.coroutines.flow.ChannelFlowBuilder<T> r2, kotlinx.coroutines.channels.ProducerScope<? super T> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r2.block
            java.lang.Object r0 = r0.invoke(r3, r4)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto Ld
            return r0
        Ld:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected java.lang.Object collectTo(kotlinx.coroutines.channels.ProducerScope<? super T> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            java.lang.Object r0 = collectTo$suspendImpl(r1, r2, r3)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected kotlinx.coroutines.flow.internal.ChannelFlow<T> create(kotlin.coroutines.CoroutineContext r3, int r4, kotlinx.coroutines.channels.BufferOverflow r5) {
            r2 = this;
            kotlinx.coroutines.flow.ChannelFlowBuilder r0 = new kotlinx.coroutines.flow.ChannelFlowBuilder
            kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r2.block
            r0.<init>(r1, r3, r4, r5)
            kotlinx.coroutines.flow.internal.ChannelFlow r0 = (kotlinx.coroutines.flow.internal.ChannelFlow) r0
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "block["
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r2.block
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "] -> "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = super.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
