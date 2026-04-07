package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u0019\u0010\u0002\u001a\u00020\u00032\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\b\u001a\b\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\b\u0010\b\u001a\u00020\u0007H\u0001\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0001¨\u0006\f"}, d2 = {"createEventLoop", "Lkotlinx/coroutines/EventLoop;", "platformAutoreleasePool", "", "block", "Lkotlin/Function0;", "processNextEventInCurrentThread", "", "runSingleTaskFromCurrentSystemDispatcher", "isIoDispatcherThread", "", "Ljava/lang/Thread;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EventLoopKt {
    public static final kotlinx.coroutines.EventLoop createEventLoop() {
            kotlinx.coroutines.BlockingEventLoop r0 = new kotlinx.coroutines.BlockingEventLoop
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r0.<init>(r1)
            kotlinx.coroutines.EventLoop r0 = (kotlinx.coroutines.EventLoop) r0
            return r0
    }

    public static final boolean isIoDispatcherThread(java.lang.Thread r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r1
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r0
            boolean r0 = r0.isIo()
            return r0
    }

    public static final void platformAutoreleasePool(kotlin.jvm.functions.Function0<kotlin.Unit> r1) {
            r0 = 0
            r1.invoke()
            return
    }

    public static final long processNextEventInCurrentThread() {
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r0 = r0.currentOrNull$kotlinx_coroutines_core()
            if (r0 == 0) goto Ld
            long r0 = r0.processNextEvent()
            goto L12
        Ld:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L12:
            return r0
    }

    public static final long runSingleTaskFromCurrentSystemDispatcher() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker
            if (r1 == 0) goto L10
            r1 = r0
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r1 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r1
            long r1 = r1.runSingleTask()
            return r1
        L10:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected CoroutineScheduler.Worker, but got "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
