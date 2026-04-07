package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: WorkQueue.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001aH\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0016\u0010#\u001a\u0004\u0018\u00010\u00072\n\u0010$\u001a\u00060\tj\u0002`%H\u0002J\u001a\u0010&\u001a\u0004\u0018\u00010\u00072\u0006\u0010'\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\"\u0010(\u001a\u00020)2\n\u0010$\u001a\u00060\tj\u0002`%2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070+J$\u0010,\u001a\u00020)2\n\u0010$\u001a\u00060\tj\u0002`%2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070+H\u0002J\u000e\u0010-\u001a\u00020\u0018*\u0004\u0018\u00010\u0007H\u0002R\t\u0010\u0003\u001a\u00020\u0004X\u0082\u0004R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\t\u0010\f\u001a\u00020\u0004X\u0082\u0004R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000eX\u0082\u0004R\t\u0010\u000f\u001a\u00020\u0004X\u0082\u0004R\u0014\u0010\u0010\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006."}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "()V", "blockingTasksInBuffer", "Lkotlinx/atomicfu/AtomicInt;", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Lkotlinx/coroutines/scheduling/Task;", "bufferSize", "", "getBufferSize", "()I", "consumerIndex", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicRef;", "producerIndex", "size", "getSize$kotlinx_coroutines_core", "add", "task", "fair", "", "addLast", "offloadAllWorkTo", "", "globalQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "poll", "pollBlocking", "pollBuffer", "pollCpu", "pollTo", "queue", "pollWithExclusiveMode", "onlyBlocking", "stealWithExclusiveMode", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "tryExtractFromTheMiddle", "index", "trySteal", "", "stolenTaskRef", "Lkotlin/jvm/internal/Ref$ObjectRef;", "tryStealLastScheduled", "decrementIfBlocking", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WorkQueue {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater blockingTasksInBuffer$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater consumerIndex$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater lastScheduledTask$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater producerIndex$volatile$FU = null;
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private final java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> buffer;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ java.lang.Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "lastScheduledTask$volatile"
            java.lang.Class<kotlinx.coroutines.scheduling.WorkQueue> r2 = kotlinx.coroutines.scheduling.WorkQueue.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.scheduling.WorkQueue.lastScheduledTask$volatile$FU = r0
            java.lang.String r0 = "producerIndex$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.scheduling.WorkQueue.producerIndex$volatile$FU = r0
            java.lang.String r0 = "consumerIndex$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.scheduling.WorkQueue.consumerIndex$volatile$FU = r0
            java.lang.String r0 = "blockingTasksInBuffer$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.scheduling.WorkQueue.blockingTasksInBuffer$volatile$FU = r0
            return
    }

    public WorkQueue() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.buffer = r0
            return
    }

    public static /* synthetic */ kotlinx.coroutines.scheduling.Task add$default(kotlinx.coroutines.scheduling.WorkQueue r0, kotlinx.coroutines.scheduling.Task r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlinx.coroutines.scheduling.Task r0 = r0.add(r1, r2)
            return r0
    }

    private final kotlinx.coroutines.scheduling.Task addLast(kotlinx.coroutines.scheduling.Task r6) {
            r5 = this;
            int r0 = r5.getBufferSize()
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 != r1) goto L9
            return r6
        L9:
            r0 = r6
            r2 = 0
            kotlinx.coroutines.scheduling.TaskContext r3 = r0.taskContext
            int r3 = r3.getTaskMode()
            r4 = 1
            if (r3 != r4) goto L15
            goto L16
        L15:
            r4 = 0
        L16:
            if (r4 == 0) goto L1f
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getBlockingTasksInBuffer$volatile$FU()
            r0.incrementAndGet(r5)
        L1f:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getProducerIndex$volatile$FU()
            int r0 = r0.get(r5)
            r0 = r0 & r1
        L28:
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> r1 = r5.buffer
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L34
            java.lang.Thread.yield()
            goto L28
        L34:
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> r1 = r5.buffer
            r1.lazySet(r0, r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = getProducerIndex$volatile$FU()
            r1.incrementAndGet(r5)
            r1 = 0
            return r1
    }

    private final void decrementIfBlocking(kotlinx.coroutines.scheduling.Task r6) {
            r5 = this;
            if (r6 == 0) goto L2e
            r0 = r6
            r1 = 0
            kotlinx.coroutines.scheduling.TaskContext r2 = r0.taskContext
            int r2 = r2.getTaskMode()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L10
            r0 = r4
            goto L11
        L10:
            r0 = r3
        L11:
            if (r0 == 0) goto L2e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getBlockingTasksInBuffer$volatile$FU()
            int r0 = r0.decrementAndGet(r5)
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r1 == 0) goto L2e
            r1 = 0
            if (r0 < 0) goto L25
            r3 = r4
        L25:
            if (r3 == 0) goto L28
            goto L2e
        L28:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L2e:
            return
    }

    private final /* synthetic */ int getBlockingTasksInBuffer$volatile() {
            r1 = this;
            int r0 = r1.blockingTasksInBuffer$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getBlockingTasksInBuffer$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.blockingTasksInBuffer$volatile$FU
            return r0
    }

    private final int getBufferSize() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getProducerIndex$volatile$FU()
            int r0 = r0.get(r2)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = getConsumerIndex$volatile$FU()
            int r1 = r1.get(r2)
            int r0 = r0 - r1
            return r0
    }

    private final /* synthetic */ int getConsumerIndex$volatile() {
            r1 = this;
            int r0 = r1.consumerIndex$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getConsumerIndex$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.consumerIndex$volatile$FU
            return r0
    }

    private final /* synthetic */ java.lang.Object getLastScheduledTask$volatile() {
            r1 = this;
            java.lang.Object r0 = r1.lastScheduledTask$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getLastScheduledTask$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.lastScheduledTask$volatile$FU
            return r0
    }

    private final /* synthetic */ int getProducerIndex$volatile() {
            r1 = this;
            int r0 = r1.producerIndex$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getProducerIndex$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.producerIndex$volatile$FU
            return r0
    }

    private final kotlinx.coroutines.scheduling.Task pollBuffer() {
            r5 = this;
        L1:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getConsumerIndex$volatile$FU()
            int r0 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = getProducerIndex$volatile$FU()
            int r1 = r1.get(r5)
            int r1 = r0 - r1
            r2 = 0
            if (r1 != 0) goto L17
            return r2
        L17:
            r1 = r0 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = getConsumerIndex$volatile$FU()
            int r4 = r0 + 1
            boolean r3 = r3.compareAndSet(r5, r0, r4)
            if (r3 == 0) goto L1
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> r3 = r5.buffer
            java.lang.Object r2 = r3.getAndSet(r1, r2)
            kotlinx.coroutines.scheduling.Task r2 = (kotlinx.coroutines.scheduling.Task) r2
            if (r2 != 0) goto L30
            goto L1
        L30:
            r5.decrementIfBlocking(r2)
            return r2
    }

    private final boolean pollTo(kotlinx.coroutines.scheduling.GlobalQueue r3) {
            r2 = this;
            kotlinx.coroutines.scheduling.Task r0 = r2.pollBuffer()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r3.addLast(r0)
            r1 = 1
            return r1
    }

    private final kotlinx.coroutines.scheduling.Task pollWithExclusiveMode(boolean r7) {
            r6 = this;
        L1:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getLastScheduledTask$volatile$FU()
            java.lang.Object r0 = r0.get(r6)
            kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            r1 = 0
            if (r0 != 0) goto L10
            goto L2a
        L10:
            r2 = r0
            r3 = 0
            kotlinx.coroutines.scheduling.TaskContext r4 = r2.taskContext
            int r4 = r4.getTaskMode()
            r5 = 1
            if (r4 != r5) goto L1c
            goto L1d
        L1c:
            r5 = 0
        L1d:
            if (r5 != r7) goto L2a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = getLastScheduledTask$volatile$FU()
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r6, r0, r1)
            if (r1 == 0) goto L1
            return r0
        L2a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getConsumerIndex$volatile$FU()
            int r0 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = getProducerIndex$volatile$FU()
            int r2 = r2.get(r6)
        L3a:
            if (r0 == r2) goto L52
            if (r7 == 0) goto L49
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = getBlockingTasksInBuffer$volatile$FU()
            int r3 = r3.get(r6)
            if (r3 != 0) goto L49
            return r1
        L49:
            int r2 = r2 + (-1)
            kotlinx.coroutines.scheduling.Task r3 = r6.tryExtractFromTheMiddle(r2, r7)
            if (r3 == 0) goto L3a
            return r3
        L52:
            return r1
    }

    private final /* synthetic */ void setBlockingTasksInBuffer$volatile(int r1) {
            r0 = this;
            r0.blockingTasksInBuffer$volatile = r1
            return
    }

    private final /* synthetic */ void setConsumerIndex$volatile(int r1) {
            r0 = this;
            r0.consumerIndex$volatile = r1
            return
    }

    private final /* synthetic */ void setLastScheduledTask$volatile(java.lang.Object r1) {
            r0 = this;
            r0.lastScheduledTask$volatile = r1
            return
    }

    private final /* synthetic */ void setProducerIndex$volatile(int r1) {
            r0 = this;
            r0.producerIndex$volatile = r1
            return
    }

    private final kotlinx.coroutines.scheduling.Task stealWithExclusiveMode(int r6) {
            r5 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getConsumerIndex$volatile$FU()
            int r0 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = getProducerIndex$volatile$FU()
            int r1 = r1.get(r5)
            r2 = 1
            if (r6 != r2) goto L14
            goto L15
        L14:
            r2 = 0
        L15:
            r3 = 0
            if (r0 == r1) goto L30
            if (r2 == 0) goto L25
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = getBlockingTasksInBuffer$volatile$FU()
            int r4 = r4.get(r5)
            if (r4 != 0) goto L25
            return r3
        L25:
            int r3 = r0 + 1
            kotlinx.coroutines.scheduling.Task r0 = r5.tryExtractFromTheMiddle(r0, r2)
            if (r0 != 0) goto L2f
            r0 = r3
            goto L15
        L2f:
            return r0
        L30:
            return r3
    }

    private final kotlinx.coroutines.scheduling.Task tryExtractFromTheMiddle(int r8, boolean r9) {
            r7 = this;
            r0 = r8 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> r1 = r7.buffer
            java.lang.Object r1 = r1.get(r0)
            kotlinx.coroutines.scheduling.Task r1 = (kotlinx.coroutines.scheduling.Task) r1
            r2 = 0
            if (r1 == 0) goto L2e
            r3 = r1
            r4 = 0
            kotlinx.coroutines.scheduling.TaskContext r5 = r3.taskContext
            int r5 = r5.getTaskMode()
            r6 = 1
            if (r5 != r6) goto L19
            goto L1a
        L19:
            r6 = 0
        L1a:
            if (r6 != r9) goto L2e
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> r3 = r7.buffer
            boolean r3 = kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(r3, r0, r1, r2)
            if (r3 == 0) goto L2e
            if (r9 == 0) goto L2d
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = getBlockingTasksInBuffer$volatile$FU()
            r2.decrementAndGet(r7)
        L2d:
            return r1
        L2e:
            return r2
    }

    private final long tryStealLastScheduled(int r10, kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.scheduling.Task> r11) {
            r9 = this;
        L1:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getLastScheduledTask$volatile$FU()
            java.lang.Object r0 = r0.get(r9)
            kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            r1 = -2
            if (r0 != 0) goto L11
            return r1
        L11:
            r3 = r0
            r4 = 0
            r5 = r3
            r6 = 0
            kotlinx.coroutines.scheduling.TaskContext r7 = r5.taskContext
            int r7 = r7.getTaskMode()
            r8 = 1
            if (r7 != r8) goto L20
            r7 = r8
            goto L21
        L20:
            r7 = 0
        L21:
            if (r7 == 0) goto L24
            goto L25
        L24:
            r8 = 2
        L25:
            r3 = r8 & r10
            if (r3 != 0) goto L2a
            return r1
        L2a:
            kotlinx.coroutines.scheduling.SchedulerTimeSource r1 = kotlinx.coroutines.scheduling.TasksKt.schedulerTimeSource
            long r1 = r1.nanoTime()
            long r3 = r0.submissionTime
            long r3 = r1 - r3
            long r5 = kotlinx.coroutines.scheduling.TasksKt.WORK_STEALING_TIME_RESOLUTION_NS
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L3e
            long r5 = kotlinx.coroutines.scheduling.TasksKt.WORK_STEALING_TIME_RESOLUTION_NS
            long r5 = r5 - r3
            return r5
        L3e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = getLastScheduledTask$volatile$FU()
            r6 = 0
            boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r5, r9, r0, r6)
            if (r5 == 0) goto L4e
            r11.element = r0
            r5 = -1
            return r5
        L4e:
            goto L1
    }

    public final kotlinx.coroutines.scheduling.Task add(kotlinx.coroutines.scheduling.Task r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto L7
            kotlinx.coroutines.scheduling.Task r0 = r2.addLast(r3)
            return r0
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getLastScheduledTask$volatile$FU()
            java.lang.Object r0 = r0.getAndSet(r2, r3)
            kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            if (r0 != 0) goto L15
            r0 = 0
            return r0
        L15:
            kotlinx.coroutines.scheduling.Task r1 = r2.addLast(r0)
            return r1
    }

    public final int getSize$kotlinx_coroutines_core() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getLastScheduledTask$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L11
            int r0 = r1.getBufferSize()
            int r0 = r0 + 1
            goto L15
        L11:
            int r0 = r1.getBufferSize()
        L15:
            return r0
    }

    public final void offloadAllWorkTo(kotlinx.coroutines.scheduling.GlobalQueue r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getLastScheduledTask$volatile$FU()
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            if (r0 == 0) goto L11
            r1 = 0
            r3.addLast(r0)
        L11:
            boolean r0 = r2.pollTo(r3)
            if (r0 != 0) goto L11
            return
    }

    public final kotlinx.coroutines.scheduling.Task poll() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getLastScheduledTask$volatile$FU()
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            if (r0 != 0) goto L11
            kotlinx.coroutines.scheduling.Task r0 = r2.pollBuffer()
        L11:
            return r0
    }

    public final kotlinx.coroutines.scheduling.Task pollBlocking() {
            r1 = this;
            r0 = 1
            kotlinx.coroutines.scheduling.Task r0 = r1.pollWithExclusiveMode(r0)
            return r0
    }

    public final kotlinx.coroutines.scheduling.Task pollCpu() {
            r1 = this;
            r0 = 0
            kotlinx.coroutines.scheduling.Task r0 = r1.pollWithExclusiveMode(r0)
            return r0
    }

    public final long trySteal(int r4, kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.scheduling.Task> r5) {
            r3 = this;
            r0 = 3
            if (r4 != r0) goto L9
            kotlinx.coroutines.scheduling.Task r0 = r3.pollBuffer()
            goto Ld
        L9:
            kotlinx.coroutines.scheduling.Task r0 = r3.stealWithExclusiveMode(r4)
        Ld:
            if (r0 == 0) goto L15
            r5.element = r0
            r1 = -1
            return r1
        L15:
            long r1 = r3.tryStealLastScheduled(r4, r5)
            return r1
    }
}
