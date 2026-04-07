package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/flow/StartedLazily;", "Lkotlinx/coroutines/flow/SharingStarted;", "()V", "command", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharingCommand;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class StartedLazily implements kotlinx.coroutines.flow.SharingStarted {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedLazily$command$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.StateFlow<java.lang.Integer> $subscriptionCount;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: SharingStarted.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "count", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        static final class C00031<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<kotlinx.coroutines.flow.SharingCommand> $$this$flow;
            final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef $started;

            C00031(kotlin.jvm.internal.Ref.BooleanRef r1, kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand> r2) {
                    r0 = this;
                    r0.$started = r1
                    r0.$$this$flow = r2
                    r0.<init>()
                    return
            }

            public final java.lang.Object emit(int r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                    if (r0 == 0) goto L14
                    r0 = r7
                    kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = (kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L14
                    int r7 = r0.label
                    int r7 = r7 - r2
                    r0.label = r7
                    goto L19
                L14:
                    kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = new kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                    r0.<init>(r5, r7)
                L19:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    switch(r2) {
                        case 0: goto L30;
                        case 1: goto L2c;
                        default: goto L24;
                    }
                L24:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L2c:
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L4e
                L30:
                    kotlin.ResultKt.throwOnFailure(r7)
                    r2 = r5
                    if (r6 <= 0) goto L4e
                    kotlin.jvm.internal.Ref$BooleanRef r3 = r2.$started
                    boolean r3 = r3.element
                    if (r3 != 0) goto L4e
                    kotlin.jvm.internal.Ref$BooleanRef r6 = r2.$started
                    r3 = 1
                    r6.element = r3
                    kotlinx.coroutines.flow.FlowCollector<kotlinx.coroutines.flow.SharingCommand> r6 = r2.$$this$flow
                    kotlinx.coroutines.flow.SharingCommand r4 = kotlinx.coroutines.flow.SharingCommand.START
                    r0.label = r3
                    java.lang.Object r6 = r6.emit(r4, r0)
                    if (r6 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r2, kotlin.coroutines.Continuation r3) {
                    r1 = this;
                    r0 = r2
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r0 = r0.intValue()
                    java.lang.Object r0 = r1.emit(r0, r3)
                    return r0
            }
        }

        AnonymousClass1(kotlinx.coroutines.flow.StateFlow<java.lang.Integer> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StartedLazily.AnonymousClass1> r3) {
                r1 = this;
                r1.$subscriptionCount = r2
                r0 = 2
                r1.<init>(r0, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.flow.StartedLazily$command$1 r0 = new kotlinx.coroutines.flow.StartedLazily$command$1
                kotlinx.coroutines.flow.StateFlow<java.lang.Integer> r1 = r2.$subscriptionCount
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.flow.StartedLazily$command$1 r0 = (kotlinx.coroutines.flow.StartedLazily.AnonymousClass1) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                switch(r1) {
                    case 0: goto L16;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L11:
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r9)
                goto L3a
            L16:
                kotlin.ResultKt.throwOnFailure(r9)
                r1 = r8
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.jvm.internal.Ref$BooleanRef r3 = new kotlin.jvm.internal.Ref$BooleanRef
                r3.<init>()
                kotlinx.coroutines.flow.StateFlow<java.lang.Integer> r4 = r1.$subscriptionCount
                kotlinx.coroutines.flow.StartedLazily$command$1$1 r5 = new kotlinx.coroutines.flow.StartedLazily$command$1$1
                r5.<init>(r3, r2)
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                r6 = r1
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r7 = 1
                r1.label = r7
                java.lang.Object r2 = r4.collect(r5, r6)
                if (r2 != r0) goto L39
                return r0
            L39:
                r0 = r1
            L3a:
                kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
                r1.<init>()
                throw r1
        }
    }

    public StartedLazily() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.SharingCommand> command(kotlinx.coroutines.flow.StateFlow<java.lang.Integer> r3) {
            r2 = this;
            kotlinx.coroutines.flow.StartedLazily$command$1 r0 = new kotlinx.coroutines.flow.StartedLazily$command$1
            r1 = 0
            r0.<init>(r3, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flow(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "SharingStarted.Lazily"
            return r0
    }
}
