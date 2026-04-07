package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 176)
public final class FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1<R> implements kotlinx.coroutines.flow.Flow<R> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow $this_unsafeTransform$inlined;
    final /* synthetic */ kotlin.jvm.functions.Function3 $transform$inlined;


    public FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(kotlinx.coroutines.flow.Flow r1, kotlin.jvm.functions.Function3 r2) {
            r0 = this;
            r0.$this_unsafeTransform$inlined = r1
            r0.$transform$inlined = r2
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super R> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            r6 = this;
            r0 = r7
            r1 = r8
            r2 = 0
            kotlinx.coroutines.flow.Flow r3 = r6.$this_unsafeTransform$inlined
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1 r4 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1
            kotlin.jvm.functions.Function3 r5 = r6.$transform$inlined
            r4.<init>(r5, r0)
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            java.lang.Object r3 = r3.collect(r4, r8)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L19
            return r3
        L19:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public java.lang.Object collect$$forInline(kotlinx.coroutines.flow.FlowCollector r7, kotlin.coroutines.Continuation r8) {
            r6 = this;
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1$1
            r0.<init>(r6, r8)
            r0 = r7
            r1 = r8
            r2 = 0
            kotlinx.coroutines.flow.Flow r3 = r6.$this_unsafeTransform$inlined
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1 r4 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1
            kotlin.jvm.functions.Function3 r5 = r6.$transform$inlined
            r4.<init>(r5, r0)
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            r3.collect(r4, r8)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
