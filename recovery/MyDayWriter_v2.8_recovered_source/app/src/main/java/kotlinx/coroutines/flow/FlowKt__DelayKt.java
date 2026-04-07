package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0002\b\b\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0007\u001a0\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0002\b\r\u001a\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0000\u001a&\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0005H\u0007\u001a0\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\n\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\n\u001a0\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"debounce", "Lkotlinx/coroutines/flow/Flow;", "T", "timeoutMillis", "Lkotlin/Function1;", "", "timeout", "Lkotlin/time/Duration;", "debounceDuration", "debounce-HG0u8IE", "(Lkotlinx/coroutines/flow/Flow;J)Lkotlinx/coroutines/flow/Flow;", "debounceInternal", "timeoutMillisSelector", "debounceInternal$FlowKt__DelayKt", "fixedPeriodTicker", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "Lkotlinx/coroutines/CoroutineScope;", "delayMillis", "sample", "periodMillis", "period", "sample-HG0u8IE", "timeout-HG0u8IE", "timeoutInternal", "timeoutInternal-HG0u8IE$FlowKt__DelayKt", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__DelayKt {



    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1, reason: invalid class name */
    /* JADX INFO: compiled from: Delay.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", i = {0, 1, 2}, l = {307, 309, 310}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ long $delayMillis;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        AnonymousClass1(long r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt.AnonymousClass1> r4) {
                r1 = this;
                r1.$delayMillis = r2
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1
                long r1 = r3.$delayMillis
                r0.<init>(r1, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1 r0 = (kotlinx.coroutines.flow.FlowKt__DelayKt.AnonymousClass1) r0
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
                    case 0: goto L2c;
                    case 1: goto L23;
                    case 2: goto L1a;
                    case 3: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L11:
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r8)
                goto L6c
            L1a:
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r8)
                goto L5b
            L23:
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r8)
                goto L45
            L2c:
                kotlin.ResultKt.throwOnFailure(r8)
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                long r3 = r1.$delayMillis
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r2
                r6 = 1
                r1.label = r6
                java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r3 != r0) goto L45
                return r0
            L45:
            L46:
                kotlinx.coroutines.channels.SendChannel r3 = r2.getChannel()
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r2
                r6 = 2
                r1.label = r6
                java.lang.Object r3 = r3.send(r4, r5)
                if (r3 != r0) goto L5b
                return r0
            L5b:
                long r3 = r1.$delayMillis
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r2
                r6 = 3
                r1.label = r6
                java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r3 != r0) goto L6c
                return r0
            L6c:
                goto L46
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Delay.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {415}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class C01122<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ long $periodMillis;
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_sample;
        private /* synthetic */ java.lang.Object L$0;
        /* synthetic */ java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;

        C01122(long r2, kotlinx.coroutines.flow.Flow<? extends T> r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt.C01122> r5) {
                r1 = this;
                r1.$periodMillis = r2
                r1.$this_sample = r4
                r0 = 3
                r1.<init>(r0, r5)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r2, java.lang.Object r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r1 = this;
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                java.lang.Object r0 = r1.invoke(r2, r3, r4)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r5, kotlinx.coroutines.flow.FlowCollector<? super T> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                r4 = this;
                kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2
                long r1 = r4.$periodMillis
                kotlinx.coroutines.flow.Flow<T> r3 = r4.$this_sample
                r0.<init>(r1, r3, r7)
                r0.L$0 = r5
                r0.L$1 = r6
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r14.label
                r2 = 0
                switch(r1) {
                    case 0: goto L2a;
                    case 1: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L12:
                r1 = r14
                r3 = 0
                r4 = 0
                java.lang.Object r5 = r1.L$3
                kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
                java.lang.Object r6 = r1.L$2
                kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref.ObjectRef) r6
                java.lang.Object r7 = r1.L$1
                kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
                java.lang.Object r8 = r1.L$0
                kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
                kotlin.ResultKt.throwOnFailure(r15)
                goto L9f
            L2a:
                kotlin.ResultKt.throwOnFailure(r15)
                r1 = r14
                java.lang.Object r3 = r1.L$0
                r4 = r3
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                java.lang.Object r3 = r1.L$1
                kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1 r5 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1
                kotlinx.coroutines.flow.Flow<T> r6 = r1.$this_sample
                r5.<init>(r6, r2)
                r7 = r5
                kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
                r8 = 1
                r9 = 0
                r5 = 0
                r6 = -1
                kotlinx.coroutines.channels.ReceiveChannel r5 = kotlinx.coroutines.channels.ProduceKt.produce$default(r4, r5, r6, r7, r8, r9)
                kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
                r6.<init>()
                long r7 = r1.$periodMillis
                kotlinx.coroutines.channels.ReceiveChannel r7 = kotlinx.coroutines.flow.FlowKt.fixedPeriodTicker(r4, r7)
                r8 = r7
                r7 = r5
                r5 = r8
                r8 = r3
            L58:
                T r3 = r6.element
                kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE
                if (r3 == r4) goto La2
                r3 = 0
                kotlinx.coroutines.selects.SelectImplementation r4 = new kotlinx.coroutines.selects.SelectImplementation
                kotlin.coroutines.CoroutineContext r9 = r1.getContext()
                r4.<init>(r9)
                r9 = 0
                r10 = r4
                kotlinx.coroutines.selects.SelectBuilder r10 = (kotlinx.coroutines.selects.SelectBuilder) r10
                r11 = 0
                kotlinx.coroutines.selects.SelectClause1 r12 = r7.getOnReceiveCatching()
                kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1 r13 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1
                r13.<init>(r6, r5, r2)
                kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
                r10.invoke(r12, r13)
                kotlinx.coroutines.selects.SelectClause1 r12 = r5.getOnReceive()
                kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2 r13 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2
                r13.<init>(r6, r8, r2)
                kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
                r10.invoke(r12, r13)
                r1.L$0 = r8
                r1.L$1 = r7
                r1.L$2 = r6
                r1.L$3 = r5
                r10 = 1
                r1.label = r10
                java.lang.Object r4 = r4.doSelect(r1)
                if (r4 != r0) goto L9e
                return r0
            L9e:
                r4 = r9
            L9f:
                goto L58
            La2:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(kotlinx.coroutines.flow.Flow<? extends T> r3, long r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            if (r2 == 0) goto L1c
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L10
            return r3
        L10:
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2
            r0.<init>(r4)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlinx.coroutines.flow.Flow r0 = debounceInternal$FlowKt__DelayKt(r3, r0)
            return r0
        L1c:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Debounce timeout should not be negative"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function1<? super T, java.lang.Long> r2) {
            kotlinx.coroutines.flow.Flow r0 = debounceInternal$FlowKt__DelayKt(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m1689debounceHG0u8IE(kotlinx.coroutines.flow.Flow<? extends T> r2, long r3) {
            long r0 = kotlinx.coroutines.DelayKt.m1645toDelayMillisLRDsOJo(r3)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.debounce(r2, r0)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounceDuration(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function1<? super T, kotlin.time.Duration> r2) {
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$3 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$3
            r0.<init>(r2)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlinx.coroutines.flow.Flow r0 = debounceInternal$FlowKt__DelayKt(r1, r0)
            return r0
    }

    private static final <T> kotlinx.coroutines.flow.Flow<T> debounceInternal$FlowKt__DelayKt(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Long> r3) {
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1
            r1 = 0
            r0.<init>(r3, r2, r1)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.internal.FlowCoroutineKt.scopedFlow(r0)
            return r0
    }

    public static final kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> fixedPeriodTicker(kotlinx.coroutines.CoroutineScope r8, long r9) {
            kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1
            r1 = 0
            r0.<init>(r9, r1)
            r5 = r0
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r6 = 1
            r7 = 0
            r3 = 0
            r4 = 0
            r2 = r8
            kotlinx.coroutines.channels.ReceiveChannel r8 = kotlinx.coroutines.channels.ProduceKt.produce$default(r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> sample(kotlinx.coroutines.flow.Flow<? extends T> r2, long r3) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L18
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2
            r1 = 0
            r0.<init>(r3, r2, r1)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.internal.FlowCoroutineKt.scopedFlow(r0)
            return r0
        L18:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Sample period should be positive"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m1690sampleHG0u8IE(kotlinx.coroutines.flow.Flow<? extends T> r2, long r3) {
            long r0 = kotlinx.coroutines.DelayKt.m1645toDelayMillisLRDsOJo(r3)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.sample(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m1691timeoutHG0u8IE(kotlinx.coroutines.flow.Flow<? extends T> r1, long r2) {
            kotlinx.coroutines.flow.Flow r0 = m1692timeoutInternalHG0u8IE$FlowKt__DelayKt(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: timeoutInternal-HG0u8IE$FlowKt__DelayKt, reason: not valid java name */
    private static final <T> kotlinx.coroutines.flow.Flow<T> m1692timeoutInternalHG0u8IE$FlowKt__DelayKt(kotlinx.coroutines.flow.Flow<? extends T> r2, long r3) {
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1
            r1 = 0
            r0.<init>(r3, r2, r1)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.internal.FlowCoroutineKt.scopedFlow(r0)
            return r0
    }
}
