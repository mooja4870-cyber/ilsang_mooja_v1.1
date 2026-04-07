package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 176)
public final class FlowKt__LimitKt$collectWhile$collector$1<T> implements kotlinx.coroutines.flow.FlowCollector<T> {
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;

    public FlowKt__LimitKt$collectWhile$collector$1(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
            r0 = this;
            r0.$predicate = r1
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1
            if (r0 == 0) goto L14
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1
            r0.<init>(r5, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L36;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2c:
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r6 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1) r6
            kotlin.ResultKt.throwOnFailure(r7)
            r2 = r6
            r6 = r7
            goto L48
        L36:
            kotlin.ResultKt.throwOnFailure(r7)
            r2 = r5
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r3 = r2.$predicate
            r0.L$0 = r2
            r4 = 1
            r0.label = r4
            java.lang.Object r6 = r3.invoke(r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L53
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L53:
            kotlinx.coroutines.flow.internal.AbortFlowException r6 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r6.<init>(r2)
            throw r6
    }

    public java.lang.Object emit$$forInline(T r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1
            r0.<init>(r1, r3)
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r0 = r1.$predicate
            java.lang.Object r0 = r0.invoke(r2, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L16
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L16:
            kotlinx.coroutines.flow.internal.AbortFlowException r0 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r0.<init>(r1)
            throw r0
    }
}
