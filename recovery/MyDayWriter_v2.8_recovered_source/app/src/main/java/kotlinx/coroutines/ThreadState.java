package kotlinx.coroutines;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\rR\t\u0010\u0005\u001a\u00020\u0006X\u0082\u0004R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/ThreadState;", "Lkotlinx/coroutines/InternalCompletionHandler;", "job", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "_state", "Lkotlinx/atomicfu/AtomicInt;", "cancelHandle", "Lkotlinx/coroutines/DisposableHandle;", "targetThread", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "clearInterrupt", "", "invalidState", "", "state", "", "invoke", "cause", "", "setup", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ThreadState implements kotlinx.coroutines.InternalCompletionHandler {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _state$volatile$FU = null;
    private volatile /* synthetic */ int _state$volatile;
    private kotlinx.coroutines.DisposableHandle cancelHandle;
    private final kotlinx.coroutines.Job job;
    private final java.lang.Thread targetThread;

    static {
            java.lang.Class<kotlinx.coroutines.ThreadState> r0 = kotlinx.coroutines.ThreadState.class
            java.lang.String r1 = "_state$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.ThreadState._state$volatile$FU = r0
            return
    }

    public ThreadState(kotlinx.coroutines.Job r2) {
            r1 = this;
            r1.<init>()
            r1.job = r2
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1.targetThread = r0
            return
    }

    private final /* synthetic */ int get_state$volatile() {
            r1 = this;
            int r0 = r1._state$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater get_state$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.ThreadState._state$volatile$FU
            return r0
    }

    private final java.lang.Void invalidState(int r4) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal state "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final /* synthetic */ void loop$atomicfu(java.lang.Object r2, java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r4) {
            r1 = this;
        L0:
            int r0 = r3.get(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.invoke(r0)
            goto L0
    }

    private final /* synthetic */ void set_state$volatile(int r1) {
            r0 = this;
            r0._state$volatile = r1
            return
    }

    public final void clearInterrupt() {
            r6 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_state$volatile$FU()
            r1 = r6
        L5:
            int r2 = r0.get(r6)
            r3 = 0
            switch(r2) {
                case 0: goto L1b;
                case 1: goto Ld;
                case 2: goto L1a;
                case 3: goto L16;
                default: goto Ld;
            }
        Ld:
            r6.invalidState(r2)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L16:
            java.lang.Thread.interrupted()
            return
        L1a:
            goto L2e
        L1b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = get_state$volatile$FU()
            r5 = 1
            boolean r4 = r4.compareAndSet(r6, r2, r5)
            if (r4 == 0) goto L2e
            kotlinx.coroutines.DisposableHandle r4 = r6.cancelHandle
            if (r4 == 0) goto L2d
            r4.dispose()
        L2d:
            return
        L2e:
            goto L5
    }

    @Override // kotlinx.coroutines.InternalCompletionHandler
    public void invoke(java.lang.Throwable r7) {
            r6 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_state$volatile$FU()
            r1 = r6
        L5:
            int r2 = r0.get(r6)
            r3 = 0
            switch(r2) {
                case 0: goto L17;
                case 1: goto L16;
                case 2: goto L16;
                case 3: goto L16;
                default: goto Ld;
            }
        Ld:
            r6.invalidState(r2)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L16:
            return
        L17:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = get_state$volatile$FU()
            r5 = 2
            boolean r4 = r4.compareAndSet(r6, r2, r5)
            if (r4 == 0) goto L30
            java.lang.Thread r4 = r6.targetThread
            r4.interrupt()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = get_state$volatile$FU()
            r5 = 3
            r4.set(r6, r5)
            return
        L30:
            goto L5
    }

    public final void setup() {
            r6 = this;
            kotlinx.coroutines.Job r0 = r6.job
            r1 = 1
            r2 = r6
            kotlinx.coroutines.InternalCompletionHandler r2 = (kotlinx.coroutines.InternalCompletionHandler) r2
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.JobKt.invokeOnCompletion(r0, r1, r1, r2)
            r6.cancelHandle = r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_state$volatile$FU()
            r1 = r6
        L11:
            int r2 = r0.get(r6)
            r3 = 0
            switch(r2) {
                case 0: goto L23;
                case 1: goto L19;
                case 2: goto L22;
                case 3: goto L22;
                default: goto L19;
            }
        L19:
            r6.invalidState(r2)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L22:
            return
        L23:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = get_state$volatile$FU()
            r5 = 0
            boolean r4 = r4.compareAndSet(r6, r2, r5)
            if (r4 == 0) goto L2f
            return
        L2f:
            goto L11
    }
}
