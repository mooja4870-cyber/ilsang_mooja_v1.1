package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: TickerChannels.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082@¢\u0006\u0002\u0010\u0007\u001a,\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082@¢\u0006\u0002\u0010\u0007\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"fixedDelayTicker", "", "delayMillis", "", "initialDelayMillis", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "(JJLkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fixedPeriodTicker", "ticker", "Lkotlinx/coroutines/channels/ReceiveChannel;", "context", "Lkotlin/coroutines/CoroutineContext;", "mode", "Lkotlinx/coroutines/channels/TickerMode;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TickerChannelsKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1, reason: invalid class name */
    /* JADX INFO: compiled from: TickerChannels.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {102, 104, 105}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        long J$0;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass1> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                r7.result = r8
                int r0 = r7.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r7.label = r0
                r5 = 0
                r6 = r7
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r1 = 0
                r3 = 0
                java.lang.Object r0 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedDelayTicker(r1, r3, r5, r6)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TickerChannels.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {80, 84, 90, 92}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    static final class C01101 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        long J$0;
        long J$1;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C01101(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.TickerChannelsKt.C01101> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                r7.result = r8
                int r0 = r7.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r7.label = r0
                r5 = 0
                r6 = r7
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r1 = 0
                r3 = 0
                java.lang.Object r0 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedPeriodTicker(r1, r3, r5, r6)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3, reason: invalid class name */
    /* JADX INFO: compiled from: TickerChannels.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {68, 69}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ long $delayMillis;
        final /* synthetic */ long $initialDelayMillis;
        final /* synthetic */ kotlinx.coroutines.channels.TickerMode $mode;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3$WhenMappings */
        /* JADX INFO: compiled from: TickerChannels.kt */
        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                    kotlinx.coroutines.channels.TickerMode[] r0 = kotlinx.coroutines.channels.TickerMode.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlinx.coroutines.channels.TickerMode r1 = kotlinx.coroutines.channels.TickerMode.FIXED_PERIOD     // Catch: java.lang.NoSuchFieldError -> L11
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                    goto L12
                L11:
                    r1 = move-exception
                L12:
                    kotlinx.coroutines.channels.TickerMode r1 = kotlinx.coroutines.channels.TickerMode.FIXED_DELAY     // Catch: java.lang.NoSuchFieldError -> L1c
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                    goto L1d
                L1c:
                    r1 = move-exception
                L1d:
                    kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass3.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
            }
        }

        AnonymousClass3(kotlinx.coroutines.channels.TickerMode r2, long r3, long r5, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass3> r7) {
                r1 = this;
                r1.$mode = r2
                r1.$delayMillis = r3
                r1.$initialDelayMillis = r5
                r0 = 2
                r1.<init>(r0, r7)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r8, kotlin.coroutines.Continuation<?> r9) {
                r7 = this;
                kotlinx.coroutines.channels.TickerChannelsKt$ticker$3 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$ticker$3
                kotlinx.coroutines.channels.TickerMode r1 = r7.$mode
                long r2 = r7.$delayMillis
                long r4 = r7.$initialDelayMillis
                r6 = r9
                r0.<init>(r1, r2, r4, r6)
                r0.L$0 = r8
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
                kotlinx.coroutines.channels.TickerChannelsKt$ticker$3 r0 = (kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass3) r0
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
                    case 0: goto L1b;
                    case 1: goto L16;
                    case 2: goto L11;
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
                goto L47
            L16:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r11)
                goto L5f
            L1b:
                kotlin.ResultKt.throwOnFailure(r11)
                r1 = r10
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlinx.coroutines.channels.TickerMode r3 = r1.$mode
                int[] r4 = kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass3.WhenMappings.$EnumSwitchMapping$0
                int r3 = r3.ordinal()
                r3 = r4[r3]
                switch(r3) {
                    case 1: goto L49;
                    case 2: goto L31;
                    default: goto L30;
                }
            L30:
                goto L60
            L31:
                long r4 = r1.$delayMillis
                long r6 = r1.$initialDelayMillis
                kotlinx.coroutines.channels.SendChannel r8 = r2.getChannel()
                r9 = r1
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
                r3 = 2
                r1.label = r3
                java.lang.Object r2 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedDelayTicker(r4, r6, r8, r9)
                if (r2 != r0) goto L46
                return r0
            L46:
                r0 = r1
            L47:
                r1 = r0
                goto L60
            L49:
                long r3 = r1.$delayMillis
                long r5 = r1.$initialDelayMillis
                kotlinx.coroutines.channels.SendChannel r7 = r2.getChannel()
                r8 = r1
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                r9 = 1
                r1.label = r9
                java.lang.Object r2 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedPeriodTicker(r3, r5, r7, r8)
                if (r2 != r0) goto L5e
                return r0
            L5e:
                r0 = r1
            L5f:
                r1 = r0
            L60:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    public static final /* synthetic */ java.lang.Object access$fixedDelayTicker(long r1, long r3, kotlinx.coroutines.channels.SendChannel r5, kotlin.coroutines.Continuation r6) {
            java.lang.Object r0 = fixedDelayTicker(r1, r3, r5, r6)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$fixedPeriodTicker(long r1, long r3, kotlinx.coroutines.channels.SendChannel r5, kotlin.coroutines.Continuation r6) {
            java.lang.Object r0 = fixedPeriodTicker(r1, r3, r5, r6)
            return r0
    }

    private static final java.lang.Object fixedDelayTicker(long r3, long r5, kotlinx.coroutines.channels.SendChannel<? super kotlin.Unit> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L4a;
                case 1: goto L40;
                case 2: goto L36;
                case 3: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L2c:
            long r3 = r0.J$0
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r5 = (kotlinx.coroutines.channels.SendChannel) r5
            kotlin.ResultKt.throwOnFailure(r8)
            goto L7b
        L36:
            long r3 = r0.J$0
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r5 = (kotlinx.coroutines.channels.SendChannel) r5
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6d
        L40:
            long r3 = r0.J$0
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r5 = (kotlinx.coroutines.channels.SendChannel) r5
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5c
        L4a:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.L$0 = r7
            r0.J$0 = r3
            r2 = 1
            r0.label = r2
            java.lang.Object r5 = kotlinx.coroutines.DelayKt.delay(r5, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            r5 = r7
        L5c:
        L5d:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r0.L$0 = r5
            r0.J$0 = r3
            r7 = 2
            r0.label = r7
            java.lang.Object r6 = r5.send(r6, r0)
            if (r6 != r1) goto L6d
            return r1
        L6d:
            r0.L$0 = r5
            r0.J$0 = r3
            r6 = 3
            r0.label = r6
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r0)
            if (r6 != r1) goto L7b
            return r1
        L7b:
            goto L5d
    }

    private static final java.lang.Object fixedPeriodTicker(long r9, long r11, kotlinx.coroutines.channels.SendChannel<? super kotlin.Unit> r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.TickerChannelsKt.C01101
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt.C01101) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L19
        L14:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1
            r0.<init>(r14)
        L19:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L62;
                case 1: goto L56;
                case 2: goto L4a;
                case 3: goto L3b;
                case 4: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2c:
            long r9 = r0.J$1
            long r11 = r0.J$0
            java.lang.Object r13 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r13 = (kotlinx.coroutines.channels.SendChannel) r13
            kotlin.ResultKt.throwOnFailure(r14)
            r2 = r9
            r9 = r11
            goto Lf8
        L3b:
            long r9 = r0.J$1
            long r11 = r0.J$0
            java.lang.Object r13 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r13 = (kotlinx.coroutines.channels.SendChannel) r13
            kotlin.ResultKt.throwOnFailure(r14)
            r2 = r9
            r9 = r11
            goto Le1
        L4a:
            long r9 = r0.J$1
            long r11 = r0.J$0
            java.lang.Object r13 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r13 = (kotlinx.coroutines.channels.SendChannel) r13
            kotlin.ResultKt.throwOnFailure(r14)
            goto La5
        L56:
            long r9 = r0.J$1
            long r11 = r0.J$0
            java.lang.Object r13 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r13 = (kotlinx.coroutines.channels.SendChannel) r13
            kotlin.ResultKt.throwOnFailure(r14)
            goto L8b
        L62:
            kotlin.ResultKt.throwOnFailure(r14)
            kotlinx.coroutines.AbstractTimeSource r2 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r2 == 0) goto L70
            long r2 = r2.nanoTime()
            goto L74
        L70:
            long r2 = java.lang.System.nanoTime()
        L74:
            long r4 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r11)
            long r2 = r2 + r4
            r0.L$0 = r13
            r0.J$0 = r9
            r0.J$1 = r2
            r4 = 1
            r0.label = r4
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r11, r0)
            if (r11 != r1) goto L89
            return r1
        L89:
            r11 = r9
            r9 = r2
        L8b:
            long r2 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r11)
        L8f:
            long r9 = r9 + r2
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            r0.L$0 = r13
            r0.J$0 = r9
            r0.J$1 = r2
            r12 = 2
            r0.label = r12
            java.lang.Object r11 = r13.send(r11, r0)
            if (r11 != r1) goto La3
            return r1
        La3:
            r11 = r9
            r9 = r2
        La5:
            kotlinx.coroutines.AbstractTimeSource r2 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r2 == 0) goto Lb0
            long r2 = r2.nanoTime()
            goto Lb4
        Lb0:
            long r2 = java.lang.System.nanoTime()
        Lb4:
            long r4 = r11 - r2
            r6 = 0
            long r4 = kotlin.ranges.RangesKt.coerceAtLeast(r4, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto Le2
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 == 0) goto Le2
            long r4 = r2 - r11
            long r4 = r4 % r9
            long r4 = r9 - r4
            long r11 = r2 + r4
            long r2 = kotlinx.coroutines.EventLoop_commonKt.delayNanosToMillis(r4)
            r0.L$0 = r13
            r0.J$0 = r11
            r0.J$1 = r9
            r6 = 3
            r0.label = r6
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.delay(r2, r0)
            if (r2 != r1) goto Ldf
            return r1
        Ldf:
            r2 = r9
            r9 = r11
        Le1:
            goto L8f
        Le2:
            long r2 = kotlinx.coroutines.EventLoop_commonKt.delayNanosToMillis(r4)
            r0.L$0 = r13
            r0.J$0 = r11
            r0.J$1 = r9
            r6 = 4
            r0.label = r6
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.delay(r2, r0)
            if (r2 != r1) goto Lf6
            return r1
        Lf6:
            r2 = r9
            r9 = r11
        Lf8:
            goto L8f
    }

    public static final kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> ticker(long r13, long r15, kotlin.coroutines.CoroutineContext r17, kotlinx.coroutines.channels.TickerMode r18) {
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            r3 = 1
            r7 = 0
            if (r2 < 0) goto La
            r2 = r3
            goto Lb
        La:
            r2 = r7
        Lb:
            java.lang.String r4 = " ms"
            if (r2 == 0) goto L5f
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 < 0) goto L14
            goto L15
        L14:
            r3 = r7
        L15:
            if (r3 == 0) goto L3a
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r8 = r0
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getUnconfined()
            r9 = r17
            kotlin.coroutines.CoroutineContext r10 = r0.plus(r9)
            kotlinx.coroutines.channels.TickerChannelsKt$ticker$3 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$ticker$3
            r6 = 0
            r2 = r13
            r4 = r15
            r1 = r18
            r0.<init>(r1, r2, r4, r6)
            r11 = r4
            r4 = r0
            r0 = r11
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            kotlinx.coroutines.channels.ReceiveChannel r4 = kotlinx.coroutines.channels.ProduceKt.produce(r8, r10, r7, r4)
            return r4
        L3a:
            r0 = r15
            r9 = r17
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Expected non-negative initial delay, but has "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L5f:
            r0 = r15
            r9 = r17
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Expected non-negative delay, but has "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r13)
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel ticker$default(long r0, long r2, kotlin.coroutines.CoroutineContext r4, kotlinx.coroutines.channels.TickerMode r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            if (r7 == 0) goto L5
            r2 = r0
        L5:
            r7 = r6 & 4
            if (r7 == 0) goto Ld
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
        Ld:
            r6 = r6 & 8
            if (r6 == 0) goto L13
            kotlinx.coroutines.channels.TickerMode r5 = kotlinx.coroutines.channels.TickerMode.FIXED_PERIOD
        L13:
            kotlinx.coroutines.channels.ReceiveChannel r0 = ticker(r0, r2, r4, r5)
            return r0
    }
}
