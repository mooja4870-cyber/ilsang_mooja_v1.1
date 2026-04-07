package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 176)
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$2<R> implements kotlinx.coroutines.flow.Flow<R> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow[] $flows$inlined;
    final /* synthetic */ kotlin.jvm.functions.Function2 $transform$inlined;


    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(kotlinx.coroutines.flow.Flow[] r1, kotlin.jvm.functions.Function2 r2) {
            r0 = this;
            r0.$flows$inlined = r1
            r0.$transform$inlined = r2
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super R> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            r8 = this;
            r0 = r9
            r1 = r10
            r2 = 0
            kotlinx.coroutines.flow.Flow[] r3 = r8.$flows$inlined
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$1 r4 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$1
            kotlinx.coroutines.flow.Flow[] r5 = r8.$flows$inlined
            r4.<init>(r5)
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2 r5 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2
            kotlin.jvm.functions.Function2 r6 = r8.$transform$inlined
            r7 = 0
            r5.<init>(r6, r7)
            kotlin.jvm.functions.Function3 r5 = (kotlin.jvm.functions.Function3) r5
            java.lang.Object r3 = kotlinx.coroutines.flow.internal.CombineKt.combineInternal(r0, r3, r4, r5, r10)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L29
            return r3
        L29:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public java.lang.Object collect$$forInline(kotlinx.coroutines.flow.FlowCollector r9, kotlin.coroutines.Continuation r10) {
            r8 = this;
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2$1
            r0.<init>(r8, r10)
            r0 = r9
            r1 = r10
            r2 = 0
            kotlinx.coroutines.flow.Flow[] r3 = r8.$flows$inlined
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$1 r4 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$1
            kotlinx.coroutines.flow.Flow[] r5 = r8.$flows$inlined
            r4.<init>(r5)
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2 r5 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2
            kotlin.jvm.functions.Function2 r6 = r8.$transform$inlined
            r7 = 0
            r5.<init>(r6, r7)
            kotlin.jvm.functions.Function3 r5 = (kotlin.jvm.functions.Function3) r5
            kotlinx.coroutines.flow.internal.CombineKt.combineInternal(r0, r3, r4, r5, r10)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
