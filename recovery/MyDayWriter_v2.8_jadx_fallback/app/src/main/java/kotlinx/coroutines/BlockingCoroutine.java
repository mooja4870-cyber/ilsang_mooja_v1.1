package kotlinx.coroutines;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u000b\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/BlockingCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "blockedThread", "Ljava/lang/Thread;", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/EventLoop;)V", "isScopedCoroutine", "", "()Z", "afterCompletion", "", "state", "", "joinBlocking", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class BlockingCoroutine<T> extends kotlinx.coroutines.AbstractCoroutine<T> {
    private final java.lang.Thread blockedThread;
    private final kotlinx.coroutines.EventLoop eventLoop;

    public BlockingCoroutine(kotlin.coroutines.CoroutineContext r2, java.lang.Thread r3, kotlinx.coroutines.EventLoop r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r0)
            r1.blockedThread = r3
            r1.eventLoop = r4
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void afterCompletion(java.lang.Object r3) {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread r1 = r2.blockedThread
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L20
            java.lang.Thread r0 = r2.blockedThread
            kotlinx.coroutines.AbstractTimeSource r1 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r1 == 0) goto L1a
            r1.unpark(r0)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 != 0) goto L20
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L20:
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    protected boolean isScopedCoroutine() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final T joinBlocking() {
            r7 = this;
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r0 == 0) goto L9
            r0.registerTimeLoopThread()
        L9:
            kotlinx.coroutines.EventLoop r0 = r7.eventLoop     // Catch: java.lang.Throwable -> L84
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L14
            kotlinx.coroutines.EventLoop.incrementUseCount$default(r0, r2, r1, r3)     // Catch: java.lang.Throwable -> L84
        L14:
        L15:
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L6b
            kotlinx.coroutines.EventLoop r0 = r7.eventLoop     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L25
            long r4 = r0.processNextEvent()     // Catch: java.lang.Throwable -> L7b
            goto L2a
        L25:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L2a:
            boolean r0 = r7.isCompleted()     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L43
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L3c
            r0.parkNanos(r7, r4)     // Catch: java.lang.Throwable -> L7b
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7b
            goto L3d
        L3c:
            r0 = r3
        L3d:
            if (r0 != 0) goto L15
            java.util.concurrent.locks.LockSupport.parkNanos(r7, r4)     // Catch: java.lang.Throwable -> L7b
            goto L15
        L43:
            kotlinx.coroutines.EventLoop r0 = r7.eventLoop     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L4a
            kotlinx.coroutines.EventLoop.decrementUseCount$default(r0, r2, r1, r3)     // Catch: java.lang.Throwable -> L84
        L4a:
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r0 == 0) goto L54
            r0.unregisterTimeLoopThread()
        L54:
            java.lang.Object r0 = r7.getState$kotlinx_coroutines_core()
            java.lang.Object r0 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L64
            r3 = r0
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
        L64:
            if (r3 != 0) goto L67
            return r0
        L67:
            r1 = 0
            java.lang.Throwable r2 = r3.cause
            throw r2
        L6b:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L7b
            r0.<init>()     // Catch: java.lang.Throwable -> L7b
            r4 = r0
            r5 = 0
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.lang.Throwable -> L7b
            r7.cancelCoroutine(r6)     // Catch: java.lang.Throwable -> L7b
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L7b
            throw r0     // Catch: java.lang.Throwable -> L7b
        L7b:
            r0 = move-exception
            kotlinx.coroutines.EventLoop r4 = r7.eventLoop     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L83
            kotlinx.coroutines.EventLoop.decrementUseCount$default(r4, r2, r1, r3)     // Catch: java.lang.Throwable -> L84
        L83:
            throw r0     // Catch: java.lang.Throwable -> L84
        L84:
            r0 = move-exception
            kotlinx.coroutines.AbstractTimeSource r1 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r1 == 0) goto L8e
            r1.unregisterTimeLoopThread()
        L8e:
            throw r0
    }
}
