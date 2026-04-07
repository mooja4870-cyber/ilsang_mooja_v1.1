package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u001c\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001d\u001a\u00060\u0013j\u0002`\u0014H\u0016J\u001c\u0010\u001a\u001a\u00020\u00182\n\u0010\u001d\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001c\u0010 \u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001d\u001a\u00060\u0013j\u0002`\u0014H\u0016J\u0014\u0010!\u001a\u00020\u00182\n\u0010\"\u001a\u00060\u0013j\u0002`\u0014H\u0016J\b\u0010#\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\t\u0010\u000f\u001a\u00020\u0010X\u0082\u0004R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\f\u0012\b\u0012\u00060\u0013j\u0002`\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lkotlinx/coroutines/scheduling/LimitingDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/scheduling/TaskContext;", "Ljava/util/concurrent/Executor;", "dispatcher", "Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "parallelism", "", "name", "", "taskMode", "(Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;ILjava/lang/String;I)V", "executor", "getExecutor", "()Ljava/util/concurrent/Executor;", "inFlightTasks", "Lkotlinx/atomicfu/AtomicInt;", "queue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "getTaskMode", "()I", "afterTask", "", "close", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "tailDispatch", "", "dispatchYield", "execute", "command", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class LimitingDispatcher extends kotlinx.coroutines.ExecutorCoroutineDispatcher implements kotlinx.coroutines.scheduling.TaskContext, java.util.concurrent.Executor {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater inFlightTasks$volatile$FU = null;
    private final kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher dispatcher;
    private volatile /* synthetic */ int inFlightTasks$volatile;
    private final java.lang.String name;
    private final int parallelism;
    private final java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> queue;
    private final int taskMode;

    static {
            java.lang.Class<kotlinx.coroutines.scheduling.LimitingDispatcher> r0 = kotlinx.coroutines.scheduling.LimitingDispatcher.class
            java.lang.String r1 = "inFlightTasks$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.scheduling.LimitingDispatcher.inFlightTasks$volatile$FU = r0
            return
    }

    public LimitingDispatcher(kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher r2, int r3, java.lang.String r4, int r5) {
            r1 = this;
            r1.<init>()
            r1.dispatcher = r2
            r1.parallelism = r3
            r1.name = r4
            r1.taskMode = r5
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r1.queue = r0
            return
    }

    private final void dispatch(java.lang.Runnable r5, boolean r6) {
            r4 = this;
            r0 = r5
        L1:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = getInFlightTasks$volatile$FU()
            int r1 = r1.incrementAndGet(r4)
            int r2 = r4.parallelism
            if (r1 > r2) goto L16
            kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher r2 = r4.dispatcher
            r3 = r4
            kotlinx.coroutines.scheduling.TaskContext r3 = (kotlinx.coroutines.scheduling.TaskContext) r3
            r2.dispatchWithContext$kotlinx_coroutines_core(r0, r3, r6)
            return
        L16:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r2 = r4.queue
            r2.add(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = getInFlightTasks$volatile$FU()
            int r2 = r2.decrementAndGet(r4)
            int r3 = r4.parallelism
            if (r2 < r3) goto L28
            return
        L28:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r2 = r4.queue
            java.lang.Object r2 = r2.poll()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 != 0) goto L33
            return
        L33:
            r0 = r2
            goto L1
    }

    private final /* synthetic */ int getInFlightTasks$volatile() {
            r1 = this;
            int r0 = r1.inFlightTasks$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getInFlightTasks$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.LimitingDispatcher.inFlightTasks$volatile$FU
            return r0
    }

    private final /* synthetic */ void setInFlightTasks$volatile(int r1) {
            r0 = this;
            r0.inFlightTasks$volatile = r1
            return
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    public void afterTask() {
            r4 = this;
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r4.queue
            java.lang.Object r0 = r0.poll()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1 = 1
            if (r0 == 0) goto L14
            kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher r2 = r4.dispatcher
            r3 = r4
            kotlinx.coroutines.scheduling.TaskContext r3 = (kotlinx.coroutines.scheduling.TaskContext) r3
            r2.dispatchWithContext$kotlinx_coroutines_core(r0, r3, r1)
            return
        L14:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = getInFlightTasks$volatile$FU()
            r2.decrementAndGet(r4)
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r2 = r4.queue
            java.lang.Object r2 = r2.poll()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 != 0) goto L26
            return
        L26:
            r4.dispatch(r2, r1)
            return
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Close cannot be invoked on LimitingBlockingDispatcher"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo1712dispatch(kotlin.coroutines.CoroutineContext r2, java.lang.Runnable r3) {
            r1 = this;
            r0 = 0
            r1.dispatch(r3, r0)
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(kotlin.coroutines.CoroutineContext r2, java.lang.Runnable r3) {
            r1 = this;
            r0 = 1
            r1.dispatch(r3, r0)
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r2) {
            r1 = this;
            r0 = 0
            r1.dispatch(r2, r0)
            return
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            r0 = r1
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            return r0
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    public int getTaskMode() {
            r1 = this;
            int r0 = r1.taskMode
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.name
            if (r0 != 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "[dispatcher = "
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher r1 = r2.dispatcher
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L27:
            return r0
    }
}
