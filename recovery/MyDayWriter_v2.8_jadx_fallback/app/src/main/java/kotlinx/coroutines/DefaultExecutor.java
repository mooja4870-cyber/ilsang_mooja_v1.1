package kotlinx.coroutines;

/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\u0014\u0010 \u001a\u00020\u001e2\n\u0010!\u001a\u00060\u0002j\u0002`\u0003H\u0016J\r\u0010\"\u001a\u00020\u001eH\u0000¢\u0006\u0002\b#J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\b2\n\u0010'\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0015H\u0002J\u0018\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020.H\u0014J\b\u0010/\u001a\u00020\u001eH\u0016J\b\u00100\u001a\u00020\u001eH\u0016J\b\u00101\u001a\u00020\u001eH\u0002J\u000e\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0004R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00064"}, d2 = {"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopImplBase;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "()V", "ACTIVE", "", "DEFAULT_KEEP_ALIVE_MS", "", "FRESH", "KEEP_ALIVE_NANOS", "SHUTDOWN", "SHUTDOWN_ACK", "SHUTDOWN_REQ", "THREAD_NAME", "", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "debugStatus", "isShutDown", "", "()Z", "isShutdownRequested", "isThreadPresent", "isThreadPresent$kotlinx_coroutines_core", "thread", "getThread", "()Ljava/lang/Thread;", "acknowledgeShutdownIfNeeded", "", "createThreadSync", "enqueue", "task", "ensureStarted", "ensureStarted$kotlinx_coroutines_core", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "block", "context", "Lkotlin/coroutines/CoroutineContext;", "notifyStartup", "reschedule", "now", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "run", "shutdown", "shutdownError", "shutdownForTests", "timeout", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultExecutor extends kotlinx.coroutines.EventLoopImplBase implements java.lang.Runnable {
    private static final int ACTIVE = 1;
    private static final long DEFAULT_KEEP_ALIVE_MS = 1000;
    private static final int FRESH = 0;
    public static final kotlinx.coroutines.DefaultExecutor INSTANCE = null;
    private static final long KEEP_ALIVE_NANOS = 0;
    private static final int SHUTDOWN = 4;
    private static final int SHUTDOWN_ACK = 3;
    private static final int SHUTDOWN_REQ = 2;
    public static final java.lang.String THREAD_NAME = "kotlinx.coroutines.DefaultExecutor";
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;

    static {
            kotlinx.coroutines.DefaultExecutor r0 = new kotlinx.coroutines.DefaultExecutor
            r0.<init>()
            kotlinx.coroutines.DefaultExecutor.INSTANCE = r0
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            kotlinx.coroutines.EventLoop r0 = (kotlinx.coroutines.EventLoop) r0
            r1 = 1
            r2 = 0
            r3 = 0
            kotlinx.coroutines.EventLoop.incrementUseCount$default(r0, r3, r1, r2)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r3 = "kotlinx.coroutines.DefaultExecutor.keepAlive"
            java.lang.Long r1 = java.lang.Long.getLong(r3, r1)     // Catch: java.lang.SecurityException -> L1f
            goto L24
        L1f:
            r3 = move-exception
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L24:
            long r1 = r1.longValue()
            long r0 = r0.toNanos(r1)
            kotlinx.coroutines.DefaultExecutor.KEEP_ALIVE_NANOS = r0
            return
    }

    private DefaultExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    private final synchronized void acknowledgeShutdownIfNeeded() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isShutdownRequested()     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L9
            monitor-exit(r1)
            return
        L9:
            r0 = 3
            kotlinx.coroutines.DefaultExecutor.debugStatus = r0     // Catch: java.lang.Throwable -> L1c
            r1.resetAll()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)     // Catch: java.lang.Throwable -> L1c
            r0 = r1
            java.lang.Object r0 = (java.lang.Object) r0     // Catch: java.lang.Throwable -> L1c
            r0.notifyAll()     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r1)
            return
        L1c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r0
    }

    private final synchronized java.lang.Thread createThreadSync() {
            r4 = this;
            monitor-enter(r4)
            java.lang.Thread r0 = kotlinx.coroutines.DefaultExecutor._thread     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L27
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L29
            r1 = r4
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "kotlinx.coroutines.DefaultExecutor"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L29
            r1 = r0
            r2 = 0
            kotlinx.coroutines.DefaultExecutor._thread = r1     // Catch: java.lang.Throwable -> L29
            java.lang.Class r3 = r4.getClass()     // Catch: java.lang.Throwable -> L29
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L29
            r1.setContextClassLoader(r3)     // Catch: java.lang.Throwable -> L29
            r3 = 1
            r1.setDaemon(r3)     // Catch: java.lang.Throwable -> L29
            r1.start()     // Catch: java.lang.Throwable -> L29
        L27:
            monitor-exit(r4)
            return r0
        L29:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            throw r0
    }

    private static /* synthetic */ void get_thread$annotations() {
            return
    }

    private final boolean isShutDown() {
            r2 = this;
            int r0 = kotlinx.coroutines.DefaultExecutor.debugStatus
            r1 = 4
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    private final boolean isShutdownRequested() {
            r2 = this;
            int r0 = kotlinx.coroutines.DefaultExecutor.debugStatus
            r1 = 2
            if (r0 == r1) goto Lb
            r1 = 3
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    private final synchronized boolean notifyStartup() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isShutdownRequested()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto La
            monitor-exit(r2)
            r0 = 0
            return r0
        La:
            r0 = 1
            kotlinx.coroutines.DefaultExecutor.debugStatus = r0     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r1)     // Catch: java.lang.Throwable -> L1a
            r1 = r2
            java.lang.Object r1 = (java.lang.Object) r1     // Catch: java.lang.Throwable -> L1a
            r1.notifyAll()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)
            return r0
        L1a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    private final void shutdownError() {
            r2 = this;
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r1 = "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    public void enqueue(java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.isShutDown()
            if (r0 == 0) goto L9
            r1.shutdownError()
        L9:
            super.enqueue(r2)
            return
    }

    public final synchronized void ensureStarted$kotlinx_coroutines_core() {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L4c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            r0 = 0
            java.lang.Thread r3 = kotlinx.coroutines.DefaultExecutor._thread     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == 0) goto L14
            goto L1a
        L14:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L4c
            r0.<init>()     // Catch: java.lang.Throwable -> L4c
            throw r0     // Catch: java.lang.Throwable -> L4c
        L1a:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L35
            r0 = 0
            int r3 = kotlinx.coroutines.DefaultExecutor.debugStatus     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L2c
            int r3 = kotlinx.coroutines.DefaultExecutor.debugStatus     // Catch: java.lang.Throwable -> L4c
            r4 = 3
            if (r3 != r4) goto L2b
            goto L2c
        L2b:
            r1 = r2
        L2c:
            if (r1 == 0) goto L2f
            goto L35
        L2f:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L4c
            r0.<init>()     // Catch: java.lang.Throwable -> L4c
            throw r0     // Catch: java.lang.Throwable -> L4c
        L35:
            kotlinx.coroutines.DefaultExecutor.debugStatus = r2     // Catch: java.lang.Throwable -> L4c
            r5.createThreadSync()     // Catch: java.lang.Throwable -> L4c
        L3a:
            int r0 = kotlinx.coroutines.DefaultExecutor.debugStatus     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto L4a
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r0)     // Catch: java.lang.Throwable -> L4c
            r0 = r5
            java.lang.Object r0 = (java.lang.Object) r0     // Catch: java.lang.Throwable -> L4c
            r0.wait()     // Catch: java.lang.Throwable -> L4c
            goto L3a
        L4a:
            monitor-exit(r5)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4c
            throw r0
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    protected java.lang.Thread getThread() {
            r1 = this;
            java.lang.Thread r0 = kotlinx.coroutines.DefaultExecutor._thread
            if (r0 != 0) goto L8
            java.lang.Thread r0 = r1.createThreadSync()
        L8:
            return r0
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.Delay
    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r2, java.lang.Runnable r4, kotlin.coroutines.CoroutineContext r5) {
            r1 = this;
            kotlinx.coroutines.DisposableHandle r0 = r1.scheduleInvokeOnTimeout(r2, r4)
            return r0
    }

    public final boolean isThreadPresent$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.Thread r0 = kotlinx.coroutines.DefaultExecutor._thread
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    protected void reschedule(long r1, kotlinx.coroutines.EventLoopImplBase.DelayedTask r3) {
            r0 = this;
            r0.shutdownError()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r14 = this;
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            r1 = r14
            kotlinx.coroutines.EventLoop r1 = (kotlinx.coroutines.EventLoop) r1
            r0.setEventLoop$kotlinx_coroutines_core(r1)
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r0 == 0) goto L11
            r0.registerTimeLoopThread()
        L11:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 0
            boolean r3 = r14.notifyStartup()     // Catch: java.lang.Throwable -> Lbf
            if (r3 != 0) goto L36
            kotlinx.coroutines.DefaultExecutor._thread = r2
            r14.acknowledgeShutdownIfNeeded()
            kotlinx.coroutines.AbstractTimeSource r2 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r2 == 0) goto L2c
            r2.unregisterTimeLoopThread()
        L2c:
            boolean r2 = r14.isEmpty()
            if (r2 != 0) goto L35
            r14.getThread()
        L35:
            return
        L36:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> Lbf
            long r3 = r14.processNextEvent()     // Catch: java.lang.Throwable -> Lbf
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L84
            kotlinx.coroutines.AbstractTimeSource r7 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()     // Catch: java.lang.Throwable -> Lbf
            if (r7 == 0) goto L54
            long r10 = r7.nanoTime()     // Catch: java.lang.Throwable -> Lbf
            goto L58
        L54:
            long r10 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Lbf
        L58:
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 != 0) goto L60
            long r5 = kotlinx.coroutines.DefaultExecutor.KEEP_ALIVE_NANOS     // Catch: java.lang.Throwable -> Lbf
            long r0 = r10 + r5
        L60:
            long r5 = r0 - r10
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 > 0) goto L7e
            kotlinx.coroutines.DefaultExecutor._thread = r2
            r14.acknowledgeShutdownIfNeeded()
            kotlinx.coroutines.AbstractTimeSource r2 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r2 == 0) goto L74
            r2.unregisterTimeLoopThread()
        L74:
            boolean r2 = r14.isEmpty()
            if (r2 != 0) goto L7d
            r14.getThread()
        L7d:
            return
        L7e:
            long r12 = kotlin.ranges.RangesKt.coerceAtMost(r3, r5)     // Catch: java.lang.Throwable -> Lbf
            r3 = r12
            goto L89
        L84:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L89:
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L36
            boolean r5 = r14.isShutdownRequested()     // Catch: java.lang.Throwable -> Lbf
            if (r5 == 0) goto Lab
            kotlinx.coroutines.DefaultExecutor._thread = r2
            r14.acknowledgeShutdownIfNeeded()
            kotlinx.coroutines.AbstractTimeSource r2 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r2 == 0) goto La1
            r2.unregisterTimeLoopThread()
        La1:
            boolean r2 = r14.isEmpty()
            if (r2 != 0) goto Laa
            r14.getThread()
        Laa:
            return
        Lab:
            kotlinx.coroutines.AbstractTimeSource r5 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()     // Catch: java.lang.Throwable -> Lbf
            if (r5 == 0) goto Lb7
            r5.parkNanos(r14, r3)     // Catch: java.lang.Throwable -> Lbf
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lbf
            goto Lb8
        Lb7:
            r5 = r2
        Lb8:
            if (r5 != 0) goto L36
            java.util.concurrent.locks.LockSupport.parkNanos(r14, r3)     // Catch: java.lang.Throwable -> Lbf
            goto L36
        Lbf:
            r0 = move-exception
            kotlinx.coroutines.DefaultExecutor._thread = r2
            r14.acknowledgeShutdownIfNeeded()
            kotlinx.coroutines.AbstractTimeSource r1 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r1 == 0) goto Lce
            r1.unregisterTimeLoopThread()
        Lce:
            boolean r1 = r14.isEmpty()
            if (r1 != 0) goto Ld7
            r14.getThread()
        Ld7:
            throw r0
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.EventLoop
    public void shutdown() {
            r1 = this;
            r0 = 4
            kotlinx.coroutines.DefaultExecutor.debugStatus = r0
            super.shutdown()
            return
    }

    public final synchronized void shutdownForTests(long r7) {
            r6 = this;
            monitor-enter(r6)
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4c
            long r0 = r0 + r7
            boolean r2 = r6.isShutdownRequested()     // Catch: java.lang.Throwable -> L4c
            if (r2 != 0) goto Lf
            r2 = 2
            kotlinx.coroutines.DefaultExecutor.debugStatus = r2     // Catch: java.lang.Throwable -> L4c
        Lf:
            int r2 = kotlinx.coroutines.DefaultExecutor.debugStatus     // Catch: java.lang.Throwable -> L4c
            r3 = 3
            if (r2 == r3) goto L47
            java.lang.Thread r2 = kotlinx.coroutines.DefaultExecutor._thread     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L47
            java.lang.Thread r2 = kotlinx.coroutines.DefaultExecutor._thread     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L2f
            r3 = 0
            kotlinx.coroutines.AbstractTimeSource r4 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L29
            r4.unpark(r2)     // Catch: java.lang.Throwable -> L4c
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4c
            goto L2a
        L29:
            r4 = 0
        L2a:
            if (r4 != 0) goto L2f
            java.util.concurrent.locks.LockSupport.unpark(r2)     // Catch: java.lang.Throwable -> L4c
        L2f:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4c
            long r2 = r0 - r2
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L47
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r4)     // Catch: java.lang.Throwable -> L4c
            r4 = r6
            java.lang.Object r4 = (java.lang.Object) r4     // Catch: java.lang.Throwable -> L4c
            r4.wait(r7)     // Catch: java.lang.Throwable -> L4c
            goto Lf
        L47:
            r2 = 0
            kotlinx.coroutines.DefaultExecutor.debugStatus = r2     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r6)
            return
        L4c:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4c
            throw r7
    }
}
