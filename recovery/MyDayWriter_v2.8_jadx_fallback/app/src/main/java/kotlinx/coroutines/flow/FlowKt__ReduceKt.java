package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001e\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001aB\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@¢\u0006\u0002\u0010\t\u001a \u0010\n\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001aD\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@¢\u0006\u0002\u0010\t\u001av\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\r\u001a\u0002H\f2H\b\u0004\u0010\u000e\u001aB\b\u0001\u0012\u0013\u0012\u0011H\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000fH\u0086H¢\u0006\u0002\u0010\u0014\u001a\u001e\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001a \u0010\u0016\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001ap\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u0018\"\b\b\u0001\u0010\u0001*\u0002H\u0018*\b\u0012\u0004\u0012\u0002H\u00010\u00022F\u0010\u000e\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000fH\u0086@¢\u0006\u0002\u0010\u001a\u001a\u001e\u0010\u001b\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001a \u0010\u001c\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003¨\u0006\u001d"}, d2 = {"first", "T", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "acc", "value", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "last", "lastOrNull", "reduce", "S", "accumulator", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "single", "singleOrNull", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1, reason: invalid class name */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass1> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.first(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3, reason: invalid class name */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0, 0}, l = {179}, m = "first", n = {"predicate", "result", "collector$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class AnonymousClass3<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass3(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass3> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.first(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class C01181<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C01181(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C01181> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class C01193<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C01193(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C01193> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {40}, m = "fold", n = {"accumulator"}, s = {"L$0"})
    static final class C01201<T, R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C01201(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C01201> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.fold(r0, r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2, reason: invalid class name */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<R> $accumulator;
        final /* synthetic */ kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $operation;

        public AnonymousClass2(kotlin.jvm.internal.Ref.ObjectRef<R> r1, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
                r0 = this;
                r0.$accumulator = r1
                r0.$operation = r2
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
                if (r0 == 0) goto L14
                r0 = r9
                kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r9 = r0.label
                int r9 = r9 - r2
                r0.label = r9
                goto L19
            L14:
                kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
                r0.<init>(r7, r9)
            L19:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                switch(r2) {
                    case 0: goto L35;
                    case 1: goto L2c;
                    default: goto L24;
                }
            L24:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L2c:
                java.lang.Object r8 = r0.L$0
                kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                kotlin.ResultKt.throwOnFailure(r9)
                r1 = r9
                goto L4f
            L35:
                kotlin.ResultKt.throwOnFailure(r9)
                r2 = r7
                kotlin.jvm.internal.Ref$ObjectRef<R> r3 = r2.$accumulator
                kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r2.$operation
                kotlin.jvm.internal.Ref$ObjectRef<R> r5 = r2.$accumulator
                T r5 = r5.element
                r0.L$0 = r3
                r6 = 1
                r0.label = r6
                java.lang.Object r8 = r4.invoke(r5, r8, r0)
                if (r8 != r1) goto L4d
                return r1
            L4d:
                r1 = r8
                r8 = r3
            L4f:
                r8.element = r1
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }

        public final java.lang.Object emit$$forInline(T r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                r3 = this;
                kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
                r0.<init>(r3, r5)
                kotlin.jvm.internal.Ref$ObjectRef<R> r0 = r3.$accumulator
                kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r3.$operation
                kotlin.jvm.internal.Ref$ObjectRef<R> r2 = r3.$accumulator
                T r2 = r2.element
                java.lang.Object r1 = r1.invoke(r2, r4, r5)
                r0.element = r1
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {151}, m = "last", n = {"result"}, s = {"L$0"})
    static final class C01211<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C01211(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C01211> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.last(r0, r1)
                return r0
        }
    }


    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {163}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
    static final class C01231<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C01231(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C01231> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.lastOrNull(r0, r1)
                return r0
        }
    }


    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {18}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
    static final class C01251<S, T extends S> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C01251(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C01251> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.reduce(r0, r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "S", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C01262<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $accumulator;
        final /* synthetic */ kotlin.jvm.functions.Function3<S, T, kotlin.coroutines.Continuation<? super S>, java.lang.Object> $operation;

        C01262(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r1, kotlin.jvm.functions.Function3<? super S, ? super T, ? super kotlin.coroutines.Continuation<? super S>, ? extends java.lang.Object> r2) {
                r0 = this;
                r0.$accumulator = r1
                r0.$operation = r2
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1
                if (r0 == 0) goto L14
                r0 = r9
                kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r9 = r0.label
                int r9 = r9 - r2
                r0.label = r9
                goto L19
            L14:
                kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1
                r0.<init>(r7, r9)
            L19:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                switch(r2) {
                    case 0: goto L35;
                    case 1: goto L2c;
                    default: goto L24;
                }
            L24:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L2c:
                java.lang.Object r8 = r0.L$0
                kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                kotlin.ResultKt.throwOnFailure(r9)
                r1 = r9
                goto L57
            L35:
                kotlin.ResultKt.throwOnFailure(r9)
                r2 = r7
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r3 = r2.$accumulator
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r4 = r2.$accumulator
                T r4 = r4.element
                kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
                if (r4 == r5) goto L5a
                kotlin.jvm.functions.Function3<S, T, kotlin.coroutines.Continuation<? super S>, java.lang.Object> r4 = r2.$operation
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r5 = r2.$accumulator
                T r5 = r5.element
                r0.L$0 = r3
                r6 = 1
                r0.label = r6
                java.lang.Object r8 = r4.invoke(r5, r8, r0)
                if (r8 != r1) goto L55
                return r1
            L55:
                r1 = r8
                r8 = r3
            L57:
                r3 = r8
                r8 = r1
                goto L5b
            L5a:
            L5b:
                r3.element = r8
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {53}, m = "single", n = {"result"}, s = {"L$0"})
    static final class C01271<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C01271(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C01271> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.single(r0, r1)
                return r0
        }
    }


    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class C01291<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C01291(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C01291> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.singleOrNull(r0, r1)
                return r0
        }
    }

    public static final <T> java.lang.Object first(kotlinx.coroutines.flow.Flow<? extends T> r7, kotlin.coroutines.Continuation<? super T> r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L3b;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2c:
            r7 = 0
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1) r1
            java.lang.Object r2 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L39
            goto L62
        L39:
            r3 = move-exception
            goto L68
        L3b:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r2.element = r3
            r3 = 0
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1 r4 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1
            r4.<init>(r2)
            r5 = r4
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            r0.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            r0.L$1 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            r6 = 1
            r0.label = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            java.lang.Object r5 = r7.collect(r5, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            if (r5 != r1) goto L60
            return r1
        L60:
            r7 = r3
            r1 = r4
        L62:
            goto L6b
        L63:
            r7 = move-exception
            r1 = r3
            r3 = r7
            r7 = r1
            r1 = r4
        L68:
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r3, r1)
        L6b:
            T r7 = r2.element
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r7 == r1) goto L75
            T r7 = r2.element
            return r7
        L75:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.String r1 = "Expected at least one element"
            r7.<init>(r1)
            throw r7
    }

    public static final <T> java.lang.Object first(kotlinx.coroutines.flow.Flow<? extends T> r7, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<? super T> r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass3
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L3f;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2c:
            r7 = 0
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r8 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2) r8
            java.lang.Object r1 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r2 = r0.L$0
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3d
            goto L6a
        L3d:
            r3 = move-exception
            goto L71
        L3f:
            kotlin.ResultKt.throwOnFailure(r9)
            r2 = r8
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r8.element = r3
            r3 = 0
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r4 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2
            r4.<init>(r2, r8)
            r5 = r4
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6b
            r0.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6b
            r0.L$1 = r8     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6b
            r0.L$2 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6b
            r6 = 1
            r0.label = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6b
            java.lang.Object r5 = r7.collect(r5, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L6b
            if (r5 != r1) goto L67
            return r1
        L67:
            r1 = r8
            r7 = r3
            r8 = r4
        L6a:
            goto L74
        L6b:
            r7 = move-exception
            r1 = r3
            r3 = r7
            r7 = r1
            r1 = r8
            r8 = r4
        L71:
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r3, r8)
        L74:
            T r7 = r1.element
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r7 == r8) goto L7e
            T r7 = r1.element
            return r7
        L7e:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r3 = "Expected at least one element matching the predicate "
            java.lang.StringBuilder r8 = r8.append(r3)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    public static final <T> java.lang.Object firstOrNull(kotlinx.coroutines.flow.Flow<? extends T> r7, kotlin.coroutines.Continuation<? super T> r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C01181
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C01181) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L3b;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2c:
            r7 = 0
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1) r1
            java.lang.Object r2 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L39
            goto L5e
        L39:
            r3 = move-exception
            goto L64
        L3b:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            r3 = 0
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1 r4 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1
            r4.<init>(r2)
            r5 = r4
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5f
            r0.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5f
            r0.L$1 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5f
            r6 = 1
            r0.label = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5f
            java.lang.Object r5 = r7.collect(r5, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5f
            if (r5 != r1) goto L5c
            return r1
        L5c:
            r7 = r3
            r1 = r4
        L5e:
            goto L67
        L5f:
            r7 = move-exception
            r1 = r3
            r3 = r7
            r7 = r1
            r1 = r4
        L64:
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r3, r1)
        L67:
            T r7 = r2.element
            return r7
    }

    public static final <T> java.lang.Object firstOrNull(kotlinx.coroutines.flow.Flow<? extends T> r6, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super T> r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C01193
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C01193) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L3b;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2c:
            r6 = 0
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r7 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) r7
            java.lang.Object r1 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L39
            goto L5f
        L39:
            r2 = move-exception
            goto L65
        L3b:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            r3 = 0
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r4 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2
            r4.<init>(r7, r2)
            r7 = r4
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            r0.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            r0.L$1 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            r5 = 1
            r0.label = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            java.lang.Object r7 = r6.collect(r7, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r1 = r2
            r6 = r3
            r7 = r4
        L5f:
            goto L68
        L60:
            r6 = move-exception
            r1 = r2
            r7 = r4
            r2 = r6
            r6 = r3
        L65:
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r2, r7)
        L68:
            T r6 = r1.element
            return r6
    }

    public static final <T, R> java.lang.Object fold(kotlinx.coroutines.flow.Flow<? extends T> r5, R r6, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super R> r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C01201
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C01201) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L35;
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
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref.ObjectRef) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L55
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            r2 = 0
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            r3.element = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2 r6 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2
            r6.<init>(r3, r7)
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            r0.L$0 = r3
            r4 = 1
            r0.label = r4
            java.lang.Object r5 = r5.collect(r6, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            r5 = r2
            r6 = r3
        L55:
            T r7 = r6.element
            return r7
    }

    private static final <T, R> java.lang.Object fold$$forInline(kotlinx.coroutines.flow.Flow<? extends T> r3, R r4, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super R> r6) {
            r0 = 0
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            r1.element = r4
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2
            r2.<init>(r1, r5)
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            r3.collect(r2, r6)
            T r2 = r1.element
            return r2
    }

    public static final <T> java.lang.Object last(kotlinx.coroutines.flow.Flow<? extends T> r5, kotlin.coroutines.Continuation<? super T> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C01211
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C01211) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L34;
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
            kotlin.ResultKt.throwOnFailure(r6)
            goto L54
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r2.element = r3
            kotlinx.coroutines.flow.FlowKt__ReduceKt$last$2 r3 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$last$2
            r3.<init>(r2)
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            r0.L$0 = r2
            r4 = 1
            r0.label = r4
            java.lang.Object r5 = r5.collect(r3, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            r5 = r2
        L54:
            T r1 = r5.element
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r1 == r2) goto L5d
            T r1 = r5.element
            return r1
        L5d:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Expected at least one element"
            r1.<init>(r2)
            throw r1
    }

    public static final <T> java.lang.Object lastOrNull(kotlinx.coroutines.flow.Flow<? extends T> r5, kotlin.coroutines.Continuation<? super T> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C01231
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C01231) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L34;
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
            kotlin.ResultKt.throwOnFailure(r6)
            goto L50
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$2 r3 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$2
            r3.<init>(r2)
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            r0.L$0 = r2
            r4 = 1
            r0.label = r4
            java.lang.Object r5 = r5.collect(r3, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r5 = r2
        L50:
            T r1 = r5.element
            return r1
    }

    public static final <S, T extends S> java.lang.Object reduce(kotlinx.coroutines.flow.Flow<? extends T> r5, kotlin.jvm.functions.Function3<? super S, ? super T, ? super kotlin.coroutines.Continuation<? super S>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super S> r7) {
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C01251
            if (r0 == 0) goto L14
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C01251) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L34;
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
            kotlin.ResultKt.throwOnFailure(r7)
            goto L54
        L34:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r2.element = r3
            kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2 r3 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2
            r3.<init>(r2, r6)
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            r0.L$0 = r2
            r4 = 1
            r0.label = r4
            java.lang.Object r5 = r5.collect(r3, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            r5 = r2
        L54:
            T r6 = r5.element
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r6 == r1) goto L5d
            T r6 = r5.element
            return r6
        L5d:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r1 = "Empty flow can't be reduced"
            r6.<init>(r1)
            throw r6
    }

    public static final <T> java.lang.Object single(kotlinx.coroutines.flow.Flow<? extends T> r5, kotlin.coroutines.Continuation<? super T> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C01271
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C01271) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L34;
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
            kotlin.ResultKt.throwOnFailure(r6)
            goto L54
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r2.element = r3
            kotlinx.coroutines.flow.FlowKt__ReduceKt$single$2 r3 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$single$2
            r3.<init>(r2)
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            r0.L$0 = r2
            r4 = 1
            r0.label = r4
            java.lang.Object r5 = r5.collect(r3, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            r5 = r2
        L54:
            T r1 = r5.element
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r1 == r2) goto L5d
            T r1 = r5.element
            return r1
        L5d:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Flow is empty"
            r1.<init>(r2)
            throw r1
    }

    public static final <T> java.lang.Object singleOrNull(kotlinx.coroutines.flow.Flow<? extends T> r7, kotlin.coroutines.Continuation<? super T> r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C01291
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C01291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L3b;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2c:
            r7 = 0
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1) r1
            java.lang.Object r2 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L39
            goto L62
        L39:
            r3 = move-exception
            goto L68
        L3b:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r2.element = r3
            r3 = 0
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1 r4 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1
            r4.<init>(r2)
            r5 = r4
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            r0.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            r0.L$1 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            r6 = 1
            r0.label = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            java.lang.Object r5 = r7.collect(r5, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L63
            if (r5 != r1) goto L60
            return r1
        L60:
            r7 = r3
            r1 = r4
        L62:
            goto L6b
        L63:
            r7 = move-exception
            r1 = r3
            r3 = r7
            r7 = r1
            r1 = r4
        L68:
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r3, r1)
        L6b:
            T r7 = r2.element
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r7 != r1) goto L74
            r7 = 0
            goto L76
        L74:
            T r7 = r2.element
        L76:
            return r7
    }
}
