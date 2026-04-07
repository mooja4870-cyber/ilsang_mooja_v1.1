package kotlinx.coroutines;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\u0005J\b\u0010\f\u001a\u00020\rH\u0016R\t\u0010\u0007\u001a\u00020\bX\u0082\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/CompletedExceptionally;", "", "cause", "", "handled", "", "(Ljava/lang/Throwable;Z)V", "_handled", "Lkotlinx/atomicfu/AtomicBoolean;", "getHandled", "()Z", "makeHandled", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class CompletedExceptionally {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _handled$volatile$FU = null;
    private volatile /* synthetic */ int _handled$volatile;
    public final java.lang.Throwable cause;

    static {
            java.lang.Class<kotlinx.coroutines.CompletedExceptionally> r0 = kotlinx.coroutines.CompletedExceptionally.class
            java.lang.String r1 = "_handled$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.CompletedExceptionally._handled$volatile$FU = r0
            return
    }

    public CompletedExceptionally(java.lang.Throwable r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.cause = r1
            r0._handled$volatile = r2
            return
    }

    public /* synthetic */ CompletedExceptionally(java.lang.Throwable r1, boolean r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    private final /* synthetic */ int get_handled$volatile() {
            r1 = this;
            int r0 = r1._handled$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater get_handled$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.CompletedExceptionally._handled$volatile$FU
            return r0
    }

    private final /* synthetic */ void set_handled$volatile(int r1) {
            r0 = this;
            r0._handled$volatile = r1
            return
    }

    public final boolean getHandled() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_handled$volatile$FU()
            int r0 = r0.get(r1)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public final boolean makeHandled() {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_handled$volatile$FU()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Throwable r1 = r2.cause
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
