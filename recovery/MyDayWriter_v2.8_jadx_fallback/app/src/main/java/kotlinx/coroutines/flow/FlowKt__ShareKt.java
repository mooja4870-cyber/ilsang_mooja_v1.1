package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0002\b\f\u001aM\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aA\u0010\u0019\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0002*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u001cH\u0002¢\u0006\u0002\b\u001d\u001aP\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012-\u0010\u001f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\"\u0012\u0006\u0012\u0004\u0018\u00010#0 ¢\u0006\u0002\b$¢\u0006\u0002\u0010%\u001a6\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a,\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010)\u001a9\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u0002¢\u0006\u0002\u0010*¨\u0006+"}, d2 = {"asSharedFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "T", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "asStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "configureSharing", "Lkotlinx/coroutines/flow/SharingConfig;", "Lkotlinx/coroutines/flow/Flow;", "replay", "", "configureSharing$FlowKt__ShareKt", "launchSharing", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "upstream", "shared", "started", "Lkotlinx/coroutines/flow/SharingStarted;", "initialValue", "launchSharing$FlowKt__ShareKt", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/Job;", "launchSharingDeferred", "", "result", "Lkotlinx/coroutines/CompletableDeferred;", "launchSharingDeferred$FlowKt__ShareKt", "onSubscription", "action", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/SharedFlow;", "shareIn", "scope", "stateIn", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ShareKt {
    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> asSharedFlow(kotlinx.coroutines.flow.MutableSharedFlow<T> r3) {
            kotlinx.coroutines.flow.ReadonlySharedFlow r0 = new kotlinx.coroutines.flow.ReadonlySharedFlow
            r1 = r3
            kotlinx.coroutines.flow.SharedFlow r1 = (kotlinx.coroutines.flow.SharedFlow) r1
            r2 = 0
            r0.<init>(r1, r2)
            kotlinx.coroutines.flow.SharedFlow r0 = (kotlinx.coroutines.flow.SharedFlow) r0
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.StateFlow<T> asStateFlow(kotlinx.coroutines.flow.MutableStateFlow<T> r3) {
            kotlinx.coroutines.flow.ReadonlyStateFlow r0 = new kotlinx.coroutines.flow.ReadonlyStateFlow
            r1 = r3
            kotlinx.coroutines.flow.StateFlow r1 = (kotlinx.coroutines.flow.StateFlow) r1
            r2 = 0
            r0.<init>(r1, r2)
            kotlinx.coroutines.flow.StateFlow r0 = (kotlinx.coroutines.flow.StateFlow) r0
            return r0
    }

    private static final <T> kotlinx.coroutines.flow.SharingConfig<T> configureSharing$FlowKt__ShareKt(kotlinx.coroutines.flow.Flow<? extends T> r7, int r8) {
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            r0 = 0
            if (r8 < 0) goto Ld
            r0 = r1
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 == 0) goto L11
            goto L17
        L11:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L17:
            kotlinx.coroutines.channels.Channel$Factory r0 = kotlinx.coroutines.channels.Channel.Factory
            int r0 = r0.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()
            int r0 = kotlin.ranges.RangesKt.coerceAtLeast(r8, r0)
            int r0 = r0 - r8
            boolean r3 = r7 instanceof kotlinx.coroutines.flow.internal.ChannelFlow
            if (r3 == 0) goto L67
            r3 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r3 = (kotlinx.coroutines.flow.internal.ChannelFlow) r3
            kotlinx.coroutines.flow.Flow r3 = r3.dropChannelOperators()
            if (r3 == 0) goto L67
            kotlinx.coroutines.flow.SharingConfig r4 = new kotlinx.coroutines.flow.SharingConfig
            r5 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r5 = (kotlinx.coroutines.flow.internal.ChannelFlow) r5
            int r5 = r5.capacity
            switch(r5) {
                case -3: goto L40;
                case -2: goto L40;
                case -1: goto L3a;
                case 0: goto L40;
                default: goto L3a;
            }
        L3a:
            r1 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r1 = (kotlinx.coroutines.flow.internal.ChannelFlow) r1
            int r1 = r1.capacity
            goto L59
        L40:
            r5 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r5 = (kotlinx.coroutines.flow.internal.ChannelFlow) r5
            kotlinx.coroutines.channels.BufferOverflow r5 = r5.onBufferOverflow
            kotlinx.coroutines.channels.BufferOverflow r6 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r5 != r6) goto L55
            r1 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r1 = (kotlinx.coroutines.flow.internal.ChannelFlow) r1
            int r1 = r1.capacity
            if (r1 != 0) goto L53
            r1 = r2
            goto L59
        L53:
            r1 = r0
            goto L59
        L55:
            if (r8 != 0) goto L58
            goto L59
        L58:
            r1 = r2
        L59:
            r2 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r2 = (kotlinx.coroutines.flow.internal.ChannelFlow) r2
            kotlinx.coroutines.channels.BufferOverflow r2 = r2.onBufferOverflow
            r5 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r5 = (kotlinx.coroutines.flow.internal.ChannelFlow) r5
            kotlin.coroutines.CoroutineContext r5 = r5.context
            r4.<init>(r3, r1, r2, r5)
            return r4
        L67:
            kotlinx.coroutines.flow.SharingConfig r1 = new kotlinx.coroutines.flow.SharingConfig
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            r1.<init>(r7, r0, r2, r3)
            return r1
    }

    private static final <T> kotlinx.coroutines.Job launchSharing$FlowKt__ShareKt(kotlinx.coroutines.CoroutineScope r7, kotlin.coroutines.CoroutineContext r8, kotlinx.coroutines.flow.Flow<? extends T> r9, kotlinx.coroutines.flow.MutableSharedFlow<T> r10, kotlinx.coroutines.flow.SharingStarted r11, T r12) {
            kotlinx.coroutines.flow.SharingStarted$Companion r0 = kotlinx.coroutines.flow.SharingStarted.Companion
            kotlinx.coroutines.flow.SharingStarted r0 = r0.getEagerly()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r0)
            if (r0 == 0) goto Lf
            kotlinx.coroutines.CoroutineStart r0 = kotlinx.coroutines.CoroutineStart.DEFAULT
            goto L11
        Lf:
            kotlinx.coroutines.CoroutineStart r0 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
        L11:
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1
            r6 = 0
            r3 = r9
            r4 = r10
            r2 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            kotlinx.coroutines.Job r9 = kotlinx.coroutines.BuildersKt.launch(r7, r8, r0, r1)
            return r9
    }

    private static final <T> void launchSharingDeferred$FlowKt__ShareKt(kotlinx.coroutines.CoroutineScope r8, kotlin.coroutines.CoroutineContext r9, kotlinx.coroutines.flow.Flow<? extends T> r10, kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> r11) {
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1
            r1 = 0
            r0.<init>(r10, r11, r1)
            r5 = r0
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r6 = 2
            r7 = 0
            r4 = 0
            r2 = r8
            r3 = r9
            kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
            return
    }

    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> onSubscription(kotlinx.coroutines.flow.SharedFlow<? extends T> r1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.SubscribedSharedFlow r0 = new kotlinx.coroutines.flow.SubscribedSharedFlow
            r0.<init>(r1, r2)
            kotlinx.coroutines.flow.SharedFlow r0 = (kotlinx.coroutines.flow.SharedFlow) r0
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> shareIn(kotlinx.coroutines.flow.Flow<? extends T> r9, kotlinx.coroutines.CoroutineScope r10, kotlinx.coroutines.flow.SharingStarted r11, int r12) {
            kotlinx.coroutines.flow.SharingConfig r0 = configureSharing$FlowKt__ShareKt(r9, r12)
            int r1 = r0.extraBufferCapacity
            kotlinx.coroutines.channels.BufferOverflow r2 = r0.onBufferOverflow
            kotlinx.coroutines.flow.MutableSharedFlow r6 = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow(r12, r1, r2)
            kotlin.coroutines.CoroutineContext r4 = r0.context
            kotlinx.coroutines.flow.Flow<T> r5 = r0.upstream
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
            r8 = r1
            java.lang.Object r8 = (java.lang.Object) r8
            r3 = r10
            r7 = r11
            kotlinx.coroutines.Job r10 = launchSharing$FlowKt__ShareKt(r3, r4, r5, r6, r7, r8)
            kotlinx.coroutines.flow.ReadonlySharedFlow r11 = new kotlinx.coroutines.flow.ReadonlySharedFlow
            r1 = r6
            kotlinx.coroutines.flow.SharedFlow r1 = (kotlinx.coroutines.flow.SharedFlow) r1
            r11.<init>(r1, r10)
            kotlinx.coroutines.flow.SharedFlow r11 = (kotlinx.coroutines.flow.SharedFlow) r11
            return r11
    }

    public static /* synthetic */ kotlinx.coroutines.flow.SharedFlow shareIn$default(kotlinx.coroutines.flow.Flow r0, kotlinx.coroutines.CoroutineScope r1, kotlinx.coroutines.flow.SharingStarted r2, int r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            kotlinx.coroutines.flow.SharedFlow r0 = kotlinx.coroutines.flow.FlowKt.shareIn(r0, r1, r2, r3)
            return r0
    }

    public static final <T> java.lang.Object stateIn(kotlinx.coroutines.flow.Flow<? extends T> r4, kotlinx.coroutines.CoroutineScope r5, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StateFlow<? extends T>> r6) {
            r0 = 1
            kotlinx.coroutines.flow.SharingConfig r1 = configureSharing$FlowKt__ShareKt(r4, r0)
            r2 = 0
            kotlinx.coroutines.CompletableDeferred r0 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r2, r0, r2)
            kotlin.coroutines.CoroutineContext r2 = r1.context
            kotlinx.coroutines.flow.Flow<T> r3 = r1.upstream
            launchSharingDeferred$FlowKt__ShareKt(r5, r2, r3, r0)
            java.lang.Object r2 = r0.await(r6)
            return r2
    }

    public static final <T> kotlinx.coroutines.flow.StateFlow<T> stateIn(kotlinx.coroutines.flow.Flow<? extends T> r8, kotlinx.coroutines.CoroutineScope r9, kotlinx.coroutines.flow.SharingStarted r10, T r11) {
            r0 = 1
            kotlinx.coroutines.flow.SharingConfig r0 = configureSharing$FlowKt__ShareKt(r8, r0)
            kotlinx.coroutines.flow.MutableStateFlow r1 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(r11)
            kotlin.coroutines.CoroutineContext r3 = r0.context
            kotlinx.coroutines.flow.Flow<T> r4 = r0.upstream
            r5 = r1
            kotlinx.coroutines.flow.MutableSharedFlow r5 = (kotlinx.coroutines.flow.MutableSharedFlow) r5
            r2 = r9
            r6 = r10
            r7 = r11
            kotlinx.coroutines.Job r9 = launchSharing$FlowKt__ShareKt(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.flow.ReadonlyStateFlow r10 = new kotlinx.coroutines.flow.ReadonlyStateFlow
            r11 = r1
            kotlinx.coroutines.flow.StateFlow r11 = (kotlinx.coroutines.flow.StateFlow) r11
            r10.<init>(r11, r9)
            kotlinx.coroutines.flow.StateFlow r10 = (kotlinx.coroutines.flow.StateFlow) r10
            return r10
    }
}
