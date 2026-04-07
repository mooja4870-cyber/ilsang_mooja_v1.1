package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "value", "Lkotlinx/coroutines/channels/ChannelResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", i = {0}, l = {395}, m = "invokeSuspend", n = {"$this$onSuccess_u2dWpGqRn0$iv"}, s = {"L$0"})
final class FlowKt__DelayKt$timeoutInternal$1$1$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ChannelResult<? extends T>, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $downStream;
    /* synthetic */ java.lang.Object L$0;
    int label;

    FlowKt__DelayKt$timeoutInternal$1$1$1(kotlinx.coroutines.flow.FlowCollector<? super T> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1> r3) {
            r1 = this;
            r1.$downStream = r2
            r0 = 2
            r1.<init>(r0, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1
            kotlinx.coroutines.flow.FlowCollector<T> r1 = r2.$downStream
            r0.<init>(r1, r4)
            r0.L$0 = r3
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3, kotlin.coroutines.Continuation<? super java.lang.Boolean> r4) {
            r2 = this;
            r0 = r3
            kotlinx.coroutines.channels.ChannelResult r0 = (kotlinx.coroutines.channels.ChannelResult) r0
            java.lang.Object r0 = r0.m1679unboximpl()
            r1 = r4
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r0 = r2.m1695invokeWpGqRn0(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final java.lang.Object m1695invokeWpGqRn0(java.lang.Object r3, kotlin.coroutines.Continuation<? super java.lang.Boolean> r4) {
            r2 = this;
            kotlinx.coroutines.channels.ChannelResult r0 = kotlinx.coroutines.channels.ChannelResult.m1667boximpl(r3)
            kotlin.coroutines.Continuation r0 = r2.create(r0, r4)
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 1
            switch(r1) {
                case 0: goto L1b;
                case 1: goto L12;
                default: goto La;
            }
        La:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L12:
            r0 = r8
            r1 = 0
            r3 = 0
            java.lang.Object r4 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L40
        L1b:
            kotlin.ResultKt.throwOnFailure(r9)
            r1 = r8
            java.lang.Object r3 = r1.L$0
            kotlinx.coroutines.channels.ChannelResult r3 = (kotlinx.coroutines.channels.ChannelResult) r3
            java.lang.Object r3 = r3.m1679unboximpl()
            kotlinx.coroutines.flow.FlowCollector<T> r4 = r1.$downStream
            r5 = 0
            boolean r6 = r3 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r6 != 0) goto L43
            r6 = r3
            r7 = 0
            r1.L$0 = r3
            r1.label = r2
            java.lang.Object r4 = r4.emit(r6, r1)
            if (r4 != r0) goto L3c
            return r0
        L3c:
            r0 = r1
            r4 = r3
            r1 = r5
            r3 = r7
        L40:
            r5 = r1
            r3 = r4
            r1 = r0
        L43:
            r0 = 0
            boolean r4 = r3 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            if (r4 == 0) goto L5b
            java.lang.Throwable r2 = kotlinx.coroutines.channels.ChannelResult.m1671exceptionOrNullimpl(r3)
            r4 = 0
            if (r2 != 0) goto L58
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r5
        L58:
            r5 = r2
            r6 = 0
            throw r5
        L5b:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            return r0
    }
}
