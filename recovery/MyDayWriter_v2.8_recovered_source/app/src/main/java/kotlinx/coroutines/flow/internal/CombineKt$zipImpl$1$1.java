package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0, 0}, l = {123}, m = "invokeSuspend", n = {"second", "collectJob"}, s = {"L$0", "L$1"})
final class CombineKt$zipImpl$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T1> $flow;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T2> $flow2;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
    final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;


    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Combine.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.Object $cnt;
        final /* synthetic */ kotlinx.coroutines.CompletableJob $collectJob;
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T1> $flow;
        final /* synthetic */ kotlin.coroutines.CoroutineContext $scopeContext;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> $second;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
        final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Combine.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ java.lang.Object $cnt;
            final /* synthetic */ kotlinx.coroutines.CompletableJob $collectJob;
            final /* synthetic */ kotlin.coroutines.CoroutineContext $scopeContext;
            final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> $second;
            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
            final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Combine.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {126, 129, 129}, m = "invokeSuspend", n = {}, s = {})
            static final class C00051 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ kotlinx.coroutines.CompletableJob $collectJob;
                final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> $second;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
                final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
                final /* synthetic */ T1 $value;
                java.lang.Object L$0;
                int label;

                C00051(kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> r2, kotlinx.coroutines.flow.FlowCollector<? super R> r3, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4, T1 r5, kotlinx.coroutines.CompletableJob r6, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C00051> r7) {
                        r1 = this;
                        r1.$second = r2
                        r1.$this_unsafeFlow = r3
                        r1.$transform = r4
                        r1.$value = r5
                        r1.$collectJob = r6
                        r0 = 2
                        r1.<init>(r0, r7)
                        return
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r8, kotlin.coroutines.Continuation<?> r9) {
                        r7 = this;
                        kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                        kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r1 = r7.$second
                        kotlinx.coroutines.flow.FlowCollector<R> r2 = r7.$this_unsafeFlow
                        kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r3 = r7.$transform
                        T1 r4 = r7.$value
                        kotlinx.coroutines.CompletableJob r5 = r7.$collectJob
                        r6 = r9
                        r0.<init>(r1, r2, r3, r4, r5, r6)
                        kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                        return r0
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.Unit r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                        r1 = this;
                        kotlin.Unit r2 = (kotlin.Unit) r2
                        kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                        java.lang.Object r0 = r1.invoke2(r2, r3)
                        return r0
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final java.lang.Object invoke2(kotlin.Unit r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                        r2 = this;
                        kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                        kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C00051) r0
                        kotlin.Unit r1 = kotlin.Unit.INSTANCE
                        java.lang.Object r0 = r0.invokeSuspend(r1)
                        return r0
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                        r10 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r10.label
                        r2 = 0
                        switch(r1) {
                            case 0: goto L30;
                            case 1: goto L24;
                            case 2: goto L18;
                            case 3: goto L12;
                            default: goto La;
                        }
                    La:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r0)
                        throw r11
                    L12:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r11)
                        goto L8a
                    L18:
                        r1 = r10
                        java.lang.Object r3 = r1.L$0
                        kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                        kotlin.ResultKt.throwOnFailure(r11)
                        r4 = r3
                        r3 = r1
                        r1 = r11
                        goto L79
                    L24:
                        r1 = r10
                        kotlin.ResultKt.throwOnFailure(r11)
                        r3 = r11
                        kotlinx.coroutines.channels.ChannelResult r3 = (kotlinx.coroutines.channels.ChannelResult) r3
                        java.lang.Object r3 = r3.m1679unboximpl()
                        goto L43
                    L30:
                        kotlin.ResultKt.throwOnFailure(r11)
                        r1 = r10
                        kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r3 = r1.$second
                        r4 = r1
                        kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                        r5 = 1
                        r1.label = r5
                        java.lang.Object r3 = r3.mo1660receiveCatchingJP2dKIU(r4)
                        if (r3 != r0) goto L43
                        return r0
                    L43:
                        kotlinx.coroutines.CompletableJob r4 = r1.$collectJob
                        r5 = 0
                        boolean r6 = r3 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
                        if (r6 == 0) goto L5a
                        java.lang.Throwable r0 = kotlinx.coroutines.channels.ChannelResult.m1671exceptionOrNullimpl(r3)
                        r2 = 0
                        if (r0 != 0) goto L59
                        kotlinx.coroutines.flow.internal.AbortFlowException r0 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        r0.<init>(r4)
                        java.lang.Throwable r0 = (java.lang.Throwable) r0
                    L59:
                        throw r0
                    L5a:
                        kotlinx.coroutines.flow.FlowCollector<R> r4 = r1.$this_unsafeFlow
                        kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r5 = r1.$transform
                        T1 r6 = r1.$value
                        kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
                        r8 = 0
                        if (r3 != r7) goto L69
                        r3 = r2
                    L69:
                        r1.L$0 = r4
                        r7 = 2
                        r1.label = r7
                        java.lang.Object r3 = r5.invoke(r6, r3, r1)
                        if (r3 != r0) goto L75
                        return r0
                    L75:
                        r9 = r1
                        r1 = r11
                        r11 = r3
                        r3 = r9
                    L79:
                        r5 = r3
                        kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                        r3.L$0 = r2
                        r2 = 3
                        r3.label = r2
                        java.lang.Object r11 = r4.emit(r11, r5)
                        if (r11 != r0) goto L88
                        return r0
                    L88:
                        r11 = r1
                        r0 = r3
                    L8a:
                        kotlin.Unit r1 = kotlin.Unit.INSTANCE
                        return r1
                }
            }

            AnonymousClass1(kotlin.coroutines.CoroutineContext r1, java.lang.Object r2, kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> r3, kotlinx.coroutines.flow.FlowCollector<? super R> r4, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5, kotlinx.coroutines.CompletableJob r6) {
                    r0 = this;
                    r0.$scopeContext = r1
                    r0.$cnt = r2
                    r0.$second = r3
                    r0.$this_unsafeFlow = r4
                    r0.$transform = r5
                    r0.$collectJob = r6
                    r0.<init>()
                    return
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final java.lang.Object emit(T1 r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
                    r12 = this;
                    boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    if (r0 == 0) goto L14
                    r0 = r14
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L14
                    int r14 = r0.label
                    int r14 = r14 - r2
                    r0.label = r14
                    goto L19
                L14:
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    r0.<init>(r12, r14)
                L19:
                    java.lang.Object r14 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    switch(r2) {
                        case 0: goto L30;
                        case 1: goto L2c;
                        default: goto L24;
                    }
                L24:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L2c:
                    kotlin.ResultKt.throwOnFailure(r14)
                    goto L55
                L30:
                    kotlin.ResultKt.throwOnFailure(r14)
                    r2 = r12
                    r7 = r13
                    kotlin.coroutines.CoroutineContext r13 = r2.$scopeContext
                    kotlin.Unit r10 = kotlin.Unit.INSTANCE
                    java.lang.Object r11 = r2.$cnt
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r3 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                    kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r4 = r2.$second
                    kotlinx.coroutines.flow.FlowCollector<R> r5 = r2.$this_unsafeFlow
                    kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r6 = r2.$transform
                    kotlinx.coroutines.CompletableJob r8 = r2.$collectJob
                    r9 = 0
                    r3.<init>(r4, r5, r6, r7, r8, r9)
                    kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
                    r4 = 1
                    r0.label = r4
                    java.lang.Object r13 = kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched(r13, r10, r11, r3, r0)
                    if (r13 != r1) goto L55
                    return r1
                L55:
                    kotlin.Unit r13 = kotlin.Unit.INSTANCE
                    return r13
            }
        }

        AnonymousClass2(kotlinx.coroutines.flow.Flow<? extends T1> r2, kotlin.coroutines.CoroutineContext r3, java.lang.Object r4, kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> r5, kotlinx.coroutines.flow.FlowCollector<? super R> r6, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r7, kotlinx.coroutines.CompletableJob r8, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2> r9) {
                r1 = this;
                r1.$flow = r2
                r1.$scopeContext = r3
                r1.$cnt = r4
                r1.$second = r5
                r1.$this_unsafeFlow = r6
                r1.$transform = r7
                r1.$collectJob = r8
                r0 = 2
                r1.<init>(r0, r9)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r10, kotlin.coroutines.Continuation<?> r11) {
                r9 = this;
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2
                kotlinx.coroutines.flow.Flow<T1> r1 = r9.$flow
                kotlin.coroutines.CoroutineContext r2 = r9.$scopeContext
                java.lang.Object r3 = r9.$cnt
                kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r4 = r9.$second
                kotlinx.coroutines.flow.FlowCollector<R> r5 = r9.$this_unsafeFlow
                kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r6 = r9.$transform
                kotlinx.coroutines.CompletableJob r7 = r9.$collectJob
                r8 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.Unit r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlin.Unit r2 = (kotlin.Unit) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.Unit r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                switch(r1) {
                    case 0: goto L16;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L11:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r11)
                goto L3d
            L16:
                kotlin.ResultKt.throwOnFailure(r11)
                r1 = r10
                kotlinx.coroutines.flow.Flow<T1> r2 = r1.$flow
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1 r3 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1
                kotlin.coroutines.CoroutineContext r4 = r1.$scopeContext
                java.lang.Object r5 = r1.$cnt
                kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r6 = r1.$second
                kotlinx.coroutines.flow.FlowCollector<R> r7 = r1.$this_unsafeFlow
                kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r8 = r1.$transform
                kotlinx.coroutines.CompletableJob r9 = r1.$collectJob
                r3.<init>(r4, r5, r6, r7, r8, r9)
                kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                r4 = r1
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r5 = 1
                r1.label = r5
                java.lang.Object r2 = r2.collect(r3, r4)
                if (r2 != r0) goto L3c
                return r0
            L3c:
                r0 = r1
            L3d:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    CombineKt$zipImpl$1$1(kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlinx.coroutines.flow.Flow<? extends T1> r3, kotlinx.coroutines.flow.FlowCollector<? super R> r4, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1> r6) {
            r1 = this;
            r1.$flow2 = r2
            r1.$flow = r3
            r1.$this_unsafeFlow = r4
            r1.$transform = r5
            r0 = 2
            r1.<init>(r0, r6)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r7, kotlin.coroutines.Continuation<?> r8) {
            r6 = this;
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1
            kotlinx.coroutines.flow.Flow<T2> r1 = r6.$flow2
            kotlinx.coroutines.flow.Flow<T1> r2 = r6.$flow
            kotlinx.coroutines.flow.FlowCollector<R> r3 = r6.$this_unsafeFlow
            kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r6.$transform
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
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            r25 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r1 = r25
            int r2 = r1.label
            r3 = 1
            r4 = 0
            switch(r2) {
                case 0: goto L2e;
                case 1: goto L15;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L15:
            r2 = r25
            r5 = r26
            java.lang.Object r0 = r2.L$1
            r6 = r0
            kotlinx.coroutines.CompletableJob r6 = (kotlinx.coroutines.CompletableJob) r6
            java.lang.Object r0 = r2.L$0
            r7 = r0
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L28 kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto Lb1
        L28:
            r0 = move-exception
            goto Lda
        L2b:
            r0 = move-exception
            goto Ld3
        L2e:
            kotlin.ResultKt.throwOnFailure(r26)
            r2 = r25
            r5 = r26
            java.lang.Object r6 = r2.L$0
            r7 = r6
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1 r6 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1
            kotlinx.coroutines.flow.Flow<T2> r8 = r2.$flow2
            r6.<init>(r8, r4)
            r10 = r6
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            kotlinx.coroutines.channels.ReceiveChannel r6 = kotlinx.coroutines.channels.ProduceKt.produce$default(r7, r8, r9, r10, r11, r12)
            kotlinx.coroutines.CompletableJob r8 = kotlinx.coroutines.JobKt.Job$default(r4, r3, r4)
            java.lang.String r9 = "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r9)
            r9 = r6
            kotlinx.coroutines.channels.SendChannel r9 = (kotlinx.coroutines.channels.SendChannel) r9
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1 r10 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1
            r10.<init>(r8)
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r9.invokeOnClose(r10)
            kotlin.coroutines.CoroutineContext r15 = r7.getCoroutineContext()     // Catch: java.lang.Throwable -> Lc8 kotlinx.coroutines.flow.internal.AbortFlowException -> Lcc
            java.lang.Object r16 = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(r15)     // Catch: java.lang.Throwable -> Lc8 kotlinx.coroutines.flow.internal.AbortFlowException -> Lcc
            kotlin.coroutines.CoroutineContext r9 = r7.getCoroutineContext()     // Catch: java.lang.Throwable -> Lc8 kotlinx.coroutines.flow.internal.AbortFlowException -> Lcc
            r10 = r8
            kotlin.coroutines.CoroutineContext r10 = (kotlin.coroutines.CoroutineContext) r10     // Catch: java.lang.Throwable -> Lc8 kotlinx.coroutines.flow.internal.AbortFlowException -> Lcc
            kotlin.coroutines.CoroutineContext r9 = r9.plus(r10)     // Catch: java.lang.Throwable -> Lc8 kotlinx.coroutines.flow.internal.AbortFlowException -> Lcc
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lc8 kotlinx.coroutines.flow.internal.AbortFlowException -> Lcc
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r13 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2     // Catch: java.lang.Throwable -> Lc8 kotlinx.coroutines.flow.internal.AbortFlowException -> Lcc
            kotlinx.coroutines.flow.Flow<T1> r14 = r2.$flow     // Catch: java.lang.Throwable -> Lc8 kotlinx.coroutines.flow.internal.AbortFlowException -> Lcc
            kotlinx.coroutines.flow.FlowCollector<R> r11 = r2.$this_unsafeFlow     // Catch: java.lang.Throwable -> Lc8 kotlinx.coroutines.flow.internal.AbortFlowException -> Lcc
            kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r12 = r2.$transform     // Catch: java.lang.Throwable -> Lc8 kotlinx.coroutines.flow.internal.AbortFlowException -> Lcc
            r21 = 0
            r17 = r6
            r20 = r8
            r18 = r11
            r19 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> Lbc kotlinx.coroutines.flow.internal.AbortFlowException -> Lc1
            r8 = r17
            r6 = r20
            r20 = r13
            kotlin.jvm.functions.Function2 r20 = (kotlin.jvm.functions.Function2) r20     // Catch: java.lang.Throwable -> Lb6 kotlinx.coroutines.flow.internal.AbortFlowException -> Lb9
            r21 = r2
            kotlin.coroutines.Continuation r21 = (kotlin.coroutines.Continuation) r21     // Catch: java.lang.Throwable -> Lb6 kotlinx.coroutines.flow.internal.AbortFlowException -> Lb9
            r2.L$0 = r8     // Catch: java.lang.Throwable -> Lb6 kotlinx.coroutines.flow.internal.AbortFlowException -> Lb9
            r2.L$1 = r6     // Catch: java.lang.Throwable -> Lb6 kotlinx.coroutines.flow.internal.AbortFlowException -> Lb9
            r2.label = r3     // Catch: java.lang.Throwable -> Lb6 kotlinx.coroutines.flow.internal.AbortFlowException -> Lb9
            r19 = 0
            r22 = 4
            r23 = 0
            r17 = r9
            r18 = r10
            java.lang.Object r9 = kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched$default(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> Lb6 kotlinx.coroutines.flow.internal.AbortFlowException -> Lb9
            if (r9 != r0) goto Lb0
            return r0
        Lb0:
            r7 = r8
        Lb1:
        Lb2:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r7, r4, r3, r4)
            goto Ld7
        Lb6:
            r0 = move-exception
            r7 = r8
            goto Lda
        Lb9:
            r0 = move-exception
            r7 = r8
            goto Ld3
        Lbc:
            r0 = move-exception
            r8 = r17
            r7 = r8
            goto Lda
        Lc1:
            r0 = move-exception
            r8 = r17
            r6 = r20
            r7 = r8
            goto Ld3
        Lc8:
            r0 = move-exception
            r8 = r6
            r7 = r8
            goto Lda
        Lcc:
            r0 = move-exception
            r24 = r8
            r8 = r6
            r6 = r24
            r7 = r8
        Ld3:
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r0, r6)     // Catch: java.lang.Throwable -> L28
            goto Lb2
        Ld7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lda:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r7, r4, r3, r4)
            throw r0
    }
}
