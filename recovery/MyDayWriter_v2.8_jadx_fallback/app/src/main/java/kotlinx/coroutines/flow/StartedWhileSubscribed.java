package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0017J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/flow/StartedWhileSubscribed;", "Lkotlinx/coroutines/flow/SharingStarted;", "stopTimeout", "", "replayExpiration", "(JJ)V", "command", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharingCommand;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "equals", "", "other", "", "hashCode", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class StartedWhileSubscribed implements kotlinx.coroutines.flow.SharingStarted {
    private final long replayExpiration;
    private final long stopTimeout;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;", "count", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {174, 176, 178, 179, 181}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand>, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ int I$0;
        private /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ kotlinx.coroutines.flow.StartedWhileSubscribed this$0;

        AnonymousClass1(kotlinx.coroutines.flow.StartedWhileSubscribed r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass1> r3) {
                r1 = this;
                r1.this$0 = r2
                r0 = 3
                r1.<init>(r0, r3)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand> r4, java.lang.Integer r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                r3 = this;
                r0 = r4
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                r1 = r5
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r2 = r6
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r3.invoke(r0, r1, r2)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand> r3, int r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                r2 = this;
                kotlinx.coroutines.flow.StartedWhileSubscribed$command$1 r0 = new kotlinx.coroutines.flow.StartedWhileSubscribed$command$1
                kotlinx.coroutines.flow.StartedWhileSubscribed r1 = r2.this$0
                r0.<init>(r1, r5)
                r0.L$0 = r3
                r0.I$0 = r4
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
                    case 0: goto L38;
                    case 1: goto L33;
                    case 2: goto L2a;
                    case 3: goto L21;
                    case 4: goto L17;
                    case 5: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L11:
                r0 = r7
                kotlin.ResultKt.throwOnFailure(r8)
                goto Lb1
            L17:
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.ResultKt.throwOnFailure(r8)
                goto L9d
            L21:
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.ResultKt.throwOnFailure(r8)
                goto L88
            L2a:
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.ResultKt.throwOnFailure(r8)
                goto L6b
            L33:
                r0 = r7
                kotlin.ResultKt.throwOnFailure(r8)
                goto L55
            L38:
                kotlin.ResultKt.throwOnFailure(r8)
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                int r3 = r1.I$0
                if (r3 <= 0) goto L56
                kotlinx.coroutines.flow.SharingCommand r3 = kotlinx.coroutines.flow.SharingCommand.START
                r4 = r1
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r5 = 1
                r1.label = r5
                java.lang.Object r2 = r2.emit(r3, r4)
                if (r2 != r0) goto L54
                return r0
            L54:
                r0 = r1
            L55:
                goto Lb2
            L56:
                kotlinx.coroutines.flow.StartedWhileSubscribed r3 = r1.this$0
                long r3 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getStopTimeout$p(r3)
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r2
                r6 = 2
                r1.label = r6
                java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r3 != r0) goto L6b
                return r0
            L6b:
                kotlinx.coroutines.flow.StartedWhileSubscribed r3 = r1.this$0
                long r3 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getReplayExpiration$p(r3)
                r5 = 0
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 <= 0) goto L9e
                kotlinx.coroutines.flow.SharingCommand r3 = kotlinx.coroutines.flow.SharingCommand.STOP
                r4 = r1
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r1.L$0 = r2
                r5 = 3
                r1.label = r5
                java.lang.Object r3 = r2.emit(r3, r4)
                if (r3 != r0) goto L88
                return r0
            L88:
                kotlinx.coroutines.flow.StartedWhileSubscribed r3 = r1.this$0
                long r3 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getReplayExpiration$p(r3)
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.L$0 = r2
                r6 = 4
                r1.label = r6
                java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r3 != r0) goto L9d
                return r0
            L9d:
            L9e:
                kotlinx.coroutines.flow.SharingCommand r3 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
                r4 = r1
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r5 = 0
                r1.L$0 = r5
                r5 = 5
                r1.label = r5
                java.lang.Object r2 = r2.emit(r3, r4)
                if (r2 != r0) goto Lb0
                return r0
            Lb0:
                r0 = r1
            Lb1:
            Lb2:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedWhileSubscribed$command$2, reason: invalid class name */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.SharingCommand, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass2> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r2, kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                kotlinx.coroutines.flow.StartedWhileSubscribed$command$2 r0 = new kotlinx.coroutines.flow.StartedWhileSubscribed$command$2
                r0.<init>(r3)
                r0.L$0 = r2
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.SharingCommand r2, kotlin.coroutines.Continuation<? super java.lang.Boolean> r3) {
                r1 = this;
                kotlinx.coroutines.flow.SharingCommand r2 = (kotlinx.coroutines.flow.SharingCommand) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.flow.SharingCommand r3, kotlin.coroutines.Continuation<? super java.lang.Boolean> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.flow.StartedWhileSubscribed$command$2 r0 = (kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass2) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r3.label
                switch(r0) {
                    case 0: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L10:
                kotlin.ResultKt.throwOnFailure(r4)
                r0 = r3
                java.lang.Object r1 = r0.L$0
                kotlinx.coroutines.flow.SharingCommand r1 = (kotlinx.coroutines.flow.SharingCommand) r1
                kotlinx.coroutines.flow.SharingCommand r2 = kotlinx.coroutines.flow.SharingCommand.START
                if (r1 == r2) goto L1e
                r2 = 1
                goto L1f
            L1e:
                r2 = 0
            L1f:
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                return r1
        }
    }

    public StartedWhileSubscribed(long r9, long r11) {
            r8 = this;
            r8.<init>()
            r8.stopTimeout = r9
            r8.replayExpiration = r11
            long r0 = r8.stopTimeout
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r4 = 0
            if (r0 < 0) goto L14
            r0 = r1
            goto L15
        L14:
            r0 = r4
        L15:
            java.lang.String r5 = " ms) cannot be negative"
            if (r0 == 0) goto L49
            long r6 = r8.replayExpiration
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 < 0) goto L20
            goto L21
        L20:
            r1 = r4
        L21:
            if (r1 == 0) goto L25
        L24:
            return
        L25:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "replayExpiration("
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = r8.replayExpiration
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L49:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "stopTimeout("
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = r8.stopTimeout
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final /* synthetic */ long access$getReplayExpiration$p(kotlinx.coroutines.flow.StartedWhileSubscribed r2) {
            long r0 = r2.replayExpiration
            return r0
    }

    public static final /* synthetic */ long access$getStopTimeout$p(kotlinx.coroutines.flow.StartedWhileSubscribed r2) {
            long r0 = r2.stopTimeout
            return r0
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.SharingCommand> command(kotlinx.coroutines.flow.StateFlow<java.lang.Integer> r4) {
            r3 = this;
            r0 = r4
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            kotlinx.coroutines.flow.StartedWhileSubscribed$command$1 r1 = new kotlinx.coroutines.flow.StartedWhileSubscribed$command$1
            r2 = 0
            r1.<init>(r3, r2)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.transformLatest(r0, r1)
            kotlinx.coroutines.flow.StartedWhileSubscribed$command$2 r1 = new kotlinx.coroutines.flow.StartedWhileSubscribed$command$2
            r1.<init>(r2)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.dropWhile(r0, r1)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(r0)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.StartedWhileSubscribed
            if (r0 == 0) goto L1c
            long r0 = r4.stopTimeout
            r2 = r5
            kotlinx.coroutines.flow.StartedWhileSubscribed r2 = (kotlinx.coroutines.flow.StartedWhileSubscribed) r2
            long r2 = r2.stopTimeout
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1c
            long r0 = r4.replayExpiration
            r2 = r5
            kotlinx.coroutines.flow.StartedWhileSubscribed r2 = (kotlinx.coroutines.flow.StartedWhileSubscribed) r2
            long r2 = r2.replayExpiration
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    public int hashCode() {
            r3 = this;
            long r0 = r3.stopTimeout
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.replayExpiration
            int r1 = java.lang.Long.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r11 = this;
            r0 = 2
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder(r0)
            r1 = r0
            r2 = 0
            long r3 = r11.stopTimeout
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.String r4 = "ms"
            if (r3 <= 0) goto L2d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "stopTimeout="
            java.lang.StringBuilder r3 = r3.append(r5)
            long r5 = r11.stopTimeout
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.add(r3)
        L2d:
            long r5 = r11.replayExpiration
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L54
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "replayExpiration="
            java.lang.StringBuilder r3 = r3.append(r5)
            long r5 = r11.replayExpiration
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.add(r3)
        L54:
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SharingStarted.WhileSubscribed("
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r9 = 63
            r10 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r2 = kotlin.collections.CollectionsKt.joinToString$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 41
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }
}
