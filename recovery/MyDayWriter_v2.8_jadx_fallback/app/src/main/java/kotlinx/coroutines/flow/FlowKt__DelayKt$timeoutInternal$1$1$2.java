package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<?>, java.lang.Object> {
    final /* synthetic */ long $timeout;
    int label;

    FlowKt__DelayKt$timeoutInternal$1$1$2(long r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2> r4) {
            r1 = this;
            r1.$timeout = r2
            r0 = 1
            r1.<init>(r0, r4)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> r4) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2
            long r1 = r3.$timeout
            r0.<init>(r1, r4)
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<?> r2) {
            r1 = this;
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r1.invoke2(r2)
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlin.coroutines.Continuation<?> r3) {
            r2 = this;
            kotlin.coroutines.Continuation r0 = r2.create(r3)
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2 r0 = (kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            r5 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            switch(r0) {
                case 0: goto L10;
                default: goto L8;
            }
        L8:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L10:
            kotlin.ResultKt.throwOnFailure(r6)
            r0 = r5
            kotlinx.coroutines.TimeoutCancellationException r1 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Timed out waiting for "
            java.lang.StringBuilder r2 = r2.append(r3)
            long r3 = r0.$timeout
            java.lang.String r3 = kotlin.time.Duration.m1528toStringimpl(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
