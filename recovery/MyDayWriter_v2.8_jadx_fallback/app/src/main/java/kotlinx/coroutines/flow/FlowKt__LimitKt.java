package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aS\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000323\b\u0004\u0010\u0004\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005H\u0080H¢\u0006\u0002\u0010\f\u001a$\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f\u001aE\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\u0010\u0011\u001a0\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00132\u0006\u0010\b\u001a\u0002H\u00022\u0006\u0010\u0014\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a$\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f\u001aE\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\u0010\u0011\u001am\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u00020\u00032D\b\u0001\u0010\u001b\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u0013\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001c¢\u0006\u0002\b\u001d¢\u0006\u0002\u0010\u001e¨\u0006\u001f"}, d2 = {"collectWhile", "", "T", "Lkotlinx/coroutines/flow/Flow;", "predicate", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drop", "count", "", "dropWhile", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "emitAbort", "Lkotlinx/coroutines/flow/FlowCollector;", "ownershipMarker", "emitAbort$FlowKt__LimitKt", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "take", "takeWhile", "transformWhile", "R", "transform", "Lkotlin/Function3;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__LimitKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1, reason: invalid class name */
    /* JADX INFO: compiled from: Limit.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {133}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__LimitKt.AnonymousClass1> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.collectWhile(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Limit.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {149}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
    static final class C01141<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_transformWhile;
        final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $transform;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        C01141(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__LimitKt.C01141> r4) {
                r1 = this;
                r1.$this_transformWhile = r2
                r1.$transform = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1
                kotlinx.coroutines.flow.Flow<T> r1 = r3.$this_transformWhile
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r2 = r3.$transform
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
                kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.C01141) r0
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
                    case 0: goto L1d;
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
                r1 = 0
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r2 = (kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) r2
                kotlin.ResultKt.throwOnFailure(r9)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L1b
                goto L45
            L1b:
                r3 = move-exception
                goto L4a
            L1d:
                kotlin.ResultKt.throwOnFailure(r9)
                r1 = r8
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlinx.coroutines.flow.Flow<T> r3 = r1.$this_transformWhile
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r4 = r1.$transform
                r5 = 0
                kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r6 = new kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1
                r6.<init>(r4, r2)
                r2 = r6
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L46
                r4 = r1
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L46
                r1.L$0 = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L46
                r7 = 1
                r1.label = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L46
                java.lang.Object r2 = r3.collect(r2, r4)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L46
                if (r2 != r0) goto L42
                return r0
            L42:
                r0 = r1
                r1 = r5
                r2 = r6
            L45:
                goto L4d
            L46:
                r3 = move-exception
                r0 = r1
                r1 = r5
                r2 = r6
            L4a:
                kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r3, r2)
            L4d:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    public static final /* synthetic */ java.lang.Object access$emitAbort$FlowKt__LimitKt(kotlinx.coroutines.flow.FlowCollector r1, java.lang.Object r2, java.lang.Object r3, kotlin.coroutines.Continuation r4) {
            java.lang.Object r0 = emitAbort$FlowKt__LimitKt(r1, r2, r3, r4)
            return r0
    }

    public static final <T> java.lang.Object collectWhile(kotlinx.coroutines.flow.Flow<? extends T> r5, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L37;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2c:
            r5 = 0
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r6 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1) r6
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L35
            goto L52
        L35:
            r1 = move-exception
            goto L56
        L37:
            kotlin.ResultKt.throwOnFailure(r7)
            r2 = 0
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r3 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1
            r3.<init>(r6)
            r6 = r3
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L53
            r0.L$0 = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L53
            r4 = 1
            r0.label = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L53
            java.lang.Object r6 = r5.collect(r6, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L53
            if (r6 != r1) goto L50
            return r1
        L50:
            r5 = r2
            r6 = r3
        L52:
            goto L59
        L53:
            r1 = move-exception
            r5 = r2
            r6 = r3
        L56:
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r1, r6)
        L59:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }

    private static final <T> java.lang.Object collectWhile$$forInline(kotlinx.coroutines.flow.Flow<? extends T> r3, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1
            r1.<init>(r4)
            r2 = r1
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> Le
            r3.collect(r2, r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> Le
            goto L12
        Le:
            r2 = move-exception
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r2, r1)
        L12:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> drop(kotlinx.coroutines.flow.Flow<? extends T> r3, int r4) {
            if (r4 < 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L10
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1
            r1.<init>(r3, r4)
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            return r1
        L10:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Drop count should be non-negative, but had "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> dropWhile(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1
            r1.<init>(r2, r3)
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            return r1
    }

    private static final <T> java.lang.Object emitAbort$FlowKt__LimitKt(kotlinx.coroutines.flow.FlowCollector<? super T> r3, T r4, java.lang.Object r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L32;
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
            kotlin.ResultKt.throwOnFailure(r6)
            goto L42
        L32:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.L$0 = r5
            r2 = 1
            r0.label = r2
            java.lang.Object r3 = r3.emit(r4, r0)
            if (r3 != r1) goto L41
            return r1
        L41:
            r3 = r5
        L42:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r3)
            throw r4
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> take(kotlinx.coroutines.flow.Flow<? extends T> r3, int r4) {
            if (r4 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L10
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1
            r1.<init>(r3, r4)
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            return r1
        L10:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Requested element count "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " should be positive"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> takeWhile(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1
            r1.<init>(r2, r3)
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            return r1
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> transformWhile(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flow(r0)
            return r0
    }
}
