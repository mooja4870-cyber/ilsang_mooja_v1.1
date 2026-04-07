package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1"}, k = 1, mv = {1, 9, 0}, xi = 176)
public final class FlowKt__TransformKt$filter$$inlined$unsafeTransform$1<T> implements kotlinx.coroutines.flow.Flow<T> {
    final /* synthetic */ kotlin.jvm.functions.Function2 $predicate$inlined;
    final /* synthetic */ kotlinx.coroutines.flow.Flow $this_unsafeTransform$inlined;


    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Emitters.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlin.jvm.functions.Function2 $predicate$inlined;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Emitters.kt */
        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {219, 219}, m = "emit", n = {"value", "$this$filter_u24lambda_u240"}, s = {"L$0", "L$1"})
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            java.lang.Object L$0;
            java.lang.Object L$1;
            int label;
            /* synthetic */ java.lang.Object result;
            final /* synthetic */ kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2 this$0;

            public AnonymousClass1(kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2 r1, kotlin.coroutines.Continuation r2) {
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
                    kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2 r0 = r3.this$0
                    r1 = 0
                    r2 = r3
                    kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                    java.lang.Object r0 = r0.emit(r1, r2)
                    return r0
            }
        }

        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector r1, kotlin.jvm.functions.Function2 r2) {
                r0 = this;
                r0.$this_unsafeFlow = r1
                r0.$predicate$inlined = r2
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(T r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
                r8 = this;
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L14
                r0 = r10
                kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r10 = r0.label
                int r10 = r10 - r2
                r0.label = r10
                goto L19
            L14:
                kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1
                r0.<init>(r8, r10)
            L19:
                java.lang.Object r10 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                switch(r2) {
                    case 0: goto L3f;
                    case 1: goto L31;
                    case 2: goto L2c;
                    default: goto L24;
                }
            L24:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L2c:
                r9 = 0
                kotlin.ResultKt.throwOnFailure(r10)
                goto L73
            L31:
                r9 = 0
                java.lang.Object r2 = r0.L$1
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                java.lang.Object r3 = r0.L$0
                kotlin.ResultKt.throwOnFailure(r10)
                r4 = r3
                r3 = r2
                r2 = r10
                goto L5c
            L3f:
                kotlin.ResultKt.throwOnFailure(r10)
                r2 = r8
                kotlinx.coroutines.flow.FlowCollector r3 = r2.$this_unsafeFlow
                r4 = r0
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r4 = 0
                kotlin.jvm.functions.Function2 r5 = r2.$predicate$inlined
                r0.L$0 = r9
                r0.L$1 = r3
                r6 = 1
                r0.label = r6
                java.lang.Object r2 = r5.invoke(r9, r0)
                if (r2 != r1) goto L59
                return r1
            L59:
                r7 = r4
                r4 = r9
                r9 = r7
            L5c:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L74
                r2 = 0
                r0.L$0 = r2
                r0.L$1 = r2
                r2 = 2
                r0.label = r2
                java.lang.Object r2 = r3.emit(r4, r0)
                if (r2 != r1) goto L73
                return r1
            L73:
                goto L75
            L74:
            L75:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
        }

        public final java.lang.Object emit$$forInline(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                r5 = this;
                kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1
                r0.<init>(r5, r7)
                kotlinx.coroutines.flow.FlowCollector r0 = r5.$this_unsafeFlow
                r1 = r6
                r2 = r7
                r3 = 0
                kotlin.jvm.functions.Function2 r4 = r5.$predicate$inlined
                java.lang.Object r4 = r4.invoke(r1, r7)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L1c
                r0.emit(r1, r7)
                goto L1d
            L1c:
            L1d:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    public FlowKt__TransformKt$filter$$inlined$unsafeTransform$1(kotlinx.coroutines.flow.Flow r1, kotlin.jvm.functions.Function2 r2) {
            r0 = this;
            r0.$this_unsafeTransform$inlined = r1
            r0.$predicate$inlined = r2
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r7, kotlin.coroutines.Continuation r8) {
            r6 = this;
            r0 = r7
            r1 = r8
            r2 = 0
            kotlinx.coroutines.flow.Flow r3 = r6.$this_unsafeTransform$inlined
            kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2 r4 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2
            kotlin.jvm.functions.Function2 r5 = r6.$predicate$inlined
            r4.<init>(r0, r5)
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
            kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$1
            r0.<init>(r6, r8)
            r0 = r7
            r1 = r8
            r2 = 0
            kotlinx.coroutines.flow.Flow r3 = r6.$this_unsafeTransform$inlined
            kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2 r4 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2
            kotlin.jvm.functions.Function2 r5 = r6.$predicate$inlined
            r4.<init>(r0, r5)
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            r3.collect(r4, r8)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
