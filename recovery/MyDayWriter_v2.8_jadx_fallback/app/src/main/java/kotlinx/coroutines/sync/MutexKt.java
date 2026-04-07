package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r\u001a?\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f*\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0013H\u0086H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"HOLDS_LOCK_ANOTHER_OWNER", "", "HOLDS_LOCK_UNLOCKED", "HOLDS_LOCK_YES", "NO_OWNER", "Lkotlinx/coroutines/internal/Symbol;", "ON_LOCK_ALREADY_LOCKED_BY_OWNER", "TRY_LOCK_ALREADY_LOCKED_BY_OWNER", "TRY_LOCK_FAILED", "TRY_LOCK_SUCCESS", "Mutex", "Lkotlinx/coroutines/sync/Mutex;", "locked", "", "withLock", "T", "owner", "", "action", "Lkotlin/Function0;", "(Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MutexKt {
    private static final int HOLDS_LOCK_ANOTHER_OWNER = 2;
    private static final int HOLDS_LOCK_UNLOCKED = 0;
    private static final int HOLDS_LOCK_YES = 1;
    private static final kotlinx.coroutines.internal.Symbol NO_OWNER = null;
    private static final kotlinx.coroutines.internal.Symbol ON_LOCK_ALREADY_LOCKED_BY_OWNER = null;
    private static final int TRY_LOCK_ALREADY_LOCKED_BY_OWNER = 2;
    private static final int TRY_LOCK_FAILED = 1;
    private static final int TRY_LOCK_SUCCESS = 0;

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.MutexKt$withLock$1, reason: invalid class name */
    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {120}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.sync.MutexKt.AnonymousClass1> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.sync.MutexKt.withLock(r0, r0, r0, r1)
                return r0
        }
    }

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NO_OWNER"
            r0.<init>(r1)
            kotlinx.coroutines.sync.MutexKt.NO_OWNER = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "ALREADY_LOCKED_BY_OWNER"
            r0.<init>(r1)
            kotlinx.coroutines.sync.MutexKt.ON_LOCK_ALREADY_LOCKED_BY_OWNER = r0
            return
    }

    public static final kotlinx.coroutines.sync.Mutex Mutex(boolean r1) {
            kotlinx.coroutines.sync.MutexImpl r0 = new kotlinx.coroutines.sync.MutexImpl
            r0.<init>(r1)
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.sync.Mutex Mutex$default(boolean r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.sync.Mutex r0 = Mutex(r0)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getNO_OWNER$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.MutexKt.NO_OWNER
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getON_LOCK_ALREADY_LOCKED_BY_OWNER$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.MutexKt.ON_LOCK_ALREADY_LOCKED_BY_OWNER
            return r0
    }

    public static final <T> java.lang.Object withLock(kotlinx.coroutines.sync.Mutex r4, java.lang.Object r5, kotlin.jvm.functions.Function0<? extends T> r6, kotlin.coroutines.Continuation<? super T> r7) {
            boolean r0 = r7 instanceof kotlinx.coroutines.sync.MutexKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r7
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = (kotlinx.coroutines.sync.MutexKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = new kotlinx.coroutines.sync.MutexKt$withLock$1
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L3b;
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
            java.lang.Object r5 = r0.L$2
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r6 = r0.L$1
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L55
        L3b:
            kotlin.ResultKt.throwOnFailure(r7)
            r2 = 0
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r3 = 1
            r0.label = r3
            java.lang.Object r3 = r4.lock(r5, r0)
            if (r3 != r1) goto L50
            return r1
        L50:
            r1 = r6
            r6 = r5
            r5 = r1
            r1 = r4
            r4 = r2
        L55:
            java.lang.Object r2 = r5.invoke()     // Catch: java.lang.Throwable -> L5f
            r1.unlock(r6)
            return r2
        L5f:
            r5 = move-exception
            r1.unlock(r6)
            throw r5
    }

    private static final <T> java.lang.Object withLock$$forInline(kotlinx.coroutines.sync.Mutex r2, java.lang.Object r3, kotlin.jvm.functions.Function0<? extends T> r4, kotlin.coroutines.Continuation<? super T> r5) {
            r0 = 0
            r2.lock(r3, r5)
            java.lang.Object r1 = r4.invoke()     // Catch: java.lang.Throwable -> Lf
            r2.unlock(r3)
            return r1
        Lf:
            r1 = move-exception
            r2.unlock(r3)
            throw r1
    }

    public static /* synthetic */ java.lang.Object withLock$default(kotlinx.coroutines.sync.Mutex r0, java.lang.Object r1, kotlin.jvm.functions.Function0 r2, kotlin.coroutines.Continuation r3, int r4, java.lang.Object r5) {
            r4 = r4 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r4 = 0
            r0.lock(r1, r3)
            java.lang.Object r5 = r2.invoke()     // Catch: java.lang.Throwable -> L14
            r0.unlock(r1)
            return r5
        L14:
            r5 = move-exception
            r0.unlock(r1)
            throw r5
    }
}
