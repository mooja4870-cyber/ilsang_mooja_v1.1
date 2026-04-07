package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\bH\u0004R\u0012\u0010\u0003\u001a\u00020\u0004X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/EventLoop;", "()V", "thread", "Ljava/lang/Thread;", "getThread", "()Ljava/lang/Thread;", "reschedule", "", "now", "", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "unpark", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class EventLoopImplPlatform extends kotlinx.coroutines.EventLoop {
    public EventLoopImplPlatform() {
            r0 = this;
            r0.<init>()
            return
    }

    protected abstract java.lang.Thread getThread();

    protected void reschedule(long r2, kotlinx.coroutines.EventLoopImplBase.DelayedTask r4) {
            r1 = this;
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            r0.schedule(r2, r4)
            return
    }

    protected final void unpark() {
            r2 = this;
            java.lang.Thread r0 = r2.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r1 == r0) goto L1c
            kotlinx.coroutines.AbstractTimeSource r1 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r1 == 0) goto L16
            r1.unpark(r0)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 != 0) goto L1c
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L1c:
            return
    }
}
