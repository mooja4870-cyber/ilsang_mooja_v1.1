package kotlinx.coroutines.flow.internal;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
final class ChannelFlow$collectToFun$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlow<T> this$0;

    ChannelFlow$collectToFun$1(kotlinx.coroutines.flow.internal.ChannelFlow<T> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1> r3) {
            r1 = this;
            r1.this$0 = r2
            r0 = 2
            r1.<init>(r0, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1
            kotlinx.coroutines.flow.internal.ChannelFlow<T> r1 = r2.this$0
            r0.<init>(r1, r4)
            r0.L$0 = r3
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r0 = r1.invoke(r2, r3)
            return r0
    }

    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super T> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
            kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1) r0
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
            java.lang.Object r2 = r1.L$0
            kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
            kotlinx.coroutines.flow.internal.ChannelFlow<T> r3 = r1.this$0
            r4 = r1
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5 = 1
            r1.label = r5
            java.lang.Object r2 = r3.collectTo(r2, r4)
            if (r2 != r0) goto L2d
            return r0
        L2d:
            r0 = r1
        L2e:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
