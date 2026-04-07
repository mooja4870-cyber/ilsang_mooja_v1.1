package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> implements kotlinx.coroutines.flow.Flow<T> {
    final /* synthetic */ kotlin.jvm.functions.Function4 $predicate$inlined;
    final /* synthetic */ kotlinx.coroutines.flow.Flow $this_retryWhen$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {116, 118}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u242", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u242", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        long J$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 this$0;

        public AnonymousClass1(kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r1, kotlin.coroutines.Continuation r2) {
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
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.collect(r1, r2)
                return r0
        }
    }

    public FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(kotlinx.coroutines.flow.Flow r1, kotlin.jvm.functions.Function4 r2) {
            r0 = this;
            r0.$this_retryWhen$inlined = r1
            r0.$predicate$inlined = r2
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
            r12 = this;
            boolean r0 = r14 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1
            r0.<init>(r12, r14)
        L19:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L5d;
                case 1: goto L47;
                case 2: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2c:
            r13 = 0
            long r2 = r0.J$0
            java.lang.Object r4 = r0.L$2
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r6 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r6
            kotlin.ResultKt.throwOnFailure(r14)
            r7 = r6
            r6 = r5
            r5 = r4
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r14
            goto Laa
        L47:
            r13 = 0
            int r2 = r0.I$0
            long r3 = r0.J$0
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r6 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r6
            kotlin.ResultKt.throwOnFailure(r14)
            r7 = r6
            r6 = r2
            r2 = r1
            r1 = r0
            r0 = r14
            goto L8a
        L5d:
            kotlin.ResultKt.throwOnFailure(r14)
            r2 = r12
            r3 = r0
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r3 = 0
            r4 = 0
        L68:
            r6 = 0
            kotlinx.coroutines.flow.Flow r7 = r2.$this_retryWhen$inlined
            r0.L$0 = r2
            r0.L$1 = r13
            r8 = 0
            r0.L$2 = r8
            r0.J$0 = r4
            r0.I$0 = r6
            r8 = 1
            r0.label = r8
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.catchImpl(r7, r13, r0)
            if (r7 != r1) goto L80
            return r1
        L80:
            r10 = r4
            r5 = r13
            r13 = r3
            r3 = r10
            r10 = r0
            r0 = r14
            r14 = r7
            r7 = r2
            r2 = r1
            r1 = r10
        L8a:
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            if (r14 == 0) goto Lc1
            kotlin.jvm.functions.Function4 r6 = r7.$predicate$inlined
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3)
            r1.L$0 = r7
            r1.L$1 = r5
            r1.L$2 = r14
            r1.J$0 = r3
            r9 = 2
            r1.label = r9
            java.lang.Object r6 = r6.invoke(r5, r14, r8, r1)
            if (r6 != r2) goto La6
            return r2
        La6:
            r10 = r5
            r5 = r14
            r14 = r6
            r6 = r10
        Laa:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto Lc0
            r14 = 1
            r8 = 1
            long r3 = r3 + r8
            r4 = r3
            r3 = r13
            r13 = r6
            r6 = r14
            r14 = r0
            r0 = r1
            r1 = r2
            r2 = r7
            goto Lc9
        Lc0:
            throw r5
        Lc1:
            r10 = r3
            r3 = r13
            r13 = r5
            r4 = r10
            r14 = r0
            r0 = r1
            r1 = r2
            r2 = r7
        Lc9:
            if (r6 != 0) goto L68
        Lcc:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
    }
}
