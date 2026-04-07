package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0017J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/scheduling/DefaultIoScheduler;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "()V", "default", "Lkotlinx/coroutines/CoroutineDispatcher;", "executor", "getExecutor", "()Ljava/util/concurrent/Executor;", "close", "", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchYield", "execute", "command", "limitedParallelism", "parallelism", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultIoScheduler extends kotlinx.coroutines.ExecutorCoroutineDispatcher implements java.util.concurrent.Executor {
    public static final kotlinx.coroutines.scheduling.DefaultIoScheduler INSTANCE = null;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final kotlinx.coroutines.CoroutineDispatcher f3default = null;

    static {
            kotlinx.coroutines.scheduling.DefaultIoScheduler r0 = new kotlinx.coroutines.scheduling.DefaultIoScheduler
            r0.<init>()
            kotlinx.coroutines.scheduling.DefaultIoScheduler.INSTANCE = r0
            kotlinx.coroutines.scheduling.UnlimitedIoScheduler r0 = kotlinx.coroutines.scheduling.UnlimitedIoScheduler.INSTANCE
            r1 = 64
            int r2 = kotlinx.coroutines.internal.SystemPropsKt.getAVAILABLE_PROCESSORS()
            int r4 = kotlin.ranges.RangesKt.coerceAtLeast(r1, r2)
            r7 = 12
            r8 = 0
            java.lang.String r3 = "kotlinx.coroutines.io.parallelism"
            r5 = 0
            r6 = 0
            int r1 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r3, r4, r5, r6, r7, r8)
            kotlinx.coroutines.CoroutineDispatcher r0 = r0.limitedParallelism(r1)
            kotlinx.coroutines.scheduling.DefaultIoScheduler.f3default = r0
            return
    }

    private DefaultIoScheduler() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot be invoked on Dispatchers.IO"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo1712dispatch(kotlin.coroutines.CoroutineContext r2, java.lang.Runnable r3) {
            r1 = this;
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f3default
            r0.mo1712dispatch(r2, r3)
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(kotlin.coroutines.CoroutineContext r2, java.lang.Runnable r3) {
            r1 = this;
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f3default
            r0.dispatchYield(r2, r3)
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r2) {
            r1 = this;
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            r1.mo1712dispatch(r0, r2)
            return
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            r0 = r1
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int r2) {
            r1 = this;
            kotlinx.coroutines.scheduling.UnlimitedIoScheduler r0 = kotlinx.coroutines.scheduling.UnlimitedIoScheduler.INSTANCE
            kotlinx.coroutines.CoroutineDispatcher r0 = r0.limitedParallelism(r2)
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.IO"
            return r0
    }
}
