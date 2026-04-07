package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: SelectOld.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl;", "R", "Lkotlinx/coroutines/selects/SelectImplementation;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/Continuation;)V", "cont", "Lkotlinx/coroutines/CancellableContinuationImpl;", "getResult", "", "handleBuilderException", "", "e", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SelectBuilderImpl<R> extends kotlinx.coroutines.selects.SelectImplementation<R> {
    private final kotlinx.coroutines.CancellableContinuationImpl<R> cont;

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1, reason: invalid class name */
    /* JADX INFO: compiled from: SelectOld.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1", f = "SelectOld.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;
        final /* synthetic */ kotlinx.coroutines.selects.SelectBuilderImpl<R> this$0;

        AnonymousClass1(kotlinx.coroutines.selects.SelectBuilderImpl<R> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.selects.SelectBuilderImpl.AnonymousClass1> r3) {
                r1 = this;
                r1.this$0 = r2
                r0 = 2
                r1.<init>(r0, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1 r0 = new kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1
                kotlinx.coroutines.selects.SelectBuilderImpl<R> r1 = r2.this$0
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
                kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1 r0 = (kotlinx.coroutines.selects.SelectBuilderImpl.AnonymousClass1) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.label
                switch(r1) {
                    case 0: goto L1a;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L11:
                r0 = r6
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L18
                r1 = r0
                r0 = r7
                goto L30
            L18:
                r1 = move-exception
                goto L44
            L1a:
                kotlin.ResultKt.throwOnFailure(r7)
                r1 = r6
                kotlinx.coroutines.selects.SelectBuilderImpl<R> r2 = r1.this$0     // Catch: java.lang.Throwable -> L40
                r3 = r1
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3     // Catch: java.lang.Throwable -> L40
                r4 = 1
                r1.label = r4     // Catch: java.lang.Throwable -> L40
                java.lang.Object r2 = r2.doSelect(r3)     // Catch: java.lang.Throwable -> L40
                if (r2 != r0) goto L2e
                return r0
            L2e:
                r0 = r7
                r7 = r2
            L30:
                kotlinx.coroutines.selects.SelectBuilderImpl<R> r2 = r1.this$0
                kotlinx.coroutines.CancellableContinuationImpl r2 = kotlinx.coroutines.selects.SelectBuilderImpl.access$getCont$p(r2)
                kotlinx.coroutines.CancellableContinuation r2 = (kotlinx.coroutines.CancellableContinuation) r2
                kotlinx.coroutines.selects.SelectOldKt.access$resumeUndispatched(r2, r7)
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
            L40:
                r0 = move-exception
                r5 = r1
                r1 = r0
                r0 = r5
            L44:
                kotlinx.coroutines.selects.SelectBuilderImpl<R> r2 = r0.this$0
                kotlinx.coroutines.CancellableContinuationImpl r2 = kotlinx.coroutines.selects.SelectBuilderImpl.access$getCont$p(r2)
                kotlinx.coroutines.CancellableContinuation r2 = (kotlinx.coroutines.CancellableContinuation) r2
                kotlinx.coroutines.selects.SelectOldKt.access$resumeUndispatchedWithException(r2, r1)
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
        }
    }

    public SelectBuilderImpl(kotlin.coroutines.Continuation<? super R> r4) {
            r3 = this;
            kotlin.coroutines.CoroutineContext r0 = r4.getContext()
            r3.<init>(r0)
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r4)
            r2 = 1
            r0.<init>(r1, r2)
            r3.cont = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.CancellableContinuationImpl access$getCont$p(kotlinx.coroutines.selects.SelectBuilderImpl r1) {
            kotlinx.coroutines.CancellableContinuationImpl<R> r0 = r1.cont
            return r0
    }

    public final java.lang.Object getResult() {
            r7 = this;
            kotlinx.coroutines.CancellableContinuationImpl<R> r0 = r7.cont
            boolean r0 = r0.isCompleted()
            if (r0 == 0) goto Lf
            kotlinx.coroutines.CancellableContinuationImpl<R> r0 = r7.cont
            java.lang.Object r0 = r0.getResult()
            return r0
        Lf:
            kotlin.coroutines.CoroutineContext r0 = r7.getContext()
            kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r0)
            kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1 r0 = new kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1
            r2 = 0
            r0.<init>(r7, r2)
            r4 = r0
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r5 = 1
            r6 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.CancellableContinuationImpl<R> r0 = r7.cont
            java.lang.Object r0 = r0.getResult()
            return r0
    }

    public final void handleBuilderException(java.lang.Throwable r3) {
            r2 = this;
            kotlinx.coroutines.CancellableContinuationImpl<R> r0 = r2.cont
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
            r0.resumeWith(r1)
            return
    }
}
