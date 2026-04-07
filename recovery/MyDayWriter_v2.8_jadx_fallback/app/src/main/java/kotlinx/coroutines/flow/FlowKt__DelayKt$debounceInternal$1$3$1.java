package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
final class FlowKt__DelayKt$debounceInternal$1$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $downstream;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $lastValue;
    int label;

    FlowKt__DelayKt$debounceInternal$1$3$1(kotlinx.coroutines.flow.FlowCollector<? super T> r2, kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1> r4) {
            r1 = this;
            r1.$downstream = r2
            r1.$lastValue = r3
            r0 = 1
            r1.<init>(r0, r4)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> r4) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1
            kotlinx.coroutines.flow.FlowCollector<T> r1 = r3.$downstream
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r3.$lastValue
            r0.<init>(r1, r2, r4)
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r1 = this;
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r1.invoke2(r2)
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r2 = this;
            kotlin.coroutines.Continuation r0 = r2.create(r3)
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 r0 = (kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 0
            switch(r1) {
                case 0: goto L17;
                case 1: goto L12;
                default: goto La;
            }
        La:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L12:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L36
        L17:
            kotlin.ResultKt.throwOnFailure(r8)
            r1 = r7
            kotlinx.coroutines.flow.FlowCollector<T> r3 = r1.$downstream
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r5 = r1.$lastValue
            T r5 = r5.element
            r6 = 0
            if (r5 != r4) goto L28
            r5 = r2
        L28:
            r4 = r1
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r6 = 1
            r1.label = r6
            java.lang.Object r3 = r3.emit(r5, r4)
            if (r3 != r0) goto L35
            return r0
        L35:
            r0 = r1
        L36:
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r1 = r0.$lastValue
            r1.element = r2
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
