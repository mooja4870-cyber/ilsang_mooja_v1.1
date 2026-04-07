package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
final class ChannelLimitedFlowMerge$collectTo$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.internal.SendingCollector<T> $collector;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $flow;
    int label;

    ChannelLimitedFlowMerge$collectTo$2$1(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlinx.coroutines.flow.internal.SendingCollector<T> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1> r4) {
            r1 = this;
            r1.$flow = r2
            r1.$collector = r3
            r0 = 2
            r1.<init>(r0, r4)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1 r0 = new kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1
            kotlinx.coroutines.flow.Flow<T> r1 = r3.$flow
            kotlinx.coroutines.flow.internal.SendingCollector<T> r2 = r3.$collector
            r0.<init>(r1, r2, r5)
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
            kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1 r0 = (kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1) r0
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
            goto L2e
        L16:
            kotlin.ResultKt.throwOnFailure(r7)
            r1 = r6
            kotlinx.coroutines.flow.Flow<T> r2 = r1.$flow
            kotlinx.coroutines.flow.internal.SendingCollector<T> r3 = r1.$collector
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            r4 = r1
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5 = 1
            r1.label = r5
            java.lang.Object r2 = r2.collect(r3, r4)
            if (r2 != r0) goto L2d
            return r0
        L2d:
            r0 = r1
        L2e:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
