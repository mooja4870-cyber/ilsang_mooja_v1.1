package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001ap\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00022D\u0010\u0005\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006¢\u0006\u0002\b\r2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0004\b\u000e\u0010\u000f\u001ag\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0011\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00112D\u0010\u0005\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u0012\u001aP\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0011\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00112-\u0010\u0005\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0014¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u0015\u001aP\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0011\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00112-\u0010\u0005\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0014¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u0015\u001ap\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0011\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00040\u00112D\b\u0005\u0010\u0017\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0002\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006¢\u0006\u0002\b\rH\u0086\b¢\u0006\u0002\u0010\u0012\u001ap\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0011\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00040\u00112D\b\u0005\u0010\u0017\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0002\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006¢\u0006\u0002\b\rH\u0081\b¢\u0006\u0002\u0010\u0012¨\u0006\u001b"}, d2 = {"ensureActive", "", "Lkotlinx/coroutines/flow/FlowCollector;", "invokeSafely", "T", "action", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "invokeSafely$FlowKt__EmittersKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCompletion", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "onEmpty", "Lkotlin/Function2;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "onStart", "transform", "R", "value", "unsafeTransform", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__EmittersKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1, reason: invalid class name */
    /* JADX INFO: compiled from: Emitters.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_transform;
        final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $transform;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Emitters.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 176)
        public static final class C00021<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $$this$flow;
            final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $transform;

            public C00021(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1, kotlinx.coroutines.flow.FlowCollector<? super R> r2) {
                    r0 = this;
                    r0.$transform = r1
                    r0.$$this$flow = r2
                    r0.<init>()
                    return
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                    if (r0 == 0) goto L14
                    r0 = r8
                    kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L14
                    int r8 = r0.label
                    int r8 = r8 - r2
                    r0.label = r8
                    goto L19
                L14:
                    kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                    r0.<init>(r6, r8)
                L19:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    switch(r2) {
                        case 0: goto L30;
                        case 1: goto L2c;
                        default: goto L24;
                    }
                L24:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L2c:
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L42
                L30:
                    kotlin.ResultKt.throwOnFailure(r8)
                    r2 = r6
                    kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r2.$transform
                    kotlinx.coroutines.flow.FlowCollector<R> r4 = r2.$$this$flow
                    r5 = 1
                    r0.label = r5
                    java.lang.Object r7 = r3.invoke(r4, r7, r0)
                    if (r7 != r1) goto L42
                    return r1
                L42:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
            }

            public final java.lang.Object emit$$forInline(T r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                    r2 = this;
                    kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                    r0.<init>(r2, r4)
                    kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r2.$transform
                    kotlinx.coroutines.flow.FlowCollector<R> r1 = r2.$$this$flow
                    r0.invoke(r1, r3, r4)
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
            }
        }

        public AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__EmittersKt.AnonymousClass1> r4) {
                r1 = this;
                r1.$this_transform = r2
                r1.$transform = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1
                kotlinx.coroutines.flow.Flow<T> r1 = r3.$this_transform
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r2 = r3.$transform
                r0.<init>(r1, r2, r5)
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
                kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt.AnonymousClass1) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                switch(r1) {
                    case 0: goto L16;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L11:
                r0 = r7
                kotlin.ResultKt.throwOnFailure(r8)
                goto L37
            L16:
                kotlin.ResultKt.throwOnFailure(r8)
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlinx.coroutines.flow.Flow<T> r3 = r1.$this_transform
                kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1 r4 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r5 = r1.$transform
                r4.<init>(r5, r2)
                kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r6 = 1
                r1.label = r6
                java.lang.Object r2 = r3.collect(r4, r5)
                if (r2 != r0) goto L36
                return r0
            L36:
                r0 = r1
            L37:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }

        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = r4.L$0
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                kotlinx.coroutines.flow.Flow<T> r1 = r4.$this_transform
                kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1 r2 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r4.$transform
                r2.<init>(r3, r0)
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                r3 = r4
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r1.collect(r2, r3)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    public static final /* synthetic */ java.lang.Object access$invokeSafely$FlowKt__EmittersKt(kotlinx.coroutines.flow.FlowCollector r1, kotlin.jvm.functions.Function3 r2, java.lang.Throwable r3, kotlin.coroutines.Continuation r4) {
            java.lang.Object r0 = invokeSafely$FlowKt__EmittersKt(r1, r2, r3, r4)
            return r0
    }

    public static final void ensureActive(kotlinx.coroutines.flow.FlowCollector<?> r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.flow.ThrowingCollector
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r1
            kotlinx.coroutines.flow.ThrowingCollector r0 = (kotlinx.coroutines.flow.ThrowingCollector) r0
            java.lang.Throwable r0 = r0.e
            throw r0
    }

    private static final <T> java.lang.Object invokeSafely$FlowKt__EmittersKt(kotlinx.coroutines.flow.FlowCollector<? super T> r3, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4, java.lang.Throwable r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L36;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L2c:
            java.lang.Object r3 = r0.L$0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L34
            goto L47
        L34:
            r4 = move-exception
            goto L4d
        L36:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L4b
            r2 = 1
            r0.label = r2     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r2 = r4.invoke(r3, r5, r0)     // Catch: java.lang.Throwable -> L4b
            if (r2 != r1) goto L46
            return r1
        L46:
            r3 = r5
        L47:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L4b:
            r4 = move-exception
            r3 = r5
        L4d:
            if (r3 == 0) goto L54
            if (r3 == r4) goto L54
            kotlin.ExceptionsKt.addSuppressed(r4, r3)
        L54:
            throw r4
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> onCompletion(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1
            r1.<init>(r2, r3)
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            return r1
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> onEmpty(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1
            r1.<init>(r2, r3)
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            return r1
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> onStart(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1
            r1.<init>(r3, r2)
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            return r1
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> transform(kotlinx.coroutines.flow.Flow<? extends T> r3, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1 r1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1
            r2 = 0
            r1.<init>(r3, r4, r2)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            kotlinx.coroutines.flow.Flow r1 = kotlinx.coroutines.flow.FlowKt.flow(r1)
            return r1
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> unsafeTransform(kotlinx.coroutines.flow.Flow<? extends T> r3, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4) {
            r0 = 0
            r1 = 0
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1 r2 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1
            r2.<init>(r3, r4)
            kotlinx.coroutines.flow.Flow r2 = (kotlinx.coroutines.flow.Flow) r2
            return r2
    }
}
