package kotlinx.coroutines;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\u001a:\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004\"\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0006\u001a\"\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0004\"\u00020\nH\u0086@¢\u0006\u0002\u0010\u000b\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\fH\u0086@¢\u0006\u0002\u0010\r\u001a\u0018\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\n0\fH\u0086@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"awaitAll", "", "T", "deferreds", "", "Lkotlinx/coroutines/Deferred;", "([Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinAll", "", "jobs", "Lkotlinx/coroutines/Job;", "([Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AwaitKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.AwaitKt$joinAll$1, reason: invalid class name */
    /* JADX INFO: compiled from: Await.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {47}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.AwaitKt.AnonymousClass1> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.AwaitKt.joinAll(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.AwaitKt$joinAll$3, reason: invalid class name */
    /* JADX INFO: compiled from: Await.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {58}, m = "joinAll", n = {}, s = {})
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass3(kotlin.coroutines.Continuation<? super kotlinx.coroutines.AwaitKt.AnonymousClass3> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.AwaitKt.joinAll(r0, r1)
                return r0
        }
    }

    public static final <T> java.lang.Object awaitAll(java.util.Collection<? extends kotlinx.coroutines.Deferred<? extends T>> r5, kotlin.coroutines.Continuation<? super java.util.List<? extends T>> r6) {
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Lb
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        Lb:
            kotlinx.coroutines.AwaitAll r0 = new kotlinx.coroutines.AwaitAll
            r1 = r5
            r2 = 0
            r3 = r1
            r4 = 0
            kotlinx.coroutines.Deferred[] r4 = new kotlinx.coroutines.Deferred[r4]
            java.lang.Object[] r1 = r3.toArray(r4)
            kotlinx.coroutines.Deferred[] r1 = (kotlinx.coroutines.Deferred[]) r1
            r0.<init>(r1)
            java.lang.Object r0 = r0.await(r6)
            return r0
    }

    public static final <T> java.lang.Object awaitAll(kotlinx.coroutines.Deferred<? extends T>[] r1, kotlin.coroutines.Continuation<? super java.util.List<? extends T>> r2) {
            int r0 = r1.length
            if (r0 != 0) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            if (r0 == 0) goto Ld
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        Ld:
            kotlinx.coroutines.AwaitAll r0 = new kotlinx.coroutines.AwaitAll
            r0.<init>(r1)
            java.lang.Object r0 = r0.await(r2)
            return r0
    }

    public static final java.lang.Object joinAll(java.util.Collection<? extends kotlinx.coroutines.Job> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            boolean r0 = r7 instanceof kotlinx.coroutines.AwaitKt.AnonymousClass3
            if (r0 == 0) goto L14
            r0 = r7
            kotlinx.coroutines.AwaitKt$joinAll$3 r0 = (kotlinx.coroutines.AwaitKt.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            kotlinx.coroutines.AwaitKt$joinAll$3 r0 = new kotlinx.coroutines.AwaitKt$joinAll$3
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
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2c:
            r6 = 0
            r2 = 0
            java.lang.Object r3 = r0.L$0
            java.util.Iterator r3 = (java.util.Iterator) r3
            kotlin.ResultKt.throwOnFailure(r7)
            goto L5b
        L36:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r2 = 0
            java.util.Iterator r3 = r6.iterator()
            r6 = r2
        L41:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r3.next()
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            r4 = 0
            r0.L$0 = r3
            r5 = 1
            r0.label = r5
            java.lang.Object r2 = r2.join(r0)
            if (r2 != r1) goto L5a
            return r1
        L5a:
            r2 = r4
        L5b:
            goto L41
        L5c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }

    public static final java.lang.Object joinAll(kotlinx.coroutines.Job[] r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.AwaitKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.AwaitKt$joinAll$1 r0 = (kotlinx.coroutines.AwaitKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.AwaitKt$joinAll$1 r0 = new kotlinx.coroutines.AwaitKt$joinAll$1
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            switch(r2) {
                case 0: goto L3b;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2d:
            r8 = 0
            r2 = 0
            int r4 = r0.I$1
            int r5 = r0.I$0
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.Job[] r6 = (kotlinx.coroutines.Job[]) r6
            kotlin.ResultKt.throwOnFailure(r9)
            goto L58
        L3b:
            kotlin.ResultKt.throwOnFailure(r9)
            r2 = 0
            int r4 = r8.length
            r5 = 0
            r6 = r8
            r8 = r2
        L43:
            if (r5 >= r4) goto L5a
            r2 = r6[r5]
            r7 = 0
            r0.L$0 = r6
            r0.I$0 = r5
            r0.I$1 = r4
            r0.label = r3
            java.lang.Object r2 = r2.join(r0)
            if (r2 != r1) goto L57
            return r1
        L57:
            r2 = r7
        L58:
            int r5 = r5 + r3
            goto L43
        L5a:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
    }
}
