package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001(B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0097A¢\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\tj\u0002`\nH\u0016J-\u0010\u0019\u001a\u00020\u00112\n\u0010\u0018\u001a\u00060\tj\u0002`\n2\u0016\u0010\u001a\u001a\u0012\u0012\b\u0012\u00060\u001cR\u00020\u0000\u0012\u0004\u0012\u00020\u00110\u001bH\u0082\bJ\u001c\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\tj\u0002`\nH\u0017J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00132\n\u0010\u0018\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0096\u0001J\u0010\u0010!\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\"\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0002J\u001f\u0010#\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00132\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110%H\u0096\u0001J\b\u0010&\u001a\u00020'H\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\u0012\u0010\r\u001a\u00060\u000ej\u0002`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "dispatcher", "parallelism", "", "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "queue", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "runningWorkers", "Lkotlinx/atomicfu/AtomicInt;", "workerAllocationLock", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "delay", "", "time", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "dispatchInternal", "startWorker", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "dispatchYield", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "limitedParallelism", "obtainTaskOrDeallocateWorker", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "tryAllocateWorker", "", "Worker", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LimitedDispatcher extends kotlinx.coroutines.CoroutineDispatcher implements kotlinx.coroutines.Delay {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater runningWorkers$volatile$FU = null;
    private final /* synthetic */ kotlinx.coroutines.Delay $$delegate_0;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher;
    private final int parallelism;
    private final kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> queue;
    private volatile /* synthetic */ int runningWorkers$volatile;
    private final java.lang.Object workerAllocationLock;

    /* JADX INFO: compiled from: LimitedDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u0012\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "(Lkotlinx/coroutines/internal/LimitedDispatcher;Ljava/lang/Runnable;)V", "run", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class Worker implements java.lang.Runnable {
        private java.lang.Runnable currentTask;
        final /* synthetic */ kotlinx.coroutines.internal.LimitedDispatcher this$0;

        public Worker(kotlinx.coroutines.internal.LimitedDispatcher r1, java.lang.Runnable r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.currentTask = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                r0 = 0
            L1:
                java.lang.Runnable r1 = r4.currentTask     // Catch: java.lang.Throwable -> L9
                r1.run()     // Catch: java.lang.Throwable -> L9
                goto L11
            L9:
                r1 = move-exception
                kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
                kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r2, r1)
            L11:
                kotlinx.coroutines.internal.LimitedDispatcher r1 = r4.this$0
                java.lang.Runnable r1 = kotlinx.coroutines.internal.LimitedDispatcher.access$obtainTaskOrDeallocateWorker(r1)
                if (r1 != 0) goto L1a
                return
            L1a:
                r4.currentTask = r1
                int r0 = r0 + 1
                r1 = 16
                if (r0 < r1) goto L1
                kotlinx.coroutines.internal.LimitedDispatcher r1 = r4.this$0
                kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.internal.LimitedDispatcher.access$getDispatcher$p(r1)
                kotlinx.coroutines.internal.LimitedDispatcher r2 = r4.this$0
                kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
                boolean r1 = r1.isDispatchNeeded(r2)
                if (r1 == 0) goto L1
                kotlinx.coroutines.internal.LimitedDispatcher r1 = r4.this$0
                kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.internal.LimitedDispatcher.access$getDispatcher$p(r1)
                kotlinx.coroutines.internal.LimitedDispatcher r2 = r4.this$0
                kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
                r3 = r4
                java.lang.Runnable r3 = (java.lang.Runnable) r3
                r1.mo1712dispatch(r2, r3)
                return
        }
    }

    static {
            java.lang.Class<kotlinx.coroutines.internal.LimitedDispatcher> r0 = kotlinx.coroutines.internal.LimitedDispatcher.class
            java.lang.String r1 = "runningWorkers$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.internal.LimitedDispatcher.runningWorkers$volatile$FU = r0
            return
    }

    public LimitedDispatcher(kotlinx.coroutines.CoroutineDispatcher r3, int r4) {
            r2 = this;
            r2.<init>()
            r2.dispatcher = r3
            r2.parallelism = r4
            boolean r0 = r3 instanceof kotlinx.coroutines.Delay
            if (r0 == 0) goto Lf
            r0 = r3
            kotlinx.coroutines.Delay r0 = (kotlinx.coroutines.Delay) r0
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 != 0) goto L16
            kotlinx.coroutines.Delay r0 = kotlinx.coroutines.DefaultExecutorKt.getDefaultDelay()
        L16:
            r2.$$delegate_0 = r0
            kotlinx.coroutines.internal.LockFreeTaskQueue r0 = new kotlinx.coroutines.internal.LockFreeTaskQueue
            r1 = 0
            r0.<init>(r1)
            r2.queue = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.workerAllocationLock = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.CoroutineDispatcher access$getDispatcher$p(kotlinx.coroutines.internal.LimitedDispatcher r1) {
            kotlinx.coroutines.CoroutineDispatcher r0 = r1.dispatcher
            return r0
    }

    public static final /* synthetic */ java.lang.Runnable access$obtainTaskOrDeallocateWorker(kotlinx.coroutines.internal.LimitedDispatcher r1) {
            java.lang.Runnable r0 = r1.obtainTaskOrDeallocateWorker()
            return r0
    }

    private final void dispatchInternal(java.lang.Runnable r4, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.internal.LimitedDispatcher.Worker, kotlin.Unit> r5) {
            r3 = this;
            r0 = 0
            kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> r1 = r3.queue
            r1.addLast(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = getRunningWorkers$volatile$FU()
            int r1 = r1.get(r3)
            int r2 = r3.parallelism
            if (r1 < r2) goto L13
            return
        L13:
            boolean r1 = r3.tryAllocateWorker()
            if (r1 != 0) goto L1a
            return
        L1a:
            java.lang.Runnable r1 = r3.obtainTaskOrDeallocateWorker()
            if (r1 != 0) goto L21
            return
        L21:
            kotlinx.coroutines.internal.LimitedDispatcher$Worker r2 = new kotlinx.coroutines.internal.LimitedDispatcher$Worker
            r2.<init>(r3, r1)
            r5.invoke(r2)
            return
    }

    private final /* synthetic */ int getRunningWorkers$volatile() {
            r1 = this;
            int r0 = r1.runningWorkers$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getRunningWorkers$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.LimitedDispatcher.runningWorkers$volatile$FU
            return r0
    }

    private final java.lang.Runnable obtainTaskOrDeallocateWorker() {
            r6 = this;
        L1:
            kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> r0 = r6.queue
            java.lang.Object r0 = r0.removeFirstOrNull()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 != 0) goto L32
            java.lang.Object r1 = r6.workerAllocationLock
            r2 = 0
            r3 = 0
            monitor-enter(r1)
            r4 = 0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = getRunningWorkers$volatile$FU()     // Catch: java.lang.Throwable -> L2f
            r5.decrementAndGet(r6)     // Catch: java.lang.Throwable -> L2f
            kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> r5 = r6.queue     // Catch: java.lang.Throwable -> L2f
            int r5 = r5.getSize()     // Catch: java.lang.Throwable -> L2f
            if (r5 != 0) goto L25
            monitor-exit(r1)
            r1 = 0
            return r1
        L25:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = getRunningWorkers$volatile$FU()     // Catch: java.lang.Throwable -> L2f
            r5.incrementAndGet(r6)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)
            goto L1
        L2f:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L32:
            return r0
    }

    private final /* synthetic */ void setRunningWorkers$volatile(int r1) {
            r0 = this;
            r0.runningWorkers$volatile = r1
            return
    }

    private final boolean tryAllocateWorker() {
            r6 = this;
            java.lang.Object r0 = r6.workerAllocationLock
            r1 = 0
            r2 = 0
            monitor-enter(r0)
            r3 = 0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = getRunningWorkers$volatile$FU()     // Catch: java.lang.Throwable -> L21
            int r4 = r4.get(r6)     // Catch: java.lang.Throwable -> L21
            int r5 = r6.parallelism     // Catch: java.lang.Throwable -> L21
            if (r4 < r5) goto L16
            monitor-exit(r0)
            r0 = 0
            return r0
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = getRunningWorkers$volatile$FU()     // Catch: java.lang.Throwable -> L21
            r4.incrementAndGet(r6)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)
            r0 = 1
            return r0
        L21:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public java.lang.Object delay(long r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r1 = this;
            kotlinx.coroutines.Delay r0 = r1.$$delegate_0
            java.lang.Object r0 = r0.delay(r2, r4)
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo1712dispatch(kotlin.coroutines.CoroutineContext r9, java.lang.Runnable r10) {
            r8 = this;
            r0 = r8
            r1 = 0
            kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> r2 = r0.queue
            r2.addLast(r10)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = getRunningWorkers$volatile$FU()
            int r2 = r2.get(r0)
            int r3 = r0.parallelism
            if (r2 >= r3) goto L34
            boolean r2 = r0.tryAllocateWorker()
            if (r2 == 0) goto L34
            java.lang.Runnable r2 = r0.obtainTaskOrDeallocateWorker()
            if (r2 != 0) goto L20
            goto L34
        L20:
            kotlinx.coroutines.internal.LimitedDispatcher$Worker r3 = new kotlinx.coroutines.internal.LimitedDispatcher$Worker
            r3.<init>(r0, r2)
            r4 = 0
            kotlinx.coroutines.CoroutineDispatcher r5 = r8.dispatcher
            r6 = r8
            kotlin.coroutines.CoroutineContext r6 = (kotlin.coroutines.CoroutineContext) r6
            r7 = r3
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            r5.mo1712dispatch(r6, r7)
        L34:
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(kotlin.coroutines.CoroutineContext r9, java.lang.Runnable r10) {
            r8 = this;
            r0 = r8
            r1 = 0
            kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> r2 = r0.queue
            r2.addLast(r10)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = getRunningWorkers$volatile$FU()
            int r2 = r2.get(r0)
            int r3 = r0.parallelism
            if (r2 >= r3) goto L34
            boolean r2 = r0.tryAllocateWorker()
            if (r2 == 0) goto L34
            java.lang.Runnable r2 = r0.obtainTaskOrDeallocateWorker()
            if (r2 != 0) goto L20
            goto L34
        L20:
            kotlinx.coroutines.internal.LimitedDispatcher$Worker r3 = new kotlinx.coroutines.internal.LimitedDispatcher$Worker
            r3.<init>(r0, r2)
            r4 = 0
            kotlinx.coroutines.CoroutineDispatcher r5 = r8.dispatcher
            r6 = r8
            kotlin.coroutines.CoroutineContext r6 = (kotlin.coroutines.CoroutineContext) r6
            r7 = r3
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            r5.dispatchYield(r6, r7)
        L34:
            return
    }

    @Override // kotlinx.coroutines.Delay
    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r2, java.lang.Runnable r4, kotlin.coroutines.CoroutineContext r5) {
            r1 = this;
            kotlinx.coroutines.Delay r0 = r1.$$delegate_0
            kotlinx.coroutines.DisposableHandle r0 = r0.invokeOnTimeout(r2, r4, r5)
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int r2) {
            r1 = this;
            kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(r2)
            int r0 = r1.parallelism
            if (r2 < r0) goto Lb
            r0 = r1
            kotlinx.coroutines.CoroutineDispatcher r0 = (kotlinx.coroutines.CoroutineDispatcher) r0
            return r0
        Lb:
            kotlinx.coroutines.CoroutineDispatcher r0 = super.limitedParallelism(r2)
            return r0
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo1713scheduleResumeAfterDelay(long r2, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r4) {
            r1 = this;
            kotlinx.coroutines.Delay r0 = r1.$$delegate_0
            r0.mo1713scheduleResumeAfterDelay(r2, r4)
            return
    }
}
