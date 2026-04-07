package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class FlowKt__LimitKt$dropWhile$1$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef $matched;
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $this_unsafeFlow;

    FlowKt__LimitKt$dropWhile$1$1(kotlin.jvm.internal.Ref.BooleanRef r1, kotlinx.coroutines.flow.FlowCollector<? super T> r2, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3) {
            r0 = this;
            r0.$matched = r1
            r0.$this_unsafeFlow = r2
            r0.$predicate = r3
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            r0.<init>(r6, r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            switch(r2) {
                case 0: goto L3c;
                case 1: goto L38;
                case 2: goto L2d;
                case 3: goto L38;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2d:
            java.lang.Object r7 = r0.L$1
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1) r2
            kotlin.ResultKt.throwOnFailure(r8)
            r4 = r8
            goto L64
        L38:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L51
        L3c:
            kotlin.ResultKt.throwOnFailure(r8)
            r2 = r6
            kotlin.jvm.internal.Ref$BooleanRef r4 = r2.$matched
            boolean r4 = r4.element
            if (r4 == 0) goto L54
            kotlinx.coroutines.flow.FlowCollector<T> r4 = r2.$this_unsafeFlow
            r0.label = r3
            java.lang.Object r7 = r4.emit(r7, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L54:
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r4 = r2.$predicate
            r0.L$0 = r2
            r0.L$1 = r7
            r5 = 2
            r0.label = r5
            java.lang.Object r4 = r4.invoke(r7, r0)
            if (r4 != r1) goto L64
            return r1
        L64:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L81
            kotlin.jvm.internal.Ref$BooleanRef r4 = r2.$matched
            r4.element = r3
            kotlinx.coroutines.flow.FlowCollector<T> r3 = r2.$this_unsafeFlow
            r4 = 0
            r0.L$0 = r4
            r0.L$1 = r4
            r4 = 3
            r0.label = r4
            java.lang.Object r7 = r3.emit(r7, r0)
            if (r7 != r1) goto L51
            return r1
        L81:
            goto L51
    }
}
