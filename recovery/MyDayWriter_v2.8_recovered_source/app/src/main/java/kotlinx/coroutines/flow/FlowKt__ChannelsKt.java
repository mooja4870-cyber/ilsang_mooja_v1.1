package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a,\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086@¢\u0006\u0002\u0010\n\u001a6\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005¨\u0006\u0014"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "Lkotlinx/coroutines/channels/BroadcastChannel;", "consumeAsFlow", "Lkotlinx/coroutines/channels/ReceiveChannel;", "emitAll", "", "Lkotlinx/coroutines/flow/FlowCollector;", "channel", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitAllImpl", "consume", "", "emitAllImpl$FlowKt__ChannelsKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceIn", "scope", "Lkotlinx/coroutines/CoroutineScope;", "receiveAsFlow", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ChannelsKt {
    public static final /* synthetic */ java.lang.Object access$emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector r1, kotlinx.coroutines.channels.ReceiveChannel r2, boolean r3, kotlin.coroutines.Continuation r4) {
            java.lang.Object r0 = emitAllImpl$FlowKt__ChannelsKt(r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(kotlinx.coroutines.channels.BroadcastChannel<T> r2) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$asFlow$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$asFlow$$inlined$unsafeFlow$1
            r1.<init>(r2)
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            return r1
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> consumeAsFlow(kotlinx.coroutines.channels.ReceiveChannel<? extends T> r8) {
            kotlinx.coroutines.flow.ChannelAsFlow r0 = new kotlinx.coroutines.flow.ChannelAsFlow
            r6 = 28
            r7 = 0
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            return r0
    }

    public static final <T> java.lang.Object emitAll(kotlinx.coroutines.flow.FlowCollector<? super T> r2, kotlinx.coroutines.channels.ReceiveChannel<? extends T> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r0 = 1
            java.lang.Object r0 = emitAllImpl$FlowKt__ChannelsKt(r2, r3, r0, r4)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto Lc
            return r0
        Lc:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private static final <T> java.lang.Object emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector<? super T> r7, kotlinx.coroutines.channels.ReceiveChannel<? extends T> r8, boolean r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L14
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L60;
                case 1: goto L45;
                case 2: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2c:
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            r9 = 0
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L5d
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r8
            r8 = r6
            goto Laf
        L45:
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            r9 = 0
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L5d
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r10
            goto L89
        L5d:
            r8 = move-exception
            goto Lc3
        L60:
            kotlin.ResultKt.throwOnFailure(r10)
            r2 = r8
            kotlinx.coroutines.flow.FlowKt.ensureActive(r7)
            r8 = 0
            kotlinx.coroutines.channels.ChannelIterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> Lbe
        L6d:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> Lbe
            r0.L$1 = r2     // Catch: java.lang.Throwable -> Lbe
            r0.L$2 = r3     // Catch: java.lang.Throwable -> Lbe
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> Lbe
            r4 = 1
            r0.label = r4     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r4 = r3.hasNext(r0)     // Catch: java.lang.Throwable -> Lbe
            if (r4 != r1) goto L7f
            return r1
        L7f:
            r6 = r4
            r4 = r7
            r7 = r9
            r9 = r8
            r8 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L89:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lb9
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lb9
            if (r10 == 0) goto Lb0
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> Lb9
            r1.L$0 = r4     // Catch: java.lang.Throwable -> Lb9
            r1.L$1 = r3     // Catch: java.lang.Throwable -> Lb9
            r1.L$2 = r8     // Catch: java.lang.Throwable -> Lb9
            r1.Z$0 = r7     // Catch: java.lang.Throwable -> Lb9
            r5 = 2
            r1.label = r5     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r5 = r4.emit(r10, r1)     // Catch: java.lang.Throwable -> Lb9
            if (r5 != r2) goto La7
            return r2
        La7:
            r10 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r8
            r8 = r9
            r9 = r7
            r7 = r4
        Laf:
            goto L6d
        Lb0:
            if (r7 == 0) goto Lb5
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r9)
        Lb5:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        Lb9:
            r8 = move-exception
            r10 = r0
            r0 = r1
            r2 = r3
            goto Lc3
        Lbe:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        Lc3:
            r9 = r8
            throw r8     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r8 = move-exception
            if (r7 == 0) goto Lcc
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r9)
        Lcc:
            throw r8
    }

    public static final <T> kotlinx.coroutines.channels.ReceiveChannel<T> produceIn(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.CoroutineScope r2) {
            kotlinx.coroutines.flow.internal.ChannelFlow r0 = kotlinx.coroutines.flow.internal.ChannelFlowKt.asChannelFlow(r1)
            kotlinx.coroutines.channels.ReceiveChannel r0 = r0.produceImpl(r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> receiveAsFlow(kotlinx.coroutines.channels.ReceiveChannel<? extends T> r8) {
            kotlinx.coroutines.flow.ChannelAsFlow r0 = new kotlinx.coroutines.flow.ChannelAsFlow
            r6 = 28
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            return r0
    }
}
