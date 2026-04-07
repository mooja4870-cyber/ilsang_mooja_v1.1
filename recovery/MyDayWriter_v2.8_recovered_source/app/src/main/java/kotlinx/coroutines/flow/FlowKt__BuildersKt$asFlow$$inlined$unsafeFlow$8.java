package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8 implements kotlinx.coroutines.flow.Flow<java.lang.Long> {
    final /* synthetic */ long[] $this_asFlow$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", f = "Builders.kt", i = {0, 0}, l = {114}, m = "collect", n = {"$this$asFlow_u24lambda_u2415", "$this$forEach$iv"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8 this$0;

        public AnonymousClass1(kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8 r1, kotlin.coroutines.Continuation r2) {
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
                kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8 r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.collect(r1, r2)
                return r0
        }
    }

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(long[] r1) {
            r0 = this;
            r0.$this_asFlow$inlined = r1
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Long> r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
            r12 = this;
            boolean r0 = r14 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1 r0 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1
            r0.<init>(r12, r14)
        L19:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            switch(r2) {
                case 0: goto L40;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2d:
            r13 = 0
            r2 = 0
            r4 = 0
            int r5 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$1
            long[] r7 = (long[]) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            kotlin.ResultKt.throwOnFailure(r14)
            goto L6e
        L40:
            kotlin.ResultKt.throwOnFailure(r14)
            r2 = r12
            r4 = r0
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r4 = 0
            long[] r2 = r2.$this_asFlow$inlined
            r5 = 0
            int r6 = r2.length
            r7 = 0
            r8 = r7
            r7 = r2
            r2 = r5
            r5 = r6
            r6 = r8
            r8 = r13
            r13 = r4
        L54:
            if (r6 >= r5) goto L71
            r9 = r7[r6]
            r4 = 0
            java.lang.Long r11 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
            r0.L$0 = r8
            r0.L$1 = r7
            r0.I$0 = r6
            r0.I$1 = r5
            r0.label = r3
            java.lang.Object r9 = r8.emit(r11, r0)
            if (r9 != r1) goto L6e
            return r1
        L6e:
            int r6 = r6 + r3
            goto L54
        L71:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
    }
}
