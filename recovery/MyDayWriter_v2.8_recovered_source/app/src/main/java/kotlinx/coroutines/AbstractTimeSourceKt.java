package kotlinx.coroutines;

/* JADX INFO: compiled from: AbstractTimeSource.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\t\u0010\u0002\u001a\u00020\u0003H\u0081\b\u001a\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0080\b\u001a\t\u0010\u0007\u001a\u00020\u0003H\u0081\b\u001a\u0019\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0081\b\u001a\t\u0010\f\u001a\u00020\u0005H\u0081\b\u001a\t\u0010\r\u001a\u00020\u0005H\u0081\b\u001a\t\u0010\u000e\u001a\u00020\u0005H\u0081\b\u001a\u0011\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0081\b\u001a\t\u0010\u0012\u001a\u00020\u0005H\u0081\b\u001a\u0019\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0081\b\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"timeSource", "Lkotlinx/coroutines/AbstractTimeSource;", "currentTimeMillis", "", "mockTimeSource", "", "source", "nanoTime", "parkNanos", "blocker", "", "nanos", "registerTimeLoopThread", "trackTask", "unTrackTask", "unpark", "thread", "Ljava/lang/Thread;", "unregisterTimeLoopThread", "wrapTask", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AbstractTimeSourceKt {
    private static kotlinx.coroutines.AbstractTimeSource timeSource;

    static {
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.AbstractTimeSource access$getTimeSource$p() {
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.timeSource
            return r0
    }

    public static final /* synthetic */ void access$setTimeSource$p(kotlinx.coroutines.AbstractTimeSource r0) {
            kotlinx.coroutines.AbstractTimeSourceKt.timeSource = r0
            return
    }

    private static final long currentTimeMillis() {
            kotlinx.coroutines.AbstractTimeSource r0 = access$getTimeSource$p()
            if (r0 == 0) goto Lb
            long r0 = r0.currentTimeMillis()
            goto Lf
        Lb:
            long r0 = java.lang.System.currentTimeMillis()
        Lf:
            return r0
    }

    public static final void mockTimeSource(kotlinx.coroutines.AbstractTimeSource r1) {
            r0 = 0
            access$setTimeSource$p(r1)
            return
    }

    private static final long nanoTime() {
            kotlinx.coroutines.AbstractTimeSource r0 = access$getTimeSource$p()
            if (r0 == 0) goto Lb
            long r0 = r0.nanoTime()
            goto Lf
        Lb:
            long r0 = java.lang.System.nanoTime()
        Lf:
            return r0
    }

    private static final void parkNanos(java.lang.Object r1, long r2) {
            kotlinx.coroutines.AbstractTimeSource r0 = access$getTimeSource$p()
            if (r0 == 0) goto Lc
            r0.parkNanos(r1, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L12
            java.util.concurrent.locks.LockSupport.parkNanos(r1, r2)
        L12:
            return
    }

    private static final void registerTimeLoopThread() {
            kotlinx.coroutines.AbstractTimeSource r0 = access$getTimeSource$p()
            if (r0 == 0) goto L9
            r0.registerTimeLoopThread()
        L9:
            return
    }

    private static final void trackTask() {
            kotlinx.coroutines.AbstractTimeSource r0 = access$getTimeSource$p()
            if (r0 == 0) goto L9
            r0.trackTask()
        L9:
            return
    }

    private static final void unTrackTask() {
            kotlinx.coroutines.AbstractTimeSource r0 = access$getTimeSource$p()
            if (r0 == 0) goto L9
            r0.unTrackTask()
        L9:
            return
    }

    private static final void unpark(java.lang.Thread r1) {
            kotlinx.coroutines.AbstractTimeSource r0 = access$getTimeSource$p()
            if (r0 == 0) goto Lc
            r0.unpark(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L12
            java.util.concurrent.locks.LockSupport.unpark(r1)
        L12:
            return
    }

    private static final void unregisterTimeLoopThread() {
            kotlinx.coroutines.AbstractTimeSource r0 = access$getTimeSource$p()
            if (r0 == 0) goto L9
            r0.unregisterTimeLoopThread()
        L9:
            return
    }

    private static final java.lang.Runnable wrapTask(java.lang.Runnable r1) {
            kotlinx.coroutines.AbstractTimeSource r0 = access$getTimeSource$p()
            if (r0 == 0) goto Lc
            java.lang.Runnable r0 = r0.wrapTask(r1)
            if (r0 != 0) goto Ld
        Lc:
            r0 = r1
        Ld:
            return r0
    }
}
