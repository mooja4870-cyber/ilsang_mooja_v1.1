package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1"}, k = 1, mv = {1, 9, 0}, xi = 176)
public final class FlowKt__TransformKt$filterIsInstance$$inlined$filter$1 implements kotlinx.coroutines.flow.Flow<java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow $this_unsafeTransform$inlined;


    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Emitters.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Emitters.kt */
        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            java.lang.Object L$0;
            java.lang.Object L$1;
            int label;
            /* synthetic */ java.lang.Object result;
            final /* synthetic */ kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2 this$0;

            public AnonymousClass1(kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2 r1, kotlin.coroutines.Continuation r2) {
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
                    kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2 r0 = r3.this$0
                    r1 = 0
                    r2 = r3
                    kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                    java.lang.Object r0 = r0.emit(r1, r2)
                    return r0
            }
        }

        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector r1) {
                r0 = this;
                r0.$this_unsafeFlow = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                r8 = this;
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L14
                r0 = r10
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r10 = r0.label
                int r10 = r10 - r2
                r0.label = r10
                goto L19
            L14:
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1
                r0.<init>(r8, r10)
            L19:
                java.lang.Object r10 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                switch(r2) {
                    case 0: goto L31;
                    case 1: goto L2c;
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
                goto L52
            L31:
                kotlin.ResultKt.throwOnFailure(r10)
                r2 = r8
                kotlinx.coroutines.flow.FlowCollector r2 = r2.$this_unsafeFlow
                r3 = 0
                r4 = r0
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r4 = r9
                r5 = 0
                r6 = 3
                java.lang.String r7 = "R"
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r6, r7)
                boolean r4 = r4 instanceof java.lang.Object
                if (r4 == 0) goto L53
                r4 = 1
                r0.label = r4
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L51
                return r1
            L51:
                r9 = r3
            L52:
                goto L54
            L53:
            L54:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
        }

        public final java.lang.Object emit$$forInline(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                r8 = this;
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1
                r0.<init>(r8, r10)
                kotlinx.coroutines.flow.FlowCollector r0 = r8.$this_unsafeFlow
                r1 = r9
                r2 = r10
                r3 = 0
                r4 = r10
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r4 = r1
                r5 = 0
                r6 = 3
                java.lang.String r7 = "R"
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r6, r7)
                boolean r4 = r4 instanceof java.lang.Object
                if (r4 == 0) goto L1d
                r0.emit(r1, r10)
                goto L1e
            L1d:
            L1e:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    public FlowKt__TransformKt$filterIsInstance$$inlined$filter$1(kotlinx.coroutines.flow.Flow r1) {
            r0 = this;
            r0.$this_unsafeTransform$inlined = r1
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> r6, kotlin.coroutines.Continuation r7) {
            r5 = this;
            r0 = r6
            r1 = r7
            r2 = 0
            kotlinx.coroutines.flow.Flow r3 = r5.$this_unsafeTransform$inlined
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2 r4 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2
            r4.<init>(r0)
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            java.lang.Object r3 = r3.collect(r4, r7)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L1a
            return r3
        L1a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public java.lang.Object collect$$forInline(kotlinx.coroutines.flow.FlowCollector r6, kotlin.coroutines.Continuation r7) {
            r5 = this;
            kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$1
            r0.<init>(r5, r7)
            r0 = r6
            r1 = r7
            r2 = 0
            kotlinx.coroutines.flow.Flow r3 = r5.$this_unsafeTransform$inlined
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2 r4 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2
            r4.<init>(r0)
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            r3.collect(r4, r7)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
