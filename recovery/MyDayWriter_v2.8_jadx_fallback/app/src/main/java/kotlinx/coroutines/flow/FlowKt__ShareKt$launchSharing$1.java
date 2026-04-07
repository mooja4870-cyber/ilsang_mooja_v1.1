package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {210, 214, 215, 221}, m = "invokeSuspend", n = {}, s = {})
final class FlowKt__ShareKt$launchSharing$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ T $initialValue;
    final /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow<T> $shared;
    final /* synthetic */ kotlinx.coroutines.flow.SharingStarted $started;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $upstream;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Share.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ int I$0;
        int label;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass1> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
                r0.<init>(r4)
                r1 = r3
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r0.I$0 = r1
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        public final java.lang.Object invoke(int r3, kotlin.coroutines.Continuation<? super java.lang.Boolean> r4) {
                r2 = this;
                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
                kotlin.coroutines.Continuation r0 = r2.create(r0, r4)
                kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass1) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Integer r3, kotlin.coroutines.Continuation<? super java.lang.Boolean> r4) {
                r2 = this;
                r0 = r3
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r1 = r4
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = r2.invoke(r0, r1)
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
                int r1 = r0.I$0
                if (r1 <= 0) goto L1a
                r2 = 1
                goto L1b
            L1a:
                r2 = 0
            L1b:
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Share.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.SharingCommand, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ T $initialValue;
        final /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow<T> $shared;
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $upstream;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$WhenMappings */
        /* JADX INFO: compiled from: Share.kt */
        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                    kotlinx.coroutines.flow.SharingCommand[] r0 = kotlinx.coroutines.flow.SharingCommand.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.START     // Catch: java.lang.NoSuchFieldError -> L11
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                    goto L12
                L11:
                    r1 = move-exception
                L12:
                    kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.STOP     // Catch: java.lang.NoSuchFieldError -> L1c
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                    goto L1d
                L1c:
                    r1 = move-exception
                L1d:
                    kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE     // Catch: java.lang.NoSuchFieldError -> L27
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L27
                    r2 = 3
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L27
                    goto L28
                L27:
                    r1 = move-exception
                L28:
                    kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
            }
        }

        AnonymousClass2(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlinx.coroutines.flow.MutableSharedFlow<T> r3, T r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2> r5) {
                r1 = this;
                r1.$upstream = r2
                r1.$shared = r3
                r1.$initialValue = r4
                r0 = 2
                r1.<init>(r0, r5)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r5, kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
                kotlinx.coroutines.flow.Flow<T> r1 = r4.$upstream
                kotlinx.coroutines.flow.MutableSharedFlow<T> r2 = r4.$shared
                T r3 = r4.$initialValue
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.SharingCommand r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.flow.SharingCommand r2 = (kotlinx.coroutines.flow.SharingCommand) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.flow.SharingCommand r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r0 = (kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2) r0
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
                goto L54
            L16:
                kotlin.ResultKt.throwOnFailure(r7)
                r1 = r6
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.flow.SharingCommand r2 = (kotlinx.coroutines.flow.SharingCommand) r2
                int[] r3 = kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2.WhenMappings.$EnumSwitchMapping$0
                int r2 = r2.ordinal()
                r2 = r3[r2]
                switch(r2) {
                    case 1: goto L40;
                    case 2: goto L3f;
                    case 3: goto L2b;
                    default: goto L2a;
                }
            L2a:
                goto L55
            L2b:
                T r0 = r1.$initialValue
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
                if (r0 != r2) goto L37
                kotlinx.coroutines.flow.MutableSharedFlow<T> r0 = r1.$shared
                r0.resetReplayCache()
                goto L55
            L37:
                kotlinx.coroutines.flow.MutableSharedFlow<T> r0 = r1.$shared
                T r2 = r1.$initialValue
                r0.tryEmit(r2)
                goto L55
            L3f:
                goto L55
            L40:
                kotlinx.coroutines.flow.Flow<T> r2 = r1.$upstream
                kotlinx.coroutines.flow.MutableSharedFlow<T> r3 = r1.$shared
                kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                r4 = r1
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r5 = 1
                r1.label = r5
                java.lang.Object r2 = r2.collect(r3, r4)
                if (r2 != r0) goto L53
                return r0
            L53:
                r0 = r1
            L54:
                r1 = r0
            L55:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    FlowKt__ShareKt$launchSharing$1(kotlinx.coroutines.flow.SharingStarted r2, kotlinx.coroutines.flow.Flow<? extends T> r3, kotlinx.coroutines.flow.MutableSharedFlow<T> r4, T r5, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1> r6) {
            r1 = this;
            r1.$started = r2
            r1.$upstream = r3
            r1.$shared = r4
            r1.$initialValue = r5
            r0 = 2
            r1.<init>(r0, r6)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r7, kotlin.coroutines.Continuation<?> r8) {
            r6 = this;
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1
            kotlinx.coroutines.flow.SharingStarted r1 = r6.$started
            kotlinx.coroutines.flow.Flow<T> r2 = r6.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r3 = r6.$shared
            T r4 = r6.$initialValue
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
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1 r0 = (kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1) r0
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
                case 0: goto L27;
                case 1: goto L22;
                case 2: goto L1d;
                case 3: goto L17;
                case 4: goto L11;
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
            goto Lb2
        L17:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L86
        L1d:
            r1 = r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L72
        L22:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L4a
        L27:
            kotlin.ResultKt.throwOnFailure(r9)
            r1 = r8
            kotlinx.coroutines.flow.SharingStarted r2 = r1.$started
            kotlinx.coroutines.flow.SharingStarted$Companion r3 = kotlinx.coroutines.flow.SharingStarted.Companion
            kotlinx.coroutines.flow.SharingStarted r3 = r3.getEagerly()
            if (r2 != r3) goto L4b
            kotlinx.coroutines.flow.Flow<T> r2 = r1.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r3 = r1.$shared
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            r4 = r1
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5 = 1
            r1.label = r5
            java.lang.Object r2 = r2.collect(r3, r4)
            if (r2 != r0) goto L49
            return r0
        L49:
            r0 = r1
        L4a:
            goto Lb3
        L4b:
            kotlinx.coroutines.flow.SharingStarted r2 = r1.$started
            kotlinx.coroutines.flow.SharingStarted$Companion r3 = kotlinx.coroutines.flow.SharingStarted.Companion
            kotlinx.coroutines.flow.SharingStarted r3 = r3.getLazily()
            r4 = 0
            if (r2 != r3) goto L87
            kotlinx.coroutines.flow.MutableSharedFlow<T> r2 = r1.$shared
            kotlinx.coroutines.flow.StateFlow r2 = r2.getSubscriptionCount()
            kotlinx.coroutines.flow.Flow r2 = (kotlinx.coroutines.flow.Flow) r2
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r3 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r3.<init>(r4)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r4 = r1
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5 = 2
            r1.label = r5
            java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt.first(r2, r3, r4)
            if (r2 != r0) goto L72
            return r0
        L72:
            kotlinx.coroutines.flow.Flow<T> r2 = r1.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r3 = r1.$shared
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            r4 = r1
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5 = 3
            r1.label = r5
            java.lang.Object r2 = r2.collect(r3, r4)
            if (r2 != r0) goto L85
            return r0
        L85:
            r0 = r1
        L86:
            goto Lb3
        L87:
            kotlinx.coroutines.flow.SharingStarted r2 = r1.$started
            kotlinx.coroutines.flow.MutableSharedFlow<T> r3 = r1.$shared
            kotlinx.coroutines.flow.StateFlow r3 = r3.getSubscriptionCount()
            kotlinx.coroutines.flow.Flow r2 = r2.command(r3)
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(r2)
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r3 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            kotlinx.coroutines.flow.Flow<T> r5 = r1.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r6 = r1.$shared
            T r7 = r1.$initialValue
            r3.<init>(r5, r6, r7, r4)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r4 = r1
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5 = 4
            r1.label = r5
            java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt.collectLatest(r2, r3, r4)
            if (r2 != r0) goto Lb1
            return r0
        Lb1:
            r0 = r1
        Lb2:
        Lb3:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
