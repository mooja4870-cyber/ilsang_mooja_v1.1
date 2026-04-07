package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001ak\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0000¢\u0006\u0002\u0010\u000b\u001a\u008d\u0001\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u00010\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u0001H\u000e\u0018\u00010\u00110\u001329\u0010\u0007\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u0014H\u0081@¢\u0006\u0002\u0010\u0015*\u001c\b\u0002\u0010\u0016\"\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00172\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0017¨\u0006\u0018"}, d2 = {"zipImpl", "Lkotlinx/coroutines/flow/Flow;", "R", "T1", "T2", "flow", "flow2", "transform", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "combineInternal", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "flows", "", "arrayFactory", "Lkotlin/Function0;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/FlowCollector;[Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Update", "Lkotlin/collections/IndexedValue;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CombineKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2, reason: invalid class name */
    /* JADX INFO: compiled from: Combine.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {51, 73, 76}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function0<T[]> $arrayFactory;
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flows;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_combineInternal;
        final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $transform;
        int I$0;
        int I$1;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Combine.kt */
        @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flows;
            final /* synthetic */ int $i;
            final /* synthetic */ java.util.concurrent.atomic.AtomicInteger $nonClosed;
            final /* synthetic */ kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> $resultChannel;
            int label;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Combine.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "R", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            static final class C00041<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ int $i;
                final /* synthetic */ kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> $resultChannel;

                C00041(kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r1, int r2) {
                        r0 = this;
                        r0.$resultChannel = r1
                        r0.$i = r2
                        r0.<init>()
                        return
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                        if (r0 == 0) goto L14
                        r0 = r8
                        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r8 = r0.label
                        int r8 = r8 - r2
                        r0.label = r8
                        goto L19
                    L14:
                        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                        r0.<init>(r6, r8)
                    L19:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        switch(r2) {
                            case 0: goto L34;
                            case 1: goto L30;
                            case 2: goto L2c;
                            default: goto L24;
                        }
                    L24:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L2c:
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L55
                    L30:
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L4b
                    L34:
                        kotlin.ResultKt.throwOnFailure(r8)
                        r2 = r6
                        kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r3 = r2.$resultChannel
                        kotlin.collections.IndexedValue r4 = new kotlin.collections.IndexedValue
                        int r5 = r2.$i
                        r4.<init>(r5, r7)
                        r5 = 1
                        r0.label = r5
                        java.lang.Object r7 = r3.send(r4, r0)
                        if (r7 != r1) goto L4b
                        return r1
                    L4b:
                        r7 = 2
                        r0.label = r7
                        java.lang.Object r7 = kotlinx.coroutines.YieldKt.yield(r0)
                        if (r7 != r1) goto L55
                        return r1
                    L55:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                }
            }

            AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T>[] r2, int r3, java.util.concurrent.atomic.AtomicInteger r4, kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r5, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2.AnonymousClass1> r6) {
                    r1 = this;
                    r1.$flows = r2
                    r1.$i = r3
                    r1.$nonClosed = r4
                    r1.$resultChannel = r5
                    r0 = 2
                    r1.<init>(r0, r6)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r7, kotlin.coroutines.Continuation<?> r8) {
                    r6 = this;
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1
                    kotlinx.coroutines.flow.Flow<T>[] r1 = r6.$flows
                    int r2 = r6.$i
                    java.util.concurrent.atomic.AtomicInteger r3 = r6.$nonClosed
                    kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r4 = r6.$resultChannel
                    r5 = r8
                    r0.<init>(r1, r2, r3, r4, r5)
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
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2.AnonymousClass1) r0
                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                    java.lang.Object r0 = r0.invokeSuspend(r1)
                    return r0
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r9.label
                    r2 = 1
                    r3 = 0
                    switch(r1) {
                        case 0: goto L1a;
                        case 1: goto L13;
                        default: goto Lb;
                    }
                Lb:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L13:
                    r0 = r9
                    kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L18
                    goto L3d
                L18:
                    r1 = move-exception
                    goto L54
                L1a:
                    kotlin.ResultKt.throwOnFailure(r10)
                    r1 = r9
                    kotlinx.coroutines.flow.Flow<T>[] r4 = r1.$flows     // Catch: java.lang.Throwable -> L50
                    int r5 = r1.$i     // Catch: java.lang.Throwable -> L50
                    r4 = r4[r5]     // Catch: java.lang.Throwable -> L50
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1 r5 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1     // Catch: java.lang.Throwable -> L50
                    kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r6 = r1.$resultChannel     // Catch: java.lang.Throwable -> L50
                    int r7 = r1.$i     // Catch: java.lang.Throwable -> L50
                    r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L50
                    kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5     // Catch: java.lang.Throwable -> L50
                    r6 = r1
                    kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6     // Catch: java.lang.Throwable -> L50
                    r1.label = r2     // Catch: java.lang.Throwable -> L50
                    java.lang.Object r4 = r4.collect(r5, r6)     // Catch: java.lang.Throwable -> L50
                    if (r4 != r0) goto L3c
                    return r0
                L3c:
                    r0 = r1
                L3d:
                    java.util.concurrent.atomic.AtomicInteger r1 = r0.$nonClosed
                    int r1 = r1.decrementAndGet()
                    if (r1 != 0) goto L4c
                    kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r1 = r0.$resultChannel
                    kotlinx.coroutines.channels.SendChannel r1 = (kotlinx.coroutines.channels.SendChannel) r1
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r1, r3, r2, r3)
                L4c:
                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                    return r1
                L50:
                    r0 = move-exception
                    r8 = r1
                    r1 = r0
                    r0 = r8
                L54:
                    java.util.concurrent.atomic.AtomicInteger r4 = r0.$nonClosed
                    int r4 = r4.decrementAndGet()
                    if (r4 != 0) goto L63
                    kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r4 = r0.$resultChannel
                    kotlinx.coroutines.channels.SendChannel r4 = (kotlinx.coroutines.channels.SendChannel) r4
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r4, r3, r2, r3)
                L63:
                    throw r1
            }
        }

        AnonymousClass2(kotlinx.coroutines.flow.Flow<? extends T>[] r2, kotlin.jvm.functions.Function0<T[]> r3, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4, kotlinx.coroutines.flow.FlowCollector<? super R> r5, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2> r6) {
                r1 = this;
                r1.$flows = r2
                r1.$arrayFactory = r3
                r1.$transform = r4
                r1.$this_combineInternal = r5
                r0 = 2
                r1.<init>(r0, r6)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r7, kotlin.coroutines.Continuation<?> r8) {
                r6 = this;
                kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2
                kotlinx.coroutines.flow.Flow<T>[] r1 = r6.$flows
                kotlin.jvm.functions.Function0<T[]> r2 = r6.$arrayFactory
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r6.$transform
                kotlinx.coroutines.flow.FlowCollector<R> r4 = r6.$this_combineInternal
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                r0.L$0 = r7
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
                kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2 r0 = (kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
                r20 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r1 = r20
                int r2 = r1.label
                switch(r2) {
                    case 0: goto L74;
                    case 1: goto L4f;
                    case 2: goto L31;
                    case 3: goto L13;
                    default: goto Lb;
                }
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L13:
                r2 = r20
                r3 = r21
                int r4 = r2.I$1
                int r5 = r2.I$0
                java.lang.Object r6 = r2.L$2
                byte[] r6 = (byte[]) r6
                java.lang.Object r7 = r2.L$1
                kotlinx.coroutines.channels.Channel r7 = (kotlinx.coroutines.channels.Channel) r7
                java.lang.Object r8 = r2.L$0
                java.lang.Object[] r8 = (java.lang.Object[]) r8
                kotlin.ResultKt.throwOnFailure(r3)
                r11 = r5
                r5 = r4
                r4 = r6
                r6 = r11
                r11 = r8
                goto L159
            L31:
                r2 = r20
                r3 = r21
                int r4 = r2.I$1
                int r5 = r2.I$0
                java.lang.Object r6 = r2.L$2
                byte[] r6 = (byte[]) r6
                java.lang.Object r7 = r2.L$1
                kotlinx.coroutines.channels.Channel r7 = (kotlinx.coroutines.channels.Channel) r7
                java.lang.Object r8 = r2.L$0
                java.lang.Object[] r8 = (java.lang.Object[]) r8
                kotlin.ResultKt.throwOnFailure(r3)
                r11 = r5
                r5 = r4
                r4 = r6
                r6 = r11
                r11 = r8
                goto L136
            L4f:
                r2 = r20
                r3 = r21
                int r4 = r2.I$1
                int r5 = r2.I$0
                java.lang.Object r6 = r2.L$2
                byte[] r6 = (byte[]) r6
                java.lang.Object r7 = r2.L$1
                kotlinx.coroutines.channels.Channel r7 = (kotlinx.coroutines.channels.Channel) r7
                java.lang.Object r8 = r2.L$0
                java.lang.Object[] r8 = (java.lang.Object[]) r8
                kotlin.ResultKt.throwOnFailure(r3)
                r9 = r3
                kotlinx.coroutines.channels.ChannelResult r9 = (kotlinx.coroutines.channels.ChannelResult) r9
                java.lang.Object r9 = r9.m1679unboximpl()
                r19 = r5
                r5 = r4
                r4 = r6
                r6 = r19
                goto Lde
            L74:
                kotlin.ResultKt.throwOnFailure(r21)
                r2 = r20
                r3 = r21
                java.lang.Object r4 = r2.L$0
                r5 = r4
                kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                kotlinx.coroutines.flow.Flow<T>[] r4 = r2.$flows
                int r4 = r4.length
                if (r4 != 0) goto L88
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L88:
                java.lang.Object[] r6 = new java.lang.Object[r4]
                kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.flow.internal.NullSurrogateKt.UNINITIALIZED
                r10 = 6
                r11 = 0
                r8 = 0
                r9 = 0
                kotlin.collections.ArraysKt.fill$default(r6, r7, r8, r9, r10, r11)
                r11 = r6
                r6 = 6
                r7 = 0
                kotlinx.coroutines.channels.Channel r16 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r4, r7, r7, r6, r7)
                java.util.concurrent.atomic.AtomicInteger r15 = new java.util.concurrent.atomic.AtomicInteger
                r15.<init>(r4)
                r18 = r4
                r6 = 0
                r14 = r6
            La3:
                if (r14 >= r4) goto Lbb
                kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 r12 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1
                kotlinx.coroutines.flow.Flow<T>[] r13 = r2.$flows
                r17 = 0
                r12.<init>(r13, r14, r15, r16, r17)
                r8 = r12
                kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
                int r14 = r14 + 1
                goto La3
            Lbb:
                byte[] r4 = new byte[r4]
                r5 = 0
                r7 = r16
                r6 = r18
            Lc2:
                int r8 = r5 + 1
                byte r5 = (byte) r8
                r8 = r2
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                r2.L$0 = r11
                r2.L$1 = r7
                r2.L$2 = r4
                r2.I$0 = r6
                r2.I$1 = r5
                r9 = 1
                r2.label = r9
                java.lang.Object r9 = r7.mo1660receiveCatchingJP2dKIU(r8)
                if (r9 != r0) goto Ldd
                return r0
            Ldd:
                r8 = r11
            Lde:
                java.lang.Object r9 = kotlinx.coroutines.channels.ChannelResult.m1672getOrNullimpl(r9)
                kotlin.collections.IndexedValue r9 = (kotlin.collections.IndexedValue) r9
                if (r9 != 0) goto Le9
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            Le9:
                int r10 = r9.getIndex()
                r11 = r8[r10]
                java.lang.Object r12 = r9.getValue()
                r8[r10] = r12
                kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.flow.internal.NullSurrogateKt.UNINITIALIZED
                if (r11 != r9) goto Lfc
                int r6 = r6 + (-1)
            Lfc:
                r9 = r4[r10]
                if (r9 == r5) goto L111
                byte r9 = (byte) r5
                r4[r10] = r9
                java.lang.Object r9 = r7.mo1661tryReceivePtdJZtk()
                java.lang.Object r9 = kotlinx.coroutines.channels.ChannelResult.m1672getOrNullimpl(r9)
                kotlin.collections.IndexedValue r9 = (kotlin.collections.IndexedValue) r9
                if (r9 != 0) goto L110
                goto L111
            L110:
                goto Le9
            L111:
                if (r6 != 0) goto L15b
                kotlin.jvm.functions.Function0<T[]> r9 = r2.$arrayFactory
                java.lang.Object r9 = r9.invoke()
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                if (r9 != 0) goto L137
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r9 = r2.$transform
                kotlinx.coroutines.flow.FlowCollector<R> r10 = r2.$this_combineInternal
                r2.L$0 = r8
                r2.L$1 = r7
                r2.L$2 = r4
                r2.I$0 = r6
                r2.I$1 = r5
                r11 = 2
                r2.label = r11
                java.lang.Object r9 = r9.invoke(r10, r8, r2)
                if (r9 != r0) goto L135
                return r0
            L135:
                r11 = r8
            L136:
                goto Lc2
            L137:
                r13 = 14
                r14 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                kotlin.collections.ArraysKt.copyInto$default(r8, r9, r10, r11, r12, r13, r14)
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r10 = r2.$transform
                kotlinx.coroutines.flow.FlowCollector<R> r11 = r2.$this_combineInternal
                r2.L$0 = r8
                r2.L$1 = r7
                r2.L$2 = r4
                r2.I$0 = r6
                r2.I$1 = r5
                r12 = 3
                r2.label = r12
                java.lang.Object r9 = r10.invoke(r11, r9, r2)
                if (r9 != r0) goto L158
                return r0
            L158:
                r11 = r8
            L159:
                goto Lc2
            L15b:
                r11 = r8
                goto Lc2
        }
    }

    public static final <R, T> java.lang.Object combineInternal(kotlinx.coroutines.flow.FlowCollector<? super R> r6, kotlinx.coroutines.flow.Flow<? extends T>[] r7, kotlin.jvm.functions.Function0<T[]> r8, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2
            r5 = 0
            r4 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            java.lang.Object r6 = kotlinx.coroutines.flow.internal.FlowCoroutineKt.flowScope(r0, r10)
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r7) goto L17
            return r6
        L17:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> zipImpl(kotlinx.coroutines.flow.Flow<? extends T1> r2, kotlinx.coroutines.flow.Flow<? extends T2> r3, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            r0 = 0
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1
            r1.<init>(r3, r2, r4)
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            return r1
    }
}
