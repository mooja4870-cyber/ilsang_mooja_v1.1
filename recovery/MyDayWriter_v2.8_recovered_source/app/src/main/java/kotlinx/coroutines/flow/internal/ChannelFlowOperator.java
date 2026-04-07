package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0094@¢\u0006\u0002\u0010\u0015J$\u0010\u0016\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H¤@¢\u0006\u0002\u0010\u0011J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0085\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "S", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "flow", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectTo", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectWithContextUndispatched", "newContext", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flowCollect", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ChannelFlowOperator<S, T> extends kotlinx.coroutines.flow.internal.ChannelFlow<T> {
    protected final kotlinx.coroutines.flow.Flow<S> flow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2, reason: invalid class name */
    /* JADX INFO: compiled from: ChannelFlow.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u008a@"}, d2 = {"<anonymous>", "", "S", "T", "it", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> this$0;

        AnonymousClass2(kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowOperator.AnonymousClass2> r3) {
                r1 = this;
                r1.this$0 = r2
                r0 = 2
                r1.<init>(r0, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2
                kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> r1 = r2.this$0
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super T> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowOperator.AnonymousClass2) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.label
                switch(r1) {
                    case 0: goto L16;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L11:
                r0 = r6
                kotlin.ResultKt.throwOnFailure(r7)
                goto L2e
            L16:
                kotlin.ResultKt.throwOnFailure(r7)
                r1 = r6
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> r3 = r1.this$0
                r4 = r1
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r5 = 1
                r1.label = r5
                java.lang.Object r2 = r3.flowCollect(r2, r4)
                if (r2 != r0) goto L2d
                return r0
            L2d:
                r0 = r1
            L2e:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    public ChannelFlowOperator(kotlinx.coroutines.flow.Flow<? extends S> r1, kotlin.coroutines.CoroutineContext r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.flow = r1
            return
    }

    public static final /* synthetic */ java.lang.Object access$collectWithContextUndispatched(kotlinx.coroutines.flow.internal.ChannelFlowOperator r1, kotlinx.coroutines.flow.FlowCollector r2, kotlin.coroutines.CoroutineContext r3, kotlin.coroutines.Continuation r4) {
            java.lang.Object r0 = r1.collectWithContextUndispatched(r2, r3, r4)
            return r0
    }

    static /* synthetic */ <S, T> java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> r4, kotlinx.coroutines.flow.FlowCollector<? super T> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            int r0 = r4.capacity
            r1 = -3
            if (r0 != r1) goto L47
            kotlin.coroutines.CoroutineContext r0 = r6.getContext()
            kotlin.coroutines.CoroutineContext r1 = r4.context
            kotlin.coroutines.CoroutineContext r1 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r0, r1)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r2 == 0) goto L23
            java.lang.Object r2 = r4.flowCollect(r5, r6)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L20
            return r2
        L20:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L23:
            kotlin.coroutines.ContinuationInterceptor$Key r2 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Key r2 = (kotlin.coroutines.CoroutineContext.Key) r2
            kotlin.coroutines.CoroutineContext$Element r2 = r1.get(r2)
            kotlin.coroutines.ContinuationInterceptor$Key r3 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Key r3 = (kotlin.coroutines.CoroutineContext.Key) r3
            kotlin.coroutines.CoroutineContext$Element r3 = r0.get(r3)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L47
            java.lang.Object r2 = r4.collectWithContextUndispatched(r5, r1, r6)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L44
            return r2
        L44:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L47:
            java.lang.Object r0 = super.collect(r5, r6)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L52
            return r0
        L52:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    static /* synthetic */ <S, T> java.lang.Object collectTo$suspendImpl(kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> r2, kotlinx.coroutines.channels.ProducerScope<? super T> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            kotlinx.coroutines.flow.internal.SendingCollector r0 = new kotlinx.coroutines.flow.internal.SendingCollector
            r1 = r3
            kotlinx.coroutines.channels.SendChannel r1 = (kotlinx.coroutines.channels.SendChannel) r1
            r0.<init>(r1)
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            java.lang.Object r0 = r2.flowCollect(r0, r4)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L15
            return r0
        L15:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private final java.lang.Object collectWithContextUndispatched(kotlinx.coroutines.flow.FlowCollector<? super T> r9, kotlin.coroutines.CoroutineContext r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            r8 = this;
            kotlin.coroutines.CoroutineContext r0 = r11.getContext()
            kotlinx.coroutines.flow.FlowCollector r2 = kotlinx.coroutines.flow.internal.ChannelFlowKt.access$withUndispatchedContextCollector(r9, r0)
            kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2
            r1 = 0
            r0.<init>(r8, r1)
            r4 = r0
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r6 = 4
            r7 = 0
            r3 = 0
            r1 = r10
            r5 = r11
            java.lang.Object r10 = kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched$default(r1, r2, r3, r4, r5, r6, r7)
            return r10
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            java.lang.Object r0 = collect$suspendImpl(r1, r2, r3)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected java.lang.Object collectTo(kotlinx.coroutines.channels.ProducerScope<? super T> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            java.lang.Object r0 = collectTo$suspendImpl(r1, r2, r3)
            return r0
    }

    protected abstract java.lang.Object flowCollect(kotlinx.coroutines.flow.FlowCollector<? super T> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlinx.coroutines.flow.Flow<S> r1 = r2.flow
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " -> "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = super.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
