package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1<T> implements kotlinx.coroutines.flow.Flow<T> {
    final /* synthetic */ int $count$inlined;
    final /* synthetic */ kotlinx.coroutines.flow.Flow $this_take$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {115}, m = "collect", n = {"ownershipMarker"}, s = {"L$0"})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1 this$0;

        public AnonymousClass1(kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1 r1, kotlin.coroutines.Continuation r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                r3.result = r4
                int r0 = r3.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r3.label = r0
                kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1 r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.collect(r1, r2)
                return r0
        }
    }

    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1(kotlinx.coroutines.flow.Flow r1, int r2) {
            r0 = this;
            r0.$this_take$inlined = r1
            r0.$count$inlined = r2
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            r9 = this;
            boolean r0 = r11 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r11
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1
            r0.<init>(r9, r11)
        L19:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L35;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2c:
            r10 = 0
            java.lang.Object r1 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L33
            goto L61
        L33:
            r2 = move-exception
            goto L65
        L35:
            kotlin.ResultKt.throwOnFailure(r11)
            r2 = r9
            r3 = r0
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r3 = 0
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            kotlinx.coroutines.flow.Flow r6 = r2.$this_take$inlined     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1 r7 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            int r8 = r2.$count$inlined     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r7.<init>(r5, r8, r10, r4)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.L$0 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r8 = 1
            r0.label = r8     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            java.lang.Object r6 = r6.collect(r7, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            if (r6 != r1) goto L5f
            return r1
        L5f:
            r10 = r3
            r1 = r4
        L61:
            goto L68
        L62:
            r2 = move-exception
            r10 = r3
            r1 = r4
        L65:
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r2, r1)
        L68:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
    }
}
