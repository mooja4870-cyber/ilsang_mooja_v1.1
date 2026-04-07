package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0012\u0010\u0016\u001a\u00020\u00132\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0010J\u0010\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\nH\u0016J\u0006\u0010\u001d\u001a\u00020\u0004J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "isActive", "", "()Z", "isEmpty", "isUnconfinedLoopActive", "isUnconfinedQueueEmpty", "nextTime", "", "getNextTime", "()J", "shared", "unconfinedQueue", "Lkotlin/collections/ArrayDeque;", "Lkotlinx/coroutines/DispatchedTask;", "useCount", "decrementUseCount", "", "unconfined", "delta", "dispatchUnconfined", "task", "incrementUseCount", "limitedParallelism", "parallelism", "", "processNextEvent", "processUnconfinedEvent", "shouldBeProcessedFromContext", "shutdown", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class EventLoop extends kotlinx.coroutines.CoroutineDispatcher {
    private boolean shared;
    private kotlin.collections.ArrayDeque<kotlinx.coroutines.DispatchedTask<?>> unconfinedQueue;
    private long useCount;

    public EventLoop() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void decrementUseCount$default(kotlinx.coroutines.EventLoop r0, boolean r1, int r2, java.lang.Object r3) {
            if (r3 != 0) goto Lb
            r2 = r2 & 1
            if (r2 == 0) goto L7
            r1 = 0
        L7:
            r0.decrementUseCount(r1)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: decrementUseCount"
            r0.<init>(r1)
            throw r0
    }

    private final long delta(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L8
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            goto La
        L8:
            r0 = 1
        La:
            return r0
    }

    public static /* synthetic */ void incrementUseCount$default(kotlinx.coroutines.EventLoop r0, boolean r1, int r2, java.lang.Object r3) {
            if (r3 != 0) goto Lb
            r2 = r2 & 1
            if (r2 == 0) goto L7
            r1 = 0
        L7:
            r0.incrementUseCount(r1)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: incrementUseCount"
            r0.<init>(r1)
            throw r0
    }

    public final void decrementUseCount(boolean r7) {
            r6 = this;
            long r0 = r6.useCount
            long r2 = r6.delta(r7)
            long r0 = r0 - r2
            r6.useCount = r0
            long r0 = r6.useCount
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L12
            return
        L12:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L2b
            r0 = 0
            long r4 = r6.useCount
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L21
            r1 = 1
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L25
            goto L2b
        L25:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L2b:
            boolean r0 = r6.shared
            if (r0 == 0) goto L32
            r6.shutdown()
        L32:
            return
    }

    public final void dispatchUnconfined(kotlinx.coroutines.DispatchedTask<?> r4) {
            r3 = this;
            kotlin.collections.ArrayDeque<kotlinx.coroutines.DispatchedTask<?>> r0 = r3.unconfinedQueue
            if (r0 != 0) goto Ld
            kotlin.collections.ArrayDeque r0 = new kotlin.collections.ArrayDeque
            r0.<init>()
            r1 = r0
            r2 = 0
            r3.unconfinedQueue = r1
        Ld:
            r0.addLast(r4)
            return
    }

    protected long getNextTime() {
            r4 = this;
            kotlin.collections.ArrayDeque<kotlinx.coroutines.DispatchedTask<?>> r0 = r4.unconfinedQueue
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto La
            return r1
        La:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L11
            goto L13
        L11:
            r1 = 0
        L13:
            return r1
    }

    public final void incrementUseCount(boolean r5) {
            r4 = this;
            long r0 = r4.useCount
            long r2 = r4.delta(r5)
            long r0 = r0 + r2
            r4.useCount = r0
            if (r5 != 0) goto Le
            r0 = 1
            r4.shared = r0
        Le:
            return
    }

    public final boolean isActive() {
            r4 = this;
            long r0 = r4.useCount
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    protected boolean isEmpty() {
            r1 = this;
            boolean r0 = r1.isUnconfinedQueueEmpty()
            return r0
    }

    public final boolean isUnconfinedLoopActive() {
            r5 = this;
            long r0 = r5.useCount
            r2 = 1
            long r3 = r5.delta(r2)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto Lc
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public final boolean isUnconfinedQueueEmpty() {
            r1 = this;
            kotlin.collections.ArrayDeque<kotlinx.coroutines.DispatchedTask<?>> r0 = r1.unconfinedQueue
            if (r0 == 0) goto L9
            boolean r0 = r0.isEmpty()
            goto La
        L9:
            r0 = 1
        La:
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int r2) {
            r1 = this;
            kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(r2)
            r0 = r1
            kotlinx.coroutines.CoroutineDispatcher r0 = (kotlinx.coroutines.CoroutineDispatcher) r0
            return r0
    }

    public long processNextEvent() {
            r2 = this;
            boolean r0 = r2.processUnconfinedEvent()
            if (r0 != 0) goto Lc
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final boolean processUnconfinedEvent() {
            r3 = this;
            kotlin.collections.ArrayDeque<kotlinx.coroutines.DispatchedTask<?>> r0 = r3.unconfinedQueue
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r2 = r0.removeFirstOrNull()
            kotlinx.coroutines.DispatchedTask r2 = (kotlinx.coroutines.DispatchedTask) r2
            if (r2 != 0) goto Lf
            return r1
        Lf:
            r2.run()
            r1 = 1
            return r1
    }

    public boolean shouldBeProcessedFromContext() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void shutdown() {
            r0 = this;
            return
    }
}
