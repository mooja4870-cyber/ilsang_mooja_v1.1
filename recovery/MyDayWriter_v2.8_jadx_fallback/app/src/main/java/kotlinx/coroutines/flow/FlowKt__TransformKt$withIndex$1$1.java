package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Transform.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class FlowKt__TransformKt$withIndex$1$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.IntRef $index;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<kotlin.collections.IndexedValue<? extends T>> $this_unsafeFlow;

    FlowKt__TransformKt$withIndex$1$1(kotlinx.coroutines.flow.FlowCollector<? super kotlin.collections.IndexedValue<? extends T>> r1, kotlin.jvm.internal.Ref.IntRef r2) {
            r0 = this;
            r0.$this_unsafeFlow = r1
            r0.$index = r2
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(T r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1
            if (r0 == 0) goto L14
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1
            r0.<init>(r8, r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L30;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2c:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L53
        L30:
            kotlin.ResultKt.throwOnFailure(r10)
            r2 = r8
            kotlinx.coroutines.flow.FlowCollector<kotlin.collections.IndexedValue<? extends T>> r3 = r2.$this_unsafeFlow
            kotlin.collections.IndexedValue r4 = new kotlin.collections.IndexedValue
            kotlin.jvm.internal.Ref$IntRef r5 = r2.$index
            int r5 = r5.element
            kotlin.jvm.internal.Ref$IntRef r6 = r2.$index
            int r7 = r5 + 1
            r6.element = r7
            r2 = 0
            if (r5 < 0) goto L56
        L46:
            r4.<init>(r5, r9)
            r2 = 1
            r0.label = r2
            java.lang.Object r9 = r3.emit(r4, r0)
            if (r9 != r1) goto L53
            return r1
        L53:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L56:
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            java.lang.String r1 = "Index overflow has happened"
            r9.<init>(r1)
            throw r9
    }
}
