package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b2\u001e\u0010\f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\r\"\b\u0012\u0004\u0012\u0002H\u000b0\n¢\u0006\u0002\u0010\u000e\u001ab\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00100\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u000b0\n27\u0010\u0011\u001a3\b\u0001\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\n0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0012H\u0007¢\u0006\u0002\u0010\u0018\u001ae\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00100\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u000b0\n29\b\u0005\u0010\u0011\u001a3\b\u0001\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\n0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0012H\u0087\b¢\u0006\u0002\u0010\u0018\u001al\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00100\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u000b0\n2\b\b\u0002\u0010\u001b\u001a\u00020\u000127\u0010\u0011\u001a3\b\u0001\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\n0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0012H\u0007¢\u0006\u0002\u0010\u001c\u001a$\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\nH\u0007\u001a.\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\n2\b\b\u0002\u0010\u001b\u001a\u00020\u0001H\u0007\u001a^\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00100\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u000b0\n23\b\u0001\u0010\u0011\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0012H\u0007¢\u0006\u0002\u0010\u0018\u001a\"\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0 \u001ao\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00100\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u000b0\n2D\b\u0001\u0010\u0011\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100#\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\"¢\u0006\u0002\b%H\u0007¢\u0006\u0002\u0010&\"\u001c\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006'"}, d2 = {"DEFAULT_CONCURRENCY", "", "getDEFAULT_CONCURRENCY$annotations", "()V", "getDEFAULT_CONCURRENCY", "()I", "DEFAULT_CONCURRENCY_PROPERTY_NAME", "", "getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations", "merge", "Lkotlinx/coroutines/flow/Flow;", "T", "flows", "", "([Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "flatMapConcat", "R", "transform", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "flatMapLatest", "flatMapMerge", "concurrency", "(Lkotlinx/coroutines/flow/Flow;ILkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "flattenConcat", "flattenMerge", "mapLatest", "", "transformLatest", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__MergeKt {
    private static final int DEFAULT_CONCURRENCY = 0;

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1, reason: invalid class name */
    /* JADX INFO: compiled from: Merge.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", i = {}, l = {189, 189}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1<R, T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, java.lang.Object> $transform;
        private /* synthetic */ java.lang.Object L$0;
        /* synthetic */ java.lang.Object L$1;
        int label;

        public AnonymousClass1(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__MergeKt.AnonymousClass1> r3) {
                r1 = this;
                r1.$transform = r2
                r0 = 3
                r1.<init>(r0, r3)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r1 = this;
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                java.lang.Object r0 = r1.invoke(r2, r3, r4)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> r3, T r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                r2 = this;
                kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, java.lang.Object> r1 = r2.$transform
                r0.<init>(r1, r5)
                r0.L$0 = r3
                r0.L$1 = r4
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
                    case 0: goto L22;
                    case 1: goto L16;
                    case 2: goto L11;
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
                goto L53
            L16:
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.ResultKt.throwOnFailure(r8)
                r3 = r2
                r2 = r1
                r1 = r8
                goto L3f
            L22:
                kotlin.ResultKt.throwOnFailure(r8)
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                java.lang.Object r3 = r1.L$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, java.lang.Object> r4 = r1.$transform
                r1.L$0 = r2
                r5 = 1
                r1.label = r5
                java.lang.Object r3 = r4.invoke(r3, r1)
                if (r3 != r0) goto L3a
                return r0
            L3a:
                r6 = r1
                r1 = r8
                r8 = r3
                r3 = r2
                r2 = r6
            L3f:
                kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
                r4 = r2
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r5 = 0
                r2.L$0 = r5
                r5 = 2
                r2.label = r5
                java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.emitAll(r3, r8, r4)
                if (r8 != r0) goto L51
                return r0
            L51:
                r8 = r1
                r0 = r2
            L53:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }

        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = r4.L$0
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                java.lang.Object r1 = r4.L$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, java.lang.Object> r2 = r4.$transform
                java.lang.Object r2 = r2.invoke(r1, r4)
                kotlinx.coroutines.flow.Flow r2 = (kotlinx.coroutines.flow.Flow) r2
                r3 = r4
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                kotlinx.coroutines.flow.FlowKt.emitAll(r0, r2, r3)
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Merge.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {213, 213}, m = "invokeSuspend", n = {}, s = {})
    static final class C01151<R, T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
        private /* synthetic */ java.lang.Object L$0;
        /* synthetic */ java.lang.Object L$1;
        int label;

        C01151(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__MergeKt.C01151> r3) {
                r1 = this;
                r1.$transform = r2
                r0 = 3
                r1.<init>(r0, r3)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r1 = this;
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                java.lang.Object r0 = r1.invoke(r2, r3, r4)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> r3, T r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                r2 = this;
                kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r2.$transform
                r0.<init>(r1, r5)
                r0.L$0 = r3
                r0.L$1 = r4
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
                    case 0: goto L22;
                    case 1: goto L16;
                    case 2: goto L11;
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
                goto L51
            L16:
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.ResultKt.throwOnFailure(r8)
                r3 = r2
                r2 = r1
                r1 = r8
                goto L3f
            L22:
                kotlin.ResultKt.throwOnFailure(r8)
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                java.lang.Object r3 = r1.L$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r1.$transform
                r1.L$0 = r2
                r5 = 1
                r1.label = r5
                java.lang.Object r3 = r4.invoke(r3, r1)
                if (r3 != r0) goto L3a
                return r0
            L3a:
                r6 = r1
                r1 = r8
                r8 = r3
                r3 = r2
                r2 = r6
            L3f:
                r4 = r2
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r5 = 0
                r2.L$0 = r5
                r5 = 2
                r2.label = r5
                java.lang.Object r8 = r3.emit(r8, r4)
                if (r8 != r0) goto L4f
                return r0
            L4f:
                r8 = r1
                r0 = r2
            L51:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    static {
            java.lang.String r0 = "kotlinx.coroutines.flow.defaultConcurrency"
            r1 = 16
            r2 = 1
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0, r1, r2, r3)
            kotlinx.coroutines.flow.FlowKt__MergeKt.DEFAULT_CONCURRENCY = r0
            return
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMapConcat(kotlinx.coroutines.flow.Flow<? extends T> r6, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> r7) {
            r0 = r6
            r1 = 0
            r2 = r0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1 r5 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1
            r5.<init>(r2, r7)
            kotlinx.coroutines.flow.Flow r5 = (kotlinx.coroutines.flow.Flow) r5
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flattenConcat(r5)
            return r0
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMapLatest(kotlinx.coroutines.flow.Flow<? extends T> r3, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> r4) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1 r1 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1
            r2 = 0
            r1.<init>(r4, r2)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            kotlinx.coroutines.flow.Flow r1 = kotlinx.coroutines.flow.FlowKt.transformLatest(r3, r1)
            return r1
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMapMerge(kotlinx.coroutines.flow.Flow<? extends T> r6, int r7, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> r8) {
            r0 = r6
            r1 = 0
            r2 = r0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1 r5 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1
            r5.<init>(r2, r8)
            kotlinx.coroutines.flow.Flow r5 = (kotlinx.coroutines.flow.Flow) r5
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flattenMerge(r5, r7)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow flatMapMerge$default(kotlinx.coroutines.flow.Flow r0, int r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            int r1 = kotlinx.coroutines.flow.FlowKt__MergeKt.DEFAULT_CONCURRENCY
        L6:
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flatMapMerge(r0, r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flattenConcat(kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> r2) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1
            r1.<init>(r2)
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            return r1
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flattenMerge(kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> r9, int r10) {
            r0 = 1
            if (r10 <= 0) goto L5
            r1 = r0
            goto L6
        L5:
            r1 = 0
        L6:
            if (r1 == 0) goto L22
            if (r10 != r0) goto L11
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flattenConcat(r9)
            r2 = r9
            r3 = r10
            goto L21
        L11:
            kotlinx.coroutines.flow.internal.ChannelFlowMerge r1 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge
            r7 = 28
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0 = r1
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
        L21:
            return r0
        L22:
            r2 = r9
            r3 = r10
            r9 = 0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Expected positive concurrency level, but had "
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.StringBuilder r10 = r10.append(r3)
            java.lang.String r9 = r10.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow flattenMerge$default(kotlinx.coroutines.flow.Flow r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            int r1 = kotlinx.coroutines.flow.FlowKt__MergeKt.DEFAULT_CONCURRENCY
        L6:
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flattenMerge(r0, r1)
            return r0
    }

    public static final int getDEFAULT_CONCURRENCY() {
            int r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.DEFAULT_CONCURRENCY
            return r0
    }

    public static /* synthetic */ void getDEFAULT_CONCURRENCY$annotations() {
            return
    }

    public static /* synthetic */ void getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations() {
            return
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> mapLatest(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1
            r1 = 0
            r0.<init>(r3, r1)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.transformLatest(r2, r0)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> merge(java.lang.Iterable<? extends kotlinx.coroutines.flow.Flow<? extends T>> r7) {
            kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge r0 = new kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge
            r5 = 14
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> merge(kotlinx.coroutines.flow.Flow<? extends T>... r1) {
            java.lang.Iterable r0 = kotlin.collections.ArraysKt.asIterable(r1)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.merge(r0)
            return r0
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> transformLatest(kotlinx.coroutines.flow.Flow<? extends T> r8, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r9) {
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest
            r6 = 28
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            return r0
    }
}
