package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "value", "Lkotlinx/coroutines/channels/ChannelResult;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {236}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
final class FlowKt__DelayKt$debounceInternal$1$3$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ChannelResult<? extends java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $downstream;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $lastValue;
    /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    FlowKt__DelayKt$debounceInternal$1$3$2(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r2, kotlinx.coroutines.flow.FlowCollector<? super T> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2> r4) {
            r1 = this;
            r1.$lastValue = r2
            r1.$downstream = r3
            r0 = 2
            r1.<init>(r0, r4)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r1 = r3.$lastValue
            kotlinx.coroutines.flow.FlowCollector<T> r2 = r3.$downstream
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
            java.lang.Object r0 = r2.m1693invokeWpGqRn0(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final java.lang.Object m1693invokeWpGqRn0(java.lang.Object r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlinx.coroutines.channels.ChannelResult r0 = kotlinx.coroutines.channels.ChannelResult.m1667boximpl(r3)
            kotlin.coroutines.Continuation r0 = r2.create(r0, r4)
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r0 = (kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.label
            switch(r1) {
                case 0: goto L1e;
                case 1: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L11:
            r0 = r11
            r1 = 0
            r2 = 0
            java.lang.Object r3 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            java.lang.Object r4 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r12)
            goto L6a
        L1e:
            kotlin.ResultKt.throwOnFailure(r12)
            r1 = r11
            java.lang.Object r2 = r1.L$0
            kotlinx.coroutines.channels.ChannelResult r2 = (kotlinx.coroutines.channels.ChannelResult) r2
            java.lang.Object r2 = r2.m1679unboximpl()
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r3 = r1.$lastValue
            r4 = 0
            boolean r5 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r5 != 0) goto L37
            r5 = r2
            r6 = 0
            r3.element = r5
        L37:
            r4 = r2
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r3 = r1.$lastValue
            kotlinx.coroutines.flow.FlowCollector<T> r2 = r1.$downstream
            r5 = 0
            boolean r6 = r4 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r6 == 0) goto L74
            java.lang.Throwable r6 = kotlinx.coroutines.channels.ChannelResult.m1671exceptionOrNullimpl(r4)
            r7 = 0
            if (r6 != 0) goto L72
            T r6 = r3.element
            if (r6 == 0) goto L6d
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            T r8 = r3.element
            r9 = 0
            if (r8 != r6) goto L59
            r10 = 0
            r8 = r10
        L59:
            r1.L$0 = r4
            r1.L$1 = r3
            r6 = 1
            r1.label = r6
            java.lang.Object r2 = r2.emit(r8, r1)
            if (r2 != r0) goto L67
            return r0
        L67:
            r0 = r1
            r1 = r5
            r2 = r7
        L6a:
            r5 = r1
            r7 = r2
            r1 = r0
        L6d:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE
            r3.element = r0
            goto L74
        L72:
            r0 = 0
            throw r6
        L74:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
