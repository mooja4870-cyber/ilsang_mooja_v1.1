package androidx.lifecycle;

/* JADX INFO: compiled from: DispatchQueue.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0007J\b\u0010\u0010\u001a\u00020\fH\u0007J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\tH\u0003J\b\u0010\u0012\u001a\u00020\fH\u0007J\b\u0010\u0013\u001a\u00020\fH\u0007J\b\u0010\u0014\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/DispatchQueue;", "", "()V", "finished", "", "isDraining", "paused", "queue", "Ljava/util/Queue;", "Ljava/lang/Runnable;", "canRun", "dispatchAndEnqueue", "", "context", "Lkotlin/coroutines/CoroutineContext;", "runnable", "drainQueue", "enqueue", "finish", "pause", "resume", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DispatchQueue {
    private boolean finished;
    private boolean isDraining;
    private boolean paused;
    private final java.util.Queue<java.lang.Runnable> queue;

    /* JADX INFO: renamed from: $r8$lambda$QTUwShsnwO8ux11W0m-zm9OKBq8, reason: not valid java name */
    public static /* synthetic */ void m96$r8$lambda$QTUwShsnwO8ux11W0mzm9OKBq8(androidx.lifecycle.DispatchQueue r0, java.lang.Runnable r1) {
            dispatchAndEnqueue$lambda$2$lambda$1(r0, r1)
            return
    }

    public DispatchQueue() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.paused = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            java.util.Queue r0 = (java.util.Queue) r0
            r1.queue = r0
            return
    }

    private static final void dispatchAndEnqueue$lambda$2$lambda$1(androidx.lifecycle.DispatchQueue r1, java.lang.Runnable r2) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "$runnable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.enqueue(r2)
            return
    }

    private final void enqueue(java.lang.Runnable r3) {
            r2 = this;
            java.util.Queue<java.lang.Runnable> r0 = r2.queue
            boolean r0 = r0.offer(r3)
            if (r0 == 0) goto Lc
            r2.drainQueue()
            return
        Lc:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot enqueue any more runnables"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final boolean canRun() {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 != 0) goto Lb
            boolean r0 = r1.paused
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    public final void dispatchAndEnqueue(kotlin.coroutines.CoroutineContext r4, java.lang.Runnable r5) {
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "runnable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()
            kotlinx.coroutines.MainCoroutineDispatcher r0 = r0.getImmediate()
            r1 = 0
            boolean r2 = r0.isDispatchNeeded(r4)
            if (r2 != 0) goto L24
            boolean r2 = r3.canRun()
            if (r2 == 0) goto L20
            goto L24
        L20:
            r3.enqueue(r5)
            goto L2c
        L24:
            androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0 r2 = new androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0
            r2.<init>(r3, r5)
            r0.mo1712dispatch(r4, r2)
        L2c:
            return
    }

    public final void drainQueue() {
            r2 = this;
            boolean r0 = r2.isDraining
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1 = 0
            r2.isDraining = r0     // Catch: java.lang.Throwable -> L2d
        La:
            java.util.Queue<java.lang.Runnable> r0 = r2.queue     // Catch: java.lang.Throwable -> L2d
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L29
            boolean r0 = r2.canRun()     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L1b
            goto L29
        L1b:
            java.util.Queue<java.lang.Runnable> r0 = r2.queue     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L2d
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto La
            r0.run()     // Catch: java.lang.Throwable -> L2d
            goto La
        L29:
            r2.isDraining = r1
            return
        L2d:
            r0 = move-exception
            r2.isDraining = r1
            throw r0
    }

    public final void finish() {
            r1 = this;
            r0 = 1
            r1.finished = r0
            r1.drainQueue()
            return
    }

    public final void pause() {
            r1 = this;
            r0 = 1
            r1.paused = r0
            return
    }

    public final void resume() {
            r2 = this;
            boolean r0 = r2.paused
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r2.finished
            if (r0 != 0) goto L10
            r0 = 0
            r2.paused = r0
            r2.drainQueue()
            return
        L10:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot resume a finished dispatcher"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
