package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Errors.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012B\u0010\u0003\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u000e\u001a.\u0010\u000f\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0080@¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u00020\u0013*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\b\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\b\u0019\u001a`\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001c23\b\u0002\u0010\u001d\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001e¢\u0006\u0002\u0010\u001f\u001az\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012W\u0010\u001d\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\f0!¢\u0006\u0002\b\r¢\u0006\u0002\u0010#¨\u0006$"}, d2 = {"catch", "Lkotlinx/coroutines/flow/Flow;", "T", "action", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "catchImpl", "collector", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCancellationCause", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "isCancellationCause$FlowKt__ErrorsKt", "isSameExceptionAs", "other", "isSameExceptionAs$FlowKt__ErrorsKt", "retry", "retries", "", "predicate", "Lkotlin/Function2;", "(Lkotlinx/coroutines/flow/Flow;JLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "retryWhen", "Lkotlin/Function4;", "attempt", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ErrorsKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: Errors.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {152}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ErrorsKt.AnonymousClass1> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.catchImpl(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2, reason: invalid class name */
    /* JADX INFO: compiled from: Errors.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $collector;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Throwable> $fromDownstream;

        AnonymousClass2(kotlinx.coroutines.flow.FlowCollector<? super T> r1, kotlin.jvm.internal.Ref.ObjectRef<java.lang.Throwable> r2) {
                r0 = this;
                r0.$collector = r1
                r0.$fromDownstream = r2
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
                if (r0 == 0) goto L14
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r7 = r0.label
                int r7 = r7 - r2
                r0.label = r7
                goto L19
            L14:
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
                r0.<init>(r5, r7)
            L19:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                switch(r2) {
                    case 0: goto L36;
                    case 1: goto L2c;
                    default: goto L24;
                }
            L24:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2c:
                java.lang.Object r6 = r0.L$0
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r6 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.AnonymousClass2) r6
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L34
                goto L4a
            L34:
                r1 = move-exception
                goto L50
            L36:
                kotlin.ResultKt.throwOnFailure(r7)
                r2 = r5
                kotlinx.coroutines.flow.FlowCollector<T> r3 = r2.$collector     // Catch: java.lang.Throwable -> L4e
                r0.L$0 = r2     // Catch: java.lang.Throwable -> L4e
                r4 = 1
                r0.label = r4     // Catch: java.lang.Throwable -> L4e
                java.lang.Object r3 = r3.emit(r6, r0)     // Catch: java.lang.Throwable -> L4e
                if (r3 != r1) goto L49
                return r1
            L49:
                r6 = r2
            L4a:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            L4e:
                r1 = move-exception
                r6 = r2
            L50:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r2 = r6.$fromDownstream
                r2.element = r1
                throw r1
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Errors.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C01131 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        int label;

        C01131(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ErrorsKt.C01131> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r2, kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1
                r0.<init>(r3)
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Throwable r2, kotlin.coroutines.Continuation<? super java.lang.Boolean> r3) {
                r1 = this;
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(java.lang.Throwable r3, kotlin.coroutines.Continuation<? super java.lang.Boolean> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.C01131) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r2.label
                switch(r0) {
                    case 0: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
            L10:
                kotlin.ResultKt.throwOnFailure(r3)
                r0 = r2
                r1 = 1
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3, reason: invalid class name */
    /* JADX INFO: compiled from: Errors.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "cause", "", "attempt", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<kotlinx.coroutines.flow.FlowCollector<? super T>, java.lang.Throwable, java.lang.Long, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
        final /* synthetic */ long $retries;
        /* synthetic */ long J$0;
        /* synthetic */ java.lang.Object L$0;
        int label;

        AnonymousClass3(long r2, kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ErrorsKt.AnonymousClass3> r5) {
                r1 = this;
                r1.$retries = r2
                r1.$predicate = r4
                r0 = 4
                r1.<init>(r0, r5)
                return
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r7, java.lang.Throwable r8, java.lang.Long r9, kotlin.coroutines.Continuation<? super java.lang.Boolean> r10) {
                r6 = this;
                r1 = r7
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                r2 = r8
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                r0 = r9
                java.lang.Number r0 = (java.lang.Number) r0
                long r3 = r0.longValue()
                r5 = r10
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r0 = r6
                java.lang.Object r1 = r0.invoke(r1, r2, r3, r5)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super T> r5, java.lang.Throwable r6, long r7, kotlin.coroutines.Continuation<? super java.lang.Boolean> r9) {
                r4 = this;
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3
                long r1 = r4.$retries
                kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r3 = r4.$predicate
                r0.<init>(r1, r3, r9)
                r0.L$0 = r6
                r0.J$0 = r7
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                r2 = 1
                switch(r1) {
                    case 0: goto L19;
                    case 1: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L12:
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r9)
                r1 = r0
                r0 = r9
                goto L36
            L19:
                kotlin.ResultKt.throwOnFailure(r9)
                r1 = r8
                java.lang.Object r3 = r1.L$0
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                long r4 = r1.J$0
                long r6 = r1.$retries
                int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r6 >= 0) goto L40
                kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r6 = r1.$predicate
                r1.label = r2
                java.lang.Object r3 = r6.invoke(r3, r1)
                if (r3 != r0) goto L34
                return r0
            L34:
                r0 = r9
                r9 = r3
            L36:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L3f
                goto L42
            L3f:
                r9 = r0
            L40:
                r2 = 0
                r0 = r9
            L42:
                java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                return r9
        }
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m1696catch(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1
            r1.<init>(r2, r3)
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            return r1
    }

    public static final <T> java.lang.Object catchImpl(kotlinx.coroutines.flow.Flow<? extends T> r5, kotlinx.coroutines.flow.FlowCollector<? super T> r6, kotlin.coroutines.Continuation<? super java.lang.Throwable> r7) {
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L36;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2c:
            java.lang.Object r5 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L34
            goto L53
        L34:
            r6 = move-exception
            goto L58
        L36:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r3 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2     // Catch: java.lang.Throwable -> L56
            r3.<init>(r6, r2)     // Catch: java.lang.Throwable -> L56
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3     // Catch: java.lang.Throwable -> L56
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L56
            r4 = 1
            r0.label = r4     // Catch: java.lang.Throwable -> L56
            java.lang.Object r3 = r5.collect(r3, r0)     // Catch: java.lang.Throwable -> L56
            if (r3 != r1) goto L52
            return r1
        L52:
            r5 = r2
        L53:
            r5 = 0
            return r5
        L56:
            r6 = move-exception
            r5 = r2
        L58:
            T r1 = r5.element
            r5 = r1
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            boolean r1 = isSameExceptionAs$FlowKt__ErrorsKt(r6, r5)
            if (r1 != 0) goto L7c
            kotlin.coroutines.CoroutineContext r1 = r0.getContext()
            boolean r1 = isCancellationCause$FlowKt__ErrorsKt(r6, r1)
            if (r1 != 0) goto L7c
            if (r5 != 0) goto L70
            return r6
        L70:
            boolean r1 = r6 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L78
            kotlin.ExceptionsKt.addSuppressed(r5, r6)
            throw r5
        L78:
            kotlin.ExceptionsKt.addSuppressed(r6, r5)
            throw r6
        L7c:
            throw r6
    }

    private static final boolean isCancellationCause$FlowKt__ErrorsKt(java.lang.Throwable r2, kotlin.coroutines.CoroutineContext r3) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r3.get(r0)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            if (r0 == 0) goto L1e
            boolean r1 = r0.isCancelled()
            if (r1 != 0) goto L13
            goto L1e
        L13:
            java.util.concurrent.CancellationException r1 = r0.getCancellationException()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            boolean r1 = isSameExceptionAs$FlowKt__ErrorsKt(r2, r1)
            return r1
        L1e:
            r1 = 0
            return r1
    }

    private static final boolean isSameExceptionAs$FlowKt__ErrorsKt(java.lang.Throwable r3, java.lang.Throwable r4) {
            if (r4 == 0) goto L24
            r0 = 0
            boolean r1 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r1 != 0) goto Lb
            r1 = r4
            goto Lf
        Lb:
            java.lang.Throwable r1 = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(r4)
        Lf:
            r0 = 0
            boolean r2 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r2 != 0) goto L18
            r2 = r3
            goto L1c
        L18:
            java.lang.Throwable r2 = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(r3)
        L1c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> retry(kotlinx.coroutines.flow.Flow<? extends T> r3, long r4, kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r6) {
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L18
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3
            r1 = 0
            r0.<init>(r4, r6, r1)
            kotlin.jvm.functions.Function4 r0 = (kotlin.jvm.functions.Function4) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.retryWhen(r3, r0)
            return r0
        L18:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected positive amount of retries, but had "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow retry$default(kotlinx.coroutines.flow.Flow r0, long r1, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L9
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L9:
            r4 = r4 & 2
            if (r4 == 0) goto L15
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1 r3 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1
            r4 = 0
            r3.<init>(r4)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
        L15:
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.retry(r0, r1, r3)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> retryWhen(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super java.lang.Long, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3) {
            r0 = 0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1
            r1.<init>(r2, r3)
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            return r1
    }
}
