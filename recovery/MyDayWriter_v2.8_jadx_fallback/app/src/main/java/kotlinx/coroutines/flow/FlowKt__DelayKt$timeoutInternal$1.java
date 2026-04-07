package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downStream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", i = {0, 0}, l = {416}, m = "invokeSuspend", n = {"downStream", "values"}, s = {"L$0", "L$1"})
final class FlowKt__DelayKt$timeoutInternal$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_timeoutInternal;
    final /* synthetic */ long $timeout;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    FlowKt__DelayKt$timeoutInternal$1(long r2, kotlinx.coroutines.flow.Flow<? extends T> r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1> r5) {
            r1 = this;
            r1.$timeout = r2
            r1.$this_timeoutInternal = r4
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
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1
            long r1 = r4.$timeout
            kotlinx.coroutines.flow.Flow<T> r3 = r4.$this_timeoutInternal
            r0.<init>(r1, r3, r7)
            r0.L$0 = r5
            r0.L$1 = r6
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            r16 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r1 = r16
            int r2 = r1.label
            r3 = 0
            switch(r2) {
                case 0: goto L2b;
                case 1: goto L14;
                default: goto Lc;
            }
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L14:
            r2 = r16
            r4 = r17
            r5 = 0
            r6 = 0
            r7 = 0
            long r8 = r2.J$0
            java.lang.Object r10 = r2.L$1
            kotlinx.coroutines.channels.ReceiveChannel r10 = (kotlinx.coroutines.channels.ReceiveChannel) r10
            java.lang.Object r11 = r2.L$0
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            kotlin.ResultKt.throwOnFailure(r4)
            r1 = r4
            goto L99
        L2b:
            kotlin.ResultKt.throwOnFailure(r17)
            r2 = r16
            r4 = r17
            java.lang.Object r5 = r2.L$0
            kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
            java.lang.Object r6 = r2.L$1
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            long r7 = r2.$timeout
            kotlin.time.Duration$Companion r9 = kotlin.time.Duration.Companion
            long r9 = r9.m1582getZEROUwyO8pc()
            int r7 = kotlin.time.Duration.m1478compareToLRDsOJo(r7, r9)
            if (r7 <= 0) goto Lab
            kotlinx.coroutines.flow.Flow<T> r7 = r2.$this_timeoutInternal
            r8 = 0
            r9 = 2
            kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.buffer$default(r7, r8, r3, r9, r3)
            kotlinx.coroutines.channels.ReceiveChannel r5 = kotlinx.coroutines.flow.FlowKt.produceIn(r7, r5)
            long r7 = r2.$timeout
            r9 = 0
            r10 = r5
            r11 = r6
            r5 = r9
            r8 = r7
        L5b:
            r6 = 0
            kotlinx.coroutines.selects.SelectImplementation r7 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r12 = r2.getContext()
            r7.<init>(r12)
            r12 = 0
            r13 = r7
            kotlinx.coroutines.selects.SelectBuilder r13 = (kotlinx.coroutines.selects.SelectBuilder) r13
            r14 = 0
            kotlinx.coroutines.selects.SelectClause1 r15 = r10.getOnReceiveCatching()
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1
            r1.<init>(r11, r3)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r13.invoke(r15, r1)
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2
            r1.<init>(r8, r3)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            kotlinx.coroutines.selects.OnTimeoutKt.m1724onTimeout8Mi8wO0(r13, r8, r1)
            r2.L$0 = r11
            r2.L$1 = r10
            r2.J$0 = r8
            r1 = 1
            r2.label = r1
            java.lang.Object r1 = r7.doSelect(r2)
            if (r1 != r0) goto L95
            return r0
        L95:
            r7 = r4
            r4 = r1
            r1 = r7
            r7 = r12
        L99:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto La7
        La4:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        La7:
            r4 = r1
            r1 = r16
            goto L5b
        Lab:
            kotlinx.coroutines.TimeoutCancellationException r0 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r1 = "Timed out immediately"
            r0.<init>(r1)
            throw r0
    }
}
