package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow[] $flows;
    final /* synthetic */ kotlin.jvm.functions.Function6 $transform$inlined;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1, reason: invalid class name */
    /* JADX INFO: compiled from: Zip.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", f = "Zip.kt", i = {}, l = {329}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, java.lang.Object[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function6 $transform$inlined;
        private /* synthetic */ java.lang.Object L$0;
        /* synthetic */ java.lang.Object L$1;
        int label;

        public AnonymousClass1(kotlin.coroutines.Continuation r1, kotlin.jvm.functions.Function6 r2) {
                r0 = this;
                r0.$transform$inlined = r2
                r2 = 3
                r0.<init>(r2, r1)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, java.lang.Object[] r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r1 = this;
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                java.lang.Object[] r3 = (java.lang.Object[]) r3
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                java.lang.Object r0 = r1.invoke(r2, r3, r4)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> r3, java.lang.Object[] r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                r2 = this;
                kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1
                kotlin.jvm.functions.Function6 r1 = r2.$transform$inlined
                r0.<init>(r5, r1)
                r0.L$0 = r3
                r0.L$1 = r4
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                switch(r1) {
                    case 0: goto L17;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L11:
                r0 = r11
                r1 = 0
                kotlin.ResultKt.throwOnFailure(r12)
                goto L45
            L17:
                kotlin.ResultKt.throwOnFailure(r12)
                r8 = r11
                java.lang.Object r1 = r8.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                java.lang.Object r2 = r8.L$1
                java.lang.Object[] r2 = (java.lang.Object[]) r2
                r3 = r8
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r3 = r1
                r1 = 0
                r4 = r2
                kotlin.jvm.functions.Function6 r2 = r8.$transform$inlined
                r5 = 0
                r5 = r4[r5]
                r6 = 1
                r7 = r4
                r4 = r5
                r5 = r7[r6]
                r9 = 2
                r9 = r7[r9]
                r10 = 3
                r10 = r7[r10]
                r8.label = r6
                r6 = r9
                r7 = r10
                java.lang.Object r2 = r2.invoke(r3, r4, r5, r6, r7, r8)
                if (r2 != r0) goto L44
                return r0
            L44:
                r0 = r8
            L45:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    public FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4(kotlinx.coroutines.flow.Flow[] r1, kotlin.coroutines.Continuation r2, kotlin.jvm.functions.Function6 r3) {
            r0 = this;
            r0.$flows = r1
            r0.$transform$inlined = r3
            r3 = 2
            r0.<init>(r3, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4
            kotlinx.coroutines.flow.Flow[] r1 = r3.$flows
            kotlin.jvm.functions.Function6 r2 = r3.$transform$inlined
            r0.<init>(r1, r5, r2)
            r0.L$0 = r4
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r0 = r1.invoke(r2, r3)
            return r0
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4 r0 = (kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            switch(r1) {
                case 0: goto L16;
                case 1: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L11:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L3c
        L16:
            kotlin.ResultKt.throwOnFailure(r9)
            r1 = r8
            java.lang.Object r2 = r1.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlinx.coroutines.flow.Flow[] r3 = r1.$flows
            kotlin.jvm.functions.Function0 r4 = kotlinx.coroutines.flow.FlowKt__ZipKt.access$nullArrayFactory()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1 r5 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1
            r6 = 0
            kotlin.jvm.functions.Function6 r7 = r1.$transform$inlined
            r5.<init>(r6, r7)
            kotlin.jvm.functions.Function3 r5 = (kotlin.jvm.functions.Function3) r5
            r6 = r1
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r7 = 1
            r1.label = r7
            java.lang.Object r2 = kotlinx.coroutines.flow.internal.CombineKt.combineInternal(r2, r3, r4, r5, r6)
            if (r2 != r0) goto L3b
            return r0
        L3b:
            r0 = r1
        L3c:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
