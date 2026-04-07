package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001aS\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u000223\b\u0004\u0010\u0005\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006H\u0087H¢\u0006\u0002\u0010\f\u001ah\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00022H\b\u0004\u0010\u0005\u001aB\b\u0001\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000eH\u0086H¢\u0006\u0002\u0010\u0011\u001aQ\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u000221\u0010\u0005\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006H\u0086@¢\u0006\u0002\u0010\f\u001a,\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0002H\u0086@¢\u0006\u0002\u0010\u0016\u001a\u001e\u0010\u0017\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00022\u0006\u0010\u0019\u001a\u00020\u001a¨\u0006\u001b"}, d2 = {"collect", "", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectIndexed", "Lkotlin/Function3;", "", "index", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectLatest", "emitAll", "Lkotlinx/coroutines/flow/FlowCollector;", "flow", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchIn", "Lkotlinx/coroutines/Job;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__CollectKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3, reason: invalid class name */
    /* JADX INFO: compiled from: Collect.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass3<T> implements kotlinx.coroutines.flow.FlowCollector<T> {
        final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $action;

        public AnonymousClass3(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
                r0 = this;
                r0.$action = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public java.lang.Object emit(T r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r2.$action
                java.lang.Object r0 = r0.invoke(r3, r4)
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r0 != r1) goto Ld
                return r0
            Ld:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }

        public java.lang.Object emit$$forInline(T r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1
                r0.<init>(r1, r3)
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r1.$action
                r0.invoke(r2, r3)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2, reason: invalid class name */
    /* JADX INFO: compiled from: Collect.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2", "Lkotlinx/coroutines/flow/FlowCollector;", "index", "", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector<T> {
        final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $action;
        private int index;

        public AnonymousClass2(kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
                r0 = this;
                r0.$action = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public java.lang.Object emit(T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                r4 = this;
                kotlin.jvm.functions.Function3<java.lang.Integer, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r4.$action
                int r1 = r4.index
                int r2 = r1 + 1
                r4.index = r2
                r2 = 0
                if (r1 < 0) goto L1e
            Lc:
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
                java.lang.Object r0 = r0.invoke(r1, r5, r6)
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r0 != r1) goto L1b
                return r0
            L1b:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L1e:
                java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
                java.lang.String r3 = "Index overflow has happened"
                r0.<init>(r3)
                throw r0
        }

        public java.lang.Object emit$$forInline(T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                r4 = this;
                kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1
                r0.<init>(r4, r6)
                kotlin.jvm.functions.Function3<java.lang.Integer, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r4.$action
                int r1 = r4.index
                int r2 = r1 + 1
                r4.index = r2
                r2 = 0
                if (r1 < 0) goto L1b
            L11:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.invoke(r1, r5, r6)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L1b:
                java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
                java.lang.String r3 = "Index overflow has happened"
                r0.<init>(r3)
                throw r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1, reason: invalid class name */
    /* JADX INFO: compiled from: Collect.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_launchIn;
        int label;

        AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__CollectKt.AnonymousClass1> r3) {
                r1 = this;
                r1.$this_launchIn = r2
                r0 = 2
                r1.<init>(r0, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1 r0 = new kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1
                kotlinx.coroutines.flow.Flow<T> r1 = r2.$this_launchIn
                r0.<init>(r1, r4)
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1 r0 = (kotlinx.coroutines.flow.FlowKt__CollectKt.AnonymousClass1) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                switch(r1) {
                    case 0: goto L16;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L11:
                r0 = r5
                kotlin.ResultKt.throwOnFailure(r6)
                goto L2a
            L16:
                kotlin.ResultKt.throwOnFailure(r6)
                r1 = r5
                kotlinx.coroutines.flow.Flow<T> r2 = r1.$this_launchIn
                r3 = r1
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r4 = 1
                r1.label = r4
                java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt.collect(r2, r3)
                if (r2 != r0) goto L29
                return r0
            L29:
                r0 = r1
            L2a:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    public static final java.lang.Object collect(kotlinx.coroutines.flow.Flow<?> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            kotlinx.coroutines.flow.internal.NopCollector r0 = kotlinx.coroutines.flow.internal.NopCollector.INSTANCE
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            java.lang.Object r0 = r2.collect(r0, r3)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto Lf
            return r0
        Lf:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> java.lang.Object collect(kotlinx.coroutines.flow.Flow<? extends T> r3, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3 r1 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3
            r1.<init>(r4)
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.Object r1 = r3.collect(r1, r5)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L13
            return r1
        L13:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    private static final /* synthetic */ <T> java.lang.Object collect$$forInline(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3 r1 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3
            r1.<init>(r3)
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            r2.collect(r1, r4)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    public static final <T> java.lang.Object collectIndexed(kotlinx.coroutines.flow.Flow<? extends T> r3, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2 r1 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2
            r1.<init>(r4)
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.Object r1 = r3.collect(r1, r5)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L13
            return r1
        L13:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final <T> java.lang.Object collectIndexed$$forInline(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2 r1 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2
            r1.<init>(r3)
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            r2.collect(r1, r4)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    public static final <T> java.lang.Object collectLatest(kotlinx.coroutines.flow.Flow<? extends T> r4, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.mapLatest(r4, r5)
            r1 = 0
            r2 = 2
            r3 = 0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.buffer$default(r0, r3, r1, r2, r1)
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.collect(r0, r6)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L16
            return r0
        L16:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public static final <T> java.lang.Object emitAll(kotlinx.coroutines.flow.FlowCollector<? super T> r2, kotlinx.coroutines.flow.Flow<? extends T> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            kotlinx.coroutines.flow.FlowKt.ensureActive(r2)
            java.lang.Object r0 = r3.collect(r2, r4)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto Le
            return r0
        Le:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public static final <T> kotlinx.coroutines.Job launchIn(kotlinx.coroutines.flow.Flow<? extends T> r8, kotlinx.coroutines.CoroutineScope r9) {
            kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1 r0 = new kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1
            r1 = 0
            r0.<init>(r8, r1)
            r5 = r0
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            r2 = r9
            kotlinx.coroutines.Job r9 = kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
            return r9
    }
}
