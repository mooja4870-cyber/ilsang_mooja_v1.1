package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "result", "Lkotlinx/coroutines/channels/ChannelResult;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class FlowKt__DelayKt$sample$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ChannelResult<? extends java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $lastValue;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> $ticker;
    /* synthetic */ java.lang.Object L$0;
    int label;

    FlowKt__DelayKt$sample$2$1$1(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r2, kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1> r4) {
            r1 = this;
            r1.$lastValue = r2
            r1.$ticker = r3
            r0 = 2
            r1.<init>(r0, r4)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r1 = r3.$lastValue
            kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> r2 = r3.$ticker
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ChannelResult<? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            r0 = r3
            kotlinx.coroutines.channels.ChannelResult r0 = (kotlinx.coroutines.channels.ChannelResult) r0
            java.lang.Object r0 = r0.m1679unboximpl()
            r1 = r4
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r0 = r2.m1694invokeWpGqRn0(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final java.lang.Object m1694invokeWpGqRn0(java.lang.Object r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlinx.coroutines.channels.ChannelResult r0 = kotlinx.coroutines.channels.ChannelResult.m1667boximpl(r3)
            kotlin.coroutines.Continuation r0 = r2.create(r0, r4)
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r8.label
            switch(r0) {
                case 0: goto L10;
                default: goto L8;
            }
        L8:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L10:
            kotlin.ResultKt.throwOnFailure(r9)
            r0 = r8
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.channels.ChannelResult r1 = (kotlinx.coroutines.channels.ChannelResult) r1
            java.lang.Object r1 = r1.m1679unboximpl()
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r0.$lastValue
            r3 = 0
            boolean r4 = r1 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r4 != 0) goto L29
            r4 = r1
            r5 = 0
            r2.element = r4
        L29:
            kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> r2 = r0.$ticker
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r3 = r0.$lastValue
            r4 = 0
            boolean r5 = r1 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r5 == 0) goto L4e
            java.lang.Throwable r5 = kotlinx.coroutines.channels.ChannelResult.m1671exceptionOrNullimpl(r1)
            r6 = 0
            if (r5 != 0) goto L4b
            kotlinx.coroutines.flow.internal.ChildCancelledException r7 = new kotlinx.coroutines.flow.internal.ChildCancelledException
            r7.<init>()
            java.util.concurrent.CancellationException r7 = (java.util.concurrent.CancellationException) r7
            r2.cancel(r7)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE
            r3.element = r2
            goto L4e
        L4b:
            r1 = r5
            r2 = 0
            throw r1
        L4e:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
