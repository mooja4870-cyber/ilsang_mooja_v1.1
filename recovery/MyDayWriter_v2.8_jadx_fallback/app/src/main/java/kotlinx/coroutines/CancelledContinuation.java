package kotlinx.coroutines;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\u0007R\t\u0010\t\u001a\u00020\nX\u0082\u0004¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/CancelledContinuation;", "Lkotlinx/coroutines/CompletedExceptionally;", "continuation", "Lkotlin/coroutines/Continuation;", "cause", "", "handled", "", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;Z)V", "_resumed", "Lkotlinx/atomicfu/AtomicBoolean;", "makeResumed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CancelledContinuation extends kotlinx.coroutines.CompletedExceptionally {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _resumed$volatile$FU = null;
    private volatile /* synthetic */ int _resumed$volatile;

    static {
            java.lang.Class<kotlinx.coroutines.CancelledContinuation> r0 = kotlinx.coroutines.CancelledContinuation.class
            java.lang.String r1 = "_resumed$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.CancelledContinuation._resumed$volatile$FU = r0
            return
    }

    public CancelledContinuation(kotlin.coroutines.Continuation<?> r4, java.lang.Throwable r5, boolean r6) {
            r3 = this;
            if (r5 != 0) goto L23
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Continuation "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " was cancelled normally"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto L24
        L23:
            r0 = r5
        L24:
            r3.<init>(r0, r6)
            r0 = 0
            r3._resumed$volatile = r0
            return
    }

    private final /* synthetic */ int get_resumed$volatile() {
            r1 = this;
            int r0 = r1._resumed$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater get_resumed$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.CancelledContinuation._resumed$volatile$FU
            return r0
    }

    private final /* synthetic */ void set_resumed$volatile(int r1) {
            r0 = this;
            r0._resumed$volatile = r1
            return
    }

    public final boolean makeResumed() {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_resumed$volatile$FU()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            return r0
    }
}
