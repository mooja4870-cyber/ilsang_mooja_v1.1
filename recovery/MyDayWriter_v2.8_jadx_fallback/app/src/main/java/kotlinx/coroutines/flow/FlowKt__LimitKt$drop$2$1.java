package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class FlowKt__LimitKt$drop$2$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ int $count;
    final /* synthetic */ kotlin.jvm.internal.Ref.IntRef $skipped;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $this_unsafeFlow;

    FlowKt__LimitKt$drop$2$1(kotlin.jvm.internal.Ref.IntRef r1, int r2, kotlinx.coroutines.flow.FlowCollector<? super T> r3) {
            r0 = this;
            r0.$skipped = r1
            r0.$count = r2
            r0.$this_unsafeFlow = r3
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
            r0.<init>(r6, r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L30;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2c:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L48
        L30:
            kotlin.ResultKt.throwOnFailure(r8)
            r2 = r6
            kotlin.jvm.internal.Ref$IntRef r3 = r2.$skipped
            int r3 = r3.element
            int r4 = r2.$count
            r5 = 1
            if (r3 < r4) goto L4b
            kotlinx.coroutines.flow.FlowCollector<T> r3 = r2.$this_unsafeFlow
            r0.label = r5
            java.lang.Object r7 = r3.emit(r7, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L4b:
            kotlin.jvm.internal.Ref$IntRef r7 = r2.$skipped
            kotlin.jvm.internal.Ref$IntRef r1 = r2.$skipped
            int r1 = r1.element
            int r1 = r1 + r5
            r7.element = r1
            kotlin.jvm.internal.Ref$IntRef r7 = r2.$skipped
            int r7 = r7.element
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }
}
