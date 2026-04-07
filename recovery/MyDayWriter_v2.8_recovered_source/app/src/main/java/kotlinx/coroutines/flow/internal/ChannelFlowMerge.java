package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B?\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0014J\u001c\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0094@¢\u0006\u0002\u0010\u0013J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0011\u001a\u00020\u0017H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowMerge;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "flow", "Lkotlinx/coroutines/flow/Flow;", "concurrency", "", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlinx/coroutines/flow/Flow;ILkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "additionalToStringProps", "", "collectTo", "", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "produceImpl", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChannelFlowMerge<T> extends kotlinx.coroutines.flow.internal.ChannelFlow<T> {
    private final int concurrency;
    private final kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<T>> flow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2, reason: invalid class name */
    /* JADX INFO: compiled from: Merge.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "inner", "Lkotlinx/coroutines/flow/Flow;", "emit", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlinx.coroutines.flow.internal.SendingCollector<T> $collector;
        final /* synthetic */ kotlinx.coroutines.Job $job;
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<T> $scope;
        final /* synthetic */ kotlinx.coroutines.sync.Semaphore $semaphore;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Merge.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ kotlinx.coroutines.flow.internal.SendingCollector<T> $collector;
            final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $inner;
            final /* synthetic */ kotlinx.coroutines.sync.Semaphore $semaphore;
            int label;

            AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlinx.coroutines.flow.internal.SendingCollector<T> r3, kotlinx.coroutines.sync.Semaphore r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2.AnonymousClass1> r5) {
                    r1 = this;
                    r1.$inner = r2
                    r1.$collector = r3
                    r1.$semaphore = r4
                    r0 = 2
                    r1.<init>(r0, r5)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r5, kotlin.coroutines.Continuation<?> r6) {
                    r4 = this;
                    kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1
                    kotlinx.coroutines.flow.Flow<T> r1 = r4.$inner
                    kotlinx.coroutines.flow.internal.SendingCollector<T> r2 = r4.$collector
                    kotlinx.coroutines.sync.Semaphore r3 = r4.$semaphore
                    r0.<init>(r1, r2, r3, r6)
                    kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                    return r0
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                    r1 = this;
                    kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                    java.lang.Object r0 = r1.invoke2(r2, r3)
                    return r0
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                    r2 = this;
                    kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                    kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2.AnonymousClass1) r0
                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                    java.lang.Object r0 = r0.invokeSuspend(r1)
                    return r0
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r7.label
                    switch(r1) {
                        case 0: goto L18;
                        case 1: goto L11;
                        default: goto L9;
                    }
                L9:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L11:
                    r0 = r7
                    kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L16
                    goto L31
                L16:
                    r1 = move-exception
                    goto L3e
                L18:
                    kotlin.ResultKt.throwOnFailure(r8)
                    r1 = r7
                    kotlinx.coroutines.flow.Flow<T> r2 = r1.$inner     // Catch: java.lang.Throwable -> L3a
                    kotlinx.coroutines.flow.internal.SendingCollector<T> r3 = r1.$collector     // Catch: java.lang.Throwable -> L3a
                    kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3     // Catch: java.lang.Throwable -> L3a
                    r4 = r1
                    kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Throwable -> L3a
                    r5 = 1
                    r1.label = r5     // Catch: java.lang.Throwable -> L3a
                    java.lang.Object r2 = r2.collect(r3, r4)     // Catch: java.lang.Throwable -> L3a
                    if (r2 != r0) goto L30
                    return r0
                L30:
                    r0 = r1
                L31:
                    kotlinx.coroutines.sync.Semaphore r1 = r0.$semaphore
                    r1.release()
                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                    return r1
                L3a:
                    r0 = move-exception
                    r6 = r1
                    r1 = r0
                    r0 = r6
                L3e:
                    kotlinx.coroutines.sync.Semaphore r2 = r0.$semaphore
                    r2.release()
                    throw r1
            }
        }

        AnonymousClass2(kotlinx.coroutines.Job r1, kotlinx.coroutines.sync.Semaphore r2, kotlinx.coroutines.channels.ProducerScope<? super T> r3, kotlinx.coroutines.flow.internal.SendingCollector<T> r4) {
                r0 = this;
                r0.$job = r1
                r0.$semaphore = r2
                r0.$scope = r3
                r0.$collector = r4
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r2, kotlin.coroutines.Continuation r3) {
                r1 = this;
                r0 = r2
                kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
                java.lang.Object r0 = r1.emit(r0, r3)
                return r0
        }

        public final java.lang.Object emit(kotlinx.coroutines.flow.Flow<? extends T> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
                r9 = this;
                boolean r0 = r11 instanceof kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
                if (r0 == 0) goto L14
                r0 = r11
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r11 = r0.label
                int r11 = r11 - r2
                r0.label = r11
                goto L19
            L14:
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
                r0.<init>(r9, r11)
            L19:
                java.lang.Object r11 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                switch(r2) {
                    case 0: goto L38;
                    case 1: goto L2c;
                    default: goto L24;
                }
            L24:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L2c:
                java.lang.Object r10 = r0.L$1
                kotlinx.coroutines.flow.Flow r10 = (kotlinx.coroutines.flow.Flow) r10
                java.lang.Object r1 = r0.L$0
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2 r1 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2) r1
                kotlin.ResultKt.throwOnFailure(r11)
                goto L54
            L38:
                kotlin.ResultKt.throwOnFailure(r11)
                r2 = r9
                kotlinx.coroutines.Job r3 = r2.$job
                if (r3 == 0) goto L43
                kotlinx.coroutines.JobKt.ensureActive(r3)
            L43:
                kotlinx.coroutines.sync.Semaphore r3 = r2.$semaphore
                r0.L$0 = r2
                r0.L$1 = r10
                r4 = 1
                r0.label = r4
                java.lang.Object r3 = r3.acquire(r0)
                if (r3 != r1) goto L53
                return r1
            L53:
                r1 = r2
            L54:
                kotlinx.coroutines.channels.ProducerScope<T> r2 = r1.$scope
                r3 = r2
                kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 r2 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1
                kotlinx.coroutines.flow.internal.SendingCollector<T> r4 = r1.$collector
                kotlinx.coroutines.sync.Semaphore r5 = r1.$semaphore
                r6 = 0
                r2.<init>(r10, r4, r5, r6)
                r6 = r2
                kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
                r7 = 3
                r8 = 0
                r4 = 0
                r5 = 0
                kotlinx.coroutines.BuildersKt.launch$default(r3, r4, r5, r6, r7, r8)
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
        }
    }

    public ChannelFlowMerge(kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> r1, int r2, kotlin.coroutines.CoroutineContext r3, int r4, kotlinx.coroutines.channels.BufferOverflow r5) {
            r0 = this;
            r0.<init>(r3, r4, r5)
            r0.flow = r1
            r0.concurrency = r2
            return
    }

    public /* synthetic */ ChannelFlowMerge(kotlinx.coroutines.flow.Flow r7, int r8, kotlin.coroutines.CoroutineContext r9, int r10, kotlinx.coroutines.channels.BufferOverflow r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
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
            r10 = -2
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

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected java.lang.String additionalToStringProps() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "concurrency="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.concurrency
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected java.lang.Object collectTo(kotlinx.coroutines.channels.ProducerScope<? super T> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            r5 = this;
            int r0 = r5.concurrency
            r1 = 2
            r2 = 0
            r3 = 0
            kotlinx.coroutines.sync.Semaphore r0 = kotlinx.coroutines.sync.SemaphoreKt.Semaphore$default(r0, r3, r1, r2)
            kotlinx.coroutines.flow.internal.SendingCollector r1 = new kotlinx.coroutines.flow.internal.SendingCollector
            r2 = r6
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            r1.<init>(r2)
            kotlin.coroutines.CoroutineContext r2 = r7.getContext()
            kotlinx.coroutines.Job$Key r3 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r3 = (kotlin.coroutines.CoroutineContext.Key) r3
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r3)
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<T>> r3 = r5.flow
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2
            r4.<init>(r2, r0, r6, r1)
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            java.lang.Object r3 = r3.collect(r4, r7)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L33
            return r3
        L33:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected kotlinx.coroutines.flow.internal.ChannelFlow<T> create(kotlin.coroutines.CoroutineContext r7, int r8, kotlinx.coroutines.channels.BufferOverflow r9) {
            r6 = this;
            kotlinx.coroutines.flow.internal.ChannelFlowMerge r0 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge
            kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<T>> r1 = r6.flow
            int r2 = r6.concurrency
            r3 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
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
