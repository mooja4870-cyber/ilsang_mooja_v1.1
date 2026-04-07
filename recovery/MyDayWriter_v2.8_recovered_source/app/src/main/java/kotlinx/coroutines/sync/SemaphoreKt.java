package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u001a\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0002\u001a3\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u0012*\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0014H\u0086H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"BROKEN", "Lkotlinx/coroutines/internal/Symbol;", "CANCELLED", "MAX_SPIN_CYCLES", "", "PERMIT", "SEGMENT_SIZE", "TAKEN", "Semaphore", "Lkotlinx/coroutines/sync/Semaphore;", "permits", "acquiredPermits", "createSegment", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "id", "", "prev", "withPermit", "T", "action", "Lkotlin/Function0;", "(Lkotlinx/coroutines/sync/Semaphore;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SemaphoreKt {
    private static final kotlinx.coroutines.internal.Symbol BROKEN = null;
    private static final kotlinx.coroutines.internal.Symbol CANCELLED = null;
    private static final int MAX_SPIN_CYCLES = 0;
    private static final kotlinx.coroutines.internal.Symbol PERMIT = null;
    private static final int SEGMENT_SIZE = 0;
    private static final kotlinx.coroutines.internal.Symbol TAKEN = null;

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.SemaphoreKt$withPermit$1, reason: invalid class name */
    /* JADX INFO: compiled from: Semaphore.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {81}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.sync.SemaphoreKt.AnonymousClass1> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.sync.SemaphoreKt.withPermit(r0, r0, r1)
                return r0
        }
    }

    static {
            r4 = 12
            r5 = 0
            java.lang.String r0 = "kotlinx.coroutines.semaphore.maxSpinCycles"
            r1 = 100
            r2 = 0
            r3 = 0
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r0, r1, r2, r3, r4, r5)
            kotlinx.coroutines.sync.SemaphoreKt.MAX_SPIN_CYCLES = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "PERMIT"
            r0.<init>(r1)
            kotlinx.coroutines.sync.SemaphoreKt.PERMIT = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "TAKEN"
            r0.<init>(r1)
            kotlinx.coroutines.sync.SemaphoreKt.TAKEN = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "BROKEN"
            r0.<init>(r1)
            kotlinx.coroutines.sync.SemaphoreKt.BROKEN = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "CANCELLED"
            r0.<init>(r1)
            kotlinx.coroutines.sync.SemaphoreKt.CANCELLED = r0
            r6 = 12
            r7 = 0
            java.lang.String r2 = "kotlinx.coroutines.semaphore.segmentSize"
            r3 = 16
            r4 = 0
            r5 = 0
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.sync.SemaphoreKt.SEGMENT_SIZE = r0
            return
    }

    public static final kotlinx.coroutines.sync.Semaphore Semaphore(int r1, int r2) {
            kotlinx.coroutines.sync.SemaphoreImpl r0 = new kotlinx.coroutines.sync.SemaphoreImpl
            r0.<init>(r1, r2)
            kotlinx.coroutines.sync.Semaphore r0 = (kotlinx.coroutines.sync.Semaphore) r0
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.sync.Semaphore Semaphore$default(int r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 2
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.sync.Semaphore r0 = Semaphore(r0, r1)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.sync.SemaphoreSegment access$createSegment(long r1, kotlinx.coroutines.sync.SemaphoreSegment r3) {
            kotlinx.coroutines.sync.SemaphoreSegment r0 = createSegment(r1, r3)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getBROKEN$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.SemaphoreKt.BROKEN
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCANCELLED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.SemaphoreKt.CANCELLED
            return r0
    }

    public static final /* synthetic */ int access$getMAX_SPIN_CYCLES$p() {
            int r0 = kotlinx.coroutines.sync.SemaphoreKt.MAX_SPIN_CYCLES
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getPERMIT$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.SemaphoreKt.PERMIT
            return r0
    }

    public static final /* synthetic */ int access$getSEGMENT_SIZE$p() {
            int r0 = kotlinx.coroutines.sync.SemaphoreKt.SEGMENT_SIZE
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getTAKEN$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.SemaphoreKt.TAKEN
            return r0
    }

    private static final kotlinx.coroutines.sync.SemaphoreSegment createSegment(long r2, kotlinx.coroutines.sync.SemaphoreSegment r4) {
            kotlinx.coroutines.sync.SemaphoreSegment r0 = new kotlinx.coroutines.sync.SemaphoreSegment
            r1 = 0
            r0.<init>(r2, r4, r1)
            return r0
    }

    public static final <T> java.lang.Object withPermit(kotlinx.coroutines.sync.Semaphore r4, kotlin.jvm.functions.Function0<? extends T> r5, kotlin.coroutines.Continuation<? super T> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.sync.SemaphoreKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.sync.SemaphoreKt$withPermit$1 r0 = (kotlinx.coroutines.sync.SemaphoreKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.sync.SemaphoreKt$withPermit$1 r0 = new kotlinx.coroutines.sync.SemaphoreKt$withPermit$1
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L39;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2c:
            r4 = 0
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.sync.Semaphore r1 = (kotlinx.coroutines.sync.Semaphore) r1
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4e
        L39:
            kotlin.ResultKt.throwOnFailure(r6)
            r2 = 0
            r0.L$0 = r4
            r0.L$1 = r5
            r3 = 1
            r0.label = r3
            java.lang.Object r3 = r4.acquire(r0)
            if (r3 != r1) goto L4c
            return r1
        L4c:
            r1 = r4
            r4 = r2
        L4e:
            java.lang.Object r2 = r5.invoke()     // Catch: java.lang.Throwable -> L58
            r1.release()
            return r2
        L58:
            r5 = move-exception
            r1.release()
            throw r5
    }

    private static final <T> java.lang.Object withPermit$$forInline(kotlinx.coroutines.sync.Semaphore r2, kotlin.jvm.functions.Function0<? extends T> r3, kotlin.coroutines.Continuation<? super T> r4) {
            r0 = 0
            r2.acquire(r4)
            java.lang.Object r1 = r3.invoke()     // Catch: java.lang.Throwable -> Lf
            r2.release()
            return r1
        Lf:
            r1 = move-exception
            r2.release()
            throw r1
    }
}
