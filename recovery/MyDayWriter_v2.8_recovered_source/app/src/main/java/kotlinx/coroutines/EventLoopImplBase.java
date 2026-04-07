package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u0002:\u00043456B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aH\u0002J\u001a\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0019j\u0002`\u001aJ\u0014\u0010\u001f\u001a\u00020\u00172\n\u0010 \u001a\u00060\u0019j\u0002`\u001aH\u0016J\u0014\u0010!\u001a\u00020\f2\n\u0010 \u001a\u00060\u0019j\u0002`\u001aH\u0002J\b\u0010\"\u001a\u00020\u0013H\u0016J\b\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\u0017H\u0004J\u0016\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(J\u0018\u0010)\u001a\u00020*2\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(H\u0002J\u001c\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00132\n\u0010\u001e\u001a\u00060\u0019j\u0002`\u001aH\u0004J\u001e\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u00132\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001700H\u0016J\u0010\u00101\u001a\u00020\f2\u0006\u0010 \u001a\u00020(H\u0002J\b\u00102\u001a\u00020\u0017H\u0016R\u0011\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004R\t\u0010\u0007\u001a\u00020\bX\u0082\u0004R\u0011\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005X\u0082\u0004R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u00067"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;", "()V", "_delayed", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "_isCompleted", "Lkotlinx/atomicfu/AtomicBoolean;", "_queue", "", "value", "", "isCompleted", "()Z", "setCompleted", "(Z)V", "isEmpty", "nextTime", "", "getNextTime", "()J", "closeQueue", "", "dequeue", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "enqueue", "task", "enqueueImpl", "processNextEvent", "rescheduleAllDelayed", "resetAll", "schedule", "now", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "scheduleImpl", "", "scheduleInvokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "shouldUnpark", "shutdown", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "DelayedTaskQueue", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class EventLoopImplBase extends kotlinx.coroutines.EventLoopImplPlatform implements kotlinx.coroutines.Delay {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _delayed$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _isCompleted$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _queue$volatile$FU = null;
    private volatile /* synthetic */ java.lang.Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ java.lang.Object _queue$volatile;

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/EventLoopImplBase;JLkotlinx/coroutines/CancellableContinuation;)V", "run", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class DelayedResumeTask extends kotlinx.coroutines.EventLoopImplBase.DelayedTask {
        private final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cont;
        final /* synthetic */ kotlinx.coroutines.EventLoopImplBase this$0;

        public DelayedResumeTask(kotlinx.coroutines.EventLoopImplBase r1, long r2, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r0.cont = r4
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r0 = r4.cont
                kotlinx.coroutines.EventLoopImplBase r1 = r4.this$0
                r2 = 0
                kotlinx.coroutines.CoroutineDispatcher r1 = (kotlinx.coroutines.CoroutineDispatcher) r1
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                r0.resumeUndispatched(r1, r3)
                return
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r1 = r2.cont
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedRunnableTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "(JLjava/lang/Runnable;)V", "run", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class DelayedRunnableTask extends kotlinx.coroutines.EventLoopImplBase.DelayedTask {
        private final java.lang.Runnable block;

        public DelayedRunnableTask(long r1, java.lang.Runnable r3) {
                r0 = this;
                r0.<init>(r1)
                r0.block = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.lang.Runnable r0 = r1.block
                r0.run()
                return
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Runnable r1 = r2.block
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\tJ\b\u0010%\u001a\u00020&H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "nanoTime", "", "(J)V", "_heap", "value", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "compareTo", "other", "dispose", "", "scheduleTask", "now", "delayed", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "eventLoop", "Lkotlinx/coroutines/EventLoopImplBase;", "timeToExecute", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class DelayedTask implements java.lang.Runnable, java.lang.Comparable<kotlinx.coroutines.EventLoopImplBase.DelayedTask>, kotlinx.coroutines.DisposableHandle, kotlinx.coroutines.internal.ThreadSafeHeapNode {
        private volatile java.lang.Object _heap;
        private int index;
        public long nanoTime;

        public DelayedTask(long r2) {
                r1 = this;
                r1.<init>()
                r1.nanoTime = r2
                r0 = -1
                r1.index = r0
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(kotlinx.coroutines.EventLoopImplBase.DelayedTask r2) {
                r1 = this;
                r0 = r2
                kotlinx.coroutines.EventLoopImplBase$DelayedTask r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r0
                int r0 = r1.compareTo2(r0)
                return r0
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(kotlinx.coroutines.EventLoopImplBase.DelayedTask r6) {
                r5 = this;
                long r0 = r5.nanoTime
                long r2 = r6.nanoTime
                long r0 = r0 - r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto Le
                r2 = 1
                goto L15
            Le:
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 >= 0) goto L14
                r2 = -1
                goto L15
            L14:
                r2 = 0
            L15:
                return r2
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
                r6 = this;
                r0 = 0
                r1 = 0
                monitor-enter(r6)
                r2 = 0
                java.lang.Object r3 = r6._heap     // Catch: java.lang.Throwable -> L2c
                kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()     // Catch: java.lang.Throwable -> L2c
                if (r3 != r4) goto Lf
                monitor-exit(r6)
                return
            Lf:
                boolean r4 = r3 instanceof kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue     // Catch: java.lang.Throwable -> L2c
                if (r4 == 0) goto L17
                r4 = r3
                kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r4 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r4     // Catch: java.lang.Throwable -> L2c
                goto L18
            L17:
                r4 = 0
            L18:
                if (r4 == 0) goto L20
                r5 = r6
                kotlinx.coroutines.internal.ThreadSafeHeapNode r5 = (kotlinx.coroutines.internal.ThreadSafeHeapNode) r5     // Catch: java.lang.Throwable -> L2c
                r4.remove(r5)     // Catch: java.lang.Throwable -> L2c
            L20:
                kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()     // Catch: java.lang.Throwable -> L2c
                r6._heap = r4     // Catch: java.lang.Throwable -> L2c
                kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2c
                monitor-exit(r6)
                return
            L2c:
                r2 = move-exception
                monitor-exit(r6)
                throw r2
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public kotlinx.coroutines.internal.ThreadSafeHeap<?> getHeap() {
                r2 = this;
                java.lang.Object r0 = r2._heap
                boolean r1 = r0 instanceof kotlinx.coroutines.internal.ThreadSafeHeap
                if (r1 == 0) goto L9
                kotlinx.coroutines.internal.ThreadSafeHeap r0 = (kotlinx.coroutines.internal.ThreadSafeHeap) r0
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public int getIndex() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        public final int scheduleTask(long r23, kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue r25, kotlinx.coroutines.EventLoopImplBase r26) {
                r22 = this;
                r1 = r22
                r2 = r23
                r4 = r25
                r5 = 0
                r6 = 0
                monitor-enter(r22)
                r7 = 0
                java.lang.Object r0 = r1._heap     // Catch: java.lang.Throwable -> L79
                kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()     // Catch: java.lang.Throwable -> L79
                if (r0 != r8) goto L16
                monitor-exit(r22)
                r0 = 2
                return r0
            L16:
                r0 = r4
                kotlinx.coroutines.internal.ThreadSafeHeap r0 = (kotlinx.coroutines.internal.ThreadSafeHeap) r0     // Catch: java.lang.Throwable -> L79
                r8 = r0
                r9 = 0
                r10 = 0
                r11 = 0
                monitor-enter(r8)     // Catch: java.lang.Throwable -> L79
                r0 = 0
                kotlinx.coroutines.internal.ThreadSafeHeapNode r12 = r8.firstImpl()     // Catch: java.lang.Throwable -> L76
                kotlinx.coroutines.EventLoopImplBase$DelayedTask r12 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r12     // Catch: java.lang.Throwable -> L76
                r13 = 0
                boolean r14 = kotlinx.coroutines.EventLoopImplBase.access$isCompleted(r26)     // Catch: java.lang.Throwable -> L76
                if (r14 == 0) goto L31
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L79
                monitor-exit(r22)
                r0 = 1
                return r0
            L31:
                if (r12 != 0) goto L38
                r4.timeNow = r2     // Catch: java.lang.Throwable -> L76
                r16 = 0
                goto L58
            L38:
                r16 = 0
                long r14 = r12.nanoTime     // Catch: java.lang.Throwable -> L76
                long r18 = r14 - r2
                int r18 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
                if (r18 < 0) goto L45
                r18 = r2
                goto L47
            L45:
                r18 = r14
            L47:
                r20 = r18
                long r2 = r4.timeNow     // Catch: java.lang.Throwable -> L76
                long r2 = r20 - r2
                int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                if (r2 <= 0) goto L56
                r2 = r20
                r4.timeNow = r2     // Catch: java.lang.Throwable -> L76
                goto L58
            L56:
                r2 = r20
            L58:
                long r2 = r1.nanoTime     // Catch: java.lang.Throwable -> L76
                long r14 = r4.timeNow     // Catch: java.lang.Throwable -> L76
                long r2 = r2 - r14
                int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                if (r2 >= 0) goto L65
                long r2 = r4.timeNow     // Catch: java.lang.Throwable -> L76
                r1.nanoTime = r2     // Catch: java.lang.Throwable -> L76
            L65:
                r2 = r1
                kotlinx.coroutines.internal.ThreadSafeHeapNode r2 = (kotlinx.coroutines.internal.ThreadSafeHeapNode) r2     // Catch: java.lang.Throwable -> L76
                r8.addImpl(r2)     // Catch: java.lang.Throwable -> L76
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L79
                monitor-exit(r22)
                r0 = 0
                return r0
            L76:
                r0 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L79
                throw r0     // Catch: java.lang.Throwable -> L79
            L79:
                r0 = move-exception
                monitor-exit(r22)
                throw r0
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setHeap(kotlinx.coroutines.internal.ThreadSafeHeap<?> r3) {
                r2 = this;
                java.lang.Object r0 = r2._heap
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()
                if (r0 == r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L10
                r2._heap = r3
                return
            L10:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Failed requirement."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setIndex(int r1) {
                r0 = this;
                r0.index = r1
                return
        }

        public final boolean timeToExecute(long r5) {
                r4 = this;
                long r0 = r4.nanoTime
                long r0 = r5 - r0
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Delayed[nanos="
                java.lang.StringBuilder r0 = r0.append(r1)
                long r1 = r3.nanoTime
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "timeNow", "", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DelayedTaskQueue extends kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.EventLoopImplBase.DelayedTask> {
        public long timeNow;

        public DelayedTaskQueue(long r1) {
                r0 = this;
                r0.<init>()
                r0.timeNow = r1
                return
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_queue$volatile"
            java.lang.Class<kotlinx.coroutines.EventLoopImplBase> r2 = kotlinx.coroutines.EventLoopImplBase.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.EventLoopImplBase._queue$volatile$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_delayed$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.EventLoopImplBase._delayed$volatile$FU = r0
            java.lang.String r0 = "_isCompleted$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.EventLoopImplBase._isCompleted$volatile$FU = r0
            return
    }

    public EventLoopImplBase() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._isCompleted$volatile = r0
            return
    }

    public static final /* synthetic */ boolean access$isCompleted(kotlinx.coroutines.EventLoopImplBase r1) {
            boolean r0 = r1.isCompleted()
            return r0
    }

    private final void closeQueue() {
            r7 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L14
            r0 = 0
            boolean r0 = r7.isCompleted()
            if (r0 == 0) goto Le
            goto L14
        Le:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L14:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_queue$volatile$FU()
            r1 = r7
        L19:
            java.lang.Object r2 = r0.get(r7)
            r3 = 0
            if (r2 != 0) goto L31
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_queue$volatile$FU()
            r5 = 0
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r7, r5, r6)
            if (r4 == 0) goto L62
            return
        L31:
            boolean r4 = r2 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r4 == 0) goto L3c
            r4 = r2
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r4 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r4
            r4.close()
            return
        L3c:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r2 != r4) goto L44
            return
        L44:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r4 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            r5 = 8
            r6 = 1
            r4.<init>(r5, r6)
            java.lang.String r5 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r5)
            r5 = r2
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r4.addLast(r5)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = get_queue$volatile$FU()
            boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r5, r7, r2, r4)
            if (r5 == 0) goto L62
            return
        L62:
            goto L19
    }

    private final java.lang.Runnable dequeue() {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_queue$volatile$FU()
            r1 = r7
        L5:
            java.lang.Object r2 = r0.get(r7)
            r3 = 0
            r4 = 0
            if (r2 != 0) goto Lf
            return r4
        Lf:
            boolean r5 = r2 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r5 == 0) goto L36
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r4)
            r4 = r2
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r4 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r4
            java.lang.Object r4 = r4.removeFirstOrNull()
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN
            if (r4 == r5) goto L27
            r5 = r4
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            return r5
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = get_queue$volatile$FU()
            r6 = r2
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r6 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r6
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r6 = r6.next()
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r5, r7, r2, r6)
            goto L51
        L36:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r2 != r5) goto L3e
            return r4
        L3e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = get_queue$volatile$FU()
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r5, r7, r2, r4)
            if (r4 == 0) goto L51
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r4)
            r4 = r2
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            return r4
        L51:
            goto L5
    }

    private final boolean enqueueImpl(java.lang.Runnable r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_queue$volatile$FU()
            r1 = r7
        L5:
            java.lang.Object r2 = r0.get(r7)
            r3 = 0
            boolean r4 = r7.isCompleted()
            r5 = 0
            if (r4 == 0) goto L12
            return r5
        L12:
            r4 = 1
            if (r2 != 0) goto L22
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = get_queue$volatile$FU()
            r6 = 0
            boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r5, r7, r6, r8)
            if (r5 == 0) goto L70
            return r4
        L22:
            boolean r6 = r2 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r6 == 0) goto L48
            java.lang.String r6 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r6)
            r6 = r2
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r6 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r6
            int r6 = r6.addLast(r8)
            switch(r6) {
                case 0: goto L46;
                case 1: goto L37;
                case 2: goto L36;
                default: goto L35;
            }
        L35:
            goto L47
        L36:
            return r5
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_queue$volatile$FU()
            r5 = r2
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r5 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r5
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r5 = r5.next()
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r7, r2, r5)
            goto L47
        L46:
            return r4
        L47:
            goto L70
        L48:
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r2 != r6) goto L50
            return r5
        L50:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r5 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            r6 = 8
            r5.<init>(r6, r4)
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r6)
            r6 = r2
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r5.addLast(r6)
            r5.addLast(r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = get_queue$volatile$FU()
            boolean r6 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r6, r7, r2, r5)
            if (r6 == 0) goto L70
            return r4
        L70:
            goto L5
    }

    private final /* synthetic */ java.lang.Object get_delayed$volatile() {
            r1 = this;
            java.lang.Object r0 = r1._delayed$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_delayed$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._delayed$volatile$FU
            return r0
    }

    private final /* synthetic */ int get_isCompleted$volatile() {
            r1 = this;
            int r0 = r1._isCompleted$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater get_isCompleted$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._isCompleted$volatile$FU
            return r0
    }

    private final /* synthetic */ java.lang.Object get_queue$volatile() {
            r1 = this;
            java.lang.Object r0 = r1._queue$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_queue$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._queue$volatile$FU
            return r0
    }

    private final boolean isCompleted() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_isCompleted$volatile$FU()
            int r0 = r0.get(r1)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private final /* synthetic */ void loop$atomicfu(java.lang.Object r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r3.get(r2)
            r4.invoke(r0)
            goto L0
    }

    private final void rescheduleAllDelayed() {
            r3 = this;
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r0 == 0) goto Lb
            long r0 = r0.nanoTime()
            goto Lf
        Lb:
            long r0 = java.lang.System.nanoTime()
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = get_delayed$volatile$FU()
            java.lang.Object r2 = r2.get(r3)
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r2 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r2
            if (r2 == 0) goto L29
            kotlinx.coroutines.internal.ThreadSafeHeapNode r2 = r2.removeFirstOrNull()
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r2 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r2
            if (r2 != 0) goto L25
            goto L29
        L25:
            r3.reschedule(r0, r2)
            goto Lf
        L29:
            return
    }

    private final int scheduleImpl(long r6, kotlinx.coroutines.EventLoopImplBase.DelayedTask r8) {
            r5 = this;
            boolean r0 = r5.isCompleted()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_delayed$volatile$FU()
            java.lang.Object r0 = r0.get(r5)
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 != 0) goto L34
            r0 = r5
            kotlinx.coroutines.EventLoopImplBase r0 = (kotlinx.coroutines.EventLoopImplBase) r0
            r1 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = get_delayed$volatile$FU()
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r3 = new kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue
            r3.<init>(r6)
            r4 = 0
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r0, r4, r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = get_delayed$volatile$FU()
            java.lang.Object r2 = r2.get(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r0 = r2
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
        L34:
            int r1 = r8.scheduleTask(r6, r0, r5)
            return r1
    }

    private final void setCompleted(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_isCompleted$volatile$FU()
            r0.set(r1, r2)
            return
    }

    private final /* synthetic */ void set_delayed$volatile(java.lang.Object r1) {
            r0 = this;
            r0._delayed$volatile = r1
            return
    }

    private final /* synthetic */ void set_isCompleted$volatile(int r1) {
            r0 = this;
            r0._isCompleted$volatile = r1
            return
    }

    private final /* synthetic */ void set_queue$volatile(java.lang.Object r1) {
            r0 = this;
            r0._queue$volatile = r1
            return
    }

    private final boolean shouldUnpark(kotlinx.coroutines.EventLoopImplBase.DelayedTask r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_delayed$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 == 0) goto L13
            kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r0.peek()
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r0
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 != r2) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public java.lang.Object delay(long r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r1 = this;
            java.lang.Object r0 = kotlinx.coroutines.Delay.DefaultImpls.delay(r1, r2, r4)
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public final void mo1712dispatch(kotlin.coroutines.CoroutineContext r1, java.lang.Runnable r2) {
            r0 = this;
            r0.enqueue(r2)
            return
    }

    public void enqueue(java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.enqueueImpl(r2)
            if (r0 == 0) goto La
            r1.unpark()
            goto Lf
        La:
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            r0.enqueue(r2)
        Lf:
            return
    }

    @Override // kotlinx.coroutines.EventLoop
    protected long getNextTime() {
            r8 = this;
            long r0 = super.getNextTime()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lb
            return r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_queue$volatile$FU()
            java.lang.Object r0 = r0.get(r8)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L31
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r1 == 0) goto L29
            r1 = r0
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L31
            return r2
        L29:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r0 != r1) goto L30
            return r4
        L30:
            return r2
        L31:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = get_delayed$volatile$FU()
            java.lang.Object r1 = r1.get(r8)
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r1 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r1
            if (r1 == 0) goto L5d
            kotlinx.coroutines.internal.ThreadSafeHeapNode r1 = r1.peek()
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r1 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r1
            if (r1 != 0) goto L46
            goto L5d
        L46:
            long r4 = r1.nanoTime
            kotlinx.coroutines.AbstractTimeSource r6 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r6 == 0) goto L53
            long r6 = r6.nanoTime()
            goto L57
        L53:
            long r6 = java.lang.System.nanoTime()
        L57:
            long r4 = r4 - r6
            long r2 = kotlin.ranges.RangesKt.coerceAtLeast(r4, r2)
            return r2
        L5d:
            return r4
    }

    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r2, java.lang.Runnable r4, kotlin.coroutines.CoroutineContext r5) {
            r1 = this;
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.Delay.DefaultImpls.invokeOnTimeout(r1, r2, r4, r5)
            return r0
    }

    @Override // kotlinx.coroutines.EventLoop
    protected boolean isEmpty() {
            r5 = this;
            boolean r0 = r5.isUnconfinedQueueEmpty()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_delayed$volatile$FU()
            java.lang.Object r0 = r0.get(r5)
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 == 0) goto L1b
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L1b
            return r1
        L1b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = get_queue$volatile$FU()
            java.lang.Object r2 = r2.get(r5)
            r3 = 1
            if (r2 != 0) goto L28
            r1 = r3
            goto L3b
        L28:
            boolean r4 = r2 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r4 == 0) goto L34
            r1 = r2
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r1
            boolean r1 = r1.isEmpty()
            goto L3b
        L34:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r2 != r4) goto L3b
            r1 = r3
        L3b:
            return r1
    }

    @Override // kotlinx.coroutines.EventLoop
    public long processNextEvent() {
            r18 = this;
            r1 = r18
            boolean r0 = r1.processUnconfinedEvent()
            r2 = 0
            if (r0 == 0) goto Lb
            return r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_delayed$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            r4 = r0
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r4 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r4
            if (r4 == 0) goto L71
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L71
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r0 == 0) goto L29
            long r5 = r0.nanoTime()
            goto L2d
        L29:
            long r5 = java.lang.System.nanoTime()
        L2d:
            r7 = r4
            kotlinx.coroutines.internal.ThreadSafeHeap r7 = (kotlinx.coroutines.internal.ThreadSafeHeap) r7
            r8 = 0
            r9 = 0
            r10 = 0
            monitor-enter(r7)
            r0 = 0
            kotlinx.coroutines.internal.ThreadSafeHeapNode r11 = r7.firstImpl()     // Catch: java.lang.Throwable -> L6e
            r12 = 0
            if (r11 != 0) goto L42
            monitor-exit(r7)
            r16 = r2
            goto L66
        L42:
            r13 = r11
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r13 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r13     // Catch: java.lang.Throwable -> L6e
            r14 = 0
            boolean r15 = r13.timeToExecute(r5)     // Catch: java.lang.Throwable -> L6e
            r16 = r2
            r2 = 0
            if (r15 == 0) goto L57
            r3 = r13
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L6e
            boolean r3 = r1.enqueueImpl(r3)     // Catch: java.lang.Throwable -> L6e
            goto L58
        L57:
            r3 = r2
        L58:
            if (r3 == 0) goto L61
            kotlinx.coroutines.internal.ThreadSafeHeapNode r2 = r7.removeAtImpl(r2)     // Catch: java.lang.Throwable -> L6e
            r12 = r2
            goto L62
        L61:
        L62:
            monitor-exit(r7)
        L66:
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r12 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r12
            if (r12 != 0) goto L6b
            goto L73
        L6b:
            r2 = r16
            goto L2d
        L6e:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L71:
            r16 = r2
        L73:
            java.lang.Runnable r0 = r1.dequeue()
            if (r0 == 0) goto L80
            r2 = 0
            r3 = 0
            r0.run()
            return r16
        L80:
            long r2 = r1.getNextTime()
            return r2
    }

    protected final void resetAll() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_queue$volatile$FU()
            r1 = 0
            r0.set(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_delayed$volatile$FU()
            r0.set(r2, r1)
            return
    }

    public final void schedule(long r3, kotlinx.coroutines.EventLoopImplBase.DelayedTask r5) {
            r2 = this;
            int r0 = r2.scheduleImpl(r3, r5)
            switch(r0) {
                case 0: goto L19;
                case 1: goto L15;
                case 2: goto L14;
                default: goto L8;
            }
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected result"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L14:
            goto L22
        L15:
            r2.reschedule(r3, r5)
            goto L22
        L19:
            boolean r0 = r2.shouldUnpark(r5)
            if (r0 == 0) goto L22
            r2.unpark()
        L22:
            return
    }

    protected final kotlinx.coroutines.DisposableHandle scheduleInvokeOnTimeout(long r9, java.lang.Runnable r11) {
            r8 = this;
            long r0 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r9)
            r2 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L30
            kotlinx.coroutines.AbstractTimeSource r2 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r2 == 0) goto L18
            long r2 = r2.nanoTime()
            goto L1c
        L18:
            long r2 = java.lang.System.nanoTime()
        L1c:
            kotlinx.coroutines.EventLoopImplBase$DelayedRunnableTask r4 = new kotlinx.coroutines.EventLoopImplBase$DelayedRunnableTask
            long r5 = r2 + r0
            r4.<init>(r5, r11)
            r5 = r4
            r6 = 0
            r7 = r5
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r7 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r7
            r8.schedule(r2, r7)
            kotlinx.coroutines.DisposableHandle r4 = (kotlinx.coroutines.DisposableHandle) r4
            goto L35
        L30:
            kotlinx.coroutines.NonDisposableHandle r2 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            r4 = r2
            kotlinx.coroutines.DisposableHandle r4 = (kotlinx.coroutines.DisposableHandle) r4
        L35:
            return r4
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo1713scheduleResumeAfterDelay(long r8, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r10) {
            r7 = this;
            long r0 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r8)
            r2 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L32
            kotlinx.coroutines.AbstractTimeSource r2 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r2 == 0) goto L18
            long r2 = r2.nanoTime()
            goto L1c
        L18:
            long r2 = java.lang.System.nanoTime()
        L1c:
            kotlinx.coroutines.EventLoopImplBase$DelayedResumeTask r4 = new kotlinx.coroutines.EventLoopImplBase$DelayedResumeTask
            long r5 = r2 + r0
            r4.<init>(r7, r5, r10)
            r5 = 0
            r6 = r4
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r6 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r6
            r7.schedule(r2, r6)
            r6 = r4
            kotlinx.coroutines.DisposableHandle r6 = (kotlinx.coroutines.DisposableHandle) r6
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(r10, r6)
        L32:
            return
    }

    @Override // kotlinx.coroutines.EventLoop
    public void shutdown() {
            r4 = this;
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            r0.resetEventLoop$kotlinx_coroutines_core()
            r0 = 1
            r4.setCompleted(r0)
            r4.closeQueue()
        Lc:
            long r0 = r4.processNextEvent()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lc
            r4.rescheduleAllDelayed()
            return
    }
}
