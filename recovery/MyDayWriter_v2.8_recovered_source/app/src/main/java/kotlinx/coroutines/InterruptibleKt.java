package kotlinx.coroutines;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\nH\u0086@¢\u0006\u0002\u0010\u000b\u001a)\u0010\f\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\r\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\nH\u0002¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"FINISHED", "", "INTERRUPTED", "INTERRUPTING", "WORKING", "runInterruptible", "T", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function0;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runInterruptibleInExpectedContext", "coroutineContext", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class InterruptibleKt {
    private static final int FINISHED = 1;
    private static final int INTERRUPTED = 3;
    private static final int INTERRUPTING = 2;
    private static final int WORKING = 0;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.InterruptibleKt$runInterruptible$2, reason: invalid class name */
    /* JADX INFO: compiled from: Interruptible.kt */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function0<T> $block;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        AnonymousClass2(kotlin.jvm.functions.Function0<? extends T> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.InterruptibleKt.AnonymousClass2> r3) {
                r1 = this;
                r1.$block = r2
                r0 = 2
                r1.<init>(r0, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.InterruptibleKt$runInterruptible$2 r0 = new kotlinx.coroutines.InterruptibleKt$runInterruptible$2
                kotlin.jvm.functions.Function0<T> r1 = r2.$block
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r2, java.lang.Object r3) {
                r1 = this;
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r3, kotlin.coroutines.Continuation<? super T> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.InterruptibleKt$runInterruptible$2 r0 = (kotlinx.coroutines.InterruptibleKt.AnonymousClass2) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                r4 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r4.label
                switch(r0) {
                    case 0: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L10:
                kotlin.ResultKt.throwOnFailure(r5)
                r0 = r4
                java.lang.Object r1 = r0.L$0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.coroutines.CoroutineContext r2 = r1.getCoroutineContext()
                kotlin.jvm.functions.Function0<T> r3 = r0.$block
                java.lang.Object r2 = kotlinx.coroutines.InterruptibleKt.access$runInterruptibleInExpectedContext(r2, r3)
                return r2
        }
    }

    public static final /* synthetic */ java.lang.Object access$runInterruptibleInExpectedContext(kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function0 r2) {
            java.lang.Object r0 = runInterruptibleInExpectedContext(r1, r2)
            return r0
    }

    public static final <T> java.lang.Object runInterruptible(kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function0<? extends T> r3, kotlin.coroutines.Continuation<? super T> r4) {
            kotlinx.coroutines.InterruptibleKt$runInterruptible$2 r0 = new kotlinx.coroutines.InterruptibleKt$runInterruptible$2
            r1 = 0
            r0.<init>(r3, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r2, r0, r4)
            return r0
    }

    public static /* synthetic */ java.lang.Object runInterruptible$default(kotlin.coroutines.CoroutineContext r0, kotlin.jvm.functions.Function0 r1, kotlin.coroutines.Continuation r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
        L8:
            java.lang.Object r0 = runInterruptible(r0, r1, r2)
            return r0
    }

    private static final <T> T runInterruptibleInExpectedContext(kotlin.coroutines.CoroutineContext r3, kotlin.jvm.functions.Function0<? extends T> r4) {
            kotlinx.coroutines.ThreadState r0 = new kotlinx.coroutines.ThreadState     // Catch: java.lang.InterruptedException -> L1b
            kotlinx.coroutines.Job r1 = kotlinx.coroutines.JobKt.getJob(r3)     // Catch: java.lang.InterruptedException -> L1b
            r0.<init>(r1)     // Catch: java.lang.InterruptedException -> L1b
            r0.setup()     // Catch: java.lang.InterruptedException -> L1b
            java.lang.Object r1 = r4.invoke()     // Catch: java.lang.Throwable -> L16
            r0.clearInterrupt()     // Catch: java.lang.InterruptedException -> L1b
            return r1
        L16:
            r1 = move-exception
            r0.clearInterrupt()     // Catch: java.lang.InterruptedException -> L1b
            throw r1     // Catch: java.lang.InterruptedException -> L1b
        L1b:
            r0 = move-exception
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r2 = "Blocking call was interrupted due to parent cancellation"
            r1.<init>(r2)
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Throwable r1 = r1.initCause(r2)
            throw r1
    }
}
